package rs.runelite.events;

import rs.Npc;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/NpcSpawned.class */
public class NpcSpawned {
    private Npc npc;

    public Npc getNpc() {
        return this.npc;
    }

    public void setNpc(Npc npc) {
        this.npc = npc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NpcSpawned)) {
            return false;
        }
        NpcSpawned npcSpawned = (NpcSpawned) obj;
        if (!npcSpawned.canEqual(this)) {
            return false;
        }
        Npc npc = getNpc();
        Npc npc2 = npcSpawned.getNpc();
        if (npc == null) {
            return npc2 == null;
        }
        return npc.equals(npc2);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof NpcSpawned;
    }

    public int hashCode() {
        Npc npc = getNpc();
        return (1 * 59) + (npc == null ? 43 : npc.hashCode());
    }

    public String toString() {
        return "NpcSpawned(npc=" + String.valueOf(getNpc()) + ")";
    }
}
