package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_247.class */
public class class_247 extends class_253 {
    public int q;
    public int s;
    public int u;
    public String v;
    public static class_553 w = new class_248();
    public boolean p = false;
    public String r = "";
    public String t = "";

    @Override // rs.class_253
    public void b() {
        this.r = "Killcount: @yel@" + this.q;
        this.t = "Drop rate: @gre@+" + this.s + "%";
        this.v = "Essence bonus: @gre@+" + this.u + "%";
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return this.p;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var == class_254.a) {
            return;
        }
        int i = 397;
        int i2 = 2;
        if (Configuration.ai == class_151.b) {
            i = 200 + (Client.ai - 560);
            i2 = 25;
        }
        if (!client.x.C) {
            i2 += Configuration.ai == class_151.b ? 25 : 50;
        } else if (Configuration.ai != class_151.b) {
            i2 += 8;
        }
        Client.gl.a(this.r, i + 110, i2 + 17 + 1, class_492.c, 0);
        Client.gl.a(this.t, i + 110, i2 + 17 + 15 + 1, class_492.c, 0);
        Client.gl.a(this.v, i + 110, i2 + 17 + 15 + 15 + 1, class_492.c, 0);
    }

    @Override // rs.class_253
    public void c() {
        this.p = false;
    }
}
