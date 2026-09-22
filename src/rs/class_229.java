package rs;

import javax.swing.SwingUtilities;
import rs.plugins.q.d;

/* JADX INFO: loaded from: client-final.jar:rs/class_229.class */
class class_229 extends class_553 {
    class_229() {
    }

    @Override // rs.class_553
    public void a() {
        switch (e()) {
            case 1:
                int iE = e();
                int iE2 = e();
                if (iE == 1) {
                    Configuration.bj = iE2 == 1;
                } else if (iE == 2) {
                    boolean unused = class_228.aa = iE2 == 1;
                } else if (iE == 3) {
                    boolean unused2 = class_228.ab = iE2 == 1;
                } else if (iE == 4) {
                    boolean unused3 = class_228.Z = iE2 == 1;
                }
                break;
            case 2:
                String strH = h();
                String strH2 = h();
                SwingUtilities.invokeLater(() -> {
                    if (strH.contains("@red@") || strH2.contains("@red@")) {
                        if (strH.contains("Died")) {
                            d.e.i().d().c(true);
                        } else if (strH2.contains("Died")) {
                            d.e.i().e().c(true);
                        }
                        d.e.f();
                    } else {
                        d.e.i().d().a(strH);
                        d.e.i().e().a(strH2);
                    }
                    d.e.k().c().a();
                });
                String unused4 = class_228.z = strH;
                String unused5 = class_228.A = strH2;
                break;
            case 3:
                if (e() == 1) {
                    int unused6 = class_228.B = c();
                    int unused7 = class_228.C = c();
                    String unused8 = class_228.F = class_228.B + " / " + class_228.C;
                } else {
                    int unused9 = class_228.D = c();
                    int unused10 = class_228.E = c();
                    String unused11 = class_228.G = class_228.D + " / " + class_228.E;
                }
                boolean z = class_228.B <= 0;
                boolean z2 = class_228.D <= 0;
                if (z || z2) {
                    SwingUtilities.invokeLater(() -> {
                        if (d.e.i().c()) {
                            return;
                        }
                        d.e.i().d().c(z);
                        d.e.i().e().c(z2);
                        d.e.f();
                    });
                }
                break;
            case 4:
                if (e() == 1) {
                    int unused12 = class_228.H = c();
                    int unused13 = class_228.I = c();
                    String unused14 = class_228.L = class_228.H + "/" + class_228.I + " (" + ((int) Math.ceil(((class_228.H == 0 && class_228.I == 0) ? 1.0f : class_228.H / class_228.I) * 100.0f)) + "%)";
                } else {
                    int unused15 = class_228.J = c();
                    int unused16 = class_228.K = c();
                    String unused17 = class_228.M = class_228.J + "/" + class_228.K + " (" + ((int) Math.ceil(((class_228.J == 0 && class_228.K == 0) ? 1.0f : class_228.J / class_228.K) * 100.0f)) + "%)";
                }
                SwingUtilities.invokeLater(() -> {
                    d.e.i().d().a(class_228.H, class_228.I);
                    d.e.i().e().a(class_228.J, class_228.K);
                    d.e.k().c().a();
                });
                break;
            case 5:
                if (e() == 1) {
                    int unused18 = class_228.R = c();
                    int unused19 = class_228.S = c();
                    String unused20 = class_228.V = class_228.R + "/" + class_228.S + " (" + ((int) Math.ceil(((class_228.R == 0 && class_228.S == 0) ? 1.0f : class_228.R / class_228.S) * 100.0f)) + "%)";
                } else {
                    int unused21 = class_228.T = c();
                    int unused22 = class_228.U = c();
                    String unused23 = class_228.W = class_228.T + "/" + class_228.U + " (" + ((int) Math.ceil(((class_228.T == 0 && class_228.U == 0) ? 1.0f : class_228.T / class_228.U) * 100.0f)) + "%)";
                }
                SwingUtilities.invokeLater(() -> {
                    d.e.i().d().b(class_228.R, class_228.S);
                    d.e.i().e().b(class_228.T, class_228.U);
                    d.e.k().c().a();
                });
                break;
            case 6:
                if (e() == 1) {
                    int unused24 = class_228.N = c();
                } else {
                    int unused25 = class_228.O = c();
                }
                int i = class_228.N - class_228.O;
                if (i == 0) {
                    String unused26 = class_228.P = class_228.N + " (+" + i + ")";
                    String unused27 = class_228.Q = class_228.O + " (+" + i + ")";
                } else if (i >= 0) {
                    String unused28 = class_228.P = class_228.N + " (+" + Math.abs(i) + ")";
                    String unused29 = class_228.Q = class_228.O + " (-" + Math.abs(i) + ")";
                } else {
                    String unused30 = class_228.P = class_228.N + " (-" + Math.abs(i) + ")";
                    String unused31 = class_228.Q = class_228.O + " (+" + Math.abs(i) + ")";
                }
                SwingUtilities.invokeLater(() -> {
                    d.e.i().a(class_228.N + class_228.O);
                    d.e.i().d().e(class_228.N);
                    d.e.i().e().e(class_228.O);
                    d.e.k().c().a();
                });
                break;
            case 7:
                int iE3 = e();
                int iE4 = e();
                String str = e() == 1 ? "<col=4028718>" : "@red@";
                if (iE3 != 1) {
                    String unused32 = class_228.Y = str + "[" + iE4 + "%]";
                } else {
                    String unused33 = class_228.X = str + "[" + iE4 + "%]";
                }
                break;
            case 8:
                if (class_228.z.equalsIgnoreCase("N/A") || class_228.z.contains("@red@")) {
                }
                break;
        }
    }
}
