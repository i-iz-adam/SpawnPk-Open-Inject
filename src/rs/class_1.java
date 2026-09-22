package rs;

import com.google.a.c.d;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_1.class */
public class class_1 {
    private final com.google.a.c.p<class_2, class_6> a = d.a().a(128L).b(1, TimeUnit.HOURS).a(new class_4(this));
    private final com.google.a.c.p<class_3, class_6> b = d.a().a(128L).b(1, TimeUnit.HOURS).a(new class_5(this));

    public void a() {
        this.a.a();
        this.a.c();
        this.b.a();
        this.b.c();
    }

    public class_6 a(int i) {
        return a(i, 1, 32);
    }

    public class_6 a(int i, int i2, int i3) {
        try {
            return this.a.e(new class_2(i, i2, i3));
        } catch (ExecutionException e) {
            return null;
        }
    }

    public class_6 a(String str, int i) {
        try {
            return this.b.e(new class_3(str, i));
        } catch (ExecutionException e) {
            return null;
        }
    }

    public class_6 a(String str) {
        return a(str, -1);
    }

    private class_6 b(int i) {
        return b(i, Integer.MAX_VALUE, 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class_6 b(int i, int i2, int i3) {
        class_6 class_6Var = new class_6(36, 32, 2);
        class_166.a("Ico_" + i + "_" + i3, () -> {
            class_333 class_333VarA;
            if (!Launcher.n().o().fc || (class_333VarA = ItemComposition.a(i, i2, 0, i3)) == null) {
                return true;
            }
            Image imageA = class_333.a(class_333VarA.a(32, 32), new Color(0, 0, 0));
            Graphics2D graphics2DCreateGraphics = class_6Var.createGraphics();
            graphics2DCreateGraphics.drawImage(imageA, 0, 0, (ImageObserver) null);
            graphics2DCreateGraphics.dispose();
            class_6Var.a();
            return false;
        });
        return class_6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class_6 b(String str, int i) {
        int i2 = i;
        int i3 = i;
        if (i == -1) {
            class_333 class_333Var = new class_333(str);
            class_333Var.a(str);
            i2 = class_333Var.n;
            i3 = class_333Var.o;
        }
        Image imageB = class_333.b(str);
        class_6 class_6Var = new class_6(i2, i3, 2);
        class_166.a("Ico_" + str + "_" + i, () -> {
            if (imageB == null) {
                return true;
            }
            try {
                if (imageB.getWidth((ImageObserver) null) <= 0 || imageB.getHeight((ImageObserver) null) <= 0) {
                    return true;
                }
                Graphics2D graphics2DCreateGraphics = class_6Var.createGraphics();
                graphics2DCreateGraphics.drawImage(imageB, 0, 0, (ImageObserver) null);
                graphics2DCreateGraphics.dispose();
                class_6Var.a();
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        });
        return class_6Var;
    }
}
