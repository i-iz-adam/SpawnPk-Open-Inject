/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.yaml.snakeyaml.LoaderOptions
 *  org.yaml.snakeyaml.Yaml
 *  org.yaml.snakeyaml.constructor.BaseConstructor
 *  org.yaml.snakeyaml.constructor.SafeConstructor
 */
package rs.p_cache.p_osrs.p_util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.zip.GZIPInputStream;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import org.yaml.snakeyaml.constructor.SafeConstructor;
import rs.C_K_uc;
import rs.C_k;
import rs.p_cache.C_a;
import rs.p_cache.p_osrs.p_util.C_b;
import rs.p_d.C_r;
import rs.p_x.C_e;
import rs.p_x.C_f;

public final class C_OsrsMapDependencyScanner_mc {
    private final Path a;
    private final c b;
    private final c c;
    private final Map<String, String> d = new HashMap<String, String>();
    private final Map<Integer, List<a>> e = new HashMap<Integer, List<a>>();
    private final Map<String, Set<Integer>> f = new HashMap<String, Set<Integer>>();
    private final Set<String> g = new TreeSet<String>();
    private final Set<Integer> h = new TreeSet<Integer>();
    private final List<String> i = new ArrayList<String>();
    private int j;
    private int k;
    private int l;
    private int m;

    C_OsrsMapDependencyScanner_mc(Path path, c c2, c c3) {
        this.a = path;
        this.b = c2;
        this.c = c3;
    }

    public static void main(String[] stringArray) {
        if (stringArray.length > 3 || stringArray.length > 0 && stringArray[0].equals("--help")) {
            System.out.println("Usage: OsrsMapDependencyScanner [cache-directory] [maps.yaml] [report.txt]");
            System.out.println("Exit: 0 clean, 1 dependency findings, 2 incomplete scan/setup error.");
            return;
        }
        try {
            int n;
            Path path = Paths.get(stringArray.length > 0 ? stringArray[0] : (Files.isDirectory(Paths.get("client/cache", new String[0]), new LinkOption[0]) ? "client/cache" : "cache"), new String[0]).toAbsolutePath().normalize();
            Path path2 = stringArray.length > 1 ? Paths.get(stringArray[1], new String[0]) : path.resolve("configs/maps.yaml");
            Path path3 = (stringArray.length > 2 ? Paths.get(stringArray[2], new String[0]) : path.getParent().resolve("dumps/osrs-map-dependencies.txt")).toAbsolutePath().normalize();
            if (path3.startsWith(path) || path3.equals(path2.toAbsolutePath().normalize())) {
                throw new IllegalArgumentException("Report must be outside the cache and must not overwrite maps.yaml");
            }
            try (c c2 = new c(path, "main_file_cache");
                 c c3 = new c(path, "main_file_osrs");){
                C_OsrsMapDependencyScanner_mc c_OsrsMapDependencyScanner_mc = new C_OsrsMapDependencyScanner_mc(path, c2, c3);
                c_OsrsMapDependencyScanner_mc.a();
                c_OsrsMapDependencyScanner_mc.a(C_OsrsMapDependencyScanner_mc.c(path2));
                String string = c_OsrsMapDependencyScanner_mc.a(path2);
                Files.createDirectories(path3.getParent(), new FileAttribute[0]);
                Files.write(path3, string.getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
                System.out.println(string.substring(0, string.indexOf("\n\n")));
                System.out.println("Report: " + String.valueOf(path3));
                n = c_OsrsMapDependencyScanner_mc.l > 0 ? 2 : (c_OsrsMapDependencyScanner_mc.i.isEmpty() ? 0 : 1);
            }
            System.exit(n);
        }
        catch (Exception exception) {
            System.err.println("Scan failed: " + String.valueOf(exception));
            exception.printStackTrace();
            System.exit(2);
        }
    }

    private void a() {
        Path path = this.a.resolve("configs/old_a.dat");
        if (!Files.isReadable(path)) {
            throw new IOException("Missing " + String.valueOf(path));
        }
        rs.p_cache.p_osrs.p_util.C_a c_a = new rs.p_cache.p_osrs.p_util.C_a(this);
        byte[] byArray = this.b.a(0, 2, false);
        if (byArray == null) {
            throw new IOException("Missing config archive main_file_cache.idx0:2");
        }
        rs.p_d.C_a.a(new C_f(byArray, "config"), path.toFile(), c_a);
        byte[] byArray2 = Files.readAllBytes(this.a.resolve("osrs_config/loc.dat"));
        byte[] byArray3 = Files.readAllBytes(this.a.resolve("osrs_config/loc.idx"));
        byte[] byArray4 = Files.readAllBytes(this.a.resolve("loc.dat"));
        byte[] byArray5 = Files.readAllBytes(this.a.resolve("loc.idx"));
        C_r.z = new C_b(this, byArray2, byArray4, byArray3, byArray5);
        C_r.z.a();
        C_r.a(C_r.a.d, byArray2, byArray3);
    }

    void a(Map<Integer, Map<String, Object>> map) {
        for (Map.Entry<Integer, Map<String, Object>> entry : map.entrySet()) {
            Map<String, Object> map2 = entry.getValue();
            if (!"osrs".equalsIgnoreCase(String.valueOf(map2.get("type")))) continue;
            ++this.j;
            int n = -1;
            try {
                n = C_OsrsMapDependencyScanner_mc.a(map2, "id");
                int n2 = C_OsrsMapDependencyScanner_mc.a(map2, "land");
                if (n2 == -1) {
                    ++this.m;
                    continue;
                }
                byte[] byArray = this.c.a(4, n2, true);
                if (byArray == null) {
                    throw new IOException("Missing/unreadable packed landscape osrs.idx4:" + n2);
                }
                int n7 = n;
                HashSet hashSet = new HashSet();
                C_OsrsMapDependencyScanner_mc.a(byArray, (int n3, int n4, int n5, int n6) -> {
                    ++this.k;
                    for (a a2 : this.a(n3)) {
                        this.g.add(a2.b);
                        this.h.add(n7);
                        String string = "object=" + n3 + " dependencyObject=" + a2.a + " " + a2.b + " " + a2.c;
                        if (!hashSet.add(string)) continue;
                        int n7 = (n7 >> 8) * 64 + (n4 >> 6 & 0x3F);
                        int n8 = (n7 & 0xFF) * 64 + (n4 & 0x3F);
                        this.i.add("region=" + n7 + " yaml=" + String.valueOf(entry.getKey()) + " land=" + n2 + " group=" + String.valueOf(map2.getOrDefault("group", "")) + " " + string + " example=" + n7 + "," + n8 + "," + (n4 >> 12) + " type=" + n5 + " rotation=" + n6);
                    }
                });
            }
            catch (Exception exception) {
                ++this.l;
                this.i.add("INCOMPLETE region=" + n + " yaml=" + String.valueOf(entry.getKey()) + " " + String.valueOf(exception));
            }
        }
        if (this.j == 0) {
            ++this.l;
            this.i.add("INCOMPLETE: No entries with type: osrs were found.");
        }
    }

    private List<a> a(int n) {
        if (this.e.containsKey(n)) {
            return this.e.get(n);
        }
        ArrayList<a> arrayList = new ArrayList<a>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        arrayDeque.add(n);
        while (!arrayDeque.isEmpty()) {
            int n2 = (Integer)arrayDeque.removeFirst();
            if (n2 == -1 || !hashSet.add(n2)) continue;
            try {
                if (n2 < 0 || n2 >= C_r.A && !C_r.z.b(n2)) {
                    arrayList.add(new a(n2, "object:" + n2, "MISSING_DEFINITION"));
                    continue;
                }
                C_r c_r = C_r.c(n2);
                if (c_r.an != null) {
                    for (int n3 : c_r.an) {
                        this.a(arrayList, n2, c_r.e(), 1, n3 & 0xFFFF, "model");
                    }
                }
                if (c_r.au != -1) {
                    this.a(arrayList, n2, c_r.au);
                }
                if (c_r.ad == null) continue;
                for (int n3 : c_r.ad) {
                    if (n3 == -1) continue;
                    arrayDeque.add(n3);
                }
            }
            catch (Exception exception) {
                ++this.l;
                arrayList.add(new a(n2, "object:" + n2, "DECODE_ERROR " + String.valueOf(exception)));
            }
        }
        this.e.put(n, arrayList);
        return arrayList;
    }

    private void a(List<a> list, int n, int n3) {
        String string = "animation:" + n3;
        if (n3 < 0 || n3 >= rs.p_d.C_a.a.length || rs.p_d.C_a.a[n3] == null) {
            list.add(new a(n, string, "MISSING_SEQUENCE"));
            return;
        }
        rs.p_d.C_a c_a = rs.p_d.C_a.a[n3];
        if (c_a.b()) {
            int n4 = c_a.B >>> 16;
            if (n4 >= 5000) {
                list.add(new a(n, string, "KEYFRAME_FILE_OUT_OF_CLIENT_BOUNDS " + n4));
            }
            this.a(list, n, true, 2, n4, "keyframes animation=" + n3);
            if (this.a(true, 2, n4) == null) {
                try {
                    byte[] byArray = this.c.a(2, n4, true);
                    if (byArray.length < 6 || ((byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF) != 420) {
                        list.add(new a(n, "osrs.idx2:" + n4, "EXPECTED_SKELETAL_KEYFRAMES animation=" + n3));
                    }
                }
                catch (IOException iOException) {
                    throw new UncheckedIOException(iOException);
                }
            }
            return;
        }
        if (c_a.e == null || c_a.d <= 0 || c_a.e.length < c_a.d || c_a.g == null || c_a.g.length < c_a.d) {
            list.add(new a(n, string, "INVALID_SEQUENCE"));
            return;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        HashSet<Object> hashSet = new HashSet<Object>();
        for (int i = 0; i < c_a.d; ++i) {
            if (c_a.e[i] == -1) continue;
            linkedHashSet.add(c_a.e[i]);
        }
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            Object object;
            int n5 = (Integer)iterator.next();
            int n6 = n5 >>> 16;
            Path path = null;
            if (!c_a.w) {
                if (Arrays.stream(C_k.c).anyMatch(n2 -> n2 == n3)) {
                    path = this.a.resolve("old_osrs_anims/" + n6 + ".dat");
                }
                if (path == null && Arrays.stream(new int[]{3502, 3353, 382, 55780, 13, 57784, 182}).anyMatch(n2 -> n2 == n6)) {
                    path = this.a.resolve("misc/" + n6 + ".dat");
                }
            }
            if (path != null) {
                object = this.a.relativize(path).toString();
                try {
                    if (!this.f.containsKey(object)) {
                        this.f.put((String)object, C_OsrsMapDependencyScanner_mc.a(Files.readAllBytes(path), false));
                    }
                    if (this.f.get(object).contains(n5 & 0xFFF)) continue;
                    list.add(new a(n, (String)object + "/" + (n5 & 0xFFF), "MISSING_FRAME animation=" + n3));
                }
                catch (Exception exception) {
                    if (!hashSet.add(object)) continue;
                    list.add(new a(n, (String)object, "MISSING_OR_INVALID_LEGACY_FRAMES animation=" + n3 + " " + String.valueOf(exception)));
                }
                continue;
            }
            if (n6 >= (c_a.w ? 15000 : 4000)) {
                if (!hashSet.add("bounds:" + n6)) continue;
                list.add(new a(n, string, "FRAME_FILE_OUT_OF_CLIENT_BOUNDS " + n6));
                continue;
            }
            object = (c_a.w ? "osrs" : "main") + ".idx2:" + n6;
            String string2 = this.a(c_a.w, 2, n6);
            if (string2 != null) {
                if (!hashSet.add(object)) continue;
                list.add(new a(n, (String)object, string2 + " animation=" + n3));
                continue;
            }
            try {
                if (!this.f.containsKey(object)) {
                    this.f.put((String)object, C_OsrsMapDependencyScanner_mc.a((c_a.w ? this.c : this.b).a(2, n6, true), c_a.w));
                }
                if (this.f.get(object).contains(n5 & 0xFFF)) continue;
                list.add(new a(n, (String)object + "/" + (n5 & 0xFFF), "MISSING_FRAME animation=" + n3));
            }
            catch (Exception exception) {
                String string3 = "FRAME_DECODE_ERROR " + String.valueOf(exception);
                this.d.put((String)object, string3);
                if (!hashSet.add(object)) continue;
                list.add(new a(n, (String)object, string3 + " animation=" + n3));
            }
        }
    }

    private void a(List<a> list, int n, boolean bl, int n2, int n3, String string) {
        String string2 = this.a(bl, n2, n3);
        if (string2 != null) {
            list.add(new a(n, (bl ? "osrs" : "main") + ".idx" + n2 + ":" + n3, string2 + " " + string));
        }
    }

    private String a(boolean bl, int n, int n2) {
        String string = (bl ? "osrs" : "main") + ".idx" + n + ":" + n2;
        if (!this.d.containsKey(string)) {
            Object object = null;
            try {
                byte[] byArray = (bl ? this.c : this.b).a(n, n2, true);
                if (byArray == null || byArray.length == 0) {
                    object = "MISSING_OR_UNREADABLE";
                }
            }
            catch (IOException iOException) {
                object = "INVALID_GZIP " + iOException.getMessage();
            }
            this.d.put(string, (String)object);
        }
        return this.d.get(string);
    }

    String a(Path path) {
        return "OSRS map dependency scan: " + this.j + " regions, " + this.k + " spawns, " + this.e.size() + " distinct spawned objects\n" + this.h.size() + " affected regions, " + this.g.size() + " distinct problem assets, " + this.l + " incomplete checks\n\nCache: " + String.valueOf(this.a) + "\nMaps: " + String.valueOf(path.toAbsolutePath()) + "\nRegions with land: -1 (no object spawns): " + this.m + "\nChecks all models and morph alternatives, regardless of current varbits/spawn shape.\nUses client object/animation overrides and configs/*.yaml, not serialized production configs.\nAsset IDs: idx1=models; idx2=frame/keyframe files; animation=N is a sequence ID.\nLoose packing directories do not count as packed assets. Model geometry and skeletal content are not decoded.\n\nProblem assets:\n" + String.join((CharSequence)"\n", this.g) + "\n\nFindings (one example spawn per region/root object/dependency):\n" + (this.i.isEmpty() ? "No missing dependencies found." : String.join((CharSequence)"\n", this.i)) + "\n";
    }

    static Set<Integer> a(byte[] byArray, boolean bl) {
        if (byArray.length >= 2 && ((byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF) == 420) {
            throw new IOException("Sequence expects classic frames but file contains skeletal keyframes (magic 420)");
        }
        C_e c_e = new C_e(byArray);
        new C_K_uc(c_e, bl);
        if (bl) {
            c_e.A();
        }
        int n = c_e.A();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < n; ++i) {
            int n2 = c_e.A();
            if (n2 >= n * 3) {
                throw new IOException("Frame index exceeds client allocation: " + n2);
            }
            hashSet.add(n2);
            int n3 = c_e.y();
            for (int j = 0; j < n3; ++j) {
                int n4 = c_e.y();
                for (int k = 1; k <= 4; k <<= 1) {
                    if ((n4 & k) == 0) continue;
                    c_e.x();
                }
            }
        }
        if (c_e.h != byArray.length) {
            throw new IOException("Frame data length mismatch");
        }
        return hashSet;
    }

    static void a(byte[] byArray, b b2) {
        C_e c_e = new C_e(byArray);
        int n = -1;
        try {
            int n2;
            while ((n2 = c_e.d()) != 0) {
                int n3;
                n = Math.addExact(n, n2);
                int n4 = 0;
                while ((n3 = c_e.e()) != 0) {
                    if ((n4 = Math.addExact(n4, n3 - 1)) >= 16384) {
                        throw new IOException("Landscape location out of bounds");
                    }
                    int n5 = c_e.y();
                    b2.accept(n, n4, n5 >> 2, n5 & 3);
                }
            }
            if (c_e.h != byArray.length) {
                throw new IOException("Trailing landscape bytes");
            }
        }
        catch (ArithmeticException | IndexOutOfBoundsException runtimeException) {
            throw new IOException("Truncated/invalid landscape at byte " + c_e.h, runtimeException);
        }
    }

    private static int a(Map<String, Object> map, String string) {
        Object object = map.get(string);
        if (!(object instanceof Number)) {
            throw new IllegalArgumentException("Missing/non-numeric " + string);
        }
        return ((Number)object).intValue();
    }

    private static Map<Integer, Map<String, Object>> c(Path path) {
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setMaxAliasesForCollections(200);
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
            Map map = (Map)new Yaml((BaseConstructor)new SafeConstructor(loaderOptions)).load(inputStream);
            if (map == null) {
                throw new IOException("Empty YAML: " + String.valueOf(path));
            }
            TreeMap<Integer, Map<String, Object>> treeMap = new TreeMap<Integer, Map<String, Object>>(map);
            return treeMap;
        }
    }

    static /* synthetic */ Path a(C_OsrsMapDependencyScanner_mc c_OsrsMapDependencyScanner_mc) {
        return c_OsrsMapDependencyScanner_mc.a;
    }

    static /* synthetic */ Map b(Path path) {
        return C_OsrsMapDependencyScanner_mc.c(path);
    }

    static final class c
    implements AutoCloseable {
        private final RandomAccessFile a;
        private final Path b;
        private final String c;
        private final Map<Integer, RandomAccessFile> d = new HashMap<Integer, RandomAccessFile>();

        c(Path path, String string) {
            this.b = path;
            this.c = string;
            this.a = new RandomAccessFile(path.resolve(string + ".dat").toFile(), "r");
        }

        byte[] a(int n, int n2, boolean bl) {
            if (n2 < 0) {
                return null;
            }
            if (!this.d.containsKey(n)) {
                this.d.put(n, new RandomAccessFile(this.b.resolve(this.c + ".idx" + n).toFile(), "r"));
            }
            byte[] byArray = new C_a(this.a, this.d.get(n), n + 1).a(n2);
            if (!bl || byArray == null || byArray.length == 0) {
                return byArray;
            }
            try (GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(byArray));){
                byte[] byArray2 = gZIPInputStream.readAllBytes();
                return byArray2;
            }
        }

        @Override
        public void close() {
            try {
                for (RandomAccessFile randomAccessFile : this.d.values()) {
                    randomAccessFile.close();
                }
            }
            finally {
                this.a.close();
            }
        }
    }

    static interface b {
        public void accept(int var1, int var2, int var3, int var4);
    }

    private static final class a {
        final int a;
        final String b;
        final String c;

        a(int n, String string, String string2) {
            this.a = n;
            this.b = string;
            this.c = string2;
        }
    }
}

