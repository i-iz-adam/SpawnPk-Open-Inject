package rs.gui.c;

import javax.swing.JLabel;

class c implements Runnable {
   c(a var1, int var2, String var3, String var4, String var5, String var6) {
      this.f = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   @Override
   public void run() {
      JLabel var1 = this.a == 1 ? rs.gui.c.a.k(this.f) : rs.gui.c.a.l(this.f);
      JLabel var2 = this.a == 1 ? rs.gui.c.a.m(this.f) : rs.gui.c.a.n(this.f);
      JLabel var3 = this.a == 1 ? rs.gui.c.a.o(this.f) : rs.gui.c.a.p(this.f);
      JLabel var4 = this.a == 1 ? rs.gui.c.a.q(this.f) : rs.gui.c.a.r(this.f);
      if (this.b.contains("Died)")) {
         var1.setIcon(rs.gui.c.a.i(this.f));
      } else {
         var1.setIcon(rs.gui.c.a.j(this.f));
      }

      var1.setText("<html><font style='bold' color='yellow'>" + this.b.replace("@red@", "</font><font color='red'>") + "</font></html>");
      var2.setText("<html>Correct overheads: <font color='35FFA6'>" + this.c + "</font></html>");
      var3.setText("<html>Magic RNG: <font color='5AA8FF'>" + this.d + "</font></html>");
      var4.setText("<html>Damage Dealt: <font color='FF6C3A'>" + this.e + "</font></html>");
   }
}
