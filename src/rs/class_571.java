package rs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: loaded from: client-final.jar:rs/class_571.class */
public final class class_571 implements Runnable {
    private InputStream a;
    private OutputStream b;
    private final Socket c;
    private final class_27 e;
    private byte[] f;
    private int g;
    private int h;
    private boolean d = false;
    private boolean i = false;
    private boolean j = false;

    public class_571(class_27 class_27Var, Socket socket) throws SocketException {
        this.e = class_27Var;
        this.c = socket;
        if (Configuration.l.booleanValue()) {
            this.c.setSoTimeout(30000);
        } else {
            this.c.setSoTimeout(0);
        }
        this.c.setTcpNoDelay(true);
        this.c.setReceiveBufferSize(Configuration.bs.intValue());
        this.a = this.c.getInputStream();
        this.b = this.c.getOutputStream();
    }

    public void a() {
        this.d = true;
        try {
            if (this.a != null) {
                this.a.close();
            }
            if (this.b != null) {
                this.b.close();
            }
            if (this.c != null) {
                this.c.close();
            }
        } catch (IOException e) {
            System.out.println("Error closing stream");
        }
        this.i = false;
        synchronized (this) {
            notify();
        }
        this.f = null;
    }

    public int b() {
        if (this.d) {
            return 0;
        }
        return this.a.read();
    }

    public int c() {
        if (this.d) {
            return 0;
        }
        return this.a.available();
    }

    public void a(byte[] bArr, int i) {
        int i2 = 0;
        if (this.d) {
            return;
        }
        while (i > 0) {
            int i3 = this.a.read(bArr, i2, i);
            if (i3 <= 0) {
                throw new IOException("EOF");
            }
            i2 += i3;
            i -= i3;
        }
    }

    public void a(int i, byte[] bArr) {
        if (this.d) {
            return;
        }
        if (this.j) {
            this.j = false;
            throw new IOException("Error in writer thread");
        }
        if (this.f == null) {
            this.f = new byte[Configuration.bs.intValue()];
        }
        synchronized (this) {
            for (int i2 = 0; i2 < i; i2++) {
                this.f[this.h] = bArr[i2];
                this.h = (this.h + 1) % Configuration.bs.intValue();
                if (this.h == (this.g + 4900) % Configuration.bs.intValue()) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.i) {
                this.i = true;
                this.e.a(this, 3);
            }
            notify();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int iIntValue;
        while (this.i) {
            synchronized (this) {
                if (this.h == this.g) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                if (!this.i) {
                    return;
                }
                i = this.g;
                iIntValue = this.h >= this.g ? this.h - this.g : Configuration.bs.intValue() - this.g;
            }
            if (iIntValue > 0) {
                try {
                    this.b.write(this.f, i, iIntValue);
                } catch (IOException e2) {
                    this.j = true;
                    e2.printStackTrace();
                }
                this.g = (this.g + iIntValue) % Configuration.bs.intValue();
                try {
                    if (this.h == this.g) {
                        this.b.flush();
                    }
                } catch (IOException e3) {
                    this.j = true;
                    e3.printStackTrace();
                }
            }
        }
    }

    public void d() {
        System.out.println("dummy:" + this.d);
        System.out.println("tcycl:" + this.g);
        System.out.println("tnum:" + this.h);
        System.out.println("writer:" + this.i);
        System.out.println("ioerror:" + this.j);
        try {
            System.out.println("available:" + c());
        } catch (IOException e) {
        }
    }
}
