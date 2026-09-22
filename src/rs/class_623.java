package rs;

import gnu.trove.f.b.bU;
import gnu.trove.f.b.cc;
import gnu.trove.i.a.i;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_623.class */
public class class_623 extends class_618 {
    private static final int e = 2000;
    private static final String f = class_650.f() + File.separator + "configs" + File.separator + "maps.yaml";
    private static final String g = class_650.f() + File.separator + "configs" + File.separator + "m.bin";
    protected Map<Integer, Map<String, Object>> c;
    protected boolean d;
    private final cc<String> h;
    private final bU i;
    private final i j;
    private final i k;
    private final bU l;

    public class_623() {
        super(f, g);
        this.c = new HashMap();
        this.d = !Configuration.c();
        this.h = new cc<>();
        this.i = new bU();
        this.j = new i();
        this.k = new i();
        this.l = new bU();
    }

    public boolean a(int i) {
        return this.h.w_(i);
    }

    public boolean b(int i) {
        return a(Client.ej, i);
    }

    public boolean a(int i, String str) {
        if (a(i)) {
            return this.h.b(i).equals(str);
        }
        return false;
    }

    public boolean a(int i, int i2) {
        if (!a(i) && !a(i2)) {
            return true;
        }
        if (a(i) != a(i2)) {
            return false;
        }
        return this.h.b(i).equals(this.h.b(i2));
    }

    public void a(Map<String, Object> map, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        boolean zBooleanValue = false;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            switch (str.toLowerCase()) {
                case "id":
                    iArr[i] = ((Integer) obj).intValue();
                    this.i.a(((Integer) obj).intValue(), i);
                    break;
                case "map":
                    iArr2[i] = ((Integer) obj).intValue();
                    this.j.b(((Integer) obj).intValue());
                    break;
                case "land":
                    iArr3[i] = ((Integer) obj).intValue();
                    this.j.b(((Integer) obj).intValue());
                    break;
                case "type":
                    if (((String) obj).equalsIgnoreCase("osrs")) {
                        iArr4[i] = 1;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "osid":
                    int iIntValue = ((Integer) obj).intValue();
                    if (map.containsKey("id")) {
                        this.l.a(((Integer) map.get("id")).intValue(), iIntValue);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "group":
                    String str2 = (String) obj;
                    if (map.containsKey("id")) {
                        this.h.a(((Integer) map.get("id")).intValue(), str2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "forceroof":
                case "forceroofs":
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    break;
            }
        }
        if (iArr4[i] == 1) {
            this.k.b(((Integer) map.get("id")).intValue());
        }
        if (zBooleanValue) {
            Client.c.put(Integer.valueOf(((Integer) map.get("id")).intValue()), true);
        }
    }

    public void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        try {
            this.c = a(this.d);
            if (this.c == null || this.c.keySet() == null) {
                this.c = new HashMap();
                return;
            }
            Iterator<Integer> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                try {
                    a(this.c.get(Integer.valueOf(iIntValue)), iIntValue, iArr, iArr2, iArr3, iArr4);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public cc<String> d() {
        return this.h;
    }

    public bU e() {
        return this.i;
    }

    public i f() {
        return this.j;
    }

    public i g() {
        return this.k;
    }

    public bU h() {
        return this.l;
    }
}
