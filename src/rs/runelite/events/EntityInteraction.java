package rs.runelite.events;

import rs.Entity;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/EntityInteraction.class */
public class EntityInteraction {
    Entity entity;
    boolean combat = false;

    public Entity getEntity() {
        return this.entity;
    }

    public boolean isCombat() {
        return this.combat;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public void setCombat(boolean z) {
        this.combat = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EntityInteraction)) {
            return false;
        }
        EntityInteraction entityInteraction = (EntityInteraction) obj;
        if (!entityInteraction.canEqual(this) || isCombat() != entityInteraction.isCombat()) {
            return false;
        }
        Entity entity = getEntity();
        Entity entity2 = entityInteraction.getEntity();
        if (entity == null) {
            return entity2 == null;
        }
        return entity.equals(entity2);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof EntityInteraction;
    }

    public int hashCode() {
        int i = (1 * 59) + (isCombat() ? 79 : 97);
        Entity entity = getEntity();
        return (i * 59) + (entity == null ? 43 : entity.hashCode());
    }

    public String toString() {
        return "EntityInteraction(entity=" + String.valueOf(getEntity()) + ", combat=" + isCombat() + ")";
    }
}
