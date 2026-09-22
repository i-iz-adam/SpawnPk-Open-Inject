package rs;

import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: client-final.jar:rs/class_122.class */
public class class_122 {
    public boolean a;
    public static class_122[] b;
    public int c = -1;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public static class_108 x = class_108.a;

    public static void a(class_108 class_108Var) {
        ByteBuffer byteBufferWrap = null;
        switch (class_123.a[class_108Var.ordinal()]) {
            case 1:
                byteBufferWrap = ByteBuffer.wrap(Client.a(class_650.f() + "flo2.dat"));
                break;
            case 2:
                byteBufferWrap = ByteBuffer.wrap(Client.a(class_650.f() + "osrs_flo2.dat"));
                break;
            case 3:
                byteBufferWrap = ByteBuffer.wrap(Client.a(class_650.f() + "osrs_config" + File.separator + "flo2.dat"));
                break;
        }
        int i = byteBufferWrap.getShort();
        b = new class_122[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (b[i2] == null) {
                b[i2] = new class_122();
            }
            b[i2].a(byteBufferWrap);
            b[i2].a();
        }
    }

    public void a() {
        if (this.f != -1) {
            a(this.f);
            this.r = this.o;
            this.s = this.p;
            this.t = this.q;
        }
        a(this.d);
    }

    public void a(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                return;
            }
            if (iY == 1) {
                this.d = (buffer.y() << 16) + (buffer.y() << 8) + buffer.y();
            } else if (iY == 2) {
                this.c = buffer.y();
            } else if (iY == 5) {
                this.e = false;
            } else if (iY == 7) {
                this.f = (buffer.y() << 16) + (buffer.y() << 8) + buffer.y();
            } else {
                System.out.println("Error unrecognised overlay code: " + iY);
            }
        }
    }

    private void a(ByteBuffer byteBuffer) {
        while (true) {
            byte b2 = byteBuffer.get();
            if (b2 == 0) {
                return;
            }
            if (b2 == 1) {
                this.d = ((byteBuffer.get() & 255) << 16) + ((byteBuffer.get() & 255) << 8) + (byteBuffer.get() & 255);
            } else if (b2 == 2) {
                this.c = byteBuffer.get() & 255;
            } else if (b2 == 3) {
                this.c = byteBuffer.getShort() & 65535;
                if (this.c == 65535) {
                    this.c = -1;
                }
            } else if (b2 != 4) {
                if (b2 == 5) {
                    this.e = false;
                } else if (b2 != 6) {
                    if (b2 == 7) {
                        this.f = ((byteBuffer.get() & 255) << 16) + ((byteBuffer.get() & 255) << 8) + (byteBuffer.get() & 255);
                    } else if (b2 != 8) {
                        if (b2 == 9) {
                            this.g = byteBuffer.getShort() & 65535;
                        } else if (b2 == 10) {
                            this.h = false;
                        } else if (b2 == 11) {
                            this.i = byteBuffer.get() & 255;
                        } else if (b2 == 12) {
                            this.j = true;
                        } else if (b2 == 13) {
                            this.k = ((byteBuffer.get() & 255) << 16) + ((byteBuffer.get() & 255) << 8) + (byteBuffer.get() & 255);
                        } else if (b2 == 14) {
                            this.l = byteBuffer.get() & 255;
                        } else if (b2 == 15) {
                            this.m = byteBuffer.getShort() & 65535;
                            if (this.m == 65535) {
                                this.m = -1;
                            }
                        } else if (b2 == 16) {
                            this.n = byteBuffer.get() & 255;
                        } else {
                            System.err.println("[OverlayFloor] Missing AttributeId: " + b2);
                        }
                    }
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
        this.o = (int) (d9 * 256.0d);
        this.p = (int) (d7 * 256.0d);
        this.q = (int) (d8 * 256.0d);
        if (this.p < 0) {
            this.p = 0;
        } else if (this.p > 255) {
            this.p = 255;
        }
        if (this.q < 0) {
            this.q = 0;
        } else if (this.q > 255) {
            this.q = 255;
        }
        if (d8 > 0.5d) {
            this.v = (int) ((1.0d - d8) * d7 * 512.0d);
        } else {
            this.v = (int) (d8 * d7 * 512.0d);
        }
        if (this.v < 1) {
            this.v = 1;
        }
        this.u = (int) (d9 * ((double) this.v));
        this.w = a(this.o, this.p, this.q);
    }

    static final int a(int i, int i2, int i3) {
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
}
