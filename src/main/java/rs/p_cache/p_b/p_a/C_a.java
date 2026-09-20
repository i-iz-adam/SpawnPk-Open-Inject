package rs.p_cache.p_b.p_a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rs.p_cache.p_b.C_e;

public class C_a extends rs.p_cache.p_b.C_d {
   private static final String e = rs.p_f.C_a.m + "cache.zip";
   private static final String f = rs.p_v.C_a.f();
   private static final String g = "cache.zip";
   private C_e h = new C_e("cache_version");

   public C_a() {
      super("Cache");
   }

   @Override
   public boolean a() {
      try {
         b(new File(f));
         StringBuilder var1 = new StringBuilder();

         for (int var2 = 0; var2 < f.length(); var2++) {
            if (var2 != f.length() - 1) {
               var1.append(f.charAt(var2));
            }
         }

         String var9 = var1.toString();
         URL var3 = new URL(e);
         File var4 = new File(var9);
         var4.mkdirs();
         rs.p_cache.p_a.C_a var5 = new rs.p_cache.p_a.C_a(
            this.c, "Downloading main game assets..", var3, new File(var4.getAbsolutePath() + File.separator + "cache.zip")
         );
         File var6 = var5.b();
         if (var6 == null) {
            this.a(rs.p_cache.p_b.C_b.b);
            return false;
         } else if (!this.b(var4.getAbsolutePath(), var6)) {
            this.a(rs.p_cache.p_b.C_b.b);
            return false;
         } else {
            File var7 = new File(C_e.c);
            if (var7.exists()) {
               var7.delete();
            }

            var6.delete();
            return true;
         }
      } catch (MalformedURLException var8) {
         var8.printStackTrace();
         return false;
      }
   }

   @Override
   public C_e b() {
      return this.h;
   }

   private boolean b(String var1, File var2) {
      try {
         ZipInputStream var3 = new ZipInputStream(new FileInputStream(var2));
         ZipEntry var4 = null;
         String[] var5 = new String[]{"sprites", "configs"};

         while ((var4 = var3.getNextEntry()) != null) {
            File var6 = new File(var1 + "/" + var4.getName());
            if (var6.exists()) {
               var6.delete();
            }

            boolean var7 = false;

            for (String var11 : var5) {
               if (var4.getName().equalsIgnoreCase(var11) || var6.getParentFile() != null && var6.getName().equalsIgnoreCase(var11)) {
                  var7 = true;
                  break;
               }
            }

            if (!var7) {
               if (var4.isDirectory()) {
                  System.out.println("Making directory: " + var6.getName() + " (" + var4.getName() + ")");
                  var6.mkdirs();
               } else {
                  if (var6.getParentFile() != null) {
                     File var15 = var6.getParentFile();
                     if (!var15.exists()) {
                        System.out.println("Making parent directory: " + var15.getAbsolutePath());
                        var15.mkdirs();
                     }
                  }

                  FileOutputStream var16 = new FileOutputStream(var6);
                  byte[] var17 = new byte[4098];
                  int var18 = 0;

                  while ((var18 = var3.read(var17)) > 0) {
                     var16.write(var17, 0, var18);
                  }

                  var16.close();
               }
            }
         }

         var3.close();
         return true;
      } catch (FileNotFoundException var12) {
         var12.printStackTrace();
      } catch (IOException var13) {
         var13.printStackTrace();
      }

      return false;
   }

   public static boolean b(File var0) {
      if (var0.exists()) {
         File[] var1 = var0.listFiles();
         if (null != var1) {
            for (int var2 = 0; var2 < var1.length; var2++) {
               if (var1[var2].isDirectory()) {
                  b(var1[var2]);
               } else {
                  var1[var2].delete();
               }
            }
         }
      }

      return var0.delete();
   }

   @Override
   public boolean f() {
      return true;
   }
}
