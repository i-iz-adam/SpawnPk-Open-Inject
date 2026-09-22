package rs;

import com.sun.jna.Function;
import com.sun.jna.platform.win32.aU;
import java.io.File;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL11;
import org.lwjgl.opengl.ARBVertexBlend;
import org.lwjgl.opengl.ARBVertexProgram;
import org.lwjgl.opengl.EXTTextureMirrorClamp;
import org.lwjgl.opengl.EXTTextureSnorm;
import org.lwjgl.opengl.GL11;

/* JADX INFO: loaded from: client-final.jar:rs/class_127.class */
public final class class_127 {
    public static int a;
    public final int b;
    public static class_127[] c;
    public int d;
    public int e;
    public int f;
    public class_99 g;
    public int[] h;
    public int[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public static class_30 p = new class_30(30);
    public static class_30 q = new class_30(100);
    public class_59 r;

    public static void a(ColorUtility colorUtility, int i) {
        if (Configuration.M) {
            switch (i) {
                case aU.ie_ /* 302 */:
                    colorUtility.a(new int[]{945});
                    break;
                case 378:
                case 379:
                case 380:
                case 381:
                case 382:
                case Client.gF /* 383 */:
                case Function.e /* 384 */:
                    colorUtility.a(new int[]{1});
                    break;
                case aU.id /* 749 */:
                    colorUtility.a(new int[]{945});
                    break;
                case aU.js /* 1019 */:
                    colorUtility.b(new int[]{CL10.CL_DEVICE_AVAILABLE}, -50);
                    colorUtility.b(new int[]{4096}, -75);
                    colorUtility.b(new int[]{CL10.CL_DEVICE_NAME, CL10.CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE}, -100);
                    break;
                case aU.jt /* 1020 */:
                    colorUtility.b(new int[]{CL10.CL_DEVICE_AVAILABLE}, -50);
                    colorUtility.b(new int[]{4096}, -75);
                    colorUtility.b(new int[]{CL10.CL_DEVICE_NAME, CL10.CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE}, -100);
                    colorUtility.a(new int[]{CL10.CL_DEVICE_AVAILABLE, 4096, CL10.CL_DEVICE_NAME, CL10.CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE, CL10.CL_DEVICE_IMAGE3D_MAX_WIDTH, CL10.CL_DEVICE_MAX_PARAMETER_SIZE, CL10.CL_DEVICE_GLOBAL_MEM_SIZE}, new int[]{34770, 34760, 34780});
                    break;
                case aU.mk /* 1241 */:
                case aU.sC /* 1752 */:
                    colorUtility.g(-25, -1);
                    break;
                case aU.nW /* 1338 */:
                    colorUtility.b(85);
                    break;
                case 1339:
                    colorUtility.b(81);
                    break;
                case aU.nX /* 1340 */:
                    colorUtility.b(159);
                    break;
                case 1522:
                    colorUtility.b(62);
                    break;
                case 1523:
                    colorUtility.b(62);
                    break;
                case 1524:
                    colorUtility.b(101);
                    break;
                case 1526:
                    colorUtility.b(30);
                    break;
                case aU.sO /* 1764 */:
                    colorUtility.a(new int[]{92770});
                    break;
                case 2774:
                case 2775:
                    colorUtility.a(new int[]{57225});
                    break;
            }
        }
    }

    public static void a(class_663 class_663Var) {
        Buffer buffer = new Buffer(class_663Var.a("spotanim.dat"));
        a = buffer.A();
        if (c == null) {
            c = new class_127[a + 5000];
        }
        for (int i = 0; i < a; i++) {
            if (c[i] == null) {
                c[i] = new class_127();
            }
            c[i].d = i;
            c[i].a(buffer);
            if (i >= 100 && i <= 300) {
                File file = new File(class_650.f() + "raw/" + c[i].e);
                if (!file.exists()) {
                    file = new File(class_650.f() + "raw/" + c[i].e + ".dat");
                }
                if (file.exists()) {
                    file.delete();
                }
            }
            if (i == 113) {
                c[113].e = 3090;
                c[113].f = 666;
                c[113].j = 128;
                c[113].k = 128;
                c[113].l = 0;
                c[113].m = 75;
                c[113].n = 75;
                c[113].h = new int[]{0, 0, 0, 0, 0, 0};
                c[113].i = new int[]{0, 0, 0, 0, 0, 0};
                c[113].g = class_99.a[666];
            }
            if (i == 112) {
                c[112].e = 3090;
                c[112].f = aU.gz;
                c[112].j = 128;
                c[112].k = 128;
                c[112].l = 0;
                c[112].m = 100;
                c[112].n = 100;
                c[112].h = new int[]{0, 0, 0, 0, 0, 0};
                c[112].i = new int[]{0, 0, 0, 0, 0, 0};
                c[112].g = class_99.a[665];
            }
            if (i == 600) {
                c[600] = new class_127(c[146]);
                c[600].d = 600;
            }
            if (i == 602) {
                c[602] = new class_127(c[145]);
                c[602].d = aU.jH_;
            }
            if (i == 603) {
                c[603] = new class_127(c[147]);
                c[603].d = 603;
            }
            if (i == 301) {
                c[301] = new class_127();
                c[301].e = 21852;
                c[301].f = aU.rS;
                c[301].g = class_99.a[1714];
            }
            if (i == 1247) {
                c[1247] = new class_127();
                c[1247].e = 60776;
                c[1247].f = aU.vQ;
                c[1247].g = class_99.a[4001];
            }
            if (i == 1248) {
                c[1248] = new class_127();
                c[1248].e = 60776;
                c[1248].f = aU.vR;
                c[1248].g = class_99.a[4002];
            }
        }
        c = class_668.a(c);
        c[670].e = 40822;
        c[670].f = 5460;
        c[670].j = 128;
        c[670].k = 128;
        c[670].l = 0;
        c[670].m = 0;
        c[670].n = 0;
        c[670].h = new int[]{43270, 43038, 0, 0, 0, 0};
        c[670].i = new int[]{491770, 311770, 0, 0, 0, 0};
        c[670].g = class_99.a[5460];
        c[671].e = 40826;
        c[671].f = 5462;
        c[671].j = 128;
        c[671].k = 128;
        c[671].l = 0;
        c[671].m = 0;
        c[671].n = 0;
        c[671].h = new int[]{43270, 43038, 0, 0, 0, 0};
        c[671].i = new int[]{311770, 491770, 0, 0, 0, 0};
        c[671].g = class_99.a[5462];
        c[1588].e = ARBVertexProgram.GL_MATRIX11_ARB;
        c[1588].f = 7883;
        c[1588].j = 160;
        c[1588].k = 160;
        c[1588].l = 0;
        c[1588].m = 30;
        c[1588].n = 0;
        c[1588].h = new int[]{33003, 32883, 36382, EXTTextureSnorm.GL_RGB_SNORM, 37774, 0};
        c[1588].i = new int[]{22457, 22187, 22053, 22036, 21146, 0};
        c[1588].g = class_99.a[7883];
        c[1580].e = 33007;
        c[1580].f = 7571;
        c[1580].j = 90;
        c[1580].k = 90;
        c[1580].l = 0;
        c[1580].m = 60;
        c[1580].n = 0;
        c[1580].h = new int[]{916, 968, 960, aU.iP_, 0, 0};
        c[1580].i = new int[]{33612, 33474, 34025, 33457, 0, 0};
        c[1580].g = class_99.a[7571];
        c[1594].e = 33007;
        c[1594].f = 7571;
        c[1594].j = 90;
        c[1594].k = 90;
        c[1594].l = 0;
        c[1594].m = 60;
        c[1594].n = 0;
        c[1594].h = new int[]{916, 968, 960, aU.iP_, 0, 0};
        c[1594].i = new int[]{33612, 33474, 34025, 33457, 0, 0};
        c[1594].g = class_99.a[7571];
        c[1593].e = 35399;
        c[1593].f = -1;
        c[1593].j = 128;
        c[1593].k = 128;
        c[1593].l = 0;
        c[1593].m = 0;
        c[1593].n = 44;
        c[1593].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1593].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1583].e = 35391;
        c[1583].f = -1;
        c[1583].j = 128;
        c[1583].k = 128;
        c[1583].l = 0;
        c[1583].m = 0;
        c[1583].n = 0;
        c[1583].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1583].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1584].e = 35390;
        c[1584].f = 8131;
        c[1584].j = 128;
        c[1584].k = 128;
        c[1584].l = 0;
        c[1584].m = 0;
        c[1584].n = 0;
        c[1584].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1584].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1584].g = class_99.a[8131];
        c[1550].e = 35732;
        c[1550].f = GL11.GL_BLUE_SCALE;
        c[1550].j = 128;
        c[1550].k = 128;
        c[1550].l = 0;
        c[1550].m = 0;
        c[1550].n = 0;
        c[1550].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1550].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1550].g = class_99.a[3354];
        c[1551].e = 35394;
        c[1551].f = 8069;
        c[1551].j = 128;
        c[1551].k = 128;
        c[1551].l = 0;
        c[1551].m = 0;
        c[1551].n = 0;
        c[1551].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1551].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1551].g = class_99.a[8069];
        c[1570].e = 35578;
        c[1570].f = 8088;
        c[1570].j = 128;
        c[1570].k = 128;
        c[1570].l = 0;
        c[1570].m = 0;
        c[1570].n = 0;
        c[1570].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1570].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1570].g = class_99.a[8088];
        c[1571].e = 35577;
        c[1571].f = 8088;
        c[1571].j = 128;
        c[1571].k = 128;
        c[1571].l = 0;
        c[1571].m = 0;
        c[1571].n = 0;
        c[1571].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1571].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1571].g = class_99.a[8088];
        c[1572].e = 35576;
        c[1572].f = 8088;
        c[1572].j = 128;
        c[1572].k = 128;
        c[1572].l = 0;
        c[1572].m = 0;
        c[1572].n = 0;
        c[1572].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1572].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1572].g = class_99.a[8088];
        c[1573].e = 35579;
        c[1573].f = 8088;
        c[1573].j = 128;
        c[1573].k = 128;
        c[1573].l = 0;
        c[1573].m = 0;
        c[1573].n = 0;
        c[1573].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1573].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1573].g = class_99.a[8088];
        c[1574].e = 35341;
        c[1574].f = 7813;
        c[1574].j = 128;
        c[1574].k = 128;
        c[1574].l = 0;
        c[1574].m = 0;
        c[1574].n = 0;
        c[1574].h = new int[]{1, 0, 0, 0, 0, 0};
        c[1574].i = new int[]{1, 1, 0, 0, 0, 0};
        c[1574].g = class_99.a[7813];
        c[1561].e = 35185;
        c[1561].j = 128;
        c[1561].k = 128;
        c[1561].l = 0;
        c[1561].m = 5;
        c[1561].n = 0;
        c[1561].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1561].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1568].e = 35393;
        c[1568].f = 8083;
        c[1568].j = 128;
        c[1568].k = 128;
        c[1568].l = 0;
        c[1568].m = 0;
        c[1568].n = 0;
        c[1568].h = new int[]{1, 0, 0, 0, 0, 0};
        c[1568].i = new int[]{1, 1, 0, 0, 0, 0};
        c[1568].g = class_99.a[8083];
        c[1569].e = 35393;
        c[1569].f = 8084;
        c[1569].j = 128;
        c[1569].k = 128;
        c[1569].l = 0;
        c[1569].m = 0;
        c[1569].n = 0;
        c[1569].h = new int[]{1, 0, 0, 0, 0, 0};
        c[1569].i = new int[]{1, 1, 0, 0, 0, 0};
        c[1569].g = class_99.a[8084];
        c[1610].e = 33009;
        c[1610].f = 7616;
        c[1610].j = 200;
        c[1610].k = 200;
        c[1610].l = 0;
        c[1610].m = 60;
        c[1610].n = 0;
        c[1610].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1610].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1610].g = class_99.a[7616];
        c[1400].e = 35398;
        c[1400].f = 8100;
        c[1400].j = 128;
        c[1400].k = 128;
        c[1400].l = 0;
        c[1400].m = 0;
        c[1400].n = 0;
        c[1400].h = new int[]{1, 0, 0, 0, 0, 0};
        c[1400].i = new int[]{1, 1, 1, 1, 1, 1};
        c[1400].g = class_99.a[8100];
        c[1579].e = 35395;
        c[1579].f = 8099;
        c[1579].j = 128;
        c[1579].k = 128;
        c[1579].l = 0;
        c[1579].m = 0;
        c[1579].n = 0;
        c[1579].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1579].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1579].g = class_99.a[8099];
        c[1578].e = 6379;
        c[1578].f = 1969;
        c[1578].j = 128;
        c[1578].k = 128;
        c[1578].l = 0;
        c[1578].m = 0;
        c[1578].n = 0;
        c[1578].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1578].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1578].g = class_99.a[1969];
        c[1576].e = 42718;
        c[1577].e = 42718;
        c[1044].e = 44030;
        c[1041].e = 44030;
        c[1043].e = 44030;
        c[302] = new class_127(c[301]);
        c[302].d = aU.ie_;
        c[302].e = 21852;
        c[302].f = aU.rS;
        c[302].g = class_99.a[1714];
        c[1019].e = 57946;
        c[1019].f = 10688;
        c[1019].j = 128;
        c[1019].k = 128;
        c[1019].l = 0;
        c[1019].m = 0;
        c[1019].n = 0;
        c[1019].g = class_99.a[10688];
        c[1019].h = new int[]{64656, 64553, 64541, 64566};
        c[1019].i = new int[]{0, 0, 0, 0};
        c[1020].e = 57946;
        c[1020].f = 10688;
        c[1020].j = 128;
        c[1020].k = 128;
        c[1020].l = 0;
        c[1020].m = 0;
        c[1020].n = 0;
        c[1020].g = class_99.a[10688];
        c[1020].h = new int[]{64656, 64553, 64541, 64566};
        c[1020].i = new int[]{0, 0, 0, 0};
        c[1171].e = 29207;
        c[1171].f = 7513;
        c[1171].j = 128;
        c[1171].k = 128;
        c[1171].l = 0;
        c[1171].m = 0;
        c[1171].n = 0;
        c[1171].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1171].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1171].g = class_99.a[7513];
        c[1455].e = ARBVertexBlend.GL_MODELVIEW25_ARB;
        c[1455].f = 7857;
        c[1455].j = 128;
        c[1455].k = 128;
        c[1455].l = 0;
        c[1455].m = 60;
        c[1455].n = 60;
        c[1455].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1455].i = new int[]{82, 127, 61, 0, 0, 0};
        c[1455].g = class_99.a[7857];
        c[1456].e = ARBVertexBlend.GL_MODELVIEW26_ARB;
        c[1456].f = 7856;
        c[1456].j = 128;
        c[1456].k = 128;
        c[1456].l = 0;
        c[1456].m = 60;
        c[1456].n = 60;
        c[1456].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1456].i = new int[]{82, 127, 61, 0, 0, 0};
        c[1456].g = class_99.a[7856];
        c[1457].e = 3116;
        c[1457].f = aU.gZ;
        c[1457].j = 128;
        c[1457].k = 128;
        c[1457].l = 0;
        c[1457].m = 60;
        c[1457].n = 60;
        c[1457].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1457].i = new int[]{82, 127, 61, 0, 0, 0};
        c[1457].g = class_99.a[693];
        c[1458].e = ARBVertexBlend.GL_MODELVIEW25_ARB;
        c[1458].f = 7857;
        c[1458].j = 128;
        c[1458].k = 128;
        c[1458].l = 0;
        c[1458].m = 60;
        c[1458].n = 60;
        c[1458].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1458].i = new int[]{43486, 38848, 43968, 0, 0, 0};
        c[1458].g = class_99.a[7857];
        c[1459].e = ARBVertexBlend.GL_MODELVIEW26_ARB;
        c[1459].f = 7856;
        c[1459].j = 128;
        c[1459].k = 128;
        c[1459].l = 0;
        c[1459].m = 60;
        c[1459].n = 60;
        c[1459].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1459].i = new int[]{43486, 38848, 43968, 0, 0, 0};
        c[1459].g = class_99.a[7856];
        c[1460].e = 3116;
        c[1460].f = aU.gZ;
        c[1460].j = 128;
        c[1460].k = 128;
        c[1460].l = 0;
        c[1460].m = 60;
        c[1460].n = 60;
        c[1460].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1460].i = new int[]{43486, 38848, 43968, 0, 0, 0};
        c[1460].g = class_99.a[693];
        c[1461].e = ARBVertexBlend.GL_MODELVIEW25_ARB;
        c[1461].f = 7857;
        c[1461].j = 128;
        c[1461].k = 128;
        c[1461].l = 0;
        c[1461].m = 60;
        c[1461].n = 60;
        c[1461].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1461].i = new int[]{8092, 22464, 22430, 0, 0, 0};
        c[1461].g = class_99.a[7857];
        c[1462].e = ARBVertexBlend.GL_MODELVIEW26_ARB;
        c[1462].f = 7856;
        c[1462].j = 128;
        c[1462].k = 128;
        c[1462].l = 0;
        c[1462].m = 60;
        c[1462].n = 60;
        c[1462].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1462].i = new int[]{8092, 22464, 22430, 0, 0, 0};
        c[1462].g = class_99.a[7856];
        c[1463].e = 3116;
        c[1463].f = aU.gZ;
        c[1463].j = 128;
        c[1463].k = 128;
        c[1463].l = 0;
        c[1463].m = 60;
        c[1463].n = 60;
        c[1463].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1463].i = new int[]{8092, 22464, 22430, 0, 0, 0};
        c[1463].g = class_99.a[693];
        c[1464].e = ARBVertexBlend.GL_MODELVIEW25_ARB;
        c[1464].f = 7857;
        c[1464].j = 128;
        c[1464].k = 128;
        c[1464].l = 0;
        c[1464].m = 60;
        c[1464].n = 60;
        c[1464].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1464].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1464].g = class_99.a[7857];
        c[1465].e = ARBVertexBlend.GL_MODELVIEW26_ARB;
        c[1465].f = 7856;
        c[1465].j = 128;
        c[1465].k = 128;
        c[1465].l = 0;
        c[1465].m = 60;
        c[1465].n = 60;
        c[1465].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1465].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1465].g = class_99.a[7856];
        c[1466].e = 3116;
        c[1466].f = aU.gZ;
        c[1466].j = 128;
        c[1466].k = 128;
        c[1466].l = 0;
        c[1466].m = 60;
        c[1466].n = 60;
        c[1466].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1466].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1466].g = class_99.a[693];
        c[423] = new class_127(c[41]);
        c[423].h = new int[]{61, 7073};
        c[423].i = new int[]{926, 37};
        c[424] = new class_127(c[48]);
        c[424].h = new int[]{61, 7073};
        c[424].i = new int[]{926, 37};
        c[425] = new class_127(c[258]);
        c[425].h = new int[]{7073, 36133, 41940, 61};
        c[425].i = new int[]{926, 926, 933, 926};
        c[1837].h = new int[]{318188, 318185, 374770, 374770, 318191, 318194, 318205, 318200, 318210, 318197, 374770, 374770, 374770};
        c[1837].i = new int[]{6418, 6415, CL10.CL_DEVICE_COMPILER_AVAILABLE, 4146, 6421, 6424, 6435, 6430, 6440, 6427, CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF, CL10.CL_DEVICE_VERSION, CL11.CL_DEVICE_HOST_UNIFIED_MEMORY};
        c[1830] = new class_127(c[1837]);
        c[1830].h = new int[]{6418, 6415, CL10.CL_DEVICE_COMPILER_AVAILABLE, 4146, 6421, 6424, 6435, 6430, 6440, 6427, CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF, CL10.CL_DEVICE_VERSION, CL11.CL_DEVICE_HOST_UNIFIED_MEMORY};
        c[1830].i = new int[]{318188, 318185, 374770, 374770, 318191, 318194, 318205, 318200, 318210, 318197, 374770, 374770, 374770};
        c[1837].h = new int[]{318188, 318185, 374770, 374770, 318191, 318194, 318205, 318200, 318210, 318197, 374770, 374770, 374770};
        c[1837].i = new int[]{6418, 6415, CL10.CL_DEVICE_COMPILER_AVAILABLE, 4146, 6421, 6424, 6435, 6430, 6440, 6427, CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF, CL10.CL_DEVICE_VERSION, CL11.CL_DEVICE_HOST_UNIFIED_MEMORY};
        c[1470].e = 17550;
        c[1470].f = 1990;
        c[1470].j = 128;
        c[1470].k = 128;
        c[1470].l = 0;
        c[1470].m = 60;
        c[1470].n = 0;
        c[1470].h = new int[]{3755, 6055, aU.zK, 5807, 5935, 0};
        c[1470].i = new int[]{26512, 26386, 26388, 26264, 25114, 0};
        c[1470].g = class_99.a[1990];
        c[1471].e = 17550;
        c[1471].f = 1990;
        c[1471].j = 128;
        c[1471].k = 128;
        c[1471].l = 0;
        c[1471].m = 60;
        c[1471].n = 0;
        c[1471].h = new int[]{3755, 6055, aU.zK, 5807, 5935, 0};
        c[1471].i = new int[]{56105, 56233, 56107, 56235, 57261, 0};
        c[1471].g = class_99.a[1990];
        c[1472].e = 3116;
        c[1472].f = aU.gZ;
        c[1472].j = 128;
        c[1472].k = 128;
        c[1472].l = 0;
        c[1472].m = 60;
        c[1472].n = 60;
        c[1472].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1472].i = new int[]{26520, 26533, 26522, 0, 0, 0};
        c[1472].g = class_99.a[693];
        c[1473].e = 3116;
        c[1473].f = aU.gZ;
        c[1473].j = 128;
        c[1473].k = 128;
        c[1473].l = 0;
        c[1473].m = 60;
        c[1473].n = 60;
        c[1473].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1473].i = new int[]{57286, 58304, 57259, 0, 0, 0};
        c[1473].g = class_99.a[693];
        c[1474].e = 28081;
        c[1474].f = 6971;
        c[1474].j = 112;
        c[1474].k = 64;
        c[1474].l = 0;
        c[1474].m = 0;
        c[1474].n = 0;
        c[1474].h = new int[]{33752, 127, 12859, 0, 0, 0};
        c[1474].i = new int[]{12859, 4550, aU.LH, 0, 0, 0};
        c[1474].g = class_99.a[6971];
        c[1475].e = GL11.GL_MAP1_INDEX;
        c[1475].f = 366;
        c[1475].j = 128;
        c[1475].k = 128;
        c[1475].l = 0;
        c[1475].m = 0;
        c[1475].n = 0;
        c[1475].h = new int[]{21190, 0, 0, 0, 0, 0};
        c[1475].i = new int[]{44742, 0, 0, 0, 0, 0};
        c[1475].g = class_99.a[366];
        c[1476].e = GL11.GL_MAP1_INDEX;
        c[1476].f = -1;
        c[1476].j = 128;
        c[1476].k = 128;
        c[1476].l = 0;
        c[1476].m = 0;
        c[1476].n = 0;
        c[1476].h = new int[]{21190, 0, 0, 0, 0, 0};
        c[1476].i = new int[]{44742, 0, 0, 0, 0, 0};
        c[1477].e = 34658;
        c[1477].f = 4500;
        c[1477].j = 92;
        c[1477].k = 92;
        c[1477].l = 0;
        c[1477].m = 0;
        c[1477].n = 0;
        c[1477].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1477].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1477].g = class_99.a[4500];
        c[1478].e = 34658;
        c[1478].f = 7885;
        c[1478].j = 92;
        c[1478].k = 92;
        c[1478].l = 0;
        c[1478].m = 0;
        c[1478].n = 0;
        c[1478].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1478].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1478].g = class_99.a[7885];
        c[1479].e = ARBVertexProgram.GL_MATRIX25_ARB;
        c[1479].f = 7884;
        c[1479].j = 120;
        c[1479].k = 120;
        c[1479].l = 0;
        c[1479].m = 0;
        c[1479].n = 0;
        c[1479].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1479].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1479].g = class_99.a[7884];
        c[1481].e = ARBVertexProgram.GL_MATRIX26_ARB;
        c[1481].f = 7884;
        c[1481].j = 144;
        c[1481].k = 144;
        c[1481].l = 0;
        c[1481].m = 0;
        c[1481].n = 0;
        c[1481].h = new int[]{8125, aU.yn, 957, 0, 0, 0};
        c[1481].i = new int[]{6073, 4027, 945, 0, 0, 0};
        c[1481].g = class_99.a[7884];
        c[1480].e = 3116;
        c[1480].f = aU.gZ;
        c[1480].j = 128;
        c[1480].k = 128;
        c[1480].l = 0;
        c[1480].m = 20;
        c[1480].n = 40;
        c[1480].h = new int[]{7104, 6080, 960, 0, 0, 0};
        c[1480].i = new int[]{33752, 33740, EXTTextureMirrorClamp.GL_MIRROR_CLAMP_EXT, 0, 0, 0};
        c[1480].g = class_99.a[693];
        c[1482].e = 17550;
        c[1482].f = 1990;
        c[1482].j = 128;
        c[1482].k = 128;
        c[1482].l = 0;
        c[1482].m = 60;
        c[1482].n = 0;
        c[1482].h = new int[]{3755, 6055, aU.zK, 5807, 5935, 0};
        c[1482].i = new int[]{491770, 491770, 491770, 491770, 491770, 0};
        c[1482].g = class_99.a[1990];
        c[1483].e = ARBVertexProgram.GL_MATRIX26_ARB;
        c[1483].f = 7884;
        c[1483].j = 144;
        c[1483].k = 144;
        c[1483].l = 0;
        c[1483].m = 0;
        c[1483].n = 0;
        c[1483].h = new int[]{8125, aU.yn, 957, 0, 0, 0};
        c[1483].i = new int[]{356770, 356770, 356770, 0, 0, 0};
        c[1483].g = class_99.a[7884];
        c[1040].e = 20825;
        c[1040].f = 5462;
        c[1040].j = 128;
        c[1040].k = 128;
        c[1040].l = 0;
        c[1040].m = 0;
        c[1040].n = 0;
        c[1040].h = new int[]{43270, 43038, 0, 0, 0, 0};
        c[1040].i = new int[]{33558, 33438, 0, 0, 0, 0};
        c[1040].g = class_99.a[5462];
        c[1042].e = 20824;
        c[1042].f = 5461;
        c[1042].j = 128;
        c[1042].k = 128;
        c[1042].l = 0;
        c[1042].m = 0;
        c[1042].n = 0;
        c[1042].h = new int[]{43051, 43038, 4, 0, 0, 0};
        c[1042].i = new int[]{33558, 33438, 29985, 0, 0, 0};
        c[1042].g = class_99.a[5461];
        c[1045].e = ARBVertexProgram.GL_MATRIX26_ARB;
        c[1045].f = 7884;
        c[1045].j = 144;
        c[1045].k = 144;
        c[1045].l = 0;
        c[1045].m = 0;
        c[1045].n = 0;
        c[1045].h = new int[]{8125, aU.yn, 957, 0, 0, 0};
        c[1045].i = new int[]{428770, 491770, 359770, 0, 0, 0};
        c[1045].g = class_99.a[7884];
        c[665].e = 20823;
        c[665].f = 5460;
        c[665].j = 128;
        c[665].k = 128;
        c[665].l = 0;
        c[665].m = 0;
        c[665].n = 0;
        c[665].h = new int[]{43270, 43038, 0, 0, 0, 0};
        c[665].i = new int[]{33558, 33438, 0, 0, 0, 0};
        c[665].g = class_99.a[5460];
        c[670].e = 40823;
        c[670].f = 5460;
        c[670].j = 128;
        c[670].k = 128;
        c[670].l = 0;
        c[670].m = 0;
        c[670].n = 0;
        c[670].h = new int[]{43270, 43038, 0, 0, 0, 0};
        c[670].i = new int[]{6073, 6075, 0, 0, 0, 0};
        c[670].g = class_99.a[5460];
        c[672].e = 40825;
        c[672].f = 5462;
        c[672].j = 128;
        c[672].k = 128;
        c[672].l = 0;
        c[672].m = 0;
        c[672].n = 0;
        c[672].h = new int[]{43270, 43038, 0, 0, 0, 0};
        c[672].i = new int[]{6073, 6075, 0, 0, 0, 0};
        c[672].g = class_99.a[5462];
        c[673].e = 40824;
        c[673].f = 5461;
        c[673].j = 128;
        c[673].k = 128;
        c[673].l = 0;
        c[673].m = 0;
        c[673].n = 0;
        c[673].h = new int[]{43051, 43038, 4, 0, 0, 0};
        c[673].i = new int[]{6073, 6075, 6070, 0, 0, 0};
        c[673].g = class_99.a[5461];
        c[666].e = 20822;
        c[666].f = 5460;
        c[666].j = 128;
        c[666].k = 128;
        c[666].l = 0;
        c[666].m = 0;
        c[666].n = 0;
        c[666].h = new int[]{43270, 43038, 0, 0, 0, 0};
        c[666].i = new int[]{1, 933, 0, 0, 0, 0};
        c[666].g = class_99.a[5460];
        c[667].e = 26636;
        c[667].f = 2083;
        c[667].j = 128;
        c[667].k = 128;
        c[667].l = 0;
        c[667].m = 0;
        c[667].n = 0;
        c[667].h = new int[]{62119, 59612, 0, 0, 0, 0};
        c[667].i = new int[]{926, 926, 0, 0, 0, 0};
        c[667].g = class_99.a[2083];
        c[669].e = 20826;
        c[669].f = 5462;
        c[669].j = 128;
        c[669].k = 128;
        c[669].l = 0;
        c[669].m = 0;
        c[669].n = 0;
        c[669].h = new int[]{43270, 43038, 0, 0, 0, 0};
        c[669].i = new int[]{933, 1, 0, 0, 0, 0};
        c[669].g = class_99.a[5462];
        c[1242].e = 29306;
        c[1242].f = CL10.CL_KERNEL_NUM_ARGS;
        c[1242].j = 128;
        c[1242].k = 128;
        c[1242].l = 0;
        c[1242].m = 0;
        c[1242].n = 0;
        c[1242].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1242].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1242].g = class_99.a[4497];
        c[1117] = new class_127(c[325]);
        c[1117].d = aU.kv;
        c[1117].h = new int[]{57, 61};
        c[1117].i = new int[]{59720, 59720};
        c[1098] = new class_127(c[326]);
        c[1098].d = 1098;
        c[1098].h = new int[]{57, 61};
        c[1098].i = new int[]{59720, 59720};
        class_127 class_127Var = c[1338];
        class_127 class_127Var2 = c[1338];
        class_127Var.e = a(aU.lS);
        class_127 class_127Var3 = c[1338];
        class_127 class_127Var4 = c[1338];
        class_127Var3.f = b(aU.lS);
        c[1338].g = class_99.a[c[1338].f];
        class_127 class_127Var5 = c[1339];
        class_127 class_127Var6 = c[1339];
        class_127Var5.e = a(aU.lR);
        class_127 class_127Var7 = c[1339];
        class_127 class_127Var8 = c[1339];
        class_127Var7.f = b(aU.lR);
        c[1339].g = class_99.a[c[1339].f];
        class_127 class_127Var9 = c[1522];
        class_127 class_127Var10 = c[1522];
        class_127Var9.e = a(1099);
        class_127 class_127Var11 = c[1522];
        class_127 class_127Var12 = c[1522];
        class_127Var11.f = b(1099);
        c[1522].g = class_99.a[c[1522].f];
        class_127 class_127Var13 = c[1523];
        class_127 class_127Var14 = c[1523];
        class_127Var13.e = a(aU.ke);
        class_127 class_127Var15 = c[1523];
        class_127 class_127Var16 = c[1523];
        class_127Var15.f = b(aU.ke);
        c[1523].g = class_99.a[c[1523].f];
        class_127 class_127Var17 = c[1524];
        class_127 class_127Var18 = c[1524];
        class_127Var17.e = a(380);
        class_127 class_127Var19 = c[1524];
        class_127 class_127Var20 = c[1524];
        class_127Var19.f = b(380);
        c[1524].g = class_99.a[c[1524].f];
        c[1525].e = 36319;
        c[1525].h = new int[]{22459, 22451};
        c[1525].i = new int[]{935, 924};
        class_127 class_127Var21 = c[1525];
        class_127 class_127Var22 = c[1525];
        class_127Var21.f = b(425);
        c[1525].g = class_99.a[c[1525].f];
        class_127 class_127Var23 = c[1526];
        class_127 class_127Var24 = c[1526];
        class_127Var23.e = a(1099);
        class_127 class_127Var25 = c[1526];
        class_127 class_127Var26 = c[1526];
        class_127Var25.f = b(1099);
        c[1526].g = class_99.a[c[1526].f];
        c[321].e = 21851;
        c[321].f = aU.rT;
        c[321].j = 128;
        c[321].k = 128;
        c[321].l = 0;
        c[321].m = 0;
        c[321].n = 0;
        c[321].h = new int[]{0, 0, 0, 0, 0, 0};
        c[321].i = new int[]{0, 0, 0, 0, 0, 0};
        c[321].g = class_99.a[1715];
        c[3001] = new class_127();
        c[3001].d = aU.vu;
        c[3001].e = 43249;
        c[3001].f = 9172;
        c[3001].j = 128;
        c[3001].k = 128;
        c[3001].l = 0;
        c[3001].m = 30;
        c[3001].n = 0;
        c[3001].h = new int[]{0, 0, 0, 0, 0, 0};
        c[3001].i = new int[]{0, 0, 0, 0, 0, 0};
        c[3001].g = class_99.a[9172];
        c[1340] = new class_127();
        c[1340].d = aU.nX;
        c[1340].e = 43249;
        c[1340].f = 9172;
        c[1340].j = 128;
        c[1340].k = 128;
        c[1340].l = 0;
        c[1340].m = 30;
        c[1340].n = 0;
        c[1340].h = new int[]{0, 0, 0, 0, 0, 0};
        c[1340].i = new int[]{0, 0, 0, 0, 0, 0};
        c[1340].g = class_99.a[9172];
        c[3000] = new class_127();
        c[3000].d = aU.vt;
        c[3000].e = 43178;
        c[3000].f = aU.rS;
        c[3000].j = 128;
        c[3000].k = 128;
        c[3000].l = 0;
        c[3000].m = 30;
        c[3000].n = 10;
        c[3000].h = new int[]{0, 0, 0, 0, 0, 0};
        c[3000].i = new int[]{0, 0, 0, 0, 0, 0};
        c[3000].g = class_99.a[15282];
        c[3012] = new class_127();
        c[3012].d = aU.vF;
        c[3012].e = 6403;
        c[3012].f = 1980;
        c[3012].j = 132;
        c[3012].k = 132;
        c[3012].l = 0;
        c[3012].m = 10;
        c[3012].n = 40;
        c[3012].h = new int[]{43034, 28, 0, 0, 0, 0};
        c[3012].i = new int[]{50894, 62406, 0, 0, 0, 0};
        c[3012].g = class_99.a[15284];
        class_621 class_621Var = new class_621();
        class_621Var.d();
        for (int i2 : class_621Var.f().b()) {
            c[i2] = class_621Var.a(i2);
        }
    }

    public void a(int i, int i2, int i3) {
        c[i3].e = i;
        c[i3].f = i2;
        c[i3].j = 128;
        c[i3].k = 128;
        c[i3].l = 0;
        c[i3].m = 0;
        c[i3].n = 0;
        this.g = class_99.a[c[i3].f];
    }

    private void a(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                return;
            }
            if (iY == 1) {
                this.e = buffer.A();
            } else if (iY == 2) {
                this.f = buffer.A();
                if (class_99.a != null) {
                    this.g = class_99.a[this.f];
                }
            } else if (iY == 4) {
                this.j = buffer.A();
            } else if (iY == 5) {
                this.k = buffer.A();
            } else if (iY == 6) {
                this.l = buffer.A();
            } else if (iY == 7) {
                this.m = buffer.y();
            } else if (iY == 8) {
                this.n = buffer.y();
            } else if (iY == 40) {
                int iY2 = buffer.y();
                for (int i = 0; i < iY2; i++) {
                    this.h[i] = buffer.A();
                    this.i[i] = buffer.A();
                }
            } else {
                System.out.println("Error unrecognised spotanim config code: " + iY);
            }
        }
    }

    private static int d(int i) {
        String upperCase = Integer.toHexString(i).toUpperCase();
        return Integer.parseInt(upperCase.length() > 4 ? upperCase.substring(4) : upperCase, 16);
    }

    public ColorUtility a() {
        ColorUtility colorUtility = (ColorUtility) p.a(this.d);
        if (colorUtility != null) {
            a(colorUtility, this.d);
            return colorUtility;
        }
        try {
            class_83.a(this.o);
            ColorUtility colorUtilityE = ColorUtility.e(this.e);
            class_83.a(false);
            if (colorUtilityE == null) {
                return null;
            }
            a(colorUtilityE, this.d);
            for (int i = 0; i < this.h.length && i < this.i.length; i++) {
                if (this.h[0] != 0 || this.o) {
                    colorUtilityE.i(this.h[i], this.i[i]);
                }
            }
            if (this.r != null && this.r.d()) {
                for (int i2 = 0; i2 < colorUtilityE.ah; i2++) {
                    this.r.f().a(colorUtilityE, i2);
                }
            }
            p.a(colorUtilityE, this.d);
            return colorUtilityE;
        } catch (Throwable th) {
            class_83.a(false);
            throw th;
        }
    }

    public class_127() {
        this.b = 9;
        this.f = -1;
        this.h = new int[6];
        this.i = new int[6];
        this.j = 128;
        this.k = 128;
    }

    public static int a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < a; i3++) {
            if (i == i3) {
                i2 = c[i3].e;
            }
        }
        return i2;
    }

    public static int b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < a; i3++) {
            if (i == i3) {
                i2 = c[i3].f;
            }
        }
        return i2;
    }

    public ColorUtility c(int i) {
        if (this.g == null || !this.g.b()) {
            return null;
        }
        ColorUtility colorUtilityE = (ColorUtility) p.a(this.d);
        if (colorUtilityE == null) {
            try {
                class_83.a(this.o);
                colorUtilityE = ColorUtility.e(this.e);
                class_83.a(false);
            } catch (Throwable th) {
                class_83.a(false);
                throw th;
            }
        }
        if (colorUtilityE == null) {
            return null;
        }
        return i != -1 ? this.g.b(colorUtilityE, i) : colorUtilityE.c(true);
    }

    public class_127(class_127 class_127Var) {
        this(class_127Var.d, class_127Var);
    }

    public class_127(int i, class_127 class_127Var) {
        this.d = i;
        this.o = class_127Var.o;
        this.b = class_127Var.b;
        this.e = class_127Var.e;
        this.f = class_127Var.f;
        this.g = class_127Var.g;
        this.h = new int[class_127Var.h.length];
        for (int i2 = 0; i2 < class_127Var.h.length; i2++) {
            this.h[i2] = class_127Var.h[i2];
        }
        this.i = new int[class_127Var.i.length];
        for (int i3 = 0; i3 < class_127Var.i.length; i3++) {
            this.i[i3] = class_127Var.i[i3];
        }
        this.j = class_127Var.j;
        this.k = class_127Var.k;
        this.l = class_127Var.l;
        this.m = class_127Var.m;
        this.n = class_127Var.n;
    }
}
