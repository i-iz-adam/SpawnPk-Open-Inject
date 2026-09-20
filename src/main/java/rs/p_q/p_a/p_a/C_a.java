package rs.p_q.p_a.p_a;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;
import rs.C_Client_mc;
import rs.p_x.C_e;

public abstract class C_a implements Module {
   protected Injector a;
   protected C_e b;
   protected C_Client_mc c;

   public abstract void a();

   public void configure(Binder var1) {
   }

   public void a(C_e var1) {
      this.b = var1;
   }

   public void a(C_Client_mc var1) {
      this.c = var1;
   }

   public int c() {
      return this.b.A();
   }

   public long d() {
      return this.b.E();
   }

   public int e() {
      return this.b.y();
   }

   public int f() {
      return this.a(1);
   }

   public int a(int var1) {
      this.b.J();
      int var2 = this.b.k(var1);
      this.b.K();
      return var2;
   }

   public int g() {
      return this.b.D();
   }

   public String h() {
      return this.b.F();
   }

   public final Injector i() {
      return this.a;
   }
}
