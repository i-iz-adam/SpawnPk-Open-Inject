package rs;

import java.awt.Color;

/* JADX INFO: loaded from: client-final.jar:rs/class_264.class */
class class_264 extends class_553 {
    class_264() {
    }

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            Color color = new Color(e(), e(), e(), e());
            Color color2 = new Color(e(), e(), e(), e());
            int iC = c();
            int iC2 = c();
            class_262 class_262VarA = Client.aa.a(iC + "," + iC2, iC, iC2, color, color2);
            if (e() == 1) {
                class_262VarA.d = h();
            }
        }
        if (iE == 1) {
            Client.aa.b(c(), c());
        }
    }
}
