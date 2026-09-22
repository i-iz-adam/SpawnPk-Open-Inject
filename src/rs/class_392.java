package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_392.class */
public class class_392 extends class_360 {
    public class_392(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(53500);
        int i = -5;
        int i2 = 3;
        widgetD.k(18);
        for (int i3 = 0; i3 < 18; i3++) {
            int i4 = 53501 + i3;
            a(i4, "Selecting this option Toggle " + (i3 + 1), "Select option", this.a, 0, 0, true, false, 160);
            Widget.H[i4].bm = true;
            widgetD.b(i3, i4, i, i2);
            i2 += 17;
            if (i2 > 17 * 6) {
                i2 = 3;
                i += 160;
            }
        }
        Widget widgetD2 = d(53519);
        widgetD2.k(18);
        int i5 = -5;
        int i6 = 3;
        for (int i7 = 0; i7 < 18; i7++) {
            int i8 = 53501 + i7;
            a(i8, "Selecting this option Toggle " + (i7 + 1), "Select option", this.a, 0, 0, true, false, 160);
            Widget.H[i8].bm = true;
            widgetD2.b(i7, i8, i5, i6);
            i5 += 160;
            if (i5 >= 160 * 2) {
                i6 += 17;
                i5 = -5;
            }
        }
    }
}
