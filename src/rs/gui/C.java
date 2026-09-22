package rs.gui;

class C implements Runnable {
   C(Launcher var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void run() {
      this.b.i().setResizable(this.a);
   }
}
