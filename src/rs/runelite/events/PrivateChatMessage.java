package rs.runelite.events;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/PrivateChatMessage.class */
public class PrivateChatMessage {
    private String sender;
    private String message;

    public String getSender() {
        return this.sender;
    }

    public String getMessage() {
        return this.message;
    }

    public void setSender(String str) {
        this.sender = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateChatMessage)) {
            return false;
        }
        PrivateChatMessage privateChatMessage = (PrivateChatMessage) obj;
        if (!privateChatMessage.canEqual(this)) {
            return false;
        }
        String sender = getSender();
        String sender2 = privateChatMessage.getSender();
        if (sender == null) {
            if (sender2 != null) {
                return false;
            }
        } else if (!sender.equals(sender2)) {
            return false;
        }
        String message = getMessage();
        String message2 = privateChatMessage.getMessage();
        if (message == null) {
            return message2 == null;
        }
        return message.equals(message2);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof PrivateChatMessage;
    }

    public int hashCode() {
        String sender = getSender();
        int iHashCode = (1 * 59) + (sender == null ? 43 : sender.hashCode());
        String message = getMessage();
        return (iHashCode * 59) + (message == null ? 43 : message.hashCode());
    }

    public String toString() {
        return "PrivateChatMessage(sender=" + getSender() + ", message=" + getMessage() + ")";
    }

    public PrivateChatMessage(String str, String str2) {
        this.sender = str;
        this.message = str2;
    }

    public PrivateChatMessage() {
    }
}
