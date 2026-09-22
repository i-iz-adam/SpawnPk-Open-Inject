package rs.runelite.events;

import java.awt.TrayIcon;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/NotificationFired.class */
public final class NotificationFired {
    private final String message;
    private final TrayIcon.MessageType type;

    public NotificationFired(String str, TrayIcon.MessageType messageType) {
        this.message = str;
        this.type = messageType;
    }

    public String getMessage() {
        return this.message;
    }

    public TrayIcon.MessageType getType() {
        return this.type;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationFired)) {
            return false;
        }
        NotificationFired notificationFired = (NotificationFired) obj;
        String message = getMessage();
        String message2 = notificationFired.getMessage();
        if (message == null) {
            if (message2 != null) {
                return false;
            }
        } else if (!message.equals(message2)) {
            return false;
        }
        TrayIcon.MessageType type = getType();
        TrayIcon.MessageType type2 = notificationFired.getType();
        if (type == null) {
            return type2 == null;
        }
        return type.equals(type2);
    }

    public int hashCode() {
        String message = getMessage();
        int iHashCode = (1 * 59) + (message == null ? 43 : message.hashCode());
        TrayIcon.MessageType type = getType();
        return (iHashCode * 59) + (type == null ? 43 : type.hashCode());
    }

    public String toString() {
        return "NotificationFired(message=" + getMessage() + ", type=" + String.valueOf(getType()) + ")";
    }
}
