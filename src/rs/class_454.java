package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_454.class */
class class_454 {
    public class_453 a;
    public int b;
    public String c;
    public String d;
    public int[][] e;
    public int f;
    public int g;
    public boolean h;

    class_454() {
    }

    public String a(int i) {
        String strA = null;
        if (i == 1) {
            strA = a(this.c);
        }
        if (i == 2 && this.d != null) {
            strA = a(this.d);
        }
        return strA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return str.replace("{prog}", this.f + "/" + this.g);
    }
}
