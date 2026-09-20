package rs.p_x;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class C_f {
   public byte[] a;
   public int b;
   public int[] c;
   public int[] d;
   public int[] e;
   public int[] f;
   public boolean g;

   public C_f(byte[] var1, String var2) {
      this.a(var1);
   }

   public static byte[] a(File var0) {
      FileInputStream var1 = new FileInputStream(var0);
      long var2 = var0.length();
      byte[] var4 = new byte[(int)var2];
      int var5 = 0;
      int var6 = 0;

      while (var5 < var4.length && (var6 = var1.read(var4, var5, var4.length - var5)) >= 0) {
         var5 += var6;
      }

      if (var5 < var4.length) {
         throw new IOException("Could not completely read file " + var0.getName());
      } else {
         var1.close();
         return var4;
      }
   }

   public void a(byte[] var1) {
      C_e var2 = new C_e(var1);
      int var3 = var2.C();
      int var4 = var2.C();
      if (var4 == 0) {
         byte[] var5 = new byte[var3];
         byte[] var6 = new byte[var3];
         System.arraycopy(var1, 6, var5, 0, var1.length - 6);

         try {
            DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var5)));
            var7.readFully(var6, 0, var6.length);
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         this.a = var6;
         var2 = new C_e(this.a);
         this.g = true;
      } else if (var4 != var3) {
         byte[] var9 = new byte[var3];
         C_a.a(var9, var3, var1, var4, 6);
         this.a = var9;
         var2 = new C_e(this.a);
         this.g = true;
      } else {
         this.a = var1;
         this.g = false;
      }

      this.b = var2.A();
      this.c = new int[this.b];
      this.d = new int[this.b];
      this.e = new int[this.b];
      this.f = new int[this.b];
      int var10 = var2.h + this.b * 10;

      for (int var11 = 0; var11 < this.b; var11++) {
         this.c[var11] = var2.D();
         this.d[var11] = var2.C();
         this.e[var11] = var2.C();
         this.f[var11] = var10;
         var10 += this.e[var11];
      }
   }

   public byte[] a(String var1) {
      byte[] var2 = null;
      int var3 = 0;
      var1 = var1.toUpperCase();

      for (int var4 = 0; var4 < var1.length(); var4++) {
         var3 = var3 * 61 + var1.charAt(var4) - 32;
      }

      for (int var6 = 0; var6 < this.b; var6++) {
         if (this.c[var6] == var3) {
            if (var2 == null) {
               var2 = new byte[this.d[var6]];
            }

            if (!this.g) {
               C_a.a(var2, this.d[var6], this.a, this.e[var6], this.f[var6]);
            } else {
               System.arraycopy(this.a, this.f[var6], var2, 0, this.d[var6]);
            }

            return var2;
         }
      }

      return null;
   }
}
