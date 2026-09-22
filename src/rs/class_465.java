package rs;

import com.sun.jna.platform.win32.aU;
import java.util.Locale;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_465.class */
public class class_465 {
    static final String a = "---";
    static final String b = "--------";
    static final int c = 0;
    static final int d = 1;
    static final int e = 2;
    static final int f = 3;
    static final int g = 4;

    public static void a(int i) {
        switch (i) {
            case 0:
                class_463.l(class_463.cd).as = "<img=375> Ready";
                class_463.l(class_463.cb).Q = "Mark yourself as ready for the raid!";
                break;
            case 1:
                class_463.l(class_463.cd).as = "<img=376> Cancel";
                class_463.l(class_463.cb).Q = "Cancel your ready status";
                break;
            case 2:
                class_463.l(class_463.cd).as = "<img=378> Enter Raid";
                class_463.l(class_463.cb).Q = "Enter the raid instance lobby";
                break;
            case 3:
                class_463.l(class_463.cd).as = "<img=378> Start Mass";
                class_463.l(class_463.cb).Q = "Start the raid mass (lobby stage)";
                break;
            case 4:
                class_463.l(class_463.cd).as = "<img=291> Waiting";
                class_463.l(class_463.cb).Q = "Waiting for leader..\nYou will be able to join once the\nleader of the mass starts the raid!";
                break;
        }
    }

    public static void a(int i, String str, String str2) {
        int i2;
        if (i == 0) {
            i2 = 32318 + 1;
        } else {
            int i3 = 32318 + 3 + ((i - 1) * 5);
            if (!class_463.l(i3).E.t.equalsIgnoreCase(class_463.dw.t)) {
                c(i3);
            }
            if (str2.toLowerCase(Locale.ROOT).contains("max")) {
                class_463.l(i3).bd = false;
            } else {
                if (str2.toLowerCase().contains("invit")) {
                    class_463.l(i3).Q = "Cancel invitation";
                } else {
                    class_463.l(i3).Q = "Kick player";
                }
                class_463.l(i3).bd = true;
            }
            i2 = i3 + 3;
        }
        class_463.l(i2).as = str;
        if (str2.toLowerCase(Locale.ROOT).contains("max")) {
            class_463.l(i2 + 1).bd = false;
        } else {
            class_463.l(i2 + 1).bd = true;
            class_463.l(i2 + 1).as = str2;
        }
    }

    public static void a() {
        int i;
        int i2 = 32318;
        for (int i3 = 0; i3 < 20; i3++) {
            if (i3 == 0) {
                i = i2 + 1;
            } else {
                b(i2);
                class_463.l(i2).bd = true;
                i = i2 + 3;
            }
            int i4 = i;
            int i5 = i + 1;
            class_463.l(i4).as = a;
            i2 = i5 + 1;
            class_463.l(i5).as = b;
            class_463.l(i2 - 1).bd = true;
        }
    }

    public static void b(int i) {
        class_342.a(i, class_463.du, "Invite a player").a().b(i + 1, class_463.dv);
    }

    public static void c(int i) {
        class_342.a(i, class_463.dw, "Kick player").a().b(i + 1, class_463.dx);
    }

    public static void a(class_495 class_495Var) {
        int i;
        class_495Var.a(class_351.a(class_463.bQ, "raids/bgparty")).a(class_463.bH, 7, 43);
        class_495Var.a(class_352.a(class_463.bR, "Raid Selection").o().m()).a(class_463.bQ, 88, 55);
        class_495Var.a(class_352.a(class_463.bS, "Raid Difficulty").o().m()).a(class_463.bQ, 246, 55);
        class_495Var.a(class_352.a(class_463.bT, "Aff. Tome Coffer").o().m()).a(class_463.bQ, 419, 55);
        class_495Var.a(class_352.a(class_463.bU, "Party Afflictions").o().m()).a(class_463.bQ, 439, 225);
        class_495Var.a(class_352.a(class_463.bV, "Members (1/5)").i().m()).a(class_463.bQ, 14, 108);
        class_495Var.a(class_352.a(class_463.bW, "Current Status").i().c().m()).a(class_463.bQ, User32.WM_CTLCOLORSTATIC, 108);
        class_495Var.a(class_352.a(class_463.bP, "Raid: @yel@Grandmaster ToB @gre@(4A)").j().m()).a(class_463.bQ, 11, User32.WM_ENTERIDLE);
        class_495Var.a(class_352.a(class_463.ca, "<img=88> Public").a().l().a(51)).a(class_463.bQ, 11, 307);
        class_495Var.a(class_352.a(class_463.cm, "<img=88> Friends only").a().l().a(100)).a(class_463.bQ, 67, 307);
        class_495Var.a(class_352.a(class_463.cn, "<img=88> Invite only").a().l().a(100)).a(class_463.bQ, 154, 307);
        class_350 class_350VarG = class_350.a(class_463.bX).g(aU.ib_, 147);
        class_350VarG.m(364);
        int i2 = class_463.bY + 1;
        class_350VarG.n(class_352.a(class_463.bY, "").au).a(0, 0);
        for (int i3 = 0; i3 < 20; i3++) {
            if (i3 == 0) {
                class_351.b(i2, class_463.dy);
                int i4 = i2;
                i = i2 + 1;
                class_350VarG.n(i4).a(2, i3 + 4);
            } else {
                b(i2);
                class_350VarG.n(i2).a(1, (i3 * 18) + 4);
                class_350VarG.n(i2 + 1).a(1, (i3 * 18) + 4);
                i = i2 + 3;
            }
            int i5 = i;
            int i6 = i + 1;
            class_352.a(i5, a).a().l();
            class_350VarG.n(i6 - 1).a(18, (i3 * 18) + 5);
            i2 = i6 + 1;
            class_352.a(i6, b).a().l().c();
            class_350VarG.n(i2 - 1).a(User32.WM_UPDATEUISTATE, (i3 * 18) + 5);
        }
        class_495Var.a(class_350VarG).a(class_463.bQ, 13, 126);
        class_342.b(class_463.cb, "raids/sprite 8", "Enter the raid instance lobby").a().a(32420, "raids/sprite 9");
        class_352.a(class_463.cd, "<img=401> Enter Raid").n().m();
        class_495Var.a(class_463.cb).a(class_463.bH, 261, User32.WM_MENUGETOBJECT);
        class_495Var.a(32420).a(class_463.bH, 261, User32.WM_MENUGETOBJECT);
        class_495Var.a(class_463.cd).a(class_463.bH, CGL.kCGLCPMPSwapsInFlight, User32.WM_QUERYUISTATE);
        class_342.b(class_463.cc, "raids/sprite 8", "Leave the party (disbands if empty)").a().a(32423, "raids/sprite 9");
        class_352.a(class_463.ce, "<img=377> Leave").n().m();
        class_495Var.a(class_463.cc).a(class_463.bH, Client.gF, User32.WM_MENUGETOBJECT);
        class_495Var.a(32423).a(class_463.bH, Client.gF, User32.WM_MENUGETOBJECT);
        class_495Var.a(class_463.ce).a(class_463.bH, 437, User32.WM_QUERYUISTATE);
        class_495Var.a(class_343.a(class_463.cg, "Chambers of Xeric <img=185>", "Theatre of Blood <img=184>").h(155, 0).g(class_492.c, class_492.e)).a(class_463.bQ, 12, 74);
        class_495Var.a(class_343.a(class_463.ch, "Normal (No reqs.)", "Adept (Req. 10+ raids)", "Expert (Req. 50+ raids)", "Master (Req. 100+ raids)", "Grandmaster (Req. 250+)").h(155, 0).g(class_492.c, class_492.e)).a(class_463.bQ, 171, 74);
        class_343 class_343Var = (class_343) class_463.l(class_463.ch);
        class_343Var.i().get(1).b(" Adept difficulty\n- +5% rare reward chance\n- Bosses have 50% more HP\n- Bosses have 10% more defence\n- Bosses deal 5% more damage\n- You deal 5% less damage");
        class_343Var.i().get(2).b(" Expert difficulty\n- +25% rare reward chance\n- Bosses have 200% more HP\n- Bosses have 20% more defence\n- Bosses deal 7.5% more damage\n- You deal 7.5% less damage");
        class_343Var.i().get(3).b(" Master difficulty\n- Receive +2 common rewards\n- +50% rare reward chance\n- Bosses have 300% more HP\n- Bosses have 30% more defence\n- Bosses deal 10% more damage\n- You deal 10% less damage");
        class_343Var.i().get(4).b(" Grandmaster difficulty\n- Receive +3 common rewards\n- +75% rare reward chance\n- Bosses have 400% more HP\n- Bosses have 50% more defence\n- Bosses deal 15% more damage\n- You deal 15% less damage");
        class_349 class_349VarA = class_349.g(class_463.cf, 1).a(1);
        class_349VarA.bC = true;
        class_349VarA.bD = true;
        class_349VarA.ax[0] = 6750;
        class_349VarA.av[0] = 0;
        class_495Var.a(class_463.cf).a(class_463.bH, Client.gF, 82);
        class_495Var.a(class_342.b(class_463.cE, "bank/bank 17", "Deposit all tomes from inventory").a().c("bank/bank 18")).a(class_463.bH, 437, 73);
        class_495Var.a(class_342.b(class_463.cF, "bank/bank 31", "Deposit all tomes from bank").a().c("bank/bank 32")).a(class_463.bH, 437, 98);
        class_495Var.a(class_342.b(class_463.cJ, "raids/btn1a", "Select").c("raids/btn1b")).a(class_463.bH, 356, 130);
        class_495Var.a(class_352.a(class_463.cS, "Buy x25:@gre@ <tab=55><item=10834>2,500").a().m()).b(class_463.cJ, 7, 7);
        class_495Var.a(class_342.b(class_463.cK, "raids/btn1a", "Select").c("raids/btn1b")).a(class_463.bH, 356, 158);
        class_495Var.a(class_352.a(class_463.cT, "Buy x50:@gre@ <tab=55><item=10834>4,500").a().m()).b(class_463.cK, 7, 7);
        class_495Var.a(class_352.a(class_463.cV, "What are Afflictions?").a(133).o().l()).a(class_463.bH, aU.ik_, 192);
        class_495Var.a(class_342.b(class_463.co, "raids/refresh 1", "Reload last settings").d("Reload last settings\nApply the same raid type and\ndifficulty as your last instance").a("raids/refresh 2")).b(class_463.bH, aU.iq_, 43);
        class_349 class_349VarA2 = class_349.g(class_463.ci, 1).a(1);
        class_349VarA2.bC = true;
        class_349VarA2.bD = true;
        class_349VarA2.ax[0] = 6750;
        class_349VarA2.av[0] = 0;
        class_495Var.a(class_463.ci).a(class_463.bH, 341, User32.VK_ICO_HELP);
        class_495Var.a(class_342.b(class_463.cj, "misc/donor 11", "Remove affliction tome(s)").a().c("misc/donor 12")).b(class_463.ci, -2, 32);
        class_495Var.a(class_342.b(class_463.ck, "misc/donor 9", "Add affliction tome(s)").a().c("misc/donor 10")).b(class_463.ci, 19, 32);
        class_495Var.a(class_351.a(class_463.cl, "raids/affbar1")).b(class_463.ci, 42, 16);
        class_495Var.a(class_342.b(class_463.bO, "raids/close1", "Close interface").b("raids/close2")).b(class_463.bH, 493, 3);
    }

    public static void b(class_495 class_495Var) {
        class_495Var.a(class_352.a(class_463.cZ, "You're not currently in a raid party!").n().l()).b(class_463.bH, User32.VK_PLAY, 116);
        class_495Var.a(class_352.a(class_463.da, "Would you like to create your own party? Or join an existing one..").o().l()).b(class_463.cZ, 0, 21);
        class_495Var.a(class_342.b(class_463.dd, "raids/btn3a", "Select").d("<img=17> Create Public\nYour party will be publicly listed and\navailable to players via the \"Join\" tab.").c("raids/btn3b")).b(class_463.cZ, -212, 51);
        class_495Var.a(class_352.a(class_463.db, "<img=17> Create @gre@(Public)").o().m()).b(class_463.dd, 69, 17);
        class_495Var.a(class_342.b(class_463.de, "raids/btn3a", "Select").d("<img=17> Create Private\nYour party will only be joinable by\nplayers in your friend's list").c("raids/btn3b")).b(class_463.cZ, -67, 51);
        class_495Var.a(class_352.a(class_463.dc, "<img=17> Create @or3@(Private)").o().m()).b(class_463.de, 69, 17);
        class_495Var.a(class_342.b(class_463.df, "raids/btn3a", "Select").d("<img=80> Join Private\nEnter the username of a friend\nto join their private raid party").c("raids/btn3b")).b(class_463.cZ, 78, 51);
        class_495Var.a(class_352.a(class_463.dg, "<img=80> Join Private").o().m()).b(class_463.df, 69, 17);
        class_495Var.a(class_342.b(class_463.di, "raids/btn3a", "Select").d("<img=2> Start Mass\nCreate a special public party with a huge capacity!\nIn addition, mass raids let all players\nparticipate in any difficulty (req. bypass)\n\nNOTE: This button is only visible\nto accounts with authorization").c("raids/btn3b")).b(class_463.cZ, -67, 116);
        class_495Var.a(class_352.a(class_463.dh, "<img=2> Create @mag@(Mass)").o().m()).b(class_463.di, 69, 17);
        class_495Var.a(class_342.b(class_463.bO, "raids/close1", "Close interface").b("raids/close2")).b(class_463.bH, 493, 3);
    }
}
