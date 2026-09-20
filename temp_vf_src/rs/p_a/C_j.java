package rs.p_a;

import rs.C_Client_mc;
import rs.p_d.C_x;
import rs.p_l.C_F_uc;

public final class C_j extends C_c {
   public boolean av;
   public int aw;
   public int ax;
   public int ay;
   public short az;
   public int aA = 0;
   public int aB = -1;
   public int aC = 0;
   public int aD = 7;
   public int aE = 7;
   public int aF = -1;
   public rs.p_d.C_d aG;
   public boolean aH;

   public C_h m() {
      if (super.F >= 0 && super.I == 0) {
         if (this.d()[super.F].b()) {
            int var4 = super.G;
            int var5 = -1;
            if (super.w >= 0 && super.w != super.t) {
               if (this.d()[super.w].b()) {
                  var5 = super.x;
               } else {
                  var5 = this.d()[super.w].e[super.x];
               }

               return this.aG.a(var5, var4, this.d()[super.F].i, super.F, super.w);
            } else {
               return this.aG.a(-1, var4, this.d()[super.F].i, super.F, super.w);
            }
         } else {
            int var3 = this.d()[super.F].e[super.G];
            int var2 = -1;
            if (super.w >= 0 && super.w != super.t) {
               var2 = this.d()[super.w].e[super.x];
            }

            return this.aG.a(var2, var3, this.d()[super.F].i, super.F, super.w);
         }
      } else {
         int var1 = -1;
         if (super.w >= 0) {
            if (this.d()[super.w].b()) {
               var1 = super.x;
            } else {
               var1 = this.d()[super.w].e[super.x];
            }
         }

         return this.aG.a(-1, var1, null, super.w);
      }
   }

   public int n() {
      return this.aG == null ? -1 : (int)this.aG.x;
   }

   public String o() {
      return this.aG == null ? "null" : this.aG.o;
   }

   public int p() {
      return -1;
   }

   @Override
   public C_h c() {
      if (this.aG == null) {
         return null;
      } else {
         if (this.aG.x == 1337L) {
            if (this.m < 0) {
               return null;
            }

            if (this.m >= 32768) {
               int var29 = this.m - 32768;
               C_k var31 = C_Client_mc.kw_do[var29];
               if (var29 == C_Client_mc.di) {
                  C_k.aJ = true;

                  C_h var36;
                  try {
                     var36 = C_Client_mc.eR.c();
                     var36.b(90, 90, 90);
                  } finally {
                     C_k.aJ = false;
                  }

                  return var36;
               }

               if (var31 != null) {
                  boolean var35 = false;
                  if (var31.aU) {
                     var35 = true;
                     var31.aU = false;
                  }

                  C_k.aJ = true;

                  C_h var40;
                  try {
                     var40 = var31.c();
                     var40.b(90, 90, 90);
                  } finally {
                     C_k.aJ = false;
                  }

                  if (var35) {
                     var31.aU = true;
                  }

                  return var40;
               }

               return null;
            }
         }

         if (this.aG.x == 1336L || this.aG.x == 1335L || this.aG.x == 1334L || this.aG.x == 8210L) {
            if (this.m < 0) {
               return null;
            }

            if (this.m >= 32768) {
               int var28 = this.m - 32768;
               C_k var30 = C_Client_mc.kw_do[var28];
               if (var28 == C_Client_mc.di) {
                  boolean var34 = rs.p_f.C_a.N;
                  if (!rs.p_f.C_a.N) {
                     rs.p_f.C_a.N = true;
                  }

                  C_k.aJ = true;

                  C_h var39;
                  try {
                     var39 = C_Client_mc.eR.c();
                  } finally {
                     C_k.aJ = false;
                  }

                  rs.p_f.C_a.N = var34;
                  return var39;
               }

               if (var30 != null) {
                  boolean var33 = false;
                  if (var30.aU) {
                     var33 = true;
                     var30.aU = false;
                  }

                  C_k.aJ = true;

                  C_h var38;
                  try {
                     var38 = var30.c();
                  } finally {
                     C_k.aJ = false;
                  }

                  if (var33) {
                     var30.aU = true;
                  }

                  return var38;
               }

               return null;
            }
         }

         C_h var1 = this.m();
         if (var1 == null) {
            return null;
         } else {
            super.r = var1.g;
            if (super.z != -1 && super.A != -1) {
               C_x var2 = C_x.c[super.z];
               C_h var3 = null;
               if (var2.g != null && var2.g.b()) {
                  var3 = var2.c(super.A);
               } else {
                  var3 = var2.a();
               }

               if (var3 != null) {
                  C_h var4 = null;
                  if (!var2.g.b()) {
                     int var5 = var2.g.e[super.A];
                     var4 = new C_h(true, rs.C_k.g(var5), false, var3);
                     var4.a(0, -super.D, 0);
                     var4.n();
                     var4.f(var5, var2.g.r);
                  } else {
                     var4 = var3;
                     var3.a(0, -super.D, 0);
                  }

                  var4.aM = null;
                  var4.aL = null;
                  if (var2.j != 128 || var2.k != 128) {
                     var4.b(var2.j, var2.j, var2.k);
                  }

                  var4.b(64 + var2.m, 850 + var2.n, -30, -50, -30, true);
                  C_h[] var41 = new C_h[]{var1, var4};
                  var1 = new C_h(var41);
                  var1.f();
               }
            }

            if (this.aG.r == 1) {
               var1.aN = true;
            } else {
               var1.aN = false;
            }

            if (this.aG.aa > -1) {
               this.ar = (byte)this.aG.aa;
               this.ap = (byte)this.aG.ac;
               this.aq = (byte)this.aG.ad;
               this.ao = (byte)this.aG.ab;
            }

            if (this.ar > 0) {
               var1.S = this.ar;
               var1.T = this.ap;
               var1.U = this.aq;
               var1.V = this.ar;
            } else {
               var1.V = 0;
            }

            return var1;
         }
      }
   }

   public boolean q() {
      return this.aH && this.m - 32768 != C_Client_mc.di;
   }

   @Override
   public boolean l() {
      return this.aG != null;
   }

   public void a(C_F_uc var1, int var2, int var3) {
      if (!rs.p_l.p_b.C_a.a()) {
         if (this.aB == 0) {
            this.aA = this.aA + this.aD;
            if (this.aA >= 225) {
               this.aB = 1;
            }
         } else if (this.aB == 1) {
            this.aA = this.aA - this.aE;
            if (this.aA <= 0) {
               this.aA = 0;
               this.aC--;
               if (this.aC <= 0) {
                  this.aB = -1;
                  this.aC = 0;
               } else {
                  this.aB = 0;
               }
            }
         }
      }

      var1.g(var2, var3, this.aA);
   }
}
