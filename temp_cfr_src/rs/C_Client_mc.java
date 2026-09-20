/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.m.d
 *  javax.inject.Inject
 *  p_gnu.p_trove.p_f.p_b.C_cc
 */
package rs;

import com.google.a.m.d;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.C_H_uc;
import rs.C_L_uc;
import rs.C_N_uc;
import rs.C_O_uc;
import rs.C_P_uc;
import rs.C_Q_uc;
import rs.C_T_uc;
import rs.C_V_uc;
import rs.C_h;
import rs.C_k;
import rs.C_l;
import rs.C_m;
import rs.C_q;
import rs.C_x;
import rs.p_a.C_g;
import rs.p_cache.C_d;
import rs.p_cache.p_b.C_c;
import rs.p_d.C_h;
import rs.p_d.C_r;
import rs.p_d.C_t;
import rs.p_d.C_v;
import rs.p_d.C_y;
import rs.p_d.C_z;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_f.C_a;
import rs.p_gui.C_Launcher_mc;
import rs.p_k.C_p;
import rs.p_l.C_A_uc;
import rs.p_l.C_C_uc;
import rs.p_l.C_E_uc;
import rs.p_l.C_F_uc;
import rs.p_l.C_I_uc;
import rs.p_l.C_J_uc;
import rs.p_l.C_s;
import rs.p_l.p_d.C_c;
import rs.p_l.p_e.C_o;
import rs.p_l.p_e.C_q;
import rs.p_l.p_f.C_a;
import rs.p_l.p_f.C_e;
import rs.p_m.C_a;
import rs.p_n.p_c.C_G_uc;
import rs.p_n.p_c.C_Y_uc;
import rs.p_n.p_c.C_aD_mc;
import rs.p_n.p_c.C_aG_mc;
import rs.p_n.p_c.C_aH_mc;
import rs.p_n.p_c.C_ab;
import rs.p_n.p_c.C_ac;
import rs.p_n.p_c.C_ae;
import rs.p_n.p_c.C_af;
import rs.p_n.p_c.C_ai;
import rs.p_n.p_c.C_al;
import rs.p_n.p_c.C_ap;
import rs.p_n.p_c.C_at;
import rs.p_n.p_c.C_au;
import rs.p_n.p_c.C_av;
import rs.p_n.p_c.C_ba;
import rs.p_n.p_c.C_w;
import rs.p_q.p_a.p_a.p_a.C_j;
import rs.p_r.C_K_uc;
import rs.p_runelite.p_a.C_i;
import rs.p_runelite.p_events.C_ChatMessage_mc;
import rs.p_runelite.p_events.C_ClientStartUp_mc;
import rs.p_runelite.p_events.C_EntityInteraction_mc;
import rs.p_runelite.p_events.C_GameStateChanged_mc;
import rs.p_runelite.p_events.C_MenuHover_mc;
import rs.p_runelite.p_events.C_MenuOpened_mc;
import rs.p_runelite.p_events.C_NpcSpawned_mc;
import rs.p_runelite.p_events.C_ObjectInteraction_mc;
import rs.p_runelite.p_events.C_PrivateChatMessage_mc;
import rs.p_runelite.p_events.C_SkillLevelChanged_mc;
import rs.p_s.p_s.C_b;
import rs.p_ui.C_f;

public final class C_Client_mc
extends rs.C_C_uc {
    public rs.p_k.C_e a;
    public C_p b;
    public static final Map<Integer, Boolean> c;
    final Integer[] d = new Integer[]{13129, 13642, 13641, 13386, 13130, 13131, 13387, 13655, 1365, 13646, 13647, 13135, 13134, 13133, 12621, 13899, 13900, 14155, 14156, 13388, 13644, 12877, 12878, 12879, 13390, 13391, 13389, 13132, 13645, 13385, 12873, 12874, 12875, 13903, 13902, 13901, 14157, 14413, 14412, 14411, 14410, 13643, 13898, 13897, 13640, 12623, 12622, 12367, 12366, 12365, 12620, 13361, 13360, 13362, 13105, 13617, 9023, 9022, 9024, 8768, 8767, 8766, 9278, 9279, 9280, 12956, 12700, 12444, 12445, 12446, 12447, 12703, 12702, 12701, 12957, 12958, 12959, 6810, 7066, 7065, 6811, 6809, 6553, 6554, 6555, 12704, 12488, 12960, 13396, 13136, 12881, 12882, 12883, 12884, 12885, 12886, 13142, 13398, 14654, 13653, 13652, 13651, 13650, 13649, 13648, 13392, 13216, 13215, 13214, 13213, 13212, 12448, 14927, 14926, 14928, 14672, 14671, 14670, 15184, 15183, 15182, 6481, 6226, 6482, 6738, 6737, 6736, 6480, 6224, 6225, 6479, 6223, 6735, 5771, 5772, 5770, 5515, 6027, 5514, 6026, 5513, 5769, 6025, 5773, 6029, 5774, 5517, 5518, 6030, 5516, 6028, 12611, 12355, 12354, 12610, 12866, 12867, 12868, 12612, 12356, 12613, 12357, 12358, 12614, 12870, 12869, 13125, 12868, 12869, 12870, 13126, 13382, 13381, 13380, 13124, 13122, 13123, 13379, 13378, 13337, 13121, 12865, 12866, 12867, 13123, 13124, 13380, 12868, 13379, 13378, 12886, 12613, 12357, 12869, 12356, 12868, 13404, 13403, 13402, 13401, 13657, 13913, 14169, 14170, 14171, 14172, 13916, 13660, 13659, 13915, 13658, 13914, 5956, 5957, 5955, 5770, 6211, 6212, 6213, 5701, 5700, 5699, 11622, 11878, 12134, 11621, 11877, 12133, 11620, 11876, 12132, 11601, 11345, 11857, 11600, 11856, 11344, 11602, 11858, 11346};
    final Integer[] e = new Integer[0];
    public static boolean f;
    public static final boolean g = false;
    public static boolean h;
    public static boolean i;
    public static long j;
    public String k;
    public C_c l = new C_c(this);
    public rs.p_l.p_e.C_h m;
    public rs.p_l.p_e.C_m n;
    public rs.p_l.p_e.C_e o;
    @Inject
    public C_EventBus_mc p;
    @Inject
    public rs.p_j.p_a.C_b q;
    @Inject
    public rs.p_j.p_b.C_d r;
    public int s;
    public int t;
    public List<rs.p_l.p_e.C_q> u = new ArrayList<rs.p_l.p_e.C_q>();
    public rs.p_i.C_b v;
    public static rs.p_l.p_e.C_c w;
    public rs.p_l.p_f.p_a.p_c.C_c x;
    public rs.p_l.p_c.C_a y;
    public rs.p_l.p_f.p_a.p_c.C_d z;
    public static final int A = 2940;
    public static final int B = 3390;
    public static final int C = 3521;
    public static final int D = 3972;
    public static long E;
    public static double F;
    public rs.p_l.p_d.C_c G;
    public C_F_uc[] H;
    public C_F_uc I;
    public C_F_uc[] J;
    public boolean K;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public long O = 0L;
    public int P = 0;
    public int Q = 0;
    public long R = 0L;
    public int S = 0;
    public static int T;
    public boolean U = false;
    public static int V;
    public static int W;
    public static int X;
    private static long ib;
    public C_F_uc Y;
    private static long ic;
    private long id;
    private List<rs.p_q.p_a.C_a> ie = new ArrayList<rs.p_q.p_a.C_a>();
    private Map<String, Boolean> kw_if = new HashMap<String, Boolean>();
    public rs.C_j Z = new rs.C_j();
    public static C_o aa;
    public static rs.p_l.p_e.C_k ab;
    public static final int[] ac;
    public List<Integer> ad = new ArrayList<Integer>();
    public boolean ae = false;
    public String af = "";
    public static boolean ag;
    public static int ah;
    public static int ai;
    public static int aj;
    public static int ak;
    public static int al;
    public List<String> am = new ArrayList<String>();
    public String an;
    public static String ao;
    public static String ap;
    public static String aq;
    public String ar;
    public String as;
    public String at;
    public static String au;
    public static String av;
    public static String aw;
    public static String ax;
    public static String ay;
    public static String az;
    public C_F_uc aA;
    public boolean aB = false;
    public boolean aC = false;
    public boolean aD = false;
    public boolean aE = false;
    public boolean aF = false;
    public String aG = "";
    public String aH = "";
    public String aI = "";
    public boolean aJ = false;
    public boolean aK = false;
    public double aL = 0.0;
    public int aM = 0;
    public int aN = 0;
    int aO = 0;
    int aP = 0;
    long aQ = 0L;
    String aR = "";
    public C_F_uc aS;
    public C_F_uc aT;
    private C_F_uc ig;
    public C_F_uc aU;
    private int ih = 14;
    public static int aV;
    public static int aW;
    public static int aX;
    public static int aY;
    public static final int[] aZ;
    public static boolean ba;
    public static int bb;
    public static int bc;
    public static int bd;
    public static int be;
    public static int bf;
    public static int bg;
    private static long ii;
    public static long bh;
    public static long bi;
    private long ij = 0L;
    private String ik = "";
    public boolean bj = true;
    private C_F_uc[] il = null;
    private int[] im = null;
    private long in;
    private int io = 1;
    private String ip = "";
    private final long iq = 200L;
    public static rs.p_l.C_K_uc[] bk;
    public int bl;
    public int bm;
    public static C_cc<Boolean> bn;
    public List<rs.p_d.C_q> bo = new ArrayList<rs.p_d.C_q>();
    public List<rs.p_d.C_q> bp = new ArrayList<rs.p_d.C_q>();
    private C_F_uc ir;
    private C_F_uc is;
    private C_F_uc it;
    private C_F_uc iu;
    private C_F_uc iv;
    public int bq;
    public static int br;
    public C_F_uc bs;
    public boolean bt = false;
    public boolean bu = false;
    public boolean bv = false;
    public boolean bw = false;
    private final rs.p_l.C_l iw = new rs.p_l.C_l();
    private final C_A_uc ix = new C_A_uc();
    public int[] bx;
    public static C_K_uc[] by;
    private ArrayList<rs.p_r.C_a> iy;
    private ArrayList<rs.p_r.C_a> iz;
    public int[] bz = new int[2000];
    public int[] bA = new int[2000];
    public int[] bB = new int[2000];
    public static int bC;
    public static boolean bD;
    public static int bE;
    public static int bF;
    public static int bG;
    public static int bH;
    private static final Random iA;
    private boolean iB = false;
    private long iC;
    public boolean bI;
    private Long[] iD = null;
    private Long[] iE = null;
    private boolean iF = false;
    public static final int[] bJ;
    public static final int[] bK;
    public static int bL;
    public static int bM;
    public static int bN;
    public static int bO;
    public static int bP;
    public static int bQ;
    public static boolean bR;
    public String bS = "";
    public long bT = 0L;
    public int bU = 0;
    public int[] bV = new int[]{23034, 23035, 23036};
    private int iG = 0;
    private String[] iH = new String[]{"::home", "::mb", "::gamble"};
    private long iI = System.currentTimeMillis();
    private int iJ = -1;
    public static int bW;
    private boolean iK = false;
    public boolean bX = false;
    private static final int iL = 16;
    private final C_a.a[] iM = rs.p_m.C_a.a();
    private long iN;
    private int iO;
    private final a iP = new a(null);
    private boolean iQ;
    private long iR;
    long bY;
    public boolean bZ = false;
    private Object iS;
    private String iT;
    public boolean ca = false;
    public boolean cb = false;
    private final int[] iU = new int[]{38, 33, 33, 33, 33, 33, 38, 38, 33, 33, 33, 33, 33, 38};
    private final int[] iV = new int[]{522, 560, 593, 625, 659, 692, 724, 522, 560, 593, 625, 659, 692, 724};
    private final int[] iW = new int[]{169, 169, 169, 169, 169, 169, 169, 466, 466, 466, 466, 466, 466, 466};
    public boolean cc = false;
    public boolean cd = false;
    int ce = 0;
    public boolean cf = false;
    public boolean cg = false;
    private C_F_uc iX;
    private C_F_uc iY;
    private C_F_uc iZ;
    private C_F_uc ja;
    private C_F_uc jb;
    private C_F_uc jc;
    public static boolean ch;
    public static long ci;
    private int jd;
    public int cj = -1;
    public int ck;
    private final int[] je = new int[]{17, 49, 83, 114, 146, 180, 214, 16, 49, 82, 116, 148, 184, 214};
    private final int[] jf = new int[]{9, 7, 7, 5, 2, 3, 7, 303, 306, 306, 302, 305, 303, 303, 303};
    private final int[] jg = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private final int[] jh = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private final int[] ji = new int[]{6, 44, 77, 110, 143, 176, 209, 6, 44, 77, 110, 143, 176, 209};
    private final int[] jj = new int[]{0, 0, 0, 0, 0, 0, 0, 298, 298, 298, 298, 298, 298, 298};
    private final int[] jk = new int[]{35, 39, 39, 39, 39, 39, 36, 37, 39, 39, 39, 39, 39, 38};
    int cl = 0;
    public final int[] cm = new int[]{1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471, 19101, 19111, 19121, 19122, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096};
    public final int[] cn = new int[]{1202, 1203, 1209, 1210, 1211, 1218, 1219, 1220, 1227, 1228, 1234, 1235, 1236, 1243, 1244, 1245, 1252, 1253, 1254, 1261, 1262, 1263, 1270, 1271, 1277, 1278, 1279, 1286, 1287, 1293, 1294, 1295, 1302, 1303, 1304, 1311, 1312, 1318, 1319, 1320, 1327, 1328, 1329, 1336, 1337, 1343, 1344, 1345, 1352, 1353, 1354, 1361, 1362, 1363, 1370, 1371, 1377, 1378, 1384, 1385, 1391, 1392, 1393, 1400, 1401, 1407, 1408, 1410, 1417, 1418, 1424, 1425, 1426, 1433, 1434, 1440, 1441, 1442, 1449, 1450, 1456, 1457, 1463, 1464, 1465, 1472, 1473, 1474, 1481, 1482, 1488, 1489, 1490, 1497, 1498, 1499, 1506, 1507, 1508, 1515, 1516, 1517, 1524, 1525, 1526, 1533, 1534, 1535, 1547, 1548, 1549, 1556, 1557, 1558, 1566, 1567, 1568, 1576, 1577, 1578, 1586, 1587, 1588, 1596, 1597, 1598, 1605, 1606, 1607, 1616, 1617, 1618, 1627, 1628, 1629, 1638, 1639, 1640, 6007, 6008, 6011, 8673, 8674, 12041, 12042, 12429, 12430, 12431, 12439, 12440, 12441, 12449, 12450, 12451, 12459, 12460, 15881, 15882, 15885, 18474, 18475, 18478};
    private int jl = -1;
    public String co = "";
    private String jm;
    public boolean cp;
    private boolean jn;
    private String jo = "";
    private Map<Integer, String> jp = new HashMap<Integer, String>();
    private int jq;
    private long jr;
    private int js;
    private String jt;
    public static int cq;
    public static int cr;
    private String[] ju = new String[300];
    long cs = 0L;
    boolean ct = false;
    boolean cu = false;
    private int jv = 0;
    private long jw;
    private long jx;
    private static final int[] jy;
    private static final int[] jz;
    public rs.p_h.C_d cv = new rs.p_h.C_d(this);
    private final long jA = 0L;
    private Map<Integer, rs.p_x.C_d> jB = new HashMap<Integer, rs.p_x.C_d>();
    public static int cw;
    private static final ArrayList<Integer> jC;
    public static final ArrayList<String> cx;
    public static final int[] cy;
    private int jD;
    private long jE;
    private int[][] jF;
    private int[] jG;
    private C_h[][][] jH;
    private int[] jI;
    private int[] jJ;
    private volatile boolean jK;
    private Socket jL;
    public int cz;
    private rs.p_x.C_e jM;
    public rs.p_a.C_j[] cA;
    public int cB;
    public int[] cC;
    private int jN;
    private int[] jO;
    private int jP;
    private int jQ;
    private int jR;
    public String cD;
    public int cE;
    private rs.p_x.C_e jS;
    private boolean jT;
    public static int cF;
    private int[] jU;
    private int[] jV;
    private int[] jW;
    private int[] jX;
    private static int jY;
    private int jZ;
    public int cG;
    public static int cH;
    public static int cI;
    public static int cJ;
    public static int cK;
    public static int cL;
    public static int cM;
    public static int cN;
    public static int cO;
    public static int cP;
    public static int cQ;
    public int cR;
    public int cS;
    public static int cT;
    private final int[] ka;
    private rs.p_l.C_a kb;
    private rs.p_l.C_a kc;
    private rs.p_l.C_a kd;
    private rs.p_l.C_a ke;
    private rs.p_l.C_a kf;
    private C_F_uc kg;
    private C_F_uc kh;
    public C_F_uc cU;
    public C_F_uc cV;
    public C_F_uc cW;
    public C_F_uc cX;
    public int cY = 0;
    private C_F_uc ki;
    private C_F_uc kj;
    public C_F_uc cZ;
    public C_F_uc da;
    public C_F_uc db;
    public C_F_uc dc;
    public C_F_uc dd;
    public C_F_uc[] de = new C_F_uc[21];
    public C_F_uc[] df = new C_F_uc[20];
    private C_F_uc[] kk = new C_F_uc[2];
    private C_F_uc kl;
    private boolean km;
    public final int[] dg;
    private int kn;
    public final boolean[] dh;
    private int ko;
    private rs.p_b.C_a kp;
    private volatile boolean kq;
    private String kr;
    public static int di;
    public static boolean dj;
    private int ks;
    public static String dk;
    public String dl = null;
    public static String dm;
    private final int kt;
    public static final int dn = 2047;
    public static rs.p_a.C_k[] kw_do;
    private int ku;
    private int[] kv;
    private int kw;
    private int[] kx;
    private rs.p_x.C_e[] ky;
    public int dp;
    private int kz;
    private int kA;
    private int kB;
    private int[][] kC;
    private final int kD;
    public rs.p_l.C_e dq;
    private rs.p_l.C_e kE;
    private rs.p_l.C_e kF;
    private rs.p_l.C_e kG;
    public rs.p_l.C_e dr;
    private rs.p_l.C_e kH;
    private rs.p_l.C_e kI;
    private rs.p_l.C_e kJ;
    private rs.p_l.C_e kK;
    private byte[] kL;
    private int kM;
    public int ds;
    public int dt;
    public int du;
    public int dv;
    public static int dw;
    public static int dx;
    private final int[] kN;
    private static int kO;
    private final long[] kP;
    private boolean kQ;
    private final int kR;
    public final int[] dy;
    private int[][] kS;
    private C_F_uc kT;
    private C_F_uc kU;
    private int kV;
    private int kW;
    private int kX;
    private int kY;
    private int kZ;
    private int la;
    private static int lb;
    public final int[] dz;
    public final int[] dA;
    public final String[] dB;
    public final String[] dC;
    public final boolean[] dD;
    public int dE;
    public C_V_uc dF;
    public C_F_uc[] dG;
    public int dH;
    private int lc;
    private int ld;
    public int dI;
    public int dJ;
    private long le;
    private boolean lf;
    private long[] lg;
    private int lh;
    public static int dK;
    public static int dL;
    public static boolean dM;
    private static boolean li;
    private volatile boolean lj;
    public int dN;
    public int dO;
    private final int[] lk = new int[]{0xFFFF00, 0xFF0000, 65280, 65535, 0xFF00FF, 0xFFFFFF};
    private rs.p_l.C_a ll;
    private rs.p_l.C_a lm;
    private final int[] ln;
    private final int[] lo;
    public int[] dP;
    private boolean lp;
    private final int lq;
    private final int[] lr;
    private final int[] ls;
    private final int[] lt;
    private final int[] lu;
    private final int[] lv;
    private final int[] lw;
    private final int[] lx;
    private final String[] ly;
    public int dQ;
    public int dR;
    private static int lz;
    public C_F_uc[] dS;
    private int lA;
    public int dT;
    private final int[] lB;
    private static boolean lC;
    private final boolean lD;
    private int lE;
    private int lF;
    private int lG;
    private int lH;
    private int lI;
    private rs.p_q.C_a lJ;
    private C_F_uc lK;
    private final int lL;
    public static final int[][] dU;
    public static final int[][] dV;
    public String dW = "Enter amount:";
    public String dX = "Enter name:";
    public String dY;
    public static int dZ;
    private int lM;
    private int lN;
    private int lO;
    private int lP;
    private int lQ;
    private int lR;
    public C_h ea;
    public int eb;
    public int ec;
    private int lS;
    private boolean lT;
    public static int ed;
    private static final int[] lU;
    private int lV;
    private int lW;
    public static int ee;
    private C_F_uc lX;
    private C_F_uc lY;
    public int ef;
    private C_F_uc lZ;
    private rs.p_l.C_a ma;
    private C_F_uc mb;
    private C_F_uc mc;
    public final int[] eg;
    private boolean md;
    private C_F_uc[] me;
    public static int eh;
    public static int ei;
    public static int ej;
    public static String ek;
    private int mf;
    private int mg;
    public int el;
    public int em;
    private int mh;
    private int mi;
    public int en;
    public final int[] eo;
    private final int[] mj;
    private int mk;
    private boolean ml;
    public int ep;
    private String mm;
    private static int mn;
    public final int[] eq;
    private rs.p_x.C_f mo;
    public int er;
    public int es;
    public C_h et;
    private final int[] mp;
    public final rs.p_n.C_e eu;
    private rs.p_l.C_a[] mq;
    private static int mr;
    private int ms;
    private final int mt;
    public int ev;
    private final int[] mu;
    private int mv;
    private int mw;
    public static C_d ew;
    private int mx;
    private int my;
    private int mz;
    private int[] mA;
    private int[] mB;
    private C_F_uc mC;
    private C_F_uc mD;
    private C_F_uc mE;
    private C_F_uc mF;
    private C_F_uc mG;
    private C_F_uc mH;
    private C_F_uc mI;
    private C_F_uc mJ;
    private C_F_uc mK;
    private C_F_uc mL;
    private C_F_uc mM;
    private C_F_uc mN;
    private C_F_uc mO;
    private C_F_uc mP;
    private C_F_uc mQ;
    private int mR;
    private boolean mS;
    private String[] mT;
    private rs.p_x.C_e mU;
    public int ex;
    public int ey;
    private int mV;
    public int ez;
    public int eA;
    public int eB;
    public int eC;
    public static int eD;
    public final int[] eE;
    public int[] eF;
    public int[] eG;
    public int[] eH;
    public int[] eI;
    public int[] eJ;
    private C_F_uc[] mW;
    public C_F_uc[] eK;
    public C_F_uc[] eL;
    private C_F_uc[] mX;
    private static int mY;
    private int mZ;
    private int na;
    private int nb;
    private int nc;
    private int nd;
    public static boolean eM;
    public long eN;
    public int eO;
    public boolean eP;
    private static int ne;
    private int nf;
    public String eQ;
    private C_F_uc ng;
    public static rs.p_a.C_k eR;
    private final String[] nh;
    private final boolean[] ni;
    public final int[][][] eS;
    public static final int[] eT;
    public int eU;
    private int nj;
    public int eV;
    private static int nk;
    public int eW;
    private int nl;
    private int nm;
    private String nn;
    private C_F_uc[] no;
    private boolean np;
    public static int eX;
    private rs.p_l.C_a nq;
    private rs.p_l.C_a nr;
    private rs.p_l.C_a ns;
    private rs.p_l.C_a nt;
    private rs.p_l.C_a nu;
    public int eY;
    public boolean eZ;
    public C_F_uc[] fa;
    private boolean nv;
    private rs.p_l.C_a[] nw;
    public static boolean fb;
    private int nx;
    private static int ny;
    public boolean fc;
    public boolean fd;
    private boolean nz;
    private boolean nA;
    public boolean fe;
    public static int ff;
    public static double fg;
    private static final String nB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    private int nC;
    private rs.p_q.C_b nD;
    private int nE;
    public int fh;
    private int nF;
    public int fi;
    public int fj;
    private long nG;
    public String fk;
    public String fl;
    public String fm;
    public static String fn;
    private static int nH;
    private boolean nI;
    private final int[] nJ = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    private int nK;
    private C_h nL;
    public int[] fo;
    public int[] fp;
    public int[] fq;
    public byte[][] fr;
    public int fs;
    public int ft;
    private int nM;
    private int nN;
    private static int nO;
    public int fu;
    private int[] nP;
    private int[] nQ;
    public static rs.p_x.C_e fv;
    private int nR;
    private int nS;
    public C_F_uc fw;
    private rs.p_l.C_a nT;
    private C_F_uc nU;
    public String[] fx;
    private C_F_uc nV;
    private C_F_uc nW;
    public final int[] fy;
    public static final int[] fz;
    private static boolean nX;
    private final int[] nY;
    private int nZ;
    private int oa;
    private int ob;
    public static int fA;
    public String fB;
    private int oc;
    public int[][][] fC;
    private long od;
    public int fD;
    public static C_F_uc[] fE;
    public C_F_uc fF;
    public C_F_uc fG;
    public C_F_uc fH;
    public C_F_uc fI;
    public C_F_uc fJ;
    public C_F_uc fK;
    private long oe;
    public static int fL;
    private int of;
    public static boolean fM;
    public int fN;
    private int og;
    private static int oh;
    private int oi;
    private boolean oj;
    public final int[] fO;
    public rs.C_f[] fP;
    public static int[] fQ;
    private boolean ok;
    public int[] fR;
    public int[] fS;
    public int[] fT;
    private int ol;
    private int om;
    public final int fU = 100;
    private final int[] on;
    private final int[] oo;
    private boolean op;
    private int oq;
    public int fV;
    public int fW;
    public int fX;
    public byte[][] fY;
    public int fZ;
    private int or;
    private final int[] os;
    private final int[] ot;
    private int ou;
    private final boolean ov;
    private int ow;
    private int ox;
    public boolean ga;
    public boolean gb;
    private int oy;
    public byte[][][] gc;
    private int oz;
    public int gd;
    public int ge;
    private C_F_uc oA;
    private int oB;
    public static int gf;
    public static int gg;
    private String oC;
    private String oD;
    private int oE;
    private int oF;
    private rs.p_l.C_K_uc oG;
    private rs.p_l.C_K_uc oH;
    public static rs.p_l.C_K_uc gh;
    public rs.p_l.C_K_uc gi;
    public static rs.p_l.C_K_uc gj;
    public rs.p_l.C_K_uc gk;
    public static rs.p_l.C_h gl;
    public rs.p_l.C_h gm;
    public rs.p_l.C_h gn;
    public rs.p_l.C_h go;
    private int oI;
    public int gp;
    public int gq;
    private int oJ;
    private int[] oK;
    private int[] oL;
    public int gr;
    public int gs;
    public int gt;
    private int oM;
    private String oN;
    public int gu;
    public int gv;
    public int gw;
    public int gx;
    private static int oO;
    private int oP;
    public int gy = 0;
    public static int gz;
    public long gA;
    public long gB;
    public static double gC;
    public static double gD;
    public static final int gE = 128;
    public static final int gF = 383;
    public static final int gG = 512;
    public int gH = 1;
    private static boolean oQ;
    private static double oR;
    private static Dimension oS;
    private static Dimension oT;

    public void a(boolean bl) {
        File file = new File(rs.p_v.C_a.f() + "rsimg/");
        file.mkdir();
        file = new File(rs.p_v.C_a.f() + "rsimg/dump/");
        file.mkdir();
        int[] nArray = new int[]{13072, 13073};
        for (int i = 10000; i < 30000; ++i) {
            Image image;
            rs.p_d.C_k c_k = rs.p_d.C_k.f(i);
            if (c_k == null || c_k.w == null || c_k.w.equalsIgnoreCase("Dwarf remains") || (image = rs.p_d.C_k.a(i, 0)) == null) continue;
            C_Client_mc.a(image, bl ? rs.p_d.C_k.f((int)i).w : Integer.toString(i));
        }
    }

    public void a(int n) {
        File file = new File(rs.p_v.C_a.f() + "rsimg/");
        file.mkdir();
        file = new File(rs.p_v.C_a.f() + "rsimg/dump/");
        file.mkdir();
        rs.p_d.C_k c_k = rs.p_d.C_k.f(n);
        if (c_k == null || c_k.w == null || c_k.w.equalsIgnoreCase("Dwarf remains")) {
            return;
        }
        Image image = rs.p_d.C_k.a(n, 0);
        if (image != null) {
            C_Client_mc.a(image, Integer.toString(n));
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            File[] fileArray;
            for (File file2 : fileArray = file.listFiles()) {
                if (file2.isDirectory()) {
                    C_Client_mc.a(file2);
                    continue;
                }
                file2.delete();
            }
            file.delete();
        }
    }

    public static void a(Image image, String string) {
        BufferedImage bufferedImage = C_Client_mc.a(image);
        try {
            File file = new File("./rsimg/" + string + ".png");
            ImageIO.write((RenderedImage)bufferedImage, "png", file);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static int a(int n, int n2) {
        if (n >= 2940 && n <= 3390 && n2 >= 3521 && n2 <= 3972) {
            return (int)Math.ceil((double)(n2 - 3520) / 8.0);
        }
        return 0;
    }

    public void a(int n, int n2, String object, String string, String string2, int[] nArray) {
        int n3;
        int n4;
        int n5;
        if (rs.C_C_uc.hP == -1 || rs.C_C_uc.hP == -1) {
            return;
        }
        if (object == null) {
            return;
        }
        if (ch && cH != C_ba.c && System.currentTimeMillis() - this.ij >= 1000L) {
            ap = "::wikiarticle " + string;
            this.jr = System.currentTimeMillis();
            this.ij = System.currentTimeMillis();
        }
        object = (String)object + "\nPress @or2@CTRL@whi@ " + string2;
        int n6 = 3;
        Object object2 = object;
        object = (String)object2 + "\n";
        String[] stringArray = ((String)object).split("\n");
        int n7 = stringArray.length * 16 + 3 + 35;
        int n8 = 0;
        String string3 = stringArray[0].replace("@gre@", "").replace("@whi@", "").replace("@cya@", "").replace("@or1@", "").replace("@or2@", "").replace("@or3@", "").replace("@yel@", "");
        n8 = (int)Math.floor(gl.c(string3)) + 20;
        for (n5 = 1; n5 < stringArray.length; ++n5) {
            if (n8 > gl.c(stringArray[n5].replace("@or1@", "").replace("@whi@", "").replace("@cya@", "").replace("@or2@", "").replace("@or3@", "")) + 6) continue;
            n8 = gl.c(stringArray[n5].replace("@or1@", "").replace("@whi@", "").replace("@cya@", "").replace("@or2@", "").replace("@or3@", "")) + 6;
        }
        n6 = n8 / 40;
        if (n6 < 3) {
            n6 = 3;
        }
        if (n8 < (n5 = n6 * 40 + 18)) {
            n8 = n5;
        }
        if (rs.p_f.C_a.ai == C_a.c.a && cH == 3824 && hQ <= 112) {
            n2 = hQ + n7 + 10;
            n = hP - 10;
        }
        int n9 = n2 -= n7;
        if ((n -= n8 / 2) < 5) {
            n = 5;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        rs.p_l.C_c.b(n7, n2, n, 4077096, n8, 200);
        if (this.il == null || !this.ip.equals(object) || System.currentTimeMillis() - this.in >= 200L) {
            this.il = new C_F_uc[n6];
            this.im = new int[n6];
            if (this.io >= nArray.length) {
                this.io = 1;
            }
            n4 = this.io;
            for (n3 = 0; n3 < n6; ++n3) {
                if (n4 >= nArray.length) {
                    n4 = 0;
                }
                this.il[n3] = rs.p_d.C_k.a(nArray[n4], 0, 0, 32);
                this.im[n3] = nArray[n4];
                ++n4;
            }
            this.ip = object;
            ++this.io;
            this.in = System.currentTimeMillis();
        }
        this.aU.c(n + n8 - 14, n2 + 3);
        n2 += 14;
        n4 = 0xFFFFFF;
        for (n3 = 0; n3 < stringArray.length; ++n3) {
            if (n3 == 0) {
                gl.b(stringArray[n3], n, n2, n4, 0);
            } else {
                gl.b(" " + stringArray[n3], n, n2, 0xFFFFFF, 0);
            }
            n2 += 16;
        }
        rs.p_l.C_c.b(n7 - ((n2 -= 10) - n9), n2, n, 2367511, n8, 100);
        if (this.il != null) {
            for (n3 = 0; n3 < this.il.length; ++n3) {
                if (this.il[n3] == null) {
                    this.il[n3] = rs.p_d.C_k.a(this.im[n3], 0, 0, 32);
                }
                if (this.il[n3] == null) continue;
                this.il[n3].f(17 + n + n3 * 35, n2);
            }
        }
        rs.p_l.C_c.d(n, n8, n7, 5918522, n9);
        n3 = 1;
        rs.p_l.C_c.d(n - n3, n8 + n3 * 2, n7 + n3 * 2, 2367511, n9 - n3);
    }

    public void a(int n, int n2, String object, String string) {
        if (rs.C_C_uc.hP == -1 || rs.C_C_uc.hP == -1) {
            return;
        }
        if (object == null) {
            return;
        }
        if (!C_b.o) {
            return;
        }
        if (ch && cH != C_ba.c && System.currentTimeMillis() - this.ij >= 1000L) {
            ap = "::wikiarticle " + string;
            this.jr = System.currentTimeMillis();
            this.ij = System.currentTimeMillis();
        }
        object = (String)object + (ch ? "\nLoading, please wait.." : "\nPress @or2@CTRL@whi@ to view guide");
        this.ik = string;
        rs.p_l.p_f.p_a.p_j.C_a c_a = new rs.p_l.p_f.p_a.p_j.C_a((String)object, true);
        c_a.b(true);
        C_e.d().f().a(c_a);
    }

    public void a(int n, int n2, String string) {
        if (rs.C_C_uc.hP == -1 || rs.C_C_uc.hP == -1) {
            return;
        }
        if (string == null) {
            return;
        }
        C_e.d().f().a(string, true);
    }

    public void a(int n, int n2, String string, String[] stringArray, boolean bl) {
        if (rs.C_C_uc.hP == -1 || rs.C_C_uc.hP == -1) {
            return;
        }
        if (string == null) {
            return;
        }
        rs.p_l.p_f.p_a.p_j.C_a c_a = new rs.p_l.p_f.p_a.p_j.C_a(string, true);
        c_a.a(stringArray);
        C_e.d().f().a(c_a);
    }

    public C_Q_uc a(int n, int n2, int n3, int n4) {
        C_H_uc c_H_uc = this.dF.i[n3][n][n2];
        if (c_H_uc == null) {
            return null;
        }
        if (c_H_uc.j != null && c_H_uc.j.m == n4) {
            return c_H_uc.j;
        }
        if (c_H_uc.k != null && c_H_uc.k.m == n4) {
            return c_H_uc.k;
        }
        if (c_H_uc.l != null && c_H_uc.l.m == n4) {
            return c_H_uc.l;
        }
        for (int i = 0; i < c_H_uc.n; ++i) {
            if (c_H_uc.o[i].m != n4) continue;
            return c_H_uc.o[i];
        }
        return null;
    }

    public void b(int n, int n2, String string) {
        if (this.bj && (rs.C_C_uc.hP == -1 || rs.C_C_uc.hP == -1)) {
            return;
        }
        if (string == null) {
            return;
        }
        C_e.d().f().a(string, true);
    }

    public void a(int n, int n2, String string, int[] nArray) {
        if (rs.C_C_uc.hP == -1 || rs.C_C_uc.hP == -1) {
            return;
        }
        if (string == null) {
            return;
        }
        rs.p_l.p_f.p_a.p_j.C_a c_a = new rs.p_l.p_f.p_a.p_j.C_a(string, true);
        c_a.a(nArray);
        C_e.d().f().a(c_a);
    }

    public static BufferedImage a(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        int n7 = this.bl - 6;
        int n8 = this.bm - 6;
        int n9 = n - n7 * 8;
        int n10 = n2 - n8 * 8;
        int n11 = 10;
        int n12 = this.nJ[n11];
        if (n10 > 0 && n10 < 103 && n9 > 0 && n9 < 103) {
            if (C_Client_mc.b(n, n2, n6)) {
                this.a(-1, -1, n4, n12, n10, n5, n6, n9, 0);
            } else {
                this.a(-1, n3, n4, n12, n10, n5, n6, n9, 0, bl);
            }
        }
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.a(n, n2, n3, n4, n5, n6, false);
    }

    public void a() {
        rs.p_x.C_f c_f = this.a(3, "kw_interface", "kw_interface", this.eE[3], 35);
        rs.p_x.C_f c_f2 = this.a(4, "2d graphics", "media", this.eE[4], 40);
        rs.p_l.C_K_uc[] c_K_ucArray = new rs.p_l.C_K_uc[]{gh, this.gi, gj, this.gk};
        rs.p_n.C_e.a(c_f, c_K_ucArray, c_f2);
        fb = true;
    }

    public void b() {
        int n;
        for (int i = 0; i < rs.p_d.C_k.y.length; ++i) {
            rs.p_d.C_k.y[i] = new rs.p_d.C_k();
        }
        rs.p_d.C_a.a = rs.p_f.C_a.aj ? rs.p_d.C_a.c : rs.p_d.C_a.b;
        rs.p_a.C_h.a(ew.j(), ew);
        rs.p_x.C_f c_f = this.a(2, "config", "config", this.eE[2], 30);
        rs.p_d.C_d.z = new rs.p_d.C_d[20];
        for (n = 0; n < 20; ++n) {
            rs.p_d.C_d.z[n] = new rs.p_d.C_d();
        }
        C_r.J.a();
        C_r.K.a();
        C_r.L.a();
        C_r.M.a();
        C_r.N.a();
        C_r.O.a();
        rs.p_n.C_e.n.a();
        rs.p_n.C_e.aO.a();
        rs.p_d.C_k.k.a();
        rs.p_d.C_k.l.a();
        rs.p_a.C_k.v();
        rs.p_d.C_d.M.a();
        rs.p_d.C_d.N.a();
        rs.p_d.C_x.p.a();
        rs.p_d.C_x.q.a();
        rs.p_d.C_d.z = new rs.p_d.C_d[20];
        for (n = 0; n < 20; ++n) {
            rs.p_d.C_d.z[n] = new rs.p_d.C_d();
        }
        rs.p_d.C_k.a(c_f, rs.p_f.C_a.aj);
        rs.p_d.C_j.a(c_f);
        if (C_Client_mc.eR.aT != null) {
            C_Client_mc.eR.aT = rs.p_d.C_d.c(C_Client_mc.eR.ay);
        }
        for (n = 0; n < this.cB; ++n) {
            rs.p_a.C_j c_j = this.cA[this.cC[n]];
            if (c_j.aG == null) continue;
            c_j.aG = rs.p_d.C_d.c((int)c_j.aG.x);
        }
        ee = 1;
        fb = true;
    }

    public long c() {
        if (this.eN == 0L) {
            return 0L;
        }
        long l2 = this.eN - System.currentTimeMillis();
        return l2 < 0L ? 0L : l2;
    }

    public void d() {
        this.b(false);
    }

    public void b(boolean bl) {
        rs.p_x.C_f c_f;
        int n;
        for (n = 0; n < rs.p_d.C_k.y.length; ++n) {
            rs.p_d.C_k.y[n] = new rs.p_d.C_k();
        }
        if (!rs.p_f.C_a.bs) {
            rs.p_d.C_a.a = rs.p_f.C_a.aj ? rs.p_d.C_a.c : rs.p_d.C_a.b;
        }
        rs.p_a.C_h.a(ew.j(), ew);
        if (this.cd && (c_f = this.a(2, "config", "config", this.eE[2], 30)) != null) {
            rs.p_d.C_k.a(c_f, rs.p_f.C_a.aj);
            rs.p_d.C_j.a(c_f);
        }
        rs.p_d.C_k.k.a();
        rs.p_d.C_k.l.a();
        rs.p_d.C_k.m.a();
        rs.p_d.C_k.j.a();
        rs.p_a.C_k.v();
        rs.p_d.C_d.M.a();
        rs.p_d.C_d.N.a();
        rs.p_d.C_x.p.a();
        rs.p_d.C_x.q.a();
        rs.p_d.C_d.z = new rs.p_d.C_d[20];
        for (n = 0; n < 20; ++n) {
            rs.p_d.C_d.z[n] = new rs.p_d.C_d();
        }
        if (eR != null && C_Client_mc.eR.aT != null) {
            C_Client_mc.eR.aT = rs.p_d.C_d.c(C_Client_mc.eR.ay);
        }
        for (n = 0; n < this.cB; ++n) {
            rs.p_a.C_j c_j = this.cA[this.cC[n]];
            if (c_j.aG == null) continue;
            c_j.aG = rs.p_d.C_d.c((int)c_j.aG.x);
        }
        if (this.cc) {
            ee = 1;
            fb = true;
        }
    }

    public void c(boolean bl) {
        File[] fileArray;
        File file = new File(rs.p_v.C_a.f() + "raw/");
        if (!file.exists()) {
            return;
        }
        for (File file2 : fileArray = new File(rs.p_v.C_a.f() + "raw/").listFiles()) {
            String string = file2.getName().replace(".dat", "");
            int n = Integer.parseInt(string);
            bn.a(n, (Object)true);
        }
    }

    public static final byte[] a(String string) {
        try {
            File file = new File(string);
            int n = (int)file.length();
            byte[] byArray = new byte[n];
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(string)));
            dataInputStream.readFully(byArray, 0, n);
            dataInputStream.close();
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void e() {
        rs.p_v.C_a.a.c();
    }

    private void a(boolean bl, double d2) {
        rs.p_v.C_a.a(d2);
        if (bl) {
            rs.p_v.C_a.j = "voladjust";
        }
    }

    public void a(int n, boolean bl) {
        if (!this.nv) {
            return;
        }
        if (this.lh != n || bl) {
            this.oi = n;
            this.oj = !bl;
            ew.a(2, this.oi);
        }
    }

    private boolean y(int n) {
        if (n < 0) {
            return false;
        }
        int n2 = this.eI[n];
        if (n2 >= 2000) {
            n2 -= 2000;
        }
        return n2 == 337;
    }

    public boolean f() {
        if (this.bw) {
            return true;
        }
        return this.cD != null || this.gb || this.fN > 0 && this.fN != 25 && this.fN != 31 || this.en != -1 || this.gp != -1;
    }

    public String b(String string) {
        return this.ix.c(this.iw.c(string));
    }

    public void g() {
        rs.p_l.C_q.a();
        int n = !C_Client_mc.ai() ? 338 : ah - 165;
        C_E_uc.x = this.fo;
        if (!this.f() && this.v.h()) {
            this.is.f(0, n + 136);
            if (C_Client_mc.aj()) {
                this.it.f(0, n);
            }
            this.v.b();
            C_E_uc.x = this.fq;
            rs.p_l.C_q.b();
            return;
        }
        this.ir.f(0, n);
        this.v.b();
        if (this.gb) {
            this.gn.c(this.eQ, 259, 60 + n, 0, -1);
            this.gn.c(this.fB + "*", 259, 80 + n, 128, -1);
        } else if (this.fN == 1) {
            this.gn.c(this.dW, 259, 60 + n, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + n, 128, -1);
        } else if (this.fN == 2) {
            this.gn.c(this.dX, 259, 60 + n, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + n, 128, -1);
        } else if (this.fN == 3) {
            this.gn.c("Enter the item's name (or part of it) to search:", 259, 60 + n, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + n, 128, -1);
        } else if (this.fN == 4) {
            this.gn.c("Enter the amount you'd like to spawn:", 259, n + 60, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + n, 128, -1);
        } else if (this.fN == 6 && this.q.c() != null) {
            this.q.c().c().c(this.q.c().f(), 259, n + 60, 0, -1);
            this.q.c().d().c(this.q.c().c(this.dY) + "*", 259, 80 + n, 128, -1);
        } else if (this.cD != null) {
            this.gn.c(this.cD, 259, 60 + n, 0, -1);
            this.gn.c("Click to continue", 259, 80 + n, 128, -1);
        } else if (this.gp != -1) {
            this.a(0, 20, rs.p_n.C_e.H[this.gp], 20 + n);
            if (!(this.gp != 6179 || cH != C_aD_mc.bI || rs.p_n.C_e.H[6181].at != null && rs.p_n.C_e.H[6181].at.contains("Unlocked!"))) {
                int n2 = 385;
                int n3 = 15;
                int n4 = 0;
                if (rs.p_f.C_a.ai == C_a.c.a) {
                    n4 = 340;
                }
                if (hP >= n2 && hP <= n2 + 120 && hQ >= n3 + n + n4 && hQ <= n3 + n + 34 + n4) {
                    C_aD_mc.g.c(n2, n3 + n);
                } else {
                    C_aD_mc.f.c(n2, n3 + n);
                }
                this.gm.c("        Purchase", n2 + 59, n3 + 21 + n, 16750623, -1);
            }
        } else if ((double)this.en != -1.0) {
            this.a(0, 20, rs.p_n.C_e.H[this.en], 20 + n);
        } else {
            int n5;
            int n6;
            int n7;
            rs.p_l.C_K_uc c_K_uc = this.gi;
            int n8 = 0;
            rs.p_l.C_c.c(122 + n, 8, 497, 7 + n);
            for (int i = 0; i < 200; ++i) {
                int n9;
                if (this.dC[i] == null) continue;
                n7 = this.dz[i];
                n6 = this.dD[i];
                String string = this.dB[i];
                n5 = this.dA[i];
                int n10 = 70 - (n8 - 3) * 14 + eD + 5;
                int n11 = 0;
                int n12 = 0;
                if (n5 == 18 || n5 == 1 || n5 == 9 || n5 == 28) {
                    n11 = 1;
                    n12 = -1;
                }
                if (n5 == 94) {
                    n12 = -1;
                }
                if (n7 == rs.p_i.C_a.j && (this.fi == rs.p_i.C_a.h || this.fi == rs.p_i.C_a.b) && (this.gx == rs.p_i.C_a.v || this.gx == rs.p_i.C_a.z && n6 == 0)) {
                    if (n10 > 0 && n10 < 210) {
                        this.gm.b(this.dC[i], 11, n10 + n, 0, -1);
                    }
                    ++n8;
                }
                if (n7 == rs.p_i.C_a.s && (this.fi == rs.p_i.C_a.i || this.fi == rs.p_i.C_a.b || this.fi == rs.p_i.C_a.h && n6 == 0) && (this.gv == rs.p_i.C_a.v || n6 == 0)) {
                    if (n10 > 0 && n10 < 210) {
                        this.gm.b(this.dC[i], 11, n10 + n, 0, -1);
                    }
                    ++n8;
                }
                if (!(n7 != rs.p_i.C_a.u || this.fi != rs.p_i.C_a.f && this.fi != rs.p_i.C_a.b || this.gw != rs.p_i.C_a.v && n6 != 0)) {
                    if (n10 > 0 && n10 < 210) {
                        this.gm.b(this.dC[i], 11, n10 + n, 0, -1);
                    }
                    ++n8;
                }
                if (!(n7 != rs.p_i.C_a.t || this.fi != rs.p_i.C_a.g && this.fi != rs.p_i.C_a.b || this.gy != rs.p_i.C_a.v && n6 != 0)) {
                    if (n10 > 0 && n10 < 210) {
                        this.gm.b(this.dC[i], 11, n10 + n, 0, -1);
                    }
                    ++n8;
                }
                if (!(n7 != rs.p_i.C_a.k && n7 != rs.p_i.C_a.l || this.gu != rs.p_i.C_a.v && (this.gu != rs.p_i.C_a.w || !this.i(string)) || this.fi != rs.p_i.C_a.c && this.fi != rs.p_i.C_a.b)) {
                    if (n10 > 0 && n10 < 210) {
                        n9 = 11;
                        if (n5 > 0 && n5 < fE.length) {
                            fE[rs.p_l.C_h.b(n5)].f(n9 + n12, n10 - 12 + n + n11);
                            n9 += 14;
                            if (rs.p_l.C_j.b.w_(n5)) {
                                n9 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(n5)).j();
                            }
                        }
                        this.gm.b(string, n9, n10 + n, 0, -1);
                        this.gm.b(":", n9 + this.gm.c(string), n10 + n, 0, -1);
                        this.gm.b(this.dC[i], n9 + this.gm.c(string) + 6, n10 + n, 255, -1);
                    }
                    ++n8;
                }
                if (!(n7 != rs.p_i.C_a.p && n7 != rs.p_i.C_a.q || this.nS != 0 && this.fi != rs.p_i.C_a.d || n7 != rs.p_i.C_a.p && this.cE != 0 && (this.cE != 1 || !this.i(string)))) {
                    if (n10 > 0 && n10 < 210) {
                        n9 = 11;
                        c_K_uc.b(0, "From", n10 + n, n9);
                        n9 += c_K_uc.a("From ");
                        if (n5 > 0 && n5 < fE.length) {
                            fE[rs.p_l.C_h.b(n5)].f(n9 + n12, n10 - 12 + n + n11);
                            n9 += 14;
                        }
                        c_K_uc.b(0, string + ":", n10 + n, n9);
                        c_K_uc.b(0x800000, this.dC[i], n10 + n, n9 += c_K_uc.a(string) + 8);
                    }
                    ++n8;
                }
                if (n7 == rs.p_i.C_a.o && (this.nS == 0 || this.fi == 2) && this.cE < 2) {
                    if (n10 > 0 && n10 < 210) {
                        c_K_uc.b(0, "To " + string + ":", n10 + n, 11);
                        c_K_uc.b(0x800000, this.dC[i], n10 + n, 17 + c_K_uc.a("To " + string));
                    }
                    ++n8;
                }
                if (n7 == rs.p_i.C_a.m && this.nS == 0 && this.cE < 2) {
                    if (n10 > 0 && n10 < 210) {
                        c_K_uc.b(0x800000, this.dC[i], n10 + n, 11);
                    }
                    ++n8;
                }
                if (n7 == rs.p_i.C_a.n && (this.fZ == 0 || this.fZ == 1 && this.i(string))) {
                    if (n10 > 0 && n10 < 210) {
                        this.gm.b(string + " " + this.dC[i], 11, n10 + n, 0x800080, -1);
                    }
                    ++n8;
                }
                if (n7 != rs.p_i.C_a.r || this.fZ != 0 && (this.fZ != 1 || !this.i(string))) continue;
                if (n10 > 0 && n10 < 210) {
                    c_K_uc.b(8270336, string + " " + this.dC[i], n10 + n, 11);
                }
                ++n8;
            }
            this.gZ.a();
            fA = n8 * 14 + 7;
            if (fA < 111) {
                fA = 111;
            }
            this.b(114, fA - eD - 113, 7 + n, 496, fA);
            String string = eR != null && eR.o() != null ? eR.d(true) : C_O_uc.c(this.fk);
            rs.p_l.C_c.c(140 + n, 8, 509, 120 + n);
            n7 = 0;
            if (cT > 0) {
                n6 = 0;
                int n13 = cT;
                if (cT == 1) {
                    n13 = 0;
                }
                if (cT == 2) {
                    n13 = 1;
                }
                n5 = 0;
                if (n13 == 94) {
                    n5 = -1;
                }
                if (rs.p_l.C_j.b.w_(n13)) {
                    n5 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(n13)).i();
                    n6 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(n13)).h();
                }
                fE[rs.p_l.C_h.b(n13)].f(10 + n6, 122 + n + n5);
                if (rs.p_l.C_j.b.w_(n13)) {
                    n7 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(n13)).j();
                }
                n7 += 14;
            }
            int n14 = (n6 = 0) != 0 ? 0 : -1;
            this.gm.b(string, n7 + 11, 133 + n, n6 != 0 ? 0xFFFFFF : 0, n14);
            this.gm.b(":", n7 + 11 + this.gm.c(string), 133 + n, n6 != 0 ? 0xFFFFFF : 0, n14);
            if (this.dl != null) {
                this.gm.b(this.dl, n7 + 11 + this.gm.c(string) + 6, 133 + n, 0, n14);
            } else {
                this.gm.b(dk, n7 + 11 + this.gm.c(string) + 6, 133 + n, n6 != 0 ? 0xFFFFFF : 255, n14);
                this.gm.b("*", n7 + 11 + this.gm.c(string) + 6 + 1 + this.gm.c(dk), 133 + n, n6 != 0 ? 0xFFFFFF : 255, n14);
            }
            rs.p_l.C_c.b(7, 121 + n, 506, n6 != 0 ? 0x575757 : 8418912);
            this.gZ.a();
        }
        C_E_uc.x = this.fq;
        rs.p_l.C_q.b();
    }

    @Override
    public void init() {
        try {
            dK = 10;
            dL = 0;
            C_Client_mc.aa();
            dM = true;
            rs.p_v.C_a.d = 32;
            rs.p_v.C_a.a(InetAddress.getLocalHost());
            this.n(503, 765);
        }
        catch (Exception exception) {
            return;
        }
    }

    @Override
    public void a(Runnable runnable, int n) {
        if (n > 10) {
            n = 10;
        }
        if (rs.p_v.C_a.h != null) {
            rs.p_v.C_a.a(runnable, n);
        } else {
            super.a(runnable, n);
        }
    }

    public Socket b(int n) {
        return new Socket(InetAddress.getByName(rs.p_f.C_a.j), n);
    }

    public void a(C_a.c c2) {
        oT = null;
        if (c2 == C_a.c.a) {
            ai = 765;
            ah = 503;
            boolean bl = rs.p_k.C_e.a() && this.az();
            int n = bl ? rs.p_k.C_b.g : 765;
            int n2 = bl ? rs.p_k.C_b.h : 503;
            SwingUtilities.invokeLater(() -> {
                C_Launcher_mc.n().p().a(n, n2);
                C_Launcher_mc.n().p().m().pack();
            });
            al = 600;
        } else if (c2 == C_a.c.b) {
            ai = 821;
            ah = 624;
            SwingUtilities.invokeLater(() -> {
                C_Launcher_mc.n().p().a(1198, 624, 821, 624);
                C_Launcher_mc.n().p().m().repaint();
            });
            al = 300;
        } else if (c2 == C_a.c.c) {
            ai = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            ah = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            al = 600;
        }
        this.a(c2, ai, ah);
    }

    public void a(C_a.c c2, int n, int n2) {
        try {
            aj = c2 == C_a.c.a ? 512 : n;
            ak = c2 == C_a.c.a ? 334 : n2;
            ai = n;
            ah = n2;
            this.a(c2 == C_a.c.c, n, n2, c2 == C_a.c.b, c2 != C_a.c.a);
            this.i();
            this.j();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void h() {
        if (rs.p_f.C_a.ai != C_a.c.a) {
            int n = this.B().getWidth();
            int n2 = this.B().getHeight();
            if (n < 1) {
                n = 1;
            }
            if (n2 < 1) {
                n2 = 1;
            }
            if (ai != n || ah != n2) {
                if (ai != n) {
                    aj = ai = n;
                }
                if (ah != n2) {
                    ak = ah = n2;
                }
                this.hG = null;
                this.i();
                this.j();
                this.repaint();
                if (C_Launcher_mc.e()) {
                    C_Launcher_mc.n().a(30);
                }
                rs.p_n.C_d.a();
                oT = null;
            }
        }
    }

    @Override
    public void i() {
        int n = ai;
        int n2 = ah;
        C_E_uc.a(n, n2);
        this.bx = C_E_uc.x;
        this.fo = C_E_uc.x;
        this.fp = C_E_uc.x;
        C_E_uc.x = new int[n2];
        for (int i = 0; i < n2; ++i) {
            C_E_uc.x[i] = n * i;
        }
        this.fq = C_E_uc.x;
        if (this.fc) {
            this.gZ = new C_C_uc(this.av(), this.aw(), this.B());
        }
    }

    @Override
    public void j() {
        if (C_Client_mc.aj()) {
            ak = this.v != null && this.v.h() ? 469 : 334;
        }
        C_E_uc.s = this.at() / 2;
        C_E_uc.t = this.as() / 2;
        if (!rs.p_k.C_e.a()) {
            C_V_uc.d(500, 800, aj, ak);
        }
    }

    public static void a(rs.p_r.C_a c_a) {
        by[c_a.d().w()].b().add(c_a);
    }

    private void bm() {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.eA != 0) {
            return;
        }
        int n5 = this.hU;
        if (n5 == 1 && rs.p_l.C_q.a(this, this.hV, this.hW)) {
            return;
        }
        if (rs.p_f.C_a.ai == C_a.c.a && this.eW == 1 && this.hV >= 516 && this.hW >= 160 && this.hV <= 765 && this.hW <= 205) {
            n5 = 0;
        }
        if ((cH == 35000 || this.gp == 35112) && br != 35062 && n5 == 1 && br != 35079) {
            C_ai.m(-1);
        }
        if (cH == C_aD_mc.bI && n5 == 1) {
            n4 = 385;
            n3 = 15;
            n2 = rs.p_f.C_a.ai == C_a.c.a ? 0 : ah - 165;
            n = 0;
            if (rs.p_f.C_a.ai == C_a.c.a) {
                n = 340;
            }
            if (hP >= n4 && hP <= n4 + 120 && hQ >= n3 + n2 + n && hQ <= n3 + n2 + 34 + n) {
                fv.a(185);
                fv.d(65313);
            }
        }
        if (dj) {
            if (n5 != 1) {
                n4 = rs.C_C_uc.hP;
                n3 = rs.C_C_uc.hQ;
                if (this.dH == 0) {
                    n4 -= 4;
                    n3 -= 4;
                }
                if (this.dH == 1) {
                    n4 -= 553;
                    n3 -= 205;
                }
                if (this.dH == 2) {
                    n4 -= 5;
                    n3 -= 338;
                }
                if (this.dH == 3) {
                    n4 -= 516;
                    n3 += 0;
                }
                if (n4 < this.lc - 10 || n4 > this.lc + this.dI + 10 || n3 < this.ld - 10 || n3 > this.ld + this.dJ + 10) {
                    n2 = 0;
                    if (this.r.b()) {
                        n2 = this.r.c().a() ? 1 : 0;
                    }
                    if (n2 == 0) {
                        dj = false;
                        this.r.a();
                        if (this.dH == 1) {
                            fb = true;
                        }
                        if (this.dH == 2) {
                            fM = true;
                        }
                    }
                }
            }
            if (n5 == 1) {
                rs.p_j.p_b.C_b c_b;
                n4 = this.lc;
                n3 = this.ld;
                n2 = this.dI;
                n = this.hV;
                int n6 = this.hW;
                switch (this.dH) {
                    case 0: {
                        n -= 4;
                        n6 -= 4;
                        break;
                    }
                    case 1: {
                        n -= 519;
                        n6 -= 168;
                        break;
                    }
                    case 2: {
                        n -= 5;
                        n6 -= 338;
                        break;
                    }
                    case 3: {
                        n -= 519;
                        n6 += 0;
                    }
                }
                int n7 = -1;
                for (int i = 0; i < this.eV; ++i) {
                    int n8 = n3 + 31 + (this.eV - 1 - i) * 15;
                    if (n <= n4 || n >= n4 + n2 || n6 <= n8 - 13 || n6 >= n8 + 3) continue;
                    n7 = i;
                }
                if (n7 != -1) {
                    this.D(n7);
                } else if (this.r.b() && this.r.c().a() && (c_b = this.r.c().b()) != null) {
                    c_b.b().invoke();
                }
                dj = false;
                if (this.dH == 1) {
                    fb = true;
                }
                if (this.dH == 2) {
                    fM = true;
                }
            }
            return;
        }
        if (n5 == 1 && this.eV > 0 && ((n4 = this.eI[this.eV - 1]) == 632 || n4 == 78 || n4 == 867 || n4 == 431 || n4 == 53 || n4 == 74 || n4 == 454 || n4 == 539 || n4 == 638 || n4 == 493 || n4 == 847 || n4 == 447 || n4 == 1125)) {
            int n9;
            int n10;
            n3 = this.eF[this.eV - 1];
            n2 = this.eG[this.eV - 1];
            rs.p_n.C_e c_e = rs.p_n.C_e.H[n2];
            if (ch && this.fx[4] != null && this.fx[4].startsWith("Check") && this.fx[4].endsWith("ooting bag")) {
                this.D(4);
                return;
            }
            if (rs.p_f.C_a.aC && ag && !rs.p_s.p_l.C_c.b) {
                n10 = 0;
                n9 = 0;
                for (int i = 0; i < this.fx.length; ++i) {
                    if (this.fx[i] == null || !this.fx[i].contains("Drop") && !this.fx[i].contains("Destroy") && !this.fx[i].contains("Release") || cH == 23000) continue;
                    n10 = 1;
                    n9 = i;
                    break;
                }
                if (n10 != 0) {
                    this.D(n9);
                    return;
                }
            }
            if (c_e.aF || c_e.ag) {
                if (this.hS) {
                    this.iN = this.hX;
                    this.iO = n5;
                    this.iP.a(this, this.eV - 1);
                    this.iQ = true;
                }
                this.op = false;
                this.dT = 0;
                this.ex = n2;
                this.ey = n3;
                n10 = rs.p_f.C_a.ai == C_a.c.b ? ai / 2 - 356 : 0;
                int n11 = n9 = rs.p_f.C_a.ai == C_a.c.b ? ah / 2 - 230 : 0;
                if (rs.C_C_uc.hP >= 28 + n10 && rs.C_C_uc.hP <= 74 + n10) {
                    this.mV = 0;
                }
                if (rs.C_C_uc.hP >= 75 + n10 && rs.C_C_uc.hP <= 121 + n10) {
                    this.mV = 1;
                }
                if (rs.C_C_uc.hP >= 122 + n10 && rs.C_C_uc.hP <= 168 + n10) {
                    this.mV = 2;
                }
                if (rs.C_C_uc.hP >= 169 + n10 && rs.C_C_uc.hP <= 215 + n10) {
                    this.mV = 3;
                }
                if (rs.C_C_uc.hP >= 216 + n10 && rs.C_C_uc.hP <= 262 + n10) {
                    this.mV = 4;
                }
                if (rs.C_C_uc.hP >= 263 + n10 && rs.C_C_uc.hP <= 309 + n10) {
                    this.mV = 5;
                }
                if (rs.C_C_uc.hP >= 310 + n10 && rs.C_C_uc.hP <= 356 + n10) {
                    this.mV = 6;
                }
                if (rs.C_C_uc.hP >= 357 + n10 && rs.C_C_uc.hP <= 403 + n10) {
                    this.mV = 7;
                }
                if (rs.C_C_uc.hP >= 404 + n10 && rs.C_C_uc.hP <= 450 + n10) {
                    this.mV = 8;
                }
                this.eA = 2;
                this.eB = this.hV;
                this.eC = this.hW;
                if (rs.p_n.C_e.H[n2].ah == cH) {
                    this.eA = 1;
                }
                if (rs.p_n.C_e.H[n2].ah == this.gp) {
                    this.eA = 3;
                }
                return;
            }
        }
        if (n5 == 1 && (this.ow == 1 || this.y(this.eV - 1)) && this.eV > 2) {
            n5 = 2;
        }
        if (n5 == 1 && this.eV > 0) {
            this.D(this.eV - 1);
        }
        if (n5 == 2 && this.eV > 0) {
            n4 = 0;
            if (this.eV - 1 >= 0 && this.eV - 1 <= this.fx.length - 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Spawn this item")) {
                n3 = br + 5;
                if (br == 64036) {
                    n3 = 70002;
                }
                if (n3 >= 70000 && n3 <= 70600 && C_af.e.get(n3) != null) {
                    this.iS = C_af.e.get(n3).b();
                    ap = "::tabitem " + String.valueOf(this.iS) + " 1";
                    n4 = 1;
                }
            }
            if (n4 == 0) {
                this.bK();
            }
        }
        if (!this.E() && !rs.p_l.p_b.C_a.b()) {
            this.bD();
        }
        this.n();
    }

    private void a(boolean bl, byte[] byArray) {
        rs.p_v.C_a.l = bl ? 1 : 0;
        rs.p_v.C_a.b(byArray, byArray.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(int n) {
        boolean bl = false;
        if (C_Client_mc.ew.g.g().a_(n)) {
            System.out.println("Dumping OSRS map region " + n + "..");
            bl = true;
            if (rs.p_d.C_h.a != C_h.a.c) {
                rs.p_d.C_h.a(C_h.a.c);
                C_t.a(C_h.a.c);
            }
            if (C_r.E != C_r.a.d) {
                C_r.a(C_r.a.d);
            }
        } else {
            System.out.println("Dumping standard map region " + n + "..");
            if (Arrays.asList(this.d).contains(new Integer(n))) {
                if (C_r.E != C_r.a.b) {
                    C_r.a(C_r.a.b);
                }
            } else if (C_r.E != C_r.a.a) {
                C_r.a(C_r.a.a);
            }
        }
        boolean bl2 = false;
        block3: for (int i = 0; i < 10000; ++i) {
            for (int j = 0; j < 10000; ++j) {
                int n2 = i >> 6;
                int n3 = j >> 6;
                int n4 = n2 * 256 + n3;
                if (n4 == n) {
                    for (int k = -30; k <= 30; k += 10) {
                        for (int i2 = -30; i2 <= 30; i2 += 10) {
                            rs.p_cache.p_osrs.C_c.a(bl);
                            try {
                                this.a(i + k, j + i2, n);
                                continue;
                            }
                            finally {
                                rs.p_cache.p_osrs.C_c.a(false);
                            }
                        }
                    }
                    bl2 = true;
                    continue block3;
                }
                if (bl2) continue block3;
            }
        }
        rs.p_cache.p_osrs.C_c.a(false);
    }

    public void a(int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        this.bX = true;
        this.dR = -1;
        this.et.f();
        this.ea.f();
        C_E_uc.g();
        this.m();
        this.dF.b();
        System.gc();
        int n11 = n / 8;
        int n12 = n2 / 8;
        int n13 = (n11 - 6) * 8;
        int n14 = (n12 - 6) * 8;
        for (n10 = 0; n10 < 4; ++n10) {
            for (n9 = 0; n9 < 104; ++n9) {
                for (n8 = 0; n8 < 104; ++n8) {
                    this.gc[n10][n9][n8] = 0;
                }
            }
        }
        for (n10 = 0; n10 < 4; ++n10) {
            this.fP[n10].a();
        }
        C_x c_x = new C_x(this.gc, this.fC);
        n9 = 62;
        n8 = 0;
        for (n7 = (n11 - 6) / 8; n7 <= (n11 + 6) / 8; ++n7) {
            for (n6 = (n12 - 6) / 8; n6 <= (n12 + 6) / 8; ++n6) {
                ++n8;
            }
        }
        this.fr = new byte[n8][];
        this.fY = new byte[n8][];
        this.fR = new int[n8];
        this.fS = new int[n8];
        this.fT = new int[n8];
        n7 = this.fr.length;
        n8 = 0;
        for (n6 = (n11 - 6) / 8; n6 <= (n11 + 6) / 8; ++n6) {
            for (n5 = (n12 - 6) / 8; n5 <= (n12 + 6) / 8; ++n5) {
                int n15;
                this.fR[n8] = (n6 << 8) + n5;
                this.fS[n8] = ew.b(0, n5, n6);
                n4 = this.fS[n8];
                if (n4 != -1) {
                    ew.a(3, n4);
                }
                if ((n15 = (this.fT[n8] = ew.b(1, n5, n6))) != -1) {
                    ew.a(3, n15);
                }
                ++n8;
            }
        }
        while (ew.g() != 0) {
            this.s();
        }
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = (this.fR[n6] >> 8) * 64 - n13;
            n4 = (this.fR[n6] & 0xFF) * 64 - n14;
            byte[] byArray = this.fr[n6];
            if (byArray == null) continue;
            c_x.a(byArray, n5, n4, (n11 - 6) * 8, (n12 - 6) * 8, this.fP);
        }
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = (this.fR[n6] >> 8) * n9 - n13;
            n4 = (this.fR[n6] & 0xFF) * n9 - n14;
            byte[] byArray = this.fr[n6];
            if (byArray != null || n12 >= 800) continue;
            c_x.a(n4, 64, 64, n5);
        }
        if (++mY > 160) {
            mY = 0;
        }
        for (n6 = 0; n6 < n7; ++n6) {
            byte[] byArray = this.fY[n6];
            if (byArray == null) continue;
            n4 = (this.fR[n6] >> 8) * 64 - n13;
            int n16 = (this.fR[n6] & 0xFF) * 64 - n14;
            c_x.a(n4, this.fP, n16, this.dF, byArray);
        }
        c_x.a(this.fP, this.dF);
        n6 = 104;
        int n17 = 104;
        for (n4 = 0; n4 < 4; ++n4) {
            int[][] nArray = this.fP[n4].a;
            for (int i = 0; i < n6; ++i) {
                for (int j = 0; j < n17; ++j) {
                    int n18 = n13 + i;
                    int n19 = n18 >> 6;
                    int n20 = n14 + j;
                    int n21 = n20 >> 6;
                    int n22 = n19 * 256 + n21;
                    if (n22 != n3 || this.c(n, n2, n18, n20)) continue;
                    String string = rs.C_e.a(n18, n20, n4);
                    boolean bl = false;
                    boolean bl2 = false;
                    if (nArray[i][j] != 0 && C_x.d.get(string) != null) {
                        int n23 = C_x.d.get(string);
                        C_r c_r = C_r.c(n23);
                        bl = c_r.ag;
                        bl2 = true;
                    }
                    rs.C_e.a(n18, n20, n4, nArray[i][j], bl);
                }
            }
        }
    }

    private boolean c(int n, int n2, int n3, int n4) {
        int n5 = n - (n3 / 8 - 6) * 8;
        int n6 = n2 - (n4 / 8 - 6) * 8;
        return n5 < 16 || n5 >= 88 || n6 < 16 || n6 >= 88;
    }

    public static boolean b(int n, int n2, int n3) {
        if (bC == -1) {
            return false;
        }
        if (n3 != dw) {
            return false;
        }
        if (bC != W) {
            return false;
        }
        return n < bE || n > bG || n2 < bF || n2 > bH;
    }

    public static void k() {
        bD = false;
        bC = -1;
        bE = 0;
        bF = 0;
        bG = 0;
        bH = 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void l() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        try {
            int n7;
            int n8;
            this.dR = -1;
            this.et.f();
            this.ea.f();
            C_E_uc.g();
            this.m();
            this.dF.b();
            C_GameStateChanged_mc c_GameStateChanged_mc = new C_GameStateChanged_mc();
            c_GameStateChanged_mc.setGameState(rs.p_runelite.p_a.C_c.f);
            this.p.post(c_GameStateChanged_mc);
            System.gc();
            for (n8 = 0; n8 < 4; ++n8) {
                this.fP[n8].a();
            }
            for (n8 = 0; n8 < 4; ++n8) {
                for (n6 = 0; n6 < 104; ++n6) {
                    for (n5 = 0; n5 < 104; ++n5) {
                        this.gc[n8][n6][n5] = 0;
                    }
                }
            }
            C_x c_x = new C_x(this.gc, this.fC);
            n6 = this.fr.length;
            n5 = 62;
            for (n4 = 0; n4 < n6; ++n4) {
                for (n7 = 0; n7 < 2000; ++n7) {
                    if (this.fR[n4] != this.bz[n7]) continue;
                    this.fS[n4] = this.bA[n7];
                    this.fT[n4] = this.bB[n7];
                }
            }
            fv.a(0);
            if (!this.nA) {
                byte[] byArray;
                for (n4 = 0; n4 < n6; ++n4) {
                    n7 = (this.fR[n4] >> 8) * 64 - eh;
                    n3 = (this.fR[n4] & 0xFF) * 64 - ei;
                    byArray = this.fr[n4];
                    try {
                        if (byArray == null) continue;
                        c_x.a(byArray, n7, n3, (this.mx - 6) * 8, (this.my - 6) * 8, this.fP);
                        continue;
                    }
                    catch (Exception exception) {
                        if (!rs.p_f.C_a.f.booleanValue()) continue;
                        exception.printStackTrace();
                    }
                }
                for (n4 = 0; n4 < n6; ++n4) {
                    n7 = (this.fR[n4] >> 8) * n5 - eh;
                    n3 = (this.fR[n4] & 0xFF) * n5 - ei;
                    byArray = this.fr[n4];
                    if (byArray != null || this.my >= 800) continue;
                    c_x.a(n3, 64, 64, n7);
                }
                if (++mY > 160) {
                    mY = 0;
                }
                fv.a(0);
                for (n4 = 0; n4 < n6; ++n4) {
                    byte[] byArray2 = this.fY[n4];
                    if (byArray2 == null) continue;
                    n3 = (this.fR[n4] >> 8) * 64 - eh;
                    int n9 = (this.fR[n4] & 0xFF) * 64 - ei;
                    try {
                        c_x.a(n3, this.fP, n9, this.dF, byArray2);
                        continue;
                    }
                    catch (Exception exception) {
                        if (!rs.p_f.C_a.f.booleanValue()) continue;
                        exception.printStackTrace();
                    }
                }
            }
            if (this.nA) {
                int n10;
                int n11;
                int n12;
                int n13;
                for (n4 = 0; n4 < 4; ++n4) {
                    for (int i = 0; i < 13; ++i) {
                        block20: for (n3 = 0; n3 < 13; ++n3) {
                            int n14 = this.eS[n4][i][n3];
                            if (n14 == -1) continue;
                            int n15 = n14 >> 24 & 3;
                            n2 = n14 >> 1 & 3;
                            n13 = n14 >> 14 & 0x3FF;
                            n12 = n14 >> 3 & 0x7FF;
                            n11 = (n13 / 8 << 8) + n12 / 8;
                            for (n10 = 0; n10 < this.fR.length; ++n10) {
                                if (this.fR[n10] != n11 || this.fr[n10] == null) continue;
                                c_x.a(n15, n2, this.fP, i * 8, (n13 & 7) * 8, this.fr[n10], (n12 & 7) * 8, n4, n3 * 8);
                                continue block20;
                            }
                        }
                    }
                }
                for (n4 = 0; n4 < 13; ++n4) {
                    for (int i = 0; i < 13; ++i) {
                        n3 = this.eS[0][n4][i];
                        if (n3 != -1) continue;
                        c_x.a(i * 8, 8, 8, n4 * 8);
                    }
                }
                fv.a(0);
                for (n4 = 0; n4 < 4; ++n4) {
                    for (int i = 0; i < 13; ++i) {
                        block26: for (n3 = 0; n3 < 13; ++n3) {
                            int n16 = this.eS[n4][i][n3];
                            if (n16 == -1) continue;
                            int n17 = n16 >> 24 & 3;
                            n2 = n16 >> 1 & 3;
                            n13 = n16 >> 14 & 0x3FF;
                            n12 = n16 >> 3 & 0x7FF;
                            n11 = (n13 / 8 << 8) + n12 / 8;
                            for (n10 = 0; n10 < this.fR.length; ++n10) {
                                if (this.fR[n10] != n11 || this.fY[n10] == null) continue;
                                c_x.a(this.fP, this.dF, n17, i * 8, (n12 & 7) * 8, n4, this.fY[n10], (n13 & 7) * 8, n2, n3 * 8);
                                continue block26;
                            }
                        }
                    }
                }
            }
            fv.a(0);
            c_x.a(this.fP, this.dF);
            fv.a(0);
            n4 = C_x.g;
            if (n4 > dw) {
                n4 = dw;
            }
            if (n4 < dw - 1) {
                n4 = dw - 1;
            }
            if (li) {
                this.dF.a(C_x.g);
            } else {
                this.dF.a(0);
            }
            for (n = 0; n < 104; ++n) {
                for (n3 = 0; n3 < 104; ++n3) {
                    this.o(n, n3);
                }
            }
            if (++mn > 98) {
                mn = 0;
                fv.a(150);
            }
            this.bA();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        rs.p_r.C_J_uc.a();
        C_r.J.a();
        C_r.L.a();
        C_r.M.a();
        C_r.N.a();
        C_r.O.a();
        if (this.hH != null) {
            fv.a(210);
            fv.g(1057001181);
        }
        System.gc();
        C_E_uc.h();
        ew.d();
        int n18 = (this.mx - 6) / 8 - 1;
        int n19 = (this.mx + 6) / 8 + 1;
        n6 = (this.my - 6) / 8 - 1;
        n5 = (this.my + 6) / 8 + 1;
        if (this.np) {
            n18 = 49;
            n19 = 50;
            n6 = 49;
            n5 = 50;
        }
        try {
            for (n4 = n18; n4 <= n19; ++n4) {
                for (n = n6; n <= n5; ++n) {
                    int n20;
                    if (n4 != n18 && n4 != n19 && n != n6 && n != n5) continue;
                    n3 = (n4 << 8) + n;
                    if (ek != null && !C_Client_mc.ew.g.a(n3, ek)) continue;
                    boolean bl = rs.p_cache.p_osrs.C_c.a();
                    if (C_Client_mc.ew.g.g().a_(n3)) {
                        rs.p_cache.p_osrs.C_c.a(true);
                    }
                    if ((n20 = ew.b(0, n, n4)) != -1) {
                        ew.b(n20, 3);
                    }
                    if ((n2 = ew.b(1, n, n4)) != -1) {
                        ew.b(n2, 3);
                    }
                    rs.p_cache.p_osrs.C_c.a(bl);
                }
            }
        }
        finally {
            rs.p_cache.p_osrs.C_c.a(false);
        }
        if (rs.p_k.C_e.a()) {
            this.a.i();
        }
        if (bD) {
            C_Client_mc.k();
        }
    }

    public void m() {
        rs.p_r.C_J_uc.a();
        C_r.J.a();
        C_r.K.a();
        C_r.L.a();
        C_r.M.a();
        C_r.N.a();
        C_r.O.a();
        rs.p_d.C_d.M.a();
        rs.p_d.C_d.N.a();
        rs.p_d.C_k.l.a();
        rs.p_d.C_k.m.a();
        rs.p_d.C_k.j.a();
        rs.p_d.C_k.k.a();
        rs.p_a.C_k.v();
        rs.p_d.C_x.p.a();
        rs.p_d.C_x.q.a();
    }

    private void z(int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int[] nArray = this.aT.m;
        int n6 = nArray.length;
        for (n5 = 0; n5 < n6; ++n5) {
            nArray[n5] = 0;
        }
        for (n5 = 1; n5 < 103; ++n5) {
            n4 = 24628 + (103 - n5) * 512 * 4;
            for (n3 = 1; n3 < 103; ++n3) {
                if ((this.gc[n][n3][n5] & 0x18) == 0) {
                    this.dF.a(nArray, n4, n, n3, n5);
                }
                if (n < 3 && (this.gc[n + 1][n3][n5] & 8) != 0) {
                    this.dF.a(nArray, n4, n + 1, n3, n5);
                }
                n4 += 4;
            }
        }
        n5 = 0xFFFFFF;
        n4 = 0xEE0000;
        this.aT.d();
        for (n3 = 1; n3 < 103; ++n3) {
            for (n2 = 1; n2 < 103; ++n2) {
                if ((this.gc[n][n2][n3] & 0x18) == 0) {
                    this.d(n3, n5, n2, n4, n);
                }
                if (n >= 3 || (this.gc[n + 1][n2][n3] & 8) == 0) continue;
                this.d(n3, n5, n2, n4, n + 1);
            }
        }
        this.gZ.a();
        this.mz = 0;
        for (n3 = 0; n3 < 104; ++n3) {
            for (n2 = 0; n2 < 104; ++n2) {
                int n7 = this.dF.g(dw, n3, n2);
                if (n7 == 0) continue;
                n7 = n7 >> 14 & Short.MAX_VALUE;
                int n8 = C_r.c((int)n7).V;
                if (n8 < 0 || n8 == 39) continue;
                int n9 = n3;
                int n10 = n2;
                this.no[this.mz] = this.me[n8];
                this.mA[this.mz] = n9;
                this.mB[this.mz] = n10;
                ++this.mz;
            }
        }
    }

    public static int d(int n) {
        if (n < 0) {
            n = 0;
        }
        return iA.nextInt(n + 1);
    }

    private void o(int n, int n2) {
        C_h c_h = this.jH[dw][n][n2];
        if (c_h == null) {
            this.dF.l(dw, n, n2);
            return;
        }
        long l2 = -99999999L;
        boolean bl = false;
        C_g c_g = null;
        C_g c_g2 = null;
        C_g c_g3 = null;
        C_g c_g4 = (C_g)c_h.b();
        while (c_g4 != null) {
            rs.p_d.C_k c_k = rs.p_d.C_k.f(c_g4.h);
            long l3 = c_k.f;
            if (c_k.C) {
                l3 *= (long)(c_g4.k + 1);
            }
            if (l3 > l2) {
                l2 = l3;
                c_g = c_g4;
            }
            c_g4 = (C_g)c_h.d();
        }
        c_h.b(c_g);
        c_g4 = (C_g)c_h.b();
        while (c_g4 != null) {
            if (c_g4.h != c_g.h && c_g2 == null) {
                c_g2 = c_g4;
            }
            if (c_g4.h != c_g.h && c_g4.h != c_g2.h && c_g3 == null) {
                c_g3 = c_g4;
            }
            c_g4 = (C_g)c_h.d();
        }
        int n3 = n + (n2 << 7) + 0x60000000;
        this.dF.a(n, n3, c_g2, this.c(dw, n2 * 128 + 64, n * 128 + 64), c_g3, c_g, dw, n2);
    }

    public void d(boolean bl) {
        for (int i = 0; i < this.cB; ++i) {
            int n;
            int n2;
            int n3;
            rs.p_a.C_j c_j = this.cA[this.cC[i]];
            int n4 = 0x20000000 + (this.cC[i] << 14);
            if (c_j == null || !c_j.l() || c_j.aG.K != bl) continue;
            int n5 = c_j.ac >> 7;
            int n6 = c_j.ad >> 7;
            if (n5 < 0 || n5 >= 104 || n6 < 0 || n6 >= 104 || !bl && (n3 = ((n2 = eh + (c_j.ac - 6 >> 7)) >> 6) * 256 + ((n = ei + (c_j.ad - 6 >> 7)) >> 6)) == 10806 && this.kw_if.get(n2 + "," + n) != null) continue;
            if (c_j.S == 1 && (c_j.ac & 0x7F) == 64 && (c_j.ad & 0x7F) == 64) {
                if (this.kS[n5][n6] == gf) continue;
                this.kS[n5][n6] = gf;
            }
            if (!c_j.aG.C) {
                n4 -= Integer.MIN_VALUE;
            }
            this.dF.a(dw, c_j.ae, this.c(dw, c_j.ad, c_j.ac), n4, c_j.ad, (c_j.S - 1) * 64 + 60, c_j.ac, c_j, c_j.T);
        }
    }

    private boolean bn() {
        return rs.p_v.C_a.h();
    }

    private void bo() {
        String string = "ondemand";
        System.out.println(string);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + string + ".html"));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        while (true) {
            try {
                while (true) {
                    Thread.sleep(1000L);
                }
            }
            catch (Exception exception) {
                continue;
            }
            break;
        }
    }

    public int e(int n) {
        int n2 = 0;
        int n3 = 0;
        for (int i = 1; i <= n; ++i) {
            n2 = (int)((double)n2 + Math.floor((double)i + 300.0 * Math.pow(2.0, (double)i / 7.0)));
            if (i >= n) {
                return n3;
            }
            n3 = (int)Math.floor(n2 / 4);
        }
        return 0;
    }

    private void A(int n) {
        if (n <= 0) {
            return;
        }
        rs.p_d.C_k c_k = rs.p_d.C_k.f(n);
        if (c_k == null) {
            return;
        }
        if (c_k.F > 0 && c_k.p > 0) {
            n = c_k.F;
            c_k = rs.p_d.C_k.f(n);
        }
        this.ez = n;
        if (c_k == null) {
            return;
        }
        if (c_k.L == null) {
            return;
        }
        boolean bl = false;
        for (String string : c_k.L) {
            if (string == null || !string.toLowerCase().contains("equip") && !string.toLowerCase().contains("wear") && !string.toLowerCase().contains("wield")) continue;
            bl = true;
            break;
        }
        if (bl || n == 21739) {
            this.jq = n;
            this.jt = c_k.w;
        }
    }

    private void a(int n, rs.p_n.C_e c_e, int n2, int n3, int n4, int n5) {
        int n6;
        if (c_e == null) {
            return;
        }
        if (c_e.aI != 0 || c_e.al == null || c_e.aQ) {
            return;
        }
        int n7 = !C_Client_mc.ai() ? 4 : 0;
        int n8 = n6 = !C_Client_mc.ai() ? 4 : 0;
        if (n2 < n || n4 < n3 || n2 > n + c_e.P || n4 > n3 + c_e.aR) {
            return;
        }
        int n9 = c_e.al.length;
        for (int i = 0; i < n9; ++i) {
            int n10;
            int n11;
            int n12;
            int n13 = c_e.am[i] + n - (C_Client_mc.ai() ? 0 : -2);
            int n14 = c_e.bc[i] + n3 - n5;
            rs.p_n.C_e c_e2 = rs.p_n.C_e.H[c_e.al[i]];
            if (c_e2 == null) break;
            if (!c_e2.bf || c_e2.aw == 32431 && c_e2 instanceof rs.p_n.p_a.p_a.C_b && ((rs.p_n.p_a.p_a.C_b)c_e2).i() != i) continue;
            if (cI != -1 && c_e2.bA != cI && c_e2.aw != cI) {
                if (c_e2.aI != 0) continue;
                this.a(n13, c_e2, n2, n14, n4, c_e2.V - (C_Client_mc.ai() ? 0 : -4));
                if (c_e2.aH <= c_e2.aR) continue;
                this.a(n13 + c_e2.P, c_e2.aR, n2, n4, c_e2, n14, true, c_e2.aH);
                continue;
            }
            if ((c_e2.aw == 40603 || c_e2.aw == 40604) && rs.p_n.C_e.H[40602].at.equalsIgnoreCase("Hunger games loot chest") || !this.j(c_e2.aw)) continue;
            if (c_e2.aw >= 62150 && c_e2.aw <= 62152 && n2 >= (n13 += c_e2.aJ) && n4 >= (n14 += c_e2.aP)) {
                this.iB = true;
            }
            if (rs.p_n.p_b.C_a.b.b().w_(c_e2.aw)) {
                n12 = c_e2.P;
                n11 = c_e2.aR;
                int n15 = n13;
                n10 = n14;
                if (c_e2.aI == 4) {
                    n12 = c_e2.ao.a(c_e2.at);
                    n10 -= 5;
                    if (c_e2.S) {
                        n15 -= n12 / 2;
                    }
                }
                if (n2 >= n15 && n4 >= n10 && n2 < n15 + n12 && n4 < n10 + n11 + 5) {
                    rs.p_n.p_b.C_a.b.a(c_e2.aw);
                }
            }
            if ((c_e2.ab >= 0 || c_e2.L != 0 || c_e2.bz) && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR + 5) {
                if (c_e2.aw >= 47115 && c_e2.aw < 47330 && c_e2.aw % 5 == 0) {
                    this.A(rs.p_n.C_e.H[c_e2.aw + 1].af);
                    this.fx[this.eV] = "View row " + rs.p_n.C_e.H[c_e2.aw + 2].at;
                    this.eI[this.eV] = 1126;
                    this.eG[this.eV] = 1;
                    ++this.eV;
                    this.a(rs.p_n.C_e.H[c_e2.aw + 1].af, this.fx[this.eV - 1], false);
                }
                if (C_ab.bT && cH == 47500 && c_e2.aw >= 47505 && c_e2.aw <= 47704) {
                    return;
                }
                if (c_e2.bn && c_e2.aw != 65757 && c_e2.aw != 65804 && c_e2.aw != 65776 && c_e2.aw != 65778 && c_e2.aw != 56057 && c_e2.aw != 49987 && c_e2.aw != 65765 && c_e2.aw != 65780 && c_e2.aw != 55791 && c_e2.aw != 47009 && c_e2.aw != 47005 && c_e2.aw != 55790 && c_e2.aw != 60607 && c_e2.aw != 61022 && c_e2.aw != 61023 && c_e2.aw != 61018 && c_e2.aw != 61019 && c_e2.aw != 60271 && c_e2.aw != 60272 && c_e2.aw != 47813 && c_e2.aw != 47815 && c_e2.aw != 61084 && c_e2.aw != 61089 && c_e2.aw != 61094 && c_e2.aw != 61199 && c_e2.aw != 52012 && c_e2.aw != 61104 && c_e2.aw != 905 && c_e2.aw != 947 && c_e2.aw != 39978 && c_e2.aw != 951 && c_e2.aw != 63052 && c_e2.aw != 16018 && c_e2.aw != 52009 && c_e2.aw != 55027 && c_e2.aw != 55028 && c_e2.aw != 57222) {
                    if (c_e2.ab >= 0) {
                        if (!(!rs.p_f.C_a.aW && c_e2.ab == 18555 || c_e2.ab >= 18050 && c_e2.ab <= 18104 && c_e2.ab % 2 == 0)) {
                            this.ks = c_e2.ab;
                        }
                    } else {
                        this.ks = c_e2.aw;
                    }
                }
            }
            if (c_e2.bn) {
                if (c_e2.aI == 5 && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR + 5) {
                    br = c_e2.aw;
                }
                if (c_e2.aI == 10 && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR + 5) {
                    br = c_e2.aw;
                }
            }
            if (c_e2.aI == 0) {
                this.a(n13, c_e2, n2, n14, n4, c_e2.V - (C_Client_mc.ai() ? 0 : -4));
                if (c_e2.aH <= c_e2.aR) continue;
                this.a(n13 + c_e2.P, c_e2.aR, n2, n4, c_e2, n14, true, c_e2.aH);
                continue;
            }
            if (c_e2.M == 1 && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR + 5) {
                n12 = 0;
                if (c_e2.J != 0) {
                    n12 = this.d(c_e2) ? 1 : 0;
                }
                if (n12 == 0) {
                    if (c_e2.aw == 30162 || c_e2.aw == 7455 || c_e2.aw == 13095) {
                        this.fx[this.eV] = rs.p_f.C_a.ba ? "Unlock @gre@Teleport to target" : "Lock @gre@Teleport to target";
                        this.eI[this.eV] = 647;
                        this.eG[this.eV] = c_e2.aw;
                        ++this.eV;
                    }
                    this.fx[this.eV] = c_e2.Q;
                    this.eI[this.eV] = 315;
                    this.eG[this.eV] = c_e2.aw;
                    if (c_e2.Q != null && c_e2.Q.equalsIgnoreCase("Select this market listing") && rs.p_n.C_e.H[c_e.al[i] + 3] != null) {
                        rs.p_n.C_e c_e3 = rs.p_n.C_e.H[c_e.al[i] + 3];
                        if (c_e3.af > 0) {
                            rs.p_d.C_k c_k = rs.p_d.C_k.f(c_e3.af);
                            this.fx[this.eV] = "Purchase listing @lre@" + c_k.w;
                            this.a(c_e3.af, this.fx[this.eV], false);
                        }
                    }
                    ++this.eV;
                }
            }
            if (c_e2.M == 2 && this.eW == 0 && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR) {
                String string = c_e2.R;
                if (string.indexOf(" ") != -1) {
                    string = string.substring(0, string.indexOf(" "));
                }
                this.fx[this.eV] = string + " @gre@" + c_e2.N;
                this.eI[this.eV] = 626;
                this.eG[this.eV] = c_e2.aw;
                ++this.eV;
            }
            if (c_e2.M == 3 && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR) {
                this.fx[this.eV] = "Close";
                this.eI[this.eV] = 200;
                this.eG[this.eV] = c_e2.aw;
                ++this.eV;
            }
            if (c_e2.M == 4 && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR) {
                this.fx[this.eV] = c_e2.Q;
                this.eI[this.eV] = 169;
                this.eG[this.eV] = c_e2.aw;
                ++this.eV;
                if (c_e2.k != null) {
                    // empty if block
                }
            }
            if (c_e2.M == 5 && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR) {
                if (c_e2.aw == 30162 || c_e2.aw == 7455 || c_e2.aw == 13095) {
                    this.fx[this.eV] = rs.p_f.C_a.ba ? "Unlock @gre@Teleport to target" : "Lock @gre@Teleport to target";
                    this.eI[this.eV] = 647;
                    this.eG[this.eV] = c_e2.aw;
                    ++this.eV;
                }
                this.fx[this.eV] = c_e2.Q;
                this.eI[this.eV] = 646;
                this.eG[this.eV] = c_e2.aw;
                ++this.eV;
            }
            if (c_e2.M == 6 && !this.eZ && n2 >= n13 && n4 >= n14 && n2 < n13 + c_e2.P && n4 < n14 + c_e2.aR) {
                this.fx[this.eV] = c_e2.Q;
                this.eI[this.eV] = 679;
                this.eG[this.eV] = c_e2.aw;
                ++this.eV;
            }
            if (n2 >= n13 && n4 >= n14 && n2 < n13 + (c_e2.aI == 4 ? 100 : c_e2.P) && n4 < n14 + c_e2.aR && c_e2.W != null && (c_e2.aI == 4 && c_e2.at.length() > 0 || c_e2.aI == 5)) {
                for (int j = c_e2.W.length - 1; j >= 0; --j) {
                    if (c_e2.W[j] == null) continue;
                    this.fx[this.eV] = c_e2.W[j] + (String)(c_e2.aI == 4 ? " " + c_e2.at : "");
                    this.eI[this.eV] = 647;
                    this.eF[this.eV] = j;
                    this.eG[this.eV] = c_e2.aw;
                    ++this.eV;
                }
            }
            if (c_e2.aI != 2) continue;
            int n16 = 0;
            for (n11 = 0; n11 < c_e2.aR; ++n11) {
                for (int j = 0; j < c_e2.P; ++j) {
                    n10 = n13 + j * (32 + c_e2.ac);
                    int n17 = n14 + n11 * (32 + c_e2.ap);
                    if (n16 < 20) {
                        n10 += c_e2.K[n16];
                        n17 += c_e2.as[n16];
                    }
                    if (n2 >= n10 && n4 >= n17 && n2 < n10 + 32 && n4 < n17 + 32) {
                        this.mv = n16;
                        this.mw = c_e2.aw;
                        if (c_e2.az[n16] > 0) {
                            rs.p_d.C_k c_k = rs.p_d.C_k.f(c_e2.az[n16] - 1);
                            if (this.gr == 1 && c_e2.av) {
                                if (c_e2.aw != this.gt || n16 != this.gs) {
                                    this.fx[this.eV] = "Use " + this.oN + " with @lre@" + c_k.w;
                                    this.eI[this.eV] = 870;
                                    this.eJ[this.eV] = c_k.i;
                                    this.eF[this.eV] = n16;
                                    this.eG[this.eV] = c_e2.aw;
                                    ++this.eV;
                                }
                            } else if (this.eW == 1 && c_e2.av) {
                                if ((this.nm & 0x10) == 16) {
                                    this.fx[this.eV] = this.nn + " @lre@" + c_k.w;
                                    this.eI[this.eV] = 543;
                                    this.eJ[this.eV] = c_k.i;
                                    this.eF[this.eV] = n16;
                                    this.eG[this.eV] = c_e2.aw;
                                    ++this.eV;
                                }
                            } else {
                                int n18;
                                if (c_e2.av) {
                                    for (n18 = 4; n18 >= 3; --n18) {
                                        if (c_k.L != null && c_k.L[n18] != null) {
                                            this.fx[this.eV] = c_k.L[n18] + " @lre@" + c_k.w;
                                            if (n18 == 3) {
                                                this.eI[this.eV] = 493;
                                            }
                                            if (n18 == 4) {
                                                this.eI[this.eV] = 847;
                                            }
                                            this.eJ[this.eV] = c_k.i;
                                            this.eF[this.eV] = n16;
                                            this.eG[this.eV] = c_e2.aw;
                                            ++this.eV;
                                            continue;
                                        }
                                        if (n18 != 4) continue;
                                        this.fx[this.eV] = "Drop @lre@" + c_k.w;
                                        this.eI[this.eV] = 847;
                                        this.eJ[this.eV] = c_k.i;
                                        this.eF[this.eV] = n16;
                                        this.eG[this.eV] = c_e2.aw;
                                        ++this.eV;
                                    }
                                }
                                if (c_e2.an) {
                                    this.fx[this.eV] = "Use @lre@" + c_k.w;
                                    this.eI[this.eV] = 447;
                                    this.eJ[this.eV] = c_k.i;
                                    this.eF[this.eV] = n16;
                                    this.eG[this.eV] = c_e2.aw;
                                    ++this.eV;
                                }
                                if (c_e2.av && c_k.L != null) {
                                    for (n18 = 2; n18 >= 0; --n18) {
                                        if (c_k.L[n18] == null) continue;
                                        this.fx[this.eV] = c_k.L[n18] + " @lre@" + c_k.w;
                                        if (n18 == 0) {
                                            this.eI[this.eV] = c_k.L[n18].toLowerCase().contains("wear") || c_k.L[n18].toLowerCase().contains("wield") || c_k.L[n18].toLowerCase().contains("equip") ? 454 : 74;
                                        }
                                        if (n18 == 1) {
                                            this.eI[this.eV] = 454;
                                        }
                                        if (n18 == 2) {
                                            this.eI[this.eV] = 539;
                                        }
                                        this.eJ[this.eV] = c_k.i;
                                        this.eF[this.eV] = n16;
                                        this.eG[this.eV] = c_e2.aw;
                                        ++this.eV;
                                    }
                                }
                                if (c_e2.W != null) {
                                    if (c_e2.ah == 5292 && cH == 23000 && (c_e2.aw < 10335 || c_e2.aw > 10342)) {
                                        if (c_e2.ax[n16] == 0) {
                                            c_e2.W = rs.p_n.p_c.C_h.bJ;
                                        } else if (c_e2.aw < 10335 || c_e2.aw > 10342) {
                                            c_e2.W = c_k.i == 995 ? rs.p_n.p_c.C_h.bL : rs.p_n.p_c.C_h.bK;
                                        }
                                    }
                                    if (c_e2.aw == 2006) {
                                        for (n18 = 0; n18 <= 1; ++n18) {
                                            if (c_k == null || c_k.L == null || c_k.L[n18] == null) continue;
                                            this.fx[this.eV] = c_k.L[n18] + " @lre@" + c_k.w;
                                            this.eJ[this.eV] = c_k.i;
                                            this.eF[this.eV] = n16;
                                            this.eG[this.eV] = c_e2.aw;
                                            this.eI[this.eV] = c_k.L[n18].toLowerCase().contains("wear") || c_k.L[n18].toLowerCase().contains("wield") || c_k.L[n18].toLowerCase().contains("equip") ? 454 : 74;
                                            ++this.eV;
                                        }
                                        if (c_k.i == 995 || c_k.i == 20693) {
                                            this.fx[this.eV] = c_k.L[3] + " @lre@" + c_k.w;
                                            this.eJ[this.eV] = c_k.i;
                                            this.eF[this.eV] = n16;
                                            this.eG[this.eV] = c_e2.aw;
                                            this.eI[this.eV] = 493;
                                            ++this.eV;
                                        }
                                    }
                                    for (n18 = 6; n18 >= 0; --n18) {
                                        if (n18 > c_e2.W.length - 1 || c_e2.W[n18] == null) continue;
                                        this.fx[this.eV] = c_e2.W[n18] + " @lre@" + c_k.w;
                                        if (n18 == 0) {
                                            this.eI[this.eV] = 632;
                                        }
                                        if (n18 == 1) {
                                            this.eI[this.eV] = 78;
                                        }
                                        if (n18 == 2) {
                                            this.eI[this.eV] = 867;
                                        }
                                        if (n18 == 3) {
                                            this.eI[this.eV] = 431;
                                        }
                                        if (n18 == 4) {
                                            this.eI[this.eV] = 53;
                                        }
                                        if (c_e2.ah == 3824 && n18 == 5) {
                                            this.eI[this.eV] = 638;
                                        }
                                        if (c_e2.ah == 5292) {
                                            if (c_e2.W.length < 7) {
                                                if (n18 == 5) {
                                                    this.eI[this.eV] = 291;
                                                }
                                            } else {
                                                if (n18 == 5) {
                                                    this.eI[this.eV] = 300;
                                                }
                                                if (n18 == 6) {
                                                    this.eI[this.eV] = 291;
                                                }
                                            }
                                        }
                                        this.eJ[this.eV] = c_k.i;
                                        this.eF[this.eV] = n16;
                                        this.eG[this.eV] = c_e2.aw;
                                        ++this.eV;
                                    }
                                }
                                this.fx[this.eV] = rs.p_f.C_a.c() && cH == -1 && rs.p_s.p_c.C_c.d ? "<img=191> @mag@Colors @lre@" + c_k.w : "Examine @lre@" + c_k.w;
                                this.eI[this.eV] = 1125;
                                this.eJ[this.eV] = c_k.i;
                                this.eF[this.eV] = n16;
                                this.eG[this.eV] = c_e2.aw;
                                ++this.eV;
                                this.A(c_k.i);
                            }
                        }
                    }
                    ++n16;
                }
            }
        }
    }

    public void a(int n, int n2, int n3, int n4, int n5) {
        this.lX.f(n4, n3);
        this.lY.f(n4, n3 + n - 16);
        rs.p_l.C_c.e(n4, n3 + 16, 16, n - 32, 1);
        rs.p_l.C_c.e(n4, n3 + 16, 15, n - 32, 4011046);
        rs.p_l.C_c.e(n4, n3 + 16, 13, n - 32, 3419425);
        rs.p_l.C_c.e(n4, n3 + 16, 11, n - 32, 3024925);
        rs.p_l.C_c.e(n4, n3 + 16, 10, n - 32, 2696219);
        rs.p_l.C_c.e(n4, n3 + 16, 9, n - 32, 2433049);
        rs.p_l.C_c.e(n4, n3 + 16, 1, n - 32, 1);
        int n6 = (n - 32) * n / n5;
        if (n6 < 8) {
            n6 = 8;
        }
        int n7 = (n - 32 - n6) * n2 / (n5 - n);
        rs.p_l.C_c.e(n4, n3 + 16 + n7, 16, n6, 5063219);
        rs.p_l.C_c.d(n3 + 16 + n7, 1, n6, n4);
        rs.p_l.C_c.d(n3 + 16 + n7, 8482897, n6, n4 + 1);
        rs.p_l.C_c.d(n3 + 16 + n7, 7562570, n6, n4 + 2);
        rs.p_l.C_c.d(n3 + 16 + n7, 6970435, n6, n4 + 3);
        rs.p_l.C_c.d(n3 + 16 + n7, 6970435, n6, n4 + 4);
        rs.p_l.C_c.d(n3 + 16 + n7, 6641729, n6, n4 + 5);
        rs.p_l.C_c.d(n3 + 16 + n7, 6641729, n6, n4 + 6);
        rs.p_l.C_c.d(n3 + 16 + n7, 6378814, n6, n4 + 7);
        rs.p_l.C_c.d(n3 + 16 + n7, 6378814, n6, n4 + 8);
        rs.p_l.C_c.d(n3 + 16 + n7, 6115644, n6, n4 + 9);
        rs.p_l.C_c.d(n3 + 16 + n7, 6115644, n6, n4 + 10);
        rs.p_l.C_c.d(n3 + 16 + n7, 5852730, n6, n4 + 11);
        rs.p_l.C_c.d(n3 + 16 + n7, 5852730, n6, n4 + 12);
        rs.p_l.C_c.d(n3 + 16 + n7, 5326389, n6, n4 + 13);
        rs.p_l.C_c.d(n3 + 16 + n7, 4931889, n6, n4 + 14);
        rs.p_l.C_c.b(n4, n3 + 16 + n7, 15, 1);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 15, 1);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 14, 6641729);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 13, 6970435);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 11, 7167816);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 10, 7562570);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 7, 7759947);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 5, 8088141);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 4, 8285776);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 3, 8482897);
        rs.p_l.C_c.b(n4, n3 + 17 + n7, 2, 1);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 16, 1);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 15, 5655352);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 14, 6115644);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 11, 6444608);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 10, 6641729);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 7, 6970435);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 5, 7233606);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 4, 7430727);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 3, 8088141);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 2, 8482897);
        rs.p_l.C_c.b(n4, n3 + 18 + n7, 1, 1);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 16, 1);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 15, 5326389);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 14, 5655352);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 11, 6115644);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 9, 6378814);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 7, 6641729);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 5, 6970435);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 4, 7233606);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 3, 7562570);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 2, 8482897);
        rs.p_l.C_c.b(n4, n3 + 19 + n7, 1, 1);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 16, 1);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 15, 4931889);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 14, 5523766);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 13, 5852730);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 10, 6115644);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 8, 6378814);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 6, 6641729);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 4, 6970435);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 3, 7562570);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 2, 8482897);
        rs.p_l.C_c.b(n4, n3 + 20 + n7, 1, 1);
        rs.p_l.C_c.d(n3 + 16 + n7, 1, n6, n4 + 15);
        rs.p_l.C_c.b(n4, n3 + 15 + n7 + n6, 16, 1);
        rs.p_l.C_c.b(n4, n3 + 14 + n7 + n6, 15, 1);
        rs.p_l.C_c.b(n4, n3 + 14 + n7 + n6, 14, 4142890);
        rs.p_l.C_c.b(n4, n3 + 14 + n7 + n6, 10, 4471853);
        rs.p_l.C_c.b(n4, n3 + 14 + n7 + n6, 9, 4734511);
        rs.p_l.C_c.b(n4, n3 + 14 + n7 + n6, 7, 4866095);
        rs.p_l.C_c.b(n4, n3 + 14 + n7 + n6, 4, 4931889);
        rs.p_l.C_c.b(n4, n3 + 14 + n7 + n6, 3, 5655352);
        rs.p_l.C_c.b(n4, n3 + 14 + n7 + n6, 2, 1);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 16, 1);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 15, 4471853);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 11, 4931889);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 9, 5326389);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 7, 5523766);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 6, 5655352);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 4, 5852730);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 3, 6444608);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 2, 6970435);
        rs.p_l.C_c.b(n4, n3 + 13 + n7 + n6, 1, 1);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 16, 1);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 15, 4471853);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 14, 4931889);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 12, 5523766);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 11, 5655352);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 10, 5852730);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 7, 6115644);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 4, 6378814);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 3, 7233606);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 2, 8088141);
        rs.p_l.C_c.b(n4, n3 + 12 + n7 + n6, 1, 1);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 16, 1);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 15, 4931889);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 14, 5326389);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 13, 5655352);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 11, 5852730);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 9, 6115644);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 7, 6378814);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 5, 6641729);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 4, 6970435);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 3, 7562570);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 2, 8088141);
        rs.p_l.C_c.b(n4, n3 + 11 + n7 + n6, 1, 1);
    }

    public void b(int n, int n2, int n3, int n4, int n5) {
        this.a(n, n2, n3, n4, n5);
    }

    private void a(rs.p_x.C_e c_e, int n) {
        int n2;
        this.jN = 0;
        this.kw = 0;
        this.e(c_e);
        this.a(n, c_e);
        this.b(c_e);
        for (n2 = 0; n2 < this.jN; ++n2) {
            int n3 = this.jO[n2];
            int n4 = 0x20000000 + (n3 << 14);
            if (!this.cA[n3].aG.C) {
                n4 -= Integer.MIN_VALUE;
            }
            if (this.cA[n3].P == ff) continue;
            this.cA[n3].aG = null;
            this.cA[n3] = null;
            rs.p_k.p_c.C_c.a(n4);
        }
        if (c_e.h != n) {
            rs.p_v.C_a.e(this.fk + " size mismatch in getnpcpos - pos:" + c_e.h + " psize:" + n);
            throw new RuntimeException("eek");
        }
        for (n2 = 0; n2 < this.cB; ++n2) {
            if (this.cA[this.cC[n2]] != null) continue;
            rs.p_v.C_a.e(this.fk + " null entry in npc list - pos:" + n2 + " size:" + this.cB);
            throw new RuntimeException("eek");
        }
    }

    public void n() {
        int n;
        int n2 = n = rs.p_f.C_a.ai == C_a.c.a ? 0 : ah - 530;
        if (rs.C_C_uc.hP >= 5 && rs.C_C_uc.hP <= 61 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.ok = true;
            fM = true;
        } else if (rs.C_C_uc.hP >= 71 && rs.C_C_uc.hP <= 127 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.ok = true;
            fM = true;
        } else if (rs.C_C_uc.hP >= 137 && rs.C_C_uc.hP <= 193 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.ok = true;
            fM = true;
        } else if (rs.C_C_uc.hP >= 203 && rs.C_C_uc.hP <= 259 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.ok = true;
            fM = true;
        } else if (rs.C_C_uc.hP >= 269 && rs.C_C_uc.hP <= 325 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.ok = true;
            fM = true;
        } else if (rs.C_C_uc.hP >= 335 && rs.C_C_uc.hP <= 391 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.ok = true;
            fM = true;
        } else if (rs.C_C_uc.hP >= 404 && rs.C_C_uc.hP <= 515 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.ok = true;
            fM = true;
        } else {
            this.ok = true;
            fM = true;
        }
    }

    private void p(int n, int n2) {
        if (n == 1) {
            if (n2 == 1) {
                C_E_uc.b(0.9);
            }
            if (n2 == 2) {
                C_E_uc.b(0.8);
            }
            if (n2 == 3) {
                C_E_uc.b(0.7);
            }
            if (n2 == 4) {
                C_E_uc.b(0.6);
            }
            rs.p_d.C_k.k.a();
            this.ga = true;
        }
        if (n == 2) {
            if (n2 == 1) {
                C_L_uc.a(4);
                this.a(true, 0.0);
                this.nv = false;
            } else if (n2 == 2) {
                C_L_uc.a(3);
                this.a(true, 0.25);
                this.nv = true;
            } else if (n2 == 3) {
                C_L_uc.a(2);
                this.a(true, 0.5);
                this.nv = true;
            } else if (n2 == 4) {
                C_L_uc.a(1);
                this.a(true, 0.75);
                this.nv = true;
            }
            rs.p_f.C_a.s = n2;
            rs.p_f.C_a.d();
        }
        if (n == 4) {
            rs.p_f.C_a.al = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[12466] != null) {
                this.dP[rs.p_n.C_e.H[12466].X[0][1]] = n2;
                rs.p_n.C_e.H[12466].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 3) {
            rs.p_f.C_a.ak = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[12464] != null) {
                this.dP[rs.p_n.C_e.H[12464].X[0][1]] = n2;
                rs.p_n.C_e.H[12464].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 5) {
            rs.p_f.C_a.ap = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[12468] != null) {
                this.dP[rs.p_n.C_e.H[12468].X[0][1]] = n2;
                rs.p_n.C_e.H[12468].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 6) {
            if (this.cY == 1) {
                this.cY = 2;
            }
            rs.p_f.C_a.aj = n2 == 1;
            rs.p_f.C_a.d();
            if (this.cc) {
                this.d();
            }
            if (rs.p_n.C_e.H[915] != null) {
                this.dP[rs.p_n.C_e.H[915].X[0][1]] = n2;
                rs.p_n.C_e.H[915].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 8) {
            this.nS = n2;
            rs.p_f.C_a.bu = n2;
            fM = true;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[957] != null) {
                this.dP[rs.p_n.C_e.H[957].X[0][1]] = n2;
                rs.p_n.C_e.H[957].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 7) {
            fb = true;
        }
        if (n == 9) {
            this.kM = n2;
        }
        if (n == 10) {
            rs.p_f.C_a.ax = n2 == 1;
            int n3 = eh + (eh - 6 >> 7);
            int n4 = ei + (ei - 6 >> 7);
            int n5 = n3 >> 6;
            int n6 = n4 >> 6;
            int n7 = n5 * 256 + n6;
            if (!this.aC && n7 != 9023 && n7 != 9022 && n7 != 9023 && n7 != 9024 && n7 != 8767 && n7 != 9279 && c.get(n7) == null && c.get(W) == null) {
                boolean bl = C_x.h = !rs.p_f.C_a.ax;
                if (this.fr != null && !this.bI) {
                    ee = 1;
                } else {
                    this.bI = false;
                }
            }
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[12470] != null) {
                this.dP[rs.p_n.C_e.H[12470].X[0][1]] = n2;
                rs.p_n.C_e.H[12470].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 11) {
            rs.p_f.C_a.aw = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[12480] != null) {
                this.dP[rs.p_n.C_e.H[12480].X[0][1]] = n2;
                rs.p_n.C_e.H[12480].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 12) {
            rs.p_f.C_a.ay = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[12482] != null) {
                this.dP[rs.p_n.C_e.H[12482].X[0][1]] = n2;
                rs.p_n.C_e.H[12482].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 13) {
            if (rs.p_f.C_a.ah) {
                if (this.cc) {
                    this.a("<img=163> This feature is disabled in Lite mode!", 0, null);
                }
                rs.p_f.C_a.az = false;
                n2 = 0;
            } else {
                rs.p_f.C_a.az = n2 == 1;
                rs.p_f.C_a.d();
                if (this.cc) {
                    this.d();
                }
            }
            if (rs.p_n.C_e.H[39975] != null) {
                this.dP[rs.p_n.C_e.H[39975].X[0][1]] = n2;
                rs.p_n.C_e.H[39975].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 14) {
            rs.p_f.C_a.aA = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[39973] != null) {
                this.dP[rs.p_n.C_e.H[39973].X[0][1]] = n2;
                rs.p_n.C_e.H[39973].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 15) {
            rs.p_f.C_a.aB = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19099] != null) {
                this.dP[rs.p_n.C_e.H[19099].X[0][1]] = n2;
                rs.p_n.C_e.H[19099].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 16) {
            rs.p_f.C_a.aC = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19097] != null) {
                this.dP[rs.p_n.C_e.H[19097].X[0][1]] = n2;
                rs.p_n.C_e.H[19097].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 17) {
            rs.p_f.C_a.aE = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19095] != null) {
                this.dP[rs.p_n.C_e.H[19095].X[0][1]] = n2;
                rs.p_n.C_e.H[19095].I[0] = n2 == 0 ? 1 : 0;
                this.at = n2 == 0 ? "::newticks" : "::oldticks";
            }
            fb = true;
        }
        if (n == 18) {
            rs.p_f.C_a.aF = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19093] != null) {
                this.dP[rs.p_n.C_e.H[19093].X[0][1]] = n2;
                rs.p_n.C_e.H[19093].I[0] = n2 == 0 ? 1 : 0;
                this.at = n2 == 0 ? "::instantswitching" : "::queuedswitching";
            }
            fb = true;
        }
        if (n == 19) {
            rs.p_f.C_a.aG = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19091] != null) {
                this.dP[rs.p_n.C_e.H[19091].X[0][1]] = n2;
                rs.p_n.C_e.H[19091].I[0] = n2 == 0 ? 1 : 0;
                C_aH_mc.i();
            }
            fb = true;
        }
        if (n == 20) {
            rs.p_f.C_a.aI = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19089] != null) {
                this.dP[rs.p_n.C_e.H[19089].X[0][1]] = n2;
                rs.p_n.C_e.H[19089].I[0] = n2 == 0 ? 1 : 0;
                C_aH_mc.i();
            }
            fb = true;
        }
        if (n == 21) {
            rs.p_f.C_a.aJ = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19087] != null) {
                this.dP[rs.p_n.C_e.H[19087].X[0][1]] = n2;
                rs.p_n.C_e.H[19087].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 22) {
            if (rs.p_f.C_a.ai == C_a.c.b) {
                rs.p_f.C_a.ai = C_a.c.a;
                this.a(C_a.c.a);
            } else {
                rs.p_f.C_a.ai = C_a.c.b;
                this.a(C_a.c.b);
            }
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[12472] != null) {
                this.dP[rs.p_n.C_e.H[12472].X[0][1]] = n2;
                rs.p_n.C_e.H[12472].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 23) {
            if (this.cc) {
                this.iC = System.currentTimeMillis();
            }
            if (rs.p_f.C_a.ah) {
                rs.p_f.C_a.a(false);
                if (this.cc) {
                    this.a("<img=163> Lite mode has been @red@disabled", 0, null);
                }
            } else {
                rs.p_f.C_a.a(true);
                if (this.cc) {
                    this.a("<img=163> Lite mode @blu@enabled.@bla@ Graphics have been lowered to increase performance..", 0, null);
                }
            }
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[12474] != null) {
                this.dP[rs.p_n.C_e.H[12474].X[0][1]] = n2;
                int n8 = rs.p_n.C_e.H[12474].I[0] = n2 == 0 ? 1 : 0;
            }
            if (this.cc) {
                this.a(1, "Loading - please wait.", null);
                this.b();
                C_x.f = dw;
                this.l();
                fv.a(121);
                if (rs.p_f.C_a.ah) {
                    this.cc = false;
                    rs.p_n.C_e.H[39974].at = "<str>Particle/glow effects</str>";
                    this.p(13, 0);
                    this.cc = true;
                } else {
                    rs.p_n.C_e.H[39974].at = "Particle/glow effects";
                }
            }
        }
        if (n == 24) {
            rs.p_f.C_a.aO = n2 == 1;
            rs.p_f.C_a.d();
            C_V_uc.a(rs.p_f.C_a.aO);
            if (rs.p_n.C_e.H[19085] != null) {
                this.dP[rs.p_n.C_e.H[19085].X[0][1]] = n2;
                rs.p_n.C_e.H[19085].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 25) {
            rs.p_f.C_a.aP = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19083] != null) {
                this.dP[rs.p_n.C_e.H[19083].X[0][1]] = n2;
                rs.p_n.C_e.H[19083].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 26) {
            rs.p_f.C_a.aQ = n2 == 1;
            rs.p_f.C_a.d();
            if (this.cc) {
                this.d();
            }
            if (rs.p_n.C_e.H[19081] != null) {
                this.dP[rs.p_n.C_e.H[19081].X[0][1]] = n2;
                rs.p_n.C_e.H[19081].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 27) {
            rs.p_f.C_a.aT = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19079] != null) {
                this.dP[rs.p_n.C_e.H[19079].X[0][1]] = n2;
                rs.p_n.C_e.H[19079].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 28) {
            rs.p_f.C_a.aZ = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19077] != null) {
                this.dP[rs.p_n.C_e.H[19077].X[0][1]] = n2;
                rs.p_n.C_e.H[19077].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 29) {
            rs.p_f.C_a.bb = n2 == 1;
            rs.p_f.C_a.d();
            if (this.cc) {
                this.d();
            }
            if (rs.p_n.C_e.H[19075] != null) {
                this.dP[rs.p_n.C_e.H[19075].X[0][1]] = n2;
                rs.p_n.C_e.H[19075].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 30) {
            rs.p_f.C_a.aK = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19073] != null) {
                this.dP[rs.p_n.C_e.H[19073].X[0][1]] = n2;
                rs.p_n.C_e.H[19073].I[0] = n2 == 0 ? 1 : 0;
            }
            fb = true;
        }
        if (n == 31) {
            rs.p_f.C_a.aL = n2 == 1;
            rs.p_f.C_a.d();
            if (rs.p_n.C_e.H[19071] != null) {
                this.dP[rs.p_n.C_e.H[19071].X[0][1]] = n2;
                rs.p_n.C_e.H[19071].I[0] = n2 == 0 ? 1 : 0;
            }
        }
    }

    private void B(int n) {
        int n2 = C_z.a[n].b;
        int n3 = this.dP[n];
        if (n == 174) {
            n2 = 10;
        }
        if (n == 175) {
            n2 = 11;
        }
        if (n == 176) {
            n2 = 12;
        }
        if (n == 177) {
            n2 = 13;
        }
        if (n == 178) {
            n2 = 14;
        }
        if (n == 179) {
            n2 = 15;
        }
        if (n == 180) {
            n2 = 16;
        }
        if (n == 181) {
            n2 = 17;
        }
        if (n == 182) {
            n2 = 18;
        }
        if (n == 183) {
            n2 = 19;
        }
        if (n == 184) {
            n2 = 20;
        }
        if (n == 185) {
            n2 = 21;
        }
        if (n == 186) {
            n2 = 22;
        }
        if (n == 187) {
            n2 = 23;
        }
        if (n == 188) {
            n2 = 24;
        }
        if (n == 189) {
            n2 = 25;
        }
        if (n == 190) {
            n2 = 26;
        }
        if (n == 191) {
            n2 = 27;
        }
        if (n == 192) {
            n2 = 28;
        }
        if (n == 193) {
            n2 = 29;
        }
        if (n == 194) {
            n2 = 30;
        }
        if (n == 195) {
            n2 = 31;
        }
        this.p(n2, n3);
    }

    private void a(String string, rs.p_a.C_k c_k, int n, int n2) {
        if (c_k.q == null) {
            c_k.v = 10;
            c_k.O = 150;
            c_k.q = string;
        } else if (c_k.q != string) {
            gj.a(0xFF0000, string, n2 - 10, n);
        }
    }

    private void a(rs.p_a.C_k c_k, int n, int n2) {
        this.a("[HIDDEN]", c_k, n, n2);
    }

    public void o() {
        try {
            int n;
            int n2;
            int n3;
            int n4 = 0;
            for (n3 = -1; n3 < this.ku + this.cB; ++n3) {
                int n5;
                rs.p_d.C_d c_d;
                rs.p_a.C_c c_c = n3 == -1 ? eR : (n3 < this.ku ? kw_do[this.kv[n3]] : this.cA[this.cC[n3 - this.ku]]);
                if (c_c == null || !c_c.l()) continue;
                n2 = 0;
                if (c_c instanceof rs.p_a.C_j) {
                    c_d = ((rs.p_a.C_j)c_c).aG;
                    if (c_d.G != null) {
                        c_d = c_d.c();
                    }
                    if (c_d == null) continue;
                    if (((rs.p_a.C_j)c_c).aG.L != null) {
                        C_e.d().a(C_a.f, (Object)((rs.p_a.C_j)c_c), ((rs.p_a.C_j)c_c).c());
                    }
                    if (((rs.p_a.C_j)c_c).aF >= 0) {
                        this.a(c_c, c_c.r + 15);
                        this.mW[((rs.p_a.C_j)c_c).aF].f(this.dN - 12, this.dO - 25);
                    }
                    if (((rs.p_a.C_j)c_c).aB >= 0 && ((rs.p_a.C_j)c_c).aG.x == 8330L) {
                        this.a(c_c, c_c.r + 15);
                        ((rs.p_a.C_j)c_c).a(C_J_uc.h, this.dN - 12, this.dO - 17);
                    }
                    if (c_d.T > 0) {
                        this.a(c_c, c_c.r + c_d.W);
                        if (rs.p_l.C_j.b.w_(c_d.T)) {
                            fE[((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(c_d.T)).b()].f(this.dN + c_d.U, this.dO + c_d.V);
                        } else {
                            fE[c_d.T].f(this.dN + c_d.U, this.dO + c_d.V);
                        }
                    }
                    if (c_d.x >= 8184L && c_d.x <= 8186L && ((rs.p_a.C_j)c_c).az > 0) {
                        this.a(c_c, c_c.r + 100);
                        if (((rs.p_a.C_j)c_c).az == 1) {
                            fE[59].f(this.dN - 8, this.dO);
                        }
                        if (((rs.p_a.C_j)c_c).az == 2) {
                            fE[58].f(this.dN - 8, this.dO);
                        }
                        if (((rs.p_a.C_j)c_c).az == 3) {
                            fE[369].f(this.dN - 8, this.dO);
                        }
                    }
                    if ((c_d.x == 3962L || c_d.x == 3965L) && ((rs.p_a.C_j)c_c).az > 0) {
                        this.a(c_c, c_c.r - 40);
                        fE[53].f(this.dN - 8, this.dO);
                    }
                    if ((c_d.x == 6991L || c_d.x == 8124L || c_d.x == 8125L || c_d.x == 8126L) && ((rs.p_a.C_j)c_c).az > 0) {
                        this.a(c_c, c_c.r + 40);
                        fE[53].f(this.dN - 8, this.dO);
                    }
                    if ((c_d.x == 6650L || c_d.x >= 5159L && c_d.x <= 5164L || c_d.x == 6049L) && ((rs.p_a.C_j)c_c).az > 0) {
                        this.a(c_c, c_c.r + 15);
                        if (((rs.p_a.C_j)c_c).az == 1) {
                            fE[22].f(this.dN - 8, this.dO);
                        } else if (((rs.p_a.C_j)c_c).az == 2) {
                            fE[22].f(this.dN - 8, this.dO - 10);
                            fE[22].f(this.dN - 8, this.dO - 5);
                        } else if (((rs.p_a.C_j)c_c).az == 3) {
                            fE[22].f(this.dN - 8, this.dO - 10);
                            fE[22].f(this.dN - 8, this.dO - 5);
                            fE[22].f(this.dN - 8, this.dO);
                        }
                    }
                    if (c_d.x == 2476L) {
                        this.a(c_c, c_c.r + 15);
                        fE[94].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 6537L) {
                        this.a(c_c, c_c.r + 15);
                        fE[87].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1208L) {
                        this.a(c_c, c_c.r + 15);
                        fE[164].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 401L) {
                        this.a(c_c, c_c.r + 15);
                        fE[190].f(this.dN - 8, this.dO - 18);
                    }
                    if (c_d.x == 2399L) {
                        this.a(c_c, c_c.r + 15);
                        fE[112].f(this.dN - 8, this.dO - 18);
                    }
                    if (c_d.x == 5942L) {
                        this.a(c_c, c_c.r + 15);
                        fE[100].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 6184L) {
                        this.a(c_c, c_c.r + 15);
                        fE[92].f(this.dN - 8, this.dO - 5);
                    }
                    if (c_d.x == 6L) {
                        this.a(c_c, c_c.r + 15);
                        fE[3].f(this.dN - 6, this.dO - 15);
                    }
                    if (c_d.x == 410L) {
                        this.a(c_c, c_c.r + 15);
                        fE[92].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 2165L) {
                        this.a(c_c, c_c.r + 15);
                        fE[189].f(this.dN - 10, this.dO - 25);
                    }
                    if (c_d.x == 1780L) {
                        this.a(c_c, c_c.r + 15);
                        fE[9].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 851L) {
                        this.a(c_c, c_c.r + 15);
                        fE[9].f(this.dN - 8, this.dO - 15);
                    }
                    if (((rs.p_a.C_j)c_c).aH && !((rs.p_a.C_j)c_c).q()) {
                        this.a(c_c, c_c.r + 15);
                        if (ff % 20 < 10) {
                            this.mX[0].f(this.dN - 12, this.dO - 28);
                        }
                    }
                    if (c_d.x == 2998L || c_d.x == 1835L || c_d.x == 4658L || c_d.x == 4659L || c_d.x == 4965L || c_d.x == 5112L || c_d.x == 8028L) {
                        this.a(c_c, c_c.r + 15);
                        this.fJ.f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 2790L) {
                        this.a(c_c, c_c.r + 15);
                        this.fK.f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 692L) {
                        this.a(c_c, c_c.r + 15);
                        fE[152].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 4088L) {
                        this.a(c_c, c_c.r + 15);
                        fE[228].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 830L) {
                        this.a(c_c, c_c.r + 15);
                        fE[87].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 4621L) {
                        this.a(c_c, c_c.r + 15);
                        fE[59].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 4623L) {
                        this.a(c_c, c_c.r + 15);
                        fE[73].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1798L) {
                        this.a(c_c, c_c.r - 325);
                        fE[51].f(this.dN - 8, this.dO + 5);
                    }
                    if (c_d.x == 1839L || c_d.x >= 727L && c_d.x <= 730L || c_d.x >= 3682L && c_d.x <= 3694L) {
                        this.a(c_c, c_c.r + 15);
                        this.mK.f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1019L || c_d.x == 4100L || c_d.x == 4101L || c_d.x == 4102L || c_d.x >= 7072L && c_d.x <= 7076L) {
                        this.a(c_c, c_c.r + 5);
                        this.mL.f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 6390L) {
                        this.a(c_c, c_c.r + 50);
                        fE[79].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1552L) {
                        this.a(c_c, c_c.r + 50);
                        fE[82].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 4416L) {
                        this.a(c_c, c_c.r + 15);
                        this.mP.f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 251L) {
                        this.a(c_c, c_c.r + 15);
                        this.fI.f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 2830L) {
                        this.a(c_c, c_c.r + 15);
                        fE[258].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 373L) {
                        this.a(c_c, c_c.r + 15);
                        fE[192].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1596L || c_d.x == 8031L) {
                        this.a(c_c, c_c.r + 15);
                        this.me[51].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1917L) {
                        this.a(c_c, c_c.r + 15);
                        fE[122].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 6750L) {
                        this.a(c_c, c_c.r + 15);
                        fE[123].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 554L) {
                        this.a(c_c, c_c.r + 15);
                        fE[120].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1699L) {
                        this.a(c_c, c_c.r + 15);
                        fE[118].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1050L) {
                        this.a(c_c, 245);
                        fE[321].f(this.dN - 6, this.dO - 15);
                    }
                    if (c_d.x == 7484L) {
                        this.a(c_c, 230);
                        fE[274].f(this.dN - 10, this.dO - 15);
                    }
                    if (c_d.x == 7482L) {
                        this.a(c_c, 230);
                        fE[278].f(this.dN - 10, this.dO - 15);
                    }
                    if (c_d.x == 2575L) {
                        this.a(c_c, 230);
                        fE[278].f(this.dN - 10, this.dO - 15);
                    }
                    if (c_d.x == 2333L) {
                        this.a(c_c, 230);
                        fE[278].f(this.dN - 10, this.dO - 15);
                    }
                    if (c_d.x == 6174L || c_d.x == 6175L) {
                        this.a(c_c, 230);
                        this.fJ.f(this.dN - 8, this.dO - 18);
                    }
                    if (c_d.x == 6179L) {
                        this.a(c_c, 230);
                        this.eK[1].f(this.dN - 12, this.dO - 24);
                        this.fJ.f(this.dN + 15, this.dO - 18);
                    }
                    if (c_d.x == 1597L) {
                        this.a(c_c, c_c.r + 15);
                        this.fH.f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1799L) {
                        this.a(c_c, c_c.r - 220);
                        this.fG.f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1800L) {
                        this.a(c_c, c_c.r - 300);
                        this.me[1].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1797L) {
                        this.a(c_c, c_c.r - 300);
                        this.me[1].f(this.dN - 8, this.dO - 18);
                    }
                    if (c_d.x == 1802L) {
                        this.a(c_c, c_c.r - 135);
                        fE[182].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1801L) {
                        this.a(c_c, c_c.r - 400);
                        fE[194].f(this.dN - 8, this.dO - 15);
                    }
                    if (c_d.x == 1803L) {
                        this.a(c_c, c_c.r + 100);
                        fE[194].f(this.dN - 8, this.dO - 15);
                    }
                }
                if (n3 < this.ku) {
                    int n6;
                    int n7 = 25;
                    rs.p_a.C_c c_c2 = c_c;
                    if (!rs.p_runelite.p_b.C_a.b().isEmpty()) {
                        for (n6 = 0; n6 < rs.p_runelite.p_b.C_a.b().size(); ++n6) {
                            if (rs.p_runelite.p_b.C_a.b().get(n6).draw(c_c2, false)) continue;
                            n2 = 1;
                            break;
                        }
                    }
                    if (((rs.p_a.C_k)c_c2).bd == 10 && n2 == 0) {
                        this.a(c_c, c_c.r + 15);
                        this.a((rs.p_a.C_k)c_c2, this.dN, this.dO);
                    } else if (((rs.p_a.C_k)c_c2).bd == 11 && n2 == 0) {
                        this.a(c_c, c_c.r + 15);
                        this.a("[SUPER HIDDEN]", (rs.p_a.C_k)c_c2, this.dN, this.dO);
                    } else if (rs.p_f.C_a.bf > 0 && n2 == 0) {
                        this.a(c_c, c_c.r + 15);
                        fE[rs.p_f.C_a.bf].f(this.dN - 8, this.dO - 18);
                    } else if (((rs.p_a.C_k)c_c2).bd >= 0 && n2 == 0) {
                        this.a(c_c, c_c.r + 15);
                        if (this.dN > -1) {
                            if (((rs.p_a.C_k)c_c2).by > 0) {
                                n6 = c_c.L > ff ? 4 : 0;
                                long l2 = System.currentTimeMillis() - ((rs.p_a.C_k)c_c2).bz;
                                long l3 = (long)((rs.p_a.C_k)c_c2).by - l2 / 1000L;
                                Date date = new Date(l3 * 1000L);
                                String string = new SimpleDateFormat("m:ss").format(date);
                                int n8 = this.dN;
                                int n9 = this.dO;
                                if (((rs.p_a.C_k)c_c2).bf != 255 && ((rs.p_a.C_k)c_c2).bf >= 2) {
                                    n8 = this.dN + 31;
                                    n9 = c_c.L > ff ? this.dO - 3 : this.dO + 1;
                                }
                                gl.c(string, n8, n9 - n6, 0xFFFFFF, 1);
                                n7 += 10 + n6;
                            }
                            try {
                                if (((rs.p_a.C_k)c_c2).bg > 0 && ed == 197) {
                                    n6 = 0;
                                    int n10 = 15;
                                    if (((rs.p_a.C_k)c_c2).bf == 0) {
                                        if (((rs.p_a.C_k)c_c2).bd != 0) {
                                            n10 = 17;
                                        }
                                    } else if (((rs.p_a.C_k)c_c2).bf >= 9 && ((rs.p_a.C_k)c_c2).bf <= 18) {
                                        if (((rs.p_a.C_k)c_c2).bd != 0) {
                                            n10 = 17;
                                        }
                                    } else {
                                        n6 = 5;
                                        int n11 = n10 = ((rs.p_a.C_k)c_c2).bd != 255 ? 20 : -4;
                                    }
                                    if (((rs.p_a.C_k)c_c2).bh > 0) {
                                        n6 -= 15;
                                        n10 -= 3;
                                    }
                                    this.J[((rs.p_a.C_k)c_c2).bg - 1].f(this.dN + n10, this.dO - 25 + 10 + n6);
                                }
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            try {
                                int n12;
                                int n13 = n12 = c_c.L > ff ? 4 : 0;
                                if (((rs.p_a.C_k)c_c2).bf < 2) {
                                    this.eK[((rs.p_a.C_k)c_c2).bf].f(this.dN - 12, this.dO - n7 - n12);
                                    n7 += 30 + n12;
                                } else if (((rs.p_a.C_k)c_c2).bf == 8) {
                                    this.I.f(this.dN - 11, this.dO + 15 - n7 - n12);
                                    n7 += 20 + n12;
                                } else if (((rs.p_a.C_k)c_c2).bf >= 9 && ((rs.p_a.C_k)c_c2).bf <= 18) {
                                    this.eL[((rs.p_a.C_k)c_c2).bf - 9].f(this.dN - 12, this.dO - n7 - n12);
                                    n7 += 30 + n12;
                                } else if (((rs.p_a.C_k)c_c2).bf >= 2 && ((rs.p_a.C_k)c_c2).bf != 255) {
                                    this.x.z[((rs.p_a.C_k)c_c2).bf - 1].f(this.dN - 11, this.dO + 20 - n7 - n12);
                                    n7 += 10 + n12;
                                }
                                if (((rs.p_a.C_k)c_c2).br[0] - 512 == 23481) {
                                    fE[rs.p_l.C_h.b(0)].f(this.dN - 7, this.dO - n7 - n12 + 10);
                                    n7 += 16 + n12;
                                }
                                if ((((rs.p_a.C_k)c_c2).br[0] - 512 == 22131 || ((rs.p_a.C_k)c_c2).br[0] - 512 == 22132 || ((rs.p_a.C_k)c_c2).br[0] - 512 == 23480 || ((rs.p_a.C_k)c_c2).br[0] - 512 == 23482 || ((rs.p_a.C_k)c_c2).br[0] - 512 == 23483) && rs.p_l.C_h.b(((rs.p_a.C_k)c_c2).aC) > 0) {
                                    fE[rs.p_l.C_h.b(((rs.p_a.C_k)c_c2).aC)].f(this.dN - 6, this.dO - n7 - n12 + 10);
                                    n7 += 16 + n12;
                                }
                                if (((rs.p_a.C_k)c_c2).br[0] - 512 == 22133) {
                                    fE[rs.p_l.C_h.b(31)].f(this.dN - 8, this.dO - n7 - n12 + 10);
                                    n7 += 16 + n12;
                                }
                                if (((rs.p_a.C_k)c_c2).br[0] - 512 == 22130) {
                                    fE[rs.p_l.C_h.b(19)].f(this.dN - 6, this.dO - n7 - n12 + 10);
                                    n7 += 16 + n12;
                                }
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            if (((rs.p_a.C_k)c_c2).bd < 21) {
                                this.mW[((rs.p_a.C_k)c_c2).bd].f(this.dN - 12, this.dO - n7);
                                n7 += 18;
                            }
                        }
                    }
                    if (n3 >= 0 && this.jZ == 10 && this.kV == this.kv[n3] && n2 == 0) {
                        this.a(c_c, c_c.r + 15);
                        if (this.dN > -1) {
                            this.mX[((rs.p_a.C_k)c_c2).be].f(this.dN - 12, this.dO - n7);
                        }
                    }
                    try {
                        if (((rs.p_a.C_k)c_c2).bh > 0 && ((rs.p_a.C_k)c_c2).bh != 255 && (((rs.p_a.C_k)c_c2).aC != 25 || rs.p_f.C_a.bp) && n2 == 0) {
                            this.a(c_c, c_c.r + 15);
                            n6 = ((rs.p_a.C_k)c_c2).bd >= 0 && ((rs.p_a.C_k)c_c2).bd != 255 || ((rs.p_a.C_k)c_c2).bf >= 0 && ((rs.p_a.C_k)c_c2).bf != 255 ? 15 : -8;
                            switch (((rs.p_a.C_k)c_c2).bh) {
                                case 1: {
                                    fE[73].f(this.dN + n6, this.dO - 10);
                                    break;
                                }
                                case 2: {
                                    fE[59].f(this.dN + n6, this.dO - 15);
                                    break;
                                }
                                case 3: {
                                    fE[73].f(this.dN + n6 + 4, this.dO - 10);
                                    fE[49].f(this.dN + n6 - 5 + 5, this.dO - 5);
                                    break;
                                }
                                case 4: {
                                    fE[59].f(this.dN + n6 + 4, this.dO - 15);
                                    fE[49].f(this.dN + n6 - 5 + 4, this.dO - 8);
                                    break;
                                }
                                case 5: {
                                    fE[273].f(this.dN + n6, this.dO - 15);
                                }
                            }
                        }
                    }
                    catch (Exception exception) {}
                } else if (n2 == 0) {
                    c_d = ((rs.p_a.C_j)c_c).aG;
                    if (C_j.d.size() > 0 && C_j.d.get((int)c_d.x) != null) {
                        n5 = C_j.d.get((int)c_d.x);
                        if (n5 >= 0 && n5 < this.mW.length) {
                            this.a(c_c, c_c.r + 15);
                            if (this.dN > -1) {
                                this.mW[n5].f(this.dN - 12, this.dO - 30);
                            }
                        }
                    } else if (c_d.u >= 0 && c_d.u < this.mW.length) {
                        this.a(c_c, c_c.r + 15);
                        if (this.dN > -1) {
                            this.mW[c_d.u].f(this.dN - 12, this.dO - 30);
                        }
                    }
                    if (this.jZ == 1 && this.of == this.cC[n3 - this.ku] && ff % 20 < 10) {
                        this.a(c_c, c_c.r + 15);
                        if (this.dN > -1) {
                            this.mX[0].f(this.dN - 12, this.dO - 28);
                        }
                    }
                }
                if (c_c.q != null && (n3 >= this.ku || this.gu == 0 || this.gu == 3 || this.gu == 1 && this.i(((rs.p_a.C_k)c_c).aZ))) {
                    this.a(c_c, c_c.r);
                    if (this.dN > -1 && n4 < this.lq) {
                        this.lu[n4] = gj.a(c_c.q) / 2;
                        this.lt[n4] = C_Client_mc.gj.r;
                        this.lr[n4] = this.dN;
                        this.ls[n4] = this.dO;
                        this.lv[n4] = c_c.v;
                        this.lw[n4] = c_c.K;
                        this.lx[n4] = c_c.O;
                        this.ly[n4++] = c_c.q;
                        if (this.or == 0 && c_c.K >= 1 && c_c.K <= 3) {
                            int n14 = n4;
                            this.lt[n14] = this.lt[n14] + 10;
                            int n15 = n4;
                            this.ls[n15] = this.ls[n15] + 5;
                        }
                        if (this.or == 0 && c_c.K == 4) {
                            this.lu[n4] = 60;
                        }
                        if (this.or == 0 && c_c.K == 5) {
                            int n16 = n4;
                            this.lt[n16] = this.lt[n16] + 5;
                        }
                    }
                }
                if (c_c.L > ff && n2 == 0) {
                    try {
                        this.a(c_c, c_c.r + 15);
                        boolean bl = true;
                        if (c_c instanceof rs.p_a.C_j && !((rs.p_a.C_j)c_c).aG.O) {
                            bl = false;
                        }
                        if (this.dN > -1 && bl) {
                            byte by;
                            byte by2 = by = c_c instanceof rs.p_a.C_j ? ((rs.p_a.C_j)c_c).aG.P : (byte)0;
                            if (rs.p_f.C_a.al && by == 0) {
                                C_F_uc c_F_uc = C_J_uc.d;
                                C_F_uc c_F_uc2 = C_J_uc.c;
                                if (c_c instanceof rs.p_a.C_j && c_c.N >= 1000) {
                                    c_F_uc = C_J_uc.f;
                                    c_F_uc2 = C_J_uc.e;
                                }
                                if ((n = c_c.N > 0 ? c_c.M * c_F_uc.n / c_c.N : c_F_uc.n) > c_F_uc.n) {
                                    n = c_F_uc.n;
                                }
                                if (n < 1 && c_c.M > 0) {
                                    n = 1;
                                }
                                c_F_uc.a(this.dN - c_F_uc.n / 2, this.dO - 5, c_F_uc.n, c_F_uc.o);
                                c_F_uc2.a(this.dN - c_F_uc.n / 2, this.dO - 5, n, c_F_uc2.o);
                            } else {
                                int n17 = 30;
                                if (c_c instanceof rs.p_a.C_j) {
                                    if (c_c.N >= 2500) {
                                        n17 *= 4;
                                    } else if (c_c.N >= 1000) {
                                        n17 *= 3;
                                    } else if (c_c.N >= 500) {
                                        n17 *= 2;
                                    }
                                }
                                int n18 = 65280;
                                n = 0xFF0000;
                                if (by == 1) {
                                    n18 = 65535;
                                    n = 255;
                                }
                                if (by == 2) {
                                    n18 = 0xFFFF00;
                                    n = 0x333300;
                                }
                                if (by == 255 && c_c instanceof rs.p_a.C_j) {
                                    n18 = ((rs.p_a.C_j)c_c).aG.Q;
                                    n = ((rs.p_a.C_j)c_c).aG.R;
                                }
                                int n19 = c_c.N > 0 ? Math.min(n17, c_c.M * n17 / c_c.N) : n17;
                                if (c_c.M > 0 && n19 <= 0) {
                                    n19 = 1;
                                }
                                rs.p_l.C_c.e(this.dN - n17 / 2, this.dO - 3, n19, 5, n18);
                                rs.p_l.C_c.e(this.dN - n17 / 2 + n19, this.dO - 3, n17 - n19, 5, n);
                            }
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                if (c_c instanceof rs.p_a.C_k && n2 == 0 && ((rs.p_a.C_k)c_c).az > System.currentTimeMillis()) {
                    this.a(c_c, c_c.r / 2);
                    if (((rs.p_a.C_k)c_c).aA == 1) {
                        this.kk[0].c(this.dN - 12, this.dO - 15);
                    } else {
                        this.kk[0].c(this.dN - 35, this.dO - 25);
                    }
                }
                if (n2 == 0) {
                    for (int i = 0; i < 4; ++i) {
                        n5 = 0;
                        if (!c_c.h.a(i)) continue;
                        ++n5;
                        if (!rs.p_f.C_a.ap) {
                            this.a(c_c, c_c.r / 2);
                            c_c.h.d()[i].a(this, c_c, i, this.dN, this.dO);
                            continue;
                        }
                        this.a(c_c, c_c.r / 2);
                        if (this.dN <= -1) continue;
                        this.a(c_c, (int)((double)c_c.r * 0.75));
                        rs.p_a.C_c c_c3 = c_c;
                        c_c.h.d()[i].b(this, c_c, i, this.dN, this.dO);
                    }
                }
                c_c.f();
            }
            for (n3 = 0; n3 < n4; ++n3) {
                int n20 = this.lr[n3];
                n2 = this.ls[n3];
                int n21 = this.lu[n3];
                int n22 = this.lt[n3];
                boolean bl = true;
                while (bl) {
                    bl = false;
                    for (int i = 0; i < n3; ++i) {
                        if (n2 + 2 <= this.ls[i] - this.lt[i] || n2 - n22 >= this.ls[i] + 2 || n20 - n21 >= this.lr[i] + this.lu[i] || n20 + n21 <= this.lr[i] - this.lu[i] || this.ls[i] - this.lt[i] >= n2) continue;
                        n2 = this.ls[i] - this.lt[i];
                        bl = true;
                    }
                }
                this.dN = this.lr[n3];
                this.dO = this.ls[n3] = n2;
                String string = this.ly[n3];
                if (this.or == 0) {
                    int n23;
                    int n24;
                    n = 0xFFFF00;
                    if (this.lv[n3] < 6) {
                        n = this.lk[this.lv[n3]];
                    }
                    if (this.lv[n3] == 6) {
                        int n25 = n = gg % 20 >= 10 ? 0xFFFF00 : 0xFF0000;
                    }
                    if (this.lv[n3] == 7) {
                        int n26 = n = gg % 20 >= 10 ? 65535 : 255;
                    }
                    if (this.lv[n3] == 8) {
                        int n27 = n = gg % 20 >= 10 ? 0x80FF80 : 45056;
                    }
                    if (this.lv[n3] == 9) {
                        n24 = 150 - this.lx[n3];
                        if (n24 < 50) {
                            n = 0xFF0000 + 1280 * n24;
                        } else if (n24 < 100) {
                            n = 0xFFFF00 - 327680 * (n24 - 50);
                        } else if (n24 < 150) {
                            n = 65280 + 5 * (n24 - 100);
                        }
                    }
                    if (this.lv[n3] == 10) {
                        n24 = 150 - this.lx[n3];
                        if (n24 < 50) {
                            n = 0xFF0000 + 5 * n24;
                        } else if (n24 < 100) {
                            n = 0xFF00FF - 327680 * (n24 - 50);
                        } else if (n24 < 150) {
                            n = 255 + 327680 * (n24 - 100) - 5 * (n24 - 100);
                        }
                    }
                    if (this.lv[n3] == 11) {
                        n24 = 150 - this.lx[n3];
                        if (n24 < 50) {
                            n = 0xFFFFFF - 327685 * n24;
                        } else if (n24 < 100) {
                            n = 65280 + 327685 * (n24 - 50);
                        } else if (n24 < 150) {
                            n = 0xFFFFFF - 327680 * (n24 - 100);
                        }
                    }
                    if (this.lw[n3] == 0) {
                        gj.a(0, string, this.dO + 1, this.dN);
                        gj.a(n, string, this.dO, this.dN);
                    }
                    if (this.lw[n3] == 1) {
                        gj.a(0, string, this.dN, gg, this.dO + 1);
                        gj.a(n, string, this.dN, gg, this.dO);
                    }
                    if (this.lw[n3] == 2) {
                        gj.b(this.dN, string, gg, this.dO + 1, 0);
                        gj.b(this.dN, string, gg, this.dO, n);
                    }
                    if (this.lw[n3] == 3) {
                        gj.a(150 - this.lx[n3], string, gg, this.dO + 1, this.dN, 0);
                        gj.a(150 - this.lx[n3], string, gg, this.dO, this.dN, n);
                    }
                    if (this.lw[n3] == 4) {
                        n24 = gj.a(string);
                        n23 = (150 - this.lx[n3]) * (n24 + 100) / 150;
                        rs.p_l.C_c.c(334, this.dN - 50, this.dN + 50, 0);
                        gj.b(0, string, this.dO + 1, this.dN + 50 - n23);
                        gj.b(n, string, this.dO, this.dN + 50 - n23);
                        rs.p_l.C_c.c();
                    }
                    if (this.lw[n3] != 5) continue;
                    n24 = 150 - this.lx[n3];
                    n23 = 0;
                    if (n24 < 25) {
                        n23 = n24 - 25;
                    } else if (n24 > 125) {
                        n23 = n24 - 125;
                    }
                    rs.p_l.C_c.c(this.dO + 5, 0, 512, this.dO - C_Client_mc.gj.r - 1);
                    gj.a(0, string, this.dO + 1 + n23, this.dN);
                    gj.a(n, string, this.dO + n23, this.dN);
                    rs.p_l.C_c.c();
                    continue;
                }
                gj.a(0, string, this.dO + 1, this.dN);
                gj.a(0xFFFF00, string, this.dO, this.dN);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void f(long l2) {
        try {
            if (l2 == 0L) {
                return;
            }
            for (int i = 0; i < this.kA; ++i) {
                if (this.lg[i] != l2) continue;
                --this.kA;
                fb = true;
                for (int j = i; j < this.kA; ++j) {
                    this.mT[j] = this.mT[j + 1];
                    this.jG[j] = this.jG[j + 1];
                    this.lg[j] = this.lg[j + 1];
                }
                fv.a(215);
                fv.a(l2);
                break;
            }
        }
        catch (RuntimeException runtimeException) {
            rs.p_v.C_a.e("18622, false, " + l2 + ", " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    private void bp() {
        int n;
        if (this.iE == null) {
            this.iE = new Long[341];
            for (n = 0; n < this.iE.length; ++n) {
                this.iE[n] = 0L;
            }
        }
        if (this.iD == null) {
            this.iD = new Long[341];
            for (n = 0; n < this.iD.length; ++n) {
                this.iD[n] = 0L;
            }
        }
    }

    public void a(int n, long l2) {
        int n2;
        if (this.iE == null) {
            return;
        }
        if (!rs.p_k.C_e.a() ? System.currentTimeMillis() - this.iE[n] <= l2 : rs.p_l.p_b.C_a.a() || System.currentTimeMillis() - this.iE[n] <= l2 / 2L) {
            return;
        }
        if (l2 > 50L) {
            l2 = 50L;
        }
        this.bp();
        this.iE[n] = System.currentTimeMillis();
        this.iD[n] = l2;
        rs.p_l.C_a c_a = C_E_uc.y[n];
        int n3 = c_a.j * c_a.k - 1;
        int n4 = c_a.j * this.dE * 2;
        byte[] byArray = c_a.i;
        byte[] byArray2 = this.kL;
        for (n2 = 0; n2 <= n3; ++n2) {
            byArray2[n2] = byArray[n2 - n4 & n3];
        }
        c_a.i = byArray2;
        this.kL = byArray;
        C_E_uc.c(n);
        if (++jY > 1235) {
            jY = 0;
            if (!rs.p_l.p_b.p_a.C_d.c) {
                fv.a(226);
                fv.b(0);
                n2 = C_Client_mc.fv.h;
                fv.d(58722);
                fv.b(240);
                fv.d((int)(Math.random() * 65536.0));
                fv.b((int)(Math.random() * 256.0));
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.d(51825);
                }
                fv.b((int)(Math.random() * 256.0));
                fv.d((int)(Math.random() * 65536.0));
                fv.d(7130);
                fv.d((int)(Math.random() * 65536.0));
                fv.d(61657);
                fv.j(C_Client_mc.fv.h - n2);
            }
        }
    }

    public void f(int n) {
        this.d(n, true);
    }

    private void d(int n, boolean bl) {
        byte[] byArray;
        int n2;
        this.bp();
        for (int n3 : bJ) {
            if (System.currentTimeMillis() - this.iE[n3] <= 100L || C_E_uc.z[n3] < n) continue;
            int n4 = 1;
            if (n3 != 57) {
                n4 = 2;
            }
            rs.p_l.C_a c_a = C_E_uc.y[n3];
            n2 = c_a.j * c_a.k - 1;
            int n5 = c_a.j * this.dE * n4;
            byArray = c_a.i;
            byte[] byArray2 = this.kL;
            for (int i = 0; i <= n2; ++i) {
                byArray2[i] = byArray[i - n5 & n2];
            }
            c_a.i = byArray2;
            this.kL = byArray;
            C_E_uc.c(n3);
        }
        for (int n3 : bK) {
            int n6;
            if (System.currentTimeMillis() - this.iE[n3] <= 100L || C_E_uc.z[n3] < n) continue;
            rs.p_l.C_a c_a = C_E_uc.y[n3];
            int n7 = c_a.j * c_a.k - 1;
            n2 = c_a.j * this.dE * 2;
            byte[] byArray3 = c_a.i;
            byArray = this.kL;
            for (n6 = 0; n6 <= n7; ++n6) {
                byArray[n6] = byArray3[n6 - n2 & n7];
            }
            c_a.i = byArray;
            this.kL = byArray3;
            C_E_uc.c(n3);
            if (++jY <= 1235) continue;
            jY = 0;
            if (rs.p_l.p_b.p_a.C_d.g()) continue;
            fv.a(226);
            fv.b(0);
            n6 = C_Client_mc.fv.h;
            fv.d(58722);
            fv.b(240);
            fv.d((int)(Math.random() * 65536.0));
            fv.b((int)(Math.random() * 256.0));
            if ((int)(Math.random() * 2.0) == 0) {
                fv.d(51825);
            }
            fv.b((int)(Math.random() * 256.0));
            fv.d((int)(Math.random() * 65536.0));
            fv.d(7130);
            fv.d((int)(Math.random() * 65536.0));
            fv.d(61657);
            fv.j(C_Client_mc.fv.h - n6);
        }
    }

    private void bq() {
        rs.p_a.C_c c_c;
        int n;
        int n2;
        if (rs.p_l.p_b.C_a.a()) {
            return;
        }
        rs.p_l.C_k.b.a();
        rs.p_l.C_k.c.a();
        rs.p_l.C_k.d.a();
        rs.p_l.C_k.e.a();
        if ((bN += bO) == 1) {
            bO = 1;
        } else if (bN == 149) {
            bO = -1;
        }
        if ((bP += bQ) == 1) {
            bQ = 1;
        } else if (bP == 149) {
            bQ = -1;
        }
        for (n2 = -1; n2 < this.ku; ++n2) {
            n = n2 == -1 ? 2047 : this.kv[n2];
            c_c = kw_do[n];
            if (c_c == null || c_c.O <= 0) continue;
            --c_c.O;
            if (c_c.O != 0) continue;
            c_c.q = null;
        }
        for (n2 = 0; n2 < this.cB; ++n2) {
            n = this.cC[n2];
            c_c = this.cA[n];
            if (c_c == null || ((rs.p_a.C_j)c_c).O <= 0) continue;
            --((rs.p_a.C_j)c_c).O;
            if (((rs.p_a.C_j)c_c).O != 0) continue;
            ((rs.p_a.C_j)c_c).q = null;
        }
    }

    public void p() {
        int n;
        int n2;
        int n3 = this.mZ * 128 + 64;
        int n4 = this.na * 128 + 64;
        int n5 = this.c(dw, n4, n3) - this.nb;
        if (cJ < n3 && (cJ += this.nc + (n3 - cJ) * this.nd / 1000) > n3) {
            cJ = n3;
        }
        if (cJ > n3 && (cJ -= this.nc + (cJ - n3) * this.nd / 1000) < n3) {
            cJ = n3;
        }
        if (cK < n5 && (cK += this.nc + (n5 - cK) * this.nd / 1000) > n5) {
            cK = n5;
        }
        if (cK > n5 && (cK -= this.nc + (cK - n5) * this.nd / 1000) < n5) {
            cK = n5;
        }
        if (cL < n4 && (cL += this.nc + (n4 - cL) * this.nd / 1000) > n4) {
            cL = n4;
        }
        if (cL > n4 && (cL -= this.nc + (cL - n4) * this.nd / 1000) < n4) {
            cL = n4;
        }
        n3 = this.lE * 128 + 64;
        n4 = this.lF * 128 + 64;
        n5 = this.c(dw, n4, n3) - this.lG;
        int n6 = n3 - cJ;
        int n7 = n5 - cK;
        int n8 = n4 - cL;
        int n9 = (int)Math.sqrt(n6 * n6 + n8 * n8);
        int n10 = (int)(Math.atan2(n7, n9) * 325.949) & 0x7FF;
        int n11 = (int)(Math.atan2(n6, n8) * -325.949) & 0x7FF;
        if (n10 < 128) {
            n10 = 128;
        }
        if (n10 > 383) {
            n10 = 383;
        }
        if (this.cR < n10) {
            this.cR += this.lH + (n10 - this.cR) * this.lI / 1000;
            if (this.cR > n10) {
                this.cR = n10;
            }
        }
        if (this.cR > n10) {
            this.cR -= this.lH + (this.cR - n10) * this.lI / 1000;
            if (this.cR < n10) {
                this.cR = n10;
            }
        }
        if ((n2 = n11 - this.cS) > 1024) {
            n2 -= 2048;
        }
        if (n2 < -1024) {
            n2 += 2048;
        }
        if (n2 > 0) {
            this.cS += this.lH + n2 * this.lI / 1000;
            this.cS &= 0x7FF;
        }
        if (n2 < 0) {
            this.cS -= this.lH + -n2 * this.lI / 1000;
            this.cS &= 0x7FF;
        }
        if ((n = n11 - this.cS) > 1024) {
            n -= 2048;
        }
        if (n < -1024) {
            n += 2048;
        }
        if (n < 0 && n2 > 0 || n > 0 && n2 < 0) {
            this.cS = n11;
        }
    }

    public void a(String string, int n) {
        this.fx[this.eV] = string;
        this.eI[this.eV] = n;
        ++this.eV;
    }

    public void b(int n, int n2) {
        int n3;
        int n4;
        int n5 = this.lc - (n - 4);
        int n6 = -n2 + 4 + this.ld;
        int n7 = this.dI;
        int n8 = this.dJ + 1;
        fM = true;
        eM = true;
        int n9 = 6116423;
        rs.p_l.C_c.a(n8, n6, n5, n9, n7);
        rs.p_l.C_c.a(16, n6 + 1, n5 + 1, 0, n7 - 2);
        rs.p_l.C_c.d(n5 + 1, n7 - 2, n8 - 19, 0, n6 + 18);
        gj.b(n9, "Choose Option", n6 + 14, n5 + 3);
        int n10 = rs.C_C_uc.hP - n;
        int n11 = -n2 + rs.C_C_uc.hQ;
        boolean bl = false;
        for (int i = 0; i < this.eV; ++i) {
            n4 = n6 + 31 + (this.eV - 1 - i) * 15;
            n3 = 0xFFFFFF;
            if (n10 > n5 && n10 < n5 + n7 && n11 > n4 - 13 && n11 < n4 + 3) {
                rs.p_l.C_c.a(15, n4 - 11, n5 + 3, 7301469, this.dI - 6);
                n3 = 0xFFFF00;
                this.r.c(i);
                bl = true;
            }
            this.gn.a(this.fx[i], n5 + 3, n4, n3, 0, false);
        }
        if (this.r.b()) {
            rs.p_j.p_b.C_a c_a = this.r.c();
            n4 = n5;
            n5 += n7;
            n6 = n6 + 5 + (this.eV - 1 - c_a.d()) * 15;
            n7 = c_a.g();
            n8 = c_a.h();
            if (n5 + n7 > ai) {
                n5 = n4 - n7;
            }
            c_a.b(n5);
            c_a.c(n6);
            rs.p_l.C_c.a(n8, n6, n5, n9, n7);
            rs.p_l.C_c.a(16, n6 + 1, n5 + 1, 0, n7 - 2);
            rs.p_l.C_c.d(n5 + 1, n7 - 2, n8 - 19, 0, n6 + 18);
            gj.b(n9, this.r.c().c(), n6 + 14, n5 + 3);
            c_a.d(-1);
            for (n3 = 0; n3 < c_a.e(); ++n3) {
                int n12 = n6 + 31 + (c_a.e() - 1 - n3) * 15;
                int n13 = 0xFFFFFF;
                if (!bl && n10 > n5 && n10 < n5 + n7 && n11 > n12 - 13 && n11 < n12 + 3) {
                    rs.p_l.C_c.a(15, n12 - 11, n5 + 3, 7301469, c_a.g() - 6);
                    n13 = 0xFFFF00;
                    c_a.d(n3);
                }
                this.gn.a(c_a.f()[n3].a(), n5 + 3, n12, n13, 0, false);
            }
        }
    }

    public void a(long l2) {
        try {
            int n;
            if (l2 == 0L) {
                return;
            }
            if (this.kA >= 350) {
                this.a("Your friendlist is full. Max of 350 users.", 0, "");
                return;
            }
            String string = C_O_uc.c(C_O_uc.a(l2));
            for (n = 0; n < this.kA; ++n) {
                if (this.lg[n] != l2) continue;
                this.a(string + " is already on your friend list", 0, "");
                return;
            }
            for (n = 0; n < this.jD; ++n) {
                if (this.kP[n] != l2) continue;
                this.a("Please remove " + string + " from your ignore list first", 0, "");
                return;
            }
            if (string.equals(C_Client_mc.eR.aZ)) {
                return;
            }
            this.mT[this.kA] = string;
            this.lg[this.kA] = l2;
            this.jG[this.kA] = 0;
            ++this.kA;
            fb = true;
            fv.a(188);
            fv.a(l2);
            return;
        }
        catch (RuntimeException runtimeException) {
            rs.p_v.C_a.e("15283, 68, " + l2 + ", " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    public int c(int n, int n2, int n3) {
        int n4 = n3 >> 7;
        int n5 = n2 >> 7;
        if (n4 < 0 || n5 < 0 || n4 > 103 || n5 > 103) {
            return 0;
        }
        int n6 = n;
        if (n6 < 3 && (this.gc[1][n4][n5] & 2) == 2) {
            ++n6;
        }
        int n7 = n3 & 0x7F;
        int n8 = n2 & 0x7F;
        int n9 = this.fC[n6][n4][n5] * (128 - n7) + this.fC[n6][n4 + 1][n5] * n7 >> 7;
        int n10 = this.fC[n6][n4][n5 + 1] * (128 - n7) + this.fC[n6][n4 + 1][n5 + 1] * n7 >> 7;
        return n9 * (128 - n8) + n10 * n8 >> 7;
    }

    public static String g(int n) {
        if (n < 100000) {
            return String.valueOf(n);
        }
        if (n < 10000000) {
            return n / 1000 + "K";
        }
        return n / 1000000 + "M";
    }

    public static String b(long l2) {
        long l3 = l2 / 1000L;
        long l4 = l2 / 1000000L;
        long l5 = l2 / 1000000000L;
        long l6 = l2 / 1000000000000L;
        String string = "" + l2;
        if (l2 > 999L && l2 <= 999999L) {
            string = Long.toString(l3) + "K";
        } else if (l2 > 999999L && l2 <= 999999999L) {
            string = Long.toString(l4) + "M";
        } else if (l2 > 999999999L && l2 <= 999999999999L) {
            string = Long.toString(l5) + "B";
        } else if (l2 > 999999999999L) {
            string = Long.toString(l6) + "T";
        }
        return string;
    }

    private void br() {
        this.bg();
        this.v();
        SwingUtilities.invokeLater(() -> C_Launcher_mc.n().q().b());
        if (rs.p_k.C_e.a()) {
            rs.p_k.C_b.d();
            this.a.d();
            this.a(C_a.c.a);
        }
        rs.p_l.p_f.p_a.p_i.C_b.m();
        C_GameStateChanged_mc c_GameStateChanged_mc = new C_GameStateChanged_mc();
        c_GameStateChanged_mc.setGameState(rs.p_runelite.p_a.C_c.c);
        this.p.post(c_GameStateChanged_mc);
        rs.p_d.C_e.a();
        try {
            if (this.nD != null) {
                this.nD.a();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        int n = C_ae.e;
        for (int i = 0; i < C_ae.c.size(); ++i) {
            int n2 = n++;
            if (i == 0) {
                rs.p_n.C_e.H[n2].E = new C_F_uc("vote/sprite 2");
                rs.p_n.C_e.H[n2].aG = new C_F_uc("vote/sprite 2");
                continue;
            }
            rs.p_n.C_e.H[n2].E = new C_F_uc("vote/sprite 1");
            rs.p_n.C_e.H[n2].aG = new C_F_uc("vote/sprite 2");
        }
        for (rs.p_l.p_e.C_f c_f : rs.p_l.p_e.C_f.k) {
            c_f.c();
        }
        for (rs.p_l.p_e.C_f c_f : rs.p_l.p_e.C_f.l) {
            c_f.c();
        }
        C_e.d().a();
        rs.p_f.C_a.O = false;
        rs.p_d.C_s.a.clear();
        rs.p_n.p_c.C_b.d.clear();
        this.fm = "";
        this.G.j = false;
        ii = 0L;
        bh = 0L;
        this.s = 0;
        this.iJ = -1;
        this.aE = false;
        this.aJ = false;
        this.eP = false;
        this.ae = false;
        this.jl = -1;
        this.eN = 0L;
        this.eO = 0;
        this.cp = false;
        this.iK = false;
        this.aD = false;
        this.cc = false;
        this.cd = false;
        this.v.i = false;
        this.v.c();
        this.jn = false;
        for (rs.p_n.C_c c_c : rs.p_n.C_d.a) {
            c_c.b();
        }
        this.u.clear();
        this.kw_if.clear();
        this.jD = 0;
        this.cY = 0;
        this.nD = null;
        rs.p_l.p_d.C_c.b = true;
        this.G.a("@yel@Safety reminder to new players:@whi@ Please do NOT", "use passwords that you've used on other servers.");
        this.fc = false;
        this.cz = 2;
        this.v.b[2] = new C_F_uc("orbs/hp_fill");
        this.m();
        this.dF.b();
        for (int i = 0; i < 4; ++i) {
            this.fP[i].a();
        }
        System.gc();
        this.e();
        this.lh = -1;
        this.oi = -1;
        this.oz = 0;
        this.K = false;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0L;
        this.a(C_a.c.a);
    }

    private void bs() {
        this.md = true;
        block0: for (int i = 0; i < 7; ++i) {
            this.mu[i] = -1;
            for (int j = 0; j < rs.p_d.C_j.a; ++j) {
                if (rs.p_d.C_j.b[j].e || rs.p_d.C_j.b[j].c != i + (this.ml ? 0 : 7)) continue;
                this.mu[i] = j;
                continue block0;
            }
        }
    }

    private void a(int n, rs.p_x.C_e c_e) {
        int n2;
        while (c_e.i + 21 < n * 8 && (n2 = c_e.k(14)) != 16383) {
            boolean bl;
            int n3;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            int n4;
            int n5 = -1;
            if (this.cA[n2] == null) {
                this.cA[n2] = new rs.p_a.C_j();
            } else if (this.cA[n2].aG != null) {
                n5 = (int)this.cA[n2].aG.x;
            }
            rs.p_a.C_j c_j = this.cA[n2];
            this.cC[this.cB++] = n2;
            c_j.P = ff;
            int n6 = c_e.k(5);
            if (n6 > 15) {
                n6 -= 32;
            }
            if ((n4 = c_e.k(5)) > 15) {
                n4 -= 32;
            }
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            boolean bl5 = bl4 = c_e.k(1) == 1;
            if (bl4) {
                n8 = n7 = c_e.k(8);
            }
            c_j.aw = n7;
            c_j.ax = n8;
            c_j.ay = n9;
            boolean bl6 = bl3 = c_e.k(1) == 1;
            if (bl3) {
                c_j.ar = (byte)c_e.k(8);
                c_j.ao = (byte)c_e.k(8);
                c_j.ap = (byte)c_e.k(8);
                c_j.aq = (byte)c_e.k(8);
            }
            boolean bl7 = bl2 = c_e.k(1) == 1;
            if (bl2) {
                n3 = c_e.k(8);
                c_j.s = 1024 + n3 * 256;
            } else {
                c_j.Q = 0;
                c_j.R = 0;
            }
            n3 = 1;
            c_j.aH = c_e.k(1) == 1;
            c_j.aG = rs.p_d.C_d.c(c_e.k(14));
            if ((long)n5 != c_j.aG.x) {
                c_j.h.b();
                c_j.L = 0;
            }
            boolean bl8 = bl = c_e.k(1) == 1;
            if (bl) {
                this.kx[this.kw++] = n2;
            }
            c_j.S = c_j.aG.r;
            c_j.o = c_j.aG.y;
            c_j.ag = c_j.aG.q;
            c_j.ah = c_j.aG.l;
            c_j.ai = c_j.aG.B;
            c_j.aj = c_j.aG.j;
            c_j.t = c_j.aG.w;
            c_j.a(C_Client_mc.eR.k[0] + n4, C_Client_mc.eR.l[0] + n6, n3 == 1);
            C_NpcSpawned_mc c_NpcSpawned_mc = new C_NpcSpawned_mc();
            c_NpcSpawned_mc.setNpc(c_j);
            this.p.post(c_NpcSpawned_mc);
        }
        c_e.K();
    }

    public static String c(long l2) {
        long l3 = l2 / 1000L;
        long l4 = l3 / 3600L;
        long l5 = l3 / 60L % 60L;
        long l6 = l3 % 60L;
        String string = l6 >= 10L ? "" + l6 : "0" + l6;
        String string2 = l5 >= 10L ? "" + l5 : "0" + l5;
        return l4 + ":" + string2 + ":" + string + " ";
    }

    public static String d(long l2) {
        long l3 = l2 / 1000L;
        long l4 = l3 / 60L % 60L;
        long l5 = l3 % 60L;
        String string = l5 >= 10L ? "" + l5 : "0" + l5;
        return l4 + ":" + string + " ";
    }

    @Override
    public void q() {
        int n;
        if (!bR) {
            bR = true;
        }
        if (!this.cg || this.ov || this.kQ || this.nI) {
            return;
        }
        if (++ff >= 0x7FFFFFFE) {
            ff = 0;
        }
        if (this.jv < 65) {
            ++this.jv;
        }
        if (ff % 7 == 0) {
            for (n = 0; n < rs.p_l.C_j.c.length; ++n) {
                int n2 = rs.p_l.C_j.c[n];
                ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(n2)).a();
            }
        }
        if (ff % 15 == 0 && this.bT > 0L) {
            rs.p_n.C_e.H[62151].at = "<img=37> @yel@" + C_Client_mc.c(this.bT - System.currentTimeMillis());
        }
        if (ff % 30 == 0) {
            rs.p_n.C_e.H[62152].az[0] = this.bV[this.bU] + 1;
            rs.p_n.C_e.H[62152].ax[0] = 1;
            ++this.bU;
            if (this.bU >= this.bV.length) {
                this.bU = 0;
            }
        }
        if (!this.fc) {
            if (!rs.p_l.p_b.p_a.C_d.g()) {
                this.bO();
            } else {
                rs.p_l.p_b.p_a.C_d.b.e();
            }
        } else {
            this.bz();
            if (this.iw.b() || this.ix.a() || C_s.d()) {
                fM = true;
            }
            this.h();
            for (n = 0; n < this.am.size(); ++n) {
                fv.a(103);
                fv.b(this.am.get(n).length() - 1);
                fv.a(this.am.get(n).substring(2));
            }
            this.am.clear();
            n = 0;
            if (this.an != null) {
                fv.a(103);
                fv.b(this.an.length() - 1);
                fv.a(this.an.substring(2));
                this.an = null;
            }
            if (ap != null) {
                if (ap.startsWith("::item_loadout")) {
                    n = 1;
                    String string = ap.replace("::item_loadout ", "");
                    ArrayList<String> arrayList = new ArrayList<String>();
                    for (int i = 0; i < string.split(" ").length; ++i) {
                        String string2 = string.split(" ")[i];
                        arrayList.add(string2);
                        if (arrayList.size() < 3 && i != string.split(" ").length - 1) continue;
                        Object object = "::item_loadout ";
                        for (String string3 : arrayList) {
                            object = (String)object + string3 + " ";
                        }
                        fv.a(103);
                        fv.b(((String)object).length() - 1);
                        fv.a(((String)object).substring(2));
                        arrayList.clear();
                    }
                } else {
                    fv.a(103);
                    fv.b(ap.length() - 1);
                    fv.a(ap.substring(2));
                }
                ap = null;
            }
            if (ao != null) {
                if (ao.startsWith("::equip_loadout")) {
                    n = 1;
                }
                fv.a(103);
                fv.b(ao.length() - 1);
                fv.a(ao.substring(2));
                ao = null;
            }
            if (aq != null) {
                fv.a(103);
                fv.b(aq.length() - 1);
                fv.a(aq.substring(2));
                aq = null;
            }
            if (this.ar != null) {
                fv.a(103);
                fv.b(this.ar.length() - 1);
                fv.a(this.ar.substring(2));
                this.ar = null;
            }
            if (this.at != null) {
                fv.a(103);
                fv.b(this.at.length() - 1);
                fv.a(this.at.substring(2));
                this.at = null;
            }
            if (this.as != null) {
                fv.a(103);
                fv.b(this.as.length() - 1);
                fv.a(this.as.substring(2));
                this.as = null;
            }
            rs.p_n.C_a.a();
            if (n != 0) {
                String string = "::spawn_loadout";
                fv.a(103);
                fv.b(string.length() - 1);
                fv.a(string.substring(2));
            }
            this.cv.a();
        }
        if (rs.p_h.C_f.a(this) || rs.p_h.C_f.b(this)) {
            this.a(1, "Loading - please wait.", null);
            try {
                Thread.sleep(250L);
            }
            catch (InterruptedException interruptedException) {
                throw new RuntimeException(interruptedException);
            }
            return;
        }
        this.s();
        rs.p_h.C_a.a();
        if (this.fc) {
            rs.p_h.C_c.a();
        }
    }

    public void e(boolean bl) {
        rs.p_a.C_k c_k;
        rs.p_a.C_k c_k2;
        if (C_Client_mc.eR.ac >> 7 == this.gd && C_Client_mc.eR.ad >> 7 == this.ge) {
            this.gd = 0;
        }
        int n = this.ku;
        if (bl) {
            n = 1;
        }
        rs.p_a.C_k c_k3 = null;
        if (!bl && C_Client_mc.eR.m >= 32768) {
            int n2 = C_Client_mc.eR.m - 32768;
            if (n2 == di) {
                n2 = 2047;
            }
            this.iJ = n2;
            c_k2 = kw_do[n2];
            if (c_k2 != null && !c_k2.aZ.equalsIgnoreCase(C_Client_mc.eR.aZ)) {
                c_k3 = c_k2;
            }
        } else if (this.iJ >= 0 && this.iJ <= kw_do.length - 1 && (c_k = kw_do[this.iJ]) != null && !c_k.aZ.equalsIgnoreCase(C_Client_mc.eR.aZ)) {
            c_k3 = c_k;
        }
        for (int i = 0; i < n; ++i) {
            int n3;
            int n4;
            int n5;
            int n6;
            if (bl && rs.p_f.C_a.N) {
                c_k2 = eR;
                n6 = 33538048;
            } else {
                c_k2 = kw_do[this.kv[i]];
                n6 = this.kv[i] << 14;
            }
            if (c_k2 == null || !c_k2.l()) continue;
            c_k2.aU = false;
            int n7 = c_k2.ac >> 7;
            int n8 = c_k2.ad >> 7;
            if (n7 < 0 || n7 >= 104 || n8 < 0 || n8 >= 104 || (bl ? rs.p_f.C_a.bq : (n5 = ((n4 = eh + (c_k2.ac - 6 >> 7)) >> 6) * 256 + ((n3 = ei + (c_k2.ad - 6 >> 7)) >> 6)) == 10806 && this.kw_if.get(n4 + "," + n3) != null)) continue;
            if (c_k3 != null && c_k3.ac == c_k2.ac && c_k3.ad == c_k2.ad && !c_k3.aZ.equals(c_k2.aZ) && !c_k2.aZ.equalsIgnoreCase(C_Client_mc.eR.aZ)) continue;
            if (ed != 197 && rs.p_f.C_a.aY && !rs.p_k.C_e.a()) {
                boolean bl2 = c_k2.aU = this.ku >= 35 && !bl && c_k2.w == c_k2.t && c_k2.F <= 0;
            }
            if (c_k2.bq != null && ff >= c_k2.bj && ff < c_k2.bk) {
                c_k2.aU = false;
                c_k2.bl = this.c(dw, c_k2.ad, c_k2.ac);
                this.dF.a(dw, c_k2.ad, c_k2, c_k2.ae, c_k2.bw, c_k2.ac, c_k2.bl, c_k2.bt, c_k2.bv, n6, c_k2.bu);
                continue;
            }
            if ((c_k2.ac & 0x7F) == 64 && (c_k2.ad & 0x7F) == 64) {
                if (this.kS[n7][n8] == gf) continue;
                this.kS[n7][n8] = gf;
            }
            c_k2.bl = this.c(dw, c_k2.ad, c_k2.ac);
            this.dF.a(dw, c_k2.ae, c_k2.bl, n6, c_k2.ad, 60, c_k2.ac, c_k2, c_k2.T);
        }
    }

    private boolean c(rs.p_n.C_e c_e) {
        int n;
        int n2;
        int n3;
        int n4 = c_e.J;
        if (this.kB == 2) {
            if (n4 == 201) {
                fM = true;
                this.fN = 0;
                this.gb = true;
                this.fB = "";
                this.ev = 1;
                this.eQ = "Enter name of friend to add to list";
            }
            if (n4 == 202) {
                fM = true;
                this.fN = 0;
                this.gb = true;
                this.fB = "";
                this.ev = 2;
                this.eQ = "Enter name of friend to delete from list";
            }
        }
        if (n4 == 205) {
            this.lR = 250;
            return true;
        }
        if (n4 == 501) {
            fM = true;
            this.fN = 0;
            this.gb = true;
            this.fB = "";
            this.ev = 4;
            this.eQ = "Enter name of player to add to list";
        }
        if (n4 == 502) {
            fM = true;
            this.fN = 0;
            this.gb = true;
            this.fB = "";
            this.ev = 5;
            this.eQ = "Enter name of player to delete from list";
        }
        if (n4 >= 300 && n4 <= 313) {
            n3 = (n4 - 300) / 2;
            n2 = n4 & 1;
            n = this.mu[n3];
            if (n != -1) {
                do {
                    if (n2 == 0 && --n < 0) {
                        n = rs.p_d.C_j.a - 1;
                    }
                    if (n2 != 1 || ++n < rs.p_d.C_j.a) continue;
                    n = 0;
                } while (rs.p_d.C_j.b[n].e || rs.p_d.C_j.b[n].c != n3 + (this.ml ? 0 : 7));
                this.mu[n3] = n;
                this.md = true;
            }
        }
        if (n4 >= 314 && n4 <= 323) {
            n3 = (n4 - 314) / 2;
            n2 = n4 & 1;
            n = this.lB[n3];
            if (n2 == 0 && --n < 0) {
                n = dU[n3].length - 1;
            }
            if (n2 == 1 && ++n >= dU[n3].length) {
                n = 0;
            }
            this.lB[n3] = n;
            this.md = true;
        }
        if (n4 == 324 && !this.ml) {
            this.ml = true;
            this.bs();
        }
        if (n4 == 325 && this.ml) {
            this.ml = false;
            this.bs();
        }
        if (n4 == 326) {
            fv.a(101);
            fv.b(this.ml ? 0 : 1);
            for (n3 = 0; n3 < 7; ++n3) {
                fv.b(this.mu[n3]);
            }
            for (n3 = 0; n3 < 5; ++n3) {
                fv.b(this.lB[n3]);
            }
            return true;
        }
        if (n4 == 613) {
            boolean bl = this.nz = !this.nz;
        }
        if (n4 >= 601 && n4 <= 612) {
            this.bQ();
            if (this.kr.length() > 0) {
                fv.a(218);
                fv.a(C_O_uc.a(this.kr));
                fv.b(n4 - 601);
                fv.b(this.nz ? 1 : 0);
            }
        }
        return false;
    }

    private void a(rs.p_x.C_e c_e) {
        long l2 = System.currentTimeMillis();
        for (int i = 0; i < this.kw; ++i) {
            int n = this.kx[i];
            rs.p_a.C_k c_k = kw_do[n];
            int n2 = c_e.y();
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t->[" + n + "] STARTING mask=" + n2);
            }
            if ((n2 & 0x40) != 0) {
                n2 += c_e.y() << 8;
                if (rs.p_f.C_a.d.booleanValue()) {
                    cx.add("\t->shiftingMask=" + n2);
                }
            }
            this.a(n2, n, c_e, c_k);
        }
    }

    private void d(int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        Object object;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14 = this.dF.a(n5, n3, n);
        if (((long)n14 ^ 0xFFFFFFFFFFFFFFFFL) != -1L || n14 != 0) {
            n13 = this.dF.b(n5, n3, n, n14);
            n12 = n13 >> 6 & 3;
            n11 = n13 & 0x1F;
            n10 = n2;
            if (n14 > 0) {
                n10 = n4;
            }
            object = this.aT.m;
            n9 = 24624 + n3 * 4 + (103 - n) * 512 * 4;
            n8 = this.dF.b(n5, n3, n);
            C_r c_r = C_r.c(n8);
            if (c_r.ac != -1) {
                rs.p_l.C_a c_a;
                rs.p_l.C_a c_a2 = c_a = c_r.ac >= 0 && c_r.ac < this.mq.length ? this.mq[c_r.ac] : null;
                if (c_a != null) {
                    int n15 = (c_r.U * 4 - c_a.j) / 2;
                    int n16 = (c_r.af * 4 - c_a.k) / 2;
                    c_a.a(48 + n3 * 4 + n15, 48 + (104 - n - c_r.af) * 4 + n16);
                }
            } else if (~c_r.ac == 0) {
                if (n11 == 0 || n11 == 2) {
                    if (n12 == 0) {
                        object[n9] = n10;
                        object[n9 + 512] = n10;
                        object[n9 + 1024] = n10;
                        object[n9 + 1536] = n10;
                    } else if (~n12 == -2 || n12 == 1) {
                        object[n9] = n10;
                        object[n9 + 1] = n10;
                        object[n9 + 2] = n10;
                        object[n9 + 3] = n10;
                    } else if (n12 == 2) {
                        object[n9 + 3] = n10;
                        object[n9 + 3 + 512] = n10;
                        object[n9 + 3 + 1024] = n10;
                        object[n9 + 3 + 1536] = n10;
                    } else if (n12 == 3) {
                        object[n9 + 1536] = n10;
                        object[n9 + 1536 + 1] = n10;
                        object[n9 + 1536 + 2] = n10;
                        object[n9 + 1536 + 3] = n10;
                    }
                }
                if (n11 == 3) {
                    if (n12 == 0) {
                        object[n9] = n10;
                    } else if (n12 == 1) {
                        object[n9 + 3] = n10;
                    } else if (n12 == 2) {
                        object[n9 + 3 + 1536] = n10;
                    } else if (n12 == 3) {
                        object[n9 + 1536] = n10;
                    }
                }
                if (n11 == 2) {
                    if (n12 == 3) {
                        object[n9] = n10;
                        object[n9 + 512] = n10;
                        object[n9 + 1024] = n10;
                        object[n9 + 1536] = n10;
                    } else if (n12 == 0) {
                        object[n9] = n10;
                        object[n9 + 1] = n10;
                        object[n9 + 2] = n10;
                        object[n9 + 3] = n10;
                    } else if (n12 == 1) {
                        object[n9 + 3] = n10;
                        object[n9 + 3 + 512] = n10;
                        object[n9 + 3 + 1024] = n10;
                        object[n9 + 3 + 1536] = n10;
                    } else if (n12 == 2) {
                        object[n9 + 1536] = n10;
                        object[n9 + 1536 + 1] = n10;
                        object[n9 + 1536 + 2] = n10;
                        object[n9 + 1536 + 3] = n10;
                    }
                }
            }
        }
        if ((n14 = this.dF.e(n5, n3, n)) != 0) {
            n13 = this.dF.b(n5, n3, n, n14);
            n12 = n13 >> 6 & 3;
            n11 = n13 & 0x1F;
            n10 = this.dF.f(n5, n3, n);
            object = C_r.c(n10);
            if (object.ac != -1) {
                rs.p_l.C_a c_a;
                rs.p_l.C_a c_a3 = c_a = object.ac >= 0 && object.ac < this.mq.length ? this.mq[object.ac] : null;
                if (c_a != null) {
                    n8 = (object.U * 4 - c_a.j) / 2;
                    int n17 = (object.af * 4 - c_a.k) / 2;
                    c_a.a(48 + n3 * 4 + n8, 48 + (104 - n - object.af) * 4 + n17);
                }
            } else if (n11 == 9) {
                n9 = 0xEEEEEE;
                if (n14 > 0) {
                    n9 = 0xEE0000;
                }
                int[] nArray = this.aT.m;
                int n18 = 24624 + n3 * 4 + (103 - n) * 512 * 4;
                if (n12 == 0 || n12 == 2) {
                    nArray[n18 + 1536] = n9;
                    nArray[n18 + 1024 + 1] = n9;
                    nArray[n18 + 512 + 2] = n9;
                    nArray[n18 + 3] = n9;
                } else {
                    nArray[n18] = n9;
                    nArray[n18 + 512 + 1] = n9;
                    nArray[n18 + 1024 + 2] = n9;
                    nArray[n18 + 1536 + 3] = n9;
                }
            }
        }
        if ((n14 = this.dF.h(n5, n3, n)) > 0 || n14 != 0) {
            C_r c_r = C_r.c(n14);
            if (c_r.ac != -1) {
                rs.p_l.C_a c_a;
                rs.p_l.C_a c_a4 = c_a = c_r.ac >= 0 && c_r.ac < this.mq.length ? this.mq[c_r.ac] : null;
                if (c_a != null) {
                    n11 = (c_r.U * 4 - c_a.j) / 2;
                    n10 = (c_r.af * 4 - c_a.k) / 2;
                    c_a.a(48 + n3 * 4 + n11, 48 + (104 - n - c_r.af) * 4 + n10);
                }
            }
        }
        if (rs.p_f.C_a.aX && this.x.N() && ed == 197 && this.k(n7 = n3 + eh, n6 = n + ei)) {
            n11 = 24624 + n3 * 4 + (103 - n) * 512 * 4;
            if (n11 < 0 || n11 + 3 >= this.aT.m.length) {
                return;
            }
            n10 = this.aT.m[n11];
            int n19 = 0xFF0000;
            n9 = 100;
            int n20 = 256 - n9;
            this.aT.m[n11] = n10 = ((n19 & 0xFF00FF) * n9 + (n10 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n19 & 0xFF00) * n9 + (n10 & 0xFF00) * n20 & 0xFF0000) >> 8;
            this.aT.m[n11 + 1] = n10;
            this.aT.m[n11 + 2] = n10;
            this.aT.m[n11 + 3] = n10;
        }
    }

    private void bt() {
        int n;
        this.ll = new rs.p_l.C_a(this.mo, "titlebox", 0);
        this.lm = new rs.p_l.C_a(this.mo, "titlebutton", 0);
        this.nw = new rs.p_l.C_a[12];
        int n2 = 0;
        try {
            n2 = Integer.parseInt(this.getParameter("fl_icon"));
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (n2 == 0) {
            for (n = 0; n < 12; ++n) {
                this.nw[n] = new rs.p_l.C_a(this.mo, "runes", n);
            }
        } else {
            for (n = 0; n < 12; ++n) {
                this.nw[n] = new rs.p_l.C_a(this.mo, "runes", 12 + (n & 3));
            }
        }
        this.nV = new C_F_uc(128, 265);
        this.nW = new C_F_uc(128, 265);
        this.jV = new int[256];
        for (n = 0; n < 64; ++n) {
            this.jV[n] = n * 262144;
        }
        for (n = 0; n < 64; ++n) {
            this.jV[n + 64] = 0xFF0000 + 1024 * n;
        }
        for (n = 0; n < 64; ++n) {
            this.jV[n + 128] = 0xFFFF00 + 4 * n;
        }
        for (n = 0; n < 64; ++n) {
            this.jV[n + 192] = 0xFFFFFF;
        }
        this.jW = new int[256];
        for (n = 0; n < 64; ++n) {
            this.jW[n] = n * 1024;
        }
        for (n = 0; n < 64; ++n) {
            this.jW[n + 64] = 65280 + 4 * n;
        }
        for (n = 0; n < 64; ++n) {
            this.jW[n + 128] = 65535 + 262144 * n;
        }
        for (n = 0; n < 64; ++n) {
            this.jW[n + 192] = 0xFFFFFF;
        }
        this.jX = new int[256];
        for (n = 0; n < 64; ++n) {
            this.jX[n] = n * 4;
        }
        for (n = 0; n < 64; ++n) {
            this.jX[n + 64] = 255 + 262144 * n;
        }
        for (n = 0; n < 64; ++n) {
            this.jX[n + 128] = 0xFF00FF + 1024 * n;
        }
        for (n = 0; n < 64; ++n) {
            this.jX[n + 192] = 0xFFFFFF;
        }
        this.jU = new int[256];
        this.nP = new int[32768];
        this.nQ = new int[32768];
        this.a((rs.p_l.C_a)null);
        this.jI = new int[32768];
        this.jJ = new int[32768];
        this.a(10, "Connecting to fileserver");
        if (!this.jK) {
            this.kq = true;
            this.jK = true;
            this.a(this, 2);
        }
    }

    private static void bu() {
        C_V_uc.h = false;
        C_E_uc.n = false;
        li = false;
        C_x.h = false;
        C_r.Z = false;
    }

    public static void main(String[] stringArray) {
        try {
            dK = 10;
            dL = 0;
            C_Client_mc.aa();
            dM = true;
            bW = 32;
            C_Client_mc c_Client_mc = new C_Client_mc();
            c_Client_mc.l(503, 765);
            c_Client_mc.a(C_a.c.b);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(int n, String string, String string2) {
        int n2 = this.gi.a(n == 1 ? string : string2);
        int n3 = string2 == null ? 25 : 38;
        int n4 = !C_Client_mc.ai() ? 4 : 0;
        int n5 = !C_Client_mc.ai() ? 4 : 0;
        int n6 = 1 + n4;
        int n7 = 1 + n5;
        rs.p_l.C_c.a(n3, n7, n6, 0, n2 + 6);
        rs.p_l.C_c.a(1, n7, n6, 0xFFFFFF, n2 + 6);
        rs.p_l.C_c.a(n3, n7, n6, 0xFFFFFF, 1);
        rs.p_l.C_c.a(1, n3 + n5, n6, 0xFFFFFF, n2 + 6);
        rs.p_l.C_c.a(n3, n7, n2 + 6 + n4, 0xFFFFFF, 1);
        this.gi.a(0xFFFFFF, string, 18 + n5, n2 / 2 + 5 + n4);
        if (string2 != null) {
            this.gi.a(0xFFFFFF, string2, 31 + n5, n2 / 2 + 5 + n4);
        }
    }

    private void bv() {
        int n;
        if (this.iK) {
            this.a(1, "Loading - please wait.", null);
            ee = 1;
            this.jE = System.currentTimeMillis();
            return;
        }
        if (li && ee == 2 && C_x.f != dw) {
            this.a(1, "Loading - please wait.", null);
            ee = 1;
            this.jE = System.currentTimeMillis();
        }
        if (ee == 1 && (n = this.bw()) != 0 && System.currentTimeMillis() - this.jE > 360000L) {
            rs.p_v.C_a.e(this.fk + " glcfb " + this.od + "," + n + "," + li + "," + ew.g() + "," + dw + "," + this.mx + "," + this.my);
            this.jE = System.currentTimeMillis();
        }
        if (ee == 2 && dw != this.dR) {
            this.dR = dw;
            this.z(dw);
            if (rs.p_f.C_a.Q && !rs.p_k.C_e.a()) {
                try {
                    rs.p_k.C_b.b();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    System.exit(0);
                }
            }
        }
    }

    private int bw() {
        int n;
        for (n = 0; n < this.fr.length; ++n) {
            if (this.fr[n] == null && this.fS[n] != -1) {
                return -1;
            }
            if (this.fY[n] != null || this.fT[n] == -1) continue;
            return -2;
        }
        n = 1;
        for (int i = 0; i < this.fr.length; ++i) {
            byte[] byArray = this.fY[i];
            if (byArray == null) continue;
            int n2 = (this.fR[i] >> 8) * 64 - eh;
            int n3 = (this.fR[i] & 0xFF) * 64 - ei;
            if (this.nA) {
                n2 = 10;
                n3 = 10;
            }
            try {
                n &= C_x.a(n2, byArray, n3);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (n == 0) {
            return -3;
        }
        if (this.mS) {
            return -4;
        }
        ee = 2;
        C_x.f = dw;
        this.l();
        fv.a(121);
        return 0;
    }

    public void r() {
        rs.p_a.C_l c_l = (rs.p_a.C_l)this.ea.b();
        while (c_l != null) {
            if (c_l.p != dw || ff > c_l.i) {
                c_l.b();
            } else if (ff >= c_l.h) {
                int n;
                rs.p_a.C_k c_k;
                rs.p_a.C_j c_j;
                if (c_l.n > 0 && (c_j = this.cA[c_l.n - 1]) != null && c_j.ac >= 0 && c_j.ac < 13312 && c_j.ad >= 0 && c_j.ad < 13312) {
                    c_l.a(ff, c_j.ad, this.c(c_l.p, c_j.ad, c_j.ac) - c_l.j, c_j.ac);
                }
                if (c_l.n < 0 && (c_k = (n = -c_l.n - 1) == di ? eR : kw_do[n]) != null && c_k.ac >= 0 && c_k.ac < 13312 && c_k.ad >= 0 && c_k.ad < 13312) {
                    c_l.a(ff, c_k.ad, this.c(c_l.p, c_k.ad, c_k.ac) - c_l.j, c_k.ac);
                }
                c_l.a(this.dE);
                this.dF.a(dw, c_l.o, (int)c_l.m, -1, (int)c_l.l, 60, (int)c_l.k, c_l, false);
            }
            c_l = (rs.p_a.C_l)this.ea.d();
        }
    }

    @Override
    public AppletContext getAppletContext() {
        return rs.p_v.C_a.h.getAppletContext();
    }

    public void s() {
        rs.p_cache.C_c c_c;
        while ((c_c = ew.b()) != null) {
            int n;
            if (c_c.j == 0) {
                rs.p_a.C_h.a(c_c.l, c_c.m, c_c.k == 1);
                fb = true;
                if (this.gp != -1) {
                    fM = true;
                }
            }
            if (c_c.j == 1) {
                n = (c_c.l[1] & 0xFF) + ((c_c.l[0] & 0xFF) << 8);
                if (n == 420) {
                    rs.p_u.C_b.a(c_c.m, c_c.l);
                } else {
                    C_k.a(c_c.m, c_c.l, c_c.k == 1);
                }
            }
            if (c_c.j == 2) {
                if (c_c.k == 1) {
                    C_L_uc.a.a(c_c.m, (Object)c_c.l);
                } else if (c_c.m == this.oi && c_c.l != null) {
                    this.a(this.oj, c_c.l);
                }
            }
            if (c_c.j == 3 && (ee == 1 || this.bX)) {
                for (n = 0; n < this.fr.length; ++n) {
                    if (this.fS[n] == c_c.m) {
                        this.fr[n] = c_c.l;
                        if (c_c.l != null) break;
                        this.fS[n] = -1;
                        break;
                    }
                    if (this.fT[n] != c_c.m) continue;
                    this.fY[n] = c_c.l;
                    if (c_c.l != null) break;
                    this.fT[n] = -1;
                    break;
                }
            }
            if (c_c.j != 93 || !ew.c(c_c.m)) continue;
            C_x.a(new rs.p_x.C_e(c_c.l), ew);
        }
        return;
    }

    private boolean a(byte[] byArray, int n) {
        return byArray == null || rs.p_v.C_a.a(byArray, n);
    }

    private void C(int n) {
        rs.p_n.C_e c_e = rs.p_n.C_e.H[n];
        if (rs.p_n.C_e.H[n] == null) {
            System.out.println("Nulled interface!");
        }
        for (int i = 0; i < c_e.al.length && c_e.al[i] != -1; ++i) {
            rs.p_n.C_e c_e2 = rs.p_n.C_e.H[c_e.al[i]];
            if (c_e2.aI == 1) {
                this.C(c_e2.aw);
            }
            c_e2.ar = 0;
            c_e2.F = 0;
        }
    }

    public void t() {
        if (this.jZ != 2) {
            return;
        }
        this.g((this.kW - eh << 7) + this.kZ, this.kY * 2, (this.kX - ei << 7) + this.la);
        if (this.dN > -1 && ff % 20 < 10) {
            this.mX[0].f(this.dN - 12, this.dO - 28);
        }
    }

    private void bx() {
        if (this.eA != 0) {
            int n;
            if (!this.hS) {
                ++this.dT;
            }
            int n2 = n = this.hS ? 16 : 5;
            if (rs.C_C_uc.hP > this.eB + n || rs.C_C_uc.hP < this.eB - n || rs.C_C_uc.hQ > this.eC + n || rs.C_C_uc.hQ < this.eC - n) {
                this.op = true;
            }
            if (this.hM == 0) {
                if (this.eA == 2) {
                    fb = true;
                }
                if (this.eA == 3) {
                    fM = true;
                }
                this.eA = 0;
                if (this.op && this.dT >= rs.p_f.C_a.bd) {
                    this.mw = -1;
                    this.H();
                    if (this.mw == this.ex && this.mv != this.ey) {
                        rs.p_n.C_e c_e = rs.p_n.C_e.H[this.ex];
                        boolean bl = false;
                        if (this.ex == 33003 && (this.mv == 0 || this.mv == 2 || this.mv == 9 || this.mv == 11 || this.ey == 0 || this.ey == 2 || this.ey == 9 || this.ey == 11)) {
                            bl = true;
                        }
                        if (!bl) {
                            int n3 = 0;
                            if (this.kM == 1 && c_e.J == 206) {
                                n3 = 1;
                            }
                            if (c_e.az[this.mv] <= 0) {
                                n3 = 0;
                            }
                            if (c_e.ag) {
                                int n4 = this.ey;
                                int n5 = this.mv;
                                c_e.az[n5] = c_e.az[n4];
                                c_e.ax[n5] = c_e.ax[n4];
                                c_e.az[n4] = -1;
                                c_e.ax[n4] = 0;
                            } else if (n3 == 1) {
                                int n6 = this.ey;
                                int n7 = this.mv;
                                while (n6 != n7) {
                                    if (n6 > n7) {
                                        c_e.a(n6, n6 - 1);
                                        --n6;
                                        continue;
                                    }
                                    if (n6 >= n7) continue;
                                    c_e.a(n6, n6 + 1);
                                    ++n6;
                                }
                            } else {
                                c_e.a(this.ey, this.mv);
                            }
                            fv.a(214);
                            fv.p(this.ex);
                            fv.l(n3);
                            fv.p(this.ey);
                            fv.n(this.mv);
                        }
                    } else if (this.mw == 33003 && this.ex == 33002 || this.mw == 33002 && this.ex == 33003) {
                        int n8 = this.ey;
                        int n9 = this.mv;
                        boolean bl = false;
                        if (this.mw == 33003 && (n9 == 0 || n9 == 2 || n9 == 9 || n9 == 11)) {
                            bl = true;
                        }
                        if (this.ex == 3303 && (n8 == 0 || n8 == 2 || n8 == 9 || n8 == 11)) {
                            bl = true;
                        }
                        if (!bl) {
                            rs.p_n.C_e c_e = rs.p_n.C_e.H[this.ex];
                            rs.p_n.C_e c_e2 = rs.p_n.C_e.H[this.mw];
                            int n10 = c_e2.az[n9];
                            int n11 = c_e2.ax[n9];
                            c_e2.az[n9] = c_e.az[n8];
                            c_e2.ax[n9] = c_e.ax[n8];
                            c_e.az[n8] = n10;
                            c_e.ax[n8] = n11;
                        }
                    }
                } else if ((this.ow == 1 || this.y(this.eV - 1)) && this.eV > 2) {
                    this.bK();
                } else if (this.hS && this.iQ) {
                    this.a(this.iP.a, this.iP.b, this.iP.c, this.iP.d, this.iP.e, this.iP.l);
                } else if (this.eV > 0) {
                    this.D(this.eV - 1);
                }
                this.oq = 10;
                this.hU = 0;
            }
        }
    }

    @Override
    protected boolean u() {
        return rs.p_f.C_a.be && this.fc;
    }

    @Override
    protected void v() {
        this.eA = 0;
        this.dT = 0;
        this.op = false;
        this.iQ = false;
        this.iO = 0;
        this.hU = 0;
        this.hM = 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void by() {
        int n;
        int n2;
        rs.p_m.C_a c_a = this.hR;
        synchronized (c_a) {
            n2 = this.hT;
            n = this.hR.a(this.iM);
        }
        try {
            for (int i = 0; i < n; ++i) {
                if (n2 != this.hT || !this.fc || !this.hJ) {
                    this.v();
                    break;
                }
                C_a.a a2 = this.iM[i];
                this.hU = 0;
                if (a2.a == 4) {
                    this.v();
                    continue;
                }
                if (a2.a == 5) {
                    C_Client_mc.n(a2.b);
                    continue;
                }
                hP = a2.c;
                hQ = a2.d;
                if (a2.a == 1) {
                    this.hV = a2.c;
                    this.hW = a2.d;
                    this.hX = a2.i;
                    this.hU = a2.b;
                    this.hM = a2.b;
                    if (this.cD != null && a2.b == 1) {
                        this.cD = null;
                        fM = true;
                        continue;
                    }
                    if (!dj && this.eA == 0) {
                        this.H();
                        this.bM();
                    }
                    this.bm();
                    continue;
                }
                if (a2.a == 2) {
                    if (a2.b == this.iO) {
                        if (this.iQ && !this.iP.a(this)) {
                            this.v();
                            continue;
                        }
                        this.hM = 0;
                        this.g(a2.i);
                        this.bx();
                        this.iQ = false;
                        this.iO = 0;
                        continue;
                    }
                    if (a2.b != this.hM) continue;
                    this.hM = 0;
                    continue;
                }
                if (a2.a != 3 || this.eA == 0) continue;
                if (a2.e < this.eB - 16 || a2.f > this.eB + 16 || a2.g < this.eC - 16 || a2.h > this.eC + 16) {
                    this.op = true;
                }
                this.g(a2.i);
                this.bx();
            }
        }
        catch (RuntimeException runtimeException) {
            this.v();
            this.bg();
            throw runtimeException;
        }
        finally {
            this.hU = 0;
            this.bh();
        }
        if (this.eA != 0) {
            this.g(System.currentTimeMillis());
        }
    }

    private void g(long l2) {
        this.dT = (int)Math.min(Integer.MAX_VALUE, Math.max(0L, l2 - this.iN) / 20L);
    }

    private void bz() {
        int n;
        int n2;
        if (this.lR > 0) {
            --this.lR;
        }
        for (n2 = 0; n2 < 100 && this.bP(); ++n2) {
        }
        if (!this.fc) {
            return;
        }
        if (System.currentTimeMillis() - this.iR >= 500L) {
            this.iR = System.currentTimeMillis() + 500L;
            if (rs.p_d.C_d.e == 0) {
                rs.p_d.C_d.e = 1;
            }
            if (++rs.p_d.C_d.e > 5) {
                rs.p_d.C_d.e = 1;
            }
        }
        if (this.hU != 0) {
            long l2 = (this.hX - this.oe) / 50L;
            if (l2 > 4095L) {
                l2 = 4095L;
            }
            this.oe = this.hX;
            n = this.hW;
            if (n < 0) {
                n = 0;
            } else if (n > 502) {
                n = 502;
            }
            int n3 = this.hV;
            if (n3 < 0) {
                n3 = 0;
            } else if (n3 > 764) {
                n3 = 764;
            }
            int n4 = n * 765 + n3;
            boolean bl = false;
            if (this.hU == 2) {
                bl = true;
            }
            int n5 = (int)l2;
        }
        if (this.lS > 0) {
            --this.lS;
        }
        if (this.hY[1] == 1 || this.hY[2] == 1 || this.hY[3] == 1 || this.hY[4] == 1) {
            this.lT = true;
        }
        if (this.lT && this.lS <= 0) {
            this.lS = 20;
            this.lT = false;
            fv.a(86);
            fv.d(this.fs);
            fv.o(this.ft);
        }
        if (this.hJ && !this.lf) {
            this.lf = true;
            fv.a(3);
            fv.b(1);
        }
        if (!this.hJ && this.lf) {
            this.lf = false;
            fv.a(3);
            fv.b(0);
        }
        this.bv();
        this.bJ();
        this.K();
        ++this.lP;
        if (this.lP > 750 && rs.p_f.C_a.l.booleanValue()) {
            this.x();
        }
        this.bI();
        this.bF();
        this.bq();
        ++this.dE;
        if (this.dv != 0) {
            this.du += 20;
            if (this.du >= 400) {
                this.dv = 0;
            }
        }
        if (this.fX != 0) {
            ++this.oq;
            if (this.oq >= 15) {
                if (this.fX == 2) {
                    fb = true;
                }
                if (this.fX == 3) {
                    fM = true;
                }
                this.fX = 0;
            }
        }
        if (this.hS) {
            this.by();
        } else {
            this.bx();
        }
        if (C_V_uc.r != -1 && !C_V_uc.q) {
            n2 = C_V_uc.r;
            int n6 = C_V_uc.s;
            n = this.a(0, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n6, C_Client_mc.eR.k[0], true, n2) ? 1 : 0;
            C_V_uc.r = -1;
            if (n != 0) {
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 1;
                this.du = 0;
            }
        }
        if (this.hU == 1 && this.cD != null) {
            this.cD = null;
            fM = true;
            this.hU = 0;
        }
        this.bm();
        if (this.hM == 1 || this.hU == 1) {
            ++this.oc;
        }
        if (ee == 2) {
            this.S();
        }
        if (ee == 2 && this.fe) {
            this.p();
        }
        n2 = 0;
        while (n2 < 5) {
            int n7 = n2++;
            this.eg[n7] = this.eg[n7] + 1;
        }
        this.C();
        ++this.hL;
        ++this.hK;
        if (this.hK > 4500) {
            this.lR = 250;
            this.hK -= 500;
            fv.a(202);
        }
        ++this.lQ;
        if (this.lQ > 50) {
            fv.a(0);
        }
        if (!rs.p_f.C_a.aF && ic > 0L && !rs.p_f.C_a.aE && System.currentTimeMillis() - this.id > ic && this.ie.size() > 0) {
            for (rs.p_q.p_a.C_a c_a : this.ie) {
                fv.a(41);
                fv.d(c_a.a());
                fv.o(c_a.b());
                fv.o(c_a.c());
            }
            this.ie.clear();
        }
        try {
            if (this.nD != null && C_Client_mc.fv.h > 0) {
                this.nD.a(C_Client_mc.fv.h, C_Client_mc.fv.g);
                C_Client_mc.fv.h = 0;
                this.lQ = 0;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            this.x();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.br();
        }
    }

    private void bA() {
        C_N_uc c_N_uc = (C_N_uc)this.nL.b();
        while (c_N_uc != null) {
            if (c_N_uc.g == -1) {
                c_N_uc.o = 0;
                this.a(c_N_uc);
            } else {
                c_N_uc.b();
            }
            c_N_uc = (C_N_uc)this.nL.d();
        }
    }

    public void w() {
    }

    public void b(int n, String string, String string2) {
        if (this.G == null) {
            return;
        }
        this.G.a(n, string, string2);
    }

    @Override
    public void a(int n, String string) {
        if (this.G == null) {
            return;
        }
        this.G.a(n, string, "@yel@Current Progress - " + n + "%");
    }

    public void a(int n, int n2, int n3, int n4, rs.p_n.C_e c_e, int n5, boolean bl, int n6) {
        int n7 = this.lp ? 32 : 0;
        this.lp = false;
        if (n3 >= n && n3 < n + 16 && n4 >= n5 && n4 < n5 + 16) {
            c_e.V -= this.oc * 4;
            if (bl) {
                fb = true;
            }
        } else if (n3 >= n && n3 < n + 16 && n4 >= n5 + n2 - 16 && n4 < n5 + n2) {
            c_e.V += this.oc * 4;
            if (bl) {
                fb = true;
            }
        } else if (n3 >= n - n7 && n3 < n + 16 + n7 && n4 >= n5 + 16 && n4 < n5 + n2 - 16 && this.oc > 0) {
            int n8 = (n2 - 32) * n2 / n6;
            if (n8 < 8) {
                n8 = 8;
            }
            int n9 = n4 - n5 - 16 - n8 / 2;
            int n10 = n2 - 32 - n8;
            c_e.V = (n6 - n2) * n9 / n10;
            if (bl) {
                fb = true;
            }
            this.lp = true;
        }
    }

    private boolean d(int n, int n2, int n3, int n4) {
        Object object;
        int n5 = this.dF.b(dw, n3, n2, n);
        if (n == -1) {
            return false;
        }
        int n6 = n5 & 0x1F;
        int n7 = n5 >> 6 & 3;
        if (n6 == 10 || n6 == 11 || n6 == 22) {
            int n8;
            int n9;
            object = C_r.c(n4);
            if (n7 == 0 || n7 == 2) {
                n9 = ((C_r)object).U;
                n8 = ((C_r)object).af;
            } else {
                n9 = ((C_r)object).af;
                n8 = ((C_r)object).U;
            }
            if (rs.p_f.C_a.c()) {
                System.out.println("on :interact_object, " + n4 + ", :width => " + n9 + ", :height => " + n8 + ", :source => pos(" + (n3 + eh) + ", " + (n2 + ei) + ") do |player, event|");
            }
            int n10 = ((C_r)object).ak & 0xF;
            if (n7 != 0) {
                n10 = (n10 << n7 & 0xF) + (n10 >> 4 - n7);
            }
            boolean bl = this.a(2, 0, n8, 0, C_Client_mc.eR.l[0], n9, n10, n2, C_Client_mc.eR.k[0], false, n3);
        } else {
            if (rs.p_f.C_a.c()) {
                System.out.println("on :interact_object, " + n4 + ", :width => 1, :height => 1, :source => pos(" + (n3 + eh) + ", " + (n2 + ei) + ") do |player, event|");
            }
            this.a(2, n7, 0, n6 + 1, C_Client_mc.eR.l[0], 0, 0, n2, C_Client_mc.eR.k[0], false, n3);
        }
        object = new C_ObjectInteraction_mc();
        ((C_ObjectInteraction_mc)object).setX(n3);
        ((C_ObjectInteraction_mc)object).setY(n2);
        ((C_ObjectInteraction_mc)object).setZ(dw);
        ((C_ObjectInteraction_mc)object).setHash(n);
        ((C_ObjectInteraction_mc)object).setId(n4);
        this.p.post(object);
        this.ds = this.hV;
        this.dt = this.hW;
        this.dv = 2;
        this.du = 0;
        return true;
    }

    private boolean h(int n, int n2, int n3) {
        int n4 = n >> 14 & Short.MAX_VALUE;
        int n5 = this.dF.b(dw, n3, n2, n);
        if (n5 == -1) {
            return false;
        }
        int n6 = n5 & 0x1F;
        int n7 = n5 >> 6 & 3;
        if (n6 == 10 || n6 == 11 || n6 == 22) {
            int n8;
            int n9;
            C_r c_r = C_r.c(n4);
            if (n7 == 0 || n7 == 2) {
                n9 = c_r.U;
                n8 = c_r.af;
            } else {
                n9 = c_r.af;
                n8 = c_r.U;
            }
            int n10 = c_r.ak & 0xF;
            if (n7 != 0) {
                n10 = (n10 << n7 & 0xF) + (n10 >> 4 - n7);
            }
            this.a(2, 0, n8, 0, C_Client_mc.eR.l[0], n9, n10, n2, C_Client_mc.eR.k[0], false, n3);
        } else {
            this.a(2, n7, 0, n6 + 1, C_Client_mc.eR.l[0], 0, 0, n2, C_Client_mc.eR.k[0], false, n3);
        }
        this.ds = this.hV;
        this.dt = this.hW;
        this.dv = 2;
        this.du = 0;
        return true;
    }

    public rs.p_x.C_f a(int n, String string, String string2, int n2, int n3) {
        byte[] byArray = null;
        try {
            if (C_Client_mc.ew.b.a()[0] != null) {
                byArray = C_Client_mc.ew.b.a()[0].a(n);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (byArray != null) {
            return new rs.p_x.C_f(byArray, string);
        }
        this.a(n3, "Error loading: " + string);
        System.out.println("Error loading \"" + string + "\"");
        return null;
    }

    public void x() {
        try {
            if (this.lR > 0) {
                this.br();
                return;
            }
            this.gi.a(0, "Connection lost", 144, 257);
            this.gi.a(0xFFFFFF, "Connection lost", 143, 256);
            this.gi.a(0, "Please wait - attempting to reestablish", 159, 257);
            this.gi.a(0xFFFFFF, "Please wait - attempting to reestablish", 158, 256);
            if (rs.p_k.C_e.a()) {
                this.a.b(false);
            }
            this.lV = 0;
            this.gd = 0;
            rs.p_q.C_b c_b = this.nD;
            this.fc = false;
            this.el = 0;
            this.a(this.fk, this.fl, true);
            if (!this.fc) {
                this.br();
            }
            c_b.a();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static int c(int n, int n2) {
        Random random = new Random();
        int n3 = random.nextInt(n2 - n + 1) + n;
        return n3;
    }

    private void D(int n) {
        if (n < 0) {
            return;
        }
        this.a(this.eI[n], this.eJ[n], this.eF[n], this.eG[n], this.eH[n], this.fx[n]);
    }

    private void a(int n, int n2, int n3, int n4, int n5, String string) {
        rs.p_a.C_j c_j;
        int n6;
        String string2;
        int n7;
        rs.p_a.C_k c_k;
        String string3;
        int n8;
        rs.p_a.C_k c_k2;
        rs.p_a.C_k c_k3;
        rs.p_a.C_k c_k4;
        rs.p_a.C_j c_j2;
        rs.p_a.C_j c_j3;
        rs.p_a.C_j c_j4;
        rs.p_a.C_j c_j5;
        rs.p_a.C_j c_j6;
        Object object;
        rs.p_a.C_j c_j7;
        int n9;
        int n10;
        int n11;
        C_EntityInteraction_mc c_EntityInteraction_mc;
        Object object2;
        int n12;
        if (this.fN != 0 && this.fN != 25) {
            this.fN = 0;
            fM = true;
        }
        int n13 = n3;
        int n14 = n4;
        int n15 = n12 = n2 > Short.MAX_VALUE ? n5 : n2 >> 14 & Short.MAX_VALUE;
        if (n == 1107 && cI > 0 && !rs.p_n.p_a.p_a.C_c.c()) {
            rs.p_n.p_a.p_a.C_c.b();
        }
        if (n == 632) {
            if (cH == 36000 && ag) {
                n = n4 == 30074 ? C_ac.bL : C_ac.bK;
            }
            if (cH == 40600 && ag) {
                n = 431;
            }
            if ((n4 == 2006 || n4 == 5382) && cH == 23000 && ag) {
                n = 431;
            }
        }
        if (n >= 2000) {
            n -= 2000;
        }
        if (n == 582 && (object2 = this.cA[n2]) != null) {
            this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, ((rs.p_a.C_j)object2).l[0], C_Client_mc.eR.k[0], false, ((rs.p_a.C_j)object2).k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(57);
            fv.o(this.oM);
            fv.o(n2);
            fv.n(this.gs);
            fv.o(this.gt);
            c_EntityInteraction_mc = new C_EntityInteraction_mc();
            c_EntityInteraction_mc.setEntity((rs.p_a.C_c)object2);
            this.p.post(c_EntityInteraction_mc);
        }
        if (n == 234) {
            boolean bl = this.a(2, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n4, C_Client_mc.eR.k[0], false, n3);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, n4, C_Client_mc.eR.k[0], false, n3);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(236);
            fv.n(n4 + ei);
            fv.d(n2);
            fv.n(n3 + eh);
        }
        if (n == 291) {
            fv.a(140);
            fv.o(n3);
            fv.d(n4);
            fv.o(n2);
        }
        if (n == 300) {
            fv.a(141);
            fv.o(n3);
            fv.d(n4);
            fv.o(n2);
            fv.g(this.ih);
        }
        if (n == 62 && this.d(n2, n14, n13, n12)) {
            fv.a(192);
            fv.d(this.gt);
            fv.n(n12);
            fv.p(n14 + ei);
            fv.n(this.gs);
            fv.p(n13 + eh);
            fv.d(this.oM);
        }
        if (n == 511) {
            boolean bl = this.a(2, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n4, C_Client_mc.eR.k[0], false, n3);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, n4, C_Client_mc.eR.k[0], false, n3);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(25);
            fv.n(this.gt);
            fv.o(this.oM);
            fv.d(n2);
            fv.o(n4 + ei);
            fv.p(this.gs);
            fv.d(n3 + eh);
        }
        if (n == 1500) {
            this.cp = !this.cp;
            fv.a(185);
            if (this.cp) {
                fv.d(5000);
            } else {
                fv.d(4999);
            }
            this.v.c();
        }
        if (n == 1506) {
            fv.a(185);
            fv.d(5001);
        }
        if (n == 2245) {
            C_ap.h();
        }
        if (n == 2246) {
            C_Client_mc.n(6);
        }
        if (n == 74) {
            fv.a(122);
            fv.p(n4);
            fv.o(n3);
            fv.n(n2);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
            if (n2 == 23195 || n2 == 27405) {
                this.eW = 1;
                this.bq = 1339;
                this.nl = 1339;
                this.nm = 10;
                this.gr = 0;
                fb = true;
                this.nn = "Cast @mag@catch@whi@ on";
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 2;
                this.du = 0;
                return;
            }
        }
        if (n == 315) {
            object2 = rs.p_n.C_e.H[n4];
            boolean bl = true;
            if (((rs.p_n.C_e)object2).J > 0) {
                bl = this.c((rs.p_n.C_e)object2);
            }
            if (object2 instanceof rs.p_n.p_a.p_a.C_a) {
                if (cI == -1) {
                    rs.p_n.p_a.p_a.C_c.a(((rs.p_n.C_e)object2).aw);
                } else {
                    rs.p_n.p_a.p_a.C_c.b();
                }
            }
            if (n4 >= 70000 && n4 <= 70600 && C_af.e.get(n4) != null) {
                this.gb = false;
                this.fN = 4;
                this.dY = "";
                fM = true;
                this.iS = C_af.e.get(n4).b();
                return;
            }
            if (bl) {
                int n16 = -1;
                if (n4 == 65796 && rs.p_n.C_e.H[44000].at.equals("")) {
                    n16 = this.og;
                }
                if (n4 == 47002 || n4 == 64606) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 27;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of item to search";
                }
                if (n4 == 47006 || n4 == 64605) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 26;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of monster to search";
                }
                if (n4 == 25115 || n16 == 0) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 28;
                    this.og = 0;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of item to search:";
                }
                if (n4 == 25113 || n16 == 1) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 29;
                    this.og = 1;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of player to search:";
                }
                if (n4 == 24710 || n16 == 2) {
                    this.ev = 0;
                    fM = true;
                    this.fN = 30;
                    this.og = 2;
                    this.gb = true;
                    this.fB = "";
                    this.eQ = "Enter name of item history to search:";
                }
                C_ap.m(n4);
                C_ai.m(n4);
                if (n4 == 43508) {
                    rs.p_f.C_a.bj = !rs.p_f.C_a.bj;
                    C_aH_mc.i();
                }
                if (cH == C_aD_mc.bI) {
                    C_aD_mc.b(n4, true);
                }
                if (n4 >= 63001 && n4 <= 63021 || n4 == 63025 || n4 == 63024 || n4 == 63027 || n4 >= 63046 && n4 <= 63051) {
                    C_w.m(n4);
                }
                for (rs.p_n.C_c c_c : rs.p_n.C_d.a) {
                    c_c.a(n4);
                }
                C_Y_uc.m(n4);
                if (n4 == 26004) {
                    rs.p_n.p_c.C_h.a(this);
                }
                if ((n4 == 30162 || n4 == 7455 || n4 == 13095) && rs.p_f.C_a.ba) {
                    this.a("<img=25> You currently have this spell locked!", 0, null);
                } else {
                    fv.a(185);
                    fv.d(n4);
                }
                if (n4 == 39002) {
                    this.gp = 35112;
                    rs.p_n.C_e.H[35115].E = rs.p_f.C_a.aS ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                    C_F_uc c_F_uc = rs.p_n.C_e.H[35115].aG = rs.p_f.C_a.aS ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                }
                if (n4 == 33006) {
                    C_al.h();
                }
                if (cH == C_ae.d) {
                    int n17;
                    boolean bl2 = false;
                    int n18 = C_ae.e;
                    for (n17 = 0; n17 < C_ae.c.size(); ++n17) {
                        if (n4 != (n11 = n18++)) continue;
                        bl2 = true;
                        break;
                    }
                    n18 = C_ae.e;
                    if (bl2) {
                        for (n17 = 0; n17 < C_ae.c.size(); ++n17) {
                            if (n4 == (n11 = n18++)) {
                                rs.p_n.C_e.H[n11].E = new C_F_uc("vote/sprite 2");
                                rs.p_n.C_e.H[n11].aG = new C_F_uc("vote/sprite 2");
                                continue;
                            }
                            rs.p_n.C_e.H[n11].E = new C_F_uc("vote/sprite 1");
                            rs.p_n.C_e.H[n11].aG = new C_F_uc("vote/sprite 2");
                        }
                    }
                }
            }
        }
        if (n == 561 && (object2 = kw_do[n2]) != null) {
            this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, ((rs.p_a.C_k)object2).l[0], C_Client_mc.eR.k[0], false, ((rs.p_a.C_k)object2).k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if ((nO += n2) >= 90) {
                fv.a(136);
                nO = 0;
            }
            fv.a(128);
            fv.d(n2);
        }
        if (n == 20 && (object2 = this.cA[n2]) != null) {
            this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, ((rs.p_a.C_j)object2).l[0], C_Client_mc.eR.k[0], false, ((rs.p_a.C_j)object2).k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(155);
            fv.n(n2);
            c_EntityInteraction_mc = new C_EntityInteraction_mc();
            c_EntityInteraction_mc.setEntity((rs.p_a.C_c)object2);
            this.p.post(c_EntityInteraction_mc);
        }
        if (n == 779 && (object2 = kw_do[n2]) != null) {
            this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, ((rs.p_a.C_k)object2).l[0], C_Client_mc.eR.k[0], false, ((rs.p_a.C_k)object2).k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(153);
            fv.n(n2);
        }
        if (n == 516) {
            if (!dj) {
                this.dF.b(this.hW - 4, this.hV - 4);
            } else if (C_V_uc.q) {
                C_V_uc.q = false;
            } else {
                this.dF.b(n4 - 4, n3 - 4);
            }
        }
        if (n == 518) {
            if (!dj) {
                this.dF.b(this.hW - 4, this.hV - 4);
            } else {
                this.a(2, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n4, C_Client_mc.eR.k[0], false, n3);
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 1;
                this.du = 0;
            }
        }
        if (n == 517) {
            ap = "::skipbh";
        }
        if (n == 519) {
            this.x.C = true;
        }
        if (n == 520) {
            this.x.C = false;
        }
        if (n == 521) {
            ap = "::bhtask";
        }
        if (n == 522) {
            ap = "::bhtaskinfo";
        }
        if (n == 523) {
            ap = "::bhtaskskip";
        }
        if (n == 1062) {
            if ((kO += eh) >= 113) {
                fv.a(183);
                fv.f(15086193);
                kO = 0;
            }
            this.d(n2, n4, n3, n12);
            fv.a(228);
            fv.o(n12);
            fv.o(n4 + ei);
            fv.d(n3 + eh);
        }
        if (n == 679 && !this.eZ) {
            fv.a(40);
            fv.d(n4);
            this.eZ = true;
        }
        if (n == 431) {
            fv.a(129);
            fv.o(n3);
            fv.d(n4);
            fv.o(n2);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if ((n == 337 || n == 42 || n == 792 || n == 322) && (n10 = ((String)(object2 = string)).indexOf("@whi@")) != -1) {
            long l2 = C_O_uc.a(((String)object2).substring(n10 + 5).trim());
            if (n == 337) {
                this.a(l2);
            }
            if (n == 42) {
                this.h(l2);
            }
            if (n == 792) {
                this.f(l2);
            }
            if (n == 322) {
                this.i(l2);
            }
        }
        if (n == 53) {
            fv.a(135);
            fv.n(n3);
            fv.o(n4);
            fv.n(n2);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n == 638) {
            fv.a(176);
            fv.n(n3);
            fv.o(n4);
            fv.n(n2);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n == 539) {
            fv.a(16);
            fv.o(n2);
            fv.p(n3);
            fv.p(n4);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
            if (n2 == 23912) {
                this.eW = 1;
                this.bq = 1339;
                this.nl = 1339;
                this.nm = 10;
                this.gr = 0;
                fb = true;
                this.nn = "Cast @mag@catch@whi@ on";
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 2;
                this.du = 0;
                return;
            }
        }
        if ((n == 484 || n == 6) && (n9 = ((String)(object2 = string)).indexOf("@whi@")) != -1) {
            object2 = ((String)object2).substring(n9 + 5).trim();
            String string4 = C_O_uc.c(C_O_uc.a(C_O_uc.a((String)object2)));
            boolean bl = false;
            for (int i = 0; i < this.ku; ++i) {
                rs.p_a.C_k c_k5 = kw_do[this.kv[i]];
                if (c_k5 == null || c_k5.aZ == null || !c_k5.aZ.equalsIgnoreCase(string4)) continue;
                if (n == 484) {
                    fv.a(39);
                    fv.n(this.kv[i]);
                } else {
                    this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, c_k5.l[0], C_Client_mc.eR.k[0], false, c_k5.k[0]);
                }
                if (n == 6) {
                    if ((nO += n2) >= 90) {
                        fv.a(136);
                        nO = 0;
                    }
                    fv.a(73);
                    fv.n(this.kv[i]);
                }
                bl = true;
                break;
            }
            if (!bl) {
                this.a("Unable to find " + string4, 0, "");
            }
        }
        if (n == 870) {
            fv.a(53);
            fv.d(n3);
            fv.o(this.gs);
            fv.p(n2);
            fv.d(this.gt);
            fv.n(this.oM);
            fv.d(n4);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n == 847) {
            if (!(!rs.p_f.C_a.aL || rs.p_n.C_e.H[n4].ah == cH || rs.p_n.C_e.H[n4].ah == this.gp || (object2 = rs.p_d.C_k.f(n2)) == null || ((rs.p_d.C_k)object2).w == null || ((rs.p_d.C_k)object2).w.startsWith("@") || ((rs.p_d.C_k)object2).w.startsWith("<") || ((rs.p_d.C_k)object2).w.contains(" pet") || ((rs.p_d.C_k)object2).w.contains(" flask") || ((rs.p_d.C_k)object2).w.contains(" potion"))) {
                this.a("You have spawnable item dropping locked / disabled!", 0, null);
                return;
            }
            fv.a(87);
            fv.o(n2);
            fv.d(n4);
            fv.o(n3);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n == 1300) {
            C_Client_mc.f("https://spawnpk.net/forums/index.php?/forum/23-report-a-player/");
        }
        if (n == 626) {
            String string5;
            object2 = rs.p_n.C_e.H[n4];
            this.eW = 1;
            this.bq = ((rs.p_n.C_e)object2).aw;
            this.nl = n4;
            this.nm = ((rs.p_n.C_e)object2).ai;
            this.gr = 0;
            fb = true;
            String string6 = ((rs.p_n.C_e)object2).R;
            if (string6.indexOf(" ") != -1) {
                string6 = string6.substring(0, string6.indexOf(" "));
            }
            if ((string5 = ((rs.p_n.C_e)object2).R).indexOf(" ") != -1) {
                string5 = string5.substring(string5.indexOf(" ") + 1);
            }
            this.nn = string6 + " " + ((rs.p_n.C_e)object2).N + " " + string5;
            if (this.nm == 16) {
                fb = true;
                fL = 3;
                eM = true;
            }
            return;
        }
        if (n == 104) {
            object2 = rs.p_n.C_e.H[n4];
            T = ((rs.p_n.C_e)object2).aw;
            if (!this.U) {
                this.U = true;
                this.S = ((rs.p_n.C_e)object2).aw;
                fv.a(185);
                fv.d(((rs.p_n.C_e)object2).aw);
            } else if (this.S == ((rs.p_n.C_e)object2).aw) {
                this.U = false;
                this.S = 0;
                fv.a(185);
                fv.d(6666);
            } else if (this.S != ((rs.p_n.C_e)object2).aw) {
                this.U = true;
                this.S = ((rs.p_n.C_e)object2).aw;
                fv.a(185);
                fv.d(((rs.p_n.C_e)object2).aw);
            }
        }
        if (n == 78) {
            fv.a(117);
            fv.p(n4);
            fv.p(n2);
            fv.n(n3);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n == 27 && (object2 = kw_do[n2]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if ((lz += n2) >= 54) {
                fv.a(189);
                fv.b(234);
                lz = 0;
            }
            fv.a(73);
            fv.n(n2);
        }
        if (n == 213) {
            boolean bl = this.a(2, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n4, C_Client_mc.eR.k[0], false, n3);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, n4, C_Client_mc.eR.k[0], false, n3);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(79);
            fv.n(n4 + ei);
            fv.d(n2);
            fv.o(n3 + eh);
        }
        if (n == 632) {
            if (rs.p_n.C_e.H[n4] != null && n4 == 5382) {
                rs.p_n.C_e c_e = rs.p_n.C_e.H[n4];
                if (c_e.ax != null && c_e.ax.length > n3 && c_e.ax[n3] == 0) {
                    if (dj) {
                        ap = "::phrelease " + n2;
                    } else {
                        this.bK();
                    }
                }
            }
            fv.a(145);
            fv.o(n4);
            fv.o(n3);
            fv.o(n2);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        int n19 = this.gy;
        int n20 = this.gu;
        int n21 = this.cE;
        int n22 = this.fZ;
        int n23 = this.fj;
        if (n == 1003) {
            this.gy = 2;
            fM = true;
        }
        if (n == 1002) {
            this.gy = 1;
            fM = true;
        }
        if (n == 1001) {
            this.gy = 0;
            fM = true;
        }
        if (n == 1000) {
            this.v.a(rs.p_i.C_a.g);
        }
        if (n == 999) {
            this.v.a(rs.p_i.C_a.b);
        }
        if (n == 1600) {
            this.v.a(rs.p_i.C_a.f);
        }
        if (n == 1601) {
            this.gw = 0;
            this.ok = true;
            fM = true;
        }
        if (n == 1602) {
            this.gw = 2;
            this.ok = true;
            fM = true;
        }
        if (n == 997) {
            this.gu = 3;
            this.ok = true;
            fM = true;
        }
        if (n == 996) {
            this.gu = 2;
            this.ok = true;
            fM = true;
        }
        if (n == 995) {
            this.gu = 1;
            this.ok = true;
            fM = true;
        }
        if (n == 994) {
            this.gu = 0;
            this.ok = true;
            fM = true;
        }
        if (n == 993) {
            this.v.a(rs.p_i.C_a.c);
        }
        if (n == 992) {
            this.cE = 2;
            this.ok = true;
            fM = true;
        }
        if (n == 991) {
            this.cE = 1;
            this.ok = true;
            fM = true;
        }
        if (n == 990) {
            this.cE = 0;
            this.ok = true;
            fM = true;
        }
        if (n == 989) {
            this.v.a(rs.p_i.C_a.d);
        }
        if (n == 1425) {
            for (int i = 0; i < 200; ++i) {
                if (this.dC[i] == null || (n11 = this.dz[i]) != 3 && n11 != 5 && n11 != 6 && n11 != 7) continue;
                this.dC[i] = null;
            }
        }
        if (n == 1300) {
            // empty if block
        }
        if (n == 987) {
            this.fZ = 2;
            this.ok = true;
            fM = true;
        }
        if (n == 986) {
            this.fZ = 1;
            this.ok = true;
            fM = true;
        }
        if (n == 985) {
            this.fZ = 0;
            this.ok = true;
            fM = true;
        }
        if (n == 984) {
            this.v.a(rs.p_i.C_a.e);
        }
        if (n == 983) {
            this.fj = 2;
            this.ok = true;
            fM = true;
        }
        if (n == 982) {
            this.fj = 1;
            this.ok = true;
            fM = true;
        }
        if (n == 981) {
            this.fj = 0;
            this.ok = true;
            fM = true;
        }
        if (n == 980) {
            this.v.a(4);
        }
        if (n == 1604) {
            this.gx = this.gx == rs.p_i.C_a.z ? rs.p_i.C_a.v : rs.p_i.C_a.z;
            this.ok = true;
            fM = true;
        }
        if (n == 1603) {
            this.v.a(rs.p_i.C_a.h);
        }
        if (n == 1007) {
            this.gv = this.gv == rs.p_i.C_a.z ? rs.p_i.C_a.v : rs.p_i.C_a.z;
            this.ok = true;
            fM = true;
        }
        if (n == 1006) {
            this.v.a(rs.p_i.C_a.i);
        }
        if (n19 != this.gy || n20 != this.gu || n21 != this.cE || n22 != this.fZ || n23 != this.fj) {
            fv.a(95);
            fv.b(this.gu);
            fv.b(this.cE);
            fv.b(this.fZ);
        }
        if (n == 493) {
            fv.a(75);
            fv.p(n4);
            fv.n(n3);
            fv.o(n2);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n == 652) {
            boolean bl = this.a(2, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n4, C_Client_mc.eR.k[0], false, n3);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, n4, C_Client_mc.eR.k[0], false, n3);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(156);
            fv.o(n3 + eh);
            fv.n(n4 + ei);
            fv.p(n2);
        }
        if (n == 94) {
            boolean bl = this.a(2, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n4, C_Client_mc.eR.k[0], false, n3);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, n4, C_Client_mc.eR.k[0], false, n3);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(181);
            fv.n(n4 + ei);
            fv.d(n2);
            fv.n(n3 + eh);
            fv.o(this.nl);
        }
        if (n == 647) {
            rs.p_f.C_a.ba = !rs.p_f.C_a.ba;
            rs.p_f.C_a.d();
        }
        if (n == 646) {
            if ((n4 == 1164 || n4 == 30064) && this.cY == 2) {
                this.cY = 3;
            }
            if (n4 == 915 || n4 == 19081) {
                if (System.currentTimeMillis() - ib < 500L) {
                    return;
                }
                ib = System.currentTimeMillis();
            }
            if ((n4 == 30162 || n4 == 7455 || n4 == 13095) && rs.p_f.C_a.ba) {
                this.a("<img=25> You currently have this spell locked!", 0, null);
            } else {
                fv.a(185);
                fv.d(n4);
            }
            rs.p_n.C_e c_e = rs.p_n.C_e.H[n4];
            if (c_e.X != null && c_e.X[0][0] == 5) {
                n11 = c_e.X[0][1];
                if (n4 == 12474) {
                    if (System.currentTimeMillis() - this.iC < 1000L) {
                        this.a("<img=25> Please wait a few seconds before re-toggling Lite Mode!", 0, null);
                        return;
                    }
                    this.iC = System.currentTimeMillis();
                }
                if (n4 == 19085) {
                    ao = "::extended";
                    return;
                }
                if (this.dP[n11] != c_e.I[0]) {
                    this.g("@blu@CONFIGS:@bla@ Setting ID @red@" + n11 + "@bla@ to option @red@" + c_e.I[0]);
                    this.dP[n11] = c_e.I[0];
                    this.B(n11);
                    fb = true;
                }
            }
        }
        if (n == 225 && (c_j7 = this.cA[n2]) != null) {
            long l3;
            long l4 = l3 = c_j7.aG != null ? c_j7.aG.x : -1L;
            if (l3 == 2347L || l3 == 2346L || l3 == 2345L || l3 == 2344L) {
                this.eW = 1;
                this.bq = 1337;
                this.nl = 1337;
                this.nm = 12;
                this.gr = 0;
                fb = true;
                this.nn = "Cast @mag@Polymorphism@whi@ on";
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 2;
                this.du = 0;
                return;
            }
            this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, c_j7.l[0], C_Client_mc.eR.k[0], false, c_j7.k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if ((oh += n2) >= 85) {
                fv.a(230);
                fv.b(239);
                oh = 0;
            }
            fv.a(17);
            fv.p(n2);
            object = new C_EntityInteraction_mc();
            ((C_EntityInteraction_mc)object).setEntity(c_j7);
            this.p.post(object);
        }
        if (n == 965 && (c_j6 = this.cA[n2]) != null) {
            this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, c_j6.l[0], C_Client_mc.eR.k[0], false, c_j6.k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if (++nk >= 96) {
                fv.a(152);
                fv.b(88);
                nk = 0;
            }
            fv.a(21);
            fv.d(n2);
            C_EntityInteraction_mc c_EntityInteraction_mc2 = new C_EntityInteraction_mc();
            c_EntityInteraction_mc2.setEntity(c_j6);
            this.p.post(c_EntityInteraction_mc2);
        }
        if (n == 413 && (c_j5 = this.cA[n2]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(131);
            fv.p(n2);
            fv.o(this.nl);
            C_EntityInteraction_mc c_EntityInteraction_mc3 = new C_EntityInteraction_mc();
            c_EntityInteraction_mc3.setEntity(c_j5);
            c_EntityInteraction_mc3.setCombat(true);
            this.p.post(c_EntityInteraction_mc3);
        }
        if (n == 200) {
            this.bQ();
        }
        if (n == 1026 && (c_j4 = this.cA[n2]) != null) {
            rs.p_s.p_c.C_c.b.a(c_j4, false);
            C_EntityInteraction_mc c_EntityInteraction_mc4 = new C_EntityInteraction_mc();
            c_EntityInteraction_mc4.setEntity(c_j4);
            this.p.post(c_EntityInteraction_mc4);
        }
        if (n == 1025 && (c_j3 = this.cA[n2]) != null) {
            rs.p_d.C_d c_d = c_j3.aG;
            if (c_d.G != null) {
                c_d = c_d.c();
            }
            if (c_d != null) {
                Object object3 = c_d.H != null ? new String(c_d.H) : "It's a " + c_d.o + ".";
                ap = "::dropnpcid " + c_d.x;
            }
        }
        if (n == 900) {
            this.d(n2, n4, n3, n12);
            fv.a(252);
            fv.p(n12);
            fv.n(n4 + ei);
            fv.o(n3 + eh);
        }
        if (n == 412 && (c_j2 = this.cA[n2]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(72);
            fv.o(n2);
            C_EntityInteraction_mc c_EntityInteraction_mc5 = new C_EntityInteraction_mc();
            c_EntityInteraction_mc5.setEntity(c_j2);
            c_EntityInteraction_mc5.setCombat(true);
            this.p.post(c_EntityInteraction_mc5);
        }
        if (n == 365 && (c_k4 = kw_do[n2]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(249);
            fv.o(n2);
            fv.n(this.nl);
        }
        if (n == 729 && (c_k3 = kw_do[n2]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(39);
            fv.n(n2);
        }
        if (n == 577 && (c_k2 = kw_do[n2]) != null) {
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(139);
            fv.n(n2);
        }
        if (n == 956 && this.d(n2, n4, n3, n12)) {
            fv.a(35);
            fv.n(n3 + eh);
            fv.o(this.nl);
            fv.o(n4 + ei);
            fv.n(n12);
        }
        if (n == 567) {
            boolean bl = this.a(2, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n4, C_Client_mc.eR.k[0], false, n3);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, n4, C_Client_mc.eR.k[0], false, n3);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(23);
            fv.n(n4 + ei);
            fv.n(n2);
            fv.n(n3 + eh);
        }
        if (n == 867) {
            if ((n2 & 3) == 0) {
                ++nH;
            }
            if (nH >= 59) {
                fv.a(200);
                fv.d(25501);
                nH = 0;
            }
            fv.a(43);
            fv.n(n4);
            fv.o(n2);
            fv.o(n3);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
            if (n2 == 21671 || n2 == 21670) {
                this.eW = 1;
                this.bq = 1338;
                this.nl = 1338;
                this.nm = 12;
                this.gr = 0;
                fb = true;
                this.nn = "@mag@Punch";
                this.ds = this.hV;
                this.dt = this.hW;
                this.dv = 2;
                this.du = 0;
                return;
            }
        }
        if (n == 543) {
            fv.a(237);
            fv.d(n3);
            fv.o(n2);
            fv.d(n4);
            fv.o(this.nl);
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n == 606 && (n8 = (string3 = string).indexOf("@whi@")) != -1) {
            if (cH == -1) {
                this.bQ();
                this.kr = string3.substring(n8 + 5).trim();
                this.nz = false;
                for (int i = 0; i < rs.p_n.C_e.H.length; ++i) {
                    if (rs.p_n.C_e.H[i] == null || rs.p_n.C_e.H[i].J != 600) continue;
                    this.nK = cH = rs.p_n.C_e.H[i].ah;
                    break;
                }
            } else {
                this.a("Please close the interface you have open before using 'report abuse'", 0, "");
            }
        }
        if (n == 491 && (c_k = kw_do[n2]) != null) {
            this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, c_k.l[0], C_Client_mc.eR.k[0], false, c_k.k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(14);
            fv.o(this.gt);
            fv.d(n2);
            fv.d(this.oM);
            fv.n(this.gs);
        }
        if (n == 639 && (n7 = (string2 = string).indexOf("@whi@")) != -1) {
            long l5 = C_O_uc.a(string2.substring(n7 + 5).trim());
            int n24 = -1;
            for (n6 = 0; n6 < this.kA; ++n6) {
                if (this.lg[n6] != l5) continue;
                n24 = n6;
                break;
            }
            if (n24 != -1 && this.jG[n24] > 0) {
                fM = true;
                this.fN = 0;
                this.gb = true;
                this.fB = "";
                this.ev = 3;
                this.le = this.lg[n24];
                this.eQ = "Enter message to send to " + this.mT[n24];
            }
        }
        if (n == 454) {
            if (!rs.p_f.C_a.aF && ic > 0L && !rs.p_f.C_a.aE) {
                this.ie.add(new rs.p_q.p_a.C_a(n2, n3, n4));
                if (System.currentTimeMillis() - this.id > ic) {
                    this.id = System.currentTimeMillis();
                }
            } else {
                fv.a(41);
                fv.d(n2);
                fv.o(n3);
                fv.o(n4);
            }
            this.oq = 0;
            this.fV = n4;
            this.fW = n3;
            this.fX = 2;
            if (rs.p_n.C_e.H[n4].ah == cH) {
                this.fX = 1;
            }
            if (rs.p_n.C_e.H[n4].ah == this.gp) {
                this.fX = 3;
            }
        }
        if (n == 478 && (c_j = this.cA[n2]) != null) {
            this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, c_j.l[0], C_Client_mc.eR.k[0], false, c_j.k[0]);
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            if ((n2 & 3) == 0) {
                ++ny;
            }
            if (ny >= 53) {
                fv.a(85);
                fv.b(66);
                ny = 0;
            }
            fv.a(18);
            fv.n(n2);
            C_EntityInteraction_mc c_EntityInteraction_mc6 = new C_EntityInteraction_mc();
            c_EntityInteraction_mc6.setEntity(c_j);
            this.p.post(c_EntityInteraction_mc6);
        }
        if (n == 113) {
            this.d(n2, n4, n3, n12);
            fv.a(70);
            fv.n(n3 + eh);
            fv.d(n4 + ei);
            fv.p(n12);
        }
        if (n == 872) {
            this.d(n2, n4, n3, n12);
            fv.a(234);
            fv.p(n3 + eh);
            fv.o(n12);
            fv.p(n4 + ei);
        }
        if (n == 502) {
            this.d(n2, n14, n13, n12);
            fv.a(132);
            fv.p(n13 + eh);
            fv.d(n12);
            fv.o(n14 + ei);
        }
        if (n == 1125) {
            rs.p_d.C_k c_k6 = rs.p_d.C_k.f(n2);
            rs.p_n.C_e c_e = rs.p_n.C_e.H[n4];
            if (rs.p_f.C_a.c() && cH == -1 && rs.p_s.p_c.C_c.d) {
                rs.p_s.p_c.C_c.b.a(n2, false);
            } else {
                Object object4;
                object = c_k6.w;
                if (c_k6.w.contains("@gre@")) {
                    object = ((String)object).replace("@gre@", "");
                }
                if (c_e != null && c_e.ax != null && c_e.ax[n3] >= 100000) {
                    object4 = C_Client_mc.a(c_e.ax[n3]) + " x " + (String)object;
                } else if (c_k6.E != null) {
                    object4 = new String(c_k6.E);
                    ((String)object4).replace("@gre@", "");
                } else {
                    object4 = "It's a " + rs.p_l.C_j.b(c_k6.w) + ".";
                    rs.p_n.C_a.a("::iexam " + c_k6.i);
                }
                if (cH == 47500 && c_k6.w != null) {
                    ap = "::igsearch " + c_k6.w;
                } else {
                    String string7 = rs.p_d.C_m.a("", c_k6.i);
                    if (string7 != null && !string7.isEmpty()) {
                        n6 = gl.c(string7 = rs.p_l.C_j.b(string7).replace('\n', '^'));
                        if (n6 >= 475) {
                            StringBuilder stringBuilder = new StringBuilder();
                            for (int i = 0; i < string7.length(); ++i) {
                                boolean bl;
                                if (string7.charAt(i) == '^') {
                                    stringBuilder.append(' ');
                                } else {
                                    stringBuilder.append(string7.charAt(i));
                                }
                                int n25 = gl.c(stringBuilder.toString());
                                boolean bl3 = bl = n25 >= 380 && (string7.charAt(i) == ' ' || string7.charAt(i) == '^' || string7.charAt(i) == '-' || string7.charAt(i) == '.' || string7.charAt(i) == ',');
                                if (!bl && i != string7.length() - 1) continue;
                                this.a(stringBuilder.toString(), 0, "");
                                stringBuilder = new StringBuilder();
                            }
                        } else {
                            this.a(string7.replace('^', ' '), 0, "");
                        }
                    } else {
                        this.a((String)object4, 0, "");
                    }
                }
            }
        }
        if (n == 169) {
            fv.a(185);
            fv.d(n4);
            if (n4 == 64029) {
                this.gb = false;
                this.fN = 3;
                this.dY = "";
                fM = true;
                return;
            }
            rs.p_n.C_e c_e = rs.p_n.C_e.H[n4];
            if (c_e.X != null && c_e.X[0][0] == 5) {
                int n26 = c_e.X[0][1];
                this.dP[n26] = 1 - this.dP[n26];
                this.B(n26);
                fb = true;
            }
        }
        if (n == 447) {
            this.gr = 1;
            this.gs = n3;
            this.gt = n4;
            this.oM = n2;
            this.oN = rs.p_d.C_k.f((int)n2).w;
            this.eW = 0;
            fb = true;
            return;
        }
        if (n == 1227) {
            C_r c_r = C_r.c(n12);
            rs.p_s.p_c.C_c.b.b(n12, false);
        }
        if (n == 1226) {
            C_r c_r = C_r.c(n12);
            Object object5 = c_r.aq != null ? new String(c_r.aq) : "It's a " + c_r.R + ".";
            this.a((String)object5, 0, "");
        }
        if (n == 244) {
            boolean bl = this.a(2, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n4, C_Client_mc.eR.k[0], false, n3);
            if (!bl) {
                bl = this.a(2, 0, 1, 0, C_Client_mc.eR.l[0], 1, 0, n4, C_Client_mc.eR.k[0], false, n3);
            }
            this.ds = this.hV;
            this.dt = this.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(253);
            fv.n(n3 + eh);
            fv.p(n4 + ei);
            fv.o(n2);
        }
        if (n == 1448) {
            rs.p_d.C_k c_k7 = rs.p_d.C_k.f(n2);
            Object object6 = c_k7.E != null ? new String(c_k7.E) : "It's a " + c_k7.w + ".";
            this.a((String)object6, 0, "");
        }
        if (n == 1924) {
            this.r.a(n2);
        }
        this.gr = 0;
        this.eW = 0;
        fb = true;
    }

    private void g(String string) {
        if (eR != null && cT == 2 && rs.p_f.C_a.am) {
            this.a("@red@[@mag@CLIENT DEBUG@red@]@bla@ " + string, 0, "");
        }
    }

    public void y() {
        this.ou = 0;
        int n = (C_Client_mc.eR.ac >> 7) + eh;
        int n2 = (C_Client_mc.eR.ad >> 7) + ei;
        if (n >= 3053 && n <= 3156 && n2 >= 3056 && n2 <= 3136) {
            this.ou = 1;
        }
        if (n >= 3072 && n <= 3118 && n2 >= 9492 && n2 <= 9535) {
            this.ou = 1;
        }
        if (this.ou == 1 && n >= 3139 && n <= 3199 && n2 >= 3008 && n2 <= 3062) {
            this.ou = 0;
        }
    }

    @Override
    public void run() {
        if (!this.kq) {
            super.run();
        }
    }

    public void z() {
        rs.p_l.p_e.C_f.o = 0;
        for (rs.p_l.p_e.C_a c_a : rs.p_l.p_e.C_f.n) {
            if (c_a == null || !c_a.e()) continue;
            if (c_a instanceof rs.p_l.p_e.p_a.C_s) {
                ++rs.p_l.p_e.C_f.o;
            }
            if (!c_a.a(this.hM)) continue;
            return;
        }
        if (this.gr == 0 && this.eW == 0) {
            this.fx[this.eV] = "Walk here";
            this.eI[this.eV] = 516;
            this.eF[this.eV] = rs.C_C_uc.hP;
            this.eG[this.eV] = rs.C_C_uc.hQ;
            ++this.eV;
        }
        int n = -1;
        block1: for (int i = 0; i < rs.p_a.C_h.bw; ++i) {
            int n2;
            Object object;
            int n3 = rs.p_a.C_h.bx[i];
            int n4 = n3 & 0x7F;
            int n5 = n3 >> 7 & 0x7F;
            int n6 = n3 >> 29 & 3;
            int n7 = -1;
            if (n6 != 2) {
                n7 = n3 >> 14 & Short.MAX_VALUE;
            }
            if (n3 == n) continue;
            n = n3;
            if (n6 == 2 && this.dF.b(dw, n4, n5, n3) >= 0) {
                n7 = rs.p_a.C_h.by[i];
                object = C_r.c(n7);
                if (object != null && ((C_r)object).ad != null) {
                    object = ((C_r)object).d();
                }
                if (object == null || ((C_r)object).R == null || ((C_r)object).R == "null") continue;
                if (this.gr == 1) {
                    this.fx[this.eV] = "Use " + this.oN + " with @cya@" + ((C_r)object).R;
                    this.eI[this.eV] = 62;
                    this.eJ[this.eV] = n3;
                    this.eF[this.eV] = n4;
                    this.eG[this.eV] = n5;
                    this.eH[this.eV] = n7;
                    ++this.eV;
                } else if (this.eW == 1) {
                    if ((this.nm & 4) == 4) {
                        this.fx[this.eV] = this.nn + " @cya@" + ((C_r)object).R;
                        this.eI[this.eV] = 956;
                        this.eJ[this.eV] = n3;
                        this.eF[this.eV] = n4;
                        this.eG[this.eV] = n5;
                        this.eH[this.eV] = n7;
                        ++this.eV;
                    }
                } else {
                    if (((C_r)object).ay != null) {
                        for (n2 = 4; n2 >= 0; --n2) {
                            if (((C_r)object).ay[n2] == null) continue;
                            this.fx[this.eV] = ((C_r)object).ay[n2] + " @cya@" + ((C_r)object).R;
                            if (n2 == 0) {
                                this.eI[this.eV] = 502;
                            }
                            if (n2 == 1) {
                                this.eI[this.eV] = 900;
                            }
                            if (n2 == 2) {
                                this.eI[this.eV] = 113;
                            }
                            if (n2 == 3) {
                                this.eI[this.eV] = 872;
                            }
                            if (n2 == 4) {
                                this.eI[this.eV] = 1062;
                            }
                            this.eJ[this.eV] = n3;
                            this.eF[this.eV] = n4;
                            this.eG[this.eV] = n5;
                            this.eH[this.eV] = n7;
                            ++this.eV;
                        }
                    }
                    this.fx[this.eV] = "Examine @cya@" + ((C_r)object).R;
                    this.eI[this.eV] = 1226;
                    this.eJ[this.eV] = ((C_r)object).aa << 14;
                    this.eF[this.eV] = n4;
                    this.eG[this.eV] = n5;
                    this.eH[this.eV] = n7;
                    ++this.eV;
                    if (C_v.a(cT) && rs.p_f.C_a.c() && rs.p_s.p_c.C_c.d) {
                        this.fx[this.eV] = "<img=191> @mag@Colors@cya@ " + ((C_r)object).R;
                        this.eI[this.eV] = 1227;
                        this.eJ[this.eV] = ((C_r)object).aa << 14;
                        this.eF[this.eV] = n4;
                        this.eG[this.eV] = n5;
                        this.eH[this.eV] = n7;
                        ++this.eV;
                    }
                }
            }
            if (n6 == 1) {
                object = this.cA[n7];
                if (object == null || ((rs.p_a.C_j)object).aG == null) continue;
                if (((rs.p_a.C_j)object).aG.r == 1 && (((rs.p_a.C_j)object).ac & 0x7F) == 64 && (((rs.p_a.C_j)object).ad & 0x7F) == 64) {
                    rs.p_a.C_c c_c;
                    for (n2 = 0; n2 < this.cB; ++n2) {
                        c_c = this.cA[this.cC[n2]];
                        if (c_c == null || c_c == object || c_c.aG == null || c_c.aG.r != 1 || c_c.ac != ((rs.p_a.C_j)object).ac || c_c.ad != ((rs.p_a.C_j)object).ad) continue;
                        this.a(c_c.aG, this.cC[n2], n5, n4);
                    }
                    for (n2 = 0; n2 < this.ku; ++n2) {
                        c_c = kw_do[this.kv[n2]];
                        if (c_c == null || ((rs.p_a.C_k)c_c).ac != ((rs.p_a.C_j)object).ac || ((rs.p_a.C_k)c_c).ad != ((rs.p_a.C_j)object).ad) continue;
                        this.a(n4, this.kv[n2], (rs.p_a.C_k)c_c, n5);
                    }
                }
                this.a(((rs.p_a.C_j)object).aG, n7, n5, n4);
            }
            if (n6 == 0) {
                Object object2;
                object = kw_do[n7];
                if (object == null) continue;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                if ((((rs.p_a.C_k)object).ac & 0x7F) == 64 && (((rs.p_a.C_k)object).ad & 0x7F) == 64) {
                    int n8;
                    for (n8 = 0; n8 < this.cB; ++n8) {
                        object2 = this.cA[this.cC[n8]];
                        if (object2 == null || ((rs.p_a.C_j)object2).aG.r != 1 || ((rs.p_a.C_j)object2).ac != ((rs.p_a.C_k)object).ac || ((rs.p_a.C_j)object2).ad != ((rs.p_a.C_k)object).ad) continue;
                        this.a(((rs.p_a.C_j)object2).aG, this.cC[n8], n5, n4);
                    }
                    for (n8 = 0; n8 < this.ku; ++n8) {
                        object2 = kw_do[this.kv[n8]];
                        if (object2 == null || object2 == object || ((rs.p_a.C_k)object2).ac != ((rs.p_a.C_k)object).ac || ((rs.p_a.C_k)object2).ad != ((rs.p_a.C_k)object).ad) continue;
                        arrayList.add(this.kv[n8]);
                    }
                }
                arrayList.add(n7);
                int n9 = -1;
                for (Integer n10 : arrayList) {
                    int n11 = C_Client_mc.kw_do[n10.intValue()].m - 32768;
                    if (n11 == di && n9 == -1) {
                        n9 = n10;
                    }
                    if (C_Client_mc.eR.m - 32768 == n10) {
                        n9 = n10;
                    }
                    if (kw_do[n10] == null || C_Client_mc.kw_do[n10.intValue()].aZ == null || this.z.r == null || this.z.r.equalsIgnoreCase(C_Client_mc.kw_do[n10.intValue()].aZ)) continue;
                    n9 = n10;
                    break;
                }
                if (n9 != -1) {
                    object2 = kw_do[n9];
                    this.a(n4, n9, (rs.p_a.C_k)object2, n5);
                }
                for (Integer n10 : arrayList) {
                    if (n9 != -1 && n9 == n10) continue;
                    rs.p_a.C_k c_k = kw_do[n10];
                    this.a(n4, (int)n10, c_k, n5);
                }
            }
            if (n6 != 3 || (object = this.jH[dw][n4][n5]) == null) continue;
            C_g c_g = (C_g)((C_h)object).c();
            while (c_g != null) {
                rs.p_d.C_k c_k = rs.p_d.C_k.f(c_g.h);
                if (c_k != null && c_k.w != null) {
                    if (this.eV > this.fx.length - 1) continue block1;
                    if (this.gr == 1) {
                        this.fx[this.eV] = "Use " + this.oN + " with @lre@" + c_k.w;
                        this.eI[this.eV] = 511;
                        this.eJ[this.eV] = c_g.h;
                        this.eF[this.eV] = n4;
                        this.eG[this.eV] = n5;
                        ++this.eV;
                    } else if (this.eW == 1) {
                        if ((this.nm & 1) == 1) {
                            this.fx[this.eV] = this.nn + " @lre@" + c_k.w;
                            this.eI[this.eV] = 94;
                            this.eJ[this.eV] = c_g.h;
                            this.eF[this.eV] = n4;
                            this.eG[this.eV] = n5;
                            ++this.eV;
                        }
                    } else {
                        for (int j = 4; j >= 0; --j) {
                            if (c_k.u != null && c_k.u[j] != null) {
                                this.fx[this.eV] = c_k.u[j] + " @lre@" + c_k.w;
                                if (j == 0) {
                                    this.eI[this.eV] = 652;
                                }
                                if (j == 1) {
                                    this.eI[this.eV] = 567;
                                }
                                if (j == 2) {
                                    this.eI[this.eV] = 234;
                                }
                                if (j == 3) {
                                    this.eI[this.eV] = 244;
                                }
                                if (j == 4) {
                                    this.eI[this.eV] = 213;
                                }
                                this.eJ[this.eV] = c_g.h;
                                this.eF[this.eV] = n4;
                                this.eG[this.eV] = n5;
                                ++this.eV;
                                continue;
                            }
                            if (j != 2) continue;
                            this.fx[this.eV] = "Take @lre@" + c_k.w;
                            this.eI[this.eV] = 234;
                            this.eJ[this.eV] = c_g.h;
                            this.eF[this.eV] = n4;
                            this.eG[this.eV] = n5;
                            ++this.eV;
                        }
                        this.fx[this.eV] = "Examine @lre@" + c_k.w;
                        this.eI[this.eV] = 1448;
                        this.eJ[this.eV] = c_g.h;
                        this.eF[this.eV] = n4;
                        this.eG[this.eV] = n5;
                        this.iT = rs.p_d.C_k.f((int)c_g.h).w;
                        ++this.eV;
                    }
                }
                c_g = (C_g)((C_h)object).e();
            }
        }
    }

    @Override
    public void A() {
        rs.p_v.C_a.n = false;
        try {
            if (this.nD != null) {
                this.nD.a();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.jn = false;
        this.nD = null;
        this.e();
        if (this.kp != null) {
            this.kp.c = false;
        }
        this.kp = null;
        try {
            ew.h();
        }
        catch (Exception exception) {
            // empty catch block
        }
        ew = null;
        this.eH = null;
        this.jM = null;
        fv = null;
        this.jS = null;
        this.mU = null;
        this.fR = null;
        this.fr = null;
        this.fY = null;
        this.fS = null;
        this.fT = null;
        this.fC = null;
        this.gc = null;
        this.dF = null;
        this.fP = null;
        this.kC = null;
        this.jF = null;
        this.oK = null;
        this.oL = null;
        this.kL = null;
        this.dq = null;
        this.kE = null;
        this.kF = null;
        this.kG = null;
        this.dr = null;
        this.kH = null;
        this.kI = null;
        this.kJ = null;
        this.kK = null;
        this.fw = null;
        this.nT = null;
        this.nU = null;
        this.ma = null;
        this.mb = null;
        this.mc = null;
        this.dG = null;
        this.nq = null;
        this.nr = null;
        this.ns = null;
        this.nt = null;
        this.nu = null;
        this.kb = null;
        this.kc = null;
        this.kd = null;
        this.ke = null;
        this.kf = null;
        this.ng = null;
        this.dS = null;
        this.mW = null;
        this.eK = null;
        this.mX = null;
        this.fa = null;
        this.mC = null;
        this.mD = null;
        this.mM = null;
        this.mN = null;
        this.mQ = null;
        this.mq = null;
        this.me = null;
        this.kS = null;
        kw_do = null;
        this.kv = null;
        this.kx = null;
        this.ky = null;
        this.jO = null;
        this.cA = null;
        this.cC = null;
        this.jH = null;
        this.nL = null;
        this.ea = null;
        this.et = null;
        this.eF = null;
        this.eG = null;
        this.eI = null;
        this.eJ = null;
        this.fx = null;
        this.dP = null;
        this.mA = null;
        this.mB = null;
        this.no = null;
        this.oA = null;
        this.mT = null;
        this.lg = null;
        this.jG = null;
        this.bL();
        C_r.b();
        rs.p_d.C_d.d();
        rs.p_d.C_k.a();
        rs.p_d.C_h.b = null;
        rs.p_d.C_j.b = null;
        rs.p_n.C_e.H = null;
        rs.p_d.C_a.a = null;
        rs.p_d.C_x.c = null;
        rs.p_d.C_x.p = null;
        C_z.a = null;
        this.ha = null;
        rs.p_a.C_k.aL = null;
        rs.p_a.C_k.aM = null;
        rs.p_a.C_k.aN = null;
        rs.p_d.C_x.q = null;
        C_E_uc.e();
        C_V_uc.a();
        rs.p_a.C_h.g();
        C_k.b();
        System.gc();
        System.exit(0);
    }

    private void bB() {
    }

    @Override
    public Component B() {
        if (rs.p_v.C_a.h != null) {
            return rs.p_v.C_a.h;
        }
        if (this.hH != null) {
            return this.hH;
        }
        return this;
    }

    public void C() {
        int n;
        while ((n = this.w(-796)) != -1) {
            if (this.ac() && (n == 96 || n == 42 && this.fk.equalsIgnoreCase("bsouth"))) {
                w.a();
                return;
            }
            if (C_Client_mc.w.b && !this.gb && this.gp <= 0) {
                w.a(n);
                fM = true;
                return;
            }
            if (cH != -1 && cH == this.nK) {
                if (n == 8 && this.kr.length() > 0) {
                    this.kr = this.kr.substring(0, this.kr.length() - 1);
                }
                if (!(n >= 97 && n <= 122 || n >= 65 && n <= 90 || n >= 48 && n <= 57) && n != 32 || this.kr.length() >= 12) continue;
                this.kr = this.kr + (char)n;
                continue;
            }
            if (this.gb) {
                long l2;
                if (n >= 32 && n <= 122 && this.fB.length() < 80) {
                    this.fB = this.fB + (char)n;
                    if (this.fN == 25) {
                        this.ar = "::banksearch " + this.fB;
                    }
                    fM = true;
                }
                if (n == 8 && this.fB.length() > 0) {
                    this.fB = this.fB.substring(0, this.fB.length() - 1);
                    if (this.fN == 25) {
                        this.ar = "::banksearch " + this.fB;
                    }
                    fM = true;
                }
                if (n == 9) {
                    this.J();
                }
                if (n != 13 && n != 10) continue;
                this.gb = false;
                fM = true;
                if (this.fN == 25) {
                    this.ar = this.fB.equalsIgnoreCase("") ? "::banksearch ~clear" : "::banksearch " + this.fB;
                }
                if (this.fN == 26) {
                    ap = "::dropnpcse " + this.fB;
                }
                if (this.fN == 27) {
                    ap = "::dropitemse " + this.fB;
                }
                if (this.fN == 28) {
                    ap = "::tpsitem " + this.fB;
                }
                if (this.fN == 29) {
                    ap = "::tpsuser " + this.fB;
                }
                if (this.fN == 30) {
                    ap = "::tpshist " + this.fB;
                }
                if (this.fN == 31) {
                    ap = "::description " + this.fB;
                }
                if (this.fN == 32) {
                    ap = "::yelltag " + this.fB;
                }
                if (this.fN == 33) {
                    ap = "::title " + this.fB;
                }
                if (this.ev == 1) {
                    l2 = C_O_uc.a(this.fB);
                    this.a(l2);
                }
                if (this.ev == 2 && this.kA > 0) {
                    l2 = C_O_uc.a(this.fB);
                    this.f(l2);
                }
                if (this.ev == 3 && this.fB.length() > 0) {
                    fv.a(126);
                    fv.b(0);
                    int n2 = C_Client_mc.fv.h;
                    fv.a(this.le);
                    C_P_uc.a(this.fB, fv);
                    fv.j(C_Client_mc.fv.h - n2);
                    this.fB = C_P_uc.a(this.fB);
                    this.fB = rs.p_d.C_c.b(this.fB);
                    this.a(this.fB, 6, C_O_uc.c(C_O_uc.a(this.le)));
                    if (this.cE == 2) {
                        this.cE = 1;
                        this.ok = true;
                        fv.a(95);
                        fv.b(this.gu);
                        fv.b(this.cE);
                        fv.b(this.fZ);
                    }
                }
                if (this.ev == 4 && this.jD < 100) {
                    long l3 = C_O_uc.a(this.fB);
                    this.h(l3);
                }
                if (this.ev != 5 || this.jD <= 0) continue;
                long l4 = C_O_uc.a(this.fB);
                this.i(l4);
                continue;
            }
            if (this.fN == 1) {
                if (n >= 48 && n <= 57 && this.dY.length() < 10) {
                    this.dY = this.dY + (char)n;
                    fM = true;
                }
                if (!((this.dY.toLowerCase().contains("k") || this.dY.toLowerCase().contains("m") || this.dY.toLowerCase().contains("b") || n != 107 && n != 109) && n != 98 && n != 75 && n != 77 && n != 66)) {
                    this.dY = this.dY + (char)n;
                    fM = true;
                }
                if (n == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n != 13 && n != 10) continue;
                if (this.dY.length() > 0) {
                    if (this.dY.toLowerCase().contains("k")) {
                        this.dY = this.dY.replaceAll("k", "000");
                        this.dY = this.dY.replaceAll("K", "000");
                    } else if (this.dY.toLowerCase().contains("m")) {
                        this.dY = this.dY.replaceAll("m", "000000");
                        this.dY = this.dY.replaceAll("M", "000000");
                    } else if (this.dY.toLowerCase().contains("b")) {
                        this.dY = this.dY.replaceAll("b", "000000000");
                        this.dY = this.dY.replaceAll("B", "000000000");
                    }
                    int n3 = 0;
                    try {
                        n3 = Integer.parseInt(this.dY);
                    }
                    catch (NumberFormatException numberFormatException) {
                        n3 = Integer.MAX_VALUE;
                    }
                    if (cH == 23000 && n3 > 0) {
                        this.ih = n3;
                        rs.p_n.p_c.C_h.m(this.ih);
                    }
                    fv.a(208);
                    fv.g(n3);
                }
                this.fN = 0;
                fM = true;
                continue;
            }
            if (this.fN == 2) {
                if (n >= 32 && n <= 122 && this.dY.length() < 24) {
                    this.dY = this.dY + (char)n;
                    fM = true;
                }
                if (n == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n != 13 && n != 10) continue;
                if (this.dY.length() > 0) {
                    fv.a(60);
                    fv.a(C_O_uc.a(this.dY));
                }
                this.fN = 0;
                fM = true;
                continue;
            }
            if (this.fN == 3) {
                if (n >= 32 && n <= 122 && this.dY.length() < 25) {
                    this.dY = this.dY + (char)n;
                    fM = true;
                }
                if (n == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n != 13 && n != 10) continue;
                this.fN = 0;
                this.gb = false;
                fM = true;
                C_af.a(this, this.dY);
                C_af.b(bk);
                fb = true;
                continue;
            }
            if (this.fN == 6 && this.q.c() != null) {
                switch (this.q.c().e()) {
                    case b: {
                        if (n >= 48 && n <= 57 && this.dY.length() < 10) {
                            this.dY = this.dY + (char)n;
                            fM = true;
                        }
                        if ((this.dY.toLowerCase().contains("k") || this.dY.toLowerCase().contains("m") || this.dY.toLowerCase().contains("b") || n != 107 && n != 109) && n != 98 && n != 75 && n != 77 && n != 66) break;
                        this.dY = this.dY + (char)n;
                        fM = true;
                        break;
                    }
                    case c: {
                        if (n < 32 || n > 122 || this.dY.length() >= 12) break;
                        this.dY = this.dY + (char)n;
                        fM = true;
                        break;
                    }
                    case a: {
                        if (n < 32 || n > 122 || this.dY.length() >= 25) break;
                        this.dY = this.dY + (char)n;
                        fM = true;
                    }
                }
                if (n == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n != 13 && n != 10) continue;
                this.q.a();
                this.fN = 0;
                this.gb = false;
                fM = true;
                fb = true;
                continue;
            }
            if (this.fN == 4) {
                if (n >= 48 && n <= 57 && this.dY.length() < 10) {
                    this.dY = this.dY + (char)n;
                    fM = true;
                }
                if (!((this.dY.toLowerCase().contains("k") || this.dY.toLowerCase().contains("m") || this.dY.toLowerCase().contains("b") || n != 107 && n != 109) && n != 98)) {
                    this.dY = this.dY + (char)n;
                    fM = true;
                }
                if (n == 8 && this.dY.length() > 0) {
                    this.dY = this.dY.substring(0, this.dY.length() - 1);
                    fM = true;
                }
                if (n != 13 && n != 10) continue;
                if (this.dY.length() > 0) {
                    if (this.dY.toLowerCase().contains("k")) {
                        this.dY = this.dY.replaceAll("k", "000");
                    } else if (this.dY.toLowerCase().contains("m")) {
                        this.dY = this.dY.replaceAll("m", "000000");
                    } else if (this.dY.toLowerCase().contains("b")) {
                        this.dY = this.dY.replaceAll("b", "000000000");
                    }
                    int n4 = 0;
                    try {
                        n4 = Integer.parseInt(this.dY);
                    }
                    catch (NumberFormatException numberFormatException) {
                        n4 = Integer.MAX_VALUE;
                    }
                    ap = "::tabitem " + String.valueOf(this.iS) + " " + n4;
                }
                this.fN = 0;
                fM = true;
                continue;
            }
            if (this.gp != -1 || this.dl != null) continue;
            if (n == 9) {
                this.J();
            }
            if (dk.isEmpty() && n == 58) {
                this.bw = true;
            }
            if (this.v.h() && !this.f()) continue;
            if (n >= 32 && n <= 122 && dk.length() < 80) {
                dk = dk + (char)n;
                fM = true;
            }
            if (n == 8 && dk.length() > 0) {
                dk = dk.substring(0, dk.length() - 1);
                fM = true;
                if (dk.isEmpty()) {
                    this.bw = false;
                }
            }
            if (n != 13 && n != 10 || dk.length() <= 0) continue;
            this.bw = false;
            if (rs.p_f.C_a.O && !dk.startsWith("::")) {
                dk = "::" + dk;
            }
            dm = dk;
            if (dk.startsWith("/")) {
                dk = dk.replace("/", "");
                dk = "::clan " + dk;
                dk = dk.substring(0, dk.length());
            }
            this.d(dk);
            if (dk.startsWith("::")) {
                if (!C_Client_mc.h(dk)) {
                    fv.a(103);
                    fv.b(dk.length() - 1);
                    fv.a(dk.substring(2));
                }
            } else {
                String string = dk.toLowerCase();
                int n5 = 0;
                if (string.startsWith("yellow:")) {
                    n5 = 0;
                    dk = dk.substring(7);
                } else if (string.startsWith("red:")) {
                    n5 = 1;
                    dk = dk.substring(4);
                } else if (string.startsWith("green:")) {
                    n5 = 2;
                    dk = dk.substring(6);
                } else if (string.startsWith("cyan:")) {
                    n5 = 3;
                    dk = dk.substring(5);
                } else if (string.startsWith("purple:")) {
                    n5 = 4;
                    dk = dk.substring(7);
                } else if (string.startsWith("white:")) {
                    n5 = 5;
                    dk = dk.substring(6);
                } else if (string.startsWith("flash1:")) {
                    n5 = 6;
                    dk = dk.substring(7);
                } else if (string.startsWith("flash2:")) {
                    n5 = 7;
                    dk = dk.substring(7);
                } else if (string.startsWith("flash3:")) {
                    n5 = 8;
                    dk = dk.substring(7);
                } else if (string.startsWith("glow1:")) {
                    n5 = 9;
                    dk = dk.substring(6);
                } else if (string.startsWith("glow2:")) {
                    n5 = 10;
                    dk = dk.substring(6);
                } else if (string.startsWith("glow3:")) {
                    n5 = 11;
                    dk = dk.substring(6);
                }
                string = dk.toLowerCase();
                int n6 = 0;
                if (string.startsWith("wave:")) {
                    n6 = 1;
                    dk = dk.substring(5);
                } else if (string.startsWith("wave2:")) {
                    n6 = 2;
                    dk = dk.substring(6);
                } else if (string.startsWith("shake:")) {
                    n6 = 3;
                    dk = dk.substring(6);
                } else if (string.startsWith("scroll:")) {
                    n6 = 4;
                    dk = dk.substring(7);
                } else if (string.startsWith("slide:")) {
                    n6 = 5;
                    dk = dk.substring(6);
                }
                fv.a(4);
                fv.b(0);
                int n7 = C_Client_mc.fv.h;
                fv.m(n6);
                fv.m(n5);
                this.jM.h = 0;
                C_P_uc.a(dk, this.jM);
                fv.a(0, this.jM.g, this.jM.h);
                fv.j(C_Client_mc.fv.h - n7);
                dk = C_P_uc.a(dk);
                C_Client_mc.eR.q = dk = rs.p_d.C_c.b(dk);
                C_Client_mc.eR.v = n5;
                C_Client_mc.eR.K = n6;
                C_Client_mc.eR.O = 150;
                if (cT > 0) {
                    int n8 = cT;
                    this.a(C_Client_mc.eR.q, 2, "@cr" + n8 + "@" + eR.d(true));
                } else {
                    this.a(C_Client_mc.eR.q, 2, eR.d(true));
                }
                if (this.gu == 2) {
                    this.gu = 3;
                    this.ok = true;
                    fv.a(95);
                    fv.b(this.gu);
                    fv.b(this.cE);
                    fv.b(this.fZ);
                }
            }
            dk = "";
            fM = true;
        }
    }

    private void E(int n) {
        int n2 = 0;
        boolean bl = false;
        for (int i = 0; i < this.dC.length; ++i) {
            if (this.dC[i] == null) continue;
            int n3 = 70 - n2 * 14 + 42 + eD + 4 + 5;
            if (n3 < -23) break;
            int n4 = this.dz[i];
            String string = this.dB[i];
            String string2 = this.dC[i];
            boolean bl2 = this.dD[i];
            if (!(n4 != rs.p_i.C_a.j || this.fi != rs.p_i.C_a.h && this.fi != rs.p_i.C_a.b || this.gx != rs.p_i.C_a.v && (this.gx != rs.p_i.C_a.z || bl2))) {
                ++n2;
            }
            if (!(n4 != rs.p_i.C_a.s || this.fi != rs.p_i.C_a.i && this.fi != rs.p_i.C_a.b && (this.fi != rs.p_i.C_a.h || bl2) || this.gv != rs.p_i.C_a.v && bl2)) {
                ++n2;
            }
            if (!(n4 != rs.p_i.C_a.t || this.fi != rs.p_i.C_a.g && this.fi != rs.p_i.C_a.b || this.gy != rs.p_i.C_a.v && bl2)) {
                ++n2;
            }
            if (!(n4 != rs.p_i.C_a.u || this.fi != rs.p_i.C_a.f && this.fi != rs.p_i.C_a.b || this.gw != rs.p_i.C_a.v && bl2)) {
                ++n2;
            }
            if (!(n4 != rs.p_i.C_a.k && n4 != rs.p_i.C_a.l || this.gu != rs.p_i.C_a.v && (this.gu != rs.p_i.C_a.w || !this.i(string)) || this.fi != rs.p_i.C_a.c && this.fi != rs.p_i.C_a.b)) {
                if (n > n3 - 14 && n <= n3 && !string.equals(eR.o())) {
                    if (cT >= 1) {
                        this.a("Report abuse @whi@" + string, 606);
                    }
                    this.a("Add ignore @whi@" + string, 42);
                    this.a("Add friend @whi@" + string, 337);
                }
                ++n2;
            }
            if ((n4 == rs.p_i.C_a.q || n4 == rs.p_i.C_a.p) && this.nS == 0 && (n4 == rs.p_i.C_a.p || this.cE == 0 || this.cE == 1 && this.i(string))) {
                if (n > n3 - 14 && n <= n3) {
                    if (cT >= 1) {
                        this.a("Report abuse @whi@" + string, 606);
                    }
                    this.a("Add ignore @whi@" + string, 42);
                    this.a("Add friend @whi@" + string, 337);
                }
                ++n2;
            }
            if ((n4 == 5 || n4 == 6) && this.nS == 0 && this.cE < 2) {
                ++n2;
            }
            if (n4 == rs.p_i.C_a.n && (this.fZ == 0 || this.fZ == 1 && this.i(string))) {
                if (n > n3 - 14 && n <= n3) {
                    this.a("Accept trade @whi@" + string, 484);
                }
                ++n2;
            }
            if (n4 != 8 || this.fZ != 0 && (this.fZ != 1 || !this.i(string))) continue;
            if (n > n3 - 14 && n <= n3) {
                this.a("Accept challenge @whi@" + string, 6);
            }
            ++n2;
        }
    }

    public boolean c(String string) {
        if (string == null || string.isEmpty() || string.length() > 80) {
            return false;
        }
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 >= '0' && c2 <= '9' || c2 == ' ' || c2 == '_' || c2 == '-') continue;
            return false;
        }
        String string2 = "::" + string;
        this.d(string2);
        if (C_Client_mc.h(string2)) {
            return true;
        }
        fv.a(103);
        fv.b(string2.length() - 1);
        fv.a(string);
        return true;
    }

    private static boolean h(String string) {
        return string.equalsIgnoreCase("::queuedclicks") || string.equalsIgnoreCase("::queuedclicks on") || string.equalsIgnoreCase("::queuedclicks off");
    }

    public void d(String string) {
        String[] stringArray;
        if (C_Client_mc.h(string)) {
            rs.p_f.C_a.be = string.equalsIgnoreCase("::queuedclicks") ? !rs.p_f.C_a.be : string.equalsIgnoreCase("::queuedclicks on");
            this.bg();
            this.v();
            rs.p_f.C_a.d();
            this.a("<img=163> Queued item clicks: " + (rs.p_f.C_a.be ? "on" : "off") + ". Use ::queuedclicks to toggle.", 0, null);
            return;
        }
        if (string.equals("::fixed")) {
            rs.p_f.C_a.ai = C_a.c.a;
            this.a(C_a.c.a);
        }
        if (string.equals("::resizable")) {
            rs.p_f.C_a.ai = C_a.c.b;
            this.a(C_a.c.b);
        }
        if (string.startsWith("::")) {
            try {
                rs.p_n.C_a.a(this, string, cT);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (cT == 2) {
            Object object;
            Object object2;
            int n;
            stringArray = string.toLowerCase();
            if (stringArray.equals("::clear chat")) {
                for (n = 0; n < 200; ++n) {
                    this.dC[n] = null;
                }
            }
            if (stringArray.startsWith("::chatinterface")) {
                this.gp = n = Integer.valueOf(string.split(" ")[1]).intValue();
            }
            if (stringArray.startsWith("::resetoverlays")) {
                rs.p_l.p_e.C_f.a();
            }
            if (stringArray.startsWith("::find ")) {
                Object object3;
                String string2 = stringArray.replace("::find ", "");
                object2 = new ArrayList();
                for (int i = 1; i < 40000; ++i) {
                    try {
                        object3 = rs.p_d.C_k.f(i);
                        if (object3 == null || ((rs.p_d.C_k)object3).w == null || !((rs.p_d.C_k)object3).w.toLowerCase().contains(string2) || !((rs.p_d.C_k)object3).w.contains("@gre@") && this.ca || ((rs.p_d.C_k)object3).b() && this.cb) continue;
                        String string3 = ((rs.p_d.C_k)object3).w.contains("@gre@") ? "<col=007A00>[Unspawnable] " : "@red@[Spawnable] ";
                        String string4 = ((rs.p_d.C_k)object3).b() ? " <col=5700FF>(Noted) " : "";
                        object2.add(string3 + string4 + "@dre@" + ((rs.p_d.C_k)object3).w.replace("@gre@", "") + " @or3@- @mag@" + i);
                        continue;
                    }
                    catch (Exception exception) {
                        break;
                    }
                }
                this.a("<img=9> Resulted @blu@" + object2.size() + "@bla@ item(s) for term \"@blu@" + string2 + "\":", 0, null);
                object = object2.iterator();
                while (object.hasNext()) {
                    object3 = (String)object.next();
                    this.a((String)object3, 0, null);
                }
            }
            if (stringArray.startsWith("::filter")) {
                if (stringArray.equals("::filters")) {
                    this.a("<img=163> Spawnable item searches are: " + (this.ca ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                    this.a("<img=163> Noted item searches are: " + (this.cb ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                } else {
                    String string5 = stringArray.replace("::filter ", "");
                    if (string5.startsWith("spawn")) {
                        this.ca = !this.ca;
                        this.a("<img=163> Spawnable item searches are now: " + (this.ca ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                    }
                    if (string5.startsWith("note")) {
                        this.cb = !this.cb;
                        this.a("<img=163> Noted item searches are now: " + (this.cb ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                    }
                }
            }
            if (stringArray.startsWith("::nodes")) {
                this.a("PLAYER_NODES=" + rs.p_a.C_k.aL.b, 0, null);
                this.a("NPC_NODES=" + rs.p_d.C_d.M.b, 0, null);
            }
            if (stringArray.startsWith("::render ")) {
                String[] stringArray2 = stringArray.split(" ");
                object2 = stringArray2[1];
                object = stringArray2[2];
                if (((String)object2).startsWith("player")) {
                    rs.p_f.C_a.J = ((String)object).equals("on");
                    this.a("RENDER_PLAYERS=" + rs.p_f.C_a.J, 0, null);
                }
                if (((String)object2).startsWith("npc")) {
                    rs.p_f.C_a.K = ((String)object).equals("on");
                    this.a("RENDER_NPCS=" + rs.p_f.C_a.K, 0, null);
                }
                if (((String)object2).startsWith("texture")) {
                    rs.p_f.C_a.M = ((String)object).equals("on");
                    this.a("RENDER_TEXTURES=" + rs.p_f.C_a.M, 0, null);
                }
            }
            if (string.startsWith("::setinterface") && rs.p_l.C_j.b(cT)) {
                int n2 = cH;
                int n3 = Integer.valueOf(string.split(" ")[1]);
                if (n3 == -1) {
                    aW = -1;
                } else {
                    aW = n2;
                    object = rs.p_n.C_e.H[n2];
                    for (int i = 0; i < ((rs.p_n.C_e)object).al.length; ++i) {
                        if (((rs.p_n.C_e)object).al[i] != n3) continue;
                        aV = i;
                        aX = ((rs.p_n.C_e)object).am[i];
                        aY = ((rs.p_n.C_e)object).bc[i];
                    }
                }
            }
            if (string.startsWith("::colors")) {
                int n4 = Integer.valueOf(string.split(" ")[1]);
                rs.p_d.C_k c_k = rs.p_d.C_k.f(n4);
                if (c_k == null) {
                    this.a("Can't find item definition!", 0, "");
                } else {
                    object = new rs.p_a.C_h(c_k.A);
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    if (object != null && ((rs.p_a.C_h)object).ar != null) {
                        int n5;
                        for (n5 = 0; n5 < ((rs.p_a.C_h)object).ah; ++n5) {
                            if (arrayList.contains(((rs.p_a.C_h)object).ar[n5])) continue;
                            arrayList.add(((rs.p_a.C_h)object).ar[n5]);
                        }
                        for (n5 = 0; n5 < arrayList.size(); ++n5) {
                            this.a("[" + n5 + "] = " + String.valueOf(arrayList.get(n5)), 0, "");
                            System.out.print(String.valueOf(arrayList.get(n5)) + ", ");
                        }
                    } else {
                        this.a("Can't find item model! ", 0, "");
                    }
                }
            }
            if (string.startsWith("::m1models")) {
                int n6 = Integer.valueOf(string.split(" ")[1]);
                rs.p_d.C_k c_k = rs.p_d.C_k.f(n6);
                if (c_k == null) {
                    this.a("Can't find item definition!", 0, "");
                } else {
                    System.out.print(c_k.r + ", ");
                }
            }
            if (string.startsWith("::m1colors")) {
                int n7 = Integer.valueOf(string.split(" ")[1]);
                rs.p_d.C_k c_k = rs.p_d.C_k.f(n7);
                if (c_k == null) {
                    this.a("Can't find item definition!", 0, "");
                } else {
                    object = new rs.p_a.C_h(c_k.r);
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    if (object != null && ((rs.p_a.C_h)object).ar != null) {
                        int n8;
                        for (n8 = 0; n8 < ((rs.p_a.C_h)object).ah; ++n8) {
                            if (arrayList.contains(((rs.p_a.C_h)object).ar[n8])) continue;
                            arrayList.add(((rs.p_a.C_h)object).ar[n8]);
                        }
                        for (n8 = 0; n8 < arrayList.size(); ++n8) {
                            this.a("[" + n8 + "] = " + String.valueOf(arrayList.get(n8)), 0, "");
                            System.out.print(String.valueOf(arrayList.get(n8)) + ", ");
                        }
                    } else {
                        this.a("Can't find item model! ", 0, "");
                    }
                }
            }
            if (string.startsWith("::m2colors")) {
                int n9 = Integer.valueOf(string.split(" ")[1]);
                rs.p_d.C_k c_k = rs.p_d.C_k.f(n9);
                if (c_k == null) {
                    this.a("Can't find item definition!", 0, "");
                } else {
                    object = new rs.p_a.C_h(c_k.K);
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    if (object != null && ((rs.p_a.C_h)object).ar != null) {
                        int n10;
                        for (n10 = 0; n10 < ((rs.p_a.C_h)object).ah; ++n10) {
                            if (arrayList.contains(((rs.p_a.C_h)object).ar[n10])) continue;
                            arrayList.add(((rs.p_a.C_h)object).ar[n10]);
                        }
                        for (n10 = 0; n10 < arrayList.size(); ++n10) {
                            this.a("[" + n10 + "] = " + String.valueOf(arrayList.get(n10)), 0, "");
                            System.out.print(String.valueOf(arrayList.get(n10)) + ", ");
                        }
                    } else {
                        this.a("Can't find item model! ", 0, "");
                    }
                }
            }
            if (string.equals("::map") && rs.p_l.C_j.b(cT)) {
                C_r.a(true);
            }
            if (string.equals("::dumpitems") && rs.p_l.C_j.b(cT)) {
                this.a(false);
            }
            if (string.startsWith("::selectdump") && rs.p_l.C_j.b(cT)) {
                int n11 = Integer.parseInt(string.split(" ")[1]);
                this.a(n11);
            }
            if (string.equals("::lag") && rs.p_l.C_j.b(cT)) {
                this.bB();
            }
        }
        if (string.equals("::clienthide") && rs.p_l.C_j.b(cT)) {
            C_Client_mc.eR.bm = false;
        }
        if (string.equals("::clientshow") && rs.p_l.C_j.b(cT)) {
            C_Client_mc.eR.bm = true;
        }
        if (string.equals("::coordson")) {
            rs.p_f.C_a.ao = true;
        }
        if (string.equals("::coordsoff")) {
            rs.p_f.C_a.ao = false;
        }
        if (string.equals("::dataon")) {
            rs.p_f.C_a.am = true;
        }
        if (string.equals("::dataoff")) {
            rs.p_f.C_a.am = false;
        }
        if (string.equals("::teletoggle") && rs.p_l.C_j.c(cT)) {
            rs.p_f.C_a.t = !rs.p_f.C_a.t;
            this.a("<img=6> You've " + (rs.p_f.C_a.t ? "enabled" : "disabled") + " this option!", 0, null);
            rs.p_f.C_a.d();
        }
        if (string.equals("::damage_test prepare")) {
            for (String string6 : stringArray = new String[]{"::infspec", "::boost", "::tank"}) {
                fv.a(103);
                fv.b(string6.length() - 1);
                fv.a(string6.substring(2));
            }
        }
        if (string.equals("::fps")) {
            rs.p_f.C_a.bm = !rs.p_f.C_a.bm;
            this.a("<img=163> You've " + (rs.p_f.C_a.bm ? "enabled" : "disabled") + " FPS display! Re-enter the command @blu@::fps@bla@ again to toggle.", 0, null);
        }
        if (string.equals("::ping") && rs.p_l.C_j.b(cT)) {
            rs.p_f.C_a.bn = !rs.p_f.C_a.bn;
            this.a("<img=163> You've " + (rs.p_f.C_a.bn ? "enabled" : "disabled") + " ping display! Re-enter the command @blu@::ping@bla@ again to toggle.", 0, null);
        }
        if (string.toLowerCase().startsWith("::displayicon") && rs.p_l.C_j.b(cT)) {
            try {
                int n;
                rs.p_f.C_a.bf = n = Integer.parseInt(string.split(" ")[1]);
                this.a("<img=163> You have set displayed icon to: @blu@" + n, 0, null);
                C_ai.h();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (string.equals("::showbh")) {
            rs.p_f.C_a.bo = true;
            this.a("<img=163> You've enabled BH display! Re-enter the command @blu@::hidebh@bla@ to hide it.", 0, null);
        }
        if (string.equals("::hidebh")) {
            rs.p_f.C_a.bo = false;
            this.a("<img=163> You've disabled BH display! Re-enter the command @blu@::showbh@bla@ to show it again.", 0, null);
        }
        if (string.equalsIgnoreCase("::gsdecor")) {
            rs.p_f.C_a.aV = !rs.p_f.C_a.aV;
            this.a("<img=163> You've " + (!rs.p_f.C_a.aV ? "@blu@enabled@bla@" : "@red@disabled@bla@") + " godsword special scroll decorations!", 0, null);
        }
        if (string.equalsIgnoreCase("::bots")) {
            rs.p_f.C_a.bp = !rs.p_f.C_a.bp;
            this.a("<img=163> You've " + (rs.p_f.C_a.bp ? "enabled" : "disabled") + " bots! Re-enter the command @blu@::bots@bla@ again to toggle.", 0, null);
        }
        if (string.toLowerCase().startsWith("::setdrag")) {
            try {
                int n;
                rs.p_f.C_a.bd = n = Integer.parseInt(string.split(" ")[1]);
                this.a("<img=163> You have set item dragging to: @blu@" + n, 0, null);
                C_ai.h();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (string.toLowerCase().startsWith("::setswitch")) {
            try {
                if (rs.p_f.C_a.aE) {
                    this.a("<img=25> This value is set to @blu@0@bla@ by default with 07 ticks enabled!", 0, null);
                } else {
                    int n = Integer.parseInt(string.split(" ")[1]);
                    if (n < 0) {
                        n = 0;
                    }
                    if (n > 500) {
                        n = 500;
                    }
                    ic = n;
                    this.a("<img=163> You have set item switching to: @blu@" + n, 0, null);
                    C_ai.h();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (string.equals("::console")) {
            rs.p_f.C_a.aM = !rs.p_f.C_a.aM;
            this.a("<img=163> Developer console is now: " + (rs.p_f.C_a.aM ? "@blu@ON" : "@red@OFF"), 0, null);
            rs.p_f.C_a.d();
        }
        if (string.equals("::noclip") && rs.p_l.C_j.b(cT)) {
            for (int i = 0; i < 4; ++i) {
                for (int j = 1; j < 103; ++j) {
                    for (int k = 1; k < 103; ++k) {
                        this.fP[i].a[j][k] = 0;
                    }
                }
            }
        }
        if (string.equals("::walktest") && rs.p_l.C_j.b(cT)) {
            boolean bl = this.a(0, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, 67, C_Client_mc.eR.k[0], true, 16);
        }
        if (string.equals("::testregion") && rs.p_l.C_j.b(cT)) {
            int[] nArray;
            int n = 0;
            for (int n12 : nArray = new int[]{16170}) {
                long l2 = System.currentTimeMillis();
                this.c(n12);
                rs.C_e.b();
                rs.C_e.a();
                long l3 = System.currentTimeMillis() - l2;
                System.out.println("Progress: " + ++n + "/" + nArray.length + " (" + l3 + " ms)");
            }
        }
        if (string.startsWith("::setitem") && rs.p_l.C_j.b(cT)) {
            String string7 = string.substring(10);
            if (string7.equalsIgnoreCase("-1")) {
                ba = false;
            } else {
                ba = true;
                bb = Integer.parseInt(string7);
                fb = true;
                rs.p_d.C_k c_k = rs.p_d.C_k.f(bb);
                bd = c_k.Z;
                be = c_k.G;
                bc = c_k.M;
                bf = c_k.v;
                bg = c_k.W;
            }
        }
    }

    public void a(rs.p_n.C_e c_e) {
        int n = c_e.J;
        if (n >= 1 && n <= 100 || n >= 701 && n <= 800) {
            if (n == 1 && this.kB == 0) {
                c_e.at = "Loading friend list";
                c_e.M = 0;
                return;
            }
            if (n == 1 && this.kB == 1) {
                c_e.at = "Connecting to friendserver";
                c_e.M = 0;
                return;
            }
            if (n == 2 && this.kB != 2) {
                c_e.at = "Please wait...";
                c_e.M = 0;
                return;
            }
            int n2 = this.kA;
            if (this.kB != 2) {
                n2 = 0;
            }
            n = n > 700 ? (n -= 601) : --n;
            if (n >= n2) {
                c_e.at = "";
                c_e.M = 0;
                return;
            }
            c_e.at = this.mT[n];
            c_e.M = 1;
            return;
        }
        if (n >= 101 && n <= 200 || n >= 801 && n <= 900) {
            int n3 = this.kA;
            if (this.kB != 2) {
                n3 = 0;
            }
            n = n > 800 ? (n -= 701) : (n -= 101);
            if (n >= n3) {
                c_e.at = "";
                c_e.M = 0;
                return;
            }
            if (this.jG[n] == 0) {
                c_e.at = "@red@Offline";
            } else if (this.jG[n] == 10) {
                c_e.at = "@gre@Online";
            } else if (this.jG[n] == 11) {
                c_e.at = "<img=203> @yel@AFK";
            }
            c_e.M = 1;
            return;
        }
        if (n == 203) {
            int n4 = this.kA;
            if (this.kB != 2) {
                n4 = 0;
            }
            c_e.aH = n4 * 15 + 20;
            if (c_e.aH <= c_e.aR) {
                c_e.aH = c_e.aR + 1;
            }
            return;
        }
        if (n >= 401 && n <= 500) {
            if ((n -= 401) == 0 && this.kB == 0) {
                c_e.at = "Loading ignore list";
                c_e.M = 0;
                return;
            }
            if (n == 1 && this.kB == 0) {
                c_e.at = "Please wait...";
                c_e.M = 0;
                return;
            }
            int n5 = this.jD;
            if (this.kB == 0) {
                n5 = 0;
            }
            if (n >= n5) {
                c_e.at = "";
                c_e.M = 0;
                return;
            }
            c_e.at = C_O_uc.c(C_O_uc.a(this.kP[n]));
            c_e.M = 1;
            return;
        }
        if (n == 503) {
            c_e.aH = this.jD * 15 + 20;
            if (c_e.aH <= c_e.aR) {
                c_e.aH = c_e.aR + 1;
            }
            return;
        }
        if (n == 327) {
            c_e.aU = 150;
            c_e.aV = (int)(Math.sin((double)ff / 40.0) * 256.0) & 0x7FF;
            if (this.md) {
                int n6;
                int n7;
                for (int i = 0; i < 7; ++i) {
                    n7 = this.mu[i];
                    if (n7 < 0 || rs.p_d.C_j.b[n7].a()) continue;
                    return;
                }
                this.md = false;
                rs.p_a.C_h[] c_hArray = new rs.p_a.C_h[7];
                n7 = 0;
                for (int i = 0; i < 7; ++i) {
                    n6 = this.mu[i];
                    if (n6 < 0) continue;
                    c_hArray[n7++] = rs.p_d.C_j.b[n6].b();
                    int n8 = n7 - 1;
                    if (c_hArray[n8] == null) continue;
                    for (int[] nArray : dV) {
                        if (dU[4][this.lB[4]] != nArray[0]) continue;
                        c_hArray[n8].e(4550, nArray[1]);
                    }
                }
                rs.p_a.C_h c_h = new rs.p_a.C_h(n7, c_hArray);
                for (n6 = 0; n6 < 5; ++n6) {
                    if (this.lB[n6] == 0) continue;
                    if (dU[4][this.lB[4]] == 10 || dU[4][this.lB[4]] == 491769) {
                        c_h.b(new int[]{4550}, -50);
                    }
                    c_h.i(dU[n6][0], dU[n6][this.lB[n6]]);
                    if (n6 != 1) continue;
                    c_h.i(fz[0], fz[this.lB[n6]]);
                }
                c_h.n();
                c_h.f(rs.p_d.C_a.a[C_Client_mc.eR.t].e[0], C_Client_mc.eR.t);
                c_h.b(64, 850, -30, -50, -30, true);
                c_e.ae = 5;
                c_e.af = 0;
                rs.p_n.C_e.a(this.lD, c_h);
            }
            return;
        }
        if (n == 328) {
            int n9 = 150;
            int n10 = (int)(Math.sin((double)ff / 40.0) * 256.0) & 0x7FF;
            c_e.aU = n9;
            c_e.aV = n10;
            if (this.md) {
                int n11;
                rs.p_a.C_h c_h = eR.m();
                for (n11 = 0; n11 < 5; ++n11) {
                    if (this.lB[n11] == 0) continue;
                    c_h.i(dU[n11][0], dU[n11][this.lB[n11]]);
                    if (n11 != 1) continue;
                    c_h.i(fz[0], fz[this.lB[n11]]);
                }
                n11 = eR.p();
                if (c_h == null) {
                    return;
                }
                c_h.n();
                c_h.f(rs.p_d.C_a.a[n11].e[0], n11);
                c_e.ae = 5;
                c_e.af = 0;
                rs.p_n.C_e.a(this.lD, c_h);
            }
        }
        if (n == 324) {
            if (this.kT == null) {
                this.kT = c_e.E;
                this.kU = c_e.aG;
            }
            if (this.ml) {
                c_e.E = this.kU;
                return;
            }
            c_e.E = this.kT;
            return;
        }
        if (n == 325) {
            if (this.kT == null) {
                this.kT = c_e.E;
                this.kU = c_e.aG;
            }
            if (this.ml) {
                c_e.E = this.kT;
                return;
            }
            c_e.E = this.kU;
            return;
        }
        if (n == 600) {
            c_e.at = this.kr;
            if (ff % 20 < 10) {
                c_e.at = c_e.at + "|";
                return;
            }
            c_e.at = c_e.at + " ";
            return;
        }
        if (n == 613) {
            if (cT == 1 || cT == 2) {
                if (this.nz) {
                    c_e.ad = 0xFF0000;
                    c_e.at = "Moderator option: Mute player for 48 hours: <ON>";
                } else {
                    c_e.ad = 0xFFFFFF;
                    c_e.at = "Moderator option: Mute player for 48 hours: <OFF>";
                }
            } else {
                c_e.at = "";
            }
        }
        if (n == 650 || n == 655) {
            if (this.nR != 0) {
                Object object = this.lM == 0 ? "earlier today" : (this.lM == 1 ? "yesterday" : this.lM + " days ago");
                c_e.at = "You last logged in " + (String)object + " from: " + rs.p_v.C_a.i;
            } else {
                c_e.at = "";
            }
        }
        if (n == 651) {
            if (this.nx == 0) {
                c_e.at = "0 unread messages";
                c_e.ad = 0xFFFF00;
            }
            if (this.nx == 1) {
                c_e.at = "1 unread message";
                c_e.ad = 65280;
            }
            if (this.nx > 1) {
                c_e.at = this.nx + " unread messages";
                c_e.ad = 65280;
            }
        }
        if (n == 652) {
            if (this.nC == 201) {
                c_e.at = this.nf == 1 ? "@yel@This is a non-members world: @whi@Since you are a member we" : "";
            } else if (this.nC == 200) {
                c_e.at = "You have not yet set any password recovery questions.";
            } else {
                Object object = this.nC == 0 ? "Earlier today" : (this.nC == 1 ? "Yesterday" : this.nC + " days ago");
                c_e.at = (String)object + " you changed your recovery questions";
            }
        }
        if (n == 653) {
            c_e.at = this.nC == 201 ? (this.nf == 1 ? "@whi@recommend you use a members world instead. You may use" : "") : (this.nC == 200 ? "We strongly recommend you do so now to secure your account." : "If you do not remember making this change then cancel it immediately");
        }
        if (n == 654) {
            if (this.nC == 201) {
                if (this.nf == 1) {
                    c_e.at = "@whi@this world but member benefits are unavailable whilst here.";
                    return;
                }
                c_e.at = "";
                return;
            }
            if (this.nC == 200) {
                c_e.at = "Do this from the 'account management' area on our front webpage";
                return;
            }
            c_e.at = "Do this from the 'account management' area on our front webpage";
        }
    }

    public void D() {
        int n;
        int n2;
        if (this.eN == 0L && this.nS == 0) {
            if (rs.p_f.C_a.aA && this.co != null && !this.co.equals("")) {
                int n3 = rs.p_f.C_a.ai == C_a.c.a ? 0 : ah - 499;
                this.gm.b("<img=2> <col=FE610C>[Broadcast]:</col> " + this.co, 4, 329 + n3, 0xFFFFFF, 0);
            }
            return;
        }
        int n4 = C_Client_mc.ai() ? 0 : 4;
        int n5 = n2 = C_Client_mc.ai() ? 0 : -4;
        if (this.v.h() && !this.f()) {
            n2 -= 135;
        }
        rs.p_l.C_K_uc c_K_uc = this.gi;
        int n6 = 0;
        if (this.eN != 0L || rs.p_f.C_a.aA && this.co != null && !this.co.equals("")) {
            int n7 = n = rs.p_f.C_a.ai == C_a.c.a ? 0 : ah - 499;
            if (this.eN == 0L) {
                this.gm.b("<img=2> <col=FE610C>[Broadcast]:</col> " + this.co, 4 + n4, 329 + n - n2, 0xFFFFFF, 0);
            }
            n6 = 1;
        }
        for (n = 0; n < 200; ++n) {
            int n8;
            if (this.dC[n] == null) continue;
            int n9 = this.dz[n];
            String string = this.dB[n];
            int n10 = this.dA[n];
            int n11 = 170;
            int n12 = rs.p_l.C_j.a(string, n10);
            if ((n9 == 3 || n9 == 7) && (n9 == 7 || this.cE == 0 || this.cE == 1 && this.i(string))) {
                n8 = 329 - n6 * 13;
                if (rs.p_f.C_a.ai != C_a.c.a) {
                    n8 = ah - n11 - n6 * 13;
                }
                int n13 = 4 + n4;
                this.gm.b("From", n13, n8 -= n2, n12, 0);
                n13 += c_K_uc.a("From ");
                if (n10 >= 1 && n10 < fE.length) {
                    int n14 = 0;
                    if (rs.p_l.C_h.b(n10) == 94) {
                        n14 = -1;
                    }
                    if (rs.p_l.C_j.b.w_(n10)) {
                        n13 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(n10)).h();
                    }
                    fE[rs.p_l.C_h.b(n10)].f(n13 + n14, n8 - 12);
                    n13 += 14;
                    if (rs.p_l.C_j.b.w_(n10)) {
                        n13 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(n10)).j();
                    }
                }
                this.gm.b(string + ": " + this.dC[n], n13, n8, n12, 0);
                if (++n6 >= 5) {
                    return;
                }
            }
            if (n9 == 5 && this.cE < 2) {
                n8 = 329 - n6 * 13;
                if (rs.p_f.C_a.ai != C_a.c.a) {
                    n8 = ah - n11 - n6 * 13;
                }
                c_K_uc.b(0, this.dC[n], n8 -= n2, 4 + n4);
                c_K_uc.b(65535, this.dC[n], n8 - 1, 4 + n4);
                if (++n6 >= 5) {
                    return;
                }
            }
            if (n9 != 6 || this.cE >= 2) continue;
            n8 = 329 - n6 * 13;
            if (rs.p_f.C_a.ai != C_a.c.a) {
                n8 = ah - n11 - n6 * 13;
            }
            c_K_uc.b(0, "To " + string + ": " + this.dC[n], n8 -= n2, 4 + n4);
            c_K_uc.b(65535, "To " + string + ": " + this.dC[n], n8 - 1, 4 + n4);
            if (++n6 < 5) continue;
            return;
        }
    }

    public void a(String string, int n, String string2) {
        int n2;
        String string3 = string;
        string = this.ix.a(this.iw.a(string));
        if (n == 0 && this.en != -1) {
            this.cD = string;
            this.hU = 0;
        }
        if (this.gp == -1) {
            fM = true;
        }
        n = rs.p_i.C_a.a(string, n);
        string = rs.p_i.C_a.b(string, n);
        boolean bl = rs.p_i.C_a.c(string, n);
        C_ChatMessage_mc c_ChatMessage_mc = new C_ChatMessage_mc();
        c_ChatMessage_mc.setMessage(string);
        this.p.post(c_ChatMessage_mc);
        for (n2 = 199; n2 > 0; --n2) {
            this.dA[n2] = this.dA[n2 - 1];
            this.dz[n2] = this.dz[n2 - 1];
            this.dB[n2] = this.dB[n2 - 1];
            this.dC[n2] = this.dC[n2 - 1];
            this.dD[n2] = this.dD[n2 - 1];
        }
        n2 = 0;
        for (int i = 0; i <= fE.length; ++i) {
            if (string2 == null || !string2.startsWith("@cr" + i + "@")) continue;
            int n3 = 5;
            if (i >= 10 && i <= 99) {
                n3 = 6;
            }
            if (i >= 100) {
                n3 = 7;
            }
            string2 = string2.substring(n3);
            n2 = i;
        }
        if (n == 7) {
            this.p.post(new C_PrivateChatMessage_mc(string2, string));
        }
        string2 = rs.p_l.C_h.d(string2);
        string = this.ix.b(this.iw.b(rs.p_l.C_h.d(rs.p_i.C_a.b(string3, n))));
        this.dA[0] = n2;
        this.dz[0] = n;
        this.dB[0] = string2;
        this.dC[0] = string;
        this.dD[0] = bl;
    }

    public boolean E() {
        int n;
        boolean bl = false;
        boolean bl2 = false;
        int n2 = rs.p_f.C_a.ai == C_a.c.a ? 0 : ai - 772;
        int n3 = n = rs.p_f.C_a.ai == C_a.c.a ? 0 : ah - 505;
        if (this.hU == 1) {
            if (rs.p_f.C_a.ai == C_a.c.a || rs.p_f.C_a.ai != C_a.c.a && !bl) {
                for (int i = 0; i < this.iU.length; ++i) {
                    if (rs.C_C_uc.hP < this.iV[i] + n2 || rs.C_C_uc.hP > this.iV[i] + this.iU[i] + n2 || rs.C_C_uc.hQ < this.iW[i] + n || rs.C_C_uc.hQ >= this.iW[i] + 37 + n || eT[i] == -1) continue;
                    fL = i;
                    eM = true;
                    return true;
                }
            } else if (bl && ai < 1000) {
                if (this.hV >= ai - 226 && this.hV <= ai - 195 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[0] != -1) {
                    bl2 = fL == 0 ? !bl2 : true;
                    fL = 0;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 194 && this.hV <= ai - 163 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[1] != -1) {
                    bl2 = fL == 1 ? !bl2 : true;
                    fL = 1;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 162 && this.hV <= ai - 131 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[2] != -1) {
                    bl2 = fL == 2 ? !bl2 : true;
                    fL = 2;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 129 && this.hV <= ai - 98 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[3] != -1) {
                    bl2 = fL == 3 ? !bl2 : true;
                    fL = 3;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 97 && this.hV <= ai - 66 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[4] != -1) {
                    bl2 = fL == 4 ? !bl2 : true;
                    fL = 4;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 65 && this.hV <= ai - 34 && this.hW >= ah - 72 && this.hW < ah - 40 && eT[5] != -1) {
                    bl2 = fL == 5 ? !bl2 : true;
                    fL = 5;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 33 && this.hV <= ai && this.hW >= ah - 72 && this.hW < ah - 40 && eT[6] != -1) {
                    bl2 = fL == 6 ? !bl2 : true;
                    fL = 6;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 194 && this.hV <= ai - 163 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[8] != -1) {
                    bl2 = fL == 8 ? !bl2 : true;
                    fL = 8;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 162 && this.hV <= ai - 131 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[9] != -1) {
                    bl2 = fL == 9 ? !bl2 : true;
                    fL = 9;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 129 && this.hV <= ai - 98 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[10] != -1) {
                    bl2 = fL == 7 ? !bl2 : true;
                    fL = 7;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 97 && this.hV <= ai - 66 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[11] != -1) {
                    bl2 = fL == 11 ? !bl2 : true;
                    fL = 11;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 65 && this.hV <= ai - 34 && this.hW >= ah - 37 && this.hW < ah - 0 && eT[12] != -1) {
                    bl2 = fL == 12 ? !bl2 : true;
                    fL = 12;
                    eM = true;
                    return true;
                }
                if (this.hV >= ai - 33 && this.hV <= ai && this.hW >= ah - 37 && this.hW < ah - 0 && eT[13] != -1) {
                    bl2 = fL == 13 ? !bl2 : true;
                    fL = 13;
                    eM = true;
                    return true;
                }
            } else if (bl && ai >= 1000 && rs.C_C_uc.hQ >= ah - 37 && rs.C_C_uc.hQ <= ah) {
                if (rs.C_C_uc.hP >= ai - 417 && rs.C_C_uc.hP <= ai - 386) {
                    bl2 = fL == 0 ? !bl2 : true;
                    fL = 0;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 385 && rs.C_C_uc.hP <= ai - 354) {
                    bl2 = fL == 1 ? !bl2 : true;
                    fL = 1;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 353 && rs.C_C_uc.hP <= ai - 322) {
                    bl2 = fL == 2 ? !bl2 : true;
                    fL = 2;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 321 && rs.C_C_uc.hP <= ai - 290) {
                    bl2 = fL == 3 ? !bl2 : true;
                    fL = 3;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 289 && rs.C_C_uc.hP <= ai - 258) {
                    bl2 = fL == 4 ? !bl2 : true;
                    fL = 4;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 257 && rs.C_C_uc.hP <= ai - 226) {
                    bl2 = fL == 5 ? !bl2 : true;
                    fL = 5;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 225 && rs.C_C_uc.hP <= ai - 194) {
                    bl2 = fL == 6 ? !bl2 : true;
                    fL = 6;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 193 && rs.C_C_uc.hP <= ai - 163) {
                    bl2 = fL == 8 ? !bl2 : true;
                    fL = 8;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 162 && rs.C_C_uc.hP <= ai - 131) {
                    bl2 = fL == 9 ? !bl2 : true;
                    fL = 9;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 130 && rs.C_C_uc.hP <= ai - 99) {
                    bl2 = fL == 7 ? !bl2 : true;
                    fL = 7;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 98 && rs.C_C_uc.hP <= ai - 67) {
                    bl2 = fL == 11 ? !bl2 : true;
                    fL = 11;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 66 && rs.C_C_uc.hP <= ai - 45) {
                    bl2 = fL == 12 ? !bl2 : true;
                    fL = 12;
                    eM = true;
                    return true;
                }
                if (rs.C_C_uc.hP >= ai - 31 && rs.C_C_uc.hP <= ai) {
                    bl2 = fL == 13 ? !bl2 : true;
                    fL = 13;
                    eM = true;
                    return true;
                }
            }
        }
        return false;
    }

    public void F() {
        this.bL();
        this.ha = null;
        this.gZ = null;
        this.gZ = new C_C_uc(765, 503, this.B());
        this.ga = true;
    }

    private String bC() {
        if (rs.p_v.C_a.h != null) {
            return rs.p_v.C_a.h.getDocumentBase().getHost().toLowerCase();
        }
        if (this.hH != null) {
            return "runescape.com";
        }
        return null;
    }

    private void b(C_F_uc c_F_uc, int n, int n2) {
        int n3 = n2 * n2 + n * n;
        if (n3 > 4225 && this.jZ == 2) {
            if (n <= -45) {
                n = -45;
            }
            if (n >= 45) {
                n = 45;
            }
            if (n2 <= -45) {
                n2 = -45;
            }
            if (n2 >= 45) {
                n2 = 45;
            }
            this.a(this.lK, n2, n);
            return;
        }
        if (n3 <= 4225 || n3 >= 90000) {
            this.a(c_F_uc, n2, n);
        }
    }

    public boolean b(int n, int n2, int n3, int n4) {
        return rs.C_C_uc.hP >= n && rs.C_C_uc.hP <= n3 && rs.C_C_uc.hQ >= n2 && rs.C_C_uc.hQ <= n4;
    }

    public boolean d(int n, int n2) {
        int n3 = 175;
        if (this.v != null && this.v.h() && !this.f()) {
            n3 = 29;
        }
        return n > 0 && n < 519 && n2 > ah - n3 && n2 < ah;
    }

    public static String a(double d2) {
        return NumberFormat.getInstance().format(d2);
    }

    public boolean G() {
        boolean bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = true;
        if (this.b(ai - (ai <= 1000 ? 240 : 420), ah - (ai <= 1000 ? 90 : 37), ai, ah)) {
            return false;
        }
        if (rs.p_l.p_e.C_q.a) {
            return false;
        }
        if (rs.p_f.C_a.ai == C_a.c.b ? (ah <= 649 ? hQ >= 192 && hQ <= 211 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23 : hQ >= 281 && hQ <= 301 && hP >= ai - 23 && hP <= ai - 6) : hQ >= 141 && hQ <= 161 && hP >= 721 && hP <= 736) {
            return false;
        }
        if (rs.p_f.C_a.ai == C_a.c.b ? hP >= ai - 119 && hP <= ai - 96 && hQ >= 166 && hQ <= 188 : hP >= 718 && hP <= 744 && hQ >= 57 && hQ <= 79) {
            return false;
        }
        if (rs.p_f.C_a.ai == C_a.c.b ? hP >= ai - 86 && hP <= ai - 62 && hQ >= 172 && hQ <= 198 : hP >= 710 && hP <= 733 && hQ >= 22 && hQ <= 48) {
            return false;
        }
        if (rs.p_f.C_a.ai == C_a.c.b ? hQ >= 219 && hQ <= 238 && hP >= ai - 23 && hP <= ai - 6 : hQ >= 89 && hQ <= 107 && hP >= 744 && hP <= 759) {
            return false;
        }
        if (this.v.h) {
            return false;
        }
        if (rs.p_f.C_a.ai == C_a.c.b ? (ah <= 670 ? hQ >= 166 && hQ <= 182 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23 : hQ >= 313 && hQ <= 333 && hP >= ai - 23 && hP <= ai - 6) : hQ >= 116 && hQ <= 134 && hP >= 744 && hP <= 759) {
            return false;
        }
        if (rs.p_f.C_a.ai == C_a.c.b ? (ah <= 609 ? hQ >= 219 && hQ <= 238 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23 : hQ >= 250 && hQ <= 269 && hP >= ai - 23 && hP <= ai - 6) : hQ >= 141 && hQ <= 161 && hP >= 744 && hP <= 759) {
            return false;
        }
        if (this.d(rs.C_C_uc.hP, rs.C_C_uc.hQ)) {
            return false;
        }
        if (rs.p_f.C_a.ai == C_a.c.b && hQ >= 75 && hQ <= 107 && hP >= ai - 192 - 20 && hP <= ai - 133 - 20) {
            return false;
        }
        if (this.b(ai - 190, 0, ai, rs.p_f.C_a.ai == C_a.c.b ? 163 : 172)) {
            return false;
        }
        if (hQ >= 186 && hQ <= 205 && hP >= ai - 23 && hP <= ai - 6) {
            return false;
        }
        if (bl4 && (rs.C_C_uc.hP >= ai - 420 && rs.C_C_uc.hP <= ai && rs.C_C_uc.hQ >= ah - 37 && rs.C_C_uc.hQ <= ah || rs.C_C_uc.hP > ai - 242 && rs.C_C_uc.hP < ai && rs.C_C_uc.hQ > ah - 335 && rs.C_C_uc.hQ < ah)) {
            return false;
        }
        if (!bl3) {
            if (rs.C_C_uc.hP > 0 && rs.C_C_uc.hQ > 0 && rs.C_C_uc.hQ < ai && rs.C_C_uc.hQ < ah) {
                return rs.C_C_uc.hP < ai - 242 || rs.C_C_uc.hQ < ah - 335;
            }
            return false;
        }
        return true;
    }

    public void H() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.eA != 0) {
            return;
        }
        int n8 = rs.p_f.C_a.ai == C_a.c.a ? 0 : ah - 505;
        int n9 = rs.p_f.C_a.ai == C_a.c.a ? 0 : ai - 765;
        this.iB = false;
        this.fx[0] = "Cancel";
        this.eI[0] = 1107;
        this.eV = 1;
        if (!rs.p_l.p_b.C_a.b()) {
            this.bN();
            n7 = ah - 545;
            if (rs.p_f.C_a.ai == C_a.c.a) {
                n7 = 0;
            }
            if (rs.C_C_uc.hP > 4 && rs.C_C_uc.hQ > 480 + n7 && rs.C_C_uc.hP < 516 && rs.C_C_uc.hQ < ah) {
                this.W();
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (hQ >= 75 && hQ <= 107 && hP >= ai - 192 - 20 && hP <= ai - 133 - 20) {
                    this.fx[2] = this.cp ? "Turn prayers off" : "Turn quick prayers on";
                    this.eI[2] = 1500;
                    this.eV = 2;
                    this.fx[1] = "Select quick prayers";
                    this.eI[1] = 1506;
                    this.eV = 3;
                }
            } else if (hQ >= 75 && hQ <= 107 && hP >= 518 && hP <= 575) {
                this.fx[2] = this.cp ? "Turn prayers off" : "Turn quick prayers on";
                this.eI[2] = 1500;
                this.eV = 2;
                this.fx[1] = "Select quick prayers";
                this.eI[1] = 1506;
                this.eV = 3;
            }
            if (rs.C_C_uc.hP >= this.iV[6] + n9 && rs.C_C_uc.hP <= this.iV[6] + this.iU[6] + n9 && rs.C_C_uc.hQ >= this.iW[6] + n8 && rs.C_C_uc.hQ < this.iW[6] + 37 + n8) {
                this.fx[2] = "Magic tab";
                this.eI[2] = 4246;
                this.eV = 2;
                this.fx[1] = (C_ap.d ? "Disable" : "Enable") + " spell filtering";
                this.eI[1] = 4245;
                this.eV = 3;
            }
        }
        br = 0;
        if (!rs.p_l.p_b.C_a.b() && rs.C_C_uc.hP >= 515 && rs.C_C_uc.hQ >= 0 && rs.C_C_uc.hP <= 765 && rs.C_C_uc.hQ <= 167 && cH != -1) {
            this.a(cq, rs.p_n.C_e.H[cH], rs.C_C_uc.hP, cr, rs.C_C_uc.hQ, C_Client_mc.ai() ? 0 : -4);
        }
        if (this.ks != this.ef) {
            this.ef = this.ks;
        }
        this.ks = 0;
        if (rs.p_l.p_b.C_a.b()) {
            if (cH != -1) {
                if (C_Client_mc.aj()) {
                    this.a(0, rs.p_n.C_e.H[cH], rs.C_C_uc.hP, 0, rs.C_C_uc.hQ, C_Client_mc.ai() ? 0 : -4);
                } else {
                    this.a(ai / 2 - 356, rs.p_n.C_e.H[cH], rs.C_C_uc.hP, ah / 2 - 255, rs.C_C_uc.hQ, 0);
                }
            }
        } else if (C_Client_mc.aj()) {
            if (!(rs.p_l.p_e.C_q.a && cH == -1 || rs.C_C_uc.hP <= 0 || rs.C_C_uc.hQ <= 0 || rs.C_C_uc.hP >= 516 || rs.C_C_uc.hQ >= ak + 4)) {
                if (cH != -1) {
                    this.a(cq, rs.p_n.C_e.H[cH], rs.C_C_uc.hP, cr, rs.C_C_uc.hQ, C_Client_mc.ai() ? 0 : -4);
                } else {
                    this.z();
                }
            }
        } else if (this.G()) {
            n7 = ai / 2 - 356;
            n6 = ah / 2 - 230;
            n5 = ai / 2 + 356;
            n4 = ah / 2 + 230;
            if (cH > 0) {
                rs.p_n.C_e c_e = rs.p_n.C_e.H[cH];
                n3 = Math.max(356, c_e.P);
                int n10 = Math.max(230, c_e.aR);
                n2 = c_e.C != Integer.MAX_VALUE ? c_e.C : ai / 2 - 356;
                int n11 = c_e.D != Integer.MAX_VALUE ? c_e.D : ah / 2 - 230;
                n7 = n2;
                n6 = n11;
                n5 = n2 + n3;
                n4 = n11 + n10;
            }
            if (rs.C_C_uc.hP > n7 && rs.C_C_uc.hQ > n6 && rs.C_C_uc.hP < n5 && rs.C_C_uc.hQ < n4 && cH != -1) {
                this.a(n7, rs.p_n.C_e.H[cH], rs.C_C_uc.hP, n6, rs.C_C_uc.hQ, 0);
            } else {
                this.z();
            }
        }
        if (this.ks != this.ef) {
            this.ef = this.ks;
        }
        this.ks = 0;
        n7 = 548;
        n6 = 207;
        n5 = 740;
        n4 = 468;
        if (!rs.p_l.p_b.C_a.b()) {
            if (rs.p_f.C_a.ai == C_a.c.a) {
                if (rs.C_C_uc.hP > n7 && rs.C_C_uc.hQ > n6 && rs.C_C_uc.hP < n5 && rs.C_C_uc.hQ < n4) {
                    if (this.fu != -1) {
                        this.a(n7 - (C_Client_mc.ai() ? 0 : 4), rs.p_n.C_e.H[this.fu], rs.C_C_uc.hP, n6, rs.C_C_uc.hQ, C_Client_mc.ai() ? 0 : 0);
                    } else if (eT[fL] != -1) {
                        this.a(n7 - (C_Client_mc.ai() ? 0 : 4), rs.p_n.C_e.H[eT[fL]], rs.C_C_uc.hP, n6, rs.C_C_uc.hQ, C_Client_mc.ai() ? 0 : 0);
                    }
                }
            } else if (rs.C_C_uc.hP > 548 + n9 && rs.C_C_uc.hP < 740 + n9 && rs.C_C_uc.hQ > 207 + n8 && rs.C_C_uc.hQ < 468 + n8) {
                if (this.fu != -1) {
                    this.a(548 + n9, rs.p_n.C_e.H[this.fu], rs.C_C_uc.hP, 207 + n8, rs.C_C_uc.hQ, 0);
                } else if (eT[fL] != -1) {
                    this.a(548 + n9, rs.p_n.C_e.H[eT[fL]], rs.C_C_uc.hP, 207 + n8, rs.C_C_uc.hQ, 0);
                }
            }
        }
        if (this.ks != this.ep) {
            fb = true;
            this.ep = this.ks;
        }
        this.ks = 0;
        if (rs.p_f.C_a.ai == C_a.c.a) {
            n7 = 0;
            n6 = this.f() ? 334 : ak;
            n5 = 490;
            n4 = 459;
            n = 20;
            n3 = 354;
            if (rs.C_C_uc.hP > n7 && rs.C_C_uc.hQ > n6 && rs.C_C_uc.hP < n5 && rs.C_C_uc.hQ < n4) {
                if (this.gp != -1) {
                    this.a(n, rs.p_n.C_e.H[this.gp], rs.C_C_uc.hP, n3, rs.C_C_uc.hQ, C_Client_mc.ai() ? 0 : -4);
                } else if (!rs.p_l.p_b.C_a.b() && rs.C_C_uc.hQ < n4 && rs.C_C_uc.hP < n5) {
                    this.E(rs.C_C_uc.hQ - n6);
                }
            }
        } else {
            int n12 = n = !this.v.h() || this.f() ? 1 : 0;
            if (rs.C_C_uc.hP > 0 && rs.C_C_uc.hQ > ah - 163 && rs.C_C_uc.hP < 490 && rs.C_C_uc.hQ < ah && n != 0) {
                if (this.gp != -1) {
                    this.a(20, rs.p_n.C_e.H[this.gp], rs.C_C_uc.hP, ah - 145, rs.C_C_uc.hQ, 0);
                } else if (!rs.p_l.p_b.C_a.b() && rs.C_C_uc.hQ < ah && rs.C_C_uc.hP < 490) {
                    this.E(rs.C_C_uc.hQ - ah - 166);
                }
            }
        }
        if (this.gp != -1 && this.ks != this.em) {
            fM = true;
            this.em = this.ks;
        }
        if (rs.C_C_uc.hP >= 515 && rs.C_C_uc.hQ >= 0 && rs.C_C_uc.hP <= 765 && rs.C_C_uc.hQ <= 167 && cH != -1) {
            this.a(cq, rs.p_n.C_e.H[cH], rs.C_C_uc.hP, cr, rs.C_C_uc.hQ, C_Client_mc.ai() ? 0 : -4);
        }
        n = 0;
        while (n == 0) {
            n = 1;
            for (n3 = 0; n3 < this.eV - 1; ++n3) {
                if (this.eI[n3] >= 1000 || this.eI[n3 + 1] <= 1000) continue;
                String string = this.fx[n3];
                this.fx[n3] = this.fx[n3 + 1];
                this.fx[n3 + 1] = string;
                n2 = this.eI[n3];
                this.eI[n3] = this.eI[n3 + 1];
                this.eI[n3 + 1] = n2;
                n2 = this.eF[n3];
                this.eF[n3] = this.eF[n3 + 1];
                this.eF[n3 + 1] = n2;
                n2 = this.eG[n3];
                this.eG[n3] = this.eG[n3 + 1];
                this.eG[n3 + 1] = n2;
                n2 = this.eJ[n3];
                this.eJ[n3] = this.eJ[n3 + 1];
                this.eJ[n3 + 1] = n2;
                n2 = this.eH[n3];
                this.eH[n3] = this.eH[n3 + 1];
                this.eH[n3 + 1] = n2;
                n = 0;
            }
        }
    }

    private int i(int n, int n2, int n3) {
        int n4 = 256 - n3;
        return ((n & 0xFF00FF) * n4 + (n2 & 0xFF00FF) * n3 & 0xFF00FF00) + ((n & 0xFF00) * n4 + (n2 & 0xFF00) * n3 & 0xFF0000) >> 8;
    }

    public void a(String string, String string2, boolean bl) {
        rs.p_v.C_a.o = string;
        try {
            int n;
            Object object;
            int n2;
            if (this.fc && !bl) {
                return;
            }
            String string3 = this.fm;
            if (bl) {
                rs.p_l.p_d.C_c.b = false;
                this.G.a("Hello, @yel@" + C_Client_mc.eR.aZ + "@whi@! Apparently, you've DCed..", "Please wait patiently while we attempt to reconnect you..");
            } else {
                if (string.equalsIgnoreCase("") || string2.equalsIgnoreCase("")) {
                    this.G.a("You can't login with a blank username or password!", "Please enter your valid account information and try again!");
                    return;
                }
                if (string2.startsWith(" ")) {
                    this.G.a("You can't login with a password starting with a blank", "space! Please re-type your password and try again!");
                    return;
                }
                this.G.a("Attempting to log you in..", "Please wait..");
            }
            rs.p_l.p_d.C_c.a = true;
            if (!rs.p_f.C_a.d.booleanValue() && this.l.b()) {
                rs.p_l.p_d.C_c.a = false;
                rs.p_l.p_d.C_c.b = true;
                this.G.a(rs.p_f.C_a.A + " has been updated!", "Please re-load your client");
                this.h(true);
                return;
            }
            this.nD = new rs.p_q.C_b(this, this.b(rs.p_f.C_a.b));
            rs.p_l.p_d.C_c.a = false;
            long l2 = C_O_uc.a(string);
            int n3 = (int)(l2 >> 16 & 0x1FL);
            C_Client_mc.fv.h = 0;
            fv.b(14);
            fv.b(n3);
            this.nD.a(2, C_Client_mc.fv.g);
            for (n2 = 0; n2 < 8; ++n2) {
                this.nD.b();
            }
            n2 = this.nD.b();
            rs.p_l.p_d.C_c.b = true;
            int n4 = n2;
            if (n2 == 0) {
                this.nD.a(this.mU.g, 8);
                this.mU.h = 0;
                this.od = this.mU.E();
                object = new int[]{(int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7), (int)(this.od >> 32), (int)this.od};
                C_Client_mc.fv.h = 0;
                fv.b(10);
                fv.g(object[0]);
                fv.g(object[1]);
                fv.g(object[2]);
                fv.g(object[3]);
                fv.g(rs.p_v.C_a.c);
                fv.g(rs.p_f.C_a.c);
                if (rs.p_f.C_a.h.booleanValue() || rs.p_f.C_a.c == 1) {
                    fv.g(rs.p_f.C_a.i);
                }
                if (rs.p_f.C_a.h.booleanValue()) {
                    fv.a(fn);
                }
                fv.a(string);
                fv.a(string2);
                fv.a(rs.p_v.C_a.e() == null ? "null" : rs.p_v.C_a.e());
                fv.a(string3);
                fv.M();
                this.jS.h = 0;
                if (bl) {
                    this.jS.b(18);
                } else {
                    this.jS.b(16);
                }
                this.jS.b(C_Client_mc.fv.h + 36 + 1 + 1 + 2);
                this.jS.b(255);
                this.jS.d(317);
                this.jS.b(li ? 1 : 0);
                for (n = 0; n < 9; ++n) {
                    this.jS.g(this.eE[n]);
                }
                this.jS.a(C_Client_mc.fv.g, C_Client_mc.fv.h, 0);
                C_Client_mc.fv.l = new rs.p_q.C_a((int[])object);
                n = 0;
                while (n < 4) {
                    int n5 = n++;
                    object[n5] = object[n5] + 50;
                }
                this.lJ = new rs.p_q.C_a((int[])object);
                this.nD.a(this.jS.h, this.jS.g);
                n2 = this.nD.b();
            }
            if (n2 == 1) {
                try {
                    Thread.sleep(2000L);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.a(string, string2, bl);
                return;
            }
            if (n2 == 2) {
                cT = this.nD.b();
                nX = this.nD.b() == 1;
                this.I();
                fv.a(185);
                fv.d(912);
                object = rs.p_n.C_e.H[912];
                if (object.X != null && object.X[0][0] == 5 && this.dP[n = object.X[0][1]] != object.I[0]) {
                    this.dP[n] = object.I[0];
                    this.B(n);
                    fb = true;
                }
                this.cc = false;
                this.cd = false;
                this.p(2, rs.p_f.C_a.s);
                this.p(5, rs.p_f.C_a.ap ? 1 : 0);
                this.p(8, rs.p_f.C_a.bu);
                this.p(6, rs.p_f.C_a.aj ? 1 : 0);
                this.p(3, rs.p_f.C_a.ak ? 1 : 0);
                this.p(4, rs.p_f.C_a.al ? 1 : 0);
                this.bI = true;
                this.p(10, rs.p_f.C_a.ax ? 1 : 0);
                this.p(11, rs.p_f.C_a.aw ? 1 : 0);
                this.p(12, rs.p_f.C_a.ay ? 1 : 0);
                this.p(13, rs.p_f.C_a.az ? 1 : 0);
                this.p(14, rs.p_f.C_a.aA ? 1 : 0);
                this.p(15, rs.p_f.C_a.aB ? 1 : 0);
                this.p(16, rs.p_f.C_a.aC ? 1 : 0);
                this.p(17, rs.p_f.C_a.aE ? 1 : 0);
                this.p(18, rs.p_f.C_a.aF ? 1 : 0);
                this.p(19, rs.p_f.C_a.aG ? 1 : 0);
                this.p(20, rs.p_f.C_a.aI ? 1 : 0);
                this.dP[167] = rs.p_f.C_a.s;
                this.p(21, rs.p_f.C_a.aJ ? 1 : 0);
                rs.p_f.C_a.ai = rs.p_f.C_a.ai == C_a.c.b ? C_a.c.a : C_a.c.b;
                this.p(22, rs.p_f.C_a.ai == C_a.c.b ? 0 : 1);
                rs.p_f.C_a.ah = !rs.p_f.C_a.ah;
                this.p(23, rs.p_f.C_a.ah ? 0 : 1);
                this.p(24, rs.p_f.C_a.aO ? 1 : 0);
                this.p(25, rs.p_f.C_a.aP ? 1 : 0);
                this.p(26, rs.p_f.C_a.aQ ? 1 : 0);
                this.p(27, rs.p_f.C_a.aT ? 1 : 0);
                this.p(28, rs.p_f.C_a.aZ ? 1 : 0);
                this.p(29, rs.p_f.C_a.bb ? 1 : 0);
                this.p(30, rs.p_f.C_a.aK ? 1 : 0);
                this.p(31, rs.p_f.C_a.aL ? 1 : 0);
                this.v.d();
                this.l(-1);
                if (rs.p_f.C_a.aE) {
                    this.at = "::oldtickslogin";
                }
                if (rs.p_f.C_a.Q) {
                    ao = "::gpuflagon";
                    if (rs.p_k.C_b.i) {
                        ao = "::stretchflagon";
                    }
                }
                C_ai.h();
                C_af.b(bk);
                if (f) {
                    rs.p_f.C_a.aj = false;
                    this.d();
                    return;
                }
                this.d();
                this.a(rs.p_f.C_a.ai);
                C_Y_uc.m(32001);
                C_ap.j();
                C_ap.i();
                this.cc = true;
                this.h();
                return;
            }
            if (n2 == 3) {
                this.G.a("Invalid username or password!", "Are you sure you typed everything in correctly?");
                return;
            }
            if (n2 == 4) {
                this.G.a("You have been banned.", "Please check the main site for details");
                return;
            }
            if (n2 == 5) {
                this.G.a("Your account is already logged in.", "Try again in 60 seconds..");
                return;
            }
            if (n2 == 6) {
                this.G.a(rs.p_f.C_a.A + " has been updated!", "Please reload your game client.");
                return;
            }
            if (n2 == 7) {
                this.G.a("This world is full.", "Please use a different world");
                return;
            }
            if (n2 == 8) {
                this.G.a("Unable to connect.", "Login server offline.");
                return;
            }
            if (n2 == 9) {
                this.G.a("Login limit exceeded.", "Too many connections from your address.");
                return;
            }
            if (n2 == 10) {
                this.G.a("This account is pending email verification..", "If you don't see the email, check your spam folder!");
                return;
            }
            if (n2 == 11) {
                this.G.a("Login server rejected session.", "Please try again.");
                return;
            }
            if (n2 == 12) {
                this.G.a("This account does not exist!", "Please register at @yel@www.spawnpk.net/register");
                return;
            }
            if (n2 == 13) {
                this.G.a("Could not complete login.", "Please try using a different world.");
                return;
            }
            if (n2 == 14) {
                this.G.a("The server is being updated.", "Please wait 1 minute and try again.");
                return;
            }
            if (n2 == 15) {
                this.fc = true;
                C_Client_mc.fv.h = 0;
                this.mU.h = 0;
                this.lO = -1;
                this.jP = -1;
                this.jQ = -1;
                this.jR = -1;
                this.lN = 0;
                this.lP = 0;
                this.eN = 0L;
                this.eV = 0;
                dj = false;
                this.jE = System.currentTimeMillis();
                return;
            }
            if (n2 == 16) {
                this.G.a("Login attempts exceeded.", "Please wait 1 minute and try again.");
                return;
            }
            if (n2 == 17) {
                this.G.a(rs.p_f.C_a.A + " has been updated!", "Please reload your game client.");
                return;
            }
            if (n2 == 20) {
                this.G.a("Invalid loginserver requested", "Please try using a different world.");
                return;
            }
            if (n2 == 21) {
                for (int i = this.nD.b(); i >= 0; --i) {
                    this.G.a("You have only just left another world", "Your profile will be transferred in: " + i + " seconds");
                    this.h(true);
                    try {
                        Thread.sleep(1000L);
                        continue;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                this.a(string, string2, bl);
                this.fd = false;
                return;
            }
            if (n2 == 22) {
                this.G.a("Your account is temporary locked! Please wait a few mins..", "This is usually for refunds, name changes, etc.");
                return;
            }
            if (n2 == 23) {
                this.G.a("Your username has been changed!", "Please login with your new username..");
                return;
            }
            if (n2 == 24) {
                this.G.a("Invation code is invalid or expired!", "Are you sure you typed it correctly?");
                return;
            }
            if (n2 == 25) {
                this.G.a("You can not login with a VPN connection!", "Please try on a different network..");
                return;
            }
            if (n2 == 26) {
                this.G.a(0);
                return;
            }
            if (n2 == 27) {
                this.G.a(1);
                return;
            }
            if (n2 == 28) {
                this.G.a(2);
                return;
            }
            if (n2 == 29) {
                this.G.a("This name was changed before SPK's Fresh Start.", "Please use the most recent username!");
                return;
            }
            if (n2 == 30) {
                this.G.a("SPK is currently under maintenance..", "Please try again later!");
                return;
            }
            if (n2 == -1) {
                if (n4 == 0) {
                    if (this.el < 2) {
                        try {
                            Thread.sleep(2000L);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        ++this.el;
                        this.a(string, string2, bl);
                        this.fd = false;
                        return;
                    }
                    this.G.a("No response from loginserver", "Please wait 1 minute and try again.");
                    return;
                }
                this.G.a("No response from server", "Please try using a different world.");
                return;
            }
            System.out.println("response:" + n2);
            this.G.a("Unexpected server response", "Please try using a different world.");
            return;
        }
        catch (IOException iOException) {
            this.oC = "";
            iOException.printStackTrace();
            rs.p_l.p_d.C_c.a = false;
            rs.p_l.p_d.C_c.b = true;
            this.G.a("Error connecting to server!", "The server, or your connection, may be offline!");
            return;
        }
    }

    @Override
    void e(int n, int n2) {
        if (!this.ht) {
            return;
        }
        this.nM += n * 3;
        this.nN += n2 << 1;
    }

    public void I() {
        int n;
        this.oe = 0L;
        this.lW = 0;
        this.kp.e = 0;
        this.iK = false;
        this.hJ = true;
        this.lf = true;
        this.fc = true;
        this.z = new rs.p_l.p_f.p_a.p_c.C_d();
        C_e.d().a(this.z);
        if (this.x != null) {
            C_e.d().b(this.x);
        }
        this.x = new rs.p_l.p_f.p_a.p_c.C_c();
        C_e.d().a(this.x);
        C_GameStateChanged_mc c_GameStateChanged_mc = new C_GameStateChanged_mc();
        c_GameStateChanged_mc.setGameState(rs.p_runelite.p_a.C_c.e);
        this.p.post(c_GameStateChanged_mc);
        C_Client_mc.fv.h = 0;
        this.mU.h = 0;
        this.lO = -1;
        this.jP = -1;
        this.jQ = -1;
        this.jR = -1;
        this.lN = 0;
        this.lP = 0;
        this.eN = 0L;
        this.lR = 0;
        this.jZ = 0;
        this.eV = 0;
        dj = false;
        this.hK = 0;
        for (n = 0; n < 200; ++n) {
            this.dC[n] = null;
        }
        this.gr = 0;
        this.eW = 0;
        ee = 0;
        this.ms = 0;
        this.ab();
        this.lV = 0;
        this.dR = -1;
        this.gd = 0;
        this.ge = 0;
        this.ku = 0;
        this.cB = 0;
        for (n = 0; n < this.kt; ++n) {
            C_Client_mc.kw_do[n] = null;
            this.ky[n] = null;
        }
        for (n = 0; n < 16384; ++n) {
            this.cA[n] = null;
        }
        eR = C_Client_mc.kw_do[2047] = new rs.p_a.C_k();
        this.ea.f();
        this.et.f();
        for (n = 0; n < 4; ++n) {
            for (int i = 0; i < 104; ++i) {
                for (int j = 0; j < 104; ++j) {
                    this.jH[n][i][j] = null;
                }
            }
        }
        this.nL = new C_h();
        this.kB = 0;
        this.kA = 0;
        this.en = -1;
        this.gp = -1;
        cH = -1;
        rs.p_n.p_a.p_a.C_c.b();
        this.fu = -1;
        ed = -1;
        this.eZ = false;
        fL = 3;
        this.fN = 0;
        dj = false;
        this.gb = false;
        this.cD = null;
        this.es = 0;
        this.er = -1;
        this.ml = true;
        this.bs();
        for (n = 0; n < 5; ++n) {
            this.lB[n] = 0;
        }
        for (n = 0; n < 5; ++n) {
            this.nh[n] = null;
            this.ni[n] = false;
        }
        nH = 0;
        nk = 0;
        lz = 0;
        oO = 0;
        kO = 0;
        nO = 0;
        ny = 0;
        oh = 0;
        this.F();
    }

    private boolean a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl, int n10) {
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17 = 104;
        int n18 = 104;
        if (n9 < 0 || n5 < 0) {
            System.out.println("Prevented walk crash #1");
            return false;
        }
        if (n5 >= this.kC.length || n9 >= this.jF.length) {
            System.out.println("Prevented walk crash #2");
            return false;
        }
        for (n16 = 0; n16 < n17; ++n16) {
            for (n15 = 0; n15 < n18; ++n15) {
                this.kC[n16][n15] = 0;
                this.jF[n16][n15] = 99999999;
            }
        }
        n16 = n9;
        n15 = n5;
        int n19 = n10 + eh;
        int n20 = n8 + ei;
        int n21 = (n19 >> 6) * 256 + (n20 >> 6);
        if (rs.p_l.C_j.c(cT) && ch && rs.p_f.C_a.t) {
            this.q(n19, n20);
            return true;
        }
        this.kC[n9][n5] = 99;
        this.jF[n9][n5] = 0;
        int n22 = 0;
        int n23 = 0;
        this.oK[n22] = n9;
        this.oL[n22++] = n5;
        boolean bl2 = false;
        int n24 = this.oK.length;
        int[][] nArray = this.fP[C_Client_mc.dw].a;
        if (n21 == 13660 || n21 == 13916 || n21 == 14172 || n21 == 14171 || n21 == 14170 || n21 == 14169 || n21 == 13913 || n21 == 13657 || n21 == 13401 || n21 == 13402 || n21 == 13403 || n21 == 13404) {
            return false;
        }
        if (n21 == 11309) {
            for (n14 = 2816; n14 <= 2821; ++n14) {
                for (n13 = 2933; n13 <= 2941; ++n13) {
                    n12 = Math.abs(n14 - eh);
                    n11 = Math.abs(n13 - ei);
                    if (n12 > nArray.length - 1 || n11 > nArray[n12].length - 1) continue;
                    nArray[n12][n11] = 0;
                }
            }
        }
        if (n21 == 12611 && this.aB) {
            for (n14 = 3154; n14 <= 3182; ++n14) {
                for (n13 = 4303; n13 <= 4323; ++n13) {
                    n12 = Math.abs(n14 - eh);
                    n11 = Math.abs(n13 - ei);
                    nArray[n12][n11] = 0;
                }
            }
        }
        if (n21 == 12342) {
            n14 = Math.abs(n19 - eh);
            n13 = Math.abs(n20 - ei);
            if (n19 == 3083 && n20 == 3491) {
                nArray[n14][n13] = 0;
            }
            if (n19 == 3083 && n20 == 3492) {
                nArray[n14][n13] = 0;
            }
        }
        while (n23 != n22) {
            n16 = this.oK[n23];
            n15 = this.oL[n23];
            n23 = (n23 + 1) % n24;
            if (n16 >= 103) {
                n16 = 102;
            }
            if (n15 >= 103) {
                n15 = 102;
            }
            if (n16 == n10 && n15 == n8) {
                bl2 = true;
                break;
            }
            if (n4 != 0) {
                if ((n4 < 5 || n4 == 10) && this.fP[dw].a(n10, n16, n15, n2, n4 - 1, n8)) {
                    bl2 = true;
                    break;
                }
                if (n4 < 10 && this.fP[dw].b(n10, n8, n15, n4 - 1, n2, n16)) {
                    bl2 = true;
                    break;
                }
            }
            if (n6 != 0 && n3 != 0 && this.fP[dw].a(n8, n10, n16, n3, n7, n6, n15)) {
                bl2 = true;
                break;
            }
            n14 = this.jF[n16][n15] + 1;
            if (n16 > 0 && this.kC[n16 - 1][n15] == 0 && (nArray[n16 - 1][n15] & 0x1280108) == 0) {
                this.oK[n22] = n16 - 1;
                this.oL[n22] = n15;
                n22 = (n22 + 1) % n24;
                this.kC[n16 - 1][n15] = 2;
                this.jF[n16 - 1][n15] = n14;
            }
            if (n16 < n17 - 1 && this.kC[n16 + 1][n15] == 0 && (nArray[n16 + 1][n15] & 0x1280180) == 0) {
                this.oK[n22] = n16 + 1;
                this.oL[n22] = n15;
                n22 = (n22 + 1) % n24;
                this.kC[n16 + 1][n15] = 8;
                this.jF[n16 + 1][n15] = n14;
            }
            if (n15 > 0 && this.kC[n16][n15 - 1] == 0 && (nArray[n16][n15 - 1] & 0x1280102) == 0) {
                this.oK[n22] = n16;
                this.oL[n22] = n15 - 1;
                n22 = (n22 + 1) % n24;
                this.kC[n16][n15 - 1] = 1;
                this.jF[n16][n15 - 1] = n14;
            }
            if (n15 < n18 - 1 && this.kC[n16][n15 + 1] == 0 && (nArray[n16][n15 + 1] & 0x1280120) == 0) {
                this.oK[n22] = n16;
                this.oL[n22] = n15 + 1;
                n22 = (n22 + 1) % n24;
                this.kC[n16][n15 + 1] = 4;
                this.jF[n16][n15 + 1] = n14;
            }
            if (n16 > 0 && n15 > 0 && this.kC[n16 - 1][n15 - 1] == 0 && (nArray[n16 - 1][n15 - 1] & 0x128010E) == 0 && (nArray[n16 - 1][n15] & 0x1280108) == 0 && (nArray[n16][n15 - 1] & 0x1280102) == 0) {
                this.oK[n22] = n16 - 1;
                this.oL[n22] = n15 - 1;
                n22 = (n22 + 1) % n24;
                this.kC[n16 - 1][n15 - 1] = 3;
                this.jF[n16 - 1][n15 - 1] = n14;
            }
            if (n16 < n17 - 1 && n15 > 0 && this.kC[n16 + 1][n15 - 1] == 0 && (nArray[n16 + 1][n15 - 1] & 0x1280183) == 0 && (nArray[n16 + 1][n15] & 0x1280180) == 0 && (nArray[n16][n15 - 1] & 0x1280102) == 0) {
                this.oK[n22] = n16 + 1;
                this.oL[n22] = n15 - 1;
                n22 = (n22 + 1) % n24;
                this.kC[n16 + 1][n15 - 1] = 9;
                this.jF[n16 + 1][n15 - 1] = n14;
            }
            if (n16 > 0 && n15 < n18 - 1 && this.kC[n16 - 1][n15 + 1] == 0 && (nArray[n16 - 1][n15 + 1] & 0x1280138) == 0 && (nArray[n16 - 1][n15] & 0x1280108) == 0 && (nArray[n16][n15 + 1] & 0x1280120) == 0) {
                this.oK[n22] = n16 - 1;
                this.oL[n22] = n15 + 1;
                n22 = (n22 + 1) % n24;
                this.kC[n16 - 1][n15 + 1] = 6;
                this.jF[n16 - 1][n15 + 1] = n14;
            }
            if (n16 >= n17 - 1 || n15 >= n18 - 1 || this.kC[n16 + 1][n15 + 1] != 0 || (nArray[n16 + 1][n15 + 1] & 0x12801E0) != 0 || (nArray[n16 + 1][n15] & 0x1280180) != 0 || (nArray[n16][n15 + 1] & 0x1280120) != 0) continue;
            this.oK[n22] = n16 + 1;
            this.oL[n22] = n15 + 1;
            n22 = (n22 + 1) % n24;
            this.kC[n16 + 1][n15 + 1] = 12;
            this.jF[n16 + 1][n15 + 1] = n14;
        }
        this.oB = 0;
        if (!bl2) {
            if (bl) {
                n14 = 100;
                for (n13 = 1; n13 < 2; ++n13) {
                    for (n12 = n10 - n13; n12 <= n10 + n13; ++n12) {
                        for (n11 = n8 - n13; n11 <= n8 + n13; ++n11) {
                            if (n12 < 0 || n11 < 0 || n12 >= 104 || n11 >= 104 || this.jF[n12][n11] >= n14) continue;
                            n14 = this.jF[n12][n11];
                            n16 = n12;
                            n15 = n11;
                            this.oB = 1;
                            bl2 = true;
                        }
                    }
                    if (bl2) break;
                }
            }
            if (!bl2) {
                return false;
            }
        }
        n23 = 0;
        this.oK[n23] = n16;
        this.oL[n23++] = n15;
        n13 = n14 = this.kC[n16][n15];
        while (n16 != n9 || n15 != n5) {
            if (n13 != n14) {
                n14 = n13;
                this.oK[n23] = n16;
                this.oL[n23++] = n15;
            }
            if ((n13 & 2) != 0) {
                ++n16;
            } else if ((n13 & 8) != 0) {
                --n16;
            }
            if ((n13 & 1) != 0) {
                ++n15;
            } else if ((n13 & 4) != 0) {
                --n15;
            }
            n13 = this.kC[n16][n15];
        }
        if (n23 > 0) {
            int n25;
            n13 = n23;
            if (n13 > 25) {
                n13 = 25;
            }
            n12 = this.oK[--n23];
            n11 = this.oL[n23];
            if ((oO += n13) >= 92) {
                fv.a(36);
                fv.g(0);
                oO = 0;
            }
            if (n == 0) {
                fv.a(164);
                fv.b(n13 + n13 + 3);
            }
            if (n == 1) {
                fv.a(248);
                fv.b(n13 + n13 + 3 + 14);
            }
            if (n == 2) {
                fv.a(98);
                fv.b(n13 + n13 + 3);
            }
            fv.p(n12 + eh);
            this.gd = this.oK[0];
            this.ge = this.oL[0];
            for (n25 = 1; n25 < n13; ++n25) {
                fv.b(this.oK[--n23] - n12);
                fv.b(this.oL[n23] - n11);
            }
            n25 = eh + (C_Client_mc.eR.ac - 6 >> 7);
            int n26 = ei + (C_Client_mc.eR.ad - 6 >> 7);
            fv.n(n11 + ei);
            fv.l(this.hY[5] != 1 ? 0 : 1);
            return true;
        }
        return n != 1;
    }

    private void b(rs.p_x.C_e c_e) {
        for (int i = 0; i < this.kw; ++i) {
            int n;
            int n2;
            int n3;
            int n4 = this.kx[i];
            rs.p_a.C_j c_j = this.cA[n4];
            int n5 = c_e.A();
            if ((n5 & 0x100) != 0) {
                c_j.V = c_e.P();
                c_j.X = c_e.P();
                c_j.W = c_e.P();
                c_j.Y = c_e.P();
                c_j.Z = c_e.U() + ff;
                c_j.aa = c_e.T() + ff;
                c_j.ab = c_e.P();
                c_j.e();
            }
            if ((n5 & 0x10) != 0) {
                n3 = c_e.S();
                if (n3 == 65535) {
                    n3 = -1;
                }
                n2 = c_e.y();
                if (n3 == c_j.F && n3 != -1) {
                    n = c_j.d()[n3].q;
                    if (n == 1) {
                        c_j.G = 0;
                        c_j.H = 0;
                        c_j.I = n2;
                        c_j.J = 0;
                    }
                    if (n == 2) {
                        c_j.J = 0;
                    }
                } else if (n3 == -1 || c_j.F == -1 || c_j.d()[n3].k >= c_j.d()[c_j.F].k) {
                    c_j.F = n3;
                    c_j.G = 0;
                    c_j.H = 0;
                    c_j.I = n2;
                    c_j.J = 0;
                    c_j.U = c_j.E;
                }
            }
            if ((n5 & 8) != 0) {
                n3 = c_e.y();
                for (n2 = 0; n2 < n3; ++n2) {
                    n = c_e.o();
                    int n6 = c_e.y();
                    int n7 = c_e.y();
                    c_j.a(n6, n, ff, n7);
                }
                c_j.L = ff + 300;
                c_j.M = c_e.o();
                c_j.N = c_e.o();
            }
            if ((n5 & 0x40) != 0) {
                n3 = c_e.O();
                n2 = c_e.P();
                n = c_e.y();
                c_j.a(n2, n3, ff, n);
                c_j.L = ff + 300;
                c_j.M = c_e.P();
                c_j.N = c_e.O();
            }
            if ((n5 & 0x80) != 0) {
                c_j.z = c_e.A();
                n3 = c_e.D();
                c_j.D = n3 >> 16;
                c_j.C = ff + (n3 & 0xFFFF);
                c_j.A = 0;
                c_j.B = 0;
                if (c_j.C > ff) {
                    c_j.A = -1;
                }
                if (c_j.z == 65535) {
                    c_j.z = -1;
                }
            }
            if ((n5 & 0x20) != 0) {
                c_j.m = c_e.A();
                if (c_j.m == 65535) {
                    c_j.m = -1;
                }
            }
            if ((n5 & 1) != 0) {
                c_j.q = c_e.F();
                c_j.O = 100;
                if (c_j.aG.x == 8330L && c_j.q.equals("SNIPE")) {
                    c_j.aA = 0;
                    c_j.aB = 0;
                    c_j.aC = 1;
                    c_j.aD = 8;
                    c_j.aE = 3;
                    c_j.q = null;
                    c_j.O = 0;
                }
                if (c_j.q != null && c_j.q.length() > 0 && c_j.q.charAt(0) == ']') {
                    String[] stringArray = c_j.q.replace(']', ',').split(",");
                    c_j.ao = (byte)Integer.parseInt(stringArray[1]);
                    c_j.ap = (byte)Integer.parseInt(stringArray[2]);
                    c_j.aq = (byte)Integer.parseInt(stringArray[3]);
                    c_j.ar = (byte)Integer.parseInt(stringArray[4]);
                    c_j.q = null;
                    c_j.O = 0;
                }
                if (c_j.aG.x == 6650L || c_j.aG.x >= 8184L && c_j.aG.x <= 8186L || c_j.aG.x >= 5159L && c_j.aG.x <= 5164L || c_j.aG.x == 6049L || c_j.aG.x == 3962L || c_j.aG.x == 3965L || c_j.aG.x == 6991L || c_j.aG.x == 8124L || c_j.aG.x == 8125L || c_j.aG.x == 8126L) {
                    if (c_j.q.equals("0")) {
                        c_j.az = 0;
                    }
                    if (c_j.q.equals("1")) {
                        c_j.az = 1;
                    }
                    if (c_j.q.equals("2")) {
                        c_j.az = (short)2;
                    }
                    if (c_j.q.equals("3")) {
                        c_j.az = (short)3;
                    }
                    c_j.q = null;
                    c_j.O = 0;
                }
                if (c_j.aG.x == 4442L) {
                    c_j.v = 11;
                }
            }
            if ((n5 & 2) != 0) {
                int n8 = c_e.y();
                if (n8 == 0) {
                    c_j.aG = rs.p_d.C_d.c(c_e.U());
                    c_j.S = c_j.aG.r;
                    c_j.o = c_j.aG.y;
                    c_j.ag = c_j.aG.q;
                    c_j.ah = c_j.aG.l;
                    c_j.ai = c_j.aG.B;
                    c_j.aj = c_j.aG.j;
                    c_j.t = c_j.aG.w;
                } else {
                    c_j.aF = c_e.U();
                }
            }
            if ((n5 & 4) == 0) continue;
            c_j.Q = c_e.S();
            c_j.R = c_e.S();
        }
    }

    public void J() {
        String string = null;
        this.ce = this.ev != 3 || this.fN != 0 || !this.gb ? 0 : ++this.ce;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n = this.ce;
        for (int i = 0; i < 200; ++i) {
            int n2;
            if (this.dC[i] == null || (n2 = this.dz[i]) != rs.p_i.C_a.q && n2 != rs.p_i.C_a.p || arrayList.contains(this.dB[i])) continue;
            arrayList.add(this.dB[i]);
            if (n == 0) {
                string = this.dB[i];
                break;
            }
            --n;
        }
        if (string == null) {
            if (this.ce == 0) {
                this.a("You haven't received any messages to which you can reply.", 0, "");
            }
            return;
        }
        if (string.contains("@cr")) {
            String string2 = string.replace("@cr", "");
            string = string2.split("@")[1];
        }
        long l2 = C_O_uc.a(string.trim());
        fM = true;
        this.fN = 0;
        this.gb = true;
        this.fB = "";
        this.ev = 3;
        this.le = l2;
        this.eQ = "Enter message to send to " + string.replaceAll("@", "");
    }

    private void a(rs.p_d.C_d c_d, int n, int n2, int n3) {
        int n4;
        boolean bl;
        if (this.eV >= 400) {
            return;
        }
        if (c_d.G != null) {
            c_d = c_d.c();
        }
        if (c_d == null) {
            return;
        }
        if (this.cA[n].q() && this.cA[n].aH) {
            return;
        }
        boolean bl2 = bl = c_d != null && c_d.h;
        if (!c_d.C && !bl) {
            return;
        }
        Object object = c_d.o;
        if (c_d.n != 0 && !c_d.h) {
            object = (String)object + C_Client_mc.r(C_Client_mc.eR.bc, c_d.n) + " (level-" + c_d.n + ")";
        }
        if (this.cA[n].aH) {
            object = (String)object + " @mag@(Spawned)";
        }
        if (bl) {
            if (!this.cA[n].j()) {
                return;
            }
            if (ed == 197) {
                return;
            }
        }
        if (this.gr == 1) {
            this.fx[this.eV] = "Use " + this.oN + " with @yel@" + (String)object;
            this.eI[this.eV] = 582;
            this.eJ[this.eV] = n;
            this.eF[this.eV] = n3;
            this.eG[this.eV] = n2;
            ++this.eV;
            return;
        }
        int n5 = n4 = c_d.x == 1488L ? rs.p_f.C_a.bh : rs.p_f.C_a.bi;
        if (C_Client_mc.eR.bh >= 1 && C_Client_mc.eR.bh <= 4) {
            if (C_Client_mc.eR.bh == 3 || C_Client_mc.eR.bh == 4) {
                n4 = 3;
            }
            if (C_Client_mc.eR.bh == 1 && (c_d.x == 4620L || c_d.x == 4623L)) {
                n4 = 3;
            }
            if (C_Client_mc.eR.bh == 2 && (c_d.x == 4660L || c_d.x == 4621L)) {
                n4 = 3;
            }
        }
        boolean bl3 = false;
        if (this.eW == 1) {
            if ((this.nm & 2) == 2 && n4 != 3) {
                boolean bl4 = n4 == 1;
                this.fx[this.eV] = this.nn + " @yel@" + (String)object;
                this.eI[this.eV] = 413 + (bl4 ? 2000 : 0);
                this.eJ[this.eV] = n;
                this.eF[this.eV] = n3;
                this.eG[this.eV] = n2;
                ++this.eV;
                if (this.eV == 2 && bl4) {
                    this.fx[this.eV] = "Walk here";
                    this.eI[this.eV] = 516;
                    this.eF[this.eV] = rs.C_C_uc.hP;
                    this.eG[this.eV] = rs.C_C_uc.hQ;
                    ++this.eV;
                }
            }
        } else {
            int n6;
            if (C_Client_mc.eR.bh == 3 && (c_d.x == 4620L || c_d.x == 4623L) || C_Client_mc.eR.bh == 4 && (c_d.x == 4660L || c_d.x == 4621L)) {
                this.fx[this.eV] = "<img=53> @or2@Upgrade @yel@" + (String)object;
                this.eI[this.eV] = 965;
                this.eJ[this.eV] = n;
                this.eF[this.eV] = n3;
                this.eG[this.eV] = n2;
                ++this.eV;
                this.fx[this.eV] = "<img=49> @gre@Heal @yel@" + (String)object;
                this.eI[this.eV] = 225;
                this.eJ[this.eV] = n;
                this.eF[this.eV] = n3;
                this.eG[this.eV] = n2;
                ++this.eV;
            }
            if (c_d.p != null && !rs.p_q.p_a.p_a.p_a.C_i.d.contains((int)c_d.x)) {
                for (n6 = 4; n6 >= 0; --n6) {
                    if (c_d.p[n6] == null || c_d.p[n6].equalsIgnoreCase("attack") || c_d.p[n6].equalsIgnoreCase("switch-effect") || c_d.p[n6].equalsIgnoreCase("poltergust-pull") || c_d.p[n6].equalsIgnoreCase("lure") || c_d.p[n6].equalsIgnoreCase("kw_catch") || c_d.p[n6].equalsIgnoreCase("<img=51> Teleport") || c_d.p[n6].equalsIgnoreCase("approach")) continue;
                    this.fx[this.eV] = c_d.p[n6] + " @yel@" + (String)object;
                    if (n6 == 0) {
                        this.eI[this.eV] = 20;
                    }
                    if (n6 == 0 && bl) {
                        this.eI[this.eV] = 2020;
                    }
                    if (n6 == 1) {
                        this.eI[this.eV] = 412;
                    }
                    if (n6 == 2) {
                        this.eI[this.eV] = 225;
                    }
                    if (n6 == 3) {
                        this.eI[this.eV] = 965;
                    }
                    if (n6 == 4) {
                        this.eI[this.eV] = 478;
                    }
                    this.eJ[this.eV] = n;
                    this.eF[this.eV] = n3;
                    this.eG[this.eV] = n2;
                    ++this.eV;
                }
            }
            if (c_d.p != null && !rs.p_q.p_a.p_a.p_a.C_i.d.contains((int)c_d.x)) {
                for (n6 = 4; n6 >= 0; --n6) {
                    if (c_d.p[n6] == null || !c_d.p[n6].equalsIgnoreCase("attack") && !c_d.p[n6].equalsIgnoreCase("switch-effect") && !c_d.p[n6].equalsIgnoreCase("poltergust-pull") && !c_d.p[n6].equalsIgnoreCase("<img=51> Teleport") && !c_d.p[n6].equalsIgnoreCase("lure") && !c_d.p[n6].equalsIgnoreCase("approach") && !c_d.p[n6].equalsIgnoreCase("kw_catch")) continue;
                    bl3 = true;
                    int n7 = 0;
                    if (c_d.n > C_Client_mc.eR.bc && !c_d.o.equals("Zulrah") && n4 != 2) {
                        n7 = 2000;
                    }
                    if (c_d.p[n6].equalsIgnoreCase("switch-effect")) {
                        n7 = 2000;
                    } else {
                        if (n4 == 3) continue;
                        if (n4 == 1) {
                            n7 = 2000;
                        }
                    }
                    this.fx[this.eV] = c_d.p[n6] + " @yel@" + (String)object;
                    if (n6 == 0) {
                        this.eI[this.eV] = 20 + n7;
                    }
                    if (n6 == 1) {
                        this.eI[this.eV] = 412 + n7;
                    }
                    if (n6 == 2) {
                        this.eI[this.eV] = 225 + n7;
                    }
                    if (n6 == 3) {
                        this.eI[this.eV] = 965 + n7;
                    }
                    if (n6 == 4) {
                        this.eI[this.eV] = 478 + n7;
                    }
                    this.eJ[this.eV] = n;
                    this.eF[this.eV] = n3;
                    this.eG[this.eV] = n2;
                    ++this.eV;
                }
            }
            this.fx[this.eV] = bl3 ? "<img=39> Drops @yel@" + (String)object + " " : "Examine @yel@" + (String)object;
            if (C_v.b(cT) && rs.p_f.C_a.c() && rs.p_s.p_c.C_c.f) {
                int n8 = this.eV;
                this.fx[n8] = this.fx[n8] + " @gre@(@cya@ID: @whi@" + c_d.x + "@gre@)";
            }
            this.eI[this.eV] = 1025;
            this.eJ[this.eV] = n;
            this.eF[this.eV] = n3;
            this.eG[this.eV] = n2;
            ++this.eV;
            if (rs.p_f.C_a.c() && rs.p_s.p_c.C_c.d) {
                this.fx[this.eV] = "<img=191> @mag@Colors@yel@ " + (String)object;
                this.eI[this.eV] = 1026;
                this.eJ[this.eV] = n;
                this.eF[this.eV] = n3;
                this.eG[this.eV] = n2;
                ++this.eV;
            }
        }
    }

    private void a(int n, int n2, rs.p_a.C_k c_k, int n3) {
        int n4;
        String string;
        block79: {
            int n5;
            boolean bl;
            int n6;
            boolean bl2;
            block80: {
                block78: {
                    if (c_k == eR) {
                        return;
                    }
                    if (this.eV >= 400) {
                        return;
                    }
                    bl2 = false;
                    if (this.eW == 0 && this.gr == 0) {
                        this.eI[1] = 518;
                        this.eF[1] = c_k.k[0];
                        this.eG[1] = c_k.l[0];
                    }
                    if (!(rs.p_n.C_e.H[18139].at.equals("Talking in: @yel@Help") || C_Client_mc.eR.bh >= 1 && C_Client_mc.eR.bh <= 4)) {
                        String string2;
                        int n7;
                        for (n7 = 18144; n7 <= 18244 && !rs.p_n.C_e.H[n7].at.equals(""); ++n7) {
                            string2 = rs.p_n.C_e.H[n7].at;
                            if (string2.contains(">")) {
                                string2 = rs.p_n.C_e.H[n7].at.split("> ")[1];
                            }
                            if (!string2.equalsIgnoreCase(c_k.aZ)) continue;
                            bl2 = true;
                            break;
                        }
                        for (n7 = 25800; n7 <= 25999 && !rs.p_n.C_e.H[n7].at.equals(""); ++n7) {
                            string2 = rs.p_n.C_e.H[n7].at;
                            if (string2.contains(">")) {
                                string2 = rs.p_n.C_e.H[n7].at.split("> ")[1];
                            }
                            if (!string2.equalsIgnoreCase(c_k.aZ)) continue;
                            bl2 = true;
                            break;
                        }
                    }
                    string = c_k.bx == 0 ? c_k.a(false, bl2 ? "<col=8A72DA>" : null) + C_Client_mc.r(C_Client_mc.eR.bc, c_k.bc) + " (level-" + c_k.bc + ")" : c_k.a(false, bl2 ? "<col=8A72DA>" : null) + " (skill-" + c_k.bx + ")";
                    if (c_k.aC == 2) {
                        string = "<img=1> " + string;
                    } else if (c_k.aC == 1) {
                        string = "<img=0> " + string;
                    } else if (c_k.aC == 6) {
                        string = "<img=6> " + string;
                    } else if (c_k.aC == 18) {
                        string = "<img=18> " + string;
                    } else if (c_k.aC == 19) {
                        string = "<img=19> " + string;
                    } else if (c_k.aC == 20) {
                        string = "<img=20> " + string;
                    } else if (c_k.aC == 26) {
                        string = "<img=2> " + string;
                    } else if (c_k.aC == 3) {
                        string = "<img=3> " + string;
                    } else if (c_k.aC == 4) {
                        string = "<img=4> " + string;
                    } else if (c_k.aC == 5) {
                        string = "<img=5> " + string;
                    } else if (c_k.aC == 7) {
                        string = "<img=7> " + string;
                    } else if (c_k.aC == 21) {
                        string = "<img=21> " + string;
                    } else if (c_k.aC == 32) {
                        string = "<img=32> " + string;
                    } else if (c_k.aC == 25) {
                        string = "@yel@[BOT] @whi@" + string;
                    } else if (c_k.aC == 38) {
                        string = "<img=38> " + string;
                    } else if (c_k.aC == 86) {
                        string = "<img=86> " + string;
                    } else if (c_k.aC == 94) {
                        string = "<img=94> " + string;
                    } else if (c_k.aC == 204) {
                        string = "<img=204> " + string;
                    } else if (c_k.aC == 205) {
                        string = "<img=205> " + string;
                    } else if (c_k.aC == 45) {
                        string = "<img=45> " + string;
                    } else if (rs.p_l.C_j.d.a_(c_k.aC)) {
                        string = "<img=" + c_k.aC + "> " + string;
                    }
                    n6 = c_k.aC == 25 && !rs.p_l.p_e.C_f.a.e() ? rs.p_f.C_a.bi : rs.p_f.C_a.bh;
                    bl = rs.p_f.C_a.aS;
                    if (rs.p_n.C_e.H[199].at.contains("LMS") && ed == 197) {
                        bl = false;
                    }
                    if (rs.p_l.p_e.C_f.a.e()) {
                        bl = false;
                    }
                    if (C_Client_mc.eR.bh >= 1 && C_Client_mc.eR.bh <= 4) {
                        bl = false;
                        if (c_k.bh == C_Client_mc.eR.bh || c_k.bh == 3 || c_k.bh == 4 || C_Client_mc.eR.bh == 3 || C_Client_mc.eR.bh == 4) {
                            n6 = 3;
                        }
                    }
                    if (this.gr != 1) break block78;
                    this.fx[this.eV] = "Use " + this.oN + " with @whi@" + string;
                    this.eI[this.eV] = 491;
                    this.eJ[this.eV] = n2;
                    this.eF[this.eV] = n;
                    this.eG[this.eV] = n3;
                    ++this.eV;
                    break block79;
                }
                if (this.eW != 1) break block80;
                if ((this.nm & 8) != 8) break block79;
                n4 = n6 == 1 || n6 == 3 || bl2 && bl ? 1 : 0;
                n5 = 1;
                if (cw != 14927 && rs.p_f.C_a.aK && this.z.r != null && !this.z.r.equalsIgnoreCase(c_k.aZ)) {
                    n4 = 1;
                }
                if (n6 != 3) {
                    this.fx[this.eV] = this.nn + " " + (!bl2 ? "@whi@" : "") + string;
                    this.eI[this.eV] = 365 + (n4 != 0 ? 2000 : 0);
                    this.eJ[this.eV] = n2;
                    this.eF[this.eV] = n;
                    this.eG[this.eV] = n3;
                    ++this.eV;
                }
                if (this.eV != 2 || n4 == 0) break block79;
                this.fx[this.eV] = "Walk here";
                this.eI[this.eV] = 516;
                this.eF[this.eV] = rs.C_C_uc.hP;
                this.eG[this.eV] = rs.C_C_uc.hQ;
                ++this.eV;
                break block79;
            }
            for (n4 = 4; n4 >= 0; --n4) {
                if (this.nh[n4] == null) continue;
                this.fx[this.eV] = this.nh[n4] + " @whi@" + string;
                n5 = 0;
                if (this.nh[n4].equalsIgnoreCase("attack")) {
                    boolean bl3 = false;
                    if (c_k.aC == 25 && !rs.p_l.p_e.C_f.a.e() && c_k.m - 32768 != di && cw != 13130 && cw != 13129 && cw != 6480 && cw != 6481) {
                        bl3 = true;
                    }
                    if (ed == 197 && rs.p_n.C_e.H[199].at != null && rs.p_n.C_e.H[199].at.contains("Tourney")) {
                        if (this.jZ == 10 && this.kV >= 0 && this.kV < kw_do.length) {
                            if (c_k.aZ != null && kw_do[this.kV] != null && C_Client_mc.kw_do[this.kV].aZ != null && !C_Client_mc.kw_do[this.kV].aZ.equalsIgnoreCase(c_k.aZ)) {
                                bl3 = true;
                            }
                        } else {
                            bl3 = true;
                        }
                    } else {
                        if (c_k.bc > C_Client_mc.eR.bc && n6 != 2 || bl2 && bl || bl3) {
                            n5 = 2000;
                        }
                        if (rs.p_f.C_a.aJ && this.z.r != null && !this.z.r.equalsIgnoreCase(c_k.aZ)) {
                            n5 = 2000;
                        }
                        if (n6 == 1) {
                            n5 = 2000;
                        }
                        if (n6 == 3 || rs.p_l.p_e.C_f.a.e() && (c_k.ay == 6095 && c_k.aT != null || C_Client_mc.eR.ay == 6095 && C_Client_mc.eR.aT != null)) continue;
                        if (C_Client_mc.eR.aX != 0 && c_k.aX != 0) {
                            n5 = C_Client_mc.eR.aX == c_k.aX ? 2000 : 0;
                        }
                    }
                    if (bl3) {
                        n5 = 2000;
                    }
                } else if (this.ni[n4]) {
                    n5 = 2000;
                }
                if (this.nh[n4].equalsIgnoreCase("fight") && cw == 13362 && this.jZ == 10 && this.kV != n2) {
                    n5 = 2000;
                }
                if (n4 == 0) {
                    this.eI[this.eV] = 561 + n5;
                }
                if (n4 == 1) {
                    this.eI[this.eV] = 779 + n5;
                }
                if (n4 == 2) {
                    this.eI[this.eV] = 27 + n5;
                }
                if (n4 == 3) {
                    this.eI[this.eV] = 577 + n5;
                }
                if (n4 == 4) {
                    this.eI[this.eV] = 729 + n5;
                }
                this.eJ[this.eV] = n2;
                this.eF[this.eV] = n;
                this.eG[this.eV] = n3;
                ++this.eV;
            }
        }
        if (this.eW == 0 && this.gr == 0) {
            for (n4 = 0; n4 < this.eV; ++n4) {
                if (this.eI[n4] != 516 && this.eI[n4] != 518) continue;
                this.fx[n4] = "Walk here @whi@" + string;
                return;
            }
        }
    }

    private void a(C_N_uc c_N_uc) {
        int n = 0;
        int n2 = -1;
        int n3 = 0;
        int n4 = 0;
        if (c_N_uc.i == 0) {
            n = this.dF.a(c_N_uc.h, c_N_uc.j, c_N_uc.k);
        }
        if (c_N_uc.i == 1) {
            n = this.dF.c(c_N_uc.h, c_N_uc.j, c_N_uc.k);
        }
        if (c_N_uc.i == 2) {
            n = this.dF.e(c_N_uc.h, c_N_uc.j, c_N_uc.k);
        }
        if (c_N_uc.i == 3) {
            n = this.dF.g(c_N_uc.h, c_N_uc.j, c_N_uc.k);
        }
        if (n != 0) {
            int n5 = this.dF.b(c_N_uc.h, c_N_uc.j, c_N_uc.k, n);
            n2 = n >> 14 & Short.MAX_VALUE;
            n3 = n5 & 0x1F;
            n4 = n5 >> 6;
        }
        c_N_uc.l = n2;
        c_N_uc.n = n3;
        c_N_uc.m = n4;
    }

    public final void K() {
        for (int i = 0; i < this.ms; ++i) {
            boolean bl = false;
            try {
                if (!C_L_uc.a.w_(this.nY[i])) {
                    rs.p_cache.p_osrs.C_c.a(true);
                    try {
                        ew.a(2, this.nY[i]);
                        continue;
                    }
                    finally {
                        rs.p_cache.p_osrs.C_c.a(false);
                    }
                }
                byte[] byArray = (byte[])C_L_uc.a.b(this.nY[i]);
                new C_L_uc(new ByteArrayInputStream(byArray), this.ot[i], this.os[i]).a(byArray);
                if (System.currentTimeMillis() + (long)(C_Client_mc.fv.h / 22) > this.nG + (long)(this.oy / 22)) {
                    this.oy = C_Client_mc.fv.h;
                    this.nG = System.currentTimeMillis();
                    bl = false;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (!bl || this.os[i] == -5) {
                --this.ms;
                for (int j = i; j < this.ms; ++j) {
                    this.nY[j] = this.nY[j + 1];
                    this.oo[j] = this.oo[j + 1];
                    this.os[j] = this.os[j + 1];
                    this.ot[j] = this.ot[j + 1];
                }
                --i;
                continue;
            }
            this.os[i] = -5;
        }
        if (this.oz > 0) {
            this.oz -= 20;
            if (this.oz < 0) {
                this.oz = 0;
            }
            if (this.oz == 0 && this.nv) {
                this.oi = this.lh;
                this.oj = true;
                ew.a(2, this.oi);
            }
        }
    }

    @Override
    void L() {
        Object object;
        Object object2;
        rs.p_f.C_a.f();
        if (!rs.p_f.C_a.d.booleanValue()) {
            if (!this.l.a()) {
                this.a(20, "Error loading game assets!");
                rs.p_l.p_d.C_c.a = false;
                return;
            }
        } else {
            this.G = new rs.p_l.p_d.C_c(this);
            this.gm = new rs.p_l.C_h(false, "assets/", "assets/p12_full");
            this.a(0, "Please wait, checking assets..");
            object2 = new Thread(this.G);
            ((Thread)object2).start();
            this.cf = true;
            if (C_Launcher_mc.n() != null) {
                C_Launcher_mc.n().d();
            }
        }
        this.cg = true;
        this.a(20, "Starting up");
        if (rs.p_v.C_a.g) {
            this.hC = 5;
        }
        lC = true;
        ew = new C_d();
        ew.a();
        if (rs.p_f.C_a.d.booleanValue()) {
            try {
                this.m(4);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        for (Object object3 : (Object)ac) {
            object = new File(rs.p_v.C_a.f() + "raw/" + (int)object3);
            if (((File)object).exists()) {
                ((File)object).delete();
            }
            if (!((File)(object = new File(rs.p_v.C_a.f() + "raw/" + (int)object3 + ".dat"))).exists()) continue;
            ((File)object).delete();
        }
        try {
            int n;
            int n2;
            int n3;
            int n4;
            this.mo = this.a(1, "title screen", "title", this.eE[1], 25);
            gh = new rs.p_l.C_K_uc(false, "p11_full", this.mo);
            this.gi = new rs.p_l.C_K_uc(false, "p12_full", this.mo);
            gj = new rs.p_l.C_K_uc(false, "b12_full", this.mo);
            this.gk = this.gi;
            gl = new rs.p_l.C_h(false, "p11_full", this.mo);
            this.gm = new rs.p_l.C_h(false, "p12_full", this.mo);
            this.gn = new rs.p_l.C_h(false, "b12_full", this.mo);
            this.go = new rs.p_l.C_h(true, "q8_full", this.mo);
            object2 = this.a(2, "config", "config", this.eE[2], 30);
            rs.p_x.C_f c_f = this.a(3, "kw_interface", "kw_interface", this.eE[3], 35);
            rs.p_x.C_f c_f2 = this.a(4, "2d graphics", "media", this.eE[4], 40);
            rs.p_x.C_f c_f3 = this.a(6, "textures", "textures", this.eE[6], 45);
            object = this.a(7, "chat system", "wordenc", this.eE[7], 50);
            rs.p_x.C_f c_f4 = this.a(8, "sound effects", "sounds", this.eE[8], 55);
            this.gc = new byte[4][104][104];
            this.fC = new int[4][105][105];
            this.dF = new C_V_uc(this.fC);
            for (int i = 0; i < 4; ++i) {
                this.fP[i] = new rs.C_f();
            }
            this.oA = new C_F_uc(512, 512);
            rs.p_x.C_f c_f5 = this.a(5, "update list", "versionlist", this.eE[5], 60);
            this.a(60, "Connecting to update server");
            rs.p_secure.C_c.a();
            ew.a(c_f5, this);
            C_k.a(ew.i());
            rs.p_a.C_h.a(ew.j(), ew);
            if (!li) {
                this.oi = 0;
                try {
                    this.oi = Integer.parseInt(this.getParameter("music"));
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.oj = true;
                ew.a(2, this.oi);
                while (ew.g() > 0) {
                    this.s();
                    try {
                        Thread.sleep(100L);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (C_Client_mc.ew.k <= 3) continue;
                    this.bo();
                    return;
                }
            }
            this.a(80, "Unpacking media");
            long l2 = System.currentTimeMillis();
            this.c(true);
            try {
                rs.p_d.C_m.a();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                rs.p_d.C_p.a();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            rs.p_d.C_w.a();
            C_J_uc.a();
            C_I_uc.a();
            rs.p_l.p_a.C_b.a();
            System.out.println("[Loader] Unpacking media load time: " + (System.currentTimeMillis() - l2) + "ms");
            this.aA = new C_F_uc("popups/fog");
            this.I = new C_F_uc("popups/amnestyskull");
            this.fG = new C_F_uc("icons/bmmap");
            this.fF = new C_F_uc("misc/summer 2020");
            this.fH = new C_F_uc("icons/bloodslayer");
            this.fI = new C_F_uc("icons/tourneymap");
            this.fJ = new C_F_uc("icons/eventmap");
            this.fK = new C_F_uc("icons/eventmap2");
            this.jc = new C_F_uc("icons/pktele");
            this.iX = new C_F_uc("icons/skilltele");
            this.iY = new C_F_uc("icons/moneytele");
            this.jb = new C_F_uc("magic/home 2");
            this.iZ = new C_F_uc("icons/bosstele");
            this.ja = new C_F_uc("icons/storetele");
            this.ki = new C_F_uc("hitmarks/old/hit");
            this.kj = new C_F_uc("hitmarks/old/poison");
            this.cZ = new C_F_uc("hitmarks/old/venom");
            this.da = new C_F_uc("hitmarks/old/crit");
            this.db = new C_F_uc("hitmarks/old/shield");
            this.dc = new C_F_uc("hitmarks/old/heal");
            this.kl = new C_F_uc("hitmarks/old/block");
            this.dd = new C_F_uc("hitmarks/new/block");
            this.kk[0] = new C_F_uc("hitmarks/old/kapow");
            this.kk[1] = new C_F_uc("hitmarks/old/kapow 2");
            this.aS = new C_F_uc("popups/HP 0");
            this.ig = new C_F_uc("popups/HP 1");
            this.fw = new C_F_uc("gameframe/invback");
            this.nU = new C_F_uc("gameframe/chatback");
            this.ir = new C_F_uc("gameframe/chatarea");
            this.is = new C_F_uc("gameframe/chatcollapsed");
            this.it = new C_F_uc("gameframe/chatcollapsededge");
            this.iv = new C_F_uc("gameframe/map");
            this.iu = new C_F_uc("gameframe/map2");
            this.nT = new rs.p_l.C_a(c_f2, "mapback", 0);
            this.mb = new C_F_uc("gameframe/backbase2");
            this.mc = new C_F_uc("gameframe/backhmid1");
            this.aT = new C_F_uc(512, 512);
            this.cU = new C_F_uc("orbs/arrow");
            this.cV = new C_F_uc("orbs/arrow 2");
            this.cW = new C_F_uc("orbs/arrow 3");
            this.cX = new C_F_uc("orbs/arrow 4");
            this.aU = new C_F_uc("wiki/icon");
            this.J = new C_F_uc[5];
            this.J[0] = new C_F_uc("popups/orb 1");
            this.J[1] = new C_F_uc("popups/orb 2");
            this.J[2] = new C_F_uc("popups/orb 3");
            this.J[3] = new C_F_uc("popups/orb 4");
            this.J[4] = new C_F_uc("popups/orb 5");
            this.eL = new C_F_uc[10];
            for (int i = 0; i < 5; ++i) {
                this.eL[i] = new C_F_uc("icons/keyskull " + (i + 1));
                this.eL[i + 5] = new C_F_uc("icons/keyredskull " + (i + 1));
            }
            File[] fileArray = new File(rs.p_v.C_a.f() + "/sprites/gameframe/fullscreen").listFiles();
            int n5 = fileArray.length;
            this.H = new C_F_uc[n5];
            for (n4 = 0; n4 < n5; ++n4) {
                this.H[n4] = new C_F_uc("gameframe/fullscreen/" + n4);
            }
            for (n4 = 0; n4 < 21; ++n4) {
                this.de[n4] = new C_F_uc("hitmarks/new/hit " + n4);
            }
            for (n4 = 0; n4 < 5; ++n4) {
                this.df[n4] = new C_F_uc("hitmarks/new/icon " + n4);
            }
            rs.p_l.C_j.b();
            this.Y = new C_F_uc("magic/autocast");
            gl.a(fE);
            this.gm.a(fE);
            this.gn.a(fE);
            this.go.a(fE);
            this.lZ = new C_F_uc("gameframe/chatbuttons");
            this.ng = new C_F_uc("gameframe/compass");
            this.lK = new C_F_uc("popups/mapedge");
            try {
                for (n4 = 0; n4 < 100; ++n4) {
                    this.mq[n4] = new rs.p_l.C_a(c_f2, "mapscene", n4);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                for (int i = 0; i < 100; ++i) {
                    this.me[i] = new C_F_uc(c_f2, "mapfunction", i);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                for (int i = 0; i < 20; ++i) {
                    this.dS[i] = new C_F_uc(c_f2, "hitmarks", i);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                for (int i = 0; i < 6; ++i) {
                    this.mX[i] = new C_F_uc(c_f2, "headicons_hint", i);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                for (int i = 0; i < 21; ++i) {
                    this.mW[i] = new C_F_uc(c_f2, "headicons_prayer", i);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.mW[7] = new C_F_uc("prayer/protmagemelee");
            this.mW[8] = new C_F_uc("prayer/protmeleerange");
            this.mW[9] = new C_F_uc("prayer/protall");
            try {
                for (int i = 0; i < 3; ++i) {
                    this.eK[i] = new C_F_uc(c_f2, "headicons_pk", i);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.bs = new C_F_uc(c_f2, "overlay_multiway", 0);
            this.kg = new C_F_uc(c_f2, "mapmarker", 0);
            this.kh = new C_F_uc(c_f2, "mapmarker", 1);
            for (int i = 0; i < 8; ++i) {
                this.fa[i] = new C_F_uc(c_f2, "cross", i);
            }
            this.mC = new C_F_uc(c_f2, "mapdots", 0);
            this.mD = new C_F_uc(c_f2, "mapdots", 1);
            this.mM = new C_F_uc(c_f2, "mapdots", 2);
            this.mN = new C_F_uc(c_f2, "mapdots", 3);
            this.mQ = new C_F_uc(c_f2, "mapdots", 4);
            this.mO = new C_F_uc("icons/clandot");
            this.mE = new C_F_uc("icons/hweendot");
            this.mF = new C_F_uc("icons/xmasdot");
            this.mG = new C_F_uc("icons/nmxmasdot");
            this.mH = new C_F_uc("icons/bloodrev");
            this.mI = new C_F_uc("icons/brutalbloodrev");
            this.mJ = new C_F_uc("icons/impling");
            this.mK = new C_F_uc("icons/easterdot");
            this.mL = new C_F_uc("icons/summerdot");
            this.mP = new C_F_uc("icons/biohazard");
            this.lX = new C_F_uc("gameframe/scrollbar0");
            this.lY = new C_F_uc("gameframe/scrollbar1");
            this.nq = new rs.p_l.C_a(c_f2, "redstone1", 0);
            this.nr = new rs.p_l.C_a(c_f2, "redstone2", 0);
            this.ns = new rs.p_l.C_a(c_f2, "redstone3", 0);
            this.nt = new rs.p_l.C_a(c_f2, "redstone1", 0);
            this.nt.g();
            this.nu = new rs.p_l.C_a(c_f2, "redstone2", 0);
            this.nu.g();
            this.kb = new rs.p_l.C_a(c_f2, "redstone1", 0);
            this.kb.h();
            this.kc = new rs.p_l.C_a(c_f2, "redstone2", 0);
            this.kc.h();
            this.kd = new rs.p_l.C_a(c_f2, "redstone3", 0);
            this.kd.h();
            this.ke = new rs.p_l.C_a(c_f2, "redstone1", 0);
            this.ke.g();
            this.ke.h();
            this.kf = new rs.p_l.C_a(c_f2, "redstone2", 0);
            this.kf.g();
            this.kf.h();
            this.bt = true;
            C_F_uc c_F_uc = new C_F_uc("gameframe/backleft1");
            this.dq = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            c_F_uc = new C_F_uc("gameframe/backleft2");
            this.kE = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            c_F_uc = new C_F_uc("gameframe/backright1");
            this.kF = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            c_F_uc = new C_F_uc("gameframe/backright2");
            this.kG = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            c_F_uc = new C_F_uc("gameframe/backtop1");
            this.dr = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            c_F_uc = new C_F_uc("gameframe/backvmid1");
            this.kH = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            c_F_uc = new C_F_uc("gameframe/backvmid2");
            this.kI = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            c_F_uc = new C_F_uc("gameframe/backvmid3");
            this.kJ = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            c_F_uc = new C_F_uc("gameframe/backhmid2");
            this.kK = new rs.p_l.C_e(c_F_uc.n, c_F_uc.o, this.B());
            c_F_uc.d(0, 0);
            this.bt = false;
            int n6 = (int)(Math.random() * 21.0) - 10;
            int n7 = (int)(Math.random() * 21.0) - 10;
            int n8 = (int)(Math.random() * 21.0) - 10;
            int n9 = (int)(Math.random() * 41.0) - 20;
            for (n3 = 0; n3 < 100; ++n3) {
                if (this.me[n3] != null) {
                    this.me[n3].d(n6 + n9, n7 + n9, n8 + n9);
                }
                if (this.mq[n3] == null) continue;
                this.mq[n3].a(n6 + n9, n7 + n9, n8 + n9);
            }
            this.a(83, "Unpacking textures");
            C_E_uc.a(c_f3);
            C_E_uc.b(0.8);
            C_E_uc.h();
            this.a(86, "Unpacking config");
            rs.p_d.C_a.a((rs.p_x.C_f)object2);
            C_r.a((rs.p_x.C_f)object2);
            C_t.a(C_h.a.a);
            rs.p_d.C_h.a((rs.p_x.C_f)object2);
            rs.p_d.C_k.a((rs.p_x.C_f)object2);
            rs.p_d.C_d.a((rs.p_x.C_f)object2);
            rs.p_d.C_j.a((rs.p_x.C_f)object2);
            rs.p_d.C_x.a((rs.p_x.C_f)object2);
            C_z.a((rs.p_x.C_f)object2);
            C_y.a((rs.p_x.C_f)object2);
            rs.p_d.C_k.H = dM;
            this.m = new rs.p_l.p_e.C_h(this);
            this.o = new rs.p_l.p_e.C_e(this);
            this.n = new rs.p_l.p_e.C_m(this);
            if (!li) {
                this.a(90, "Unpacking sounds");
                byte[] byArray = c_f4.a("sounds.dat");
                rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
                rs.p_w.C_e.a(c_e);
            }
            this.a(95, "Unpacking interfaces");
            bk = new rs.p_l.C_K_uc[]{gh, this.gi, gj, this.gk};
            rs.p_n.C_e.a(c_f, bk, c_f2);
            this.a(100, "Preparing game engine");
            for (n3 = 0; n3 < 33; ++n3) {
                int n10 = 999;
                n2 = 0;
                for (n = 0; n < 34; ++n) {
                    if (this.nT.i[n + n3 * this.nT.j] == 0) {
                        if (n10 != 999) continue;
                        n10 = n;
                        continue;
                    }
                    if (n10 == 999) continue;
                    n2 = n;
                    break;
                }
                this.ln[n3] = n10;
                this.mp[n3] = n2 - n10;
            }
            for (n3 = 1; n3 < 153; ++n3) {
                int n11 = 999;
                n2 = 0;
                for (n = 24; n < 177; ++n) {
                    if (this.nT.i[n + n3 * this.nT.j] == 0 && (n > 34 || n3 > 34)) {
                        if (n11 != 999) continue;
                        n11 = n;
                        continue;
                    }
                    if (n11 == 999) continue;
                    n2 = n;
                    break;
                }
                this.eq[n3 - 1] = n11 - 24;
                this.fO[n3 - 1] = n2 - n11;
            }
            this.fO[0] = 22;
            this.fO[1] = 34;
            this.fO[2] = 42;
            this.fO[3] = 50;
            this.fO[4] = 56;
            this.fO[5] = 60;
            this.fO[6] = 66;
            this.fO[7] = 70;
            this.fO[8] = 74;
            this.fO[9] = 78;
            this.fO[10] = 82;
            this.fO[11] = 84;
            this.fO[12] = 88;
            this.fO[13] = 90;
            this.fO[14] = 94;
            this.fO[15] = 96;
            this.fO[16] = 98;
            this.fO[17] = 102;
            this.fO[18] = 104;
            this.fO[19] = 106;
            this.fO[20] = 108;
            this.fO[21] = 110;
            this.fO[22] = 112;
            this.fO[23] = 114;
            this.fO[24] = 116;
            this.fO[25] = 118;
            this.fO[26] = 120;
            this.fO[27] = 122;
            this.fO[28] = 122;
            this.fO[29] = 124;
            this.fO[30] = 126;
            this.fO[31] = 128;
            this.fO[32] = 128;
            this.fO[33] = 130;
            this.fO[34] = 132;
            this.fO[35] = 132;
            this.fO[36] = 134;
            this.fO[37] = 136;
            this.fO[38] = 136;
            this.fO[39] = 138;
            this.fO[40] = 138;
            this.fO[41] = 140;
            this.fO[42] = 140;
            this.fO[43] = 142;
            this.fO[44] = 142;
            this.fO[45] = 144;
            this.fO[46] = 144;
            this.fO[47] = 144;
            this.fO[48] = 146;
            this.fO[49] = 146;
            this.fO[50] = 148;
            this.fO[51] = 148;
            this.fO[52] = 148;
            this.fO[53] = 150;
            this.fO[54] = 150;
            this.fO[55] = 150;
            this.fO[56] = 150;
            this.fO[57] = 152;
            this.fO[58] = 152;
            this.fO[59] = 152;
            this.fO[60] = 152;
            this.fO[61] = 152;
            this.fO[62] = 154;
            this.fO[63] = 154;
            this.fO[64] = 154;
            this.fO[65] = 154;
            this.fO[66] = 154;
            this.fO[67] = 154;
            this.fO[68] = 156;
            this.fO[69] = 156;
            this.fO[70] = 156;
            this.fO[71] = 156;
            this.fO[72] = 156;
            this.fO[73] = 156;
            this.fO[74] = 156;
            this.fO[75] = 156;
            this.fO[150] = 22;
            this.fO[149] = 34;
            this.fO[148] = 42;
            this.fO[147] = 50;
            this.fO[146] = 56;
            this.fO[145] = 60;
            this.fO[144] = 66;
            this.fO[143] = 70;
            this.fO[142] = 74;
            this.fO[141] = 78;
            this.fO[140] = 82;
            this.fO[139] = 84;
            this.fO[138] = 88;
            this.fO[137] = 90;
            this.fO[136] = 94;
            this.fO[135] = 96;
            this.fO[134] = 98;
            this.fO[133] = 102;
            this.fO[132] = 104;
            this.fO[131] = 106;
            this.fO[130] = 108;
            this.fO[129] = 110;
            this.fO[128] = 112;
            this.fO[127] = 114;
            this.fO[126] = 116;
            this.fO[125] = 118;
            this.fO[124] = 120;
            this.fO[123] = 122;
            this.fO[122] = 122;
            this.fO[121] = 124;
            this.fO[120] = 126;
            this.fO[119] = 128;
            this.fO[118] = 128;
            this.fO[117] = 130;
            this.fO[116] = 132;
            this.fO[115] = 132;
            this.fO[114] = 134;
            this.fO[113] = 136;
            this.fO[112] = 136;
            this.fO[111] = 138;
            this.fO[110] = 138;
            this.fO[109] = 140;
            this.fO[108] = 140;
            this.fO[107] = 142;
            this.fO[106] = 142;
            this.fO[105] = 144;
            this.fO[104] = 144;
            this.fO[103] = 144;
            this.fO[102] = 146;
            this.fO[101] = 146;
            this.fO[100] = 148;
            this.fO[99] = 148;
            this.fO[98] = 148;
            this.fO[97] = 150;
            this.fO[96] = 150;
            this.fO[95] = 150;
            this.fO[94] = 150;
            this.fO[93] = 152;
            this.fO[92] = 152;
            this.fO[91] = 152;
            this.fO[90] = 152;
            this.fO[89] = 152;
            this.fO[88] = 154;
            this.fO[87] = 154;
            this.fO[86] = 154;
            this.fO[85] = 154;
            this.fO[84] = 154;
            this.fO[83] = 154;
            this.fO[82] = 156;
            this.fO[81] = 156;
            this.fO[80] = 156;
            this.fO[79] = 156;
            this.fO[78] = 156;
            this.fO[77] = 156;
            this.fO[76] = 156;
            this.fO[75] = 156;
            this.eq[0] = 67;
            this.eq[1] = 61;
            this.eq[2] = 57;
            this.eq[3] = 53;
            this.eq[4] = 50;
            this.eq[5] = 48;
            this.eq[6] = 45;
            this.eq[7] = 43;
            this.eq[8] = 41;
            this.eq[9] = 39;
            this.eq[10] = 37;
            this.eq[11] = 36;
            this.eq[12] = 34;
            this.eq[13] = 33;
            this.eq[14] = 31;
            this.eq[15] = 30;
            this.eq[16] = 29;
            this.eq[17] = 28;
            this.eq[18] = 27;
            this.eq[19] = 26;
            this.eq[20] = 25;
            this.eq[21] = 24;
            this.eq[22] = 23;
            this.eq[23] = 22;
            this.eq[24] = 21;
            this.eq[25] = 20;
            this.eq[26] = 19;
            this.eq[27] = 18;
            this.eq[28] = 17;
            this.eq[29] = 17;
            this.eq[30] = 16;
            this.eq[31] = 15;
            this.eq[32] = 14;
            this.eq[33] = 14;
            this.eq[34] = 13;
            this.eq[35] = 12;
            this.eq[36] = 12;
            this.eq[37] = 11;
            this.eq[38] = 10;
            this.eq[39] = 10;
            this.eq[40] = 9;
            this.eq[41] = 9;
            this.eq[42] = 8;
            this.eq[43] = 8;
            this.eq[44] = 7;
            this.eq[45] = 7;
            this.eq[46] = 6;
            this.eq[47] = 6;
            this.eq[48] = 6;
            this.eq[49] = 5;
            this.eq[50] = 5;
            this.eq[51] = 4;
            this.eq[52] = 4;
            this.eq[53] = 4;
            this.eq[54] = 3;
            this.eq[55] = 3;
            this.eq[56] = 3;
            this.eq[57] = 3;
            this.eq[58] = 2;
            this.eq[59] = 2;
            this.eq[60] = 2;
            this.eq[61] = 2;
            this.eq[62] = 1;
            this.eq[63] = 1;
            this.eq[64] = 1;
            this.eq[65] = 1;
            this.eq[66] = 1;
            this.eq[67] = 1;
            this.eq[68] = 0;
            this.eq[69] = 0;
            this.eq[70] = 0;
            this.eq[71] = 0;
            this.eq[72] = 0;
            this.eq[73] = 0;
            this.eq[74] = 0;
            this.eq[75] = 0;
            this.eq[150] = 67;
            this.eq[149] = 61;
            this.eq[148] = 57;
            this.eq[147] = 53;
            this.eq[146] = 50;
            this.eq[145] = 48;
            this.eq[144] = 45;
            this.eq[143] = 43;
            this.eq[142] = 41;
            this.eq[141] = 39;
            this.eq[140] = 37;
            this.eq[139] = 36;
            this.eq[138] = 34;
            this.eq[137] = 33;
            this.eq[136] = 31;
            this.eq[135] = 30;
            this.eq[134] = 29;
            this.eq[133] = 28;
            this.eq[132] = 27;
            this.eq[131] = 26;
            this.eq[130] = 25;
            this.eq[129] = 24;
            this.eq[128] = 23;
            this.eq[127] = 22;
            this.eq[126] = 21;
            this.eq[125] = 20;
            this.eq[124] = 19;
            this.eq[123] = 18;
            this.eq[122] = 17;
            this.eq[121] = 17;
            this.eq[120] = 16;
            this.eq[119] = 15;
            this.eq[118] = 14;
            this.eq[117] = 14;
            this.eq[116] = 13;
            this.eq[115] = 12;
            this.eq[114] = 12;
            this.eq[113] = 11;
            this.eq[112] = 10;
            this.eq[111] = 10;
            this.eq[110] = 9;
            this.eq[109] = 9;
            this.eq[108] = 8;
            this.eq[107] = 8;
            this.eq[106] = 7;
            this.eq[105] = 7;
            this.eq[104] = 6;
            this.eq[103] = 6;
            this.eq[102] = 6;
            this.eq[101] = 5;
            this.eq[100] = 5;
            this.eq[99] = 4;
            this.eq[98] = 4;
            this.eq[97] = 4;
            this.eq[96] = 3;
            this.eq[95] = 3;
            this.eq[94] = 3;
            this.eq[93] = 3;
            this.eq[92] = 2;
            this.eq[91] = 2;
            this.eq[90] = 2;
            this.eq[89] = 2;
            this.eq[88] = 1;
            this.eq[87] = 1;
            this.eq[86] = 1;
            this.eq[85] = 1;
            this.eq[84] = 1;
            this.eq[83] = 1;
            this.eq[82] = 0;
            this.eq[81] = 0;
            this.eq[80] = 0;
            this.eq[79] = 0;
            this.eq[78] = 0;
            this.eq[77] = 0;
            this.eq[76] = 0;
            this.eq[75] = 0;
            by = new C_K_uc[rs.p_r.C_c.c.length];
            for (n3 = 0; n3 < by.length; ++n3) {
                C_Client_mc.by[n3] = new C_K_uc(rs.p_r.C_c.c[n3]);
            }
            this.i();
            this.j();
            rs.p_d.C_c.a((rs.p_x.C_f)object);
            this.kp = new rs.p_b.C_a(this);
            this.a(this.kp, 10);
            rs.p_a.C_m.h = this;
            C_r.ai = this;
            rs.p_d.C_d.A = this;
            rs.p_l.p_e.C_f.a();
            rs.p_q.p_a.p_a.C_b.a();
            rs.p_u.C_b.b();
            new rs.p_t.p_a.C_g().a();
            this.v = new rs.p_i.C_b(this);
            this.y = new rs.p_l.p_c.C_a(this);
            w = new rs.p_l.p_e.C_c(this);
            rs.p_l.p_d.C_c.a = false;
            this.G.a("@yel@Safety reminder to new players:@whi@ Please do NOT", "use passwords that you've used on other servers.");
            if (rs.p_f.C_a.d.booleanValue()) {
                rs.p_c.p_b.C_a.a(this);
            }
            C_Client_mc.M();
            this.cz = 2;
            this.G.a(C_c.a.b);
            C_ClientStartUp_mc c_ClientStartUp_mc = new C_ClientStartUp_mc();
            this.p.post(c_ClientStartUp_mc);
            return;
        }
        catch (Exception exception) {
            rs.p_v.C_a.e("loaderror " + this.mm + " " + this.mR);
            exception.printStackTrace();
            this.kQ = true;
            rs.p_l.p_d.C_c.a = false;
            return;
        }
    }

    public static void M() {
        rs.p_d.C_k.c.clear();
        if (rs.p_d.C_k.ad > 0) {
            for (int i = 0; i < rs.p_d.C_k.a; ++i) {
                rs.p_d.C_k c_k = rs.p_d.C_k.f(i);
                if (c_k == null || c_k.w == null) continue;
                rs.p_d.C_k c_k2 = new rs.p_d.C_k();
                c_k2.w = c_k.w.equals(rs.p_d.C_k.d) ? rs.p_d.C_k.d : c_k.w;
                c_k2.F = c_k.F;
                c_k2.p = c_k.p;
                c_k2.i = c_k.i;
                c_k2.A = c_k.A;
                c_k2.aa = c_k.aa;
                c_k2.r = c_k.r;
                c_k2.q = c_k.q;
                c_k2.K = c_k.K;
                c_k2.J = c_k.J;
                c_k2.o = c_k.o;
                c_k2.B = c_k.B;
                c_k2.s = c_k.s;
                c_k2.R = c_k.R;
                c_k2.U = c_k.U;
                c_k2.T = c_k.T;
                rs.p_d.C_k.b(c_k, c_k2);
                rs.p_d.C_k.a(c_k, c_k2);
                rs.p_d.C_k.c.a(i, (Object)c_k2);
            }
        }
    }

    private static boolean a(String[] stringArray, String[] stringArray2) {
        if (stringArray == null || stringArray2 == null || stringArray.length != stringArray2.length) {
            return false;
        }
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i] == null && stringArray2[i] == null) continue;
            if (stringArray[i] == null && stringArray2[i] != null && !stringArray2[i].equals("null")) {
                return false;
            }
            if (stringArray[i] != null && stringArray2[i] == null && !stringArray[i].equals("null")) {
                return false;
            }
            if (stringArray[i].equals(stringArray2[i])) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, File file2) {
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel fileChannel = null;
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            fileChannel = new FileInputStream(file).getChannel();
            abstractInterruptibleChannel = new FileOutputStream(file2).getChannel();
            ((FileChannel)abstractInterruptibleChannel).transferFrom(fileChannel, 0L, fileChannel.size());
        }
        finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (abstractInterruptibleChannel != null) {
                abstractInterruptibleChannel.close();
            }
        }
    }

    private void b(rs.p_x.C_e c_e, int n) {
        while (c_e.i + 10 < n * 8) {
            int n2;
            int n3 = c_e.k(11);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t-> index=" + n3);
            }
            if (n3 == 2047) break;
            if (kw_do[n3] == null) {
                C_Client_mc.kw_do[n3] = new rs.p_a.C_k();
                if (this.ky[n3] != null) {
                    if (rs.p_f.C_a.d.booleanValue()) {
                        cx.add("\t-> updatePlayer() call for index=" + n3);
                    }
                    kw_do[n3].a(this.ky[n3]);
                }
            }
            this.kv[this.ku++] = n3;
            rs.p_a.C_k c_k = kw_do[n3];
            c_k.P = ff;
            int n4 = c_e.k(1);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t-> update=" + n4);
            }
            if (n4 == 1) {
                this.kx[this.kw++] = n3;
            }
            int n5 = c_e.k(1);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t-> discardWalkingQueue=" + n5);
            }
            int n6 = c_e.k(5);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t-> y=" + n6);
            }
            if (n6 > 15) {
                n6 -= 32;
            }
            if ((n2 = c_e.k(5)) > 15) {
                n2 -= 32;
            }
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t-> x=" + n2);
            }
            c_k.a(C_Client_mc.eR.k[0] + n2, C_Client_mc.eR.l[0] + n6, n5 == 1);
        }
        c_e.K();
    }

    public boolean c(int n, int n2, int n3, int n4, int n5) {
        return Math.pow(n + n5 - n3, 2.0) + Math.pow(n2 + n5 - n4, 2.0) < Math.pow(n5, 2.0);
    }

    public boolean N() {
        if (rs.C_C_uc.hP >= ai - 21 && rs.C_C_uc.hP <= ai && rs.C_C_uc.hQ >= 0 && rs.C_C_uc.hQ <= 21) {
            return false;
        }
        return !this.v.h;
    }

    private void q(int n, int n2) {
        String string = "::clicktele " + n + " " + n2;
        fv.a(103);
        fv.b(string.length() - 1);
        fv.a(string.substring(2));
    }

    public void a(rs.p_o.p_a.p_a.C_a c_a) {
        if (!this.fc || this.lJ == null) {
            this.jd = 0;
            return;
        }
        c_a.a(fv);
        try {
            if (this.nD != null) {
                this.nD.a(fv.h(), C_Client_mc.fv.g);
                fv.i();
                this.lQ = 0;
            }
        }
        catch (IOException iOException) {
            this.x();
            System.out.println(iOException);
        }
        catch (Exception exception) {
            this.br();
            System.out.println(exception);
        }
        this.jd = 0;
    }

    private void bD() {
        if (this.lV != 0) {
            return;
        }
        if (this.hU > 0) {
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (hQ >= 120 && hQ <= 153 && hP >= ai - 192 && hP <= ai - 133) {
                    fv.a(185);
                    fv.d(152);
                    return;
                }
            } else if (hQ >= 109 && hQ <= 142 && hP >= 540 && hP <= 575) {
                fv.a(185);
                fv.d(152);
                return;
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (hQ >= 2 && hQ <= 42 && hP >= ai - 178 && hP <= ai - 140) {
                    this.ft = 0;
                    gC = 0.0;
                }
            } else if (hQ >= 4 && hQ <= 37 && hP >= 546 && hP <= 575) {
                this.ft = 0;
                gC = 0.0;
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (hQ >= 154 && hQ <= 173 && hP >= ai - 23 && hP <= ai - 6) {
                    this.v.b(this.v.e() == 2 ? 1 : (this.v.e() == 1 ? 0 : 2));
                    this.a("<img=8> You've changed your tracker overlay to: " + (this.v.g() ? "@blu@EXP counter" : (this.v.f() ? "@blu@Hit predictor" : "@blu@None")), 0, "");
                }
            } else if (hQ >= 25 && hQ <= 43 && hP >= 515 && hP <= 545) {
                this.v.b(this.v.e() == 2 ? 1 : (this.v.e() == 1 ? 0 : 2));
                this.a("<img=8> You've changed your tracker overlay to: " + (this.v.g() ? "@blu@EXP counter" : (this.v.f() ? "@blu@Hit predictor" : "@blu@None")), 0, "");
            }
            if (rs.p_l.p_e.C_q.a && this.hU == 1) {
                rs.p_f.C_a.aD = !rs.p_f.C_a.aD;
                rs.p_f.C_a.d();
            }
            if (this.v.h) {
                this.ar = "::adventurebook";
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (ah <= 649) {
                    if (hQ >= 186 && hQ <= 202 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                        this.ar = "::nurse";
                    }
                } else if (hQ >= 281 && hQ <= 301 && hP >= ai - 23 && hP <= ai - 6) {
                    this.ar = "::nurse";
                }
            } else if (hQ >= 141 && hQ <= 161 && hP >= 721 && hP <= 736) {
                this.ar = "::nurse";
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (hP >= ai - 119 && hP <= ai - 96 && hQ >= 166 && hQ <= 188) {
                    this.ar = "::donate";
                    if (this.cY == 3) {
                        this.cY = 4;
                    }
                }
            } else if (hP >= 718 && hP <= 744 && hQ >= 57 && hQ <= 79) {
                this.ar = "::donate";
                if (this.cY == 3) {
                    this.cY = 4;
                }
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (hP >= ai - 86 && hP <= ai - 62 && hQ >= 172 && hQ <= 198) {
                    this.ar = "::items";
                    if (this.cY == 4) {
                        this.cY = 0;
                    }
                }
            } else if (hP >= 710 && hP <= 733 && hQ >= 22 && hQ <= 48) {
                this.ar = "::items";
                if (this.cY == 4) {
                    this.cY = 0;
                }
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (ah <= 670) {
                    if (hQ >= 166 && hQ <= 182 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                        this.ar = "::bankall";
                        if (rs.p_f.C_a.aZ) {
                            this.ar = this.ar + " with_pet";
                        }
                    }
                } else if (hQ >= 313 && hQ <= 333 && hP >= ai - 23 && hP <= ai - 6) {
                    this.ar = "::bankall";
                    if (rs.p_f.C_a.aZ) {
                        this.ar = this.ar + " with_pet";
                    }
                }
            } else if (hQ >= 116 && hQ <= 134 && hP >= 744 && hP <= 759) {
                this.ar = "::bankall";
                if (rs.p_f.C_a.aZ) {
                    this.ar = this.ar + " with_pet";
                }
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (hQ >= 219 && hQ <= 238 && hP >= ai - 23 && hP <= ai - 6) {
                    this.ar = "::epicbosses";
                }
            } else if (hQ >= 89 && hQ <= 107 && hP >= 744 && hP <= 759) {
                this.ar = "::epicbosses";
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (ah <= 609) {
                    if (hQ >= 219 && hQ <= 238 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                        this.ar = "::refill";
                    }
                } else if (hQ >= 250 && hQ <= 269 && hP >= ai - 23 && hP <= ai - 6) {
                    this.ar = "::refill";
                }
            } else if (hQ >= 141 && hQ <= 161 && hP >= 744 && hP <= 759) {
                this.ar = "::refill";
            }
            if (rs.p_f.C_a.ai == C_a.c.b) {
                if (hQ >= 186 && hQ <= 205 && hP >= ai - 23 && hP <= ai - 6) {
                    SwingUtilities.invokeLater(() -> ((C_f)rs.p_p.C_a.c().getInstance(C_f.class)).g());
                }
            } else if (hQ >= 11 && hQ <= 30 && hP >= 736 && hP <= 757) {
                SwingUtilities.invokeLater(() -> ((C_f)rs.p_p.C_a.c().getInstance(C_f.class)).g());
            }
        }
        if (this.hU == 1) {
            int n;
            int n2 = this.hV - 25 - 547;
            int n3 = this.hW - 5 - 13;
            if (rs.p_f.C_a.ai != C_a.c.a) {
                n2 = this.hV - (ai - 182 + 26);
                n3 = this.hW - 15;
            }
            if (this.c(-6, -6, n2, n3, 76) && this.N()) {
                n2 -= 73;
                n3 -= 75;
                n = this.ft + this.oa & 0x7FF;
                int n4 = C_E_uc.v[n];
                int n5 = C_E_uc.w[n];
                n4 = n4 * (this.fh + 256) >> 8;
                n5 = n5 * (this.fh + 256) >> 8;
                int n6 = n3 * n4 + n2 * n5 >> 11;
                int n7 = n3 * n5 - n2 * n4 >> 11;
                int n8 = C_Client_mc.eR.ac + n6 >> 7;
                int n9 = C_Client_mc.eR.ad - n7 >> 7;
                if (rs.p_l.C_j.c(cT) && ch) {
                    this.q(eh + n8, ei + n9);
                } else {
                    boolean bl = this.a(1, 0, 0, 0, C_Client_mc.eR.l[0], 0, 0, n9, C_Client_mc.eR.k[0], true, n8);
                    if (bl) {
                        fv.b(n2);
                        fv.b(n3);
                        fv.d(this.ft);
                        fv.b(57);
                        fv.b(this.oa);
                        fv.b(this.fh);
                        fv.b(89);
                        fv.d(C_Client_mc.eR.ac);
                        fv.d(C_Client_mc.eR.ad);
                        fv.b(this.oB);
                        fv.b(63);
                    }
                }
            }
            if (++ne > 1151) {
                ne = 0;
                fv.a(246);
                fv.b(0);
                n = C_Client_mc.fv.h;
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.b(101);
                }
                fv.b(197);
                fv.d((int)(Math.random() * 65536.0));
                fv.b((int)(Math.random() * 256.0));
                fv.b(67);
                fv.d(14214);
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.d(29487);
                }
                fv.d((int)(Math.random() * 65536.0));
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.b(220);
                }
                fv.b(180);
                fv.j(C_Client_mc.fv.h - n);
            }
        }
    }

    public String h(int n) {
        if (n < 999999999) {
            return String.valueOf(n);
        }
        return "*";
    }

    private void bE() {
        int n;
        Graphics graphics = this.B().getGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, 765, 503);
        this.v(1);
        if (this.kQ) {
            this.jK = false;
            graphics.setFont(new Font("Helvetica", 1, 16));
            graphics.setColor(Color.yellow);
            n = 35;
            graphics.drawString("Sorry, an error has occured whilst loading SpawnPK", 30, n);
            graphics.setColor(Color.white);
            graphics.drawString("To fix this try the following (in order):", 30, n += 50);
            graphics.setColor(Color.white);
            graphics.setFont(new Font("Helvetica", 1, 12));
            graphics.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, n += 50);
            graphics.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, n += 30);
            graphics.drawString("3: Try using a different game-world", 30, n += 30);
            graphics.drawString("4: Try rebooting your computer", 30, n += 30);
            graphics.drawString("5: Try selecting a different version of Java from the play-game menu", 30, n += 30);
        }
        if (this.nI) {
            this.jK = false;
            graphics.setFont(new Font("Helvetica", 1, 20));
            graphics.setColor(Color.white);
            graphics.drawString("Error - unable to load game!", 50, 50);
            graphics.drawString("To play RuneScape make sure you play from", 50, 100);
            graphics.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.ov) {
            this.jK = false;
            graphics.setColor(Color.yellow);
            n = 35;
            graphics.drawString("Error a copy of RuneScape already appears to be loaded", 30, n);
            graphics.setColor(Color.white);
            graphics.drawString("To fix this try the following (in order):", 30, n += 50);
            graphics.setColor(Color.white);
            graphics.setFont(new Font("Helvetica", 1, 12));
            graphics.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, n += 50);
            graphics.drawString("2: Try rebooting your computer, and reloading", 30, n += 30);
            n += 30;
        }
    }

    @Override
    public URL getCodeBase() {
        if (rs.p_v.C_a.h != null) {
            return rs.p_v.C_a.h.getCodeBase();
        }
        try {
            if (this.hH != null) {
                return new URL("http://" + rs.p_f.C_a.j + ":" + (80 + dL));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private void bF() {
        for (int i = 0; i < this.cB; ++i) {
            int n = this.cC[i];
            rs.p_a.C_j c_j = this.cA[n];
            if (c_j != null) {
                this.b(c_j);
            }
            if (c_j.aG.x == 1552L) {
                c_j.s = 512;
            }
            if (c_j.aG.x == 2476L || c_j.aG.x == 1208L || c_j.aG.x == 8163L) {
                c_j.s = 1534;
            }
            if (c_j.aG.x == 4502L) {
                c_j.s = 1534;
            }
            if (c_j.aG.x == 251L) {
                c_j.s = 1534;
            }
            if (c_j.aG.x == 212L || c_j.aG.x == 8030L) {
                c_j.s = 512;
            }
            if (c_j.aG.x == 401L) {
                c_j.s = 512;
            }
            if (c_j.aG.x == 410L || c_j.aG.x == 6184L) {
                c_j.s = 512;
            }
            if (c_j.aG.x == 2790L) {
                c_j.s = 1784;
            }
            if (c_j.aG.x == 2165L) {
                c_j.s = 1334;
            }
            if (c_j.aG.x == 5942L) {
                c_j.s = 512;
            }
            if (c_j.aG.x == 8032L) {
                c_j.s = 512;
            }
            if (c_j.aG.x == 8000L) {
                c_j.s = 512;
            }
            if (c_j.aG.x != 4247L && c_j.aG.x != 4250L) continue;
            c_j.s = 1003;
        }
    }

    private void b(rs.p_a.C_c c_c) {
        if (c_c.ac < 128 || c_c.ad < 128 || c_c.ac >= 13184 || c_c.ad >= 13184) {
            c_c.F = -1;
            c_c.z = -1;
            c_c.Z = 0;
            c_c.aa = 0;
            c_c.ac = c_c.k[0] * 128 + c_c.S * 64;
            c_c.ad = c_c.l[0] * 128 + c_c.S * 64;
            c_c.e();
        }
        if (c_c == eR && (c_c.ac < 1536 || c_c.ad < 1536 || c_c.ac >= 11776 || c_c.ad >= 11776)) {
            c_c.F = -1;
            c_c.z = -1;
            c_c.Z = 0;
            c_c.aa = 0;
            c_c.ac = c_c.k[0] * 128 + c_c.S * 64;
            c_c.ad = c_c.l[0] * 128 + c_c.S * 64;
            c_c.e();
        }
        if (c_c.Z > ff) {
            this.c(c_c);
        } else if (c_c.aa >= ff) {
            this.d(c_c);
        } else {
            this.e(c_c);
        }
        this.a(c_c);
        this.f(c_c);
    }

    private void c(rs.p_a.C_c c_c) {
        int n = c_c.Z - ff;
        int n2 = c_c.V * 128 + c_c.S * 64;
        int n3 = c_c.X * 128 + c_c.S * 64;
        c_c.ac += (n2 - c_c.ac) / n;
        c_c.ad += (n3 - c_c.ad) / n;
        c_c.n = 0;
        if (c_c.ab == 0) {
            c_c.s = 1024;
        }
        if (c_c.ab == 1) {
            c_c.s = 1536;
        }
        if (c_c.ab == 2) {
            c_c.s = 0;
        }
        if (c_c.ab == 3) {
            c_c.s = 512;
        }
    }

    private void d(rs.p_a.C_c c_c) {
        int n = c_c.aa - c_c.Z;
        int n2 = ff - c_c.Z;
        int n3 = c_c.V * 128 + c_c.S * 64;
        int n4 = c_c.X * 128 + c_c.S * 64;
        int n5 = c_c.W * 128 + c_c.S * 64;
        int n6 = c_c.Y * 128 + c_c.S * 64;
        c_c.ac = (n3 * (n - n2) + n5 * n2) / n;
        c_c.ad = (n4 * (n - n2) + n6 * n2) / n;
        c_c.n = 0;
        if (c_c.ab == 0) {
            c_c.s = 1024;
        }
        if (c_c.ab == 1) {
            c_c.s = 1536;
        }
        if (c_c.ab == 2) {
            c_c.s = 0;
        }
        if (c_c.ab == 3) {
            c_c.s = 512;
        }
        c_c.ae = c_c.s;
    }

    private void e(rs.p_a.C_c c_c) {
        c_c.w = c_c.t;
        if (c_c.E == 0) {
            c_c.n = 0;
            return;
        }
        if (c_c.F != -1 && c_c.I == 0) {
            rs.p_d.C_a c_a = c_c.d()[c_c.F];
            if (c_c.U > 0 && c_a.o == 0) {
                ++c_c.n;
                return;
            }
            if (c_c.U <= 0 && c_a.p == 0) {
                ++c_c.n;
                return;
            }
        }
        int n = c_c.ac;
        int n2 = c_c.ad;
        int n3 = c_c.k[c_c.E - 1] * 128 + c_c.S * 64;
        int n4 = c_c.l[c_c.E - 1] * 128 + c_c.S * 64;
        if (n3 - n > 256 || n3 - n < -256 || n4 - n2 > 256 || n4 - n2 < -256) {
            c_c.ac = n3;
            c_c.ad = n4;
            return;
        }
        c_c.s = n < n3 ? (n2 < n4 ? 1280 : (n2 > n4 ? 1792 : 1536)) : (n > n3 ? (n2 < n4 ? 768 : (n2 > n4 ? 256 : 512)) : (n2 < n4 ? 1024 : 0));
        int n5 = c_c.s - c_c.ae & 0x7FF;
        if (n5 > 1024) {
            n5 -= 2048;
        }
        int n6 = c_c.ah;
        if (n5 >= -256 && n5 <= 256) {
            n6 = c_c.ag;
        } else if (n5 >= 256 && n5 < 768) {
            n6 = c_c.aj;
        } else if (n5 >= -768 && n5 <= -256) {
            n6 = c_c.ai;
        }
        if (n6 == -1) {
            n6 = c_c.ag;
        }
        c_c.w = n6;
        int n7 = 4;
        if (c_c.ae != c_c.s && c_c.m == -1 && c_c.o != 0) {
            n7 = 2;
        }
        if (c_c.E > 2) {
            n7 = 6;
        }
        if (c_c.E > 3) {
            n7 = 8;
        }
        if (c_c.n > 0 && c_c.E > 1) {
            n7 = 8;
            --c_c.n;
        }
        if (c_c.af[c_c.E - 1]) {
            n7 <<= 1;
        }
        if (n7 >= 8 && (c_c.w == c_c.ag || c_c.m != -1) && c_c.p != -1) {
            c_c.w = c_c.p;
        }
        if (n < n3) {
            c_c.ac += n7;
            if (c_c.ac > n3) {
                c_c.ac = n3;
            }
        } else if (n > n3) {
            c_c.ac -= n7;
            if (c_c.ac < n3) {
                c_c.ac = n3;
            }
        }
        if (n2 < n4) {
            c_c.ad += n7;
            if (c_c.ad > n4) {
                c_c.ad = n4;
            }
        } else if (n2 > n4) {
            c_c.ad -= n7;
            if (c_c.ad < n4) {
                c_c.ad = n4;
            }
        }
        if (c_c.ac == n3 && c_c.ad == n4) {
            --c_c.E;
            if (c_c.U > 0) {
                --c_c.U;
            }
        }
    }

    public void a(rs.p_a.C_c c_c) {
        int n;
        int n2;
        int n3;
        rs.p_a.C_j c_j;
        if (c_c.o == 0) {
            return;
        }
        if (c_c.m != -1 && c_c.m < 32768 && (c_j = this.cA[c_c.m]) != null) {
            n3 = c_c.ac - c_j.ac;
            n2 = c_c.ad - c_j.ad;
            if (n3 != 0 || n2 != 0) {
                c_c.s = (int)(Math.atan2(n3, n2) * 325.949) & 0x7FF;
            }
        }
        if (c_c.m >= 32768) {
            rs.p_a.C_k c_k;
            int n4 = c_c.m - 32768;
            if (n4 == di) {
                n4 = 2047;
            }
            if ((c_k = kw_do[n4]) != null) {
                n2 = c_c.ac - c_k.ac;
                int n5 = c_c.ad - c_k.ad;
                if (n2 != 0 || n5 != 0) {
                    c_c.s = (int)(Math.atan2(n2, n5) * 325.949) & 0x7FF;
                }
            }
        }
        if (!(c_c.Q == 0 && c_c.R == 0 || c_c.E != 0 && c_c.n <= 0)) {
            int n6 = c_c.ac - (c_c.Q - eh - eh) * 64;
            n3 = c_c.ad - (c_c.R - ei - ei) * 64;
            if (n6 != 0 || n3 != 0) {
                c_c.s = (int)(Math.atan2(n6, n3) * 325.949) & 0x7FF;
            }
            c_c.Q = 0;
            c_c.R = 0;
        }
        if ((n = c_c.s - c_c.ae & 0x7FF) != 0) {
            c_c.ae = n < c_c.o || n > 2048 - c_c.o ? c_c.s : (n > 1024 ? (c_c.ae -= c_c.o) : (c_c.ae += c_c.o));
            c_c.ae &= 0x7FF;
            if (c_c.w == c_c.t && c_c.ae != c_c.s) {
                if (c_c.u != -1) {
                    c_c.w = c_c.u;
                    return;
                }
                c_c.w = c_c.ag;
            }
        }
    }

    private void f(rs.p_a.C_c c_c) {
        int n;
        rs.p_d.C_a c_a;
        c_c.T = false;
        int n2 = c_c.w;
        if (n2 != -1) {
            c_a = c_c.d()[n2];
            if (c_c instanceof rs.p_a.C_k) {
                c_a = ((rs.p_a.C_k)c_c).c(n2);
            }
            if (c_a.b()) {
                ++c_c.x;
                n = c_a.c();
                if (c_c.x >= n) {
                    if (c_a.h > 0) {
                        c_c.x -= c_a.h;
                        if (c_a.q == 1) {
                            ++c_c.y;
                        }
                        if (c_c.x < 0 || c_c.x >= n || c_a.q == 1 && c_c.y >= c_a.n) {
                            c_c.x = 0;
                            c_c.y = 0;
                        }
                    } else {
                        c_c.y = 0;
                        c_c.x = 0;
                    }
                }
            } else {
                ++c_c.y;
                if (c_c.x < c_a.d && c_c.y > c_a.a(c_c.x)) {
                    c_c.y = 1;
                    ++c_c.x;
                }
                if (c_c.x >= c_a.d) {
                    c_c.y = 1;
                    c_c.x = 0;
                }
            }
        }
        if (c_c.z != -1 && ff >= c_c.C) {
            if (c_c.A < 0) {
                c_c.A = 0;
            }
            if (!(c_a = rs.p_d.C_x.c[c_c.z].g).b()) {
                ++c_c.B;
                while (c_c.A < c_a.d && c_c.B > c_a.a(c_c.A)) {
                    c_c.B -= c_a.a(c_c.A);
                    ++c_c.A;
                }
                if (c_c.A >= c_a.d && (c_c.A < 0 || c_c.A >= c_a.d)) {
                    c_c.z = -1;
                }
            } else {
                ++c_c.A;
                n = c_a.c();
                if (c_c.A >= n && (c_c.A < 0 || c_c.A >= n)) {
                    c_c.z = -1;
                }
            }
        }
        if (c_c.F != -1 && c_c.I <= 1) {
            c_a = c_c.d()[c_c.F];
            if (c_a == null) {
                System.out.println("NULLED ANIM: " + c_c.F);
            }
            if (c_a.o == 1 && c_c.U > 0 && c_c.Z <= ff && c_c.aa < ff) {
                c_c.I = 1;
                return;
            }
        }
        if (c_c.F != -1 && c_c.I == 0) {
            c_a = c_c.d()[c_c.F];
            if (c_a.b()) {
                ++c_c.G;
                n = c_a.c();
                if (c_c.G >= n) {
                    c_c.G -= c_a.h;
                    ++c_c.J;
                    if (c_c.J >= c_a.n) {
                        c_c.F = -1;
                    } else if (c_c.G < 0 || c_c.G >= n) {
                        c_c.F = -1;
                    }
                }
            } else {
                ++c_c.H;
                while (c_c.G < c_a.d && c_c.H > c_a.a(c_c.G)) {
                    c_c.H -= c_a.a(c_c.G);
                    ++c_c.G;
                }
                if (c_c.G >= c_a.d) {
                    c_c.G -= c_a.h;
                    ++c_c.J;
                    if (c_c.J >= c_a.n) {
                        c_c.F = -1;
                    }
                    if (c_c.G < 0 || c_c.G >= c_a.d) {
                        c_c.F = -1;
                    }
                }
            }
            c_c.T = c_a.j;
        }
        if (c_c.I > 0) {
            --c_c.I;
        }
    }

    public void O() {
    }

    public void P() {
        if (rs.p_l.p_b.C_a.b()) {
            return;
        }
        int n = !C_Client_mc.ai() ? 516 : ai - 247;
        int n2 = !C_Client_mc.ai() ? 168 : ah - 335;
        boolean bl = false;
        if (rs.p_f.C_a.ai == C_a.c.a || rs.p_f.C_a.ai != C_a.c.a && !bl) {
            for (int i = 0; i < this.v.a.length; ++i) {
                if (eT[this.jh[i]] == -1 || this.jg[i] == -1) continue;
                this.v.a[this.jg[i]].f(this.je[i] + n, this.jf[i] + n2);
            }
        } else if (bl && ai < 1000) {
            int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, -1, 8, 9, 7, 11, 12, 13};
            int[] nArray2 = new int[]{219, 189, 156, 126, 93, 62, 30, 219, 189, 156, 124, 92, 59, 28};
            int[] nArray3 = new int[]{67, 69, 67, 69, 72, 72, 69, 32, 29, 29, 32, 30, 33, 31, 32};
            for (int i = 0; i < this.v.a.length; ++i) {
                if (eT[this.jh[i]] == -1 || nArray[i] == -1) continue;
                this.v.a[nArray[i]].f(ai - nArray2[i], ah - nArray3[i]);
            }
        } else if (bl && ai >= 1000) {
            int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, -1, 8, 9, 7, 11, 12, 13};
            int[] nArray4 = new int[]{50, 80, 114, 143, 176, 208, 240, 242, 273, 306, 338, 370, 404, 433};
            int[] nArray5 = new int[]{30, 32, 30, 32, 34, 34, 32, 32, 29, 29, 32, 31, 32, 32, 32};
            for (int i = 0; i < this.v.a.length; ++i) {
                if (eT[this.jh[i]] == -1 || nArray[i] == -1) continue;
                this.v.a[nArray[i]].f(ai - 461 + nArray4[i], ah - nArray5[i]);
            }
        }
        if (rs.p_l.p_f.p_a.p_i.C_b.n() != null && ff % 20 < 10) {
            switch (rs.p_l.p_f.p_a.p_i.C_b.n()) {
                case a: {
                    if (fL == 2) break;
                    rs.p_l.p_f.p_a.p_i.C_e.b.a().f(n + 83 - 30, n2 + 7 - 4);
                    break;
                }
                case b: {
                    if (fL == 3) break;
                    rs.p_l.p_f.p_a.p_i.C_e.b.a().f(n + 114 - 30, n2 + 7 - 4);
                    break;
                }
                case c: {
                    if (fL == 4) break;
                    rs.p_l.p_f.p_a.p_i.C_e.b.a().f(n + 146 - 30, n2 + 7 - 4);
                    break;
                }
                case d: {
                    if (fL == 6) break;
                    rs.p_l.p_f.p_a.p_i.C_e.b.a().f(n + 214 - 30, n2 + 7 - 4);
                }
            }
        }
    }

    private void bG() {
        int n = !C_Client_mc.ai() ? 516 : ai - 247;
        int n2 = !C_Client_mc.ai() ? 168 : ah - 335;
        boolean bl = false;
        boolean bl2 = false;
        if (rs.p_f.C_a.ai == C_a.c.a || rs.p_f.C_a.ai != C_a.c.a && !bl) {
            if (eT[fL] != -1 && fL != 15) {
                this.H[this.jk[fL]].f(this.ji[fL] + n, this.jj[fL] + n2);
            }
        } else if (bl && ai < 1000) {
            int[] nArray = new int[]{226, 194, 162, 130, 99, 65, 34, 219, 195, 161, 130, 98, 65, 33};
            int[] nArray2 = new int[]{73, 73, 73, 73, 73, 73, 73, -1, 37, 37, 37, 37, 37, 37, 37};
            if (eT[fL] != -1 && fL != 10 && bl2) {
                if (fL == 7) {
                    this.H[39].f(ai - 130, ah - 37);
                }
                this.H[39].f(ai - nArray[fL], ah - nArray2[fL]);
            }
        } else if (bl && ai >= 1000) {
            int[] nArray = new int[]{417, 385, 353, 321, 289, 256, 224, 129, 193, 161, 130, 98, 65, 33};
            if (eT[fL] != -1 && fL != 10 && bl2) {
                this.H[39].f(ai - nArray[fL], ah - 37);
            }
        }
    }

    public void Q() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = !C_Client_mc.ai() ? 516 : ai - 240;
        int n7 = !C_Client_mc.ai() ? 168 : ah - 335;
        C_E_uc.x = this.fp;
        if (rs.p_f.C_a.ai == C_a.c.a) {
            this.H[21].f(0 + n6, 0 + n7);
        } else if (rs.p_f.C_a.ai != C_a.c.a) {
            rs.p_l.C_c.d(ai - 217, ah - 305, 195, 270, 4076841, rs.p_f.C_a.ai == C_a.c.b ? 150 : 256);
            this.H[47].f(n6, n7);
        } else {
            n5 = 1;
            n4 = 1;
            if (ai >= 1000) {
                if (n5 != 0) {
                    rs.p_l.C_c.d(ai - 197, ah - 304, 197, 265, 4076841, n4 != 0 ? 80 : 256);
                    this.H[50].f(ai - 204, ah - 311);
                }
                n3 = ai - 417;
                n2 = ah - 37;
                for (n = 0; n3 <= ai - 30 && n < 13; n3 += 32, ++n) {
                    this.H[46].f(n3, n2);
                }
            } else if (ai < 1000) {
                if (n5 != 0) {
                    rs.p_l.C_c.d(ai - 197, ah - 341, 195, 265, 4076841, n4 != 0 ? 80 : 256);
                    this.H[50].f(ai - 204, ah - 348);
                }
                n3 = ai - 226;
                n2 = ah - 73;
                for (n = 0; n3 <= ai - 32 && n < 7; n3 += 32, ++n) {
                    this.H[46].f(n3, n2);
                }
                n3 = ai - 226;
                n2 = ah - 37;
                for (n = 0; n3 <= ai - 32 && n < 7; n3 += 32, ++n) {
                    this.H[46].f(n3, n2);
                }
            }
        }
        if (this.fu == -1) {
            this.bG();
            this.P();
        }
        n5 = rs.p_f.C_a.ai == C_a.c.a ? 31 + n6 : ai - 215;
        int n8 = n4 = rs.p_f.C_a.ai == C_a.c.a ? 37 + n7 : ah - 298;
        if (this.fu != -1) {
            this.a(0, n5, rs.p_n.C_e.H[this.fu], n4);
        } else if (eT[fL] != -1) {
            this.a(0, n5, rs.p_n.C_e.H[eT[fL]], n4);
        }
        n3 = rs.p_f.C_a.ai == C_a.c.a ? -526 : -10;
        n2 = rs.p_f.C_a.ai == C_a.c.a ? -178 : -10;
        rs.p_n.p_b.p_a.C_c.d();
        if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Spawn this item")) {
            if (rs.p_l.C_j.b(cT)) {
                n = br + 5;
                if (br == 64036) {
                    n = 70002;
                }
                if (C_af.e.get(n) != null) {
                    int n9 = C_af.e.get(n).b();
                    this.b(hP + n3, hQ + n2, " @gre@Item ID: @yel@" + n9 + "    ");
                    rs.p_n.C_e.H[64033].at = "@gre@Last hovered: @yel@" + n9;
                } else {
                    this.b(hP + n3, hQ + n2, " Right-click @yel@quick spawn    ");
                }
            } else {
                n = br + 5;
                if (br == 64036) {
                    n = 70002;
                }
                boolean bl = false;
                if (n >= 0 && n <= rs.p_n.C_e.H.length - 1 && rs.p_n.C_e.H[n] != null && rs.p_n.C_e.H[n].at != null && rs.p_n.C_e.H[n].at.contains("@gre@")) {
                    this.b(hP + n3, hQ + n2, " <img=25> @or2@Unspawnable   ");
                    bl = true;
                }
                if (!bl) {
                    this.b(hP + n3, hQ + n2, " Right-click @yel@quick spawn    ");
                }
            }
        }
        if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Lite mode")) {
            this.b(hP + n3, hQ + n2, " Toggle \"Lite mode\"\nExperiencing lag? This mode will\nreduce your graphic settings\nand improve performance!");
        }
        if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Resizable mode")) {
            this.b(hP + n3, hQ + n2, " Resizable mode\nToggle this setting\nif you want to experience\nSpawnPK in fullscreen!");
        }
        if (this.eV >= 2 && this.fx[this.eV - 1] != null) {
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open achievement tab")) {
                this.b(hP + n3, hQ + n2, " Achievements");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open events")) {
                this.b(hP + n3, hQ + n2, " World events");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open guides")) {
                this.b(hP + n3, hQ + n2, " Knowledgebase");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open account information")) {
                this.b(hP + n3, hQ + n2, " Account information");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Open pk ratings")) {
                this.b(hP + n3, hQ + n2, " PK ratings");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("Collect reward")) {
                this.b(hP + n3, hQ + n2, " <img=9> Collect ");
            }
            if (this.fx[this.eV - 1].equalsIgnoreCase("View information")) {
                this.b(hP + n3, hQ + n2, " <img=40>  Information ");
            }
        }
        if (this.cY > 0 && this.fu == -1 && ff % 20 < 10) {
            if (this.cY == 1) {
                if (fL != 11) {
                    if (rs.p_f.C_a.ai == C_a.c.b) {
                        this.cU.f(ai - 101, ah - 70);
                    } else {
                        this.cU.f(146, 265);
                    }
                } else if (rs.p_f.C_a.ai == C_a.c.b) {
                    this.cU.f(ai - 213, ah - 280);
                } else {
                    this.cU.f(33, 55);
                }
            } else if (this.cY == 2) {
                if (fL != 6) {
                    if (rs.p_f.C_a.ai == C_a.c.b) {
                        this.cV.f(ai - 35, ah - 300);
                    } else {
                        this.cV.f(212, 38);
                    }
                } else if (rs.p_f.C_a.ai == C_a.c.b) {
                    this.cU.f(ai - 182, ah - 290);
                } else {
                    this.cU.f(65, 44);
                }
            }
        }
        C_e.d().a(C_a.t);
        C_e.d().a(C_a.u);
        if (dj) {
            this.b(0, 0);
        }
        C_E_uc.x = this.fq;
    }

    private void bH() {
        rs.p_l.p_b.C_a.a(this);
    }

    private boolean d(rs.p_n.C_e c_e) {
        int n = c_e.J;
        if (n >= 1 && n <= 200 || n >= 701 && n <= 900) {
            n = n >= 801 ? (n -= 701) : (n >= 701 ? (n -= 601) : (n >= 101 ? (n -= 101) : --n));
            if (ag) {
                this.fx[this.eV] = "Message @whi@" + this.mT[n];
                this.eI[this.eV] = 639;
                ++this.eV;
                this.fx[this.eV] = "Remove @whi@" + this.mT[n];
                this.eI[this.eV] = 792;
                ++this.eV;
            } else {
                this.fx[this.eV] = "Remove @whi@" + this.mT[n];
                this.eI[this.eV] = 792;
                ++this.eV;
                this.fx[this.eV] = "Message @whi@" + this.mT[n];
                this.eI[this.eV] = 639;
                ++this.eV;
            }
            return true;
        }
        if (n >= 401 && n <= 500) {
            this.fx[this.eV] = "Remove @whi@" + c_e.at;
            this.eI[this.eV] = 322;
            ++this.eV;
            return true;
        }
        return false;
    }

    public void R() {
        rs.p_a.C_b c_b = (rs.p_a.C_b)this.et.b();
        while (c_b != null) {
            if (c_b.h != dw || c_b.m) {
                c_b.b();
            } else if (ff >= c_b.l) {
                c_b.a(this.dE);
                if (c_b.m) {
                    c_b.b();
                } else {
                    this.dF.a(c_b.h, 0, c_b.k, -1, c_b.j, 60, c_b.i, c_b, false);
                }
            }
            c_b = (rs.p_a.C_b)this.et.d();
        }
    }

    public boolean i(int n) {
        boolean bl = false;
        if (n <= 0) {
            return true;
        }
        rs.p_n.C_e c_e = rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n - 1][1]];
        bl = c_e.az == null || c_e.az[0] <= 0;
        if (!bl) {
            return true;
        }
        c_e = rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][1]];
        return c_e.az != null && c_e.az[0] > 0;
    }

    public boolean j(int n) {
        if (n == 54195 && cH == C_aD_mc.bI) {
            return false;
        }
        if ((n >= 45694 && n <= 45701 || n >= 45149 && n <= 45156 || n >= 45751 && n <= 45758 || n >= 45743 && n <= 45750) && C_Client_mc.eR.br[3] != 21208) {
            return false;
        }
        if (eT[0] == 1829) {
            if ((n == 12055 || n == 12081) && C_Client_mc.eR.br[3] != 12303 && C_Client_mc.eR.br[3] != 13416 && C_Client_mc.eR.br[3] != 27718) {
                return false;
            }
            if ((n == 12056 || n == 12091) && C_Client_mc.eR.br[3] != 23673) {
                return false;
            }
            if ((n == 12054 || n == 12071) && C_Client_mc.eR.br[3] != 21544 && C_Client_mc.eR.br[3] != 21545 && C_Client_mc.eR.br[3] != 21546 && C_Client_mc.eR.br[3] != 21547 && C_Client_mc.eR.br[3] != 25934 && C_Client_mc.eR.br[3] != 25935) {
                return false;
            }
        }
        return true;
    }

    public void a(int n, int n2, rs.p_n.C_e c_e, int n3) {
        rs.p_l.p_b.C_d.a(this, n, n2, c_e, n3);
    }

    public void f(int n, int n2) {
        rs.p_l.C_c.a(71, n2 - 1, n - 2, 7496785, 1);
        rs.p_l.C_c.a(69, n2, n + 174, 7496785, 1);
        rs.p_l.C_c.a(1, n2 - 2, n - 2, 7496785, 178);
        rs.p_l.C_c.a(1, n2 + 68, n, 7496785, 174);
        rs.p_l.C_c.a(71, n2 - 1, n - 1, 3025699, 1);
        rs.p_l.C_c.a(71, n2 - 1, n + 175, 3025699, 1);
        rs.p_l.C_c.a(1, n2 - 1, n, 3025699, 175);
        rs.p_l.C_c.a(1, n2 + 69, n, 3025699, 175);
        rs.p_l.C_c.d(n, n2, 174, 68, 0, 220);
    }

    public final String k(int n) {
        if (n >= 0 && n < 10000) {
            return String.valueOf(n);
        }
        if (n >= 10000 && n < 10000000) {
            return n / 1000 + "K";
        }
        if (n >= 10000000 && n < 999999999) {
            return n / 1000000 + "M";
        }
        if (n >= 999999999) {
            return "*";
        }
        return "?";
    }

    public void c(int n, int n2, String string) {
        int n3;
        String[] stringArray = string.split("\n");
        int n4 = stringArray.length * 16 + 3;
        int n5 = this.gi.a(stringArray[0]) + 6;
        for (n3 = 1; n3 < stringArray.length; ++n3) {
            if (n5 > this.gi.a(stringArray[n3]) + 6) continue;
            n5 = this.gi.a(stringArray[n3]) + 6;
        }
        rs.p_l.C_c.a(n4, n2, n, 0xFFFFA0, n5);
        rs.p_l.C_c.d(n, n5, n4, 0, n2);
        n2 += 14;
        for (n3 = 0; n3 < stringArray.length; ++n3) {
            this.gi.a(false, n + 3, 0, stringArray[n3], n2);
            n2 += 16;
        }
    }

    public void l(int n) {
        this.jl = n;
        rs.p_n.C_e.H[5385].V = 0;
        rs.p_n.C_e.H[10324].E = rs.p_n.p_c.C_h.d;
        rs.p_n.C_e.H[10324].aG = rs.p_n.p_c.C_h.d;
        for (int[] nArray : rs.p_n.p_c.C_h.bI) {
            if (rs.p_n.C_e.H[nArray[1]].az[0] <= 0) {
                rs.p_n.C_e.H[nArray[0]].E = rs.p_n.p_c.C_h.g;
                continue;
            }
            rs.p_n.C_e.H[nArray[0]].E = rs.p_n.p_c.C_h.f;
            rs.p_n.C_e.H[nArray[0]].aG = rs.p_n.p_c.C_h.f;
        }
        if (n == -1) {
            rs.p_n.C_e.H[10324].E = rs.p_n.p_c.C_h.c;
            rs.p_n.C_e.H[10324].aG = rs.p_n.p_c.C_h.c;
        } else {
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][0]].E = rs.p_n.p_c.C_h.e;
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][0]].aG = rs.p_n.p_c.C_h.e;
        }
    }

    public void d(int n, int n2, int n3) {
        if (n2 <= 0) {
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][1]].az[0] = 0;
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][1]].ax[0] = 0;
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][0]].E = rs.p_n.p_c.C_h.g;
        } else {
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][1]].az[0] = n2 + 1;
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][1]].ax[0] = n3;
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][1]].bh = false;
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][0]].E = this.jl == n ? rs.p_n.p_c.C_h.e : rs.p_n.p_c.C_h.f;
            rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[n][0]].aG = this.jl == n ? rs.p_n.p_c.C_h.e : rs.p_n.p_c.C_h.f;
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        int n;
        super.mouseReleased(mouseEvent);
        int n2 = rs.p_f.C_a.ai == C_a.c.b ? ai / 2 - 356 : 0;
        int n3 = n = rs.p_f.C_a.ai == C_a.c.b ? ah / 2 - 230 : 0;
        if (this.eA == 2 && (this.ex == 5382 || this.ex >= 10335 && this.ex <= 10342) && rs.C_C_uc.hQ >= 40 + n && rs.C_C_uc.hQ <= 77 + n) {
            String string;
            String string2 = string = this.ex == 5382 ? "::setbanktab" : "::swapbanktab";
            if (rs.C_C_uc.hP >= 28 + n2 && rs.C_C_uc.hP <= 74 + n2) {
                ap = string + " " + this.ey + " 0" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.C_C_uc.hP >= 75 + n2 && rs.C_C_uc.hP <= 121 + n2) {
                ap = string + " " + this.ey + " 1" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.C_C_uc.hP >= 122 + n2 && rs.C_C_uc.hP <= 168 + n2) {
                ap = string + " " + this.ey + " 2" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.C_C_uc.hP >= 169 + n2 && rs.C_C_uc.hP <= 215 + n2) {
                ap = string + " " + this.ey + " 3" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.C_C_uc.hP >= 216 + n2 && rs.C_C_uc.hP <= 262 + n2) {
                ap = string + " " + this.ey + " 4" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.C_C_uc.hP >= 263 + n2 && rs.C_C_uc.hP <= 309 + n2) {
                ap = string + " " + this.ey + " 5" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.C_C_uc.hP >= 310 + n2 && rs.C_C_uc.hP <= 356 + n2) {
                ap = string + " " + this.ey + " 6" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.C_C_uc.hP >= 357 + n2 && rs.C_C_uc.hP <= 403 + n2) {
                ap = string + " " + this.ey + " 7" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
            if (rs.C_C_uc.hP >= 404 + n2 && rs.C_C_uc.hP <= 450 + n2) {
                ap = string + " " + this.ey + " 8" + (String)(this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
            }
        }
    }

    private void a(rs.p_l.C_a c_a) {
        int n;
        int n2;
        int n3;
        int n4 = 256;
        for (n3 = 0; n3 < this.nP.length; ++n3) {
            this.nP[n3] = 0;
        }
        for (n3 = 0; n3 < 5000; ++n3) {
            int n5 = (int)(Math.random() * 128.0 * (double)n4);
            this.nP[n5] = (int)(Math.random() * 256.0);
        }
        for (n3 = 0; n3 < 20; ++n3) {
            for (int i = 1; i < n4 - 1; ++i) {
                for (n2 = 1; n2 < 127; ++n2) {
                    n = n2 + (i << 7);
                    this.nQ[n] = (this.nP[n - 1] + this.nP[n + 1] + this.nP[n - 128] + this.nP[n + 128]) / 4;
                }
            }
            int[] nArray = this.nP;
            this.nP = this.nQ;
            this.nQ = nArray;
        }
        if (c_a != null) {
            n3 = 0;
            for (int i = 0; i < c_a.k; ++i) {
                for (n2 = 0; n2 < c_a.j; ++n2) {
                    if (c_a.i[n3++] == 0) continue;
                    n = n2 + 16 + c_a.l;
                    int n6 = i + 16 + c_a.m;
                    int n7 = n + (n6 << 7);
                    this.nP[n7] = 0;
                }
            }
        }
    }

    private void a(int n, int n2, rs.p_x.C_e c_e, rs.p_a.C_k c_k) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (rs.p_f.C_a.f.booleanValue()) {
            cx.add("Parsing synchronization mask..");
        }
        if ((n & 0x400) != 0) {
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting forcemovement block..");
            }
            c_k.V = c_e.P();
            c_k.X = c_e.P();
            c_k.W = c_e.P();
            c_k.Y = c_e.P();
            c_k.Z = c_e.U() + ff;
            c_k.aa = c_e.T() + ff;
            c_k.ab = c_e.P();
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->forceMovement direction=" + c_k.ab);
            }
            c_k.e();
        }
        if ((n & 0x100) != 0) {
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting GFX block..");
            }
            c_k.z = c_e.S();
            n6 = c_e.D();
            if (c_k.z == 1950 && rs.p_f.C_a.aj) {
                c_k.z = 1171;
            }
            if (c_k.z == 1339 && rs.p_f.C_a.aV) {
                c_k.z = 1222;
            }
            if (c_k.z == 1338 && rs.p_f.C_a.aV) {
                c_k.z = 1223;
            }
            if (c_k.z == 1340 && rs.p_f.C_a.aV) {
                c_k.z = 3001;
            }
            c_k.D = n6 >> 16;
            c_k.C = ff + (n6 & 0xFFFF);
            c_k.A = 0;
            c_k.B = 0;
            if (c_k.C > ff) {
                c_k.A = -1;
            }
            if (c_k.z == 65535) {
                c_k.z = -1;
            }
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->GFX=" + c_k.z);
            }
        }
        if ((n & 8) != 0) {
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting animation block..");
            }
            if ((n6 = c_e.S()) == 65535) {
                n6 = -1;
            }
            n5 = c_e.O();
            n4 = c_e.O();
            if (n6 > 0 && n6 < rs.p_d.C_a.a.length && n4 == 2 && rs.p_d.C_a.a[n6].k < 8) {
                rs.p_d.C_a.a[n6].k = 8;
                rs.p_d.C_a.c[n6].k = 8;
                rs.p_d.C_a.b[n6].k = 8;
            }
            if (n6 == c_k.F && n6 != -1) {
                n3 = rs.p_d.C_a.a[n6].q;
                if (n4 == 2) {
                    n3 = 1;
                }
                if (n3 == 1) {
                    c_k.G = 0;
                    c_k.H = 0;
                    c_k.I = n5;
                    c_k.J = 0;
                }
                if (n3 == 2) {
                    c_k.J = 0;
                }
            } else if (n6 == -1 || c_k.F == -1 || rs.p_d.C_a.a[n6].k >= rs.p_d.C_a.a[c_k.F].k) {
                c_k.F = n6;
                c_k.G = 0;
                c_k.H = 0;
                c_k.I = n5;
                c_k.J = 0;
                c_k.U = c_k.E;
            }
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->i2: " + n5);
            }
        }
        if ((n & 4) != 0) {
            String string;
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting forcechat block..");
            }
            if ((string = c_e.F()).charAt(0) == '~') {
                string = string.substring(1);
                c_k.aA = c_k.aA == 1 ? 2 : 1;
                c_k.az = System.currentTimeMillis() + 1200L;
            }
            if (!string.endsWith("__")) {
                c_k.q = string;
                c_k.v = 0;
                c_k.K = 0;
                c_k.O = 150;
            }
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->..done!");
            }
        }
        if ((n & 0x80) != 0) {
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting chat block..");
            }
            int n7 = c_e.S();
            n5 = c_e.B();
            n4 = c_e.O();
            n3 = c_e.h;
            if (c_k.aZ != null && c_k.bm) {
                long l2 = C_O_uc.a(c_k.d(true));
                boolean bl = false;
                if (!rs.p_l.C_j.a(n5)) {
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l2) continue;
                        bl = true;
                        break;
                    }
                }
                if (!bl && this.ou == 0) {
                    try {
                        this.jM.h = 0;
                        c_e.b(n4, 0, this.jM.g);
                        this.jM.h = 0;
                        String string = C_P_uc.a(n4, this.jM);
                        c_k.q = string = rs.p_d.C_c.b(string);
                        c_k.v = n7 >> 8;
                        c_k.aC = n5;
                        c_k.K = n7 & 0xFF;
                        c_k.O = 150;
                        if (n5 > 0) {
                            this.a(string, 1, "@cr" + n5 + "@" + c_k.d(true));
                        } else {
                            this.a(string, 2, c_k.d(true));
                        }
                    }
                    catch (Exception exception) {
                        rs.p_v.C_a.e("cde2");
                    }
                }
            }
            c_e.h = n3 + n4;
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->..done!");
            }
        }
        if ((n & 1) != 0) {
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting interaction bloc..");
            }
            c_k.m = c_e.S();
            if (c_k.m == 65535) {
                c_k.m = -1;
            }
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->interactingEntity=" + c_k.m);
            }
        }
        if ((n & 0x10) != 0) {
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting appearence block..");
            }
            int n8 = c_e.O();
            byte[] byArray = new byte[n8];
            rs.p_x.C_e c_e2 = new rs.p_x.C_e(byArray);
            c_e.a(n8, 0, byArray);
            this.ky[n2] = c_e2;
            c_k.a(c_e2);
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->..appearence block done!");
            }
        }
        if ((n & 2) != 0) {
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting turn to tile block..");
            }
            c_k.Q = c_e.U();
            c_k.R = c_e.S();
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->faceX=" + c_k.Q + " faceY" + c_k.R);
            }
        }
        if ((n & 0x20) != 0) {
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->Starting hits update block..");
            }
            int n9 = c_e.y();
            for (int i = 0; i < n9; ++i) {
                int n10 = c_e.o();
                n3 = c_e.y();
                int n11 = c_e.y();
                c_k.a(n3, n10, ff, n11);
            }
            c_k.L = ff + 300;
            c_k.M = c_e.o();
            c_k.N = c_e.o();
            if (rs.p_f.C_a.f.booleanValue()) {
                cx.add("\t\t->health=" + c_k.M + "/" + c_k.N);
            }
        }
    }

    public void S() {
        this.g(C_Client_mc.eR.ac, C_Client_mc.eR.ad);
    }

    public void g(int n, int n2) {
        try {
            int n3;
            int n4 = n + this.gq;
            int n5 = n2 + this.eU;
            if (this.eb - n4 < -500 || this.eb - n4 > 500 || this.ec - n5 < -500 || this.ec - n5 > 500) {
                this.eb = n4;
                this.ec = n5;
            }
            if (this.eb != n4) {
                this.eb += (n4 - this.eb) / 16;
            }
            if (this.ec != n5) {
                this.ec += (n5 - this.ec) / 16;
            }
            this.nM = this.hY[1] == 1 && !C_Client_mc.w.b ? (this.nM += (-24 - this.nM) / 2) : (this.hY[2] == 1 && !C_Client_mc.w.b ? (this.nM += (24 - this.nM) / 2) : (this.nM /= 2));
            if (this.hY[3] == 1 && !C_Client_mc.w.b) {
                if (rs.p_l.p_b.p_a.C_d.g() && ch) {
                    rs.p_l.p_b.p_a.C_d.b.i -= 5;
                } else {
                    this.nN += (12 - this.nN) / 2;
                }
            } else if (this.hY[4] == 1 && !C_Client_mc.w.b) {
                if (rs.p_l.p_b.p_a.C_d.g() && ch) {
                    rs.p_l.p_b.p_a.C_d.b.i += 5;
                } else {
                    this.nN += (-12 - this.nN) / 2;
                }
            } else {
                this.nN /= 2;
            }
            this.ft = this.ft + this.nM / 2 & 0x7FF;
            this.fs += this.nN / 2;
            if (this.fs < 128) {
                this.fs = 128;
            }
            if (this.fs > 383) {
                this.fs = 383;
            }
            int n6 = this.eb >> 7;
            int n7 = this.ec >> 7;
            int n8 = this.c(dw, this.ec, this.eb);
            int n9 = 0;
            if (n6 > 3 && n7 > 3 && n6 < 100 && n7 < 100) {
                for (n3 = n6 - 4; n3 <= n6 + 4; ++n3) {
                    for (int i = n7 - 4; i <= n7 + 4; ++i) {
                        int n10;
                        int n11 = dw;
                        if (n11 < 3 && (this.gc[1][n3][i] & 2) == 2) {
                            ++n11;
                        }
                        if ((n10 = n8 - this.fC[n11][n3][i]) <= n9) continue;
                        n9 = n10;
                    }
                }
            }
            if (++dZ > 1512) {
                dZ = 0;
                fv.a(77);
                fv.b(0);
                n3 = C_Client_mc.fv.h;
                fv.b((int)(Math.random() * 256.0));
                fv.b(101);
                fv.b(233);
                fv.d(45092);
                if ((int)(Math.random() * 2.0) == 0) {
                    fv.d(35784);
                }
                fv.b((int)(Math.random() * 256.0));
                fv.b(64);
                fv.b(38);
                fv.d((int)(Math.random() * 65536.0));
                fv.d((int)(Math.random() * 65536.0));
                fv.j(C_Client_mc.fv.h - n3);
            }
            if ((n3 = n9 * 192) > 98048) {
                n3 = 98048;
            }
            if (n3 < 32768) {
                n3 = 32768;
            }
            if (n3 > this.dQ) {
                this.dQ += (n3 - this.dQ) / 24;
                return;
            }
            if (n3 < this.dQ) {
                this.dQ += (n3 - this.dQ) / 80;
            }
        }
        catch (Exception exception) {
            rs.p_v.C_a.e("glfc_ex " + C_Client_mc.eR.ac + "," + C_Client_mc.eR.ad + "," + this.eb + "," + this.ec + "," + this.mx + "," + this.my + "," + eh + "," + ei);
            exception.printStackTrace();
            throw new RuntimeException("eek");
        }
    }

    @Override
    public void T() {
        if (this.ov || this.kQ || this.nI) {
            this.bE();
            return;
        }
        ++mr;
        if (!rs.p_l.p_b.C_a.a() && (fg += 0.05) >= Double.MAX_VALUE) {
            fg = 0.0;
        }
        if (!this.fc) {
            this.h(false);
            if (rs.p_k.C_e.a()) {
                this.a.g();
            }
        } else {
            this.ad();
            this.bH();
        }
        if ((bL += bM) >= 100) {
            bM = -1;
        } else if (bL <= 1) {
            bM = 1;
        }
        this.oc = 0;
    }

    private boolean i(String string) {
        if (string == null) {
            return false;
        }
        for (int i = 0; i < this.kA; ++i) {
            if (!string.equalsIgnoreCase(this.mT[i])) continue;
            return true;
        }
        return string.equalsIgnoreCase(C_Client_mc.eR.aZ);
    }

    private static String r(int n, int n2) {
        int n3 = n - n2;
        if (n3 < -9) {
            return "@red@";
        }
        if (n3 < -6) {
            return "@or3@";
        }
        if (n3 < -3) {
            return "@or2@";
        }
        if (n3 < 0) {
            return "@or1@";
        }
        if (n3 > 9) {
            return "@gre@";
        }
        if (n3 > 6) {
            return "@gr3@";
        }
        if (n3 > 3) {
            return "@gr2@";
        }
        if (n3 > 0) {
            return "@gr1@";
        }
        return "@yel@";
    }

    private void F(int n) {
        rs.p_v.C_a.m = n;
    }

    public String h(int n, int n2) {
        return rs.p_v.C_a.f() + "index" + n + "/" + (String)(n2 != -1 ? n2 + ".gz" : "");
    }

    public static String e(String string) {
        File file = new File(string);
        file.getName();
        int n = file.getName().lastIndexOf(46);
        if (0 < n && n <= file.getName().length() - 2) {
            return file.getName().substring(0, n);
        }
        return "";
    }

    public void m(int n) {
        if (!rs.p_f.C_a.d.booleanValue()) {
            return;
        }
        System.out.println("[Cache Repacking] Started repacking index " + n + ".");
        int n2 = new File(this.h(n, -1)).listFiles().length;
        File[] fileArray = new File(this.h(n, -1)).listFiles();
        int n3 = 0;
        try {
            for (int i = 0; i < n2; ++i) {
                if (fileArray[i].getName().contains(".jar")) continue;
                System.out.println("Packing: " + fileArray[i].toString());
                String string = C_Client_mc.e(fileArray[i].toString());
                int n4 = Integer.parseInt(C_Client_mc.e(fileArray[i].toString()));
                byte[] byArray = this.i(n, n4);
                boolean bl = false;
                if (n != 1 || rs.p_f.C_a.d.booleanValue()) {
                    // empty if block
                }
                if (bl) continue;
                if (byArray != null && byArray.length > 0) {
                    if (n == 1) {
                        File file;
                        File file2 = new File(rs.p_v.C_a.b() + "raws/" + n4 + ".dat");
                        if (file2.exists()) {
                            file2.delete();
                        }
                        if ((file = new File(rs.p_v.C_a.b() + "raws/" + n4)).exists()) {
                            file.delete();
                        }
                    }
                    ++n3;
                    C_Client_mc.ew.b.a()[n].a(byArray.length, byArray, n4);
                    continue;
                }
                System.out.println("[Cache] Unable to locate index #" + n4 + ".");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        String string = "unknown";
        if (n == 1) {
            string = "models";
        }
        if (n == 2) {
            string = "animations";
        }
        if (n == 3) {
            string = "sounds";
        }
        if (n == 4) {
            string = "maps";
        }
        if (n3 > 0) {
            System.out.println("[Cache] Repacked index #" + n + " (" + string + ") (Files: " + n3 + ")");
        }
    }

    public byte[] i(int n, int n2) {
        try {
            if (this.h(n, n2).length() <= 0 || this.h(n, n2) == null) {
                return null;
            }
            File file = new File(this.h(n, n2));
            byte[] byArray = new byte[(int)file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(byArray);
            fileInputStream.close();
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private void h(long l2) {
        try {
            int n;
            if (l2 == 0L) {
                return;
            }
            if (this.jD >= 100) {
                this.a("Your ignore list is full. Max of 100 hit", 0, "");
                return;
            }
            String string = C_O_uc.c(C_O_uc.a(l2));
            for (n = 0; n < this.jD; ++n) {
                if (this.kP[n] != l2) continue;
                this.a(string + " is already on your ignore list", 0, "");
                return;
            }
            for (n = 0; n < this.kA; ++n) {
                if (this.lg[n] != l2) continue;
                this.a("Please remove " + string + " from your friend list first", 0, "");
                return;
            }
            this.kP[this.jD++] = l2;
            fb = true;
            fv.a(133);
            fv.a(l2);
            return;
        }
        catch (RuntimeException runtimeException) {
            rs.p_v.C_a.e("45688, " + l2 + ", 4, " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    private void bI() {
        for (int i = -1; i < this.ku; ++i) {
            int n = i == -1 ? 2047 : this.kv[i];
            rs.p_a.C_k c_k = kw_do[n];
            if (c_k == null) continue;
            this.b(c_k);
        }
    }

    private void bJ() {
        if (ee == 2) {
            C_N_uc c_N_uc = (C_N_uc)this.nL.b();
            while (c_N_uc != null) {
                if (c_N_uc.g > 0) {
                    --c_N_uc.g;
                }
                if (c_N_uc.g == 0) {
                    if (c_N_uc.l < 0 || C_x.a(c_N_uc.l, c_N_uc.n)) {
                        this.a(c_N_uc.k, c_N_uc.h, c_N_uc.m, c_N_uc.n, c_N_uc.j, c_N_uc.i, c_N_uc.l);
                        c_N_uc.b();
                    }
                } else {
                    if (c_N_uc.o > 0) {
                        --c_N_uc.o;
                    }
                    if (c_N_uc.o == 0 && c_N_uc.j >= 1 && c_N_uc.k >= 1 && c_N_uc.j <= 102 && c_N_uc.k <= 102 && (c_N_uc.a < 0 || C_x.a(c_N_uc.a, c_N_uc.f))) {
                        this.a(c_N_uc.k, c_N_uc.h, c_N_uc.b, c_N_uc.f, c_N_uc.j, c_N_uc.i, c_N_uc.a);
                        c_N_uc.o = -1;
                        if (c_N_uc.a == c_N_uc.l && c_N_uc.l == -1) {
                            c_N_uc.b();
                        } else if (c_N_uc.a == c_N_uc.l && c_N_uc.b == c_N_uc.m && c_N_uc.f == c_N_uc.n) {
                            c_N_uc.b();
                        }
                    }
                }
                c_N_uc = (C_N_uc)this.nL.d();
            }
        }
    }

    private void bK() {
        int n;
        int n2;
        int n3 = gj.a("Choose option");
        for (n2 = 0; n2 < this.eV; ++n2) {
            n = gj.a(this.fx[n2]);
            if (n <= n3) continue;
            n3 = n;
        }
        n3 += 8;
        n2 = 15 * this.eV + 21;
        if (this.hV > 0 && this.hW > 0 && this.hV < ai && this.hW < ah) {
            int n4;
            n = this.hV - n3 / 2;
            if (n + n3 > ai - 4) {
                n = ai - 4 - n3;
            }
            if (n < 0) {
                n = 0;
            }
            if ((n4 = this.hW - 0) + n2 > ah - 6) {
                n4 = ah - 6 - n2;
            }
            if (n4 < 0) {
                n4 = 0;
            }
            dj = true;
            this.lc = n;
            this.ld = n4;
            for (int i = 0; i < this.eV; ++i) {
                if (this.eI[i] != 516) continue;
                int n5 = this.eF[i];
                int n6 = this.eG[i];
                this.dF.b(n6 - 4, n5 - 4);
                C_V_uc.q = true;
            }
            this.dI = n3;
            this.dJ = 15 * this.eV + 22;
            C_MenuOpened_mc c_MenuOpened_mc = new C_MenuOpened_mc();
            this.p.post(c_MenuOpened_mc);
        }
    }

    private void c(rs.p_x.C_e c_e) {
        c_e.J();
        int n = c_e.k(1);
        if (rs.p_f.C_a.f.booleanValue()) {
            cx.add("\t-> Update: " + n);
        }
        if (n == 0) {
            return;
        }
        int n2 = c_e.k(2);
        if (rs.p_f.C_a.d.booleanValue()) {
            cx.add("\t-> type: " + n2);
        }
        if (n2 == 0) {
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t\t-> Set entitiesAwaitingUpdate to self");
            }
            this.kx[this.kw++] = 2047;
            return;
        }
        if (n2 == 1) {
            int n3 = c_e.k(3);
            eR.a(false, n3);
            int n4 = c_e.k(1);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t\t-> direction=" + n3 + " updateRequired=" + n4);
            }
            if (n4 == 1) {
                this.kx[this.kw++] = 2047;
            }
            return;
        }
        if (n2 == 2) {
            int n5 = c_e.k(3);
            eR.a(true, n5);
            int n6 = c_e.k(3);
            eR.a(true, n6);
            int n7 = c_e.k(1);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t\t-> firstDirection=" + n5 + " secondDirection=" + n6 + " updateRequired=" + n7);
            }
            if (n7 == 1) {
                this.kx[this.kw++] = 2047;
            }
            return;
        }
        if (n2 == 3) {
            dw = c_e.k(2);
            int n8 = c_e.k(1);
            int n9 = c_e.k(1);
            if (n9 == 1) {
                this.kx[this.kw++] = 2047;
            }
            int n10 = c_e.k(7);
            int n11 = c_e.k(7);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t\t-> teleport=" + n8 + " updateRequired=" + n9 + " y=" + n10 + " x=" + n11);
            }
            eR.a(n11, n10, true);
        }
    }

    private void bL() {
        this.jK = false;
        while (this.lj) {
            this.jK = false;
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
        }
        this.ll = null;
        this.lm = null;
        this.nw = null;
        this.jU = null;
        this.jV = null;
        this.jW = null;
        this.jX = null;
        this.nP = null;
        this.nQ = null;
        this.jI = null;
        this.jJ = null;
        this.nV = null;
        this.nW = null;
    }

    public boolean j(int n, int n2) {
        if (rs.p_l.p_b.C_a.a()) {
            return false;
        }
        if (n2 == 56998 || n2 == 32019) {
            this.j(n, 57016);
        }
        boolean bl = false;
        rs.p_n.C_e c_e = rs.p_n.C_e.H[n2];
        for (int i = 0; i < c_e.al.length && c_e.al[i] != -1; ++i) {
            boolean bl2;
            int n3;
            rs.p_n.C_e c_e2 = rs.p_n.C_e.H[c_e.al[i]];
            if (c_e2.aI == 1) {
                bl |= this.j(n, c_e2.aw);
            }
            if (c_e2.aI != 6 || c_e2.aD == -1 && c_e2.aE == -1 || (n3 = (bl2 = this.b(c_e2)) ? c_e2.aE : c_e2.aD) == -1) continue;
            rs.p_d.C_a c_a = rs.p_d.C_a.a[n3];
            if (c_a.b()) {
                ++c_e2.ar;
                int n4 = c_a.c();
                c_e2.F -= n4 + 1;
                if (c_e2.ar >= n4) {
                    c_e2.ar -= c_a.h;
                    if (c_e2.ar < 0 || c_e2.ar >= c_a.d) {
                        c_e2.ar = 0;
                    }
                }
                bl = true;
                continue;
            }
            c_e2.F += n;
            while (c_e2.F > c_a.a(c_e2.ar)) {
                c_e2.F -= c_a.a(c_e2.ar) + 1;
                ++c_e2.ar;
                if (c_e2.ar >= c_a.d) {
                    c_e2.ar -= c_a.h;
                    if (c_e2.ar < 0 || c_e2.ar >= c_a.d) {
                        c_e2.ar = 0;
                    }
                }
                bl = true;
            }
        }
        return bl;
    }

    public int U() {
        int n = 3;
        if (this.cR < 310) {
            int n2;
            int n3;
            int n4 = cJ >> 7;
            int n5 = cL >> 7;
            int n6 = C_Client_mc.eR.ac >> 7;
            int n7 = C_Client_mc.eR.ad >> 7;
            if (dw < 0 || dw >= this.gc.length) {
                System.out.println("Prevented crash C 1.0");
                return n;
            }
            if (n4 < 0 || n4 >= this.gc[dw].length) {
                System.out.println("Prevented crash C 1.1");
                return n;
            }
            if (n5 < 0 || n5 >= this.gc[dw][n4].length) {
                return dw;
            }
            if ((this.gc[dw][n4][n5] & 4) != 0) {
                n = dw;
            }
            if ((n3 = n6 > n4 ? n6 - n4 : n4 - n6) > (n2 = n7 > n5 ? n7 - n5 : n5 - n7)) {
                int n8 = n2 * 65536 / n3;
                int n9 = 32768;
                while (n4 != n6) {
                    if (n4 < n6) {
                        ++n4;
                    } else if (n4 > n6) {
                        --n4;
                    }
                    if ((this.gc[dw][n4][n5] & 4) != 0) {
                        n = dw;
                    }
                    if ((n9 += n8) < 65536) continue;
                    n9 -= 65536;
                    if (n5 < n7) {
                        ++n5;
                    } else if (n5 > n7) {
                        --n5;
                    }
                    if ((this.gc[dw][n4][n5] & 4) == 0) continue;
                    n = dw;
                }
            } else {
                int n10 = n3 * 65536 / n2;
                int n11 = 32768;
                while (n5 != n7) {
                    if (n5 < n7) {
                        ++n5;
                    } else if (n5 > n7) {
                        --n5;
                    }
                    if ((this.gc[dw][n4][n5] & 4) != 0) {
                        n = dw;
                    }
                    if ((n11 += n10) < 65536) continue;
                    n11 -= 65536;
                    if (n4 < n6) {
                        ++n4;
                    } else if (n4 > n6) {
                        --n4;
                    }
                    if ((this.gc[dw][n4][n5] & 4) == 0) continue;
                    n = dw;
                }
            }
        }
        if ((this.gc[dw][C_Client_mc.eR.ac >> 7][C_Client_mc.eR.ad >> 7] & 4) != 0) {
            n = dw;
        }
        return n;
    }

    public int e(int n, int n2, int n3) {
        int n4 = n >> 7;
        int n5 = n2 >> 7;
        if (n4 >= 0 && n5 >= 0 && n4 < 104 && n5 < 104) {
            int[][][] nArray = this.fC;
            int n6 = n & 0x7F;
            int n7 = n2 & 0x7F;
            int n8 = n6 * nArray[n3][n4 + 1][n5] + (128 - n6) * nArray[n3][n4][n5] >> 7;
            int n9 = nArray[n3][n4][n5 + 1] * (128 - n6) + n6 * nArray[n3][n4 + 1][n5 + 1] >> 7;
            return (128 - n7) * n8 + n7 * n9 >> 7;
        }
        return 0;
    }

    public C_i f(int n, int n2, int n3) {
        if (n >= 128 && n2 >= 128 && n <= 13056 && n2 <= 13056) {
            n -= cJ;
            n2 -= cL;
            n3 -= cK;
            int n4 = this.cS;
            int n5 = this.cR;
            int n6 = rs.p_a.C_h.bA[n5];
            int n7 = rs.p_a.C_h.bB[n5];
            int n8 = rs.p_a.C_h.bA[n4];
            int n9 = rs.p_a.C_h.bB[n4];
            int n10 = n9 * n + n2 * n8 >> 16;
            n2 = n9 * n2 - n8 * n >> 16;
            n = n10;
            int n11 = n7 * n3 - n2 * n6 >> 16;
            if ((n2 = n3 * n6 + n2 * n7 >> 16) >= 50) {
                return new C_i(C_E_uc.s + (n << 9) / n2, C_E_uc.t + (n11 << 9) / n2);
            }
        }
        return null;
    }

    public Polygon a(rs.p_runelite.p_a.C_f c_f, int n) {
        int n2 = c_f.b() - n * 128 / 2;
        int n3 = c_f.c() - n * 128 / 2;
        int n4 = c_f.b() + n * 128 / 2;
        int n5 = c_f.c() + n * 128 / 2;
        byte[][][] byArray = this.gc;
        int n6 = c_f.d();
        int n7 = c_f.e();
        if (n6 < 0 || n7 < 0 || n6 >= 104 || n7 >= 104) {
            return null;
        }
        int n8 = dw;
        if (dw < 3 && (byArray[1][n6][n7] & 2) == 2) {
            n8 = dw + 1;
        }
        int n9 = this.e(n2, n3, n8);
        int n10 = this.e(n4, n3, n8);
        int n11 = this.e(n4, n5, n8);
        int n12 = this.e(n2, n5, n8);
        C_i c_i = this.f(n2, n3, n9);
        C_i c_i2 = this.f(n4, n3, n10);
        C_i c_i3 = this.f(n4, n5, n11);
        C_i c_i4 = this.f(n2, n5, n12);
        if (c_i == null || c_i2 == null || c_i3 == null || c_i4 == null) {
            return null;
        }
        Polygon polygon = new Polygon();
        polygon.addPoint(c_i.a(), c_i.b());
        polygon.addPoint(c_i2.a(), c_i2.b());
        polygon.addPoint(c_i3.a(), c_i3.b());
        polygon.addPoint(c_i4.a(), c_i4.b());
        return polygon;
    }

    public int V() {
        int n = this.c(dw, cL, cJ);
        if (n - cK < 800 && (this.gc[dw][cJ >> 7][cL >> 7] & 4) != 0) {
            return dw;
        }
        return 3;
    }

    private void i(long l2) {
        try {
            if (l2 == 0L) {
                return;
            }
            for (int i = 0; i < this.jD; ++i) {
                if (this.kP[i] != l2) continue;
                --this.jD;
                fb = true;
                System.arraycopy(this.kP, i + 1, this.kP, i, this.jD - i);
                fv.a(74);
                fv.a(l2);
                return;
            }
            return;
        }
        catch (RuntimeException runtimeException) {
            rs.p_v.C_a.e("47229, 3, " + l2 + ", " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    public static void n(int n) {
        fb = true;
        fL = n;
        eM = true;
    }

    @Override
    public String getParameter(String string) {
        if (rs.p_v.C_a.h != null) {
            return rs.p_v.C_a.h.getParameter(string);
        }
        return null;
    }

    private void a(boolean bl, int n) {
        rs.p_v.C_a.k = n;
        if (bl) {
            rs.p_v.C_a.j = "voladjust";
        }
    }

    public int a(rs.p_n.C_e c_e, int n) {
        if (c_e.X == null || n >= c_e.X.length) {
            return -2;
        }
        try {
            int[] nArray = c_e.X[n];
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            while (true) {
                int n5;
                int n6;
                rs.p_n.C_e c_e2;
                int n7 = nArray[n3++];
                int n8 = 0;
                int n9 = 0;
                if (n7 == 0) {
                    return n2;
                }
                if (n7 == 1) {
                    n8 = this.kN[nArray[n3++]];
                }
                if (n7 == 2) {
                    n8 = this.eo[nArray[n3++]];
                }
                if (n7 == 3) {
                    n8 = this.ka[nArray[n3++]];
                }
                if (n7 == 4) {
                    c_e2 = rs.p_n.C_e.H[nArray[n3++]];
                    if ((n6 = nArray[n3++]) == 20987 || n6 >= 0 && n6 < rs.p_d.C_k.ad) {
                        for (n5 = 0; n5 < c_e2.az.length; ++n5) {
                            if (c_e2.aw == 3214 && (c_e.ah == 1151 || c_e.ah == 12855 || c_e.ah == 1689 || c_e.ah == 1829 || c_e.ah == 12050)) {
                                if (c_e2.az[n5] == 6820 || c_e2.az[n5] == 23112) {
                                    n8 = 100000000;
                                }
                                if (c_e.aw == 30306 && c_e2.az[n5] == 966) {
                                    n8 = 100000000;
                                }
                            }
                            if (c_e2.az[n5] == n6 + 1) {
                                n8 += c_e2.ax[n5];
                            }
                            if (n6 == 2417 && (c_e2.az[n5] == 11792 || c_e2.az[n5] == 12905)) {
                                n8 += c_e2.ax[n5];
                            }
                            if (n6 != 2415 || c_e2.az[n5] != 21033 && c_e2.az[n5] != 21034 && c_e2.az[n5] != 21035 && c_e2.az[n5] != 21036 && c_e2.az[n5] != 25423 && c_e2.az[n5] != 25424) continue;
                            n8 += c_e2.ax[n5];
                        }
                    }
                }
                if (n7 == 5) {
                    n8 = this.dP[nArray[n3++]];
                }
                if (n7 == 6) {
                    n8 = lU[this.eo[nArray[n3++]] - 1];
                }
                if (n7 == 7) {
                    n8 = this.dP[nArray[n3++]] * 100 / 46875;
                }
                if (n7 == 8) {
                    n8 = C_Client_mc.eR.bc;
                }
                if (n7 == 9) {
                    for (int i = 0; i < rs.p_f.C_e.a; ++i) {
                        if (!rs.p_f.C_e.d[i]) continue;
                        n8 += this.eo[i];
                    }
                }
                if (n7 == 10) {
                    c_e2 = rs.p_n.C_e.H[nArray[n3++]];
                    if ((n6 = nArray[n3++] + 1) >= 0 && n6 < rs.p_d.C_k.ad) {
                        for (n5 = 0; n5 < c_e2.az.length; ++n5) {
                            if (n6 == 1388 && c_e2.az[n5] == 20450) {
                                n8 = 999999999;
                                break;
                            }
                            if (n6 == 1388 && c_e2.az[n5] == 22853) {
                                n8 = 999999999;
                                break;
                            }
                            if (n6 == 1384 && c_e2.az[n5] == 20691) {
                                n8 = 999999999;
                                break;
                            }
                            if (n6 == 1384 && c_e2.az[n5] == 22854) {
                                n8 = 999999999;
                                break;
                            }
                            if (n6 == 1384 && c_e2.az[n5] == 20487) {
                                n8 = 999999999;
                                break;
                            }
                            if (n6 == 1384 && c_e2.az[n5] == 20811) {
                                n8 = 999999999;
                                break;
                            }
                            if (c_e2.az[n5] != n6) continue;
                            n8 = 999999999;
                            break;
                        }
                    }
                }
                if (n7 == 11) {
                    n8 = this.eY;
                }
                if (n7 == 12) {
                    n8 = this.ko;
                }
                if (n7 == 13) {
                    int n10;
                    int n11 = n8 = ((n10 = this.dP[nArray[n3++]]) & 1 << (n6 = nArray[n3++])) == 0 ? 0 : 1;
                }
                if (n7 == 14) {
                    int n12 = nArray[n3++];
                    C_y c_y = C_y.a[n12];
                    n5 = c_y.b;
                    int n13 = c_y.c;
                    int n14 = c_y.d;
                    int n15 = fQ[n14 - n13];
                    n8 = this.dP[n5] >> n13 & n15;
                }
                if (n7 == 15) {
                    n9 = 1;
                }
                if (n7 == 16) {
                    n9 = 2;
                }
                if (n7 == 17) {
                    n9 = 3;
                }
                if (n7 == 18) {
                    n8 = (C_Client_mc.eR.ac >> 7) + eh;
                }
                if (n7 == 19) {
                    n8 = (C_Client_mc.eR.ad >> 7) + ei;
                }
                if (n7 == 20) {
                    n8 = nArray[n3++];
                }
                if (n9 == 0) {
                    if (n4 == 0) {
                        n2 += n8;
                    }
                    if (n4 == 1) {
                        n2 -= n8;
                    }
                    if (n4 == 2 && n8 != 0) {
                        n2 /= n8;
                    }
                    if (n4 == 3) {
                        n2 *= n8;
                    }
                    n4 = 0;
                    continue;
                }
                n4 = n9;
            }
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public void W() {
        int n = ah - 504;
        if (rs.p_f.C_a.ai == C_a.c.a) {
            n = 0;
        }
        if (rs.C_C_uc.hP >= 5 && rs.C_C_uc.hP <= 61 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.fx[1] = "View All";
            this.eI[1] = 999;
            this.eV = 2;
        } else if (rs.C_C_uc.hP >= 71 && rs.C_C_uc.hP <= 127 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.fx[1] = "Game chat: " + (this.gx == rs.p_i.C_a.z ? "@cya@Filtered" : "@gre@On");
            this.eI[1] = 1604;
            this.fx[2] = "View game chat";
            this.eI[2] = 1603;
            this.eV = 3;
        } else if (rs.C_C_uc.hP >= 137 && rs.C_C_uc.hP <= 193 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.fx[1] = "Off yell chat";
            this.eI[1] = 1602;
            this.fx[2] = "On yell chat";
            this.eI[2] = 1601;
            this.fx[3] = "View yell chat";
            this.eI[3] = 1600;
            this.eV = 4;
        } else if (rs.C_C_uc.hP >= 203 && rs.C_C_uc.hP <= 259 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.fx[1] = "Hide public";
            this.eI[1] = 997;
            this.fx[2] = "Off public";
            this.eI[2] = 996;
            this.fx[3] = "Friends public";
            this.eI[3] = 995;
            this.fx[4] = "On public";
            this.eI[4] = 994;
            this.fx[5] = "View public";
            this.eI[5] = 993;
            this.eV = 6;
        } else if (rs.C_C_uc.hP >= 269 && rs.C_C_uc.hP <= 325 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.fx[1] = "Off private";
            this.eI[1] = 992;
            this.fx[2] = "Friends private";
            this.eI[2] = 991;
            this.fx[3] = "On private";
            this.eI[3] = 990;
            this.fx[4] = "View private";
            this.eI[4] = 989;
            this.fx[5] = "Clear history";
            this.eI[5] = 1425;
            this.eV = 6;
        } else if (rs.C_C_uc.hP >= 335 && rs.C_C_uc.hP <= 391 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.fx[1] = "Off clan chat";
            this.eI[1] = 1003;
            this.fx[2] = "On clan chat";
            this.eI[2] = 1001;
            this.fx[3] = "View clan chat";
            this.eI[3] = 1000;
            this.eV = 4;
        } else if (rs.C_C_uc.hP >= 400 && rs.C_C_uc.hP <= 456 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.fx[1] = "Off trade";
            this.eI[1] = 987;
            this.fx[2] = "Friends trade";
            this.eI[2] = 986;
            this.fx[3] = "On trade";
            this.eI[3] = 985;
            this.fx[4] = "View trade";
            this.eI[4] = 984;
            this.eV = 5;
        } else if (rs.C_C_uc.hP >= 460 && rs.C_C_uc.hP <= 516 && rs.C_C_uc.hQ >= 482 + n && rs.C_C_uc.hQ <= 503 + n) {
            this.fx[1] = "News: " + (this.gv == rs.p_i.C_a.z ? "@cya@Filtered" : "@gre@On");
            this.eI[1] = 1007;
            this.fx[2] = "View news chat";
            this.eI[2] = 1006;
            this.eV = 3;
        }
    }

    private void bM() {
        if (this.eV < 2 && this.gr == 0 && this.eW == 0) {
            return;
        }
        if (this.aH() >= 0) {
            this.r.a();
            C_MenuHover_mc.get().setRow(this.aH());
            C_MenuHover_mc.get().setMenuId(this.aI());
            C_MenuHover_mc.get().setMenuCmd1(this.eJ[this.aH()]);
            C_MenuHover_mc.get().setMenuCmd2(this.eF[this.aH()]);
            C_MenuHover_mc.get().setMenuCmd3(this.eG[this.aH()]);
            C_MenuHover_mc.get().setMenuCmd4(this.eH[this.aH()]);
            this.p.post(C_MenuHover_mc.SINGLETON);
        }
    }

    public void X() {
        Object object;
        int n;
        int n2;
        if (br == 55761 && cH == 18559) {
            if (this.jo.endsWith("\n ")) {
                this.a(hP - 10, hQ - 10, " @yel@Task progress left:\n" + this.jo.substring(0, this.jo.length() - 2) + " ");
            } else {
                this.a(hP - 10, hQ - 10, " @yel@Task progress left:\n" + this.jo);
            }
            return;
        }
        if (this.eV < 2 && this.gr == 0 && this.eW == 0) {
            return;
        }
        this.bM();
        Object object2 = this.gr == 1 && this.eV < 2 ? "Use " + this.oN + " with..." : (this.eW == 1 && this.eV < 2 ? this.nn + "..." : this.fx[this.eV - 1]);
        if (object2 != null && cH == 61000 && ((String)object2).contains("leaderboard")) {
            n2 = hQ - 10;
            n = hP - 10;
            if (((String)object2).contains("Daily PK")) {
                this.b(n, n2, " <img=16> " + (String)object2 + "\nVarious daily leaderboards\nfor PKing, offering roster rewards!");
            } else {
                this.b(n, n2, " <img=16> " + (String)object2 + "\nCheck out which players and\nclans are dominating the arena!");
            }
        }
        if (object2 != null && cH == 54100) {
            n2 = hQ - 10;
            n = hP - 10;
            if (((String)object2).contains("Select timed task")) {
                this.b(n, n2, " Monster hunter\nSlay an amount of wildy monsters in 25 mins.\n<item=23132>@or1@@yel@1/35@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!");
            }
            if (((String)object2).contains("Select boss hunter task")) {
                this.b(n, n2, " Boss hunter\nSlay an amount of wildy bosses in 25 mins.\n<item=23132>@or1@@yel@1/10@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!");
            }
            if (((String)object2).contains("Select man hunter")) {
                this.b(n, n2, " Bounty hunter\nKill 3-6 bounty hunter targets in 15 minutes.\nEarn a flat <img=125>@gre@+5@whi@ bonus for each Cursed Bounty kill\n<item=23132>@yel@1/5@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!");
            }
            if (((String)object2).contains("Select man slaughter task")) {
                this.b(n, n2, " Slaughter\nKill as many players as you can in 20 minutes!\n- The higher your killcount, the better your reward!\n- Kills while risking a <item=1484>Cursed orb count as 2 KC.\n- Reaching the kill cap (20) ends the task early.\n<item=23132>@yel@@yel@1/8@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if you kill less than 3!");
            }
        }
        if (object2 != null && cH == 47500 && ((String)object2).contains("View equipment bonuses")) {
            n2 = hQ - 10;
            n = hP - 10;
            this.b(n, n2, " Equipment set bonuses\nDid you know you can also hover\nover items and hold the CTRL key\nto view stats of individual items?");
        }
        if (object2 != null && cH == 60200) {
            n2 = hQ - 10;
            n = hP + 10;
            if (((String)object2).contains("PayPal")) {
                this.b(n, n2, " Payment method\nPay with credit card, debit\ncard, or with PayPal!");
            } else if (((String)object2).contains("BMT")) {
                this.b(n, n2, " Payment method\nPay with bitcoins (BitPay)\nor with Paysafe cards!");
            }
        }
        if (object2 != null && cH == 60050 && ((String)object2).contains("Vote for us")) {
            n2 = hQ - 10;
            n = hP - 10;
            this.b(n, n2, " " + (String)object2 + "\nand receive @yel@+2 vote points!\nType @yel@::claim@whi@ in-game after voting");
        }
        if (object2 != null && cH == 60600) {
            n2 = hQ - 10;
            n = hP - 10;
            if (((String)object2).contains(" 10,000,000")) {
                this.b(n, n2, " @whi@Once the entire server has spent\n@yel@10,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Goodie bag.");
            } else if (((String)object2).contains("15,000,000")) {
                this.b(n, n2, " @whi@Once the entire server has spent\n@yel@15,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Mystery box.");
            } else if (((String)object2).contains("20,000,000")) {
                if (rs.p_f.C_a.ai == C_a.c.a) {
                    n -= 100;
                }
                this.b(n, n2, " @whi@Once the entire server has spent\n@yel@20,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Mystery chest.");
            } else if (((String)object2).contains("Donator promotional shop")) {
                this.b(n, n2, " Event lottery\nEnter for a chance to win\nrares from previous events!");
            } else if (((String)object2).contains("Reset event items")) {
                this.b(n, n2, " Reset exchange\nOnce you've earned all of the\nitems in the chest, you can reset\nthe stock and purchase more rolls!");
            }
        }
        if (br > 0 && rs.p_n.C_e.l(br) != null && rs.p_n.C_e.l((int)C_Client_mc.br).bx) {
            if (rs.p_n.C_e.l((int)C_Client_mc.br).by != null) {
                this.a(hP - 10, hQ - 10, " " + rs.p_n.C_e.l((int)C_Client_mc.br).by);
            } else {
                this.a(hP - 10, hQ - 10, " " + (String)object2);
            }
        } else if (this.ef > 0 && rs.p_n.C_e.l(this.ef) != null && rs.p_n.C_e.l((int)this.ef).bx) {
            Object object3 = rs.p_n.C_e.l((int)this.ef).by == null ? object2 : rs.p_n.C_e.l((int)this.ef).by;
            this.a(hP - 10, hQ - 10, " " + (String)object3);
        }
        if (object2 != null && cH == 61150) {
            int n3 = hQ - 10;
            n = hP - 10;
            if (((String)object2).contains("Enter bloodcore lottery")) {
                this.b(n, n3, " Entering will also grant you:\n- 1 hour of blood lust @yel@(non-stackable)\n- 1 hour of +5% DR bonus @yel@(time stackable)\\n- 1 hour of +25% GP from PvM @yel@(time stackable)");
            }
        }
        if (object2 != null && (((String)object2).contains("@mag@Polymorphism") || ((String)object2).contains("@mag@Punch") || ((String)object2).contains("@mag@catch"))) {
            int n4 = hQ - 10;
            n = hP - 10;
            this.b(n, n4, " @whi@" + (String)object2);
        }
        if (object2 != null && cH == 45900) {
            int n5 = hQ - 10;
            n = hP - 10;
            if (((String)object2).contains("Toggle gold auto")) {
                this.b(n, n5, " @whi@Broken items will automatically       \nrepair on death, using gold\nstored in the coffer.");
            } else if (((String)object2).contains("Toggle shard auto")) {
                this.b(n, n5, " @whi@Broken items will automatically        \nrepair on death, using shards\nstored in the coffer.");
            }
        }
        if (object2 != null && ((String)object2).contains("@cya@Blood fountain")) {
            this.a(hP - 10, hQ - 10, " Blood fountain", "BLOOD_FOUNTAIN");
        } else if (object2 != null && ((String)object2).contains("Reward exchange @cya@")) {
            this.a(hP - 15, hQ - 10, " " + ((String)object2).split("@cya@")[1], "WORLD_EVENT_GUIDE");
        } else if (object2 != null && ((String)object2).contains("@yel@Mandrith")) {
            this.a(hP - 10, hQ - 10, " Statuettes and aritfacts", "MANDRITH");
        } else if (object2 != null && ((String)object2).contains("@yel@Blood slayer master")) {
            this.a(hP - 10, hQ - 10, " Blood slayer master", "BLOOD_SLAYER");
        } else if (object2 != null && ((String)object2).contains("@cya@Magic chest")) {
            this.a(hP - 10, hQ - 10, " Enchanting chest", "ENCHANTING_CHEST");
        } else if (object2 != null && ((String)object2).contains("@yel@Pet-keeper")) {
            this.a(hP - 10, hQ - 10, " Pet fusing", "PET_FUSING");
        } else if (object2 != null && !((String)object2).contains("@cya@Summer oasis")) {
            this.jv = 0;
        }
        if (object2 != null && cH == 19600) {
            int n6 = hQ - 10;
            n = hP - 10;
            if (((String)object2).contains("Invite member")) {
                this.b(n, n6, " Invite a member ");
            }
            if (((String)object2).contains("Remove member")) {
                this.b(n, n6, " Remove member ");
            }
            if (((String)object2).contains("Refresh")) {
                this.b(n, n6, " Refresh ");
            }
            if (((String)object2).contains("Re-invite")) {
                this.b(n + 50, n6, " Reload last party  ");
            }
            if (((String)object2).contains("Start raid")) {
                this.b(n, n6, " Start raid ");
            }
            if (((String)object2).contains("Leave/disband party")) {
                this.b(n, n6, " Leave party ");
            }
            if (((String)object2).contains("Adept difficulty")) {
                this.b(n, n6, " Adept difficulty\n- +5% rare reward chance\n- Bosses have 50% more HP\n- Bosses have 10% more defence\n- Bosses deal 5% more damage\n- You deal 5% less damage");
            }
            if (((String)object2).contains("Expert difficulty")) {
                this.b(n, n6, " Expert difficulty\n- +25% rare reward chance\n- Bosses have 200% more HP\n- Bosses have 20% more defence\n- Bosses deal 7.5% more damage\n- You deal 7.5% less damage");
            }
            if (((String)object2).contains("Master difficulty")) {
                this.b(n, n6, " Master difficulty\n- Receive +2 common rewards\n- +50% rare reward chance\n- Bosses have 300% more HP\n- Bosses have 30% more defence\n- Bosses deal 10% more damage\n- You deal 10% less damage");
            }
            if (((String)object2).contains("Grandmaster difficulty")) {
                this.b(n, n6, " Grandmaster difficulty\n- Receive +3 common rewards\n- +75% rare reward chance\n- Bosses have 400% more HP\n- Bosses have 50% more defence\n- Bosses deal 15% more damage\n- You deal 15% less damage");
            }
        }
        if (object2 != null && cH == C_aD_mc.bI && !((String)object2).toLowerCase().contains("close window") && !((String)object2).toLowerCase().contains("@lre@")) {
            this.b(hP, hQ - 10, " @gre@" + (String)object2 + " ");
        }
        if (this.eV > 1) {
            int n7 = this.eI[this.eV - 1];
            if (n7 == 1125 || n7 == 632 && cH != -1 || n7 == 78 || n7 == 867 || n7 == 431 || n7 == 53 || n7 == 291 || n7 == 300 || n7 == 291 || n7 == 315 && cH == 22952) {
                n = this.eJ[this.eV - 1];
                if (cH == 22952) {
                    if (((String)object2).contains("Select item")) {
                        this.a(n, (String)object2, false);
                    }
                } else {
                    this.a(n, (String)object2, false);
                }
            }
            if (n7 == 447 || n7 == 847 || n7 == 493 || n7 == 454 || n7 == 74 || n7 == 539) {
                n = this.eJ[this.eV - 1];
                object = " " + rs.p_d.C_k.f((int)n).w;
                this.a(n, (String)object2, true);
            }
        }
        if (object2 != null && cH == 64272 && (((String)object2).contains("Collect reward") || ((String)object2).contains("Collect all rewards"))) {
            this.b(hP - 10, hQ - 10, " " + (String)object2 + "  ");
        } else if (object2 != null && ((String)object2).contains("@lre@") && !((String)object2).contains("Take") && rs.p_f.C_a.aC && ag && !rs.p_s.p_l.C_c.b) {
            boolean bl = false;
            for (n = 0; n < this.fx.length; ++n) {
                if (this.fx[n] == null || !this.fx[n].contains("Drop") && !this.fx[n].contains("Destroy") && !this.fx[n].contains("Release") || cH == 23000) continue;
                bl = true;
            }
            if (bl) {
                String[] stringArray = this.fx[this.eV - 1].split(" ");
                stringArray[0] = "Drop";
                object = "";
                for (String string : stringArray) {
                    object = (String)object + string + " ";
                }
                object2 = object = ((String)object).trim();
            }
        }
        if (this.eV > 2) {
            object2 = (String)object2 + "@whi@ / " + (this.eV - 2) + " more options";
        }
        this.gn.b((String)object2, 4 + (!C_Client_mc.ai() ? 4 : 0), 15 + (!C_Client_mc.ai() ? 4 : 0), 0xFFFFFF, 0);
    }

    public void a(int n, String string, boolean bl) {
        boolean bl2;
        if (n < 0 || n > rs.p_d.C_k.a) {
            return;
        }
        rs.p_d.C_k c_k = rs.p_d.C_k.f(n);
        if (c_k == null) {
            return;
        }
        boolean bl3 = bl2 = ed == 197;
        if (C_b.c && bl2 && cH != 15106) {
            return;
        }
        if (c_k.F > 0 && c_k.p == 799) {
            n = c_k.F;
            c_k = rs.p_d.C_k.f(c_k.F);
        }
        String string2 = " " + rs.p_d.C_w.a(n, rs.p_d.C_k.f((int)n).w);
        if (C_b.k && rs.p_t.p_a.C_g.a.a_(n)) {
            string2 = string2 + " <img=370>";
        }
        Object object = string2;
        if (!bl || C_b.h) {
            Object object2 = object = bl ? C_q.a(string2) : rs.p_d.C_m.a(string2, n);
        }
        if (bl && object == null && C_b.h) {
            object = rs.p_d.C_m.a(string2, n);
        }
        boolean bl4 = false;
        boolean bl5 = false;
        if (cH == 23000 && !C_b.f) {
            bl5 = true;
        }
        if (cH == 15106 && !C_b.g) {
            bl5 = true;
        }
        if (bl && cH == -1 && !C_b.h) {
            bl5 = true;
        }
        if (bl && cH == -1 && c_k != null && c_k.ax) {
            bl5 = true;
        }
        if (bl2 && C_b.d) {
            bl5 = true;
        }
        if (bl && object == null && !bl5) {
            bl4 = true;
        }
        if (bl5) {
            object = string2;
        }
        if (bl && cH != 15106 && object == null) {
            return;
        }
        if (!C_b.b) {
            return;
        }
        if (!C_b.i && bl && cH != 15106) {
            return;
        }
        if (object == null) {
            object = string2;
        }
        boolean bl6 = false;
        if (!bl || cH == 15106 || C_b.i) {
            this.A(n);
            if (this.jq == n) {
                bl6 = true;
                if (!ch) {
                    object = (String)object + "\nHold @yel@CTRL@whi@ to view stats";
                }
            }
        }
        if (bl && bl4 && !bl6) {
            return;
        }
        if (string != null) {
            if (string.contains("Select tab")) {
                object = " @whi@Select tab @lre@" + c_k.w;
                bl6 = false;
            }
            if (string.contains("<img=83> Info")) {
                object = " <img=83> Info" + (String)object;
                bl6 = false;
            }
        }
        if (bl && bl4 && !bl6) {
            return;
        }
        if (ch && bl6) {
            Object object3 = this.jp.get(this.jq);
            if (object3 == null) {
                if (this.js != this.jq || System.currentTimeMillis() - this.jr >= 1000L) {
                    this.js = this.jq;
                    ap = "::equipstr " + this.js;
                    this.jr = System.currentTimeMillis();
                }
                object3 = "Loading, please wait..";
                this.b(0, 0, (String)object + "\n" + (String)object3);
            } else {
                String[] stringArray = this.jp.get(this.jq).split(" ");
                object3 = "                  <u=16748608>@lre@Attack@whi@</u>      <u=16748608>@lre@Defence@whi@</u>  \n<col=FFBD5C>Stab:\n<col=FFBD5C>Slash:\n<col=FFBD5C>Crush:\n<col=FFBD5C>Magic:\n<col=FFBD5C>Range:\n\n<u=16748608>@lre@Other Bonuses</u> \n<col=FFBD5C>Strength:@whi@ " + stringArray[11].replace("@gre@", " @gre@").replace("@red@", " @red@") + "\n<col=FFBD5C>Prayer:@whi@ " + stringArray[12].replace("@gre@", " @gre@").replace("@red@", " @red@") + "\n<col=FFBD5C>Range strength:@whi@ " + stringArray[13].replace("@gre@", " @gre@").replace("@red@", " @red@") + "\n<col=FFBD5C>Magic damage:@whi@ +" + stringArray[14].replace("@g3re@ ", " @gre@").replaceAll("@red@", " @red@");
                this.a(0, 0, string2 + "\n" + (String)object3, stringArray, false);
            }
        } else if (!bl || object != null) {
            this.b(0, 0, (String)object);
        }
    }

    public boolean k(int n, int n2) {
        int n3 = n >> 6;
        int n4 = n2 >> 6;
        int n5 = n3 * 256 + n4;
        if (n5 == 11601) {
            return false;
        }
        if (n5 == 12946 || n5 == 13202) {
            return false;
        }
        if (n5 == 11877) {
            return true;
        }
        if (n5 == 9811) {
            return true;
        }
        if (n5 == 11322) {
            return true;
        }
        if (n5 == 13136 || n5 == 13393 || n5 == 13394 || n5 == 13138 || n5 == 13139 || n5 == 13395 || n5 == 13396 || n5 == 13140 || n5 == 13141 || n5 == 13397 || n5 == 12889) {
            return true;
        }
        if (n5 == 12346 || n5 == 12602) {
            return false;
        }
        if (n5 == 12605) {
            return false;
        }
        if (n5 == 12861 && n <= 3215) {
            return false;
        }
        if (n >= 3007 && n <= 3047 && n2 >= 3856 && n2 <= 3903) {
            return true;
        }
        if (n >= 2945 && n <= 2959 && n2 >= 3813 && n2 <= 3827) {
            return true;
        }
        if (n >= 3331 && n <= 3373 && n2 <= 3854) {
            return false;
        }
        if (n5 == 12347) {
            return false;
        }
        if (n5 == 12603 && n <= 3150) {
            return false;
        }
        if (n5 == 6810) {
            return true;
        }
        if (n5 == 13131 || n5 == 13387) {
            return true;
        }
        if (n >= 2744 && n <= 2993 && n2 >= 2872 && n2 <= 2956) {
            return true;
        }
        if (n5 == 11668) {
            return true;
        }
        if (n5 == 12703 || n5 == 12702 || n5 == 12701 || n5 == 12959 || n5 == 12958 || n5 == 12957) {
            return true;
        }
        if (n5 == 9023) {
            return true;
        }
        if (n5 == 11412 || n5 == 11562 || n5 == 9875 || n5 == 11310 || n5 == 11054 || n5 == 11566) {
            return true;
        }
        if (n5 == 9369) {
            return true;
        }
        if (n5 == 9008 || n5 == 9007) {
            return true;
        }
        if (n5 == 13462) {
            return true;
        }
        if (n5 == 9033) {
            return true;
        }
        if (n5 == 10036) {
            return true;
        }
        if (n5 == 9802) {
            return true;
        }
        if (n5 == 14235 || n5 == 13979) {
            return true;
        }
        return n >= 1721 && n <= 1791 && n2 >= 5123 && n2 <= 5249 || n >= 3029 && n <= 3393 && n2 >= 3759 && n2 <= 3903 || n >= 2250 && n <= 2280 && n2 >= 4670 && n2 <= 4720 || n >= 3198 && n <= 3380 && n2 >= 3904 && n2 <= 3970 || n >= 3191 && n <= 3326 && n2 >= 3510 && n2 <= 3759 || n >= 2987 && n <= 3006 && n2 >= 3912 && n2 <= 3937 || n >= 2245 && n <= 2295 && n2 >= 4675 && n2 <= 4720 || n >= 2481 && n <= 2563 && n2 >= 10138 && n2 <= 10175 || n >= 3006 && n <= 3071 && n2 >= 3602 && n2 <= 3710 || n >= 3134 && n <= 3192 && n2 >= 3519 && n2 <= 3646 || n >= 2815 && n <= 2966 && n2 >= 5240 && n2 <= 5375 || n >= 2840 && n <= 2950 && n2 >= 5190 && n2 <= 5230 || n >= 3547 && n <= 3555 && n2 >= 9690 && n2 <= 9699 || n >= 2970 && n <= 3000 && n2 >= 4365 && n2 <= 4400 || n2 >= 4423 && n2 <= 4468 && n >= 2885 && n <= 3934 || n >= 3195 && n <= 3327 && n2 >= 3520 && n2 <= 3970 || n >= 2376 && 5127 >= n2 && n <= 2422 && 5168 <= n2 || n >= 2374 && n2 >= 5129 && n <= 2424 && n2 <= 5168 || n >= 2622 && n2 >= 5696 && n <= 2573 && n2 <= 5752 || n >= 2368 && n2 >= 3072 && n <= 2431 && n2 <= 3135 || n >= 2365 && n2 >= 9470 && n <= 2436 && n2 <= 9532 || n >= 2948 && n2 >= 5537 && n <= 3071 && n2 <= 5631 || n >= 2756 && n2 >= 5537 && n <= 2879 && n2 <= 5631 || n >= 4159 && n2 >= 5687 && n <= 4220 && n2 <= 5733 || n >= 3011 && n <= 3132 && n2 >= 10052 && n2 <= 10175 && (n2 >= 10066 || n >= 3094) || n <= 2420 && n >= 2337 && n2 <= 3872 && n2 >= 3842;
    }

    public void Y() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        boolean bl = this.lV == 2;
        int n6 = n5 = !C_Client_mc.ai() ? 517 : 0;
        if (bl) {
            if (rs.p_f.C_a.ai == C_a.c.a) {
                this.iu.f(2 + n5, 0);
            } else {
                this.H[44].f(ai - 181, 0);
                this.H[45].f(ai - 158, 7);
            }
            this.v.a();
            return;
        }
        int n7 = this.ft + this.oa & 0x7FF;
        int n8 = 48 + C_Client_mc.eR.ac / 32;
        int n9 = 464 - C_Client_mc.eR.ad / 32;
        this.aT.a(151, n7, this.fO, 256 + this.fh, this.eq, n9, rs.p_f.C_a.ai == C_a.c.a ? 9 : 7, rs.p_f.C_a.ai == C_a.c.a ? n5 + 54 : ai - 158, 146, n8);
        for (n4 = 0; n4 < this.mz; ++n4) {
            n3 = this.mA[n4] * 4 + 2 - C_Client_mc.eR.ac / 32;
            int n10 = this.mB[n4] * 4 + 2 - C_Client_mc.eR.ad / 32;
            n2 = this.mA[n4] + eh;
            n = this.mB[n4] + ei;
            if (n2 == 3086 && n == 3481 || n2 == 3092 && n == 3488 || n2 == 3089 && n == 3474 || n2 == 3086 && n == 3469 || n2 == 3077 && n == 3496 || n2 == 3077 && n == 3489 || n2 == 3084 && n == 3502) continue;
            this.a(this.no[n4], n3, n10);
        }
        this.a(this.fI, (3094 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3472 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.fI, (3077 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3496 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.fG, (3080 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3492 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.fH, (3108 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3494 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[109], (3095 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3506 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[189], (3082 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3486 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[92], (3083 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3499 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.fK, (3087 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3507 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[64], (3086 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3484 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[5], (4059 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3373 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[16], (4064 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3349 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(21)).b()], (4071 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3367 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[16], (4063 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3077 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[16], (4069 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3086 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[16], (4062 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3094 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[5], (4082 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3070 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[152], (2952 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2900 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[152], (2860 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2943 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[152], (2788 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2958 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[152], (2920 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2920 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[152], (2854 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2919 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[152], (2794 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2907 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[152], (2876 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2912 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[152], (2928 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2733 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[118], (2881 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2926 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[51], (3206 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (9571 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[51], (3220 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (9554 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (3226 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (9542 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[50], (3294 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3858 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[50], (3190 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3793 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[50], (3317 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3760 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1505 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4385 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1506 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4383 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1532 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4412 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1534 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4394 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1529 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4358 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1504 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4354 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1481 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4356 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1475 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4378 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1479 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4408 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (1503 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4406 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[118], (3376 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3892 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (2950 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3925 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[182], (3167 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (9572 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (3999 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2501 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (4000 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2529 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[50], (4000 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2554 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[50], (3977 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2543 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[50], (4022 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (2544 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (3286 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3812 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (3256 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (9348 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (3261 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (9401 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (3578 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (9927 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(fE[194], (3475 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (9938 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[5], (3093 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3510 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        this.a(this.me[51], (3102 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (3488 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        if (rs.p_l.p_e.C_f.a.a(this)) {
            this.a(fE[73], (1510 - eh) * 4 + 2 - C_Client_mc.eR.ac / 32, (4363 - ei) * 4 + 2 - C_Client_mc.eR.ad / 32);
        }
        for (n4 = 0; n4 < 104; ++n4) {
            for (n3 = 0; n3 < 104; ++n3) {
                C_h c_h = this.jH[dw][n4][n3];
                if (c_h == null) continue;
                n2 = n4 * 4 + 2 - C_Client_mc.eR.ac / 32;
                n = n3 * 4 + 2 - C_Client_mc.eR.ad / 32;
                this.a(this.mC, n2, n);
            }
        }
        for (n4 = 0; n4 < this.cB; ++n4) {
            rs.p_a.C_j c_j = this.cA[this.cC[n4]];
            if (c_j == null || !c_j.l()) continue;
            rs.p_d.C_d c_d = c_j.aG;
            if (c_d.G != null) {
                c_d = c_d.c();
            }
            if (c_d == null || !c_d.F || !c_d.C) continue;
            n2 = c_j.ac / 32 - C_Client_mc.eR.ac / 32;
            n = c_j.ad / 32 - C_Client_mc.eR.ad / 32;
            if (c_d.x == 3261L || c_d.x == 3262L || c_d.x == 6100L || c_d.x == 3066L || c_d.x == 6748L || c_d.x == 6747L || c_d.x == 6749L || c_d.x == 1951L) {
                this.a(this.mG, n2, n);
                continue;
            }
            if (c_d.x == 5413L || c_d.x == 5871L || c_d.x == 1901L || c_d.x == 1902L || c_d.x == 1904L || c_d.x == 1905L || c_d.x == 6735L || c_d.x == 1950L || c_d.x == 1931L || c_d.x == 1930L) {
                this.a(this.mF, n2, n);
                continue;
            }
            if (c_d.x == 692L) {
                this.a(fE[152], n2, n);
                continue;
            }
            if (c_d.x == 1472L) {
                this.a(fE[248], n2, n);
                continue;
            }
            if (c_d.x == 4704L) {
                this.a(fE[229], n2, n);
                continue;
            }
            if (c_d.x == 5399L) {
                this.a(this.fJ, n2, n);
                continue;
            }
            if (c_d.x == 6730L || c_d.x == 6999L || c_d.x == 6729L) {
                this.a(this.mH, n2, n);
                continue;
            }
            if (c_d.x == 5328L || c_d.x == 8341L || c_d.x == 8095L) {
                this.a(this.mI, n2, n);
                continue;
            }
            if (c_d.x == 8085L || c_d.x == 8086L || c_d.x == 8087L || c_d.x == 8150L || c_d.x == 8151L) {
                this.a(this.mJ, n2, n);
                continue;
            }
            if (c_d.x >= 6736L && c_d.x <= 6739L || c_d.x == 7284L || c_d.x == 1839L || c_d.x >= 727L && c_d.x <= 730L || c_d.x >= 3682L && c_d.x <= 3694L) {
                this.a(this.mK, n2, n);
                continue;
            }
            if (c_d.x == 8495L || c_d.x == 3794L || c_d.x == 3795L || c_d.x == 3796L || c_d.x == 3797L || c_d.x >= 7072L && c_d.x <= 7076L) {
                this.a(this.mL, n2, n);
                continue;
            }
            if (c_d.S > 0) {
                this.a(fE[c_d.S], n2, n);
                continue;
            }
            this.a(this.mD, n2, n);
        }
        for (n4 = 0; n4 < this.ku; ++n4) {
            rs.p_a.C_k c_k = kw_do[this.kv[n4]];
            if (c_k == null || !c_k.l() || c_k.aC == 25 && !rs.p_f.C_a.bp && c_k.m == -1 || rs.p_l.p_e.C_f.a.e() && c_k.aT != null) continue;
            int n11 = c_k.ac / 32 - C_Client_mc.eR.ac / 32;
            n2 = c_k.ad / 32 - C_Client_mc.eR.ad / 32;
            n = 0;
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            if (C_Client_mc.eR.bh < 1 || C_Client_mc.eR.bh > 4) {
                for (int i = 0; i < this.ju.length; ++i) {
                    if (this.ju[i] == null || !this.ju[i].equalsIgnoreCase(c_k.aZ)) continue;
                    bl3 = true;
                }
                long l2 = C_O_uc.a(c_k.aZ);
                for (int i = 0; i < this.kA; ++i) {
                    if (l2 != this.lg[i] || this.jG[i] == 0) continue;
                    n = 1;
                    break;
                }
                if (C_Client_mc.eR.aX != 0 && c_k.aX != 0 && C_Client_mc.eR.aX == c_k.aX) {
                    bl4 = true;
                }
            } else {
                boolean bl5 = bl4 = c_k.bh == C_Client_mc.eR.bh;
                if (c_k.bh == 1 && C_Client_mc.eR.bh == 3 || c_k.bh == 3 && C_Client_mc.eR.bh == 1) {
                    bl4 = true;
                }
                if (c_k.bh == 2 && C_Client_mc.eR.bh == 4 || c_k.bh == 4 && C_Client_mc.eR.bh == 2) {
                    bl4 = true;
                }
            }
            if (bl3 && n == 0) {
                this.a(this.mO, n11, n2);
                continue;
            }
            if (n != 0) {
                this.a(this.mN, n11, n2);
                continue;
            }
            if (bl4) {
                this.a(this.mQ, n11, n2);
                continue;
            }
            this.a(this.mM, n11, n2);
        }
        if (this.jZ != 0 && ff % 20 < 10) {
            rs.p_a.C_k c_k;
            rs.p_a.C_j c_j;
            if (this.jZ == 1 && this.of >= 0 && this.of < this.cA.length && (c_j = this.cA[this.of]) != null) {
                int n12 = c_j.ac / 32 - C_Client_mc.eR.ac / 32;
                int n13 = c_j.ad / 32 - C_Client_mc.eR.ad / 32;
                this.b(this.kh, n13, n12);
            }
            if (this.jZ == 2) {
                int n14 = (this.kW - eh) * 4 + 2 - C_Client_mc.eR.ac / 32;
                int n15 = (this.kX - ei) * 4 + 2 - C_Client_mc.eR.ad / 32;
                this.b(this.kh, n15, n14);
            }
            if (this.jZ == 10 && this.kV >= 0 && this.kV < kw_do.length && (c_k = kw_do[this.kV]) != null) {
                int n16 = c_k.ac / 32 - C_Client_mc.eR.ac / 32;
                int n17 = c_k.ad / 32 - C_Client_mc.eR.ad / 32;
                this.b(this.kh, n17, n16);
            }
        }
        if (this.gd != 0) {
            int n18 = this.gd * 4 + 2 - C_Client_mc.eR.ac / 32;
            int n19 = this.ge * 4 + 2 - C_Client_mc.eR.ad / 32;
            this.a(this.kg, n18, n19);
        }
        rs.p_l.C_c.a(3, rs.p_f.C_a.ai == C_a.c.a ? 83 : 80, rs.p_f.C_a.ai == C_a.c.a ? n5 + 127 : ai - 88, 0xFFFFFF, 3);
        if (rs.p_f.C_a.ai == C_a.c.a) {
            this.H[19].f(0 + n5, 0);
            this.H[19].f(2 + n5, 0);
        } else {
            this.H[44].f(ai - 181, 0);
        }
        this.ng.a(33, this.ft, this.mp, 256, this.ln, rs.p_f.C_a.ai == C_a.c.a ? 25 : 24, 4, rs.p_f.C_a.ai == C_a.c.a ? n5 + 29 : ai - 176, 33, 25);
        this.v.a();
        if (this.cY == 3 && ff % 20 < 10 && rs.p_f.C_a.ai == C_a.c.a) {
            this.cX.f(175, 53);
        }
    }

    private void a(rs.p_a.C_c c_c, int n) {
        this.g(c_c.ac, n, c_c.ad);
    }

    public void g(int n, int n2, int n3) {
        if (n < 128 || n3 < 128 || n > 13056 || n3 > 13056) {
            this.dN = -1;
            this.dO = -1;
            return;
        }
        int n4 = this.c(dw, n3, n) - n2;
        n -= cJ;
        n4 -= cK;
        int n5 = rs.p_a.C_h.bA[this.cR];
        int n6 = rs.p_a.C_h.bB[this.cR];
        int n7 = rs.p_a.C_h.bA[this.cS];
        int n8 = rs.p_a.C_h.bB[this.cS];
        int n9 = (n3 -= cL) * n7 + n * n8 >> 16;
        n3 = n3 * n8 - n * n7 >> 16;
        n = n9;
        n9 = n4 * n6 - n3 * n5 >> 16;
        n3 = n4 * n5 + n3 * n6 >> 16;
        n4 = n9;
        if (n3 >= 50) {
            this.dN = (C_Client_mc.ai() ? 4 : 4) + C_E_uc.s + (n << 9) / n3;
            this.dO = C_E_uc.t + (n4 << 9) / n3;
        } else {
            this.dN = -1;
            this.dO = -1;
        }
    }

    private void bN() {
        if (this.nS == 0) {
            return;
        }
        int n = 0;
        if (this.eN != 0L || rs.p_f.C_a.aA && this.co != null && !this.co.equals("")) {
            n = 1;
        }
        for (int i = 0; i < 200; ++i) {
            if (this.dC[i] == null) continue;
            int n2 = this.dz[i];
            String string = this.dB[i];
            int n3 = this.dA[i];
            int n4 = 175;
            if ((n2 == 3 || n2 == 7) && (n2 == 7 || this.cE == 0 || this.cE == 1 && this.i(string))) {
                int n5 = rs.p_f.C_a.ai == C_a.c.a ? 4 : 0;
                int n6 = 329 - n * 13;
                if (rs.p_f.C_a.ai != C_a.c.a) {
                    n6 = ah - n4 - n * 13;
                }
                if (rs.C_C_uc.hP > 4 && rs.C_C_uc.hQ - n5 > n6 - 10 && rs.C_C_uc.hQ - n5 <= n6 + 3) {
                    int n7 = this.gi.a("From:  " + string + this.dC[i]) + 25;
                    if (n7 > 450) {
                        n7 = 450;
                    }
                    if (rs.C_C_uc.hP < 4 + n7) {
                        if (cT == 1 || cT == 2) {
                            this.fx[this.eV] = "Report abuse @whi@" + string;
                            this.eI[this.eV] = 2606;
                            ++this.eV;
                        }
                        this.fx[this.eV] = "Add ignore @whi@" + string;
                        this.eI[this.eV] = 2042;
                        ++this.eV;
                        this.fx[this.eV] = "Add friend @whi@" + string;
                        this.eI[this.eV] = 2337;
                        ++this.eV;
                    }
                }
                if (++n >= 5) {
                    return;
                }
            }
            if (n2 != 5 && n2 != 6 || this.cE >= 2 || ++n < 5) continue;
            return;
        }
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.a(n, n2, n3, n4, n5, n6, n7, n8, n9, false);
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl) {
        C_N_uc c_N_uc = null;
        if (!bl) {
            C_N_uc c_N_uc2 = (C_N_uc)this.nL.b();
            while (c_N_uc2 != null) {
                if (c_N_uc2.h == n7 && c_N_uc2.j == n8 && c_N_uc2.k == n5 && c_N_uc2.i == n4) {
                    c_N_uc = c_N_uc2;
                    break;
                }
                c_N_uc2 = (C_N_uc)this.nL.d();
            }
        }
        if (c_N_uc == null) {
            c_N_uc = new C_N_uc();
            c_N_uc.h = n7;
            c_N_uc.i = n4;
            c_N_uc.j = n8;
            c_N_uc.k = n5;
            this.a(c_N_uc);
            this.nL.a(c_N_uc);
        }
        c_N_uc.a = n2;
        c_N_uc.f = n6;
        c_N_uc.b = n3;
        c_N_uc.o = n9;
        c_N_uc.g = n;
    }

    public boolean b(rs.p_n.C_e c_e) {
        if (c_e.aq == null) {
            return false;
        }
        for (int i = 0; i < c_e.aq.length; ++i) {
            int n = this.a(c_e, i);
            int n2 = c_e.I[i];
            if ((c_e.aw == 957 || c_e.aw == 915 || c_e.aw == 12464 || c_e.aw == 12466 || c_e.aw == 12468 || c_e.aw == 12470 || c_e.aw == 68510 || c_e.aw == 12480 || c_e.aw == 12482 || c_e.aw == 39975 || c_e.aw == 39974 || c_e.aw == 39973 || c_e.aw == 39972 || c_e.aw == 19099 || c_e.aw == 19097 || c_e.aw == 19095 || c_e.aw == 19093 || c_e.aw == 19091 || c_e.aw == 19089 || c_e.aw == 19087 || c_e.aw == 19085 || c_e.aw == 19083 || c_e.aw == 12472 || c_e.aw == 12474 || c_e.aw == 19081 || c_e.aw == 19079 || c_e.aw == 19077 || c_e.aw == 19075 || c_e.aw == 19073 || c_e.aw == 19071) && n == 1) {
                return true;
            }
            if (!(c_e.aw != 22584 && c_e.aw != 22586 || C_aG_mc.c)) {
                return true;
            }
            if (!(c_e.aq[i] == 2 ? n >= n2 : (c_e.aq[i] == 3 ? n <= n2 : (c_e.aq[i] == 4 ? n == n2 : n != n2)))) continue;
            return false;
        }
        return true;
    }

    private DataInputStream j(String string) {
        if (this.jL != null) {
            try {
                this.jL.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.jL = null;
        }
        this.jL = this.b(43595);
        this.jL.setSoTimeout(10000);
        InputStream inputStream = this.jL.getInputStream();
        OutputStream outputStream = this.jL.getOutputStream();
        outputStream.write(("JAGGRAB /" + string + "\n\n").getBytes());
        return new DataInputStream(inputStream);
    }

    private void a(C_F_uc c_F_uc) {
        int n;
        int n2 = hQ - 15;
        int n3 = hP - 10;
        if (this.jv > 10) {
            n = n3 - 110;
            int n4 = n2 - 100;
            c_F_uc.a(n, n4, (this.jv - 10) * 3);
            int n5 = 1;
            rs.p_l.C_c.e(n - n5, 251 + n5 * 2, 219 + n5 * 2, 2367511, n4 - n5, (this.jv - 10) * 3);
        }
        if (this.jv > 10) {
            n = rs.p_l.C_h.ap;
            rs.p_l.C_h.ap = (this.jv - 10) * 3;
            this.b(n3 + 16, n2 + 5, "       <img=50> @yel@Summer Battlefield Minigame <img=50>\nYou'll be auto-assigned to one of the teams\nin a war between Wizards vs Warriors. Join as@whi@\na pvp @or2@<img=53> Fighter@whi@ or non-pvp @gre@<img=49> Medic!");
            rs.p_l.C_h.ap = n;
        }
    }

    private void d(rs.p_x.C_e c_e) {
        int n;
        int n2 = c_e.k(8);
        if (rs.p_f.C_a.d.booleanValue()) {
            cx.add("\t-> newPlayerCount=" + n2);
        }
        if (n2 < this.ku) {
            for (n = n2; n < this.ku; ++n) {
                this.jO[this.jN++] = this.kv[n];
            }
        }
        if (n2 > this.ku) {
            rs.p_v.C_a.e(this.fk + " Too many players");
            throw new RuntimeException("eek");
        }
        this.ku = 0;
        n = 0;
        for (int i = 0; i < n2; ++i) {
            int n3;
            int n4;
            int n5 = this.kv[i];
            rs.p_a.C_k c_k = kw_do[n5];
            int n6 = c_e.k(1);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t\t-> [" + n5 + "] j1=" + n6);
            }
            if (n6 == 0) {
                this.kv[this.ku++] = n5;
                c_k.P = ff;
                continue;
            }
            int n7 = c_e.k(2);
            if (rs.p_f.C_a.d.booleanValue()) {
                cx.add("\t\t-> [" + n5 + "] k1=" + n7);
            }
            if (n7 == 0) {
                this.kv[this.ku++] = n5;
                c_k.P = ff;
                this.kx[this.kw++] = n5;
                continue;
            }
            if (n7 == 1) {
                this.kv[this.ku++] = n5;
                c_k.P = ff;
                n4 = c_e.k(3);
                c_k.a(false, n4);
                n3 = c_e.k(1);
                if (rs.p_f.C_a.d.booleanValue()) {
                    cx.add("\t\t-> [" + n5 + "] direction=" + n4 + ", updateRequired=" + n3);
                }
                if (n3 != 1) continue;
                this.kx[this.kw++] = n5;
                continue;
            }
            if (n7 == 2) {
                ++n;
                this.kv[this.ku++] = n5;
                c_k.P = ff;
                n4 = c_e.k(3);
                c_k.a(true, n4);
                n3 = c_e.k(3);
                c_k.a(true, n3);
                int n8 = c_e.k(1);
                if (rs.p_f.C_a.d.booleanValue()) {
                    cx.add("\t\t-> [" + n5 + "] firstDirection=" + n4 + ", secondDirection=" + n3 + ", updaterequired=" + n8);
                }
                if (n8 != 1) continue;
                this.kx[this.kw++] = n5;
                continue;
            }
            if (n7 != 3) continue;
            this.jO[this.jN++] = n5;
        }
    }

    private void h(boolean bl) {
        this.G.a();
    }

    @Override
    public void Z() {
        this.ga = true;
    }

    private void c(rs.p_x.C_e c_e, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        if (n == 84) {
            C_h c_h;
            int n15 = c_e.y();
            int n16 = this.oE + (n15 >> 4 & 7);
            int n17 = this.oF + (n15 & 7);
            int n18 = c_e.A();
            int n19 = c_e.A();
            int n20 = c_e.A();
            if (n16 >= 0 && n17 >= 0 && n16 < 104 && n17 < 104 && (c_h = this.jH[dw][n16][n17]) != null) {
                C_g c_g = (C_g)c_h.b();
                while (c_g != null) {
                    if (c_g.h == (n18 & Short.MAX_VALUE) && c_g.k == n19) {
                        c_g.k = n20;
                        break;
                    }
                    c_g = (C_g)c_h.d();
                }
                this.o(n16, n17);
            }
            return;
        }
        if (n == 105) {
            n14 = c_e.y();
            n13 = this.oE + (n14 >> 4 & 7);
            n12 = this.oF + (n14 & 7);
            n11 = c_e.A();
            n10 = c_e.y();
            n9 = n10 >> 4 & 0xF;
            n8 = n10 & 7;
            if (C_Client_mc.eR.k[0] >= n13 - n9 && C_Client_mc.eR.k[0] <= n13 + n9 && C_Client_mc.eR.l[0] >= n12 - n9 && C_Client_mc.eR.l[0] <= n12 + n9 && this.jT && !li && this.ms < 50) {
                this.nY[this.ms] = n11;
                this.oo[this.ms] = n8;
                this.os[this.ms] = rs.p_w.C_e.a[n11];
                ++this.ms;
            }
        }
        if (n == 215) {
            n14 = c_e.T();
            n13 = c_e.P();
            n12 = this.oE + (n13 >> 4 & 7);
            n11 = this.oF + (n13 & 7);
            n10 = c_e.T();
            n9 = c_e.A();
            if (n12 >= 0 && n11 >= 0 && n12 < 104 && n11 < 104 && n10 != di) {
                C_g c_g = new C_g();
                c_g.h = n14;
                c_g.k = n9;
                if (this.jH[dw][n12][n11] == null) {
                    this.jH[C_Client_mc.dw][n12][n11] = new C_h();
                }
                this.jH[dw][n12][n11].a(c_g);
                this.o(n12, n11);
            }
            return;
        }
        if (n == 156) {
            C_h c_h;
            n14 = c_e.N();
            n13 = this.oE + (n14 >> 4 & 7);
            n12 = this.oF + (n14 & 7);
            n11 = c_e.A();
            if (n13 >= 0 && n12 >= 0 && n13 < 104 && n12 < 104 && (c_h = this.jH[dw][n13][n12]) != null) {
                C_g c_g = (C_g)c_h.b();
                while (c_g != null) {
                    if (c_g.h == (n11 & Short.MAX_VALUE)) {
                        c_g.b();
                        break;
                    }
                    c_g = (C_g)c_h.d();
                }
                if (c_h.b() == null) {
                    this.jH[C_Client_mc.dw][n13][n12] = null;
                }
                this.o(n13, n12);
            }
            return;
        }
        if (n == 160) {
            n14 = c_e.P();
            n13 = this.oE + (n14 >> 4 & 7);
            n12 = this.oF + (n14 & 7);
            n11 = c_e.P();
            n10 = n11 >> 2;
            n9 = n11 & 3;
            n8 = this.nJ[n10];
            int n21 = c_e.T();
            if (n13 >= 0 && n12 >= 0 && n13 < 103 && n12 < 103) {
                C_Q_uc c_Q_uc;
                int n22 = this.fC[dw][n13][n12];
                int n23 = this.fC[dw][n13 + 1][n12];
                int n24 = this.fC[dw][n13 + 1][n12 + 1];
                int n25 = this.fC[dw][n13][n12 + 1];
                if (n8 == 0 && (c_Q_uc = this.dF.m(dw, n13, n12)) != null) {
                    int n26 = c_Q_uc.m >> 14 & Short.MAX_VALUE;
                    if (n10 == 2) {
                        c_Q_uc.f = new rs.p_a.C_m(n26, 4 + n9, 2, n23, n24, n22, n25, n21, false);
                        c_Q_uc.g = new rs.p_a.C_m(n26, n9 + 1 & 3, 2, n23, n24, n22, n25, n21, false);
                    } else {
                        c_Q_uc.f = new rs.p_a.C_m(n26, n9, n10, n23, n24, n22, n25, n21, false);
                    }
                }
                if (n8 == 1 && (c_Q_uc = this.dF.n(n13, n12, dw)) != null) {
                    ((C_T_uc)c_Q_uc).e = new rs.p_a.C_m(((C_T_uc)c_Q_uc).a, 0, 4, n23, n24, n22, n25, n21, false);
                }
                if (n8 == 2) {
                    c_Q_uc = this.dF.o(n13, n12, dw);
                    if (n10 == 11) {
                        n10 = 10;
                    }
                    if (c_Q_uc != null) {
                        ((C_l)c_Q_uc).d = new rs.p_a.C_m(((C_l)c_Q_uc).a, n9, n10, n23, n24, n22, n25, n21, false);
                    }
                }
                if (n8 == 3 && (c_Q_uc = this.dF.p(n12, n13, dw)) != null) {
                    ((C_m)c_Q_uc).c = new rs.p_a.C_m(((C_m)c_Q_uc).a, n9, 22, n23, n24, n22, n25, n21, false);
                }
            }
            return;
        }
        if (n == 147) {
            int n27;
            int n28;
            int n29;
            int n30;
            C_r c_r;
            rs.p_a.C_h c_h;
            n14 = c_e.P();
            n13 = this.oE + (n14 >> 4 & 7);
            n12 = this.oF + (n14 & 7);
            n11 = c_e.A();
            n10 = c_e.R();
            n9 = c_e.S();
            n8 = c_e.Q();
            n7 = c_e.A();
            n6 = c_e.P();
            n5 = n6 >> 2;
            n4 = n6 & 3;
            n3 = this.nJ[n5];
            n2 = c_e.z();
            int n31 = c_e.A();
            int n32 = c_e.Q();
            rs.p_a.C_k c_k = n11 == di ? eR : kw_do[n11];
            if (c_k != null && (c_h = (c_r = C_r.c(n31)).a(n5, n4, n30 = this.fC[dw][n13][n12], n29 = this.fC[dw][n13 + 1][n12], n28 = this.fC[dw][n13 + 1][n12 + 1], n27 = this.fC[dw][n13][n12 + 1], -1, -1)) != null) {
                int n33;
                this.a(n7 + 1, -1, 0, n3, n12, 0, dw, n13, n9 + 1);
                c_k.bj = n9 + ff;
                c_k.bk = n7 + ff;
                c_k.bq = c_h;
                int n34 = c_r.U;
                int n35 = c_r.af;
                if (n4 == 1 || n4 == 3) {
                    n34 = c_r.af;
                    n35 = c_r.U;
                }
                c_k.bn = n13 * 128 + n34 * 64;
                c_k.bp = n12 * 128 + n35 * 64;
                c_k.bo = this.c(dw, c_k.bp, c_k.bn);
                if (n2 > n10) {
                    n33 = n2;
                    n2 = n10;
                    n10 = n33;
                }
                if (n32 > n8) {
                    n33 = n32;
                    n32 = n8;
                    n8 = n33;
                }
                c_k.bt = n13 + n2;
                c_k.bv = n13 + n10;
                c_k.bu = n12 + n32;
                c_k.bw = n12 + n8;
            }
        }
        if (n == 151) {
            n14 = c_e.N();
            n13 = this.oE + (n14 >> 4 & 7);
            n12 = this.oF + (n14 & 7);
            n11 = c_e.S();
            n10 = c_e.P();
            n9 = n10 >> 2;
            n8 = n10 & 3;
            n7 = this.nJ[n9];
            if (n13 >= 0 && n12 >= 0 && n13 < 104 && n12 < 104) {
                this.a(-1, n11, n8, n7, n12, n9, dw, n13, 0);
            }
            return;
        }
        if (n == 4) {
            n14 = c_e.y();
            n13 = this.oE + (n14 >> 4 & 7);
            n12 = this.oF + (n14 & 7);
            n11 = c_e.A();
            n10 = c_e.y();
            n9 = c_e.A();
            if (n13 >= 0 && n12 >= 0 && n13 < 104 && n12 < 104) {
                n13 = n13 * 128 + 64;
                n12 = n12 * 128 + 64;
                rs.p_a.C_b c_b = new rs.p_a.C_b(dw, ff, n9, n11, this.c(dw, n12, n13) - n10, n12, n13);
                this.et.a(c_b);
            }
            return;
        }
        if (n == 44) {
            n14 = c_e.U();
            n13 = c_e.A();
            n12 = c_e.y();
            n11 = this.oE + (n12 >> 4 & 7);
            n10 = this.oF + (n12 & 7);
            if (n11 >= 0 && n10 >= 0 && n11 < 104 && n10 < 104) {
                C_g c_g = new C_g();
                c_g.h = n14;
                c_g.k = n13;
                if (this.jH[dw][n11][n10] == null) {
                    this.jH[C_Client_mc.dw][n11][n10] = new C_h();
                }
                this.jH[dw][n11][n10].a(c_g);
                this.o(n11, n10);
            }
            return;
        }
        if (n == 101) {
            n14 = c_e.O();
            n13 = n14 >> 2;
            n12 = n14 & 3;
            n11 = this.nJ[n13];
            n10 = c_e.y();
            n9 = this.oE + (n10 >> 4 & 7);
            n8 = this.oF + (n10 & 7);
            n7 = n9 + eh;
            n6 = n8 + ei;
            this.kw_if.remove(n7 + "," + n6);
            if (n9 >= 0 && n8 >= 0 && n9 < 104 && n8 < 104) {
                this.a(-1, -1, n12, n11, n8, n13, dw, n9, 0);
            }
            return;
        }
        if (n == 117) {
            n14 = c_e.y();
            n13 = this.oE + (n14 >> 4 & 7);
            n12 = this.oF + (n14 & 7);
            n11 = n13 + c_e.z();
            n10 = n12 + c_e.z();
            n9 = c_e.B();
            n8 = c_e.A();
            n7 = c_e.y() * 4;
            n6 = c_e.y() * 4;
            n5 = c_e.A();
            n4 = c_e.A();
            n3 = c_e.y();
            n2 = c_e.y();
            if (n13 >= 0 && n12 >= 0 && n13 < 104 && n12 < 104 && n11 >= 0 && n10 >= 0 && n11 < 104 && n10 < 104 && n8 != 65535) {
                n13 = n13 * 128 + 64;
                n12 = n12 * 128 + 64;
                n11 = n11 * 128 + 64;
                n10 = n10 * 128 + 64;
                rs.p_a.C_l c_l = new rs.p_a.C_l(n3, n6, n5 + ff, n4 + ff, n2, dw, this.c(dw, n12, n13) - n7, n12, n13, n9, n8);
                c_l.a(n5 + ff, n10, this.c(dw, n10, n11) - n6, n11);
                this.ea.a(c_l);
            }
        }
    }

    public static void aa() {
        C_V_uc.h = true;
        C_E_uc.n = false;
        li = true;
        C_x.h = !rs.p_f.C_a.ax;
        C_r.Z = true;
    }

    private void e(rs.p_x.C_e c_e) {
        int n;
        c_e.J();
        int n2 = c_e.k(8);
        if (n2 < this.cB) {
            for (n = n2; n < this.cB; ++n) {
                this.jO[this.jN++] = this.cC[n];
            }
        }
        if (n2 > this.cB) {
            rs.p_v.C_a.e(this.fk + " Too many npcs");
            throw new RuntimeException("eek");
        }
        this.cB = 0;
        for (n = 0; n < n2; ++n) {
            int n3;
            int n4;
            int n5 = this.cC[n];
            rs.p_a.C_j c_j = this.cA[n5];
            int n6 = c_e.k(1);
            if (n6 == 0) {
                this.cC[this.cB++] = n5;
                c_j.P = ff;
                continue;
            }
            int n7 = c_e.k(2);
            if (n7 == 0) {
                this.cC[this.cB++] = n5;
                c_j.P = ff;
                this.kx[this.kw++] = n5;
                continue;
            }
            if (n7 == 1) {
                this.cC[this.cB++] = n5;
                c_j.P = ff;
                n4 = c_e.k(3);
                c_j.a(false, n4);
                n3 = c_e.k(1);
                if (n3 != 1) continue;
                this.kx[this.kw++] = n5;
                continue;
            }
            if (n7 == 2) {
                this.cC[this.cB++] = n5;
                c_j.P = ff;
                n4 = c_e.k(3);
                c_j.a(true, n4);
                n3 = c_e.k(3);
                c_j.a(true, n3);
                int n8 = c_e.k(1);
                if (n8 != 1) continue;
                this.kx[this.kw++] = n5;
                continue;
            }
            if (n7 != 3) continue;
            this.jO[this.jN++] = n5;
        }
    }

    private void bO() {
        if (this.cz == 0) {
            int n = this.hE / 2 - 80;
            int n2 = this.hF / 2 + 20;
            if (this.hU == 1 && this.hV >= n - 75 && this.hV <= n + 75 && this.hW >= (n2 += 20) - 20 && this.hW <= n2 + 20) {
                this.cz = 2;
                this.fD = 0;
            }
            n = this.hE / 2 + 80;
            if (this.hU == 1 && this.hV >= n - 75 && this.hV <= n + 75 && this.hW >= n2 - 20 && this.hW <= n2 + 20) {
                this.oC = "";
                this.oD = "Enter your username & password.";
                this.cz = 2;
                this.fD = 0;
            }
        } else {
            if (this.cz == 2) {
                int n;
                this.G.a(this.hU, rs.C_C_uc.hP, rs.C_C_uc.hQ, this.hV, this.hW);
                int n3 = this.hF / 2 - 40;
                n3 += 30;
                n3 += 25;
                n3 += 15;
                n3 += 15;
                int n4 = this.hE / 2 - 80;
                int n5 = this.hF / 2 + 50;
                n4 = this.hE / 2 + 80;
                if (this.hU != 1 || this.hV < n4 - 75 || this.hV > n4 + 75 || this.hW < (n5 += 20) - 20 || this.hW <= n5 + 20) {
                    // empty if block
                }
                while ((n = this.w(-796)) != -1) {
                    boolean bl = false;
                    for (int i = 0; i < nB.length(); ++i) {
                        if (n != nB.charAt(i)) continue;
                        bl = true;
                        break;
                    }
                    if (this.fD == 0) {
                        if (n == 8 && this.fk.length() > 0) {
                            this.fk = this.fk.substring(0, this.fk.length() - 1);
                        }
                        if (n == 9 || n == 10 || n == 13) {
                            this.fD = 1;
                        }
                        if (bl && (n != 32 || !this.fk.startsWith(" ") && !this.fk.equals(""))) {
                            this.fk = this.fk + (char)n;
                        }
                        if (this.fk.length() <= 12) continue;
                        this.fk = this.fk.substring(0, 12);
                        continue;
                    }
                    if (this.fD == 1) {
                        if (n == 8 && this.fl.length() > 0) {
                            this.fl = this.fl.substring(0, this.fl.length() - 1);
                        }
                        if (n == 9 || n == 10 || n == 13) {
                            if (this.fk == "") {
                                this.fD = 0;
                            } else if (this.fl == "") {
                                this.fD = 0;
                            } else if (!rs.p_f.C_a.h.booleanValue()) {
                                if (C_Launcher_mc.n().f().a("LOGIN_COOLDOWN", 500L)) {
                                    this.a(this.fk, this.fl, false);
                                }
                            } else {
                                this.fD = 2;
                            }
                        }
                        if (bl) {
                            this.fl = this.fl + (char)n;
                        }
                        if (this.fl.length() <= 20) continue;
                        this.fl = this.fl.substring(0, 20);
                        continue;
                    }
                    if (this.fD == 2) {
                        if (n == 8 && fn.length() > 0) {
                            fn = fn.substring(0, fn.length() - 1);
                        }
                        if (n == 9 || n == 10 || n == 13) {
                            if (this.fk == "") {
                                this.fD = 0;
                            } else if (this.fl == "") {
                                this.fD = 0;
                            } else {
                                this.a(this.fk, this.fl, false);
                            }
                        }
                        if (bl) {
                            fn = fn + (char)n;
                        }
                        if (fn.length() <= 20) continue;
                        fn = fn.substring(0, 20);
                        continue;
                    }
                    if (this.fD != 3) continue;
                    if (n == 8 && this.fm.length() > 0) {
                        this.fm = this.fm.substring(0, this.fm.length() - 1);
                    }
                    if (n == 10 && this.fm.length() == 5) {
                        this.fD = 0;
                        this.G.j = false;
                        this.a(this.fk, this.fl, false);
                    }
                    if (bl && n <= 57 && n >= 49 || n == 48) {
                        this.fm = this.fm + (char)n;
                    }
                    if (this.fm.length() <= 5) continue;
                    this.fm = this.fm.substring(0, 5);
                }
                return;
            }
            if (this.cz == 3) {
                int n = this.hE / 2;
                int n6 = this.hF / 2 + 50;
                if (this.hU == 1 && this.hV >= n - 75 && this.hV <= n + 75 && this.hW >= (n6 += 20) - 20 && this.hW <= n6 + 20) {
                    this.cz = 0;
                }
            }
        }
    }

    public void a(C_F_uc c_F_uc, int n, int n2) {
        if (c_F_uc == null) {
            return;
        }
        int n3 = this.ft + this.oa & 0x7FF;
        int n4 = n * n + n2 * n2;
        if (c_F_uc == this.kg ? n4 > 6400 * (this.fh > 0 ? 3 : 1) : n4 > (int)(6400.0 * (this.fh > 0 ? 1.0 + (double)this.fh / 210.0 + 0.25 : 1.0))) {
            return;
        }
        int n5 = !C_Client_mc.ai() ? 516 : 0;
        boolean bl = !C_Client_mc.ai() ? false : false;
        int n6 = rs.p_a.C_h.bA[n3];
        int n7 = rs.p_a.C_h.bB[n3];
        n6 = n6 * 256 / (this.fh + 256);
        n7 = n7 * 256 / (this.fh + 256);
        int n8 = n2 * n6 + n * n7 >> 16;
        int n9 = n2 * n7 - n * n6 >> 16;
        if (rs.p_f.C_a.ai == C_a.c.a) {
            c_F_uc.f(n5 + (94 + n8 - c_F_uc.n / 2) + 4 + 30, 83 - n9 - c_F_uc.o / 2 - 4 + 5);
        } else {
            c_F_uc.f(77 + n8 - c_F_uc.n / 2 + 4 + (ai - 167), 85 - n9 - c_F_uc.o / 2 - 4);
        }
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n5 >= 1 && n >= 1 && n5 <= 102 && n <= 102) {
            int n8;
            if (li && n2 != dw && (n7 != -1 && n7 != 30029 && n7 != 30030 && n7 != 30031 || n2 != 1 || dw != 0)) {
                return;
            }
            int n9 = 0;
            if (n6 == 0) {
                n9 = this.dF.a(n2, n5, n);
            }
            if (n6 == 1) {
                n9 = this.dF.c(n2, n5, n);
            }
            if (n6 == 2) {
                n9 = this.dF.e(n2, n5, n);
            }
            if (n6 == 3) {
                n9 = this.dF.g(n2, n5, n);
            }
            if (n9 != 0) {
                C_r c_r;
                n8 = this.dF.b(n2, n5, n, n9);
                int n10 = n9 >> 14 & Short.MAX_VALUE;
                int n11 = n8 & 0x1F;
                int n12 = n8 >> 6;
                if (n6 == 0) {
                    this.dF.a(n5, n2, n, (byte)-119);
                    c_r = C_r.c(n10);
                    if (c_r.aj) {
                        this.fP[n2].a(n12, n11, c_r.ab, n5, n);
                    }
                }
                if (n6 == 1) {
                    this.dF.i(n, n2, n5);
                }
                if (n6 == 2) {
                    this.dF.j(n2, n5, n);
                    c_r = C_r.c(n10);
                    if (n5 + c_r.U > 103 || n + c_r.U > 103 || n5 + c_r.af > 103 || n + c_r.af > 103) {
                        return;
                    }
                    if (c_r.aj) {
                        this.fP[n2].a(n12, c_r.U, n5, n, c_r.af, c_r.ab);
                    }
                }
                if (n6 == 3) {
                    this.dF.k(n2, n, n5);
                    c_r = C_r.c(n10);
                    if (c_r.aj && c_r.ar) {
                        this.fP[n2].b(n, n5);
                    }
                }
            }
            if (n7 >= 0) {
                n8 = n2;
                if (n8 < 3 && (this.gc[1][n5][n] & 2) == 2) {
                    ++n8;
                }
                C_x.a(this.dF, n3, n, n4, n8, this.fP[n2], this.fC, n5, n7, n2);
            }
        }
    }

    private void b(int n, rs.p_x.C_e c_e) {
        int n2;
        this.jN = 0;
        this.kw = 0;
        long l2 = System.currentTimeMillis();
        if (rs.p_f.C_a.d.booleanValue()) {
            cx.add("Updating local player movement..");
        }
        this.c(c_e);
        if (rs.p_f.C_a.d.booleanValue()) {
            cx.add("Updating other player movement..");
        }
        this.d(c_e);
        if (rs.p_f.C_a.d.booleanValue()) {
            cx.add("Updating player list..");
        }
        this.b(c_e, n);
        if (rs.p_f.C_a.d.booleanValue()) {
            cx.add("Parsing synchronization mask..");
        }
        this.a(c_e);
        if (rs.p_f.C_a.d.booleanValue()) {
            cx.add("..Done!");
        }
        for (n2 = 0; n2 < this.jN; ++n2) {
            int n3 = this.jO[n2];
            int n4 = n3 << 14;
            if (C_Client_mc.kw_do[n3].P == ff) continue;
            C_Client_mc.kw_do[n3] = null;
            rs.p_k.p_c.C_c.a(n4);
        }
        if (c_e.h != n) {
            for (String string : cx) {
                System.out.println(string);
            }
            rs.p_v.C_a.e("Error packet size mismatch in getplayer pos:" + c_e.h + " psize:" + n);
            throw new RuntimeException("eek");
        }
        for (n2 = 0; n2 < this.ku; ++n2) {
            if (kw_do[this.kv[n2]] != null) continue;
            rs.p_v.C_a.e(this.fk + " null entry in pl list - pos:" + n2 + " size:" + this.ku);
            throw new RuntimeException("eek");
        }
    }

    public void ab() {
        this.gq = 0;
        this.eU = 0;
        this.ft = 0;
        this.oa = 0;
        this.fh = 0;
        this.dp = 0;
    }

    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        int n9;
        int n10 = 2048 - n2 & 0x7FF;
        int n11 = 2048 - n5 & 0x7FF;
        int n12 = 0;
        int n13 = 0;
        int n14 = n;
        if (n10 != 0) {
            n9 = rs.p_a.C_h.bA[n10];
            n8 = rs.p_a.C_h.bB[n10];
            n7 = n13 * n8 - n14 * n9 >> 16;
            n14 = n13 * n9 + n14 * n8 >> 16;
            n13 = n7;
        }
        if (n11 != 0) {
            n9 = rs.p_a.C_h.bA[n11];
            n8 = rs.p_a.C_h.bB[n11];
            n7 = n14 * n9 + n12 * n8 >> 16;
            n14 = n14 * n8 - n12 * n9 >> 16;
            n12 = n7;
        }
        cJ = n3 - n12;
        cK = n4 - n13;
        cL = n6 - n14;
        this.cR = n2;
        this.cS = n5;
    }

    public boolean ac() {
        if (rs.p_l.p_b.p_a.C_d.g()) {
            return true;
        }
        boolean bl = rs.p_l.C_j.b(cT);
        if (rs.p_f.C_a.aM && (rs.p_l.C_j.a(cT) || eR != null && C_Client_mc.eR.aZ != null && C_Client_mc.eR.aZ.equalsIgnoreCase("Staff stash"))) {
            bl = true;
        }
        return bl;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        super.keyReleased(keyEvent);
        int n = keyEvent.getKeyCode();
        char c2 = keyEvent.getKeyChar();
        if (this.fN == 2 || this.fN == 1) {
            return;
        }
        if (this.gp == 55290 || this.gp == 55291 || this.gp == 55292 || this.gp == 55293) {
            if (n == 49 || n == 32) {
                fv.a(185);
                fv.d(55313);
            }
            if (n == 50) {
                fv.a(185);
                fv.d(55315);
            }
            if (n == 51) {
                fv.a(185);
                fv.d(55317);
            }
            if (n == 52) {
                fv.a(185);
                fv.d(55319);
            }
        }
        if (this.gp == 55333) {
            if (n == 49 || n == 32) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55321);
            }
            if (n == 50) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55323);
            }
            if (n == 51) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55325);
            }
            if (n == 52) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55327);
            }
            if (n == 53) {
                this.jw = System.currentTimeMillis();
                fv.a(185);
                fv.d(55329);
            }
        }
        if (System.currentTimeMillis() - this.jx < 100L) {
            return;
        }
        if (c2 == '\u001b' && C_Client_mc.w.b && this.ac()) {
            w.a();
            return;
        }
        this.cv.a(keyEvent);
        for (int n2 : jy) {
            if (n2 != this.gp) continue;
            if (n >= 49 && n <= 53) {
                this.jx = System.currentTimeMillis();
                ap = "::dialogueoption " + (n - 48);
            }
            if (n < 97 || n > 101) break;
            this.jx = System.currentTimeMillis();
            ap = "::dialogueoption " + (n - 96);
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        super.keyPressed(keyEvent);
        if (System.currentTimeMillis() - this.jw < 1000L) {
            return;
        }
        if (this.fN == 2) {
            return;
        }
        int n = keyEvent.getKeyCode();
        char c2 = keyEvent.getKeyChar();
        if (!this.fc) {
            if (this.fD == 3 && n == 27 && this.G.j) {
                this.fm = "";
                this.fD = 0;
                this.G.j = false;
                this.G.a("@yel@Safety reminder to new players:@whi@ Please do NOT", "use passwords that you've used on other servers.");
            }
            return;
        }
        if (n == 81 && (ch || keyEvent.isControlDown())) {
            this.jw = System.currentTimeMillis();
            if (av == null) {
                this.a("<img=25> You haven't equipped a loadout that you can shortcut to yet!", 0, null);
            } else {
                ap = av;
                ao = aw;
                this.as = az;
                this.ar = ax;
                this.an = au;
            }
        }
        if (n == 32) {
            for (int n2 : jz) {
                if (n2 != this.gp) continue;
                this.jw = System.currentTimeMillis();
                fv.a(40);
                fv.d(4907);
                this.eZ = true;
                break;
            }
        }
        if (n == 27 && !C_Client_mc.w.b) {
            if (cH == 3323 || cH == 3443 || cH == 59835 || cH == 59868 || cH == 25754 || cH == 6575 || cH == 6412) {
                return;
            }
            this.jw = System.currentTimeMillis();
            fv.a(185);
            fv.d(63740);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean bP() {
        if (this.nD == null) {
            return false;
        }
        try {
            int n = this.nD.c();
            if (n == 0) {
                return false;
            }
            if (this.lO == -1) {
                this.nD.a(this.mU.g, 1);
                this.lO = this.mU.g[0] & 0xFF;
                if (this.lJ != null) {
                    this.lO = this.lO - this.lJ.a() & 0xFF;
                }
                this.lN = rs.p_f.C_d.b[this.lO];
                --n;
            }
            if (this.lN == -1) {
                if (n > 0) {
                    this.nD.a(this.mU.g, 1);
                    this.lN = this.mU.g[0] & 0xFF;
                    --n;
                } else {
                    return false;
                }
            }
            if (this.lN == -2) {
                if (n > 1) {
                    this.nD.a(this.mU.g, 2);
                    this.mU.h = 0;
                    this.lN = this.mU.A();
                    n -= 2;
                } else {
                    return false;
                }
            }
            if (n < this.lN) {
                return false;
            }
            if (rs.p_f.C_a.d.booleanValue() && this.lO > 0) {
                jC.add(this.lO);
                if (jC.size() >= 10) {
                    jC.remove(0);
                }
            }
            this.mU.h = 0;
            this.nD.a(this.mU.g, this.lN);
            this.lP = 0;
            this.jR = this.jQ;
            this.jQ = this.jP;
            this.jP = this.lO;
            if (this.lO == 81) {
                if (ii != 0L && (bh = System.currentTimeMillis() - ii - 600L) < 0L) {
                    bh = 0L;
                }
                ii = System.currentTimeMillis();
                if (rs.p_f.C_a.f.booleanValue()) {
                    cx.clear();
                }
                this.b(this.lN, this.mU);
                this.mS = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 176) {
                this.nC = this.mU.O();
                this.nx = this.mU.T();
                this.nf = this.mU.y();
                this.nR = this.mU.Y();
                this.lM = this.mU.A();
                if (this.nR != 0 && cH == -1) {
                    rs.p_v.C_a.d(C_O_uc.a(this.nR));
                    this.bQ();
                    int n2 = 650;
                    if (this.nC != 201 || this.nf == 1) {
                        n2 = 655;
                    }
                    this.kr = "";
                    this.nz = false;
                    for (int i = 0; i < rs.p_n.C_e.H.length; ++i) {
                        if (rs.p_n.C_e.H[i] == null || rs.p_n.C_e.H[i].J != n2) continue;
                        cH = rs.p_n.C_e.H[i].ah;
                        break;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 64) {
                this.oE = this.mU.O();
                this.oF = this.mU.P();
                for (int i = this.oE; i < this.oE + 8; ++i) {
                    for (int j = this.oF; j < this.oF + 8; ++j) {
                        if (this.jH[dw][i][j] == null) continue;
                        this.jH[C_Client_mc.dw][i][j] = null;
                        this.o(i, j);
                    }
                }
                C_N_uc c_N_uc = (C_N_uc)this.nL.b();
                while (c_N_uc != null) {
                    if (c_N_uc.j >= this.oE && c_N_uc.j < this.oE + 8 && c_N_uc.k >= this.oF && c_N_uc.k < this.oF + 8 && c_N_uc.h == dw) {
                        c_N_uc.g = 0;
                    }
                    c_N_uc = (C_N_uc)this.nL.d();
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 185) {
                int n3 = this.mU.U();
                rs.p_n.C_e.H[n3].ae = 3;
                rs.p_n.C_e.H[n3].af = C_Client_mc.eR.aT == null ? (C_Client_mc.eR.aV[0] << 25) + (C_Client_mc.eR.aV[4] << 20) + (C_Client_mc.eR.br[0] << 15) + (C_Client_mc.eR.br[8] << 10) + (C_Client_mc.eR.br[11] << 5) + C_Client_mc.eR.br[1] : (int)(305419896L + C_Client_mc.eR.aT.x);
                this.lO = -1;
                return true;
            }
            if (this.lO == 107) {
                this.fe = false;
                for (int i = 0; i < 5; ++i) {
                    this.dh[i] = false;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 72) {
                int n4 = this.mU.S();
                rs.p_n.C_e c_e = rs.p_n.C_e.H[n4];
                for (int i = 0; i < c_e.az.length; ++i) {
                    c_e.az[i] = -1;
                    c_e.az[i] = 0;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 214) {
                this.jD = this.lN / 8;
                for (int i = 0; i < this.jD; ++i) {
                    this.kP[i] = this.mU.E();
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 166) {
                this.fe = true;
                this.mZ = this.mU.y();
                this.na = this.mU.y();
                this.nb = this.mU.A();
                this.nc = this.mU.y();
                this.nd = this.mU.y();
                if (this.nd >= 100) {
                    cJ = this.mZ * 128 + 64;
                    cL = this.na * 128 + 64;
                    cK = this.c(dw, cL, cJ) - this.nb;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 250) {
                int n5 = this.mU.A();
                rs.p_q.p_a.p_a.C_b.a(this, this.mU, n5);
                this.lO = -1;
                return true;
            }
            if (this.lO == 255) {
                int n6 = this.mU.A();
                long l2 = this.mU.E();
                int n7 = this.mU.A();
                if (n6 > -1) {
                    this.m.a(n6, l2, n7);
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 134) {
                int n8;
                int n9 = this.mU.y();
                int n10 = this.ka[n9];
                int n11 = this.kN[n9];
                int n12 = this.mU.X();
                int n13 = this.mU.y();
                this.ka[n9] = n12;
                this.kN[n9] = n13;
                this.eo[n9] = 1;
                for (n8 = 0; n8 < 98; ++n8) {
                    if (n12 < lU[n8]) continue;
                    this.eo[n9] = n8 + 2;
                }
                this.p.post(new C_SkillLevelChanged_mc(n9, n12, n13, this.eo[n9]));
                n8 = this.eo[n9];
                int n14 = 0;
                for (int i = 0; i < this.eo.length; ++i) {
                    n14 += this.eo[i];
                }
                String string = "XP: " + n12 + "\n";
                if (n8 != 99) {
                    int n15 = lU[n8 - 1];
                    string = string + "Next Lvl: " + n15 + "\n";
                    string = string + "Remainder: " + (n15 - this.ka[n9]) + "\n";
                }
                rs.p_n.C_e.H[((Integer)rs.p_f.C_e.c[n9][1]).intValue() + 1].at = string;
                rs.p_n.C_e.H[50240].at = "Total Level: " + n14;
                if (n11 > 0) {
                    this.o.a(n9, n12 - n10);
                }
                if (n9 == 6 && this.eo[6] != C_ap.c && C_ap.d) {
                    C_ap.c = this.eo[6];
                    C_ap.j();
                }
                fb = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 71) {
                int n16 = this.mU.A();
                int n17 = this.mU.N();
                if (n16 == 65535) {
                    n16 = -1;
                }
                if (n16 == 0) {
                    n16 = 67027;
                }
                if (n17 == 2) {
                    n16 = 44100;
                }
                C_Client_mc.eT[n17] = n16;
                fb = true;
                eM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 74) {
                int n18 = this.mU.S();
                if (n18 == 65535) {
                    n18 = -1;
                }
                if (n18 != this.lh && this.nv && !li && this.oz == 0) {
                    this.oi = n18;
                    this.oj = true;
                    ew.a(2, this.oi);
                }
                this.lh = n18;
                this.lO = -1;
                return true;
            }
            if (this.lO == 121) {
                int n19 = this.mU.U();
                int n20 = this.mU.T();
                if (this.nv && !li) {
                    this.oi = n19;
                    this.oj = false;
                    ew.a(2, this.oi);
                    this.oz = n20;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 109) {
                this.br();
                this.lO = -1;
                return false;
            }
            if (this.lO == 70) {
                int n21 = this.mU.B();
                int n22 = this.mU.V();
                int n23 = this.mU.S();
                rs.p_n.C_e c_e = rs.p_n.C_e.H[n23];
                c_e.aJ = n21;
                c_e.aP = n22;
                this.lO = -1;
                return true;
            }
            if (this.lO == 73 || this.lO == 241) {
                int n2;
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                boolean object2;
                int n112;
                int n34;
                int n35;
                int n36;
                int n37 = this.mx;
                int n38 = this.my;
                if (this.lO == 73) {
                    n37 = this.mU.T();
                    n38 = this.mU.A();
                    this.nA = false;
                }
                if (this.lO == 241) {
                    n38 = this.mU.T();
                    this.mU.J();
                    for (n36 = 0; n36 < 4; ++n36) {
                        for (n35 = 0; n35 < 13; ++n35) {
                            for (n34 = 0; n34 < 13; ++n34) {
                                this.eS[n36][n35][n34] = this.mU.k(1) == 1 ? this.mU.k(26) : -1;
                            }
                        }
                    }
                    this.mU.K();
                    n37 = this.mU.A();
                    this.nA = true;
                } else if (this.mx == n37 && this.my == n38 && ee == 2) {
                    this.lO = -1;
                    return true;
                }
                this.mx = this.bl = n37;
                this.my = this.bm = n38;
                eh = (this.mx - 6) * 8;
                ei = (this.my - 6) * 8;
                n36 = this.mx / 8 * 256 + this.my / 8;
                System.out.println("[Region] Stand in region: " + n36);
                W = n36;
                if (C_Client_mc.ew.g.a(n36)) {
                    ek = (String)C_Client_mc.ew.g.a().b(n36);
                    System.out.println("[Region] Region group: " + ek);
                } else {
                    ek = null;
                }
                boolean bl = this.np = (this.mx / 8 == 48 || this.mx / 8 == 49) && this.my / 8 == 48;
                if (this.mx / 8 == 48 && this.my / 8 == 148) {
                    this.np = true;
                }
                n35 = eh + (eh - 6 >> 7);
                n34 = ei + (ei - 6 >> 7);
                int n39 = n35 >> 6;
                int n40 = n34 >> 6;
                int n41 = n39 * 256 + n40;
                if (C_r.B.size() == 0) {
                    if (rs.p_d.C_h.a != C_h.a.b) {
                        rs.p_d.C_h.a(C_h.a.b);
                        C_t.a(!this.aC ? C_h.a.b : C_h.a.a);
                    }
                    if (C_r.E != C_r.a.b) {
                        C_r.a(C_r.a.b);
                    }
                    for (int n112 : C_r.D) {
                        C_r.B.a(n112, (Object)new C_r(C_r.c(n112)));
                    }
                }
                if (this.aC || n41 == 9023 || n41 == 9022 || n41 == 9024 || n41 == 8767 || n41 == 9279 || c.get(n41) != null || c.get(W) != null) {
                    if (!rs.p_f.C_a.ax) {
                        C_x.h = false;
                        if (this.fr != null && !this.bI) {
                            ee = 1;
                        } else {
                            this.bI = false;
                        }
                    }
                } else if (!rs.p_f.C_a.ax && !C_x.h) {
                    boolean bl2 = C_x.h = !rs.p_f.C_a.ax;
                    if (this.fr != null && !this.bI) {
                        ee = 1;
                    } else {
                        this.bI = false;
                    }
                }
                boolean bl3 = false;
                int n12 = eh + (C_Client_mc.eR.ac - 6 >> 7);
                int n13 = ei + (C_Client_mc.eR.ad - 6 >> 7);
                n112 = n12 >> 6;
                int n14 = n13 >> 6;
                if (ek == null && C_Client_mc.ew.g.g().a_(n41)) {
                    boolean l11 = true;
                }
                if (C_Client_mc.ew.g.g().a_(n36)) {
                    object2 = true;
                }
                if (object2) {
                    if (rs.p_d.C_h.a != C_h.a.c) {
                        rs.p_d.C_h.a(C_h.a.c);
                        C_t.a(C_h.a.c);
                    }
                    if (C_r.E != C_r.a.d) {
                        C_r.a(C_r.a.d);
                    }
                } else {
                    int n15 = n10 = ek == null ? n41 : n36;
                    if (Arrays.asList(this.e).contains(new Integer(n10))) {
                        if (rs.p_d.C_h.a != C_h.a.a) {
                            rs.p_d.C_h.a(C_h.a.a);
                            C_t.a(C_h.a.a);
                        }
                        if (C_r.E != C_r.a.c) {
                            C_r.a(C_r.a.c);
                        }
                    } else if (Arrays.asList(this.d).contains(new Integer(n10))) {
                        if (rs.p_d.C_h.a != C_h.a.b) {
                            rs.p_d.C_h.a(C_h.a.b);
                            C_t.a(C_h.a.b);
                        }
                        if (C_r.E != C_r.a.b) {
                            C_r.a(C_r.a.b);
                        }
                    } else {
                        if (rs.p_d.C_h.a != C_h.a.a) {
                            rs.p_d.C_h.a(C_h.a.a);
                            C_t.a(C_h.a.a);
                        }
                        if (C_r.E != C_r.a.a) {
                            C_r.a(C_r.a.a);
                        }
                    }
                }
                System.out.println("[Regions] Loaded region ID: " + n41 + " (" + C_r.E.name() + ")");
                cw = n41;
                bD = true;
                ee = 1;
                this.jE = System.currentTimeMillis();
                if (this.lO == 73) {
                    int n16;
                    n10 = 0;
                    for (n16 = (this.mx - 6) / 8; n16 <= (this.mx + 6) / 8; ++n16) {
                        for (n9 = (this.my - 6) / 8; n9 <= (this.my + 6) / 8; ++n9) {
                            ++n10;
                        }
                    }
                    this.fr = new byte[n10][];
                    this.fY = new byte[n10][];
                    this.fR = new int[n10];
                    this.fS = new int[n10];
                    this.fT = new int[n10];
                    n10 = 0;
                    for (n16 = (this.mx - 6) / 8; n16 <= (this.mx + 6) / 8; ++n16) {
                        for (n9 = (this.my - 6) / 8; n9 <= (this.my + 6) / 8; ++n9) {
                            n8 = (n16 << 8) + n9;
                            if (C_Client_mc.ew.g.g().a_(n8)) {
                                rs.p_cache.p_osrs.C_c.a(true);
                            }
                            try {
                                this.fR[n10] = (n16 << 8) + n9;
                                if (this.np && (n9 == 49 || n9 == 149 || n9 == 147 || n16 == 50 || n16 == 49 && n9 == 47)) {
                                    this.fS[n10] = -1;
                                    this.fT[n10] = -1;
                                    ++n10;
                                    continue;
                                }
                                if (ek != null && !C_Client_mc.ew.g.a(n8, ek)) {
                                    this.fS[n10] = -1;
                                    this.fT[n10] = -1;
                                    ++n10;
                                    continue;
                                }
                                this.fS[n10] = ew.b(0, n9, n16);
                                n7 = this.fS[n10];
                                if (n7 != -1) {
                                    ew.a(3, n7);
                                }
                                if ((n6 = (this.fT[n10] = ew.b(1, n9, n16))) != -1) {
                                    ew.a(3, n6);
                                }
                                ++n10;
                                continue;
                            }
                            finally {
                                rs.p_cache.p_osrs.C_c.a(false);
                            }
                        }
                    }
                }
                if (this.lO == 241) {
                    n10 = 0;
                    int[] nArray = new int[676];
                    for (n9 = 0; n9 < 4; ++n9) {
                        for (n8 = 0; n8 < 13; ++n8) {
                            for (n7 = 0; n7 < 13; ++n7) {
                                n6 = this.eS[n9][n8][n7];
                                if (n6 == -1) continue;
                                n5 = n6 >> 14 & 0x3FF;
                                n4 = n6 >> 3 & 0x7FF;
                                n3 = (n5 / 8 << 8) + n4 / 8;
                                for (n2 = 0; n2 < n10; ++n2) {
                                    if (nArray[n2] != n3) continue;
                                    n3 = -1;
                                    break;
                                }
                                if (n3 == -1) continue;
                                nArray[n10++] = n3;
                            }
                        }
                    }
                    this.fr = new byte[n10][];
                    this.fY = new byte[n10][];
                    this.fR = new int[n10];
                    this.fS = new int[n10];
                    this.fT = new int[n10];
                    for (n9 = 0; n9 < n10; ++n9) {
                        this.fR[n9] = nArray[n9];
                        n8 = this.fR[n9];
                        n6 = n8 & 0xFF;
                        n7 = n8 >> 8 & 0xFF;
                        this.fS[n9] = ew.b(0, n6, n7);
                        n5 = this.fS[n9];
                        if (n5 != -1) {
                            ew.a(3, n5);
                        }
                        if ((n4 = (this.fT[n9] = ew.b(1, n6, n7))) == -1) continue;
                        ew.a(3, n4);
                    }
                }
                n10 = eh - this.mf;
                int n17 = ei - this.mg;
                this.mf = eh;
                this.mg = ei;
                for (n9 = 0; n9 < 16384; ++n9) {
                    rs.p_a.C_j c_j = this.cA[n9];
                    if (c_j == null) continue;
                    n7 = 0;
                    while (n7 < 10) {
                        int n18 = n7;
                        c_j.k[n18] = c_j.k[n18] - n10;
                        int n19 = n7++;
                        c_j.l[n19] = c_j.l[n19] - n17;
                    }
                    c_j.ac -= n10 * 128;
                    c_j.ad -= n17 * 128;
                }
                for (n9 = 0; n9 < this.kt; ++n9) {
                    rs.p_a.C_k c_k = kw_do[n9];
                    if (c_k == null) continue;
                    n7 = 0;
                    while (n7 < 10) {
                        int n20 = n7;
                        c_k.k[n20] = c_k.k[n20] - n10;
                        int n21 = n7++;
                        c_k.l[n21] = c_k.l[n21] - n17;
                    }
                    c_k.ac -= n10 * 128;
                    c_k.ad -= n17 * 128;
                }
                this.mS = true;
                n9 = 0;
                int n22 = 104;
                n7 = 1;
                if (n10 < 0) {
                    n9 = 103;
                    n22 = -1;
                    n7 = -1;
                }
                n6 = 0;
                n5 = 104;
                n4 = 1;
                if (n17 < 0) {
                    n6 = 103;
                    n5 = -1;
                    n4 = -1;
                }
                for (n3 = n9; n3 != n22; n3 += n7) {
                    for (n2 = n6; n2 != n5; n2 += n4) {
                        int n23 = n3 + n10;
                        int n24 = n2 + n17;
                        for (int i = 0; i < 4; ++i) {
                            this.jH[i][n3][n2] = n23 >= 0 && n24 >= 0 && n23 < 104 && n24 < 104 ? this.jH[i][n23][n24] : null;
                        }
                    }
                }
                C_N_uc c_N_uc = (C_N_uc)this.nL.b();
                while (c_N_uc != null) {
                    c_N_uc.j -= n10;
                    c_N_uc.k -= n17;
                    if (c_N_uc.j < 0 || c_N_uc.k < 0 || c_N_uc.j >= 104 || c_N_uc.k >= 104) {
                        c_N_uc.b();
                    }
                    c_N_uc = (C_N_uc)this.nL.d();
                }
                if (this.gd != 0) {
                    this.gd -= n10;
                    this.ge -= n17;
                }
                this.fe = false;
                this.lO = -1;
                rs.p_d.C_s.a(this);
                return true;
            }
            if (this.lO == 208) {
                int n55 = this.mU.V();
                this.x.k(n55 == 197 && !this.x.M());
                if (n55 >= 0) {
                    this.C(n55);
                }
                ed = n55;
                this.lO = -1;
                return true;
            }
            if (this.lO == 99) {
                this.lV = this.mU.y();
                this.lO = -1;
                return true;
            }
            if (this.lO == 75) {
                int n56 = this.mU.U();
                int n57 = this.mU.U();
                if (rs.p_n.C_e.H[n57].ae != 10) {
                    rs.p_n.C_e.H[n57].ae = 2;
                }
                rs.p_n.C_e.H[n57].af = n56;
                if (rs.p_n.C_e.H[n57].ae == 10) {
                    rs.p_d.C_d c_d = rs.p_d.C_d.c(rs.p_n.C_e.H[n57].af);
                    if (rs.p_n.C_e.H[n57].aY) {
                        rs.p_n.C_e.H[n57].aW = c_d.I;
                        rs.p_n.C_e.H[n57].aX = c_d.E;
                    } else {
                        rs.p_n.C_e.H[n57].aT = c_d.r == 1 ? 1500 : c_d.r * 500;
                    }
                    if (c_d.o.equalsIgnoreCase("Greater demon") || c_d.o.equalsIgnoreCase("Black demon") || c_d.o.equalsIgnoreCase("Lesser demon")) {
                        rs.p_n.C_e.H[n57].aT = 2750;
                    }
                    if (c_d.o.equalsIgnoreCase("Abyssal sire") || c_d.o.equalsIgnoreCase("Kraken")) {
                        rs.p_n.C_e.H[n57].aT = 3500;
                    }
                    if (c_d.o.equalsIgnoreCase("Jungle demon")) {
                        rs.p_n.C_e.H[n57].aT = 2900;
                    }
                    if (c_d.o.equalsIgnoreCase("Infernal imp")) {
                        rs.p_n.C_e.H[n57].aT = 800;
                    }
                    if (c_d.o.equalsIgnoreCase("Chaos giant")) {
                        rs.p_n.C_e.H[n57].aT = 1900;
                    }
                    if (c_d.o.equalsIgnoreCase("Tormented demon")) {
                        rs.p_n.C_e.H[n57].aT = 2900;
                    }
                    if (c_d.o.equalsIgnoreCase("Dark araxyte")) {
                        rs.p_n.C_e.H[n57].aT = 4000;
                    }
                    if (c_d.o.equalsIgnoreCase("Yama")) {
                        rs.p_n.C_e.H[n57].aT = 3500;
                    }
                    if (c_d.x == 7572L) {
                        rs.p_n.C_e.H[n57].aT = 1400;
                    }
                    if (c_d.x == 315L) {
                        rs.p_n.C_e.H[n57].aT = 1400;
                    }
                    if (c_d.x == 3555L) {
                        rs.p_n.C_e.H[n57].aT = 2300;
                    }
                    if (c_d.o.equalsIgnoreCase("Zulrah")) {
                        rs.p_n.C_e.H[n57].aT = 3400;
                    }
                    if (c_d.o.equalsIgnoreCase("The Maiden of Sugadinti")) {
                        rs.p_n.C_e.H[n57].aT = 4000;
                    }
                    if (c_d.o.equalsIgnoreCase("Blood hydra")) {
                        rs.p_n.C_e.H[n57].aT = 5000;
                    }
                    if (c_d.o.equalsIgnoreCase("Basilisk knight")) {
                        rs.p_n.C_e.H[n57].aT = 2750;
                    }
                    if (c_d.o.equalsIgnoreCase("Blood reaver")) {
                        rs.p_n.C_e.H[n57].aT = 2250;
                    }
                    if (c_d.o.equalsIgnoreCase("Skotizo")) {
                        rs.p_n.C_e.H[n57].aT = 5000;
                    }
                    if (c_d.o.equalsIgnoreCase("Chaos elemental")) {
                        rs.p_n.C_e.H[n57].aT = 2750;
                    }
                    if (c_d.o.equalsIgnoreCase("Corporeal beast") || c_d.o.equalsIgnoreCase("Mystical corp beast")) {
                        rs.p_n.C_e.H[n57].aT = 4000;
                    }
                    if (c_d.o.equalsIgnoreCase("Tekton") || c_d.o.equalsIgnoreCase("Mystical tekton")) {
                        rs.p_n.C_e.H[n57].aT = 4000;
                    }
                    if (c_d.o.equalsIgnoreCase("Barrelchest")) {
                        rs.p_n.C_e.H[n57].aT = 2150;
                    }
                    if (c_d.o.equalsIgnoreCase("Demonic gorilla")) {
                        rs.p_n.C_e.H[n57].aT = 2750;
                    }
                    if (c_d.o.equalsIgnoreCase("Revenant ork")) {
                        rs.p_n.C_e.H[n57].aT = 1750;
                    }
                    if (c_d.o.equalsIgnoreCase("Abyssal demon")) {
                        rs.p_n.C_e.H[n57].aT = 1850;
                    }
                    if (c_d.o.equalsIgnoreCase("Undead pker")) {
                        rs.p_n.C_e.H[n57].aT = 1400;
                    }
                    if (c_d.o.equalsIgnoreCase("Vet'ion")) {
                        rs.p_n.C_e.H[n57].aT = 2100;
                    }
                    if (c_d.o.equalsIgnoreCase("Goblin fish")) {
                        rs.p_n.C_e.H[n57].aT = 500;
                    }
                    rs.p_n.C_e.H[n57].ar = 0;
                    rs.p_n.C_e.H[n57].F = 0;
                    rs.p_n.C_e.H[n57].aD = c_d.w;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 114) {
                this.eN = System.currentTimeMillis() + (long)(1000 * this.mU.S());
                this.eO = 1;
                this.lO = -1;
                return true;
            }
            if (this.lO == 60) {
                this.oF = this.mU.y();
                this.oE = this.mU.O();
                while (this.mU.h < this.lN) {
                    int n58 = this.mU.y();
                    this.c(this.mU, n58);
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 35) {
                int n59 = this.mU.y();
                int n60 = this.mU.y();
                int n61 = this.mU.y();
                int n62 = this.mU.y();
                this.dh[n59] = true;
                this.dg[n59] = n60;
                this.fy[n59] = n61;
                this.dy[n59] = n62;
                this.eg[n59] = 0;
                this.lO = -1;
                return true;
            }
            if (this.lO == 174) {
                int n63 = this.mU.A();
                int n64 = this.mU.A();
                int n65 = this.mU.A();
                if (this.jT && this.ms < 50) {
                    this.nY[this.ms] = n63;
                    this.oo[this.ms] = 0;
                    this.os[this.ms] = 0 + n64 + rs.p_w.C_e.a[n63];
                    this.ot[this.ms] = n65;
                    ++this.ms;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 104) {
                int n66 = this.mU.O();
                int n67 = this.mU.N();
                String string = this.mU.F();
                if (n66 >= 1 && n66 <= 5) {
                    if (string.equalsIgnoreCase("null")) {
                        string = null;
                    }
                    this.nh[n66 - 1] = string;
                    this.ni[n66 - 1] = n67 == 0;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 78) {
                this.gd = 0;
                this.lO = -1;
                return true;
            }
            if (this.lO == 253) {
                String string = this.mU.F();
                if (string.endsWith(":tradereq:")) {
                    String string2 = string.substring(0, string.indexOf(":"));
                    long l3 = C_O_uc.a(string2);
                    boolean bl = false;
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l3) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to trade with you.", 4, string2);
                    }
                } else if (string.endsWith(":duelreq:")) {
                    String string3 = string.substring(0, string.indexOf(":"));
                    long l4 = C_O_uc.a(string3);
                    boolean bl = false;
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l4) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to duel with you.", 8, string3);
                    }
                } else if (string.endsWith(":cwarreq:")) {
                    String string4 = string.substring(0, string.indexOf(":"));
                    long l5 = C_O_uc.a(string4);
                    boolean bl = false;
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l5) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to challenge your clan to a Clan War.", 8, string4);
                    }
                } else if (string.endsWith(":whipddsreq:")) {
                    String string5 = string.substring(0, string.indexOf(":"));
                    long l6 = C_O_uc.a(string5);
                    boolean bl = false;
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l6) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to whip + dds duel with you.", 8, string5);
                    }
                } else if (string.endsWith(":whipduelreq:")) {
                    String string6 = string.substring(0, string.indexOf(":"));
                    long l7 = C_O_uc.a(string6);
                    boolean bl = false;
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l7) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to whip duel with you.", 8, string6);
                    }
                } else if (string.endsWith(":gambreq:")) {
                    String string7 = string.substring(0, string.indexOf(":"));
                    long l8 = C_O_uc.a(string7);
                    boolean bl = false;
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l8) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        this.a("wishes to gamble with you.", 8, string7);
                    }
                } else if (string.endsWith(":chalreq:")) {
                    String string8 = string.substring(0, string.indexOf(":"));
                    long l9 = C_O_uc.a(string8);
                    boolean bl = false;
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l9) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.ou == 0) {
                        String string9 = string.substring(string.indexOf(":") + 1, string.length() - 9);
                        this.a(string9, 8, string8);
                    }
                } else {
                    if (string.startsWith("<img=1><shad=FFFF3F><col=FE610C>[News]:")) {
                        // empty if block
                    }
                    this.a(string, 0, "");
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 1) {
                int n68;
                for (n68 = 0; n68 < kw_do.length; ++n68) {
                    if (kw_do[n68] == null) continue;
                    C_Client_mc.kw_do[n68].F = -1;
                }
                for (n68 = 0; n68 < this.cA.length; ++n68) {
                    if (this.cA[n68] == null) continue;
                    this.cA[n68].F = -1;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 50) {
                int n69;
                int n70;
                long l10 = this.mU.E();
                int n71 = this.mU.y();
                String string = C_O_uc.c(C_O_uc.a(l10));
                for (n70 = 0; n70 < this.kA; ++n70) {
                    if (l10 != this.lg[n70]) continue;
                    if (this.jG[n70] != n71) {
                        n69 = this.jG[n70];
                        this.jG[n70] = n71;
                        fb = true;
                        if (n71 > 0 && n69 == 0) {
                            this.a(string + " has logged in.", 5, "");
                        }
                        if (n71 == 0) {
                            this.a(string + " has logged out.", 5, "");
                        }
                    }
                    string = null;
                    break;
                }
                if (string != null && this.kA < 350) {
                    this.lg[this.kA] = l10;
                    this.mT[this.kA] = string;
                    this.jG[this.kA] = n71;
                    ++this.kA;
                    fb = true;
                }
                n70 = 0;
                while (n70 == 0) {
                    n70 = 1;
                    for (n69 = 0; n69 < this.kA - 1; ++n69) {
                        if ((this.jG[n69] == dK || this.jG[n69 + 1] != dK) && (this.jG[n69] != 0 || this.jG[n69 + 1] == 0)) continue;
                        int n72 = this.jG[n69];
                        this.jG[n69] = this.jG[n69 + 1];
                        this.jG[n69 + 1] = n72;
                        String string10 = this.mT[n69];
                        this.mT[n69] = this.mT[n69 + 1];
                        this.mT[n69 + 1] = string10;
                        long l2 = this.lg[n69];
                        this.lg[n69] = this.lg[n69 + 1];
                        this.lg[n69 + 1] = l2;
                        fb = true;
                        n70 = 0;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 110) {
                if (fL == 12) {
                    fb = true;
                }
                this.eY = this.mU.y();
                this.lO = -1;
                return true;
            }
            if (this.lO == 254) {
                this.jZ = this.mU.y();
                if (this.jZ == 1) {
                    this.of = this.mU.A();
                }
                if (this.jZ >= 2 && this.jZ <= 6) {
                    if (this.jZ == 2) {
                        this.kZ = 64;
                        this.la = 64;
                    }
                    if (this.jZ == 3) {
                        this.kZ = 0;
                        this.la = 64;
                    }
                    if (this.jZ == 4) {
                        this.kZ = 128;
                        this.la = 64;
                    }
                    if (this.jZ == 5) {
                        this.kZ = 64;
                        this.la = 0;
                    }
                    if (this.jZ == 6) {
                        this.kZ = 64;
                        this.la = 128;
                    }
                    this.jZ = 2;
                    this.kW = this.mU.A();
                    this.kX = this.mU.A();
                    this.kY = this.mU.y();
                }
                if (this.jZ == 10) {
                    this.kV = this.mU.A();
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 248) {
                int n73 = this.mU.T();
                int n74 = this.mU.A();
                if (this.gp != -1) {
                    this.gp = -1;
                    fM = true;
                }
                if (this.fN != 0 && cH != 3323) {
                    this.fN = 0;
                    fM = true;
                }
                cH = n73;
                this.fu = n74;
                fb = true;
                eM = true;
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 79) {
                int n75 = this.mU.S();
                int n76 = this.mU.T();
                rs.p_n.C_e c_e = rs.p_n.C_e.H[n75];
                if (c_e != null && c_e.aI == 0) {
                    if (n76 < 0) {
                        n76 = 0;
                    }
                    if (n76 > c_e.aH - c_e.aR) {
                        n76 = c_e.aH - c_e.aR;
                    }
                    c_e.V = n76;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 68) {
                for (int i = 0; i < this.dP.length; ++i) {
                    if (this.dP[i] == this.mj[i]) continue;
                    this.dP[i] = this.mj[i];
                    this.B(i);
                    fb = true;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 196) {
                long l12 = this.mU.E();
                int n77 = this.mU.D();
                int n78 = this.mU.D();
                boolean bl = false;
                if (!rs.p_l.C_j.a(n78)) {
                    for (int i = 0; i < this.jD; ++i) {
                        if (this.kP[i] != l12) continue;
                        bl = true;
                    }
                }
                if (!bl && this.ou == 0) {
                    try {
                        String[] stringArray;
                        this.on[this.nE] = n77;
                        this.nE = (this.nE + 1) % 100;
                        String string = this.mU.F();
                        String string11 = C_O_uc.c(C_O_uc.a(l12));
                        if (string.contains("<N>") && (stringArray = string.split("<N>")).length == 2) {
                            string11 = stringArray[0];
                            string = stringArray[1];
                        }
                        if (n78 != 3) {
                            string = rs.p_d.C_c.b(string);
                        }
                        if (n78 > 0) {
                            this.a(string, 7, "@cr" + n78 + "@" + string11);
                        } else {
                            this.a(string, 3, string11);
                        }
                    }
                    catch (Exception exception) {
                        rs.p_v.C_a.e("cde1");
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 85) {
                this.oF = this.mU.O();
                this.oE = this.mU.O();
                this.lO = -1;
                return true;
            }
            if (this.lO == 24) {
                this.er = this.mU.P();
                if (this.er == fL) {
                    fL = this.er == 3 ? 1 : 3;
                    fb = true;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 246) {
                int n79 = this.mU.S();
                int n80 = this.mU.A();
                int n81 = this.mU.A();
                if (n81 == 65535) {
                    rs.p_n.C_e.H[n79].ae = 0;
                    this.lO = -1;
                    return true;
                }
                rs.p_d.C_k c_k = rs.p_d.C_k.f(n81);
                rs.p_n.C_e.H[n79].ae = 4;
                rs.p_n.C_e.H[n79].af = n81;
                rs.p_n.C_e.H[n79].aU = c_k.M;
                rs.p_n.C_e.H[n79].aV = c_k.Z;
                rs.p_n.C_e.H[n79].aT = c_k.G * 100 / n80;
                this.lO = -1;
                return true;
            }
            if (this.lO == 171) {
                boolean bl = this.mU.y() == 1;
                int n82 = this.mU.A();
                rs.p_n.C_e.H[n82].aQ = bl;
                this.lO = -1;
                return true;
            }
            if (this.lO == 142) {
                int n83 = this.mU.S();
                if (n83 != 0) {
                    this.C(n83);
                }
                if (this.gp != -1) {
                    this.gp = -1;
                    fM = true;
                }
                if (this.fN != 0 && this.fN != 25) {
                    this.fN = 0;
                    fM = true;
                }
                this.fu = n83 == 0 ? -1 : n83;
                fb = true;
                eM = true;
                if (n83 != 26700 && n83 != 2005) {
                    rs.p_n.C_d.b();
                    rs.p_n.p_a.p_a.C_c.b();
                }
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 126) {
                int n84;
                String[] stringArray;
                String[] stringArray2;
                int n85;
                String[] stringArray3;
                Object object;
                String string = this.mU.F();
                int n86 = this.mU.T();
                this.lO = -1;
                for (rs.p_n.C_c c_c : rs.p_n.C_d.a) {
                    c_c.a(n86, string);
                }
                if (n86 == 0) {
                    if (string.startsWith("www.") || string.startsWith("http://") || string.startsWith("https://")) {
                        C_Client_mc.f(string);
                        this.lO = -1;
                        return true;
                    }
                    if (string.startsWith(":quicks:")) {
                        this.jn = string.substring(8).equalsIgnoreCase("on");
                    }
                    if (string.startsWith(":quickdisable:")) {
                        this.cp = false;
                        this.v.c();
                    }
                }
                if (n86 >= 47709 && n86 <= 47808) {
                    if (string.startsWith("{L}")) {
                        C_ab.a(string.replace("{L}", ""), true);
                    } else if (string.startsWith("{I}")) {
                        C_ab.b(string.replace("{I}", ""));
                    } else {
                        C_ab.a(string, false);
                    }
                    this.lO = -1;
                    return true;
                }
                if (n86 >= 47505 && n86 <= 47704) {
                    if (string.startsWith("{T}")) {
                        C_ab.a(string.replace("{T}", ""), true, false);
                    } else if (string.startsWith("{S}")) {
                        C_ab.a(string.replace("{S}", ""), true, true);
                    } else {
                        C_ab.a(string, false, false);
                    }
                    this.lO = -1;
                    return true;
                }
                if (n86 >= 46608 && n86 <= 46758) {
                    if (string.startsWith("{L}")) {
                        C_ba.b(string.replace("{L}", ""), true);
                    } else if (string.startsWith("{I}")) {
                        C_ba.b(string.replace("{I}", ""));
                    } else {
                        C_ba.b(string, false);
                    }
                    this.lO = -1;
                    return true;
                }
                if (n86 >= 46506 && n86 <= 46606) {
                    if (string.startsWith("{T}")) {
                        C_ba.a(string.replace("{T}", ""), true);
                    } else {
                        C_ba.a(string, false);
                    }
                    this.lO = -1;
                    return true;
                }
                if (n86 >= 18144 && n86 <= 18244) {
                    object = string;
                    if (object.contains(">")) {
                        object = object.split("> ")[1];
                    }
                    this.ju[n86 - 18144] = object;
                }
                if (n86 >= 25800 && n86 <= 25999) {
                    object = string;
                    if (object.contains(">")) {
                        object = object.split("> ")[1];
                    }
                    this.ju[n86 - 25800 + 100] = object;
                }
                if (n86 == 55004) {
                    if (string.equalsIgnoreCase("Track")) {
                        rs.p_n.C_e.H[18551].am[32] = 330;
                        rs.p_n.C_e.H[18551].am[48] = 309;
                    } else {
                        rs.p_n.C_e.H[18551].am[32] = 324;
                        rs.p_n.C_e.H[18551].am[48] = 303;
                    }
                }
                if (n86 == 1) {
                    int n87;
                    if (string.equalsIgnoreCase("CLEAR_CLICK_TEXT_INT")) {
                        for (int i = 51320; i < 51920; ++i) {
                            rs.p_n.C_e.H[i].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("TOGGLE_DZONE_HIDE")) {
                        rs.p_f.C_a.aU = !rs.p_f.C_a.aU;
                        this.a("<img=163> Hiding other player's dzone bosses has been toggled: " + (rs.p_f.C_a.aU ? "@blu@ON" : "@red@OFF"), 0, "");
                    }
                    if (string.equalsIgnoreCase("RIMMINGTON") || string.equalsIgnoreCase("TAVERLY") || string.equalsIgnoreCase("POLLNIVERNEACH") || string.equalsIgnoreCase("RELLEKA") || string.equalsIgnoreCase("FALADOR") || string.equalsIgnoreCase("ARDOUGNE")) {
                        rs.p_f.C_a.af = string;
                    }
                    if (string.equalsIgnoreCase("CLEAR_ENCHANTMENT_CHEST")) {
                        rs.p_n.C_e.H[50244].V = 0;
                        rs.p_n.C_e.H[50249].at = "Success chance: @gre@N/A";
                        rs.p_n.C_e.H[49996].at = "N/A";
                        rs.p_n.C_e.H[50245].at = "N/A";
                    }
                    if (string.startsWith("WHIP_DDS")) {
                        this.cG = 1;
                    }
                    if (string.startsWith("RESET_FULL_TEXT_INTERFACE")) {
                        for (int i = 51203; i < 51303; ++i) {
                            rs.p_n.C_e.H[i].at = "";
                        }
                    }
                    if (string.startsWith("RESET_FULL_TEXT_SCROLL")) {
                        for (int i = 51203; i < 51303; ++i) {
                            rs.p_n.C_e.H[i].at = "";
                        }
                        rs.p_n.C_e.H[51202].V = 0;
                    }
                    if (string.startsWith("WHIP_ONLY")) {
                        this.cG = 2;
                    }
                    if (string.startsWith("RESET_DUEL_TYPE")) {
                        this.cG = 0;
                    }
                    if (string.startsWith("LMS_LOBBY_OVERLAY_ON")) {
                        this.aE = true;
                    }
                    if (string.startsWith("LMS_LOBBY_OVERLAY_OFF")) {
                        this.aE = false;
                    }
                    if (string.startsWith("HG_LOBBY_OVERLAY_ON")) {
                        this.aJ = true;
                    }
                    if (string.startsWith("HG_LOBBY_OVERLAY_OFF")) {
                        this.aJ = false;
                    }
                    if (string.startsWith("TOGGLE_EXTENDED_ZOOM")) {
                        rs.p_f.C_a.aO = !rs.p_f.C_a.aO;
                        rs.p_f.C_a.d();
                        C_V_uc.a(rs.p_f.C_a.aO);
                    }
                    if (string.equalsIgnoreCase("FORCE_LOAD_ON")) {
                        this.iK = true;
                    }
                    if (string.startsWith("SPEC_RESTORE_TICK")) {
                        this.v.j = System.currentTimeMillis();
                    }
                    if (string.startsWith("HEALTH_RESTORE_TICK")) {
                        this.v.k = System.currentTimeMillis();
                    }
                    if (string.startsWith("COMP_CAPE_RESET_COLORS")) {
                        C_w.bJ[4] = C_Client_mc.eR.aD;
                        C_w.bJ[0] = C_Client_mc.eR.aE;
                        C_w.bJ[2] = C_Client_mc.eR.aF;
                        C_w.bJ[1] = C_Client_mc.eR.aG;
                        C_w.bJ[3] = C_Client_mc.eR.aH;
                        C_w.bJ[5] = C_Client_mc.eR.aI;
                    }
                    if (string.startsWith("ITEM_GUIDE_RESET_PREVIEW")) {
                        C_ab.l();
                    }
                    if (string.startsWith("ITEM_GUIDE_REFRESH_PREVIEW")) {
                        C_ab.m();
                    }
                    if (string.startsWith("ITEM_GUIDE_SELECTED_")) {
                        C_ab.c(string);
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_RESET_CATEGORY_ATTRIBUTES")) {
                        C_ab.h();
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_FLUSH_CATEGORIES")) {
                        C_ab.j();
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_FLUSH_DESCRIPTION")) {
                        C_ab.i();
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_RESET_DESCRIPTION_ATTRIBUTES")) {
                        C_ab.k();
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_SET_ITEM_SPRITE")) {
                        rs.p_n.C_e.H[47708].am[3] = -5000;
                        rs.p_n.C_e.H[47708].am[4] = -5000;
                        rs.p_n.C_e.h(47706, "wiki/item 0");
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_SET_REVERSE_ROTATION")) {
                        C_ab.bM = true;
                    }
                    if (string.equalsIgnoreCase("ITEM_GUIDE_RESET_CAT_SCROLL")) {
                        rs.p_n.C_e.H[47504].V = 0;
                    }
                    if (string.startsWith("ITEM_GUIDE_BONUS_WIDGET")) {
                        if (string.split(" ")[1].equalsIgnoreCase("ON")) {
                            C_ab.a(true);
                        } else {
                            C_ab.a(false);
                        }
                    }
                    if (string.startsWith("CLEAR_SYSTEM_UPDATE")) {
                        this.eN = 0L;
                        this.eO = 0;
                    }
                    if (string.startsWith("WARN_UPDATE")) {
                        int n88 = Integer.parseInt(string.split(" ")[1]);
                        if (this.eO != 1) {
                            this.eN = System.currentTimeMillis() + (long)(1000 * n88);
                            this.eO = 2;
                        }
                    }
                    if (string.equalsIgnoreCase("cleardialog")) {
                        this.gb = false;
                        this.fN = 0;
                        fM = true;
                    }
                    if (string.startsWith("WIKI_SELECTED_")) {
                        C_ba.c(string);
                    }
                    if (string.equalsIgnoreCase("WIKI_RESET_CATEGORY_ATTRIBUTES")) {
                        C_ba.h();
                    }
                    if (string.equalsIgnoreCase("WIKI_FLUSH_CATEGORIES")) {
                        C_ba.j();
                    }
                    if (string.equalsIgnoreCase("WIKI_RESET_DESCRIPTION_ATTRIBUTES")) {
                        C_ba.i();
                    }
                    if (string.equalsIgnoreCase("WIKI_FLUSH_DESCRIPTION")) {
                        C_ba.k();
                    }
                    if (string.equalsIgnoreCase("RESET_HOVER_EQUIPMENT")) {
                        this.jp.clear();
                    }
                    if (string.equalsIgnoreCase("ENABLE_MONEY_HOVER") || string.equalsIgnoreCase("ENABLE_OVERLAY_BAR")) {
                        this.ae = true;
                    }
                    if (string.equalsIgnoreCase("DISABLE_MONEY_HOVER") || string.equalsIgnoreCase("DISABLE_OVERLAY_BAR")) {
                        this.ae = false;
                    }
                    if (string.equalsIgnoreCase("ENABLE_CLAN_WARS_OVERLAY")) {
                        this.K = true;
                    }
                    if (string.equalsIgnoreCase("DISABLE_CLAN_WARS_OVERLAY")) {
                        this.K = false;
                        this.O = 0L;
                    }
                    if (string.equalsIgnoreCase("CLEAR_RIGHT_LEADERBOARD_PANEL")) {
                        for (int i = 0; i < 25; ++i) {
                            rs.p_n.C_e.H[61052 + i].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("CLEAR_LEFT_LEADERBOARD_PANEL")) {
                        for (int i = 0; i < 25; ++i) {
                            rs.p_n.C_e.H[61025 + i].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("QUICK_PRAYERS_ON")) {
                        this.cp = true;
                        this.v.c();
                    }
                    if (string.equalsIgnoreCase("QUICK_PRAYERS_OFF")) {
                        this.cp = false;
                        this.v.c();
                    }
                    if (string.equalsIgnoreCase("CLEAR_VERZIK_REGION_OFF")) {
                        this.aB = false;
                    }
                    if (string.equalsIgnoreCase("CLEAR_VERZIK_REGION_ON")) {
                        this.aB = true;
                    }
                    if (string.equalsIgnoreCase("CONSTRUCTION_BUILD_OFF")) {
                        rs.p_f.C_a.ae = false;
                    }
                    if (string.equalsIgnoreCase("CONSTRUCTION_BUILD_ON")) {
                        rs.p_f.C_a.ae = true;
                    }
                    if (string.equalsIgnoreCase("PROMPT_ENTER_DESCRIPTION")) {
                        this.ev = 0;
                        fM = true;
                        this.fN = 31;
                        this.gb = true;
                        this.fB = "";
                        this.eQ = "Enter description";
                    }
                    if (string.startsWith("PROMPT_DESC,,")) {
                        this.ev = 0;
                        fM = true;
                        this.fN = 31;
                        this.gb = true;
                        this.fB = "";
                        this.eQ = string.split(",,")[1];
                    }
                    if (string.equalsIgnoreCase("PROMPT_ENTER_YELL_TAG")) {
                        this.ev = 0;
                        fM = true;
                        this.fN = 32;
                        this.gb = true;
                        this.fB = "";
                        this.eQ = "Enter yell tag";
                    }
                    if (string.equalsIgnoreCase("PROMPT_ENTER_TITLE")) {
                        this.ev = 0;
                        fM = true;
                        this.fN = 33;
                        this.gb = true;
                        this.fB = "";
                        this.eQ = "Enter title";
                    }
                    if (string.equalsIgnoreCase("BEGIN_TUTORIAL")) {
                        this.cY = 2;
                    }
                    if (string.equalsIgnoreCase("BEGIN_ADVENTURE")) {
                        this.cY = 5;
                    }
                    if (string.equalsIgnoreCase("BEGIN_ADVENTURE_ORB")) {
                        this.cY = 6;
                    }
                    if (string.equalsIgnoreCase("BEGIN_ADVENTURE_BOOK")) {
                        this.cY = 7;
                    }
                    if (string.equalsIgnoreCase("END_ADVENTURE")) {
                        this.cY = 0;
                    }
                    if (string.equalsIgnoreCase("SUMMER_2020_ON")) {
                        this.aD = true;
                    }
                    if (string.equalsIgnoreCase("SUMMER_2020_OFF")) {
                        this.aD = false;
                    }
                    if (string.equalsIgnoreCase("RAID_INSTANCE_ON")) {
                        this.aC = true;
                    }
                    if (string.equalsIgnoreCase("RAID_INSTANCE_OFF")) {
                        if (this.aC && !rs.p_f.C_a.ax) {
                            C_x.h = true;
                            if (this.fr != null && !this.bI) {
                                ee = 1;
                            } else {
                                this.bI = false;
                            }
                        }
                        this.aC = false;
                    }
                    if (string.equalsIgnoreCase("CLEAR_DROP_SEARCH")) {
                        rs.p_n.C_e.H[47010].V = 0;
                        for (int i = 47011; i <= 47110; ++i) {
                            rs.p_n.C_e.H[i].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("CLEAR_DROP_INTERFACE")) {
                        int n89 = 47115;
                        rs.p_n.C_e.H[47114].V = 0;
                        for (int i = 0; i < 43; ++i) {
                            int n25 = ++n89;
                            rs.p_n.C_e.H[n25].af = -1;
                            int n26 = ++n89;
                            rs.p_n.C_e.H[n26].at = "";
                            int n27 = ++n89;
                            rs.p_n.C_e.H[n27].at = "";
                            int n28 = ++n89;
                            ++n89;
                            rs.p_n.C_e.H[n28].at = "";
                        }
                    }
                    if (string.equalsIgnoreCase("CLEAR_ACHIEVEMENT_TAB")) {
                        rs.p_n.p_c.C_b.d.clear();
                    }
                    if (string.equalsIgnoreCase("BUILD_ACHIEVEMENT_TAB")) {
                        rs.p_n.p_c.C_b.h();
                    }
                    if (string.startsWith("clearcc")) {
                        String[] stringArray4 = string.split(" ");
                        int n94 = Integer.parseInt(stringArray4[1]);
                        if (n94 < 18144) {
                            n94 = 18144;
                        }
                        if (n94 <= 18224) {
                            for (n87 = n94; n87 <= 18244; ++n87) {
                                rs.p_n.C_e.H[n87].at = "";
                                this.ju[n87 - 18144] = null;
                            }
                            for (n87 = 25800; n87 <= 25998; ++n87) {
                                rs.p_n.C_e.H[n87].at = "";
                                this.ju[n87 - 25800 + 100] = null;
                            }
                        }
                        if (n94 >= 25800) {
                            for (n87 = n94; n87 <= 25998; ++n87) {
                                rs.p_n.C_e.H[n87].at = "";
                                this.ju[n87 - 25800 + 100] = null;
                            }
                        }
                    }
                    if (string.equalsIgnoreCase("togglebh")) {
                        rs.p_f.C_a.au = !rs.p_f.C_a.au;
                        rs.p_f.C_a.d();
                        this.a("<img=8> Bounty streak streak display is now: " + (rs.p_f.C_a.au ? "@blu@ENABLED" : "@red@DISABLED"), 0, "");
                    }
                    if (string.equalsIgnoreCase("clear_exchange")) {
                        C_ae.c.clear();
                    }
                    if (string.startsWith("add_exchange")) {
                        String string12 = string.split(" ")[1];
                        String[] stringArray5 = string12.split(",");
                        n87 = Integer.valueOf(stringArray5[0]);
                        int n95 = Integer.valueOf(stringArray5[1]);
                        C_ae.c.add(new Integer[]{n87, n95});
                    }
                    if (string.equalsIgnoreCase("update_exchange")) {
                        C_ae.h();
                    }
                    if (string.equalsIgnoreCase("clearsellmarket")) {
                        C_au.h();
                    }
                    if (string.startsWith("LOGIN_REWARD_IDX")) {
                        String[] stringArray6 = string.split(" ");
                        this.P = Integer.parseInt(stringArray6[1]);
                    }
                    if (string.equalsIgnoreCase("clearinvoverlay") && this.gp != -1) {
                        this.gp = -1;
                        fM = true;
                    }
                    if (string.equalsIgnoreCase("RESET_BLOOD_POOL_SHOP_SLOTS")) {
                        this.ad.clear();
                    }
                    if (string.equalsIgnoreCase("RESET_BLOOD_TREE_SCROLL")) {
                        rs.p_n.C_e.H[65600].V = rs.p_n.C_e.H[65600].aH;
                    }
                    if (string.equalsIgnoreCase("clearbuymarket")) {
                        C_at.h();
                        rs.p_n.C_e.H[65803].V = 0;
                    }
                    if (string.startsWith("setsellitem")) {
                        String[] stringArray7 = string.split(",");
                        int n96 = Integer.parseInt(stringArray7[1]);
                        rs.p_n.C_e.c(25342, n96, 32);
                    }
                    if (string.startsWith("DISABLE_QUICK_PRAYERS")) {
                        this.cp = false;
                        this.v.c();
                    }
                    return true;
                }
                if (n86 == 2) {
                    this.x.G = string.equals("null") ? null : string;
                    return true;
                }
                if (n86 == 3) {
                    this.x.H = string.equals("null") ? null : string;
                    return true;
                }
                if (n86 == 4) {
                    this.x.I = string.equals("null") ? null : string;
                    return true;
                }
                if (n86 == 5) {
                    this.x.N = Integer.parseInt(string);
                    return true;
                }
                if (n86 == 6) {
                    this.x.O = Integer.parseInt(string);
                    return true;
                }
                if (n86 == 7) {
                    this.x.P = Integer.parseInt(string);
                    return true;
                }
                if (n86 == 8) {
                    this.x.Q = Integer.parseInt(string);
                    return true;
                }
                if (n86 == 9) {
                    object = string.split(",");
                    this.x.M = Integer.parseInt(object[0]);
                    int n97 = Integer.parseInt(object[1]);
                    this.x.y = n97 > 0 ? this.J[n97 - 1] : null;
                    return true;
                }
                if (n86 == 10) {
                    int n98 = Integer.parseInt(string);
                    C_aD_mc.a(n98 + C_aD_mc.bJ, true);
                }
                if (n86 == 11) {
                    int n99 = Integer.parseInt(string);
                    C_aD_mc.b(n99 + C_aD_mc.bJ, false);
                }
                if (n86 == 12) {
                    int n100 = Integer.parseInt(string);
                    C_aD_mc.a(n100 + C_aD_mc.bJ, false);
                }
                if (n86 == 13 && (stringArray3 = string.split(",")).length == 4) {
                    int n101 = Integer.parseInt(stringArray3[0]);
                    n85 = Integer.parseInt(stringArray3[1]);
                    int n102 = Integer.parseInt(stringArray3[2]);
                    int n103 = Integer.parseInt(stringArray3[3]);
                    this.y.a(n101, n85, n102, n103);
                }
                if (n86 == 14 && (stringArray2 = string.split(",")).length == 2) {
                    int n104 = Integer.parseInt(stringArray2[0]);
                    n85 = Integer.parseInt(stringArray2[1]);
                    C_q.a a2 = null;
                    switch (n104) {
                        case 1: {
                            a2 = C_q.a.h;
                            break;
                        }
                        case 2: {
                            a2 = C_q.a.d;
                            break;
                        }
                        case 3: {
                            a2 = C_q.a.g;
                            break;
                        }
                        case 4: {
                            a2 = C_q.a.i;
                            break;
                        }
                        case 5: {
                            a2 = C_q.a.j;
                            break;
                        }
                        case 6: {
                            a2 = C_q.a.k;
                            break;
                        }
                        case 7: {
                            a2 = C_q.a.l;
                            break;
                        }
                        case 8: {
                            a2 = C_q.a.n;
                            break;
                        }
                        case 14: {
                            a2 = C_q.a.o;
                            break;
                        }
                        case 15: {
                            a2 = C_q.a.p;
                            break;
                        }
                        case 16: {
                            a2 = C_q.a.s;
                            break;
                        }
                        case 17: {
                            a2 = C_q.a.q;
                            break;
                        }
                        case 18: {
                            a2 = C_q.a.r;
                            break;
                        }
                        case 19: {
                            a2 = C_q.a.t;
                            break;
                        }
                        case 20: {
                            a2 = C_q.a.e;
                            break;
                        }
                        case 21: {
                            a2 = C_q.a.v;
                            break;
                        }
                        case 22: {
                            a2 = C_q.a.u;
                            break;
                        }
                        case 23: {
                            a2 = C_q.a.m;
                            break;
                        }
                        case 24: {
                            a2 = C_q.a.w;
                            break;
                        }
                        case 25: {
                            a2 = C_q.a.x;
                            break;
                        }
                        case 26: {
                            a2 = C_q.a.y;
                            break;
                        }
                        case 27: {
                            a2 = C_q.a.z;
                            break;
                        }
                        case 28: {
                            a2 = C_q.a.A;
                            break;
                        }
                        case 29: {
                            a2 = C_q.a.C;
                            break;
                        }
                        case 30: {
                            a2 = C_q.a.D;
                            break;
                        }
                        case 31: {
                            a2 = C_q.a.B;
                            break;
                        }
                        case 32: {
                            a2 = C_q.a.E;
                            break;
                        }
                        case 33: {
                            a2 = C_q.a.G;
                            break;
                        }
                        case 34: {
                            a2 = C_q.a.K;
                            break;
                        }
                        case 35: {
                            a2 = C_q.a.H;
                            break;
                        }
                        case 36: {
                            a2 = C_q.a.S;
                            break;
                        }
                        case 37: {
                            a2 = C_q.a.T;
                            break;
                        }
                        case 38: {
                            a2 = C_q.a.F;
                            break;
                        }
                        case 39: {
                            a2 = C_q.a.L;
                            break;
                        }
                        case 40: {
                            a2 = C_q.a.R;
                            break;
                        }
                        case 41: {
                            a2 = C_q.a.V;
                            break;
                        }
                        case 42: {
                            a2 = C_q.a.W;
                            break;
                        }
                        case 43: {
                            a2 = C_q.a.X;
                            break;
                        }
                        case 44: {
                            a2 = C_q.a.Y;
                            break;
                        }
                        case 45: {
                            a2 = C_q.a.J;
                            break;
                        }
                        case 46: {
                            a2 = C_q.a.M;
                            break;
                        }
                        case 47: {
                            a2 = C_q.a.O;
                            break;
                        }
                        case 48: {
                            a2 = C_q.a.U;
                            break;
                        }
                        case 49: {
                            a2 = C_q.a.P;
                            break;
                        }
                        case 50: {
                            a2 = C_q.a.N;
                            break;
                        }
                        case 51: {
                            a2 = C_q.a.Q;
                        }
                    }
                    ArrayList<rs.p_l.p_e.C_q> arrayList = new ArrayList<rs.p_l.p_e.C_q>();
                    boolean bl = false;
                    for (rs.p_l.p_e.C_q c_q : this.u) {
                        if (c_q.a() != a2) continue;
                        if (n85 > 0) {
                            c_q.a(n85);
                            bl = true;
                            continue;
                        }
                        arrayList.add(c_q);
                    }
                    for (rs.p_l.p_e.C_q c_q : arrayList) {
                        this.u.remove(c_q);
                    }
                    if (!bl && a2 != null && n85 > 0) {
                        this.u.add(new rs.p_l.p_e.C_q(this, a2, n85));
                    }
                }
                if (n86 == 15 && (stringArray = string.split(",")).length == 3) {
                    int n105 = Integer.valueOf(Integer.parseInt(stringArray[0])) - 1;
                    n85 = Integer.parseInt(stringArray[1]);
                    int n106 = Integer.parseInt(stringArray[2]);
                    this.d(n105, n85, n106);
                }
                if (n86 == 16) {
                    int n107 = Integer.parseInt(string);
                    this.l(n107 - 1);
                }
                if (n86 == 17 && (n84 = Integer.valueOf(Integer.parseInt(string)).intValue()) == 0) {
                    long[] lArray = new long[this.kA];
                    for (n85 = 0; n85 < this.kA; ++n85) {
                        lArray[n85] = this.lg[n85];
                    }
                    for (long l13 : lArray) {
                        this.f(l13);
                    }
                }
                if (n86 == 18) {
                    int n108 = Integer.parseInt(string);
                    if (n108 >= 24057 && n108 <= 24067) {
                        for (int i = 24057; i <= 24067; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24044 && n108 <= 24049) {
                        for (int i = 24044; i <= 24049; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24039 && n108 <= 24040) {
                        for (int i = 24039; i <= 24040; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24033 && n108 <= 24035) {
                        for (int i = 24033; i <= 24035; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24027 && n108 <= 24029) {
                        for (int i = 24027; i <= 24029; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24019 && n108 <= 24022) {
                        for (int i = 24019; i <= 24022; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24003 && n108 <= 24004) {
                        for (int i = 24003; i <= 24004; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24007 && n108 <= 24008) {
                        for (int i = 24007; i <= 24008; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24011 && n108 <= 24012) {
                        for (int i = 24011; i <= 24012; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 24015 && n108 <= 24016) {
                        for (int i = 24015; i <= 24016; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 61022 && n108 <= 61023) {
                        for (int i = 61022; i <= 61023; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else if (n108 >= 61018 && n108 <= 61019) {
                        for (int i = 61018; i <= 61019; ++i) {
                            rs.p_n.C_e.H[i].E = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[i].aG = n108 == i ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    } else {
                        int[] nArray;
                        for (int n109 : nArray = new int[]{51311, 51313, 59847, 59848, 59849, 59850, 59851, 59852, 25756, 25757, 25758, 25337, 25338, 54000, 45912, 45923, 61018, 61019, 61022, 61023, 54105, 54106, 54107, 54108, 60271, 60272}) {
                            rs.p_n.C_e.H[n109].E = n108 == n109 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                            rs.p_n.C_e.H[n109].aG = n108 == n109 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                    }
                }
                if (n86 == 19) {
                    int n110 = Integer.parseInt(string);
                    if (n110 == 0) {
                        this.v.b[2] = new C_F_uc("orbs/hp_fill");
                    } else if (n110 == 1) {
                        this.v.b[2] = new C_F_uc("orbs/poison_fill");
                    } else if (n110 == 2) {
                        this.v.b[2] = new C_F_uc("orbs/venom_fill");
                    }
                }
                if (n86 == 20) {
                    String[] stringArray8 = string.split(",");
                    int n111 = Integer.parseInt(stringArray8[0]);
                    int n112 = Integer.parseInt(stringArray8[1]);
                    rs.p_n.C_e.c(n111, n112, 32);
                }
                if (n86 == 21) {
                    String[] stringArray9 = string.split(",");
                    String string13 = stringArray9[0];
                    int n113 = Integer.parseInt(stringArray9[1]);
                    int n114 = Integer.parseInt(stringArray9[2]);
                    int n115 = Integer.parseInt(stringArray9[3]);
                    rs.p_n.C_e.H[n113].E = new C_F_uc(string13, n114, n115);
                }
                if (n86 == 22) {
                    this.jo = string.replace("[bl]", "\n") + " ";
                }
                if (n86 == 23) {
                    this.co = string.equalsIgnoreCase("null") ? "" : string;
                }
                if (n86 == 24) {
                    String[] stringArray10 = string.split(" ");
                    int n116 = Integer.parseInt(stringArray10[0]);
                    this.jp.put(n116, string);
                }
                if (n86 == 25) {
                    String[] stringArray11 = string.split("/");
                    String string14 = stringArray11[0];
                    int n117 = Integer.parseInt(stringArray11[1]);
                    int n118 = Integer.parseInt(stringArray11[2]);
                    this.z.w = System.currentTimeMillis();
                    this.z.r = string14;
                    this.z.s = n118;
                    this.z.t = n117;
                    this.z.v = -1;
                }
                if (n86 == 26) {
                    this.af = string;
                }
                if (n86 == 27) {
                    String[] stringArray12 = string.split(",");
                    int n119 = Integer.parseInt(stringArray12[0]);
                    int n120 = Integer.parseInt(stringArray12[1]);
                    rs.p_n.C_e.H[n119].E = n120 == 1 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                    C_F_uc c_F_uc = rs.p_n.C_e.H[n119].aG = n120 == 1 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                }
                if (n86 == 28) {
                    this.O = System.currentTimeMillis() + (long)(Integer.parseInt(string) * 1000);
                }
                if (n86 == 29) {
                    String[] stringArray13 = string.split(",");
                    this.M = Integer.parseInt(stringArray13[0]);
                    this.N = Integer.parseInt(stringArray13[1]);
                }
                if (n86 == 30) {
                    this.L = Integer.parseInt(string);
                }
                if (n86 == 31) {
                    F = Double.parseDouble(string);
                }
                if (n86 == 32) {
                    C_Client_mc.eR.bd = Integer.parseInt(string);
                }
                if (n86 == 33) {
                    String[] stringArray14 = string.split(" ");
                    int n121 = Integer.parseInt(stringArray14[0]);
                    int n122 = Integer.parseInt(stringArray14[1]);
                    if (kw_do != null && n121 <= kw_do.length - 1 && kw_do[n121] != null) {
                        C_Client_mc.kw_do[n121].bd = n122;
                    }
                }
                if (n86 == 34) {
                    String[] stringArray15 = string.split(",");
                    int n123 = Integer.parseInt(stringArray15[0]);
                    int n124 = Integer.parseInt(stringArray15[1]);
                    this.kw_if.put(n123 + "," + n124, true);
                }
                if (n86 == 35) {
                    String[] stringArray16 = string.split(",");
                    int n125 = Integer.parseInt(stringArray16[0]);
                    long l14 = Long.parseLong(stringArray16[1]);
                    int n126 = Integer.parseInt(stringArray16[2]);
                    if (l14 != 0L) {
                        for (rs.p_l.p_e.C_g c_g : this.m.a) {
                            if (c_g.m != l14) continue;
                            c_g.i = n125;
                            c_g.l = n126;
                        }
                        for (rs.p_l.p_e.C_g c_g : this.m.b) {
                            if (c_g.m != l14) continue;
                            c_g.i = n125;
                            c_g.l = n126;
                        }
                    }
                }
                if (n86 == 36) {
                    int n127 = Integer.parseInt(string);
                    C_av.m(n127);
                }
                if (n86 == 37) {
                    int n128 = Integer.parseInt(string);
                    this.ad.add(n128);
                }
                if (n86 == 38) {
                    int n129 = Integer.parseInt(string);
                    C_G_uc.m(n129);
                }
                if (n86 == 39) {
                    String[] stringArray17 = string.split(",");
                    int n130 = Integer.parseInt(stringArray17[0]);
                    int n131 = Integer.parseInt(stringArray17[1]);
                    this.Q = n130;
                    long l3 = this.R = n131 != -1 ? System.currentTimeMillis() + (long)(n131 * 1000) : -1L;
                }
                if (n86 == 40) {
                    int n132 = Integer.parseInt(string);
                    rs.p_n.C_e.H[n132].bf = false;
                }
                if (n86 == 41) {
                    int n133 = Integer.parseInt(string);
                    rs.p_n.C_e.H[n133].bf = true;
                }
                if (n86 == 42) {
                    int n134;
                    this.x.L = n134 = Integer.parseInt(string);
                }
                if (n86 == 43) {
                    String[] stringArray18 = string.split(" ");
                    int n135 = Integer.parseInt(stringArray18[0]);
                    int n136 = Integer.parseInt(stringArray18[1]);
                    this.s = n135;
                    this.t = n136;
                }
                if (n86 == 44) {
                    if (string.contains(",")) {
                        String[] stringArray19 = string.split(",");
                        C_w.e = stringArray19[0];
                        C_w.f = stringArray19[1];
                        C_w.h();
                    } else {
                        C_w.e = string;
                        C_w.f = null;
                        C_w.h();
                    }
                }
                if (n86 == 45) {
                    C_w.d = string;
                }
                if (n86 == 46) {
                    String[] stringArray20 = string.split(",");
                    this.aM = Integer.parseInt(stringArray20[0]);
                    this.aN = Integer.parseInt(stringArray20[1]);
                }
                if (n86 == 47) {
                    System.out.println(string);
                }
                if (n86 == 48) {
                    this.bT = System.currentTimeMillis() + Long.parseLong(string);
                }
                if (n86 == 49) {
                    this.bS = string.replace("{n}", "\n");
                }
                if (n86 == 53) {
                    String[] stringArray21 = string.split(" ");
                    int n137 = Integer.valueOf(stringArray21[1]);
                    C_ab.a(stringArray21[0], n137);
                }
                if (n86 == 54) {
                    C_Launcher_mc.n().a("SpawnPK RSPS", string);
                }
                if (n86 == 55) {
                    String[] stringArray22 = string.split(";");
                    int n138 = Integer.parseInt(stringArray22[0]);
                    int n139 = Integer.parseInt(stringArray22[1]);
                    int n140 = Integer.parseInt(stringArray22[4]);
                    int n141 = Integer.parseInt(stringArray22[5]);
                    rs.p_n.p_c.C_b.a(stringArray22[2], stringArray22[3], n138, n139, n140, n141);
                }
                if (n86 == 56) {
                    String[] stringArray23 = string.split(";");
                    String string15 = stringArray23[0];
                    int n142 = Integer.parseInt(stringArray23[1]);
                    int n143 = Integer.parseInt(stringArray23[2]);
                    rs.p_n.p_c.C_b.a(string15, n142, n143);
                }
                if (n86 == 57) {
                    this.aL = Double.parseDouble(string);
                    this.aK = false;
                }
                if (n86 == 58) {
                    this.aL = Double.parseDouble(string);
                    this.aK = true;
                }
                if (n86 == 59) {
                    this.aG = string;
                }
                if (n86 == 60) {
                    this.aH = string;
                }
                if (n86 == 61) {
                    this.aI = string;
                }
                if (n86 == 62) {
                    this.aF = string.equals("FOG_ACTIVE");
                }
                if (n86 == 63) {
                    String[] stringArray24 = string.split(" ");
                    int n144 = Integer.parseInt(stringArray24[0]);
                    rs.p_n.C_e.H[n144].V = Integer.parseInt(stringArray24[1]);
                }
                if (n86 == 64) {
                    boolean bl = this.x.D = !this.x.D;
                }
                if (n86 == 65) {
                    this.x.R = System.currentTimeMillis() + Long.parseLong(string);
                }
                if (n86 == 66) {
                    if (string.contains("^")) {
                        String[] stringArray25 = string.split("\\^");
                        this.x.J = stringArray25[0];
                        this.x.K = stringArray25[1];
                    } else {
                        this.x.K = null;
                        this.x.J = null;
                    }
                    if (this.x.J != null && this.x.J.equalsIgnoreCase("None")) {
                        this.x.J = null;
                    }
                }
                if (n86 == 67) {
                    this.x.E = string.equals("CURSED");
                }
                if (n86 == 68) {
                    C_Launcher_mc.n().a("SpawnPK RSPS", string, true);
                }
                if (n86 == 69) {
                    this.k = string;
                }
                if (n86 == 70) {
                    String[] stringArray26 = string.split(" ");
                    this.aO = Integer.parseInt(stringArray26[0]);
                    this.aP = Integer.parseInt(stringArray26[1]);
                    this.aQ = System.currentTimeMillis() + Long.parseLong(stringArray26[2]);
                    this.aR = stringArray26[3];
                }
                if (n86 == 71) {
                    int n145 = Integer.parseInt(string);
                    for (int i = 0; i < 60; ++i) {
                        if (i == n145) {
                            rs.p_n.C_e.H[50254 + i].E = rs.p_n.C_e.H[50254 + i].aG = C_G_uc.bI;
                            continue;
                        }
                        if (!rs.p_n.C_e.H[50254 + i].E.t.contains("sprite 30")) continue;
                        rs.p_n.C_e.H[50254 + i].E = rs.p_n.C_e.H[50254 + i].aG = C_G_uc.bJ;
                    }
                }
                if (n86 >= 47000 && n86 <= 47333) {
                    rs.p_n.C_e.H[n86].bb = string.contains("\\n") ? -5 : 0;
                }
                if (n86 > 0) {
                    rs.p_n.C_e.H[n86].at = string;
                    if (rs.p_n.C_e.H[n86].ah == eT[fL]) {
                        fb = true;
                    }
                    if (n86 == 199 && ed == 197) {
                        this.x.k(!this.x.M());
                    }
                }
                return true;
            }
            if (this.lO == 206) {
                this.gw = 0;
                this.gu = this.mU.y();
                this.cE = this.mU.y();
                this.fZ = this.mU.y();
                this.ok = true;
                fM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 240) {
                if (fL == 12) {
                    fb = true;
                }
                this.ko = this.mU.B();
                this.lO = -1;
                return true;
            }
            if (this.lO == 8) {
                int n146 = this.mU.U();
                int n147 = this.mU.A();
                rs.p_n.C_e.H[n146].ae = 1;
                rs.p_n.C_e.H[n146].af = n147;
                this.lO = -1;
                return true;
            }
            if (this.lO == 122) {
                int n148 = this.mU.U();
                int n149 = this.mU.U();
                int n150 = n149 >> 10 & 0x1F;
                int n151 = n149 >> 5 & 0x1F;
                int n152 = n149 & 0x1F;
                rs.p_n.C_e.H[n148].ad = (n150 << 19) + (n151 << 11) + (n152 << 3);
                this.lO = -1;
                return true;
            }
            if (this.lO == 53) {
                int n153;
                fb = true;
                int n154 = this.mU.A();
                rs.p_n.C_e c_e = rs.p_n.C_e.H[n154];
                int n155 = this.mU.A();
                for (n153 = 0; n153 < n155; ++n153) {
                    int n156;
                    int n157 = this.mU.y();
                    if (n157 == 255) {
                        n157 = this.mU.Y();
                    }
                    c_e.az[n153] = n156 = this.mU.U();
                    c_e.ax[n153] = n157;
                }
                for (n153 = n155; n153 < c_e.az.length; ++n153) {
                    c_e.az[n153] = 0;
                    c_e.ax[n153] = 0;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 230) {
                int n158 = this.mU.T();
                int n159 = this.mU.A();
                int n160 = this.mU.A();
                int n161 = this.mU.U();
                rs.p_n.C_e.H[n159].aU = n160;
                rs.p_n.C_e.H[n159].aV = n161;
                rs.p_n.C_e.H[n159].aT = n158;
                this.lO = -1;
                return true;
            }
            if (this.lO == 221) {
                this.kB = this.mU.y();
                fb = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 177) {
                this.fe = true;
                this.lE = this.mU.y();
                this.lF = this.mU.y();
                this.lG = this.mU.A();
                this.lH = this.mU.y();
                this.lI = this.mU.y();
                if (this.lI >= 100) {
                    int n162 = this.lE * 128 + 64;
                    int n163 = this.lF * 128 + 64;
                    int n164 = this.c(dw, n163, n162) - this.lG;
                    int n165 = n162 - cJ;
                    int n166 = n164 - cK;
                    int n167 = n163 - cL;
                    int n168 = (int)Math.sqrt(n165 * n165 + n167 * n167);
                    this.cR = (int)(Math.atan2(n166, n168) * 325.949) & 0x7FF;
                    this.cS = (int)(Math.atan2(n165, n167) * -325.949) & 0x7FF;
                    if (this.cR < 128) {
                        this.cR = 128;
                    }
                    if (this.cR > 383) {
                        this.cR = 383;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 249) {
                this.mk = this.mU.N();
                di = this.mU.U();
                this.lO = -1;
                return true;
            }
            if (this.lO == 65) {
                this.a(this.mU, this.lN);
                this.lO = -1;
                return true;
            }
            if (this.lO == 27) {
                this.gb = false;
                this.fN = 1;
                this.dW = "Enter amount:";
                this.dY = "";
                fM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 187) {
                this.gb = false;
                this.fN = 2;
                this.dX = "Enter name:";
                this.dY = "";
                fM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 97) {
                int n169 = this.mU.A();
                this.C(n169);
                if (!(rs.p_n.C_e.H[199].at.contains("LMS") && ed == 197 && C_Client_mc.eR.ay == 6095 || this.fu == -1)) {
                    this.fu = -1;
                    fb = true;
                    eM = true;
                }
                if (this.gp != -1 && this.cY == 0) {
                    this.gp = -1;
                    fM = true;
                }
                if (this.fN != 0) {
                    this.fN = 0;
                    fM = true;
                }
                if (n169 == 8134) {
                    rs.p_n.C_e.H[8143].V = 0;
                }
                if (n169 == 35000) {
                    C_ai.e = -1;
                }
                if (n169 == 47500) {
                    C_ab.l();
                }
                if (n169 == 63036) {
                    C_w.i();
                }
                cH = n169;
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 218) {
                this.en = this.mU.W();
                fM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 87) {
                int n170;
                int n171 = this.mU.S();
                this.mj[n171] = n170 = this.mU.X();
                if (this.dP[n171] != n170) {
                    this.dP[n171] = n170;
                    this.B(n171);
                    fb = true;
                    if (this.en != -1) {
                        fM = true;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 36) {
                int n172 = this.mU.S();
                byte by = this.mU.z();
                this.mj[n172] = by;
                if (this.dP[n172] != by) {
                    this.g("@blu@PACKET 36:@bla@ Setting " + n172 + " to " + by);
                    this.dP[n172] = by;
                    this.B(n172);
                    fb = true;
                    if (this.en != -1) {
                        fM = true;
                    }
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 61) {
                this.es = this.mU.y();
                this.lO = -1;
                return true;
            }
            if (this.lO == 200) {
                int[] nArray;
                int n173 = this.mU.A();
                int n174 = this.mU.B();
                rs.p_n.C_e c_e = rs.p_n.C_e.H[n173];
                c_e.aD = n174;
                for (int n175 : nArray = new int[]{4883, 4888, 4894, 4901, 969, 974, 980, 987}) {
                    if (n173 != n175) continue;
                    c_e.aT = 2000;
                    c_e.aU = 100;
                    c_e.aV = 1900;
                    break;
                }
                if (n174 == -1) {
                    c_e.ar = 0;
                    c_e.F = 0;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 219) {
                if (!(rs.p_n.C_e.H[199].at.contains("LMS") && ed == 197 && C_Client_mc.eR.ay == 6095 || this.fu == -1)) {
                    this.fu = -1;
                    fb = true;
                    eM = true;
                }
                if (this.gp != -1 && this.cY == 0) {
                    this.gp = -1;
                    fM = true;
                }
                if (this.fN != 0 && this.fN != 25) {
                    this.fN = 0;
                    fM = true;
                }
                if (rs.p_l.p_f.p_a.p_i.C_b.l() && rs.p_l.p_f.p_a.p_i.C_b.k().r()) {
                    rs.p_l.p_f.p_a.p_i.C_b.m();
                }
                rs.p_n.C_d.b();
                rs.p_n.p_a.p_a.C_c.b();
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            if (this.lO == 34) {
                fb = true;
                int n176 = this.mU.A();
                rs.p_n.C_e c_e = rs.p_n.C_e.H[n176];
                while (this.mU.h < this.lN) {
                    int n177 = this.mU.f();
                    int n178 = this.mU.A();
                    int n179 = this.mU.y();
                    if (n179 == 255) {
                        n179 = this.mU.D();
                    }
                    if (n177 < 0 || n177 >= c_e.az.length) continue;
                    c_e.az[n177] = n178;
                    c_e.ax[n177] = n179;
                }
                this.lO = -1;
                return true;
            }
            if (this.lO == 105 || this.lO == 84 || this.lO == 147 || this.lO == 215 || this.lO == 4 || this.lO == 117 || this.lO == 156 || this.lO == 44 || this.lO == 160 || this.lO == 101 || this.lO == 151) {
                this.c(this.mU, this.lO);
                this.lO = -1;
                return true;
            }
            if (this.lO == 106) {
                fL = this.mU.O();
                fb = true;
                eM = true;
                this.lO = -1;
                return true;
            }
            if (this.lO == 164) {
                int n180 = this.mU.S();
                this.C(n180);
                if (this.fN == 25 && this.gb) {
                    this.gb = false;
                }
                this.gp = n180;
                fM = true;
                this.eZ = false;
                this.lO = -1;
                return true;
            }
            rs.p_v.C_a.e("T1 - " + this.lO + "," + this.lN + " - " + this.jQ + "," + this.jR);
            this.br();
        }
        catch (IOException iOException) {
            this.x();
        }
        catch (Exception exception) {
            int n;
            Object object;
            exception.printStackTrace();
            if (rs.p_f.C_a.d.booleanValue()) {
                System.out.println("Previous packets: ");
                object = jC.iterator();
                while (object.hasNext()) {
                    n = object.next();
                    System.out.println(n);
                }
            }
            object = "T2 - " + this.lO + "," + this.jQ + "," + this.jR + " - " + this.lN + "," + (eh + C_Client_mc.eR.k[0]) + "," + (ei + C_Client_mc.eR.l[0]) + " - ";
            for (n = 0; n < this.lN && n < 50; ++n) {
                object = (String)object + this.mU.g[n] + ",";
            }
            rs.p_v.C_a.e((String)object);
            this.br();
        }
        return true;
    }

    public final void a(int[] nArray, int n, int n2, int n3) {
        if (n >= 128 && n3 >= 128 && n <= 13056 && n3 <= 13056) {
            int n4;
            int n5 = this.c(dw, n3, n) - n2;
            n -= cJ;
            n5 -= cK;
            int n6 = rs.p_a.C_h.bA[this.cR];
            int n7 = rs.p_a.C_h.bB[this.cR];
            int n8 = rs.p_a.C_h.bA[this.cS];
            int n9 = rs.p_a.C_h.bB[this.cS];
            int n10 = (n3 -= cL) * n8 + n * n9 >> 16;
            n3 = n3 * n9 - n * n8 >> 16;
            n = n10;
            n10 = n5 * n7 - n3 * n6 >> 16;
            n3 = n5 * n6 + n3 * n7 >> 16;
            int n11 = 9;
            int n12 = n4 = rs.p_f.C_a.aO ? 4500 : 3500;
            if (n3 >= 50 && n3 <= n4) {
                nArray[0] = C_E_uc.s + (n << n11) / n3;
                nArray[1] = C_E_uc.t + (n10 << n11) / n3;
                nArray[2] = n3;
                nArray[3] = C_E_uc.s + (n / 2 << n11) / n3;
                nArray[4] = C_E_uc.t + (n10 / 2 << n11) / n3;
                nArray[5] = C_E_uc.s + (n / 2 << n11) / n3;
                nArray[6] = C_E_uc.t + (n10 / 2 << n11) / n3;
            } else {
                nArray[0] = 0;
                nArray[1] = 0;
                nArray[2] = 0;
                nArray[3] = 0;
                nArray[4] = 0;
                nArray[5] = 0;
                nArray[6] = 0;
            }
        } else {
            nArray[0] = 0;
            nArray[1] = 0;
            nArray[2] = 0;
            nArray[3] = 0;
            nArray[4] = 0;
            nArray[5] = 0;
            nArray[6] = 0;
        }
    }

    private void bQ() {
        fv.a(130);
        if (!(rs.p_n.C_e.H[199].at.contains("LMS") && ed == 197 && C_Client_mc.eR.ay == 6095 || this.fu == -1)) {
            this.fu = -1;
            fb = true;
            this.eZ = false;
            eM = true;
        }
        if (this.gp != -1) {
            this.gp = -1;
            fM = true;
            this.eZ = false;
        }
        rs.p_n.C_d.b();
    }

    public static String o(int n) {
        Object object = String.valueOf(n);
        for (int i = ((String)object).length() - 3; i > 0; i -= 3) {
            object = ((String)object).substring(0, i) + "," + ((String)object).substring(i);
        }
        if (((String)object).length() > 8) {
            object = "@gre@" + ((String)object).substring(0, ((String)object).length() - 8) + " million @whi@(" + (String)object + ")";
        } else if (((String)object).length() > 4) {
            object = "@cya@" + ((String)object).substring(0, ((String)object).length() - 4) + "K @whi@(" + (String)object + ")";
        }
        return " " + (String)object;
    }

    public C_Client_mc() {
        C_C_uc.b = this;
        this.iy = new ArrayList(10000);
        this.iz = new ArrayList();
        this.jF = new int[104][104];
        this.jG = new int[350];
        this.jH = new C_h[4][104][104];
        this.jK = false;
        this.jM = new rs.p_x.C_e(new byte[rs.p_f.C_a.bt.intValue()]);
        this.cA = new rs.p_a.C_j[16384];
        this.cC = new int[16384];
        this.jO = new int[1000];
        this.jS = rs.p_x.C_e.c();
        this.jT = true;
        cH = -1;
        rs.p_n.p_a.p_a.C_c.b();
        this.ka = new int[rs.p_f.C_e.a];
        this.km = false;
        this.dg = new int[5];
        this.kn = -1;
        this.dh = new boolean[5];
        this.kq = false;
        this.kr = "";
        di = -1;
        dj = false;
        dk = "";
        this.kt = 2048;
        kw_do = new rs.p_a.C_k[this.kt];
        this.kv = new int[this.kt];
        this.kx = new int[this.kt];
        this.ky = new rs.p_x.C_e[this.kt];
        this.kz = 1;
        this.kC = new int[104][104];
        this.kD = 7759444;
        this.kL = new byte[16384];
        this.kN = new int[rs.p_f.C_e.a];
        this.kP = new long[100];
        this.kQ = false;
        this.kR = 3353893;
        this.dy = new int[5];
        this.kS = new int[104][104];
        this.dz = new int[200];
        this.dA = new int[200];
        this.dB = new String[200];
        this.dC = new String[200];
        this.dD = new boolean[200];
        this.dG = new C_F_uc[15];
        this.lf = true;
        this.lg = new long[700];
        this.lh = -1;
        this.lj = false;
        this.dN = -1;
        this.dO = -1;
        this.ln = new int[33];
        this.lo = new int[256];
        this.dP = new int[2000];
        this.lp = false;
        this.lq = 50;
        this.lr = new int[this.lq];
        this.ls = new int[this.lq];
        this.lt = new int[this.lq];
        this.lu = new int[this.lq];
        this.lv = new int[this.lq];
        this.lw = new int[this.lq];
        this.lx = new int[this.lq];
        this.ly = new String[this.lq];
        this.dR = -1;
        this.dS = new C_F_uc[20];
        this.lB = new int[5];
        this.lD = false;
        this.lL = 2301979;
        this.dY = "";
        this.ea = new C_h();
        this.lT = false;
        ed = -1;
        this.eg = new int[5];
        this.md = false;
        this.me = new C_F_uc[100];
        this.en = -1;
        this.eo = new int[rs.p_f.C_e.a];
        this.mj = new int[2000];
        this.ml = true;
        this.eq = new int[152];
        this.er = -1;
        this.et = new C_h();
        this.mp = new int[33];
        this.eu = new rs.p_n.C_e();
        this.mq = new rs.p_l.C_a[100];
        this.mt = 5063219;
        this.mu = new int[7];
        this.mA = new int[1000];
        this.mB = new int[1000];
        this.mS = false;
        this.mT = new String[350];
        this.mU = rs.p_x.C_e.c();
        this.eE = new int[9];
        this.eF = new int[500];
        this.eG = new int[500];
        this.eH = new int[500];
        this.eI = new int[500];
        this.eJ = new int[500];
        this.mW = new C_F_uc[21];
        this.eK = new C_F_uc[20];
        this.mX = new C_F_uc[20];
        eM = false;
        this.eQ = "";
        this.nh = new String[5];
        this.ni = new boolean[5];
        this.eS = new int[4][13][13];
        this.nj = 2;
        this.no = new C_F_uc[1000];
        this.np = false;
        this.eZ = false;
        this.fa = new C_F_uc[8];
        this.nv = true;
        fb = false;
        this.fc = false;
        this.nz = false;
        this.nA = false;
        this.fe = false;
        this.nF = 1;
        this.fk = "";
        this.fl = "";
        this.fm = "";
        this.nI = false;
        this.nK = -1;
        this.nL = new C_h();
        this.fs = 128;
        this.fu = -1;
        fv = rs.p_x.C_e.c();
        this.fx = new String[500];
        this.fy = new int[5];
        this.nY = new int[50];
        this.ob = 2;
        fA = 78;
        this.fB = "";
        fE = new C_F_uc[107];
        fL = 3;
        fM = false;
        this.oj = true;
        this.fO = new int[152];
        this.fP = new rs.C_f[4];
        this.ok = false;
        this.on = new int[100];
        this.oo = new int[50];
        this.op = false;
        this.os = new int[50];
        this.ot = new int[50];
        this.ov = false;
        this.ga = false;
        this.gb = false;
        this.oC = "";
        this.oD = "";
        this.gp = -1;
        this.oJ = 2;
        this.oK = new int[4000];
        this.oL = new int[4000];
        this.oP = -1;
    }

    public static void f(String string) {
        if (Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                URI uRI = new URI(string);
                Desktop.getDesktop().browse(uRI);
                return;
            }
            catch (IOException | URISyntaxException exception) {
                exception.printStackTrace();
            }
        }
        String string2 = System.getProperty("os.name");
        try {
            if (string2.toLowerCase().indexOf("mac") >= 0) {
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("open " + string);
            } else if (string2.toLowerCase().indexOf("win") >= 0) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + string);
            } else {
                String[] stringArray = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
                String string3 = null;
                for (int i = 0; i < stringArray.length && string3 == null; ++i) {
                    if (Runtime.getRuntime().exec(new String[]{"which", stringArray[i]}).waitFor() != 0) continue;
                    string3 = stringArray[i];
                }
                if (string3 == null) {
                    throw new Exception("Could not find web browser");
                }
                Runtime.getRuntime().exec(new String[]{string3, string});
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void ad() {
        if (this.au()) {
            long l2 = System.nanoTime();
            long l3 = l2 - this.gB;
            this.gB = l2;
            if (this.fc) {
                this.e(l3);
            }
        }
    }

    public void e(long l2) {
        double d2 = C_Client_mc.b(this.ar(), l2);
        double d3 = C_Client_mc.b(this.ap(), l2);
        if (gC <= -5000000.0) {
            gC = 0.0;
        }
        if (gC >= 5000000.0) {
            gC = 0.0;
        }
        gD += d3 / 2.0;
        gD = com.google.a.m.d.a((double)gD, (double)0.39269908169872414, (double)(this.aq() ? 1.5707963267948966 : 1.175029283520401));
        int n = C_Client_mc.b(gC += d2 / 2.0);
        int n2 = C_Client_mc.b(gD);
        this.r(n);
        this.q(n2);
    }

    public static int b(double d2) {
        return (int)(d2 / 0.0030679615757712823) & 0x7FF;
    }

    public static double b(int n, long l2) {
        double d2 = (double)n * 0.0030679615757712823;
        double d3 = (double)l2 / 2.0E7;
        return d2 * d3;
    }

    public int ae() {
        return this.ax() && this.aC() ? (int)(((double)this.B().getWidth() - this.aF().getWidth()) / 2.0) : 0;
    }

    public int af() {
        return this.ax() && this.aC() ? (int)(((double)this.B().getHeight() - this.aF().getHeight()) / 2.0) : 0;
    }

    public int ag() {
        return !C_Client_mc.ai() ? 4 : 0;
    }

    public int ah() {
        return !C_Client_mc.ai() ? 4 : 0;
    }

    public static boolean ai() {
        return rs.p_f.C_a.ai == C_a.c.b;
    }

    public static boolean aj() {
        return rs.p_f.C_a.ai == C_a.c.a;
    }

    public void p(int n) {
        this.gH = n;
    }

    public int ak() {
        return this.gH;
    }

    public int al() {
        return this.at() / 2;
    }

    public int am() {
        return this.as() / 2;
    }

    public int an() {
        return this.cS;
    }

    public int ao() {
        return this.cR;
    }

    public int ap() {
        return this.nN;
    }

    public void q(int n) {
        this.fs = n;
    }

    public void r(int n) {
        this.ft = n;
    }

    public boolean aq() {
        return C_V_uc.g;
    }

    public void s(int n) {
        this.nN = n;
    }

    public int ar() {
        return this.nM;
    }

    public void t(int n) {
        this.nM = n;
    }

    public int as() {
        return ak;
    }

    public int at() {
        return aj;
    }

    public boolean au() {
        return rs.p_k.C_e.a();
    }

    public int av() {
        return ai;
    }

    public int aw() {
        return ah;
    }

    public boolean ax() {
        return this.ay() && (this.aF().getWidth() > 775.0 || this.aF().getHeight() > 513.0);
    }

    public boolean ay() {
        return this.az() && !C_Client_mc.ai() && rs.p_k.C_e.a() && this.fc;
    }

    public boolean az() {
        return rs.p_k.C_e.a() && rs.p_k.C_b.i;
    }

    public boolean aA() {
        return oQ;
    }

    public void f(boolean bl) {
        oQ = bl;
    }

    public boolean aB() {
        return rs.p_k.C_b.l;
    }

    public boolean aC() {
        return rs.p_k.C_b.j;
    }

    public void u(int n) {
        oR = 1.0 + (double)n / 100.0;
    }

    public double aD() {
        return oR;
    }

    public Dimension aE() {
        if (!this.ay()) {
            this.gI.getSize();
        }
        if (oT == null) {
            if (C_Client_mc.ai()) {
                Container container = this.aY();
                int n = container.getWidth();
                int n2 = container.getHeight();
                int n3 = (int)((double)n / oR);
                int n4 = (int)((double)n2 / oR);
                if (n3 < 765 || n4 < 503) {
                    double d2 = (double)n / 765.0;
                    double d3 = (double)n2 / 503.0;
                    double d4 = Math.min(d2, d3);
                    n3 = (int)((double)n / d4);
                    n4 = (int)((double)n2 / d4);
                }
                oT = new Dimension(ai, ah);
            } else {
                oT = new Dimension(765, 503);
            }
        }
        return oT;
    }

    public Dimension aF() {
        if (oS == null) {
            Component component = this.B();
            if (this.gI == null) {
                this.aX();
                return this.aE();
            }
            int n = component.getWidth();
            int n2 = component.getHeight();
            Dimension dimension = this.aE();
            if (this.aC()) {
                double d2 = dimension.getWidth() / dimension.getHeight();
                int n3 = (int)((double)n2 * d2);
                int n4 = n2;
                if (n3 > n) {
                    n4 = (int)((double)n / d2);
                    if ((double)(this.B().getHeight() - n4) / 2.0 <= 0.0) {
                        n2 = n4;
                    }
                } else {
                    n = n3;
                }
            }
            if (this.aB()) {
                if (n > dimension.width) {
                    n -= n % dimension.width;
                }
                if (n2 > dimension.height) {
                    n2 -= n2 % dimension.height;
                }
            }
            oS = new Dimension(n, n2);
        }
        return oS;
    }

    public void g(boolean bl) {
        oT = null;
        oS = null;
        if (!bl || C_Client_mc.ai()) {
            // empty if block
        }
    }

    public rs.p_runelite.p_a.C_f aG() {
        if (C_V_uc.t != -1 && C_V_uc.u != -1) {
            return rs.p_runelite.p_a.C_f.a(C_V_uc.t, C_V_uc.u);
        }
        return null;
    }

    public int aH() {
        return this.eV - 1;
    }

    public int aI() {
        int n = this.eV - 1;
        if (n < 0) {
            return -1;
        }
        return this.eI[n];
    }

    public rs.p_a.C_k aJ() {
        return eR;
    }

    public rs.p_a.C_j[] aK() {
        return this.cA;
    }

    public int aL() {
        return 512;
    }

    public int aM() {
        return al;
    }

    public int aN() {
        return C_V_uc.j;
    }

    public int aO() {
        return C_V_uc.k;
    }

    public int aP() {
        return C_V_uc.l;
    }

    public int[][][] aQ() {
        return this.fC;
    }

    public int aR() {
        return eh;
    }

    public int aS() {
        return ei;
    }

    static {
        int n;
        c = new HashMap<Integer, Boolean>();
        f = false;
        h = false;
        j = 0L;
        E = 0L;
        F = 10.0;
        T = 0;
        ib = 0L;
        ic = 0L;
        aa = new C_o();
        ab = new rs.p_l.p_e.C_k();
        ac = new int[]{12282, 28990, 5312, 2295, 13838, 12616, 31236, 31523, 27731, 31546, 31548, 31549, 31550, 31545, 7735, 6578, 6577, 6590, 6844, 5419, 2399, 31524, 31231, 31779, 31789, 32002, 31749, 31746, 31995, 32005, 31996, 31766, 31767, 28975, 28976, 28977, 28978, 28979, 28980, 28981, 28982, 28983, 28984, 28988, 28989, 28996, 28997, 28998, 28999, 29000, 29001, 29002, 29003, 29004, 29005, 29006, 29007, 29021, 29022, 29023, 29025, 29026, 29027, 29028, 29030, 29031, 29039, 32792, 32788, 32789, 32790, 32787, 32204, 54062, 55763, 32211, 51781, 27728, 27728, 28045, 50939, 34668, 24587, 24582, 17423, 13191, 12409, 10482, 57610, 58210, 58211, 58213, 58214, 58434, 58435, 59042, 59043, 59057, 59062, 59065, 59066, 59068, 59074, 59077, 59082, 59085, 59086, 59089, 59092, 59093, 59127, 59129, 59132, 59138, 59147, 59151, 59157, 59159, 59160, 59162, 2260, 48516, 48584, 48706, 4935, 2929, 3788, 31993, 56202, 56203, 56204, 56205, 56206, 56207, 42001, 42003, 35106, 34648, 33263, 33273, 56284, 56285, 58219, 58220, 58223, 58224, 58226, 58849, 58850, 58853, 58530, 58610, 60121, 60177, 58539, 58615, 58543, 58601, 52298, 12778, 12817, 34134, 40946, 40947, 40948, 33202, 33200, 33201, 42002, 42783, 42818, 31751, 31999, 31988, 31773, 32011, 31770, 31971, 31772, 32416, 32421, 32689, 32680, 32466, 32516, 32517, 32526, 32525, 32523, 32522, 32681, 32411, 32427, 42015, 42016, 42017, 42018, 42019, 42003, 42004, 42005, 42006, 42007, 42008, 42009, 42010, 42012, 42013, 5214, 34655, 34662, 58288, 2412, 41969, 58199, 58200, 58196, 58197, 58198, 58201, 58195, 58203, 43237, 43123, 43159, 48483, 48560, 48648, 43174, 43172, 43246, 39672, 43235, 43177, 43176, 43226, 43209, 43249, 43178, 27705, 27706, 27709, 27762, 27823, 43180, 43186, 43187, 43190, 43192, 43193, 43194, 43195, 43196, 43248, 60776, 2361, 40949, 40950, 2676};
        ag = false;
        aj = 512;
        ak = 334;
        aV = 0;
        aW = -1;
        aX = 0;
        aY = 0;
        aZ = new int[]{4540, 4529, 5674, 5667, 5785, 6802, 8072, 4562};
        ba = false;
        bb = 0;
        bc = 0;
        bd = 0;
        be = 0;
        bf = 0;
        bg = 0;
        ii = 0L;
        bh = 0L;
        bi = 0L;
        bn = new C_cc();
        bC = -1;
        bD = false;
        bE = 0;
        bF = 0;
        bG = 0;
        bH = 0;
        iA = new Random();
        bJ = new int[]{40, 57, 58, 59, 60, 61, 24, 1, 64, 66, 34, 52, 51, 62, 67, 68, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339};
        bK = new int[]{17, 53, 54, 55, 63, 56};
        bL = 0;
        bM = 1;
        bN = 150;
        bO = -1;
        bP = 150;
        bQ = -1;
        bR = false;
        ch = false;
        ci = 0L;
        cq = 0;
        cr = 0;
        jy = new int[]{2459, 2469, 2480, 2492, 14170};
        jz = new int[]{4882, 4887, 4893, 4900, 30700};
        jC = new ArrayList();
        cx = new ArrayList();
        cy = new int[]{0, 0, 0, 0, 0, 0, 0};
        cI = -1;
        cM = -1;
        dK = 10;
        dM = true;
        dU = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 491769, 10, 17050, 1, 491770, 130770, 374770, 926, 76770, 34770, 2, 3, 6, 4, 5, 123770}};
        dV = new int[][]{{2, 40}, {3, 56}, {6, 60}, {4, 62}, {5, 54}};
        ej = -1;
        ek = null;
        eT = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        fn = "";
        fz = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
        lU = new int[99];
        int n2 = 0;
        for (n = 0; n < 99; ++n) {
            int n3 = n + 1;
            int n4 = (int)((double)n3 + 300.0 * Math.pow(2.0, (double)n3 / 7.0));
            C_Client_mc.lU[n] = (n2 += n4) / 4;
        }
        fQ = new int[32];
        n2 = 2;
        for (n = 0; n < 32; ++n) {
            C_Client_mc.fQ[n] = n2 - 1;
            n2 += n2;
        }
    }

    private static final class a {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        rs.p_n.C_e k;
        String l;

        private a() {
        }

        void a(C_Client_mc c_Client_mc, int n) {
            this.a = c_Client_mc.eI[n];
            this.b = c_Client_mc.eJ[n];
            this.c = c_Client_mc.eF[n];
            this.d = c_Client_mc.eG[n];
            this.e = c_Client_mc.eH[n];
            this.l = c_Client_mc.fx[n];
            this.k = rs.p_n.C_e.H[this.d];
            this.f = rs.C_Client_mc$a.a(this.k, cH) ? cH : -1;
            this.g = rs.C_Client_mc$a.a(this.k, c_Client_mc.fu) ? c_Client_mc.fu : -1;
            this.h = rs.C_Client_mc$a.a(this.k, c_Client_mc.gp) ? c_Client_mc.gp : -1;
            this.i = fL;
            this.j = rs.C_Client_mc$a.a(this.k, eT[this.i]) ? eT[this.i] : -1;
        }

        private static boolean a(rs.p_n.C_e c_e, int n) {
            if (n < 0) {
                return false;
            }
            for (int i = 0; c_e != null && i < 32; ++i) {
                if (c_e.aw == n || c_e.ah == n) {
                    return true;
                }
                int n2 = c_e.ah;
                if (n2 == c_e.aw || n2 < 0 || n2 >= rs.p_n.C_e.H.length) {
                    return false;
                }
                c_e = rs.p_n.C_e.H[n2];
            }
            return false;
        }

        boolean a(C_Client_mc c_Client_mc) {
            rs.p_n.C_e c_e = rs.p_n.C_e.H[this.d];
            return !(this.f != -1 && this.f != cH || this.g != -1 && this.g != c_Client_mc.fu || this.h != -1 && this.h != c_Client_mc.gp || this.j != -1 && this.j != eT[this.i] || c_e == null || c_e != this.k || c_e.az == null || this.c < 0 || this.c >= c_e.az.length || c_e.az[this.c] != this.b + 1);
        }

        /* synthetic */ a(rs.C_d c_d) {
            this();
        }
    }
}

