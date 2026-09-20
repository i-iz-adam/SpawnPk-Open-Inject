package rs.p_q.p_b;

import java.util.Queue;

class C_f implements Runnable {
   C_f(C_d var1, C_a[] var2, Queue var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void run() {
      if (this.a[0] == null) {
         this.a[0] = new C_a();
      }

      String var1;
      while ((var1 = (String)this.b.poll()) != null) {
         this.a[0].a().append(var1 + "\n");
      }
   }
}
