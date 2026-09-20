package rs.p_k.p_b;

import java.util.Arrays;
import rs.p_a.C_h;

public class C_f {
   private C_h a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private static final int[] h = new int[4];

   public void a(C_h var1) {
      this.a = var1;
   }

   public int a() {
      return Arrays.hashCode(new int[]{this.b, this.c, this.d, this.e, this.f, this.g, this.a.V, this.a.S, this.a.T, this.a.U});
   }

   public int b() {
      h[0] = Arrays.hashCode(this.a.ae);
      h[1] = Arrays.hashCode(this.a.af);
      h[2] = Arrays.hashCode(this.a.ag);
      h[3] = Arrays.hashCode(this.a.ar);
      return Arrays.hashCode(h);
   }
}
