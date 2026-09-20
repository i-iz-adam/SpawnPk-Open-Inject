package rs.p_secure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class C_c {
   private static final int c = 7;
   private static final int d = 10;
   public static String a = null;
   public static boolean b = false;

   public static String a() {
      if (b) {
         return a;
      } else {
         String var0 = null;
         Process var1 = null;

         try {
            var1 = a("cmd /c systeminfo", 7);
            var0 = a(var1);
         } catch (Exception var15) {
            if (rs.p_f.C_a.d) {
               var15.printStackTrace();
            }
         } finally {
            if (var1 != null) {
               var1.destroy();
            }
         }

         if (rs.p_v.C_a.a(var0)) {
            try {
               String var2 = "powershell.exe -Command \"(Get-CimInstance Win32_OperatingSystem).InstallDate.ToString('yyyyMMddHHmmss.ffffff')\"";
               var1 = a(var2, 10);
               var0 = b(var1);
            } catch (Exception var13) {
               if (rs.p_f.C_a.d) {
                  var13.printStackTrace();
               }
            } finally {
               if (var1 != null) {
                  var1.destroy();
               }
            }
         }

         a = var0;
         b = true;
         return null;
      }
   }

   private static Process a(String var0, int var1) {
      Process var2 = Runtime.getRuntime().exec(var0);
      if (var1 > 0 && !var2.waitFor((long)var1, TimeUnit.SECONDS)) {
         var2.destroy();
         System.out.println("System Info command timed out.");
         return null;
      } else {
         return var2;
      }
   }

   private static String a(Process var0) {
      String var10;
      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(var0.getInputStream()));

         label88: {
            try {
               String var3 = null;

               String var2;
               while ((var2 = var1.readLine()) != null) {
                  if (var2.contains("Original Install Date")) {
                     var3 = var2.substring(var2.indexOf(":") + 1).trim();
                     break;
                  }
               }

               if (var3 != null) {
                  Date var4 = a(var3);
                  SimpleDateFormat var5 = new SimpleDateFormat("yyyyMMddHHmmss.SSSSSS", Locale.ENGLISH);
                  String var6 = var5.format(var4);
                  int var7 = TimeZone.getDefault().getOffset(var4.getTime());
                  int var8 = var7 / 60000;
                  String var9 = String.format("%+04d", var8);
                  var10 = "WINDOWS " + var6 + var9;
                  break label88;
               }

               System.out.println("Install date not found.");
            } catch (Throwable var16) {
               try {
                  var1.close();
               } catch (Throwable var15) {
                  var16.addSuppressed(var15);
               }

               throw var16;
            }

            var1.close();
            return null;
         }

         var1.close();
      } finally {
         var0.destroy();
      }

      return var10;
   }

   private static String b(Process var0) {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(var0.getInputStream()));

      String var8;
      label31: {
         String var2;
         try {
            while ((var2 = var1.readLine()) != null) {
               var2 = var2.trim();
               if (!var2.isEmpty()) {
                  SimpleDateFormat var3 = new SimpleDateFormat("yyyyMMddHHmmss.SSSSSS", Locale.ENGLISH);
                  var3.setTimeZone(TimeZone.getTimeZone("UTC"));
                  Date var4 = var3.parse(var2);
                  int var5 = TimeZone.getDefault().getOffset(var4.getTime());
                  int var6 = var5 / 60000;
                  String var7 = String.format("%+d", var6);
                  var8 = "WINDOWS " + var2 + var7;
                  break label31;
               }
            }
         } catch (Throwable var10) {
            try {
               var1.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }

            throw var10;
         }

         var1.close();
         return null;
      }

      var1.close();
      return var8;
   }

   public static Date a(String var0) {
      DateFormat var1 = DateFormat.getDateTimeInstance(3, 2, Locale.getDefault());

      try {
         return var1.parse(var0);
      } catch (ParseException var10) {
         DateFormat[] var3 = new DateFormat[]{
            new SimpleDateFormat("MM/dd/yyyy, hh:mm:ss a", Locale.US),
            new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss", Locale.UK),
            new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss", Locale.CHINA)
         };

         for (DateFormat var7 : var3) {
            try {
               return var7.parse(var0);
            } catch (ParseException var9) {
            }
         }

         throw var10;
      }
   }
}
