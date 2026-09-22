package rs.lpkg;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rs.Client;
import rs.class_492;

/* JADX INFO: loaded from: client-final.jar:rs/l/o.class */
class o {
    private static final double b = 3.075d;
    private static final int c = 5;
    private static final int d = 13;
    private static final int e = 15;
    private final int[] g;
    private final int[] h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private static final double a = Math.sqrt(2.0d);
    private static final Pattern f = Pattern.compile("^[ \\t]*(?<expr>//.*$|m[ \\t]*(?<mrx>[0-9]+)[ \\t]+(?<mry>[0-9]+)|r[ \\t]*(?<rx>[0-9]+)[ \\t]+(?<ry>[0-9]+)|R[ \\t]*(?<rx1>[0-9]+)[ \\t]+(?<ry1>[0-9]+)[ \\t]+(?<rx2>[0-9]+)[ \\t]+(?<ry2>[0-9]+)|c[ \\t]*(?<cx>[0-9-]+)[ \\t]+(?<cy>[0-9-]+)|C[ \\t]*(?<cx1>[0-9-]+)[ \\t]+(?<cy1>[0-9-]+)[ \\t]+(?<cx2>[0-9-]+)[ \\t]+(?<cy2>[0-9-]+)|#[ \\t]*(?<color>[0-9a-fA-F]{6}|[0-9a-fA-F]{3})|p[ \\t]*(?<plane>all|0?[ \\t]*1?[ \\t]*2?[ \\t]*3?)|b[ \\t]*(?<blend>[0-9]+)|bounds[ \\t]+(?<bx1>[0-9]+)[ \\t]+(?<by1>[0-9]+)[ \\t]+(?<bx2>[0-9]+)[ \\t]+(?<by2>[0-9]+))[ \\t]*");

    /* JADX INFO: loaded from: client-final.jar:rs/l/o$a.class */
    @FunctionalInterface
    public interface a {
        int a(int i, int i2, int i3);
    }

    public o(InputStream inputStream, String str) {
        this(new InputStreamReader(inputStream), str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x0374 A[Catch: NumberFormatException -> 0x04f8, TryCatch #0 {NumberFormatException -> 0x04f8, blocks: (B:3:0x003e, B:4:0x0048, B:6:0x0053, B:7:0x005e, B:9:0x0068, B:11:0x007d, B:12:0x0093, B:13:0x0094, B:15:0x00a9, B:17:0x00b1, B:22:0x00c2, B:24:0x00cc, B:25:0x00db, B:26:0x00dc, B:27:0x0136, B:28:0x0140, B:29:0x018c, B:31:0x01a7, B:33:0x01fd, B:32:0x01df, B:34:0x0246, B:36:0x0257, B:37:0x0266, B:40:0x026e, B:41:0x027d, B:42:0x027e, B:43:0x028e, B:44:0x02af, B:48:0x02cf, B:50:0x02d9, B:54:0x02fa, B:55:0x031b, B:56:0x034b, B:58:0x0374, B:81:0x0433, B:84:0x0448, B:86:0x0459, B:106:0x04e0, B:87:0x0462, B:91:0x0476, B:102:0x04c6, B:104:0x04d0, B:105:0x04da, B:92:0x0480, B:94:0x048f, B:95:0x049b, B:98:0x04ad, B:107:0x04e6, B:76:0x0418, B:77:0x0427, B:70:0x03fa, B:71:0x0409, B:61:0x03a2, B:109:0x04ef), top: B:120:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x039b  */
    /* JADX WARN: Code duplicated, block: B:61:0x03a2 A[Catch: NumberFormatException -> 0x04f8, TryCatch #0 {NumberFormatException -> 0x04f8, blocks: (B:3:0x003e, B:4:0x0048, B:6:0x0053, B:7:0x005e, B:9:0x0068, B:11:0x007d, B:12:0x0093, B:13:0x0094, B:15:0x00a9, B:17:0x00b1, B:22:0x00c2, B:24:0x00cc, B:25:0x00db, B:26:0x00dc, B:27:0x0136, B:28:0x0140, B:29:0x018c, B:31:0x01a7, B:33:0x01fd, B:32:0x01df, B:34:0x0246, B:36:0x0257, B:37:0x0266, B:40:0x026e, B:41:0x027d, B:42:0x027e, B:43:0x028e, B:44:0x02af, B:48:0x02cf, B:50:0x02d9, B:54:0x02fa, B:55:0x031b, B:56:0x034b, B:58:0x0374, B:81:0x0433, B:84:0x0448, B:86:0x0459, B:106:0x04e0, B:87:0x0462, B:91:0x0476, B:102:0x04c6, B:104:0x04d0, B:105:0x04da, B:92:0x0480, B:94:0x048f, B:95:0x049b, B:98:0x04ad, B:107:0x04e6, B:76:0x0418, B:77:0x0427, B:70:0x03fa, B:71:0x0409, B:61:0x03a2, B:109:0x04ef), top: B:120:0x003e }] */
    public o(Reader reader, String str) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = null;
        int[] iArrCopyOf = new int[64];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i15 = 1;
        int i16 = 0;
        int iCharAt = 15;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        try {
            Matcher matcher = f.matcher("");
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    if (iArr == null) {
                        throw new IllegalArgumentException(str + ": no data");
                    }
                    this.g = iArr;
                    this.h = iArrCopyOf;
                    this.m = i14;
                    this.i = i10;
                    this.j = i11;
                    this.k = i12;
                    this.l = i13;
                    return;
                }
                matcher.reset(line);
                int iEnd = 0;
                while (iEnd < line.length()) {
                    matcher.region(iEnd, line.length());
                    if (!matcher.find()) {
                        throw new IllegalArgumentException("Unexpected: \"" + line.substring(iEnd) + "\" (" + str + ":" + i15 + ")");
                    }
                    iEnd = matcher.end();
                    String strGroup = matcher.group("expr");
                    if (strGroup != null && strGroup.length() > 0 && !strGroup.startsWith("//")) {
                        if (iArr != null) {
                            char cCharAt = strGroup.charAt(0);
                            switch (cCharAt) {
                                case '#':
                                    String strGroup2 = matcher.group("color");
                                    int i21 = Integer.parseInt(strGroup2, 16);
                                    if (strGroup2.length() == 3) {
                                        int i22 = (i21 >> 8) & 15;
                                        i6 = i22 | (i22 << 4);
                                        int i23 = (i21 >> 4) & 15;
                                        i7 = i23 | (i23 << 4);
                                        int i24 = i21 & 15;
                                        i8 = i24 | (i24 << 4);
                                    } else {
                                        i6 = (i21 >> 16) & 255;
                                        i7 = (i21 >> 8) & 255;
                                        i8 = i21 & 255;
                                    }
                                    byte b2 = (byte) (i8 - i6);
                                    byte b3 = (byte) (((byte) (i6 + (b2 >> 1))) - i7);
                                    i16 = (i16 & com.sun.jna.platform.win32.m.bG) | ((((byte) (i7 + (b3 >> 1))) & 255) << 16) | ((b2 & 255) << 8) | (b3 & 255);
                                    break;
                                case 'C':
                                case 'c':
                                    i = i17 * 8;
                                    i2 = i18 * 8;
                                    i3 = (i19 * 8) + 7;
                                    i4 = (i20 * 8) + 7;
                                    if (cCharAt == 'c') {
                                        int i25 = i + Integer.parseInt(matcher.group("cx"));
                                        i = i25;
                                        i3 = i25;
                                        int i26 = i2 + Integer.parseInt(matcher.group("cy"));
                                        i2 = i26;
                                        i4 = i26;
                                    } else if (cCharAt == 'C') {
                                        i3 = i + Integer.parseInt(matcher.group("cx2"));
                                        i4 = i2 + Integer.parseInt(matcher.group("cy2"));
                                        i += Integer.parseInt(matcher.group("cx1"));
                                        i2 += Integer.parseInt(matcher.group("cy1"));
                                    }
                                    if (i >= i10 || i2 < i11 || i3 >= i12 || i4 >= i13) {
                                        throw new IllegalArgumentException("Coordinate out of bounds (" + str + ":" + i15 + ")");
                                    }
                                    if (i > i3 || i2 > i4) {
                                        throw new IllegalArgumentException("First coord must be before second (" + str + ":" + i15 + ")");
                                    }
                                    for (int i27 = i2; i27 <= i4; i27++) {
                                        int i28 = i14 * (i27 - i11);
                                        for (int i29 = i; i29 <= i3; i29++) {
                                            int i30 = (i29 - i10) + i28;
                                            if (iCharAt == 15) {
                                                iArr[i30] = i16;
                                            } else {
                                                int i31 = iArr[i30];
                                                if ((i31 & Integer.MIN_VALUE) == 0 || i31 == -1) {
                                                    i5 = i9;
                                                    i9 += 4;
                                                    iArrCopyOf = i9 > iArrCopyOf.length ? Arrays.copyOf(iArrCopyOf, i9 + 64) : iArrCopyOf;
                                                    iArr[i30] = i5 | Integer.MIN_VALUE;
                                                    for (int i32 = 0; i32 < 4; i32++) {
                                                        iArrCopyOf[i5 + i32] = i31;
                                                    }
                                                } else {
                                                    i5 = i31 & Integer.MAX_VALUE;
                                                }
                                                for (int i33 = 0; i33 < 4; i33++) {
                                                    if ((iCharAt & (1 << i33)) != 0) {
                                                        iArrCopyOf[i5 + i33] = i16;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                    break;
                                case 'R':
                                case 'r':
                                    if (cCharAt == 'r') {
                                        int i34 = Integer.parseInt(matcher.group("rx"));
                                        i17 = i34;
                                        i19 = i34;
                                        int i35 = Integer.parseInt(matcher.group("ry"));
                                        i18 = i35;
                                        i20 = i35;
                                    } else {
                                        i17 = Integer.parseInt(matcher.group("rx1"));
                                        i18 = Integer.parseInt(matcher.group("ry1"));
                                        i19 = Integer.parseInt(matcher.group("rx2"));
                                        i20 = Integer.parseInt(matcher.group("ry2"));
                                    }
                                    i = i17 * 8;
                                    i2 = i18 * 8;
                                    i3 = (i19 * 8) + 7;
                                    i4 = (i20 * 8) + 7;
                                    if (cCharAt == 'c') {
                                        int i210 = i + Integer.parseInt(matcher.group("cx"));
                                        i = i210;
                                        i3 = i210;
                                        int i211 = i2 + Integer.parseInt(matcher.group("cy"));
                                        i2 = i211;
                                        i4 = i211;
                                    } else if (cCharAt == 'C') {
                                        i3 = i + Integer.parseInt(matcher.group("cx2"));
                                        i4 = i2 + Integer.parseInt(matcher.group("cy2"));
                                        i += Integer.parseInt(matcher.group("cx1"));
                                        i2 += Integer.parseInt(matcher.group("cy1"));
                                    }
                                    if (i >= i10) {
                                    }
                                    throw new IllegalArgumentException("Coordinate out of bounds (" + str + ":" + i15 + ")");
                                case 'b':
                                    int i36 = Integer.parseInt(matcher.group("blend"));
                                    if (i36 < 0) {
                                        throw new IllegalArgumentException("Blend must be >=0 (" + str + ":" + i15 + ")");
                                    }
                                    if (i36 > 13) {
                                        throw new IllegalArgumentException("Blend must be <= 13 (" + str + ":" + i15 + ")");
                                    }
                                    i16 = (i16 & class_492.c) | (i36 << 24);
                                    break;
                                    break;
                                case 'm':
                                    int i37 = Integer.parseInt(matcher.group("mrx"));
                                    i17 = i37;
                                    i19 = i37;
                                    int i38 = Integer.parseInt(matcher.group("mry"));
                                    i18 = i38;
                                    i20 = i38;
                                    break;
                                case 'p':
                                    String strGroup3 = matcher.group("plane");
                                    if ("all".equals(strGroup3)) {
                                        iCharAt = 15;
                                    } else {
                                        iCharAt = 0;
                                        for (int i39 = 0; i39 < strGroup3.length(); i39++) {
                                            iCharAt |= 1 << (strGroup3.charAt(i39) - '0');
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            if (!strGroup.startsWith("bounds")) {
                                throw new IllegalArgumentException("Expected bounds (" + str + ":" + i15 + ")");
                            }
                            i10 = Integer.parseInt(matcher.group("bx1")) * 8;
                            i11 = Integer.parseInt(matcher.group("by1")) * 8;
                            i12 = (Integer.parseInt(matcher.group("bx2")) + 1) * 8;
                            i13 = (Integer.parseInt(matcher.group("by2")) + 1) * 8;
                            i14 = i12 - i10;
                            iArr = new int[i14 * (i13 - i11)];
                            Arrays.fill(iArr, -1);
                        }
                    }
                }
                i15++;
            }
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Expected number (" + str + ":" + 1 + ")", e2);
        }
    }

    private int a(int i, int i2, int i3, a aVar) {
        if (aVar != null) {
            int iA = aVar.a(i, i2, i3);
            if (iA == -1) {
                return -1;
            }
            i2 = (iA >> 3) & Client.dn;
            i = (iA >> 14) & 1023;
            i3 = (iA >> 24) & 3;
        }
        if (i < this.i) {
            i = this.i;
        }
        if (i >= this.k) {
            i = this.k - 1;
        }
        if (i2 < this.j) {
            i2 = this.j;
        }
        if (i2 >= this.l) {
            i2 = this.l - 1;
        }
        int i4 = this.g[(this.m * (i2 - this.j)) + (i - this.i)];
        if (i4 == -1) {
            return -1;
        }
        if ((i4 & Integer.MIN_VALUE) != 0) {
            i4 = this.h[(i4 & Integer.MAX_VALUE) | i3];
        }
        return i4;
    }

    public int a(double d2, double d3, int i, int i2, int i3, double d4, a aVar) {
        double d5 = d2 / 8.0d;
        double d6 = d3 / 8.0d;
        if (a(i / 8, i2 / 8, i3, aVar) == -1) {
            return 0;
        }
        double d7 = 0.0d;
        double d8 = 0.0d;
        double d9 = 0.0d;
        double d10 = 0.0d;
        int i4 = (int) (d5 - 5.0d);
        int iCeil = (int) Math.ceil(d5 + 5.0d);
        int i5 = (int) (d6 - 5.0d);
        int iCeil2 = (int) Math.ceil(d6 + 5.0d);
        for (int i6 = i4; i6 < iCeil; i6++) {
            for (int i7 = i5; i7 <= iCeil2; i7++) {
                int iA = a(i6, i7, i3, aVar);
                if (iA != -1) {
                    double d11 = (((double) (iA >>> 24)) + 0.125d) / 8.0d;
                    double d12 = 1.0d + (d11 * b);
                    double d13 = ((double) i6) - d5;
                    double d14 = d13 + 1.0d;
                    if (d13 >= (-d12) && d13 <= d12) {
                        double d15 = ((double) i7) - d6;
                        double d16 = d15 + 1.0d;
                        if (d15 >= (-d12) && d16 <= d12) {
                            double d17 = d11 * a;
                            double dA = (a(d13 / d17) - a(d14 / d17)) * (a(d15 / d17) - a(d16 / d17));
                            double d18 = ((double) ((iA >>> 16) & 255)) / 255.0d;
                            d8 += d18 * dA;
                            d9 += (((double) ((byte) (iA >>> 8))) / 128.0d) * dA;
                            d10 += (((double) ((byte) iA)) / 128.0d) * dA;
                            d7 += dA;
                        }
                    }
                }
            }
        }
        byte bMin = (byte) Math.min(Math.max(Math.round((d8 / d7) * 255.0d), 0L), 255L);
        byte bMin2 = (byte) Math.min(Math.max(Math.round((d9 * 128.0d) / d7), -128L), 127L);
        byte bMin3 = (byte) Math.min(Math.max(Math.round((d10 * 128.0d) / d7), -128L), 127L);
        int i8 = (bMin - (bMin3 >> 1)) & 255;
        int i9 = (((i8 + bMin3) & 255) - (bMin2 >> 1)) & 255;
        float[] fArrRGBtoHSB = Color.RGBtoHSB(i9, i8, (i9 + bMin2) & 255, (float[]) null);
        fArrRGBtoHSB[2] = (float) Math.pow(fArrRGBtoHSB[2], d4);
        return 16777215 & Color.HSBtoRGB(fArrRGBtoHSB[0], fArrRGBtoHSB[1], fArrRGBtoHSB[2]);
    }

    private double a(double d2) {
        double dAbs = Math.abs(d2);
        double d3 = 1.0d / (1.0d + (dAbs * 0.3275911d));
        return Math.copySign(1.0d - ((((((((((1.061405429d * d3) - 1.453152027d) * d3) + 1.421413741d) * d3) - 0.284496736d) * d3) + 0.254829592d) * d3) * Math.exp((-dAbs) * dAbs)), d2);
    }

    BufferedImage a(double d2, int i, int i2, a aVar) {
        int iA;
        int i3 = (int) (((double) ((this.k - this.i) * 8)) * d2);
        int i4 = (int) (((double) ((this.l - this.j) * 8)) * d2);
        BufferedImage bufferedImage = new BufferedImage(i3, i4, 2);
        int i5 = i <= 0 ? Integer.MAX_VALUE : (int) (((double) i) * d2);
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                if (i7 % i5 == 0 || i6 % i5 == 0) {
                    iA = class_492.c;
                } else {
                    double d3 = ((double) (this.i * 8)) + (((double) i7) / d2);
                    double d4 = ((double) (this.j * 8)) + (((double) i6) / d2);
                    iA = a(d3, d4, (int) d3, (int) d4, i2, 0.8d, aVar);
                }
                bufferedImage.setRGB(i7, (i4 - 1) - i6, iA | com.sun.jna.platform.win32.m.bG);
            }
        }
        return bufferedImage;
    }
}
