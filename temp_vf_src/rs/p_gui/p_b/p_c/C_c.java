package rs.p_gui.p_b.p_c;

import rs.p_gui.C_x;

public enum C_c {
   a(0, 935, 100, "/assets/gui/slot_helm.png"),
   b(2, 935, 138, "/assets/gui/slot_ammy.png"),
   c(4, 935, 177, "/assets/gui/slot_chest.png"),
   d(7, 935, 217, "/assets/gui/slot_legs.png"),
   e(10, 935, 256, "/assets/gui/slot_boots.png"),
   f(1, 894, 138, "/assets/gui/slot_cape.png"),
   g(13, 976, 138, "/assets/gui/slot_arrows.png"),
   h(5, 990, 177, "/assets/gui/slot_shield.png"),
   i(3, 880, 177, "/assets/gui/slot_wep.png"),
   j(9, 880, 256, "/assets/gui/slot_gloves.png"),
   k(12, 990, 256, "/assets/gui/slot_ring.png");

   private String l;
   private C_x m;
   private int n;
   private int o;
   private int p;

   private C_c(int var3, int var4, int var5, String var6) {
      this.n = var3;
      this.o = var4;
      this.p = var5;
      this.l = var6;
   }

   public C_x a() {
      if (this.m == null) {
         C_x var1 = new C_x(0);
         if (var1.a(this.l)) {
            this.m = var1;
         }
      }

      return this.m;
   }

   public int b() {
      return this.n;
   }

   public int c() {
      return this.o - 765;
   }

   public int d() {
      return this.p - 100;
   }

   public static C_c a(int var0) {
      for (C_c var4 : values()) {
         if (var4.b() == var0) {
            return var4;
         }
      }

      return null;
   }
}
