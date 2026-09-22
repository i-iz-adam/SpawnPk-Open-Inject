package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_389.class */
public class class_389 extends class_360 {
    public class_389(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(64272);
        c(64273, 0, "achievements/SPRITE");
        a(64271, "@or1@Completed (0/100)", this.a, 2, 16751360, true, true);
        a(64274, "@or1@SpawnPK Achievement Diary", this.a, 2, 16751360, true, true);
        a(64275, 3, 0, 64276, 1, "achievements/SPRITE", 17, 17, "Close Window");
        a(64276, 2, "achievements/SPRITE", 17, 17, 64277);
        a(43509, "achievements/SPRITE", 7, 17, 17, "Collect all rewards", -1, 43510, 1);
        a(43510, "achievements/SPRITE", 8, 17, 17, 43511);
        a(64278, "@or2@Title of the achievement", this.a, 2, 16751360, false, true);
        a(64279, "@whi@Progress: @gre@0% (0/1)", this.a, 2, 16751360, false, true);
        for (int i = 0; i < 4; i++) {
            a(64280 + i, "Description " + (i + 1), this.a, 0, class_492.c, false, false);
        }
        int i2 = 64280 + 4;
        a(i2, "@or2@Bonuses you'll receive..", this.a, 0, 16751360, false, true);
        a(i2 + 1, "@or2@Items you'll receive..", this.a, 0, 16751360, false, true);
        Widget widgetD2 = d(i2 + 2);
        a(i2 + 3, "None!", this.a, 0, class_492.c, false, false);
        a(i2 + 4, "", this.a, 0, class_492.c, false, false);
        a(i2 + 5, "", this.a, 0, class_492.c, false, false);
        a(i2 + 6, "", this.a, 0, class_492.c, false, false);
        widgetD2.ak = new int[4];
        widgetD2.al = new int[4];
        widgetD2.ba = new int[4];
        for (int i3 = 0; i3 < 4; i3++) {
            widgetD2.b(i3, i2 + 3 + i3, 5, 5 + (15 * i3));
        }
        Widget widgetD3 = d(i2 + 7);
        widgetD3.ak = new int[1];
        widgetD3.al = new int[1];
        widgetD3.ba = new int[1];
        a(i2 + 8, (Boolean) false);
        H[i2 + 8].P = 2;
        H[i2 + 8].ab = 15;
        H[i2 + 8].ao = 10;
        H[i2 + 8].ax[0] = 996;
        H[i2 + 8].av[0] = 1337;
        H[i2 + 8].ax[1] = 538;
        H[i2 + 8].av[1] = 69;
        H[i2 + 8].ax[2] = 538;
        H[i2 + 8].av[2] = 69;
        H[i2 + 8].ax[3] = 538;
        H[i2 + 8].av[3] = 69;
        widgetD3.b(0, i2 + 8, 11, 5);
        widgetD3.aF = 200;
        widgetD3.P = 109;
        widgetD3.aP = 78;
        widgetD3.bh = 87;
        Widget widgetD4 = d(i2 + 9);
        widgetD4.aF = 1505;
        widgetD4.P = 134;
        widgetD4.aP = 248;
        widgetD4.bh = 87;
        widgetD4.ak = new int[100];
        widgetD4.al = new int[100];
        widgetD4.ba = new int[100];
        for (int i4 = 0; i4 < 100; i4++) {
            a(i2 + 10 + i4, "", "Select achievement", this.a, 0, 16723715, false, false, 125);
            widgetD4.b(i4, i2 + 10 + i4, 5, 5 + (i4 * 15));
        }
        a(64500 + 1, 4, 0, 64500 + 2, 3, "achievements/SPRITE", 35, 25, "Collect reward");
        a(64500 + 2, 4, "achievements/SPRITE", 35, 25, 64500 + 3);
        int i5 = 16 + 4;
        widgetD.ak = new int[i5];
        widgetD.al = new int[i5];
        widgetD.ba = new int[i5];
        widgetD.b(0, 64273, 5, 20);
        widgetD.b(1, 64274, 333, 31);
        widgetD.b(2, 64275, 475, 31);
        widgetD.b(3, 64276, 475, 31);
        widgetD.b(4, 64278, 224, 77);
        widgetD.b(5, 64279, 186, 104);
        for (int i6 = 0; i6 < 4; i6++) {
            widgetD.b(6 + i6, 64280 + i6, 186, 124 + (i6 * 15));
        }
        int i7 = 6 + 4;
        int i8 = i7 + 1;
        widgetD.b(i7, i2, 182, 204);
        int i9 = i8 + 1;
        widgetD.b(i8, i2 + 1, 354, 204);
        int i10 = i9 + 1;
        widgetD.b(i9, i2 + 2, 178, 218);
        int i11 = i10 + 1;
        widgetD.b(i10, i2 + 7, 354, 218);
        int i12 = i11 + 1;
        widgetD.b(i11, i2 + 9, 11, 57);
        int i13 = i12 + 1;
        widgetD.b(i12, 64500 + 1, 183, 71);
        int i14 = i13 + 1;
        widgetD.b(i13, 64500 + 2, 183, 71);
        int i15 = i14 + 1;
        widgetD.b(i14, 64271, 84, 31);
        int i16 = i15 + 1;
        widgetD.b(i15, 43509, 455, 31);
        int i17 = i16 + 1;
        widgetD.b(i16, 43510, 455, 31);
    }
}
