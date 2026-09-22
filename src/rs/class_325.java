package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_325.class */
public class class_325 {
    private final int a;
    private int b = 0;
    private int c = 1;

    public class_325(int i) {
        this.a = i;
    }

    public void a() {
        this.b += this.c;
        if (this.b >= this.a) {
            this.c = -1;
        } else if (this.b <= 0) {
            this.c = 1;
        }
    }

    public int b() {
        return this.b;
    }
}
