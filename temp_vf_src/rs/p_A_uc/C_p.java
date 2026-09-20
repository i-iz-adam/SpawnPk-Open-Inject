package rs.p_A_uc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C_p {
   private static final String[] a = new String[]{"", "K", "M", "B", "T"};
   private static final Pattern b = Pattern.compile("^-?[0-9,.]+([a-zA-Z]?)$");
   private static final NumberFormat c = NumberFormat.getInstance(Locale.ENGLISH);
   private static final NumberFormat d = new DecimalFormat("#,###.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
   private static final NumberFormat e = new DecimalFormat("#,###.###", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

   public static synchronized String a(long var0) {
      if (var0 < 0L) {
         return "-" + a(var0 == Long.MIN_VALUE ? Long.MAX_VALUE : -var0);
      } else if (var0 < 10000L) {
         return c.format(var0);
      } else {
         String var2 = a[0];
         long var3 = 1L;

         for (int var5 = a.length - 1; var5 >= 0; var5--) {
            var3 = (long)Math.pow(10.0, (double)(var5 * 3));
            if ((double)var0 / (double)var3 >= 1.0) {
               var2 = a[var5];
               break;
            }
         }

         String var6 = c.format((double)var0 / (double)var3);
         var6 = var6.length() > 4 ? var6.substring(0, 4) : var6;
         return (var6.endsWith(".") ? var6.substring(0, 3) : var6) + var2;
      }
   }

   public static String a(int var0) {
      return a(var0, false);
   }

   public static synchronized String a(int var0, boolean var1) {
      String var2 = String.valueOf(var0);
      if (var2.length() <= 4) {
         return var2;
      } else {
         int var3 = (int)Math.log10((double)var0);
         NumberFormat var4 = var1 && var3 >= 6 ? e : d;
         return var4.format((double)var0 / Math.pow(10.0, (double)(var3 / 3 * 3))) + a[var3 / 3];
      }
   }

   public static synchronized long a(String var0) {
      int var1 = b(var0);
      float var2 = c.parse(var0).floatValue();
      return (long)(var2 * (float)var1);
   }

   public static synchronized String b(long var0) {
      return c.format(var0);
   }

   public static synchronized String a(double var0) {
      return c.format(var0);
   }

   private static int b(String var0) {
      Matcher var2 = b.matcher(var0);
      if (var2.find()) {
         String var1 = var2.group(1);
         if (!var1.equals("")) {
            for (int var3 = 1; var3 < a.length; var3++) {
               if (a[var3].equals(var1.toUpperCase())) {
                  return (int)Math.pow(10.0, (double)(var3 * 3));
               }
            }

            throw new ParseException("Invalid Suffix: " + var1, var0.length() - 1);
         } else {
            return 1;
         }
      } else {
         throw new ParseException(var0 + " does not resemble a properly formatted stack.", var0.length() - 1);
      }
   }
}
