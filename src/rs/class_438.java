package rs;

import com.google.inject.internal.asm.$Opcodes;
import com.sun.jna.platform.win32.aU;

/* JADX INFO: loaded from: client-final.jar:rs/class_438.class */
public class class_438 extends class_360 {
    public class_438(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void h() {
        Widget.H[25343].as = "";
        Widget.H[25344].as = "";
        c(25342, 0, 32);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(24632);
        c(65774, 1, "pos/sprite");
        a(65775, "@or1@SpawnPK Marketplace Listing <img=84>", this.a, 2, 16751360, true, true);
        a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        c(25342, 0, 32);
        a(25343, "N/A", this.a, 0, 16751360, true, true);
        a(25344, "N/A", this.a, 0, 16751360, true, true);
        a(65451, "Select a currency..", this.a, 1, 16751360, true, true);
        c(25337, 2, "gambling/SPRITE");
        c(25338, 1, "gambling/SPRITE");
        a(25339, "Coins", "Select", this.a, 0, class_492.d, false, true, 160);
        a(25340, "100M bags", "Select", this.a, 0, class_492.d, false, true, 160);
        a(25345, "pos/button", 1, 100, 32, "Set price", -1, 25346, 1);
        a(25346, "pos/button", 2, 100, 32, 25347);
        a(65421, "Set price (ea)", this.a, 0, 16751360, true, true);
        a(25348, "pos/button", 1, 100, 32, "Set price", -1, 25349, 1);
        a(25349, "pos/button", 2, 100, 32, 25350);
        a(65422, "Set quantity", this.a, 0, 16751360, true, true);
        a(25351, "pos/button", 1, 100, 32, "Item history", -1, 25352, 1);
        a(25352, "pos/button", 2, 100, 32, 25353);
        a(65423, "View item history", this.a, 0, 16751360, true, true);
        a(25354, "pos/button", 3, 100, 45, "Submit", -1, 25355, 1);
        a(25355, "pos/button", 4, 100, 45, 25356);
        a(65424, "Submit", this.a, 1, 16751360, true, true);
        a(65425, "@or1@TIP:@yel@ Item history\\n@yel@helps pricing!", this.a, 0, 16751360, true, true);
        a(25104, 1, 0, 25105, 5, "pos/button", 46, 20, "Go back");
        a(25105, 6, "pos/button", 46, 20, 25106);
        widgetD.k(27);
        widgetD.b(0, 65774, 82, 81);
        widgetD.b(1, 65775, 261, 89);
        widgetD.b(2, 65418, 414, 89);
        widgetD.b(3, 65419, 414, 89);
        widgetD.b(4, 25342, 92, 115);
        widgetD.b(5, 25343, aU.ho_, 126);
        widgetD.b(6, 25344, 354, 126);
        widgetD.b(7, 65451, 142, 156);
        widgetD.b(8, 25337, 93, 182);
        widgetD.b(9, 25339, 113, $Opcodes.INVOKESTATIC);
        widgetD.b(10, 25338, 93, aU.hm_);
        widgetD.b(11, 25340, 113, 204);
        widgetD.b(12, 25345, 235, 153);
        widgetD.b(13, 25346, 235, 153);
        widgetD.b(14, 65421, 285, 163);
        widgetD.b(15, 25348, 235, 183);
        widgetD.b(16, 25349, 235, 183);
        widgetD.b(17, 65422, 285, 193);
        widgetD.b(18, 25351, 235, 213);
        widgetD.b(19, 25352, 235, 213);
        widgetD.b(20, 65423, 285, 223);
        widgetD.b(21, 25354, aU.ij_, 200);
        widgetD.b(22, 25355, aU.ij_, 200);
        widgetD.b(23, 65424, 387, 213);
        widgetD.b(24, 65425, 386, 164);
        widgetD.b(25, 25104, 90, 89);
        widgetD.b(26, 25105, 90, 89);
    }
}
