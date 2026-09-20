package rs.p_ui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.annotation.Nullable;
import javax.swing.JPanel;

public final class C_a extends JPanel {
   public static final int a = 765;
   public static final int b = 503;
   public static final Dimension c = new Dimension(765, 503);

   public C_a(@Nullable Applet var1) {
      this.setSize(c);
      this.setMinimumSize(c);
      this.setPreferredSize(c);
      this.setLayout(new BorderLayout());
      this.setBackground(Color.black);
      if (var1 != null) {
         this.add(var1, "Center");
      }
   }
}
