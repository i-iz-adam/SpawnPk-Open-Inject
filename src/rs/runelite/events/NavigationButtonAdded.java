package rs.runelite.events;

import rs.ui.l;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/NavigationButtonAdded.class */
public final class NavigationButtonAdded {
    private final l button;

    public NavigationButtonAdded(l lVar) {
        this.button = lVar;
    }

    public l getButton() {
        return this.button;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NavigationButtonAdded)) {
            return false;
        }
        l button = getButton();
        l button2 = ((NavigationButtonAdded) obj).getButton();
        if (button == null) {
            return button2 == null;
        }
        return button.equals(button2);
    }

    public int hashCode() {
        l button = getButton();
        return (1 * 59) + (button == null ? 43 : button.hashCode());
    }

    public String toString() {
        return "NavigationButtonAdded(button=" + String.valueOf(getButton()) + ")";
    }
}
