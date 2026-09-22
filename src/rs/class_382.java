package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_382.class */
public class class_382 extends class_360 {
    public class_382(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        i();
        h();
    }

    private void h() {
        Widget widgetD = d(41000);
        c(41001, 0, "factory/SPRITE");
        a(41002, 1, 0, 41004, 1, "factory/SPRITE", 46, 20, "Close Window");
        a(41004, 2, "factory/SPRITE", 46, 20, 41005);
        b(41006, 75, 50);
        a(41007, "/fountain/sprite", 16, 120, 34, "Toggle spawner", -1, 41008, 1);
        a(41008, "/fountain/sprite", 15, 120, 34, 41009);
        a(41010, "Monster Spawner", this.a, 2, 16751360, true, true);
        a(41011, "Monster Selections", this.a, 1, class_492.d, true, true);
        a(41012, "This spawner will provide you with 5 spawns", this.a, 0, class_492.d, true, true);
        a(41013, "before requiring you to re-activate it again.", this.a, 0, class_492.d, true, true);
        a(41014, "", this.a, 0, class_492.d, true, true);
        a(41016, "<img=57> Activate @gre@(x5)", this.a, 0, 16751360, true, true);
        a(41017, "Spawn distanced", this.a, 0, 16751360, true, true);
        a(41018, "Spawn x3", this.a, 0, 16751360, true, true);
        a(41019, "You have selected: @yel@NPC Name", this.a, 0, 16751360, true, true);
        widgetD.ak = new int[14];
        widgetD.al = new int[14];
        widgetD.ba = new int[14];
        widgetD.b(0, 41001, 7, 30);
        widgetD.b(1, 41002, 476 + 7, (8 + 30) - 2);
        widgetD.b(2, 41004, 476 + 7, (8 + 30) - 2);
        widgetD.b(3, 41006, 7 + 140, 30 + 80 + 23);
        widgetD.b(4, 41007, 7 + 58 + 56, ((30 + 169) - 10) + 23);
        widgetD.b(5, 41008, 7 + 58 + 56, ((30 + 169) - 10) + 23);
        widgetD.b(6, 41016, 7 + 58 + 49 + 66, (((30 + 170) + 10) - 10) + 23);
        widgetD.b(7, 41010, 7 + 255, 30 + 7);
        widgetD.b(8, 41011, 7 + 414, 30 + 32);
        widgetD.b(9, 41012, 7 + 58 + 49 + 66, (((30 + 168) + 10) - 10) + 53);
        widgetD.b(10, 41013, 7 + 58 + 49 + 66, (((30 + 168) + 10) - 10) + 53 + 13);
        widgetD.b(11, 41014, 7 + 58 + 49 + 66, (((30 + 168) + 10) - 10) + 53 + 13 + 13);
        widgetD.b(12, 41019, 172 + 7, 136 + 30 + 23);
        widgetD.b(13, 41020, (343 + 7) - 13, 29 + 30 + 21);
    }

    private void i() {
        Widget widgetD = d(41020);
        widgetD.aF = 350;
        widgetD.P = 143;
        widgetD.aP = 211;
        widgetD.bh = 87;
        for (int i = 0; i < 22; i++) {
            a(41021 + i, "NPC IDX @yel@" + i + " (" + (41021 + i) + ")", "Spawn this NPC", this.a, 0, class_492.e, false, false, 125);
        }
        widgetD.ak = new int[22];
        widgetD.al = new int[22];
        widgetD.ba = new int[22];
        for (int i2 = 0; i2 < 22; i2++) {
            widgetD.b(i2, 41021 + i2, 10, 3 + (15 * i2));
        }
    }
}
