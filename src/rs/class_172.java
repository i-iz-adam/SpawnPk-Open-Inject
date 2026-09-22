package rs;

import java.util.Locale;

/* JADX INFO: loaded from: client-final.jar:rs/class_172.class */
public class class_172 {
    public static final int a = 200;
    public static int b = 0;
    public static int c = 1;
    public static int d = 2;
    public static int e = 3;
    public static int f = 5;
    public static int g = 11;
    public static int h = 12;
    public static int i = 20;
    public static int j = 0;
    public static int k = 1;
    public static int l = 2;
    public static int m = 5;
    public static int n = 4;
    public static int o = 6;
    public static int p = 7;
    public static int q = 3;
    public static int r = 8;
    public static int s = 15;
    public static int t = 16;
    public static int u = 17;
    public static int v = 0;
    public static int w = 1;
    public static int x = 2;
    public static int y = 3;
    public static int z = 4;
    private static final String[] A = {"you can", "you must", "you do", "you need", "is full", "not enough", "<item=", "rules", "costs", "requires", "players online"};
    private static final String[] B = {" received ", " successfully enchanted ", " has killed ", "killstreak", "has encountered", "just captured"};
    private static final String C = "<y>";
    private static final String D = "<c>";

    public static int a(String str, int i2) {
        if (i2 == j) {
            if (str.startsWith("<img=2><shad=FFFF3F><col=FE610C> News: </shad></col>")) {
                return s;
            }
            if (str.startsWith(C)) {
                return u;
            }
            if (str.startsWith("Please wait at least") && str.endsWith("each yell message!")) {
                return u;
            }
            if (str.startsWith(D)) {
                return t;
            }
            if (str.contains("Clan Chat channel-mate")) {
                return t;
            }
        }
        return i2;
    }

    public static String b(String str, int i2) {
        if (i2 == t) {
            return str.replace(D, "");
        }
        return i2 == u ? str.replace(C, "") : str;
    }

    public static boolean c(String str, int i2) {
        if (i2 == j && a(str)) {
            return true;
        }
        if (i2 == s && b(str)) {
            return true;
        }
        if (i2 != u && i2 != t) {
            return false;
        }
        for (int i3 = 0; i3 < class_326.e.length; i3++) {
            if (str.contains("<img=" + class_326.e[i3] + ">")) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("<img")) {
            return false;
        }
        for (String str2 : A) {
            if (lowerCase.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        for (String str2 : B) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
