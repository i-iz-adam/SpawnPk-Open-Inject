package rs.p_tools;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.text.Document;

class C_g implements ActionListener {
   C_g(C_TextPopupWindow_mc.a var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = C_TextPopupWindow_mc.a.a(this.a).getText().toLowerCase();
      JTextPane var3 = C_TextPopupWindow_mc.a.b(this.a).a();
      if (var2 != null && var2.length() > 0) {
         Document var4 = var3.getDocument();
         int var5 = var2.length();

         try {
            boolean var6 = false;
            if (C_TextPopupWindow_mc.a.c(this.a) + var5 > var4.getLength()) {
               C_TextPopupWindow_mc.a.a(this.a, 0);
            }

            while (C_TextPopupWindow_mc.a.c(this.a) + var5 <= var4.getLength()) {
               String var7 = var4.getText(C_TextPopupWindow_mc.a.c(this.a), var5).toLowerCase();
               if (var7.equals(var2)) {
                  var6 = true;
                  break;
               }

               C_TextPopupWindow_mc.a.d(this.a);
            }

            if (var6) {
               Rectangle var9 = var3.modelToView(C_TextPopupWindow_mc.a.c(this.a));
               var3.scrollRectToVisible(var9);
               var3.setCaretPosition(C_TextPopupWindow_mc.a.c(this.a) + var5);
               var3.moveCaretPosition(C_TextPopupWindow_mc.a.c(this.a));
               C_TextPopupWindow_mc.a.b(this.a, var5);
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }
   }
}
