package rs;

import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.bk;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_173.class */
public class class_173 {
    private Client l;
    public class_333 c;
    public class_333 d;
    public class_333 e;
    public class_333 f;
    public class_333 g;
    public boolean h;
    private class_333 p;
    private class_333 q;
    private class_333 r;
    private class_333 s;
    public boolean i;
    private static final int x = 50;
    private static final int y = 100;
    private static final Color z = c(10159875);
    private static final Color A = c(2004400);
    private static final Color B = new Color(255, 255, 255, 60);
    private static final String[] C = {"All", "Game", "Yell", "Public", "Private", "Clan", "Trade", "News"};
    private static final String[] D = {"On", "Friends", "Off", "Hide", "Filtered"};
    private static final int[] E = {bk.ao, class_492.g, bk.aS, 65535, class_492.g};
    public long j;
    public long k;
    private static final double F = 26.0d;
    private static final int G = 27;
    private class_333[] m = new class_333[5];
    public class_333[] a = new class_333[14];
    public class_333[] b = new class_333[29];
    private int n = 1;
    private final int o = 6;
    private int t = -1;
    private int u = -1;
    private int v = -1;
    private int w = -1;

    public class_173(Client client) {
        this.l = client;
        for (int i = 0; i < this.m.length; i++) {
            this.m[i] = new class_333("gameframe/redstone " + i);
            this.m[i].c(255, 255, 255);
        }
        for (int i2 = 0; i2 < this.a.length; i2++) {
            this.a[i2] = new class_333("gameframe/icons/icon " + i2);
            this.a[i2].c(255, 255, 255);
        }
        this.p = new class_333("orbs/orb_drain");
        this.q = new class_333("orbs/orb_drain");
        this.r = new class_333("orbs/orb_drain");
        this.s = new class_333("orbs/orb_drain");
        this.f = new class_333("orbs/adventure_orb");
        this.g = new class_333("orbs/adventure_orb_hover");
        this.b[0] = new class_333("orbs/orb_drain");
        this.b[1] = new class_333("orbs/orb_bg");
        this.b[2] = new class_333("orbs/hp_fill");
        this.b[3] = new class_333("orbs/hp_icon");
        this.b[4] = new class_333("orbs/pray_fill");
        this.b[5] = new class_333("orbs/pray_icon");
        this.b[6] = new class_333("orbs/run_fill");
        this.b[7] = new class_333("orbs/run_icon");
        this.b[8] = new class_333("orbs/run_fill_active");
        this.b[9] = new class_333("orbs/run_icon_active");
        this.b[10] = new class_333("orbs/orb_bg_hover");
        this.b[11] = new class_333("orbs/hit_toggle");
        this.b[12] = new class_333("orbs/hit_toggle_hover");
        this.b[13] = new class_333("orbs/hit_toggle_active");
        this.b[14] = new class_333("orbs/exp_toggle_active");
        this.b[15] = new class_333("orbs/right_arrow");
        this.b[16] = new class_333("orbs/left_arrow");
        this.b[17] = new class_333("orbs/heal_toggle_active");
        this.b[18] = new class_333("orbs/refill_toggle_active");
        this.b[19] = new class_333("orbs/run_icon_stamina");
        this.b[20] = new class_333("orbs/boss_toggle_active");
        this.b[21] = new class_333("orbs/bank_inv_active");
        this.b[22] = new class_333("orbs/bank_equip_active");
        this.b[23] = new class_333("orbs/promo_orb");
        this.b[24] = new class_333("orbs/promo_orb_hover");
        this.b[25] = new class_333("orbs/event_orb");
        this.b[26] = new class_333("orbs/event_orb_hover");
        this.b[27] = new class_333("orbs/spec_fill");
        this.b[28] = new class_333("orbs/spec_icon");
        this.c = new class_333("gameframe/chatbutton");
        this.d = new class_333("gameframe/hoverchat");
        this.e = new class_333("gameframe/hoverchat2");
    }

    private static Color c(int i) {
        float[] fArr = new float[3];
        Color.RGBtoHSB(i >>> 16, (i >> 8) & 255, i & 255, fArr);
        return Color.getHSBColor(fArr[0], 1.0f, 1.0f);
    }

    public void a() {
        if (Configuration.ai == class_151.b) {
            o();
        }
        i();
        l();
        m();
        n();
        p();
        j();
        k();
        q();
        t();
        s();
        u();
        r();
        if (Configuration.ai == class_151.a) {
            o();
        }
    }

    private void i() {
        int i = 684;
        int i2 = 87;
        if (Configuration.ai != class_151.a) {
            i = Client.ai - 85;
            i2 = 155;
        }
        this.h = false;
        if (Configuration.ai == class_151.b) {
            Client client = this.l;
            if (Client.hP >= Client.ai - 85) {
                Client client2 = this.l;
                if (Client.hP <= (Client.ai - 85) + 34) {
                    Client client3 = this.l;
                    if (Client.hQ >= 201) {
                        Client client4 = this.l;
                        if (Client.hQ <= 201 + 34) {
                            this.h = true;
                        }
                    }
                }
            }
            (this.h ? this.g : this.f).f((-2) + i, 44 + i2);
            if (this.h) {
                Client client5 = this.l;
                Client client6 = this.l;
                int i3 = Client.hP - 50;
                Client client7 = this.l;
                client5.b(i3, Client.hQ - 15, " Adventure book   ");
            }
        } else {
            Client client8 = this.l;
            if (Client.hP >= 680) {
                Client client9 = this.l;
                if (Client.hP <= 712) {
                    Client client10 = this.l;
                    if (Client.hQ >= 134) {
                        Client client11 = this.l;
                        if (Client.hQ <= 162) {
                            this.h = true;
                        }
                    }
                }
            }
            (this.h ? this.g : this.f).f((-2) + i, 44 + i2);
            if (this.h) {
                Client client12 = this.l;
                Client client13 = this.l;
                int i4 = (Client.hP - Client.aj) - 20;
                Client client14 = this.l;
                client12.b(i4, Client.hQ - 10, " Adventure Book   ");
            }
        }
        Client client15 = this.l;
        if (Client.ff % 20 >= 10 || this.l.cY != 6) {
            return;
        }
        this.l.cX.f(i - 34, i2 + 45);
    }

    private void j() {
        int i = 723;
        int i2 = 10;
        if (Configuration.ai != class_151.a) {
            i = Client.ai - 118;
            i2 = 120;
        }
        boolean z2 = false;
        if (Configuration.ai != class_151.b) {
            Client client = this.l;
            if (Client.hP >= 718) {
                Client client2 = this.l;
                if (Client.hP <= 744) {
                    Client client3 = this.l;
                    if (Client.hQ >= 57) {
                        Client client4 = this.l;
                        if (Client.hQ <= 79) {
                            z2 = true;
                            Client client5 = this.l;
                            Client client6 = this.l;
                            int i3 = Client.hP - 50;
                            Client client7 = this.l;
                            client5.b(i3, Client.hQ + 10, " Donate");
                        }
                    }
                }
            }
            this.b[z2 ? (char) 26 : (char) 25].f((-2) + i, 44 + i2);
            return;
        }
        Client client8 = this.l;
        if (Client.hP >= Client.ai - 119) {
            Client client9 = this.l;
            if (Client.hP <= Client.ai - 96) {
                Client client10 = this.l;
                if (Client.hQ >= 166) {
                    Client client11 = this.l;
                    if (Client.hQ <= 188) {
                        z2 = true;
                    }
                }
            }
        }
        this.b[z2 ? (char) 26 : (char) 25].f((-2) + i, 44 + i2);
        if (z2) {
            Client client12 = this.l;
            Client client13 = this.l;
            int i4 = Client.hP - 50;
            Client client14 = this.l;
            client12.b(i4, Client.hQ - 15, " Donate");
        }
    }

    private void k() {
        int i = 714;
        int i2 = -20;
        if (Configuration.ai != class_151.a) {
            i = Client.ai - 85;
            i2 = 125;
        }
        boolean z2 = false;
        if (Configuration.ai != class_151.b) {
            Client client = this.l;
            if (Client.hP >= 710) {
                Client client2 = this.l;
                if (Client.hP <= 733) {
                    Client client3 = this.l;
                    if (Client.hQ >= 22) {
                        Client client4 = this.l;
                        if (Client.hQ <= 48) {
                            z2 = true;
                            Client client5 = this.l;
                            Client client6 = this.l;
                            int i3 = Client.hP - 50;
                            Client client7 = this.l;
                            client5.b(i3, Client.hQ + 10, " View item guides  ");
                        }
                    }
                }
            }
            this.b[z2 ? (char) 24 : (char) 23].f((-2) + i, 44 + i2);
            return;
        }
        Client client8 = this.l;
        if (Client.hP >= Client.ai - 86) {
            Client client9 = this.l;
            if (Client.hP <= Client.ai - 62) {
                Client client10 = this.l;
                if (Client.hQ >= 172) {
                    Client client11 = this.l;
                    if (Client.hQ <= 198) {
                        z2 = true;
                    }
                }
            }
        }
        this.b[z2 ? (char) 24 : (char) 23].f((-2) + i, 44 + i2);
        if (z2) {
            Client client12 = this.l;
            Client client13 = this.l;
            int i4 = Client.hP - 50;
            Client client14 = this.l;
            client12.b(i4, Client.hQ - 15, " View item guides  ");
        }
    }

    public void a(int i) {
        int i2 = this.l.fi;
        this.l.fi = i;
        if (i2 == i) {
            a(!Configuration.bc);
        } else if (Configuration.bc) {
            a(false);
        }
        Client.fM = true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0320  */
    /* JADX WARN: Code duplicated, block: B:101:0x032e  */
    /* JADX WARN: Code duplicated, block: B:46:0x015d  */
    /* JADX WARN: Code duplicated, block: B:48:0x016a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0177  */
    /* JADX WARN: Code duplicated, block: B:52:0x0184  */
    /* JADX WARN: Code duplicated, block: B:53:0x0191  */
    /* JADX WARN: Code duplicated, block: B:54:0x019e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x020c  */
    /* JADX WARN: Code duplicated, block: B:69:0x021a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0228  */
    /* JADX WARN: Code duplicated, block: B:72:0x0236  */
    /* JADX WARN: Code duplicated, block: B:74:0x0244  */
    /* JADX WARN: Code duplicated, block: B:76:0x0251  */
    /* JADX WARN: Code duplicated, block: B:77:0x025f  */
    /* JADX WARN: Code duplicated, block: B:78:0x026d  */
    /* JADX WARN: Code duplicated, block: B:80:0x027b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0289  */
    /* JADX WARN: Code duplicated, block: B:84:0x0296  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x02db  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0305  */
    /* JADX WARN: Code duplicated, block: B:98:0x0313  */
    public void b() {
        Client client = this.l;
        int i = !Client.ag() ? 338 : Client.ah - 165;
        int i2 = Configuration.ai == class_151.b ? 141 + i : 141 + 338;
        if (this.l.fi == 0) {
            this.c.f(4, i2);
        } else if (this.l.fi == 12) {
            this.c.f(69, i2);
        } else if (this.l.fi == 5) {
            this.c.f(135, i2);
        } else if (this.l.fi == 1) {
            this.c.f(201, i2);
        } else if (this.l.fi == 2) {
            this.c.f(aU.hT_, i2);
        } else if (this.l.fi == 11) {
            this.c.f(333, i2);
        } else if (this.l.fi == 3) {
            this.c.f(399, i2);
        } else if (this.l.fi == 20) {
            this.c.f(459, i2);
        }
        int i3 = Client.ah - 503;
        Client client2 = this.l;
        if (Client.hQ >= User32.MN_GETHMENU + i3) {
            Client client3 = this.l;
            if (Client.hQ <= 502 + i3) {
                Client client4 = this.l;
                if (Client.hP >= 4) {
                    Client client5 = this.l;
                    if (Client.hP > 59) {
                        Client client6 = this.l;
                        if (Client.hP >= 69) {
                            Client client7 = this.l;
                            if (Client.hP <= 125) {
                                Client client8 = this.l;
                                if (Client.hP >= 135) {
                                    Client client9 = this.l;
                                    if (Client.hP <= 193) {
                                        Client client10 = this.l;
                                        if (Client.hP >= 201) {
                                            Client client11 = this.l;
                                            if (Client.hP <= 257) {
                                                Client client12 = this.l;
                                                if (Client.hP >= 267) {
                                                    Client client13 = this.l;
                                                    if (Client.hP <= 323) {
                                                        Client client14 = this.l;
                                                        if (Client.hP >= 333) {
                                                            Client client15 = this.l;
                                                            if (Client.hP <= 389) {
                                                                Client client16 = this.l;
                                                                if (Client.hP >= 400) {
                                                                    Client client17 = this.l;
                                                                    if (Client.hP <= 456) {
                                                                        Client client18 = this.l;
                                                                        if (Client.hP >= 460) {
                                                                            Client client19 = this.l;
                                                                            if (Client.hP <= 516) {
                                                                                if (this.l.fi == class_172.i) {
                                                                                    this.e.f(461, i2);
                                                                                } else {
                                                                                    this.d.f(461, i2);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (this.l.fi == class_172.e) {
                                                                        this.e.f(aU.in_, i2);
                                                                    } else {
                                                                        this.d.f(aU.in_, i2);
                                                                    }
                                                                } else {
                                                                    Client client110 = this.l;
                                                                    if (Client.hP >= 460) {
                                                                        Client client111 = this.l;
                                                                        if (Client.hP <= 516) {
                                                                            if (this.l.fi == class_172.i) {
                                                                                this.e.f(461, i2);
                                                                            } else {
                                                                                this.d.f(461, i2);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.g) {
                                                                this.e.f(335, i2);
                                                            } else {
                                                                this.d.f(335, i2);
                                                            }
                                                        } else {
                                                            Client client112 = this.l;
                                                            if (Client.hP >= 400) {
                                                                Client client113 = this.l;
                                                                if (Client.hP <= 456) {
                                                                    Client client114 = this.l;
                                                                    if (Client.hP >= 460) {
                                                                        Client client115 = this.l;
                                                                        if (Client.hP <= 516) {
                                                                            if (this.l.fi == class_172.i) {
                                                                                this.e.f(461, i2);
                                                                            } else {
                                                                                this.d.f(461, i2);
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (this.l.fi == class_172.e) {
                                                                    this.e.f(aU.in_, i2);
                                                                } else {
                                                                    this.d.f(aU.in_, i2);
                                                                }
                                                            } else {
                                                                Client client116 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client117 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.d) {
                                                        this.e.f(aU.hT_, i2);
                                                    } else {
                                                        this.d.f(aU.hT_, i2);
                                                    }
                                                } else {
                                                    Client client118 = this.l;
                                                    if (Client.hP >= 333) {
                                                        Client client119 = this.l;
                                                        if (Client.hP <= 389) {
                                                            Client client1110 = this.l;
                                                            if (Client.hP >= 400) {
                                                                Client client1111 = this.l;
                                                                if (Client.hP <= 456) {
                                                                    Client client1112 = this.l;
                                                                    if (Client.hP >= 460) {
                                                                        Client client1113 = this.l;
                                                                        if (Client.hP <= 516) {
                                                                            if (this.l.fi == class_172.i) {
                                                                                this.e.f(461, i2);
                                                                            } else {
                                                                                this.d.f(461, i2);
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (this.l.fi == class_172.e) {
                                                                    this.e.f(aU.in_, i2);
                                                                } else {
                                                                    this.d.f(aU.in_, i2);
                                                                }
                                                            } else {
                                                                Client client1114 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client1115 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.g) {
                                                            this.e.f(335, i2);
                                                        } else {
                                                            this.d.f(335, i2);
                                                        }
                                                    } else {
                                                        Client client1116 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client1117 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client1118 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client1119 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client11110 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.c) {
                                                this.e.f(201, i2);
                                            } else {
                                                this.d.f(201, i2);
                                            }
                                        } else {
                                            Client client120 = this.l;
                                            if (Client.hP >= 267) {
                                                Client client121 = this.l;
                                                if (Client.hP <= 323) {
                                                    Client client1120 = this.l;
                                                    if (Client.hP >= 333) {
                                                        Client client1121 = this.l;
                                                        if (Client.hP <= 389) {
                                                            Client client11112 = this.l;
                                                            if (Client.hP >= 400) {
                                                                Client client11113 = this.l;
                                                                if (Client.hP <= 456) {
                                                                    Client client11114 = this.l;
                                                                    if (Client.hP >= 460) {
                                                                        Client client11115 = this.l;
                                                                        if (Client.hP <= 516) {
                                                                            if (this.l.fi == class_172.i) {
                                                                                this.e.f(461, i2);
                                                                            } else {
                                                                                this.d.f(461, i2);
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (this.l.fi == class_172.e) {
                                                                    this.e.f(aU.in_, i2);
                                                                } else {
                                                                    this.d.f(aU.in_, i2);
                                                                }
                                                            } else {
                                                                Client client11116 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client11117 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.g) {
                                                            this.e.f(335, i2);
                                                        } else {
                                                            this.d.f(335, i2);
                                                        }
                                                    } else {
                                                        Client client11118 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client11119 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client111110 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client111111 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.d) {
                                                    this.e.f(aU.hT_, i2);
                                                } else {
                                                    this.d.f(aU.hT_, i2);
                                                }
                                            } else {
                                                Client client1122 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client1123 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client111114 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client111115 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client111116 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client111117 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client111118 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111119 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client1111110 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client1111111 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client1111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client1111114 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111115 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (this.l.fi == class_172.f) {
                                        this.e.f(135, i2);
                                    } else {
                                        this.d.f(135, i2);
                                    }
                                } else {
                                    Client client122 = this.l;
                                    if (Client.hP >= 201) {
                                        Client client123 = this.l;
                                        if (Client.hP <= 257) {
                                            Client client124 = this.l;
                                            if (Client.hP >= 267) {
                                                Client client125 = this.l;
                                                if (Client.hP <= 323) {
                                                    Client client1124 = this.l;
                                                    if (Client.hP >= 333) {
                                                        Client client1125 = this.l;
                                                        if (Client.hP <= 389) {
                                                            Client client1111116 = this.l;
                                                            if (Client.hP >= 400) {
                                                                Client client1111117 = this.l;
                                                                if (Client.hP <= 456) {
                                                                    Client client1111118 = this.l;
                                                                    if (Client.hP >= 460) {
                                                                        Client client1111119 = this.l;
                                                                        if (Client.hP <= 516) {
                                                                            if (this.l.fi == class_172.i) {
                                                                                this.e.f(461, i2);
                                                                            } else {
                                                                                this.d.f(461, i2);
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (this.l.fi == class_172.e) {
                                                                    this.e.f(aU.in_, i2);
                                                                } else {
                                                                    this.d.f(aU.in_, i2);
                                                                }
                                                            } else {
                                                                Client client11111110 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client11111111 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.g) {
                                                            this.e.f(335, i2);
                                                        } else {
                                                            this.d.f(335, i2);
                                                        }
                                                    } else {
                                                        Client client11111112 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client11111113 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client11111114 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client11111115 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client11111116 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111117 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.d) {
                                                    this.e.f(aU.hT_, i2);
                                                } else {
                                                    this.d.f(aU.hT_, i2);
                                                }
                                            } else {
                                                Client client1126 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client1127 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client11111118 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client11111119 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client111111110 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client111111111 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client111111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client111111114 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client111111115 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client111111116 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111117 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.l.fi == class_172.c) {
                                            this.e.f(201, i2);
                                        } else {
                                            this.d.f(201, i2);
                                        }
                                    } else {
                                        Client client126 = this.l;
                                        if (Client.hP >= 267) {
                                            Client client127 = this.l;
                                            if (Client.hP <= 323) {
                                                Client client1128 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client1129 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client1111111110 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client1111111111 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client1111111112 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client1111111113 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client1111111114 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111115 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client1111111116 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client1111111117 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client1111111118 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111119 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client11111111110 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.d) {
                                                this.e.f(aU.hT_, i2);
                                            } else {
                                                this.d.f(aU.hT_, i2);
                                            }
                                        } else {
                                            Client client11210 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client11211 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client11111111112 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client11111111113 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client11111111114 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111115 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client11111111116 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111117 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client11111111118 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client11111111119 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client111111111110 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client111111111112 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111113 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (this.l.fi == class_172.h) {
                                this.e.f(69, i2);
                            } else {
                                this.d.f(69, i2);
                            }
                        } else {
                            Client client20 = this.l;
                            if (Client.hP >= 135) {
                                Client client21 = this.l;
                                if (Client.hP <= 193) {
                                    Client client128 = this.l;
                                    if (Client.hP >= 201) {
                                        Client client129 = this.l;
                                        if (Client.hP <= 257) {
                                            Client client1210 = this.l;
                                            if (Client.hP >= 267) {
                                                Client client1211 = this.l;
                                                if (Client.hP <= 323) {
                                                    Client client11212 = this.l;
                                                    if (Client.hP >= 333) {
                                                        Client client11213 = this.l;
                                                        if (Client.hP <= 389) {
                                                            Client client111111111114 = this.l;
                                                            if (Client.hP >= 400) {
                                                                Client client111111111115 = this.l;
                                                                if (Client.hP <= 456) {
                                                                    Client client111111111116 = this.l;
                                                                    if (Client.hP >= 460) {
                                                                        Client client111111111117 = this.l;
                                                                        if (Client.hP <= 516) {
                                                                            if (this.l.fi == class_172.i) {
                                                                                this.e.f(461, i2);
                                                                            } else {
                                                                                this.d.f(461, i2);
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (this.l.fi == class_172.e) {
                                                                    this.e.f(aU.in_, i2);
                                                                } else {
                                                                    this.d.f(aU.in_, i2);
                                                                }
                                                            } else {
                                                                Client client111111111118 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client111111111119 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.g) {
                                                            this.e.f(335, i2);
                                                        } else {
                                                            this.d.f(335, i2);
                                                        }
                                                    } else {
                                                        Client client1111111111110 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client1111111111111 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client1111111111112 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client1111111111113 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client1111111111114 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111111115 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.d) {
                                                    this.e.f(aU.hT_, i2);
                                                } else {
                                                    this.d.f(aU.hT_, i2);
                                                }
                                            } else {
                                                Client client11214 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client11215 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client1111111111116 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client1111111111117 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client1111111111118 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client1111111111119 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client11111111111110 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111111111 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client11111111111112 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client11111111111113 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client11111111111114 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111111115 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client11111111111116 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111117 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.l.fi == class_172.c) {
                                            this.e.f(201, i2);
                                        } else {
                                            this.d.f(201, i2);
                                        }
                                    } else {
                                        Client client1212 = this.l;
                                        if (Client.hP >= 267) {
                                            Client client1213 = this.l;
                                            if (Client.hP <= 323) {
                                                Client client11216 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client11217 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client11111111111118 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client11111111111119 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client111111111111110 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client111111111111111 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client111111111111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client111111111111114 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client111111111111115 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client111111111111116 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111117 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client111111111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.d) {
                                                this.e.f(aU.hT_, i2);
                                            } else {
                                                this.d.f(aU.hT_, i2);
                                            }
                                        } else {
                                            Client client11218 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client11219 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client1111111111111110 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client1111111111111111 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client1111111111111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111111111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client1111111111111114 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111115 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client1111111111111116 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client1111111111111117 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client1111111111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111110 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client11111111111111111 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (this.l.fi == class_172.f) {
                                    this.e.f(135, i2);
                                } else {
                                    this.d.f(135, i2);
                                }
                            } else {
                                Client client1214 = this.l;
                                if (Client.hP >= 201) {
                                    Client client1215 = this.l;
                                    if (Client.hP <= 257) {
                                        Client client1216 = this.l;
                                        if (Client.hP >= 267) {
                                            Client client1217 = this.l;
                                            if (Client.hP <= 323) {
                                                Client client112110 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client112111 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client11111111111111112 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client11111111111111113 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client11111111111111114 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client11111111111111115 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client11111111111111116 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111111111117 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111118 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client11111111111111119 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client111111111111111110 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111111111 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client111111111111111112 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111113 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.d) {
                                                this.e.f(aU.hT_, i2);
                                            } else {
                                                this.d.f(aU.hT_, i2);
                                            }
                                        } else {
                                            Client client112112 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client112113 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client111111111111111114 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client111111111111111115 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client111111111111111116 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111111117 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client111111111111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client1111111111111111110 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client1111111111111111111 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client1111111111111111112 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111111113 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client1111111111111111114 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client1111111111111111115 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (this.l.fi == class_172.c) {
                                        this.e.f(201, i2);
                                    } else {
                                        this.d.f(201, i2);
                                    }
                                } else {
                                    Client client1218 = this.l;
                                    if (Client.hP >= 267) {
                                        Client client1219 = this.l;
                                        if (Client.hP <= 323) {
                                            Client client112114 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client112115 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client1111111111111111116 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client1111111111111111117 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client1111111111111111118 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111111111111119 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client11111111111111111110 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111111111111 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client11111111111111111112 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client11111111111111111113 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client11111111111111111114 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111111111115 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111111116 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client11111111111111111117 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.l.fi == class_172.d) {
                                            this.e.f(aU.hT_, i2);
                                        } else {
                                            this.d.f(aU.hT_, i2);
                                        }
                                    } else {
                                        Client client112116 = this.l;
                                        if (Client.hP >= 333) {
                                            Client client112117 = this.l;
                                            if (Client.hP <= 389) {
                                                Client client11111111111111111118 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client11111111111111111119 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client111111111111111111110 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client111111111111111111112 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111111111111113 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.g) {
                                                this.e.f(335, i2);
                                            } else {
                                                this.d.f(335, i2);
                                            }
                                        } else {
                                            Client client111111111111111111114 = this.l;
                                            if (Client.hP >= 400) {
                                                Client client111111111111111111115 = this.l;
                                                if (Client.hP <= 456) {
                                                    Client client111111111111111111116 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111111111111117 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.e) {
                                                    this.e.f(aU.in_, i2);
                                                } else {
                                                    this.d.f(aU.in_, i2);
                                                }
                                            } else {
                                                Client client111111111111111111118 = this.l;
                                                if (Client.hP >= 460) {
                                                    Client client111111111111111111119 = this.l;
                                                    if (Client.hP <= 516) {
                                                        if (this.l.fi == class_172.i) {
                                                            this.e.f(461, i2);
                                                        } else {
                                                            this.d.f(461, i2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.l.fi == class_172.b) {
                        this.e.f(4, i2);
                    } else {
                        this.d.f(4, i2);
                    }
                } else {
                    Client client22 = this.l;
                    if (Client.hP >= 69) {
                        Client client23 = this.l;
                        if (Client.hP <= 125) {
                            Client client24 = this.l;
                            if (Client.hP >= 135) {
                                Client client25 = this.l;
                                if (Client.hP <= 193) {
                                    Client client12110 = this.l;
                                    if (Client.hP >= 201) {
                                        Client client12111 = this.l;
                                        if (Client.hP <= 257) {
                                            Client client12112 = this.l;
                                            if (Client.hP >= 267) {
                                                Client client12113 = this.l;
                                                if (Client.hP <= 323) {
                                                    Client client112118 = this.l;
                                                    if (Client.hP >= 333) {
                                                        Client client112119 = this.l;
                                                        if (Client.hP <= 389) {
                                                            Client client1111111111111111111110 = this.l;
                                                            if (Client.hP >= 400) {
                                                                Client client1111111111111111111111 = this.l;
                                                                if (Client.hP <= 456) {
                                                                    Client client1111111111111111111112 = this.l;
                                                                    if (Client.hP >= 460) {
                                                                        Client client1111111111111111111113 = this.l;
                                                                        if (Client.hP <= 516) {
                                                                            if (this.l.fi == class_172.i) {
                                                                                this.e.f(461, i2);
                                                                            } else {
                                                                                this.d.f(461, i2);
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (this.l.fi == class_172.e) {
                                                                    this.e.f(aU.in_, i2);
                                                                } else {
                                                                    this.d.f(aU.in_, i2);
                                                                }
                                                            } else {
                                                                Client client1111111111111111111114 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client1111111111111111111115 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.g) {
                                                            this.e.f(335, i2);
                                                        } else {
                                                            this.d.f(335, i2);
                                                        }
                                                    } else {
                                                        Client client1111111111111111111116 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client1111111111111111111117 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client1111111111111111111118 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client1111111111111111111119 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client11111111111111111111110 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111111111111111111 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.d) {
                                                    this.e.f(aU.hT_, i2);
                                                } else {
                                                    this.d.f(aU.hT_, i2);
                                                }
                                            } else {
                                                Client client1121110 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client1121111 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client11111111111111111111112 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client11111111111111111111113 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client11111111111111111111114 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client11111111111111111111115 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client11111111111111111111116 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111111111111111117 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111111111118 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client11111111111111111111119 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client111111111111111111111110 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111111111111111 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client111111111111111111111112 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111113 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.l.fi == class_172.c) {
                                            this.e.f(201, i2);
                                        } else {
                                            this.d.f(201, i2);
                                        }
                                    } else {
                                        Client client12114 = this.l;
                                        if (Client.hP >= 267) {
                                            Client client12115 = this.l;
                                            if (Client.hP <= 323) {
                                                Client client1121112 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client1121113 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client111111111111111111111114 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client111111111111111111111115 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client111111111111111111111116 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client111111111111111111111117 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client111111111111111111111118 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111111111111119 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client1111111111111111111111110 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client1111111111111111111111111 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client1111111111111111111111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111111111111111111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client1111111111111111111111114 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111111111111115 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.d) {
                                                this.e.f(aU.hT_, i2);
                                            } else {
                                                this.d.f(aU.hT_, i2);
                                            }
                                        } else {
                                            Client client1121114 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client1121115 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client1111111111111111111111116 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client1111111111111111111111117 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client1111111111111111111111118 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111111111111111111119 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client11111111111111111111111110 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111111111111111111 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client11111111111111111111111112 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client11111111111111111111111113 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client11111111111111111111111114 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111111111111111115 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111111111111116 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client11111111111111111111111117 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (this.l.fi == class_172.f) {
                                    this.e.f(135, i2);
                                } else {
                                    this.d.f(135, i2);
                                }
                            } else {
                                Client client12116 = this.l;
                                if (Client.hP >= 201) {
                                    Client client12117 = this.l;
                                    if (Client.hP <= 257) {
                                        Client client12118 = this.l;
                                        if (Client.hP >= 267) {
                                            Client client12119 = this.l;
                                            if (Client.hP <= 323) {
                                                Client client1121116 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client1121117 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client11111111111111111111111118 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client11111111111111111111111119 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client111111111111111111111111110 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client111111111111111111111111111 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client111111111111111111111111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111111111111111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client111111111111111111111111114 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client111111111111111111111111115 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client111111111111111111111111116 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111111111111111117 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client111111111111111111111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.d) {
                                                this.e.f(aU.hT_, i2);
                                            } else {
                                                this.d.f(aU.hT_, i2);
                                            }
                                        } else {
                                            Client client1121118 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client1121119 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client1111111111111111111111111110 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client1111111111111111111111111111 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client1111111111111111111111111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111111111111111111111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client1111111111111111111111111114 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111111111111111115 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client1111111111111111111111111116 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client1111111111111111111111111117 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client1111111111111111111111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111111111111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111111111111111110 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client11111111111111111111111111111 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (this.l.fi == class_172.c) {
                                        this.e.f(201, i2);
                                    } else {
                                        this.d.f(201, i2);
                                    }
                                } else {
                                    Client client121110 = this.l;
                                    if (Client.hP >= 267) {
                                        Client client121111 = this.l;
                                        if (Client.hP <= 323) {
                                            Client client11211110 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client11211111 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client11111111111111111111111111112 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client11111111111111111111111111113 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client11111111111111111111111111114 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111111111111111111111115 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client11111111111111111111111111116 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111111111111111111117 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client11111111111111111111111111118 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client11111111111111111111111111119 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client111111111111111111111111111110 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111111111111 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client111111111111111111111111111112 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111111111111111111111113 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.l.fi == class_172.d) {
                                            this.e.f(aU.hT_, i2);
                                        } else {
                                            this.d.f(aU.hT_, i2);
                                        }
                                    } else {
                                        Client client11211112 = this.l;
                                        if (Client.hP >= 333) {
                                            Client client11211113 = this.l;
                                            if (Client.hP <= 389) {
                                                Client client111111111111111111111111111114 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client111111111111111111111111111115 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client111111111111111111111111111116 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111111111117 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client111111111111111111111111111118 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111111111111111111111119 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.g) {
                                                this.e.f(335, i2);
                                            } else {
                                                this.d.f(335, i2);
                                            }
                                        } else {
                                            Client client1111111111111111111111111111110 = this.l;
                                            if (Client.hP >= 400) {
                                                Client client1111111111111111111111111111111 = this.l;
                                                if (Client.hP <= 456) {
                                                    Client client1111111111111111111111111111112 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client1111111111111111111111111111113 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.e) {
                                                    this.e.f(aU.in_, i2);
                                                } else {
                                                    this.d.f(aU.in_, i2);
                                                }
                                            } else {
                                                Client client1111111111111111111111111111114 = this.l;
                                                if (Client.hP >= 460) {
                                                    Client client1111111111111111111111111111115 = this.l;
                                                    if (Client.hP <= 516) {
                                                        if (this.l.fi == class_172.i) {
                                                            this.e.f(461, i2);
                                                        } else {
                                                            this.d.f(461, i2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (this.l.fi == class_172.h) {
                            this.e.f(69, i2);
                        } else {
                            this.d.f(69, i2);
                        }
                    } else {
                        Client client26 = this.l;
                        if (Client.hP >= 135) {
                            Client client27 = this.l;
                            if (Client.hP <= 193) {
                                Client client121112 = this.l;
                                if (Client.hP >= 201) {
                                    Client client121113 = this.l;
                                    if (Client.hP <= 257) {
                                        Client client121114 = this.l;
                                        if (Client.hP >= 267) {
                                            Client client121115 = this.l;
                                            if (Client.hP <= 323) {
                                                Client client11211114 = this.l;
                                                if (Client.hP >= 333) {
                                                    Client client11211115 = this.l;
                                                    if (Client.hP <= 389) {
                                                        Client client1111111111111111111111111111116 = this.l;
                                                        if (Client.hP >= 400) {
                                                            Client client1111111111111111111111111111117 = this.l;
                                                            if (Client.hP <= 456) {
                                                                Client client1111111111111111111111111111118 = this.l;
                                                                if (Client.hP >= 460) {
                                                                    Client client1111111111111111111111111111119 = this.l;
                                                                    if (Client.hP <= 516) {
                                                                        if (this.l.fi == class_172.i) {
                                                                            this.e.f(461, i2);
                                                                        } else {
                                                                            this.d.f(461, i2);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (this.l.fi == class_172.e) {
                                                                this.e.f(aU.in_, i2);
                                                            } else {
                                                                this.d.f(aU.in_, i2);
                                                            }
                                                        } else {
                                                            Client client11111111111111111111111111111110 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111111111111111111111111111 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.g) {
                                                        this.e.f(335, i2);
                                                    } else {
                                                        this.d.f(335, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111111111111111111112 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client11111111111111111111111111111113 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client11111111111111111111111111111114 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client11111111111111111111111111111115 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client11111111111111111111111111111116 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111111111111111111111117 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.d) {
                                                this.e.f(aU.hT_, i2);
                                            } else {
                                                this.d.f(aU.hT_, i2);
                                            }
                                        } else {
                                            Client client11211116 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client11211117 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client11111111111111111111111111111118 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client11111111111111111111111111111119 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client111111111111111111111111111111110 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111111111111111111111111 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client111111111111111111111111111111112 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111111111111113 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client111111111111111111111111111111114 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client111111111111111111111111111111115 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client111111111111111111111111111111116 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111111111111117 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client111111111111111111111111111111118 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111111111111111111111111119 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (this.l.fi == class_172.c) {
                                        this.e.f(201, i2);
                                    } else {
                                        this.d.f(201, i2);
                                    }
                                } else {
                                    Client client121116 = this.l;
                                    if (Client.hP >= 267) {
                                        Client client121117 = this.l;
                                        if (Client.hP <= 323) {
                                            Client client11211118 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client11211119 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client1111111111111111111111111111111110 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client1111111111111111111111111111111111 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client1111111111111111111111111111111112 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client1111111111111111111111111111111113 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client1111111111111111111111111111111114 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111111111111111111111115 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client1111111111111111111111111111111116 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client1111111111111111111111111111111117 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client1111111111111111111111111111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111111111111111111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111111111111111111111110 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client11111111111111111111111111111111111 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.l.fi == class_172.d) {
                                            this.e.f(aU.hT_, i2);
                                        } else {
                                            this.d.f(aU.hT_, i2);
                                        }
                                    } else {
                                        Client client112111110 = this.l;
                                        if (Client.hP >= 333) {
                                            Client client112111111 = this.l;
                                            if (Client.hP <= 389) {
                                                Client client11111111111111111111111111111111112 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client11111111111111111111111111111111113 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client11111111111111111111111111111111114 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client11111111111111111111111111111111115 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111111111111111111111116 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client11111111111111111111111111111111117 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.g) {
                                                this.e.f(335, i2);
                                            } else {
                                                this.d.f(335, i2);
                                            }
                                        } else {
                                            Client client11111111111111111111111111111111118 = this.l;
                                            if (Client.hP >= 400) {
                                                Client client11111111111111111111111111111111119 = this.l;
                                                if (Client.hP <= 456) {
                                                    Client client111111111111111111111111111111111110 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111111111111111111111111111111 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.e) {
                                                    this.e.f(aU.in_, i2);
                                                } else {
                                                    this.d.f(aU.in_, i2);
                                                }
                                            } else {
                                                Client client111111111111111111111111111111111112 = this.l;
                                                if (Client.hP >= 460) {
                                                    Client client111111111111111111111111111111111113 = this.l;
                                                    if (Client.hP <= 516) {
                                                        if (this.l.fi == class_172.i) {
                                                            this.e.f(461, i2);
                                                        } else {
                                                            this.d.f(461, i2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (this.l.fi == class_172.f) {
                                this.e.f(135, i2);
                            } else {
                                this.d.f(135, i2);
                            }
                        } else {
                            Client client121118 = this.l;
                            if (Client.hP >= 201) {
                                Client client121119 = this.l;
                                if (Client.hP <= 257) {
                                    Client client1211110 = this.l;
                                    if (Client.hP >= 267) {
                                        Client client1211111 = this.l;
                                        if (Client.hP <= 323) {
                                            Client client112111112 = this.l;
                                            if (Client.hP >= 333) {
                                                Client client112111113 = this.l;
                                                if (Client.hP <= 389) {
                                                    Client client111111111111111111111111111111111114 = this.l;
                                                    if (Client.hP >= 400) {
                                                        Client client111111111111111111111111111111111115 = this.l;
                                                        if (Client.hP <= 456) {
                                                            Client client111111111111111111111111111111111116 = this.l;
                                                            if (Client.hP >= 460) {
                                                                Client client111111111111111111111111111111111117 = this.l;
                                                                if (Client.hP <= 516) {
                                                                    if (this.l.fi == class_172.i) {
                                                                        this.e.f(461, i2);
                                                                    } else {
                                                                        this.d.f(461, i2);
                                                                    }
                                                                }
                                                            }
                                                        } else if (this.l.fi == class_172.e) {
                                                            this.e.f(aU.in_, i2);
                                                        } else {
                                                            this.d.f(aU.in_, i2);
                                                        }
                                                    } else {
                                                        Client client111111111111111111111111111111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111111111111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.g) {
                                                    this.e.f(335, i2);
                                                } else {
                                                    this.d.f(335, i2);
                                                }
                                            } else {
                                                Client client1111111111111111111111111111111111110 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client1111111111111111111111111111111111111 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client1111111111111111111111111111111111112 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111111111111111111111111113 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client1111111111111111111111111111111111114 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client1111111111111111111111111111111111115 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.l.fi == class_172.d) {
                                            this.e.f(aU.hT_, i2);
                                        } else {
                                            this.d.f(aU.hT_, i2);
                                        }
                                    } else {
                                        Client client112111114 = this.l;
                                        if (Client.hP >= 333) {
                                            Client client112111115 = this.l;
                                            if (Client.hP <= 389) {
                                                Client client1111111111111111111111111111111111116 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client1111111111111111111111111111111111117 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client1111111111111111111111111111111111118 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client1111111111111111111111111111111111119 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client11111111111111111111111111111111111110 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client11111111111111111111111111111111111111 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.g) {
                                                this.e.f(335, i2);
                                            } else {
                                                this.d.f(335, i2);
                                            }
                                        } else {
                                            Client client11111111111111111111111111111111111112 = this.l;
                                            if (Client.hP >= 400) {
                                                Client client11111111111111111111111111111111111113 = this.l;
                                                if (Client.hP <= 456) {
                                                    Client client11111111111111111111111111111111111114 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client11111111111111111111111111111111111115 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.e) {
                                                    this.e.f(aU.in_, i2);
                                                } else {
                                                    this.d.f(aU.in_, i2);
                                                }
                                            } else {
                                                Client client11111111111111111111111111111111111116 = this.l;
                                                if (Client.hP >= 460) {
                                                    Client client11111111111111111111111111111111111117 = this.l;
                                                    if (Client.hP <= 516) {
                                                        if (this.l.fi == class_172.i) {
                                                            this.e.f(461, i2);
                                                        } else {
                                                            this.d.f(461, i2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (this.l.fi == class_172.c) {
                                    this.e.f(201, i2);
                                } else {
                                    this.d.f(201, i2);
                                }
                            } else {
                                Client client1211112 = this.l;
                                if (Client.hP >= 267) {
                                    Client client1211113 = this.l;
                                    if (Client.hP <= 323) {
                                        Client client112111116 = this.l;
                                        if (Client.hP >= 333) {
                                            Client client112111117 = this.l;
                                            if (Client.hP <= 389) {
                                                Client client11111111111111111111111111111111111118 = this.l;
                                                if (Client.hP >= 400) {
                                                    Client client11111111111111111111111111111111111119 = this.l;
                                                    if (Client.hP <= 456) {
                                                        Client client111111111111111111111111111111111111110 = this.l;
                                                        if (Client.hP >= 460) {
                                                            Client client111111111111111111111111111111111111111 = this.l;
                                                            if (Client.hP <= 516) {
                                                                if (this.l.fi == class_172.i) {
                                                                    this.e.f(461, i2);
                                                                } else {
                                                                    this.d.f(461, i2);
                                                                }
                                                            }
                                                        }
                                                    } else if (this.l.fi == class_172.e) {
                                                        this.e.f(aU.in_, i2);
                                                    } else {
                                                        this.d.f(aU.in_, i2);
                                                    }
                                                } else {
                                                    Client client111111111111111111111111111111111111112 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111111111111111111111111111111113 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.g) {
                                                this.e.f(335, i2);
                                            } else {
                                                this.d.f(335, i2);
                                            }
                                        } else {
                                            Client client111111111111111111111111111111111111114 = this.l;
                                            if (Client.hP >= 400) {
                                                Client client111111111111111111111111111111111111115 = this.l;
                                                if (Client.hP <= 456) {
                                                    Client client111111111111111111111111111111111111116 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client111111111111111111111111111111111111117 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.e) {
                                                    this.e.f(aU.in_, i2);
                                                } else {
                                                    this.d.f(aU.in_, i2);
                                                }
                                            } else {
                                                Client client111111111111111111111111111111111111118 = this.l;
                                                if (Client.hP >= 460) {
                                                    Client client111111111111111111111111111111111111119 = this.l;
                                                    if (Client.hP <= 516) {
                                                        if (this.l.fi == class_172.i) {
                                                            this.e.f(461, i2);
                                                        } else {
                                                            this.d.f(461, i2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (this.l.fi == class_172.d) {
                                        this.e.f(aU.hT_, i2);
                                    } else {
                                        this.d.f(aU.hT_, i2);
                                    }
                                } else {
                                    Client client112111118 = this.l;
                                    if (Client.hP >= 333) {
                                        Client client112111119 = this.l;
                                        if (Client.hP <= 389) {
                                            Client client1111111111111111111111111111111111111110 = this.l;
                                            if (Client.hP >= 400) {
                                                Client client1111111111111111111111111111111111111111 = this.l;
                                                if (Client.hP <= 456) {
                                                    Client client1111111111111111111111111111111111111112 = this.l;
                                                    if (Client.hP >= 460) {
                                                        Client client1111111111111111111111111111111111111113 = this.l;
                                                        if (Client.hP <= 516) {
                                                            if (this.l.fi == class_172.i) {
                                                                this.e.f(461, i2);
                                                            } else {
                                                                this.d.f(461, i2);
                                                            }
                                                        }
                                                    }
                                                } else if (this.l.fi == class_172.e) {
                                                    this.e.f(aU.in_, i2);
                                                } else {
                                                    this.d.f(aU.in_, i2);
                                                }
                                            } else {
                                                Client client1111111111111111111111111111111111111114 = this.l;
                                                if (Client.hP >= 460) {
                                                    Client client1111111111111111111111111111111111111115 = this.l;
                                                    if (Client.hP <= 516) {
                                                        if (this.l.fi == class_172.i) {
                                                            this.e.f(461, i2);
                                                        } else {
                                                            this.d.f(461, i2);
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.l.fi == class_172.g) {
                                            this.e.f(335, i2);
                                        } else {
                                            this.d.f(335, i2);
                                        }
                                    } else {
                                        Client client1111111111111111111111111111111111111116 = this.l;
                                        if (Client.hP >= 400) {
                                            Client client1111111111111111111111111111111111111117 = this.l;
                                            if (Client.hP <= 456) {
                                                Client client1111111111111111111111111111111111111118 = this.l;
                                                if (Client.hP >= 460) {
                                                    Client client1111111111111111111111111111111111111119 = this.l;
                                                    if (Client.hP <= 516) {
                                                        if (this.l.fi == class_172.i) {
                                                            this.e.f(461, i2);
                                                        } else {
                                                            this.d.f(461, i2);
                                                        }
                                                    }
                                                }
                                            } else if (this.l.fi == class_172.e) {
                                                this.e.f(aU.in_, i2);
                                            } else {
                                                this.d.f(aU.in_, i2);
                                            }
                                        } else {
                                            Client client11111111111111111111111111111111111111110 = this.l;
                                            if (Client.hP >= 460) {
                                                Client client11111111111111111111111111111111111111111 = this.l;
                                                if (Client.hP <= 516) {
                                                    if (this.l.fi == class_172.i) {
                                                        this.e.f(461, i2);
                                                    } else {
                                                        this.d.f(461, i2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Client client28 = this.l;
        Client.gh.a(true, 26, class_492.c, C[0], 157 + i);
        Client client29 = this.l;
        Client.gh.a(true, 85, class_492.c, C[1], 152 + i);
        Client client30 = this.l;
        Client.gh.a(true, 92 + 63, class_492.c, C[2], 152 + i);
        Client client31 = this.l;
        Client.gh.a(true, 152 + 63, class_492.c, C[3], 152 + i);
        Client client32 = this.l;
        Client.gh.a(true, 214 + 63, class_492.c, C[4], 152 + i);
        Client client33 = this.l;
        Client.gh.a(true, 288 + 63, class_492.c, C[5], 152 + i);
        Client client34 = this.l;
        Client.gh.a(true, aU.ij_ + 63, class_492.c, C[6], 152 + i);
        Client client35 = this.l;
        Client.gh.a(true, g.c + 63, class_492.c, C[7], 152 + i);
        Client client36 = this.l;
        Client.gh.a(E[this.l.gx], 97, D[this.l.gx], 162 + i, true);
        Client client37 = this.l;
        Client.gh.a(E[this.l.gw], 63 + 100, D[this.l.gw], 162 + i, true);
        Client client38 = this.l;
        Client.gh.a(E[this.l.gu], 63 + 166, D[this.l.gu], 162 + i, true);
        Client client39 = this.l;
        Client.gh.a(E[this.l.cE], 63 + aU.hK_, D[this.l.cE], 162 + i, true);
        Client client40 = this.l;
        Client.gh.a(E[this.l.gy], 63 + aU.ia_, D[this.l.gy], 162 + i, true);
        Client client41 = this.l;
        Client.gh.a(E[this.l.fZ], 63 + 364, D[this.l.fZ], 162 + i, true);
        Client client42 = this.l;
        Client.gh.a(E[this.l.gv], 63 + 364 + 61, D[this.l.gv], 162 + i, true);
    }

    private void l() {
        int i;
        int i2 = 524;
        if (Configuration.ai != class_151.a) {
            i2 = (5 + Client.ai) - aU.ht_;
            i = -4;
        } else {
            i = (-3) - 2;
        }
        int iA = this.l.a(Widget.H[4016], 0);
        int iA2 = (int) ((((double) iA) / ((double) this.l.a(Widget.H[4017], 0))) * 100.0d);
        double dCurrentTimeMillis = 1.0d;
        if (iA < 99) {
            dCurrentTimeMillis = (System.currentTimeMillis() - this.k) / 60000.0d;
        }
        int iE = e(iA2);
        if (iE != this.t) {
            this.p = new class_333("orbs/orb_drain", 27, iE);
            this.t = iE;
        }
        this.b[1].f((-2) + i2, 44 + i);
        int i3 = this.b[2].n == 28 ? 0 : 2;
        this.b[2].f(25 + i2 + i3, 48 + i + i3);
        this.p.f(25 + i2, 48 + i);
        this.b[3].f(31 + i2, 55 + i);
        Client client = this.l;
        Client.gh.a(d(iA2), 15 + i2, iA, 71 + i, true);
        if (iA < 99) {
            a((Graphics2D) this.l.gZ.e.getGraphics(), i2 - 1, 46 + i, dCurrentTimeMillis, z);
        }
    }

    public void c() {
        this.b[4] = new class_333(this.l.cp ? "orbs/pray_fill_active" : "orbs/pray_fill");
    }

    private void m() {
        int i;
        int i2 = 524;
        if (Configuration.ai != class_151.a) {
            i2 = (5 + Client.ai) - aU.ht_;
            i = 28;
        } else {
            i = 39 - 11;
        }
        int iA = this.l.a(Widget.H[4012], 0);
        int iA2 = (int) ((((double) iA) / ((double) this.l.a(Widget.H[4013], 0))) * 100.0d);
        int iE = e(iA2);
        if (iE != this.v) {
            this.q = new class_333("orbs/orb_drain", 27, e(iA2));
            this.v = iE;
        }
        boolean z2 = false;
        if (Configuration.ai == class_151.b) {
            Client client = this.l;
            if (Client.hQ >= 75) {
                Client client2 = this.l;
                if (Client.hQ <= 107) {
                    Client client3 = this.l;
                    int i3 = Client.hP;
                    Client client4 = this.l;
                    if (i3 >= (Client.ai - 192) - 20) {
                        Client client5 = this.l;
                        int i4 = Client.hP;
                        Client client6 = this.l;
                        if (i4 <= (Client.ai - 133) - 20) {
                            z2 = true;
                        }
                    }
                }
            }
        } else {
            Client client7 = this.l;
            if (Client.hQ >= 75) {
                Client client8 = this.l;
                if (Client.hQ <= 107) {
                    Client client9 = this.l;
                    if (Client.hP >= 518) {
                        Client client10 = this.l;
                        if (Client.hP <= 575) {
                            z2 = true;
                        }
                    }
                }
            }
        }
        this.b[z2 ? '\n' : (char) 1].f((-2) + i2, 44 + i);
        this.b[4].f(25 + i2, 48 + i);
        this.q.f(25 + i2, 48 + i);
        this.b[5].f(28 + i2, 51 + i);
        Client client11 = this.l;
        Client.gh.a(d(iA2), 15 + i2, iA, 71 + i, true);
    }

    private void n() {
        int i;
        int i2;
        if (Configuration.ai != class_151.a) {
            i = ((23 + Client.ai) - aU.ht_) - 5;
            i2 = 60;
        } else {
            i = aU.iA_ - 10;
            i2 = 76 - 15;
        }
        int iA = 0;
        if (Widget.H[149].as.length() > 0) {
            for (int i3 = 0; i3 < Widget.H[149].as.length() - 1; i3++) {
                iA = class_324.a(iA, Widget.H[149].as.charAt(i3));
            }
        }
        int i4 = (int) ((((double) iA) / 100.0d) * 100.0d);
        int iE = e(i4);
        if (iE != this.u) {
            this.r = new class_333("orbs/orb_drain", 27, iE);
            this.u = iE;
        }
        boolean z2 = false;
        if (Configuration.ai == class_151.b) {
            Client client = this.l;
            if (Client.hQ >= 120) {
                Client client2 = this.l;
                if (Client.hQ <= 153) {
                    Client client3 = this.l;
                    int i5 = Client.hP;
                    Client client4 = this.l;
                    if (i5 >= Client.ai - 192) {
                        Client client5 = this.l;
                        int i6 = Client.hP;
                        Client client6 = this.l;
                        if (i6 <= Client.ai - 133) {
                            z2 = true;
                        }
                    }
                }
            }
        } else {
            Client client7 = this.l;
            if (Client.hQ >= 109) {
                Client client8 = this.l;
                if (Client.hQ <= 142) {
                    Client client9 = this.l;
                    if (Client.hP >= 540) {
                        Client client10 = this.l;
                        if (Client.hP <= 575) {
                            z2 = true;
                        }
                    }
                }
            }
        }
        boolean z3 = this.l.dP[173] == 1 && i4 > 0;
        char c = !z3 ? (char) 7 : '\t';
        if (this.i) {
            c = 19;
        }
        this.b[z2 ? '\n' : (char) 1].f((-2) + i, 44 + i2);
        this.b[!z3 ? (char) 6 : '\b'].f(25 + i, 48 + i2);
        this.r.f(25 + i, 48 + i2);
        this.b[c].f(31 + i, 52 + i2);
        Client client11 = this.l;
        Client.gh.a(d(i4), 15 + i, iA, 71 + i2, true);
    }

    public void d() {
        this.j = System.currentTimeMillis();
        this.k = System.currentTimeMillis();
    }

    private void o() {
        int i;
        int i2;
        int i3 = 183;
        Client client = this.l;
        if (!Client.ag()) {
            i3 = 183 + 516;
        }
        double d = Client.F;
        double dCurrentTimeMillis = 1.0d;
        int i4 = (int) ((d / 10.0d) * 100.0d);
        if (d < 10.0d) {
            dCurrentTimeMillis = (System.currentTimeMillis() - this.j) / 30000.0d;
        }
        String str = ((int) (d * 10.0d));
        int iE = e(i4);
        if (this.w != iE) {
            this.s = new class_333("orbs/orb_drain", 27, iE);
            this.w = iE;
        }
        if (Configuration.ai != class_151.a) {
            i = i3 + (Client.ai - aU.il_);
            i2 = (-30) + 118;
        } else {
            i = i3 - 148;
            i2 = (-30) + 119;
        }
        this.b[1].f((-2) + i, 44 + i2);
        this.b[27].f(26 + i, 48 + i2);
        this.s.f(25 + i, 48 + i2);
        this.b[28].f(31 + i, 53 + i2);
        Client client2 = this.l;
        Client.gh.a(d(i4), 14 + i, str, 71 + i2, true);
        if (i4 < 100) {
            a((Graphics2D) this.l.gZ.e.getGraphics(), i - 1, 46 + i2, dCurrentTimeMillis, A);
        }
    }

    private void p() {
        int i = 524;
        int i2 = 22;
        if (Configuration.ai != class_151.a) {
            i = ((5 + Client.ai) - 25) - 2;
            i2 = 152;
        }
        boolean z2 = false;
        if (Configuration.ai == class_151.b) {
            Client client = this.l;
            if (Client.hQ >= 154) {
                Client client2 = this.l;
                if (Client.hQ <= 173) {
                    Client client3 = this.l;
                    int i3 = Client.hP;
                    Client client4 = this.l;
                    if (i3 >= Client.ai - 23) {
                        Client client5 = this.l;
                        int i4 = Client.hP;
                        Client client6 = this.l;
                        if (i4 <= Client.ai - 6) {
                            z2 = true;
                        }
                    }
                }
            }
        } else {
            Client client7 = this.l;
            if (Client.hQ >= 25) {
                Client client8 = this.l;
                if (Client.hQ <= 43) {
                    Client client9 = this.l;
                    if (Client.hP >= 515) {
                        Client client10 = this.l;
                        if (Client.hP <= 545) {
                            z2 = true;
                        }
                    }
                }
            }
        }
        this.b[z2 ? '\f' : (char) 11].f(i, i2);
        if (this.n > 0) {
            this.b[f() ? '\r' : (char) 14].f(i, i2);
        }
    }

    private void q() {
        if (Configuration.v) {
            int i = 742;
            int i2 = 8;
            if (Launcher.n() == null) {
                return;
            }
            if (Configuration.ai != class_151.a) {
                i = (223 + Client.ai) - User32.VK_OEM_BACKTAB;
                i2 = 183;
            }
            boolean z2 = false;
            if (Configuration.ai == class_151.b) {
                Client client = this.l;
                if (Client.hQ >= 186) {
                    Client client2 = this.l;
                    if (Client.hQ <= 205) {
                        Client client3 = this.l;
                        int i3 = Client.hP;
                        Client client4 = this.l;
                        if (i3 >= Client.ai - 23) {
                            Client client5 = this.l;
                            int i4 = Client.hP;
                            Client client6 = this.l;
                            if (i4 <= Client.ai - 6) {
                                z2 = true;
                            }
                        }
                    }
                }
            } else {
                Client client7 = this.l;
                if (Client.hQ >= 11) {
                    Client client8 = this.l;
                    if (Client.hQ <= 30) {
                        Client client9 = this.l;
                        if (Client.hP >= 736) {
                            Client client10 = this.l;
                            if (Client.hP <= 757) {
                                z2 = true;
                                Client client11 = this.l;
                                Client client12 = this.l;
                                int i5 = Client.hP - 50;
                                Client client13 = this.l;
                                client11.b(i5, Client.hQ + 15, " Side panel");
                            }
                        }
                    }
                }
            }
            this.b[z2 ? '\f' : (char) 11].c(i, i2);
            this.b[Launcher.e() ? (char) 16 : (char) 15].c(i, i2);
        }
    }

    private void r() {
        int i = 747;
        int i2 = 114;
        if (Configuration.ai != class_151.a) {
            if (Client.ah <= 670) {
                i = 228 + (Client.ai - 275);
                i2 = 87 + 77;
            } else {
                i = 228 + (Client.ai - User32.VK_PLAY);
                i2 = 87 + 228;
            }
        }
        boolean z2 = false;
        if (Configuration.ai != class_151.b) {
            Client client = this.l;
            if (Client.hQ >= 116) {
                Client client2 = this.l;
                if (Client.hQ <= 134) {
                    Client client3 = this.l;
                    if (Client.hP >= 744) {
                        Client client4 = this.l;
                        if (Client.hP <= 759) {
                            z2 = true;
                            Client client5 = this.l;
                            Client client6 = this.l;
                            client5.b(180, Client.hQ, " Bank all items");
                        }
                    }
                }
            }
        } else if (Client.ah <= 670) {
            Client client7 = this.l;
            if (Client.hQ >= 166) {
                Client client8 = this.l;
                if (Client.hQ <= 182) {
                    Client client9 = this.l;
                    int i3 = Client.hP;
                    Client client10 = this.l;
                    if (i3 >= (Client.ai - 23) - 23) {
                        Client client11 = this.l;
                        int i4 = Client.hP;
                        Client client12 = this.l;
                        if (i4 <= (Client.ai - 6) - 23) {
                            z2 = true;
                            Client client13 = this.l;
                            Client client14 = this.l;
                            int i5 = Client.hP - 25;
                            Client client15 = this.l;
                            client13.b(i5, Client.hQ - 15, " Bank all items");
                        }
                    }
                }
            }
        } else {
            Client client16 = this.l;
            if (Client.hQ >= 313) {
                Client client17 = this.l;
                if (Client.hQ <= 333) {
                    Client client18 = this.l;
                    int i6 = Client.hP;
                    Client client19 = this.l;
                    if (i6 >= Client.ai - 23) {
                        Client client20 = this.l;
                        int i7 = Client.hP;
                        Client client21 = this.l;
                        if (i7 <= Client.ai - 6) {
                            z2 = true;
                            Client client22 = this.l;
                            Client client23 = this.l;
                            int i8 = Client.hP - 25;
                            Client client24 = this.l;
                            client22.b(i8, Client.hQ - 15, " Bank all items");
                        }
                    }
                }
            }
        }
        this.b[z2 ? '\f' : (char) 11].f(i, i2);
        this.b[21].c(i, i2 + 4);
    }

    private void s() {
        int i = 747;
        int i2 = 87;
        if (Configuration.ai != class_151.a) {
            i = aU.ho_ + (Client.ai - User32.VK_ICO_HELP);
            i2 = 140 + 76;
        }
        boolean z2 = false;
        if (Configuration.ai == class_151.b) {
            Client client = this.l;
            if (Client.hQ >= 219) {
                Client client2 = this.l;
                if (Client.hQ <= 238) {
                    Client client3 = this.l;
                    int i3 = Client.hP;
                    Client client4 = this.l;
                    if (i3 >= Client.ai - 23) {
                        Client client5 = this.l;
                        int i4 = Client.hP;
                        Client client6 = this.l;
                        if (i4 <= Client.ai - 6) {
                            z2 = true;
                            Client client7 = this.l;
                            Client client8 = this.l;
                            int i5 = Client.hP - 25;
                            Client client9 = this.l;
                            client7.b(i5, Client.hQ - 15, " Epic bosses");
                        }
                    }
                }
            }
        } else {
            Client client10 = this.l;
            if (Client.hQ >= 89) {
                Client client11 = this.l;
                if (Client.hQ <= 107) {
                    Client client12 = this.l;
                    if (Client.hP >= 744) {
                        Client client13 = this.l;
                        if (Client.hP <= 759) {
                            z2 = true;
                            Client client14 = this.l;
                            Client client15 = this.l;
                            client14.b(180, Client.hQ, " Epic bosses");
                        }
                    }
                }
            }
        }
        this.b[z2 ? '\f' : (char) 11].f(i, i2);
        this.b[20].f(i, i2);
    }

    private void t() {
        int i = 724;
        int i2 = 140;
        if (Configuration.ai != class_151.a) {
            if (Client.ah <= 649) {
                i = 228 + (Client.ai - 275);
                i2 = 114 + 76;
            } else {
                i = 228 + (Client.ai - User32.VK_PLAY);
                i2 = 114 + 168;
            }
        }
        boolean z2 = false;
        if (Configuration.ai != class_151.b) {
            Client client = this.l;
            if (Client.hQ >= 141) {
                Client client2 = this.l;
                if (Client.hQ <= 161) {
                    Client client3 = this.l;
                    if (Client.hP >= 721) {
                        Client client4 = this.l;
                        if (Client.hP <= 736) {
                            z2 = true;
                            Client client5 = this.l;
                            Client client6 = this.l;
                            client5.b(180, Client.hQ, " Heal");
                        }
                    }
                }
            }
        } else if (Client.ah <= 649) {
            Client client7 = this.l;
            if (Client.hQ >= 192) {
                Client client8 = this.l;
                if (Client.hQ <= 211) {
                    Client client9 = this.l;
                    int i3 = Client.hP;
                    Client client10 = this.l;
                    if (i3 >= (Client.ai - 23) - 23) {
                        Client client11 = this.l;
                        int i4 = Client.hP;
                        Client client12 = this.l;
                        if (i4 <= (Client.ai - 6) - 23) {
                            z2 = true;
                            Client client13 = this.l;
                            Client client14 = this.l;
                            int i5 = Client.hP - 25;
                            Client client15 = this.l;
                            client13.b(i5, Client.hQ - 15, " Heal");
                        }
                    }
                }
            }
        } else {
            Client client16 = this.l;
            if (Client.hQ >= 281) {
                Client client17 = this.l;
                if (Client.hQ <= 301) {
                    Client client18 = this.l;
                    int i6 = Client.hP;
                    Client client19 = this.l;
                    if (i6 >= Client.ai - 23) {
                        Client client20 = this.l;
                        int i7 = Client.hP;
                        Client client21 = this.l;
                        if (i7 <= Client.ai - 6) {
                            z2 = true;
                            Client client22 = this.l;
                            Client client23 = this.l;
                            int i8 = Client.hP - 25;
                            Client client24 = this.l;
                            client22.b(i8, Client.hQ - 15, " Heal");
                        }
                    }
                }
            }
        }
        this.b[z2 ? '\f' : (char) 11].f(i, i2);
        this.b[17].f(i + 1, i2 + 5);
    }

    private void u() {
        int i = 747;
        int i2 = 140;
        if (Configuration.ai != class_151.a) {
            if (Client.ah <= 609) {
                i = 228 + (Client.ai - 275);
                i2 = 140 + 76;
            } else {
                i = 228 + (Client.ai - User32.VK_PLAY);
                i2 = 140 + 108;
            }
        }
        boolean z2 = false;
        if (Configuration.ai != class_151.b) {
            Client client = this.l;
            if (Client.hQ >= 141) {
                Client client2 = this.l;
                if (Client.hQ <= 161) {
                    Client client3 = this.l;
                    if (Client.hP >= 744) {
                        Client client4 = this.l;
                        if (Client.hP <= 759) {
                            z2 = true;
                            Client client5 = this.l;
                            Client client6 = this.l;
                            client5.b(180, Client.hQ, " Refill potions");
                        }
                    }
                }
            }
        } else if (Client.ah <= 609) {
            Client client7 = this.l;
            if (Client.hQ >= 219) {
                Client client8 = this.l;
                if (Client.hQ <= 238) {
                    Client client9 = this.l;
                    int i3 = Client.hP;
                    Client client10 = this.l;
                    if (i3 >= (Client.ai - 23) - 23) {
                        Client client11 = this.l;
                        int i4 = Client.hP;
                        Client client12 = this.l;
                        if (i4 <= (Client.ai - 6) - 23) {
                            z2 = true;
                            Client client13 = this.l;
                            Client client14 = this.l;
                            int i5 = Client.hP - 15;
                            Client client15 = this.l;
                            client13.b(i5, Client.hQ - 15, " Refill potions");
                        }
                    }
                }
            }
        } else {
            Client client16 = this.l;
            if (Client.hQ >= 250) {
                Client client17 = this.l;
                if (Client.hQ <= 269) {
                    Client client18 = this.l;
                    int i6 = Client.hP;
                    Client client19 = this.l;
                    if (i6 >= Client.ai - 23) {
                        Client client20 = this.l;
                        int i7 = Client.hP;
                        Client client21 = this.l;
                        if (i7 <= Client.ai - 6) {
                            z2 = true;
                            Client client22 = this.l;
                            Client client23 = this.l;
                            int i8 = Client.hP - 15;
                            Client client24 = this.l;
                            client22.b(i8, Client.hQ - 15, " Refill potions");
                        }
                    }
                }
            }
        }
        this.b[z2 ? '\f' : (char) 11].f(i, i2);
        this.b[18].f(i, i2 + 4);
    }

    private int d(int i) {
        if (i >= 75) {
            return bk.ao;
        }
        if (i < 50 || i > 74) {
            return (i < 25 || i > 49) ? bk.aS : class_492.e;
        }
        return class_492.g;
    }

    private int e(int i) {
        if (i <= 100 && i >= 97) {
            return 0;
        }
        if (i <= 96 && i >= 93) {
            return 1;
        }
        if (i <= 92 && i >= 89) {
            return 2;
        }
        if (i <= 88 && i >= 85) {
            return 3;
        }
        if (i <= 84 && i >= 81) {
            return 4;
        }
        if (i <= 80 && i >= 77) {
            return 5;
        }
        if (i <= 76 && i >= 73) {
            return 6;
        }
        if (i <= 72 && i >= 69) {
            return 7;
        }
        if (i <= 68 && i >= 65) {
            return 8;
        }
        if (i <= 64 && i >= 61) {
            return 9;
        }
        if (i <= 60 && i >= 57) {
            return 10;
        }
        if (i <= 56 && i >= 53) {
            return 11;
        }
        if (i <= 52 && i >= 49) {
            return 12;
        }
        if (i <= 48 && i >= 45) {
            return 13;
        }
        if (i <= 44 && i >= 41) {
            return 14;
        }
        if (i <= 40 && i >= 37) {
            return 15;
        }
        if (i <= 36 && i >= 33) {
            return 16;
        }
        if (i <= 32 && i >= 29) {
            return 17;
        }
        if (i <= 28 && i >= 25) {
            return 18;
        }
        if (i <= 24 && i >= 21) {
            return 19;
        }
        if (i <= 20 && i >= 17) {
            return 20;
        }
        if (i <= 16 && i >= 13) {
            return 21;
        }
        if (i <= 12 && i >= 9) {
            return 22;
        }
        if (i <= 8 && i >= 7) {
            return 23;
        }
        if (i <= 6 && i >= 5) {
            return 24;
        }
        if (i <= 4 && i >= 3) {
            return 25;
        }
        if (i > 2 || i < 1) {
            return i <= 0 ? 27 : 0;
        }
        return 26;
    }

    private void a(Graphics2D graphics2D, int i, int i2, double d, Color color) {
        if (d < 0.01d) {
            return;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        Rectangle rectangle = new Rectangle(i, i2 - 7, 45, 45);
        Arc2D.Double r0 = new Arc2D.Double(rectangle.x + 27, ((double) rectangle.y) + (((double) (rectangle.height / 2)) - 13.0d), F, F, 90.0d, (-360.0d) * d, 0);
        graphics2D.setStroke(new BasicStroke(2.0f, 0, 0));
        graphics2D.setColor(color);
        graphics2D.draw(r0);
    }

    public int e() {
        return this.n;
    }

    public boolean f() {
        return this.n == 1;
    }

    public boolean g() {
        return this.n == 2;
    }

    public void b(int i) {
        this.n = i;
    }

    public boolean h() {
        return Configuration.bc;
    }

    public void a(boolean z2) {
        boolean z3 = Configuration.bc;
        Configuration.bc = z2;
        if (z3 != z2) {
            if (Client.ah()) {
                this.l.j();
            }
            class_492.a();
        }
    }
}
