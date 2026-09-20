package rs.p_s.p_t;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_l.C_F_uc;
import rs.p_runelite.p_events.C_GameStateChanged_mc;

@rs.p_s.C_e(
   a = "Trading post",
   b = "tradepost",
   c = "Enable the Notes panel",
   d = {"panel"},
   i = true,
   k = true
)
public class C_i extends rs.p_s.C_a {
   private static final ConcurrentHashMap<Integer, Image> d = new ConcurrentHashMap<>();
   public static final rs.p_q.p_a.p_a.C_a b = new C_j();
   public static C_i c;
   @Inject
   private C_h e;
   @Inject
   private C_Client_mc f;
   @Inject
   private rs.p_ui.C_e g;
   private rs.p_ui.C_l h;

   public C_i() {
      c = this;
   }

   @Override
   protected void a() {
      this.e = (C_h)this.a.getInstance(C_h.class);
      BufferedImage var1 = rs.p_A_uc.C_j.b(this.getClass(), "ge_icon.png");
      this.h = rs.p_ui.C_l.a().a("Trading Post").a(var1).a(4).a(this.e).a();
      this.g.a(this.h);
   }

   @Override
   protected void b() {
      this.g.b(this.h);
   }

   @C_Subscribe_mc
   public void onGameStateChanged(C_GameStateChanged_mc var1) {
      switch (var1.getGameState()) {
         case c:
            this.e.e().a();
         case g:
      }
   }

   public Image a(int var1) {
      if (d.get(var1) != null) {
         return d.get(var1);
      } else {
         rs.p_h.C_c.a(() -> this.b(var1));
         return null;
      }
   }

   public Image b(int var1) {
      if (d.size() > 500) {
         d.clear();
      }

      if (d.get(var1) != null) {
         return d.get(var1);
      } else {
         C_F_uc var2 = rs.p_d.C_k.a(var1, Integer.MAX_VALUE, 0, 32);
         if (var2 == null) {
            return null;
         } else {
            Image var3 = var2.a(32, 32);
            var3 = C_F_uc.a(var3, new Color(0, 0, 0));
            BufferedImage var4 = C_Client_mc.a(var3);
            if (var4 != null) {
               d.put(var1, var4);
            }

            return var4;
         }
      }
   }

   public C_h f() {
      return this.e;
   }
}
