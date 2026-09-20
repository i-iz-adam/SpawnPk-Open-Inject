package rs.p_l.p_e.p_a;

import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public abstract class C_s extends rs.p_l.p_e.C_a {
   private static final int r = 40;
   private static final int s = 40;
   private static final int t = 4;
   private static final int u = 200;
   private static final int v = 100;
   private boolean w;
   private int x;
   private int y;
   private boolean z = true;
   private boolean A = false;
   private int B = 200;
   protected C_F_uc p;
   protected C_F_uc q;

   public abstract void f();

   public abstract int g();

   public abstract int h();

   public abstract String i();

   @Override
   public boolean a(C_Client_mc var1) {
      return this.w && C_Client_mc.ed != 197;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.a var2) {
      if (var2 == rs.p_l.p_e.C_f.a.a) {
         rs.p_l.p_e.C_f.o++;
         this.x = 465;
         this.y = 8;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            this.x = C_Client_mc.aj - 280;
         }

         int var3 = this.x + this.j();
         if (!rs.p_l.p_b.C_a.a()) {
            if (this.z) {
               this.B -= 4;
               if (this.B <= 100) {
                  this.z = false;
               }
            } else {
               this.B += 4;
               if (this.B >= 200) {
                  this.z = true;
               }
            }
         }

         rs.p_l.C_c.b(40, this.y, var3, this.g(), 40, this.B - 25);
         rs.p_l.C_c.b(34, this.y + 3, var3 + 3, this.h(), 34, this.B - 100);
         (this.k() ? this.q : this.p).g(var3 + 2, this.y + 1, this.B + 50);

         for (int var4 = 0; var4 < 2; var4++) {
            int var5 = this.B - 50;
            rs.p_l.p_a.C_b.a.a(var3 - 4, this.y - 1 + var4 * 30, var5);
            rs.p_l.p_a.C_b.a.a(var3 + 31, this.y - 1 + var4 * 30, var5);
         }

         C_Client_mc.fE[106].g(var3 + 21, this.y + 21, this.B - 25);
         if (this.k()) {
            var1.b(C_Client_mc.hP - 40 - 20, C_Client_mc.hQ + 40 - 30, this.i());
         }
      }
   }

   @Override
   public void c() {
      this.w = false;
   }

   @Override
   public boolean a(int var1) {
      if (!this.k()) {
         this.A = false;
         return false;
      } else {
         if (C_Client_mc.cH == -1) {
            if (var1 == 0) {
               this.A = true;
            }

            if (var1 == 1 && this.A) {
               this.f();
               this.A = false;
            }
         } else {
            this.A = false;
         }

         return true;
      }
   }

   private boolean k() {
      return C_Client_mc.cH != -1
         ? false
         : C_Client_mc.hP >= this.x + this.j() && C_Client_mc.hP <= this.x + this.j() + 40 && C_Client_mc.hQ >= this.y && C_Client_mc.hQ <= this.y + 40;
   }

   protected int j() {
      return -(Math.max(rs.p_l.p_e.C_f.o - 1, 0) * 50);
   }

   public void a(boolean var1) {
      this.w = var1;
   }
}
