package rs.p_l;

public class C_i {
   private final int a;
   private int b = 0;
   private int c = 1;

   public C_i(int var1) {
      this.a = var1;
   }

   public void a() {
      this.b = this.b + this.c;
      if (this.b >= this.a) {
         this.c = -1;
      } else if (this.b <= 0) {
         this.c = 1;
      }
   }

   public int b() {
      return this.b;
   }
}
