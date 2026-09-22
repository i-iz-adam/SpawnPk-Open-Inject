/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rs.ItemComposition
 *  rs.class_1
 *  rs.class_166
 *  rs.class_333
 *  rs.gui.Launcher
 *  rs.gui.x
 */
package rs.gui.b.b;

import java.awt.Color;
import java.awt.Image;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.ItemComposition;
import rs.class_1;
import rs.class_166;
import rs.class_333;
import rs.gui.Launcher;
import rs.gui.b.g;
import rs.gui.x;

public class b
implements Runnable {
    private static final long a = 50L;
    private static final int b = 3;
    private static final long c = 5000L;
    private List<Integer> d = new CopyOnWriteArrayList<Integer>();
    private List<Integer> e = new CopyOnWriteArrayList<Integer>();
    private final class_1 f = new class_1();

    public void a(int n) {
        if (n == -1) {
            return;
        }
        class_166.a((String)("LoadoutIco_" + n), () -> {
            try {
                class_333 class_3332 = ItemComposition.a((int)n, (int)1, (int)0, (int)32);
                if (class_3332 == null) {
                    return true;
                }
                Image image = class_3332.a(32, 32);
                image = class_333.a((Image)image, (Color)new Color(0, 0, 0));
                x x2 = new x(0);
                x2.a(image);
                g.b.put(n, x2);
                Launcher.n().b(100, true);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return false;
        });
    }

    @Override
    public void run() {
    }
}
