package rs;

import com.google.inject.internal.asm.$Opcodes;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_458.class */
public class class_458 {
    private boolean a = false;
    private static final int[] b = {32177, 32167, 32166, 32184, 32181, 32178, 32176, 32170, 32169, 32168};

    public void a() {
        Widget.l(32177).V = 0;
    }

    public void b() {
        Widget.l(32021).bd = true;
        Widget.l(32188).bd = false;
        for (int i : b) {
            Widget.l(i).bd = false;
        }
        this.a = true;
    }

    public void c() {
        a();
        Widget.l(32021).bd = false;
        for (int i : b) {
            Widget.l(i).bd = true;
        }
        this.a = false;
    }

    public void a(class_459 class_459Var) {
        switch (class_460.a[class_459Var.ordinal()]) {
            case 1:
                a(false);
                Widget.l(32177).bd = false;
                Widget.l(32178).bd = false;
                Widget.l(32181).bd = false;
                Widget.l(32188).bd = false;
                break;
            case 2:
                a(true);
                Widget.l(32177).bd = true;
                Widget.l(32177).aF = 0;
                Widget.l(32176).as = "@gre@Items have been claimed!";
                Widget.l(32178).bd = false;
                Widget.l(32181).bd = false;
                Widget.l(32188).bd = true;
                break;
            case 3:
                a(true);
                a($Opcodes.INVOKESTATIC);
                Widget.l(32177).bd = true;
                Widget.l(32177).aF = 500;
                Widget.l(32176).as = "";
                Widget.l(32178).bd = true;
                Widget.l(32181).bd = true;
                Widget.l(32188).bd = false;
                break;
        }
    }

    public void d() {
        Widget.l(32177).aF = 0;
    }

    public void e() {
        Widget.l(32177).aF = 500;
    }

    private void a(boolean z) {
        Widget.l(32170).bd = z;
        Widget.l(32176).bd = z;
        Widget.l(32167).bd = z;
        if (z) {
            a($Opcodes.INVOKESTATIC);
        } else {
            a(User32.WM_UNICHAR);
        }
    }

    private void a(int i) {
        class_455.cd = i;
    }

    public boolean f() {
        return this.a;
    }
}
