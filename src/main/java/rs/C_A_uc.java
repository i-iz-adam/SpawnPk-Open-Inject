package rs;

import java.util.Random;

public class C_A_uc implements C_M_uc {
   private C_R_uc a;

   public C_A_uc(C_R_uc var1) {
      this.a = var1;
   }

   @Override
   public C_R_uc a(Random var1) {
      return this.a.d();
   }
}
