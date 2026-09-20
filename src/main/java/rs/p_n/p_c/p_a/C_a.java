package rs.p_n.p_c.p_a;

import rs.p_l.C_K_uc;
import rs.p_n.C_c;
import rs.p_n.C_e;
import rs.p_n.p_c.C_A_uc;

public class C_a extends C_c {
   public static int c = 30700;
   public static rs.p_n.p_d.C_c d;
   public static final rs.p_q.p_a.p_a.C_a e = new C_b();

   public C_a(C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      C_e var1 = d(c);
      d = new rs.p_n.p_d.C_c(var1);
      h();
   }

   public static void m(int var0) {
      C_A_uc.i();
      d.b();
      i();
   }

   public static void a(int var0, int var1, boolean var2) {
      C_A_uc.i();
      d.b();
      C_A_uc.a(14171, var0, var1, 167, 123, var2);
      i();
   }

   public static void h() {
      byte var0 = 2;
      byte var1 = 2;
      byte var2 = 10;
      d = new rs.p_n.p_d.C_c(C_e.l(c));
      C_A_uc.a(14171, 21235, 1, 167, 123, false);
      d.a(6181).a(var0, var2 + var1);
      d.a(6182).a(var0, var2 + 15 + var1);
      d.a(6183).a(var0, var2 + 30 + var1);
      d.a(6184).a(var0, var2 + 45 + var1);
      d.a(4892).a(var0 + 67, 77 + var1);
      d.a();
   }

   private static void i() {
      byte var0 = 5;
      byte var1 = -10;
      byte var2 = 10;
      d.a(6181).a(52, var2 + var0);
      d.a(6182).a(52, var2 + 15 + var0);
      d.a(6183).a(52, var2 + 30 + var0);
      d.a(6184).a(52, var2 + 45 + var0);
      d.a(4892).a(117, 77 + var0);
      d.a(14171).a(-16, var1 + var0);
      d.a();
   }
}
