package rs.p_s.p_a;

import rs.p_e.C_g;
import rs.p_e.C_l;

@rs.p_e.C_e(
   a = "combatInfo"
)
public interface C_a extends rs.p_e.C_b {
   String a = "combatInfo";
   @C_l(
      a = "Opponent overlays",
      b = "",
      c = 0
   )
   String b = "opponentOverlay";
   @C_l(
      a = "Hits and health",
      b = "",
      c = 4
   )
   String c = "hitOverlay";

   @C_g(
      b = "showOpponentOverlay",
      c = "Show opponent overlay",
      d = "Display the overlay with opponent information",
      h = "opponentOverlay",
      a = 0
   )
   default boolean a() {
      return true;
   }

   @C_g(
      b = "animatedOverlayBar",
      c = "Animate overlay health bar",
      d = "Animate health loss on the overlay (or disable to keep changes instant)",
      h = "opponentOverlay",
      a = 1
   )
   default boolean b() {
      return true;
   }

   @C_g(
      b = "opponentOverlayStyle",
      c = "Opponent overlay style",
      d = "The style of opponent overlay to display",
      h = "opponentOverlay",
      a = 2
   )
   default C_c c() {
      return C_c.a;
   }

   @C_g(
      b = "bhOverlayStyle",
      c = "Bounty hunter overlay style",
      d = "The style of bounty hunter overlay to display",
      h = "opponentOverlay",
      a = 3
   )
   default C_c d() {
      return C_c.a;
   }

   @C_g(
      b = "bossOverlayStyle",
      c = "Boss overlay style",
      d = "The style of boss overlay to display",
      h = "opponentOverlay",
      a = 3
   )
   default C_c e() {
      return C_c.a;
   }

   @C_g(
      b = "hitMarkStyle",
      c = "Hitsplats",
      d = "The style of health bar to display",
      h = "hitOverlay",
      a = 0
   )
   default C_e f() {
      return C_e.a;
   }

   @C_g(
      b = "healthBarStyle",
      c = "Health bars",
      d = "The style of health bar to display",
      h = "hitOverlay",
      a = 1
   )
   default C_d g() {
      return C_d.a;
   }

   @C_g(
      b = "multipliedHits",
      c = "Multiplied 10x hits",
      d = "Display damage at a 10X multiple (e.g. 10 instead of 1)",
      h = "hitOverlay",
      a = 4
   )
   default boolean h() {
      return false;
   }
}
