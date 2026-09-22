package rs;

import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/* JADX INFO: loaded from: client-final.jar:rs/class_336.class */
public class class_336 {
    private static final List<class_333> a = new ArrayList();

    public static void a() {
        for (class_333 class_333Var : a) {
            try {
                class_333Var.g = Toolkit.getDefaultToolkit().getImage(class_333.f + class_333Var.t + ".png");
                ImageIcon imageIcon = new ImageIcon(class_333Var.g);
                class_333Var.n = imageIcon.getIconWidth();
                class_333Var.o = imageIcon.getIconHeight();
                class_333Var.r = class_333Var.n;
                class_333Var.s = class_333Var.o;
                class_333Var.p = 0;
                class_333Var.q = 0;
                class_333Var.m = new int[class_333Var.n * class_333Var.o];
                new PixelGrabber(class_333Var.g, 0, 0, class_333Var.n, class_333Var.o, class_333Var.m, 0, class_333Var.n).grabPixels();
                if (!class_333Var.j) {
                    class_333Var.c(255, 0, 255);
                    class_333Var.c(255, 255, 255);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class_333 a(String str) {
        return a(str, false);
    }

    public static class_333 a(String str, boolean z) {
        class_333 class_333Var = new class_333();
        class_333Var.t = str;
        a.add(class_333Var);
        return a.get(a.size() - 1);
    }
}
