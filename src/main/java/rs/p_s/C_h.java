package rs.p_s;

import java.awt.Color;
import rs.p_e.C_l;
import rs.p_e.C_n;
import rs.p_e.C_o;
import rs.p_e.C_p;
import rs.p_e.C_q;
import rs.p_gui.C_u;
import rs.p_gui.C_v;
import rs.p_k.C_j;

@rs.p_e.C_e(
   a = "runelite"
)
public interface C_h extends rs.p_e.C_b {
   String a = "runelite";
   @C_l(
      a = "Window Settings",
      b = "Settings relating to the client's window and frame",
      c = 0
   )
   String b = "windowSettings";
   @C_l(
      a = "Notification Settings",
      b = "Settings relating to notifications",
      c = 1
   )
   String c = "notificationSettings";
   @C_l(
      a = "Overlay Settings",
      b = "Settings relating to fonts",
      c = 2
   )
   String d = "overlaySettings";

   @rs.p_e.C_g(
      b = "automaticResizeType",
      c = "Resize type",
      d = "Choose how the window should resize when opening and closing panels",
      a = 11,
      h = "windowSettings"
   )
   default C_v a() {
      return C_v.b;
   }

   @rs.p_e.C_g(
      b = "lockWindowSize",
      c = "Lock window size",
      d = "Determines if the window resizing is allowed or not",
      a = 12,
      h = "windowSettings"
   )
   default boolean b() {
      return false;
   }

   @rs.p_e.C_g(
      b = "containInScreen2",
      c = "Contain in screen",
      d = "Makes the client move itself to stay within the screen when resizing..<br>Note: 'Always' only works on Windows and if custom chrome is enabled.",
      a = 13,
      h = "windowSettings"
   )
   default C_u.a c() {
      return C_u.a.b;
   }

   @rs.p_e.C_g(
      b = "rememberScreenBounds",
      c = "Remember client position",
      d = "Save the position and size of the client after exiting",
      a = 14,
      h = "windowSettings"
   )
   default boolean d() {
      return true;
   }

   @rs.p_e.C_g(
      b = "uiEnableCustomChrome",
      c = "Enable custom window chrome",
      d = "Use RuneLite's custom window title and borders.",
      f = "Please restart your client after changing this setting",
      a = 15,
      h = "windowSettings"
   )
   default boolean e() {
      return C_j.a() == C_j.a;
   }

   @C_o(
      a = 10,
      b = 100
   )
   @rs.p_e.C_g(
      b = "uiWindowOpacity",
      c = "Window opacity",
      d = "Set the windows opacity.",
      a = 16,
      h = "windowSettings"
   )
   default int f() {
      return 100;
   }

   @rs.p_e.C_g(
      b = "gameAlwaysOnTop",
      c = "Always on top",
      d = "The game will always be on the top of the screen",
      a = 17,
      h = "windowSettings"
   )
   default boolean g() {
      return false;
   }

   @rs.p_e.C_g(
      b = "usernameInTitle",
      c = "Show display name in title",
      d = "Toggles displaying of local player's display name in client title",
      a = 19,
      h = "windowSettings"
   )
   default boolean h() {
      return true;
   }

   @rs.p_e.C_g(
      b = "trayIcon",
      c = "Enable tray icon",
      d = "Enables icon in system tray",
      f = "Disabling this may limit your ability to receive tray notifications.\nPlease restart your client after changing this setting.",
      a = 20,
      h = "notificationSettings"
   )
   default boolean i() {
      return true;
   }

   @rs.p_e.C_g(
      b = "notificationTray",
      c = "Enable tray notifications",
      d = "Enables tray notifications",
      a = 21,
      h = "notificationSettings"
   )
   default boolean j() {
      return true;
   }

   @rs.p_e.C_g(
      b = "notificationRequestFocus",
      c = "Request focus",
      d = "Configures the window focus request type on notification",
      a = 22,
      h = "notificationSettings"
   )
   default C_p k() {
      return C_p.a;
   }

   @rs.p_e.C_g(
      b = "notificationSound",
      c = "Notification sound",
      d = "Enables the playing of a beep sound when notifications are displayed",
      a = 23,
      h = "notificationSettings"
   )
   default rs.p_s.p_n.C_c.a l() {
      return rs.p_s.p_n.C_c.a.a;
   }

   @C_o(
      a = 0,
      b = 100
   )
   @rs.p_e.C_g(
      b = "notificationVolume",
      c = "Notification volume",
      d = "Configures the volume of custom notifications (does not control native volume).",
      a = 24,
      h = "notificationSettings"
   )
   @C_q(
      a = "%"
   )
   default int m() {
      return 100;
   }

   @rs.p_e.C_g(
      b = "notificationTimeout",
      c = "Notification timeout",
      d = "How long notification will be shown in milliseconds. A value of 0 will make it use the system configuration. (Linux only)",
      a = 25,
      h = "notificationSettings"
   )
   @C_q(
      a = "ms"
   )
   default int n() {
      return 10000;
   }

   @rs.p_e.C_g(
      b = "notificationGameMessage",
      c = "Game message notifications",
      d = "Adds a notification message to the chatbox",
      a = 26,
      h = "notificationSettings"
   )
   default boolean o() {
      return false;
   }

   @rs.p_e.C_g(
      b = "flashNotification",
      c = "Flash",
      d = "Flashes the game frame as a notification",
      a = 27,
      h = "notificationSettings"
   )
   default C_n p() {
      return C_n.a;
   }

   @rs.p_e.C_g(
      b = "notificationFocused",
      c = "Send notifications when focused",
      d = "Toggles all notifications for when the client is focused",
      a = 28,
      h = "notificationSettings"
   )
   default boolean q() {
      return false;
   }

   @rs.p_e.C_a
   @rs.p_e.C_g(
      b = "notificationFlashColor",
      c = "Notification Flash",
      d = "Sets the color of the notification flashes.",
      a = 29,
      h = "notificationSettings"
   )
   default Color r() {
      return new Color(255, 0, 0, 70);
   }

   @rs.p_e.C_a
   @rs.p_e.C_g(
      b = "overlayBackgroundColor",
      c = "Overlay Color",
      d = "Configures the background color of infoboxes and overlays",
      a = 44,
      h = "overlaySettings"
   )
   default Color s() {
      return rs.p_ui.p_components.C_d.c;
   }

   @rs.p_e.C_g(
      b = "sidebarToggleKey",
      c = "Sidebar Toggle Key",
      d = "The key that will toggle the sidebar (accepts modifiers)",
      a = 45,
      h = "windowSettings"
   )
   default rs.p_s.p_b.C_l t() {
      return new rs.p_s.p_b.C_l(122, 128);
   }

   @rs.p_e.C_g(
      b = "panelToggleKey",
      c = "Plugin Panel Toggle Key",
      d = "The key that will toggle the current or last opened plugin panel (accepts modifiers)",
      a = 46,
      h = "windowSettings"
   )
   default rs.p_s.p_b.C_l u() {
      return new rs.p_s.p_b.C_l(123, 128);
   }

   @rs.p_e.C_g(
      b = "blockExtraMouseButtons",
      c = "Block extra mouse buttons",
      d = "Blocks extra mouse buttons (4 and above)",
      a = 50
   )
   default boolean v() {
      return true;
   }

   @rs.p_e.C_g(
      b = "useWikiItemPrices",
      c = "Use actively traded price",
      d = "Use actively traded prices, sourced from the RuneScape wiki, for item prices",
      a = 51
   )
   default boolean w() {
      return true;
   }

   @rs.p_e.C_g(
      b = "dragHotkey",
      c = "Drag Hotkey",
      d = "Configures the hotkey used to drag UI elements around",
      a = 52
   )
   default rs.p_s.p_b.C_l x() {
      return rs.p_s.p_b.C_l.c;
   }
}
