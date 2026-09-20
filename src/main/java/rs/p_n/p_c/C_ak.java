package rs.p_n.p_c;

public class C_ak extends rs.p_n.C_c {
   public C_ak(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(48999);
      c(48998, 5, "construction/sprite");
      String var2 = "LOGS/ICON";
      a(48002, var2, 1, 16, 16, "Close Window", 0, 48003, 1);
      a(48003, var2, 2, 16, 16, 48004);
      b(48997, 6, "construction/sprite", "Edgeville teleport");
      b(48996, 7, "construction/sprite", "Home teleport");
      b(48995, 8, "construction/sprite", "Bounty teleport");
      var1.k(6);
      var1.b(0, 48998, 0, 0);
      var1.b(1, 48002, 493, 9);
      var1.b(2, 48003, 493, 9);
      var1.b(3, 48997, 51, 52);
      var1.b(4, 48996, 133, 52);
      var1.b(5, 48995, 215, 52);
      rs.p_n.C_e.H['뽥'].bf = false;
      rs.p_n.C_e.H['뽤'].bf = false;
      rs.p_n.C_e.H['뽣'].bf = false;
   }
}
