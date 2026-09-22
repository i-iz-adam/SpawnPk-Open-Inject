package rs;

import gnu.trove.f.b.cc;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_629.class */
public abstract class class_629<T> extends class_618 {
    protected final cc<T> c;
    protected Map<Integer, Map<String, Object>> d;
    protected boolean e;

    public class_629(String str, String str2) {
        super(str, str2);
        this.c = new cc<>();
        this.d = new HashMap();
        this.e = !e();
    }

    public abstract T a(int i, Map<String, Object> map);

    public void d() {
        try {
            this.c.clear();
            this.d.clear();
            this.d = a(this.e);
            if (this.d == null || this.d.keySet() == null) {
                this.d = new HashMap();
                return;
            }
            Iterator<Integer> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!this.c.w_(iIntValue)) {
                    this.c.a(iIntValue, a(iIntValue, this.d.get(Integer.valueOf(iIntValue))));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public T a(int i) {
        return this.c.b(i);
    }

    public boolean b(int i) {
        return this.c.w_(i) && this.c.b(i) != null;
    }

    protected boolean e() {
        return Configuration.c();
    }

    protected byte b(Object obj) {
        return (byte) ((Integer) obj).intValue();
    }

    @Override // rs.class_618
    protected int[] a(Object obj) {
        if (obj == null || ((List) obj).size() == 0) {
            return null;
        }
        return ((List) obj).stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray();
    }

    protected int[][] c(Object obj) {
        if (obj == null || ((List) obj).size() == 0) {
            return null;
        }
        List list = (List) obj;
        int[][] iArr = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = new int[((List) list.get(i)).size()];
            for (int i2 = 0; i2 < ((List) list.get(i)).size(); i2++) {
                iArr[i][i2] = ((Integer) ((List) list.get(i)).get(i2)).intValue();
            }
        }
        return iArr;
    }

    protected int[][][] d(Object obj) {
        List list = (List) obj;
        int[][][] iArr = new int[list.size()][][];
        for (int i = 0; i < list.size(); i++) {
            List list2 = (List) list.get(i);
            int[][] iArr2 = new int[list2.size()][];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                List list3 = (List) list2.get(i2);
                int[] iArr3 = new int[list3.size()];
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    iArr3[i3] = ((Integer) list3.get(i3)).intValue();
                }
                iArr2[i2] = iArr3;
            }
            iArr[i] = iArr2;
        }
        return iArr;
    }

    protected String[] e(Object obj) {
        return (String[]) ((List) obj).toArray(new String[((List) obj).size()]);
    }

    public cc<T> f() {
        return this.c;
    }
}
