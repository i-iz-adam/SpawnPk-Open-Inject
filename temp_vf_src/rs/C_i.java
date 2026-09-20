package rs;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class C_i {
   public static int a = 0;
   public static int b = 0;
   public static int c = 0;

   public static final byte[] a(String var0) {
      try {
         File var1 = new File(var0);
         int var2 = (int)var1.length();
         byte[] var3 = new byte[var2];
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(var0)));
         var4.readFully(var3, 0, var2);
         var4.close();
         a++;
         return var3;
      } catch (Exception var5) {
         return null;
      }
   }

   public static final byte[] a(InputStream var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var3 = new byte[16384];

      int var2;
      while ((var2 = var0.read(var3, 0, var3.length)) != -1) {
         var1.write(var3, 0, var2);
      }

      var1.flush();
      return var1.toByteArray();
   }

   public static final void a(String var0, byte[] var1) {
      try {
         new File(new File(var0).getParent()).mkdirs();
         FileOutputStream var2 = new FileOutputStream(var0);
         var2.write(var1, 0, var1.length);
         var2.close();
         b++;
         c++;
      } catch (Throwable var3) {
         System.out.println("Write Error: " + var0);
      }
   }

   public static boolean b(String var0) {
      File var1 = new File(var0);
      return var1.exists();
   }
}
