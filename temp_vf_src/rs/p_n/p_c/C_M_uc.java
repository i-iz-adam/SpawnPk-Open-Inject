package rs.p_n.p_c;

public class C_M_uc extends rs.p_n.C_c {
   public C_M_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(60050);
      c(60051, 4, "misc/event");
      a(60061, "@or1@Vote for us and receive rewards!", this.a, 2, 16751360, true, true);
      a(60052, "misc/event", 1, 382, 78, "Vote for us on TopG", -1, 60053, 1);
      a(60053, "misc/event", 0, 382, 78, 60054);
      a(60055, "misc/event", 2, 382, 78, "Vote for us on RuneLocus", -1, 60056, 1);
      a(60056, "misc/event", 0, 382, 78, 60057);
      a(60058, "misc/event", 3, 382, 78, "Vote for us on RSPS-List", -1, 60059, 1);
      a(60059, "misc/event", 0, 382, 78, 60060);
      a(60164, "misc/event", 5, 382, 78, "Vote for us on Moparscape", -1, 60165, 1);
      a(60165, "misc/event", 0, 382, 78, 60166);
      rs.p_n.C_e var2 = d(60163);
      var2.aH = 1000;
      var2.P = 400;
      var2.aR = 284;
      var2.bj = 87;
      var2.k(6);
      byte var3 = 0;
      byte var4 = -35;
      var2.b(0, 60055, var3, 51 + var4);
      var2.b(1, 60056, var3, 51 + var4);
      var2.b(2, 60058, var3, 141 + var4);
      var2.b(3, 60059, var3, 141 + var4);
      var2.b(4, 60052, var3, 231 + var4);
      var2.b(5, 60053, var3, 231 + var4);
      byte var5 = -15;
      byte var6 = 0;
      var1.k(5);
      var1.b(0, 60051, 44 + var5, 8 + var6);
      var1.b(1, 60163, 57, 36 + var6);
      var1.b(2, 63740, 464, 15);
      var1.b(3, 63741, 464, 15);
      var1.b(4, 60061, 260 + var5, 16);
   }
}
