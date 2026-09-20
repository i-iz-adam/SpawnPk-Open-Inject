package rs.p_s;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;

public abstract class C_a implements Module {
   protected Injector a;

   @Override
   public final int hashCode() {
      return super.hashCode();
   }

   @Override
   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   public void configure(Binder var1) {
   }

   protected void a() {
   }

   protected void b() {
   }

   public void c() {
   }

   public final Injector d() {
      return this.a;
   }

   public String e() {
      return this.getClass().getAnnotation(C_e.class).a();
   }
}
