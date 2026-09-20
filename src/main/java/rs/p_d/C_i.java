package rs.p_d;

// $VF: synthetic class
class C_i {
   static final int[] a = new int[C_h.a.values().length];

   static {
      try {
         a[C_h.a.a.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[C_h.a.b.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[C_h.a.c.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
