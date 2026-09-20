package rs.p_n.p_b;

import java.util.ArrayList;
import java.util.List;
import rs.p_n.p_b.p_a.C_c;
import rs.p_n.p_b.p_a.C_d;

public abstract class C_a {
   public static List<C_b> a = new ArrayList<>();
   public static C_b<C_c> b = a(new C_b());
   public static C_b<rs.p_n.p_b.p_a.C_a> c = a(new C_b());
   public static C_b<C_d> d = a(new C_b());
   protected long e;
   protected long f;

   public static <T> C_b a(C_b var0) {
      a.add(var0);
      return var0;
   }

   public static void a() {
      for (C_b var1 : a) {
         var1.a();
      }
   }

   public void b() {
      long var1 = System.currentTimeMillis() - this.f;
      if (this.e == 0L || var1 >= this.e) {
         this.c();
         this.f = System.currentTimeMillis();
      }
   }

   public abstract void c();
}
