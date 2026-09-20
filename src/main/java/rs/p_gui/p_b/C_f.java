package rs.p_gui.p_b;

import rs.p_gui.C_x;

public class C_f {
   private final int a;
   private final int b;

   public C_f(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public C_f(int var1) {
      this.a = var1;
      this.b = 1;
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public C_x c() {
      C_g var1 = new C_g(this.a);
      return var1.b();
   }
}
