package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_39.class */
public final class class_39 {
    public static final String a = ":";
    public static final String b = "*";
    private static final char[] c = {'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static long a(String str) {
        long j = 0;
        for (int i = 0; i < str.length() && i < 12; i++) {
            char cCharAt = str.charAt(i);
            j *= 37;
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                j += (long) ((1 + cCharAt) - 65);
            } else if (cCharAt >= 'a' && cCharAt <= 'z') {
                j += (long) ((1 + cCharAt) - 97);
            } else if (cCharAt >= '0' && cCharAt <= '9') {
                j += (long) ((27 + cCharAt) - 48);
            }
        }
        while (j % 37 == 0 && j != 0) {
            j /= 37;
        }
        return j;
    }

    public static String a(long j) {
        if (j <= 0 || j >= 6582952005840035281L) {
            return "invalid_name";
        }
        try {
            if (j % 37 == 0) {
                return "invalid_name";
            }
            int i = 0;
            char[] cArr = new char[12];
            while (j != 0) {
                long j2 = j;
                j /= 37;
                int i2 = i;
                i++;
                cArr[11 - i2] = c[(int) (j2 - (j * 37))];
            }
            return new String(cArr, 12 - i, i);
        } catch (RuntimeException e) {
            long j3 = j;
            e.toString();
            class_650.e("81570, " + j3 + ", -99, " + j3);
            throw new RuntimeException();
        }
    }

    public static long b(String str) {
        String upperCase = str.toUpperCase();
        long j = 0;
        for (int i = 0; i < upperCase.length(); i++) {
            long jCharAt = ((j * 61) + ((long) upperCase.charAt(i))) - 32;
            j = (jCharAt + (jCharAt >> 56)) & 72057594037927935L;
        }
        return j;
    }

    public static String a(int i) {
        return ((i >> 24) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 8) & 255) + "." + (i & 255);
    }

    public static String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '_') {
                charArray[i] = ' ';
                if (i + 1 < charArray.length && charArray[i + 1] >= 'a' && charArray[i + 1] <= 'z') {
                    charArray[i + 1] = (char) ((charArray[i + 1] + 'A') - 97);
                }
            }
        }
        if (charArray[0] >= 'a' && charArray[0] <= 'z') {
            charArray[0] = (char) ((charArray[0] + 'A') - 97);
        }
        return d(new String(charArray));
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || (i > 0 && str.charAt(i - 1) == ' ')) {
                sb.append((str.charAt(i)).toUpperCase());
            } else {
                sb.append((str.charAt(i)).toLowerCase());
            }
        }
        return sb.toString();
    }

    public static String e(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            stringBuffer.append("*");
        }
        return stringBuffer.toString();
    }
}
