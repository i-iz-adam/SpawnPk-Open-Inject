package rs.p_s.p_j;

import com.google.inject.Provides;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import rs.C_Client_mc;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_GameStateChanged_mc;
import rs.p_s.C_e;

@C_e(
   a = "Key Remapping",
   b = "keyRemapping",
   c = "Allows use of WASD keys for camera movement with 'Press Enter to Chat'",
   d = {"enter", "chat", "wasd", "camera"},
   f = false
)
public class C_c extends rs.p_s.C_a {
   private boolean b;
   @Inject
   private rs.p_g.p_a.C_b c;
   @Inject
   private C_b d;
   @Inject
   private C_Client_mc e;

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @Override
   protected void a() {
      this.b = false;
      this.c.a(this.d);
      rs.p_h.C_c.a(() -> {
         if (this.e.fc) {
            this.f();
         }
      });
   }

   @Override
   protected void b() {
      this.c.b(this.d);
      rs.p_h.C_c.a(() -> {
         if (this.e.fc) {
            this.g();
         }
      });
   }

   @C_Subscribe_mc
   private void onGameStateChanged(C_GameStateChanged_mc var1) {
      if (var1.getGameState() == rs.p_runelite.p_a.C_c.g) {
         this.f();
      }
   }

   public void f() {
      C_Client_mc.dk = "";
      this.e.dl = "Press Enter to Chat...";
      SwingUtilities.invokeLater(() -> this.a(false));
   }

   public void g() {
      this.e.dl = null;
      SwingUtilities.invokeLater(() -> this.a(true));
   }

   public boolean h() {
      if (C_Client_mc.w != null && C_Client_mc.w.b) {
         return false;
      } else if (this.e.gp != -1
         && this.e.gp != 4882
         && this.e.gp != 4887
         && this.e.gp != 4893
         && this.e.gp != 4900
         && this.e.gp != 2459
         && this.e.gp != 2469
         && this.e.gp != 2480
         && this.e.gp != 2492
         && this.e.gp != 6179) {
         return false;
      } else if (this.e.gb) {
         return false;
      } else {
         return this.e.fN != 0 ? false : this.e.cc && this.e.cd && this.e.fc;
      }
   }

   public boolean i() {
      return this.e.gb || this.e.fN > 0 || this.e.gp > -1;
   }

   boolean j() {
      return this.b;
   }

   void a(boolean var1) {
      this.b = var1;
   }
}
