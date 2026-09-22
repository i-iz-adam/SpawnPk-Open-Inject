package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_477.class */
public class class_477 extends class_360 {
    public class_477(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(54100);
        addSprite(54101, "skills/image 7");
        a(54102, "Blood Slayer", this.a, 2, class_492.e, true, true);
        a(54103, "Choose a Task", this.a, 2, class_492.e, true, true);
        a(54104, "Easy task monsters", this.a, 2, class_492.e, false, true);
        c(54105, 1, "gambling/SPRITE");
        c(54106, 1, "gambling/SPRITE");
        c(54107, 1, "gambling/SPRITE");
        c(54108, 1, "gambling/SPRITE");
        a(54109, "<tab=20>Monster hunter @yel@(PvM)", "Select timed task", this.a, 0, class_492.e, false, true, 150);
        a(54110, "<tab=20>Boss hunter @yel@(PvM)", "Select boss hunter task", this.a, 0, class_492.e, false, true, 150);
        a(54111, "<tab=20>Bounty hunter @yel@(PK)", "Select man hunter task", this.a, 0, class_492.e, false, true, 150);
        a(54112, "<tab=20>Slaughter @yel@(PK)", "Select man slaughter task", this.a, 0, class_492.e, false, true, 150);
        a(54113, "skills/button", 1, 120, 41, "Get a blood slayer task", -1, 54114, 1);
        a(54114, "skills/button", 2, 120, 41, 54115);
        a(54116, "<img=24> Get a task", this.a, 1, 16751360, true, true);
        a(54117, "<u=16776960>Reward points", this.a, 0, class_492.e, true, true);
        a(54118, "@yel@5 <col=FF9B00>Blood slayer points", this.a, 0, 16751360, true, true);
        a(54119, "@yel@5 <col=FF9B00>Slayer points", this.a, 0, 16751360, true, true);
        a(54120, "", this.a, 0, 16751360, true, true);
        widgetD.k(20);
        widgetD.b(0, 54101, 16 + 170, 42);
        widgetD.b(1, 54102, 106 + 170, 51);
        widgetD.b(2, 63740, 172 + 170, 50);
        widgetD.b(3, 63741, 170 + 170, 50);
        widgetD.b(4, 54103, 102 + 170, 82);
        widgetD.b(5, 54117, 106 + 170, 211);
        widgetD.b(6, 54105, 30 + 170, 110 + 4);
        widgetD.b(7, 54109, 29 + 170, 112 + 4);
        widgetD.b(8, 54106, 30 + 170, 130 + 4);
        widgetD.b(9, 54110, 29 + 170, 132 + 4);
        widgetD.b(10, 54107, 30 + 170, 150 + 4);
        widgetD.b(11, 54111, 29 + 170, 152 + 4);
        widgetD.b(12, 54108, 30 + 170, 170 + 4);
        widgetD.b(13, 54112, 29 + 170, 172 + 4);
        widgetD.b(14, 54113, 46 + 170, 263);
        widgetD.b(15, 54114, 46 + 170, 263);
        widgetD.b(16, 54116, 102 + 170, 275);
        widgetD.b(17, 54118, 106 + 170, User32.VK_ICO_HELP);
        widgetD.b(18, 54119, 106 + 170, 240);
        widgetD.b(19, 54120, 106 + 170, 253);
        for (int i = 0; i < widgetD.ak.length; i++) {
            int[] iArr = widgetD.ba;
            int i2 = i;
            iArr[i2] = iArr[i2] - 15;
        }
    }
}
