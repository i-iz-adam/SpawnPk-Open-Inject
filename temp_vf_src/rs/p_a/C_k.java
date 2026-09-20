package rs.p_a;

import rs.C_Client_mc;
import rs.C_F_uc;
import rs.p_d.C_x;
import rs.p_n.p_c.C_w;

public final class C_k extends C_c {
   public static C_k av = new rs.p_l.p_b.p_a.p_a.C_d().n();
   public static int aw = 0;
   public static int ax = 0;
   public int ay;
   public long az;
   public int aA;
   public static C_h aB = null;
   private boolean bA = false;
   public int aC;
   public int aD;
   public int aE;
   public int aF;
   public int aG;
   public int aH;
   public int aI;
   public static boolean aJ = false;
   public static boolean aK = false;
   public static C_F_uc aL = new C_F_uc(260);
   public static C_F_uc aM = new C_F_uc(260);
   public static C_F_uc aN = new C_F_uc(260);
   public static C_F_uc aO = new C_F_uc(260);
   public static C_F_uc aP = new C_F_uc(25);
   public static C_F_uc aQ = new C_F_uc(25);
   public boolean aR;
   public int[] aS;
   private long bB;
   public rs.p_d.C_d aT;
   public boolean aU;
   public final int[] aV;
   public final int[] aW = new int[28];
   public int aX;
   public int aY;
   public String aZ;
   public String ba;
   public int bb;
   public int bc;
   public int bd;
   public int be;
   public int bf;
   public int bg;
   public int bh;
   public int bi;
   public int bj;
   public int bk;
   public int bl;
   public boolean bm;
   public int bn;
   public int bo;
   public int bp;
   public C_h bq;
   public final int[] br;
   public int bs;
   private long bC;
   public int bt;
   public int bu;
   public int bv;
   public int bw;
   public int bx;
   public int by;
   public long bz;

   public C_h b(boolean var1) {
      if (!this.bm) {
         return null;
      } else if (this.q() && !rs.p_f.C_a.N) {
         return null;
      } else if (this.aC == 25 && !rs.p_f.C_a.bp && this.m == -1) {
         return null;
      } else {
         C_h var2 = null;
         var2 = this.c(var1);
         if (var2 == null) {
            return null;
         } else {
            C_h var3 = null;
            if (super.z != -1 && super.A != -1 && var1) {
               C_x var4 = C_x.c[super.z];
               if (var4.g != null && var4.g.b()) {
                  var3 = var4.c(super.A);
               } else {
                  var3 = var4.a();
               }

               boolean var5 = super.z >= 1181 && super.z <= 1183;
               if (super.z == 769 && super.A <= 12) {
                  var5 = true;
               }

               if (var3 != null && var5) {
                  C_h var18 = null;
                  if (!var4.g.b()) {
                     var18 = new C_h(true, rs.C_k.g(super.A), false, var3);
                     var18.a(0, -super.D, 0);
                     var18.n();
                     var18.f(var4.g.e[super.A], var4.g.r);
                  }

                  var18.aM = null;
                  var18.aL = null;
                  if (var4.j != 128 || var4.k != 128) {
                     var18.b(var4.j, var4.j, var4.k);
                  }

                  var18.b(64 + var4.m, 850 + var4.n, -30, -50, -30, true);
                  return var18;
               }
            }

            super.r = var2.g;
            var2.aN = true;
            if (this.aU) {
               return var2;
            } else {
               if (var3 != null) {
                  C_x var12 = C_x.c[super.z];
                  boolean var14 = false;
                  rs.p_a.p_a.C_a var6 = C_h.h;
                  C_h var7 = null;
                  if (!var12.g.b()) {
                     if (u()) {
                        var6 = (rs.p_a.p_a.C_a)C_x.q.a((long)super.z);
                        if (var6 == null) {
                           var6 = new rs.p_a.p_a.C_a(true);
                           var6.e();
                           var14 = true;
                        }
                     }

                     var7 = new C_h(true, rs.C_k.g(super.A), false, var3, var6);
                     var7.i = var6;
                     var7.a(0, -super.D, 0);
                     var7.n();
                     var7.f(var12.g.e[super.A], var12.g.r);
                  } else {
                     var7 = var3;
                     var3.a(0, -super.D, 0);
                  }

                  var7.aM = null;
                  var7.aL = null;
                  if (var12.j != 128 || var12.k != 128) {
                     var7.b(var12.j, var12.j, var12.k);
                  }

                  var7.b(64 + var12.m, 850 + var12.n, -30, -50, -30, true);
                  if (var14) {
                     C_x.q.a(var6, (long)super.z);
                  }

                  C_h[] var8 = new C_h[]{var2, var7};
                  long var9 = this.bC + (long)(1000000 + super.z);
                  var6 = C_h.h;
                  var14 = false;
                  var2 = new C_h(var8, var6);
                  var2.i = var6;
                  var2.f();
               }

               if (this.bq != null) {
                  if (C_Client_mc.ff >= this.bk) {
                     this.bq = null;
                  }

                  if (C_Client_mc.ff >= this.bj && C_Client_mc.ff < this.bk) {
                     C_h var13 = this.bq;
                     var13.a(this.bn - super.ac, this.bo - this.bl, this.bp - super.ad);
                     if (var1) {
                        if (super.s == 512) {
                           var13.o();
                           var13.o();
                           var13.o();
                        } else if (super.s == 1024) {
                           var13.o();
                           var13.o();
                        } else if (super.s == 1536) {
                           var13.o();
                        }
                     }

                     C_h[] var16 = new C_h[]{var2, var13};
                     var2 = new C_h(var16);
                     if (var1) {
                        if (super.s == 512) {
                           var13.o();
                        } else if (super.s == 1024) {
                           var13.o();
                           var13.o();
                        } else if (super.s == 1536) {
                           var13.o();
                           var13.o();
                           var13.o();
                        }
                     }

                     var13.a(super.ac - this.bn, this.bl - this.bo, super.ad - this.bp);
                  }
               }

               if (this.ar > 0) {
                  var2.S = this.ar;
                  var2.T = this.ap;
                  var2.U = this.aq;
                  var2.V = this.ar;
               } else {
                  var2.V = 0;
               }

               var2.aN = true;
               return var2;
            }
         }
      }
   }

   @Override
   public C_h c() {
      return this.b(true);
   }

   public static C_h a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      return a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
   }

   public static C_h a(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
   ) {
      int[] var14 = new int[]{var4, var11, var10, var0, var13, var1, var2, var3, var8, var5, var9, var7, var6};
      byte var15 = -1;
      byte var16 = -1;
      Object var17 = null;
      boolean var18 = false;

      for (int var19 = 0; var19 < 13; var19++) {
         int var20 = var14[var19];
         if (var20 >= 256 && var20 < 512 && !rs.p_d.C_j.b[var20 - 256].c()) {
            var18 = true;
         }

         if (var20 >= 512 && !rs.p_d.C_k.f(var20 - 512).a(var12)) {
            var18 = true;
         }
      }

      if (var18) {
         return null;
      } else {
         C_h[] var26 = new C_h[12];
         int var28 = 0;

         for (int var21 = 0; var21 < 13; var21++) {
            int var22 = var14[var21];
            if (var16 >= 0 && var21 == 3) {
               var22 = var16;
            }

            if (var15 >= 0 && var21 == 5) {
               var22 = var15;
            }

            if (var22 >= 256 && var22 < 512) {
               C_h var23 = rs.p_d.C_j.b[var22 - 256].b();
               if (var23 != null) {
                  var26[var28++] = var23;
               } else {
                  var18 = true;
               }
            }

            if (var22 >= 512) {
               rs.p_d.C_k var29 = rs.p_d.C_k.f(var22 - 512);
               C_h var24 = var29.d(var12);
               if (var24 != null) {
                  if (b(var22 - 512)) {
                     int[] var25 = C_w.bJ;
                     var24.ar = b(var25[4], var25[0], var25[2], var25[1], var25[3], var25[5]);
                  }

                  var26[var28++] = var24;
               } else {
                  var18 = true;
               }
            }
         }

         if (var18) {
            var26 = null;
            return null;
         } else {
            return new C_h(var28, var26);
         }
      }
   }

   public static boolean b(int var0) {
      return var0 == 23063 || var0 == 21963 || var0 == 21964;
   }

   public void a(rs.p_x.C_e var1) {
      var1.h = 0;
      this.aY = var1.y();
      this.bd = var1.y();
      this.bf = var1.y();
      this.bg = var1.y();
      this.bh = var1.y();
      this.aC = var1.B();
      if (rs.p_f.C_a.d) {
         C_Client_mc.cx
            .add(
               "\t\t---> gender="
                  + this.aY
                  + ",headIcon="
                  + this.bd
                  + ",skullIcon="
                  + this.bf
                  + ",orbIcon="
                  + this.bg
                  + ",miscIcon="
                  + this.bh
                  + ",privilege="
                  + this.aC
            );
      }

      this.aT = null;
      this.aX = 0;

      for (int var2 = 0; var2 < 12; var2++) {
         int var3 = var1.y();
         if (var3 == 0) {
            this.br[var2] = 0;
         } else {
            int var4 = var1.y();
            this.br[var2] = (var3 << 8) + var4;
            if (var2 == 0 && this.br[0] == 65535) {
               this.ay = var1.A();
               this.aT = rs.p_d.C_d.c(this.ay);
               break;
            }

            if (this.br[var2] >= 512 && this.br[var2] - 512 < rs.p_d.C_k.ad) {
               int var5 = rs.p_d.C_k.f(this.br[var2] - 512).ac;
               if (var5 != 0) {
                  this.aX = var5;
               }
            }
         }
      }

      int var11 = var1.y();
      if (var11 == 1) {
         this.bs = var1.A();
      } else {
         this.bs = -1;
      }

      if (rs.p_f.C_a.d) {
         C_Client_mc.cx.add("\t\t---> cosmetic=" + var11);
      }

      for (int var12 = 0; var12 < 5; var12++) {
         int var14 = var1.y();
         if (var14 < 0 || var14 >= C_Client_mc.dU[var12].length) {
            var14 = 0;
         }

         this.aV[var12] = var14;
      }

      int var13 = -1;
      if (this.br != null && this.br.length > 3) {
         var13 = this.br[3] - 512;
      }

      super.t = var1.A();
      if (super.t == 65535) {
         super.t = -1;
      }

      if (rs.p_f.C_a.aj && super.t == 7047) {
         super.t = 7053;
      }

      if (!rs.p_f.C_a.aj && super.t == 7518) {
         super.t = 1662;
      }

      if (!rs.p_f.C_a.aj && super.t == 808 && (var13 == 4151 || var13 == 25000 || var13 == 20523 || var13 == 20689)) {
         super.t = 11973;
      }

      super.u = var1.A();
      if (super.u == 65535) {
         super.u = -1;
      }

      if (rs.p_f.C_a.aj && super.u == 7044) {
         super.u = 7044;
      }

      super.ag = var1.A();
      if (super.ag == 65535) {
         super.ag = -1;
      }

      if (rs.p_f.C_a.aj && super.ag == 7046) {
         super.ag = 7052;
      }

      if (!rs.p_f.C_a.aj && super.ag == 7520) {
         super.ag = 1663;
      }

      if (!rs.p_f.C_a.aj && super.ag == 1422) {
         super.ag = 819;
      }

      super.ah = var1.A();
      if (super.ah == 65535) {
         super.ah = -1;
      }

      super.ai = var1.A();
      if (super.ai == 65535) {
         super.ai = -1;
      }

      super.aj = var1.A();
      if (super.aj == 65535) {
         super.aj = -1;
      }

      super.p = var1.A();
      if (super.p == 65535) {
         super.p = -1;
      }

      if (rs.p_f.C_a.aj && super.p == 7039) {
         super.p = 7043;
      }

      if (!rs.p_f.C_a.aj && super.p == 7519) {
         super.p = 1664;
      }

      if (!rs.p_f.C_a.aj && super.p == 15523) {
         super.p = 1210;
      }

      if (this.aT != null && this.ay > 0) {
         super.t = this.aT.w;
         super.u = this.aT.w;
         super.ag = this.aT.q;
         super.p = this.aT.q;
         super.ah = this.aT.l;
         super.ai = this.aT.j;
         super.aj = this.aT.B;
      }

      this.bb = var1.y();
      if (this.bb != 0) {
         this.ba = var1.F();
      }

      this.aZ = var1.F();
      if (rs.p_f.C_a.d) {
         C_Client_mc.cx.add("\t\t---> name=" + this.aZ);
      }

      this.bc = var1.y();
      this.by = var1.A();
      if (this.by > 0) {
         this.bz = System.currentTimeMillis();
      }

      this.ar = (byte)var1.y();
      if (this.ar > 0) {
         this.ao = (byte)var1.y();
         this.ap = (byte)var1.y();
         this.aq = (byte)var1.y();
      }

      boolean var15 = var1.y() == 1;
      if (rs.p_f.C_a.d) {
         C_Client_mc.cx.add("\t\t---> hasCompColors=" + var15);
      }

      if (var15) {
         int var16 = C_w.a(var1.y(), true);
         int var6 = C_w.a(var1.y(), true);
         int var7 = C_w.a(var1.y(), true);
         int var8 = C_w.a(var1.y(), true);
         int var9 = C_w.a(var1.y(), true);
         int var10 = C_w.a(var1.y(), false);
         if (rs.p_f.C_a.d) {
            C_Client_mc.cx.add("\t\t---> compColors=" + var16 + "," + var6 + "," + var7 + "," + var8 + "," + var9 + "," + var10);
         }

         this.a(var16, var6, var7, var8, var9, var10);
      }

      this.bm = true;
      this.bC = 0L;

      for (int var17 = 0; var17 < 12; var17++) {
         this.bC <<= 4;
         if (this.br[var17] >= 256) {
            if (var17 == 1 && b(this.br[var17] - 512)) {
               this.bC = this.bC + (long)(50000 + this.aH + this.aF + this.aG + this.aE + this.aD + this.aI);
            } else {
               this.bC = this.bC + (long)(this.br[var17] - 256);
            }
         }
      }

      if (this.bs > 0) {
         this.bC = this.bC + (long)(this.bs - 256);
      }

      if (this.br[0] >= 256) {
         this.bC = this.bC + (long)(this.br[0] - 256 >> 4);
      }

      if (this.br[1] >= 256) {
         if (b(this.br[1] - 512)) {
            int var18 = 50000 + this.aH + this.aF + this.aG + this.aE + this.aD + this.aI;
            this.bC += (long)(var18 - 256 >> 8);
         } else {
            this.bC = this.bC + (long)(this.br[1] - 256 >> 8);
         }
      }

      this.aR = false;
      if (this.br[1] - 512 == 19000
         || this.br[1] - 512 == 3789
         || this.br[1] - 512 == 23490
         || this.br[1] - 512 == 23465
         || this.br[1] - 512 == 22123
         || this.br[1] - 512 == 22122
         || this.br[1] - 512 == 21634
         || this.br[1] - 512 == 21633
         || this.br[1] - 512 >= 24151 && this.br[1] - 512 <= 24146) {
         this.aR = true;
      }

      for (int var19 = 0; var19 < 5; var19++) {
         this.bC <<= 3;
         this.bC = this.bC + (long)this.aV[var19];
      }

      this.bC <<= 1;
      this.bC = this.bC + (long)this.aY;
   }

   public rs.p_d.C_a c(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         rs.p_d.C_a var2 = rs.p_d.C_a.a[var1];
         if (super.F > 0 && var2 != null) {
            rs.p_d.C_a var3 = rs.p_d.C_a.a[super.F];
            boolean var4 = !rs.p_f.C_a.aj;
            if (var4 && var3 != null && var3.w && !var2.w && rs.p_d.C_a.c[var1] != null) {
               return rs.p_d.C_a.c[var1];
            }
         }

         return var2;
      }
   }

   public C_h m() {
      return this.c(true);
   }

   public C_h c(boolean var1) {
      int var2 = this.p();
      if (!var1) {
         var2 = 808;
      }

      if (super.F == 7533 && !rs.p_f.C_a.aj) {
         var2 = 808;
      }

      if (super.F == 451) {
         if (!rs.p_f.C_a.aj) {
            super.F = 13039;
         } else {
            super.F = 390;
         }
      }

      if (super.F == 426 && rs.p_f.C_a.aj) {
         super.F = 15409;
      }

      if (super.F == 10961 && rs.p_f.C_a.aj) {
         super.F = 7514;
      }

      if (super.F == 7516 && !rs.p_f.C_a.aj) {
         super.F = 13055;
      }

      if (super.F == 7517 && !rs.p_f.C_a.aj) {
         super.F = 13054;
      }

      if (super.F == 2067 && !rs.p_f.C_a.aj) {
         super.F = 2066;
      }

      if ((super.F == 6381 || super.F == 7074) && rs.p_f.C_a.aj) {
         super.F = 7061;
      }

      if (super.F == 7042 && rs.p_f.C_a.aj) {
         super.F = 7055;
      }

      if (super.F == 7049 && rs.p_f.C_a.aj) {
         super.F = 7045;
      }

      if (super.F == 7041 && rs.p_f.C_a.aj) {
         super.F = 7054;
      }

      if (super.F == 7048 && rs.p_f.C_a.aj) {
         super.F = 7045;
      }

      if (super.F == 13051 && rs.p_f.C_a.aj) {
         super.F = 7056;
      }

      if (super.F == 8145 && !rs.p_f.C_a.aj) {
         super.F = 13049;
      }

      rs.p_d.C_a var3 = this.c(var2);
      if (var1) {
         if (super.x < 0) {
            super.x = 0;
         }

         if (var3 != null && !var3.b() && super.x >= var3.e.length) {
            super.x = var3.e.length - 1;
         }
      }

      int var4 = super.x;
      if (var4 < 0) {
         var4 = 0;
      }

      if (var3 != null && var4 >= var3.e.length) {
         var4 = var3.e.length - 1;
      }

      if (this.aT != null) {
         int var25 = -1;
         if (super.F >= 0 && super.I == 0) {
            if (rs.p_d.C_a.a[super.F].b()) {
               var25 = super.G;
            } else {
               var25 = rs.p_d.C_a.a[super.F].e[super.G];
            }
         } else if (var2 >= 0) {
            if (rs.p_d.C_a.a[var2].b()) {
               var25 = var4;
            } else {
               var25 = rs.p_d.C_a.a[var2].e[var4];
            }
         }

         return this.aT.a(-1, var25, null, super.F >= 0 && super.I == 0 ? super.F : var2);
      } else {
         long var5 = this.bC;
         int var7 = -1;
         int var8 = -1;
         int var9 = -1;
         int var10 = -1;
         int var11 = rs.p_f.C_a.bb ? this.bs : 0;
         if (super.F >= 0 && super.I == 0 && var1) {
            rs.p_d.C_a var12 = rs.p_d.C_a.a[super.F];
            var7 = var12.e[super.G];
            if (var3 != null && var2 != super.t) {
               var8 = var3.e[var4];
            }

            if (var12.l >= 0) {
               var9 = var12.l;
               var5 += (long)(var9 - this.br[5] << 40);
            }

            if (var12.m >= 0) {
               var10 = var12.m;
               var5 += (long)(var10 - this.br[3] << 48);
            } else if (this.br[3] == 28560) {
               var10 = 28561;
               var5 += (long)(var10 - this.br[3] << 48);
            }
         } else {
            if (var3 != null) {
               var7 = var3.e[var4];
            }

            if (var2 != this.t && this.br[3] == 28560) {
               var10 = 28561;
               var5 += (long)(var10 - this.br[3] << 48);
            }
         }

         C_h var26 = null;
         var26 = (C_h)r().a(var5);
         short var13 = 512;
         if (var26 == null || this.i) {
            boolean var14 = false;

            for (int var15 = 0; var15 < 12; var15++) {
               int var16 = this.br[var15];
               if (var10 >= 0 && var15 == 3) {
                  var16 = var10;
               }

               if (var9 >= 0 && var15 == 5) {
                  var16 = var9;
               }

               if (var16 >= 256 && var16 < 512 && !rs.p_d.C_j.b[var16 - 256].a()) {
                  var14 = true;
               }

               if (var16 >= 512 && !rs.p_d.C_k.f(var16 - 512).c(this.aY)) {
                  var14 = true;
               }
            }

            if (var11 > 0 && !rs.p_d.C_k.f(var11).c(this.aY)) {
               var14 = true;
            }

            if (var11 == 28760 && !rs.p_d.C_k.f(28758).c(this.aY)) {
               var14 = true;
            }

            if (var14) {
               if (this.bB != -1L) {
                  var26 = (C_h)r().a(this.bB);
               }

               if (var26 == null) {
                  return null;
               }
            }
         }

         if (var26 == null || this.i) {
            if (!rs.p_f.C_a.J) {
               return null;
            }

            boolean var28 = this.i;
            boolean var31 = false;
            C_h[] var32 = new C_h[var11 > 0 ? 14 : 12];
            int var17 = 0;
            C_h.bF = false;
            C_h.e(true);

            for (int var18 = 0; var18 < 12; var18++) {
               int var19 = this.br[var18];
               if (var10 >= 0 && var18 == 3) {
                  var19 = var10;
               }

               if (var9 >= 0 && var18 == 5) {
                  var19 = var9;
               }

               if (var19 >= 256 && var19 < 512) {
                  C_h.bG = var18;
                  C_h var20 = rs.p_d.C_j.b[var19 - 256].b();
                  if (var20 != null) {
                     if (C_Client_mc.dU[4][this.aV[4]] != 10 && C_Client_mc.dU[4][this.aV[4]] != 491769) {
                        for (int[] var24 : C_Client_mc.dV) {
                           if (C_Client_mc.dU[4][this.aV[4]] == var24[0]) {
                              var20.e(4550, var24[1]);
                           }
                        }
                     } else {
                        var20.b(new int[]{4550}, -50);
                     }

                     var32[var17++] = var20;
                  }
               }

               if (var19 >= 512) {
                  C_h.bG = var18;
                  C_h var35 = rs.p_d.C_k.f(var19 - 512).d(this.aY);
                  if (var35 != null) {
                     if ((var18 == 0 || var18 == 4 || var18 == 7 || var18 == 9 || var18 == 10) && !rs.p_d.C_k.a(null, var19 - 512)) {
                        if (C_Client_mc.dU[4][this.aV[4]] != 10 && C_Client_mc.dU[4][this.aV[4]] != 491769) {
                           for (int[] var42 : C_Client_mc.dV) {
                              if (C_Client_mc.dU[4][this.aV[4]] == var42[0]) {
                                 var35.e(4550, var42[1]);
                              }
                           }
                        } else {
                           var35.b(new int[]{4550}, -50);
                        }
                     }

                     if (b(var19 - 512)) {
                        var28 = true;
                        var35.ar = this.aS;
                        var35.I = this.aI;
                     }

                     var32[var17++] = var35;
                  }
               }

               if (var18 == 1 && var11 > 0) {
                  C_h.bG = var18;
                  C_h var36 = rs.p_d.C_k.f(var11).d(this.aY);
                  if (var36 != null) {
                     var32[var17++] = var36;
                  }

                  if (var11 == 28760) {
                     C_h var39 = rs.p_d.C_k.f(28758).d(this.aY);
                     if (var39 != null) {
                        var32[var17++] = var39;
                     }
                  }
               }
            }

            rs.p_a.p_a.C_a var33 = C_h.h;
            boolean var34 = false;
            C_h.bG = -1;
            C_h.e(false);
            var26 = new C_h(var17, var32, var33);

            for (int var37 = 0; var37 < 5; var37++) {
               if (this.aV[var37] != 0) {
                  var26.i(C_Client_mc.dU[var37][0], C_Client_mc.dU[var37][this.aV[var37]]);
                  if (var37 == 4) {
                     var26.i(C_Client_mc.aZ[0], C_Client_mc.dU[var37][this.aV[var37]]);
                  }

                  if (var37 == 1) {
                     var26.i(C_Client_mc.fz[0], C_Client_mc.fz[this.aV[var37]]);
                  }
               }
            }

            var26.n();
            if (rs.p_f.C_a.aQ) {
               var26.b(84, 1000, -90, -580, -90, true);
            } else {
               var26.b(64, 850, -30, -50, -30, true);
            }

            if (!rs.p_l.p_b.p_a.C_d.c) {
               r().a(var26, var5);
            }

            this.bB = var5;
         }

         if (!this.aU && !aK) {
            C_h var30 = C_h.ac;
            var30.a(var26, rs.C_k.g(var7) & rs.C_k.g(var8));
            if (var7 != -1 && var8 != -1 && var1) {
               var30.a(rs.p_d.C_a.a[super.F].i, var8, var7, super.F);
            } else if (var7 != -1) {
               var30.f(var7, super.F >= 0 && super.I == 0 && var1 ? super.F : var2);
            }

            var30.k();
            var30.aM = null;
            var30.aL = null;
            return var30;
         } else {
            return var26;
         }
      }
   }

   @Override
   public boolean l() {
      return this.bm;
   }

   public C_h n() {
      if (!this.bm) {
         return null;
      } else if (this.q() && !rs.p_f.C_a.N) {
         return null;
      } else if (this.aT != null) {
         return this.aT.b();
      } else {
         boolean var1 = false;

         for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.br[var2];
            if (var3 >= 256 && var3 < 512 && !rs.p_d.C_j.b[var3 - 256].c()) {
               var1 = true;
            }

            if (var3 >= 512 && !rs.p_d.C_k.f(var3 - 512).a(this.aY)) {
               var1 = true;
            }
         }

         if (this.bs > 0 && !rs.p_d.C_k.f(this.bs).a(this.aY)) {
            var1 = true;
         }

         if (var1) {
            return null;
         } else {
            C_h[] var11 = new C_h[this.bs > 0 ? 13 : 12];
            int var12 = 0;

            for (int var4 = 0; var4 < 12; var4++) {
               int var5 = this.br[var4];
               if (var5 >= 256 && var5 < 512) {
                  C_h var6 = rs.p_d.C_j.b[var5 - 256].d();
                  if (var6 != null) {
                     for (int[] var10 : C_Client_mc.dV) {
                        if (C_Client_mc.dU[4][this.aV[4]] == 10 || C_Client_mc.dU[4][this.aV[4]] == 491769) {
                           var6.b(new int[]{4550}, -50);
                        } else if (C_Client_mc.dU[4][this.aV[4]] == var10[0]) {
                           var6.e(4550, var10[1]);
                        }
                     }

                     var11[var12++] = var6;
                  }
               }

               if (var5 >= 512) {
                  C_h var15 = rs.p_d.C_k.f(var5 - 512).b(this.aY);
                  if (var15 != null) {
                     var11[var12++] = var15;
                  }
               }

               if (var4 == 1 && this.bs > 0) {
                  C_h var16 = rs.p_d.C_k.f(this.bs).b(this.aY);
                  if (var16 != null) {
                     var11[var12++] = var16;
                  }
               }
            }

            C_h var13 = new C_h(var12, var11);

            for (int var14 = 0; var14 < 5; var14++) {
               if (this.aV[var14] != 0) {
                  var13.i(C_Client_mc.dU[var14][0], C_Client_mc.dU[var14][this.aV[var14]]);
                  if (var14 == 1) {
                     var13.i(C_Client_mc.fz[0], C_Client_mc.fz[this.aV[var14]]);
                  }
               }
            }

            return var13;
         }
      }
   }

   public C_k() {
      this.bB = -1L;
      this.aU = false;
      this.aV = new int[5];
      this.bm = false;
      this.br = new int[12];
   }

   public String o() {
      return this.d(false);
   }

   public String d(boolean var1) {
      return this.a(var1, null);
   }

   public String a(boolean var1, String var2) {
      String var3 = this.aZ;
      String var4 = var1 ? "@bla@" : "@whi@";
      if (this.bb > 0) {
         if (this.bb == 1) {
            return "@red@" + this.ba + (var2 == null ? var4 : var2) + " " + var3;
         } else {
            return var2 != null ? var2 + var3 + " @red@" + this.ba + var4 : var3 + " @red@" + this.ba + var4;
         }
      } else {
         return var2 != null ? var2 + this.aZ : this.aZ;
      }
   }

   public String a(boolean var1, String var2, String var3) {
      String var4 = this.aZ;
      String var5 = var1 ? "@bla@" : "@whi@";
      if (this.bb > 0) {
         if (var3 != null) {
            var5 = var5 + var3;
         }

         return this.bb == 1 ? "@red@" + this.ba + var5 + " " + var4 : var4 + " @red@" + this.ba + var5;
      } else {
         return var3 != null ? var3 + this.aZ : this.aZ;
      }
   }

   public int p() {
      int var1 = super.w;
      int var2 = -1;
      if (this.br != null && this.br.length > 3) {
         var2 = this.br[3] - 512;
      }

      if (var1 == 244
         && (var2 == 21584 || var2 == 21585 || var2 == 21602 || var2 == 23908 || var2 == 24250 || var2 == 25555 || var2 == 25556 || var2 == 28187)
         && !rs.p_f.C_a.aj) {
         var1 = 808;
      }

      if (var1 == 247
         && (var2 == 21584 || var2 == 21585 || var2 == 21602 || var2 == 23908 || var2 == 24250 || var2 == 25555 || var2 == 25556 || var2 == 28187)
         && !rs.p_f.C_a.aj) {
         var1 = 819;
      }

      if (var1 == 7220 && !rs.p_f.C_a.aj) {
         var1 = 2074;
      }

      if (var1 == 7221 && !rs.p_f.C_a.aj) {
         var1 = 2077;
      }

      if (var1 == 7223 && !rs.p_f.C_a.aj) {
         var1 = 2076;
      }

      if ((var1 == 7518 || var1 == 15512) && !rs.p_f.C_a.aj) {
         var1 = 1662;
      }

      if ((var1 == 7520 || var1 == 15513) && !rs.p_f.C_a.aj) {
         var1 = 1663;
      }

      if ((var1 == 7519 || var1 == 15514) && !rs.p_f.C_a.aj) {
         var1 = 1664;
      }

      if (var1 == 808 && (var2 == 4151 || var2 == 25000 || var2 == 20523 || var2 == 20689) && !rs.p_f.C_a.aj) {
         var1 = 11973;
      }

      if (var1 == 2561 && !rs.p_f.C_a.aj) {
         var1 = 7047;
      }

      if (var1 == 824 && var2 == 4718 && !rs.p_f.C_a.aj) {
         var1 = 1664;
      }

      if (var1 == 809 && !rs.p_f.C_a.aj) {
         var1 = 813;
      }

      if (var1 == 1659 && !rs.p_f.C_a.aj) {
         var1 = 11974;
      }

      return var1;
   }

   public boolean q() {
      return C_Client_mc.eR != null ? this == C_Client_mc.eR : false;
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aD = var1;
      this.aE = var2;
      this.aF = var3;
      this.aG = var4;
      this.aH = var5;
      this.aI = var6;
      this.aS = new int[1206];

      for (int var7 = 0; var7 < this.aS.length; var7++) {
         this.aS[var7] = var1;
      }

      int[] var15 = new int[]{
         71,
         73,
         74,
         75,
         76,
         77,
         78,
         84,
         336,
         340,
         341,
         364,
         369,
         370,
         374,
         375,
         495,
         496,
         497,
         498,
         499,
         500,
         530,
         531,
         532,
         533,
         534,
         548,
         549,
         596,
         801,
         802,
         803,
         831,
         832,
         833,
         839,
         840,
         852,
         853,
         854,
         855,
         856,
         857,
         858,
         862,
         863,
         865,
         872,
         873,
         874,
         875,
         876,
         877,
         878,
         879,
         880,
         912,
         913,
         914,
         915,
         916,
         917,
         918,
         919,
         950,
         951,
         952,
         953,
         954,
         955,
         956,
         968,
         969,
         970,
         971,
         972,
         973,
         983,
         986,
         987,
         988
      };
      int[] var8 = new int[]{
         46,
         47,
         48,
         49,
         50,
         67,
         68,
         69,
         70,
         72,
         79,
         80,
         81,
         82,
         83,
         269,
         270,
         273,
         274,
         275,
         276,
         277,
         278,
         279,
         280,
         294,
         295,
         296,
         297,
         298,
         299,
         300,
         301,
         302,
         303,
         304,
         307,
         308,
         339,
         342,
         357,
         358,
         359,
         365,
         366,
         376,
         377,
         378,
         379,
         383,
         409,
         410,
         423,
         424,
         434,
         435,
         436,
         449,
         450,
         451,
         454,
         455,
         462,
         463,
         464,
         465,
         473,
         476,
         477,
         478,
         482,
         483,
         484,
         485,
         486,
         487,
         488,
         492,
         493,
         494,
         501,
         502,
         508,
         509,
         510,
         511,
         526,
         527,
         528,
         529,
         544,
         545,
         546,
         547,
         550,
         551,
         561,
         562,
         563,
         567,
         568,
         569,
         570,
         571,
         572,
         573,
         574,
         575,
         597,
         781,
         799,
         841,
         842,
         843,
         844,
         845,
         846,
         847,
         848,
         849,
         882,
         883,
         884,
         885,
         896,
         897,
         904,
         905,
         908,
         909,
         923,
         924,
         925,
         926,
         927,
         936,
         940,
         941,
         942,
         943,
         957,
         958,
         959,
         977,
         982
      };
      int[] var9 = new int[]{
         111,
         112,
         166,
         167,
         183,
         184,
         217,
         218,
         228,
         240,
         241,
         242,
         243,
         244,
         253,
         254,
         262,
         263,
         287,
         430,
         470,
         471,
         589,
         590,
         815,
         816,
         817,
         818,
         819,
         820,
         859,
         860,
         861,
         864,
         886,
         887,
         888,
         889,
         890,
         891,
         892,
         893,
         894,
         895,
         906,
         907,
         928,
         929,
         930,
         931,
         932,
         933,
         934,
         935,
         944,
         945,
         946,
         947,
         948,
         949,
         960,
         961,
         978,
         989,
         318,
         319,
         386,
         413,
         619,
         620
      };
      int[] var10 = new int[]{
         113,
         128,
         129,
         144,
         145,
         163,
         164,
         165,
         168,
         169,
         170,
         171,
         176,
         179,
         180,
         181,
         182,
         190,
         191,
         195,
         196,
         199,
         200,
         201,
         202,
         205,
         206,
         210,
         211,
         219,
         220,
         221,
         224,
         225,
         229,
         230,
         238,
         239,
         249,
         250,
         251,
         252,
         255,
         256,
         257,
         260,
         264,
         265,
         284,
         285,
         286,
         288,
         291,
         292,
         293,
         311,
         396,
         428,
         429,
         468,
         469,
         591,
         628,
         629,
         630,
         631,
         632,
         633,
         634,
         635,
         640,
         641,
         642,
         643,
         644,
         645,
         646,
         647,
         648,
         649,
         650,
         651,
         652,
         653,
         654,
         655,
         656,
         661,
         662,
         666,
         667,
         668,
         669,
         670,
         671,
         672,
         673,
         678,
         692,
         693,
         702,
         703,
         721,
         722,
         723,
         724,
         725,
         726,
         727,
         728,
         729,
         730,
         735,
         736,
         737,
         738,
         739,
         740,
         741,
         743,
         744,
         745,
         746,
         749,
         754,
         755,
         758,
         759,
         760,
         761,
         767,
         768,
         769,
         770,
         771,
         772,
         773,
         774,
         775,
         776,
         777,
         778,
         779,
         780,
         1011,
         1036,
         1061
      };

      for (int var14 : var15) {
         this.aS[var14] = var2;
      }

      for (int var25 : var8) {
         this.aS[var25] = var3;
      }

      for (int var26 : var9) {
         this.aS[var26] = var4;
      }

      for (int var27 : var10) {
         this.aS[var27] = var5;
      }
   }

   public static int[] b(int var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[1206];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = var0;
      }

      int[] var15 = new int[]{
         71,
         73,
         74,
         75,
         76,
         77,
         78,
         84,
         336,
         340,
         341,
         364,
         369,
         370,
         374,
         375,
         495,
         496,
         497,
         498,
         499,
         500,
         530,
         531,
         532,
         533,
         534,
         548,
         549,
         596,
         801,
         802,
         803,
         831,
         832,
         833,
         839,
         840,
         852,
         853,
         854,
         855,
         856,
         857,
         858,
         862,
         863,
         865,
         872,
         873,
         874,
         875,
         876,
         877,
         878,
         879,
         880,
         912,
         913,
         914,
         915,
         916,
         917,
         918,
         919,
         950,
         951,
         952,
         953,
         954,
         955,
         956,
         968,
         969,
         970,
         971,
         972,
         973,
         983,
         986,
         987,
         988
      };
      int[] var8 = new int[]{
         46,
         47,
         48,
         49,
         50,
         67,
         68,
         69,
         70,
         72,
         79,
         80,
         81,
         82,
         83,
         269,
         270,
         273,
         274,
         275,
         276,
         277,
         278,
         279,
         280,
         294,
         295,
         296,
         297,
         298,
         299,
         300,
         301,
         302,
         303,
         304,
         307,
         308,
         339,
         342,
         357,
         358,
         359,
         365,
         366,
         376,
         377,
         378,
         379,
         383,
         409,
         410,
         423,
         424,
         434,
         435,
         436,
         449,
         450,
         451,
         454,
         455,
         462,
         463,
         464,
         465,
         473,
         476,
         477,
         478,
         482,
         483,
         484,
         485,
         486,
         487,
         488,
         492,
         493,
         494,
         501,
         502,
         508,
         509,
         510,
         511,
         526,
         527,
         528,
         529,
         544,
         545,
         546,
         547,
         550,
         551,
         561,
         562,
         563,
         567,
         568,
         569,
         570,
         571,
         572,
         573,
         574,
         575,
         597,
         781,
         799,
         841,
         842,
         843,
         844,
         845,
         846,
         847,
         848,
         849,
         882,
         883,
         884,
         885,
         896,
         897,
         904,
         905,
         908,
         909,
         923,
         924,
         925,
         926,
         927,
         936,
         940,
         941,
         942,
         943,
         957,
         958,
         959,
         977,
         982
      };
      int[] var9 = new int[]{
         111,
         112,
         166,
         167,
         183,
         184,
         217,
         218,
         228,
         240,
         241,
         242,
         243,
         244,
         253,
         254,
         262,
         263,
         287,
         430,
         470,
         471,
         589,
         590,
         815,
         816,
         817,
         818,
         819,
         820,
         859,
         860,
         861,
         864,
         886,
         887,
         888,
         889,
         890,
         891,
         892,
         893,
         894,
         895,
         906,
         907,
         928,
         929,
         930,
         931,
         932,
         933,
         934,
         935,
         944,
         945,
         946,
         947,
         948,
         949,
         960,
         961,
         978,
         989,
         318,
         319,
         386,
         413,
         619,
         620
      };
      int[] var10 = new int[]{
         113,
         128,
         129,
         144,
         145,
         163,
         164,
         165,
         168,
         169,
         170,
         171,
         176,
         179,
         180,
         181,
         182,
         190,
         191,
         195,
         196,
         199,
         200,
         201,
         202,
         205,
         206,
         210,
         211,
         219,
         220,
         221,
         224,
         225,
         229,
         230,
         238,
         239,
         249,
         250,
         251,
         252,
         255,
         256,
         257,
         260,
         264,
         265,
         284,
         285,
         286,
         288,
         291,
         292,
         293,
         311,
         396,
         428,
         429,
         468,
         469,
         591,
         628,
         629,
         630,
         631,
         632,
         633,
         634,
         635,
         640,
         641,
         642,
         643,
         644,
         645,
         646,
         647,
         648,
         649,
         650,
         651,
         652,
         653,
         654,
         655,
         656,
         661,
         662,
         666,
         667,
         668,
         669,
         670,
         671,
         672,
         673,
         678,
         692,
         693,
         702,
         703,
         721,
         722,
         723,
         724,
         725,
         726,
         727,
         728,
         729,
         730,
         735,
         736,
         737,
         738,
         739,
         740,
         741,
         743,
         744,
         745,
         746,
         749,
         754,
         755,
         758,
         759,
         760,
         761,
         767,
         768,
         769,
         770,
         771,
         772,
         773,
         774,
         775,
         776,
         777,
         778,
         779,
         780,
         1011,
         1036,
         1061
      };

      for (int var14 : var15) {
         var6[var14] = var1;
      }

      for (int var25 : var8) {
         var6[var25] = var2;
      }

      for (int var26 : var9) {
         var6[var26] = var3;
      }

      for (int var27 : var10) {
         var6[var27] = var4;
      }

      return var6;
   }

   public static C_F_uc r() {
      return !aJ ? aL : aO;
   }

   public static C_F_uc s() {
      return !aJ ? aM : aP;
   }

   public static C_F_uc t() {
      return !aJ ? aN : aQ;
   }

   public static boolean u() {
      return true;
   }

   public static void v() {
      aL.a();
      aM.a();
      aN.a();
      aO.a();
      aP.a();
      aQ.a();
   }
}
