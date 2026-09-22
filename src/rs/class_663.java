package rs;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: client-final.jar:rs/class_663.class */
public class class_663 {
    public byte[] a;
    public int b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public boolean g;

    public class_663(byte[] bArr, String str) {
        a(bArr);
    }

    public static byte[] a(File file) throws IOException {
        int i;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[(int) file.length()];
        int i2 = 0;
        while (i2 < bArr.length && (i = fileInputStream.read(bArr, i2, bArr.length - i2)) >= 0) {
            i2 += i;
        }
        if (i2 < bArr.length) {
            throw new IOException("Could not completely read file " + file.getName());
        }
        fileInputStream.close();
        return bArr;
    }

    public void a(byte[] bArr) {
        Buffer buffer = new Buffer(bArr);
        int iC = buffer.C();
        int iC2 = buffer.C();
        if (iC2 == 0) {
            byte[] bArr2 = new byte[iC];
            byte[] bArr3 = new byte[iC];
            System.arraycopy(bArr, 6, bArr2, 0, bArr.length - 6);
            try {
                new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(bArr2))).readFully(bArr3, 0, bArr3.length);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.a = bArr3;
            buffer = new Buffer(this.a);
            this.g = true;
        } else if (iC2 != iC) {
            byte[] bArr4 = new byte[iC];
            class_659.a(bArr4, iC, bArr, iC2, 6);
            this.a = bArr4;
            buffer = new Buffer(this.a);
            this.g = true;
        } else {
            this.a = bArr;
            this.g = false;
        }
        this.b = buffer.A();
        this.c = new int[this.b];
        this.d = new int[this.b];
        this.e = new int[this.b];
        this.f = new int[this.b];
        int i = buffer.h + (this.b * 10);
        for (int i2 = 0; i2 < this.b; i2++) {
            this.c[i2] = buffer.D();
            this.d[i2] = buffer.C();
            this.e[i2] = buffer.C();
            this.f[i2] = i;
            i += this.e[i2];
        }
    }

    public byte[] a(String str) {
        int iCharAt = 0;
        String upperCase = str.toUpperCase();
        for (int i = 0; i < upperCase.length(); i++) {
            iCharAt = ((iCharAt * 61) + upperCase.charAt(i)) - 32;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == iCharAt) {
                byte[] bArr = 0 == 0 ? new byte[this.d[i2]] : null;
                if (this.g) {
                    System.arraycopy(this.a, this.f[i2], bArr, 0, this.d[i2]);
                } else {
                    class_659.a(bArr, this.d[i2], this.a, this.e[i2], this.f[i2]);
                }
                return bArr;
            }
        }
        return null;
    }
}
