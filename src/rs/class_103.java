package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_103.class */
public class class_103 {
    public static class_30 a = new class_30(20);
    public static class_30 b = new class_30(20);

    public static void a() {
        a.a();
        b.a();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028f  */
    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02be  */
    /* JADX WARN: Code duplicated, block: B:112:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:116:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:123:0x0300  */
    /* JADX WARN: Code duplicated, block: B:124:0x0306  */
    /* JADX WARN: Code duplicated, block: B:126:0x030b  */
    /* JADX WARN: Code duplicated, block: B:128:0x031c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0320  */
    /* JADX WARN: Code duplicated, block: B:132:0x0329  */
    /* JADX WARN: Code duplicated, block: B:134:0x0338  */
    /* JADX WARN: Code duplicated, block: B:135:0x033c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x026c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0271  */
    /* JADX WARN: Code duplicated, block: B:96:0x0282  */
    /* JADX WARN: Code duplicated, block: B:97:0x0286  */
    public static class_333 a(class_104 class_104Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr2;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr3;
        int i15;
        int i16;
        int i17;
        int i18;
        class_30 class_30Var = null;
        switch (class_105.a[class_104Var.ordinal()]) {
            case 1:
                class_30Var = a;
                break;
            case 2:
                class_30Var = b;
                break;
        }
        class_333 class_333Var = (class_333) class_30Var.a(i);
        if (class_333Var != null && class_333Var.s != i2 && class_333Var.s != -1) {
            class_333Var.b();
            class_333Var = null;
        }
        if (class_333Var != null) {
            return class_333Var;
        }
        ColorUtility colorUtilityA = null;
        int i19 = 0;
        switch (class_105.a[class_104Var.ordinal()]) {
            case 1:
                class_102 class_102VarC = class_102.c(i);
                if (class_102VarC == null) {
                    return null;
                }
                colorUtilityA = class_102VarC.b();
                i19 = 25;
                break;
                break;
            case 2:
                ObjectComposition.I = true;
                try {
                    ObjectComposition objectCompositionC = ObjectComposition.c(i);
                    if (objectCompositionC == null) {
                        ObjectComposition.I = false;
                        return null;
                    }
                    colorUtilityA = objectCompositionC.a(10, -1, 0, -1);
                    if (colorUtilityA == null) {
                        ObjectComposition.I = false;
                        return null;
                    }
                    i19 = colorUtilityA.g / 2;
                    ObjectComposition.I = false;
                } catch (Throwable th) {
                    ObjectComposition.I = false;
                    throw th;
                }
                break;
        }
        if (colorUtilityA == null) {
            return null;
        }
        int i20 = i2 > 32 ? i2 : 32;
        class_333 class_333Var2 = new class_333(i20, i20);
        int i21 = class_332.s;
        int i22 = class_332.t;
        int[] iArr4 = class_332.x;
        int[] iArr5 = class_210.g;
        int i23 = class_210.h;
        int i24 = class_210.i;
        int i25 = class_210.l;
        int i26 = class_210.m;
        int i27 = class_210.j;
        int i28 = class_210.k;
        class_332.p = false;
        class_332.q = false;
        class_210.a(i20, i20, class_333Var2.m, (float[]) null);
        class_210.a(0, 0, i20, i20, 0, true);
        class_332.f();
        int iFloor = (int) Math.floor(2750 * (32.0f / i2));
        int i29 = (class_332.v[40] * iFloor) >> 16;
        int i30 = (class_332.w[40] * iFloor) >> 16;
        class_332.h = true;
        try {
            if (class_104Var == class_104.a) {
                colorUtilityA.b(64, 768, -50, -10, -50, true);
            }
            colorUtilityA.a(1882, 0, 40, 0, i29 + i19, i30 + i19);
            class_332.h = false;
            for (int i31 = i2 > 32 ? i2 - 1 : 31; i31 >= 0; i31--) {
                for (int i32 = i2 > 32 ? i2 - 1 : 31; i32 >= 0; i32--) {
                    if (class_333Var2.m[i31 + (i32 * (i2 > 32 ? i2 : 32))] == 0) {
                        if (i31 > 0) {
                            if (class_333Var2.m[(i31 - 1) + (i32 * (i2 > 32 ? i2 : 32))] > 1) {
                                class_333Var2.m[i31 + (i32 * (i2 > 32 ? i2 : 32))] = 0;
                            } else if (i32 > 0) {
                                iArr3 = class_333Var2.m;
                                i15 = i31;
                                i16 = i32 - 1;
                                if (i2 > 32) {
                                    i17 = i2;
                                } else {
                                    i17 = 32;
                                }
                                if (iArr3[i15 + (i16 * i17)] > 1) {
                                    int[] iArr6 = class_333Var2.m;
                                    int i33 = i31;
                                    int i34 = i32;
                                    if (i2 > 32) {
                                        i18 = i2;
                                    } else {
                                        i18 = 32;
                                    }
                                    iArr6[i33 + (i34 * i18)] = 0;
                                } else {
                                    i3 = i31;
                                    if (i2 > 32) {
                                        i4 = i2 - 1;
                                    } else {
                                        i4 = 31;
                                    }
                                    if (i3 < i4) {
                                        iArr2 = class_333Var2.m;
                                        i11 = i31 + 1;
                                        i12 = i32;
                                        if (i2 > 32) {
                                            i13 = i2;
                                        } else {
                                            i13 = 32;
                                        }
                                        if (iArr2[i11 + (i12 * i13)] > 1) {
                                            int[] iArr7 = class_333Var2.m;
                                            int i35 = i31;
                                            int i36 = i32;
                                            if (i2 > 32) {
                                                i14 = i2;
                                            } else {
                                                i14 = 32;
                                            }
                                            iArr7[i35 + (i36 * i14)] = 0;
                                        } else {
                                            i5 = i32;
                                            if (i2 > 32) {
                                                i6 = i2 - 1;
                                            } else {
                                                i6 = 31;
                                            }
                                            if (i5 < i6) {
                                                iArr = class_333Var2.m;
                                                i7 = i31;
                                                i8 = i32 + 1;
                                                if (i2 > 32) {
                                                    i9 = i2;
                                                } else {
                                                    i9 = 32;
                                                }
                                                if (iArr[i7 + (i8 * i9)] > 1) {
                                                    int[] iArr8 = class_333Var2.m;
                                                    int i37 = i31;
                                                    int i38 = i32;
                                                    if (i2 > 32) {
                                                        i10 = i2;
                                                    } else {
                                                        i10 = 32;
                                                    }
                                                    iArr8[i37 + (i38 * i10)] = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        i5 = i32;
                                        if (i2 > 32) {
                                            i6 = i2 - 1;
                                        } else {
                                            i6 = 31;
                                        }
                                        if (i5 < i6) {
                                            iArr = class_333Var2.m;
                                            i7 = i31;
                                            i8 = i32 + 1;
                                            if (i2 > 32) {
                                                i9 = i2;
                                            } else {
                                                i9 = 32;
                                            }
                                            if (iArr[i7 + (i8 * i9)] > 1) {
                                                int[] iArr9 = class_333Var2.m;
                                                int i39 = i31;
                                                int i310 = i32;
                                                if (i2 > 32) {
                                                    i10 = i2;
                                                } else {
                                                    i10 = 32;
                                                }
                                                iArr9[i39 + (i310 * i10)] = 0;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i3 = i31;
                                if (i2 > 32) {
                                    i4 = i2 - 1;
                                } else {
                                    i4 = 31;
                                }
                                if (i3 < i4) {
                                    iArr2 = class_333Var2.m;
                                    i11 = i31 + 1;
                                    i12 = i32;
                                    if (i2 > 32) {
                                        i13 = i2;
                                    } else {
                                        i13 = 32;
                                    }
                                    if (iArr2[i11 + (i12 * i13)] > 1) {
                                        int[] iArr10 = class_333Var2.m;
                                        int i311 = i31;
                                        int i312 = i32;
                                        if (i2 > 32) {
                                            i14 = i2;
                                        } else {
                                            i14 = 32;
                                        }
                                        iArr10[i311 + (i312 * i14)] = 0;
                                    } else {
                                        i5 = i32;
                                        if (i2 > 32) {
                                            i6 = i2 - 1;
                                        } else {
                                            i6 = 31;
                                        }
                                        if (i5 < i6) {
                                            iArr = class_333Var2.m;
                                            i7 = i31;
                                            i8 = i32 + 1;
                                            if (i2 > 32) {
                                                i9 = i2;
                                            } else {
                                                i9 = 32;
                                            }
                                            if (iArr[i7 + (i8 * i9)] > 1) {
                                                int[] iArr11 = class_333Var2.m;
                                                int i313 = i31;
                                                int i314 = i32;
                                                if (i2 > 32) {
                                                    i10 = i2;
                                                } else {
                                                    i10 = 32;
                                                }
                                                iArr11[i313 + (i314 * i10)] = 0;
                                            }
                                        }
                                    }
                                } else {
                                    i5 = i32;
                                    if (i2 > 32) {
                                        i6 = i2 - 1;
                                    } else {
                                        i6 = 31;
                                    }
                                    if (i5 < i6) {
                                        iArr = class_333Var2.m;
                                        i7 = i31;
                                        i8 = i32 + 1;
                                        if (i2 > 32) {
                                            i9 = i2;
                                        } else {
                                            i9 = 32;
                                        }
                                        if (iArr[i7 + (i8 * i9)] > 1) {
                                            int[] iArr12 = class_333Var2.m;
                                            int i315 = i31;
                                            int i316 = i32;
                                            if (i2 > 32) {
                                                i10 = i2;
                                            } else {
                                                i10 = 32;
                                            }
                                            iArr12[i315 + (i316 * i10)] = 0;
                                        }
                                    }
                                }
                            }
                        } else if (i32 > 0) {
                            iArr3 = class_333Var2.m;
                            i15 = i31;
                            i16 = i32 - 1;
                            if (i2 > 32) {
                                i17 = i2;
                            } else {
                                i17 = 32;
                            }
                            if (iArr3[i15 + (i16 * i17)] > 1) {
                                int[] iArr13 = class_333Var2.m;
                                int i317 = i31;
                                int i318 = i32;
                                if (i2 > 32) {
                                    i18 = i2;
                                } else {
                                    i18 = 32;
                                }
                                iArr13[i317 + (i318 * i18)] = 0;
                            } else {
                                i3 = i31;
                                if (i2 > 32) {
                                    i4 = i2 - 1;
                                } else {
                                    i4 = 31;
                                }
                                if (i3 < i4) {
                                    iArr2 = class_333Var2.m;
                                    i11 = i31 + 1;
                                    i12 = i32;
                                    if (i2 > 32) {
                                        i13 = i2;
                                    } else {
                                        i13 = 32;
                                    }
                                    if (iArr2[i11 + (i12 * i13)] > 1) {
                                        int[] iArr14 = class_333Var2.m;
                                        int i319 = i31;
                                        int i3110 = i32;
                                        if (i2 > 32) {
                                            i14 = i2;
                                        } else {
                                            i14 = 32;
                                        }
                                        iArr14[i319 + (i3110 * i14)] = 0;
                                    } else {
                                        i5 = i32;
                                        if (i2 > 32) {
                                            i6 = i2 - 1;
                                        } else {
                                            i6 = 31;
                                        }
                                        if (i5 < i6) {
                                            iArr = class_333Var2.m;
                                            i7 = i31;
                                            i8 = i32 + 1;
                                            if (i2 > 32) {
                                                i9 = i2;
                                            } else {
                                                i9 = 32;
                                            }
                                            if (iArr[i7 + (i8 * i9)] > 1) {
                                                int[] iArr15 = class_333Var2.m;
                                                int i3111 = i31;
                                                int i3112 = i32;
                                                if (i2 > 32) {
                                                    i10 = i2;
                                                } else {
                                                    i10 = 32;
                                                }
                                                iArr15[i3111 + (i3112 * i10)] = 0;
                                            }
                                        }
                                    }
                                } else {
                                    i5 = i32;
                                    if (i2 > 32) {
                                        i6 = i2 - 1;
                                    } else {
                                        i6 = 31;
                                    }
                                    if (i5 < i6) {
                                        iArr = class_333Var2.m;
                                        i7 = i31;
                                        i8 = i32 + 1;
                                        if (i2 > 32) {
                                            i9 = i2;
                                        } else {
                                            i9 = 32;
                                        }
                                        if (iArr[i7 + (i8 * i9)] > 1) {
                                            int[] iArr16 = class_333Var2.m;
                                            int i3113 = i31;
                                            int i3114 = i32;
                                            if (i2 > 32) {
                                                i10 = i2;
                                            } else {
                                                i10 = 32;
                                            }
                                            iArr16[i3113 + (i3114 * i10)] = 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            i3 = i31;
                            if (i2 > 32) {
                                i4 = i2 - 1;
                            } else {
                                i4 = 31;
                            }
                            if (i3 < i4) {
                                iArr2 = class_333Var2.m;
                                i11 = i31 + 1;
                                i12 = i32;
                                if (i2 > 32) {
                                    i13 = i2;
                                } else {
                                    i13 = 32;
                                }
                                if (iArr2[i11 + (i12 * i13)] > 1) {
                                    int[] iArr17 = class_333Var2.m;
                                    int i3115 = i31;
                                    int i3116 = i32;
                                    if (i2 > 32) {
                                        i14 = i2;
                                    } else {
                                        i14 = 32;
                                    }
                                    iArr17[i3115 + (i3116 * i14)] = 0;
                                } else {
                                    i5 = i32;
                                    if (i2 > 32) {
                                        i6 = i2 - 1;
                                    } else {
                                        i6 = 31;
                                    }
                                    if (i5 < i6) {
                                        iArr = class_333Var2.m;
                                        i7 = i31;
                                        i8 = i32 + 1;
                                        if (i2 > 32) {
                                            i9 = i2;
                                        } else {
                                            i9 = 32;
                                        }
                                        if (iArr[i7 + (i8 * i9)] > 1) {
                                            int[] iArr18 = class_333Var2.m;
                                            int i3117 = i31;
                                            int i3118 = i32;
                                            if (i2 > 32) {
                                                i10 = i2;
                                            } else {
                                                i10 = 32;
                                            }
                                            iArr18[i3117 + (i3118 * i10)] = 0;
                                        }
                                    }
                                }
                            } else {
                                i5 = i32;
                                if (i2 > 32) {
                                    i6 = i2 - 1;
                                } else {
                                    i6 = 31;
                                }
                                if (i5 < i6) {
                                    iArr = class_333Var2.m;
                                    i7 = i31;
                                    i8 = i32 + 1;
                                    if (i2 > 32) {
                                        i9 = i2;
                                    } else {
                                        i9 = 32;
                                    }
                                    if (iArr[i7 + (i8 * i9)] > 1) {
                                        int[] iArr19 = class_333Var2.m;
                                        int i3119 = i31;
                                        int i31110 = i32;
                                        if (i2 > 32) {
                                            i10 = i2;
                                        } else {
                                            i10 = 32;
                                        }
                                        iArr19[i3119 + (i31110 * i10)] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i2 <= 32) {
                for (int i40 = i2 > 32 ? i2 - 1 : 31; i40 >= 0; i40--) {
                    for (int i41 = i2 > 32 ? i2 - 1 : 31; i41 >= 0; i41--) {
                        if (class_333Var2.m[i40 + (i41 * (i2 > 32 ? i2 : 32))] == 0 && i40 > 0 && i41 > 0 && class_333Var2.m[(i40 - 1) + ((i41 - 1) * 32)] > 0) {
                            class_333Var2.m[i40 + (i41 * (i2 > 32 ? i2 : 32))] = 3153952;
                        }
                    }
                }
            }
            class_30Var.a(class_333Var2, i);
            class_210.a(i23, i24, iArr5, (float[]) null);
            class_210.c(i28, i25, i26, i27);
            class_332.s = i21;
            class_332.t = i22;
            class_332.x = iArr4;
            class_332.p = true;
            class_332.q = true;
            class_333Var2.r = i2;
            class_333Var2.s = i2;
            class_333Var2.h = Integer.valueOf(i2);
            return class_333Var2;
        } catch (Throwable th2) {
            class_332.h = false;
            throw th2;
        }
    }
}
