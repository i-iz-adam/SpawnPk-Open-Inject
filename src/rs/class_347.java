package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_347.class */
public class class_347 extends class_352 {
    @Override // rs.Widget
    public void f(int i, int i2) {
        class_343 class_343Var;
        if (Client.cI > 0 && (class_343Var = (class_343) Widget.l(Client.cI)) != null) {
            int i3 = i - 3;
            int i4 = (i2 - (this.an.r / 4)) - 3;
            int i5 = 20 - (this.an.r / 4);
            if (class_343Var.k() == 1) {
                i4 += 3;
                i5 += 6;
            }
            class_210.a(i3 + 1, i4, (3 + class_343Var.P) - 2, i5 + 2, this.au % 2 != 0 ? 4668980 : 3814187, 255);
            if (this.au == (class_344.c + class_343Var.h()) - 1) {
                return;
            }
            class_210.a(i3 + 1, i4 + i5 + 1, (3 + class_343Var.P) - 2, 1, 3156516, 255);
        }
    }

    public static class_347 k(int i, String str) {
        class_347 class_347Var = new class_347();
        H[i] = class_347Var;
        class_347Var.ag = i;
        class_347Var.au = i;
        class_347Var.aG = 4;
        class_347Var.M = 0;
        class_347Var.P = 0;
        class_347Var.aP = 11;
        class_347Var.J = 0;
        class_347Var.aA = (byte) 0;
        class_347Var.aa = -1;
        class_347Var.S = false;
        class_347Var.aQ = true;
        class_347Var.as = str;
        class_347Var.Z = "";
        class_347Var.O = 0;
        class_347Var.L = 0;
        class_347Var.aj = 0;
        class_347Var.a();
        return class_347Var;
    }
}
