package rs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/* JADX INFO: loaded from: client-final.jar:rs/class_148.class */
public class class_148 {
    private static final String a = "./tests/";

    public static void a(String str) {
        System.out.println(str);
    }

    public static void a(String str, int i, int i2, byte[] bArr) {
        BufferedImage bufferedImage = new BufferedImage(i, i2, 1);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                bufferedImage.setRGB(i3, i4, bArr[i3 + (i4 * i)]);
            }
        }
        File file = new File("./tests/" + str + ".png");
        try {
            a("Dumped image to: " + file.getAbsolutePath());
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void a(String str, int i, int i2, int[] iArr) {
        BufferedImage bufferedImage = new BufferedImage(i, i2, 1);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                bufferedImage.setRGB(i3, i4, iArr[i3 + (i4 * i)]);
            }
        }
        File file = new File("./tests/" + str + ".png");
        try {
            a("Dumped image to: " + file.getAbsolutePath());
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
