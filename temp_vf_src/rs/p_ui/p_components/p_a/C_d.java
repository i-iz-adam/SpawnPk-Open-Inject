package rs.p_ui.p_components.p_a;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.WindowEvent;

@Singleton
public class C_d {
   private final rs.p_e.C_i a;
   private C_q b;

   public C_q a(Window var1, Color var2, String var3, boolean var4) {
      if (this.b != null) {
         this.b.dispatchEvent(new WindowEvent(this.b, 201));
      }

      this.b = new C_q(var1, var2, var3, var4, this.a, this);
      if (this.b.isAlwaysOnTopSupported() && var1 != null) {
         this.b.setAlwaysOnTop(var1.isAlwaysOnTop());
      }

      return this.b;
   }

   @Inject
   public C_d(rs.p_e.C_i var1) {
      this.a = var1;
   }

   void a(C_q var1) {
      this.b = var1;
   }

   C_q a() {
      return this.b;
   }
}
