package rs.p_cache.p_osrs.p_util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;
import rs.p_d.C_r;
import rs.p_t.p_a.C_f;

public final class C_OsrsMapDependencyScannerTest_mc {
   public static void main(String[] var0) {
      ArrayList var1 = new ArrayList();
      byte[] var2 = new byte[]{-1, -1, 3, 1, 42, 0, 0};
      C_OsrsMapDependencyScanner_mc.a(var2, (var1x, var2x, var3x, var4x) -> var1.add(var1x + ":" + var2x + ":" + var3x + ":" + var4x));
      a(var1.equals(Collections.singletonList("32769:0:10:2")), "extended object-ID smart");
      a(new byte[]{1, 1}, "truncated spawn");
      a(new byte[]{0, 1}, "trailing landscape bytes");
      a(new byte[]{1, -64, 1, 0, 0, 0}, "out-of-range plane");
      a(C_OsrsMapDependencyScanner_mc.a(new byte[]{0, 0, 0, 0, 1, 0, 0, 0}, true).equals(Collections.singleton(0)), "packed frame enumeration");
      Path var3 = Files.createTempDirectory("osrs-map-audit-test-");

      try {
         byte[] var4 = new byte[]{5, 1, 0, 42, 24, 0, 2, 77, -1, -1, -1, -1, 0, 0, 1, 0};
         byte[] var5 = new byte[]{5, 1, 0, 43, 24, 0, 3, 77, -1, -1, -1, -1, 0, 0, 0, 0};
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();
         var6.write(new byte[]{0, 2});
         var6.write(var4);
         var6.write(var5);
         C_r.a(C_r.a.d, var6.toByteArray(), new byte[]{0, 2, 0, (byte)var4.length, 0, (byte)var5.length});
         C_r.z = new C_f();
         rs.p_d.C_a.a = new rs.p_d.C_a[4];
         rs.p_d.C_a var7 = rs.p_d.C_a.a[2] = new rs.p_d.C_a();
         var7.w = true;
         var7.d = 1;
         var7.e = new int[]{458752};
         var7.g = new int[]{1};
         a(var3, "main_file_cache");
         a(var3, "main_file_osrs");
         a(var3, 4, 5, new byte[]{1, 1, 40, 2, 40, 0, 0});
         a(var3, 1, 42, new byte[]{1});
         a(var3, 2, 7, new byte[]{0, 0, 0, 0, 1, 0, 1, 0});
         TreeMap var8 = new TreeMap();
         var8.put(2000, a("osrs", 12850, 5));
         var8.put(2001, a("osrs", 12851, -1));
         var8.put(2002, a("standard", 12852, 999));
         String var9 = a(var3, var8);
         a(var9.contains("2 regions, 2 spawns, 1 distinct spawned objects"), "OSRS filtering/counts");
         a(var9.contains("0 incomplete checks"), "land -1 is empty");
         a(var9.contains("osrs.idx1:43 MISSING_OR_UNREADABLE"), "missing morph model");
         a(!var9.contains("osrs.idx1:42"), "present packed model");
         a(var9.contains("osrs.idx2:7/0 MISSING_FRAME animation=2"), "missing individual frame");
         a(var9.contains("animation:3 MISSING_SEQUENCE"), "missing sequence");
         a(var9.contains("object=0 dependencyObject=1"), "morph provenance");
         a(
            var9.indexOf("region=12850 yaml=2000 land=5 group= object=0 dependencyObject=1 osrs.idx1:43")
               == var9.lastIndexOf("region=12850 yaml=2000 land=5 group= object=0 dependencyObject=1 osrs.idx1:43"),
            "deduplication"
         );
         var8.put(2003, a("osrs", 12853, 999));
         a(a(var3, var8).contains("INCOMPLETE region=12853"), "missing map is incomplete");
         Files.createDirectory(var3.resolve("osrs_idx1"));
         Files.write(var3.resolve("osrs_idx1/43.gz"), new byte[]{1});
         a(a(var3, var8).contains("osrs.idx1:43 MISSING_OR_UNREADABLE"), "loose files excluded");
         var7.e = new int[]{524288};
         a(a(var3, var8).contains("osrs.idx2:8 MISSING_OR_UNREADABLE"), "missing frame archive");
         var7.B = 589824;
         a(a(var3, var8).contains("osrs.idx2:9 MISSING_OR_UNREADABLE keyframes animation=2"), "missing skeletal archive");
      } finally {
         Stream var11 = Files.walk(var3);

         try {
            for (Path var13 : var11.sorted(Comparator.reverseOrder())::iterator) {
               Files.delete(var13);
            }
         } catch (Throwable var20) {
            if (var11 != null) {
               try {
                  var11.close();
               } catch (Throwable var19) {
                  var20.addSuppressed(var19);
               }
            }

            throw var20;
         }

         if (var11 != null) {
            var11.close();
         }
      }

      System.out.println("OSRS map dependency regression tests passed");
   }

   private static String a(Path var0, Map<Integer, Map<String, Object>> var1) {
      C_OsrsMapDependencyScanner_mc.c var2 = new C_OsrsMapDependencyScanner_mc.c(var0, "main_file_cache");

      String var5;
      try {
         C_OsrsMapDependencyScanner_mc.c var3 = new C_OsrsMapDependencyScanner_mc.c(var0, "main_file_osrs");

         try {
            C_OsrsMapDependencyScanner_mc var4 = new C_OsrsMapDependencyScanner_mc(var0, var2, var3);
            var4.a(var1);
            var5 = var4.a(var0.resolve("maps.yaml"));
         } catch (Throwable var8) {
            try {
               var3.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }

            throw var8;
         }

         var3.close();
      } catch (Throwable var9) {
         try {
            var2.close();
         } catch (Throwable var6) {
            var9.addSuppressed(var6);
         }

         throw var9;
      }

      var2.close();
      return var5;
   }

   private static Map<String, Object> a(String var0, int var1, int var2) {
      HashMap var3 = new HashMap();
      var3.put("type", var0);
      var3.put("id", var1);
      var3.put("land", var2);
      return var3;
   }

   private static void a(byte[] var0, String var1) {
      try {
         C_OsrsMapDependencyScanner_mc.a(var0, (var0x, var1x, var2, var3x) -> {
         });
         throw new AssertionError(var1);
      } catch (IOException var3) {
      }
   }

   private static void a(Path var0, String var1) {
      Files.write(var0.resolve(var1 + ".dat"), new byte[520]);

      for (int var2 = 0; var2 < 5; var2++) {
         Files.createFile(var0.resolve(var1 + ".idx" + var2));
      }
   }

   private static void a(Path var0, int var1, int var2, byte[] var3) {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      GZIPOutputStream var5 = new GZIPOutputStream(var4);

      try {
         var5.write(var3);
      } catch (Throwable var14) {
         try {
            var5.close();
         } catch (Throwable var11) {
            var14.addSuppressed(var11);
         }

         throw var14;
      }

      var5.close();
      RandomAccessFile var15 = new RandomAccessFile(var0.resolve("main_file_osrs.dat").toFile(), "rw");

      try {
         RandomAccessFile var6 = new RandomAccessFile(var0.resolve("main_file_osrs.idx" + var1).toFile(), "rw");

         try {
            a(new rs.p_cache.C_a(var15, var6, var1 + 1).a(var4.size(), var4.toByteArray(), var2), "write fixture");
         } catch (Throwable var12) {
            try {
               var6.close();
            } catch (Throwable var10) {
               var12.addSuppressed(var10);
            }

            throw var12;
         }

         var6.close();
      } catch (Throwable var13) {
         try {
            var15.close();
         } catch (Throwable var9) {
            var13.addSuppressed(var9);
         }

         throw var13;
      }

      var15.close();
   }

   private static void a(boolean var0, String var1) {
      if (!var0) {
         throw new AssertionError(var1);
      }
   }
}
