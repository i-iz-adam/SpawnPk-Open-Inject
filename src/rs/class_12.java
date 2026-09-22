package rs;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.GrayFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_12.class */
public class class_12 {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_12.class);

    @Deprecated
    public static BufferedImage a(Class<?> cls, String str) {
        return b(cls, str);
    }

    public static BufferedImage b(Class<?> cls, String str) {
        BufferedImage bufferedImage;
        try {
            InputStream resourceAsStream = cls.getResourceAsStream(str);
            try {
                synchronized (ImageIO.class) {
                    bufferedImage = ImageIO.read(resourceAsStream);
                }
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return bufferedImage;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(str, e);
        } catch (IllegalArgumentException e2) {
            a.warn("Failed to load image from class: {}, path: {}", cls.getName(), str.startsWith("/") ? str : cls.getPackage().getName().replace('.', '/') + "/" + str);
            throw new IllegalArgumentException(str, e2);
        }
    }

    public static BufferedImage a(BufferedImage bufferedImage, boolean z, boolean z2) {
        int i = 0;
        int i2 = 0;
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        BufferedImage bufferedImage2 = new BufferedImage(width, height, 2);
        Graphics2D graphics2DCreateGraphics = bufferedImage2.createGraphics();
        if (z) {
            i = width;
            width *= -1;
        }
        if (z2) {
            i2 = height;
            height *= -1;
        }
        graphics2DCreateGraphics.drawImage(bufferedImage, i, i2, width, height, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage a(BufferedImage bufferedImage, int i, int i2) {
        return a(bufferedImage, i, i2, false);
    }

    public static BufferedImage a(BufferedImage bufferedImage, int i, int i2, boolean z) {
        Image scaledInstance;
        if (z) {
            scaledInstance = bufferedImage.getWidth() > bufferedImage.getHeight() ? bufferedImage.getScaledInstance(i, -1, 4) : bufferedImage.getScaledInstance(-1, i2, 4);
        } else {
            scaledInstance = bufferedImage.getScaledInstance(i, i2, 4);
        }
        return a(scaledInstance);
    }

    public static BufferedImage a(Image image) {
        return image instanceof BufferedImage ? (BufferedImage) image : b(image);
    }

    public static BufferedImage b(Image image) {
        if ((image instanceof BufferedImage) && ((BufferedImage) image).getType() == 2) {
            return (BufferedImage) image;
        }
        BufferedImage bufferedImage = new BufferedImage(image.getWidth((ImageObserver) null), image.getHeight((ImageObserver) null), 2);
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        graphics2DCreateGraphics.drawImage(image, 0, 0, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        return bufferedImage;
    }

    public static BufferedImage a(Image image, int i) {
        BufferedImage bufferedImageB = b(image);
        int numComponents = bufferedImageB.getColorModel().getNumComponents();
        float[] fArr = new float[numComponents];
        float[] fArr2 = new float[numComponents];
        Arrays.fill(fArr, 1.0f);
        Arrays.fill(fArr2, 0.0f);
        fArr2[numComponents - 1] = i;
        return a(bufferedImageB, fArr, fArr2);
    }

    public static BufferedImage a(Image image, float f) {
        BufferedImage bufferedImageB = b(image);
        int numComponents = bufferedImageB.getColorModel().getNumComponents();
        float[] fArr = new float[numComponents];
        float[] fArr2 = new float[numComponents];
        Arrays.fill(fArr, 1.0f);
        Arrays.fill(fArr2, 0.0f);
        fArr[numComponents - 1] = f;
        return a(bufferedImageB, fArr, fArr2);
    }

    public static BufferedImage a(BufferedImage bufferedImage) {
        return a(GrayFilter.createDisabledImage(bufferedImage));
    }

    public static BufferedImage b(Image image, int i) {
        BufferedImage bufferedImageB = b(image);
        float f = i;
        int numComponents = bufferedImageB.getColorModel().getNumComponents();
        float[] fArr = new float[numComponents];
        float[] fArr2 = new float[numComponents];
        Arrays.fill(fArr, 1.0f);
        for (int i2 = 0; i2 < numComponents; i2++) {
            fArr2[i2] = f;
        }
        fArr2[numComponents - 1] = 0.0f;
        return a(bufferedImageB, fArr, fArr2);
    }

    public static BufferedImage b(Image image, float f) {
        BufferedImage bufferedImageB = b(image);
        int numComponents = bufferedImageB.getColorModel().getNumComponents();
        float[] fArr = new float[numComponents];
        float[] fArr2 = new float[numComponents];
        Arrays.fill(fArr2, 0.0f);
        for (int i = 0; i < numComponents; i++) {
            fArr[i] = f;
        }
        fArr[numComponents - 1] = 1.0f;
        return a(bufferedImageB, fArr, fArr2);
    }

    private static BufferedImage a(BufferedImage bufferedImage, float[] fArr, float[] fArr2) {
        return new RescaleOp(fArr, fArr2, (RenderingHints) null).filter(bufferedImage, (BufferedImage) null);
    }

    public static BufferedImage a(BufferedImage bufferedImage, double d) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.rotate(d, ((double) bufferedImage.getWidth()) / 2.0d, ((double) bufferedImage.getHeight()) / 2.0d);
        return new AffineTransformOp(affineTransform, 2).filter(bufferedImage, (BufferedImage) null);
    }

    static {
        ImageIO.setUseCache(false);
    }
}
