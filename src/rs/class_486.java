package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_486.class */
public class class_486 extends class_360 {
    public class_486(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(42100);
        addSprite(35612, "bank/bank 30");
        a(42101, (Boolean) true);
        H[42101].W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", null};
        H[42101].K = new int[70];
        H[42101].av = new int[70];
        H[42101].ax = new int[70];
        H[42101].ar = new int[70];
        H[42101].P = 7;
        H[42101].aP = 10;
        H[42101].ab = 32;
        H[42101].ao = 16;
        Widget widgetD2 = d(42102);
        widgetD2.ak = new int[1];
        widgetD2.al = new int[1];
        widgetD2.ba = new int[1];
        widgetD2.aF = 500;
        widgetD2.P = 445;
        widgetD2.aP = User32.VK_OEM_ENLW;
        widgetD2.bh = 87;
        widgetD2.k(1);
        widgetD2.b(0, 42101, 5, 10);
        a(42103, "<img=131> Coffer of Unclaimed Rewards & Prizes <img=131>", this.a, 2, 16751360, true, true);
        a(42104, 5, 42105, 17, "bank/bank", 35, 25, "Deposit items to your inventory", 42106, 18, "bank/bank", 42107, "Empty your backpack into\nyour bank", 0, 20);
        a(42108, 5, 42109, 31, "bank/bank", 31, 25, "Deposit items to your bank", 42110, 31, "bank/bank", 42111, "Empty your backpack into\nyour bank", 0, 20);
        a(42112, "<img=9> This coffer usually holds contest prizes, event rewards, etc.", this.a, 1, 16751360, false, true);
        a(42113, "(Especially if you were offline when you received them)", this.a, 0, class_492.d, false, true);
        widgetD.k(11);
        widgetD.b(0, 35612, 13, 13);
        widgetD.b(1, 42102, 31, 38);
        widgetD.b(2, 65418, 476, 17);
        widgetD.b(3, 65419, 476, 17);
        widgetD.b(4, 42103, 258, 18);
        widgetD.b(5, 42104, 455, 284);
        widgetD.b(6, 42105, 455, 284);
        widgetD.b(7, 42108, 415, 284);
        widgetD.b(8, 42109, 415, 284);
        widgetD.b(9, 42112, 25, 283);
        widgetD.b(10, 42113, 25, aU.ib_);
    }
}
