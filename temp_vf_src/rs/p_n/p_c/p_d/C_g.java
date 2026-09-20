package rs.p_n.p_c.p_d;

public class C_g extends rs.p_l.p_f.p_b.C_d {
   private final int h;
   private final int i;

   @Override
   public void a() {
      boolean var1 = false;
      rs.p_n.C_e var2 = rs.p_n.C_e.l(this.h);
      int var3 = var2.bC - var2.V + 1;
      int var4 = var2.P + var2.P / 3;

      for (int var5 = 0; var5 < this.i; var5++) {
         int var6 = var1 ? 4274480 : 3814187;
         rs.p_l.C_c.c(var6, var3, var4, 128, 255, this.e);
         var1 = !var1;
         var3 += 18;
      }
   }

   public C_g(int var1, int var2) {
      this.h = var1;
      this.i = var2;
   }
}
