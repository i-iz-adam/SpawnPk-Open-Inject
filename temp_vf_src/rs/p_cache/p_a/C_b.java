package rs.p_cache.p_a;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class C_b {
   private URL d;
   private File e;
   protected int a;
   protected long b;
   protected int c;

   public C_b(URL var1, File var2) {
      this.d = var1;
      this.e = var2;
   }

   public File b() {
      try {
         if (this.e.exists()) {
            System.out.println("Deleting " + this.e.getAbsolutePath());
            this.e.delete();
         }

         BufferedInputStream var1 = new BufferedInputStream(this.d.openStream(), 16384);
         FileOutputStream var2 = new FileOutputStream(this.e);
         byte[] var3 = new byte[16384];
         HttpURLConnection var4 = (HttpURLConnection)this.d.openConnection();
         this.c = var4.getContentLength();
         System.out.println(this.c);
         var4.disconnect();
         this.b = System.currentTimeMillis();
         int var5 = 0;
         int var6 = 0;

         while ((var5 = var1.read(var3)) > -1) {
            var2.write(var3, 0, var5);
            var6 += var5;
            this.a += var5;
            this.a();
            if (var6 > 1048576) {
               var6 = 0;
               var2.flush();
            }
         }

         var2.close();
         return this.e;
      } catch (IOException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public abstract void a();
}
