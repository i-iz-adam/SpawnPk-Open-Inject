package rs.p_g;

public class C_a {
   public int a;
   public int b;
   public int c;
   public int d;

   public C_a(int var1, int var2, int var3, int var4) {
      this.a(var1, var2);
      this.b(var3, var4);
   }

   public C_a(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public void a(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void b(int var1, int var2) {
      this.c = var1;
      this.d = var2;
   }

   @Override
   public String toString() {
      return null;
   }
}
