package rs.p_n.p_c;

public class C_an extends rs.p_n.C_c {
   public C_an(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(26700);
      c(26701, 0, "misc/BAG");
      a(26702, "misc/BAG", 1, 16, 16, "Close", 0, 26703, 1);
      a(26703, "misc/BAG", 2, 16, 16, 26704);
      a(26705, "Looting bag", this.a, 2, 16750848, true, true);
      b(26706, 4, 7, 13, 0);
      H[26706].W = new String[]{"Deposit 1", "Deposit 5", "Deposit 10", "Deposit All"};
      a(26707, "This bag is empty.", this.a, 1, 16750848, true, true);
      b(26708, 3, "misc/BAG", "Deposit all to bank");
      var1.k(7);
      var1.b(0, 26701, 9, 21);
      var1.b(1, 26702, 168, 4);
      var1.b(2, 26703, 168, 4);
      var1.b(3, 26705, 95, 4);
      var1.b(4, 26706, 12, 23);
      var1.b(5, 26707, 95, 113);
      var1.b(6, 26708, 10, 1);
   }
}
