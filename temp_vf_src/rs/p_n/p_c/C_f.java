package rs.p_n.p_c;

public class C_f extends rs.p_n.C_c {
   public static boolean c = false;

   public C_f(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      a(35113, "<u>Player attack options", this.a, 1, 0, true, false);
      a(35114, "<u>NPC/Bot attack options", this.a, 1, 0, true, false);
      c(35115, 1, "gambling/SPRITE");
      a(35116, "<tab=20><img=14> Always right-click clan members", "Select option", this.a, 0, 0, false, false, 150);
      rs.p_n.C_e var1 = d(35112);
      var1.k(13);
      byte var2 = 15;
      int var3 = 125;
      byte var4 = 25;
      int var5 = var2 + 50;
      var1.b(0, 35115, var3 + 100, 53 + var2);
      var1.b(1, 35116, var3 + 100, 55 + var2);
      var1.b(2, 35109, var3 - 55, var2 + 20);
      var1.b(3, 35108, var3 + 10, var2 + 5 + 20);
      var1.b(4, 35114, var3 + 16, 1 + var2);
      var1.b(5, 35102, var3 + var4 - 5, var5);
      var1.b(6, 35107, var3 + var4 - 57 - 5, var5 + 4);
      var3 += 180;
      var1.b(7, 35098, var3 - 55, var2 + 20);
      var1.b(8, 35097, var3 + 10, var2 + 5 + 20);
      var1.b(9, 35113, var3 + 15, 1 + var2);
      var1.b(10, 35091, var3 + var4 - 5, var2);
      var1.b(11, 35096, var3 + var4 - 57 - 5, var2 + 4);
      var1.b(12, 54195, 400, 1);
      rs.p_n.C_e.H['褨'].b(5, 35102, -600, -600);
      rs.p_n.C_e.H['褨'].b(6, 35107, -600, -600);
      rs.p_n.C_e.H['褨'].b(10, 35091, -600, -600);
      rs.p_n.C_e.H['褨'].b(11, 35096, -600, -600);
   }
}
