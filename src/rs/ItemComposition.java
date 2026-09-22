package rs;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.aq;
import gnu.trove.f.b.cc;
import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import org.lwjgl.opencl.AMDDeviceAttributeQuery;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL12;
import org.lwjgl.opencl.EXTDeviceFission;
import org.lwjgl.opencl.INTELVAAPIMediaSharing;
import org.lwjgl.opencl.KHRCommandBuffer;
import org.lwjgl.opencl.QCOMEXTHostPtr;
import org.lwjgl.opengl.AMDPinnedMemory;
import org.lwjgl.opengl.ARBVertexProgram;
import org.lwjgl.opengl.CGL;
import org.lwjgl.opengl.EXTPackedFloat;
import org.lwjgl.opengl.EXTTextureCompressionLATC;
import org.lwjgl.opengl.EXTTextureInteger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.NVCopyDepthToColor;
import org.lwjgl.opengl.NVMemoryAttachment;
import org.lwjgl.opengl.NVMeshShader;
import org.lwjgl.opengl.NVTransformFeedback;
import org.lwjgl.opengl.S3S3TC;
import org.lwjgl.opengl.WGLEXTColorspace;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;
import rs.lpkg.e;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/ItemComposition.class */
public final class ItemComposition {
    public static class_622 b;
    public int f;
    public int[] g;
    public int[] h;
    public int itemId;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String[] u;
    public int v;
    public String itemName;
    public String x;
    public static ItemComposition[] y;
    public int z;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public byte[] description;
    public int F;
    private static int aB;
    public int G;
    private static Buffer aC;
    private static Buffer aD;
    private static Buffer aE;
    public int I;
    public int J;
    public int K;
    public String[] inventoryActions;
    public int M;
    public int N;
    public int O;
    public int[] P;
    public int[][][] Q;
    public int R;
    public int[] S;
    public int[] T;
    public boolean U;
    public boolean V;
    public int W;
    private static int[] aF;
    public int X;
    public int Y;
    public int Z;
    public int aa;
    public int[] ab;
    public int ac;
    public static int ad;
    public int ae;
    public byte af;
    public byte ag;
    public byte ah;
    public byte ai;
    public byte aj;
    public byte ak;
    public byte al;
    public byte am;
    public byte an;
    public byte ao;
    public byte ap;
    public byte aq;
    public boolean ar;
    public int as;
    public int at;
    public int au;
    public int av;
    public class_59 aw;
    public boolean ax;
    public static int a = 30000;
    public static cc<ItemComposition> c = new cc<>(a + 1, 1.0f);
    public static String d = "Dwarf remains";
    private static long[][][] ay = {new long[][]{new long[]{19042, 0, 0}, new long[]{1038, 1040, 1042, 1044, 1046, 1048}}, new long[][]{new long[]{19043, 0, 0}, new long[]{1053, 1055, 1057}}, new long[][]{new long[]{20699, 0, 0}, new long[]{20542, 20543, 20544, 20545, 20546}}, new long[][]{new long[]{21096, 0, 0}, new long[]{20539, 20540, 20541}}};
    public static long e = 0;
    private static String[] az = {null, null, "Take", null, null};
    private static String[][] aA = {new String[]{null, "Wear", null, null, "Drop"}, new String[]{null, "Wield", null, null, "Drop"}, new String[]{null, null, null, null, "Drop"}, new String[]{null, "Wear", null, null, "Destroy"}, new String[]{null, "Wield", null, null, "Destroy"}, new String[]{null, null, null, null, "Destroy"}};
    public static class_30 j = new class_30(1000);
    public static class_30 k = new class_30(100);
    public static class_30 l = new class_30(50);
    public static class_30 m = new class_30(50);
    public static boolean H = true;

    public static boolean a(ItemComposition itemComposition, int i) {
        if (i == 22146 || i == 22147) {
            Launcher.n().o().a(60, 20L);
            Launcher.n().o().a(61, 20L);
            return true;
        }
        if (i == 24043 || i == 24237) {
            Launcher.n().o().a(58, 20L);
            Launcher.n().o().a(62, 20L);
            return true;
        }
        if ((i >= 23941 && i <= 23944) || i == 23955) {
            Launcher.n().o().a(261, 20L);
            return true;
        }
        if (i == 22273 || i == 22274 || i == 22276) {
            Launcher.n().o().a(105, 20L);
            return true;
        }
        if (i == 22282) {
            Launcher.n().o().a(56, 20L);
            return true;
        }
        if (i == 22260 || i == 22261 || i == 28789) {
            Launcher.n().o().a(61, 20L);
            Launcher.n().o().a(60, 20L);
            Launcher.n().o().a(70, 20L);
            Launcher.n().o().a(55, 20L);
            Launcher.n().o().a(68, 20L);
            Launcher.n().o().a(337, 20L);
            Launcher.n().o().a(261, 20L);
            return true;
        }
        if (i <= 0 || itemComposition == null || !itemComposition.U) {
            return false;
        }
        if (itemComposition.R > 0) {
            Launcher.n().o().a(itemComposition.R, 20L);
            return true;
        }
        if (itemComposition.T != null && itemComposition.T.length > 0) {
            for (int i2 : itemComposition.T) {
                Launcher.n().o().a(i2, 20L);
            }
            return true;
        }
        if (itemComposition.aw == null || !itemComposition.aw.c()) {
            return false;
        }
        for (int i3 : itemComposition.aw.g().a()) {
            Launcher.n().o().a(i3, 20L);
        }
        return true;
    }

    public static boolean a(ColorUtility colorUtility, int i) {
        try {
            return setItemDefaultValues(null, colorUtility, i);
        } catch (Exception e2) {
            return false;
        }
    }

    public static boolean a(ItemComposition itemComposition, ColorUtility colorUtility, int i) {
        if (i != 28789) {
            return false;
        }
        if (Configuration.n == class_152.f || Configuration.n == class_152.e) {
            a(colorUtility, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{56, 56, 56, 56, 72, 56});
            return true;
        }
        if (Configuration.n == class_152.d) {
            a(colorUtility, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{60, 60, 60, 60, 68, 60});
            return true;
        }
        if (Configuration.n == class_152.b) {
            a(colorUtility, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{179, 179, 179, 179, 56, 179});
            return true;
        }
        a(colorUtility, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{337, 261, 337, 337, 261, 337});
        return true;
    }

    public static boolean recolorItem(ItemComposition itemComposition, ColorUtility colorUtility, int i) {
        if (!Configuration.M) {
            return false;
        }
        if (colorUtility == null) {
            return true;
        }
        switch (i) {
            case 21661:
                a(colorUtility, new int[]{37, 49, 41, 57, 33, 16, 156, 142, 20}, new int[]{62, 61, 62, 62, 62, 62, 61, 62, 61});
                return true;
            case 21662:
                a(colorUtility, new int[]{43150, 43034, 43047, 43059, 43030, 43090, 43113}, new int[]{61, 60, 60, 60, 60, 61, 61});
                return true;
            case 21664:
                a(colorUtility, 43117, 62);
                return true;
            case 21767:
                a(colorUtility, new int[]{38350, 37295, 40094}, new int[]{62, 62, 62});
                return true;
            case 21809:
            case 21810:
            case 21811:
                int[] iArr = {54546, 105, 24};
                int[] iArr2 = new int[3];
                iArr2[0] = i == 21811 ? 102 : 118;
                iArr2[1] = 118;
                iArr2[2] = 72;
                a(colorUtility, iArr, iArr2);
                return true;
            case 21812:
            case 21813:
            case 21814:
                a(colorUtility, new int[]{54546, 105, 24}, new int[]{118, 102, 62});
                return true;
            case 21815:
            case 21816:
            case 21817:
                int[] iArr3 = {54546, 105, 24};
                int[] iArr4 = new int[3];
                iArr4[0] = i == 21817 ? 102 : 118;
                iArr4[1] = 118;
                iArr4[2] = 58;
                a(colorUtility, iArr3, iArr4);
                return true;
            case 21818:
                a(colorUtility, new int[]{11144}, new int[]{56});
                return true;
            case 21819:
                a(colorUtility, new int[]{41, 16, 8, 24, 33, 13223, 14236}, new int[]{56, 72, 72, 101, 56, 81, 81});
                return true;
            case 21872:
                if (colorUtility != null) {
                    colorUtility.a(3008, new int[]{3010, aU.vE, aU.vF, aU.vG, aU.vH});
                }
                a(colorUtility, new int[]{43164, aU.yn, 43061, 43053, 43026, 3010, aU.vE, aU.vF, aU.vG, aU.vH}, new int[]{60, 89, 58, 89, 58, 58, 91, 91, 58, 91});
                return true;
            case 21873:
                if (colorUtility != null) {
                    colorUtility.a(aU.xC, new int[]{100, 100, 127, 127, 100});
                }
                a(colorUtility, new int[]{11177, 61, 10351, 127, 100}, new int[]{60, 60, 60, 80, 80});
                return true;
            case 21956:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(new int[]{25, 24});
                colorUtility.b(new int[]{25, 24}, new int[]{55, 72});
                return true;
            case 22001:
                a(colorUtility, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 109, 109, 109, 109, 60, 109});
                return true;
            case 22002:
                a(colorUtility, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 62, 62, 62, 62, 60, 62});
                return true;
            case 22029:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(new int[]{25, 24});
                colorUtility.b(new int[]{25, 24}, new int[]{60, 62});
                return true;
            case 22030:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(new int[]{25, 24});
                colorUtility.b(new int[]{25, 24}, new int[]{81, 109});
                return true;
            case 22068:
                if (colorUtility != null) {
                    colorUtility.g(70, -1);
                }
                a(colorUtility, new int[]{9779, 9803, 9772, 9797, 9786, 9806, 9781, 9764, 9793, 9810, 9789, 9799, 9778, 9773, 9792, 9808, 9828, 9827, 9756, 9782, 9790}, new int[]{109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109});
                return true;
            case 22069:
                if (colorUtility != null) {
                    colorUtility.g(70, -1);
                }
                a(colorUtility, new int[]{21779, 21777, 21775, 21787, 21797}, new int[]{109, 109, 109, 109, 109});
                return true;
            case 22072:
            case 22075:
                if (colorUtility != null) {
                    colorUtility.a(new int[]{302770, 302770, 302770, 306770, 306770, 296770});
                }
                if (i != 22075) {
                    return true;
                }
                a(colorUtility, new int[]{296770, 306770, 302770}, new int[]{72, 72, 79});
                return true;
            case 22073:
                a(colorUtility, new int[]{2983, 914, 6082, 23492, 23483, 4013, 4011, 8150, 4013, 2733, 4011, 2880, 28, 10167, 1946, 2983, 914, 4013, 2733, 4011, 2880, 28, 29867, 6084}, new int[]{60, 109, 109, 109, 109, 109, 109, 60, 109, 109, 109, 60, 109, 109, 109, 109, 109, 60, 109, 109, 109, 109, 109, 109});
                return true;
            case 22074:
                a(colorUtility, new int[]{43150, 43034, 37, 33}, new int[]{62, 62, 62, 62});
                return true;
            case 22083:
            case 22084:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(61962, new int[]{52122});
                colorUtility.a(61718, new int[]{52106});
                colorUtility.b(new int[]{18215, 18200, 18229, 18118, 18000, 16, 18, 39, 35, 28}, new int[]{60, 60, 107, 107, 60, 60, 108, 60, 102, 102});
                return true;
            case 22094:
            case 22095:
                a(colorUtility, new int[]{22424}, new int[]{71});
                return true;
            case 22096:
            case 22097:
                a(colorUtility, new int[]{50062, 48035, 8, 41, 34, 24, 31, 18, 50078}, new int[]{71, 71, 71, 71, 71, 71, 71, 71, 71});
                return true;
            case 22098:
                a(colorUtility, new int[]{7748, 7892, 7739, 7752, 7888, 7756}, new int[]{71, 71, 54, 54, 54, 54});
                return true;
            case 22128:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(new int[]{44938, 44948});
                return true;
            case 22129:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(new int[]{25, 24});
                colorUtility.b(new int[]{25, 24}, new int[]{60, 54});
                return true;
            case 22157:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(90, new int[]{95, 70, 95, 70, 95});
                colorUtility.a(10304, new int[]{95, 70, 95, 70, 95});
                colorUtility.b(new int[]{70, 95, 10291, 10304}, new int[]{62, 60, 62, 60});
                return true;
            case 22158:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{61, 57, 53, 49, 41, 37, 33, 28, 7208, 7233, 7231, 7213, 7221, 7226, 7228, 7223}, new int[]{62, 60, 62, 60, 60, 60, 60, 60, 62, 60, 60, 60, 61, 60, 62, 60});
                return true;
            case 22159:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{7114, aU.vL, 7112, 2756, 9166}, new int[]{62, 62, 60, 60, 60});
                return true;
            case 22160:
                a(colorUtility, new int[]{5219, 910, 1938, 1690, 912, 962, 8, 78, 910, 912}, 60);
                return true;
            case 22161:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{32850, 8410, 8660, 8404, GL11.GL_LUMINANCE16, 10318, 7607, aU.GZ, aU.GR, 7624, 10326, 10334, 8412, 32786, aU.iN_, 10339, 280}, new int[]{62, 62, 60, 60, 60, 62, 62, 60, 60, 60, 62, 62, 60, 60, 60, 60, 60});
                return true;
            case 23945:
                colorUtility.b(new int[]{110343, 15413, 15421, 15405, 16433, g.r, 0, 908, 907, 904, 903, User32.WM_PENWINLAST, 915, 899, 31420, AMDDeviceAttributeQuery.CL_DEVICE_GLOBAL_FREE_MEMORY_AMD, 16656}, new int[]{261, 261, 60, 68, 60, 60, 68, 60, 80, 60, 80, 60, 60, 68, 70, 261, 261});
                colorUtility.h(5, User32.WM_UNICHAR);
                colorUtility.g(35, -1);
                return true;
            case 24016:
                colorUtility.a(new int[]{1, 1, 1, 1, 1, 2});
                colorUtility.b(new int[]{1, 2}, new int[]{60, 66});
                return true;
            case 24017:
                colorUtility.a(new int[]{1, 1, 2});
                colorUtility.b(new int[]{1, 2}, new int[]{69, 57});
                return true;
            case 24018:
                colorUtility.a(new int[]{1, 1, 2});
                colorUtility.b(new int[]{1, 2}, new int[]{63, 72});
                return true;
            case 24019:
                colorUtility.a(new int[]{1, 1, 1, 1, 2});
                colorUtility.b(new int[]{1, 2}, new int[]{140, 76});
                return true;
            case 24020:
            case 24021:
            case 24022:
                colorUtility.b(new int[]{0, 45, 28, 16, 37, 410, g.c, 5400, GL11.GL_INDEX_SHIFT, 268, 398, 4550, 278}, new int[]{140, 221, 221, 140, 221, 221, 221, 140, 221, 221, 221, 221, 140});
                return true;
            case 24050:
                colorUtility.a(new int[]{43119}, new int[]{374770});
                colorUtility.a(new int[]{43123}, new int[]{15});
                colorUtility.a(new int[]{43183, 43105, 7322, 33595, 33604, NVCopyDepthToColor.GL_DEPTH_STENCIL_TO_BGRA_NV, 43059, 43063}, new int[]{1});
                colorUtility.a(new int[]{38119, 37099, EXTTextureCompressionLATC.GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT, 35949}, new int[]{2});
                colorUtility.b(new int[]{1, 2}, new int[]{120, 277});
                return true;
            case 24145:
                colorUtility.b(new int[]{5524, 5400, 5404, 4013, aU.xy, 4009, 3889, 5648, GL11.GL_NORMALIZE, 4783, 4665, 4903, 43086, 43094, 4669, 4674, aU.xm, 5840, 5832, 4653, aU.vU, 3881, 3757, 3761, aU.vQ, aU.vS, 4785, 4779, 3982, 4657, aU.Bz, aU.Bv, aU.Br, 3885, 4649, aU.BE, 4661, 4781, KHRCommandBuffer.CL_DEVICE_COMMAND_BUFFER_CAPABILITIES_KHR, 3765}, new int[]{180, 180, 180, 180, aU.hu_, 180, aU.hu_, 60, 60, aU.hu_, 60, aU.hu_, 180, aU.hu_, 180, aU.hu_, 180, 60, 180, aU.hu_, aU.hu_, 60, 60, 180, aU.hu_, 180, aU.hu_, 180, aU.hu_, aU.hu_, aU.hu_, aU.hu_, aU.hu_, 60, aU.hu_, 60, 81, 60, 60, 60});
                colorUtility.h(5);
                return false;
            case 24170:
                colorUtility.a(new int[]{20288, 0, 6466, -17221, 5318, 5202, 5330, 5210, 6241, User32.WM_ENTERIDLE, 6439, 6445, aU.nL, 1139, 6453, 5305, -15164, 5309}, new int[]{1});
                colorUtility.a(new int[]{1226, 204, -18381, -15193, 214, -15202, -4004, 6245, aU.nD, User32.WM_UNINITMENUPOPUP, 6443, 6447, 6451}, new int[]{2});
                colorUtility.a(new int[]{-15185, 6449, -15189, 277, 6435, 6261, -4024, 6455, aU.lE, CGL.kCGLCEMPEngine, 6457, -15168}, new int[]{5});
                colorUtility.b(new int[]{1, 2}, new int[]{208, 277});
                return false;
            case 24210:
                colorUtility.a(61718, new int[]{17});
                colorUtility.a(new int[]{43086, 43076}, new int[]{20, 20});
                colorUtility.a(new int[]{38036, 38044}, new int[]{35, 35});
                colorUtility.a(new int[]{62748, 58642, 38049}, new int[]{25, 25, 25});
                a(colorUtility, new int[]{35, 20}, new int[]{User32.WM_INITMENUPOPUP, User32.WM_INITMENUPOPUP});
                return true;
            case 24211:
                colorUtility.a(61718, new int[]{17});
                colorUtility.a(new int[]{43086, 43076}, new int[]{20, 20});
                colorUtility.a(new int[]{38036, 38044}, new int[]{35, 35});
                colorUtility.a(new int[]{62748, 58642, 38049}, new int[]{25, 25, 25});
                a(colorUtility, new int[]{35, 20}, new int[]{180, 180});
                return true;
            case 24238:
                colorUtility.a(new int[]{898}, new int[]{0});
                colorUtility.b(new int[]{156, 278, GL11.GL_MAP2_TEXTURE_COORD_3, 6323, 7500, 8410, 3621, 3501, 167, 972, 2576, 2368, 38119, 163, 6323, 8410, 2368, 3621}, new int[]{339, 339, User32.WM_SYSCHAR, 339, 339, 339, User32.WM_SYSCHAR, User32.WM_SYSCHAR, User32.WM_SYSCHAR, User32.WM_SYSCHAR, User32.WM_SYSCHAR, 339, User32.WM_SYSCHAR, User32.WM_SYSCHAR, 339, 339, 339, 339});
                return false;
            case 25405:
                colorUtility.a(61718, new int[]{491752});
                colorUtility.a(new int[]{43086, 43076}, new int[]{491765, 491765});
                colorUtility.a(new int[]{38036, 38044}, new int[]{359770, 359770});
                colorUtility.a(new int[]{62748, 58642, 38049}, new int[]{491770, 491770, 491770});
                return true;
            case 25415:
                colorUtility.a(43063, new int[]{5});
                colorUtility.a(8404, new int[]{15});
                colorUtility.a(43084, new int[]{15});
                colorUtility.a(7378, new int[]{15});
                colorUtility.a(43072, new int[]{5});
                colorUtility.a(43224, new int[]{5});
                colorUtility.a(49, new int[]{25});
                colorUtility.a(57, new int[]{25});
                colorUtility.a(aU.Hb, new int[]{15});
                colorUtility.a(43080, new int[]{5});
                colorUtility.a(66, new int[]{15});
                colorUtility.a(7362, new int[]{15});
                colorUtility.a(8377, new int[]{15});
                colorUtility.b(new int[]{8286, aU.GT, 25, 15, 5}, new int[]{91, 91, 91, 61, 62});
                colorUtility.g(0, -1);
                colorUtility.g(950);
                colorUtility.a(950, new int[]{926, 936, 946});
                return true;
            case 25425:
                colorUtility.a(43063, new int[]{5});
                colorUtility.a(8404, new int[]{15});
                colorUtility.a(43084, new int[]{15});
                colorUtility.a(7378, new int[]{15});
                colorUtility.a(43072, new int[]{5});
                colorUtility.a(43224, new int[]{5});
                colorUtility.a(49, new int[]{25});
                colorUtility.a(57, new int[]{25});
                colorUtility.a(aU.Hb, new int[]{15});
                colorUtility.a(43080, new int[]{5});
                colorUtility.a(66, new int[]{15});
                colorUtility.a(7362, new int[]{15});
                colorUtility.a(8377, new int[]{15});
                colorUtility.b(new int[]{8286, 15, 25, 15, 5}, new int[]{91, 61, 61, 60, 60});
                colorUtility.g(10);
                return true;
            default:
                return false;
        }
    }

    public static boolean setItemDefaultValues(ItemComposition itemComposition, ColorUtility colorUtility, int i) {
        if (colorUtility == null) {
            return true;
        }
        if (itemComposition != null) {
            if (itemComposition.R != 0) {
                b(colorUtility, itemComposition.R);
                return true;
            }
            if (itemComposition.S != null && itemComposition.S.length > 0) {
                if (itemComposition.S.length != itemComposition.T.length) {
                    return false;
                }
                a(colorUtility, itemComposition.S, itemComposition.T);
            }
        }
        if (recolorItem(itemComposition, colorUtility, i) || a(itemComposition, colorUtility, i)) {
            return true;
        }
        switch (i) {
            case 1481:
                b(colorUtility, 55);
                return true;
            case 1482:
                b(colorUtility, 53);
                return true;
            case 1483:
                b(colorUtility, 61);
                return true;
            case 1484:
                b(colorUtility, 60);
                return true;
            case aU.Ak /* 6200 */:
                a(colorUtility, new int[]{22410}, new int[]{54});
                return true;
            case 6202:
                a(colorUtility, new int[]{G.fb}, new int[]{60});
                return true;
            case 6203:
                a(colorUtility, new int[]{G.fb}, new int[]{61});
                return true;
            case 10506:
            case 22807:
                colorUtility.a(new int[]{50, 55, 60});
                return true;
            case 10524:
                a(colorUtility, new int[]{7587}, new int[]{54});
                return true;
            case 10954:
                a(colorUtility, new int[]{aU.KR, 8720}, new int[]{29, 29});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(7566, new int[]{15252});
                colorUtility.a(7690, new int[]{15260});
                colorUtility.a(7446, new int[]{aU.Vj});
                colorUtility.a(8720, new int[]{15260});
                colorUtility.a(aU.KR, new int[]{15209});
                colorUtility.a(7326, new int[]{15252});
                return true;
            case 10956:
                a(colorUtility, new int[]{7566, 8070}, new int[]{29, 29});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(7566, new int[]{15252});
                colorUtility.a(7690, new int[]{15260});
                colorUtility.a(7446, new int[]{aU.Vj});
                colorUtility.a(8720, new int[]{15260});
                colorUtility.a(aU.KR, new int[]{15209});
                colorUtility.a(7326, new int[]{15252});
                return true;
            case 10958:
                if (colorUtility != null) {
                    colorUtility.a(6674, new int[]{15252, CGL.kCGLBadDrawable, 15252, CGL.kCGLBadDrawable, 15252});
                }
                a(colorUtility, new int[]{CGL.kCGLBadDrawable}, new int[]{29});
                return true;
            case 11674:
            case 11676:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(12, new int[]{6});
                colorUtility.a(aU.Dn, new int[]{18});
                colorUtility.a(90, new int[]{12});
                colorUtility.a(85, new int[]{6});
                colorUtility.a(78, new int[]{4});
                colorUtility.a(74, new int[]{4});
                colorUtility.a(61, new int[]{4});
                colorUtility.a(53, new int[]{4});
                colorUtility.a(45, new int[]{4});
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 70}, new int[]{62, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62});
                return true;
            case 11675:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(12, new int[]{6});
                colorUtility.a(90, new int[]{6});
                colorUtility.a(85, new int[]{6});
                colorUtility.a(70, new int[]{4});
                colorUtility.a(61, new int[]{4});
                colorUtility.a(53, new int[]{4});
                colorUtility.a(45, new int[]{4});
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 74, aU.Dn, 88, 78}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 62});
                return true;
            case 13999:
                a(colorUtility, new int[]{22410}, new int[]{55});
                return true;
            case 14486:
            case 14487:
            case 22041:
            case 22042:
            case 22043:
            case 22044:
            case 22045:
            case 22046:
            case 22047:
            case 22048:
            case 22049:
            case 22050:
            case 22051:
            case 22052:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(30, -1);
                return true;
            case 14523:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER}, new int[]{54, 54});
                return true;
            case aU.Uf /* 15005 */:
                a(colorUtility, new int[]{9643, 9763, 8406, 8070, 9647, 9878}, 54);
                return true;
            case 16000:
                colorUtility.b(new int[]{22464}, new int[]{34});
                return true;
            case 16001:
                a(colorUtility, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, GL11.GL_ALPHA16, GL11.GL_LUMINANCE12_ALPHA12, 22464}, new int[]{52, 52, 52, 52, 52, 52, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34});
                return true;
            case 16002:
                a(colorUtility, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, GL11.GL_ALPHA16, GL11.GL_LUMINANCE12_ALPHA12, 22464}, new int[]{258, 258, 258, 258, 258, 258, 46, 46, 46, 46, 46, 10, 10, 10, 10, 10, 10, 34});
                return true;
            case 16003:
                a(colorUtility, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, GL11.GL_ALPHA16, GL11.GL_LUMINANCE12_ALPHA12, 22464}, new int[]{138, 138, 138, 138, 138, 138, 46, 46, 46, 46, 46, 10, 10, 10, 10, 10, 10, 34});
                return true;
            case 16004:
                a(colorUtility, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, GL11.GL_ALPHA16, GL11.GL_LUMINANCE12_ALPHA12, 22464}, new int[]{54, 54, 54, 54, 54, 54, 58, 58, 58, 58, 58, 10, 10, 10, 10, 10, 10, 34});
                return true;
            case 16005:
                a(colorUtility, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, GL11.GL_ALPHA16, GL11.GL_LUMINANCE12_ALPHA12, 22464}, new int[]{User32.WM_COMMAND, User32.WM_COMMAND, User32.WM_COMMAND, User32.WM_COMMAND, User32.WM_COMMAND, User32.WM_COMMAND, 60, 60, 60, 60, 60, 10, 10, 10, 10, 10, 10, 34});
                return true;
            case 16006:
                a(colorUtility, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, 32821, 32846, 7997, 8117, GL11.GL_ALPHA12, GL11.GL_LUMINANCE12_ALPHA4, 22464}, new int[]{53, 53, 53, 53, 53, 53, 60, 60, 60, 60, 60, 60, 60, 60, 10, 10, 10, 34});
                return true;
            case 16007:
                a(colorUtility, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, 32821, 32846, 7997, 8117, GL11.GL_ALPHA12, GL11.GL_LUMINANCE12_ALPHA4, 22464}, new int[]{208, 208, 208, 208, 208, 208, 249, 249, 249, 249, 249, 249, 249, 249, 240, 240, 240, 34});
                return true;
            case 16428:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{2839, 2826, 2837});
                return true;
            case 20521:
                a(colorUtility, 115, 40);
                return true;
            case 20523:
                a(colorUtility, new int[]{User32.WM_PARENTNOTIFY, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 40);
                return true;
            case 20524:
                a(colorUtility, new int[]{22410, G.fb}, new int[]{55, 56});
                return true;
            case 20539:
                a(colorUtility, new int[]{926}, new int[]{54});
                return true;
            case 20540:
                a(colorUtility, new int[]{926}, new int[]{40});
                return true;
            case 20541:
                a(colorUtility, new int[]{926}, new int[]{24});
                return true;
            case 20549:
                a(colorUtility, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451}, new int[]{56, 54, 56, 54, 56, 54, 54});
                return true;
            case 20550:
                a(colorUtility, 6573, 54);
                return true;
            case 20551:
                return true;
            case 20558:
                a(colorUtility, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935}, new int[]{60, 54, 54, 54, 54, 54, 54, 60, 60, 60, 60, 61});
                return true;
            case 20570:
                colorUtility.a(127, new int[]{1});
                return true;
            case 20571:
                b(colorUtility, 57);
                return true;
            case 20577:
                a(colorUtility, new int[]{22410, G.fb}, new int[]{62, 55});
                return true;
            case 20687:
                a(colorUtility, new int[]{127}, new int[]{56});
                return true;
            case 20689:
                a(colorUtility, new int[]{User32.WM_PARENTNOTIFY, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 56);
                return true;
            case 20694:
                colorUtility.a(20, new int[]{7});
                a(colorUtility, new int[]{aU.GZ, 8417}, new int[]{53, 53});
                return true;
            case 20695:
                a(colorUtility, new int[]{7502, 29976, 27819, 29980, 28302}, new int[]{54, 58, 54, 54, 54, 58, 54, 54, 54, 54});
                return true;
            case 20701:
            case 24175:
                a(colorUtility, new int[]{22410, G.fb}, new int[]{53, 55});
                return true;
            case 20722:
                a(colorUtility, new int[]{22410, G.fb}, new int[]{60, 59});
                return true;
            case 20723:
                a(colorUtility, new int[]{10475, 33}, new int[]{30, 29});
                return true;
            case 20724:
                b(colorUtility, 30);
                return true;
            case 20725:
                a(colorUtility, new int[]{3379, 3491, 78, 86, 3363, 18, 41, 109, 127, 59, 82, 75, 52, 57, 119, 97, 112, 73, 70, 48, 26}, new int[]{61, 61, 62, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62});
                return true;
            case 20729:
            case 20730:
                a(colorUtility, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451, 36007, 6573}, new int[]{56, 54, 56, 54, 56, 54, 54, 54, 54});
                return true;
            case 20731:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 8128, 7093}, new int[]{53, 53, 61, 60});
                return true;
            case 20737:
                a(colorUtility, new int[]{933}, new int[]{56});
                return true;
            case 20738:
                a(colorUtility, new int[]{5799, 6594, 5559, 5524}, 56);
                return true;
            case 20743:
                a(colorUtility, new int[]{22410, G.fb}, new int[]{62, 58});
                return true;
            case 20774:
                a(colorUtility, new int[]{37, 7114, 933, 935}, new int[]{42, 56, 72, 56});
                return true;
            case 20775:
                a(colorUtility, new int[]{33300, 6573, 410}, new int[]{60, 60, 62});
                return true;
            case 20776:
                a(colorUtility, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{61, 62, 60, 60, 60});
                return true;
            case 20793:
            case 20794:
            case 20795:
                a(colorUtility, new int[]{aU.hb, 9152, 41920, 8755, 43550, 46016}, new int[]{60, 54, 54, 54, 54, 54});
                return true;
            case 20796:
                a(colorUtility, new int[]{32878, 38015, 38101, 37980, 21554, 32803, 21534, 38089, 10304, 10316}, new int[]{53, 55, 55, 55, 54, 54, 54, 55, 54, 61});
                return true;
            case 20798:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ACCESS_NONE, 16425, 14490}, 54);
                return true;
            case 20799:
                a(colorUtility, new int[]{43123, 8877, 9024, 9015, aU.LJ, 5652}, new int[]{55, 55, 55, 54, 54, 54});
                return true;
            case 20807:
                b(colorUtility, 54);
                return true;
            case 20811:
                a(colorUtility, new int[]{8128}, new int[]{40});
                return true;
            case 20952:
                a(colorUtility, 43117, 62);
                return true;
            case 20992:
            case 21558:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{60, 54, 54, 54, 60, 60});
                return true;
            case 20995:
                a(colorUtility, new int[]{5813, 26006, 9139}, new int[]{30, 58, 58});
                return true;
            case 20996:
                a(colorUtility, new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{30, 60, 30, 60, 30, 29, 30, 29, 30, 60, 60, 60});
                return true;
            case 20997:
                a(colorUtility, new int[]{920, 0, 103}, new int[]{30, 29, 30});
                return true;
            case 20998:
                a(colorUtility, new int[]{0, 78, 920}, new int[]{29, 30, 29});
                return true;
            case 20999:
                a(colorUtility, new int[]{78, 103, 920, 0}, new int[]{30, 29, 30, 29});
                return true;
            case 21000:
                b(colorUtility, 29);
                return true;
            case 21001:
            case 21002:
            case 21003:
                b(colorUtility, 61);
                return true;
            case 21004:
                a(colorUtility, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{102, 102, 102, 102, 102});
                colorUtility.g(0, -1);
                return true;
            case 21008:
                a(colorUtility, new int[]{10279, 127, 11}, new int[]{54, 56, 56});
                return true;
            case 21009:
                b(colorUtility, 54);
                return true;
            case 21010:
                a(colorUtility, new int[]{21, 24, 12, 941}, new int[]{60, 60, 60, 62});
                return true;
            case 21011:
            case 21012:
                a(colorUtility, new int[]{12, 0, 28, 941, 943, 406, User32.WM_EXITMENULOOP, 280, 148, 152}, new int[]{60, 60, 60, 62, 62, 62, 60, 60, 60, 60});
                return true;
            case 21013:
                a(colorUtility, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{60, 60, 62, 62, 60, 60, 60, 62});
                return true;
            case 21014:
                a(colorUtility, 9164, 40);
                return true;
            case 21015:
                a(colorUtility, 9164, 56);
                return true;
            case 21024:
                a(colorUtility, new int[]{127}, 40);
                return true;
            case 21026:
            case 21560:
                colorUtility.a(127, new int[]{1});
                return true;
            case 21036:
                a(colorUtility, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{40, 40, 40, 40, 40, 40, 40, 40});
                return true;
            case 21037:
                a(colorUtility, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{56, 56, 56, 56, 56, 56, 56, 56});
                return true;
            case 21038:
                a(colorUtility, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 40, 40, 40, 40, 40, 40, 60, 60});
                return true;
            case 21039:
                a(colorUtility, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 56, 56, 56, 56, 56, 56, 60, 60});
                return true;
            case 21040:
                a(colorUtility, new int[]{22410, G.fb}, new int[]{56, 60});
                return true;
            case 21041:
            case 21605:
                a(colorUtility, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, aU.IG, 12}, new int[]{54, 58, 54, 58, 54, 58, 54, 58, 54, 58, 54, 58, 54});
                return true;
            case 21062:
                a(colorUtility, new int[]{11171, 11175, aU.TR}, new int[]{56, 55, 56});
                return true;
            case 21067:
                b(colorUtility, 5);
                return true;
            case 21068:
                a(colorUtility, 10283, 56);
                return true;
            case 21069:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, 8128, 7093}, new int[]{55, 56, 56});
                return true;
            case 21071:
                b(colorUtility, 54);
                return true;
            case 21072:
                b(colorUtility, 62);
                return true;
            case 21074:
                a(colorUtility, new int[]{aU.yB, aU.yR, aU.yn, aU.yt, aU.ym, aU.yp, 5094, aU.yi, aU.yz, aU.yP, aU.yT, aU.yF, aU.yJ, 5112, 5102, 5092}, 53);
                return true;
            case 21075:
                a(colorUtility, new int[]{22418, 22451, 37}, new int[]{62, 62, 60});
                return true;
            case 21076:
                a(colorUtility, new int[]{0, User32.WM_PARENTNOTIFY, aU.gu, 43150, 7326, 7446, QCOMEXTHostPtr.CL_DEVICE_PAGE_SIZE_QCOM, 16425, 16540, 7331}, new int[]{62, 62, 62, 62, 60, 60, 60, 60, 60, 62});
                return true;
            case 21077:
                a(colorUtility, new int[]{33817, 40003, 39996, 40967, 39992, 39999, 40007, 40000, 39995, 39988, 39953, 4363, CL12.CL_IMAGE_ARRAY_SIZE, CL10.CL_IMAGE_ELEMENT_SIZE, CL10.CL_MEM_REFERENCE_COUNT, 661, 258}, new int[]{61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 55, 55, 55, 55, 55, 55});
                return true;
            case 21083:
                a(colorUtility, new int[]{aU.GZ, 8417, 20}, new int[]{55, 63, 62});
                return true;
            case 21084:
                a(colorUtility, 10351, 61);
                return true;
            case 21087:
                b(colorUtility, 53);
                return true;
            case 21088:
                a(colorUtility, new int[]{123, 127, 22410, 29113, 908, 937, aU.zM, 123, 22410, 4550, 947, 5813, 11200}, new int[]{60, 59, 59, 59, 59, 59, 60, 60, 60, 63, 60, 60, 59});
                return true;
            case 21090:
                a(colorUtility, new int[]{10004, 25238, 8741, 4550, 908, 7073, 0, 5231, 5353, 10004, 61, 72, 98, 89}, new int[]{60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 62, 62, 62, 62});
                return true;
            case 21095:
                b(colorUtility, 54);
                return true;
            case 21101:
                colorUtility.a(127, new int[]{1});
                colorUtility.a(0, new int[]{1});
                return true;
            case 21106:
                a(colorUtility, new int[]{908, 54162, 41137, 41149, 41143, 6998, 40107, 14734}, new int[]{60, 60, 60, 60, 60, 60, 60, 60});
                return true;
            case 21107:
            case 22839:
            case 28044:
                a(colorUtility, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24}, new int[]{62, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62});
                return true;
            case 21108:
            case 22840:
            case 28045:
                a(colorUtility, new int[]{21563, 21580, 21559, 33678, 21555, 28, 82}, new int[]{60, 62, 60, 60, 60, 62, 62});
                return true;
            case 21127:
            case 21559:
                a(colorUtility, new int[]{280, 924, 920, 43166, aU.iw_, 43156, User32.WM_MBUTTONUP, 127}, new int[]{60, 60, 60, 54, 60, 60, 60, 54});
                return true;
            case 21130:
                a(colorUtility, new int[]{10343, 37929, 37925, 38044, 35720, 38049, 38040, 31419, 43059, 43057, 43916, 43076, 43908, 43061, 43043, 43113, 43220, 43080, 43055, 43038, 43051, 43034}, new int[]{56, 54, 54, 56, 56, 56, 54, 54, 54, 54, 54, 54, 54, 54, 56, 54, 54, 56, 54, 54, 56, 54});
                return true;
            case 21131:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{56, 54, 54, 56, 56, 56});
                return true;
            case 21133:
                b(colorUtility, 62);
                return true;
            case 21134:
                a(colorUtility, new int[]{11175}, new int[]{62});
                return true;
            case 21162:
                a(colorUtility, new int[]{3974, 3594, 2576, G.cU, 1571, aU.pP, 1575}, 30);
                return true;
            case 21163:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(6583, new int[]{6});
                colorUtility.a(aU.Ap, new int[]{8, 7, 6});
                colorUtility.a(6587, new int[]{6, 5, 4});
                colorUtility.a(6464, new int[]{4});
                colorUtility.a(60065, new int[]{4});
                colorUtility.a(60184, new int[]{4});
                a(colorUtility, new int[]{4, 5, 6, 7, 8}, new int[]{277, 82, 60, 60, 277});
                return true;
            case 21250:
                a(colorUtility, new int[]{55180, 57228}, new int[]{60, 60});
                return true;
            case 21253:
                colorUtility.a(5640, new int[]{915});
                colorUtility.a(CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, new int[]{5});
                colorUtility.a(4750, new int[]{15});
                colorUtility.a(9135, new int[]{7114});
                colorUtility.a(5388, new int[]{925});
                a(colorUtility, new int[]{8363}, new int[]{60});
                return true;
            case 21261:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(51111, new int[]{8});
                colorUtility.a(aU.Hb, new int[]{8});
                colorUtility.a(aU.GT, new int[]{8});
                colorUtility.a(aU.GP, new int[]{8});
                colorUtility.a(aU.GX, new int[]{8});
                colorUtility.a(aU.GN, new int[]{8});
                colorUtility.a(8377, new int[]{8});
                colorUtility.a(7349, new int[]{8});
                colorUtility.a(54534, new int[]{955});
                a(colorUtility, new int[]{61340, 54534, 51111}, new int[]{60, 40, 60});
                return true;
            case 21262:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(aU.Hb, new int[]{5});
                colorUtility.a(aU.GT, new int[]{5});
                colorUtility.a(aU.GP, new int[]{5});
                colorUtility.a(aU.GX, new int[]{5});
                colorUtility.a(aU.GN, new int[]{5});
                colorUtility.a(8377, new int[]{5});
                colorUtility.a(7349, new int[]{5});
                a(colorUtility, new int[]{61340, 54534, 51111, 5}, new int[]{60, 62, 60, 77});
                return true;
            case 21263:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(aU.Hb, new int[]{5});
                colorUtility.a(aU.GT, new int[]{5});
                colorUtility.a(aU.GP, new int[]{5});
                colorUtility.a(aU.GX, new int[]{5});
                colorUtility.a(aU.GN, new int[]{5});
                colorUtility.a(8377, new int[]{5});
                colorUtility.a(7349, new int[]{5});
                a(colorUtility, new int[]{61340, 54534, 51111, 5}, new int[]{60, 61, 60, 63});
                return true;
            case 21276:
                a(colorUtility, new int[]{7079, 8111, 8107, 11175}, new int[]{30, 29, 29, 60});
                return true;
            case 21282:
                a(colorUtility, new int[]{5405, 6449, 5409, 7390}, new int[]{60, 60, 30, 29});
                return true;
            case 21283:
            case 21284:
            case 21285:
                a(colorUtility, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411, 960}, new int[]{63, 63, 63, 63, 63, 63, 63, 63, 63, 34});
                return true;
            case 21286:
                colorUtility.a(new int[]{10, 15, 5});
                return true;
            case 21563:
                a(colorUtility, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, aU.IG, 12}, new int[]{62, 55, 62, 55, 62, 55, 62, 55, 62, 55, 62, 55, 62});
                return true;
            case 21574:
                a(colorUtility, new int[]{33300, 6573, 410}, new int[]{63, 63, 62});
                return true;
            case 21575:
                colorUtility.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                a(colorUtility, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355}, new int[]{60, 40, 60, 40, 60, 40, 60, 40, 60, 40, 40, 60});
                return true;
            case 21576:
                colorUtility.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                a(colorUtility, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355}, new int[]{60, 56, 60, 56, 60, 56, 60, 56, 60, 56, 56, 60});
                return true;
            case 21599:
                b(colorUtility, 60);
                return true;
            case 21601:
                a(colorUtility, new int[]{aU.yB, aU.yR, aU.yn, aU.yt, aU.ym, aU.yp, 5094, aU.yi, aU.yz, aU.yP, aU.yT, aU.yF, aU.yJ, 5112, 5102, 5092}, 54);
                return true;
            case 21602:
                a(colorUtility, new int[]{-11234, -11238, -10719, 54298, 54298, 54817}, new int[]{54, 54, 54, 54, 54, 54});
                return true;
            case 21603:
                a(colorUtility, new int[]{59449, 43294, 43311, 59437, 43088, 43105, 6736}, new int[]{54, 54, 54, 54, 54, 54, 54});
                return true;
            case 21604:
                a(colorUtility, new int[]{284, 960, 939}, new int[]{54, 54, 54});
                return true;
            case 21607:
                a(colorUtility, new int[]{62127, 62131, 62135, 62011, 61888}, 53);
                return true;
            case 21608:
                a(colorUtility, new int[]{61718, 61714, 61594, 61598, 61603}, 54);
                return true;
            case 21625:
                colorUtility.a(aU.Bp, new int[]{8120, 8130, 8140});
                colorUtility.a(7952, new int[]{aU.Bp});
                colorUtility.a(7585, new int[]{aU.Bp});
                return true;
            case 21629:
                a(colorUtility, new int[]{5784, 9152, 11187, 5404}, new int[]{56, 54, 54, 60});
                return true;
            case 21630:
                a(colorUtility, new int[]{aU.LM, aU.Bx, 10345, aU.xg, 8879, 5322}, new int[]{56, 54, 54, 56, 54, 54});
                return true;
            case 21633:
                colorUtility.a(127, new int[]{1});
                colorUtility.a(new int[]{89, 98, 72, 71, 97, 88, 72, 98, 89, aU.yn, aU.yx, 8, 12, 924, 57, aU.vy, 20, 24, 28, 16}, new int[]{80, 100, 100});
                return true;
            case 21640:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(0, new int[]{6});
                return true;
            case 21641:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(0, new int[]{1});
                colorUtility.a(19379, new int[]{127});
                colorUtility.a(26537, new int[]{127});
                colorUtility.a(49, new int[]{aU.BS});
                colorUtility.a(66, new int[]{aU.BS});
                return true;
            case 21642:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(0, new int[]{1});
                colorUtility.a(19379, new int[]{126});
                colorUtility.a(26537, new int[]{126});
                colorUtility.a(49, new int[]{960});
                colorUtility.a(66, new int[]{960});
                colorUtility.a(127, new int[]{78});
                colorUtility.a(103, new int[]{66});
                colorUtility.a(86, new int[]{62});
                return true;
            case 21643:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{49, 66, 19379, 26537}, new int[]{80, 80, 77, 77});
                return true;
            case 21644:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{49, 66, 19379, 26537, 127, 103, 86}, new int[]{62, 62, 60, 60, 93, 93, 93});
                return true;
            case 21648:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(10283, new int[]{7100});
                colorUtility.a(10287, new int[]{7124});
                colorUtility.a(10279, new int[]{7110});
                colorUtility.a(10291, new int[]{7144});
                colorUtility.a(10275, new int[]{7114});
                return true;
            case 21660:
                b(colorUtility, 61);
                return true;
            case 21663:
                a(colorUtility, new int[]{12, 57, 28, 20, 24, 16}, new int[]{61, 61, 62, 62, 62, 62});
                return true;
            case 21665:
                a(colorUtility, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{54, 60, 54, 54, 60, 54});
                return true;
            case 21666:
                a(colorUtility, new int[]{54371, 52323, 54348, class_238.p, 52446, 52442, 55527, 57575, 2588, 2469, 2593, 11815, 8377, aU.GK, aU.GT, 2595, 2590, 10324, aU.uO, 10332, 10295, 10308, 54480, 54472, 54476, 54488, 56545, 55646, 49226, 49234, 48198, 54443}, new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60});
                return true;
            case 21667:
                a(colorUtility, new int[]{898, 54443, 54447, 54435, 59437, 54329, User32.WM_PARENTNOTIFY, 54321, 7362, aU.GK, 284, 280, 404, aU.GT, G.aC, 2213, 51078, 24, G.aF, 274, 8377, 7349, 8369, 7341, 8361, G.cc, 45245, 45254, 45241, 45237, 45250, 54410, 50450, 50330, 50334, 45361, aU.GP, aU.GX, 278, 61, 49, 54333, 54338, 54342, 22, 18, User32.WM_ENTERIDLE, 165}, new int[]{60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 60, 60, 60, 60, 60, 54, 54, 54});
                return true;
            case 21668:
                a(colorUtility, new int[]{54319, 58526, 58646, 54315, 8421, 8425, 58539, GL11.GL_DEPTH_BITS, 181, 35, 8417, 54323, 3406, aU.nN, 7628, 7632, 7764, aU.rN, 54311, CGL.kCGLCESurfaceBackingSize, 301, User32.WM_QUERYUISTATE, 417, 3604, User32.WM_UNINITMENUPOPUP, 2578, 2954}, new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54});
                return true;
            case 21669:
                a(colorUtility, new int[]{3261, 3266, 301, User32.WM_UNINITMENUPOPUP, GL11.GL_PIXEL_MAP_I_TO_A_SIZE, 59548, 59544, 59664, 3369, 3373, 8410, 8414, 59553, 7390, 7510, 59429, 7399, 59540, 198, 7403, 206, aU.hm_, 3365, 214, 111, GL11.GL_MAX_LIGHTS}, new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54});
                return true;
            case 21670:
                b(colorUtility, 61);
                return true;
            case 21671:
                b(colorUtility, 60);
                return true;
            case 21672:
                a(colorUtility, new int[]{5799, 6594, 5559, 5524}, 61);
                return true;
            case 21673:
                a(colorUtility, new int[]{11171, 11175, aU.TR}, new int[]{37, 61, 61});
                return true;
            case 21674:
                a(colorUtility, new int[]{6032, 40, 920, 8, 937, 0, 43057, 924}, new int[]{61, 34, 61, 61, 61, 61, 61, 34});
                b(colorUtility, 61);
                return true;
            case 21675:
                a(colorUtility, new int[]{6032, 40, 920, 8, 937, 0, 43057, 924}, new int[]{60, 34, 60, 60, 60, 60, 60, 34});
                b(colorUtility, 60);
                return true;
            case 21677:
            case 21684:
                a(colorUtility, new int[]{960, 6984, 4930, aU.si, 1969}, new int[]{53, 53, 61, 61, 61});
                return true;
            case 21678:
            case 21685:
                a(colorUtility, new int[]{960, 6984, 4930, aU.si, 1969}, new int[]{52, 52, 54, 54, 54});
                return true;
            case 21679:
            case 21686:
                a(colorUtility, new int[]{960, 6984, 4930, aU.si, 1969}, new int[]{57, 57, 60, 60, 60});
                return true;
            case 21680:
                a(colorUtility, new int[]{5799, 6594, 5559, 5524}, 60);
                return true;
            case 21681:
                a(colorUtility, new int[]{11171, 11175, aU.TR}, new int[]{37, 60, 60});
                return true;
            case 21682:
                a(colorUtility, new int[]{5799, 6594, 5559, 5524}, 54);
                return true;
            case 21683:
                a(colorUtility, new int[]{11171, 11175, aU.TR}, new int[]{37, 54, 54});
                return true;
            case 21690:
                colorUtility.b(new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 8128, 7093}, new int[]{60, 60, 68, 68});
                return true;
            case 21691:
                colorUtility.b(new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, aU.IG, 12}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 68, 60, 68, 60, 68});
                return true;
            case 21692:
                colorUtility.b(new int[]{5404, aU.IG, 6554}, new int[]{60, 68, 60});
                return true;
            case 21693:
                colorUtility.b(new int[]{10472, aU.gx, 8845, 8610, 7104, aU.yn, 786, 4750, aU.iS, 7452, 817, 906, 926, 933, 937, 7333, 8664, 8656, 8146, 0, aU.ja_, 37, CGL.kCGLCEMPEngine, 7341, 7326, 7335, 7447, 905, 306, 63823, 432, 323, 11201, 228, 2472, 317, 2838, 142, 8421, 8660, aU.Jx, User32.WM_QUERYUISTATE, 2714, 2590, 2595, 65535, 20287}, new int[]{60, 60, 60, 60, 61, 61, 61, 61, 61, 61, 61, 61, 61, 60, 60, 60, 60, 60, 60, 61, 56, 60, 60, 60, 60, 60, 60, 60, 61, 60, 61, 57, 61, 57, 61, 61, 60, 56, 57, 61, 61, 61, 61, 61, 60, 60, 60});
                colorUtility.g(3);
                return true;
            case 21694:
                colorUtility.g(0, -1);
                colorUtility.b(new int[]{3862, 2842}, new int[]{68, 68});
                colorUtility.g(3);
                return true;
            case 21695:
            case 21696:
            case 21697:
            case 21698:
                if (colorUtility != null) {
                    colorUtility.g(0, -1);
                }
                a(colorUtility, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{68, 69, 69, 69, 69, 60, 60, 68, 60});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(3);
                return true;
            case 21699:
                a(colorUtility, new int[]{926, 10349, 0, 127}, new int[]{60, 68, 68, 68});
                return true;
            case 21700:
                a(colorUtility, new int[]{926}, new int[]{68});
                return true;
            case 21701:
                colorUtility.g(0, -1);
                a(colorUtility, new int[]{61}, new int[]{68});
                colorUtility.g(3);
                return true;
            case 21702:
                colorUtility.b(new int[]{63, 56, 56, 56, 63});
                return true;
            case 21703:
                a(colorUtility, new int[]{aU.Oh, 8119, 9152, 13, 51111, 50972}, new int[]{60, 60, 60, 54, 54, 54});
                return true;
            case 21704:
                b(colorUtility, 54);
                return true;
            case 21706:
            case 21707:
            case 21708:
                a(colorUtility, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, 60);
                return true;
            case 21709:
                a(colorUtility, new int[]{44948, 7104, 9152}, new int[]{60, 54, 54});
                return true;
            case 21710:
                a(colorUtility, new int[]{1955, 127, 929, 0, 6994}, new int[]{54, 60, 60, 60, 54});
                return true;
            case 21711:
                a(colorUtility, new int[]{1955, User32.WM_THEMECHANGED, User32.WM_PRINTCLIENT, 929, 127, 6994}, new int[]{54, 60, 60, 60, 54, 60});
                return true;
            case 21712:
                a(colorUtility, new int[]{852, 935, 9152, 9015, aU.Op, 9019, 9174}, new int[]{54, 60, 54, 60, 54, 60, 60});
                return true;
            case 21713:
                a(colorUtility, new int[]{5219, 910, 1938, 1690, 912, 962, 8, 78, 910, 912}, 54);
                return true;
            case 21714:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{61, 51, 51, 53, 53, 61});
                return true;
            case 21715:
                a(colorUtility, new int[]{7334, 46115, 7366, 7361, 7338, 7396, 7357, 7342, 7362, 46268, 7380, 46248, 46243, 7376, 7353, 7346, 7358, 7368, 7372, 7349, 7354, 43098, 43108, 46130, 46278, 10679, 10427, 46273, 20, 43118, 43077}, new int[]{61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 51});
                return true;
            case 21716:
                a(colorUtility, new int[]{5272, 5276, 5392, 5281, 8656}, new int[]{51, 53, 61, 61, 61});
                return true;
            case 21717:
                a(colorUtility, new int[]{21568, 0, 127, 55192, 54951, 55770, 54414, 52166}, new int[]{51, 61, 51, 51, 61, 53, 53, 53});
                return true;
            case 21718:
                a(colorUtility, new int[]{36007}, new int[]{53});
                return true;
            case 21719:
                a(colorUtility, new int[]{914, 675, 784, 4820, 945, aU.gR, 5458, 972}, new int[]{61, 61, 61, 51, 51, 51, 51, 51});
                return true;
            case 21720:
                a(colorUtility, new int[]{54306, 54311, 54288, 54313, 54320, 54310, 54315, 54327, 54299, 54829, 54843, 54301, 54298, 54302, 54318}, new int[]{61, 34, 51, 61, 51, 61, 61, 34, 60, 60, 60, 60, 60, 60, 60});
                return true;
            case 21721:
                a(colorUtility, new int[]{5165, 5160, 5155, aU.nz, aU.nJ, 5150, 5140, 26802, 26807, 26817, 26827, aU.nE, aU.nu, 5157}, new int[]{60, 60, 51, 51, 51, 61, 61, 51, 61, 51, 61, 60, 60, 60});
                return true;
            case 21722:
                a(colorUtility, new int[]{AMDDeviceAttributeQuery.CL_DEVICE_GFXIP_MINOR_AMD, aU.KT, EXTDeviceFission.CL_DEVICE_PARTITION_BY_COUNTS_EXT, 16474, EXTDeviceFission.CL_DEVICE_REFERENCE_COUNT_EXT, EXTDeviceFission.CL_DEVICE_PARENT_DEVICE_EXT, 16464, 16484, 16481, 16461, 16439, 16434, 16429, aU.KN, aU.KQ, aU.KW, aU.KZ}, new int[]{61, 51, 60, 61, 60, 61, 60, 51, 60, 60, 60, 60, 60, 60, 60, 60, 60});
                return true;
            case 21723:
                colorUtility.a(61, new int[]{11151});
                a(colorUtility, new int[]{11177, aU.xC, 10351, 11151}, new int[]{60, 53, 60, 60});
                return true;
            case 21724:
            case 21730:
                a(colorUtility, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935}, new int[]{60, 53, 53, 53, 53, 53, 53, 60, 60, 60, 60, 53});
                return true;
            case 21725:
                a(colorUtility, new int[]{103, 10291, 0, 43280, 38040, 40094, 40210, 6028, 10279, 36007, 929, 28, 33}, new int[]{60, 53, 60, 51, 60, 53, 61, 61, 60, 61, 51, 60, 60, 53});
                return true;
            case 21729:
                b(colorUtility, 53);
                return true;
            case 21732:
                a(colorUtility, new int[]{22410, G.fb}, new int[]{56, 54});
                return true;
            case 21734:
                a(colorUtility, new int[]{2983, 914, 6082, 23492, 23483, 4013, 4011, 8150, 4013, 2733, 4011, 2880, 28, 10167, 1946, 2983, 914, 29867, 6084}, new int[]{62, 62, 62, 62, 62, 62, 61, 61, 61, 61, 61, 61, 61, 62, 62, 62, 62, 62, 62});
                return true;
            case 21738:
                a(colorUtility, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 58, 58, 58, 58, 58, 58, 60, 60});
                return true;
            case 21739:
                a(colorUtility, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{58, 58, 58, 58, 58, 58, 58, 58});
                return true;
            case 21768:
            case 21769:
            case 21770:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(7516, new int[]{117});
                colorUtility.a(aU.IW, new int[]{127});
                colorUtility.a(aU.IS, new int[]{80});
                colorUtility.a(7636, new int[]{70});
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{3489, 3369, 3373, 8377}, new int[]{93, 56, 56, 56});
                return true;
            case 21771:
            case 21772:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(5169, new int[]{940, 945});
                colorUtility.a(55172, new int[]{920, 915});
                colorUtility.a(9133, new int[]{940, 930});
                colorUtility.a(11187, new int[]{920, 915});
                colorUtility.a(105, new int[]{127, 115, 120});
                colorUtility.a(88, new int[]{930, 940});
                colorUtility.a(26, new int[]{935, 945});
                colorUtility.a(64, new int[]{110, 100, 95});
                colorUtility.a(35, new int[]{107, 95, 100});
                return true;
            case 21773:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{70, 70, 93, 70, 70, 93, 93, 70, 70});
                return true;
            case 21774:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(6554, new int[]{127, 120});
                colorUtility.a(5404, new int[]{930, 940});
                a(colorUtility, new int[]{aU.IG}, new int[]{70});
                return true;
            case 21775:
                a(colorUtility, new int[]{aU.rW, aU.kO, 20906, 20891, 20902, 20895}, new int[]{56, 70, 70, 70, 70, 70});
                return true;
            case 21776:
                a(colorUtility, new int[]{User32.WM_PARENTNOTIFY, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 70);
                return true;
            case 21777:
                a(colorUtility, new int[]{119, 103, 127, 111}, new int[]{155, 155, 155, 155});
                return true;
            case 21778:
                a(colorUtility, new int[]{926, 10350, 0, 128}, new int[]{155, 97, 93, 97});
                return true;
            case 21779:
                a(colorUtility, new int[]{926}, new int[]{155});
                return true;
            case 21780:
                a(colorUtility, new int[]{5784, 9152, 11187, 5405}, new int[]{56, 93, 70, 10});
                return true;
            case 21781:
                a(colorUtility, new int[]{960, 6984, 4930, aU.si, 1969}, new int[]{93, 93, 70, 70, 70});
                return true;
            case 21782:
                a(colorUtility, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{93, 56, 56, 56, 56, 93, 56});
                return true;
            case 21783:
                a(colorUtility, new int[]{7079}, 70);
                return true;
            case 21784:
                a(colorUtility, new int[]{119, 103, 127, 111}, new int[]{70, 93, 70, 93});
                return true;
            case 21785:
                a(colorUtility, new int[]{aU.gA, 0, 4, 8, 673, 12, 16, 20, 24, 549, 553}, new int[]{120, 70, 70, 70, 119, 70, 70, 70, 70, 119, 119});
                return true;
            case 21786:
                a(colorUtility, new int[]{933, 127}, new int[]{119, 119});
                return true;
            case 21801:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(5828, new int[]{117});
                colorUtility.a(5714, new int[]{127});
                a(colorUtility, new int[]{24, 16, 33, 2768}, new int[]{70, 102, 70, 60});
                return true;
            case 21802:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(5828, new int[]{117});
                colorUtility.a(5714, new int[]{127});
                a(colorUtility, new int[]{24, 16, 33, 2768}, new int[]{56, 101, 56, 60});
                return true;
            case 21803:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(5828, new int[]{117});
                colorUtility.a(5714, new int[]{127});
                a(colorUtility, new int[]{24, 16, 33, 2768}, new int[]{119, 119, 119, 119});
                return true;
            case 21804:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(7516, new int[]{117});
                colorUtility.a(aU.IW, new int[]{127});
                colorUtility.a(aU.IS, new int[]{80});
                colorUtility.a(7636, new int[]{70});
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{3489, 3369, 3373, 8377, 39896, 39872, 7446, 7393}, new int[]{93, 56, 56, 56, 56, 56, 56, 56});
                return true;
            case 21805:
                a(colorUtility, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 56, 56, 56, 56, 60, 56});
                return true;
            case 21820:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ACCESS_NONE, 16425, 14490}, 120);
                return true;
            case 21823:
            case 21824:
            case 21825:
            case 21826:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(14395, new int[]{7, 8, 9});
                a(colorUtility, new int[]{14387, 127, 85}, new int[]{62, 62, 62});
                return true;
            case 21830:
                a(colorUtility, new int[]{aU.BO, 6563, 61, 6439, 6443}, new int[]{62, 62, 60, 60, 62});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(6558, new int[]{3});
                colorUtility.a(6439, new int[]{3});
                return true;
            case 21831:
                colorUtility.a(10351, new int[]{41257});
                return true;
            case 21832:
                colorUtility.a(10351, new int[]{21541});
                return true;
            case 21833:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(111, new int[]{7114});
                colorUtility.a(918, new int[]{7114});
                colorUtility.a(912, new int[]{7114});
                colorUtility.a(914, new int[]{7114});
                colorUtility.a(931, new int[]{7114});
                return true;
            case 21834:
            case 21835:
            case 21836:
            case 21837:
            case 21838:
            case 21839:
            case 21840:
            case 21841:
            case 21842:
            case 21843:
            case 22156:
                a(colorUtility, new int[]{43906, 41366, 20, 8, 12, 24, 926, 941, 918}, new int[]{60, 60, 60, 60, 60, 60, 62, 62, 62});
                colorUtility.g(10);
                colorUtility.g(0, -1);
                return true;
            case 21857:
            case 21858:
            case 21859:
                a(colorUtility, new int[]{10351}, new int[]{54});
                return true;
            case 21860:
                a(colorUtility, new int[]{7607}, new int[]{29});
                return true;
            case 21861:
                a(colorUtility, new int[]{aU.KR, 8720, 7566, 7690}, new int[]{180, 180, 62, 180});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(7446, new int[]{6});
                colorUtility.a(8720, new int[]{12, 11});
                colorUtility.a(aU.KR, new int[]{6});
                colorUtility.a(7326, new int[]{12, 11});
                return true;
            case 21862:
                a(colorUtility, new int[]{7566, 8070, 7326}, new int[]{180, 180, 62});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(7566, new int[]{6, 5});
                colorUtility.a(7690, new int[]{12, 10});
                colorUtility.a(7446, new int[]{6, 5});
                colorUtility.a(aU.KR, new int[]{6, 5});
                return true;
            case 21863:
                a(colorUtility, new int[]{9164, 6583, aU.Ap, 6587, 6464, 6742}, new int[]{60, 57, 60, 57, 57, 57});
                return true;
            case 21864:
                a(colorUtility, new int[]{43063, 10339, 23876, 43080, 16912, 16912, 43080}, new int[]{72, 55, 55, 55, 72, 55, 55});
                colorUtility.a(new int[]{43055}, new int[]{36170});
                colorUtility.a(new int[]{16912, 14765}, new int[]{36170});
                colorUtility.a(new int[]{43069, 43063, 43076}, new int[]{61889, 59728, 36170, 59734});
                return true;
            case 21865:
                a(colorUtility, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{60, 52, 60, 60, 52});
                colorUtility.g(0, -1);
                return true;
            case 21866:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(914, new int[]{7114, 7115});
                colorUtility.a(918, new int[]{7114, 7115});
                colorUtility.a(37, new int[]{10, 11, 10, 11, 10, 11, 10, 11, 7110, 11, 10, 11, 10, 11, 7110});
                return true;
            case 21867:
                a(colorUtility, new int[]{930, 906, 927, 922, 926, 921, 925, 920, User32.WM_PENWINLAST, 909, 917, 913, 915, 923, 919, 907, 908, 910, 916, 931, 936, 932}, new int[]{60, 102, 60, 102, 60, 60, 60, 60, 60, 60, 102, 102, 60, 102, 60, 102, 60, 60, 60, 60, 60, 60});
                colorUtility.g(5);
                return true;
            case 21868:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(12, new int[]{6});
                colorUtility.a(90, new int[]{8, 7, 6});
                colorUtility.a(84, new int[]{6, 5, 4});
                colorUtility.a(70, new int[]{4});
                colorUtility.a(61, new int[]{4});
                colorUtility.a(53, new int[]{4});
                colorUtility.a(45, new int[]{4});
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{aU.GK, 6350, 6340, 8371, 38169, 38161, 38155, 91, 85, 547, aU.iP_, 842, 6345}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 60});
                return true;
            case 21869:
                a(colorUtility, new int[]{7607}, new int[]{62});
                return true;
            case 21870:
                a(colorUtility, new int[]{7607}, new int[]{108});
                return true;
            case 21871:
                a(colorUtility, new int[]{152, 274, User32.WM_MBUTTONUP, 268, 156, 33753, 33460, 33473, 33906}, new int[]{108, 108, 108, 108, 108, 108, 108, 108, 108});
                return true;
            case 21880:
            case 22517:
            case 24112:
                a(colorUtility, new int[]{61, 8757}, new int[]{55, 72});
                return true;
            case 21899:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{55, 56, 55, 56, 56, 55, 55, 56, 56});
                return true;
            case 21915:
                colorUtility.a(1938, new int[]{59730});
                colorUtility.a(910, new int[]{59705});
                colorUtility.a(aU.tL, new int[]{59715});
                a(colorUtility, new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{55, 56, 55, 55, 24, 56, 56, 56, 55, 56, 55, 56});
                return true;
            case 21923:
            case 21924:
                a(colorUtility, new int[]{43059, 8128}, new int[]{55, 55});
                return true;
            case 21937:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(22024, new int[]{5});
                colorUtility.a(21776, new int[]{905});
                colorUtility.a(22402, new int[]{905});
                colorUtility.b(new int[]{905, 904, 929, 103, 910}, new int[]{75, 75, 75, 75, 80});
                return true;
            case 21940:
                a(colorUtility, new int[]{960, 6984, 4930, aU.si, 1969}, new int[]{55, 55, 56, 56, 56});
                return true;
            case 21943:
                a(colorUtility, new int[]{71, 97, 72, 98}, new int[]{62, 62, 62, 62});
                return true;
            case 21944:
                if (colorUtility != null) {
                    colorUtility.g(0, -1);
                }
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(3);
                return true;
            case 21946:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ACCESS_NONE, 16425, 14490}, new int[]{56, 55, 56});
                return true;
            case 21958:
            case 27520:
            case 27524:
                a(colorUtility, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{61, 93, 61, 93, 93});
                return true;
            case 21959:
            case 21961:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{74, 54, 54, 54, 74, 74});
                return true;
            case 21960:
            case 21962:
                a(colorUtility, new int[]{280, 924, 920, 43166, aU.iw_, 43156, User32.WM_MBUTTONUP, 127}, new int[]{60, 74, 60, 54, 60, 60, 60, 54});
                return true;
            case 22006:
                a(colorUtility, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{93, 60, 86, 60, 60});
                return true;
            case 22007:
                a(colorUtility, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{89, 78, 86, 60, 60});
                return true;
            case 22008:
                a(colorUtility, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{58, 83, 83, 60, 60});
                return true;
            case 22012:
            case 22013:
                b(colorUtility, 40);
                return true;
            case 22014:
                if (colorUtility != null) {
                    colorUtility.a(new int[]{10147, 10157, 10167}, new int[]{6});
                }
                a(colorUtility, new int[]{10165, 10176, 9812, 22451}, new int[]{62, 62, 62, 62});
                return true;
            case 22015:
                if (colorUtility != null) {
                    colorUtility.a(new int[]{10147, 10157, 10167}, new int[]{6});
                }
                a(colorUtility, new int[]{10165, 10176, 9812, 22451}, new int[]{109, 109, 109, 109});
                return true;
            case 22017:
                a(colorUtility, new int[]{10417, 3974, 3594, 2576, G.cU, 1571, aU.pP, 1575, aU.BQ, 7331}, new int[]{60, 62, 62, 60, 62, 62, 60, 60, 40, 40});
                return true;
            case 22018:
                a(colorUtility, new int[]{47168}, new int[]{62});
                return true;
            case 22019:
                a(colorUtility, new int[]{47168}, new int[]{109});
                return true;
            case 22023:
            case 22024:
            case 22025:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(24, new int[]{3});
                colorUtility.a(41, new int[]{3});
                colorUtility.a(12, new int[]{3});
                colorUtility.a(0, new int[]{1});
                colorUtility.a(926, new int[]{3});
                a(colorUtility, new int[]{41, 61}, new int[]{40, 62});
                return true;
            case 22027:
                a(colorUtility, new int[]{61, 924, 916, 932}, new int[]{60, 109, 60, 60});
                return true;
            case 22028:
                a(colorUtility, new int[]{61, 924, 916, 932}, new int[]{85, 75, 85, 85});
                return true;
            case 22031:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{75, 85, 75, 85, 85, 75, 75, 62, 62});
                return true;
            case 22032:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{109, 81, 109, 81, 109, 109, 109, 81, 81});
                return true;
            case 22033:
                a(colorUtility, new int[]{5421, 5334, 12459, aU.qi, 2733, G.dL}, new int[]{62, 80, 63, 34, 62, 80});
                return true;
            case 22034:
            case 22035:
                colorUtility.g(3);
                a(colorUtility, new int[]{3}, new int[]{87});
                return true;
            case 22040:
                b(colorUtility, aU.hu_);
                return true;
            case 22055:
            case 22056:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(105, new int[]{2});
                a(colorUtility, new int[]{916, 90, 84, 115, 92}, new int[]{109, 81, 81, 109, 81});
                colorUtility.g(70, -1);
                return true;
            case 22059:
                b(colorUtility, aU.hu_);
                return true;
            case 22060:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(35, new int[]{32});
                colorUtility.a(72, new int[]{6});
                colorUtility.a(76, new int[]{11});
                colorUtility.a(8635, new int[]{904});
                colorUtility.a(68, new int[]{904});
                a(colorUtility, new int[]{8636, 73, 77, 80, 36, 0, aU.Lu, 68, 8644, 8646, 55, 119, 123}, new int[]{61, 61, 61, 60, 60, 76, 60, 54, 62, 62, 61, 61});
                return true;
            case 22067:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ACCESS_NONE, 16425, 14490}, new int[]{55, 62, 55});
                return true;
            case 22070:
            case 22071:
                a(colorUtility, new int[]{43059, 8128}, new int[]{62, 62});
                return true;
            case 22085:
                a(colorUtility, new int[]{43059, 8128}, new int[]{54, 54});
                return true;
            case 22086:
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{10351}, new int[]{231});
                return true;
            case 22099:
            case 22876:
            case 22877:
                a(colorUtility, new int[]{43059, 8128}, new int[]{59, 59});
                return true;
            case 22100:
                a(colorUtility, new int[]{43059, 8128}, new int[]{61, 61});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 7093}, new int[]{5, 10, 15});
                return true;
            case 22104:
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{6589, 6674}, new int[]{60, 54});
                return true;
            case 22105:
            case 22106:
            case 22107:
                colorUtility.a(0, new int[]{1});
                colorUtility.b(new int[]{43449, 36007, 20, 8418, 1, 935, 28969, 43116, 43340, 43450, 43440, 6573, 411, 10258, 24, 12, 20, 16}, new int[]{54, 54, 60, 60, 54, 54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54});
                colorUtility.g(80);
                colorUtility.a(80, new int[]{7, 8, 10});
                colorUtility.a(94, new int[]{20, 25, 30});
                return true;
            case 22108:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(49, new int[]{11, 12, 11, 11, 11, 12});
                a(colorUtility, new int[]{11, 12}, new int[]{60, 61});
                return true;
            case 22109:
            case 22111:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(43164, new int[]{15});
                colorUtility.a(43061, new int[]{3});
                colorUtility.a(43053, new int[]{3});
                colorUtility.a(43026, new int[]{3});
                colorUtility.a(aU.yn, new int[]{902});
                colorUtility.a(3008, new int[]{950});
                colorUtility.a(24, new int[]{950});
                colorUtility.a(576, new int[]{920});
                colorUtility.a(aU.jz_, new int[]{902});
                colorUtility.a(aU.gT, new int[]{905});
                colorUtility.a(aU.hj, new int[]{920});
                colorUtility.a(aU.gX, new int[]{920});
                colorUtility.a(aU.gD, new int[]{920});
                return true;
            case 22112:
                a(colorUtility, new int[]{152, 274, User32.WM_MBUTTONUP, 268, 156, 33753, 33460, 33473, 33906}, new int[]{76, 76, 76, 76, 76, 76, 76, 76, 76});
                return true;
            case 22113:
                a(colorUtility, new int[]{GL11.GL_EDGE_FLAG_ARRAY, 32875, 33891, GL11.GL_INTENSITY12, 32858, 24, 33, 13223, 14236, 15256}, new int[]{54, 60, 60, 60, 60, 54, 54, 76, 76, 76});
                return true;
            case 22114:
                a(colorUtility, new int[]{12484, 16, 12475, 12, 28, 20, 37, 41, 30643, 13493, 0, 29601, 24, 33, 29609}, new int[]{54, 60, 60, 60, 60, 60, 60, 60, 76, 76, 76, 76, 60, 60, 76});
                return true;
            case 22115:
                a(colorUtility, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{54, 60, 54, 54, 54});
                return true;
            case 22116:
                a(colorUtility, new int[]{35255, 17500, 16462, 35247, 35251, 35259, 35270, 35264, AMDDeviceAttributeQuery.CL_DEVICE_SIMD_INSTRUCTION_WIDTH_AMD, 54317, 58419, 16466, 15434, 58539, 54302, 40757, 40871, ARBVertexProgram.GL_MATRIX4_ARB, 103, ARBVertexProgram.GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB, 0, 10291, 37060, 10279, 6028, 929, 28, 33}, new int[]{60, 54, 54, 60, 60, 76, 76, 60, 54, 65, 54, 65, 60, 65, 60, 54, 60, 54, 77, 60, 76, 60, 76, 54, 76, 54, 77, 77});
                return true;
            case 22117:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{108, 60, 60, 60, 108, 108});
                return true;
            case 22118:
                colorUtility.a(12, new int[]{6});
                colorUtility.a(47653, new int[]{11});
                colorUtility.a(8, new int[]{10});
                a(colorUtility, new int[]{16, 43286, 43282, 47772, 47777, 63, 67, 47657, 47708, 43292, 47533}, new int[]{75, 75, 60, 60, 60, 75, 60, 75, 60, 60, 60});
                colorUtility.g(8);
                return true;
            case 22119:
            case 22120:
                a(colorUtility, new int[]{947, 3776, 3546, CGL.kCGLCESurfaceBackingSize, 3996, 3895, aU.yj, 945}, new int[]{61, 61, 61, 61, 61, 61, 61, 61});
                colorUtility.a(22, new int[]{16});
                colorUtility.a(74, new int[]{12});
                colorUtility.a(49, new int[]{8});
                colorUtility.a(37, new int[]{10});
                colorUtility.a(28, new int[]{4});
                colorUtility.a(57, new int[]{5});
                colorUtility.a(20, new int[]{3});
                colorUtility.a(24, new int[]{7});
                colorUtility.a(33, new int[]{2});
                colorUtility.a(41, new int[]{11});
                colorUtility.a(45, new int[]{14});
                colorUtility.a(99, new int[]{14});
                colorUtility.a(101, new int[]{11});
                colorUtility.a(103, new int[]{10});
                colorUtility.a(86, new int[]{10});
                colorUtility.a(82, new int[]{9});
                colorUtility.a(78, new int[]{10});
                colorUtility.a(51, new int[]{8});
                colorUtility.a(53, new int[]{12});
                colorUtility.a(18, new int[]{3});
                colorUtility.a(26, new int[]{6});
                return true;
            case 22121:
                a(colorUtility, new int[]{4382, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 7616, 7731}, new int[]{96, 96, 95, 95});
                return true;
            case 22122:
                colorUtility.a(new int[]{44948, 44940, 44935});
                return true;
            case 22123:
                colorUtility.a(71, new int[]{90});
                colorUtility.a(72, new int[]{90});
                colorUtility.a(97, new int[]{95});
                colorUtility.a(98, new int[]{95});
                colorUtility.a(88, new int[]{110});
                colorUtility.a(89, new int[]{110});
                a(colorUtility, new int[]{90, 95, 110}, new int[]{60, 60, 54});
                return true;
            case 22124:
                colorUtility.a(22428, new int[]{7114});
                colorUtility.a(22433, new int[]{44948});
                colorUtility.a(22437, new int[]{5});
                colorUtility.a(19129, new int[]{44948});
                colorUtility.a(19119, new int[]{44948});
                colorUtility.a(12853, new int[]{7114});
                colorUtility.a(12989, new int[]{5});
                colorUtility.a(933, new int[]{44948});
                colorUtility.a(939, new int[]{44948});
                return true;
            case 22125:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{60, 54, 60, 54, 54, 60, 60, 54, 54});
                return true;
            case 22130:
                a(colorUtility, new int[]{926}, new int[]{74});
                return true;
            case 22131:
                a(colorUtility, new int[]{926}, new int[]{76});
                return true;
            case 22132:
                a(colorUtility, new int[]{926}, new int[]{80});
                return true;
            case 22133:
                a(colorUtility, new int[]{926}, new int[]{71});
                return true;
            case 22134:
                colorUtility.a(278, new int[]{aU.hS_});
                colorUtility.a(g.c, new int[]{422});
                colorUtility.a(156, new int[]{g.c});
                colorUtility.a(28, new int[]{16});
                colorUtility.a(20, new int[]{14});
                colorUtility.a(22, new int[]{12});
                return true;
            case 22136:
            case 22138:
                colorUtility.a(16, new int[]{8, 10, 11});
                colorUtility.a(20, new int[]{14});
                colorUtility.b(new int[]{12, 24, 920, 7104, 7097}, new int[]{180, 180, 61, 71, 71});
                return true;
            case 22137:
                colorUtility.a(20, new int[]{10});
                colorUtility.b(new int[]{12, 24, 16}, new int[]{180, 180, 61});
                return true;
            case 22139:
                colorUtility.a(40, new int[]{74});
                colorUtility.a(924, new int[]{12});
                colorUtility.a(6032, new int[]{34});
                return true;
            case 22144:
            case 22149:
            case 22150:
            case 22151:
            case 22255:
                colorUtility.g(4);
                colorUtility.g(0, -1);
                return true;
            case 22145:
                a(colorUtility, new int[]{54306, 54312, 54289, 54313, 54321, 54310, 54315, 54328, 54299, 54829, 54843, 54301, 54298, 54302, 54318}, new int[]{76, 34, 51, 76, 51, 76, 76, 34, 76, 76, 76, 76, 60, 60, 60});
                colorUtility.g(2);
                colorUtility.g(50, -1);
                return true;
            case 22146:
            case 22147:
                colorUtility.b(new int[]{aU.Gw, aU.GN, 8375, 10266, 9523, 10502, 9515, 22, 21662, 17566, 10275, 21782, 274, 163, 142, 9403, 8076, 21902, 21772, 21658, 10291, 21667, 9152, 9147, 7378, 898, 26, aU.GI, aU.GT, 39, 55244, 10283, 10287}, new int[]{61, 61, 61, 60, 85, 85, 60, 60, 55, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 61, 61, 60, 0, 60, 61, 61, 60, 60, 60, 60});
                return true;
            case 22152:
                colorUtility.g(23);
                colorUtility.a(23, new int[]{302770, 419770, 419770, 302770});
                return true;
            case 22153:
                colorUtility.g(23);
                colorUtility.a(23, new int[]{127, 955, 955, 127});
                return true;
            case 22154:
                colorUtility.g(23);
                colorUtility.a(23, new int[]{461770, 76770});
                return true;
            case 22155:
                colorUtility.g(23);
                colorUtility.a(23, new int[]{920, 960});
                return true;
            case 22167:
            case 22168:
            case 22169:
                a(colorUtility, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, new int[]{77, 77, 77, 77, 77, 77, 77, 77, 77});
                return true;
            case 22179:
                b(colorUtility, 57);
                return true;
            case 22180:
                a(colorUtility, new int[]{5799, 6594, 5559, 5524}, 57);
                return true;
            case 22181:
                a(colorUtility, new int[]{11171, 11175, aU.TR}, new int[]{60, 57, 60});
                return true;
            case 22183:
                a(colorUtility, new int[]{7079, 11175}, new int[]{61, 60});
                return true;
            case 22184:
                a(colorUtility, new int[]{7079, 11175}, new int[]{60, 60});
                return true;
            case 22185:
                a(colorUtility, new int[]{7079, 11175}, new int[]{54, 60});
                return true;
            case 22189:
            case 22190:
                colorUtility.a(74, new int[]{33031});
                colorUtility.a(57, new int[]{1});
                colorUtility.a(86, new int[]{33031});
                colorUtility.a(90, new int[]{1});
                colorUtility.a(66, new int[]{33031});
                colorUtility.a(33030, new int[]{1});
                colorUtility.a(10262, new int[]{1});
                a(colorUtility, new int[]{33031, 2, 10264}, new int[]{54, 60, 60});
                return true;
            case 22191:
                colorUtility.a(78, new int[]{33031});
                colorUtility.a(86, new int[]{1});
                colorUtility.a(94, new int[]{33031});
                colorUtility.a(33030, new int[]{1});
                a(colorUtility, new int[]{33031, 2, 10264}, new int[]{54, 60, 60});
                return true;
            case 22218:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(127, new int[]{4382});
                return true;
            case 22220:
                a(colorUtility, new int[]{20, 924, 30, 10308, 14395, 39, 47}, new int[]{60, 75, 60, 77, 77, 75, 75});
                return true;
            case 22243:
            case 23065:
                colorUtility.a(new int[]{347770, 311770, 347770, 311770});
                return true;
            case 22250:
                colorUtility.a(90, new int[]{33031});
                colorUtility.a(21766, new int[]{1});
                colorUtility.a(28, new int[]{1});
                colorUtility.a(37, new int[]{1});
                colorUtility.a(20, new int[]{1});
                colorUtility.a(43150, new int[]{1});
                colorUtility.a(43146, new int[]{1});
                colorUtility.a(43270, new int[]{1});
                colorUtility.a(26, new int[]{1});
                colorUtility.a(18, new int[]{1});
                a(colorUtility, new int[]{33031, 91, 72, 82, 65, 25, 45, 65, 3230, 3226, 26, 18, 88}, new int[]{54, 60, 60, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54});
                return true;
            case 22251:
                colorUtility.a(17069, new int[]{5});
                colorUtility.a(8755, new int[]{4007});
                colorUtility.a(8631, new int[]{4020});
                colorUtility.a(8635, new int[]{4030});
                colorUtility.a(aU.ND, new int[]{12});
                colorUtility.a(10149, new int[]{4040});
                colorUtility.a(957, new int[]{25});
                colorUtility.a(aU.iR_, new int[]{40});
                colorUtility.a(941, new int[]{35});
                a(colorUtility, new int[]{12}, new int[]{60});
                return true;
            case 22260:
                if (Configuration.n == class_152.f || Configuration.n == class_152.e) {
                    a(colorUtility, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{56, 56, 56, 56, 72, 56});
                    return true;
                }
                if (Configuration.n == class_152.d) {
                    a(colorUtility, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{60, 60, 68, 60, 68, 60});
                    return true;
                }
                if (Configuration.n == class_152.b) {
                    a(colorUtility, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{179, 179, 179, 179, 56, 179});
                    return true;
                }
                a(colorUtility, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{337, 261, 337, 337, 261, 337});
                return true;
            case 22261:
                if (Configuration.n == class_152.f || Configuration.n == class_152.e) {
                    a(colorUtility, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, aU.IG, 12}, new int[]{56, 72, 56, 72, 56, 72, 56, 72, 56, 72, 56, 72, 56});
                    return true;
                }
                if (Configuration.n == class_152.d) {
                    a(colorUtility, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, aU.IG, 12}, new int[]{60, 68, 60, 68, 60, 68, 68, 68, 60, 68, 60, 68, 60});
                    return true;
                }
                if (Configuration.n == class_152.b) {
                    a(colorUtility, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, aU.IG, 12}, new int[]{179, 56, 179, 56, 179, 56, 179, 56, 179, 56, 179, 56, 179});
                    return true;
                }
                a(colorUtility, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, aU.IG, 12}, new int[]{261, 261, 337, 261, 261, 261, 337, 261, 337, 261, 337, 261, 337});
                return true;
            case 22262:
            case 22263:
            case 22264:
                colorUtility.a(6356, new int[]{16});
                colorUtility.a(6364, new int[]{12});
                colorUtility.a(6348, new int[]{10});
                colorUtility.a(6323, new int[]{8});
                colorUtility.a(43305, new int[]{8});
                a(colorUtility, new int[]{49218, 6331, 43311, 7108, 49197, 6973, 43301, 5268, 49209, 43544, 6340}, new int[]{102, 102, 54, 60, 54, 102, 102, 54, 54, 102, 54, 54, 60});
                return true;
            case 22270:
            case 22271:
            case 22272:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(70, -1);
                colorUtility.a(4382, new int[]{36190, 36195, 36185});
                colorUtility.a(4785, new int[]{36185, 36192, 36180});
                colorUtility.a(4661, new int[]{36170, 36175, 36160});
                colorUtility.a(4626, new int[]{36190, 36195});
                colorUtility.a(4781, new int[]{127});
                colorUtility.a(8427, new int[]{127});
                colorUtility.b(new int[]{127}, new int[]{116});
                return true;
            case 22273:
                colorUtility.b(new int[]{926}, new int[]{105});
                return true;
            case 22274:
                colorUtility.b(new int[]{933, 10351}, new int[]{105, 60});
                return true;
            case 22276:
                colorUtility.b(new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{105, 56, 105, 56, 56, 105, 105, 56, 56});
                return true;
            case 22282:
                colorUtility.a(61, new int[]{62, 63});
                colorUtility.b(new int[]{62, 63, 8757}, new int[]{56, 101, 90});
                return true;
            case 22283:
            case 22284:
                colorUtility.a(5652, new int[]{940, 935});
                colorUtility.a(12820, new int[]{960, 955});
                colorUtility.a(10543, new int[]{127});
                colorUtility.a(43270, new int[]{100});
                colorUtility.a(4550, new int[]{80});
                colorUtility.b(new int[]{8}, new int[]{70});
                return true;
            case 22286:
                a(colorUtility, new int[]{35255, 17500, 16462, 35247, 35251, 35259, 35270, 35264, AMDDeviceAttributeQuery.CL_DEVICE_SIMD_INSTRUCTION_WIDTH_AMD, 54317, 58419, 16466, 15434, 58539, 54302, 40757, 40871, ARBVertexProgram.GL_MATRIX4_ARB, 103, ARBVertexProgram.GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB, 0, 10291, 37060, 10279, 6028, 929, 28, 33}, new int[]{105, 56, 56, 105, 105, 76, 76, 105, 56, 65, 56, 65, 105, 65, 105, 56, 105, 56, 77, 105, 76, 105, 76, 56, 76, 56, 77, 77});
                return true;
            case 22287:
            case 22289:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{56, 105, 105, 105, 56, 56});
                return true;
            case 22288:
            case 22290:
                a(colorUtility, new int[]{280, 924, 920, 43166, aU.iw_, 43156, User32.WM_MBUTTONUP, 127}, new int[]{60, 105, 60, 56, 60, 60, 60, 56});
                return true;
            case 22358:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{10, 15, 20, 10, 5810, 5810});
                return true;
            case 22359:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{64585, 64590, 64595, 64585, 5810, 5810});
                return true;
            case 22360:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{9767, 9772, 9777, 9767, 5810, 5810});
                return true;
            case 22361:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{65046, 65051, 65056, 65046, 5810, 5810});
                return true;
            case 22362:
            case 22366:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{10, 15, 20, 10, 5810});
                return true;
            case 22363:
            case 22367:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{64585, 64590, 64595, 64585, 5810});
                return true;
            case 22364:
            case 22368:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{9767, 9772, 9777, 9767, 5810});
                return true;
            case 22365:
            case 22369:
                if (!Configuration.aj) {
                    return true;
                }
                colorUtility.a(new int[]{65046, 65051, 65056, 65046, 5810});
                return true;
            case 22450:
            case 22451:
            case 22452:
                colorUtility.g(100, -1);
                colorUtility.a(8650, new int[]{36190, 36195, 36185});
                colorUtility.a(43047, new int[]{36190, 36195, 36185});
                colorUtility.a(43088, new int[]{36190, 36195, 36185});
                colorUtility.a(43047, new int[]{36190, 36195, 36185});
                colorUtility.a(43072, new int[]{36170, 36195, 36185});
                colorUtility.a(43063, new int[]{36180, 36195, 36185});
                colorUtility.a(43096, new int[]{36155, 36165, 36150});
                colorUtility.b(new int[]{8650, 43096, 43047, 43088, 0, 43072, 43063, 43080, 8658, 43030, 43084, 43076}, new int[]{101, 56, 101, 101, 101, 56, 101, 56, 101, 101, 56, 101});
                return true;
            case 22455:
                colorUtility.a(33680, new int[]{6926});
                colorUtility.a(33690, new int[]{6926});
                colorUtility.a(33674, new int[]{6926});
                colorUtility.a(48055, new int[]{6926});
                colorUtility.a(48045, new int[]{6926});
                colorUtility.a(49083, new int[]{6926});
                colorUtility.b(new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083}, new int[]{60, 54, 60, 60, 54, 54, 60, 54, 60, 54, 60, 54});
                return true;
            case 22456:
                colorUtility.a(33680, new int[]{6920});
                colorUtility.a(33690, new int[]{6920});
                colorUtility.a(33674, new int[]{6920});
                colorUtility.b(new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083}, new int[]{60, 96, 60, 60, 96, 96, 60, 96, 60, 96, 60, 96});
                return true;
            case 22457:
                colorUtility.b(new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083}, new int[]{60, 96, 60, 60, 96, 96, 60, 96, 60, 96, 60, 96});
                return true;
            case 22494:
                a(colorUtility, new int[]{4626}, new int[]{55});
                return true;
            case 22514:
            case 22515:
            case 22516:
                colorUtility.b(new int[]{10306, 10314, 1944, aU.uO, 0, 20, 12, 152, 43286, 1940, 1938, 3974, 70}, new int[]{72, 55, 72, 55, 72, 55, 55, 72, 55, 72, 72, 72, 72});
                return true;
            case 22518:
                a(colorUtility, new int[]{aU.gA, 673, 553, 549, 0, 4, 8, 12, 16, 20, 24}, new int[]{55, 55, 55, 55, 72, 72, 72, 72, 72, 72, 72});
                return true;
            case 22522:
                a(colorUtility, new int[]{37093, 39137, 38003, 7471, 7479, 40161, 6435, 7467, 7463}, new int[]{72, 72, 72, 55, 55, 72, 55, 55, 55});
                return true;
            case 22777:
                a(colorUtility, new int[]{7104}, new int[]{56});
                return true;
            case 22778:
                a(colorUtility, new int[]{6067, 7104}, new int[]{56, 56});
                return true;
            case 22779:
            case 22780:
                a(colorUtility, new int[]{935}, new int[]{56});
                return true;
            case 22781:
                a(colorUtility, new int[]{972}, new int[]{70});
                return true;
            case 22782:
                a(colorUtility, new int[]{984, 972}, new int[]{70, 70});
                return true;
            case 22783:
            case 22784:
                a(colorUtility, new int[]{11187}, new int[]{70});
                return true;
            case 22786:
                a(colorUtility, new int[]{29456}, new int[]{56});
                return true;
            case 22787:
            case 22797:
            case 22799:
                b(colorUtility, 56);
                return true;
            case 22789:
            case 22798:
            case 22800:
                b(colorUtility, 70);
                return true;
            case 22790:
                a(colorUtility, new int[]{926}, new int[]{70});
                return true;
            case 22791:
                a(colorUtility, new int[]{933}, new int[]{70});
                return true;
            case 22801:
                a(colorUtility, new int[]{61, 924, 916, 932}, new int[]{50, 56, 50, 50});
                return true;
            case 22803:
            case 22804:
                a(colorUtility, new int[]{935, 939, 929, 931}, new int[]{56, 56, 56, 56});
                return true;
            case 22805:
            case 22806:
                a(colorUtility, new int[]{935, 939, 929, 931}, new int[]{70, 70, 70, 70});
                return true;
            case 22809:
                a(colorUtility, new int[]{35868, 35895, 35912, 35865, 35882, 35875, 35889, 35906}, new int[]{70, 70, 70, 70, 70, 70, 70, 70});
                colorUtility.g(127);
                return true;
            case 22810:
                b(colorUtility, 56);
                return true;
            case 22812:
                colorUtility.b(new int[]{63, 63, 56, 56, 56});
                return true;
            case 22813:
                a(colorUtility, new int[]{aU.GZ, 8417, 20}, new int[]{71, 71, 54});
                return true;
            case 22814:
                colorUtility.b(new int[]{4363, CL12.CL_IMAGE_ARRAY_SIZE, CL10.CL_IMAGE_ELEMENT_SIZE, CL10.CL_MEM_REFERENCE_COUNT, 661, 258, 33817, 40003, 39996, 40967, 39992, 39999, 40007, 40000, 39995, 39988, 39953}, new int[]{71, 59, 59, 59, 71, 71, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54});
                return true;
            case 22825:
                b(colorUtility, 58);
                return true;
            case 22832:
                a(colorUtility, new int[]{21, 24, 12, 941}, new int[]{71, 71, 71, 54});
                return true;
            case 22833:
            case 22834:
                a(colorUtility, new int[]{12, 0, 28, 941, 943, 406, User32.WM_EXITMENULOOP, 280, 148, 152}, new int[]{71, 71, 71, 54, 54, 54, 71, 71, 71, 71});
                return true;
            case 22838:
                a(colorUtility, new int[]{7607}, new int[]{71});
                return true;
            case 22842:
                a(colorUtility, new int[]{21652, 21658}, 62);
                return true;
            case 22843:
                a(colorUtility, new int[]{5813, 26006, 9139}, new int[]{62, 61, 61});
                return true;
            case 22847:
            case 22848:
            case 22849:
                a(colorUtility, new int[]{82, aU.Br, 7073}, new int[]{60, 54, 54});
                return true;
            case 22850:
                b(colorUtility, 40);
                return true;
            case 22851:
                b(colorUtility, 56);
                return true;
            case 22852:
                a(colorUtility, new int[]{4027, 7105, aU.yn}, new int[]{40, 46, 40});
                return true;
            case 22853:
                a(colorUtility, new int[]{32878, 38015, 38101, 37980}, new int[]{56, 56, 56, 56});
                return true;
            case 22854:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(110, -1);
                colorUtility.g(8);
                return true;
            case 22860:
                a(colorUtility, 9164, 60);
                if (colorUtility != null) {
                    colorUtility.g(0, -1);
                }
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(3);
                return true;
            case 22861:
                a(colorUtility, 9164, 60);
                if (colorUtility != null) {
                    colorUtility.g(0, -1);
                }
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(127);
                return true;
            case 22870:
                b(colorUtility, 53);
                return true;
            case 22871:
                a(colorUtility, new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{60, 54, 60, 54, 60, 54, 60, 54, 54, 60, 60, 60});
                return true;
            case 22873:
                a(colorUtility, new int[]{9152, 82, 123, 127}, new int[]{60, 54, 60, 54});
                return true;
            case 22878:
                a(colorUtility, new int[]{GL11.GL_INDEX_SHIFT, aU.yp, 6084, 8134, 37, aU.pU, 82, 7834, aU.nF, 24, 20, 7700}, new int[]{60, 54, 60, 54, 60, 54, 60, 54, 60, 60, 60, 54});
                return true;
            case 22879:
                a(colorUtility, new int[]{61, 8758}, new int[]{60, 60});
                return true;
            case 22881:
            case 27287:
                a(colorUtility, new int[]{280, 924, 920, 43166, aU.iw_, 43156, User32.WM_MBUTTONUP, 127}, new int[]{60, 61, 60, 80, 60, 60, 60, 53});
                return true;
            case 22882:
            case 27288:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{80, 61, 61, 61, 80, 80});
                return true;
            case 22885:
            case 22886:
                a(colorUtility, new int[]{127, 815, 914, 675, 784, 4820, 945, aU.gR, 5458, 972}, 52);
                return true;
            case 22888:
                a(colorUtility, new int[]{aU.KX, 49, 10520, 10529, 8722}, new int[]{60, 62, 60, 62, 62});
                return true;
            case 22928:
                a(colorUtility, new int[]{21568, 0, 127, 55192, 54951, 55770, 54414, 52166, 55888, 55884, 56018, 56020}, new int[]{60, 54, 54, 60, 54, 54, 60, 60, 54, 54, 60, 60});
                return true;
            case 22933:
                a(colorUtility, new int[]{960}, 52);
                return true;
            case 22934:
                a(colorUtility, new int[]{960}, 54);
                return true;
            case 22935:
                a(colorUtility, new int[]{aU.xC}, 54);
                return true;
            case 22947:
                colorUtility.b(new int[]{21652, 21658, 16904, 13248, 13204, 32920, 15320, 10448, 10462, 16656, 14259, 18, 22, 26}, new int[]{aU.hu_, aU.hu_, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, aU.hu_, aU.hu_});
                return true;
            case 22948:
                colorUtility.b(new int[]{38119, 127, 9118, 76, 9121, 68, 8097, 64, 198, 8092, 59, 4, 107, 10638, 61625, 10142}, new int[]{54, 54, 54, 60, 60, 60, 60, 54, 60, 54, 60, 54, 54, 60, 60, 60});
                return true;
            case 22949:
            case 27519:
                a(colorUtility, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{61, 60, 61, 60, 60});
                return true;
            case 22950:
                colorUtility.a(914, new int[]{7114});
                colorUtility.a(918, new int[]{7114});
                colorUtility.a(934, new int[]{7114});
                return true;
            case 22951:
            case 22952:
            case 22953:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(926);
                colorUtility.a(926, new int[]{926, 910, 905, 918, 7114});
                return true;
            case 22964:
                b(colorUtility, 54);
                return true;
            case 23003:
                colorUtility.a(5712, new int[]{G.cC});
                colorUtility.a(10714, new int[]{90});
                return true;
            case 23007:
                a(colorUtility, new int[]{11171, 11175, aU.TR}, new int[]{60, 72, 60});
                return true;
            case 23008:
            case 23009:
            case 23010:
            case 23011:
            case 23012:
                a(colorUtility, new int[]{10351, 2361, G.cu, 220}, new int[]{55, 55, 55, 55});
                return true;
            case 23017:
                colorUtility.a(new int[]{aU.yP, aU.yT, 278, aU.hS_, aU.yF, aU.yJ, 408, aU.yn, aU.yt, 4, aU.yB, 143, User32.WM_COMMAND, aU.ym, aU.yp, 5094, aU.yi, aU.yz, 133, 2, aU.yR, 280, 7321, aU.hT_, 5092, User32.WM_UNICHAR, 5102, 5112, User32.WM_IME_ENDCOMPOSITION}, 5);
                return true;
            case 23018:
                colorUtility.b(new int[]{aU.yP, aU.yT, 278, aU.hS_, aU.yF, aU.yJ, 408, aU.yn, aU.yt, 4, aU.yB, 143, User32.WM_COMMAND, aU.ym, aU.yp, 5094, aU.yi, aU.yz, 133, 2, aU.yR, 280, 7321, aU.hT_, 5092, User32.WM_UNICHAR, 5102, 5112, User32.WM_IME_ENDCOMPOSITION, 409, 406, 414, 411, 139, 137, 135, 816}, new int[]{179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 338, 338, 338, 338, 338, 338, 338, 338});
                return true;
            case 23019:
                colorUtility.b(new int[]{78, 5790, 5788}, new int[]{55, 72, 72});
                return true;
            case 23020:
                colorUtility.b(new int[]{6032, 3994, 2974, 2983, aU.xu, 3990, 3996}, new int[]{55, 72, 55, 72, 72, 55, 55});
                return true;
            case 23021:
                colorUtility.b(new int[]{8088, aU.Dx, aU.xq, User32.WM_PARENTNOTIFY, 9123, 6034, 3982, 7845}, new int[]{55, 72, 55, 72, 72, 72, 59, 59});
                return true;
            case 23026:
            case 23027:
            case 23028:
                a(colorUtility, new int[]{43992, 924, 11200, 78, 3738, aq.L, User32.WM_PARENTNOTIFY, 4750}, new int[]{72, 55, 55, 55, 27, 72, 27, 27});
                return true;
            case 23029:
                a(colorUtility, new int[]{10351, 7070}, new int[]{72, 55});
                return true;
            case 23030:
                a(colorUtility, new int[]{127, 476, 960, 0, 9672}, new int[]{72, 55, 72, 55, 55});
                return true;
            case 23033:
                a(colorUtility, new int[]{7335, 203, 7343, 5166, 7376, 7340, 5162, 5170, User32.WM_PENWINLAST, 65535}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60});
                return true;
            case 23038:
                a(colorUtility, new int[]{5268, 5392}, 54);
                return true;
            case 23039:
                a(colorUtility, new int[]{10403, 10407}, 54);
                return true;
            case 23040:
                a(colorUtility, new int[]{5276, 5293, 5289, 5285}, 54);
                return true;
            case 23041:
                a(colorUtility, new int[]{5169, 5161}, 54);
                return true;
            case 23042:
                a(colorUtility, new int[]{7613, 7596, 133, 151, 35868, 35895, 35912, 35865, 35882, 35875, 35888, 35905, 35856, 35873, 35866, 6303, 35879, 35840, 35862, 35855, 6317, 35886, 6292, aU.jD, aU.jP, aU.jw, 1097, 54, 49, 39, 32, 64, 59, 45, 31, 6297, 40, 50, 85, 23, 6302, EXTPackedFloat.GL_RGBA_SIGNED_COMPONENTS_EXT}, new int[]{55, 55, 55, 55, 72, 72, 72, 55, 72, 72, 55, 72, 72, 55, 72, 55, 72, 72, 72, 72, 55, 72, 55, 55, 55, 55, 72, 55, 72, 72, 72, 72, 72, 72, 72, 55, 55, 55, 55, 55, 55, 72});
                return true;
            case 23047:
                a(colorUtility, new int[]{10270, 10285}, new int[]{63, 71});
                return true;
            case 23048:
                a(colorUtility, new int[]{852, 935, 9152, 9015, aU.Op, 9019, 9174}, new int[]{71, 63, 71, 63, 71, 63, 63});
                return true;
            case 23049:
            case 23050:
            case 23051:
            case 23052:
                b(colorUtility, 66);
                return true;
            case 23054:
                colorUtility.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                a(colorUtility, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355}, new int[]{60, 57, 60, 57, 60, 57, 60, 57, 60, 57, 57, 60});
                return true;
            case 23055:
                b(colorUtility, 111);
                return true;
            case 23056:
                a(colorUtility, new int[]{920, 0, 103}, new int[]{111, 73, 111});
                return true;
            case 23057:
            case 25954:
                a(colorUtility, new int[]{65535, 0, 78, 920}, new int[]{73, 73, 111, 73});
                return true;
            case 23058:
                a(colorUtility, new int[]{78, 103, 920, 0}, new int[]{111, 111, 73, 73});
                return true;
            case 23060:
                a(colorUtility, new int[]{86, 0, 103, 82, 90, 78, 66}, new int[]{60, 86, 60, 97, 97, 86, 86});
                colorUtility.g(30, -1);
                colorUtility.g(2);
                return true;
            case 23061:
                a(colorUtility, new int[]{10266, 10258, 10283, 10291, 10275, 10262}, new int[]{60, 60, 86, 86, 60, 86});
                colorUtility.g(30, -1);
                colorUtility.g(2);
                return true;
            case 23062:
                a(colorUtility, new int[]{33690, S3S3TC.GL_RGBA4_DXT5_S3TC, 6067, 68, 51, 39}, new int[]{60, 62, 61, 40, 57, 40});
                return true;
            case 23064:
                a(colorUtility, new int[]{10462, 10448, 127, 10475, 52797, 52919, 51763, 55207, 52777}, new int[]{60, 62, 61, 40, 57, 57, 62, 57, 40});
                return true;
            case 23067:
                a(colorUtility, new int[]{9529, aU.xs}, new int[]{59, 59});
                return true;
            case 23068:
                a(colorUtility, new int[]{9529, aU.xs}, new int[]{62, 62});
                return true;
            case 23069:
                a(colorUtility, new int[]{61, 57, 70, aU.zr, 6930}, new int[]{59, 59, 59, 62, 62});
                return true;
            case 23071:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989}, new int[]{60, 62, 60, 62, 62, 60, 60});
                return true;
            case 23072:
                a(colorUtility, new int[]{61, 924, 916, 932}, new int[]{60, 62, 60, 60});
                return true;
            case 23073:
                a(colorUtility, new int[]{7690}, new int[]{62});
                return true;
            case 23074:
                a(colorUtility, new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{62, 60, 62, 60, 62, 60, 60, 60, 60, 60, 60, 60});
                return true;
            case 23075:
                a(colorUtility, new int[]{35251, 35247, 32856, 32852, 35255, 16462, 17500, 35259, 35264, 22464, 35270, 15434, AMDDeviceAttributeQuery.CL_DEVICE_SIMD_INSTRUCTION_WIDTH_AMD, 16466, 58419, EXTDeviceFission.CL_DEVICE_AFFINITY_DOMAINS_EXT, 54313, 54317, 54309, 54290, 58539, 54302, 54298, 40757, 40637, 37828, 40871}, new int[]{62, 62, 62, 62, 62, 62, 60, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62});
                return true;
            case 23109:
                a(colorUtility, new int[]{33569, 24474}, new int[]{56, 58});
                return true;
            case 23110:
                a(colorUtility, new int[]{43115, 41783, 127}, new int[]{72, 81, 72});
                return true;
            case 23112:
                a(colorUtility, new int[]{929, 918, 924, 935, 24}, new int[]{62, 62, 62, 62, 60});
                return true;
            case 23137:
                colorUtility.a(127, new int[]{1});
                colorUtility.a(90, new int[]{5});
                colorUtility.a(107, new int[]{10});
                colorUtility.a(115, new int[]{15});
                a(colorUtility, new int[]{38333}, new int[]{61});
                return true;
            case 23141:
            case 23142:
            case 23143:
                a(colorUtility, new int[]{EXTTextureInteger.GL_LUMINANCE_ALPHA_INTEGER_EXT, 36133, 37165, 51111, 51133, 10502, 52122, 36257}, new int[]{60, 60, 60, 54, 54, 54, 54, 54});
                return true;
            case 23160:
                a(colorUtility, new int[]{22, 21656, 21656, 18, 16656, 14259}, 80);
                return true;
            case 23162:
            case 23163:
                a(colorUtility, new int[]{960, 6984, 4930, aU.si, 1969}, new int[]{63, 63, 60, 60, 60});
                return true;
            case 23170:
                a(colorUtility, new int[]{37403, aU.DK, 8136, 38672, NVMeshShader.GL_REFERENCED_BY_TASK_SHADER_NV, NVMemoryAttachment.GL_DETACHED_MEMORY_INCARNATION_NV, NVMemoryAttachment.GL_ATTACHED_MEMORY_OFFSET_NV, 38424, NVMeshShader.GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV, 37526, 62371, 62375, 7872, 7995, 6978, 7991, 7110, 13, 63405, 63411}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(311770);
                colorUtility.g(0, -1);
                return true;
            case 23172:
                colorUtility.b(new int[]{10266, 21662, 10270, 10274, 10280, 10282, 9402, 10288, 10284, 10277, 10296, 10291, 10262, 21657, 7176, 11320, 7217, 11333, 11343, 7208}, new int[]{54, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 54});
                colorUtility.g(3);
                colorUtility.g(0, -1);
                return true;
            case 23174:
                a(colorUtility, new int[]{52, 103, 1945, 50, 42, 162, 5301, 5293, 10281}, new int[]{2, 60, 5, 2, 2, 2, 2, 60, 60});
                colorUtility.g(0, -1);
                return true;
            case 23175:
                colorUtility.a(20, new int[]{7});
                a(colorUtility, new int[]{aU.GZ, 8417}, new int[]{52, 52});
                return true;
            case 23180:
                a(colorUtility, new int[]{22447, 22451, 22457, 906, 898, 910, 908, 904, 902}, new int[]{61, 61, 61, 61, 61, 62, 61, 62, 61});
                return true;
            case 23202:
                colorUtility.a(24, new int[]{1});
                colorUtility.a(16, new int[]{1});
                colorUtility.a(33, new int[]{1});
                colorUtility.a(41, new int[]{1});
                colorUtility.a(61, new int[]{62});
                colorUtility.a(20, new int[]{1});
                colorUtility.a(28, new int[]{1});
                colorUtility.a(37, new int[]{1});
                colorUtility.b(new int[]{1}, 10);
                a(colorUtility, new int[]{aU.iS, 796, 784, 536, 78, 49, 62}, new int[]{61, 61, 61, 61, 61, 53, 53});
                return true;
            case 23203:
                a(colorUtility, new int[]{5231, 0}, new int[]{75, 60});
                return true;
            case 23205:
                a(colorUtility, new int[]{933, 10351}, new int[]{68, 60});
                return true;
            case 23206:
                if (colorUtility != null) {
                    colorUtility.a(8741, new int[]{3});
                }
                if (colorUtility != null) {
                    colorUtility.a(7281, new int[]{15, 16, 17});
                }
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{28318, 8078, 4550}, new int[]{61, 60, 60});
                return true;
            case 23207:
                if (colorUtility != null) {
                    colorUtility.a(4626, new int[]{3});
                }
                if (colorUtility != null) {
                    colorUtility.a(908, new int[]{3});
                }
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{25238}, new int[]{60});
                return true;
            case 23208:
                if (colorUtility != null) {
                    colorUtility.a(22412, new int[]{3, 4});
                }
                if (colorUtility != null) {
                    colorUtility.a(26520, new int[]{10, 11, 12});
                }
                if (colorUtility != null) {
                    colorUtility.a(25490, new int[]{15, 16, 17});
                }
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{90}, new int[]{97});
                return true;
            case 23209:
                a(colorUtility, new int[]{6963, 6959, 7083, 7073, 2700, 7081, 21539, 10266}, new int[]{68, 68, 68, 60, 76, 76, 76, 76});
                return true;
            case 23210:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(12, new int[]{1});
                colorUtility.a(0, new int[]{10});
                a(colorUtility, new int[]{127, 107}, new int[]{61, 61});
                return true;
            case 23211:
            case 23212:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(12, new int[]{1});
                colorUtility.a(0, new int[]{10});
                a(colorUtility, new int[]{16}, new int[]{61});
                return true;
            case 23213:
            case 23214:
            case 23215:
            case 23216:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(11200, new int[]{3});
                colorUtility.a(19367, new int[]{3});
                colorUtility.a(11177, new int[]{8, 9});
                colorUtility.a(9917, new int[]{3, 4});
                a(colorUtility, new int[]{939}, new int[]{61});
                return true;
            case 23217:
                a(colorUtility, new int[]{61, 8757}, new int[]{110, 60});
                return true;
            case 23218:
                a(colorUtility, new int[]{926, 10349, 0, 127}, new int[]{61, 60, 60, 60});
                return true;
            case 23219:
                a(colorUtility, new int[]{926}, new int[]{61});
                return true;
            case 23222:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(61, new int[]{3, 4});
                colorUtility.a(82, new int[]{3, 4});
                a(colorUtility, new int[]{8757, 22459, 82, 926, aU.xw}, new int[]{68, 68, 68, 68, 68});
                colorUtility.g(0, -1);
                return true;
            case 23223:
                colorUtility.a(22410, new int[]{40});
                a(colorUtility, new int[]{G.fb}, new int[]{68});
                colorUtility.g(0, -1);
                return true;
            case 23224:
                colorUtility.a(12, new int[]{1});
                a(colorUtility, new int[]{127, 107, 0}, new int[]{61, 61, 60});
                return true;
            case 23225:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{60, 68, 60, 68, 68, 60, 60, 60, 60});
                return true;
            case 23228:
                b(colorUtility, 53);
                return true;
            case 23229:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ACCESS_NONE, 16425, 14490}, 68);
                return true;
            case 23460:
                colorUtility.b(new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 8128, 7093}, new int[]{60, 62, 62, 60});
                return true;
            case 23462:
                colorUtility.a(aU.Dz, new int[]{16});
                a(colorUtility, new int[]{43059, 8128, 13248}, new int[]{53, 53, 53});
                return true;
            case 23465:
                colorUtility.a(71, new int[]{1});
                colorUtility.a(72, new int[]{1});
                colorUtility.a(97, new int[]{3});
                colorUtility.a(98, new int[]{22});
                colorUtility.a(88, new int[]{127});
                colorUtility.a(89, new int[]{127});
                a(colorUtility, new int[]{3, 22}, new int[]{60, 60});
                colorUtility.g(0, -1);
                return true;
            case 23466:
                colorUtility.a(7721, new int[]{127});
                colorUtility.a(20, new int[]{1});
                colorUtility.a(0, new int[]{127});
                colorUtility.a(6932, new int[]{3});
                colorUtility.g(0, -1);
                return true;
            case 23467:
                colorUtility.a(20, new int[]{7114});
                colorUtility.a(6932, new int[]{7114});
                return true;
            case 23468:
                colorUtility.a(7721, new int[]{1});
                colorUtility.a(20, new int[]{7114});
                colorUtility.a(0, new int[]{127});
                colorUtility.a(6932, new int[]{7114});
                a(colorUtility, new int[]{7114}, new int[]{54});
                return true;
            case 23471:
                colorUtility.a(33001, new int[]{9});
                colorUtility.a(6430, new int[]{9});
                colorUtility.a(6435, new int[]{29});
                colorUtility.a(6439, new int[]{29});
                colorUtility.a(6315, new int[]{29});
                colorUtility.a(6554, new int[]{29});
                a(colorUtility, new int[]{32995, 9}, new int[]{76, 105});
                return true;
            case 23472:
                colorUtility.a(6439, new int[]{3});
                colorUtility.a(6323, new int[]{2});
                colorUtility.a(33001, new int[]{3, 4, 5, 6, 7});
                a(colorUtility, new int[]{3, 4, 5, 6, 7}, new int[]{76, 60, 60, 105, 60});
                return true;
            case 23474:
                colorUtility.a(new int[]{aU.hs, 152}, new int[]{13});
                colorUtility.a(new int[]{User32.WM_SYSCHAR, 167, 0, 980, 962, User32.WM_INITDIALOG, 582, 158}, new int[]{5});
                colorUtility.a(new int[]{955}, new int[]{1});
                colorUtility.a(new int[]{65459, 43968, 20288}, new int[]{380770});
                colorUtility.b(new int[]{846, aU.hI, 945}, new int[]{74, 74, 54});
                return true;
            case 23478:
                colorUtility.a(new int[]{5, 15, 25});
                return true;
            case 23479:
                colorUtility.a(new int[]{33001});
                return true;
            case 23480:
                colorUtility.g(45000);
                return true;
            case 23481:
                colorUtility.g(64);
                return true;
            case 23482:
                colorUtility.g(6100);
                return true;
            case 23483:
                colorUtility.g(58000);
                return true;
            case 23485:
                a(colorUtility, new int[]{10283, 8377, 24, 7333, aU.GT}, new int[]{57, 57, 57, 57, 57});
                return true;
            case 23486:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(35, new int[]{12});
                colorUtility.a(72, new int[]{3});
                colorUtility.a(76, new int[]{6});
                colorUtility.a(8635, new int[]{22});
                a(colorUtility, new int[]{8636, 73, 77, 80, 36, 0, aU.Lu, 68, 8644, 8646, 55, 119, 123}, new int[]{57, 57, 57, 60, 60, 76, 60, 57, 57, 40, 57, 57});
                return true;
            case 23487:
            case 23488:
            case 23489:
                a(colorUtility, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, 57);
                return true;
            case 23490:
                colorUtility.a(71, new int[]{1});
                colorUtility.a(72, new int[]{1});
                colorUtility.a(97, new int[]{3});
                colorUtility.a(98, new int[]{22});
                colorUtility.a(88, new int[]{4});
                colorUtility.a(89, new int[]{4});
                a(colorUtility, new int[]{3, 22, 4}, new int[]{57, 57, 57});
                return true;
            case 23491:
                a(colorUtility, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935}, new int[]{102, 109, 109, 109, 109, 109, 109, 102, 102, 102, 102, 81});
                return true;
            case 23492:
                colorUtility.a(43113, new int[]{4});
                colorUtility.a(43092, new int[]{4});
                colorUtility.a(43121, new int[]{4});
                colorUtility.a(43117, new int[]{4});
                colorUtility.a(43096, new int[]{4});
                a(colorUtility, new int[]{4}, new int[]{93});
                return true;
            case 23493:
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{10351}, new int[]{139});
                return true;
            case 23494:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{109, 102, 102, 102, 109, 109});
                return true;
            case 23621:
            case 26108:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(6583, new int[]{6});
                colorUtility.a(aU.Ap, new int[]{8, 7, 6});
                colorUtility.a(6587, new int[]{6, 5, 4});
                colorUtility.a(6464, new int[]{4});
                colorUtility.a(60065, new int[]{4});
                colorUtility.a(60184, new int[]{4});
                a(colorUtility, new int[]{4, 5, 6, 7, 8}, new int[]{51, 51, 60, 60, 51});
                return true;
            case 23622:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(6583, new int[]{6});
                colorUtility.a(aU.Ap, new int[]{8, 7, 6});
                colorUtility.a(6587, new int[]{6, 5, 4});
                colorUtility.a(6464, new int[]{4});
                colorUtility.a(60065, new int[]{4});
                colorUtility.a(60184, new int[]{4});
                a(colorUtility, new int[]{4, 5, 6, 7, 8}, new int[]{61, 61, 60, 60, 61});
                return true;
            case 23624:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(23);
                colorUtility.b(new int[]{23}, new int[]{74});
                return true;
            case 23625:
            case 27525:
            case 27526:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{aU.zv, 4882, 54177}, new int[]{76, 157, 172});
                return true;
            case 23626:
            case 27529:
            case 27530:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{10283, aU.Ck}, new int[]{157, 60});
                return true;
            case 23627:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(22024, new int[]{374390});
                colorUtility.a(21776, new int[]{905});
                colorUtility.a(22402, new int[]{905});
                colorUtility.b(new int[]{905, 904, 929, 103, 910, 374390}, new int[]{54, 54, 54, 54, 74, 148});
                return true;
            case 23628:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(22024, new int[]{47627});
                colorUtility.a(21776, new int[]{905});
                colorUtility.a(22402, new int[]{905});
                colorUtility.b(new int[]{905, 904, 929, 103, 910, 47627}, new int[]{52, 52, 52, 52, 63, 179});
                return true;
            case 23629:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(22024, new int[]{127});
                colorUtility.a(21776, new int[]{905});
                colorUtility.a(22402, new int[]{905});
                colorUtility.b(new int[]{905, 904, 929, 103, 910, 127}, new int[]{60, 60, 60, 60, 97, 254});
                colorUtility.g(0, -1);
                return true;
            case 23630:
            case 27531:
            case 27532:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{10283, aU.Ck}, new int[]{159, 76});
                return true;
            case 23631:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(23);
                colorUtility.a(23, new int[]{24, 23});
                colorUtility.b(new int[]{23, 24}, new int[]{157, 60});
                return true;
            case 23632:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(23);
                colorUtility.a(23, new int[]{24, 23});
                colorUtility.b(new int[]{23, 24}, new int[]{159, 76});
                return true;
            case 23633:
                a(colorUtility, new int[]{6464, 25129}, new int[]{152, 172});
                return true;
            case 23635:
                a(colorUtility, new int[]{43059}, new int[]{124});
                return true;
            case 23636:
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{10351}, new int[]{131});
                return true;
            case 23637:
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{10351}, new int[]{76});
                return true;
            case 23638:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(23);
                colorUtility.a(23, new int[]{24, 23});
                colorUtility.b(new int[]{23, 24}, new int[]{124, 102});
                return true;
            case 23650:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{102, 124, 118, 124, 102, 118, 102, 124, 124});
                return true;
            case 23651:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(23);
                colorUtility.a(23, new int[]{24, 23});
                colorUtility.b(new int[]{23, 24}, new int[]{156, 102});
                return true;
            case 23652:
                a(colorUtility, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{102, 156, 118, 156, 102, 118, 102, 156, 156});
                return true;
            case 23653:
                a(colorUtility, new int[]{5318}, new int[]{142});
                return true;
            case 23654:
                a(colorUtility, new int[]{926}, new int[]{156});
                return true;
            case 23655:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(0, new int[]{1});
                colorUtility.a(24, new int[]{1});
                colorUtility.a(37, new int[]{1});
                a(colorUtility, new int[]{49, 66, 19379, 26537, 128, 104, 87}, new int[]{194, 194, 60, 60, 58, 58, 58});
                return true;
            case 23656:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(0, new int[]{1});
                colorUtility.a(24, new int[]{1});
                colorUtility.a(37, new int[]{1});
                a(colorUtility, new int[]{49, 66, 19379, 26537, 127, 103, 86}, new int[]{156, 156, 60, 60, 139, 139, 139});
                return true;
            case 23657:
            case 23658:
            case 23659:
                colorUtility.i(7114);
                return true;
            case 23660:
            case 23661:
            case 23662:
                a(colorUtility, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411, 960}, new int[]{93, 93, 93, 93, 93, 93, 93, 93, 93, aU.hu_});
                return true;
            case 23663:
            case 23664:
            case 23665:
                colorUtility.a(8741, new int[]{25092});
                colorUtility.a(25238, new int[]{25092});
                colorUtility.a(38814, new int[]{25092});
                colorUtility.a(24, new int[]{37642});
                a(colorUtility, new int[]{37642}, new int[]{156});
                return true;
            case 23666:
                colorUtility.a(40, new int[]{aU.hu_});
                colorUtility.a(924, new int[]{12});
                colorUtility.a(6032, new int[]{34});
                return true;
            case 23905:
                a(colorUtility, new int[]{933, 10351}, new int[]{156, 102});
                return true;
            case 23906:
                colorUtility.a(6674, new int[]{25092});
                colorUtility.a(6430, new int[]{25092});
                colorUtility.a(6554, new int[]{25092});
                colorUtility.a(6550, new int[]{25092});
                a(colorUtility, new int[]{18}, new int[]{156});
                return true;
            case 23907:
                a(colorUtility, new int[]{61, 8757}, new int[]{213, 60});
                return true;
            case 23908:
                a(colorUtility, new int[]{54298, 54298, 54817, 16, 12, 54302, 54294, 54290, 54298, 54817, 16, -11234, -11242, -11246, -11238, -10719}, new int[]{213, 213, 213, 102, 60, 61, 102, 102, 102, 102, 213, 213, 102, 102, 213, 213});
                return true;
            case 23909:
                a(colorUtility, new int[]{59449, 43294, 43311, 59437, 43088, 43105, 6736, 43096, 6736, aU.Br, 59449, aU.An, 43294, 43311, GL11.GL_INDEX_SHIFT, 6699, 59437, 43088, 43105, 7124}, new int[]{213, 213, 213, 61, 213, 213, 61, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102});
                return true;
            case 23910:
                a(colorUtility, new int[]{284, 960, 939, 53, 33, 12, 28, 284, 417, aU.iN_, 20, 960, 939}, new int[]{213, 213, 213, 102, 102, 61, 102, 102, 102, 102, 102, 102, 102});
                return true;
            case 23930:
                colorUtility.a(0, new int[]{5});
                colorUtility.a(8, new int[]{461745});
                colorUtility.a(20, new int[]{461745});
                colorUtility.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{461745});
                colorUtility.g(-10, -1);
                return true;
            case 23932:
                a(colorUtility, new int[]{7613, 7596, 133, 151, 35868, 35895, 35912, 35865, 35882, 35875, 35888, 35905, 35856, 35873, 35866, 6303, 35879, 35840, 35862, 35855, 6317, 35886, 6292, aU.jD, aU.jP, aU.jw, 1097, 54, 49, 39, 32, 64, 59, 45, 31, 6297, 40, 50, 85, 23, 6302, EXTPackedFloat.GL_RGBA_SIGNED_COMPONENTS_EXT}, new int[]{111, 111, 111, 111, 60, 60, 60, 111, 60, 60, 111, 60, 60, 111, 60, 111, 60, 60, 60, 60, 111, 60, 111, 111, 111, 111, 60, 111, 60, 60, 60, 60, 60, 60, 60, 111, 111, 111, 111, 111, 111, 60});
                return true;
            case 23933:
                colorUtility.b(new int[]{256, 256, 71, 71, 71});
                return true;
            case 23934:
                colorUtility.a(5231, new int[]{3, 4});
                a(colorUtility, new int[]{3, 4, 0}, new int[]{60, 57, 60});
                return true;
            case 23935:
            case 23936:
            case 23937:
            case 23938:
            case 23939:
                colorUtility.a(127, new int[]{6});
                colorUtility.a(111, new int[]{4});
                colorUtility.a(0, new int[]{930});
                colorUtility.a(aU.iP_, new int[]{g.r});
                colorUtility.a(563, new int[]{930});
                colorUtility.a(aU.jc_, new int[]{915});
                colorUtility.a(43456, new int[]{8});
                colorUtility.a(10948, new int[]{11});
                colorUtility.a(43445, new int[]{10});
                colorUtility.a(43462, new int[]{7});
                colorUtility.a(21941, new int[]{6});
                colorUtility.a(21956, new int[]{5});
                colorUtility.a(11059, new int[]{14});
                colorUtility.a(10939, new int[]{14});
                colorUtility.a(21947, new int[]{11});
                colorUtility.a(8, new int[]{905});
                colorUtility.a(16, new int[]{910});
                return true;
            case 23940:
                colorUtility.a(78, new int[]{925});
                colorUtility.a(5790, new int[]{2});
                return true;
            case 23941:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(23);
                colorUtility.b(new int[]{23}, new int[]{261});
                return true;
            case 23942:
                a(colorUtility, new int[]{933, 10351}, new int[]{261, 258});
                return true;
            case 23943:
                a(colorUtility, new int[]{926, 10349, 0, 127}, new int[]{261, 258, 258, 258});
                return true;
            case 23944:
                a(colorUtility, new int[]{926}, new int[]{261});
                return true;
            case 23950:
                colorUtility.a(new int[]{20}, new int[]{1, 1, 1, 1, 2, 2, 2});
                colorUtility.b(new int[]{1, 2, 28, 127}, new int[]{User32.WM_SYSCHAR, 120, 140, 140});
                return true;
            case 23952:
                colorUtility.a(new int[]{163, 167, 138, 70}, new int[]{aU.nV});
                colorUtility.a(new int[]{158, 154, 26, 30, 53, 61, 35}, new int[]{aU.nW});
                colorUtility.a(new int[]{66, 57}, new int[]{1339});
                colorUtility.b(new int[]{aU.nV, aU.nW, 1339}, new int[]{120, User32.WM_SYSCHAR, 140});
                return true;
            case 23953:
                a(colorUtility, new int[]{5813, 26006, 9139}, new int[]{60, 59, 59});
                return true;
            case 23954:
                colorUtility.g(23);
                colorUtility.g(0, -1);
                return true;
            case 23955:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{16425, 14490, CL12.CL_KERNEL_ARG_ACCESS_NONE, 7349, 8361}, new int[]{261, 261, 68, 68, 68});
                return true;
            case 23956:
                colorUtility.a(new int[]{G.aJ, G.aN, G.aV, G.aF}, new int[]{1});
                colorUtility.a(new int[]{3235, 3239, 3230, 3243, 43074, 43090}, new int[]{2});
                colorUtility.b(new int[]{1, 2}, new int[]{261, 186});
                return true;
            case 23958:
                a(colorUtility, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451, 20416}, new int[]{57, 60, 57, 60, 57, 60, 60, 62});
                return true;
            case 23959:
                a(colorUtility, new int[]{6573, 410, 33300, 33676, 33036}, new int[]{57, 60, 60, 60, 57});
                return true;
            case 23960:
                a(colorUtility, new int[]{10279, 127, 11}, new int[]{60, 57, 57});
                return true;
            case 23961:
                colorUtility.a(new int[]{2, 1, 2});
                a(colorUtility, new int[]{1, 2}, new int[]{57, 60});
                return true;
            case 23962:
            case 23963:
                a(colorUtility, new int[]{10165, 10176, 9812, 22451, 36007, 6573, 410, 33300, 33676}, new int[]{57, 57, 57, 57, 57, 57, 60, 60, 60});
                return true;
            case 23964:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{57, 57, 57, 60, 60, 60});
                return true;
            case 23965:
            case 23971:
            case 23977:
                b(colorUtility, 163);
                return true;
            case 23966:
            case 23972:
            case 23978:
                b(colorUtility, 56);
                return true;
            case 23967:
            case 23973:
            case 23979:
                b(colorUtility, 221);
                return true;
            case 23968:
            case 23974:
            case 23980:
                b(colorUtility, 63);
                return true;
            case 23969:
            case 23975:
            case 23981:
                b(colorUtility, 206);
                return true;
            case 23970:
            case 23976:
            case 23982:
                b(colorUtility, 71);
                return true;
            case 23984:
            case 27527:
            case 27528:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{aU.zv, 4882, 54177}, new int[]{aU.hq_, 159, 159});
                return true;
            case 23988:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(22024, new int[]{127, 126});
                colorUtility.a(21776, new int[]{905});
                colorUtility.a(22402, new int[]{905});
                colorUtility.b(new int[]{905, 904, 929, 103, 910, 127, 126}, new int[]{259, 259, 259, 259, 259, 197, 197});
                colorUtility.g(0, -1);
                return true;
            case 24023:
            case 24024:
                colorUtility.a(61, new int[]{62});
                if (i != 24024) {
                    a(colorUtility, new int[]{aU.iS, 796, 784, 536, 49, 62}, new int[]{58, 58, 58, 58, 58, 58});
                    return true;
                }
                colorUtility.a(24, new int[]{1});
                colorUtility.a(16, new int[]{1});
                colorUtility.a(33, new int[]{1});
                colorUtility.a(41, new int[]{1});
                colorUtility.a(20, new int[]{aU.iS});
                colorUtility.a(28, new int[]{1});
                colorUtility.a(37, new int[]{1});
                colorUtility.b(new int[]{1}, 10);
                a(colorUtility, new int[]{aU.iS, 796, 784, 536, 78, 49, 62}, new int[]{140, 140, 140, 140, 140, 140, 140});
                return true;
            case 24025:
                colorUtility.b(new int[]{61}, new int[]{140});
                return true;
            case 24042:
            case 24043:
                colorUtility.a(0, new int[]{34770, 380770, 380770, 34770, 34770, 380770});
                colorUtility.a(8, new int[]{380770});
                colorUtility.a(20, new int[]{34770});
                colorUtility.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{380770});
                if (i != 24043) {
                    return true;
                }
                colorUtility.b(new int[]{380770, 34770}, new int[]{72, 55});
                return true;
            case 24049:
                colorUtility.a(914, new int[]{350770});
                colorUtility.a(918, new int[]{350770});
                colorUtility.a(934, new int[]{350770});
                return true;
            case 24069:
            case 24076:
                a(colorUtility, new int[]{21, 24, 12, 941}, new int[]{60, 54, 60, 54});
                return true;
            case 24070:
            case 24071:
            case 24077:
            case 24078:
                a(colorUtility, new int[]{12, 0, 28, 941, 943, 406, User32.WM_EXITMENULOOP, 280, 148, 152}, new int[]{54, 54, 54, 60, 60, 60, 54, 54, 54, 54});
                return true;
            case 24072:
            case 24074:
            case 28046:
                a(colorUtility, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24}, new int[]{54, 60, 54, 60, 54, 60, 54, 60, 60, 60, 60, 60, 54});
                return true;
            case 24073:
            case 24075:
            case 28047:
                a(colorUtility, new int[]{21563, 21580, 21559, 33678, 21555, 28, 82}, new int[]{60, 54, 60, 60, 60, 54, 54});
                return true;
            case 24079:
            case 24080:
            case 24081:
            case 24082:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(14395, new int[]{7, 8, 9});
                a(colorUtility, new int[]{14387, 127, 85}, new int[]{54, 54, 54});
                return true;
            case 24083:
                colorUtility.a(61, new int[]{7, 8, 9});
                a(colorUtility, new int[]{7, 8, 9, 8757}, new int[]{54, 60, 60, 60});
                return true;
            case 24093:
                colorUtility.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                a(colorUtility, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355}, new int[]{60, 53, 60, 53, 60, 53, 60, 53, 60, 53, 53, 60});
                return true;
            case 24095:
                a(colorUtility, new int[]{7079, 8111, 8107}, new int[]{53, 61, 61});
                return true;
            case 24100:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(12, new int[]{6});
                colorUtility.a(90, new int[]{6});
                colorUtility.a(85, new int[]{6});
                colorUtility.a(70, new int[]{4});
                colorUtility.a(61, new int[]{4});
                colorUtility.a(53, new int[]{4});
                colorUtility.a(45, new int[]{4});
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 74, aU.Dn, 88, 78}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 54});
                return true;
            case 24101:
            case 24102:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(12, new int[]{6});
                colorUtility.a(aU.Dn, new int[]{18});
                colorUtility.a(90, new int[]{12});
                colorUtility.a(85, new int[]{6});
                colorUtility.a(78, new int[]{4});
                colorUtility.a(74, new int[]{4});
                colorUtility.a(61, new int[]{4});
                colorUtility.a(53, new int[]{4});
                colorUtility.a(45, new int[]{4});
                colorUtility.a(0, new int[]{1});
                a(colorUtility, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 70}, new int[]{54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54});
                return true;
            case 24110:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.b(new int[]{5525, 5401, 5405, 4013, aU.xy, 4009, 3889, 5648, GL11.GL_NORMALIZE, 4783, 4665, 4903, 43086, 43094, 4669, 4674, aU.xm, 5840, 5832, 4653, aU.vU, 3881, 3757, 3761, aU.vQ, aU.vS, 4785, 4779, 3982, 4657, aU.Bz, aU.Bv, aU.Br, 3885, 4649, aU.BE, 4661, 4781, KHRCommandBuffer.CL_DEVICE_COMMAND_BUFFER_CAPABILITIES_KHR, 3765}, new int[]{104, 132, 132, 132, 132, 132, 132, 128, 128, 55, 128, 55, 132, 132, 132, 132, 132, 104, 132, 128, 55, 128, 128, 132, 132, 132, 132, 132, 55, 55, 55, 55, 55, 128, 55, 128, 81, 128, 128, 128});
                colorUtility.h(37226);
                return true;
            case 24114:
                a(colorUtility, new int[]{GL11.GL_INDEX_SHIFT, aU.yp, 6084, 8134, 37, aU.pU, 82, 7834, aU.nF, 24, 20, 7700}, new int[]{72, 55, 55, 72, 55, 72, 55, 72, 72, 72, 72, 72});
                return true;
            case 24115:
                colorUtility.a(35, new int[]{36172});
                colorUtility.a(72, new int[]{59728});
                colorUtility.a(76, new int[]{59708});
                colorUtility.a(8635, new int[]{59728});
                colorUtility.a(68, new int[]{59708});
                a(colorUtility, new int[]{8636, 73, 77, 80, 36, 0, aU.Lu, 68, 8644, 8646, 55, 119, 123}, new int[]{132, 132, 132, 132, 132, 72, 132, 132, 132, 132, 132, 132});
                return true;
            case 24116:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(107, new int[]{7646});
                colorUtility.a(910, new int[]{AMDPinnedMemory.GL_EXTERNAL_VIRTUAL_MEMORY_BUFFER_AMD});
                colorUtility.a(912, new int[]{37212});
                colorUtility.a(aU.tL, new int[]{37222});
                colorUtility.a(1938, new int[]{37212});
                colorUtility.a(1690, new int[]{37212});
                colorUtility.a(43908, new int[]{37162});
                return true;
            case 24117:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(12, new int[]{7896});
                colorUtility.a(8, new int[]{7886});
                colorUtility.a(4, new int[]{7876});
                colorUtility.a(8412, new int[]{59738});
                colorUtility.a(g.r, new int[]{59738});
                colorUtility.a(0, new int[]{7646});
                colorUtility.a(898, new int[]{7646});
                colorUtility.a(55207, new int[]{59738});
                return true;
            case 24118:
                colorUtility.a(9127, new int[]{36202});
                colorUtility.a(14990, new int[]{59755});
                colorUtility.a(14746, new int[]{59765});
                colorUtility.a(14742, new int[]{59735});
                colorUtility.a(14622, new int[]{59765});
                colorUtility.a(962, new int[]{59705});
                colorUtility.a(14866, new int[]{59755});
                return true;
            case 24119:
            case 24120:
            case 24121:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(929, new int[]{7896});
                colorUtility.a(914, new int[]{7616});
                colorUtility.a(2954, new int[]{7606});
                colorUtility.a(127, new int[]{126});
                return true;
            case 24122:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(23);
                colorUtility.a(23, new int[]{24, 23});
                colorUtility.b(new int[]{23, 24}, new int[]{256, 259});
                return true;
            case 24123:
                a(colorUtility, new int[]{926}, new int[]{259});
                return true;
            case 24124:
                a(colorUtility, new int[]{933, 10351}, new int[]{259, 256});
                return true;
            case 24125:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(7646);
                return true;
            case 24126:
                colorUtility.a(7335, new int[]{36172});
                colorUtility.a(aU.hm_, new int[]{59724});
                colorUtility.a(7343, new int[]{59724});
                colorUtility.a(5165, new int[]{59724});
                colorUtility.a(7376, new int[]{36172});
                colorUtility.a(7339, new int[]{59724});
                colorUtility.a(5161, new int[]{36172});
                colorUtility.a(5169, new int[]{59724});
                colorUtility.a(910, new int[]{36172});
                colorUtility.a(65535, new int[]{36172});
                return true;
            case 24127:
                colorUtility.a(7343, new int[]{59734});
                colorUtility.a(5165, new int[]{36172});
                colorUtility.a(7339, new int[]{36172});
                colorUtility.a(5161, new int[]{36172});
                colorUtility.a(5169, new int[]{59744});
                colorUtility.a(910, new int[]{36172});
                colorUtility.a(65535, new int[]{36172});
                a(colorUtility, new int[]{7335, aU.hm_, 7376}, new int[]{72, 72, 72});
                return true;
            case 24128:
                a(colorUtility, new int[]{7335, aU.hm_, 7343, 5165, 7376, 7339, 5161, 5169, 910, 65535}, new int[]{55, 72, 55, 72, 55, 72, 55, 72, 55, 72});
                return true;
            case 24130:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(7073, new int[]{36192});
                colorUtility.a(61, new int[]{59724});
                colorUtility.a(43117, new int[]{59724});
                return true;
            case 24131:
                if (colorUtility != null) {
                    colorUtility.a(43117, new int[]{59954});
                    colorUtility.a(61, new int[]{59724});
                    colorUtility.a(7073, new int[]{5, 6});
                }
                a(colorUtility, new int[]{5, 6}, new int[]{55, 72});
                return true;
            case 24132:
                a(colorUtility, new int[]{7073, 43117}, new int[]{55, 72});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(61, new int[]{59724});
                return true;
            case 24133:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(33, new int[]{36192});
                colorUtility.a(37, new int[]{59724});
                colorUtility.a(24, new int[]{36192});
                colorUtility.a(922, new int[]{59724});
                colorUtility.a(933, new int[]{36192});
                return true;
            case 24134:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(922, new int[]{36192});
                a(colorUtility, new int[]{933, 33, 37, 24}, new int[]{55, 55, 55, 55});
                return true;
            case 24135:
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{933, 33, 37, 24, 922}, new int[]{72, 72, 72, 72, 55});
                return true;
            case 24139:
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{55772, 55733, 33, 57, 37, 49, 61}, new int[]{55, 55, 72, 72, 72, 72, 72});
                colorUtility.a(9026, new int[]{36192});
                colorUtility.a(8406, new int[]{59724});
                return true;
            case 24171:
                a(colorUtility, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{66, 66, 66, 66, 96, 96});
                return true;
            case 24176:
            case 24177:
            case 24178:
                colorUtility.a(8, new int[]{10});
                colorUtility.a(12, new int[]{12});
                colorUtility.a(16, new int[]{19});
                colorUtility.a(new int[]{43059, 43067, EXTTextureInteger.GL_LUMINANCE_INTEGER_EXT, 43049}, new int[]{15});
                a(colorUtility, new int[]{EXTTextureInteger.GL_LUMINANCE_ALPHA_INTEGER_EXT, 36133, 37165, 51111, 51133, 10502, 52122, 36257, 20}, new int[]{140, 60, 140, 60, 140, 60, 60, 60, 140});
                return true;
            case 24179:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 8128, 7093}, new int[]{53, 55, 55, 53});
                return true;
            case 24180:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER}, new int[]{74, 74});
                return true;
            case 24181:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 8128, 7093}, new int[]{55, 89, 89, 55});
                return true;
            case 24183:
                a(colorUtility, new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 8128, 7093}, new int[]{22, 71, 71, 22});
                return true;
            case 24188:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{91, 115, 115, 115, 91, 91});
                return true;
            case 24189:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{86, 130, 130, 130, 86, 86});
                return true;
            case 24190:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{256, 191, 191, 191, 256, 256});
                return true;
            case 24191:
                a(colorUtility, new int[]{42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL}, new int[]{134, 263, 263, 263, 134, 134});
                return true;
            case 24192:
            case 24193:
                colorUtility.a(61, new int[]{7, 8, 9});
                a(colorUtility, new int[]{7, 8, 9, 8757}, new int[]{60, 54, 60, 54});
                return true;
            case 24194:
                colorUtility.a(914, new int[]{350770});
                colorUtility.a(918, new int[]{350770});
                colorUtility.a(934, new int[]{350770});
                a(colorUtility, new int[]{922, 929, 350770}, new int[]{60, 60, 54});
                return true;
            case 24195:
                colorUtility.a(43113, new int[]{4});
                colorUtility.a(43092, new int[]{4});
                colorUtility.a(43121, new int[]{4});
                colorUtility.a(43117, new int[]{4});
                colorUtility.a(43096, new int[]{4});
                a(colorUtility, new int[]{4, 41372, 43328, 41257}, new int[]{60, 54, 54, 54});
                return true;
            case 24204:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(43164, new int[]{15});
                colorUtility.a(43061, new int[]{3});
                colorUtility.a(43053, new int[]{3});
                colorUtility.a(43026, new int[]{3});
                colorUtility.a(aU.yn, new int[]{902});
                colorUtility.a(3008, new int[]{950});
                colorUtility.a(24, new int[]{950});
                colorUtility.a(576, new int[]{920});
                colorUtility.a(aU.jz_, new int[]{902});
                colorUtility.a(aU.gT, new int[]{905});
                colorUtility.a(aU.hj, new int[]{920});
                colorUtility.a(aU.gX, new int[]{920});
                colorUtility.a(aU.gD, new int[]{920});
                a(colorUtility, new int[]{950}, new int[]{113});
                return true;
            case 24205:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(43164, new int[]{15});
                colorUtility.a(43061, new int[]{3});
                colorUtility.a(43053, new int[]{3});
                colorUtility.a(43026, new int[]{3});
                colorUtility.a(aU.yn, new int[]{902});
                colorUtility.a(3008, new int[]{950});
                colorUtility.a(24, new int[]{950});
                colorUtility.a(576, new int[]{920});
                colorUtility.a(aU.jz_, new int[]{902});
                colorUtility.a(aU.gT, new int[]{905});
                colorUtility.a(aU.hj, new int[]{920});
                colorUtility.a(aU.gX, new int[]{920});
                colorUtility.a(aU.gD, new int[]{920});
                a(colorUtility, new int[]{950}, new int[]{136});
                return true;
            case 24206:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(43164, new int[]{15});
                colorUtility.a(43061, new int[]{3});
                colorUtility.a(43053, new int[]{3});
                colorUtility.a(43026, new int[]{3});
                colorUtility.a(aU.yn, new int[]{902});
                colorUtility.a(3008, new int[]{950});
                colorUtility.a(24, new int[]{950});
                colorUtility.a(576, new int[]{920});
                colorUtility.a(aU.jz_, new int[]{902});
                colorUtility.a(aU.gT, new int[]{905});
                colorUtility.a(aU.hj, new int[]{920});
                colorUtility.a(aU.gX, new int[]{920});
                colorUtility.a(aU.gD, new int[]{920});
                a(colorUtility, new int[]{950}, new int[]{138});
                return true;
            case 24207:
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(43164, new int[]{15});
                colorUtility.a(43061, new int[]{3});
                colorUtility.a(43053, new int[]{3});
                colorUtility.a(43026, new int[]{3});
                colorUtility.a(aU.yn, new int[]{902});
                colorUtility.a(3008, new int[]{950});
                colorUtility.a(24, new int[]{950});
                colorUtility.a(576, new int[]{920});
                colorUtility.a(aU.jz_, new int[]{902});
                colorUtility.a(aU.gT, new int[]{905});
                colorUtility.a(aU.hj, new int[]{920});
                colorUtility.a(aU.gX, new int[]{920});
                colorUtility.a(aU.gD, new int[]{920});
                a(colorUtility, new int[]{950}, new int[]{283});
                return true;
            case 24221:
                if (colorUtility != null) {
                    colorUtility.g(0, -1);
                }
                a(colorUtility, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{70, 70, 70, 70, 70, 60, 60, 70, 60});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(925);
                return true;
            case 24225:
                if (colorUtility != null) {
                    colorUtility.g(50, -1);
                }
                a(colorUtility, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{70, 70, 70, 70, 70, 60, 60, 70, 60});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(127);
                return true;
            case 24236:
            case 24237:
            case 28790:
            case 28791:
                colorUtility.a(0, new int[]{350770, 933, 933, 350770, 350770, 933});
                colorUtility.a(8, new int[]{933});
                colorUtility.a(20, new int[]{350770});
                colorUtility.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{933});
                if (i != 24237) {
                    return true;
                }
                colorUtility.b(new int[]{933, 350770}, new int[]{58, 62});
                return true;
            case 24249:
                if (colorUtility != null) {
                    colorUtility.g(0, -1);
                }
                a(colorUtility, new int[]{3379, 3491, 78, 86, 3363, 18, 41, 109, 127, 59, 82, 75, 52, 57, 119, 97, 112, 73, 70, 48, 26}, new int[]{76, 76, 74, 76, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.g(3);
                return true;
            case 24250:
                a(colorUtility, new int[]{984}, new int[]{54});
                return true;
            case 24262:
                a(colorUtility, new int[]{37403, aU.DK, 8136, 38672, NVMeshShader.GL_REFERENCED_BY_TASK_SHADER_NV, NVMemoryAttachment.GL_DETACHED_MEMORY_INCARNATION_NV, NVMemoryAttachment.GL_ATTACHED_MEMORY_OFFSET_NV, 38424, NVMeshShader.GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV, 37526, 62371, 62375, 7872, 7995, 6978, 7991, 7110, 13, 63405, 63411}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71});
                colorUtility.g(7114);
                return true;
            case 24419:
                a(colorUtility, new int[]{7608, 7624, 7632}, 53);
                return true;
            case 25000:
                a(colorUtility, new int[]{User32.WM_PARENTNOTIFY, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 53);
                return true;
            case 25001:
                a(colorUtility, new int[]{6447, 6443, 5652, 7479}, 53);
                return true;
            case 25002:
                a(colorUtility, new int[]{3974, 3594, 2576, G.cU, 1571, aU.pP, 1575}, 53);
                return true;
            case 25003:
                a(colorUtility, new int[]{55180, 57228}, 53);
                return true;
            case 25022:
            case 25023:
            case 25024:
                a(colorUtility, new int[]{aU.hb, 9152, 41920, 8755, 43550, 46016, 55977, 24512, 35365, 58316}, new int[]{54, 54, 54, 54, 54, 54, 60, 60, 60, 60});
                return true;
            case 25106:
                a(colorUtility, new int[]{123, 127, 22410, 11200, 29113, 908, 937}, new int[]{54, 54, 54, 54, 54, 54, 54});
                return true;
            case 25407:
                colorUtility.b(new int[]{5813, 26006, 9139}, new int[]{58, 72, 72});
                return true;
            case 25424:
                a(colorUtility, new int[]{43059, 8128}, new int[]{58, 58});
                if (colorUtility == null) {
                    return true;
                }
                colorUtility.a(new int[]{CL12.CL_KERNEL_ARG_ADDRESS_PRIVATE, CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 7093}, new int[]{5, 10, 15});
                return true;
            case 25537:
                if (colorUtility == null) {
                    return true;
                }
                a(colorUtility, new int[]{10351}, new int[]{124});
                return true;
            case 27422:
                colorUtility.a(new int[]{5, 10, 5, 347770});
                return true;
            case 27423:
                colorUtility.a(new int[]{5, 10, 5, 51136});
                return true;
            case 27424:
                colorUtility.a(new int[]{5, 10, 5, 461770});
                return true;
            case 28709:
            case 28710:
            case 28711:
                colorUtility.a(0, new int[]{1});
                colorUtility.b(new int[]{43449, 36007, 20, 8418, 1, 935, 28969, 43116, 43340, 43450, 43440, 6573, 411, 10258, 24, 12, 20, 16}, new int[]{53, 53, 60, 60, 53, 53, 60, 60, 60, 60, 60, 60, 60, 60, 60, 53, 53, 53});
                colorUtility.g(80);
                colorUtility.a(80, new int[]{7, 8, 10});
                colorUtility.a(94, new int[]{20, 25, 30});
                return true;
            default:
                return false;
        }
    }

    public static void b(ColorUtility colorUtility, int i) {
        if (colorUtility != null) {
            colorUtility.b(i);
        }
    }

    public static void a(ColorUtility colorUtility, int i, int i2) {
        if (colorUtility != null) {
            colorUtility.e(i, i2);
        }
    }

    public static void a(ColorUtility colorUtility, int[] iArr, int i) {
        if (colorUtility != null) {
            colorUtility.a(iArr, i);
        }
    }

    public static void a(ColorUtility colorUtility, int[] iArr, int[] iArr2) {
        if (colorUtility != null) {
            colorUtility.b(iArr, iArr2);
        }
    }

    public static Image a(int i, int i2) {
        class_333 class_333VarA = a(i, i2, 0);
        if (class_333VarA == null) {
            return null;
        }
        for (int i3 = 0; i3 < class_333VarA.m.length; i3++) {
            if (class_333VarA.m[i3] == 0 || class_333VarA.m[i3] == -1) {
                class_333VarA.m[i3] = 0;
            }
        }
        return class_333.a(class_333VarA.a(32, 32), new Color(0, 0, 0));
    }

    public static void a() {
        l = null;
        k = null;
        aF = null;
        y = null;
        aC = null;
    }

    public boolean a(int i) {
        int i2 = this.B;
        int i3 = this.s;
        if (i == 1) {
            i2 = this.Y;
            i3 = this.z;
        }
        if (i2 == -1) {
            return true;
        }
        boolean z = true;
        if (!ColorUtility.b(i2, this.ar)) {
            z = false;
        }
        if (i3 != -1 && !ColorUtility.b(i3, this.ar)) {
            z = false;
        }
        return z;
    }

    public static void a(class_663 class_663Var) {
        a(class_663Var, true);
    }

    public static void a(class_663 class_663Var, boolean z) {
        if (z) {
            aC = new Buffer(class_663Var.a("obj.dat"));
        } else {
            aC = new Buffer(Client.a(class_650.f() + "obj.dat"));
        }
        Buffer buffer = !z ? new Buffer(Client.a(class_650.f() + "obj.idx")) : new Buffer(class_663Var.a("obj.idx"));
        ad = buffer.A();
        aF = new int[a];
        int iA = 2;
        for (int i = 0; i < ad - 21; i++) {
            aF[i] = iA;
            iA += buffer.A();
        }
        y = new ItemComposition[10];
        for (int i2 = 0; i2 < 10; i2++) {
            y[i2] = new ItemComposition();
        }
        if (b == null) {
            b = new class_622();
            b.d();
        }
    }

    public ColorUtility b(int i) {
        int i2 = this.B;
        int i3 = this.s;
        if (i == 1) {
            i2 = this.Y;
            i3 = this.z;
        }
        if (i2 == -1) {
            return null;
        }
        class_83.a(this.ar);
        try {
            ColorUtility colorUtilityE = ColorUtility.e(i2);
            if (i3 != -1) {
                colorUtilityE = new ColorUtility(2, new ColorUtility[]{colorUtilityE, ColorUtility.e(i3)});
            }
            if (this.g != null) {
                for (int i4 = 0; i4 < this.g.length; i4++) {
                    colorUtilityE.i(this.g[i4], this.h[i4]);
                }
            }
            return colorUtilityE;
        } finally {
            class_83.a(false);
        }
    }

    public boolean b() {
        return (this.p == -1 || this.F == -1) ? false : true;
    }

    public boolean c(int i) {
        int i2 = this.r;
        int i3 = this.K;
        int i4 = this.J;
        if (i == 1) {
            i2 = this.aa;
            i3 = this.q;
            i4 = this.o;
        }
        if (i2 == -1) {
            return true;
        }
        boolean z = true;
        if (!ColorUtility.b(i2, this.ar)) {
            z = false;
        }
        if (i3 != -1 && !ColorUtility.b(i3, this.ar)) {
            z = false;
        }
        if (i4 != -1 && !ColorUtility.b(i4, this.ar)) {
            z = false;
        }
        return z;
    }

    public ColorUtility d(int i) {
        int i2 = this.r;
        int i3 = this.K;
        int i4 = this.J;
        if (i == 1) {
            i2 = this.aa;
            i3 = this.q;
            i4 = this.o;
        }
        if (i2 == -1) {
            return null;
        }
        ColorUtility colorUtilityA = ColorUtility.a(i2, this.ar);
        if (this.itemId == 19051 && !Configuration.ah) {
            for (int i5 = 0; i5 < colorUtilityA.L.length; i5++) {
                if (colorUtilityA.L[i5] == 11) {
                    colorUtilityA.L[i5] = 12;
                }
            }
        }
        if (i3 != -1) {
            colorUtilityA = i4 != -1 ? new ColorUtility(3, new ColorUtility[]{colorUtilityA, ColorUtility.a(i3, this.ar), ColorUtility.a(i4, this.ar)}) : new ColorUtility(2, new ColorUtility[]{colorUtilityA, ColorUtility.a(i3, this.ar)});
        }
        if (colorUtilityA == null) {
            return null;
        }
        if (this.itemId == 19050 || this.itemId == 19051 || this.itemId == 23063 || this.itemId == 21963 || this.itemId == 21964) {
            colorUtilityA.a(0, 0, 7);
        }
        if (this.itemId == 20473) {
            colorUtilityA.a(0, 0, 3);
        }
        if (this.itemId == 15621 || this.itemId == 20570 || this.itemId == 21560) {
            colorUtilityA.a(0, 0, 4);
        }
        if (this.itemId == 21633) {
            colorUtilityA.a(0, 0, 6);
        }
        if ((this.itemId == 21083 || this.itemId == 22813) && !Configuration.aj) {
            colorUtilityA.a(0, 0, 4);
        }
        if (this.itemId == 20694 && !Configuration.aj) {
            colorUtilityA.a(0, 0, 5);
        }
        if (this.itemId >= 20780 && this.itemId <= 20782 && !Configuration.aj) {
            colorUtilityA.a(0, 0, 5);
        }
        byte b2 = i == 0 ? this.af : this.ai;
        if (this.itemId == 23174) {
            b2 = 7;
        }
        if (this.itemId == 21767) {
            b2 = 10;
        }
        boolean z = false;
        if (!Configuration.aj) {
            if (this.ag == 0 && this.ak == 0 && ColorUtility.bG == 3 && !ColorUtility.p[i2]) {
                colorUtilityA.a((int) b2, i == 0 ? 12 : -5, (int) (i == 0 ? this.ah : this.ah));
                z = true;
            }
            byte b3 = i == 0 ? this.al : this.ao;
            byte b4 = i == 0 ? this.am : this.aq;
            byte b5 = i == 0 ? this.an : this.ap;
            if (b3 != 0 || b4 != 0 || b5 != 0) {
                colorUtilityA.a((int) b3, (int) b4, (int) b5);
                z = true;
            }
        }
        if (!z) {
            if (this.itemId == 28759 || this.itemId == 28760) {
                colorUtilityA.a((int) b2, this.ag - 450, (int) this.ah);
            } else {
                if (i == 0 && (this.ag != 0 || this.af != 0 || this.ah != 0)) {
                    colorUtilityA.a((int) b2, (int) this.ag, (int) this.ah);
                }
                if (i == 1 && (this.ak != 0 || this.ai != 0 || this.aj != 0)) {
                    colorUtilityA.a((int) b2, (int) this.ak, (int) this.aj);
                }
            }
        }
        class_197 class_197Var = null;
        if (class_205.c) {
            for (class_196 class_196Var : class_205.b.h()) {
                if (class_196Var instanceof class_197) {
                    class_197 class_197Var2 = (class_197) class_196Var;
                    if (class_197Var2.n() == this.itemId) {
                        class_197Var = class_197Var2;
                        class_197Var.i().clear();
                        break;
                    }
                }
            }
        }
        class_313.d().a(class_268.a, this, colorUtilityA);
        if (this.aw != null) {
            this.aw.a(colorUtilityA);
        } else {
            try {
                setItemDefaultValues(this, colorUtilityA, this.itemId);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.t != 128 || this.O != 128 || this.N != 128) {
            colorUtilityA.b(this.t, this.N, this.O);
        }
        if (this.g != null) {
            for (int i6 = 0; i6 < this.g.length; i6++) {
                colorUtilityA.i(this.g[i6], this.h[i6]);
            }
        }
        if (class_197Var != null) {
            colorUtilityA.a(class_197Var.i());
        }
        return colorUtilityA;
    }

    public void c() {
        this.A = 0;
        this.itemName = null;
        this.x = null;
        this.description = null;
        this.g = null;
        this.h = null;
        this.G = aU.uS;
        this.M = 0;
        this.Z = 0;
        this.ae = 0;
        this.v = 0;
        this.W = 0;
        this.C = false;
        this.f = 1;
        this.n = false;
        this.u = null;
        this.inventoryActions = null;
        this.r = -1;
        this.K = -1;
        this.ag = (byte) 0;
        this.af = (byte) 0;
        this.ah = (byte) 0;
        this.aa = -1;
        this.q = -1;
        this.ak = (byte) 0;
        this.ai = (byte) 0;
        this.aj = (byte) 0;
        this.J = -1;
        this.o = -1;
        this.B = -1;
        this.s = -1;
        this.Y = -1;
        this.z = -1;
        this.P = null;
        this.ab = null;
        this.F = -1;
        this.p = -1;
        this.t = 128;
        this.O = 128;
        this.N = 128;
        this.X = 0;
        this.I = 0;
        this.ac = 0;
    }

    public static ItemComposition e(int i) {
        if (i >= aF.length) {
            return new ItemComposition();
        }
        aB = (aB + 1) % 10;
        aC.h = aF[i];
        ItemComposition itemComposition = new ItemComposition();
        itemComposition.itemId = i;
        itemComposition.c();
        itemComposition.decode(aC);
        return itemComposition;
    }

    public static ItemComposition lookupItem(int i) {
        return a(i, true, true);
    }

    public static ItemComposition a(int i, boolean z, boolean z2) {
        if (!Client.ba) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (y[i2].itemId == i) {
                    return y[i2];
                }
            }
        }
        aB = (aB + 1) % 10;
        ItemComposition itemCompositionA = y[aB];
        if (!z2 || b == null || i <= 0 || b.a(i) == null) {
            aC.h = aF[i];
            itemCompositionA.itemId = i;
            itemCompositionA.c();
            itemCompositionA.decode(aC);
        } else {
            itemCompositionA = b.a(i);
        }
        if (Client.ba && itemCompositionA.itemId == Client.bb) {
            itemCompositionA.itemName = "Debugging " + Client.bb;
            itemCompositionA.Z = Client.bd != 0 ? Client.bd : itemCompositionA.Z;
            itemCompositionA.G = Client.be != 0 ? Client.be : itemCompositionA.G;
            itemCompositionA.M = Client.bc != 0 ? Client.bc : itemCompositionA.M;
            itemCompositionA.v = Client.bf != 0 ? Client.bf : itemCompositionA.v;
            itemCompositionA.W = Client.bg != 0 ? Client.bg : itemCompositionA.W;
        }
        if (itemCompositionA != null && itemCompositionA.itemName != null) {
            if (itemCompositionA.itemName.contains("Goliath") && itemCompositionA.itemName.contains("black")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 33207;
                    itemCompositionA.aa = 33259;
                } else {
                    itemCompositionA.r = 2301;
                    itemCompositionA.aa = 2323;
                }
            }
            if (itemCompositionA.itemName.contains("Goliath") && itemCompositionA.itemName.contains("white")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 33207;
                    itemCompositionA.aa = 33259;
                } else {
                    itemCompositionA.r = 2301;
                    itemCompositionA.aa = 2323;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{64585, 64590, 64595};
                }
            }
            if (itemCompositionA.itemName.contains("Goliath") && itemCompositionA.itemName.contains("yellow")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 33207;
                    itemCompositionA.aa = 33259;
                } else {
                    itemCompositionA.r = 2301;
                    itemCompositionA.aa = 2323;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{9767, 9772, 9777};
                }
            }
            if (itemCompositionA.itemName.contains("Goliath") && itemCompositionA.itemName.contains("red")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 33207;
                    itemCompositionA.aa = 33259;
                } else {
                    itemCompositionA.r = 2301;
                    itemCompositionA.aa = 2323;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{65046, 65051, 65056};
                }
            }
            if (itemCompositionA.itemName.contains("Swift") && itemCompositionA.itemName.contains("black")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 33207;
                    itemCompositionA.aa = 33259;
                } else {
                    itemCompositionA.r = 2302;
                    itemCompositionA.aa = G.bP;
                }
            }
            if (itemCompositionA.itemName.contains("Swift") && itemCompositionA.itemName.contains("white")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 33207;
                    itemCompositionA.aa = 33259;
                } else {
                    itemCompositionA.r = 2302;
                    itemCompositionA.aa = G.bP;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{64585, 64590, 64595};
                }
            }
            if (itemCompositionA.itemName.contains("Swift") && itemCompositionA.itemName.contains("yellow")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 33207;
                    itemCompositionA.aa = 33259;
                } else {
                    itemCompositionA.r = 2302;
                    itemCompositionA.aa = G.bP;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{9767, 9772, 9777};
                }
            }
            if (itemCompositionA.itemName.contains("Swift") && itemCompositionA.itemName.contains("red")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 33207;
                    itemCompositionA.aa = 33259;
                } else {
                    itemCompositionA.r = 2302;
                    itemCompositionA.aa = G.bP;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{65046, 65051, 65056};
                }
            }
            if (itemCompositionA.itemName.contains("Spellcaster") && itemCompositionA.itemName.contains("black")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 179;
                    itemCompositionA.aa = 356;
                } else {
                    itemCompositionA.r = G.bL;
                    itemCompositionA.aa = 2326;
                }
            }
            if (itemCompositionA.itemName.contains("Spellcaster") && itemCompositionA.itemName.contains("white")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 179;
                    itemCompositionA.aa = 356;
                } else {
                    itemCompositionA.r = G.bL;
                    itemCompositionA.aa = 2326;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{64585, 64590, 64595};
                }
            }
            if (itemCompositionA.itemName.contains("Spellcaster") && itemCompositionA.itemName.contains("yellow")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 179;
                    itemCompositionA.aa = 356;
                } else {
                    itemCompositionA.r = G.bL;
                    itemCompositionA.aa = 2326;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{9767, 9772, 9777};
                }
            }
            if (itemCompositionA.itemName.contains("Spellcaster") && itemCompositionA.itemName.contains("red")) {
                if (Configuration.aj) {
                    itemCompositionA.r = 179;
                    itemCompositionA.aa = 356;
                } else {
                    itemCompositionA.r = G.bL;
                    itemCompositionA.aa = 2326;
                    itemCompositionA.g = new int[]{10, 15, 20};
                    itemCompositionA.h = new int[]{65046, 65051, 65056};
                }
            }
            if (itemCompositionA.itemName.contains("Primal platebody") || itemCompositionA.itemName.contains("Torva platebody")) {
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -12;
                    itemCompositionA.ak = (byte) -5;
                    itemCompositionA.aj = (byte) -1;
                    itemCompositionA.ah = (byte) 1;
                    itemCompositionA.ai = (byte) -1;
                    itemCompositionA.t = 120;
                    itemCompositionA.O = 120;
                    itemCompositionA.N = 120;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                    itemCompositionA.aj = (byte) 0;
                    itemCompositionA.ah = (byte) 0;
                    itemCompositionA.ai = (byte) 0;
                    itemCompositionA.t = 128;
                    itemCompositionA.O = 128;
                    itemCompositionA.N = 128;
                }
            }
            if (itemCompositionA.itemName.contains("Primal platelegs") || itemCompositionA.itemName.contains("Torva platelegs")) {
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -12;
                    itemCompositionA.ak = (byte) -5;
                    itemCompositionA.aj = (byte) -1;
                    itemCompositionA.ah = (byte) 1;
                    itemCompositionA.ai = (byte) -1;
                    itemCompositionA.t = 120;
                    itemCompositionA.O = 120;
                    itemCompositionA.N = 120;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                    itemCompositionA.aj = (byte) 0;
                    itemCompositionA.ah = (byte) 0;
                    itemCompositionA.ai = (byte) 0;
                    itemCompositionA.t = 128;
                    itemCompositionA.O = 128;
                    itemCompositionA.N = 128;
                }
            }
        }
        switch (i) {
            case 2653:
                itemCompositionA.o = GL11.GL_MAX_ATTRIB_STACK_DEPTH;
                break;
            case G.ex /* 2669 */:
                itemCompositionA.o = GL11.GL_MAX_PIXEL_MAP_TABLE;
                break;
            case 5609:
                if (!Configuration.aj) {
                    itemCompositionA.ag = (byte) -15;
                    itemCompositionA.ak = (byte) -15;
                    break;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                    break;
                }
            case 5608:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) -25;
                    itemCompositionA.ak = (byte) -25;
                }
                break;
            case 7806:
            case 7807:
            case 16957:
            case 20997:
            case 20998:
            case 22889:
            case 23056:
            case 23057:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -12;
                    itemCompositionA.ak = (byte) -12;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                }
                break;
            case 7808:
            case 20999:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 1;
                    itemCompositionA.ak = (byte) 1;
                } else {
                    itemCompositionA.ag = (byte) 10;
                    itemCompositionA.ak = (byte) 10;
                }
                break;
            case 9975:
                itemCompositionA.A = 1;
                break;
            case 11283:
            case 11284:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 5;
                    itemCompositionA.ak = (byte) 10;
                } else {
                    itemCompositionA.ag = (byte) 17;
                    itemCompositionA.ak = (byte) 5;
                }
                break;
            case 11694:
            case 14487:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 15;
                    itemCompositionA.ak = (byte) 0;
                }
                break;
            case 11730:
            case 12424:
            case 12899:
            case 13045:
            case 13047:
            case 13576:
            case 14490:
            case 20567:
            case 21059:
            case 21712:
            case 23062:
            case 23180:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 15;
                    itemCompositionA.ak = (byte) -3;
                }
                break;
            case 11785:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 20;
                    itemCompositionA.ak = (byte) 20;
                }
                break;
            case 11791:
            case 11908:
            case 12904:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 15;
                    itemCompositionA.ak = (byte) 15;
                }
                break;
            case 12006:
            case 20679:
            case 20680:
            case 20684:
            case 20685:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 10;
                    itemCompositionA.ak = (byte) 0;
                }
                break;
            case 12422:
            case WGLEXTColorspace.WGL_COLORSPACE_LINEAR_EXT /* 12426 */:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 1;
                    itemCompositionA.ak = (byte) 1;
                } else {
                    itemCompositionA.ag = (byte) 15;
                    itemCompositionA.ak = (byte) 15;
                }
                break;
            case 12704:
            case 12706:
            case 20483:
            case 20485:
            case 20486:
            case 20810:
            case 21819:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 10;
                    itemCompositionA.ak = (byte) -1;
                }
                break;
            case 12926:
            case 21577:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 2;
                    itemCompositionA.ak = (byte) 2;
                } else {
                    itemCompositionA.ag = (byte) 15;
                    itemCompositionA.ak = (byte) 15;
                }
                break;
            case 12954:
            case 20532:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 12;
                    itemCompositionA.ak = (byte) -6;
                }
                break;
            case 13738:
            case 13744:
                if (Configuration.aj) {
                    itemCompositionA.G = 1600;
                    itemCompositionA.M = 396;
                    itemCompositionA.Z = 27;
                    itemCompositionA.v = 0;
                    itemCompositionA.W = 14;
                } else {
                    itemCompositionA.G = aU.qT;
                    itemCompositionA.M = 396;
                    itemCompositionA.Z = 1050;
                    itemCompositionA.v = -3;
                    itemCompositionA.W = 4;
                }
                itemCompositionA.ag = (byte) 0;
                itemCompositionA.ak = (byte) 0;
                break;
            case 13740:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -11;
                    itemCompositionA.ak = (byte) 3;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                }
                break;
            case 13742:
                if (Configuration.aj) {
                    itemCompositionA.G = aU.tm;
                    itemCompositionA.M = 431;
                    itemCompositionA.Z = 27;
                    itemCompositionA.v = 0;
                    itemCompositionA.W = 13;
                } else {
                    itemCompositionA.G = aU.qT;
                    itemCompositionA.M = 396;
                    itemCompositionA.Z = 1050;
                    itemCompositionA.v = -3;
                    itemCompositionA.W = 4;
                }
                itemCompositionA.ag = (byte) 0;
                itemCompositionA.ak = (byte) 0;
                break;
            case aU.QZ /* 13858 */:
            case 22043:
                itemCompositionA.r = Configuration.aj ? EXTTextureCompressionLATC.GL_COMPRESSED_LUMINANCE_LATC1_EXT : 42627;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_TRANSFORM_FEEDBACK_ATTRIBS_NV : 42642;
                break;
            case aU.Ra /* 13859 */:
                itemCompositionA.r = Configuration.aj ? 35971 : 42617;
                itemCompositionA.aa = Configuration.aj ? 35971 : 42617;
                break;
            case aU.Rc /* 13861 */:
            case 22044:
                itemCompositionA.r = Configuration.aj ? 35949 : 42634;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_CLIP_DISTANCE_NV : 42645;
                break;
            case aU.Rf /* 13864 */:
                itemCompositionA.r = Configuration.aj ? 35944 : 42638;
                itemCompositionA.aa = Configuration.aj ? 35957 : 42653;
                break;
            case aU.Rl /* 13870 */:
            case 22045:
                itemCompositionA.r = Configuration.aj ? EXTTextureCompressionLATC.GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT : 42626;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_VERTEX_ID_NV : 42643;
                break;
            case aU.Ro /* 13873 */:
            case 22046:
                itemCompositionA.r = Configuration.aj ? 35948 : 42631;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_BACK_PRIMARY_COLOR_NV : 42646;
                break;
            case aU.Rr /* 13876 */:
                itemCompositionA.r = Configuration.aj ? 35945 : 42636;
                itemCompositionA.aa = Configuration.aj ? 35956 : 42652;
                break;
            case aU.Ru /* 13879 */:
            case aU.UH /* 15034 */:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -24;
                    itemCompositionA.ak = (byte) -24;
                } else {
                    itemCompositionA.ag = (byte) -10;
                    itemCompositionA.ak = (byte) -25;
                }
                break;
            case aU.Ry /* 13884 */:
                itemCompositionA.r = Configuration.aj ? 35951 : 42625;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_PRIMITIVE_ID_NV : 42641;
                break;
            case aU.RB /* 13887 */:
            case 22041:
                itemCompositionA.r = Configuration.aj ? EXTTextureCompressionLATC.GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT : 42624;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_GENERIC_ATTRIB_NV : 42644;
                break;
            case aU.RE /* 13890 */:
                itemCompositionA.r = Configuration.aj ? 35947 : 42632;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_TEXTURE_COORD_NV : 42647;
                break;
            case aU.RH /* 13893 */:
            case 22042:
                itemCompositionA.r = Configuration.aj ? 35950 : 42633;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_BACK_SECONDARY_COLOR_NV : 42649;
                break;
            case aU.RK /* 13896 */:
                itemCompositionA.r = Configuration.aj ? 35943 : 42639;
                itemCompositionA.aa = Configuration.aj ? 35958 : 42655;
                break;
            case 13899:
            case 22157:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 4;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -9;
                }
                itemCompositionA.r = Configuration.aj ? NVTransformFeedback.GL_ACTIVE_VARYINGS_NV : 42615;
                itemCompositionA.aa = Configuration.aj ? NVTransformFeedback.GL_ACTIVE_VARYINGS_NV : 42615;
                break;
            case 13902:
            case 22158:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 4;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -9;
                }
                itemCompositionA.r = Configuration.aj ? 35968 : 42623;
                itemCompositionA.aa = Configuration.aj ? 35968 : 42623;
                break;
            case 13905:
            case 20696:
            case 21720:
            case 21721:
            case 21722:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -13;
                    itemCompositionA.ak = (byte) -6;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -8;
                }
                break;
            case 14484:
            case 14486:
            case 22950:
            case 24049:
            case 24194:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -13;
                    itemCompositionA.ak = (byte) -13;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -5;
                }
                break;
            case 14491:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -12;
                    itemCompositionA.ak = (byte) -5;
                } else {
                    itemCompositionA.ag = (byte) 2;
                    itemCompositionA.ak = (byte) -5;
                }
                break;
            case 14990:
            case 22145:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -12;
                    itemCompositionA.ak = (byte) -12;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -12;
                }
                break;
            case aU.UK /* 15037 */:
            case 16955:
            case 21073:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -12;
                    itemCompositionA.ak = (byte) -12;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -10;
                }
                break;
            case aU.UL /* 15038 */:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -12;
                    itemCompositionA.ak = (byte) -12;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -12;
                }
                break;
            case 15039:
            case 16425:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -10;
                    itemCompositionA.ak = (byte) -10;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -10;
                }
                break;
            case 15040:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -10;
                    itemCompositionA.ak = (byte) -10;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -15;
                }
                break;
            case 15135:
            case 21868:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -14;
                    itemCompositionA.ak = (byte) 3;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                }
                break;
            case 15621:
            case 19050:
            case 21963:
            case 21964:
            case 23063:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 3;
                    itemCompositionA.ak = (byte) 10;
                } else {
                    itemCompositionA.ag = (byte) 3;
                    itemCompositionA.ak = (byte) 5;
                }
                break;
            case 16427:
                if (Configuration.aj) {
                    itemCompositionA.r = 29250;
                    itemCompositionA.aa = 29255;
                    itemCompositionA.g = new int[]{280, 924, 920, 43166, aU.iw_, 43156, User32.WM_MBUTTONUP, 127};
                    itemCompositionA.h = new int[]{GL11.GL_LINE_STIPPLE_PATTERN, 2840, 2836, 2830, 2836, 2836, 2836, 0};
                } else {
                    itemCompositionA.r = 55673;
                    itemCompositionA.aa = 56353;
                }
                break;
            case 16843:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -12;
                    itemCompositionA.ak = (byte) -10;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) -8;
                }
                break;
            case 17273:
            case 20741:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -15;
                    itemCompositionA.ak = (byte) 5;
                } else {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                }
                break;
            case 19051:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 3;
                    itemCompositionA.ak = (byte) 10;
                } else {
                    itemCompositionA.ag = (byte) 3;
                    itemCompositionA.ak = (byte) 5;
                }
                break;
            case 19335:
                if (Configuration.aj) {
                    itemCompositionA.G = 550;
                    itemCompositionA.M = class_332.l;
                    itemCompositionA.Z = 26;
                    itemCompositionA.v = 1;
                    itemCompositionA.W = 29;
                } else {
                    itemCompositionA.G = aU.gI;
                    itemCompositionA.M = 539;
                    itemCompositionA.Z = 110;
                    itemCompositionA.v = 5;
                    itemCompositionA.W = 11;
                }
                break;
            case 19544:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 11;
                    itemCompositionA.ak = (byte) -6;
                }
                break;
            case 19918:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 1;
                    itemCompositionA.ak = (byte) 1;
                } else {
                    itemCompositionA.ag = (byte) 15;
                    itemCompositionA.ak = (byte) 5;
                }
                break;
            case 20400:
                itemCompositionA.ag = (byte) 12;
                itemCompositionA.ak = (byte) 10;
                break;
            case 20449:
            case 20690:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 9;
                    itemCompositionA.ak = (byte) -3;
                }
                break;
            case 20482:
            case 21089:
            case 21098:
            case 21099:
            case 23066:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 8;
                } else {
                    itemCompositionA.ag = (byte) 13;
                    itemCompositionA.ak = (byte) 2;
                }
                break;
            case 20553:
            case 21032:
            case 21033:
            case 21034:
            case 21035:
            case 21565:
            case 21566:
            case 21570:
            case 21571:
            case 21848:
            case 21850:
            case 21851:
            case 21852:
            case 21853:
            case 21947:
            case 21948:
            case 21949:
            case 24023:
            case 24024:
            case 24152:
            case 25422:
            case 25423:
            case 27271:
            case 27272:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 12;
                    itemCompositionA.ak = (byte) -5;
                }
                break;
            case 20772:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 14;
                    itemCompositionA.ak = (byte) 6;
                }
                break;
            case 20992:
            case 21714:
            case 21959:
            case 27288:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                }
                break;
            case 21005:
            case 23154:
                itemCompositionA.g = new int[]{aU.yn, 8125, 16, 0, 33, 20};
                itemCompositionA.h = new int[]{5, 8, 461770, 5, 5, 5};
                break;
            case 21038:
            case 21039:
            case 21724:
            case 21738:
                itemCompositionA.g = new int[]{50068};
                itemCompositionA.h = new int[]{5};
                break;
            case 21582:
            case 21583:
            case 21584:
            case 21585:
            case 21586:
            case 21587:
            case 21602:
            case 21603:
            case 21604:
            case 23202:
            case 23908:
            case 23909:
            case 23910:
            case 24250:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 15;
                    itemCompositionA.ak = (byte) 5;
                }
                break;
            case 21633:
                itemCompositionA.K = 40024;
                break;
            case 21645:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -3;
                    itemCompositionA.ak = (byte) -3;
                } else {
                    itemCompositionA.ag = (byte) 8;
                    itemCompositionA.ak = (byte) -3;
                }
                break;
            case 21767:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -25;
                    itemCompositionA.ak = (byte) -21;
                } else {
                    itemCompositionA.ag = (byte) -8;
                    itemCompositionA.ak = (byte) -25;
                }
                break;
            case 22134:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 18;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 30;
                    itemCompositionA.ak = (byte) -1;
                }
                break;
            case 22218:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 7;
                    itemCompositionA.ak = (byte) 7;
                } else {
                    itemCompositionA.ag = (byte) 15;
                    itemCompositionA.ak = (byte) 7;
                }
                break;
            case 22826:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 14;
                    itemCompositionA.ak = (byte) 14;
                }
                break;
            case 22905:
            case 22906:
            case 22907:
                itemCompositionA.ac = aU.nV;
                break;
            case 23174:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 20;
                    itemCompositionA.ak = (byte) 20;
                } else {
                    itemCompositionA.ag = (byte) 28;
                    itemCompositionA.ak = (byte) 28;
                }
                break;
            case 24029:
            case 24030:
            case 24031:
            case 24032:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 0;
                    itemCompositionA.ak = (byte) 0;
                } else {
                    itemCompositionA.ag = (byte) 12;
                    itemCompositionA.ak = (byte) -5;
                }
                break;
            case 25105:
                itemCompositionA.G = aU.LP;
                break;
            case 25410:
            case 25411:
            case 25412:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) 12;
                    itemCompositionA.ak = (byte) 20;
                    itemCompositionA.af = (byte) 14;
                    itemCompositionA.ai = (byte) 14;
                    itemCompositionA.ah = (byte) 12;
                    itemCompositionA.aj = (byte) 10;
                } else {
                    itemCompositionA.ag = (byte) 6;
                    itemCompositionA.ak = (byte) 5;
                    itemCompositionA.af = (byte) 10;
                    itemCompositionA.ai = (byte) 12;
                    itemCompositionA.ah = (byte) 15;
                    itemCompositionA.aj = (byte) 15;
                }
                break;
            case 27686:
            case 27687:
            case 27688:
            case 27689:
                if (Configuration.aj) {
                    itemCompositionA.ag = (byte) -50;
                } else {
                    itemCompositionA.ag = (byte) -35;
                }
                break;
        }
        if (itemCompositionA.p != -1 && z2) {
            itemCompositionA.d();
        }
        if (itemCompositionA.itemName != null) {
            itemCompositionA.description = null;
            if (class_116.a.w_(i) && itemCompositionA.itemName.contains("@gre@")) {
                itemCompositionA.itemName = class_116.a.b(i).d + itemCompositionA.itemName.substring(5);
            }
        }
        if (itemCompositionA.x == null) {
            itemCompositionA.x = itemCompositionA.itemName;
        }
        return itemCompositionA;
    }

    private void d() {
        ItemComposition itemCompositionLookupItem = lookupItem(this.p);
        this.A = itemCompositionLookupItem.A;
        this.G = itemCompositionLookupItem.G;
        this.M = itemCompositionLookupItem.M;
        this.Z = itemCompositionLookupItem.Z;
        this.ae = itemCompositionLookupItem.ae;
        this.v = itemCompositionLookupItem.v;
        this.W = itemCompositionLookupItem.W;
        this.g = itemCompositionLookupItem.g;
        this.h = itemCompositionLookupItem.h;
        ItemComposition itemCompositionLookupItem2 = lookupItem(this.F);
        this.itemName = itemCompositionLookupItem2.itemName;
        this.x = itemCompositionLookupItem2.x;
        this.n = itemCompositionLookupItem2.n;
        this.f = itemCompositionLookupItem2.f;
        this.C = true;
    }

    public static class_333 g(int i) {
        if (j.a(i) != null) {
            return (class_333) j.a(i);
        }
        class_333 class_333VarA = a(i, Integer.MAX_VALUE, 0, 19, true);
        if (class_333VarA == null) {
            return null;
        }
        j.a(class_333VarA, i);
        return class_333VarA;
    }

    public static class_333 a(int i, int i2, int i3) {
        return a(i, i2, i3, 32);
    }

    public static class_333 a(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, i4, false);
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0388  */
    /* JADX WARN: Code duplicated, block: B:163:0x038d  */
    /* JADX WARN: Code duplicated, block: B:165:0x039e  */
    /* JADX WARN: Code duplicated, block: B:166:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:172:0x03be  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:176:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:179:0x03da  */
    /* JADX WARN: Code duplicated, block: B:181:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:185:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:187:0x0407  */
    /* JADX WARN: Code duplicated, block: B:188:0x040b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0414  */
    /* JADX WARN: Code duplicated, block: B:192:0x041c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0422  */
    /* JADX WARN: Code duplicated, block: B:195:0x0427  */
    /* JADX WARN: Code duplicated, block: B:197:0x0438  */
    /* JADX WARN: Code duplicated, block: B:198:0x043c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0445  */
    /* JADX WARN: Code duplicated, block: B:203:0x0454  */
    /* JADX WARN: Code duplicated, block: B:204:0x0458  */
    /* JADX WARN: Code duplicated, block: B:246:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:248:0x0500  */
    /* JADX WARN: Code duplicated, block: B:250:0x0511  */
    /* JADX WARN: Code duplicated, block: B:251:0x0515  */
    /* JADX WARN: Code duplicated, block: B:254:0x051e  */
    /* JADX WARN: Code duplicated, block: B:256:0x052d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0531  */
    /* JADX WARN: Code duplicated, block: B:259:0x053a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0542  */
    /* JADX WARN: Code duplicated, block: B:262:0x0548  */
    /* JADX WARN: Code duplicated, block: B:264:0x054d  */
    /* JADX WARN: Code duplicated, block: B:266:0x055e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0562  */
    /* JADX WARN: Code duplicated, block: B:270:0x056b  */
    /* JADX WARN: Code duplicated, block: B:272:0x057a  */
    /* JADX WARN: Code duplicated, block: B:273:0x057e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0587  */
    /* JADX WARN: Code duplicated, block: B:277:0x058f  */
    /* JADX WARN: Code duplicated, block: B:278:0x0595  */
    /* JADX WARN: Code duplicated, block: B:280:0x059a  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:283:0x05af  */
    /* JADX WARN: Code duplicated, block: B:286:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:288:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:289:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:382:0x045e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x045e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x05d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x05d1 A[SYNTHETIC] */
    public static class_333 a(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr4;
        int i25;
        int i26;
        int i27;
        int i28;
        int[] iArr5;
        int i29;
        int i30;
        int i31;
        int i32;
        int[] iArr6;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37 = -1;
        if (!z) {
            if (i == 3241) {
                z = true;
            }
            if (i == 28807) {
                z = true;
            }
            for (long[][] jArr : ay) {
                if (jArr[0][0] == i) {
                    if (System.currentTimeMillis() - jArr[0][1] >= 300) {
                        long[] jArr2 = jArr[0];
                        jArr2[2] = jArr2[2] + 1;
                        if (jArr[0][2] >= jArr[1].length) {
                            jArr[0][2] = 0;
                        }
                        jArr[0][1] = System.currentTimeMillis();
                    }
                    i37 = (int) jArr[1][(int) jArr[0][2]];
                    z = true;
                }
            }
        }
        if (!z && i3 == 0 && !Client.ba && !z) {
            class_333 class_333Var = (class_333) k.a(i);
            if (class_333Var != null && class_333Var.s != i2 && class_333Var.s != -1) {
                class_333Var.b();
                class_333Var = null;
            }
            if (class_333Var != null && class_333Var.h != null && (class_333Var.h instanceof Integer) && ((Integer) class_333Var.h).intValue() != i4) {
                class_333Var.b();
                class_333Var = null;
            }
            if (class_333Var != null) {
                return class_333Var;
            }
        }
        int i38 = i37 != -1 ? i37 : i;
        if (i38 < 0 || i38 >= aF.length) {
            return null;
        }
        ItemComposition itemCompositionLookupItem = lookupItem(i38);
        if (itemCompositionLookupItem == null) {
            return null;
        }
        if (itemCompositionLookupItem.P == null) {
            i2 = -1;
        }
        if (i2 > 1) {
            int i39 = -1;
            for (int i40 = 0; i40 < 10; i40++) {
                if (i2 >= itemCompositionLookupItem.ab[i40] && itemCompositionLookupItem.ab[i40] != 0) {
                    i39 = itemCompositionLookupItem.P[i40];
                }
            }
            if (i39 != -1) {
                itemCompositionLookupItem = lookupItem(i39);
            }
        }
        class_332.h = true;
        ColorUtility colorUtilityH = itemCompositionLookupItem.h(1);
        class_332.h = false;
        if (colorUtilityH == null) {
            return null;
        }
        class_333 class_333VarA = null;
        if (itemCompositionLookupItem.p != -1) {
            class_333VarA = a(itemCompositionLookupItem.F, 10, -1);
            if (class_333VarA == null) {
                return null;
            }
        }
        class_333 class_333Var2 = new class_333(i4 > 32 ? i4 : 32, i4 > 32 ? i4 : 32);
        int i41 = class_332.s;
        int i42 = class_332.t;
        int[] iArr7 = class_332.x;
        int[] iArr8 = class_210.g;
        int i43 = class_210.h;
        int i44 = class_210.i;
        int i45 = class_210.l;
        int i46 = class_210.m;
        int i47 = class_210.j;
        int i48 = class_210.k;
        class_332.p = false;
        class_332.q = false;
        class_210.a(i4 > 32 ? i4 : 32, i4 > 32 ? i4 : 32, class_333Var2.m, (float[]) null);
        class_210.a(0, 0, i4 > 32 ? i4 : 32, i4 > 32 ? i4 : 32, 0, true);
        class_332.f();
        int iFloor = itemCompositionLookupItem.G;
        if (i3 == -1) {
            iFloor = (int) (((double) iFloor) * 1.5d);
        }
        if (i3 > 0) {
            iFloor = (int) (((double) iFloor) * 1.04d);
        }
        if (i3 == 16705) {
            i3 = 0;
        }
        if (i4 != 32) {
            iFloor = (int) Math.floor(itemCompositionLookupItem.G * (32.0f / i4));
        }
        int i49 = (class_332.v[itemCompositionLookupItem.M] * iFloor) >> 16;
        int i50 = (class_332.w[itemCompositionLookupItem.M] * iFloor) >> 16;
        class_332.h = true;
        colorUtilityH.a(itemCompositionLookupItem.Z, itemCompositionLookupItem.ae, itemCompositionLookupItem.M, itemCompositionLookupItem.v, i49 + (colorUtilityH.g / 2) + itemCompositionLookupItem.W, i50 + itemCompositionLookupItem.W);
        class_332.h = false;
        for (int i51 = i4 > 32 ? i4 - 1 : 31; i51 >= 0; i51--) {
            for (int i52 = i4 > 32 ? i4 - 1 : 31; i52 >= 0; i52--) {
                if (class_333Var2.m[i51 + (i52 * (i4 > 32 ? i4 : 32))] == 0) {
                    if (i51 > 0) {
                        if (class_333Var2.m[(i51 - 1) + (i52 * (i4 > 32 ? i4 : 32))] > 1) {
                            class_333Var2.m[i51 + (i52 * (i4 > 32 ? i4 : 32))] = 1;
                        } else if (i52 > 0) {
                            iArr6 = class_333Var2.m;
                            i33 = i51;
                            i34 = i52 - 1;
                            if (i4 > 32) {
                                i35 = i4;
                            } else {
                                i35 = 32;
                            }
                            if (iArr6[i33 + (i34 * i35)] > 1) {
                                int[] iArr9 = class_333Var2.m;
                                int i53 = i51;
                                int i54 = i52;
                                if (i4 > 32) {
                                    i36 = i4;
                                } else {
                                    i36 = 32;
                                }
                                iArr9[i53 + (i54 * i36)] = 1;
                            } else {
                                i21 = i51;
                                if (i4 > 32) {
                                    i22 = i4 - 1;
                                } else {
                                    i22 = 31;
                                }
                                if (i21 < i22) {
                                    iArr5 = class_333Var2.m;
                                    i29 = i51 + 1;
                                    i30 = i52;
                                    if (i4 > 32) {
                                        i31 = i4;
                                    } else {
                                        i31 = 32;
                                    }
                                    if (iArr5[i29 + (i30 * i31)] > 1) {
                                        int[] iArr10 = class_333Var2.m;
                                        int i55 = i51;
                                        int i56 = i52;
                                        if (i4 > 32) {
                                            i32 = i4;
                                        } else {
                                            i32 = 32;
                                        }
                                        iArr10[i55 + (i56 * i32)] = 1;
                                    } else {
                                        i23 = i52;
                                        if (i4 > 32) {
                                            i24 = i4 - 1;
                                        } else {
                                            i24 = 31;
                                        }
                                        if (i23 < i24) {
                                            iArr4 = class_333Var2.m;
                                            i25 = i51;
                                            i26 = i52 + 1;
                                            if (i4 > 32) {
                                                i27 = i4;
                                            } else {
                                                i27 = 32;
                                            }
                                            if (iArr4[i25 + (i26 * i27)] > 1) {
                                                int[] iArr11 = class_333Var2.m;
                                                int i57 = i51;
                                                int i58 = i52;
                                                if (i4 > 32) {
                                                    i28 = i4;
                                                } else {
                                                    i28 = 32;
                                                }
                                                iArr11[i57 + (i58 * i28)] = 1;
                                            }
                                        }
                                    }
                                } else {
                                    i23 = i52;
                                    if (i4 > 32) {
                                        i24 = i4 - 1;
                                    } else {
                                        i24 = 31;
                                    }
                                    if (i23 < i24) {
                                        iArr4 = class_333Var2.m;
                                        i25 = i51;
                                        i26 = i52 + 1;
                                        if (i4 > 32) {
                                            i27 = i4;
                                        } else {
                                            i27 = 32;
                                        }
                                        if (iArr4[i25 + (i26 * i27)] > 1) {
                                            int[] iArr12 = class_333Var2.m;
                                            int i59 = i51;
                                            int i510 = i52;
                                            if (i4 > 32) {
                                                i28 = i4;
                                            } else {
                                                i28 = 32;
                                            }
                                            iArr12[i59 + (i510 * i28)] = 1;
                                        }
                                    }
                                }
                            }
                        } else {
                            i21 = i51;
                            if (i4 > 32) {
                                i22 = i4 - 1;
                            } else {
                                i22 = 31;
                            }
                            if (i21 < i22) {
                                iArr5 = class_333Var2.m;
                                i29 = i51 + 1;
                                i30 = i52;
                                if (i4 > 32) {
                                    i31 = i4;
                                } else {
                                    i31 = 32;
                                }
                                if (iArr5[i29 + (i30 * i31)] > 1) {
                                    int[] iArr13 = class_333Var2.m;
                                    int i511 = i51;
                                    int i512 = i52;
                                    if (i4 > 32) {
                                        i32 = i4;
                                    } else {
                                        i32 = 32;
                                    }
                                    iArr13[i511 + (i512 * i32)] = 1;
                                } else {
                                    i23 = i52;
                                    if (i4 > 32) {
                                        i24 = i4 - 1;
                                    } else {
                                        i24 = 31;
                                    }
                                    if (i23 < i24) {
                                        iArr4 = class_333Var2.m;
                                        i25 = i51;
                                        i26 = i52 + 1;
                                        if (i4 > 32) {
                                            i27 = i4;
                                        } else {
                                            i27 = 32;
                                        }
                                        if (iArr4[i25 + (i26 * i27)] > 1) {
                                            int[] iArr14 = class_333Var2.m;
                                            int i513 = i51;
                                            int i514 = i52;
                                            if (i4 > 32) {
                                                i28 = i4;
                                            } else {
                                                i28 = 32;
                                            }
                                            iArr14[i513 + (i514 * i28)] = 1;
                                        }
                                    }
                                }
                            } else {
                                i23 = i52;
                                if (i4 > 32) {
                                    i24 = i4 - 1;
                                } else {
                                    i24 = 31;
                                }
                                if (i23 < i24) {
                                    iArr4 = class_333Var2.m;
                                    i25 = i51;
                                    i26 = i52 + 1;
                                    if (i4 > 32) {
                                        i27 = i4;
                                    } else {
                                        i27 = 32;
                                    }
                                    if (iArr4[i25 + (i26 * i27)] > 1) {
                                        int[] iArr15 = class_333Var2.m;
                                        int i515 = i51;
                                        int i516 = i52;
                                        if (i4 > 32) {
                                            i28 = i4;
                                        } else {
                                            i28 = 32;
                                        }
                                        iArr15[i515 + (i516 * i28)] = 1;
                                    }
                                }
                            }
                        }
                    } else if (i52 > 0) {
                        iArr6 = class_333Var2.m;
                        i33 = i51;
                        i34 = i52 - 1;
                        if (i4 > 32) {
                            i35 = i4;
                        } else {
                            i35 = 32;
                        }
                        if (iArr6[i33 + (i34 * i35)] > 1) {
                            int[] iArr16 = class_333Var2.m;
                            int i517 = i51;
                            int i518 = i52;
                            if (i4 > 32) {
                                i36 = i4;
                            } else {
                                i36 = 32;
                            }
                            iArr16[i517 + (i518 * i36)] = 1;
                        } else {
                            i21 = i51;
                            if (i4 > 32) {
                                i22 = i4 - 1;
                            } else {
                                i22 = 31;
                            }
                            if (i21 < i22) {
                                iArr5 = class_333Var2.m;
                                i29 = i51 + 1;
                                i30 = i52;
                                if (i4 > 32) {
                                    i31 = i4;
                                } else {
                                    i31 = 32;
                                }
                                if (iArr5[i29 + (i30 * i31)] > 1) {
                                    int[] iArr17 = class_333Var2.m;
                                    int i519 = i51;
                                    int i5110 = i52;
                                    if (i4 > 32) {
                                        i32 = i4;
                                    } else {
                                        i32 = 32;
                                    }
                                    iArr17[i519 + (i5110 * i32)] = 1;
                                } else {
                                    i23 = i52;
                                    if (i4 > 32) {
                                        i24 = i4 - 1;
                                    } else {
                                        i24 = 31;
                                    }
                                    if (i23 < i24) {
                                        iArr4 = class_333Var2.m;
                                        i25 = i51;
                                        i26 = i52 + 1;
                                        if (i4 > 32) {
                                            i27 = i4;
                                        } else {
                                            i27 = 32;
                                        }
                                        if (iArr4[i25 + (i26 * i27)] > 1) {
                                            int[] iArr18 = class_333Var2.m;
                                            int i5111 = i51;
                                            int i5112 = i52;
                                            if (i4 > 32) {
                                                i28 = i4;
                                            } else {
                                                i28 = 32;
                                            }
                                            iArr18[i5111 + (i5112 * i28)] = 1;
                                        }
                                    }
                                }
                            } else {
                                i23 = i52;
                                if (i4 > 32) {
                                    i24 = i4 - 1;
                                } else {
                                    i24 = 31;
                                }
                                if (i23 < i24) {
                                    iArr4 = class_333Var2.m;
                                    i25 = i51;
                                    i26 = i52 + 1;
                                    if (i4 > 32) {
                                        i27 = i4;
                                    } else {
                                        i27 = 32;
                                    }
                                    if (iArr4[i25 + (i26 * i27)] > 1) {
                                        int[] iArr19 = class_333Var2.m;
                                        int i5113 = i51;
                                        int i5114 = i52;
                                        if (i4 > 32) {
                                            i28 = i4;
                                        } else {
                                            i28 = 32;
                                        }
                                        iArr19[i5113 + (i5114 * i28)] = 1;
                                    }
                                }
                            }
                        }
                    } else {
                        i21 = i51;
                        if (i4 > 32) {
                            i22 = i4 - 1;
                        } else {
                            i22 = 31;
                        }
                        if (i21 < i22) {
                            iArr5 = class_333Var2.m;
                            i29 = i51 + 1;
                            i30 = i52;
                            if (i4 > 32) {
                                i31 = i4;
                            } else {
                                i31 = 32;
                            }
                            if (iArr5[i29 + (i30 * i31)] > 1) {
                                int[] iArr110 = class_333Var2.m;
                                int i5115 = i51;
                                int i5116 = i52;
                                if (i4 > 32) {
                                    i32 = i4;
                                } else {
                                    i32 = 32;
                                }
                                iArr110[i5115 + (i5116 * i32)] = 1;
                            } else {
                                i23 = i52;
                                if (i4 > 32) {
                                    i24 = i4 - 1;
                                } else {
                                    i24 = 31;
                                }
                                if (i23 < i24) {
                                    iArr4 = class_333Var2.m;
                                    i25 = i51;
                                    i26 = i52 + 1;
                                    if (i4 > 32) {
                                        i27 = i4;
                                    } else {
                                        i27 = 32;
                                    }
                                    if (iArr4[i25 + (i26 * i27)] > 1) {
                                        int[] iArr111 = class_333Var2.m;
                                        int i5117 = i51;
                                        int i5118 = i52;
                                        if (i4 > 32) {
                                            i28 = i4;
                                        } else {
                                            i28 = 32;
                                        }
                                        iArr111[i5117 + (i5118 * i28)] = 1;
                                    }
                                }
                            }
                        } else {
                            i23 = i52;
                            if (i4 > 32) {
                                i24 = i4 - 1;
                            } else {
                                i24 = 31;
                            }
                            if (i23 < i24) {
                                iArr4 = class_333Var2.m;
                                i25 = i51;
                                i26 = i52 + 1;
                                if (i4 > 32) {
                                    i27 = i4;
                                } else {
                                    i27 = 32;
                                }
                                if (iArr4[i25 + (i26 * i27)] > 1) {
                                    int[] iArr112 = class_333Var2.m;
                                    int i5119 = i51;
                                    int i51110 = i52;
                                    if (i4 > 32) {
                                        i28 = i4;
                                    } else {
                                        i28 = 32;
                                    }
                                    iArr112[i5119 + (i51110 * i28)] = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i4 <= 32) {
            if (i3 > 0) {
                for (int i60 = i4 > 32 ? i4 - 1 : 31; i60 >= 0; i60--) {
                    for (int i61 = i4 > 32 ? i4 - 1 : 31; i61 >= 0; i61--) {
                        if (class_333Var2.m[i60 + (i61 * (i4 > 32 ? i4 : 32))] == 0) {
                            if (i60 > 0) {
                                if (class_333Var2.m[(i60 - 1) + (i61 * (i4 > 32 ? i4 : 32))] == 1) {
                                    class_333Var2.m[i60 + (i61 * (i4 > 32 ? i4 : 32))] = i3;
                                } else if (i61 > 0) {
                                    iArr3 = class_333Var2.m;
                                    i17 = i60;
                                    i18 = i61 - 1;
                                    if (i4 > 32) {
                                        i19 = i4;
                                    } else {
                                        i19 = 32;
                                    }
                                    if (iArr3[i17 + (i18 * i19)] == 1) {
                                        int[] iArr20 = class_333Var2.m;
                                        int i62 = i60;
                                        int i63 = i61;
                                        if (i4 > 32) {
                                            i20 = i4;
                                        } else {
                                            i20 = 32;
                                        }
                                        iArr20[i62 + (i63 * i20)] = i3;
                                    } else {
                                        i5 = i60;
                                        if (i4 > 32) {
                                            i6 = i4 - 1;
                                        } else {
                                            i6 = 31;
                                        }
                                        if (i5 < i6) {
                                            iArr2 = class_333Var2.m;
                                            i13 = i60 + 1;
                                            i14 = i61;
                                            if (i4 > 32) {
                                                i15 = i4;
                                            } else {
                                                i15 = 32;
                                            }
                                            if (iArr2[i13 + (i14 * i15)] == 1) {
                                                int[] iArr21 = class_333Var2.m;
                                                int i64 = i60;
                                                int i65 = i61;
                                                if (i4 > 32) {
                                                    i16 = i4;
                                                } else {
                                                    i16 = 32;
                                                }
                                                iArr21[i64 + (i65 * i16)] = i3;
                                            } else {
                                                i7 = i61;
                                                if (i4 > 32) {
                                                    i8 = i4 - 1;
                                                } else {
                                                    i8 = 31;
                                                }
                                                if (i7 < i8) {
                                                    iArr = class_333Var2.m;
                                                    i9 = i60;
                                                    i10 = i61 + 1;
                                                    if (i4 > 32) {
                                                        i11 = i4;
                                                    } else {
                                                        i11 = 32;
                                                    }
                                                    if (iArr[i9 + (i10 * i11)] == 1) {
                                                        int[] iArr22 = class_333Var2.m;
                                                        int i66 = i60;
                                                        int i67 = i61;
                                                        if (i4 > 32) {
                                                            i12 = i4;
                                                        } else {
                                                            i12 = 32;
                                                        }
                                                        iArr22[i66 + (i67 * i12)] = i3;
                                                    }
                                                }
                                            }
                                        } else {
                                            i7 = i61;
                                            if (i4 > 32) {
                                                i8 = i4 - 1;
                                            } else {
                                                i8 = 31;
                                            }
                                            if (i7 < i8) {
                                                iArr = class_333Var2.m;
                                                i9 = i60;
                                                i10 = i61 + 1;
                                                if (i4 > 32) {
                                                    i11 = i4;
                                                } else {
                                                    i11 = 32;
                                                }
                                                if (iArr[i9 + (i10 * i11)] == 1) {
                                                    int[] iArr23 = class_333Var2.m;
                                                    int i68 = i60;
                                                    int i69 = i61;
                                                    if (i4 > 32) {
                                                        i12 = i4;
                                                    } else {
                                                        i12 = 32;
                                                    }
                                                    iArr23[i68 + (i69 * i12)] = i3;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i5 = i60;
                                    if (i4 > 32) {
                                        i6 = i4 - 1;
                                    } else {
                                        i6 = 31;
                                    }
                                    if (i5 < i6) {
                                        iArr2 = class_333Var2.m;
                                        i13 = i60 + 1;
                                        i14 = i61;
                                        if (i4 > 32) {
                                            i15 = i4;
                                        } else {
                                            i15 = 32;
                                        }
                                        if (iArr2[i13 + (i14 * i15)] == 1) {
                                            int[] iArr24 = class_333Var2.m;
                                            int i610 = i60;
                                            int i611 = i61;
                                            if (i4 > 32) {
                                                i16 = i4;
                                            } else {
                                                i16 = 32;
                                            }
                                            iArr24[i610 + (i611 * i16)] = i3;
                                        } else {
                                            i7 = i61;
                                            if (i4 > 32) {
                                                i8 = i4 - 1;
                                            } else {
                                                i8 = 31;
                                            }
                                            if (i7 < i8) {
                                                iArr = class_333Var2.m;
                                                i9 = i60;
                                                i10 = i61 + 1;
                                                if (i4 > 32) {
                                                    i11 = i4;
                                                } else {
                                                    i11 = 32;
                                                }
                                                if (iArr[i9 + (i10 * i11)] == 1) {
                                                    int[] iArr25 = class_333Var2.m;
                                                    int i612 = i60;
                                                    int i613 = i61;
                                                    if (i4 > 32) {
                                                        i12 = i4;
                                                    } else {
                                                        i12 = 32;
                                                    }
                                                    iArr25[i612 + (i613 * i12)] = i3;
                                                }
                                            }
                                        }
                                    } else {
                                        i7 = i61;
                                        if (i4 > 32) {
                                            i8 = i4 - 1;
                                        } else {
                                            i8 = 31;
                                        }
                                        if (i7 < i8) {
                                            iArr = class_333Var2.m;
                                            i9 = i60;
                                            i10 = i61 + 1;
                                            if (i4 > 32) {
                                                i11 = i4;
                                            } else {
                                                i11 = 32;
                                            }
                                            if (iArr[i9 + (i10 * i11)] == 1) {
                                                int[] iArr26 = class_333Var2.m;
                                                int i614 = i60;
                                                int i615 = i61;
                                                if (i4 > 32) {
                                                    i12 = i4;
                                                } else {
                                                    i12 = 32;
                                                }
                                                iArr26[i614 + (i615 * i12)] = i3;
                                            }
                                        }
                                    }
                                }
                            } else if (i61 > 0) {
                                iArr3 = class_333Var2.m;
                                i17 = i60;
                                i18 = i61 - 1;
                                if (i4 > 32) {
                                    i19 = i4;
                                } else {
                                    i19 = 32;
                                }
                                if (iArr3[i17 + (i18 * i19)] == 1) {
                                    int[] iArr27 = class_333Var2.m;
                                    int i616 = i60;
                                    int i617 = i61;
                                    if (i4 > 32) {
                                        i20 = i4;
                                    } else {
                                        i20 = 32;
                                    }
                                    iArr27[i616 + (i617 * i20)] = i3;
                                } else {
                                    i5 = i60;
                                    if (i4 > 32) {
                                        i6 = i4 - 1;
                                    } else {
                                        i6 = 31;
                                    }
                                    if (i5 < i6) {
                                        iArr2 = class_333Var2.m;
                                        i13 = i60 + 1;
                                        i14 = i61;
                                        if (i4 > 32) {
                                            i15 = i4;
                                        } else {
                                            i15 = 32;
                                        }
                                        if (iArr2[i13 + (i14 * i15)] == 1) {
                                            int[] iArr28 = class_333Var2.m;
                                            int i618 = i60;
                                            int i619 = i61;
                                            if (i4 > 32) {
                                                i16 = i4;
                                            } else {
                                                i16 = 32;
                                            }
                                            iArr28[i618 + (i619 * i16)] = i3;
                                        } else {
                                            i7 = i61;
                                            if (i4 > 32) {
                                                i8 = i4 - 1;
                                            } else {
                                                i8 = 31;
                                            }
                                            if (i7 < i8) {
                                                iArr = class_333Var2.m;
                                                i9 = i60;
                                                i10 = i61 + 1;
                                                if (i4 > 32) {
                                                    i11 = i4;
                                                } else {
                                                    i11 = 32;
                                                }
                                                if (iArr[i9 + (i10 * i11)] == 1) {
                                                    int[] iArr29 = class_333Var2.m;
                                                    int i6110 = i60;
                                                    int i6111 = i61;
                                                    if (i4 > 32) {
                                                        i12 = i4;
                                                    } else {
                                                        i12 = 32;
                                                    }
                                                    iArr29[i6110 + (i6111 * i12)] = i3;
                                                }
                                            }
                                        }
                                    } else {
                                        i7 = i61;
                                        if (i4 > 32) {
                                            i8 = i4 - 1;
                                        } else {
                                            i8 = 31;
                                        }
                                        if (i7 < i8) {
                                            iArr = class_333Var2.m;
                                            i9 = i60;
                                            i10 = i61 + 1;
                                            if (i4 > 32) {
                                                i11 = i4;
                                            } else {
                                                i11 = 32;
                                            }
                                            if (iArr[i9 + (i10 * i11)] == 1) {
                                                int[] iArr210 = class_333Var2.m;
                                                int i6112 = i60;
                                                int i6113 = i61;
                                                if (i4 > 32) {
                                                    i12 = i4;
                                                } else {
                                                    i12 = 32;
                                                }
                                                iArr210[i6112 + (i6113 * i12)] = i3;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i5 = i60;
                                if (i4 > 32) {
                                    i6 = i4 - 1;
                                } else {
                                    i6 = 31;
                                }
                                if (i5 < i6) {
                                    iArr2 = class_333Var2.m;
                                    i13 = i60 + 1;
                                    i14 = i61;
                                    if (i4 > 32) {
                                        i15 = i4;
                                    } else {
                                        i15 = 32;
                                    }
                                    if (iArr2[i13 + (i14 * i15)] == 1) {
                                        int[] iArr211 = class_333Var2.m;
                                        int i6114 = i60;
                                        int i6115 = i61;
                                        if (i4 > 32) {
                                            i16 = i4;
                                        } else {
                                            i16 = 32;
                                        }
                                        iArr211[i6114 + (i6115 * i16)] = i3;
                                    } else {
                                        i7 = i61;
                                        if (i4 > 32) {
                                            i8 = i4 - 1;
                                        } else {
                                            i8 = 31;
                                        }
                                        if (i7 < i8) {
                                            iArr = class_333Var2.m;
                                            i9 = i60;
                                            i10 = i61 + 1;
                                            if (i4 > 32) {
                                                i11 = i4;
                                            } else {
                                                i11 = 32;
                                            }
                                            if (iArr[i9 + (i10 * i11)] == 1) {
                                                int[] iArr212 = class_333Var2.m;
                                                int i6116 = i60;
                                                int i6117 = i61;
                                                if (i4 > 32) {
                                                    i12 = i4;
                                                } else {
                                                    i12 = 32;
                                                }
                                                iArr212[i6116 + (i6117 * i12)] = i3;
                                            }
                                        }
                                    }
                                } else {
                                    i7 = i61;
                                    if (i4 > 32) {
                                        i8 = i4 - 1;
                                    } else {
                                        i8 = 31;
                                    }
                                    if (i7 < i8) {
                                        iArr = class_333Var2.m;
                                        i9 = i60;
                                        i10 = i61 + 1;
                                        if (i4 > 32) {
                                            i11 = i4;
                                        } else {
                                            i11 = 32;
                                        }
                                        if (iArr[i9 + (i10 * i11)] == 1) {
                                            int[] iArr213 = class_333Var2.m;
                                            int i6118 = i60;
                                            int i6119 = i61;
                                            if (i4 > 32) {
                                                i12 = i4;
                                            } else {
                                                i12 = 32;
                                            }
                                            iArr213[i6118 + (i6119 * i12)] = i3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (i3 == 0) {
                for (int i70 = i4 > 32 ? i4 - 1 : 31; i70 >= 0; i70--) {
                    for (int i71 = i4 > 32 ? i4 - 1 : 31; i71 >= 0; i71--) {
                        if (class_333Var2.m[i70 + (i71 * (i4 > 32 ? i4 : 32))] == 0 && i70 > 0 && i71 > 0 && class_333Var2.m[(i70 - 1) + ((i71 - 1) * 32)] > 0) {
                            class_333Var2.m[i70 + (i71 * (i4 > 32 ? i4 : 32))] = 3153952;
                        }
                    }
                }
            }
        }
        if (itemCompositionLookupItem.p != -1) {
            int i72 = class_333VarA.r;
            int i73 = class_333VarA.s;
            class_333VarA.r = i4 > 32 ? i4 : 32;
            class_333VarA.s = i4 > 32 ? i4 : 32;
            if (itemCompositionLookupItem.p == 1850) {
                class_333VarA.f(0, -1);
            } else {
                class_333VarA.f(0, 0);
            }
            class_333VarA.r = i72;
            class_333VarA.s = i73;
        }
        if (!z && i3 == 0) {
            k.a(class_333Var2, i);
        }
        class_210.a(i43, i44, iArr8, (float[]) null);
        class_210.c(i48, i45, i46, i47);
        class_332.s = i41;
        class_332.t = i42;
        class_332.x = iArr7;
        class_332.p = true;
        class_332.q = true;
        if (itemCompositionLookupItem.C) {
            class_333Var2.r = i4 > 32 ? i4 + 1 : 33;
        } else {
            class_333Var2.r = i4 > 32 ? i4 : 32;
        }
        class_333Var2.s = i2;
        class_333Var2.h = Integer.valueOf(i4);
        if (i37 == -1 && a(itemCompositionLookupItem, i)) {
            class_333Var2.h = -1;
        }
        return class_333Var2;
    }

    public ColorUtility h(int i) {
        if (this.P != null && i > 1) {
            int i2 = -1;
            for (int i3 = 0; i3 < 10; i3++) {
                if (i >= this.ab[i3] && this.ab[i3] != 0) {
                    i2 = this.P[i3];
                }
            }
            if (i2 != -1) {
                return lookupItem(i2).h(1);
            }
        }
        if (this.itemId == 3241 || this.itemId == 28807) {
            boolean z = Configuration.N;
            try {
                if (!Configuration.N) {
                    Configuration.N = true;
                }
                Player.aJ = true;
                Player.aK = true;
                if (Client.eR.c() != null) {
                    try {
                        ColorUtility colorUtilityC = Client.eR.c(false);
                        Player.aK = false;
                        Player.aJ = false;
                        Configuration.N = z;
                        Configuration.N = z;
                        Player.aJ = false;
                        Player.aK = false;
                        return colorUtilityC;
                    } catch (Throwable th) {
                        Player.aK = false;
                        Player.aJ = false;
                        throw th;
                    }
                }
                Configuration.N = z;
                Player.aJ = false;
                Player.aK = false;
            } catch (Throwable th2) {
                Configuration.N = z;
                Player.aJ = false;
                Player.aK = false;
                throw th2;
            }
        }
        class_30 class_30Var = (class_332.h && e.a()) ? m : l;
        boolean z2 = Client.ba && Client.bb == this.itemId;
        ColorUtility colorUtility = z2 ? null : (ColorUtility) class_30Var.a(this.itemId);
        if (colorUtility != null) {
            colorUtility.A = true;
            return colorUtility;
        }
        class_49 class_49Var = ColorUtility.h;
        class_83.a(this.ar);
        try {
            ColorUtility colorUtilityA = ColorUtility.a(this.A, class_49Var);
            class_83.a(false);
            if (colorUtilityA == null) {
                return null;
            }
            colorUtilityA.A = true;
            class_313.d().a(class_268.a, this, colorUtilityA);
            if (this.aw != null) {
                this.aw.a(colorUtilityA);
            } else if (this.itemId < 21706 || this.itemId > 21708) {
                try {
                    setItemDefaultValues(this, colorUtilityA, this.itemId);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                b(colorUtilityA, 60);
            }
            if (this.t != 128 || this.O != 128 || this.N != 128) {
                colorUtilityA.b(this.t, this.N, this.O);
            }
            if (this.g != null) {
                for (int i4 = 0; i4 < this.g.length; i4++) {
                    colorUtilityA.i(this.g[i4], this.h[i4]);
                }
            }
            if (this.V) {
                colorUtilityA.b(20 + this.X, 768 + this.I, -50, -10, -50, true);
            } else if (this.itemName != null && (this.itemName.toLowerCase().contains("token (20") || this.itemName.toLowerCase().contains(" icon"))) {
                colorUtilityA.b(90 + this.X, 768 + this.I, -50, -10, -50, true);
            } else if (this.itemId == 20698) {
                colorUtilityA.b(120 + this.X, 768 + this.I, -50, -10, -50, true);
            } else {
                colorUtilityA.b(74 + this.X, 768 + this.I, -50, -10, -50, true);
            }
            colorUtilityA.aN = true;
            if (!z2) {
                class_30Var.a(colorUtilityA, this.itemId);
            }
            return colorUtilityA;
        } catch (Throwable th3) {
            class_83.a(false);
            throw th3;
        }
    }

    public ColorUtility i(int i) {
        if (this.P != null && i > 1) {
            int i2 = -1;
            for (int i3 = 0; i3 < 10; i3++) {
                if (i >= this.ab[i3] && this.ab[i3] != 0) {
                    i2 = this.P[i3];
                }
            }
            if (i2 != -1) {
                return lookupItem(i2).i(1);
            }
        }
        ColorUtility colorUtilityA = ColorUtility.a(this.A, this.ar);
        if (colorUtilityA == null) {
            return null;
        }
        if (this.g != null) {
            for (int i4 = 0; i4 < this.g.length; i4++) {
                colorUtilityA.i(this.g[i4], this.h[i4]);
            }
        }
        return colorUtilityA;
    }

    public static int j(int i) {
        return lookupItem(i).A;
    }

    public void decode(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                return;
            }
            if (iY == 1) {
                this.A = buffer.A();
            } else if (iY == 2) {
                if (Configuration.aa && c.w_(this.itemId)) {
                    String str = c.b(this.itemId).itemName;
                    this.x = str;
                    this.itemName = str;
                    buffer.G();
                } else {
                    String strF = buffer.F();
                    this.x = strF;
                    this.itemName = strF;
                }
            } else if (iY == 3) {
                buffer.I();
            } else if (iY == 4) {
                this.G = buffer.A();
            } else if (iY == 5) {
                this.M = buffer.A();
            } else if (iY == 6) {
                this.Z = buffer.A();
            } else if (iY == 7) {
                this.v = buffer.A();
                if (this.v > 32767) {
                    this.v -= 65536;
                }
            } else if (iY == 8) {
                this.W = buffer.A();
                if (this.W > 32767) {
                    this.W -= 65536;
                }
            } else if (iY == 10) {
                buffer.A();
            } else if (iY == 11) {
                this.C = true;
            } else if (iY == 12) {
                this.f = buffer.A();
            } else if (iY == 16) {
                this.n = true;
            } else if (iY == 23) {
                this.r = buffer.A();
                this.ag = buffer.z();
            } else if (iY == 24) {
                this.K = buffer.A();
            } else if (iY == 25) {
                this.aa = buffer.A();
                this.ak = buffer.z();
            } else if (iY == 26) {
                this.q = buffer.A();
            } else if (iY < 30 || iY >= 35) {
                if (iY < 35 || iY >= 40) {
                    if (iY == 40) {
                        int iY2 = buffer.y();
                        this.g = new int[iY2];
                        this.h = new int[iY2];
                        for (int i = 0; i < iY2; i++) {
                            this.g[i] = buffer.A();
                            this.h[i] = buffer.A();
                        }
                    } else if (iY == 78) {
                        this.J = buffer.A();
                    } else if (iY == 79) {
                        this.o = buffer.A();
                    } else if (iY == 90) {
                        this.B = buffer.A();
                    } else if (iY == 91) {
                        this.Y = buffer.A();
                    } else if (iY == 92) {
                        this.s = buffer.A();
                    } else if (iY == 93) {
                        this.z = buffer.A();
                    } else if (iY == 95) {
                        this.ae = buffer.A();
                    } else if (iY == 97) {
                        this.F = buffer.A();
                    } else if (iY == 98) {
                        this.p = buffer.A();
                    } else if (iY >= 100 && iY < 110) {
                        if (this.P == null) {
                            this.P = new int[10];
                            this.ab = new int[10];
                        }
                        this.P[iY - 100] = buffer.A();
                        this.ab[iY - 100] = buffer.A();
                    } else if (iY == 110) {
                        this.t = buffer.A();
                    } else if (iY == 111) {
                        this.O = buffer.A();
                    } else if (iY == 112) {
                        this.N = buffer.A();
                    } else if (iY == 113) {
                        this.X = buffer.z();
                    } else if (iY == 114) {
                        this.I = buffer.z() * 5;
                    } else if (iY == 115) {
                        this.ac = buffer.y();
                    } else if (iY == 116) {
                        buffer.A();
                    } else if (iY == 117) {
                        buffer.A();
                    }
                } else if (Configuration.aa && c.w_(this.itemId)) {
                    this.inventoryActions = c.b(this.itemId).inventoryActions;
                    buffer.G();
                } else {
                    if (this.inventoryActions == null) {
                        this.inventoryActions = new String[5];
                    }
                    this.inventoryActions[iY - 35] = buffer.F();
                    if (this.inventoryActions[iY - 35].equalsIgnoreCase("null")) {
                        this.inventoryActions[iY - 35] = null;
                    }
                }
            } else if (Configuration.aa && c.w_(this.itemId)) {
                this.u = c.b(this.itemId).u;
                buffer.G();
            } else {
                if (this.u == null) {
                    this.u = new String[5];
                }
                this.u[iY - 30] = buffer.F();
                if (this.u[iY - 30].equalsIgnoreCase("hidden")) {
                    this.u[iY - 30] = null;
                }
            }
        }
    }

    public ItemComposition() {
        this.ar = false;
        this.as = -1;
        this.at = -1;
        this.au = -3;
        this.av = -1;
        this.ax = false;
        this.itemId = -1;
    }

    public ItemComposition(ItemComposition itemComposition) {
        this.ar = false;
        this.as = -1;
        this.at = -1;
        this.au = -3;
        this.av = -1;
        this.ax = false;
        this.itemId = itemComposition.itemId;
        this.ak = itemComposition.ak;
        this.aj = itemComposition.aj;
        this.ai = itemComposition.ai;
        this.ah = itemComposition.ah;
        this.af = itemComposition.af;
        this.f = itemComposition.f;
        this.g = itemComposition.g;
        this.h = itemComposition.h;
        this.n = itemComposition.n;
        this.o = itemComposition.o;
        this.p = itemComposition.p;
        this.q = itemComposition.q;
        this.r = itemComposition.r;
        this.s = itemComposition.s;
        this.t = itemComposition.t;
        this.u = itemComposition.u;
        this.v = itemComposition.v;
        this.itemName = itemComposition.itemName;
        this.x = itemComposition.x;
        this.z = itemComposition.z;
        this.A = itemComposition.A;
        this.B = itemComposition.B;
        this.C = itemComposition.C;
        this.description = itemComposition.description;
        this.F = itemComposition.F;
        this.G = itemComposition.G;
        this.I = itemComposition.I;
        this.J = itemComposition.J;
        this.K = itemComposition.K;
        this.inventoryActions = itemComposition.inventoryActions;
        this.M = itemComposition.M;
        this.N = itemComposition.N;
        this.O = itemComposition.O;
        this.P = itemComposition.P;
        this.W = itemComposition.W;
        this.X = itemComposition.X;
        this.Y = itemComposition.Y;
        this.Z = itemComposition.Z;
        this.aa = itemComposition.aa;
        this.ab = itemComposition.ab;
        this.ac = itemComposition.ac;
        this.ae = itemComposition.ae;
        this.ag = itemComposition.ag;
    }

    public void a(ItemComposition itemComposition) {
        this.ar = itemComposition.ar;
        this.ak = itemComposition.ak;
        this.aj = itemComposition.aj;
        this.ai = itemComposition.ai;
        this.ah = itemComposition.ah;
        this.af = itemComposition.af;
        this.f = itemComposition.f;
        this.g = a(itemComposition.g);
        this.h = a(itemComposition.h);
        this.n = itemComposition.n;
        this.o = itemComposition.o;
        this.q = itemComposition.q;
        this.r = itemComposition.r;
        this.s = itemComposition.s;
        this.t = itemComposition.t;
        this.u = b(itemComposition.u);
        this.v = itemComposition.v;
        this.itemName = itemComposition.itemName;
        this.x = itemComposition.x;
        this.z = itemComposition.z;
        this.A = itemComposition.A;
        this.B = itemComposition.B;
        this.C = itemComposition.C;
        this.description = itemComposition.description;
        this.G = itemComposition.G;
        this.I = itemComposition.I;
        this.J = itemComposition.J;
        this.K = itemComposition.K;
        this.inventoryActions = itemComposition.inventoryActions;
        this.M = itemComposition.M;
        this.N = itemComposition.N;
        this.O = itemComposition.O;
        this.W = itemComposition.W;
        this.X = itemComposition.X;
        this.Y = itemComposition.Y;
        this.Z = itemComposition.Z;
        this.aa = itemComposition.aa;
        this.P = a(itemComposition.P);
        this.ab = a(itemComposition.ab);
        this.ac = itemComposition.ac;
        this.ae = itemComposition.ae;
        this.ag = itemComposition.ag;
        this.as = itemComposition.as;
        this.at = itemComposition.at;
        this.au = itemComposition.au;
        this.av = itemComposition.av;
        this.ax = itemComposition.ax;
    }

    public static void a(ItemComposition itemComposition, ItemComposition itemComposition2) {
        for (String[] strArr : aA) {
            if (a(itemComposition.inventoryActions, strArr)) {
                itemComposition2.inventoryActions = strArr;
                return;
            }
        }
        itemComposition2.inventoryActions = new String[itemComposition.inventoryActions.length];
        System.arraycopy(itemComposition.inventoryActions, 0, itemComposition2.inventoryActions, 0, itemComposition2.inventoryActions.length);
    }

    public static void b(ItemComposition itemComposition, ItemComposition itemComposition2) {
        if (a(itemComposition.u, az)) {
            itemComposition2.u = az;
        } else {
            itemComposition2.u = new String[itemComposition.u.length];
            System.arraycopy(itemComposition.u, 0, itemComposition2.u, 0, itemComposition2.u.length);
        }
    }

    private static boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null || strArr2[i] != null) {
                if (strArr[i] != null && strArr2[i] == null && !strArr[i].equals("null")) {
                    return false;
                }
                if ((strArr[i] == null && strArr2[i] != null && !strArr2[i].equals("null")) || !strArr[i].equals(strArr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[] a(Object obj) {
        if (obj == null) {
            return null;
        }
        int[] iArr = (int[]) obj;
        return Arrays.copyOf(iArr, iArr.length);
    }

    private String[] b(Object obj) {
        if (obj == null) {
            return null;
        }
        String[] strArr = (String[]) obj;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
