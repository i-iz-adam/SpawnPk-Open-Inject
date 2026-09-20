package rs.p_n.p_c;

public class C_I_uc extends rs.p_n.C_c {
   public C_I_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = H[1644];
      c(15101, 0, "equipment/bl");
      c(15102, 1, "equipment/bl");
      c(15109, 2, "equipment/bl");
      g(15103);
      g(15104);
      var1.al[23] = 15101;
      var1.am[23] = 40;
      var1.bc[23] = 205;
      var1.al[24] = 15102;
      var1.am[24] = 110;
      var1.bc[24] = 205;
      var1.al[25] = 15109;
      var1.am[25] = 39;
      var1.bc[25] = 240;
      var1.al[26] = 27650;
      var1.am[26] = 0;
      var1.bc[26] = 0;
      var1 = d(27650);
      a(27653, 1, "equipment/BOX", "Show Equipment Stats", 27655, 1, 40, 39);
      f(27655, "Show Equipment Stats");
      a(27654, 2, "equipment/BOX", "Show Items Kept on Death", 27657, 1, 40, 39);
      f(27657, "Show Items Kept on Death");
      h(27700, "equipment/outline");
      a(27701, Boolean.valueOf(false));
      H[27701].W = new String[]{"Remove", null, null, null, null};
      H[27701].ac = 11;
      a(6, var1);
      b(27700, 78, 207, 0, var1);
      b(27701, 80, 209, 1, var1);
      b(27653, 29, 205, 2, var1);
      b(27654, 124, 205, 3, var1);
      b(27655, 39, 240, 4, var1);
      b(27657, 39, 220, 5, var1);
   }
}
