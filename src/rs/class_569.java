package rs;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: client-final.jar:rs/class_569.class */
public class class_569 extends class_553 {
    private class_266 a(String str) {
        switch (str) {
            case "magic_sickness":
                return class_266.q;
            case "welfare_2x":
                return class_266.Q;
            case "event_elixir":
                return class_266.H;
            default:
                try {
                    return class_266.valueOf(str.toUpperCase());
                } catch (Exception e) {
                    return null;
                }
        }
    }

    @Override // rs.class_553
    public void a() {
        String strH = h();
        if (strH.startsWith("dyn_")) {
            b(strH);
            return;
        }
        int iG = g();
        class_266 class_266VarA = a(strH.toLowerCase());
        if (class_266VarA == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (class_265 class_265Var : this.c.u) {
            if (class_265Var.a() == class_266VarA) {
                if (iG > 0) {
                    class_265Var.a(iG);
                    z = true;
                } else {
                    arrayList.add(class_265Var);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.u.remove((class_265) it.next());
        }
        if (z || class_266VarA == null) {
            return;
        }
        if (iG > 0) {
            this.c.u.add(new class_265(this.c, class_266VarA, iG));
        }
        if (iG == -1) {
            this.c.u.add(new class_265(this.c, class_266VarA, -1));
        }
    }

    private void b(String str) {
        String strSubstring = str.substring(4);
        int iG = g();
        int iG2 = g();
        String str2 = strSubstring + "\n" + h().replace("[br]", "\n");
        ArrayList arrayList = new ArrayList();
        for (class_265 class_265Var : this.c.u) {
            if (class_265Var.b().equals(strSubstring)) {
                arrayList.add(class_265Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.u.remove((class_265) it.next());
        }
        if (0 == 0) {
            this.c.u.add(new class_265(this.c, strSubstring, str2, iG2, iG));
        }
    }
}
