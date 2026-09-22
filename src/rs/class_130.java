package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_130.class */
public final class class_130 {
    private final int b = 0;
    private final int c = 0;
    private final int d = 104;
    private final int e = 104;
    public final int[][] a = new int[this.d][this.e];

    public class_130() {
        a();
    }

    public void a() {
        for (int i = 0; i < this.d; i++) {
            for (int i2 = 0; i2 < this.e; i2++) {
                if (i == 0 || i2 == 0 || i == this.d - 1 || i2 == this.e - 1) {
                    this.a[i][i2] = 16777215;
                } else {
                    this.a[i][i2] = 16777216;
                }
            }
        }
    }

    public void a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i3 - this.b;
        int i6 = i - this.c;
        if (i4 == 0) {
            if (i2 == 0) {
                a(i5, i6, 128);
                a(i5 - 1, i6, 8);
            }
            if (i2 == 1) {
                a(i5, i6, 2);
                a(i5, i6 + 1, 32);
            }
            if (i2 == 2) {
                a(i5, i6, 8);
                a(i5 + 1, i6, 128);
            }
            if (i2 == 3) {
                a(i5, i6, 32);
                a(i5, i6 - 1, 2);
            }
        }
        if (i4 == 1 || i4 == 3) {
            if (i2 == 0) {
                a(i5, i6, 1);
                a(i5 - 1, i6 + 1, 16);
            }
            if (i2 == 1) {
                a(i5, i6, 4);
                a(i5 + 1, i6 + 1, 64);
            }
            if (i2 == 2) {
                a(i5, i6, 16);
                a(i5 + 1, i6 - 1, 1);
            }
            if (i2 == 3) {
                a(i5, i6, 64);
                a(i5 - 1, i6 - 1, 4);
            }
        }
        if (i4 == 2) {
            if (i2 == 0) {
                a(i5, i6, 130);
                a(i5 - 1, i6, 8);
                a(i5, i6 + 1, 32);
            }
            if (i2 == 1) {
                a(i5, i6, 10);
                a(i5, i6 + 1, 32);
                a(i5 + 1, i6, 128);
            }
            if (i2 == 2) {
                a(i5, i6, 40);
                a(i5 + 1, i6, 128);
                a(i5, i6 - 1, 2);
            }
            if (i2 == 3) {
                a(i5, i6, 160);
                a(i5, i6 - 1, 2);
                a(i5 - 1, i6, 8);
            }
        }
        if (z) {
            if (i4 == 0) {
                if (i2 == 0) {
                    a(i5, i6, 65536);
                    a(i5 - 1, i6, 4096);
                }
                if (i2 == 1) {
                    a(i5, i6, 1024);
                    a(i5, i6 + 1, 16384);
                }
                if (i2 == 2) {
                    a(i5, i6, 4096);
                    a(i5 + 1, i6, 65536);
                }
                if (i2 == 3) {
                    a(i5, i6, 16384);
                    a(i5, i6 - 1, 1024);
                }
            }
            if (i4 == 1 || i4 == 3) {
                if (i2 == 0) {
                    a(i5, i6, 512);
                    a(i5 - 1, i6 + 1, 8192);
                }
                if (i2 == 1) {
                    a(i5, i6, 2048);
                    a(i5 + 1, i6 + 1, 32768);
                }
                if (i2 == 2) {
                    a(i5, i6, 8192);
                    a(i5 + 1, i6 - 1, 512);
                }
                if (i2 == 3) {
                    a(i5, i6, 32768);
                    a(i5 - 1, i6 - 1, 2048);
                }
            }
            if (i4 == 2) {
                if (i2 == 0) {
                    a(i5, i6, 66560);
                    a(i5 - 1, i6, 4096);
                    a(i5, i6 + 1, 16384);
                }
                if (i2 == 1) {
                    a(i5, i6, 5120);
                    a(i5, i6 + 1, 16384);
                    a(i5 + 1, i6, 65536);
                }
                if (i2 == 2) {
                    a(i5, i6, 20480);
                    a(i5 + 1, i6, 65536);
                    a(i5, i6 - 1, 1024);
                }
                if (i2 == 3) {
                    a(i5, i6, 81920);
                    a(i5, i6 - 1, 1024);
                    a(i5 - 1, i6, 4096);
                }
            }
        }
    }

    public void a(boolean z, int i, int i2, int i3, int i4, int i5) {
        int i6 = z ? 256 + 131072 : 256;
        int i7 = i3 - this.b;
        int i8 = i4 - this.c;
        if (i5 == 1 || i5 == 3) {
            i = i2;
            i2 = i;
        }
        for (int i9 = i7; i9 < i7 + i; i9++) {
            if (i9 >= 0 && i9 < this.d) {
                for (int i10 = i8; i10 < i8 + i2; i10++) {
                    if (i10 >= 0 && i10 < this.e) {
                        a(i9, i10, i6);
                    }
                }
            }
        }
    }

    public void a(int i, int i2) {
        int i3 = i2 - this.b;
        int i4 = i - this.c;
        int[] iArr = this.a[i3];
        iArr[i4] = iArr[i4] | 2097152;
    }

    private void a(int i, int i2, int i3) {
        int[] iArr = this.a[i];
        iArr[i2] = iArr[i2] | i3;
    }

    public void a(int i, int i2, boolean z, int i3, int i4) {
        int i5 = i3 - this.b;
        int i6 = i4 - this.c;
        if (i2 == 0) {
            if (i == 0) {
                b(128, i5, i6);
                b(8, i5 - 1, i6);
            }
            if (i == 1) {
                b(2, i5, i6);
                b(32, i5, i6 + 1);
            }
            if (i == 2) {
                b(8, i5, i6);
                b(128, i5 + 1, i6);
            }
            if (i == 3) {
                b(32, i5, i6);
                b(2, i5, i6 - 1);
            }
        }
        if (i2 == 1 || i2 == 3) {
            if (i == 0) {
                b(1, i5, i6);
                b(16, i5 - 1, i6 + 1);
            }
            if (i == 1) {
                b(4, i5, i6);
                b(64, i5 + 1, i6 + 1);
            }
            if (i == 2) {
                b(16, i5, i6);
                b(1, i5 + 1, i6 - 1);
            }
            if (i == 3) {
                b(64, i5, i6);
                b(4, i5 - 1, i6 - 1);
            }
        }
        if (i2 == 2) {
            if (i == 0) {
                b(130, i5, i6);
                b(8, i5 - 1, i6);
                b(32, i5, i6 + 1);
            }
            if (i == 1) {
                b(10, i5, i6);
                b(32, i5, i6 + 1);
                b(128, i5 + 1, i6);
            }
            if (i == 2) {
                b(40, i5, i6);
                b(128, i5 + 1, i6);
                b(2, i5, i6 - 1);
            }
            if (i == 3) {
                b(160, i5, i6);
                b(2, i5, i6 - 1);
                b(8, i5 - 1, i6);
            }
        }
        if (z) {
            if (i2 == 0) {
                if (i == 0) {
                    b(65536, i5, i6);
                    b(4096, i5 - 1, i6);
                }
                if (i == 1) {
                    b(1024, i5, i6);
                    b(16384, i5, i6 + 1);
                }
                if (i == 2) {
                    b(4096, i5, i6);
                    b(65536, i5 + 1, i6);
                }
                if (i == 3) {
                    b(16384, i5, i6);
                    b(1024, i5, i6 - 1);
                }
            }
            if (i2 == 1 || i2 == 3) {
                if (i == 0) {
                    b(512, i5, i6);
                    b(8192, i5 - 1, i6 + 1);
                }
                if (i == 1) {
                    b(2048, i5, i6);
                    b(32768, i5 + 1, i6 + 1);
                }
                if (i == 2) {
                    b(8192, i5, i6);
                    b(512, i5 + 1, i6 - 1);
                }
                if (i == 3) {
                    b(32768, i5, i6);
                    b(2048, i5 - 1, i6 - 1);
                }
            }
            if (i2 == 2) {
                if (i == 0) {
                    b(66560, i5, i6);
                    b(4096, i5 - 1, i6);
                    b(16384, i5, i6 + 1);
                }
                if (i == 1) {
                    b(5120, i5, i6);
                    b(16384, i5, i6 + 1);
                    b(65536, i5 + 1, i6);
                }
                if (i == 2) {
                    b(20480, i5, i6);
                    b(65536, i5 + 1, i6);
                    b(1024, i5, i6 - 1);
                }
                if (i == 3) {
                    b(81920, i5, i6);
                    b(1024, i5, i6 - 1);
                    b(4096, i5 - 1, i6);
                }
            }
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = z ? 256 + 131072 : 256;
        int i7 = i3 - this.b;
        int i8 = i4 - this.c;
        if (i == 1 || i == 3) {
            i2 = i5;
            i5 = i2;
        }
        for (int i9 = i7; i9 < i7 + i2; i9++) {
            if (i9 >= 0 && i9 < this.d) {
                for (int i10 = i8; i10 < i8 + i5; i10++) {
                    if (i10 >= 0 && i10 < this.e) {
                        b(i6, i9, i10);
                    }
                }
            }
        }
    }

    private void b(int i, int i2, int i3) {
        int[] iArr = this.a[i2];
        iArr[i3] = iArr[i3] & (class_492.c - i);
    }

    public void b(int i, int i2) {
        int i3 = i2 - this.b;
        int i4 = i - this.c;
        int[] iArr = this.a[i3];
        iArr[i4] = iArr[i4] & 14680063;
    }

    public boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == i && i3 == i6) {
            return true;
        }
        int i7 = i2 - this.b;
        int i8 = i3 - this.c;
        int i9 = i - this.b;
        int i10 = i6 - this.c;
        if (i5 == 0) {
            if (i4 == 0) {
                if (i7 == i9 - 1 && i8 == i10) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 + 1 && (this.a[i7][i8] & 19398944) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 - 1 && (this.a[i7][i8] & 19398914) == 0) {
                    return true;
                }
            } else if (i4 == 1) {
                if (i7 == i9 && i8 == i10 + 1) {
                    return true;
                }
                if (i7 == i9 - 1 && i8 == i10 && (this.a[i7][i8] & 19398920) == 0) {
                    return true;
                }
                if (i7 == i9 + 1 && i8 == i10 && (this.a[i7][i8] & 19399040) == 0) {
                    return true;
                }
            } else if (i4 == 2) {
                if (i7 == i9 + 1 && i8 == i10) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 + 1 && (this.a[i7][i8] & 19398944) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 - 1 && (this.a[i7][i8] & 19398914) == 0) {
                    return true;
                }
            } else if (i4 == 3) {
                if (i7 == i9 && i8 == i10 - 1) {
                    return true;
                }
                if (i7 == i9 - 1 && i8 == i10 && (this.a[i7][i8] & 19398920) == 0) {
                    return true;
                }
                if (i7 == i9 + 1 && i8 == i10 && (this.a[i7][i8] & 19399040) == 0) {
                    return true;
                }
            }
        }
        if (i5 == 2) {
            if (i4 == 0) {
                if (i7 == i9 - 1 && i8 == i10) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 + 1) {
                    return true;
                }
                if (i7 == i9 + 1 && i8 == i10 && (this.a[i7][i8] & 19399040) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 - 1 && (this.a[i7][i8] & 19398914) == 0) {
                    return true;
                }
            } else if (i4 == 1) {
                if (i7 == i9 - 1 && i8 == i10 && (this.a[i7][i8] & 19398920) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 + 1) {
                    return true;
                }
                if (i7 == i9 + 1 && i8 == i10) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 - 1 && (this.a[i7][i8] & 19398914) == 0) {
                    return true;
                }
            } else if (i4 == 2) {
                if (i7 == i9 - 1 && i8 == i10 && (this.a[i7][i8] & 19398920) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 + 1 && (this.a[i7][i8] & 19398944) == 0) {
                    return true;
                }
                if (i7 == i9 + 1 && i8 == i10) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 - 1) {
                    return true;
                }
            } else if (i4 == 3) {
                if (i7 == i9 - 1 && i8 == i10) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 + 1 && (this.a[i7][i8] & 19398944) == 0) {
                    return true;
                }
                if (i7 == i9 + 1 && i8 == i10 && (this.a[i7][i8] & 19399040) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 - 1) {
                    return true;
                }
            }
        }
        if (i5 != 9) {
            return false;
        }
        if (i7 == i9 && i8 == i10 + 1 && (this.a[i7][i8] & 32) == 0) {
            return true;
        }
        if (i7 == i9 && i8 == i10 - 1 && (this.a[i7][i8] & 2) == 0) {
            return true;
        }
        if (i7 == i9 - 1 && i8 == i10 && (this.a[i7][i8] & 8) == 0) {
            return true;
        }
        return i7 == i9 + 1 && i8 == i10 && (this.a[i7][i8] & 128) == 0;
    }

    public boolean b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == i && i3 == i2) {
            return true;
        }
        int i7 = i6 - this.b;
        int i8 = i3 - this.c;
        int i9 = i - this.b;
        int i10 = i2 - this.c;
        if (i4 == 6 || i4 == 7) {
            if (i4 == 7) {
                i5 = (i5 + 2) & 3;
            }
            if (i5 == 0) {
                if (i7 == i9 + 1 && i8 == i10 && (this.a[i7][i8] & 128) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 - 1 && (this.a[i7][i8] & 2) == 0) {
                    return true;
                }
            } else if (i5 == 1) {
                if (i7 == i9 - 1 && i8 == i10 && (this.a[i7][i8] & 8) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 - 1 && (this.a[i7][i8] & 2) == 0) {
                    return true;
                }
            } else if (i5 == 2) {
                if (i7 == i9 - 1 && i8 == i10 && (this.a[i7][i8] & 8) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 + 1 && (this.a[i7][i8] & 32) == 0) {
                    return true;
                }
            } else if (i5 == 3) {
                if (i7 == i9 + 1 && i8 == i10 && (this.a[i7][i8] & 128) == 0) {
                    return true;
                }
                if (i7 == i9 && i8 == i10 + 1 && (this.a[i7][i8] & 32) == 0) {
                    return true;
                }
            }
        }
        if (i4 != 8) {
            return false;
        }
        if (i7 == i9 && i8 == i10 + 1 && (this.a[i7][i8] & 32) == 0) {
            return true;
        }
        if (i7 == i9 && i8 == i10 - 1 && (this.a[i7][i8] & 2) == 0) {
            return true;
        }
        if (i7 == i9 - 1 && i8 == i10 && (this.a[i7][i8] & 8) == 0) {
            return true;
        }
        return i7 == i9 + 1 && i8 == i10 && (this.a[i7][i8] & 128) == 0;
    }

    public boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i2 + i6) - 1;
        int i9 = (i + i4) - 1;
        if (i3 < i2 || i3 > i8 || i7 < i || i7 > i9) {
            return (i3 == i2 - 1 && i7 >= i && i7 <= i9 && (this.a[i3 - this.b][i7 - this.c] & 8) == 0 && (i5 & 8) == 0) || (i3 == i8 + 1 && i7 >= i && i7 <= i9 && (this.a[i3 - this.b][i7 - this.c] & 128) == 0 && (i5 & 2) == 0) || ((i7 == i - 1 && i3 >= i2 && i3 <= i8 && (this.a[i3 - this.b][i7 - this.c] & 2) == 0 && (i5 & 4) == 0) || (i7 == i9 + 1 && i3 >= i2 && i3 <= i8 && (this.a[i3 - this.b][i7 - this.c] & 32) == 0 && (i5 & 1) == 0));
        }
        return true;
    }
}
