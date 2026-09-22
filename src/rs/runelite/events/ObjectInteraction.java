package rs.runelite.events;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/ObjectInteraction.class */
public class ObjectInteraction {
    int id;
    int x;
    int y;
    int z;
    int hash;

    public int getId() {
        return this.id;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public int getHash() {
        return this.hash;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setX(int i) {
        this.x = i;
    }

    public void setY(int i) {
        this.y = i;
    }

    public void setZ(int i) {
        this.z = i;
    }

    public void setHash(int i) {
        this.hash = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectInteraction)) {
            return false;
        }
        ObjectInteraction objectInteraction = (ObjectInteraction) obj;
        return objectInteraction.canEqual(this) && getId() == objectInteraction.getId() && getX() == objectInteraction.getX() && getY() == objectInteraction.getY() && getZ() == objectInteraction.getZ() && getHash() == objectInteraction.getHash();
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof ObjectInteraction;
    }

    public int hashCode() {
        return (((((((((1 * 59) + getId()) * 59) + getX()) * 59) + getY()) * 59) + getZ()) * 59) + getHash();
    }

    public String toString() {
        return "ObjectInteraction(id=" + getId() + ", x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ", hash=" + getHash() + ")";
    }
}
