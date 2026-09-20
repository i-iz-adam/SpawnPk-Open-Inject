package rs.p_s.p_d;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.p_a.C_j;
import rs.p_a.C_k;
import rs.p_a.C_l;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_ConfigChanged_mc;
import rs.p_s.C_e;

@C_e(
   a = "Entity Hider",
   c = "Hide players, NPCs, and/or projectiles",
   d = {"npcs", "players", "projectiles", "pet"},
   f = false
)
public class C_b extends rs.p_s.C_a {
   @Inject
   private C_a b;
   @Inject
   private C_Client_mc c;
   private rs.p_runelite.p_b.C_a.a d;
   private rs.p_runelite.p_b.C_a.a e;

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @Override
   protected void a() {
      this.a(true);
   }

   @Override
   protected void b() {
      this.a(false);
   }

   @C_Subscribe_mc
   public void onConfigChanged(C_ConfigChanged_mc var1) {
      if (var1.getGroup().equals("entityhider")) {
         this.a(true);
      }
   }

   private rs.p_runelite.p_b.C_a.a f() {
      boolean var1 = this.b.a();
      boolean var2 = this.b.d();
      boolean var3 = this.b.c();
      boolean var4 = this.b.f();
      boolean var5 = this.b.g();
      boolean var6 = this.b.i();
      boolean var7 = this.b.j();
      boolean var8 = this.b.k();
      boolean var9 = this.b.h();
      return (var8x, var9x) -> {
         boolean var10 = C_Client_mc.ed == 197;
         if (var8x instanceof C_k) {
            C_k var11 = (C_k)var8x;
            if (var11.q()) {
               return !var1;
            }

            if (!var10 && var2) {
               return false;
            }
         }

         if (var8x instanceof C_j) {
            C_j var12 = (C_j)var8x;
            if (var12.aG == null) {
               return false;
            }

            if (var12.j() || var12.k()) {
               return !var3;
            }

            if (var12.aG.x == 2012L) {
               return !var7;
            }

            if (var12.aG.x == 4437L) {
               return !var8;
            }

            if (var12.i()) {
               return !var5;
            }

            if (!var10 && var12.h()) {
               return !var4;
            }
         }

         return var8x instanceof C_l ? !var6 : true;
      };
   }

   private rs.p_runelite.p_b.C_a.a g() {
      boolean var1 = this.b.e();
      return (var1x, var2) -> {
         boolean var3 = C_Client_mc.ed == 197;
         if (var1x instanceof C_k && !var3) {
            C_k var4 = (C_k)var1x;
            if (!var4.q() && var1) {
               return false;
            }
         }

         return true;
      };
   }

   private void a(boolean var1) {
      this.h();
      if (var1) {
         rs.p_f.C_a.bq = this.b.a();
         rs.p_f.C_a.bp = !this.b.h();
         rs.p_runelite.p_b.C_a.a var2 = this.f();
         rs.p_runelite.p_b.C_a.a().add(var2);
         this.d = var2;
         rs.p_runelite.p_b.C_a.a var3 = this.g();
         rs.p_runelite.p_b.C_a.b().add(var3);
         this.e = var3;
      } else {
         rs.p_f.C_a.bq = false;
      }
   }

   private void h() {
      if (this.d != null) {
         rs.p_runelite.p_b.C_a.a().remove(this.d);
         this.d = null;
      }

      if (this.e != null) {
         rs.p_runelite.p_b.C_a.b().remove(this.e);
         this.e = null;
      }
   }
}
