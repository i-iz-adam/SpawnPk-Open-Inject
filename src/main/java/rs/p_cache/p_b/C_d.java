package rs.p_cache.p_b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rs.C_Client_mc;

public abstract class C_d {
   private static final int e = 4098;
   protected static final int a = -1;
   protected final List<String> b = new ArrayList<>();
   protected C_Client_mc c;
   protected final String d;

   public C_d(String var1) {
      this.d = var1;
   }

   public abstract boolean a();

   public abstract C_e b();

   public List<String> c() {
      return this.b;
   }

   protected void a(String var1) {
      this.b.add(var1);
   }

   protected void a(C_b var1) {
      this.a(var1.a());
   }

   protected int a(File var1) {
      try {
         BufferedReader var2 = new BufferedReader(new FileReader(var1));
         return this.a(var2);
      } catch (FileNotFoundException var3) {
         var3.printStackTrace();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      return -1;
   }

   protected int b(String var1) {
      try {
         URL var2 = new URL(var1);
         InputStreamReader var3 = new InputStreamReader(var2.openStream());
         BufferedReader var4 = new BufferedReader(var3);

         try {
            return this.a(var4);
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return -1;
   }

   protected boolean a(String var1, File var2) {
      try {
         ZipInputStream var3 = new ZipInputStream(new FileInputStream(var2));
         ZipEntry var4 = null;

         while ((var4 = var3.getNextEntry()) != null) {
            File var5 = new File(var1 + "/" + var4.getName());
            if (var5.exists()) {
               var5.delete();
            }

            if (var4.isDirectory()) {
               System.out.println("Making directory: " + var5.getName() + " (" + var4.getName() + ")");
               var5.mkdirs();
            } else {
               if (var5.getParentFile() != null) {
                  File var6 = var5.getParentFile();
                  if (!var6.exists()) {
                     System.out.println("Making parent directory: " + var6.getAbsolutePath());
                     var6.mkdirs();
                  }
               }

               FileOutputStream var12 = new FileOutputStream(var5);
               byte[] var7 = new byte[4098];
               int var8 = 0;

               while ((var8 = var3.read(var7)) > 0) {
                  var12.write(var7, 0, var8);
               }

               var12.close();
            }
         }

         var3.close();
         return true;
      } catch (FileNotFoundException var9) {
         var9.printStackTrace();
      } catch (IOException var10) {
         var10.printStackTrace();
      }

      return false;
   }

   public String d() {
      return this.d;
   }

   public void a(C_Client_mc var1) {
      this.c = var1;
   }

   public boolean e() {
      return this.b().c() != this.b().b();
   }

   public abstract boolean f();

   private int a(BufferedReader var1) {
      String var2 = var1.readLine();
      var1.close();

      try {
         return Integer.parseInt(var2);
      } catch (NumberFormatException var4) {
         var4.printStackTrace();
         return -1;
      }
   }
}
