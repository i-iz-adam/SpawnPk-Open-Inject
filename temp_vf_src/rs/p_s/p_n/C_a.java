package rs.p_s.p_n;

import java.awt.Color;
import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_l;
import rs.p_e.C_n;
import rs.p_e.C_p;
import rs.p_e.C_q;

@C_e(
   a = "notifications"
)
public interface C_a extends rs.p_e.C_b {
   String a = "notifications";
   @C_l(
      a = "Alerts",
      b = "Configure things that alert notifications",
      c = 0
   )
   String b = "alertSection";
   @C_l(
      a = "Settings",
      b = "The general settings for all notification alerts",
      c = 1
   )
   String c = "notifSection";

   @C_g(
      a = 0,
      b = "alertAggroTimer",
      c = "De-aggro timer",
      d = "Notify / alert the client when you reach the de-aggro timer",
      h = "alertSection"
   )
   default boolean a() {
      return true;
   }

   @C_g(
      a = 1,
      b = "alertSuperior",
      c = "Superior slayer / bosses",
      d = "Alert the client when a superior boss or slayer mosnter appears for you",
      h = "alertSection"
   )
   default boolean b() {
      return true;
   }

   @C_g(
      a = 2,
      b = "alertPrivateMessages",
      c = "Private messages",
      d = "Alert the client when someone sends a private message",
      h = "alertSection"
   )
   default boolean c() {
      return false;
   }

   @C_g(
      b = "trayIcon",
      c = "Enable tray icon",
      d = "Enables icon in system tray",
      f = "Disabling this may limit your ability to receive tray notifications.\nPlease restart your client after changing this setting.",
      a = 20,
      h = "notifSection"
   )
   default boolean d() {
      return true;
   }

   @C_g(
      b = "notificationTray",
      c = "Enable tray notifications",
      d = "Enables tray notifications",
      a = 21,
      h = "notifSection"
   )
   default boolean e() {
      return true;
   }

   @C_g(
      b = "notificationRequestFocus",
      c = "Request focus",
      d = "Configures the window focus request type on notification",
      a = 22,
      h = "notifSection"
   )
   default C_p f() {
      return C_p.a;
   }

   @C_g(
      b = "notificationSound",
      c = "Notification sound",
      d = "Enables the playing of a beep sound when notifications are displayed",
      a = 23,
      h = "notifSection"
   )
   default C_c.a g() {
      return C_c.a.a;
   }

   @C_g(
      b = "notificationTimeout",
      c = "Notification timeout",
      d = "How long notification will be shown in milliseconds. A value of 0 will make it use the system configuration. (Linux only)",
      a = 24,
      h = "notifSection"
   )
   @C_q(
      a = "ms"
   )
   default int h() {
      return 10000;
   }

   @C_g(
      b = "flashNotification",
      c = "Flash",
      d = "Flashes the game frame as a notification",
      a = 26,
      h = "notifSection"
   )
   default C_n i() {
      return C_n.a;
   }

   @C_g(
      b = "notificationFocused",
      c = "Send notifications when focused",
      d = "Toggles all notifications for when the client is focused",
      a = 27,
      h = "notifSection"
   )
   default boolean j() {
      return false;
   }

   @rs.p_e.C_a
   @C_g(
      b = "notificationFlashColor",
      c = "Notification Flash",
      d = "Sets the color of the notification flashes.",
      a = 28,
      h = "notifSection"
   )
   default Color k() {
      return new Color(255, 0, 0, 70);
   }
}
