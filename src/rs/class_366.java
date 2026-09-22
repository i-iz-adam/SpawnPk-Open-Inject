package rs;

import com.google.inject.internal.asm.$Opcodes;
import com.sun.jna.platform.win32.bk;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_366.class */
public class class_366 extends class_360 {
    public class_366(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(25754);
        addSprite(25755, "popups/duel");
        c(25756, 1, "gambling/SPRITE");
        c(25757, 1, "gambling/SPRITE");
        c(25758, 1, "gambling/SPRITE");
        a(25759, "Standard duel", "Select", this.a, 0, class_492.d, false, true, 160);
        a(25760, "Whip only", "Select", this.a, 0, class_492.d, false, true, 160);
        a(25761, "Whip + dds only", "Select", this.a, 0, class_492.d, false, true, 160);
        a(25762, "Select a duel type..", this.a, 2, 16751360, false, true);
        a(25763, "Invite", "Select", this.a, 0, bk.ao, false, true, 160);
        a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        widgetD.k(11);
        widgetD.b(0, 25755, 171, 85);
        widgetD.b(1, 25762, 181, 96);
        widgetD.b(2, 25756, $Opcodes.INVOKESTATIC, 129);
        widgetD.b(3, 25759, 204, 131);
        widgetD.b(4, 25757, $Opcodes.INVOKESTATIC, 129 + 20);
        widgetD.b(5, 25760, 204, 131 + 20);
        widgetD.b(6, 25758, $Opcodes.INVOKESTATIC, 129 + (20 * 2));
        widgetD.b(7, 25761, 204, 131 + (20 * 2));
        widgetD.b(8, 25763, User32.VK_NONAME, 208);
        widgetD.b(9, 65418, 330, 95);
        widgetD.b(10, 65419, 330, 95);
    }
}
