package rs;

import java.util.ArrayList;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_450.class */
public class class_450 extends class_553 {
    @Override // rs.class_553
    public void a() {
        switch (e()) {
            case 0:
                class_446.e.b();
                class_446.bH = 0;
                class_447.c = 0;
                class_446.bG = null;
                Widget.l(57220).bt = false;
                break;
            case 1:
                class_447.a(class_446.bH, h());
                class_446.bH++;
                break;
            case 2:
                Widget.l(57222).E = new class_333("event/task 2", (int) (367.0d * (((double) g()) / 100.0d)), 15);
                break;
            case 3:
                Widget.l(57223).bd = e() == 1;
                break;
            case 4:
                Widget.l(57220).bt = e() == 1;
                Launcher.n().o();
                Client.bP = 149;
                Launcher.n().o();
                Client.bQ = -1;
                break;
            case 5:
                class_447.a(g(), h());
                break;
            case 6:
                class_446.bG = h();
                if (class_446.c.a(class_446.bG)) {
                    int iB = class_446.c.b(class_446.bG);
                    Widget.l(56997).V = iB;
                    Widget.l(class_446.bI).V = iB;
                }
                break;
            case 7:
                ArrayList<class_494> arrayList = new ArrayList();
                for (class_494 class_494Var : class_446.e.d()) {
                    if (Widget.H[class_494Var.c()] instanceof class_343) {
                        arrayList.add(class_494Var);
                    }
                }
                for (class_494 class_494Var2 : arrayList) {
                    class_343 class_343Var = (class_343) Widget.l(class_494Var2.c());
                    class_343Var.o(class_446.e.d().size());
                    class_446.e.a(class_345.c).b(class_494Var2.c(), 0, class_343Var.aP + 1);
                }
                try {
                    class_446.e.a();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                for (int i = 57017 + (class_446.bH * 2); i <= 57217; i += 2) {
                    Widget.l(i).as = "";
                    Widget.l(i + 1).bd = false;
                    Widget.l(i).bp = 0;
                    Widget.l(i).br = (short) 0;
                    Widget.l(i).bq = (short) 0;
                }
                Widget.l(class_446.bI).aF = class_447.c + 25;
                break;
            case 8:
                int iC = c();
                Widget.l(56997).V = iC;
                Widget.l(class_446.bI).V = iC;
                break;
            case 9:
                Widget.l(56997).V = 0;
                Widget.l(class_446.bI).V = 0;
                class_446.c.c(class_446.bG);
                break;
            case 10:
                int iE = e();
                String strH = h();
                int i2 = class_447.b;
                Widget.l(i2).bv = true;
                if (iE > 0) {
                    Widget.l(i2).bw += "\n" + strH;
                } else {
                    Widget.l(i2).bw = strH;
                }
                break;
        }
    }
}
