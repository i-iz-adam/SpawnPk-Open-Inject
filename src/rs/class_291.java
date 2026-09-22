package rs;

import com.sun.jna.platform.win32.COM.tlb.a.e;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

/* JADX INFO: loaded from: client-final.jar:rs/class_291.class */
public class class_291 extends class_315 {
    private static final int r = 125;
    private static final int s = 33;
    private static final Dimension t = new Dimension(127, 34);
    private static final String u = "Your points:";
    private static final String v = "Time:";
    private String w = e.e;
    private String x = "0:00";
    private long y = 0;
    private boolean z = false;

    public class_291() {
        a("RaidPartyOverlay");
        a(class_268.p);
        a(class_320.c);
        this.e.a(new Rectangle(2, 2, 2, 2));
        this.e.b(new Point(0, 2));
    }

    @Override // rs.class_315
    public Dimension a(Graphics2D graphics2D) {
        int i = this.f.x;
        int i2 = this.f.y;
        a(t);
        class_210.b(33, i2, i, 4077096, 125, 125);
        class_210.d(i, 125, 33, class_228.t, i2);
        class_210.d(i - 1, 127, 33, class_228.u, i2 - 1);
        Client.gl.b(u, i + 4, i2 + 13, class_492.e, 0);
        Client.gl.a(this.w, (i + 125) - 3, i2 + 13, class_492.c, 0);
        Client.gl.b(v, i + 4, i2 + 27, class_492.e, 0);
        Client.gl.a(this.x, (i + 125) - 3, i2 + 27, class_492.c, 0);
        if (!this.z && System.currentTimeMillis() - this.y > 1000) {
            int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.y) / 1000);
            this.x = String.format("%d:%02d", Integer.valueOf((iCurrentTimeMillis % 3600) / 60), Integer.valueOf(iCurrentTimeMillis % 60));
        }
        return this.j;
    }

    public void b(String str) {
        this.w = str;
    }

    public void c(String str) {
        this.x = str;
    }

    public void a(long j) {
        this.y = j;
    }

    public void k(boolean z) {
        this.z = z;
    }
}
