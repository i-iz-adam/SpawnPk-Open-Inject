/*
 * Decompiled with CFR 0.152.
 */
package rs;

public final class C_f {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    public final int[][] a;

    public C_f() {
        this.b = 0;
        this.c = 0;
        this.d = 104;
        this.e = 104;
        this.a = new int[this.d][this.e];
        this.a();
    }

    public void a() {
        for (int i = 0; i < this.d; ++i) {
            for (int j = 0; j < this.e; ++j) {
                this.a[i][j] = i == 0 || j == 0 || i == this.d - 1 || j == this.e - 1 ? 0xFFFFFF : 0x1000000;
            }
        }
    }

    public void a(int n, int n2, int n3, int n4, boolean bl) {
        n3 -= this.b;
        n -= this.c;
        if (n4 == 0) {
            if (n2 == 0) {
                this.a(n3, n, 128);
                this.a(n3 - 1, n, 8);
            }
            if (n2 == 1) {
                this.a(n3, n, 2);
                this.a(n3, n + 1, 32);
            }
            if (n2 == 2) {
                this.a(n3, n, 8);
                this.a(n3 + 1, n, 128);
            }
            if (n2 == 3) {
                this.a(n3, n, 32);
                this.a(n3, n - 1, 2);
            }
        }
        if (n4 == 1 || n4 == 3) {
            if (n2 == 0) {
                this.a(n3, n, 1);
                this.a(n3 - 1, n + 1, 16);
            }
            if (n2 == 1) {
                this.a(n3, n, 4);
                this.a(n3 + 1, n + 1, 64);
            }
            if (n2 == 2) {
                this.a(n3, n, 16);
                this.a(n3 + 1, n - 1, 1);
            }
            if (n2 == 3) {
                this.a(n3, n, 64);
                this.a(n3 - 1, n - 1, 4);
            }
        }
        if (n4 == 2) {
            if (n2 == 0) {
                this.a(n3, n, 130);
                this.a(n3 - 1, n, 8);
                this.a(n3, n + 1, 32);
            }
            if (n2 == 1) {
                this.a(n3, n, 10);
                this.a(n3, n + 1, 32);
                this.a(n3 + 1, n, 128);
            }
            if (n2 == 2) {
                this.a(n3, n, 40);
                this.a(n3 + 1, n, 128);
                this.a(n3, n - 1, 2);
            }
            if (n2 == 3) {
                this.a(n3, n, 160);
                this.a(n3, n - 1, 2);
                this.a(n3 - 1, n, 8);
            }
        }
        if (bl) {
            if (n4 == 0) {
                if (n2 == 0) {
                    this.a(n3, n, 65536);
                    this.a(n3 - 1, n, 4096);
                }
                if (n2 == 1) {
                    this.a(n3, n, 1024);
                    this.a(n3, n + 1, 16384);
                }
                if (n2 == 2) {
                    this.a(n3, n, 4096);
                    this.a(n3 + 1, n, 65536);
                }
                if (n2 == 3) {
                    this.a(n3, n, 16384);
                    this.a(n3, n - 1, 1024);
                }
            }
            if (n4 == 1 || n4 == 3) {
                if (n2 == 0) {
                    this.a(n3, n, 512);
                    this.a(n3 - 1, n + 1, 8192);
                }
                if (n2 == 1) {
                    this.a(n3, n, 2048);
                    this.a(n3 + 1, n + 1, 32768);
                }
                if (n2 == 2) {
                    this.a(n3, n, 8192);
                    this.a(n3 + 1, n - 1, 512);
                }
                if (n2 == 3) {
                    this.a(n3, n, 32768);
                    this.a(n3 - 1, n - 1, 2048);
                }
            }
            if (n4 == 2) {
                if (n2 == 0) {
                    this.a(n3, n, 66560);
                    this.a(n3 - 1, n, 4096);
                    this.a(n3, n + 1, 16384);
                }
                if (n2 == 1) {
                    this.a(n3, n, 5120);
                    this.a(n3, n + 1, 16384);
                    this.a(n3 + 1, n, 65536);
                }
                if (n2 == 2) {
                    this.a(n3, n, 20480);
                    this.a(n3 + 1, n, 65536);
                    this.a(n3, n - 1, 1024);
                }
                if (n2 == 3) {
                    this.a(n3, n, 81920);
                    this.a(n3, n - 1, 1024);
                    this.a(n3 - 1, n, 4096);
                }
            }
        }
    }

    public void a(boolean bl, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = 256;
        if (bl) {
            n7 += 131072;
        }
        n3 -= this.b;
        n4 -= this.c;
        if (n5 == 1 || n5 == 3) {
            n6 = n;
            n = n2;
            n2 = n6;
        }
        for (n6 = n3; n6 < n3 + n; ++n6) {
            if (n6 < 0 || n6 >= this.d) continue;
            for (int i = n4; i < n4 + n2; ++i) {
                if (i < 0 || i >= this.e) continue;
                this.a(n6, i, n7);
            }
        }
    }

    public void a(int n, int n2) {
        int[] nArray = this.a[n2 -= this.b];
        int n3 = n -= this.c;
        nArray[n3] = nArray[n3] | 0x200000;
    }

    private void a(int n, int n2, int n3) {
        int[] nArray = this.a[n];
        int n4 = n2;
        nArray[n4] = nArray[n4] | n3;
    }

    public void a(int n, int n2, boolean bl, int n3, int n4) {
        n3 -= this.b;
        n4 -= this.c;
        if (n2 == 0) {
            if (n == 0) {
                this.b(128, n3, n4);
                this.b(8, n3 - 1, n4);
            }
            if (n == 1) {
                this.b(2, n3, n4);
                this.b(32, n3, n4 + 1);
            }
            if (n == 2) {
                this.b(8, n3, n4);
                this.b(128, n3 + 1, n4);
            }
            if (n == 3) {
                this.b(32, n3, n4);
                this.b(2, n3, n4 - 1);
            }
        }
        if (n2 == 1 || n2 == 3) {
            if (n == 0) {
                this.b(1, n3, n4);
                this.b(16, n3 - 1, n4 + 1);
            }
            if (n == 1) {
                this.b(4, n3, n4);
                this.b(64, n3 + 1, n4 + 1);
            }
            if (n == 2) {
                this.b(16, n3, n4);
                this.b(1, n3 + 1, n4 - 1);
            }
            if (n == 3) {
                this.b(64, n3, n4);
                this.b(4, n3 - 1, n4 - 1);
            }
        }
        if (n2 == 2) {
            if (n == 0) {
                this.b(130, n3, n4);
                this.b(8, n3 - 1, n4);
                this.b(32, n3, n4 + 1);
            }
            if (n == 1) {
                this.b(10, n3, n4);
                this.b(32, n3, n4 + 1);
                this.b(128, n3 + 1, n4);
            }
            if (n == 2) {
                this.b(40, n3, n4);
                this.b(128, n3 + 1, n4);
                this.b(2, n3, n4 - 1);
            }
            if (n == 3) {
                this.b(160, n3, n4);
                this.b(2, n3, n4 - 1);
                this.b(8, n3 - 1, n4);
            }
        }
        if (bl) {
            if (n2 == 0) {
                if (n == 0) {
                    this.b(65536, n3, n4);
                    this.b(4096, n3 - 1, n4);
                }
                if (n == 1) {
                    this.b(1024, n3, n4);
                    this.b(16384, n3, n4 + 1);
                }
                if (n == 2) {
                    this.b(4096, n3, n4);
                    this.b(65536, n3 + 1, n4);
                }
                if (n == 3) {
                    this.b(16384, n3, n4);
                    this.b(1024, n3, n4 - 1);
                }
            }
            if (n2 == 1 || n2 == 3) {
                if (n == 0) {
                    this.b(512, n3, n4);
                    this.b(8192, n3 - 1, n4 + 1);
                }
                if (n == 1) {
                    this.b(2048, n3, n4);
                    this.b(32768, n3 + 1, n4 + 1);
                }
                if (n == 2) {
                    this.b(8192, n3, n4);
                    this.b(512, n3 + 1, n4 - 1);
                }
                if (n == 3) {
                    this.b(32768, n3, n4);
                    this.b(2048, n3 - 1, n4 - 1);
                }
            }
            if (n2 == 2) {
                if (n == 0) {
                    this.b(66560, n3, n4);
                    this.b(4096, n3 - 1, n4);
                    this.b(16384, n3, n4 + 1);
                }
                if (n == 1) {
                    this.b(5120, n3, n4);
                    this.b(16384, n3, n4 + 1);
                    this.b(65536, n3 + 1, n4);
                }
                if (n == 2) {
                    this.b(20480, n3, n4);
                    this.b(65536, n3 + 1, n4);
                    this.b(1024, n3, n4 - 1);
                }
                if (n == 3) {
                    this.b(81920, n3, n4);
                    this.b(1024, n3, n4 - 1);
                    this.b(4096, n3 - 1, n4);
                }
            }
        }
    }

    public void a(int n, int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        int n7 = 256;
        if (bl) {
            n7 += 131072;
        }
        n3 -= this.b;
        n4 -= this.c;
        if (n == 1 || n == 3) {
            n6 = n2;
            n2 = n5;
            n5 = n6;
        }
        for (n6 = n3; n6 < n3 + n2; ++n6) {
            if (n6 < 0 || n6 >= this.d) continue;
            for (int i = n4; i < n4 + n5; ++i) {
                if (i < 0 || i >= this.e) continue;
                this.b(n7, n6, i);
            }
        }
    }

    private void b(int n, int n2, int n3) {
        int[] nArray = this.a[n2];
        int n4 = n3;
        nArray[n4] = nArray[n4] & 0xFFFFFF - n;
    }

    public void b(int n, int n2) {
        int[] nArray = this.a[n2 -= this.b];
        int n3 = n -= this.c;
        nArray[n3] = nArray[n3] & 0xDFFFFF;
    }

    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n2 == n && n3 == n6) {
            return true;
        }
        n2 -= this.b;
        n3 -= this.c;
        n -= this.b;
        n6 -= this.c;
        if (n5 == 0) {
            if (n4 == 0) {
                if (n2 == n - 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x1280120) == 0) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x1280102) == 0) {
                    return true;
                }
            } else if (n4 == 1) {
                if (n2 == n && n3 == n6 + 1) {
                    return true;
                }
                if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x1280108) == 0) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x1280180) == 0) {
                    return true;
                }
            } else if (n4 == 2) {
                if (n2 == n + 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x1280120) == 0) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x1280102) == 0) {
                    return true;
                }
            } else if (n4 == 3) {
                if (n2 == n && n3 == n6 - 1) {
                    return true;
                }
                if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x1280108) == 0) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (n5 == 2) {
            if (n4 == 0) {
                if (n2 == n - 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x1280180) == 0) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x1280102) == 0) {
                    return true;
                }
            } else if (n4 == 1) {
                if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x1280108) == 0) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 0x1280102) == 0) {
                    return true;
                }
            } else if (n4 == 2) {
                if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 0x1280108) == 0) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x1280120) == 0) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1) {
                    return true;
                }
            } else if (n4 == 3) {
                if (n2 == n - 1 && n3 == n6) {
                    return true;
                }
                if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x1280120) == 0) {
                    return true;
                }
                if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x1280180) == 0) {
                    return true;
                }
                if (n2 == n && n3 == n6 - 1) {
                    return true;
                }
            }
        }
        if (n5 == 9) {
            if (n2 == n && n3 == n6 + 1 && (this.a[n2][n3] & 0x20) == 0) {
                return true;
            }
            if (n2 == n && n3 == n6 - 1 && (this.a[n2][n3] & 2) == 0) {
                return true;
            }
            if (n2 == n - 1 && n3 == n6 && (this.a[n2][n3] & 8) == 0) {
                return true;
            }
            if (n2 == n + 1 && n3 == n6 && (this.a[n2][n3] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean b(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n6 == n && n3 == n2) {
            return true;
        }
        n6 -= this.b;
        n3 -= this.c;
        n -= this.b;
        n2 -= this.c;
        if (n4 == 6 || n4 == 7) {
            if (n4 == 7) {
                n5 = n5 + 2 & 3;
            }
            if (n5 == 0) {
                if (n6 == n + 1 && n3 == n2 && (this.a[n6][n3] & 0x80) == 0) {
                    return true;
                }
                if (n6 == n && n3 == n2 - 1 && (this.a[n6][n3] & 2) == 0) {
                    return true;
                }
            } else if (n5 == 1) {
                if (n6 == n - 1 && n3 == n2 && (this.a[n6][n3] & 8) == 0) {
                    return true;
                }
                if (n6 == n && n3 == n2 - 1 && (this.a[n6][n3] & 2) == 0) {
                    return true;
                }
            } else if (n5 == 2) {
                if (n6 == n - 1 && n3 == n2 && (this.a[n6][n3] & 8) == 0) {
                    return true;
                }
                if (n6 == n && n3 == n2 + 1 && (this.a[n6][n3] & 0x20) == 0) {
                    return true;
                }
            } else if (n5 == 3) {
                if (n6 == n + 1 && n3 == n2 && (this.a[n6][n3] & 0x80) == 0) {
                    return true;
                }
                if (n6 == n && n3 == n2 + 1 && (this.a[n6][n3] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (n4 == 8) {
            if (n6 == n && n3 == n2 + 1 && (this.a[n6][n3] & 0x20) == 0) {
                return true;
            }
            if (n6 == n && n3 == n2 - 1 && (this.a[n6][n3] & 2) == 0) {
                return true;
            }
            if (n6 == n - 1 && n3 == n2 && (this.a[n6][n3] & 8) == 0) {
                return true;
            }
            if (n6 == n + 1 && n3 == n2 && (this.a[n6][n3] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n2 + n6 - 1;
        int n9 = n + n4 - 1;
        if (n3 >= n2 && n3 <= n8 && n7 >= n && n7 <= n9) {
            return true;
        }
        return n3 == n2 - 1 && n7 >= n && n7 <= n9 && (this.a[n3 - this.b][n7 - this.c] & 8) == 0 && (n5 & 8) == 0 || n3 == n8 + 1 && n7 >= n && n7 <= n9 && (this.a[n3 - this.b][n7 - this.c] & 0x80) == 0 && (n5 & 2) == 0 || n7 == n - 1 && n3 >= n2 && n3 <= n8 && (this.a[n3 - this.b][n7 - this.c] & 2) == 0 && (n5 & 4) == 0 || n7 == n9 + 1 && n3 >= n2 && n3 <= n8 && (this.a[n3 - this.b][n7 - this.c] & 0x20) == 0 && (n5 & 1) == 0;
    }
}

