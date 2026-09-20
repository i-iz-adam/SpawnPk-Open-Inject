/*
 * Decompiled with CFR 0.152.
 */
package rs.p_d;

import rs.p_x.C_e;
import rs.p_x.C_f;

public final class C_c {
    private static String[] a = new String[]{"ass", "bastard", "beaner", "bitch", "blow job", "blowjob", "boner", "butt pirate", "carpetmuncher", "chink", "chode", "clit", "cancer", "aids", "my cock", "his cock", "coon", "cum", "cunt", "dick", "dike", "dildo", "dipshit", "douche", "dumbass", "dumbfuck", "dumbshit", "dyke", "fag", "fagg", "faggot", "fatass", "fuck", "gay", "handjob", "hard on", "hoe", "homo", "honkey", "humping", "jackass", "jap", "jerk off", "jizz", "kunt", "kyke", "lesbian", "lesbo", "nigga", "nigger", "niglet", "porch monkey", "porchmonkey", "porn", "prick", "punta", "pussy", "pussy", "puto", "queer", "rimjob", "skank", "skeet", "slut", "spic", "shit", "splooge", "spook", "tard", "suck my", "wank", "wetback", "whore", "xxx"};
    private static int[] b;
    private static char[][] c;
    private static byte[][][] d;
    private static char[][] e;
    private static char[][] f;
    private static int[] g;
    private static final String[] h;

    public static String a(String string) {
        String string2 = string;
        for (String string3 : a) {
            if (!string.toLowerCase().contains(string3.toLowerCase())) continue;
            string2 = string2.toLowerCase().replace(string3.toLowerCase(), C_c.a(string3.length()));
        }
        return string2;
    }

    public static String a(int n) {
        Object object = "";
        for (int i = 0; i < n; ++i) {
            object = (String)object + "*";
        }
        return object;
    }

    public static void a(C_f c_f) {
        C_e c_e = new C_e(c_f.a("fragmentsenc.txt"));
        C_e c_e2 = new C_e(c_f.a("badenc.txt"));
        C_e c_e3 = new C_e(c_f.a("domainenc.txt"));
        C_e c_e4 = new C_e(c_f.a("tldlist.txt"));
        C_c.a(c_e, c_e2, c_e3, c_e4);
    }

    private static void a(C_e c_e, C_e c_e2, C_e c_e3, C_e c_e4) {
        C_c.b(c_e2);
        C_c.c(c_e3);
        C_c.d(c_e);
        C_c.a(c_e4);
    }

    private static void a(C_e c_e) {
        int n = c_e.D();
        f = new char[n][];
        g = new int[n];
        for (int i = 0; i < n; ++i) {
            C_c.g[i] = c_e.y();
            char[] cArray = new char[c_e.y()];
            for (int j = 0; j < cArray.length; ++j) {
                cArray[j] = (char)c_e.y();
            }
            C_c.f[i] = cArray;
        }
    }

    private static void b(C_e c_e) {
        int n = c_e.D();
        c = new char[n][];
        d = new byte[n][][];
        C_c.a(c_e, c, d);
    }

    private static void c(C_e c_e) {
        int n = c_e.D();
        e = new char[n][];
        C_c.a(e, c_e);
    }

    private static void d(C_e c_e) {
        b = new int[c_e.D()];
        for (int i = 0; i < b.length; ++i) {
            C_c.b[i] = c_e.A();
        }
    }

    private static void a(C_e c_e, char[][] cArray, byte[][][] byArray) {
        for (int i = 0; i < cArray.length; ++i) {
            char[] cArray2 = new char[c_e.y()];
            for (int j = 0; j < cArray2.length; ++j) {
                cArray2[j] = (char)c_e.y();
            }
            cArray[i] = cArray2;
            byte[][] byArray2 = new byte[c_e.y()][2];
            for (int j = 0; j < byArray2.length; ++j) {
                byArray2[j][0] = (byte)c_e.y();
                byArray2[j][1] = (byte)c_e.y();
            }
            if (byArray2.length <= 0) continue;
            byArray[i] = byArray2;
        }
    }

    private static void a(char[][] cArray, C_e c_e) {
        for (int i = 0; i < cArray.length; ++i) {
            char[] cArray2 = new char[c_e.y()];
            for (int j = 0; j < cArray2.length; ++j) {
                cArray2[j] = (char)c_e.y();
            }
            cArray[i] = cArray2;
        }
    }

    private static void a(char[] cArray) {
        int n;
        int n2 = 0;
        for (n = 0; n < cArray.length; ++n) {
            cArray[n2] = C_c.a(cArray[n]) ? cArray[n] : 32;
            if (n2 != 0 && cArray[n2] == ' ' && cArray[n2 - 1] == ' ') continue;
            ++n2;
        }
        for (n = n2; n < cArray.length; ++n) {
            cArray[n] = 32;
        }
    }

    private static boolean a(char c2) {
        return c2 >= ' ' && c2 <= '\u007f' || c2 == ' ' || c2 == '\n' || c2 == '\t' || c2 == '\u00a3' || c2 == '\u20ac';
    }

    public static String b(String string) {
        return string;
    }

    private static void a(char[] cArray, char[] cArray2) {
        for (int i = 0; i < cArray.length; ++i) {
            if (cArray2[i] == '*' || !C_c.h(cArray[i])) continue;
            cArray2[i] = cArray[i];
        }
    }

    private static void b(char[] cArray) {
        boolean bl = true;
        for (int i = 0; i < cArray.length; ++i) {
            char c2 = cArray[i];
            if (C_c.e(c2)) {
                if (bl) {
                    if (!C_c.g(c2)) continue;
                    bl = false;
                    continue;
                }
                if (!C_c.h(c2)) continue;
                cArray[i] = (char)(c2 + 97 - 65);
                continue;
            }
            bl = true;
        }
    }

    private static void c(char[] cArray) {
        for (int i = 0; i < 2; ++i) {
            for (int j = c.length - 1; j >= 0; --j) {
                C_c.a(d[j], cArray, c[j]);
            }
        }
    }

    private static void d(char[] cArray) {
        char[] cArray2 = (char[])cArray.clone();
        char[] cArray3 = new char[]{'(', 'a', ')'};
        C_c.a(null, cArray2, cArray3);
        char[] cArray4 = (char[])cArray.clone();
        char[] cArray5 = new char[]{'d', 'o', 't'};
        C_c.a(null, cArray4, cArray5);
        for (int i = e.length - 1; i >= 0; --i) {
            C_c.a(cArray, e[i], cArray4, cArray2);
        }
    }

    private static void a(char[] cArray, char[] cArray2, char[] cArray3, char[] cArray4) {
        int n;
        if (cArray2.length > cArray.length) {
            return;
        }
        for (int i = 0; i <= cArray.length - cArray2.length; i += n) {
            int n2;
            char c2;
            char c3;
            int n3 = i;
            int n4 = 0;
            n = 1;
            while (n3 < cArray.length) {
                c3 = cArray[n3];
                c2 = '\u0000';
                if (n3 + 1 < cArray.length) {
                    c2 = cArray[n3 + 1];
                }
                if (n4 < cArray2.length && (n2 = C_c.a(c3, cArray2[n4], c2)) > 0) {
                    n3 += n2;
                    ++n4;
                    continue;
                }
                if (n4 == 0) break;
                n2 = C_c.a(c3, cArray2[n4 - 1], c2);
                if (n2 > 0) {
                    n3 += n2;
                    if (n4 != 1) continue;
                    ++n;
                    continue;
                }
                if (n4 >= cArray2.length || !C_c.c(c3)) break;
                ++n3;
            }
            if (n4 < cArray2.length) continue;
            n2 = 0;
            c3 = C_c.a(cArray, cArray4, i);
            c2 = C_c.a(cArray3, n3 - 1, cArray);
            if (c3 > '\u0002' || c2 > '\u0002') {
                n2 = 1;
            }
            if (n2 == 0) continue;
            for (int j = i; j < n3; ++j) {
                cArray[j] = 42;
            }
        }
    }

    private static int a(char[] cArray, char[] cArray2, int n) {
        int n2;
        if (n == 0) {
            return 2;
        }
        for (n2 = n - 1; n2 >= 0 && C_c.c(cArray[n2]); --n2) {
            if (cArray[n2] != '@') continue;
            return 3;
        }
        n2 = 0;
        for (int i = n - 1; i >= 0 && C_c.c(cArray2[i]); --i) {
            if (cArray2[i] != '*') continue;
            ++n2;
        }
        if (n2 >= 3) {
            return 4;
        }
        return !C_c.c(cArray[n - 1]) ? 0 : 1;
    }

    private static int a(char[] cArray, int n, char[] cArray2) {
        int n2;
        if (n + 1 == cArray2.length) {
            return 2;
        }
        for (n2 = n + 1; n2 < cArray2.length && C_c.c(cArray2[n2]); ++n2) {
            if (cArray2[n2] != '.' && cArray2[n2] != ',') continue;
            return 3;
        }
        n2 = 0;
        for (int i = n + 1; i < cArray2.length && C_c.c(cArray[i]); ++i) {
            if (cArray[i] != '*') continue;
            ++n2;
        }
        if (n2 >= 3) {
            return 4;
        }
        return !C_c.c(cArray2[n + 1]) ? 0 : 1;
    }

    private static void e(char[] cArray) {
        char[] cArray2 = (char[])cArray.clone();
        char[] cArray3 = new char[]{'d', 'o', 't'};
        C_c.a(null, cArray2, cArray3);
        char[] cArray4 = (char[])cArray.clone();
        char[] cArray5 = new char[]{'s', 'l', 'a', 's', 'h'};
        C_c.a(null, cArray4, cArray5);
        for (int i = 0; i < f.length; ++i) {
            C_c.a(cArray4, f[i], g[i], cArray2, cArray);
        }
    }

    private static void a(char[] cArray, char[] cArray2, int n, char[] cArray3, char[] cArray4) {
        int n2;
        if (cArray2.length > cArray4.length) {
            return;
        }
        for (int i = 0; i <= cArray4.length - cArray2.length; i += n2) {
            int n3;
            int n4;
            int n5;
            char c2;
            char c3;
            int n6 = i;
            int n7 = 0;
            n2 = 1;
            while (n6 < cArray4.length) {
                c3 = cArray4[n6];
                c2 = '\u0000';
                if (n6 + 1 < cArray4.length) {
                    c2 = cArray4[n6 + 1];
                }
                if (n7 < cArray2.length && (n5 = C_c.a(c3, cArray2[n7], c2)) > 0) {
                    n6 += n5;
                    ++n7;
                    continue;
                }
                if (n7 == 0) break;
                n5 = C_c.a(c3, cArray2[n7 - 1], c2);
                if (n5 > 0) {
                    n6 += n5;
                    if (n7 != 1) continue;
                    ++n2;
                    continue;
                }
                if (n7 >= cArray2.length || !C_c.c(c3)) break;
                ++n6;
            }
            if (n7 < cArray2.length) continue;
            n5 = 0;
            c3 = C_c.b(cArray4, i, cArray3);
            c2 = C_c.b(cArray4, cArray, n6 - 1);
            if (n == 1 && c3 > '\u0000' && c2 > '\u0000') {
                n5 = 1;
            }
            if (n == 2 && (c3 > '\u0002' && c2 > '\u0000' || c3 > '\u0000' && c2 > '\u0002')) {
                n5 = 1;
            }
            if (n == 3 && c3 > '\u0000' && c2 > '\u0002') {
                n5 = 1;
            }
            if (n5 == 0) continue;
            int n8 = i;
            int n9 = n6 - 1;
            if (c3 > '\u0002') {
                if (c3 == '\u0004') {
                    n4 = 0;
                    for (n3 = n8 - 1; n3 >= 0; --n3) {
                        if (n4 != 0) {
                            if (cArray3[n3] != '*') break;
                            n8 = n3;
                            continue;
                        }
                        if (cArray3[n3] != '*') continue;
                        n8 = n3;
                        n4 = 1;
                    }
                }
                n4 = 0;
                for (n3 = n8 - 1; n3 >= 0; --n3) {
                    if (n4 != 0) {
                        if (C_c.c(cArray4[n3])) break;
                        n8 = n3;
                        continue;
                    }
                    if (C_c.c(cArray4[n3])) continue;
                    n4 = 1;
                    n8 = n3;
                }
            }
            if (c2 > '\u0002') {
                if (c2 == '\u0004') {
                    n4 = 0;
                    for (n3 = n9 + 1; n3 < cArray4.length; ++n3) {
                        if (n4 != 0) {
                            if (cArray[n3] != '*') break;
                            n9 = n3;
                            continue;
                        }
                        if (cArray[n3] != '*') continue;
                        n9 = n3;
                        n4 = 1;
                    }
                }
                n4 = 0;
                for (n3 = n9 + 1; n3 < cArray4.length; ++n3) {
                    if (n4 != 0) {
                        if (C_c.c(cArray4[n3])) break;
                        n9 = n3;
                        continue;
                    }
                    if (C_c.c(cArray4[n3])) continue;
                    n4 = 1;
                    n9 = n3;
                }
            }
            for (n4 = n8; n4 <= n9; ++n4) {
                cArray4[n4] = 42;
            }
        }
    }

    private static int b(char[] cArray, int n, char[] cArray2) {
        int n2;
        if (n == 0) {
            return 2;
        }
        for (n2 = n - 1; n2 >= 0 && C_c.c(cArray[n2]); --n2) {
            if (cArray[n2] != ',' && cArray[n2] != '.') continue;
            return 3;
        }
        n2 = 0;
        for (int i = n - 1; i >= 0 && C_c.c(cArray2[i]); --i) {
            if (cArray2[i] != '*') continue;
            ++n2;
        }
        if (n2 >= 3) {
            return 4;
        }
        return !C_c.c(cArray[n - 1]) ? 0 : 1;
    }

    private static int b(char[] cArray, char[] cArray2, int n) {
        int n2;
        if (n + 1 == cArray.length) {
            return 2;
        }
        for (n2 = n + 1; n2 < cArray.length && C_c.c(cArray[n2]); ++n2) {
            if (cArray[n2] != '\\' && cArray[n2] != '/') continue;
            return 3;
        }
        n2 = 0;
        for (int i = n + 1; i < cArray.length && C_c.c(cArray2[i]); ++i) {
            if (cArray2[i] != '*') continue;
            ++n2;
        }
        if (n2 >= 5) {
            return 4;
        }
        return !C_c.c(cArray[n + 1]) ? 0 : 1;
    }

    private static void a(byte[][] byArray, char[] cArray, char[] cArray2) {
        int n;
        if (cArray2.length > cArray.length) {
            return;
        }
        for (int i = 0; i <= cArray.length - cArray2.length; i += n) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7 = i;
            int n8 = 0;
            int n9 = 0;
            n = 1;
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            while (!(n7 >= cArray.length || bl2 && bl3)) {
                n6 = cArray[n7];
                n5 = 0;
                if (n7 + 1 < cArray.length) {
                    n5 = cArray[n7 + 1];
                }
                if (n8 < cArray2.length && (n4 = C_c.b((char)n5, (char)n6, cArray2[n8])) > 0) {
                    if (n4 == 1 && C_c.f((char)n6)) {
                        bl2 = true;
                    }
                    if (n4 == 2 && (C_c.f((char)n6) || C_c.f((char)n5))) {
                        bl2 = true;
                    }
                    n7 += n4;
                    ++n8;
                    continue;
                }
                if (n8 == 0) break;
                n4 = C_c.b((char)n5, (char)n6, cArray2[n8 - 1]);
                if (n4 > 0) {
                    n7 += n4;
                    if (n8 != 1) continue;
                    ++n;
                    continue;
                }
                if (n8 >= cArray2.length || !C_c.d((char)n6)) break;
                if (C_c.c((char)n6) && n6 != 39) {
                    bl = true;
                }
                if (C_c.f((char)n6)) {
                    bl3 = true;
                }
                if (++n9 * 100 / (++n7 - i) <= 90) continue;
                break;
            }
            if (n8 < cArray2.length || bl2 && bl3) continue;
            n4 = 1;
            if (!bl) {
                n6 = 32;
                if (i - 1 >= 0) {
                    n6 = cArray[i - 1];
                }
                n5 = 32;
                if (n7 < cArray.length) {
                    n5 = cArray[n7];
                }
                n3 = C_c.b((char)n6);
                n2 = C_c.b((char)n5);
                if (byArray != null && C_c.a((byte)n3, byArray, (byte)n2)) {
                    n4 = 0;
                }
            } else {
                n6 = 0;
                n5 = 0;
                if (i - 1 < 0 || C_c.c(cArray[i - 1]) && cArray[i - 1] != '\'') {
                    n6 = 1;
                }
                if (n7 >= cArray.length || C_c.c(cArray[n7]) && cArray[n7] != '\'') {
                    n5 = 1;
                }
                if (n6 == 0 || n5 == 0) {
                    n3 = 0;
                    n2 = i - 2;
                    if (n6 != 0) {
                        n2 = i;
                    }
                    while (n3 == 0 && n2 < n7) {
                        if (!(n2 < 0 || C_c.c(cArray[n2]) && cArray[n2] != '\'')) {
                            int n10;
                            char[] cArray3 = new char[3];
                            for (n10 = 0; !(n10 >= 3 || n2 + n10 >= cArray.length || C_c.c(cArray[n2 + n10]) && cArray[n2 + n10] != '\''); ++n10) {
                                cArray3[n10] = cArray[n2 + n10];
                            }
                            boolean bl4 = true;
                            if (n10 == 0) {
                                bl4 = false;
                            }
                            if (!(n10 >= 3 || n2 - 1 < 0 || C_c.c(cArray[n2 - 1]) && cArray[n2 - 1] != '\'')) {
                                bl4 = false;
                            }
                            if (bl4 && !C_c.g(cArray3)) {
                                n3 = 1;
                            }
                        }
                        ++n2;
                    }
                    if (n3 == 0) {
                        n4 = 0;
                    }
                }
            }
            if (n4 == 0) continue;
            n6 = 0;
            n5 = 0;
            n3 = -1;
            for (n2 = i; n2 < n7; ++n2) {
                if (C_c.f(cArray[n2])) {
                    ++n6;
                    continue;
                }
                if (!C_c.e(cArray[n2])) continue;
                ++n5;
                n3 = n2;
            }
            if (n3 > -1) {
                n6 -= n7 - 1 - n3;
            }
            if (n6 <= n5) {
                for (n2 = i; n2 < n7; ++n2) {
                    cArray[n2] = 42;
                }
                continue;
            }
            n = 1;
        }
    }

    private static boolean a(byte by, byte[][] byArray, byte by2) {
        int n = 0;
        if (byArray[n][0] == by && byArray[n][1] == by2) {
            return true;
        }
        int n2 = byArray.length - 1;
        if (byArray[n2][0] == by && byArray[n2][1] == by2) {
            return true;
        }
        do {
            int n3;
            if (byArray[n3 = (n + n2) / 2][0] == by && byArray[n3][1] == by2) {
                return true;
            }
            if (by < byArray[n3][0] || by == byArray[n3][0] && by2 < byArray[n3][1]) {
                n2 = n3;
                continue;
            }
            n = n3;
        } while (n != n2 && n + 1 != n2);
        return false;
    }

    private static int a(char c2, char c3, char c4) {
        if (c3 == c2) {
            return 1;
        }
        if (c3 == 'o' && c2 == '0') {
            return 1;
        }
        if (c3 == 'o' && c2 == '(' && c4 == ')') {
            return 2;
        }
        if (c3 == 'c' && (c2 == '(' || c2 == '<' || c2 == '[')) {
            return 1;
        }
        if (c3 == 'e' && c2 == '\u20ac') {
            return 1;
        }
        if (c3 == 's' && c2 == '$') {
            return 1;
        }
        return c3 != 'l' || c2 != 'i' ? 0 : 1;
    }

    private static int b(char c2, char c3, char c4) {
        if (c4 == c3) {
            return 1;
        }
        if (c4 >= 'a' && c4 <= 'm') {
            if (c4 == 'a') {
                if (c3 == '4' || c3 == '@' || c3 == '^') {
                    return 1;
                }
                return c3 != '/' || c2 != '\\' ? 0 : 2;
            }
            if (c4 == 'b') {
                if (c3 == '6' || c3 == '8') {
                    return 1;
                }
                return !(c3 == '1' && c2 == '3' || c3 == 'i' && c2 == '3') ? 0 : 2;
            }
            if (c4 == 'c') {
                return c3 != '(' && c3 != '<' && c3 != '{' && c3 != '[' ? 0 : 1;
            }
            if (c4 == 'd') {
                return !(c3 == '[' && c2 == ')' || c3 == 'i' && c2 == ')') ? 0 : 2;
            }
            if (c4 == 'e') {
                return c3 != '3' && c3 != '\u20ac' ? 0 : 1;
            }
            if (c4 == 'f') {
                if (c3 == 'p' && c2 == 'h') {
                    return 2;
                }
                return c3 != '\u00a3' ? 0 : 1;
            }
            if (c4 == 'g') {
                return c3 != '9' && c3 != '6' && c3 != 'q' ? 0 : 1;
            }
            if (c4 == 'h') {
                return c3 != '#' ? 0 : 1;
            }
            if (c4 == 'i') {
                return c3 != 'y' && c3 != 'l' && c3 != 'j' && c3 != '1' && c3 != '!' && c3 != ':' && c3 != ';' && c3 != '|' ? 0 : 1;
            }
            if (c4 == 'j') {
                return 0;
            }
            if (c4 == 'k') {
                return 0;
            }
            if (c4 == 'l') {
                return c3 != '1' && c3 != '|' && c3 != 'i' ? 0 : 1;
            }
            if (c4 == 'm') {
                return 0;
            }
        }
        if (c4 >= 'n' && c4 <= 'z') {
            if (c4 == 'n') {
                return 0;
            }
            if (c4 == 'o') {
                if (c3 == '0' || c3 == '*') {
                    return 1;
                }
                return !(c3 == '(' && c2 == ')' || c3 == '[' && c2 == ']' || c3 == '{' && c2 == '}' || c3 == '<' && c2 == '>') ? 0 : 2;
            }
            if (c4 == 'p') {
                return 0;
            }
            if (c4 == 'q') {
                return 0;
            }
            if (c4 == 'r') {
                return 0;
            }
            if (c4 == 's') {
                return c3 != '5' && c3 != 'z' && c3 != '$' && c3 != '2' ? 0 : 1;
            }
            if (c4 == 't') {
                return c3 != '7' && c3 != '+' ? 0 : 1;
            }
            if (c4 == 'u') {
                if (c3 == 'v') {
                    return 1;
                }
                return !(c3 == '\\' && c2 == '/' || c3 == '\\' && c2 == '|' || c3 == '|' && c2 == '/') ? 0 : 2;
            }
            if (c4 == 'v') {
                return !(c3 == '\\' && c2 == '/' || c3 == '\\' && c2 == '|' || c3 == '|' && c2 == '/') ? 0 : 2;
            }
            if (c4 == 'w') {
                return c3 != 'v' || c2 != 'v' ? 0 : 2;
            }
            if (c4 == 'x') {
                return !(c3 == ')' && c2 == '(' || c3 == '}' && c2 == '{' || c3 == ']' && c2 == '[' || c3 == '>' && c2 == '<') ? 0 : 2;
            }
            if (c4 == 'y') {
                return 0;
            }
            if (c4 == 'z') {
                return 0;
            }
        }
        if (c4 >= '0' && c4 <= '9') {
            if (c4 == '0') {
                if (c3 == 'o' || c3 == 'O') {
                    return 1;
                }
                return !(c3 == '(' && c2 == ')' || c3 == '{' && c2 == '}' || c3 == '[' && c2 == ']') ? 0 : 2;
            }
            if (c4 == '1') {
                return c3 != 'l' ? 0 : 1;
            }
            return 0;
        }
        if (c4 == ',') {
            return c3 != '.' ? 0 : 1;
        }
        if (c4 == '.') {
            return c3 != ',' ? 0 : 1;
        }
        if (c4 == '!') {
            return c3 != 'i' ? 0 : 1;
        }
        return 0;
    }

    private static byte b(char c2) {
        if (c2 >= 'a' && c2 <= 'z') {
            return (byte)(c2 - 97 + 1);
        }
        if (c2 == '\'') {
            return 28;
        }
        if (c2 >= '0' && c2 <= '9') {
            return (byte)(c2 - 48 + 29);
        }
        return 27;
    }

    private static void f(char[] cArray) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while ((n = C_c.a(cArray, n2)) != -1) {
            int n5;
            int n6;
            boolean bl = false;
            for (n6 = n2; n6 >= 0 && n6 < n && !bl; ++n6) {
                if (C_c.c(cArray[n6]) || C_c.d(cArray[n6])) continue;
                bl = true;
            }
            if (bl) {
                n3 = 0;
            }
            if (n3 == 0) {
                n4 = n;
            }
            n2 = C_c.b(cArray, n);
            n6 = 0;
            for (n5 = n; n5 < n2; ++n5) {
                n6 = n6 * 10 + cArray[n5] - 48;
            }
            n3 = n6 > 255 || n2 - n > 8 ? 0 : ++n3;
            if (n3 != 4) continue;
            for (n5 = n4; n5 < n2; ++n5) {
                cArray[n5] = 42;
            }
            n3 = 0;
        }
    }

    private static int a(char[] cArray, int n) {
        for (int i = n; i < cArray.length && i >= 0; ++i) {
            if (cArray[i] < '0' || cArray[i] > '9') continue;
            return i;
        }
        return -1;
    }

    private static int b(char[] cArray, int n) {
        for (int i = n; i < cArray.length && i >= 0; ++i) {
            if (cArray[i] >= '0' && cArray[i] <= '9') continue;
            return i;
        }
        return cArray.length;
    }

    private static boolean c(char c2) {
        return !C_c.e(c2) && !C_c.f(c2);
    }

    private static boolean d(char c2) {
        return c2 < 'a' || c2 > 'z' || c2 == 'v' || c2 == 'x' || c2 == 'j' || c2 == 'q' || c2 == 'z';
    }

    private static boolean e(char c2) {
        return c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z';
    }

    private static boolean f(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean g(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    private static boolean h(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    private static boolean g(char[] cArray) {
        int n;
        boolean bl = true;
        for (n = 0; n < cArray.length; ++n) {
            if (C_c.f(cArray[n]) || cArray[n] == '\u0000') continue;
            bl = false;
        }
        if (bl) {
            return true;
        }
        n = C_c.h(cArray);
        int n2 = 0;
        int n3 = b.length - 1;
        if (n == b[n2] || n == b[n3]) {
            return true;
        }
        do {
            int n4;
            if (n == b[n4 = (n2 + n3) / 2]) {
                return true;
            }
            if (n < b[n4]) {
                n3 = n4;
                continue;
            }
            n2 = n4;
        } while (n2 != n3 && n2 + 1 != n3);
        return false;
    }

    private static int h(char[] cArray) {
        if (cArray.length > 6) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < cArray.length; ++i) {
            char c2 = cArray[cArray.length - i - 1];
            if (c2 >= 'a' && c2 <= 'z') {
                n = n * 38 + (c2 - 97 + 1);
                continue;
            }
            if (c2 == '\'') {
                n = n * 38 + 27;
                continue;
            }
            if (c2 >= '0' && c2 <= '9') {
                n = n * 38 + (c2 - 48 + 28);
                continue;
            }
            if (c2 == '\u0000') continue;
            return 0;
        }
        return n;
    }

    static {
        h = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
    }
}

