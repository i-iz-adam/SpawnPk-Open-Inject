package rs;

import com.sun.jna.platform.win32.bk;
import com.sun.jna.platform.win32.m;
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_329.class */
public class class_329 extends class_47 {
    public static void b(int[] iArr, int i, int i2, int i3, int i4) {
        if (!e.a()) {
            iArr[i] = i2;
            return;
        }
        if (i4 <= 0 || i >= iArr.length || i < 0) {
            return;
        }
        int i5 = iArr[i];
        if ((i5 & m.bG) == 0 || i4 == 255) {
            iArr[i] = (i3 & class_492.c) | (i4 << 24);
            return;
        }
        if ((i5 & m.bG) == -16777216) {
            iArr[i] = i2 | m.bG;
            return;
        }
        int i6 = ((i5 >>> 24) * (255 - i4)) >>> 8;
        int i7 = i4 + i6;
        int i8 = (i4 << 8) / i7;
        int i9 = (i6 << 8) / i7;
        iArr[i] = ((((((i3 & 16711935) * i8) + ((i5 & 16711935) * i9)) & (-16711936)) | ((((i3 & bk.ao) * i8) + ((i5 & bk.ao) * i9)) & bk.aS)) >>> 8) | (i7 << 24);
    }
}
