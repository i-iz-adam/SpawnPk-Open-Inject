package rs.runelite.events;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/MenuOpened.class */
public class MenuOpened {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MenuOpened) && ((MenuOpened) obj).canEqual(this);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof MenuOpened;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "MenuOpened()";
    }
}
