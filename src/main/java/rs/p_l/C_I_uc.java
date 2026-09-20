package rs.p_l;

import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class C_I_uc {
   private static final List<C_F_uc> a = new ArrayList<>();

   public static void a() {
      for (C_F_uc var1 : a) {
         try {
            var1.g = Toolkit.getDefaultToolkit().getImage(C_F_uc.f + var1.t + ".png");
            ImageIcon var2 = new ImageIcon(var1.g);
            var1.n = var2.getIconWidth();
            var1.o = var2.getIconHeight();
            var1.r = var1.n;
            var1.s = var1.o;
            var1.p = 0;
            var1.q = 0;
            var1.m = new int[var1.n * var1.o];
            PixelGrabber var3 = new PixelGrabber(var1.g, 0, 0, var1.n, var1.o, var1.m, 0, var1.n);
            var3.grabPixels();
            if (!var1.j) {
               var1.c(255, 0, 255);
               var1.c(255, 255, 255);
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }
   }

   public static C_F_uc a(String var0) {
      return a(var0, false);
   }

   public static C_F_uc a(String var0, boolean var1) {
      C_F_uc var2 = new C_F_uc();
      var2.t = var0;
      a.add(var2);
      return a.get(a.size() - 1);
   }
}
