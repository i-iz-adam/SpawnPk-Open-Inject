package rs.p_cache.p_b;

import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_h;

public class C_c {
   private final C_d a = new rs.p_cache.p_b.p_a.C_a();
   private final C_d b = new rs.p_cache.p_b.p_a.C_d();
   private final C_d c = new rs.p_cache.p_b.p_a.C_c();
   private final List<C_d> d = new ArrayList<>();
   private C_Client_mc e;

   public C_c(C_Client_mc var1) {
      this.e = var1;
      this.d.add(this.a);
      this.d.add(this.b);
      this.d.add(this.c);

      for (C_d var3 : this.d) {
         var3.a(var1);
      }
   }

   public boolean a() {
      this.e.G = new rs.p_l.p_d.C_c(this.e);
      C_Client_mc.gl = new C_h(false, "assets/", "assets/p11_full");
      this.e.gm = new C_h(false, "assets/", "assets/p12_full");
      this.e.a(0, "Please wait, checking assets..");
      Thread var1 = new Thread(this.e.G);
      var1.start();
      if (!this.a(this.b)) {
         this.b.c().add(0, "Error with the sprite updater!");
         this.b(this.b);
         return false;
      } else {
         this.e.cf = true;
         if (C_Launcher_mc.n() != null) {
         }

         if (!this.a(this.a)) {
            this.a.c().add(0, "Error with the cache updater!");
            this.b(this.a);
            return false;
         } else if (!this.a(this.b)) {
            this.b.c().add(0, "Error with the sprite updater!");
            this.b(this.b);
            return false;
         } else if (!this.a(this.c)) {
            this.c.c().add(0, "Error with configuration updater!");
            this.b(this.c);
            return false;
         } else {
            return true;
         }
      }
   }

   public boolean b() {
      for (C_d var2 : this.d) {
         if (var2.b().c() != var2.b().b()) {
            return true;
         }
      }

      return false;
   }

   public boolean a(C_d var1) {
      double var2 = var1.b().c();
      double var4 = var1.b().b();
      if (var4 == -1.0) {
         var1.a(C_b.a);
         return false;
      } else if (var2 != var4) {
         System.out.println("Updating outdated game asset: " + var1.d());
         return var1.a() ? var1.b().a() : false;
      } else {
         return true;
      }
   }

   public void b(C_d var1) {
      for (String var3 : var1.c()) {
         System.out.println(var3);
      }
   }

   public C_d c() {
      return this.a;
   }

   public C_d d() {
      return this.b;
   }

   public C_d e() {
      return this.c;
   }
}
