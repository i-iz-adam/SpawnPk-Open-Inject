package rs.p_l.p_c;

class C_e {
   private String a;
   private int b;
   private int c;
   private int d;

   public C_e(String var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = 0;
   }

   public String a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public void a(int var1) {
      this.d = var1;
   }
}
