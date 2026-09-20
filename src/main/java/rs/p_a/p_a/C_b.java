package rs.p_a.p_a;

// $VF: synthetic class
class C_b {
   static final int[] a = new int[C_a.c_type.values().length];
   static final int[] b = new int[C_a.a_type.values().length];

   static {
      try {
         b[C_a.a_type.a.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         b[C_a.a_type.b.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[C_a.c_type.a.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[C_a.c_type.b.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[C_a.c_type.c.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
