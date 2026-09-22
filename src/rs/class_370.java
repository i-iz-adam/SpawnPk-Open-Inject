package rs;

import com.sun.jna.platform.win32.aU;

/* JADX INFO: loaded from: client-final.jar:rs/class_370.class */
public class class_370 extends class_360 {
    public class_370(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widget = H[1644];
        c(aU.UT, 0, "equipment/bl");
        c(aU.UU, 1, "equipment/bl");
        c(15109, 2, "equipment/bl");
        g(aU.UV);
        g(aU.UW);
        widget.ak[23] = 15101;
        widget.al[23] = 40;
        widget.ba[23] = 205;
        widget.ak[24] = 15102;
        widget.al[24] = 110;
        widget.ba[24] = 205;
        widget.ak[25] = 15109;
        widget.al[25] = 39;
        widget.ba[25] = 240;
        widget.ak[26] = 27650;
        widget.al[26] = 0;
        widget.ba[26] = 0;
        Widget widgetD = d(27650);
        a(27653, 1, "equipment/BOX", "Show Equipment Stats", 27655, 1, 40, 39);
        f(27655, "Show Equipment Stats");
        a(27654, 2, "equipment/BOX", "Show Items Kept on Death", 27657, 1, 40, 39);
        f(27657, "Show Items Kept on Death");
        addSprite(27700, "equipment/outline");
        a(27701, (Boolean) false);
        H[27701].W = new String[]{"Remove", null, null, null, null};
        H[27701].ab = 11;
        a(6, widgetD);
        b(27700, 78, aU.hq_, 0, widgetD);
        b(27701, 80, aU.hs_, 1, widgetD);
        b(27653, 29, aU.ho_, 2, widgetD);
        b(27654, 124, aU.ho_, 3, widgetD);
        b(27655, 39, 240, 4, widgetD);
        b(27657, 39, 220, 5, widgetD);
    }
}
