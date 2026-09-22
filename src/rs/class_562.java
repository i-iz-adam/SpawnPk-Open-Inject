package rs;

import java.util.HashSet;

/* JADX INFO: loaded from: client-final.jar:rs/class_562.class */
public class class_562 extends class_553 {
    public static HashSet<Integer> d = new HashSet<>();

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            boolean z = e() == 0;
            int iG = g();
            if (z) {
                d.add(Integer.valueOf(iG));
            } else {
                d.remove(Integer.valueOf(iG));
            }
        }
        if (iE == 1) {
            int iG2 = g();
            byte bE = (byte) e();
            if (bE <= 0) {
                class_102.c(iG2).P = (byte) 0;
                class_102.c(iG2).Q = -1;
                class_102.c(iG2).R = -1;
            } else {
                class_102.c(iG2).P = bE;
            }
        }
        if (iE == 2) {
            int iG3 = g();
            int iG4 = g();
            int iG5 = g();
            class_102.c(iG3).P = (byte) -1;
            class_102.c(iG3).Q = iG4;
            class_102.c(iG3).R = iG5;
        }
    }
}
