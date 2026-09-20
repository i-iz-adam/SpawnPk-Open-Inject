/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache;

import java.io.IOException;
import java.io.RandomAccessFile;

public final class C_a {
    private final byte[] a = new byte[520];
    private final RandomAccessFile b;
    private final RandomAccessFile c;
    private final int d;

    public C_a(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2, int n) {
        this.b = randomAccessFile;
        this.c = randomAccessFile2;
        this.d = n;
    }

    public synchronized byte[] a(int n) {
        try {
            int n2;
            int n3;
            this.a(this.c, n * 6);
            for (n2 = 0; n2 < 6; n2 += n3) {
                n3 = this.c.read(this.a, n2, 6 - n2);
                if (n3 != -1) continue;
                return null;
            }
            n3 = ((this.a[0] & 0xFF) << 16) + ((this.a[1] & 0xFF) << 8) + (this.a[2] & 0xFF);
            n2 = ((this.a[3] & 0xFF) << 16) + ((this.a[4] & 0xFF) << 8) + (this.a[5] & 0xFF);
            if (n2 <= 0 || (long)n2 > this.b.length() / 520L) {
                return null;
            }
            byte[] byArray = new byte[n3];
            int n4 = 0;
            int n5 = 0;
            while (n4 < n3) {
                int n6;
                int n7;
                if (n2 == 0) {
                    return null;
                }
                this.a(this.b, n2 * 520);
                int n8 = n3 - n4;
                if (n8 > 512) {
                    n8 = 512;
                }
                for (n6 = 0; n6 < n8 + 8; n6 += n7) {
                    n7 = this.b.read(this.a, n6, n8 + 8 - n6);
                    if (n7 != -1) continue;
                    return null;
                }
                n7 = ((this.a[0] & 0xFF) << 8) + (this.a[1] & 0xFF);
                n6 = ((this.a[2] & 0xFF) << 8) + (this.a[3] & 0xFF);
                int n9 = ((this.a[4] & 0xFF) << 16) + ((this.a[5] & 0xFF) << 8) + (this.a[6] & 0xFF);
                int n10 = this.a[7] & 0xFF;
                if (n7 != n || n6 != n5 || n10 != this.d) {
                    return null;
                }
                if (n9 < 0 || (long)n9 > this.b.length() / 520L) {
                    return null;
                }
                for (int i = 0; i < n8; ++i) {
                    byArray[n4++] = this.a[i + 8];
                }
                n2 = n9;
                ++n5;
            }
            return byArray;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public synchronized boolean a(int n, byte[] byArray, int n2) {
        boolean bl = this.a(true, n2, n, byArray);
        if (!bl) {
            bl = this.a(false, n2, n, byArray);
        }
        return bl;
    }

    private synchronized boolean a(boolean bl, int n, int n2, byte[] byArray) {
        try {
            int n3;
            int n4;
            int n5;
            if (bl) {
                this.a(this.c, n * 6);
                for (n4 = 0; n4 < 6; n4 += n5) {
                    n5 = this.c.read(this.a, n4, 6 - n4);
                    if (n5 != -1) continue;
                    return false;
                }
                n3 = ((this.a[3] & 0xFF) << 16) + ((this.a[4] & 0xFF) << 8) + (this.a[5] & 0xFF);
                if (n3 <= 0 || (long)n3 > this.b.length() / 520L) {
                    return false;
                }
            } else {
                n3 = (int)((this.b.length() + 519L) / 520L);
                if (n3 == 0) {
                    n3 = 1;
                }
            }
            this.a[0] = (byte)(n2 >> 16);
            this.a[1] = (byte)(n2 >> 8);
            this.a[2] = (byte)n2;
            this.a[3] = (byte)(n3 >> 16);
            this.a[4] = (byte)(n3 >> 8);
            this.a[5] = (byte)n3;
            this.a(this.c, n * 6);
            this.c.write(this.a, 0, 6);
            n5 = 0;
            n4 = 0;
            while (n5 < n2) {
                int n6;
                int n7 = 0;
                if (bl) {
                    int n8;
                    this.a(this.b, n3 * 520);
                    for (n6 = 0; n6 < 8 && (n8 = this.b.read(this.a, n6, 8 - n6)) != -1; n6 += n8) {
                    }
                    if (n6 == 8) {
                        int n9 = ((this.a[0] & 0xFF) << 8) + (this.a[1] & 0xFF);
                        int n10 = ((this.a[2] & 0xFF) << 8) + (this.a[3] & 0xFF);
                        n7 = ((this.a[4] & 0xFF) << 16) + ((this.a[5] & 0xFF) << 8) + (this.a[6] & 0xFF);
                        int n11 = this.a[7] & 0xFF;
                        if (n9 != n || n10 != n4 || n11 != this.d) {
                            return false;
                        }
                        if (n7 < 0 || (long)n7 > this.b.length() / 520L) {
                            return false;
                        }
                    }
                }
                if (n7 == 0) {
                    bl = false;
                    n7 = (int)((this.b.length() + 519L) / 520L);
                    if (n7 == 0) {
                        ++n7;
                    }
                    if (n7 == n3) {
                        ++n7;
                    }
                }
                if (n2 - n5 <= 512) {
                    n7 = 0;
                }
                this.a[0] = (byte)(n >> 8);
                this.a[1] = (byte)n;
                this.a[2] = (byte)(n4 >> 8);
                this.a[3] = (byte)n4;
                this.a[4] = (byte)(n7 >> 16);
                this.a[5] = (byte)(n7 >> 8);
                this.a[6] = (byte)n7;
                this.a[7] = (byte)this.d;
                this.a(this.b, n3 * 520);
                this.b.write(this.a, 0, 8);
                n6 = n2 - n5;
                if (n6 > 512) {
                    n6 = 512;
                }
                this.b.write(byArray, n5, n6);
                n5 += n6;
                n3 = n7;
                ++n4;
            }
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private synchronized void a(RandomAccessFile randomAccessFile, int n) {
        randomAccessFile.seek(n);
    }
}

