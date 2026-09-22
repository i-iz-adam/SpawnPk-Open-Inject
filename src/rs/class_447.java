package rs;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_447.class */
public class class_447 {
    private static final int d = 155;
    private static final int e = 17;
    private static int r;
    private static class_448 f = class_448.a;
    private static boolean g = false;
    static int a = 0;
    static int b = 0;
    private static int h = 0;
    private static int i = 0;
    public static int c = 0;
    private static int j = 0;
    private static int k = 0;
    private static int l = 32;
    private static int m = 40;
    private static int n = 5;
    private static String o = null;
    private static String[] p = null;
    private static int q = 155;
    private static int s = 0;
    private static int t = 0;
    private static int u = 0;
    private static int v = 0;
    private static int w = 0;
    private static int x = 100;
    private static int y = 100;

    public static void a(int i2, String str) {
        int i3 = 57017 + (i2 * 2);
        a = i3;
        int size = class_446.e.d().size();
        int i4 = 57017 + (i2 * 2) + 1;
        int i5 = i4 - 57017;
        g = false;
        j = 0;
        k = 0;
        l = 32;
        m = 40;
        n = 5;
        h = 0;
        i = 0;
        f = class_448.a;
        o = null;
        p = null;
        q = 155;
        r = -1;
        s = 100;
        w = 0;
        u = 0;
        v = 0;
        t = 0;
        y = 100;
        x = 100;
        int i6 = 0;
        int iA = 0;
        int i7 = 0;
        int iA2 = 0;
        if (i2 >= 100) {
            return;
        }
        String strA = a(str);
        if (strA.contains("<tab")) {
            h = Integer.parseInt(strA.split("<tab=")[1].split(">")[0]);
        }
        switch (f) {
            case c:
                Widget.b(i4, x, y);
                class_102 class_102VarC = class_102.c(r);
                Widget.l(i4).ae = r;
                Widget.l(i4).aU = class_102VarC.I;
                Widget.l(i4).aV = class_102VarC.E;
                if (t > 0) {
                    Widget.l(i4).aB = t;
                } else {
                    Widget.l(i4).aB = class_102VarC.w;
                }
                if (w > 0) {
                    Widget.l(i4).aW = false;
                    Widget.l(i4).aR = w;
                } else {
                    Widget.l(i4).aW = true;
                }
                Widget.l(i3).bd = false;
                int iA3 = a() + 17 + 20;
                c = iA3 + s;
                i7 = 0 + u;
                iA2 = iA3 + v;
                break;
            case b:
                if (o != null) {
                    o = strA;
                }
                boolean z = false;
                if (p[0].contains("{M}")) {
                    p[0] = p[0].replace("{M}", "");
                    z = true;
                }
                class_343.a(i4, p).h(q, 0).g(class_492.c, class_492.e);
                if (z) {
                    ((class_343) Widget.l(i4)).b();
                }
                i6 = 5;
                i7 = 5;
                if (o != null) {
                    Widget.l(i3).as = o;
                    i7 = 5 + h;
                } else {
                    Widget.l(i3).bd = false;
                }
                if (g) {
                    i7 += (Widget.l(class_446.bI).P / 2) - (q / 2);
                    if (o != null) {
                        i6 = 5 - h;
                    }
                }
                iA2 = size == 0 ? 10 : a() + 17 + (o == null ? 0 : a(i3));
                iA = iA2 + 3;
                if (Widget.l(i3).an == Client.gh) {
                    iA += 3;
                }
                c = iA2;
                if (i == 1) {
                    c += 7;
                }
                if (i == 2) {
                    c += 9;
                }
                break;
            default:
                Widget.l(i3).as = strA;
                Widget.l(i3).bd = true;
                if (j > 0) {
                    Widget.a(i4, j, k, l);
                    Widget.l(i4).T = Widget.l(i3).T;
                    if (g) {
                        i7 = (-(Widget.l(i3).an.a(strA) / 2)) - 10;
                        i6 = 5;
                    } else {
                        i6 = m;
                        i7 = 3;
                    }
                    if (h > 0) {
                        i7 += h - (l > 20 ? l / 2 : 5);
                    }
                } else {
                    Widget.l(i4).bd = false;
                    i6 = 5;
                }
                if (size == 0) {
                    iA = j > 0 ? 17 : 7;
                    iA2 = 5;
                } else if (j > 0 || Widget.H[i3 - 1].bd) {
                    iA2 = ((a() + 17) + 3) - (Math.abs(32 - l) / 2);
                    iA = ((a() + 17) + (l / 2)) - 3;
                } else {
                    iA = a() + 17 + a(i3);
                }
                c = iA;
                break;
        }
        class_446.e.a(i3).a(i6, iA);
        class_446.e.a(i4, false).a(i7, iA2);
    }

    private static String a(String str) {
        int i2 = a;
        if (str.contains("{DD")) {
            f = class_448.b;
            p = str.split("\\{DD=")[1].split("/}")[0].split("<i>");
            if (str.contains("{SIZE=")) {
                q = Integer.parseInt(str.split("\\{SIZE=")[1].split("}")[0]);
                str = str.replace("{SIZE=" + q + "}", "");
            } else {
                q = 155;
            }
            if (str.contains("{LABEL=")) {
                str = str.split("\\{LABEL=")[1].split("/}")[0];
                o = "";
            }
        }
        if (str.contains("{NPC")) {
            String str2 = str.split("\\{NPC=")[1].split("}")[0];
            if (str2.contains(",")) {
                String[] strArrSplit = str2.split(",");
                r = Integer.parseInt(strArrSplit[0]);
                s = Integer.parseInt(strArrSplit[1]);
            } else {
                r = Integer.parseInt(str.split("\\{NPC=")[1].split("}")[0]);
            }
            if (str.contains("{Z=")) {
                w = Integer.parseInt(str.split("\\{Z=")[1].split("}")[0]);
            }
            if (str.contains("{X=")) {
                u = Integer.parseInt(str.split("\\{X=")[1].split("}")[0]);
            }
            if (str.contains("{Y=")) {
                v = Integer.parseInt(str.split("\\{Y=")[1].split("}")[0]);
            }
            if (str.contains("{A=")) {
                t = Integer.parseInt(str.split("\\{A=")[1].split("}")[0]);
            }
            if (str.contains("{SIZE=")) {
                int i3 = Integer.parseInt(str.split("\\{SIZE=")[1].split("}")[0]);
                y = i3;
                x = i3;
            }
            f = class_448.c;
            return "";
        }
        Widget.H[i2] = class_352.a(i2, str).m().a("Select option", 300);
        if (str.equalsIgnoreCase("{line}") || str.startsWith("{line=")) {
            Widget.l(i2).M = 0;
            Widget.l(i2).L = 0;
            Widget widgetL = Widget.l(i2);
            Launcher.n().o();
            widgetL.an = Client.gh;
            Widget.l(i2).S = false;
            Widget.l(i2).bp = 0;
            Widget.l(i2).br = (short) 0;
            Widget.l(i2).bq = (short) 0;
            g = false;
            if (!str.startsWith("{line=")) {
                return class_446.f;
            }
            String str3 = str.split("\\{line=")[1];
            return "<str=" + str3.substring(0, str3.indexOf("}")) + ">                                                                                                                                                    </str>";
        }
        if (str.contains("{C}")) {
            Widget.l(i2).S = true;
            Widget.l(i2).T = true;
            str = str.replace("{C}", "");
            g = true;
        } else if (str.contains("{RA}")) {
            Widget.l(i2).U = true;
            Widget.l(i2).S = false;
            Widget.l(i2).T = true;
            str = str.replace("{RA}", "");
            g = true;
        } else {
            Widget.l(i2).U = false;
            Widget.l(i2).S = false;
            Widget.l(i2).T = false;
            g = false;
        }
        if (str.contains("{L}")) {
            Widget.l(i2).M = 1;
            Widget.l(i2).L = class_492.c;
            Widget.l(i2).bm = true;
            b = i2;
            str = str.replace("{L}", "");
        } else {
            Widget.l(i2).M = 0;
            Widget.l(i2).L = 0;
            Widget.l(i2).bv = false;
        }
        if (str.contains("{B}")) {
            i = 2;
            Widget widgetL2 = Widget.l(i2);
            Launcher.n().o();
            widgetL2.an = Client.gj;
            str = str.replace("{B}", "");
        } else if (str.contains("{M}")) {
            i = 1;
            Widget.l(i2).an = Launcher.n().o().gi;
            str = str.replace("{M}", "");
        } else {
            i = 0;
            Widget widgetL3 = Widget.l(i2);
            Launcher.n().o();
            widgetL3.an = Client.gh;
        }
        if (str.contains("{H=")) {
            String str4 = str.split("\\{H=")[1];
            String strSubstring = str4.substring(0, str4.indexOf("}"));
            boolean zContains = strSubstring.contains(",");
            Widget.l(i2).bs = -1;
            if (zContains) {
                Widget.l(i2).bs = Integer.parseInt(strSubstring.split(",")[1]);
                strSubstring = strSubstring.split(",")[0];
            }
            Widget.l(i2).bp = Integer.parseInt(strSubstring);
            Widget.l(i2).br = (short) Widget.l(i2).aP;
            if (Widget.l(i2).an == Launcher.n().o().gi) {
                Widget widgetL4 = Widget.l(i2);
                widgetL4.br = (short) (widgetL4.br + 4);
            }
            class_338 class_338Var = Widget.l(i2).an;
            Launcher.n().o();
            if (class_338Var == Client.gj) {
                Widget widgetL5 = Widget.l(i2);
                widgetL5.br = (short) (widgetL5.br + 5);
            }
            Widget.l(i2).bq = (short) 75;
            str = zContains ? str.replace("{H=" + strSubstring + "," + Widget.l(i2).bs + "}", "") : str.replace("{H=" + strSubstring + "}", "");
        } else {
            Widget.l(i2).bp = 0;
            Widget.l(i2).br = (short) 0;
            Widget.l(i2).bq = (short) 0;
            Widget.l(i2).bs = -1;
        }
        if (f == class_448.a) {
            if (str.contains("{IS=")) {
                l = 20;
                m = 30;
                String strSubstring2 = str.substring(str.indexOf("{IS=") + 4, str.indexOf("}"));
                if (strSubstring2.contains(",")) {
                    j = Integer.parseInt(strSubstring2.split(",")[0]);
                    k = Integer.parseInt(strSubstring2.split(",")[1]);
                } else {
                    j = Integer.parseInt(strSubstring2);
                }
                str = str.replace("{IS=" + strSubstring2 + "}", "");
            }
            if (str.contains("{")) {
                String strSubstring3 = str.substring(str.indexOf("{") + 1, str.indexOf("}"));
                if (strSubstring3.contains(",")) {
                    j = Integer.parseInt(strSubstring3.split(",")[0]);
                    k = Integer.parseInt(strSubstring3.split(",")[1]);
                } else {
                    j = Integer.parseInt(strSubstring3);
                }
                str = str.replace("{" + strSubstring3 + "}", "");
            }
        }
        return str;
    }

    private static int a(int i2) {
        int i3 = 0;
        if (Widget.l(i2 - 2).an.q.equalsIgnoreCase("b12_full")) {
            i3 = 3;
        }
        if (Widget.l(i2 - 2).an.q.equalsIgnoreCase("p11_full") && Widget.l(i2).an.q.equalsIgnoreCase("b12_full")) {
            i3 = 3;
        }
        if (Widget.l(i2 - 2).an.q.equalsIgnoreCase("p12_full")) {
            i3 = 2;
        }
        if (Widget.l(i2 - 2).an.q.equalsIgnoreCase("p11_full") && Widget.l(i2).an.q.equalsIgnoreCase("p12_full")) {
            i3 = 2;
        }
        return i3;
    }

    private static int a() {
        return c;
    }
}
