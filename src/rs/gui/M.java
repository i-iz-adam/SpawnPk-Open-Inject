package rs.gui;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.image.BufferedImage;
import java.util.Enumeration;
import java.util.function.BiConsumer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.LookAndFeel;
import javax.swing.PopupFactory;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.class_12;
import rs.class_15;
import rs.l.j;
import rs.ui.l;

public class M {
   private static final Logger a = LoggerFactory.getLogger(M.class);

   public static void a() {
      ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
      ToolTipManager.sharedInstance().setInitialDelay(300);
      UIManager.put("TabbedPane.selected", d.c);
      UIManager.put("TabbedPane.highlight", d.c);
      UIManager.put("TabbedPane.contentAreaColor", d.c);
      UIManager.put("TabbedPane.borderHightlightColor", d.c);
      UIManager.put("TabbedPane.darkShadow", d.c);
      UIManager.put("Button.foreground", Color.WHITE);
      UIManager.put("MenuItem.foreground", Color.WHITE);
      UIManager.put("Panel.background", d.d);
      UIManager.put("TextField.selectionBackground", d.b);
      UIManager.put("TextField.selectionForeground", Color.WHITE);
      UIManager.put("FormattedTextField.selectionBackground", d.b);
      UIManager.put("FormattedTextField.selectionForeground", Color.WHITE);
      UIManager.put("TextArea.selectionBackground", d.b);
      UIManager.put("TextArea.selectionForeground", Color.WHITE);
      System.setProperty("jgoodies.popupDropShadowEnabled", "false");
      System.setProperty("sun.awt.noerasebackground", "true");
   }

   public static void a(@Nonnull LookAndFeel var0) {
      try {
         UIManager.setLookAndFeel(var0);
         if (j.a() == j.b) {
            PopupFactory.setSharedInstance(new class_15());
         }
      } catch (UnsupportedLookAndFeelException var2) {
         a.warn("Unable to set look and feel", var2);
      }
   }

   public static void a(Font var0) {
      FontUIResource var1 = new FontUIResource(var0);
      Enumeration var2 = UIManager.getDefaults().keys();

      while (var2.hasMoreElements()) {
         Object var3 = var2.nextElement();
         Object var4 = UIManager.get(var3);
         if (var4 instanceof FontUIResource) {
            UIManager.put(var3, var1);
         }
      }
   }

   public static void a(AbstractButton var0) {
      var0.setBorderPainted(false);
      var0.setContentAreaFilled(false);
      var0.setFocusPainted(false);
      var0.setMargin(new Insets(0, 0, 0, 0));
      var0.setOpaque(false);
   }

   public static JButton a(@Nonnull l var0, int var1, @Nullable BiConsumer<l, JButton> var2) {
      BufferedImage var3 = var1 > 0 ? class_12.a(var0.b(), var1, var1) : var0.b();
      JButton var4 = new JButton();
      var4.setSize(var3.getWidth(), var3.getHeight());
      var4.setToolTipText(var0.d());
      var4.setIcon(new ImageIcon(var3));
      var4.putClientProperty("substancelaf.internal.FlatLook", Boolean.TRUE);
      var4.setFocusable(false);
      var4.addActionListener(var3x -> {
         if (var2 != null) {
            var2.accept(var0, var4);
         }

         if (var0.f() != null) {
            var0.f().run();
         }
      });
      if (var0.j() != null) {
         JPopupMenu var5 = new JPopupMenu();
         var0.j().forEach((var1x, var2x) -> {
            JMenuItem var3x = new JMenuItem(var1x);
            var3x.addActionListener(var1xx -> var2x.run());
            var5.add(var3x);
         });
         var4.setComponentPopupMenu(var5);
      }

      var0.b(var4::doClick);
      return var4;
   }

   public static void a(AbstractButton var0, String var1, String var2) {
      var0.setToolTipText(var0.isSelected() ? var1 : var2);
      var0.addItemListener(var3 -> var0.setToolTipText(var0.isSelected() ? var1 : var2));
   }

   @Nullable
   public static TrayIcon a(@Nonnull Image var0, @Nonnull String var1, @Nonnull Frame var2) {
      if (!SystemTray.isSupported()) {
         return null;
      } else {
         SystemTray var3 = SystemTray.getSystemTray();
         TrayIcon var4 = new TrayIcon(var0, var1);
         var4.setImageAutoSize(true);

         try {
            var3.add(var4);
         } catch (AWTException var6) {
            a.debug("Unable to add system tray icon", var6);
            return var4;
         }

         var4.addMouseListener(new N(var2));
         return var4;
      }
   }
}
