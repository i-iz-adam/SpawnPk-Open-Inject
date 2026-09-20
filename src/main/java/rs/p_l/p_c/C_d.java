package rs.p_l.p_c;

import rs.C_Client_mc;

public abstract class C_d {
   protected C_Client_mc a;
   protected boolean b;

   public C_d(C_Client_mc var1) {
      this.a = var1;
   }

   public abstract void a();

   public abstract boolean b();

   public void c() {
      this.b = false;
   }

   public boolean d() {
      return this.b;
   }
}
