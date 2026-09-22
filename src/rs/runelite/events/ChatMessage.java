package rs.runelite.events;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/ChatMessage.class */
public class ChatMessage {
    private String message;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) obj;
        if (!chatMessage.canEqual(this)) {
            return false;
        }
        String message = getMessage();
        String message2 = chatMessage.getMessage();
        if (message == null) {
            return message2 == null;
        }
        return message.equals(message2);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof ChatMessage;
    }

    public int hashCode() {
        String message = getMessage();
        return (1 * 59) + (message == null ? 43 : message.hashCode());
    }

    public String toString() {
        return "ChatMessage(message=" + getMessage() + ")";
    }

    public ChatMessage(String str) {
        this.message = str;
    }

    public ChatMessage() {
    }
}
