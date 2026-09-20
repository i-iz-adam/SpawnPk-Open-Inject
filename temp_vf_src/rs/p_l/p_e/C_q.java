package rs.p_l.p_e;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;

public class C_q {
   private static final int b = 3;
   private static final int c = 180;
   private static final int d = 35;
   private static String e;
   public static boolean a = false;
   private static boolean f = false;
   private static C_F_uc g;
   private static C_F_uc h;
   private static C_F_uc i;
   private static C_F_uc j;
   private static C_F_uc k;
   private C_F_uc l;
   private final C_Client_mc m;
   private final C_q.a n;
   private final int o;
   private final int p;
   private String q;
   private long r;
   private int s;
   private int t;
   private int u;
   private final String v;

   public C_q(C_Client_mc var1, C_q.a var2, int var3) {
      this.v = var2.name();
      this.m = var1;
      this.n = var2;
      this.o = var2.ao;
      this.p = var2.ap;
      this.s = var3;
      this.t = 0;
      this.q = var2.an;
      this.r = System.currentTimeMillis();
      if (var2.am == null) {
         this.u = var2.aq;
         this.c();
      } else {
         this.l = new C_F_uc(var2.am);
      }
   }

   public C_q(C_Client_mc var1, String var2, String var3, int var4, int var5) {
      this.v = var2;
      this.m = var1;
      this.n = C_q.a.a;
      this.s = var5;
      this.t = 0;
      this.u = var4;
      this.o = 4;
      this.p = 0;
      this.q = var3;
      this.r = System.currentTimeMillis();
      this.c();
   }

   public static void a(List<C_q> var0) {
      a = false;
      if (var0.size() != 0) {
         if (!f) {
            d();
         }

         C_Launcher_mc.n().o();
         int var1 = 508 + (C_Client_mc.ai() ? 0 : 5);
         C_Launcher_mc.n().o();
         int var2 = 297 + (C_Client_mc.ai() ? 0 : 4);
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var2 += C_Client_mc.ah - 499;
            var1 += 8;
         }

         e = null;
         if (rs.p_f.C_a.aD) {
            ArrayList var3 = new ArrayList();
            j.g(var1, var2, 180);
            var1 -= 35;

            for (C_q var5 : var0) {
               if (var5.a(var1, var2)) {
                  var1 -= 35;
               } else {
                  var3.add(var5);
               }
            }

            for (C_q var10 : var3) {
               var0.remove(var10);
            }

            h.b(var1 + 25, var2 + 1, 180);
         } else {
            var1 -= 38;
            g.b(var1 + 25, var2, 180);
         }

         C_Launcher_mc.n().o();
         int var7 = C_Client_mc.hP;
         C_Launcher_mc.n().o();
         int var9 = C_Client_mc.hQ;
         if (var7 >= var1 + 25 && var7 <= var1 + 45 && var9 >= var2 && var9 <= var2 + 40) {
            a = true;
         }

         if (e != null) {
            C_Launcher_mc.n().o().b(var7 - 55, var9 - 15, e);
         }
      }
   }

   public boolean a(int var1, int var2) {
      i.g(var1, var2, 180);
      if (this.l == null) {
         this.c();
         return true;
      } else {
         this.l.g(var1 + this.o, var2 + this.p, 180);
         if (this.s == -1) {
            k.f(var1 + 11, var2 + 22);
         } else {
            long var3 = System.currentTimeMillis() - this.r;
            long var5 = (long)this.s - var3 / 1000L;
            byte var7 = 3;
            if (!rs.p_l.p_b.C_a.a()) {
               if (var5 >= 3L && this.t != 255) {
                  this.t += 3;
               } else if (var5 < 3L) {
                  if (this.t <= 0) {
                     return false;
                  }

                  this.t -= 3;
               }
            }

            Date var8 = new Date(var5 * 1000L);
            String var9 = new SimpleDateFormat("m:ss").format(var8);
            if (var5 >= 3600L) {
               if (var5 >= 36000L) {
                  var9 = " " + (int)Math.floor((double)(var5 / 3600L)) + "h";
               } else {
                  var9 = " "
                     + (int)Math.floor((double)(var5 / 3600L))
                     + "h"
                     + ((int)Math.floor((double)(var5 / 60L)) - (int)Math.floor((double)(var5 / 3600L * 60L)))
                     + "m";
               }
            }

            C_Client_mc.gl.c(var9, var1 + 19, var2 + 34, 16777215, 1);
         }

         if (C_Client_mc.hP >= var1 && C_Client_mc.hP <= var1 + 43 && C_Client_mc.hQ >= var2 && C_Client_mc.hQ <= var2 + 34) {
            String var10 = this.q;
            if (var10 == null) {
               String var4 = this.n.name().toLowerCase().substring(0, 1).toUpperCase() + this.n.name().toLowerCase().substring(1);
               var10 = var4 + "  ";
            }

            e = " " + var10 + " ";
         }

         return true;
      }
   }

   public void a(int var1) {
      this.r = System.currentTimeMillis();
      this.s = var1;
   }

   private void c() {
      this.l = rs.p_d.C_k.a(this.u, 1, -1, 21);
   }

   private static void d() {
      h = new C_F_uc("popups/timer 0");
      g = new C_F_uc("popups/timer 1");
      i = new C_F_uc("popups/timer 2");
      j = new C_F_uc("popups/timer 3");
      k = new C_F_uc("icons/infinite white", false);
      f = true;
   }

   public C_q.a a() {
      return this.n;
   }

   public String b() {
      return this.v;
   }

   public static enum a {
      a("", 0),
      b("Hunter elixir\nDouble blood slayer points\n(Does not stack with streak bonus)", 27456),
      c("Hunter elixir\nDouble soul shards", 27455),
      d("Dfs cooldown", 11284),
      e("Twisted heart\nCooldown duration", 21092),
      f("Vote Boost\n+10% PvM damage\n+10% Drop rate bonus", 26982),
      g("Vengeance cooldown", "popups/vengtimer", 13, 4),
      h("Antifire duration", "popups/antitimer", 13, 2),
      i("Anti-venom duration", "popups/venomtimer", 13, 2),
      j("Charge duration", "popups/chargetimer", 12, 4),
      k("Stamina duration", "popups/staminatimer", 13, 2),
      l("Teleblock duration", "popups/teleblocktimer", 9, 2),
      m("Pet silence\nWhile under silence, your \npet's effects are disabled and \nyou can't release other pets!", "popups/petblocktimer", 9, 2),
      n("Blood lust\nEarn +10 blood money\nfrom player kills.", "popups/bloodlust", 12, 4),
      o("Survival timer\nAfter this duration, you lose.\nYou can gain more time by\nplayer kills and chest loots.", "popups/minigame", 12, 5),
      p("Amnesty\nWhile under amnesty, \nplayers can't harm you.\nAttacking a player or the\njungle demon will cancel it.", "popups/amnestyskull", 11, 2),
      q("Magic sickness\nYou can't teleport in 20+ wild\nwith your spellbook, items, or\npets during sickness.", "popups/sicknesstimer", 9, 2),
      r("Kharazi safe bank\nAfter this duration\nyou will be removed\nfrom the bank hut.", "popups/banktimer", 11, 4),
      s("Freeze duration", "popups/freeze", 11, 4),
      t("Imbued heart\nCooldown duration", "popups/imbued", 10, 3),
      u("Enchanted heart\nCooldown duration", "popups/enchantedheart", 10, 3),
      v("Infernal heart\nCooldown duration", "popups/infernal", 10, 3),
      w("Drop rate bonus\nChaos elemental", "popups/drbonus", 10, 4),
      x("Drop rate bonus\nBarrelchest", "popups/drbonus", 10, 4),
      y("Drop rate bonus\nKraken", "popups/drbonus", 10, 4),
      z("Drop rate bonus\nVet'ion", "popups/drbonus", 10, 4),
      A("Drop rate bonus\nCrazy archaeologist", "popups/drbonus", 10, 4),
      B("Blood slayer task\nComplete the task in time!", "popups/slayer", 11, 4),
      C("Drop rate bonus\nDemonic gorilla", "popups/drbonus", 10, 4),
      D("Drop rate bonus\nWildywyrm", "popups/drbonus", 10, 4),
      E("Thief scroll\n@gre@2x@whi@ loot from\nthieving.", "popups/drbonus", 10, 4),
      F("Larran's loot\n@gre@2x@whi@ larrans keys from\nblood slayer tasks.", "popups/drbonus", 10, 4),
      G("Drop rate bonus\nDrop rate increased by +5%", "popups/drbonus", 10, 4),
      H("Event booster\nGives @gre@25%@whi@ more @yel@event\n@yel@currency@whi@ from @or1@World events!", "popups/eventboost", 10, 4),
      I("Event booster\nGives @gre@25%@whi@ more @yel@event\n@yel@currency@whi@ from @or1@World events!", "popups/eventboost", 10, 4),
      J("Hunger games perk\nTemporary power-up perk", "popups/eventboost", 10, 4),
      K("Coin bonus\nPvM GP increased by +25%", "popups/drbonus", 10, 4),
      L("Luck scroll\nDrop rate bonus @gre@+10%", "popups/drbonus", 10, 4),
      M("Super luck scroll\nDrop rate bonus @gre@+15%", "popups/drbonus", 10, 4),
      N("Minigame scroll\n2x minigame points & +25%\nKharazi drop rate", "popups/drbonus", 10, 4),
      O("Blood discount\n@gre@10%@whi@ cheaper purchases\nfrom Blood fountain shops!", "popups/drbonus", 10, 4),
      P("Hotspot bonus\n@gre@2x@whi@ Hotspot Points <img=158>\nfrom hotspots for limited time", "popups/drbonus", 10, 4),
      Q("Vintage bonus\n2X Vintage points and\n+25% ticket drops", "popups/drbonus", 10, 4),
      R("Raid scroll\nRaids reward chance @gre@+10%", "popups/drbonus", 10, 4),
      S("Slayer crystal\nDouble slayer and\nblood slayer points", "popups/drbonus", 10, 4),
      T("Hotspot crystal\nDouble chance for\nhot spot caskets", "popups/drbonus", 10, 4),
      U("Raids chart\nIncreased chance for\nraids chest rares!", "popups/drbonus", 10, 4),
      V("Seasonal boost\nGives @gre@+15%@whi@ more @yel@drop\n@yel@rate bonus@whi@ during Seasonal event!", "popups/eventboost", 10, 4),
      W("Seasonal double\nGives @gre@+5%@whi@ chance for @yel@doubled\n@yel@drops@whi@ during Seasonal event!", "popups/eventboost", 10, 4),
      X("Seasonal hotspot\nGives @gre@25%@whi@ more @yel@hotspot\n@yel@caskets@whi@ during Seasonal event!", "popups/eventboost", 10, 4),
      Y("Seasonal revs\nGives @gre@25%@whi@ more @yel@superior\n@yel@revenants@whi@ during Seasonal event!", "popups/eventboost", 10, 4),
      Z("Adventure Scroll\n+10 blood money from PKs\n+15% PvM damage\n+25% Drop rate bonus", "popups/drbonus", 11, 4),
      aa("Dragon Boost\n+10% PvM damage\nagainst Dragons", "popups/pvmboost", 11, 4),
      ab("Revenant Boost\n+10% PvM damage\nagainst Revenants", "popups/pvmboost", 11, 4),
      ac("Deep Wild Boost\n+10% PvM damage\nin Deep Wild", "popups/pvmboost", 11, 4),
      ad("Raid Boost\n+10% PvM damage\nagainst Raid monsters", "popups/pvmboost", 11, 4),
      ae("Maledictus Boost\n+20% Superior Blood\nRevenant chance", "popups/drbonus", 11, 4),
      af("Slayer speed pass\nAssigned slayer tasks\nhave kill requirements\nreduced by 50%", "popups/slayer", 11, 4),
      ag("Donator elixir\n2X zone tokens for\n all donator zones", "popups/dzone_elixir", 11, 4),
      ah("Cosmic gold\nReceive @gre@+25%@whi@ more gold\nfrom all PvM drops", "popups/drbonus", 10, 4),
      ai("Cosmic luck\nDrop rate bonus @gre@+5%", "popups/drbonus", 10, 4),
      aj("Cosmic strength\nDeal @gre@+5%@whi@ more PvM damage", "popups/pvmboost", 11, 4),
      ak("Frenzy\nDeal +10% melee damage in PvM\n(+5% in PvP)", "popups/werewolf", 9, 2),
      al("Blood Satiation\nGrants +10% PvM damage & accuarcy\nfor magic and range (+5% in PvP)", "popups/vampyre", 9, 2);

      private String am;
      private String an;
      private int ao;
      private int ap;
      private int aq;

      private a(String var3, String var4, int var5, int var6) {
         this.an = var3;
         this.am = var4;
         this.ao = var5;
         this.ap = var6;
      }

      private a(String var3, int var4) {
         this.an = var3;
         this.aq = var4;
         this.ao = 4;
      }
   }
}
