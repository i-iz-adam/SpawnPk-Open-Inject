package rs.p_gui;

class C_C_uc implements Runnable {
   final C_Launcher_mc b;
   final boolean a;

   C_C_uc(C_Launcher_mc var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void run() {
      this.b.i().setResizable(this.a);
   }
}
