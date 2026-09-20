package rs.p_s.p_s;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.C_Q_uc;
import rs.p_a.C_j;
import rs.p_a.C_k;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_h.C_c;
import rs.p_runelite.p_a.C_g;
import rs.p_runelite.p_events.C_ConfigChanged_mc;
import rs.p_s.C_e;

@C_e(
   a = "Hover Descriptions",
   b = "hoverdesc",
   i = true
)
public class C_b extends rs.p_s.C_a {
   @Inject
   private C_a s;
   public static boolean b;
   public static boolean c;
   public static boolean d;
   public static boolean e;
   public static boolean f;
   public static boolean g;
   public static boolean h;
   public static boolean i;
   public static boolean j;
   public static boolean k;
   public static boolean l;
   public static boolean m;
   public static boolean n;
   public static boolean o;
   public static int p;
   public static int q;
   public static int r;
   private static final rs.p_l.p_f.p_a.p_j.C_a t = new rs.p_l.p_f.p_a.p_j.C_a("", false);

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @Override
   public void a() {
      b = true;
      this.g();
   }

   @Override
   public void b() {
      b = false;
   }

   @C_Subscribe_mc
   public void onConfigChanged(C_ConfigChanged_mc var1) {
      C_c.a(this::g);
   }

   private void g() {
      p = this.s.a().getRGB();
      q = this.s.b().getRGB();
      r = this.s.c().getRGB();
      c = this.s.d();
      d = this.s.e();
      e = this.s.l();
      i = this.s.f();
      f = this.s.g();
      g = this.s.h();
      h = this.s.i();
      j = this.s.j();
      k = this.s.k();
      l = this.s.m();
      n = this.s.o();
      m = this.s.n();
      o = this.s.p();
   }

   public static void f() {
      if (!C_Client_mc.dj && C_Client_mc.cH <= 0) {
         C_Client_mc var0 = C_Launcher_mc.n().o();
         int var1 = var0.eV - 1;
         if (var1 >= 0) {
            int var2 = var0.eI[var1];
            if (var0.fx[var1] != null) {
               boolean var3 = C_Client_mc.ed == 197;
               if (!e || !var3) {
                  if (l && C_g.b(var2)) {
                     int var4 = var0.eJ[var1];
                     if (var4 < 0 || var4 >= C_Client_mc.kw_do.length) {
                        return;
                     }

                     C_k var5 = C_Client_mc.kw_do[var4];
                     if (var5 == null || var5.o() == null) {
                        return;
                     }

                     t.a(var0.fx[var1]);
                     t.a(false);
                     rs.p_l.p_f.C_e.d().f().a(t);
                  }

                  if (C_g.a(var2)) {
                     int var9 = var0.eJ[var1];
                     if (var9 < 0 || var9 >= var0.cA.length) {
                        return;
                     }

                     C_j var11 = var0.cA[var9];
                     if (var11 == null || var11.aG == null) {
                        return;
                     }

                     if (m || var11.aG.Y) {
                        String var6;
                        if (var11.aG.X != null) {
                           var6 = var11.aG.X;
                           t.a(var11.aG.Z);
                        } else {
                           var6 = var0.fx[var1];
                           t.a(false);
                        }

                        t.a(var6);
                        rs.p_l.p_f.C_e.d().f().a(t);
                     }
                  }

                  if (n && C_g.c(var2)) {
                     int var10 = var0.eJ[var1];
                     int var12 = var0.eG[var1];
                     int var13 = var0.eF[var1];
                     int var7 = C_Client_mc.dw;
                     C_Q_uc var8 = var0.a(var13, var12, var7, var10);
                     if (var8 != null) {
                        t.a(var0.fx[var1]);
                        t.a(false);
                        rs.p_l.p_f.C_e.d().f().a(t);
                     }
                  }
               }
            }
         }
      }
   }
}
