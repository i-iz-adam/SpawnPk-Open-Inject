package rs;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.aq;
import java.util.Arrays;
import org.apache.commons.a.F;
import org.lwjgl.opencl.AMDDeviceAttributeQuery;
import org.lwjgl.opencl.CL11;
import org.lwjgl.opencl.CL12;
import org.lwjgl.opencl.CL20;
import org.lwjgl.opencl.EXTDeviceFission;
import org.lwjgl.opencl.INTELUnifiedSharedMemory;
import org.lwjgl.opencl.INTELVAAPIMediaSharing;
import org.lwjgl.opencl.KHRCommandBuffer;
import org.lwjgl.opencl.QCOMEXTHostPtr;
import org.lwjgl.opengl.CGL;
import org.lwjgl.opengl.EXTTextureCompressionLATC;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.NVCopyDepthToColor;
import org.lwjgl.opengl.NVMemoryAttachment;
import org.lwjgl.opengl.NVMeshShader;
import org.lwjgl.opengl.NVPathRendering;
import org.lwjgl.system.linux.FCNTL;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_102.class */
public final class class_102 {
    public static class_48 b;
    public static class_620 c;
    public static final int d = 2017;
    public static int e;
    public boolean h;
    public class_59 i;
    private static int ag;
    private static Buffer ah;
    public String o;
    public String[] p;
    public int[] s;
    private static int[] ai;
    public int[] t;
    public int[] v;
    public static class_102[] z;
    public static Client A;
    public int D;
    public int[] G;
    public byte[] H;
    public int J;
    public int[] L;
    public byte P;
    public String X;
    public String[] ae;
    public static boolean a = true;
    public static int f = 0;
    public static class_30 M = new class_30(150);
    public static class_30 N = new class_30(300);
    public boolean g = true;
    public boolean O = true;
    public int Q = -1;
    public int R = -1;
    public int S = 0;
    public int T = 0;
    public int U = -8;
    public int V = -15;
    public int W = 15;
    public boolean Y = false;
    public boolean Z = false;
    public int aa = -1;
    public int ab = -1;
    public int ac = -1;
    public int ad = -1;
    public boolean af = false;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public byte r = 1;
    public int u = -1;
    public int w = -1;
    public long x = -1;
    public int y = 32;
    public int B = -1;
    public boolean C = true;
    public int E = 128;
    public boolean F = true;
    public int I = 128;
    public boolean K = false;

    public static void a(ColorUtility colorUtility, int i, int i2) {
        if (Configuration.M) {
            if (Configuration.r == class_150.d) {
                if (i != 6184) {
                    colorUtility.a(4550, new int[]{100});
                }
                colorUtility.a(127, new int[]{12});
                colorUtility.a(6798, new int[]{12});
                if (i == 5529) {
                    colorUtility.a(3470, new int[]{12});
                    colorUtility.a(3594, new int[]{14});
                    colorUtility.a(GL11.GL_INDEX_SHIFT, new int[]{16});
                    colorUtility.a(3226, new int[]{10});
                    colorUtility.a(GL11.GL_ZOOM_X, new int[]{8});
                }
                if (i == 41) {
                    colorUtility.a(6466, new int[]{4053});
                    colorUtility.a(6474, new int[]{4043});
                    colorUtility.a(6470, new int[]{4033});
                }
                if (i == 1488) {
                    colorUtility.a(5437, new int[]{4053});
                    colorUtility.a(7706, new int[]{15});
                    colorUtility.a(7587, new int[]{10});
                }
                if (i == 7605) {
                    colorUtility.a(aU.IS, new int[]{4040});
                    colorUtility.a(8644, new int[]{15});
                    colorUtility.a(aU.IK, new int[]{10});
                    colorUtility.a(9164, new int[]{25});
                }
            }
            if (Configuration.r == class_150.c) {
                if (i == 1488) {
                    colorUtility.a(5437, new int[]{120});
                    colorUtility.a(7706, new int[]{926});
                    colorUtility.a(7587, new int[]{920});
                }
                if (i == 7605) {
                    colorUtility.a(aU.IS, new int[]{926});
                    colorUtility.a(8644, new int[]{120});
                    colorUtility.a(aU.IK, new int[]{110});
                    colorUtility.a(9164, new int[]{95});
                }
            }
            if (Configuration.r == class_150.b) {
                if (i == 1488) {
                    colorUtility.a(5437, new int[]{120});
                    colorUtility.a(7706, new int[]{36150});
                    colorUtility.a(7587, new int[]{36150});
                }
                if (i == 7605) {
                    colorUtility.a(aU.IS, new int[]{36150});
                    colorUtility.a(8644, new int[]{120});
                    colorUtility.a(aU.IK, new int[]{110});
                    colorUtility.a(9164, new int[]{95});
                }
            }
            switch (i) {
                case User32.VK_ZOOM /* 251 */:
                    colorUtility.b(new int[]{7752, 10308, 10316, 10304}, new int[]{53, 53, 53, 53});
                    break;
                case 410:
                    colorUtility.a(8741, new int[]{3});
                    colorUtility.a(25238, new int[]{3});
                    colorUtility.a(908, new int[]{3});
                    colorUtility.a(aU.JH, new int[]{3});
                    break;
                case g.c /* 412 */:
                case 419:
                    colorUtility.a(new int[]{4550, 6798}, 54);
                    break;
                case 414:
                    colorUtility.a(new int[]{4550}, 71);
                    break;
                case 441:
                    colorUtility.b(new int[]{54804, 54693, 55190, 55184, 54571, 54926, 36372, 43943, 43443}, new int[]{102, 62, 102, 102, 102, 62, 102, 102, 62});
                    break;
                case 492:
                    colorUtility.b(new int[]{10343, 37929, 37925, 38044, 35720, 38049, 38040, 31419, 43059, 43057, 43916, 43076, 43908, 43061, 43043, 43113, 43220, 43080, 43055, 43038, 43051, 43034}, new int[]{56, 54, 54, 56, 56, 56, 54, 54, 54, 54, 54, 54, 54, 54, 56, 54, 54, 56, 54, 54, 56, 54});
                    break;
                case 493:
                    colorUtility.b(new int[]{10343, 37929, 37925, 38044, 35720, 38049, 38040, 31419, 43059, 43057, 43916, 43076, 43908, 43061, 43043, 43113, 43220, 43080, 43055, 43038, 43051, 43034}, new int[]{60, 57, 57, 60, 60, 60, 57, 57, 57, 57, 57, 57, 57, 57, 60, 57, 57, 60, 57, 57, 60, 57});
                    break;
                case CGL.kCGLGOUseBuildCache /* 506 */:
                    colorUtility.b(new int[]{10293, 13485, 18, 10297, 13497, 13501, aU.Ix, 31419, 13481}, new int[]{60, 60, 60, 60, 60, 60, 60, 68, 60});
                    colorUtility.g(3);
                    break;
                case 700:
                    colorUtility.a(new int[]{6323, 8410, 2368, 3621}, 53);
                    break;
                case aU.hF /* 725 */:
                case aU.hG /* 726 */:
                case aU.Ij /* 8458 */:
                    colorUtility.b(new int[]{aU.gA, 673, 553, 549, 0, 4, 8, 12, 16, 20, 24, 5272, 5276, 5392, 5281, 8656, 61, aU.xC, 10351, 43164, aU.yn, 43061, 43053, 43026, 0, 3008, 49, 84, 64, 43912, 43685, 43924, 43982, 10004, 7700, 926, 6032, 11200, 40, 924, 8090, 8741}, new int[]{55, 55, 55, 55, 72, 72, 72, 72, 72, 72, 72, 55, 55, 55, 55, 55, 55, 72, 55, 55, 72, 72, 72, 55, 72, 72, 55, 72, 55, 72, 55, 55, 55, 55, 55, 72, 72, 72, 72, 55, 60, 60});
                    colorUtility.a(8741, new int[]{3});
                    colorUtility.a(25238, new int[]{3});
                    colorUtility.a(38814, new int[]{3});
                    colorUtility.a(4550, new int[]{127});
                    colorUtility.a(8090, new int[]{3});
                    colorUtility.a(6798, new int[]{57182});
                    colorUtility.a(8741, new int[]{57182});
                    break;
                case aU.id /* 749 */:
                    colorUtility.b(new int[]{0, User32.WM_PARENTNOTIFY, aU.gu, 43150, 7326, 7446, QCOMEXTHostPtr.CL_DEVICE_PAGE_SIZE_QCOM, 16425, 16540, 7331}, new int[]{62, 62, 62, 62, 60, 60, 60, 60, 60, 62});
                    break;
                case aU.ii /* 754 */:
                    colorUtility.b(new int[]{43150, 43034, 37, 33}, new int[]{71, 71, 71, 71});
                    colorUtility.g(25, -1);
                    break;
                case aU.iS /* 790 */:
                    colorUtility.b(new int[]{aU.gA, 673, 553, 549, 0, 4, 8, 12, 16, 20, 24, 5272, 5276, 5392, 5281, 8656, 61, aU.xC, 10351, 43164, aU.yn, 43061, 43053, 43026, 0, 3008, 49, 84, 64, 43912, 43685, 43924, 43982, 10004, 7700, 926, 6032, 11200, 40, 924, 8090, 8741}, new int[]{72, 72, 72, 72, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 72, 60, 72, 72, 72, 72, 72, 60, 72, 72, 60, 60, 60, 60, 72, 72, 72, 55, 55, 55, 55, 55, 55, 60, 60, 60});
                    colorUtility.a(8741, new int[]{3});
                    colorUtility.a(25238, new int[]{3});
                    colorUtility.a(38814, new int[]{3});
                    colorUtility.a(4550, new int[]{127});
                    colorUtility.a(8090, new int[]{3});
                    colorUtility.a(6798, new int[]{57182});
                    colorUtility.a(8741, new int[]{57182});
                    break;
                case 802:
                    colorUtility.b(new int[]{43150, 43034, 37, 33}, new int[]{62, 62, 62, 62});
                    break;
                case 860:
                    colorUtility.a(new int[]{9643, 9763, 8406, 8070, 9647, 9878}, 54);
                    break;
                case User32.WM_AFXFIRST /* 864 */:
                    colorUtility.b(new int[]{63, 56, 56, 56, 63});
                    break;
                case 910:
                case User32.WM_PENWINLAST /* 911 */:
                    colorUtility.b(new int[]{1690, 910, 912, 14990, 0}, new int[]{54, 54, 54, 54, 60});
                    break;
                case 984:
                    colorUtility.b(new int[]{1690, 910, 912, 14990, 0}, new int[]{60, 60, 60, 60, 62});
                    break;
                case aU.jy /* 1053 */:
                    colorUtility.g(3);
                    break;
                case aU.md /* 1234 */:
                    colorUtility.b(new int[]{123, 127, 22410, 29113, 908, 937}, new int[]{58, 58, 58, 58, 58, 58});
                    break;
                case aU.me /* 1235 */:
                    colorUtility.b(new int[]{123, 127, 22410, 29113, 908, 937, aU.zM, 123, 22410, 4550, 947, 5813, 11200}, new int[]{60, 59, 59, 59, 59, 59, 60, 60, 60, 63, 60, 60, 59});
                    break;
                case aU.oh /* 1350 */:
                    colorUtility.a(new int[]{5524, 5404, 5285, 5409, 5289, 5293, 5297, 5301, 5400}, 62);
                    colorUtility.g(950);
                    colorUtility.a(950, new int[]{3, 5, 7});
                    break;
                case 1574:
                case 1575:
                    colorUtility.b(new int[]{3862, 2842}, new int[]{62, 62});
                    colorUtility.g(3);
                    break;
                case 1586:
                    colorUtility.b(new int[]{2716, 1560, GL11.GL_LINE_STIPPLE_PATTERN, aq.L, 7993, 902, User32.WM_MBUTTONUP, aU.DQ, aU.tF, aU.gw, 2714, 2857, User32.WM_SYSCHAR, 4, User32.WM_MOUSEWHEEL, aU.gu, 69, 24, 3761, 7882}, new int[]{60, 40, 40, 60, 40, 60, 40, 40, 60, 60, 40, 60, 60, 60, 60, 60, 60, 60, 60, 60});
                    break;
                case 1597:
                    colorUtility.b(new int[]{AMDDeviceAttributeQuery.CL_DEVICE_GFXIP_MINOR_AMD, aU.KT, EXTDeviceFission.CL_DEVICE_PARTITION_BY_COUNTS_EXT, 16474, EXTDeviceFission.CL_DEVICE_REFERENCE_COUNT_EXT, EXTDeviceFission.CL_DEVICE_PARENT_DEVICE_EXT, 16464, 16484, 16481, 16461, 16439, 16434, 16429, aU.KN, aU.KQ, aU.KW, aU.KZ, 36007, 815, 914, 675, 784, 4820, 945, aU.gR, 5458, 972}, new int[]{61, 51, 60, 61, 60, 61, 60, 51, 60, 60, 60, 60, 60, 60, 60, 60, 60, 53, 53, 61, 61, 61, 51, 51, 51, 51, 51});
                    break;
                case aU.sk /* 1733 */:
                case aU.Cl /* 6830 */:
                    colorUtility.a(new int[]{aU.hs, 152}, new int[]{13});
                    colorUtility.a(new int[]{User32.WM_SYSCHAR, 167, 0, 980, 962, User32.WM_INITDIALOG, 582, 158}, new int[]{5});
                    colorUtility.a(new int[]{955}, new int[]{1});
                    colorUtility.a(new int[]{65459, 43968, 20288}, new int[]{380770});
                    colorUtility.b(new int[]{846, aU.hI, 945}, new int[]{74, 74, 54});
                    break;
                case aU.sl /* 1734 */:
                    colorUtility.a(new int[]{User32.WM_INITDIALOG, 158, aU.hs, User32.WM_SYSCHAR}, new int[]{5});
                    colorUtility.a(new int[]{945}, new int[]{13});
                    colorUtility.b(new int[]{960, 582, aU.hI}, new int[]{74, 54, 54});
                    break;
                case aU.te /* 1781 */:
                    colorUtility.b(new int[]{7496, 7479, 8078, 7599, 7355, 7471, 7488}, new int[]{62, 62, 258, 258, 62, 62, 62});
                    break;
                case 1839:
                    colorUtility.a(0, new int[]{916, User32.WM_PENWINLAST, 916});
                    colorUtility.a(G.cu, new int[]{916, 920, 916});
                    colorUtility.b(new int[]{127, 916, 920, User32.WM_PENWINLAST}, new int[]{72, 55, 55, 55});
                    break;
                case 1840:
                    colorUtility.a(0, new int[]{916, User32.WM_PENWINLAST, 916});
                    colorUtility.a(G.cu, new int[]{916, 920, 916});
                    colorUtility.b(new int[]{127}, new int[]{113});
                    break;
                case 1841:
                case 1842:
                    colorUtility.a(1938, new int[]{59730});
                    colorUtility.a(910, new int[]{59705});
                    colorUtility.a(aU.tL, new int[]{59715});
                    colorUtility.b(new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{55, 56, 55, 55, 24, 56, 56, 56, 55, 56, 55, 56});
                    break;
                case 1843:
                    colorUtility.a(10145, new int[]{3738});
                    colorUtility.a(10138, new int[]{3730});
                    colorUtility.a(43928, new int[]{3746});
                    colorUtility.a(61555, new int[]{3740});
                    break;
                case 1844:
                    if (colorUtility != null) {
                        colorUtility.a(22024, new int[]{5});
                        colorUtility.a(21776, new int[]{905});
                        colorUtility.a(22402, new int[]{905});
                        colorUtility.b(new int[]{905, 904, 929, 103, 910}, new int[]{75, 75, 75, 75, 80});
                    }
                    break;
                case 1848:
                case 1871:
                    colorUtility.a(929, new int[]{g.r, 905, 903, 902, 901});
                    colorUtility.a(4550, new int[]{10, 9, 8, 7, 8});
                    colorUtility.b(new int[]{929, 127, 914, 2954, 55180, 57228}, new int[]{229, 229, 229, 229, 229, 229});
                    break;
                case 1849:
                case 1865:
                    colorUtility.a(5640, new int[]{910});
                    colorUtility.a(CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, new int[]{5});
                    colorUtility.a(4750, new int[]{15});
                    colorUtility.a(9135, new int[]{7114});
                    colorUtility.a(5388, new int[]{925});
                    colorUtility.b(new int[]{8363}, new int[]{60});
                    break;
                case 1866:
                    colorUtility.a(new int[]{9135, 8363, 7403}, new int[]{g.r, 910, 915});
                    colorUtility.a(new int[]{5640}, new int[]{5});
                    colorUtility.a(new int[]{CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER, 4750, 38119, 5388}, new int[]{g.r});
                    colorUtility.a(new int[]{898}, new int[]{950, 945, 935});
                    break;
                case 1868:
                    colorUtility.a(new int[]{908, 904}, new int[]{932, 935, 933});
                    colorUtility.a(new int[]{aU.uO, aU.uQ, aU.tJ}, new int[]{914, 915, 913});
                    break;
                case aU.uh /* 1901 */:
                case aU.ui /* 1902 */:
                case aU.uk /* 1904 */:
                    if (colorUtility != null) {
                        colorUtility.g(70, -1);
                        colorUtility.a(4382, new int[]{36190, 36195, 36185});
                        colorUtility.a(4785, new int[]{36185, 36192, 36180});
                        colorUtility.a(4661, new int[]{36170, 36175, 36160});
                        colorUtility.a(4626, new int[]{36190, 36195});
                        colorUtility.a(4781, new int[]{126});
                        colorUtility.a(8427, new int[]{127});
                        colorUtility.b(new int[]{127}, new int[]{116});
                    }
                    break;
                case aU.ul /* 1905 */:
                    if (colorUtility != null) {
                        colorUtility.g(70, -1);
                        colorUtility.a(4382, new int[]{36190, 36195, 36185});
                        colorUtility.a(4785, new int[]{36185, 36192, 36180});
                        colorUtility.a(4661, new int[]{36170, 36175, 36160});
                        colorUtility.a(4626, new int[]{36190, 36195});
                        colorUtility.a(4781, new int[]{25});
                        colorUtility.a(8427, new int[]{127});
                        colorUtility.b(new int[]{127}, new int[]{116});
                    }
                    break;
                case aU.um /* 1906 */:
                case 3154:
                    if (colorUtility != null) {
                        colorUtility.a(24, new int[]{2});
                        colorUtility.a(16, new int[]{2});
                        colorUtility.a(0, new int[]{930});
                        colorUtility.a(39021, new int[]{5});
                        colorUtility.a(38119, new int[]{25});
                        colorUtility.a(41050, new int[]{10});
                        colorUtility.a(41059, new int[]{10});
                        colorUtility.a(43109, new int[]{10});
                        colorUtility.a(41050, new int[]{10});
                        colorUtility.a(41050, new int[]{10});
                        colorUtility.b(new int[]{11175, 8862, 9108, 576, aU.gX, aU.hb, aU.gT, 23081, 22300, 23329, 23448}, new int[]{56, 56, 56, 60, 60, 60, 60, 56, 56, 56, 56});
                    }
                    break;
                case aU.uP /* 1935 */:
                    colorUtility.a(22024, new int[]{374390});
                    colorUtility.a(21776, new int[]{905});
                    colorUtility.a(22402, new int[]{905});
                    colorUtility.b(new int[]{905, 904, 929, 103, 910, 374390}, new int[]{54, 54, 54, 54, 74, 148});
                    break;
                case aU.uQ /* 1936 */:
                    colorUtility.a(22024, new int[]{47627});
                    colorUtility.a(21776, new int[]{905});
                    colorUtility.a(22402, new int[]{905});
                    colorUtility.b(new int[]{905, 904, 929, 103, 910, 47627}, new int[]{52, 52, 52, 52, 63, 179});
                    break;
                case aU.uR /* 1937 */:
                    colorUtility.a(22024, new int[]{127});
                    colorUtility.a(21776, new int[]{905});
                    colorUtility.a(22402, new int[]{905});
                    colorUtility.b(new int[]{905, 904, 929, 103, 910, 127}, new int[]{60, 60, 60, 60, 97, 254});
                    colorUtility.g(0, -1);
                    break;
                case 1938:
                    colorUtility.a(22024, new int[]{127, 126});
                    colorUtility.a(21776, new int[]{905});
                    colorUtility.a(22402, new int[]{905});
                    colorUtility.b(new int[]{905, 904, 929, 103, 910, 127, 126}, new int[]{255, 255, 255, 255, 255, 197, 197});
                    colorUtility.g(0, -1);
                    break;
                case 1951:
                    if (colorUtility != null) {
                        colorUtility.a(0, new int[]{1});
                        colorUtility.a(39021, new int[]{359770});
                        colorUtility.a(38119, new int[]{359770});
                        colorUtility.a(41050, new int[]{359770});
                        colorUtility.a(41059, new int[]{359770});
                        colorUtility.a(43109, new int[]{359770});
                        colorUtility.a(41050, new int[]{359770});
                        colorUtility.a(41050, new int[]{359770});
                        colorUtility.b(new int[]{11175, 8862, 9108, 576, aU.gX, aU.hb, aU.gT, 23081, 22300, 23329, 23448, 24, 16}, new int[]{53, 53, 53, 58, 58, 58, 58, 53, 53, 53, 119, 119, 119});
                    }
                    break;
                case 2017:
                    colorUtility.b(new int[]{7502, 29976, 27819, 29980, 28302}, new int[]{54, 58, 54, 54, 54, 58, 54, 54, 54, 54});
                    break;
                case 2344:
                    colorUtility.b(new int[]{148425, 8417, User32.WM_QUERYUISTATE, 10312, CGL.kCGLCESurfaceBackingSize, 181, 49189, 10304, 3123, 49304, 49313, 49193, 13297, CGL.kCGLCESurfaceBackingSize, 8417, 8425, 181, 10312, 10308, 49189, 3123, 49193, 49304, 49313, 10304, 1254319, 58526, 58646, 54315, 8421, 8425, 58539, GL11.GL_DEPTH_BITS, 181, 35, 8417, 54323, 3406, aU.nN, 7628, 7632, 7764, aU.rN, 54311, CGL.kCGLCESurfaceBackingSize, 301, User32.WM_QUERYUISTATE, 417, 3604, User32.WM_UNINITMENUPOPUP, 2578, 2954, 28305, 14297, 15297, 13297, 10308, CGL.kCGLCESurfaceBackingSize, 301, User32.WM_QUERYUISTATE, 181, User32.WM_UNINITMENUPOPUP, 5161, 5157, 5281, 5169, 5276, 5272}, new int[]{60, 60, 60, 54, 54, 54, 60, 60, 54, 54, 54, 60, 60, 60, 60, 54, 54, 54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54});
                    break;
                case 2345:
                    colorUtility.b(new int[]{899, 54443, 54447, 54435, 59437, 54329, User32.WM_PARENTNOTIFY, 54321, 7362, aU.GK, 284, 280, 404, aU.GT, G.aC, 2213, 51078, 24, G.aF, 274, 8377, 7349, 8369, 7341, 8361, G.cc, 45245, 45254, 45241, 45237, 45250, 54410, 50450, 50330, 50334, 45361, aU.GP, aU.GX, 278, 61, 49, 54333, 54338, 54342, 22, 18, User32.WM_ENTERIDLE, 165}, new int[]{60, 54, 54, 54, 54, 60, 60, 60, 60, 60, 60, 54, 60, 54, 60, 54, 54, 60, 54, 54, 60, 54, 54, 60, 54, 60, 60, 54, 60, 60, 60, 60, 54, 60, 54, 60, 60, 54, 54, 60, 54, 54, 60, 54, 60, 60, 54, 60, 60});
                    break;
                case 2346:
                    colorUtility.b(new int[]{54371, 52323, 54348, class_238.p, 52446, 52442, 55527, 57575, 2588, 2469, 2593, 11815, 8377, aU.GK, aU.GT, 2595, 2590, 10324, aU.uO, 10332, 10295, 10308, 54480, 54472, 54476, 54488, 56545, 55646, 49226, 49234, 48198, 54443}, new int[]{60, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 54, 60, 54, 60, 54, 54, 60, 54, 54, 60, 54, 54, 60, 54, 60, 60, 54, 60, 60, 60, 60});
                    break;
                case 2347:
                    colorUtility.b(new int[]{3261, 3266, 301, User32.WM_UNINITMENUPOPUP, GL11.GL_PIXEL_MAP_I_TO_A_SIZE, 59548, 59544, 59664, 3369, 3373, 8410, 8414, 59553, 7390, 7510, 59429, 7399, 59540, 198, 7403, 206, aU.hm_, 3365, 214, 111, GL11.GL_MAX_LIGHTS}, new int[]{60, 60, 60, 60, 60, 54, 60, 60, 60, 60, 54, 60, 54, 54, 60, 60, 54, 60, 60, 54, 60, 54, 60, 60, 60, 60, 60});
                    break;
                case 2523:
                case 5871:
                    colorUtility.b(56);
                    break;
                case 2777:
                case 2778:
                    colorUtility.b(new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{68, 69, 69, 69, 69, 60, 60, 68, 60});
                    colorUtility.g(3);
                    break;
                case 2863:
                    colorUtility.b(new int[]{10004, 25238, 8741, 4550, 908, 7073, 0, 5231, 5353, 10004, 61, 72, 98, 89}, new int[]{60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 62, 62, 62, 62});
                    break;
                case GL11.GL_LIST_MODE /* 2864 */:
                    colorUtility.b(new int[]{61, 72, 98, 89, 5231, 5353, 10004, 908, 7073, 0, 25238, 8741}, new int[]{82, 82, 82, 82, 102, 102, 102, 102, 102, 180, 180, 180});
                    colorUtility.g(90, -1);
                    break;
                case 2885:
                case 5875:
                    colorUtility.b(27);
                    break;
                case 3066:
                    colorUtility.b(new int[]{13506, 13501, 13489, 13493, 13497, 5648, aU.gu, 404, 280, 43026, 5772, 10316, 5186, aU.Ah, 10258, 906, 7566, 6674, 10279, 10270}, new int[]{60, 60, 60, 60, 60, 68, 68, 68, 68, 68, 68, 68, 68, 231, 231, 231, 231, 231, 231, 231});
                    break;
                case 3097:
                    colorUtility.b(new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{52, 60, 52, 52, 52});
                    break;
                case 3098:
                    colorUtility.b(new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{118, 62, 118, 118, 118});
                    break;
                case 3099:
                    colorUtility.b(new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{102, 118, 102, 102, 102});
                    break;
                case 3100:
                    colorUtility.b(new int[]{43063, 10339, 23876, 43080, 16912, 16912, 43080}, new int[]{72, 55, 55, 55, 72, 55, 55});
                    colorUtility.a(new int[]{43055}, new int[]{36170});
                    colorUtility.a(new int[]{16912, 14765}, new int[]{36170});
                    colorUtility.a(new int[]{43069, 43063, 43076}, new int[]{61889, 59728, 36170, 59734});
                    break;
                case 3234:
                    colorUtility.b(new int[]{62400, 7446, 7326, 30645, 38156, 38408, 38160}, new int[]{72, 56, 56, 79, 72, 72, 72});
                    colorUtility.a(61718, new int[]{491752});
                    colorUtility.a(new int[]{43086, 43076}, new int[]{491765, 491765});
                    colorUtility.a(new int[]{38036, 38044}, new int[]{359770, 359770});
                    colorUtility.a(new int[]{62748, 58642, 38049}, new int[]{491770, 491770, 491770});
                    break;
                case 3261:
                    colorUtility.b(new int[]{37, 924, 935, 12, 0, 28, 941, 943, 406, User32.WM_EXITMENULOOP, 280, 148, 152}, new int[]{60, 60, 60, 68, 68, 68, 131, 131, 131, 68, 68, 68, 68});
                    colorUtility.h(5, 132);
                    colorUtility.a(24, new int[]{2});
                    colorUtility.a(41, new int[]{2});
                    colorUtility.a(61, new int[]{2});
                    colorUtility.a(12, new int[]{2});
                    colorUtility.a(13, new int[]{2});
                    colorUtility.a(40, new int[]{2});
                    colorUtility.a(20, new int[]{2});
                    colorUtility.a(38, new int[]{2});
                    colorUtility.a(42, new int[]{2});
                    colorUtility.a(9402, new int[]{2});
                    colorUtility.g(0, -1);
                    break;
                case 3262:
                    colorUtility.b(new int[]{37, 924, 935, 12, 0, 28, 941, 943, 406, User32.WM_EXITMENULOOP, 280, 148, 152}, new int[]{60, 60, 60, aU.hu_, aU.hu_, aU.hu_, 231, 231, 231, aU.hu_, aU.hu_, aU.hu_, aU.hu_});
                    colorUtility.h(5, aU.hK_);
                    colorUtility.a(24, new int[]{2});
                    colorUtility.a(41, new int[]{2});
                    colorUtility.a(61, new int[]{2});
                    colorUtility.a(12, new int[]{2});
                    colorUtility.a(13, new int[]{2});
                    colorUtility.a(40, new int[]{2});
                    colorUtility.a(20, new int[]{2});
                    colorUtility.a(38, new int[]{2});
                    colorUtility.a(42, new int[]{2});
                    colorUtility.a(9402, new int[]{2});
                    colorUtility.g(0, -1);
                    break;
                case 3263:
                case 3264:
                    colorUtility.b(new int[]{110343, 15413, 15421, 15405, 16433, g.r, 0, 908, 907, 904, 903, User32.WM_PENWINLAST, 915, 899, 31420, AMDDeviceAttributeQuery.CL_DEVICE_GLOBAL_FREE_MEMORY_AMD, 16656}, new int[]{261, 261, 60, 68, 60, 60, 68, 60, 80, 60, 80, 60, 60, 68, 70, 261, 261});
                    colorUtility.h(5, User32.WM_UNICHAR);
                    colorUtility.g(35, -1);
                    break;
                case 3265:
                    colorUtility.a(new int[]{G.aJ, G.aN, G.aV, G.aF}, new int[]{1});
                    colorUtility.a(new int[]{3235, 3239, 3230, 3243, 43074, 43090}, new int[]{2});
                    colorUtility.b(new int[]{1, 2}, new int[]{261, 186});
                    break;
                case 3557:
                case 3558:
                    colorUtility.a(new int[]{20288, 0, 6466, -17221, 5318, 5202, 5330, 5210, 6241, User32.WM_ENTERIDLE, 6439, 6445, aU.nL, 1139, 6453, 5305, -15164, 5309}, new int[]{1});
                    colorUtility.a(new int[]{1226, 204, -18381, -15193, 214, -15202, -4004, 6245, aU.nD, User32.WM_UNINITMENUPOPUP, 6443, 6447, 6451}, new int[]{2});
                    colorUtility.a(new int[]{-15185, 6449, -15189, 277, 6435, 6261, -4024, 6455, aU.lE, CGL.kCGLCEMPEngine, 6457, -15168}, new int[]{5});
                    colorUtility.b(new int[]{1, 2}, new int[]{208, 277});
                    break;
                case 3694:
                    colorUtility.b(71);
                    break;
                case 3843:
                    colorUtility.b(new int[]{32881, 32875, 33891, 32858, 32821, GL11.GL_EDGE_FLAG_ARRAY, 32846}, new int[]{60, 79, 60, 79, 79, 79, 79});
                    break;
                case 3845:
                    colorUtility.b(new int[]{32881, 32875, 33891, 32858, 32821, GL11.GL_EDGE_FLAG_ARRAY, 32846}, new int[]{80, 60, 80, 60, 60, 60, 60});
                    break;
                case 3960:
                    colorUtility.b(new int[]{62400, 7446, 7326, 30645, 38156, 38408, 38160}, new int[]{74, 74, 74, 74, 74, 74, 74});
                    colorUtility.a(61718, new int[]{52104});
                    colorUtility.a(new int[]{43086, 43076}, new int[]{52097, 52097});
                    colorUtility.a(new int[]{38036, 38044}, new int[]{52104, 52096});
                    colorUtility.a(new int[]{62748, 58642, 38049}, new int[]{311820, 311820, 311820});
                    break;
                case 3961:
                case 3962:
                    colorUtility.b(new int[]{62400, 7446, 7326, 30645, 38156, 38408, 38160, 62748, 58642, 38049, 61718}, new int[]{User32.WM_INITMENUPOPUP, User32.WM_INITMENUPOPUP, User32.WM_INITMENUPOPUP, 70, User32.WM_INITMENUPOPUP, User32.WM_GESTURE, 61, 60, 60, 60, 60});
                    colorUtility.a(61718, new int[]{6970});
                    colorUtility.a(new int[]{43086, 43076}, new int[]{3, 3});
                    colorUtility.a(new int[]{38036, 38044}, new int[]{15, 15});
                    colorUtility.a(new int[]{62748, 58642, 38049}, new int[]{5, 5, 5});
                    break;
                case 3963:
                    colorUtility.b(new int[]{908, User32.WM_THEMECHANGED, 912, 916, 0, 103, 107}, new int[]{70, 70, 70, 70, 61, 61, 61});
                    break;
                case 3965:
                    colorUtility.b(new int[]{62400, 7446, 7326, 30645, 38156, 38408, 38160, 62748, 58642, 38049, 61718, 43086}, new int[]{User32.WM_MENUGETOBJECT, aU.hu_, aU.hu_, 70, aU.hu_, User32.WM_GESTURE, 61, 180, 180, 102, 102, aU.hu_});
                    colorUtility.a(61718, new int[]{6970});
                    colorUtility.a(new int[]{43086, 43076}, new int[]{3, 3});
                    colorUtility.a(new int[]{38036, 38044}, new int[]{7, 7});
                    colorUtility.a(new int[]{62748, 58642, 38049}, new int[]{3, 3, 3});
                    break;
                case aU.vT /* 4004 */:
                    colorUtility.b(new int[]{47661, 466, 47657}, new int[]{54, 54, 54});
                    break;
                case 4017:
                    colorUtility.b(new int[]{10502, 43906, 11140, 10378, 0, 809, 5198, 5206, 33, 5214, 5219, 24, 11138}, new int[]{61, 53, 53, 61, 53, 62, 53, 53, 53, 53, 62, 62, 53});
                    break;
                case 4018:
                    colorUtility.b(new int[]{38065, 38057, 38090, 38172, 38177, 43280}, new int[]{61, 61, 61, 53, 53, 61});
                    break;
                case 4019:
                    colorUtility.b(new int[]{10502, 43906, 11140, 10378, 0, 809, 5198, 5206, 33, 5214, 5219, 24, 11138}, new int[]{52, 52, 52, 179, 52, 52, 52, 52, 52, 52, 52, 179, 179});
                    break;
                case 4021:
                    colorUtility.b(new int[]{123, 127, 22410, 11200, 29113, 908, 937}, new int[]{71, 71, 71, 71, 71, 71, 71});
                    break;
                case 4088:
                    colorUtility.b(256);
                    break;
                case CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF /* 4156 */:
                    colorUtility.b(new int[]{38119, 127, 76, 9121, 68, 64, 61625, 198, 10638, 3594, 4, 59, 107}, new int[]{61, 61, 62, 62, 61, 62, 61, 62, 62, 62, 62, 62, 62});
                    break;
                case 4206:
                    colorUtility.b(new int[]{38119, 127, 9118, 76, 9121, 68, 8097, 64, 198, 8092, 59, 4, 107, 10638, 61625, 10142}, new int[]{54, 54, 54, 60, 60, 60, 60, 54, 60, 54, 60, 54, 54, 60, 60, 60});
                    break;
                case 4207:
                    colorUtility.a(new int[]{5524, 5404, 5285, 5409, 5289, 5293, 5297, 5301, 5400}, 61);
                    break;
                case 4208:
                case 4209:
                    if (colorUtility != null) {
                        colorUtility.a(12, new int[]{1});
                        colorUtility.a(0, new int[]{10});
                        colorUtility.a(61, new int[]{62});
                        colorUtility.a(90, new int[]{5});
                        colorUtility.a(115, new int[]{15});
                        colorUtility.b(new int[]{127, 107, 16, 42693, 5150, 42669, 42305, 42315, INTELVAAPIMediaSharing.CL_MEM_VA_API_MEDIA_SURFACE_INTEL, 5272, 5276, 5392, 5281, 8656, aU.iS, 796, 784, 536, 78, 49, 62, 38333}, new int[]{61, 61, 61, 61, 60, 60, 60, 60, 61, 60, 60, 61, 61, 61, 61, 61, 61, 61, 61, 53, 53, 60});
                        colorUtility.g(55, -1);
                    }
                    break;
                case 4309:
                case 4310:
                    colorUtility.b(new int[]{5525, 5401, 5405, 4013, aU.xy, 4009, 3889, 5648, 4783, 4903, 43086, 43094, 4669, 4674, aU.xm, 5840, 5832, 4653, aU.vU, 3881, 3757, 3761, aU.vQ, aU.vS, 4785, 4779, 3982, 4657, aU.Bz, aU.Bv, aU.Br, 3885, 4649, 4661, 4781, KHRCommandBuffer.CL_DEVICE_COMMAND_BUFFER_CAPABILITIES_KHR, 3765}, new int[]{55, 132, 132, 132, 132, 132, 132, 55, 55, 55, 132, 132, 132, 132, 132, 55, 132, 55, 55, 55, 55, 132, 132, 132, 132, 132, 55, 55, 55, 55, 55, 55, 55, 81, 55, 55, 55});
                    colorUtility.h(37226);
                    break;
                case 4311:
                    colorUtility.b(new int[]{5524, 5400, 5404, 4013, aU.xy, 4009, 3889, 5648, GL11.GL_NORMALIZE, 4783, 4665, 4903, 43086, 43094, 4669, 4674, aU.xm, 5840, 5832, 4653, aU.vU, 3881, 3757, 3761, aU.vQ, aU.vS, 4785, 4779, 3982, 4657, aU.Bz, aU.Bv, aU.Br, 3885, 4649, aU.BE, 4661, 4781, KHRCommandBuffer.CL_DEVICE_COMMAND_BUFFER_CAPABILITIES_KHR, 3765}, new int[]{180, 180, 180, 180, aU.hu_, 180, aU.hu_, 60, 60, aU.hu_, 60, aU.hu_, 180, aU.hu_, 180, aU.hu_, 180, 60, 180, aU.hu_, aU.hu_, 60, 60, 180, aU.hu_, 180, aU.hu_, 180, aU.hu_, aU.hu_, aU.hu_, aU.hu_, aU.hu_, 60, aU.hu_, 60, 81, 60, 60, 60});
                    colorUtility.h(5);
                    break;
                case 4406:
                    colorUtility.b(new int[]{6798, 6554, 6430, 6435, 6439, 922}, new int[]{60, 60, 60, 62, 60, 60});
                    break;
                case 4437:
                    colorUtility.b(new int[]{123, 127, 22410, 11200, 29113, 908, 937}, new int[]{54, 54, 54, 54, 54, 54, 54});
                    break;
                case 4443:
                    colorUtility.g(0, -1);
                    colorUtility.g(5);
                    colorUtility.a(5, new int[]{3, 6, 12});
                    break;
                case CL12.CL_KERNEL_ARG_ADDRESS_QUALIFIER /* 4502 */:
                    colorUtility.b(new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451, 36007, 6573}, new int[]{56, 54, 56, 54, 56, 54, 54, 54, 54});
                    break;
                case CL20.CL_COMMAND_SVM_MAP /* 4620 */:
                case 4623:
                case 4659:
                    colorUtility.b(new int[]{21662, 21656, 21652, 9390, 21667, 37, 31, 52, 1041, FCNTL.F_GET_FILE_RW_HINT, aU.js, aU.jl, 9403, 1023, 1040, aU.jF, 1011, 1039, 7114, 933, 935, 902, 908, 912, 916, 933, 922, 920, 3974, aU.uO, aU.tF}, new int[]{62, 62, 62, 62, 62, 62, 62, 62, 17, 17, 62, 60, 60, 60, 60, 61, 62, 60, 62, 60, 62, 61, 27, 61, 27, 61, 62, 61, 27, 61, 27});
                    colorUtility.a(24, new int[]{6});
                    colorUtility.a(41, new int[]{8});
                    colorUtility.a(61, new int[]{10});
                    colorUtility.a(12, new int[]{10});
                    colorUtility.a(13, new int[]{10});
                    colorUtility.a(40, new int[]{10});
                    colorUtility.a(20, new int[]{930});
                    colorUtility.a(38, new int[]{930});
                    colorUtility.a(42, new int[]{930});
                    colorUtility.a(9402, new int[]{10});
                    break;
                case CL20.CL_COMMAND_SVM_UNMAP /* 4621 */:
                case 4658:
                case 4660:
                    colorUtility.b(new int[]{40, 8742, 24, 25239, 908, 38815, 933, 46383, 46036, 46391, 33, 37, 49197, 49205, aU.xC, 61, 10351, 5400, 5648, 43109, 43228, 43340, 43449, 43439, 94, 43456, 45392, aU.hb, -9559, 9152, -23616, 17979, 55977, 24512, 35365, 58316}, new int[]{62, 60, 62, 60, 78, 60, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 40, 62, 40, 62, 40, 40, 62, 62, 62, 62, 62, 60, 62, 60, 60, 60, 60, 60, 40});
                    colorUtility.a(8741, new int[]{3});
                    colorUtility.a(25238, new int[]{3});
                    colorUtility.a(38814, new int[]{3});
                    break;
                case 4661:
                    if (i2 == 5 || i2 == 0 || i2 == 3 || i2 == 2 || i2 == 6 || i2 == 7) {
                        colorUtility.b(61);
                    }
                    break;
                case 4669:
                case 4671:
                    if (i != 4669) {
                        colorUtility.b(new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{24, 56, 24, 56, 24, 56, 56, 56, 56, 56, 56, 56});
                    } else {
                        colorUtility.b(new int[]{912, 910, aU.tL, 5198, 5206, 2469, 2588, 5219}, new int[]{56, 24, 24, 56, 56, 56, 56, 56});
                    }
                    break;
                case 4672:
                case 4674:
                    colorUtility.b(new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{30, 60, 30, 60, 30, 29, 30, 29, 30, 60, 60, 60});
                    break;
                case 4673:
                    colorUtility.a(1938, new int[]{5});
                    colorUtility.a(910, new int[]{8});
                    colorUtility.a(aU.tL, new int[]{10});
                    colorUtility.b(new int[]{1939, 912, User32.WM_PENWINLAST, 809, aU.tM, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{60, 61, 60, 61, 60, 61, 61, 61, 61, 61, 61, 61});
                    break;
                case 4682:
                case 4683:
                    colorUtility.b(new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{60, 54, 60, 54, 60, 54, 60, 54, 54, 60, 60, 60});
                    break;
                case 4689:
                    colorUtility.b(new int[]{2717, 1561, GL11.GL_LINE_STIPPLE_PATTERN, aq.L, 7993, 902, User32.WM_MBUTTONUP, aU.DQ, aU.tF, aU.gw, 2714, 2857, User32.WM_SYSCHAR, 5, User32.WM_MOUSEWHEEL, aU.gu, 69, 25, 3761, 7882}, new int[]{75, 54, 75, 60, 75, 75, 75, 75, 60, 60, 75, 60, 60, 60, 60, 60, 60, 60, 40, 40});
                    colorUtility.g(2);
                    break;
                case 4698:
                case 4702:
                    colorUtility.a(912, new int[]{15});
                    colorUtility.b(new int[]{15, 910, 962, aU.tL, 1938}, new int[]{102, 92, 92, 109, 102});
                    break;
                case 4699:
                case 4703:
                    colorUtility.a(912, new int[]{15});
                    colorUtility.b(new int[]{15, 910, 962, aU.tL, 1938}, new int[]{61, 62, 61, 62, 76});
                    break;
                case 4700:
                    colorUtility.b(new int[]{912}, new int[]{40});
                    break;
                case 4704:
                case 4705:
                    colorUtility.b(new int[]{5219, 910, aU.tL, 1938, 1690, 912, 0, 962}, new int[]{256, 256, 260, 260, 260, 256, 256, 260});
                    break;
                case 4706:
                    colorUtility.b(new int[]{7502, 29976, 27819, 29980, 28302}, new int[]{221, 54, 221, 221, 221, 54, 221, 221, 221, 221});
                    break;
                case 4723:
                    colorUtility.a(new int[]{22, 21656, 21656, 18, 16656, 14259}, 80);
                    break;
                case 4905:
                case 4909:
                    colorUtility.a(new int[]{21652, 21658}, 62);
                    break;
                case 4906:
                    colorUtility.a(new int[]{12475, 13493, 12484, 10411, 10403, 33030, GL11.GL_VERTEX_ARRAY_POINTER, GL11.GL_TEXTURE_COORD_ARRAY_STRIDE, 24512, 30643}, 62);
                    break;
                case 4972:
                    colorUtility.b(new int[]{37403, aU.DK, 8136, 38672, NVMeshShader.GL_REFERENCED_BY_TASK_SHADER_NV, NVMemoryAttachment.GL_DETACHED_MEMORY_INCARNATION_NV, NVMemoryAttachment.GL_ATTACHED_MEMORY_OFFSET_NV, 38424, NVMeshShader.GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV, 37526, 62371, 62375, 7872, 7995, 6978, 7991, 7110, 13, 63405, 63411}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54});
                    colorUtility.g(311770);
                    colorUtility.g(0, -1);
                    break;
                case 5159:
                    colorUtility.a(43076, new int[]{8128});
                    colorUtility.a(43084, new int[]{25});
                    colorUtility.a(43166, new int[]{127});
                    colorUtility.a(43059, new int[]{359770});
                    colorUtility.b(new int[]{25, 127, 359770, 8128}, new int[]{61, 62, 62, 69});
                    colorUtility.g(100, -1);
                    colorUtility.g(10);
                    colorUtility.a(10, new int[]{5, 4, 5});
                    break;
                case 5160:
                    colorUtility.a(43076, new int[]{8128});
                    colorUtility.a(43084, new int[]{25});
                    colorUtility.a(43166, new int[]{127});
                    colorUtility.a(43059, new int[]{359770});
                    colorUtility.b(new int[]{25, 127, 359770, 8128}, new int[]{60, 66, 66, 63});
                    colorUtility.g(100, -1);
                    colorUtility.g(10);
                    colorUtility.a(10, new int[]{5, 4, 5});
                    break;
                case 5161:
                    colorUtility.a(43076, new int[]{8128});
                    colorUtility.a(43084, new int[]{25});
                    colorUtility.a(43166, new int[]{127});
                    colorUtility.a(43059, new int[]{359770});
                    colorUtility.b(new int[]{25, 127, 359770, 8128}, new int[]{69, 69, 57, 57});
                    colorUtility.g(100, -1);
                    colorUtility.g(10);
                    colorUtility.a(10, new int[]{5, 4, 5});
                    break;
                case 5162:
                    colorUtility.a(43076, new int[]{8128});
                    colorUtility.a(43084, new int[]{25});
                    colorUtility.a(43166, new int[]{127});
                    colorUtility.a(43059, new int[]{359770});
                    colorUtility.b(new int[]{25, 127, 359770, 8128}, new int[]{56, 66, 72, 63});
                    colorUtility.g(100, -1);
                    colorUtility.g(34770);
                    break;
                case 5163:
                    colorUtility.a(43076, new int[]{8128});
                    colorUtility.a(43067, new int[]{128});
                    colorUtility.a(43063, new int[]{129});
                    colorUtility.a(43084, new int[]{25});
                    colorUtility.a(43166, new int[]{127});
                    colorUtility.a(43059, new int[]{359770});
                    colorUtility.b(new int[]{25, 127, 359770, 8128, 128, 129}, new int[]{60, 140, 140, 140, 60, 60});
                    colorUtility.g(100, -1);
                    break;
                case 5324:
                case 5325:
                    colorUtility.b(new int[]{17500, 35259, 35264, 22464, 35270, 15434, AMDDeviceAttributeQuery.CL_DEVICE_SIMD_INSTRUCTION_WIDTH_AMD, 16466, 58419, EXTDeviceFission.CL_DEVICE_AFFINITY_DOMAINS_EXT, 54313, 54317, 54309, 54290, 58539, 54302, 54298, 40757, 40637, 37828, 40871}, new int[]{61, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62});
                    colorUtility.a(new int[]{35251, 35247, 32856, 32852, 35255, 16462}, new int[]{935, 934, 933, 932});
                    break;
                case 5326:
                case 5327:
                    colorUtility.b(new int[]{1938, 912, 910, 809, aU.tL, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{62, 60, 62, 60, 62, 60, 60, 60, 60, 60, 60, 60});
                    break;
                case 5328:
                    colorUtility.a(new int[]{935, 930, 940});
                    colorUtility.g(0, -1);
                    break;
                case 5399:
                    colorUtility.b(new int[]{11171, 41, 22}, new int[]{55, 55, 72});
                    break;
                case 5400:
                    colorUtility.a(new int[]{428770});
                    break;
                case 5401:
                    colorUtility.a(new int[]{347770});
                    break;
                case 5402:
                    colorUtility.a(new int[]{51136});
                    break;
                case 5405:
                case 5413:
                    colorUtility.a(7516, new int[]{117});
                    colorUtility.a(aU.IW, new int[]{127});
                    colorUtility.a(aU.IS, new int[]{80});
                    colorUtility.a(7636, new int[]{70});
                    colorUtility.a(0, new int[]{1});
                    colorUtility.b(new int[]{3489, 3369, 3373, 8377, 39896, 39872, 7446, 7393}, new int[]{93, 56, 56, 56, 56, 56, 56, 56});
                    break;
                case 5406:
                case 5407:
                    colorUtility.b(new int[]{5219, 910, aU.tL, 1938, 1690, 912, 0, 962}, new int[]{60, 60, 56, 56, 56, 60, 60, 56});
                    break;
                case 5408:
                    colorUtility.a(5828, new int[]{117});
                    colorUtility.a(5714, new int[]{127});
                    colorUtility.b(new int[]{24, 16, 33, 2768, 30, 45, 57, 28}, new int[]{56, 101, 56, 101, 56, 101, 101, 101});
                    break;
                case 5411:
                    colorUtility.a(5828, new int[]{117});
                    colorUtility.a(5714, new int[]{127});
                    colorUtility.b(new int[]{24, 16, 33, 2768, 30, 45, 57, 28}, new int[]{70, 102, 70, 102, 70, 102, 102, 102});
                    break;
                case 5412:
                    colorUtility.a(5828, new int[]{117});
                    colorUtility.a(5714, new int[]{127});
                    colorUtility.b(new int[]{24, 16, 33, 2768, 30, 45, 57, 28}, new int[]{93, 85, 93, 85, 93, 85, 85, 85});
                    break;
                case 5454:
                    colorUtility.a(new int[]{43119}, new int[]{374770});
                    colorUtility.a(new int[]{43123}, new int[]{15});
                    colorUtility.a(new int[]{43183, 43105, 7322, 33595, 33604, NVCopyDepthToColor.GL_DEPTH_STENCIL_TO_BGRA_NV, 43059, 43063}, new int[]{1});
                    colorUtility.a(new int[]{38119, 37099, EXTTextureCompressionLATC.GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT, 35949}, new int[]{2});
                    colorUtility.b(new int[]{1, 2}, new int[]{120, 277});
                    break;
                case 5810:
                    colorUtility.b(new int[]{2756, 9166}, new int[]{29, 30});
                    break;
                case 5873:
                    colorUtility.b(new int[]{38065, 43280, 38090}, new int[]{71, 71, 71});
                    break;
                case 6047:
                case 6048:
                    if (i != 6047) {
                        colorUtility.b(new int[]{aU.tL, 910, 809, 2469, 2588, 910, 5214, 2469, 2588, 5219, 5214, 5206, 910, 38119}, new int[]{40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40});
                    } else {
                        colorUtility.b(new int[]{aU.tL, 809, 2469, 2588, 5214, 2469, 2588, 5219, 5214, 5206, 38119}, new int[]{40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40});
                    }
                    break;
                case 6049:
                    colorUtility.b(new int[]{21652, 21658, 16904, 13248, 13204, 32920, 15320, 10448, 10462, 16656, 14259, 18, 22, 26}, new int[]{aU.hu_, aU.hu_, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, aU.hu_, aU.hu_});
                    break;
                case 6059:
                    colorUtility.b(62);
                    break;
                case 6100:
                    colorUtility.b(new int[]{13506, 13501, 13489, 13493, 13497}, new int[]{180, 180, 180, 180, 180});
                    break;
                case 6101:
                    colorUtility.b(new int[]{2983, 914, 6082, 23492, 23483, 4013, 4011, 8150, 4013, 2733, 4011, 2880, 28, 10167, 1946, 2983, 914, 29867, 6084}, new int[]{62, 62, 62, 62, 62, 62, 61, 61, 61, 61, 61, 61, 61, 62, 62, 62, 62, 62, 62});
                    break;
                case 6103:
                case 6104:
                    colorUtility.b(new int[]{930, 906, 927, 922, 926, 921, 925, 920, User32.WM_PENWINLAST, 909, 917, 913, 915, 923, 919, 907, 908, 910, 916, 931, 936, 932}, new int[]{56, 54, 56, 54, 56, 56, 56, 56, 56, 56, 54, 54, 56, 56, 54, 54, 56, 54, 56, 56, 56, 56});
                    break;
                case 6105:
                    colorUtility.b(new int[]{930, 906, 927, 922, 926, 921, 925, 920, User32.WM_PENWINLAST, 909, 917, 913, 915, 923, 919, 907, 908, 910, 916, 931, 936, 932}, new int[]{60, 102, 60, 75, 102, 60, 60, 60, 102, 60, 60, 102, 60, 60, 102, 102, 60, 102, 60, 60, 75, 60});
                    colorUtility.g(0, -1);
                    break;
                case 6106:
                case 7079:
                    colorUtility.b(new int[]{INTELUnifiedSharedMemory.CL_MEM_ALLOC_SIZE_INTEL, 17686, 15774, 13212, 13208, 13217, 16904, 13248, 21656, 21652, 21658, 16904, 13248, 13204, 32920, 15320, 10448, 10462, 16656, 14259, 18, 22, 26}, new int[]{102, 102, 102, 102, 102, 102, 102, 102, 102, 261, 261, 261, 112, 112, 112, 112, 112, 112, 112, 112, 112, 57, 57});
                    break;
                case 6116:
                    if (colorUtility != null) {
                        colorUtility.g(50, -1);
                    }
                    colorUtility.b(new int[]{914, 6082, 23492, 23483, 4013, 4011, 4013, 2733, 4011, 28, 10167, 1946, 2983, 914, 28, 29867, 6084, 8150}, new int[]{109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 60, 109, 109, 109, 109, 60});
                    break;
                case 6124:
                    colorUtility.b(new int[]{930, 906, 927, 922, 926, 921, 925, 920, User32.WM_PENWINLAST, 909, 917, 913, 915, 923, 919, 907, 908, 910, 916, 931, 936, 932}, new int[]{54, 60, 54, 60, 54, 60, 54, 54, 60, 54, 60, 60, 60, 54, 60, 60, 54, 60, 54, 54, 54, 60});
                    break;
                case 6174:
                case 6175:
                case 6179:
                    colorUtility.b(new int[]{21662, 21656, 21652, 9390, 21667, 37, 31, 52, 42, 38, 20, 13, 9402, 24, 41, 61, 12, 40, 7114, 933, 935, 902, 908, 912, 916, 933, 922, 920, 3974, aU.uO, aU.tF}, new int[]{62, 62, 62, 62, 62, 62, 62, 62, 17, 17, 62, 60, 60, 60, 27, 61, 62, 61, 62, 27, 62, 61, 27, 61, 27, 61, 62, 61, 27, 61, 27});
                    break;
                case 6184:
                case 8191:
                    colorUtility.a(61, new int[]{62});
                    colorUtility.a(35, new int[]{32});
                    colorUtility.a(72, new int[]{17});
                    colorUtility.a(76, new int[]{16});
                    colorUtility.b(new int[]{920, 0, 103, 103, 10291, 0, 43280, 38040, 40094, 40210, 6028, 10279, 36007, 929, 28, 33, aU.iS, 796, 784, 536, 78, 49, 62, 8636, 73, 77, 80, 36, 0, aU.Lu, 68, 8644, 8646, 55, 119, 123, 36007, 6573, 33300, 43059, 43067, 3008}, new int[]{89, 60, 89, 60, 89, 60, 89, 60, 89, 180, 180, 60, 180, 180, 60, 60, 89, 180, 180, 180, 180, 180, 180, 89, 180, 61, 61, 61, 60, 76, 61, aU.hu_, 180, 62, aU.hu_, aU.hu_, aU.hu_, aU.hu_, aU.hu_, aU.hu_, aU.hu_, 180});
                    colorUtility.g(-10, -1);
                    break;
                case 6303:
                    colorUtility.b(new int[]{63, 63, 56, 56, 56});
                    break;
                case 6304:
                    colorUtility.b(new int[]{256, 256, 71, 71, 71});
                    break;
                case 6334:
                case 6335:
                    colorUtility.b(new int[]{10472, aU.gx, 8845, 8610, 7104, aU.yn, 786, 4750, aU.iS, 7452, 817, 906, 926, 933, 937, 7333, 8664, 8656, 8146, 0, aU.ja_, 37, CGL.kCGLCEMPEngine, 7341, 7326, 7335, 7447, 905, 306, 63823, 432, 323, 11201, 228, 2472, 317, 2838, 142, 8421, 8660, aU.Jx, User32.WM_QUERYUISTATE, 2714, 2590, 2595, 65535, 20287}, new int[]{60, 60, 60, 60, 61, 61, 61, 61, 61, 61, 61, 61, 61, 60, 60, 60, 60, 60, 60, 61, 56, 60, 60, 60, 60, 60, 60, 60, 61, 60, 61, 57, 61, 57, 61, 61, 60, 56, 57, 61, 61, 61, 61, 61, 60, 60, 60});
                    colorUtility.g(3);
                    break;
                case 6337:
                    colorUtility.b(new int[]{7343, 7339, 7335, 5165, 5169}, new int[]{60, 60, 60, 60, 60});
                    break;
                case 6430:
                    colorUtility.a(17069, new int[]{374770});
                    colorUtility.a(8755, new int[]{5});
                    colorUtility.a(8631, new int[]{5});
                    colorUtility.a(8635, new int[]{5});
                    colorUtility.a(aU.ND, new int[]{12});
                    colorUtility.a(10149, new int[]{5});
                    colorUtility.a(957, new int[]{2});
                    colorUtility.a(aU.iR_, new int[]{12});
                    colorUtility.a(941, new int[]{5});
                    break;
                case 6431:
                case 6432:
                    colorUtility.a(17069, new int[]{5});
                    colorUtility.a(8755, new int[]{4007});
                    colorUtility.a(8631, new int[]{4020});
                    colorUtility.a(8635, new int[]{4030});
                    colorUtility.a(aU.ND, new int[]{12});
                    colorUtility.a(10149, new int[]{4040});
                    colorUtility.a(957, new int[]{25});
                    colorUtility.a(aU.iR_, new int[]{40});
                    colorUtility.a(941, new int[]{35});
                    colorUtility.b(new int[]{12}, new int[]{60});
                    break;
                case 6434:
                    colorUtility.b(new int[]{32850, 8410, 8660, 8404, GL11.GL_LUMINANCE16, 10318, 7607, aU.GZ, aU.GR, 7624, 10326, 10334, 8412, 32786, aU.iN_, 10339, 280}, new int[]{62, 62, 60, 60, 60, 62, 62, 60, 60, 60, 62, 62, 60, 60, 60, 60, 60});
                    break;
                case 6435:
                    colorUtility.b(new int[]{7114, aU.vL, 7112, 2756, 9166}, new int[]{62, 62, 60, 60, 60});
                    break;
                case aU.Ap /* 6604 */:
                    colorUtility.g(3);
                    break;
                case 6649:
                case 6650:
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
                    break;
                case aU.BE /* 6722 */:
                    colorUtility.a(new int[]{59728, 59728, 59728, 59728, 59728, 34770});
                    break;
                case 6729:
                case 6730:
                case 6999:
                    colorUtility.a(new int[]{935, 930, 940});
                    break;
                case 6735:
                    colorUtility.b(new int[]{aU.gA, 673, aU.iS, User32.WM_PRINTCLIENT, aU.iy_, 545, 796, 398, 908, 902, 549, aU.tN}, new int[]{56, 56, 60, 60, 56, 60, 60, 60, 60, 60, 56, 56});
                    break;
                case 6737:
                    colorUtility.b(new int[]{aU.gA, 673, aU.iS, User32.WM_PRINTCLIENT, aU.iy_, 545, 796, 398, 908, 902, 549, aU.tN}, new int[]{72, 129, 129, 129, 72, 129, 72, 72, 72, 72, 72, 72});
                    break;
                case 6738:
                    colorUtility.b(new int[]{aU.gA, 673, aU.iS, User32.WM_PRINTCLIENT, aU.iy_, 545, 796, 398, 908, 902, 549, aU.tN}, new int[]{259, 82, 82, 82, 259, 82, 259, 259, 259, 259, 259, 259});
                    break;
                case 6739:
                    colorUtility.b(new int[]{aU.gA, 673, aU.iS, User32.WM_PRINTCLIENT, aU.iy_, 545, 796, 398, 908, 902, 549, aU.tN}, new int[]{134, 169, 169, 169, 134, 169, 134, 134, 134, 134, 134, 134});
                    break;
                case 6976:
                    colorUtility.a(929, new int[]{aU.Vj});
                    colorUtility.b(new int[]{929, 127, 914, 2954, 55180, 57228, 4550}, new int[]{60, 30, 30, 30, 30, 30, 29});
                    break;
                case 6991:
                    colorUtility.b(new int[]{156, 278, GL11.GL_MAP2_TEXTURE_COORD_3, 6323, 7500, 8410, 3621, 3501, 167, 972, 2576, 2368, 38119, 163, 6323, 8410, 2368, 3621}, new int[]{339, 339, User32.WM_SYSCHAR, 339, 339, 339, User32.WM_SYSCHAR, User32.WM_SYSCHAR, User32.WM_SYSCHAR, User32.WM_SYSCHAR, User32.WM_SYSCHAR, 339, User32.WM_SYSCHAR, User32.WM_SYSCHAR, 339, 339, 339, 339});
                    break;
                case 7074:
                    colorUtility.b(new int[]{908, 22424, 4550, 11162, 6798, 22426, 4550, 22422}, new int[]{256, 256, 256, 256, 258, 258, 258, 258});
                    break;
                case 7075:
                    colorUtility.b(new int[]{908, 22424, 4550, 11162, 6798, 22426, 4550, 22422}, new int[]{112, 112, 112, 112, 241, 241, 241, 241});
                    break;
                case 7076:
                    colorUtility.b(new int[]{6466, 9015, 6474, 6470, 929, 7446, 935, 8896}, new int[]{User32.VK_OEM_AUTO, User32.VK_OEM_AUTO, User32.VK_OEM_AUTO, User32.VK_OEM_AUTO, 58, 58, 58, 58});
                    break;
                case 7078:
                    colorUtility.a(new int[]{21652, 21658}, 57);
                    break;
                case 7133:
                case 7134:
                    colorUtility.b(new int[]{10266, 21662, 10270, 10274, 10280, 10282, 9402, 10288, 10284, 10277, 10296, 10291, 10262, 21657, 7176, 11320, 7217, 11333, 11343, 7208}, new int[]{54, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 54});
                    colorUtility.g(3);
                    colorUtility.g(0, -1);
                    break;
                case 7198:
                    colorUtility.a(10145, new int[]{59842});
                    colorUtility.a(10138, new int[]{59792});
                    colorUtility.a(43928, new int[]{59842});
                    colorUtility.a(61555, new int[]{59792});
                    break;
                case 7199:
                    colorUtility.a(10145, new int[]{37220});
                    colorUtility.a(10138, new int[]{37580});
                    colorUtility.a(43928, new int[]{37220});
                    colorUtility.a(61555, new int[]{37580});
                    break;
                case 7279:
                    colorUtility.a(new int[]{aU.yB, aU.yR, aU.yn, aU.yt, aU.ym, aU.yp, 5094, aU.yi, aU.yz, aU.yP, aU.yT, aU.yF, aU.yJ, 5112, 5102, 5092}, 54);
                    break;
                case 7280:
                case 7281:
                    colorUtility.a(new int[]{aU.yB, aU.yR, aU.yn, aU.yt, aU.ym, aU.yp, 5094, aU.yi, aU.yz, aU.yP, aU.yT, aU.yF, aU.yJ, 5112, 5102, 5092}, 53);
                    break;
                case 7284:
                    colorUtility.a(new int[]{aU.yP, aU.yT, 278, aU.hS_, aU.yF, aU.yJ, 408, aU.yn, aU.yt, 4, aU.yB, 143, User32.WM_COMMAND, aU.ym, aU.yp, 5094, aU.yi, aU.yz, 133, 2, aU.yR, 280, 7321, aU.hT_, 5092, User32.WM_UNICHAR, 5102, 5112, User32.WM_IME_ENDCOMPOSITION}, 27);
                    break;
                case 7285:
                case 7286:
                    colorUtility.b(new int[]{aU.yP, aU.yT, 278, aU.hS_, aU.yF, aU.yJ, 408, aU.yn, aU.yt, 4, aU.yB, 143, User32.WM_COMMAND, aU.ym, aU.yp, 5094, aU.yi, aU.yz, 133, 2, aU.yR, 280, 7321, aU.hT_, 5092, User32.WM_UNICHAR, 5102, 5112, User32.WM_IME_ENDCOMPOSITION, 409, 406, 414, 411, 139, 137, 135, 816}, new int[]{179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 338, 338, 338, 338, 338, 338, 338, 338});
                    break;
                case 7287:
                    colorUtility.a(new int[]{aU.yP, aU.yT, 278, aU.hS_, aU.yF, aU.yJ, 408, aU.yn, aU.yt, 4, aU.yB, 143, User32.WM_COMMAND, aU.ym, aU.yp, 5094, aU.yi, aU.yz, 133, 2, aU.yR, 280, 7321, aU.hT_, 5092, User32.WM_UNICHAR, 5102, 5112, User32.WM_IME_ENDCOMPOSITION}, 5);
                    break;
                case 7359:
                    if (colorUtility != null) {
                        colorUtility.b(new int[]{32867, 32850, 32893, 32881, GL11.GL_INTENSITY4, NVPathRendering.GL_PATH_STROKE_WIDTH_NV}, new int[]{56, 63, 56, 63, 63, 63});
                    }
                    break;
                case 7455:
                    colorUtility.b(new int[]{37403, aU.DK, 8136, 38672, NVMeshShader.GL_REFERENCED_BY_TASK_SHADER_NV, NVMemoryAttachment.GL_DETACHED_MEMORY_INCARNATION_NV, NVMemoryAttachment.GL_ATTACHED_MEMORY_OFFSET_NV, 38424, NVMeshShader.GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV, 37526, 62371, 62375, 7872, 7995, 6978, 7991, 7110, 13, 63405, 63411}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71});
                    colorUtility.g(7114);
                    colorUtility.g(0, -1);
                    break;
            }
        }
    }

    public static void a(ColorUtility colorUtility, int i) {
        switch (i) {
            case g.i /* 413 */:
                colorUtility.g(50, -1);
                break;
            case 443:
                colorUtility.g(-5, -1);
                break;
            case 861:
                colorUtility.g(50, -1);
                break;
            case 1574:
            case 1575:
            case 2777:
            case 2778:
            case aU.xO /* 5030 */:
            case 6334:
            case 6335:
            case 6764:
            case aU.CN /* 7005 */:
                colorUtility.g(25, -1);
                break;
            case 3099:
                colorUtility.g(40, -1);
                break;
            case 5400:
            case 5401:
            case 5402:
            case 5403:
            case 5404:
                colorUtility.g(-10, -1);
                break;
            case 5873:
                colorUtility.g(80, -1);
                break;
        }
    }

    public static int a(int i) {
        switch (i) {
            case 1:
                return 15;
            case 2:
                return 14;
            case 3:
                return 16;
            case 4:
                return 17;
            case 5:
                return 18;
            case 6:
                return 20;
            case 7:
                if (e == 0) {
                    e = 1;
                }
                return a(e);
            case 8:
                return e % 2 == 0 ? 25 : 26;
            case 9:
                return 2;
            case 50:
                return 29;
            default:
                return 0;
        }
    }

    public static class_102 b(int i) {
        if (i >= ai.length) {
            return new class_102();
        }
        ag = (ag + 1) % 20;
        class_102 class_102Var = new class_102();
        ah.h = ai[i];
        class_102Var.x = i;
        class_102Var.a(ah);
        for (int i2 = 0; i2 < class_102Var.p.length; i2++) {
            if (class_102Var.p[i2] != null && class_102Var.p[i2].equalsIgnoreCase("Collect")) {
                class_102Var.p[i2] = null;
            }
        }
        return class_102Var;
    }

    public static class_102 c(int i) {
        class_102 class_102Var;
        boolean z2 = false;
        if (c.b(i)) {
            class_102Var = c.a(i);
            z2 = true;
        } else {
            for (int i2 = 0; i2 < 20; i2++) {
                if (z[i2].x == i) {
                    return z[i2];
                }
            }
            ag = (ag + 1) % 20;
            class_102Var = new class_102();
            ah.h = ai[i];
            class_102Var.x = i;
            class_102Var.a(ah);
        }
        if (!z2) {
            for (int i3 = 0; i3 < class_102Var.p.length; i3++) {
                if (class_102Var.p[i3] != null && class_102Var.p[i3].equalsIgnoreCase("Collect")) {
                    class_102Var.p[i3] = null;
                }
            }
        }
        if (!z2 && i != 4907) {
            z[ag] = class_102Var;
        }
        return class_102Var;
    }

    public ColorUtility a() {
        if (this.x == 4907) {
            return class_419.b(false);
        }
        if (this.x == 4908) {
            return class_419.b(true);
        }
        if (this.L == null) {
            return null;
        }
        boolean z2 = false;
        for (int i = 0; i < this.L.length; i++) {
            if (!ColorUtility.b(this.L[i], this.af)) {
                z2 = true;
            }
        }
        if (z2) {
            return null;
        }
        ColorUtility[] colorUtilityArr = new ColorUtility[this.L.length];
        for (int i2 = 0; i2 < this.L.length; i2++) {
            ColorUtility colorUtilityA = ColorUtility.a(this.L[i2], this.af);
            if (this.i != null) {
                this.i.a(colorUtilityA);
            } else {
                a(colorUtilityA, (int) this.x, i2);
                a(colorUtilityA, (int) this.x);
            }
            colorUtilityArr[i2] = colorUtilityA;
        }
        ColorUtility colorUtility = colorUtilityArr.length == 1 ? colorUtilityArr[0] : new ColorUtility(colorUtilityArr.length, colorUtilityArr);
        if (this.v != null) {
            for (int i3 = 0; i3 < this.v.length; i3++) {
                colorUtility.i(this.v[i3], this.s[i3]);
            }
        }
        return colorUtility;
    }

    public static int a(int i, int i2) {
        return c(i).L[i2];
    }

    public static int b(int i, int i2) {
        return c(i).s[i2];
    }

    public static int d(int i) {
        return c(i).w;
    }

    public static int e(int i) {
        return c(i).q;
    }

    public ColorUtility b() {
        if (this.G != null) {
            class_102 class_102VarC = c();
            if (class_102VarC == null) {
                return null;
            }
            return class_102VarC.b();
        }
        if (this.t == null) {
            return null;
        }
        boolean z2 = false;
        class_83.a(this.af);
        for (int i = 0; i < this.t.length; i++) {
            try {
                if (!ColorUtility.f(this.t[i])) {
                    z2 = true;
                }
            } catch (Throwable th) {
                class_83.a(false);
                throw th;
            }
        }
        class_83.a(false);
        if (z2) {
            return null;
        }
        ColorUtility[] colorUtilityArr = new ColorUtility[this.t.length];
        class_83.a(this.af);
        for (int i2 = 0; i2 < this.t.length; i2++) {
            try {
                ColorUtility colorUtilityE = ColorUtility.e(this.t[i2]);
                if (this.i != null) {
                    this.i.a(colorUtilityE);
                } else {
                    a(colorUtilityE, (int) this.x, i2);
                    a(colorUtilityE, (int) this.x);
                }
                colorUtilityArr[i2] = colorUtilityE;
            } catch (Throwable th2) {
                class_83.a(false);
                throw th2;
            }
        }
        class_83.a(false);
        ColorUtility colorUtility = colorUtilityArr.length == 1 ? colorUtilityArr[0] : new ColorUtility(colorUtilityArr.length, colorUtilityArr);
        if (this.v != null) {
            for (int i3 = 0; i3 < this.v.length; i3++) {
                colorUtility.i(this.v[i3], this.s[i3]);
            }
        }
        return colorUtility;
    }

    public class_102 c() {
        int i = -1;
        if (this.k != -1) {
            class_128 class_128Var = class_128.a[this.k];
            int i2 = class_128Var.b;
            int i3 = class_128Var.c;
            i = (A.dP[i2] >> i3) & Client.fQ[class_128Var.d - i3];
        } else if (this.m != -1) {
            i = A.dP[this.m];
        }
        if (i < 0 || i >= this.G.length || this.G[i] == -1) {
            return null;
        }
        return c(this.G[i]);
    }

    public static void a(class_663 class_663Var) {
        ah = new Buffer(class_663Var.a("npc.dat"));
        Buffer buffer = new Buffer(class_663Var.a("npc.idx"));
        f = buffer.A();
        ai = new int[f + G.dn];
        int iA = 2;
        for (int i = 0; i < f; i++) {
            ai[i] = iA;
            iA += buffer.A();
        }
        z = new class_102[20];
        for (int i2 = 0; i2 < 20; i2++) {
            z[i2] = new class_102();
        }
        if (c == null) {
            c = new class_620();
            c.d();
        }
    }

    public static void d() {
        M = null;
        ai = null;
        z = null;
        ah = null;
    }

    public ColorUtility a(int i, int i2, int[] iArr, int i3) {
        return a(i, i2, iArr, i3, i3);
    }

    public ColorUtility a(int i, int i2, int[] iArr, int i3, int i4) {
        ColorUtility colorUtilityA;
        if (this.G != null) {
            class_102 class_102VarC = c();
            if (class_102VarC == null) {
                return null;
            }
            return class_102VarC.a(i, i2, iArr, i3, i4);
        }
        ColorUtility colorUtility = a ? (ColorUtility) M.a(this.x) : null;
        if (colorUtility == null && Configuration.K) {
            boolean z2 = false;
            for (int i5 = 0; i5 < this.L.length; i5++) {
                try {
                    class_83.a(this.af);
                    if (!ColorUtility.f(this.L[i5])) {
                        z2 = true;
                    }
                    class_83.a(false);
                } catch (Throwable th) {
                    class_83.a(false);
                    throw th;
                }
            }
            if (z2) {
                return null;
            }
            ColorUtility[] colorUtilityArr = new ColorUtility[this.L.length];
            for (int i6 = 0; i6 < this.L.length; i6++) {
                try {
                    class_83.a(this.af);
                    ColorUtility colorUtilityE = ColorUtility.e(this.L[i6]);
                    class_83.a(false);
                    if (this.L[i6] == 209 && this.x == 790) {
                        colorUtilityE.a(0, 0, 5);
                    }
                    if (this.i != null) {
                        this.i.a(colorUtilityE);
                    } else {
                        a(colorUtilityE, (int) this.x, i6);
                        a(colorUtilityE, (int) this.x);
                    }
                    colorUtilityArr[i6] = colorUtilityE;
                } catch (Throwable th2) {
                    class_83.a(false);
                    throw th2;
                }
            }
            class_49 class_49Var = ColorUtility.h;
            colorUtility = colorUtilityArr.length == 1 ? colorUtilityArr[0] : new ColorUtility(colorUtilityArr.length, colorUtilityArr, class_49Var);
            colorUtility.i = class_49Var;
            if (b != null && !a) {
                class_313.d().a(class_268.c, (Object) b, colorUtility);
            }
            if (this.v != null) {
                for (int i7 = 0; i7 < this.v.length; i7++) {
                    colorUtility.i(this.v[i7], this.s[i7]);
                }
            }
            colorUtility.n();
            if (this.x == 864) {
                colorUtility.b(84, 1000, -90, -580, -90, true);
            } else {
                colorUtility.b(64 + this.D, 850 + this.J, -30, -50, -30, true);
            }
            if (a) {
                M.a(colorUtility, this.x);
            }
        }
        ColorUtility colorUtility2 = ColorUtility.ac;
        if (i3 <= 0 || class_99.a[i3] == null || !class_99.a[i3].b()) {
            colorUtilityA = ColorUtility.ac;
            colorUtilityA.a(colorUtility, class_176.g(i2) & class_176.g(i));
            boolean z3 = true;
            if (!this.g && i3 == this.w) {
                z3 = false;
            }
            if (z3) {
                if (i2 != -1 && i != -1) {
                    colorUtilityA.a(iArr, i, i2, i3);
                } else if (i2 != -1) {
                    colorUtilityA.f(i2, i3);
                }
            }
        } else if (i2 == -1 || i == -1) {
            colorUtilityA = class_99.a[i3].a(colorUtility, i2 != -1 ? i2 : i);
        } else {
            colorUtilityA = class_99.a[i3].a(colorUtility, i, class_99.a[i4], i2);
        }
        if (this.I != 128 || this.E != 128) {
            colorUtilityA.b(this.I, this.I, this.E);
        }
        colorUtilityA.k();
        colorUtilityA.aM = null;
        colorUtilityA.aL = null;
        if (this.r == 1) {
            colorUtilityA.aN = true;
        }
        return colorUtilityA;
    }

    public void a(Buffer buffer) {
        while (true) {
            int iY = buffer.y();
            if (iY == 0) {
                return;
            }
            if (iY == 1) {
                int iY2 = buffer.y();
                this.L = new int[iY2];
                for (int i = 0; i < iY2; i++) {
                    this.L[i] = buffer.A();
                }
            } else if (iY == 2) {
                this.o = buffer.F().replaceAll("_", F.a);
            } else if (iY == 3) {
                this.H = buffer.H();
            } else if (iY == 12) {
                this.r = buffer.z();
            } else if (iY == 13) {
                this.w = buffer.A();
            } else if (iY == 14) {
                this.q = buffer.A();
            } else if (iY == 17) {
                this.q = buffer.A();
                this.l = buffer.A();
                this.B = buffer.A();
                this.j = buffer.A();
                if (this.q == 65535) {
                    this.q = -1;
                }
                if (this.l == 65535) {
                    this.l = -1;
                }
                if (this.B == 65535) {
                    this.B = -1;
                }
                if (this.j == 65535) {
                    this.j = -1;
                }
            } else if (iY >= 30 && iY < 40) {
                if (this.p == null) {
                    this.p = new String[5];
                }
                this.p[iY - 30] = buffer.F();
                if (this.p[iY - 30].equalsIgnoreCase("hidden")) {
                    this.p[iY - 30] = null;
                }
            } else if (iY == 40) {
                int iY3 = buffer.y();
                this.v = new int[iY3];
                this.s = new int[iY3];
                for (int i2 = 0; i2 < iY3; i2++) {
                    this.v[i2] = buffer.A();
                    this.s[i2] = buffer.A();
                }
            } else if (iY == 60) {
                int iY4 = buffer.y();
                this.t = new int[iY4];
                for (int i3 = 0; i3 < iY4; i3++) {
                    this.t[i3] = buffer.A();
                }
            } else if (iY == 90) {
                buffer.A();
            } else if (iY == 91) {
                buffer.A();
            } else if (iY == 92) {
                buffer.A();
            } else if (iY == 93) {
                this.F = false;
            } else if (iY == 95) {
                this.n = buffer.A();
            } else if (iY == 97) {
                this.I = buffer.A();
            } else if (iY == 98) {
                this.E = buffer.A();
            } else if (iY == 99) {
                this.K = true;
            } else if (iY == 100) {
                this.D = buffer.z();
            } else if (iY == 101) {
                this.J = buffer.z() * 5;
            } else if (iY == 102) {
                this.u = buffer.A();
            } else if (iY == 103) {
                this.y = buffer.A();
            } else if (iY == 106) {
                this.k = buffer.A();
                if (this.k == 65535) {
                    this.k = -1;
                }
                this.m = buffer.A();
                if (this.m == 65535) {
                    this.m = -1;
                }
                int iY5 = buffer.y();
                this.G = new int[iY5 + 1];
                for (int i4 = 0; i4 <= iY5; i4++) {
                    this.G[i4] = buffer.A();
                    if (this.G[i4] == 65535) {
                        this.G[i4] = -1;
                    }
                }
            } else if (iY == 107) {
                this.C = false;
            }
        }
    }

    public void a(class_102 class_102Var) {
        this.k = class_102Var.k;
        this.m = class_102Var.m;
        this.n = class_102Var.n;
        this.r = class_102Var.r;
        this.u = class_102Var.u;
        this.w = class_102Var.w;
        this.q = class_102Var.q;
        this.l = class_102Var.l;
        this.B = class_102Var.B;
        this.j = class_102Var.j;
        this.C = class_102Var.C;
        this.E = class_102Var.E;
        this.F = class_102Var.F;
        this.I = class_102Var.I;
        this.K = class_102Var.K;
        this.h = class_102Var.h;
        this.J = class_102Var.J;
        this.D = class_102Var.D;
        this.p = b(class_102Var.p);
        this.L = a(class_102Var.L);
        this.v = a(class_102Var.v);
        this.s = a(class_102Var.s);
        this.G = a(class_102Var.G);
        this.t = a(class_102Var.t);
        if (class_102Var.i == null) {
            class_102Var.i = null;
        } else {
            this.i = new class_59(class_102Var.i);
        }
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

    public void f(int i) {
        class_102 class_102VarC = c(i);
        if (class_102VarC.L != null) {
            this.L = Arrays.copyOf(class_102VarC.L, class_102VarC.L.length);
        }
        if (class_102VarC.v != null) {
            this.v = Arrays.copyOf(class_102VarC.v, class_102VarC.v.length);
        }
        if (class_102VarC.s != null) {
            this.s = Arrays.copyOf(class_102VarC.s, class_102VarC.s.length);
        }
        if (class_102VarC.t != null) {
            this.t = Arrays.copyOf(class_102VarC.t, class_102VarC.t.length);
        }
        this.p = (String[]) Arrays.copyOf(class_102VarC.p, class_102VarC.p.length);
        this.C = class_102VarC.C;
        this.K = class_102VarC.K;
        this.F = class_102VarC.F;
        this.n = class_102VarC.n;
        this.r = class_102VarC.r;
        this.w = class_102VarC.w;
        this.q = class_102VarC.q;
        this.l = class_102VarC.l;
        this.B = class_102VarC.B;
        this.j = class_102VarC.j;
        this.I = class_102VarC.I;
        this.E = class_102VarC.E;
        this.D = class_102VarC.D;
        this.J = class_102VarC.J;
        this.u = class_102VarC.u;
        this.y = class_102VarC.y;
        this.k = class_102VarC.k;
        this.m = class_102VarC.m;
    }
}
