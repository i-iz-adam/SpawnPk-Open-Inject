package rs.p_s.p_q.p_a;

public class C_b {
   private String a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private boolean g = false;

   public C_b(String var1) {
      this.a = var1;
   }

   public void a(int var1) {
      this.d += var1;
   }

   public void a(boolean var1) {
      this.c++;
      if (var1) {
         this.b++;
      }
   }

   public void b(boolean var1) {
      this.e++;
      if (var1) {
         this.f++;
      }
   }

   public void a(int var1, int var2) {
      this.e = var2;
      this.f = var1;
   }

   public void b(int var1, int var2) {
      this.c = var2;
      this.b = var1;
   }

   public float a() {
      return Math.min(1.0F, this.f == 0 && this.e == 0 ? 0.0F : (float)this.f / (float)this.e);
   }

   public float b() {
      return Math.min(1.0F, this.b == 0 && this.c == 0 ? 0.0F : (float)this.b / (float)this.c);
   }

   public String b(int var1) {
      return this.d < var1 ? this.d + " (" + (this.d - var1) + ")" : this.d + " (+" + (this.d - var1) + ")";
   }

   public String c() {
      int var1 = (int)Math.ceil((double)(this.a() * 100.0F));
      return this.f + "/" + this.e + " (" + var1 + "%)";
   }

   public String d() {
      int var1 = (int)Math.ceil((double)(this.b() * 100.0F));
      return this.b + "/" + this.c + " (" + var1 + "%)";
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public int h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public boolean j() {
      return this.g;
   }

   public String k() {
      return this.a;
   }

   public void a(String var1) {
      this.a = var1;
   }

   public void c(int var1) {
      this.b = var1;
   }

   public void d(int var1) {
      this.c = var1;
   }

   public void e(int var1) {
      this.d = var1;
   }

   public void f(int var1) {
      this.e = var1;
   }

   public void g(int var1) {
      this.f = var1;
   }

   public void c(boolean var1) {
      this.g = var1;
   }
}
