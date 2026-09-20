package rs.p_n.p_c;

import rs.C_Client_mc;

public class C_Y_uc extends rs.p_n.C_c {
   public static final int[] c = new int[]{32001, 32005, 32009, 32015, 32017};
   public static rs.p_l.C_F_uc d;
   public static rs.p_l.C_F_uc e;
   public static int f = 0;

   public static void m(int var0) {
      if (var0 == 32001) {
         n(var0);
         rs.p_n.C_e.H[32014].at = "Achievements";
         C_Client_mc.eT[2] = 44100;
         C_Client_mc.fb = true;
         C_Client_mc.eM = true;
      }

      if (var0 == 32005) {
         n(var0);
         rs.p_n.C_e.H[32014].at = "Account Information";
         C_Client_mc.eT[2] = 638;
         C_Client_mc.fb = true;
         C_Client_mc.eM = true;
      }

      if (var0 == 32009) {
         n(var0);
         rs.p_n.C_e.H[32014].at = "Knowledgebase";
         C_Client_mc.eT[2] = 64600;
         C_Client_mc.fb = true;
         C_Client_mc.eM = true;
      }

      if (var0 == 32015) {
         n(var0);
         rs.p_n.C_e.H[32014].at = "World Events";
         C_Client_mc.eT[2] = 40087;
         C_Client_mc.fb = true;
         C_Client_mc.eM = true;
      }

      if (var0 == 32017) {
         n(var0);
         rs.p_n.C_e.H[32014].at = "<img=253> PK Ratings";
         C_Client_mc.eT[2] = 40403;
         C_Client_mc.fb = true;
         C_Client_mc.eM = true;
      }

      if (C_Client_mc.eT[C_Client_mc.fL] == 44100) {
         C_b.m(var0);
      }
   }

   public static void n(int var0) {
      boolean var1 = false;
      f = var0;

      for (int var5 : c) {
         if (var5 == var0) {
            var1 = true;
         }
      }

      if (var1) {
         for (int var9 : c) {
            if (var9 == var0) {
               rs.p_n.C_e.H[var9].E = d;
               rs.p_n.C_e.H[var9].aG = d;
            } else {
               rs.p_n.C_e.H[var9].E = e;
               rs.p_n.C_e.H[var9].aG = e;
            }
         }
      }
   }

   public C_Y_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(32000);
      d = new rs.p_l.C_F_uc("gameframe/tab/sprite 2");
      e = new rs.p_l.C_F_uc("gameframe/tab/sprite 1");
      b(32001, 2, "gameframe/tab/sprite", "Open achievement tab");
      h(32004, "gameframe/tab/achievement");
      rs.p_n.C_e.H[32004].bn = false;
      b(32015, 2, "gameframe/tab/sprite", "Open events");
      h(32016, "gameframe/tab/event");
      rs.p_n.C_e.H[32016].bn = false;
      b(32017, 2, "gameframe/tab/sprite", "Open pk ratings");
      h(32018, "gameframe/tab/ratings");
      rs.p_n.C_e.H[32018].bn = false;
      b(32005, 2, "gameframe/tab/sprite", "Open account information");
      h(32008, "gameframe/tab/player");
      rs.p_n.C_e.H[32008].bn = false;
      b(32009, 2, "gameframe/tab/sprite", "Open guides");
      h(32012, "gameframe/tab/info");
      rs.p_n.C_e.H[32012].bn = false;
      h(32013, "gameframe/tab/sprite 3");
      a(32014, "Title placeholder", this.a, 2, 16750623, false, true);
      m(32001);
      var1.k(12);
      byte var2 = 2;
      byte var3 = 2;
      int var4 = 0;
      var1.b(var4++, 32013, var2 + 1, var3 + 25);
      var1.b(var4++, 32014, var2 + 5, var3 + 29);
      var1.b(var4++, 32001, 0 + var2, 0 + var3);
      var1.b(var4++, 32004, 7 + var2, 4 + var3);
      var1.b(var4++, 32015, 31 + var2, 0 + var3);
      var1.b(var4++, 32016, 38 + var2, 4 + var3);
      var1.b(var4++, 32017, 62 + var2, 0 + var3);
      var1.b(var4++, 32018, 69 + var2, 4 + var3);
      var1.b(var4++, 32005, 93 + var2, 0 + var3);
      var1.b(var4++, 32008, 100 + var2, 4 + var3);
      var1.b(var4++, 32009, 124 + var2, 0 + var3);
      var1.b(var4++, 32012, 131 + var2, 4 + var3);
   }
}
