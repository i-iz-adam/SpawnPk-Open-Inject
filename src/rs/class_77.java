package rs;

import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: client-final.jar:rs/class_77.class */
public class class_77 extends class_78 {
    private Client d;
    private String e;
    private long f;

    public class_77(Client client, String str, URL url, File file) {
        super(url, file);
        this.d = client;
        this.e = str;
    }

    @Override // rs.class_78
    public void a() {
        if (this.d != null) {
            int i = (int) ((((double) this.a) / ((double) this.c)) * 100.0d);
            if (System.currentTimeMillis() - this.f >= 500) {
                this.f = System.currentTimeMillis();
            }
            String str = "@yel@Current progress - " + i + "%";
            if (System.currentTimeMillis() - this.b > 1000) {
                Object obj = "kb/s";
                double dCurrentTimeMillis = (int) ((((double) this.a) / ((System.currentTimeMillis() - this.b) / 1000)) / 1000.0d);
                if (dCurrentTimeMillis > 1000.0d) {
                    dCurrentTimeMillis /= 1000.0d;
                    obj = "mb/s";
                }
                str = str + " @or2@(" + new DecimalFormat("#.##").format(dCurrentTimeMillis) + " " + obj + ")";
            }
            this.d.b(i, this.e, str);
        }
    }
}
