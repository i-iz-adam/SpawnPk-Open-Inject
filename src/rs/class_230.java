package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_230.class */
public class class_230 extends class_253 {
    @Override // rs.class_253
    public void b() {
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var != class_254.b) {
            return;
        }
        int i = 375;
        int i2 = 20;
        if (Configuration.ai == class_151.b) {
            i = 200 + (Client.ai - 560);
            i2 = 25;
        }
        if (class_253.a.e() || class_253.e.e() || class_253.f.e() || class_253.g.e()) {
            i2 += 80 + (Configuration.ai == class_151.b ? 20 : 0);
        }
        int i3 = Client.eh + ((Client.eR.ac - 6) >> 7);
        int i4 = Client.ei + ((Client.eR.ad - 6) >> 7);
        client.gn.b("Coords: @gre@" + i3 + ", " + i4, i, i2, class_492.g, 0);
        client.gn.b("Region ID: @whi@" + (((i3 >> 6) * 256) + (i4 >> 6)), i, i2 + 15, class_492.g, 0);
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return Configuration.ao;
    }

    @Override // rs.class_253
    public void c() {
    }
}
