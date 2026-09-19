package tools;

import java.io.*;
import java.nio.file.*;
import java.security.MessageDigest;
import java.util.*;
import java.util.zip.*;

public class UpdateWorkflow {
    public static void main(String[] args) throws Exception {
        File targetJar = new File(args.length > 0 ? args[0] : "C:\\Users\\naxos\\.spawnpk-data\\client.jar");
        File previousHashesFile = new File("tools/client-hashes.txt");
        File reportFile = new File("client-update-report.txt");

        if (!targetJar.exists()) {
            System.err.println("Target client.jar does not exist: " + targetJar.getAbsolutePath());
            return;
        }

        System.out.println("Processing client update from: " + targetJar.getAbsolutePath());

        // Step 1: Run ClientExtractor to update resources and libs
        ClientExtractor.main(new String[]{targetJar.getAbsolutePath()});

        // Step 2: Compute SHA-256 hash of all entries in new client.jar
        Map<String, String> currentHashes = computeJarHashes(targetJar);
        Map<String, String> previousHashes = loadPreviousHashes(previousHashesFile);

        List<String> added = new ArrayList<>();
        List<String> modified = new ArrayList<>();
        List<String> removed = new ArrayList<>();

        for (Map.Entry<String, String> entry : currentHashes.entrySet()) {
            String path = entry.getKey();
            String hash = entry.getValue();
            if (!previousHashes.containsKey(path)) {
                added.add(path);
            } else if (!previousHashes.get(path).equals(hash)) {
                modified.add(path);
            }
        }

        for (String oldPath : previousHashes.keySet()) {
            if (!currentHashes.containsKey(oldPath)) {
                removed.add(oldPath);
            }
        }

        // Step 3: Write update report
        try (PrintWriter writer = new PrintWriter(new FileWriter(reportFile))) {
            writer.println("=== SpawnPK Client Update Diff Report ===");
            writer.println("Date: " + new Date());
            writer.println("Target JAR: " + targetJar.getAbsolutePath());
            writer.println("Total Files in JAR: " + currentHashes.size());
            writer.println("Added Files: " + added.size());
            writer.println("Modified Files: " + modified.size());
            writer.println("Removed Files: " + removed.size());
            writer.println();

            if (!added.isEmpty()) {
                writer.println("--- Added Files ---");
                for (String a : added) writer.println("  + " + a);
                writer.println();
            }

            if (!modified.isEmpty()) {
                writer.println("--- Modified Classes & Resources ---");
                for (String m : modified) writer.println("  * " + m);
                writer.println();
            }

            if (!removed.isEmpty()) {
                writer.println("--- Removed Files ---");
                for (String r : removed) writer.println("  - " + r);
                writer.println();
            }
        }

        // Save current hashes for future update comparison
        saveHashes(previousHashesFile, currentHashes);

        System.out.println("\nClient update processing complete!");
        System.out.println("  - Added: " + added.size());
        System.out.println("  - Modified: " + modified.size());
        System.out.println("  - Removed: " + removed.size());
        System.out.println("Update diff report saved to: " + reportFile.getAbsolutePath());
    }

    private static Map<String, String> computeJarHashes(File jarFile) throws Exception {
        Map<String, String> hashes = new TreeMap<>();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] buffer = new byte[8192];

        try (ZipFile zip = new ZipFile(jarFile)) {
            Enumeration<? extends ZipEntry> entries = zip.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                if (entry.isDirectory()) continue;

                md.reset();
                try (InputStream is = zip.getInputStream(entry)) {
                    int len;
                    while ((len = is.read(buffer)) > 0) {
                        md.update(buffer, 0, len);
                    }
                }
                byte[] digest = md.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format("%02x", b));
                }
                hashes.put(entry.getName(), sb.toString());
            }
        }
        return hashes;
    }

    private static Map<String, String> loadPreviousHashes(File file) {
        Map<String, String> map = new TreeMap<>();
        if (!file.exists()) return map;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    map.put(parts[0], parts[1]);
                }
            }
        } catch (Exception ignored) {}
        return map;
    }

    private static void saveHashes(File file, Map<String, String> hashes) throws Exception {
        file.getParentFile().mkdirs();
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (Map.Entry<String, String> entry : hashes.entrySet()) {
                writer.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}
