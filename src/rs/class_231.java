package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_231.class */
public class class_231 extends class_253 {
    public static int p = 0;
    public static int q = 0;
    public static String r = null;
    public static final class_553 s = new class_232();

    @Override // rs.class_253
    public void b() {
        f();
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return Client.cH == 31244;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var != class_254.b || p == 0 || q == 0) {
            return;
        }
        if (r == null) {
            r = ItemComposition.lookupItem(q).itemName;
        }
        if (Client.br != 49991) {
            return;
        }
        int i = (Client.hP - (220 / 2)) + 5;
        int i2 = (Client.hQ - 37) + 3;
        if (Configuration.ai == class_151.a && i > 288) {
            i = 288;
        }
        class_210.d(i - 1, 220 + (1 * 2), 37 + (1 * 2), class_228.u, (i2 - 15) - 1);
        class_210.b(37, i2 - 15, i, 1595156, 220, 200);
        Client.gl.b("You have a @gre@" + p + "% @whi@chance to save ingredients", i + 2, i2, class_492.c, 0);
        Client.gl.b("on failed attempts @or2@(consumes on save!)", i + 2, i2 + 16, class_492.c, 0);
        int i3 = i2 - 17;
        class_210.d(i - 1, 220 + (1 * 2), 17 + (1 * 2), class_228.u, (i3 - 15) - 1);
        class_210.b(17, i3 - 15, i, 1595156, 220, 200);
        ItemComposition.a(q, 1, 32, 25).e(i - 4, i3 - 23, 0);
        Client.gl.b("@or1@" + r, i + 25, i3 - 1, class_492.c, 0);
    }

    @Override // rs.class_253
    public void c() {
        f();
    }

    public void f() {
        q = 0;
        p = 0;
        r = null;
    }
}
