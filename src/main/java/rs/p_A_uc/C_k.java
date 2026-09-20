package rs.p_A_uc;

import com.google.common.base.CharMatcher;

class C_k extends CharMatcher {
   @Override
   public boolean matches(char var1) {
      return var1 >= ' ' && var1 <= '~' || var1 == 128 || var1 >= 160 && var1 <= 255;
   }
}
