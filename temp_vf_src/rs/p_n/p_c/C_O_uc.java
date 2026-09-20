package rs.p_n.p_c;

import java.util.ArrayList;
import java.util.List;

public class C_O_uc extends rs.p_n.C_c {
   public static rs.p_q.p_a.p_a.C_a c = new C_P_uc();
   static final rs.p_n.p_b.p_a.C_d d = new C_Q_uc(1000L);
   public static final String e = "@gre@<img=24> Active";
   public static long f = 0L;
   public static String g = "";
   public static long bI = 0L;
   public static int bJ = 995;
   public static int bK = 1;
   public static String bL = "";
   public static long bM = 0L;
   public static long bN = 0L;
   public static String bO = "Event Global Boss";
   public static long bP = -1L;
   public static String bQ = "Event Wildy Boss";
   public static long bR = -1L;
   public static long bS = -1L;
   public static long bT = -1L;
   public static List<String> bU = new ArrayList<>();
   public static List<Long> bV = new ArrayList<>();

   public C_O_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(40087);
      c(40088, 7, "gameframe/SPRITE");
      a(62150, "Hotspot: @or2@N/A", this.a, 0, 16750623, true, true);
      a(62151, "@yel@N/A", this.a, 0, 16750623, true, true);
      a(62152, Boolean.valueOf(false));
      H['\uf2c8'].P = 4;
      H['\uf2c8'].ac = 11;
      a(62153, 1, 0, 62154, 1, "gameframe/skip", 16, 15, "Vote to skip hotspot");
      a(62154, 2, "gameframe/skip", 16, 15, 62155);
      a(62156, "@yel@0 / 55", this.a, 0, 16750623, false, true);
      a(40089, "<img=128> Dharok PK Tournament", this.a, 0, 16750623, true, true);
      a(40090, "@yel@Starts in.. <img=37> 4:47:17", this.a, 0, 16750623, true, true);
      a(40091, Boolean.valueOf(false));
      H['鲛'].P = 4;
      H['鲛'].ac = 11;
      H['鲛'].az[0] = 16002;
      H['鲛'].ax[0] = 1;
      a(40092, "<img=245>Golden HG", this.a, 0, 16750623, true, true);
      a(40093, "<img=261>Blood LMS", this.a, 0, 16750623, true, true);
      a(40094, "@yel@<img=37> 26:57", this.a, 0, 16750623, true, true);
      a(40095, "@gre@<img=24> Active", this.a, 0, 16750623, true, true);
      a(40096, "gameframe/button", 1, 150, 32, "<img=100> View all events", -1, 40097, 1);
      a(40097, "gameframe/button", 2, 150, 32, 40098);
      a(40099, "<img=100> View Active Events", this.a, 0, 16751360, true, true);
      a(40101, "<img=82> Event Global Boss:@yel@ <img=37> None", this.a, 0, 16750623, false);
      a(40102, "<img=82> Event Wildy Boss:@yel@ <img=37> None", this.a, 0, 16750623, false);
      a(40103, "<img=82> Event Brawl:@yel@ <img=37> None", this.a, 0, 16750623, false);
      byte var2 = 24;
      short var3 = 0;
      byte var4 = 0;
      int var5 = 0;
      rs.p_n.C_e var6 = d(40100);
      var6.k(20);
      var6.P = 168;
      var6.aR = 225 - var2;
      var6.aH = 750;
      var4 = -10;
      var6.b(var5++, 40088, var4, 5);
      var3 = 163;
      var6.b(var5++, 62150, var4 + 117 - 5, var3 + 4);
      var6.b(var5++, 62151, var4 + 78 + 5 - 5, var3 + 15 + 11 - 1);
      var6.b(var5++, 62152, var4 + 13, var3 + 15 + 4 - 18);
      var6.b(var5++, 62153, var4 + 113 + 4 + 5 - 5, var3 + 12 + 11 - 1);
      var6.b(var5++, 62154, var4 + 113 + 4 + 5 - 5, var3 + 12 + 11 - 1);
      var6.b(var5++, 62156, var4 + 133 + 4 + 5 - 5, var3 + 15 + 11 - 1);
      short var10 = 106;
      var6.b(var5++, 40089, var4 + 117 - 5, var10 + 4);
      var6.b(var5++, 40090, var4 + 117 - 5, var10 + 15 + 11 - 1);
      var6.b(var5++, 40091, var4 + 13, var10 + 15 + 4 - 15);
      var10 = (byte)52;
      var6.b(var5++, 40092, var4 + 50, var10);
      var6.b(var5++, 40093, var4 + 50 + 85, var10);
      var6.b(var5++, 40094, var4 + 50, var10 + 23);
      var6.b(var5++, 40095, var4 + 50 + 85, var10 + 23);
      var4 = 10;
      var10 = (byte)8;
      var6.b(var5++, 40096, var4, var10);
      var6.b(var5++, 40097, var4, var10);
      var6.b(var5++, 40099, var4 + 75, var10 + 11);
      var10 = 220;
      var4 = 5;
      var6.b(var5++, 40101, var4, var10);
      var6.b(var5++, 40102, var4, var10 + 18);
      var6.b(var5++, 40103, var4, var10 + 18 + 18);

      for (int var7 = 0; var7 < var5; var7++) {
         var6.bc[var7] = var6.bc[var7] - 5;
      }

      var1.k(4);
      var1.b(0, 32000, 0, 0);
      var1.b(1, 16022, 0, 28 + var2);
      var1.b(2, 16023, 4, 251);
      var1.b(3, 40100, 6, 30 + var2);
      rs.p_n.p_b.C_a.d.a(40087, d);
      C_R_uc var37 = new C_R_uc(this, 0L);
      C_S_uc var8 = new C_S_uc(this, 0L, var37);
      rs.p_n.p_b.C_a.b.a(62150, var8);
      rs.p_n.p_b.C_a.b.a(62151, var8);
      rs.p_n.p_b.C_a.b.a(62152, var8);
      rs.p_n.p_b.C_a.b.a(62156, var8);
      rs.p_n.p_b.C_a.b.a(62153, var37);
   }
}
