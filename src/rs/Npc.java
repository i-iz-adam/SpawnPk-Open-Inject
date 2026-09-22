package rs;

/* JADX INFO: loaded from: client-final.jar:rs/Npc.class */
public final class Npc extends Entity {
    public boolean av;
    public int aw;
    public int ax;
    public int ay;
    public short az;
    public int aA = 0;
    public int aB = -1;
    public int aC = 0;
    public int aD = 7;
    public int aE = 7;
    public int aF = -1;
    public class_102 aG;
    public boolean aH;

    public ColorUtility m() {
        if (this.primarySeqID < 0 || this.primarySeqDelay != 0) {
            int i = -1;
            if (this.w >= 0) {
                i = d()[this.w].b() ? this.x : d()[this.w].e[this.x];
            }
            return this.aG.a(-1, i, null, this.w);
        }
        if (d()[this.primarySeqID].b()) {
            int i2 = this.G;
            if (this.w < 0 || this.w == this.t) {
                return this.aG.a(-1, i2, d()[this.primarySeqID].i, this.primarySeqID, this.w);
            }
            return this.aG.a(d()[this.w].b() ? this.x : d()[this.w].e[this.x], i2, d()[this.primarySeqID].i, this.primarySeqID, this.w);
        }
        int i3 = d()[this.primarySeqID].e[this.G];
        int i4 = -1;
        if (this.w >= 0 && this.w != this.t) {
            i4 = d()[this.w].e[this.x];
        }
        return this.aG.a(i4, i3, d()[this.primarySeqID].i, this.primarySeqID, this.w);
    }

    public int n() {
        if (this.aG == null) {
            return -1;
        }
        return (int) this.aG.x;
    }

    public String o() {
        return this.aG == null ? "null" : this.aG.o;
    }

    public int p() {
        return -1;
    }

    @Override // rs.class_48
    public ColorUtility c() {
        ColorUtility colorUtility;
        if (this.aG == null) {
            return null;
        }
        if (this.aG.x == 1337) {
            if (this.m < 0) {
                return null;
            }
            if (this.m >= 32768) {
                int i = this.m - 32768;
                Player player = Client.doField[i];
                if (i == Client.di) {
                    Player.aJ = true;
                    try {
                        ColorUtility colorUtilityC = Client.eR.c();
                        colorUtilityC.b(90, 90, 90);
                        return colorUtilityC;
                    } finally {
                        Player.aJ = false;
                    }
                }
                if (player == null) {
                    return null;
                }
                boolean z = false;
                if (player.aU) {
                    z = true;
                    player.aU = false;
                }
                Player.aJ = true;
                try {
                    ColorUtility colorUtilityC2 = player.c();
                    colorUtilityC2.b(90, 90, 90);
                    Player.aJ = false;
                    if (z) {
                        player.aU = true;
                    }
                    return colorUtilityC2;
                } catch (Throwable th) {
                    Player.aJ = false;
                    throw th;
                }
            }
        }
        if (this.aG.x == 1336 || this.aG.x == 1335 || this.aG.x == 1334 || this.aG.x == 8210) {
            if (this.m < 0) {
                return null;
            }
            if (this.m >= 32768) {
                int i2 = this.m - 32768;
                Player player2 = Client.doField[i2];
                if (i2 == Client.di) {
                    boolean z2 = Configuration.N;
                    if (!Configuration.N) {
                        Configuration.N = true;
                    }
                    Player.aJ = true;
                    try {
                        ColorUtility colorUtilityC3 = Client.eR.c();
                        Player.aJ = false;
                        Configuration.N = z2;
                        return colorUtilityC3;
                    } catch (Throwable th2) {
                        Player.aJ = false;
                        throw th2;
                    }
                }
                if (player2 == null) {
                    return null;
                }
                boolean z3 = false;
                if (player2.aU) {
                    z3 = true;
                    player2.aU = false;
                }
                Player.aJ = true;
                try {
                    ColorUtility colorUtilityC4 = player2.c();
                    Player.aJ = false;
                    if (z3) {
                        player2.aU = true;
                    }
                    return colorUtilityC4;
                } catch (Throwable th3) {
                    Player.aJ = false;
                    throw th3;
                }
            }
        }
        ColorUtility colorUtilityM = m();
        if (colorUtilityM == null) {
            return null;
        }
        this.r = colorUtilityM.g;
        if (this.z != -1 && this.A != -1) {
            class_127 class_127Var = class_127.c[this.z];
            ColorUtility colorUtilityA = (class_127Var.g == null || !class_127Var.g.b()) ? class_127Var.a() : class_127Var.c(this.A);
            if (colorUtilityA != null) {
                if (class_127Var.g.b()) {
                    colorUtility = colorUtilityA;
                    colorUtility.a(0, -this.D, 0);
                } else {
                    int i3 = class_127Var.g.e[this.A];
                    colorUtility = new ColorUtility(true, class_176.g(i3), false, colorUtilityA);
                    colorUtility.a(0, -this.D, 0);
                    colorUtility.n();
                    colorUtility.f(i3, class_127Var.g.r);
                }
                colorUtility.aM = null;
                colorUtility.aL = null;
                if (class_127Var.j != 128 || class_127Var.k != 128) {
                    colorUtility.b(class_127Var.j, class_127Var.j, class_127Var.k);
                }
                colorUtility.b(64 + class_127Var.m, 850 + class_127Var.n, -30, -50, -30, true);
                colorUtilityM = new ColorUtility(new ColorUtility[]{colorUtilityM, colorUtility});
                colorUtilityM.f();
            }
        }
        if (this.aG.r == 1) {
            colorUtilityM.aN = true;
        } else {
            colorUtilityM.aN = false;
        }
        if (this.aG.aa > -1) {
            this.ar = (byte) this.aG.aa;
            this.ap = (byte) this.aG.ac;
            this.aq = (byte) this.aG.ad;
            this.ao = (byte) this.aG.ab;
        }
        if (this.ar > 0) {
            colorUtilityM.S = this.ar;
            colorUtilityM.T = this.ap;
            colorUtilityM.U = this.aq;
            colorUtilityM.V = this.ar;
        } else {
            colorUtilityM.V = (byte) 0;
        }
        return colorUtilityM;
    }

    public boolean q() {
        return this.aH && this.m - 32768 != Client.di;
    }

    @Override // rs.Entity
    public boolean l() {
        return this.aG != null;
    }

    public void a(class_333 class_333Var, int i, int i2) {
        if (!class_194.a()) {
            if (this.aB == 0) {
                this.aA += this.aD;
                if (this.aA >= 225) {
                    this.aB = 1;
                }
            } else if (this.aB == 1) {
                this.aA -= this.aE;
                if (this.aA <= 0) {
                    this.aA = 0;
                    this.aC--;
                    if (this.aC <= 0) {
                        this.aB = -1;
                        this.aC = 0;
                    } else {
                        this.aB = 0;
                    }
                }
            }
        }
        class_333Var.g(i, i2, this.aA);
    }
}
