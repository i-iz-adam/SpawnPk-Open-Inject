package rs.p_n.p_c;

public class C_aK_mc extends rs.p_n.C_c {
   public C_aK_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(29600);
      h(29601, "raids/sprite 5");
      a(29613, "Raiding party invitations", this.a, 2, 16750623);
      a(29614, "Party invitations", this.a, 2, 16750623);
      rs.p_n.C_e var2 = d(29602);
      var2.P = 169;
      var2.aR = 208;
      var2.aH = 600;
      var2.k(10);
      a(29603, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29604, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29605, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29606, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29607, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29608, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29609, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29610, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29611, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
      a(29612, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);

      for (int var3 = 0; var3 < 10; var3++) {
         var2.b(var3, 29603 + var3, 5, 5 + var3 * 15);
      }

      var1.k(6);
      var1.b(0, 29601, 144, 19);
      var1.b(1, 29602, 177, 89);
      var1.b(2, 29614, 212, 60);
      var1.b(3, 29613, 181, 25);
      var1.b(4, 63740, 361, 25);
      var1.b(5, 63741, 361, 25);
   }
}
