package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_65.class */
public class class_65 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public class_65(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.c = i3;
    }

    public void a(Client client, Entity entity, int i, int i2, int i3) {
        if (i2 <= -1) {
            return;
        }
        if (i == 1) {
            i3 -= 20;
        }
        if (i == 2) {
            i2 -= 15;
            i3 -= 10;
        }
        if (i == 3) {
            i2 += 15;
            i3 -= 10;
        }
        if (this.e != 0) {
            switch (this.d) {
                case 1:
                    if ((entity instanceof Npc) && ((Npc) entity).aG.x == 3329) {
                        client.db.f(i2 - 12, i3 - 12);
                    } else {
                        client.dS[this.d].f(i2 - 12, i3 - 12);
                    }
                    break;
                case 2:
                    client.dS[2].f(i2 - 11, i3 - 12);
                    break;
                case 3:
                    client.cZ.f(i2 - 11, i3 - 12);
                    break;
                case 4:
                    client.dS[4].f(i2 - 11, i3 - 12);
                    i3 += 2;
                    i2 += 2;
                    break;
                case 5:
                    client.dc.f(i2 - 11, i3 - 12);
                    break;
                case 6:
                    client.da.f(i2 - 12, i3 - 12);
                    break;
                case 7:
                    client.db.f(i2 - 12, i3 - 12);
                    break;
                case 8:
                    class_337.g.f(i2 - 11, i3 - 12);
                    break;
                default:
                    client.dS[this.d].f(i2 - 12, i3 - 12);
                    break;
            }
        } else {
            client.dS[0].f(i2 - 12, i3 - 12);
        }
        if (Configuration.aq && this.c != 255 && this.e > 0) {
            if (i == 0 || i == 1) {
                client.df[this.c].a(i2 - 3, i3 - 8, 200);
            } else if (i == 2) {
                client.df[this.c].a(i2 - 26, i3 - 13, 200);
            } else {
                client.df[this.c].a(i2 - 3, i3 - 13, 200);
            }
        }
        Client.gh.e(0, this.e, i3 + 4, i2);
        Client.gh.e(class_492.c, this.e, i3 + 3, i2 - 1);
    }

    public void b(Client client, Entity entity, int i, int i2, int i3) {
        int i4 = i3 + (20 * i);
        if (!class_194.a()) {
            if (Client.ff % 5 == 0 && this.a > -15) {
                this.a--;
            }
            if (this.g - 40 < Client.ff) {
                this.b -= 5;
            }
        }
        int i5 = 1;
        if (this.e >= 10 && this.e < 100) {
            i5 = 2;
        }
        if (this.e >= 100) {
            i5 = 3;
        }
        int i6 = this.b;
        if (i6 < 0) {
            i6 = 0;
        }
        if (this.e <= 0) {
            client.dd.a(i2 - 12, (i4 - 14) + this.a, i6);
            return;
        }
        class_333 class_333Var = null;
        class_333 class_333Var2 = null;
        class_333 class_333Var3 = null;
        int i7 = 0;
        switch (i5) {
            case 1:
                i7 = 8;
                break;
            case 2:
                i7 = 4;
                break;
            case 3:
                i7 = 1;
                break;
        }
        switch (this.d) {
            case 0:
            case 1:
                class_333Var = client.players[0];
                class_333Var2 = client.players[1];
                class_333Var3 = client.players[2];
                break;
            case 2:
                class_333Var = client.players[6];
                class_333Var2 = client.players[7];
                class_333Var3 = client.players[8];
                break;
            case 3:
                class_333Var = client.players[9];
                class_333Var2 = client.players[10];
                class_333Var3 = client.players[11];
                break;
            case 4:
                class_333Var = client.players[18];
                class_333Var2 = client.players[19];
                class_333Var3 = client.players[20];
                break;
            case 5:
                class_333Var = client.players[12];
                class_333Var2 = client.players[13];
                class_333Var3 = client.players[14];
                break;
            case 6:
                class_333Var = client.players[3];
                class_333Var2 = client.players[4];
                class_333Var3 = client.players[5];
                break;
            case 7:
                class_333Var = client.players[16];
                class_333Var2 = client.players[15];
                class_333Var3 = client.players[17];
                break;
            case 8:
                class_333Var = client.players[18];
                class_333Var2 = client.players[19];
                class_333Var3 = client.players[20];
                break;
        }
        if (this.c != 255) {
            client.df[this.c].a((i2 - 34) + i7, (i4 - 14) + this.a, i6);
        }
        class_333Var.a((i2 - 12) + i7, (i4 - 12) + this.a, i6);
        int i8 = i7 + 4;
        for (int i9 = 0; i9 < i5 * 2; i9++) {
            class_333Var2.a((i2 - 12) + i8, (i4 - 12) + this.a, i6);
            i8 += 4;
        }
        class_333Var3.a((i2 - 12) + i8, (i4 - 12) + this.a, i6);
        if (i6 > 100) {
            (this.d == 1 ? Client.gh : Client.gh).e(class_492.c, this.e, i4 + (this.d != 0 ? 2 : 32) + this.a + 2, i2 + 4);
        }
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public int c() {
        return this.c;
    }

    public void c(int i) {
        this.c = i;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public int f() {
        return this.f;
    }

    public void f(int i) {
        this.f = i;
    }

    public int g() {
        return this.g;
    }

    public void g(int i) {
        this.g = i;
    }
}
