package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_211.class */
public class class_211 extends class_214 {
    private class_333 c;
    private class_213[] d;
    private final int[][][] e;

    public class_211(Client client) {
        super(client);
        this.d = new class_213[3];
        this.e = new int[][][]{new int[][]{new int[]{172, 116}, new int[]{328, 116}}, new int[][]{new int[]{114, 179}, new int[]{389, 179}}, new int[][]{new int[]{172, User32.VK_OEM_COPY}, new int[]{328, User32.VK_OEM_COPY}}};
    }

    @Override // rs.class_214
    public void a() {
        Client client = this.a;
        if (Client.cH != class_475.c) {
            return;
        }
        if (this.c == null) {
            this.c = ItemComposition.a(aU.Bc, 0, 0, 32);
        }
        for (int i = 0; i < this.d.length; i++) {
            class_213 class_213Var = this.d[i];
            if (class_213Var != null) {
                if (class_213Var.a() == null) {
                    class_213Var.a(ItemComposition.a(class_213Var.b(), 0, 0, 32));
                }
                if (class_213Var.a() != null) {
                    a(class_213Var.a(), class_213Var.d() == 1 ? 0 : class_213Var.d(), this.e[i][0][0], this.e[i][0][1]);
                }
                a(this.c, class_213Var.c(), this.e[i][1][0], this.e[i][1][1]);
            }
        }
    }

    @Override // rs.class_214
    public boolean b() {
        return false;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.d[i] = new class_213(i2, i4, i3);
    }

    private void a(class_333 class_333Var, int i, int i2, int i3) {
        int i4 = Configuration.ai == class_151.a ? 0 : (Client.ai / 2) - 356;
        int i5 = Configuration.ai == class_151.a ? 0 : (Client.ah / 2) - 230;
        int i6 = 9 + i5;
        int i7 = 0 + i4;
        if (class_333Var == null) {
            return;
        }
        class_333Var.f(i2 + i4, i3 + i5);
        if (i >= 1) {
            Client client = this.a;
            class_338 class_338Var = Client.gh;
            Client client2 = this.a;
            class_338Var.b(class_492.g, Client.g(i), i3 + i6, i2 + i7);
            return;
        }
        if (i >= 100000) {
            Client client3 = this.a;
            class_338 class_338Var2 = Client.gh;
            Client client4 = this.a;
            class_338Var2.b(class_492.c, Client.g(i), i3 + i6, i2 + i7);
            return;
        }
        if (i >= 10000000) {
            Client client5 = this.a;
            class_338 class_338Var3 = Client.gh;
            Client client6 = this.a;
            class_338Var3.b(65408, Client.g(i), i3 + i6, i2 + i7);
        }
    }
}
