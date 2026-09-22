package rs;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_163.class */
public class class_163 extends class_161 {
    long a = System.nanoTime();
    private long b;

    @Override // rs.class_161
    public void a() {
        this.a = System.nanoTime();
    }

    @Override // rs.class_161
    public int a(int i, int i2) {
        Client clientO = Launcher.n().o();
        boolean zAs = clientO.as();
        boolean z = clientO.cc;
        if (!zAs || !z) {
            long j = ((long) i2) * 1000000;
            long jNanoTime = this.a - System.nanoTime();
            if (jNanoTime < j) {
                jNanoTime = j;
            }
            class_164.a(jNanoTime / 1000000);
            long jNanoTime2 = System.nanoTime();
            int i3 = 0;
            while (i3 < 10 && (i3 < 1 || this.a < jNanoTime2)) {
                i3++;
                this.a += ((long) i) * 1000000;
            }
            if (this.a < jNanoTime2) {
                this.a = jNanoTime2;
            }
            return i3;
        }
        long jNanoTime3 = System.nanoTime();
        if (jNanoTime3 < b() || jNanoTime3 < this.b) {
            this.b = jNanoTime3;
            a(jNanoTime3);
            return 1;
        }
        if (0 > 0) {
            long j2 = (0 - (jNanoTime3 - this.b)) / 1000000;
            if (j2 > 0) {
                try {
                    if (j2 % 10 == 0) {
                        Thread.sleep(j2 - 1);
                        Thread.sleep(1L);
                    } else {
                        Thread.sleep(j2);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                jNanoTime3 = System.nanoTime();
            }
        }
        this.b = jNanoTime3;
        long j3 = ((long) i) * 1000000;
        int iB = (int) ((jNanoTime3 - b()) / j3);
        a(b() + (((long) iB) * j3));
        if (iB > 10) {
            iB = 10;
        }
        return iB;
    }

    public long b() {
        return this.a;
    }

    public void a(long j) {
        this.a = j;
    }
}
