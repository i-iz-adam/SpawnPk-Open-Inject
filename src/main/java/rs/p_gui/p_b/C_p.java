package rs.p_gui.p_b;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import rs.p_gui.p_b.p_a.C_A_uc;

class C_p implements MouseListener {
   private final C_h a;
   C_p(C_h var1) {
      this.a = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2 = (int)var1.getPoint().getX();
      int var3 = (int)var1.getPoint().getY();
      byte var4 = -1;
      if (var2 >= 20 && var2 <= 75) {
         if (var3 >= 304 && var3 <= 335) {
            var4 = 0;
         }

         if (var3 >= 336 && var3 <= 367) {
            var4 = 2;
         }

         if (var3 >= 369 && var3 <= 401) {
            var4 = 4;
         }

         if (var3 >= 402 && var3 <= 431) {
            var4 = 6;
         }
      }

      if (var2 >= 90 && var2 <= 145) {
         if (var3 >= 304 && var3 <= 335) {
            var4 = 1;
         }

         if (var3 >= 336 && var3 <= 367) {
            var4 = 3;
         }

         if (var3 >= 369 && var3 <= 401) {
            var4 = 5;
         }
      }

      if (var4 >= 0) {
         this.a.c();
         C_h.a(this.a, new C_A_uc(C_h.b(this.a), var4));
         C_h.c(this.a).a();
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
