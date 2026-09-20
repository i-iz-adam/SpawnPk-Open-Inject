package rs.p_l;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import rs.C_Client_mc;

public final class C_F_uc extends C_B_uc {
   private static final int u = 140;
   public static final String f = rs.p_v.C_a.f() + "sprites/";
   public Image g;
   public Object h;
   public boolean i = true;
   public boolean j = false;
   public int k = 0;
   public int l = 0;
   public int[] m;
   public int n;
   public int o;
   public int p;
   int q;
   public int r;
   public int s;
   public String t;

   public C_F_uc(boolean var1, String var2) {
      if (var1) {
         try {
            var2 = var2.toLowerCase();
            this.t = var2;
            this.g = Toolkit.getDefaultToolkit().getImage(f + var2 + ".png");
            ImageIcon var3 = new ImageIcon(this.g);
            this.n = var3.getIconWidth();
            this.o = var3.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            PixelGrabber var4 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
            var4.grabPixels();
            this.c(255, 0, 255);
            this.c(255, 255, 255);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      } else {
         var2 = var2.toLowerCase();
         this.t = var2;
         this.i = false;
         this.a(var2);
      }
   }

   public C_F_uc() {
   }

   public void a(String var1) {
      Object var2 = null;

      try {
         String var3 = (f + var1 + ".png").replace("/", File.separator).replace("//", File.separator).replace("\\\\", File.separator);
         ImageInputStream var4 = ImageIO.createImageInputStream(new File(var3));
         if (var4 != null) {
            var2 = ImageIO.read(var4);
            ImageIcon var5 = new ImageIcon((Image)var2);
            this.n = var5.getIconWidth();
            this.o = var5.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
         }
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public void c() {
      try {
         this.g = Toolkit.getDefaultToolkit().getImage(f + this.t + ".png");
         ImageIcon var1 = new ImageIcon(this.g);
         this.n = var1.getIconWidth();
         this.o = var1.getIconHeight();
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var2 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
         var2.grabPixels();
         if (!this.j) {
            this.c(255, 0, 255);
            this.c(255, 255, 255);
         }

         this.i = true;
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public C_F_uc(int var1, int var2) {
      this.m = new int[var1 * var2];
      this.n = this.r = var1;
      this.o = this.s = var2;
      this.p = this.q = 0;
   }

   public void a(int var1, int var2, int var3) {
      var1 += this.p;
      var2 += this.q;
      int var5 = var1 + var2 * C_c.h;
      int var6 = 0;
      int var7 = this.o;
      int var8 = this.n;
      int var9 = C_c.h - var8;
      int var10 = 0;
      if (var2 < C_c.j) {
         int var11 = C_c.j - var2;
         var7 -= var11;
         var2 = C_c.j;
         var6 += var11 * var8;
         var5 += var11 * C_c.h;
      }

      if (var2 + var7 > C_c.k) {
         var7 -= var2 + var7 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var14 = C_c.l - var1;
         var8 -= var14;
         var1 = C_c.l;
         var6 += var14;
         var5 += var14;
         var10 += var14;
         var9 += var14;
      }

      if (var1 + var8 > C_c.m) {
         int var15 = var1 + var8 - C_c.m;
         var8 -= var15;
         var10 += var15;
         var9 += var15;
      }

      if (var8 > 0 && var7 > 0) {
         this.c(var6, var8, C_c.g, this.m, var10, var7, var9, var3, var5);
      }
   }

   public static Image b(String var0) {
      return Toolkit.getDefaultToolkit().getImage(f + var0 + ".png");
   }

   public static Image a(Image var0, int var1, int var2) {
      return var0.getScaledInstance(var1, var2, 4);
   }

   public Image a(int var1, int var2) {
      BufferedImage var3 = new BufferedImage(var1, var2, 1);
      var3.setRGB(0, 0, var1, var2, this.m, 0, var1);
      Graphics2D var4 = var3.createGraphics();
      var4.dispose();
      return var3;
   }

   public static BufferedImage a(Image var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(null), var0.getHeight(null), 2);
      Graphics2D var2 = var1.createGraphics();
      var2.drawImage(var0, 0, 0, null);
      var2.dispose();
      return var1;
   }

   private static BufferedImage b(Image var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(null), var0.getHeight(null), 2);
      Graphics2D var2 = var1.createGraphics();
      var2.drawImage(var0, 0, 0, null);
      var2.dispose();
      return var1;
   }

   public static Image a(Image var0, Color var1) {
      if (var0 == null) {
         return null;
      } else {
         C_G_uc var2 = new C_G_uc(var1);
         FilteredImageSource var3 = new FilteredImageSource(var0.getSource(), var2);
         return Toolkit.getDefaultToolkit().createImage(var3);
      }
   }

   private static boolean h(int var0, int var1) {
      return Math.abs(var0 - var1) <= 140;
   }

   private static int i(int var0, int var1, int var2) {
      int var3 = var0 - var1;
      return Math.abs(var3) <= 140 ? var2 + var3 : var0;
   }

   public static Image a(BufferedImage var0, Color var1, Color var2) {
      C_H_uc var3 = new C_H_uc(var0, var1, var2);
      FilteredImageSource var4 = new FilteredImageSource(var0.getSource(), var3);
      return Toolkit.getDefaultToolkit().createImage(var4);
   }

   public C_F_uc(String var1, boolean var2) {
      try {
         var1 = var1.toLowerCase();
         this.g = Toolkit.getDefaultToolkit().getImage(f + var1 + ".png");
         ImageIcon var3 = new ImageIcon(this.g);
         this.n = var3.getIconWidth();
         this.o = var3.getIconHeight();
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var4 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
         var4.grabPixels();
         this.c(255, 0, 255);
         if (var2) {
            this.c(255, 255, 255);
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public C_F_uc(Image var1) {
      try {
         this.g = var1;
         ImageIcon var2 = new ImageIcon(this.g);
         this.n = var2.getIconWidth();
         this.o = var2.getIconHeight();
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var3 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
         var3.grabPixels();
         this.c(255, 0, 255);
         this.c(255, 255, 255);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public C_F_uc(String var1) {
      try {
         var1 = var1.toLowerCase();
         this.t = var1;
         this.g = Toolkit.getDefaultToolkit().getImage(f + var1 + ".png");
         ImageIcon var2 = new ImageIcon(this.g);
         this.n = var2.getIconWidth();
         this.o = var2.getIconHeight();
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var3 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
         var3.grabPixels();
         this.c(255, 0, 255);
         this.c(255, 255, 255);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public C_F_uc(String var1, String var2) {
      try {
         var2 = var2.toLowerCase();
         var1 = var1.toLowerCase();
         if (C_Client_mc.class.getResource("Client.class").toString().startsWith("file")) {
            this.g = Toolkit.getDefaultToolkit().getImage("./" + var1 + var2 + ".png");
         } else {
            this.g = ImageIO.read(this.getClass().getResource(var1 + var2 + ".png"));
         }

         ImageIcon var3 = new ImageIcon(this.g);
         this.n = var3.getIconWidth();
         this.o = var3.getIconHeight();
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var4 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
         var4.grabPixels();
         this.c(255, 0, 255);
         this.c(255, 255, 255);
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public C_F_uc(String var1, String var2, Color var3, Color var4) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         if (C_Client_mc.class.getResource("Client.class").toString().startsWith("file")) {
            this.g = Toolkit.getDefaultToolkit().getImage("./" + var1 + var2 + ".png");
         } else {
            this.g = ImageIO.read(this.getClass().getResource(var1 + var2 + ".png"));
         }

         if (var3 != null && var4 != null && !var3.equals(var4)) {
            try {
               this.g = a(a(this.g), var3, var4);
            } catch (Exception var7) {
            }
         }

         ImageIcon var5 = new ImageIcon(this.g);
         this.n = var5.getIconWidth();
         this.o = var5.getIconHeight();
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var6 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
         var6.grabPixels();
         if (var3 != null && var4 != null && var3.equals(var4)) {
            this.c(255, 0, 255);
            this.c(255, 255, 255);
         }
      } catch (Exception var8) {
         System.out.println(var8);
      }
   }

   public void b(int var1, int var2) {
      if (this.g == null) {
         this.g = this.a(this.n, this.o);
      }

      if (this.g != null) {
         Image var3 = this.g.getScaledInstance(var1, var2, 1);
         BufferedImage var4 = new BufferedImage(var1, var2, 2);
         Graphics2D var5 = var4.createGraphics();
         var5.drawImage(var3, 0, 0, null);
         var5.dispose();
         this.g = var3;
         this.n = var1;
         this.o = var2;
         this.m = new int[var1 * var2];
         PixelGrabber var6 = new PixelGrabber(this.g, 0, 0, var1, var2, this.m, 0, var1);

         try {
            var6.grabPixels();
            this.c(255, 0, 255);
            this.c(255, 255, 255);
         } catch (InterruptedException var8) {
            var8.printStackTrace();
         }
      }
   }

   public C_F_uc(String var1, Color var2, Color var3) {
      try {
         var1 = var1.toLowerCase();
         this.g = Toolkit.getDefaultToolkit().getImage(f + var1 + ".png");
         if (var2 != null && var3 != null) {
            try {
               this.g = a(a(this.g), var2, var3);
            } catch (Exception var6) {
            }
         }

         ImageIcon var4 = new ImageIcon(this.g);
         this.n = var4.getIconWidth();
         this.o = var4.getIconHeight();
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var5 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
         var5.grabPixels();
      } catch (Exception var7) {
         System.out.println(var7);
      }
   }

   public C_F_uc(String var1, int var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         Image var4 = Toolkit.getDefaultToolkit().getImage(f + var1 + ".png");
         this.n = var2;
         this.o = var3;
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var5 = new PixelGrabber(var4, 0, 0, this.n, this.o, this.m, 0, this.n);
         var5.grabPixels();
         this.c(255, 0, 255);
         var4 = null;
      } catch (Exception var6) {
         System.out.println(var6);
      }
   }

   public C_F_uc(String var1, String var2, int var3, int var4, boolean var5) {
      try {
         var2 = var2.toLowerCase();
         var1 = var1.toLowerCase();
         if (C_Client_mc.class.getResource("Client.class").toString().startsWith("file")) {
            this.g = Toolkit.getDefaultToolkit().getImage("./" + var1 + var2 + ".png");
         } else {
            this.g = ImageIO.read(this.getClass().getResource(var1 + var2 + ".png"));
         }

         this.n = var3;
         this.o = var4;
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var6 = new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n);
         var6.grabPixels();
         this.g = null;
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   public C_F_uc(String var1, int var2, int var3, boolean var4) {
      try {
         var1 = var1.toLowerCase();
         Image var5 = Toolkit.getDefaultToolkit().getImage(f + var1 + ".png");
         this.n = var2;
         this.o = var3;
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var6 = new PixelGrabber(var5, 0, 0, this.n, this.o, this.m, 0, this.n);
         var6.grabPixels();
         var5 = null;
      } catch (Exception var7) {
         System.out.println(var7);
      }
   }

   public C_F_uc(byte[] var1, Component var2) {
      try {
         Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
         MediaTracker var4 = new MediaTracker(var2);
         var4.addImage(var3, 0);
         var4.waitForAll();
         this.n = var3.getWidth(var2);
         this.o = var3.getHeight(var2);
         this.r = this.n;
         this.s = this.o;
         this.p = 0;
         this.q = 0;
         this.m = new int[this.n * this.o];
         PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.n, this.o, this.m, 0, this.n);
         var5.grabPixels();
      } catch (Exception var6) {
         System.out.println("Error converting jpg");
      }
   }

   public C_F_uc(rs.p_x.C_f var1, String var2, int var3) {
      rs.p_x.C_e var4 = new rs.p_x.C_e(var1.a(var2 + ".dat"));
      rs.p_x.C_e var5 = new rs.p_x.C_e(var1.a("index.dat"));
      var5.h = var4.A();
      this.r = var5.A();
      this.s = var5.A();
      int var6 = var5.y();
      int[] var7 = new int[var6];

      for (int var8 = 0; var8 < var6 - 1; var8++) {
         var7[var8 + 1] = var5.C();
         if (var7[var8 + 1] == 0) {
            var7[var8 + 1] = 1;
         }
      }

      for (int var12 = 0; var12 < var3; var12++) {
         var5.h += 2;
         var4.h = var4.h + var5.A() * var5.A();
         var5.h++;
      }

      this.p = var5.y();
      this.q = var5.y();
      this.n = var5.A();
      this.o = var5.A();
      int var13 = var5.y();
      int var9 = this.n * this.o;
      this.m = new int[var9];
      if (var13 == 0) {
         for (int var14 = 0; var14 < var9; var14++) {
            this.m[var14] = var7[var4.y()];
         }
      } else {
         if (var13 == 1) {
            for (int var10 = 0; var10 < this.n; var10++) {
               for (int var11 = 0; var11 < this.o; var11++) {
                  this.m[var10 + var11 * this.n] = var7[var4.y()];
               }
            }
         }
      }
   }

   public void b(int var1, int var2, int var3) {
      var1 += this.p;
      var2 += this.q;
      int var5 = var1 + var2 * C_c.h;
      int var6 = 0;
      int var7 = this.o;
      int var8 = this.n;
      int var9 = C_c.h - var8;
      int var10 = 0;
      if (var2 < C_c.j) {
         int var11 = C_c.j - var2;
         var7 -= var11;
         var2 = C_c.j;
         var6 += var11 * var8;
         var5 += var11 * C_c.h;
      }

      if (var2 + var7 > C_c.k) {
         var7 -= var2 + var7 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var14 = C_c.l - var1;
         var8 -= var14;
         var1 = C_c.l;
         var6 += var14;
         var5 += var14;
         var10 += var14;
         var9 += var14;
      }

      if (var1 + var8 > C_c.m) {
         int var15 = var1 + var8 - C_c.m;
         var8 -= var15;
         var10 += var15;
         var9 += var15;
      }

      if (var8 > 0 && var7 > 0) {
         this.b(var6, var8, C_c.g, this.m, var10, var7, var9, var3, var5);
      }
   }

   public void c(int var1, int var2) {
      this.k = var1;
      this.l = var2;
      short var3 = 256;
      var1 += this.p;
      var2 += this.q;
      int var4 = var1 + var2 * C_c.h;
      int var5 = 0;
      int var6 = this.o;
      int var7 = this.n;
      int var8 = C_c.h - var7;
      int var9 = 0;
      if (var2 < C_c.j) {
         int var10 = C_c.j - var2;
         var6 -= var10;
         var2 = C_c.j;
         var5 += var10 * var7;
         var4 += var10 * C_c.h;
      }

      if (var2 + var6 > C_c.k) {
         var6 -= var2 + var6 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var13 = C_c.l - var1;
         var7 -= var13;
         var1 = C_c.l;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > C_c.m) {
         int var14 = var1 + var7 - C_c.m;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         this.a(var7, var6, this.m, C_c.g, var4, var3, var5, var9, var8);
      }
   }

   private void a(int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9) {
      int var12 = var6;

      for (int var13 = -var2; var13 < 0; var13++) {
         for (int var14 = -var1; var14 < 0; var14++) {
            var6 = this.m[var7] >> 24 & var12 - 1;
            int var11 = 256 - var6;
            if (var11 > 256) {
               var6 = 0;
            }

            if (var12 == 0) {
               var11 = 256;
               var6 = 0;
            }

            int var10 = var3[var7++];
            if (var10 != 0) {
               int var15 = var4[var5];
               b(
                  var4,
                  var5++,
                  ((var10 & 16711935) * var6 + (var15 & 16711935) * var11 & -16711936) + ((var10 & 0xFF00) * var6 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8,
                  ((var10 & 16711935) * var6 + (var15 & 16711935) * var11 & -16711936) + ((var10 & 0xFF00) * var6 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8,
                  var6
               );
            } else {
               var5++;
            }
         }

         var5 += var9;
         var7 += var8;
      }
   }

   private void b(int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9) {
      for (int var13 = -var6; var13 < 0; var13++) {
         for (int var14 = -var2; var14 < 0; var14++) {
            var8 = this.m[var1] >> 24 & 0xFF;
            int var12 = 256 - var8;
            int var11 = var4[var1++];
            if (var11 != 0) {
               int var15 = var3[var9];
               b(
                  var3,
                  var9++,
                  ((var11 & 16711935) * var8 + (var15 & 16711935) * var12 & -16711936) + ((var11 & 0xFF00) * var8 + (var15 & 0xFF00) * var12 & 0xFF0000) >> 8,
                  var11,
                  var8
               );
            } else {
               var9++;
            }
         }

         var9 += var7;
         var1 += var5;
      }
   }

   public void c(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.m.length; var4++) {
         if ((this.m[var4] >> 16 & 0xFF) == var1 && (this.m[var4] >> 8 & 0xFF) == var2 && (this.m[var4] & 0xFF) == var3) {
            this.m[var4] = 0;
         }
      }
   }

   public void d() {
      C_c.a(this.n, this.o, this.m);
   }

   public void d(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.m.length; var4++) {
         int var5 = this.m[var4];
         if (var5 != 0) {
            int var6 = var5 >> 16 & 0xFF;
            var6 += var1;
            if (var6 < 1) {
               var6 = 1;
            } else if (var6 > 255) {
               var6 = 255;
            }

            int var7 = var5 >> 8 & 0xFF;
            var7 += var2;
            if (var7 < 1) {
               var7 = 1;
            } else if (var7 > 255) {
               var7 = 255;
            }

            int var8 = var5 & 0xFF;
            var8 += var3;
            if (var8 < 1) {
               var8 = 1;
            } else if (var8 > 255) {
               var8 = 255;
            }

            this.m[var4] = (var6 << 16) + (var7 << 8) + var8;
         }
      }
   }

   public void e() {
      int[] var1 = new int[this.r * this.s];

      for (int var2 = 0; var2 < this.o; var2++) {
         System.arraycopy(this.m, var2 * this.n, var1, var2 + this.q * this.r + this.p, this.n);
      }

      this.m = var1;
      this.n = this.r;
      this.o = this.s;
      this.p = 0;
      this.q = 0;
   }

   public void f() {
      int[] var1 = new int[this.n * this.o];
      int var2 = 0;

      for (int var3 = 0; var3 < this.o; var3++) {
         for (int var4 = this.n - 1; var4 >= 0; var4--) {
            var1[var2++] = this.m[var4 + var3 * this.n];
         }
      }

      this.m = var1;
      this.q = this.r - this.n - this.q;
   }

   public void g() {
      int[] var1 = new int[this.n * this.o];
      int var2 = 0;

      for (int var3 = this.o - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < this.n; var4++) {
            var1[var2++] = this.m[var4 + var3 * this.n];
         }
      }

      this.m = var1;
      this.p = this.s - this.o - this.p;
   }

   public void d(int var1, int var2) {
      var1 += this.p;
      var2 += this.q;
      int var3 = var1 + var2 * C_c.h;
      int var4 = 0;
      int var5 = this.o;
      int var6 = this.n;
      int var7 = C_c.h - var6;
      int var8 = 0;
      if (var2 < C_c.j) {
         int var9 = C_c.j - var2;
         var5 -= var9;
         var2 = C_c.j;
         var4 += var9 * var6;
         var3 += var9 * C_c.h;
      }

      if (var2 + var5 > C_c.k) {
         var5 -= var2 + var5 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var12 = C_c.l - var1;
         var6 -= var12;
         var1 = C_c.l;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > C_c.m) {
         int var13 = var1 + var6 - C_c.m;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         this.a(var3, var6, var5, var8, var4, var7, this.m, C_c.g);
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = -(var2 >> 2);
      var2 = -(var2 & 3);

      for (int var10 = -var3; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            int var12 = var7[var5++];
            b(var8, var1++, var12, var12, 255);
            var12 = var7[var5++];
            b(var8, var1++, var12, var12, 255);
            var12 = var7[var5++];
            b(var8, var1++, var12, var12, 255);
            var12 = var7[var5++];
            b(var8, var1++, var12, var12, 255);
         }

         for (int var20 = var2; var20 < 0; var20++) {
            int var24 = var7[var5++];
            b(var8, var1++, var24, var24, 255);
         }

         var1 += var6;
         var5 += var4;
      }
   }

   public void e(int var1, int var2, int var3) {
      int var4 = this.n + 2;
      int var5 = this.o + 2;
      int[] var6 = new int[var4 * var5];

      for (int var7 = 0; var7 < this.n; var7++) {
         for (int var8 = 0; var8 < this.o; var8++) {
            if (this.m[var7 + var8 * this.n] != 0) {
               var6[var7 + 1 + (var8 + 1) * var4] = this.m[var7 + var8 * this.n];
            }
         }
      }

      for (int var18 = 0; var18 < var4; var18++) {
         for (int var20 = 0; var20 < var5; var20++) {
            if (var6[var18 + var20 * var4] == 0) {
               if (var18 < var4 - 1 && var6[var18 + 1 + var20 * var4] > 0 && var6[var18 + 1 + var20 * var4] != 16777215) {
                  var6[var18 + var20 * var4] = var3;
               }

               if (var18 > 0 && var6[var18 - 1 + var20 * var4] > 0 && var6[var18 - 1 + var20 * var4] != 16777215) {
                  var6[var18 + var20 * var4] = var3;
               }

               if (var20 < var5 - 1 && var6[var18 + (var20 + 1) * var4] > 0 && var6[var18 + (var20 + 1) * var4] != 16777215) {
                  var6[var18 + var20 * var4] = var3;
               }

               if (var20 > 0 && var6[var18 + (var20 - 1) * var4] > 0 && var6[var18 + (var20 - 1) * var4] != 16777215) {
                  var6[var18 + var20 * var4] = var3;
               }
            }
         }
      }

      var1--;
      var2--;
      var1 += this.p;
      var2 += this.q;
      int var19 = var1 + var2 * C_c.h;
      int var21 = 0;
      int var9 = var5;
      int var10 = var4;
      int var11 = C_c.h - var4;
      int var12 = 0;
      if (var2 < C_c.j) {
         int var13 = C_c.j - var2;
         var9 = var5 - var13;
         var2 = C_c.j;
         var21 += var13 * var4;
         var19 += var13 * C_c.h;
      }

      if (var2 + var9 > C_c.k) {
         var9 -= var2 + var9 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var22 = C_c.l - var1;
         var10 = var4 - var22;
         var1 = C_c.l;
         var21 += var22;
         var19 += var22;
         var12 += var22;
         var11 += var22;
      }

      if (var1 + var10 > C_c.m) {
         int var23 = var1 + var10 - C_c.m;
         var10 -= var23;
         var12 += var23;
         var11 += var23;
      }

      if (var10 > 0 && var9 > 0) {
         this.a(C_c.g, var6, var21, var19, var10, var9, var11, var12);
      }
   }

   public void f(int var1, int var2, int var3) {
      int var4 = this.n + 2;
      int var5 = this.o + 2;
      int[] var6 = new int[var4 * var5];

      for (int var7 = 0; var7 < this.n; var7++) {
         for (int var8 = 0; var8 < this.o; var8++) {
            if (this.m[var7 + var8 * this.n] != 0) {
               var6[var7 + 1 + (var8 + 1) * var4] = this.m[var7 + var8 * this.n];
            }
         }
      }

      for (int var18 = 0; var18 < var4; var18++) {
         for (int var20 = 0; var20 < var5; var20++) {
            if (var6[var18 + var20 * var4] == 0) {
               if (var18 < var4 - 1 && var6[var18 + 1 + var20 * var4] != 0 && var6[var18 + 1 + var20 * var4] != 16777215) {
                  var6[var18 + var20 * var4] = var3;
               }

               if (var18 > 0 && var6[var18 - 1 + var20 * var4] != 0 && var6[var18 - 1 + var20 * var4] != 16777215) {
                  var6[var18 + var20 * var4] = var3;
               }

               if (var20 < var5 - 1 && var6[var18 + (var20 + 1) * var4] != 0 && var6[var18 + (var20 + 1) * var4] != 16777215) {
                  var6[var18 + var20 * var4] = var3;
               }

               if (var20 > 0 && var6[var18 + (var20 - 1) * var4] != 0 && var6[var18 + (var20 - 1) * var4] != 16777215) {
                  var6[var18 + var20 * var4] = var3;
               }
            }
         }
      }

      var1--;
      var2--;
      var1 += this.p;
      var2 += this.q;
      int var19 = var1 + var2 * C_c.h;
      int var21 = 0;
      int var9 = var5;
      int var10 = var4;
      int var11 = C_c.h - var4;
      int var12 = 0;
      if (var2 < C_c.j) {
         int var13 = C_c.j - var2;
         var9 = var5 - var13;
         var2 = C_c.j;
         var21 += var13 * var4;
         var19 += var13 * C_c.h;
      }

      if (var2 + var9 > C_c.k) {
         var9 -= var2 + var9 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var22 = C_c.l - var1;
         var10 = var4 - var22;
         var1 = C_c.l;
         var21 += var22;
         var19 += var22;
         var12 += var22;
         var11 += var22;
      }

      if (var1 + var10 > C_c.m) {
         int var23 = var1 + var10 - C_c.m;
         var10 -= var23;
         var12 += var23;
         var11 += var23;
      }

      if (var10 > 0 && var9 > 0) {
         this.a(C_c.g, var6, var21, var19, var10, var9, var11, var12);
      }
   }

   public void e(int var1, int var2) {
      this.k = var1;
      this.l = var2;
      short var3 = 128;
      var1 += this.p;
      var2 += this.q;
      int var4 = var1 + var2 * C_c.h;
      int var5 = 0;
      int var6 = this.o;
      int var7 = this.n;
      int var8 = C_c.h - var7;
      int var9 = 0;
      if (var2 < C_c.j) {
         int var10 = C_c.j - var2;
         var6 -= var10;
         var2 = C_c.j;
         var5 += var10 * var7;
         var4 += var10 * C_c.h;
      }

      if (var2 + var6 > C_c.k) {
         var6 -= var2 + var6 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var13 = C_c.l - var1;
         var7 -= var13;
         var1 = C_c.l;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > C_c.m) {
         int var14 = var1 + var7 - C_c.m;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         this.c(var5, var7, C_c.g, this.m, var9, var6, var8, var3, var4);
      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      if (var3 != 0 && var4 != 0) {
         var1 += this.p;
         var2 += this.q;
         int var5 = var1 + var2 * C_c.h;
         int var6 = 0;
         int var7 = this.o;
         int var8 = this.n;
         int var9 = C_c.h - var8;
         int var10 = 0;
         if (var2 < C_c.j) {
            int var11 = C_c.j - var2;
            var7 -= var11;
            var2 = C_c.j;
            var6 += var11 * var8;
            var5 += var11 * C_c.h;
         }

         if (var2 + var7 > C_c.k) {
            var7 -= var2 + var7 - C_c.k;
         }

         if (var1 < C_c.l) {
            int var14 = C_c.l - var1;
            var8 -= var14;
            var1 = C_c.l;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > C_c.m) {
            int var15 = var1 + var8 - C_c.m;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            this.a(C_c.g, this.m, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   public void f(int var1, int var2) {
      var1 += this.p;
      var2 += this.q;
      int var3 = var1 + var2 * C_c.h;
      int var4 = 0;
      int var5 = this.o;
      int var6 = this.n;
      int var7 = C_c.h - var6;
      int var8 = 0;
      if (var2 < C_c.j) {
         int var9 = C_c.j - var2;
         var5 -= var9;
         var2 = C_c.j;
         var4 += var9 * var6;
         var3 += var9 * C_c.h;
      }

      if (var2 + var5 > C_c.k) {
         var5 -= var2 + var5 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var12 = C_c.l - var1;
         var6 -= var12;
         var1 = C_c.l;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > C_c.m) {
         int var13 = var1 + var6 - C_c.m;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         this.a(C_c.g, this.m, var4, var3, var6, var5, var7, var8);
      }
   }

   public void g(int var1, int var2, int var3) {
      this.k = var1;
      this.l = var2;
      var1 += this.p;
      var2 += this.q;
      int var5 = var1 + var2 * C_c.h;
      int var6 = 0;
      int var7 = this.o;
      int var8 = this.n;
      int var9 = C_c.h - var8;
      int var10 = 0;
      if (var2 < C_c.j) {
         int var11 = C_c.j - var2;
         var7 -= var11;
         var2 = C_c.j;
         var6 += var11 * var8;
         var5 += var11 * C_c.h;
      }

      if (var2 + var7 > C_c.k) {
         var7 -= var2 + var7 - C_c.k;
      }

      if (var1 < C_c.l) {
         int var14 = C_c.l - var1;
         var8 -= var14;
         var1 = C_c.l;
         var6 += var14;
         var5 += var14;
         var10 += var14;
         var9 += var14;
      }

      if (var1 + var8 > C_c.m) {
         int var15 = var1 + var8 - C_c.m;
         var8 -= var15;
         var10 += var15;
         var9 += var15;
      }

      if (var8 > 0 && var7 > 0) {
         this.c(var6, var8, C_c.g, this.m, var10, var7, var9, var3, var5);
      }
   }

   private void a(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, false);
   }

   private void a(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      int var13 = -(var5 >> 2);
      var5 = -(var5 & 3);
      boolean var14 = false;
      int var15 = (var3 + 1) % this.n * this.n - 1;

      for (int var16 = -var6; var16 < 0; var16++) {
         for (int var17 = var13; var17 < 0; var17++) {
            int var12 = var2[var3++];
            if (var15 >= var9) {
               if (var15 < this.n) {
                  var14 = true;
                  var15++;
               } else {
                  var14 = false;
                  var15 = 0;
               }
            } else {
               var15++;
            }

            if (var12 != 0 && var12 != -1 && !var14) {
               b(var1, var4++, var12, var12, 255);
            } else {
               var4++;
            }

            var12 = var2[var3++];
            if (var15 >= var9) {
               if (var15 < this.n) {
                  var14 = true;
                  var15++;
               } else {
                  var14 = false;
                  var15 = 0;
               }
            } else {
               var15++;
            }

            if (var12 != 0 && var12 != -1 && !var14) {
               b(var1, var4++, var12, var12, 255);
            } else {
               var4++;
            }

            var12 = var2[var3++];
            if (var15 >= var9) {
               if (var15 < this.n) {
                  var14 = true;
                  var15++;
               } else {
                  var14 = false;
                  var15 = 0;
               }
            } else {
               var15++;
            }

            if (var12 != 0 && var12 != -1 && !var14) {
               b(var1, var4++, var12, var12, 255);
            } else {
               var4++;
            }

            var12 = var2[var3++];
            if (var15 >= var9) {
               if (var15 < this.n) {
                  var14 = true;
                  var15++;
               } else {
                  var14 = false;
                  var15 = 0;
               }
            } else {
               var15++;
            }

            if (var12 != 0 && var12 != -1 && !var14) {
               b(var1, var4++, var12, var12, 255);
            } else {
               var4++;
            }
         }

         for (int var32 = var5; var32 < 0; var32++) {
            int var28 = var2[var3++];
            if (var15 >= var9) {
               if (var15 < this.n) {
                  var14 = true;
                  var15++;
               } else {
                  var14 = false;
                  var15 = 0;
               }
            } else {
               var15++;
            }

            if (var28 != 0 && var28 != -1 && !var14) {
               b(var1, var4++, var28, var28, 255);
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
         var15 = (var3 + 1) % this.n * this.n - 1;
         if (var11 && var3 >= var9 * var10) {
            break;
         }
      }
   }

   private void a(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            int var12 = var2[var3++];
            if (var12 != 0 && var12 != -1) {
               b(var1, var4++, var12, var12, 255);
            } else {
               var4++;
            }

            var12 = var2[var3++];
            if (var12 != 0 && var12 != -1) {
               b(var1, var4++, var12, var12, 255);
            } else {
               var4++;
            }

            var12 = var2[var3++];
            if (var12 != 0 && var12 != -1) {
               b(var1, var4++, var12, var12, 255);
            } else {
               var4++;
            }

            var12 = var2[var3++];
            if (var12 != 0 && var12 != -1) {
               b(var1, var4++, var12, var12, 255);
            } else {
               var4++;
            }
         }

         for (int var20 = var5; var20 < 0; var20++) {
            int var24 = var2[var3++];
            if (var24 != 0 && var24 != -1) {
               b(var1, var4++, var24, var24, 255);
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   private void c(int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var8;

      for (int var11 = -var6; var11 < 0; var11++) {
         for (int var12 = -var2; var12 < 0; var12++) {
            int var13 = var4[var1++];
            if (var13 != 0) {
               int var14 = var3[var9];
               int var15 = ((var13 & 16711935) * var8 + (var14 & 16711935) * var10 & -16711936)
                     + ((var13 & 0xFF00) * var8 + (var14 & 0xFF00) * var10 & 0xFF0000)
                  >> 8;
               b(var3, var9++, var15, var15, var8);
            } else {
               var9++;
            }
         }

         var9 += var7;
         var1 += var5;
      }
   }

   public void a(int var1, int var2, int[] var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         int var11 = -var9 / 2;
         int var12 = -var1 / 2;
         int var13 = (int)(Math.sin((double)var2 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos((double)var2 / 326.11) * 65536.0);
         var13 = var13 * var4 >> 8;
         var14 = var14 * var4 >> 8;
         int var15 = (var10 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var8 + var7 * C_c.h;

         for (int var23 = 0; var23 < var1; var23++) {
            int var18 = var5[var23];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for (int var24 = -var3[var23]; var24 < 0; var24++) {
               if ((var20 >> 16) + (var21 >> 16) * this.n < 0) {
                  var19++;
                  var20 += var14;
                  var21 -= var13;
               } else {
                  if ((var20 >> 16) + (var21 >> 16) * this.n >= this.m.length) {
                     var19++;
                  } else {
                     b(C_c.g, var19++, this.m[(var20 >> 16) + (var21 >> 16) * this.n], this.m[(var20 >> 16) + (var21 >> 16) * this.n], 255);
                  }

                  var20 += var14;
                  var21 -= var13;
               }
            }

            var15 += var13;
            var16 += var14;
            var17 += C_c.h;
         }
      } catch (Exception var22) {
         var22.printStackTrace();
      }
   }

   public void a(int var1, double var2, int var4) {
      byte var5 = 15;
      byte var6 = 20;
      byte var7 = 15;
      short var8 = 256;
      byte var9 = 20;

      try {
         int var10 = -var6 / 2;
         int var11 = -var9 / 2;
         int var12 = (int)(Math.sin(var2) * 65536.0);
         int var13 = (int)(Math.cos(var2) * 65536.0);
         var12 = var12 * var8 >> 8;
         var13 = var13 * var8 >> 8;
         int var14 = (var7 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var5 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var4 + var1 * C_c.h;

         for (int var22 = 0; var22 < var9; var22++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var23 = -var6; var23 < 0; var23++) {
               int var20 = this.m[(var18 >> 16) + (var19 >> 16) * this.n];
               if (var20 != 0) {
                  b(C_c.g, var17++, var20, var20, 255);
               } else {
                  var17++;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += C_c.h;
         }
      } catch (Exception var21) {
      }
   }

   public void a(C_a var1, int var2, int var3) {
      var3 += this.p;
      var2 += this.q;
      int var4 = var3 + var2 * C_c.h;
      int var5 = 0;
      int var6 = this.o;
      int var7 = this.n;
      int var8 = C_c.h - var7;
      int var9 = 0;
      if (var2 < C_c.j) {
         int var10 = C_c.j - var2;
         var6 -= var10;
         var2 = C_c.j;
         var5 += var10 * var7;
         var4 += var10 * C_c.h;
      }

      if (var2 + var6 > C_c.k) {
         var6 -= var2 + var6 - C_c.k;
      }

      if (var3 < C_c.l) {
         int var13 = C_c.l - var3;
         var7 -= var13;
         var3 = C_c.l;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var3 + var7 > C_c.m) {
         int var14 = var3 + var7 - C_c.m;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         this.a(this.m, var7, var1.i, var6, C_c.g, 0, var8, var4, var9, var5);
      }
   }

   private void a(int[] var1, int var2, byte[] var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = -(var2 >> 2);
      var2 = -(var2 & 3);

      for (int var12 = -var4; var12 < 0; var12++) {
         for (int var13 = var11; var13 < 0; var13++) {
            var6 = var1[var10++];
            if (var6 != 0 && var3[var8] == 0) {
               b(var5, var8++, var6, var6, 255);
            } else {
               var8++;
            }

            var6 = var1[var10++];
            if (var6 != 0 && var3[var8] == 0) {
               b(var5, var8++, var6, var6, 255);
            } else {
               var8++;
            }

            var6 = var1[var10++];
            if (var6 != 0 && var3[var8] == 0) {
               b(var5, var8++, var6, var6, 255);
            } else {
               var8++;
            }

            var6 = var1[var10++];
            if (var6 != 0 && var3[var8] == 0) {
               b(var5, var8++, var6, var6, 255);
            } else {
               var8++;
            }
         }

         for (int var26 = var2; var26 < 0; var26++) {
            var6 = var1[var10++];
            if (var6 != 0 && var3[var8] == 0) {
               b(var5, var8++, var6, var6, 255);
            } else {
               var8++;
            }
         }

         var8 += var7;
         var10 += var9;
      }
   }

   public boolean h() {
      return C_Client_mc.hP >= this.k && C_Client_mc.hQ <= this.k + this.n && C_Client_mc.hQ >= this.l && C_Client_mc.hQ <= this.l + this.o;
   }
}
