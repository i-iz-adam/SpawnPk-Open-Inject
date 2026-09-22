package rs;

import java.awt.Color;
import org.lwjgl.system.windows.User32;
import rs.runelite.b.a;

/* JADX INFO: loaded from: client-final.jar:rs/class_48.class */
public class class_48 extends class_47 {
    public class_43 f;
    public int g = 1000;

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        ColorUtility colorUtilityA;
        class_313.d().a(class_268.e, (Object) this, (ColorUtility) null);
        if (!a.a().isEmpty()) {
            for (int i11 = 0; i11 < a.a().size(); i11++) {
                if (!a.a().get(i11).draw(this, false)) {
                    return;
                }
            }
        }
        if ((this instanceof Player) && Client.cw == 10806) {
            int i12 = Client.eh + ((((Player) this).ac - 6) >> 7);
            int i13 = Client.ei + ((((Player) this).ad - 6) >> 7);
        }
        if (!(this instanceof Player) || Configuration.J) {
            if (this instanceof Npc) {
                if (!Configuration.K) {
                    return;
                }
                if (Configuration.aT) {
                    Npc npc = (Npc) this;
                    if (Client.ed != 197 && npc.aG != null && npc.aG.h && npc.m != -1 && npc.m - 32768 != Client.di) {
                        return;
                    }
                }
                if (Configuration.aU) {
                    int i14 = (((Client.eh + ((((Npc) this).ac - 6) >> 7)) >> 6) * 256) + ((Client.ei + ((((Npc) this).ad - 6) >> 7)) >> 6);
                    if (i14 == 10317 || i14 == 10831 || i14 == 7248 || i14 == 9011 || i14 == 8755 || i14 == 9012 || i14 == 8756) {
                        Npc npc2 = (Npc) this;
                        if (npc2.m != -1 && npc2.m - 32768 != Client.di) {
                            return;
                        }
                    }
                }
            }
            if ((this instanceof Npc) && ((Npc) this).i) {
                class_102.a = false;
                class_102.b = this;
            }
            ColorUtility colorUtilityC = c();
            class_102.a = true;
            class_102.b = null;
            if ((this instanceof Npc) && ((Npc) this).av) {
                ((Npc) this).i = false;
                ((Npc) this).av = false;
            }
            if (colorUtilityC != null) {
                if (this instanceof Player) {
                    class_313.d().a(class_268.g, (Object) this, colorUtilityC);
                } else if (this instanceof Npc) {
                    ((Npc) this).as = i7;
                    ((Npc) this).at = i9;
                    ((Npc) this).au = i10;
                }
                if ((this instanceof Npc) && ((Npc) this).aG.x == 5660) {
                    Color color = new Color(152, 0, 255);
                    Color color2 = Color.MAGENTA;
                    Color color3 = new Color(93, 44, 255, 100);
                    class_258 class_258Var = new class_258(this, colorUtilityC.b(((Npc) this).ac, ((Npc) this).ad, i7 + Client.cK, 0), color, color2, i9);
                    class_258Var.f = color3;
                    Client.ab.c.a(i9, class_258Var);
                }
                this.g = colorUtilityC.g;
                if (Configuration.az && !Configuration.ah && (this instanceof Npc)) {
                    int i15 = ((Npc) this).aw;
                    int i16 = ((Npc) this).ax;
                    int i17 = ((Npc) this).ay;
                    class_102 class_102Var = ((Npc) this).aG;
                    if (((Npc) this).aG.x == 1335) {
                        if (i15 == 0) {
                            i15 = 6;
                        } else {
                            i16 = i16 == 0 ? 6 : 6;
                        }
                    }
                    if (((Npc) this).aG.x == 1334 || ((Npc) this).aG.x == 8210) {
                        if (i15 == 0) {
                            i15 = 3;
                        } else {
                            i16 = i16 == 0 ? 3 : 3;
                        }
                    }
                    if (((Npc) this).aG.x == 864 || ((Npc) this).aG.x == 6303) {
                        if (i15 == 0) {
                            i15 = 50;
                        } else {
                            i16 = i16 == 0 ? 50 : 50;
                        }
                    }
                    if (((Npc) this).aG.x == 6304 || ((Npc) this).aG.x == 8192) {
                        if (i15 == 0) {
                            i15 = 5;
                        } else {
                            i16 = i16 == 0 ? 5 : 5;
                        }
                    }
                    if (((Npc) this).aG.x == 2863) {
                        if (i15 == 0) {
                            i15 = 9;
                        } else {
                            i16 = i16 == 0 ? 9 : 9;
                        }
                    }
                    boolean z = false;
                    if (((Npc) this).aG.x == 7005 && colorUtilityC.L != null && colorUtilityC.L.length > 0) {
                        colorUtilityC.a(User32.VK_OEM_CUSEL, 3 + 1, (byte) 1);
                        colorUtilityC.a(255, 3 + 1, (byte) 1);
                        colorUtilityC.a(115, 3 + 1, (byte) 1);
                        colorUtilityC.a(72, 3 + 1, (byte) 1);
                        colorUtilityC.a(76, 3 + 1, (byte) 1);
                        colorUtilityC.a(30, 3 + 1, (byte) 1);
                        colorUtilityC.a(32, 3 + 1, (byte) 1);
                        colorUtilityC.a(36, 3 + 1, (byte) 1);
                        colorUtilityC.a(37, 3 + 1, (byte) 1);
                        z = true;
                    }
                    if (!z && i15 > 0 && colorUtilityC.L.length >= 1) {
                        int i18 = i16 > 0 ? 1 + 1 : 1;
                        if (i17 > 0) {
                            i18++;
                        }
                        int[] iArr = new int[i18];
                        iArr[0] = class_102.a(i15);
                        if (iArr.length >= 2) {
                            iArr[1] = class_102.a(i16);
                        }
                        if (iArr.length >= 3) {
                            iArr[2] = class_102.a(i17);
                        }
                        colorUtilityC.a(0, iArr[0], (byte) 1);
                        int i19 = i18 == 1 ? 20 : 15;
                        int i20 = 0;
                        int i21 = 0;
                        int length = colorUtilityC.L.length;
                        if (class_102Var.x == 4003) {
                            i19 = 11;
                        }
                        if (class_102Var.x == 2863) {
                            i19 = 4;
                        }
                        if (class_102Var.x == 862 || class_102Var.x == 2862) {
                            i19 = 11;
                        }
                        if (class_102Var.x == 6303) {
                            i19 = 40;
                        }
                        if (class_102Var.x == 751 || class_102Var.x == 752) {
                            i19 = 5;
                        }
                        if (class_102Var.x == 754) {
                            i19 = 10;
                        }
                        if (class_102Var.x >= 2012 && class_102Var.x <= 2016) {
                            i19 = 11;
                            length = 400;
                        }
                        if (class_102Var.x == 4437) {
                            i19 = 5;
                            i21 = 35;
                        }
                        if (class_102Var.x == 1336 || class_102Var.x == 1337) {
                        }
                        int i22 = i21;
                        while (true) {
                            int i23 = i22;
                            if (i23 >= length) {
                                break;
                            }
                            if (colorUtilityC.L.length > i23) {
                                colorUtilityC.a(i23, iArr[i20], (byte) 1);
                                i20++;
                                if (i20 >= iArr.length) {
                                    i20 = 0;
                                }
                            }
                            i22 = i23 + i19;
                        }
                    }
                }
                if ((this instanceof Npc) && (((Npc) this).aG.x == 1336 || ((Npc) this).aG.x == 1335 || ((Npc) this).aG.x == 8210 || ((Npc) this).aG.x == 1334)) {
                    int i24 = ((Npc) this).aG.x == 1334 ? -50 : 0;
                    for (int i25 = 0; i25 < colorUtilityC.ah; i25++) {
                        if (((Npc) this).aG.x == 1335 || ((Npc) this).aG.x == 1334 || ((Npc) this).aG.x == 8210) {
                            colorUtilityC.aq[i25] = 100 - i24;
                        }
                    }
                    if (((Npc) this).aG.x == 1334) {
                        colorUtilityC.aI = 319770;
                    }
                    if (((Npc) this).aG.x == 8210) {
                        ColorUtility.H = class_267.a(255 + (131072 * (((int) (Math.sin(Client.fg) * 33.0d)) + 33)));
                    } else {
                        ColorUtility.H = 1;
                    }
                    colorUtilityC.a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
                    ColorUtility.H = -1;
                    if (((Npc) this).aG.x == 1334) {
                        colorUtilityC.aI = 0;
                    }
                } else {
                    if ((this instanceof Npc) && ((Npc) this).q()) {
                        colorUtilityC.K = (short) 200;
                        colorUtilityC.aI = 1;
                        ColorUtility.H = 1;
                    }
                    if ((this instanceof Player) && ((Player) this).aR) {
                        colorUtilityC.a(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
                        colorUtilityC.K = (short) 256;
                        ColorUtility colorUtilityA2 = a(true);
                        colorUtilityA2.aD = 62;
                        colorUtilityA2.g = 283;
                        colorUtilityA2.b(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
                    } else {
                        colorUtilityC.a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
                        colorUtilityC.K = (short) 256;
                    }
                    ColorUtility.H = -1;
                }
            } else if ((this instanceof Player) && (colorUtilityA = a(true)) != null) {
                colorUtilityA.b(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        }
    }

    public ColorUtility a(boolean z) {
        if (!(this instanceof Player)) {
            return null;
        }
        if (z) {
            Player.av.z = ((Player) this).z;
        } else {
            Player.av.z = -1;
        }
        Player.av.D = ((Player) this).D;
        Player.av.A = ((Player) this).A;
        Player.av.aU = ((Player) this).aU;
        Player.av.bj = ((Player) this).bj;
        Player.av.bk = ((Player) this).bk;
        Player.av.bl = ((Player) this).bl;
        Player.av.bn = ((Player) this).bn;
        Player.av.bo = ((Player) this).bo;
        Player.av.bp = ((Player) this).bp;
        Player.av.primarySeqDelay = ((Player) this).primarySeqDelay;
        Player.av.x = ((Player) this).x;
        Player.av.primarySeqID = ((Player) this).primarySeqID;
        Player.av.w = ((Player) this).w;
        Player.av.s = ((Player) this).s;
        Player.av.ac = ((Player) this).ac;
        Player.av.ad = ((Player) this).ad;
        return Player.av.b(true);
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z) {
        if (this instanceof Player) {
            if (z) {
                Player.av.z = ((Player) this).z;
            } else {
                Player.av.z = -1;
            }
            Player.av.D = ((Player) this).D;
            Player.av.A = ((Player) this).A;
            Player.av.aU = ((Player) this).aU;
            Player.av.bj = ((Player) this).bj;
            Player.av.bk = ((Player) this).bk;
            Player.av.bl = ((Player) this).bl;
            Player.av.bn = ((Player) this).bn;
            Player.av.bo = ((Player) this).bo;
            Player.av.bp = ((Player) this).bp;
            Player.av.primarySeqDelay = ((Player) this).primarySeqDelay;
            Player.av.x = ((Player) this).x;
            Player.av.primarySeqID = ((Player) this).primarySeqID;
            Player.av.w = ((Player) this).w;
            Player.av.s = ((Player) this).s;
            Player.av.ac = ((Player) this).ac;
            Player.av.ad = ((Player) this).ad;
            ColorUtility colorUtilityB = Player.av.b(true);
            if (colorUtilityB != null) {
                colorUtilityB.b(128, 128, 160);
                colorUtilityB.a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        }
    }

    public ColorUtility c() {
        return null;
    }

    class_48() {
    }
}
