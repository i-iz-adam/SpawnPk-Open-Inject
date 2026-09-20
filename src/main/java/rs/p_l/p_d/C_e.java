package rs.p_l.p_d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.StringConcatFactory;
import java.net.URL;

class C_e extends Thread {
   private final C_c a;
   C_e(C_c var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      try {
         System.setProperty("jsse.enableSNIExtension", "false");
         URL var1 = new URL("https://spawnpk.net/forums/index.php?/forum/10-updates/");
         BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.openStream()));
         boolean var4 = false;
         int var5 = 0;
         byte var6 = 6;
         String var7 = "";
         String var8 = "";

         String var3;
         while ((var3 = var2.readLine()) != null) {
            if (var4) {
               if (var3.contains("Runex: Economy Server")) {
                  var4 = false;
                  var5--;
                  continue;
               }

               String var9 = var3.trim();
               if (C_c.b(this.a) == null) {
                  C_c.a(this.a, String.valueOf(var9));
                  C_c.a(this.a, C_c.b(this.a).replace("&quot;", "\""));
                  C_c.a(this.a, C_c.b(this.a).replace("&amp;", "&"));
                  C_c.a(this.a, C_c.b(this.a).replace("&rsquo;", "�"));
                  C_c.a(this.a, C_c.b(this.a).replace("&#039;", "'"));
                  byte var10 = 45;
                  if (C_c.b(this.a).length() > var10) {
                     C_c.a(this.a, C_c.b(this.a).substring(0, var10 - 1) + "...");
                  }

                  C_c.a(this.a, C_c.b(this.a).replace("[", "@yel@["));
                  C_c.a(this.a, C_c.b(this.a).replace("]", "] @whi@"));
                  if (var8 != null) {
                     String[] var11 = var8.split(" ");

                     for (String var15 : var11) {
                        if (var15 != null && var15.contains("href")) {
                           C_c.b(this.a, var15.replace("href='", ""));
                           C_c.b(this.a, C_c.c(this.a).substring(0, C_c.c(this.a).length() - 1));
                           break;
                        }
                     }
                  }

                  String[] var23 = C_c.b(this.a).split("]");
                  if (var23 != null && var23.length > 0) {
                     C_c.c(this.a, var23[0]);
                     C_c.c(this.a, C_c.d(this.a).replace("[", ""));
                     C_c.c(this.a, C_c.d(this.a).replace("@yel@", ""));
                  }
               }

               var9 = var9.replace("[", "@or1@[");
               var9 = var9.replace("]", "] <col=FFFFFF>");
               var9 = var9.replace("&quot;", "\"");
               var9 = var9.replace("&amp;", "&");
               var9 = var9.replace("&rsquo;", "�");
               var9 = var9.replace("&#039;", "'");
               var7 = (var5 == 1 ? "" : var7) + var9 + (var5 < var6 ? "       " : "");
               var4 = false;
            }

            if (var3.contains("<a href=")) {
               var8 = var3;
            }

            if (var3.contains("<span itemprop=\"name headline\">")) {
               if (var5 >= var6) {
                  break;
               }

               var4 = true;
               var5++;
            }
         }

         C_c.d(this.a, var7);
         C_c.a(this.a, (int)((double)C_c.e(this.a).length() * 3.75));
         var2.close();
      } catch (IOException var16) {
         var16.printStackTrace();
         C_c.d(this.a, "");
      }
   }
}
