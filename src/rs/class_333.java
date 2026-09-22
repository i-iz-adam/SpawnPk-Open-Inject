package rs;

import com.sun.jna.platform.win32.bk;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageObserver;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;

/* JADX INFO: loaded from: client-final.jar:rs/class_333.class */
public final class class_333 extends class_329 {
    private static final int u = 140;
    public static final String f = class_650.f() + "sprites/";
    public Image g;
    public Object h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int[] m;
    public int n;
    public int o;
    public int p;
    int q;
    public int r;
    public int s;
    public String t;

    public class_333(boolean z, String str) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        if (!z) {
            String lowerCase = str.toLowerCase();
            this.t = lowerCase;
            this.i = false;
            a(lowerCase);
            return;
        }
        try {
            String lowerCase2 = str.toLowerCase();
            this.t = lowerCase2;
            this.g = Toolkit.getDefaultToolkit().getImage(f + lowerCase2 + ".png");
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            c(255, 0, 255);
            c(255, 255, 255);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class_333() {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
    }

    public void a(String str) {
        try {
            ImageInputStream imageInputStreamCreateImageInputStream = ImageIO.createImageInputStream(new File((f + str + ".png").replace("/", File.separator).replace("//", File.separator).replace("\\\\", File.separator)));
            if (imageInputStreamCreateImageInputStream != null) {
                ImageIcon imageIcon = new ImageIcon(ImageIO.read(imageInputStreamCreateImageInputStream));
                this.n = imageIcon.getIconWidth();
                this.o = imageIcon.getIconHeight();
                this.r = this.n;
                this.s = this.o;
                this.p = 0;
                this.q = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void c() {
        try {
            this.g = Toolkit.getDefaultToolkit().getImage(f + this.t + ".png");
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            if (!this.j) {
                c(255, 0, 255);
                c(255, 255, 255);
            }
            this.i = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class_333(int i, int i2) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        this.m = new int[i * i2];
        this.r = i;
        this.n = i;
        this.s = i2;
        this.o = i2;
        this.q = 0;
        this.p = 0;
    }

    public void a(int i, int i2, int i3) {
        int i4 = i + this.p;
        int i5 = i2 + this.q;
        int i6 = i4 + (i5 * class_210.h);
        int i7 = 0;
        int i8 = this.o;
        int i9 = this.n;
        int i10 = class_210.h - i9;
        int i11 = 0;
        if (i5 < class_210.j) {
            int i12 = class_210.j - i5;
            i8 -= i12;
            i5 = class_210.j;
            i7 = 0 + (i12 * i9);
            i6 += i12 * class_210.h;
        }
        if (i5 + i8 > class_210.k) {
            i8 -= (i5 + i8) - class_210.k;
        }
        if (i4 < class_210.l) {
            int i13 = class_210.l - i4;
            i9 -= i13;
            i4 = class_210.l;
            i7 += i13;
            i6 += i13;
            i11 = 0 + i13;
            i10 += i13;
        }
        if (i4 + i9 > class_210.m) {
            int i14 = (i4 + i9) - class_210.m;
            i9 -= i14;
            i11 += i14;
            i10 += i14;
        }
        if (i9 <= 0 || i8 <= 0) {
            return;
        }
        c(i7, i9, class_210.g, this.m, i11, i8, i10, i3, i6);
    }

    public static Image b(String str) {
        return Toolkit.getDefaultToolkit().getImage(f + str + ".png");
    }

    public static Image a(Image image, int i, int i2) {
        return image.getScaledInstance(i, i2, 4);
    }

    public Image a(int i, int i2) {
        BufferedImage bufferedImage = new BufferedImage(i, i2, 1);
        bufferedImage.setRGB(0, 0, i, i2, this.m, 0, i);
        bufferedImage.createGraphics().dispose();
        return bufferedImage;
    }

    public static BufferedImage a(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth((ImageObserver) null), image.getHeight((ImageObserver) null), 2);
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        graphics2DCreateGraphics.drawImage(image, 0, 0, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        return bufferedImage;
    }

    private static BufferedImage b(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth((ImageObserver) null), image.getHeight((ImageObserver) null), 2);
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        graphics2DCreateGraphics.drawImage(image, 0, 0, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        return bufferedImage;
    }

    public static Image a(Image image, Color color) {
        if (image == null) {
            return null;
        }
        return Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(image.getSource(), new class_334(color)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(int i, int i2) {
        return Math.abs(i - i2) <= 140;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i, int i2, int i3) {
        int i4 = i - i2;
        return Math.abs(i4) <= 140 ? i3 + i4 : i;
    }

    public static Image a(BufferedImage bufferedImage, Color color, Color color2) {
        return Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(bufferedImage.getSource(), new class_335(bufferedImage, color, color2)));
    }

    public class_333(String str, boolean z) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            this.g = Toolkit.getDefaultToolkit().getImage(f + str.toLowerCase() + ".png");
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            c(255, 0, 255);
            if (z) {
                c(255, 255, 255);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class_333(Image image) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            this.g = image;
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            c(255, 0, 255);
            c(255, 255, 255);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class_333(String str) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            String lowerCase = str.toLowerCase();
            this.t = lowerCase;
            this.g = Toolkit.getDefaultToolkit().getImage(f + lowerCase + ".png");
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            c(255, 0, 255);
            c(255, 255, 255);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class_333(String str, String str2) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            String lowerCase = str2.toLowerCase();
            String lowerCase2 = str.toLowerCase();
            if (Client.class.getResource("Client.class").toString().startsWith("file")) {
                this.g = Toolkit.getDefaultToolkit().getImage("./" + lowerCase2 + lowerCase + ".png");
            } else {
                this.g = ImageIO.read(getClass().getResource(lowerCase2 + lowerCase + ".png"));
            }
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            c(255, 0, 255);
            c(255, 255, 255);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class_333(String str, String str2, Color color, Color color2) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (Client.class.getResource("Client.class").toString().startsWith("file")) {
                this.g = Toolkit.getDefaultToolkit().getImage("./" + lowerCase + lowerCase2 + ".png");
            } else {
                this.g = ImageIO.read(getClass().getResource(lowerCase + lowerCase2 + ".png"));
            }
            if (color != null && color2 != null && !color.equals(color2)) {
                try {
                    this.g = a(a(this.g), color, color2);
                } catch (Exception e) {
                }
            }
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            if (color != null && color2 != null && color.equals(color2)) {
                c(255, 0, 255);
                c(255, 255, 255);
            }
        } catch (Exception e2) {
            System.out.println(e2);
        }
    }

    public void b(int i, int i2) {
        if (this.g == null) {
            this.g = a(this.n, this.o);
        }
        if (this.g == null) {
            return;
        }
        Image scaledInstance = this.g.getScaledInstance(i, i2, 1);
        Graphics2D graphics2DCreateGraphics = new BufferedImage(i, i2, 2).createGraphics();
        graphics2DCreateGraphics.drawImage(scaledInstance, 0, 0, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        this.g = scaledInstance;
        this.n = i;
        this.o = i2;
        this.m = new int[i * i2];
        try {
            new PixelGrabber(this.g, 0, 0, i, i2, this.m, 0, i).grabPixels();
            c(255, 0, 255);
            c(255, 255, 255);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public class_333(String str, Color color, Color color2) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            this.g = Toolkit.getDefaultToolkit().getImage(f + str.toLowerCase() + ".png");
            if (color != null && color2 != null) {
                try {
                    this.g = a(a(this.g), color, color2);
                } catch (Exception e) {
                }
            }
            ImageIcon imageIcon = new ImageIcon(this.g);
            this.n = imageIcon.getIconWidth();
            this.o = imageIcon.getIconHeight();
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
        } catch (Exception e2) {
            System.out.println(e2);
        }
    }

    public class_333(String str, int i, int i2) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            Image image = Toolkit.getDefaultToolkit().getImage(f + str.toLowerCase() + ".png");
            this.n = i;
            this.o = i2;
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(image, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            c(255, 0, 255);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public class_333(String str, String str2, int i, int i2, boolean z) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            String lowerCase = str2.toLowerCase();
            String lowerCase2 = str.toLowerCase();
            if (Client.class.getResource("Client.class").toString().startsWith("file")) {
                this.g = Toolkit.getDefaultToolkit().getImage("./" + lowerCase2 + lowerCase + ".png");
            } else {
                this.g = ImageIO.read(getClass().getResource(lowerCase2 + lowerCase + ".png"));
            }
            this.n = i;
            this.o = i2;
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(this.g, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
            this.g = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class_333(String str, int i, int i2, boolean z) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            Image image = Toolkit.getDefaultToolkit().getImage(f + str.toLowerCase() + ".png");
            this.n = i;
            this.o = i2;
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(image, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public class_333(byte[] bArr, Component component) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        try {
            Image imageCreateImage = Toolkit.getDefaultToolkit().createImage(bArr);
            MediaTracker mediaTracker = new MediaTracker(component);
            mediaTracker.addImage(imageCreateImage, 0);
            mediaTracker.waitForAll();
            this.n = imageCreateImage.getWidth(component);
            this.o = imageCreateImage.getHeight(component);
            this.r = this.n;
            this.s = this.o;
            this.p = 0;
            this.q = 0;
            this.m = new int[this.n * this.o];
            new PixelGrabber(imageCreateImage, 0, 0, this.n, this.o, this.m, 0, this.n).grabPixels();
        } catch (Exception e) {
            System.out.println("Error converting jpg");
        }
    }

    public class_333(class_663 class_663Var, String str, int i) {
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        Buffer buffer = new Buffer(class_663Var.a(str + ".dat"));
        Buffer buffer2 = new Buffer(class_663Var.a("index.dat"));
        buffer2.h = buffer.A();
        this.r = buffer2.A();
        this.s = buffer2.A();
        int iY = buffer2.y();
        int[] iArr = new int[iY];
        for (int i2 = 0; i2 < iY - 1; i2++) {
            iArr[i2 + 1] = buffer2.C();
            if (iArr[i2 + 1] == 0) {
                iArr[i2 + 1] = 1;
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            buffer2.h += 2;
            buffer.h += buffer2.A() * buffer2.A();
            buffer2.h++;
        }
        this.p = buffer2.y();
        this.q = buffer2.y();
        this.n = buffer2.A();
        this.o = buffer2.A();
        int iY2 = buffer2.y();
        int i4 = this.n * this.o;
        this.m = new int[i4];
        if (iY2 == 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                this.m[i5] = iArr[buffer.y()];
            }
            return;
        }
        if (iY2 == 1) {
            for (int i6 = 0; i6 < this.n; i6++) {
                for (int i7 = 0; i7 < this.o; i7++) {
                    this.m[i6 + (i7 * this.n)] = iArr[buffer.y()];
                }
            }
        }
    }

    public void b(int i, int i2, int i3) {
        int i4 = i + this.p;
        int i5 = i2 + this.q;
        int i6 = i4 + (i5 * class_210.h);
        int i7 = 0;
        int i8 = this.o;
        int i9 = this.n;
        int i10 = class_210.h - i9;
        int i11 = 0;
        if (i5 < class_210.j) {
            int i12 = class_210.j - i5;
            i8 -= i12;
            i5 = class_210.j;
            i7 = 0 + (i12 * i9);
            i6 += i12 * class_210.h;
        }
        if (i5 + i8 > class_210.k) {
            i8 -= (i5 + i8) - class_210.k;
        }
        if (i4 < class_210.l) {
            int i13 = class_210.l - i4;
            i9 -= i13;
            i4 = class_210.l;
            i7 += i13;
            i6 += i13;
            i11 = 0 + i13;
            i10 += i13;
        }
        if (i4 + i9 > class_210.m) {
            int i14 = (i4 + i9) - class_210.m;
            i9 -= i14;
            i11 += i14;
            i10 += i14;
        }
        if (i9 <= 0 || i8 <= 0) {
            return;
        }
        b(i7, i9, class_210.g, this.m, i11, i8, i10, i3, i6);
    }

    public void c(int i, int i2) {
        this.k = i;
        this.l = i2;
        int i3 = i + this.p;
        int i4 = i2 + this.q;
        int i5 = i3 + (i4 * class_210.h);
        int i6 = 0;
        int i7 = this.o;
        int i8 = this.n;
        int i9 = class_210.h - i8;
        int i10 = 0;
        if (i4 < class_210.j) {
            int i11 = class_210.j - i4;
            i7 -= i11;
            i4 = class_210.j;
            i6 = 0 + (i11 * i8);
            i5 += i11 * class_210.h;
        }
        if (i4 + i7 > class_210.k) {
            i7 -= (i4 + i7) - class_210.k;
        }
        if (i3 < class_210.l) {
            int i12 = class_210.l - i3;
            i8 -= i12;
            i3 = class_210.l;
            i6 += i12;
            i5 += i12;
            i10 = 0 + i12;
            i9 += i12;
        }
        if (i3 + i8 > class_210.m) {
            int i13 = (i3 + i8) - class_210.m;
            i8 -= i13;
            i10 += i13;
            i9 += i13;
        }
        if (i8 <= 0 || i7 <= 0) {
            return;
        }
        a(i8, i7, this.m, class_210.g, i5, 256, i6, i10, i9);
    }

    private void a(int i, int i2, int[] iArr, int[] iArr2, int i3, int i4, int i5, int i6, int i7) {
        for (int i8 = -i2; i8 < 0; i8++) {
            for (int i9 = -i; i9 < 0; i9++) {
                int i10 = (this.m[i5] >> 24) & (i4 - 1);
                int i11 = 256 - i10;
                if (i11 > 256) {
                    i10 = 0;
                }
                if (i4 == 0) {
                    i11 = 256;
                    i10 = 0;
                }
                int i12 = i5;
                i5++;
                int i13 = iArr[i12];
                if (i13 != 0) {
                    int i14 = iArr2[i3];
                    int i15 = i3;
                    i3++;
                    b(iArr2, i15, (((((i13 & 16711935) * i10) + ((i14 & 16711935) * i11)) & (-16711936)) + ((((i13 & bk.ao) * i10) + ((i14 & bk.ao) * i11)) & bk.aS)) >> 8, (((((i13 & 16711935) * i10) + ((i14 & 16711935) * i11)) & (-16711936)) + ((((i13 & bk.ao) * i10) + ((i14 & bk.ao) * i11)) & bk.aS)) >> 8, i10);
                } else {
                    i3++;
                }
            }
            i3 += i7;
            i5 += i6;
        }
    }

    private void b(int i, int i2, int[] iArr, int[] iArr2, int i3, int i4, int i5, int i6, int i7) {
        for (int i8 = -i4; i8 < 0; i8++) {
            for (int i9 = -i2; i9 < 0; i9++) {
                int i10 = (this.m[i] >> 24) & 255;
                int i11 = 256 - i10;
                int i12 = i;
                i++;
                int i13 = iArr2[i12];
                if (i13 != 0) {
                    int i14 = iArr[i7];
                    int i15 = i7;
                    i7++;
                    b(iArr, i15, (((((i13 & 16711935) * i10) + ((i14 & 16711935) * i11)) & (-16711936)) + ((((i13 & bk.ao) * i10) + ((i14 & bk.ao) * i11)) & bk.aS)) >> 8, i13, i10);
                } else {
                    i7++;
                }
            }
            i7 += i5;
            i += i3;
        }
    }

    public void c(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.m.length; i4++) {
            if (((this.m[i4] >> 16) & 255) == i && ((this.m[i4] >> 8) & 255) == i2 && (this.m[i4] & 255) == i3) {
                this.m[i4] = 0;
            }
        }
    }

    public void d() {
        class_210.a(this.n, this.o, this.m);
    }

    public void d(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.m.length; i4++) {
            int i5 = this.m[i4];
            if (i5 != 0) {
                int i6 = ((i5 >> 16) & 255) + i;
                if (i6 < 1) {
                    i6 = 1;
                } else if (i6 > 255) {
                    i6 = 255;
                }
                int i7 = ((i5 >> 8) & 255) + i2;
                if (i7 < 1) {
                    i7 = 1;
                } else if (i7 > 255) {
                    i7 = 255;
                }
                int i8 = (i5 & 255) + i3;
                if (i8 < 1) {
                    i8 = 1;
                } else if (i8 > 255) {
                    i8 = 255;
                }
                this.m[i4] = (i6 << 16) + (i7 << 8) + i8;
            }
        }
    }

    public void e() {
        int[] iArr = new int[this.r * this.s];
        for (int i = 0; i < this.o; i++) {
            System.arraycopy(this.m, i * this.n, iArr, i + (this.q * this.r) + this.p, this.n);
        }
        this.m = iArr;
        this.n = this.r;
        this.o = this.s;
        this.p = 0;
        this.q = 0;
    }

    public void f() {
        int[] iArr = new int[this.n * this.o];
        int i = 0;
        for (int i2 = 0; i2 < this.o; i2++) {
            for (int i3 = this.n - 1; i3 >= 0; i3--) {
                int i4 = i;
                i++;
                iArr[i4] = this.m[i3 + (i2 * this.n)];
            }
        }
        this.m = iArr;
        this.q = (this.r - this.n) - this.q;
    }

    public void g() {
        int[] iArr = new int[this.n * this.o];
        int i = 0;
        for (int i2 = this.o - 1; i2 >= 0; i2--) {
            for (int i3 = 0; i3 < this.n; i3++) {
                int i4 = i;
                i++;
                iArr[i4] = this.m[i3 + (i2 * this.n)];
            }
        }
        this.m = iArr;
        this.p = (this.s - this.o) - this.p;
    }

    public void d(int i, int i2) {
        int i3 = i + this.p;
        int i4 = i2 + this.q;
        int i5 = i3 + (i4 * class_210.h);
        int i6 = 0;
        int i7 = this.o;
        int i8 = this.n;
        int i9 = class_210.h - i8;
        int i10 = 0;
        if (i4 < class_210.j) {
            int i11 = class_210.j - i4;
            i7 -= i11;
            i4 = class_210.j;
            i6 = 0 + (i11 * i8);
            i5 += i11 * class_210.h;
        }
        if (i4 + i7 > class_210.k) {
            i7 -= (i4 + i7) - class_210.k;
        }
        if (i3 < class_210.l) {
            int i12 = class_210.l - i3;
            i8 -= i12;
            i3 = class_210.l;
            i6 += i12;
            i5 += i12;
            i10 = 0 + i12;
            i9 += i12;
        }
        if (i3 + i8 > class_210.m) {
            int i13 = (i3 + i8) - class_210.m;
            i8 -= i13;
            i10 += i13;
            i9 += i13;
        }
        if (i8 <= 0 || i7 <= 0) {
            return;
        }
        a(i5, i8, i7, i10, i6, i9, this.m, class_210.g);
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7 = -(i2 >> 2);
        int i8 = -(i2 & 3);
        for (int i9 = -i3; i9 < 0; i9++) {
            for (int i10 = i7; i10 < 0; i10++) {
                int i11 = i5;
                int i12 = i5 + 1;
                int i13 = iArr[i11];
                int i14 = i;
                int i15 = i + 1;
                b(iArr2, i14, i13, i13, 255);
                int i16 = i12 + 1;
                int i17 = iArr[i12];
                int i18 = i15 + 1;
                b(iArr2, i15, i17, i17, 255);
                int i19 = i16 + 1;
                int i20 = iArr[i16];
                int i21 = i18 + 1;
                b(iArr2, i18, i20, i20, 255);
                i5 = i19 + 1;
                int i22 = iArr[i19];
                i = i21 + 1;
                b(iArr2, i21, i22, i22, 255);
            }
            for (int i23 = i8; i23 < 0; i23++) {
                int i24 = i5;
                i5++;
                int i25 = iArr[i24];
                int i26 = i;
                i++;
                b(iArr2, i26, i25, i25, 255);
            }
            i += i6;
            i5 += i4;
        }
    }

    public void e(int i, int i2, int i3) {
        int i4 = this.n + 2;
        int i5 = this.o + 2;
        int[] iArr = new int[i4 * i5];
        for (int i6 = 0; i6 < this.n; i6++) {
            for (int i7 = 0; i7 < this.o; i7++) {
                if (this.m[i6 + (i7 * this.n)] != 0) {
                    iArr[i6 + 1 + ((i7 + 1) * i4)] = this.m[i6 + (i7 * this.n)];
                }
            }
        }
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < i5; i9++) {
                if (iArr[i8 + (i9 * i4)] == 0) {
                    if (i8 < i4 - 1 && iArr[i8 + 1 + (i9 * i4)] > 0 && iArr[i8 + 1 + (i9 * i4)] != 16777215) {
                        iArr[i8 + (i9 * i4)] = i3;
                    }
                    if (i8 > 0 && iArr[(i8 - 1) + (i9 * i4)] > 0 && iArr[(i8 - 1) + (i9 * i4)] != 16777215) {
                        iArr[i8 + (i9 * i4)] = i3;
                    }
                    if (i9 < i5 - 1 && iArr[i8 + ((i9 + 1) * i4)] > 0 && iArr[i8 + ((i9 + 1) * i4)] != 16777215) {
                        iArr[i8 + (i9 * i4)] = i3;
                    }
                    if (i9 > 0 && iArr[i8 + ((i9 - 1) * i4)] > 0 && iArr[i8 + ((i9 - 1) * i4)] != 16777215) {
                        iArr[i8 + (i9 * i4)] = i3;
                    }
                }
            }
        }
        int i10 = (i - 1) + this.p;
        int i11 = (i2 - 1) + this.q;
        int i12 = i10 + (i11 * class_210.h);
        int i13 = 0;
        int i14 = i5;
        int i15 = i4;
        int i16 = class_210.h - i15;
        int i17 = 0;
        if (i11 < class_210.j) {
            int i18 = class_210.j - i11;
            i14 -= i18;
            i11 = class_210.j;
            i13 = 0 + (i18 * i15);
            i12 += i18 * class_210.h;
        }
        if (i11 + i14 > class_210.k) {
            i14 -= (i11 + i14) - class_210.k;
        }
        if (i10 < class_210.l) {
            int i19 = class_210.l - i10;
            i15 -= i19;
            i10 = class_210.l;
            i13 += i19;
            i12 += i19;
            i17 = 0 + i19;
            i16 += i19;
        }
        if (i10 + i15 > class_210.m) {
            int i20 = (i10 + i15) - class_210.m;
            i15 -= i20;
            i17 += i20;
            i16 += i20;
        }
        if (i15 <= 0 || i14 <= 0) {
            return;
        }
        a(class_210.g, iArr, i13, i12, i15, i14, i16, i17);
    }

    public void f(int i, int i2, int i3) {
        int i4 = this.n + 2;
        int i5 = this.o + 2;
        int[] iArr = new int[i4 * i5];
        for (int i6 = 0; i6 < this.n; i6++) {
            for (int i7 = 0; i7 < this.o; i7++) {
                if (this.m[i6 + (i7 * this.n)] != 0) {
                    iArr[i6 + 1 + ((i7 + 1) * i4)] = this.m[i6 + (i7 * this.n)];
                }
            }
        }
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < i5; i9++) {
                if (iArr[i8 + (i9 * i4)] == 0) {
                    if (i8 < i4 - 1 && iArr[i8 + 1 + (i9 * i4)] != 0 && iArr[i8 + 1 + (i9 * i4)] != 16777215) {
                        iArr[i8 + (i9 * i4)] = i3;
                    }
                    if (i8 > 0 && iArr[(i8 - 1) + (i9 * i4)] != 0 && iArr[(i8 - 1) + (i9 * i4)] != 16777215) {
                        iArr[i8 + (i9 * i4)] = i3;
                    }
                    if (i9 < i5 - 1 && iArr[i8 + ((i9 + 1) * i4)] != 0 && iArr[i8 + ((i9 + 1) * i4)] != 16777215) {
                        iArr[i8 + (i9 * i4)] = i3;
                    }
                    if (i9 > 0 && iArr[i8 + ((i9 - 1) * i4)] != 0 && iArr[i8 + ((i9 - 1) * i4)] != 16777215) {
                        iArr[i8 + (i9 * i4)] = i3;
                    }
                }
            }
        }
        int i10 = (i - 1) + this.p;
        int i11 = (i2 - 1) + this.q;
        int i12 = i10 + (i11 * class_210.h);
        int i13 = 0;
        int i14 = i5;
        int i15 = i4;
        int i16 = class_210.h - i15;
        int i17 = 0;
        if (i11 < class_210.j) {
            int i18 = class_210.j - i11;
            i14 -= i18;
            i11 = class_210.j;
            i13 = 0 + (i18 * i15);
            i12 += i18 * class_210.h;
        }
        if (i11 + i14 > class_210.k) {
            i14 -= (i11 + i14) - class_210.k;
        }
        if (i10 < class_210.l) {
            int i19 = class_210.l - i10;
            i15 -= i19;
            i10 = class_210.l;
            i13 += i19;
            i12 += i19;
            i17 = 0 + i19;
            i16 += i19;
        }
        if (i10 + i15 > class_210.m) {
            int i20 = (i10 + i15) - class_210.m;
            i15 -= i20;
            i17 += i20;
            i16 += i20;
        }
        if (i15 <= 0 || i14 <= 0) {
            return;
        }
        a(class_210.g, iArr, i13, i12, i15, i14, i16, i17);
    }

    public void e(int i, int i2) {
        this.k = i;
        this.l = i2;
        int i3 = i + this.p;
        int i4 = i2 + this.q;
        int i5 = i3 + (i4 * class_210.h);
        int i6 = 0;
        int i7 = this.o;
        int i8 = this.n;
        int i9 = class_210.h - i8;
        int i10 = 0;
        if (i4 < class_210.j) {
            int i11 = class_210.j - i4;
            i7 -= i11;
            i4 = class_210.j;
            i6 = 0 + (i11 * i8);
            i5 += i11 * class_210.h;
        }
        if (i4 + i7 > class_210.k) {
            i7 -= (i4 + i7) - class_210.k;
        }
        if (i3 < class_210.l) {
            int i12 = class_210.l - i3;
            i8 -= i12;
            i3 = class_210.l;
            i6 += i12;
            i5 += i12;
            i10 = 0 + i12;
            i9 += i12;
        }
        if (i3 + i8 > class_210.m) {
            int i13 = (i3 + i8) - class_210.m;
            i8 -= i13;
            i10 += i13;
            i9 += i13;
        }
        if (i8 <= 0 || i7 <= 0) {
            return;
        }
        c(i6, i8, class_210.g, this.m, i10, i7, i9, 128, i5);
    }

    public void a(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        int i5 = i + this.p;
        int i6 = i2 + this.q;
        int i7 = i5 + (i6 * class_210.h);
        int i8 = 0;
        int i9 = this.o;
        int i10 = this.n;
        int i11 = class_210.h - i10;
        int i12 = 0;
        if (i6 < class_210.j) {
            int i13 = class_210.j - i6;
            i9 -= i13;
            i6 = class_210.j;
            i8 = 0 + (i13 * i10);
            i7 += i13 * class_210.h;
        }
        if (i6 + i9 > class_210.k) {
            i9 -= (i6 + i9) - class_210.k;
        }
        if (i5 < class_210.l) {
            int i14 = class_210.l - i5;
            i10 -= i14;
            i5 = class_210.l;
            i8 += i14;
            i7 += i14;
            i12 = 0 + i14;
            i11 += i14;
        }
        if (i5 + i10 > class_210.m) {
            int i15 = (i5 + i10) - class_210.m;
            i10 -= i15;
            i12 += i15;
            i11 += i15;
        }
        if (i10 <= 0 || i9 <= 0) {
            return;
        }
        a(class_210.g, this.m, i8, i7, i10, i9, i11, i12, i3, i4);
    }

    public void f(int i, int i2) {
        int i3 = i + this.p;
        int i4 = i2 + this.q;
        int i5 = i3 + (i4 * class_210.h);
        int i6 = 0;
        int i7 = this.o;
        int i8 = this.n;
        int i9 = class_210.h - i8;
        int i10 = 0;
        if (i4 < class_210.j) {
            int i11 = class_210.j - i4;
            i7 -= i11;
            i4 = class_210.j;
            i6 = 0 + (i11 * i8);
            i5 += i11 * class_210.h;
        }
        if (i4 + i7 > class_210.k) {
            i7 -= (i4 + i7) - class_210.k;
        }
        if (i3 < class_210.l) {
            int i12 = class_210.l - i3;
            i8 -= i12;
            i3 = class_210.l;
            i6 += i12;
            i5 += i12;
            i10 = 0 + i12;
            i9 += i12;
        }
        if (i3 + i8 > class_210.m) {
            int i13 = (i3 + i8) - class_210.m;
            i8 -= i13;
            i10 += i13;
            i9 += i13;
        }
        if (i8 <= 0 || i7 <= 0) {
            return;
        }
        a(class_210.g, this.m, i6, i5, i8, i7, i9, i10);
    }

    public void g(int i, int i2, int i3) {
        this.k = i;
        this.l = i2;
        int i4 = i + this.p;
        int i5 = i2 + this.q;
        int i6 = i4 + (i5 * class_210.h);
        int i7 = 0;
        int i8 = this.o;
        int i9 = this.n;
        int i10 = class_210.h - i9;
        int i11 = 0;
        if (i5 < class_210.j) {
            int i12 = class_210.j - i5;
            i8 -= i12;
            i5 = class_210.j;
            i7 = 0 + (i12 * i9);
            i6 += i12 * class_210.h;
        }
        if (i5 + i8 > class_210.k) {
            i8 -= (i5 + i8) - class_210.k;
        }
        if (i4 < class_210.l) {
            int i13 = class_210.l - i4;
            i9 -= i13;
            i4 = class_210.l;
            i7 += i13;
            i6 += i13;
            i11 = 0 + i13;
            i10 += i13;
        }
        if (i4 + i9 > class_210.m) {
            int i14 = (i4 + i9) - class_210.m;
            i9 -= i14;
            i11 += i14;
            i10 += i14;
        }
        if (i9 <= 0 || i8 <= 0) {
            return;
        }
        c(i7, i9, class_210.g, this.m, i11, i8, i10, i3, i6);
    }

    private void a(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a(iArr, iArr2, i, i2, i3, i4, i5, i6, i7, i8, false);
    }

    private void a(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = -(i3 >> 2);
        int i16 = -(i3 & 3);
        boolean z2 = false;
        int i17 = (((i + 1) % this.n) * this.n) - 1;
        for (int i18 = -i4; i18 < 0; i18++) {
            for (int i19 = i15; i19 < 0; i19++) {
                int i20 = i;
                int i21 = i + 1;
                int i22 = iArr2[i20];
                if (i17 < i7) {
                    i9 = i17 + 1;
                } else if (i17 < this.n) {
                    z2 = true;
                    i9 = i17 + 1;
                } else {
                    z2 = false;
                    i9 = 0;
                }
                if (i22 == 0 || i22 == -1 || z2) {
                    i10 = i2 + 1;
                } else {
                    int i23 = i2;
                    i10 = i2 + 1;
                    b(iArr, i23, i22, i22, 255);
                }
                int i24 = i21 + 1;
                int i25 = iArr2[i21];
                if (i9 < i7) {
                    i11 = i9 + 1;
                } else if (i9 < this.n) {
                    z2 = true;
                    i11 = i9 + 1;
                } else {
                    z2 = false;
                    i11 = 0;
                }
                if (i25 == 0 || i25 == -1 || z2) {
                    i12 = i10 + 1;
                } else {
                    int i26 = i10;
                    i12 = i10 + 1;
                    b(iArr, i26, i25, i25, 255);
                }
                int i27 = i24 + 1;
                int i28 = iArr2[i24];
                if (i11 < i7) {
                    i13 = i11 + 1;
                } else if (i11 < this.n) {
                    z2 = true;
                    i13 = i11 + 1;
                } else {
                    z2 = false;
                    i13 = 0;
                }
                if (i28 == 0 || i28 == -1 || z2) {
                    i14 = i12 + 1;
                } else {
                    int i29 = i12;
                    i14 = i12 + 1;
                    b(iArr, i29, i28, i28, 255);
                }
                i = i27 + 1;
                int i30 = iArr2[i27];
                if (i13 < i7) {
                    i17 = i13 + 1;
                } else if (i13 < this.n) {
                    z2 = true;
                    i17 = i13 + 1;
                } else {
                    z2 = false;
                    i17 = 0;
                }
                if (i30 == 0 || i30 == -1 || z2) {
                    i2 = i14 + 1;
                } else {
                    int i31 = i14;
                    i2 = i14 + 1;
                    b(iArr, i31, i30, i30, 255);
                }
            }
            for (int i32 = i16; i32 < 0; i32++) {
                int i33 = i;
                i++;
                int i34 = iArr2[i33];
                if (i17 < i7) {
                    i17++;
                } else if (i17 < this.n) {
                    z2 = true;
                    i17++;
                } else {
                    z2 = false;
                    i17 = 0;
                }
                if (i34 == 0 || i34 == -1 || z2) {
                    i2++;
                } else {
                    int i35 = i2;
                    i2++;
                    b(iArr, i35, i34, i34, 255);
                }
            }
            i2 += i5;
            i += i6;
            i17 = (((i + 1) % this.n) * this.n) - 1;
            if (z && i >= i7 * i8) {
                return;
            }
        }
    }

    private void a(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10 = -(i3 >> 2);
        int i11 = -(i3 & 3);
        for (int i12 = -i4; i12 < 0; i12++) {
            for (int i13 = i10; i13 < 0; i13++) {
                int i14 = i;
                int i15 = i + 1;
                int i16 = iArr2[i14];
                if (i16 == 0 || i16 == -1) {
                    i7 = i2 + 1;
                } else {
                    int i17 = i2;
                    i7 = i2 + 1;
                    b(iArr, i17, i16, i16, 255);
                }
                int i18 = i15 + 1;
                int i19 = iArr2[i15];
                if (i19 == 0 || i19 == -1) {
                    i8 = i7 + 1;
                } else {
                    int i20 = i7;
                    i8 = i7 + 1;
                    b(iArr, i20, i19, i19, 255);
                }
                int i21 = i18 + 1;
                int i22 = iArr2[i18];
                if (i22 == 0 || i22 == -1) {
                    i9 = i8 + 1;
                } else {
                    int i23 = i8;
                    i9 = i8 + 1;
                    b(iArr, i23, i22, i22, 255);
                }
                i = i21 + 1;
                int i24 = iArr2[i21];
                if (i24 == 0 || i24 == -1) {
                    i2 = i9 + 1;
                } else {
                    int i25 = i9;
                    i2 = i9 + 1;
                    b(iArr, i25, i24, i24, 255);
                }
            }
            for (int i26 = i11; i26 < 0; i26++) {
                int i27 = i;
                i++;
                int i28 = iArr2[i27];
                if (i28 == 0 || i28 == -1) {
                    i2++;
                } else {
                    int i29 = i2;
                    i2++;
                    b(iArr, i29, i28, i28, 255);
                }
            }
            i2 += i5;
            i += i6;
        }
    }

    private void c(int i, int i2, int[] iArr, int[] iArr2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 256 - i6;
        for (int i9 = -i4; i9 < 0; i9++) {
            for (int i10 = -i2; i10 < 0; i10++) {
                int i11 = i;
                i++;
                int i12 = iArr2[i11];
                if (i12 != 0) {
                    int i13 = iArr[i7];
                    int i14 = (((((i12 & 16711935) * i6) + ((i13 & 16711935) * i8)) & (-16711936)) + ((((i12 & bk.ao) * i6) + ((i13 & bk.ao) * i8)) & bk.aS)) >> 8;
                    int i15 = i7;
                    i7++;
                    b(iArr, i15, i14, i14, i6);
                } else {
                    i7++;
                }
            }
            i7 += i5;
            i += i3;
        }
    }

    public void a(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, int i5, int i6, int i7, int i8) {
        try {
            int i9 = (-i7) / 2;
            int i10 = (-i) / 2;
            int iSin = (((int) (Math.sin(((double) i2) / 326.11d) * 65536.0d)) * i3) >> 8;
            int iCos = (((int) (Math.cos(((double) i2) / 326.11d) * 65536.0d)) * i3) >> 8;
            int i11 = (i8 << 16) + (i10 * iSin) + (i9 * iCos);
            int i12 = (i4 << 16) + ((i10 * iCos) - (i9 * iSin));
            int i13 = i6 + (i5 * class_210.h);
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = iArr2[i14];
                int i16 = i13 + i15;
                int i17 = i11 + (iCos * i15);
                int i18 = i12 - (iSin * i15);
                for (int i19 = -iArr[i14]; i19 < 0; i19++) {
                    if ((i17 >> 16) + ((i18 >> 16) * this.n) < 0) {
                        i16++;
                        i17 += iCos;
                        i18 -= iSin;
                    } else {
                        if ((i17 >> 16) + ((i18 >> 16) * this.n) >= this.m.length) {
                            i16++;
                        } else {
                            int i20 = i16;
                            i16++;
                            b(class_210.g, i20, this.m[(i17 >> 16) + ((i18 >> 16) * this.n)], this.m[(i17 >> 16) + ((i18 >> 16) * this.n)], 255);
                        }
                        i17 += iCos;
                        i18 -= iSin;
                    }
                }
                i11 += iSin;
                i12 += iCos;
                i13 += class_210.h;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(int i, double d, int i2) {
        try {
            int i3 = (-20) / 2;
            int i4 = (-20) / 2;
            int iSin = (((int) (Math.sin(d) * 65536.0d)) * 256) >> 8;
            int iCos = (((int) (Math.cos(d) * 65536.0d)) * 256) >> 8;
            int i5 = (15 << 16) + (i4 * iSin) + (i3 * iCos);
            int i6 = (15 << 16) + ((i4 * iCos) - (i3 * iSin));
            int i7 = i2 + (i * class_210.h);
            for (int i8 = 0; i8 < 20; i8++) {
                int i9 = i7;
                int i10 = i5;
                int i11 = i6;
                for (int i12 = -20; i12 < 0; i12++) {
                    int i13 = this.m[(i10 >> 16) + ((i11 >> 16) * this.n)];
                    if (i13 != 0) {
                        int i14 = i9;
                        i9++;
                        b(class_210.g, i14, i13, i13, 255);
                    } else {
                        i9++;
                    }
                    i10 += iCos;
                    i11 -= iSin;
                }
                i5 += iSin;
                i6 += iCos;
                i7 += class_210.h;
            }
        } catch (Exception e) {
        }
    }

    public void a(class_190 class_190Var, int i, int i2) {
        int i3 = i2 + this.p;
        int i4 = i + this.q;
        int i5 = i3 + (i4 * class_210.h);
        int i6 = 0;
        int i7 = this.o;
        int i8 = this.n;
        int i9 = class_210.h - i8;
        int i10 = 0;
        if (i4 < class_210.j) {
            int i11 = class_210.j - i4;
            i7 -= i11;
            i4 = class_210.j;
            i6 = 0 + (i11 * i8);
            i5 += i11 * class_210.h;
        }
        if (i4 + i7 > class_210.k) {
            i7 -= (i4 + i7) - class_210.k;
        }
        if (i3 < class_210.l) {
            int i12 = class_210.l - i3;
            i8 -= i12;
            i3 = class_210.l;
            i6 += i12;
            i5 += i12;
            i10 = 0 + i12;
            i9 += i12;
        }
        if (i3 + i8 > class_210.m) {
            int i13 = (i3 + i8) - class_210.m;
            i8 -= i13;
            i10 += i13;
            i9 += i13;
        }
        if (i8 <= 0 || i7 <= 0) {
            return;
        }
        a(this.m, i8, class_190Var.i, i7, class_210.g, 0, i9, i5, i10, i6);
    }

    private void a(int[] iArr, int i, byte[] bArr, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11 = -(i >> 2);
        int i12 = -(i & 3);
        for (int i13 = -i2; i13 < 0; i13++) {
            for (int i14 = i11; i14 < 0; i14++) {
                int i15 = i7;
                int i16 = i7 + 1;
                int i17 = iArr[i15];
                if (i17 == 0 || bArr[i5] != 0) {
                    i8 = i5 + 1;
                } else {
                    int i18 = i5;
                    i8 = i5 + 1;
                    b(iArr2, i18, i17, i17, 255);
                }
                int i19 = i16 + 1;
                int i20 = iArr[i16];
                if (i20 == 0 || bArr[i8] != 0) {
                    i9 = i8 + 1;
                } else {
                    int i21 = i8;
                    i9 = i8 + 1;
                    b(iArr2, i21, i20, i20, 255);
                }
                int i22 = i19 + 1;
                int i23 = iArr[i19];
                if (i23 == 0 || bArr[i9] != 0) {
                    i10 = i9 + 1;
                } else {
                    int i24 = i9;
                    i10 = i9 + 1;
                    b(iArr2, i24, i23, i23, 255);
                }
                i7 = i22 + 1;
                int i25 = iArr[i22];
                if (i25 == 0 || bArr[i10] != 0) {
                    i5 = i10 + 1;
                } else {
                    int i26 = i10;
                    i5 = i10 + 1;
                    b(iArr2, i26, i25, i25, 255);
                }
            }
            for (int i27 = i12; i27 < 0; i27++) {
                int i28 = i7;
                i7++;
                int i29 = iArr[i28];
                if (i29 == 0 || bArr[i5] != 0) {
                    i5++;
                } else {
                    int i30 = i5;
                    i5++;
                    b(iArr2, i30, i29, i29, 255);
                }
            }
            i5 += i4;
            i7 += i6;
        }
    }

    public boolean h() {
        return Client.hP >= this.k && Client.hQ <= this.k + this.n && Client.hQ >= this.l && Client.hQ <= this.l + this.o;
    }
}
