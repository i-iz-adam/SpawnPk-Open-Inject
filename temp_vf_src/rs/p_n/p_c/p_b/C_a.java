package rs.p_n.p_c.p_b;

import p_gnu.p_trove.p_f.p_b.C_dg;
import rs.p_l.C_F_uc;
import rs.p_l.C_K_uc;
import rs.p_n.C_e;

public class C_a extends rs.p_n.C_c {
   public static final C_dg<String> c = new C_dg();
   public static rs.p_n.p_d.C_c d;
   public static rs.p_n.p_d.C_c e;
   public static final String f = "<str=8683352>                                                                                                                                                    </str>";
   public static final String g = "                                                                                                                                                    </str>";
   public static String bI = null;
   public static int bJ = 0;
   public static final int bK = 57016;

   public C_a(C_K_uc[] var1) {
      super(var1);
   }

   public static void h() {
      c.clear();
   }

   public static void m(int var0) {
      switch (var0) {
         case 32019:
            l(57016).P = 325;
            l(57016).aR = rs.p_n.p_c.p_c.C_a.cf;
            l(57016).bf = !rs.p_n.p_c.p_c.C_a.i().f();
            break;
         case 32600:
            l(57016).P = 480;
            l(57016).aR = 280;
            l(57016).bf = true;
            break;
         case 56998:
            l(57016).P = 454;
            l(57016).aR = 285;
            l(57016).bf = true;
            break;
         case 57000:
            l(57016).P = 454;
            l(57016).aR = 193;
            l(57016).bf = true;
      }

      if ((var0 == 56998 || var0 == 57000) && bI != null) {
         int var1 = l(57016).V;
         c.a(bI, var1);
      }
   }

   @Override
   public void a() {
      C_e var1 = d(57000);
      h(57001, "event/task 1");
      a(57002, "Gladiator's Vindication (World Event)", this.a, 2, 16750623, true);
      a(57003, "Event duration ends in: @yel@<img=37> 14 days", this.a, 0, 16750623, true);
      a(57004, 5, 0, 57005, 16, "fountain/sprite", 120, 34, "Select button");
      a(57005, 15, "fountain/sprite", 120, 34, 57006);
      a(57007, 5, 0, 57008, 16, "fountain/sprite", 120, 34, "Select button");
      a(57008, 15, "fountain/sprite", 120, 34, 57009);
      a(57010, 5, 0, 57011, 16, "fountain/sprite", 120, 34, "Select button");
      a(57011, 15, "fountain/sprite", 120, 34, 57012);
      a(57013, "Button 1", this.a, 1, 16750623, true);
      a(57014, "Button 2", this.a, 1, 16750623, true);
      a(57015, "Button 3", this.a, 1, 16750623, true);
      e = new rs.p_n.p_d.C_c(rs.p_n.p_a.C_d.a(57016));
      C_e var2 = H['\udeb8'];
      var2.aH = 1250;
      var2.P = 454;
      var2.aR = 193;
      var2.bj = 87;
      byte var3 = 3;

      for (int var4 = 57017; var4 <= 57217; var4 += 2) {
         a(var4, "Test " + var4, "Select this option", this.a, 0, 16750623, false, true, 300);
         c(var4 + 1, 14484, 32);
         C_e.H[var4 + 1].bf = false;
         e.a(var4).a(35, var3 + 12);
         e.a(var4 + 1).a(0, var3);
         var3 += 30;
      }

      e.a();
      a(57220, "Progress bar description", this.a, 0, 16750623, true);
      a(57221, "0% (0/100)", this.a, 0, 0, true, false);
      c(57222, 21, "event/task");
      C_e.H['\udf86'].E = new C_F_uc("event/task 2", 92, 15);
      a(57223, "drops/sprite", 3, 17, 17, "Go back", -1, 57224, 1);
      a(57224, "drops/sprite", 4, 17, 17, 57225);
      C_e.H['\udf87'].bf = false;
      var1.k(20);
      int var5 = 0;
      var1.b(var5++, 57001, 12, 7);
      var1.b(var5++, 57002, 262, 11);
      var1.b(var5++, 57003, 262, 28);
      var1.b(var5++, 57004, 41, 278);
      var1.b(var5++, 57005, 41, 278);
      var1.b(var5++, 57013, 100, 287);
      var1.b(var5++, 57007, 196, 278);
      var1.b(var5++, 57008, 196, 278);
      var1.b(var5++, 57014, 255, 287);
      var1.b(var5++, 57010, 351, 278);
      var1.b(var5++, 57011, 351, 278);
      var1.b(var5++, 57015, 410, 287);
      var1.b(var5++, 57016, 22, 43);
      var1.b(var5++, 57220, 256, 242);
      var1.b(var5++, 57222, 72, 255);
      var1.b(var5++, 57221, 256, 257);
      var1.b(var5++, 65418, 476, 15);
      var1.b(var5++, 65419, 476, 15);
      var1.b(var5++, 57223, 18, 15);
      var1.b(var5++, 57224, 18, 15);
      this.i();
   }

   public void i() {
      C_e var1 = d(56998);
      d = new rs.p_n.p_d.C_c(var1);
      h(56999, "event/task 3");
      C_e var2 = d(56997);
      d.a(56999).a(12, 7);
      d.a(57002).a(262, 13);
      d.a(57016).a(22, 32);
      d.a(65418).a(476, 12);
      d.a(65419).a(476, 12);
      d.a(57223).a(18, 12);
      d.a(57224).a(18, 12);
      d.a();
   }
}
