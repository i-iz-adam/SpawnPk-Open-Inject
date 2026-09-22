package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_101.class */
public final class class_101 {
    private static int[] b;
    private static char[][] c;
    private static byte[][][] d;
    private static char[][] e;
    private static char[][] f;
    private static int[] g;
    private static String[] a = {"ass", "bastard", "beaner", "bitch", "blow job", "blowjob", "boner", "butt pirate", "carpetmuncher", "chink", "chode", "clit", "cancer", "aids", "my cock", "his cock", "coon", "cum", "cunt", "dick", "dike", "dildo", "dipshit", "douche", "dumbass", "dumbfuck", "dumbshit", "dyke", "fag", "fagg", "faggot", "fatass", "fuck", "gay", "handjob", "hard on", "hoe", "homo", "honkey", "humping", "jackass", "jap", "jerk off", "jizz", "kunt", "kyke", "lesbian", "lesbo", "nigga", "nigger", "niglet", "porch monkey", "porchmonkey", "porn", "prick", "punta", "pussy", "pussy", "puto", "queer", "rimjob", "skank", "skeet", "slut", "spic", "shit", "splooge", "spook", "tard", "suck my", "wank", "wetback", "whore", "xxx"};
    private static final String[] h = {"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};

    public static String a(String str) {
        String strReplace = str;
        for (String str2 : a) {
            if (str.toLowerCase().contains(str2.toLowerCase())) {
                strReplace = strReplace.toLowerCase().replace(str2.toLowerCase(), a(str2.length()));
            }
        }
        return strReplace;
    }

    public static String a(int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + "*";
        }
        return str;
    }

    public static void a(class_663 class_663Var) {
        a(new Buffer(class_663Var.a("fragmentsenc.txt")), new Buffer(class_663Var.a("badenc.txt")), new Buffer(class_663Var.a("domainenc.txt")), new Buffer(class_663Var.a("tldlist.txt")));
    }

    private static void a(Buffer buffer, Buffer buffer2, Buffer buffer3, Buffer buffer4) {
        b(buffer2);
        c(buffer3);
        d(buffer);
        a(buffer4);
    }

    private static void a(Buffer buffer) {
        int iD = buffer.D();
        f = new char[iD][];
        g = new int[iD];
        for (int i = 0; i < iD; i++) {
            g[i] = buffer.y();
            char[] cArr = new char[buffer.y()];
            for (int i2 = 0; i2 < cArr.length; i2++) {
                cArr[i2] = (char) buffer.y();
            }
            f[i] = cArr;
        }
    }

    private static void b(Buffer buffer) {
        int iD = buffer.D();
        c = new char[iD][];
        d = new byte[iD][][];
        a(buffer, c, d);
    }

    private static void c(Buffer buffer) {
        e = new char[buffer.D()][];
        a(e, buffer);
    }

    private static void d(Buffer buffer) {
        b = new int[buffer.D()];
        for (int i = 0; i < b.length; i++) {
            b[i] = buffer.A();
        }
    }

    private static void a(Buffer buffer, char[][] cArr, byte[][][] bArr) {
        for (int i = 0; i < cArr.length; i++) {
            char[] cArr2 = new char[buffer.y()];
            for (int i2 = 0; i2 < cArr2.length; i2++) {
                cArr2[i2] = (char) buffer.y();
            }
            cArr[i] = cArr2;
            byte[][] bArr2 = new byte[buffer.y()][2];
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                bArr2[i3][0] = (byte) buffer.y();
                bArr2[i3][1] = (byte) buffer.y();
            }
            if (bArr2.length > 0) {
                bArr[i] = bArr2;
            }
        }
    }

    private static void a(char[][] cArr, Buffer buffer) {
        for (int i = 0; i < cArr.length; i++) {
            char[] cArr2 = new char[buffer.y()];
            for (int i2 = 0; i2 < cArr2.length; i2++) {
                cArr2[i2] = (char) buffer.y();
            }
            cArr[i] = cArr2;
        }
    }

    private static void a(char[] cArr) {
        int i = 0;
        for (int i2 = 0; i2 < cArr.length; i2++) {
            if (a(cArr[i2])) {
                cArr[i] = cArr[i2];
            } else {
                cArr[i] = ' ';
            }
            if (i == 0 || cArr[i] != ' ' || cArr[i - 1] != ' ') {
                i++;
            }
        }
        for (int i3 = i; i3 < cArr.length; i3++) {
            cArr[i3] = ' ';
        }
    }

    private static boolean a(char c2) {
        return (c2 >= ' ' && c2 <= 127) || c2 == ' ' || c2 == '\n' || c2 == '\t' || c2 == 163 || c2 == 8364;
    }

    public static String b(String str) {
        return str;
    }

    private static void a(char[] cArr, char[] cArr2) {
        for (int i = 0; i < cArr.length; i++) {
            if (cArr2[i] != '*' && h(cArr[i])) {
                cArr2[i] = cArr[i];
            }
        }
    }

    private static void b(char[] cArr) {
        boolean z = true;
        for (int i = 0; i < cArr.length; i++) {
            char c2 = cArr[i];
            if (!e(c2)) {
                z = true;
            } else if (z) {
                if (g(c2)) {
                    z = false;
                }
            } else if (h(c2)) {
                cArr[i] = (char) ((c2 + 'a') - 65);
            }
        }
    }

    private static void c(char[] cArr) {
        for (int i = 0; i < 2; i++) {
            for (int length = c.length - 1; length >= 0; length--) {
                a(d[length], cArr, c[length]);
            }
        }
    }

    private static void d(char[] cArr) {
        char[] cArr2 = (char[]) cArr.clone();
        a((byte[][]) null, cArr2, new char[]{'(', 'a', ')'});
        char[] cArr3 = (char[]) cArr.clone();
        a((byte[][]) null, cArr3, new char[]{'d', 'o', 't'});
        for (int length = e.length - 1; length >= 0; length--) {
            a(cArr, e[length], cArr3, cArr2);
        }
    }

    private static void a(char[] cArr, char[] cArr2, char[] cArr3, char[] cArr4) {
        int iA;
        if (cArr2.length > cArr.length) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 > cArr.length - cArr2.length) {
                return;
            }
            int i3 = i2;
            int i4 = 0;
            int i5 = 1;
            while (i3 < cArr.length) {
                char c2 = cArr[i3];
                char c3 = i3 + 1 < cArr.length ? cArr[i3 + 1] : (char) 0;
                if (i4 < cArr2.length && (iA = a(c2, cArr2[i4], c3)) > 0) {
                    i3 += iA;
                    i4++;
                } else {
                    if (i4 == 0) {
                        break;
                    }
                    int iA2 = a(c2, cArr2[i4 - 1], c3);
                    if (iA2 > 0) {
                        i3 += iA2;
                        if (i4 == 1) {
                            i5++;
                        }
                    } else if (i4 >= cArr2.length || !c(c2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (i4 >= cArr2.length) {
                if (a(cArr, cArr4, i2) > 2 || a(cArr3, i3 - 1, cArr) > 2) {
                    for (int i6 = i2; i6 < i3; i6++) {
                        cArr[i6] = '*';
                    }
                }
            }
            i = i2 + i5;
        }
    }

    private static int a(char[] cArr, char[] cArr2, int i) {
        if (i == 0) {
            return 2;
        }
        for (int i2 = i - 1; i2 >= 0 && c(cArr[i2]); i2--) {
            if (cArr[i2] == '@') {
                return 3;
            }
        }
        int i3 = 0;
        for (int i4 = i - 1; i4 >= 0 && c(cArr2[i4]); i4--) {
            if (cArr2[i4] == '*') {
                i3++;
            }
        }
        if (i3 >= 3) {
            return 4;
        }
        return !c(cArr[i - 1]) ? 0 : 1;
    }

    private static int a(char[] cArr, int i, char[] cArr2) {
        if (i + 1 == cArr2.length) {
            return 2;
        }
        for (int i2 = i + 1; i2 < cArr2.length && c(cArr2[i2]); i2++) {
            if (cArr2[i2] == '.' || cArr2[i2] == ',') {
                return 3;
            }
        }
        int i3 = 0;
        for (int i4 = i + 1; i4 < cArr2.length && c(cArr[i4]); i4++) {
            if (cArr[i4] == '*') {
                i3++;
            }
        }
        if (i3 >= 3) {
            return 4;
        }
        return !c(cArr2[i + 1]) ? 0 : 1;
    }

    private static void e(char[] cArr) {
        char[] cArr2 = (char[]) cArr.clone();
        a((byte[][]) null, cArr2, new char[]{'d', 'o', 't'});
        char[] cArr3 = (char[]) cArr.clone();
        a((byte[][]) null, cArr3, new char[]{'s', 'l', 'a', 's', 'h'});
        for (int i = 0; i < f.length; i++) {
            a(cArr3, f[i], g[i], cArr2, cArr);
        }
    }

    private static void a(char[] cArr, char[] cArr2, int i, char[] cArr3, char[] cArr4) {
        int iA;
        if (cArr2.length > cArr4.length) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 > cArr4.length - cArr2.length) {
                return;
            }
            int i4 = i3;
            int i5 = 0;
            int i6 = 1;
            while (i4 < cArr4.length) {
                char c2 = cArr4[i4];
                char c3 = i4 + 1 < cArr4.length ? cArr4[i4 + 1] : (char) 0;
                if (i5 < cArr2.length && (iA = a(c2, cArr2[i5], c3)) > 0) {
                    i4 += iA;
                    i5++;
                } else {
                    if (i5 == 0) {
                        break;
                    }
                    int iA2 = a(c2, cArr2[i5 - 1], c3);
                    if (iA2 > 0) {
                        i4 += iA2;
                        if (i5 == 1) {
                            i6++;
                        }
                    } else if (i5 >= cArr2.length || !c(c2)) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (i5 >= cArr2.length) {
                boolean z = false;
                int iB = b(cArr4, i3, cArr3);
                int iB2 = b(cArr4, cArr, i4 - 1);
                if (i == 1 && iB > 0 && iB2 > 0) {
                    z = true;
                }
                if (i == 2 && ((iB > 2 && iB2 > 0) || (iB > 0 && iB2 > 2))) {
                    z = true;
                }
                if (i == 3 && iB > 0 && iB2 > 2) {
                    z = true;
                }
                if (z) {
                    int i7 = i3;
                    int i8 = i4 - 1;
                    if (iB > 2) {
                        if (iB == 4) {
                            boolean z2 = false;
                            for (int i9 = i7 - 1; i9 >= 0; i9--) {
                                if (z2) {
                                    if (cArr3[i9] != '*') {
                                        break;
                                    } else {
                                        i7 = i9;
                                    }
                                } else if (cArr3[i9] == '*') {
                                    i7 = i9;
                                    z2 = true;
                                }
                            }
                        }
                        boolean z3 = false;
                        for (int i10 = i7 - 1; i10 >= 0; i10--) {
                            if (z3) {
                                if (c(cArr4[i10])) {
                                    break;
                                } else {
                                    i7 = i10;
                                }
                            } else if (!c(cArr4[i10])) {
                                z3 = true;
                                i7 = i10;
                            }
                        }
                    }
                    if (iB2 > 2) {
                        if (iB2 == 4) {
                            boolean z4 = false;
                            for (int i11 = i8 + 1; i11 < cArr4.length; i11++) {
                                if (z4) {
                                    if (cArr[i11] != '*') {
                                        break;
                                    } else {
                                        i8 = i11;
                                    }
                                } else if (cArr[i11] == '*') {
                                    i8 = i11;
                                    z4 = true;
                                }
                            }
                        }
                        boolean z5 = false;
                        for (int i12 = i8 + 1; i12 < cArr4.length; i12++) {
                            if (z5) {
                                if (c(cArr4[i12])) {
                                    break;
                                } else {
                                    i8 = i12;
                                }
                            } else if (!c(cArr4[i12])) {
                                z5 = true;
                                i8 = i12;
                            }
                        }
                    }
                    for (int i13 = i7; i13 <= i8; i13++) {
                        cArr4[i13] = '*';
                    }
                }
            }
            i2 = i3 + i6;
        }
    }

    private static int b(char[] cArr, int i, char[] cArr2) {
        if (i == 0) {
            return 2;
        }
        for (int i2 = i - 1; i2 >= 0 && c(cArr[i2]); i2--) {
            if (cArr[i2] == ',' || cArr[i2] == '.') {
                return 3;
            }
        }
        int i3 = 0;
        for (int i4 = i - 1; i4 >= 0 && c(cArr2[i4]); i4--) {
            if (cArr2[i4] == '*') {
                i3++;
            }
        }
        if (i3 >= 3) {
            return 4;
        }
        return !c(cArr[i - 1]) ? 0 : 1;
    }

    private static int b(char[] cArr, char[] cArr2, int i) {
        if (i + 1 == cArr.length) {
            return 2;
        }
        for (int i2 = i + 1; i2 < cArr.length && c(cArr[i2]); i2++) {
            if (cArr[i2] == '\\' || cArr[i2] == '/') {
                return 3;
            }
        }
        int i3 = 0;
        for (int i4 = i + 1; i4 < cArr.length && c(cArr2[i4]); i4++) {
            if (cArr2[i4] == '*') {
                i3++;
            }
        }
        if (i3 >= 5) {
            return 4;
        }
        return !c(cArr[i + 1]) ? 0 : 1;
    }

    private static void a(byte[][] bArr, char[] cArr, char[] cArr2) {
        int iB;
        if (cArr2.length > cArr.length) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 > cArr.length - cArr2.length) {
                return;
            }
            int i3 = i2;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (i3 < cArr.length && (!z2 || !z3)) {
                char c2 = cArr[i3];
                char c3 = i3 + 1 < cArr.length ? cArr[i3 + 1] : (char) 0;
                if (i4 >= cArr2.length || (iB = b(c3, c2, cArr2[i4])) <= 0) {
                    if (i4 == 0) {
                        break;
                    }
                    int iB2 = b(c3, c2, cArr2[i4 - 1]);
                    if (iB2 <= 0) {
                        if (i4 >= cArr2.length || !d(c2)) {
                            break;
                        }
                        if (c(c2) && c2 != '\'') {
                            z = true;
                        }
                        if (f(c2)) {
                            z3 = true;
                        }
                        i3++;
                        i5++;
                        if ((i5 * 100) / (i3 - i2) > 90) {
                            break;
                        }
                    } else {
                        i3 += iB2;
                        if (i4 == 1) {
                            i6++;
                        }
                    }
                } else {
                    if (iB == 1 && f(c2)) {
                        z2 = true;
                    }
                    if (iB == 2 && (f(c2) || f(c3))) {
                        z2 = true;
                    }
                    i3 += iB;
                    i4++;
                }
            }
            if (i4 >= cArr2.length && (!z2 || !z3)) {
                boolean z4 = true;
                if (z) {
                    boolean z5 = false;
                    boolean z6 = false;
                    if (i2 - 1 < 0 || (c(cArr[i2 - 1]) && cArr[i2 - 1] != '\'')) {
                        z5 = true;
                    }
                    if (i3 >= cArr.length || (c(cArr[i3]) && cArr[i3] != '\'')) {
                        z6 = true;
                    }
                    if (!z5 || !z6) {
                        boolean z7 = false;
                        int i7 = i2 - 2;
                        if (z5) {
                            i7 = i2;
                        }
                        while (!z7 && i7 < i3) {
                            if (i7 >= 0 && (!c(cArr[i7]) || cArr[i7] == '\'')) {
                                char[] cArr3 = new char[3];
                                int i8 = 0;
                                while (i8 < 3 && i7 + i8 < cArr.length && (!c(cArr[i7 + i8]) || cArr[i7 + i8] == '\'')) {
                                    cArr3[i8] = cArr[i7 + i8];
                                    i8++;
                                }
                                boolean z8 = i8 != 0;
                                if (i8 < 3 && i7 - 1 >= 0 && (!c(cArr[i7 - 1]) || cArr[i7 - 1] == '\'')) {
                                    z8 = false;
                                }
                                if (z8 && !g(cArr3)) {
                                    z7 = true;
                                }
                            }
                            i7++;
                        }
                        if (!z7) {
                            z4 = false;
                        }
                    }
                } else {
                    char c4 = i2 - 1 >= 0 ? cArr[i2 - 1] : ' ';
                    char c5 = i3 < cArr.length ? cArr[i3] : ' ';
                    byte b2 = b(c4);
                    byte b3 = b(c5);
                    if (bArr != null && a(b2, bArr, b3)) {
                        z4 = false;
                    }
                }
                if (z4) {
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = -1;
                    for (int i12 = i2; i12 < i3; i12++) {
                        if (f(cArr[i12])) {
                            i9++;
                        } else if (e(cArr[i12])) {
                            i10++;
                            i11 = i12;
                        }
                    }
                    if (i11 > -1) {
                        i9 -= (i3 - 1) - i11;
                    }
                    if (i9 <= i10) {
                        for (int i13 = i2; i13 < i3; i13++) {
                            cArr[i13] = '*';
                        }
                    } else {
                        i6 = 1;
                    }
                }
            }
            i = i2 + i6;
        }
    }

    private static boolean a(byte b2, byte[][] bArr, byte b3) {
        int i = 0;
        if (bArr[0][0] == b2 && bArr[0][1] == b3) {
            return true;
        }
        int length = bArr.length - 1;
        if (bArr[length][0] == b2 && bArr[length][1] == b3) {
            return true;
        }
        do {
            int i2 = (i + length) / 2;
            if (bArr[i2][0] == b2 && bArr[i2][1] == b3) {
                return true;
            }
            if (b2 < bArr[i2][0] || (b2 == bArr[i2][0] && b3 < bArr[i2][1])) {
                length = i2;
            } else {
                i = i2;
            }
            if (i == length) {
                return false;
            }
        } while (i + 1 != length);
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
        if (c3 == 'e' && c2 == 8364) {
            return 1;
        }
        if (c3 == 's' && c2 == '$') {
            return 1;
        }
        return (c3 == 'l' && c2 == 'i') ? 1 : 0;
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
                return (c3 == '/' && c2 == '\\') ? 2 : 0;
            }
            if (c4 == 'b') {
                if (c3 == '6' || c3 == '8') {
                    return 1;
                }
                return ((c3 == '1' && c2 == '3') || (c3 == 'i' && c2 == '3')) ? 2 : 0;
            }
            if (c4 == 'c') {
                return (c3 == '(' || c3 == '<' || c3 == '{' || c3 == '[') ? 1 : 0;
            }
            if (c4 == 'd') {
                return ((c3 == '[' && c2 == ')') || (c3 == 'i' && c2 == ')')) ? 2 : 0;
            }
            if (c4 == 'e') {
                return (c3 == '3' || c3 == 8364) ? 1 : 0;
            }
            if (c4 == 'f') {
                if (c3 == 'p' && c2 == 'h') {
                    return 2;
                }
                return c3 != 163 ? 0 : 1;
            }
            if (c4 == 'g') {
                return (c3 == '9' || c3 == '6' || c3 == 'q') ? 1 : 0;
            }
            if (c4 == 'h') {
                return c3 != '#' ? 0 : 1;
            }
            if (c4 == 'i') {
                return (c3 == 'y' || c3 == 'l' || c3 == 'j' || c3 == '1' || c3 == '!' || c3 == ':' || c3 == ';' || c3 == '|') ? 1 : 0;
            }
            if (c4 == 'j' || c4 == 'k') {
                return 0;
            }
            if (c4 == 'l') {
                return (c3 == '1' || c3 == '|' || c3 == 'i') ? 1 : 0;
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
                return ((c3 == '(' && c2 == ')') || (c3 == '[' && c2 == ']') || ((c3 == '{' && c2 == '}') || (c3 == '<' && c2 == '>'))) ? 2 : 0;
            }
            if (c4 == 'p' || c4 == 'q' || c4 == 'r') {
                return 0;
            }
            if (c4 == 's') {
                return (c3 == '5' || c3 == 'z' || c3 == '$' || c3 == '2') ? 1 : 0;
            }
            if (c4 == 't') {
                return (c3 == '7' || c3 == '+') ? 1 : 0;
            }
            if (c4 == 'u') {
                if (c3 == 'v') {
                    return 1;
                }
                return ((c3 == '\\' && c2 == '/') || (c3 == '\\' && c2 == '|') || (c3 == '|' && c2 == '/')) ? 2 : 0;
            }
            if (c4 == 'v') {
                return ((c3 == '\\' && c2 == '/') || (c3 == '\\' && c2 == '|') || (c3 == '|' && c2 == '/')) ? 2 : 0;
            }
            if (c4 == 'w') {
                return (c3 == 'v' && c2 == 'v') ? 2 : 0;
            }
            if (c4 == 'x') {
                return ((c3 == ')' && c2 == '(') || (c3 == '}' && c2 == '{') || ((c3 == ']' && c2 == '[') || (c3 == '>' && c2 == '<'))) ? 2 : 0;
            }
            if (c4 == 'y' || c4 == 'z') {
                return 0;
            }
        }
        if (c4 < '0' || c4 > '9') {
            if (c4 == ',') {
                return c3 != '.' ? 0 : 1;
            }
            if (c4 == '.') {
                return c3 != ',' ? 0 : 1;
            }
            return (c4 == '!' && c3 == 'i') ? 1 : 0;
        }
        if (c4 != '0') {
            return (c4 == '1' && c3 == 'l') ? 1 : 0;
        }
        if (c3 == 'o' || c3 == 'O') {
            return 1;
        }
        return ((c3 == '(' && c2 == ')') || (c3 == '{' && c2 == '}') || (c3 == '[' && c2 == ']')) ? 2 : 0;
    }

    private static byte b(char c2) {
        if (c2 >= 'a' && c2 <= 'z') {
            return (byte) ((c2 - 'a') + 1);
        }
        if (c2 == '\'') {
            return (byte) 28;
        }
        if (c2 < '0' || c2 > '9') {
            return (byte) 27;
        }
        return (byte) ((c2 - '0') + 29);
    }

    private static void f(char[] cArr) {
        int iB = 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int iA = a(cArr, iB);
            if (iA == -1) {
                return;
            }
            boolean z = false;
            for (int i3 = iB; i3 >= 0 && i3 < iA && !z; i3++) {
                if (!c(cArr[i3]) && !d(cArr[i3])) {
                    z = true;
                }
            }
            if (z) {
                i = 0;
            }
            if (i == 0) {
                i2 = iA;
            }
            iB = b(cArr, iA);
            int i4 = 0;
            for (int i5 = iA; i5 < iB; i5++) {
                i4 = ((i4 * 10) + cArr[i5]) - 48;
            }
            i = (i4 > 255 || iB - iA > 8) ? 0 : i + 1;
            if (i == 4) {
                for (int i6 = i2; i6 < iB; i6++) {
                    cArr[i6] = '*';
                }
                i = 0;
            }
        }
    }

    private static int a(char[] cArr, int i) {
        for (int i2 = i; i2 < cArr.length && i2 >= 0; i2++) {
            if (cArr[i2] >= '0' && cArr[i2] <= '9') {
                return i2;
            }
        }
        return -1;
    }

    private static int b(char[] cArr, int i) {
        for (int i2 = i; i2 < cArr.length && i2 >= 0; i2++) {
            if (cArr[i2] < '0' || cArr[i2] > '9') {
                return i2;
            }
        }
        return cArr.length;
    }

    private static boolean c(char c2) {
        return (e(c2) || f(c2)) ? false : true;
    }

    private static boolean d(char c2) {
        return c2 < 'a' || c2 > 'z' || c2 == 'v' || c2 == 'x' || c2 == 'j' || c2 == 'q' || c2 == 'z';
    }

    private static boolean e(char c2) {
        return (c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z');
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

    private static boolean g(char[] cArr) {
        boolean z = true;
        for (int i = 0; i < cArr.length; i++) {
            if (!f(cArr[i]) && cArr[i] != 0) {
                z = false;
            }
        }
        if (z) {
            return true;
        }
        int iH = h(cArr);
        int i2 = 0;
        int length = b.length - 1;
        if (iH == b[0] || iH == b[length]) {
            return true;
        }
        do {
            int i3 = (i2 + length) / 2;
            if (iH == b[i3]) {
                return true;
            }
            if (iH < b[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
            if (i2 == length) {
                return false;
            }
        } while (i2 + 1 != length);
        return false;
    }

    private static int h(char[] cArr) {
        if (cArr.length > 6) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c2 = cArr[(cArr.length - i2) - 1];
            if (c2 >= 'a' && c2 <= 'z') {
                i = (i * 38) + (c2 - 'a') + 1;
            } else if (c2 == '\'') {
                i = (i * 38) + 27;
            } else if (c2 >= '0' && c2 <= '9') {
                i = (i * 38) + (c2 - '0') + 28;
            } else if (c2 != 0) {
                return 0;
            }
        }
        return i;
    }
}
