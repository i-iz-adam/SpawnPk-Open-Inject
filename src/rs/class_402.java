package rs;

import com.sun.jna.platform.win32.aU;

/* JADX INFO: loaded from: client-final.jar:rs/class_402.class */
public class class_402 extends class_360 {
    public class_402(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(29600);
        addSprite(29601, "raids/sprite 5");
        a(29613, "Raiding party invitations", this.a, 2, class_492.e);
        a(29614, "Party invitations", this.a, 2, class_492.e);
        Widget widgetD2 = d(29602);
        widgetD2.P = 169;
        widgetD2.aP = 208;
        widgetD2.aF = 600;
        widgetD2.k(10);
        a(29603, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29604, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29605, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29606, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29607, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29608, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29609, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29610, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29611, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        a(29612, "", "Selected invitation", this.a, 0, class_492.e, false, true, 150);
        for (int i = 0; i < 10; i++) {
            widgetD2.b(i, 29603 + i, 5, 5 + (i * 15));
        }
        widgetD.k(6);
        widgetD.b(0, 29601, 144, 19);
        widgetD.b(1, 29602, 177, 89);
        widgetD.b(2, 29614, aU.hu_, 60);
        widgetD.b(3, 29613, 181, 25);
        widgetD.b(4, 63740, 361, 25);
        widgetD.b(5, 63741, 361, 25);
    }
}
