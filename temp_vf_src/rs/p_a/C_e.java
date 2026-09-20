package rs.p_a;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.C_Client_mc;

public class C_e {
   CopyOnWriteArrayList<C_f> a = new CopyOnWriteArrayList<>();
   C_f[] b = new C_f[4];

   public boolean a(int var1, int var2, int var3, int var4, boolean var5) {
      var2 *= rs.p_f.C_a.ak && var2 > 0 ? 10 : 1;
      if (rs.p_f.C_a.ak && var2 > 0 && var1 != 3 && var1 != 2) {
         var2 += new Random().nextInt(9);
      }

      for (int var6 = 0; var6 < 4; var6++) {
         if (this.b[var6] == null || this.b[var6].g() <= var3) {
            if (this.b[var6] == null) {
               this.b[var6] = new C_f(var1, var2, var4);
            } else {
               this.b[var6].e(var2);
               this.b[var6].c(var4);
               this.b[var6].d(var1);
            }

            this.b[var6].a(0);
            this.b[var6].b(230);
            this.b[var6].g(var3 + 70);
            return true;
         }
      }

      if (var5) {
         this.a.add(new C_f(var1, var2, var4));
      }

      return false;
   }

   public final void a() {
      for (int var1 = 0; var1 < this.a.size(); var1++) {
         C_f var2 = this.a.get(var1);
         if (this.a(var2.d(), var2.e(), C_Client_mc.ff, var2.c(), false)) {
            this.a.remove(var2);
         }
      }
   }

   public boolean a(int var1) {
      return this.b[var1] == null ? false : this.b[var1].g() > C_Client_mc.ff;
   }

   public void b() {
      this.b = new C_f[4];
      this.a.clear();
   }

   public CopyOnWriteArrayList<C_f> c() {
      return this.a;
   }

   public C_f[] d() {
      return this.b;
   }
}
