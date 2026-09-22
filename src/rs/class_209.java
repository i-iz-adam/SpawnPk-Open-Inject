package rs;

import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.bk;
import java.util.Iterator;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_209.class */
public class class_209 {
    /* JADX WARN: Code duplicated, block: B:101:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:103:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:106:0x0316  */
    /* JADX WARN: Code duplicated, block: B:109:0x0338  */
    /* JADX WARN: Code duplicated, block: B:110:0x0358  */
    /* JADX WARN: Code duplicated, block: B:112:0x0361  */
    /* JADX WARN: Code duplicated, block: B:114:0x036a  */
    /* JADX WARN: Code duplicated, block: B:115:0x037a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0383  */
    /* JADX WARN: Code duplicated, block: B:123:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:126:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:131:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:141:0x0415  */
    /* JADX WARN: Code duplicated, block: B:142:0x042b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0433  */
    /* JADX WARN: Code duplicated, block: B:145:0x0456  */
    /* JADX WARN: Code duplicated, block: B:147:0x0479  */
    /* JADX WARN: Code duplicated, block: B:149:0x0483  */
    /* JADX WARN: Code duplicated, block: B:151:0x048d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0495  */
    /* JADX WARN: Code duplicated, block: B:155:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:156:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:158:0x0522  */
    /* JADX WARN: Code duplicated, block: B:160:0x052b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0539  */
    /* JADX WARN: Code duplicated, block: B:170:0x0566  */
    /* JADX WARN: Code duplicated, block: B:172:0x056f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0574  */
    /* JADX WARN: Code duplicated, block: B:180:0x0590  */
    /* JADX WARN: Code duplicated, block: B:184:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:186:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:191:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:193:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:195:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:196:0x0609  */
    /* JADX WARN: Code duplicated, block: B:197:0x0615  */
    /* JADX WARN: Code duplicated, block: B:200:0x0623  */
    /* JADX WARN: Code duplicated, block: B:205:0x0640  */
    /* JADX WARN: Code duplicated, block: B:211:0x066b  */
    /* JADX WARN: Code duplicated, block: B:213:0x0675  */
    /* JADX WARN: Code duplicated, block: B:215:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:216:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:219:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:221:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:254:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:256:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:258:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:260:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:263:0x0825  */
    /* JADX WARN: Code duplicated, block: B:268:0x08ae A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:266:0x08a6, B:268:0x08ae, B:270:0x08b8, B:272:0x08d6, B:271:0x08ce, B:273:0x08f8, B:275:0x0900, B:277:0x090b, B:279:0x0916, B:281:0x0921, B:284:0x0934, B:283:0x092c, B:285:0x094f), top: B:524:0x08a6 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x08b8 A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:266:0x08a6, B:268:0x08ae, B:270:0x08b8, B:272:0x08d6, B:271:0x08ce, B:273:0x08f8, B:275:0x0900, B:277:0x090b, B:279:0x0916, B:281:0x0921, B:284:0x0934, B:283:0x092c, B:285:0x094f), top: B:524:0x08a6 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x08ce A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:266:0x08a6, B:268:0x08ae, B:270:0x08b8, B:272:0x08d6, B:271:0x08ce, B:273:0x08f8, B:275:0x0900, B:277:0x090b, B:279:0x0916, B:281:0x0921, B:284:0x0934, B:283:0x092c, B:285:0x094f), top: B:524:0x08a6 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x08f8 A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:266:0x08a6, B:268:0x08ae, B:270:0x08b8, B:272:0x08d6, B:271:0x08ce, B:273:0x08f8, B:275:0x0900, B:277:0x090b, B:279:0x0916, B:281:0x0921, B:284:0x0934, B:283:0x092c, B:285:0x094f), top: B:524:0x08a6 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x0900 A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:266:0x08a6, B:268:0x08ae, B:270:0x08b8, B:272:0x08d6, B:271:0x08ce, B:273:0x08f8, B:275:0x0900, B:277:0x090b, B:279:0x0916, B:281:0x0921, B:284:0x0934, B:283:0x092c, B:285:0x094f), top: B:524:0x08a6 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x090b A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:266:0x08a6, B:268:0x08ae, B:270:0x08b8, B:272:0x08d6, B:271:0x08ce, B:273:0x08f8, B:275:0x0900, B:277:0x090b, B:279:0x0916, B:281:0x0921, B:284:0x0934, B:283:0x092c, B:285:0x094f), top: B:524:0x08a6 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x092c A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:266:0x08a6, B:268:0x08ae, B:270:0x08b8, B:272:0x08d6, B:271:0x08ce, B:273:0x08f8, B:275:0x0900, B:277:0x090b, B:279:0x0916, B:281:0x0921, B:284:0x0934, B:283:0x092c, B:285:0x094f), top: B:524:0x08a6 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x094f A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:266:0x08a6, B:268:0x08ae, B:270:0x08b8, B:272:0x08d6, B:271:0x08ce, B:273:0x08f8, B:275:0x0900, B:277:0x090b, B:279:0x0916, B:281:0x0921, B:284:0x0934, B:283:0x092c, B:285:0x094f), top: B:524:0x08a6 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:299:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:303:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:305:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:308:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:315:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:317:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:320:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:321:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:325:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:327:0x0b10  */
    /* JADX WARN: Code duplicated, block: B:329:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:341:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:343:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:345:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:357:0x0bca  */
    /* JADX WARN: Code duplicated, block: B:359:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:361:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:365:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:368:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:371:0x0c23  */
    /* JADX WARN: Code duplicated, block: B:373:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:376:0x0c4f  */
    /* JADX WARN: Code duplicated, block: B:384:0x0c7f  */
    /* JADX WARN: Code duplicated, block: B:387:0x0c8e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0caa  */
    /* JADX WARN: Code duplicated, block: B:396:0x0ccb  */
    /* JADX WARN: Code duplicated, block: B:399:0x0cec  */
    /* JADX WARN: Code duplicated, block: B:401:0x0d08  */
    /* JADX WARN: Code duplicated, block: B:403:0x0d12  */
    /* JADX WARN: Code duplicated, block: B:406:0x0d39  */
    /* JADX WARN: Code duplicated, block: B:409:0x0d55  */
    /* JADX WARN: Code duplicated, block: B:411:0x0d65  */
    /* JADX WARN: Code duplicated, block: B:412:0x0d7d  */
    /* JADX WARN: Code duplicated, block: B:424:0x0ddd  */
    /* JADX WARN: Code duplicated, block: B:427:0x0df1  */
    /* JADX WARN: Code duplicated, block: B:430:0x0e0b  */
    /* JADX WARN: Code duplicated, block: B:433:0x0e88  */
    /* JADX WARN: Code duplicated, block: B:434:0x0e8e  */
    /* JADX WARN: Code duplicated, block: B:437:0x0eb7  */
    /* JADX WARN: Code duplicated, block: B:441:0x0edb  */
    /* JADX WARN: Code duplicated, block: B:443:0x0eeb  */
    /* JADX WARN: Code duplicated, block: B:444:0x0f03  */
    /* JADX WARN: Code duplicated, block: B:449:0x0f3f  */
    /* JADX WARN: Code duplicated, block: B:451:0x0f48  */
    /* JADX WARN: Code duplicated, block: B:452:0x0f52  */
    /* JADX WARN: Code duplicated, block: B:455:0x0f5e  */
    /* JADX WARN: Code duplicated, block: B:457:0x0f6a  */
    /* JADX WARN: Code duplicated, block: B:459:0x0f74  */
    /* JADX WARN: Code duplicated, block: B:462:0x0f8b  */
    /* JADX WARN: Code duplicated, block: B:465:0x0fa6  */
    /* JADX WARN: Code duplicated, block: B:467:0x0fb6  */
    /* JADX WARN: Code duplicated, block: B:468:0x0fce  */
    /* JADX WARN: Code duplicated, block: B:471:0x0fe7  */
    /* JADX WARN: Code duplicated, block: B:475:0x1024  */
    /* JADX WARN: Code duplicated, block: B:478:0x1038  */
    /* JADX WARN: Code duplicated, block: B:481:0x1052  */
    /* JADX WARN: Code duplicated, block: B:484:0x1066  */
    /* JADX WARN: Code duplicated, block: B:486:0x1073  */
    /* JADX WARN: Code duplicated, block: B:489:0x108b  */
    /* JADX WARN: Code duplicated, block: B:493:0x10cb  */
    /* JADX WARN: Code duplicated, block: B:495:0x10db  */
    /* JADX WARN: Code duplicated, block: B:496:0x10f3  */
    /* JADX WARN: Code duplicated, block: B:506:0x114f  */
    /* JADX WARN: Code duplicated, block: B:514:0x11c4  */
    /* JADX WARN: Code duplicated, block: B:516:0x11cc  */
    /* JADX WARN: Code duplicated, block: B:517:0x11e7  */
    /* JADX WARN: Code duplicated, block: B:520:0x1207  */
    /* JADX WARN: Code duplicated, block: B:536:0x1215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x1215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0f2a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0feb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x111a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0af4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0236  */
    /* JADX WARN: Code duplicated, block: B:78:0x0252  */
    /* JADX WARN: Code duplicated, block: B:82:0x0265  */
    /* JADX WARN: Code duplicated, block: B:84:0x0276  */
    /* JADX WARN: Code duplicated, block: B:86:0x027d  */
    /* JADX WARN: Code duplicated, block: B:87:0x028a  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d5  */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x0383, please report this as an issue */
    public static void a(Client client, int i, int i2, Widget widget, int i3) {
        int iMax;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        class_333 class_333VarA;
        class_333 class_333VarA2;
        class_333 class_333VarA3;
        class_338 class_338Var;
        int i9;
        int i10;
        int i11;
        ItemComposition itemCompositionLookupItem;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean zB;
        int i16;
        ColorUtility colorUtilityA;
        int i17;
        int i18;
        double d;
        class_333 class_333Var;
        class_333 class_333Var2;
        int i19;
        int i20;
        boolean z;
        int i21;
        int i22;
        int i23;
        int i24;
        class_338 class_338Var2;
        String strSubstring;
        int i25;
        int i26;
        int i27;
        int i28;
        String str2;
        int i29;
        int i30;
        int i31;
        int iIndexOf;
        String strSubstring2;
        String strSubstring3;
        int iIndexOf2;
        String strSubstring4;
        int iA;
        class_333 class_333Var3;
        class_338 class_338Var3;
        String strSubstring5;
        int i32;
        int i33;
        int i34;
        int i35;
        String str3;
        int i36;
        int i37;
        int i38;
        int iIndexOf3;
        String strSubstring6;
        String strSubstring7;
        int iIndexOf4;
        String strSubstring8;
        if (widget.aG != 0 || widget.ak == null) {
            return;
        }
        if (!widget.aO || client.ef == widget.au || client.ep == widget.au || client.em == widget.au) {
            int i39 = class_210.l;
            int i40 = class_210.j;
            int i41 = class_210.m;
            int i42 = class_210.k;
            class_446.m(widget.au);
            int i43 = i2 + widget.aY;
            int i44 = i + widget.aZ;
            widget.bz = i43;
            widget.bA = i3;
            class_210.c(i3 + widget.aP, i43, i43 + widget.P, i3 - 0);
            int length = widget.ak.length;
            boolean z2 = false;
            if (widget.au == 1151) {
                Widget widget2 = Widget.H[3214];
                for (int i45 = 0; i45 < widget2.ax.length; i45++) {
                    if (widget2.ax[i45] == 6820 || widget2.ax[i45] == 23112) {
                        z2 = true;
                        break;
                    }
                }
            }
            class_358.d.a(widget.au);
            widget.g();
            widget.f(i43, i3);
            for (int i46 = 0; i46 < length; i46++) {
                int i47 = widget.al[i46] + i43;
                int i48 = (widget.ba[i46] + i3) - i44;
                Widget widget3 = Widget.H[widget.ak[i46]];
                widget3.g();
                int i49 = i47 + widget3.aY;
                int i50 = i48 + widget3.aZ;
                if (widget3 == null) {
                    System.out.println("Nulled child of I" + widget.au + ": " + i46);
                } else if (widget3.bd && widget.be && ((widget3.au != 32431 || ((class_344) widget3).i() == i46) && ((widget3.au != 26708 || Widget.H[26705].as.contains("Bank")) && (((widget3.au != 40603 && widget3.au != 40604) || !Widget.H[40602].as.equalsIgnoreCase("Hunger games loot chest")) && client.j(widget3.au))))) {
                    if (widget3.ae == 2043 && widget3.aG == 6) {
                        i50 -= 7;
                    }
                    boolean z3 = false;
                    for (int i51 = 0; i51 < class_473.bG.length; i51++) {
                        if (class_473.bG[i51][0] == widget3.au && !client.i(i51)) {
                            z3 = true;
                            if (z3) {
                                continue;
                            } else {
                                iMax = i49 + widget3.aH;
                                i4 = i50 + widget3.aN;
                                if (widget3.J > 0) {
                                    client.a(widget3);
                                }
                                for (i5 = 0; i5 < client.cm.length; i5++) {
                                    if (widget3.au != client.cm[i5] + 1) {
                                        if (i5 > 61) {
                                            client.f(iMax + 1, i4);
                                        } else {
                                            client.f(iMax, i4 + 1);
                                        }
                                    }
                                }
                                for (i6 = 0; i6 < client.cn.length; i6++) {
                                    if (widget3.au == client.cn[i6]) {
                                        widget3.aR = 775;
                                    }
                                }
                                widget3.f(iMax, i4);
                                if (widget3.bE != null) {
                                    widget3.bE.draw(iMax, i4);
                                }
                                if (widget3.aG == 0) {
                                    if (widget3.V > widget3.aF - widget3.aP) {
                                        widget3.V = widget3.aF - widget3.aP;
                                    }
                                    if (widget3.V < 0) {
                                        widget3.V = 0;
                                    }
                                    a(client, widget3.V, iMax, widget3, i4);
                                    if (widget3.aF > widget3.aP) {
                                        client.b(widget3.aP, widget3.V, i4, iMax + widget3.P, widget3.aF);
                                    }
                                } else if (widget3.aG != 1) {
                                    if (widget3.aG == 2) {
                                        a(client, widget, widget3, iMax, i4, i44, i43);
                                    } else if (widget3.aG == 3) {
                                        z = client.em != widget3.au || client.ep == widget3.au || client.ef == widget3.au;
                                        if (client.b(widget3)) {
                                            i21 = widget3.O;
                                            if (z && widget3.aj != 0) {
                                                i21 = widget3.aj;
                                            }
                                        } else {
                                            i21 = widget3.ac;
                                            if (z && widget3.L != 0) {
                                                i21 = widget3.L;
                                            }
                                        }
                                        if (widget3.aA == 0) {
                                            if (widget3.Y) {
                                                class_210.a(widget3.aP, i4, iMax, i21, widget3.P);
                                            } else {
                                                class_210.d(iMax, widget3.P, widget3.aP, i21, i4);
                                            }
                                        } else if (widget3.Y) {
                                            class_210.d(iMax, i4, widget3.P, widget3.aP, i21, 256 - (widget3.aA & 255));
                                        } else {
                                            class_210.f(i4, widget3.aP, 256 - (widget3.aA & 255), i21, widget3.P, iMax);
                                        }
                                    } else if (widget3.aG == 15) {
                                        if (widget3.w >= 100) {
                                            i19 = widget3.z;
                                        } else {
                                            i19 = widget3.y;
                                        }
                                        int i52 = i19;
                                        int i53 = widget3.B;
                                        if (widget3.w >= 100) {
                                            i20 = widget3.P;
                                        } else {
                                            i20 = (int) ((((double) widget3.w) / 100.0d) * ((double) widget3.P));
                                        }
                                        class_210.a(iMax - i53, i4 - i53, widget3.P + (i53 * 2), widget3.aP + (i53 * 2), widget3.A, 255);
                                        class_210.a(iMax, i4, widget3.P, widget3.aP, widget3.x, 255);
                                        class_210.a(iMax, i4, i20, widget3.aP, i52, 255);
                                    } else if (widget3.aG == 4) {
                                        a(client, widget, widget3, iMax, i4);
                                    } else if (widget3.aG != 42 && (widget3 instanceof class_343)) {
                                        class_345.a((class_343) widget3, iMax, i4, widget.aF > 0);
                                    } else if (widget3.aG == 5) {
                                        if (!z2 || ((widget3.bx && Client.br == widget3.au) || client.b(widget3))) {
                                            class_333Var = widget3.aE;
                                            class_333Var2 = widget3.j;
                                        } else {
                                            class_333Var = widget3.E;
                                            class_333Var2 = widget3.i;
                                        }
                                        if (class_333Var != null) {
                                            widget3.bz = iMax;
                                            widget3.bA = i4;
                                            if (client.eW != 1 && widget3.au == client.bq && client.bq != 0) {
                                                class_333Var.f(iMax, i4, class_492.c);
                                            } else if (!widget3.l) {
                                                class_333Var.f(iMax, i4);
                                            } else if (widget3.m) {
                                                class_395.d.c(iMax, i4);
                                            } else {
                                                class_333Var.c(iMax, i4);
                                            }
                                            if (class_333Var2 != null && Client.br == widget3.au) {
                                                class_333Var2.f(iMax, i4);
                                            }
                                        }
                                        if (client.U && widget3.au == Client.T && widget3.au == client.S) {
                                            client.Y.f(iMax - 3, i4 - 3);
                                        }
                                    } else if (widget3.aG == 6) {
                                        int i54 = class_332.s;
                                        int i55 = class_332.t;
                                        class_332.s = iMax + (widget3.P / 2);
                                        class_332.t = i4 + (widget3.aP / 2);
                                        i14 = (class_332.v[widget3.aS] * widget3.aR) >> 16;
                                        i15 = (class_332.w[widget3.aS] * widget3.aR) >> 16;
                                        zB = client.b(widget3);
                                        if (zB) {
                                            i16 = widget3.aC;
                                        } else {
                                            i16 = widget3.aB;
                                        }
                                        if (i16 != -1 || widget3.aL > 0) {
                                            class_332.h = true;
                                            try {
                                                colorUtilityA = widget3.a(-1, -1, zB, -1, -1);
                                                class_332.h = false;
                                            } catch (Throwable th) {
                                                class_332.h = false;
                                                throw th;
                                            }
                                        } else {
                                            class_99 class_99Var = class_99.a[i16];
                                            class_332.h = true;
                                            try {
                                                if (class_99Var.f == null) {
                                                    colorUtilityA = widget3.a(-1, class_99Var.b() ? widget3.aq : class_99Var.e[widget3.aq], zB, class_99Var.r, class_99Var.r);
                                                } else if (widget3.aq >= class_99Var.f.length || widget3.aq >= class_99Var.e.length) {
                                                    colorUtilityA = widget3.a(-1, -1, zB, -1, -1);
                                                } else {
                                                    int i56 = widget3.aq;
                                                    if (class_99Var.r == 8233) {
                                                        i56 = 2;
                                                        client.a(62, 20L);
                                                    }
                                                    colorUtilityA = widget3.a(class_99Var.f[i56], class_99Var.e[i56], zB, class_99Var.r, class_99Var.r);
                                                }
                                                class_332.h = false;
                                            } catch (Throwable th2) {
                                                class_332.h = false;
                                                throw th2;
                                            }
                                        }
                                        if (colorUtilityA != null) {
                                            i17 = 0;
                                            if (widget3.aI) {
                                                if (widget3.aK == 0) {
                                                    if (class_419.bK) {
                                                        d = 1050.0d;
                                                    } else {
                                                        d = 0.0d;
                                                    }
                                                    widget3.aT = ((int) (d + (Math.sin(((double) Client.ff) / 40.0d) * 256.0d))) & Client.dn;
                                                    widget3.aS = 150;
                                                    i17 = -150;
                                                } else {
                                                    widget3.aT = ((int) (((double) widget3.aK) + (Math.sin(((double) Client.ff) / 40.0d) * 256.0d))) & Client.dn;
                                                    i17 = -10;
                                                }
                                                colorUtilityA.F = true;
                                                client.a(51, 20L);
                                                client.a(52, 20L);
                                                client.a(53, 20L);
                                                client.a(54, 20L);
                                                client.a(57, 20L);
                                                client.a(60, 20L);
                                                client.a(61, 20L);
                                                client.a(62, 20L);
                                            }
                                            class_332.h = true;
                                            class_332.q = false;
                                            i18 = class_210.k;
                                            try {
                                                if (widget3.aW) {
                                                    if (widget.au == 57016) {
                                                        class_210.k = i18 - 1;
                                                        colorUtilityA.O = 0;
                                                        colorUtilityA.F = true;
                                                    } else {
                                                        class_210.k = i18 - 32;
                                                    }
                                                    colorUtilityA.a(widget3.aT, 0, widget3.aS, 0, i14, i15, widget3.P, widget3.aP);
                                                } else if (widget3.aL == 0) {
                                                    if (widget3.au != 4883 || widget3.au == 4888 || widget3.au == 4894 || widget3.au == 4901) {
                                                        class_210.k = i18 - 32;
                                                    }
                                                    colorUtilityA.a(widget3.aT, 0, widget3.aS, 0, i14, i15 + i17);
                                                } else {
                                                    class_210.k = i18 - 32;
                                                    ItemComposition itemCompositionLookupItem2 = ItemComposition.lookupItem(widget3.aL);
                                                    colorUtilityA.a(widget3.aT, itemCompositionLookupItem2.ae, widget3.aS, itemCompositionLookupItem2.v, i14 + (colorUtilityA.g / 2) + itemCompositionLookupItem2.W, i15 + itemCompositionLookupItem2.W);
                                                }
                                                class_332.h = false;
                                                class_332.q = true;
                                                class_210.k = i18;
                                            } catch (Throwable th3) {
                                                class_332.h = false;
                                                class_332.q = true;
                                                class_210.k = i18;
                                                throw th3;
                                            }
                                        }
                                        if (widget3.ae == 4907 && Client.cH == 47500) {
                                            Client.gl.b("@or1@(Male)", iMax + 33 + 5, i4 + 1, class_492.c, 0);
                                        }
                                        if (widget3.ae == 4908 && Client.cH == 47500) {
                                            Client.gl.b("@or1@(Female)", iMax + 26 + 8, i4 + 1, class_492.c, 0);
                                        }
                                        class_332.s = i54;
                                        class_332.t = i55;
                                    } else if (widget3.aG == 7) {
                                        class_338Var = widget3.an;
                                        i9 = 0;
                                        for (i10 = 0; i10 < widget3.aP; i10++) {
                                            for (i11 = 0; i11 < widget3.P; i11++) {
                                                if (widget3.ax[i9] > 0) {
                                                    itemCompositionLookupItem = ItemComposition.lookupItem(widget3.ax[i9] - 1);
                                                    str = itemCompositionLookupItem.itemName;
                                                    if (itemCompositionLookupItem.C || widget3.av[i9] != 1) {
                                                        str = str + " x" + Client.o(widget3.av[i9]);
                                                    }
                                                    i12 = iMax + (i11 * (115 + widget3.ab));
                                                    i13 = i4 + (i10 * (12 + widget3.ao));
                                                    if (widget3.S) {
                                                        class_338Var.a(widget3.ac, i12 + (widget3.P / 2), str, i13, widget3.aQ);
                                                    } else {
                                                        class_338Var.a(widget3.aQ, i12, widget3.ac, str, i13);
                                                    }
                                                }
                                                i9++;
                                            }
                                        }
                                    } else if (widget3.aG == 21) {
                                        int i57 = widget3.P;
                                        if (widget3.ae >= 0 && iMax >= class_210.l - i57 && iMax < class_210.m && i4 > class_210.j - i57 && i4 < class_210.k && (class_333VarA3 = class_103.a(class_104.a, widget3.ae, widget3.P)) != null) {
                                            class_333VarA3.f(iMax, i4);
                                        }
                                    } else if (widget3.aG == 22) {
                                        int i58 = widget3.P;
                                        if (widget3.ae >= 0 && iMax >= class_210.l - i58 && iMax < class_210.m && i4 > class_210.j - i58 && i4 < class_210.k && (class_333VarA2 = class_103.a(class_104.b, widget3.ae, widget3.P)) != null) {
                                            class_333VarA2.f(iMax, i4);
                                        }
                                    } else if (widget3.aG == 20) {
                                        i7 = widget3.bo;
                                        i8 = widget3.P;
                                        if (Client.cH != 39975 || Client.cH == 24535 || Client.cH == 38975) {
                                            i7 = 100000;
                                        }
                                        if (widget3.ai == 64071) {
                                            i7 = 100000;
                                        }
                                        if (widget3.ae >= 0) {
                                            if (widget3.T) {
                                                iMax += Math.max(5, Widget.l(class_446.bI).P / 2) - (i8 / 2);
                                            }
                                            if (iMax >= class_210.l - i8 && iMax < class_210.m && i4 > class_210.j - i8 && i4 < class_210.k) {
                                                class_333VarA = ItemComposition.a(widget3.ae, i7, 0, i8);
                                                if (class_333VarA != null) {
                                                    class_333VarA.f(iMax, i4);
                                                }
                                                if (i7 > 1 && (Client.cH == 57000 || Client.cH == 56998)) {
                                                    if (i7 >= 1) {
                                                        Client.gh.b(class_492.g, Client.g(i7), i4 + 9, iMax);
                                                    }
                                                    if (i7 >= 100000) {
                                                        Client.gh.b(class_492.c, Client.g(i7), i4 + 9, iMax);
                                                    }
                                                    if (i7 >= 10000000) {
                                                        Client.gh.b(65408, Client.g(i7), i4 + 9, iMax);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (widget3.aG == 11) {
                                        class_210.c(widget3.bb, 0, 765, 503, 256 - (widget3.bg & 255), 0);
                                    }
                                }
                                if (widget3.aG == 8) {
                                    int i59 = 0;
                                    int i60 = 0;
                                    class_338Var3 = widget3.an;
                                    strSubstring5 = widget3.as;
                                    while (strSubstring5.length() > 0) {
                                        iIndexOf4 = strSubstring5.indexOf("\\n");
                                        if (iIndexOf4 != -1) {
                                            strSubstring8 = strSubstring5.substring(0, iIndexOf4);
                                            strSubstring5 = strSubstring5.substring(iIndexOf4 + 2);
                                        } else {
                                            strSubstring8 = strSubstring5;
                                            strSubstring5 = "";
                                        }
                                        if (strSubstring8 == null && class_338Var3 != null) {
                                            int iA2 = class_338Var3.a(strSubstring8);
                                            if (iA2 > i59) {
                                                i59 = iA2;
                                            }
                                            i60 += class_338Var3.r + 1;
                                        }
                                    }
                                    i32 = i59 + 6;
                                    i33 = i60 + 7;
                                    i34 = ((iMax + widget3.P) - 5) - i32;
                                    i35 = i4 + widget3.aP + 5;
                                    if (i34 < iMax + 5) {
                                        i34 = iMax + 5;
                                    }
                                    if (i34 + i32 > i43 + widget.P) {
                                        i34 = (i43 + widget.P) - i32;
                                    }
                                    if (i35 + i33 > i3 + widget.aP) {
                                        i35 = (i3 + widget.aP) - i33;
                                    }
                                    switch (widget3.au) {
                                        case 9217:
                                        case 9220:
                                        case 9223:
                                        case 9226:
                                        case 9229:
                                        case 9232:
                                        case 9235:
                                        case 9238:
                                            i34 -= 80;
                                            break;
                                        case 9239:
                                            i35 -= 100;
                                            break;
                                    }
                                    class_210.e(i34, i35, i32, i33, 16777120);
                                    class_210.d(i34, i32, i33, 0, i35);
                                    str3 = widget3.as;
                                    if (class_338Var3 == null) {
                                        System.out.println("Nulled: " + widget3.au);
                                    }
                                    i36 = i35 + class_338Var3.r;
                                    i37 = 2;
                                    while (true) {
                                        i38 = i36 + i37;
                                        if (str3.length() > 0) {
                                            iIndexOf3 = str3.indexOf("\\n");
                                            if (iIndexOf3 != -1) {
                                                strSubstring6 = str3.substring(0, iIndexOf3);
                                                strSubstring7 = str3.substring(iIndexOf3 + 2);
                                            } else {
                                                strSubstring6 = str3;
                                                strSubstring7 = "";
                                            }
                                            str3 = strSubstring7;
                                            class_338Var3.a(false, i34 + 3, 0, strSubstring6, i38);
                                            i36 = i38;
                                            i37 = class_338Var3.r + 1;
                                        } else {
                                            class_210.c(i42, i39, i41, i40);
                                        }
                                    }
                                }
                                if (widget3.aG == 12) {
                                    if (client.b(widget3)) {
                                        class_333Var3 = widget3.aE;
                                    } else {
                                        class_333Var3 = widget3.E;
                                    }
                                    if (class_333Var3 != null) {
                                        class_333Var3.c(iMax, i4);
                                    }
                                } else if (widget3.aG == 9) {
                                    client.c(iMax, i4, widget3.as);
                                }
                                if (widget3.aG == 10) {
                                    i23 = 0;
                                    i24 = 0;
                                    class_338Var2 = client.gi;
                                    strSubstring = widget3.as;
                                    while (strSubstring.length() > 0) {
                                        iIndexOf2 = strSubstring.indexOf("\\n");
                                        if (iIndexOf2 != -1) {
                                            strSubstring4 = strSubstring.substring(0, iIndexOf2);
                                            strSubstring = strSubstring.substring(iIndexOf2 + 2);
                                        } else {
                                            strSubstring4 = strSubstring;
                                            strSubstring = "";
                                        }
                                        iA = class_338Var2.a(strSubstring4);
                                        if (iA > i23) {
                                            i23 = iA;
                                        }
                                        i24 += class_338Var2.r + 1;
                                    }
                                    i25 = i23 + 6;
                                    i26 = i24 + 7;
                                    i27 = ((iMax + widget3.P) - 5) - i25;
                                    i28 = i4 + widget3.aP + 5;
                                    if (i27 < iMax + 5) {
                                        i27 = iMax + 5;
                                    }
                                    if (i27 + i25 > i43 + widget.P) {
                                        i27 = (i43 + widget.P) - i25;
                                    }
                                    if (i28 + i26 > i3 + widget.aP) {
                                        i28 = (i3 + widget.aP) - i26;
                                    }
                                    if (widget3.bf) {
                                        if (i27 + i25 + i43 > 249) {
                                            i27 = (User32.VK_ZOOM - i25) - i43;
                                        }
                                        if (i28 + i26 + i3 > 261) {
                                            i28 = (User32.VK_OEM_BACKTAB - i26) - i3;
                                        }
                                    }
                                    class_210.a(i26, i28, i27, 16777120, i25);
                                    class_210.d(i27, i25, i26, 0, i28);
                                    str2 = widget3.as;
                                    i29 = i28 + class_338Var2.r;
                                    i30 = 2;
                                    while (true) {
                                        i31 = i29 + i30;
                                        if (str2.length() > 0) {
                                            iIndexOf = str2.indexOf("\\n");
                                            if (iIndexOf != -1) {
                                                strSubstring2 = str2.substring(0, iIndexOf);
                                                strSubstring3 = str2.substring(iIndexOf + 2);
                                            } else {
                                                strSubstring2 = str2;
                                                strSubstring3 = "";
                                            }
                                            str2 = strSubstring3;
                                            class_338Var2.a(false, i27 + 3, 0, strSubstring2, i31);
                                            i29 = i31;
                                            i30 = class_338Var2.r + 1;
                                        }
                                    }
                                }
                                if (Configuration.am && Client.cT == 2) {
                                    Client.gl.a(widget3.au, iMax, i4);
                                }
                                for (i22 = 0; i22 < class_253.m.size(); i22++) {
                                    if (!class_253.m.get(i22).e() && class_253.m.get(i22).d().b(widget3.au) != null) {
                                        class_253.m.get(i22).d().b(widget3.au).a(widget3, iMax, i4);
                                    }
                                }
                                class_313.d().a(widget.ak[i46], iMax, i4);
                                if (Configuration.an) {
                                    if (widget3.ak != null) {
                                        Client.gl.b("@or1@" + widget3.au, iMax, i4, class_492.c, 0);
                                    } else {
                                        Client.gl.b("@cya@" + widget3.au, iMax, i4, class_492.c, 0);
                                    }
                                }
                                if (widget3.bF != null) {
                                    widget3.bF.draw(iMax, i4);
                                }
                            }
                        }
                    }
                    if (z3) {
                        continue;
                    } else {
                        iMax = i49 + widget3.aH;
                        i4 = i50 + widget3.aN;
                        if (widget3.J > 0) {
                            client.a(widget3);
                        }
                        while (i5 < client.cm.length) {
                            if (widget3.au != client.cm[i5] + 1) {
                                if (i5 > 61) {
                                    client.f(iMax + 1, i4);
                                } else {
                                    client.f(iMax, i4 + 1);
                                }
                            }
                        }
                        while (i6 < client.cn.length) {
                            if (widget3.au == client.cn[i6]) {
                                widget3.aR = 775;
                            }
                        }
                        widget3.f(iMax, i4);
                        if (widget3.bE != null) {
                            widget3.bE.draw(iMax, i4);
                        }
                        if (widget3.aG == 0) {
                            if (widget3.V > widget3.aF - widget3.aP) {
                                widget3.V = widget3.aF - widget3.aP;
                            }
                            if (widget3.V < 0) {
                                widget3.V = 0;
                            }
                            a(client, widget3.V, iMax, widget3, i4);
                            if (widget3.aF > widget3.aP) {
                                client.b(widget3.aP, widget3.V, i4, iMax + widget3.P, widget3.aF);
                            }
                        } else if (widget3.aG != 1) {
                            if (widget3.aG == 2) {
                                a(client, widget, widget3, iMax, i4, i44, i43);
                            } else if (widget3.aG == 3) {
                                if (client.em != widget3.au) {
                                }
                                if (client.b(widget3)) {
                                    i21 = widget3.O;
                                    if (z) {
                                        i21 = widget3.aj;
                                    }
                                } else {
                                    i21 = widget3.ac;
                                    if (z) {
                                        i21 = widget3.L;
                                    }
                                }
                                if (widget3.aA == 0) {
                                    if (widget3.Y) {
                                        class_210.a(widget3.aP, i4, iMax, i21, widget3.P);
                                    } else {
                                        class_210.d(iMax, widget3.P, widget3.aP, i21, i4);
                                    }
                                } else if (widget3.Y) {
                                    class_210.d(iMax, i4, widget3.P, widget3.aP, i21, 256 - (widget3.aA & 255));
                                } else {
                                    class_210.f(i4, widget3.aP, 256 - (widget3.aA & 255), i21, widget3.P, iMax);
                                }
                            } else if (widget3.aG == 15) {
                                if (widget3.w >= 100) {
                                    i19 = widget3.z;
                                } else {
                                    i19 = widget3.y;
                                }
                                int i510 = i19;
                                int i511 = widget3.B;
                                if (widget3.w >= 100) {
                                    i20 = widget3.P;
                                } else {
                                    i20 = (int) ((((double) widget3.w) / 100.0d) * ((double) widget3.P));
                                }
                                class_210.a(iMax - i511, i4 - i511, widget3.P + (i511 * 2), widget3.aP + (i511 * 2), widget3.A, 255);
                                class_210.a(iMax, i4, widget3.P, widget3.aP, widget3.x, 255);
                                class_210.a(iMax, i4, i20, widget3.aP, i510, 255);
                            } else if (widget3.aG == 4) {
                                a(client, widget, widget3, iMax, i4);
                            } else if (widget3.aG != 42) {
                                if (widget3.aG == 5) {
                                    if (z2) {
                                        class_333Var = widget3.aE;
                                        class_333Var2 = widget3.j;
                                    } else {
                                        class_333Var = widget3.aE;
                                        class_333Var2 = widget3.j;
                                    }
                                    if (class_333Var != null) {
                                        widget3.bz = iMax;
                                        widget3.bA = i4;
                                        if (client.eW != 1) {
                                            if (!widget3.l) {
                                                class_333Var.f(iMax, i4);
                                            } else if (widget3.m) {
                                                class_395.d.c(iMax, i4);
                                            } else {
                                                class_333Var.c(iMax, i4);
                                            }
                                        } else if (!widget3.l) {
                                            class_333Var.f(iMax, i4);
                                        } else if (widget3.m) {
                                            class_395.d.c(iMax, i4);
                                        } else {
                                            class_333Var.c(iMax, i4);
                                        }
                                        if (class_333Var2 != null) {
                                            class_333Var2.f(iMax, i4);
                                        }
                                    }
                                    if (client.U) {
                                        client.Y.f(iMax - 3, i4 - 3);
                                    }
                                } else if (widget3.aG == 6) {
                                    int i512 = class_332.s;
                                    int i513 = class_332.t;
                                    class_332.s = iMax + (widget3.P / 2);
                                    class_332.t = i4 + (widget3.aP / 2);
                                    i14 = (class_332.v[widget3.aS] * widget3.aR) >> 16;
                                    i15 = (class_332.w[widget3.aS] * widget3.aR) >> 16;
                                    zB = client.b(widget3);
                                    if (zB) {
                                        i16 = widget3.aC;
                                    } else {
                                        i16 = widget3.aB;
                                    }
                                    if (i16 != -1) {
                                        class_332.h = true;
                                        colorUtilityA = widget3.a(-1, -1, zB, -1, -1);
                                        class_332.h = false;
                                    } else {
                                        class_332.h = true;
                                        colorUtilityA = widget3.a(-1, -1, zB, -1, -1);
                                        class_332.h = false;
                                    }
                                    if (colorUtilityA != null) {
                                        i17 = 0;
                                        if (widget3.aI) {
                                            if (widget3.aK == 0) {
                                                if (class_419.bK) {
                                                    d = 1050.0d;
                                                } else {
                                                    d = 0.0d;
                                                }
                                                widget3.aT = ((int) (d + (Math.sin(((double) Client.ff) / 40.0d) * 256.0d))) & Client.dn;
                                                widget3.aS = 150;
                                                i17 = -150;
                                            } else {
                                                widget3.aT = ((int) (((double) widget3.aK) + (Math.sin(((double) Client.ff) / 40.0d) * 256.0d))) & Client.dn;
                                                i17 = -10;
                                            }
                                            colorUtilityA.F = true;
                                            client.a(51, 20L);
                                            client.a(52, 20L);
                                            client.a(53, 20L);
                                            client.a(54, 20L);
                                            client.a(57, 20L);
                                            client.a(60, 20L);
                                            client.a(61, 20L);
                                            client.a(62, 20L);
                                        }
                                        class_332.h = true;
                                        class_332.q = false;
                                        i18 = class_210.k;
                                        if (widget3.aW) {
                                            if (widget.au == 57016) {
                                                class_210.k = i18 - 1;
                                                colorUtilityA.O = 0;
                                                colorUtilityA.F = true;
                                            } else {
                                                class_210.k = i18 - 32;
                                            }
                                            colorUtilityA.a(widget3.aT, 0, widget3.aS, 0, i14, i15, widget3.P, widget3.aP);
                                        } else if (widget3.aL == 0) {
                                            if (widget3.au != 4883) {
                                                class_210.k = i18 - 32;
                                            } else {
                                                class_210.k = i18 - 32;
                                            }
                                            colorUtilityA.a(widget3.aT, 0, widget3.aS, 0, i14, i15 + i17);
                                        } else {
                                            class_210.k = i18 - 32;
                                            ItemComposition itemCompositionLookupItem3 = ItemComposition.lookupItem(widget3.aL);
                                            colorUtilityA.a(widget3.aT, itemCompositionLookupItem3.ae, widget3.aS, itemCompositionLookupItem3.v, i14 + (colorUtilityA.g / 2) + itemCompositionLookupItem3.W, i15 + itemCompositionLookupItem3.W);
                                        }
                                        class_332.h = false;
                                        class_332.q = true;
                                        class_210.k = i18;
                                    }
                                    if (widget3.ae == 4907) {
                                        Client.gl.b("@or1@(Male)", iMax + 33 + 5, i4 + 1, class_492.c, 0);
                                    }
                                    if (widget3.ae == 4908) {
                                        Client.gl.b("@or1@(Female)", iMax + 26 + 8, i4 + 1, class_492.c, 0);
                                    }
                                    class_332.s = i512;
                                    class_332.t = i513;
                                } else if (widget3.aG == 7) {
                                    class_338Var = widget3.an;
                                    i9 = 0;
                                    while (i10 < widget3.aP) {
                                        while (i11 < widget3.P) {
                                            if (widget3.ax[i9] > 0) {
                                                itemCompositionLookupItem = ItemComposition.lookupItem(widget3.ax[i9] - 1);
                                                str = itemCompositionLookupItem.itemName;
                                                if (itemCompositionLookupItem.C) {
                                                    str = str + " x" + Client.o(widget3.av[i9]);
                                                } else {
                                                    str = str + " x" + Client.o(widget3.av[i9]);
                                                }
                                                i12 = iMax + (i11 * (115 + widget3.ab));
                                                i13 = i4 + (i10 * (12 + widget3.ao));
                                                if (widget3.S) {
                                                    class_338Var.a(widget3.ac, i12 + (widget3.P / 2), str, i13, widget3.aQ);
                                                } else {
                                                    class_338Var.a(widget3.aQ, i12, widget3.ac, str, i13);
                                                }
                                            }
                                            i9++;
                                        }
                                    }
                                } else if (widget3.aG == 21) {
                                    int i514 = widget3.P;
                                    if (widget3.ae >= 0) {
                                        class_333VarA3.f(iMax, i4);
                                    }
                                } else if (widget3.aG == 22) {
                                    int i515 = widget3.P;
                                    if (widget3.ae >= 0) {
                                        class_333VarA2.f(iMax, i4);
                                    }
                                } else if (widget3.aG == 20) {
                                    i7 = widget3.bo;
                                    i8 = widget3.P;
                                    if (Client.cH != 39975) {
                                        i7 = 100000;
                                    } else {
                                        i7 = 100000;
                                    }
                                    if (widget3.ai == 64071) {
                                        i7 = 100000;
                                    }
                                    if (widget3.ae >= 0) {
                                        if (widget3.T) {
                                            iMax += Math.max(5, Widget.l(class_446.bI).P / 2) - (i8 / 2);
                                        }
                                        if (iMax >= class_210.l - i8) {
                                            class_333VarA = ItemComposition.a(widget3.ae, i7, 0, i8);
                                            if (class_333VarA != null) {
                                                class_333VarA.f(iMax, i4);
                                            }
                                            if (i7 > 1) {
                                                if (i7 >= 1) {
                                                    Client.gh.b(class_492.g, Client.g(i7), i4 + 9, iMax);
                                                }
                                                if (i7 >= 100000) {
                                                    Client.gh.b(class_492.c, Client.g(i7), i4 + 9, iMax);
                                                }
                                                if (i7 >= 10000000) {
                                                    Client.gh.b(65408, Client.g(i7), i4 + 9, iMax);
                                                }
                                            }
                                        }
                                    }
                                } else if (widget3.aG == 11) {
                                    class_210.c(widget3.bb, 0, 765, 503, 256 - (widget3.bg & 255), 0);
                                }
                            } else if (widget3.aG == 5) {
                                if (z2) {
                                    class_333Var = widget3.aE;
                                    class_333Var2 = widget3.j;
                                } else {
                                    class_333Var = widget3.aE;
                                    class_333Var2 = widget3.j;
                                }
                                if (class_333Var != null) {
                                    widget3.bz = iMax;
                                    widget3.bA = i4;
                                    if (client.eW != 1) {
                                        if (!widget3.l) {
                                            class_333Var.f(iMax, i4);
                                        } else if (widget3.m) {
                                            class_395.d.c(iMax, i4);
                                        } else {
                                            class_333Var.c(iMax, i4);
                                        }
                                    } else if (!widget3.l) {
                                        class_333Var.f(iMax, i4);
                                    } else if (widget3.m) {
                                        class_395.d.c(iMax, i4);
                                    } else {
                                        class_333Var.c(iMax, i4);
                                    }
                                    if (class_333Var2 != null) {
                                        class_333Var2.f(iMax, i4);
                                    }
                                }
                                if (client.U) {
                                    client.Y.f(iMax - 3, i4 - 3);
                                }
                            } else if (widget3.aG == 6) {
                                int i516 = class_332.s;
                                int i517 = class_332.t;
                                class_332.s = iMax + (widget3.P / 2);
                                class_332.t = i4 + (widget3.aP / 2);
                                i14 = (class_332.v[widget3.aS] * widget3.aR) >> 16;
                                i15 = (class_332.w[widget3.aS] * widget3.aR) >> 16;
                                zB = client.b(widget3);
                                if (zB) {
                                    i16 = widget3.aC;
                                } else {
                                    i16 = widget3.aB;
                                }
                                if (i16 != -1) {
                                    class_332.h = true;
                                    colorUtilityA = widget3.a(-1, -1, zB, -1, -1);
                                    class_332.h = false;
                                } else {
                                    class_332.h = true;
                                    colorUtilityA = widget3.a(-1, -1, zB, -1, -1);
                                    class_332.h = false;
                                }
                                if (colorUtilityA != null) {
                                    i17 = 0;
                                    if (widget3.aI) {
                                        if (widget3.aK == 0) {
                                            if (class_419.bK) {
                                                d = 1050.0d;
                                            } else {
                                                d = 0.0d;
                                            }
                                            widget3.aT = ((int) (d + (Math.sin(((double) Client.ff) / 40.0d) * 256.0d))) & Client.dn;
                                            widget3.aS = 150;
                                            i17 = -150;
                                        } else {
                                            widget3.aT = ((int) (((double) widget3.aK) + (Math.sin(((double) Client.ff) / 40.0d) * 256.0d))) & Client.dn;
                                            i17 = -10;
                                        }
                                        colorUtilityA.F = true;
                                        client.a(51, 20L);
                                        client.a(52, 20L);
                                        client.a(53, 20L);
                                        client.a(54, 20L);
                                        client.a(57, 20L);
                                        client.a(60, 20L);
                                        client.a(61, 20L);
                                        client.a(62, 20L);
                                    }
                                    class_332.h = true;
                                    class_332.q = false;
                                    i18 = class_210.k;
                                    if (widget3.aW) {
                                        if (widget.au == 57016) {
                                            class_210.k = i18 - 1;
                                            colorUtilityA.O = 0;
                                            colorUtilityA.F = true;
                                        } else {
                                            class_210.k = i18 - 32;
                                        }
                                        colorUtilityA.a(widget3.aT, 0, widget3.aS, 0, i14, i15, widget3.P, widget3.aP);
                                    } else if (widget3.aL == 0) {
                                        if (widget3.au != 4883) {
                                            class_210.k = i18 - 32;
                                        } else {
                                            class_210.k = i18 - 32;
                                        }
                                        colorUtilityA.a(widget3.aT, 0, widget3.aS, 0, i14, i15 + i17);
                                    } else {
                                        class_210.k = i18 - 32;
                                        ItemComposition itemCompositionLookupItem4 = ItemComposition.lookupItem(widget3.aL);
                                        colorUtilityA.a(widget3.aT, itemCompositionLookupItem4.ae, widget3.aS, itemCompositionLookupItem4.v, i14 + (colorUtilityA.g / 2) + itemCompositionLookupItem4.W, i15 + itemCompositionLookupItem4.W);
                                    }
                                    class_332.h = false;
                                    class_332.q = true;
                                    class_210.k = i18;
                                }
                                if (widget3.ae == 4907) {
                                    Client.gl.b("@or1@(Male)", iMax + 33 + 5, i4 + 1, class_492.c, 0);
                                }
                                if (widget3.ae == 4908) {
                                    Client.gl.b("@or1@(Female)", iMax + 26 + 8, i4 + 1, class_492.c, 0);
                                }
                                class_332.s = i516;
                                class_332.t = i517;
                            } else if (widget3.aG == 7) {
                                class_338Var = widget3.an;
                                i9 = 0;
                                while (i10 < widget3.aP) {
                                    while (i11 < widget3.P) {
                                        if (widget3.ax[i9] > 0) {
                                            itemCompositionLookupItem = ItemComposition.lookupItem(widget3.ax[i9] - 1);
                                            str = itemCompositionLookupItem.itemName;
                                            if (itemCompositionLookupItem.C) {
                                                str = str + " x" + Client.o(widget3.av[i9]);
                                            } else {
                                                str = str + " x" + Client.o(widget3.av[i9]);
                                            }
                                            i12 = iMax + (i11 * (115 + widget3.ab));
                                            i13 = i4 + (i10 * (12 + widget3.ao));
                                            if (widget3.S) {
                                                class_338Var.a(widget3.ac, i12 + (widget3.P / 2), str, i13, widget3.aQ);
                                            } else {
                                                class_338Var.a(widget3.aQ, i12, widget3.ac, str, i13);
                                            }
                                        }
                                        i9++;
                                    }
                                }
                            } else if (widget3.aG == 21) {
                                int i518 = widget3.P;
                                if (widget3.ae >= 0) {
                                    class_333VarA3.f(iMax, i4);
                                }
                            } else if (widget3.aG == 22) {
                                int i519 = widget3.P;
                                if (widget3.ae >= 0) {
                                    class_333VarA2.f(iMax, i4);
                                }
                            } else if (widget3.aG == 20) {
                                i7 = widget3.bo;
                                i8 = widget3.P;
                                if (Client.cH != 39975) {
                                    i7 = 100000;
                                } else {
                                    i7 = 100000;
                                }
                                if (widget3.ai == 64071) {
                                    i7 = 100000;
                                }
                                if (widget3.ae >= 0) {
                                    if (widget3.T) {
                                        iMax += Math.max(5, Widget.l(class_446.bI).P / 2) - (i8 / 2);
                                    }
                                    if (iMax >= class_210.l - i8) {
                                        class_333VarA = ItemComposition.a(widget3.ae, i7, 0, i8);
                                        if (class_333VarA != null) {
                                            class_333VarA.f(iMax, i4);
                                        }
                                        if (i7 > 1) {
                                            if (i7 >= 1) {
                                                Client.gh.b(class_492.g, Client.g(i7), i4 + 9, iMax);
                                            }
                                            if (i7 >= 100000) {
                                                Client.gh.b(class_492.c, Client.g(i7), i4 + 9, iMax);
                                            }
                                            if (i7 >= 10000000) {
                                                Client.gh.b(65408, Client.g(i7), i4 + 9, iMax);
                                            }
                                        }
                                    }
                                }
                            } else if (widget3.aG == 11) {
                                class_210.c(widget3.bb, 0, 765, 503, 256 - (widget3.bg & 255), 0);
                            }
                        }
                        if (widget3.aG == 8) {
                            int i520 = 0;
                            int i61 = 0;
                            class_338Var3 = widget3.an;
                            strSubstring5 = widget3.as;
                            while (strSubstring5.length() > 0) {
                                iIndexOf4 = strSubstring5.indexOf("\\n");
                                if (iIndexOf4 != -1) {
                                    strSubstring8 = strSubstring5.substring(0, iIndexOf4);
                                    strSubstring5 = strSubstring5.substring(iIndexOf4 + 2);
                                } else {
                                    strSubstring8 = strSubstring5;
                                    strSubstring5 = "";
                                }
                                if (strSubstring8 == null) {
                                }
                            }
                            i32 = i520 + 6;
                            i33 = i61 + 7;
                            i34 = ((iMax + widget3.P) - 5) - i32;
                            i35 = i4 + widget3.aP + 5;
                            if (i34 < iMax + 5) {
                                i34 = iMax + 5;
                            }
                            if (i34 + i32 > i43 + widget.P) {
                                i34 = (i43 + widget.P) - i32;
                            }
                            if (i35 + i33 > i3 + widget.aP) {
                                i35 = (i3 + widget.aP) - i33;
                            }
                            switch (widget3.au) {
                                case 9217:
                                case 9220:
                                case 9223:
                                case 9226:
                                case 9229:
                                case 9232:
                                case 9235:
                                case 9238:
                                    i34 -= 80;
                                    break;
                                case 9239:
                                    i35 -= 100;
                                    break;
                            }
                            class_210.e(i34, i35, i32, i33, 16777120);
                            class_210.d(i34, i32, i33, 0, i35);
                            str3 = widget3.as;
                            if (class_338Var3 == null) {
                                System.out.println("Nulled: " + widget3.au);
                            }
                            i36 = i35 + class_338Var3.r;
                            i37 = 2;
                            while (true) {
                                i38 = i36 + i37;
                                if (str3.length() > 0) {
                                    iIndexOf3 = str3.indexOf("\\n");
                                    if (iIndexOf3 != -1) {
                                        strSubstring6 = str3.substring(0, iIndexOf3);
                                        strSubstring7 = str3.substring(iIndexOf3 + 2);
                                    } else {
                                        strSubstring6 = str3;
                                        strSubstring7 = "";
                                    }
                                    str3 = strSubstring7;
                                    class_338Var3.a(false, i34 + 3, 0, strSubstring6, i38);
                                    i36 = i38;
                                    i37 = class_338Var3.r + 1;
                                } else {
                                    class_210.c(i42, i39, i41, i40);
                                }
                            }
                        }
                        if (widget3.aG == 12) {
                            if (client.b(widget3)) {
                                class_333Var3 = widget3.aE;
                            } else {
                                class_333Var3 = widget3.E;
                            }
                            if (class_333Var3 != null) {
                                class_333Var3.c(iMax, i4);
                            }
                        } else if (widget3.aG == 9) {
                            client.c(iMax, i4, widget3.as);
                        }
                        if (widget3.aG == 10) {
                            i23 = 0;
                            i24 = 0;
                            class_338Var2 = client.gi;
                            strSubstring = widget3.as;
                            while (strSubstring.length() > 0) {
                                iIndexOf2 = strSubstring.indexOf("\\n");
                                if (iIndexOf2 != -1) {
                                    strSubstring4 = strSubstring.substring(0, iIndexOf2);
                                    strSubstring = strSubstring.substring(iIndexOf2 + 2);
                                } else {
                                    strSubstring4 = strSubstring;
                                    strSubstring = "";
                                }
                                iA = class_338Var2.a(strSubstring4);
                                if (iA > i23) {
                                    i23 = iA;
                                }
                                i24 += class_338Var2.r + 1;
                            }
                            i25 = i23 + 6;
                            i26 = i24 + 7;
                            i27 = ((iMax + widget3.P) - 5) - i25;
                            i28 = i4 + widget3.aP + 5;
                            if (i27 < iMax + 5) {
                                i27 = iMax + 5;
                            }
                            if (i27 + i25 > i43 + widget.P) {
                                i27 = (i43 + widget.P) - i25;
                            }
                            if (i28 + i26 > i3 + widget.aP) {
                                i28 = (i3 + widget.aP) - i26;
                            }
                            if (widget3.bf) {
                                if (i27 + i25 + i43 > 249) {
                                    i27 = (User32.VK_ZOOM - i25) - i43;
                                }
                                if (i28 + i26 + i3 > 261) {
                                    i28 = (User32.VK_OEM_BACKTAB - i26) - i3;
                                }
                            }
                            class_210.a(i26, i28, i27, 16777120, i25);
                            class_210.d(i27, i25, i26, 0, i28);
                            str2 = widget3.as;
                            i29 = i28 + class_338Var2.r;
                            i30 = 2;
                            while (true) {
                                i31 = i29 + i30;
                                if (str2.length() > 0) {
                                    iIndexOf = str2.indexOf("\\n");
                                    if (iIndexOf != -1) {
                                        strSubstring2 = str2.substring(0, iIndexOf);
                                        strSubstring3 = str2.substring(iIndexOf + 2);
                                    } else {
                                        strSubstring2 = str2;
                                        strSubstring3 = "";
                                    }
                                    str2 = strSubstring3;
                                    class_338Var2.a(false, i27 + 3, 0, strSubstring2, i31);
                                    i29 = i31;
                                    i30 = class_338Var2.r + 1;
                                }
                            }
                        }
                        if (Configuration.am) {
                            Client.gl.a(widget3.au, iMax, i4);
                        }
                        while (i22 < class_253.m.size()) {
                            if (!class_253.m.get(i22).e()) {
                            }
                        }
                        class_313.d().a(widget.ak[i46], iMax, i4);
                        if (Configuration.an) {
                            if (widget3.ak != null) {
                                Client.gl.b("@or1@" + widget3.au, iMax, i4, class_492.c, 0);
                            } else {
                                Client.gl.b("@cya@" + widget3.au, iMax, i4, class_492.c, 0);
                            }
                        }
                        if (widget3.bF != null) {
                            widget3.bF.draw(iMax, i4);
                        }
                    }
                }
            }
            class_313.d().a(widget.au, i43, i44);
            class_210.c(i42, i39, i41, i40);
        }
    }

    public static void a(Client client, Widget widget, Widget widget2, int i, int i2) {
        int i3;
        String strSubstring;
        class_338 class_338Var = widget2.an;
        String strSubstring2 = widget2.as;
        if (widget2.au == 47812 && client.gb && client.fN == 31) {
            strSubstring2 = "<img=39> " + client.fB + "*";
        }
        boolean z = false;
        if (client.em == widget2.au || client.ep == widget2.au || client.ef == widget2.au) {
            z = true;
        }
        boolean z2 = false;
        if (client.b(widget2)) {
            i3 = widget2.O;
            if (z && widget2.aj != 0) {
                i3 = widget2.aj;
            }
            if (widget2.Z.length() > 0 && widget2.au != 199) {
                strSubstring2 = widget2.Z;
            }
        } else {
            i3 = widget2.ac;
            if (z && widget2.L != 0) {
                i3 = widget2.L;
            }
        }
        if (widget2.M == 6 && client.eZ) {
            strSubstring2 = "Please wait...";
            i3 = widget2.ac;
        }
        if ((client.gp != -1 || client.en != -1 || widget2.as.contains("Click here to continue")) && (widget.au == client.gp || widget.au == client.en)) {
            if (i3 == 16776960) {
                i3 = 255;
            }
            if (i3 == 49152) {
                z2 = true;
                i3 = 16777215;
            }
        }
        if (Client.cH == 64272 && widget2.ag >= 60000 && widget2.ag <= 65000 && ((widget2.au < 64287 || widget2.au > 64290) && i3 == 16777215)) {
            z2 = true;
            i3 = 16777215;
        }
        if (widget2.bm && i3 == 16777215) {
            z2 = true;
            i3 = widget2.L;
        }
        if (widget2.ag == 1151 || widget2.ag == 12855) {
            switch (i3) {
                case 7040819:
                    i3 = 11495962;
                    break;
                case 16773120:
                    i3 = 16685087;
                    break;
            }
        }
        if (widget2.bp != 0) {
            int i4 = 400;
            int i5 = widget2.br == 0 ? widget2.aP : widget2.br;
            int i6 = 0;
            if (widget2.br != 0 && widget2.br > widget2.aP) {
                i6 = widget2.br - widget2.aP;
            }
            if (widget2.bs > -1) {
                i4 = widget2.bs;
            }
            class_210.b(i5 + (i6 / 2), i2 - (i6 / 2), i - (i4 / 2), widget2.bp, i4 * 2, widget2.bq);
        }
        int i7 = i2;
        int i8 = class_338Var.r;
        while (true) {
            int i9 = i7 + i8;
            if (strSubstring2.length() <= 0) {
                return;
            }
            if (strSubstring2.indexOf(class_147.c) != -1) {
                while (true) {
                    int iIndexOf = strSubstring2.indexOf("%1");
                    if (iIndexOf == -1) {
                        while (true) {
                            int iIndexOf2 = strSubstring2.indexOf("%2");
                            if (iIndexOf2 == -1) {
                                while (true) {
                                    int iIndexOf3 = strSubstring2.indexOf("%3");
                                    if (iIndexOf3 == -1) {
                                        while (true) {
                                            int iIndexOf4 = strSubstring2.indexOf("%4");
                                            if (iIndexOf4 == -1) {
                                                while (true) {
                                                    int iIndexOf5 = strSubstring2.indexOf("%5");
                                                    if (iIndexOf5 != -1) {
                                                        strSubstring2 = strSubstring2.substring(0, iIndexOf5) + client.h(client.a(widget2, 4)) + strSubstring2.substring(iIndexOf5 + 2);
                                                    }
                                                }
                                            } else {
                                                strSubstring2 = strSubstring2.substring(0, iIndexOf4) + client.h(client.a(widget2, 3)) + strSubstring2.substring(iIndexOf4 + 2);
                                            }
                                        }
                                    } else {
                                        strSubstring2 = strSubstring2.substring(0, iIndexOf3) + client.h(client.a(widget2, 2)) + strSubstring2.substring(iIndexOf3 + 2);
                                    }
                                }
                            } else {
                                strSubstring2 = strSubstring2.substring(0, iIndexOf2) + client.h(client.a(widget2, 1)) + strSubstring2.substring(iIndexOf2 + 2);
                            }
                        }
                    } else {
                        strSubstring2 = (widget2.au < 4000 || !(widget2.au <= 5000 || widget2.au == 13921 || widget2.au == 13922 || widget2.au == 12171 || widget2.au == 12172)) ? strSubstring2.substring(0, iIndexOf) + client.tryMove(client.a(widget2, 0)) + strSubstring2.substring(iIndexOf + 2) : strSubstring2.substring(0, iIndexOf) + client.h(client.a(widget2, 0)) + strSubstring2.substring(iIndexOf + 2);
                    }
                }
            }
            boolean zContains = strSubstring2.contains("\\n");
            int iIndexOf6 = strSubstring2.indexOf("\\n");
            if (iIndexOf6 != -1) {
                strSubstring = strSubstring2.substring(0, iIndexOf6);
                strSubstring2 = strSubstring2.substring(iIndexOf6 + 2);
            } else {
                strSubstring = strSubstring2;
                strSubstring2 = "";
            }
            class_324 class_324Var = null;
            if (class_338Var == Client.gh) {
                class_324Var = Client.gl;
            } else if (class_338Var == client.gi) {
                class_324Var = client.gm;
            } else if (class_338Var == Client.gj) {
                class_324Var = client.gn;
            } else if (class_338Var == client.gk) {
                class_324Var = client.go;
            }
            boolean z3 = false;
            boolean z4 = false;
            if (widget2.au == 49988 || widget2.bt) {
                if (Client.br == 49991 || widget2.bt) {
                    z4 = true;
                    if (widget2.bt) {
                        z3 = true;
                    }
                } else {
                    Client.bP = 149;
                    Client.bQ = -1;
                }
                int i10 = 150 - Client.bN;
                if (i10 < 50) {
                    i3 = bk.aS + (1280 * i10);
                } else if (i10 < 100) {
                    i3 = class_492.g - (327680 * (i10 - 50));
                } else if (i10 < 150) {
                    i3 = bk.ao + (5 * (i10 - 100));
                }
            }
            if (widget2.S) {
                if (widget2.T && widget2.ag > 0) {
                    i += Math.max(15, Widget.l(class_446.bI).P - 372);
                }
                if (zContains && Client.cH == 39975) {
                    i9 -= 5;
                }
                if (z4) {
                    Client.gj.a(150 - Client.bP, strSubstring, Client.gg, i9 + 1, i + (widget2.P / 2), 0);
                    Client.gj.a(150 - Client.bP, strSubstring, Client.gg, i9, i + (widget2.P / 2), i3);
                } else if (z3) {
                    Client.gj.b(i + (widget2.P / 2), strSubstring, Client.gg, i9 + 1, 0);
                    Client.gj.b(i + (widget2.P / 2), strSubstring, Client.gg, i9, i3);
                } else {
                    class_324Var.b(strSubstring, i + (widget2.P / 2), i9, i3, widget2.aQ ? 0 : -1, z2);
                }
            } else if (widget2.U) {
                if (widget2.T && widget2.ag > 0) {
                    i += Math.max(15, Widget.l(class_446.bI).P - 10);
                }
                class_324Var.b(strSubstring, i - class_324Var.a(strSubstring, true), i9, i3, widget2.aQ ? 0 : -1);
            } else {
                class_324Var.a(strSubstring, i, i9, i3, widget2.aQ ? 0 : -1, z2);
            }
            i7 = i9;
            i8 = class_338Var.r;
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x04e0  */
    public static void a(Client client, Widget widget, Widget widget2, int i, int i2, int i3, int i4) {
        class_333 class_333Var;
        int i5 = 0;
        if (Configuration.an) {
            client.gn.b("@gre@" + widget2.au, i, i2, class_492.c, 0);
        }
        if (widget2.ay && !class_194.a() && Client.ff % 15 == 0) {
            widget2.az++;
            if (widget2.az >= widget2.ax.length) {
                widget2.az = 0;
            }
        }
        for (int i6 = 0; i6 < widget2.aP; i6++) {
            for (int i7 = 0; i7 < widget2.P; i7++) {
                int i8 = i + (i7 * (32 + widget2.ab));
                int i9 = i2 + (i6 * (32 + widget2.ao));
                int length = i5;
                if (widget2.ay) {
                    length = widget2.az + i5 >= widget2.ax.length ? (widget2.az + i5) - widget2.ax.length : widget2.az + i5;
                }
                if (length < 20) {
                    i8 += widget2.K[length];
                    i9 += widget2.ar[length];
                }
                if (widget2.ax[length] > 0) {
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = widget2.ax[length] - 1;
                    if ((i8 > class_210.l - 32 && i8 < class_210.m && i9 > class_210.j - 32 && i9 < class_210.k) || (client.eA != 0 && client.ey == length)) {
                        int i13 = 0;
                        if (client.gr == 1 && client.gs == length && client.gt == widget2.au) {
                            i13 = 16777215;
                        }
                        if (i13 == 0) {
                            if (i12 == 21071 || i12 == 21676 || i12 == 21665 || i12 == 20558 || i12 == 6200 || i12 == 14523 || i12 == 10524 || i12 == 20539 || i12 == 21095 || i12 == 20807 || i12 == 20798 || i12 == 22085) {
                                client.a(54, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23907) {
                                client.a(213, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 24180) {
                                client.a(74, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 24181) {
                                client.a(55, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 24182) {
                                client.a(71, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22076) {
                                client.a(121, 20L);
                                client.a(54, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22118) {
                                client.a(60, 20L);
                                client.a(75, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23620) {
                                client.a(185, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23621) {
                                client.a(51, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23622) {
                                client.a(61, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23624) {
                                client.a(74, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23625) {
                                client.a(157, 20L);
                                client.a(172, 20L);
                                client.a(76, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23984) {
                                client.a(aU.hq_, 20L);
                                client.a(159, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23626) {
                                client.a(157, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23627) {
                                client.a(148, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23628) {
                                client.a(179, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23629) {
                                client.a(254, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23988) {
                                client.a(197, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23630) {
                                client.a(159, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23631) {
                                client.a(157, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23632) {
                                client.a(159, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23633) {
                                client.a(152, 20L);
                                client.a(172, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23653) {
                                client.a(142, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23635 || i12 == 23638 || i12 == 23650) {
                                client.a(124, 20L);
                                i13 = 16705;
                            }
                            if (i12 >= 21834 && i12 <= 21843) {
                                client.a(60, 20L);
                                client.a(62, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 21805 || i12 == 21781 || i12 == 21773) {
                                client.a(70, 20L);
                                client.a(120, 20L);
                                i13 = 16705;
                            } else if (((i12 == 21779) | (i12 == 21778)) || i12 == 21786 || i12 == 21785 || i12 == 21783 || i12 == 21780 || i12 == 21780 || i12 == 21784 || i12 == 21775 || i12 == 21776 || i12 == 21774 || i12 == 21777 || i12 == 21801 || i12 == 21802 || i12 == 21803 || i12 == 21820) {
                                client.a(70, 20L);
                                client.a(120, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 25022 || i12 == 25023 || i12 == 25024) {
                                client.a(54, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 24222 || i12 == 24223 || i12 == 24224 || i12 == 24220 || i12 == 24212 || i12 == 24209 || i12 == 24208) {
                                client.a(283, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 21880 || i12 == 21940 || i12 == 21899 || i12 == 21946 || i12 == 21924 || i12 == 21923) {
                                client.a(55, 20L);
                                client.a(56, 20L);
                                client.a(72, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22843 || i12 == 6203 || i12 == 22949 || i12 == 22100) {
                                client.a(61, 20L);
                                client.a(62, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22852 || i12 == 22850) {
                                client.a(40, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22034 || i12 == 22035) {
                                client.a(87, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23674) {
                                client.a(61, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22040 || i12 == 22059 || i12 == 23660 || i12 == 23661 || i12 == 23662) {
                                client.a(aU.hu_, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22825) {
                                client.a(58, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 20701 || i12 == 24175 || i12 == 24179) {
                                client.a(53, 20L);
                                client.a(55, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22033) {
                                client.a(80, 20L);
                                client.a(62, 20L);
                                client.a(63, 20L);
                                client.a(34, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22786 || i12 == 22779 || i12 == 22780 || i12 == 22799 || i12 == 22777 || i12 == 22778 || i12 == 22786 || i12 == 22787 || i12 == 20955 || i12 == 22801 || i12 == 22803 || i12 == 22804 || i12 == 22810 || i12 == 20737 || i12 == 22853 || i12 == 22851) {
                                client.a(56, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22790 || i12 == 22789 || i12 == 22783 || i12 == 22791 || i12 == 22789 || i12 == 22784 || i12 == 22798 || i12 == 22781 || i12 == 22782 || i12 == 22800 || i12 == 22686 || i12 == 22805 || i12 == 22806 || i12 == 22809 || i12 == 21665 || i12 == 21676 || i12 == 21605) {
                                client.a(70, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 21732) {
                                client.a(56, 20L);
                                client.a(54, 20L);
                                i13 = 16705;
                            }
                            if ((i12 >= 21710 && i12 <= 21712) || i12 == 6202 || i12 == 21702 || i12 == 21704 || i12 == 21709 || i12 == 22878 || i12 == 22879 || ((i12 >= 21706 && i12 <= 21708) || i12 == 22123 || i12 == 22125 || i12 == 22129)) {
                                client.a(54, 20L);
                                client.a(60, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 21702) {
                                client.a(56, 20L);
                                client.a(63, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 21691 || i12 == 21692 || i12 == 21690 || i12 == 21699 || i12 == 21700 || i12 == 23229) {
                                client.a(60, 20L);
                                client.a(68, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23218 || i12 == 23219 || i12 == 23210 || i12 == 23211 || i12 == 23212 || i12 == 23212 || i12 == 23224) {
                                client.a(60, 20L);
                                client.a(61, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23203) {
                                client.a(75, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 23205 || i12 == 23209 || i12 == 23217) {
                                client.a(60, 20L);
                                client.a(68, 20L);
                                client.a(110, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 21069) {
                                client.a(56, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 16000) {
                                client.a(34, 50L);
                                i13 = 16705;
                            }
                            if (i12 == 25424) {
                                client.a(58, 50L);
                                i13 = 16705;
                            }
                            if (i12 >= 16001 && i12 <= 16006) {
                                client.a(34, 50L);
                                i13 = 16705;
                            }
                            if (i12 == 16007) {
                                client.a(208, 50L);
                                client.a(249, 50L);
                                client.a(240, 50L);
                                client.a(34, 50L);
                                i13 = 16705;
                            }
                            if (i12 == 21040 || i12 == 21133 || i12 == 21134 || i12 == 21563 || i12 == 23072 || i12 == 22067 || i12 == 23073 || i12 == 23074 || i12 == 23075 || i12 == 23071 || i12 == 23069 || i12 == 23067 || i12 == 23068 || i12 == 22023 || i12 == 22025 || i12 == 22024 || i12 == 22014) {
                                client.a(62, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22055 || i12 == 22056 || i12 == 22015 || i12 == 22027) {
                                client.a(109, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 22028) {
                                client.a(75, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 20743 || i12 == 21072) {
                                client.a(62, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 20731 || i12 == 21087 || i3 == 20701) {
                                client.a(53, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 15005 || i12 == 21041 || i12 == 21605) {
                                client.a(58, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 20722 || i12 == 21675) {
                                client.a(60, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 21674) {
                                client.a(61, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 20695) {
                                client.a(58, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 20558) {
                                client.a(52, 20L);
                                i13 = 16705;
                            }
                            if (i12 == 20540 || i12 == 21063) {
                                client.a(55, 40L);
                                i13 = 16705;
                            }
                            if (i12 == 20541) {
                                client.a(55, 24L);
                                i13 = 16705;
                            }
                            if (i12 == 20524 || i12 == 20577 || i12 == 13999) {
                                client.a(55, 20L);
                                i13 = 16705;
                            }
                        }
                        class_333 class_333VarA = ItemComposition.a(i12, widget2.av[length], i13, widget2.bB);
                        if (class_333VarA != null) {
                            if (client.eA != 0 && client.ey == length && client.ex == widget2.au) {
                                i10 = Client.hP - client.eB;
                                i11 = Client.hQ - client.eC;
                                if (i10 < 5 && i10 > -5) {
                                    i10 = 0;
                                }
                                if (i11 < 5 && i11 > -5) {
                                    i11 = 0;
                                }
                                if (client.dT < Configuration.bd) {
                                    i10 = 0;
                                    i11 = 0;
                                }
                                if (widget2.au == 5382) {
                                    class_210.j -= 50;
                                    class_210.i += 50;
                                }
                                class_333VarA.e(i8 + i10, i9 + i11);
                                if ((i12 >= 21834 && i12 <= 21843) || i12 == 24043 || i12 == 24237) {
                                    client.J[3].f((i8 + i10) - ((i12 == 21834 || i12 == 21838) ? 3 : 5), (i9 + i11) - 1);
                                }
                                if (i12 == 24175) {
                                    Client.fE[82].f(i8 + i10 + 15, i9 + i11 + 20);
                                }
                                if (i12 >= 23673 && i12 <= 23674) {
                                    Client.fE[93].f((i8 + i10) - 3, (i9 + i11) - 1);
                                }
                                if (class_113.b(i12)) {
                                    class_113.a(i12, i8 + i10, i9 + i11);
                                }
                                if (i12 == 21964) {
                                    client.o.a[6].f((i8 + i10) - 3, (i9 + i11) - 1);
                                }
                                if (i12 == 21963) {
                                    client.o.a[4].f((i8 + i10) - 3, (i9 + i11) - 1);
                                }
                                if (i12 == 23063) {
                                    client.o.a[0].f((i8 + i10) - 1, (i9 + i11) - 1);
                                }
                                if (i9 + i11 < class_210.j && widget.V > 0) {
                                    int i14 = (client.dE * ((class_210.j - i9) - i11)) / 3;
                                    if (i14 > client.dE * 10) {
                                        i14 = client.dE * 10;
                                    }
                                    if (i14 > widget.V) {
                                        i14 = widget.V;
                                    }
                                    widget.V -= i14;
                                    client.eC += i14;
                                }
                                if (i9 + i11 + 32 > class_210.k && widget.V < widget.aF - widget.aP) {
                                    int i15 = (client.dE * (((i9 + i11) + 32) - class_210.k)) / 3;
                                    if (i15 > client.dE * 10) {
                                        i15 = client.dE * 10;
                                    }
                                    if (i15 > (widget.aF - widget.aP) - widget.V) {
                                        i15 = (widget.aF - widget.aP) - widget.V;
                                    }
                                    widget.V += i15;
                                    client.eC -= i15;
                                }
                            } else if (client.fX != 0 && client.fW == length && client.fV == widget2.au) {
                                class_333VarA.e(i8, i9);
                                if ((i12 >= 21834 && i12 <= 21843) || i12 == 24043 || i12 == 24237) {
                                    client.J[3].f(i8 - ((i12 == 21834 || i12 == 21838) ? 3 : 5), i9 - 1);
                                }
                                if (i12 == 24175) {
                                    Client.fE[82].f(i8 + 0 + 15, i9 + 0 + 20);
                                }
                                if (i12 >= 23673 && i12 <= 23674) {
                                    Client.fE[93].f((i8 + 0) - 3, (i9 + 0) - 1);
                                }
                                if (class_113.b(i12)) {
                                    class_113.a(i12, i8 + 0, i9 + 0);
                                }
                                if (i12 == 21964) {
                                    client.o.a[6].f(i8 - 3, i9 - 1);
                                }
                                if (i12 == 21963) {
                                    client.o.a[4].f(i8 - 3, i9 - 1);
                                }
                                if (i12 == 23063) {
                                    client.o.a[0].f(i8 - 1, i9 - 1);
                                }
                            } else {
                                if (Client.cH == 60600 && widget2.au == 60602 && class_233.C.get(Integer.valueOf(length)) != null) {
                                    class_376.c.c(i8 - 6, i9 - 5);
                                }
                                if (Client.cH == 60200) {
                                    if (widget2.au == 60255 || widget2.au == 60258 || widget2.au == 60261) {
                                        class_376.d.c(i8 - 6, i9 - 6);
                                    }
                                    if (widget2.au == 60082 || widget2.au == 60085) {
                                        if (i5 == 1) {
                                            class_376.c.c(i8 - 6, i9 - 6);
                                        } else {
                                            class_376.d.c(i8 - 6, i9 - 6);
                                        }
                                    }
                                    if (widget2.au == 60088) {
                                        if (i5 == 2) {
                                            class_376.c.c(i8 - 6, i9 - 6);
                                        } else {
                                            class_376.d.c(i8 - 6, i9 - 6);
                                        }
                                    }
                                }
                                if (Client.cH == 50600 && widget2.au == 50615 && length == client.P) {
                                    class_376.c.c(i8 - 6, i9 - 5);
                                }
                                boolean z = false;
                                if (Client.cH == 3824 && widget2.au == 3900 && client.ad.size() > 0) {
                                    boolean z2 = false;
                                    Iterator<Integer> it = client.ad.iterator();
                                    while (it.hasNext()) {
                                        if (it.next().intValue() == length) {
                                            z2 = true;
                                        }
                                    }
                                    if (!z2) {
                                        z = true;
                                    }
                                }
                                if (Client.cH == 36000 && class_420.bH && widget2.av[length] == 0) {
                                    z = true;
                                }
                                if ((Client.cH == 3824 || Client.cH == 54300) && widget2.av[length] == 0) {
                                    z = true;
                                }
                                if (widget2.bC && widget2.av[length] == 0) {
                                    z = true;
                                }
                                if (((Client.cH == 60600 || Client.cH == 23000) && widget2.av[length] == 0) || ((Client.cH == 50600 && widget2.au == 50615 && length < client.P) || z)) {
                                    class_333VarA.g(i8, i9, Client.cH == 36000 ? 50 : 100);
                                    if ((i12 >= 21834 && i12 <= 21843) || i12 == 24043 || i12 == 24237) {
                                        client.J[3].g(i8 - ((i12 == 21834 || i12 == 21838) ? 3 : 5), i9 - 1, 100);
                                    }
                                    if (i12 == 24175) {
                                        Client.fE[82].f(i8 + 0 + 15, i9 + 0 + 20);
                                    }
                                    if (i12 >= 23673 && i12 <= 23674) {
                                        Client.fE[93].g((i8 + 0) - 3, (i9 + 0) - 1, 100);
                                    }
                                    if (class_113.b(i12)) {
                                        class_113.a(i12, i8 + 0, i9 + 0);
                                    }
                                    if (i12 == 21964) {
                                        client.o.a[6].g(i8 - 3, i9 - 1, 100);
                                    }
                                    if (i12 == 21963) {
                                        client.o.a[4].g(i8 - 3, i9 - 1, 100);
                                    }
                                    if (i12 == 23063) {
                                        client.o.a[0].g(i8 - 1, i9 - 1, 100);
                                    }
                                } else if (widget2.au == 26706 && (widget2.ax[length] == 20692 || widget2.ax[length] == 23149 || widget2.ax[length] == 22103 || widget2.ax[length] == 22104 || widget2.ax[length] == 22530 || widget2.ax[length] == 22531 || widget2.ax[length] == 24246 || widget2.ax[length] == 24247)) {
                                    class_333VarA.g(i8, i9, 120);
                                    if ((i12 >= 21834 && i12 <= 21843) || i12 == 24043 || i12 == 24237) {
                                        client.J[3].g(i8 - ((i12 == 21834 || i12 == 21838) ? 3 : 5), i9 - 1, 100);
                                    }
                                    if (i12 == 24175) {
                                        Client.fE[82].f(i8 + 0 + 15, i9 + 0 + 20);
                                    }
                                    if (i12 >= 23673 && i12 <= 23674) {
                                        Client.fE[93].g((i8 + 0) - 3, (i9 + 0) - 1, 100);
                                    }
                                    if (class_113.b(i12)) {
                                        class_113.a(i12, i8 + 0, i9 + 0);
                                    }
                                    if (i12 == 21964) {
                                        client.o.a[6].g(i8 - 3, i9 - 1, 100);
                                    }
                                    if (i12 == 21963) {
                                        client.o.a[4].g(i8 - 3, i9 - 1, 100);
                                    }
                                    if (i12 == 23063) {
                                        client.o.a[0].g(i8 - 1, i9 - 1, 100);
                                    }
                                } else {
                                    class_333VarA.f(i8, i9);
                                    if (Client.cH == 17100 && widget2.au == 10494 && class_424.d.contains(Integer.valueOf(length))) {
                                        class_424.c.g(i8 - 3, i9 - 1, 175);
                                    }
                                    if ((i12 >= 21834 && i12 <= 21843) || i12 == 24043 || i12 == 24237) {
                                        client.J[3].f(i8 - ((i12 == 21834 || i12 == 21838) ? 3 : 5), i9 - 1);
                                    }
                                    if (i12 == 24175) {
                                        Client.fE[82].f(i8 + 0 + 15, i9 + 0 + 20);
                                    }
                                    if (i12 >= 23673 && i12 <= 23674) {
                                        Client.fE[93].f((i8 + 0) - 3, (i9 + 0) - 1);
                                    }
                                    if (class_113.b(i12)) {
                                        class_113.a(i12, i8 + 0, i9 + 0);
                                    }
                                    if (i12 == 21964) {
                                        client.o.a[6].f(i8 - 3, i9 - 1);
                                    }
                                    if (i12 == 21963) {
                                        client.o.a[4].f(i8 - 3, i9 - 1);
                                    }
                                    if (i12 == 23063) {
                                        client.o.a[0].f(i8 - 1, i9 - 1);
                                    }
                                }
                            }
                            if (class_333VarA.r == 33 || widget2.av[length] != 1 || widget2.bD) {
                                int i16 = widget2.av[length];
                                if (Client.cH == 23000 && i16 == 0) {
                                    Client.gh.b(class_492.g, Client.g(i16), i9 + 9 + i11, i8 + i10);
                                }
                                int i17 = widget2.bB < 32 ? ((32 - widget2.bB) / 2) - 3 : 0;
                                if (!(widget2.au == 36025 && i16 == 1)) {
                                    if (i16 >= 10000000) {
                                        Client.gh.b(65408, Client.g(i16), i9 + 9 + i11 + i17, i8 + i10);
                                    } else if (i16 >= 100000) {
                                        Client.gh.b(class_492.c, Client.g(i16), i9 + 9 + i11 + i17, i8 + i10);
                                    } else if (i16 >= 1 || widget2.bD) {
                                        Client.gh.b(class_492.g, Client.g(i16), i9 + 9 + i11 + i17, i8 + i10);
                                    }
                                }
                            }
                            if (widget2.aw != null && widget2.aw[length] != null) {
                                Client.gl.c(widget2.aw[length], i8 + (class_333VarA.n / 2), i9 + class_333VarA.o + 8, class_492.e, 0);
                            }
                            if (widget2.au == 3214 || widget2.au == 2006 || widget2.au == 3823 || widget2.au == 30074 || widget2.au == 3322 || widget2.au == 26706 || widget2.au == 1688) {
                                int i18 = widget2.ax[length] - 1;
                                if (class_560.d.r_(i18)) {
                                    int iC = class_560.d.c(i18);
                                    Client.gl.c(iC == -1 ? "?" : String.valueOf(iC), i8 + 8 + i10, i9 + 10 + i11, class_492.c, 0);
                                }
                            }
                        }
                    }
                } else if (widget2.G != null && length < 20 && (class_333Var = widget2.G[length]) != null) {
                    class_333Var.f(i8, i9);
                }
                if (Client.cH == 50600 && widget2.au == 50615 && widget2.ax[length] > 0 && length < client.P) {
                    Client.gl.c("<img=24>", i8 + 28, i9 + 32, class_492.c, 0);
                }
                i5++;
            }
        }
    }
}
