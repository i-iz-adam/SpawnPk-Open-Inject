package rs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;
import org.lwjgl.opengl.CGL;

/* JADX INFO: loaded from: client-final.jar:rs/Configuration.class */
public final class Configuration {
    public static final class_149 a = class_149.a;
    public static final Integer b = 43594;
    public static final Integer c = Integer.valueOf(CGL.kCGLCESurfaceBackingSize);
    public static final Boolean d = false;
    public static final boolean e;
    public static final Boolean f;
    public static final boolean g = true;
    public static final Boolean h;
    public static final Integer i;
    public static final String j;
    public static final boolean k;
    public static final Boolean l;
    public static final String m;
    public static class_152 n;
    public static class_150 o;
    public static class_150 p;
    public static final boolean q = true;
    public static class_150 r;
    public static int s;
    public static boolean t;
    public static final boolean u = false;
    public static boolean v;
    public static final boolean w = false;
    public static final boolean x = false;
    public static final boolean y = false;
    public static final String z;
    public static final String A;
    public static final boolean B = true;
    public static final boolean C = true;
    public static final boolean D = true;
    public static final int E = 9;
    public static final boolean F = true;
    public static final int[] G;
    public static boolean H;
    public static boolean I;
    public static boolean J;
    public static boolean K;
    public static boolean L;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    public static final boolean P = false;
    public static boolean Q;
    public static final boolean R = true;
    public static final boolean S = true;
    public static final boolean T = true;
    public static final boolean U = false;
    public static final boolean V = false;
    public static final boolean W = false;
    public static final boolean X = false;
    public static final boolean Y = true;
    public static final boolean Z = true;
    public static boolean aa;
    public static final boolean ab = true;
    public static final boolean ac = false;
    public static final String ad;
    public static boolean ae;
    public static String af;
    public static boolean ag;
    public static boolean ah;
    public static class_151 ai;
    public static boolean aj;
    public static boolean ak;
    public static boolean al;
    public static boolean am;
    public static boolean an;
    public static boolean ao;
    public static boolean ap;
    public static boolean aq;
    public static boolean ar;
    public static boolean as;
    public static boolean at;
    public static boolean au;
    public static boolean av;
    public static boolean aw;
    public static boolean ax;
    public static boolean ay;
    public static boolean az;
    public static boolean aA;
    public static boolean aB;
    public static boolean aC;
    public static boolean aD;
    public static boolean aE;
    public static boolean aF;
    public static boolean aG;
    public static boolean aH;
    public static boolean aI;
    public static boolean aJ;
    public static boolean aK;
    public static boolean aL;
    public static boolean aM;
    public static boolean aN;
    public static boolean aO;
    public static boolean aP;
    public static boolean aQ;
    public static boolean aR;
    public static boolean aS;
    public static boolean aT;
    public static boolean aU;
    public static boolean aV;
    public static boolean aW;
    public static boolean aX;
    public static boolean aY;
    public static boolean aZ;
    public static boolean ba;
    public static boolean bb;
    public static boolean bc;
    public static int bd;
    public static int be;
    public static String bf;
    public static int bg;
    public static int bh;
    public static boolean bi;
    public static boolean bj;
    public static boolean bk;
    public static boolean bl;
    public static boolean bm;
    public static boolean bn;
    public static boolean bo;
    public static boolean bp;
    public static boolean bq;
    public static boolean br;
    public static final Integer bs;
    public static int bt;

    public static boolean a() {
        return h.booleanValue() || c.intValue() == 1;
    }

    public static boolean b() {
        return k;
    }

    public static boolean c() {
        return b();
    }

    public static void a(boolean z2) {
        if (z2) {
            ah = true;
            av = false;
            az = false;
            class_332.i = false;
            return;
        }
        ah = false;
        av = true;
        az = true;
        class_332.i = true;
    }

    public static void d() {
        ClientThread.a("SaveSettings", Configuration::g);
    }

    private static void g() {
        try {
            File file = new File(ad + ".temp");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("oldschool_graphics=" + aj);
            bufferedWriter.newLine();
            bufferedWriter.write("split_private_chat=" + bt);
            bufferedWriter.newLine();
            bufferedWriter.write("screen_mode=" + ai.name());
            bufferedWriter.newLine();
            bufferedWriter.write("show_bh_streaks=" + au);
            bufferedWriter.newLine();
            bufferedWriter.write("show_roofs=" + ax);
            bufferedWriter.newLine();
            bufferedWriter.write("show_fog=" + aw);
            bufferedWriter.newLine();
            bufferedWriter.write("left_click_attack=" + ay);
            bufferedWriter.newLine();
            bufferedWriter.write("particle_system_1=" + az);
            bufferedWriter.newLine();
            bufferedWriter.write("show_broadcasts_1=" + aA);
            bufferedWriter.newLine();
            bufferedWriter.write("shift_drop=" + aC);
            bufferedWriter.newLine();
            bufferedWriter.write("timer_overlay=" + aD);
            bufferedWriter.newLine();
            bufferedWriter.write("oldschool_ticks=" + aE);
            bufferedWriter.newLine();
            bufferedWriter.write("instant_switching=" + aF);
            bufferedWriter.newLine();
            bufferedWriter.write("prayer_adjustments=" + aG);
            bufferedWriter.newLine();
            bufferedWriter.write("side_panel_toggled=" + aH);
            bufferedWriter.newLine();
            bufferedWriter.write("rigour_augury_swapped=" + aI);
            bufferedWriter.newLine();
            bufferedWriter.write("left_click_target_only=" + aJ);
            bufferedWriter.newLine();
            bufferedWriter.write("developer_console=" + aM);
            bufferedWriter.newLine();
            for (int i2 = 0; i2 < G.length; i2++) {
                bufferedWriter.write("key_binding_" + i2 + "=" + G[i2]);
                if (i2 != G.length + 1) {
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.write("item_drag=" + bd);
            bufferedWriter.newLine();
            bufferedWriter.write("lite_version=" + ah);
            bufferedWriter.newLine();
            bufferedWriter.write("sound_effects=" + s);
            bufferedWriter.newLine();
            bufferedWriter.write("extended_zoom=" + aO);
            bufferedWriter.newLine();
            bufferedWriter.write("desktop_notifications=" + aP);
            bufferedWriter.newLine();
            bufferedWriter.write("player_lighting=" + aQ);
            bufferedWriter.newLine();
            if (h.booleanValue()) {
                bufferedWriter.write("default_invitation_code=" + Client.fn);
                bufferedWriter.newLine();
            }
            bufferedWriter.write("always_right_click_npc_attack=" + aR);
            bufferedWriter.newLine();
            bufferedWriter.write("spellbook_filter=" + class_433.d);
            bufferedWriter.newLine();
            if (class_433.f.contains(class_433.a.a)) {
                bufferedWriter.write("spellbook_filter_combat=true");
                bufferedWriter.newLine();
            }
            if (class_433.f.contains(class_433.a.b)) {
                bufferedWriter.write("spellbook_filter_teleport=true");
                bufferedWriter.newLine();
            }
            if (class_433.f.contains(class_433.a.c)) {
                bufferedWriter.write("spellbook_filter_utility=true");
                bufferedWriter.newLine();
            }
            bufferedWriter.write("spellbook_filter_level=" + class_433.e);
            bufferedWriter.newLine();
            bufferedWriter.write("npc_attack_option=" + bh);
            bufferedWriter.newLine();
            bufferedWriter.write("player_attack_option=" + bg);
            bufferedWriter.newLine();
            bufferedWriter.write("right_click_clan=" + aS);
            bufferedWriter.newLine();
            bufferedWriter.write("hide_non_wild_pets=" + aT);
            bufferedWriter.newLine();
            bufferedWriter.write("hide_gs_decor=" + aV);
            bufferedWriter.newLine();
            bufferedWriter.write("last_update_visit=" + bf);
            bufferedWriter.newLine();
            bufferedWriter.write("wild_multi=" + aX);
            bufferedWriter.newLine();
            if (p != null) {
                bufferedWriter.write("ground_mode=" + p.name() + "." + n.name());
                bufferedWriter.newLine();
            }
            bufferedWriter.write("bank_all_pet=" + aZ);
            bufferedWriter.newLine();
            bufferedWriter.write("bhtele_lock=" + ba);
            bufferedWriter.newLine();
            bufferedWriter.write("show_icon_equip=" + bb);
            bufferedWriter.newLine();
            bufferedWriter.write("accomplishments=" + bk);
            bufferedWriter.newLine();
            bufferedWriter.write("click_tele=" + t);
            bufferedWriter.newLine();
            bufferedWriter.write("chat_hidden=" + bc);
            bufferedWriter.newLine();
            bufferedWriter.write("lock_spawnable_drop=" + aL);
            bufferedWriter.newLine();
            bufferedWriter.close();
            Path path = Paths.get(ad + ".temp", new String[0]);
            Files.copy(path, Paths.get(ad, new String[0]), StandardCopyOption.REPLACE_EXISTING);
            Files.delete(path);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void e() {
        G[0] = 116;
        G[1] = 122;
        G[2] = 123;
        G[3] = 112;
        G[4] = 113;
        G[5] = 114;
        G[6] = 115;
        G[7] = 119;
        G[8] = 120;
        G[9] = 121;
    }

    public static void f() {
        e();
        try {
            File file = new File(ad);
            if (file.exists()) {
                Properties properties = new Properties();
                FileInputStream fileInputStream = new FileInputStream(file);
                properties.load(fileInputStream);
                fileInputStream.close();
                aj = Boolean.valueOf(properties.getProperty("oldschool_graphics")).booleanValue();
                bt = Integer.valueOf(properties.getProperty("split_private_chat")).intValue();
                au = Boolean.valueOf(properties.getProperty("show_bh_streaks")).booleanValue();
                try {
                    ai = class_151.a(properties.getProperty("screen_mode"));
                    ax = Boolean.valueOf(properties.getProperty("show_roofs")).booleanValue();
                } catch (Exception e2) {
                }
                try {
                    aw = Boolean.valueOf(properties.getProperty("show_fog")).booleanValue();
                } catch (Exception e3) {
                }
                try {
                    ay = Boolean.valueOf(properties.getProperty("left_click_attack")).booleanValue();
                } catch (Exception e4) {
                }
                try {
                    if (properties.getProperty("particle_system_1") == null) {
                        az = true;
                    } else {
                        az = Boolean.valueOf(properties.getProperty("particle_system_1")).booleanValue();
                    }
                } catch (Exception e5) {
                }
                try {
                    if (properties.getProperty("show_broadcasts_1") == null) {
                        aA = true;
                    } else {
                        aA = Boolean.valueOf(properties.getProperty("show_broadcasts_1")).booleanValue();
                    }
                } catch (Exception e6) {
                }
                try {
                    if (properties.getProperty("shift_drop") == null) {
                        aC = true;
                    } else {
                        aC = Boolean.valueOf(properties.getProperty("shift_drop")).booleanValue();
                    }
                } catch (Exception e7) {
                }
                try {
                    if (properties.getProperty("timer_overlay") == null) {
                        aD = true;
                    } else {
                        aD = Boolean.valueOf(properties.getProperty("timer_overlay")).booleanValue();
                    }
                } catch (Exception e8) {
                }
                for (int i2 = 0; i2 < G.length; i2++) {
                    try {
                        if (properties.getProperty("key_binding_" + i2) != null) {
                            G[i2] = Integer.valueOf(properties.getProperty("key_binding_" + i2)).intValue();
                        }
                    } catch (Exception e9) {
                    }
                }
                try {
                    if (properties.getProperty("item_drag") == null) {
                        bd = 10;
                    } else {
                        bd = Integer.valueOf(properties.getProperty("item_drag")).intValue();
                    }
                } catch (Exception e10) {
                }
                try {
                    if (properties.getProperty("oldschool_ticks") == null) {
                        aE = false;
                    } else {
                        aE = Boolean.valueOf(properties.getProperty("oldschool_ticks")).booleanValue();
                    }
                } catch (Exception e11) {
                }
                try {
                    if (properties.getProperty("instant_switching") == null) {
                        aF = true;
                    } else {
                        aF = Boolean.valueOf(properties.getProperty("instant_switching")).booleanValue();
                    }
                } catch (Exception e12) {
                }
                try {
                    if (properties.getProperty("prayer_adjustments") == null) {
                        aG = true;
                    } else {
                        aG = Boolean.valueOf(properties.getProperty("prayer_adjustments")).booleanValue();
                    }
                } catch (Exception e13) {
                }
                try {
                    if (properties.getProperty("side_panel_toggled") == null) {
                        aH = true;
                    } else {
                        aH = Boolean.valueOf(properties.getProperty("side_panel_toggled")).booleanValue();
                    }
                } catch (Exception e14) {
                }
                try {
                    if (properties.getProperty("rigour_augury_swapped") == null) {
                        aI = false;
                    } else {
                        aI = Boolean.valueOf(properties.getProperty("rigour_augury_swapped")).booleanValue();
                    }
                } catch (Exception e15) {
                }
                try {
                    if (properties.getProperty("left_click_target_only") == null) {
                        aJ = false;
                    } else {
                        aJ = Boolean.valueOf(properties.getProperty("left_click_target_only")).booleanValue();
                    }
                } catch (Exception e16) {
                }
                try {
                    if (properties.getProperty("left_click_magic_only") == null) {
                        aK = false;
                    } else {
                        aK = Boolean.valueOf(properties.getProperty("left_click_magic_only")).booleanValue();
                    }
                } catch (Exception e17) {
                }
                try {
                    if (properties.getProperty("developer_console") == null) {
                        aM = false;
                    } else {
                        aM = Boolean.valueOf(properties.getProperty("developer_console")).booleanValue();
                    }
                } catch (Exception e18) {
                }
                try {
                    if (properties.getProperty("lite_version") == null) {
                        ah = false;
                    } else {
                        a(Boolean.valueOf(properties.getProperty("lite_version")).booleanValue());
                    }
                } catch (Exception e19) {
                }
                try {
                    if (properties.getProperty("sound_effects") != null) {
                        s = Integer.valueOf(properties.getProperty("sound_effects")).intValue();
                    }
                } catch (Exception e20) {
                }
                try {
                    if (properties.getProperty("extended_zoom") == null) {
                        class_46.a(false);
                        aO = false;
                    } else {
                        boolean zBooleanValue = Boolean.valueOf(properties.getProperty("extended_zoom")).booleanValue();
                        class_46.a(zBooleanValue);
                        aO = zBooleanValue;
                    }
                } catch (Exception e21) {
                }
                try {
                    if (properties.getProperty("desktop_notifications") == null) {
                        aP = false;
                    } else {
                        aP = Boolean.valueOf(properties.getProperty("desktop_notifications")).booleanValue();
                    }
                } catch (Exception e22) {
                }
                try {
                    if (properties.getProperty("player_lighting") == null) {
                        aQ = true;
                    } else {
                        aQ = Boolean.valueOf(properties.getProperty("player_lighting")).booleanValue();
                    }
                } catch (Exception e23) {
                }
                try {
                    if (properties.getProperty("always_right_click_npc_attack") == null) {
                        aR = false;
                    } else {
                        aR = Boolean.valueOf(properties.getProperty("always_right_click_npc_attack")).booleanValue();
                    }
                } catch (Exception e24) {
                }
                try {
                    if (properties.getProperty("spellbook_filter") == null) {
                        class_433.d = true;
                        class_433.f.add(class_433.a.a);
                        class_433.f.add(class_433.a.b);
                        class_433.e = false;
                    } else {
                        class_433.d = Boolean.valueOf(properties.getProperty("spellbook_filter")).booleanValue();
                    }
                } catch (Exception e25) {
                }
                try {
                    if (properties.getProperty("spellbook_filter_combat") != null) {
                        class_433.f.add(class_433.a.a);
                    }
                } catch (Exception e26) {
                }
                try {
                    if (properties.getProperty("spellbook_filter_teleport") != null) {
                        class_433.f.add(class_433.a.b);
                    }
                } catch (Exception e27) {
                }
                try {
                    if (properties.getProperty("spellbook_filter_utility") != null) {
                        class_433.f.add(class_433.a.c);
                    }
                } catch (Exception e28) {
                }
                try {
                    if (properties.getProperty("spellbook_filter_level") == null) {
                        class_433.e = false;
                    } else {
                        class_433.e = Boolean.valueOf(properties.getProperty("spellbook_filter_level")).booleanValue();
                    }
                } catch (Exception e29) {
                }
                try {
                    if (properties.getProperty("npc_attack_option") == null) {
                        bh = 0;
                    } else {
                        bh = Integer.valueOf(properties.getProperty("npc_attack_option")).intValue();
                    }
                } catch (Exception e30) {
                }
                try {
                    if (properties.getProperty("player_attack_option") == null) {
                        bg = 0;
                    } else {
                        bg = Integer.valueOf(properties.getProperty("player_attack_option")).intValue();
                    }
                } catch (Exception e31) {
                }
                try {
                    if (properties.getProperty("right_click_clan") == null) {
                        aS = false;
                    } else {
                        aS = Boolean.valueOf(properties.getProperty("right_click_clan")).booleanValue();
                    }
                } catch (Exception e32) {
                }
                try {
                    if (properties.getProperty("hide_non_wild_pets") == null) {
                        aT = false;
                    } else {
                        aT = Boolean.valueOf(properties.getProperty("hide_non_wild_pets")).booleanValue();
                    }
                } catch (Exception e33) {
                }
                try {
                    if (properties.getProperty("hide_gs_decor") == null) {
                        aV = false;
                    } else {
                        aV = Boolean.valueOf(properties.getProperty("hide_gs_decor")).booleanValue();
                    }
                } catch (Exception e34) {
                }
                try {
                    if (properties.getProperty("last_update_visit") == null) {
                        bf = "";
                    } else {
                        bf = properties.getProperty("last_update_visit");
                    }
                } catch (Exception e35) {
                }
                try {
                    if (properties.getProperty("wild_multi") == null) {
                        aX = true;
                    } else {
                        aX = Boolean.valueOf(properties.getProperty("wild_multi")).booleanValue();
                    }
                } catch (Exception e36) {
                }
                try {
                    if (properties.getProperty("bank_all_pet") == null) {
                        aZ = true;
                    } else {
                        aZ = Boolean.valueOf(properties.getProperty("bank_all_pet")).booleanValue();
                    }
                } catch (Exception e37) {
                }
                try {
                    p = null;
                    if (properties.getProperty("ground_mode") != null) {
                        String property = properties.getProperty("ground_mode");
                        if (property.contains(".")) {
                            String str = property.split("\\.")[0];
                            if (property.split("\\.")[1].equalsIgnoreCase(n.name())) {
                                r = class_150.valueOf(str);
                                p = r;
                            }
                        }
                    }
                } catch (Exception e38) {
                }
                try {
                    if (h.booleanValue()) {
                        try {
                            if (properties.getProperty("default_invitation_code") == null) {
                                Client.fn = "";
                            } else {
                                Client.fn = properties.getProperty("default_invitation_code");
                            }
                        } catch (Exception e39) {
                        }
                    }
                } catch (Exception e40) {
                }
                try {
                    if (properties.getProperty("show_icon_equip") == null) {
                        bb = true;
                    } else {
                        bb = Boolean.valueOf(properties.getProperty("show_icon_equip")).booleanValue();
                    }
                } catch (Exception e41) {
                }
                try {
                    if (properties.getProperty("accomplishments") == null) {
                        bk = true;
                    } else {
                        bk = Boolean.valueOf(properties.getProperty("accomplishments")).booleanValue();
                    }
                } catch (Exception e42) {
                }
                try {
                    if (properties.getProperty("click_tele") == null) {
                        t = true;
                    } else {
                        t = Boolean.valueOf(properties.getProperty("click_tele")).booleanValue();
                    }
                } catch (Exception e43) {
                }
                try {
                    if (properties.getProperty("chat_hidden") == null) {
                        bc = false;
                    } else {
                        bc = Boolean.valueOf(properties.getProperty("chat_hidden")).booleanValue();
                    }
                } catch (Exception e44) {
                }
                try {
                    if (properties.getProperty("lock_spawnable_drop") == null) {
                        aL = false;
                    } else {
                        aL = Boolean.valueOf(properties.getProperty("lock_spawnable_drop")).booleanValue();
                    }
                } catch (Exception e45) {
                }
            }
        } catch (IOException e46) {
            e46.printStackTrace();
        }
    }

    static {
        String str;
        e = !d.booleanValue();
        f = d;
        h = Boolean.valueOf(!d.booleanValue() && c.intValue() == 1);
        i = Integer.valueOf(d.booleanValue() ? 1 : 47);
        if (d.booleanValue()) {
            str = "127.0.0.1";
        } else {
            str = h.booleanValue() ? "149.56.28.70" : "www.spawnpk.org";
        }
        j = str;
        k = c.intValue() == 1 && !h.booleanValue();
        l = Boolean.valueOf(!d.booleanValue());
        m = "https://d2n1q79xme98rn.cloudfront.net/" + (a == class_149.a ? "spk" : "rx") + (h.booleanValue() ? "_test" : "_live") + "/";
        n = class_152.c;
        o = class_150.e;
        p = null;
        r = o;
        s = 3;
        t = true;
        v = a == class_149.a;
        z = a.d;
        A = a.c;
        G = new int[10];
        H = true;
        I = true;
        J = true;
        K = true;
        L = true;
        M = true;
        N = true;
        O = false;
        Q = false;
        aa = true;
        ad = class_650.b() + "settings.properties";
        ae = true;
        af = "RIMMINGTON";
        ag = false;
        ah = false;
        ai = class_151.a;
        aj = true;
        ak = false;
        al = false;
        am = false;
        an = false;
        ao = false;
        ap = false;
        aq = true;
        ar = false;
        as = false;
        at = false;
        au = false;
        av = !ah;
        aw = false;
        ax = false;
        ay = false;
        az = true;
        aA = true;
        aB = true;
        aC = false;
        aD = true;
        aE = false;
        aF = true;
        aG = true;
        aH = true;
        aI = false;
        aJ = false;
        aK = false;
        aL = false;
        aM = true;
        aN = true;
        aO = true;
        aP = false;
        aQ = true;
        aR = false;
        aS = true;
        aT = false;
        aU = false;
        aV = false;
        aW = false;
        aX = true;
        aY = true;
        aZ = false;
        ba = false;
        bb = true;
        bc = false;
        bd = 10;
        be = 0;
        bf = "";
        bg = 0;
        bh = 0;
        bi = false;
        bj = false;
        bk = true;
        bl = false;
        bm = false;
        bn = true;
        bo = true;
        bp = false;
        bq = true;
        br = false;
        bs = 35000;
        bt = 1;
    }
}
