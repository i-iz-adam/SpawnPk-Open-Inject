package rs.p_tools;

import java.awt.Color;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

class C_c implements C_a {
   private int a = 1;
   private boolean b = true;

   @Override
   public void a(Document var1, SimpleAttributeSet var2, String var3) {
      if (var3.contains("Logged in")) {
         var2 = new SimpleAttributeSet();
         StyleConstants.setBold(var2, true);
         if (!this.b) {
            StyleConstants.setBackground(var2, Color.orange);
            var1.insertString(var1.getLength(), "Login #" + this.a++ + " (Potential DC?)", var2);
         } else {
            StyleConstants.setBackground(var2, Color.cyan);
            var1.insertString(var1.getLength(), "Login #" + this.a++ + " ", var2);
         }

         var2 = new SimpleAttributeSet();
         this.b = false;
      }

      if (var3.contains("IP address")) {
         String[] var4 = var3.split("IP address");
         if (var4[0].contains("[")) {
            String[] var5 = var4[0].split("\\[");
            StyleConstants.setBold(var2, true);
            var1.insertString(var1.getLength(), " [" + var5[2].split("\\(\\(")[0], var2);
            StyleConstants.setBold(var2, false);
            var1.insertString(var1.getLength(), "((" + var5[2].split("\\(\\(")[1], var2);
         } else {
            var1.insertString(var1.getLength(), " " + var4[0] + " IP address", var2);
         }

         StyleConstants.setBold(var2, true);
         var1.insertString(var1.getLength(), var4[1] + "\n", var2);
      } else {
         if (var3.contains("Unregistered")) {
            StyleConstants.setBackground(var2, Color.pink);
            var1.insertString(var1.getLength(), "Logout", var2);
            StyleConstants.setBackground(var2, Color.white);
         }

         var1.insertString(var1.getLength(), " " + var3 + "\n", var2);
      }

      if (var3.contains("Unregistered")) {
         var1.insertString(var1.getLength(), "\n", var2);
         this.b = true;
      }
   }
}
