package rs;

import com.sun.jna.platform.win32.aU;

/* JADX INFO: loaded from: client-final.jar:rs/class_406.class */
public class class_406 extends class_360 {
    public static class_333 d;
    public static class_333 e;
    public static int f;
    public static final String[] c = {"Main stock"};
    public static class_553 g = new class_407();

    public class_406(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widget = Widget.H[3824];
        for (int i = 0; i < widget.ak.length; i++) {
            int i2 = widget.ak[i];
            Widget widget2 = Widget.H[i2];
            if (widget2.as != null && widget2.as.contains("Right-click on shop")) {
                widget2.as = "";
            }
            if (i2 == 3900) {
                int[] iArr = widget.ba;
                int i3 = i;
                iArr[i3] = iArr[i3] + 23;
            }
        }
        int[] iArr2 = new int[widget.ak.length + 10];
        int[] iArr3 = new int[widget.ak.length + 10];
        int[] iArr4 = new int[widget.ak.length + 10];
        int i4 = 0;
        for (int i5 = 0; i5 < widget.ak.length; i5++) {
            iArr2[i5] = widget.al[i5];
            iArr3[i5] = widget.ba[i5];
            iArr4[i5] = widget.ak[i5];
            i4++;
        }
        d = Widget.j(10, "slayer/image");
        e = Widget.j(9, "slayer/image");
        b(41043, 10, "slayer/image", "Select shop tab");
        b(41044, 9, "slayer/image", "Select shop tab");
        b(41045, 9, "slayer/image", "Select shop tab");
        b(41046, 9, "slayer/image", "Select shop tab");
        b(41047, 9, "slayer/image", "Select shop tab");
        a(41048, "Tab 1", this.a, 0, class_492.e, true, true);
        a(41049, "Tab 2", this.a, 0, class_492.e, true, true);
        a(41050, "Tab 3", this.a, 0, class_492.e, true, true);
        a(41051, "Tab 4", this.a, 0, class_492.e, true, true);
        a(41052, "Tab 5", this.a, 0, class_492.e, true, true);
        widget.al = iArr2;
        widget.ba = iArr3;
        widget.ak = iArr4;
        int i6 = i4;
        int i7 = i4 + 1;
        widget.b(i6, 41043, 30, 59);
        int i8 = i7 + 1;
        widget.b(i7, 41048, 71, 63);
        int i9 = i8 + 1;
        widget.b(i8, 41044, 121, 59);
        int i10 = i9 + 1;
        widget.b(i9, 41049, 162, 63);
        int i11 = i10 + 1;
        widget.b(i10, 41045, aU.hu_, 59);
        int i12 = i11 + 1;
        widget.b(i11, 41050, 253, 63);
        int i13 = i12 + 1;
        widget.b(i12, 41046, aU.if_, 59);
        int i14 = i13 + 1;
        widget.b(i13, 41051, 344, 63);
        int i15 = i14 + 1;
        widget.b(i14, 41047, 394, 59);
        int i16 = i15 + 1;
        widget.b(i15, 41052, 435, 63);
        a(0, new String[]{"Main stock"});
    }

    public static void m(int i) {
        Widget widget = Widget.H[3824];
        for (int i2 = 0; i2 < f; i2++) {
            int i3 = 92 + (i2 * 2);
            int i4 = 41043 + i2;
            if (i == i2) {
                Widget.H[i4].E = d;
                Widget.H[i4].aE = d;
            } else {
                Widget.H[i4].E = e;
                Widget.H[i4].aE = e;
            }
        }
    }

    public static void a(int i, String[] strArr) {
        f = 0;
        Widget widget = Widget.H[3824];
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = 92 + (i2 * 2);
            int i4 = 41043 + i2;
            int i5 = 92 + (i2 * 2) + 1;
            int i6 = 41048 + i2;
            if (i2 < strArr.length) {
                int i7 = 30 + (91 * i2);
                int i8 = 71 + (91 * i2);
                if (i == i2) {
                    Widget.H[i4].E = d;
                    Widget.H[i4].aE = d;
                } else {
                    Widget.H[i4].E = e;
                    Widget.H[i4].aE = e;
                }
                widget.al[i3] = i7;
                widget.ba[i3] = 59;
                widget.al[i5] = i8;
                widget.ba[i5] = 63;
                Widget.H[i6].as = strArr[i2];
                f++;
            } else {
                widget.al[i3] = -1500;
                widget.al[i5] = -1500;
            }
        }
    }
}
