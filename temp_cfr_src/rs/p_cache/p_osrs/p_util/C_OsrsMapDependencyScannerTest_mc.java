/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_osrs.p_util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;
import rs.p_cache.C_a;
import rs.p_cache.p_osrs.p_util.C_OsrsMapDependencyScanner_mc;
import rs.p_d.C_r;
import rs.p_t.p_a.C_f;

public final class C_OsrsMapDependencyScannerTest_mc {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void main(String[] stringArray) {
        Object object3;
        Object object2;
        Object object;
        ArrayList arrayList = new ArrayList();
        byte[] byArray = new byte[]{-1, -1, 3, 1, 42, 0, 0};
        C_OsrsMapDependencyScanner_mc.a(byArray, (int n, int n2, int n3, int n4) -> arrayList.add(n + ":" + n2 + ":" + n3 + ":" + n4));
        C_OsrsMapDependencyScannerTest_mc.a(arrayList.equals(Collections.singletonList("32769:0:10:2")), "extended object-ID smart");
        C_OsrsMapDependencyScannerTest_mc.a(new byte[]{1, 1}, "truncated spawn");
        C_OsrsMapDependencyScannerTest_mc.a(new byte[]{0, 1}, "trailing landscape bytes");
        C_OsrsMapDependencyScannerTest_mc.a(new byte[]{1, -64, 1, 0, 0, 0}, "out-of-range plane");
        C_OsrsMapDependencyScannerTest_mc.a(C_OsrsMapDependencyScanner_mc.a(new byte[]{0, 0, 0, 0, 1, 0, 0, 0}, true).equals(Collections.singleton(0)), "packed frame enumeration");
        Path path = Files.createTempDirectory("osrs-map-audit-test-", new FileAttribute[0]);
        try {
            object = new byte[]{5, 1, 0, 42, 24, 0, 2, 77, -1, -1, -1, -1, 0, 0, 1, 0};
            object2 = new byte[]{5, 1, 0, 43, 24, 0, 3, 77, -1, -1, -1, -1, 0, 0, 0, 0};
            object3 = new ByteArrayOutputStream();
            ((OutputStream)object3).write(new byte[]{0, 2});
            ((OutputStream)object3).write((byte[])object);
            ((OutputStream)object3).write((byte[])object2);
            C_r.a(C_r.a.d, ((ByteArrayOutputStream)object3).toByteArray(), new byte[]{0, 2, 0, (byte)((byte[])object).length, 0, (byte)((byte[])object2).length});
            C_r.z = new C_f();
            rs.p_d.C_a.a = new rs.p_d.C_a[4];
            rs.p_d.C_a c_a = rs.p_d.C_a.a[2] = new rs.p_d.C_a();
            c_a.w = true;
            c_a.d = 1;
            c_a.e = new int[]{458752};
            c_a.g = new int[]{1};
            C_OsrsMapDependencyScannerTest_mc.a(path, "main_file_cache");
            C_OsrsMapDependencyScannerTest_mc.a(path, "main_file_osrs");
            C_OsrsMapDependencyScannerTest_mc.a(path, 4, 5, new byte[]{1, 1, 40, 2, 40, 0, 0});
            C_OsrsMapDependencyScannerTest_mc.a(path, 1, 42, new byte[]{1});
            C_OsrsMapDependencyScannerTest_mc.a(path, 2, 7, new byte[]{0, 0, 0, 0, 1, 0, 1, 0});
            TreeMap<Integer, Map<String, Object>> treeMap = new TreeMap<Integer, Map<String, Object>>();
            treeMap.put(2000, C_OsrsMapDependencyScannerTest_mc.a("osrs", 12850, 5));
            treeMap.put(2001, C_OsrsMapDependencyScannerTest_mc.a("osrs", 12851, -1));
            treeMap.put(2002, C_OsrsMapDependencyScannerTest_mc.a("standard", 12852, 999));
            String string = C_OsrsMapDependencyScannerTest_mc.a(path, treeMap);
            C_OsrsMapDependencyScannerTest_mc.a(string.contains("2 regions, 2 spawns, 1 distinct spawned objects"), "OSRS filtering/counts");
            C_OsrsMapDependencyScannerTest_mc.a(string.contains("0 incomplete checks"), "land -1 is empty");
            C_OsrsMapDependencyScannerTest_mc.a(string.contains("osrs.idx1:43 MISSING_OR_UNREADABLE"), "missing morph model");
            C_OsrsMapDependencyScannerTest_mc.a(!string.contains("osrs.idx1:42"), "present packed model");
            C_OsrsMapDependencyScannerTest_mc.a(string.contains("osrs.idx2:7/0 MISSING_FRAME animation=2"), "missing individual frame");
            C_OsrsMapDependencyScannerTest_mc.a(string.contains("animation:3 MISSING_SEQUENCE"), "missing sequence");
            C_OsrsMapDependencyScannerTest_mc.a(string.contains("object=0 dependencyObject=1"), "morph provenance");
            C_OsrsMapDependencyScannerTest_mc.a(string.indexOf("region=12850 yaml=2000 land=5 group= object=0 dependencyObject=1 osrs.idx1:43") == string.lastIndexOf("region=12850 yaml=2000 land=5 group= object=0 dependencyObject=1 osrs.idx1:43"), "deduplication");
            treeMap.put(2003, C_OsrsMapDependencyScannerTest_mc.a("osrs", 12853, 999));
            C_OsrsMapDependencyScannerTest_mc.a(C_OsrsMapDependencyScannerTest_mc.a(path, treeMap).contains("INCOMPLETE region=12853"), "missing map is incomplete");
            Files.createDirectory(path.resolve("osrs_idx1"), new FileAttribute[0]);
            Files.write(path.resolve("osrs_idx1/43.gz"), new byte[]{1}, new OpenOption[0]);
            C_OsrsMapDependencyScannerTest_mc.a(C_OsrsMapDependencyScannerTest_mc.a(path, treeMap).contains("osrs.idx1:43 MISSING_OR_UNREADABLE"), "loose files excluded");
            c_a.e = new int[]{524288};
            C_OsrsMapDependencyScannerTest_mc.a(C_OsrsMapDependencyScannerTest_mc.a(path, treeMap).contains("osrs.idx2:8 MISSING_OR_UNREADABLE"), "missing frame archive");
            c_a.B = 589824;
            C_OsrsMapDependencyScannerTest_mc.a(C_OsrsMapDependencyScannerTest_mc.a(path, treeMap).contains("osrs.idx2:9 MISSING_OR_UNREADABLE keyframes animation=2"), "missing skeletal archive");
        }
        catch (Throwable throwable) {
            try (Stream<Path> stream = Files.walk(path, new FileVisitOption[0]);){
                for (Path path2 : stream.sorted(Comparator.reverseOrder())::iterator) {
                    Files.delete(path2);
                }
                throw throwable;
            }
        }
        object = Files.walk(path, new FileVisitOption[0]);
        try {
            object2 = ((Iterable)object.sorted(Comparator.reverseOrder())::iterator).iterator();
            while (object2.hasNext()) {
                object3 = (Path)object2.next();
                Files.delete((Path)object3);
            }
        }
        finally {
            if (object != null) {
                object.close();
            }
        }
        System.out.println("OSRS map dependency regression tests passed");
    }

    private static String a(Path path, Map<Integer, Map<String, Object>> map) {
        try (C_OsrsMapDependencyScanner_mc.c c2 = new C_OsrsMapDependencyScanner_mc.c(path, "main_file_cache");){
            C_OsrsMapDependencyScanner_mc.c c3 = new C_OsrsMapDependencyScanner_mc.c(path, "main_file_osrs");
            try {
                C_OsrsMapDependencyScanner_mc c_OsrsMapDependencyScanner_mc = new C_OsrsMapDependencyScanner_mc(path, c2, c3);
                c_OsrsMapDependencyScanner_mc.a(map);
                String string = c_OsrsMapDependencyScanner_mc.a(path.resolve("maps.yaml"));
                c3.close();
                return string;
            }
            catch (Throwable throwable) {
                try {
                    c3.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
        }
    }

    private static Map<String, Object> a(String string, int n, int n2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("type", string);
        hashMap.put("id", n);
        hashMap.put("land", n2);
        return hashMap;
    }

    private static void a(byte[] byArray, String string) {
        try {
            C_OsrsMapDependencyScanner_mc.a(byArray, (int n, int n2, int n3, int n4) -> {});
            throw new AssertionError((Object)string);
        }
        catch (IOException iOException) {
            return;
        }
    }

    private static void a(Path path, String string) {
        Files.write(path.resolve(string + ".dat"), new byte[520], new OpenOption[0]);
        for (int i = 0; i < 5; ++i) {
            Files.createFile(path.resolve(string + ".idx" + i), new FileAttribute[0]);
        }
    }

    private static void a(Path path, int n, int n2, byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (Closeable closeable = new GZIPOutputStream(byteArrayOutputStream);){
            ((FilterOutputStream)closeable).write(byArray);
        }
        closeable = new RandomAccessFile(path.resolve("main_file_osrs.dat").toFile(), "rw");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(path.resolve("main_file_osrs.idx" + n).toFile(), "rw");){
            C_OsrsMapDependencyScannerTest_mc.a(new C_a((RandomAccessFile)closeable, randomAccessFile, n + 1).a(byteArrayOutputStream.size(), byteArrayOutputStream.toByteArray(), n2), "write fixture");
        }
        finally {
            ((RandomAccessFile)closeable).close();
        }
    }

    private static void a(boolean bl, String string) {
        if (!bl) {
            throw new AssertionError((Object)string);
        }
    }
}

