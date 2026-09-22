package rs;

import com.sun.jna.platform.win32.COM.tlb.a.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_435.class */
class class_435 extends class_553 {
    class_435() {
    }

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            int iE2 = e();
            int iG = g();
            int i = iE2 == 1 ? 55316 : 55314;
            if (iE2 == 2) {
                i = 55318;
            }
            if (iE2 == 3) {
                i = 55320;
            }
            if (Widget.H[i].aG != 20) {
                Widget.H[i].aH = 0;
                Widget.H[i].aN = 0;
                Widget.c(i, 379, 64);
                Widget.H[i].bo = 100;
            }
            Widget.H[i].ae = iG;
            int i2 = iE2 == 1 ? 55324 : 55322;
            if (iE2 == 2) {
                i2 = 55326;
            }
            if (iE2 == 3) {
                i2 = 55328;
            }
            if (iE2 == 4) {
                i2 = 55330;
            }
            if (Widget.H[i2].aG != 20) {
                Widget.H[i2].aH = 0;
                Widget.H[i2].aN = 0;
                Widget.c(i2, 379, 55);
                Widget.H[i2].bo = 100;
            }
            Widget.H[i2].ae = iG;
            return;
        }
        if (iE == 1) {
            int iE3 = e();
            int i3 = iE3 == 1 ? 55305 : 55303;
            if (iE3 == 2) {
                i3 = 55307;
            }
            if (iE3 == 3) {
                i3 = 55309;
            }
            if (iE3 == 4) {
                i3 = 55311;
            }
            Widget widget = Widget.H[55303];
            Widget widget2 = Widget.H[55303];
            class_333 class_333Var = class_434.e;
            widget2.aE = class_333Var;
            widget.E = class_333Var;
            Widget.H[55304].as = e.d;
            Widget widget3 = Widget.H[55305];
            Widget widget4 = Widget.H[55305];
            class_333 class_333Var2 = class_434.e;
            widget4.aE = class_333Var2;
            widget3.E = class_333Var2;
            Widget.H[55306].as = e.k;
            Widget widget5 = Widget.H[55307];
            Widget widget6 = Widget.H[55307];
            class_333 class_333Var3 = class_434.e;
            widget6.aE = class_333Var3;
            widget5.E = class_333Var3;
            Widget.H[55308].as = "10";
            Widget widget7 = Widget.H[55309];
            Widget widget8 = Widget.H[55309];
            class_333 class_333Var4 = class_434.e;
            widget8.aE = class_333Var4;
            widget7.E = class_333Var4;
            Widget.H[55310].as = "X";
            Widget widget9 = Widget.H[55311];
            Widget widget10 = Widget.H[55311];
            class_333 class_333Var5 = class_434.e;
            widget10.aE = class_333Var5;
            widget9.E = class_333Var5;
            Widget.H[55312].as = "All";
            Widget widget11 = Widget.H[i3];
            Widget widget12 = Widget.H[i3];
            class_333 class_333Var6 = class_434.d;
            widget12.aE = class_333Var6;
            widget11.E = class_333Var6;
            Widget.H[i3 + 1].as = "@whi@" + Widget.H[i3 + 1].as;
            return;
        }
        if (iE != 2) {
            if (iE != 3) {
                if (iE == 4) {
                    int iE4 = e();
                    String strH = h();
                    class_434.c[iE4] = System.currentTimeMillis();
                    class_434.a(strH, iE4);
                    return;
                }
                return;
            }
            int iE5 = e();
            String strH2 = h();
            for (int i4 : class_434.bI[iE5]) {
                Widget widget13 = Widget.H[i4];
                widget13.bv = true;
                boolean zStartsWith = strH2.startsWith("<format>");
                if (zStartsWith) {
                    strH2 = strH2.replaceAll("<format>", "");
                }
                widget13.bw = strH2.replaceAll("<br>", "\n");
                widget13.Q = widget13.bw;
                if (widget13.Q.contains("\n")) {
                    widget13.Q = widget13.Q.substring(0, widget13.Q.indexOf("\n"));
                }
                if (zStartsWith) {
                    widget13.bw = widget13.bw.replaceAll("@blu@", "@cya@");
                }
                if (!zStartsWith) {
                    widget13.Q = class_326.b(widget13.Q);
                }
            }
            return;
        }
        if (e() != 0) {
            for (int i5 : class_434.bG) {
                Widget.H[i5].bd = false;
            }
            Widget.H[55301].as = h();
            boolean z = e() == 1;
            Widget.H[55302].as = z ? h() : "";
            for (int i6 : class_434.bH) {
                if (!z) {
                    Widget.H[i6].b(0, 55301, 241, 0);
                }
            }
            return;
        }
        Widget.H[55301].as = "How many would you like to make?";
        Widget.H[55302].as = "Choose a quantity, then click an image to begin.";
        for (int i7 : class_434.bH) {
            Widget.H[i7].b(0, 55301, 150, 0);
        }
        for (int i8 : class_434.bG) {
            Widget.H[i8].bd = true;
        }
        for (int[] iArr : class_434.bI) {
            for (int i9 : iArr) {
                Widget.H[i9].bv = false;
                Widget.H[i9].bw = null;
                Widget.H[i9].Q = "Select";
            }
        }
    }
}
