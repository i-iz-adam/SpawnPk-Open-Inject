package rs;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: client-final.jar:rs/class_78.class */
public abstract class class_78 {
    private URL d;
    private File e;
    protected int a;
    protected long b;
    protected int c;

    public class_78(URL url, File file) {
        this.d = url;
        this.e = file;
    }

    public File b() {
        try {
            if (this.e.exists()) {
                System.out.println("Deleting " + this.e.getAbsolutePath());
                this.e.delete();
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.d.openStream(), 16384);
            FileOutputStream fileOutputStream = new FileOutputStream(this.e);
            byte[] bArr = new byte[16384];
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.d.openConnection();
            this.c = httpURLConnection.getContentLength();
            System.out.println(this.c);
            httpURLConnection.disconnect();
            this.b = System.currentTimeMillis();
            int i = 0;
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 <= -1) {
                    fileOutputStream.close();
                    return this.e;
                }
                fileOutputStream.write(bArr, 0, i2);
                i += i2;
                this.a += i2;
                a();
                if (i > 1048576) {
                    i = 0;
                    fileOutputStream.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract void a();
}
