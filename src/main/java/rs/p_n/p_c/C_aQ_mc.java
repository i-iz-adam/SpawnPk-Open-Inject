package rs.p_n.p_c;

public class C_aQ_mc extends rs.p_n.C_c {
   public static final String[] c = new String[]{
      "Attack",
      "Defence",
      "Strength",
      "Hitpoints",
      "Range",
      "Prayer",
      "Magic",
      "Cooking",
      "Woodcutting",
      "Fletching",
      "Fishing",
      "Firemaking",
      "Crafting",
      "Smithing",
      "Mining",
      "Herblore",
      "Agility",
      "Thieving",
      "Slayer",
      "Farming",
      "Runecrafting",
      "Construction",
      "Hunter",
      "Summoning"
   };

   private static int b(String var0) {
      for (int var1 = 0; var1 < c.length; var1++) {
         if (var0.equals(c[var1])) {
            return var1;
         }
      }

      return -1;
   }

   public C_aQ_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(3917);
      c(19999, 1, "skills/SKILL");
      a(50240, "Total Level: 0", 16776960, false, true, 52, this.a, 2);
      a(3, var1);
      b(19999, 5, 17, 0, var1);
      b(20001, 7, 20, 1, var1);
      b(50240, 7, 1, 2, var1);
      var1 = d(20001);
      var1.aR = 226;
      var1.P = 163;
      var1.aH = 258;
      a(97, var1);
      int var2 = 1;
      int[] var3 = new int[]{3, 3, 3, 34, 34, 34, 66, 66, 66, 98, 98, 98, 131, 131, 131, 162, 162, 162, 195, 195, 195, 228, 228, 228};
      int[] var4 = new int[]{24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132};
      int[] var5 = new int[]{15, 15, 15, 48, 48, 48, 80, 80, 80, 111, 111, 111, 145, 145, 145, 175, 175, 175, 208, 208, 208, 241, 241, 241};
      int[] var6 = new int[]{36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144};
      int[] var7 = new int[]{
         4004, 4016, 4028, 4006, 4018, 4030, 4008, 4020, 4032, 4010, 4022, 4034, 4012, 4024, 4036, 4014, 4026, 4038, 4152, 12166, 13926, 50204, 50206, 50208
      };
      int[] var8 = new int[]{
         4005, 4017, 4029, 4007, 4019, 4031, 4009, 4021, 4033, 4011, 4023, 4035, 4013, 4025, 4037, 4015, 4027, 4039, 4153, 12167, 13927, 50205, 50207, 50209
      };
      int[] var9 = new int[]{2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109};
      int[] var10 = new int[]{0, 0, 0, 32, 32, 32, 64, 64, 64, 96, 96, 96, 128, 128, 128, 160, 160, 160, 192, 192, 192, 224, 224, 224};
      int[] var11 = new int[]{
         50002,
         50003,
         50004,
         50005,
         50006,
         50007,
         50008,
         50009,
         50010,
         50011,
         50012,
         50013,
         50014,
         50015,
         50016,
         50017,
         50018,
         50019,
         50020,
         50021,
         50022,
         50210,
         50220,
         50230
      };
      int[] var12 = new int[]{
         50023,
         50030,
         50037,
         50044,
         50051,
         50058,
         50065,
         50072,
         50080,
         50087,
         50094,
         50101,
         50108,
         50115,
         50122,
         50129,
         50136,
         50143,
         50150,
         50157,
         50164,
         50215,
         50225,
         50235
      };
      String[] var13 = new String[]{
         "Combat",
         "Combat",
         "Mining",
         "Combat",
         "Agility",
         "Smithing",
         "Combat",
         "Herblore",
         "Fishing",
         "Range",
         "Thieving",
         "Cooking",
         "Prayer",
         "Crafting",
         "Firemaking",
         "Magic",
         "Fletching",
         "Woodcutting",
         "Runecrafting",
         "Slayer",
         "Farming",
         "Construction",
         "Hunter",
         "Summoning"
      };
      String[] var14 = new String[]{
         "Attack",
         "Hitpoints",
         "Mining",
         "Strength",
         "Agility",
         "Smithing",
         "Defence",
         "Herblore",
         "Fishing",
         "Range",
         "Thieving",
         "Cooking",
         "Prayer",
         "Crafting",
         "Firemaking",
         "Magic",
         "Fletching",
         "Woodcutting",
         "Runecrafting",
         "Slayer",
         "Farming",
         "Construction",
         "Hunter",
         "Summoning"
      };
      int[] var15 = new int[]{15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28};
      int[] var16 = new int[]{34, 34, 34, 66, 66, 66, 98, 98, 98, 130, 130, 130, 162, 162, 162, 83, 83, 83, 118, 118, 118, 153, 153, 153};
      int var17 = 0;

      for (int var21 : var7) {
         a(var21, "%1", 16776960, true, true, 52, this.a, 0);
         if (var21 == 50208) {
            b(var21, 99999, 999999, var2, var1);
         } else {
            b(var21, var4[var2 - 1] + 7, var3[var2 - 1] + 1, var2, var1);
         }

         int[][] var22 = new int[1][3];
         var22[0][0] = 1;
         var22[0][1] = b(var14[var17++]);
         var22[0][2] = 0;
         H[var21].X = var22;
         var2++;
      }

      int var27 = 0;
      var17 = 0;

      for (int var36 : var8) {
         a(var36, "%1", 16776960, true, true, 52, this.a, 0);
         if (var36 == 50209) {
            b(var36, 99999, 999999, var2, var1);
         } else {
            b(var36, var6[var27] + 7, var5[var27] + 1, var2, var1);
         }

         int[][] var23 = new int[1][3];
         var23[0][0] = 2;
         var23[0][1] = b(var14[var17++]);
         var23[0][2] = 0;
         H[var36].X = var23;
         var2++;
         var27++;
      }

      int var29 = 0;

      for (int var39 : var11) {
         a(var39, 0, "", var13[var29], 1, var12[var29], this.a, var14[var29]);
         if (var39 == 50230) {
            b(var39, 9999999, 99999999, var2, var1);
         } else {
            b(var39, var9[var29], var10[var29], var2, var1);
         }

         var2++;
         var29++;
      }

      int var32 = 0;

      for (int var24 : var12) {
         if (var24 == 50235) {
            b(var24, 9999999, 99999999, var2, var1);
         } else {
            b(var24, var15[var32], var16[var32], var2, var1);
         }

         var2++;
         var32++;
      }

      c(20200, 0, "skills/SKILL");
      b(20200, 0, 0, 0, var1);
   }

   public static void a(int var0, int var1, String var2, String var3, int var4, int var5, rs.p_l.C_K_uc[] var6, String var7) {
      rs.p_n.C_e var8 = d(var0);
      var8.aw = var0;
      var8.ah = var0;
      var8.aI = 5;
      var8.M = var4;
      var8.J = 0;
      var8.aC = 0;
      var8.ab = var5;
      var8.E = new rs.p_l.C_F_uc("skills/" + var2);
      var8.aG = new rs.p_l.C_F_uc("skills/" + var2);
      var8.P = 53;
      var8.aR = 32;
      var8.Q = "View " + var3 + " Guide";
      var8 = d(var5);
      var8.aQ = true;
      var8.aI = 0;
      var8.M = 0;
      var8.ab = -1;
      var8.P = 512;
      var8.aR = 334;
      var8.ah = var5;
      var8.aw = var5;
      a(var5 + 1, 0, false, 0, var7 + " Lvl:\nCurrentXP:\nNext Lvl:\nRemainder:");
      a(1, var8);
      b(var5 + 1, 0, 0, 0, var8);
   }

   public static void b(int var0, String var1, int var2, boolean var3, boolean var4, int var5, rs.p_l.C_K_uc[] var6, int var7) {
      rs.p_n.C_e var8 = j(var0);
      var8.ah = var0;
      var8.aw = var0;
      var8.aI = 4;
      var8.M = 0;
      var8.P = 0;
      var8.aR = 0;
      var8.J = 0;
      var8.aC = 0;
      var8.ab = var5;
      var8.S = var3;
      var8.aS = var4;
      var8.ao = var6[var7];
      var8.at = var1;
      var8.ad = var2;
   }
}
