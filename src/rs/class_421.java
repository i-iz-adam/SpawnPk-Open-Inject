package rs;

import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_421.class */
public class class_421 extends class_360 {
    public class_421(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(45900);
        addSprite(45901, "popups/repair");
        a(45902, "Item repairing coffer", this.a, 2, 16751360, true, true);
        a(45903, "Gold stored: @yel@0 gp", this.a, 1, 16751360, false, true);
        a(45904, "teleport/SPRITE", 10, 100, 32, "Store gold", -1, 45905, 1);
        a(45905, "teleport/SPRITE", 11, 100, 32, 45906);
        a(45907, "Deposit", this.a, 0, 16751360, true, true);
        a(45908, "teleport/SPRITE", 10, 100, 32, "Withdraw gold", -1, 45909, 1);
        a(45909, "teleport/SPRITE", 11, 100, 32, 45910);
        a(45911, "Withdraw", this.a, 0, 16751360, true, true);
        c(45912, 1, "gambling/SPRITE");
        a(45913, "Auto-repair (gold)", "Toggle gold auto repair", this.a, 0, class_492.e, false, true, 150);
        a(45914, "Blood shards stored: @yel@0", this.a, 1, 16751360, false, true);
        a(45915, "teleport/SPRITE", 10, 100, 32, "Store shards", -1, 45916, 1);
        a(45916, "teleport/SPRITE", 11, 100, 32, 45917);
        a(45918, "Deposit", this.a, 0, 16751360, true, true);
        a(45919, "teleport/SPRITE", 10, 100, 32, "Withdraw shards", -1, 45920, 1);
        a(45920, "teleport/SPRITE", 11, 100, 32, 45921);
        a(45922, "Withdraw", this.a, 0, 16751360, true, true);
        c(45923, 1, "gambling/SPRITE");
        a(45924, "Auto-repair (shard)", "Toggle shard auto repair", this.a, 0, class_492.e, false, true, 150);
        a(45925, "Repair scrolls stored: @yel@0", this.a, 1, 16751360, false, true);
        a(45926, "teleport/SPRITE", 10, 100, 32, "Store shards", -1, 45927, 1);
        a(45927, "teleport/SPRITE", 11, 100, 32, 45928);
        a(45929, "Deposit", this.a, 0, 16751360, true, true);
        a(45930, "teleport/SPRITE", 10, 100, 32, "Withdraw shards", -1, 45931, 1);
        a(45931, "teleport/SPRITE", 11, 100, 32, 45932);
        a(45933, "Withdraw", this.a, 0, 16751360, true, true);
        a(45934, "@yel@Scrolls will auto-repair\\n@yel@over shards and coins!", this.a, 0, 16751360, true, true);
        widgetD.k(30);
        widgetD.b(0, 45901, 86, 89);
        widgetD.b(1, 63740, g.c, 99);
        widgetD.b(2, 63741, g.c, 99);
        widgetD.b(3, 45902, User32.WM_IME_STARTCOMPOSITION, 99);
        widgetD.b(4, 45903, 97, 129);
        widgetD.b(5, 45904, 95, 148);
        widgetD.b(6, 45905, 95, 148);
        widgetD.b(7, 45907, 143, 158);
        widgetD.b(8, 45908, 200, 148);
        widgetD.b(9, 45909, 200, 148);
        widgetD.b(10, 45911, 248, 158);
        widgetD.b(11, 45912, CGL.kCGLCESurfaceBackingSize, 157);
        widgetD.b(12, 45913, 323, 160);
        widgetD.b(13, 45914, 97, 129 + 65);
        widgetD.b(14, 45915, 95, 148 + 65);
        widgetD.b(15, 45916, 95, 148 + 65);
        widgetD.b(16, 45918, 143, 158 + 65);
        widgetD.b(17, 45919, 200, 148 + 65);
        widgetD.b(18, 45920, 200, 148 + 65);
        widgetD.b(19, 45922, 248, 158 + 65);
        widgetD.b(20, 45923, CGL.kCGLCESurfaceBackingSize, 157 + 65);
        widgetD.b(21, 45924, 323, 160 + 65);
        widgetD.b(22, 45925, 97, 129 + 130);
        widgetD.b(23, 45926, 95, 148 + 130);
        widgetD.b(24, 45927, 95, 148 + 130);
        widgetD.b(25, 45929, 143, 158 + 130);
        widgetD.b(26, 45930, 200, 148 + 130);
        widgetD.b(27, 45931, 200, 148 + 130);
        widgetD.b(28, 45933, 248, 158 + 130);
        widgetD.b(29, 45934, g.p, 154 + 130);
        for (int i = 0; i < 30; i++) {
            int[] iArr = widgetD.ba;
            int i2 = i;
            iArr[i2] = iArr[i2] - 45;
        }
    }
}
