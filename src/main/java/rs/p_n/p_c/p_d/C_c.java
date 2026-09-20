package rs.p_n.p_c.p_d;

import java.util.Locale;

public class C_c {
   static final String a = "---";
   static final String b = "--------";
   static final int c = 0;
   static final int d = 1;
   static final int e = 2;
   static final int f = 3;
   static final int g = 4;

   public static void a(int var0) {
      switch (var0) {
         case 0:
            C_a.l(32425).at = "<img=375> Ready";
            C_a.l(32419).Q = "Mark yourself as ready for the raid!";
            break;
         case 1:
            C_a.l(32425).at = "<img=376> Cancel";
            C_a.l(32419).Q = "Cancel your ready status";
            break;
         case 2:
            C_a.l(32425).at = "<img=378> Enter Raid";
            C_a.l(32419).Q = "Enter the raid instance lobby";
            break;
         case 3:
            C_a.l(32425).at = "<img=378> Start Mass";
            C_a.l(32419).Q = "Start the raid mass (lobby stage)";
            break;
         case 4:
            C_a.l(32425).at = "<img=291> Waiting";
            C_a.l(32419).Q = "Waiting for leader..\nYou will be able to join once the\nleader of the mass starts the raid!";
      }
   }

   public static void a(int var0, String var1, String var2) {
      int var3 = 32318;
      if (var0 == 0) {
         var3++;
      } else {
         var3 += 3 + (var0 - 1) * 5;
         if (!C_a.l(var3).E.t.equalsIgnoreCase(C_a.dy.t)) {
            c(var3);
         }

         if (var2.toLowerCase(Locale.ROOT).contains("max")) {
            C_a.l(var3).bf = false;
         } else {
            if (var2.toLowerCase().contains("invit")) {
               C_a.l(var3).Q = "Cancel invitation";
            } else {
               C_a.l(var3).Q = "Kick player";
            }

            C_a.l(var3).bf = true;
         }

         var3 += 3;
      }

      C_a.l(var3).at = var1;
      if (var2.toLowerCase(Locale.ROOT).contains("max")) {
         C_a.l(var3 + 1).bf = false;
      } else {
         C_a.l(var3 + 1).bf = true;
         C_a.l(var3 + 1).at = var2;
      }
   }

   public static void a() {
      int var0 = 32318;

      for (int var1 = 0; var1 < 20; var1++) {
         if (var1 == 0) {
            var0++;
         } else {
            b(var0);
            C_a.l(var0).bf = true;
            var0 += 3;
         }

         C_a.l(var0++).at = "---";
         C_a.l(var0++).at = "--------";
         C_a.l(var0 - 1).bf = true;
      }
   }

   public static void b(int var0) {
      rs.p_n.p_a.C_a.a(var0++, C_a.dw, "Invite a player").a().b(var0, C_a.dx);
   }

   public static void c(int var0) {
      rs.p_n.p_a.C_a.a(var0++, C_a.dy, "Kick player").a().b(var0, C_a.dz);
   }

   public static void a(rs.p_n.p_d.C_c var0) {
      var0.a(rs.p_n.p_a.C_e.a(32309, "raids/bgparty")).a(32301, 7, 43);
      var0.a(rs.p_n.p_a.C_f.a(32310, "Raid Selection").o().m()).a(32309, 88, 55);
      var0.a(rs.p_n.p_a.C_f.a(32311, "Raid Difficulty").o().m()).a(32309, 246, 55);
      var0.a(rs.p_n.p_a.C_f.a(32312, "Aff. Tome Coffer").o().m()).a(32309, 419, 55);
      var0.a(rs.p_n.p_a.C_f.a(32313, "Party Afflictions").o().m()).a(32309, 439, 225);
      var0.a(rs.p_n.p_a.C_f.a(32314, "Members (1/5)").i().m()).a(32309, 14, 108);
      var0.a(rs.p_n.p_a.C_f.a(32315, "Current Status").i().c().m()).a(32309, 312, 108);
      var0.a(rs.p_n.p_a.C_f.a(32308, "Raid: @yel@Grandmaster ToB @gre@(4A)").j().m()).a(32309, 11, 289);
      var0.a(rs.p_n.p_a.C_f.a(32418, "<img=88> Public").a().l().a(51)).a(32309, 11, 307);
      var0.a(rs.p_n.p_a.C_f.a(32585, "<img=88> Friends only").a().l().a(100)).a(32309, 67, 307);
      var0.a(rs.p_n.p_a.C_f.a(32586, "<img=88> Invite only").a().l().a(100)).a(32309, 154, 307);
      rs.p_n.p_a.C_d var1 = rs.p_n.p_a.C_d.a(32316).g(299, 147);
      var1.m(364);
      int var2 = 32317;
      var1.n(rs.p_n.p_a.C_f.a(var2++, "").aw).a(0, 0);

      for (int var3 = 0; var3 < 20; var3++) {
         if (var3 == 0) {
            rs.p_n.p_a.C_e.b(var2, C_a.dA);
            var1.n(var2++).a(2, var3 + 4);
         } else {
            b(var2);
            var1.n(var2).a(1, var3 * 18 + 4);
            var1.n(var2 + 1).a(1, var3 * 18 + 4);
            var2 += 3;
         }

         rs.p_n.p_a.C_f.a(var2++, "---").a().l();
         var1.n(var2 - 1).a(18, var3 * 18 + 5);
         rs.p_n.p_a.C_f.a(var2++, "--------").a().l().c();
         var1.n(var2 - 1).a(296, var3 * 18 + 5);
      }

      var0.a(var1).a(32309, 13, 126);
      rs.p_n.p_a.C_a.b(32419, "raids/sprite 8", "Enter the raid instance lobby").a().a(32420, "raids/sprite 9");
      rs.p_n.p_a.C_f.a(32425, "<img=401> Enter Raid").n().m();
      var0.a(32419).a(32301, 261, 292);
      var0.a(32420).a(32301, 261, 292);
      var0.a(32425).a(32301, 315, 297);
      rs.p_n.p_a.C_a.b(32422, "raids/sprite 8", "Leave the party (disbands if empty)").a().a(32423, "raids/sprite 9");
      rs.p_n.p_a.C_f.a(32426, "<img=377> Leave").n().m();
      var0.a(32422).a(32301, 383, 292);
      var0.a(32423).a(32301, 383, 292);
      var0.a(32426).a(32301, 437, 297);
      var0.a(rs.p_n.p_a.p_a.C_a.a(32429, "Chambers of Xeric <img=185>", "Theatre of Blood <img=184>").h(155, 0).g(16777215, 16750623)).a(32309, 12, 74);
      var0.a(
            rs.p_n.p_a.p_a.C_a.a(
                  32430, "Normal (No reqs.)", "Adept (Req. 10+ raids)", "Expert (Req. 50+ raids)", "Master (Req. 100+ raids)", "Grandmaster (Req. 250+)"
               )
               .h(155, 0)
               .g(16777215, 16750623)
         )
         .a(32309, 171, 74);
      rs.p_n.p_a.p_a.C_a var9 = (rs.p_n.p_a.p_a.C_a)C_a.l(32430);
      var9.i()
         .get(1)
         .b(
            " Adept difficulty\n- +5% rare reward chance\n- Bosses have 50% more HP\n- Bosses have 10% more defence\n- Bosses deal 5% more damage\n- You deal 5% less damage"
         );
      var9.i()
         .get(2)
         .b(
            " Expert difficulty\n- +25% rare reward chance\n- Bosses have 200% more HP\n- Bosses have 20% more defence\n- Bosses deal 7.5% more damage\n- You deal 7.5% less damage"
         );
      var9.i()
         .get(3)
         .b(
            " Master difficulty\n- Receive +2 common rewards\n- +50% rare reward chance\n- Bosses have 300% more HP\n- Bosses have 30% more defence\n- Bosses deal 10% more damage\n- You deal 10% less damage"
         );
      var9.i()
         .get(4)
         .b(
            " Grandmaster difficulty\n- Receive +3 common rewards\n- +75% rare reward chance\n- Bosses have 400% more HP\n- Bosses have 50% more defence\n- Bosses deal 15% more damage\n- You deal 15% less damage"
         );
      rs.p_n.p_a.C_c var4 = rs.p_n.p_a.C_c.g(32427, 1).a(1);
      var4.bE = true;
      var4.bF = true;
      var4.az[0] = 6750;
      var4.ax[0] = 0;
      var0.a(32427).a(32301, 383, 82);
      var0.a(rs.p_n.p_a.C_a.b(32531, "bank/bank 17", "Deposit all tomes from inventory").a().c("bank/bank 18")).a(32301, 437, 73);
      var0.a(rs.p_n.p_a.C_a.b(32534, "bank/bank 31", "Deposit all tomes from bank").a().c("bank/bank 32")).a(32301, 437, 98);
      var0.a(rs.p_n.p_a.C_a.b(32546, "raids/btn1a", "Select").c("raids/btn1b")).a(32301, 356, 130);
      var0.a(rs.p_n.p_a.C_f.a(32561, "Buy x25:@gre@ <tab=55><item=10834>2,500").a().m()).b(32546, 7, 7);
      var0.a(rs.p_n.p_a.C_a.b(32549, "raids/btn1a", "Select").c("raids/btn1b")).a(32301, 356, 158);
      var0.a(rs.p_n.p_a.C_f.a(32562, "Buy x50:@gre@ <tab=55><item=10834>4,500").a().m()).b(32549, 7, 7);
      var0.a(rs.p_n.p_a.C_f.a(32564, "What are Afflictions?").a(133).o().l()).a(32301, 352, 192);
      var0.a(
            rs.p_n.p_a.C_a.b(32596, "raids/refresh 1", "Reload last settings")
               .d("Reload last settings\nApply the same raid type and\ndifficulty as your last instance")
               .a("raids/refresh 2")
         )
         .b(32301, 487, 43);
      rs.p_n.p_a.C_c var5 = rs.p_n.p_a.C_c.g(32458, 1).a(1);
      var5.bE = true;
      var5.bF = true;
      var5.az[0] = 6750;
      var5.ax[0] = 0;
      var0.a(32458).a(32301, 341, 227);
      var0.a(rs.p_n.p_a.C_a.b(32459, "misc/donor 11", "Remove affliction tome(s)").a().c("misc/donor 12")).b(32458, -2, 32);
      var0.a(rs.p_n.p_a.C_a.b(32462, "misc/donor 9", "Add affliction tome(s)").a().c("misc/donor 10")).b(32458, 19, 32);
      var0.a(rs.p_n.p_a.C_e.a(32465, "raids/affbar1")).b(32458, 42, 16);
      var0.a(rs.p_n.p_a.C_a.b(32595, "raids/close1", "Close interface").b("raids/close2")).b(32301, 493, 3);
   }

   public static void b(rs.p_n.p_d.C_c var0) {
      var0.a(rs.p_n.p_a.C_f.a(32570, "You're not currently in a raid party!").n().l()).b(32301, 250, 116);
      var0.a(rs.p_n.p_a.C_f.a(32571, "Would you like to create your own party? Or join an existing one..").o().l()).b(32570, 0, 21);
      var0.a(
            rs.p_n.p_a.C_a.b(32574, "raids/btn3a", "Select")
               .d("<img=17> Create Public\nYour party will be publicly listed and\navailable to players via the \"Join\" tab.")
               .c("raids/btn3b")
         )
         .b(32570, -212, 51);
      var0.a(rs.p_n.p_a.C_f.a(32572, "<img=17> Create @gre@(Public)").o().m()).b(32574, 69, 17);
      var0.a(
            rs.p_n.p_a.C_a.b(32577, "raids/btn3a", "Select")
               .d("<img=17> Create Private\nYour party will only be joinable by\nplayers in your friend's list")
               .c("raids/btn3b")
         )
         .b(32570, -67, 51);
      var0.a(rs.p_n.p_a.C_f.a(32573, "<img=17> Create @or3@(Private)").o().m()).b(32577, 69, 17);
      var0.a(
            rs.p_n.p_a.C_a.b(32580, "raids/btn3a", "Select")
               .d("<img=80> Join Private\nEnter the username of a friend\nto join their private raid party")
               .c("raids/btn3b")
         )
         .b(32570, 78, 51);
      var0.a(rs.p_n.p_a.C_f.a(32583, "<img=80> Join Private").o().m()).b(32580, 69, 17);
      var0.a(
            rs.p_n.p_a.C_a.b(19611, "raids/btn3a", "Select")
               .d(
                  "<img=2> Start Mass\nCreate a special public party with a huge capacity!\nIn addition, mass raids let all players\nparticipate in any difficulty (req. bypass)\n\nNOTE: This button is only visible\nto accounts with authorization"
               )
               .c("raids/btn3b")
         )
         .b(32570, -67, 116);
      var0.a(rs.p_n.p_a.C_f.a(32587, "<img=2> Create @mag@(Mass)").o().m()).b(19611, 69, 17);
      var0.a(rs.p_n.p_a.C_a.b(32595, "raids/close1", "Close interface").b("raids/close2")).b(32301, 493, 3);
   }
}
