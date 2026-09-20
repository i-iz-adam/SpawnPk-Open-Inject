package rs.p_l.p_e.p_a;

import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public class C_t extends C_s {
   private static final String r = " <img=9> Claim";

   @Override
   public void b() {
      this.p = new C_F_uc("misc/treasure");
      this.q = new C_F_uc("misc/treasure 2");
   }

   @Override
   public void f() {
      C_Client_mc.ap = "::claimcoffer";
   }

   @Override
   public int g() {
      return 16753931;
   }

   @Override
   public int h() {
      return 7359745;
   }

   @Override
   public String i() {
      return " <img=9> Claim";
   }
}
