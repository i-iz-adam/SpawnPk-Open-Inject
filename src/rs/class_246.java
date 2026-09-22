package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_246.class */
public class class_246 extends class_225 {
    public static int p = 8;
    public static int q = 5;
    public boolean r = false;
    public int s;

    @Override // rs.class_253
    public void b() {
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var != class_254.a && this.s < class_332.y.length) {
            if (class_205.d) {
                p = (Client.ai / 64) - 2;
                q = (Client.ah / 64) - 2;
            }
            int i = 1;
            int i2 = 1;
            int i3 = 0;
            for (int i4 = this.s; i4 < this.s + (p * q) && i4 < class_332.y.length; i4++) {
                if (i4 >= 40) {
                    try {
                        client.a(i4, 50L);
                    } catch (Exception e) {
                    }
                }
                i3++;
                class_332.y[i4].b(i, i2);
                client.gn.c("@gre@ID " + i4, i + 32, i2 + 62, 0, 0);
                i += 65;
                if (i3 >= p) {
                    i3 = 0;
                    i = 0;
                    i2 += 65;
                }
            }
        }
    }

    @Override // rs.class_225
    public boolean a(int i) {
        return i == 1 || i == 2;
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return this.r;
    }

    @Override // rs.class_253
    public void c() {
    }
}
