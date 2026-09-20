package rs.p_x;

import java.math.BigInteger;
import rs.C_h;

public class C_e extends rs.C_a {
   public static boolean f = false;
   private static final BigInteger o = new BigInteger(
      "123170234790352841533577494407893223569302106554965186549402391077147181466197671542829166332684626271320491745377079903632972493287208295934209630330171676570669957737571832140453287345512507359611793323427155597542898117089254383474063942936848736827745480785742742903200182056548823040146163971138329485819"
   );
   private static final BigInteger p = new BigInteger("65537");
   public byte[] g;
   public int h;
   public int i;
   public int j;
   public static final int[] k = new int[]{
      0,
      1,
      3,
      7,
      15,
      31,
      63,
      127,
      255,
      511,
      1023,
      2047,
      4095,
      8191,
      16383,
      32767,
      65535,
      131071,
      262143,
      524287,
      1048575,
      2097151,
      4194303,
      8388607,
      16777215,
      33554431,
      67108863,
      134217727,
      268435455,
      536870911,
      1073741823,
      Integer.MAX_VALUE,
      -1
   };
   public rs.p_q.C_a l;
   public static int m;
   public static final C_h n = new C_h();

   public static C_e c() {
      synchronized (n) {
         C_e var1 = null;
         if (m > 0) {
            m--;
            var1 = (C_e)n.a();
         }

         if (var1 != null) {
            var1.h = 0;
            return var1;
         }
      }

      C_e var4 = new C_e();
      var4.h = 0;
      var4.g = new byte[rs.p_f.C_a.bt];
      return var4;
   }

   public C_e() {
   }

   public int d() {
      short var1 = 0;

      int var2;
      for (var2 = this.e(); var2 == 32767; var2 = this.e()) {
         var1 += 32767;
      }

      return var1 + var2;
   }

   public int e() {
      int var1 = this.g[this.h] & 255;
      return var1 < 128 ? this.y() : this.o() - 32768;
   }

   public int f() {
      int var1 = this.g[this.h] & 255;
      return var1 < 128 ? this.y() : this.A() - 32768;
   }

   public int g() {
      this.h += 3;
      return ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
   }

   public byte[] a(byte[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = this.g[this.h++];
      }

      return var1;
   }

   public C_e(byte[] var1) {
      this.g = var1;
      this.h = 0;
   }

   public void b(byte[] var1) {
      this.g = var1;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.l = null;
   }

   public void a(int var1) {
      this.g[this.h++] = (byte)(var1 + this.l.a());
   }

   public void b(int var1) {
      this.g[this.h++] = (byte)var1;
   }

   public int h() {
      return this.h;
   }

   public void i() {
      this.h = 0;
   }

   public final int c(int var1) {
      this.h += 3;
      return (0xFF & this.g[this.h - 3] << 16) + (0xFF & this.g[this.h - 2] << 8) + (0xFF & this.g[this.h - 1]);
   }

   public int j() {
      return 1795;
   }

   public int k() {
      return -263;
   }

   public int l() {
      this.h += 2;
      return ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
   }

   public int m() {
      this.h += 4;
      return ((this.g[this.h - 4] & 0xFF) << 24) + ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
   }

   public int n() {
      try {
         int var1 = this.g[this.h] & 255;
         return var1 < 128 ? this.y() - 64 : this.A() - 49152;
      } catch (Exception var2) {
         return -1;
      }
   }

   public int o() {
      this.h += 2;
      return ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
   }

   public int p() {
      this.h += 4;
      return ((this.g[this.h - 4] & 0xFF) << 24) + ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
   }

   public int q() {
      this.h += 2;
      int var1 = ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
      if (var1 > 60000) {
         var1 += -65535;
      }

      return var1;
   }

   public int r() {
      this.h += 4;
      return ((this.g[this.h - 4] & 0xFF) << 24) + ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
   }

   public float s() {
      return Float.intBitsToFloat(this.r());
   }

   public int t() {
      int var1 = this.g[this.h] & 255;
      return var1 < 128 ? this.y() - 64 : this.o() - 49152;
   }

   public int u() {
      this.h += 2;
      int var1 = ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int v() {
      short var1 = 0;
      int var2 = 0;

      while ((var2 = this.f()) == 32767) {
         var1 += 32767;
      }

      return var1 + var2;
   }

   public String w() {
      int var1 = this.h;

      while (this.g[this.h++] != 0) {
      }

      return new String(this.g, var1, this.h - var1 - 1);
   }

   public int x() {
      this.h += 2;
      int var1 = ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
      if (var1 > 60000) {
         var1 += -65535;
      }

      return var1;
   }

   public void d(int var1) {
      this.g[this.h++] = (byte)(var1 >> 8);
      this.g[this.h++] = (byte)var1;
   }

   public void e(int var1) {
      this.g[this.h++] = (byte)var1;
      this.g[this.h++] = (byte)(var1 >> 8);
   }

   public void f(int var1) {
      this.g[this.h++] = (byte)(var1 >> 16);
      this.g[this.h++] = (byte)(var1 >> 8);
      this.g[this.h++] = (byte)var1;
   }

   public void g(int var1) {
      if (var1 == 42333) {
         var1 = 95233;
      }

      this.g[this.h++] = (byte)(var1 >> 24);
      this.g[this.h++] = (byte)(var1 >> 16);
      this.g[this.h++] = (byte)(var1 >> 8);
      this.g[this.h++] = (byte)var1;
   }

   public void h(int var1) {
      this.g[this.h++] = (byte)var1;
      this.g[this.h++] = (byte)(var1 >> 8);
      this.g[this.h++] = (byte)(var1 >> 16);
      this.g[this.h++] = (byte)(var1 >> 24);
   }

   public void a(long var1) {
      try {
         this.g[this.h++] = (byte)((int)(var1 >> 56));
         this.g[this.h++] = (byte)((int)(var1 >> 48));
         this.g[this.h++] = (byte)((int)(var1 >> 40));
         this.g[this.h++] = (byte)((int)(var1 >> 32));
         this.g[this.h++] = (byte)((int)(var1 >> 24));
         this.g[this.h++] = (byte)((int)(var1 >> 16));
         this.g[this.h++] = (byte)((int)(var1 >> 8));
         this.g[this.h++] = (byte)((int)var1);
      } catch (RuntimeException var4) {
         rs.p_v.C_a.e("14395, 5, " + var1 + ", " + var4.toString());
         throw new RuntimeException();
      }
   }

   public void a(String var1) {
      System.arraycopy(var1.getBytes(), 0, this.g, this.h, var1.length());
      this.h = this.h + var1.length();
      this.g[this.h++] = 10;
   }

   public void a(byte[] var1, int var2, int var3) {
      for (int var4 = var3; var4 < var3 + var2; var4++) {
         this.g[this.h++] = var1[var4];
      }
   }

   public void i(int var1) {
      this.g[this.h++] = (byte)var1;
   }

   public void j(int var1) {
      this.g[this.h - var1 - 1] = (byte)var1;
   }

   public int y() {
      return this.g[this.h++] & 0xFF;
   }

   public byte z() {
      return this.g[this.h++];
   }

   public int A() {
      try {
         this.h += 2;
         return ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
      } catch (Exception var2) {
         return this.j();
      }
   }

   public int B() {
      this.h += 2;
      int var1 = ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int C() {
      this.h += 3;
      return ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
   }

   public int D() {
      this.h += 4;
      return ((this.g[this.h - 4] & 0xFF) << 24) + ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
   }

   public long E() {
      long var1 = (long)this.D() & 4294967295L;
      long var3 = (long)this.D() & 4294967295L;
      return (var1 << 32) + var3;
   }

   public String F() {
      int var1 = this.h;

      while (this.g[this.h++] != 10) {
      }

      return new String(this.g, var1, this.h - var1 - 1);
   }

   public void G() {
      int var1 = this.h;

      while (this.g[this.h++] != 10) {
      }
   }

   public byte[] H() {
      int var1 = this.h;

      while (this.g[this.h++] != 10) {
      }

      byte[] var2 = new byte[this.h - var1 - 1];
      System.arraycopy(this.g, var1, var2, var1 - var1, this.h - 1 - var1);
      return var2;
   }

   public void I() {
      int var1 = this.h;

      while (this.g[this.h++] != 10) {
      }
   }

   public void a(int var1, int var2, byte[] var3) {
      for (int var4 = var2; var4 < var2 + var1; var4++) {
         var3[var4] = this.g[this.h++];
      }
   }

   public void J() {
      this.i = this.h * 8;
   }

   public int k(int var1) {
      if (f) {
         System.out.println(this.g.length);
      }

      int var2 = this.i >> 3;
      int var3 = 8 - (this.i & 7);
      int var4 = 0;

      for (this.i += var1; var1 > var3; var3 = 8) {
         var4 += (this.g[var2++] & k[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 == var3) {
         var4 += this.g[var2] & k[var3];
      } else {
         var4 += this.g[var2] >> var3 - var1 & k[var1];
      }

      return var4;
   }

   public void K() {
      this.h = (this.i + 7) / 8;
   }

   public int L() {
      try {
         int var1 = this.g[this.h] & 255;
         return var1 < 128 ? this.y() - 64 : this.A() - 49152;
      } catch (Exception var2) {
         return -1;
      }
   }

   public void M() {
      int var1 = this.h;
      this.h = 0;
      byte[] var2 = new byte[var1];
      this.a(var1, 0, var2);
      BigInteger var3 = new BigInteger(var2);
      byte[] var5 = var3.toByteArray();
      this.h = 0;
      this.b(var5.length);
      this.a(var5, var5.length, 0);
   }

   public void l(int var1) {
      this.g[this.h++] = (byte)(-var1);
   }

   public void m(int var1) {
      this.g[this.h++] = (byte)(128 - var1);
   }

   public int N() {
      return this.g[this.h++] - 128 & 0xFF;
   }

   public int O() {
      return -this.g[this.h++] & 0xFF;
   }

   public int P() {
      return 128 - this.g[this.h++] & 0xFF;
   }

   public byte Q() {
      return (byte)(-this.g[this.h++]);
   }

   public byte R() {
      return (byte)(128 - this.g[this.h++]);
   }

   public void n(int var1) {
      this.g[this.h++] = (byte)var1;
      this.g[this.h++] = (byte)(var1 >> 8);
   }

   public void o(int var1) {
      this.g[this.h++] = (byte)(var1 >> 8);
      this.g[this.h++] = (byte)(var1 + 128);
   }

   public void p(int var1) {
      this.g[this.h++] = (byte)(var1 + 128);
      this.g[this.h++] = (byte)(var1 >> 8);
   }

   public int S() {
      this.h += 2;
      return ((this.g[this.h - 1] & 0xFF) << 8) + (this.g[this.h - 2] & 0xFF);
   }

   public int T() {
      this.h += 2;
      return ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] - 128 & 0xFF);
   }

   public int U() {
      this.h += 2;
      return ((this.g[this.h - 1] & 0xFF) << 8) + (this.g[this.h - 2] - 128 & 0xFF);
   }

   public int V() {
      this.h += 2;
      int var1 = ((this.g[this.h - 1] & 255) << 8) + (this.g[this.h - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int W() {
      this.h += 2;
      int var1 = ((this.g[this.h - 1] & 255) << 8) + (this.g[this.h - 2] - 128 & 0xFF);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int X() {
      this.h += 4;
      return ((this.g[this.h - 2] & 0xFF) << 24) + ((this.g[this.h - 1] & 0xFF) << 16) + ((this.g[this.h - 4] & 0xFF) << 8) + (this.g[this.h - 3] & 0xFF);
   }

   public int Y() {
      this.h += 4;
      return ((this.g[this.h - 3] & 0xFF) << 24) + ((this.g[this.h - 4] & 0xFF) << 16) + ((this.g[this.h - 1] & 0xFF) << 8) + (this.g[this.h - 2] & 0xFF);
   }

   public void a(int var1, byte[] var2, int var3) {
      for (int var4 = var1 + var3 - 1; var4 >= var1; var4--) {
         this.g[this.h++] = (byte)(var2[var4] + 128);
      }
   }

   public void b(int var1, int var2, byte[] var3) {
      for (int var4 = var2 + var1 - 1; var4 >= var2; var4--) {
         var3[var4] = this.g[this.h++];
      }
   }

   public final void b(byte[] var1, int var2, int var3) {
      for (int var4 = var2; var4 < var3 + var2; var4++) {
         var1[var4] = this.g[this.h++];
      }
   }

   public int Z() {
      return this.h;
   }

   public int aa() {
      return this.h;
   }

   public int ab() {
      return this.j;
   }

   public byte[] ac() {
      return this.g;
   }
}
