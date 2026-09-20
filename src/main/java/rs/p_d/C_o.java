package rs.p_d;

// $VF: synthetic class
class C_o {
   static final int[] a = new int[C_n.a_type.values().length];

   static {
      try {
         a[C_n.a_type.a.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[C_n.a_type.b.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}
