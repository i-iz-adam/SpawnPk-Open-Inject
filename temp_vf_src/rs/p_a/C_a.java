package rs.p_a;

import java.awt.Color;
import java.awt.Polygon;
import rs.C_Client_mc;
import rs.C_S_uc;

public class C_a extends rs.C_a {
   public C_S_uc f;
   public int g = 1000;

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.e, this, null);
      if (!rs.p_runelite.p_b.C_a.a().isEmpty()) {
         for (int var11 = 0; var11 < rs.p_runelite.p_b.C_a.a().size(); var11++) {
            if (!rs.p_runelite.p_b.C_a.a().get(var11).draw(this, false)) {
               return;
            }
         }
      }

      if (this instanceof C_k && C_Client_mc.cw == 10806) {
         int var24 = C_Client_mc.eh + (((C_k)this).ac - 6 >> 7);
         int var12 = C_Client_mc.ei + (((C_k)this).ad - 6 >> 7);
      }

      if (!(this instanceof C_k) || rs.p_f.C_a.J) {
         if (this instanceof C_j) {
            if (!rs.p_f.C_a.K) {
               return;
            }

            if (rs.p_f.C_a.aT) {
               C_j var25 = (C_j)this;
               if (C_Client_mc.ed != 197 && var25.aG != null && var25.aG.h && var25.m != -1 && var25.m - 32768 != C_Client_mc.di) {
                  return;
               }
            }

            if (rs.p_f.C_a.aU) {
               int var26 = C_Client_mc.eh + (((C_j)this).ac - 6 >> 7);
               int var29 = C_Client_mc.ei + (((C_j)this).ad - 6 >> 7);
               int var13 = var26 >> 6;
               int var14 = var29 >> 6;
               int var15 = var13 * 256 + var14;
               if (var15 == 10317 || var15 == 10831 || var15 == 7248 || var15 == 9011 || var15 == 8755 || var15 == 9012 || var15 == 8756) {
                  C_j var16 = (C_j)this;
                  if (var16.m != -1 && var16.m - 32768 != C_Client_mc.di) {
                     return;
                  }
               }
            }
         }

         if (this instanceof C_j && ((C_j)this).i) {
            rs.p_d.C_d.a = false;
            rs.p_d.C_d.b = this;
         }

         C_h var27 = this.c();
         rs.p_d.C_d.a = true;
         rs.p_d.C_d.b = null;
         if (this instanceof C_j && ((C_j)this).av) {
            ((C_j)this).i = false;
            ((C_j)this).av = false;
         }

         if (var27 != null) {
            if (this instanceof C_k) {
               rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.g, (Object)this, var27);
            } else if (this instanceof C_j) {
               ((C_j)this).as = var7;
               ((C_j)this).at = var9;
               ((C_j)this).au = var10;
            }

            if (this instanceof C_j) {
               C_j var30 = (C_j)this;
               if (var30.aG.x == 5660L) {
                  Color var35 = new Color(152, 0, 255);
                  Color var39 = Color.MAGENTA;
                  Color var41 = new Color(93, 44, 255, 100);
                  Polygon var43 = var27.b(((C_j)this).ac, ((C_j)this).ad, var7 + C_Client_mc.cK, 0);
                  rs.p_l.p_e.C_j var17 = new rs.p_l.p_e.C_j(this, var43, var35, var39, var9);
                  var17.f = var41;
                  C_Client_mc.ab.c.a(var9, var17);
               }
            }

            this.g = var27.g;
            if (rs.p_f.C_a.az && !rs.p_f.C_a.ah && this instanceof C_j) {
               int var31 = ((C_j)this).aw;
               int var36 = ((C_j)this).ax;
               int var40 = ((C_j)this).ay;
               rs.p_d.C_d var42 = ((C_j)this).aG;
               if (((C_j)this).aG.x == 1335L) {
                  if (var31 == 0) {
                     var31 = 6;
                  } else if (var36 == 0) {
                     var36 = 6;
                  } else {
                     var36 = 6;
                  }
               }

               if (((C_j)this).aG.x == 1334L || ((C_j)this).aG.x == 8210L) {
                  byte var44 = 3;
                  if (var31 == 0) {
                     var31 = var44;
                  } else if (var36 == 0) {
                     var36 = var44;
                  } else {
                     var36 = var44;
                  }
               }

               if (((C_j)this).aG.x == 864L || ((C_j)this).aG.x == 6303L) {
                  if (var31 == 0) {
                     var31 = 50;
                  } else if (var36 == 0) {
                     var36 = 50;
                  } else {
                     var36 = 50;
                  }
               }

               if (((C_j)this).aG.x == 6304L || ((C_j)this).aG.x == 8192L) {
                  if (var31 == 0) {
                     var31 = 5;
                  } else if (var36 == 0) {
                     var36 = 5;
                  } else {
                     var36 = 5;
                  }
               }

               if (((C_j)this).aG.x == 2863L) {
                  if (var31 == 0) {
                     var31 = 9;
                  } else if (var36 == 0) {
                     var36 = 9;
                  } else {
                     var36 = 9;
                  }
               }

               boolean var45 = false;
               if (((C_j)this).aG.x == 7005L && var27.L != null && var27.L.length > 0) {
                  byte var46 = 3;
                  var27.a(239, var46 + 1, (byte)1);
                  var27.a(255, var46 + 1, (byte)1);
                  var27.a(115, var46 + 1, (byte)1);
                  var27.a(72, var46 + 1, (byte)1);
                  var27.a(76, var46 + 1, (byte)1);
                  var27.a(30, var46 + 1, (byte)1);
                  var27.a(32, var46 + 1, (byte)1);
                  var27.a(36, var46 + 1, (byte)1);
                  var27.a(37, var46 + 1, (byte)1);
                  var45 = true;
               }

               if (!var45 && var31 > 0 && var27.L.length >= 1) {
                  int var47 = 1;
                  if (var36 > 0) {
                     var47++;
                  }

                  if (var40 > 0) {
                     var47++;
                  }

                  int[] var18 = new int[var47];
                  var18[0] = rs.p_d.C_d.a(var31);
                  if (var18.length >= 2) {
                     var18[1] = rs.p_d.C_d.a(var36);
                  }

                  if (var18.length >= 3) {
                     var18[2] = rs.p_d.C_d.a(var40);
                  }

                  var27.a(0, var18[0], (byte)1);
                  byte var19 = 15;
                  if (var47 == 1) {
                     var19 = 20;
                  }

                  int var20 = 0;
                  byte var21 = 0;
                  int var22 = var27.L.length;
                  if (var42.x == 4003L) {
                     var19 = 11;
                  }

                  if (var42.x == 2863L) {
                     var19 = 4;
                  }

                  if (var42.x == 862L || var42.x == 2862L) {
                     var19 = 11;
                  }

                  if (var42.x == 6303L) {
                     var19 = 40;
                  }

                  if (var42.x == 751L || var42.x == 752L) {
                     var19 = 5;
                  }

                  if (var42.x == 754L) {
                     var19 = 10;
                  }

                  if (var42.x >= 2012L && var42.x <= 2016L) {
                     var19 = 11;
                     var22 = 400;
                  }

                  if (var42.x == 4437L) {
                     var19 = 5;
                     var21 = 35;
                  }

                  if (var42.x != 1336L && var42.x == 1337L) {
                  }

                  for (byte var23 = var21; var23 < var22; var23 += var19) {
                     if (var27.L.length > var23) {
                        var27.a(var23, var18[var20], (byte)1);
                        if (++var20 >= var18.length) {
                           var20 = 0;
                        }
                     }
                  }
               }
            }

            if (!(this instanceof C_j) || ((C_j)this).aG.x != 1336L && ((C_j)this).aG.x != 1335L && ((C_j)this).aG.x != 8210L && ((C_j)this).aG.x != 1334L) {
               if (this instanceof C_j && ((C_j)this).q()) {
                  var27.K = 200;
                  var27.aI = 1;
                  C_h.H = 1;
               }

               if (this instanceof C_k && ((C_k)this).aR) {
                  var27.a(var1, var2, var3, var4, var5, var6, var7, var8, 0, 0);
                  var27.K = 256;
                  C_h var33 = this.a(true);
                  var33.aD = 62;
                  var33.g = 283;
                  var33.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
               } else {
                  var27.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
                  var27.K = 256;
               }

               C_h.H = -1;
            } else {
               byte var32 = 0;
               if (((C_j)this).aG.x == 1334L) {
                  var32 = -50;
               }

               for (int var37 = 0; var37 < var27.ah; var37++) {
                  if (((C_j)this).aG.x == 1335L || ((C_j)this).aG.x == 1334L || ((C_j)this).aG.x == 8210L) {
                     var27.aq[var37] = 100 - var32;
                  }
               }

               if (((C_j)this).aG.x == 1334L) {
                  var27.aI = 319770;
               }

               if (((C_j)this).aG.x == 8210L) {
                  int var38 = (int)(Math.sin(C_Client_mc.fg) * 33.0) + 33;
                  C_h.H = rs.p_l.C_f.a(255 + 131072 * var38);
               } else {
                  C_h.H = 1;
               }

               var27.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
               C_h.H = -1;
               if (((C_j)this).aG.x == 1334L) {
                  var27.aI = 0;
               }
            }
         } else if (this instanceof C_k) {
            C_h var34 = this.a(true);
            if (var34 != null) {
               var34.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
            }
         }

         Object var28 = null;
      }
   }

   public C_h a(boolean var1) {
      if (!(this instanceof C_k)) {
         return null;
      } else {
         if (var1) {
            C_k.av.z = ((C_k)this).z;
         } else {
            C_k.av.z = -1;
         }

         C_k.av.D = ((C_k)this).D;
         C_k.av.A = ((C_k)this).A;
         C_k.av.aU = ((C_k)this).aU;
         C_k.av.bj = ((C_k)this).bj;
         C_k.av.bk = ((C_k)this).bk;
         C_k.av.bl = ((C_k)this).bl;
         C_k.av.bn = ((C_k)this).bn;
         C_k.av.bo = ((C_k)this).bo;
         C_k.av.bp = ((C_k)this).bp;
         C_k.av.I = ((C_k)this).I;
         C_k.av.x = ((C_k)this).x;
         C_k.av.F = ((C_k)this).F;
         C_k.av.w = ((C_k)this).w;
         C_k.av.s = ((C_k)this).s;
         C_k.av.ac = ((C_k)this).ac;
         C_k.av.ad = ((C_k)this).ad;
         return C_k.av.b(true);
      }
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      if (this instanceof C_k) {
         if (var11) {
            C_k.av.z = ((C_k)this).z;
         } else {
            C_k.av.z = -1;
         }

         C_k.av.D = ((C_k)this).D;
         C_k.av.A = ((C_k)this).A;
         C_k.av.aU = ((C_k)this).aU;
         C_k.av.bj = ((C_k)this).bj;
         C_k.av.bk = ((C_k)this).bk;
         C_k.av.bl = ((C_k)this).bl;
         C_k.av.bn = ((C_k)this).bn;
         C_k.av.bo = ((C_k)this).bo;
         C_k.av.bp = ((C_k)this).bp;
         C_k.av.I = ((C_k)this).I;
         C_k.av.x = ((C_k)this).x;
         C_k.av.F = ((C_k)this).F;
         C_k.av.w = ((C_k)this).w;
         C_k.av.s = ((C_k)this).s;
         C_k.av.ac = ((C_k)this).ac;
         C_k.av.ad = ((C_k)this).ad;
         C_h var12 = C_k.av.b(true);
         if (var12 != null) {
            var12.b(128, 128, 160);
            var12.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      }
   }

   public C_h c() {
      return null;
   }

   C_a() {
   }
}
