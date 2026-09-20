package rs.p_gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.text.StyleContext;

public class C_w {
   private static final Font a;
   private static final Font b;
   private static final Font c;
   private static final Font d;
   private static final Font e;

   public static Font a() {
      return a;
   }

   public static Font b() {
      return b;
   }

   public static Font c() {
      return c;
   }

   public static Font d() {
      return d;
   }

   public static Font e() {
      return e;
   }

   static {
      GraphicsEnvironment var0 = GraphicsEnvironment.getLocalGraphicsEnvironment();

      try {
         Font var1 = Font.createFont(0, C_w.class.getResourceAsStream("runescape.ttf")).deriveFont(0, 16.0F);
         var0.registerFont(var1);
         a = StyleContext.getDefaultStyleContext().getFont(var1.getName(), 0, 16);
         var0.registerFont(a);
         Font var2 = Font.createFont(0, C_w.class.getResourceAsStream("runescape_small.ttf")).deriveFont(0, 16.0F);
         var0.registerFont(var2);
         b = StyleContext.getDefaultStyleContext().getFont(var2.getName(), 0, 16);
         var0.registerFont(b);
         Font var3 = Font.createFont(0, C_w.class.getResourceAsStream("runescape_bold.ttf")).deriveFont(0, 16.0F);
         var0.registerFont(var3);
         c = StyleContext.getDefaultStyleContext().getFont(var3.getName(), 0, 16);
         var0.registerFont(c);
         d = new Font("Dialog", 0, 16);
         e = new Font("Dialog", 1, 16);
      } catch (FontFormatException var4) {
         throw new RuntimeException("Font loaded, but format incorrect.", var4);
      } catch (IOException var5) {
         throw new RuntimeException("Font file not found.", var5);
      }
   }
}
