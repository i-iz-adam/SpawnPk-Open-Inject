package rs.p_e;

public class C_k {
   private final long a;
   private String b;
   private boolean c;
   private boolean d;
   private long e;

   public boolean a() {
      return this.b.startsWith("$");
   }

   C_k(long var1) {
      this.a = var1;
   }

   @Override
   public String toString() {
      return "ConfigProfile(id=" + this.b() + ", name=" + this.c() + ", sync=" + this.d() + ", active=" + this.e() + ", rev=" + this.f() + ")";
   }

   public long b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   void a(String var1) {
      this.b = var1;
   }

   public boolean d() {
      return this.c;
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   public boolean e() {
      return this.d;
   }

   public void b(boolean var1) {
      this.d = var1;
   }

   long f() {
      return this.e;
   }

   void a(long var1) {
      this.e = var1;
   }
}
