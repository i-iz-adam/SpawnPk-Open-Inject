package tools;

import java.io.*;
import java.nio.file.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ClientExtractor {
    public static void main(String[] args) throws Exception {
        File clientJar = new File(args.length > 0 ? args[0] : "C:\\Users\\naxos\\.spawnpk-data\\client.jar");
        File resourcesDir = new File("src/main/resources");
        File libsDir = new File("libs");
        File obfDepsJar = new File(libsDir, "client-obfuscated-deps.jar");

        if (!clientJar.exists()) {
            System.err.println("Client jar not found at " + clientJar.getAbsolutePath());
            return;
        }

        libsDir.mkdirs();
        resourcesDir.mkdirs();

        int resourceCount = 0;
        int classCount = 0;

        try (ZipFile zip = new ZipFile(clientJar);
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(obfDepsJar))) {

            Enumeration<? extends ZipEntry> entries = zip.entries();
            byte[] buffer = new byte[8192];

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                String name = entry.getName();

                if (entry.isDirectory()) {
                    continue;
                }

                // If it's a class file
                if (name.endsWith(".class")) {
                    // Exclude all rs package classes
                    if (name.startsWith("rs/") || name.equals("rs.class")) {
                        continue;
                    }

                    ZipEntry newEntry = new ZipEntry(name);
                    zos.putNextEntry(newEntry);
                    try (InputStream is = zip.getInputStream(entry)) {
                        int len;
                        while ((len = is.read(buffer)) > 0) {
                            zos.write(buffer, 0, len);
                        }
                    }
                    zos.closeEntry();
                    classCount++;
                } else if (!name.startsWith("META-INF/")) {
                    String resPath = name;
                    if (resPath.startsWith("resources/")) {
                        resPath = resPath.substring("resources/".length());
                    }
                    File outFile = new File(resourcesDir, resPath);
                    outFile.getParentFile().mkdirs();
                    try (InputStream is = zip.getInputStream(entry);
                         OutputStream os = new FileOutputStream(outFile)) {
                        int len;
                        while ((len = is.read(buffer)) > 0) {
                            os.write(buffer, 0, len);
                        }
                    }
                    resourceCount++;
                }
            }
        }

        System.out.println("Extracted " + resourceCount + " resource files to " + resourcesDir.getPath());
        System.out.println("Packed " + classCount + " dependency class files into " + obfDepsJar.getPath());
    }
}
