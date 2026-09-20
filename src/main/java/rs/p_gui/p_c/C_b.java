package rs.p_gui.p_c;

import javax.swing.JLabel;

class C_b implements Runnable {
   final C_a f;
   final int a;
   final String b;
   final String c;
   final String d;
   final String e;
   C_b(C_a var1, int var2, String var3, String var4, String var5, String var6) {
      this.f = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   @Override
   public void run() {
      JLabel var1 = this.a == 1 ? this.f.c : this.f.m;
      JLabel var2 = this.a == 1 ? this.f.g : this.f.q;
      JLabel var3 = this.a == 1 ? this.f.i : this.f.s;
      JLabel var4 = this.a == 1 ? this.f.k : this.f.u;
      if (this.b.contains("Died)")) {
         var1.setIcon(this.f.x);
      } else {
         var1.setIcon(this.f.w);
      }

      var1.setText("<html><font style='bold' color='yellow'>" + this.b.replace("@red@", "</font><font color='red'>") + "</font></html>");
      var2.setText("<html>Correct overheads: <font color='35FFA6'>" + this.c + "</font></html>");
      var3.setText("<html>Magic RNG: <font color='5AA8FF'>" + this.d + "</font></html>");
      var4.setText("<html>Damage Dealt: <font color='FF6C3A'>" + this.e + "</font></html>");
   }
}
