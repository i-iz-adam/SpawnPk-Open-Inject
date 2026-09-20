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
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.StringConcatFactory;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
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
import rs.p_eventbus.C_EventBus_mc;
import rs.p_gui.C_Launcher_mc;
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

public final class C_Client_mc extends C_C_uc {
   public rs.p_k.C_e a;
   public rs.p_k.C_p b;
   public static final Map<Integer, Boolean> c = new HashMap<>();
   final Integer[] d = new Integer[]{
      13129,
      13642,
      13641,
      13386,
      13130,
      13131,
      13387,
      13655,
      1365,
      13646,
      13647,
      13135,
      13134,
      13133,
      12621,
      13899,
      13900,
      14155,
      14156,
      13388,
      13644,
      12877,
      12878,
      12879,
      13390,
      13391,
      13389,
      13132,
      13645,
      13385,
      12873,
      12874,
      12875,
      13903,
      13902,
      13901,
      14157,
      14413,
      14412,
      14411,
      14410,
      13643,
      13898,
      13897,
      13640,
      12623,
      12622,
      12367,
      12366,
      12365,
      12620,
      13361,
      13360,
      13362,
      13105,
      13617,
      9023,
      9022,
      9024,
      8768,
      8767,
      8766,
      9278,
      9279,
      9280,
      12956,
      12700,
      12444,
      12445,
      12446,
      12447,
      12703,
      12702,
      12701,
      12957,
      12958,
      12959,
      6810,
      7066,
      7065,
      6811,
      6809,
      6553,
      6554,
      6555,
      12704,
      12488,
      12960,
      13396,
      13136,
      12881,
      12882,
      12883,
      12884,
      12885,
      12886,
      13142,
      13398,
      14654,
      13653,
      13652,
      13651,
      13650,
      13649,
      13648,
      13392,
      13216,
      13215,
      13214,
      13213,
      13212,
      12448,
      14927,
      14926,
      14928,
      14672,
      14671,
      14670,
      15184,
      15183,
      15182,
      6481,
      6226,
      6482,
      6738,
      6737,
      6736,
      6480,
      6224,
      6225,
      6479,
      6223,
      6735,
      5771,
      5772,
      5770,
      5515,
      6027,
      5514,
      6026,
      5513,
      5769,
      6025,
      5773,
      6029,
      5774,
      5517,
      5518,
      6030,
      5516,
      6028,
      12611,
      12355,
      12354,
      12610,
      12866,
      12867,
      12868,
      12612,
      12356,
      12613,
      12357,
      12358,
      12614,
      12870,
      12869,
      13125,
      12868,
      12869,
      12870,
      13126,
      13382,
      13381,
      13380,
      13124,
      13122,
      13123,
      13379,
      13378,
      13337,
      13121,
      12865,
      12866,
      12867,
      13123,
      13124,
      13380,
      12868,
      13379,
      13378,
      12886,
      12613,
      12357,
      12869,
      12356,
      12868,
      13404,
      13403,
      13402,
      13401,
      13657,
      13913,
      14169,
      14170,
      14171,
      14172,
      13916,
      13660,
      13659,
      13915,
      13658,
      13914,
      5956,
      5957,
      5955,
      5770,
      6211,
      6212,
      6213,
      5701,
      5700,
      5699,
      11622,
      11878,
      12134,
      11621,
      11877,
      12133,
      11620,
      11876,
      12132,
      11601,
      11345,
      11857,
      11600,
      11856,
      11344,
      11602,
      11858,
      11346
   };
   final Integer[] e = new Integer[0];
   public static boolean f = false;
   public static final boolean g = false;
   public static boolean h = false;
   public static boolean i;
   public static long j = 0L;
   public String k;
   public rs.p_cache.p_b.C_c l = new rs.p_cache.p_b.C_c(this);
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
   public List<rs.p_l.p_e.C_q> u = new ArrayList<>();
   public rs.p_i.C_b v;
   public static rs.p_l.p_e.C_c w;
   public rs.p_l.p_f.p_a.p_c.C_c x;
   public rs.p_l.p_c.C_a y;
   public rs.p_l.p_f.p_a.p_c.C_d z;
   public static final int A = 2940;
   public static final int B = 3390;
   public static final int C = 3521;
   public static final int D = 3972;
   public static long E = 0L;
   public static double F = 10.0;
   public rs.p_l.p_d.C_c G;
   public rs.p_l.C_F_uc[] H;
   public rs.p_l.C_F_uc I;
   public rs.p_l.C_F_uc[] J;
   public boolean K;
   public int L = 0;
   public int M = 0;
   public int N = 0;
   public long O = 0L;
   public int P = 0;
   public int Q = 0;
   public long R = 0L;
   public int S = 0;
   public static int T = 0;
   public boolean U = false;
   public static int V;
   public static int W;
   public static int X;
   private static long ib = 0L;
   public rs.p_l.C_F_uc Y;
   private static long ic = 0L;
   private long id;
   private List<rs.p_q.p_a.C_a> ie = new ArrayList<>();
   private Map<String, Boolean> kw_if = new HashMap<>();
   public C_j Z = new C_j();
   public static rs.p_l.p_e.C_o aa = new rs.p_l.p_e.C_o();
   public static rs.p_l.p_e.C_k ab = new rs.p_l.p_e.C_k();
   public static final int[] ac = new int[]{
      12282,
      28990,
      5312,
      2295,
      13838,
      12616,
      31236,
      31523,
      27731,
      31546,
      31548,
      31549,
      31550,
      31545,
      7735,
      6578,
      6577,
      6590,
      6844,
      5419,
      2399,
      31524,
      31231,
      31779,
      31789,
      32002,
      31749,
      31746,
      31995,
      32005,
      31996,
      31766,
      31767,
      28975,
      28976,
      28977,
      28978,
      28979,
      28980,
      28981,
      28982,
      28983,
      28984,
      28988,
      28989,
      28996,
      28997,
      28998,
      28999,
      29000,
      29001,
      29002,
      29003,
      29004,
      29005,
      29006,
      29007,
      29021,
      29022,
      29023,
      29025,
      29026,
      29027,
      29028,
      29030,
      29031,
      29039,
      32792,
      32788,
      32789,
      32790,
      32787,
      32204,
      54062,
      55763,
      32211,
      51781,
      27728,
      27728,
      28045,
      50939,
      34668,
      24587,
      24582,
      17423,
      13191,
      12409,
      10482,
      57610,
      58210,
      58211,
      58213,
      58214,
      58434,
      58435,
      59042,
      59043,
      59057,
      59062,
      59065,
      59066,
      59068,
      59074,
      59077,
      59082,
      59085,
      59086,
      59089,
      59092,
      59093,
      59127,
      59129,
      59132,
      59138,
      59147,
      59151,
      59157,
      59159,
      59160,
      59162,
      2260,
      48516,
      48584,
      48706,
      4935,
      2929,
      3788,
      31993,
      56202,
      56203,
      56204,
      56205,
      56206,
      56207,
      42001,
      42003,
      35106,
      34648,
      33263,
      33273,
      56284,
      56285,
      58219,
      58220,
      58223,
      58224,
      58226,
      58849,
      58850,
      58853,
      58530,
      58610,
      60121,
      60177,
      58539,
      58615,
      58543,
      58601,
      52298,
      12778,
      12817,
      34134,
      40946,
      40947,
      40948,
      33202,
      33200,
      33201,
      42002,
      42783,
      42818,
      31751,
      31999,
      31988,
      31773,
      32011,
      31770,
      31971,
      31772,
      32416,
      32421,
      32689,
      32680,
      32466,
      32516,
      32517,
      32526,
      32525,
      32523,
      32522,
      32681,
      32411,
      32427,
      42015,
      42016,
      42017,
      42018,
      42019,
      42003,
      42004,
      42005,
      42006,
      42007,
      42008,
      42009,
      42010,
      42012,
      42013,
      5214,
      34655,
      34662,
      58288,
      2412,
      41969,
      58199,
      58200,
      58196,
      58197,
      58198,
      58201,
      58195,
      58203,
      43237,
      43123,
      43159,
      48483,
      48560,
      48648,
      43174,
      43172,
      43246,
      39672,
      43235,
      43177,
      43176,
      43226,
      43209,
      43249,
      43178,
      27705,
      27706,
      27709,
      27762,
      27823,
      43180,
      43186,
      43187,
      43190,
      43192,
      43193,
      43194,
      43195,
      43196,
      43248,
      60776,
      2361,
      40949,
      40950,
      2676
   };
   public List<Integer> ad = new ArrayList<>();
   public boolean ae = false;
   public String af = "";
   public static boolean ag = false;
   public static int ah;
   public static int ai;
   public static int aj = 512;
   public static int ak = 334;
   public static int al;
   public List<String> am = new ArrayList<>();
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
   public rs.p_l.C_F_uc aA;
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
   public rs.p_l.C_F_uc aS;
   public rs.p_l.C_F_uc aT;
   private rs.p_l.C_F_uc ig;
   public rs.p_l.C_F_uc aU;
   private int ih = 14;
   public static int aV = 0;
   public static int aW = -1;
   public static int aX = 0;
   public static int aY = 0;
   public static final int[] aZ = new int[]{4540, 4529, 5674, 5667, 5785, 6802, 8072, 4562};
   public static boolean ba = false;
   public static int bb = 0;
   public static int bc = 0;
   public static int bd = 0;
   public static int be = 0;
   public static int bf = 0;
   public static int bg = 0;
   private static long ii = 0L;
   public static long bh = 0L;
   public static long bi = 0L;
   private long ij = 0L;
   private String ik = "";
   public boolean bj = true;
   private rs.p_l.C_F_uc[] il = null;
   private int[] im = null;
   private long in;
   private int io = 1;
   private String ip = "";
   private final long iq = 200L;
   public static rs.p_l.C_K_uc[] bk;
   public int bl;
   public int bm;
   public static C_cc<Boolean> bn = new C_cc();
   public List<rs.p_d.C_q> bo = new ArrayList<>();
   public List<rs.p_d.C_q> bp = new ArrayList<>();
   private rs.p_l.C_F_uc ir;
   private rs.p_l.C_F_uc is;
   private rs.p_l.C_F_uc it;
   private rs.p_l.C_F_uc iu;
   private rs.p_l.C_F_uc iv;
   public int bq;
   public static int br;
   public rs.p_l.C_F_uc bs;
   public boolean bt = false;
   public boolean bu = false;
   public boolean bv = false;
   public boolean bw = false;
   private final rs.p_l.C_l iw = new rs.p_l.C_l();
   private final rs.p_l.C_A_uc ix = new rs.p_l.C_A_uc();
   public int[] bx;
   public static rs.p_r.C_K_uc[] by;
   private ArrayList<rs.p_r.C_a> iy;
   private ArrayList<rs.p_r.C_a> iz;
   public int[] bz = new int[2000];
   public int[] bA = new int[2000];
   public int[] bB = new int[2000];
   public static int bC = -1;
   public static boolean bD = false;
   public static int bE = 0;
   public static int bF = 0;
   public static int bG = 0;
   public static int bH = 0;
   private static final Random iA = new Random();
   private boolean iB = false;
   private long iC;
   public boolean bI;
   private Long[] iD = null;
   private Long[] iE = null;
   private boolean iF = false;
   public static final int[] bJ = new int[]{
      40,
      57,
      58,
      59,
      60,
      61,
      24,
      1,
      64,
      66,
      34,
      52,
      51,
      62,
      67,
      68,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      91,
      92,
      93,
      94,
      95,
      96,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      119,
      120,
      121,
      122,
      123,
      124,
      125,
      126,
      127,
      128,
      129,
      130,
      131,
      132,
      133,
      134,
      135,
      136,
      137,
      138,
      139,
      140,
      141,
      142,
      143,
      144,
      145,
      146,
      147,
      148,
      149,
      150,
      151,
      152,
      153,
      154,
      155,
      156,
      157,
      158,
      159,
      160,
      161,
      162,
      163,
      164,
      165,
      166,
      167,
      168,
      169,
      170,
      171,
      172,
      173,
      174,
      175,
      176,
      177,
      178,
      179,
      180,
      181,
      182,
      183,
      184,
      185,
      186,
      187,
      188,
      189,
      190,
      191,
      192,
      193,
      194,
      195,
      196,
      197,
      198,
      199,
      200,
      201,
      202,
      203,
      204,
      205,
      206,
      207,
      208,
      209,
      210,
      211,
      212,
      213,
      214,
      215,
      216,
      217,
      218,
      219,
      220,
      221,
      222,
      223,
      224,
      225,
      226,
      227,
      228,
      229,
      230,
      231,
      232,
      233,
      234,
      235,
      236,
      237,
      238,
      239,
      240,
      241,
      242,
      243,
      244,
      245,
      246,
      247,
      248,
      249,
      250,
      251,
      252,
      253,
      254,
      255,
      256,
      257,
      258,
      259,
      260,
      261,
      262,
      263,
      264,
      265,
      266,
      267,
      268,
      269,
      270,
      271,
      272,
      273,
      274,
      275,
      276,
      277,
      279,
      280,
      281,
      282,
      283,
      284,
      285,
      286,
      287,
      288,
      289,
      290,
      291,
      292,
      293,
      294,
      295,
      296,
      297,
      298,
      299,
      300,
      301,
      302,
      303,
      304,
      305,
      306,
      307,
      308,
      309,
      310,
      311,
      312,
      313,
      314,
      315,
      316,
      317,
      318,
      319,
      320,
      321,
      322,
      323,
      324,
      325,
      326,
      327,
      328,
      329,
      330,
      331,
      332,
      333,
      334,
      335,
      336,
      337,
      338,
      339
   };
   public static final int[] bK = new int[]{17, 53, 54, 55, 63, 56};
   public static int bL = 0;
   public static int bM = 1;
   public static int bN = 150;
   public static int bO = -1;
   public static int bP = 150;
   public static int bQ = -1;
   public static boolean bR = false;
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
   private final rs.p_m.C_a.a[] iM = rs.p_m.C_a.a();
   private long iN;
   private int iO;
   private final C_Client_mc.a iP = new C_Client_mc.a();
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
   private rs.p_l.C_F_uc iX;
   private rs.p_l.C_F_uc iY;
   private rs.p_l.C_F_uc iZ;
   private rs.p_l.C_F_uc ja;
   private rs.p_l.C_F_uc jb;
   private rs.p_l.C_F_uc jc;
   public static boolean ch = false;
   public static long ci = 0L;
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
   public final int[] cm = new int[]{
      1196,
      1199,
      1206,
      1215,
      1224,
      1231,
      1240,
      1249,
      1258,
      1267,
      1274,
      1283,
      1573,
      1290,
      1299,
      1308,
      1315,
      1324,
      1333,
      1340,
      1349,
      1358,
      1367,
      1374,
      1381,
      1388,
      1397,
      1404,
      1583,
      12038,
      1414,
      1421,
      1430,
      1437,
      1446,
      1453,
      1460,
      1469,
      15878,
      1602,
      1613,
      1624,
      7456,
      1478,
      1485,
      1494,
      1503,
      1512,
      1521,
      1530,
      1544,
      1553,
      1563,
      1593,
      1635,
      12426,
      12436,
      12446,
      12456,
      6004,
      18471,
      19101,
      19111,
      19121,
      19122,
      12940,
      12988,
      13036,
      12902,
      12862,
      13046,
      12964,
      13012,
      13054,
      12920,
      12882,
      13062,
      12952,
      13000,
      13070,
      12912,
      12872,
      13080,
      12976,
      13024,
      13088,
      12930,
      12892,
      13096
   };
   public final int[] cn = new int[]{
      1202,
      1203,
      1209,
      1210,
      1211,
      1218,
      1219,
      1220,
      1227,
      1228,
      1234,
      1235,
      1236,
      1243,
      1244,
      1245,
      1252,
      1253,
      1254,
      1261,
      1262,
      1263,
      1270,
      1271,
      1277,
      1278,
      1279,
      1286,
      1287,
      1293,
      1294,
      1295,
      1302,
      1303,
      1304,
      1311,
      1312,
      1318,
      1319,
      1320,
      1327,
      1328,
      1329,
      1336,
      1337,
      1343,
      1344,
      1345,
      1352,
      1353,
      1354,
      1361,
      1362,
      1363,
      1370,
      1371,
      1377,
      1378,
      1384,
      1385,
      1391,
      1392,
      1393,
      1400,
      1401,
      1407,
      1408,
      1410,
      1417,
      1418,
      1424,
      1425,
      1426,
      1433,
      1434,
      1440,
      1441,
      1442,
      1449,
      1450,
      1456,
      1457,
      1463,
      1464,
      1465,
      1472,
      1473,
      1474,
      1481,
      1482,
      1488,
      1489,
      1490,
      1497,
      1498,
      1499,
      1506,
      1507,
      1508,
      1515,
      1516,
      1517,
      1524,
      1525,
      1526,
      1533,
      1534,
      1535,
      1547,
      1548,
      1549,
      1556,
      1557,
      1558,
      1566,
      1567,
      1568,
      1576,
      1577,
      1578,
      1586,
      1587,
      1588,
      1596,
      1597,
      1598,
      1605,
      1606,
      1607,
      1616,
      1617,
      1618,
      1627,
      1628,
      1629,
      1638,
      1639,
      1640,
      6007,
      6008,
      6011,
      8673,
      8674,
      12041,
      12042,
      12429,
      12430,
      12431,
      12439,
      12440,
      12441,
      12449,
      12450,
      12451,
      12459,
      12460,
      15881,
      15882,
      15885,
      18474,
      18475,
      18478
   };
   private int jl = -1;
   public String co = "";
   private String jm;
   public boolean cp;
   private boolean jn;
   private String jo = "";
   private Map<Integer, String> jp = new HashMap<>();
   private int jq;
   private long jr;
   private int js;
   private String jt;
   public static int cq = 0;
   public static int cr = 0;
   private String[] ju = new String[300];
   long cs = 0L;
   boolean ct = false;
   boolean cu = false;
   private int jv = 0;
   private long jw;
   private long jx;
   private static final int[] jy = new int[]{2459, 2469, 2480, 2492, 14170};
   private static final int[] jz = new int[]{4882, 4887, 4893, 4900, 30700};
   public rs.p_h.C_d cv = new rs.p_h.C_d(this);
   private final long jA = 0L;
   private Map<Integer, rs.p_x.C_d> jB = new HashMap<>();
   public static int cw;
   private static final ArrayList<Integer> jC = new ArrayList<>();
   public static final ArrayList<String> cx = new ArrayList<>();
   public static final int[] cy = new int[]{0, 0, 0, 0, 0, 0, 0};
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
   public static int cI = -1;
   public static int cJ;
   public static int cK;
   public static int cL;
   public static int cM = -1;
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
   private rs.p_l.C_F_uc kg;
   private rs.p_l.C_F_uc kh;
   public rs.p_l.C_F_uc cU;
   public rs.p_l.C_F_uc cV;
   public rs.p_l.C_F_uc cW;
   public rs.p_l.C_F_uc cX;
   public int cY = 0;
   private rs.p_l.C_F_uc ki;
   private rs.p_l.C_F_uc kj;
   public rs.p_l.C_F_uc cZ;
   public rs.p_l.C_F_uc da;
   public rs.p_l.C_F_uc db;
   public rs.p_l.C_F_uc dc;
   public rs.p_l.C_F_uc dd;
   public rs.p_l.C_F_uc[] de = new rs.p_l.C_F_uc[21];
   public rs.p_l.C_F_uc[] df = new rs.p_l.C_F_uc[20];
   private rs.p_l.C_F_uc[] kk = new rs.p_l.C_F_uc[2];
   private rs.p_l.C_F_uc kl;
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
   private rs.p_l.C_F_uc kT;
   private rs.p_l.C_F_uc kU;
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
   public rs.p_l.C_F_uc[] dG;
   public int dH;
   private int lc;
   private int ld;
   public int dI;
   public int dJ;
   private long le;
   private boolean lf;
   private long[] lg;
   private int lh;
   public static int dK = 10;
   public static int dL;
   public static boolean dM = true;
   private static boolean li;
   private volatile boolean lj;
   public int dN;
   public int dO;
   private final int[] lk = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
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
   public rs.p_l.C_F_uc[] dS;
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
   private rs.p_l.C_F_uc lK;
   private final int lL;
   public static final int[][] dU = new int[][]{
      {6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193},
      {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239},
      {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003},
      {4626, 11146, 6439, 12, 4758, 10270},
      {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 491769, 10, 17050, 1, 491770, 130770, 374770, 926, 76770, 34770, 2, 3, 6, 4, 5, 123770}
   };
   public static final int[][] dV = new int[][]{{2, 40}, {3, 56}, {6, 60}, {4, 62}, {5, 54}};
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
   private static final int[] lU = new int[99];
   private int lV;
   private int lW;
   public static int ee;
   private rs.p_l.C_F_uc lX;
   private rs.p_l.C_F_uc lY;
   public int ef;
   private rs.p_l.C_F_uc lZ;
   private rs.p_l.C_a ma;
   private rs.p_l.C_F_uc mb;
   private rs.p_l.C_F_uc mc;
   public final int[] eg;
   private boolean md;
   private rs.p_l.C_F_uc[] me;
   public static int eh;
   public static int ei;
   public static int ej = -1;
   public static String ek = null;
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
   public static rs.p_cache.C_d ew;
   private int mx;
   private int my;
   private int mz;
   private int[] mA;
   private int[] mB;
   private rs.p_l.C_F_uc mC;
   private rs.p_l.C_F_uc mD;
   private rs.p_l.C_F_uc mE;
   private rs.p_l.C_F_uc mF;
   private rs.p_l.C_F_uc mG;
   private rs.p_l.C_F_uc mH;
   private rs.p_l.C_F_uc mI;
   private rs.p_l.C_F_uc mJ;
   private rs.p_l.C_F_uc mK;
   private rs.p_l.C_F_uc mL;
   private rs.p_l.C_F_uc mM;
   private rs.p_l.C_F_uc mN;
   private rs.p_l.C_F_uc mO;
   private rs.p_l.C_F_uc mP;
   private rs.p_l.C_F_uc mQ;
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
   private rs.p_l.C_F_uc[] mW;
   public rs.p_l.C_F_uc[] eK;
   public rs.p_l.C_F_uc[] eL;
   private rs.p_l.C_F_uc[] mX;
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
   private rs.p_l.C_F_uc ng;
   public static rs.p_a.C_k eR;
   private final String[] nh;
   private final boolean[] ni;
   public final int[][][] eS;
   public static final int[] eT = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   public int eU;
   private int nj;
   public int eV;
   private static int nk;
   public int eW;
   private int nl;
   private int nm;
   private String nn;
   private rs.p_l.C_F_uc[] no;
   private boolean np;
   public static int eX;
   private rs.p_l.C_a nq;
   private rs.p_l.C_a nr;
   private rs.p_l.C_a ns;
   private rs.p_l.C_a nt;
   private rs.p_l.C_a nu;
   public int eY;
   public boolean eZ;
   public rs.p_l.C_F_uc[] fa;
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
   private static final String nB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
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
   public static String fn = "";
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
   public rs.p_l.C_F_uc fw;
   private rs.p_l.C_a nT;
   private rs.p_l.C_F_uc nU;
   public String[] fx;
   private rs.p_l.C_F_uc nV;
   private rs.p_l.C_F_uc nW;
   public final int[] fy;
   public static final int[] fz = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
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
   public static rs.p_l.C_F_uc[] fE;
   public rs.p_l.C_F_uc fF;
   public rs.p_l.C_F_uc fG;
   public rs.p_l.C_F_uc fH;
   public rs.p_l.C_F_uc fI;
   public rs.p_l.C_F_uc fJ;
   public rs.p_l.C_F_uc fK;
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
   public C_f[] fP;
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
   private rs.p_l.C_F_uc oA;
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

   public void a(boolean var1) {
      File var2 = new File(rs.p_v.C_a.f() + "rsimg/");
      var2.mkdir();
      var2 = new File(rs.p_v.C_a.f() + "rsimg/dump/");
      var2.mkdir();
      int[] var10000 = new int[]{13072, 13073};

      for (int var4 = 10000; var4 < 30000; var4++) {
         rs.p_d.C_k var5 = rs.p_d.C_k.f(var4);
         if (var5 != null && var5.w != null && !var5.w.equalsIgnoreCase("Dwarf remains")) {
            Image var6 = rs.p_d.C_k.a(var4, 0);
            if (var6 != null) {
               a(var6, var1 ? rs.p_d.C_k.f(var4).w : Integer.toString(var4));
            }
         }
      }
   }

   public void a(int var1) {
      File var2 = new File(rs.p_v.C_a.f() + "rsimg/");
      var2.mkdir();
      var2 = new File(rs.p_v.C_a.f() + "rsimg/dump/");
      var2.mkdir();
      rs.p_d.C_k var3 = rs.p_d.C_k.f(var1);
      if (var3 != null && var3.w != null && !var3.w.equalsIgnoreCase("Dwarf remains")) {
         Image var4 = rs.p_d.C_k.a(var1, 0);
         if (var4 != null) {
            a(var4, Integer.toString(var1));
         }
      }
   }

   public static void a(File var0) {
      if (var0.exists()) {
         File[] var1 = var0.listFiles();

         for (File var5 : var1) {
            if (var5.isDirectory()) {
               a(var5);
            } else {
               var5.delete();
            }
         }

         var0.delete();
      }
   }

   public static void a(Image var0, String var1) {
      BufferedImage var2 = a(var0);

      try {
         File var3 = new File("./rsimg/" + var1 + ".png");
         ImageIO.write(var2, "png", var3);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static int a(int var0, int var1) {
      return var0 >= 2940 && var0 <= 3390 && var1 >= 3521 && var1 <= 3972 ? (int)Math.ceil((double)(var1 - 3520) / 8.0) : 0;
   }

   public void a(int var1, int var2, String var3, String var4, String var5, int[] var6) {
      if (C_C_uc.hP != -1 && C_C_uc.hP != -1) {
         if (var3 != null) {
            if (ch && cH != C_ba.c && System.currentTimeMillis() - this.ij >= 1000L) {
               ap = "::wikiarticle " + var4;
               this.jr = System.currentTimeMillis();
               this.ij = System.currentTimeMillis();
            }

            var3 = var3 + "\nPress @or2@CTRL@whi@ " + var5;
            int var7 = 3;
            var3 = var3 + "\n";
            String[] var9 = var3.split("\n");
            int var10 = var9.length * 16 + 3 + 35;
            int var11 = 0;
            String var12 = var9[0]
               .replace("@gre@", "")
               .replace("@whi@", "")
               .replace("@cya@", "")
               .replace("@or1@", "")
               .replace("@or2@", "")
               .replace("@or3@", "")
               .replace("@yel@", "");
            var11 = (int)Math.floor((double)gl.c(var12)) + 20;

            for (int var13 = 1; var13 < var9.length; var13++) {
               if (var11 <= gl.c(var9[var13].replace("@or1@", "").replace("@whi@", "").replace("@cya@", "").replace("@or2@", "").replace("@or3@", "")) + 6) {
                  var11 = gl.c(var9[var13].replace("@or1@", "").replace("@whi@", "").replace("@cya@", "").replace("@or2@", "").replace("@or3@", "")) + 6;
               }
            }

            var7 = var11 / 40;
            if (var7 < 3) {
               var7 = 3;
            }

            int var25 = var7 * 40 + 18;
            if (var11 < var25) {
               var11 = var25;
            }

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a && cH == 3824 && hQ <= 112) {
               var2 = hQ + var10 + 10;
               var1 = hP - 10;
            }

            var1 -= var11 / 2;
            var2 -= var10;
            int var14 = var2;
            if (var1 < 5) {
               var1 = 5;
            }

            if (var2 < 0) {
               var2 = 0;
            }

            rs.p_l.C_c.b(var10, var2, var1, 4077096, var11, 200);
            if (this.il == null || !this.ip.equals(var3) || System.currentTimeMillis() - this.in >= 200L) {
               this.il = new rs.p_l.C_F_uc[var7];
               this.im = new int[var7];
               if (this.io >= var6.length) {
                  this.io = 1;
               }

               int var15 = this.io;

               for (int var16 = 0; var16 < var7; var16++) {
                  if (var15 >= var6.length) {
                     var15 = 0;
                  }

                  this.il[var16] = rs.p_d.C_k.a(var6[var15], 0, 0, 32);
                  this.im[var16] = var6[var15];
                  var15++;
               }

               this.ip = var3;
               this.io++;
               this.in = System.currentTimeMillis();
            }

            this.aU.c(var1 + var11 - 14, var2 + 3);
            var2 += 14;
            int var26 = 16777215;

            for (int var27 = 0; var27 < var9.length; var27++) {
               if (var27 == 0) {
                  gl.b(var9[var27], var1, var2, var26, 0);
               } else {
                  gl.b(" " + var9[var27], var1, var2, 16777215, 0);
               }

               var2 += 16;
            }

            var2 -= 10;
            rs.p_l.C_c.b(var10 - (var2 - var14), var2, var1, 2367511, var11, 100);
            if (this.il != null) {
               for (int var28 = 0; var28 < this.il.length; var28++) {
                  if (this.il[var28] == null) {
                     this.il[var28] = rs.p_d.C_k.a(this.im[var28], 0, 0, 32);
                  }

                  if (this.il[var28] != null) {
                     this.il[var28].f(17 + var1 + var28 * 35, var2);
                  }
               }
            }

            rs.p_l.C_c.d(var1, var11, var10, 5918522, var14);
            byte var29 = 1;
            rs.p_l.C_c.d(var1 - var29, var11 + var29 * 2, var10 + var29 * 2, 2367511, var14 - var29);
         }
      }
   }

   public void a(int var1, int var2, String var3, String var4) {
      if (C_C_uc.hP != -1 && C_C_uc.hP != -1) {
         if (var3 != null) {
            if (rs.p_s.p_s.C_b.o) {
               if (ch && cH != C_ba.c && System.currentTimeMillis() - this.ij >= 1000L) {
                  ap = "::wikiarticle " + var4;
                  this.jr = System.currentTimeMillis();
                  this.ij = System.currentTimeMillis();
               }

               var3 = var3 + (ch ? "\nLoading, please wait.." : "\nPress @or2@CTRL@whi@ to view guide");
               this.ik = var4;
               rs.p_l.p_f.p_a.p_j.C_a var5 = new rs.p_l.p_f.p_a.p_j.C_a(var3, true);
               var5.b(true);
               rs.p_l.p_f.C_e.d().f().a(var5);
            }
         }
      }
   }

   public void a(int var1, int var2, String var3) {
      if (C_C_uc.hP != -1 && C_C_uc.hP != -1) {
         if (var3 != null) {
            rs.p_l.p_f.C_e.d().f().a(var3, true);
         }
      }
   }

   public void a(int var1, int var2, String var3, String[] var4, boolean var5) {
      if (C_C_uc.hP != -1 && C_C_uc.hP != -1) {
         if (var3 != null) {
            rs.p_l.p_f.p_a.p_j.C_a var6 = new rs.p_l.p_f.p_a.p_j.C_a(var3, true);
            var6.a(var4);
            rs.p_l.p_f.C_e.d().f().a(var6);
         }
      }
   }

   public C_Q_uc a(int var1, int var2, int var3, int var4) {
      C_H_uc var5 = this.dF.i[var3][var1][var2];
      if (var5 == null) {
         return null;
      } else if (var5.j != null && var5.j.m == var4) {
         return var5.j;
      } else if (var5.k != null && var5.k.m == var4) {
         return var5.k;
      } else if (var5.l != null && var5.l.m == var4) {
         return var5.l;
      } else {
         for (int var6 = 0; var6 < var5.n; var6++) {
            if (var5.o[var6].m == var4) {
               return var5.o[var6];
            }
         }

         return null;
      }
   }

   public void b(int var1, int var2, String var3) {
      if (!this.bj || C_C_uc.hP != -1 && C_C_uc.hP != -1) {
         if (var3 != null) {
            rs.p_l.p_f.C_e.d().f().a(var3, true);
         }
      }
   }

   public void a(int var1, int var2, String var3, int[] var4) {
      if (C_C_uc.hP != -1 && C_C_uc.hP != -1) {
         if (var3 != null) {
            rs.p_l.p_f.p_a.p_j.C_a var5 = new rs.p_l.p_f.p_a.p_j.C_a(var3, true);
            var5.a(var4);
            rs.p_l.p_f.C_e.d().f().a(var5);
         }
      }
   }

   public static BufferedImage a(Image var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(null), var0.getHeight(null), 2);
      Graphics2D var2 = var1.createGraphics();
      var2.drawImage(var0, 0, 0, null);
      var2.dispose();
      return var1;
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = this.bl - 6;
      int var9 = this.bm - 6;
      int var10 = var1 - var8 * 8;
      int var11 = var2 - var9 * 8;
      byte var12 = 10;
      int var13 = this.nJ[var12];
      if (var11 > 0 && var11 < 103 && var10 > 0 && var10 < 103) {
         if (b(var1, var2, var6)) {
            this.a(-1, -1, var4, var13, var11, var5, var6, var10, 0);
         } else {
            this.a(-1, var3, var4, var13, var11, var5, var6, var10, 0, var7);
         }
      }
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, var6, false);
   }

   public void a() {
      rs.p_x.C_f var1 = this.a(3, "kw_interface", "kw_interface", this.eE[3], 35);
      rs.p_x.C_f var2 = this.a(4, "2d graphics", "media", this.eE[4], 40);
      rs.p_l.C_K_uc[] var3 = new rs.p_l.C_K_uc[]{gh, this.gi, gj, this.gk};
      rs.p_n.C_e.a(var1, var3, var2);
      fb = true;
   }

   public void b() {
      for (int var1 = 0; var1 < rs.p_d.C_k.y.length; var1++) {
         rs.p_d.C_k.y[var1] = new rs.p_d.C_k();
      }

      if (rs.p_f.C_a.aj) {
         rs.p_d.C_a.a = rs.p_d.C_a.c;
      } else {
         rs.p_d.C_a.a = rs.p_d.C_a.b;
      }

      rs.p_a.C_h.a(ew.j(), ew);
      rs.p_x.C_f var4 = this.a(2, "config", "config", this.eE[2], 30);
      rs.p_d.C_d.z = new rs.p_d.C_d[20];

      for (int var2 = 0; var2 < 20; var2++) {
         rs.p_d.C_d.z[var2] = new rs.p_d.C_d();
      }

      rs.p_d.C_r.J.a();
      rs.p_d.C_r.K.a();
      rs.p_d.C_r.L.a();
      rs.p_d.C_r.M.a();
      rs.p_d.C_r.N.a();
      rs.p_d.C_r.O.a();
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

      for (int var5 = 0; var5 < 20; var5++) {
         rs.p_d.C_d.z[var5] = new rs.p_d.C_d();
      }

      rs.p_d.C_k.a(var4, rs.p_f.C_a.aj);
      rs.p_d.C_j.a(var4);
      if (eR.aT != null) {
         eR.aT = rs.p_d.C_d.c(eR.ay);
      }

      for (int var6 = 0; var6 < this.cB; var6++) {
         rs.p_a.C_j var3 = this.cA[this.cC[var6]];
         if (var3.aG != null) {
            var3.aG = rs.p_d.C_d.c((int)var3.aG.x);
         }
      }

      ee = 1;
      fb = true;
   }

   public long c() {
      if (this.eN == 0L) {
         return 0L;
      } else {
         long var1 = this.eN - System.currentTimeMillis();
         return var1 < 0L ? 0L : var1;
      }
   }

   public void d() {
      this.b(false);
   }

   public void b(boolean var1) {
      for (int var2 = 0; var2 < rs.p_d.C_k.y.length; var2++) {
         rs.p_d.C_k.y[var2] = new rs.p_d.C_k();
      }

      if (!rs.p_f.C_a.bs) {
         if (rs.p_f.C_a.aj) {
            rs.p_d.C_a.a = rs.p_d.C_a.c;
         } else {
            rs.p_d.C_a.a = rs.p_d.C_a.b;
         }
      }

      rs.p_a.C_h.a(ew.j(), ew);
      if (this.cd) {
         rs.p_x.C_f var4 = this.a(2, "config", "config", this.eE[2], 30);
         if (var4 != null) {
            rs.p_d.C_k.a(var4, rs.p_f.C_a.aj);
            rs.p_d.C_j.a(var4);
         }
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

      for (int var5 = 0; var5 < 20; var5++) {
         rs.p_d.C_d.z[var5] = new rs.p_d.C_d();
      }

      if (eR != null && eR.aT != null) {
         eR.aT = rs.p_d.C_d.c(eR.ay);
      }

      for (int var6 = 0; var6 < this.cB; var6++) {
         rs.p_a.C_j var3 = this.cA[this.cC[var6]];
         if (var3.aG != null) {
            var3.aG = rs.p_d.C_d.c((int)var3.aG.x);
         }
      }

      if (this.cc) {
         ee = 1;
         fb = true;
      }
   }

   public void c(boolean var1) {
      File var2 = new File(rs.p_v.C_a.f() + "raw/");
      if (var2.exists()) {
         File[] var3 = new File(rs.p_v.C_a.f() + "raw/").listFiles();

         for (File var7 : var3) {
            String var8 = var7.getName().replace(".dat", "");
            int var9 = Integer.parseInt(var8);
            bn.a(var9, true);
         }
      }
   }

   public static final byte[] a(String var0) {
      try {
         File var1 = new File(var0);
         int var2 = (int)var1.length();
         byte[] var3 = new byte[var2];
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(var0)));
         var4.readFully(var3, 0, var2);
         var4.close();
         return var3;
      } catch (Exception var5) {
         return null;
      }
   }

   public void e() {
      rs.p_v.C_a.a.c();
   }

   private void a(boolean var1, double var2) {
      rs.p_v.C_a.a(var2);
      if (var1) {
         rs.p_v.C_a.j = "voladjust";
      }
   }

   public void a(int var1, boolean var2) {
      if (this.nv) {
         if (this.lh != var1 || var2) {
            this.oi = var1;
            this.oj = !var2;
            ew.a(2, this.oi);
         }
      }
   }

   private boolean y(int var1) {
      if (var1 < 0) {
         return false;
      } else {
         int var2 = this.eI[var1];
         if (var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 337;
      }
   }

   public boolean f() {
      return this.bw ? true : this.cD != null || this.gb || this.fN > 0 && this.fN != 25 && this.fN != 31 || this.en != -1 || this.gp != -1;
   }

   public String b(String var1) {
      return this.ix.c(this.iw.c(var1));
   }

   public void g() {
      rs.p_l.C_q.a();
      int var1 = !ai() ? 338 : ah - 165;
      rs.p_l.C_E_uc.x = this.fo;
      if (!this.f() && this.v.h()) {
         this.is.f(0, var1 + 136);
         if (aj()) {
            this.it.f(0, var1);
         }

         this.v.b();
         rs.p_l.C_E_uc.x = this.fq;
         rs.p_l.C_q.b();
      } else {
         this.ir.f(0, var1);
         this.v.b();
         if (this.gb) {
            this.gn.c(this.eQ, 259, 60 + var1, 0, -1);
            this.gn.c(this.fB + "*", 259, 80 + var1, 128, -1);
         } else if (this.fN == 1) {
            this.gn.c(this.dW, 259, 60 + var1, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + var1, 128, -1);
         } else if (this.fN == 2) {
            this.gn.c(this.dX, 259, 60 + var1, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + var1, 128, -1);
         } else if (this.fN == 3) {
            this.gn.c("Enter the item's name (or part of it) to search:", 259, 60 + var1, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + var1, 128, -1);
         } else if (this.fN == 4) {
            this.gn.c("Enter the amount you'd like to spawn:", 259, var1 + 60, 0, -1);
            this.gn.c(this.dY + "*", 259, 80 + var1, 128, -1);
         } else if (this.fN == 6 && this.q.c() != null) {
            this.q.c().c().c(this.q.c().f(), 259, var1 + 60, 0, -1);
            this.q.c().d().c(this.q.c().c(this.dY) + "*", 259, 80 + var1, 128, -1);
         } else if (this.cD != null) {
            this.gn.c(this.cD, 259, 60 + var1, 0, -1);
            this.gn.c("Click to continue", 259, 80 + var1, 128, -1);
         } else if (this.gp != -1) {
            this.a(0, 20, rs.p_n.C_e.H[this.gp], 20 + var1);
            if (this.gp == 6179 && cH == C_aD_mc.bI && (rs.p_n.C_e.H[6181].at == null || !rs.p_n.C_e.H[6181].at.contains("Unlocked!"))) {
               short var2 = 385;
               byte var3 = 15;
               short var4 = 0;
               if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
                  var4 = 340;
               }

               if (hP >= var2 && hP <= var2 + 120 && hQ >= var3 + var1 + var4 && hQ <= var3 + var1 + 34 + var4) {
                  C_aD_mc.g.c(var2, var3 + var1);
               } else {
                  C_aD_mc.f.c(var2, var3 + var1);
               }

               this.gm.c("        Purchase", var2 + 59, var3 + 21 + var1, 16750623, -1);
            }
         } else if ((double)this.en != -1.0) {
            this.a(0, 20, rs.p_n.C_e.H[this.en], 20 + var1);
         } else {
            rs.p_l.C_K_uc var13 = this.gi;
            int var14 = 0;
            rs.p_l.C_c.c(122 + var1, 8, 497, 7 + var1);

            for (int var15 = 0; var15 < 200; var15++) {
               if (this.dC[var15] != null) {
                  int var5 = this.dz[var15];
                  boolean var6 = this.dD[var15];
                  String var7 = this.dB[var15];
                  int var8 = this.dA[var15];
                  int var9 = 70 - (var14 - 3) * 14 + eD + 5;
                  byte var10 = 0;
                  byte var11 = 0;
                  if (var8 == 18 || var8 == 1 || var8 == 9 || var8 == 28) {
                     var10 = 1;
                     var11 = -1;
                  }

                  if (var8 == 94) {
                     var11 = -1;
                  }

                  if (var5 == rs.p_i.C_a.j
                     && (this.fi == rs.p_i.C_a.h || this.fi == rs.p_i.C_a.b)
                     && (this.gx == rs.p_i.C_a.v || this.gx == rs.p_i.C_a.z && !var6)) {
                     if (var9 > 0 && var9 < 210) {
                        this.gm.b(this.dC[var15], 11, var9 + var1, 0, -1);
                     }

                     var14++;
                  }

                  if (var5 == rs.p_i.C_a.s
                     && (this.fi == rs.p_i.C_a.i || this.fi == rs.p_i.C_a.b || this.fi == rs.p_i.C_a.h && !var6)
                     && (this.gv == rs.p_i.C_a.v || !var6)) {
                     if (var9 > 0 && var9 < 210) {
                        this.gm.b(this.dC[var15], 11, var9 + var1, 0, -1);
                     }

                     var14++;
                  }

                  if (var5 == rs.p_i.C_a.u && (this.fi == rs.p_i.C_a.f || this.fi == rs.p_i.C_a.b) && (this.gw == rs.p_i.C_a.v || !var6)) {
                     if (var9 > 0 && var9 < 210) {
                        this.gm.b(this.dC[var15], 11, var9 + var1, 0, -1);
                     }

                     var14++;
                  }

                  if (var5 == rs.p_i.C_a.t && (this.fi == rs.p_i.C_a.g || this.fi == rs.p_i.C_a.b) && (this.gy == rs.p_i.C_a.v || !var6)) {
                     if (var9 > 0 && var9 < 210) {
                        this.gm.b(this.dC[var15], 11, var9 + var1, 0, -1);
                     }

                     var14++;
                  }

                  if ((var5 == rs.p_i.C_a.k || var5 == rs.p_i.C_a.l)
                     && (this.gu == rs.p_i.C_a.v || this.gu == rs.p_i.C_a.w && this.i(var7))
                     && (this.fi == rs.p_i.C_a.c || this.fi == rs.p_i.C_a.b)) {
                     if (var9 > 0 && var9 < 210) {
                        int var12 = 11;
                        if (var8 > 0 && var8 < fE.length) {
                           fE[rs.p_l.C_h.b(var8)].f(var12 + var11, var9 - 12 + var1 + var10);
                           var12 += 14;
                           if (rs.p_l.C_j.b.w_(var8)) {
                              var12 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(var8)).j();
                           }
                        }

                        this.gm.b(var7, var12, var9 + var1, 0, -1);
                        this.gm.b(":", var12 + this.gm.c(var7), var9 + var1, 0, -1);
                        this.gm.b(this.dC[var15], var12 + this.gm.c(var7) + 6, var9 + var1, 255, -1);
                     }

                     var14++;
                  }

                  if ((var5 == rs.p_i.C_a.p || var5 == rs.p_i.C_a.q)
                     && (this.nS == 0 || this.fi == rs.p_i.C_a.d)
                     && (var5 == rs.p_i.C_a.p || this.cE == 0 || this.cE == 1 && this.i(var7))) {
                     if (var9 > 0 && var9 < 210) {
                        int var23 = 11;
                        var13.b(0, "From", var9 + var1, var23);
                        var23 += var13.a("From ");
                        if (var8 > 0 && var8 < fE.length) {
                           fE[rs.p_l.C_h.b(var8)].f(var23 + var11, var9 - 12 + var1 + var10);
                           var23 += 14;
                        }

                        var13.b(0, var7 + ":", var9 + var1, var23);
                        var23 += var13.a(var7) + 8;
                        var13.b(8388608, this.dC[var15], var9 + var1, var23);
                     }

                     var14++;
                  }

                  if (var5 == rs.p_i.C_a.o && (this.nS == 0 || this.fi == 2) && this.cE < 2) {
                     if (var9 > 0 && var9 < 210) {
                        var13.b(0, "To " + var7 + ":", var9 + var1, 11);
                        var13.b(8388608, this.dC[var15], var9 + var1, 17 + var13.a("To " + var7));
                     }

                     var14++;
                  }

                  if (var5 == rs.p_i.C_a.m && this.nS == 0 && this.cE < 2) {
                     if (var9 > 0 && var9 < 210) {
                        var13.b(8388608, this.dC[var15], var9 + var1, 11);
                     }

                     var14++;
                  }

                  if (var5 == rs.p_i.C_a.n && (this.fZ == 0 || this.fZ == 1 && this.i(var7))) {
                     if (var9 > 0 && var9 < 210) {
                        this.gm.b(var7 + " " + this.dC[var15], 11, var9 + var1, 8388736, -1);
                     }

                     var14++;
                  }

                  if (var5 == rs.p_i.C_a.r && (this.fZ == 0 || this.fZ == 1 && this.i(var7))) {
                     if (var9 > 0 && var9 < 210) {
                        var13.b(8270336, var7 + " " + this.dC[var15], var9 + var1, 11);
                     }

                     var14++;
                  }
               }
            }

            this.gZ.a();
            fA = var14 * 14 + 7;
            if (fA < 111) {
               fA = 111;
            }

            this.b(114, fA - eD - 113, 7 + var1, 496, fA);
            String var16;
            if (eR != null && eR.o() != null) {
               var16 = eR.d(true);
            } else {
               var16 = C_O_uc.c(this.fk);
            }

            rs.p_l.C_c.c(140 + var1, 8, 509, 120 + var1);
            int var17 = 0;
            if (cT > 0) {
               int var18 = 0;
               int var20 = cT;
               if (cT == 1) {
                  var20 = 0;
               }

               if (cT == 2) {
                  var20 = 1;
               }

               int var22 = 0;
               if (var20 == 94) {
                  var22 = -1;
               }

               if (rs.p_l.C_j.b.w_(var20)) {
                  var22 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(var20)).i();
                  var18 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(var20)).h();
               }

               fE[rs.p_l.C_h.b(var20)].f(10 + var18, 122 + var1 + var22);
               if (rs.p_l.C_j.b.w_(var20)) {
                  var17 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(var20)).j();
               }

               var17 += 14;
            }

            boolean var19 = false;
            int var21 = var19 ? 0 : -1;
            this.gm.b(var16, var17 + 11, 133 + var1, var19 ? 16777215 : 0, var21);
            this.gm.b(":", var17 + 11 + this.gm.c(var16), 133 + var1, var19 ? 16777215 : 0, var21);
            if (this.dl != null) {
               this.gm.b(this.dl, var17 + 11 + this.gm.c(var16) + 6, 133 + var1, 0, var21);
            } else {
               this.gm.b(dk, var17 + 11 + this.gm.c(var16) + 6, 133 + var1, var19 ? 16777215 : 255, var21);
               this.gm.b("*", var17 + 11 + this.gm.c(var16) + 6 + 1 + this.gm.c(dk), 133 + var1, var19 ? 16777215 : 255, var21);
            }

            rs.p_l.C_c.b(7, 121 + var1, 506, var19 ? 5723991 : 8418912);
            this.gZ.a();
         }

         rs.p_l.C_E_uc.x = this.fq;
         rs.p_l.C_q.b();
      }
   }

   @Override
   public void init() {
      try {
         dK = 10;
         dL = 0;
         aa();
         dM = true;
         rs.p_v.C_a.d = 32;
         rs.p_v.C_a.a(InetAddress.getLocalHost());
         this.n(503, 765);
      } catch (Exception var2) {
      }
   }

   @Override
   public void a(Runnable var1, int var2) {
      if (var2 > 10) {
         var2 = 10;
      }

      if (rs.p_v.C_a.h != null) {
         rs.p_v.C_a.a(var1, var2);
      } else {
         super.a(var1, var2);
      }
   }

   public Socket b(int var1) {
      return new Socket(InetAddress.getByName(rs.p_f.C_a.j), var1);
   }

   public void a(rs.p_f.C_a.c var1) {
      oT = null;
      if (var1 == rs.p_f.C_a.c.a) {
         ai = 765;
         ah = 503;
         boolean var2 = rs.p_k.C_e.a() && this.az();
         int var3 = var2 ? rs.p_k.C_b.g : 765;
         int var4 = var2 ? rs.p_k.C_b.h : 503;
         SwingUtilities.invokeLater(() -> {
            C_Launcher_mc.n().p().a(var3, var4);
            C_Launcher_mc.n().p().m().pack();
         });
         al = 600;
      } else if (var1 == rs.p_f.C_a.c.b) {
         ai = 821;
         ah = 624;
         SwingUtilities.invokeLater(() -> {
            C_Launcher_mc.n().p().a(1198, 624, 821, 624);
            C_Launcher_mc.n().p().m().repaint();
         });
         al = 300;
      } else if (var1 == rs.p_f.C_a.c.c) {
         ai = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
         ah = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
         al = 600;
      }

      this.a(var1, ai, ah);
   }

   public void a(rs.p_f.C_a.c var1, int var2, int var3) {
      try {
         aj = var1 == rs.p_f.C_a.c.a ? 512 : var2;
         ak = var1 == rs.p_f.C_a.c.a ? 334 : var3;
         ai = var2;
         ah = var3;
         this.a(var1 == rs.p_f.C_a.c.c, var2, var3, var1 == rs.p_f.C_a.c.b, var1 != rs.p_f.C_a.c.a);
         this.i();
         this.j();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void h() {
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         int var1 = this.B().getWidth();
         int var2 = this.B().getHeight();
         if (var1 < 1) {
            var1 = 1;
         }

         if (var2 < 1) {
            var2 = 1;
         }

         if (ai != var1 || ah != var2) {
            if (ai != var1) {
               ai = var1;
               aj = ai;
            }

            if (ah != var2) {
               ah = var2;
               ak = ah;
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
      int var1 = ai;
      int var2 = ah;
      rs.p_l.C_E_uc.a(var1, var2);
      this.bx = rs.p_l.C_E_uc.x;
      this.fo = rs.p_l.C_E_uc.x;
      this.fp = rs.p_l.C_E_uc.x;
      rs.p_l.C_E_uc.x = new int[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         rs.p_l.C_E_uc.x[var3] = var1 * var3;
      }

      this.fq = rs.p_l.C_E_uc.x;
      if (this.fc) {
         this.gZ = new rs.p_l.C_C_uc(this.av(), this.aw(), this.B());
      }
   }

   @Override
   public void j() {
      if (aj()) {
         if (this.v != null && this.v.h()) {
            ak = 469;
         } else {
            ak = 334;
         }
      }

      rs.p_l.C_E_uc.s = this.at() / 2;
      rs.p_l.C_E_uc.t = this.as() / 2;
      if (!rs.p_k.C_e.a()) {
         C_V_uc.d(500, 800, aj, ak);
      }
   }

   public static void a(rs.p_r.C_a var0) {
      by[var0.d().w()].b().add(var0);
   }

   private void bm() {
      if (this.eA == 0) {
         int var1 = super.hU;
         if (var1 != 1 || !rs.p_l.C_q.a(this, super.hV, super.hW)) {
            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a && this.eW == 1 && super.hV >= 516 && super.hW >= 160 && super.hV <= 765 && super.hW <= 205) {
               var1 = 0;
            }

            if ((cH == 35000 || this.gp == 35112) && br != 35062 && var1 == 1 && br != 35079) {
               C_ai.m(-1);
            }

            if (cH == C_aD_mc.bI && var1 == 1) {
               short var2 = 385;
               byte var3 = 15;
               int var4 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : ah - 165;
               short var5 = 0;
               if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
                  var5 = 340;
               }

               if (hP >= var2 && hP <= var2 + 120 && hQ >= var3 + var4 + var5 && hQ <= var3 + var4 + 34 + var5) {
                  fv.a(185);
                  fv.d(65313);
               }
            }

            if (dj) {
               if (var1 != 1) {
                  int var12 = C_C_uc.hP;
                  int var16 = C_C_uc.hQ;
                  if (this.dH == 0) {
                     var12 -= 4;
                     var16 -= 4;
                  }

                  if (this.dH == 1) {
                     var12 -= 553;
                     var16 -= 205;
                  }

                  if (this.dH == 2) {
                     var12 -= 5;
                     var16 -= 338;
                  }

                  if (this.dH == 3) {
                     var12 -= 516;
                     var16 += 0;
                  }

                  if (var12 < this.lc - 10 || var12 > this.lc + this.dI + 10 || var16 < this.ld - 10 || var16 > this.ld + this.dJ + 10) {
                     boolean var19 = false;
                     if (this.r.b()) {
                        var19 = this.r.c().a();
                     }

                     if (!var19) {
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

               if (var1 == 1) {
                  int var13 = this.lc;
                  int var17 = this.ld;
                  int var20 = this.dI;
                  int var22 = super.hV;
                  int var24 = super.hW;
                  switch (this.dH) {
                     case 0:
                        var22 -= 4;
                        var24 -= 4;
                        break;
                     case 1:
                        var22 -= 519;
                        var24 -= 168;
                        break;
                     case 2:
                        var22 -= 5;
                        var24 -= 338;
                        break;
                     case 3:
                        var22 -= 519;
                        var24 += 0;
                  }

                  int var25 = -1;

                  for (int var26 = 0; var26 < this.eV; var26++) {
                     int var9 = var17 + 31 + (this.eV - 1 - var26) * 15;
                     if (var22 > var13 && var22 < var13 + var20 && var24 > var9 - 13 && var24 < var9 + 3) {
                        var25 = var26;
                     }
                  }

                  if (var25 != -1) {
                     this.D(var25);
                  } else if (this.r.b() && this.r.c().a()) {
                     rs.p_j.p_b.C_b var27 = this.r.c().b();
                     if (var27 != null) {
                        var27.b().invoke();
                     }
                  }

                  dj = false;
                  if (this.dH == 1) {
                     fb = true;
                  }

                  if (this.dH == 2) {
                     fM = true;
                  }
               }
            } else {
               if (var1 == 1 && this.eV > 0) {
                  int var10 = this.eI[this.eV - 1];
                  if (var10 == 632
                     || var10 == 78
                     || var10 == 867
                     || var10 == 431
                     || var10 == 53
                     || var10 == 74
                     || var10 == 454
                     || var10 == 539
                     || var10 == 638
                     || var10 == 493
                     || var10 == 847
                     || var10 == 447
                     || var10 == 1125) {
                     int var14 = this.eF[this.eV - 1];
                     int var18 = this.eG[this.eV - 1];
                     rs.p_n.C_e var21 = rs.p_n.C_e.H[var18];
                     if (ch && this.fx[4] != null && this.fx[4].startsWith("Check") && this.fx[4].endsWith("ooting bag")) {
                        this.D(4);
                        return;
                     }

                     if (rs.p_f.C_a.aC && ag && !rs.p_s.p_l.C_c.b) {
                        boolean var6 = false;
                        int var7 = 0;

                        for (int var8 = 0; var8 < this.fx.length; var8++) {
                           if (this.fx[var8] != null
                              && (this.fx[var8].contains("Drop") || this.fx[var8].contains("Destroy") || this.fx[var8].contains("Release"))
                              && cH != 23000) {
                              var6 = true;
                              var7 = var8;
                              break;
                           }
                        }

                        if (var6) {
                           this.D(var7);
                           return;
                        }
                     }

                     if (var21.aF || var21.ag) {
                        if (this.hS) {
                           this.iN = super.hX;
                           this.iO = var1;
                           this.iP.a(this, this.eV - 1);
                           this.iQ = true;
                        }

                        this.op = false;
                        this.dT = 0;
                        this.ex = var18;
                        this.ey = var14;
                        int var23 = rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? ai / 2 - 356 : 0;
                        if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
                           int var10000 = ah / 2 - 230;
                        } else {
                           boolean var28 = false;
                        }

                        if (C_C_uc.hP >= 28 + var23 && C_C_uc.hP <= 74 + var23) {
                           this.mV = 0;
                        }

                        if (C_C_uc.hP >= 75 + var23 && C_C_uc.hP <= 121 + var23) {
                           this.mV = 1;
                        }

                        if (C_C_uc.hP >= 122 + var23 && C_C_uc.hP <= 168 + var23) {
                           this.mV = 2;
                        }

                        if (C_C_uc.hP >= 169 + var23 && C_C_uc.hP <= 215 + var23) {
                           this.mV = 3;
                        }

                        if (C_C_uc.hP >= 216 + var23 && C_C_uc.hP <= 262 + var23) {
                           this.mV = 4;
                        }

                        if (C_C_uc.hP >= 263 + var23 && C_C_uc.hP <= 309 + var23) {
                           this.mV = 5;
                        }

                        if (C_C_uc.hP >= 310 + var23 && C_C_uc.hP <= 356 + var23) {
                           this.mV = 6;
                        }

                        if (C_C_uc.hP >= 357 + var23 && C_C_uc.hP <= 403 + var23) {
                           this.mV = 7;
                        }

                        if (C_C_uc.hP >= 404 + var23 && C_C_uc.hP <= 450 + var23) {
                           this.mV = 8;
                        }

                        this.eA = 2;
                        this.eB = super.hV;
                        this.eC = super.hW;
                        if (rs.p_n.C_e.H[var18].ah == cH) {
                           this.eA = 1;
                        }

                        if (rs.p_n.C_e.H[var18].ah == this.gp) {
                           this.eA = 3;
                        }

                        return;
                     }
                  }
               }

               if (var1 == 1 && (this.ow == 1 || this.y(this.eV - 1)) && this.eV > 2) {
                  var1 = 2;
               }

               if (var1 == 1 && this.eV > 0) {
                  this.D(this.eV - 1);
               }

               if (var1 == 2 && this.eV > 0) {
                  boolean var11 = false;
                  if (this.eV - 1 >= 0 && this.eV - 1 <= this.fx.length - 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Spawn this item")) {
                     int var15 = br + 5;
                     if (br == 64036) {
                        var15 = 70002;
                     }

                     if (var15 >= 70000 && var15 <= 70600 && C_af.e.get(var15) != null) {
                        this.iS = C_af.e.get(var15).b();
                        ap = "::tabitem " + this.iS + " 1";
                        var11 = true;
                     }
                  }

                  if (!var11) {
                     this.bK();
                  }
               }

               if (!this.E() && !rs.p_l.p_b.C_a.b()) {
                  this.bD();
               }

               this.n();
            }
         }
      }
   }

   private void a(boolean var1, byte[] var2) {
      rs.p_v.C_a.l = var1 ? 1 : 0;
      rs.p_v.C_a.b(var2, var2.length);
   }

   public void c(int var1) {
      boolean var2 = false;
      if (ew.g.g().a_(var1)) {
         System.out.println("Dumping OSRS map region " + var1 + "..");
         var2 = true;
         if (rs.p_d.C_h.a != rs.p_d.C_h.a.c) {
            rs.p_d.C_h.a(rs.p_d.C_h.a.c);
            rs.p_d.C_t.a(rs.p_d.C_h.a.c);
         }

         if (rs.p_d.C_r.E != rs.p_d.C_r.a.d) {
            rs.p_d.C_r.a(rs.p_d.C_r.a.d);
         }
      } else {
         System.out.println("Dumping standard map region " + var1 + "..");
         if (Arrays.asList(this.d).contains(new Integer(var1))) {
            if (rs.p_d.C_r.E != rs.p_d.C_r.a.b) {
               rs.p_d.C_r.a(rs.p_d.C_r.a.b);
            }
         } else if (rs.p_d.C_r.E != rs.p_d.C_r.a.a) {
            rs.p_d.C_r.a(rs.p_d.C_r.a.a);
         }
      }

      boolean var3 = false;

      for (int var4 = 0; var4 < 10000; var4++) {
         for (int var5 = 0; var5 < 10000; var5++) {
            int var6 = var4 >> 6;
            int var7 = var5 >> 6;
            int var8 = var6 * 256 + var7;
            if (var8 == var1) {
               for (byte var9 = -30; var9 <= 30; var9 += 10) {
                  for (byte var10 = -30; var10 <= 30; var10 += 10) {
                     rs.p_cache.p_osrs.C_c.a(var2);

                     try {
                        this.a(var4 + var9, var5 + var10, var1);
                     } finally {
                        rs.p_cache.p_osrs.C_c.a(false);
                     }
                  }
               }

               var3 = true;
               break;
            }

            if (var3) {
               break;
            }
         }
      }

      rs.p_cache.p_osrs.C_c.a(false);
   }

   public void a(int var1, int var2, int var3) {
      this.bX = true;
      this.dR = -1;
      this.et.f();
      this.ea.f();
      rs.p_l.C_E_uc.g();
      this.m();
      this.dF.b();
      System.gc();
      int var4 = var1 / 8;
      int var5 = var2 / 8;
      int var6 = (var4 - 6) * 8;
      int var7 = (var5 - 6) * 8;

      for (int var8 = 0; var8 < 4; var8++) {
         for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
               this.gc[var8][var9][var10] = 0;
            }
         }
      }

      for (int var28 = 0; var28 < 4; var28++) {
         this.fP[var28].a();
      }

      C_x var29 = new C_x(this.gc, this.fC);
      byte var30 = 62;
      int var31 = 0;

      for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
         for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
            var31++;
         }
      }

      this.fr = new byte[var31][];
      this.fY = new byte[var31][];
      this.fR = new int[var31];
      this.fS = new int[var31];
      this.fT = new int[var31];
      int var33 = this.fr.length;
      var31 = 0;

      for (int var34 = (var4 - 6) / 8; var34 <= (var4 + 6) / 8; var34++) {
         for (int var13 = (var5 - 6) / 8; var13 <= (var5 + 6) / 8; var13++) {
            this.fR[var31] = (var34 << 8) + var13;
            int var14 = this.fS[var31] = ew.b(0, var13, var34);
            if (var14 != -1) {
               ew.a(3, var14);
            }

            int var15 = this.fT[var31] = ew.b(1, var13, var34);
            if (var15 != -1) {
               ew.a(3, var15);
            }

            var31++;
         }
      }

      while (ew.g() != 0) {
         this.s();
      }

      for (int var35 = 0; var35 < var33; var35++) {
         int var39 = (this.fR[var35] >> 8) * 64 - var6;
         int var43 = (this.fR[var35] & 0xFF) * 64 - var7;
         byte[] var47 = this.fr[var35];
         if (var47 != null) {
            var29.a(var47, var39, var43, (var4 - 6) * 8, (var5 - 6) * 8, this.fP);
         }
      }

      for (int var36 = 0; var36 < var33; var36++) {
         int var40 = (this.fR[var36] >> 8) * var30 - var6;
         int var44 = (this.fR[var36] & 0xFF) * var30 - var7;
         byte[] var48 = this.fr[var36];
         if (var48 == null && var5 < 800) {
            var29.a(var44, 64, 64, var40);
         }
      }

      mY++;
      if (mY > 160) {
         mY = 0;
      }

      for (int var37 = 0; var37 < var33; var37++) {
         byte[] var41 = this.fY[var37];
         if (var41 != null) {
            int var45 = (this.fR[var37] >> 8) * 64 - var6;
            int var49 = (this.fR[var37] & 0xFF) * 64 - var7;
            var29.a(var45, this.fP, var49, this.dF, var41);
         }
      }

      var29.a(this.fP, this.dF);
      byte var38 = 104;
      byte var42 = 104;

      for (int var46 = 0; var46 < 4; var46++) {
         int[][] var50 = this.fP[var46].a;

         for (int var16 = 0; var16 < var38; var16++) {
            for (int var17 = 0; var17 < var42; var17++) {
               int var18 = var6 + var16;
               int var19 = var7 + var17;
               int var20 = var18 >> 6;
               int var21 = var19 >> 6;
               int var22 = var20 * 256 + var21;
               if (var22 == var3 && !this.c(var1, var2, var18, var19)) {
                  String var23 = C_e.a(var18, var19, var46);
                  boolean var24 = false;
                  boolean var25 = false;
                  if (var50[var16][var17] != 0 && C_x.d.get(var23) != null) {
                     int var26 = C_x.d.get(var23);
                     rs.p_d.C_r var27 = rs.p_d.C_r.c(var26);
                     var24 = var27.ag;
                     var25 = true;
                  }

                  C_e.a(var18, var19, var46, var50[var16][var17], var24);
               }
            }
         }
      }
   }

   private boolean c(int var1, int var2, int var3, int var4) {
      int var5 = var1 - (var3 / 8 - 6) * 8;
      int var6 = var2 - (var4 / 8 - 6) * 8;
      return var5 < 16 || var5 >= 88 || var6 < 16 || var6 >= 88;
   }

   public static boolean b(int var0, int var1, int var2) {
      if (bC == -1) {
         return false;
      } else if (var2 != dw) {
         return false;
      } else {
         return bC != W ? false : var0 < bE || var0 > bG || var1 < bF || var1 > bH;
      }
   }

   public static void k() {
      bD = false;
      bC = -1;
      bE = 0;
      bF = 0;
      bG = 0;
      bH = 0;
   }

   public final void l() {
      try {
         this.dR = -1;
         this.et.f();
         this.ea.f();
         rs.p_l.C_E_uc.g();
         this.m();
         this.dF.b();
         C_GameStateChanged_mc var1 = new C_GameStateChanged_mc();
         var1.setGameState(rs.p_runelite.p_a.C_c.f);
         this.p.post(var1);
         System.gc();

         for (int var2 = 0; var2 < 4; var2++) {
            this.fP[var2].a();
         }

         for (int var25 = 0; var25 < 4; var25++) {
            for (int var3 = 0; var3 < 104; var3++) {
               for (int var4 = 0; var4 < 104; var4++) {
                  this.gc[var25][var3][var4] = 0;
               }
            }
         }

         C_x var26 = new C_x(this.gc, this.fC);
         int var28 = this.fr.length;
         byte var30 = 62;

         for (int var5 = 0; var5 < var28; var5++) {
            for (int var6 = 0; var6 < 2000; var6++) {
               if (this.fR[var5] == this.bz[var6]) {
                  this.fS[var5] = this.bA[var6];
                  this.fT[var5] = this.bB[var6];
               }
            }
         }

         fv.a(0);
         if (!this.nA) {
            for (int var32 = 0; var32 < var28; var32++) {
               int var41 = (this.fR[var32] >> 8) * 64 - eh;
               int var7 = (this.fR[var32] & 0xFF) * 64 - ei;
               byte[] var8 = this.fr[var32];

               try {
                  if (var8 != null) {
                     var26.a(var8, var41, var7, (this.mx - 6) * 8, (this.my - 6) * 8, this.fP);
                  }
               } catch (Exception var22) {
                  if (rs.p_f.C_a.f) {
                     var22.printStackTrace();
                  }
               }
            }

            for (int var33 = 0; var33 < var28; var33++) {
               int var42 = (this.fR[var33] >> 8) * var30 - eh;
               int var49 = (this.fR[var33] & 0xFF) * var30 - ei;
               byte[] var56 = this.fr[var33];
               if (var56 == null && this.my < 800) {
                  var26.a(var49, 64, 64, var42);
               }
            }

            mY++;
            if (mY > 160) {
               mY = 0;
            }

            fv.a(0);

            for (int var34 = 0; var34 < var28; var34++) {
               byte[] var43 = this.fY[var34];
               if (var43 != null) {
                  int var50 = (this.fR[var34] >> 8) * 64 - eh;
                  int var57 = (this.fR[var34] & 0xFF) * 64 - ei;

                  try {
                     var26.a(var50, this.fP, var57, this.dF, var43);
                  } catch (Exception var21) {
                     if (rs.p_f.C_a.f) {
                        var21.printStackTrace();
                     }
                  }
               }
            }
         }

         if (this.nA) {
            for (int var35 = 0; var35 < 4; var35++) {
               for (int var44 = 0; var44 < 13; var44++) {
                  for (int var51 = 0; var51 < 13; var51++) {
                     int var58 = this.eS[var35][var44][var51];
                     if (var58 != -1) {
                        int var9 = var58 >> 24 & 3;
                        int var10 = var58 >> 1 & 3;
                        int var11 = var58 >> 14 & 1023;
                        int var12 = var58 >> 3 & 2047;
                        int var13 = (var11 / 8 << 8) + var12 / 8;

                        for (int var14 = 0; var14 < this.fR.length; var14++) {
                           if (this.fR[var14] == var13 && this.fr[var14] != null) {
                              var26.a(var9, var10, this.fP, var44 * 8, (var11 & 7) * 8, this.fr[var14], (var12 & 7) * 8, var35, var51 * 8);
                              break;
                           }
                        }
                     }
                  }
               }
            }

            for (int var36 = 0; var36 < 13; var36++) {
               for (int var45 = 0; var45 < 13; var45++) {
                  int var52 = this.eS[0][var36][var45];
                  if (var52 == -1) {
                     var26.a(var45 * 8, 8, 8, var36 * 8);
                  }
               }
            }

            fv.a(0);

            for (int var37 = 0; var37 < 4; var37++) {
               for (int var46 = 0; var46 < 13; var46++) {
                  for (int var53 = 0; var53 < 13; var53++) {
                     int var59 = this.eS[var37][var46][var53];
                     if (var59 != -1) {
                        int var61 = var59 >> 24 & 3;
                        int var63 = var59 >> 1 & 3;
                        int var65 = var59 >> 14 & 1023;
                        int var66 = var59 >> 3 & 2047;
                        int var67 = (var65 / 8 << 8) + var66 / 8;

                        for (int var68 = 0; var68 < this.fR.length; var68++) {
                           if (this.fR[var68] == var67 && this.fY[var68] != null) {
                              var26.a(this.fP, this.dF, var61, var46 * 8, (var66 & 7) * 8, var37, this.fY[var68], (var65 & 7) * 8, var63, var53 * 8);
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         fv.a(0);
         var26.a(this.fP, this.dF);
         fv.a(0);
         int var38 = C_x.g;
         if (var38 > dw) {
            var38 = dw;
         }

         if (var38 < dw - 1) {
            var38 = dw - 1;
         }

         if (li) {
            this.dF.a(C_x.g);
         } else {
            this.dF.a(0);
         }

         for (int var47 = 0; var47 < 104; var47++) {
            for (int var54 = 0; var54 < 104; var54++) {
               this.o(var47, var54);
            }
         }

         mn++;
         if (mn > 98) {
            mn = 0;
            fv.a(150);
         }

         this.bA();
      } catch (Exception var23) {
         var23.printStackTrace();
      }

      rs.p_r.C_J_uc.a();
      rs.p_d.C_r.J.a();
      rs.p_d.C_r.L.a();
      rs.p_d.C_r.M.a();
      rs.p_d.C_r.N.a();
      rs.p_d.C_r.O.a();
      if (super.hH != null) {
         fv.a(210);
         fv.g(1057001181);
      }

      System.gc();
      rs.p_l.C_E_uc.h();
      ew.d();
      int var24 = (this.mx - 6) / 8 - 1;
      int var27 = (this.mx + 6) / 8 + 1;
      int var29 = (this.my - 6) / 8 - 1;
      int var31 = (this.my + 6) / 8 + 1;
      if (this.np) {
         var24 = 49;
         var27 = 50;
         var29 = 49;
         var31 = 50;
      }

      try {
         for (int var40 = var24; var40 <= var27; var40++) {
            for (int var48 = var29; var48 <= var31; var48++) {
               if (var40 == var24 || var40 == var27 || var48 == var29 || var48 == var31) {
                  int var55 = (var40 << 8) + var48;
                  if (ek == null || ew.g.a(var55, ek)) {
                     boolean var60 = rs.p_cache.p_osrs.C_c.a();
                     if (ew.g.g().a_(var55)) {
                        rs.p_cache.p_osrs.C_c.a(true);
                     }

                     int var62 = ew.b(0, var48, var40);
                     if (var62 != -1) {
                        ew.b(var62, 3);
                     }

                     int var64 = ew.b(1, var48, var40);
                     if (var64 != -1) {
                        ew.b(var64, 3);
                     }

                     rs.p_cache.p_osrs.C_c.a(var60);
                  }
               }
            }
         }
      } finally {
         rs.p_cache.p_osrs.C_c.a(false);
      }

      if (rs.p_k.C_e.a()) {
         this.a.i();
      }

      if (bD) {
         k();
      }
   }

   public void m() {
      rs.p_r.C_J_uc.a();
      rs.p_d.C_r.J.a();
      rs.p_d.C_r.K.a();
      rs.p_d.C_r.L.a();
      rs.p_d.C_r.M.a();
      rs.p_d.C_r.N.a();
      rs.p_d.C_r.O.a();
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

   private void z(int var1) {
      int[] var2 = this.aT.m;
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var2[var4] = 0;
      }

      for (int var12 = 1; var12 < 103; var12++) {
         int var5 = 24628 + (103 - var12) * 512 * 4;

         for (int var6 = 1; var6 < 103; var6++) {
            if ((this.gc[var1][var6][var12] & 24) == 0) {
               this.dF.a(var2, var5, var1, var6, var12);
            }

            if (var1 < 3 && (this.gc[var1 + 1][var6][var12] & 8) != 0) {
               this.dF.a(var2, var5, var1 + 1, var6, var12);
            }

            var5 += 4;
         }
      }

      int var13 = 16777215;
      int var14 = 15597568;
      this.aT.d();

      for (int var15 = 1; var15 < 103; var15++) {
         for (int var7 = 1; var7 < 103; var7++) {
            if ((this.gc[var1][var7][var15] & 24) == 0) {
               this.d(var15, var13, var7, var14, var1);
            }

            if (var1 < 3 && (this.gc[var1 + 1][var7][var15] & 8) != 0) {
               this.d(var15, var13, var7, var14, var1 + 1);
            }
         }
      }

      this.gZ.a();
      this.mz = 0;

      for (int var16 = 0; var16 < 104; var16++) {
         for (int var17 = 0; var17 < 104; var17++) {
            int var8 = this.dF.g(dw, var16, var17);
            if (var8 != 0) {
               var8 = var8 >> 14 & 32767;
               int var9 = rs.p_d.C_r.c(var8).V;
               if (var9 >= 0 && var9 != 39) {
                  this.no[this.mz] = this.me[var9];
                  this.mA[this.mz] = var16;
                  this.mB[this.mz] = var17;
                  this.mz++;
               }
            }
         }
      }
   }

   public static int d(int var0) {
      if (var0 < 0) {
         var0 = 0;
      }

      return iA.nextInt(var0 + 1);
   }

   private void o(int var1, int var2) {
      C_h var3 = this.jH[dw][var1][var2];
      if (var3 == null) {
         this.dF.l(dw, var1, var2);
      } else {
         long var4 = -99999999L;
         boolean var6 = false;
         rs.p_a.C_g var7 = null;
         rs.p_a.C_g var8 = null;
         rs.p_a.C_g var9 = null;

         for (rs.p_a.C_g var10 = (rs.p_a.C_g)var3.b(); var10 != null; var10 = (rs.p_a.C_g)var3.d()) {
            rs.p_d.C_k var11 = rs.p_d.C_k.f(var10.h);
            long var12 = (long)var11.f;
            if (var11.C) {
               var12 *= (long)(var10.k + 1);
            }

            if (var12 > var4) {
               var4 = var12;
               var7 = var10;
            }
         }

         var3.b(var7);

         for (rs.p_a.C_g var14 = (rs.p_a.C_g)var3.b(); var14 != null; var14 = (rs.p_a.C_g)var3.d()) {
            if (var14.h != var7.h && var8 == null) {
               var8 = var14;
            }

            if (var14.h != var7.h && var14.h != var8.h && var9 == null) {
               var9 = var14;
            }
         }

         int var15 = var1 + (var2 << 7) + 1610612736;
         this.dF.a(var1, var15, var8, this.c(dw, var2 * 128 + 64, var1 * 128 + 64), var9, var7, dw, var2);
      }
   }

   public void d(boolean var1) {
      for (int var2 = 0; var2 < this.cB; var2++) {
         rs.p_a.C_j var3 = this.cA[this.cC[var2]];
         int var4 = 536870912 + (this.cC[var2] << 14);
         if (var3 != null && var3.l() && var3.aG.K == var1) {
            int var5 = var3.ac >> 7;
            int var6 = var3.ad >> 7;
            if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
               if (!var1) {
                  int var7 = eh + (var3.ac - 6 >> 7);
                  int var8 = ei + (var3.ad - 6 >> 7);
                  int var9 = (var7 >> 6) * 256 + (var8 >> 6);
                  if (var9 == 10806 && this.kw_if.get(var7 + "," + var8) != null) {
                     continue;
                  }
               }

               if (var3.S == 1 && (var3.ac & 127) == 64 && (var3.ad & 127) == 64) {
                  if (this.kS[var5][var6] == gf) {
                     continue;
                  }

                  this.kS[var5][var6] = gf;
               }

               if (!var3.aG.C) {
                  var4 -= Integer.MIN_VALUE;
               }

               this.dF.a(dw, var3.ae, this.c(dw, var3.ad, var3.ac), var4, var3.ad, (var3.S - 1) * 64 + 60, var3.ac, var3, var3.T);
            }
         }
      }
   }

   private boolean bn() {
      return rs.p_v.C_a.h();
   }

   private void bo() {
      String var1 = "ondemand";
      System.out.println(var1);

      try {
         this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + var1 + ".html"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      while (true) {
         try {
            Thread.sleep(1000L);
         } catch (Exception var4) {
         }
      }
   }

   public int e(int var1) {
      int var2 = 0;
      int var3 = 0;

      for (int var4 = 1; var4 <= var1; var4++) {
         var2 = (int)((double)var2 + Math.floor((double)var4 + 300.0 * Math.pow(2.0, (double)var4 / 7.0)));
         if (var4 >= var1) {
            return var3;
         }

         var3 = (int)Math.floor((double)(var2 / 4));
      }

      return 0;
   }

   private void A(int var1) {
      if (var1 > 0) {
         rs.p_d.C_k var2 = rs.p_d.C_k.f(var1);
         if (var2 != null) {
            if (var2.F > 0 && var2.p > 0) {
               var1 = var2.F;
               var2 = rs.p_d.C_k.f(var1);
            }

            this.ez = var1;
            if (var2 != null) {
               if (var2.L != null) {
                  boolean var3 = false;

                  for (String var7 : var2.L) {
                     if (var7 != null && (var7.toLowerCase().contains("equip") || var7.toLowerCase().contains("wear") || var7.toLowerCase().contains("wield"))) {
                        var3 = true;
                        break;
                     }
                  }

                  if (var3 || var1 == 21739) {
                     this.jq = var1;
                     this.jt = var2.w;
                  }
               }
            }
         }
      }
   }

   private void a(int var1, rs.p_n.C_e var2, int var3, int var4, int var5, int var6) {
      if (var2 != null) {
         if (var2.aI == 0 && var2.al != null && !var2.aQ) {
            int var7 = !ai() ? 4 : 0;
            int var8 = !ai() ? 4 : 0;
            if (var3 >= var1 && var5 >= var4 && var3 <= var1 + var2.P && var5 <= var4 + var2.aR) {
               int var9 = var2.al.length;

               for (int var10 = 0; var10 < var9; var10++) {
                  int var11 = var2.am[var10] + var1 - (ai() ? 0 : -2);
                  int var12 = var2.bc[var10] + var4 - var6;
                  rs.p_n.C_e var13 = rs.p_n.C_e.H[var2.al[var10]];
                  if (var13 == null) {
                     break;
                  }

                  if (var13.bf && (var13.aw != 32431 || !(var13 instanceof rs.p_n.p_a.p_a.C_b) || ((rs.p_n.p_a.p_a.C_b)var13).i() == var10)) {
                     if (cI != -1 && var13.bA != cI && var13.aw != cI) {
                        if (var13.aI == 0) {
                           this.a(var11, var13, var3, var12, var5, var13.V - (ai() ? 0 : -4));
                           if (var13.aH > var13.aR) {
                              this.a(var11 + var13.P, var13.aR, var3, var5, var13, var12, true, var13.aH);
                           }
                        }
                     } else if ((var13.aw != 40603 && var13.aw != 40604 || !rs.p_n.C_e.H['麚'].at.equalsIgnoreCase("Hunger games loot chest"))
                        && this.j(var13.aw)) {
                        var11 += var13.aJ;
                        var12 += var13.aP;
                        if (var13.aw >= 62150 && var13.aw <= 62152 && var3 >= var11 && var5 >= var12) {
                           this.iB = true;
                        }

                        if (rs.p_n.p_b.C_a.b.b().w_(var13.aw)) {
                           int var14 = var13.P;
                           int var15 = var13.aR;
                           int var16 = var11;
                           int var17 = var12;
                           if (var13.aI == 4) {
                              var14 = var13.ao.a(var13.at);
                              var17 = var12 - 5;
                              if (var13.S) {
                                 var16 = var11 - var14 / 2;
                              }
                           }

                           if (var3 >= var16 && var5 >= var17 && var3 < var16 + var14 && var5 < var17 + var15 + 5) {
                              rs.p_n.p_b.C_a.b.a(var13.aw);
                           }
                        }

                        if ((var13.ab >= 0 || var13.L != 0 || var13.bz)
                           && var3 >= var11
                           && var5 >= var12
                           && var3 < var11 + var13.P
                           && var5 < var12 + var13.aR + 5) {
                           if (var13.aw >= 47115 && var13.aw < 47330 && var13.aw % 5 == 0) {
                              this.A(rs.p_n.C_e.H[var13.aw + 1].af);
                              this.fx[this.eV] = "View row " + rs.p_n.C_e.H[var13.aw + 2].at;
                              this.eI[this.eV] = 1126;
                              this.eG[this.eV] = 1;
                              this.eV++;
                              this.a(rs.p_n.C_e.H[var13.aw + 1].af, this.fx[this.eV - 1], false);
                           }

                           if (C_ab.bT && cH == 47500 && var13.aw >= 47505 && var13.aw <= 47704) {
                              return;
                           }

                           if (var13.bn
                              && var13.aw != 65757
                              && var13.aw != 65804
                              && var13.aw != 65776
                              && var13.aw != 65778
                              && var13.aw != 56057
                              && var13.aw != 49987
                              && var13.aw != 65765
                              && var13.aw != 65780
                              && var13.aw != 55791
                              && var13.aw != 47009
                              && var13.aw != 47005
                              && var13.aw != 55790
                              && var13.aw != 60607
                              && var13.aw != 61022
                              && var13.aw != 61023
                              && var13.aw != 61018
                              && var13.aw != 61019
                              && var13.aw != 60271
                              && var13.aw != 60272
                              && var13.aw != 47813
                              && var13.aw != 47815
                              && var13.aw != 61084
                              && var13.aw != 61089
                              && var13.aw != 61094
                              && var13.aw != 61199
                              && var13.aw != 52012
                              && var13.aw != 61104
                              && var13.aw != 905
                              && var13.aw != 947
                              && var13.aw != 39978
                              && var13.aw != 951
                              && var13.aw != 63052
                              && var13.aw != 16018
                              && var13.aw != 52009
                              && var13.aw != 55027
                              && var13.aw != 55028
                              && var13.aw != 57222) {
                              if (var13.ab >= 0) {
                                 if ((rs.p_f.C_a.aW || var13.ab != 18555) && (var13.ab < 18050 || var13.ab > 18104 || var13.ab % 2 != 0)) {
                                    this.ks = var13.ab;
                                 }
                              } else {
                                 this.ks = var13.aw;
                              }
                           }
                        }

                        if (var13.bn) {
                           if (var13.aI == 5 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.P && var5 < var12 + var13.aR + 5) {
                              br = var13.aw;
                           }

                           if (var13.aI == 10 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.P && var5 < var12 + var13.aR + 5) {
                              br = var13.aw;
                           }
                        }

                        if (var13.aI == 0) {
                           this.a(var11, var13, var3, var12, var5, var13.V - (ai() ? 0 : -4));
                           if (var13.aH > var13.aR) {
                              this.a(var11 + var13.P, var13.aR, var3, var5, var13, var12, true, var13.aH);
                           }
                        } else {
                           if (var13.M == 1 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.P && var5 < var12 + var13.aR + 5) {
                              boolean var23 = false;
                              if (var13.J != 0) {
                                 var23 = this.d(var13);
                              }

                              if (!var23) {
                                 if (var13.aw == 30162 || var13.aw == 7455 || var13.aw == 13095) {
                                    this.fx[this.eV] = rs.p_f.C_a.ba ? "Unlock @gre@Teleport to target" : "Lock @gre@Teleport to target";
                                    this.eI[this.eV] = 647;
                                    this.eG[this.eV] = var13.aw;
                                    this.eV++;
                                 }

                                 this.fx[this.eV] = var13.Q;
                                 this.eI[this.eV] = 315;
                                 this.eG[this.eV] = var13.aw;
                                 if (var13.Q != null && var13.Q.equalsIgnoreCase("Select this market listing") && rs.p_n.C_e.H[var2.al[var10] + 3] != null) {
                                    rs.p_n.C_e var27 = rs.p_n.C_e.H[var2.al[var10] + 3];
                                    if (var27.af > 0) {
                                       rs.p_d.C_k var29 = rs.p_d.C_k.f(var27.af);
                                       this.fx[this.eV] = "Purchase listing @lre@" + var29.w;
                                       this.a(var27.af, this.fx[this.eV], false);
                                    }
                                 }

                                 this.eV++;
                              }
                           }

                           if (var13.M == 2 && this.eW == 0 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.P && var5 < var12 + var13.aR) {
                              String var24 = var13.R;
                              if (var24.indexOf(" ") != -1) {
                                 var24 = var24.substring(0, var24.indexOf(" "));
                              }

                              this.fx[this.eV] = var24 + " @gre@" + var13.N;
                              this.eI[this.eV] = 626;
                              this.eG[this.eV] = var13.aw;
                              this.eV++;
                           }

                           if (var13.M == 3 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.P && var5 < var12 + var13.aR) {
                              this.fx[this.eV] = "Close";
                              this.eI[this.eV] = 200;
                              this.eG[this.eV] = var13.aw;
                              this.eV++;
                           }

                           if (var13.M == 4 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.P && var5 < var12 + var13.aR) {
                              this.fx[this.eV] = var13.Q;
                              this.eI[this.eV] = 169;
                              this.eG[this.eV] = var13.aw;
                              this.eV++;
                              if (var13.k != null) {
                              }
                           }

                           if (var13.M == 5 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.P && var5 < var12 + var13.aR) {
                              if (var13.aw == 30162 || var13.aw == 7455 || var13.aw == 13095) {
                                 this.fx[this.eV] = rs.p_f.C_a.ba ? "Unlock @gre@Teleport to target" : "Lock @gre@Teleport to target";
                                 this.eI[this.eV] = 647;
                                 this.eG[this.eV] = var13.aw;
                                 this.eV++;
                              }

                              this.fx[this.eV] = var13.Q;
                              this.eI[this.eV] = 646;
                              this.eG[this.eV] = var13.aw;
                              this.eV++;
                           }

                           if (var13.M == 6 && !this.eZ && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.P && var5 < var12 + var13.aR) {
                              this.fx[this.eV] = var13.Q;
                              this.eI[this.eV] = 679;
                              this.eG[this.eV] = var13.aw;
                              this.eV++;
                           }

                           if (var3 >= var11
                              && var5 >= var12
                              && var3 < var11 + (var13.aI == 4 ? 100 : var13.P)
                              && var5 < var12 + var13.aR
                              && var13.W != null
                              && (var13.aI == 4 && var13.at.length() > 0 || var13.aI == 5)) {
                              for (int var25 = var13.W.length - 1; var25 >= 0; var25--) {
                                 if (var13.W[var25] != null) {
                                    this.fx[this.eV] = var13.W[var25] + (var13.aI == 4 ? " " + var13.at : "");
                                    this.eI[this.eV] = 647;
                                    this.eF[this.eV] = var25;
                                    this.eG[this.eV] = var13.aw;
                                    this.eV++;
                                 }
                              }
                           }

                           if (var13.aI == 2) {
                              int var26 = 0;

                              for (int var28 = 0; var28 < var13.aR; var28++) {
                                 for (int var30 = 0; var30 < var13.P; var30++) {
                                    int var31 = var11 + var30 * (32 + var13.ac);
                                    int var18 = var12 + var28 * (32 + var13.ap);
                                    if (var26 < 20) {
                                       var31 += var13.K[var26];
                                       var18 += var13.as[var26];
                                    }

                                    if (var3 >= var31 && var5 >= var18 && var3 < var31 + 32 && var5 < var18 + 32) {
                                       this.mv = var26;
                                       this.mw = var13.aw;
                                       if (var13.az[var26] > 0) {
                                          rs.p_d.C_k var19 = rs.p_d.C_k.f(var13.az[var26] - 1);
                                          if (this.gr == 1 && var13.av) {
                                             if (var13.aw != this.gt || var26 != this.gs) {
                                                this.fx[this.eV] = "Use " + this.oN + " with @lre@" + var19.w;
                                                this.eI[this.eV] = 870;
                                                this.eJ[this.eV] = var19.i;
                                                this.eF[this.eV] = var26;
                                                this.eG[this.eV] = var13.aw;
                                                this.eV++;
                                             }
                                          } else if (this.eW == 1 && var13.av) {
                                             if ((this.nm & 16) == 16) {
                                                this.fx[this.eV] = this.nn + " @lre@" + var19.w;
                                                this.eI[this.eV] = 543;
                                                this.eJ[this.eV] = var19.i;
                                                this.eF[this.eV] = var26;
                                                this.eG[this.eV] = var13.aw;
                                                this.eV++;
                                             }
                                          } else {
                                             if (var13.av) {
                                                for (int var20 = 4; var20 >= 3; var20--) {
                                                   if (var19.L != null && var19.L[var20] != null) {
                                                      this.fx[this.eV] = var19.L[var20] + " @lre@" + var19.w;
                                                      if (var20 == 3) {
                                                         this.eI[this.eV] = 493;
                                                      }

                                                      if (var20 == 4) {
                                                         this.eI[this.eV] = 847;
                                                      }

                                                      this.eJ[this.eV] = var19.i;
                                                      this.eF[this.eV] = var26;
                                                      this.eG[this.eV] = var13.aw;
                                                      this.eV++;
                                                   } else if (var20 == 4) {
                                                      this.fx[this.eV] = "Drop @lre@" + var19.w;
                                                      this.eI[this.eV] = 847;
                                                      this.eJ[this.eV] = var19.i;
                                                      this.eF[this.eV] = var26;
                                                      this.eG[this.eV] = var13.aw;
                                                      this.eV++;
                                                   }
                                                }
                                             }

                                             if (var13.an) {
                                                this.fx[this.eV] = "Use @lre@" + var19.w;
                                                this.eI[this.eV] = 447;
                                                this.eJ[this.eV] = var19.i;
                                                this.eF[this.eV] = var26;
                                                this.eG[this.eV] = var13.aw;
                                                this.eV++;
                                             }

                                             if (var13.av && var19.L != null) {
                                                for (int var32 = 2; var32 >= 0; var32--) {
                                                   if (var19.L[var32] != null) {
                                                      this.fx[this.eV] = var19.L[var32] + " @lre@" + var19.w;
                                                      if (var32 == 0) {
                                                         if (!var19.L[var32].toLowerCase().contains("wear")
                                                            && !var19.L[var32].toLowerCase().contains("wield")
                                                            && !var19.L[var32].toLowerCase().contains("equip")) {
                                                            this.eI[this.eV] = 74;
                                                         } else {
                                                            this.eI[this.eV] = 454;
                                                         }
                                                      }

                                                      if (var32 == 1) {
                                                         this.eI[this.eV] = 454;
                                                      }

                                                      if (var32 == 2) {
                                                         this.eI[this.eV] = 539;
                                                      }

                                                      this.eJ[this.eV] = var19.i;
                                                      this.eF[this.eV] = var26;
                                                      this.eG[this.eV] = var13.aw;
                                                      this.eV++;
                                                   }
                                                }
                                             }

                                             if (var13.W != null) {
                                                if (var13.ah == 5292 && cH == 23000 && (var13.aw < 10335 || var13.aw > 10342)) {
                                                   if (var13.ax[var26] == 0) {
                                                      var13.W = rs.p_n.p_c.C_h.bJ;
                                                   } else if (var13.aw < 10335 || var13.aw > 10342) {
                                                      if (var19.i == 995) {
                                                         var13.W = rs.p_n.p_c.C_h.bL;
                                                      } else {
                                                         var13.W = rs.p_n.p_c.C_h.bK;
                                                      }
                                                   }
                                                }

                                                if (var13.aw == 2006) {
                                                   for (int var33 = 0; var33 <= 1; var33++) {
                                                      if (var19 != null && var19.L != null && var19.L[var33] != null) {
                                                         this.fx[this.eV] = var19.L[var33] + " @lre@" + var19.w;
                                                         this.eJ[this.eV] = var19.i;
                                                         this.eF[this.eV] = var26;
                                                         this.eG[this.eV] = var13.aw;
                                                         if (!var19.L[var33].toLowerCase().contains("wear")
                                                            && !var19.L[var33].toLowerCase().contains("wield")
                                                            && !var19.L[var33].toLowerCase().contains("equip")) {
                                                            this.eI[this.eV] = 74;
                                                         } else {
                                                            this.eI[this.eV] = 454;
                                                         }

                                                         this.eV++;
                                                      }
                                                   }

                                                   if (var19.i == 995 || var19.i == 20693) {
                                                      this.fx[this.eV] = var19.L[3] + " @lre@" + var19.w;
                                                      this.eJ[this.eV] = var19.i;
                                                      this.eF[this.eV] = var26;
                                                      this.eG[this.eV] = var13.aw;
                                                      this.eI[this.eV] = 493;
                                                      this.eV++;
                                                   }
                                                }

                                                for (int var34 = 6; var34 >= 0; var34--) {
                                                   if (var34 <= var13.W.length - 1 && var13.W[var34] != null) {
                                                      this.fx[this.eV] = var13.W[var34] + " @lre@" + var19.w;
                                                      if (var34 == 0) {
                                                         this.eI[this.eV] = 632;
                                                      }

                                                      if (var34 == 1) {
                                                         this.eI[this.eV] = 78;
                                                      }

                                                      if (var34 == 2) {
                                                         this.eI[this.eV] = 867;
                                                      }

                                                      if (var34 == 3) {
                                                         this.eI[this.eV] = 431;
                                                      }

                                                      if (var34 == 4) {
                                                         this.eI[this.eV] = 53;
                                                      }

                                                      if (var13.ah == 3824 && var34 == 5) {
                                                         this.eI[this.eV] = 638;
                                                      }

                                                      if (var13.ah == 5292) {
                                                         if (var13.W.length < 7) {
                                                            if (var34 == 5) {
                                                               this.eI[this.eV] = 291;
                                                            }
                                                         } else {
                                                            if (var34 == 5) {
                                                               this.eI[this.eV] = 300;
                                                            }

                                                            if (var34 == 6) {
                                                               this.eI[this.eV] = 291;
                                                            }
                                                         }
                                                      }

                                                      this.eJ[this.eV] = var19.i;
                                                      this.eF[this.eV] = var26;
                                                      this.eG[this.eV] = var13.aw;
                                                      this.eV++;
                                                   }
                                                }
                                             }

                                             if (rs.p_f.C_a.c() && cH == -1 && rs.p_s.p_c.C_c.d) {
                                                this.fx[this.eV] = "<img=191> @mag@Colors @lre@" + var19.w;
                                             } else {
                                                this.fx[this.eV] = "Examine @lre@" + var19.w;
                                             }

                                             this.eI[this.eV] = 1125;
                                             this.eJ[this.eV] = var19.i;
                                             this.eF[this.eV] = var26;
                                             this.eG[this.eV] = var13.aw;
                                             this.eV++;
                                             this.A(var19.i);
                                          }
                                       }
                                    }

                                    var26++;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.lX.f(var4, var3);
      this.lY.f(var4, var3 + var1 - 16);
      rs.p_l.C_c.e(var4, var3 + 16, 16, var1 - 32, 1);
      rs.p_l.C_c.e(var4, var3 + 16, 15, var1 - 32, 4011046);
      rs.p_l.C_c.e(var4, var3 + 16, 13, var1 - 32, 3419425);
      rs.p_l.C_c.e(var4, var3 + 16, 11, var1 - 32, 3024925);
      rs.p_l.C_c.e(var4, var3 + 16, 10, var1 - 32, 2696219);
      rs.p_l.C_c.e(var4, var3 + 16, 9, var1 - 32, 2433049);
      rs.p_l.C_c.e(var4, var3 + 16, 1, var1 - 32, 1);
      int var6 = (var1 - 32) * var1 / var5;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = (var1 - 32 - var6) * var2 / (var5 - var1);
      rs.p_l.C_c.e(var4, var3 + 16 + var7, 16, var6, 5063219);
      rs.p_l.C_c.d(var3 + 16 + var7, 1, var6, var4);
      rs.p_l.C_c.d(var3 + 16 + var7, 8482897, var6, var4 + 1);
      rs.p_l.C_c.d(var3 + 16 + var7, 7562570, var6, var4 + 2);
      rs.p_l.C_c.d(var3 + 16 + var7, 6970435, var6, var4 + 3);
      rs.p_l.C_c.d(var3 + 16 + var7, 6970435, var6, var4 + 4);
      rs.p_l.C_c.d(var3 + 16 + var7, 6641729, var6, var4 + 5);
      rs.p_l.C_c.d(var3 + 16 + var7, 6641729, var6, var4 + 6);
      rs.p_l.C_c.d(var3 + 16 + var7, 6378814, var6, var4 + 7);
      rs.p_l.C_c.d(var3 + 16 + var7, 6378814, var6, var4 + 8);
      rs.p_l.C_c.d(var3 + 16 + var7, 6115644, var6, var4 + 9);
      rs.p_l.C_c.d(var3 + 16 + var7, 6115644, var6, var4 + 10);
      rs.p_l.C_c.d(var3 + 16 + var7, 5852730, var6, var4 + 11);
      rs.p_l.C_c.d(var3 + 16 + var7, 5852730, var6, var4 + 12);
      rs.p_l.C_c.d(var3 + 16 + var7, 5326389, var6, var4 + 13);
      rs.p_l.C_c.d(var3 + 16 + var7, 4931889, var6, var4 + 14);
      rs.p_l.C_c.b(var4, var3 + 16 + var7, 15, 1);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 15, 1);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 14, 6641729);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 13, 6970435);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 11, 7167816);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 10, 7562570);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 7, 7759947);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 5, 8088141);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 4, 8285776);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 3, 8482897);
      rs.p_l.C_c.b(var4, var3 + 17 + var7, 2, 1);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 16, 1);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 15, 5655352);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 14, 6115644);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 11, 6444608);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 10, 6641729);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 7, 6970435);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 5, 7233606);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 4, 7430727);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 3, 8088141);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 2, 8482897);
      rs.p_l.C_c.b(var4, var3 + 18 + var7, 1, 1);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 16, 1);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 15, 5326389);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 14, 5655352);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 11, 6115644);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 9, 6378814);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 7, 6641729);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 5, 6970435);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 4, 7233606);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 3, 7562570);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 2, 8482897);
      rs.p_l.C_c.b(var4, var3 + 19 + var7, 1, 1);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 16, 1);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 15, 4931889);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 14, 5523766);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 13, 5852730);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 10, 6115644);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 8, 6378814);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 6, 6641729);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 4, 6970435);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 3, 7562570);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 2, 8482897);
      rs.p_l.C_c.b(var4, var3 + 20 + var7, 1, 1);
      rs.p_l.C_c.d(var3 + 16 + var7, 1, var6, var4 + 15);
      rs.p_l.C_c.b(var4, var3 + 15 + var7 + var6, 16, 1);
      rs.p_l.C_c.b(var4, var3 + 14 + var7 + var6, 15, 1);
      rs.p_l.C_c.b(var4, var3 + 14 + var7 + var6, 14, 4142890);
      rs.p_l.C_c.b(var4, var3 + 14 + var7 + var6, 10, 4471853);
      rs.p_l.C_c.b(var4, var3 + 14 + var7 + var6, 9, 4734511);
      rs.p_l.C_c.b(var4, var3 + 14 + var7 + var6, 7, 4866095);
      rs.p_l.C_c.b(var4, var3 + 14 + var7 + var6, 4, 4931889);
      rs.p_l.C_c.b(var4, var3 + 14 + var7 + var6, 3, 5655352);
      rs.p_l.C_c.b(var4, var3 + 14 + var7 + var6, 2, 1);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 16, 1);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 15, 4471853);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 11, 4931889);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 9, 5326389);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 7, 5523766);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 6, 5655352);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 4, 5852730);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 3, 6444608);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 2, 6970435);
      rs.p_l.C_c.b(var4, var3 + 13 + var7 + var6, 1, 1);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 16, 1);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 15, 4471853);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 14, 4931889);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 12, 5523766);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 11, 5655352);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 10, 5852730);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 7, 6115644);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 4, 6378814);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 3, 7233606);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 2, 8088141);
      rs.p_l.C_c.b(var4, var3 + 12 + var7 + var6, 1, 1);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 16, 1);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 15, 4931889);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 14, 5326389);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 13, 5655352);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 11, 5852730);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 9, 6115644);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 7, 6378814);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 5, 6641729);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 4, 6970435);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 3, 7562570);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 2, 8088141);
      rs.p_l.C_c.b(var4, var3 + 11 + var7 + var6, 1, 1);
   }

   public void b(int var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5);
   }

   private void a(rs.p_x.C_e var1, int var2) {
      this.jN = 0;
      this.kw = 0;
      this.e(var1);
      this.a(var2, var1);
      this.b(var1);

      for (int var3 = 0; var3 < this.jN; var3++) {
         int var4 = this.jO[var3];
         int var5 = 536870912 + (var4 << 14);
         if (!this.cA[var4].aG.C) {
            var5 -= Integer.MIN_VALUE;
         }

         if (this.cA[var4].P != ff) {
            this.cA[var4].aG = null;
            this.cA[var4] = null;
            rs.p_k.p_c.C_c.a(var5);
         }
      }

      if (var1.h != var2) {
         rs.p_v.C_a.e(this.fk + " size mismatch in getnpcpos - pos:" + var1.h + " psize:" + var2);
         throw new RuntimeException("eek");
      } else {
         for (int var6 = 0; var6 < this.cB; var6++) {
            if (this.cA[this.cC[var6]] == null) {
               rs.p_v.C_a.e(this.fk + " null entry in npc list - pos:" + var6 + " size:" + this.cB);
               throw new RuntimeException("eek");
            }
         }
      }
   }

   public void n() {
      int var1 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : ah - 530;
      if (C_C_uc.hP >= 5 && C_C_uc.hP <= 61 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.ok = true;
         fM = true;
      } else if (C_C_uc.hP >= 71 && C_C_uc.hP <= 127 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.ok = true;
         fM = true;
      } else if (C_C_uc.hP >= 137 && C_C_uc.hP <= 193 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.ok = true;
         fM = true;
      } else if (C_C_uc.hP >= 203 && C_C_uc.hP <= 259 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.ok = true;
         fM = true;
      } else if (C_C_uc.hP >= 269 && C_C_uc.hP <= 325 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.ok = true;
         fM = true;
      } else if (C_C_uc.hP >= 335 && C_C_uc.hP <= 391 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.ok = true;
         fM = true;
      } else if (C_C_uc.hP >= 404 && C_C_uc.hP <= 515 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.ok = true;
         fM = true;
      } else {
         this.ok = true;
         fM = true;
      }
   }

   private void p(int var1, int var2) {
      if (var1 == 1) {
         if (var2 == 1) {
            rs.p_l.C_E_uc.b(0.9);
         }

         if (var2 == 2) {
            rs.p_l.C_E_uc.b(0.8);
         }

         if (var2 == 3) {
            rs.p_l.C_E_uc.b(0.7);
         }

         if (var2 == 4) {
            rs.p_l.C_E_uc.b(0.6);
         }

         rs.p_d.C_k.k.a();
         this.ga = true;
      }

      if (var1 == 2) {
         if (var2 == 1) {
            C_L_uc.a(4);
            this.a(true, 0.0);
            this.nv = false;
         } else if (var2 == 2) {
            C_L_uc.a(3);
            this.a(true, 0.25);
            this.nv = true;
         } else if (var2 == 3) {
            C_L_uc.a(2);
            this.a(true, 0.5);
            this.nv = true;
         } else if (var2 == 4) {
            C_L_uc.a(1);
            this.a(true, 0.75);
            this.nv = true;
         }

         rs.p_f.C_a.s = var2;
         rs.p_f.C_a.d();
      }

      if (var1 == 4) {
         rs.p_f.C_a.al = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[12466] != null) {
            this.dP[rs.p_n.C_e.H[12466].X[0][1]] = var2;
            rs.p_n.C_e.H[12466].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 3) {
         rs.p_f.C_a.ak = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[12464] != null) {
            this.dP[rs.p_n.C_e.H[12464].X[0][1]] = var2;
            rs.p_n.C_e.H[12464].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 5) {
         rs.p_f.C_a.ap = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[12468] != null) {
            this.dP[rs.p_n.C_e.H[12468].X[0][1]] = var2;
            rs.p_n.C_e.H[12468].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 6) {
         if (this.cY == 1) {
            this.cY = 2;
         }

         rs.p_f.C_a.aj = var2 == 1;
         rs.p_f.C_a.d();
         if (this.cc) {
            this.d();
         }

         if (rs.p_n.C_e.H[915] != null) {
            this.dP[rs.p_n.C_e.H[915].X[0][1]] = var2;
            rs.p_n.C_e.H[915].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 8) {
         this.nS = var2;
         rs.p_f.C_a.bu = var2;
         fM = true;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[957] != null) {
            this.dP[rs.p_n.C_e.H[957].X[0][1]] = var2;
            rs.p_n.C_e.H[957].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 7) {
         fb = true;
      }

      if (var1 == 9) {
         this.kM = var2;
      }

      if (var1 == 10) {
         rs.p_f.C_a.ax = var2 == 1;
         int var3 = eh + (eh - 6 >> 7);
         int var4 = ei + (ei - 6 >> 7);
         int var5 = var3 >> 6;
         int var6 = var4 >> 6;
         int var7 = var5 * 256 + var6;
         if (!this.aC
            && var7 != 9023
            && var7 != 9022
            && var7 != 9023
            && var7 != 9024
            && var7 != 8767
            && var7 != 9279
            && c.get(var7) == null
            && c.get(W) == null) {
            C_x.h = !rs.p_f.C_a.ax;
            if (this.fr != null && !this.bI) {
               ee = 1;
            } else {
               this.bI = false;
            }
         }

         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[12470] != null) {
            this.dP[rs.p_n.C_e.H[12470].X[0][1]] = var2;
            rs.p_n.C_e.H[12470].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 11) {
         rs.p_f.C_a.aw = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[12480] != null) {
            this.dP[rs.p_n.C_e.H[12480].X[0][1]] = var2;
            rs.p_n.C_e.H[12480].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 12) {
         rs.p_f.C_a.ay = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[12482] != null) {
            this.dP[rs.p_n.C_e.H[12482].X[0][1]] = var2;
            rs.p_n.C_e.H[12482].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 13) {
         if (rs.p_f.C_a.ah) {
            if (this.cc) {
               this.a("<img=163> This feature is disabled in Lite mode!", 0, null);
            }

            rs.p_f.C_a.az = false;
            var2 = 0;
         } else {
            rs.p_f.C_a.az = var2 == 1;
            rs.p_f.C_a.d();
            if (this.cc) {
               this.d();
            }
         }

         if (rs.p_n.C_e.H['鰧'] != null) {
            this.dP[rs.p_n.C_e.H['鰧'].X[0][1]] = var2;
            rs.p_n.C_e.H['鰧'].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 14) {
         rs.p_f.C_a.aA = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H['鰥'] != null) {
            this.dP[rs.p_n.C_e.H['鰥'].X[0][1]] = var2;
            rs.p_n.C_e.H['鰥'].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 15) {
         rs.p_f.C_a.aB = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19099] != null) {
            this.dP[rs.p_n.C_e.H[19099].X[0][1]] = var2;
            rs.p_n.C_e.H[19099].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 16) {
         rs.p_f.C_a.aC = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19097] != null) {
            this.dP[rs.p_n.C_e.H[19097].X[0][1]] = var2;
            rs.p_n.C_e.H[19097].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 17) {
         rs.p_f.C_a.aE = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19095] != null) {
            this.dP[rs.p_n.C_e.H[19095].X[0][1]] = var2;
            rs.p_n.C_e.H[19095].I[0] = var2 == 0 ? 1 : 0;
            if (var2 == 0) {
               this.at = "::newticks";
            } else {
               this.at = "::oldticks";
            }
         }

         fb = true;
      }

      if (var1 == 18) {
         rs.p_f.C_a.aF = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19093] != null) {
            this.dP[rs.p_n.C_e.H[19093].X[0][1]] = var2;
            rs.p_n.C_e.H[19093].I[0] = var2 == 0 ? 1 : 0;
            if (var2 == 0) {
               this.at = "::instantswitching";
            } else {
               this.at = "::queuedswitching";
            }
         }

         fb = true;
      }

      if (var1 == 19) {
         rs.p_f.C_a.aG = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19091] != null) {
            this.dP[rs.p_n.C_e.H[19091].X[0][1]] = var2;
            rs.p_n.C_e.H[19091].I[0] = var2 == 0 ? 1 : 0;
            C_aH_mc.i();
         }

         fb = true;
      }

      if (var1 == 20) {
         rs.p_f.C_a.aI = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19089] != null) {
            this.dP[rs.p_n.C_e.H[19089].X[0][1]] = var2;
            rs.p_n.C_e.H[19089].I[0] = var2 == 0 ? 1 : 0;
            C_aH_mc.i();
         }

         fb = true;
      }

      if (var1 == 21) {
         rs.p_f.C_a.aJ = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19087] != null) {
            this.dP[rs.p_n.C_e.H[19087].X[0][1]] = var2;
            rs.p_n.C_e.H[19087].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 22) {
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            rs.p_f.C_a.ai = rs.p_f.C_a.c.a;
            this.a(rs.p_f.C_a.c.a);
         } else {
            rs.p_f.C_a.ai = rs.p_f.C_a.c.b;
            this.a(rs.p_f.C_a.c.b);
         }

         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[12472] != null) {
            this.dP[rs.p_n.C_e.H[12472].X[0][1]] = var2;
            rs.p_n.C_e.H[12472].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 23) {
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
            this.dP[rs.p_n.C_e.H[12474].X[0][1]] = var2;
            rs.p_n.C_e.H[12474].I[0] = var2 == 0 ? 1 : 0;
         }

         if (this.cc) {
            this.a(1, "Loading - please wait.", null);
            this.b();
            C_x.f = dw;
            this.l();
            fv.a(121);
            if (rs.p_f.C_a.ah) {
               this.cc = false;
               rs.p_n.C_e.H['鰦'].at = "<str>Particle/glow effects</str>";
               this.p(13, 0);
               this.cc = true;
            } else {
               rs.p_n.C_e.H['鰦'].at = "Particle/glow effects";
            }
         }
      }

      if (var1 == 24) {
         rs.p_f.C_a.aO = var2 == 1;
         rs.p_f.C_a.d();
         C_V_uc.a(rs.p_f.C_a.aO);
         if (rs.p_n.C_e.H[19085] != null) {
            this.dP[rs.p_n.C_e.H[19085].X[0][1]] = var2;
            rs.p_n.C_e.H[19085].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 25) {
         rs.p_f.C_a.aP = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19083] != null) {
            this.dP[rs.p_n.C_e.H[19083].X[0][1]] = var2;
            rs.p_n.C_e.H[19083].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 26) {
         rs.p_f.C_a.aQ = var2 == 1;
         rs.p_f.C_a.d();
         if (this.cc) {
            this.d();
         }

         if (rs.p_n.C_e.H[19081] != null) {
            this.dP[rs.p_n.C_e.H[19081].X[0][1]] = var2;
            rs.p_n.C_e.H[19081].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 27) {
         rs.p_f.C_a.aT = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19079] != null) {
            this.dP[rs.p_n.C_e.H[19079].X[0][1]] = var2;
            rs.p_n.C_e.H[19079].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 28) {
         rs.p_f.C_a.aZ = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19077] != null) {
            this.dP[rs.p_n.C_e.H[19077].X[0][1]] = var2;
            rs.p_n.C_e.H[19077].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 29) {
         rs.p_f.C_a.bb = var2 == 1;
         rs.p_f.C_a.d();
         if (this.cc) {
            this.d();
         }

         if (rs.p_n.C_e.H[19075] != null) {
            this.dP[rs.p_n.C_e.H[19075].X[0][1]] = var2;
            rs.p_n.C_e.H[19075].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 30) {
         rs.p_f.C_a.aK = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19073] != null) {
            this.dP[rs.p_n.C_e.H[19073].X[0][1]] = var2;
            rs.p_n.C_e.H[19073].I[0] = var2 == 0 ? 1 : 0;
         }

         fb = true;
      }

      if (var1 == 31) {
         rs.p_f.C_a.aL = var2 == 1;
         rs.p_f.C_a.d();
         if (rs.p_n.C_e.H[19071] != null) {
            this.dP[rs.p_n.C_e.H[19071].X[0][1]] = var2;
            rs.p_n.C_e.H[19071].I[0] = var2 == 0 ? 1 : 0;
         }
      }
   }

   private void B(int var1) {
      int var2 = rs.p_d.C_z.a[var1].b;
      int var3 = this.dP[var1];
      if (var1 == 174) {
         var2 = 10;
      }

      if (var1 == 175) {
         var2 = 11;
      }

      if (var1 == 176) {
         var2 = 12;
      }

      if (var1 == 177) {
         var2 = 13;
      }

      if (var1 == 178) {
         var2 = 14;
      }

      if (var1 == 179) {
         var2 = 15;
      }

      if (var1 == 180) {
         var2 = 16;
      }

      if (var1 == 181) {
         var2 = 17;
      }

      if (var1 == 182) {
         var2 = 18;
      }

      if (var1 == 183) {
         var2 = 19;
      }

      if (var1 == 184) {
         var2 = 20;
      }

      if (var1 == 185) {
         var2 = 21;
      }

      if (var1 == 186) {
         var2 = 22;
      }

      if (var1 == 187) {
         var2 = 23;
      }

      if (var1 == 188) {
         var2 = 24;
      }

      if (var1 == 189) {
         var2 = 25;
      }

      if (var1 == 190) {
         var2 = 26;
      }

      if (var1 == 191) {
         var2 = 27;
      }

      if (var1 == 192) {
         var2 = 28;
      }

      if (var1 == 193) {
         var2 = 29;
      }

      if (var1 == 194) {
         var2 = 30;
      }

      if (var1 == 195) {
         var2 = 31;
      }

      this.p(var2, var3);
   }

   private void a(String var1, rs.p_a.C_k var2, int var3, int var4) {
      if (var2.q == null) {
         var2.v = 10;
         var2.O = 150;
         var2.q = var1;
      } else if (var2.q != var1) {
         gj.a(16711680, var1, var4 - 10, var3);
      }
   }

   private void a(rs.p_a.C_k var1, int var2, int var3) {
      this.a("[HIDDEN]", var1, var2, var3);
   }

   public void o() {
      try {
         int var1 = 0;

         for (int var2 = -1; var2 < this.ku + this.cB; var2++) {
            Object var3;
            if (var2 == -1) {
               var3 = eR;
            } else if (var2 < this.ku) {
               var3 = kw_do[this.kv[var2]];
            } else {
               var3 = this.cA[this.cC[var2 - this.ku]];
            }

            if (var3 != null && ((rs.p_a.C_c)var3).l()) {
               boolean var4 = false;
               if (var3 instanceof rs.p_a.C_j) {
                  rs.p_d.C_d var5 = ((rs.p_a.C_j)var3).aG;
                  if (var5.G != null) {
                     var5 = var5.c();
                  }

                  if (var5 == null) {
                     continue;
                  }

                  if (((rs.p_a.C_j)var3).aG.L != null) {
                     rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.f, (rs.p_a.C_j)var3, ((rs.p_a.C_j)var3).c());
                  }

                  if (((rs.p_a.C_j)var3).aF >= 0) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.mW[((rs.p_a.C_j)var3).aF].f(this.dN - 12, this.dO - 25);
                  }

                  if (((rs.p_a.C_j)var3).aB >= 0 && ((rs.p_a.C_j)var3).aG.x == 8330L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     ((rs.p_a.C_j)var3).a(rs.p_l.C_J_uc.h, this.dN - 12, this.dO - 17);
                  }

                  if (var5.T > 0) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + var5.W);
                     if (rs.p_l.C_j.b.w_(var5.T)) {
                        fE[((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(var5.T)).b()].f(this.dN + var5.U, this.dO + var5.V);
                     } else {
                        fE[var5.T].f(this.dN + var5.U, this.dO + var5.V);
                     }
                  }

                  if (var5.x >= 8184L && var5.x <= 8186L && ((rs.p_a.C_j)var3).az > 0) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 100);
                     if (((rs.p_a.C_j)var3).az == 1) {
                        fE[59].f(this.dN - 8, this.dO);
                     }

                     if (((rs.p_a.C_j)var3).az == 2) {
                        fE[58].f(this.dN - 8, this.dO);
                     }

                     if (((rs.p_a.C_j)var3).az == 3) {
                        fE[369].f(this.dN - 8, this.dO);
                     }
                  }

                  if ((var5.x == 3962L || var5.x == 3965L) && ((rs.p_a.C_j)var3).az > 0) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r - 40);
                     fE[53].f(this.dN - 8, this.dO);
                  }

                  if ((var5.x == 6991L || var5.x == 8124L || var5.x == 8125L || var5.x == 8126L) && ((rs.p_a.C_j)var3).az > 0) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 40);
                     fE[53].f(this.dN - 8, this.dO);
                  }

                  if ((var5.x == 6650L || var5.x >= 5159L && var5.x <= 5164L || var5.x == 6049L) && ((rs.p_a.C_j)var3).az > 0) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     if (((rs.p_a.C_j)var3).az == 1) {
                        fE[22].f(this.dN - 8, this.dO);
                     } else if (((rs.p_a.C_j)var3).az == 2) {
                        fE[22].f(this.dN - 8, this.dO - 10);
                        fE[22].f(this.dN - 8, this.dO - 5);
                     } else if (((rs.p_a.C_j)var3).az == 3) {
                        fE[22].f(this.dN - 8, this.dO - 10);
                        fE[22].f(this.dN - 8, this.dO - 5);
                        fE[22].f(this.dN - 8, this.dO);
                     }
                  }

                  if (var5.x == 2476L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[94].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 6537L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[87].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1208L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[164].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 401L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[190].f(this.dN - 8, this.dO - 18);
                  }

                  if (var5.x == 2399L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[112].f(this.dN - 8, this.dO - 18);
                  }

                  if (var5.x == 5942L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[100].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 6184L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[92].f(this.dN - 8, this.dO - 5);
                  }

                  if (var5.x == 6L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[3].f(this.dN - 6, this.dO - 15);
                  }

                  if (var5.x == 410L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[92].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 2165L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[189].f(this.dN - 10, this.dO - 25);
                  }

                  if (var5.x == 1780L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[9].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 851L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[9].f(this.dN - 8, this.dO - 15);
                  }

                  if (((rs.p_a.C_j)var3).aH && !((rs.p_a.C_j)var3).q()) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     if (ff % 20 < 10) {
                        this.mX[0].f(this.dN - 12, this.dO - 28);
                     }
                  }

                  if (var5.x == 2998L || var5.x == 1835L || var5.x == 4658L || var5.x == 4659L || var5.x == 4965L || var5.x == 5112L || var5.x == 8028L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.fJ.f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 2790L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.fK.f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 692L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[152].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 4088L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[228].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 830L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[87].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 4621L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[59].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 4623L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[73].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1798L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r - 325);
                     fE[51].f(this.dN - 8, this.dO + 5);
                  }

                  if (var5.x == 1839L || var5.x >= 727L && var5.x <= 730L || var5.x >= 3682L && var5.x <= 3694L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.mK.f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1019L || var5.x == 4100L || var5.x == 4101L || var5.x == 4102L || var5.x >= 7072L && var5.x <= 7076L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 5);
                     this.mL.f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 6390L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 50);
                     fE[79].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1552L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 50);
                     fE[82].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 4416L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.mP.f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 251L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.fI.f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 2830L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[258].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 373L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[192].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1596L || var5.x == 8031L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.me[51].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1917L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[122].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 6750L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[123].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 554L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[120].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1699L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[118].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1050L) {
                     this.a((rs.p_a.C_c)var3, 245);
                     fE[321].f(this.dN - 6, this.dO - 15);
                  }

                  if (var5.x == 7484L) {
                     this.a((rs.p_a.C_c)var3, 230);
                     fE[274].f(this.dN - 10, this.dO - 15);
                  }

                  if (var5.x == 7482L) {
                     this.a((rs.p_a.C_c)var3, 230);
                     fE[278].f(this.dN - 10, this.dO - 15);
                  }

                  if (var5.x == 2575L) {
                     this.a((rs.p_a.C_c)var3, 230);
                     fE[278].f(this.dN - 10, this.dO - 15);
                  }

                  if (var5.x == 2333L) {
                     this.a((rs.p_a.C_c)var3, 230);
                     fE[278].f(this.dN - 10, this.dO - 15);
                  }

                  if (var5.x == 6174L || var5.x == 6175L) {
                     this.a((rs.p_a.C_c)var3, 230);
                     this.fJ.f(this.dN - 8, this.dO - 18);
                  }

                  if (var5.x == 6179L) {
                     this.a((rs.p_a.C_c)var3, 230);
                     this.eK[1].f(this.dN - 12, this.dO - 24);
                     this.fJ.f(this.dN + 15, this.dO - 18);
                  }

                  if (var5.x == 1597L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.fH.f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1799L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r - 220);
                     this.fG.f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1800L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r - 300);
                     this.me[1].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1797L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r - 300);
                     this.me[1].f(this.dN - 8, this.dO - 18);
                  }

                  if (var5.x == 1802L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r - 135);
                     fE[182].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1801L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r - 400);
                     fE[194].f(this.dN - 8, this.dO - 15);
                  }

                  if (var5.x == 1803L) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 100);
                     fE[194].f(this.dN - 8, this.dO - 15);
                  }
               }

               if (var2 < this.ku) {
                  int var25 = 25;
                  rs.p_a.C_k var29 = (rs.p_a.C_k)var3;
                  if (!rs.p_runelite.p_b.C_a.b().isEmpty()) {
                     for (int var7 = 0; var7 < rs.p_runelite.p_b.C_a.b().size(); var7++) {
                        if (!rs.p_runelite.p_b.C_a.b().get(var7).draw(var29, false)) {
                           var4 = true;
                           break;
                        }
                     }
                  }

                  if (var29.bd == 10 && !var4) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.a(var29, this.dN, this.dO);
                  } else if (var29.bd == 11 && !var4) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     this.a("[SUPER HIDDEN]", var29, this.dN, this.dO);
                  } else if (rs.p_f.C_a.bf > 0 && !var4) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     fE[rs.p_f.C_a.bf].f(this.dN - 8, this.dO - 18);
                  } else if (var29.bd >= 0 && !var4) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     if (this.dN > -1) {
                        if (var29.by > 0) {
                           int var34 = ((rs.p_a.C_c)var3).L > ff ? 4 : 0;
                           long var8 = System.currentTimeMillis() - var29.bz;
                           long var10 = (long)var29.by - var8 / 1000L;
                           Date var12 = new Date(var10 * 1000L);
                           String var13 = new SimpleDateFormat("m:ss").format(var12);
                           int var14 = this.dN;
                           int var15 = this.dO;
                           if (var29.bf != 255 && var29.bf >= 2) {
                              var14 = this.dN + 31;
                              if (((rs.p_a.C_c)var3).L > ff) {
                                 var15 = this.dO - 3;
                              } else {
                                 var15 = this.dO + 1;
                              }
                           }

                           gl.c(var13, var14, var15 - var34, 16777215, 1);
                           var25 += 10 + var34;
                        }

                        try {
                           if (var29.bg > 0 && ed == 197) {
                              byte var35 = 0;
                              int var41 = 15;
                              if (var29.bf == 0) {
                                 if (var29.bd != 0) {
                                    var41 = 17;
                                 }
                              } else if (var29.bf < 9 || var29.bf > 18) {
                                 var35 = 5;
                                 var41 = var29.bd != 255 ? 20 : -4;
                              } else if (var29.bd != 0) {
                                 var41 = 17;
                              }

                              if (var29.bh > 0) {
                                 var35 -= 15;
                                 var41 -= 3;
                              }

                              this.J[var29.bg - 1].f(this.dN + var41, this.dO - 25 + 10 + var35);
                           }
                        } catch (Exception var19) {
                        }

                        try {
                           int var36 = ((rs.p_a.C_c)var3).L > ff ? 4 : 0;
                           if (var29.bf < 2) {
                              this.eK[var29.bf].f(this.dN - 12, this.dO - var25 - var36);
                              var25 += 30 + var36;
                           } else if (var29.bf == 8) {
                              this.I.f(this.dN - 11, this.dO + 15 - var25 - var36);
                              var25 += 20 + var36;
                           } else if (var29.bf >= 9 && var29.bf <= 18) {
                              this.eL[var29.bf - 9].f(this.dN - 12, this.dO - var25 - var36);
                              var25 += 30 + var36;
                           } else if (var29.bf >= 2 && var29.bf != 255) {
                              this.x.z[var29.bf - 1].f(this.dN - 11, this.dO + 20 - var25 - var36);
                              var25 += 10 + var36;
                           }

                           if (var29.br[0] - 512 == 23481) {
                              fE[rs.p_l.C_h.b(0)].f(this.dN - 7, this.dO - var25 - var36 + 10);
                              var25 += 16 + var36;
                           }

                           if ((
                                 var29.br[0] - 512 == 22131
                                    || var29.br[0] - 512 == 22132
                                    || var29.br[0] - 512 == 23480
                                    || var29.br[0] - 512 == 23482
                                    || var29.br[0] - 512 == 23483
                              )
                              && rs.p_l.C_h.b(var29.aC) > 0) {
                              fE[rs.p_l.C_h.b(var29.aC)].f(this.dN - 6, this.dO - var25 - var36 + 10);
                              var25 += 16 + var36;
                           }

                           if (var29.br[0] - 512 == 22133) {
                              fE[rs.p_l.C_h.b(31)].f(this.dN - 8, this.dO - var25 - var36 + 10);
                              var25 += 16 + var36;
                           }

                           if (var29.br[0] - 512 == 22130) {
                              fE[rs.p_l.C_h.b(19)].f(this.dN - 6, this.dO - var25 - var36 + 10);
                              var25 += 16 + var36;
                           }
                        } catch (Exception var18) {
                        }

                        if (var29.bd < 21) {
                           this.mW[var29.bd].f(this.dN - 12, this.dO - var25);
                           var25 += 18;
                        }
                     }
                  }

                  if (var2 >= 0 && this.jZ == 10 && this.kV == this.kv[var2] && !var4) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     if (this.dN > -1) {
                        this.mX[var29.be].f(this.dN - 12, this.dO - var25);
                     }
                  }

                  try {
                     if (var29.bh > 0 && var29.bh != 255 && (var29.aC != 25 || rs.p_f.C_a.bp) && !var4) {
                        this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                        int var37 = (var29.bd < 0 || var29.bd == 255) && (var29.bf < 0 || var29.bf == 255) ? -8 : 15;
                        switch (var29.bh) {
                           case 1:
                              fE[73].f(this.dN + var37, this.dO - 10);
                              break;
                           case 2:
                              fE[59].f(this.dN + var37, this.dO - 15);
                              break;
                           case 3:
                              fE[73].f(this.dN + var37 + 4, this.dO - 10);
                              fE[49].f(this.dN + var37 - 5 + 5, this.dO - 5);
                              break;
                           case 4:
                              fE[59].f(this.dN + var37 + 4, this.dO - 15);
                              fE[49].f(this.dN + var37 - 5 + 4, this.dO - 8);
                              break;
                           case 5:
                              fE[273].f(this.dN + var37, this.dO - 15);
                        }
                     }
                  } catch (Exception var17) {
                  }
               } else if (!var4) {
                  rs.p_d.C_d var24 = ((rs.p_a.C_j)var3).aG;
                  if (rs.p_q.p_a.p_a.p_a.C_j.d.size() > 0 && rs.p_q.p_a.p_a.p_a.C_j.d.get((int)var24.x) != null) {
                     int var6 = rs.p_q.p_a.p_a.p_a.C_j.d.get((int)var24.x);
                     if (var6 >= 0 && var6 < this.mW.length) {
                        this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                        if (this.dN > -1) {
                           this.mW[var6].f(this.dN - 12, this.dO - 30);
                        }
                     }
                  } else if (var24.u >= 0 && var24.u < this.mW.length) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     if (this.dN > -1) {
                        this.mW[var24.u].f(this.dN - 12, this.dO - 30);
                     }
                  }

                  if (this.jZ == 1 && this.of == this.cC[var2 - this.ku] && ff % 20 < 10) {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     if (this.dN > -1) {
                        this.mX[0].f(this.dN - 12, this.dO - 28);
                     }
                  }
               }

               if (((rs.p_a.C_c)var3).q != null && (var2 >= this.ku || this.gu == 0 || this.gu == 3 || this.gu == 1 && this.i(((rs.p_a.C_k)var3).aZ))) {
                  this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r);
                  if (this.dN > -1 && var1 < this.lq) {
                     this.lu[var1] = gj.a(((rs.p_a.C_c)var3).q) / 2;
                     this.lt[var1] = gj.r;
                     this.lr[var1] = this.dN;
                     this.ls[var1] = this.dO;
                     this.lv[var1] = ((rs.p_a.C_c)var3).v;
                     this.lw[var1] = ((rs.p_a.C_c)var3).K;
                     this.lx[var1] = ((rs.p_a.C_c)var3).O;
                     this.ly[var1++] = ((rs.p_a.C_c)var3).q;
                     if (this.or == 0 && ((rs.p_a.C_c)var3).K >= 1 && ((rs.p_a.C_c)var3).K <= 3) {
                        this.lt[var1] = this.lt[var1] + 10;
                        this.ls[var1] = this.ls[var1] + 5;
                     }

                     if (this.or == 0 && ((rs.p_a.C_c)var3).K == 4) {
                        this.lu[var1] = 60;
                     }

                     if (this.or == 0 && ((rs.p_a.C_c)var3).K == 5) {
                        this.lt[var1] = this.lt[var1] + 5;
                     }
                  }
               }

               if (((rs.p_a.C_c)var3).L > ff && !var4) {
                  try {
                     this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r + 15);
                     boolean var26 = true;
                     if (var3 instanceof rs.p_a.C_j && !((rs.p_a.C_j)var3).aG.O) {
                        var26 = false;
                     }

                     if (this.dN > -1 && var26) {
                        byte var30 = var3 instanceof rs.p_a.C_j ? ((rs.p_a.C_j)var3).aG.P : 0;
                        if (rs.p_f.C_a.al && var30 == 0) {
                           rs.p_l.C_F_uc var39 = rs.p_l.C_J_uc.d;
                           rs.p_l.C_F_uc var43 = rs.p_l.C_J_uc.c;
                           if (var3 instanceof rs.p_a.C_j && ((rs.p_a.C_c)var3).N >= 1000) {
                              var39 = rs.p_l.C_J_uc.f;
                              var43 = rs.p_l.C_J_uc.e;
                           }

                           int var46;
                           if (((rs.p_a.C_c)var3).N > 0) {
                              var46 = ((rs.p_a.C_c)var3).M * var39.n / ((rs.p_a.C_c)var3).N;
                           } else {
                              var46 = var39.n;
                           }

                           if (var46 > var39.n) {
                              var46 = var39.n;
                           }

                           if (var46 < 1 && ((rs.p_a.C_c)var3).M > 0) {
                              var46 = 1;
                           }

                           var39.a(this.dN - var39.n / 2, this.dO - 5, var39.n, var39.o);
                           var43.a(this.dN - var39.n / 2, this.dO - 5, var46, var43.o);
                        } else {
                           byte var38 = 30;
                           if (var3 instanceof rs.p_a.C_j) {
                              if (((rs.p_a.C_c)var3).N >= 2500) {
                                 var38 *= 4;
                              } else if (((rs.p_a.C_c)var3).N >= 1000) {
                                 var38 *= 3;
                              } else if (((rs.p_a.C_c)var3).N >= 500) {
                                 var38 *= 2;
                              }
                           }

                           int var42 = 65280;
                           int var9 = 16711680;
                           if (var30 == 1) {
                              var42 = 65535;
                              var9 = 255;
                           }

                           if (var30 == 2) {
                              var42 = 16776960;
                              var9 = 3355392;
                           }

                           if (var30 == 255 && var3 instanceof rs.p_a.C_j) {
                              var42 = ((rs.p_a.C_j)var3).aG.Q;
                              var9 = ((rs.p_a.C_j)var3).aG.R;
                           }

                           int var48;
                           if (((rs.p_a.C_c)var3).N > 0) {
                              var48 = Math.min(var38, ((rs.p_a.C_c)var3).M * var38 / ((rs.p_a.C_c)var3).N);
                           } else {
                              var48 = var38;
                           }

                           if (((rs.p_a.C_c)var3).M > 0 && var48 <= 0) {
                              var48 = 1;
                           }

                           rs.p_l.C_c.e(this.dN - var38 / 2, this.dO - 3, var48, 5, var42);
                           rs.p_l.C_c.e(this.dN - var38 / 2 + var48, this.dO - 3, var38 - var48, 5, var9);
                        }
                     }
                  } catch (Exception var16) {
                  }
               }

               if (var3 instanceof rs.p_a.C_k && !var4 && ((rs.p_a.C_k)var3).az > System.currentTimeMillis()) {
                  this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r / 2);
                  if (((rs.p_a.C_k)var3).aA == 1) {
                     this.kk[0].c(this.dN - 12, this.dO - 15);
                  } else {
                     this.kk[0].c(this.dN - 35, this.dO - 25);
                  }
               }

               if (!var4) {
                  for (int var27 = 0; var27 < 4; var27++) {
                     int var31 = 0;
                     if (((rs.p_a.C_c)var3).h.a(var27)) {
                        var31++;
                        if (!rs.p_f.C_a.ap) {
                           this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r / 2);
                           ((rs.p_a.C_c)var3).h.d()[var27].a(this, (rs.p_a.C_c)var3, var27, this.dN, this.dO);
                        } else {
                           this.a((rs.p_a.C_c)var3, ((rs.p_a.C_c)var3).r / 2);
                           if (this.dN > -1) {
                              this.a((rs.p_a.C_c)var3, (int)((double)((rs.p_a.C_c)var3).r * 0.75));
                              ((rs.p_a.C_c)var3).h.d()[var27].b(this, (rs.p_a.C_c)var3, var27, this.dN, this.dO);
                           }
                        }
                     }
                  }
               }

               ((rs.p_a.C_c)var3).f();
            }
         }

         for (int var21 = 0; var21 < var1; var21++) {
            int var22 = this.lr[var21];
            int var23 = this.ls[var21];
            int var28 = this.lu[var21];
            int var33 = this.lt[var21];
            boolean var40 = true;

            while (var40) {
               var40 = false;

               for (int var44 = 0; var44 < var21; var44++) {
                  if (var23 + 2 > this.ls[var44] - this.lt[var44]
                     && var23 - var33 < this.ls[var44] + 2
                     && var22 - var28 < this.lr[var44] + this.lu[var44]
                     && var22 + var28 > this.lr[var44] - this.lu[var44]
                     && this.ls[var44] - this.lt[var44] < var23) {
                     var23 = this.ls[var44] - this.lt[var44];
                     var40 = true;
                  }
               }
            }

            this.dN = this.lr[var21];
            this.dO = this.ls[var21] = var23;
            String var45 = this.ly[var21];
            if (this.or == 0) {
               int var47 = 16776960;
               if (this.lv[var21] < 6) {
                  var47 = this.lk[this.lv[var21]];
               }

               if (this.lv[var21] == 6) {
                  var47 = gg % 20 >= 10 ? 16776960 : 16711680;
               }

               if (this.lv[var21] == 7) {
                  var47 = gg % 20 >= 10 ? '\uffff' : 255;
               }

               if (this.lv[var21] == 8) {
                  var47 = gg % 20 >= 10 ? 8454016 : '뀀';
               }

               if (this.lv[var21] == 9) {
                  int var49 = 150 - this.lx[var21];
                  if (var49 < 50) {
                     var47 = 16711680 + 1280 * var49;
                  } else if (var49 < 100) {
                     var47 = 16776960 - 327680 * (var49 - 50);
                  } else if (var49 < 150) {
                     var47 = 65280 + 5 * (var49 - 100);
                  }
               }

               if (this.lv[var21] == 10) {
                  int var50 = 150 - this.lx[var21];
                  if (var50 < 50) {
                     var47 = 16711680 + 5 * var50;
                  } else if (var50 < 100) {
                     var47 = 16711935 - 327680 * (var50 - 50);
                  } else if (var50 < 150) {
                     var47 = 255 + 327680 * (var50 - 100) - 5 * (var50 - 100);
                  }
               }

               if (this.lv[var21] == 11) {
                  int var51 = 150 - this.lx[var21];
                  if (var51 < 50) {
                     var47 = 16777215 - 327685 * var51;
                  } else if (var51 < 100) {
                     var47 = 65280 + 327685 * (var51 - 50);
                  } else if (var51 < 150) {
                     var47 = 16777215 - 327680 * (var51 - 100);
                  }
               }

               if (this.lw[var21] == 0) {
                  gj.a(0, var45, this.dO + 1, this.dN);
                  gj.a(var47, var45, this.dO, this.dN);
               }

               if (this.lw[var21] == 1) {
                  gj.a(0, var45, this.dN, gg, this.dO + 1);
                  gj.a(var47, var45, this.dN, gg, this.dO);
               }

               if (this.lw[var21] == 2) {
                  gj.b(this.dN, var45, gg, this.dO + 1, 0);
                  gj.b(this.dN, var45, gg, this.dO, var47);
               }

               if (this.lw[var21] == 3) {
                  gj.a(150 - this.lx[var21], var45, gg, this.dO + 1, this.dN, 0);
                  gj.a(150 - this.lx[var21], var45, gg, this.dO, this.dN, var47);
               }

               if (this.lw[var21] == 4) {
                  int var52 = gj.a(var45);
                  int var11 = (150 - this.lx[var21]) * (var52 + 100) / 150;
                  rs.p_l.C_c.c(334, this.dN - 50, this.dN + 50, 0);
                  gj.b(0, var45, this.dO + 1, this.dN + 50 - var11);
                  gj.b(var47, var45, this.dO, this.dN + 50 - var11);
                  rs.p_l.C_c.c();
               }

               if (this.lw[var21] == 5) {
                  int var53 = 150 - this.lx[var21];
                  int var54 = 0;
                  if (var53 < 25) {
                     var54 = var53 - 25;
                  } else if (var53 > 125) {
                     var54 = var53 - 125;
                  }

                  rs.p_l.C_c.c(this.dO + 5, 0, 512, this.dO - gj.r - 1);
                  gj.a(0, var45, this.dO + 1 + var54, this.dN);
                  gj.a(var47, var45, this.dO + var54, this.dN);
                  rs.p_l.C_c.c();
               }
            } else {
               gj.a(0, var45, this.dO + 1, this.dN);
               gj.a(16776960, var45, this.dO, this.dN);
            }
         }
      } catch (Exception var20) {
      }
   }

   private void f(long var1) {
      try {
         if (var1 != 0L) {
            for (int var3 = 0; var3 < this.kA; var3++) {
               if (this.lg[var3] == var1) {
                  this.kA--;
                  fb = true;

                  for (int var4 = var3; var4 < this.kA; var4++) {
                     this.mT[var4] = this.mT[var4 + 1];
                     this.jG[var4] = this.jG[var4 + 1];
                     this.lg[var4] = this.lg[var4 + 1];
                  }

                  fv.a(215);
                  fv.a(var1);
                  break;
               }
            }
         }
      } catch (RuntimeException var5) {
         rs.p_v.C_a.e("18622, false, " + var1 + ", " + var5.toString());
         throw new RuntimeException();
      }
   }

   private void bp() {
      if (this.iE == null) {
         this.iE = new Long[341];

         for (int var1 = 0; var1 < this.iE.length; var1++) {
            this.iE[var1] = 0L;
         }
      }

      if (this.iD == null) {
         this.iD = new Long[341];

         for (int var2 = 0; var2 < this.iD.length; var2++) {
            this.iD[var2] = 0L;
         }
      }
   }

   public void a(int var1, long var2) {
      if (this.iE != null) {
         if (!rs.p_k.C_e.a()) {
            if (System.currentTimeMillis() - this.iE[var1] <= var2) {
               return;
            }
         } else if (rs.p_l.p_b.C_a.a() || System.currentTimeMillis() - this.iE[var1] <= var2 / 2L) {
            return;
         }

         if (var2 > 50L) {
            var2 = 50L;
         }

         this.bp();
         this.iE[var1] = System.currentTimeMillis();
         this.iD[var1] = var2;
         rs.p_l.C_a var4 = rs.p_l.C_E_uc.y[var1];
         int var5 = var4.j * var4.k - 1;
         int var6 = var4.j * this.dE * 2;
         byte[] var7 = var4.i;
         byte[] var8 = this.kL;

         for (int var9 = 0; var9 <= var5; var9++) {
            var8[var9] = var7[var9 - var6 & var5];
         }

         var4.i = var8;
         this.kL = var7;
         rs.p_l.C_E_uc.c(var1);
         jY++;
         if (jY > 1235) {
            jY = 0;
            if (!rs.p_l.p_b.p_a.C_d.c) {
               fv.a(226);
               fv.b(0);
               int var10 = fv.h;
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
               fv.j(fv.h - var10);
            }
         }
      }
   }

   public void f(int var1) {
      this.d(var1, true);
   }

   private void d(int var1, boolean var2) {
      this.bp();

      for (int var6 : bJ) {
         if (System.currentTimeMillis() - this.iE[var6] > 100L && rs.p_l.C_E_uc.z[var6] >= var1) {
            byte var7 = 1;
            if (var6 != 57) {
               var7 = 2;
            }

            rs.p_l.C_a var8 = rs.p_l.C_E_uc.y[var6];
            int var9 = var8.j * var8.k - 1;
            int var10 = var8.j * this.dE * var7;
            byte[] var11 = var8.i;
            byte[] var12 = this.kL;

            for (int var13 = 0; var13 <= var9; var13++) {
               var12[var13] = var11[var13 - var10 & var9];
            }

            var8.i = var12;
            this.kL = var11;
            rs.p_l.C_E_uc.c(var6);
         }
      }

      for (int var17 : bK) {
         if (System.currentTimeMillis() - this.iE[var17] > 100L && rs.p_l.C_E_uc.z[var17] >= var1) {
            rs.p_l.C_a var18 = rs.p_l.C_E_uc.y[var17];
            int var19 = var18.j * var18.k - 1;
            int var20 = var18.j * this.dE * 2;
            byte[] var21 = var18.i;
            byte[] var22 = this.kL;

            for (int var23 = 0; var23 <= var19; var23++) {
               var22[var23] = var21[var23 - var20 & var19];
            }

            var18.i = var22;
            this.kL = var21;
            rs.p_l.C_E_uc.c(var17);
            jY++;
            if (jY > 1235) {
               jY = 0;
               if (!rs.p_l.p_b.p_a.C_d.g()) {
                  fv.a(226);
                  fv.b(0);
                  int var24 = fv.h;
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
                  fv.j(fv.h - var24);
               }
            }
         }
      }
   }

   private void bq() {
      if (!rs.p_l.p_b.C_a.a()) {
         rs.p_l.C_k.b.a();
         rs.p_l.C_k.c.a();
         rs.p_l.C_k.d.a();
         rs.p_l.C_k.e.a();
         bN = bN + bO;
         if (bN == 1) {
            bO = 1;
         } else if (bN == 149) {
            bO = -1;
         }

         bP = bP + bQ;
         if (bP == 1) {
            bQ = 1;
         } else if (bP == 149) {
            bQ = -1;
         }

         for (int var1 = -1; var1 < this.ku; var1++) {
            int var2;
            if (var1 == -1) {
               var2 = 2047;
            } else {
               var2 = this.kv[var1];
            }

            rs.p_a.C_k var3 = kw_do[var2];
            if (var3 != null && var3.O > 0) {
               var3.O--;
               if (var3.O == 0) {
                  var3.q = null;
               }
            }
         }

         for (int var4 = 0; var4 < this.cB; var4++) {
            int var5 = this.cC[var4];
            rs.p_a.C_j var6 = this.cA[var5];
            if (var6 != null && var6.O > 0) {
               var6.O--;
               if (var6.O == 0) {
                  var6.q = null;
               }
            }
         }
      }
   }

   public void p() {
      int var1 = this.mZ * 128 + 64;
      int var2 = this.na * 128 + 64;
      int var3 = this.c(dw, var2, var1) - this.nb;
      if (cJ < var1) {
         cJ = cJ + this.nc + (var1 - cJ) * this.nd / 1000;
         if (cJ > var1) {
            cJ = var1;
         }
      }

      if (cJ > var1) {
         cJ = cJ - (this.nc + (cJ - var1) * this.nd / 1000);
         if (cJ < var1) {
            cJ = var1;
         }
      }

      if (cK < var3) {
         cK = cK + this.nc + (var3 - cK) * this.nd / 1000;
         if (cK > var3) {
            cK = var3;
         }
      }

      if (cK > var3) {
         cK = cK - (this.nc + (cK - var3) * this.nd / 1000);
         if (cK < var3) {
            cK = var3;
         }
      }

      if (cL < var2) {
         cL = cL + this.nc + (var2 - cL) * this.nd / 1000;
         if (cL > var2) {
            cL = var2;
         }
      }

      if (cL > var2) {
         cL = cL - (this.nc + (cL - var2) * this.nd / 1000);
         if (cL < var2) {
            cL = var2;
         }
      }

      var1 = this.lE * 128 + 64;
      var2 = this.lF * 128 + 64;
      var3 = this.c(dw, var2, var1) - this.lG;
      int var4 = var1 - cJ;
      int var5 = var3 - cK;
      int var6 = var2 - cL;
      int var7 = (int)Math.sqrt((double)(var4 * var4 + var6 * var6));
      int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.949) & 2047;
      int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.949) & 2047;
      if (var8 < 128) {
         var8 = 128;
      }

      if (var8 > 383) {
         var8 = 383;
      }

      if (this.cR < var8) {
         this.cR = this.cR + this.lH + (var8 - this.cR) * this.lI / 1000;
         if (this.cR > var8) {
            this.cR = var8;
         }
      }

      if (this.cR > var8) {
         this.cR = this.cR - (this.lH + (this.cR - var8) * this.lI / 1000);
         if (this.cR < var8) {
            this.cR = var8;
         }
      }

      int var10 = var9 - this.cS;
      if (var10 > 1024) {
         var10 -= 2048;
      }

      if (var10 < -1024) {
         var10 += 2048;
      }

      if (var10 > 0) {
         this.cS = this.cS + this.lH + var10 * this.lI / 1000;
         this.cS &= 2047;
      }

      if (var10 < 0) {
         this.cS = this.cS - (this.lH + -var10 * this.lI / 1000);
         this.cS &= 2047;
      }

      int var11 = var9 - this.cS;
      if (var11 > 1024) {
         var11 -= 2048;
      }

      if (var11 < -1024) {
         var11 += 2048;
      }

      if (var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
         this.cS = var9;
      }
   }

   public void a(String var1, int var2) {
      this.fx[this.eV] = var1;
      this.eI[this.eV] = var2;
      this.eV++;
   }

   public void b(int var1, int var2) {
      int var3 = this.lc - (var1 - 4);
      int var4 = -var2 + 4 + this.ld;
      int var5 = this.dI;
      int var6 = this.dJ + 1;
      fM = true;
      eM = true;
      int var7 = 6116423;
      rs.p_l.C_c.a(var6, var4, var3, var7, var5);
      rs.p_l.C_c.a(16, var4 + 1, var3 + 1, 0, var5 - 2);
      rs.p_l.C_c.d(var3 + 1, var5 - 2, var6 - 19, 0, var4 + 18);
      gj.b(var7, "Choose Option", var4 + 14, var3 + 3);
      int var8 = C_C_uc.hP - var1;
      int var9 = -var2 + C_C_uc.hQ;
      boolean var10 = false;

      for (int var11 = 0; var11 < this.eV; var11++) {
         int var12 = var4 + 31 + (this.eV - 1 - var11) * 15;
         int var13 = 16777215;
         if (var8 > var3 && var8 < var3 + var5 && var9 > var12 - 13 && var9 < var12 + 3) {
            rs.p_l.C_c.a(15, var12 - 11, var3 + 3, 7301469, this.dI - 6);
            var13 = 16776960;
            this.r.c(var11);
            var10 = true;
         }

         this.gn.a(this.fx[var11], var3 + 3, var12, var13, 0, false);
      }

      if (this.r.b()) {
         rs.p_j.p_b.C_a var20 = this.r.c();
         var3 += var5;
         var4 = var4 + 5 + (this.eV - 1 - var20.d()) * 15;
         var5 = var20.g();
         var6 = var20.h();
         if (var3 + var5 > ai) {
            var3 -= var5;
         }

         var20.b(var3);
         var20.c(var4);
         rs.p_l.C_c.a(var6, var4, var3, var7, var5);
         rs.p_l.C_c.a(16, var4 + 1, var3 + 1, 0, var5 - 2);
         rs.p_l.C_c.d(var3 + 1, var5 - 2, var6 - 19, 0, var4 + 18);
         gj.b(var7, this.r.c().c(), var4 + 14, var3 + 3);
         var20.d(-1);

         for (int var22 = 0; var22 < var20.e(); var22++) {
            int var14 = var4 + 31 + (var20.e() - 1 - var22) * 15;
            int var15 = 16777215;
            if (!var10 && var8 > var3 && var8 < var3 + var5 && var9 > var14 - 13 && var9 < var14 + 3) {
               rs.p_l.C_c.a(15, var14 - 11, var3 + 3, 7301469, var20.g() - 6);
               var15 = 16776960;
               var20.d(var22);
            }

            this.gn.a(var20.f()[var22].a(), var3 + 3, var14, var15, 0, false);
         }
      }
   }

   public void a(long var1) {
      try {
         if (var1 != 0L) {
            if (this.kA >= 350) {
               this.a("Your friendlist is full. Max of 350 users.", 0, "");
            } else {
               String var3 = C_O_uc.c(C_O_uc.a(var1));

               for (int var4 = 0; var4 < this.kA; var4++) {
                  if (this.lg[var4] == var1) {
                     this.a(var3 + " is already on your friend list", 0, "");
                     return;
                  }
               }

               for (int var6 = 0; var6 < this.jD; var6++) {
                  if (this.kP[var6] == var1) {
                     this.a("Please remove " + var3 + " from your ignore list first", 0, "");
                     return;
                  }
               }

               if (!var3.equals(eR.aZ)) {
                  this.mT[this.kA] = var3;
                  this.lg[this.kA] = var1;
                  this.jG[this.kA] = 0;
                  this.kA++;
                  fb = true;
                  fv.a(188);
                  fv.a(var1);
               }
            }
         }
      } catch (RuntimeException var5) {
         rs.p_v.C_a.e("15283, 68, " + var1 + ", " + var5.toString());
         throw new RuntimeException();
      }
   }

   public int c(int var1, int var2, int var3) {
      int var4 = var3 >> 7;
      int var5 = var2 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var1;
         if (var1 < 3 && (this.gc[1][var4][var5] & 2) == 2) {
            var6 = var1 + 1;
         }

         int var7 = var3 & 127;
         int var8 = var2 & 127;
         int var9 = this.fC[var6][var4][var5] * (128 - var7) + this.fC[var6][var4 + 1][var5] * var7 >> 7;
         int var10 = this.fC[var6][var4][var5 + 1] * (128 - var7) + this.fC[var6][var4 + 1][var5 + 1] * var7 >> 7;
         return var9 * (128 - var8) + var10 * var8 >> 7;
      } else {
         return 0;
      }
   }

   public static String g(int var0) {
      if (var0 < 100000) {
         return String.valueOf(var0);
      } else {
         return var0 < 10000000 ? var0 / 1000 + "K" : var0 / 1000000 + "M";
      }
   }

   public static String b(long var0) {
      long var2 = var0 / 1000L;
      long var4 = var0 / 1000000L;
      long var6 = var0 / 1000000000L;
      long var8 = var0 / 1000000000000L;
      String var10 = var0 + "";
      if (var0 > 999L && var0 <= 999999L) {
         var10 = Long.toString(var2) + "K";
      } else if (var0 > 999999L && var0 <= 999999999L) {
         var10 = Long.toString(var4) + "M";
      } else if (var0 > 999999999L && var0 <= 999999999999L) {
         var10 = Long.toString(var6) + "B";
      } else if (var0 > 999999999999L) {
         var10 = Long.toString(var8) + "T";
      }

      return var10;
   }

   private void br() {
      this.bg();
      this.v();
      SwingUtilities.invokeLater(() -> C_Launcher_mc.n().q().b());
      if (rs.p_k.C_e.a()) {
         rs.p_k.C_b.d();
         this.a.d();
         this.a(rs.p_f.C_a.c.a);
      }

      rs.p_l.p_f.p_a.p_i.C_b.m();
      C_GameStateChanged_mc var1 = new C_GameStateChanged_mc();
      var1.setGameState(rs.p_runelite.p_a.C_c.c);
      this.p.post(var1);
      rs.p_d.C_e.a();

      try {
         if (this.nD != null) {
            this.nD.a();
         }
      } catch (Exception var5) {
      }

      int var2 = C_ae.e;

      for (int var3 = 0; var3 < C_ae.c.size(); var3++) {
         int var4 = var2++;
         if (var3 == 0) {
            rs.p_n.C_e.H[var4].E = new rs.p_l.C_F_uc("vote/sprite 2");
            rs.p_n.C_e.H[var4].aG = new rs.p_l.C_F_uc("vote/sprite 2");
         } else {
            rs.p_n.C_e.H[var4].E = new rs.p_l.C_F_uc("vote/sprite 1");
            rs.p_n.C_e.H[var4].aG = new rs.p_l.C_F_uc("vote/sprite 2");
         }
      }

      for (rs.p_l.p_e.C_f var10 : rs.p_l.p_e.C_f.k) {
         var10.c();
      }

      for (rs.p_l.p_e.C_f var11 : rs.p_l.p_e.C_f.l) {
         var11.c();
      }

      rs.p_l.p_f.C_e.d().a();
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

      for (rs.p_n.C_c var12 : rs.p_n.C_d.a) {
         var12.b();
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
      this.v.b[2] = new rs.p_l.C_F_uc("orbs/hp_fill");
      this.m();
      this.dF.b();

      for (int var9 = 0; var9 < 4; var9++) {
         this.fP[var9].a();
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
      this.a(rs.p_f.C_a.c.a);
   }

   private void bs() {
      this.md = true;

      for (int var1 = 0; var1 < 7; var1++) {
         this.mu[var1] = -1;

         for (int var2 = 0; var2 < rs.p_d.C_j.a; var2++) {
            if (!rs.p_d.C_j.b[var2].e && rs.p_d.C_j.b[var2].c == var1 + (this.ml ? 0 : 7)) {
               this.mu[var1] = var2;
               break;
            }
         }
      }
   }

   private void a(int var1, rs.p_x.C_e var2) {
      while (var2.i + 21 < var1 * 8) {
         int var3 = var2.k(14);
         if (var3 != 16383) {
            int var4 = -1;
            if (this.cA[var3] == null) {
               this.cA[var3] = new rs.p_a.C_j();
            } else if (this.cA[var3].aG != null) {
               var4 = (int)this.cA[var3].aG.x;
            }

            rs.p_a.C_j var5 = this.cA[var3];
            this.cC[this.cB++] = var3;
            var5.P = ff;
            int var6 = var2.k(5);
            if (var6 > 15) {
               var6 -= 32;
            }

            int var7 = var2.k(5);
            if (var7 > 15) {
               var7 -= 32;
            }

            int var8 = 0;
            int var9 = 0;
            byte var10 = 0;
            boolean var11 = var2.k(1) == 1;
            if (var11) {
               var8 = var2.k(8);
               var9 = var8;
            }

            var5.aw = var8;
            var5.ax = var9;
            var5.ay = var10;
            boolean var12 = var2.k(1) == 1;
            if (var12) {
               var5.ar = (byte)var2.k(8);
               var5.ao = (byte)var2.k(8);
               var5.ap = (byte)var2.k(8);
               var5.aq = (byte)var2.k(8);
            }

            boolean var13 = var2.k(1) == 1;
            if (var13) {
               int var14 = var2.k(8);
               var5.s = 1024 + var14 * 256;
            } else {
               var5.Q = 0;
               var5.R = 0;
            }

            boolean var17 = true;
            var5.aH = var2.k(1) == 1;
            var5.aG = rs.p_d.C_d.c(var2.k(14));
            if ((long)var4 != var5.aG.x) {
               var5.h.b();
               var5.L = 0;
            }

            boolean var15 = var2.k(1) == 1;
            if (var15) {
               this.kx[this.kw++] = var3;
            }

            var5.S = var5.aG.r;
            var5.o = var5.aG.y;
            var5.ag = var5.aG.q;
            var5.ah = var5.aG.l;
            var5.ai = var5.aG.B;
            var5.aj = var5.aG.j;
            var5.t = var5.aG.w;
            var5.a(eR.k[0] + var7, eR.l[0] + var6, var17);
            C_NpcSpawned_mc var16 = new C_NpcSpawned_mc();
            var16.setNpc(var5);
            this.p.post(var16);
            continue;
         }
         break;
      }

      var2.K();
   }

   public static String c(long var0) {
      long var2 = var0 / 1000L;
      long var4 = var2 / 3600L;
      long var6 = var2 / 60L % 60L;
      long var8 = var2 % 60L;
      String var10 = var8 >= 10L ? var8 + "" : "0" + var8;
      String var11 = var6 >= 10L ? var6 + "" : "0" + var6;
      return var4 + ":" + var11 + ":" + var10 + " ";
   }

   public static String d(long var0) {
      long var2 = var0 / 1000L;
      long var4 = var2 / 60L % 60L;
      long var6 = var2 % 60L;
      String var8 = var6 >= 10L ? var6 + "" : "0" + var6;
      return var4 + ":" + var8 + " ";
   }

   @Override
   public void q() {
      if (!bR) {
         bR = true;
      }

      if (this.cg && !this.ov && !this.kQ && !this.nI) {
         ff++;
         if (ff >= 2147483646) {
            ff = 0;
         }

         if (this.jv < 65) {
            this.jv++;
         }

         if (ff % 7 == 0) {
            for (int var1 = 0; var1 < rs.p_l.C_j.c.length; var1++) {
               int var2 = rs.p_l.C_j.c[var1];
               ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(var2)).a();
            }
         }

         if (ff % 15 == 0 && this.bT > 0L) {
            rs.p_n.C_e.H['\uf2c7'].at = "<img=37> @yel@" + c(this.bT - System.currentTimeMillis());
         }

         if (ff % 30 == 0) {
            rs.p_n.C_e.H['\uf2c8'].az[0] = this.bV[this.bU] + 1;
            rs.p_n.C_e.H['\uf2c8'].ax[0] = 1;
            this.bU++;
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
            if (this.iw.b() || this.ix.a() || rs.p_l.C_s.d()) {
               fM = true;
            }

            this.h();

            for (int var10 = 0; var10 < this.am.size(); var10++) {
               fv.a(103);
               fv.b(this.am.get(var10).length() - 1);
               fv.a(this.am.get(var10).substring(2));
            }

            this.am.clear();
            boolean var11 = false;
            if (this.an != null) {
               fv.a(103);
               fv.b(this.an.length() - 1);
               fv.a(this.an.substring(2));
               this.an = null;
            }

            if (ap != null) {
               if (ap.startsWith("::item_loadout")) {
                  var11 = true;
                  String var12 = ap.replace("::item_loadout ", "");
                  ArrayList var3 = new ArrayList();

                  for (int var4 = 0; var4 < var12.split(" ").length; var4++) {
                     String var5 = var12.split(" ")[var4];
                     var3.add(var5);
                     if (var3.size() >= 3 || var4 == var12.split(" ").length - 1) {
                        String var6 = "::item_loadout ";

                        for (Object var8Obj : var3) {
                           String var8 = (String)var8Obj;
                           var6 = var6 + var8 + " ";
                        }

                        fv.a(103);
                        fv.b(var6.length() - 1);
                        fv.a(var6.substring(2));
                        var3.clear();
                     }
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
                  var11 = true;
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
            if (var11) {
               String var13 = "::spawn_loadout";
               fv.a(103);
               fv.b(var13.length() - 1);
               fv.a(var13.substring(2));
            }

            this.cv.a();
         }

         if (!rs.p_h.C_f.a(this) && !rs.p_h.C_f.b(this)) {
            this.s();
            rs.p_h.C_a.a();
            if (this.fc) {
               rs.p_h.C_c.a();
            }
         } else {
            this.a(1, "Loading - please wait.", null);

            try {
               Thread.sleep(250L);
            } catch (InterruptedException var9) {
               throw new RuntimeException(var9);
            }
         }
      }
   }

   public void e(boolean var1) {
      if (eR.ac >> 7 == this.gd && eR.ad >> 7 == this.ge) {
         this.gd = 0;
      }

      int var2 = this.ku;
      if (var1) {
         var2 = 1;
      }

      rs.p_a.C_k var3 = null;
      if (!var1 && eR.m >= 32768) {
         int var12 = eR.m - 32768;
         if (var12 == di) {
            var12 = 2047;
         }

         this.iJ = var12;
         rs.p_a.C_k var5 = kw_do[var12];
         if (var5 != null && !var5.aZ.equalsIgnoreCase(eR.aZ)) {
            var3 = var5;
         }
      } else if (this.iJ >= 0 && this.iJ <= kw_do.length - 1) {
         rs.p_a.C_k var4 = kw_do[this.iJ];
         if (var4 != null && !var4.aZ.equalsIgnoreCase(eR.aZ)) {
            var3 = var4;
         }
      }

      for (int var13 = 0; var13 < var2; var13++) {
         int var6;
         rs.p_a.C_k var14;
         if (var1 && rs.p_f.C_a.N) {
            var14 = eR;
            var6 = 33538048;
         } else {
            var14 = kw_do[this.kv[var13]];
            var6 = this.kv[var13] << 14;
         }

         if (var14 != null && var14.l()) {
            var14.aU = false;
            int var7 = var14.ac >> 7;
            int var8 = var14.ad >> 7;
            if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
               if (!var1) {
                  int var9 = eh + (var14.ac - 6 >> 7);
                  int var10 = ei + (var14.ad - 6 >> 7);
                  int var11 = (var9 >> 6) * 256 + (var10 >> 6);
                  if (var11 == 10806 && this.kw_if.get(var9 + "," + var10) != null) {
                     continue;
                  }
               } else if (rs.p_f.C_a.bq) {
                  continue;
               }

               if (var3 == null || var3.ac != var14.ac || var3.ad != var14.ad || var3.aZ.equals(var14.aZ) || var14.aZ.equalsIgnoreCase(eR.aZ)) {
                  if (ed != 197 && rs.p_f.C_a.aY && !rs.p_k.C_e.a()) {
                     var14.aU = this.ku >= 35 && !var1 && var14.w == var14.t && var14.F <= 0;
                  }

                  if (var14.bq != null && ff >= var14.bj && ff < var14.bk) {
                     var14.aU = false;
                     var14.bl = this.c(dw, var14.ad, var14.ac);
                     this.dF.a(dw, var14.ad, var14, var14.ae, var14.bw, var14.ac, var14.bl, var14.bt, var14.bv, var6, var14.bu);
                  } else {
                     if ((var14.ac & 127) == 64 && (var14.ad & 127) == 64) {
                        if (this.kS[var7][var8] == gf) {
                           continue;
                        }

                        this.kS[var7][var8] = gf;
                     }

                     var14.bl = this.c(dw, var14.ad, var14.ac);
                     this.dF.a(dw, var14.ae, var14.bl, var6, var14.ad, 60, var14.ac, var14, var14.T);
                  }
               }
            }
         }
      }
   }

   private boolean c(rs.p_n.C_e var1) {
      int var2 = var1.J;
      if (this.kB == 2) {
         if (var2 == 201) {
            fM = true;
            this.fN = 0;
            this.gb = true;
            this.fB = "";
            this.ev = 1;
            this.eQ = "Enter name of friend to add to list";
         }

         if (var2 == 202) {
            fM = true;
            this.fN = 0;
            this.gb = true;
            this.fB = "";
            this.ev = 2;
            this.eQ = "Enter name of friend to delete from list";
         }
      }

      if (var2 == 205) {
         this.lR = 250;
         return true;
      } else {
         if (var2 == 501) {
            fM = true;
            this.fN = 0;
            this.gb = true;
            this.fB = "";
            this.ev = 4;
            this.eQ = "Enter name of player to add to list";
         }

         if (var2 == 502) {
            fM = true;
            this.fN = 0;
            this.gb = true;
            this.fB = "";
            this.ev = 5;
            this.eQ = "Enter name of player to delete from list";
         }

         if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 1;
            int var5 = this.mu[var3];
            if (var5 != -1) {
               do {
                  if (var4 == 0) {
                     if (--var5 < 0) {
                        var5 = rs.p_d.C_j.a - 1;
                     }
                  }

                  if (var4 == 1) {
                     if (++var5 >= rs.p_d.C_j.a) {
                        var5 = 0;
                     }
                  }
               } while (rs.p_d.C_j.b[var5].e || rs.p_d.C_j.b[var5].c != var3 + (this.ml ? 0 : 7));

               this.mu[var3] = var5;
               this.md = true;
            }
         }

         if (var2 >= 314 && var2 <= 323) {
            int var6 = (var2 - 314) / 2;
            int var9 = var2 & 1;
            int var10 = this.lB[var6];
            if (var9 == 0) {
               if (--var10 < 0) {
                  var10 = dU[var6].length - 1;
               }
            }

            if (var9 == 1) {
               if (++var10 >= dU[var6].length) {
                  var10 = 0;
               }
            }

            this.lB[var6] = var10;
            this.md = true;
         }

         if (var2 == 324 && !this.ml) {
            this.ml = true;
            this.bs();
         }

         if (var2 == 325 && this.ml) {
            this.ml = false;
            this.bs();
         }

         if (var2 != 326) {
            if (var2 == 613) {
               this.nz = !this.nz;
            }

            if (var2 >= 601 && var2 <= 612) {
               this.bQ();
               if (this.kr.length() > 0) {
                  fv.a(218);
                  fv.a(C_O_uc.a(this.kr));
                  fv.b(var2 - 601);
                  fv.b(this.nz ? 1 : 0);
               }
            }

            return false;
         } else {
            fv.a(101);
            fv.b(this.ml ? 0 : 1);

            for (int var7 = 0; var7 < 7; var7++) {
               fv.b(this.mu[var7]);
            }

            for (int var8 = 0; var8 < 5; var8++) {
               fv.b(this.lB[var8]);
            }

            return true;
         }
      }
   }

   private void a(rs.p_x.C_e var1) {
      long var2 = System.currentTimeMillis();

      for (int var4 = 0; var4 < this.kw; var4++) {
         int var5 = this.kx[var4];
         rs.p_a.C_k var6 = kw_do[var5];
         int var7 = var1.y();
         if (rs.p_f.C_a.d) {
            cx.add("\t->[" + var5 + "] STARTING mask=" + var7);
         }

         if ((var7 & 64) != 0) {
            var7 += var1.y() << 8;
            if (rs.p_f.C_a.d) {
               cx.add("\t->shiftingMask=" + var7);
            }
         }

         this.a(var7, var5, var1, var6);
      }
   }

   private void d(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this.dF.a(var5, var3, var1);
      if (~((long)var6) != -1L || var6 != 0) {
         int var7 = this.dF.b(var5, var3, var1, var6);
         int var8 = var7 >> 6 & 3;
         int var9 = var7 & 31;
         int var10 = var2;
         if (var6 > 0) {
            var10 = var4;
         }

         int[] var11 = this.aT.m;
         int var12 = 24624 + var3 * 4 + (103 - var1) * 512 * 4;
         int var13 = this.dF.b(var5, var3, var1);
         rs.p_d.C_r var14 = rs.p_d.C_r.c(var13);
         if (var14.ac != -1) {
            rs.p_l.C_a var15 = var14.ac >= 0 && var14.ac < this.mq.length ? this.mq[var14.ac] : null;
            if (var15 != null) {
               int var16 = (var14.U * 4 - var15.j) / 2;
               int var17 = (var14.af * 4 - var15.k) / 2;
               var15.a(48 + var3 * 4 + var16, 48 + (104 - var1 - var14.af) * 4 + var17);
            }
         } else if (~var14.ac == 0) {
            if (var9 == 0 || var9 == 2) {
               if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (~var8 == -2 || var8 == 1) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 3 + 512] = var10;
                  var11[var12 + 3 + 1024] = var10;
                  var11[var12 + 3 + 1536] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }

            if (var9 == 3) {
               if (var8 == 0) {
                  var11[var12] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 3 + 1536] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
               }
            }

            if (var9 == 2) {
               if (var8 == 3) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 3 + 512] = var10;
                  var11[var12 + 3 + 1024] = var10;
                  var11[var12 + 3 + 1536] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }
         }
      }

      var6 = this.dF.e(var5, var3, var1);
      if (var6 != 0) {
         int var20 = this.dF.b(var5, var3, var1, var6);
         int var23 = var20 >> 6 & 3;
         int var26 = var20 & 31;
         int var29 = this.dF.f(var5, var3, var1);
         rs.p_d.C_r var33 = rs.p_d.C_r.c(var29);
         if (var33.ac != -1) {
            rs.p_l.C_a var35 = var33.ac >= 0 && var33.ac < this.mq.length ? this.mq[var33.ac] : null;
            if (var35 != null) {
               int var38 = (var33.U * 4 - var35.j) / 2;
               int var41 = (var33.af * 4 - var35.k) / 2;
               var35.a(48 + var3 * 4 + var38, 48 + (104 - var1 - var33.af) * 4 + var41);
            }
         } else if (var26 == 9) {
            int var36 = 15658734;
            if (var6 > 0) {
               var36 = 15597568;
            }

            int[] var39 = this.aT.m;
            int var42 = 24624 + var3 * 4 + (103 - var1) * 512 * 4;
            if (var23 != 0 && var23 != 2) {
               var39[var42] = var36;
               var39[var42 + 512 + 1] = var36;
               var39[var42 + 1024 + 2] = var36;
               var39[var42 + 1536 + 3] = var36;
            } else {
               var39[var42 + 1536] = var36;
               var39[var42 + 1024 + 1] = var36;
               var39[var42 + 512 + 2] = var36;
               var39[var42 + 3] = var36;
            }
         }
      }

      var6 = this.dF.h(var5, var3, var1);
      if (var6 > 0 || var6 != 0) {
         rs.p_d.C_r var21 = rs.p_d.C_r.c(var6);
         if (var21.ac != -1) {
            rs.p_l.C_a var24 = var21.ac >= 0 && var21.ac < this.mq.length ? this.mq[var21.ac] : null;
            if (var24 != null) {
               int var27 = (var21.U * 4 - var24.j) / 2;
               int var30 = (var21.af * 4 - var24.k) / 2;
               var24.a(48 + var3 * 4 + var27, 48 + (104 - var1 - var21.af) * 4 + var30);
            }
         }
      }

      if (rs.p_f.C_a.aX && this.x.N() && ed == 197) {
         int var22 = var3 + eh;
         int var25 = var1 + ei;
         if (this.k(var22, var25)) {
            int var28 = 24624 + var3 * 4 + (103 - var1) * 512 * 4;
            if (var28 < 0 || var28 + 3 >= this.aT.m.length) {
               return;
            }

            int var31 = this.aT.m[var28];
            int var34 = 16711680;
            byte var37 = 100;
            int var40 = 256 - var37;
            var31 = ((var34 & 16711935) * var37 + (var31 & 16711935) * var40 & -16711936) + ((var34 & 0xFF00) * var37 + (var31 & 0xFF00) * var40 & 0xFF0000)
               >> 8;
            this.aT.m[var28] = var31;
            this.aT.m[var28 + 1] = var31;
            this.aT.m[var28 + 2] = var31;
            this.aT.m[var28 + 3] = var31;
         }
      }
   }

   private void bt() {
      this.ll = new rs.p_l.C_a(this.mo, "titlebox", 0);
      this.lm = new rs.p_l.C_a(this.mo, "titlebutton", 0);
      this.nw = new rs.p_l.C_a[12];
      int var1 = 0;

      try {
         var1 = Integer.parseInt(this.getParameter("fl_icon"));
      } catch (Exception var3) {
      }

      if (var1 == 0) {
         for (int var2 = 0; var2 < 12; var2++) {
            this.nw[var2] = new rs.p_l.C_a(this.mo, "runes", var2);
         }
      } else {
         for (int var4 = 0; var4 < 12; var4++) {
            this.nw[var4] = new rs.p_l.C_a(this.mo, "runes", 12 + (var4 & 3));
         }
      }

      this.nV = new rs.p_l.C_F_uc(128, 265);
      this.nW = new rs.p_l.C_F_uc(128, 265);
      this.jV = new int[256];

      for (int var5 = 0; var5 < 64; var5++) {
         this.jV[var5] = var5 * 262144;
      }

      for (int var6 = 0; var6 < 64; var6++) {
         this.jV[var6 + 64] = 16711680 + 1024 * var6;
      }

      for (int var7 = 0; var7 < 64; var7++) {
         this.jV[var7 + 128] = 16776960 + 4 * var7;
      }

      for (int var8 = 0; var8 < 64; var8++) {
         this.jV[var8 + 192] = 16777215;
      }

      this.jW = new int[256];

      for (int var9 = 0; var9 < 64; var9++) {
         this.jW[var9] = var9 * 1024;
      }

      for (int var10 = 0; var10 < 64; var10++) {
         this.jW[var10 + 64] = 65280 + 4 * var10;
      }

      for (int var11 = 0; var11 < 64; var11++) {
         this.jW[var11 + 128] = 65535 + 262144 * var11;
      }

      for (int var12 = 0; var12 < 64; var12++) {
         this.jW[var12 + 192] = 16777215;
      }

      this.jX = new int[256];

      for (int var13 = 0; var13 < 64; var13++) {
         this.jX[var13] = var13 * 4;
      }

      for (int var14 = 0; var14 < 64; var14++) {
         this.jX[var14 + 64] = 255 + 262144 * var14;
      }

      for (int var15 = 0; var15 < 64; var15++) {
         this.jX[var15 + 128] = 16711935 + 1024 * var15;
      }

      for (int var16 = 0; var16 < 64; var16++) {
         this.jX[var16 + 192] = 16777215;
      }

      this.jU = new int[256];
      this.nP = new int[32768];
      this.nQ = new int[32768];
      this.a((java.awt.event.MouseWheelEvent)null);
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
      rs.p_l.C_E_uc.n = false;
      li = false;
      C_x.h = false;
      rs.p_d.C_r.Z = false;
   }

   public static void main(String[] var0) {
      try {
         dK = 10;
         dL = 0;
         aa();
         dM = true;
         bW = 32;
         C_Client_mc var1 = new C_Client_mc();
         var1.l(503, 765);
         var1.a(rs.p_f.C_a.c.b);
      } catch (Exception var2) {
      }
   }

   public void a(int var1, String var2, String var3) {
      int var4 = this.gi.a(var1 == 1 ? var2 : var3);
      int var5 = var3 == null ? 25 : 38;
      int var6 = !ai() ? 4 : 0;
      int var7 = !ai() ? 4 : 0;
      int var8 = 1 + var6;
      int var9 = 1 + var7;
      rs.p_l.C_c.a(var5, var9, var8, 0, var4 + 6);
      rs.p_l.C_c.a(1, var9, var8, 16777215, var4 + 6);
      rs.p_l.C_c.a(var5, var9, var8, 16777215, 1);
      rs.p_l.C_c.a(1, var5 + var7, var8, 16777215, var4 + 6);
      rs.p_l.C_c.a(var5, var9, var4 + 6 + var6, 16777215, 1);
      this.gi.a(16777215, var2, 18 + var7, var4 / 2 + 5 + var6);
      if (var3 != null) {
         this.gi.a(16777215, var3, 31 + var7, var4 / 2 + 5 + var6);
      }
   }

   private void bv() {
      if (this.iK) {
         this.a(1, "Loading - please wait.", null);
         ee = 1;
         this.jE = System.currentTimeMillis();
      } else {
         if (li && ee == 2 && C_x.f != dw) {
            this.a(1, "Loading - please wait.", null);
            ee = 1;
            this.jE = System.currentTimeMillis();
         }

         if (ee == 1) {
            int var1 = this.bw();
            if (var1 != 0 && System.currentTimeMillis() - this.jE > 360000L) {
               rs.p_v.C_a.e(this.fk + " glcfb " + this.od + "," + var1 + "," + li + "," + ew.g() + "," + dw + "," + this.mx + "," + this.my);
               this.jE = System.currentTimeMillis();
            }
         }

         if (ee == 2 && dw != this.dR) {
            this.dR = dw;
            this.z(dw);
            if (rs.p_f.C_a.Q && !rs.p_k.C_e.a()) {
               try {
                  rs.p_k.C_b.b();
               } catch (Exception var2) {
                  var2.printStackTrace();
                  System.exit(0);
               }
            }
         }
      }
   }

   private int bw() {
      for (int var1 = 0; var1 < this.fr.length; var1++) {
         if (this.fr[var1] == null && this.fS[var1] != -1) {
            return -1;
         }

         if (this.fY[var1] == null && this.fT[var1] != -1) {
            return -2;
         }
      }

      boolean var8 = true;

      for (int var2 = 0; var2 < this.fr.length; var2++) {
         byte[] var3 = this.fY[var2];
         if (var3 != null) {
            int var4 = (this.fR[var2] >> 8) * 64 - eh;
            int var5 = (this.fR[var2] & 0xFF) * 64 - ei;
            if (this.nA) {
               var4 = 10;
               var5 = 10;
            }

            try {
               var8 &= C_x.a(var4, var3, var5);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }
      }

      if (!var8) {
         return -3;
      } else if (this.mS) {
         return -4;
      } else {
         ee = 2;
         C_x.f = dw;
         this.l();
         fv.a(121);
         return 0;
      }
   }

   public void r() {
      for (rs.p_a.C_l var1 = (rs.p_a.C_l)this.ea.b(); var1 != null; var1 = (rs.p_a.C_l)this.ea.d()) {
         if (var1.p != dw || ff > var1.i) {
            var1.b();
         } else if (ff >= var1.h) {
            if (var1.n > 0) {
               rs.p_a.C_j var2 = this.cA[var1.n - 1];
               if (var2 != null && var2.ac >= 0 && var2.ac < 13312 && var2.ad >= 0 && var2.ad < 13312) {
                  var1.a(ff, var2.ad, this.c(var1.p, var2.ad, var2.ac) - var1.j, var2.ac);
               }
            }

            if (var1.n < 0) {
               int var4 = -var1.n - 1;
               rs.p_a.C_k var3;
               if (var4 == di) {
                  var3 = eR;
               } else {
                  var3 = kw_do[var4];
               }

               if (var3 != null && var3.ac >= 0 && var3.ac < 13312 && var3.ad >= 0 && var3.ad < 13312) {
                  var1.a(ff, var3.ad, this.c(var1.p, var3.ad, var3.ac) - var1.j, var3.ac);
               }
            }

            var1.a(this.dE);
            this.dF.a(dw, var1.o, (int)var1.m, -1, (int)var1.l, 60, (int)var1.k, var1, false);
         }
      }
   }

   @Override
   public AppletContext getAppletContext() {
      return rs.p_v.C_a.h.getAppletContext();
   }

   public void s() {
      while (true) {
         rs.p_cache.C_c var1 = ew.b();
         if (var1 == null) {
            return;
         }

         if (var1.j == 0) {
            rs.p_a.C_h.a(var1.l, var1.m, var1.k == 1);
            fb = true;
            if (this.gp != -1) {
               fM = true;
            }
         }

         if (var1.j == 1) {
            int var2 = (var1.l[1] & 255) + ((var1.l[0] & 255) << 8);
            if (var2 == 420) {
               rs.p_u.C_b.a(var1.m, var1.l);
            } else {
               C_k.a(var1.m, var1.l, var1.k == 1);
            }
         }

         if (var1.j == 2) {
            if (var1.k == 1) {
               C_L_uc.a.a(var1.m, var1.l);
            } else if (var1.m == this.oi && var1.l != null) {
               this.a(this.oj, var1.l);
            }
         }

         if (var1.j == 3 && (ee == 1 || this.bX)) {
            for (int var3 = 0; var3 < this.fr.length; var3++) {
               if (this.fS[var3] == var1.m) {
                  this.fr[var3] = var1.l;
                  if (var1.l == null) {
                     this.fS[var3] = -1;
                  }
                  break;
               }

               if (this.fT[var3] == var1.m) {
                  this.fY[var3] = var1.l;
                  if (var1.l == null) {
                     this.fT[var3] = -1;
                  }
                  break;
               }
            }
         }

         if (var1.j == 93 && ew.c(var1.m)) {
            C_x.a(new rs.p_x.C_e(var1.l), ew);
         }
      }
   }

   private boolean a(byte[] var1, int var2) {
      return var1 == null || rs.p_v.C_a.a(var1, var2);
   }

   private void C(int var1) {
      rs.p_n.C_e var2 = rs.p_n.C_e.H[var1];
      if (rs.p_n.C_e.H[var1] == null) {
         System.out.println("Nulled interface!");
      }

      for (int var3 = 0; var3 < var2.al.length && var2.al[var3] != -1; var3++) {
         rs.p_n.C_e var4 = rs.p_n.C_e.H[var2.al[var3]];
         if (var4.aI == 1) {
            this.C(var4.aw);
         }

         var4.ar = 0;
         var4.F = 0;
      }
   }

   public void t() {
      if (this.jZ == 2) {
         this.g((this.kW - eh << 7) + this.kZ, this.kY * 2, (this.kX - ei << 7) + this.la);
         if (this.dN > -1 && ff % 20 < 10) {
            this.mX[0].f(this.dN - 12, this.dO - 28);
         }
      }
   }

   private void bx() {
      if (this.eA != 0) {
         if (!this.hS) {
            this.dT++;
         }

         int var1 = this.hS ? 16 : 5;
         if (C_C_uc.hP > this.eB + var1 || C_C_uc.hP < this.eB - var1 || C_C_uc.hQ > this.eC + var1 || C_C_uc.hQ < this.eC - var1) {
            this.op = true;
         }

         if (super.hM == 0) {
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
                  rs.p_n.C_e var9 = rs.p_n.C_e.H[this.ex];
                  boolean var10 = false;
                  if (this.ex == 33003
                     && (this.mv == 0 || this.mv == 2 || this.mv == 9 || this.mv == 11 || this.ey == 0 || this.ey == 2 || this.ey == 9 || this.ey == 11)) {
                     var10 = true;
                  }

                  if (!var10) {
                     byte var11 = 0;
                     if (this.kM == 1 && var9.J == 206) {
                        var11 = 1;
                     }

                     if (var9.az[this.mv] <= 0) {
                        var11 = 0;
                     }

                     if (var9.ag) {
                        int var12 = this.ey;
                        int var14 = this.mv;
                        var9.az[var14] = var9.az[var12];
                        var9.ax[var14] = var9.ax[var12];
                        var9.az[var12] = -1;
                        var9.ax[var12] = 0;
                     } else if (var11 == 1) {
                        int var13 = this.ey;
                        int var15 = this.mv;

                        while (var13 != var15) {
                           if (var13 > var15) {
                              var9.a(var13, var13 - 1);
                              var13--;
                           } else if (var13 < var15) {
                              var9.a(var13, var13 + 1);
                              var13++;
                           }
                        }
                     } else {
                        var9.a(this.ey, this.mv);
                     }

                     fv.a(214);
                     fv.p(this.ex);
                     fv.l(var11);
                     fv.p(this.ey);
                     fv.n(this.mv);
                  }
               } else if (this.mw == 33003 && this.ex == 33002 || this.mw == 33002 && this.ex == 33003) {
                  int var2 = this.ey;
                  int var3 = this.mv;
                  boolean var4 = false;
                  if (this.mw == 33003 && (var3 == 0 || var3 == 2 || var3 == 9 || var3 == 11)) {
                     var4 = true;
                  }

                  if (this.ex == 3303 && (var2 == 0 || var2 == 2 || var2 == 9 || var2 == 11)) {
                     var4 = true;
                  }

                  if (!var4) {
                     rs.p_n.C_e var5 = rs.p_n.C_e.H[this.ex];
                     rs.p_n.C_e var6 = rs.p_n.C_e.H[this.mw];
                     int var7 = var6.az[var3];
                     int var8 = var6.ax[var3];
                     var6.az[var3] = var5.az[var2];
                     var6.ax[var3] = var5.ax[var2];
                     var5.az[var2] = var7;
                     var5.ax[var2] = var8;
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
            super.hU = 0;
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
      super.hM = super.hU = 0;
   }

   private void by() {
      int var1;
      int var2;
      synchronized (this.hR) {
         var2 = this.hT;
         var1 = this.hR.a(this.iM);
      }

      try {
         for (int var12 = 0; var12 < var1; var12++) {
            if (var2 != this.hT || !this.fc || !this.hJ) {
               this.v();
               break;
            }

            rs.p_m.C_a.a var4 = this.iM[var12];
            super.hU = 0;
            if (var4.a == 4) {
               this.v();
            } else if (var4.a == 5) {
               n(var4.b);
            } else {
               hP = var4.c;
               hQ = var4.d;
               if (var4.a == 1) {
                  super.hV = var4.c;
                  super.hW = var4.d;
                  super.hX = var4.i;
                  super.hU = var4.b;
                  super.hM = var4.b;
                  if (this.cD != null && var4.b == 1) {
                     this.cD = null;
                     fM = true;
                  } else {
                     if (!dj && this.eA == 0) {
                        this.H();
                        this.bM();
                     }

                     this.bm();
                  }
               } else if (var4.a == 2) {
                  if (var4.b == this.iO) {
                     if (this.iQ && !this.iP.a(this)) {
                        this.v();
                     } else {
                        super.hM = 0;
                        this.g(var4.i);
                        this.bx();
                        this.iQ = false;
                        this.iO = 0;
                     }
                  } else if (var4.b == super.hM) {
                     super.hM = 0;
                  }
               } else if (var4.a == 3 && this.eA != 0) {
                  if (var4.e < this.eB - 16 || var4.f > this.eB + 16 || var4.g < this.eC - 16 || var4.h > this.eC + 16) {
                     this.op = true;
                  }

                  this.g(var4.i);
                  this.bx();
               }
            }
         }
      } catch (RuntimeException var10) {
         this.v();
         this.bg();
         throw var10;
      } finally {
         super.hU = 0;
         this.bh();
      }

      if (this.eA != 0) {
         this.g(System.currentTimeMillis());
      }
   }

   private void g(long var1) {
      this.dT = (int)Math.min(2147483647L, Math.max(0L, var1 - this.iN) / 20L);
   }

   private void bz() {
      if (this.lR > 0) {
         this.lR--;
      }

      int var1 = 0;

      while (var1 < 100 && this.bP()) {
         var1++;
      }

      if (this.fc) {
         if (System.currentTimeMillis() - this.iR >= 500L) {
            this.iR = System.currentTimeMillis() + 500L;
            if (rs.p_d.C_d.e == 0) {
               rs.p_d.C_d.e = 1;
            }

            rs.p_d.C_d.e++;
            if (rs.p_d.C_d.e > 5) {
               rs.p_d.C_d.e = 1;
            }
         }

         if (super.hU != 0) {
            long var10 = (super.hX - this.oe) / 50L;
            if (var10 > 4095L) {
               var10 = 4095L;
            }

            this.oe = super.hX;
            int var3 = super.hW;
            if (var3 < 0) {
               var3 = 0;
            } else if (var3 > 502) {
               var3 = 502;
            }

            int var4 = super.hV;
            if (var4 < 0) {
               var4 = 0;
            } else if (var4 > 764) {
               var4 = 764;
            }

            int var5 = var3 * 765 + var4;
            boolean var6 = false;
            if (super.hU == 2) {
               var6 = true;
            }

            int var7 = (int)var10;
         }

         if (this.lS > 0) {
            this.lS--;
         }

         if (super.hY[1] == 1 || super.hY[2] == 1 || super.hY[3] == 1 || super.hY[4] == 1) {
            this.lT = true;
         }

         if (this.lT && this.lS <= 0) {
            this.lS = 20;
            this.lT = false;
            fv.a(86);
            fv.d(this.fs);
            fv.o(this.ft);
         }

         if (super.hJ && !this.lf) {
            this.lf = true;
            fv.a(3);
            fv.b(1);
         }

         if (!super.hJ && this.lf) {
            this.lf = false;
            fv.a(3);
            fv.b(0);
         }

         this.bv();
         this.bJ();
         this.K();
         this.lP++;
         if (this.lP > 750 && rs.p_f.C_a.l) {
            this.x();
         }

         this.bI();
         this.bF();
         this.bq();
         this.dE++;
         if (this.dv != 0) {
            this.du += 20;
            if (this.du >= 400) {
               this.dv = 0;
            }
         }

         if (this.fX != 0) {
            this.oq++;
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
            var1 = C_V_uc.r;
            int var2 = C_V_uc.s;
            boolean var15 = this.a(0, 0, 0, 0, eR.l[0], 0, 0, var2, eR.k[0], true, var1);
            C_V_uc.r = -1;
            if (var15) {
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 1;
               this.du = 0;
            }
         }

         if (super.hU == 1 && this.cD != null) {
            this.cD = null;
            fM = true;
            super.hU = 0;
         }

         this.bm();
         if (super.hM == 1 || super.hU == 1) {
            this.oc++;
         }

         if (ee == 2) {
            this.S();
         }

         if (ee == 2 && this.fe) {
            this.p();
         }

         for (int var12 = 0; var12 < 5; var12++) {
            this.eg[var12]++;
         }

         this.C();
         super.hL++;
         super.hK++;
         if (super.hK > 4500) {
            this.lR = 250;
            super.hK -= 500;
            fv.a(202);
         }

         this.lQ++;
         if (this.lQ > 50) {
            fv.a(0);
         }

         if (!rs.p_f.C_a.aF && ic > 0L && !rs.p_f.C_a.aE && System.currentTimeMillis() - this.id > ic && this.ie.size() > 0) {
            for (rs.p_q.p_a.C_a var14 : this.ie) {
               fv.a(41);
               fv.d(var14.a());
               fv.o(var14.b());
               fv.o(var14.c());
            }

            this.ie.clear();
         }

         try {
            if (this.nD != null && fv.h > 0) {
               this.nD.a(fv.h, fv.g);
               fv.h = 0;
               this.lQ = 0;
            }
         } catch (IOException var8) {
            var8.printStackTrace();
            this.x();
         } catch (Exception var9) {
            var9.printStackTrace();
            this.br();
         }
      }
   }

   private void bA() {
      for (C_N_uc var1 = (C_N_uc)this.nL.b(); var1 != null; var1 = (C_N_uc)this.nL.d()) {
         if (var1.g == -1) {
            var1.o = 0;
            this.a(var1);
         } else {
            var1.b();
         }
      }
   }

   public void w() {
   }

   public void b(int var1, String var2, String var3) {
      if (this.G != null) {
         this.G.a(var1, var2, var3);
      }
   }

   @Override
   public void a(int var1, String var2) {
      if (this.G != null) {
         this.G.a(var1, var2, "@yel@Current Progress - " + var1 + "%");
      }
   }

   public void a(int var1, int var2, int var3, int var4, rs.p_n.C_e var5, int var6, boolean var7, int var8) {
      byte var9;
      if (this.lp) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      this.lp = false;
      if (var3 >= var1 && var3 < var1 + 16 && var4 >= var6 && var4 < var6 + 16) {
         var5.V = var5.V - this.oc * 4;
         if (var7) {
            fb = true;
         }
      } else if (var3 >= var1 && var3 < var1 + 16 && var4 >= var6 + var2 - 16 && var4 < var6 + var2) {
         var5.V = var5.V + this.oc * 4;
         if (var7) {
            fb = true;
         }
      } else if (var3 >= var1 - var9 && var3 < var1 + 16 + var9 && var4 >= var6 + 16 && var4 < var6 + var2 - 16 && this.oc > 0) {
         int var10 = (var2 - 32) * var2 / var8;
         if (var10 < 8) {
            var10 = 8;
         }

         int var11 = var4 - var6 - 16 - var10 / 2;
         int var12 = var2 - 32 - var10;
         var5.V = (var8 - var2) * var11 / var12;
         if (var7) {
            fb = true;
         }

         this.lp = true;
      }
   }

   private boolean d(int var1, int var2, int var3, int var4) {
      int var5 = this.dF.b(dw, var3, var2, var1);
      if (var1 == -1) {
         return false;
      } else {
         int var6 = var5 & 31;
         int var7 = var5 >> 6 & 3;
         if (var6 != 10 && var6 != 11 && var6 != 22) {
            if (rs.p_f.C_a.c()) {
               System.out
                  .println(
                     "on :interact_object, "
                        + var4
                        + ", :width => 1, :height => 1, :source => pos("
                        + (var3 + eh)
                        + ", "
                        + (var2 + ei)
                        + ") do |player, event|"
                  );
            }

            this.a(2, var7, 0, var6 + 1, eR.l[0], 0, 0, var2, eR.k[0], false, var3);
         } else {
            rs.p_d.C_r var8 = rs.p_d.C_r.c(var4);
            int var9;
            int var10;
            if (var7 != 0 && var7 != 2) {
               var9 = var8.af;
               var10 = var8.U;
            } else {
               var9 = var8.U;
               var10 = var8.af;
            }

            if (rs.p_f.C_a.c()) {
               System.out
                  .println(
                     "on :interact_object, "
                        + var4
                        + ", :width => "
                        + var9
                        + ", :height => "
                        + var10
                        + ", :source => pos("
                        + (var3 + eh)
                        + ", "
                        + (var2 + ei)
                        + ") do |player, event|"
                  );
            }

            int var11 = var8.ak & 15;
            if (var7 != 0) {
               var11 = (var11 << var7 & 15) + (var11 >> 4 - var7);
            }

            boolean var12 = this.a(2, 0, var10, 0, eR.l[0], var9, var11, var2, eR.k[0], false, var3);
         }

         C_ObjectInteraction_mc var13 = new C_ObjectInteraction_mc();
         var13.setX(var3);
         var13.setY(var2);
         var13.setZ(dw);
         var13.setHash(var1);
         var13.setId(var4);
         this.p.post(var13);
         this.ds = super.hV;
         this.dt = super.hW;
         this.dv = 2;
         this.du = 0;
         return true;
      }
   }

   private boolean h(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & 32767;
      int var5 = this.dF.b(dw, var3, var2, var1);
      if (var5 == -1) {
         return false;
      } else {
         int var6 = var5 & 31;
         int var7 = var5 >> 6 & 3;
         if (var6 != 10 && var6 != 11 && var6 != 22) {
            this.a(2, var7, 0, var6 + 1, eR.l[0], 0, 0, var2, eR.k[0], false, var3);
         } else {
            rs.p_d.C_r var8 = rs.p_d.C_r.c(var4);
            int var9;
            int var10;
            if (var7 != 0 && var7 != 2) {
               var9 = var8.af;
               var10 = var8.U;
            } else {
               var9 = var8.U;
               var10 = var8.af;
            }

            int var11 = var8.ak & 15;
            if (var7 != 0) {
               var11 = (var11 << var7 & 15) + (var11 >> 4 - var7);
            }

            this.a(2, 0, var10, 0, eR.l[0], var9, var11, var2, eR.k[0], false, var3);
         }

         this.ds = super.hV;
         this.dt = super.hW;
         this.dv = 2;
         this.du = 0;
         return true;
      }
   }

   public rs.p_x.C_f a(int var1, String var2, String var3, int var4, int var5) {
      byte[] var6 = null;

      try {
         if (ew.b.a()[0] != null) {
            var6 = ew.b.a()[0].a(var1);
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      if (var6 != null) {
         return new rs.p_x.C_f(var6, var2);
      } else {
         this.a(var5, "Error loading: " + var2);
         System.out.println("Error loading \"" + var2 + "\"");
         return null;
      }
   }

   public void x() {
      try {
         if (this.lR > 0) {
            this.br();
            return;
         }

         this.gi.a(0, "Connection lost", 144, 257);
         this.gi.a(16777215, "Connection lost", 143, 256);
         this.gi.a(0, "Please wait - attempting to reestablish", 159, 257);
         this.gi.a(16777215, "Please wait - attempting to reestablish", 158, 256);
         if (rs.p_k.C_e.a()) {
            this.a.b(false);
         }

         this.lV = 0;
         this.gd = 0;
         rs.p_q.C_b var1 = this.nD;
         this.fc = false;
         this.el = 0;
         this.a(this.fk, this.fl, true);
         if (!this.fc) {
            this.br();
         }

         var1.a();
      } catch (Exception var2) {
      }
   }

   public static int c(int var0, int var1) {
      Random var2 = new Random();
      return var2.nextInt(var1 - var0 + 1) + var0;
   }

   private void D(int var1) {
      if (var1 >= 0) {
         this.a(this.eI[var1], this.eJ[var1], this.eF[var1], this.eG[var1], this.eH[var1], this.fx[var1]);
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, String var6) {
      if (this.fN != 0 && this.fN != 25) {
         this.fN = 0;
         fM = true;
      }

      int var9 = var2 > 32767 ? var5 : var2 >> 14 & 32767;
      if (var1 == 1107 && cI > 0 && !rs.p_n.p_a.p_a.C_c.c()) {
         rs.p_n.p_a.p_a.C_c.b();
      }

      if (var1 == 632) {
         if (cH == 36000 && ag) {
            if (var4 == 30074) {
               var1 = C_ac.bL;
            } else {
               var1 = C_ac.bK;
            }
         }

         if (cH == 40600 && ag) {
            var1 = 431;
         }

         if ((var4 == 2006 || var4 == 5382) && cH == 23000 && ag) {
            var1 = 431;
         }
      }

      if (var1 >= 2000) {
         var1 -= 2000;
      }

      if (var1 == 582) {
         rs.p_a.C_j var10 = this.cA[var2];
         if (var10 != null) {
            this.a(2, 0, 1, 0, eR.l[0], 1, 0, var10.l[0], eR.k[0], false, var10.k[0]);
            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(57);
            fv.o(this.oM);
            fv.o(var2);
            fv.n(this.gs);
            fv.o(this.gt);
            C_EntityInteraction_mc var11 = new C_EntityInteraction_mc();
            var11.setEntity(var10);
            this.p.post(var11);
         }
      }

      if (var1 == 234) {
         boolean var25 = this.a(2, 0, 0, 0, eR.l[0], 0, 0, var4, eR.k[0], false, var3);
         if (!var25) {
            var25 = this.a(2, 0, 1, 0, eR.l[0], 1, 0, var4, eR.k[0], false, var3);
         }

         this.ds = super.hV;
         this.dt = super.hW;
         this.dv = 2;
         this.du = 0;
         fv.a(236);
         fv.n(var4 + ei);
         fv.d(var2);
         fv.n(var3 + eh);
      }

      if (var1 == 291) {
         fv.a(140);
         fv.o(var3);
         fv.d(var4);
         fv.o(var2);
      }

      if (var1 == 300) {
         fv.a(141);
         fv.o(var3);
         fv.d(var4);
         fv.o(var2);
         fv.g(this.ih);
      }

      if (var1 == 62 && this.d(var2, var4, var3, var9)) {
         fv.a(192);
         fv.d(this.gt);
         fv.n(var9);
         fv.p(var4 + ei);
         fv.n(this.gs);
         fv.p(var3 + eh);
         fv.d(this.oM);
      }

      if (var1 == 511) {
         boolean var27 = this.a(2, 0, 0, 0, eR.l[0], 0, 0, var4, eR.k[0], false, var3);
         if (!var27) {
            var27 = this.a(2, 0, 1, 0, eR.l[0], 1, 0, var4, eR.k[0], false, var3);
         }

         this.ds = super.hV;
         this.dt = super.hW;
         this.dv = 2;
         this.du = 0;
         fv.a(25);
         fv.n(this.gt);
         fv.o(this.oM);
         fv.d(var2);
         fv.o(var4 + ei);
         fv.p(this.gs);
         fv.d(var3 + eh);
      }

      if (var1 == 1500) {
         this.cp = !this.cp;
         fv.a(185);
         if (this.cp) {
            fv.d(5000);
         } else {
            fv.d(4999);
         }

         this.v.c();
      }

      if (var1 == 1506) {
         fv.a(185);
         fv.d(5001);
      }

      if (var1 == 2245) {
         C_ap.h();
      }

      if (var1 == 2246) {
         n(6);
      }

      if (var1 == 74) {
         fv.a(122);
         fv.p(var4);
         fv.o(var3);
         fv.n(var2);
         this.oq = 0;
         this.fV = var4;
         this.fW = var3;
         this.fX = 2;
         if (rs.p_n.C_e.H[var4].ah == cH) {
            this.fX = 1;
         }

         if (rs.p_n.C_e.H[var4].ah == this.gp) {
            this.fX = 3;
         }

         if (var2 == 23195 || var2 == 27405) {
            this.eW = 1;
            this.bq = 1339;
            this.nl = 1339;
            this.nm = 10;
            this.gr = 0;
            fb = true;
            this.nn = "Cast @mag@catch@whi@ on";
            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            return;
         }
      }

      if (var1 == 315) {
         rs.p_n.C_e var29 = rs.p_n.C_e.H[var4];
         boolean var42 = true;
         if (var29.J > 0) {
            var42 = this.c(var29);
         }

         if (var29 instanceof rs.p_n.p_a.p_a.C_a) {
            if (cI == -1) {
               rs.p_n.p_a.p_a.C_c.a(var29.aw);
            } else {
               rs.p_n.p_a.p_a.C_c.b();
            }
         }

         if (var4 >= 70000 && var4 <= 70600 && C_af.e.get(var4) != null) {
            this.gb = false;
            this.fN = 4;
            this.dY = "";
            fM = true;
            this.iS = C_af.e.get(var4).b();
            return;
         }

         if (var42) {
            int var12 = -1;
            if (var4 == 65796 && rs.p_n.C_e.H['ꯠ'].at.equals("")) {
               var12 = this.og;
            }

            if (var4 == 47002 || var4 == 64606) {
               this.ev = 0;
               fM = true;
               this.fN = 27;
               this.gb = true;
               this.fB = "";
               this.eQ = "Enter name of item to search";
            }

            if (var4 == 47006 || var4 == 64605) {
               this.ev = 0;
               fM = true;
               this.fN = 26;
               this.gb = true;
               this.fB = "";
               this.eQ = "Enter name of monster to search";
            }

            if (var4 == 25115 || var12 == 0) {
               this.ev = 0;
               fM = true;
               this.fN = 28;
               this.og = 0;
               this.gb = true;
               this.fB = "";
               this.eQ = "Enter name of item to search:";
            }

            if (var4 == 25113 || var12 == 1) {
               this.ev = 0;
               fM = true;
               this.fN = 29;
               this.og = 1;
               this.gb = true;
               this.fB = "";
               this.eQ = "Enter name of player to search:";
            }

            if (var4 == 24710 || var12 == 2) {
               this.ev = 0;
               fM = true;
               this.fN = 30;
               this.og = 2;
               this.gb = true;
               this.fB = "";
               this.eQ = "Enter name of item history to search:";
            }

            C_ap.m(var4);
            C_ai.m(var4);
            if (var4 == 43508) {
               rs.p_f.C_a.bj = !rs.p_f.C_a.bj;
               C_aH_mc.i();
            }

            if (cH == C_aD_mc.bI) {
               C_aD_mc.b(var4, true);
            }

            if (var4 >= 63001 && var4 <= 63021 || var4 == 63025 || var4 == 63024 || var4 == 63027 || var4 >= 63046 && var4 <= 63051) {
               rs.p_n.p_c.C_w.m(var4);
            }

            for (rs.p_n.C_c var14 : rs.p_n.C_d.a) {
               var14.a(var4);
            }

            C_Y_uc.m(var4);
            if (var4 == 26004) {
               rs.p_n.p_c.C_h.a(this);
            }

            if ((var4 == 30162 || var4 == 7455 || var4 == 13095) && rs.p_f.C_a.ba) {
               this.a("<img=25> You currently have this spell locked!", 0, null);
            } else {
               fv.a(185);
               fv.d(var4);
            }

            if (var4 == 39002) {
               this.gp = 35112;
               rs.p_n.C_e.H['褫'].E = rs.p_f.C_a.aS ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
               rs.p_n.C_e.H['褫'].aG = rs.p_f.C_a.aS ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
            }

            if (var4 == 33006) {
               C_al.h();
            }

            if (cH == C_ae.d) {
               boolean var52 = false;
               int var55 = C_ae.e;

               for (int var15 = 0; var15 < C_ae.c.size(); var15++) {
                  int var16 = var55++;
                  if (var4 == var16) {
                     var52 = true;
                     break;
                  }
               }

               var55 = C_ae.e;
               if (var52) {
                  for (int var59 = 0; var59 < C_ae.c.size(); var59++) {
                     int var87 = var55++;
                     if (var4 == var87) {
                        rs.p_n.C_e.H[var87].E = new rs.p_l.C_F_uc("vote/sprite 2");
                        rs.p_n.C_e.H[var87].aG = new rs.p_l.C_F_uc("vote/sprite 2");
                     } else {
                        rs.p_n.C_e.H[var87].E = new rs.p_l.C_F_uc("vote/sprite 1");
                        rs.p_n.C_e.H[var87].aG = new rs.p_l.C_F_uc("vote/sprite 2");
                     }
                  }
               }
            }
         }
      }

      if (var1 == 561) {
         rs.p_a.C_k var30 = kw_do[var2];
         if (var30 != null) {
            this.a(2, 0, 1, 0, eR.l[0], 1, 0, var30.l[0], eR.k[0], false, var30.k[0]);
            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            nO += var2;
            if (nO >= 90) {
               fv.a(136);
               nO = 0;
            }

            fv.a(128);
            fv.d(var2);
         }
      }

      if (var1 == 20) {
         rs.p_a.C_j var31 = this.cA[var2];
         if (var31 != null) {
            this.a(2, 0, 1, 0, eR.l[0], 1, 0, var31.l[0], eR.k[0], false, var31.k[0]);
            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(155);
            fv.n(var2);
            C_EntityInteraction_mc var43 = new C_EntityInteraction_mc();
            var43.setEntity(var31);
            this.p.post(var43);
         }
      }

      if (var1 == 779) {
         rs.p_a.C_k var32 = kw_do[var2];
         if (var32 != null) {
            this.a(2, 0, 1, 0, eR.l[0], 1, 0, var32.l[0], eR.k[0], false, var32.k[0]);
            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(153);
            fv.n(var2);
         }
      }

      if (var1 == 516) {
         if (!dj) {
            this.dF.b(super.hW - 4, super.hV - 4);
         } else if (C_V_uc.q) {
            C_V_uc.q = false;
         } else {
            this.dF.b(var4 - 4, var3 - 4);
         }
      }

      if (var1 == 518) {
         if (!dj) {
            this.dF.b(super.hW - 4, super.hV - 4);
         } else {
            this.a(2, 0, 0, 0, eR.l[0], 0, 0, var4, eR.k[0], false, var3);
            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 1;
            this.du = 0;
         }
      }

      if (var1 == 517) {
         ap = "::skipbh";
      }

      if (var1 == 519) {
         this.x.C = true;
      }

      if (var1 == 520) {
         this.x.C = false;
      }

      if (var1 == 521) {
         ap = "::bhtask";
      }

      if (var1 == 522) {
         ap = "::bhtaskinfo";
      }

      if (var1 == 523) {
         ap = "::bhtaskskip";
      }

      if (var1 == 1062) {
         kO = kO + eh;
         if (kO >= 113) {
            fv.a(183);
            fv.f(15086193);
            kO = 0;
         }

         this.d(var2, var4, var3, var9);
         fv.a(228);
         fv.o(var9);
         fv.o(var4 + ei);
         fv.d(var3 + eh);
      }

      if (var1 == 679 && !this.eZ) {
         fv.a(40);
         fv.d(var4);
         this.eZ = true;
      }

      if (var1 == 431) {
         fv.a(129);
         fv.o(var3);
         fv.d(var4);
         fv.o(var2);
         this.oq = 0;
         this.fV = var4;
         this.fW = var3;
         this.fX = 2;
         if (rs.p_n.C_e.H[var4].ah == cH) {
            this.fX = 1;
         }

         if (rs.p_n.C_e.H[var4].ah == this.gp) {
            this.fX = 3;
         }
      }

      if (var1 == 337 || var1 == 42 || var1 == 792 || var1 == 322) {
         int var44 = var6.indexOf("@whi@");
         if (var44 != -1) {
            long var48 = C_O_uc.a(var6.substring(var44 + 5).trim());
            if (var1 == 337) {
               this.a(var48);
            }

            if (var1 == 42) {
               this.h(var48);
            }

            if (var1 == 792) {
               this.f(var48);
            }

            if (var1 == 322) {
               this.i(var48);
            }
         }
      }

      if (var1 == 53) {
         fv.a(135);
         fv.n(var3);
         fv.o(var4);
         fv.n(var2);
         this.oq = 0;
         this.fV = var4;
         this.fW = var3;
         this.fX = 2;
         if (rs.p_n.C_e.H[var4].ah == cH) {
            this.fX = 1;
         }

         if (rs.p_n.C_e.H[var4].ah == this.gp) {
            this.fX = 3;
         }
      }

      if (var1 == 638) {
         fv.a(176);
         fv.n(var3);
         fv.o(var4);
         fv.n(var2);
         this.oq = 0;
         this.fV = var4;
         this.fW = var3;
         this.fX = 2;
         if (rs.p_n.C_e.H[var4].ah == cH) {
            this.fX = 1;
         }

         if (rs.p_n.C_e.H[var4].ah == this.gp) {
            this.fX = 3;
         }
      }

      if (var1 == 539) {
         fv.a(16);
         fv.o(var2);
         fv.p(var3);
         fv.p(var4);
         this.oq = 0;
         this.fV = var4;
         this.fW = var3;
         this.fX = 2;
         if (rs.p_n.C_e.H[var4].ah == cH) {
            this.fX = 1;
         }

         if (rs.p_n.C_e.H[var4].ah == this.gp) {
            this.fX = 3;
         }

         if (var2 == 23912) {
            this.eW = 1;
            this.bq = 1339;
            this.nl = 1339;
            this.nm = 10;
            this.gr = 0;
            fb = true;
            this.nn = "Cast @mag@catch@whi@ on";
            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            return;
         }
      }

      if (var1 == 484 || var1 == 6) {
         int var45 = var6.indexOf("@whi@");
         if (var45 != -1) {
            String var33 = var6.substring(var45 + 5).trim();
            String var49 = C_O_uc.c(C_O_uc.a(C_O_uc.a(var33)));
            boolean var53 = false;

            for (int var57 = 0; var57 < this.ku; var57++) {
               rs.p_a.C_k var60 = kw_do[this.kv[var57]];
               if (var60 != null && var60.aZ != null && var60.aZ.equalsIgnoreCase(var49)) {
                  if (var1 == 484) {
                     fv.a(39);
                     fv.n(this.kv[var57]);
                  } else {
                     this.a(2, 0, 1, 0, eR.l[0], 1, 0, var60.l[0], eR.k[0], false, var60.k[0]);
                  }

                  if (var1 == 6) {
                     nO += var2;
                     if (nO >= 90) {
                        fv.a(136);
                        nO = 0;
                     }

                     fv.a(73);
                     fv.n(this.kv[var57]);
                  }

                  var53 = true;
                  break;
               }
            }

            if (!var53) {
               this.a("Unable to find " + var49, 0, "");
            }
         }
      }

      if (var1 == 870) {
         fv.a(53);
         fv.d(var3);
         fv.o(this.gs);
         fv.p(var2);
         fv.d(this.gt);
         fv.n(this.oM);
         fv.d(var4);
         this.oq = 0;
         this.fV = var4;
         this.fW = var3;
         this.fX = 2;
         if (rs.p_n.C_e.H[var4].ah == cH) {
            this.fX = 1;
         }

         if (rs.p_n.C_e.H[var4].ah == this.gp) {
            this.fX = 3;
         }
      }

      if (var1 == 847) {
         if (rs.p_f.C_a.aL && rs.p_n.C_e.H[var4].ah != cH && rs.p_n.C_e.H[var4].ah != this.gp) {
            rs.p_d.C_k var34 = rs.p_d.C_k.f(var2);
            if (var34 != null
               && var34.w != null
               && !var34.w.startsWith("@")
               && !var34.w.startsWith("<")
               && !var34.w.contains(" pet")
               && !var34.w.contains(" flask")
               && !var34.w.contains(" potion")) {
               this.a("You have spawnable item dropping locked / disabled!", 0, null);
               return;
            }
         }

         fv.a(87);
         fv.o(var2);
         fv.d(var4);
         fv.o(var3);
         this.oq = 0;
         this.fV = var4;
         this.fW = var3;
         this.fX = 2;
         if (rs.p_n.C_e.H[var4].ah == cH) {
            this.fX = 1;
         }

         if (rs.p_n.C_e.H[var4].ah == this.gp) {
            this.fX = 3;
         }
      }

      if (var1 == 1300) {
         f("https://spawnpk.net/forums/index.php?/forum/23-report-a-player/");
      }

      if (var1 == 626) {
         rs.p_n.C_e var41 = rs.p_n.C_e.H[var4];
         this.eW = 1;
         this.bq = var41.aw;
         this.nl = var4;
         this.nm = var41.ai;
         this.gr = 0;
         fb = true;
         String var47 = var41.R;
         if (var47.indexOf(" ") != -1) {
            var47 = var47.substring(0, var47.indexOf(" "));
         }

         String var51 = var41.R;
         if (var51.indexOf(" ") != -1) {
            var51 = var51.substring(var51.indexOf(" ") + 1);
         }

         this.nn = var47 + " " + var41.N + " " + var51;
         if (this.nm == 16) {
            fb = true;
            fL = 3;
            eM = true;
         }
      } else {
         if (var1 == 104) {
            rs.p_n.C_e var35 = rs.p_n.C_e.H[var4];
            T = var35.aw;
            if (!this.U) {
               this.U = true;
               this.S = var35.aw;
               fv.a(185);
               fv.d(var35.aw);
            } else if (this.S == var35.aw) {
               this.U = false;
               this.S = 0;
               fv.a(185);
               fv.d(6666);
            } else if (this.S != var35.aw) {
               this.U = true;
               this.S = var35.aw;
               fv.a(185);
               fv.d(var35.aw);
            }
         }

         if (var1 == 78) {
            fv.a(117);
            fv.p(var4);
            fv.p(var2);
            fv.n(var3);
            this.oq = 0;
            this.fV = var4;
            this.fW = var3;
            this.fX = 2;
            if (rs.p_n.C_e.H[var4].ah == cH) {
               this.fX = 1;
            }

            if (rs.p_n.C_e.H[var4].ah == this.gp) {
               this.fX = 3;
            }
         }

         if (var1 == 27) {
            rs.p_a.C_k var36 = kw_do[var2];
            if (var36 != null) {
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               lz += var2;
               if (lz >= 54) {
                  fv.a(189);
                  fv.b(234);
                  lz = 0;
               }

               fv.a(73);
               fv.n(var2);
            }
         }

         if (var1 == 213) {
            boolean var37 = this.a(2, 0, 0, 0, eR.l[0], 0, 0, var4, eR.k[0], false, var3);
            if (!var37) {
               var37 = this.a(2, 0, 1, 0, eR.l[0], 1, 0, var4, eR.k[0], false, var3);
            }

            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(79);
            fv.n(var4 + ei);
            fv.d(var2);
            fv.o(var3 + eh);
         }

         if (var1 == 632) {
            if (rs.p_n.C_e.H[var4] != null && var4 == 5382) {
               rs.p_n.C_e var39 = rs.p_n.C_e.H[var4];
               if (var39.ax != null && var39.ax.length > var3 && var39.ax[var3] == 0) {
                  if (dj) {
                     ap = "::phrelease " + var2;
                  } else {
                     this.bK();
                  }
               }
            }

            fv.a(145);
            fv.o(var4);
            fv.o(var3);
            fv.o(var2);
            this.oq = 0;
            this.fV = var4;
            this.fW = var3;
            this.fX = 2;
            if (rs.p_n.C_e.H[var4].ah == cH) {
               this.fX = 1;
            }

            if (rs.p_n.C_e.H[var4].ah == this.gp) {
               this.fX = 3;
            }
         }

         int var40 = this.gy;
         int var46 = this.gu;
         int var50 = this.cE;
         int var54 = this.fZ;
         int var58 = this.fj;
         if (var1 == 1003) {
            this.gy = 2;
            fM = true;
         }

         if (var1 == 1002) {
            this.gy = 1;
            fM = true;
         }

         if (var1 == 1001) {
            this.gy = 0;
            fM = true;
         }

         if (var1 == 1000) {
            this.v.a(rs.p_i.C_a.g);
         }

         if (var1 == 999) {
            this.v.a(rs.p_i.C_a.b);
         }

         if (var1 == 1600) {
            this.v.a(rs.p_i.C_a.f);
         }

         if (var1 == 1601) {
            this.gw = 0;
            this.ok = true;
            fM = true;
         }

         if (var1 == 1602) {
            this.gw = 2;
            this.ok = true;
            fM = true;
         }

         if (var1 == 997) {
            this.gu = 3;
            this.ok = true;
            fM = true;
         }

         if (var1 == 996) {
            this.gu = 2;
            this.ok = true;
            fM = true;
         }

         if (var1 == 995) {
            this.gu = 1;
            this.ok = true;
            fM = true;
         }

         if (var1 == 994) {
            this.gu = 0;
            this.ok = true;
            fM = true;
         }

         if (var1 == 993) {
            this.v.a(rs.p_i.C_a.c);
         }

         if (var1 == 992) {
            this.cE = 2;
            this.ok = true;
            fM = true;
         }

         if (var1 == 991) {
            this.cE = 1;
            this.ok = true;
            fM = true;
         }

         if (var1 == 990) {
            this.cE = 0;
            this.ok = true;
            fM = true;
         }

         if (var1 == 989) {
            this.v.a(rs.p_i.C_a.d);
         }

         if (var1 == 1425) {
            for (int var61 = 0; var61 < 200; var61++) {
               if (this.dC[var61] != null) {
                  int var88 = this.dz[var61];
                  if (var88 == 3 || var88 == 5 || var88 == 6 || var88 == 7) {
                     this.dC[var61] = null;
                  }
               }
            }
         }

         if (var1 == 1300) {
         }

         if (var1 == 987) {
            this.fZ = 2;
            this.ok = true;
            fM = true;
         }

         if (var1 == 986) {
            this.fZ = 1;
            this.ok = true;
            fM = true;
         }

         if (var1 == 985) {
            this.fZ = 0;
            this.ok = true;
            fM = true;
         }

         if (var1 == 984) {
            this.v.a(rs.p_i.C_a.e);
         }

         if (var1 == 983) {
            this.fj = 2;
            this.ok = true;
            fM = true;
         }

         if (var1 == 982) {
            this.fj = 1;
            this.ok = true;
            fM = true;
         }

         if (var1 == 981) {
            this.fj = 0;
            this.ok = true;
            fM = true;
         }

         if (var1 == 980) {
            this.v.a(4);
         }

         if (var1 == 1604) {
            this.gx = this.gx == rs.p_i.C_a.z ? rs.p_i.C_a.v : rs.p_i.C_a.z;
            this.ok = true;
            fM = true;
         }

         if (var1 == 1603) {
            this.v.a(rs.p_i.C_a.h);
         }

         if (var1 == 1007) {
            this.gv = this.gv == rs.p_i.C_a.z ? rs.p_i.C_a.v : rs.p_i.C_a.z;
            this.ok = true;
            fM = true;
         }

         if (var1 == 1006) {
            this.v.a(rs.p_i.C_a.i);
         }

         if (var40 != this.gy || var46 != this.gu || var50 != this.cE || var54 != this.fZ || var58 != this.fj) {
            fv.a(95);
            fv.b(this.gu);
            fv.b(this.cE);
            fv.b(this.fZ);
         }

         if (var1 == 493) {
            fv.a(75);
            fv.p(var4);
            fv.n(var3);
            fv.o(var2);
            this.oq = 0;
            this.fV = var4;
            this.fW = var3;
            this.fX = 2;
            if (rs.p_n.C_e.H[var4].ah == cH) {
               this.fX = 1;
            }

            if (rs.p_n.C_e.H[var4].ah == this.gp) {
               this.fX = 3;
            }
         }

         if (var1 == 652) {
            boolean var62 = this.a(2, 0, 0, 0, eR.l[0], 0, 0, var4, eR.k[0], false, var3);
            if (!var62) {
               var62 = this.a(2, 0, 1, 0, eR.l[0], 1, 0, var4, eR.k[0], false, var3);
            }

            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(156);
            fv.o(var3 + eh);
            fv.n(var4 + ei);
            fv.p(var2);
         }

         if (var1 == 94) {
            boolean var64 = this.a(2, 0, 0, 0, eR.l[0], 0, 0, var4, eR.k[0], false, var3);
            if (!var64) {
               var64 = this.a(2, 0, 1, 0, eR.l[0], 1, 0, var4, eR.k[0], false, var3);
            }

            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(181);
            fv.n(var4 + ei);
            fv.d(var2);
            fv.n(var3 + eh);
            fv.o(this.nl);
         }

         if (var1 == 647) {
            rs.p_f.C_a.ba = !rs.p_f.C_a.ba;
            rs.p_f.C_a.d();
         }

         if (var1 == 646) {
            if ((var4 == 1164 || var4 == 30064) && this.cY == 2) {
               this.cY = 3;
            }

            if (var4 == 915 || var4 == 19081) {
               if (System.currentTimeMillis() - ib < 500L) {
                  return;
               }

               ib = System.currentTimeMillis();
            }

            if ((var4 == 30162 || var4 == 7455 || var4 == 13095) && rs.p_f.C_a.ba) {
               this.a("<img=25> You currently have this spell locked!", 0, null);
            } else {
               fv.a(185);
               fv.d(var4);
            }

            rs.p_n.C_e var66 = rs.p_n.C_e.H[var4];
            if (var66.X != null && var66.X[0][0] == 5) {
               int var89 = var66.X[0][1];
               if (var4 == 12474) {
                  if (System.currentTimeMillis() - this.iC < 1000L) {
                     this.a("<img=25> Please wait a few seconds before re-toggling Lite Mode!", 0, null);
                     return;
                  }

                  this.iC = System.currentTimeMillis();
               }

               if (var4 == 19085) {
                  ao = "::extended";
                  return;
               }

               if (this.dP[var89] != var66.I[0]) {
                  this.g("@blu@CONFIGS:@bla@ Setting ID @red@" + var89 + "@bla@ to option @red@" + var66.I[0]);
                  this.dP[var89] = var66.I[0];
                  this.B(var89);
                  fb = true;
               }
            }
         }

         if (var1 == 225) {
            rs.p_a.C_j var67 = this.cA[var2];
            if (var67 != null) {
               long var90 = var67.aG != null ? var67.aG.x : -1L;
               if (var90 == 2347L || var90 == 2346L || var90 == 2345L || var90 == 2344L) {
                  this.eW = 1;
                  this.bq = 1337;
                  this.nl = 1337;
                  this.nm = 12;
                  this.gr = 0;
                  fb = true;
                  this.nn = "Cast @mag@Polymorphism@whi@ on";
                  this.ds = super.hV;
                  this.dt = super.hW;
                  this.dv = 2;
                  this.du = 0;
                  return;
               }

               this.a(2, 0, 1, 0, eR.l[0], 1, 0, var67.l[0], eR.k[0], false, var67.k[0]);
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               oh += var2;
               if (oh >= 85) {
                  fv.a(230);
                  fv.b(239);
                  oh = 0;
               }

               fv.a(17);
               fv.p(var2);
               C_EntityInteraction_mc var18 = new C_EntityInteraction_mc();
               var18.setEntity(var67);
               this.p.post(var18);
            }
         }

         if (var1 == 965) {
            rs.p_a.C_j var68 = this.cA[var2];
            if (var68 != null) {
               this.a(2, 0, 1, 0, eR.l[0], 1, 0, var68.l[0], eR.k[0], false, var68.k[0]);
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               nk++;
               if (nk >= 96) {
                  fv.a(152);
                  fv.b(88);
                  nk = 0;
               }

               fv.a(21);
               fv.d(var2);
               C_EntityInteraction_mc var91 = new C_EntityInteraction_mc();
               var91.setEntity(var68);
               this.p.post(var91);
            }
         }

         if (var1 == 413) {
            rs.p_a.C_j var69 = this.cA[var2];
            if (var69 != null) {
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               fv.a(131);
               fv.p(var2);
               fv.o(this.nl);
               C_EntityInteraction_mc var92 = new C_EntityInteraction_mc();
               var92.setEntity(var69);
               var92.setCombat(true);
               this.p.post(var92);
            }
         }

         if (var1 == 200) {
            this.bQ();
         }

         if (var1 == 1026) {
            rs.p_a.C_j var70 = this.cA[var2];
            if (var70 != null) {
               rs.p_s.p_c.C_c.b.a(var70, false);
               C_EntityInteraction_mc var93 = new C_EntityInteraction_mc();
               var93.setEntity(var70);
               this.p.post(var93);
            }
         }

         if (var1 == 1025) {
            rs.p_a.C_j var71 = this.cA[var2];
            if (var71 != null) {
               rs.p_d.C_d var94 = var71.aG;
               if (var94.G != null) {
                  var94 = var94.c();
               }

               if (var94 != null) {
                  if (var94.H != null) {
                     new String(var94.H);
                  } else {
                     String var17 = "It's a " + var94.o + ".";
                  }

                  ap = "::dropnpcid " + var94.x;
               }
            }
         }

         if (var1 == 900) {
            this.d(var2, var4, var3, var9);
            fv.a(252);
            fv.p(var9);
            fv.n(var4 + ei);
            fv.o(var3 + eh);
         }

         if (var1 == 412) {
            rs.p_a.C_j var72 = this.cA[var2];
            if (var72 != null) {
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               fv.a(72);
               fv.o(var2);
               C_EntityInteraction_mc var95 = new C_EntityInteraction_mc();
               var95.setEntity(var72);
               var95.setCombat(true);
               this.p.post(var95);
            }
         }

         if (var1 == 365) {
            rs.p_a.C_k var73 = kw_do[var2];
            if (var73 != null) {
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               fv.a(249);
               fv.o(var2);
               fv.n(this.nl);
            }
         }

         if (var1 == 729) {
            rs.p_a.C_k var74 = kw_do[var2];
            if (var74 != null) {
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               fv.a(39);
               fv.n(var2);
            }
         }

         if (var1 == 577) {
            rs.p_a.C_k var75 = kw_do[var2];
            if (var75 != null) {
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               fv.a(139);
               fv.n(var2);
            }
         }

         if (var1 == 956 && this.d(var2, var4, var3, var9)) {
            fv.a(35);
            fv.n(var3 + eh);
            fv.o(this.nl);
            fv.o(var4 + ei);
            fv.n(var9);
         }

         if (var1 == 567) {
            boolean var76 = this.a(2, 0, 0, 0, eR.l[0], 0, 0, var4, eR.k[0], false, var3);
            if (!var76) {
               var76 = this.a(2, 0, 1, 0, eR.l[0], 1, 0, var4, eR.k[0], false, var3);
            }

            this.ds = super.hV;
            this.dt = super.hW;
            this.dv = 2;
            this.du = 0;
            fv.a(23);
            fv.n(var4 + ei);
            fv.n(var2);
            fv.n(var3 + eh);
         }

         if (var1 == 867) {
            if ((var2 & 3) == 0) {
               nH++;
            }

            if (nH >= 59) {
               fv.a(200);
               fv.d(25501);
               nH = 0;
            }

            fv.a(43);
            fv.n(var4);
            fv.o(var2);
            fv.o(var3);
            this.oq = 0;
            this.fV = var4;
            this.fW = var3;
            this.fX = 2;
            if (rs.p_n.C_e.H[var4].ah == cH) {
               this.fX = 1;
            }

            if (rs.p_n.C_e.H[var4].ah == this.gp) {
               this.fX = 3;
            }

            if (var2 == 21671 || var2 == 21670) {
               this.eW = 1;
               this.bq = 1338;
               this.nl = 1338;
               this.nm = 12;
               this.gr = 0;
               fb = true;
               this.nn = "@mag@Punch";
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               return;
            }
         }

         if (var1 == 543) {
            fv.a(237);
            fv.d(var3);
            fv.o(var2);
            fv.d(var4);
            fv.o(this.nl);
            this.oq = 0;
            this.fV = var4;
            this.fW = var3;
            this.fX = 2;
            if (rs.p_n.C_e.H[var4].ah == cH) {
               this.fX = 1;
            }

            if (rs.p_n.C_e.H[var4].ah == this.gp) {
               this.fX = 3;
            }
         }

         if (var1 == 606) {
            int var96 = var6.indexOf("@whi@");
            if (var96 != -1) {
               if (cH == -1) {
                  this.bQ();
                  this.kr = var6.substring(var96 + 5).trim();
                  this.nz = false;

                  for (int var103 = 0; var103 < rs.p_n.C_e.H.length; var103++) {
                     if (rs.p_n.C_e.H[var103] != null && rs.p_n.C_e.H[var103].J == 600) {
                        this.nK = cH = rs.p_n.C_e.H[var103].ah;
                        break;
                     }
                  }
               } else {
                  this.a("Please close the interface you have open before using 'report abuse'", 0, "");
               }
            }
         }

         if (var1 == 491) {
            rs.p_a.C_k var78 = kw_do[var2];
            if (var78 != null) {
               this.a(2, 0, 1, 0, eR.l[0], 1, 0, var78.l[0], eR.k[0], false, var78.k[0]);
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               fv.a(14);
               fv.o(this.gt);
               fv.d(var2);
               fv.d(this.oM);
               fv.n(this.gs);
            }
         }

         if (var1 == 639) {
            int var97 = var6.indexOf("@whi@");
            if (var97 != -1) {
               long var104 = C_O_uc.a(var6.substring(var97 + 5).trim());
               int var19 = -1;

               for (int var20 = 0; var20 < this.kA; var20++) {
                  if (this.lg[var20] == var104) {
                     var19 = var20;
                     break;
                  }
               }

               if (var19 != -1 && this.jG[var19] > 0) {
                  fM = true;
                  this.fN = 0;
                  this.gb = true;
                  this.fB = "";
                  this.ev = 3;
                  this.le = this.lg[var19];
                  this.eQ = "Enter message to send to " + this.mT[var19];
               }
            }
         }

         if (var1 == 454) {
            if (!rs.p_f.C_a.aF && ic > 0L && !rs.p_f.C_a.aE) {
               this.ie.add(new rs.p_q.p_a.C_a(var2, var3, var4));
               if (System.currentTimeMillis() - this.id > ic) {
                  this.id = System.currentTimeMillis();
               }
            } else {
               fv.a(41);
               fv.d(var2);
               fv.o(var3);
               fv.o(var4);
            }

            this.oq = 0;
            this.fV = var4;
            this.fW = var3;
            this.fX = 2;
            if (rs.p_n.C_e.H[var4].ah == cH) {
               this.fX = 1;
            }

            if (rs.p_n.C_e.H[var4].ah == this.gp) {
               this.fX = 3;
            }
         }

         if (var1 == 478) {
            rs.p_a.C_j var79 = this.cA[var2];
            if (var79 != null) {
               this.a(2, 0, 1, 0, eR.l[0], 1, 0, var79.l[0], eR.k[0], false, var79.k[0]);
               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               if ((var2 & 3) == 0) {
                  ny++;
               }

               if (ny >= 53) {
                  fv.a(85);
                  fv.b(66);
                  ny = 0;
               }

               fv.a(18);
               fv.n(var2);
               C_EntityInteraction_mc var98 = new C_EntityInteraction_mc();
               var98.setEntity(var79);
               this.p.post(var98);
            }
         }

         if (var1 == 113) {
            this.d(var2, var4, var3, var9);
            fv.a(70);
            fv.n(var3 + eh);
            fv.d(var4 + ei);
            fv.p(var9);
         }

         if (var1 == 872) {
            this.d(var2, var4, var3, var9);
            fv.a(234);
            fv.p(var3 + eh);
            fv.o(var9);
            fv.p(var4 + ei);
         }

         if (var1 == 502) {
            this.d(var2, var4, var3, var9);
            fv.a(132);
            fv.p(var3 + eh);
            fv.d(var9);
            fv.o(var4 + ei);
         }

         if (var1 == 1125) {
            rs.p_d.C_k var80 = rs.p_d.C_k.f(var2);
            rs.p_n.C_e var99 = rs.p_n.C_e.H[var4];
            if (rs.p_f.C_a.c() && cH == -1 && rs.p_s.p_c.C_c.d) {
               rs.p_s.p_c.C_c.b.a(var2, false);
            } else {
               String var106 = var80.w;
               if (var80.w.contains("@gre@")) {
                  var106 = var106.replace("@gre@", "");
               }

               String var105;
               if (var99 != null && var99.ax != null && var99.ax[var3] >= 100000) {
                  var105 = a((double)var99.ax[var3]) + " x " + var106;
               } else if (var80.E != null) {
                  var105 = new String(var80.E);
                  var105.replace("@gre@", "");
               } else {
                  var105 = "It's a " + rs.p_l.C_j.b(var80.w) + ".";
                  rs.p_n.C_a.a("::iexam " + var80.i);
               }

               if (cH == 47500 && var80.w != null) {
                  ap = "::igsearch " + var80.w;
               } else {
                  String var107 = rs.p_d.C_m.a("", var80.i);
                  if (var107 != null && !var107.isEmpty()) {
                     var107 = rs.p_l.C_j.b(var107).replace('\n', '^');
                     int var109 = gl.c(var107);
                     if (var109 >= 475) {
                        StringBuilder var21 = new StringBuilder();

                        for (int var22 = 0; var22 < var107.length(); var22++) {
                           if (var107.charAt(var22) == '^') {
                              var21.append(' ');
                           } else {
                              var21.append(var107.charAt(var22));
                           }

                           int var23 = gl.c(var21.toString());
                           boolean var24 = var23 >= 380
                              && (
                                 var107.charAt(var22) == ' '
                                    || var107.charAt(var22) == '^'
                                    || var107.charAt(var22) == '-'
                                    || var107.charAt(var22) == '.'
                                    || var107.charAt(var22) == ','
                              );
                           if (var24 || var22 == var107.length() - 1) {
                              this.a(var21.toString(), 0, "");
                              var21 = new StringBuilder();
                           }
                        }
                     } else {
                        this.a(var107.replace('^', ' '), 0, "");
                     }
                  } else {
                     this.a(var105, 0, "");
                  }
               }
            }
         }

         if (var1 == 169) {
            fv.a(185);
            fv.d(var4);
            if (var4 == 64029) {
               this.gb = false;
               this.fN = 3;
               this.dY = "";
               fM = true;
               return;
            }

            rs.p_n.C_e var81 = rs.p_n.C_e.H[var4];
            if (var81.X != null && var81.X[0][0] == 5) {
               int var100 = var81.X[0][1];
               this.dP[var100] = 1 - this.dP[var100];
               this.B(var100);
               fb = true;
            }
         }

         if (var1 == 447) {
            this.gr = 1;
            this.gs = var3;
            this.gt = var4;
            this.oM = var2;
            this.oN = rs.p_d.C_k.f(var2).w;
            this.eW = 0;
            fb = true;
         } else {
            if (var1 == 1227) {
               rs.p_d.C_r var82 = rs.p_d.C_r.c(var9);
               rs.p_s.p_c.C_c.b.b(var9, false);
            }

            if (var1 == 1226) {
               rs.p_d.C_r var83 = rs.p_d.C_r.c(var9);
               String var101;
               if (var83.aq != null) {
                  var101 = new String(var83.aq);
               } else {
                  var101 = "It's a " + var83.R + ".";
               }

               this.a(var101, 0, "");
            }

            if (var1 == 244) {
               boolean var84 = this.a(2, 0, 0, 0, eR.l[0], 0, 0, var4, eR.k[0], false, var3);
               if (!var84) {
                  var84 = this.a(2, 0, 1, 0, eR.l[0], 1, 0, var4, eR.k[0], false, var3);
               }

               this.ds = super.hV;
               this.dt = super.hW;
               this.dv = 2;
               this.du = 0;
               fv.a(253);
               fv.n(var3 + eh);
               fv.p(var4 + ei);
               fv.o(var2);
            }

            if (var1 == 1448) {
               rs.p_d.C_k var86 = rs.p_d.C_k.f(var2);
               String var102;
               if (var86.E != null) {
                  var102 = new String(var86.E);
               } else {
                  var102 = "It's a " + var86.w + ".";
               }

               this.a(var102, 0, "");
            }

            if (var1 == 1924) {
               this.r.a(var2);
            }

            this.gr = 0;
            this.eW = 0;
            fb = true;
         }
      }
   }

   private void g(String var1) {
      if (eR != null && cT == 2 && rs.p_f.C_a.am) {
         this.a("@red@[@mag@CLIENT DEBUG@red@]@bla@ " + var1, 0, "");
      }
   }

   public void y() {
      this.ou = 0;
      int var1 = (eR.ac >> 7) + eh;
      int var2 = (eR.ad >> 7) + ei;
      if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
         this.ou = 1;
      }

      if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
         this.ou = 1;
      }

      if (this.ou == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
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

      for (rs.p_l.p_e.C_a var2 : rs.p_l.p_e.C_f.n) {
         if (var2 != null && var2.e()) {
            if (var2 instanceof rs.p_l.p_e.p_a.C_s) {
               rs.p_l.p_e.C_f.o++;
            }

            if (var2.a(super.hM)) {
               return;
            }
         }
      }

      if (this.gr == 0 && this.eW == 0) {
         this.fx[this.eV] = "Walk here";
         this.eI[this.eV] = 516;
         this.eF[this.eV] = C_C_uc.hP;
         this.eG[this.eV] = C_C_uc.hQ;
         this.eV++;
      }

      int var14 = -1;

      for (int var15 = 0; var15 < rs.p_a.C_h.bw; var15++) {
         int var3 = rs.p_a.C_h.bx[var15];
         int var4 = var3 & 127;
         int var5 = var3 >> 7 & 127;
         int var6 = var3 >> 29 & 3;
         int var7 = -1;
         if (var6 != 2) {
            var7 = var3 >> 14 & 32767;
         }

         if (var3 != var14) {
            var14 = var3;
            if (var6 == 2 && this.dF.b(dw, var4, var5, var3) >= 0) {
               var7 = rs.p_a.C_h.by[var15];
               rs.p_d.C_r var8 = rs.p_d.C_r.c(var7);
               if (var8 != null && var8.ad != null) {
                  var8 = var8.d();
               }

               if (var8 == null || var8.R == null || var8.R == "null") {
                  continue;
               }

               if (this.gr == 1) {
                  this.fx[this.eV] = "Use " + this.oN + " with @cya@" + var8.R;
                  this.eI[this.eV] = 62;
                  this.eJ[this.eV] = var3;
                  this.eF[this.eV] = var4;
                  this.eG[this.eV] = var5;
                  this.eH[this.eV] = var7;
                  this.eV++;
               } else if (this.eW == 1) {
                  if ((this.nm & 4) == 4) {
                     this.fx[this.eV] = this.nn + " @cya@" + var8.R;
                     this.eI[this.eV] = 956;
                     this.eJ[this.eV] = var3;
                     this.eF[this.eV] = var4;
                     this.eG[this.eV] = var5;
                     this.eH[this.eV] = var7;
                     this.eV++;
                  }
               } else {
                  if (var8.ay != null) {
                     for (int var9 = 4; var9 >= 0; var9--) {
                        if (var8.ay[var9] != null) {
                           this.fx[this.eV] = var8.ay[var9] + " @cya@" + var8.R;
                           if (var9 == 0) {
                              this.eI[this.eV] = 502;
                           }

                           if (var9 == 1) {
                              this.eI[this.eV] = 900;
                           }

                           if (var9 == 2) {
                              this.eI[this.eV] = 113;
                           }

                           if (var9 == 3) {
                              this.eI[this.eV] = 872;
                           }

                           if (var9 == 4) {
                              this.eI[this.eV] = 1062;
                           }

                           this.eJ[this.eV] = var3;
                           this.eF[this.eV] = var4;
                           this.eG[this.eV] = var5;
                           this.eH[this.eV] = var7;
                           this.eV++;
                        }
                     }
                  }

                  this.fx[this.eV] = "Examine @cya@" + var8.R;
                  this.eI[this.eV] = 1226;
                  this.eJ[this.eV] = var8.aa << 14;
                  this.eF[this.eV] = var4;
                  this.eG[this.eV] = var5;
                  this.eH[this.eV] = var7;
                  this.eV++;
                  if (rs.p_d.C_v.a(cT) && rs.p_f.C_a.c() && rs.p_s.p_c.C_c.d) {
                     this.fx[this.eV] = "<img=191> @mag@Colors@cya@ " + var8.R;
                     this.eI[this.eV] = 1227;
                     this.eJ[this.eV] = var8.aa << 14;
                     this.eF[this.eV] = var4;
                     this.eG[this.eV] = var5;
                     this.eH[this.eV] = var7;
                     this.eV++;
                  }
               }
            }

            if (var6 == 1) {
               rs.p_a.C_j var16 = this.cA[var7];
               if (var16 == null || var16.aG == null) {
                  continue;
               }

               if (var16.aG.r == 1 && (var16.ac & 127) == 64 && (var16.ad & 127) == 64) {
                  for (int var19 = 0; var19 < this.cB; var19++) {
                     rs.p_a.C_j var10 = this.cA[this.cC[var19]];
                     if (var10 != null && var10 != var16 && var10.aG != null && var10.aG.r == 1 && var10.ac == var16.ac && var10.ad == var16.ad) {
                        this.a(var10.aG, this.cC[var19], var5, var4);
                     }
                  }

                  for (int var20 = 0; var20 < this.ku; var20++) {
                     rs.p_a.C_k var23 = kw_do[this.kv[var20]];
                     if (var23 != null && var23.ac == var16.ac && var23.ad == var16.ad) {
                        this.a(var4, this.kv[var20], var23, var5);
                     }
                  }
               }

               this.a(var16.aG, var7, var5, var4);
            }

            if (var6 == 0) {
               rs.p_a.C_k var17 = kw_do[var7];
               if (var17 == null) {
                  continue;
               }

               ArrayList var21 = new ArrayList();
               if ((var17.ac & 127) == 64 && (var17.ad & 127) == 64) {
                  for (int var24 = 0; var24 < this.cB; var24++) {
                     rs.p_a.C_j var11 = this.cA[this.cC[var24]];
                     if (var11 != null && var11.aG.r == 1 && var11.ac == var17.ac && var11.ad == var17.ad) {
                        this.a(var11.aG, this.cC[var24], var5, var4);
                     }
                  }

                  for (int var25 = 0; var25 < this.ku; var25++) {
                     rs.p_a.C_k var28 = kw_do[this.kv[var25]];
                     if (var28 != null && var28 != var17 && var28.ac == var17.ac && var28.ad == var17.ad) {
                        var21.add(this.kv[var25]);
                     }
                  }
               }

               var21.add(var7);
               int var26 = -1;

               for (Object var12Obj : var21) {
                  Integer var12 = (Integer)var12Obj;
                  int var13 = kw_do[var12].m - 32768;
                  if (var13 == di && var26 == -1) {
                     var26 = var12;
                  }

                  if (eR.m - 32768 == var12) {
                     var26 = var12;
                  }

                  if (kw_do[var12] != null && kw_do[var12].aZ != null && this.z.r != null && !this.z.r.equalsIgnoreCase(kw_do[var12].aZ)) {
                     var26 = var12;
                     break;
                  }
               }

               if (var26 != -1) {
                  rs.p_a.C_k var30 = kw_do[var26];
                  this.a(var4, var26, var30, var5);
               }

               for (Object var33Obj : var21) {
                  Integer var33 = (Integer)var33Obj;
                  if (var26 == -1 || var26 != var33) {
                     rs.p_a.C_k var34 = kw_do[var33];
                     this.a(var4, var33, var34, var5);
                  }
               }
            }

            if (var6 == 3) {
               C_h var18 = this.jH[dw][var4][var5];
               if (var18 != null) {
                  for (rs.p_a.C_g var22 = (rs.p_a.C_g)var18.c(); var22 != null; var22 = (rs.p_a.C_g)var18.e()) {
                     rs.p_d.C_k var27 = rs.p_d.C_k.f(var22.h);
                     if (var27 != null && var27.w != null) {
                        if (this.eV > this.fx.length - 1) {
                           break;
                        }

                        if (this.gr == 1) {
                           this.fx[this.eV] = "Use " + this.oN + " with @lre@" + var27.w;
                           this.eI[this.eV] = 511;
                           this.eJ[this.eV] = var22.h;
                           this.eF[this.eV] = var4;
                           this.eG[this.eV] = var5;
                           this.eV++;
                        } else if (this.eW == 1) {
                           if ((this.nm & 1) == 1) {
                              this.fx[this.eV] = this.nn + " @lre@" + var27.w;
                              this.eI[this.eV] = 94;
                              this.eJ[this.eV] = var22.h;
                              this.eF[this.eV] = var4;
                              this.eG[this.eV] = var5;
                              this.eV++;
                           }
                        } else {
                           for (int var32 = 4; var32 >= 0; var32--) {
                              if (var27.u != null && var27.u[var32] != null) {
                                 this.fx[this.eV] = var27.u[var32] + " @lre@" + var27.w;
                                 if (var32 == 0) {
                                    this.eI[this.eV] = 652;
                                 }

                                 if (var32 == 1) {
                                    this.eI[this.eV] = 567;
                                 }

                                 if (var32 == 2) {
                                    this.eI[this.eV] = 234;
                                 }

                                 if (var32 == 3) {
                                    this.eI[this.eV] = 244;
                                 }

                                 if (var32 == 4) {
                                    this.eI[this.eV] = 213;
                                 }

                                 this.eJ[this.eV] = var22.h;
                                 this.eF[this.eV] = var4;
                                 this.eG[this.eV] = var5;
                                 this.eV++;
                              } else if (var32 == 2) {
                                 this.fx[this.eV] = "Take @lre@" + var27.w;
                                 this.eI[this.eV] = 234;
                                 this.eJ[this.eV] = var22.h;
                                 this.eF[this.eV] = var4;
                                 this.eG[this.eV] = var5;
                                 this.eV++;
                              }
                           }

                           this.fx[this.eV] = "Examine @lre@" + var27.w;
                           this.eI[this.eV] = 1448;
                           this.eJ[this.eV] = var22.h;
                           this.eF[this.eV] = var4;
                           this.eG[this.eV] = var5;
                           this.iT = rs.p_d.C_k.f(var22.h).w;
                           this.eV++;
                        }
                     }
                  }
               }
            }
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
      } catch (Exception var3) {
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
      } catch (Exception var2) {
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
      rs.p_d.C_r.b();
      rs.p_d.C_d.d();
      rs.p_d.C_k.a();
      rs.p_d.C_h.b = null;
      rs.p_d.C_j.b = null;
      rs.p_n.C_e.H = null;
      rs.p_d.C_a.a = null;
      rs.p_d.C_x.c = null;
      rs.p_d.C_x.p = null;
      rs.p_d.C_z.a = null;
      super.ha = null;
      rs.p_a.C_k.aL = null;
      rs.p_a.C_k.aM = null;
      rs.p_a.C_k.aN = null;
      rs.p_d.C_x.q = null;
      rs.p_l.C_E_uc.e();
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
      } else {
         return (Component)(super.hH != null ? super.hH : this);
      }
   }

   public void C() {
      while (true) {
         int var1 = this.w(-796);
         if (var1 == -1) {
            return;
         }

         if (this.ac() && (var1 == 96 || var1 == 42 && this.fk.equalsIgnoreCase("bsouth"))) {
            w.a();
            return;
         }

         if (w.b && !this.gb && this.gp <= 0) {
            w.a(var1);
            fM = true;
            return;
         }

         if (cH != -1 && cH == this.nK) {
            if (var1 == 8 && this.kr.length() > 0) {
               this.kr = this.kr.substring(0, this.kr.length() - 1);
            }

            if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && this.kr.length() < 12) {
               this.kr = this.kr + (char)var1;
            }
         } else if (this.gb) {
            if (var1 >= 32 && var1 <= 122 && this.fB.length() < 80) {
               this.fB = this.fB + (char)var1;
               if (this.fN == 25) {
                  this.ar = "::banksearch " + this.fB;
               }

               fM = true;
            }

            if (var1 == 8 && this.fB.length() > 0) {
               this.fB = this.fB.substring(0, this.fB.length() - 1);
               if (this.fN == 25) {
                  this.ar = "::banksearch " + this.fB;
               }

               fM = true;
            }

            if (var1 == 9) {
               this.J();
            }

            if (var1 == 13 || var1 == 10) {
               this.gb = false;
               fM = true;
               if (this.fN == 25) {
                  if (this.fB.equalsIgnoreCase("")) {
                     this.ar = "::banksearch ~clear";
                  } else {
                     this.ar = "::banksearch " + this.fB;
                  }
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
                  long var14 = C_O_uc.a(this.fB);
                  this.a(var14);
               }

               if (this.ev == 2 && this.kA > 0) {
                  long var15 = C_O_uc.a(this.fB);
                  this.f(var15);
               }

               if (this.ev == 3 && this.fB.length() > 0) {
                  fv.a(126);
                  fv.b(0);
                  int var16 = fv.h;
                  fv.a(this.le);
                  C_P_uc.a(this.fB, fv);
                  fv.j(fv.h - var16);
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
                  long var17 = C_O_uc.a(this.fB);
                  this.h(var17);
               }

               if (this.ev == 5 && this.jD > 0) {
                  long var18 = C_O_uc.a(this.fB);
                  this.i(var18);
               }
            }
         } else if (this.fN == 1) {
            if (var1 >= 48 && var1 <= 57 && this.dY.length() < 10) {
               this.dY = this.dY + (char)var1;
               fM = true;
            }

            if (!this.dY.toLowerCase().contains("k")
                  && !this.dY.toLowerCase().contains("m")
                  && !this.dY.toLowerCase().contains("b")
                  && (var1 == 107 || var1 == 109)
               || var1 == 98
               || var1 == 75
               || var1 == 77
               || var1 == 66) {
               this.dY = this.dY + (char)var1;
               fM = true;
            }

            if (var1 == 8 && this.dY.length() > 0) {
               this.dY = this.dY.substring(0, this.dY.length() - 1);
               fM = true;
            }

            if (var1 == 13 || var1 == 10) {
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

                  int var12 = 0;

                  try {
                     var12 = Integer.parseInt(this.dY);
                  } catch (NumberFormatException var7) {
                     var12 = Integer.MAX_VALUE;
                  }

                  if (cH == 23000 && var12 > 0) {
                     this.ih = var12;
                     rs.p_n.p_c.C_h.m(this.ih);
                  }

                  fv.a(208);
                  fv.g(var12);
               }

               this.fN = 0;
               fM = true;
            }
         } else if (this.fN == 2) {
            if (var1 >= 32 && var1 <= 122 && this.dY.length() < 24) {
               this.dY = this.dY + (char)var1;
               fM = true;
            }

            if (var1 == 8 && this.dY.length() > 0) {
               this.dY = this.dY.substring(0, this.dY.length() - 1);
               fM = true;
            }

            if (var1 == 13 || var1 == 10) {
               if (this.dY.length() > 0) {
                  fv.a(60);
                  fv.a(C_O_uc.a(this.dY));
               }

               this.fN = 0;
               fM = true;
            }
         } else if (this.fN == 3) {
            if (var1 >= 32 && var1 <= 122 && this.dY.length() < 25) {
               this.dY = this.dY + (char)var1;
               fM = true;
            }

            if (var1 == 8 && this.dY.length() > 0) {
               this.dY = this.dY.substring(0, this.dY.length() - 1);
               fM = true;
            }

            if (var1 == 13 || var1 == 10) {
               this.fN = 0;
               this.gb = false;
               fM = true;
               C_af.a(this, this.dY);
               C_af.b(bk);
               fb = true;
            }
         } else if (this.fN == 6 && this.q.c() != null) {
            switch (this.q.c().e()) {
               case b:
                  if (var1 >= 48 && var1 <= 57 && this.dY.length() < 10) {
                     this.dY = this.dY + (char)var1;
                     fM = true;
                  }

                  if (!this.dY.toLowerCase().contains("k")
                        && !this.dY.toLowerCase().contains("m")
                        && !this.dY.toLowerCase().contains("b")
                        && (var1 == 107 || var1 == 109)
                     || var1 == 98
                     || var1 == 75
                     || var1 == 77
                     || var1 == 66) {
                     this.dY = this.dY + (char)var1;
                     fM = true;
                  }
                  break;
               case c:
                  if (var1 >= 32 && var1 <= 122 && this.dY.length() < 12) {
                     this.dY = this.dY + (char)var1;
                     fM = true;
                  }
                  break;
               case a:
                  if (var1 >= 32 && var1 <= 122 && this.dY.length() < 25) {
                     this.dY = this.dY + (char)var1;
                     fM = true;
                  }
            }

            if (var1 == 8 && this.dY.length() > 0) {
               this.dY = this.dY.substring(0, this.dY.length() - 1);
               fM = true;
            }

            if (var1 == 13 || var1 == 10) {
               this.q.a();
               this.fN = 0;
               this.gb = false;
               fM = true;
               fb = true;
            }
         } else if (this.fN == 4) {
            if (var1 >= 48 && var1 <= 57 && this.dY.length() < 10) {
               this.dY = this.dY + (char)var1;
               fM = true;
            }

            if (!this.dY.toLowerCase().contains("k")
                  && !this.dY.toLowerCase().contains("m")
                  && !this.dY.toLowerCase().contains("b")
                  && (var1 == 107 || var1 == 109)
               || var1 == 98) {
               this.dY = this.dY + (char)var1;
               fM = true;
            }

            if (var1 == 8 && this.dY.length() > 0) {
               this.dY = this.dY.substring(0, this.dY.length() - 1);
               fM = true;
            }

            if (var1 == 13 || var1 == 10) {
               if (this.dY.length() > 0) {
                  if (this.dY.toLowerCase().contains("k")) {
                     this.dY = this.dY.replaceAll("k", "000");
                  } else if (this.dY.toLowerCase().contains("m")) {
                     this.dY = this.dY.replaceAll("m", "000000");
                  } else if (this.dY.toLowerCase().contains("b")) {
                     this.dY = this.dY.replaceAll("b", "000000000");
                  }

                  int var10 = 0;

                  try {
                     var10 = Integer.parseInt(this.dY);
                  } catch (NumberFormatException var8) {
                     var10 = Integer.MAX_VALUE;
                  }

                  ap = "::tabitem " + this.iS + " " + var10;
               }

               this.fN = 0;
               fM = true;
            }
         } else if (this.gp == -1 && this.dl == null) {
            if (var1 == 9) {
               this.J();
            }

            if (dk.isEmpty() && var1 == 58) {
               this.bw = true;
            }

            if (!this.v.h() || this.f()) {
               if (var1 >= 32 && var1 <= 122 && dk.length() < 80) {
                  dk = dk + (char)var1;
                  fM = true;
               }

               if (var1 == 8 && dk.length() > 0) {
                  dk = dk.substring(0, dk.length() - 1);
                  fM = true;
                  if (dk.isEmpty()) {
                     this.bw = false;
                  }
               }

               if ((var1 == 13 || var1 == 10) && dk.length() > 0) {
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
                     if (!h(dk)) {
                        fv.a(103);
                        fv.b(dk.length() - 1);
                        fv.a(dk.substring(2));
                     }
                  } else {
                     String var2 = dk.toLowerCase();
                     byte var3 = 0;
                     if (var2.startsWith("yellow:")) {
                        var3 = 0;
                        dk = dk.substring(7);
                     } else if (var2.startsWith("red:")) {
                        var3 = 1;
                        dk = dk.substring(4);
                     } else if (var2.startsWith("green:")) {
                        var3 = 2;
                        dk = dk.substring(6);
                     } else if (var2.startsWith("cyan:")) {
                        var3 = 3;
                        dk = dk.substring(5);
                     } else if (var2.startsWith("purple:")) {
                        var3 = 4;
                        dk = dk.substring(7);
                     } else if (var2.startsWith("white:")) {
                        var3 = 5;
                        dk = dk.substring(6);
                     } else if (var2.startsWith("flash1:")) {
                        var3 = 6;
                        dk = dk.substring(7);
                     } else if (var2.startsWith("flash2:")) {
                        var3 = 7;
                        dk = dk.substring(7);
                     } else if (var2.startsWith("flash3:")) {
                        var3 = 8;
                        dk = dk.substring(7);
                     } else if (var2.startsWith("glow1:")) {
                        var3 = 9;
                        dk = dk.substring(6);
                     } else if (var2.startsWith("glow2:")) {
                        var3 = 10;
                        dk = dk.substring(6);
                     } else if (var2.startsWith("glow3:")) {
                        var3 = 11;
                        dk = dk.substring(6);
                     }

                     var2 = dk.toLowerCase();
                     byte var4 = 0;
                     if (var2.startsWith("wave:")) {
                        var4 = 1;
                        dk = dk.substring(5);
                     } else if (var2.startsWith("wave2:")) {
                        var4 = 2;
                        dk = dk.substring(6);
                     } else if (var2.startsWith("shake:")) {
                        var4 = 3;
                        dk = dk.substring(6);
                     } else if (var2.startsWith("scroll:")) {
                        var4 = 4;
                        dk = dk.substring(7);
                     } else if (var2.startsWith("slide:")) {
                        var4 = 5;
                        dk = dk.substring(6);
                     }

                     fv.a(4);
                     fv.b(0);
                     int var5 = fv.h;
                     fv.m(var4);
                     fv.m(var3);
                     this.jM.h = 0;
                     C_P_uc.a(dk, this.jM);
                     fv.a(0, this.jM.g, this.jM.h);
                     fv.j(fv.h - var5);
                     dk = C_P_uc.a(dk);
                     dk = rs.p_d.C_c.b(dk);
                     eR.q = dk;
                     eR.v = var3;
                     eR.K = var4;
                     eR.O = 150;
                     if (cT > 0) {
                        int var6 = cT;
                        this.a(eR.q, 2, "@cr" + var6 + "@" + eR.d(true));
                     } else {
                        this.a(eR.q, 2, eR.d(true));
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
         }
      }
   }

   private void E(int var1) {
      int var2 = 0;
      boolean var3 = false;

      for (int var4 = 0; var4 < this.dC.length; var4++) {
         if (this.dC[var4] != null) {
            int var5 = 70 - var2 * 14 + 42 + eD + 4 + 5;
            if (var5 < -23) {
               break;
            }

            int var6 = this.dz[var4];
            String var7 = this.dB[var4];
            String var8 = this.dC[var4];
            boolean var9 = this.dD[var4];
            if (var6 == rs.p_i.C_a.j && (this.fi == rs.p_i.C_a.h || this.fi == rs.p_i.C_a.b) && (this.gx == rs.p_i.C_a.v || this.gx == rs.p_i.C_a.z && !var9)) {
               var2++;
            }

            if (var6 == rs.p_i.C_a.s
               && (this.fi == rs.p_i.C_a.i || this.fi == rs.p_i.C_a.b || this.fi == rs.p_i.C_a.h && !var9)
               && (this.gv == rs.p_i.C_a.v || !var9)) {
               var2++;
            }

            if (var6 == rs.p_i.C_a.t && (this.fi == rs.p_i.C_a.g || this.fi == rs.p_i.C_a.b) && (this.gy == rs.p_i.C_a.v || !var9)) {
               var2++;
            }

            if (var6 == rs.p_i.C_a.u && (this.fi == rs.p_i.C_a.f || this.fi == rs.p_i.C_a.b) && (this.gw == rs.p_i.C_a.v || !var9)) {
               var2++;
            }

            if ((var6 == rs.p_i.C_a.k || var6 == rs.p_i.C_a.l)
               && (this.gu == rs.p_i.C_a.v || this.gu == rs.p_i.C_a.w && this.i(var7))
               && (this.fi == rs.p_i.C_a.c || this.fi == rs.p_i.C_a.b)) {
               if (var1 > var5 - 14 && var1 <= var5 && !var7.equals(eR.o())) {
                  if (cT >= 1) {
                     this.a("Report abuse @whi@" + var7, 606);
                  }

                  this.a("Add ignore @whi@" + var7, 42);
                  this.a("Add friend @whi@" + var7, 337);
               }

               var2++;
            }

            if ((var6 == rs.p_i.C_a.q || var6 == rs.p_i.C_a.p) && this.nS == 0 && (var6 == rs.p_i.C_a.p || this.cE == 0 || this.cE == 1 && this.i(var7))) {
               if (var1 > var5 - 14 && var1 <= var5) {
                  if (cT >= 1) {
                     this.a("Report abuse @whi@" + var7, 606);
                  }

                  this.a("Add ignore @whi@" + var7, 42);
                  this.a("Add friend @whi@" + var7, 337);
               }

               var2++;
            }

            if ((var6 == 5 || var6 == 6) && this.nS == 0 && this.cE < 2) {
               var2++;
            }

            if (var6 == rs.p_i.C_a.n && (this.fZ == 0 || this.fZ == 1 && this.i(var7))) {
               if (var1 > var5 - 14 && var1 <= var5) {
                  this.a("Accept trade @whi@" + var7, 484);
               }

               var2++;
            }

            if (var6 == 8 && (this.fZ == 0 || this.fZ == 1 && this.i(var7))) {
               if (var1 > var5 - 14 && var1 <= var5) {
                  this.a("Accept challenge @whi@" + var7, 6);
               }

               var2++;
            }
         }
      }
   }

   public boolean c(String var1) {
      if (var1 != null && !var1.isEmpty() && var1.length() <= 80) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            char var3 = var1.charAt(var2);
            if ((var3 < 'a' || var3 > 'z') && (var3 < 'A' || var3 > 'Z') && (var3 < '0' || var3 > '9') && var3 != ' ' && var3 != '_' && var3 != '-') {
               return false;
            }
         }

         String var4 = "::" + var1;
         this.d(var4);
         if (h(var4)) {
            return true;
         } else {
            fv.a(103);
            fv.b(var4.length() - 1);
            fv.a(var1);
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean h(String var0) {
      return var0.equalsIgnoreCase("::queuedclicks") || var0.equalsIgnoreCase("::queuedclicks on") || var0.equalsIgnoreCase("::queuedclicks off");
   }

   public void d(String var1) {
      if (h(var1)) {
         rs.p_f.C_a.be = var1.equalsIgnoreCase("::queuedclicks") ? !rs.p_f.C_a.be : var1.equalsIgnoreCase("::queuedclicks on");
         this.bg();
         this.v();
         rs.p_f.C_a.d();
         this.a("<img=163> Queued item clicks: " + (rs.p_f.C_a.be ? "on" : "off") + ". Use ::queuedclicks to toggle.", 0, null);
      } else {
         if (var1.equals("::fixed")) {
            rs.p_f.C_a.ai = rs.p_f.C_a.c.a;
            this.a(rs.p_f.C_a.c.a);
         }

         if (var1.equals("::resizable")) {
            rs.p_f.C_a.ai = rs.p_f.C_a.c.b;
            this.a(rs.p_f.C_a.c.b);
         }

         if (var1.startsWith("::")) {
            try {
               rs.p_n.C_a.a(this, var1, cT);
            } catch (Exception var15) {
               var15.printStackTrace();
            }
         }

         if (cT == 2) {
            String var2 = var1.toLowerCase();
            if (var2.equals("::clear chat")) {
               for (int var3 = 0; var3 < 200; var3++) {
                  this.dC[var3] = null;
               }
            }

            if (var2.startsWith("::chatinterface")) {
               int var25 = Integer.valueOf(var1.split(" ")[1]);
               this.gp = var25;
            }

            if (var2.startsWith("::resetoverlays")) {
               rs.p_l.p_e.C_f.a();
            }

            if (var2.startsWith("::find ")) {
               String var26 = var2.replace("::find ", "");
               ArrayList var4 = new ArrayList();

               for (int var5 = 1; var5 < 40000; var5++) {
                  try {
                     rs.p_d.C_k var6 = rs.p_d.C_k.f(var5);
                     if (var6 != null
                        && var6.w != null
                        && var6.w.toLowerCase().contains(var26)
                        && (var6.w.contains("@gre@") || !this.ca)
                        && (!var6.b() || !this.cb)) {
                        String var7 = var6.w.contains("@gre@") ? "<col=007A00>[Unspawnable] " : "@red@[Spawnable] ";
                        String var8 = var6.b() ? " <col=5700FF>(Noted) " : "";
                        var4.add(var7 + var8 + "@dre@" + var6.w.replace("@gre@", "") + " @or3@- @mag@" + var5);
                     }
                  } catch (Exception var16) {
                     break;
                  }
               }

               this.a("<img=9> Resulted @blu@" + var4.size() + "@bla@ item(s) for term \"@blu@" + var26 + "\":", 0, null);

               for (Object var56Obj : var4) {
                  String var56 = (String)var56Obj;
                  this.a(var56, 0, null);
               }
            }

            if (var2.startsWith("::filter")) {
               if (var2.equals("::filters")) {
                  this.a("<img=163> Spawnable item searches are: " + (this.ca ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                  this.a("<img=163> Noted item searches are: " + (this.cb ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
               } else {
                  String var27 = var2.replace("::filter ", "");
                  if (var27.startsWith("spawn")) {
                     this.ca = !this.ca;
                     this.a("<img=163> Spawnable item searches are now: " + (this.ca ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                  }

                  if (var27.startsWith("note")) {
                     this.cb = !this.cb;
                     this.a("<img=163> Noted item searches are now: " + (this.cb ? "@red@DISABLED" : "@blu@ENABLED"), 0, null);
                  }
               }
            }

            if (var2.startsWith("::nodes")) {
               this.a("PLAYER_NODES=" + rs.p_a.C_k.aL.b, 0, null);
               this.a("NPC_NODES=" + rs.p_d.C_d.M.b, 0, null);
            }

            if (var2.startsWith("::render ")) {
               String[] var28 = var2.split(" ");
               String var39 = var28[1];
               String var49 = var28[2];
               if (var39.startsWith("player")) {
                  rs.p_f.C_a.J = var49.equals("on");
                  this.a("RENDER_PLAYERS=" + rs.p_f.C_a.J, 0, null);
               }

               if (var39.startsWith("npc")) {
                  rs.p_f.C_a.K = var49.equals("on");
                  this.a("RENDER_NPCS=" + rs.p_f.C_a.K, 0, null);
               }

               if (var39.startsWith("texture")) {
                  rs.p_f.C_a.M = var49.equals("on");
                  this.a("RENDER_TEXTURES=" + rs.p_f.C_a.M, 0, null);
               }
            }

            if (var1.startsWith("::setinterface") && rs.p_l.C_j.b(cT)) {
               int var29 = cH;
               int var40 = Integer.valueOf(var1.split(" ")[1]);
               if (var40 == -1) {
                  aW = -1;
               } else {
                  aW = var29;
                  rs.p_n.C_e var50 = rs.p_n.C_e.H[var29];

                  for (int var57 = 0; var57 < var50.al.length; var57++) {
                     if (var50.al[var57] == var40) {
                        aV = var57;
                        aX = var50.am[var57];
                        aY = var50.bc[var57];
                     }
                  }
               }
            }

            if (var1.startsWith("::colors")) {
               int var30 = Integer.valueOf(var1.split(" ")[1]);
               rs.p_d.C_k var41 = rs.p_d.C_k.f(var30);
               if (var41 == null) {
                  this.a("Can't find item definition!", 0, "");
               } else {
                  rs.p_a.C_h var51 = new rs.p_a.C_h(var41.A);
                  ArrayList var58 = new ArrayList();
                  if (var51 != null && var51.ar != null) {
                     for (int var63 = 0; var63 < var51.ah; var63++) {
                        if (!var58.contains(var51.ar[var63])) {
                           var58.add(var51.ar[var63]);
                        }
                     }

                     for (int var64 = 0; var64 < var58.size(); var64++) {
                        this.a("[" + var64 + "] = " + var58.get(var64), 0, "");
                        System.out.print(var58.get(var64) + ", ");
                     }
                  } else {
                     this.a("Can't find item model! ", 0, "");
                  }
               }
            }

            if (var1.startsWith("::m1models")) {
               int var31 = Integer.valueOf(var1.split(" ")[1]);
               rs.p_d.C_k var42 = rs.p_d.C_k.f(var31);
               if (var42 == null) {
                  this.a("Can't find item definition!", 0, "");
               } else {
                  System.out.print(var42.r + ", ");
               }
            }

            if (var1.startsWith("::m1colors")) {
               int var32 = Integer.valueOf(var1.split(" ")[1]);
               rs.p_d.C_k var43 = rs.p_d.C_k.f(var32);
               if (var43 == null) {
                  this.a("Can't find item definition!", 0, "");
               } else {
                  rs.p_a.C_h var52 = new rs.p_a.C_h(var43.r);
                  ArrayList var59 = new ArrayList();
                  if (var52 != null && var52.ar != null) {
                     for (int var65 = 0; var65 < var52.ah; var65++) {
                        if (!var59.contains(var52.ar[var65])) {
                           var59.add(var52.ar[var65]);
                        }
                     }

                     for (int var66 = 0; var66 < var59.size(); var66++) {
                        this.a("[" + var66 + "] = " + var59.get(var66), 0, "");
                        System.out.print(var59.get(var66) + ", ");
                     }
                  } else {
                     this.a("Can't find item model! ", 0, "");
                  }
               }
            }

            if (var1.startsWith("::m2colors")) {
               int var33 = Integer.valueOf(var1.split(" ")[1]);
               rs.p_d.C_k var44 = rs.p_d.C_k.f(var33);
               if (var44 == null) {
                  this.a("Can't find item definition!", 0, "");
               } else {
                  rs.p_a.C_h var53 = new rs.p_a.C_h(var44.K);
                  ArrayList var60 = new ArrayList();
                  if (var53 != null && var53.ar != null) {
                     for (int var67 = 0; var67 < var53.ah; var67++) {
                        if (!var60.contains(var53.ar[var67])) {
                           var60.add(var53.ar[var67]);
                        }
                     }

                     for (int var68 = 0; var68 < var60.size(); var68++) {
                        this.a("[" + var68 + "] = " + var60.get(var68), 0, "");
                        System.out.print(var60.get(var68) + ", ");
                     }
                  } else {
                     this.a("Can't find item model! ", 0, "");
                  }
               }
            }

            if (var1.equals("::map") && rs.p_l.C_j.b(cT)) {
               rs.p_d.C_r.a(true);
            }

            if (var1.equals("::dumpitems") && rs.p_l.C_j.b(cT)) {
               this.a(false);
            }

            if (var1.startsWith("::selectdump") && rs.p_l.C_j.b(cT)) {
               int var34 = Integer.parseInt(var1.split(" ")[1]);
               this.a(var34);
            }

            if (var1.equals("::lag") && rs.p_l.C_j.b(cT)) {
               this.bB();
            }
         }

         if (var1.equals("::clienthide") && rs.p_l.C_j.b(cT)) {
            eR.bm = false;
         }

         if (var1.equals("::clientshow") && rs.p_l.C_j.b(cT)) {
            eR.bm = true;
         }

         if (var1.equals("::coordson")) {
            rs.p_f.C_a.ao = true;
         }

         if (var1.equals("::coordsoff")) {
            rs.p_f.C_a.ao = false;
         }

         if (var1.equals("::dataon")) {
            rs.p_f.C_a.am = true;
         }

         if (var1.equals("::dataoff")) {
            rs.p_f.C_a.am = false;
         }

         if (var1.equals("::teletoggle") && rs.p_l.C_j.c(cT)) {
            rs.p_f.C_a.t = !rs.p_f.C_a.t;
            this.a("<img=6> You've " + (rs.p_f.C_a.t ? "enabled" : "disabled") + " this option!", 0, null);
            rs.p_f.C_a.d();
         }

         if (var1.equals("::damage_test prepare")) {
            String[] var17 = new String[]{"::infspec", "::boost", "::tank"};

            for (String var61 : var17) {
               fv.a(103);
               fv.b(var61.length() - 1);
               fv.a(var61.substring(2));
            }
         }

         if (var1.equals("::fps")) {
            rs.p_f.C_a.bm = !rs.p_f.C_a.bm;
            this.a(
               "<img=163> You've " + (rs.p_f.C_a.bm ? "enabled" : "disabled") + " FPS display! Re-enter the command @blu@::fps@bla@ again to toggle.", 0, null
            );
         }

         if (var1.equals("::ping") && rs.p_l.C_j.b(cT)) {
            rs.p_f.C_a.bn = !rs.p_f.C_a.bn;
            this.a(
               "<img=163> You've " + (rs.p_f.C_a.bn ? "enabled" : "disabled") + " ping display! Re-enter the command @blu@::ping@bla@ again to toggle.",
               0,
               null
            );
         }

         if (var1.toLowerCase().startsWith("::displayicon") && rs.p_l.C_j.b(cT)) {
            try {
               int var18 = Integer.parseInt(var1.split(" ")[1]);
               rs.p_f.C_a.bf = var18;
               this.a("<img=163> You have set displayed icon to: @blu@" + var18, 0, null);
               C_ai.h();
            } catch (Exception var14) {
               var14.printStackTrace();
            }
         }

         if (var1.equals("::showbh")) {
            rs.p_f.C_a.bo = true;
            this.a("<img=163> You've enabled BH display! Re-enter the command @blu@::hidebh@bla@ to hide it.", 0, null);
         }

         if (var1.equals("::hidebh")) {
            rs.p_f.C_a.bo = false;
            this.a("<img=163> You've disabled BH display! Re-enter the command @blu@::showbh@bla@ to show it again.", 0, null);
         }

         if (var1.equalsIgnoreCase("::gsdecor")) {
            rs.p_f.C_a.aV = !rs.p_f.C_a.aV;
            this.a("<img=163> You've " + (!rs.p_f.C_a.aV ? "@blu@enabled@bla@" : "@red@disabled@bla@") + " godsword special scroll decorations!", 0, null);
         }

         if (var1.equalsIgnoreCase("::bots")) {
            rs.p_f.C_a.bp = !rs.p_f.C_a.bp;
            this.a("<img=163> You've " + (rs.p_f.C_a.bp ? "enabled" : "disabled") + " bots! Re-enter the command @blu@::bots@bla@ again to toggle.", 0, null);
         }

         if (var1.toLowerCase().startsWith("::setdrag")) {
            try {
               int var19 = Integer.parseInt(var1.split(" ")[1]);
               rs.p_f.C_a.bd = var19;
               this.a("<img=163> You have set item dragging to: @blu@" + var19, 0, null);
               C_ai.h();
            } catch (Exception var13) {
               var13.printStackTrace();
            }
         }

         if (var1.toLowerCase().startsWith("::setswitch")) {
            try {
               if (rs.p_f.C_a.aE) {
                  this.a("<img=25> This value is set to @blu@0@bla@ by default with 07 ticks enabled!", 0, null);
               } else {
                  int var20 = Integer.parseInt(var1.split(" ")[1]);
                  if (var20 < 0) {
                     var20 = 0;
                  }

                  if (var20 > 500) {
                     var20 = 500;
                  }

                  ic = (long)var20;
                  this.a("<img=163> You have set item switching to: @blu@" + var20, 0, null);
                  C_ai.h();
               }
            } catch (Exception var12) {
               var12.printStackTrace();
            }
         }

         if (var1.equals("::console")) {
            rs.p_f.C_a.aM = !rs.p_f.C_a.aM;
            this.a("<img=163> Developer console is now: " + (rs.p_f.C_a.aM ? "@blu@ON" : "@red@OFF"), 0, null);
            rs.p_f.C_a.d();
         }

         if (var1.equals("::noclip") && rs.p_l.C_j.b(cT)) {
            for (int var21 = 0; var21 < 4; var21++) {
               for (int var36 = 1; var36 < 103; var36++) {
                  for (int var46 = 1; var46 < 103; var46++) {
                     this.fP[var21].a[var36][var46] = 0;
                  }
               }
            }
         }

         if (var1.equals("::walktest") && rs.p_l.C_j.b(cT)) {
            boolean var22 = this.a(0, 0, 0, 0, eR.l[0], 0, 0, 67, eR.k[0], true, 16);
         }

         if (var1.equals("::testregion") && rs.p_l.C_j.b(cT)) {
            int var23 = 0;
            int[] var37 = new int[]{16170};

            for (int var69 : var37) {
               long var70 = System.currentTimeMillis();
               this.c(var69);
               C_e.b();
               C_e.a();
               var23++;
               long var10 = System.currentTimeMillis() - var70;
               System.out.println("Progress: " + var23 + "/" + var37.length + " (" + var10 + " ms)");
            }
         }

         if (var1.startsWith("::setitem") && rs.p_l.C_j.b(cT)) {
            String var24 = var1.substring(10);
            if (var24.equalsIgnoreCase("-1")) {
               ba = false;
            } else {
               ba = true;
               bb = Integer.parseInt(var24);
               fb = true;
               rs.p_d.C_k var38 = rs.p_d.C_k.f(bb);
               bd = var38.Z;
               be = var38.G;
               bc = var38.M;
               bf = var38.v;
               bg = var38.W;
            }
         }
      }
   }

   public void a(rs.p_n.C_e var1) {
      int var2 = var1.J;
      if ((var2 < 1 || var2 > 100) && (var2 < 701 || var2 > 800)) {
         if ((var2 < 101 || var2 > 200) && (var2 < 801 || var2 > 900)) {
            if (var2 == 203) {
               int var22 = this.kA;
               if (this.kB != 2) {
                  var22 = 0;
               }

               var1.aH = var22 * 15 + 20;
               if (var1.aH <= var1.aR) {
                  var1.aH = var1.aR + 1;
               }
            } else if (var2 >= 401 && var2 <= 500) {
               var2 -= 401;
               if (var2 == 0 && this.kB == 0) {
                  var1.at = "Loading ignore list";
                  var1.M = 0;
               } else if (var2 == 1 && this.kB == 0) {
                  var1.at = "Please wait...";
                  var1.M = 0;
               } else {
                  int var21 = this.jD;
                  if (this.kB == 0) {
                     var21 = 0;
                  }

                  if (var2 >= var21) {
                     var1.at = "";
                     var1.M = 0;
                  } else {
                     var1.at = C_O_uc.c(C_O_uc.a(this.kP[var2]));
                     var1.M = 1;
                  }
               }
            } else if (var2 == 503) {
               var1.aH = this.jD * 15 + 20;
               if (var1.aH <= var1.aR) {
                  var1.aH = var1.aR + 1;
               }
            } else if (var2 == 327) {
               var1.aU = 150;
               var1.aV = (int)(Math.sin((double)ff / 40.0) * 256.0) & 2047;
               if (this.md) {
                  for (int var19 = 0; var19 < 7; var19++) {
                     int var23 = this.mu[var19];
                     if (var23 >= 0 && !rs.p_d.C_j.b[var23].a()) {
                        return;
                     }
                  }

                  this.md = false;
                  rs.p_a.C_h[] var20 = new rs.p_a.C_h[7];
                  int var24 = 0;

                  for (int var25 = 0; var25 < 7; var25++) {
                     int var28 = this.mu[var25];
                     if (var28 >= 0) {
                        var20[var24++] = rs.p_d.C_j.b[var28].b();
                        int var7 = var24 - 1;
                        if (var20[var7] != null) {
                           for (int[] var11 : dV) {
                              if (dU[4][this.lB[4]] == var11[0]) {
                                 var20[var7].e(4550, var11[1]);
                              }
                           }
                        }
                     }
                  }

                  rs.p_a.C_h var26 = new rs.p_a.C_h(var24, var20);

                  for (int var29 = 0; var29 < 5; var29++) {
                     if (this.lB[var29] != 0) {
                        if (dU[4][this.lB[4]] == 10 || dU[4][this.lB[4]] == 491769) {
                           var26.b(new int[]{4550}, -50);
                        }

                        var26.i(dU[var29][0], dU[var29][this.lB[var29]]);
                        if (var29 == 1) {
                           var26.i(fz[0], fz[this.lB[var29]]);
                        }
                     }
                  }

                  var26.n();
                  var26.f(rs.p_d.C_a.a[eR.t].e[0], eR.t);
                  var26.b(64, 850, -30, -50, -30, true);
                  var1.ae = 5;
                  var1.af = 0;
                  rs.p_n.C_e.a(this.lD, var26);
               }
            } else {
               if (var2 == 328) {
                  short var16 = 150;
                  int var4 = (int)(Math.sin((double)ff / 40.0) * 256.0) & 2047;
                  var1.aU = var16;
                  var1.aV = var4;
                  if (this.md) {
                     rs.p_a.C_h var5 = eR.m();

                     for (int var6 = 0; var6 < 5; var6++) {
                        if (this.lB[var6] != 0) {
                           var5.i(dU[var6][0], dU[var6][this.lB[var6]]);
                           if (var6 == 1) {
                              var5.i(fz[0], fz[this.lB[var6]]);
                           }
                        }
                     }

                     int var27 = eR.p();
                     if (var5 == null) {
                        return;
                     }

                     var5.n();
                     var5.f(rs.p_d.C_a.a[var27].e[0], var27);
                     var1.ae = 5;
                     var1.af = 0;
                     rs.p_n.C_e.a(this.lD, var5);
                  }
               }

               if (var2 == 324) {
                  if (this.kT == null) {
                     this.kT = var1.E;
                     this.kU = var1.aG;
                  }

                  if (this.ml) {
                     var1.E = this.kU;
                  } else {
                     var1.E = this.kT;
                  }
               } else if (var2 == 325) {
                  if (this.kT == null) {
                     this.kT = var1.E;
                     this.kU = var1.aG;
                  }

                  if (this.ml) {
                     var1.E = this.kT;
                  } else {
                     var1.E = this.kU;
                  }
               } else if (var2 == 600) {
                  var1.at = this.kr;
                  if (ff % 20 < 10) {
                     var1.at = var1.at + "|";
                  } else {
                     var1.at = var1.at + " ";
                  }
               } else {
                  if (var2 == 613) {
                     if (cT != 1 && cT != 2) {
                        var1.at = "";
                     } else if (this.nz) {
                        var1.ad = 16711680;
                        var1.at = "Moderator option: Mute player for 48 hours: <ON>";
                     } else {
                        var1.ad = 16777215;
                        var1.at = "Moderator option: Mute player for 48 hours: <OFF>";
                     }
                  }

                  if (var2 == 650 || var2 == 655) {
                     if (this.nR != 0) {
                        String var17;
                        if (this.lM == 0) {
                           var17 = "earlier today";
                        } else if (this.lM == 1) {
                           var17 = "yesterday";
                        } else {
                           var17 = this.lM + " days ago";
                        }

                        var1.at = "You last logged in " + var17 + " from: " + rs.p_v.C_a.i;
                     } else {
                        var1.at = "";
                     }
                  }

                  if (var2 == 651) {
                     if (this.nx == 0) {
                        var1.at = "0 unread messages";
                        var1.ad = 16776960;
                     }

                     if (this.nx == 1) {
                        var1.at = "1 unread message";
                        var1.ad = 65280;
                     }

                     if (this.nx > 1) {
                        var1.at = this.nx + " unread messages";
                        var1.ad = 65280;
                     }
                  }

                  if (var2 == 652) {
                     if (this.nC == 201) {
                        if (this.nf == 1) {
                           var1.at = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                           var1.at = "";
                        }
                     } else if (this.nC == 200) {
                        var1.at = "You have not yet set any password recovery questions.";
                     } else {
                        String var18;
                        if (this.nC == 0) {
                           var18 = "Earlier today";
                        } else if (this.nC == 1) {
                           var18 = "Yesterday";
                        } else {
                           var18 = this.nC + " days ago";
                        }

                        var1.at = var18 + " you changed your recovery questions";
                     }
                  }

                  if (var2 == 653) {
                     if (this.nC == 201) {
                        if (this.nf == 1) {
                           var1.at = "@whi@recommend you use a members world instead. You may use";
                        } else {
                           var1.at = "";
                        }
                     } else if (this.nC == 200) {
                        var1.at = "We strongly recommend you do so now to secure your account.";
                     } else {
                        var1.at = "If you do not remember making this change then cancel it immediately";
                     }
                  }

                  if (var2 == 654) {
                     if (this.nC == 201) {
                        if (this.nf == 1) {
                           var1.at = "@whi@this world but member benefits are unavailable whilst here.";
                           return;
                        }

                        var1.at = "";
                        return;
                     }

                     if (this.nC == 200) {
                        var1.at = "Do this from the 'account management' area on our front webpage";
                        return;
                     }

                     var1.at = "Do this from the 'account management' area on our front webpage";
                  }
               }
            }
         } else {
            int var15 = this.kA;
            if (this.kB != 2) {
               var15 = 0;
            }

            if (var2 > 800) {
               var2 -= 701;
            } else {
               var2 -= 101;
            }

            if (var2 >= var15) {
               var1.at = "";
               var1.M = 0;
            } else {
               if (this.jG[var2] == 0) {
                  var1.at = "@red@Offline";
               } else if (this.jG[var2] == 10) {
                  var1.at = "@gre@Online";
               } else if (this.jG[var2] == 11) {
                  var1.at = "<img=203> @yel@AFK";
               }

               var1.M = 1;
            }
         }
      } else if (var2 == 1 && this.kB == 0) {
         var1.at = "Loading friend list";
         var1.M = 0;
      } else if (var2 == 1 && this.kB == 1) {
         var1.at = "Connecting to friendserver";
         var1.M = 0;
      } else if (var2 == 2 && this.kB != 2) {
         var1.at = "Please wait...";
         var1.M = 0;
      } else {
         int var3 = this.kA;
         if (this.kB != 2) {
            var3 = 0;
         }

         if (var2 > 700) {
            var2 -= 601;
         } else {
            var2--;
         }

         if (var2 >= var3) {
            var1.at = "";
            var1.M = 0;
         } else {
            var1.at = this.mT[var2];
            var1.M = 1;
         }
      }
   }

   public void D() {
      if (this.eN == 0L && this.nS == 0) {
         if (rs.p_f.C_a.aA && this.co != null && !this.co.equals("")) {
            int var14 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : ah - 499;
            this.gm.b("<img=2> <col=FE610C>[Broadcast]:</col> " + this.co, 4, 329 + var14, 16777215, 0);
         }
      } else {
         int var1 = ai() ? 0 : 4;
         int var2 = ai() ? 0 : -4;
         if (this.v.h() && !this.f()) {
            var2 -= 135;
         }

         rs.p_l.C_K_uc var3 = this.gi;
         int var4 = 0;
         if (this.eN != 0L || rs.p_f.C_a.aA && this.co != null && !this.co.equals("")) {
            int var5 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : ah - 499;
            if (this.eN == 0L) {
               this.gm.b("<img=2> <col=FE610C>[Broadcast]:</col> " + this.co, 4 + var1, 329 + var5 - var2, 16777215, 0);
            }

            var4 = 1;
         }

         for (int var15 = 0; var15 < 200; var15++) {
            if (this.dC[var15] != null) {
               int var6 = this.dz[var15];
               String var7 = this.dB[var15];
               int var8 = this.dA[var15];
               short var9 = 170;
               int var10 = rs.p_l.C_j.a(var7, var8);
               if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.cE == 0 || this.cE == 1 && this.i(var7))) {
                  int var11 = 329 - var4 * 13;
                  if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
                     var11 = ah - var9 - var4 * 13;
                  }

                  var11 -= var2;
                  int var12 = 4 + var1;
                  this.gm.b("From", var12, var11, var10, 0);
                  var12 += var3.a("From ");
                  if (var8 >= 1 && var8 < fE.length) {
                     byte var13 = 0;
                     if (rs.p_l.C_h.b(var8) == 94) {
                        var13 = -1;
                     }

                     if (rs.p_l.C_j.b.w_(var8)) {
                        var12 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(var8)).h();
                     }

                     fE[rs.p_l.C_h.b(var8)].f(var12 + var13, var11 - 12);
                     var12 += 14;
                     if (rs.p_l.C_j.b.w_(var8)) {
                        var12 += ((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(var8)).j();
                     }
                  }

                  this.gm.b(var7 + ": " + this.dC[var15], var12, var11, var10, 0);
                  if (++var4 >= 5) {
                     return;
                  }
               }

               if (var6 == 5 && this.cE < 2) {
                  int var17 = 329 - var4 * 13;
                  if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
                     var17 = ah - var9 - var4 * 13;
                  }

                  var17 -= var2;
                  var3.b(0, this.dC[var15], var17, 4 + var1);
                  var3.b(65535, this.dC[var15], var17 - 1, 4 + var1);
                  if (++var4 >= 5) {
                     return;
                  }
               }

               if (var6 == 6 && this.cE < 2) {
                  int var19 = 329 - var4 * 13;
                  if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
                     var19 = ah - var9 - var4 * 13;
                  }

                  var19 -= var2;
                  var3.b(0, "To " + var7 + ": " + this.dC[var15], var19, 4 + var1);
                  var3.b(65535, "To " + var7 + ": " + this.dC[var15], var19 - 1, 4 + var1);
                  if (++var4 >= 5) {
                     return;
                  }
               }
            }
         }
      }
   }

   public void a(String var1, int var2, String var3) {
      var1 = this.ix.a(this.iw.a(var1));
      if (var2 == 0 && this.en != -1) {
         this.cD = var1;
         super.hU = 0;
      }

      if (this.gp == -1) {
         fM = true;
      }

      var2 = rs.p_i.C_a.a(var1, var2);
      var1 = rs.p_i.C_a.b(var1, var2);
      boolean var5 = rs.p_i.C_a.c(var1, var2);
      C_ChatMessage_mc var6 = new C_ChatMessage_mc();
      var6.setMessage(var1);
      this.p.post(var6);

      for (int var7 = 199; var7 > 0; var7--) {
         this.dA[var7] = this.dA[var7 - 1];
         this.dz[var7] = this.dz[var7 - 1];
         this.dB[var7] = this.dB[var7 - 1];
         this.dC[var7] = this.dC[var7 - 1];
         this.dD[var7] = this.dD[var7 - 1];
      }

      int var15 = 0;

      for (int var9 = 0; var9 <= fE.length; var9++) {
         if (var3 != null && var3.startsWith("@cr" + var9 + "@")) {
            byte var8 = 5;
            if (var9 >= 10 && var9 <= 99) {
               var8 = 6;
            }

            if (var9 >= 100) {
               var8 = 7;
            }

            var3 = var3.substring(var8);
            var15 = var9;
         }
      }

      if (var2 == 7) {
         this.p.post(new C_PrivateChatMessage_mc(var3, var1));
      }

      var3 = rs.p_l.C_h.d(var3);
      var1 = this.ix.b(this.iw.b(rs.p_l.C_h.d(rs.p_i.C_a.b(var1, var2))));
      this.dA[0] = var15;
      this.dz[0] = var2;
      this.dB[0] = var3;
      this.dC[0] = var1;
      this.dD[0] = var5;
   }

   public boolean E() {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : ai - 772;
      int var4 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : ah - 505;
      if (super.hU == 1) {
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a || rs.p_f.C_a.ai != rs.p_f.C_a.c.a && !var1) {
            for (int var5 = 0; var5 < this.iU.length; var5++) {
               if (C_C_uc.hP >= this.iV[var5] + var3
                  && C_C_uc.hP <= this.iV[var5] + this.iU[var5] + var3
                  && C_C_uc.hQ >= this.iW[var5] + var4
                  && C_C_uc.hQ < this.iW[var5] + 37 + var4
                  && eT[var5] != -1) {
                  fL = var5;
                  eM = true;
                  return true;
               }
            }
         } else if (var1 && ai < 1000) {
            if (super.hV >= ai - 226 && super.hV <= ai - 195 && super.hW >= ah - 72 && super.hW < ah - 40 && eT[0] != -1) {
               if (fL == 0) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 0;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 194 && super.hV <= ai - 163 && super.hW >= ah - 72 && super.hW < ah - 40 && eT[1] != -1) {
               if (fL == 1) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 1;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 162 && super.hV <= ai - 131 && super.hW >= ah - 72 && super.hW < ah - 40 && eT[2] != -1) {
               if (fL == 2) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 2;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 129 && super.hV <= ai - 98 && super.hW >= ah - 72 && super.hW < ah - 40 && eT[3] != -1) {
               if (fL == 3) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 3;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 97 && super.hV <= ai - 66 && super.hW >= ah - 72 && super.hW < ah - 40 && eT[4] != -1) {
               if (fL == 4) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 4;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 65 && super.hV <= ai - 34 && super.hW >= ah - 72 && super.hW < ah - 40 && eT[5] != -1) {
               if (fL == 5) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 5;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 33 && super.hV <= ai && super.hW >= ah - 72 && super.hW < ah - 40 && eT[6] != -1) {
               if (fL == 6) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 6;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 194 && super.hV <= ai - 163 && super.hW >= ah - 37 && super.hW < ah - 0 && eT[8] != -1) {
               if (fL == 8) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 8;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 162 && super.hV <= ai - 131 && super.hW >= ah - 37 && super.hW < ah - 0 && eT[9] != -1) {
               if (fL == 9) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 9;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 129 && super.hV <= ai - 98 && super.hW >= ah - 37 && super.hW < ah - 0 && eT[10] != -1) {
               if (fL == 7) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 7;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 97 && super.hV <= ai - 66 && super.hW >= ah - 37 && super.hW < ah - 0 && eT[11] != -1) {
               if (fL == 11) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 11;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 65 && super.hV <= ai - 34 && super.hW >= ah - 37 && super.hW < ah - 0 && eT[12] != -1) {
               if (fL == 12) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 12;
               eM = true;
               return true;
            }

            if (super.hV >= ai - 33 && super.hV <= ai && super.hW >= ah - 37 && super.hW < ah - 0 && eT[13] != -1) {
               if (fL == 13) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 13;
               eM = true;
               return true;
            }
         } else if (var1 && ai >= 1000 && C_C_uc.hQ >= ah - 37 && C_C_uc.hQ <= ah) {
            if (C_C_uc.hP >= ai - 417 && C_C_uc.hP <= ai - 386) {
               if (fL == 0) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 0;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 385 && C_C_uc.hP <= ai - 354) {
               if (fL == 1) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 1;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 353 && C_C_uc.hP <= ai - 322) {
               if (fL == 2) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 2;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 321 && C_C_uc.hP <= ai - 290) {
               if (fL == 3) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 3;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 289 && C_C_uc.hP <= ai - 258) {
               if (fL == 4) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 4;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 257 && C_C_uc.hP <= ai - 226) {
               if (fL == 5) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 5;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 225 && C_C_uc.hP <= ai - 194) {
               if (fL == 6) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 6;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 193 && C_C_uc.hP <= ai - 163) {
               if (fL == 8) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 8;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 162 && C_C_uc.hP <= ai - 131) {
               if (fL == 9) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 9;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 130 && C_C_uc.hP <= ai - 99) {
               if (fL == 7) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 7;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 98 && C_C_uc.hP <= ai - 67) {
               if (fL == 11) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 11;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 66 && C_C_uc.hP <= ai - 45) {
               if (fL == 12) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

               fL = 12;
               eM = true;
               return true;
            }

            if (C_C_uc.hP >= ai - 31 && C_C_uc.hP <= ai) {
               if (fL == 13) {
                  var2 = !var2;
               } else {
                  var2 = true;
               }

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
      super.ha = null;
      super.gZ = null;
      super.gZ = new rs.p_l.C_C_uc(765, 503, this.B());
      this.ga = true;
   }

   private String bC() {
      if (rs.p_v.C_a.h != null) {
         return rs.p_v.C_a.h.getDocumentBase().getHost().toLowerCase();
      } else {
         return super.hH != null ? "runescape.com" : null;
      }
   }

   private void b(rs.p_l.C_F_uc var1, int var2, int var3) {
      int var4 = var3 * var3 + var2 * var2;
      if (var4 > 4225 && this.jZ == 2) {
         if (var2 <= -45) {
            var2 = -45;
         }

         if (var2 >= 45) {
            var2 = 45;
         }

         if (var3 <= -45) {
            var3 = -45;
         }

         if (var3 >= 45) {
            var3 = 45;
         }

         this.a(this.lK, var3, var2);
      } else {
         if (var4 <= 4225 || var4 >= 90000) {
            this.a(var1, var3, var2);
         }
      }
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      return C_C_uc.hP >= var1 && C_C_uc.hP <= var3 && C_C_uc.hQ >= var2 && C_C_uc.hQ <= var4;
   }

   public boolean d(int var1, int var2) {
      short var3 = 175;
      if (this.v != null && this.v.h() && !this.f()) {
         var3 = 29;
      }

      return var1 > 0 && var1 < 519 && var2 > ah - var3 && var2 < ah;
   }

   public static String a(double var0) {
      return NumberFormat.getInstance().format(var0);
   }

   public boolean G() {
      boolean var1 = true;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = true;
      if (this.b(ai - (ai <= 1000 ? 240 : 420), ah - (ai <= 1000 ? 90 : 37), ai, ah)) {
         return false;
      } else if (rs.p_l.p_e.C_q.bool_a) {
         return false;
      } else {
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            if (ah <= 649) {
               if (hQ >= 192 && hQ <= 211 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                  return false;
               }
            } else if (hQ >= 281 && hQ <= 301 && hP >= ai - 23 && hP <= ai - 6) {
               return false;
            }
         } else if (hQ >= 141 && hQ <= 161 && hP >= 721 && hP <= 736) {
            return false;
         }

         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            if (hP >= ai - 119 && hP <= ai - 96 && hQ >= 166 && hQ <= 188) {
               return false;
            }
         } else if (hP >= 718 && hP <= 744 && hQ >= 57 && hQ <= 79) {
            return false;
         }

         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            if (hP >= ai - 86 && hP <= ai - 62 && hQ >= 172 && hQ <= 198) {
               return false;
            }
         } else if (hP >= 710 && hP <= 733 && hQ >= 22 && hQ <= 48) {
            return false;
         }

         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            if (hQ >= 219 && hQ <= 238 && hP >= ai - 23 && hP <= ai - 6) {
               return false;
            }
         } else if (hQ >= 89 && hQ <= 107 && hP >= 744 && hP <= 759) {
            return false;
         }

         if (this.v.h) {
            return false;
         } else {
            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               if (ah <= 670) {
                  if (hQ >= 166 && hQ <= 182 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                     return false;
                  }
               } else if (hQ >= 313 && hQ <= 333 && hP >= ai - 23 && hP <= ai - 6) {
                  return false;
               }
            } else if (hQ >= 116 && hQ <= 134 && hP >= 744 && hP <= 759) {
               return false;
            }

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               if (ah <= 609) {
                  if (hQ >= 219 && hQ <= 238 && hP >= ai - 23 - 23 && hP <= ai - 6 - 23) {
                     return false;
                  }
               } else if (hQ >= 250 && hQ <= 269 && hP >= ai - 23 && hP <= ai - 6) {
                  return false;
               }
            } else if (hQ >= 141 && hQ <= 161 && hP >= 744 && hP <= 759) {
               return false;
            }

            if (this.d(C_C_uc.hP, C_C_uc.hQ)) {
               return false;
            } else if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b && hQ >= 75 && hQ <= 107 && hP >= ai - 192 - 20 && hP <= ai - 133 - 20) {
               return false;
            } else if (this.b(ai - 190, 0, ai, rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? 163 : 172)) {
               return false;
            } else if (hQ >= 186 && hQ <= 205 && hP >= ai - 23 && hP <= ai - 6) {
               return false;
            } else if (!var4
               || (C_C_uc.hP < ai - 420 || C_C_uc.hP > ai || C_C_uc.hQ < ah - 37 || C_C_uc.hQ > ah)
                  && (C_C_uc.hP <= ai - 242 || C_C_uc.hP >= ai || C_C_uc.hQ <= ah - 335 || C_C_uc.hQ >= ah)) {
               if (var3) {
                  return true;
               } else {
                  return C_C_uc.hP <= 0 || C_C_uc.hQ <= 0 || C_C_uc.hQ >= ai || C_C_uc.hQ >= ah ? false : C_C_uc.hP < ai - 242 || C_C_uc.hQ < ah - 335;
               }
            } else {
               return false;
            }
         }
      }
   }

   public void H() {
      if (this.eA == 0) {
         int var1 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : ah - 505;
         int var2 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : ai - 765;
         this.iB = false;
         this.fx[0] = "Cancel";
         this.eI[0] = 1107;
         this.eV = 1;
         if (!rs.p_l.p_b.C_a.b()) {
            this.bN();
            int var3 = ah - 545;
            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
               var3 = 0;
            }

            if (C_C_uc.hP > 4 && C_C_uc.hQ > 480 + var3 && C_C_uc.hP < 516 && C_C_uc.hQ < ah) {
               this.W();
            }

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
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

            if (C_C_uc.hP >= this.iV[6] + var2
               && C_C_uc.hP <= this.iV[6] + this.iU[6] + var2
               && C_C_uc.hQ >= this.iW[6] + var1
               && C_C_uc.hQ < this.iW[6] + 37 + var1) {
               this.fx[2] = "Magic tab";
               this.eI[2] = 4246;
               this.eV = 2;
               this.fx[1] = (C_ap.d ? "Disable" : "Enable") + " spell filtering";
               this.eI[1] = 4245;
               this.eV = 3;
            }
         }

         br = 0;
         if (!rs.p_l.p_b.C_a.b() && C_C_uc.hP >= 515 && C_C_uc.hQ >= 0 && C_C_uc.hP <= 765 && C_C_uc.hQ <= 167 && cH != -1) {
            this.a(cq, rs.p_n.C_e.H[cH], C_C_uc.hP, cr, C_C_uc.hQ, ai() ? 0 : -4);
         }

         if (this.ks != this.ef) {
            this.ef = this.ks;
         }

         this.ks = 0;
         if (rs.p_l.p_b.C_a.b()) {
            if (cH != -1) {
               if (aj()) {
                  this.a(0, rs.p_n.C_e.H[cH], C_C_uc.hP, 0, C_C_uc.hQ, ai() ? 0 : -4);
               } else {
                  this.a(ai / 2 - 356, rs.p_n.C_e.H[cH], C_C_uc.hP, ah / 2 - 255, C_C_uc.hQ, 0);
               }
            }
         } else if (aj()) {
            if ((!rs.p_l.p_e.C_q.bool_a || cH != -1) && C_C_uc.hP > 0 && C_C_uc.hQ > 0 && C_C_uc.hP < 516 && C_C_uc.hQ < ak + 4) {
               if (cH != -1) {
                  this.a(cq, rs.p_n.C_e.H[cH], C_C_uc.hP, cr, C_C_uc.hQ, ai() ? 0 : -4);
               } else {
                  this.z();
               }
            }
         } else if (this.G()) {
            int var12 = ai / 2 - 356;
            int var4 = ah / 2 - 230;
            int var5 = ai / 2 + 356;
            int var6 = ah / 2 + 230;
            if (cH > 0) {
               rs.p_n.C_e var7 = rs.p_n.C_e.H[cH];
               int var8 = Math.max(356, var7.P);
               int var9 = Math.max(230, var7.aR);
               int var10 = var7.C != Integer.MAX_VALUE ? var7.C : ai / 2 - 356;
               int var11 = var7.D != Integer.MAX_VALUE ? var7.D : ah / 2 - 230;
               var12 = var10;
               var4 = var11;
               var5 = var10 + var8;
               var6 = var11 + var9;
            }

            if (C_C_uc.hP > var12 && C_C_uc.hQ > var4 && C_C_uc.hP < var5 && C_C_uc.hQ < var6 && cH != -1) {
               this.a(var12, rs.p_n.C_e.H[cH], C_C_uc.hP, var4, C_C_uc.hQ, 0);
            } else {
               this.z();
            }
         }

         if (this.ks != this.ef) {
            this.ef = this.ks;
         }

         this.ks = 0;
         short var13 = 548;
         int var15 = 207;
         short var17 = 740;
         short var19 = 468;
         if (!rs.p_l.p_b.C_a.b()) {
            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
               if (C_C_uc.hP > var13 && C_C_uc.hQ > var15 && C_C_uc.hP < var17 && C_C_uc.hQ < var19) {
                  if (this.fu != -1) {
                     this.a(var13 - (ai() ? 0 : 4), rs.p_n.C_e.H[this.fu], C_C_uc.hP, var15, C_C_uc.hQ, ai() ? 0 : 0);
                  } else if (eT[fL] != -1) {
                     this.a(var13 - (ai() ? 0 : 4), rs.p_n.C_e.H[eT[fL]], C_C_uc.hP, var15, C_C_uc.hQ, ai() ? 0 : 0);
                  }
               }
            } else if (C_C_uc.hP > 548 + var2 && C_C_uc.hP < 740 + var2 && C_C_uc.hQ > 207 + var1 && C_C_uc.hQ < 468 + var1) {
               if (this.fu != -1) {
                  this.a(548 + var2, rs.p_n.C_e.H[this.fu], C_C_uc.hP, 207 + var1, C_C_uc.hQ, 0);
               } else if (eT[fL] != -1) {
                  this.a(548 + var2, rs.p_n.C_e.H[eT[fL]], C_C_uc.hP, 207 + var1, C_C_uc.hQ, 0);
               }
            }
         }

         if (this.ks != this.ep) {
            fb = true;
            this.ep = this.ks;
         }

         this.ks = 0;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
            byte var14 = 0;
            var15 = this.f() ? 334 : ak;
            var17 = 490;
            var19 = 459;
            byte var21 = 20;
            short var24 = 354;
            if (C_C_uc.hP > var14 && C_C_uc.hQ > var15 && C_C_uc.hP < var17 && C_C_uc.hQ < var19) {
               if (this.gp != -1) {
                  this.a(var21, rs.p_n.C_e.H[this.gp], C_C_uc.hP, var24, C_C_uc.hQ, ai() ? 0 : -4);
               } else if (!rs.p_l.p_b.C_a.b() && C_C_uc.hQ < var19 && C_C_uc.hP < var17) {
                  this.E(C_C_uc.hQ - var15);
               }
            }
         } else {
            boolean var22 = !this.v.h() || this.f();
            if (C_C_uc.hP > 0 && C_C_uc.hQ > ah - 163 && C_C_uc.hP < 490 && C_C_uc.hQ < ah && var22) {
               if (this.gp != -1) {
                  this.a(20, rs.p_n.C_e.H[this.gp], C_C_uc.hP, ah - 145, C_C_uc.hQ, 0);
               } else if (!rs.p_l.p_b.C_a.b() && C_C_uc.hQ < ah && C_C_uc.hP < 490) {
                  this.E(C_C_uc.hQ - ah - 166);
               }
            }
         }

         if (this.gp != -1 && this.ks != this.em) {
            fM = true;
            this.em = this.ks;
         }

         if (C_C_uc.hP >= 515 && C_C_uc.hQ >= 0 && C_C_uc.hP <= 765 && C_C_uc.hQ <= 167 && cH != -1) {
            this.a(cq, rs.p_n.C_e.H[cH], C_C_uc.hP, cr, C_C_uc.hQ, ai() ? 0 : -4);
         }

         boolean var23 = false;

         while (!var23) {
            var23 = true;

            for (int var25 = 0; var25 < this.eV - 1; var25++) {
               if (this.eI[var25] < 1000 && this.eI[var25 + 1] > 1000) {
                  String var26 = this.fx[var25];
                  this.fx[var25] = this.fx[var25 + 1];
                  this.fx[var25 + 1] = var26;
                  int var27 = this.eI[var25];
                  this.eI[var25] = this.eI[var25 + 1];
                  this.eI[var25 + 1] = var27;
                  var27 = this.eF[var25];
                  this.eF[var25] = this.eF[var25 + 1];
                  this.eF[var25 + 1] = var27;
                  var27 = this.eG[var25];
                  this.eG[var25] = this.eG[var25 + 1];
                  this.eG[var25 + 1] = var27;
                  var27 = this.eJ[var25];
                  this.eJ[var25] = this.eJ[var25 + 1];
                  this.eJ[var25 + 1] = var27;
                  var27 = this.eH[var25];
                  this.eH[var25] = this.eH[var25 + 1];
                  this.eH[var25 + 1] = var27;
                  var23 = false;
               }
            }
         }
      }
   }

   private int i(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return ((var1 & 16711935) * var4 + (var2 & 16711935) * var3 & -16711936) + ((var1 & 0xFF00) * var4 + (var2 & 0xFF00) * var3 & 0xFF0000) >> 8;
   }

   public void a(String var1, String var2, boolean var3) {
      rs.p_v.C_a.o = var1;

      try {
         if (!this.fc || var3) {
            String var4 = this.fm;
            if (var3) {
               rs.p_l.p_d.C_c.b = false;
               this.G.a("Hello, @yel@" + eR.aZ + "@whi@! Apparently, you've DCed..", "Please wait patiently while we attempt to reconnect you..");
            } else {
               if (var1.equalsIgnoreCase("") || var2.equalsIgnoreCase("")) {
                  this.G.a("You can't login with a blank username or password!", "Please enter your valid account information and try again!");
                  return;
               }

               if (var2.startsWith(" ")) {
                  this.G.a("You can't login with a password starting with a blank", "space! Please re-type your password and try again!");
                  return;
               }

               this.G.a("Attempting to log you in..", "Please wait..");
            }

            rs.p_l.p_d.C_c.BOOL_A = true;
            if (!rs.p_f.C_a.d && this.l.b()) {
               rs.p_l.p_d.C_c.BOOL_A = false;
               rs.p_l.p_d.C_c.b = true;
               this.G.a(rs.p_f.C_a.A + " has been updated!", "Please re-load your client");
               this.h(true);
            } else {
               this.nD = new rs.p_q.C_b(this, this.b(rs.p_f.C_a.b));
               rs.p_l.p_d.C_c.BOOL_A = false;
               long var5 = C_O_uc.a(var1);
               int var7 = (int)(var5 >> 16 & 31L);
               fv.h = 0;
               fv.b(14);
               fv.b(var7);
               this.nD.a(2, fv.g);

               for (int var8 = 0; var8 < 8; var8++) {
                  this.nD.b();
               }

               int var16 = this.nD.b();
               rs.p_l.p_d.C_c.b = true;
               int var9 = var16;
               if (var16 == 0) {
                  this.nD.a(this.mU.g, 8);
                  this.mU.h = 0;
                  this.od = this.mU.E();
                  int[] var10 = new int[]{(int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7), (int)(this.od >> 32), (int)this.od};
                  fv.h = 0;
                  fv.b(10);
                  fv.g(var10[0]);
                  fv.g(var10[1]);
                  fv.g(var10[2]);
                  fv.g(var10[3]);
                  fv.g(rs.p_v.C_a.c);
                  fv.g(rs.p_f.C_a.c_ver);
                  if (rs.p_f.C_a.h || rs.p_f.C_a.c_ver == 1) {
                     fv.g(rs.p_f.C_a.i);
                  }

                  if (rs.p_f.C_a.h) {
                     fv.a(fn);
                  }

                  fv.a(var1);
                  fv.a(var2);
                  fv.a(rs.p_v.C_a.e() == null ? "null" : rs.p_v.C_a.e());
                  fv.a(var4);
                  fv.M();
                  this.jS.h = 0;
                  if (var3) {
                     this.jS.b(18);
                  } else {
                     this.jS.b(16);
                  }

                  this.jS.b(fv.h + 36 + 1 + 1 + 2);
                  this.jS.b(255);
                  this.jS.d(317);
                  this.jS.b(li ? 1 : 0);

                  for (int var11 = 0; var11 < 9; var11++) {
                     this.jS.g(this.eE[var11]);
                  }

                  this.jS.a(fv.g, fv.h, 0);
                  fv.l = new rs.p_q.C_a(var10);

                  for (int var19 = 0; var19 < 4; var19++) {
                     var10[var19] += 50;
                  }

                  this.lJ = new rs.p_q.C_a(var10);
                  this.nD.a(this.jS.h, this.jS.g);
                  var16 = this.nD.b();
               }

               if (var16 == 1) {
                  try {
                     Thread.sleep(2000L);
                  } catch (Exception var12) {
                  }

                  this.a(var1, var2, var3);
               } else if (var16 == 2) {
                  cT = this.nD.b();
                  nX = this.nD.b() == 1;
                  this.I();
                  fv.a(185);
                  fv.d(912);
                  rs.p_n.C_e var18 = rs.p_n.C_e.H[912];
                  if (var18.X != null && var18.X[0][0] == 5) {
                     int var20 = var18.X[0][1];
                     if (this.dP[var20] != var18.I[0]) {
                        this.dP[var20] = var18.I[0];
                        this.B(var20);
                        fb = true;
                     }
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
                  rs.p_f.C_a.ai = rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? rs.p_f.C_a.c.a : rs.p_f.C_a.c.b;
                  this.p(22, rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? 0 : 1);
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
                  } else {
                     this.d();
                     this.a(rs.p_f.C_a.ai);
                     C_Y_uc.m(32001);
                     C_ap.j();
                     C_ap.i();
                     this.cc = true;
                     this.h();
                  }
               } else if (var16 == 3) {
                  this.G.a("Invalid username or password!", "Are you sure you typed everything in correctly?");
               } else if (var16 == 4) {
                  this.G.a("You have been banned.", "Please check the main site for details");
               } else if (var16 == 5) {
                  this.G.a("Your account is already logged in.", "Try again in 60 seconds..");
               } else if (var16 == 6) {
                  this.G.a(rs.p_f.C_a.A + " has been updated!", "Please reload your game client.");
               } else if (var16 == 7) {
                  this.G.a("This world is full.", "Please use a different world");
               } else if (var16 == 8) {
                  this.G.a("Unable to connect.", "Login server offline.");
               } else if (var16 == 9) {
                  this.G.a("Login limit exceeded.", "Too many connections from your address.");
               } else if (var16 == 10) {
                  this.G.a("This account is pending email verification..", "If you don't see the email, check your spam folder!");
               } else if (var16 == 11) {
                  this.G.a("Login server rejected session.", "Please try again.");
               } else if (var16 == 12) {
                  this.G.a("This account does not exist!", "Please register at @yel@www.spawnpk.net/register");
               } else if (var16 == 13) {
                  this.G.a("Could not complete login.", "Please try using a different world.");
               } else if (var16 == 14) {
                  this.G.a("The server is being updated.", "Please wait 1 minute and try again.");
               } else if (var16 == 15) {
                  this.fc = true;
                  fv.h = 0;
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
               } else if (var16 == 16) {
                  this.G.a("Login attempts exceeded.", "Please wait 1 minute and try again.");
               } else if (var16 == 17) {
                  this.G.a(rs.p_f.C_a.A + " has been updated!", "Please reload your game client.");
               } else if (var16 == 20) {
                  this.G.a("Invalid loginserver requested", "Please try using a different world.");
               } else if (var16 == 21) {
                  for (int var17 = this.nD.b(); var17 >= 0; var17--) {
                     this.G.a("You have only just left another world", "Your profile will be transferred in: " + var17 + " seconds");
                     this.h(true);

                     try {
                        Thread.sleep(1000L);
                     } catch (Exception var13) {
                     }
                  }

                  this.a(var1, var2, var3);
                  this.fd = false;
               } else if (var16 == 22) {
                  this.G.a("Your account is temporary locked! Please wait a few mins..", "This is usually for refunds, name changes, etc.");
               } else if (var16 == 23) {
                  this.G.a("Your username has been changed!", "Please login with your new username..");
               } else if (var16 == 24) {
                  this.G.a("Invation code is invalid or expired!", "Are you sure you typed it correctly?");
               } else if (var16 == 25) {
                  this.G.a("You can not login with a VPN connection!", "Please try on a different network..");
               } else if (var16 == 26) {
                  this.G.a(0);
               } else if (var16 == 27) {
                  this.G.a(1);
               } else if (var16 == 28) {
                  this.G.a(2);
               } else if (var16 == 29) {
                  this.G.a("This name was changed before SPK's Fresh Start.", "Please use the most recent username!");
               } else if (var16 == 30) {
                  this.G.a("SPK is currently under maintenance..", "Please try again later!");
               } else if (var16 != -1) {
                  System.out.println("response:" + var16);
                  this.G.a("Unexpected server response", "Please try using a different world.");
               } else if (var9 != 0) {
                  this.G.a("No response from server", "Please try using a different world.");
               } else if (this.el < 2) {
                  try {
                     Thread.sleep(2000L);
                  } catch (Exception var14) {
                  }

                  this.el++;
                  this.a(var1, var2, var3);
                  this.fd = false;
               } else {
                  this.G.a("No response from loginserver", "Please wait 1 minute and try again.");
               }
            }
         }
      } catch (IOException var15) {
         this.oC = "";
         var15.printStackTrace();
         rs.p_l.p_d.C_c.BOOL_A = false;
         rs.p_l.p_d.C_c.b = true;
         this.G.a("Error connecting to server!", "The server, or your connection, may be offline!");
      }
   }

   @Override
   void e(int var1, int var2) {
      if (this.ht) {
         this.nM += var1 * 3;
         this.nN += var2 << 1;
      }
   }

   public void I() {
      this.oe = 0L;
      this.lW = 0;
      this.kp.e = 0;
      this.iK = false;
      super.hJ = true;
      this.lf = true;
      this.fc = true;
      this.z = new rs.p_l.p_f.p_a.p_c.C_d();
      rs.p_l.p_f.C_e.d().a(this.z);
      if (this.x != null) {
         rs.p_l.p_f.C_e.d().b(this.x);
      }

      this.x = new rs.p_l.p_f.p_a.p_c.C_c();
      rs.p_l.p_f.C_e.d().a(this.x);
      C_GameStateChanged_mc var1 = new C_GameStateChanged_mc();
      var1.setGameState(rs.p_runelite.p_a.C_c.e);
      this.p.post(var1);
      fv.h = 0;
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
      super.hK = 0;

      for (int var2 = 0; var2 < 200; var2++) {
         this.dC[var2] = null;
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

      for (int var5 = 0; var5 < this.kt; var5++) {
         kw_do[var5] = null;
         this.ky[var5] = null;
      }

      for (int var6 = 0; var6 < 16384; var6++) {
         this.cA[var6] = null;
      }

      eR = kw_do[2047] = new rs.p_a.C_k();
      this.ea.f();
      this.et.f();

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
               this.jH[var7][var3][var4] = null;
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

      for (int var8 = 0; var8 < 5; var8++) {
         this.lB[var8] = 0;
      }

      for (int var9 = 0; var9 < 5; var9++) {
         this.nh[var9] = null;
         this.ni[var9] = false;
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

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
      byte var12 = 104;
      byte var13 = 104;
      if (var9 >= 0 && var5 >= 0) {
         if (var5 < this.kC.length && var9 < this.jF.length) {
            for (int var14 = 0; var14 < var12; var14++) {
               for (int var15 = 0; var15 < var13; var15++) {
                  this.kC[var14][var15] = 0;
                  this.jF[var14][var15] = 99999999;
               }
            }

            int var30 = var9;
            int var31 = var5;
            int var16 = var11 + eh;
            int var17 = var8 + ei;
            int var18 = (var16 >> 6) * 256 + (var17 >> 6);
            if (rs.p_l.C_j.c(cT) && ch && rs.p_f.C_a.t) {
               this.q(var16, var17);
               return true;
            } else {
               this.kC[var9][var5] = 99;
               this.jF[var9][var5] = 0;
               int var19 = 0;
               int var20 = 0;
               this.oK[var19] = var9;
               this.oL[var19++] = var5;
               boolean var21 = false;
               int var22 = this.oK.length;
               int[][] var23 = this.fP[dw].a;
               if (var18 != 13660
                  && var18 != 13916
                  && var18 != 14172
                  && var18 != 14171
                  && var18 != 14170
                  && var18 != 14169
                  && var18 != 13913
                  && var18 != 13657
                  && var18 != 13401
                  && var18 != 13402
                  && var18 != 13403
                  && var18 != 13404) {
                  if (var18 == 11309) {
                     for (int var24 = 2816; var24 <= 2821; var24++) {
                        for (int var25 = 2933; var25 <= 2941; var25++) {
                           int var26 = Math.abs(var24 - eh);
                           int var27 = Math.abs(var25 - ei);
                           if (var26 <= var23.length - 1 && var27 <= var23[var26].length - 1) {
                              var23[var26][var27] = 0;
                           }
                        }
                     }
                  }

                  if (var18 == 12611 && this.aB) {
                     for (int var36 = 3154; var36 <= 3182; var36++) {
                        for (int var41 = 4303; var41 <= 4323; var41++) {
                           int var46 = Math.abs(var36 - eh);
                           int var49 = Math.abs(var41 - ei);
                           var23[var46][var49] = 0;
                        }
                     }
                  }

                  if (var18 == 12342) {
                     int var37 = Math.abs(var16 - eh);
                     int var42 = Math.abs(var17 - ei);
                     if (var16 == 3083 && var17 == 3491) {
                        var23[var37][var42] = 0;
                     }

                     if (var16 == 3083 && var17 == 3492) {
                        var23[var37][var42] = 0;
                     }
                  }

                  while (var20 != var19) {
                     var30 = this.oK[var20];
                     var31 = this.oL[var20];
                     var20 = (var20 + 1) % var22;
                     if (var30 >= 103) {
                        var30 = 102;
                     }

                     if (var31 >= 103) {
                        var31 = 102;
                     }

                     if (var30 == var11 && var31 == var8) {
                        var21 = true;
                        break;
                     }

                     if (var4 != 0) {
                        if ((var4 < 5 || var4 == 10) && this.fP[dw].a(var11, var30, var31, var2, var4 - 1, var8)) {
                           var21 = true;
                           break;
                        }

                        if (var4 < 10 && this.fP[dw].b(var11, var8, var31, var4 - 1, var2, var30)) {
                           var21 = true;
                           break;
                        }
                     }

                     if (var6 != 0 && var3 != 0 && this.fP[dw].a(var8, var11, var30, var3, var7, var6, var31)) {
                        var21 = true;
                        break;
                     }

                     int var38 = this.jF[var30][var31] + 1;
                     if (var30 > 0 && this.kC[var30 - 1][var31] == 0 && (var23[var30 - 1][var31] & 19398920) == 0) {
                        this.oK[var19] = var30 - 1;
                        this.oL[var19] = var31;
                        var19 = (var19 + 1) % var22;
                        this.kC[var30 - 1][var31] = 2;
                        this.jF[var30 - 1][var31] = var38;
                     }

                     if (var30 < var12 - 1 && this.kC[var30 + 1][var31] == 0 && (var23[var30 + 1][var31] & 19399040) == 0) {
                        this.oK[var19] = var30 + 1;
                        this.oL[var19] = var31;
                        var19 = (var19 + 1) % var22;
                        this.kC[var30 + 1][var31] = 8;
                        this.jF[var30 + 1][var31] = var38;
                     }

                     if (var31 > 0 && this.kC[var30][var31 - 1] == 0 && (var23[var30][var31 - 1] & 19398914) == 0) {
                        this.oK[var19] = var30;
                        this.oL[var19] = var31 - 1;
                        var19 = (var19 + 1) % var22;
                        this.kC[var30][var31 - 1] = 1;
                        this.jF[var30][var31 - 1] = var38;
                     }

                     if (var31 < var13 - 1 && this.kC[var30][var31 + 1] == 0 && (var23[var30][var31 + 1] & 19398944) == 0) {
                        this.oK[var19] = var30;
                        this.oL[var19] = var31 + 1;
                        var19 = (var19 + 1) % var22;
                        this.kC[var30][var31 + 1] = 4;
                        this.jF[var30][var31 + 1] = var38;
                     }

                     if (var30 > 0
                        && var31 > 0
                        && this.kC[var30 - 1][var31 - 1] == 0
                        && (var23[var30 - 1][var31 - 1] & 19398926) == 0
                        && (var23[var30 - 1][var31] & 19398920) == 0
                        && (var23[var30][var31 - 1] & 19398914) == 0) {
                        this.oK[var19] = var30 - 1;
                        this.oL[var19] = var31 - 1;
                        var19 = (var19 + 1) % var22;
                        this.kC[var30 - 1][var31 - 1] = 3;
                        this.jF[var30 - 1][var31 - 1] = var38;
                     }

                     if (var30 < var12 - 1
                        && var31 > 0
                        && this.kC[var30 + 1][var31 - 1] == 0
                        && (var23[var30 + 1][var31 - 1] & 19399043) == 0
                        && (var23[var30 + 1][var31] & 19399040) == 0
                        && (var23[var30][var31 - 1] & 19398914) == 0) {
                        this.oK[var19] = var30 + 1;
                        this.oL[var19] = var31 - 1;
                        var19 = (var19 + 1) % var22;
                        this.kC[var30 + 1][var31 - 1] = 9;
                        this.jF[var30 + 1][var31 - 1] = var38;
                     }

                     if (var30 > 0
                        && var31 < var13 - 1
                        && this.kC[var30 - 1][var31 + 1] == 0
                        && (var23[var30 - 1][var31 + 1] & 19398968) == 0
                        && (var23[var30 - 1][var31] & 19398920) == 0
                        && (var23[var30][var31 + 1] & 19398944) == 0) {
                        this.oK[var19] = var30 - 1;
                        this.oL[var19] = var31 + 1;
                        var19 = (var19 + 1) % var22;
                        this.kC[var30 - 1][var31 + 1] = 6;
                        this.jF[var30 - 1][var31 + 1] = var38;
                     }

                     if (var30 < var12 - 1
                        && var31 < var13 - 1
                        && this.kC[var30 + 1][var31 + 1] == 0
                        && (var23[var30 + 1][var31 + 1] & 19399136) == 0
                        && (var23[var30 + 1][var31] & 19399040) == 0
                        && (var23[var30][var31 + 1] & 19398944) == 0) {
                        this.oK[var19] = var30 + 1;
                        this.oL[var19] = var31 + 1;
                        var19 = (var19 + 1) % var22;
                        this.kC[var30 + 1][var31 + 1] = 12;
                        this.jF[var30 + 1][var31 + 1] = var38;
                     }
                  }

                  this.oB = 0;
                  if (!var21) {
                     if (var10) {
                        int var39 = 100;

                        for (int var43 = 1; var43 < 2; var43++) {
                           for (int var47 = var11 - var43; var47 <= var11 + var43; var47++) {
                              for (int var50 = var8 - var43; var50 <= var8 + var43; var50++) {
                                 if (var47 >= 0 && var50 >= 0 && var47 < 104 && var50 < 104 && this.jF[var47][var50] < var39) {
                                    var39 = this.jF[var47][var50];
                                    var30 = var47;
                                    var31 = var50;
                                    this.oB = 1;
                                    var21 = true;
                                 }
                              }
                           }

                           if (var21) {
                              break;
                           }
                        }
                     }

                     if (!var21) {
                        return false;
                     }
                  }

                  var20 = 0;
                  this.oK[var20] = var30;
                  this.oL[var20++] = var31;

                  int var40;
                  for (int var44 = var40 = this.kC[var30][var31]; var30 != var9 || var31 != var5; var44 = this.kC[var30][var31]) {
                     if (var44 != var40) {
                        var40 = var44;
                        this.oK[var20] = var30;
                        this.oL[var20++] = var31;
                     }

                     if ((var44 & 2) != 0) {
                        var30++;
                     } else if ((var44 & 8) != 0) {
                        var30--;
                     }

                     if ((var44 & 1) != 0) {
                        var31++;
                     } else if ((var44 & 4) != 0) {
                        var31--;
                     }
                  }

                  if (var20 <= 0) {
                     return var1 != 1;
                  } else {
                     int var45 = var20;
                     if (var20 > 25) {
                        var45 = 25;
                     }

                     int var48 = this.oK[--var20];
                     int var51 = this.oL[var20];
                     oO += var45;
                     if (oO >= 92) {
                        fv.a(36);
                        fv.g(0);
                        oO = 0;
                     }

                     if (var1 == 0) {
                        fv.a(164);
                        fv.b(var45 + var45 + 3);
                     }

                     if (var1 == 1) {
                        fv.a(248);
                        fv.b(var45 + var45 + 3 + 14);
                     }

                     if (var1 == 2) {
                        fv.a(98);
                        fv.b(var45 + var45 + 3);
                     }

                     fv.p(var48 + eh);
                     this.gd = this.oK[0];
                     this.ge = this.oL[0];

                     for (int var28 = 1; var28 < var45; var28++) {
                        var20--;
                        fv.b(this.oK[var20] - var48);
                        fv.b(this.oL[var20] - var51);
                     }

                     int var52 = eh + (eR.ac - 6 >> 7);
                     int var29 = ei + (eR.ad - 6 >> 7);
                     fv.n(var51 + ei);
                     fv.l(super.hY[5] != 1 ? 0 : 1);
                     return true;
                  }
               } else {
                  return false;
               }
            }
         } else {
            System.out.println("Prevented walk crash #2");
            return false;
         }
      } else {
         System.out.println("Prevented walk crash #1");
         return false;
      }
   }

   private void b(rs.p_x.C_e var1) {
      for (int var2 = 0; var2 < this.kw; var2++) {
         int var3 = this.kx[var2];
         rs.p_a.C_j var4 = this.cA[var3];
         int var5 = var1.A();
         if ((var5 & 256) != 0) {
            var4.V = var1.P();
            var4.X = var1.P();
            var4.W = var1.P();
            var4.Y = var1.P();
            var4.Z = var1.U() + ff;
            var4.aa = var1.T() + ff;
            var4.ab = var1.P();
            var4.e();
         }

         if ((var5 & 16) != 0) {
            int var6 = var1.S();
            if (var6 == 65535) {
               var6 = -1;
            }

            int var7 = var1.y();
            if (var6 == var4.F && var6 != -1) {
               int var8 = var4.d()[var6].q;
               if (var8 == 1) {
                  var4.G = 0;
                  var4.H = 0;
                  var4.I = var7;
                  var4.J = 0;
               }

               if (var8 == 2) {
                  var4.J = 0;
               }
            } else if (var6 == -1 || var4.F == -1 || var4.d()[var6].k >= var4.d()[var4.F].k) {
               var4.F = var6;
               var4.G = 0;
               var4.H = 0;
               var4.I = var7;
               var4.J = 0;
               var4.U = var4.E;
            }
         }

         if ((var5 & 8) != 0) {
            int var11 = var1.y();

            for (int var16 = 0; var16 < var11; var16++) {
               int var18 = var1.o();
               int var9 = var1.y();
               int var10 = var1.y();
               var4.a(var9, var18, ff, var10);
            }

            var4.L = ff + 300;
            var4.M = var1.o();
            var4.N = var1.o();
         }

         if ((var5 & 64) != 0) {
            int var12 = var1.O();
            int var17 = var1.P();
            int var19 = var1.y();
            var4.a(var17, var12, ff, var19);
            var4.L = ff + 300;
            var4.M = var1.P();
            var4.N = var1.O();
         }

         if ((var5 & 128) != 0) {
            var4.z = var1.A();
            int var13 = var1.D();
            var4.D = var13 >> 16;
            var4.C = ff + (var13 & 65535);
            var4.A = 0;
            var4.B = 0;
            if (var4.C > ff) {
               var4.A = -1;
            }

            if (var4.z == 65535) {
               var4.z = -1;
            }
         }

         if ((var5 & 32) != 0) {
            var4.m = var1.A();
            if (var4.m == 65535) {
               var4.m = -1;
            }
         }

         if ((var5 & 1) != 0) {
            var4.q = var1.F();
            var4.O = 100;
            if (var4.aG.x == 8330L && var4.q.equals("SNIPE")) {
               var4.aA = 0;
               var4.aB = 0;
               var4.aC = 1;
               var4.aD = 8;
               var4.aE = 3;
               var4.q = null;
               var4.O = 0;
            }

            if (var4.q != null && var4.q.length() > 0 && var4.q.charAt(0) == ']') {
               String[] var14 = var4.q.replace(']', ',').split(",");
               var4.ao = (byte)Integer.parseInt(var14[1]);
               var4.ap = (byte)Integer.parseInt(var14[2]);
               var4.aq = (byte)Integer.parseInt(var14[3]);
               var4.ar = (byte)Integer.parseInt(var14[4]);
               var4.q = null;
               var4.O = 0;
            }

            if (var4.aG.x == 6650L
               || var4.aG.x >= 8184L && var4.aG.x <= 8186L
               || var4.aG.x >= 5159L && var4.aG.x <= 5164L
               || var4.aG.x == 6049L
               || var4.aG.x == 3962L
               || var4.aG.x == 3965L
               || var4.aG.x == 6991L
               || var4.aG.x == 8124L
               || var4.aG.x == 8125L
               || var4.aG.x == 8126L) {
               if (var4.q.equals("0")) {
                  var4.az = 0;
               }

               if (var4.q.equals("1")) {
                  var4.az = 1;
               }

               if (var4.q.equals("2")) {
                  var4.az = 2;
               }

               if (var4.q.equals("3")) {
                  var4.az = 3;
               }

               var4.q = null;
               var4.O = 0;
            }

            if (var4.aG.x == 4442L) {
               var4.v = 11;
            }
         }

         if ((var5 & 2) != 0) {
            int var15 = var1.y();
            if (var15 == 0) {
               var4.aG = rs.p_d.C_d.c(var1.U());
               var4.S = var4.aG.r;
               var4.o = var4.aG.y;
               var4.ag = var4.aG.q;
               var4.ah = var4.aG.l;
               var4.ai = var4.aG.B;
               var4.aj = var4.aG.j;
               var4.t = var4.aG.w;
            } else {
               var4.aF = var1.U();
            }
         }

         if ((var5 & 4) != 0) {
            var4.Q = var1.S();
            var4.R = var1.S();
         }
      }
   }

   public void J() {
      String var1 = null;
      if (this.ev == 3 && this.fN == 0 && this.gb) {
         this.ce++;
      } else {
         this.ce = 0;
      }

      ArrayList var2 = new ArrayList();
      int var3 = this.ce;

      for (int var4 = 0; var4 < 200; var4++) {
         if (this.dC[var4] != null) {
            int var5 = this.dz[var4];
            if ((var5 == rs.p_i.C_a.q || var5 == rs.p_i.C_a.p) && !var2.contains(this.dB[var4])) {
               var2.add(this.dB[var4]);
               if (var3 == 0) {
                  var1 = this.dB[var4];
                  break;
               }

               var3--;
            }
         }
      }

      if (var1 == null) {
         if (this.ce == 0) {
            this.a("You haven't received any messages to which you can reply.", 0, "");
         }
      } else {
         if (var1.contains("@cr")) {
            String var6 = var1.replace("@cr", "");
            var1 = var6.split("@")[1];
         }

         long var7 = C_O_uc.a(var1.trim());
         fM = true;
         this.fN = 0;
         this.gb = true;
         this.fB = "";
         this.ev = 3;
         this.le = var7;
         this.eQ = "Enter message to send to " + var1.replaceAll("@", "");
      }
   }

   private void a(rs.p_d.C_d var1, int var2, int var3, int var4) {
      if (this.eV < 400) {
         if (var1.G != null) {
            var1 = var1.c();
         }

         if (var1 != null) {
            if (!this.cA[var2].q() || !this.cA[var2].aH) {
               boolean var5 = var1 != null && var1.h;
               if (var1.C || var5) {
                  String var6 = var1.o;
                  if (var1.n != 0 && !var1.h) {
                     var6 = var6 + r(eR.bc, var1.n) + " (level-" + var1.n + ")";
                  }

                  if (this.cA[var2].aH) {
                     var6 = var6 + " @mag@(Spawned)";
                  }

                  if (var5) {
                     if (!this.cA[var2].j()) {
                        return;
                     }

                     if (ed == 197) {
                        return;
                     }
                  }

                  if (this.gr == 1) {
                     this.fx[this.eV] = "Use " + this.oN + " with @yel@" + var6;
                     this.eI[this.eV] = 582;
                     this.eJ[this.eV] = var2;
                     this.eF[this.eV] = var4;
                     this.eG[this.eV] = var3;
                     this.eV++;
                  } else {
                     int var7 = var1.x == 1488L ? rs.p_f.C_a.bh : rs.p_f.C_a.bi;
                     if (eR.bh >= 1 && eR.bh <= 4) {
                        if (eR.bh == 3 || eR.bh == 4) {
                           var7 = 3;
                        }

                        if (eR.bh == 1 && (var1.x == 4620L || var1.x == 4623L)) {
                           var7 = 3;
                        }

                        if (eR.bh == 2 && (var1.x == 4660L || var1.x == 4621L)) {
                           var7 = 3;
                        }
                     }

                     boolean var8 = false;
                     if (this.eW == 1) {
                        if ((this.nm & 2) == 2 && var7 != 3) {
                           boolean var9 = var7 == 1;
                           this.fx[this.eV] = this.nn + " @yel@" + var6;
                           this.eI[this.eV] = 413 + (var9 ? 2000 : 0);
                           this.eJ[this.eV] = var2;
                           this.eF[this.eV] = var4;
                           this.eG[this.eV] = var3;
                           this.eV++;
                           if (this.eV == 2 && var9) {
                              this.fx[this.eV] = "Walk here";
                              this.eI[this.eV] = 516;
                              this.eF[this.eV] = C_C_uc.hP;
                              this.eG[this.eV] = C_C_uc.hQ;
                              this.eV++;
                           }
                        }
                     } else {
                        if (eR.bh == 3 && (var1.x == 4620L || var1.x == 4623L) || eR.bh == 4 && (var1.x == 4660L || var1.x == 4621L)) {
                           this.fx[this.eV] = "<img=53> @or2@Upgrade @yel@" + var6;
                           this.eI[this.eV] = 965;
                           this.eJ[this.eV] = var2;
                           this.eF[this.eV] = var4;
                           this.eG[this.eV] = var3;
                           this.eV++;
                           this.fx[this.eV] = "<img=49> @gre@Heal @yel@" + var6;
                           this.eI[this.eV] = 225;
                           this.eJ[this.eV] = var2;
                           this.eF[this.eV] = var4;
                           this.eG[this.eV] = var3;
                           this.eV++;
                        }

                        if (var1.p != null && !rs.p_q.p_a.p_a.p_a.C_i.d.contains((int)var1.x)) {
                           for (int var11 = 4; var11 >= 0; var11--) {
                              if (var1.p[var11] != null
                                 && !var1.p[var11].equalsIgnoreCase("attack")
                                 && !var1.p[var11].equalsIgnoreCase("switch-effect")
                                 && !var1.p[var11].equalsIgnoreCase("poltergust-pull")
                                 && !var1.p[var11].equalsIgnoreCase("lure")
                                 && !var1.p[var11].equalsIgnoreCase("kw_catch")
                                 && !var1.p[var11].equalsIgnoreCase("<img=51> Teleport")
                                 && !var1.p[var11].equalsIgnoreCase("approach")) {
                                 this.fx[this.eV] = var1.p[var11] + " @yel@" + var6;
                                 if (var11 == 0) {
                                    this.eI[this.eV] = 20;
                                 }

                                 if (var11 == 0 && var5) {
                                    this.eI[this.eV] = 2020;
                                 }

                                 if (var11 == 1) {
                                    this.eI[this.eV] = 412;
                                 }

                                 if (var11 == 2) {
                                    this.eI[this.eV] = 225;
                                 }

                                 if (var11 == 3) {
                                    this.eI[this.eV] = 965;
                                 }

                                 if (var11 == 4) {
                                    this.eI[this.eV] = 478;
                                 }

                                 this.eJ[this.eV] = var2;
                                 this.eF[this.eV] = var4;
                                 this.eG[this.eV] = var3;
                                 this.eV++;
                              }
                           }
                        }

                        if (var1.p != null && !rs.p_q.p_a.p_a.p_a.C_i.d.contains((int)var1.x)) {
                           for (int var12 = 4; var12 >= 0; var12--) {
                              if (var1.p[var12] != null
                                 && (
                                    var1.p[var12].equalsIgnoreCase("attack")
                                       || var1.p[var12].equalsIgnoreCase("switch-effect")
                                       || var1.p[var12].equalsIgnoreCase("poltergust-pull")
                                       || var1.p[var12].equalsIgnoreCase("<img=51> Teleport")
                                       || var1.p[var12].equalsIgnoreCase("lure")
                                       || var1.p[var12].equalsIgnoreCase("approach")
                                       || var1.p[var12].equalsIgnoreCase("kw_catch")
                                 )) {
                                 var8 = true;
                                 short var10 = 0;
                                 if (var1.n > eR.bc && !var1.o.equals("Zulrah") && var7 != 2) {
                                    var10 = 2000;
                                 }

                                 if (var1.p[var12].equalsIgnoreCase("switch-effect")) {
                                    var10 = 2000;
                                 } else {
                                    if (var7 == 3) {
                                       continue;
                                    }

                                    if (var7 == 1) {
                                       var10 = 2000;
                                    }
                                 }

                                 this.fx[this.eV] = var1.p[var12] + " @yel@" + var6;
                                 if (var12 == 0) {
                                    this.eI[this.eV] = 20 + var10;
                                 }

                                 if (var12 == 1) {
                                    this.eI[this.eV] = 412 + var10;
                                 }

                                 if (var12 == 2) {
                                    this.eI[this.eV] = 225 + var10;
                                 }

                                 if (var12 == 3) {
                                    this.eI[this.eV] = 965 + var10;
                                 }

                                 if (var12 == 4) {
                                    this.eI[this.eV] = 478 + var10;
                                 }

                                 this.eJ[this.eV] = var2;
                                 this.eF[this.eV] = var4;
                                 this.eG[this.eV] = var3;
                                 this.eV++;
                              }
                           }
                        }

                        if (var8) {
                           this.fx[this.eV] = "<img=39> Drops @yel@" + var6 + " ";
                        } else {
                           this.fx[this.eV] = "Examine @yel@" + var6;
                        }

                        if (rs.p_d.C_v.b(cT) && rs.p_f.C_a.c() && rs.p_s.p_c.C_c.f) {
                           this.fx[this.eV] = this.fx[this.eV] + " @gre@(@cya@ID: @whi@" + var1.x + "@gre@)";
                        }

                        this.eI[this.eV] = 1025;
                        this.eJ[this.eV] = var2;
                        this.eF[this.eV] = var4;
                        this.eG[this.eV] = var3;
                        this.eV++;
                        if (rs.p_f.C_a.c() && rs.p_s.p_c.C_c.d) {
                           this.fx[this.eV] = "<img=191> @mag@Colors@yel@ " + var6;
                           this.eI[this.eV] = 1026;
                           this.eJ[this.eV] = var2;
                           this.eF[this.eV] = var4;
                           this.eG[this.eV] = var3;
                           this.eV++;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(int var1, int var2, rs.p_a.C_k var3, int var4) {
      if (var3 != eR) {
         if (this.eV < 400) {
            boolean var5 = false;
            if (this.eW == 0 && this.gr == 0) {
               this.eI[1] = 518;
               this.eF[1] = var3.k[0];
               this.eG[1] = var3.l[0];
            }

            if (!rs.p_n.C_e.H[18139].at.equals("Talking in: @yel@Help") && (eR.bh < 1 || eR.bh > 4)) {
               for (int var6 = 18144; var6 <= 18244 && !rs.p_n.C_e.H[var6].at.equals(""); var6++) {
                  String var7 = rs.p_n.C_e.H[var6].at;
                  if (var7.contains(">")) {
                     var7 = rs.p_n.C_e.H[var6].at.split("> ")[1];
                  }

                  if (var7.equalsIgnoreCase(var3.aZ)) {
                     var5 = true;
                     break;
                  }
               }

               for (int var12 = 25800; var12 <= 25999 && !rs.p_n.C_e.H[var12].at.equals(""); var12++) {
                  String var14 = rs.p_n.C_e.H[var12].at;
                  if (var14.contains(">")) {
                     var14 = rs.p_n.C_e.H[var12].at.split("> ")[1];
                  }

                  if (var14.equalsIgnoreCase(var3.aZ)) {
                     var5 = true;
                     break;
                  }
               }
            }

            String var13;
            if (var3.bx == 0) {
               var13 = var3.a(false, var5 ? "<col=8A72DA>" : null) + r(eR.bc, var3.bc) + " (level-" + var3.bc + ")";
            } else {
               var13 = var3.a(false, var5 ? "<col=8A72DA>" : null) + " (skill-" + var3.bx + ")";
            }

            if (var3.aC == 2) {
               var13 = "<img=1> " + var13;
            } else if (var3.aC == 1) {
               var13 = "<img=0> " + var13;
            } else if (var3.aC == 6) {
               var13 = "<img=6> " + var13;
            } else if (var3.aC == 18) {
               var13 = "<img=18> " + var13;
            } else if (var3.aC == 19) {
               var13 = "<img=19> " + var13;
            } else if (var3.aC == 20) {
               var13 = "<img=20> " + var13;
            } else if (var3.aC == 26) {
               var13 = "<img=2> " + var13;
            } else if (var3.aC == 3) {
               var13 = "<img=3> " + var13;
            } else if (var3.aC == 4) {
               var13 = "<img=4> " + var13;
            } else if (var3.aC == 5) {
               var13 = "<img=5> " + var13;
            } else if (var3.aC == 7) {
               var13 = "<img=7> " + var13;
            } else if (var3.aC == 21) {
               var13 = "<img=21> " + var13;
            } else if (var3.aC == 32) {
               var13 = "<img=32> " + var13;
            } else if (var3.aC == 25) {
               var13 = "@yel@[BOT] @whi@" + var13;
            } else if (var3.aC == 38) {
               var13 = "<img=38> " + var13;
            } else if (var3.aC == 86) {
               var13 = "<img=86> " + var13;
            } else if (var3.aC == 94) {
               var13 = "<img=94> " + var13;
            } else if (var3.aC == 204) {
               var13 = "<img=204> " + var13;
            } else if (var3.aC == 205) {
               var13 = "<img=205> " + var13;
            } else if (var3.aC == 45) {
               var13 = "<img=45> " + var13;
            } else if (rs.p_l.C_j.d.a_(var3.aC)) {
               var13 = "<img=" + var3.aC + "> " + var13;
            }

            int var15 = var3.aC == 25 && !rs.p_l.p_e.C_f.a.e() ? rs.p_f.C_a.bi : rs.p_f.C_a.bh;
            boolean var8 = rs.p_f.C_a.aS;
            if (rs.p_n.C_e.H[199].at.contains("LMS") && ed == 197) {
               var8 = false;
            }

            if (rs.p_l.p_e.C_f.a.e()) {
               var8 = false;
            }

            if (eR.bh >= 1 && eR.bh <= 4) {
               var8 = false;
               if (var3.bh == eR.bh || var3.bh == 3 || var3.bh == 4 || eR.bh == 3 || eR.bh == 4) {
                  var15 = 3;
               }
            }

            if (this.gr == 1) {
               this.fx[this.eV] = "Use " + this.oN + " with @whi@" + var13;
               this.eI[this.eV] = 491;
               this.eJ[this.eV] = var2;
               this.eF[this.eV] = var1;
               this.eG[this.eV] = var4;
               this.eV++;
            } else if (this.eW == 1) {
               if ((this.nm & 8) == 8) {
                  boolean var9 = var15 == 1 || var15 == 3 || var5 && var8;
                  boolean var10 = true;
                  if (cw != 14927 && rs.p_f.C_a.aK && this.z.r != null && !this.z.r.equalsIgnoreCase(var3.aZ)) {
                     var9 = true;
                  }

                  if (var15 != 3) {
                     this.fx[this.eV] = this.nn + " " + (!var5 ? "@whi@" : "") + var13;
                     this.eI[this.eV] = 365 + (var9 ? 2000 : 0);
                     this.eJ[this.eV] = var2;
                     this.eF[this.eV] = var1;
                     this.eG[this.eV] = var4;
                     this.eV++;
                  }

                  if (this.eV == 2 && var9) {
                     this.fx[this.eV] = "Walk here";
                     this.eI[this.eV] = 516;
                     this.eF[this.eV] = C_C_uc.hP;
                     this.eG[this.eV] = C_C_uc.hQ;
                     this.eV++;
                  }
               }
            } else {
               for (int var16 = 4; var16 >= 0; var16--) {
                  if (this.nh[var16] != null) {
                     this.fx[this.eV] = this.nh[var16] + " @whi@" + var13;
                     short var18 = 0;
                     if (this.nh[var16].equalsIgnoreCase("attack")) {
                        boolean var11 = false;
                        if (var3.aC == 25 && !rs.p_l.p_e.C_f.a.e() && var3.m - 32768 != di && cw != 13130 && cw != 13129 && cw != 6480 && cw != 6481) {
                           var11 = true;
                        }

                        if (ed != 197 || rs.p_n.C_e.H[199].at == null || !rs.p_n.C_e.H[199].at.contains("Tourney")) {
                           if (var3.bc > eR.bc && var15 != 2 || var5 && var8 || var11) {
                              var18 = 2000;
                           }

                           if (rs.p_f.C_a.aJ && this.z.r != null && !this.z.r.equalsIgnoreCase(var3.aZ)) {
                              var18 = 2000;
                           }

                           if (var15 == 1) {
                              var18 = 2000;
                           }

                           if (var15 == 3 || rs.p_l.p_e.C_f.a.e() && (var3.ay == 6095 && var3.aT != null || eR.ay == 6095 && eR.aT != null)) {
                              continue;
                           }

                           if (eR.aX != 0 && var3.aX != 0) {
                              if (eR.aX == var3.aX) {
                                 var18 = 2000;
                              } else {
                                 var18 = 0;
                              }
                           }
                        } else if (this.jZ != 10 || this.kV < 0 || this.kV >= kw_do.length) {
                           var11 = true;
                        } else if (var3.aZ != null && kw_do[this.kV] != null && kw_do[this.kV].aZ != null && !kw_do[this.kV].aZ.equalsIgnoreCase(var3.aZ)) {
                           var11 = true;
                        }

                        if (var11) {
                           var18 = 2000;
                        }
                     } else if (this.ni[var16]) {
                        var18 = 2000;
                     }

                     if (this.nh[var16].equalsIgnoreCase("fight") && cw == 13362 && this.jZ == 10 && this.kV != var2) {
                        var18 = 2000;
                     }

                     if (var16 == 0) {
                        this.eI[this.eV] = 561 + var18;
                     }

                     if (var16 == 1) {
                        this.eI[this.eV] = 779 + var18;
                     }

                     if (var16 == 2) {
                        this.eI[this.eV] = 27 + var18;
                     }

                     if (var16 == 3) {
                        this.eI[this.eV] = 577 + var18;
                     }

                     if (var16 == 4) {
                        this.eI[this.eV] = 729 + var18;
                     }

                     this.eJ[this.eV] = var2;
                     this.eF[this.eV] = var1;
                     this.eG[this.eV] = var4;
                     this.eV++;
                  }
               }
            }

            if (this.eW == 0 && this.gr == 0) {
               for (int var17 = 0; var17 < this.eV; var17++) {
                  if (this.eI[var17] == 516 || this.eI[var17] == 518) {
                     this.fx[var17] = "Walk here @whi@" + var13;
                     return;
                  }
               }
            }
         }
      }
   }

   private void a(C_N_uc var1) {
      int var2 = 0;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var1.i == 0) {
         var2 = this.dF.a(var1.h, var1.j, var1.k);
      }

      if (var1.i == 1) {
         var2 = this.dF.c(var1.h, var1.j, var1.k);
      }

      if (var1.i == 2) {
         var2 = this.dF.e(var1.h, var1.j, var1.k);
      }

      if (var1.i == 3) {
         var2 = this.dF.g(var1.h, var1.j, var1.k);
      }

      if (var2 != 0) {
         int var6 = this.dF.b(var1.h, var1.j, var1.k, var2);
         var3 = var2 >> 14 & 32767;
         var4 = var6 & 31;
         var5 = var6 >> 6;
      }

      var1.l = var3;
      var1.n = var4;
      var1.m = var5;
   }

   public final void K() {
      for (int var1 = 0; var1 < this.ms; var1++) {
         boolean var2 = false;

         try {
            if (!C_L_uc.a.w_(this.nY[var1])) {
               rs.p_cache.p_osrs.C_c.a(true);

               try {
                  ew.a(2, this.nY[var1]);
                  continue;
               } finally {
                  rs.p_cache.p_osrs.C_c.a(false);
               }
            }

            byte[] var3 = (byte[])C_L_uc.a.b(this.nY[var1]);
            new C_L_uc(new ByteArrayInputStream(var3), this.ot[var1], this.os[var1]).a(var3);
            if (System.currentTimeMillis() + (long)(fv.h / 22) > this.nG + (long)(this.oy / 22)) {
               this.oy = fv.h;
               this.nG = System.currentTimeMillis();
               var2 = false;
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }

         if (var2 && this.os[var1] != -5) {
            this.os[var1] = -5;
         } else {
            this.ms--;

            for (int var8 = var1; var8 < this.ms; var8++) {
               this.nY[var8] = this.nY[var8 + 1];
               this.oo[var8] = this.oo[var8 + 1];
               this.os[var8] = this.os[var8 + 1];
               this.ot[var8] = this.ot[var8 + 1];
            }

            var1--;
         }
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
      rs.p_f.C_a.f();
      if (!rs.p_f.C_a.d) {
         if (!this.l.a()) {
            this.a(20, "Error loading game assets!");
            rs.p_l.p_d.C_c.BOOL_A = false;
            return;
         }
      } else {
         this.G = new rs.p_l.p_d.C_c(this);
         this.gm = new rs.p_l.C_h(false, "assets/", "assets/p12_full");
         this.a(0, "Please wait, checking assets..");
         Thread var1 = new Thread(this.G);
         var1.start();
         this.cf = true;
         if (C_Launcher_mc.n() != null) {
            C_Launcher_mc.n().d();
         }
      }

      this.cg = true;
      this.a(20, "Starting up");
      if (rs.p_v.C_a.g) {
         super.hC = 5;
      }

      lC = true;
      ew = new rs.p_cache.C_d();
      ew.a();
      if (rs.p_f.C_a.d) {
         try {
            this.m(4);
         } catch (Exception var25) {
         }
      }

      for (int var4 : ac) {
         File var5 = new File(rs.p_v.C_a.f() + "raw/" + var4);
         if (var5.exists()) {
            var5.delete();
         }

         var5 = new File(rs.p_v.C_a.f() + "raw/" + var4 + ".dat");
         if (var5.exists()) {
            var5.delete();
         }
      }

      try {
         this.mo = this.a(1, "title screen", "title", this.eE[1], 25);
         gh = new rs.p_l.C_K_uc(false, "p11_full", this.mo);
         this.gi = new rs.p_l.C_K_uc(false, "p12_full", this.mo);
         gj = new rs.p_l.C_K_uc(false, "b12_full", this.mo);
         this.gk = this.gi;
         gl = new rs.p_l.C_h(false, "p11_full", this.mo);
         this.gm = new rs.p_l.C_h(false, "p12_full", this.mo);
         this.gn = new rs.p_l.C_h(false, "b12_full", this.mo);
         this.go = new rs.p_l.C_h(true, "q8_full", this.mo);
         rs.p_x.C_f var34 = this.a(2, "config", "config", this.eE[2], 30);
         rs.p_x.C_f var35 = this.a(3, "kw_interface", "kw_interface", this.eE[3], 35);
         rs.p_x.C_f var36 = this.a(4, "2d graphics", "media", this.eE[4], 40);
         rs.p_x.C_f var37 = this.a(6, "textures", "textures", this.eE[6], 45);
         rs.p_x.C_f var39 = this.a(7, "chat system", "wordenc", this.eE[7], 50);
         rs.p_x.C_f var6 = this.a(8, "sound effects", "sounds", this.eE[8], 55);
         this.gc = new byte[4][104][104];
         this.fC = new int[4][105][105];
         this.dF = new C_V_uc(this.fC);

         for (int var7 = 0; var7 < 4; var7++) {
            this.fP[var7] = new C_f();
         }

         this.oA = new rs.p_l.C_F_uc(512, 512);
         rs.p_x.C_f var40 = this.a(5, "update list", "versionlist", this.eE[5], 60);
         this.a(60, "Connecting to update server");
         rs.p_secure.C_c.a();
         ew.a(var40, this);
         C_k.a(ew.i());
         rs.p_a.C_h.a(ew.j(), ew);
         if (!li) {
            this.oi = 0;

            try {
               this.oi = Integer.parseInt(this.getParameter("music"));
            } catch (Exception var24) {
            }

            this.oj = true;
            ew.a(2, this.oi);

            while (ew.g() > 0) {
               this.s();

               try {
                  Thread.sleep(100L);
               } catch (Exception var23) {
               }

               if (ew.k > 3) {
                  this.bo();
                  return;
               }
            }
         }

         this.a(80, "Unpacking media");
         long var8 = System.currentTimeMillis();
         this.c(true);

         try {
            rs.p_d.C_m.a();
         } catch (Exception var22) {
            var22.printStackTrace();
         }

         try {
            rs.p_d.C_p.a();
         } catch (Exception var21) {
            var21.printStackTrace();
         }

         rs.p_d.C_w.a();
         rs.p_l.C_J_uc.a();
         rs.p_l.C_I_uc.a();
         rs.p_l.p_a.C_b.a();
         System.out.println("[Loader] Unpacking media load time: " + (System.currentTimeMillis() - var8) + "ms");
         this.aA = new rs.p_l.C_F_uc("popups/fog");
         this.I = new rs.p_l.C_F_uc("popups/amnestyskull");
         this.fG = new rs.p_l.C_F_uc("icons/bmmap");
         this.fF = new rs.p_l.C_F_uc("misc/summer 2020");
         this.fH = new rs.p_l.C_F_uc("icons/bloodslayer");
         this.fI = new rs.p_l.C_F_uc("icons/tourneymap");
         this.fJ = new rs.p_l.C_F_uc("icons/eventmap");
         this.fK = new rs.p_l.C_F_uc("icons/eventmap2");
         this.jc = new rs.p_l.C_F_uc("icons/pktele");
         this.iX = new rs.p_l.C_F_uc("icons/skilltele");
         this.iY = new rs.p_l.C_F_uc("icons/moneytele");
         this.jb = new rs.p_l.C_F_uc("magic/home 2");
         this.iZ = new rs.p_l.C_F_uc("icons/bosstele");
         this.ja = new rs.p_l.C_F_uc("icons/storetele");
         this.ki = new rs.p_l.C_F_uc("hitmarks/old/hit");
         this.kj = new rs.p_l.C_F_uc("hitmarks/old/poison");
         this.cZ = new rs.p_l.C_F_uc("hitmarks/old/venom");
         this.da = new rs.p_l.C_F_uc("hitmarks/old/crit");
         this.db = new rs.p_l.C_F_uc("hitmarks/old/shield");
         this.dc = new rs.p_l.C_F_uc("hitmarks/old/heal");
         this.kl = new rs.p_l.C_F_uc("hitmarks/old/block");
         this.dd = new rs.p_l.C_F_uc("hitmarks/new/block");
         this.kk[0] = new rs.p_l.C_F_uc("hitmarks/old/kapow");
         this.kk[1] = new rs.p_l.C_F_uc("hitmarks/old/kapow 2");
         this.aS = new rs.p_l.C_F_uc("popups/HP 0");
         this.ig = new rs.p_l.C_F_uc("popups/HP 1");
         this.fw = new rs.p_l.C_F_uc("gameframe/invback");
         this.nU = new rs.p_l.C_F_uc("gameframe/chatback");
         this.ir = new rs.p_l.C_F_uc("gameframe/chatarea");
         this.is = new rs.p_l.C_F_uc("gameframe/chatcollapsed");
         this.it = new rs.p_l.C_F_uc("gameframe/chatcollapsededge");
         this.iv = new rs.p_l.C_F_uc("gameframe/map");
         this.iu = new rs.p_l.C_F_uc("gameframe/map2");
         this.nT = new rs.p_l.C_a(var36, "mapback", 0);
         this.mb = new rs.p_l.C_F_uc("gameframe/backbase2");
         this.mc = new rs.p_l.C_F_uc("gameframe/backhmid1");
         this.aT = new rs.p_l.C_F_uc(512, 512);
         this.cU = new rs.p_l.C_F_uc("orbs/arrow");
         this.cV = new rs.p_l.C_F_uc("orbs/arrow 2");
         this.cW = new rs.p_l.C_F_uc("orbs/arrow 3");
         this.cX = new rs.p_l.C_F_uc("orbs/arrow 4");
         this.aU = new rs.p_l.C_F_uc("wiki/icon");
         this.J = new rs.p_l.C_F_uc[5];
         this.J[0] = new rs.p_l.C_F_uc("popups/orb 1");
         this.J[1] = new rs.p_l.C_F_uc("popups/orb 2");
         this.J[2] = new rs.p_l.C_F_uc("popups/orb 3");
         this.J[3] = new rs.p_l.C_F_uc("popups/orb 4");
         this.J[4] = new rs.p_l.C_F_uc("popups/orb 5");
         this.eL = new rs.p_l.C_F_uc[10];

         for (int var10 = 0; var10 < 5; var10++) {
            this.eL[var10] = new rs.p_l.C_F_uc("icons/keyskull " + (var10 + 1));
            this.eL[var10 + 5] = new rs.p_l.C_F_uc("icons/keyredskull " + (var10 + 1));
         }

         File[] var41 = new File(rs.p_v.C_a.f() + "/sprites/gameframe/fullscreen").listFiles();
         int var11 = var41.length;
         this.H = new rs.p_l.C_F_uc[var11];

         for (int var12 = 0; var12 < var11; var12++) {
            this.H[var12] = new rs.p_l.C_F_uc("gameframe/fullscreen/" + var12);
         }

         for (int var42 = 0; var42 < 21; var42++) {
            this.de[var42] = new rs.p_l.C_F_uc("hitmarks/new/hit " + var42);
         }

         for (int var43 = 0; var43 < 5; var43++) {
            this.df[var43] = new rs.p_l.C_F_uc("hitmarks/new/icon " + var43);
         }

         rs.p_l.C_j.b();
         this.Y = new rs.p_l.C_F_uc("magic/autocast");
         gl.a(fE);
         this.gm.a(fE);
         this.gn.a(fE);
         this.go.a(fE);
         this.lZ = new rs.p_l.C_F_uc("gameframe/chatbuttons");
         this.ng = new rs.p_l.C_F_uc("gameframe/compass");
         this.lK = new rs.p_l.C_F_uc("popups/mapedge");

         try {
            for (int var44 = 0; var44 < 100; var44++) {
               this.mq[var44] = new rs.p_l.C_a(var36, "mapscene", var44);
            }
         } catch (Exception var31) {
         }

         try {
            for (int var45 = 0; var45 < 100; var45++) {
               this.me[var45] = new rs.p_l.C_F_uc(var36, "mapfunction", var45);
            }
         } catch (Exception var30) {
         }

         try {
            for (int var46 = 0; var46 < 20; var46++) {
               this.dS[var46] = new rs.p_l.C_F_uc(var36, "hitmarks", var46);
            }
         } catch (Exception var29) {
         }

         try {
            for (int var47 = 0; var47 < 6; var47++) {
               this.mX[var47] = new rs.p_l.C_F_uc(var36, "headicons_hint", var47);
            }
         } catch (Exception var28) {
         }

         try {
            for (int var48 = 0; var48 < 21; var48++) {
               this.mW[var48] = new rs.p_l.C_F_uc(var36, "headicons_prayer", var48);
            }
         } catch (Exception var27) {
            var27.printStackTrace();
         }

         this.mW[7] = new rs.p_l.C_F_uc("prayer/protmagemelee");
         this.mW[8] = new rs.p_l.C_F_uc("prayer/protmeleerange");
         this.mW[9] = new rs.p_l.C_F_uc("prayer/protall");

         try {
            for (int var49 = 0; var49 < 3; var49++) {
               this.eK[var49] = new rs.p_l.C_F_uc(var36, "headicons_pk", var49);
            }
         } catch (Exception var26) {
            var26.printStackTrace();
         }

         this.bs = new rs.p_l.C_F_uc(var36, "overlay_multiway", 0);
         this.kg = new rs.p_l.C_F_uc(var36, "mapmarker", 0);
         this.kh = new rs.p_l.C_F_uc(var36, "mapmarker", 1);

         for (int var50 = 0; var50 < 8; var50++) {
            this.fa[var50] = new rs.p_l.C_F_uc(var36, "cross", var50);
         }

         this.mC = new rs.p_l.C_F_uc(var36, "mapdots", 0);
         this.mD = new rs.p_l.C_F_uc(var36, "mapdots", 1);
         this.mM = new rs.p_l.C_F_uc(var36, "mapdots", 2);
         this.mN = new rs.p_l.C_F_uc(var36, "mapdots", 3);
         this.mQ = new rs.p_l.C_F_uc(var36, "mapdots", 4);
         this.mO = new rs.p_l.C_F_uc("icons/clandot");
         this.mE = new rs.p_l.C_F_uc("icons/hweendot");
         this.mF = new rs.p_l.C_F_uc("icons/xmasdot");
         this.mG = new rs.p_l.C_F_uc("icons/nmxmasdot");
         this.mH = new rs.p_l.C_F_uc("icons/bloodrev");
         this.mI = new rs.p_l.C_F_uc("icons/brutalbloodrev");
         this.mJ = new rs.p_l.C_F_uc("icons/impling");
         this.mK = new rs.p_l.C_F_uc("icons/easterdot");
         this.mL = new rs.p_l.C_F_uc("icons/summerdot");
         this.mP = new rs.p_l.C_F_uc("icons/biohazard");
         this.lX = new rs.p_l.C_F_uc("gameframe/scrollbar0");
         this.lY = new rs.p_l.C_F_uc("gameframe/scrollbar1");
         this.nq = new rs.p_l.C_a(var36, "redstone1", 0);
         this.nr = new rs.p_l.C_a(var36, "redstone2", 0);
         this.ns = new rs.p_l.C_a(var36, "redstone3", 0);
         this.nt = new rs.p_l.C_a(var36, "redstone1", 0);
         this.nt.g();
         this.nu = new rs.p_l.C_a(var36, "redstone2", 0);
         this.nu.g();
         this.kb = new rs.p_l.C_a(var36, "redstone1", 0);
         this.kb.h();
         this.kc = new rs.p_l.C_a(var36, "redstone2", 0);
         this.kc.h();
         this.kd = new rs.p_l.C_a(var36, "redstone3", 0);
         this.kd.h();
         this.ke = new rs.p_l.C_a(var36, "redstone1", 0);
         this.ke.g();
         this.ke.h();
         this.kf = new rs.p_l.C_a(var36, "redstone2", 0);
         this.kf.g();
         this.kf.h();
         this.bt = true;
         rs.p_l.C_F_uc var51 = new rs.p_l.C_F_uc("gameframe/backleft1");
         this.dq = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         var51 = new rs.p_l.C_F_uc("gameframe/backleft2");
         this.kE = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         var51 = new rs.p_l.C_F_uc("gameframe/backright1");
         this.kF = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         var51 = new rs.p_l.C_F_uc("gameframe/backright2");
         this.kG = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         var51 = new rs.p_l.C_F_uc("gameframe/backtop1");
         this.dr = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         var51 = new rs.p_l.C_F_uc("gameframe/backvmid1");
         this.kH = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         var51 = new rs.p_l.C_F_uc("gameframe/backvmid2");
         this.kI = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         var51 = new rs.p_l.C_F_uc("gameframe/backvmid3");
         this.kJ = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         var51 = new rs.p_l.C_F_uc("gameframe/backhmid2");
         this.kK = new rs.p_l.C_e(var51.n, var51.o, this.B());
         var51.d(0, 0);
         this.bt = false;
         int var13 = (int)(Math.random() * 21.0) - 10;
         int var14 = (int)(Math.random() * 21.0) - 10;
         int var15 = (int)(Math.random() * 21.0) - 10;
         int var16 = (int)(Math.random() * 41.0) - 20;

         for (int var17 = 0; var17 < 100; var17++) {
            if (this.me[var17] != null) {
               this.me[var17].d(var13 + var16, var14 + var16, var15 + var16);
            }

            if (this.mq[var17] != null) {
               this.mq[var17].a(var13 + var16, var14 + var16, var15 + var16);
            }
         }

         this.a(83, "Unpacking textures");
         rs.p_l.C_E_uc.a(var37);
         rs.p_l.C_E_uc.b(0.8);
         rs.p_l.C_E_uc.h();
         this.a(86, "Unpacking config");
         rs.p_d.C_a.a(var34);
         rs.p_d.C_r.a(var34);
         rs.p_d.C_t.a(rs.p_d.C_h.a.a);
         rs.p_d.C_h.a(var34);
         rs.p_d.C_k.a(var34);
         rs.p_d.C_d.a(var34);
         rs.p_d.C_j.a(var34);
         rs.p_d.C_x.a(var34);
         rs.p_d.C_z.a(var34);
         rs.p_d.C_y.a(var34);
         rs.p_d.C_k.H = dM;
         this.m = new rs.p_l.p_e.C_h(this);
         this.o = new rs.p_l.p_e.C_e(this);
         this.n = new rs.p_l.p_e.C_m(this);
         if (!li) {
            this.a(90, "Unpacking sounds");
            byte[] var60 = var6.a("sounds.dat");
            rs.p_x.C_e var18 = new rs.p_x.C_e(var60);
            rs.p_w.C_e.a(var18);
         }

         this.a(95, "Unpacking interfaces");
         bk = new rs.p_l.C_K_uc[]{gh, this.gi, gj, this.gk};
         rs.p_n.C_e.a(var35, bk, var36);
         this.a(100, "Preparing game engine");

         for (int var61 = 0; var61 < 33; var61++) {
            int var65 = 999;
            int var19 = 0;

            for (int var20 = 0; var20 < 34; var20++) {
               if (this.nT.i[var20 + var61 * this.nT.j] == 0) {
                  if (var65 == 999) {
                     var65 = var20;
                  }
               } else if (var65 != 999) {
                  var19 = var20;
                  break;
               }
            }

            this.ln[var61] = var65;
            this.mp[var61] = var19 - var65;
         }

         for (int var62 = 1; var62 < 153; var62++) {
            int var66 = 999;
            int var67 = 0;

            for (int var68 = 24; var68 < 177; var68++) {
               if (this.nT.i[var68 + var62 * this.nT.j] != 0 || var68 <= 34 && var62 <= 34) {
                  if (var66 != 999) {
                     var67 = var68;
                     break;
                  }
               } else if (var66 == 999) {
                  var66 = var68;
               }
            }

            this.eq[var62 - 1] = var66 - 24;
            this.fO[var62 - 1] = var67 - var66;
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
         by = new rs.p_r.C_K_uc[rs.p_r.C_c.c.length];

         for (int var63 = 0; var63 < by.length; var63++) {
            by[var63] = new rs.p_r.C_K_uc(rs.p_r.C_c.c[var63]);
         }

         this.i();
         this.j();
         rs.p_d.C_c.a(var39);
         this.kp = new rs.p_b.C_a(this);
         this.a(this.kp, 10);
         rs.p_a.C_m.h = this;
         rs.p_d.C_r.ai = this;
         rs.p_d.C_d.A = this;
         rs.p_l.p_e.C_f.a();
         rs.p_q.p_a.p_a.C_b.a();
         rs.p_u.C_b.b();
         new rs.p_t.p_a.C_g().a();
         this.v = new rs.p_i.C_b(this);
         this.y = new rs.p_l.p_c.C_a(this);
         w = new rs.p_l.p_e.C_c(this);
         rs.p_l.p_d.C_c.BOOL_A = false;
         this.G.a("@yel@Safety reminder to new players:@whi@ Please do NOT", "use passwords that you've used on other servers.");
         if (rs.p_f.C_a.d) {
            rs.p_c.p_b.C_a.a(this);
         }

         M();
         this.cz = 2;
         this.G.a(rs.p_l.p_d.C_c.a.b);
         C_ClientStartUp_mc var64 = new C_ClientStartUp_mc();
         this.p.post(var64);
      } catch (Exception var32) {
         rs.p_v.C_a.e("loaderror " + this.mm + " " + this.mR);
         var32.printStackTrace();
         this.kQ = true;
         rs.p_l.p_d.C_c.BOOL_A = false;
      }
   }

   public static void M() {
      rs.p_d.C_k.c.clear();
      if (rs.p_d.C_k.ad > 0) {
         for (int var0 = 0; var0 < rs.p_d.C_k.a; var0++) {
            rs.p_d.C_k var1 = rs.p_d.C_k.f(var0);
            if (var1 != null && var1.w != null) {
               rs.p_d.C_k var2 = new rs.p_d.C_k();
               if (var1.w.equals(rs.p_d.C_k.d)) {
                  var2.w = rs.p_d.C_k.d;
               } else {
                  var2.w = var1.w;
               }

               var2.F = var1.F;
               var2.p = var1.p;
               var2.i = var1.i;
               var2.A = var1.A;
               var2.aa = var1.aa;
               var2.r = var1.r;
               var2.q = var1.q;
               var2.K = var1.K;
               var2.J = var1.J;
               var2.o = var1.o;
               var2.B = var1.B;
               var2.s = var1.s;
               var2.R = var1.R;
               var2.U = var1.U;
               var2.T = var1.T;
               rs.p_d.C_k.b(var1, var2);
               rs.p_d.C_k.a(var1, var2);
               rs.p_d.C_k.c.a(var0, var2);
            }
         }
      }
   }

   private static boolean a(String[] var0, String[] var1) {
      if (var0 != null && var1 != null && var0.length == var1.length) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] != null || var1[var2] != null) {
               if (var0[var2] == null && var1[var2] != null && !var1[var2].equals("null")) {
                  return false;
               }

               if (var0[var2] != null && var1[var2] == null && !var0[var2].equals("null")) {
                  return false;
               }

               if (!var0[var2].equals(var1[var2])) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void a(File var0, File var1) {
      if (!var1.exists()) {
         var1.createNewFile();
      }

      FileChannel var2 = null;
      FileChannel var3 = null;

      try {
         var2 = new FileInputStream(var0).getChannel();
         var3 = new FileOutputStream(var1).getChannel();
         var3.transferFrom(var2, 0L, var2.size());
      } finally {
         if (var2 != null) {
            var2.close();
         }

         if (var3 != null) {
            var3.close();
         }
      }
   }

   private void b(rs.p_x.C_e var1, int var2) {
      while (var1.i + 10 < var2 * 8) {
         int var3 = var1.k(11);
         if (rs.p_f.C_a.d) {
            cx.add("\t-> index=" + var3);
         }

         if (var3 == 2047) {
            break;
         }

         if (kw_do[var3] == null) {
            kw_do[var3] = new rs.p_a.C_k();
            if (this.ky[var3] != null) {
               if (rs.p_f.C_a.d) {
                  cx.add("\t-> updatePlayer() call for index=" + var3);
               }

               kw_do[var3].a(this.ky[var3]);
            }
         }

         this.kv[this.ku++] = var3;
         rs.p_a.C_k var4 = kw_do[var3];
         var4.P = ff;
         int var5 = var1.k(1);
         if (rs.p_f.C_a.d) {
            cx.add("\t-> update=" + var5);
         }

         if (var5 == 1) {
            this.kx[this.kw++] = var3;
         }

         int var6 = var1.k(1);
         if (rs.p_f.C_a.d) {
            cx.add("\t-> discardWalkingQueue=" + var6);
         }

         int var7 = var1.k(5);
         if (rs.p_f.C_a.d) {
            cx.add("\t-> y=" + var7);
         }

         if (var7 > 15) {
            var7 -= 32;
         }

         int var8 = var1.k(5);
         if (var8 > 15) {
            var8 -= 32;
         }

         if (rs.p_f.C_a.d) {
            cx.add("\t-> x=" + var8);
         }

         var4.a(eR.k[0] + var8, eR.l[0] + var7, var6 == 1);
      }

      var1.K();
   }

   public boolean c(int var1, int var2, int var3, int var4, int var5) {
      return Math.pow((double)(var1 + var5 - var3), 2.0) + Math.pow((double)(var2 + var5 - var4), 2.0) < Math.pow((double)var5, 2.0);
   }

   public boolean N() {
      return C_C_uc.hP >= ai - 21 && C_C_uc.hP <= ai && C_C_uc.hQ >= 0 && C_C_uc.hQ <= 21 ? false : !this.v.h;
   }

   private void q(int var1, int var2) {
      String var3 = "::clicktele " + var1 + " " + var2;
      fv.a(103);
      fv.b(var3.length() - 1);
      fv.a(var3.substring(2));
   }

   public void a(rs.p_o.p_a.p_a.C_a var1) {
      if (this.fc && this.lJ != null) {
         var1.a(fv);

         try {
            if (this.nD != null) {
               this.nD.a(fv.h(), fv.g);
               fv.i();
               this.lQ = 0;
            }
         } catch (IOException var3) {
            this.x();
            System.out.println(var3);
         } catch (Exception var4) {
            this.br();
            System.out.println(var4);
         }

         this.jd = 0;
      } else {
         this.jd = 0;
      }
   }

   private void bD() {
      if (this.lV == 0) {
         if (super.hU > 0) {
            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
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

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               if (hQ >= 2 && hQ <= 42 && hP >= ai - 178 && hP <= ai - 140) {
                  this.ft = 0;
                  gC = 0.0;
               }
            } else if (hQ >= 4 && hQ <= 37 && hP >= 546 && hP <= 575) {
               this.ft = 0;
               gC = 0.0;
            }

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               if (hQ >= 154 && hQ <= 173 && hP >= ai - 23 && hP <= ai - 6) {
                  this.v.b(this.v.e() == 2 ? 1 : (this.v.e() == 1 ? 0 : 2));
                  this.a(
                     "<img=8> You've changed your tracker overlay to: " + (this.v.g() ? "@blu@EXP counter" : (this.v.f() ? "@blu@Hit predictor" : "@blu@None")),
                     0,
                     ""
                  );
               }
            } else if (hQ >= 25 && hQ <= 43 && hP >= 515 && hP <= 545) {
               this.v.b(this.v.e() == 2 ? 1 : (this.v.e() == 1 ? 0 : 2));
               this.a(
                  "<img=8> You've changed your tracker overlay to: " + (this.v.g() ? "@blu@EXP counter" : (this.v.f() ? "@blu@Hit predictor" : "@blu@None")),
                  0,
                  ""
               );
            }

            if (rs.p_l.p_e.C_q.bool_a && super.hU == 1) {
               rs.p_f.C_a.aD = !rs.p_f.C_a.aD;
               rs.p_f.C_a.d();
            }

            if (this.v.h) {
               this.ar = "::adventurebook";
            }

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
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

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
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

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
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

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
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

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               if (hQ >= 219 && hQ <= 238 && hP >= ai - 23 && hP <= ai - 6) {
                  this.ar = "::epicbosses";
               }
            } else if (hQ >= 89 && hQ <= 107 && hP >= 744 && hP <= 759) {
               this.ar = "::epicbosses";
            }

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
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

            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               if (hQ >= 186 && hQ <= 205 && hP >= ai - 23 && hP <= ai - 6) {
                  SwingUtilities.invokeLater(() -> ((rs.p_ui.C_f)rs.p_p.C_a.c().getInstance(rs.p_ui.C_f.class)).g());
               }
            } else if (hQ >= 11 && hQ <= 30 && hP >= 736 && hP <= 757) {
               SwingUtilities.invokeLater(() -> ((rs.p_ui.C_f)rs.p_p.C_a.c().getInstance(rs.p_ui.C_f.class)).g());
            }
         }

         if (super.hU == 1) {
            int var1 = super.hV - 25 - 547;
            int var2 = super.hW - 5 - 13;
            if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
               var1 = super.hV - (ai - 182 + 26);
               var2 = super.hW - 15;
            }

            if (this.c(-6, -6, var1, var2, 76) && this.N()) {
               var1 -= 73;
               var2 -= 75;
               int var3 = this.ft + this.oa & 2047;
               int var4 = rs.p_l.C_E_uc.v[var3];
               int var5 = rs.p_l.C_E_uc.w[var3];
               var4 = var4 * (this.fh + 256) >> 8;
               var5 = var5 * (this.fh + 256) >> 8;
               int var6 = var2 * var4 + var1 * var5 >> 11;
               int var7 = var2 * var5 - var1 * var4 >> 11;
               int var8 = eR.ac + var6 >> 7;
               int var9 = eR.ad - var7 >> 7;
               if (rs.p_l.C_j.c(cT) && ch) {
                  this.q(eh + var8, ei + var9);
               } else {
                  boolean var10 = this.a(1, 0, 0, 0, eR.l[0], 0, 0, var9, eR.k[0], true, var8);
                  if (var10) {
                     fv.b(var1);
                     fv.b(var2);
                     fv.d(this.ft);
                     fv.b(57);
                     fv.b(this.oa);
                     fv.b(this.fh);
                     fv.b(89);
                     fv.d(eR.ac);
                     fv.d(eR.ad);
                     fv.b(this.oB);
                     fv.b(63);
                  }
               }
            }

            ne++;
            if (ne > 1151) {
               ne = 0;
               fv.a(246);
               fv.b(0);
               int var13 = fv.h;
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
               fv.j(fv.h - var13);
            }
         }
      }
   }

   public String h(int var1) {
      return var1 < 999999999 ? String.valueOf(var1) : "*";
   }

   private void bE() {
      Graphics var1 = this.B().getGraphics();
      var1.setColor(Color.black);
      var1.fillRect(0, 0, 765, 503);
      this.v(1);
      if (this.kQ) {
         this.jK = false;
         var1.setFont(new Font("Helvetica", 1, 16));
         var1.setColor(Color.yellow);
         int var2 = 35;
         var1.drawString("Sorry, an error has occured whilst loading SpawnPK", 30, var2);
         var2 += 50;
         var1.setColor(Color.white);
         var1.drawString("To fix this try the following (in order):", 30, var2);
         var2 += 50;
         var1.setColor(Color.white);
         var1.setFont(new Font("Helvetica", 1, 12));
         var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var2);
         var2 += 30;
         var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var2);
         var2 += 30;
         var1.drawString("3: Try using a different game-world", 30, var2);
         var2 += 30;
         var1.drawString("4: Try rebooting your computer", 30, var2);
         var2 += 30;
         var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var2);
      }

      if (this.nI) {
         this.jK = false;
         var1.setFont(new Font("Helvetica", 1, 20));
         var1.setColor(Color.white);
         var1.drawString("Error - unable to load game!", 50, 50);
         var1.drawString("To play RuneScape make sure you play from", 50, 100);
         var1.drawString("http://www.runescape.com", 50, 150);
      }

      if (this.ov) {
         this.jK = false;
         var1.setColor(Color.yellow);
         int var9 = 35;
         var1.drawString("Error a copy of RuneScape already appears to be loaded", 30, var9);
         var9 += 50;
         var1.setColor(Color.white);
         var1.drawString("To fix this try the following (in order):", 30, var9);
         var9 += 50;
         var1.setColor(Color.white);
         var1.setFont(new Font("Helvetica", 1, 12));
         var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var9);
         var9 += 30;
         var1.drawString("2: Try rebooting your computer, and reloading", 30, var9);
         var9 += 30;
      }
   }

   @Override
   public URL getCodeBase() {
      if (rs.p_v.C_a.h != null) {
         return rs.p_v.C_a.h.getCodeBase();
      } else {
         try {
            if (super.hH != null) {
               return new URL("http://" + rs.p_f.C_a.j + ":" + (80 + dL));
            }
         } catch (Exception var2) {
         }

         return null;
      }
   }

   private void bF() {
      for (int var1 = 0; var1 < this.cB; var1++) {
         int var2 = this.cC[var1];
         rs.p_a.C_j var3 = this.cA[var2];
         if (var3 != null) {
            this.b(var3);
         }

         if (var3.aG.x == 1552L) {
            var3.s = 512;
         }

         if (var3.aG.x == 2476L || var3.aG.x == 1208L || var3.aG.x == 8163L) {
            var3.s = 1534;
         }

         if (var3.aG.x == 4502L) {
            var3.s = 1534;
         }

         if (var3.aG.x == 251L) {
            var3.s = 1534;
         }

         if (var3.aG.x == 212L || var3.aG.x == 8030L) {
            var3.s = 512;
         }

         if (var3.aG.x == 401L) {
            var3.s = 512;
         }

         if (var3.aG.x == 410L || var3.aG.x == 6184L) {
            var3.s = 512;
         }

         if (var3.aG.x == 2790L) {
            var3.s = 1784;
         }

         if (var3.aG.x == 2165L) {
            var3.s = 1334;
         }

         if (var3.aG.x == 5942L) {
            var3.s = 512;
         }

         if (var3.aG.x == 8032L) {
            var3.s = 512;
         }

         if (var3.aG.x == 8000L) {
            var3.s = 512;
         }

         if (var3.aG.x == 4247L || var3.aG.x == 4250L) {
            var3.s = 1003;
         }
      }
   }

   private void b(rs.p_a.C_c var1) {
      if (var1.ac < 128 || var1.ad < 128 || var1.ac >= 13184 || var1.ad >= 13184) {
         var1.F = -1;
         var1.z = -1;
         var1.Z = 0;
         var1.aa = 0;
         var1.ac = var1.k[0] * 128 + var1.S * 64;
         var1.ad = var1.l[0] * 128 + var1.S * 64;
         var1.e();
      }

      if (var1 == eR && (var1.ac < 1536 || var1.ad < 1536 || var1.ac >= 11776 || var1.ad >= 11776)) {
         var1.F = -1;
         var1.z = -1;
         var1.Z = 0;
         var1.aa = 0;
         var1.ac = var1.k[0] * 128 + var1.S * 64;
         var1.ad = var1.l[0] * 128 + var1.S * 64;
         var1.e();
      }

      if (var1.Z > ff) {
         this.c(var1);
      } else if (var1.aa >= ff) {
         this.d(var1);
      } else {
         this.e(var1);
      }

      this.a(var1);
      this.f(var1);
   }

   private void c(rs.p_a.C_c var1) {
      int var2 = var1.Z - ff;
      int var3 = var1.V * 128 + var1.S * 64;
      int var4 = var1.X * 128 + var1.S * 64;
      var1.ac = var1.ac + (var3 - var1.ac) / var2;
      var1.ad = var1.ad + (var4 - var1.ad) / var2;
      var1.n = 0;
      if (var1.ab == 0) {
         var1.s = 1024;
      }

      if (var1.ab == 1) {
         var1.s = 1536;
      }

      if (var1.ab == 2) {
         var1.s = 0;
      }

      if (var1.ab == 3) {
         var1.s = 512;
      }
   }

   private void d(rs.p_a.C_c var1) {
      int var2 = var1.aa - var1.Z;
      int var3 = ff - var1.Z;
      int var4 = var1.V * 128 + var1.S * 64;
      int var5 = var1.X * 128 + var1.S * 64;
      int var6 = var1.W * 128 + var1.S * 64;
      int var7 = var1.Y * 128 + var1.S * 64;
      var1.ac = (var4 * (var2 - var3) + var6 * var3) / var2;
      var1.ad = (var5 * (var2 - var3) + var7 * var3) / var2;
      var1.n = 0;
      if (var1.ab == 0) {
         var1.s = 1024;
      }

      if (var1.ab == 1) {
         var1.s = 1536;
      }

      if (var1.ab == 2) {
         var1.s = 0;
      }

      if (var1.ab == 3) {
         var1.s = 512;
      }

      var1.ae = var1.s;
   }

   private void e(rs.p_a.C_c var1) {
      var1.w = var1.t;
      if (var1.E == 0) {
         var1.n = 0;
      } else {
         if (var1.F != -1 && var1.I == 0) {
            rs.p_d.C_a var2 = var1.d()[var1.F];
            if (var1.U > 0 && var2.o == 0) {
               var1.n++;
               return;
            }

            if (var1.U <= 0 && var2.p == 0) {
               var1.n++;
               return;
            }
         }

         int var9 = var1.ac;
         int var3 = var1.ad;
         int var4 = var1.k[var1.E - 1] * 128 + var1.S * 64;
         int var5 = var1.l[var1.E - 1] * 128 + var1.S * 64;
         if (var4 - var9 <= 256 && var4 - var9 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
            if (var9 < var4) {
               if (var3 < var5) {
                  var1.s = 1280;
               } else if (var3 > var5) {
                  var1.s = 1792;
               } else {
                  var1.s = 1536;
               }
            } else if (var9 > var4) {
               if (var3 < var5) {
                  var1.s = 768;
               } else if (var3 > var5) {
                  var1.s = 256;
               } else {
                  var1.s = 512;
               }
            } else if (var3 < var5) {
               var1.s = 1024;
            } else {
               var1.s = 0;
            }

            int var6 = var1.s - var1.ae & 2047;
            if (var6 > 1024) {
               var6 -= 2048;
            }

            int var7 = var1.ah;
            if (var6 >= -256 && var6 <= 256) {
               var7 = var1.ag;
            } else if (var6 >= 256 && var6 < 768) {
               var7 = var1.aj;
            } else if (var6 >= -768 && var6 <= -256) {
               var7 = var1.ai;
            }

            if (var7 == -1) {
               var7 = var1.ag;
            }

            var1.w = var7;
            byte var8 = 4;
            if (var1.ae != var1.s && var1.m == -1 && var1.o != 0) {
               var8 = 2;
            }

            if (var1.E > 2) {
               var8 = 6;
            }

            if (var1.E > 3) {
               var8 = 8;
            }

            if (var1.n > 0 && var1.E > 1) {
               var8 = 8;
               var1.n--;
            }

            if (var1.af[var1.E - 1]) {
               var8 <<= 1;
            }

            if (var8 >= 8 && (var1.w == var1.ag || var1.m != -1) && var1.p != -1) {
               var1.w = var1.p;
            }

            if (var9 < var4) {
               var1.ac += var8;
               if (var1.ac > var4) {
                  var1.ac = var4;
               }
            } else if (var9 > var4) {
               var1.ac -= var8;
               if (var1.ac < var4) {
                  var1.ac = var4;
               }
            }

            if (var3 < var5) {
               var1.ad += var8;
               if (var1.ad > var5) {
                  var1.ad = var5;
               }
            } else if (var3 > var5) {
               var1.ad -= var8;
               if (var1.ad < var5) {
                  var1.ad = var5;
               }
            }

            if (var1.ac == var4 && var1.ad == var5) {
               var1.E--;
               if (var1.U > 0) {
                  var1.U--;
               }
            }
         } else {
            var1.ac = var4;
            var1.ad = var5;
         }
      }
   }

   public void a(rs.p_a.C_c var1) {
      if (var1.o != 0) {
         if (var1.m != -1 && var1.m < 32768) {
            rs.p_a.C_j var2 = this.cA[var1.m];
            if (var2 != null) {
               int var3 = var1.ac - var2.ac;
               int var4 = var1.ad - var2.ad;
               if (var3 != 0 || var4 != 0) {
                  var1.s = (int)(Math.atan2((double)var3, (double)var4) * 325.949) & 2047;
               }
            }
         }

         if (var1.m >= 32768) {
            int var6 = var1.m - 32768;
            if (var6 == di) {
               var6 = 2047;
            }

            rs.p_a.C_k var9 = kw_do[var6];
            if (var9 != null) {
               int var11 = var1.ac - var9.ac;
               int var5 = var1.ad - var9.ad;
               if (var11 != 0 || var5 != 0) {
                  var1.s = (int)(Math.atan2((double)var11, (double)var5) * 325.949) & 2047;
               }
            }
         }

         if ((var1.Q != 0 || var1.R != 0) && (var1.E == 0 || var1.n > 0)) {
            int var7 = var1.ac - (var1.Q - eh - eh) * 64;
            int var10 = var1.ad - (var1.R - ei - ei) * 64;
            if (var7 != 0 || var10 != 0) {
               var1.s = (int)(Math.atan2((double)var7, (double)var10) * 325.949) & 2047;
            }

            var1.Q = 0;
            var1.R = 0;
         }

         int var8 = var1.s - var1.ae & 2047;
         if (var8 != 0) {
            if (var8 < var1.o || var8 > 2048 - var1.o) {
               var1.ae = var1.s;
            } else if (var8 > 1024) {
               var1.ae = var1.ae - var1.o;
            } else {
               var1.ae = var1.ae + var1.o;
            }

            var1.ae &= 2047;
            if (var1.w == var1.t && var1.ae != var1.s) {
               if (var1.u != -1) {
                  var1.w = var1.u;
                  return;
               }

               var1.w = var1.ag;
            }
         }
      }
   }

   private void f(rs.p_a.C_c var1) {
      var1.T = false;
      int var2 = var1.w;
      if (var2 != -1) {
         rs.p_d.C_a var3 = var1.d()[var2];
         if (var1 instanceof rs.p_a.C_k) {
            var3 = ((rs.p_a.C_k)var1).c(var2);
         }

         if (var3.b()) {
            var1.x++;
            int var4 = var3.c();
            if (var1.x >= var4) {
               if (var3.h > 0) {
                  var1.x = var1.x - var3.h;
                  if (var3.q == 1) {
                     var1.y++;
                  }

                  if (var1.x < 0 || var1.x >= var4 || var3.q == 1 && var1.y >= var3.n) {
                     var1.x = 0;
                     var1.y = 0;
                  }
               } else {
                  var1.y = 0;
                  var1.x = 0;
               }
            }
         } else {
            var1.y++;
            if (var1.x < var3.d && var1.y > var3.a(var1.x)) {
               var1.y = 1;
               var1.x++;
            }

            if (var1.x >= var3.d) {
               var1.y = 1;
               var1.x = 0;
            }
         }
      }

      if (var1.z != -1 && ff >= var1.C) {
         if (var1.A < 0) {
            var1.A = 0;
         }

         rs.p_d.C_a var5 = rs.p_d.C_x.c[var1.z].g;
         if (!var5.b()) {
            var1.B++;

            while (var1.A < var5.d && var1.B > var5.a(var1.A)) {
               var1.B = var1.B - var5.a(var1.A);
               var1.A++;
            }

            if (var1.A >= var5.d && (var1.A < 0 || var1.A >= var5.d)) {
               var1.z = -1;
            }
         } else {
            var1.A++;
            int var8 = var5.c();
            if (var1.A >= var8 && (var1.A < 0 || var1.A >= var8)) {
               var1.z = -1;
            }
         }
      }

      if (var1.F != -1 && var1.I <= 1) {
         rs.p_d.C_a var6 = var1.d()[var1.F];
         if (var6 == null) {
            System.out.println("NULLED ANIM: " + var1.F);
         }

         if (var6.o == 1 && var1.U > 0 && var1.Z <= ff && var1.aa < ff) {
            var1.I = 1;
            return;
         }
      }

      if (var1.F != -1 && var1.I == 0) {
         rs.p_d.C_a var7 = var1.d()[var1.F];
         if (var7.b()) {
            var1.G++;
            int var9 = var7.c();
            if (var1.G >= var9) {
               var1.G = var1.G - var7.h;
               var1.J++;
               if (var1.J >= var7.n) {
                  var1.F = -1;
               } else if (var1.G < 0 || var1.G >= var9) {
                  var1.F = -1;
               }
            }
         } else {
            var1.H++;

            while (var1.G < var7.d && var1.H > var7.a(var1.G)) {
               var1.H = var1.H - var7.a(var1.G);
               var1.G++;
            }

            if (var1.G >= var7.d) {
               var1.G = var1.G - var7.h;
               var1.J++;
               if (var1.J >= var7.n) {
                  var1.F = -1;
               }

               if (var1.G < 0 || var1.G >= var7.d) {
                  var1.F = -1;
               }
            }
         }

         var1.T = var7.j;
      }

      if (var1.I > 0) {
         var1.I--;
      }
   }

   public void O() {
   }

   public void P() {
      if (!rs.p_l.p_b.C_a.b()) {
         int var1 = !ai() ? 516 : ai - 247;
         int var2 = !ai() ? 168 : ah - 335;
         boolean var3 = false;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a || rs.p_f.C_a.ai != rs.p_f.C_a.c.a && !var3) {
            for (int var9 = 0; var9 < this.v.a.length; var9++) {
               if (eT[this.jh[var9]] != -1 && this.jg[var9] != -1) {
                  this.v.a[this.jg[var9]].f(this.je[var9] + var1, this.jf[var9] + var2);
               }
            }
         } else if (var3 && ai < 1000) {
            int[] var8 = new int[]{0, 1, 2, 3, 4, 5, 6, -1, 8, 9, 7, 11, 12, 13};
            int[] var10 = new int[]{219, 189, 156, 126, 93, 62, 30, 219, 189, 156, 124, 92, 59, 28};
            int[] var11 = new int[]{67, 69, 67, 69, 72, 72, 69, 32, 29, 29, 32, 30, 33, 31, 32};

            for (int var12 = 0; var12 < this.v.a.length; var12++) {
               if (eT[this.jh[var12]] != -1 && var8[var12] != -1) {
                  this.v.a[var8[var12]].f(ai - var10[var12], ah - var11[var12]);
               }
            }
         } else if (var3 && ai >= 1000) {
            int[] var4 = new int[]{0, 1, 2, 3, 4, 5, 6, -1, 8, 9, 7, 11, 12, 13};
            int[] var5 = new int[]{50, 80, 114, 143, 176, 208, 240, 242, 273, 306, 338, 370, 404, 433};
            int[] var6 = new int[]{30, 32, 30, 32, 34, 34, 32, 32, 29, 29, 32, 31, 32, 32, 32};

            for (int var7 = 0; var7 < this.v.a.length; var7++) {
               if (eT[this.jh[var7]] != -1 && var4[var7] != -1) {
                  this.v.a[var4[var7]].f(ai - 461 + var5[var7], ah - var6[var7]);
               }
            }
         }

         if (rs.p_l.p_f.p_a.p_i.C_b.n() != null && ff % 20 < 10) {
            switch (rs.p_l.p_f.p_a.p_i.C_b.n()) {
               case a:
                  if (fL != 2) {
                     rs.p_l.p_f.p_a.p_i.C_e.b.a().f(var1 + 83 - 30, var2 + 7 - 4);
                  }
                  break;
               case b:
                  if (fL != 3) {
                     rs.p_l.p_f.p_a.p_i.C_e.b.a().f(var1 + 114 - 30, var2 + 7 - 4);
                  }
                  break;
               case c:
                  if (fL != 4) {
                     rs.p_l.p_f.p_a.p_i.C_e.b.a().f(var1 + 146 - 30, var2 + 7 - 4);
                  }
                  break;
               case d:
                  if (fL != 6) {
                     rs.p_l.p_f.p_a.p_i.C_e.b.a().f(var1 + 214 - 30, var2 + 7 - 4);
                  }
            }
         }
      }
   }

   private void bG() {
      int var1 = !ai() ? 516 : ai - 247;
      int var2 = !ai() ? 168 : ah - 335;
      boolean var3 = false;
      boolean var4 = false;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a && (rs.p_f.C_a.ai == rs.p_f.C_a.c.a || var3)) {
         if (var3 && ai < 1000) {
            int[] var7 = new int[]{226, 194, 162, 130, 99, 65, 34, 219, 195, 161, 130, 98, 65, 33};
            int[] var6 = new int[]{73, 73, 73, 73, 73, 73, 73, -1, 37, 37, 37, 37, 37, 37, 37};
            if (eT[fL] != -1 && fL != 10 && var4) {
               if (fL == 7) {
                  this.H[39].f(ai - 130, ah - 37);
               }

               this.H[39].f(ai - var7[fL], ah - var6[fL]);
            }
         } else if (var3 && ai >= 1000) {
            int[] var5 = new int[]{417, 385, 353, 321, 289, 256, 224, 129, 193, 161, 130, 98, 65, 33};
            if (eT[fL] != -1 && fL != 10 && var4) {
               this.H[39].f(ai - var5[fL], ah - 37);
            }
         }
      } else if (eT[fL] != -1 && fL != 15) {
         this.H[this.jk[fL]].f(this.ji[fL] + var1, this.jj[fL] + var2);
      }
   }

   public void Q() {
      int var1 = !ai() ? 516 : ai - 240;
      int var2 = !ai() ? 168 : ah - 335;
      rs.p_l.C_E_uc.x = this.fp;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
         this.H[21].f(0 + var1, 0 + var2);
      } else if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         rs.p_l.C_c.d(ai - 217, ah - 305, 195, 270, 4076841, rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? 150 : 256);
         this.H[47].f(var1, var2);
      } else {
         boolean var3 = true;
         boolean var4 = true;
         if (ai >= 1000) {
            if (var3) {
               rs.p_l.C_c.d(ai - 197, ah - 304, 197, 265, 4076841, var4 ? 80 : 256);
               this.H[50].f(ai - 204, ah - 311);
            }

            int var5 = ai - 417;
            int var6 = ah - 37;

            for (int var7 = 0; var5 <= ai - 30 && var7 < 13; var7++) {
               this.H[46].f(var5, var6);
               var5 += 32;
            }
         } else if (ai < 1000) {
            if (var3) {
               rs.p_l.C_c.d(ai - 197, ah - 341, 195, 265, 4076841, var4 ? 80 : 256);
               this.H[50].f(ai - 204, ah - 348);
            }

            int var11 = ai - 226;
            int var14 = ah - 73;

            for (int var17 = 0; var11 <= ai - 32 && var17 < 7; var17++) {
               this.H[46].f(var11, var14);
               var11 += 32;
            }

            var11 = ai - 226;
            var14 = ah - 37;

            for (int var18 = 0; var11 <= ai - 32 && var18 < 7; var18++) {
               this.H[46].f(var11, var14);
               var11 += 32;
            }
         }
      }

      if (this.fu == -1) {
         this.bG();
         this.P();
      }

      int var9 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 31 + var1 : ai - 215;
      int var10 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 37 + var2 : ah - 298;
      if (this.fu != -1) {
         this.a(0, var9, rs.p_n.C_e.H[this.fu], var10);
      } else if (eT[fL] != -1) {
         this.a(0, var9, rs.p_n.C_e.H[eT[fL]], var10);
      }

      int var13 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? -526 : -10;
      int var16 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? -178 : -10;
      rs.p_n.p_b.p_a.C_c.d();
      if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Spawn this item")) {
         if (rs.p_l.C_j.b(cT)) {
            int var19 = br + 5;
            if (br == 64036) {
               var19 = 70002;
            }

            if (C_af.e.get(var19) != null) {
               int var8 = C_af.e.get(var19).b();
               this.b(hP + var13, hQ + var16, " @gre@Item ID: @yel@" + var8 + "    ");
               rs.p_n.C_e.H['﨡'].at = "@gre@Last hovered: @yel@" + var8;
            } else {
               this.b(hP + var13, hQ + var16, " Right-click @yel@quick spawn    ");
            }
         } else {
            int var20 = br + 5;
            if (br == 64036) {
               var20 = 70002;
            }

            boolean var21 = false;
            if (var20 >= 0
               && var20 <= rs.p_n.C_e.H.length - 1
               && rs.p_n.C_e.H[var20] != null
               && rs.p_n.C_e.H[var20].at != null
               && rs.p_n.C_e.H[var20].at.contains("@gre@")) {
               this.b(hP + var13, hQ + var16, " <img=25> @or2@Unspawnable   ");
               var21 = true;
            }

            if (!var21) {
               this.b(hP + var13, hQ + var16, " Right-click @yel@quick spawn    ");
            }
         }
      }

      if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Lite mode")) {
         this.b(hP + var13, hQ + var16, " Toggle \"Lite mode\"\nExperiencing lag? This mode will\nreduce your graphic settings\nand improve performance!");
      }

      if (this.eV >= 1 && this.fx[this.eV - 1] != null && this.fx[this.eV - 1].equals("Resizable mode")) {
         this.b(hP + var13, hQ + var16, " Resizable mode\nToggle this setting\nif you want to experience\nSpawnPK in fullscreen!");
      }

      if (this.eV >= 2 && this.fx[this.eV - 1] != null) {
         if (this.fx[this.eV - 1].equalsIgnoreCase("Open achievement tab")) {
            this.b(hP + var13, hQ + var16, " Achievements");
         }

         if (this.fx[this.eV - 1].equalsIgnoreCase("Open events")) {
            this.b(hP + var13, hQ + var16, " World events");
         }

         if (this.fx[this.eV - 1].equalsIgnoreCase("Open guides")) {
            this.b(hP + var13, hQ + var16, " Knowledgebase");
         }

         if (this.fx[this.eV - 1].equalsIgnoreCase("Open account information")) {
            this.b(hP + var13, hQ + var16, " Account information");
         }

         if (this.fx[this.eV - 1].equalsIgnoreCase("Open pk ratings")) {
            this.b(hP + var13, hQ + var16, " PK ratings");
         }

         if (this.fx[this.eV - 1].equalsIgnoreCase("Collect reward")) {
            this.b(hP + var13, hQ + var16, " <img=9> Collect ");
         }

         if (this.fx[this.eV - 1].equalsIgnoreCase("View information")) {
            this.b(hP + var13, hQ + var16, " <img=40>  Information ");
         }
      }

      if (this.cY > 0 && this.fu == -1 && ff % 20 < 10) {
         if (this.cY == 1) {
            if (fL != 11) {
               if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
                  this.cU.f(ai - 101, ah - 70);
               } else {
                  this.cU.f(146, 265);
               }
            } else if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               this.cU.f(ai - 213, ah - 280);
            } else {
               this.cU.f(33, 55);
            }
         } else if (this.cY == 2) {
            if (fL != 6) {
               if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
                  this.cV.f(ai - 35, ah - 300);
               } else {
                  this.cV.f(212, 38);
               }
            } else if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               this.cU.f(ai - 182, ah - 290);
            } else {
               this.cU.f(65, 44);
            }
         }
      }

      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.t);
      rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.u);
      if (dj) {
         this.b(0, 0);
      }

      rs.p_l.C_E_uc.x = this.fq;
   }

   private void bH() {
      rs.p_l.p_b.C_a.a(this);
   }

   private boolean d(rs.p_n.C_e var1) {
      int var2 = var1.J;
      if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
         if (var2 >= 401 && var2 <= 500) {
            this.fx[this.eV] = "Remove @whi@" + var1.at;
            this.eI[this.eV] = 322;
            this.eV++;
            return true;
         } else {
            return false;
         }
      } else {
         if (var2 >= 801) {
            var2 -= 701;
         } else if (var2 >= 701) {
            var2 -= 601;
         } else if (var2 >= 101) {
            var2 -= 101;
         } else {
            var2--;
         }

         if (ag) {
            this.fx[this.eV] = "Message @whi@" + this.mT[var2];
            this.eI[this.eV] = 639;
            this.eV++;
            this.fx[this.eV] = "Remove @whi@" + this.mT[var2];
            this.eI[this.eV] = 792;
            this.eV++;
         } else {
            this.fx[this.eV] = "Remove @whi@" + this.mT[var2];
            this.eI[this.eV] = 792;
            this.eV++;
            this.fx[this.eV] = "Message @whi@" + this.mT[var2];
            this.eI[this.eV] = 639;
            this.eV++;
         }

         return true;
      }
   }

   public void R() {
      for (rs.p_a.C_b var1 = (rs.p_a.C_b)this.et.b(); var1 != null; var1 = (rs.p_a.C_b)this.et.d()) {
         if (var1.h != dw || var1.m) {
            var1.b();
         } else if (ff >= var1.l) {
            var1.a(this.dE);
            if (var1.m) {
               var1.b();
            } else {
               this.dF.a(var1.h, 0, var1.k, -1, var1.j, 60, var1.i, var1, false);
            }
         }
      }
   }

   public boolean i(int var1) {
      boolean var2 = false;
      if (var1 <= 0) {
         return true;
      } else {
         rs.p_n.C_e var3 = rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1 - 1][1]];
         var2 = var3.az == null || var3.az[0] <= 0;
         if (!var2) {
            return true;
         } else {
            var3 = rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][1]];
            return var3.az != null && var3.az[0] > 0;
         }
      }
   }

   public boolean j(int var1) {
      if (var1 == 54195 && cH == C_aD_mc.bI) {
         return false;
      } else if ((var1 >= 45694 && var1 <= 45701 || var1 >= 45149 && var1 <= 45156 || var1 >= 45751 && var1 <= 45758 || var1 >= 45743 && var1 <= 45750)
         && eR.br[3] != 21208) {
         return false;
      } else {
         if (eT[0] == 1829) {
            if ((var1 == 12055 || var1 == 12081) && eR.br[3] != 12303 && eR.br[3] != 13416 && eR.br[3] != 27718) {
               return false;
            }

            if ((var1 == 12056 || var1 == 12091) && eR.br[3] != 23673) {
               return false;
            }

            if ((var1 == 12054 || var1 == 12071)
               && eR.br[3] != 21544
               && eR.br[3] != 21545
               && eR.br[3] != 21546
               && eR.br[3] != 21547
               && eR.br[3] != 25934
               && eR.br[3] != 25935) {
               return false;
            }
         }

         return true;
      }
   }

   public void a(int var1, int var2, rs.p_n.C_e var3, int var4) {
      rs.p_l.p_b.p_a.C_d.a(this, var1, var2, var3, var4);
   }

   public void f(int var1, int var2) {
      rs.p_l.C_c.a(71, var2 - 1, var1 - 2, 7496785, 1);
      rs.p_l.C_c.a(69, var2, var1 + 174, 7496785, 1);
      rs.p_l.C_c.a(1, var2 - 2, var1 - 2, 7496785, 178);
      rs.p_l.C_c.a(1, var2 + 68, var1, 7496785, 174);
      rs.p_l.C_c.a(71, var2 - 1, var1 - 1, 3025699, 1);
      rs.p_l.C_c.a(71, var2 - 1, var1 + 175, 3025699, 1);
      rs.p_l.C_c.a(1, var2 - 1, var1, 3025699, 175);
      rs.p_l.C_c.a(1, var2 + 69, var1, 3025699, 175);
      rs.p_l.C_c.d(var1, var2, 174, 68, 0, 220);
   }

   public final String k(int var1) {
      if (var1 >= 0 && var1 < 10000) {
         return String.valueOf(var1);
      } else if (var1 >= 10000 && var1 < 10000000) {
         return var1 / 1000 + "K";
      } else if (var1 >= 10000000 && var1 < 999999999) {
         return var1 / 1000000 + "M";
      } else {
         return var1 >= 999999999 ? "*" : "?";
      }
   }

   public void c(int var1, int var2, String var3) {
      String[] var4 = var3.split("\n");
      int var5 = var4.length * 16 + 3;
      int var6 = this.gi.a(var4[0]) + 6;

      for (int var7 = 1; var7 < var4.length; var7++) {
         if (var6 <= this.gi.a(var4[var7]) + 6) {
            var6 = this.gi.a(var4[var7]) + 6;
         }
      }

      rs.p_l.C_c.a(var5, var2, var1, 16777120, var6);
      rs.p_l.C_c.d(var1, var6, var5, 0, var2);
      var2 += 14;

      for (int var9 = 0; var9 < var4.length; var9++) {
         this.gi.a(false, var1 + 3, 0, var4[var9], var2);
         var2 += 16;
      }
   }

   public void l(int var1) {
      this.jl = var1;
      rs.p_n.C_e.H[5385].V = 0;
      rs.p_n.C_e.H[10324].E = rs.p_n.p_c.C_h.d;
      rs.p_n.C_e.H[10324].aG = rs.p_n.p_c.C_h.d;

      for (int[] var5 : rs.p_n.p_c.C_h.bI) {
         if (rs.p_n.C_e.H[var5[1]].az[0] <= 0) {
            rs.p_n.C_e.H[var5[0]].E = rs.p_n.p_c.C_h.g;
         } else {
            rs.p_n.C_e.H[var5[0]].E = rs.p_n.p_c.C_h.f;
            rs.p_n.C_e.H[var5[0]].aG = rs.p_n.p_c.C_h.f;
         }
      }

      if (var1 == -1) {
         rs.p_n.C_e.H[10324].E = rs.p_n.p_c.C_h.c;
         rs.p_n.C_e.H[10324].aG = rs.p_n.p_c.C_h.c;
      } else {
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][0]].E = rs.p_n.p_c.C_h.e;
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][0]].aG = rs.p_n.p_c.C_h.e;
      }
   }

   public void d(int var1, int var2, int var3) {
      if (var2 <= 0) {
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][1]].az[0] = 0;
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][1]].ax[0] = 0;
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][0]].E = rs.p_n.p_c.C_h.g;
      } else {
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][1]].az[0] = var2 + 1;
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][1]].ax[0] = var3;
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][1]].bh = false;
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][0]].E = this.jl == var1 ? rs.p_n.p_c.C_h.e : rs.p_n.p_c.C_h.f;
         rs.p_n.C_e.H[rs.p_n.p_c.C_h.bI[var1][0]].aG = this.jl == var1 ? rs.p_n.p_c.C_h.e : rs.p_n.p_c.C_h.f;
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      super.mouseReleased(var1);
      int var2 = rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? ai / 2 - 356 : 0;
      int var3 = rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? ah / 2 - 230 : 0;
      if (this.eA == 2 && (this.ex == 5382 || this.ex >= 10335 && this.ex <= 10342) && C_C_uc.hQ >= 40 + var3 && C_C_uc.hQ <= 77 + var3) {
         String var4 = this.ex == 5382 ? "::setbanktab" : "::swapbanktab";
         if (C_C_uc.hP >= 28 + var2 && C_C_uc.hP <= 74 + var2) {
            ap = var4 + " " + this.ey + " 0" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }

         if (C_C_uc.hP >= 75 + var2 && C_C_uc.hP <= 121 + var2) {
            ap = var4 + " " + this.ey + " 1" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }

         if (C_C_uc.hP >= 122 + var2 && C_C_uc.hP <= 168 + var2) {
            ap = var4 + " " + this.ey + " 2" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }

         if (C_C_uc.hP >= 169 + var2 && C_C_uc.hP <= 215 + var2) {
            ap = var4 + " " + this.ey + " 3" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }

         if (C_C_uc.hP >= 216 + var2 && C_C_uc.hP <= 262 + var2) {
            ap = var4 + " " + this.ey + " 4" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }

         if (C_C_uc.hP >= 263 + var2 && C_C_uc.hP <= 309 + var2) {
            ap = var4 + " " + this.ey + " 5" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }

         if (C_C_uc.hP >= 310 + var2 && C_C_uc.hP <= 356 + var2) {
            ap = var4 + " " + this.ey + " 6" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }

         if (C_C_uc.hP >= 357 + var2 && C_C_uc.hP <= 403 + var2) {
            ap = var4 + " " + this.ey + " 7" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }

         if (C_C_uc.hP >= 404 + var2 && C_C_uc.hP <= 450 + var2) {
            ap = var4 + " " + this.ey + " 8" + (this.ex >= 10335 && this.ex <= 10342 ? " " + this.mV : "");
         }
      }
   }

   private void a(rs.p_l.C_a var1) {
      short var2 = 256;

      for (int var3 = 0; var3 < this.nP.length; var3++) {
         this.nP[var3] = 0;
      }

      for (int var9 = 0; var9 < 5000; var9++) {
         int var4 = (int)(Math.random() * 128.0 * (double)var2);
         this.nP[var4] = (int)(Math.random() * 256.0);
      }

      for (int var10 = 0; var10 < 20; var10++) {
         for (int var12 = 1; var12 < var2 - 1; var12++) {
            for (int var5 = 1; var5 < 127; var5++) {
               int var6 = var5 + (var12 << 7);
               this.nQ[var6] = (this.nP[var6 - 1] + this.nP[var6 + 1] + this.nP[var6 - 128] + this.nP[var6 + 128]) / 4;
            }
         }

         int[] var13 = this.nP;
         this.nP = this.nQ;
         this.nQ = var13;
      }

      if (var1 != null) {
         int var11 = 0;

         for (int var14 = 0; var14 < var1.k; var14++) {
            for (int var15 = 0; var15 < var1.j; var15++) {
               if (var1.i[var11++] != 0) {
                  int var16 = var15 + 16 + var1.l;
                  int var7 = var14 + 16 + var1.m;
                  int var8 = var16 + (var7 << 7);
                  this.nP[var8] = 0;
               }
            }
         }
      }
   }

   private void a(int var1, int var2, rs.p_x.C_e var3, rs.p_a.C_k var4) {
      if (rs.p_f.C_a.f) {
         cx.add("Parsing synchronization mask..");
      }

      if ((var1 & 1024) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting forcemovement block..");
         }

         var4.V = var3.P();
         var4.X = var3.P();
         var4.W = var3.P();
         var4.Y = var3.P();
         var4.Z = var3.U() + ff;
         var4.aa = var3.T() + ff;
         var4.ab = var3.P();
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->forceMovement direction=" + var4.ab);
         }

         var4.e();
      }

      if ((var1 & 256) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting GFX block..");
         }

         var4.z = var3.S();
         int var5 = var3.D();
         if (var4.z == 1950 && rs.p_f.C_a.aj) {
            var4.z = 1171;
         }

         if (var4.z == 1339 && rs.p_f.C_a.aV) {
            var4.z = 1222;
         }

         if (var4.z == 1338 && rs.p_f.C_a.aV) {
            var4.z = 1223;
         }

         if (var4.z == 1340 && rs.p_f.C_a.aV) {
            var4.z = 3001;
         }

         var4.D = var5 >> 16;
         var4.C = ff + (var5 & 65535);
         var4.A = 0;
         var4.B = 0;
         if (var4.C > ff) {
            var4.A = -1;
         }

         if (var4.z == 65535) {
            var4.z = -1;
         }

         if (rs.p_f.C_a.f) {
            cx.add("\t\t->GFX=" + var4.z);
         }
      }

      if ((var1 & 8) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting animation block..");
         }

         int var14 = var3.S();
         if (var14 == 65535) {
            var14 = -1;
         }

         int var6 = var3.O();
         int var7 = var3.O();
         if (var14 > 0 && var14 < rs.p_d.C_a.a.length && var7 == 2 && rs.p_d.C_a.a[var14].k < 8) {
            rs.p_d.C_a.a[var14].k = 8;
            rs.p_d.C_a.c[var14].k = 8;
            rs.p_d.C_a.b[var14].k = 8;
         }

         if (var14 == var4.F && var14 != -1) {
            int var8 = rs.p_d.C_a.a[var14].q;
            if (var7 == 2) {
               var8 = 1;
            }

            if (var8 == 1) {
               var4.G = 0;
               var4.H = 0;
               var4.I = var6;
               var4.J = 0;
            }

            if (var8 == 2) {
               var4.J = 0;
            }
         } else if (var14 == -1 || var4.F == -1 || rs.p_d.C_a.a[var14].k >= rs.p_d.C_a.a[var4.F].k) {
            var4.F = var14;
            var4.G = 0;
            var4.H = 0;
            var4.I = var6;
            var4.J = 0;
            var4.U = var4.E;
         }

         if (rs.p_f.C_a.f) {
            cx.add("\t\t->i2: " + var6);
         }
      }

      if ((var1 & 4) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting forcechat block..");
         }

         String var15 = var3.F();
         if (var15.charAt(0) == '~') {
            var15 = var15.substring(1);
            var4.aA = var4.aA == 1 ? 2 : 1;
            var4.az = System.currentTimeMillis() + 1200L;
         }

         if (!var15.endsWith("__")) {
            var4.q = var15;
            var4.v = 0;
            var4.K = 0;
            var4.O = 150;
         }

         if (rs.p_f.C_a.f) {
            cx.add("\t\t->..done!");
         }
      }

      if ((var1 & 128) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting chat block..");
         }

         int var16 = var3.S();
         int var19 = var3.B();
         int var22 = var3.O();
         int var25 = var3.h;
         if (var4.aZ != null && var4.bm) {
            long var9 = C_O_uc.a(var4.d(true));
            boolean var11 = false;
            if (!rs.p_l.C_j.a(var19)) {
               for (int var12 = 0; var12 < this.jD; var12++) {
                  if (this.kP[var12] == var9) {
                     var11 = true;
                     break;
                  }
               }
            }

            if (!var11 && this.ou == 0) {
               try {
                  this.jM.h = 0;
                  var3.b(var22, 0, this.jM.g);
                  this.jM.h = 0;
                  String var28 = C_P_uc.a(var22, this.jM);
                  var28 = rs.p_d.C_c.b(var28);
                  var4.q = var28;
                  var4.v = var16 >> 8;
                  var4.aC = var19;
                  var4.K = var16 & 0xFF;
                  var4.O = 150;
                  if (var19 > 0) {
                     this.a(var28, 1, "@cr" + var19 + "@" + var4.d(true));
                  } else {
                     this.a(var28, 2, var4.d(true));
                  }
               } catch (Exception var13) {
                  rs.p_v.C_a.e("cde2");
               }
            }
         }

         var3.h = var25 + var22;
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->..done!");
         }
      }

      if ((var1 & 1) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting interaction bloc..");
         }

         var4.m = var3.S();
         if (var4.m == 65535) {
            var4.m = -1;
         }

         if (rs.p_f.C_a.f) {
            cx.add("\t\t->interactingEntity=" + var4.m);
         }
      }

      if ((var1 & 16) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting appearence block..");
         }

         int var17 = var3.O();
         byte[] var20 = new byte[var17];
         rs.p_x.C_e var23 = new rs.p_x.C_e(var20);
         var3.a(var17, 0, var20);
         this.ky[var2] = var23;
         var4.a(var23);
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->..appearence block done!");
         }
      }

      if ((var1 & 2) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting turn to tile block..");
         }

         var4.Q = var3.U();
         var4.R = var3.S();
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->faceX=" + var4.Q + " faceY" + var4.R);
         }
      }

      if ((var1 & 32) != 0) {
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->Starting hits update block..");
         }

         int var18 = var3.y();

         for (int var21 = 0; var21 < var18; var21++) {
            int var24 = var3.o();
            int var26 = var3.y();
            int var27 = var3.y();
            var4.a(var26, var24, ff, var27);
         }

         var4.L = ff + 300;
         var4.M = var3.o();
         var4.N = var3.o();
         if (rs.p_f.C_a.f) {
            cx.add("\t\t->health=" + var4.M + "/" + var4.N);
         }
      }
   }

   public void S() {
      this.g(eR.ac, eR.ad);
   }

   public void g(int var1, int var2) {
      try {
         int var3 = var1 + this.gq;
         int var4 = var2 + this.eU;
         if (this.eb - var3 < -500 || this.eb - var3 > 500 || this.ec - var4 < -500 || this.ec - var4 > 500) {
            this.eb = var3;
            this.ec = var4;
         }

         if (this.eb != var3) {
            this.eb = this.eb + (var3 - this.eb) / 16;
         }

         if (this.ec != var4) {
            this.ec = this.ec + (var4 - this.ec) / 16;
         }

         if (super.hY[1] == 1 && !w.b) {
            this.nM = this.nM + (-24 - this.nM) / 2;
         } else if (super.hY[2] == 1 && !w.b) {
            this.nM = this.nM + (24 - this.nM) / 2;
         } else {
            this.nM /= 2;
         }

         if (super.hY[3] != 1 || w.b) {
            if (super.hY[4] != 1 || w.b) {
               this.nN /= 2;
            } else if (rs.p_l.p_b.p_a.C_d.g() && ch) {
               rs.p_l.p_b.p_a.C_d.b.i += 5;
            } else {
               this.nN = this.nN + (-12 - this.nN) / 2;
            }
         } else if (rs.p_l.p_b.p_a.C_d.g() && ch) {
            rs.p_l.p_b.p_a.C_d.b.i -= 5;
         } else {
            this.nN = this.nN + (12 - this.nN) / 2;
         }

         this.ft = this.ft + this.nM / 2 & 2047;
         this.fs = this.fs + this.nN / 2;
         if (this.fs < 128) {
            this.fs = 128;
         }

         if (this.fs > 383) {
            this.fs = 383;
         }

         int var5 = this.eb >> 7;
         int var6 = this.ec >> 7;
         int var7 = this.c(dw, this.ec, this.eb);
         int var8 = 0;
         if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
            for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
               for (int var10 = var6 - 4; var10 <= var6 + 4; var10++) {
                  int var11 = dw;
                  if (var11 < 3 && (this.gc[1][var9][var10] & 2) == 2) {
                     var11++;
                  }

                  int var12 = var7 - this.fC[var11][var9][var10];
                  if (var12 > var8) {
                     var8 = var12;
                  }
               }
            }
         }

         dZ++;
         if (dZ > 1512) {
            dZ = 0;
            fv.a(77);
            fv.b(0);
            int var14 = fv.h;
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
            fv.j(fv.h - var14);
         }

         int var15 = var8 * 192;
         if (var15 > 98048) {
            var15 = 98048;
         }

         if (var15 < 32768) {
            var15 = 32768;
         }

         if (var15 > this.dQ) {
            this.dQ = this.dQ + (var15 - this.dQ) / 24;
         } else {
            if (var15 < this.dQ) {
               this.dQ = this.dQ + (var15 - this.dQ) / 80;
            }
         }
      } catch (Exception var13) {
         rs.p_v.C_a.e("glfc_ex " + eR.ac + "," + eR.ad + "," + this.eb + "," + this.ec + "," + this.mx + "," + this.my + "," + eh + "," + ei);
         var13.printStackTrace();
         throw new RuntimeException("eek");
      }
   }

   @Override
   public void T() {
      if (!this.ov && !this.kQ && !this.nI) {
         mr++;
         if (!rs.p_l.p_b.C_a.a()) {
            fg += 0.05;
            if (fg >= Double.MAX_VALUE) {
               fg = 0.0;
            }
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

         bL = bL + bM;
         if (bL >= 100) {
            bM = -1;
         } else if (bL <= 1) {
            bM = 1;
         }

         this.oc = 0;
      } else {
         this.bE();
      }
   }

   private boolean i(String var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < this.kA; var2++) {
            if (var1.equalsIgnoreCase(this.mT[var2])) {
               return true;
            }
         }

         return var1.equalsIgnoreCase(eR.aZ);
      }
   }

   private static String r(int var0, int var1) {
      int var2 = var0 - var1;
      if (var2 < -9) {
         return "@red@";
      } else if (var2 < -6) {
         return "@or3@";
      } else if (var2 < -3) {
         return "@or2@";
      } else if (var2 < 0) {
         return "@or1@";
      } else if (var2 > 9) {
         return "@gre@";
      } else if (var2 > 6) {
         return "@gr3@";
      } else if (var2 > 3) {
         return "@gr2@";
      } else {
         return var2 > 0 ? "@gr1@" : "@yel@";
      }
   }

   private void F(int var1) {
      rs.p_v.C_a.m = var1;
   }

   public String h(int var1, int var2) {
      return rs.p_v.C_a.f() + "index" + var1 + "/" + (var2 != -1 ? var2 + ".gz" : "");
   }

   public static String e(String var0) {
      File var1 = new File(var0);
      var1.getName();
      int var2 = var1.getName().lastIndexOf(46);
      return 0 < var2 && var2 <= var1.getName().length() - 2 ? var1.getName().substring(0, var2) : "";
   }

   public void m(int var1) {
      if (rs.p_f.C_a.d) {
         System.out.println("[Cache Repacking] Started repacking index " + var1 + ".");
         int var2 = new File(this.h(var1, -1)).listFiles().length;
         File[] var3 = new File(this.h(var1, -1)).listFiles();
         int var4 = 0;

         try {
            for (int var5 = 0; var5 < var2; var5++) {
               if (!var3[var5].getName().contains(".jar")) {
                  System.out.println("Packing: " + var3[var5].toString());
                  String var6 = e(var3[var5].toString());
                  int var7 = Integer.parseInt(e(var3[var5].toString()));
                  byte[] var8 = this.i(var1, var7);
                  boolean var9 = false;
                  if (var1 == 1 && rs.p_f.C_a.d) {
                  }

                  if (!var9) {
                     if (var8 != null && var8.length > 0) {
                        if (var1 == 1) {
                           File var10 = new File(rs.p_v.C_a.b() + "raws/" + var7 + ".dat");
                           if (var10.exists()) {
                              var10.delete();
                           }

                           File var11 = new File(rs.p_v.C_a.b() + "raws/" + var7);
                           if (var11.exists()) {
                              var11.delete();
                           }
                        }

                        var4++;
                        ew.b.a()[var1].a(var8.length, var8, var7);
                     } else {
                        System.out.println("[Cache] Unable to locate index #" + var7 + ".");
                     }
                  }
               }
            }
         } catch (Exception var12) {
            var12.printStackTrace();
         }

         String var13 = "unknown";
         if (var1 == 1) {
            var13 = "models";
         }

         if (var1 == 2) {
            var13 = "animations";
         }

         if (var1 == 3) {
            var13 = "sounds";
         }

         if (var1 == 4) {
            var13 = "maps";
         }

         if (var4 > 0) {
            System.out.println("[Cache] Repacked index #" + var1 + " (" + var13 + ") (Files: " + var4 + ")");
         }
      }
   }

   public byte[] i(int var1, int var2) {
      try {
         if (this.h(var1, var2).length() > 0 && this.h(var1, var2) != null) {
            File var3 = new File(this.h(var1, var2));
            byte[] var4 = new byte[(int)var3.length()];
            FileInputStream var5 = new FileInputStream(var3);
            var5.read(var4);
            var5.close();
            return var4;
         } else {
            return null;
         }
      } catch (Exception var6) {
         return null;
      }
   }

   private void h(long var1) {
      try {
         if (var1 != 0L) {
            if (this.jD >= 100) {
               this.a("Your ignore list is full. Max of 100 hit", 0, "");
            } else {
               String var3 = C_O_uc.c(C_O_uc.a(var1));

               for (int var4 = 0; var4 < this.jD; var4++) {
                  if (this.kP[var4] == var1) {
                     this.a(var3 + " is already on your ignore list", 0, "");
                     return;
                  }
               }

               for (int var6 = 0; var6 < this.kA; var6++) {
                  if (this.lg[var6] == var1) {
                     this.a("Please remove " + var3 + " from your friend list first", 0, "");
                     return;
                  }
               }

               this.kP[this.jD++] = var1;
               fb = true;
               fv.a(133);
               fv.a(var1);
            }
         }
      } catch (RuntimeException var5) {
         rs.p_v.C_a.e("45688, " + var1 + ", 4, " + var5.toString());
         throw new RuntimeException();
      }
   }

   private void bI() {
      for (int var1 = -1; var1 < this.ku; var1++) {
         int var2;
         if (var1 == -1) {
            var2 = 2047;
         } else {
            var2 = this.kv[var1];
         }

         rs.p_a.C_k var3 = kw_do[var2];
         if (var3 != null) {
            this.b(var3);
         }
      }
   }

   private void bJ() {
      if (ee == 2) {
         for (C_N_uc var1 = (C_N_uc)this.nL.b(); var1 != null; var1 = (C_N_uc)this.nL.d()) {
            if (var1.g > 0) {
               var1.g--;
            }

            if (var1.g == 0) {
               if (var1.l < 0 || C_x.a(var1.l, var1.n)) {
                  this.a(var1.k, var1.h, var1.m, var1.n, var1.j, var1.i, var1.l);
                  var1.b();
               }
            } else {
               if (var1.o > 0) {
                  var1.o--;
               }

               if (var1.o == 0 && var1.j >= 1 && var1.k >= 1 && var1.j <= 102 && var1.k <= 102 && (var1.a < 0 || C_x.a(var1.a, var1.f))) {
                  this.a(var1.k, var1.h, var1.b, var1.f, var1.j, var1.i, var1.a);
                  var1.o = -1;
                  if (var1.a == var1.l && var1.l == -1) {
                     var1.b();
                  } else if (var1.a == var1.l && var1.b == var1.m && var1.f == var1.n) {
                     var1.b();
                  }
               }
            }
         }
      }
   }

   private void bK() {
      int var1 = gj.a("Choose option");

      for (int var2 = 0; var2 < this.eV; var2++) {
         int var3 = gj.a(this.fx[var2]);
         if (var3 > var1) {
            var1 = var3;
         }
      }

      var1 += 8;
      int var9 = 15 * this.eV + 21;
      if (super.hV > 0 && super.hW > 0 && super.hV < ai && super.hW < ah) {
         int var10 = super.hV - var1 / 2;
         if (var10 + var1 > ai - 4) {
            var10 = ai - 4 - var1;
         }

         if (var10 < 0) {
            var10 = 0;
         }

         int var4 = super.hW - 0;
         if (var4 + var9 > ah - 6) {
            var4 = ah - 6 - var9;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         dj = true;
         this.lc = var10;
         this.ld = var4;

         for (int var5 = 0; var5 < this.eV; var5++) {
            if (this.eI[var5] == 516) {
               int var6 = this.eF[var5];
               int var7 = this.eG[var5];
               this.dF.b(var7 - 4, var6 - 4);
               C_V_uc.q = true;
            }
         }

         this.dI = var1;
         this.dJ = 15 * this.eV + 22;
         C_MenuOpened_mc var11 = new C_MenuOpened_mc();
         this.p.post(var11);
      }
   }

   private void c(rs.p_x.C_e var1) {
      var1.J();
      int var2 = var1.k(1);
      if (rs.p_f.C_a.f) {
         cx.add("\t-> Update: " + var2);
      }

      if (var2 != 0) {
         int var3 = var1.k(2);
         if (rs.p_f.C_a.d) {
            cx.add("\t-> type: " + var3);
         }

         if (var3 == 0) {
            if (rs.p_f.C_a.d) {
               cx.add("\t\t-> Set entitiesAwaitingUpdate to self");
            }

            this.kx[this.kw++] = 2047;
         } else if (var3 == 1) {
            int var9 = var1.k(3);
            eR.a(false, var9);
            int var11 = var1.k(1);
            if (rs.p_f.C_a.d) {
               cx.add("\t\t-> direction=" + var9 + " updateRequired=" + var11);
            }

            if (var11 == 1) {
               this.kx[this.kw++] = 2047;
            }
         } else if (var3 == 2) {
            int var8 = var1.k(3);
            eR.a(true, var8);
            int var10 = var1.k(3);
            eR.a(true, var10);
            int var12 = var1.k(1);
            if (rs.p_f.C_a.d) {
               cx.add("\t\t-> firstDirection=" + var8 + " secondDirection=" + var10 + " updateRequired=" + var12);
            }

            if (var12 == 1) {
               this.kx[this.kw++] = 2047;
            }
         } else {
            if (var3 == 3) {
               dw = var1.k(2);
               int var4 = var1.k(1);
               int var5 = var1.k(1);
               if (var5 == 1) {
                  this.kx[this.kw++] = 2047;
               }

               int var6 = var1.k(7);
               int var7 = var1.k(7);
               if (rs.p_f.C_a.d) {
                  cx.add("\t\t-> teleport=" + var4 + " updateRequired=" + var5 + " y=" + var6 + " x=" + var7);
               }

               eR.a(var7, var6, true);
            }
         }
      }
   }

   private void bL() {
      this.jK = false;

      while (this.lj) {
         this.jK = false;

         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
         }
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

   public boolean j(int var1, int var2) {
      if (rs.p_l.p_b.C_a.a()) {
         return false;
      } else {
         if (var2 == 56998 || var2 == 32019) {
            this.j(var1, 57016);
         }

         boolean var3 = false;
         rs.p_n.C_e var4 = rs.p_n.C_e.H[var2];

         for (int var5 = 0; var5 < var4.al.length && var4.al[var5] != -1; var5++) {
            rs.p_n.C_e var6 = rs.p_n.C_e.H[var4.al[var5]];
            if (var6.aI == 1) {
               var3 |= this.j(var1, var6.aw);
            }

            if (var6.aI == 6 && (var6.aD != -1 || var6.aE != -1)) {
               boolean var7 = this.b(var6);
               int var8;
               if (var7) {
                  var8 = var6.aE;
               } else {
                  var8 = var6.aD;
               }

               if (var8 != -1) {
                  rs.p_d.C_a var9 = rs.p_d.C_a.a[var8];
                  if (var9.b()) {
                     var6.ar++;
                     int var10 = var9.c();
                     var6.F -= var10 + 1;
                     if (var6.ar >= var10) {
                        var6.ar = var6.ar - var9.h;
                        if (var6.ar < 0 || var6.ar >= var9.d) {
                           var6.ar = 0;
                        }
                     }

                     var3 = true;
                  } else {
                     for (var6.F += var1; var6.F > var9.a(var6.ar); var3 = true) {
                        var6.F = var6.F - (var9.a(var6.ar) + 1);
                        var6.ar++;
                        if (var6.ar >= var9.d) {
                           var6.ar = var6.ar - var9.h;
                           if (var6.ar < 0 || var6.ar >= var9.d) {
                              var6.ar = 0;
                           }
                        }
                     }
                  }
               }
            }
         }

         return var3;
      }
   }

   public int U() {
      int var1 = 3;
      if (this.cR < 310) {
         int var2 = cJ >> 7;
         int var3 = cL >> 7;
         int var4 = eR.ac >> 7;
         int var5 = eR.ad >> 7;
         if (dw < 0 || dw >= this.gc.length) {
            System.out.println("Prevented crash C 1.0");
            return var1;
         }

         if (var2 < 0 || var2 >= this.gc[dw].length) {
            System.out.println("Prevented crash C 1.1");
            return var1;
         }

         if (var3 < 0 || var3 >= this.gc[dw][var2].length) {
            return dw;
         }

         if ((this.gc[dw][var2][var3] & 4) != 0) {
            var1 = dw;
         }

         int var6;
         if (var4 > var2) {
            var6 = var4 - var2;
         } else {
            var6 = var2 - var4;
         }

         int var7;
         if (var5 > var3) {
            var7 = var5 - var3;
         } else {
            var7 = var3 - var5;
         }

         if (var6 > var7) {
            int var8 = var7 * 65536 / var6;
            int var9 = 32768;

            while (var2 != var4) {
               if (var2 < var4) {
                  var2++;
               } else if (var2 > var4) {
                  var2--;
               }

               if ((this.gc[dw][var2][var3] & 4) != 0) {
                  var1 = dw;
               }

               var9 += var8;
               if (var9 >= 65536) {
                  var9 -= 65536;
                  if (var3 < var5) {
                     var3++;
                  } else if (var3 > var5) {
                     var3--;
                  }

                  if ((this.gc[dw][var2][var3] & 4) != 0) {
                     var1 = dw;
                  }
               }
            }
         } else {
            int var10 = var6 * 65536 / var7;
            int var11 = 32768;

            while (var3 != var5) {
               if (var3 < var5) {
                  var3++;
               } else if (var3 > var5) {
                  var3--;
               }

               if ((this.gc[dw][var2][var3] & 4) != 0) {
                  var1 = dw;
               }

               var11 += var10;
               if (var11 >= 65536) {
                  var11 -= 65536;
                  if (var2 < var4) {
                     var2++;
                  } else if (var2 > var4) {
                     var2--;
                  }

                  if ((this.gc[dw][var2][var3] & 4) != 0) {
                     var1 = dw;
                  }
               }
            }
         }
      }

      if ((this.gc[dw][eR.ac >> 7][eR.ad >> 7] & 4) != 0) {
         var1 = dw;
      }

      return var1;
   }

   public int e(int var1, int var2, int var3) {
      int var4 = var1 >> 7;
      int var5 = var2 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
         int[][][] var6 = this.fC;
         int var7 = var1 & 127;
         int var8 = var2 & 127;
         int var9 = var7 * var6[var3][var4 + 1][var5] + (128 - var7) * var6[var3][var4][var5] >> 7;
         int var10 = var6[var3][var4][var5 + 1] * (128 - var7) + var7 * var6[var3][var4 + 1][var5 + 1] >> 7;
         return (128 - var8) * var9 + var8 * var10 >> 7;
      } else {
         return 0;
      }
   }

   public rs.p_runelite.p_a.C_i f(int var1, int var2, int var3) {
      if (var1 >= 128 && var2 >= 128 && var1 <= 13056 && var2 <= 13056) {
         var1 -= cJ;
         var2 -= cL;
         var3 -= cK;
         int var4 = this.cS;
         int var5 = this.cR;
         int var6 = rs.p_a.C_h.bA[var5];
         int var7 = rs.p_a.C_h.bB[var5];
         int var8 = rs.p_a.C_h.bA[var4];
         int var9 = rs.p_a.C_h.bB[var4];
         int var10 = var9 * var1 + var2 * var8 >> 16;
         var2 = var9 * var2 - var8 * var1 >> 16;
         int var11 = var7 * var3 - var2 * var6 >> 16;
         var2 = var3 * var6 + var2 * var7 >> 16;
         if (var2 >= 50) {
            return new rs.p_runelite.p_a.C_i(rs.p_l.C_E_uc.s + (var10 << 9) / var2, rs.p_l.C_E_uc.t + (var11 << 9) / var2);
         }
      }

      return null;
   }

   public Polygon a(rs.p_runelite.p_a.C_f var1, int var2) {
      int var3 = var1.b() - var2 * 128 / 2;
      int var4 = var1.c() - var2 * 128 / 2;
      int var5 = var1.b() + var2 * 128 / 2;
      int var6 = var1.c() + var2 * 128 / 2;
      byte[][][] var7 = this.gc;
      int var8 = var1.d();
      int var9 = var1.e();
      if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
         int var10 = dw;
         if (dw < 3 && (var7[1][var8][var9] & 2) == 2) {
            var10 = dw + 1;
         }

         int var11 = this.e(var3, var4, var10);
         int var12 = this.e(var5, var4, var10);
         int var13 = this.e(var5, var6, var10);
         int var14 = this.e(var3, var6, var10);
         rs.p_runelite.p_a.C_i var15 = this.f(var3, var4, var11);
         rs.p_runelite.p_a.C_i var16 = this.f(var5, var4, var12);
         rs.p_runelite.p_a.C_i var17 = this.f(var5, var6, var13);
         rs.p_runelite.p_a.C_i var18 = this.f(var3, var6, var14);
         if (var15 != null && var16 != null && var17 != null && var18 != null) {
            Polygon var19 = new Polygon();
            var19.addPoint(var15.a(), var15.b());
            var19.addPoint(var16.a(), var16.b());
            var19.addPoint(var17.a(), var17.b());
            var19.addPoint(var18.a(), var18.b());
            return var19;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public int V() {
      int var1 = this.c(dw, cL, cJ);
      return var1 - cK < 800 && (this.gc[dw][cJ >> 7][cL >> 7] & 4) != 0 ? dw : 3;
   }

   private void i(long var1) {
      try {
         if (var1 != 0L) {
            for (int var3 = 0; var3 < this.jD; var3++) {
               if (this.kP[var3] == var1) {
                  this.jD--;
                  fb = true;
                  System.arraycopy(this.kP, var3 + 1, this.kP, var3, this.jD - var3);
                  fv.a(74);
                  fv.a(var1);
                  return;
               }
            }
         }
      } catch (RuntimeException var4) {
         rs.p_v.C_a.e("47229, 3, " + var1 + ", " + var4.toString());
         throw new RuntimeException();
      }
   }

   public static void n(int var0) {
      fb = true;
      fL = var0;
      eM = true;
   }

   @Override
   public String getParameter(String var1) {
      return rs.p_v.C_a.h != null ? rs.p_v.C_a.h.getParameter(var1) : null;
   }

   private void a(boolean var1, int var2) {
      rs.p_v.C_a.k = var2;
      if (var1) {
         rs.p_v.C_a.j = "voladjust";
      }
   }

   public int a(rs.p_n.C_e var1, int var2) {
      if (var1.X != null && var2 < var1.X.length) {
         try {
            int[] var3 = var1.X[var2];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while (true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (var7 == 0) {
                  return var4;
               }

               if (var7 == 1) {
                  var8 = this.kN[var3[var5++]];
               }

               if (var7 == 2) {
                  var8 = this.eo[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = this.ka[var3[var5++]];
               }

               if (var7 == 4) {
                  rs.p_n.C_e var10 = rs.p_n.C_e.H[var3[var5++]];
                  int var11 = var3[var5++];
                  if (var11 == 20987 || var11 >= 0 && var11 < rs.p_d.C_k.ad) {
                     for (int var12 = 0; var12 < var10.az.length; var12++) {
                        if (var10.aw == 3214 && (var1.ah == 1151 || var1.ah == 12855 || var1.ah == 1689 || var1.ah == 1829 || var1.ah == 12050)) {
                           if (var10.az[var12] == 6820 || var10.az[var12] == 23112) {
                              var8 = 100000000;
                           }

                           if (var1.aw == 30306 && var10.az[var12] == 966) {
                              var8 = 100000000;
                           }
                        }

                        if (var10.az[var12] == var11 + 1) {
                           var8 += var10.ax[var12];
                        }

                        if (var11 == 2417 && (var10.az[var12] == 11792 || var10.az[var12] == 12905)) {
                           var8 += var10.ax[var12];
                        }

                        if (var11 == 2415
                           && (
                              var10.az[var12] == 21033
                                 || var10.az[var12] == 21034
                                 || var10.az[var12] == 21035
                                 || var10.az[var12] == 21036
                                 || var10.az[var12] == 25423
                                 || var10.az[var12] == 25424
                           )) {
                           var8 += var10.ax[var12];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = this.dP[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = lU[this.eo[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = this.dP[var3[var5++]] * 100 / 46875;
               }

               if (var7 == 8) {
                  var8 = eR.bc;
               }

               if (var7 == 9) {
                  for (int var20 = 0; var20 < rs.p_f.C_e.a; var20++) {
                     if (rs.p_f.C_e.d[var20]) {
                        var8 += this.eo[var20];
                     }
                  }
               }

               if (var7 == 10) {
                  rs.p_n.C_e var21 = rs.p_n.C_e.H[var3[var5++]];
                  int var24 = var3[var5++] + 1;
                  if (var24 >= 0 && var24 < rs.p_d.C_k.ad) {
                     for (int var27 = 0; var27 < var21.az.length; var27++) {
                        if (var24 == 1388 && var21.az[var27] == 20450) {
                           var8 = 999999999;
                           break;
                        }

                        if (var24 == 1388 && var21.az[var27] == 22853) {
                           var8 = 999999999;
                           break;
                        }

                        if (var24 == 1384 && var21.az[var27] == 20691) {
                           var8 = 999999999;
                           break;
                        }

                        if (var24 == 1384 && var21.az[var27] == 22854) {
                           var8 = 999999999;
                           break;
                        }

                        if (var24 == 1384 && var21.az[var27] == 20487) {
                           var8 = 999999999;
                           break;
                        }

                        if (var24 == 1384 && var21.az[var27] == 20811) {
                           var8 = 999999999;
                           break;
                        }

                        if (var21.az[var27] == var24) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = this.eY;
               }

               if (var7 == 12) {
                  var8 = this.ko;
               }

               if (var7 == 13) {
                  int var22 = this.dP[var3[var5++]];
                  int var25 = var3[var5++];
                  var8 = (var22 & 1 << var25) == 0 ? 0 : 1;
               }

               if (var7 == 14) {
                  int var23 = var3[var5++];
                  rs.p_d.C_y var26 = rs.p_d.C_y.a[var23];
                  int var28 = var26.b;
                  int var13 = var26.c;
                  int var14 = var26.d;
                  int var15 = fQ[var14 - var13];
                  var8 = this.dP[var28] >> var13 & var15;
               }

               if (var7 == 15) {
                  var9 = 1;
               }

               if (var7 == 16) {
                  var9 = 2;
               }

               if (var7 == 17) {
                  var9 = 3;
               }

               if (var7 == 18) {
                  var8 = (eR.ac >> 7) + eh;
               }

               if (var7 == 19) {
                  var8 = (eR.ad >> 7) + ei;
               }

               if (var7 == 20) {
                  var8 = var3[var5++];
               }

               if (var9 == 0) {
                  if (var6 == 0) {
                     var4 += var8;
                  }

                  if (var6 == 1) {
                     var4 -= var8;
                  }

                  if (var6 == 2 && var8 != 0) {
                     var4 /= var8;
                  }

                  if (var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var16) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   public void W() {
      int var1 = ah - 504;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
         var1 = 0;
      }

      if (C_C_uc.hP >= 5 && C_C_uc.hP <= 61 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.fx[1] = "View All";
         this.eI[1] = 999;
         this.eV = 2;
      } else if (C_C_uc.hP >= 71 && C_C_uc.hP <= 127 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.fx[1] = "Game chat: " + (this.gx == rs.p_i.C_a.z ? "@cya@Filtered" : "@gre@On");
         this.eI[1] = 1604;
         this.fx[2] = "View game chat";
         this.eI[2] = 1603;
         this.eV = 3;
      } else if (C_C_uc.hP >= 137 && C_C_uc.hP <= 193 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.fx[1] = "Off yell chat";
         this.eI[1] = 1602;
         this.fx[2] = "On yell chat";
         this.eI[2] = 1601;
         this.fx[3] = "View yell chat";
         this.eI[3] = 1600;
         this.eV = 4;
      } else if (C_C_uc.hP >= 203 && C_C_uc.hP <= 259 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
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
      } else if (C_C_uc.hP >= 269 && C_C_uc.hP <= 325 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
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
      } else if (C_C_uc.hP >= 335 && C_C_uc.hP <= 391 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.fx[1] = "Off clan chat";
         this.eI[1] = 1003;
         this.fx[2] = "On clan chat";
         this.eI[2] = 1001;
         this.fx[3] = "View clan chat";
         this.eI[3] = 1000;
         this.eV = 4;
      } else if (C_C_uc.hP >= 400 && C_C_uc.hP <= 456 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.fx[1] = "Off trade";
         this.eI[1] = 987;
         this.fx[2] = "Friends trade";
         this.eI[2] = 986;
         this.fx[3] = "On trade";
         this.eI[3] = 985;
         this.fx[4] = "View trade";
         this.eI[4] = 984;
         this.eV = 5;
      } else if (C_C_uc.hP >= 460 && C_C_uc.hP <= 516 && C_C_uc.hQ >= 482 + var1 && C_C_uc.hQ <= 503 + var1) {
         this.fx[1] = "News: " + (this.gv == rs.p_i.C_a.z ? "@cya@Filtered" : "@gre@On");
         this.eI[1] = 1007;
         this.fx[2] = "View news chat";
         this.eI[2] = 1006;
         this.eV = 3;
      }
   }

   private void bM() {
      if (this.eV >= 2 || this.gr != 0 || this.eW != 0) {
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
   }

   public void X() {
      if (br == 55761 && cH == 18559) {
         if (this.jo.endsWith("\n ")) {
            this.a(hP - 10, hQ - 10, " @yel@Task progress left:\n" + this.jo.substring(0, this.jo.length() - 2) + " ");
         } else {
            this.a(hP - 10, hQ - 10, " @yel@Task progress left:\n" + this.jo);
         }
      } else if (this.eV >= 2 || this.gr != 0 || this.eW != 0) {
         this.bM();
         String var1;
         if (this.gr == 1 && this.eV < 2) {
            var1 = "Use " + this.oN + " with...";
         } else if (this.eW == 1 && this.eV < 2) {
            var1 = this.nn + "...";
         } else {
            var1 = this.fx[this.eV - 1];
         }

         if (var1 != null && cH == 61000 && var1.contains("leaderboard")) {
            int var2 = hQ - 10;
            int var3 = hP - 10;
            if (var1.contains("Daily PK")) {
               this.b(var3, var2, " <img=16> " + var1 + "\nVarious daily leaderboards\nfor PKing, offering roster rewards!");
            } else {
               this.b(var3, var2, " <img=16> " + var1 + "\nCheck out which players and\nclans are dominating the arena!");
            }
         }

         if (var1 != null && cH == 54100) {
            int var9 = hQ - 10;
            int var21 = hP - 10;
            if (var1.contains("Select timed task")) {
               this.b(
                  var21,
                  var9,
                  " Monster hunter\nSlay an amount of wildy monsters in 25 mins.\n<item=23132>@or1@@yel@1/35@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!"
               );
            }

            if (var1.contains("Select boss hunter task")) {
               this.b(
                  var21,
                  var9,
                  " Boss hunter\nSlay an amount of wildy bosses in 25 mins.\n<item=23132>@or1@@yel@1/10@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!"
               );
            }

            if (var1.contains("Select man hunter")) {
               this.b(
                  var21,
                  var9,
                  " Bounty hunter\nKill 3-6 bounty hunter targets in 15 minutes.\nEarn a flat <img=125>@gre@+5@whi@ bonus for each Cursed Bounty kill\n<item=23132>@yel@1/5@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if not completed on time!"
               );
            }

            if (var1.contains("Select man slaughter task")) {
               this.b(
                  var21,
                  var9,
                  " Slaughter\nKill as many players as you can in 20 minutes!\n- The higher your killcount, the better your reward!\n- Kills while risking a <item=1484>Cursed orb count as 2 KC.\n- Reaching the kill cap (20) ends the task early.\n<item=23132>@yel@@yel@1/8@or1@ to receive @yel@Larran's keys@or1@ during task!\n@or2@Task is failed if you kill less than 3!"
               );
            }
         }

         if (var1 != null && cH == 47500 && var1.contains("View equipment bonuses")) {
            int var10 = hQ - 10;
            int var22 = hP - 10;
            this.b(
               var22, var10, " Equipment set bonuses\nDid you know you can also hover\nover items and hold the CTRL key\nto view stats of individual items?"
            );
         }

         if (var1 != null && cH == 60200) {
            int var11 = hQ - 10;
            int var23 = hP + 10;
            if (var1.contains("PayPal")) {
               this.b(var23, var11, " Payment method\nPay with credit card, debit\ncard, or with PayPal!");
            } else if (var1.contains("BMT")) {
               this.b(var23, var11, " Payment method\nPay with bitcoins (BitPay)\nor with Paysafe cards!");
            }
         }

         if (var1 != null && cH == 60050 && var1.contains("Vote for us")) {
            int var12 = hQ - 10;
            int var24 = hP - 10;
            this.b(var24, var12, " " + var1 + "\nand receive @yel@+2 vote points!\nType @yel@::claim@whi@ in-game after voting");
         }

         if (var1 != null && cH == 60600) {
            int var13 = hQ - 10;
            int var25 = hP - 10;
            if (var1.contains(" 10,000,000")) {
               this.b(
                  var25,
                  var13,
                  " @whi@Once the entire server has spent\n@yel@10,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Goodie bag."
               );
            } else if (var1.contains("15,000,000")) {
               this.b(
                  var25,
                  var13,
                  " @whi@Once the entire server has spent\n@yel@15,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Mystery box."
               );
            } else if (var1.contains("20,000,000")) {
               if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
                  var25 -= 100;
               }

               this.b(
                  var25,
                  var13,
                  " @whi@Once the entire server has spent\n@yel@20,000,000@whi@ tokens, all participants \nwho purchased at least @yel@10 rolls @whi@will\nreceive a bonus: @gre@Mystery chest."
               );
            } else if (var1.contains("Donator promotional shop")) {
               this.b(var25, var13, " Event lottery\nEnter for a chance to win\nrares from previous events!");
            } else if (var1.contains("Reset event items")) {
               this.b(var25, var13, " Reset exchange\nOnce you've earned all of the\nitems in the chest, you can reset\nthe stock and purchase more rolls!");
            }
         }

         if (br > 0 && rs.p_n.C_e.l(br) != null && rs.p_n.C_e.l(br).bx) {
            if (rs.p_n.C_e.l(br).by != null) {
               this.a(hP - 10, hQ - 10, " " + rs.p_n.C_e.l(br).by);
            } else {
               this.a(hP - 10, hQ - 10, " " + var1);
            }
         } else if (this.ef > 0 && rs.p_n.C_e.l(this.ef) != null && rs.p_n.C_e.l(this.ef).bx) {
            String var14 = rs.p_n.C_e.l(this.ef).by == null ? var1 : rs.p_n.C_e.l(this.ef).by;
            this.a(hP - 10, hQ - 10, " " + var14);
         }

         if (var1 != null && cH == 61150) {
            int var15 = hQ - 10;
            int var26 = hP - 10;
            if (var1.contains("Enter bloodcore lottery")) {
               this.b(
                  var26,
                  var15,
                  " Entering will also grant you:\n- 1 hour of blood lust @yel@(non-stackable)\n- 1 hour of +5% DR bonus @yel@(time stackable)\\n- 1 hour of +25% GP from PvM @yel@(time stackable)"
               );
            }
         }

         if (var1 != null && (var1.contains("@mag@Polymorphism") || var1.contains("@mag@Punch") || var1.contains("@mag@catch"))) {
            int var16 = hQ - 10;
            int var27 = hP - 10;
            this.b(var27, var16, " @whi@" + var1);
         }

         if (var1 != null && cH == 45900) {
            int var17 = hQ - 10;
            int var28 = hP - 10;
            if (var1.contains("Toggle gold auto")) {
               this.b(var28, var17, " @whi@Broken items will automatically       \nrepair on death, using gold\nstored in the coffer.");
            } else if (var1.contains("Toggle shard auto")) {
               this.b(var28, var17, " @whi@Broken items will automatically        \nrepair on death, using shards\nstored in the coffer.");
            }
         }

         if (var1 != null && var1.contains("@cya@Blood fountain")) {
            this.a(hP - 10, hQ - 10, " Blood fountain", "BLOOD_FOUNTAIN");
         } else if (var1 != null && var1.contains("Reward exchange @cya@")) {
            this.a(hP - 15, hQ - 10, " " + var1.split("@cya@")[1], "WORLD_EVENT_GUIDE");
         } else if (var1 != null && var1.contains("@yel@Mandrith")) {
            this.a(hP - 10, hQ - 10, " Statuettes and aritfacts", "MANDRITH");
         } else if (var1 != null && var1.contains("@yel@Blood slayer master")) {
            this.a(hP - 10, hQ - 10, " Blood slayer master", "BLOOD_SLAYER");
         } else if (var1 != null && var1.contains("@cya@Magic chest")) {
            this.a(hP - 10, hQ - 10, " Enchanting chest", "ENCHANTING_CHEST");
         } else if (var1 != null && var1.contains("@yel@Pet-keeper")) {
            this.a(hP - 10, hQ - 10, " Pet fusing", "PET_FUSING");
         } else if (var1 != null && !var1.contains("@cya@Summer oasis")) {
            this.jv = 0;
         }

         if (var1 != null && cH == 19600) {
            int var18 = hQ - 10;
            int var29 = hP - 10;
            if (var1.contains("Invite member")) {
               this.b(var29, var18, " Invite a member ");
            }

            if (var1.contains("Remove member")) {
               this.b(var29, var18, " Remove member ");
            }

            if (var1.contains("Refresh")) {
               this.b(var29, var18, " Refresh ");
            }

            if (var1.contains("Re-invite")) {
               this.b(var29 + 50, var18, " Reload last party  ");
            }

            if (var1.contains("Start raid")) {
               this.b(var29, var18, " Start raid ");
            }

            if (var1.contains("Leave/disband party")) {
               this.b(var29, var18, " Leave party ");
            }

            if (var1.contains("Adept difficulty")) {
               this.b(
                  var29,
                  var18,
                  " Adept difficulty\n- +5% rare reward chance\n- Bosses have 50% more HP\n- Bosses have 10% more defence\n- Bosses deal 5% more damage\n- You deal 5% less damage"
               );
            }

            if (var1.contains("Expert difficulty")) {
               this.b(
                  var29,
                  var18,
                  " Expert difficulty\n- +25% rare reward chance\n- Bosses have 200% more HP\n- Bosses have 20% more defence\n- Bosses deal 7.5% more damage\n- You deal 7.5% less damage"
               );
            }

            if (var1.contains("Master difficulty")) {
               this.b(
                  var29,
                  var18,
                  " Master difficulty\n- Receive +2 common rewards\n- +50% rare reward chance\n- Bosses have 300% more HP\n- Bosses have 30% more defence\n- Bosses deal 10% more damage\n- You deal 10% less damage"
               );
            }

            if (var1.contains("Grandmaster difficulty")) {
               this.b(
                  var29,
                  var18,
                  " Grandmaster difficulty\n- Receive +3 common rewards\n- +75% rare reward chance\n- Bosses have 400% more HP\n- Bosses have 50% more defence\n- Bosses deal 15% more damage\n- You deal 15% less damage"
               );
            }
         }

         if (var1 != null && cH == C_aD_mc.bI && !var1.toLowerCase().contains("close window") && !var1.toLowerCase().contains("@lre@")) {
            this.b(hP, hQ - 10, " @gre@" + var1 + " ");
         }

         if (this.eV > 1) {
            int var19 = this.eI[this.eV - 1];
            if (var19 == 1125
               || var19 == 632 && cH != -1
               || var19 == 78
               || var19 == 867
               || var19 == 431
               || var19 == 53
               || var19 == 291
               || var19 == 300
               || var19 == 291
               || var19 == 315 && cH == 22952) {
               int var30 = this.eJ[this.eV - 1];
               if (cH == 22952) {
                  if (var1.contains("Select item")) {
                     this.a(var30, var1, false);
                  }
               } else {
                  this.a(var30, var1, false);
               }
            }

            if (var19 == 447 || var19 == 847 || var19 == 493 || var19 == 454 || var19 == 74 || var19 == 539) {
               int var31 = this.eJ[this.eV - 1];
               String var4 = " " + rs.p_d.C_k.f(var31).w;
               this.a(var31, var1, true);
            }
         }

         if (var1 == null || cH != 64272 || !var1.contains("Collect reward") && !var1.contains("Collect all rewards")) {
            if (var1 != null && var1.contains("@lre@") && !var1.contains("Take") && rs.p_f.C_a.aC && ag && !rs.p_s.p_l.C_c.b) {
               boolean var20 = false;

               for (int var32 = 0; var32 < this.fx.length; var32++) {
                  if (this.fx[var32] != null
                     && (this.fx[var32].contains("Drop") || this.fx[var32].contains("Destroy") || this.fx[var32].contains("Release"))
                     && cH != 23000) {
                     var20 = true;
                  }
               }

               if (var20) {
                  String[] var33 = this.fx[this.eV - 1].split(" ");
                  var33[0] = "Drop";
                  String var34 = "";

                  for (String var8 : var33) {
                     var34 = var34 + var8 + " ";
                  }

                  var34 = var34.trim();
                  var1 = var34;
               }
            }
         } else {
            this.b(hP - 10, hQ - 10, " " + var1 + "  ");
         }

         if (this.eV > 2) {
            var1 = var1 + "@whi@ / " + (this.eV - 2) + " more options";
         }

         this.gn.b(var1, 4 + (!ai() ? 4 : 0), 15 + (!ai() ? 4 : 0), 16777215, 0);
      }
   }

   public void a(int var1, String var2, boolean var3) {
      if (var1 >= 0 && var1 <= rs.p_d.C_k.a) {
         rs.p_d.C_k var4 = rs.p_d.C_k.f(var1);
         if (var4 != null) {
            boolean var5 = ed == 197;
            if (!rs.p_s.p_s.C_b.c || !var5 || cH == 15106) {
               if (var4.F > 0 && var4.p == 799) {
                  var1 = var4.F;
                  var4 = rs.p_d.C_k.f(var4.F);
               }

               String var6 = " " + rs.p_d.C_w.a(var1, rs.p_d.C_k.f(var1).w);
               if (rs.p_s.p_s.C_b.k && rs.p_t.p_a.C_g.a.a_(var1)) {
                  var6 = var6 + " <img=370>";
               }

               String var7 = var6;
               if (!var3 || rs.p_s.p_s.C_b.h) {
                  var7 = var3 ? C_q.a(var6) : rs.p_d.C_m.a(var6, var1);
               }

               if (var3 && var7 == null && rs.p_s.p_s.C_b.h) {
                  var7 = rs.p_d.C_m.a(var6, var1);
               }

               boolean var8 = false;
               boolean var9 = false;
               if (cH == 23000 && !rs.p_s.p_s.C_b.f) {
                  var9 = true;
               }

               if (cH == 15106 && !rs.p_s.p_s.C_b.g) {
                  var9 = true;
               }

               if (var3 && cH == -1 && !rs.p_s.p_s.C_b.h) {
                  var9 = true;
               }

               if (var3 && cH == -1 && var4 != null && var4.ax) {
                  var9 = true;
               }

               if (var5 && rs.p_s.p_s.C_b.d) {
                  var9 = true;
               }

               if (var3 && var7 == null && !var9) {
                  var8 = true;
               }

               if (var9) {
                  var7 = var6;
               }

               if (!var3 || cH == 15106 || var7 != null) {
                  if (rs.p_s.p_s.C_b.b) {
                     if (rs.p_s.p_s.C_b.i || !var3 || cH == 15106) {
                        if (var7 == null) {
                           var7 = var6;
                        }

                        boolean var10 = false;
                        if (!var3 || cH == 15106 || rs.p_s.p_s.C_b.i) {
                           this.A(var1);
                           if (this.jq == var1) {
                              var10 = true;
                              if (!ch) {
                                 var7 = var7 + "\nHold @yel@CTRL@whi@ to view stats";
                              }
                           }
                        }

                        if (!var3 || !var8 || var10) {
                           if (var2 != null) {
                              if (var2.contains("Select tab")) {
                                 var7 = " @whi@Select tab @lre@" + var4.w;
                                 var10 = false;
                              }

                              if (var2.contains("<img=83> Info")) {
                                 var7 = " <img=83> Info" + var7;
                                 var10 = false;
                              }
                           }

                           if (!var3 || !var8 || var10) {
                              if (ch && var10) {
                                 String var11 = this.jp.get(this.jq);
                                 if (var11 == null) {
                                    if (this.js != this.jq || System.currentTimeMillis() - this.jr >= 1000L) {
                                       this.js = this.jq;
                                       ap = "::equipstr " + this.js;
                                       this.jr = System.currentTimeMillis();
                                    }

                                    var11 = "Loading, please wait..";
                                    this.b(0, 0, var7 + "\n" + var11);
                                 } else {
                                    String[] var12 = this.jp.get(this.jq).split(" ");
                                    var11 = "                  <u=16748608>@lre@Attack@whi@</u>      <u=16748608>@lre@Defence@whi@</u>  \n<col=FFBD5C>Stab:\n<col=FFBD5C>Slash:\n<col=FFBD5C>Crush:\n<col=FFBD5C>Magic:\n<col=FFBD5C>Range:\n\n<u=16748608>@lre@Other Bonuses</u> \n<col=FFBD5C>Strength:@whi@ "
                                       + var12[11].replace("@gre@", " @gre@").replace("@red@", " @red@")
                                       + "\n<col=FFBD5C>Prayer:@whi@ "
                                       + var12[12].replace("@gre@", " @gre@").replace("@red@", " @red@")
                                       + "\n<col=FFBD5C>Range strength:@whi@ "
                                       + var12[13].replace("@gre@", " @gre@").replace("@red@", " @red@")
                                       + "\n<col=FFBD5C>Magic damage:@whi@ +"
                                       + var12[14].replace("@g3re@ ", " @gre@").replaceAll("@red@", " @red@");
                                    this.a(0, 0, var6 + "\n" + var11, var12, false);
                                 }
                              } else if (!var3 || var7 != null) {
                                 this.b(0, 0, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean k(int var1, int var2) {
      int var3 = var1 >> 6;
      int var4 = var2 >> 6;
      int var5 = var3 * 256 + var4;
      if (var5 == 11601) {
         return false;
      } else if (var5 == 12946 || var5 == 13202) {
         return false;
      } else if (var5 == 11877) {
         return true;
      } else if (var5 == 9811) {
         return true;
      } else if (var5 == 11322) {
         return true;
      } else if (var5 == 13136
         || var5 == 13393
         || var5 == 13394
         || var5 == 13138
         || var5 == 13139
         || var5 == 13395
         || var5 == 13396
         || var5 == 13140
         || var5 == 13141
         || var5 == 13397
         || var5 == 12889) {
         return true;
      } else if (var5 == 12346 || var5 == 12602) {
         return false;
      } else if (var5 == 12605) {
         return false;
      } else if (var5 == 12861 && var1 <= 3215) {
         return false;
      } else if (var1 >= 3007 && var1 <= 3047 && var2 >= 3856 && var2 <= 3903) {
         return true;
      } else if (var1 >= 2945 && var1 <= 2959 && var2 >= 3813 && var2 <= 3827) {
         return true;
      } else if (var1 >= 3331 && var1 <= 3373 && var2 <= 3854) {
         return false;
      } else if (var5 == 12347) {
         return false;
      } else if (var5 == 12603 && var1 <= 3150) {
         return false;
      } else if (var5 == 6810) {
         return true;
      } else if (var5 == 13131 || var5 == 13387) {
         return true;
      } else if (var1 >= 2744 && var1 <= 2993 && var2 >= 2872 && var2 <= 2956) {
         return true;
      } else if (var5 == 11668) {
         return true;
      } else if (var5 == 12703 || var5 == 12702 || var5 == 12701 || var5 == 12959 || var5 == 12958 || var5 == 12957) {
         return true;
      } else if (var5 == 9023) {
         return true;
      } else if (var5 == 11412 || var5 == 11562 || var5 == 9875 || var5 == 11310 || var5 == 11054 || var5 == 11566) {
         return true;
      } else if (var5 == 9369) {
         return true;
      } else if (var5 == 9008 || var5 == 9007) {
         return true;
      } else if (var5 == 13462) {
         return true;
      } else if (var5 == 9033) {
         return true;
      } else if (var5 == 10036) {
         return true;
      } else if (var5 == 9802) {
         return true;
      } else {
         return var5 != 14235 && var5 != 13979
            ? var1 >= 1721 && var1 <= 1791 && var2 >= 5123 && var2 <= 5249
               || var1 >= 3029 && var1 <= 3393 && var2 >= 3759 && var2 <= 3903
               || var1 >= 2250 && var1 <= 2280 && var2 >= 4670 && var2 <= 4720
               || var1 >= 3198 && var1 <= 3380 && var2 >= 3904 && var2 <= 3970
               || var1 >= 3191 && var1 <= 3326 && var2 >= 3510 && var2 <= 3759
               || var1 >= 2987 && var1 <= 3006 && var2 >= 3912 && var2 <= 3937
               || var1 >= 2245 && var1 <= 2295 && var2 >= 4675 && var2 <= 4720
               || var1 >= 2481 && var1 <= 2563 && var2 >= 10138 && var2 <= 10175
               || var1 >= 3006 && var1 <= 3071 && var2 >= 3602 && var2 <= 3710
               || var1 >= 3134 && var1 <= 3192 && var2 >= 3519 && var2 <= 3646
               || var1 >= 2815 && var1 <= 2966 && var2 >= 5240 && var2 <= 5375
               || var1 >= 2840 && var1 <= 2950 && var2 >= 5190 && var2 <= 5230
               || var1 >= 3547 && var1 <= 3555 && var2 >= 9690 && var2 <= 9699
               || var1 >= 2970 && var1 <= 3000 && var2 >= 4365 && var2 <= 4400
               || var2 >= 4423 && var2 <= 4468 && var1 >= 2885 && var1 <= 3934
               || var1 >= 3195 && var1 <= 3327 && var2 >= 3520 && var2 <= 3970
               || var1 >= 2376 && 5127 >= var2 && var1 <= 2422 && 5168 <= var2
               || var1 >= 2374 && var2 >= 5129 && var1 <= 2424 && var2 <= 5168
               || var1 >= 2622 && var2 >= 5696 && var1 <= 2573 && var2 <= 5752
               || var1 >= 2368 && var2 >= 3072 && var1 <= 2431 && var2 <= 3135
               || var1 >= 2365 && var2 >= 9470 && var1 <= 2436 && var2 <= 9532
               || var1 >= 2948 && var2 >= 5537 && var1 <= 3071 && var2 <= 5631
               || var1 >= 2756 && var2 >= 5537 && var1 <= 2879 && var2 <= 5631
               || var1 >= 4159 && var2 >= 5687 && var1 <= 4220 && var2 <= 5733
               || var1 >= 3011 && var1 <= 3132 && var2 >= 10052 && var2 <= 10175 && (var2 >= 10066 || var1 >= 3094)
               || var1 <= 2420 && var1 >= 2337 && var2 <= 3872 && var2 >= 3842
            : true;
      }
   }

   public void Y() {
      boolean var1 = this.lV == 2;
      int var2 = !ai() ? 517 : 0;
      if (var1) {
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
            this.iu.f(2 + var2, 0);
         } else {
            this.H[44].f(ai - 181, 0);
            this.H[45].f(ai - 158, 7);
         }

         this.v.a();
      } else {
         int var3 = this.ft + this.oa & 2047;
         int var4 = 48 + eR.ac / 32;
         int var5 = 464 - eR.ad / 32;
         this.aT
            .a(
               151,
               var3,
               this.fO,
               256 + this.fh,
               this.eq,
               var5,
               rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 9 : 7,
               rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? var2 + 54 : ai - 158,
               146,
               var4
            );

         for (int var6 = 0; var6 < this.mz; var6++) {
            int var7 = this.mA[var6] * 4 + 2 - eR.ac / 32;
            int var8 = this.mB[var6] * 4 + 2 - eR.ad / 32;
            int var9 = this.mA[var6] + eh;
            int var10 = this.mB[var6] + ei;
            if ((var9 != 3086 || var10 != 3481)
               && (var9 != 3092 || var10 != 3488)
               && (var9 != 3089 || var10 != 3474)
               && (var9 != 3086 || var10 != 3469)
               && (var9 != 3077 || var10 != 3496)
               && (var9 != 3077 || var10 != 3489)
               && (var9 != 3084 || var10 != 3502)) {
               this.a(this.no[var6], var7, var8);
            }
         }

         this.a(this.fI, (3094 - eh) * 4 + 2 - eR.ac / 32, (3472 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.fI, (3077 - eh) * 4 + 2 - eR.ac / 32, (3496 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.fG, (3080 - eh) * 4 + 2 - eR.ac / 32, (3492 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.fH, (3108 - eh) * 4 + 2 - eR.ac / 32, (3494 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[109], (3095 - eh) * 4 + 2 - eR.ac / 32, (3506 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[189], (3082 - eh) * 4 + 2 - eR.ac / 32, (3486 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[92], (3083 - eh) * 4 + 2 - eR.ac / 32, (3499 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.fK, (3087 - eh) * 4 + 2 - eR.ac / 32, (3507 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[64], (3086 - eh) * 4 + 2 - eR.ac / 32, (3484 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[5], (4059 - eh) * 4 + 2 - eR.ac / 32, (3373 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[16], (4064 - eh) * 4 + 2 - eR.ac / 32, (3349 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(21)).b()], (4071 - eh) * 4 + 2 - eR.ac / 32, (3367 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[16], (4063 - eh) * 4 + 2 - eR.ac / 32, (3077 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[16], (4069 - eh) * 4 + 2 - eR.ac / 32, (3086 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[16], (4062 - eh) * 4 + 2 - eR.ac / 32, (3094 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[5], (4082 - eh) * 4 + 2 - eR.ac / 32, (3070 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[152], (2952 - eh) * 4 + 2 - eR.ac / 32, (2900 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[152], (2860 - eh) * 4 + 2 - eR.ac / 32, (2943 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[152], (2788 - eh) * 4 + 2 - eR.ac / 32, (2958 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[152], (2920 - eh) * 4 + 2 - eR.ac / 32, (2920 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[152], (2854 - eh) * 4 + 2 - eR.ac / 32, (2919 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[152], (2794 - eh) * 4 + 2 - eR.ac / 32, (2907 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[152], (2876 - eh) * 4 + 2 - eR.ac / 32, (2912 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[152], (2928 - eh) * 4 + 2 - eR.ac / 32, (2733 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[118], (2881 - eh) * 4 + 2 - eR.ac / 32, (2926 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[51], (3206 - eh) * 4 + 2 - eR.ac / 32, (9571 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[51], (3220 - eh) * 4 + 2 - eR.ac / 32, (9554 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (3226 - eh) * 4 + 2 - eR.ac / 32, (9542 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[50], (3294 - eh) * 4 + 2 - eR.ac / 32, (3858 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[50], (3190 - eh) * 4 + 2 - eR.ac / 32, (3793 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[50], (3317 - eh) * 4 + 2 - eR.ac / 32, (3760 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1505 - eh) * 4 + 2 - eR.ac / 32, (4385 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1506 - eh) * 4 + 2 - eR.ac / 32, (4383 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1532 - eh) * 4 + 2 - eR.ac / 32, (4412 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1534 - eh) * 4 + 2 - eR.ac / 32, (4394 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1529 - eh) * 4 + 2 - eR.ac / 32, (4358 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1504 - eh) * 4 + 2 - eR.ac / 32, (4354 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1481 - eh) * 4 + 2 - eR.ac / 32, (4356 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1475 - eh) * 4 + 2 - eR.ac / 32, (4378 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1479 - eh) * 4 + 2 - eR.ac / 32, (4408 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (1503 - eh) * 4 + 2 - eR.ac / 32, (4406 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[118], (3376 - eh) * 4 + 2 - eR.ac / 32, (3892 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (2950 - eh) * 4 + 2 - eR.ac / 32, (3925 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[182], (3167 - eh) * 4 + 2 - eR.ac / 32, (9572 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (3999 - eh) * 4 + 2 - eR.ac / 32, (2501 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (4000 - eh) * 4 + 2 - eR.ac / 32, (2529 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[50], (4000 - eh) * 4 + 2 - eR.ac / 32, (2554 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[50], (3977 - eh) * 4 + 2 - eR.ac / 32, (2543 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[50], (4022 - eh) * 4 + 2 - eR.ac / 32, (2544 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (3286 - eh) * 4 + 2 - eR.ac / 32, (3812 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (3256 - eh) * 4 + 2 - eR.ac / 32, (9348 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (3261 - eh) * 4 + 2 - eR.ac / 32, (9401 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (3578 - eh) * 4 + 2 - eR.ac / 32, (9927 - ei) * 4 + 2 - eR.ad / 32);
         this.a(fE[194], (3475 - eh) * 4 + 2 - eR.ac / 32, (9938 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[5], (3093 - eh) * 4 + 2 - eR.ac / 32, (3510 - ei) * 4 + 2 - eR.ad / 32);
         this.a(this.me[51], (3102 - eh) * 4 + 2 - eR.ac / 32, (3488 - ei) * 4 + 2 - eR.ad / 32);
         if (rs.p_l.p_e.C_f.a.a(this)) {
            this.a(fE[73], (1510 - eh) * 4 + 2 - eR.ac / 32, (4363 - ei) * 4 + 2 - eR.ad / 32);
         }

         for (int var17 = 0; var17 < 104; var17++) {
            for (int var24 = 0; var24 < 104; var24++) {
               C_h var31 = this.jH[dw][var17][var24];
               if (var31 != null) {
                  int var36 = var17 * 4 + 2 - eR.ac / 32;
                  int var39 = var24 * 4 + 2 - eR.ad / 32;
                  this.a(this.mC, var36, var39);
               }
            }
         }

         for (int var18 = 0; var18 < this.cB; var18++) {
            rs.p_a.C_j var25 = this.cA[this.cC[var18]];
            if (var25 != null && var25.l()) {
               rs.p_d.C_d var32 = var25.aG;
               if (var32.G != null) {
                  var32 = var32.c();
               }

               if (var32 != null && var32.F && var32.C) {
                  int var37 = var25.ac / 32 - eR.ac / 32;
                  int var40 = var25.ad / 32 - eR.ad / 32;
                  if (var32.x == 3261L
                     || var32.x == 3262L
                     || var32.x == 6100L
                     || var32.x == 3066L
                     || var32.x == 6748L
                     || var32.x == 6747L
                     || var32.x == 6749L
                     || var32.x == 1951L) {
                     this.a(this.mG, var37, var40);
                  } else if (var32.x == 5413L
                     || var32.x == 5871L
                     || var32.x == 1901L
                     || var32.x == 1902L
                     || var32.x == 1904L
                     || var32.x == 1905L
                     || var32.x == 6735L
                     || var32.x == 1950L
                     || var32.x == 1931L
                     || var32.x == 1930L) {
                     this.a(this.mF, var37, var40);
                  } else if (var32.x == 692L) {
                     this.a(fE[152], var37, var40);
                  } else if (var32.x == 1472L) {
                     this.a(fE[248], var37, var40);
                  } else if (var32.x == 4704L) {
                     this.a(fE[229], var37, var40);
                  } else if (var32.x == 5399L) {
                     this.a(this.fJ, var37, var40);
                  } else if (var32.x == 6730L || var32.x == 6999L || var32.x == 6729L) {
                     this.a(this.mH, var37, var40);
                  } else if (var32.x == 5328L || var32.x == 8341L || var32.x == 8095L) {
                     this.a(this.mI, var37, var40);
                  } else if (var32.x != 8085L && var32.x != 8086L && var32.x != 8087L && var32.x != 8150L && var32.x != 8151L) {
                     if ((var32.x < 6736L || var32.x > 6739L)
                        && var32.x != 7284L
                        && var32.x != 1839L
                        && (var32.x < 727L || var32.x > 730L)
                        && (var32.x < 3682L || var32.x > 3694L)) {
                        if (var32.x != 8495L
                           && var32.x != 3794L
                           && var32.x != 3795L
                           && var32.x != 3796L
                           && var32.x != 3797L
                           && (var32.x < 7072L || var32.x > 7076L)) {
                           if (var32.S > 0) {
                              this.a(fE[var32.S], var37, var40);
                           } else {
                              this.a(this.mD, var37, var40);
                           }
                        } else {
                           this.a(this.mL, var37, var40);
                        }
                     } else {
                        this.a(this.mK, var37, var40);
                     }
                  } else {
                     this.a(this.mJ, var37, var40);
                  }
               }
            }
         }

         for (int var19 = 0; var19 < this.ku; var19++) {
            rs.p_a.C_k var26 = kw_do[this.kv[var19]];
            if (var26 != null && var26.l() && (var26.aC != 25 || rs.p_f.C_a.bp || var26.m != -1) && (!rs.p_l.p_e.C_f.a.e() || var26.aT == null)) {
               int var33 = var26.ac / 32 - eR.ac / 32;
               int var38 = var26.ad / 32 - eR.ad / 32;
               boolean var41 = false;
               boolean var11 = false;
               boolean var12 = false;
               boolean var13 = false;
               if (eR.bh >= 1 && eR.bh <= 4) {
                  var13 = var26.bh == eR.bh;
                  if (var26.bh == 1 && eR.bh == 3 || var26.bh == 3 && eR.bh == 1) {
                     var13 = true;
                  }

                  if (var26.bh == 2 && eR.bh == 4 || var26.bh == 4 && eR.bh == 2) {
                     var13 = true;
                  }
               } else {
                  for (int var14 = 0; var14 < this.ju.length; var14++) {
                     if (this.ju[var14] != null && this.ju[var14].equalsIgnoreCase(var26.aZ)) {
                        var12 = true;
                     }
                  }

                  long var42 = C_O_uc.a(var26.aZ);

                  for (int var16 = 0; var16 < this.kA; var16++) {
                     if (var42 == this.lg[var16] && this.jG[var16] != 0) {
                        var41 = true;
                        break;
                     }
                  }

                  if (eR.aX != 0 && var26.aX != 0 && eR.aX == var26.aX) {
                     var13 = true;
                  }
               }

               if (var12 && !var41) {
                  this.a(this.mO, var33, var38);
               } else if (var41) {
                  this.a(this.mN, var33, var38);
               } else if (var13) {
                  this.a(this.mQ, var33, var38);
               } else {
                  this.a(this.mM, var33, var38);
               }
            }
         }

         if (this.jZ != 0 && ff % 20 < 10) {
            if (this.jZ == 1 && this.of >= 0 && this.of < this.cA.length) {
               rs.p_a.C_j var20 = this.cA[this.of];
               if (var20 != null) {
                  int var27 = var20.ac / 32 - eR.ac / 32;
                  int var34 = var20.ad / 32 - eR.ad / 32;
                  this.b(this.kh, var34, var27);
               }
            }

            if (this.jZ == 2) {
               int var21 = (this.kW - eh) * 4 + 2 - eR.ac / 32;
               int var28 = (this.kX - ei) * 4 + 2 - eR.ad / 32;
               this.b(this.kh, var28, var21);
            }

            if (this.jZ == 10 && this.kV >= 0 && this.kV < kw_do.length) {
               rs.p_a.C_k var22 = kw_do[this.kV];
               if (var22 != null) {
                  int var29 = var22.ac / 32 - eR.ac / 32;
                  int var35 = var22.ad / 32 - eR.ad / 32;
                  this.b(this.kh, var35, var29);
               }
            }
         }

         if (this.gd != 0) {
            int var23 = this.gd * 4 + 2 - eR.ac / 32;
            int var30 = this.ge * 4 + 2 - eR.ad / 32;
            this.a(this.kg, var23, var30);
         }

         rs.p_l.C_c.a(3, rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 83 : 80, rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? var2 + 127 : ai - 88, 16777215, 3);
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
            this.H[19].f(0 + var2, 0);
            this.H[19].f(2 + var2, 0);
         } else {
            this.H[44].f(ai - 181, 0);
         }

         this.ng
            .a(33, this.ft, this.mp, 256, this.ln, rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 25 : 24, 4, rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? var2 + 29 : ai - 176, 33, 25);
         this.v.a();
         if (this.cY == 3 && ff % 20 < 10 && rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
            this.cX.f(175, 53);
         }
      }
   }

   private void a(rs.p_a.C_c var1, int var2) {
      this.g(var1.ac, var2, var1.ad);
   }

   public void g(int var1, int var2, int var3) {
      if (var1 >= 128 && var3 >= 128 && var1 <= 13056 && var3 <= 13056) {
         int var4 = this.c(dw, var3, var1) - var2;
         var1 -= cJ;
         var4 -= cK;
         var3 -= cL;
         int var5 = rs.p_a.C_h.bA[this.cR];
         int var6 = rs.p_a.C_h.bB[this.cR];
         int var7 = rs.p_a.C_h.bA[this.cS];
         int var8 = rs.p_a.C_h.bB[this.cS];
         int var9 = var3 * var7 + var1 * var8 >> 16;
         var3 = var3 * var8 - var1 * var7 >> 16;
         var9 = var4 * var6 - var3 * var5 >> 16;
         var3 = var4 * var5 + var3 * var6 >> 16;
         if (var3 >= 50) {
            this.dN = (ai() ? 4 : 4) + rs.p_l.C_E_uc.s + (var9 << 9) / var3;
            this.dO = rs.p_l.C_E_uc.t + (var9 << 9) / var3;
         } else {
            this.dN = -1;
            this.dO = -1;
         }
      } else {
         this.dN = -1;
         this.dO = -1;
      }
   }

   private void bN() {
      if (this.nS != 0) {
         int var1 = 0;
         if (this.eN != 0L || rs.p_f.C_a.aA && this.co != null && !this.co.equals("")) {
            var1 = 1;
         }

         for (int var2 = 0; var2 < 200; var2++) {
            if (this.dC[var2] != null) {
               int var3 = this.dz[var2];
               String var4 = this.dB[var2];
               int var5 = this.dA[var2];
               short var6 = 175;
               if ((var3 == 3 || var3 == 7) && (var3 == 7 || this.cE == 0 || this.cE == 1 && this.i(var4))) {
                  int var7 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 4 : 0;
                  int var8 = 329 - var1 * 13;
                  if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
                     var8 = ah - var6 - var1 * 13;
                  }

                  if (C_C_uc.hP > 4 && C_C_uc.hQ - var7 > var8 - 10 && C_C_uc.hQ - var7 <= var8 + 3) {
                     int var9 = this.gi.a("From:  " + var4 + this.dC[var2]) + 25;
                     if (var9 > 450) {
                        var9 = 450;
                     }

                     if (C_C_uc.hP < 4 + var9) {
                        if (cT == 1 || cT == 2) {
                           this.fx[this.eV] = "Report abuse @whi@" + var4;
                           this.eI[this.eV] = 2606;
                           this.eV++;
                        }

                        this.fx[this.eV] = "Add ignore @whi@" + var4;
                        this.eI[this.eV] = 2042;
                        this.eV++;
                        this.fx[this.eV] = "Add friend @whi@" + var4;
                        this.eI[this.eV] = 2337;
                        this.eV++;
                     }
                  }

                  if (++var1 >= 5) {
                     return;
                  }
               }

               if ((var3 == 5 || var3 == 6) && this.cE < 2) {
                  if (++var1 >= 5) {
                     return;
                  }
               }
            }
         }
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      C_N_uc var11 = null;
      if (!var10) {
         for (C_N_uc var12 = (C_N_uc)this.nL.b(); var12 != null; var12 = (C_N_uc)this.nL.d()) {
            if (var12.h == var7 && var12.j == var8 && var12.k == var5 && var12.i == var4) {
               var11 = var12;
               break;
            }
         }
      }

      if (var11 == null) {
         var11 = new C_N_uc();
         var11.h = var7;
         var11.i = var4;
         var11.j = var8;
         var11.k = var5;
         this.a(var11);
         this.nL.a(var11);
      }

      var11.a = var2;
      var11.f = var6;
      var11.b = var3;
      var11.o = var9;
      var11.g = var1;
   }

   public boolean b(rs.p_n.C_e var1) {
      if (var1.aq == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.aq.length; var2++) {
            int var3 = this.a(var1, var2);
            int var4 = var1.I[var2];
            if ((
                  var1.aw == 957
                     || var1.aw == 915
                     || var1.aw == 12464
                     || var1.aw == 12466
                     || var1.aw == 12468
                     || var1.aw == 12470
                     || var1.aw == 68510
                     || var1.aw == 12480
                     || var1.aw == 12482
                     || var1.aw == 39975
                     || var1.aw == 39974
                     || var1.aw == 39973
                     || var1.aw == 39972
                     || var1.aw == 19099
                     || var1.aw == 19097
                     || var1.aw == 19095
                     || var1.aw == 19093
                     || var1.aw == 19091
                     || var1.aw == 19089
                     || var1.aw == 19087
                     || var1.aw == 19085
                     || var1.aw == 19083
                     || var1.aw == 12472
                     || var1.aw == 12474
                     || var1.aw == 19081
                     || var1.aw == 19079
                     || var1.aw == 19077
                     || var1.aw == 19075
                     || var1.aw == 19073
                     || var1.aw == 19071
               )
               && var3 == 1) {
               return true;
            }

            if ((var1.aw == 22584 || var1.aw == 22586) && !C_aG_mc.c) {
               return true;
            }

            if (var1.aq[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var1.aq[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var1.aq[var2] == 4) {
               if (var3 == var4) {
                  return false;
               }
            } else if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private DataInputStream j(String var1) {
      if (this.jL != null) {
         try {
            this.jL.close();
         } catch (Exception var4) {
         }

         this.jL = null;
      }

      this.jL = this.b(43595);
      this.jL.setSoTimeout(10000);
      InputStream var2 = this.jL.getInputStream();
      OutputStream var3 = this.jL.getOutputStream();
      var3.write(("JAGGRAB /" + var1 + "\n\n").getBytes());
      return new DataInputStream(var2);
   }

   private void a(rs.p_l.C_F_uc var1) {
      int var2 = hQ - 15;
      int var3 = hP - 10;
      if (this.jv > 10) {
         int var4 = var3 - 110;
         int var5 = var2 - 100;
         var1.a(var4, var5, (this.jv - 10) * 3);
         byte var6 = 1;
         rs.p_l.C_c.e(var4 - var6, 251 + var6 * 2, 219 + var6 * 2, 2367511, var5 - var6, (this.jv - 10) * 3);
      }

      if (this.jv > 10) {
         int var7 = rs.p_l.C_h.ap;
         rs.p_l.C_h.ap = (this.jv - 10) * 3;
         this.b(
            var3 + 16,
            var2 + 5,
            "       <img=50> @yel@Summer Battlefield Minigame <img=50>\nYou'll be auto-assigned to one of the teams\nin a war between Wizards vs Warriors. Join as@whi@\na pvp @or2@<img=53> Fighter@whi@ or non-pvp @gre@<img=49> Medic!"
         );
         rs.p_l.C_h.ap = var7;
      }
   }

   private void d(rs.p_x.C_e var1) {
      int var2 = var1.k(8);
      if (rs.p_f.C_a.d) {
         cx.add("\t-> newPlayerCount=" + var2);
      }

      if (var2 < this.ku) {
         for (int var3 = var2; var3 < this.ku; var3++) {
            this.jO[this.jN++] = this.kv[var3];
         }
      }

      if (var2 > this.ku) {
         rs.p_v.C_a.e(this.fk + " Too many players");
         throw new RuntimeException("eek");
      } else {
         this.ku = 0;
         int var12 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            int var5 = this.kv[var4];
            rs.p_a.C_k var6 = kw_do[var5];
            int var7 = var1.k(1);
            if (rs.p_f.C_a.d) {
               cx.add("\t\t-> [" + var5 + "] j1=" + var7);
            }

            if (var7 == 0) {
               this.kv[this.ku++] = var5;
               var6.P = ff;
            } else {
               int var8 = var1.k(2);
               if (rs.p_f.C_a.d) {
                  cx.add("\t\t-> [" + var5 + "] k1=" + var8);
               }

               if (var8 == 0) {
                  this.kv[this.ku++] = var5;
                  var6.P = ff;
                  this.kx[this.kw++] = var5;
               } else if (var8 == 1) {
                  this.kv[this.ku++] = var5;
                  var6.P = ff;
                  int var9 = var1.k(3);
                  var6.a(false, var9);
                  int var10 = var1.k(1);
                  if (rs.p_f.C_a.d) {
                     cx.add("\t\t-> [" + var5 + "] direction=" + var9 + ", updateRequired=" + var10);
                  }

                  if (var10 == 1) {
                     this.kx[this.kw++] = var5;
                  }
               } else if (var8 == 2) {
                  var12++;
                  this.kv[this.ku++] = var5;
                  var6.P = ff;
                  int var13 = var1.k(3);
                  var6.a(true, var13);
                  int var14 = var1.k(3);
                  var6.a(true, var14);
                  int var11 = var1.k(1);
                  if (rs.p_f.C_a.d) {
                     cx.add("\t\t-> [" + var5 + "] firstDirection=" + var13 + ", secondDirection=" + var14 + ", updaterequired=" + var11);
                  }

                  if (var11 == 1) {
                     this.kx[this.kw++] = var5;
                  }
               } else if (var8 == 3) {
                  this.jO[this.jN++] = var5;
               }
            }
         }
      }
   }

   private void h(boolean var1) {
      this.G.a();
   }

   @Override
   public void Z() {
      this.ga = true;
   }

   private void c(rs.p_x.C_e var1, int var2) {
      if (var2 == 84) {
         int var37 = var1.y();
         int var49 = this.oE + (var37 >> 4 & 7);
         int var61 = this.oF + (var37 & 7);
         int var72 = var1.A();
         int var83 = var1.A();
         int var93 = var1.A();
         if (var49 >= 0 && var61 >= 0 && var49 < 104 && var61 < 104) {
            C_h var101 = this.jH[dw][var49][var61];
            if (var101 != null) {
               for (rs.p_a.C_g var106 = (rs.p_a.C_g)var101.b(); var106 != null; var106 = (rs.p_a.C_g)var101.d()) {
                  if (var106.h == (var72 & 32767) && var106.k == var83) {
                     var106.k = var93;
                     break;
                  }
               }

               this.o(var49, var61);
            }
         }
      } else {
         if (var2 == 105) {
            int var3 = var1.y();
            int var4 = this.oE + (var3 >> 4 & 7);
            int var5 = this.oF + (var3 & 7);
            int var6 = var1.A();
            int var7 = var1.y();
            int var8 = var7 >> 4 & 15;
            int var9 = var7 & 7;
            if (eR.k[0] >= var4 - var8 && eR.k[0] <= var4 + var8 && eR.l[0] >= var5 - var8 && eR.l[0] <= var5 + var8 && this.jT && !li && this.ms < 50) {
               this.nY[this.ms] = var6;
               this.oo[this.ms] = var9;
               this.os[this.ms] = rs.p_w.C_e.a[var6];
               this.ms++;
            }
         }

         if (var2 == 215) {
            int var36 = var1.T();
            int var48 = var1.P();
            int var60 = this.oE + (var48 >> 4 & 7);
            int var71 = this.oF + (var48 & 7);
            int var82 = var1.T();
            int var92 = var1.A();
            if (var60 >= 0 && var71 >= 0 && var60 < 104 && var71 < 104 && var82 != di) {
               rs.p_a.C_g var100 = new rs.p_a.C_g();
               var100.h = var36;
               var100.k = var92;
               if (this.jH[dw][var60][var71] == null) {
                  this.jH[dw][var60][var71] = new C_h();
               }

               this.jH[dw][var60][var71].a(var100);
               this.o(var60, var71);
            }
         } else if (var2 == 156) {
            int var35 = var1.N();
            int var47 = this.oE + (var35 >> 4 & 7);
            int var59 = this.oF + (var35 & 7);
            int var70 = var1.A();
            if (var47 >= 0 && var59 >= 0 && var47 < 104 && var59 < 104) {
               C_h var81 = this.jH[dw][var47][var59];
               if (var81 != null) {
                  for (rs.p_a.C_g var91 = (rs.p_a.C_g)var81.b(); var91 != null; var91 = (rs.p_a.C_g)var81.d()) {
                     if (var91.h == (var70 & 32767)) {
                        var91.b();
                        break;
                     }
                  }

                  if (var81.b() == null) {
                     this.jH[dw][var47][var59] = null;
                  }

                  this.o(var47, var59);
               }
            }
         } else if (var2 == 160) {
            int var34 = var1.P();
            int var46 = this.oE + (var34 >> 4 & 7);
            int var58 = this.oF + (var34 & 7);
            int var69 = var1.P();
            int var80 = var69 >> 2;
            int var90 = var69 & 3;
            int var99 = this.nJ[var80];
            int var105 = var1.T();
            if (var46 >= 0 && var58 >= 0 && var46 < 103 && var58 < 103) {
               int var109 = this.fC[dw][var46][var58];
               int var111 = this.fC[dw][var46 + 1][var58];
               int var113 = this.fC[dw][var46 + 1][var58 + 1];
               int var115 = this.fC[dw][var46][var58 + 1];
               if (var99 == 0) {
                  C_U_uc var117 = this.dF.m(dw, var46, var58);
                  if (var117 != null) {
                     int var122 = var117.m >> 14 & 32767;
                     if (var80 == 2) {
                        var117.f = new rs.p_a.C_m(var122, 4 + var90, 2, var111, var113, var109, var115, var105, false);
                        var117.g = new rs.p_a.C_m(var122, var90 + 1 & 3, 2, var111, var113, var109, var115, var105, false);
                     } else {
                        var117.f = new rs.p_a.C_m(var122, var90, var80, var111, var113, var109, var115, var105, false);
                     }
                  }
               }

               if (var99 == 1) {
                  C_T_uc var118 = this.dF.n(var46, var58, dw);
                  if (var118 != null) {
                     var118.e = new rs.p_a.C_m(var118.a, 0, 4, var111, var113, var109, var115, var105, false);
                  }
               }

               if (var99 == 2) {
                  C_l var119 = this.dF.o(var46, var58, dw);
                  if (var80 == 11) {
                     var80 = 10;
                  }

                  if (var119 != null) {
                     var119.d = new rs.p_a.C_m(var119.a, var90, var80, var111, var113, var109, var115, var105, false);
                  }
               }

               if (var99 == 3) {
                  C_m var120 = this.dF.p(var58, var46, dw);
                  if (var120 != null) {
                     var120.c = new rs.p_a.C_m(var120.a, var90, 22, var111, var113, var109, var115, var105, false);
                  }
               }
            }
         } else {
            if (var2 == 147) {
               int var28 = var1.P();
               int var38 = this.oE + (var28 >> 4 & 7);
               int var50 = this.oF + (var28 & 7);
               int var62 = var1.A();
               byte var73 = var1.R();
               int var84 = var1.S();
               byte var94 = var1.Q();
               int var10 = var1.A();
               int var11 = var1.P();
               int var12 = var11 >> 2;
               int var13 = var11 & 3;
               int var14 = this.nJ[var12];
               byte var15 = var1.z();
               int var16 = var1.A();
               byte var17 = var1.Q();
               rs.p_a.C_k var18;
               if (var62 == di) {
                  var18 = eR;
               } else {
                  var18 = kw_do[var62];
               }

               if (var18 != null) {
                  rs.p_d.C_r var19 = rs.p_d.C_r.c(var16);
                  int var20 = this.fC[dw][var38][var50];
                  int var21 = this.fC[dw][var38 + 1][var50];
                  int var22 = this.fC[dw][var38 + 1][var50 + 1];
                  int var23 = this.fC[dw][var38][var50 + 1];
                  rs.p_a.C_h var24 = var19.a(var12, var13, var20, var21, var22, var23, -1, -1);
                  if (var24 != null) {
                     this.a(var10 + 1, -1, 0, var14, var50, 0, dw, var38, var84 + 1);
                     var18.bj = var84 + ff;
                     var18.bk = var10 + ff;
                     var18.bq = var24;
                     int var25 = var19.U;
                     int var26 = var19.af;
                     if (var13 == 1 || var13 == 3) {
                        var25 = var19.af;
                        var26 = var19.U;
                     }

                     var18.bn = var38 * 128 + var25 * 64;
                     var18.bp = var50 * 128 + var26 * 64;
                     var18.bo = this.c(dw, var18.bp, var18.bn);
                     if (var15 > var73) {
                        byte var27 = var15;
                        var15 = var73;
                        var73 = var27;
                     }

                     if (var17 > var94) {
                        byte var123 = var17;
                        var17 = var94;
                        var94 = var123;
                     }

                     var18.bt = var38 + var15;
                     var18.bv = var38 + var73;
                     var18.bu = var50 + var17;
                     var18.bw = var50 + var94;
                  }
               }
            }

            if (var2 == 151) {
               int var33 = var1.N();
               int var45 = this.oE + (var33 >> 4 & 7);
               int var57 = this.oF + (var33 & 7);
               int var68 = var1.S();
               int var79 = var1.P();
               int var89 = var79 >> 2;
               int var98 = var79 & 3;
               int var104 = this.nJ[var89];
               if (var45 >= 0 && var57 >= 0 && var45 < 104 && var57 < 104) {
                  this.a(-1, var68, var98, var104, var57, var89, dw, var45, 0);
               }
            } else if (var2 == 4) {
               int var32 = var1.y();
               int var43 = this.oE + (var32 >> 4 & 7);
               int var55 = this.oF + (var32 & 7);
               int var67 = var1.A();
               int var78 = var1.y();
               int var88 = var1.A();
               if (var43 >= 0 && var55 >= 0 && var43 < 104 && var55 < 104) {
                  var43 = var43 * 128 + 64;
                  var55 = var55 * 128 + 64;
                  rs.p_a.C_b var97 = new rs.p_a.C_b(dw, ff, var88, var67, this.c(dw, var55, var43) - var78, var55, var43);
                  this.et.a(var97);
               }
            } else if (var2 == 44) {
               int var31 = var1.U();
               int var42 = var1.A();
               int var54 = var1.y();
               int var66 = this.oE + (var54 >> 4 & 7);
               int var77 = this.oF + (var54 & 7);
               if (var66 >= 0 && var77 >= 0 && var66 < 104 && var77 < 104) {
                  rs.p_a.C_g var87 = new rs.p_a.C_g();
                  var87.h = var31;
                  var87.k = var42;
                  if (this.jH[dw][var66][var77] == null) {
                     this.jH[dw][var66][var77] = new C_h();
                  }

                  this.jH[dw][var66][var77].a(var87);
                  this.o(var66, var77);
               }
            } else if (var2 == 101) {
               int var30 = var1.O();
               int var41 = var30 >> 2;
               int var53 = var30 & 3;
               int var65 = this.nJ[var41];
               int var76 = var1.y();
               int var86 = this.oE + (var76 >> 4 & 7);
               int var96 = this.oF + (var76 & 7);
               int var103 = var86 + eh;
               int var108 = var96 + ei;
               this.kw_if.remove(var103 + "," + var108);
               if (var86 >= 0 && var96 >= 0 && var86 < 104 && var96 < 104) {
                  this.a(-1, -1, var53, var65, var96, var41, dw, var86, 0);
               }
            } else {
               if (var2 == 117) {
                  int var29 = var1.y();
                  int var39 = this.oE + (var29 >> 4 & 7);
                  int var51 = this.oF + (var29 & 7);
                  int var63 = var39 + var1.z();
                  int var74 = var51 + var1.z();
                  int var85 = var1.B();
                  int var95 = var1.A();
                  int var102 = var1.y() * 4;
                  int var107 = var1.y() * 4;
                  int var110 = var1.A();
                  int var112 = var1.A();
                  int var114 = var1.y();
                  int var116 = var1.y();
                  if (var39 >= 0 && var51 >= 0 && var39 < 104 && var51 < 104 && var63 >= 0 && var74 >= 0 && var63 < 104 && var74 < 104 && var95 != 65535) {
                     var39 = var39 * 128 + 64;
                     var51 = var51 * 128 + 64;
                     var63 = var63 * 128 + 64;
                     var74 = var74 * 128 + 64;
                     rs.p_a.C_l var121 = new rs.p_a.C_l(
                        var114, var107, var110 + ff, var112 + ff, var116, dw, this.c(dw, var51, var39) - var102, var51, var39, var85, var95
                     );
                     var121.a(var110 + ff, var74, this.c(dw, var74, var63) - var107, var63);
                     this.ea.a(var121);
                  }
               }
            }
         }
      }
   }

   public static void aa() {
      C_V_uc.h = true;
      rs.p_l.C_E_uc.n = false;
      li = true;
      C_x.h = !rs.p_f.C_a.ax;
      rs.p_d.C_r.Z = true;
   }

   private void e(rs.p_x.C_e var1) {
      var1.J();
      int var2 = var1.k(8);
      if (var2 < this.cB) {
         for (int var3 = var2; var3 < this.cB; var3++) {
            this.jO[this.jN++] = this.cC[var3];
         }
      }

      if (var2 > this.cB) {
         rs.p_v.C_a.e(this.fk + " Too many npcs");
         throw new RuntimeException("eek");
      } else {
         this.cB = 0;

         for (int var11 = 0; var11 < var2; var11++) {
            int var4 = this.cC[var11];
            rs.p_a.C_j var5 = this.cA[var4];
            int var6 = var1.k(1);
            if (var6 == 0) {
               this.cC[this.cB++] = var4;
               var5.P = ff;
            } else {
               int var7 = var1.k(2);
               if (var7 == 0) {
                  this.cC[this.cB++] = var4;
                  var5.P = ff;
                  this.kx[this.kw++] = var4;
               } else if (var7 == 1) {
                  this.cC[this.cB++] = var4;
                  var5.P = ff;
                  int var8 = var1.k(3);
                  var5.a(false, var8);
                  int var9 = var1.k(1);
                  if (var9 == 1) {
                     this.kx[this.kw++] = var4;
                  }
               } else if (var7 == 2) {
                  this.cC[this.cB++] = var4;
                  var5.P = ff;
                  int var12 = var1.k(3);
                  var5.a(true, var12);
                  int var13 = var1.k(3);
                  var5.a(true, var13);
                  int var10 = var1.k(1);
                  if (var10 == 1) {
                     this.kx[this.kw++] = var4;
                  }
               } else if (var7 == 3) {
                  this.jO[this.jN++] = var4;
               }
            }
         }
      }
   }

   private void bO() {
      if (this.cz == 0) {
         int var1 = super.hE / 2 - 80;
         int var2 = super.hF / 2 + 20;
         var2 += 20;
         if (super.hU == 1 && super.hV >= var1 - 75 && super.hV <= var1 + 75 && super.hW >= var2 - 20 && super.hW <= var2 + 20) {
            this.cz = 2;
            this.fD = 0;
         }

         var1 = super.hE / 2 + 80;
         if (super.hU == 1 && super.hV >= var1 - 75 && super.hV <= var1 + 75 && super.hW >= var2 - 20 && super.hW <= var2 + 20) {
            this.oC = "";
            this.oD = "Enter your username & password.";
            this.cz = 2;
            this.fD = 0;
         }
      } else {
         if (this.cz == 2) {
            this.G.a(super.hU, C_C_uc.hP, C_C_uc.hQ, super.hV, super.hW);
            int var9 = super.hF / 2 - 40;
            var9 += 30;
            var9 += 25;
            var9 += 15;
            var9 += 15;
            int var17 = super.hE / 2 - 80;
            int var3 = super.hF / 2 + 50;
            var3 += 20;
            var17 = super.hE / 2 + 80;
            if (super.hU == 1 && super.hV >= var17 - 75 && super.hV <= var17 + 75 && super.hW >= var3 - 20 && super.hW <= var3 + 20) {
            }

            while (true) {
               int var4 = this.w(-796);
               if (var4 == -1) {
                  return;
               }

               boolean var5 = false;

               for (int var6 = 0; var6 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); var6++) {
                  if (var4 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var6)) {
                     var5 = true;
                     break;
                  }
               }

               if (this.fD == 0) {
                  if (var4 == 8 && this.fk.length() > 0) {
                     this.fk = this.fk.substring(0, this.fk.length() - 1);
                  }

                  if (var4 == 9 || var4 == 10 || var4 == 13) {
                     this.fD = 1;
                  }

                  if (var5 && (var4 != 32 || !this.fk.startsWith(" ") && !this.fk.equals(""))) {
                     this.fk = this.fk + (char)var4;
                  }

                  if (this.fk.length() > 12) {
                     this.fk = this.fk.substring(0, 12);
                  }
               } else if (this.fD == 1) {
                  if (var4 == 8 && this.fl.length() > 0) {
                     this.fl = this.fl.substring(0, this.fl.length() - 1);
                  }

                  if (var4 == 9 || var4 == 10 || var4 == 13) {
                     if (this.fk == "") {
                        this.fD = 0;
                     } else if (this.fl == "") {
                        this.fD = 0;
                     } else if (!rs.p_f.C_a.h) {
                        if (C_Launcher_mc.n().f().a("LOGIN_COOLDOWN", 500L)) {
                           this.a(this.fk, this.fl, false);
                        }
                     } else {
                        this.fD = 2;
                     }
                  }

                  if (var5) {
                     this.fl = this.fl + (char)var4;
                  }

                  if (this.fl.length() > 20) {
                     this.fl = this.fl.substring(0, 20);
                  }
               } else if (this.fD == 2) {
                  if (var4 == 8 && fn.length() > 0) {
                     fn = fn.substring(0, fn.length() - 1);
                  }

                  if (var4 == 9 || var4 == 10 || var4 == 13) {
                     if (this.fk == "") {
                        this.fD = 0;
                     } else if (this.fl == "") {
                        this.fD = 0;
                     } else {
                        this.a(this.fk, this.fl, false);
                     }
                  }

                  if (var5) {
                     fn = fn + (char)var4;
                  }

                  if (fn.length() > 20) {
                     fn = fn.substring(0, 20);
                  }
               } else if (this.fD == 3) {
                  if (var4 == 8 && this.fm.length() > 0) {
                     this.fm = this.fm.substring(0, this.fm.length() - 1);
                  }

                  if (var4 == 10 && this.fm.length() == 5) {
                     this.fD = 0;
                     this.G.j = false;
                     this.a(this.fk, this.fl, false);
                  }

                  if (var5 && var4 <= 57 && var4 >= 49 || var4 == 48) {
                     this.fm = this.fm + (char)var4;
                  }

                  if (this.fm.length() > 5) {
                     this.fm = this.fm.substring(0, 5);
                  }
               }
            }
         }

         if (this.cz == 3) {
            int var8 = super.hE / 2;
            int var15 = super.hF / 2 + 50;
            var15 += 20;
            if (super.hU == 1 && super.hV >= var8 - 75 && super.hV <= var8 + 75 && super.hW >= var15 - 20 && super.hW <= var15 + 20) {
               this.cz = 0;
            }
         }
      }
   }

   public void a(rs.p_l.C_F_uc var1, int var2, int var3) {
      if (var1 != null) {
         int var4 = this.ft + this.oa & 2047;
         int var5 = var2 * var2 + var3 * var3;
         if (var1 == this.kg) {
            if (var5 > 6400 * (this.fh > 0 ? 3 : 1)) {
               return;
            }
         } else if (var5 > (int)(6400.0 * (this.fh > 0 ? 1.0 + (double)((float)this.fh) / 210.0 + 0.25 : 1.0))) {
            return;
         }

         int var6 = !ai() ? 516 : 0;
         boolean var7 = !ai() ? false : false;
         int var8 = rs.p_a.C_h.bA[var4];
         int var9 = rs.p_a.C_h.bB[var4];
         var8 = var8 * 256 / (this.fh + 256);
         var9 = var9 * 256 / (this.fh + 256);
         int var10 = var3 * var8 + var2 * var9 >> 16;
         int var11 = var3 * var9 - var2 * var8 >> 16;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
            var1.f(var6 + (94 + var10 - var1.n / 2) + 4 + 30, 83 - var11 - var1.o / 2 - 4 + 5);
         } else {
            var1.f(77 + var10 - var1.n / 2 + 4 + (ai - 167), 85 - var11 - var1.o / 2 - 4);
         }
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var5 >= 1 && var1 >= 1 && var5 <= 102 && var1 <= 102) {
         if (li && var2 != dw && (var7 != -1 && var7 != 30029 && var7 != 30030 && var7 != 30031 || var2 != 1 || dw != 0)) {
            return;
         }

         int var8 = 0;
         if (var6 == 0) {
            var8 = this.dF.a(var2, var5, var1);
         }

         if (var6 == 1) {
            var8 = this.dF.c(var2, var5, var1);
         }

         if (var6 == 2) {
            var8 = this.dF.e(var2, var5, var1);
         }

         if (var6 == 3) {
            var8 = this.dF.g(var2, var5, var1);
         }

         if (var8 != 0) {
            int var9 = this.dF.b(var2, var5, var1, var8);
            int var10 = var8 >> 14 & 32767;
            int var11 = var9 & 31;
            int var12 = var9 >> 6;
            if (var6 == 0) {
               this.dF.a(var5, var2, var1, (byte)-119);
               rs.p_d.C_r var13 = rs.p_d.C_r.c(var10);
               if (var13.aj) {
                  this.fP[var2].a(var12, var11, var13.ab, var5, var1);
               }
            }

            if (var6 == 1) {
               this.dF.i(var1, var2, var5);
            }

            if (var6 == 2) {
               this.dF.j(var2, var5, var1);
               rs.p_d.C_r var15 = rs.p_d.C_r.c(var10);
               if (var5 + var15.U > 103 || var1 + var15.U > 103 || var5 + var15.af > 103 || var1 + var15.af > 103) {
                  return;
               }

               if (var15.aj) {
                  this.fP[var2].a(var12, var15.U, var5, var1, var15.af, var15.ab);
               }
            }

            if (var6 == 3) {
               this.dF.k(var2, var1, var5);
               rs.p_d.C_r var16 = rs.p_d.C_r.c(var10);
               if (var16.aj && var16.ar) {
                  this.fP[var2].b(var1, var5);
               }
            }
         }

         if (var7 >= 0) {
            int var14 = var2;
            if (var2 < 3 && (this.gc[1][var5][var1] & 2) == 2) {
               var14 = var2 + 1;
            }

            C_x.a(this.dF, var3, var1, var4, var14, this.fP[var2], this.fC, var5, var7, var2);
         }
      }
   }

   private void b(int var1, rs.p_x.C_e var2) {
      this.jN = 0;
      this.kw = 0;
      long var3 = System.currentTimeMillis();
      if (rs.p_f.C_a.d) {
         cx.add("Updating local player movement..");
      }

      this.c(var2);
      if (rs.p_f.C_a.d) {
         cx.add("Updating other player movement..");
      }

      this.d(var2);
      if (rs.p_f.C_a.d) {
         cx.add("Updating player list..");
      }

      this.b(var2, var1);
      if (rs.p_f.C_a.d) {
         cx.add("Parsing synchronization mask..");
      }

      this.a(var2);
      if (rs.p_f.C_a.d) {
         cx.add("..Done!");
      }

      for (int var5 = 0; var5 < this.jN; var5++) {
         int var6 = this.jO[var5];
         int var7 = var6 << 14;
         if (kw_do[var6].P != ff) {
            kw_do[var6] = null;
            rs.p_k.p_c.C_c.a(var7);
         }
      }

      if (var2.h == var1) {
         for (int var9 = 0; var9 < this.ku; var9++) {
            if (kw_do[this.kv[var9]] == null) {
               rs.p_v.C_a.e(this.fk + " null entry in pl list - pos:" + var9 + " size:" + this.ku);
               throw new RuntimeException("eek");
            }
         }
      } else {
         for (String var10 : cx) {
            System.out.println(var10);
         }

         rs.p_v.C_a.e("Error packet size mismatch in getplayer pos:" + var2.h + " psize:" + var1);
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

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 2048 - var2 & 2047;
      int var8 = 2048 - var5 & 2047;
      int var9 = 0;
      int var10 = 0;
      int var11 = var1;
      if (var7 != 0) {
         int var12 = rs.p_a.C_h.bA[var7];
         int var13 = rs.p_a.C_h.bB[var7];
         int var14 = var10 * var13 - var1 * var12 >> 16;
         var11 = var10 * var12 + var1 * var13 >> 16;
         var10 = var14;
      }

      if (var8 != 0) {
         int var15 = rs.p_a.C_h.bA[var8];
         int var16 = rs.p_a.C_h.bB[var8];
         int var17 = var11 * var15 + var9 * var16 >> 16;
         var11 = var11 * var16 - var9 * var15 >> 16;
         var9 = var17;
      }

      cJ = var3 - var9;
      cK = var4 - var10;
      cL = var6 - var11;
      this.cR = var2;
      this.cS = var5;
   }

   public boolean ac() {
      if (rs.p_l.p_b.p_a.C_d.g()) {
         return true;
      } else {
         boolean var1 = rs.p_l.C_j.b(cT);
         if (rs.p_f.C_a.aM && (rs.p_l.C_j.a(cT) || eR != null && eR.aZ != null && eR.aZ.equalsIgnoreCase("Staff stash"))) {
            var1 = true;
         }

         return var1;
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      super.keyReleased(var1);
      int var2 = var1.getKeyCode();
      char var3 = var1.getKeyChar();
      if (this.fN != 2 && this.fN != 1) {
         if (this.gp == 55290 || this.gp == 55291 || this.gp == 55292 || this.gp == 55293) {
            if (var2 == 49 || var2 == 32) {
               fv.a(185);
               fv.d(55313);
            }

            if (var2 == 50) {
               fv.a(185);
               fv.d(55315);
            }

            if (var2 == 51) {
               fv.a(185);
               fv.d(55317);
            }

            if (var2 == 52) {
               fv.a(185);
               fv.d(55319);
            }
         }

         if (this.gp == 55333) {
            if (var2 == 49 || var2 == 32) {
               this.jw = System.currentTimeMillis();
               fv.a(185);
               fv.d(55321);
            }

            if (var2 == 50) {
               this.jw = System.currentTimeMillis();
               fv.a(185);
               fv.d(55323);
            }

            if (var2 == 51) {
               this.jw = System.currentTimeMillis();
               fv.a(185);
               fv.d(55325);
            }

            if (var2 == 52) {
               this.jw = System.currentTimeMillis();
               fv.a(185);
               fv.d(55327);
            }

            if (var2 == 53) {
               this.jw = System.currentTimeMillis();
               fv.a(185);
               fv.d(55329);
            }
         }

         if (System.currentTimeMillis() - this.jx >= 100L) {
            if (var3 == 27 && w.b && this.ac()) {
               w.a();
            } else {
               this.cv.a(var1);

               for (int var7 : jy) {
                  if (var7 == this.gp) {
                     if (var2 >= 49 && var2 <= 53) {
                        this.jx = System.currentTimeMillis();
                        ap = "::dialogueoption " + (var2 - 48);
                     }

                     if (var2 >= 97 && var2 <= 101) {
                        this.jx = System.currentTimeMillis();
                        ap = "::dialogueoption " + (var2 - 96);
                     }
                     break;
                  }
               }
            }
         }
      }
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      super.keyPressed(var1);
      if (System.currentTimeMillis() - this.jw >= 1000L) {
         if (this.fN != 2) {
            int var2 = var1.getKeyCode();
            char var3 = var1.getKeyChar();
            if (!this.fc) {
               if (this.fD == 3 && var2 == 27 && this.G.j) {
                  this.fm = "";
                  this.fD = 0;
                  this.G.j = false;
                  this.G.a("@yel@Safety reminder to new players:@whi@ Please do NOT", "use passwords that you've used on other servers.");
               }
            } else {
               if (var2 == 81 && (ch || var1.isControlDown())) {
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

               if (var2 == 32) {
                  for (int var7 : jz) {
                     if (var7 == this.gp) {
                        this.jw = System.currentTimeMillis();
                        fv.a(40);
                        fv.d(4907);
                        this.eZ = true;
                        break;
                     }
                  }
               }

               if (var2 == 27 && !w.b) {
                  if (cH == 3323 || cH == 3443 || cH == 59835 || cH == 59868 || cH == 25754 || cH == 6575 || cH == 6412) {
                     return;
                  }

                  this.jw = System.currentTimeMillis();
                  fv.a(185);
                  fv.d(63740);
               }
            }
         }
      }
   }

   private boolean bP() {
      if (this.nD == null) {
         return false;
      } else {
         try {
            int var1 = this.nD.c();
            if (var1 == 0) {
               return false;
            }

            if (this.lO == -1) {
               this.nD.a(this.mU.g, 1);
               this.lO = this.mU.g[0] & 255;
               if (this.lJ != null) {
                  this.lO = this.lO - this.lJ.a() & 0xFF;
               }

               this.lN = rs.p_f.C_d.b[this.lO];
               var1--;
            }

            if (this.lN == -1) {
               if (var1 <= 0) {
                  return false;
               }

               this.nD.a(this.mU.g, 1);
               this.lN = this.mU.g[0] & 255;
               var1--;
            }

            if (this.lN == -2) {
               if (var1 <= 1) {
                  return false;
               }

               this.nD.a(this.mU.g, 2);
               this.mU.h = 0;
               this.lN = this.mU.A();
               var1 -= 2;
            }

            if (var1 < this.lN) {
               return false;
            }

            if (rs.p_f.C_a.d && this.lO > 0) {
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
               if (ii != 0L) {
                  bh = System.currentTimeMillis() - ii - 600L;
                  if (bh < 0L) {
                     bh = 0L;
                  }
               }

               ii = System.currentTimeMillis();
               if (rs.p_f.C_a.f) {
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
                  short var80 = 650;
                  if (this.nC != 201 || this.nf == 1) {
                     var80 = 655;
                  }

                  this.kr = "";
                  this.nz = false;

                  for (int var115 = 0; var115 < rs.p_n.C_e.H.length; var115++) {
                     if (rs.p_n.C_e.H[var115] != null && rs.p_n.C_e.H[var115].J == var80) {
                        cH = rs.p_n.C_e.H[var115].ah;
                        break;
                     }
                  }
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 64) {
               this.oE = this.mU.O();
               this.oF = this.mU.P();

               for (int var78 = this.oE; var78 < this.oE + 8; var78++) {
                  for (int var114 = this.oF; var114 < this.oF + 8; var114++) {
                     if (this.jH[dw][var78][var114] != null) {
                        this.jH[dw][var78][var114] = null;
                        this.o(var78, var114);
                     }
                  }
               }

               for (C_N_uc var79 = (C_N_uc)this.nL.b(); var79 != null; var79 = (C_N_uc)this.nL.d()) {
                  if (var79.j >= this.oE && var79.j < this.oE + 8 && var79.k >= this.oF && var79.k < this.oF + 8 && var79.h == dw) {
                     var79.g = 0;
                  }
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 185) {
               int var77 = this.mU.U();
               rs.p_n.C_e.H[var77].ae = 3;
               if (eR.aT == null) {
                  rs.p_n.C_e.H[var77].af = (eR.aV[0] << 25) + (eR.aV[4] << 20) + (eR.br[0] << 15) + (eR.br[8] << 10) + (eR.br[11] << 5) + eR.br[1];
               } else {
                  rs.p_n.C_e.H[var77].af = (int)(305419896L + eR.aT.x);
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 107) {
               this.fe = false;

               for (int var76 = 0; var76 < 5; var76++) {
                  this.dh[var76] = false;
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 72) {
               int var75 = this.mU.S();
               rs.p_n.C_e var113 = rs.p_n.C_e.H[var75];

               for (int var196 = 0; var196 < var113.az.length; var196++) {
                  var113.az[var196] = -1;
                  var113.az[var196] = 0;
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 214) {
               this.jD = this.lN / 8;

               for (int var74 = 0; var74 < this.jD; var74++) {
                  this.kP[var74] = this.mU.E();
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
               int var73 = this.mU.A();
               rs.p_q.p_a.p_a.C_b.a(this, this.mU, var73);
               this.lO = -1;
               return true;
            }

            if (this.lO == 255) {
               int var72 = this.mU.A();
               long var112 = this.mU.E();
               int var249 = this.mU.A();
               if (var72 > -1) {
                  this.m.a(var72, var112, var249);
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 134) {
               int var71 = this.mU.y();
               int var111 = this.ka[var71];
               int var195 = this.kN[var71];
               int var248 = this.mU.X();
               int var287 = this.mU.y();
               this.ka[var71] = var248;
               this.kN[var71] = var287;
               this.eo[var71] = 1;

               for (int var313 = 0; var313 < 98; var313++) {
                  if (var248 >= lU[var313]) {
                     this.eo[var71] = var313 + 2;
                  }
               }

               this.p.post(new C_SkillLevelChanged_mc(var71, (double)var248, var287, this.eo[var71]));
               int var314 = this.eo[var71];
               int var326 = 0;

               for (int var335 = 0; var335 < this.eo.length; var335++) {
                  var326 += this.eo[var335];
               }

               String var336 = "XP: " + var248 + "\n";
               if (var314 != 99) {
                  int var344 = lU[var314 - 1];
                  var336 = var336 + "Next Lvl: " + var344 + "\n";
                  var336 = var336 + "Remainder: " + (var344 - this.ka[var71]) + "\n";
               }

               rs.p_n.C_e.H[((Number)rs.p_f.C_e.c[var71][1]).intValue() + 1].at = var336;
               rs.p_n.C_e.H['쑀'].at = "Total Level: " + var326;
               if (var195 > 0) {
                  this.o.a(var71, var248 - var111);
               }

               if (var71 == 6 && this.eo[6] != C_ap.c && C_ap.d) {
                  C_ap.c = this.eo[6];
                  C_ap.j();
               }

               fb = true;
               this.lO = -1;
               return true;
            }

            if (this.lO == 71) {
               int var70 = this.mU.A();
               int var110 = this.mU.N();
               if (var70 == 65535) {
                  var70 = -1;
               }

               if (var70 == 0) {
                  var70 = 67027;
               }

               if (var110 == 2) {
                  var70 = 44100;
               }

               eT[var110] = var70;
               fb = true;
               eM = true;
               this.lO = -1;
               return true;
            }

            if (this.lO == 74) {
               int var69 = this.mU.S();
               if (var69 == 65535) {
                  var69 = -1;
               }

               if (var69 != this.lh && this.nv && !li && this.oz == 0) {
                  this.oi = var69;
                  this.oj = true;
                  ew.a(2, this.oi);
               }

               this.lh = var69;
               this.lO = -1;
               return true;
            }

            if (this.lO == 121) {
               int var68 = this.mU.U();
               int var109 = this.mU.T();
               if (this.nv && !li) {
                  this.oi = var68;
                  this.oj = false;
                  ew.a(2, this.oi);
                  this.oz = var109;
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
               int var67 = this.mU.B();
               int var108 = this.mU.V();
               int var194 = this.mU.S();
               rs.p_n.C_e var247 = rs.p_n.C_e.H[var194];
               var247.aJ = var67;
               var247.aP = var108;
               this.lO = -1;
               return true;
            }

            if (this.lO == 73 || this.lO == 241) {
               int var66 = this.mx;
               int var107 = this.my;
               if (this.lO == 73) {
                  var66 = this.mU.T();
                  var107 = this.mU.A();
                  this.nA = false;
               }

               if (this.lO != 241) {
                  if (this.mx == var66 && this.my == var107 && ee == 2) {
                     this.lO = -1;
                     return true;
                  }
               } else {
                  var107 = this.mU.T();
                  this.mU.J();

                  for (int var192 = 0; var192 < 4; var192++) {
                     for (int var245 = 0; var245 < 13; var245++) {
                        for (int var285 = 0; var285 < 13; var285++) {
                           if (this.mU.k(1) == 1) {
                              this.eS[var192][var245][var285] = this.mU.k(26);
                           } else {
                              this.eS[var192][var245][var285] = -1;
                           }
                        }
                     }
                  }

                  this.mU.K();
                  var66 = this.mU.A();
                  this.nA = true;
               }

               this.mx = this.bl = var66;
               this.my = this.bm = var107;
               eh = (this.mx - 6) * 8;
               ei = (this.my - 6) * 8;
               int var193 = this.mx / 8 * 256 + this.my / 8;
               System.out.println("[Region] Stand in region: " + var193);
               W = var193;
               if (ew.g.a(var193)) {
                  ek = (String)ew.g.a().b(var193);
                  System.out.println("[Region] Region group: " + ek);
               } else {
                  ek = null;
               }

               this.np = (this.mx / 8 == 48 || this.mx / 8 == 49) && this.my / 8 == 48;
               if (this.mx / 8 == 48 && this.my / 8 == 148) {
                  this.np = true;
               }

               int var246 = eh + (eh - 6 >> 7);
               int var286 = ei + (ei - 6 >> 7);
               int var312 = var246 >> 6;
               int var325 = var286 >> 6;
               int var334 = var312 * 256 + var325;
               if (rs.p_d.C_r.B.size() == 0) {
                  if (rs.p_d.C_h.a != rs.p_d.C_h.a.b) {
                     rs.p_d.C_h.a(rs.p_d.C_h.a.b);
                     rs.p_d.C_t.a(!this.aC ? rs.p_d.C_h.a.b : rs.p_d.C_h.a.a);
                  }

                  if (rs.p_d.C_r.E != rs.p_d.C_r.a.b) {
                     rs.p_d.C_r.a(rs.p_d.C_r.a.b);
                  }

                  for (int var13 : rs.p_d.C_r.D) {
                     rs.p_d.C_r.B.a(var13, new rs.p_d.C_r(rs.p_d.C_r.c(var13)));
                  }
               }

               if (!this.aC
                  && var334 != 9023
                  && var334 != 9022
                  && var334 != 9024
                  && var334 != 8767
                  && var334 != 9279
                  && c.get(var334) == null
                  && c.get(W) == null) {
                  if (!rs.p_f.C_a.ax && !C_x.h) {
                     C_x.h = !rs.p_f.C_a.ax;
                     if (this.fr != null && !this.bI) {
                        ee = 1;
                     } else {
                        this.bI = false;
                     }
                  }
               } else if (!rs.p_f.C_a.ax) {
                  C_x.h = false;
                  if (this.fr != null && !this.bI) {
                     ee = 1;
                  } else {
                     this.bI = false;
                  }
               }

               boolean var343 = false;
               int var347 = eh + (eR.ac - 6 >> 7);
               int var348 = ei + (eR.ad - 6 >> 7);
               int var349 = var347 >> 6;
               int var14 = var348 >> 6;
               if (ek == null && ew.g.g().a_(var334)) {
                  var343 = true;
               }

               if (ew.g.g().a_(var193)) {
                  var343 = true;
               }

               if (var343) {
                  if (rs.p_d.C_h.a != rs.p_d.C_h.a.c) {
                     rs.p_d.C_h.a(rs.p_d.C_h.a.c);
                     rs.p_d.C_t.a(rs.p_d.C_h.a.c);
                  }

                  if (rs.p_d.C_r.E != rs.p_d.C_r.a.d) {
                     rs.p_d.C_r.a(rs.p_d.C_r.a.d);
                  }
               } else {
                  int var15 = ek == null ? var334 : var193;
                  if (Arrays.asList(this.e).contains(new Integer(var15))) {
                     if (rs.p_d.C_h.a != rs.p_d.C_h.a.a) {
                        rs.p_d.C_h.a(rs.p_d.C_h.a.a);
                        rs.p_d.C_t.a(rs.p_d.C_h.a.a);
                     }

                     if (rs.p_d.C_r.E != rs.p_d.C_r.a.c) {
                        rs.p_d.C_r.a(rs.p_d.C_r.a.c);
                     }
                  } else if (Arrays.asList(this.d).contains(new Integer(var15))) {
                     if (rs.p_d.C_h.a != rs.p_d.C_h.a.b) {
                        rs.p_d.C_h.a(rs.p_d.C_h.a.b);
                        rs.p_d.C_t.a(rs.p_d.C_h.a.b);
                     }

                     if (rs.p_d.C_r.E != rs.p_d.C_r.a.b) {
                        rs.p_d.C_r.a(rs.p_d.C_r.a.b);
                     }
                  } else {
                     if (rs.p_d.C_h.a != rs.p_d.C_h.a.a) {
                        rs.p_d.C_h.a(rs.p_d.C_h.a.a);
                        rs.p_d.C_t.a(rs.p_d.C_h.a.a);
                     }

                     if (rs.p_d.C_r.E != rs.p_d.C_r.a.a) {
                        rs.p_d.C_r.a(rs.p_d.C_r.a.a);
                     }
                  }
               }

               System.out.println("[Regions] Loaded region ID: " + var334 + " (" + rs.p_d.C_r.E.name() + ")");
               cw = var334;
               bD = true;
               ee = 1;
               this.jE = System.currentTimeMillis();
               if (this.lO == 73) {
                  int var350 = 0;

                  for (int var16 = (this.mx - 6) / 8; var16 <= (this.mx + 6) / 8; var16++) {
                     for (int var17 = (this.my - 6) / 8; var17 <= (this.my + 6) / 8; var17++) {
                        var350++;
                     }
                  }

                  this.fr = new byte[var350][];
                  this.fY = new byte[var350][];
                  this.fR = new int[var350];
                  this.fS = new int[var350];
                  this.fT = new int[var350];
                  var350 = 0;

                  for (int var354 = (this.mx - 6) / 8; var354 <= (this.mx + 6) / 8; var354++) {
                     for (int var357 = (this.my - 6) / 8; var357 <= (this.my + 6) / 8; var357++) {
                        int var18 = (var354 << 8) + var357;
                        if (ew.g.g().a_(var18)) {
                           rs.p_cache.p_osrs.C_c.a(true);
                        }

                        try {
                           this.fR[var350] = (var354 << 8) + var357;
                           if (!this.np || var357 != 49 && var357 != 149 && var357 != 147 && var354 != 50 && (var354 != 49 || var357 != 47)) {
                              if (ek != null && !ew.g.a(var18, ek)) {
                                 this.fS[var350] = -1;
                                 this.fT[var350] = -1;
                                 var350++;
                              } else {
                                 int var19 = this.fS[var350] = ew.b(0, var357, var354);
                                 if (var19 != -1) {
                                    ew.a(3, var19);
                                 }

                                 int var20 = this.fT[var350] = ew.b(1, var357, var354);
                                 if (var20 != -1) {
                                    ew.a(3, var20);
                                 }

                                 var350++;
                              }
                           } else {
                              this.fS[var350] = -1;
                              this.fT[var350] = -1;
                              var350++;
                           }
                        } finally {
                           rs.p_cache.p_osrs.C_c.a(false);
                        }
                     }
                  }
               }

               if (this.lO == 241) {
                  int var352 = 0;
                  int[] var355 = new int[676];

                  for (int var358 = 0; var358 < 4; var358++) {
                     for (int var363 = 0; var363 < 13; var363++) {
                        for (int var368 = 0; var368 < 13; var368++) {
                           int var373 = this.eS[var358][var363][var368];
                           if (var373 != -1) {
                              int var21 = var373 >> 14 & 1023;
                              int var22 = var373 >> 3 & 2047;
                              int var23 = (var21 / 8 << 8) + var22 / 8;

                              for (int var24 = 0; var24 < var352; var24++) {
                                 if (var355[var24] == var23) {
                                    var23 = -1;
                                    break;
                                 }
                              }

                              if (var23 != -1) {
                                 var355[var352++] = var23;
                              }
                           }
                        }
                     }
                  }

                  this.fr = new byte[var352][];
                  this.fY = new byte[var352][];
                  this.fR = new int[var352];
                  this.fS = new int[var352];
                  this.fT = new int[var352];

                  for (int var359 = 0; var359 < var352; var359++) {
                     int var364 = this.fR[var359] = var355[var359];
                     int var369 = var364 >> 8 & 0xFF;
                     int var374 = var364 & 0xFF;
                     int var376 = this.fS[var359] = ew.b(0, var374, var369);
                     if (var376 != -1) {
                        ew.a(3, var376);
                     }

                     int var378 = this.fT[var359] = ew.b(1, var374, var369);
                     if (var378 != -1) {
                        ew.a(3, var378);
                     }
                  }
               }

               int var353 = eh - this.mf;
               int var356 = ei - this.mg;
               this.mf = eh;
               this.mg = ei;

               for (int var360 = 0; var360 < 16384; var360++) {
                  rs.p_a.C_j var365 = this.cA[var360];
                  if (var365 != null) {
                     for (int var370 = 0; var370 < 10; var370++) {
                        var365.k[var370] = var365.k[var370] - var353;
                        var365.l[var370] = var365.l[var370] - var356;
                     }

                     var365.ac -= var353 * 128;
                     var365.ad -= var356 * 128;
                  }
               }

               for (int var361 = 0; var361 < this.kt; var361++) {
                  rs.p_a.C_k var366 = kw_do[var361];
                  if (var366 != null) {
                     for (int var371 = 0; var371 < 10; var371++) {
                        var366.k[var371] = var366.k[var371] - var353;
                        var366.l[var371] = var366.l[var371] - var356;
                     }

                     var366.ac -= var353 * 128;
                     var366.ad -= var356 * 128;
                  }
               }

               this.mS = true;
               byte var362 = 0;
               byte var367 = 104;
               byte var372 = 1;
               if (var353 < 0) {
                  var362 = 103;
                  var367 = -1;
                  var372 = -1;
               }

               byte var375 = 0;
               byte var377 = 104;
               byte var379 = 1;
               if (var356 < 0) {
                  var375 = 103;
                  var377 = -1;
                  var379 = -1;
               }

               for (byte var380 = var362; var380 != var367; var380 += var372) {
                  for (byte var382 = var375; var382 != var377; var382 += var379) {
                     int var25 = var380 + var353;
                     int var26 = var382 + var356;

                     for (int var27 = 0; var27 < 4; var27++) {
                        if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                           this.jH[var27][var380][var382] = this.jH[var27][var25][var26];
                        } else {
                           this.jH[var27][var380][var382] = null;
                        }
                     }
                  }
               }

               for (C_N_uc var381 = (C_N_uc)this.nL.b(); var381 != null; var381 = (C_N_uc)this.nL.d()) {
                  var381.j -= var353;
                  var381.k -= var356;
                  if (var381.j < 0 || var381.k < 0 || var381.j >= 104 || var381.k >= 104) {
                     var381.b();
                  }
               }

               if (this.gd != 0) {
                  this.gd -= var353;
                  this.ge -= var356;
               }

               this.fe = false;
               this.lO = -1;
               rs.p_d.C_s.a(this);
               return true;
            }

            if (this.lO == 208) {
               int var65 = this.mU.V();
               this.x.k(var65 == 197 && !this.x.M());
               if (var65 >= 0) {
                  this.C(var65);
               }

               ed = var65;
               this.lO = -1;
               return true;
            }

            if (this.lO == 99) {
               this.lV = this.mU.y();
               this.lO = -1;
               return true;
            }

            if (this.lO == 75) {
               int var64 = this.mU.U();
               int var106 = this.mU.U();
               if (rs.p_n.C_e.H[var106].ae != 10) {
                  rs.p_n.C_e.H[var106].ae = 2;
               }

               rs.p_n.C_e.H[var106].af = var64;
               if (rs.p_n.C_e.H[var106].ae == 10) {
                  rs.p_d.C_d var191 = rs.p_d.C_d.c(rs.p_n.C_e.H[var106].af);
                  if (rs.p_n.C_e.H[var106].aY) {
                     rs.p_n.C_e.H[var106].aW = var191.I;
                     rs.p_n.C_e.H[var106].aX = var191.E;
                  } else if (var191.r == 1) {
                     rs.p_n.C_e.H[var106].aT = 1500;
                  } else {
                     rs.p_n.C_e.H[var106].aT = var191.r * 500;
                  }

                  if (var191.o.equalsIgnoreCase("Greater demon") || var191.o.equalsIgnoreCase("Black demon") || var191.o.equalsIgnoreCase("Lesser demon")) {
                     rs.p_n.C_e.H[var106].aT = 2750;
                  }

                  if (var191.o.equalsIgnoreCase("Abyssal sire") || var191.o.equalsIgnoreCase("Kraken")) {
                     rs.p_n.C_e.H[var106].aT = 3500;
                  }

                  if (var191.o.equalsIgnoreCase("Jungle demon")) {
                     rs.p_n.C_e.H[var106].aT = 2900;
                  }

                  if (var191.o.equalsIgnoreCase("Infernal imp")) {
                     rs.p_n.C_e.H[var106].aT = 800;
                  }

                  if (var191.o.equalsIgnoreCase("Chaos giant")) {
                     rs.p_n.C_e.H[var106].aT = 1900;
                  }

                  if (var191.o.equalsIgnoreCase("Tormented demon")) {
                     rs.p_n.C_e.H[var106].aT = 2900;
                  }

                  if (var191.o.equalsIgnoreCase("Dark araxyte")) {
                     rs.p_n.C_e.H[var106].aT = 4000;
                  }

                  if (var191.o.equalsIgnoreCase("Yama")) {
                     rs.p_n.C_e.H[var106].aT = 3500;
                  }

                  if (var191.x == 7572L) {
                     rs.p_n.C_e.H[var106].aT = 1400;
                  }

                  if (var191.x == 315L) {
                     rs.p_n.C_e.H[var106].aT = 1400;
                  }

                  if (var191.x == 3555L) {
                     rs.p_n.C_e.H[var106].aT = 2300;
                  }

                  if (var191.o.equalsIgnoreCase("Zulrah")) {
                     rs.p_n.C_e.H[var106].aT = 3400;
                  }

                  if (var191.o.equalsIgnoreCase("The Maiden of Sugadinti")) {
                     rs.p_n.C_e.H[var106].aT = 4000;
                  }

                  if (var191.o.equalsIgnoreCase("Blood hydra")) {
                     rs.p_n.C_e.H[var106].aT = 5000;
                  }

                  if (var191.o.equalsIgnoreCase("Basilisk knight")) {
                     rs.p_n.C_e.H[var106].aT = 2750;
                  }

                  if (var191.o.equalsIgnoreCase("Blood reaver")) {
                     rs.p_n.C_e.H[var106].aT = 2250;
                  }

                  if (var191.o.equalsIgnoreCase("Skotizo")) {
                     rs.p_n.C_e.H[var106].aT = 5000;
                  }

                  if (var191.o.equalsIgnoreCase("Chaos elemental")) {
                     rs.p_n.C_e.H[var106].aT = 2750;
                  }

                  if (var191.o.equalsIgnoreCase("Corporeal beast") || var191.o.equalsIgnoreCase("Mystical corp beast")) {
                     rs.p_n.C_e.H[var106].aT = 4000;
                  }

                  if (var191.o.equalsIgnoreCase("Tekton") || var191.o.equalsIgnoreCase("Mystical tekton")) {
                     rs.p_n.C_e.H[var106].aT = 4000;
                  }

                  if (var191.o.equalsIgnoreCase("Barrelchest")) {
                     rs.p_n.C_e.H[var106].aT = 2150;
                  }

                  if (var191.o.equalsIgnoreCase("Demonic gorilla")) {
                     rs.p_n.C_e.H[var106].aT = 2750;
                  }

                  if (var191.o.equalsIgnoreCase("Revenant ork")) {
                     rs.p_n.C_e.H[var106].aT = 1750;
                  }

                  if (var191.o.equalsIgnoreCase("Abyssal demon")) {
                     rs.p_n.C_e.H[var106].aT = 1850;
                  }

                  if (var191.o.equalsIgnoreCase("Undead pker")) {
                     rs.p_n.C_e.H[var106].aT = 1400;
                  }

                  if (var191.o.equalsIgnoreCase("Vet'ion")) {
                     rs.p_n.C_e.H[var106].aT = 2100;
                  }

                  if (var191.o.equalsIgnoreCase("Goblin fish")) {
                     rs.p_n.C_e.H[var106].aT = 500;
                  }

                  rs.p_n.C_e.H[var106].ar = 0;
                  rs.p_n.C_e.H[var106].F = 0;
                  rs.p_n.C_e.H[var106].aD = var191.w;
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
                  int var63 = this.mU.y();
                  this.c(this.mU, var63);
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 35) {
               int var62 = this.mU.y();
               int var105 = this.mU.y();
               int var190 = this.mU.y();
               int var244 = this.mU.y();
               this.dh[var62] = true;
               this.dg[var62] = var105;
               this.fy[var62] = var190;
               this.dy[var62] = var244;
               this.eg[var62] = 0;
               this.lO = -1;
               return true;
            }

            if (this.lO == 174) {
               int var61 = this.mU.A();
               int var104 = this.mU.A();
               int var189 = this.mU.A();
               if (this.jT && this.ms < 50) {
                  this.nY[this.ms] = var61;
                  this.oo[this.ms] = 0;
                  this.os[this.ms] = 0 + var104 + rs.p_w.C_e.a[var61];
                  this.ot[this.ms] = var189;
                  this.ms++;
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 104) {
               int var60 = this.mU.O();
               int var103 = this.mU.N();
               String var188 = this.mU.F();
               if (var60 >= 1 && var60 <= 5) {
                  if (var188.equalsIgnoreCase("null")) {
                     var188 = null;
                  }

                  this.nh[var60 - 1] = var188;
                  this.ni[var60 - 1] = var103 == 0;
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
               String var59 = this.mU.F();
               if (var59.endsWith(":tradereq:")) {
                  String var102 = var59.substring(0, var59.indexOf(":"));
                  long var187 = C_O_uc.a(var102);
                  boolean var284 = false;

                  for (int var311 = 0; var311 < this.jD; var311++) {
                     if (this.kP[var311] == var187) {
                        var284 = true;
                        break;
                     }
                  }

                  if (!var284 && this.ou == 0) {
                     this.a("wishes to trade with you.", 4, var102);
                  }
               } else if (var59.endsWith(":duelreq:")) {
                  String var101 = var59.substring(0, var59.indexOf(":"));
                  long var186 = C_O_uc.a(var101);
                  boolean var283 = false;

                  for (int var310 = 0; var310 < this.jD; var310++) {
                     if (this.kP[var310] == var186) {
                        var283 = true;
                        break;
                     }
                  }

                  if (!var283 && this.ou == 0) {
                     this.a("wishes to duel with you.", 8, var101);
                  }
               } else if (var59.endsWith(":cwarreq:")) {
                  String var100 = var59.substring(0, var59.indexOf(":"));
                  long var185 = C_O_uc.a(var100);
                  boolean var282 = false;

                  for (int var309 = 0; var309 < this.jD; var309++) {
                     if (this.kP[var309] == var185) {
                        var282 = true;
                        break;
                     }
                  }

                  if (!var282 && this.ou == 0) {
                     this.a("wishes to challenge your clan to a Clan War.", 8, var100);
                  }
               } else if (var59.endsWith(":whipddsreq:")) {
                  String var99 = var59.substring(0, var59.indexOf(":"));
                  long var184 = C_O_uc.a(var99);
                  boolean var281 = false;

                  for (int var308 = 0; var308 < this.jD; var308++) {
                     if (this.kP[var308] == var184) {
                        var281 = true;
                        break;
                     }
                  }

                  if (!var281 && this.ou == 0) {
                     this.a("wishes to whip + dds duel with you.", 8, var99);
                  }
               } else if (var59.endsWith(":whipduelreq:")) {
                  String var98 = var59.substring(0, var59.indexOf(":"));
                  long var183 = C_O_uc.a(var98);
                  boolean var280 = false;

                  for (int var307 = 0; var307 < this.jD; var307++) {
                     if (this.kP[var307] == var183) {
                        var280 = true;
                        break;
                     }
                  }

                  if (!var280 && this.ou == 0) {
                     this.a("wishes to whip duel with you.", 8, var98);
                  }
               } else if (var59.endsWith(":gambreq:")) {
                  String var97 = var59.substring(0, var59.indexOf(":"));
                  long var182 = C_O_uc.a(var97);
                  boolean var279 = false;

                  for (int var306 = 0; var306 < this.jD; var306++) {
                     if (this.kP[var306] == var182) {
                        var279 = true;
                        break;
                     }
                  }

                  if (!var279 && this.ou == 0) {
                     this.a("wishes to gamble with you.", 8, var97);
                  }
               } else if (!var59.endsWith(":chalreq:")) {
                  if (var59.startsWith("<img=1><shad=FFFF3F><col=FE610C>[News]:")) {
                  }

                  this.a(var59, 0, "");
               } else {
                  String var96 = var59.substring(0, var59.indexOf(":"));
                  long var181 = C_O_uc.a(var96);
                  boolean var278 = false;

                  for (int var304 = 0; var304 < this.jD; var304++) {
                     if (this.kP[var304] == var181) {
                        var278 = true;
                        break;
                     }
                  }

                  if (!var278 && this.ou == 0) {
                     String var305 = var59.substring(var59.indexOf(":") + 1, var59.length() - 9);
                     this.a(var305, 8, var96);
                  }
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 1) {
               for (int var57 = 0; var57 < kw_do.length; var57++) {
                  if (kw_do[var57] != null) {
                     kw_do[var57].F = -1;
                  }
               }

               for (int var58 = 0; var58 < this.cA.length; var58++) {
                  if (this.cA[var58] != null) {
                     this.cA[var58].F = -1;
                  }
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 50) {
               long var56 = this.mU.E();
               int var180 = this.mU.y();
               String var243 = C_O_uc.c(C_O_uc.a(var56));

               for (int var276 = 0; var276 < this.kA; var276++) {
                  if (var56 == this.lg[var276]) {
                     if (this.jG[var276] != var180) {
                        int var302 = this.jG[var276];
                        this.jG[var276] = var180;
                        fb = true;
                        if (var180 > 0 && var302 == 0) {
                           this.a(var243 + " has logged in.", 5, "");
                        }

                        if (var180 == 0) {
                           this.a(var243 + " has logged out.", 5, "");
                        }
                     }

                     var243 = null;
                     break;
                  }
               }

               if (var243 != null && this.kA < 350) {
                  this.lg[this.kA] = var56;
                  this.mT[this.kA] = var243;
                  this.jG[this.kA] = var180;
                  this.kA++;
                  fb = true;
               }

               boolean var277 = false;

               while (!var277) {
                  var277 = true;

                  for (int var303 = 0; var303 < this.kA - 1; var303++) {
                     if (this.jG[var303] != dK && this.jG[var303 + 1] == dK || this.jG[var303] == 0 && this.jG[var303 + 1] != 0) {
                        int var324 = this.jG[var303];
                        this.jG[var303] = this.jG[var303 + 1];
                        this.jG[var303 + 1] = var324;
                        String var333 = this.mT[var303];
                        this.mT[var303] = this.mT[var303 + 1];
                        this.mT[var303 + 1] = var333;
                        long var341 = this.lg[var303];
                        this.lg[var303] = this.lg[var303 + 1];
                        this.lg[var303 + 1] = var341;
                        fb = true;
                        var277 = false;
                     }
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
               int var55 = this.mU.T();
               int var95 = this.mU.A();
               if (this.gp != -1) {
                  this.gp = -1;
                  fM = true;
               }

               if (this.fN != 0 && cH != 3323) {
                  this.fN = 0;
                  fM = true;
               }

               cH = var55;
               this.fu = var95;
               fb = true;
               eM = true;
               this.eZ = false;
               this.lO = -1;
               return true;
            }

            if (this.lO == 79) {
               int var54 = this.mU.S();
               int var94 = this.mU.T();
               rs.p_n.C_e var179 = rs.p_n.C_e.H[var54];
               if (var179 != null && var179.aI == 0) {
                  if (var94 < 0) {
                     var94 = 0;
                  }

                  if (var94 > var179.aH - var179.aR) {
                     var94 = var179.aH - var179.aR;
                  }

                  var179.V = var94;
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 68) {
               for (int var53 = 0; var53 < this.dP.length; var53++) {
                  if (this.dP[var53] != this.mj[var53]) {
                     this.dP[var53] = this.mj[var53];
                     this.B(var53);
                     fb = true;
                  }
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 196) {
               long var52 = this.mU.E();
               int var178 = this.mU.D();
               int var242 = this.mU.D();
               boolean var275 = false;
               if (!rs.p_l.C_j.a(var242)) {
                  for (int var300 = 0; var300 < this.jD; var300++) {
                     if (this.kP[var300] == var52) {
                        var275 = true;
                     }
                  }
               }

               if (!var275 && this.ou == 0) {
                  try {
                     this.on[this.nE] = var178;
                     this.nE = (this.nE + 1) % 100;
                     String var301 = this.mU.F();
                     String var323 = C_O_uc.c(C_O_uc.a(var52));
                     if (var301.contains("<N>")) {
                        String[] var332 = var301.split("<N>");
                        if (var332.length == 2) {
                           var323 = var332[0];
                           var301 = var332[1];
                        }
                     }

                     if (var242 != 3) {
                        var301 = rs.p_d.C_c.b(var301);
                     }

                     if (var242 > 0) {
                        this.a(var301, 7, "@cr" + var242 + "@" + var323);
                     } else {
                        this.a(var301, 3, var323);
                     }
                  } catch (Exception var32) {
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
                  if (this.er == 3) {
                     fL = 1;
                  } else {
                     fL = 3;
                  }

                  fb = true;
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 246) {
               int var51 = this.mU.S();
               int var93 = this.mU.A();
               int var177 = this.mU.A();
               if (var177 == 65535) {
                  rs.p_n.C_e.H[var51].ae = 0;
                  this.lO = -1;
                  return true;
               }

               rs.p_d.C_k var241 = rs.p_d.C_k.f(var177);
               rs.p_n.C_e.H[var51].ae = 4;
               rs.p_n.C_e.H[var51].af = var177;
               rs.p_n.C_e.H[var51].aU = var241.M;
               rs.p_n.C_e.H[var51].aV = var241.Z;
               rs.p_n.C_e.H[var51].aT = var241.G * 100 / var93;
               this.lO = -1;
               return true;
            }

            if (this.lO == 171) {
               boolean var50 = this.mU.y() == 1;
               int var92 = this.mU.A();
               rs.p_n.C_e.H[var92].aQ = var50;
               this.lO = -1;
               return true;
            }

            if (this.lO == 142) {
               int var49 = this.mU.S();
               if (var49 != 0) {
                  this.C(var49);
               }

               if (this.gp != -1) {
                  this.gp = -1;
                  fM = true;
               }

               if (this.fN != 0 && this.fN != 25) {
                  this.fN = 0;
                  fM = true;
               }

               this.fu = var49 == 0 ? -1 : var49;
               fb = true;
               eM = true;
               if (var49 != 26700 && var49 != 2005) {
                  rs.p_n.C_d.b();
                  rs.p_n.p_a.p_a.C_c.b();
               }

               this.eZ = false;
               this.lO = -1;
               return true;
            }

            if (this.lO == 126) {
               String var48 = this.mU.F();
               int var91 = this.mU.T();
               this.lO = -1;

               for (rs.p_n.C_c var203 : rs.p_n.C_d.a) {
                  var203.a(var91, var48);
               }

               if (var91 == 0) {
                  if (var48.startsWith("www.") || var48.startsWith("http://") || var48.startsWith("https://")) {
                     f(var48);
                     this.lO = -1;
                     return true;
                  }

                  if (var48.startsWith(":quicks:")) {
                     this.jn = var48.substring(8).equalsIgnoreCase("on");
                  }

                  if (var48.startsWith(":quickdisable:")) {
                     this.cp = false;
                     this.v.c();
                  }
               }

               if (var91 >= 47709 && var91 <= 47808) {
                  if (var48.startsWith("{L}")) {
                     C_ab.a(var48.replace("{L}", ""), true);
                  } else if (var48.startsWith("{I}")) {
                     C_ab.b(var48.replace("{I}", ""));
                  } else {
                     C_ab.a(var48, false);
                  }

                  this.lO = -1;
                  return true;
               }

               if (var91 >= 47505 && var91 <= 47704) {
                  if (var48.startsWith("{T}")) {
                     C_ab.a(var48.replace("{T}", ""), true, false);
                  } else if (var48.startsWith("{S}")) {
                     C_ab.a(var48.replace("{S}", ""), true, true);
                  } else {
                     C_ab.a(var48, false, false);
                  }

                  this.lO = -1;
                  return true;
               }

               if (var91 >= 46608 && var91 <= 46758) {
                  if (var48.startsWith("{L}")) {
                     C_ba.b(var48.replace("{L}", ""), true);
                  } else if (var48.startsWith("{I}")) {
                     C_ba.b(var48.replace("{I}", ""));
                  } else {
                     C_ba.b(var48, false);
                  }

                  this.lO = -1;
                  return true;
               }

               if (var91 >= 46506 && var91 <= 46606) {
                  if (var48.startsWith("{T}")) {
                     C_ba.a(var48.replace("{T}", ""), true);
                  } else {
                     C_ba.a(var48, false);
                  }

                  this.lO = -1;
                  return true;
               }

               if (var91 >= 18144 && var91 <= 18244) {
                  String var122 = String.valueOf(var48);
                  if (var122.contains(">")) {
                     var122 = var122.split("> ")[1];
                  }

                  this.ju[var91 - 18144] = var122;
               }

               if (var91 >= 25800 && var91 <= 25999) {
                  String var123 = String.valueOf(var48);
                  if (var123.contains(">")) {
                     var123 = var123.split("> ")[1];
                  }

                  this.ju[var91 - 25800 + 100] = var123;
               }

               if (var91 == 55004) {
                  if (var48.equalsIgnoreCase("Track")) {
                     rs.p_n.C_e.H[18551].am[32] = 330;
                     rs.p_n.C_e.H[18551].am[48] = 309;
                  } else {
                     rs.p_n.C_e.H[18551].am[32] = 324;
                     rs.p_n.C_e.H[18551].am[48] = 303;
                  }
               }

               if (var91 != 1) {
                  if (var91 == 2) {
                     this.x.G = var48.equals("null") ? null : var48;
                     return true;
                  }

                  if (var91 == 3) {
                     this.x.H = var48.equals("null") ? null : var48;
                     return true;
                  }

                  if (var91 == 4) {
                     this.x.I = var48.equals("null") ? null : var48;
                     return true;
                  }

                  if (var91 == 5) {
                     this.x.N = Integer.parseInt(var48);
                     return true;
                  }

                  if (var91 == 6) {
                     this.x.O = Integer.parseInt(var48);
                     return true;
                  }

                  if (var91 == 7) {
                     this.x.P = Integer.parseInt(var48);
                     return true;
                  }

                  if (var91 == 8) {
                     this.x.Q = Integer.parseInt(var48);
                     return true;
                  }

                  if (var91 == 9) {
                     String[] var176 = var48.split(",");
                     this.x.M = Integer.parseInt(var176[0]);
                     int var240 = Integer.parseInt(var176[1]);
                     if (var240 > 0) {
                        this.x.y = this.J[var240 - 1];
                     } else {
                        this.x.y = null;
                     }

                     return true;
                  }

                  if (var91 == 10) {
                     int var140 = Integer.valueOf(Integer.parseInt(var48));
                     C_aD_mc.a(var140 + C_aD_mc.bJ, true);
                  }

                  if (var91 == 11) {
                     int var141 = Integer.valueOf(Integer.parseInt(var48));
                     C_aD_mc.b(var141 + C_aD_mc.bJ, false);
                  }

                  if (var91 == 12) {
                     int var142 = Integer.valueOf(Integer.parseInt(var48));
                     C_aD_mc.a(var142 + C_aD_mc.bJ, false);
                  }

                  if (var91 == 13) {
                     String[] var143 = var48.split(",");
                     if (var143.length == 4) {
                        int var208 = Integer.valueOf(Integer.parseInt(var143[0]));
                        int var258 = Integer.valueOf(Integer.parseInt(var143[1]));
                        int var291 = Integer.valueOf(Integer.parseInt(var143[2]));
                        int var316 = Integer.valueOf(Integer.parseInt(var143[3]));
                        this.y.a(var208, var258, var291, var316);
                     }
                  }

                  if (var91 == 14) {
                     String[] var144 = var48.split(",");
                     if (var144.length == 2) {
                        int var209 = Integer.valueOf(Integer.parseInt(var144[0]));
                        int var259 = Integer.valueOf(Integer.parseInt(var144[1]));
                        rs.p_l.p_e.C_q.a var292 = null;
                        switch (var209) {
                           case 1:
                              var292 = rs.p_l.p_e.C_q.a.h;
                              break;
                           case 2:
                              var292 = rs.p_l.p_e.C_q.a.d;
                              break;
                           case 3:
                              var292 = rs.p_l.p_e.C_q.a.g;
                              break;
                           case 4:
                              var292 = rs.p_l.p_e.C_q.a.i;
                              break;
                           case 5:
                              var292 = rs.p_l.p_e.C_q.a.j;
                              break;
                           case 6:
                              var292 = rs.p_l.p_e.C_q.a.k;
                              break;
                           case 7:
                              var292 = rs.p_l.p_e.C_q.a.l;
                              break;
                           case 8:
                              var292 = rs.p_l.p_e.C_q.a.n;
                           case 9:
                           case 10:
                           case 11:
                           case 12:
                           case 13:
                           default:
                              break;
                           case 14:
                              var292 = rs.p_l.p_e.C_q.a.o;
                              break;
                           case 15:
                              var292 = rs.p_l.p_e.C_q.a.p;
                              break;
                           case 16:
                              var292 = rs.p_l.p_e.C_q.a.s;
                              break;
                           case 17:
                              var292 = rs.p_l.p_e.C_q.a.q;
                              break;
                           case 18:
                              var292 = rs.p_l.p_e.C_q.a.r;
                              break;
                           case 19:
                              var292 = rs.p_l.p_e.C_q.a.t;
                              break;
                           case 20:
                              var292 = rs.p_l.p_e.C_q.a.e;
                              break;
                           case 21:
                              var292 = rs.p_l.p_e.C_q.a.v;
                              break;
                           case 22:
                              var292 = rs.p_l.p_e.C_q.a.u;
                              break;
                           case 23:
                              var292 = rs.p_l.p_e.C_q.a.m;
                              break;
                           case 24:
                              var292 = rs.p_l.p_e.C_q.a.w;
                              break;
                           case 25:
                              var292 = rs.p_l.p_e.C_q.a.x;
                              break;
                           case 26:
                              var292 = rs.p_l.p_e.C_q.a.y;
                              break;
                           case 27:
                              var292 = rs.p_l.p_e.C_q.a.z;
                              break;
                           case 28:
                              var292 = rs.p_l.p_e.C_q.a.A;
                              break;
                           case 29:
                              var292 = rs.p_l.p_e.C_q.a.C;
                              break;
                           case 30:
                              var292 = rs.p_l.p_e.C_q.a.D;
                              break;
                           case 31:
                              var292 = rs.p_l.p_e.C_q.a.B;
                              break;
                           case 32:
                              var292 = rs.p_l.p_e.C_q.a.E;
                              break;
                           case 33:
                              var292 = rs.p_l.p_e.C_q.a.G;
                              break;
                           case 34:
                              var292 = rs.p_l.p_e.C_q.a.K;
                              break;
                           case 35:
                              var292 = rs.p_l.p_e.C_q.a.H;
                              break;
                           case 36:
                              var292 = rs.p_l.p_e.C_q.a.S;
                              break;
                           case 37:
                              var292 = rs.p_l.p_e.C_q.a.T;
                              break;
                           case 38:
                              var292 = rs.p_l.p_e.C_q.a.F;
                              break;
                           case 39:
                              var292 = rs.p_l.p_e.C_q.a.L;
                              break;
                           case 40:
                              var292 = rs.p_l.p_e.C_q.a.R;
                              break;
                           case 41:
                              var292 = rs.p_l.p_e.C_q.a.V;
                              break;
                           case 42:
                              var292 = rs.p_l.p_e.C_q.a.W;
                              break;
                           case 43:
                              var292 = rs.p_l.p_e.C_q.a.X;
                              break;
                           case 44:
                              var292 = rs.p_l.p_e.C_q.a.Y;
                              break;
                           case 45:
                              var292 = rs.p_l.p_e.C_q.a.J;
                              break;
                           case 46:
                              var292 = rs.p_l.p_e.C_q.a.M;
                              break;
                           case 47:
                              var292 = rs.p_l.p_e.C_q.a.O;
                              break;
                           case 48:
                              var292 = rs.p_l.p_e.C_q.a.U;
                              break;
                           case 49:
                              var292 = rs.p_l.p_e.C_q.a.P;
                              break;
                           case 50:
                              var292 = rs.p_l.p_e.C_q.a.N;
                              break;
                           case 51:
                              var292 = rs.p_l.p_e.C_q.a.Q;
                        }

                        ArrayList var317 = new ArrayList();
                        boolean var327 = false;

                        for (rs.p_l.p_e.C_q var11 : this.u) {
                           if (var11.a() == var292) {
                              if (var259 > 0) {
                                 var11.a(var259);
                                 var327 = true;
                              } else {
                                 var317.add(var11);
                              }
                           }
                        }

                        for (Object var345Obj : var317) {
                           rs.p_l.p_e.C_q var345 = (rs.p_l.p_e.C_q)var345Obj;
                           this.u.remove(var345);
                        }

                        if (!var327 && var292 != null && var259 > 0) {
                           this.u.add(new rs.p_l.p_e.C_q(this, var292, var259));
                        }
                     }
                  }

                  if (var91 == 15) {
                     String[] var145 = var48.split(",");
                     if (var145.length == 3) {
                        int var210 = Integer.valueOf(Integer.parseInt(var145[0])) - 1;
                        int var260 = Integer.valueOf(Integer.parseInt(var145[1]));
                        int var293 = Integer.valueOf(Integer.parseInt(var145[2]));
                        this.d(var210, var260, var293);
                     }
                  }

                  if (var91 == 16) {
                     int var146 = Integer.valueOf(Integer.parseInt(var48));
                     this.l(var146 - 1);
                  }

                  if (var91 == 17) {
                     int var147 = Integer.valueOf(Integer.parseInt(var48));
                     if (var147 == 0) {
                        long[] var211 = new long[this.kA];

                        for (int var261 = 0; var261 < this.kA; var261++) {
                           var211[var261] = this.lg[var261];
                        }

                        for (long var328 : var211) {
                           this.f(var328);
                        }
                     }
                  }

                  if (var91 == 18) {
                     int var148 = Integer.valueOf(Integer.parseInt(var48));
                     if (var148 >= 24057 && var148 <= 24067) {
                        for (int var224 = 24057; var224 <= 24067; var224++) {
                           rs.p_n.C_e.H[var224].E = var148 == var224 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var224].aG = var148 == var224 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24044 && var148 <= 24049) {
                        for (int var223 = 24044; var223 <= 24049; var223++) {
                           rs.p_n.C_e.H[var223].E = var148 == var223 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var223].aG = var148 == var223 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24039 && var148 <= 24040) {
                        for (int var222 = 24039; var222 <= 24040; var222++) {
                           rs.p_n.C_e.H[var222].E = var148 == var222 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var222].aG = var148 == var222 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24033 && var148 <= 24035) {
                        for (int var221 = 24033; var221 <= 24035; var221++) {
                           rs.p_n.C_e.H[var221].E = var148 == var221 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var221].aG = var148 == var221 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24027 && var148 <= 24029) {
                        for (int var220 = 24027; var220 <= 24029; var220++) {
                           rs.p_n.C_e.H[var220].E = var148 == var220 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var220].aG = var148 == var220 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24019 && var148 <= 24022) {
                        for (int var219 = 24019; var219 <= 24022; var219++) {
                           rs.p_n.C_e.H[var219].E = var148 == var219 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var219].aG = var148 == var219 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24003 && var148 <= 24004) {
                        for (int var218 = 24003; var218 <= 24004; var218++) {
                           rs.p_n.C_e.H[var218].E = var148 == var218 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var218].aG = var148 == var218 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24007 && var148 <= 24008) {
                        for (int var217 = 24007; var217 <= 24008; var217++) {
                           rs.p_n.C_e.H[var217].E = var148 == var217 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var217].aG = var148 == var217 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24011 && var148 <= 24012) {
                        for (int var216 = 24011; var216 <= 24012; var216++) {
                           rs.p_n.C_e.H[var216].E = var148 == var216 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var216].aG = var148 == var216 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 24015 && var148 <= 24016) {
                        for (int var215 = 24015; var215 <= 24016; var215++) {
                           rs.p_n.C_e.H[var215].E = var148 == var215 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var215].aG = var148 == var215 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 61022 && var148 <= 61023) {
                        for (int var214 = 61022; var214 <= 61023; var214++) {
                           rs.p_n.C_e.H[var214].E = var148 == var214 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var214].aG = var148 == var214 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else if (var148 >= 61018 && var148 <= 61019) {
                        for (int var213 = 61018; var213 <= 61019; var213++) {
                           rs.p_n.C_e.H[var213].E = var148 == var213 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var213].aG = var148 == var213 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     } else {
                        int[] var212 = new int[]{
                           51311,
                           51313,
                           59847,
                           59848,
                           59849,
                           59850,
                           59851,
                           59852,
                           25756,
                           25757,
                           25758,
                           25337,
                           25338,
                           54000,
                           45912,
                           45923,
                           61018,
                           61019,
                           61022,
                           61023,
                           54105,
                           54106,
                           54107,
                           54108,
                           60271,
                           60272
                        };

                        for (int var329 : var212) {
                           rs.p_n.C_e.H[var329].E = var148 == var329 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                           rs.p_n.C_e.H[var329].aG = var148 == var329 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                        }
                     }
                  }

                  if (var91 == 19) {
                     int var149 = Integer.valueOf(Integer.parseInt(var48));
                     if (var149 == 0) {
                        this.v.b[2] = new rs.p_l.C_F_uc("orbs/hp_fill");
                     } else if (var149 == 1) {
                        this.v.b[2] = new rs.p_l.C_F_uc("orbs/poison_fill");
                     } else if (var149 == 2) {
                        this.v.b[2] = new rs.p_l.C_F_uc("orbs/venom_fill");
                     }
                  }

                  if (var91 == 20) {
                     String[] var150 = var48.split(",");
                     int var225 = Integer.parseInt(var150[0]);
                     int var264 = Integer.parseInt(var150[1]);
                     rs.p_n.C_e.c(var225, var264, 32);
                  }

                  if (var91 == 21) {
                     String[] var151 = var48.split(",");
                     String var226 = var151[0];
                     int var265 = Integer.valueOf(Integer.parseInt(var151[1]));
                     int var296 = Integer.valueOf(Integer.parseInt(var151[2]));
                     int var320 = Integer.valueOf(Integer.parseInt(var151[3]));
                     rs.p_n.C_e.H[var265].E = new rs.p_l.C_F_uc(var226, var296, var320);
                  }

                  if (var91 == 22) {
                     this.jo = var48.replace("[bl]", "\n") + " ";
                  }

                  if (var91 == 23) {
                     if (var48.equalsIgnoreCase("null")) {
                        this.co = "";
                     } else {
                        this.co = var48;
                     }
                  }

                  if (var91 == 24) {
                     String[] var152 = var48.split(" ");
                     int var227 = Integer.parseInt(var152[0]);
                     this.jp.put(var227, var48);
                  }

                  if (var91 == 25) {
                     String[] var153 = var48.split("/");
                     String var228 = var153[0];
                     int var266 = Integer.parseInt(var153[1]);
                     int var297 = Integer.parseInt(var153[2]);
                     this.z.w = System.currentTimeMillis();
                     this.z.r = var228;
                     this.z.s = var297;
                     this.z.t = var266;
                     this.z.v = -1;
                  }

                  if (var91 == 26) {
                     this.af = var48;
                  }

                  if (var91 == 27) {
                     String[] var154 = var48.split(",");
                     int var229 = Integer.parseInt(var154[0]);
                     int var267 = Integer.parseInt(var154[1]);
                     rs.p_n.C_e.H[var229].E = var267 == 1 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                     rs.p_n.C_e.H[var229].aG = var267 == 1 ? rs.p_n.p_c.C_V_uc.f : rs.p_n.p_c.C_V_uc.g;
                  }

                  if (var91 == 28) {
                     this.O = System.currentTimeMillis() + (long)(Integer.parseInt(var48) * 1000);
                  }

                  if (var91 == 29) {
                     String[] var155 = var48.split(",");
                     this.M = Integer.parseInt(var155[0]);
                     this.N = Integer.parseInt(var155[1]);
                  }

                  if (var91 == 30) {
                     this.L = Integer.parseInt(var48);
                  }

                  if (var91 == 31) {
                     F = Double.parseDouble(var48);
                  }

                  if (var91 == 32) {
                     eR.bd = Integer.parseInt(var48);
                  }

                  if (var91 == 33) {
                     String[] var156 = var48.split(" ");
                     int var230 = Integer.parseInt(var156[0]);
                     int var268 = Integer.parseInt(var156[1]);
                     if (kw_do != null && var230 <= kw_do.length - 1 && kw_do[var230] != null) {
                        kw_do[var230].bd = var268;
                     }
                  }

                  if (var91 == 34) {
                     String[] var157 = var48.split(",");
                     int var231 = Integer.parseInt(var157[0]);
                     int var269 = Integer.parseInt(var157[1]);
                     this.kw_if.put(var231 + "," + var269, true);
                  }

                  if (var91 == 35) {
                     String[] var158 = var48.split(",");
                     int var232 = Integer.parseInt(var158[0]);
                     long var270 = Long.parseLong(var158[1]);
                     int var321 = Integer.parseInt(var158[2]);
                     if (var270 != 0L) {
                        for (rs.p_l.p_e.C_g var339 : this.m.a) {
                           if (var339.m == var270) {
                              var339.i = var232;
                              var339.l = var321;
                           }
                        }

                        for (rs.p_l.p_e.C_g var340 : this.m.b) {
                           if (var340.m == var270) {
                              var340.i = var232;
                              var340.l = var321;
                           }
                        }
                     }
                  }

                  if (var91 == 36) {
                     int var159 = Integer.valueOf(Integer.parseInt(var48));
                     C_av.m(var159);
                  }

                  if (var91 == 37) {
                     int var160 = Integer.valueOf(Integer.parseInt(var48));
                     this.ad.add(var160);
                  }

                  if (var91 == 38) {
                     int var161 = Integer.valueOf(Integer.parseInt(var48));
                     rs.p_n.p_c.C_G_uc.m(var161);
                  }

                  if (var91 == 39) {
                     String[] var162 = var48.split(",");
                     int var233 = Integer.parseInt(var162[0]);
                     int var271 = Integer.parseInt(var162[1]);
                     this.Q = var233;
                     this.R = var271 != -1 ? System.currentTimeMillis() + (long)(var271 * 1000) : -1L;
                  }

                  if (var91 == 40) {
                     int var163 = Integer.parseInt(var48);
                     rs.p_n.C_e.H[var163].bf = false;
                  }

                  if (var91 == 41) {
                     int var164 = Integer.parseInt(var48);
                     rs.p_n.C_e.H[var164].bf = true;
                  }

                  if (var91 == 42) {
                     int var165 = Integer.parseInt(var48);
                     this.x.L = var165;
                  }

                  if (var91 == 43) {
                     String[] var166 = var48.split(" ");
                     int var234 = Integer.parseInt(var166[0]);
                     int var272 = Integer.parseInt(var166[1]);
                     this.s = var234;
                     this.t = var272;
                  }

                  if (var91 == 44) {
                     if (var48.contains(",")) {
                        String[] var167 = var48.split(",");
                        rs.p_n.p_c.C_w.e = var167[0];
                        rs.p_n.p_c.C_w.f = var167[1];
                        rs.p_n.p_c.C_w.h();
                     } else {
                        rs.p_n.p_c.C_w.e = var48;
                        rs.p_n.p_c.C_w.f = null;
                        rs.p_n.p_c.C_w.h();
                     }
                  }

                  if (var91 == 45) {
                     rs.p_n.p_c.C_w.d = var48;
                  }

                  if (var91 == 46) {
                     String[] var168 = var48.split(",");
                     this.aM = Integer.parseInt(var168[0]);
                     this.aN = Integer.parseInt(var168[1]);
                  }

                  if (var91 == 47) {
                     System.out.println(var48);
                  }

                  if (var91 == 48) {
                     this.bT = System.currentTimeMillis() + Long.parseLong(var48);
                  }

                  if (var91 == 49) {
                     this.bS = var48.replace("{n}", "\n");
                  }

                  if (var91 == 53) {
                     String[] var169 = var48.split(" ");
                     int var235 = Integer.valueOf(var169[1]);
                     C_ab.a(var169[0], var235);
                  }

                  if (var91 == 54) {
                     C_Launcher_mc.n().a("SpawnPK RSPS", var48);
                  }

                  if (var91 == 55) {
                     String[] var170 = var48.split(";");
                     int var236 = Integer.parseInt(var170[0]);
                     int var273 = Integer.parseInt(var170[1]);
                     int var298 = Integer.parseInt(var170[4]);
                     int var322 = Integer.parseInt(var170[5]);
                     rs.p_n.p_c.C_b.a(var170[2], var170[3], var236, var273, var298, var322);
                  }

                  if (var91 == 56) {
                     String[] var171 = var48.split(";");
                     String var237 = var171[0];
                     int var274 = Integer.parseInt(var171[1]);
                     int var299 = Integer.parseInt(var171[2]);
                     rs.p_n.p_c.C_b.a(var237, var274, var299);
                  }

                  if (var91 == 57) {
                     this.aL = Double.parseDouble(var48);
                     this.aK = false;
                  }

                  if (var91 == 58) {
                     this.aL = Double.parseDouble(var48);
                     this.aK = true;
                  }

                  if (var91 == 59) {
                     this.aG = var48;
                  }

                  if (var91 == 60) {
                     this.aH = var48;
                  }

                  if (var91 == 61) {
                     this.aI = var48;
                  }

                  if (var91 == 62) {
                     if (var48.equals("FOG_ACTIVE")) {
                        this.aF = true;
                     } else {
                        this.aF = false;
                     }
                  }

                  if (var91 == 63) {
                     String[] var172 = var48.split(" ");
                     int var238 = Integer.parseInt(var172[0]);
                     rs.p_n.C_e.H[var238].V = Integer.parseInt(var172[1]);
                  }

                  if (var91 == 64) {
                     this.x.D = !this.x.D;
                  }

                  if (var91 == 65) {
                     this.x.R = System.currentTimeMillis() + Long.parseLong(var48);
                  }

                  if (var91 == 66) {
                     if (var48.contains("^")) {
                        String[] var173 = var48.split("\\^");
                        this.x.J = var173[0];
                        this.x.K = var173[1];
                     } else {
                        this.x.J = this.x.K = null;
                     }

                     if (this.x.J != null && this.x.J.equalsIgnoreCase("None")) {
                        this.x.J = null;
                     }
                  }

                  if (var91 == 67) {
                     this.x.E = var48.equals("CURSED");
                  }

                  if (var91 == 68) {
                     C_Launcher_mc.n().a("SpawnPK RSPS", var48, true);
                  }

                  if (var91 == 69) {
                     this.k = var48;
                  }

                  if (var91 == 70) {
                     String[] var174 = var48.split(" ");
                     this.aO = Integer.parseInt(var174[0]);
                     this.aP = Integer.parseInt(var174[1]);
                     this.aQ = System.currentTimeMillis() + Long.parseLong(var174[2]);
                     this.aR = var174[3];
                  }

                  if (var91 == 71) {
                     int var175 = Integer.parseInt(var48);

                     for (int var239 = 0; var239 < 60; var239++) {
                        if (var239 == var175) {
                           rs.p_n.C_e.H[50254 + var239].E = rs.p_n.C_e.H[50254 + var239].aG = rs.p_n.p_c.C_G_uc.bI;
                        } else if (rs.p_n.C_e.H[50254 + var239].E.t.contains("sprite 30")) {
                           rs.p_n.C_e.H[50254 + var239].E = rs.p_n.C_e.H[50254 + var239].aG = rs.p_n.p_c.C_G_uc.bJ;
                        }
                     }
                  }

                  if (var91 >= 47000 && var91 <= 47333) {
                     if (var48.contains("\\n")) {
                        rs.p_n.C_e.H[var91].bb = -5;
                     } else {
                        rs.p_n.C_e.H[var91].bb = 0;
                     }
                  }

                  if (var91 > 0) {
                     rs.p_n.C_e.H[var91].at = var48;
                     if (rs.p_n.C_e.H[var91].ah == eT[fL]) {
                        fb = true;
                     }

                     if (var91 == 199 && ed == 197) {
                        this.x.k(!this.x.M());
                     }
                  }

                  return true;
               }

               if (var48.equalsIgnoreCase("CLEAR_CLICK_TEXT_INT")) {
                  for (int var124 = 51320; var124 < 51920; var124++) {
                     rs.p_n.C_e.H[var124].at = "";
                  }
               }

               if (var48.equalsIgnoreCase("TOGGLE_DZONE_HIDE")) {
                  rs.p_f.C_a.aU = !rs.p_f.C_a.aU;
                  this.a("<img=163> Hiding other player's dzone bosses has been toggled: " + (rs.p_f.C_a.aU ? "@blu@ON" : "@red@OFF"), 0, "");
               }

               if (var48.equalsIgnoreCase("RIMMINGTON")
                  || var48.equalsIgnoreCase("TAVERLY")
                  || var48.equalsIgnoreCase("POLLNIVERNEACH")
                  || var48.equalsIgnoreCase("RELLEKA")
                  || var48.equalsIgnoreCase("FALADOR")
                  || var48.equalsIgnoreCase("ARDOUGNE")) {
                  rs.p_f.C_a.af = var48;
               }

               if (var48.equalsIgnoreCase("CLEAR_ENCHANTMENT_CHEST")) {
                  rs.p_n.C_e.H['쑄'].V = 0;
                  rs.p_n.C_e.H['쑉'].at = "Success chance: @gre@N/A";
                  rs.p_n.C_e.H['썌'].at = "N/A";
                  rs.p_n.C_e.H['쑅'].at = "N/A";
               }

               if (var48.startsWith("WHIP_DDS")) {
                  this.cG = 1;
               }

               if (var48.startsWith("RESET_FULL_TEXT_INTERFACE")) {
                  for (int var125 = 51203; var125 < 51303; var125++) {
                     rs.p_n.C_e.H[var125].at = "";
                  }
               }

               if (var48.startsWith("RESET_FULL_TEXT_SCROLL")) {
                  for (int var126 = 51203; var126 < 51303; var126++) {
                     rs.p_n.C_e.H[var126].at = "";
                  }

                  rs.p_n.C_e.H['젂'].V = 0;
               }

               if (var48.startsWith("WHIP_ONLY")) {
                  this.cG = 2;
               }

               if (var48.startsWith("RESET_DUEL_TYPE")) {
                  this.cG = 0;
               }

               if (var48.startsWith("LMS_LOBBY_OVERLAY_ON")) {
                  this.aE = true;
               }

               if (var48.startsWith("LMS_LOBBY_OVERLAY_OFF")) {
                  this.aE = false;
               }

               if (var48.startsWith("HG_LOBBY_OVERLAY_ON")) {
                  this.aJ = true;
               }

               if (var48.startsWith("HG_LOBBY_OVERLAY_OFF")) {
                  this.aJ = false;
               }

               if (var48.startsWith("TOGGLE_EXTENDED_ZOOM")) {
                  rs.p_f.C_a.aO = !rs.p_f.C_a.aO;
                  rs.p_f.C_a.d();
                  C_V_uc.a(rs.p_f.C_a.aO);
               }

               if (var48.equalsIgnoreCase("FORCE_LOAD_ON")) {
                  this.iK = true;
               }

               if (var48.startsWith("SPEC_RESTORE_TICK")) {
                  this.v.j = System.currentTimeMillis();
               }

               if (var48.startsWith("HEALTH_RESTORE_TICK")) {
                  this.v.k = System.currentTimeMillis();
               }

               if (var48.startsWith("COMP_CAPE_RESET_COLORS")) {
                  rs.p_n.p_c.C_w.bJ[4] = eR.aD;
                  rs.p_n.p_c.C_w.bJ[0] = eR.aE;
                  rs.p_n.p_c.C_w.bJ[2] = eR.aF;
                  rs.p_n.p_c.C_w.bJ[1] = eR.aG;
                  rs.p_n.p_c.C_w.bJ[3] = eR.aH;
                  rs.p_n.p_c.C_w.bJ[5] = eR.aI;
               }

               if (var48.startsWith("ITEM_GUIDE_RESET_PREVIEW")) {
                  C_ab.l();
               }

               if (var48.startsWith("ITEM_GUIDE_REFRESH_PREVIEW")) {
                  C_ab.m();
               }

               if (var48.startsWith("ITEM_GUIDE_SELECTED_")) {
                  C_ab.c(var48);
               }

               if (var48.equalsIgnoreCase("ITEM_GUIDE_RESET_CATEGORY_ATTRIBUTES")) {
                  C_ab.h();
               }

               if (var48.equalsIgnoreCase("ITEM_GUIDE_FLUSH_CATEGORIES")) {
                  C_ab.j();
               }

               if (var48.equalsIgnoreCase("ITEM_GUIDE_FLUSH_DESCRIPTION")) {
                  C_ab.i();
               }

               if (var48.equalsIgnoreCase("ITEM_GUIDE_RESET_DESCRIPTION_ATTRIBUTES")) {
                  C_ab.k();
               }

               if (var48.equalsIgnoreCase("ITEM_GUIDE_SET_ITEM_SPRITE")) {
                  rs.p_n.C_e.H['멜'].am[3] = -5000;
                  rs.p_n.C_e.H['멜'].am[4] = -5000;
                  rs.p_n.C_e.h(47706, "wiki/item 0");
               }

               if (var48.equalsIgnoreCase("ITEM_GUIDE_SET_REVERSE_ROTATION")) {
                  C_ab.bM = true;
               }

               if (var48.equalsIgnoreCase("ITEM_GUIDE_RESET_CAT_SCROLL")) {
                  rs.p_n.C_e.H['릐'].V = 0;
               }

               if (var48.startsWith("ITEM_GUIDE_BONUS_WIDGET")) {
                  if (var48.split(" ")[1].equalsIgnoreCase("ON")) {
                     C_ab.a(true);
                  } else {
                     C_ab.a(false);
                  }
               }

               if (var48.startsWith("CLEAR_SYSTEM_UPDATE")) {
                  this.eN = 0L;
                  this.eO = 0;
               }

               if (var48.startsWith("WARN_UPDATE")) {
                  int var127 = Integer.parseInt(var48.split(" ")[1]);
                  if (this.eO != 1) {
                     this.eN = System.currentTimeMillis() + (long)(1000 * var127);
                     this.eO = 2;
                  }
               }

               if (var48.equalsIgnoreCase("cleardialog")) {
                  this.gb = false;
                  this.fN = 0;
                  fM = true;
               }

               if (var48.startsWith("WIKI_SELECTED_")) {
                  C_ba.c(var48);
               }

               if (var48.equalsIgnoreCase("WIKI_RESET_CATEGORY_ATTRIBUTES")) {
                  C_ba.h();
               }

               if (var48.equalsIgnoreCase("WIKI_FLUSH_CATEGORIES")) {
                  C_ba.j();
               }

               if (var48.equalsIgnoreCase("WIKI_RESET_DESCRIPTION_ATTRIBUTES")) {
                  C_ba.i();
               }

               if (var48.equalsIgnoreCase("WIKI_FLUSH_DESCRIPTION")) {
                  C_ba.k();
               }

               if (var48.equalsIgnoreCase("RESET_HOVER_EQUIPMENT")) {
                  this.jp.clear();
               }

               if (var48.equalsIgnoreCase("ENABLE_MONEY_HOVER") || var48.equalsIgnoreCase("ENABLE_OVERLAY_BAR")) {
                  this.ae = true;
               }

               if (var48.equalsIgnoreCase("DISABLE_MONEY_HOVER") || var48.equalsIgnoreCase("DISABLE_OVERLAY_BAR")) {
                  this.ae = false;
               }

               if (var48.equalsIgnoreCase("ENABLE_CLAN_WARS_OVERLAY")) {
                  this.K = true;
               }

               if (var48.equalsIgnoreCase("DISABLE_CLAN_WARS_OVERLAY")) {
                  this.K = false;
                  this.O = 0L;
               }

               if (var48.equalsIgnoreCase("CLEAR_RIGHT_LEADERBOARD_PANEL")) {
                  for (int var128 = 0; var128 < 25; var128++) {
                     rs.p_n.C_e.H[61052 + var128].at = "";
                  }
               }

               if (var48.equalsIgnoreCase("CLEAR_LEFT_LEADERBOARD_PANEL")) {
                  for (int var129 = 0; var129 < 25; var129++) {
                     rs.p_n.C_e.H[61025 + var129].at = "";
                  }
               }

               if (var48.equalsIgnoreCase("QUICK_PRAYERS_ON")) {
                  this.cp = true;
                  this.v.c();
               }

               if (var48.equalsIgnoreCase("QUICK_PRAYERS_OFF")) {
                  this.cp = false;
                  this.v.c();
               }

               if (var48.equalsIgnoreCase("CLEAR_VERZIK_REGION_OFF")) {
                  this.aB = false;
               }

               if (var48.equalsIgnoreCase("CLEAR_VERZIK_REGION_ON")) {
                  this.aB = true;
               }

               if (var48.equalsIgnoreCase("CONSTRUCTION_BUILD_OFF")) {
                  rs.p_f.C_a.ae = false;
               }

               if (var48.equalsIgnoreCase("CONSTRUCTION_BUILD_ON")) {
                  rs.p_f.C_a.ae = true;
               }

               if (var48.equalsIgnoreCase("PROMPT_ENTER_DESCRIPTION")) {
                  this.ev = 0;
                  fM = true;
                  this.fN = 31;
                  this.gb = true;
                  this.fB = "";
                  this.eQ = "Enter description";
               }

               if (var48.startsWith("PROMPT_DESC,,")) {
                  this.ev = 0;
                  fM = true;
                  this.fN = 31;
                  this.gb = true;
                  this.fB = "";
                  this.eQ = var48.split(",,")[1];
               }

               if (var48.equalsIgnoreCase("PROMPT_ENTER_YELL_TAG")) {
                  this.ev = 0;
                  fM = true;
                  this.fN = 32;
                  this.gb = true;
                  this.fB = "";
                  this.eQ = "Enter yell tag";
               }

               if (var48.equalsIgnoreCase("PROMPT_ENTER_TITLE")) {
                  this.ev = 0;
                  fM = true;
                  this.fN = 33;
                  this.gb = true;
                  this.fB = "";
                  this.eQ = "Enter title";
               }

               if (var48.equalsIgnoreCase("BEGIN_TUTORIAL")) {
                  this.cY = 2;
               }

               if (var48.equalsIgnoreCase("BEGIN_ADVENTURE")) {
                  this.cY = 5;
               }

               if (var48.equalsIgnoreCase("BEGIN_ADVENTURE_ORB")) {
                  this.cY = 6;
               }

               if (var48.equalsIgnoreCase("BEGIN_ADVENTURE_BOOK")) {
                  this.cY = 7;
               }

               if (var48.equalsIgnoreCase("END_ADVENTURE")) {
                  this.cY = 0;
               }

               if (var48.equalsIgnoreCase("SUMMER_2020_ON")) {
                  this.aD = true;
               }

               if (var48.equalsIgnoreCase("SUMMER_2020_OFF")) {
                  this.aD = false;
               }

               if (var48.equalsIgnoreCase("RAID_INSTANCE_ON")) {
                  this.aC = true;
               }

               if (var48.equalsIgnoreCase("RAID_INSTANCE_OFF")) {
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

               if (var48.equalsIgnoreCase("CLEAR_DROP_SEARCH")) {
                  rs.p_n.C_e.H['랢'].V = 0;

                  for (int var130 = 47011; var130 <= 47110; var130++) {
                     rs.p_n.C_e.H[var130].at = "";
                  }
               }

               if (var48.equalsIgnoreCase("CLEAR_DROP_INTERFACE")) {
                  int var131 = 47115;
                  rs.p_n.C_e.H['렊'].V = 0;

                  for (int var204 = 0; var204 < 43; var204++) {
                     int var10001 = ++var131;
                     var131++;
                     rs.p_n.C_e.H[var10001].af = -1;
                     rs.p_n.C_e.H[var131++].at = "";
                     rs.p_n.C_e.H[var131++].at = "";
                     rs.p_n.C_e.H[var131++].at = "";
                  }
               }

               if (var48.equalsIgnoreCase("CLEAR_ACHIEVEMENT_TAB")) {
                  rs.p_n.p_c.C_b.d.clear();
               }

               if (var48.equalsIgnoreCase("BUILD_ACHIEVEMENT_TAB")) {
                  rs.p_n.p_c.C_b.h();
               }

               if (var48.startsWith("clearcc")) {
                  String[] var136 = var48.split(" ");
                  int var205 = Integer.parseInt(var136[1]);
                  if (var205 < 18144) {
                     var205 = 18144;
                  }

                  if (var205 <= 18224) {
                     for (int var254 = var205; var254 <= 18244; var254++) {
                        rs.p_n.C_e.H[var254].at = "";
                        this.ju[var254 - 18144] = null;
                     }

                     for (int var255 = 25800; var255 <= 25998; var255++) {
                        rs.p_n.C_e.H[var255].at = "";
                        this.ju[var255 - 25800 + 100] = null;
                     }
                  }

                  if (var205 >= 25800) {
                     for (int var256 = var205; var256 <= 25998; var256++) {
                        rs.p_n.C_e.H[var256].at = "";
                        this.ju[var256 - 25800 + 100] = null;
                     }
                  }
               }

               if (var48.equalsIgnoreCase("togglebh")) {
                  rs.p_f.C_a.au = !rs.p_f.C_a.au;
                  rs.p_f.C_a.d();
                  this.a("<img=8> Bounty streak streak display is now: " + (rs.p_f.C_a.au ? "@blu@ENABLED" : "@red@DISABLED"), 0, "");
               }

               if (var48.equalsIgnoreCase("clear_exchange")) {
                  C_ae.c.clear();
               }

               if (var48.startsWith("add_exchange")) {
                  String var137 = var48.split(" ")[1];
                  String[] var206 = var137.split(",");
                  int var257 = Integer.valueOf(var206[0]);
                  int var290 = Integer.valueOf(var206[1]);
                  C_ae.c.add(new Integer[]{var257, var290});
               }

               if (var48.equalsIgnoreCase("update_exchange")) {
                  C_ae.h();
               }

               if (var48.equalsIgnoreCase("clearsellmarket")) {
                  C_au.h();
               }

               if (var48.startsWith("LOGIN_REWARD_IDX")) {
                  String[] var138 = var48.split(" ");
                  this.P = Integer.valueOf(Integer.parseInt(var138[1]));
               }

               if (var48.equalsIgnoreCase("clearinvoverlay") && this.gp != -1) {
                  this.gp = -1;
                  fM = true;
               }

               if (var48.equalsIgnoreCase("RESET_BLOOD_POOL_SHOP_SLOTS")) {
                  this.ad.clear();
               }

               if (var48.equalsIgnoreCase("RESET_BLOOD_TREE_SCROLL")) {
                  rs.p_n.C_e.H[65600].V = rs.p_n.C_e.H[65600].aH;
               }

               if (var48.equalsIgnoreCase("clearbuymarket")) {
                  C_at.h();
                  rs.p_n.C_e.H[65803].V = 0;
               }

               if (var48.startsWith("setsellitem")) {
                  String[] var139 = var48.split(",");
                  int var207 = Integer.valueOf(Integer.parseInt(var139[1]));
                  rs.p_n.C_e.c(25342, var207, 32);
               }

               if (var48.startsWith("DISABLE_QUICK_PRAYERS")) {
                  this.cp = false;
                  this.v.c();
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
               int var47 = this.mU.U();
               int var90 = this.mU.A();
               rs.p_n.C_e.H[var47].ae = 1;
               rs.p_n.C_e.H[var47].af = var90;
               this.lO = -1;
               return true;
            }

            if (this.lO == 122) {
               int var46 = this.mU.U();
               int var89 = this.mU.U();
               int var120 = var89 >> 10 & 31;
               int var202 = var89 >> 5 & 31;
               int var253 = var89 & 31;
               rs.p_n.C_e.H[var46].ad = (var120 << 19) + (var202 << 11) + (var253 << 3);
               this.lO = -1;
               return true;
            }

            if (this.lO == 53) {
               fb = true;
               int var45 = this.mU.A();
               rs.p_n.C_e var88 = rs.p_n.C_e.H[var45];
               int var119 = this.mU.A();

               for (int var200 = 0; var200 < var119; var200++) {
                  int var252 = this.mU.y();
                  if (var252 == 255) {
                     var252 = this.mU.Y();
                  }

                  int var289 = this.mU.U();
                  var88.az[var200] = var289;
                  var88.ax[var200] = var252;
               }

               for (int var201 = var119; var201 < var88.az.length; var201++) {
                  var88.az[var201] = 0;
                  var88.ax[var201] = 0;
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 230) {
               int var44 = this.mU.T();
               int var87 = this.mU.A();
               int var118 = this.mU.A();
               int var199 = this.mU.U();
               rs.p_n.C_e.H[var87].aU = var118;
               rs.p_n.C_e.H[var87].aV = var199;
               rs.p_n.C_e.H[var87].aT = var44;
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
                  int var43 = this.lE * 128 + 64;
                  int var86 = this.lF * 128 + 64;
                  int var117 = this.c(dw, var86, var43) - this.lG;
                  int var198 = var43 - cJ;
                  int var251 = var117 - cK;
                  int var288 = var86 - cL;
                  int var315 = (int)Math.sqrt((double)(var198 * var198 + var288 * var288));
                  this.cR = (int)(Math.atan2((double)var251, (double)var315) * 325.949) & 2047;
                  this.cS = (int)(Math.atan2((double)var198, (double)var288) * -325.949) & 2047;
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
               int var42 = this.mU.A();
               this.C(var42);
               if ((!rs.p_n.C_e.H[199].at.contains("LMS") || ed != 197 || eR.ay != 6095) && this.fu != -1) {
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

               if (var42 == 8134) {
                  rs.p_n.C_e.H[8143].V = 0;
               }

               if (var42 == 35000) {
                  C_ai.e = -1;
               }

               if (var42 == 47500) {
                  C_ab.l();
               }

               if (var42 == 63036) {
                  rs.p_n.p_c.C_w.i();
               }

               cH = var42;
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
               int var41 = this.mU.S();
               int var85 = this.mU.X();
               this.mj[var41] = var85;
               if (this.dP[var41] != var85) {
                  this.dP[var41] = var85;
                  this.B(var41);
                  fb = true;
                  if (this.en != -1) {
                     fM = true;
                  }
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 36) {
               int var40 = this.mU.S();
               byte var84 = this.mU.z();
               this.mj[var40] = var84;
               if (this.dP[var40] != var84) {
                  this.g("@blu@PACKET 36:@bla@ Setting " + var40 + " to " + var84);
                  this.dP[var40] = var84;
                  this.B(var40);
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
               int var39 = this.mU.A();
               int var83 = this.mU.B();
               rs.p_n.C_e var116 = rs.p_n.C_e.H[var39];
               var116.aD = var83;
               int[] var197 = new int[]{4883, 4888, 4894, 4901, 969, 974, 980, 987};

               for (int var9 : var197) {
                  if (var39 == var9) {
                     var116.aT = 2000;
                     var116.aU = 100;
                     var116.aV = 1900;
                     break;
                  }
               }

               if (var83 == -1) {
                  var116.ar = 0;
                  var116.F = 0;
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 219) {
               if ((!rs.p_n.C_e.H[199].at.contains("LMS") || ed != 197 || eR.ay != 6095) && this.fu != -1) {
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
               int var38 = this.mU.A();
               rs.p_n.C_e var82 = rs.p_n.C_e.H[var38];

               while (this.mU.h < this.lN) {
                  int var4 = this.mU.f();
                  int var5 = this.mU.A();
                  int var6 = this.mU.y();
                  if (var6 == 255) {
                     var6 = this.mU.D();
                  }

                  if (var4 >= 0 && var4 < var82.az.length) {
                     var82.az[var4] = var5;
                     var82.ax[var4] = var6;
                  }
               }

               this.lO = -1;
               return true;
            }

            if (this.lO == 105
               || this.lO == 84
               || this.lO == 147
               || this.lO == 215
               || this.lO == 4
               || this.lO == 117
               || this.lO == 156
               || this.lO == 44
               || this.lO == 160
               || this.lO == 101
               || this.lO == 151) {
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
               int var37 = this.mU.S();
               this.C(var37);
               if (this.fN == 25 && this.gb) {
                  this.gb = false;
               }

               this.gp = var37;
               fM = true;
               this.eZ = false;
               this.lO = -1;
               return true;
            }

            rs.p_v.C_a.e("T1 - " + this.lO + "," + this.lN + " - " + this.jQ + "," + this.jR);
            this.br();
         } catch (IOException var34) {
            this.x();
         } catch (Exception var35) {
            var35.printStackTrace();
            if (rs.p_f.C_a.d) {
               System.out.println("Previous packets: ");

               for (int var3 : jC) {
                  System.out.println(var3);
               }
            }

            String var36 = "T2 - " + this.lO + "," + this.jQ + "," + this.jR + " - " + this.lN + "," + (eh + eR.k[0]) + "," + (ei + eR.l[0]) + " - ";

            for (int var81 = 0; var81 < this.lN && var81 < 50; var81++) {
               var36 = var36 + this.mU.g[var81] + ",";
            }

            rs.p_v.C_a.e(var36);
            this.br();
         }

         return true;
      }
   }

   public final void a(int[] var1, int var2, int var3, int var4) {
      if (var2 >= 128 && var4 >= 128 && var2 <= 13056 && var4 <= 13056) {
         int var5 = this.c(dw, var4, var2) - var3;
         var2 -= cJ;
         var5 -= cK;
         var4 -= cL;
         int var6 = rs.p_a.C_h.bA[this.cR];
         int var7 = rs.p_a.C_h.bB[this.cR];
         int var8 = rs.p_a.C_h.bA[this.cS];
         int var9 = rs.p_a.C_h.bB[this.cS];
         int var10 = var4 * var8 + var2 * var9 >> 16;
         var4 = var4 * var9 - var2 * var8 >> 16;
         var10 = var5 * var7 - var4 * var6 >> 16;
         var4 = var5 * var6 + var4 * var7 >> 16;
         byte var11 = 9;
         int var12 = rs.p_f.C_a.aO ? 4500 : 3500;
         if (var4 >= 50 && var4 <= var12) {
            var1[0] = rs.p_l.C_E_uc.s + (var10 << var11) / var4;
            var1[1] = rs.p_l.C_E_uc.t + (var10 << var11) / var4;
            var1[2] = var4;
            var1[3] = rs.p_l.C_E_uc.s + (var10 / 2 << var11) / var4;
            var1[4] = rs.p_l.C_E_uc.t + (var10 / 2 << var11) / var4;
            var1[5] = rs.p_l.C_E_uc.s + (var10 / 2 << var11) / var4;
            var1[6] = rs.p_l.C_E_uc.t + (var10 / 2 << var11) / var4;
         } else {
            var1[0] = 0;
            var1[1] = 0;
            var1[2] = 0;
            var1[3] = 0;
            var1[4] = 0;
            var1[5] = 0;
            var1[6] = 0;
         }
      } else {
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = 0;
         var1[6] = 0;
      }
   }

   private void bQ() {
      fv.a(130);
      if ((!rs.p_n.C_e.H[199].at.contains("LMS") || ed != 197 || eR.ay != 6095) && this.fu != -1) {
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

   public static String o(int var0) {
      String var1 = String.valueOf(var0);

      for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 8) {
         var1 = "@gre@" + var1.substring(0, var1.length() - 8) + " million @whi@(" + var1 + ")";
      } else if (var1.length() > 4) {
         var1 = "@cya@" + var1.substring(0, var1.length() - 4) + "K @whi@(" + var1 + ")";
      }

      return " " + var1;
   }

   public C_Client_mc() {
      rs.p_l.C_C_uc.b = this;
      this.iy = new ArrayList<>(10000);
      this.iz = new ArrayList<>();
      this.jF = new int[104][104];
      this.jG = new int[350];
      this.jH = new C_h[4][104][104];
      this.jK = false;
      this.jM = new rs.p_x.C_e(new byte[rs.p_f.C_a.bt]);
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
      this.dG = new rs.p_l.C_F_uc[15];
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
      this.dS = new rs.p_l.C_F_uc[20];
      this.lB = new int[5];
      this.lD = false;
      this.lL = 2301979;
      this.dY = "";
      this.ea = new C_h();
      this.lT = false;
      ed = -1;
      this.eg = new int[5];
      this.md = false;
      this.me = new rs.p_l.C_F_uc[100];
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
      this.mW = new rs.p_l.C_F_uc[21];
      this.eK = new rs.p_l.C_F_uc[20];
      this.mX = new rs.p_l.C_F_uc[20];
      eM = false;
      this.eQ = "";
      this.nh = new String[5];
      this.ni = new boolean[5];
      this.eS = new int[4][13][13];
      this.nj = 2;
      this.no = new rs.p_l.C_F_uc[1000];
      this.np = false;
      this.eZ = false;
      this.fa = new rs.p_l.C_F_uc[8];
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
      fE = new rs.p_l.C_F_uc[107];
      fL = 3;
      fM = false;
      this.oj = true;
      this.fO = new int[152];
      this.fP = new C_f[4];
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

   public static void f(String var0) {
      if (Desktop.getDesktop().isSupported(Action.BROWSE)) {
         try {
            URI var7 = new URI(var0);
            Desktop.getDesktop().browse(var7);
            return;
         } catch (IOException | URISyntaxException var6) {
            var6.printStackTrace();
         }
      }

      String var1 = System.getProperty("os.name");

      try {
         if (var1.toLowerCase().indexOf("mac") >= 0) {
            Runtime var2 = Runtime.getRuntime();
            var2.exec("open " + var0);
         } else if (var1.toLowerCase().indexOf("win") >= 0) {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + var0);
         } else {
            String[] var8 = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
            String var3 = null;

            for (int var4 = 0; var4 < var8.length && var3 == null; var4++) {
               if (Runtime.getRuntime().exec(new String[]{"which", var8[var4]}).waitFor() == 0) {
                  var3 = var8[var4];
               }
            }

            if (var3 == null) {
               throw new Exception("Could not find web browser");
            }

            Runtime.getRuntime().exec(new String[]{var3, var0});
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void ad() {
      if (this.au()) {
         long var1 = System.nanoTime();
         long var3 = var1 - this.gB;
         this.gB = var1;
         if (this.fc) {
            this.e(var3);
         }
      }
   }

   public void e(long var1) {
      double var3 = b(this.ar(), var1);
      double var5 = b(this.ap(), var1);
      if (gC <= -5000000.0) {
         gC = 0.0;
      }

      if (gC >= 5000000.0) {
         gC = 0.0;
      }

      gC += var3 / 2.0;
      gD += var5 / 2.0;
      gD = com.google.a.m.d.a(gD, Math.PI / 8, this.aq() ? Math.PI / 2 : 1.175029283520401);
      int var7 = b(gC);
      int var8 = b(gD);
      this.r(var7);
      this.q(var8);
   }

   public static int b(double var0) {
      return (int)(var0 / 0.0030679615757712823) & 2047;
   }

   public static double b(int var0, long var1) {
      double var3 = (double)var0 * 0.0030679615757712823;
      double var5 = (double)var1 / 2.0E7;
      return var3 * var5;
   }

   public int ae() {
      return this.ax() && this.aC() ? (int)(((double)this.B().getWidth() - this.aF().getWidth()) / 2.0) : 0;
   }

   public int af() {
      return this.ax() && this.aC() ? (int)(((double)this.B().getHeight() - this.aF().getHeight()) / 2.0) : 0;
   }

   public int ag() {
      return !ai() ? 4 : 0;
   }

   public int ah() {
      return !ai() ? 4 : 0;
   }

   public static boolean ai() {
      return rs.p_f.C_a.ai == rs.p_f.C_a.c.b;
   }

   public static boolean aj() {
      return rs.p_f.C_a.ai == rs.p_f.C_a.c.a;
   }

   public void p(int var1) {
      this.gH = var1;
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

   public void q(int var1) {
      this.fs = var1;
   }

   public void r(int var1) {
      this.ft = var1;
   }

   public boolean aq() {
      return C_V_uc.g;
   }

   public void s(int var1) {
      this.nN = var1;
   }

   public int ar() {
      return this.nM;
   }

   public void t(int var1) {
      this.nM = var1;
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
      return this.az() && !ai() && rs.p_k.C_e.a() && this.fc;
   }

   public boolean az() {
      return rs.p_k.C_e.a() && rs.p_k.C_b.i;
   }

   public boolean aA() {
      return oQ;
   }

   public void f(boolean var1) {
      oQ = var1;
   }

   public boolean aB() {
      return rs.p_k.C_b.l;
   }

   public boolean aC() {
      return rs.p_k.C_b.j;
   }

   public void u(int var1) {
      oR = 1.0 + (double)var1 / 100.0;
   }

   public double aD() {
      return oR;
   }

   public Dimension aE() {
      if (!this.ay()) {
         this.gI.getSize();
      }

      if (oT == null) {
         if (ai()) {
            Container var1 = this.aY();
            int var2 = var1.getWidth();
            int var3 = var1.getHeight();
            int var4 = (int)((double)var2 / oR);
            int var5 = (int)((double)var3 / oR);
            if (var4 < 765 || var5 < 503) {
               double var6 = (double)var2 / 765.0;
               double var8 = (double)var3 / 503.0;
               double var10 = Math.min(var6, var8);
               var4 = (int)((double)var2 / var10);
               var5 = (int)((double)var3 / var10);
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
         Component var1 = this.B();
         if (this.gI == null) {
            this.aX();
            return this.aE();
         }

         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         Dimension var4 = this.aE();
         if (this.aC()) {
            double var5 = var4.getWidth() / var4.getHeight();
            int var7 = (int)((double)var3 * var5);
            if (var7 > var2) {
               int var8 = (int)((double)var2 / var5);
               if ((double)(this.B().getHeight() - var8) / 2.0 <= 0.0) {
                  var3 = var8;
               }
            } else {
               var2 = var7;
            }
         }

         if (this.aB()) {
            if (var2 > var4.width) {
               var2 -= var2 % var4.width;
            }

            if (var3 > var4.height) {
               var3 -= var3 % var4.height;
            }
         }

         oS = new Dimension(var2, var3);
      }

      return oS;
   }

   public void g(boolean var1) {
      oT = null;
      oS = null;
      if (var1 && ai()) {
      }
   }

   public rs.p_runelite.p_a.C_f aG() {
      return C_V_uc.t != -1 && C_V_uc.u != -1 ? rs.p_runelite.p_a.C_f.a(C_V_uc.t, C_V_uc.u) : null;
   }

   public int aH() {
      return this.eV - 1;
   }

   public int aI() {
      int var1 = this.eV - 1;
      return var1 < 0 ? -1 : this.eI[var1];
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
      int var0 = 0;

      for (int var1 = 0; var1 < 99; var1++) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0 * Math.pow(2.0, (double)var2 / 7.0));
         var0 += var3;
         lU[var1] = var0 / 4;
      }

      fQ = new int[32];
      byte var4 = 2;

      for (int var5 = 0; var5 < 32; var5++) {
         fQ[var5] = var4 - 1;
         var4 += var4;
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

      void a(C_Client_mc var1, int var2) {
         this.a = var1.eI[var2];
         this.b = var1.eJ[var2];
         this.c = var1.eF[var2];
         this.d = var1.eG[var2];
         this.e = var1.eH[var2];
         this.l = var1.fx[var2];
         this.k = rs.p_n.C_e.H[this.d];
         this.f = a(this.k, C_Client_mc.cH) ? C_Client_mc.cH : -1;
         this.g = a(this.k, var1.fu) ? var1.fu : -1;
         this.h = a(this.k, var1.gp) ? var1.gp : -1;
         this.i = C_Client_mc.fL;
         this.j = a(this.k, C_Client_mc.eT[this.i]) ? C_Client_mc.eT[this.i] : -1;
      }

      private static boolean a(rs.p_n.C_e var0, int var1) {
         if (var1 < 0) {
            return false;
         } else {
            int var2 = 0;

            while (var0 != null && var2 < 32) {
               if (var0.aw != var1 && var0.ah != var1) {
                  int var3 = var0.ah;
                  if (var3 != var0.aw && var3 >= 0 && var3 < rs.p_n.C_e.H.length) {
                     var0 = rs.p_n.C_e.H[var3];
                     var2++;
                     continue;
                  }

                  return false;
               }

               return true;
            }

            return false;
         }
      }

      boolean a(C_Client_mc var1) {
         rs.p_n.C_e var2 = rs.p_n.C_e.H[this.d];
         return (this.f == -1 || this.f == C_Client_mc.cH)
            && (this.g == -1 || this.g == var1.fu)
            && (this.h == -1 || this.h == var1.gp)
            && (this.j == -1 || this.j == C_Client_mc.eT[this.i])
            && var2 != null
            && var2 == this.k
            && var2.az != null
            && this.c >= 0
            && this.c < var2.az.length
            && var2.az[this.c] == this.b + 1;
      }
   }
}
