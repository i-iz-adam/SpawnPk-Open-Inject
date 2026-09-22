package rs;

import com.google.a.l.c;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.opencl.CL11;

/* JADX INFO: loaded from: client-final.jar:rs/class_408.class */
public class class_408 extends class_360 {
    public static final String[] c = {"Attack", "Defence", "Strength", "Hitpoints", c.E, "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblore", "Agility", "Thieving", "Slayer", "Farming", "Runecrafting", "Construction", "Hunter", "Summoning"};

    private static int b(String str) {
        for (int i = 0; i < c.length; i++) {
            if (str.equals(c[i])) {
                return i;
            }
        }
        return -1;
    }

    public class_408(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(3917);
        c(19999, 1, "skills/SKILL");
        a(50240, "Total Level: 0", class_492.g, false, true, 52, this.a, 2);
        a(3, widgetD);
        b(19999, 5, 17, 0, widgetD);
        b(20001, 7, 20, 1, widgetD);
        b(50240, 7, 1, 2, widgetD);
        Widget widgetD2 = d(20001);
        widgetD2.aP = 226;
        widgetD2.P = 163;
        widgetD2.aF = 258;
        a(97, widgetD2);
        int i = 1;
        int[] iArr = {3, 3, 3, 34, 34, 34, 66, 66, 66, 98, 98, 98, 131, 131, 131, 162, 162, 162, 195, 195, 195, 228, 228, 228};
        int[] iArr2 = {24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132};
        int[] iArr3 = {15, 15, 15, 48, 48, 48, 80, 80, 80, 111, 111, 111, 145, 145, 145, 175, 175, 175, 208, 208, 208, 241, 241, 241};
        int[] iArr4 = {36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144};
        int[] iArr5 = {aU.vT, 4016, 4028, aU.vV, 4018, 4030, 4008, 4020, 4032, 4010, 4022, 4034, 4012, 4024, 4036, 4014, 4026, 4038, CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_INT, 12166, 13926, 50204, 50206, 50208};
        int[] iArr6 = {aU.vU, 4017, 4029, 4007, 4019, 4031, 4009, 4021, 4033, 4011, 4023, 4035, 4013, 4025, 4037, 4015, 4027, 4039, CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG, 12167, 13927, 50205, 50207, 50209};
        int[] iArr7 = {2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109};
        int[] iArr8 = {0, 0, 0, 32, 32, 32, 64, 64, 64, 96, 96, 96, 128, 128, 128, 160, 160, 160, 192, 192, 192, 224, 224, 224};
        int[] iArr9 = {50002, 50003, 50004, 50005, 50006, 50007, 50008, 50009, 50010, 50011, 50012, 50013, 50014, 50015, 50016, 50017, 50018, 50019, 50020, 50021, 50022, 50210, 50220, 50230};
        int[] iArr10 = {50023, 50030, 50037, 50044, 50051, 50058, 50065, 50072, 50080, 50087, 50094, 50101, 50108, 50115, 50122, 50129, 50136, 50143, 50150, 50157, 50164, 50215, 50225, 50235};
        String[] strArr = {"Combat", "Combat", "Mining", "Combat", "Agility", "Smithing", "Combat", "Herblore", "Fishing", c.E, "Thieving", "Cooking", "Prayer", "Crafting", "Firemaking", "Magic", "Fletching", "Woodcutting", "Runecrafting", "Slayer", "Farming", "Construction", "Hunter", "Summoning"};
        String[] strArr2 = {"Attack", "Hitpoints", "Mining", "Strength", "Agility", "Smithing", "Defence", "Herblore", "Fishing", c.E, "Thieving", "Cooking", "Prayer", "Crafting", "Firemaking", "Magic", "Fletching", "Woodcutting", "Runecrafting", "Slayer", "Farming", "Construction", "Hunter", "Summoning"};
        int[] iArr11 = {15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28};
        int[] iArr12 = {34, 34, 34, 66, 66, 66, 98, 98, 98, 130, 130, 130, 162, 162, 162, 83, 83, 83, 118, 118, 118, 153, 153, 153};
        int i2 = 0;
        for (int i3 : iArr5) {
            a(i3, "%1", class_492.g, true, true, 52, this.a, 0);
            if (i3 == 50208) {
                b(i3, 99999, 999999, i, widgetD2);
            } else {
                b(i3, iArr2[i - 1] + 7, iArr[i - 1] + 1, i, widgetD2);
            }
            int[][] iArr13 = new int[1][3];
            iArr13[0][0] = 1;
            int i4 = i2;
            i2++;
            iArr13[0][1] = b(strArr2[i4]);
            iArr13[0][2] = 0;
            H[i3].X = iArr13;
            i++;
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 : iArr6) {
            a(i7, "%1", class_492.g, true, true, 52, this.a, 0);
            if (i7 == 50209) {
                b(i7, 99999, 999999, i, widgetD2);
            } else {
                b(i7, iArr4[i5] + 7, iArr3[i5] + 1, i, widgetD2);
            }
            int[][] iArr14 = new int[1][3];
            iArr14[0][0] = 2;
            int i8 = i6;
            i6++;
            iArr14[0][1] = b(strArr2[i8]);
            iArr14[0][2] = 0;
            H[i7].X = iArr14;
            i++;
            i5++;
        }
        int i9 = 0;
        for (int i10 : iArr9) {
            a(i10, 0, "", strArr[i9], 1, iArr10[i9], this.a, strArr2[i9]);
            if (i10 == 50230) {
                b(i10, 9999999, 99999999, i, widgetD2);
            } else {
                b(i10, iArr7[i9], iArr8[i9], i, widgetD2);
            }
            i++;
            i9++;
        }
        int i11 = 0;
        for (int i12 : iArr10) {
            if (i12 == 50235) {
                b(i12, 9999999, 99999999, i, widgetD2);
            } else {
                b(i12, iArr11[i11], iArr12[i11], i, widgetD2);
            }
            i++;
            i11++;
        }
        c(20200, 0, "skills/SKILL");
        b(20200, 0, 0, 0, widgetD2);
    }

    public static void a(int i, int i2, String str, String str2, int i3, int i4, class_338[] class_338VarArr, String str3) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = i;
        widgetD.aG = 5;
        widgetD.M = i3;
        widgetD.J = 0;
        widgetD.aA = (byte) 0;
        widgetD.aa = i4;
        widgetD.E = new class_333("skills/" + str);
        widgetD.aE = new class_333("skills/" + str);
        widgetD.P = 53;
        widgetD.aP = 32;
        widgetD.Q = "View " + str2 + " Guide";
        Widget widgetD2 = d(i4);
        widgetD2.aO = true;
        widgetD2.aG = 0;
        widgetD2.M = 0;
        widgetD2.aa = -1;
        widgetD2.P = 512;
        widgetD2.aP = 334;
        widgetD2.ag = i4;
        widgetD2.au = i4;
        a(i4 + 1, 0, false, 0, str3 + " Lvl:\nCurrentXP:\nNext Lvl:\nRemainder:");
        a(1, widgetD2);
        b(i4 + 1, 0, 0, 0, widgetD2);
    }

    public static void b(int i, String str, int i2, boolean z, boolean z2, int i3, class_338[] class_338VarArr, int i4) {
        Widget widgetJ = j(i);
        widgetJ.ag = i;
        widgetJ.au = i;
        widgetJ.aG = 4;
        widgetJ.M = 0;
        widgetJ.P = 0;
        widgetJ.aP = 0;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = i3;
        widgetJ.S = z;
        widgetJ.aQ = z2;
        widgetJ.an = class_338VarArr[i4];
        widgetJ.as = str;
        widgetJ.ac = i2;
    }
}
