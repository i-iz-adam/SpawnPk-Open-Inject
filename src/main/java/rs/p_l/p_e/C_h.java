package rs.p_l.p_e;

import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;

public class C_h {
   private static final int c = 460;
   private static final int d = 30;
   public final List<C_g> a = new ArrayList<>();
   public final List<C_g> b = new ArrayList<>();
   private final List<C_g> e = new ArrayList<>();
   private C_F_uc f;
   private C_Client_mc g;
   private int h;
   private long i;

   public C_h(C_Client_mc var1) {
      this.g = var1;
      this.f = new C_F_uc("popups/drop bar");
   }

   public void a(int var1, long var2) {
      this.a(var1, var2, 0);
   }

   public void a(int var1, long var2, int var4) {
      C_g var5 = new C_g(var1, 1);
      var5.g = 460;
      var5.h = 15;
      var5.m = var2;
      var5.l = var4;
      if (System.currentTimeMillis() - this.i < 100L && !this.a.isEmpty()) {
         this.a.get(this.a.size() - 1).i += var1;
         this.a.get(this.a.size() - 1).f = this.a.get(this.a.size() - 1).i == 0 ? new C_F_uc("popups/block drop") : new C_F_uc("popups/hit drop");
      } else if (!this.b()) {
         if (this.b.size() > 5) {
            this.b.remove(0);
         }

         this.b.add(var5);
      } else {
         this.a.add(var5);
         this.h += var1;
         this.i = System.currentTimeMillis();
      }
   }

   public void a() {
      if (this.b()) {
         C_g var1 = this.b.size() > 0 ? this.b.get(0) : null;
         if (var1 != null) {
            this.b.remove(var1);
            this.a.add(var1);
            this.h = this.h + var1.i;
         }
      }

      for (int var7 = 0; var7 < this.a.size(); var7++) {
         C_g var2 = this.a.get(var7);
         var2.a();
         int var3 = rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? C_Client_mc.ai - 750 : 0;
         C_Launcher_mc.n().o();
         var3 += C_Client_mc.ai() ? 0 : 4;
         C_Launcher_mc.n().o();
         int var4 = C_Client_mc.ai() ? 0 : 0;
         if (this.g.v.f()) {
            var2.f.g(var2.g + 24 + var3, var2.h - 1, var2.k);
            if (var2.l > 0) {
               C_F_uc var5 = var2.l == 1 ? C_g.c : (var2.l == 2 ? C_g.d : C_g.e);
               if (var2.i == 0) {
                  var5.g(var2.g + 24 + var3 - 30, var2.h - 4, var2.k);
               } else {
                  var5.g(var2.g + 24 + var3 - 30, var2.h - 2, var2.k);
               }
            }
         }

         int var10 = var2.i == 0 ? 35 : 35;
         int var6 = var2.i == 0 ? 14 : 15;
         if (this.g.v.f()) {
            C_Client_mc.gl.d(Integer.toString(var2.i), var2.g + var10 + var3, var2.h + var6 + var4, 16777215, var2.i > 0 ? 3407872 : 100, var2.k);
         }

         if (255.0 - (double)var2.h * 1.05 <= -10.0) {
            this.e.add(var2);
         }
      }

      if (this.e.size() > 0) {
         for (int var8 = 0; var8 < this.e.size(); var8++) {
            this.a.remove(this.e.get(var8));
         }

         this.e.clear();
      }
   }

   private boolean b() {
      for (int var1 = 0; var1 < this.a.size(); var1++) {
         if (this.a.get(var1).h <= 65) {
            return false;
         }
      }

      return true;
   }
}
