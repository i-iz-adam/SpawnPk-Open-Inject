package rs;

import com.google.inject.internal.asm.$Opcodes;
import com.sun.jna.platform.win32.aU;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_399.class */
public class class_399 extends class_360 {
    private static final int[] c = {5609, 5610, 5611, 5612, 5613, 5614, 5615, 5616, 5617, 5618, 5619, 5620, 5621, 5622, 5623, aU.gP, aU.gQ, aU.gR, GL11.GL_EMISSION, GL11.GL_SHININESS, GL11.GL_AMBIENT_AND_DIFFUSE, GL11.GL_COLOR_INDEXES, 5636, 5637, 5638, 5639, 5640, 5641, 5642, 5643, 5644, aU.gS, 5645, 5649, 5647, 5648, 18000, 18001, BZip2Constants.MAX_SELECTORS, 18003, 18004, 18005, 18006, 18007, 18008, 18009, 18010, 18011, 18553, 18554, 18012, 18013, 18014, 18015, 18045, 18046, 18047, 18048, 5651, aU.gT};
    private static final int[] d = {3, 40, 77, 3, 40, 77, 114, 151, 4, 114, 151, 3, 40, 77, 114, 40, 77, 114, 5, 42, 79, 5, 42, 79, 116, 153, 6, 116, 153, 5, 42, 79, 116, 42, 79, 116, 114, 117, 151, 154, 40, 43, 77, 80, 151, 154, 3, 6, 151, 153, 3, 10, 40, 42, 77, 80, 114, 117, 65, 15};
    private static final int[] e = {-1, -1, -1, 36, 36, 36, 36, 36, 73, 73, 73, 110, 110, 110, 110, 147, 147, 147, 1, 1, 1, 38, 38, 38, 38, 38, 76, 75, 75, 112, 112, 112, 112, 149, 149, 149, -1, 3, 1, 4, 73, 77, 75, 78, 110, 114, 149, 152, 147, 149, 182, 186, 182, 194, 183, 188, 185, 189, User32.VK_OEM_COPY, User32.VK_OEM_ENLW};

    public class_399(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void h() {
        if (Configuration.aI) {
            Widget.H[18091].as = "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%";
            Widget.H[18105].as = "Level 45\nMystic Might\nIncreases your Magic by 15%";
            Widget.H[18103].as = "Level 44\nEagle Eye\nIncreases your Ranged by 15%";
            Widget.H[18089].as = "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%";
            return;
        }
        Widget.H[18091].as = "Level 45\nMystic Might\nIncreases your Magic by 15%";
        Widget.H[18105].as = "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%";
        Widget.H[18103].as = "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%";
        Widget.H[18089].as = "Level 44\nEagle Eye\nIncreases your Ranged by 15%";
    }

    public static void i() {
        h();
        if (!Configuration.aG) {
            Widget.H[43508].as = "Show stat adjustments";
            Widget.H[5608].b(5, 43503, -5000, aU.hq_);
            Widget.H[5608].b(6, 43504, -5000, aU.hq_);
            Widget.H[5608].b(7, 43505, -5000, aU.hq_);
            Widget.H[5608].b(8, 43506, -5000, aU.hq_);
            Widget.H[5608].b(9, 43507, -5000, aU.hq_);
            Widget.H[5608].b(2, 43502, -5000, 176);
            Widget.H[5608].b(10, 43508, -5000, 225);
            Widget.H[5608].b(1, 43500, -5000, 220);
            Widget.H[5608].b(2, 43502, -5000, 176);
            Widget.H[22500].b(1, 43502, -5000, 176);
            Widget.H[22500].b(2, 43503, -5000, aU.hq_);
            Widget.H[22500].b(3, 43504, -5000, aU.hq_);
            Widget.H[22500].b(4, 43505, -5000, aU.hq_);
            Widget.H[22500].b(5, 43506, -5000, aU.hq_);
            Widget.H[22500].b(6, 43507, -5000, aU.hq_);
            Widget.H[22500].b(0, 43500, -5000, 220);
            Widget.H[22500].b(1, 43502, -5000, 176);
            Widget.H[22500].b(7, 43508, -5000, 225);
            Widget.H[43501].aP = User32.VK_PLAY;
            Widget.H[43501].P = User32.VK_PLAY;
            for (int i = 0; i < c.length; i++) {
                int i2 = d[i];
                int i3 = e[i];
                if (Configuration.aI) {
                    if (c[i] == 18047) {
                        i2 = 6;
                        i3 = 150;
                    }
                    if (c[i] == 18048) {
                        i2 = 9;
                        i3 = 153;
                    }
                    if (c[i] == 18010) {
                        i2 = 113;
                        i3 = 186;
                    }
                    if (c[i] == 18011) {
                        i2 = 117;
                        i3 = 190;
                    }
                    if (c[i] == 18008) {
                        i2 = 78;
                        i3 = 185;
                    }
                    if (c[i] == 18009) {
                        i2 = 81;
                        i3 = 190;
                    }
                    if (c[i] == 18045) {
                        i2 = 150;
                        i3 = 112;
                    }
                    if (c[i] == 18046) {
                        i2 = 153;
                        i3 = 116;
                    }
                }
                int i4 = i3 + 9;
                if (c[i] == 687 || c[i] == 5651) {
                    Widget.H[43501].b(i, c[i], i2, -5000);
                } else {
                    Widget.H[43501].b(i, c[i], i2, i4);
                }
            }
            return;
        }
        Widget.H[5608].b(1, 43500, 1, 220);
        Widget.H[5608].b(2, 43502, 1, 176);
        Widget.H[5608].b(10, 43508, 21, 225);
        Widget.H[22500].b(0, 43500, 1, 220);
        Widget.H[22500].b(1, 43502, 1, 176);
        Widget.H[22500].b(7, 43508, 21, 225);
        if (!Configuration.bi) {
            Widget.H[43508].as = "Show stat adjustments";
            Widget.H[5608].b(5, 43503, -5000, aU.hq_);
            Widget.H[5608].b(6, 43504, -5000, aU.hq_);
            Widget.H[5608].b(7, 43505, -5000, aU.hq_);
            Widget.H[5608].b(8, 43506, -5000, aU.hq_);
            Widget.H[5608].b(9, 43507, -5000, aU.hq_);
            Widget.H[5608].b(2, 43502, -5000, 176);
            Widget.H[5608].b(10, 43508, 21, 225);
            Widget.H[22500].b(1, 43502, -5000, 176);
            Widget.H[22500].b(2, 43503, -5000, aU.hq_);
            Widget.H[22500].b(3, 43504, -5000, aU.hq_);
            Widget.H[22500].b(4, 43505, -5000, aU.hq_);
            Widget.H[22500].b(5, 43506, -5000, aU.hq_);
            Widget.H[22500].b(6, 43507, -5000, aU.hq_);
            Widget.H[43501].aP = User32.VK_PLAY;
            Widget.H[43501].P = User32.VK_PLAY;
            for (int i5 = 0; i5 < c.length; i5++) {
                int i6 = d[i5] + 0;
                int i7 = e[i5];
                if (Configuration.aI) {
                    if (c[i5] == 18047) {
                        i6 = 4;
                        i7 = 148;
                    }
                    if (c[i5] == 18048) {
                        i6 = 9;
                        i7 = 151;
                    }
                    if (c[i5] == 18010) {
                        i6 = 113;
                        i7 = 186;
                    }
                    if (c[i5] == 18011) {
                        i6 = 117;
                        i7 = 190;
                    }
                    if (c[i5] == 18008) {
                        i6 = 78;
                        i7 = 185;
                    }
                    if (c[i5] == 18009) {
                        i6 = 81;
                        i7 = 190;
                    }
                    if (c[i5] == 18045) {
                        i6 = 150;
                        i7 = 112;
                    }
                    if (c[i5] == 18046) {
                        i6 = 153;
                        i7 = 116;
                    }
                }
                int i8 = i6 + 0;
                if (c[i5] == 687 || c[i5] == 5651) {
                    Widget.H[43501].b(i5, c[i5], i8, -5000);
                } else {
                    Widget.H[43501].b(i5, c[i5], i8, i7);
                }
            }
            return;
        }
        Widget.H[43508].as = "Hide stat adjustments";
        Widget.H[5608].b(5, 43503, 20, aU.hq_);
        Widget.H[5608].b(6, 43504, 57, aU.hq_);
        Widget.H[5608].b(7, 43505, 96, aU.hq_);
        Widget.H[5608].b(8, 43506, 135, aU.hq_);
        Widget.H[5608].b(9, 43507, 173, aU.hq_);
        Widget.H[5608].b(2, 43502, 1, 176);
        Widget.H[22500].b(1, 43502, 1, 176);
        Widget.H[22500].b(2, 43503, 20, aU.hq_);
        Widget.H[22500].b(3, 43504, 57, aU.hq_);
        Widget.H[22500].b(4, 43505, 96, aU.hq_);
        Widget.H[22500].b(5, 43506, 135, aU.hq_);
        Widget.H[22500].b(6, 43507, 173, aU.hq_);
        Widget.H[43501].aP = 176;
        Widget.H[43501].P = 174;
        for (int i9 = 0; i9 < c.length; i9++) {
            int i10 = d[i9];
            int i11 = e[i9];
            if (Configuration.aI) {
                if (c[i9] == 18047) {
                    i10 = 10;
                    i11 = 148;
                }
                if (c[i9] == 18048) {
                    i10 = 15;
                    i11 = 151;
                }
                if (c[i9] == 18010) {
                    i10 = 113;
                    i11 = 186;
                }
                if (c[i9] == 18011) {
                    i10 = 117;
                    i11 = 190;
                }
                if (c[i9] == 18008) {
                    i10 = 84;
                    i11 = 185;
                }
                if (c[i9] == 18009) {
                    i10 = 89;
                    i11 = 190;
                }
                if (c[i9] == 18045) {
                    i10 = 146;
                    i11 = 112;
                }
                if (c[i9] == 18046) {
                    i10 = 149;
                    i11 = 116;
                }
            }
            int i12 = d[i9] > 10 ? -4 : -2;
            if (d[i9] > 50) {
                i12 -= 2;
            }
            if (d[i9] > 100) {
                i12 -= 2;
            }
            if (d[i9] > 150) {
                i12 -= 2;
            }
            int i13 = i10 + i12;
            if (c[i9] == 687 || c[i9] == 5651) {
                Widget.H[43501].b(i9, c[i9], i13, -5000);
            } else {
                Widget.H[43501].b(i9, c[i9], i13, i11);
            }
        }
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetJ = j(5608);
        Widget widget = H[687];
        c(5651, 0, "prayer/PRAYER");
        widget.ac = class_492.e;
        widget.aQ = true;
        widget.as = "%1/%2";
        int[] iArr = {18016, 18017, 18018, 18019, 18020, 18021, 18022, 18023, 18024, 18025, 18026, 18027, 18028, 18029, 18030, 18031, 18032, 18033, 18034, 18035, 18036, 18037, 18038, 18039, 18040, 18041, 18042, 18043, 18044};
        int[] iArr2 = {8, 44, 80, 114, 150, 8, 44, 80, 116, 152, 8, 42, 78, 116, 152, 8, 44, 80, 116, 150, 6, 44, 80, 116, 150, 6, 42, 78, 114};
        int[] iArr3 = {6, 6, 6, 4, 4, 42, 42, 42, 42, 42, 79, 76, 76, 78, 78, 114, 114, 114, 114, 112, 148, 150, 150, 150, 148, $Opcodes.INVOKESTATIC, $Opcodes.INVOKESTATIC, $Opcodes.INVOKESTATIC, $Opcodes.INVOKESTATIC};
        int[] iArr4 = {18050, 18052, 18054, 18056, 18058, 18060, 18062, 18064, 18066, 18068, 18070, 18072, 18074, 18076, 18078, 18080, 18082, 18084, 18086, 18088, 18090, 18092, 18094, 18096, 18555, 18098, 18100, 18102, 18104};
        int[] iArr5 = {12, 8, 20, 12, 24, 2, 2, 6, 6, 50, 6, 6, 10, 6, 6, 5, 5, 5, 5, 5, 18, 28, 28, 50, 1, 1, 6, 10, 10};
        int[] iArr6 = {42, 42, 42, 42, 42, 80, 80, 80, 80, 80, 118, 118, 118, 118, 118, 150, 150, 150, 150, 150, 105, 80, 65, 65, 65, 110, 110, 110, 110};
        String[] strArr = {"Level 01\nThick Skin\nIncreases your Defence by 5%", "Level 04\nBurst of Strength\nIncreases your Strength by 5%", "Level 07\nCharity of Thought\nIncreases your Attack by 5%", "Level 08\nSharp Eye\nIncreases your Ranged by 5%", "Level 09\nMystic Will\nIncreases your Magic by 5%", "Level 10\nRock Skin\nIncreases your Defence by 10%", "Level 13\nSuperhuman Strength\nIncreases your Strength by 10%", "Level 16\nImproved Reflexes\nIncreases your Attack by 10%", "Level 19\nRapid Restore\n2x restore rate for all stats\nexcept Hitpoints and Prayer", "Level 22\nRapid Heal\n2x restore rate for the\nHitpoints stat", "Level 25\nProtect Item\nKeep one extra item if you die", "Level 26\nHawk Eye\nIncreases your Ranged by 10%", "Level 27\nMystic Lore\nIncreases your Magic by 10%", "Level 28\nSteel Skin\nIncreases your Defence by 15%", "Level 31\nUltimate Strength\nIncreases your Strength by 15%", "Level 34\nIncredible Reflexes\nIncreases your Attack by 15%", "Level 37\nProtect from Magic\nProtection from magical attacks", "Level 40\nProtect from Missiles\nProtection from ranged attacks", "Level 43\nProtect from Melee\nProtection from close attacks", "Level 44\nEagle Eye\nIncreases your Ranged by 15%", "Level 45\nMystic Might\nIncreases your Magic by 15%", "Level 46\nRetribution\nInflicts damage to nearby\ntargets if you die", "Level 49\nRedemption\nHeals you when damaged\nand Hitpoints falls\nbelow 10%", "Level 52\nSmite\n1/4 of damage dealt is\nalso removed from\nopponents Prayer", "Level 55\nPreserve\nBoosted stats last 50% longer", "Level 60\nChivalry\nIncreases your Defence by 20%,\nStrength by 18% and Attack by\n15%", "Level 70\nPiety\nIncreases your Defence by 25%,\nStrength by 23% and Attack by\n20%", "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%", "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%"};
        String[] strArr2 = {"Thick Skin", "Burst of Strength", "Charity of Thought", "Rock Skin", "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Steel Skin", "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Missiles", "Protect from Melee", "Retribution", "Redemption", "Smite"};
        b(18000, 0, aU.jG_, 7, 0, "Sharp Eye");
        b(BZip2Constants.MAX_SELECTORS, 0, aU.jH_, 8, 1, "Mystic Will");
        b(18004, 0, 603, 25, 2, "Hawk Eye");
        b(18006, 0, aU.jJ_, 26, 3, "Mystic Lore");
        b(18008, 0, aU.jK_, 43, 4, "Eagle Eye");
        b(18010, 0, aU.jL_, 44, 5, "Mystic Might");
        b(18012, 0, aU.jM_, 59, 6, "Chivalry");
        b(18014, 0, aU.jN_, 69, 7, "Piety");
        b(18045, 0, aU.jO_, 73, 8, "Rigour");
        b(18047, 0, aU.jP_, 76, 9, "Augury");
        b(18553, 0, aU.jQ_, 54, 10, "Preserve");
        addSprite(43500, "prayer/sprite 2");
        addSprite(43502, "prayer/sprite 1");
        a(43503, "@or2@0%", this.a, 0, 0, true, true);
        a(43504, "@or2@0%", this.a, 0, 0, true, true);
        a(43505, "@or2@0%", this.a, 0, 0, true, true);
        a(43506, "@or2@0%", this.a, 0, 0, true, true);
        a(43507, "@or2@0%", this.a, 0, 0, true, true);
        a(43508, "Hide stat adjustments", "Hide stat adjustments", this.a, 0, class_492.e, true, true, 150);
        Widget widgetD = d(43501);
        widgetD.P = 174;
        widgetD.aP = 176;
        widgetD.aF = 225;
        widgetD.k(116);
        widgetJ.k(11);
        for (int i = 0; i < 18; i++) {
            c(c[i], strArr2[i]);
        }
        for (int i2 = 0; i2 < 29; i2++) {
            a(iArr[i2], iArr4[i2], i2, strArr[i2]);
        }
        widgetJ.k(11);
        for (int i3 = 0; i3 < c.length; i3++) {
            int i4 = d[i3] > 10 ? -4 : -2;
            if (d[i3] > 50) {
                i4 -= 2;
            }
            if (d[i3] > 100) {
                i4 -= 2;
            }
            if (d[i3] > 150) {
                i4 -= 2;
            }
            if (c[i3] == 687 || c[i3] == 5651) {
                widgetD.b(i3, c[i3], d[i3] + i4, -5000);
            } else {
                widgetD.b(i3, c[i3], d[i3] + i4, e[i3]);
            }
        }
        int i5 = 58;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            widgetD.b(i5, iArr[i6], iArr2[i6], iArr3[i6]);
            i5++;
        }
        for (int i7 = 0; i7 < iArr4.length; i7++) {
            widgetD.b(i5, iArr4[i7], iArr5[i7], iArr6[i7]);
            i5++;
        }
        widgetJ.b(0, 43501, 1, 0);
        widgetJ.b(1, 43500, 1, 220);
        widgetJ.b(2, 43502, 1, 176);
        widgetJ.b(3, 5651, 65, User32.VK_OEM_COPY);
        widgetJ.b(4, aU.gT, 15, User32.VK_OEM_ENLW);
        widgetJ.b(5, 43503, 20, aU.hq_);
        widgetJ.b(6, 43504, 57, aU.hq_);
        widgetJ.b(7, 43505, 96, aU.hq_);
        widgetJ.b(8, 43506, 135, aU.hq_);
        widgetJ.b(9, 43507, 173, aU.hq_);
        widgetJ.b(10, 43508, 21, 225);
    }
}
