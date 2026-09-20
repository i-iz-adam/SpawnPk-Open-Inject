package rs.p_a.p_a;

// $VF: synthetic class
class C_b {
   static {
      try {
         b[C_a.a.a.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         b[C_a.a.b.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      a = new int[C_a.c.values().length];

      try {
         a[C_a.c.a.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[C_a.c.b.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[C_a.c.c.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
