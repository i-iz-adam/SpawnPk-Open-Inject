package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_428.class */
public class class_428 extends class_360 {
    public class_428(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(48999);
        c(48998, 5, "construction/sprite");
        a(48002, "LOGS/ICON", 1, 16, 16, "Close Window", 0, 48003, 1);
        a(48003, "LOGS/ICON", 2, 16, 16, 48004);
        b(48997, 6, "construction/sprite", "Edgeville teleport");
        b(48996, 7, "construction/sprite", "Home teleport");
        b(48995, 8, "construction/sprite", "Bounty teleport");
        widgetD.k(6);
        widgetD.b(0, 48998, 0, 0);
        widgetD.b(1, 48002, 493, 9);
        widgetD.b(2, 48003, 493, 9);
        widgetD.b(3, 48997, 51, 52);
        widgetD.b(4, 48996, 133, 52);
        widgetD.b(5, 48995, 215, 52);
        Widget.H[48997].bd = false;
        Widget.H[48996].bd = false;
        Widget.H[48995].bd = false;
    }
}
