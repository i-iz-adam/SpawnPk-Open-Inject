package rs.p_gui;

import java.awt.Dimension;

class C_D_uc implements Runnable {
   final C_Launcher_mc e;
   final int a;
   final int b;
   final int c;
   final int d;

   C_D_uc(C_Launcher_mc var1, int var2, int var3, int var4, int var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   @Override
   public void run() {
      this.e.i().setMinimumSize(new Dimension(this.a, this.b));
      this.e.i().setSize(this.c, this.d);
   }
}
