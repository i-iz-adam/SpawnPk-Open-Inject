package rs.runelite.events;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/FocusChanged.class */
public class FocusChanged {
    private boolean focused;

    public boolean isFocused() {
        return this.focused;
    }

    public void setFocused(boolean z) {
        this.focused = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FocusChanged)) {
            return false;
        }
        FocusChanged focusChanged = (FocusChanged) obj;
        return focusChanged.canEqual(this) && isFocused() == focusChanged.isFocused();
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof FocusChanged;
    }

    public int hashCode() {
        return (1 * 59) + (isFocused() ? 79 : 97);
    }

    public String toString() {
        return "FocusChanged(focused=" + isFocused() + ")";
    }
}
