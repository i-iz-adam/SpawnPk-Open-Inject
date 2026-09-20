package rs;

import java.applet.Applet;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import rs.p_gui.C_Launcher_mc;
import rs.p_runelite.p_events.C_FocusChanged_mc;

public class C_C_uc
   extends Applet
   implements ComponentListener,
   FocusListener,
   KeyListener,
   MouseListener,
   MouseMotionListener,
   MouseWheelListener,
   WindowListener,
   Runnable {
   public C_b gI;
   static C_C_uc gJ = null;
   static long gK = 0L;
   static boolean gL = false;
   static int gM = 20;
   static int gN = 1;
   volatile boolean gO;
   boolean gP;
   volatile boolean gQ;
   public static int gR = 0;
   static long[] gS = new long[32];
   static long[] gT = new long[32];
   static int gU;
   static int gV = 500;
   static volatile boolean gW = true;
   static long gX = -1L;
   static long gY = -1L;
   public rs.p_l.C_C_uc gZ;
   public rs.p_l.C_C_uc ha;
   volatile long hb;
   int hc = 0;
   int hd = 0;
   public static int he = 1500;
   public static int hf = 900;
   static int hg;
   long hh = System.currentTimeMillis();
   public static int hi;
   public static int hj;
   protected int hk;
   protected int hl;
   int hm;
   int hn;
   int ho;
   int hp;
   private boolean a = false;
   static rs.p_g.C_b hq;
   static long hr;
   static long hs;
   private int b = 0;
   private int c = 0;
   public boolean ht;
   public int hu;
   public int hv;
   public int hw;
   public int hx;
   public static boolean hy = false;
   public static boolean hz = false;
   private static final Stroke d = new BasicStroke(2.0F);
   private static final Stroke e = new BasicStroke(3.0F);
   private static final double f = 0.0030679615757712823;
   public static final int[] hA = new int[2048];
   public static final int[] hB = new int[2048];
   private int g;
   int hC;
   private final long[] h;
   boolean hD;
   public int hE;
   public int hF;
   public Graphics hG;
   public C_E_uc hH;
   public boolean hI;
   public boolean hJ;
   public int hK;
   public long hL;
   int hM;
   private volatile boolean i;
   private volatile int j;
   public static int hN;
   public static int hO;
   public static int hP;
   public static int hQ;
   protected final rs.p_m.C_a hR = new rs.p_m.C_a();
   protected volatile boolean hS;
   protected volatile int hT;
   private int k = 1;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private long q;
   public int hU;
   int hV;
   int hW;
   long hX;
   public final int[] hY;
   private final int[] r;
   private int s;
   private int t;
   public static int hZ;

   public C_C_uc() {
      this.hb = 0L;
      this.g = 20;
      this.hC = 1;
      this.h = new long[10];
      this.hD = false;
      this.hI = true;
      this.hJ = true;
      this.hY = new int[128];
      this.r = new int[128];
   }

   void aT() {
      long var1 = bf();
      gT[gU] = var1;
      gU = gU + 1 & 31;
      this.a();
      this.q();
      this.s = this.t;
   }

   final synchronized void aU() {
      if (!gL) {
         gL = true;
      }
   }

   public final void l(int var1, int var2) {
      gJ = this;
      this.hE = var2;
      this.hF = var1;
      this.hH = new C_E_uc(this, this.hE, this.hF);
      this.hG = this.B().getGraphics();
      this.ha = new rs.p_l.C_C_uc(this.hE, this.hF, this.B());
      this.gZ = new rs.p_l.C_C_uc(this.hE, this.hF, this.B());
      this.a(this, 1);
   }

   public final void m(int var1, int var2) {
      gJ = this;
      this.hE = var1;
      this.hF = var2;
      this.bc();
      this.hG = this.getGraphics();
   }

   public final void n(int var1, int var2) {
      gJ = this;
      this.hE = var2;
      this.hF = var1;
      this.hG = C_Launcher_mc.n().j().getGraphics();
      this.setBackground(new Color(10, 10, 10));
      this.hc = 5;
      this.ha = new rs.p_l.C_C_uc(this.hE, this.hF, this.B());
      this.gZ = new rs.p_l.C_C_uc(this.hE, this.hF, this.B());
      this.setFocusTraversalKeysEnabled(false);
      this.a(this, 1);
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2 = var1.getWheelRotation();
      this.a(var1);
      boolean var3 = !C_Client_mc.ai() ? hP > 526 && hQ < 150 : C_Client_mc.ai - hP <= 155 && hQ <= 162;
      if (C_Launcher_mc.n() != null && C_Launcher_mc.n().o() != null && var2 != 0) {
         if (var3) {
            C_Client_mc var4 = C_Launcher_mc.n().o();
            var4.fh += var2 * 35;
            if (var4.fh > 210) {
               var4.fh = 210;
            }

            if (var4.fh < 0) {
               var4.fh = 0;
            }
         } else {
            label119: {
               label101: {
                  if (C_Launcher_mc.n().o().fc && C_Launcher_mc.n().o().G()) {
                     C_Launcher_mc.n().o();
                     if (C_Client_mc.cH == -1) {
                        break label101;
                     }
                  }

                  if (!rs.p_l.p_b.p_a.C_d.d) {
                     break label119;
                  }
               }

               short var8 = 100;
               if (C_Client_mc.ch) {
                  var8 = 200;
               }

               if (rs.p_l.p_b.p_a.C_d.g() && C_Client_mc.al < 0) {
                  var8 = 50;
               }

               int var5 = var2 < 0 ? -1 * var8 : var8;
               C_Client_mc.al += var5;
               int var6 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? he : hf;
               int var7 = rs.p_l.p_b.p_a.C_d.g() ? -500 : 0;
               if (C_Client_mc.al > var6) {
                  C_Client_mc.al = var6;
               }

               if (C_Client_mc.al < var7) {
                  C_Client_mc.al = var7;
               }
            }
         }
      }

      if (C_Launcher_mc.n().o().d(hP, hQ)) {
         int var9 = C_Client_mc.eD;
         var9 -= var2 * 30;
         if (var9 < 0) {
            var9 = 0;
         }

         if (var9 > C_Client_mc.fA - 110) {
            var9 = C_Client_mc.fA - 110;
         }

         if (C_Client_mc.eD != var9) {
            C_Client_mc.eD = var9;
            C_Client_mc.fM = true;
         }

         if (C_Launcher_mc.n() != null && C_Launcher_mc.n().o() != null && C_Launcher_mc.n().o().gp == 67027) {
            rs.p_n.C_e var11 = rs.p_n.C_e.H[67027];

            for (int var12 = 0; var12 < var11.al.length; var12++) {
               if (rs.p_n.C_e.H[var11.al[var12]].aH > 0) {
                  rs.p_n.C_e.H[var11.al[var12]].V += var2 * 30;
               }
            }
         }
      }
   }

   public void a(MouseWheelEvent var1) {
      int var2 = var1.getWheelRotation();
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = C_Client_mc.eT[C_Client_mc.fL];
      if (var10 != -1) {
         rs.p_n.C_e var12 = rs.p_n.C_e.H[var10];
         var7 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? C_Client_mc.ai - 218 : (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 28 : C_Client_mc.ai - 197);
         var8 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a
            ? C_Client_mc.ah - 298
            : (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 37 : C_Client_mc.ah - (C_Client_mc.ai >= 1000 ? 37 : 74) - 267);

         for (int var13 = 0; var13 < var12.al.length; var13++) {
            if (rs.p_n.C_e.H[var12.al[var13]].aH > 0) {
               var9 = var13;
               var3 = var12.am[var13];
               var4 = var12.bc[var13];
               var5 = rs.p_n.C_e.H[var12.al[var13]].P;
               var6 = rs.p_n.C_e.H[var12.al[var13]].aR;
               break;
            }
         }

         if (hP > var7 + var3 && hQ > var8 + var4 && hP < var7 + var3 + var5 && hQ < var8 + var4 + var6) {
            rs.p_n.C_e.H[var12.al[var9]].V += var2 * 30;
            C_Client_mc.eM = true;
            C_Client_mc.fb = true;
         }
      }

      if (C_Client_mc.cH != -1) {
         C_Client_mc var11 = C_Launcher_mc.n().o();
         rs.p_n.C_e var22 = rs.p_n.C_e.H[C_Client_mc.cH == 23000 ? 5292 : C_Client_mc.cH];
         var7 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 4 : C_Client_mc.ai / 2 - 360;
         var8 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 4 : C_Client_mc.ah / 2 - 240;
         if (var22.C != Integer.MAX_VALUE) {
            var7 = var22.C;
         }

         if (var22.D != Integer.MAX_VALUE) {
            var8 = var22.D;
         }

         if (C_Client_mc.aj() && var11.v.h() && !var11.f()) {
            var8 += 37;
         }

         for (int var23 = 0; var23 < var22.al.length; var23++) {
            if (rs.p_n.C_e.H[var22.al[var23]].aH > 0 && (C_Client_mc.cI == -1 || rs.p_n.C_e.H[var22.al[var23]].bA == C_Client_mc.cI)) {
               var3 = var22.am[var23];
               var4 = var22.bc[var23];
               var5 = rs.p_n.C_e.H[var22.al[var23]].P;
               var6 = rs.p_n.C_e.H[var22.al[var23]].aR;
               if (hP > var7 + var3 && hQ > var8 + var4 && hP < var7 + var3 + var5 && hQ < var8 + var4 + var6) {
                  rs.p_n.C_e.H[var22.al[var23]].V += var2 * 30;
               }
            }
         }
      }
   }

   void aV() {
      long var1 = bf();
      long var3 = gS[hg];
      gS[hg] = var1;
      hg = hg + 1 & 31;
      if (var3 != 0L && var1 > var3) {
         int var5 = (int)(var1 - var3);
         gR = ((var5 >> 1) + 32000) / var5;
      }

      if (++gV - 1 > 50) {
         gV -= 50;
      }

      this.aW();
      this.T();
      this.hh = System.currentTimeMillis();
   }

   final void aW() {
      rs.p_g.C_a var1 = this.aZ();
      if (this.hk != var1.c || var1.d != this.hl || this.gP) {
         this.ba();
         this.gP = false;
      }
   }

   final void aX() {
      this.gP = true;
   }

   Container aY() {
      return (Container)(this.hH != null ? this.hH : this);
   }

   public rs.p_g.C_a aZ() {
      Container var1 = this.aY();
      int var2 = Math.max(var1.getWidth(), 0);
      int var3 = Math.max(var1.getHeight(), 0);
      if (this.hH != null) {
         Insets var4 = this.hH.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new rs.p_g.C_a(var2, var3);
   }

   public void i() {
   }

   public void j() {
   }

   public final void ba() {
      if (C_Launcher_mc.n().o().ay()) {
         C_Launcher_mc.n().o().g(false);
         Dimension var1 = C_Launcher_mc.n().o().aE();
         this.ho = var1.width;
         this.hp = var1.height;
         Container var2 = this.aY();
         if (var2 != null) {
            rs.p_g.C_a var3 = this.aZ();
            this.hk = Math.max(var3.c, 0);
            this.hl = Math.max(var3.d, 0);
            if (this.hk <= 0) {
               this.hk = 1;
            }

            if (this.hl <= 0) {
               this.hl = 1;
            }

            this.ho = this.hk;
            this.hp = this.hl;
            hi = Math.min(this.hk, this.ho);
            hj = Math.min(this.hl, this.hp);
            C_Client_mc var4 = C_Launcher_mc.n().o();
            this.hm = (int)((double)var4.B().getWidth() - C_Launcher_mc.n().o().aF().getWidth()) / 2;
            this.hn = 0;
            this.gI.setSize(hi, hj);
            this.gI.setLocation(this.hm, this.hn);
            this.i();
            this.j();
            rs.p_l.C_c.d();
            if (var4.fc && var4.cd && rs.p_k.C_e.a()) {
               rs.p_k.C_b.g = C_Launcher_mc.n().p().n().getWidth();
               rs.p_k.C_b.h = C_Launcher_mc.n().p().n().getHeight();
            }
         }
      }
   }

   public boolean bb() {
      return this.a;
   }

   final synchronized void bc() {
      this.gI = new C_b(this);
      this.gQ = false;
   }

   @Override
   public void run() {
      this.bc();
      this.B().addMouseListener(this);
      this.B().addMouseMotionListener(this);
      this.B().addKeyListener(this);
      this.B().addFocusListener(this);
      this.B().addMouseWheelListener(this);
      this.B().addComponentListener(this);
      this.B().addComponentListener(new C_D_uc(this));
      if (this.hH != null) {
         this.hH.addWindowListener(this);
      }

      this.a(0, "Loading...");
      this.L();
      int var1 = 0;
      int var2 = 256;
      int var3 = 1;
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < 10; var6++) {
         this.h[var6] = System.currentTimeMillis();
      }

      int var14 = 0;
      hq = be();

      while (gK == 0L) {
         if (rs.p_k.C_e.a()) {
            var14 = hq.a(this.g, 1);
            this.a = var14 > 0;

            for (int var16 = 0; var16 < var14; var16++) {
               this.aT();
            }

            this.aV();
         } else {
            int var7 = var2;
            int var8 = var3;
            var2 = 300;
            var3 = 1;
            long var9 = System.currentTimeMillis();
            if (this.h[var1] == 0L) {
               var2 = var7;
               var3 = var8;
            } else if (var9 > this.h[var1]) {
               var2 = (int)((long)(2560 * this.g) / (var9 - this.h[var1]));
            }

            if (var2 < 25) {
               var2 = 25;
            }

            if (var2 > 256) {
               var2 = 256;
               var3 = (int)((long)this.g - (var9 - this.h[var1]) / 10L);
            }

            if (var3 > this.g) {
               var3 = this.g;
            }

            this.h[var1] = var9;
            var1 = (var1 + 1) % 10;
            if (var3 > 1) {
               for (int var11 = 0; var11 < 10; var11++) {
                  if (this.h[var11] != 0L) {
                     this.h[var11] = this.h[var11] + (long)var3;
                  }
               }
            }

            if (var3 < this.hC) {
               var3 = this.hC;
            }

            try {
               Thread.sleep((long)var3);
            } catch (InterruptedException var13) {
               var5++;
            }

            while (var4 < 256) {
               this.a();
               this.q();
               this.s = this.t;
               var4 += var2;
            }

            var4 &= 255;
            if (this.g > 0) {
               gR = 1000 * var2 / (this.g * 256);
            }

            this.T();
            if (this.hD) {
               System.out.println("ntime:" + var9);

               for (int var17 = 0; var17 < 10; var17++) {
                  int var12 = (var1 - var17 - 1 + 20) % 10;
                  System.out.println("otim" + var12 + ":" + this.h[var12]);
               }

               System.out.println("fps:" + gR + " ratio:" + var2 + " count:" + var4);
               System.out.println("del:" + var3 + " deltime:" + this.g + " mindel:" + this.hC);
               System.out.println("intex:" + var5 + " opos:" + var1);
               this.hD = false;
               var5 = 0;
            }
         }
      }

      if (gK == -1L) {
         this.bd();
      }
   }

   public void bd() {
      gK = -2L;

      try {
         this.A();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (this.hH != null) {
         try {
            Thread.sleep(1000L);
         } catch (Exception var3) {
         }

         try {
            System.exit(0);
         } catch (Throwable var2) {
         }
      }
   }

   public final void v(int var1) {
      this.g = 1000 / var1;
   }

   public static rs.p_g.C_b be() {
      try {
         return new rs.p_g.C_d();
      } catch (Throwable var1) {
         var1.printStackTrace();
         return new rs.p_g.C_c();
      }
   }

   @Override
   public final void start() {
      if (this == gJ && !gL) {
         gK = 0L;
      }
   }

   @Override
   public final void stop() {
      if (this == gJ && !gL) {
         gK = bf() + 4000L;
      }
   }

   public static synchronized long bf() {
      long var0 = System.currentTimeMillis();
      if (var0 < hr) {
         hs = hs + (hr - var0);
      }

      hr = var0;
      return hs + var0;
   }

   @Override
   public final void destroy() {
      gK = -1L;

      try {
         Thread.sleep(5000L);
      } catch (Exception var2) {
      }

      if (gK == -1L) {
         this.bd();
      }
   }

   @Override
   public final void update(Graphics var1) {
      if (this.hG == null) {
         this.hG = var1.create();
      }

      this.hI = true;
      this.Z();
   }

   @Override
   public final void paint(Graphics var1) {
      if (this.hG == null) {
         this.hG = var1.create();
      } else if (C_Launcher_mc.n().h()) {
         int var2 = this.getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
         int var3 = this.getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
         if (var2 != this.b || var3 != this.c) {
            this.hG = var1.create();
         }

         this.b = this.getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
         this.c = this.getGraphicsConfiguration().getDevice().getDisplayMode().getHeight();
      }

      this.hI = true;
      this.Z();
   }

   @Override
   public final void mousePressed(MouseEvent var1) {
      this.hL = 0L;
      int var2 = var1.getX();
      int var3 = var1.getY();
      rs.p_l.p_f.C_e.d().m().a(var1);
      if (!var1.isConsumed()) {
         if (this.hH != null) {
            var2 -= 4;
            var3 -= 22 + this.hc;
         }

         if (C_Launcher_mc.n().o().ax()) {
            var2 = this.b(var2, false);
            var3 = this.c(var3, false);
         }

         this.hK = 0;
         this.o = var2;
         this.p = var3;
         this.q = System.currentTimeMillis();
         if (rs.p_l.p_b.p_a.C_d.d && SwingUtilities.isLeftMouseButton(var1)) {
            rs.p_l.p_b.p_a.C_d.b.c(1);
         }

         if (rs.p_l.p_b.p_a.C_d.d && SwingUtilities.isRightMouseButton(var1)) {
            rs.p_l.p_b.p_a.C_d.b.c(2);
         }

         if (SwingUtilities.isMiddleMouseButton(var1) && C_Client_mc.ee == 2) {
            this.ht = true;
            this.hw = var1.getX();
            this.hx = var1.getY();
            this.hu = var2;
            this.hv = var3;
         } else {
            boolean var4 = SwingUtilities.isRightMouseButton(var1)
               || System.getProperty("os.name").contains("Mac OS X") && (var1.getModifiers() & 16) != 0 && (var1.getModifiers() & 4) != 0;
            if (var4) {
               this.j++;
               if (SwingUtilities.isLeftMouseButton(var1)) {
                  this.k = 2;
               }

               this.a(1, 2, var2, var3, var1.getWhen());
            } else if (SwingUtilities.isLeftMouseButton(var1)) {
               this.i = true;
               this.k = 1;
               this.a(1, 1, var2, var3, var1.getWhen());
            }
         }
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      rs.p_l.p_f.C_e.d().m().d(var1);
      if (var1.isConsumed()) {
         this.bg();
      } else {
         this.hL = 0L;
         this.hK = 0;
         if (SwingUtilities.isLeftMouseButton(var1)) {
            this.i = false;
         }

         int var2 = var1.getX();
         int var3 = var1.getY();
         if (this.hH != null) {
            var2 -= 4;
            var3 -= 22 + this.hc;
         }

         if (C_Launcher_mc.n().o().ax()) {
            var2 = this.b(var2, false);
            var3 = this.c(var3, false);
         }

         int var4 = SwingUtilities.isLeftMouseButton(var1) ? this.k : (SwingUtilities.isRightMouseButton(var1) ? 2 : 3);
         this.a(2, var4, var2, var3, var1.getWhen());
         this.ht = false;
         if (this.hH != null) {
            this.hH.requestFocus();
         }
      }
   }

   @Override
   public final void mouseClicked(MouseEvent var1) {
      if (C_Launcher_mc.n() != null && var1.getX() <= 765 && var1.getY() <= 537 && this.hH != null) {
         this.hH.requestFocus();
      }
   }

   @Override
   public final void mouseEntered(MouseEvent var1) {
      if (this.hH != null) {
         this.hH.requestFocus();
      }
   }

   @Override
   public final void mouseExited(MouseEvent var1) {
      this.hK = 0;
      hO = -1;
      hN = -1;
      this.a(-1, -1);
   }

   public int b(int var1, boolean var2) {
      float var3 = (float)C_Launcher_mc.n().o().ae();
      float var4 = (float)this.B().getWidth() - var3 * 2.0F;
      double var5 = (double)(var4 / 765.0F);
      double var7 = (double)(765.0F / var4);
      int var9 = 0;
      var9 = (int)((double)var9 - (double)var3 * var7);
      return (int)((double)((float)var1) * var7) + var9;
   }

   public int c(int var1, boolean var2) {
      float var3 = 0.0F;
      float var4 = (float)this.B().getHeight() - var3 * 2.0F;
      double var5 = (double)(var4 / 503.0F);
      double var7 = (double)(503.0F / var4);
      int var9 = 0;
      var9 = (int)((double)var9 - (double)var3 * var7);
      return (int)((double)((float)var1) * var7) + var9;
   }

   @Override
   public final void mouseDragged(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      rs.p_l.p_f.C_e.d().m().c(var1);
      if (!var1.isConsumed()) {
         if (this.hH != null) {
            Insets var4 = this.hH.getInsets();
            var2 -= var4.left + 4;
            var3 -= var4.top + 22 + this.hc;
         }

         hN = var2;
         hO = var3;
         if (C_Launcher_mc.n().o().ax()) {
            var2 = this.b(var2, false);
            var3 = this.c(var3, false);
         }

         if (this.ht) {
            var3 = this.hw - var1.getX();
            int var9 = this.hx - var1.getY();
            this.e(var3, -var9);
            this.hw = var1.getX();
            this.hx = var1.getY();
         } else {
            this.hK = 0;
            this.a(var2, var3);
            synchronized (this.hR) {
               if (this.hS) {
                  this.hR.a(3, 0, var2, var3, var1.getWhen());
               }
            }
         }
      }
   }

   void e(int var1, int var2) {
   }

   @Override
   public final void mouseMoved(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      rs.p_l.p_f.C_e.d().m().b(var1);
      if (this.hH != null) {
         var2 -= 4;
         var3 -= 22 + this.hc;
         this.hH.requestFocus();
      }

      this.hK = 0;
      hN = var2;
      hO = var3;
      if (C_Launcher_mc.n().o().ax()) {
         var2 = this.b(var2, false);
         var3 = this.c(var3, false);
      }

      this.a(var2, var3);
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (this.hH != null) {
         this.hH.requestFocus();
      } else {
         this.requestFocus();
      }

      this.hL = 0L;
      this.hK = 0;
      C_Launcher_mc.n().p().p().a(var1);
      if (!var1.isConsumed()) {
         int var2 = var1.getKeyCode();
         int var3 = var1.getKeyChar();
         if (var1.isControlDown()) {
            C_Client_mc.ci = System.currentTimeMillis();
            C_Client_mc.ch = true;
         }

         if (var1.isShiftDown()) {
            C_Client_mc.ag = true;
         }

         if (rs.p_l.p_b.p_a.C_d.d) {
            rs.p_l.p_b.p_a.C_d.b.a(var3);
         }

         if (var2 == 37 && C_Client_mc.w.b) {
            C_Client_mc.w.f--;
            if (C_Client_mc.w.f < 0) {
               C_Client_mc.w.f = 0;
            }
         }

         if (var2 == 39 && C_Client_mc.w.b) {
            C_Client_mc.w.f++;
            if (C_Client_mc.w.f > C_Client_mc.w.g.length()) {
               C_Client_mc.w.f = C_Client_mc.w.g.length();
            }
         }

         if (var2 == 38 && C_Client_mc.w.b) {
            C_Client_mc.w.b(C_Client_mc.w.e - 1);
         }

         if (var2 == 40 && C_Client_mc.w.b) {
            C_Client_mc.w.b(C_Client_mc.w.e + 1);
         }

         if (C_Client_mc.ch && var2 == 38 && rs.p_l.C_j.b(C_Client_mc.cT) && C_Client_mc.dm != null) {
            C_Client_mc.dk = C_Client_mc.dm;
         }

         if (rs.p_l.p_e.p_a.C_u.j.r) {
            if (var2 == 37 || var2 == 39) {
               int var14 = rs.p_l.p_e.p_a.C_u.j.s;
               var14 += var2 == 37 ? -1 * rs.p_l.p_e.p_a.C_u.p * rs.p_l.p_e.p_a.C_u.q : rs.p_l.p_e.p_a.C_u.p * rs.p_l.p_e.p_a.C_u.q;
               if (var14 < 0) {
                  var14 = 0;
               }

               if (var14 >= rs.p_l.C_E_uc.y.length) {
                  return;
               } else {
                  rs.p_l.p_e.p_a.C_u.j.s = var14;
                  return;
               }
            }

            if (var2 == 27) {
               rs.p_l.p_e.p_a.C_u.j.r = false;
               return;
            }
         }

         if (rs.p_l.p_e.p_a.C_q.i.f() && !C_Client_mc.w.b) {
            if (var2 == 87 || var2 == 65 || var2 == 68 || var2 == 83 || var2 >= 37 && var2 <= 40) {
               switch (var2) {
                  case 37:
                  case 65:
                     rs.p_l.p_e.p_a.C_q.i.c(var2 == 65 ? -10 : -1);
                     break;
                  case 38:
                  case 87:
                     rs.p_l.p_e.p_a.C_q.i.d(var2 == 87 ? -10 : -1);
                     break;
                  case 39:
                  case 68:
                     rs.p_l.p_e.p_a.C_q.i.c(var2 == 68 ? 10 : 1);
                     break;
                  case 40:
                  case 83:
                     rs.p_l.p_e.p_a.C_q.i.d(var2 == 83 ? 10 : 1);
               }

               rs.p_n.C_e.H[rs.p_l.p_e.p_a.C_q.i.g()].am[rs.p_l.p_e.p_a.C_q.i.h()] = rs.p_l.p_e.p_a.C_q.i.i();
               rs.p_n.C_e.H[rs.p_l.p_e.p_a.C_q.i.g()].bc[rs.p_l.p_e.p_a.C_q.i.h()] = rs.p_l.p_e.p_a.C_q.i.j();
               C_Client_mc.fb = true;
               C_Client_mc.eM = true;
               return;
            }

            if (var2 == 9) {
               rs.p_l.p_e.p_a.C_q.i.a(false);
               return;
            }
         }

         if (var2 < 37 || var2 > 40 || !C_Client_mc.ba && C_Client_mc.aW == -1) {
            if (rs.p_l.p_e.p_a.C_u.j.r) {
               if (var2 == 37 || var2 == 39) {
                  int var12 = rs.p_l.p_e.p_a.C_u.j.s;
                  var12 += var2 == 37 ? -43 : 43;
                  if (var12 < 0) {
                     var12 = 0;
                  }

                  if (var12 >= rs.p_l.C_E_uc.y.length) {
                     return;
                  }

                  rs.p_l.p_e.p_a.C_u.j.s = var12;
                  return;
               }

               if (var2 == 27) {
                  rs.p_l.p_e.p_a.C_u.j.r = false;
                  return;
               }
            }

            if (var2 == 16 && C_Client_mc.ba) {
               hy = !hy;
            }

            if (var2 == 20 && C_Client_mc.ba) {
               hz = !hz;
            }

            if (var3 < 30) {
               var3 = 0;
            }

            if (var2 == 37) {
               var3 = 1;
            }

            if (var2 == 39) {
               var3 = 2;
            }

            if (var2 == 38) {
               var3 = 3;
            }

            if (var2 == 40) {
               var3 = 4;
            }

            if (var2 == 17) {
               var3 = 5;
            }

            if (var2 == 8) {
               var3 = 8;
            }

            if (var2 == 127) {
               var3 = 8;
            }

            if (var2 == 9) {
               var3 = 9;
            }

            if (var2 == 10) {
               var3 = 10;
            }

            if (var2 >= 112 && var2 <= 123) {
               var3 = 1008 + var2 - 112;
            }

            if (var2 == 36) {
               var3 = 1000;
            }

            if (var2 == 35) {
               var3 = 1001;
            }

            if (var2 == 33) {
               var3 = 1002;
            }

            if (var2 == 34) {
               var3 = 1003;
            }

            if (var3 > 0 && var3 < 128) {
               this.hY[var3] = 1;
            }

            for (int var4 = 0; var4 < rs.p_f.C_a.G.length; var4++) {
               if (rs.p_f.C_a.G[var4] != -1 && rs.p_f.C_a.G[var4] == var2) {
                  this.x(var4);
               }
            }

            if (var2 == 27) {
               this.x(3);
            }

            C_Launcher_mc.n().o().cv.b(var1);
            if (C_Launcher_mc.n().o().cv.b()) {
               C_Launcher_mc.n().o().cv.a(false);
            } else {
               if (var3 > 4) {
                  this.r[this.t] = var3;
                  this.t = this.t + 1 & 127;
               }

               if (rs.p_l.p_b.p_a.C_d.d && C_Client_mc.ch && var2 == 86) {
                  String var10 = null;

                  try {
                     var10 = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

                     for (char var8 : var10.toCharArray()) {
                        C_Client_mc.w.a(var8);
                     }
                  } catch (IOException | UnsupportedFlavorException var9) {
                  }
               }

               if (var2 == 18) {
                  var1.consume();
               }
            }
         } else {
            if (C_Client_mc.ba) {
               switch (var2) {
                  case 37:
                     if (hy) {
                        C_Client_mc.bf--;
                     } else {
                        C_Client_mc.bc = C_Client_mc.bc - (C_Client_mc.bc - 10 > 0 ? 10 : 0);
                     }
                     break;
                  case 38:
                     if (hz) {
                        C_Client_mc.be = C_Client_mc.be + (C_Client_mc.be + 100 < 50000 ? 100 : 0);
                     } else if (hy) {
                        C_Client_mc.bg++;
                     } else {
                        C_Client_mc.bd = C_Client_mc.bd + (C_Client_mc.bd + 10 < 2050 ? 10 : 0);
                     }
                     break;
                  case 39:
                     if (hy) {
                        C_Client_mc.bf++;
                     } else {
                        C_Client_mc.bc = C_Client_mc.bc + (C_Client_mc.bc + 10 < 2050 ? 10 : 0);
                     }
                     break;
                  case 40:
                     if (hz) {
                        C_Client_mc.be = C_Client_mc.be - (C_Client_mc.be - 100 > 0 ? 100 : 0);
                     } else if (hy) {
                        C_Client_mc.bg--;
                     } else {
                        C_Client_mc.bd = C_Client_mc.bd - (C_Client_mc.bd - 10 > 0 ? 10 : 0);
                     }
               }
            } else if (C_Client_mc.aW != -1) {
               switch (var2) {
                  case 37:
                     C_Client_mc.aX--;
                     break;
                  case 38:
                     C_Client_mc.aY++;
                  case 39:
                     C_Client_mc.aX++;
                     break;
                  case 40:
                     C_Client_mc.aY--;
               }
            }

            if (C_Client_mc.aW > 0) {
               rs.p_n.C_e.H[C_Client_mc.aW].am[C_Client_mc.aV] = C_Client_mc.aX;
               rs.p_n.C_e.H[C_Client_mc.aW].bc[C_Client_mc.aV] = C_Client_mc.aY;
            }

            C_Client_mc.fb = true;
            C_Client_mc.eM = true;
         }
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      this.hL = 0L;
      this.hK = 0;
      C_Launcher_mc.n().p().p().b(var1);
      if (var1.isConsumed()) {
      }

      int var2 = var1.getKeyCode();
      char var3 = var1.getKeyChar();
      if (rs.p_l.p_b.p_a.C_d.d) {
         rs.p_l.p_b.p_a.C_d.b.b(var3);
      }

      if (var3 < 30) {
         var3 = 0;
      }

      if (var2 == 37) {
         var3 = 1;
      }

      if (var2 == 39) {
         var3 = 2;
      }

      if (var2 == 38) {
         var3 = 3;
      }

      if (var2 == 40) {
         var3 = 4;
      }

      if (var2 == 17) {
         var3 = 5;
      }

      if (var2 == 8) {
         var3 = '\b';
      }

      if (var2 == 127) {
         var3 = '\b';
      }

      if (var2 == 9) {
         var3 = '\t';
      }

      if (var2 == 10) {
         var3 = '\n';
      }

      if (var3 > 0 && var3 < 128) {
         this.hY[var3] = 0;
      }

      if (var2 == 17) {
         C_Client_mc.ci = System.currentTimeMillis();
         C_Client_mc.ch = false;
      }

      if (var2 == 16) {
         C_Client_mc.ag = false;
      }
   }

   @Override
   public final void keyTyped(KeyEvent var1) {
      C_Launcher_mc.n().p().p().c(var1);
      if (!var1.isConsumed()) {
         ;
      }
   }

   public final int w(int var1) {
      while (var1 >= 0) {
         int var3 = 1;

         while (var3 > 0) {
            var3++;
         }
      }

      int var2 = -1;
      if (this.t != this.s) {
         var2 = this.r[this.s];
         this.s = this.s + 1 & 127;
      }

      return var2;
   }

   @Override
   public final void focusGained(FocusEvent var1) {
      this.hJ = true;
      this.hI = true;
      C_FocusChanged_mc var2 = new C_FocusChanged_mc();
      var2.setFocused(true);
      C_Launcher_mc.n().o().p.post(var2);
      this.Z();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.bg();
      C_Client_mc.ch = false;
      C_Client_mc.ag = false;
      this.i = false;
      C_FocusChanged_mc var2 = new C_FocusChanged_mc();
      var2.setFocused(false);
      C_Launcher_mc.n().o().p.post(var2);
      this.hJ = false;

      for (int var3 = 0; var3 < 128; var3++) {
         this.hY[var3] = 0;
      }
   }

   @Override
   public final void windowActivated(WindowEvent var1) {
   }

   @Override
   public final void windowClosed(WindowEvent var1) {
   }

   @Override
   public final void windowClosing(WindowEvent var1) {
      try {
         this.destroy();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      System.exit(0);
   }

   @Override
   public final void windowDeactivated(WindowEvent var1) {
   }

   @Override
   public final void windowDeiconified(WindowEvent var1) {
   }

   @Override
   public final void windowIconified(WindowEvent var1) {
   }

   @Override
   public final void windowOpened(WindowEvent var1) {
   }

   void L() {
   }

   void q() {
   }

   void A() {
   }

   void T() {
   }

   void Z() {
   }

   Component B() {
      return (Component)(this.hH != null ? this.hH : this.gI);
   }

   public void a(Runnable var1, int var2) {
      Thread var3 = new Thread(var1);
      var3.start();
      var3.setPriority(var2);
   }

   public void a(boolean var1, int var2, int var3, boolean var4, boolean var5) {
      boolean var6 = false;
      this.hE = var2;
      this.hF = var3;
      if (C_Launcher_mc.n() == null) {
         if (this.hH != null) {
            this.hH.dispose();
         }

         if (!var6) {
            this.hH = new C_E_uc(this, var2, var3);
            this.hH.addWindowListener(this);
         }

         this.hG = (var6 ? this : this.hH).getGraphics();
         if (!var6) {
            this.B().addMouseWheelListener(this);
            this.B().addMouseListener(this);
            this.B().addMouseMotionListener(this);
            this.B().addKeyListener(this);
            this.B().addFocusListener(this);
         }
      }
   }

   void a(int var1, String var2) {
      while (this.hG == null) {
         this.hG = this.B().getGraphics();

         try {
            this.B().repaint();
         } catch (Exception var9) {
         }

         try {
            Thread.sleep(1000L);
         } catch (Exception var8) {
         }
      }

      Font var3 = new Font("Helvetica", 1, 13);
      FontMetrics var4 = this.B().getFontMetrics(var3);
      Font var5 = new Font("Helvetica", 0, 13);
      this.B().getFontMetrics(var5);
      if (this.hI) {
         this.hG.setColor(Color.black);
         this.hG.fillRect(0, 0, this.hE, this.hF);
         this.hI = false;
      }

      Color var6 = new Color(140, 17, 17);
      int var7 = this.hF / 2 - 18;
      this.hG.setColor(var6);
      this.hG.drawRect(this.hE / 2 - 152, var7, 304, 34);
      this.hG.fillRect(this.hE / 2 - 150, var7 + 2, var1 * 3, 30);
      this.hG.setColor(Color.black);
      this.hG.fillRect(this.hE / 2 - 150 + var1 * 3, var7 + 2, 300 - var1 * 3, 30);
      this.hG.setFont(var3);
      this.hG.setColor(Color.white);
      this.hG.drawString(var2, (this.hE - var4.stringWidth(var2)) / 2, var7 + 22 + this.hc);
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.setCursor(Cursor.getDefaultCursor());
      if (C_Launcher_mc.n() != null) {
         C_Launcher_mc.n().i().setCursor(Cursor.getDefaultCursor());
      }
   }

   public static void a(Graphics2D var0, Polygon var1, Color var2) {
      var0.setColor(var2);
      Stroke var3 = var0.getStroke();
      var0.setStroke(new BasicStroke(2.0F));
      var0.drawPolygon(var1);
      var0.setColor(new Color(0, 0, 0, 50));
      var0.fillPolygon(var1);
      var0.setStroke(var3);
   }

   public static void a(Graphics2D var0, Polygon var1, Color var2, Color var3) {
      Stroke var4 = var0.getStroke();
      var0.setStroke(d);
      if (rs.p_k.C_e.a()) {
         AlphaComposite var5 = AlphaComposite.getInstance(5, 1.0F);
         var0.setComposite(var5);
         var0.setStroke(e);
      }

      var0.setColor(var2);
      var0.drawPolygon(var1);
      var0.setColor(var3);
      var0.fillPolygon(var1);
      var0.setStroke(var4);
   }

   public static void b(Graphics2D var0, Polygon var1, Color var2, Color var3) {
      Stroke var4 = var0.getStroke();
      var0.setStroke(d);
      if (rs.p_k.C_e.a()) {
         AlphaComposite var5 = AlphaComposite.getInstance(3, 1.0F);
         var0.setComposite(var5);
         var0.setStroke(d);
      }

      var0.setColor(var2);
      var0.drawPolygon(var1);
      var0.setColor(var3);
      var0.fillPolygon(var1);
      var0.setStroke(var4);
   }

   public static List<rs.p_runelite.p_a.C_i> a(List<rs.p_runelite.p_a.C_i> var0) {
      if (var0.size() < 3) {
         return null;
      } else {
         ArrayList var1 = new ArrayList();
         rs.p_runelite.p_a.C_i var2 = b(var0);
         rs.p_runelite.p_a.C_i var3 = var2;

         rs.p_runelite.p_a.C_i var4;
         do {
            if (var3.a() != 0 || var3.b() != 0) {
               var1.add(var3);
            }

            assert var1.size() <= var0.size() : "hull has more points than graph";

            if (var1.size() > var0.size()) {
               return null;
            }

            var4 = null;

            for (rs.p_runelite.p_a.C_i var6 : var0) {
               if (var4 == null) {
                  var4 = var6;
               } else {
                  long var7 = a(var3, var6, var4);
                  if (var7 > 0L || var7 == 0L && var3.a(var6) > var3.a(var4)) {
                     var4 = var6;
                  }
               }
            }

            if (var4 == null) {
               return null;
            }

            var3 = var4;
         } while (var4 != var2);

         return var1;
      }
   }

   private static rs.p_runelite.p_a.C_i b(List<rs.p_runelite.p_a.C_i> var0) {
      rs.p_runelite.p_a.C_i var1 = null;

      for (rs.p_runelite.p_a.C_i var3 : var0) {
         if (var1 == null || var3.a() < var1.a()) {
            var1 = var3;
         } else if (var3.a() == var1.a() && var3.b() < var1.b()) {
            var1 = var3;
         }
      }

      return var1;
   }

   private static long a(rs.p_runelite.p_a.C_i var0, rs.p_runelite.p_a.C_i var1, rs.p_runelite.p_a.C_i var2) {
      return (long)(var1.b() - var0.b()) * (long)(var2.a() - var1.a()) - (long)(var1.a() - var0.a()) * (long)(var2.b() - var1.b());
   }

   public static rs.p_runelite.p_a.C_i a(C_Client_mc var0, int var1, int var2, int var3) {
      boolean var4 = false;
      boolean var5 = false;
      if (var1 >= 128 && var2 >= 128 && var1 <= 13056 && var2 <= 13056) {
         var1 -= C_Client_mc.cJ;
         var2 -= C_Client_mc.cL;
         var3 -= C_Client_mc.cK;
         int var8 = var0.cR;
         int var9 = var0.cS;
         int var10 = hA[var8];
         int var11 = hB[var8];
         int var12 = hA[var9];
         int var13 = hB[var9];
         int var14 = var13 * var1 + var2 * var12 >> 16;
         var2 = var13 * var2 - var12 * var1 >> 16;
         var14 = var11 * var3 - var2 * var10 >> 16;
         var2 = var3 * var10 + var2 * var11 >> 16;
         if (var2 >= 50) {
            int var15 = C_Client_mc.aj;
            int var16 = C_Client_mc.ak;
            if (rs.p_l.p_b.p_a.C_d.c) {
               var15 = var0.B().getWidth();
               var16 = var0.B().getHeight();
            }

            short var17 = 500;
            int var18 = var15 / 2 + var14 * var17 / var2;
            int var19 = var16 / 2 + var14 * var17 / var2;
            byte var20 = 0;
            byte var21 = 0;
            return new rs.p_runelite.p_a.C_i(var18 + var20, var19 + var21);
         }
      }

      return null;
   }

   protected boolean u() {
      return false;
   }

   protected void v() {
   }

   protected final void bg() {
      synchronized (this.hR) {
         if (this.hS) {
            this.hT++;
            this.hR.c();
         }
      }
   }

   private void a() {
      synchronized (this.hR) {
         boolean var2 = this.u();
         if (var2 != this.hS) {
            this.l = hP;
            this.m = hQ;
            this.hS = var2;
            this.hT++;
            this.hR.b();
            this.n = this.hM = this.hU = 0;
            this.v();
         }

         if (this.hS) {
            this.hU = 0;
            this.bh();
         } else {
            this.hU = this.n;
            this.hV = this.o;
            this.hW = this.p;
            this.hX = this.q;
            this.n = 0;
         }
      }
   }

   protected final void x(int var1) {
      synchronized (this.hR) {
         if (this.hS) {
            this.hR.a(5, var1, 0, 0, System.currentTimeMillis());
         } else {
            C_Client_mc.n(var1);
         }
      }
   }

   private void a(int var1, int var2, int var3, int var4, long var5) {
      synchronized (this.hR) {
         if (this.hS) {
            this.hR.a(var1, var2, var3, var4, var5);
         } else if (var1 == 1) {
            this.n = this.hM = var2;
         } else {
            this.hM = 0;
         }
      }
   }

   private void a(int var1, int var2) {
      synchronized (this.hR) {
         this.l = var1;
         this.m = var2;
         if (!this.hS) {
            hP = var1;
            hQ = var2;
         }
      }
   }

   protected final void bh() {
      synchronized (this.hR) {
         hP = this.l;
         hQ = this.m;
      }
   }

   public int bi() {
      return this.hV;
   }

   public boolean bj() {
      return this.i;
   }

   public int bk() {
      return this.j;
   }

   public int bl() {
      return this.hW;
   }

   static {
      for (int var0 = 0; var0 < 2048; var0++) {
         hA[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615757712823));
         hB[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615757712823));
      }
   }
}
