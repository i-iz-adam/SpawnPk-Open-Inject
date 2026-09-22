package rs;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_563.class */
public class class_563 extends class_553 {
    public static Map<Integer, Integer> d = new HashMap();

    @Override // rs.class_553
    public void a() {
        int iG = g();
        int iE = e();
        if (iE == -1) {
            d.remove(Integer.valueOf(iG));
        } else {
            d.put(Integer.valueOf(iG), Integer.valueOf(iE));
        }
    }
}
