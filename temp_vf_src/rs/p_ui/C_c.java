package rs.p_ui;

import com.google.a.d.ag;
import java.awt.Component;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JPanel;

class C_c extends JPanel {
   private static final int a = 23;
   private static final int b = 4;
   private final Map<C_l, Component> c = new TreeMap<>((var0, var1) -> ag.a().a(var0.i(), var1.i()).a(var0.d(), var1.d()).b());

   C_c() {
      this.setLayout(new C_d(this));
   }

   void a(C_l var1, Component var2) {
      if (this.c.put(var1, var2) == null) {
         this.a();
      }
   }

   void a(C_l var1) {
      if (this.c.remove(var1) != null) {
         this.a();
      }
   }

   private void a() {
      this.removeAll();
      this.c.values().forEach(this::add);
      this.repaint();
   }
}
