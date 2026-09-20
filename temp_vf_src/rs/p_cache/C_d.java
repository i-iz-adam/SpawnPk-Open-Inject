package rs.p_cache;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.CRC32;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import rs.C_B_uc;
import rs.C_Client_mc;
import rs.C_h;
import rs.p_x.C_f;

public final class C_d extends C_e implements Runnable {
   private static int o = 0;
   public static List<Integer> a = new ArrayList<>();
   private final Object p = new Object();
   public final C_b b = new C_b();
   public final C_b c = new C_b();
   public final C_b d = new C_b();
   public final C_b e = new C_b();
   public static int f = 0;
   private final C_h q = new C_h();
   private final C_h r;
   private final C_h s;
   private final C_h t;
   private final C_h u;
   private int v;
   private int w;
   private C_c x;
   public rs.p_t.p_a.C_e g;
   private int y;
   private int z;
   public String h = "";
   private int A;
   private long B;
   public int[] i;
   private final CRC32 C = new CRC32();
   private final byte[] D = new byte[500];
   public int j;
   private final byte[][] E = new byte[4][];
   private C_Client_mc F;
   private int G;
   private int H;
   private int[] I;
   public int k;
   public int[] l;
   private int J;
   private boolean K;
   private OutputStream L;
   public int[] m;
   private boolean M;
   private final byte[] N;
   private int[] O;
   private final C_B_uc P;
   private InputStream Q;
   private Socket R;
   private final int[][] S;
   private final int[][] T;
   public int[] n;
   private byte[] U;
   private int V;

   public void a() {
      this.b.a("main_file_cache.dat", "main_file_cache.idx");
      this.c.a("main_file_osrs.dat", "main_file_osrs.idx");
      this.d.a("main_file_cache.dat", "main_file_cache.idx");
      this.e.a("main_file_osrs.dat", "main_file_osrs.idx");
      if (rs.p_f.C_a.d) {
         rs.p_cache.p_osrs.C_b var1 = new rs.p_cache.p_osrs.C_b(this.c);
         var1.a();
      }
   }

   private boolean a(int var1, int var2, byte[] var3) {
      if (var3 != null && var3.length >= 2) {
         int var4 = var3.length - 2;
         int var5 = ((var3[var4] & 255) << 8) + (var3[var4 + 1] & 255);
         this.C.reset();
         this.C.update(var3, 0, var4);
         return var5 == var1 && (int)this.C.getValue() == var2;
      } else {
         return false;
      }
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      if (var1 >= 0 && var2 >= 0) {
         synchronized (this.p) {
            for (C_c var7 = (C_c)this.P.b(); var7 != null; var7 = (C_c)this.P.c()) {
               if (var7.j == var1 && var7.m == var2) {
                  return;
               }
            }

            C_c var13 = new C_c();
            var13.j = var1;
            var13.k = rs.p_cache.p_osrs.C_c.a() ? 1 : 0;
            var13.m = var2;
            var13.n = true;
            var13.p = var3;
            var13.q = var4;
            var13.r = var5;
            synchronized (this.r) {
               this.r.a(var13);
            }

            this.P.a(var13);
         }
      }
   }

   @Override
   public void a(int var1) {
      this.a(0, var1);
   }

   public void a(int var1, int var2) {
      this.a(var1, var2, 0, 0, 0);
   }

   public int b(int var1) {
      return 32767;
   }

   @Override
   public void run() {
      try {
         while (this.K) {
            this.j++;
            byte var1 = 20;
            if (this.z == 0 && this.b.a()[0] != null) {
               var1 = 50;
            }

            try {
               Thread.sleep((long)var1);
            } catch (Exception var5) {
               var5.printStackTrace();
            }

            this.M = true;

            for (int var2 = 0; var2 < 100 && this.M; var2++) {
               this.M = false;
               this.k();
               this.l();
               if (this.v == 0 && var2 >= 5) {
                  break;
               }

               this.m();
               if (this.Q != null) {
                  this.n();
               }
            }

            boolean var7 = false;

            for (C_c var3 = (C_c)this.q.b(); var3 != null; var3 = (C_c)this.q.d()) {
               if (var3.n) {
                  var7 = true;
                  var3.o++;
                  if (var3.o > 50) {
                     var3.o = 0;
                     this.a(var3);
                  }
               }
            }

            if (!var7) {
               for (C_c var8 = (C_c)this.q.b(); var8 != null; var8 = (C_c)this.q.d()) {
                  var7 = true;
                  var8.o++;
                  if (var8.o > 50) {
                     var8.o = 0;
                     this.a(var8);
                  }
               }
            }

            if (var7) {
               this.V++;
               if (this.V > 750) {
                  try {
                     this.R.close();
                  } catch (Exception var4) {
                  }

                  this.R = null;
                  this.Q = null;
                  this.L = null;
                  this.H = 0;
               }
            } else {
               this.V = 0;
               this.h = "";
            }
         }
      } catch (Exception var6) {
         rs.p_v.C_a.e("od_ex " + var6.getMessage());
         var6.printStackTrace();
      }
   }

   public void b(int var1, int var2) {
      if (this.b.a()[0] != null) {
         if (this.z != 0) {
            C_c var3 = new C_c();
            var3.j = var2;
            var3.m = var1;
            var3.n = false;
            if (rs.p_cache.p_osrs.C_c.a()) {
               var3.k = 1;
            }

            synchronized (this.s) {
               this.s.a(var3);
            }
         }
      }
   }

   public C_c b() {
      C_c var1;
      synchronized (this.u) {
         var1 = (C_c)this.u.a();
      }

      if (var1 == null) {
         return null;
      } else {
         synchronized (this.p) {
            var1.a();
         }

         if (var1.l == null) {
            return var1;
         } else {
            boolean var12 = false;
            if (var1.i) {
               try {
                  GzipCompressorInputStream var3 = new GzipCompressorInputStream(new ByteArrayInputStream(var1.l));

                  try {
                     var1.l = var3.readAllBytes();
                  } catch (Throwable var7) {
                     try {
                        var3.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }

                     throw var7;
                  }

                  var3.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
                  System.out.println("[dataType=" + var1.j + "] [fileID=" + var1.m + "] [osrs=" + (var1.k == 1) + "]");
               }
            }

            return var1;
         }
      }
   }

   public byte[] a(int var1, int var2, int var3) {
      byte[] var4 = (var3 == 1 ? this.e : this.d).a()[var1 + 1].a(var2);
      if (var4 != null) {
         GzipCompressorInputStream var5 = new GzipCompressorInputStream(new ByteArrayInputStream(var4));

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
         return null;
      }
   }

   private void k() {
      C_c var1;
      synchronized (this.r) {
         var1 = (C_c)this.r.a();
      }

      while (var1 != null) {
         this.M = true;
         byte[] var15 = null;
         if (var1.j == 0 && !rs.p_f.C_a.aj && C_Client_mc.bn.b(var1.m) != null && var1.k != 1) {
            File var3 = new File(rs.p_v.C_a.f() + "raw/" + var1.m + ".dat");
            if (!var3.exists()) {
               var3 = new File(rs.p_v.C_a.f() + "raw/" + var1.m);
            }

            if (var3.exists()) {
               var15 = C_Client_mc.a(var3.getAbsolutePath());
               synchronized (this.r) {
                  var1.l = var15;
                  var1.i = false;
                  synchronized (this.u) {
                     this.u.a(var1);
                  }

                  var1 = (C_c)this.r.a();
                  continue;
               }
            }
         }

         C_b var17 = var1.k == 1 ? this.c : this.b;
         if (var17.a()[0] != null) {
            var15 = var17.a()[var1.j + 1].a(var1.m);
         }

         synchronized (this.r) {
            if (var15 == null) {
               this.t.a(var1);
            } else {
               var1.l = var15;
               synchronized (this.u) {
                  this.u.a(var1);
               }
            }

            var1 = (C_c)this.r.a();
         }
      }
   }

   public void a(byte var1, int var2, int var3) {
      if (this.b.a()[0] != null) {
         synchronized (this.p) {
            byte[] var5 = this.b.a()[var2 + 1].a(var3);
            this.E[var2][var3] = var1;
            if (var1 > this.z) {
               this.z = var1;
            }

            this.y++;
         }
      }
   }

   public boolean c(int var1) {
      for (int var2 = 0; var2 < this.n.length; var2++) {
         if (this.i[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   private void l() {
      this.v = 0;
      this.w = 0;

      for (C_c var1 = (C_c)this.q.b(); var1 != null; var1 = (C_c)this.q.d()) {
         if (var1.n) {
            this.v++;
            if (f < 100 || rs.p_f.C_a.d) {
               System.out.println("Error: model is incomplete or missing  [ type = " + var1.j + "]  [id = " + var1.m + "]  [rev = " + var1.k + "]");
               f++;
            }
         } else {
            this.w++;
         }
      }

      while (this.v < c()) {
         C_c var4 = (C_c)this.t.a();

         try {
            if (var4 == null) {
               break;
            }

            if (this.E[var4.j][var4.m] != 0) {
               this.J++;
            }

            this.E[var4.j][var4.m] = 0;
            this.q.a(var4);
            this.v++;
            this.a(var4);
            this.M = true;
            if (f < 100 || rs.p_f.C_a.d) {
               System.out.println("Error: file is missing  [ type = " + var4.j + "]  [id = " + var4.m + "]");
               f++;
            }
         } catch (Exception var3) {
            if (f < 100 || rs.p_f.C_a.d) {
               System.out.println("missing: type: " + var4.j + " ID" + var4.m + " REV" + var4.k);
               f++;
            }
         }
      }
   }

   public static int c() {
      return rs.p_f.C_a.d ? 100 : 10;
   }

   public void d() {
      synchronized (this.s) {
         this.s.f();
      }
   }

   private void m() {
      while (this.v == 0 && this.w < c() && this.z != 0) {
         C_c var1;
         synchronized (this.s) {
            var1 = (C_c)this.s.a();
         }

         while (var1 != null) {
            if (this.E[var1.j][var1.m] != 0) {
               this.E[var1.j][var1.m] = 0;
               this.q.a(var1);
               this.a(var1);
               this.M = true;
               if (this.J < this.y) {
                  this.J++;
               }

               this.h = "Loading extra files - " + this.J * 100 / this.y + "%";
               this.w++;
               if (this.w == 10) {
                  return;
               }
            }

            synchronized (this.s) {
               var1 = (C_c)this.s.a();
            }
         }

         for (int var10 = 0; var10 < 4; var10++) {
            byte[] var3 = this.E[var10];
            int var4 = var3.length;

            for (int var5 = 0; var5 < var4; var5++) {
               if (var3[var5] == this.z) {
                  var3[var5] = 0;
                  C_c var6 = new C_c();
                  var6.j = var10;
                  var6.m = var5;
                  var6.n = false;
                  this.q.a(var6);
                  this.a(var6);
                  this.M = true;
                  if (this.J < this.y) {
                     this.J++;
                  }

                  this.h = "Loading extra files - " + this.J * 100 / this.y + "%";
                  this.w++;
                  if (this.w == 10) {
                     return;
                  }
               }
            }
         }

         this.z--;
      }
   }

   public boolean d(int var1) {
      return this.I[var1] == 1;
   }

   public C_d() {
      this.s = new C_h();
      this.K = true;
      this.M = false;
      this.u = new C_h();
      this.N = new byte[465000];
      this.P = new C_B_uc();
      this.S = new int[4][];
      this.T = new int[4][];
      this.t = new C_h();
      this.r = new C_h();
   }

   public void e(int var1) {
      System.out.println("[Regions] Attempting to dump region " + var1 + "..");

      for (int var2 = 0; var2 < this.n.length; var2++) {
         if (this.n[var2] == var1) {
            System.out.println("-> Region dump (ID " + var1 + "):");
            System.out.println("mapIndices1[" + var2 + "] = " + var1 + ";");
            System.out.println("mapIndices2[" + var2 + "] = " + this.l[var2] + ";");
            System.out.println("mapIndices3[" + var2 + "] = " + this.i[var2] + ";");
            System.out.println();
            return;
         }
      }

      System.out.println("-> Failed to find region map data!");
   }

   public void e() {
      File var1 = new File("./dumps/maps");
      var1.mkdir();

      for (int var2 = 0; var2 < this.l.length; var2++) {
         try {
            byte[] var3 = this.b.a()[4].a(this.l[var2]);
            File var4 = new File("./dumps/maps/" + this.l[var2] + ".gz");
            FileOutputStream var5 = new FileOutputStream(var4);
            var5.write(var3);
            var5.close();
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }
   }

   public void f() {
      byte[] var1 = C_Client_mc.a(rs.p_v.C_a.f() + "map_index.dat");
      rs.p_x.C_e var2 = new rs.p_x.C_e(var1);
      int var3 = var1.length / 6;
      this.n = new int[var3];
      this.l = new int[var3];
      this.i = new int[var3];

      for (int var4 = 0; var4 < var3; var4++) {
         this.n[var4] = var2.A();
         this.l[var4] = var2.A();
         this.i[var4] = var2.A();
      }
   }

   public void a(C_f var1, C_Client_mc var2) {
      String[] var3 = new String[]{"model_version", "anim_version", "midi_version", "map_version"};

      for (int var4 = 0; var4 < 4; var4++) {
         byte[] var5 = var1.a(var3[var4]);
         int var6 = var5.length / 2;
         rs.p_x.C_e var7 = new rs.p_x.C_e(var5);
         this.S[var4] = new int[var6];
         this.E[var4] = new byte[var6];

         for (int var8 = 0; var8 < var6; var8++) {
            this.S[var4][var8] = var7.A();
         }
      }

      String[] var17 = new String[]{"model_crc", "anim_crc", "midi_crc", "map_crc"};

      for (int var18 = 0; var18 < 4; var18++) {
         byte[] var23 = var1.a(var17[var18]);
         int var27 = var23.length / 4;
         rs.p_x.C_e var32 = new rs.p_x.C_e(var23);
         this.T[var18] = new int[var27];

         for (int var9 = 0; var9 < var27; var9++) {
            this.T[var18][var9] = var32.D();
         }
      }

      byte[] var19 = var1.a("model_index");
      int var24 = this.S[0].length;
      this.U = new byte[var24];

      for (int var28 = 0; var28 < var24; var28++) {
         if (var28 < var19.length) {
            this.U[var28] = var19[var28];
         } else {
            this.U[var28] = 0;
         }
      }

      var19 = C_Client_mc.a(rs.p_v.C_a.f() + "map_index.dat");
      rs.p_x.C_e var29 = new rs.p_x.C_e(var19);
      int var33 = var19.length / 6;
      o = var33;
      int var37 = var33 + 100;
      this.n = new int[var37 + 1000];
      this.l = new int[var37 + 1000];
      this.i = new int[var37 + 1000];
      this.m = new int[var37 + 1000];

      for (int var10 = 0; var10 < var33; var10++) {
         this.n[var10] = var29.A();
         this.l[var10] = var29.A();
         this.i[var10] = var29.A();
      }

      this.g = new rs.p_t.p_a.C_e();
      this.g.a(this.n, this.l, this.i, this.m);
      this.n[107] = 8751;
      this.l[107] = 1946;
      this.i[107] = 1947;
      this.n[108] = 8752;
      this.l[108] = 938;
      this.i[108] = 939;
      this.n[129] = 9007;
      this.l[129] = 1938;
      this.i[129] = 1939;
      this.n[130] = 9008;
      this.l[130] = 946;
      this.i[130] = 947;
      this.n[149] = 9263;
      this.l[149] = 1210;
      this.i[149] = 1211;
      this.n[150] = 9264;
      this.l[150] = 956;
      this.i[150] = 957;
      this.n[1047] = 13361;
      this.l[1047] = 584;
      this.i[1047] = 585;
      this.n[1088] = 13617;
      this.l[1088] = 238;
      this.i[1088] = 239;
      this.n[1106] = -1;
      this.l[1106] = -1;
      this.i[1106] = -1;
      this.n[1105] = -1;
      this.l[1105] = -1;
      this.i[1105] = -1;
      this.n[1064] = 13386;
      this.l[1064] = 1912;
      this.i[1064] = 1913;
      this.n[o] = 13130;
      this.l[o] = 1900;
      this.i[o++] = 1901;
      this.n[1065] = 13387;
      this.l[1065] = 1880;
      this.i[1065] = 1881;
      this.n[o] = -1;
      this.l[o] = -1;
      this.i[o++] = -1;
      this.n[1108] = -1;
      this.l[1108] = -1;
      this.i[1108] = -1;
      this.n[o] = -1;
      this.l[o] = -1;
      this.i[o++] = -1;
      this.n[1109] = -1;
      this.l[1109] = -1;
      this.i[1109] = -1;
      this.n[1021] = 13135;
      this.l[1021] = 1892;
      this.i[1021] = 1893;
      this.n[o] = 13134;
      this.l[o] = 1884;
      this.i[o++] = 1885;
      this.n[1020] = -1;
      this.l[1020] = -1;
      this.i[1020] = -1;
      this.n[925] = -1;
      this.l[925] = -1;
      this.i[925] = -1;
      this.n[1135] = 13899;
      this.l[1135] = 1890;
      this.i[1135] = 1891;
      this.n[o] = 13900;
      this.l[o] = 1910;
      this.i[o++] = 1911;
      this.n[o] = 14155;
      this.l[o] = 1904;
      this.i[o++] = 1905;
      this.n[o] = 14156;
      this.l[o] = 1878;
      this.i[o++] = 1879;
      this.n[1019] = 13131;
      this.l[1019] = 1894;
      this.i[1019] = 1895;
      this.n[926] = -1;
      this.l[926] = -1;
      this.i[926] = -1;
      this.n[o] = 12703;
      this.l[o] = 3212;
      this.i[o++] = 3213;
      this.n[o] = 12702;
      this.l[o] = 3204;
      this.i[o++] = 3205;
      this.n[o] = 12701;
      this.l[o] = 3208;
      this.i[o++] = 3209;
      this.n[o] = 12959;
      this.l[o] = 3206;
      this.i[o++] = 3207;
      this.n[o] = 12958;
      this.l[o] = 3210;
      this.i[o++] = 3211;
      this.n[o] = 12957;
      this.l[o] = 3214;
      this.i[o++] = 3215;
      this.n[o] = 14927;
      this.l[o] = 1876;
      this.i[o++] = 1877;
      this.n[180] = 9023;
      this.l[180] = 1624;
      this.i[180] = 1625;
      this.n[251] = 6810;
      this.l[251] = 2700;
      this.i[251] = 2701;
      this.n[49] = 7513;
      this.l[49] = 2724;
      this.i[49] = 2725;
      this.n[239] = 9377;
      this.l[239] = 1440;
      this.i[239] = 1441;
      this.n[o] = 7514;
      this.l[o] = 2728;
      this.i[o++] = 2729;
      this.n[o] = 6481;
      this.l[o] = 1348;
      this.i[o++] = 1349;
      this.n[o] = 6480;
      this.l[o] = 1350;
      this.i[o++] = 1351;
      this.n[o] = 5771;
      this.l[o] = 1352;
      this.i[o++] = 1353;
      this.n[o] = 5772;
      this.l[o] = 1354;
      this.i[o++] = 1355;
      o++;
      this.n[o] = 13396;
      this.l[o] = 2814;
      this.i[o++] = 2815;
      o++;
      o++;
      o++;
      o++;
      o++;
      this.n[493] = -1;
      this.l[493] = -1;
      this.i[493] = -1;
      this.n[918] = 0;
      this.l[918] = 0;
      this.i[918] = 0;
      this.n[1063] = -1;
      this.l[1063] = -1;
      this.i[1063] = -1;
      this.n[1424] = 0;
      this.l[1424] = 0;
      this.i[1424] = 0;
      this.n[1016] = 0;
      this.l[1016] = 0;
      this.i[1016] = 0;
      this.n[1423] = 0;
      this.l[1423] = 0;
      this.i[1423] = 0;
      this.n[1513] = 13660;
      this.l[1513] = 2708;
      this.i[1513] = 2709;
      this.n[1544] = 13916;
      this.l[1544] = 2716;
      this.i[1544] = 2717;
      this.n[1512] = 13659;
      this.l[1512] = 2712;
      this.i[1512] = 2713;
      this.n[1543] = 13915;
      this.l[1543] = 2718;
      this.i[1543] = 2719;
      this.n[1511] = 13658;
      this.l[1511] = 2710;
      this.i[1511] = 2711;
      this.n[1542] = 13914;
      this.l[1542] = 2702;
      this.i[1542] = 2703;
      this.n[1573] = 14170;
      this.l[1573] = 2704;
      this.i[1573] = 2705;
      this.n[1572] = 14169;
      this.l[1572] = 2706;
      this.i[1572] = 2707;
      this.n[1541] = 13913;
      this.l[1541] = 2714;
      this.i[1541] = 2715;
      this.n[1555] = 5956;
      this.l[1555] = 3528;
      this.i[1555] = 3529;
      this.n[1556] = 11877;
      this.l[1556] = 3526;
      this.i[1556] = 3527;
      this.n[878] = 11601;
      this.l[878] = 3474;
      this.i[878] = 3475;
      this.n[725] = 0;
      this.l[725] = 0;
      this.i[725] = 0;
      this.n[726] = 0;
      this.l[726] = 0;
      this.i[726] = 0;
      this.n[783] = 0;
      this.l[783] = 0;
      this.i[783] = 0;
      this.n[666] = 0;
      this.l[666] = 0;
      this.i[666] = 0;
      this.n[665] = 0;
      this.l[665] = 0;
      this.i[665] = 0;
      this.n[417] = 0;
      this.l[417] = 0;
      this.i[417] = 0;
      this.n[242] = 0;
      this.l[242] = 0;
      this.i[242] = 0;
      this.n[880] = -1;
      this.l[880] = -1;
      this.i[880] = -1;
      this.n[971] = -1;
      this.l[971] = -1;
      this.i[971] = -1;
      this.n[972] = -1;
      this.l[972] = -1;
      this.i[972] = -1;
      var19 = var1.a("anim_index");
      var29 = new rs.p_x.C_e(var19);
      var24 = var19.length / 2;
      this.O = new int[var24];

      for (int var34 = 0; var34 < var24; var34++) {
         this.O[var34] = var29.A();
      }

      var19 = var1.a("midi_index");
      var29 = new rs.p_x.C_e(var19);
      var24 = var19.length;
      this.I = new int[var24];

      for (int var35 = 0; var35 < var24; var35++) {
         this.I[var35] = var29.y();
      }

      this.F = var2;
      this.K = true;
      this.F.a(this, 2);
      if (rs.p_f.C_a.c == 1) {
         boolean var36 = false;
         int[] var38 = new int[0];
         int[] var39 = new int[0];
         int[] var11 = new int[0];

         for (int var12 = 0; var12 < this.n.length; var12++) {
            for (int var16 : var11) {
               if (var12 == var16) {
                  System.out.println("[IDX] [FOUND MATCH FOR IDX " + var12 + "]");
                  System.out.println("mapIndices1[" + var12 + "] = " + this.n[var12]);
                  System.out.println("mapIndices2[" + var12 + "] = " + this.l[var12]);
                  System.out.println("mapIndices3[" + var12 + "] = " + this.i[var12]);
                  System.out.println();
               }
            }

            for (int var51 : var38) {
               if (this.l[var12] == var51 || this.i[var12] == var51) {
                  System.out.println("[FILE] [FOUND MATCH FOR FILE " + var51 + "]");
                  System.out.println("mapIndices1[" + var12 + "] = " + this.n[var12]);
                  System.out.println("mapIndices2[" + var12 + "] = " + this.l[var12]);
                  System.out.println("mapIndices3[" + var12 + "] = " + this.i[var12]);
                  System.out.println();
               }
            }

            for (int var52 : var39) {
               if (this.n[var12] == var52) {
                  System.out.println("[REGION] [FOUND MATCH FOR REGION " + var52 + "]");
                  System.out.println("mapIndices1[" + var12 + "] = " + this.n[var12]);
                  System.out.println("mapIndices2[" + var12 + "] = " + this.l[var12]);
                  System.out.println("mapIndices3[" + var12 + "] = " + this.i[var12]);
                  System.out.println();
               }
            }
         }

         if (var36) {
            HashMap var40 = new HashMap();
            short var43 = 3530;

            for (int var46 = 0; var46 < var43; var46++) {
               for (int var50 = 0; var50 < this.n.length; var50++) {
                  if (this.l[var50] == var46 || this.i[var50] == var46) {
                     var40.put(var46, true);
                     break;
                  }
               }
            }

            for (int var47 = 0; var47 < var43; var47++) {
               if (var40.get(var47) == null) {
                  System.out.println("[MAP TOOL] Found unused region .GZ FILE id: " + var47);
               }
            }
         }
      }
   }

   private void n() {
      try {
         int var1 = this.Q.available();
         if (this.H == 0 && var1 >= 6) {
            this.M = true;
            this.Q.read(this.D, 0, 6);
            int var2 = this.D[0] & 255;
            int var3 = ((this.D[1] & 255) << 8) + (this.D[2] & 255);
            int var4 = ((this.D[3] & 255) << 8) + (this.D[4] & 255);
            int var5 = this.D[5] & 255;
            this.x = null;

            for (C_c var6 = (C_c)this.q.b(); var6 != null; var6 = (C_c)this.q.d()) {
               if (var6.j == var2 && var6.m == var3) {
                  this.x = var6;
               }

               if (this.x != null) {
                  var6.o = 0;
               }
            }

            if (this.x != null) {
               this.V = 0;
               if (var4 == 0) {
                  rs.p_v.C_a.e("Rej: " + var2 + "," + var3);
                  this.x.l = null;
                  if (this.x.n) {
                     synchronized (this.u) {
                        this.u.a(this.x);
                     }
                  } else {
                     this.x.b();
                  }

                  this.x = null;
               } else {
                  if (this.x.l == null && var5 == 0) {
                     this.x.l = new byte[var4];
                  }

                  if (this.x.l == null) {
                     throw new IOException("missing start of file");
                  }
               }
            }

            this.G = var5 * 500;
            this.H = 500;
            if (this.H > var4 - var5 * 500) {
               this.H = var4 - var5 * 500;
            }
         }

         if (this.H > 0 && var1 >= this.H) {
            this.M = true;
            byte[] var13 = this.D;
            int var14 = 0;
            if (this.x != null) {
               var13 = this.x.l;
               var14 = this.G;
            }

            this.Q.read(var13, var14, this.H);
            if (this.H + this.G >= var13.length && this.x != null) {
               C_b var15 = this.x.k == 1 ? this.c : this.b;
               if (var15.a()[0] != null) {
                  var15.a()[this.x.j + 1].a(var13.length, var13, this.x.m);
               }

               if (!this.x.n && this.x.j == 3) {
                  this.x.n = true;
                  this.x.j = 93;
               }

               if (this.x.n) {
                  synchronized (this.u) {
                     this.u.a(this.x);
                  }
               } else {
                  this.x.b();
               }
            }

            this.H = 0;
         }
      } catch (IOException var12) {
         try {
            this.R.close();
         } catch (Exception var9) {
         }

         this.R = null;
         this.Q = null;
         this.L = null;
         this.H = 0;
      }
   }

   public int g() {
      synchronized (this.P) {
         return this.P.d();
      }
   }

   public void h() {
      this.K = false;
   }

   public void a(boolean var1) {
      int var2 = this.n.length;

      for (int var3 = 0; var3 < var2; var3++) {
         if (var1 || this.m[var3] != 0) {
            this.a((byte)2, 3, this.i[var3]);
            this.a((byte)2, 3, this.l[var3]);
         }
      }
   }

   public int f(int var1) {
      return this.S[var1].length;
   }

   private void a(C_c var1) {
      this.R = null;
      this.Q = null;
      this.L = null;
      this.H = 0;
      this.k++;
   }

   public int i() {
      return 29192;
   }

   public int j() {
      return 72000;
   }

   public int b(int var1, int var2, int var3) {
      int var4 = (var3 << 8) + var2;

      for (int var7 = 0; var7 < this.n.length; var7++) {
         if (this.n[var7] == var4) {
            int var8 = var1 == 0 ? this.l[var7] : this.i[var7];
            if (var8 > 3535 && !this.g.f().a_(var8)) {
               if (rs.p_f.C_a.d) {
                  System.out.println("[Map warning] Capped map file " + var8 + " (reached max)");
               }

               return -1;
            }

            return var8;
         }
      }

      return -1;
   }
}
