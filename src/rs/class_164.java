package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_164.class */
public class class_164 {
    public static void a(long j) {
        if (j > 0) {
            if (0 == j % 10) {
                try {
                    Thread.sleep(1L);
                    return;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
            try {
                Thread.sleep(j);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }
}
