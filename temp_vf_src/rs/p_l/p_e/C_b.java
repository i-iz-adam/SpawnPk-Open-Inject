package rs.p_l.p_e;

class C_b {
   public final String a;
   public final long b;
   public String c;

   public C_b(String var1, long var2) {
      this.a = var1;
      this.b = var2;
   }

   public String a() {
      return this.c == null ? this.a : this.c;
   }
}
