package rs.p_n.p_c;

public class C_E_uc extends rs.p_n.C_c {
   public C_E_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(25754);
      h(25755, "popups/duel");
      c(25756, 1, "gambling/SPRITE");
      c(25757, 1, "gambling/SPRITE");
      c(25758, 1, "gambling/SPRITE");
      a(25759, "Standard duel", "Select", this.a, 0, 12171349, false, true, 160);
      a(25760, "Whip only", "Select", this.a, 0, 12171349, false, true, 160);
      a(25761, "Whip + dds only", "Select", this.a, 0, 12171349, false, true, 160);
      a(25762, "Select a duel type..", this.a, 2, 16751360, false, true);
      a(25763, "Invite", "Select", this.a, 0, 65280, false, true, 160);
      a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
      a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
      byte var2 = 20;
      var1.k(11);
      var1.b(0, 25755, 171, 85);
      var1.b(1, 25762, 181, 96);
      var1.b(2, 25756, 184, 129);
      var1.b(3, 25759, 204, 131);
      var1.b(4, 25757, 184, 129 + var2);
      var1.b(5, 25760, 204, 131 + var2);
      var1.b(6, 25758, 184, 129 + var2 * 2);
      var1.b(7, 25761, 204, 131 + var2 * 2);
      var1.b(8, 25763, 252, 208);
      var1.b(9, 65418, 330, 95);
      var1.b(10, 65419, 330, 95);
   }
}
