package rs.p_A_uc;

import com.google.a.m.l;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;

public class C_g {
   public static final int a = 255;
   public static final int b = 0;
   private static final String d = "<col=";
   private static final String e = ">";
   public static final String c = "</col>";
   private static final Pattern f = Pattern.compile("^(#|0x)?[0-9a-fA-F]{7,8}");
   private static final Pattern g = Pattern.compile("^(#|0x)?[0-9a-fA-F]{1,8}");

   public static String a(Color var0) {
      return "<col=" + c(var0) + ">";
   }

   public static String a(String var0, Color var1) {
      return a(var1) + var0;
   }

   public static String b(String var0, Color var1) {
      return a(var0, var1) + "</col>";
   }

   public static String b(Color var0) {
      return "#" + c(var0);
   }

   public static Color a(Color var0, Color var1, double var2) {
      double var4 = (double)var0.getRed();
      double var6 = (double)var1.getRed();
      double var8 = (double)var0.getGreen();
      double var10 = (double)var1.getGreen();
      double var12 = (double)var0.getBlue();
      double var14 = (double)var1.getBlue();
      double var16 = (double)var0.getAlpha();
      double var18 = (double)var1.getAlpha();
      return new Color(
         (int)Math.round(var4 + var2 * (var6 - var4)),
         (int)Math.round(var8 + var2 * (var10 - var8)),
         (int)Math.round(var12 + var2 * (var14 - var12)),
         (int)Math.round(var16 + var2 * (var18 - var16))
      );
   }

   public static String c(Color var0) {
      return String.format("%06x", var0.getRGB() & 16777215);
   }

   public static String d(Color var0) {
      return String.format("%08x", var0.getRGB());
   }

   public static Color a(Color var0, int var1) {
      if (var0.getAlpha() == var1) {
         return var0;
      } else {
         var1 = a(var1);
         return new Color(var0.getRGB() & 16777215 | var1 << 24, true);
      }
   }

   public static boolean a(String var0) {
      return f.matcher(var0).matches();
   }

   public static boolean b(String var0) {
      return g.matcher(var0).matches();
   }

   public static int a(int var0) {
      return l.a(var0, 0, 255);
   }

   public static Color c(String var0) {
      try {
         int var1 = Integer.decode(var0);
         return new Color(var1, true);
      } catch (NumberFormatException var2) {
         return null;
      }
   }

   public static Color d(String var0) {
      if (!var0.startsWith("#") && !var0.startsWith("0x")) {
         var0 = "#" + var0;
      }

      if ((var0.length() > 7 || !var0.startsWith("#")) && (var0.length() > 8 || !var0.startsWith("0x"))) {
         try {
            return new Color(Long.decode(var0).intValue(), true);
         } catch (NumberFormatException var3) {
            return null;
         }
      } else {
         try {
            return Color.decode(var0);
         } catch (NumberFormatException var2) {
            return null;
         }
      }
   }

   public static Color a(@Nonnull Object var0) {
      int var1 = var0.hashCode();
      float var2 = (float)(var1 % 360) / 360.0F;
      return Color.getHSBColor(var2, 1.0F, 1.0F);
   }
}
