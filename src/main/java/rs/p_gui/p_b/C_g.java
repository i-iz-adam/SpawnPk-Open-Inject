package rs.p_gui.p_b;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import rs.p_gui.C_x;

public class C_g {
   public static final int a = 5;
   public static ConcurrentHashMap<Integer, C_x> b = new ConcurrentHashMap<>();
   public static ExecutorService c = Executors.newFixedThreadPool(5);
   public static rs.p_gui.p_b.p_b.C_b[] d = new rs.p_gui.p_b.p_b.C_b[5];
   private static int e;
   private C_x f;
   private C_f g;

   public static void a() {
      for (int var0 = 0; var0 < 5; var0++) {
         d[var0] = new rs.p_gui.p_b.p_b.C_b();
         c.submit(d[var0]);
      }
   }

   public C_g(C_f var1) {
      this.g = var1;
   }

   public C_g(int var1) {
      this.g = new C_f(var1);
   }

   public C_x b() {
      if (this.f == null) {
         C_x var1 = b.get(this.g.a());
         if (var1 == null) {
            e++;
            if (e >= 5) {
               e = 0;
            }

            d[e].a(this.g.a());
            return null;
         }

         this.f = var1;
      }

      return this.f;
   }
}
