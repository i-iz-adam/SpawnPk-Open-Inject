package rs.p_l.p_e;

import rs.p_l.C_F_uc;

public class C_g {
   public static final double a = 1.05;
   public static final double b = 1.25;
   private static boolean o;
   private static C_F_uc p;
   private static C_F_uc q;
   public static C_F_uc c;
   public static C_F_uc d;
   public static C_F_uc e;
   public C_F_uc f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public long m;
   public boolean n;

   public C_g(int var1, int var2) {
      this.i = var1;
      this.j = var2;
      this.n = true;
      this.k = 0;
      if (!o) {
         p = new C_F_uc("popups/block drop");
         q = new C_F_uc("popups/hit drop");
         c = new C_F_uc("popups/protmelee");
         e = new C_F_uc("popups/protrange");
         d = new C_F_uc("popups/protmagic");
         o = true;
      }

      this.f = var1 == 0 ? p : q;
   }

   public void a() {
      if (!rs.p_l.p_b.C_a.a()) {
         if (this.n) {
            this.k = (int)((double)this.k + 15.75);
            if (this.k >= 255) {
               this.k = 255;
               this.n = false;
            }
         } else {
            this.k = (int)(255.0 - (double)this.h * 1.05);
         }

         if (this.k < 0) {
            this.k = 0;
         }

         this.h = (int)((double)this.h + 1.25);
      }
   }
}
