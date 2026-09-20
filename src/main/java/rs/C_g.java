package rs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class C_g {
   private static final String a = "./tests/";

   public static void a(String var0) {
      System.out.println(var0);
   }

   public static void a(String var0, int var1, int var2, byte[] var3) {
      BufferedImage var4 = new BufferedImage(var1, var2, 1);

      for (int var5 = 0; var5 < var1; var5++) {
         for (int var6 = 0; var6 < var2; var6++) {
            var4.setRGB(var5, var6, var3[var5 + var6 * var1]);
         }
      }

      File var8 = new File("./tests/" + var0 + ".png");

      try {
         a("Dumped image to: " + var8.getAbsolutePath());
         ImageIO.write(var4, "png", var8);
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   public static void a(String var0, int var1, int var2, int[] var3) {
      BufferedImage var4 = new BufferedImage(var1, var2, 1);

      for (int var5 = 0; var5 < var1; var5++) {
         for (int var6 = 0; var6 < var2; var6++) {
            var4.setRGB(var5, var6, var3[var5 + var6 * var1]);
         }
      }

      File var8 = new File("./tests/" + var0 + ".png");

      try {
         a("Dumped image to: " + var8.getAbsolutePath());
         ImageIO.write(var4, "png", var8);
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }
}
