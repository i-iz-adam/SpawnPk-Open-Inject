package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_349.class */
public class class_349 extends Widget {
    public class_349(int i) {
        this.W = new String[5];
        this.K = new int[20];
        this.av = new int[30];
        this.ax = new int[30];
        this.ar = new int[20];
        this.ak = new int[0];
        this.al = new int[0];
        this.ba = new int[0];
        this.t = false;
        this.ab = 24;
        this.ao = 24;
        this.aP = 5;
        this.P = 6;
        this.ag = 5292;
        this.au = i;
        this.aG = 2;
        H[i] = this;
    }

    public static class_349 g(int i, int i2) {
        class_349 class_349Var = new class_349(i);
        H[i].ax = new int[i2];
        H[i].av = new int[i2];
        H[i].K = new int[i2];
        H[i].ar = new int[i2];
        H[i].P = 5;
        H[i].aP = (int) Math.ceil(H[i].P);
        return class_349Var;
    }

    public class_349 a(int i) {
        this.P = i;
        this.aP = (int) Math.ceil(this.ax.length / i);
        H[this.au].P = i;
        H[this.au].aP = (int) Math.ceil(this.ax.length / i);
        return this;
    }

    public class_349 h(int i, int i2) {
        this.ab = i;
        this.ao = i2;
        return this;
    }
}
