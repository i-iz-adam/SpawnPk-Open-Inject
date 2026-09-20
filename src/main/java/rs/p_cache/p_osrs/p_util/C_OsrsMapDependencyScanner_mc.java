package rs.p_cache.p_osrs.p_util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;
import rs.C_K_uc;
import rs.C_k;
import rs.p_d.C_r;
import rs.p_x.C_e;
import rs.p_x.C_f;

public final class C_OsrsMapDependencyScanner_mc {
   private final Path a;
   private final C_OsrsMapDependencyScanner_mc.c b;
   private final C_OsrsMapDependencyScanner_mc.c c;
   private final Map<String, String> d = new HashMap<>();
   private final Map<Integer, List<C_OsrsMapDependencyScanner_mc.a>> e = new HashMap<>();
   private final Map<String, Set<Integer>> f = new HashMap<>();
   private final Set<String> g = new TreeSet<>();
   private final Set<Integer> h = new TreeSet<>();
   private final List<String> i = new ArrayList<>();
   private int j;
   private int k;
   private int l;
   private int m;

   C_OsrsMapDependencyScanner_mc(Path var1, C_OsrsMapDependencyScanner_mc.c var2, C_OsrsMapDependencyScanner_mc.c var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static void main(String[] var0) {
      if (var0.length <= 3 && (var0.length <= 0 || !var0[0].equals("--help"))) {
         try {
            Path var1 = Paths.get(var0.length > 0 ? var0[0] : (Files.isDirectory(Paths.get("client/cache")) ? "client/cache" : "cache"))
               .toAbsolutePath()
               .normalize();
            Path var2 = var0.length > 1 ? Paths.get(var0[1]) : var1.resolve("configs/maps.yaml");
            Path var3 = (var0.length > 2 ? Paths.get(var0[2]) : var1.getParent().resolve("dumps/osrs-map-dependencies.txt")).toAbsolutePath().normalize();
            if (var3.startsWith(var1) || var3.equals(var2.toAbsolutePath().normalize())) {
               throw new IllegalArgumentException("Report must be outside the cache and must not overwrite maps.yaml");
            }

            C_OsrsMapDependencyScanner_mc.c var5 = new C_OsrsMapDependencyScanner_mc.c(var1, "main_file_cache");

            int var4;
            try {
               C_OsrsMapDependencyScanner_mc.c var6 = new C_OsrsMapDependencyScanner_mc.c(var1, "main_file_osrs");

               try {
                  C_OsrsMapDependencyScanner_mc var7 = new C_OsrsMapDependencyScanner_mc(var1, var5, var6);
                  var7.a();
                  var7.a(c(var2));
                  String var8 = var7.a(var2);
                  Files.createDirectories(var3.getParent());
                  Files.write(var3, var8.getBytes(StandardCharsets.UTF_8));
                  System.out.println(var8.substring(0, var8.indexOf("\n\n")));
                  System.out.println("Report: " + var3);
                  var4 = var7.l > 0 ? 2 : (var7.i.isEmpty() ? 0 : 1);
               } catch (Throwable var11) {
                  try {
                     var6.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }

                  throw var11;
               }

               var6.close();
            } catch (Throwable var12) {
               try {
                  var5.close();
               } catch (Throwable var9) {
                  var12.addSuppressed(var9);
               }

               throw var12;
            }

            var5.close();
            System.exit(var4);
         } catch (Exception var13) {
            System.err.println("Scan failed: " + var13);
            var13.printStackTrace();
            System.exit(2);
         }
      } else {
         System.out.println("Usage: OsrsMapDependencyScanner [cache-directory] [maps.yaml] [report.txt]");
         System.out.println("Exit: 0 clean, 1 dependency findings, 2 incomplete scan/setup error.");
      }
   }

   private void a() {
      Path var1 = this.a.resolve("configs/old_a.dat");
      if (!Files.isReadable(var1)) {
         throw new IOException("Missing " + var1);
      } else {
         C_a var2 = new C_a(this);
         byte[] var3 = this.b.a(0, 2, false);
         if (var3 == null) {
            throw new IOException("Missing config archive main_file_cache.idx0:2");
         } else {
            rs.p_d.C_a.a(new C_f(var3, "config"), var1.toFile(), var2);
            byte[] var4 = Files.readAllBytes(this.a.resolve("osrs_config/loc.dat"));
            byte[] var5 = Files.readAllBytes(this.a.resolve("osrs_config/loc.idx"));
            byte[] var6 = Files.readAllBytes(this.a.resolve("loc.dat"));
            byte[] var7 = Files.readAllBytes(this.a.resolve("loc.idx"));
            C_r.z = new C_b(this, var4, var6, var5, var7);
            C_r.z.a();
            C_r.a(C_r.a.d, var4, var5);
         }
      }
   }

   void a(Map<Integer, Map<String, Object>> var1) {
      for (Entry var3 : var1.entrySet()) {
         Map var4 = (Map)var3.getValue();
         if ("osrs".equalsIgnoreCase(String.valueOf(var4.get("type")))) {
            this.j++;
            int var5 = -1;

            try {
               var5 = a(var4, "id");
               int var6 = a(var4, "land");
               if (var6 == -1) {
                  this.m++;
               } else {
                  byte[] var7 = this.c.a(4, var6, true);
                  if (var7 == null) {
                     throw new IOException("Missing/unreadable packed landscape osrs.idx4:" + var6);
                  }

                  HashSet var9 = new HashSet();
                  a(
                     var7,
                     (var6x, var7x, var8, var9x) -> {
                        this.k++;

                        for (C_OsrsMapDependencyScanner_mc.a var11 : this.a(var6x)) {
                           this.g.add(var11.b);
                           this.h.add(var5);
                           String var12 = "object=" + var6x + " dependencyObject=" + var11.a + " " + var11.b + " " + var11.c;
                           if (var9.add(var12)) {
                              int var13 = (var5 >> 8) * 64 + (var7x >> 6 & 63);
                              int var14 = (var5 & 0xFF) * 64 + (var7x & 63);
                              this.i
                                 .add(
                                    "region="
                                       + var5
                                       + " yaml="
                                       + var3.getKey()
                                       + " land="
                                       + var6
                                       + " group="
                                       + var4.getOrDefault("group", "")
                                       + " "
                                       + var12
                                       + " example="
                                       + var13
                                       + ","
                                       + var14
                                       + ","
                                       + (var7x >> 12)
                                       + " type="
                                       + var8
                                       + " rotation="
                                       + var9x
                                 );
                           }
                        }
                     }
                  );
               }
            } catch (Exception var10) {
               this.l++;
               this.i.add("INCOMPLETE region=" + var5 + " yaml=" + var3.getKey() + " " + var10);
            }
         }
      }

      if (this.j == 0) {
         this.l++;
         this.i.add("INCOMPLETE: No entries with type: osrs were found.");
      }
   }

   private List<C_OsrsMapDependencyScanner_mc.a> a(int var1) {
      if (this.e.containsKey(var1)) {
         return this.e.get(var1);
      } else {
         ArrayList var2 = new ArrayList();
         HashSet var3 = new HashSet();
         ArrayDeque var4 = new ArrayDeque();
         var4.add(var1);

         while (!var4.isEmpty()) {
            int var5 = (Integer)var4.removeFirst();
            if (var5 != -1 && var3.add(var5)) {
               try {
                  if (var5 >= 0 && (var5 < C_r.A || C_r.z.b(var5))) {
                     C_r var6 = C_r.c(var5);
                     if (var6.an != null) {
                        for (int var10 : var6.an) {
                           this.a(var2, var5, var6.e(), 1, var10 & 65535, "model");
                        }
                     }

                     if (var6.au != -1) {
                        this.a(var2, var5, var6.au);
                     }

                     if (var6.ad != null) {
                        for (int var15 : var6.ad) {
                           if (var15 != -1) {
                              var4.add(var15);
                           }
                        }
                     }
                  } else {
                     var2.add(new C_OsrsMapDependencyScanner_mc.a(var5, "object:" + var5, "MISSING_DEFINITION"));
                  }
               } catch (Exception var11) {
                  this.l++;
                  var2.add(new C_OsrsMapDependencyScanner_mc.a(var5, "object:" + var5, "DECODE_ERROR " + var11));
               }
            }
         }

         this.e.put(var1, var2);
         return var2;
      }
   }

   private void a(List<C_OsrsMapDependencyScanner_mc.a> var1, int var2, int var3) {
      String var4 = "animation:" + var3;
      if (var3 >= 0 && var3 < rs.p_d.C_a.a.length && rs.p_d.C_a.a[var3] != null) {
         rs.p_d.C_a var5 = rs.p_d.C_a.a[var3];
         if (var5.b()) {
            int var19 = var5.B >>> 16;
            if (var19 >= 5000) {
               var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var4, "KEYFRAME_FILE_OUT_OF_CLIENT_BOUNDS " + var19));
            }

            this.a(var1, var2, true, 2, var19, "keyframes animation=" + var3);
            if (this.a(true, 2, var19) == null) {
               try {
                  byte[] var20 = this.c.a(2, var19, true);
                  if (var20.length < 6 || ((var20[0] & 255) << 8 | var20[1] & 255) != 420) {
                     var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, "osrs.idx2:" + var19, "EXPECTED_SKELETAL_KEYFRAMES animation=" + var3));
                  }
               } catch (IOException var16) {
                  throw new UncheckedIOException(var16);
               }
            }
         } else if (var5.e != null && var5.d > 0 && var5.e.length >= var5.d && var5.g != null && var5.g.length >= var5.d) {
            LinkedHashSet var6 = new LinkedHashSet();
            HashSet var7 = new HashSet();

            for (int var8 = 0; var8 < var5.d; var8++) {
               if (var5.e[var8] != -1) {
                  var6.add(var5.e[var8]);
               }
            }

            for (int var9 : var6) {
               int var10 = var9 >>> 16;
               Path var11 = null;
               if (!var5.w) {
                  if (Arrays.stream(C_k.c).anyMatch(var1x -> var1x == var3)) {
                     var11 = this.a.resolve("old_osrs_anims/" + var10 + ".dat");
                  }

                  if (var11 == null && Arrays.stream(new int[]{3502, 3353, 382, 55780, 13, 57784, 182}).anyMatch(var1x -> var1x == var10)) {
                     var11 = this.a.resolve("misc/" + var10 + ".dat");
                  }
               }

               if (var11 != null) {
                  String var22 = this.a.relativize(var11).toString();

                  try {
                     if (!this.f.containsKey(var22)) {
                        this.f.put(var22, a(Files.readAllBytes(var11), false));
                     }

                     if (!this.f.get(var22).contains(var9 & 4095)) {
                        var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var22 + "/" + (var9 & 4095), "MISSING_FRAME animation=" + var3));
                     }
                  } catch (Exception var18) {
                     if (var7.add(var22)) {
                        var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var22, "MISSING_OR_INVALID_LEGACY_FRAMES animation=" + var3 + " " + var18));
                     }
                  }
               } else if (var10 >= (var5.w ? 15000 : 4000)) {
                  if (var7.add("bounds:" + var10)) {
                     var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var4, "FRAME_FILE_OUT_OF_CLIENT_BOUNDS " + var10));
                  }
               } else {
                  String var12 = (var5.w ? "osrs" : "main") + ".idx2:" + var10;
                  String var13 = this.a(var5.w, 2, var10);
                  if (var13 != null) {
                     if (var7.add(var12)) {
                        var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var12, var13 + " animation=" + var3));
                     }
                  } else {
                     try {
                        if (!this.f.containsKey(var12)) {
                           this.f.put(var12, a((var5.w ? this.c : this.b).a(2, var10, true), var5.w));
                        }

                        if (!this.f.get(var12).contains(var9 & 4095)) {
                           var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var12 + "/" + (var9 & 4095), "MISSING_FRAME animation=" + var3));
                        }
                     } catch (Exception var17) {
                        String var15 = "FRAME_DECODE_ERROR " + var17;
                        this.d.put(var12, var15);
                        if (var7.add(var12)) {
                           var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var12, var15 + " animation=" + var3));
                        }
                     }
                  }
               }
            }
         } else {
            var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var4, "INVALID_SEQUENCE"));
         }
      } else {
         var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, var4, "MISSING_SEQUENCE"));
      }
   }

   private void a(List<C_OsrsMapDependencyScanner_mc.a> var1, int var2, boolean var3, int var4, int var5, String var6) {
      String var7 = this.a(var3, var4, var5);
      if (var7 != null) {
         var1.add(new C_OsrsMapDependencyScanner_mc.a(var2, (var3 ? "osrs" : "main") + ".idx" + var4 + ":" + var5, var7 + " " + var6));
      }
   }

   private String a(boolean var1, int var2, int var3) {
      String var4 = (var1 ? "osrs" : "main") + ".idx" + var2 + ":" + var3;
      if (!this.d.containsKey(var4)) {
         String var5 = null;

         try {
            byte[] var6 = (var1 ? this.c : this.b).a(var2, var3, true);
            if (var6 == null || var6.length == 0) {
               var5 = "MISSING_OR_UNREADABLE";
            }
         } catch (IOException var7) {
            var5 = "INVALID_GZIP " + var7.getMessage();
         }

         this.d.put(var4, var5);
      }

      return this.d.get(var4);
   }

   String a(Path var1) {
      return "OSRS map dependency scan: "
         + this.j
         + " regions, "
         + this.k
         + " spawns, "
         + this.e.size()
         + " distinct spawned objects\n"
         + this.h.size()
         + " affected regions, "
         + this.g.size()
         + " distinct problem assets, "
         + this.l
         + " incomplete checks\n\nCache: "
         + this.a
         + "\nMaps: "
         + var1.toAbsolutePath()
         + "\nRegions with land: -1 (no object spawns): "
         + this.m
         + "\nChecks all models and morph alternatives, regardless of current varbits/spawn shape.\nUses client object/animation overrides and configs/*.yaml, not serialized production configs.\nAsset IDs: idx1=models; idx2=frame/keyframe files; animation=N is a sequence ID.\nLoose packing directories do not count as packed assets. Model geometry and skeletal content are not decoded.\n\nProblem assets:\n"
         + String.join("\n", this.g)
         + "\n\nFindings (one example spawn per region/root object/dependency):\n"
         + (this.i.isEmpty() ? "No missing dependencies found." : String.join("\n", this.i))
         + "\n";
   }

   static Set<Integer> a(byte[] var0, boolean var1) {
      if (var0.length >= 2 && ((var0[0] & 255) << 8 | var0[1] & 255) == 420) {
         throw new IOException("Sequence expects classic frames but file contains skeletal keyframes (magic 420)");
      } else {
         C_e var2 = new C_e(var0);
         new C_K_uc(var2, var1);
         if (var1) {
            var2.A();
         }

         int var3 = var2.A();
         HashSet var4 = new HashSet();

         for (int var5 = 0; var5 < var3; var5++) {
            int var6 = var2.A();
            if (var6 >= var3 * 3) {
               throw new IOException("Frame index exceeds client allocation: " + var6);
            }

            var4.add(var6);
            int var7 = var2.y();

            for (int var8 = 0; var8 < var7; var8++) {
               int var9 = var2.y();

               for (byte var10 = 1; var10 <= 4; var10 <<= 1) {
                  if ((var9 & var10) != 0) {
                     var2.x();
                  }
               }
            }
         }

         if (var2.h != var0.length) {
            throw new IOException("Frame data length mismatch");
         } else {
            return var4;
         }
      }
   }

   static void a(byte[] var0, C_OsrsMapDependencyScanner_mc.b var1) {
      C_e var2 = new C_e(var0);
      int var3 = -1;

      try {
         while (true) {
            int var4 = var2.d();
            if (var4 == 0) {
               if (var2.h != var0.length) {
                  throw new IOException("Trailing landscape bytes");
               }

               return;
            }

            var3 = Math.addExact(var3, var4);
            int var5 = 0;

            while (true) {
               int var6 = var2.e();
               if (var6 == 0) {
                  break;
               }

               var5 = Math.addExact(var5, var6 - 1);
               if (var5 >= 16384) {
                  throw new IOException("Landscape location out of bounds");
               }

               int var7 = var2.y();
               var1.accept(var3, var5, var7 >> 2, var7 & 3);
            }
         }
      } catch (ArithmeticException | IndexOutOfBoundsException var8) {
         throw new IOException("Truncated/invalid landscape at byte " + var2.h, var8);
      }
   }

   private static int a(Map<String, Object> var0, String var1) {
      Object var2 = var0.get(var1);
      if (!(var2 instanceof Number)) {
         throw new IllegalArgumentException("Missing/non-numeric " + var1);
      } else {
         return ((Number)var2).intValue();
      }
   }

   private static Map<Integer, Map<String, Object>> c(Path var0) {
      LoaderOptions var1 = new LoaderOptions();
      var1.setMaxAliasesForCollections(200);
      InputStream var2 = Files.newInputStream(var0);

      TreeMap var4;
      try {
         Map var3 = (Map)new Yaml(new SafeConstructor(var1)).load(var2);
         if (var3 == null) {
            throw new IOException("Empty YAML: " + var0);
         }

         var4 = new TreeMap(var3);
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }

      return var4;
   }

   private static final class a {
      final int a;
      final String b;
      final String c;

      a(int var1, String var2, String var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }
   }

   interface b {
      void accept(int var1, int var2, int var3, int var4);
   }

   static final class c implements AutoCloseable {
      private final RandomAccessFile a;
      private final Path b;
      private final String c;
      private final Map<Integer, RandomAccessFile> d = new HashMap<>();

      c(Path var1, String var2) {
         this.b = var1;
         this.c = var2;
         this.a = new RandomAccessFile(var1.resolve(var2 + ".dat").toFile(), "r");
      }

      byte[] a(int var1, int var2, boolean var3) {
         if (var2 < 0) {
            return null;
         } else {
            if (!this.d.containsKey(var1)) {
               this.d.put(var1, new RandomAccessFile(this.b.resolve(this.c + ".idx" + var1).toFile(), "r"));
            }

            byte[] var4 = new rs.p_cache.C_a(this.a, this.d.get(var1), var1 + 1).a(var2);
            if (var3 && var4 != null && var4.length != 0) {
               GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var4));

               byte[] var6;
               try {
                  var6 = var5.readAllBytes();
               } catch (Throwable var9) {
                  try {
                     var5.close();
                  } catch (Throwable var8) {
                     var9.addSuppressed(var8);
                  }

                  throw var9;
               }

               var5.close();
               return var6;
            } else {
               return var4;
            }
         }
      }

      @Override
      public void close() {
         try {
            for (RandomAccessFile var2 : this.d.values()) {
               var2.close();
            }
         } finally {
            this.a.close();
         }
      }
   }
}
