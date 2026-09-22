package rs.plugins.bpkg;

import com.google.a.d.L;
import com.google.a.d.bX;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/l.class */
public class l {
    private static final L<Integer, Integer> f;
    private static final int g;
    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    private final int h;
    private final int i;
    static final /* synthetic */ boolean e;

    protected l(int i, int i2, boolean z) {
        int i3 = i2 & g;
        Integer numA = a(i);
        if (numA != null) {
            if (!e && (i3 & numA.intValue()) == 0) {
                throw new AssertionError();
            }
            i = 0;
        }
        if (z && i != 0) {
            i3 = 0;
        }
        this.h = i;
        this.i = i3;
    }

    public l(int i, int i2) {
        this(i, i2, false);
    }

    public l(KeyEvent keyEvent) {
        this(keyEvent.getExtendedKeyCode(), keyEvent.getModifiersEx());
        if (!e && !a(keyEvent)) {
            throw new AssertionError();
        }
    }

    public boolean a(KeyEvent keyEvent) {
        return a(keyEvent, false);
    }

    protected boolean a(KeyEvent keyEvent, boolean z) {
        if (a.equals(this)) {
            return false;
        }
        int extendedKeyCode = keyEvent.getExtendedKeyCode();
        int modifiersEx = keyEvent.getModifiersEx() & g;
        Integer numA = a(extendedKeyCode);
        if (numA != null) {
            modifiersEx |= numA.intValue();
            extendedKeyCode = 0;
        }
        if (keyEvent.getID() == 402 && extendedKeyCode != 0) {
            return this.h == extendedKeyCode;
        }
        if (!z || extendedKeyCode == 0) {
            return this.h == extendedKeyCode && this.i == modifiersEx;
        }
        return this.h == extendedKeyCode;
    }

    public String toString() {
        if (this.h == 0 && this.i == 0) {
            return "Not set";
        }
        String keyText = this.h == 0 ? "" : KeyEvent.getKeyText(this.h);
        String modifiersExText = this.i != 0 ? InputEvent.getModifiersExText(this.i) : "";
        if (modifiersExText.isEmpty() && keyText.isEmpty()) {
            return "Not set";
        }
        if (modifiersExText.isEmpty() || keyText.isEmpty()) {
            return modifiersExText.isEmpty() ? keyText : modifiersExText;
        }
        return modifiersExText + "+" + keyText;
    }

    @Nullable
    public static Integer a(int i) {
        return f.k_().get(Integer.valueOf(i));
    }

    public int a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.a(this) && a() == lVar.a() && b() == lVar.b();
    }

    protected boolean a(Object obj) {
        return obj instanceof l;
    }

    public int hashCode() {
        return (((1 * 59) + a()) * 59) + b();
    }

    static {
        e = !l.class.desiredAssertionStatus();
        f = new bX.a().b(128, 17).b(512, 18).b(64, 16).b(256, 157).b();
        g = f.keySet().stream().reduce((num, num2) -> {
            return Integer.valueOf(num.intValue() | num2.intValue());
        }).get().intValue();
        a = new l(0, 0);
        b = new l(0, 128);
        c = new l(0, 512);
        d = new l(0, 64);
    }
}
