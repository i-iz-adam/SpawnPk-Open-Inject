package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_464.class */
public class class_464 {
    public static void a() {
        for (int i = 32487; i <= 32516; i++) {
            class_463.l(i).as = "<img=291><tab=150><img=291><tab=225><img=291>";
        }
    }

    public static void b() {
        for (int i = 32487; i <= 32516; i++) {
            class_463.l(i).as = "---<tab=150>--<tab=225>---------";
        }
    }

    public static void a(class_495 class_495Var) {
        class_495Var.a(class_351.a(class_463.cp, "raids/list")).b(class_463.bH, 11, 50);
        class_350 class_350VarM = class_350.a(class_463.cq).g(469, 235).m(560);
        class_350VarM.a(class_352.a(class_463.cv, "")).a(0, 0);
        for (int i = 32487; i <= 32516; i++) {
            class_352.a(i, "---<tab=150>--<tab=225>---------").a("Join party", 483).l();
            class_350VarM.n(i).a(10, 3 + ((i - 32487) * 18));
        }
        class_350VarM.a();
        class_495Var.a(class_350VarM).b(class_463.cp, 3, 24);
        class_495Var.a(class_352.a(class_463.cr, "Party<tab=150>Size<tab=225>Raid Type & Difficulty").j().m()).b(class_463.cp, 10 + 2, 5);
        class_495Var.a(class_342.b(class_463.cx, "raids/refresh 1", "Refresh party list").a().a("raids/refresh 2")).b(class_463.bH, 483, 53);
        class_495Var.a(class_342.b(class_463.bO, "raids/close1", "Close interface").b("raids/close2")).b(class_463.bH, 493, 3);
    }
}
