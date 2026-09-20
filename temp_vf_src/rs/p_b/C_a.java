package rs.p_b;

import rs.C_Client_mc;

public final class C_a implements Runnable {
   private C_Client_mc f;
   public final Object a = new Object();
   public final int[] b = new int[500];
   public boolean c = true;
   public final int[] d = new int[500];
   public int e;

   @Override
   public void run() {
      while (this.c) {
         synchronized (this.a) {
            if (this.e < 500) {
               this.d[this.e] = C_Client_mc.hP;
               this.b[this.e] = C_Client_mc.hQ;
               this.e++;
            }
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var3) {
         }
      }
   }

   public C_a(C_Client_mc var1) {
      this.f = var1;
   }
}
