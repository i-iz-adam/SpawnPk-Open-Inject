package rs;

import java.io.IOException;
import java.io.RandomAccessFile;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_76.class */
public final class class_76 {
    private final byte[] a = new byte[User32.WM_MBUTTONUP];
    private final RandomAccessFile b;
    private final RandomAccessFile c;
    private final int d;

    public class_76(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2, int i) {
        this.b = randomAccessFile;
        this.c = randomAccessFile2;
        this.d = i;
    }

    public synchronized byte[] a(int i) {
        try {
            a(this.c, i * 6);
            int i2 = 0;
            while (i2 < 6) {
                int i3 = this.c.read(this.a, i2, 6 - i2);
                if (i3 == -1) {
                    return null;
                }
                i2 += i3;
            }
            int i4 = ((this.a[0] & 255) << 16) + ((this.a[1] & 255) << 8) + (this.a[2] & 255);
            int i5 = ((this.a[3] & 255) << 16) + ((this.a[4] & 255) << 8) + (this.a[5] & 255);
            if (i5 <= 0 || i5 > this.b.length() / 520) {
                return null;
            }
            byte[] bArr = new byte[i4];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                if (i5 == 0) {
                    return null;
                }
                a(this.b, i5 * User32.WM_MBUTTONUP);
                int i8 = i4 - i6;
                if (i8 > 512) {
                    i8 = 512;
                }
                int i9 = 0;
                while (i9 < i8 + 8) {
                    int i10 = this.b.read(this.a, i9, (i8 + 8) - i9);
                    if (i10 == -1) {
                        return null;
                    }
                    i9 += i10;
                }
                int i11 = ((this.a[0] & 255) << 8) + (this.a[1] & 255);
                int i12 = ((this.a[2] & 255) << 8) + (this.a[3] & 255);
                int i13 = ((this.a[4] & 255) << 16) + ((this.a[5] & 255) << 8) + (this.a[6] & 255);
                int i14 = this.a[7] & 255;
                if (i11 != i || i12 != i7 || i14 != this.d || i13 < 0 || i13 > this.b.length() / 520) {
                    return null;
                }
                for (int i15 = 0; i15 < i8; i15++) {
                    int i16 = i6;
                    i6++;
                    bArr[i16] = this.a[i15 + 8];
                }
                i5 = i13;
                i7++;
            }
            return bArr;
        } catch (IOException e) {
            return null;
        }
    }

    public synchronized boolean a(int i, byte[] bArr, int i2) {
        boolean zA = a(true, i2, i, bArr);
        if (!zA) {
            zA = a(false, i2, i, bArr);
        }
        return zA;
    }

    private synchronized boolean a(boolean z, int i, int i2, byte[] bArr) {
        int length;
        int i3;
        try {
            if (z) {
                a(this.c, i * 6);
                int i4 = 0;
                while (i4 < 6) {
                    int i5 = this.c.read(this.a, i4, 6 - i4);
                    if (i5 == -1) {
                        return false;
                    }
                    i4 += i5;
                }
                length = ((this.a[3] & 255) << 16) + ((this.a[4] & 255) << 8) + (this.a[5] & 255);
                if (length <= 0 || length > this.b.length() / 520) {
                    return false;
                }
            } else {
                length = (int) ((this.b.length() + 519) / 520);
                if (length == 0) {
                    length = 1;
                }
            }
            this.a[0] = (byte) (i2 >> 16);
            this.a[1] = (byte) (i2 >> 8);
            this.a[2] = (byte) i2;
            this.a[3] = (byte) (length >> 16);
            this.a[4] = (byte) (length >> 8);
            this.a[5] = (byte) length;
            a(this.c, i * 6);
            this.c.write(this.a, 0, 6);
            int i6 = 0;
            int i7 = 0;
            while (i6 < i2) {
                int length2 = 0;
                if (z) {
                    a(this.b, length * User32.WM_MBUTTONUP);
                    int i8 = 0;
                    while (i8 < 8 && (i3 = this.b.read(this.a, i8, 8 - i8)) != -1) {
                        i8 += i3;
                    }
                    if (i8 == 8) {
                        int i9 = ((this.a[0] & 255) << 8) + (this.a[1] & 255);
                        int i10 = ((this.a[2] & 255) << 8) + (this.a[3] & 255);
                        length2 = ((this.a[4] & 255) << 16) + ((this.a[5] & 255) << 8) + (this.a[6] & 255);
                        int i11 = this.a[7] & 255;
                        if (i9 != i || i10 != i7 || i11 != this.d || length2 < 0 || length2 > this.b.length() / 520) {
                            return false;
                        }
                    }
                }
                if (length2 == 0) {
                    z = false;
                    length2 = (int) ((this.b.length() + 519) / 520);
                    if (length2 == 0) {
                        length2++;
                    }
                    if (length2 == length) {
                        length2++;
                    }
                }
                if (i2 - i6 <= 512) {
                    length2 = 0;
                }
                this.a[0] = (byte) (i >> 8);
                this.a[1] = (byte) i;
                this.a[2] = (byte) (i7 >> 8);
                this.a[3] = (byte) i7;
                this.a[4] = (byte) (length2 >> 16);
                this.a[5] = (byte) (length2 >> 8);
                this.a[6] = (byte) length2;
                this.a[7] = (byte) this.d;
                a(this.b, length * User32.WM_MBUTTONUP);
                this.b.write(this.a, 0, 8);
                int i12 = i2 - i6;
                if (i12 > 512) {
                    i12 = 512;
                }
                this.b.write(bArr, i6, i12);
                i6 += i12;
                length = length2;
                i7++;
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private synchronized void a(RandomAccessFile randomAccessFile, int i) throws IOException {
        randomAccessFile.seek(i);
    }
}
