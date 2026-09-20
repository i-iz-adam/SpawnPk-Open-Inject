package rs.p_cache.p_a;

import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;
import rs.C_Client_mc;

public class C_a extends C_b {
   private C_Client_mc d;
   private String e;
   private long f;

   public C_a(C_Client_mc var1, String var2, URL var3, File var4) {
      super(var3, var4);
      this.d = var1;
      this.e = var2;
   }

   @Override
   public void a() {
      if (this.d != null) {
         double var1 = (double)this.a / (double)this.c;
         int var3 = (int)(var1 * 100.0);
         if (System.currentTimeMillis() - this.f >= 500L) {
            this.f = System.currentTimeMillis();
         }

         String var4 = "@yel@Current progress - " + var3 + "%";
         if (System.currentTimeMillis() - this.b > 1000L) {
            double var5 = (double)this.a / (double)((System.currentTimeMillis() - this.b) / 1000L);
            String var7 = "kb/s";
            double var8 = (double)((int)(var5 / 1000.0));
            if (var8 > 1000.0) {
               var8 /= 1000.0;
               var7 = "mb/s";
            }

            var4 = var4 + " @or2@(" + new DecimalFormat("#.##").format(var8) + " " + var7 + ")";
         }

         this.d.b(var3, this.e, var4);
      }
   }
}
