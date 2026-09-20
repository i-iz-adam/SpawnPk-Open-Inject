package rs.p_l.p_f;

public enum C_a {
   a,
   b,
   c,
   d,
   e,
   f,
   g,
   h,
   i,
   j,
   k,
   l,
   m,
   n,
   o,
   p,
   q,
   r,
   s(true),
   t(true),
   u(true),
   v(true),
   w(true),
   x(true),
   y(true),
   z(true),
   A(true);

   boolean B = true;

   private C_a(boolean var3) {
      this.B = var3;
   }

   private C_a() {
      this.B = false;
   }
}
