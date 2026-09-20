package rs.p_n.p_c;

public class C_s extends rs.p_n.C_c {
   public static rs.p_l.C_F_uc c;
   public static rs.p_l.C_F_uc d;

   public C_s(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      c = new rs.p_l.C_F_uc("clan/sprite 12");
      d = new rs.p_l.C_F_uc("clan/sprite 13");
      rs.p_n.C_e var1 = d(24000);
      h(24001, "clan/sprite 9");
      a(24002, "Clan Wars Setup: Challenging xxxx", this.a, 2, 16750623, true);
      c(24003, 2, "gambling/SPRITE");
      c(24004, 1, "gambling/SPRITE");
      a(24005, "Allowed", "Select", this.a, 1, 16750623, false, true, 80);
      a(24006, "Disabled", "Select", this.a, 1, 16750623, false, true, 80);
      c(24007, 2, "gambling/SPRITE");
      c(24008, 1, "gambling/SPRITE");
      a(24009, "Allowed", "Select", this.a, 1, 16750623, false, true, 80);
      a(24010, "Disabled", "Select", this.a, 1, 16750623, false, true, 80);
      c(24011, 2, "gambling/SPRITE");
      c(24012, 1, "gambling/SPRITE");
      a(24013, "Allowed", "Select", this.a, 1, 16750623, false, true, 80);
      a(24014, "Disabled", "Select", this.a, 1, 16750623, false, true, 80);
      c(24015, 2, "gambling/SPRITE");
      c(24016, 1, "gambling/SPRITE");
      a(24017, "Allowed", "Select", this.a, 1, 16750623, false, true, 80);
      a(24018, "Disabled", "Select", this.a, 1, 16750623, false, true, 80);
      c(24019, 2, "gambling/SPRITE");
      c(24020, 1, "gambling/SPRITE");
      c(24021, 1, "gambling/SPRITE");
      c(24022, 1, "gambling/SPRITE");
      a(24023, "All spellbooks", "Select", this.a, 1, 16750623, false, true, 80);
      a(24024, "Standard spells", "Select", this.a, 1, 16750623, false, true, 80);
      a(24025, "Binding only", "Select", this.a, 1, 16750623, false, true, 80);
      a(24026, "Disabled", "Select", this.a, 1, 16750623, false, true, 80);
      c(24027, 2, "gambling/SPRITE");
      c(24028, 1, "gambling/SPRITE");
      c(24029, 1, "gambling/SPRITE");
      a(24030, "All allowed", "Select", this.a, 1, 16750623, false, true, 80);
      a(24031, "Standard prayers", "Select", this.a, 1, 16750623, false, true, 80);
      a(24032, "Disabled", "Select", this.a, 1, 16750623, false, true, 80);
      c(24033, 2, "gambling/SPRITE");
      c(24034, 1, "gambling/SPRITE");
      c(24035, 1, "gambling/SPRITE");
      a(24036, "Allowed", "Select", this.a, 1, 16750623, false, true, 80);
      a(24037, "No Staff of the Dead", "Select", this.a, 1, 16750623, false, true, 80);
      a(24038, "Disabled", "Select", this.a, 1, 16750623, false, true, 80);
      c(24039, 2, "gambling/SPRITE");
      c(24040, 1, "gambling/SPRITE");
      a(24041, "Kill 'em all", "Select", this.a, 1, 16750623, false, true, 80);
      a(24042, "Ignore 5", "Select", this.a, 1, 16750623, false, true, 80);
      short var2 = 150;
      rs.p_n.C_e var3 = d(24043);
      var3.k(12);
      var3.P = 141;
      var3.aR = 56;
      var3.aH = 150;
      c(24044, 2, "gambling/SPRITE");
      c(24045, 1, "gambling/SPRITE");
      c(24046, 1, "gambling/SPRITE");
      c(24047, 1, "gambling/SPRITE");
      c(24048, 1, "gambling/SPRITE");
      c(24049, 1, "gambling/SPRITE");
      a(24050, "Last team standing", "Select", this.a, 1, 16750623, false, true, var2);
      a(24051, "25 kills", "Select", this.a, 1, 16750623, false, true, var2);
      a(24052, "50 kills", "Select", this.a, 1, 16750623, false, true, var2);
      a(24053, "100 kills", "Select", this.a, 1, 16750623, false, true, var2);
      a(24054, "200 kills", "Select", this.a, 1, 16750623, false, true, var2);
      a(24055, "500 kills", "Select", this.a, 1, 16750623, false, true, var2);
      byte var4 = 3;

      for (int var5 = 24044; var5 <= 24055; var5++) {
         if (var5 == 24050) {
            var4 = 3;
         }

         var3.b(var5 - 24044, var5, var5 >= 24050 ? 20 : 3, var4);
         var4 += 18;
      }

      rs.p_n.C_e var9 = d(24056);
      var9.k(21);
      var9.P = 141;
      var9.aR = 60;
      var9.aH = 183;
      c(24057, 2, "gambling/SPRITE");
      c(24058, 1, "gambling/SPRITE");
      c(24059, 1, "gambling/SPRITE");
      c(24060, 1, "gambling/SPRITE");
      c(24061, 1, "gambling/SPRITE");
      c(24062, 1, "gambling/SPRITE");
      c(24063, 1, "gambling/SPRITE");
      c(24064, 1, "gambling/SPRITE");
      c(24065, 1, "gambling/SPRITE");
      c(24066, 1, "gambling/SPRITE");
      c(24067, 1, "gambling/SPRITE");
      a(24068, "Wasteland", "Select", this.a, 1, 16750623, false, true, var2);
      a(24069, "Plateau", "Select", this.a, 1, 16750623, false, true, var2);
      a(24070, "Sylvan Glade", "Select", this.a, 1, 16750623, false, true, var2);
      a(24071, "Forsaken Quarry", "Select", this.a, 1, 16750623, false, true, var2);
      a(24072, "Turrets", "Select", this.a, 1, 16750623, false, true, var2);
      a(24073, "Clan Cup Arena", "Select", this.a, 1, 16750623, false, true, var2);
      a(24074, "Ghastly Swamp", "Select", this.a, 1, 16750623, false, true, var2);
      a(24075, "Northleach Quell", "Select", this.a, 1, 16750623, false, true, var2);
      a(24076, "Gridlock", "Select", this.a, 1, 16750623, false, true, var2);
      a(24077, "Ethereal", "Select", this.a, 1, 16750623, false, true, var2);
      var4 = 3;

      for (int var6 = 24057; var6 <= 24077; var6++) {
         if (var6 == 24068) {
            var4 = 3;
         }

         int var7 = var6 >= 24068 ? 20 : 3;
         if (var6 == 24065 || var6 == 24076 || var6 == 24077 || var6 == 24066 || var6 == 24067) {
            var7 = -500;
         }

         var9.b(var6 - 24057, var6, var7, var4);
         var4 += 18;
      }

      c(24078, 2, "gambling/SPRITE");
      c(24079, 1, "gambling/SPRITE");
      c(24080, 1, "gambling/SPRITE");
      c(24081, 1, "gambling/SPRITE");
      a(24082, "Ignore freezing", "Select", this.a, 1, 16750623, false, true, 80);
      a(24083, "PJ timer", "Select", this.a, 1, 16750623, false, true, 80);
      a(24084, "Single spells", "Select", this.a, 1, 16750623, false, true, 80);
      a(24085, "EdgePvP mode", "Select", this.a, 1, 16750623, false, true, 80);
      a(24086, "clan/SPRITE", 10, 94, 40, "Accept", -1, 24087, 1);
      a(24087, "clan/SPRITE", 10, 94, 40, 24088);
      a(24089, "Accept", this.a, 1, 16750623, true);
      a(24090, "", this.a, 0, 16777215, true);
      var1.k(58);
      var1.b(0, 24001, 5, 6);
      var1.b(1, 24002, 260, 14);
      var1.b(2, 24003, 187, 75);
      var1.b(3, 24004, 187, 92);
      var1.b(4, 24005, 205, 75);
      var1.b(5, 24006, 205, 92);
      short var10 = 90;
      short var18 = 0;
      var1.b(6, 24007, 187 + var10, 75);
      var1.b(7, 24008, 187 + var10, 92);
      var1.b(8, 24009, 205 + var10, 75);
      var1.b(9, 24010, 205 + var10, 92);
      var10 = (byte)0;
      var18 = (byte)61;
      var1.b(10, 24011, 187 + var10, 75 + var18);
      var1.b(11, 24012, 187 + var10, 92 + var18);
      var1.b(12, 24013, 205 + var10, 75 + var18);
      var1.b(13, 24014, 205 + var10, 92 + var18);
      var10 = (byte)90;
      var18 = (byte)61;
      var1.b(14, 24015, 187 + var10, 75 + var18);
      var1.b(15, 24016, 187 + var10, 92 + var18);
      var1.b(16, 24017, 205 + var10, 75 + var18);
      var1.b(17, 24018, 205 + var10, 92 + var18);
      var10 = 180;
      var18 = (byte)0;
      var1.b(18, 24019, 187 + var10, 75 + var18);
      var1.b(19, 24020, 187 + var10, 92 + var18);
      var1.b(20, 24021, 187 + var10, 109 + var18);
      var1.b(21, 24022, 187 + var10, 126 + var18);
      var1.b(22, 24023, 205 + var10, 75 + var18);
      var1.b(23, 24024, 205 + var10, 92 + var18);
      var1.b(24, 24025, 205 + var10, 109 + var18);
      var1.b(25, 24026, 205 + var10, 126 + var18);
      var10 = 180;
      var18 = (byte)112;
      var1.b(26, 24027, 187 + var10, 75 + var18);
      var1.b(27, 24028, 187 + var10, 92 + var18);
      var1.b(28, 24029, 187 + var10, 109 + var18);
      var1.b(29, 24030, 205 + var10, 75 + var18);
      var1.b(30, 24031, 205 + var10, 92 + var18);
      var1.b(31, 24032, 205 + var10, 109 + var18);
      short var15 = 0;
      var18 = (byte)123;
      var1.b(32, 24033, 187 + var15, 75 + var18);
      var1.b(33, 24034, -500, 92 + var18);
      var1.b(34, 24035, 187 + var15, 92 + var18);
      var1.b(35, 24036, 205 + var15, 75 + var18);
      var1.b(36, 24037, -500, 92 + var18);
      var1.b(37, 24038, 205 + var15, 92 + var18);
      var15 = (byte)0;
      var18 = 208;
      var1.b(38, 24039, 187 + var15, 75 + var18);
      var1.b(39, 24040, -500 + var15, 92 + var18 - 1);
      var1.b(40, 24041, 205 + var15, 75 + var18);
      var1.b(41, 24042, -500 + var15, 92 + var18 - 1);
      var1.b(42, 24043, 17, 71);
      var1.b(43, 24056, 17, 157);
      var15 = -168;
      var18 = 173;
      var1.b(44, 24078, 187 + var15, 75 + var18);
      var1.b(45, 24079, 187 + var15, 92 + var18);
      var1.b(46, 24080, 187 + var15, 109 + var18);
      var1.b(47, 24081, 187 + var15, 126 + var18);
      var1.b(48, 24082, 205 + var15, 75 + var18);
      var1.b(49, 24083, 205 + var15, 92 + var18);
      var1.b(50, 24084, 205 + var15, 109 + var18);
      var1.b(51, 24085, 205 + var15, 126 + var18);
      var1.b(52, 24086, 354, 261);
      var1.b(53, 24087, 354, 261);
      var1.b(54, 24089, 401, 272);
      var1.b(55, 24090, 400, 303);
      var1.b(56, 63740, 481, 14);
      var1.b(57, 63741, 481, 14);
   }
}
