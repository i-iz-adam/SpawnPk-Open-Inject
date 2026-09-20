package rs.p_j.p_a;

import com.google.inject.Singleton;
import javax.inject.Inject;
import rs.C_Client_mc;

@Singleton
public class C_b {
   private final C_Client_mc a;
   private C_d b;

   @Inject
   public C_b(C_Client_mc var1) {
      this.a = var1;
   }

   public C_d a(String var1) {
      this.b = new C_d(this).a(var1);
      return this.b;
   }

   public void a() {
      if (this.b != null) {
         this.b.b();
         this.b = null;
      }
   }

   public C_Client_mc b() {
      return this.a;
   }

   public C_d c() {
      return this.b;
   }
}
