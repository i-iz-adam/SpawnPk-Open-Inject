package rs.p_gui.p_b.p_c;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.invoke.StringConcatFactory;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_gui.C_w;
import rs.p_gui.C_x;
import rs.p_gui.p_b.C_f;

public class C_b {
   public static final int a = 0;
   private static final int b = -9;
   private static final int c = 10;
   private rs.p_gui.p_b.C_a d;
   private boolean e = false;
   private boolean f = false;
   private C_x g;
   private C_x h;
   private C_x i;
   private C_x j;
   private C_x k;
   private C_x l;
   private C_x m;
   private C_x n;
   private C_x o;

   public void a(rs.p_gui.p_b.C_a var1) {
      this.d = var1;
      this.a();
   }

   public void a() {
      this.k = null;
      this.l = null;
   }

   private boolean d() {
      if (this.d == null) {
         return false;
      } else {
         if (this.k == null) {
            this.k = new C_x(0);
            if (!this.k.a(this.d.g().a())) {
               this.k = null;
            }
         }

         if (this.g == null) {
            this.g = new C_x(0);
            if (!this.g.a("/assets/gui/loadout_bg.png")) {
               this.g = null;
            }
         }

         if (this.l == null) {
            String var1 = this.d.e() == 1 ? "/assets/gui/curses.png" : "/assets/gui/normal.png";
            this.l = new C_x(0);
            if (!this.l.a(var1)) {
               this.l = null;
            }
         }

         if (this.i == null) {
            this.i = new C_x(0);
            if (!this.i.a("/assets/gui/booktag.png")) {
               this.i = null;
            }
         }

         if (this.h == null) {
            this.h = new C_x(0);
            if (!this.h.a("/assets/gui/skills.png")) {
               this.h = null;
            }
         }

         if (this.j == null) {
            this.j = new C_x(0);
            if (!this.j.a("/assets/gui/outline.png")) {
               this.j = null;
               return false;
            }
         }

         if (this.m == null) {
            this.m = new C_x(0);
            if (!this.m.a("/assets/gui/slot_pet.png")) {
               this.m = null;
               return false;
            }
         }

         if (this.n == null) {
            this.n = new C_x(0);
            if (!this.n.a("/assets/gui/slot_pet_mini.png")) {
               this.n = null;
               return false;
            }
         }

         if (this.o == null) {
            this.o = new C_x(0);
            if (!this.o.a("/assets/gui/slot_cosmetic.png")) {
               this.o = null;
               return false;
            }
         }

         return true;
      }
   }

   public void a(Graphics var1) {
      if (this.d != null) {
         Graphics var2 = var1;
         if (this.d()) {
            var1.setFont(C_w.b());
            this.g.a(this.c(), this.b());
            this.g.a(var1);
            if (this.d != null) {
               this.f = true;

               for (C_c var6 : C_c.values()) {
                  this.a(var2, var6);
               }

               if (this.j != null) {
                  int var9 = 3;
                  int var15 = 0;
                  short var21 = 161;
                  var15 = (short)323;
                  var9 += this.c();
                  var15 += this.b();
                  this.j.a(var21 + -9 + var9, 11 + var15);
                  this.j.a(var2);
                  if (this.m != null && this.d.b() == 0) {
                     this.m.a(var21 + -9 + var9, 10 + var15);
                     this.m.a(var2);
                  } else {
                     C_f var25 = new C_f(this.d.b());
                     C_x var7 = var25.c();
                     if (var7 != null) {
                        var7.a(var21 + 3 + -9 + var9, 13 + var15);
                        var7.a(var2);
                     }
                  }

                  this.j.a(var21 + 44 + -9 + var9, 11 + var15);
                  this.j.a(var2);
                  if (this.n != null && this.d.h() == 0) {
                     this.n.a(var21 + 44 + -9 + var9, 10 + var15);
                     this.n.a(var2);
                  } else {
                     C_f var26 = new C_f(this.d.h());
                     C_x var30 = var26.c();
                     if (var30 != null) {
                        var30.a(var21 + 44 + 3 + -9 + var9, 13 + var15);
                        var30.a(var2);
                     }
                  }

                  byte var27 = 22;
                  byte var18 = 2;
                  this.j.a(var27 + -9 + var9, 11 + var18 + this.b());
                  this.j.a(var2);
                  if (this.d.i() > 0) {
                     C_f var31 = new C_f(this.d.i());
                     C_x var8 = var31.c();
                     if (var8 != null) {
                        var8.a(var27 + 3 + -9 + var9, 13 + var18 + this.b());
                        var8.a(var2);
                     }
                  } else {
                     this.o.a(var27 + -9 + var9, 11 + var18 + this.b());
                     this.o.a(var2);
                  }
               }
            }

            for (int var11 = 0; var11 < 28; var11++) {
               this.a(var2, var11);
            }

            int var12 = 255;
            int var19 = 335;
            var12 += this.c();
            var19 += this.b();
            if (this.i != null) {
               this.i.a(var12, var19);
               this.i.a(var2);
            }

            if (this.k != null) {
               this.k.a(var12 + 10, var19 + 6);
               this.k.a(var2);
            }

            var12 += 45;
            if (this.i != null) {
               this.i.a(var12, var19);
               this.i.a(var2);
               String var22 = this.d.e() == 1 ? "/assets/gui/curses.png" : "/assets/gui/normal.png";
               if (this.l != null) {
                  this.l.a(var12 + 4, var19 + 2);
                  this.l.a(var2);
               }
            }

            if (this.h != null) {
               int var23 = 21;
               int var28 = 225;
               int var32 = 0;
               var23 += this.c();
               var28 += this.b();
               var32 = this.b();
               this.h.a(var23, var28);
               this.h.a(var2);
               var2.setColor(Color.YELLOW);

               for (int var34 = 0; var34 < this.d.c().length; var34++) {
                  var2.drawString(this.d.c()[var34] + "", C_a.a[var34][0] - 1 + (var23 - 28), C_a.a[var34][1] + 2 + var32);
                  var2.drawString(this.d.c()[var34] + "", C_a.a[var34][0] + 10 + (var23 - 28), C_a.a[var34][1] + 13 + 2 + var32);
               }
            }

            if (!this.f || !this.e) {
               C_Launcher_mc.n().b(500, false);
            }
         }
      }
   }

   private void a(Graphics var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < 7; var4++) {
         for (int var5 = 0; var5 < 4; var5++) {
            if (var3 != var2) {
               var3++;
            } else {
               byte var6 = 0;
               int var7 = 181 + var5 * 39 + var6;
               int var8 = 19 + var4 * 40;
               var7 += this.c();
               var8 += this.b();
               if (this.j != null) {
                  this.j.a(var7, var8);
                  this.j.a(var1);
                  this.e = true;
                  if (this.d != null && this.d.d()[var2] != null) {
                     C_f var9 = this.d.d()[var2];
                     C_x var10 = var9.c();
                     if (var10 != null) {
                        var10.a(var7 + 1, var8 + 1);
                        var10.a(var1);
                        if (this.d.d()[var2].a() > 0 && this.d.d()[var2].b() > 1) {
                           int var11 = this.d.d()[var2].b();
                           if (var11 >= 10000000) {
                              var1.setColor(Color.GREEN);
                           } else if (var11 < 10000000 && var11 >= 100000) {
                              var1.setColor(Color.WHITE);
                           } else {
                              var1.setColor(Color.YELLOW);
                           }

                           var1.drawString(
                              StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(C_Client_mc.g(this.d.d()[var2].b())),
                              var7 + 1,
                              var8 + 9
                           );
                        }
                     } else {
                        this.e = false;
                     }
                  }

                  var3++;
               }
            }
         }
      }
   }

   private void a(Graphics var1, C_c var2) {
      if (this.j != null && var2 != null) {
         int var3 = -90;
         int var4 = 10;
         var3 += this.c();
         var4 += this.b();
         this.j.a(var2.c() + -9 + var3, var2.d() + 10 + var4);
         this.j.a(var1);
         if (this.d != null) {
            if (this.d.a().get(var2) == null) {
               if (var2.a() != null) {
                  var2.a().a(var2.c() + -9 + var3, var2.d() + 10 + var4);
                  var2.a().a(var1);
               }
            } else {
               C_f var5 = this.d.a().get(var2);
               C_x var6 = var5.c();
               if (var6 != null) {
                  var6.a(var2.c() + -9 + 2 + var3, var2.d() + 10 + 2 + var4);
                  var6.a(var1);
                  if (this.d.a().get(var2).a() > 0 && this.d.a().get(var2).b() > 1) {
                     int var7 = this.d.a().get(var2).b();
                     if (var7 >= 10000000) {
                        var1.setColor(Color.GREEN);
                     } else if (var7 < 10000000 && var7 >= 100000) {
                        var1.setColor(Color.WHITE);
                     } else {
                        var1.setColor(Color.YELLOW);
                     }

                     var1.drawString(
                        StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(C_Client_mc.g(this.d.a().get(var2).b())),
                        var2.c() + -9 + var3 + 2,
                        var2.d() + 10 + var4 + 10
                     );
                  }
               } else if (this.d.a().get(var2).a() <= 0 && var2.a() != null) {
                  var2.a().a(var2.c() + -9 + var3, var2.d() + 10 + var4);
                  var2.a().a(var1);
               }
            }
         }
      }
   }

   public int b() {
      return 94;
   }

   public int c() {
      return 9;
   }
}
