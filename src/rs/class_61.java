package rs;

import gnu.trove.f.b.bU;
import gnu.trove.i.a.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_61.class */
public class class_61 extends class_58 {
    private int[] d;
    private int e;
    private int f;
    HashSet<Integer> a = new HashSet<>();
    private final i b = new i();
    private final List<bU> c = new ArrayList();

    public void a(int[][][] iArr) {
        for (int[][] iArr2 : iArr) {
            bU bUVar = new bU();
            int[] iArr3 = iArr2[0];
            int[] iArr4 = iArr2[1];
            for (int i = 0; i < iArr3.length && i < iArr4.length; i++) {
                this.a.add(Integer.valueOf(iArr4[i]));
                this.b.b(iArr3[i]);
                bUVar.a(iArr3[i], iArr4[i]);
            }
            this.c.add(bUVar);
        }
    }

    public void a(int i, int[] iArr) {
        bU bUVar = new bU();
        for (int i2 : iArr) {
            this.a.add(Integer.valueOf(i));
            this.b.b(i2);
            bUVar.a(i2, i);
        }
        this.c.add(bUVar);
    }

    public int[] a() {
        if (this.d != null) {
            return this.d;
        }
        this.d = this.a.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray();
        return this.d;
    }

    @Override // rs.class_58
    public void a(ColorUtility colorUtility) {
        int i = 0;
        this.e = 0;
        this.f = 0;
        for (int i2 = 0; i2 < colorUtility.ar.length; i2++) {
            if (this.b.a_(colorUtility.ar[i2])) {
                i++;
            }
        }
        colorUtility.av = i;
        if (colorUtility.ao == null) {
            colorUtility.ao = new int[colorUtility.ah];
        }
        if (colorUtility.ar == null) {
            colorUtility.ar = new int[i];
        }
        colorUtility.aw = new int[i];
        colorUtility.ax = new int[i];
        colorUtility.ay = new int[i];
        colorUtility.as = new boolean[colorUtility.ah];
    }

    @Override // rs.class_58
    public void a(ColorUtility colorUtility, int i) {
        if ((colorUtility.as == null || !colorUtility.as[i]) && colorUtility.Z == null && this.b.a_(colorUtility.ar[i])) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                if (this.c.get(i2).r_(colorUtility.ar[i])) {
                    int iC = this.c.get(i2).c(colorUtility.ar[i]);
                    colorUtility.as[i] = true;
                    colorUtility.ar[i] = iC;
                    colorUtility.ao[i] = 3 + this.f;
                    this.f += 4;
                    colorUtility.aw[this.e] = colorUtility.ai[i];
                    colorUtility.ax[this.e] = colorUtility.aj[i];
                    colorUtility.ay[this.e] = colorUtility.ak[i];
                    this.e++;
                    return;
                }
            }
        }
    }

    public i b() {
        return this.b;
    }

    public List<bU> c() {
        return this.c;
    }
}
