package rs;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_422.class */
public class class_422 extends class_360 {
    public static List<Integer[]> c = new ArrayList();
    public static int d = 22952;
    public static int e = 79938;
    public static int f = 59902;

    public class_422(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void a(List<Integer[]> list) {
        c = new ArrayList(list);
    }

    public static void a(Integer[] numArr) {
        c.add(numArr);
    }

    public static void h() {
        Widget widget = Widget.H[59901];
        a(f, (Boolean) false);
        for (int size = c.size() + 1; size % 3 != 0; size++) {
        }
        Widget.H[f].ax = new int[500];
        Widget.H[f].av = new int[500];
        Widget.H[f].P = 3;
        Widget.H[f].aP = 10;
        Widget.H[f].ab = 11;
        Widget.H[f].ao = 10;
        int i = 0;
        int i2 = 0;
        int i3 = e;
        int i4 = 2;
        int i5 = 3;
        widget.k(c.size() + 1);
        int i6 = 0;
        while (i6 < c.size()) {
            int iIntValue = c.get(i6)[0].intValue();
            int iIntValue2 = c.get(i6)[1].intValue();
            String str = "Select item " + ItemComposition.lookupItem(iIntValue).itemName;
            Widget.H[f].ax[i2] = iIntValue + 1;
            Widget.H[f].av[i2] = iIntValue2;
            i2++;
            int i7 = i3;
            i3++;
            Widget[] widgetArr = H;
            Widget widget2 = new Widget();
            widgetArr[i7] = widget2;
            widget2.au = i7;
            widget2.ag = i7;
            widget2.aG = 5;
            widget2.M = 1;
            widget2.J = 0;
            widget2.aA = (byte) 0;
            widget2.aa = 52;
            widget2.E = new class_333("vote/sprite " + (i6 == 0 ? (char) 2 : (char) 1));
            widget2.aE = new class_333("vote/sprite " + (i6 == 0 ? (char) 2 : (char) 1));
            widget2.P = widget2.E.n;
            widget2.aP = widget2.aE.o;
            widget2.Q = str;
            int i8 = i;
            i++;
            widget.b(i8, i7, i4, i5);
            if (i4 >= 82) {
                i4 = 2;
                i5 += 41;
            } else {
                i4 += 42;
            }
            i6++;
        }
        int i9 = i;
        int i10 = i + 1;
        widget.b(i9, f, 4, 5);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(d);
        c(59900, 0, "vote/sprite");
        a(59990, "vote/SPRITE", 3, 100, 32, "Teleport to boss", -1, 59991, 1);
        a(59991, "vote/SPRITE", 4, 100, 32, 59992);
        a(59993, "Purchase", this.a, 0, 16751360, true, true);
        a(59994, "Item Sale Listings", this.a, 1, class_492.e, true, true);
        a(59995, "Item Title", this.a, 1, class_492.e, true, true);
        a(22953, "@whi@Price: @gre@500 VP", this.a, 0, class_492.e, true, true);
        a(22954, "Description Line", this.a, 0, class_492.e, true, true);
        a(22955, "Description Line", this.a, 0, class_492.e, true, true);
        a(22956, "Description Line", this.a, 0, class_492.e, true, true);
        a(22957, "Description Line", this.a, 0, class_492.e, true, true);
        Widget widgetD2 = Widget.d(59901);
        widgetD2.aF = 350;
        widgetD2.P = 127;
        widgetD2.aP = 182;
        widgetD2.bh = 87;
        widgetD2.k(6 * 2);
        h();
        widgetD.k(14);
        widgetD.b(0, 59900, 85, 33);
        widgetD.b(1, 59994, 174, 54);
        widgetD.b(2, 59995, 358, 110);
        widgetD.b(3, 59901, 104, 76);
        widgetD.b(4, 59990, 307, 208);
        widgetD.b(5, 59991, 307, 208);
        widgetD.b(6, 59993, 358, 214);
        widgetD.b(7, 22953, 356, 124 + 12);
        widgetD.b(8, 22954, 356, 139 + 12);
        widgetD.b(9, 22955, 356, 151 + 12);
        widgetD.b(10, 22956, 356, 163 + 12);
        widgetD.b(11, 22957, 356, 175 + 12);
        widgetD.b(12, 65418, 431, 86);
        widgetD.b(13, 65419, 431, 86);
    }
}
