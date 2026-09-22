package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_485.class */
public class class_485 extends class_360 {
    public class_485(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(51318);
        widgetD.k(3);
        Widget widgetD2 = d(51319);
        widgetD2.P = 345;
        widgetD2.aP = 230;
        widgetD2.aF = 10000;
        widgetD2.k(600);
        for (int i = 51320; i < 51920; i++) {
            int i2 = i - 51320;
            a(i, "", "Select", this.a, 1, 0, true, false, 200);
            Widget.H[i].bm = true;
            widgetD2.b(i2, i, 60 + 20, (25 - 25) + (i2 * 17));
        }
        a(51920, "", this.a, 2, 0, true, false);
        widgetD.b(0, 8135, 60, 25);
        widgetD.b(1, 51319, 60 + 5, 25 + 40);
        widgetD.b(2, 51920, 60 + 185, 25 + 20);
    }
}
