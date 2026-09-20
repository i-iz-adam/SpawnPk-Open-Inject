package rs.p_cache.p_b;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class C_e {
   public static final double a = -1.0;
   public static final String b = rs.p_f.C_a.m + "versions.txt";
   public static final String c = rs.p_v.C_a.f() + "versions.dat";
   private String d;
   private String e;

   public C_e(String var1) {
      this.e = c;
      this.d = var1;
   }

   public C_e(String var1, String var2) {
      this.e = var1;
      this.d = var2;
   }

   public boolean a() {
      try {
         File var1 = new File(this.e);
         ArrayList<String> var2 = new ArrayList<>();
         if (var1.exists()) {
            BufferedReader var3 = new BufferedReader(new FileReader(var1));
            Object var4 = null;

            while ((var4 = var3.readLine()) != null) {
               if (!this.a((String)var4)) {
                  var2.add(var4);
               }
            }

            var3.close();
         } else {
            var1.createNewFile();
         }

         BufferedWriter var7 = new BufferedWriter(new FileWriter(var1));

         for (String var5 : var2) {
            var7.write(var5);
            var7.newLine();
         }

         var7.write(this.d + " = " + this.b());
         var7.close();
         return true;
      } catch (IOException var6) {
         var6.printStackTrace();
         return false;
      }
   }

   public double b() {
      try {
         URL var1 = new URL(b);
         InputStream var8 = var1.openStream();
         BufferedReader var9 = new BufferedReader(new InputStreamReader(var8));
         Double var10 = this.a(var9);
         var9.close();
         return var10;
      } catch (IOException var7) {
         JLabel var2 = new JLabel();
         Font var3 = var2.getFont();
         StringBuffer var4 = new StringBuffer("font-family:" + var3.getFamily() + ";");
         var4.append("font-weight:" + (var3.isBold() ? "bold" : "normal") + ";");
         var4.append("font-size:" + var3.getSize() + "pt;");
         String var5 = "There was an issue connecting to the server!<br>Here are some possible issues and solutions: <br><br>1. (MOST LIKELY) You may not be connected to the internet! Be sure to verify that you are in fact<br>connected to the internet, and that you're not having any network issues.<br><br>2. SpawnPK may be offline or having issues, for more information you can go <a href=\"http://spawnpk.net/forums/\">here</a>.";
         JEditorPane var6 = new JEditorPane(
            "text/html", new StringBuilder("<html><body style=\"").append(var4).append("\">").append(var5).append("</body></html>").toString()
         );
         var6.addHyperlinkListener(new C_f(this));
         var6.setEditable(false);
         var6.setBackground(var2.getBackground());
         JOptionPane.showMessageDialog(null, var6);
         var7.printStackTrace();
         return -1.0;
      }
   }

   public double c() {
      try {
         File var1 = new File(this.e);
         if (!var1.exists()) {
            return -1.0;
         } else {
            BufferedReader var2 = new BufferedReader(new FileReader(var1));
            double var3 = this.a(var2);
            var2.close();
            return var3;
         }
      } catch (IOException var5) {
         var5.printStackTrace();
         return -1.0;
      }
   }

   public String d() {
      return this.d;
   }

   private double a(BufferedReader var1) {
      try {
         String var2 = null;

         while ((var2 = var1.readLine()) != null) {
            var2 = var2.replace("= ", "=").replace(" =", "=");
            String[] var3 = var2.split("=");

            try {
               if (var3[0].equalsIgnoreCase(this.d)) {
                  try {
                     return Double.parseDouble(var3[1]);
                  } catch (NumberFormatException var5) {
                     var5.printStackTrace();
                  }
               }
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return -1.0;
   }

   private boolean a(String var1) {
      var1 = var1.replace("= ", "=").replace(" =", "=");
      String[] var2 = var1.split("=");

      try {
         return var2[0].equalsIgnoreCase(this.d);
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }
   }
}
