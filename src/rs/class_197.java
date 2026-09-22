package rs;

import java.util.Iterator;

/* JADX INFO: loaded from: client-final.jar:rs/class_197.class */
public class class_197 extends class_196 {
    protected int t;

    public class_197(int i) {
        this.t = i;
    }

    @Override // rs.class_196
    protected void b() {
    }

    @Override // rs.class_196
    protected void c() {
        String str;
        int i = 32 + 10;
        int i2 = 32 + 10;
        class_333 class_333VarA = ItemComposition.a(391, 1, 0, 32);
        class_333 class_333VarA2 = ItemComposition.a(this.t, 1, 0, 32);
        if (class_333VarA == null || class_333VarA2 == null) {
            return;
        }
        class_333VarA.f(15, 15);
        class_333VarA.f(15 + i, 15);
        class_333VarA.f(15 + i + i, 15);
        class_333VarA.f(15, 15 + i2);
        class_333VarA2.f(15 + i, 15 + i2);
        class_333VarA.f(15 + i + i, 15 + i2);
        class_333VarA.f(15, 15 + i2 + i2);
        class_333VarA.f(15 + i, 15 + i2 + i2);
        class_333VarA.f(15 + i + i, 15 + i2 + i2);
        int height = class_205.b.f.z().getHeight() - 65;
        String str2 = "[ ";
        int i3 = 0;
        Iterator<Integer> it = this.q.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (i3 == this.r) {
                str2 = str2 + "<u=0>";
            }
            if (k().contains(Integer.valueOf(iIntValue))) {
                str = str2 + "@gre@" + iIntValue;
            } else {
                str = this.p.containsKey(Integer.valueOf(iIntValue)) ? str2 + "@whi@" + iIntValue : str2 + "@red@" + iIntValue;
            }
            if (i3 == this.r) {
                str = str + "</u>";
            }
            str2 = str + " ";
            i3++;
        }
        class_205.b.f.gm.a(str2 + "@whi@]", 10, height, class_492.c, 0, false);
    }

    public int n() {
        return this.t;
    }

    public void g(int i) {
        this.t = i;
    }
}
