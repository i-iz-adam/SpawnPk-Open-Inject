package rs;

public class C_R_uc {
   public static final C_R_uc a = new C_R_uc(0, 0, 0);
   private int b;
   private int c;
   private int d;

   public C_R_uc(int var1, int var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public C_R_uc a(C_R_uc var1) {
      return new C_R_uc(this.b - var1.b, this.c - var1.c, this.d - var1.d);
   }

   public C_R_uc a(float var1) {
      return new C_R_uc((int)((float)this.b / var1), (int)((float)this.c / var1), (int)((float)this.d / var1));
   }

   public C_R_uc b(C_R_uc var1) {
      this.b = this.b + var1.b;
      this.c = this.c + var1.c;
      this.d = this.d + var1.d;
      return this;
   }

   public C_R_uc a(C_R_uc var1, float var2, float var3, float var4) {
      return new C_R_uc(this.b + (int)((float)var1.b * var2), this.c + (int)((float)var1.c * var3), this.d + (int)((float)var1.d * var4));
   }

   public C_R_uc d() {
      return new C_R_uc(this.b, this.c, this.d);
   }

   public int a(int var1, int var2) {
      int var3 = var2 - var1 + 1;
      return (int)(Math.random() * (double)var3) + var1;
   }

   @Override
   public String toString() {
      return "Vector{x=" + this.b + ", y=" + this.c + ", z=" + this.d + "}";
   }
}
