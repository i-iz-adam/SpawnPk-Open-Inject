package rs;

import com.google.inject.internal.asm.$Opcodes;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_455.class */
public class class_455 extends class_360 {
    public static class_495 c;
    public static class_495 d;
    public static final int e = 32019;
    static final int f = 32020;
    static final int g = 32021;
    static final int bG = 32022;
    static final int bH = 32023;
    static final int bI = 32024;
    static final int bJ = 32025;
    static final int bK = 32026;
    static final int bL = 32165;
    static final int bM = 32166;
    static final int bN = 32167;
    static final int bO = 32168;
    static final int bP = 32169;
    static final int bQ = 32170;
    static final int bR = 32175;
    static final int bS = 32176;
    static final int bT = 32177;
    static final int bU = 32178;
    static final int bV = 32181;
    static final int bW = 32184;
    static final int bX = 32185;
    static final int bY = 32188;
    static class_333 bZ;
    static class_333 ca;
    static class_333 cb;
    static class_333 cc;
    public static int cd = $Opcodes.INVOKESTATIC;
    private static final class_456 ce = new class_456();
    private static final class_458 cf = new class_458();

    public class_455(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        bZ = new class_333(true, "misc/mail 4");
        ca = new class_333(true, "misc/mail 5");
        cb = new class_333(true, "misc/mail 11");
        cc = new class_333(true, "misc/mail 12");
        c = new class_495(d(e));
        c.a(class_351.a(f, "misc/mail 1").a()).a(3, 2);
        c.a(class_352.a(g, "No mail message selected!").i().b().m(class_492.d)).a(f, 337, 154);
        c.a(class_352.a(bG, "Inbox (35 / 35)").j().m(class_492.e)).a(f, 52, 11);
        class_342.b(bX, "misc/refresh 1", "").a(32186, "misc/refresh 2");
        c.a(bX).a(f, 8, 8);
        c.a(32186).a(f, 8, 8);
        d = new class_495(class_350.f(bH, 134, 288));
        d.a();
        ce.a();
        for (int i = 0; i < 35; i++) {
            ce.a(class_457.a, "Test message #" + i);
        }
        ce.b();
        c.a(bH).a(f, 8, 35);
        c.a(class_351.a(bM, "misc/mail 2")).a(f, 163, 8);
        c.a(class_352.a(bO, "Mail Subject").j().m(class_492.e)).a(bM, 171, 13);
        c.a(class_352.a(bP, "<img=37> Sent 'x' time ago (Expires in 'x' time)").i().m(class_492.d)).a(bM, 169, 36);
        c.a(class_342.b(bW, "misc/mail 6", "Delete this message").a()).a(bM, 472, 31);
        c.a(class_446.bI).a(f, 162, 57);
        c.a(class_351.a(bN, "misc/mail 3")).a(f, 163, 241);
        c.a(class_352.a(bQ, "<img=209> Items / Rewards").j().m(class_492.e)).a(bN, 171, 254);
        class_350 class_350VarF = class_350.f(bT, 321, 44);
        class_349 class_349VarA = class_349.g(bR, 28).a(7);
        class_495 class_495Var = new class_495(class_350VarF);
        class_495Var.a(class_349VarA).a(5, 7);
        class_495Var.a();
        c.a(class_350VarF).a(bN, 167, 280);
        c.a(class_351.a(bY, "misc/mail 10").a()).a(bN, 167, 280);
        l(bY).bd = false;
        c.a(class_352.a(bS, "No items attached to this message!").i().m(class_492.d).b()).a(bN, 341, User32.WM_CHANGEUISTATE);
        class_342.b(bV, "bank/bank 17", "Deposit items to inventory").a(32182, "bank/bank 18");
        c.a(bV).a(bN, 428, 249);
        c.a(32182).a(bN, 428, 249);
        class_342.b(bU, "bank/bank 31", "Deposit items to bank").a(32179, "bank/bank 32");
        c.a(bU).a(bN, 466, 249);
        c.a(32179).a(bN, 466, 249);
        cf.a(class_459.c);
        cf.b();
        c.a(63740).a(f, 485, 8);
        c.a(63741).a(f, 485, 8);
        c.a();
    }

    public static class_456 h() {
        return ce;
    }

    public static class_458 i() {
        return cf;
    }
}
