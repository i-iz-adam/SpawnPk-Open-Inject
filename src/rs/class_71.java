package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_71.class */
public final class class_71 implements Runnable {
    private Client f;
    public final Object a = new Object();
    public final int[] b = new int[500];
    public boolean c = true;
    public final int[] d = new int[500];
    public int e;

    @Override // java.lang.Runnable
    public void run() {
        while (this.c) {
            synchronized (this.a) {
                if (this.e < 500) {
                    int[] iArr = this.d;
                    int i = this.e;
                    Client client = this.f;
                    iArr[i] = Client.hP;
                    int[] iArr2 = this.b;
                    int i2 = this.e;
                    Client client2 = this.f;
                    iArr2[i2] = Client.hQ;
                    this.e++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception e) {
            }
        }
    }

    public class_71(Client client) {
        this.f = client;
    }
}
