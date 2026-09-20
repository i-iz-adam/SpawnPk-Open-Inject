package rs.p_n.p_c.p_d;

public class C_b {
   public static void a() {
      short var0 = 32487;
      short var1 = 32516;
      String var2 = "<img=291><tab=150><img=291><tab=225><img=291>";

      for (int var3 = var0; var3 <= var1; var3++) {
         C_a.l(var3).at = "<img=291><tab=150><img=291><tab=225><img=291>";
      }
   }

   public static void b() {
      short var0 = 32487;
      short var1 = 32516;
      String var2 = "---<tab=150>--<tab=225>---------";

      for (int var3 = var0; var3 <= var1; var3++) {
         C_a.l(var3).at = "---<tab=150>--<tab=225>---------";
      }
   }

   public static void a(rs.p_n.p_d.C_c var0) {
      var0.a(rs.p_n.p_a.C_e.a(32480, "raids/list")).b(32301, 11, 50);
      rs.p_n.p_a.C_d var1 = rs.p_n.p_a.C_d.a(32481).g(469, 235).m(560);
      var1.a(rs.p_n.p_a.C_f.a(32486, "")).a(0, 0);
      short var2 = 32487;
      short var3 = 32516;
      byte var4 = 10;
      byte var5 = 3;

      for (int var6 = var2; var6 <= var3; var6++) {
         rs.p_n.p_a.C_f.a(var6, "---<tab=150>--<tab=225>---------").a("Join party", 483).l();
         var1.n(var6).a(var4, var5 + (var6 - var2) * 18);
      }

      var1.a();
      var0.a(var1).b(32480, 3, 24);
      var0.a(rs.p_n.p_a.C_f.a(32482, "Party<tab=150>Size<tab=225>Raid Type & Difficulty").j().m()).b(32480, var4 + 2, 5);
      var0.a(rs.p_n.p_a.C_a.b(32597, "raids/refresh 1", "Refresh party list").a().a("raids/refresh 2")).b(32301, 483, 53);
      var0.a(rs.p_n.p_a.C_a.b(32595, "raids/close1", "Close interface").b("raids/close2")).b(32301, 493, 3);
   }
}
