package rs.runelite.events;

import rs.ui.l;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/NavigationButtonRemoved.class */
public final class NavigationButtonRemoved {
    private final l button;

    public NavigationButtonRemoved(l lVar) {
        this.button = lVar;
    }

    public l getButton() {
        return this.button;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NavigationButtonRemoved)) {
            return false;
        }
        l button = getButton();
        l button2 = ((NavigationButtonRemoved) obj).getButton();
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
        return "NavigationButtonRemoved(button=" + String.valueOf(getButton()) + ")";
    }
}
