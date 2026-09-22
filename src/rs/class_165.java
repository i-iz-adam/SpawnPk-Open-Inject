package rs;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: client-final.jar:rs/class_165.class */
public class class_165 {
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;

    public static final byte[] a(String str) {
        try {
            int length = (int) new File(str).length();
            byte[] bArr = new byte[length];
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(str)));
            dataInputStream.readFully(bArr, 0, length);
            dataInputStream.close();
            a++;
            return bArr;
        } catch (Exception e) {
            return null;
        }
    }

    public static final byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int i = inputStream.read(bArr, 0, bArr.length);
            if (i == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static final void a(String str, byte[] bArr) {
        try {
            new File(new File(str).getParent()).mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(bArr, 0, bArr.length);
            fileOutputStream.close();
            b++;
            c++;
        } catch (Throwable th) {
            System.out.println("Write Error: " + str);
        }
    }

    public static boolean b(String str) {
        return new File(str).exists();
    }
}
