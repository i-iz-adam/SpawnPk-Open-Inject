package rs;

import java.awt.Color;
import java.io.File;

/* JADX INFO: loaded from: client-final.jar:rs/class_107.class */
public final class class_107 {
    public static class_108 a = class_108.a;
    public static class_107[] b;
    public int c;
    public int d = -1;
    public boolean e = true;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public static void a(class_108 class_108Var) {
        Buffer buffer = null;
        a = class_108Var;
        switch (class_109.a[class_108Var.ordinal()]) {
            case 1:
                buffer = new Buffer(Client.a(class_650.f() + "flo.dat"));
                break;
            case 2:
                buffer = new Buffer(Client.a(class_650.f() + "osrs_flo.dat"));
                break;
            case 3:
                buffer = new Buffer(Client.a(class_650.f() + "osrs_config" + File.separator + "flo.dat"));
                break;
        }
        int iA = buffer.A();
        if (b == null || b.length != iA) {
            b = new class_107[iA];
        }
        for (int i = 0; i < iA; i++) {
            if (b[i] == null) {
                b[i] = new class_107();
            }
            b[i].a(buffer);
        }
    }

    public static void a(class_663 class_663Var) {
        Buffer buffer = new Buffer(Client.a(class_650.f() + "flo.dat"));
        int iA = buffer.A();
        if (b == null) {
            b = new class_107[iA];
        }
        for (int i = 0; i < iA; i++) {
            if (b[i] == null) {
                b[i] = new class_107();
            }
            b[i].a(buffer);
        }
    }

    private boolean a(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                return true;
            }
            if (iY == 1) {
                this.c = buffer.C();
                if (Configuration.r != class_150.a) {
                    Color colorDecode = Color.decode(this.c);
                    if (Math.abs(colorDecode.getGreen() - colorDecode.getRed()) > 10 || Math.abs(colorDecode.getRed() - colorDecode.getBlue()) > 10 || Math.abs(colorDecode.getGreen() - colorDecode.getBlue()) > 10) {
                        if (Configuration.r == class_150.c && colorDecode.getGreen() > 50) {
                            this.c = 2238754;
                        }
                        if (colorDecode.getGreen() > 100) {
                            this.c = Configuration.r.f;
                        }
                    }
                }
                a(this.c);
            } else if (iY == 2) {
                this.d = buffer.y();
            } else if (iY != 3) {
                if (iY == 5) {
                    this.e = false;
                } else if (iY == 6) {
                    buffer.F();
                } else if (iY == 7) {
                    int i = this.f;
                    int i2 = this.g;
                    int i3 = this.h;
                    int i4 = this.i;
                    a(buffer.C());
                    this.f = i;
                    this.g = i2;
                    this.h = i3;
                    this.i = i4;
                    this.j = i4;
                } else {
                    System.out.println("[FLO] Error unrecognised config code: " + iY);
                }
            }
        }
    }

    private void a(int i) {
        double d = ((double) ((i >> 16) & 255)) / 256.0d;
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (i & 255)) / 256.0d;
        double d4 = d;
        if (d2 < d4) {
            d4 = d2;
        }
        if (d3 < d4) {
            d4 = d3;
        }
        double d5 = d;
        if (d2 > d5) {
            d5 = d2;
        }
        if (d3 > d5) {
            d5 = d3;
        }
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = (d4 + d5) / 2.0d;
        if (d4 != d5) {
            if (d8 < 0.5d) {
                d7 = (d5 - d4) / (d5 + d4);
            }
            if (d8 >= 0.5d) {
                d7 = (d5 - d4) / ((2.0d - d5) - d4);
            }
            if (d == d5) {
                d6 = (d2 - d3) / (d5 - d4);
            } else if (d2 == d5) {
                d6 = 2.0d + ((d3 - d) / (d5 - d4));
            } else if (d3 == d5) {
                d6 = 4.0d + ((d - d2) / (d5 - d4));
            }
        }
        double d9 = d6 / 6.0d;
        this.f = (int) (d9 * 256.0d);
        this.g = (int) (d7 * 256.0d);
        this.h = (int) (d8 * 256.0d);
        if (this.g < 0) {
            this.g = 0;
        } else if (this.g > 255) {
            this.g = 255;
        }
        if (this.h < 0) {
            this.h = 0;
        } else if (this.h > 255) {
            this.h = 255;
        }
        if (d8 > 0.5d) {
            this.j = (int) ((1.0d - d8) * d7 * 512.0d);
        } else {
            this.j = (int) (d8 * d7 * 512.0d);
        }
        if (this.j < 1) {
            this.j = 1;
        }
        this.i = (int) (d9 * ((double) this.j));
        int iRandom = (this.f + ((int) (Math.random() * 16.0d))) - 8;
        if (iRandom < 0) {
            iRandom = 0;
        } else if (iRandom > 255) {
            iRandom = 255;
        }
        int iRandom2 = (this.g + ((int) (Math.random() * 48.0d))) - 24;
        if (iRandom2 < 0) {
            iRandom2 = 0;
        } else if (iRandom2 > 255) {
            iRandom2 = 255;
        }
        int iRandom3 = (this.h + ((int) (Math.random() * 48.0d))) - 24;
        if (iRandom3 < 0) {
            iRandom3 = 0;
        } else if (iRandom3 > 255) {
            iRandom3 = 255;
        }
        this.k = a(iRandom, iRandom2, iRandom3);
    }

    private int a(int i, int i2, int i3) {
        if (i3 > 179) {
            i2 /= 2;
        }
        if (i3 > 192) {
            i2 /= 2;
        }
        if (i3 > 217) {
            i2 /= 2;
        }
        if (i3 > 243) {
            i2 /= 2;
        }
        return ((i / 4) << 10) + ((i2 / 32) << 7) + (i3 / 2);
    }

    private class_107() {
    }
}
