package rs.p_n.p_c;

import rs.C_Client_mc;

public class C_U_uc extends rs.p_n.C_c {
   public static final int c = 100;

   public C_U_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(51200);
      h(51201, "misc/matcher 1");
      rs.p_n.C_e var2 = d(51202);
      var2.aH = 1750;
      var2.P = 477;
      var2.aR = 224;
      var2.k(100);
      char var3 = '젃';
      int var4 = var3;

      for (int var5 = 0; var5 < 100; var5++) {
         int var6 = 5 + C_Client_mc.d(100);
         String var7 = "<col=0xB9B855>Test" + (var5 + 1) + " <tab=360>@lre@(" + C_Client_mc.d(var6) + "/" + var6 + " logins)";
         if (C_Client_mc.d(10) == 0) {
            var7 = "@red@[BANNED]</col> " + var7;
         } else if (C_Client_mc.d(10) == 0) {
            var7 = (C_Client_mc.d(2) == 0 ? "@gre@[ONLINE]</col> " : "@gre@[ONLINE (Non-match)]</col> ") + var7;
         }

         b(var4++, var7, "Action", this.a, 1, 12171349, false, true, 500);
         var2.b(var5, var4 - 1, 3, 3 + var5 * 16);
      }

      int var30 = var4++;
      a(var30, "Player IP / UID Matcher", this.a, 2, 16750623, true, true);
      int var31 = var4++;
      a(var31, "@whi@IP Address: @gre@Not banned", this.a, 0, 16777215, false, true);
      int var32 = var4++;
      a(var32, "@whi@UID: @gre@Not banned", this.a, 0, 16777215, false, true);
      int var8 = var4++;
      a(var8, "misc/login", 2, 130, 27, "Ban all", -1, var4++, 1);
      a(var4 - 1, "misc/login", 3, 130, 27, var4++);
      int var9 = var4++;
      a(var9, "Ban ALL", this.a, 1, 16750623, true, true);
      int var10 = var4++;
      b(var10, "<tab=17>@yel@Order by total matches", "Order by total matches", this.a, 0, 16750623, false, true, 130);
      c(var4++, 2, "gambling/SPRITE");
      int var11 = var4++;
      b(var11, "<tab=17>@yel@Order by most recent", "Order by recent matches", this.a, 0, 16750623, false, true, 150);
      c(var4++, 1, "gambling/SPRITE");
      int var12 = var4++;
      b(var12, "<img=39>@yel@ Search new name", "Search a new name", this.a, 0, 16750623, false, true, 150);
      int var13 = var4;
      a(var4++, "drops/sprite", 3, 17, 17, "Go back", -1, var4, 1);
      a(var4++, "drops/sprite", 4, 17, 17, var4++);
      a(52050, "@whi@Geolocation: @gre@N/A", this.a, 0, 16777215, false, true);
      a(52051, "misc/login", 2, 130, 27, "Ban this IP/UID", -1, 52052, 1);
      a(52052, "misc/login", 3, 130, 27, 52053);
      a(52054, "Ban *this* IP/UID", this.a, 1, 16750623, true, true);
      var1.k(19);
      var1.b(0, 51201, 0, 0);
      var1.b(1, 51202, 13, 52);
      var1.b(2, var30, 256, 8);
      var1.b(3, var31, 14, 285);
      var1.b(4, var32, 14, 299);
      var1.b(5, var8, 377, 279);
      var1.b(6, var8 + 1, 377, 279);
      var1.b(7, var9, 440, 287);
      short var14 = 224;
      var1.b(8, var10, var14 + 12, 36);
      var1.b(9, var10 + 1, var14 + 12 - 2, 34);
      var1.b(10, var11, var14 + 12 + 140, 36);
      var1.b(11, var11 + 1, var14 + 12 - 2 + 140, 34);
      var1.b(12, var12, 10, 36);
      var1.b(13, var13, 7, 7);
      var1.b(14, var13 + 1, 7, 7);
      var1.b(15, 52050, 14, 313);
      var1.b(16, 52051, 377, 303);
      var1.b(17, 52052, 377, 303);
      var1.b(18, 52054, 440, 311);
   }
}
