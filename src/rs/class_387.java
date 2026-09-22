package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_387.class */
public class class_387 extends class_360 {
    public static class_333 d;
    public static class_333 e;
    public static final int[] c = {32001, 32005, 32009, 32015, 32017};
    public static int f = 0;

    public static void m(int i) {
        if (i == 32001) {
            n(i);
            Widget.H[32014].as = "Achievements";
            Client.eT[2] = 44100;
            Client.fb = true;
            Client.menuIndex = true;
        }
        if (i == 32005) {
            n(i);
            Widget.H[32014].as = "Account Information";
            Client.eT[2] = 638;
            Client.fb = true;
            Client.menuIndex = true;
        }
        if (i == 32009) {
            n(i);
            Widget.H[32014].as = "Knowledgebase";
            Client.eT[2] = 64600;
            Client.fb = true;
            Client.menuIndex = true;
        }
        if (i == 32015) {
            n(i);
            Widget.H[32014].as = "World Events";
            Client.eT[2] = 40087;
            Client.fb = true;
            Client.menuIndex = true;
        }
        if (i == 32017) {
            n(i);
            Widget.H[32014].as = "<img=253> PK Ratings";
            Client.eT[2] = 40403;
            Client.fb = true;
            Client.menuIndex = true;
        }
        if (Client.eT[Client.fL] == 44100) {
            class_444.m(i);
        }
    }

    public static void n(int i) {
        boolean z = false;
        f = i;
        for (int i2 : c) {
            if (i2 == i) {
                z = true;
            }
        }
        if (z) {
            for (int i3 : c) {
                if (i3 == i) {
                    Widget.H[i3].E = d;
                    Widget.H[i3].aE = d;
                } else {
                    Widget.H[i3].E = e;
                    Widget.H[i3].aE = e;
                }
            }
        }
    }

    public class_387(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(32000);
        d = new class_333("gameframe/tab/sprite 2");
        e = new class_333("gameframe/tab/sprite 1");
        b(32001, 2, "gameframe/tab/sprite", "Open achievement tab");
        addSprite(32004, "gameframe/tab/achievement");
        Widget.H[32004].bl = false;
        b(32015, 2, "gameframe/tab/sprite", "Open events");
        addSprite(32016, "gameframe/tab/event");
        Widget.H[32016].bl = false;
        b(32017, 2, "gameframe/tab/sprite", "Open pk ratings");
        addSprite(32018, "gameframe/tab/ratings");
        Widget.H[32018].bl = false;
        b(32005, 2, "gameframe/tab/sprite", "Open account information");
        addSprite(32008, "gameframe/tab/player");
        Widget.H[32008].bl = false;
        b(32009, 2, "gameframe/tab/sprite", "Open guides");
        addSprite(32012, "gameframe/tab/info");
        Widget.H[32012].bl = false;
        addSprite(32013, "gameframe/tab/sprite 3");
        a(32014, "Title placeholder", this.a, 2, class_492.e, false, true);
        m(32001);
        widgetD.k(12);
        int i = 0 + 1;
        widgetD.b(0, 32013, 2 + 1, 2 + 25);
        int i2 = i + 1;
        widgetD.b(i, 32014, 2 + 5, 2 + 29);
        int i3 = i2 + 1;
        widgetD.b(i2, 32001, 0 + 2, 0 + 2);
        int i4 = i3 + 1;
        widgetD.b(i3, 32004, 7 + 2, 4 + 2);
        int i5 = i4 + 1;
        widgetD.b(i4, 32015, 31 + 2, 0 + 2);
        int i6 = i5 + 1;
        widgetD.b(i5, 32016, 38 + 2, 4 + 2);
        int i7 = i6 + 1;
        widgetD.b(i6, 32017, 62 + 2, 0 + 2);
        int i8 = i7 + 1;
        widgetD.b(i7, 32018, 69 + 2, 4 + 2);
        int i9 = i8 + 1;
        widgetD.b(i8, 32005, 93 + 2, 0 + 2);
        int i10 = i9 + 1;
        widgetD.b(i9, 32008, 100 + 2, 4 + 2);
        int i11 = i10 + 1;
        widgetD.b(i10, 32009, 124 + 2, 0 + 2);
        int i12 = i11 + 1;
        widgetD.b(i11, 32012, 131 + 2, 4 + 2);
    }
}
