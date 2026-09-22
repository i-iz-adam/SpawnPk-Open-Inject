package rs.plugins.n;

import java.awt.Color;
import rs.class_131;
import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;
import rs.class_144;
import rs.class_146;
import rs.class_147;

/* JADX INFO: loaded from: client-final.jar:rs/s/n/a.class */
@class_135(a = a.a)
public interface a extends class_132 {
    public static final String a = "notifications";

    @class_142(a = "Alerts", b = "Configure things that alert notifications", c = 0)
    public static final String b = "alertSection";

    @class_142(a = "Settings", b = "The general settings for all notification alerts", c = 1)
    public static final String c = "notifSection";

    @class_137(a = 0, b = "alertAggroTimer", c = "De-aggro timer", d = "Notify / alert the client when you reach the de-aggro timer", h = b)
    default boolean a() {
        return true;
    }

    @class_137(a = 1, b = "alertSuperior", c = "Superior slayer / bosses", d = "Alert the client when a superior boss or slayer mosnter appears for you", h = b)
    default boolean b() {
        return true;
    }

    @class_137(a = 2, b = "alertPrivateMessages", c = "Private messages", d = "Alert the client when someone sends a private message", h = b)
    default boolean c() {
        return false;
    }

    @class_137(b = "trayIcon", c = "Enable tray icon", d = "Enables icon in system tray", f = "Disabling this may limit your ability to receive tray notifications.\nPlease restart your client after changing this setting.", a = 20, h = c)
    default boolean d() {
        return true;
    }

    @class_137(b = "notificationTray", c = "Enable tray notifications", d = "Enables tray notifications", a = 21, h = c)
    default boolean e() {
        return true;
    }

    @class_137(b = "notificationRequestFocus", c = "Request focus", d = "Configures the window focus request type on notification", a = 22, h = c)
    default class_146 f() {
        return class_146.a;
    }

    @class_137(b = "notificationSound", c = "Notification sound", d = "Enables the playing of a beep sound when notifications are displayed", a = 23, h = c)
    default c.a g() {
        return c.a.a;
    }

    @class_137(b = "notificationTimeout", c = "Notification timeout", d = "How long notification will be shown in milliseconds. A value of 0 will make it use the system configuration. (Linux only)", a = 24, h = c)
    @class_147(a = class_147.a)
    default int h() {
        return 10000;
    }

    @class_137(b = "flashNotification", c = "Flash", d = "Flashes the game frame as a notification", a = 26, h = c)
    default class_144 i() {
        return class_144.a;
    }

    @class_137(b = "notificationFocused", c = "Send notifications when focused", d = "Toggles all notifications for when the client is focused", a = 27, h = c)
    default boolean j() {
        return false;
    }

    @class_137(b = "notificationFlashColor", c = "Notification Flash", d = "Sets the color of the notification flashes.", a = 28, h = c)
    @class_131
    default Color k() {
        return new Color(255, 0, 0, 70);
    }
}
