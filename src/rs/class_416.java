package rs;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.opencl.CL10;

/* JADX INFO: loaded from: client-final.jar:rs/class_416.class */
public class class_416 extends class_360 {
    public class_416(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        a(1698, aU.rF, 7499, "Chop", "Hack", "Smash", "Block", 42, 75, 127, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, this.a, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Aggressive\nCrush\nStrength XP", "Defensive\nSlash\nDefence XP", 20132, 20136, 20140, 20144);
        a(G.bs, G.bv, 7574, "Stab", "Lunge", "Slash", "Block", 43, 75, 124, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, this.a, "Accurate\nStab\nAttack XP", "Aggressive\nStab\nStrength XP", "Aggressive\nSlash\nStrength XP", "Defensive\nStab\nDefence XP", 40020, 40024, 40028, 40032);
        a(2423, 2426, 7599, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, this.a, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Controlled\nStab\nShared XP", "Defensive\nSlash\nDefence XP", 40036, 40040, 40044, 40048);
        a(3796, 3799, 7624, "Pound", "Pummel", "Spike", "Block", 39, 75, 121, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, this.a, "Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nStrength XP", "Controlled\nStab\nShared XP", "Defensive\nCrush\nDefence XP", 40052, 40056, 40060, 40064);
        a(4679, 4682, 7674, "Lunge", "Swipe", "Pound", "Block", 40, 75, 124, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, this.a, "Controlled\nStab\nShared XP", "Controlled\nSlash\nShared XP", "Controlled\nCrush\nShared XP", "Defensive\nStab\nDefence XP", 40068, 40072, 40076, 40080);
        a(4705, 4708, 7699, "Chop", "Slash", "Smash", "Block", 42, 75, 125, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, this.a, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Aggressive\nCrush\nStrength XP", "Defensive\nSlash\nDefence XP", 40584, 40588, 40592, 40596);
        a(5570, 5573, 7724, "Spike", "Impale", "Smash", "Block", 41, 75, 123, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, this.a, "Accurate\nStab\nAttack XP", "Aggressive\nStab\nStrength XP", "Aggressive\nCrush\nStrength XP", "Defensive\nStab\nDefence XP", 40010, 40104, 40108, 40112);
        a(7762, 7765, 7800, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, this.a, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Controlled\nStab\nShared XP", "Defensive\nSlash\nDefence XP", 40116, 40120, 40124, 40128);
        a(776, 779, 7699, "Reap", "Chop", "Jab", "Block", 42, 75, 126, 75, 46, 128, 125, 128, 122, 103, 122, 50, 40, 103, 40, 50, this.a, "Accurate\nSlash\nAttack XP", "Aggressive\nSlash\nStrength XP", "Aggressive\nCrush\nStrength XP", "Defensive\nSlash\nDefence XP", 40132, 40136, 40140, 40144);
        a(425, 428, 7474, "Pound", "Pummel", "Block", 39, 75, 121, 75, 42, 128, 40, 103, 40, 50, 122, 50, this.a, "Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nStrength XP", "Defensive\nCrush\nDefence XP", 40148, 40152, 40156);
        a(aU.sz, aU.sC, 7524, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, this.a, "Accurate\nRanged XP", "Rapid\nRanged XP", "Long range\nRanged XP\nDefence XP", 40160, 40164, 40168);
        a(aU.sO, aU.sR, 7549, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, this.a, "Accurate\nRanged XP", "Rapid\nRanged XP", "Long range\nRanged XP\nDefence XP", 40172, 40176, 40180);
        a(4446, CL10.CL_PROGRAM_CONTEXT, 7649, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, this.a, "Accurate\nRanged XP", "Rapid\nRanged XP", "Long range\nRanged XP\nDefence XP", 40184, 40188, 40192);
        a(5855, 5857, 7749, "Punch", "Kick", "Block", 40, 75, 129, 75, 42, 128, 40, 50, 122, 50, 40, 103, this.a, "Accurate\nCrush\nAttack XP", "Aggressive\nCrush\nStrength XP", "Defensive\nCrush\nDefence XP", 40196, 40200, 40204);
        a(6103, 428, 7474, "Pound", "Block", 39, 75, 124, 75, 40, 50, 122, 50, this.a, "Accurate\nCrush\nAttack XP", "Defensive\nCrush\nDefence XP", 40148, 40152);
        a(aU.Il, aU.Io, aU.IS, "Jab", "Swipe", "Fend", 46, 75, 124, 75, 43, 128, 40, 103, 40, 50, 122, 50, this.a, "Controlled\nStab\nShared XP", "Aggressive\nSlash\nStrength XP", "Defensive\nStab\nDefence XP", 40224, 40228, 40232);
        a(12290, 12293, 12323, "Flick", "Lash", "Deflect", 44, 75, 127, 75, 36, 128, 40, 50, 40, 103, 122, 50, this.a, "Accurate\nSlash\nAttack XP", "Controlled\nSlash\nShared XP", "Defensive\nSlash\nDefence XP", 40236, 40240, 40244);
        a(328, 331, aU.IS, "Bash", "Pound", "Focus", 42, 66, 39, 101, 41, 136, 40, 120, 40, 50, 40, 85, this.a);
        Widget widgetJ = j(19300);
        a(3983, this.a, 0);
        a(150, 150, 172, 150, 44, "Auto Retaliate", 40000, 154, 42, "When active, you will\nautomatically fight back if\nattacked.", this.a);
        widgetJ.k(3);
        widgetJ.b(0, 3983, 52, 25);
        widgetJ.b(1, 150, 21, 153);
        widgetJ.b(2, 40000, 26, 200);
        Widget widget = H[3983];
        widget.S = true;
        widget.ac = class_492.e;
    }

    private static void a(int i, int i2, int i3, String str, String str2, String str3, String str4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, class_338[] class_338VarArr, String str5, String str6, String str7, String str8, int i20, int i21, int i22, int i23) {
        Widget widgetJ = j(i);
        b(i2, "-2", class_338VarArr, 3, class_492.e, true);
        b(i2 + 11, str, class_338VarArr, 0, class_492.e, false);
        b(i2 + 12, str2, class_338VarArr, 0, class_492.e, false);
        b(i2 + 13, str3, class_338VarArr, 0, class_492.e, false);
        b(i2 + 14, str4, class_338VarArr, 0, class_492.e, false);
        widgetJ.a(i3, class_338VarArr);
        a(i2 + 3, i20, str5, class_338VarArr);
        a(i2 + 6, i21, str6, class_338VarArr);
        a(i2 + 5, i22, str7, class_338VarArr);
        a(i2 + 4, i23, str8, class_338VarArr);
        widgetJ.P = 190;
        widgetJ.aP = 261;
        widgetJ.k(20);
        widgetJ.b(0, i2 + 3, 21, 46);
        int i24 = 0 + 1;
        widgetJ.b(i24, i2 + 4, 104, 99);
        int i25 = i24 + 1;
        widgetJ.b(i25, i2 + 5, 21, 99);
        int i26 = i25 + 1;
        widgetJ.b(i26, i2 + 6, 105, 46);
        int i27 = i26 + 1;
        widgetJ.b(i27, i2 + 7, i12, i13);
        int i28 = i27 + 1;
        widgetJ.b(i28, i2 + 8, i14, i15);
        int i29 = i28 + 1;
        widgetJ.b(i29, i2 + 9, i16, i17);
        int i30 = i29 + 1;
        widgetJ.b(i30, i2 + 10, i18, i19);
        int i31 = i30 + 1;
        widgetJ.b(i31, i2 + 11, i4, i5);
        int i32 = i31 + 1;
        widgetJ.b(i32, i2 + 12, i6, i7);
        int i33 = i32 + 1;
        widgetJ.b(i33, i2 + 13, i8, i9);
        int i34 = i33 + 1;
        widgetJ.b(i34, i2 + 14, i10, i11);
        int i35 = i34 + 1;
        widgetJ.b(i35, i3, 21, aU.ho_);
        int i36 = i35 + 1;
        widgetJ.b(i36, 19300, 0, 0);
        int i37 = i36 + 1;
        widgetJ.b(i37, i2, 94, 4);
        int i38 = i37 + 1;
        widgetJ.b(i38, i20, 25, 96);
        int i39 = i38 + 1;
        widgetJ.b(i39, i21, 108, 96);
        int i40 = i39 + 1;
        widgetJ.b(i40, i22, 25, 149);
        int i41 = i40 + 1;
        widgetJ.b(i41, i23, 108, 149);
        int i42 = i41 + 1;
        widgetJ.b(i42, 40005, 28, 149);
        int i43 = i42 + 1;
        for (int i44 = i2 + 3; i44 < i2 + 7; i44++) {
            Widget widget = H[i44];
            widget.E = d(19301, "");
            widget.aE = d(19301, "a");
            widget.P = 68;
            widget.aP = 44;
        }
    }

    private static void a(int i, int i2, String str, String str2, String str3, String str4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, class_338[] class_338VarArr, String str5, String str6, String str7, String str8, int i19, int i20, int i21, int i22) {
        Widget widgetJ = j(i);
        b(i2, "-2", class_338VarArr, 3, class_492.e, true);
        b(i2 + 11, str, class_338VarArr, 0, class_492.e, false);
        b(i2 + 12, str2, class_338VarArr, 0, class_492.e, false);
        b(i2 + 13, str3, class_338VarArr, 0, class_492.e, false);
        b(i2 + 14, str4, class_338VarArr, 0, class_492.e, false);
        a(i2 + 3, i19, str5, class_338VarArr);
        a(i2 + 6, i20, str6, class_338VarArr);
        a(i2 + 5, i21, str7, class_338VarArr);
        a(i2 + 4, i22, str8, class_338VarArr);
        widgetJ.P = 190;
        widgetJ.aP = 261;
        widgetJ.k(18);
        widgetJ.b(0, i2 + 3, 21, 46);
        int i23 = 0 + 1;
        widgetJ.b(i23, i2 + 4, 104, 99);
        int i24 = i23 + 1;
        widgetJ.b(i24, i2 + 5, 21, 99);
        int i25 = i24 + 1;
        widgetJ.b(i25, i2 + 6, 105, 46);
        int i26 = i25 + 1;
        widgetJ.b(i26, i2 + 7, i11, i12);
        int i27 = i26 + 1;
        widgetJ.b(i27, i2 + 8, i13, i14);
        int i28 = i27 + 1;
        widgetJ.b(i28, i2 + 9, i15, i16);
        int i29 = i28 + 1;
        widgetJ.b(i29, i2 + 10, i17, i18);
        int i30 = i29 + 1;
        widgetJ.b(i30, i2 + 11, i3, i4);
        int i31 = i30 + 1;
        widgetJ.b(i31, i2 + 12, i5, i6);
        int i32 = i31 + 1;
        widgetJ.b(i32, i2 + 13, i7, i8);
        int i33 = i32 + 1;
        widgetJ.b(i33, i2 + 14, i9, i10);
        int i34 = i33 + 1;
        widgetJ.b(i34, 19300, 0, 0);
        int i35 = i34 + 1;
        widgetJ.b(i35, i2, 94, 4);
        int i36 = i35 + 1;
        widgetJ.b(i36, i19, 25, 96);
        int i37 = i36 + 1;
        widgetJ.b(i37, i20, 108, 96);
        int i38 = i37 + 1;
        widgetJ.b(i38, i21, 25, 149);
        int i39 = i38 + 1;
        widgetJ.b(i39, i22, 108, 149);
        int i40 = i39 + 1;
        for (int i41 = i2 + 3; i41 < i2 + 7; i41++) {
            Widget widget = H[i41];
            widget.E = d(19301, "");
            widget.aE = d(19301, "a");
            widget.P = 68;
            widget.aP = 44;
        }
    }

    private static void a(int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, class_338[] class_338VarArr, String str4, String str5, String str6, int i16, int i17, int i18) {
        Widget widgetJ = j(i);
        b(i2, "-2", class_338VarArr, 3, class_492.e, true);
        b(i2 + 9, str, class_338VarArr, 0, class_492.e, false);
        b(i2 + 10, str2, class_338VarArr, 0, class_492.e, false);
        b(i2 + 11, str3, class_338VarArr, 0, class_492.e, false);
        widgetJ.a(i3, class_338VarArr);
        a(i2 + 5, i16, str4, class_338VarArr);
        a(i2 + 4, i17, str5, class_338VarArr);
        a(i2 + 3, i18, str6, class_338VarArr);
        widgetJ.P = 190;
        widgetJ.aP = 261;
        widgetJ.k(16);
        widgetJ.b(0, i2 + 3, 21, 99);
        int i19 = 0 + 1;
        widgetJ.b(i19, i2 + 4, 105, 46);
        int i20 = i19 + 1;
        widgetJ.b(i20, i2 + 5, 21, 46);
        int i21 = i20 + 1;
        widgetJ.b(i21, i2 + 6, i10, i11);
        int i22 = i21 + 1;
        widgetJ.b(i22, i2 + 7, i12, i13);
        int i23 = i22 + 1;
        widgetJ.b(i23, i2 + 8, i14, i15);
        int i24 = i23 + 1;
        widgetJ.b(i24, i2 + 9, i4, i5);
        int i25 = i24 + 1;
        widgetJ.b(i25, i2 + 10, i6, i7);
        int i26 = i25 + 1;
        widgetJ.b(i26, i2 + 11, i8, i9);
        int i27 = i26 + 1;
        widgetJ.b(i27, i3, 21, aU.ho_);
        int i28 = i27 + 1;
        widgetJ.b(i28, 19300, 0, 0);
        int i29 = i28 + 1;
        widgetJ.b(i29, i2, 94, 4);
        int i30 = i29 + 1;
        widgetJ.b(i30, i16, 25, 96);
        int i31 = i30 + 1;
        widgetJ.b(i31, i17, 108, 96);
        int i32 = i31 + 1;
        widgetJ.b(i32, i18, 25, 149);
        int i33 = i32 + 1;
        widgetJ.b(i33, 40005, 28, 149);
        int i34 = i33 + 1;
        for (int i35 = i2 + 3; i35 < i2 + 6; i35++) {
            Widget widget = H[i35];
            widget.E = d(19301, "");
            widget.aE = d(19301, "a");
            widget.P = 68;
            widget.aP = 44;
        }
    }

    private static void a(int i, int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, class_338[] class_338VarArr) {
        Widget widgetJ = j(i);
        b(i2, "-2", class_338VarArr, 3, class_492.e, true);
        b(i2 + 9, str, class_338VarArr, 0, class_492.e, false);
        b(i2 + 10, str2, class_338VarArr, 0, class_492.e, false);
        b(i2 + 11, str3, class_338VarArr, 0, class_492.e, false);
        b(aU.il_, "Spell", class_338VarArr, 0, class_492.e, false);
        b(354, "Spell", class_338VarArr, 0, class_492.e, false);
        b(337, 19, 0, "combaticons");
        b(338, 13, 0, "combaticons2");
        b(339, 14, 0, "combaticons2");
        widgetJ.a(i3, class_338VarArr);
        c(349, 349, 109, 68, 44, "Select");
        c(350, 350, 108, 68, 44, "Select");
        widgetJ.P = 190;
        widgetJ.aP = 261;
        widgetJ.k(16);
        widgetJ.b(0, i2 + 3, 20, 115);
        int i16 = 0 + 1;
        widgetJ.b(i16, i2 + 4, 20, 80);
        int i17 = i16 + 1;
        widgetJ.b(i17, i2 + 5, 20, 45);
        int i18 = i17 + 1;
        widgetJ.b(i18, i2 + 6, i10, i11);
        int i19 = i18 + 1;
        widgetJ.b(i19, i2 + 7, i12, i13);
        int i20 = i19 + 1;
        widgetJ.b(i20, i2 + 8, i14, i15);
        int i21 = i20 + 1;
        widgetJ.b(i21, i2 + 9, i4, i5);
        int i22 = i21 + 1;
        widgetJ.b(i22, i2 + 10, i6, i7);
        int i23 = i22 + 1;
        widgetJ.b(i23, i2 + 11, i8, i9);
        int i24 = i23 + 1;
        widgetJ.b(i24, 349, 105, 46);
        int i25 = i24 + 1;
        widgetJ.b(i25, 350, 104, 106);
        int i26 = i25 + 1;
        widgetJ.b(i26, aU.il_, 125, 74);
        int i27 = i26 + 1;
        widgetJ.b(i27, 354, 125, 134);
        int i28 = i27 + 1;
        widgetJ.b(i28, 19300, 0, 0);
        int i29 = i28 + 1;
        widgetJ.b(i29, i2, 94, 4);
        widgetJ.b(i29 + 1, i3, 21, aU.ho_);
    }

    private static void a(int i, int i2, int i3, String str, String str2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, class_338[] class_338VarArr, String str3, String str4, int i12, int i13) {
        Widget widgetJ = j(i);
        b(i2, "-2", class_338VarArr, 3, class_492.e, true);
        b(i2 + 9, str, class_338VarArr, 0, class_492.e, false);
        b(i2 + 11, str2, class_338VarArr, 0, class_492.e, false);
        widgetJ.a(i3, class_338VarArr);
        a(i2 + 5, i12, str3, class_338VarArr);
        a(i2 + 3, i13, str4, class_338VarArr);
        widgetJ.P = 190;
        widgetJ.aP = 261;
        widgetJ.k(12);
        widgetJ.b(0, i2 + 3, 105, 46);
        int i14 = 0 + 1;
        widgetJ.b(i14, i2 + 5, 21, 46);
        int i15 = i14 + 1;
        widgetJ.b(i15, i2 + 8, i8, i9);
        int i16 = i15 + 1;
        widgetJ.b(i16, i2 + 6, i10, i11);
        int i17 = i16 + 1;
        widgetJ.b(i17, i2 + 9, i4, i5);
        int i18 = i17 + 1;
        widgetJ.b(i18, i2 + 11, i6, i7);
        int i19 = i18 + 1;
        widgetJ.b(i19, i3, 21, aU.ho_);
        int i20 = i19 + 1;
        widgetJ.b(i20, 19300, 0, 0);
        int i21 = i20 + 1;
        widgetJ.b(i21, i2, 94, 4);
        int i22 = i21 + 1;
        widgetJ.b(i22, i12, 25, 96);
        int i23 = i22 + 1;
        widgetJ.b(i23, i13, 108, 96);
        int i24 = i23 + 1;
        widgetJ.b(i24, 40005, 28, 149);
        int i25 = i24 + 1;
        for (int i26 = i2 + 3; i26 < i2 + 5; i26++) {
            Widget widget = H[i26];
            widget.E = d(19301, "");
            widget.aE = d(19301, "a");
            widget.P = 68;
            widget.aP = 44;
        }
    }
}
