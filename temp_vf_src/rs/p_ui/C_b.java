package rs.p_ui;

import com.google.a.d.ag;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import javax.swing.Box;
import javax.swing.JToolBar;

public class C_b extends JToolBar {
   private static final int a = 36;
   private static final int b = 503;
   private final Map<C_l, Component> c = new TreeMap<>((var0, var1) -> ag.a().a(var0.c(), var1.c()).a(var0.i(), var1.i()).a(var0.d(), var1.d()).b());

   C_b() {
      super(1);
      this.setFloatable(false);
      this.setSize(new Dimension(36, 503));
      this.setMinimumSize(new Dimension(36, 503));
      this.setPreferredSize(new Dimension(36, 503));
      this.setMaximumSize(new Dimension(36, Integer.MAX_VALUE));
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
      boolean var1 = false;

      for (Entry var3 : this.c.entrySet()) {
         if (!((C_l)var3.getKey()).c() && !var1) {
            var1 = true;
            this.add(Box.createVerticalGlue());
            this.addSeparator();
         }

         this.add((Component)var3.getValue());
      }

      this.repaint();
   }
}
