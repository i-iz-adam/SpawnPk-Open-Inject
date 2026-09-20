package rs.p_n.p_c;

public class C_v extends rs.p_n.C_c {
   public static rs.p_l.C_F_uc c;
   public static rs.p_l.C_F_uc d;
   public static rs.p_l.C_F_uc[] e = new rs.p_l.C_F_uc[2];
   public static rs.p_l.C_F_uc f;

   public C_v(rs.p_l.C_K_uc[] var1) {
      super(var1);
      this.b = true;
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(54300);
      h(54301, "drops/collection 3");
      c = new rs.p_l.C_F_uc("drops/collection 1");
      d = new rs.p_l.C_F_uc("drops/collection 2");
      e[0] = new rs.p_l.C_F_uc("drops/collection 4");
      e[1] = new rs.p_l.C_F_uc("drops/collection 5");
      f = new rs.p_l.C_F_uc("drops/collection 6");
      b(54302, 1, "drops/collection", "Bosses");
      b(54303, 2, "drops/collection", "Boxes");
      b(54304, 2, "drops/collection", "Minigames");
      b(54305, 2, "drops/collection", "Other");
      b(54306, 2, "drops/collection", "N/A");
      a(54307, "Bosses", this.a, 1, 16750623);
      a(54308, "Boxes", this.a, 1, 16750623);
      a(54309, "Minigames", this.a, 1, 16750623);
      a(54310, "Other", this.a, 1, 16750623);
      a(54311, "N/A", this.a, 1, 16750623);
      a(54312, "Collection Log <img=321>", this.a, 2, 16750623);
      rs.p_n.C_e var2 = d(54313);
      var2.aH = 750;
      var2.P = 190;
      var2.aR = 262;
      var2.k(100);
      int var3 = 54314;
      int var4 = 0;

      for (int var5 = 0; var5 < 50; var5++) {
         h(var3++, "");
         rs.p_n.C_e.H[var3 - 1].E = var5 == 0 ? f : e[var5 % 2 == 0 ? 0 : 1];
         rs.p_n.C_e.H[var3 - 1].aG = var5 == 0 ? f : e[var5 % 2 == 0 ? 0 : 1];
         a(var3++, "", "Select collection log", this.a, 1, 16750623, false, true, 250);
         var2.b(var4++, var3 - 2, 3, 1 + var5 * 16);
         var2.b(var4++, var3 - 1, 5, 1 + var5 * 16);
      }

      a(54414, "Collection name", this.a, 2, 16750623);
      a(54415, "Obtained: @red@0/0", this.a, 0, 16750623);
      c(54416, "Kill count: @whi@0", this.a, 0, 16750623, true);
      rs.p_n.C_e var8 = d(54417);
      var8.aH = 950;
      var8.P = 258;
      var8.aR = 185;
      var8.k(1);
      a(54418, false);
      H['풒'].K = new int[120];
      H['풒'].ax = new int[120];
      H['풒'].az = new int[120];
      H['풒'].as = new int[120];
      H['풒'].P = 6;
      H['풒'].aR = 20;
      H['풒'].ac = 11;
      H['풒'].ap = 16;
      var8.b(0, 54418, 3, 3);
      a(54419, "Complete this collection and receive..", this.a, 0, 16750623);
      a(54420, "@yel@15M coins + 25,000 RX points + 150 boss points", this.a, 0, 16750623);
      a(54421, "SCRIPT_HOLDER", this.a, 0, 16750623);
      a(54422, "SCRIPT_HOLDER", this.a, 0, 16750623);
      var1.k(21);
      var1.b(0, 54301, 3, 3);
      var1.b(1, 54302, 12, 39);
      var1.b(2, 54303, 108, 39);
      var1.b(3, 54304, 204, 39);
      var1.b(4, 54305, 300, 39);
      var1.b(5, 54306, -5000, 39);
      var1.b(6, 54307, 17, 41);
      var1.b(7, 54308, 113, 41);
      var1.b(8, 54309, 209, 41);
      var1.b(9, 54310, 305, 41);
      var1.b(10, 54311, -5000, 41);
      var1.b(11, 54312, 214, 12);
      var1.b(12, 63740, 482, 13);
      var1.b(13, 63741, 482, 13);
      var1.b(14, 54313, 10, 60);
      var1.b(15, 54414, 223, 62);
      var1.b(16, 54415, 223, 84);
      var1.b(17, 54416, 494, 84);
      var1.b(18, 54417, 222, 101);
      var1.b(19, 54419, 220, 292);
      var1.b(20, 54420, 220, 308);
   }

   @Override
   public void a(int var1) {
   }

   @Override
   public void a(int var1, String var2) {
      if (var1 == 54315) {
         for (int var3 = 54315; var3 <= 54413; var3++) {
            if (var3 % 2 != 0) {
               rs.p_n.C_e.H[var3].at = "";
            }
         }
      }

      if (var1 == 54421) {
         int var6 = 0;
         int var4 = Integer.parseInt(var2);

         for (int var5 = 54314; var5 <= 54412; var5++) {
            if (var5 % 2 == 0) {
               rs.p_n.C_e.H[var5].E = var5 == var4 ? f : e[var6];
               rs.p_n.C_e.H[var5].aG = var5 == var4 ? f : e[var6];
               var6 = var6 == 0 ? 1 : 0;
            }
         }

         H['풑'].V = 0;
      }

      if (var1 == 54422) {
         int var7 = Integer.parseInt(var2);
         if (var7 >= 54302 && var7 <= 54306) {
            for (int var8 = 54302; var8 <= 54306; var8++) {
               rs.p_n.C_e.H[var8].E = var7 == var8 ? c : d;
               rs.p_n.C_e.H[var8].aG = var7 == var8 ? c : d;
            }

            H['퐩'].V = 0;
         }

         int var9 = 0;

         for (int var10 = 54314; var10 <= 54412; var10++) {
            if (var10 % 2 == 0) {
               rs.p_n.C_e.H[var10].E = e[var9];
               rs.p_n.C_e.H[var10].aG = e[var9];
               var9 = var9 == 0 ? 1 : 0;
            }
         }
      }
   }

   @Override
   public void b() {
      int var1 = 0;

      for (int var2 = 54314; var2 <= 54412; var2++) {
         if (var2 % 2 == 0) {
            rs.p_n.C_e.H[var2].E = var2 == 54314 ? f : e[var1];
            rs.p_n.C_e.H[var2].aG = var2 == 54314 ? f : e[var1];
            var1 = var1 == 0 ? 1 : 0;
         }
      }

      for (int var3 = 54302; var3 <= 54306; var3++) {
         rs.p_n.C_e.H[var3].E = 54302 == var3 ? c : d;
         rs.p_n.C_e.H[var3].aG = 54302 == var3 ? c : d;
      }

      H['퐩'].V = 0;
      H['풑'].V = 0;
   }
}
