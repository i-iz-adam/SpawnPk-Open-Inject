package rs.plugins;

import java.awt.Color;
import rs.class_131;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;
import rs.class_144;
import rs.class_145;
import rs.class_146;
import rs.class_147;
import rs.gui.u;
import rs.gui.v;
import rs.lpkg.j;
import rs.plugins.bpkg.l;

/* JADX INFO: loaded from: client-final.jar:rs/s/h.class */
@class_135(a = h.a)
public interface h extends class_132 {
    public static final String a = "runelite";

    @class_142(a = "Window Settings", b = "Settings relating to the client's window and frame", c = 0)
    public static final String b = "windowSettings";

    @class_142(a = "Notification Settings", b = "Settings relating to notifications", c = 1)
    public static final String c = "notificationSettings";

    @class_142(a = "Overlay Settings", b = "Settings relating to fonts", c = 2)
    public static final String d = "overlaySettings";

    @class_137(b = "automaticResizeType", c = "Resize type", d = "Choose how the window should resize when opening and closing panels", a = 11, h = b)
    default v a() {
        return v.b;
    }

    @class_137(b = "lockWindowSize", c = "Lock window size", d = "Determines if the window resizing is allowed or not", a = 12, h = b)
    default boolean b() {
        return false;
    }

    @class_137(b = "containInScreen2", c = "Contain in screen", d = "Makes the client move itself to stay within the screen when resizing..<br>Note: 'Always' only works on Windows and if custom chrome is enabled.", a = 13, h = b)
    default u.a c() {
        return u.a.b;
    }

    @class_137(b = "rememberScreenBounds", c = "Remember client position", d = "Save the position and size of the client after exiting", a = 14, h = b)
    default boolean d() {
        return true;
    }

    @class_137(b = "uiEnableCustomChrome", c = "Enable custom window chrome", d = "Use RuneLite's custom window title and borders.", f = "Please restart your client after changing this setting", a = 15, h = b)
    default boolean e() {
        return j.a() == j.a;
    }

    @class_145(a = 10, b = 100)
    @class_137(b = "uiWindowOpacity", c = "Window opacity", d = "Set the windows opacity.", a = 16, h = b)
    default int f() {
        return 100;
    }

    @class_137(b = "gameAlwaysOnTop", c = "Always on top", d = "The game will always be on the top of the screen", a = 17, h = b)
    default boolean g() {
        return false;
    }

    @class_137(b = "usernameInTitle", c = "Show display name in title", d = "Toggles displaying of local player's display name in client title", a = 19, h = b)
    default boolean h() {
        return true;
    }

    @class_137(b = "trayIcon", c = "Enable tray icon", d = "Enables icon in system tray", f = "Disabling this may limit your ability to receive tray notifications.\nPlease restart your client after changing this setting.", a = 20, h = c)
    default boolean i() {
        return true;
    }

    @class_137(b = "notificationTray", c = "Enable tray notifications", d = "Enables tray notifications", a = 21, h = c)
    default boolean j() {
        return true;
    }

    @class_137(b = "notificationRequestFocus", c = "Request focus", d = "Configures the window focus request type on notification", a = 22, h = c)
    default class_146 k() {
        return class_146.a;
    }

    @class_137(b = "notificationSound", c = "Notification sound", d = "Enables the playing of a beep sound when notifications are displayed", a = 23, h = c)
    default rs.plugins.n.c.a l() {
        return rs.plugins.n.c.a.a;
    }

    @class_145(a = 0, b = 100)
    @class_137(b = "notificationVolume", c = "Notification volume", d = "Configures the volume of custom notifications (does not control native volume).", a = 24, h = c)
    @class_147(a = class_147.c)
    default int m() {
        return 100;
    }

    @class_137(b = "notificationTimeout", c = "Notification timeout", d = "How long notification will be shown in milliseconds. A value of 0 will make it use the system configuration. (Linux only)", a = 25, h = c)
    @class_147(a = class_147.a)
    default int n() {
        return 10000;
    }

    @class_137(b = "notificationGameMessage", c = "Game message notifications", d = "Adds a notification message to the chatbox", a = 26, h = c)
    default boolean o() {
        return false;
    }

    @class_137(b = "flashNotification", c = "Flash", d = "Flashes the game frame as a notification", a = 27, h = c)
    default class_144 p() {
        return class_144.a;
    }

    @class_137(b = "notificationFocused", c = "Send notifications when focused", d = "Toggles all notifications for when the client is focused", a = 28, h = c)
    default boolean q() {
        return false;
    }

    @class_137(b = "notificationFlashColor", c = "Notification Flash", d = "Sets the color of the notification flashes.", a = 29, h = c)
    @class_131
    default Color r() {
        return new Color(255, 0, 0, 70);
    }

    @class_137(b = "overlayBackgroundColor", c = "Overlay Color", d = "Configures the background color of infoboxes and overlays", a = 44, h = d)
    @class_131
    default Color s() {
        return rs.ui.components.d.c;
    }

    @class_137(b = "sidebarToggleKey", c = "Sidebar Toggle Key", d = "The key that will toggle the sidebar (accepts modifiers)", a = 45, h = b)
    default l t() {
        return new l(122, 128);
    }

    @class_137(b = "panelToggleKey", c = "Plugin Panel Toggle Key", d = "The key that will toggle the current or last opened plugin panel (accepts modifiers)", a = 46, h = b)
    default l u() {
        return new l(123, 128);
    }

    @class_137(b = "blockExtraMouseButtons", c = "Block extra mouse buttons", d = "Blocks extra mouse buttons (4 and above)", a = 50)
    default boolean v() {
        return true;
    }

    @class_137(b = "useWikiItemPrices", c = "Use actively traded price", d = "Use actively traded prices, sourced from the RuneScape wiki, for item prices", a = 51)
    default boolean w() {
        return true;
    }

    @class_137(b = "dragHotkey", c = "Drag Hotkey", d = "Configures the hotkey used to drag UI elements around", a = 52)
    default l x() {
        return l.c;
    }
}
