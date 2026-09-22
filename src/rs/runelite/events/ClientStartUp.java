package rs.runelite.events;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/ClientStartUp.class */
public class ClientStartUp {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ClientStartUp) && ((ClientStartUp) obj).canEqual(this);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof ClientStartUp;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "ClientStartUp()";
    }
}
