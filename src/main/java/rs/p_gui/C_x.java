package rs.p_gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import rs.C_Client_mc;

public class C_x {
   public Image a;
   private int b;
   private int c;
   private int d;

   public C_x(int var1) {
      this.d = var1;
   }

   public boolean a(String var1) {
      try {
         if (C_Client_mc.class.getResource("Client.class").toString().startsWith("file")) {
            var1 = "." + var1;
            this.a = Toolkit.getDefaultToolkit().getImage(var1);
         } else {
            this.a = ImageIO.read(this.getClass().getResource(var1));
         }

         return this.a != null;
      } catch (Exception var3) {
         var3.printStackTrace();
         return false;
      }
   }

   public void a(Image var1) {
      this.a = var1;
   }

   public void a(int var1, int var2) {
      this.b = var1;
      this.c = var2;
   }

   public void a(Graphics var1) {
      if (C_Launcher_mc.n() != null) {
         int var2 = this.b;
         int var3 = this.c;
         Graphics2D var4 = (Graphics2D)var1.create();
         var4.drawImage(this.a, var2, var3, null);
      }
   }
}
