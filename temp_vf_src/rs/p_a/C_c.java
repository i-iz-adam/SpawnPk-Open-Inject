package rs.p_a;

import java.awt.Polygon;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_runelite.p_a.C_p;

public class C_c extends C_a {
   public C_e h;
   public boolean i;
   public final int j = -1;
   public final int[] k = new int[10];
   public final int[] l = new int[10];
   public int m = -1;
   public int n;
   public int o = 32;
   public int p = -1;
   public String q;
   public int r = 200;
   public int s;
   public int t = -1;
   public int u = -1;
   public int v;
   public int w;
   public int x;
   public int y;
   public int z;
   public int A;
   public int B;
   public int C;
   public int D;
   public int E;
   public int F;
   public int G;
   public int H;
   public int I;
   public int J;
   public int K;
   public int L;
   public int M;
   public int N;
   public int O;
   public int P;
   public int Q;
   public int R;
   public int S;
   public boolean T;
   public int U;
   public int V;
   public int W;
   public int X;
   public int Y;
   public int Z;
   public int aa;
   public int ab;
   public int ac;
   public int ad;
   public int ae;
   public final boolean[] af;
   public int ag;
   public int ah;
   public int ai;
   public int aj;
   public int ak;
   public int al;
   public int am;
   public int an;
   public byte ao;
   public byte ap;
   public byte aq;
   public byte ar;
   public int as;
   public int at;
   public int au;

   public final rs.p_d.C_a[] d() {
      if (!(this instanceof C_j)) {
         return rs.p_d.C_a.a;
      } else {
         if (!rs.p_f.C_a.aj) {
            int var1 = (int)((C_j)this).aG.x;
            if (var1 == 212
               || var1 == 1596
               || var1 == 6370
               || var1 == 599
               || var1 == 373
               || var1 == 949
               || var1 == 1917
               || var1 == 6570
               || var1 == 6750
               || var1 == 554
               || var1 == 1699
               || var1 == 7482
               || var1 == 315
               || var1 == 401
               || var1 == 2575) {
               return rs.p_d.C_a.a;
            }
         }

         return rs.p_d.C_a.c;
      }
   }

   public final void a(int var1, int var2, boolean var3) {
      if (this.F != -1 && this.d()[this.F].p == 1) {
         this.F = -1;
      }

      if (!var3) {
         int var4 = var1 - this.k[0];
         int var5 = var2 - this.l[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (this.E < 9) {
               this.E++;
            }

            for (int var6 = this.E; var6 > 0; var6--) {
               this.k[var6] = this.k[var6 - 1];
               this.l[var6] = this.l[var6 - 1];
               this.af[var6] = this.af[var6 - 1];
            }

            this.k[0] = var1;
            this.l[0] = var2;
            this.af[0] = false;
            return;
         }
      }

      this.E = 0;
      this.U = 0;
      this.n = 0;
      this.k[0] = var1;
      this.l[0] = var2;
      this.ac = this.k[0] * 128 + this.S * 64;
      this.ad = this.l[0] * 128 + this.S * 64;
   }

   public final void e() {
      this.E = 0;
      this.U = 0;
   }

   public final void f() {
      this.h.a();
   }

   public final boolean a(int var1, int var2, int var3, int var4) {
      return this.h.a(var1, var2, var3, var4, true);
   }

   public final void a(boolean var1, int var2) {
      int var3 = this.k[0];
      int var4 = this.l[0];
      if (var2 == 0) {
         var3--;
         var4++;
      }

      if (var2 == 1) {
         var4++;
      }

      if (var2 == 2) {
         var3++;
         var4++;
      }

      if (var2 == 3) {
         var3--;
      }

      if (var2 == 4) {
         var3++;
      }

      if (var2 == 5) {
         var3--;
         var4--;
      }

      if (var2 == 6) {
         var4--;
      }

      if (var2 == 7) {
         var3++;
         var4--;
      }

      if (this.F != -1 && this.d()[this.F].p == 1) {
         this.F = -1;
      }

      if (this.E < 9) {
         this.E++;
      }

      for (int var5 = this.E; var5 > 0; var5--) {
         this.k[var5] = this.k[var5 - 1];
         this.l[var5] = this.l[var5 - 1];
         this.af[var5] = this.af[var5 - 1];
      }

      this.k[0] = var3;
      this.l[0] = var4;
      this.af[0] = var1;
   }

   public Polygon a(int var1) {
      return C_Launcher_mc.n().o().a(new rs.p_runelite.p_a.C_f(this.ac, this.ad), var1);
   }

   public C_p g() {
      int var1 = (this.k[0] << 7) + 64;
      int var2 = (this.l[0] << 7) + 64;
      return C_p.a(var1, var2, C_Client_mc.dw);
   }

   public boolean h() {
      if (!(this instanceof C_j)) {
         return false;
      } else {
         C_j var1 = (C_j)this;
         return var1.aG != null && var1.aG.h;
      }
   }

   public boolean i() {
      if (!this.h()) {
         return false;
      } else if (this.m != -1 && this.m < 32768) {
         C_j var1 = C_Launcher_mc.n().o().cA[this.m];
         return var1 != null && var1.aG != null && var1.aG.h;
      } else {
         return false;
      }
   }

   public boolean j() {
      return this.h() && this.m - 32768 == C_Client_mc.di;
   }

   public boolean k() {
      if (!this.i()) {
         return false;
      } else if (this.m != -1 && this.m < 32768) {
         C_j var1 = C_Launcher_mc.n().o().cA[this.m];
         return var1.j();
      } else {
         return false;
      }
   }

   public boolean l() {
      return false;
   }

   C_c() {
      this.h = new C_e();
      this.w = -1;
      this.z = -1;
      this.F = -1;
      this.L = -1000;
      this.O = 100;
      this.S = 1;
      this.T = false;
      this.af = new boolean[10];
      this.ag = -1;
      this.ah = -1;
      this.ai = -1;
      this.aj = -1;
   }

   static class a {
      public int a;
      public int b;
      public int c;
      public int d;

      public a(int var1, int var2, int var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }
   }
}
