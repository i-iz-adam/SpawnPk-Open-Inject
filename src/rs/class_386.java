package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_386.class */
class class_386 extends class_253 {
    class_386() {
    }

    @Override // rs.class_253
    public void b() {
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return Client.cH == 59835 && class_384.c;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var != class_254.b) {
            return;
        }
        int i = 125 + (Configuration.ai == class_151.a ? 0 : (Client.ai / 2) - 356);
        int i2 = 204 + (Configuration.ai == class_151.a ? 0 : (Client.ah / 2) - 230);
        Client.gl.c("@or2@The rules", i + 40, i2 + 35, class_492.e, 0);
        Client.gl.c("@or2@have been", i + 40, i2 + 35 + 15, class_492.e, 0);
        Client.gl.c("@or2@switched!", i + 40, i2 + 35 + 30, class_492.e, 0);
        if (System.currentTimeMillis() - class_384.d <= 500) {
            class_384.e.f(i, i2);
            class_384.e.f(i, i2 + 40);
            class_384.e.f(i, i2 + 80);
        }
        if (System.currentTimeMillis() - class_384.d >= 1000) {
            class_384.d = System.currentTimeMillis();
        }
    }

    @Override // rs.class_253
    public void c() {
    }
}
