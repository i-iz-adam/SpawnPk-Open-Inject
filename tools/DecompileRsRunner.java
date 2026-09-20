package tools;

import java.io.*;
import java.nio.file.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class DecompileRsRunner {
    public static void main(String[] args) throws Exception {
        File clientJar = new File("C:\\Users\\naxos\\.spawnpk-data\\client.jar");
        File tempDir = new File("temp_rs_classes");
        File outputDir = new File("src/main/java");

        if (!clientJar.exists()) {
            System.err.println("Client jar not found at " + clientJar.getAbsolutePath());
            System.exit(1);
        }

        // Clean tempDir if exists
        if (tempDir.exists()) {
            deleteRecursively(tempDir);
        }
        tempDir.mkdirs();

        int extractedCount = 0;

        System.out.println("Extracting rs/** classes from " + clientJar.getAbsolutePath() + "...");
        try (ZipFile zip = new ZipFile(clientJar)) {
            Enumeration<? extends ZipEntry> entries = zip.entries();
            byte[] buffer = new byte[8192];

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                String name = entry.getName();

                if (name.startsWith("rs/") && name.endsWith(".class")) {
                    File outFile = new File(tempDir, name);
                    outFile.getParentFile().mkdirs();

                    try (InputStream is = zip.getInputStream(entry);
                         FileOutputStream fos = new FileOutputStream(outFile)) {
                        int len;
                        while ((len = is.read(buffer)) > 0) {
                            fos.write(buffer, 0, 0 + len);
                        }
                    }
                    extractedCount++;
                }
            }
        }

        System.out.println("Extracted " + extractedCount + " class files into " + tempDir.getAbsolutePath());

        // Now run Vineflower decompiler
        File vineflowerJar = new File("tools/vineflower-1.10.1.jar");
        if (!vineflowerJar.exists()) {
            System.err.println("Vineflower jar not found!");
            System.exit(1);
        }

        outputDir.mkdirs();
        System.out.println("Running Vineflower decompilation into " + outputDir.getAbsolutePath() + "...");

        ProcessBuilder pb = new ProcessBuilder(
            "C:\\Users\\naxos\\.jdks\\corretto-21.0.10\\bin\\java.exe",
            "-jar", vineflowerJar.getAbsolutePath(),
            "-dgs=1", // decompile generic signatures
            "-asc=1", // allow synthetic members
            "-log=WARN",
            tempDir.getAbsolutePath(),
            outputDir.getAbsolutePath()
        );
        pb.inheritIO();
        Process proc = pb.start();
        int exitCode = proc.waitFor();
        System.out.println("Vineflower finished with exit code: " + exitCode);

        // Count generated .java files in src/main/java/rs
        File rsSourceDir = new File(outputDir, "rs");
        int javaCount = countJavaFiles(rsSourceDir);
        System.out.println("Total decompiled .java files in rs/: " + javaCount);

        // Clean up temporary directory
        System.out.println("Cleaning up temporary directory...");
        deleteRecursively(tempDir);
        System.out.println("Done!");
    }

    private static void deleteRecursively(File file) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    deleteRecursively(child);
                }
            }
        }
        file.delete();
    }

    private static int countJavaFiles(File dir) {
        if (!dir.exists()) return 0;
        int count = 0;
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    count += countJavaFiles(f);
                } else if (f.getName().endsWith(".java")) {
                    count++;
                }
            }
        }
        return count;
    }
}
