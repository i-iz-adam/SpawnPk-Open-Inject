package rs.gui.bpkg.bpkg;

import java.awt.Color;
import java.awt.Image;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.ItemComposition;
import rs.class_1;
import rs.class_166;
import rs.class_333;
import rs.gui.Launcher;
import rs.gui.bpkg.g;
import rs.gui.x;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/b/b.class */
public class b implements Runnable {
    private static final long a = 50;
    private static final int b = 3;
    private static final long c = 5000;
    private List<Integer> d = new CopyOnWriteArrayList();
    private List<Integer> e = new CopyOnWriteArrayList();
    private final class_1 f = new class_1();

    public void a(int i) {
        if (i == -1) {
            return;
        }
        class_166.a("LoadoutIco_" + i, () -> {
            try {
                class_333 class_333VarA = ItemComposition.a(i, 1, 0, 32);
                if (class_333VarA == null) {
                    return true;
                }
                Image imageA = class_333.a(class_333VarA.a(32, 32), new Color(0, 0, 0));
                x xVar = new x(0);
                xVar.a(imageA);
                g.b.put(Integer.valueOf(i), xVar);
                Launcher.n().b(100, true);
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
