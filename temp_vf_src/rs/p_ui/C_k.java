package rs.p_ui;

import java.awt.CardLayout;

public class C_k extends C_m {
   private final CardLayout a;
   private boolean b = false;
   private C_m d;

   public C_k(C_m var1) {
      super(false);
      this.a = new CardLayout();
      this.setLayout(this.a);
      this.c(var1);
   }

   public void b() {
      for (int var1 = this.getComponentCount() - 1; var1 > 0; var1--) {
         this.b((C_m)this.getComponent(var1));
         this.remove(var1);
      }
   }

   public void c(C_m var1) {
      int var2 = -1;

      for (int var3 = this.getComponentCount() - 1; var3 >= 0; var3--) {
         if (this.getComponent(var3) == var1) {
            var2 = var3;
            break;
         }
      }

      if (this.b) {
         this.d.K_();
         var1.J_();
      }

      this.d = var1;
      String var5 = System.identityHashCode(var1) + "";
      if (var2 != -1) {
         for (int var4 = this.getComponentCount() - 1; var4 > var2; var4--) {
            this.c();
         }
      } else {
         this.add(var1, var5);
         this.a(var1);
      }

      this.a.show(this, var5);
      this.revalidate();
   }

   public void c() {
      int var1 = this.getComponentCount();
      if (var1 <= 1) {
         assert false : "Cannot pop last component";
      } else {
         C_m var2 = (C_m)this.getComponent(var1 - 2);
         if (this.b) {
            this.d.K_();
            var2.J_();
            this.d = var2;
         }

         this.a.show(this, System.identityHashCode(var2) + "");
         this.b((C_m)this.getComponent(var1 - 1));
         this.remove(var1 - 1);
         this.revalidate();
      }
   }

   protected void a(C_m var1) {
   }

   protected void b(C_m var1) {
   }

   @Override
   public void J_() {
      this.b = true;
      this.d.J_();
   }

   @Override
   public void K_() {
      this.b = false;
      this.d.K_();
   }
}
