package rs;

import com.jacob.com.Dispatch;

/* JADX INFO: loaded from: client-final.jar:rs/class_471.class */
public class class_471 extends class_360 {
    public static boolean c = false;

    public class_471(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        a(35113, "<u>Player attack options", this.a, 1, 0, true, false);
        a(35114, "<u>NPC/Bot attack options", this.a, 1, 0, true, false);
        c(35115, 1, "gambling/SPRITE");
        a(35116, "<tab=20><img=14> Always right-click clan members", "Select option", this.a, 0, 0, false, false, 150);
        Widget widgetD = d(35112);
        widgetD.k(13);
        int i = 15 + 50;
        widgetD.b(0, 35115, 125 + 100, 53 + 15);
        widgetD.b(1, 35116, 125 + 100, 55 + 15);
        widgetD.b(2, 35109, 125 - 55, 15 + 20);
        widgetD.b(3, 35108, 125 + 10, 15 + 5 + 20);
        widgetD.b(4, 35114, 125 + 16, 1 + 15);
        widgetD.b(5, 35102, (125 + 25) - 5, i);
        widgetD.b(6, 35107, ((125 + 25) - 57) - 5, i + 4);
        int i2 = 125 + 180;
        widgetD.b(7, 35098, i2 - 55, 15 + 20);
        widgetD.b(8, 35097, i2 + 10, 15 + 5 + 20);
        widgetD.b(9, 35113, i2 + 15, 1 + 15);
        widgetD.b(10, 35091, (i2 + 25) - 5, 15);
        widgetD.b(11, 35096, ((i2 + 25) - 57) - 5, 15 + 4);
        widgetD.b(12, 54195, 400, 1);
        Widget.H[35112].b(5, 35102, Dispatch.R, Dispatch.R);
        Widget.H[35112].b(6, 35107, Dispatch.R, Dispatch.R);
        Widget.H[35112].b(10, 35091, Dispatch.R, Dispatch.R);
        Widget.H[35112].b(11, 35096, Dispatch.R, Dispatch.R);
    }
}
