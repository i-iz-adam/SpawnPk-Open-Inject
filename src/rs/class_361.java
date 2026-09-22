package rs;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_361.class */
public class class_361 extends class_360 {
    private final int[] d;
    public static final class_553 c = new class_363();

    public class_361(class_338[] class_338VarArr) {
        super(class_338VarArr);
        this.d = new int[]{6179, 2459, 2469, G.di, 2492};
    }

    @Override // rs.class_360
    public void a() {
        a(true);
        j();
        Widget.H[14175].Q = "Confirm";
    }

    public static void a(boolean z) {
        int i = 5;
        int i2 = 0;
        int i3 = 0;
        int i4 = 10;
        int i5 = -10;
        int i6 = 0;
        if (z) {
            i6 = 0 - 10;
        } else {
            i4 = 25 + 10;
            i = (-55) + 10;
            i5 = ((-10) - 15) + 26;
            i3 = (-82) + 41;
            i2 = 0 + 41;
        }
        Widget.H[14170].ak = new int[]{14171, 14172, 14173, 14174, 14175, 14176, 14178, 14179, 14180, 14181, 14184};
        Widget.H[14170].al = new int[]{i5, 225 + i3, 358 + i3, 0, 226 + i3, 362 + i3, 408, 15, 0 + i2, 0 + i2, 62 + i2};
        Widget.H[14170].ba = new int[]{i6, 24 + i4, 25 + i4, -1, 32 + i4, 32 + i4, 0, 1, 50 + i, 60 + i, 32 + i};
        i();
    }

    public static void h() {
        Widget.H[14170].ak = new int[]{14172, 14173, 14174, 14175, 14176, 14178, 14179, 14180, 14181, 14184};
        Widget.H[14170].al = new int[]{145, 278, 0, 146, 282, 408, 15, 0, 0, 62};
        Widget.H[14170].ba = new int[]{49, 50, -1, 54, 54, 0, 1, 50, 5, 32};
        for (int i = 0; i < Widget.H[14170].ak.length; i++) {
            int[] iArr = Widget.H[14170].ba;
            int i2 = i;
            iArr[i2] = iArr[i2] + 5;
        }
        Widget.H[14174].as = "Please confirm your choice.";
        Widget.H[14183].as = "";
        i();
    }

    public static void i() {
        Widget.H[14172].ae = 8685;
        Widget.H[14172].aG = 6;
        Widget.H[14172].P = 32;
        Widget.H[14172].aP = 32;
        Widget.H[14172].aL = 0;
        Widget.H[14172].aS = User32.WM_MENUDRAG;
        Widget.H[14172].aT = 2032;
        Widget.H[14172].aI = false;
        Widget.H[14172].aK = 0;
        Widget.H[14172].aJ = 0;
        Widget.H[14172].ad = 1;
        Widget.H[14172].aR = aU.qq;
    }

    public static void a(int i, int i2, int i3, int i4, int i5, boolean z) {
        Widget.a(i, i2, i4, i5, (int) (((double) ItemComposition.lookupItem(i2).G) * 0.4d));
        ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(i2);
        Widget.H[i].bo = i3;
        Widget.H[i].aL = i2;
        Widget.H[i].aS = itemCompositionLookupItem.M;
        Widget.H[i].aT = itemCompositionLookupItem.Z;
        if (!z) {
            Widget.H[i].aI = false;
            return;
        }
        Widget.H[i].aI = true;
        Widget.H[i].aK = ItemComposition.lookupItem(i2).Z;
        Widget.H[i].aJ = ItemComposition.lookupItem(i2).M;
    }

    private void j() {
        for (int i : this.d) {
            Widget widget = Widget.H[i];
            int[] iArr = new int[widget.ak.length + 1];
            int[] iArr2 = new int[widget.ak.length + 1];
            int[] iArr3 = new int[widget.ak.length + 1];
            int i2 = 0;
            for (int i3 = 0; i3 < widget.ak.length; i3++) {
                iArr[i3] = widget.al[i3];
                iArr2[i3] = widget.ba[i3];
                iArr3[i3] = widget.ak[i3];
                i2++;
            }
            a(54195, "<img=25> Close window", "Cancel", this.a, 0, 8912896, false, false, 300);
            widget.al = iArr;
            widget.ba = iArr2;
            widget.ak = iArr3;
            int i4 = i2;
            int i5 = i2 + 1;
            widget.b(i4, 54195, 400, 1);
        }
    }
}
