package rs.lpkg.bpkg;

import java.util.Arrays;
import rs.ColorUtility;

/* JADX INFO: loaded from: client-final.jar:rs/l/b/f.class */
public class f {
    private ColorUtility a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private static final int[] h = new int[4];

    public void a(ColorUtility colorUtility) {
        this.a = colorUtility;
    }

    public int a() {
        return Arrays.hashCode(new int[]{this.b, this.c, this.d, this.e, this.f, this.g, this.a.V, this.a.S, this.a.T, this.a.U});
    }

    public int b() {
        h[0] = Arrays.hashCode(this.a.ae);
        h[1] = Arrays.hashCode(this.a.af);
        h[2] = Arrays.hashCode(this.a.ag);
        h[3] = Arrays.hashCode(this.a.ar);
        return Arrays.hashCode(h);
    }
}
