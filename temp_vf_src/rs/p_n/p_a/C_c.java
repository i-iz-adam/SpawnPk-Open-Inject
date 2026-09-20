package rs.p_n.p_a;

public class C_c extends rs.p_n.C_e {
   public C_c(int var1) {
      this.W = new String[5];
      this.K = new int[20];
      this.ax = new int[30];
      this.az = new int[30];
      this.as = new int[20];
      this.al = new int[0];
      this.am = new int[0];
      this.bc = new int[0];
      this.t = false;
      this.ac = 24;
      this.ap = 24;
      this.aR = 5;
      this.P = 6;
      this.ah = 5292;
      this.aw = var1;
      this.aI = 2;
      H[var1] = this;
   }

   public static C_c g(int var0, int var1) {
      C_c var2 = new C_c(var0);
      H[var0].az = new int[var1];
      H[var0].ax = new int[var1];
      H[var0].K = new int[var1];
      H[var0].as = new int[var1];
      H[var0].P = 5;
      H[var0].aR = (int)Math.ceil((double)H[var0].P);
      return var2;
   }

   public C_c a(int var1) {
      this.P = var1;
      this.aR = (int)Math.ceil((double)(this.az.length / var1));
      H[this.aw].P = var1;
      H[this.aw].aR = (int)Math.ceil((double)(this.az.length / var1));
      return this;
   }

   public C_c h(int var1, int var2) {
      this.ac = var1;
      this.ap = var2;
      return this;
   }
}
