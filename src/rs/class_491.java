package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_491.class */
public class class_491 extends class_360 {
    public class_491(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(19993);
        a(4, widgetD);
        c(39985, 2, "construction/sprite");
        a(0, 39985, 35 + 0, 15 + 0, widgetD);
        a(1, 65418, 35 + 429, 15 + 4, widgetD);
        a(2, 65419, 35 + 429, 15 + 4, widgetD);
        a(3, 19992, 35 + 51, 15 + 60, widgetD);
        Widget widgetJ = j(19992);
        widgetJ.aF = 23 * 65;
        widgetJ.P = 330;
        widgetJ.aP = 220;
        String[] strArr = {"Parlour: Lvl 1", "Garden: Lvl 1", "Kitchen: lvl 5", "Dining room: lvl 10", "Workshop: lvl 15", "Bedroom: Lvl 20", "Hall - Skill Trophies: Lvl 25", "Games Room: Lvl 30", "Combat room: Lvl 32", "Hall - Quest trophies: Lvl 35", "Menagerie: Lvl 37", "Study: Lvl 40", "Costume room: Lvl 42", "Chapel: Lvl 45", "Boss portal room: Lvl 50", "Formal garden: Lvl 55", "Throne room: Lvl 60", "Superior garden: Lvl 65", "Dungeon - corridor: Lvl 70", "Dungeon - junction: Lvl 70", "Dungeon - stairs: Lvl 70", "Dungeon - pit: Lvl 70", "Treasure room: Lvl 75"};
        int[] iArr = {1000, 1000, 5000, 5000, 10000, 10000, 15000, 25000, 25000, 25000, 30000, 50000, 50000, 50000, 100000, 75000, 150000, 150000, 7500, 7500, 7500, 10000, 250000};
        String[] strArr2 = {"30k", "30k", "150k", "150k", "300k", "300k", "450k", "750k", "750k", "750k", "900k", "1500k", "1500k", "1500k", "300M", "2250k", "4500k", "500M", "300k", "300k", "300k", "350k", "1000k"};
        int i = 8;
        int i2 = 0;
        int i3 = 39879;
        a(23 * 4, widgetJ);
        int i4 = 0;
        while (i4 < strArr.length) {
            if (i3 == 39967) {
                i3 = 40300;
            }
            a(i3, 0, 3355443, false, User32.VK_OEM_WSCTRL, 61, strArr[i4].split(class_39.a)[0]);
            int i5 = i2;
            int i6 = i2 + 1;
            int i7 = i3;
            int i8 = i3 + 1;
            a(i5, i7, 4, i, widgetJ);
            addSprite(i8, "construction/" + (i4 + 4));
            int i9 = 13;
            int i10 = 5;
            if (i4 == 0) {
                i9 = 23;
            }
            if (i4 == 1) {
                i9 = 8;
                i10 = 7;
            }
            if (i4 == 2) {
                i9 = 11;
                i10 = 7;
            }
            if (i4 == 3) {
                i10 = 17;
            }
            if (i4 == 7) {
                i10 = 11;
            }
            if (i4 == 8) {
                i9 = 11;
            }
            if (i4 == 10) {
                i9 = 9;
            }
            if (i4 == 11) {
                i9 = 12;
                i10 = 1;
            }
            if (i4 == 12) {
                i9 = 25;
            }
            if (i4 == 14) {
                i9 = 9;
                i10 = 7;
            }
            if (i4 == 15) {
                i9 = 7;
            }
            if (i4 == 16) {
                i9 = 19;
                i10 = 0;
            }
            if (i4 == 17) {
                i9 = 5;
                i10 = 3;
            }
            if (i4 >= 18) {
                i9 = 6;
                i10 = 3;
            }
            if (i4 == 8) {
                i9 = 11;
            }
            int i11 = i6 + 1;
            int i12 = i8 + 1;
            a(i6, i8, 4 + i9, i + i10, widgetJ);
            a(i12, strArr[i4], strArr[i4], class_492.c, class_492.c, false, true, 0, 1);
            int i13 = i11 + 1;
            int i14 = i12 + 1;
            a(i11, i12, 4 + (i4 == 9 ? 75 : 82), i + 22, widgetJ);
            a(i14, "<img=9> " + strArr2[i4] + " gp", strArr2[i4], 16769316, 16769316, false, true, 0, 1);
            H[i14].X = new int[1][];
            H[i14].bi = new int[1];
            H[i14].bj = new int[1];
            H[i14].X[0] = new int[4];
            H[i14].X[0][0] = 4;
            H[i14].X[0][1] = 3214;
            H[i14].X[0][2] = 995;
            H[i14].X[0][3] = 0;
            H[i14].bi[0] = iArr[i4];
            H[i14].bj[0] = 10;
            i2 = i13 + 1;
            i3 = i14 + 1;
            a(i13, i14, 4 + User32.VK_OEM_AUTO, i + 25, widgetJ);
            i += 64;
            i4++;
        }
    }
}
