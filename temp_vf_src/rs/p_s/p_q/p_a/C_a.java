package rs.p_s.p_q.p_a;

public class C_a {
   private C_b a = new C_b("N/A");
   private C_b b = new C_b("N/A");
   private int c;

   public void a(int var1, C_b var2) {
      this.c += var1;
      var2.a(var1);
   }

   public boolean a() {
      return this.a.a() > this.b.a();
   }

   public boolean b() {
      return this.a.b() > this.b.b();
   }

   public boolean c() {
      return this.a.k().equalsIgnoreCase("N/A") || this.b.k().equalsIgnoreCase("N/A");
   }

   public C_b d() {
      return this.a;
   }

   public void a(C_b var1) {
      this.a = var1;
   }

   public C_b e() {
      return this.b;
   }

   public void b(C_b var1) {
      this.b = var1;
   }

   public int f() {
      return this.c;
   }

   public void a(int var1) {
      this.c = var1;
   }
}
