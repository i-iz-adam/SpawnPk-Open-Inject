package rs.p_s.p_i;

import java.awt.Color;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.C_H_uc;
import rs.C_Q_uc;
import rs.p_a.C_j;
import rs.p_runelite.p_a.C_g;
import rs.p_runelite.p_events.C_EntityInteraction_mc;
import rs.p_runelite.p_events.C_ObjectInteraction_mc;

public class C_b extends rs.p_l.p_f.C_b {
   private static final Color e = new Color(-1862270977);
   private final C_a f;
   private Object g = null;
   private int h = -1;
   private boolean i = false;
   private int j = -1;
   private int k = -1;

   @Inject
   public C_b(C_a var1) {
      this.f = var1;
      this.a(rs.p_l.p_f.C_a.n);
   }

   @Override
   public void a() {
      this.k();
      this.m();
      this.n();
   }

   public void k() {
   }

   public void a(C_EntityInteraction_mc var1) {
      if (!(var1.getEntity() instanceof C_j) || this.f.b()) {
         this.g = var1.getEntity();
         this.i = var1.isCombat();
         this.h = C_Client_mc.ff;
         this.j = this.a.gd;
         this.k = this.a.ge;
      }
   }

   public void a(C_ObjectInteraction_mc var1) {
      if (this.f.h()) {
         this.g = this.b(var1.getX(), var1.getY(), var1.getZ(), var1.getHash());
         if (this.g == null) {
            this.l();
         } else {
            this.i = false;
            this.h = C_Client_mc.ff;
            this.j = this.a.gd;
            this.k = this.a.ge;
         }
      }
   }

   private void m() {
      int var1 = this.a.eV - 1;
      if (var1 >= 0) {
         int var2 = this.a.eI[var1];
         if (C_g.a(var2) && this.f.a()) {
            int var3 = this.a.eJ[var1];
            if (var3 < 0 || var3 >= this.a.cA.length) {
               return;
            }

            C_j var4 = this.a.cA[var3];
            if (var4 != null && var4 != this.g) {
               rs.p_ui.p_b.C_b.a().a(var4, this.f.k(), this.f.c(), this.f.l());
            }
         }

         if (C_g.c(var2) && this.f.g()) {
            int var8 = this.a.eJ[var1];
            int var9 = this.a.eG[var1];
            int var5 = this.a.eF[var1];
            int var6 = C_Client_mc.dw;
            C_Q_uc var7 = this.b(var5, var9, var6, var8);
            if (var7 != null && var7 != this.g) {
               rs.p_ui.p_b.C_b.a().a(var7, this.f.k(), this.f.i(), this.f.l());
            }
         }
      }
   }

   private void n() {
      if (this.g != null) {
         if (C_Client_mc.ff - this.h < 30 || this.a.gd == this.j && this.a.ge == this.k) {
            if (C_Client_mc.ff - this.h >= 30 * (this.i ? 4 : 10)) {
               this.l();
            } else {
               if (this.g instanceof C_j) {
                  C_j var1 = (C_j)this.g;
                  Color var2 = this.i ? this.f.d() : this.f.c();
                  Color var3 = this.i ? this.f.f() : this.f.e();
                  Color var4 = this.a(var2, var3);
                  rs.p_ui.p_b.C_b.a().a(var1, this.f.k(), var4, this.f.l());
               } else if (this.g instanceof C_Q_uc) {
                  Color var5 = this.f.i();
                  Color var6 = this.f.j();
                  Color var7 = this.a(var5, var6);
                  rs.p_ui.p_b.C_b.a().a((C_Q_uc)this.g, this.f.k(), var7, this.f.l());
               }
            }
         } else {
            this.l();
         }
      }
   }

   private Color a(Color var1, Color var2) {
      int var3 = C_Client_mc.ff - this.h;
      if (var3 < 5) {
         return rs.p_A_uc.C_g.a(var1, e, (double)((float)var3 / 5.0F));
      } else {
         return var3 < 10 ? rs.p_A_uc.C_g.a(e, var2, (double)((float)(var3 - 5) / 5.0F)) : var2;
      }
   }

   public void l() {
      this.i = false;
      this.g = null;
      this.h = C_Client_mc.ff;
      this.j = -1;
      this.k = -1;
   }

   private C_Q_uc b(int var1, int var2, int var3, int var4) {
      C_H_uc var5 = this.a.dF.i[var3][var1][var2];
      if (var5 == null) {
         return null;
      } else if (var5.j != null && var5.j.m == var4) {
         return var5.j;
      } else if (var5.k != null && var5.k.m == var4) {
         return var5.k;
      } else if (var5.l != null && var5.l.m == var4) {
         return var5.l;
      } else {
         for (int var6 = 0; var6 < var5.n; var6++) {
            if (var5.o[var6].m == var4) {
               return var5.o[var6];
            }
         }

         return null;
      }
   }
}
