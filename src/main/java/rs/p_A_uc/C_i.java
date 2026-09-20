package rs.p_A_uc;

import java.awt.event.KeyEvent;
import java.util.function.Supplier;

public abstract class C_i implements rs.p_g.p_a.C_a {
   private final Supplier<rs.p_s.p_b.C_l> a;
   private boolean b = false;
   private boolean c = false;
   private boolean d;

   @Override
   public boolean L_() {
      return this.d;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      if (this.c) {
         var1.consume();
      }
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (this.a.get().a(var1)) {
         boolean var2 = this.b;
         this.b = true;
         if (!var2) {
            this.b();
         }

         if (rs.p_s.p_b.C_l.a(var1.getKeyCode()) == null) {
            this.c = true;
            var1.consume();
         }
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (this.a.get().a(var1) && this.b) {
         this.b = false;
         this.c = false;
         this.c();
      }
   }

   public void b() {
   }

   public void c() {
   }

   public C_i(Supplier<rs.p_s.p_b.C_l> var1) {
      this.a = var1;
   }

   public void a(boolean var1) {
      this.d = var1;
   }
}
