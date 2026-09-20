/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_a;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class C_b {
    private URL d;
    private File e;
    protected int a;
    protected long b;
    protected int c;

    public C_b(URL uRL, File file) {
        this.d = uRL;
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
            byte[] byArray = new byte[16384];
            HttpURLConnection httpURLConnection = (HttpURLConnection)this.d.openConnection();
            this.c = httpURLConnection.getContentLength();
            System.out.println(this.c);
            httpURLConnection.disconnect();
            this.b = System.currentTimeMillis();
            int n = 0;
            int n2 = 0;
            while ((n = ((InputStream)bufferedInputStream).read(byArray)) > -1) {
                fileOutputStream.write(byArray, 0, n);
                this.a += n;
                this.a();
                if ((n2 += n) <= 0x100000) continue;
                n2 = 0;
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            return this.e;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public abstract void a();
}

