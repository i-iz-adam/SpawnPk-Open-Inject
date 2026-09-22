package rs;

import com.google.inject.internal.asm.$Opcodes;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_481.class */
public class class_481 extends class_360 {
    public class_481(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    private void m(int i) {
        int i2 = i + 1;
        a(i, 3, "clan/sprite", "Only me", 17256, 1, 150, 30);
        int i3 = i2 + 1;
        a(i2, 3, "clan/sprite", "General+", 17256, 1, 150, 30);
        int i4 = i3 + 1;
        a(i3, 3, "clan/sprite", "Captain+", 17256, 1, 150, 30);
        int i5 = i4 + 1;
        a(i4, 3, "clan/sprite", "Lieutenant+", 17256, 1, 150, 30);
        int i6 = i5 + 1;
        a(i5, 3, "clan/sprite", "Sergeant+", 17256, 1, 150, 30);
        int i7 = i6 + 1;
        a(i6, 3, "clan/sprite", "Corporal+", 17256, 1, 150, 30);
        int i8 = i7 + 1;
        a(i7, 3, "clan/sprite", "Recruit+", 17256, 1, 150, 30);
        int i9 = i8 + 1;
        a(i8, 3, "clan/sprite", "Any friends", 17256, 1, 150, 30);
    }

    private void n(int i) {
        int i2 = i + 1;
        a(i, 3, "clan/sprite", "General+", 17256, 1, 150, 30);
        int i3 = i2 + 1;
        a(i2, 3, "clan/sprite", "Captain+", 17256, 1, 150, 30);
        int i4 = i3 + 1;
        a(i3, 3, "clan/sprite", "Lieutenant+", 17256, 1, 150, 30);
        int i5 = i4 + 1;
        a(i4, 3, "clan/sprite", "Sergeant+", 17256, 1, 150, 30);
        int i6 = i5 + 1;
        a(i5, 3, "clan/sprite", "Corporal+", 17256, 1, 150, 30);
        int i7 = i6 + 1;
        a(i6, 3, "clan/sprite", "Recruit+", 17256, 1, 150, 30);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetJ = j(25744);
        c(17251, 1, "clan/sprite");
        a(17252, "clan/sprite", 2, 150, 30, "Set name", -1, 17253, 1);
        a(17253, "clan/sprite", 3, 150, 30, 17254);
        a(17255, "clan/sprite", 2, 150, 30, "Anyone", -1, 17256, 1);
        a(17256, "clan/sprite", 3, 150, 30, 65359);
        m(65359);
        a(17258, "clan/sprite", 2, 150, 30, "Anyone", -1, 17259, 1);
        a(17259, "clan/sprite", 3, 150, 30, 17260);
        m(65367);
        a(17261, "clan/sprite", 2, 150, 30, "Only me", -1, 17262, 1);
        a(17262, "clan/sprite", 3, 150, 30, 17263);
        n(65375);
        a(17264, "clan/sprite", 2, 150, 30, "Only me", -1, 17265, 1);
        a(17265, "clan/sprite", 3, 150, 30, 17266);
        n(65380);
        a(17267, "clan/close", 0, 50, 50, "Close", -1, 17268, 1);
        a(17268, "clan/close", 1, 40, 50, 17269);
        a(17800, "Clan name:", this.a, 0, class_492.e, false, true);
        a(17802, "Enter Name", this.a, 2, class_492.c, true, true);
        a(17801, "Who can enter chat?", this.a, 0, class_492.e, false, true);
        a(17803, "Any friends", this.a, 2, class_492.c, true, true);
        a(17812, "Who can talk on chat?", this.a, 0, class_492.e, false, true);
        a(17804, "Anyone", this.a, 2, class_492.c, true, true);
        a(17813, "Who can kick/mute?", this.a, 0, class_492.e, false, true);
        a(17805, "Only me", this.a, 2, class_492.c, true, true);
        a(17814, "Who can ban on chat?", this.a, 0, class_492.e, false, true);
        a(17806, "Only me", this.a, 2, class_492.c, true, true);
        a(17807, "Right click on\\nwhite text to\\nchange options.", this.a, 2, class_492.d, true, true);
        c(54000, 1, "gambling/SPRITE");
        a(54001, "Add co-owner privileges\\nto the General rank", "Select", this.a, 0, class_492.d, true, true, 160);
        widgetJ.k(52);
        int i = 0;
        for (int i2 = 65359; i2 < 65367; i2++) {
            int i3 = i;
            i++;
            widgetJ.b(i3, i2, 25, 87);
        }
        for (int i4 = 65367; i4 < 65375; i4++) {
            int i5 = i;
            i++;
            widgetJ.b(i5, i4, 25, 128);
        }
        for (int i6 = 65375; i6 < 65380; i6++) {
            int i7 = i;
            i++;
            widgetJ.b(i7, i6, 25, 168);
        }
        for (int i8 = 65380; i8 < 65385; i8++) {
            int i9 = i;
            i++;
            widgetJ.b(i9, i8, 25, aU.hs_);
        }
        int i10 = i;
        int i11 = i + 1;
        widgetJ.b(i10, 17251, 15, 15);
        int i12 = i11 + 1;
        widgetJ.b(i11, 17252, 25, 47);
        int i13 = i12 + 1;
        widgetJ.b(i12, 17253, 25, 47);
        int i14 = i13 + 1;
        widgetJ.b(i13, 17255, 25, 87);
        int i15 = i14 + 1;
        widgetJ.b(i14, 17256, 25, 87);
        int i16 = i15 + 1;
        widgetJ.b(i15, 17258, 25, 128);
        int i17 = i16 + 1;
        widgetJ.b(i16, 17259, 25, 128);
        int i18 = i17 + 1;
        widgetJ.b(i17, 17261, 25, 168);
        int i19 = i18 + 1;
        widgetJ.b(i18, 17262, 25, 168);
        int i20 = i19 + 1;
        widgetJ.b(i19, 17264, 25, aU.hs_);
        int i21 = i20 + 1;
        widgetJ.b(i20, 17265, 25, aU.hs_);
        int i22 = i21 + 1;
        widgetJ.b(i21, 17800, 76, 51);
        int i23 = i22 + 1;
        widgetJ.b(i22, 17801, 52, 91);
        int i24 = i23 + 1;
        widgetJ.b(i23, aU.RT, 0, 94);
        int i25 = i24 + 1;
        widgetJ.b(i24, 17812, 48, 133);
        int i26 = i25 + 1;
        widgetJ.b(i25, 17813, 52, 172);
        int i27 = i26 + 1;
        widgetJ.b(i26, 17814, 48, 213);
        int i28 = i27 + 1;
        widgetJ.b(i27, 17267, 476, 23);
        int i29 = i28 + 1;
        widgetJ.b(i28, 17268, 476, 23);
        int i30 = i29 + 1;
        widgetJ.b(i29, 17802, 102, 63);
        int i31 = i30 + 1;
        widgetJ.b(i30, 17803, 102, 103);
        int i32 = i31 + 1;
        widgetJ.b(i31, 17804, 100, 144);
        int i33 = i32 + 1;
        widgetJ.b(i32, 17805, 101, $Opcodes.INVOKESTATIC);
        int i34 = i33 + 1;
        widgetJ.b(i33, 17806, 101, 225);
        int i35 = i34 + 1;
        widgetJ.b(i34, 54000, 28, 255);
        int i36 = i35 + 1;
        widgetJ.b(i35, 54001, 28, User32.VK_NONAME);
        Widget widgetJ2 = j(aU.RT);
        widgetJ2.P = 474;
        widgetJ2.aP = aU.ht_;
        widgetJ2.aF = 3050;
        for (int i37 = 26024; i37 < 26024 + (aU.io_ / 2); i37++) {
            a(i37, "", this.a, 2, class_492.c, false, true);
        }
        for (int i38 = 26024 + (aU.io_ / 2); i38 < 26024 + aU.io_; i38++) {
            a(i38, "", this.a, 2, class_492.c, false, true);
        }
        int i39 = 20201;
        for (int i40 = 0; i40 < 201; i40++) {
            int i41 = i39;
            int i42 = i39 + 1;
            a(i41, 3, "test/clan/sprite", "General" + (0 != 0 ? " " + (i42 - 1) : ""), -1, 1, 150, 14 - 3);
            int i43 = i42 + 1;
            a(i42, 3, "test/clan/sprite", "Captain" + (0 != 0 ? " " + (i43 - 1) : ""), -1, 1, 150, 14 - 3);
            int i44 = i43 + 1;
            a(i43, 3, "test/clan/sprite", "Lieutenant" + (0 != 0 ? " " + (i44 - 1) : ""), -1, 1, 150, 14 - 3);
            int i45 = i44 + 1;
            a(i44, 3, "test/clan/sprite", "Sergeant" + (0 != 0 ? " " + (i45 - 1) : ""), -1, 1, 150, 14 - 3);
            int i46 = i45 + 1;
            a(i45, 3, "test/clan/sprite", "Corporal" + (0 != 0 ? " " + (i46 - 1) : ""), -1, 1, 150, 14 - 3);
            int i47 = i46 + 1;
            a(i46, 3, "test/clan/sprite", "Recruit" + (0 != 0 ? " " + (i47 - 1) : ""), -1, 1, 150, 14 - 3);
            int i48 = i47 + 1;
            a(i47, 3, "test/clan/sprite", "Banned" + (0 != 0 ? " " + (i48 - 1) : ""), -1, 1, 150, 14 - 3);
            i39 = i48 + 1;
            a(i48, 3, "test/clan/sprite", "Not ranked" + (0 != 0 ? " " + (i39 - 1) : ""), -1, 1, 150, 14 - 3);
        }
        widgetJ2.k(aU.io_ + aU.qL);
        int i49 = 0;
        int i50 = 0;
        for (int i51 = 26024; i51 < 26024 + (aU.io_ / 2); i51++) {
            widgetJ2.b(i49, i51, 200, i50);
            i49++;
            i50 += 15;
        }
        int i52 = 0;
        for (int i53 = 26024 + (aU.io_ / 2); i53 < 26024 + aU.io_; i53++) {
            widgetJ2.b(i49, i53, 337, i52);
            i49++;
            i52 += 15;
        }
        int i54 = 0;
        int i55 = 20201;
        for (int i56 = 0; i56 < 201; i56++) {
            for (int i57 = 0; i57 < 8; i57++) {
                int i58 = i55;
                i55++;
                widgetJ2.b(i49, i58, 337, i54);
                i49++;
            }
            i54 += 14 + 1;
        }
    }
}
