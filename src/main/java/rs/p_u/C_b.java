package rs.p_u;

import com.a.a.a.a;
import com.a.b.a.b;
import com.a.b.a.c;
import rs.C_Client_mc;
import rs.C_K_uc;
import rs.C_k;

public class C_b {
   boolean a;
   C_g[][] b = (C_g[][])null;
   int c;
   int d = 0;
   public C_g[][] e = (C_g[][])null;
   public C_K_uc base;
   public static C_b[] f;

   public C_b a() {
      try {
         if (f[this.c] == null) {
            C_k.a(this.c, true);
         }

         return f[this.c];
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static C_b a(int var0) {
      try {
         String var1 = "";
         int var2 = var0 >>> 16;
         int var3 = var0 & 65535;
         if (f[var2] == null) {
            C_k.a(var2, true);
         }

         return f[var2];
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static final void b(int var0) {
      boolean var1 = rs.p_cache.p_osrs.C_c.a();

      try {
         rs.p_cache.p_osrs.C_c.a(true);
         C_Client_mc.ew.a(1, var0);
      } finally {
         rs.p_cache.p_osrs.C_c.a(var1);
      }
   }

   public static void b() {
      f = new C_b[5000];
   }

   public static void a(int var0, byte[] var1) {
      try {
         rs.p_x.C_e var2 = new rs.p_x.C_e(var1);
         if (var2.A() != 420) {
            System.err.println("Not a keyframe file!");
         }

         int var3 = var2.D();
         byte[] var4 = new byte[var3];
         var2.a(var3, 0, var4);
         rs.p_x.C_e var5 = new rs.p_x.C_e(var4);
         int var6 = var2.y();
         int var7 = var2.A();
         C_b var8 = f[var0] = new C_b();
         var8.c = var0;

         try {
            var8.base = new C_K_uc(var5, false, var3);
         } catch (RuntimeException var11) {
            f[var0] = null;
            System.err.println(var11.getMessage());
            System.err.println("Error1 unpacking base for keyframe " + var0);
            var11.printStackTrace();
         }

         try {
            var8.a(var2, var6);
         } catch (RuntimeException var10) {
            f[var0] = null;
            System.err.println("Error1 unpacking keyframes " + var0 + " file size from cache = " + var1.length);
            var10.printStackTrace();
         }
      } catch (Exception var12) {
         System.err.println("Error2 unpacking keyframes " + var0);
         var12.printStackTrace();
      }
   }

   void a(rs.p_x.C_e var1, int var2) {
      int var3 = var1.r();
      int var4 = var1.h;
      var1.o();
      var1.o();
      this.d = var1.y();
      int var5 = var1.o();
      this.b = new C_g[this.base.b().b()][];
      this.e = new C_g[this.base.a()][];

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var1.y();
         C_c[] var8 = new C_c[]{C_c.f, C_c.d, C_c.b, C_c.c, C_c.a, C_c.e};
         C_c var9 = (C_c)com.a.a.a.a.a(var8, var7);
         if (var9 == null) {
            var9 = C_c.f;
         }

         int var10 = var1.t();
         C_e var11 = C_e.a(var1.y());
         C_g var12 = new C_g();
         var12.a(var1, var2);
         int var13 = var9.b();
         C_g[][] var14;
         if (C_c.d == var9) {
            var14 = this.b;
         } else {
            var14 = this.e;
         }

         if (var14[var10] == null) {
            var14[var10] = new C_g[var13];
         }

         var14[var10][var11.c()] = var12;
         if (C_c.a == var9) {
            this.a = true;
         }
      }

      int var15 = var1.h - var4;
      if (var15 != var3) {
         throw new RuntimeException("AnimKeyFrameSet size mismatch! keyframe " + this.d + ", frame size: " + var3 + ", actual read: " + var15);
      }
   }

   public int c() {
      return this.d;
   }

   public boolean d() {
      return this.a;
   }

   public void a(int var1, C_d var2, int var3, int var4) {
      b var5 = com.a.b.a.b.a();
      this.a(var5, var3, var2, var1);
      this.c(var5, var3, var2, var1);
      this.b(var5, var3, var2, var1);
      var2.a(var5);
      var5.b();
   }

   void a(b var1, int var2, C_d var3, int var4) {
      float[] var5 = var3.e(this.d);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.b[var2]) {
         C_g var9 = this.b[var2][0];
         C_g var10 = this.b[var2][1];
         C_g var11 = this.b[var2][2];
         if (var9 != null) {
            var6 = var9.a(var4);
         }

         if (var10 != null) {
            var7 = var10.a(var4);
         }

         if (var11 != null) {
            var8 = var11.a(var4);
         }
      }

      c var14 = com.a.b.a.c.a();
      var14.b(1.0F, 0.0F, 0.0F, var6);
      c var15 = com.a.b.a.c.a();
      var15.b(0.0F, 1.0F, 0.0F, var7);
      c var16 = com.a.b.a.c.a();
      var16.b(0.0F, 0.0F, 1.0F, var8);
      c var12 = com.a.b.a.c.a();
      var12.a(var16);
      var12.a(var14);
      var12.a(var15);
      b var13 = com.a.b.a.b.a();
      var13.a(var12);
      var1.c(var13);
      var14.b();
      var15.b();
      var16.b();
      var12.b();
      var13.b();
   }

   void b(b var1, int var2, C_d var3, int var4) {
      float[] var5 = var3.f(this.d);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.b[var2] != null) {
         C_g var9 = this.b[var2][3];
         C_g var10 = this.b[var2][4];
         C_g var11 = this.b[var2][5];
         if (var9 != null) {
            var6 = var9.a(var4);
         }

         if (null != var10) {
            var7 = var10.a(var4);
         }

         if (null != var11) {
            var8 = var11.a(var4);
         }
      }

      var1.e[12] = var6;
      var1.e[13] = var7;
      var1.e[14] = var8;
   }

   void c(b var1, int var2, C_d var3, int var4) {
      float[] var5 = var3.g(this.d);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.b[var2] != null) {
         C_g var9 = this.b[var2][6];
         C_g var10 = this.b[var2][7];
         C_g var11 = this.b[var2][8];
         if (var9 != null) {
            var6 = var9.a(var4);
         }

         if (var10 != null) {
            var7 = var10.a(var4);
         }

         if (var11 != null) {
            var8 = var11.a(var4);
         }
      }

      b var12 = com.a.b.a.b.a();
      var12.a(var6, var7, var8);
      var1.c(var12);
      var12.b();
   }
}
