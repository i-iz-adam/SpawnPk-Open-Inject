package rs.p_n.p_c.p_c;

import rs.p_l.C_F_uc;
import rs.p_l.C_K_uc;
import rs.p_n.p_a.C_f;

public class C_a extends rs.p_n.C_c {
   public static rs.p_n.p_d.C_c c;
   public static rs.p_n.p_d.C_c d;
   public static final int e = 32019;
   static final int f = 32020;
   static final int g = 32021;
   static final int bI = 32022;
   static final int bJ = 32023;
   static final int bK = 32024;
   static final int bL = 32025;
   static final int bM = 32026;
   static final int bN = 32165;
   static final int bO = 32166;
   static final int bP = 32167;
   static final int bQ = 32168;
   static final int bR = 32169;
   static final int bS = 32170;
   static final int bT = 32175;
   static final int bU = 32176;
   static final int bV = 32177;
   static final int bW = 32178;
   static final int bX = 32181;
   static final int bY = 32184;
   static final int bZ = 32185;
   static final int ca = 32188;
   static C_F_uc cb;
   static C_F_uc cc;
   static C_F_uc cd;
   static C_F_uc ce;
   public static int cf = 184;
   private static final C_b cg = new C_b();
   private static final C_c ch = new C_c();

   public C_a(C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      cb = new C_F_uc(true, "misc/mail 4");
      cc = new C_F_uc(true, "misc/mail 5");
      cd = new C_F_uc(true, "misc/mail 11");
      ce = new C_F_uc(true, "misc/mail 12");
      rs.p_n.C_e var1 = d(32019);
      c = new rs.p_n.p_d.C_c(var1);
      c.a(rs.p_n.p_a.C_e.a(32020, "misc/mail 1").a()).a(3, 2);
      c.a(C_f.a(32021, "No mail message selected!").i().b().m(12171349)).a(32020, 337, 154);
      c.a(C_f.a(32022, "Inbox (35 / 35)").j().m(16750623)).a(32020, 52, 11);
      rs.p_n.p_a.C_a.b(32185, "misc/refresh 1", "").a(32186, "misc/refresh 2");
      c.a(32185).a(32020, 8, 8);
      c.a(32186).a(32020, 8, 8);
      rs.p_n.p_a.C_d var2 = rs.p_n.p_a.C_d.f(32023, 134, 288);
      d = new rs.p_n.p_d.C_c(var2);
      d.a();
      cg.a();

      for (int var3 = 0; var3 < 35; var3++) {
         cg.a(C_b.a.a, "Test message #" + var3);
      }

      cg.b();
      c.a(32023).a(32020, 8, 35);
      c.a(rs.p_n.p_a.C_e.a(32166, "misc/mail 2")).a(32020, 163, 8);
      c.a(C_f.a(32168, "Mail Subject").j().m(16750623)).a(32166, 171, 13);
      c.a(C_f.a(32169, "<img=37> Sent 'x' time ago (Expires in 'x' time)").i().m(12171349)).a(32166, 169, 36);
      c.a(rs.p_n.p_a.C_a.b(32184, "misc/mail 6", "Delete this message").a()).a(32166, 472, 31);
      c.a(57016).a(32020, 162, 57);
      c.a(rs.p_n.p_a.C_e.a(32167, "misc/mail 3")).a(32020, 163, 241);
      c.a(C_f.a(32170, "<img=209> Items / Rewards").j().m(16750623)).a(32167, 171, 254);
      rs.p_n.p_a.C_d var6 = rs.p_n.p_a.C_d.f(32177, 321, 44);
      rs.p_n.p_a.C_c var4 = rs.p_n.p_a.C_c.g(32175, 28).a(7);
      rs.p_n.p_d.C_c var5 = new rs.p_n.p_d.C_c(var6);
      var5.a(var4).a(5, 7);
      var5.a();
      c.a(var6).a(32167, 167, 280);
      c.a(rs.p_n.p_a.C_e.a(32188, "misc/mail 10").a()).a(32167, 167, 280);
      l(32188).bf = false;
      c.a(C_f.a(32176, "No items attached to this message!").i().m(12171349).b()).a(32167, 341, 295);
      rs.p_n.p_a.C_a.b(32181, "bank/bank 17", "Deposit items to inventory").a(32182, "bank/bank 18");
      c.a(32181).a(32167, 428, 249);
      c.a(32182).a(32167, 428, 249);
      rs.p_n.p_a.C_a.b(32178, "bank/bank 31", "Deposit items to bank").a(32179, "bank/bank 32");
      c.a(32178).a(32167, 466, 249);
      c.a(32179).a(32167, 466, 249);
      ch.a(C_c.a.c);
      ch.b();
      c.a(63740).a(32020, 485, 8);
      c.a(63741).a(32020, 485, 8);
      c.a();
   }

   public static C_b h() {
      return cg;
   }

   public static C_c i() {
      return ch;
   }
}
