package rs.p_f;

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
import rs.C_Client_mc;
import rs.C_V_uc;
import rs.p_l.C_E_uc;
import rs.p_n.p_c.C_ap;

public final class C_a {
   public static final C_a.a a = C_a.a.a;
   public static final Integer b = 43594;
   public static final Integer c = 308;
   public static final Boolean d = false;
   public static final boolean e = !d;
   public static final Boolean f = d;
   public static final boolean g = true;
   public static final Boolean h = !d && c == 1;
   public static final Integer i = d ? 1 : 51;
   public static final String j = d ? "127.0.0.1" : (h ? "149.56.28.70" : "www.spawnpk.org");
   public static final boolean k = c == 1 && !h;
   public static final Boolean l = !d;
   public static final String m = "https://d2n1q79xme98rn.cloudfront.net/" + (a == C_a.a.a ? "spk" : "rx") + (h ? "_test" : "_live") + "/";
   public static C_a.d n = C_a.d.a;
   public static C_a.b o = C_a.b.a;
   public static C_a.b p = null;
   public static final boolean q = true;
   public static C_a.b r = o;
   public static int s = 3;
   public static boolean t = true;
   public static final boolean u = false;
   public static boolean v = a == C_a.a.a;
   public static final boolean w = false;
   public static final boolean x = false;
   public static final boolean y = false;
   public static final String z = a.d;
   public static final String A = a.c;
   public static final boolean B = true;
   public static final boolean C = true;
   public static final boolean D = true;
   public static final int E = 9;
   public static final boolean F = true;
   public static final int[] G = new int[10];
   public static boolean H = true;
   public static boolean I = true;
   public static boolean J = true;
   public static boolean K = true;
   public static boolean L = true;
   public static boolean M = true;
   public static boolean N = true;
   public static boolean O = false;
   public static final boolean P = false;
   public static boolean Q = false;
   public static final boolean R = true;
   public static final boolean S = true;
   public static final boolean T = true;
   public static final boolean U = false;
   public static final boolean V = false;
   public static final boolean W = false;
   public static final boolean X = false;
   public static final boolean Y = true;
   public static final boolean Z = true;
   public static boolean aa = true;
   public static final boolean ab = true;
   public static final boolean ac = false;
   public static final String ad = rs.p_v.C_a.b() + "settings.properties";
   public static boolean ae = true;
   public static String af = "RIMMINGTON";
   public static boolean ag = false;
   public static boolean ah = false;
   public static C_a.c ai = C_a.c.a;
   public static boolean aj = true;
   public static boolean ak = false;
   public static boolean al = false;
   public static boolean am = false;
   public static boolean an = false;
   public static boolean ao = false;
   public static boolean ap = false;
   public static boolean aq = true;
   public static boolean ar = false;
   public static boolean as = false;
   public static boolean at = false;
   public static boolean au = false;
   public static boolean av = !ah;
   public static boolean aw = false;
   public static boolean ax = false;
   public static boolean ay = false;
   public static boolean az = true;
   public static boolean aA = true;
   public static boolean aB = true;
   public static boolean aC = false;
   public static boolean aD = true;
   public static boolean aE = false;
   public static boolean aF = true;
   public static boolean aG = true;
   public static boolean aH = true;
   public static boolean aI = false;
   public static boolean aJ = false;
   public static boolean aK = false;
   public static boolean aL = false;
   public static boolean aM = true;
   public static boolean aN = true;
   public static boolean aO = true;
   public static boolean aP = false;
   public static boolean aQ = true;
   public static boolean aR = false;
   public static boolean aS = true;
   public static boolean aT = false;
   public static boolean aU = false;
   public static boolean aV = false;
   public static boolean aW = false;
   public static boolean aX = true;
   public static boolean aY = true;
   public static boolean aZ = false;
   public static boolean ba = false;
   public static boolean bb = true;
   public static boolean bc = false;
   public static int bd = 10;
   public static boolean be = false;
   public static int bf = 0;
   public static String bg = "";
   public static int bh = 0;
   public static int bi = 0;
   public static boolean bj = false;
   public static boolean bk = false;
   public static boolean bl = true;
   public static boolean bm = false;
   public static boolean bn = false;
   public static boolean bo = true;
   public static boolean bp = true;
   public static boolean bq = false;
   public static boolean br = true;
   public static boolean bs = false;
   public static final Integer bt = 35000;
   public static int bu = 1;

   public static boolean a() {
      return h || c == 1;
   }

   public static boolean b() {
      return k;
   }

   public static boolean c() {
      return b();
   }

   public static void a(boolean var0) {
      if (var0) {
         ah = true;
         av = false;
         az = false;
         C_E_uc.i = false;
      } else {
         ah = false;
         av = true;
         az = true;
         C_E_uc.i = true;
      }
   }

   public static void d() {
      rs.p_h.C_c.a("SaveSettings", C_a::g);
   }

   private static void g() {
      try {
         File var0 = new File(ad + ".temp");
         if (!var0.exists()) {
            var0.createNewFile();
         }

         BufferedWriter var1 = new BufferedWriter(new FileWriter(var0));
         var1.write("oldschool_graphics=" + aj);
         var1.newLine();
         var1.write("split_private_chat=" + bu);
         var1.newLine();
         var1.write("screen_mode=" + ai.name());
         var1.newLine();
         var1.write("show_bh_streaks=" + au);
         var1.newLine();
         var1.write("show_roofs=" + ax);
         var1.newLine();
         var1.write("show_fog=" + aw);
         var1.newLine();
         var1.write("left_click_attack=" + ay);
         var1.newLine();
         var1.write("particle_system_1=" + az);
         var1.newLine();
         var1.write("show_broadcasts_1=" + aA);
         var1.newLine();
         var1.write("shift_drop=" + aC);
         var1.newLine();
         var1.write("timer_overlay=" + aD);
         var1.newLine();
         var1.write("oldschool_ticks=" + aE);
         var1.newLine();
         var1.write("instant_switching=" + aF);
         var1.newLine();
         var1.write("prayer_adjustments=" + aG);
         var1.newLine();
         var1.write("side_panel_toggled=" + aH);
         var1.newLine();
         var1.write("rigour_augury_swapped=" + aI);
         var1.newLine();
         var1.write("left_click_target_only=" + aJ);
         var1.newLine();
         var1.write("developer_console=" + aM);
         var1.newLine();

         for (int var2 = 0; var2 < G.length; var2++) {
            var1.write("key_binding_" + var2 + "=" + G[var2]);
            if (var2 != G.length + 1) {
               var1.newLine();
            }
         }

         var1.newLine();
         var1.write("item_drag=" + bd);
         var1.newLine();
         var1.write("queued_item_clicks_v2=" + be);
         var1.newLine();
         var1.write("lite_version=" + ah);
         var1.newLine();
         var1.write("sound_effects=" + s);
         var1.newLine();
         var1.write("extended_zoom=" + aO);
         var1.newLine();
         var1.write("desktop_notifications=" + aP);
         var1.newLine();
         var1.write("player_lighting=" + aQ);
         var1.newLine();
         if (h) {
            var1.write("default_invitation_code=" + C_Client_mc.fn);
            var1.newLine();
         }

         var1.write("always_right_click_npc_attack=" + aR);
         var1.newLine();
         var1.write("spellbook_filter=" + C_ap.d);
         var1.newLine();
         if (C_ap.f.contains(C_ap.a.a)) {
            var1.write("spellbook_filter_combat=true");
            var1.newLine();
         }

         if (C_ap.f.contains(C_ap.a.b)) {
            var1.write("spellbook_filter_teleport=true");
            var1.newLine();
         }

         if (C_ap.f.contains(C_ap.a.c)) {
            var1.write("spellbook_filter_utility=true");
            var1.newLine();
         }

         var1.write("spellbook_filter_level=" + C_ap.e);
         var1.newLine();
         var1.write("npc_attack_option=" + bi);
         var1.newLine();
         var1.write("player_attack_option=" + bh);
         var1.newLine();
         var1.write("right_click_clan=" + aS);
         var1.newLine();
         var1.write("hide_non_wild_pets=" + aT);
         var1.newLine();
         var1.write("hide_gs_decor=" + aV);
         var1.newLine();
         var1.write("last_update_visit=" + bg);
         var1.newLine();
         var1.write("wild_multi=" + aX);
         var1.newLine();
         if (p != null) {
            var1.write("ground_mode=" + p.name() + "." + n.name());
            var1.newLine();
         }

         var1.write("bank_all_pet=" + aZ);
         var1.newLine();
         var1.write("bhtele_lock=" + ba);
         var1.newLine();
         var1.write("show_icon_equip=" + bb);
         var1.newLine();
         var1.write("accomplishments=" + bl);
         var1.newLine();
         var1.write("click_tele=" + t);
         var1.newLine();
         var1.write("chat_hidden=" + bc);
         var1.newLine();
         var1.write("lock_spawnable_drop=" + aL);
         var1.newLine();
         var1.close();
         Path var4 = Paths.get(ad + ".temp");
         Files.copy(var4, Paths.get(ad), StandardCopyOption.REPLACE_EXISTING);
         Files.delete(var4);
      } catch (Exception var3) {
         var3.printStackTrace();
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
         File var0 = new File(ad);
         if (!var0.exists()) {
            return;
         }

         Properties var1 = new Properties();
         FileInputStream var2 = new FileInputStream(var0);
         var1.load(var2);
         var2.close();
         be = Boolean.parseBoolean(var1.getProperty("queued_item_clicks_v2", "false"));
         aj = Boolean.valueOf(var1.getProperty("oldschool_graphics"));
         bu = Integer.valueOf(var1.getProperty("split_private_chat"));
         au = Boolean.valueOf(var1.getProperty("show_bh_streaks"));

         try {
            ai = C_a.c.a(var1.getProperty("screen_mode"));
            ax = Boolean.valueOf(var1.getProperty("show_roofs"));
         } catch (Exception var48) {
         }

         try {
            aw = Boolean.valueOf(var1.getProperty("show_fog"));
         } catch (Exception var47) {
         }

         try {
            ay = Boolean.valueOf(var1.getProperty("left_click_attack"));
         } catch (Exception var46) {
         }

         try {
            if (var1.getProperty("particle_system_1") == null) {
               az = true;
            } else {
               az = Boolean.valueOf(var1.getProperty("particle_system_1"));
            }
         } catch (Exception var45) {
         }

         try {
            if (var1.getProperty("show_broadcasts_1") == null) {
               aA = true;
            } else {
               aA = Boolean.valueOf(var1.getProperty("show_broadcasts_1"));
            }
         } catch (Exception var44) {
         }

         try {
            if (var1.getProperty("shift_drop") == null) {
               aC = true;
            } else {
               aC = Boolean.valueOf(var1.getProperty("shift_drop"));
            }
         } catch (Exception var43) {
         }

         try {
            if (var1.getProperty("timer_overlay") == null) {
               aD = true;
            } else {
               aD = Boolean.valueOf(var1.getProperty("timer_overlay"));
            }
         } catch (Exception var42) {
         }

         try {
            for (int var3 = 0; var3 < G.length; var3++) {
               if (var1.getProperty("key_binding_" + var3) != null) {
                  G[var3] = Integer.valueOf(var1.getProperty("key_binding_" + var3));
               }
            }
         } catch (Exception var49) {
         }

         try {
            if (var1.getProperty("item_drag") == null) {
               bd = 10;
            } else {
               bd = Integer.valueOf(var1.getProperty("item_drag"));
            }
         } catch (Exception var41) {
         }

         try {
            if (var1.getProperty("oldschool_ticks") == null) {
               aE = false;
            } else {
               aE = Boolean.valueOf(var1.getProperty("oldschool_ticks"));
            }
         } catch (Exception var40) {
         }

         try {
            if (var1.getProperty("instant_switching") == null) {
               aF = true;
            } else {
               aF = Boolean.valueOf(var1.getProperty("instant_switching"));
            }
         } catch (Exception var39) {
         }

         try {
            if (var1.getProperty("prayer_adjustments") == null) {
               aG = true;
            } else {
               aG = Boolean.valueOf(var1.getProperty("prayer_adjustments"));
            }
         } catch (Exception var38) {
         }

         try {
            if (var1.getProperty("side_panel_toggled") == null) {
               aH = true;
            } else {
               aH = Boolean.valueOf(var1.getProperty("side_panel_toggled"));
            }
         } catch (Exception var37) {
         }

         try {
            if (var1.getProperty("rigour_augury_swapped") == null) {
               aI = false;
            } else {
               aI = Boolean.valueOf(var1.getProperty("rigour_augury_swapped"));
            }
         } catch (Exception var36) {
         }

         try {
            if (var1.getProperty("left_click_target_only") == null) {
               aJ = false;
            } else {
               aJ = Boolean.valueOf(var1.getProperty("left_click_target_only"));
            }
         } catch (Exception var35) {
         }

         try {
            if (var1.getProperty("left_click_magic_only") == null) {
               aK = false;
            } else {
               aK = Boolean.valueOf(var1.getProperty("left_click_magic_only"));
            }
         } catch (Exception var34) {
         }

         try {
            if (var1.getProperty("developer_console") == null) {
               aM = false;
            } else {
               aM = Boolean.valueOf(var1.getProperty("developer_console"));
            }
         } catch (Exception var33) {
         }

         try {
            if (var1.getProperty("lite_version") == null) {
               ah = false;
            } else {
               boolean var51 = Boolean.valueOf(var1.getProperty("lite_version"));
               a(var51);
            }
         } catch (Exception var32) {
         }

         try {
            if (var1.getProperty("sound_effects") != null) {
               s = Integer.valueOf(var1.getProperty("sound_effects"));
            }
         } catch (Exception var31) {
         }

         try {
            if (var1.getProperty("extended_zoom") == null) {
               C_V_uc.a(false);
               aO = false;
            } else {
               boolean var52 = Boolean.valueOf(var1.getProperty("extended_zoom"));
               C_V_uc.a(var52);
               aO = var52;
            }
         } catch (Exception var30) {
         }

         try {
            if (var1.getProperty("desktop_notifications") == null) {
               aP = false;
            } else {
               aP = Boolean.valueOf(var1.getProperty("desktop_notifications"));
            }
         } catch (Exception var29) {
         }

         try {
            if (var1.getProperty("player_lighting") == null) {
               aQ = true;
            } else {
               aQ = Boolean.valueOf(var1.getProperty("player_lighting"));
            }
         } catch (Exception var28) {
         }

         try {
            if (var1.getProperty("always_right_click_npc_attack") == null) {
               aR = false;
            } else {
               aR = Boolean.valueOf(var1.getProperty("always_right_click_npc_attack"));
            }
         } catch (Exception var27) {
         }

         try {
            if (var1.getProperty("spellbook_filter") == null) {
               C_ap.d = true;
               C_ap.f.add(C_ap.a.a);
               C_ap.f.add(C_ap.a.b);
               e = false;
            } else {
               C_ap.d = Boolean.valueOf(var1.getProperty("spellbook_filter"));
            }
         } catch (Exception var26) {
         }

         try {
            if (var1.getProperty("spellbook_filter_combat") != null) {
               C_ap.f.add(C_ap.a.a);
            }
         } catch (Exception var25) {
         }

         try {
            if (var1.getProperty("spellbook_filter_teleport") != null) {
               C_ap.f.add(C_ap.a.b);
            }
         } catch (Exception var24) {
         }

         try {
            if (var1.getProperty("spellbook_filter_utility") != null) {
               C_ap.f.add(C_ap.a.c);
            }
         } catch (Exception var23) {
         }

         try {
            if (var1.getProperty("spellbook_filter_level") == null) {
               e = false;
            } else {
               e = Boolean.valueOf(var1.getProperty("spellbook_filter_level"));
            }
         } catch (Exception var22) {
         }

         try {
            if (var1.getProperty("npc_attack_option") == null) {
               bi = 0;
            } else {
               bi = Integer.valueOf(var1.getProperty("npc_attack_option"));
            }
         } catch (Exception var21) {
         }

         try {
            if (var1.getProperty("player_attack_option") == null) {
               bh = 0;
            } else {
               bh = Integer.valueOf(var1.getProperty("player_attack_option"));
            }
         } catch (Exception var20) {
         }

         try {
            if (var1.getProperty("right_click_clan") == null) {
               aS = false;
            } else {
               aS = Boolean.valueOf(var1.getProperty("right_click_clan"));
            }
         } catch (Exception var19) {
         }

         try {
            if (var1.getProperty("hide_non_wild_pets") == null) {
               aT = false;
            } else {
               aT = Boolean.valueOf(var1.getProperty("hide_non_wild_pets"));
            }
         } catch (Exception var18) {
         }

         try {
            if (var1.getProperty("hide_gs_decor") == null) {
               aV = false;
            } else {
               aV = Boolean.valueOf(var1.getProperty("hide_gs_decor"));
            }
         } catch (Exception var17) {
         }

         try {
            if (var1.getProperty("last_update_visit") == null) {
               bg = "";
            } else {
               bg = var1.getProperty("last_update_visit");
            }
         } catch (Exception var16) {
         }

         try {
            if (var1.getProperty("wild_multi") == null) {
               aX = true;
            } else {
               aX = Boolean.valueOf(var1.getProperty("wild_multi"));
            }
         } catch (Exception var15) {
         }

         try {
            if (var1.getProperty("bank_all_pet") == null) {
               aZ = true;
            } else {
               aZ = Boolean.valueOf(var1.getProperty("bank_all_pet"));
            }
         } catch (Exception var14) {
         }

         try {
            p = null;
            if (var1.getProperty("ground_mode") != null) {
               String var53 = var1.getProperty("ground_mode");
               if (var53.contains(".")) {
                  String var4 = var53.split("\\.")[0];
                  String var5 = var53.split("\\.")[1];
                  if (var5.equalsIgnoreCase(n.name())) {
                     r = C_a.b.valueOf(var4);
                     p = r;
                  }
               }
            }
         } catch (Exception var13) {
         }

         try {
            if (h) {
               try {
                  if (var1.getProperty("default_invitation_code") == null) {
                     C_Client_mc.fn = "";
                  } else {
                     C_Client_mc.fn = var1.getProperty("default_invitation_code");
                  }
               } catch (Exception var11) {
               }
            }
         } catch (Exception var12) {
         }

         try {
            if (var1.getProperty("show_icon_equip") == null) {
               bb = true;
            } else {
               bb = Boolean.valueOf(var1.getProperty("show_icon_equip"));
            }
         } catch (Exception var10) {
         }

         try {
            if (var1.getProperty("accomplishments") == null) {
               bl = true;
            } else {
               bl = Boolean.valueOf(var1.getProperty("accomplishments"));
            }
         } catch (Exception var9) {
         }

         try {
            if (var1.getProperty("click_tele") == null) {
               t = true;
            } else {
               t = Boolean.valueOf(var1.getProperty("click_tele"));
            }
         } catch (Exception var8) {
         }

         try {
            if (var1.getProperty("chat_hidden") == null) {
               bc = false;
            } else {
               bc = Boolean.valueOf(var1.getProperty("chat_hidden"));
            }
         } catch (Exception var7) {
         }

         try {
            if (var1.getProperty("lock_spawnable_drop") == null) {
               aL = false;
            } else {
               aL = Boolean.valueOf(var1.getProperty("lock_spawnable_drop"));
            }
         } catch (Exception var6) {
         }
      } catch (IOException var50) {
         var50.printStackTrace();
      }
   }

   public static enum a {
      a("SpawnPK", "http://spawnpk.net"),
      b("Runex", "http://spawnpk.net");

      private String c;
      private String d;

      private a(String var3, String var4) {
         this.c = var3;
         this.d = var4;
      }

      public String a() {
         return this.c;
      }

      public String b() {
         return this.d;
      }
   }

   public static enum b {
      a(0),
      b(16777215),
      c(14079702),
      d(2238754),
      e(13417604);

      public int f;

      private b(int var3) {
         this.f = var3;
      }
   }

   public static enum c {
      a,
      b,
      c;

      public static C_a.c a(String var0) {
         for (C_a.c var4 : values()) {
            if (var4.name().equalsIgnoreCase(var0)) {
               return var4;
            }
         }

         return a;
      }
   }

   public static enum d {
      a,
      b,
      c,
      d,
      e,
      f;
   }
}
