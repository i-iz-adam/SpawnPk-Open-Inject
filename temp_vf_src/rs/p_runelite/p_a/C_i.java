package rs.p_runelite.p_a;

public class C_i {
   private final int a;
   private final int b;

   public C_i(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public String toString() {
      return "Point{x=" + this.a + ", y=" + this.b + "}";
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int a(C_i var1) {
      return (int)Math.hypot((double)(this.a() - var1.a()), (double)(this.b() - var1.b()));
   }

   @Override
   public int hashCode() {
      int var1 = 3;
      var1 = 23 * var1 + this.a;
      return 23 * var1 + this.b;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         C_i var2 = (C_i)var1;
         return this.a != var2.a ? false : this.b == var2.b;
      }
   }
}
