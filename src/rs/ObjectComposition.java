package rs;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aU;
import gnu.trove.f.b.cc;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.lwjgl.opencl.CL12;
import org.lwjgl.opencl.CL22;
import org.lwjgl.opengl.ARBImaging;
import org.lwjgl.opengl.CGL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.KHRShaderSubgroup;
import org.lwjgl.opengl.NVMemoryAttachment;
import org.lwjgl.opengl.NVMeshShader;
import org.lwjgl.system.windows.User32;
import rs.lpkg.e;
import rs.runelite.a.g;
import rs.plugins.cpkg.c;

/* JADX INFO: loaded from: client-final.jar:rs/ObjectComposition.class */
public final class ObjectComposition {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 10;
    public static final int n = 11;
    public static final int o = 12;
    public static final int p = 13;
    public static final int q = 14;
    public static final int r = 15;
    public static final int s = 16;
    public static final int t = 17;
    public static final int u = 18;
    public static final int v = 19;
    public static final int w = 20;
    public static final int x = 21;
    public static final int y = 22;
    public static class_624 z;
    public static int A;
    public static final String H = "E:\\Users\\dariu\\Desktop\\Files\\Documents\\OSRS Dumps\\177 dump\\index1\\";
    private static Buffer az;
    public boolean P;
    public byte Q;
    private int aA;
    public String R;
    public int S;
    public byte T;
    public int U;
    private int aC;
    public int V;
    public int[] W;
    public int X;
    public int Y;
    private boolean aD;
    public static boolean Z;
    private static Buffer aE;
    public int aa;
    private static int[] aF;
    public boolean ab;
    public int ac;
    public int[] ad;
    public int ae;
    public int af;
    public boolean ag;
    public boolean ah;
    public static Client ai;
    private boolean aG;
    public boolean aj;
    public int ak;
    public boolean al;
    private static int aH;
    public int am;
    public int[] an;
    public int ao;
    public int ap;
    private int[] aI;
    public byte[] aq;
    public boolean ar;
    public boolean as;
    public boolean at;
    public int au;
    public int av;
    public boolean aw;
    private static ObjectComposition[] aJ;
    private int aK;
    public int[] ax;
    public String[] ay;
    public static cc<ObjectComposition> B = new cc<>();
    public static Map<Integer, Boolean> C = new HashMap();
    public static final int[] D = {29131, 29132, 29133, 29113, 29136, 29137, 29138, 29139, 29120, 29130, 29122, 29121, 29123, 29124, 29125, 29126, CpioConstants.MAGIC_OLD_BINARY, 29128, 29129, 29254, 29255, 29256, 29257, 29258, 29259, 29260, 29261, 29253, 29252, 29251, 29250, 29249, 29248, 29247, 29246, 29245, 29244, 29243, 29242, 29237, 29238, 29239, 29240, 29241, 29262, 29263, 29264, 29267, 29268, 29269, 29230, 29270, 29271, 29272, 29273, 29274, 29275, 29276, 29277, 29231, 29232, 29233, 29234, 29422, 29362, 29227};
    public static class_119 E = class_119.a;
    public static boolean F = false;
    public static List<Integer> G = new ArrayList();
    public static boolean I = false;
    public static class_30 J = new class_30(500);
    public static class_30 K = new class_30(500);
    public static class_30 L = new class_30(1000);
    public static class_30 M = new class_30(500);
    public static class_30 N = new class_30(500);
    public static class_30 O = new class_30(1000);
    private static final ColorUtility[] aB = new ColorUtility[4];

    public static boolean a(ColorUtility colorUtility, int i2, int i3) {
        if (!Configuration.M) {
            return false;
        }
        if (Configuration.r == class_150.d) {
            if (i2 == 982 || i2 == 1394 || i2 == 321 || i2 == 320 || i2 == 319 || i2 == 4735 || i2 == 9484 || i2 == 26900 || i2 == 26901 || i2 == 26902 || i2 == 26903 || i2 == 26904 || i2 == 23926) {
                colorUtility.a(new int[]{16, 14, 13});
            }
            if (i2 == 26883 || i2 == 26887 || i2 == 26891 || i2 == 26972 || i2 == 26889 || i2 == 26892 || i2 == 26890 || i2 == 26885) {
                colorUtility.a(new int[]{8, 7, 6});
            }
            if (i2 == 26979 || i2 == 26977 || i2 == 26975 || i2 == 26978 || i2 == 26973 || i2 == 26974 || i2 == 27018 || i2 == 27019 || i2 == 27020) {
                colorUtility.a(new int[]{4010, 4025, 3995});
            }
            if (i2 == 27018 || i2 == 27019 || i2 == 27020 || i2 == 4470) {
                colorUtility.a(new int[]{aU.vP});
            }
            if (i2 == 2474 || i2 == 26922) {
                colorUtility.a(new int[]{aU.vP, 5});
            }
        }
        if (Configuration.r == class_150.b || Configuration.r == class_150.c) {
            if (i2 == 982 || i2 == 1394 || i2 == 321 || i2 == 320 || i2 == 319 || i2 == 4735 || i2 == 9484 || i2 == 26900 || i2 == 26901 || i2 == 26902 || i2 == 26903 || i2 == 26904 || i2 == 23926) {
                colorUtility.a(Configuration.r == class_150.c ? new int[]{10, 9, 8} : new int[]{36150, 127});
            }
            if (i2 == 26883 || i2 == 26887 || i2 == 26891 || i2 == 26972 || i2 == 26889 || i2 == 26892 || i2 == 26890 || i2 == 26885) {
                colorUtility.a(Configuration.r == class_150.c ? new int[]{10, 9, 8} : new int[]{80, 95});
            }
            if (i2 == 26979 || i2 == 26977 || i2 == 26975 || i2 == 26978 || i2 == 26973 || i2 == 26974 || i2 == 27018 || i2 == 27019 || i2 == 27020) {
                colorUtility.a(Configuration.r == class_150.c ? new int[]{910, 912} : new int[]{127, 121, 115});
            }
            if (i2 == 27018 || i2 == 27019 || i2 == 27020 || i2 == 4470) {
                colorUtility.a(new int[]{125});
            }
            if (i2 == 2474 || i2 == 26922) {
                colorUtility.a(Configuration.r == class_150.c ? new int[]{945, 10} : new int[]{36150, 127});
            }
        }
        switch (i2) {
            case 153:
                colorUtility.b(new int[]{1, 17}, new int[]{53, 1});
                return false;
            case 2501 /* G.do */:
                colorUtility.a(new int[]{350770, 350770, 933, 933, 933});
                return false;
            case 2805:
            case 5857:
                colorUtility.a(new int[]{15, 16, 15});
                return false;
            case 2816:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{12969}, new int[]{60});
                return true;
            case 2879:
                colorUtility.b(new int[]{17, 1}, new int[]{53, 61});
                return false;
            case GL11.GL_PIXEL_MAP_B_TO_B /* 3192 */:
                colorUtility.b(new int[]{7626, 7490}, new int[]{53, 53});
                return false;
            case 3752:
                colorUtility.a(new int[]{36150, 36150});
                return false;
            case 6487:
                colorUtility.a(new int[]{10, 15, 5});
                return false;
            case 6493:
                colorUtility.a(new int[]{10, 15, 5});
                return false;
            case 9666:
                colorUtility.b(new int[]{17, 1}, new int[]{24, 24});
                return false;
            case 11501:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{32803}, new int[]{58});
                return true;
            case 13291:
                if (Configuration.r == class_150.d) {
                    colorUtility.a(8128, new int[]{12, 10, 5});
                    colorUtility.a(51111, new int[]{4053, 4040, 4055});
                    return false;
                }
                colorUtility.a(8128, new int[]{12, 25, 50});
                colorUtility.a(51111, new int[]{45121, 45122, 51160, 51210, 51110, 51170, 51180});
                return false;
            case 16474:
                colorUtility.b(new int[]{10142, 10153, 10159, CGL.kCGLBadDisplay, 10155, 10163, 10023, 10027, 43067}, new int[]{30, 30, 58, 30, 30, 30, 30, 30, 5});
                return false;
            case 16999:
                colorUtility.a(aU.Bp, new int[]{8120, 8130, 8140});
                colorUtility.a(7952, new int[]{aU.Bp});
                colorUtility.a(7585, new int[]{aU.Bp});
                return false;
            case 21464:
                colorUtility.b(new int[]{10270, 10285}, new int[]{63, 71});
                return false;
            case 24500:
                colorUtility.b(new int[]{22535, 22533}, new int[]{62, 62});
                return false;
            case 26193:
                if (colorUtility == null) {
                    return false;
                }
                colorUtility.b(new int[]{7626, 7626, 6563, 6682, 49, 24, 7514}, new int[]{62, 62, 62, 62, 258, 258, 258});
                return false;
            case 29227:
            case 29422:
                colorUtility.a(new int[]{127, 7446}, 30);
                return false;
            case 29240:
                colorUtility.a(new int[]{62127, 62131, 62135, 62011, 61888}, 53);
                return false;
            case 29241:
                colorUtility.a(new int[]{61718, 61714, 61594, 61598, 61603}, 54);
                return false;
            default:
                return false;
        }
    }

    public static void a(int i2) {
        try {
            Files.copy(Paths.get("E:\\Users\\dariu\\Desktop\\Files\\Documents\\OSRS Dumps\\177 dump\\index1\\" + i2 + ".gz", new String[0]), Paths.get(class_650.f() + "index1/" + i2 + ".gz", new String[0]), new CopyOption[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void b(ObjectComposition objectComposition) {
        if (Client.ee == 1 && objectComposition.an != null) {
            for (int i2 : objectComposition.an) {
                if (C.get(Integer.valueOf(i2)) == null) {
                    System.out.print(i2 + ",");
                    C.put(Integer.valueOf(i2), true);
                    a(i2);
                }
            }
        }
    }

    public static void a(boolean z2) {
        if (Configuration.a == class_149.a) {
            return;
        }
        F = z2;
        if (z2) {
            az = new Buffer(Client.a(class_650.f() + "loc667.dat"));
            Buffer buffer = new Buffer(Client.a(class_650.f() + "loc667.idx"));
            int iA = buffer.A();
            aF = new int[iA + 40000];
            int iA2 = 2;
            for (int i2 = 0; i2 < iA; i2++) {
                aF[i2] = iA2;
                iA2 += buffer.A();
            }
            aJ = new ObjectComposition[20];
            for (int i3 = 0; i3 < 20; i3++) {
                aJ[i3] = new ObjectComposition();
            }
            return;
        }
        az = new Buffer(Client.a(class_650.f() + "loc.dat"));
        Buffer buffer2 = new Buffer(Client.a(class_650.f() + "loc.idx"));
        int iA3 = buffer2.A();
        aF = new int[iA3 + 40000];
        int iA4 = 2;
        for (int i4 = 0; i4 < iA3; i4++) {
            aF[i4] = iA4;
            iA4 += buffer2.A();
        }
        aJ = new ObjectComposition[20];
        for (int i5 = 0; i5 < 20; i5++) {
            aJ[i5] = new ObjectComposition();
        }
    }

    public static void a(class_119 class_119Var) {
        E = class_119Var;
        if (E == class_119.c) {
            az = new Buffer(Client.a(class_650.f() + "loc667.dat"));
            Buffer buffer = new Buffer(Client.a(class_650.f() + "loc667.idx"));
            int iA = buffer.A();
            aF = new int[iA + 40000];
            int iA2 = 2;
            for (int i2 = 0; i2 < iA; i2++) {
                aF[i2] = iA2;
                iA2 += buffer.A();
            }
            aJ = new ObjectComposition[20];
            for (int i3 = 0; i3 < 20; i3++) {
                aJ[i3] = new ObjectComposition();
            }
            return;
        }
        if (E == class_119.a) {
            az = new Buffer(Client.a(class_650.f() + "loc.dat"));
            Buffer buffer2 = new Buffer(Client.a(class_650.f() + "loc.idx"));
            int iA3 = buffer2.A();
            aF = new int[iA3 + 40000];
            int iA4 = 2;
            for (int i4 = 0; i4 < iA3; i4++) {
                aF[i4] = iA4;
                iA4 += buffer2.A();
            }
            aJ = new ObjectComposition[20];
            for (int i5 = 0; i5 < 20; i5++) {
                aJ[i5] = new ObjectComposition();
            }
            return;
        }
        if (E == class_119.b) {
            az = new Buffer(Client.a(class_650.f() + "osrs_loc.dat"));
            Buffer buffer3 = new Buffer(Client.a(class_650.f() + "osrs_loc.idx"));
            int iA5 = buffer3.A();
            aF = new int[iA5 + 40000];
            int iA6 = 2;
            for (int i6 = 0; i6 < iA5; i6++) {
                aF[i6] = iA6;
                iA6 += buffer3.A();
            }
            aJ = new ObjectComposition[20];
            for (int i7 = 0; i7 < 20; i7++) {
                aJ[i7] = new ObjectComposition();
            }
            return;
        }
        if (E == class_119.d) {
            az = new Buffer(Client.a(class_650.f() + "osrs_config" + File.separator + "loc.dat"));
            Buffer buffer4 = new Buffer(Client.a(class_650.f() + "osrs_config" + File.separator + "loc.idx"));
            int iA7 = buffer4.A();
            aF = new int[iA7 + 40000];
            int iA8 = 2;
            for (int i8 = 0; i8 < iA7; i8++) {
                aF[i8] = iA8;
                iA8 += buffer4.A();
            }
            aJ = new ObjectComposition[20];
            for (int i9 = 0; i9 < 20; i9++) {
                aJ[i9] = new ObjectComposition();
            }
        }
    }

    public static ObjectComposition b(int i2) {
        if (i2 > aF.length) {
            i2 = aF.length - 1;
        }
        ObjectComposition objectComposition = new ObjectComposition();
        objectComposition.aa = i2;
        objectComposition.a();
        try {
            az.h = aF[i2];
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (E == class_119.c) {
            objectComposition.d(az);
        } else if (E == class_119.b || E == class_119.d) {
            objectComposition.a(az);
        } else {
            objectComposition.c(az);
        }
        return objectComposition;
    }

    public static ObjectComposition c(int i2) {
        if (B.b(i2) != null) {
            return B.b(i2);
        }
        if (z.b(i2)) {
            ObjectComposition objectCompositionA = z.a(i2);
            if (objectCompositionA.aw || (objectCompositionA.av == 1 && E == class_119.d)) {
                return objectCompositionA;
            }
        }
        if (i2 > aF.length) {
            i2 = aF.length - 1;
        }
        for (int i3 = 0; i3 < 20; i3++) {
            if (aJ[i3].aa == i2) {
                return aJ[i3];
            }
        }
        aH = (aH + 1) % 20;
        ObjectComposition objectComposition = aJ[aH];
        try {
            az.h = aF[i2];
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        objectComposition.aa = i2;
        objectComposition.a();
        if (E == class_119.c) {
            objectComposition.d(az);
        } else if (E == class_119.b || E == class_119.d) {
            objectComposition.a(az);
        } else {
            objectComposition.c(az);
        }
        if (Configuration.r == class_150.d && (i2 == 1276 || i2 == 1278)) {
            objectComposition.R = "Decoration";
            objectComposition.an = new int[]{a(1284, 0)};
        }
        switch (i2) {
            case 23735:
                objectComposition.au = -1;
                break;
            case 31299:
                objectComposition.au = -1;
                break;
        }
        if (E == class_119.b) {
            class_73.a(objectComposition, i2);
        }
        switch (i2) {
            case 9521:
                objectComposition.R = null;
                objectComposition.an = new int[]{32466};
                objectComposition.X = 220;
                objectComposition.S = 220;
                objectComposition.am = 220;
                objectComposition.U = 4;
                objectComposition.af = 4;
                break;
            case 9522:
                objectComposition.R = "Enchanted crystals";
                objectComposition.ay = new String[]{"Mine", null, null, null, null};
                objectComposition.an = new int[]{32448, 32503};
                objectComposition.X = 50;
                objectComposition.S = 50;
                objectComposition.am = 50;
                objectComposition.U = 1;
                objectComposition.af = 1;
                break;
            case 15946:
                objectComposition.R = "Sand mound";
                objectComposition.ay = new String[]{"Dig", null, null, null, null};
                break;
        }
        if (E != class_119.d) {
            switch (i2) {
                case 153:
                    objectComposition.ay = new String[]{null, null, null, null, null};
                    objectComposition.X = 75;
                    objectComposition.S = 75;
                    objectComposition.am = 75;
                    objectComposition.U = 1;
                    objectComposition.af = 1;
                    break;
                case 154:
                    if (E == class_119.b) {
                        objectComposition.an = new int[]{aU.iR, aU.iS};
                    }
                    break;
                case 444:
                    objectComposition.X = 128;
                    objectComposition.S = 128;
                    objectComposition.am = 128;
                    break;
                case 445:
                case 1185:
                case aU.oX /* 1392 */:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Shell";
                        objectComposition.an[0] = 14142;
                        objectComposition.X = 129;
                        objectComposition.S = 129;
                        objectComposition.am = 129;
                    } else {
                        objectComposition.X = 128;
                        objectComposition.S = 128;
                        objectComposition.am = 128;
                    }
                    break;
                case 446:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Beach ball";
                        objectComposition.an[0] = 2755;
                        objectComposition.X = 222;
                        objectComposition.S = 222;
                        objectComposition.am = 222;
                    } else {
                        objectComposition.X = 128;
                        objectComposition.S = 128;
                        objectComposition.am = 128;
                    }
                    break;
                case aU.jk_ /* 579 */:
                    objectComposition.ay = new String[]{"Open", null, null, null, null};
                    objectComposition.R = "Mystic gem statue";
                    break;
                case 1189:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Seaweed";
                        objectComposition.an[0] = 2370;
                        objectComposition.X = 128;
                        objectComposition.S = 128;
                        objectComposition.am = 128;
                    } else if (Configuration.r == class_150.b || Configuration.r == class_150.c) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Snowdrops";
                        objectComposition.an[0] = a(9231, 0);
                        objectComposition.X = 90;
                        objectComposition.S = 90;
                        objectComposition.am = 90;
                    } else {
                        objectComposition.X = 128;
                        objectComposition.S = 128;
                        objectComposition.am = 128;
                    }
                    break;
                case aU.mn /* 1244 */:
                case aU.mo /* 1245 */:
                case aU.mr /* 1248 */:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Seaweed";
                        objectComposition.an[0] = 2370;
                        objectComposition.X = 100;
                        objectComposition.S = 100;
                        objectComposition.am = 100;
                    } else {
                        objectComposition.X = 128;
                        objectComposition.S = 128;
                        objectComposition.am = 128;
                    }
                    break;
                case aU.mA /* 1257 */:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Gravel";
                        objectComposition.an[0] = a(325, 0);
                        objectComposition.X = 64;
                        objectComposition.S = 64;
                        objectComposition.am = 64;
                    } else {
                        objectComposition.X = 128;
                        objectComposition.S = 128;
                        objectComposition.am = 128;
                    }
                    break;
                case aU.mN /* 1276 */:
                case aU.mP /* 1278 */:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.an[0] = a(8088, 0);
                        objectComposition.R = "Palm tree";
                    }
                    if (Configuration.r == class_150.b || Configuration.r == class_150.c) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Evergreen";
                        objectComposition.an[0] = a(aU.nA, 0);
                        objectComposition.X = 128;
                        objectComposition.S = 128;
                        objectComposition.am = 128;
                    }
                    break;
                case 1281:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Oak tree";
                        objectComposition.an[0] = a(13413, 0);
                        objectComposition.X = 122;
                        objectComposition.S = 122;
                        objectComposition.am = 122;
                        objectComposition.ax = new int[]{4762, aU.zn};
                        objectComposition.W = new int[]{4772, aU.zn};
                    }
                    break;
                case aU.nn /* 1303 */:
                case aU.no /* 1304 */:
                case aU.np /* 1305 */:
                    objectComposition.ay = new String[]{"Chop down", null, null, null, null};
                    break;
                case aU.nz /* 1315 */:
                case aU.nA /* 1316 */:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.an[0] = a(8088, 0);
                        objectComposition.R = "Big palm tree";
                        objectComposition.X = 155;
                        objectComposition.S = 155;
                        objectComposition.am = 155;
                    } else {
                        objectComposition.an = new int[]{1688};
                    }
                    break;
                case aU.oY /* 1393 */:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an = new int[1];
                        objectComposition.R = "Oyster";
                        objectComposition.an[0] = 2377;
                        objectComposition.X = 175;
                        objectComposition.S = 175;
                        objectComposition.am = 175;
                    } else {
                        objectComposition.X = 128;
                        objectComposition.S = 128;
                        objectComposition.am = 128;
                    }
                    break;
                case aU.qX /* 1620 */:
                case aU.ri /* 1631 */:
                case aU.ui /* 1902 */:
                case aU.uk /* 1904 */:
                case aU.ur /* 1911 */:
                case 9153:
                case 9154:
                case GL11.GL_OBJECT_PLANE /* 9473 */:
                case 26883:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[0] = a(aU.qT, 0);
                        objectComposition.an[2] = a(aU.qT, 0);
                        objectComposition.an[4] = a(aU.qT, 4);
                        objectComposition.an[1] = a(aU.qT, 3);
                        objectComposition.an[3] = a(aU.qT, 3);
                    }
                    break;
                case 1853:
                case 23743:
                case 23744:
                case 23746:
                case 23747:
                case 23829:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[0] = a(1855, 0);
                    }
                    break;
                case 1854:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[1] = a(aU.qT, 4);
                    }
                    break;
                case 2361:
                    objectComposition.R = "Larran's chest <img=17>";
                    break;
                case 2473:
                    objectComposition.R = "Donator zone portal";
                    break;
                case 2474:
                    objectComposition.R = "Duel arena portal";
                    break;
                case 2475:
                    objectComposition.R = "Gamble zone portal";
                    break;
                case 2501 /* G.do */:
                case 3752:
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    break;
                case 2654:
                    objectComposition.R = "Blood fountain";
                    objectComposition.U = 3;
                    objectComposition.af = 3;
                    objectComposition.ay = new String[]{"Make-offerings", null, null, null, null};
                    objectComposition.ax = new int[]{10266, 10270, 10279, 10275, 10283, 33325, 33222};
                    objectComposition.W = new int[]{10266, 10270, 10279, 10275, 10283, 926, 926};
                    break;
                case 2732:
                    objectComposition.au = 475;
                    break;
                case 2805:
                    objectComposition.R = "Revenant cave entrance";
                    break;
                case 2816:
                    objectComposition.R = "Dark altar";
                    objectComposition.ay = new String[]{"Craft-rune", null, null, null, null};
                    objectComposition.ax = new int[]{11813, 11937};
                    objectComposition.W = new int[]{15, 25};
                    objectComposition.aq = "Dark altar offers runecrafting and prayer regeneration.".getBytes();
                    break;
                case 2879:
                    objectComposition.R = "Blood synthesis pool";
                    objectComposition.ay = new String[]{"Look-into", null, null, null, null};
                    objectComposition.X = 130;
                    objectComposition.S = 130;
                    objectComposition.am = 130;
                    objectComposition.U = 2;
                    objectComposition.af = 2;
                    break;
                case 2908:
                case 2909:
                    objectComposition.ar = false;
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    break;
                case 2942:
                    objectComposition.ay = new String[]{"Drink-from", null, null, null, null};
                    break;
                case GL11.GL_PIXEL_MAP_B_TO_B /* 3192 */:
                    objectComposition.ax = new int[]{6932, 6689, 7626, 8662, 7490};
                    objectComposition.W = new int[]{7, 7, 932, 7, 932};
                    break;
                case GL11.GL_PIXEL_MAP_A_TO_A /* 3193 */:
                    objectComposition.an = new int[]{aU.ms};
                    break;
                case 3918:
                    objectComposition.au = -1;
                    break;
                case CL22.CL_PROGRAM_SCOPE_GLOBAL_CTORS_PRESENT /* 4458 */:
                    objectComposition.R = "<img=49> Bandage table";
                    break;
                case 4463:
                    objectComposition.R = "<img=53> Upgrade potion table";
                    break;
                case 4469:
                case 4470:
                    objectComposition.ar = false;
                    objectComposition.ab = false;
                    objectComposition.aj = false;
                    objectComposition.ay = new String[]{null, null, null, null, null};
                    break;
                case 4874:
                    objectComposition.R = "250k Stall";
                    break;
                case 4875:
                    objectComposition.R = "350k Stall";
                    break;
                case 4876:
                    objectComposition.R = "450k Stall";
                    break;
                case 4877:
                    objectComposition.R = "650k Stall";
                    break;
                case 4878:
                    objectComposition.R = "850k Stall";
                    break;
                case 5816:
                    objectComposition.ay = new String[]{"<img=57> Spawn", "<img=57> Toggle-hide", null, null, null};
                    objectComposition.R = "@gre@Monster spawn orb";
                    objectComposition.aj = false;
                    break;
                case 5817:
                    objectComposition.ay = new String[]{"Heal", null, null, null, null};
                    objectComposition.R = "@gre@Restore orb";
                    break;
                case 5857:
                    objectComposition.R = "Cave exit";
                    break;
                case 5949:
                    objectComposition.X = 175;
                    objectComposition.S = 175;
                    objectComposition.am = 175;
                    break;
                case 6282:
                    objectComposition.R = "Skotizo portal";
                    objectComposition.ax = new int[]{784, 41, 49, 916, 910};
                    objectComposition.W = new int[]{51096, 6, 10, 374770, 7};
                    break;
                case 6487:
                    objectComposition.R = "Wildy obelisk";
                    objectComposition.ay = new String[]{"Teleport", null, null, null, "Remove"};
                    break;
                case 6492:
                    objectComposition.R = "Blood totem";
                    objectComposition.ay = new String[]{"Give-offerings", null, null, null, null};
                    objectComposition.an[0] = a(6493, 0);
                    objectComposition.ax = new int[]{61, 7481, aU.Ja, 8732, aU.IS, 8613, 7485};
                    objectComposition.W = new int[]{945, 10, 5, 5, 10, 920, 920};
                    break;
                case 6493:
                    objectComposition.ay = new String[]{"Teleport", null, null, null, null};
                    break;
                case 6552:
                    objectComposition.ay = new String[]{"Switch-modern <img=59>", "Switch-ancients <img=55>", "Switch-lunar <img=56>", null, null};
                    objectComposition.R = "Spell-book altar";
                    break;
                case 6856:
                    objectComposition.R = "Safespot barricade";
                    break;
                case 7393:
                    objectComposition.R = "Upgrade tent";
                    objectComposition.ay = new String[]{"Open", null, null, null, null};
                    break;
                case 8988:
                    objectComposition.R = "Rogue's chest";
                    break;
                case 9046:
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    objectComposition.R = "Jack-o-lantern";
                    objectComposition.an = new int[]{19201};
                    objectComposition.ax = new int[]{0, 6963, 6959, 7083, 7073, 2700, 7081, 21539, 10266};
                    objectComposition.W = new int[]{1, 6963, 6959, 7083, 7048, G.eD, aU.Dt, 350755, 350755};
                    objectComposition.X = 600;
                    objectComposition.S = 600;
                    objectComposition.am = 600;
                    objectComposition.U = 2;
                    objectComposition.af = 2;
                    break;
                case 9074:
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    objectComposition.R = "Shell";
                    objectComposition.an = new int[]{14142};
                    objectComposition.X = 95;
                    objectComposition.S = 95;
                    objectComposition.am = 95;
                    break;
                case 9075:
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    objectComposition.R = "Jack-o-lantern";
                    objectComposition.an = new int[]{19201};
                    objectComposition.ax = new int[]{0, 6963, 6959, 7083, 7073, 2700, 7081, 21539, 10266};
                    objectComposition.W = new int[]{1, 6963 - 25, 6959 - 25, 7083 - 25, 7073 - 25, 2700 - 25, 7081 - 25, 350755, 350755};
                    objectComposition.X = 300;
                    objectComposition.S = 275;
                    objectComposition.am = 275;
                    break;
                case 9076:
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    objectComposition.R = "Beach ball";
                    objectComposition.an = new int[]{2755};
                    objectComposition.X = User32.WM_CHANGEUISTATE;
                    objectComposition.S = User32.WM_CHANGEUISTATE;
                    objectComposition.am = User32.WM_CHANGEUISTATE;
                    break;
                case 9391:
                    objectComposition.ax = new int[]{0};
                    objectComposition.W = new int[]{1};
                    break;
                case 9392:
                    objectComposition.R = "Blood obelisk";
                    objectComposition.aj = false;
                    objectComposition.ay = new String[]{"Rub", null, null, null, null};
                    objectComposition.ar = true;
                    objectComposition.ax = new int[]{0, 916, 42217, 920};
                    objectComposition.W = new int[]{926, 1, 1, 1};
                    break;
                case GL11.GL_EYE_PLANE /* 9474 */:
                case 23826:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[0] = a(aU.qT, 0);
                    }
                    break;
                case 9521:
                    objectComposition.R = null;
                    objectComposition.an = new int[]{32466};
                    objectComposition.X = 220;
                    objectComposition.S = 220;
                    objectComposition.am = 220;
                    objectComposition.U = 4;
                    objectComposition.af = 4;
                    break;
                case 9522:
                    objectComposition.R = "Enchanted crystals";
                    objectComposition.ay = new String[]{"Mine", null, null, null, null};
                    objectComposition.an = new int[]{32448, 32503};
                    objectComposition.X = 50;
                    objectComposition.S = 50;
                    objectComposition.am = 50;
                    objectComposition.U = 1;
                    objectComposition.af = 1;
                    break;
                case 9538:
                    objectComposition.R = "Row boat";
                    objectComposition.ay = new String[]{"Ferry", null, null, null, null};
                    break;
                case 9665:
                    objectComposition.an = new int[1];
                    objectComposition.R = "Beach shovel";
                    objectComposition.an[0] = a(9662, 0);
                    objectComposition.X = 222;
                    objectComposition.S = 222;
                    objectComposition.am = 222;
                    objectComposition.U = 2;
                    objectComposition.af = 2;
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    break;
                case 9666:
                    objectComposition.R = "Summer oasis";
                    objectComposition.an = new int[]{39691};
                    objectComposition.ay = new String[]{"Teleport", null, null, null, null};
                    objectComposition.X = 175;
                    objectComposition.S = 175;
                    objectComposition.am = 130;
                    objectComposition.U = 3;
                    objectComposition.af = 3;
                    break;
                case 9762:
                    objectComposition.R = "Kharazi chest <img=248>";
                    break;
                case 10384:
                    objectComposition.R = "Magical pumpkin";
                    objectComposition.ay = new String[]{"Take-from", null, null, null, null};
                    objectComposition.ar = true;
                    objectComposition.ax = new int[0];
                    objectComposition.W = new int[0];
                    objectComposition.an = new int[]{58432};
                    objectComposition.au = 8775;
                    break;
                case 10653:
                    objectComposition.R = "Christmas tree";
                    objectComposition.X = 65;
                    objectComposition.S = 65;
                    objectComposition.am = 65;
                    objectComposition.U = 3;
                    objectComposition.af = 4;
                    break;
                case 10654:
                    objectComposition.an = new int[]{10491, 10495, GL11.GL_CLAMP, 10497};
                    objectComposition.X = 30;
                    objectComposition.S = 30;
                    objectComposition.am = 30;
                    objectComposition.U = 1;
                    objectComposition.af = 1;
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    break;
                case 10660:
                    objectComposition.X = 100;
                    objectComposition.S = 100;
                    objectComposition.am = 100;
                    objectComposition.U = 4;
                    objectComposition.af = 4;
                    break;
                case 10686:
                    objectComposition.R = "Swift imp box table";
                    objectComposition.ay = new String[]{"Craft", null, null, null, null};
                    break;
                case 10690:
                    objectComposition.R = "Looty imp box table";
                    objectComposition.ay = new String[]{"Craft", null, null, null, null};
                    break;
                case 10694:
                    objectComposition.R = "Regular imp box table";
                    objectComposition.ay = new String[]{"Craft", null, null, null, null};
                    break;
                case 11501:
                    objectComposition.an = new int[]{28859};
                    objectComposition.R = "Jungle essence rock";
                    objectComposition.ay = new String[]{"Mine", null, null, null, null};
                    objectComposition.af = 3;
                    objectComposition.U = 3;
                    break;
                case 11698:
                    objectComposition.an = c(aU.yD).an;
                    objectComposition.aI = c(aU.yD).aI;
                    objectComposition.ax = new int[]{6697, 7580, aU.BY, 6693, 929, aU.yn, 9152, 0};
                    objectComposition.W = new int[]{10266, 10270, 10279, 10275, 10283, 10279, 10279, 0};
                    break;
                case 12110:
                    objectComposition.R = "Trading post";
                    objectComposition.ay = new String[]{"View-marketplace", null, null, null, null};
                    objectComposition.an = new int[]{27610};
                    break;
                case 12356:
                    objectComposition.R = "Oasis 2";
                    objectComposition.an = new int[]{39691};
                    objectComposition.ay = new String[]{null, null, null, null, null};
                    objectComposition.X = 175;
                    objectComposition.S = 175;
                    objectComposition.am = 130;
                    objectComposition.U = 3;
                    objectComposition.af = 3;
                    break;
                case 13291:
                    objectComposition.ay = new String[]{"Enchant", null, null, null, null};
                    break;
                case 13615:
                case 13622:
                case 13629:
                    objectComposition.R = "Kraken portal";
                    break;
                case 13616:
                case 13623:
                case 13630:
                    objectComposition.R = "Chaos elemental portal";
                    objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    objectComposition.W = new int[]{374770, 374770, 374770, 374770, 374770};
                    break;
                case 13617:
                case 13624:
                case 13631:
                    objectComposition.R = "Barrelchest portal";
                    objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    objectComposition.W = new int[]{7322, 7326, 7320, 7322, 7326};
                    break;
                case 13618:
                case 13625:
                case 13632:
                    objectComposition.R = "Crazy archaeologist portal";
                    break;
                case 13619:
                case 13626:
                case 13633:
                    objectComposition.R = "Wildywyrm portal";
                    objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    objectComposition.W = new int[]{935, 939, 815, 819, aU.hb};
                    break;
                case 13620:
                case 13627:
                case 13634:
                    objectComposition.R = "Demonic gorilla portal";
                    break;
                case 13621:
                case 13628:
                case 13635:
                    objectComposition.R = "Vet'ion portal";
                    objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    objectComposition.W = new int[]{51136, 51139, 51134, 51136, 51139};
                    break;
                case 13655:
                    objectComposition.ay = new String[]{"Teleport", null, null, null, "Remove"};
                    break;
                case aU.Qx /* 13830 */:
                    if (Configuration.af.equalsIgnoreCase("RIMMINGTON")) {
                        objectComposition.an = new int[]{13264};
                    }
                    if (Configuration.af.equalsIgnoreCase("POLLNIVERNEACH")) {
                        objectComposition.an = new int[]{13229};
                    }
                    if (Configuration.af.equalsIgnoreCase("TAVERLY")) {
                        objectComposition.an = new int[]{12357};
                    }
                    if (Configuration.af.equalsIgnoreCase("RELLEKA")) {
                        objectComposition.an = new int[]{13242};
                    }
                    if (Configuration.af.equalsIgnoreCase("FALADOR")) {
                        objectComposition.an = new int[]{13294};
                    }
                    if (Configuration.af.equalsIgnoreCase("ARDOUGNE")) {
                        objectComposition.an = new int[]{12664};
                    }
                    objectComposition.Q = (byte) 20;
                    break;
                case aU.QH /* 13840 */:
                    objectComposition.R = "Blood thorn bush";
                    objectComposition.X = 50;
                    objectComposition.S = 50;
                    objectComposition.am = 50;
                    objectComposition.U = 1;
                    objectComposition.af = 1;
                    objectComposition.ax = new int[]{5772};
                    objectComposition.W = new int[]{921};
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    break;
                case 13957:
                    objectComposition.a();
                    objectComposition.a(c(4470));
                    objectComposition.R = "Barrier";
                    objectComposition.aa = 13957;
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    break;
                case 14736:
                    objectComposition.ay = new String[]{"Climb-down", null, null, null, null};
                    break;
                case 15477:
                    if (Configuration.r == class_150.d) {
                        objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705, aU.kh_, 28, 24, 33, 37, 41};
                        objectComposition.W = new int[]{461745, 461745, 461745, 461745, 461745, 2, 10, 5, 10, 5, 10};
                    } else if (Configuration.r == class_150.e) {
                        objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                        objectComposition.W = new int[]{305745, 305745, 305745, 305745, 305745};
                    } else if (Configuration.r == class_150.b) {
                        objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                        objectComposition.W = new int[]{36150, 36150, 127, 127, 127};
                    } else if (Configuration.r == class_150.c) {
                        objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705, aU.kh_, 28, 24, 33, 37, 41};
                        objectComposition.W = new int[]{925, 935, 127, 127, 127, 5, 13, 8, 13, 8, 13};
                    } else {
                        objectComposition.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                        objectComposition.W = new int[]{50072, 49948, 49953, 49829, 49705};
                    }
                    break;
                case 16474:
                    objectComposition.R = "Kharazi storage chest";
                    objectComposition.ay = new String[]{"Look-in", null, null, null, null};
                    break;
                case 16998:
                    objectComposition.an = new int[]{24520, 24521};
                    objectComposition.au = 6023;
                    objectComposition.X = 115;
                    objectComposition.S = 115;
                    objectComposition.am = 125;
                    objectComposition.R = "Blood fountain";
                    objectComposition.U = 2;
                    objectComposition.af = 2;
                    objectComposition.ay = new String[]{"Make-offerings", null, null, null, "Remove"};
                    objectComposition.ax = new int[]{10266, 10270, 10279, 10275, 10283, 33325, 33222};
                    objectComposition.W = new int[]{10266, 10270, 10279, 10275, 10283, 926, 926};
                    break;
                case 16999:
                    objectComposition.R = "Gilded repair bench";
                    objectComposition.an = new int[]{12187};
                    objectComposition.ay = new String[]{null, null, null, null, "Remove"};
                    objectComposition.ax = new int[]{127, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, 8128, 33, 0};
                    objectComposition.W = new int[]{127, 8128, CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, 8128, 8128, 1};
                    objectComposition.au = 3573;
                    objectComposition.U = 2;
                    break;
                case 17000:
                    objectComposition.R = "Gilded burner";
                    objectComposition.an = new int[]{13116, 13114};
                    objectComposition.ay = new String[]{null, null, null, null, "Remove"};
                    objectComposition.ax = new int[]{127, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, 8128, 33, 0};
                    objectComposition.W = new int[]{127, 8128, CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, 8128, 8128, 1};
                    objectComposition.au = 3573;
                    break;
                case 17003:
                    objectComposition.ay = new String[]{"Teleport", null, null, null, "Remove"};
                    objectComposition.R = "Dark orrery";
                    objectComposition.an = new int[]{12970};
                    objectComposition.au = 3579;
                    objectComposition.U = 3;
                    objectComposition.af = 3;
                    objectComposition.ax = new int[]{6682, 6443, 6798, 107, 70, 8128, 38119, 8299, 1950, 65535};
                    objectComposition.W = new int[]{10, 15, 10, 5, 20, 926, 10, 15, 17, 65535};
                    break;
                case 18641:
                    objectComposition.R = "Event armory";
                    break;
                case 18856:
                    objectComposition.X = 150;
                    objectComposition.S = 150;
                    objectComposition.am = 175;
                    break;
                case 19035:
                    objectComposition.am = User32.VK_PLAY;
                    break;
                case 19036:
                    objectComposition.R = "Giant snowglobe";
                    objectComposition.ay = new String[]{"Exchange", null, null, null, null};
                    objectComposition.an = new int[]{30309};
                    objectComposition.X = 700;
                    objectComposition.S = 700;
                    objectComposition.am = aU.uS;
                    objectComposition.U = 1;
                    objectComposition.af = 1;
                    break;
                case 19039:
                    objectComposition.ay = new String[]{"Climb-down", "Peek", null, null, null};
                    break;
                case 20298:
                    objectComposition.a(c(13661));
                    objectComposition.R = "Slayer crystal";
                    objectComposition.ay = new String[]{"Rub", null, null, null, "Remove"};
                    objectComposition.ax = new int[]{6682, 8128, 38123, 43129};
                    objectComposition.W = new int[]{5, g.e, g.e, g.e};
                    break;
                case 20299:
                    objectComposition.a(c(13661));
                    objectComposition.R = "Hotspot crystal";
                    objectComposition.ay = new String[]{"Rub", null, null, null, "Remove"};
                    objectComposition.ax = new int[]{6682, 8128, 38123, 43129};
                    objectComposition.W = new int[]{8127, 87770, 87770, 87770};
                    break;
                case 20300:
                    objectComposition.a(c(13661));
                    objectComposition.R = "Grand crystal";
                    objectComposition.ay = new String[]{"Rub", null, null, null, "Remove"};
                    break;
                case 20301:
                    objectComposition.a(c(13664));
                    objectComposition.R = "Raids chart";
                    objectComposition.ay = new String[]{"Study", null, null, null, "Remove"};
                    objectComposition.ax = new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 5652, aU.JD};
                    objectComposition.W = new int[]{51136, 51136, 51136, 10};
                    break;
                case 21464:
                    objectComposition.R = "Throne of the gods";
                    objectComposition.ay = new String[]{"Sit", "Claim-sceptre", null, null, "Remove"};
                    break;
                case 21465:
                    objectComposition.R = "Well of Goodwill";
                    objectComposition.ay = new String[]{"Contribute", "Point-shop", null, null, null};
                    objectComposition.ar = true;
                    objectComposition.an = new int[]{29561};
                    objectComposition.U = 2;
                    objectComposition.af = 2;
                    if (Configuration.r == class_150.d) {
                        objectComposition.ax = new int[]{35891, 28727, 26665, 21522, 10262, 10275, 49, NVMeshShader.GL_REFERENCED_BY_TASK_SHADER_NV, NVMeshShader.GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV, 38420, 38189, 38424, NVMemoryAttachment.GL_DETACHED_MEMORY_INCARNATION_NV, NVMemoryAttachment.GL_ATTACHED_MEMORY_OFFSET_NV, KHRShaderSubgroup.GL_SUBGROUP_SUPPORTED_STAGES_KHR, KHRShaderSubgroup.GL_SUBGROUP_QUAD_ALL_STAGES_KHR, 37175, 39116, 39450, 35895, 37925, 37933, 35904, 35899, 37941, 35912, 35908, 37970, 10396, 10388, 7341, 7326, 49218};
                        objectComposition.W = new int[]{32, 5, 15, 5, 15, 5, 4023, 4015, aU.vP, 4040, 4020, 4010, 4015, aU.vP, 4040, 4010, 4020, 4040, 4040, 10, 10, 15, 10, 15, 10, 10, 15, 10, 5, 5, 2, 2, 32};
                    }
                    if (Configuration.r == class_150.b || Configuration.r == class_150.c) {
                        objectComposition.ax = new int[]{35891, 28727, 26665, 21522, 10262, 10275, 49, NVMeshShader.GL_REFERENCED_BY_TASK_SHADER_NV, NVMeshShader.GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV, 38420, 38189, 38424, NVMemoryAttachment.GL_DETACHED_MEMORY_INCARNATION_NV, NVMemoryAttachment.GL_ATTACHED_MEMORY_OFFSET_NV, KHRShaderSubgroup.GL_SUBGROUP_SUPPORTED_STAGES_KHR, KHRShaderSubgroup.GL_SUBGROUP_QUAD_ALL_STAGES_KHR, 37175, 39116, 39450, 35895, 37925, 37933, 35904, 35899, 37941, 35912, 35908, 37970, 10396, 10388, 7341, 7326, 49218};
                        objectComposition.W = new int[]{36150, 127, 125, 127, 125, 127, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 115, 115, 125, 115, 125, 115, 115, 125, 115, 127, 127, 127, 127, 36150};
                    }
                    break;
                case 23113:
                case 23115:
                    objectComposition.ay = new String[]{"Search", null, null, null, null};
                    break;
                case 23735:
                case 23780:
                case 23818:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[0] = a(aU.qT, 0);
                        objectComposition.an[1] = a(aU.qT, 3);
                        objectComposition.an[3] = a(aU.qT, 4);
                        objectComposition.au = -1;
                    }
                    break;
                case 23738:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[0] = a(aU.qT, 0);
                        objectComposition.an[2] = a(aU.qT, 4);
                    }
                    break;
                case 23740:
                case 23825:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[1] = a(aU.qT, 0);
                    }
                    break;
                case 23742:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[0] = a(aU.qT, 0);
                        objectComposition.an[2] = a(aU.qT, 0);
                    }
                    break;
                case 24500:
                    objectComposition.R = "Summer comet";
                    objectComposition.ay = new String[]{"Mine", null, null, null, null};
                    objectComposition.an = new int[]{42165};
                    objectComposition.X = 200;
                    objectComposition.S = 200;
                    objectComposition.am = 200;
                    objectComposition.U = 4;
                    objectComposition.af = 4;
                    break;
                case 26193:
                    objectComposition.R = "Event reward chest";
                    objectComposition.ay = new String[]{"Reward exchange", null, null, null, null};
                    break;
                case 26887:
                case 26891:
                case 26892:
                    if (Configuration.r == class_150.e) {
                        objectComposition.an[0] = a(1855, 0);
                    }
                    break;
                case 26938:
                    objectComposition.R = "Equipment coffer";
                    objectComposition.ay = new String[]{"Open", null, null, null, null};
                    objectComposition.ax = new int[]{22412, 10281, 10285, 10277, 10270, 10275, 5165, 5161};
                    objectComposition.W = new int[]{7114, 7114, 7114, 266770, 15, 1, 7114, 7114};
                    break;
                case 27226:
                    objectComposition.ay = new String[]{null, null, null, null, null};
                    break;
                case 27266:
                    objectComposition.ay = new String[]{null, null, null, null, null};
                    break;
                case 27787:
                    objectComposition.an = new int[]{40742};
                    break;
                case 29227:
                case 29362:
                case 29422:
                    if (i2 == 29362) {
                        objectComposition.af = 2;
                        objectComposition.U = 2;
                    }
                    objectComposition.ay = new String[]{"Teleport", null, null, null, "Remove"};
                    break;
                case 29237:
                case 29238:
                case 29239:
                case 29240:
                case 29241:
                    if (i2 == 29238) {
                        objectComposition.R = "Blood pool";
                    } else if (i2 == 29239) {
                        objectComposition.R = "Dragon pool";
                    } else if (i2 == 29240) {
                        objectComposition.R = "Blood pool";
                    } else if (i2 == 29241) {
                        objectComposition.R = "Enchanted pool";
                    }
                    objectComposition.ay = new String[]{"Drink", null, null, null, "Remove"};
                    objectComposition.au = -1;
                    break;
                case 29254:
                case 29255:
                case 29256:
                case 29257:
                case 29258:
                case 29259:
                case 29260:
                case 29261:
                case 29276:
                case 29277:
                    if (objectComposition.ax != null) {
                        int[] iArr = objectComposition.ax;
                        int[] iArr2 = objectComposition.W;
                        objectComposition.ax = new int[iArr.length + 1];
                        objectComposition.W = new int[iArr2.length + 1];
                        for (int i4 = 0; i4 < iArr.length; i4++) {
                            objectComposition.ax[i4] = iArr[i4];
                            objectComposition.W[i4] = iArr2[i4];
                        }
                        objectComposition.ax[objectComposition.ax.length - 1] = 0;
                        objectComposition.W[objectComposition.W.length - 1] = 1;
                    } else {
                        objectComposition.ax = new int[]{0};
                        objectComposition.W = new int[]{1};
                    }
                    break;
                case 29879:
                    objectComposition.au = -1;
                    break;
                case 29889:
                    objectComposition.ay = new String[5];
                    break;
                case 31299:
                    objectComposition.au = -1;
                    break;
                case 31559:
                    objectComposition.an = new int[]{44127, 44124, 44133};
                    break;
                case 31560:
                    objectComposition.an = new int[]{44131};
                    break;
                case 31561:
                    objectComposition.an = new int[]{44135};
                    break;
                case 31562:
                    objectComposition.an = new int[]{44129};
                    break;
                case 31563:
                    objectComposition.an = new int[]{44128};
                    break;
                case 31564:
                    objectComposition.an = new int[]{44137};
                    break;
                case 31565:
                    objectComposition.an = new int[]{44138};
                    break;
                case 31566:
                    objectComposition.an = new int[]{44139};
                    break;
                case 31567:
                    objectComposition.an = new int[]{44130};
                    break;
                case 31568:
                    objectComposition.an = new int[]{44125};
                    break;
                case class_344.d /* 32457 */:
                    objectComposition.aj = false;
                    objectComposition.ar = false;
                    break;
                case 32687:
                    objectComposition.al = false;
                    objectComposition.aj = true;
                    objectComposition.ar = true;
                    break;
                case ARBImaging.GL_HISTOGRAM_LUMINANCE_SIZE /* 32812 */:
                    objectComposition.R = "Large door";
                    objectComposition.ay = new String[]{"Enter", null, null, null, null};
                    objectComposition.ar = true;
                    break;
                case 33028:
                    objectComposition.R = "Barrier";
                    objectComposition.ay = new String[]{"Pass-through", null, null, null, null};
                    objectComposition.ar = true;
                    break;
            }
        }
        if (class_124.a(Client.cT) && c.e) {
            objectComposition.R += " @whi@[" + i2 + "]";
        }
        if ((i2 >= 29000 && i2 <= 30000) || i2 == 31560 || i2 == 31559 || i2 == 31561 || i2 == 27787 || i2 == 31567 || i2 == 31566 || i2 == 31565 || i2 == 31562 || i2 == 31563) {
            if (objectComposition.ax != null) {
                int[] iArr3 = objectComposition.ax;
                int[] iArr4 = objectComposition.W;
                objectComposition.ax = new int[iArr3.length + 1];
                objectComposition.W = new int[iArr4.length + 1];
                for (int i5 = 0; i5 < iArr3.length; i5++) {
                    objectComposition.ax[i5] = iArr3[i5];
                    objectComposition.W[i5] = iArr4[i5];
                }
                objectComposition.ax[objectComposition.ax.length - 1] = 0;
                objectComposition.W[objectComposition.W.length - 1] = 1;
            } else {
                objectComposition.ax = new int[]{0};
                objectComposition.W = new int[]{1};
            }
        }
        if (Configuration.d.booleanValue()) {
        }
        return objectComposition;
    }

    public void a(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                break;
            }
            if (iY == 1) {
                int iY2 = buffer.y();
                if (iY2 > 0) {
                    if (this.an == null || Z) {
                        this.aI = new int[iY2];
                        this.an = new int[iY2];
                        for (int i2 = 0; i2 < iY2; i2++) {
                            this.an[i2] = buffer.A();
                            this.aI[i2] = buffer.y();
                        }
                    } else {
                        buffer.h += iY2 * 3;
                    }
                }
            } else if (iY == 2) {
                this.R = buffer.F();
            } else if (iY == 3) {
                this.aq = buffer.H();
            } else if (iY == 5) {
                int iY3 = buffer.y();
                if (iY3 > 0) {
                    if (this.an == null || Z) {
                        this.aI = null;
                        this.an = new int[iY3];
                        for (int i3 = 0; i3 < iY3; i3++) {
                            this.an[i3] = buffer.A();
                        }
                    } else {
                        buffer.h += iY3 * 2;
                    }
                }
            } else if (iY == 14) {
                this.U = buffer.y();
            } else if (iY == 15) {
                this.af = buffer.y();
            } else if (iY == 17) {
                this.aj = false;
                this.ab = false;
            } else if (iY == 18) {
                this.ab = false;
            } else if (iY == 19) {
                this.ar = buffer.y() == 1;
            } else if (iY == 21) {
                this.ag = true;
            } else if (iY == 22) {
                this.al = true;
            } else if (iY == 23) {
                this.ah = true;
            } else if (iY == 24) {
                this.au = buffer.A();
                if (this.au == 65535) {
                    this.au = -1;
                }
            } else if (iY != 27) {
                if (iY == 28) {
                    this.ap = buffer.y();
                } else if (iY == 29) {
                    this.Q = buffer.z();
                } else if (iY == 39) {
                    this.T = buffer.z();
                } else if (iY >= 30 && iY < 39) {
                    if (this.ay == null) {
                        this.ay = new String[5];
                    }
                    this.ay[iY - 30] = buffer.F();
                    if (this.ay[iY - 30].equalsIgnoreCase("hidden")) {
                        this.ay[iY - 30] = null;
                    }
                } else if (iY == 40) {
                    int iY4 = buffer.y();
                    this.ax = new int[iY4];
                    this.W = new int[iY4];
                    for (int i4 = 0; i4 < iY4; i4++) {
                        this.ax[i4] = E == class_119.d ? buffer.B() : buffer.A();
                        this.W[i4] = E == class_119.d ? buffer.B() : buffer.A();
                    }
                } else if (iY == 41) {
                    int iY5 = buffer.y();
                    int[] iArr = new int[iY5];
                    int[] iArr2 = new int[iY5];
                    for (int i5 = 0; i5 < iY5; i5++) {
                        iArr[i5] = buffer.A();
                        iArr2[i5] = buffer.A();
                    }
                } else if (iY == 60) {
                    this.V = buffer.A();
                } else if (iY == 61) {
                    buffer.A();
                } else if (iY == 62) {
                    this.aD = true;
                } else if (iY == 64) {
                    this.as = false;
                } else if (iY == 65) {
                    this.X = buffer.A();
                } else if (iY == 66) {
                    this.am = buffer.A();
                } else if (iY == 67) {
                    this.S = buffer.A();
                } else if (iY == 68) {
                    this.ac = buffer.A();
                } else if (iY == 69) {
                    this.ak = buffer.y();
                } else if (iY == 70) {
                    this.aA = buffer.B();
                } else if (iY == 71) {
                    this.aC = buffer.B();
                } else if (iY == 72) {
                    this.aK = buffer.B();
                } else if (iY == 73) {
                    this.P = true;
                } else if (iY == 74) {
                    this.aG = true;
                } else if (iY == 75) {
                    this.ae = buffer.y();
                } else if (iY == 77 || iY == 92) {
                    this.ao = buffer.A();
                    if (this.ao == 65535) {
                        this.ao = -1;
                    }
                    this.Y = buffer.A();
                    if (this.Y == 65535) {
                        this.Y = -1;
                    }
                    int iA = -1;
                    if (iY == 92) {
                        iA = buffer.A();
                        if (iA == 65535) {
                            iA = -1;
                        }
                    }
                    int iY6 = buffer.y();
                    this.ad = new int[iY6 + 2];
                    for (int i6 = 0; i6 <= iY6; i6++) {
                        this.ad[i6] = buffer.A();
                        if (this.ad[i6] == 65535) {
                            this.ad[i6] = -1;
                        }
                    }
                    this.ad[iY6 + 1] = iA;
                } else if (iY == 78) {
                    buffer.A();
                    buffer.y();
                } else if (iY == 79) {
                    buffer.A();
                    buffer.A();
                    buffer.y();
                    int iY7 = buffer.y();
                    for (int i7 = 0; i7 < iY7; i7++) {
                        buffer.A();
                    }
                } else if (iY == 81) {
                    buffer.y();
                    this.ag = true;
                } else if (iY == 82) {
                    buffer.A();
                } else if (iY == 89) {
                    this.at = false;
                } else if (iY == 249) {
                    int iY8 = buffer.y();
                    HashMap map = new HashMap(iY8);
                    for (int i8 = 0; i8 < iY8; i8++) {
                        boolean z2 = buffer.y() == 1;
                        map.put(Integer.valueOf(buffer.g()), z2 ? buffer.F() : Integer.valueOf(buffer.p()));
                    }
                }
            }
        }
        if (-1 == -1 && this.R != null && !this.R.equals("null")) {
            this.ar = this.an != null && (this.aI == null || this.aI[0] == 10);
            if (this.ay != null) {
                this.ar = true;
            }
        }
        if (this.aG) {
            this.aj = false;
            this.ab = false;
        }
        if (this.ae == -1) {
            this.ae = this.aj ? 1 : 0;
        }
    }

    private void b(Buffer buffer) {
        int iY = -1;
        while (true) {
            int iY2 = buffer.y();
            if (iY2 == 0) {
                break;
            }
            if (iY2 == 1) {
                int iY3 = buffer.y();
                if (iY3 > 0) {
                    if (this.an == null || Z) {
                        this.aI = new int[iY3];
                        this.an = new int[iY3];
                        for (int i2 = 0; i2 < iY3; i2++) {
                            this.an[i2] = buffer.A();
                            this.aI[i2] = buffer.y();
                        }
                    } else {
                        buffer.h += iY3 * 3;
                    }
                }
            } else if (iY2 == 2) {
                this.R = buffer.F();
            } else if (iY2 == 3) {
                this.aq = buffer.H();
            } else if (iY2 == 5) {
                int iY4 = buffer.y();
                if (iY4 > 0) {
                    if (this.an == null || Z) {
                        this.aI = null;
                        this.an = new int[iY4];
                        for (int i3 = 0; i3 < iY4; i3++) {
                            this.an[i3] = buffer.A();
                        }
                    } else {
                        buffer.h += iY4 * 2;
                    }
                }
            } else if (iY2 == 14) {
                this.U = buffer.y();
            } else if (iY2 == 15) {
                this.af = buffer.y();
            } else if (iY2 == 17) {
                this.aj = false;
            } else if (iY2 == 18) {
                this.ab = false;
            } else if (iY2 == 19) {
                iY = buffer.y();
                if (iY == 1) {
                    this.ar = true;
                }
            } else if (iY2 == 21) {
                this.ag = true;
            } else if (iY2 == 22) {
                this.al = true;
            } else if (iY2 == 23) {
                this.ah = true;
            } else if (iY2 == 24) {
                this.au = buffer.A();
                if (this.au == 65535) {
                    this.au = -1;
                }
            } else if (iY2 == 28) {
                this.ap = buffer.y();
            } else if (iY2 == 29) {
                this.Q = buffer.z();
            } else if (iY2 == 39) {
                this.T = buffer.z();
            } else if (iY2 >= 30 && iY2 < 39) {
                if (this.ay == null) {
                    this.ay = new String[5];
                }
                this.ay[iY2 - 30] = buffer.F();
                if (this.ay[iY2 - 30].equalsIgnoreCase("hidden")) {
                    this.ay[iY2 - 30] = null;
                }
            } else if (iY2 == 40) {
                int iY5 = buffer.y();
                this.ax = new int[iY5];
                this.W = new int[iY5];
                for (int i4 = 0; i4 < iY5; i4++) {
                    this.ax[i4] = buffer.A();
                    this.W[i4] = buffer.A();
                }
            } else if (iY2 == 60) {
                this.V = buffer.A();
            } else if (iY2 == 62) {
                this.aD = true;
            } else if (iY2 == 64) {
                this.as = false;
            } else if (iY2 == 65) {
                this.X = buffer.A();
            } else if (iY2 == 66) {
                this.am = buffer.A();
            } else if (iY2 == 67) {
                this.S = buffer.A();
            } else if (iY2 == 68) {
                this.ac = buffer.A();
            } else if (iY2 == 69) {
                this.ak = buffer.y();
            } else if (iY2 == 70) {
                this.aA = buffer.B();
            } else if (iY2 == 71) {
                this.aC = buffer.B();
            } else if (iY2 == 72) {
                this.aK = buffer.B();
            } else if (iY2 == 73) {
                this.P = true;
            } else if (iY2 == 74) {
                this.aG = true;
            } else if (iY2 == 75) {
                this.ae = buffer.y();
            } else if (iY2 == 77) {
                this.ao = buffer.A();
                if (this.ao == 65535) {
                    this.ao = -1;
                }
                this.Y = buffer.A();
                if (this.Y == 65535) {
                    this.Y = -1;
                }
                int iY6 = buffer.y();
                this.ad = new int[iY6 + 1];
                for (int i5 = 0; i5 <= iY6; i5++) {
                    this.ad[i5] = buffer.A();
                    if (this.ad[i5] == 65535) {
                        this.ad[i5] = -1;
                    }
                }
            }
        }
        if (iY == -1) {
            this.ar = this.an != null && (this.aI == null || this.aI[0] == 10);
            if (this.ay != null) {
                this.ar = true;
            }
        }
        if (this.aG) {
            this.aj = false;
            this.ab = false;
        }
        if (this.ae == -1) {
            this.ae = this.aj ? 1 : 0;
        }
    }

    private void c(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                break;
            }
            if (iY == 1) {
                int iY2 = buffer.y();
                if (iY2 > 0) {
                    if (this.an == null || Z) {
                        this.aI = new int[iY2];
                        this.an = new int[iY2];
                        for (int i2 = 0; i2 < iY2; i2++) {
                            this.an[i2] = buffer.A();
                            this.aI[i2] = buffer.y();
                        }
                    } else {
                        buffer.h += iY2 * 3;
                    }
                }
            } else if (iY == 2) {
                this.R = buffer.w();
            } else if (iY == 3) {
                this.aq = buffer.H();
            } else if (iY == 5) {
                int iY3 = buffer.y();
                if (iY3 > 0) {
                    if (this.an == null || Z) {
                        this.aI = null;
                        this.an = new int[iY3];
                        for (int i3 = 0; i3 < iY3; i3++) {
                            this.an[i3] = buffer.A();
                        }
                    } else {
                        buffer.h += iY3 * 2;
                    }
                }
            } else if (iY == 14) {
                this.U = buffer.y();
            } else if (iY == 15) {
                this.af = buffer.y();
            } else if (iY == 17) {
                this.aj = false;
            } else if (iY == 18) {
                this.ab = false;
            } else if (iY == 19) {
                this.ar = buffer.y() == 1;
            } else if (iY == 21) {
                this.ag = true;
            } else if (iY == 22) {
                this.al = true;
            } else if (iY == 23) {
                this.ah = true;
            } else if (iY == 24) {
                this.au = buffer.A();
                if (this.au == 65535) {
                    this.au = -1;
                }
            } else if (iY == 28) {
                this.ap = buffer.y();
            } else if (iY == 29) {
                this.Q = buffer.z();
            } else if (iY == 39) {
                this.T = buffer.z();
            } else if (iY >= 30 && iY < 39) {
                if (this.ay == null) {
                    this.ay = new String[5];
                }
                this.ay[iY - 30] = buffer.w();
                if (this.ay[iY - 30].equalsIgnoreCase("hidden")) {
                    this.ay[iY - 30] = null;
                }
            } else if (iY == 40) {
                int iY4 = buffer.y();
                this.ax = new int[iY4];
                this.W = new int[iY4];
                for (int i4 = 0; i4 < iY4; i4++) {
                    this.ax[i4] = buffer.A();
                    this.W[i4] = buffer.A();
                }
            } else if (iY == 60) {
                this.V = buffer.A();
            } else if (iY == 62) {
                this.aD = true;
            } else if (iY == 64) {
                this.as = false;
            } else if (iY == 65) {
                this.X = buffer.A();
            } else if (iY == 66) {
                this.am = buffer.A();
            } else if (iY == 67) {
                this.S = buffer.A();
            } else if (iY == 68) {
                this.ac = buffer.A();
            } else if (iY == 69) {
                this.ak = buffer.y();
            } else if (iY == 70) {
                this.aA = buffer.B();
            } else if (iY == 71) {
                this.aC = buffer.B();
            } else if (iY == 72) {
                this.aK = buffer.B();
            } else if (iY == 73) {
                this.P = true;
            } else if (iY == 74) {
                this.aG = true;
            } else if (iY == 75) {
                this.ae = buffer.y();
            } else if (iY == 77) {
                this.ao = buffer.A();
                if (this.ao == 65535) {
                    this.ao = -1;
                }
                this.Y = buffer.A();
                if (this.Y == 65535) {
                    this.Y = -1;
                }
                int iY5 = buffer.y();
                this.ad = new int[iY5 + 1];
                for (int i5 = 0; i5 <= iY5; i5++) {
                    this.ad[i5] = buffer.A();
                    if (this.ad[i5] == 65535) {
                        this.ad[i5] = -1;
                    }
                }
            }
        }
        if (-1 == -1 && this.R != "null" && this.R != null) {
            this.ar = this.an != null && (this.aI == null || this.aI[0] == 10);
            if (this.ay != null) {
                this.ar = true;
            }
        }
        if (this.aG) {
            this.aj = false;
            this.ab = false;
        }
        if (this.ae == -1) {
            this.ae = this.aj ? 1 : 0;
        }
    }

    public void a() {
        this.an = null;
        this.aI = null;
        this.R = null;
        this.aq = null;
        this.ax = null;
        this.W = null;
        this.U = 1;
        this.af = 1;
        this.aj = true;
        this.ab = true;
        this.ar = false;
        this.ag = false;
        this.al = false;
        this.ah = false;
        this.au = -1;
        this.ap = 16;
        this.Q = (byte) 0;
        this.T = (byte) 0;
        this.ay = null;
        this.V = -1;
        this.ac = -1;
        this.aD = false;
        this.as = true;
        this.at = true;
        this.X = 128;
        this.am = 128;
        this.S = 128;
        this.ak = 0;
        this.aA = 0;
        this.aC = 0;
        this.aK = 0;
        this.P = false;
        this.aG = false;
        this.ae = -1;
        this.ao = -1;
        this.Y = -1;
        this.ad = null;
    }

    public void a(class_95 class_95Var) {
        if (this.an == null) {
            return;
        }
        for (int i2 = 0; i2 < this.an.length; i2++) {
            try {
                class_83.a(e());
                class_95Var.b(this.an[i2] & 65535, 0);
                class_83.a(false);
            } catch (Throwable th) {
                class_83.a(false);
                throw th;
            }
        }
    }

    public static void b() {
        J = null;
        K = null;
        M = null;
        N = null;
        aF = null;
        aJ = null;
        az = null;
    }

    public static void a(class_663 class_663Var) {
        az = new Buffer(Client.a(class_650.f() + "loc.dat"));
        Buffer buffer = new Buffer(Client.a(class_650.f() + "loc.idx"));
        int iA = buffer.A();
        A = iA;
        aF = new int[iA];
        int iA2 = 2;
        for (int i2 = 0; i2 < iA; i2++) {
            aF[i2] = iA2;
            iA2 += buffer.A();
        }
        aJ = new ObjectComposition[20];
        for (int i3 = 0; i3 < 20; i3++) {
            aJ[i3] = new ObjectComposition();
        }
        if (z == null) {
            z = new class_624();
            z.d();
        }
    }

    public boolean d(int i2) {
        boolean z2;
        class_83.a(e());
        try {
            if (this.aI != null) {
                for (int i3 = 0; i3 < this.aI.length; i3++) {
                    if (this.aI[i3] == i2) {
                        return ColorUtility.f(this.an[i3] & 65535);
                    }
                }
                return true;
            }
            if (this.an == null) {
                return true;
            }
            if (i2 != 10) {
                return true;
            }
            boolean zF = true;
            for (int i4 = 0; i4 < this.an.length; i4++) {
                zF &= ColorUtility.f(this.an[i4] & 65535);
            }
            return zF;
        } finally {
            class_83.a(false);
        }
    }

    public static int a(int i2, int i3) {
        return c(i2).an[i3];
    }

    public ColorUtility a(int i2, int i3, int[][] iArr, int i4, int i5, int i6, boolean z2, int i7) {
        class_83.a(e());
        try {
            ColorUtility colorUtilityA = a(i2, -1, i3, -1);
            class_83.a(false);
            if (colorUtilityA == null) {
                return null;
            }
            if (this.ag || this.al) {
                colorUtilityA = new ColorUtility(this.ag, this.al, colorUtilityA);
            }
            if (colorUtilityA == null) {
                return null;
            }
            if (this.ag) {
                colorUtilityA.a(iArr, i4, i5, i6, z2, i7);
            }
            if (e.a() && ((colorUtilityA.d() || colorUtilityA.Y != null) && colorUtilityA.m == null)) {
                colorUtilityA.f();
            }
            colorUtilityA.L = null;
            return colorUtilityA;
        } catch (Throwable th) {
            class_83.a(false);
            throw th;
        }
    }

    public ColorUtility a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        class_83.a((E == class_119.d && !I) || this.av == 1);
        try {
            ColorUtility colorUtilityA = a(i2, i8, i3, i9);
            class_83.a(false);
            if (colorUtilityA == null) {
                return null;
            }
            if (this.ag || this.al) {
                colorUtilityA = new ColorUtility(this.ag, this.al, colorUtilityA);
            }
            if (colorUtilityA == null) {
                return null;
            }
            if (this.ag) {
                int i10 = (((i4 + i5) + i6) + i7) / 4;
                for (int i11 = 0; i11 < colorUtilityA.ad; i11++) {
                    int i12 = colorUtilityA.ae[i11];
                    int i13 = i4 + (((i5 - i4) * (i12 + 64)) / 128);
                    int i14 = i13 + ((((i7 + (((i6 - i7) * (i12 + 64)) / 128)) - i13) * (colorUtilityA.ag[i11] + 64)) / 128);
                    int[] iArr = colorUtilityA.af;
                    int i15 = i11;
                    iArr[i15] = iArr[i15] + (i14 - i10);
                }
                colorUtilityA.l();
            }
            if (e.a() && ((colorUtilityA.d() || colorUtilityA.Y != null) && colorUtilityA.m == null)) {
                colorUtilityA.f();
            }
            colorUtilityA.L = null;
            return colorUtilityA;
        } catch (Throwable th) {
            class_83.a(false);
            throw th;
        }
    }

    public boolean c() {
        if (this.an == null) {
            return true;
        }
        boolean zF = true;
        class_83.a(e());
        for (int i2 = 0; i2 < this.an.length; i2++) {
            try {
                zF &= ColorUtility.f(this.an[i2] & 65535);
            } catch (Throwable th) {
                class_83.a(false);
                throw th;
            }
        }
        class_83.a(false);
        return zF;
    }

    public ObjectComposition d() {
        int i2 = -1;
        if (this.ao != -1) {
            class_128 class_128Var = class_128.a[this.ao];
            int i3 = class_128Var.b;
            int i4 = class_128Var.c;
            i2 = (ai.dP[i3] >> i4) & Client.fQ[class_128Var.d - i4];
        } else if (this.Y != -1) {
            i2 = ai.dP[this.Y];
        }
        if (((i2 < 0 || i2 >= this.ad.length) ? this.ad[this.ad.length - 1] : this.ad[i2]) != -1) {
            return c(this.ad[i2]);
        }
        return null;
    }

    public ColorUtility a(int i2, int i3, int i4, int i5) {
        long j2;
        ColorUtility colorUtilityE = null;
        if (this.aI != null) {
            int i6 = -1;
            for (int i7 = 0; i7 < this.aI.length; i7++) {
                if (this.aI[i7] == i2) {
                    i6 = i7;
                    break;
                }
            }
            if (i6 == -1) {
                return null;
            }
            j2 = ((long) ((this.aa << 8) + (i6 << 3) + i4)) + (((long) (i3 + 1)) << 32);
            ColorUtility colorUtility = (ColorUtility) (e() ? N : K).a(j2);
            if (colorUtility != null) {
                return colorUtility;
            }
            int i8 = this.an[i6];
            boolean z2 = this.aD ^ (i4 > 3);
            if (z2) {
                i8 += 65536;
            }
            colorUtilityE = (ColorUtility) (e() ? M : J).a(i8);
            if (colorUtilityE == null) {
                class_83.a(e());
                try {
                    colorUtilityE = ColorUtility.e(i8 & 65535);
                    class_83.a(false);
                    if (colorUtilityE == null) {
                        return null;
                    }
                    if (z2) {
                        colorUtilityE.p();
                    }
                    colorUtilityE.L = null;
                    a(colorUtilityE, this.aa, i8 & 65535);
                    (e() ? M : J).a(colorUtilityE, i8);
                } catch (Throwable th) {
                    class_83.a(false);
                    throw th;
                }
            }
        } else {
            if (i2 != 10) {
                return null;
            }
            j2 = ((long) ((this.aa << 6) + i4)) + (((long) (i3 + 1)) << 32);
            ColorUtility colorUtility2 = (ColorUtility) (e() ? N : K).a(j2);
            if (colorUtility2 != null) {
                return colorUtility2;
            }
            if (this.an == null) {
                return null;
            }
            boolean z3 = this.aD ^ (i4 > 3);
            int length = this.an.length;
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = this.an[i9];
                if (z3) {
                    i10 += 65536;
                }
                colorUtilityE = (ColorUtility) (e() ? M : J).a(i10);
                if (colorUtilityE == null) {
                    class_83.a(e());
                    try {
                        colorUtilityE = ColorUtility.e(i10 & 65535);
                        class_83.a(false);
                        if (colorUtilityE == null) {
                            return null;
                        }
                        if (z3) {
                            colorUtilityE.p();
                        }
                        a(colorUtilityE, this.aa, i10 & 65535);
                        colorUtilityE.L = null;
                        (e() ? M : J).a(colorUtilityE, i10);
                    } catch (Throwable th2) {
                        class_83.a(false);
                        throw th2;
                    }
                }
                if (length > 1) {
                    aB[i9] = colorUtilityE;
                }
            }
            if (length > 1) {
                colorUtilityE = new ColorUtility(length, aB);
            }
        }
        boolean z4 = (this.X == 128 && this.am == 128 && this.S == 128) ? false : true;
        boolean z5 = (this.aA == 0 && this.aC == 0 && this.aK == 0) ? false : true;
        class_49 class_49Var = ColorUtility.h;
        boolean z6 = false;
        if (i3 != -1 && class_176.b(i3, i5)) {
            z6 = true;
        }
        ColorUtility colorUtility3 = new ColorUtility(this.ax == null, class_176.g(i3), i4 == 0 && i3 == -1 && !z4 && !z5, colorUtilityE, class_49Var);
        colorUtility3.i = class_49Var;
        colorUtility3.L = null;
        colorUtility3.z = true;
        if (i3 != -1 && (this.R != null || e())) {
            if (class_99.a[i5].b()) {
                colorUtility3 = class_99.a[i5].a(colorUtility3, i3);
            } else {
                colorUtility3.n();
                if (colorUtility3.aL == null) {
                    z6 = false;
                }
                colorUtility3.f(i3, i5);
            }
            colorUtility3.aM = null;
            colorUtility3.aL = null;
        }
        while (true) {
            int i11 = i4;
            i4--;
            if (i11 <= 0) {
                break;
            }
            colorUtility3.o();
        }
        if (this.ax != null) {
            for (int i12 = 0; i12 < this.ax.length; i12++) {
                colorUtility3.i(this.ax[i12], this.W[i12]);
            }
        }
        if (z4) {
            colorUtility3.b(this.X, this.S, this.am);
        }
        if (z5) {
            colorUtility3.a(this.aA, this.aC, this.aK);
        }
        if (this.aa == 9075 || this.aa == 24500) {
            colorUtility3.b(84, 1000, -90, -580, -90, !this.al);
        } else {
            colorUtility3.b(64 + this.Q, 768 + (this.T * 5), -50, -10, -50, !this.al);
        }
        if (this.ae == 1) {
            colorUtility3.aH = colorUtility3.g;
        }
        if (!z6) {
            (e() ? N : K).a(colorUtility3, j2);
        }
        return colorUtility3;
    }

    private void d(Buffer buffer) {
        int iY = -1;
        while (true) {
            int iY2 = buffer.y();
            if (iY2 == 0) {
                break;
            }
            if (iY2 == 1) {
                int iY3 = buffer.y();
                if (iY3 > 0) {
                    if (this.an == null || Z) {
                        this.aI = new int[iY3];
                        this.an = new int[iY3];
                        for (int i2 = 0; i2 < iY3; i2++) {
                            this.an[i2] = buffer.A();
                            this.aI[i2] = buffer.y();
                        }
                    } else {
                        buffer.h += iY3 * 3;
                    }
                }
            } else if (iY2 == 2) {
                this.R = buffer.F();
            } else if (iY2 == 3) {
                this.aq = buffer.H();
            } else if (iY2 == 5) {
                int iY4 = buffer.y();
                if (iY4 > 0 && (this.an == null || Z)) {
                    this.aI = null;
                    this.an = new int[iY4];
                    for (int i3 = 0; i3 < iY4; i3++) {
                        this.an[i3] = buffer.A();
                    }
                }
            } else if (iY2 == 14) {
                this.U = buffer.y();
            } else if (iY2 == 15) {
                this.af = buffer.y();
            } else if (iY2 == 17) {
                this.aj = false;
            } else if (iY2 == 18) {
                this.ab = false;
            } else if (iY2 == 19) {
                iY = buffer.y();
                if (iY == 1 && this.R != null) {
                    this.ar = true;
                }
            } else if (iY2 == 21) {
                this.ag = true;
            } else if (iY2 == 22) {
                this.al = true;
            } else if (iY2 == 23) {
                this.ah = true;
            } else if (iY2 == 24) {
                this.au = buffer.A();
                if (this.au == 65535) {
                    this.au = -1;
                }
            } else if (iY2 == 28) {
                this.ap = buffer.y();
            } else if (iY2 == 29) {
                this.Q = buffer.z();
            } else if (iY2 == 39) {
                this.T = buffer.z();
            } else if (iY2 >= 30 && iY2 < 39) {
                if (this.ay == null) {
                    this.ay = new String[10];
                }
                this.ay[iY2 - 30] = buffer.F();
                if (this.ay[iY2 - 30].equalsIgnoreCase("hidden")) {
                    this.ay[iY2 - 30] = null;
                }
            } else if (iY2 == 40) {
                int iY5 = buffer.y();
                this.ax = new int[iY5];
                this.W = new int[iY5];
                for (int i4 = 0; i4 < iY5; i4++) {
                    this.ax[i4] = buffer.A();
                    this.W[i4] = buffer.A();
                }
            } else if (iY2 == 60) {
                this.V = buffer.A();
            } else if (iY2 == 62) {
                this.aD = true;
            } else if (iY2 == 64) {
                this.as = false;
            } else if (iY2 == 65) {
                this.X = buffer.A();
            } else if (iY2 == 66) {
                this.am = buffer.A();
            } else if (iY2 == 67) {
                this.S = buffer.A();
            } else if (iY2 == 68) {
                this.ac = buffer.A();
            } else if (iY2 == 69) {
                this.ak = buffer.y();
            } else if (iY2 == 70) {
                this.aA = buffer.B();
            } else if (iY2 == 71) {
                this.aC = buffer.B();
            } else if (iY2 == 72) {
                this.aK = buffer.B();
            } else if (iY2 == 73) {
                this.P = true;
            } else if (iY2 == 74) {
                this.aG = true;
            } else if (iY2 == 75) {
                this.ae = buffer.y();
            } else if (iY2 == 77) {
                this.ao = buffer.A();
                if (this.ao == 65535) {
                    this.ao = -1;
                }
                this.Y = buffer.A();
                if (this.Y == 65535) {
                    this.Y = -1;
                }
                int iY6 = buffer.y();
                this.ad = new int[iY6 + 1];
                for (int i5 = 0; i5 <= iY6; i5++) {
                    this.ad[i5] = buffer.A();
                    if (this.ad[i5] == 65535) {
                        this.ad[i5] = -1;
                    }
                }
            }
        }
        if (iY == -1) {
            this.ar = this.an != null && (this.aI == null || this.aI[0] == 10);
            if (this.ay != null) {
                this.ar = true;
            }
        }
        if (this.aG) {
            this.aj = false;
            this.ab = false;
        }
        if (this.ae == -1) {
            this.ae = this.aj ? 1 : 0;
        }
    }

    private ObjectComposition() {
        this.aa = -1;
    }

    public void a(ObjectComposition objectComposition) {
        this.P = objectComposition.P;
        this.Q = objectComposition.Q;
        this.aA = objectComposition.aA;
        this.R = objectComposition.R;
        this.S = objectComposition.S;
        this.T = objectComposition.T;
        this.U = objectComposition.U;
        this.aC = objectComposition.aC;
        this.V = objectComposition.V;
        this.W = objectComposition.W;
        this.X = objectComposition.X;
        this.Y = objectComposition.Y;
        this.aD = objectComposition.aD;
        this.ab = objectComposition.ab;
        this.ac = objectComposition.ac;
        this.ad = objectComposition.ad;
        this.ae = objectComposition.ae;
        this.af = objectComposition.af;
        this.ag = objectComposition.ag;
        this.ah = objectComposition.ah;
        this.aG = objectComposition.aG;
        this.aj = objectComposition.aj;
        this.ak = objectComposition.ak;
        this.al = objectComposition.al;
        this.am = objectComposition.am;
        this.an = objectComposition.an;
        this.ao = objectComposition.ao;
        this.ap = objectComposition.ap;
        this.aI = objectComposition.aI;
        this.aq = objectComposition.aq;
        this.ar = objectComposition.ar;
        this.as = objectComposition.as;
        this.at = objectComposition.at;
        this.au = objectComposition.au;
        this.aK = objectComposition.aK;
        this.ax = objectComposition.ax;
        this.ay = objectComposition.ay;
    }

    public ObjectComposition(ObjectComposition objectComposition) {
        this.P = objectComposition.P;
        this.Q = objectComposition.Q;
        this.aA = objectComposition.aA;
        this.R = objectComposition.R;
        this.S = objectComposition.S;
        this.T = objectComposition.T;
        this.U = objectComposition.U;
        this.aC = objectComposition.aC;
        this.V = objectComposition.V;
        this.W = objectComposition.W;
        this.X = objectComposition.X;
        this.Y = objectComposition.Y;
        this.aD = objectComposition.aD;
        this.aa = objectComposition.aa;
        this.ab = objectComposition.ab;
        this.ac = objectComposition.ac;
        this.ad = objectComposition.ad;
        this.ae = objectComposition.ae;
        this.af = objectComposition.af;
        this.ag = objectComposition.ag;
        this.ah = objectComposition.ah;
        this.aG = objectComposition.aG;
        this.aj = objectComposition.aj;
        this.ak = objectComposition.ak;
        this.al = objectComposition.al;
        this.am = objectComposition.am;
        this.an = objectComposition.an;
        this.ao = objectComposition.ao;
        this.ap = objectComposition.ap;
        this.aI = objectComposition.aI;
        this.aq = objectComposition.aq;
        this.ar = objectComposition.ar;
        this.as = objectComposition.as;
        this.at = objectComposition.at;
        this.au = objectComposition.au;
        this.aK = objectComposition.aK;
        this.ax = objectComposition.ax;
        this.ay = objectComposition.ay;
    }

    public boolean e() {
        if (this.aw && this.av != 1) {
            return false;
        }
        if (this.aw && this.av == 1) {
            return true;
        }
        return !I && E == class_119.d;
    }
}
