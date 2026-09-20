package rs.p_y;

import java.lang.reflect.Method;
import java.time.Instant;

public class C_b {
   private final C_a a;
   private final Method b;
   private final Object c;
   private final Runnable d;
   private Instant e = Instant.now();

   public C_b(C_a var1, Method var2, Object var3, Runnable var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   @Override
   public String toString() {
      return "ScheduledMethod(schedule=" + this.a() + ", method=" + this.b() + ", object=" + this.c() + ", lambda=" + this.d() + ", last=" + this.e() + ")";
   }

   public C_a a() {
      return this.a;
   }

   public Method b() {
      return this.b;
   }

   public Object c() {
      return this.c;
   }

   public Runnable d() {
      return this.d;
   }

   public Instant e() {
      return this.e;
   }

   public void a(Instant var1) {
      this.e = var1;
   }
}
