package rs;

import com.sun.jna.platform.win32.aU;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_377.class */
public class class_377 extends class_360 {
    public static final String e = "@gre@<img=24> Active";
    public static class_553 c = new class_378();
    static final class_358 d = new class_379(1000);
    public static long f = 0;
    public static String g = "";
    public static long bG = 0;
    public static int bH = aU.iV;
    public static int bI = 1;
    public static String bJ = "";
    public static long bK = 0;
    public static long bL = 0;
    public static String bM = "Event Global Boss";
    public static long bN = -1;
    public static String bO = "Event Wildy Boss";
    public static long bP = -1;
    public static long bQ = -1;
    public static long bR = -1;
    public static List<String> bS = new ArrayList();
    public static List<Long> bT = new ArrayList();

    public class_377(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(40087);
        c(40088, 7, "gameframe/SPRITE");
        a(62150, "Hotspot: @or2@N/A", this.a, 0, class_492.e, true, true);
        a(62151, "@yel@N/A", this.a, 0, class_492.e, true, true);
        a(62152, (Boolean) false);
        H[62152].P = 4;
        H[62152].ab = 11;
        a(62153, 1, 0, 62154, 1, "gameframe/skip", 16, 15, "Vote to skip hotspot");
        a(62154, 2, "gameframe/skip", 16, 15, 62155);
        a(62156, "@yel@0 / 55", this.a, 0, class_492.e, false, true);
        a(40089, "<img=128> Dharok PK Tournament", this.a, 0, class_492.e, true, true);
        a(40090, "@yel@Starts in.. <img=37> 4:47:17", this.a, 0, class_492.e, true, true);
        a(40091, (Boolean) false);
        H[40091].P = 4;
        H[40091].ab = 11;
        H[40091].ax[0] = 16002;
        H[40091].av[0] = 1;
        a(40092, "<img=245>Golden HG", this.a, 0, class_492.e, true, true);
        a(40093, "<img=261>Blood LMS", this.a, 0, class_492.e, true, true);
        a(40094, "@yel@<img=37> 26:57", this.a, 0, class_492.e, true, true);
        a(40095, e, this.a, 0, class_492.e, true, true);
        a(40096, "gameframe/button", 1, 150, 32, "<img=100> View all events", -1, 40097, 1);
        a(40097, "gameframe/button", 2, 150, 32, 40098);
        a(40099, "<img=100> View Active Events", this.a, 0, 16751360, true, true);
        a(40101, "<img=82> Event Global Boss:@yel@ <img=37> None", this.a, 0, class_492.e, false);
        a(40102, "<img=82> Event Wildy Boss:@yel@ <img=37> None", this.a, 0, class_492.e, false);
        a(40103, "<img=82> Event Brawl:@yel@ <img=37> None", this.a, 0, class_492.e, false);
        Widget widgetD2 = d(40100);
        widgetD2.k(20);
        widgetD2.P = 168;
        widgetD2.aP = 225 - 24;
        widgetD2.aF = aU.ie;
        int i = 0 + 1;
        widgetD2.b(0, 40088, -10, 5);
        int i2 = i + 1;
        widgetD2.b(i, 62150, ((-10) + 117) - 5, 163 + 4);
        int i3 = i2 + 1;
        widgetD2.b(i2, 62151, (((-10) + 78) + 5) - 5, ((163 + 15) + 11) - 1);
        int i4 = i3 + 1;
        widgetD2.b(i3, 62152, (-10) + 13, ((163 + 15) + 4) - 18);
        int i5 = i4 + 1;
        widgetD2.b(i4, 62153, ((((-10) + 113) + 4) + 5) - 5, ((163 + 12) + 11) - 1);
        int i6 = i5 + 1;
        widgetD2.b(i5, 62154, ((((-10) + 113) + 4) + 5) - 5, ((163 + 12) + 11) - 1);
        int i7 = i6 + 1;
        widgetD2.b(i6, 62156, ((((-10) + 133) + 4) + 5) - 5, ((163 + 15) + 11) - 1);
        int i8 = i7 + 1;
        widgetD2.b(i7, 40089, ((-10) + 117) - 5, 106 + 4);
        int i9 = i8 + 1;
        widgetD2.b(i8, 40090, ((-10) + 117) - 5, ((106 + 15) + 11) - 1);
        int i10 = i9 + 1;
        widgetD2.b(i9, 40091, (-10) + 13, ((106 + 15) + 4) - 15);
        int i11 = i10 + 1;
        widgetD2.b(i10, 40092, (-10) + 50, 52);
        int i12 = i11 + 1;
        widgetD2.b(i11, 40093, (-10) + 50 + 85, 52);
        int i13 = i12 + 1;
        widgetD2.b(i12, 40094, (-10) + 50, 52 + 23);
        int i14 = i13 + 1;
        widgetD2.b(i13, 40095, (-10) + 50 + 85, 52 + 23);
        int i15 = i14 + 1;
        widgetD2.b(i14, 40096, 10, 8);
        int i16 = i15 + 1;
        widgetD2.b(i15, 40097, 10, 8);
        int i17 = i16 + 1;
        widgetD2.b(i16, 40099, 10 + 75, 8 + 11);
        int i18 = i17 + 1;
        widgetD2.b(i17, 40101, 5, 220);
        int i19 = i18 + 1;
        widgetD2.b(i18, 40102, 5, 220 + 18);
        int i20 = i19 + 1;
        widgetD2.b(i19, 40103, 5, 220 + 18 + 18);
        for (int i21 = 0; i21 < i20; i21++) {
            int[] iArr = widgetD2.ba;
            int i22 = i21;
            iArr[i22] = iArr[i22] - 5;
        }
        widgetD.k(4);
        widgetD.b(0, 32000, 0, 0);
        widgetD.b(1, 16022, 0, 28 + 24);
        widgetD.b(2, 16023, 4, User32.VK_ZOOM);
        widgetD.b(3, 40100, 6, 30 + 24);
        class_354.d.a(40087, d);
        class_380 class_380Var = new class_380(this, 0L);
        class_381 class_381Var = new class_381(this, 0L, class_380Var);
        class_354.b.a(62150, class_381Var);
        class_354.b.a(62151, class_381Var);
        class_354.b.a(62152, class_381Var);
        class_354.b.a(62156, class_381Var);
        class_354.b.a(62153, class_380Var);
    }
}
