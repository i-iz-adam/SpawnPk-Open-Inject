package rs.p_n.p_c;

public class C_z extends rs.p_n.C_c {
   public C_z(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(19993);
      a(4, var1);
      c(39985, 2, "construction/sprite");
      byte var2 = 35;
      byte var3 = 15;
      a(0, 39985, var2 + 0, var3 + 0, var1);
      a(1, 65418, var2 + 429, var3 + 4, var1);
      a(2, 65419, var2 + 429, var3 + 4, var1);
      a(3, 19992, var2 + 51, var3 + 60, var1);
      rs.p_n.C_e var4 = j(19992);
      byte var5 = 23;
      var4.aH = var5 * 65;
      var4.P = 330;
      var4.aR = 220;
      String[] var6 = new String[]{
         "Parlour: Lvl 1",
         "Garden: Lvl 1",
         "Kitchen: lvl 5",
         "Dining room: lvl 10",
         "Workshop: lvl 15",
         "Bedroom: Lvl 20",
         "Hall - Skill Trophies: Lvl 25",
         "Games Room: Lvl 30",
         "Combat room: Lvl 32",
         "Hall - Quest trophies: Lvl 35",
         "Menagerie: Lvl 37",
         "Study: Lvl 40",
         "Costume room: Lvl 42",
         "Chapel: Lvl 45",
         "Boss portal room: Lvl 50",
         "Formal garden: Lvl 55",
         "Throne room: Lvl 60",
         "Superior garden: Lvl 65",
         "Dungeon - corridor: Lvl 70",
         "Dungeon - junction: Lvl 70",
         "Dungeon - stairs: Lvl 70",
         "Dungeon - pit: Lvl 70",
         "Treasure room: Lvl 75"
      };
      int[] var7 = new int[]{
         1000,
         1000,
         5000,
         5000,
         10000,
         10000,
         15000,
         25000,
         25000,
         25000,
         30000,
         50000,
         50000,
         50000,
         100000,
         75000,
         150000,
         150000,
         7500,
         7500,
         7500,
         10000,
         250000
      };
      String[] var8 = new String[]{
         "30k",
         "30k",
         "150k",
         "150k",
         "300k",
         "300k",
         "450k",
         "750k",
         "750k",
         "750k",
         "900k",
         "1500k",
         "1500k",
         "1500k",
         "300M",
         "2250k",
         "4500k",
         "500M",
         "300k",
         "300k",
         "300k",
         "350k",
         "1000k"
      };
      byte var9 = 8;
      byte var10 = 4;
      int var11 = 0;
      int var12 = 39879;
      a(var5 * 4, var4);

      for (int var13 = 0; var13 < var6.length; var13++) {
         if (var12 == 39967) {
            var12 = 40300;
         }

         String var14 = var6[var13];
         var14 = var14.split(":")[0];
         a(var12, 0, 3355443, false, 238, 61, var14);
         a(var11++, var12++, var10, var9, var4);
         h(var12, "construction/" + (var13 + 4));
         byte var15 = 13;
         byte var16 = 5;
         if (var13 == 0) {
            var15 = 23;
         }

         if (var13 == 1) {
            var15 = 8;
            var16 = 7;
         }

         if (var13 == 2) {
            var15 = 11;
            var16 = 7;
         }

         if (var13 == 3) {
            var16 = 17;
         }

         if (var13 == 7) {
            var16 = 11;
         }

         if (var13 == 8) {
            var15 = 11;
         }

         if (var13 == 10) {
            var15 = 9;
         }

         if (var13 == 11) {
            var15 = 12;
            var16 = 1;
         }

         if (var13 == 12) {
            var15 = 25;
         }

         if (var13 == 14) {
            var15 = 9;
            var16 = 7;
         }

         if (var13 == 15) {
            var15 = 7;
         }

         if (var13 == 16) {
            var15 = 19;
            var16 = 0;
         }

         if (var13 == 17) {
            var15 = 5;
            var16 = 3;
         }

         if (var13 >= 18) {
            var15 = 6;
            var16 = 3;
         }

         if (var13 == 8) {
            var15 = 11;
         }

         a(var11++, var12++, var10 + var15, var9 + var16, var4);
         a(var12, var6[var13], var6[var13], 16777215, 16777215, false, true, 0, 1);
         a(var11++, var12++, var10 + (var13 == 9 ? 75 : 82), var9 + 22, var4);
         a(var12, "<img=9> " + var8[var13] + " gp", var8[var13], 16769316, 16769316, false, true, 0, 1);
         H[var12].X = new int[1][];
         H[var12].bk = new int[1];
         H[var12].bl = new int[1];
         H[var12].X[0] = new int[4];
         H[var12].X[0][0] = 4;
         H[var12].X[0][1] = 3214;
         H[var12].X[0][2] = 995;
         H[var12].X[0][3] = 0;
         H[var12].bk[0] = var7[var13];
         H[var12].bl[0] = 10;
         a(var11++, var12++, var10 + 243, var9 + 25, var4);
         var9 += 64;
      }
   }
}
