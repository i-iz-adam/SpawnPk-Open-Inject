package rs.p_s.p_n;

import com.google.inject.Inject;
import com.google.inject.Provides;
import java.awt.TrayIcon.MessageType;
import rs.p_e.C_i;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_ChatMessage_mc;
import rs.p_runelite.p_events.C_FocusChanged_mc;
import rs.p_runelite.p_events.C_PrivateChatMessage_mc;
import rs.p_s.C_e;

@C_e(
   a = "Notifications",
   b = "notifications",
   d = {"notify", "alert", "notification"},
   g = true
)
public class C_b extends rs.p_s.C_a {
   private static final String b = "@red@You've reached the de-aggro timer (anti-afk) for this region!";
   private static final String c = "<img=163> A superior slayer monster has appeared!";
   private static final String d = "A superior boss has appeared!";
   @Inject
   private C_c e;
   @Inject
   private C_a f;
   private boolean g = false;

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @C_Subscribe_mc
   public void onFocusChanged(C_FocusChanged_mc var1) {
      if (var1.isFocused()) {
         this.g = false;
      }
   }

   @C_Subscribe_mc
   public void onChatMessage(C_ChatMessage_mc var1) {
      if (var1.getMessage().equals("@red@You've reached the de-aggro timer (anti-afk) for this region!") && this.f.a() && !this.g) {
         this.e.a("De-aggro timer reached!", MessageType.INFO);
         this.g = true;
      }

      if ((var1.getMessage().equals("<img=163> A superior slayer monster has appeared!") || var1.getMessage().equals("A superior boss has appeared!"))
         && this.f.b()) {
         this.e.a("Superior spawned!", MessageType.INFO);
      }
   }

   @C_Subscribe_mc
   public void onPrivateChatMessage(C_PrivateChatMessage_mc var1) {
      if (this.f.c()) {
         this.e.a("PM from " + var1.getSender() + ": " + var1.getMessage(), MessageType.INFO);
      }
   }
}
