package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_556.class */
public class class_556 extends class_553 {
    @Override // rs.class_553
    public void a() {
        Npc npcB;
        if (e() != 1 || (npcB = b(g())) == null) {
            return;
        }
        npcB.h.c().clear();
    }

    private Npc b(int i) {
        if (i < 0 || i >= this.c.cA.length) {
            return null;
        }
        return this.c.cA[i];
    }
}
