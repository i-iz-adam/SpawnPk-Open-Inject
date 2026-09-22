package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_309.class */
public abstract class class_309 extends class_306 {
    protected Player e;

    @Override // rs.class_306
    public void b() {
        this.e = null;
    }

    protected boolean k() {
        return (this.e == null || this.a == null || this.e != Client.eR) ? false : true;
    }

    public Player l() {
        return this.e;
    }

    public void a(Player player) {
        this.e = player;
    }
}
