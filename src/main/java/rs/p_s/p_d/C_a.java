package rs.p_s.p_d;

import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_l;

@C_e(
   a = "entityhider"
)
public interface C_a extends rs.p_e.C_b {
   String a = "entityhider";
   @C_l(
      a = "Local player (You)",
      b = "",
      c = 1
   )
   String b = "local";
   @C_l(
      a = "Other players",
      b = "",
      c = 2
   )
   String c = "others";
   @C_l(
      a = "Miscellaneous",
      b = "",
      c = 3
   )
   String d = "misc";

   @C_g(
      a = 1,
      b = "hideLocalPlayer",
      c = "Hide local player",
      d = "Configures whether or not the local player is hidden",
      h = "local"
   )
   default boolean a() {
      return true;
   }

   @C_g(
      a = 2,
      b = "hideLocalPlayer2D",
      c = "Hide local 2D (Non-wild)",
      d = "Configures whether or not the local player's hitpoints, prayers, HP bar, etc. is hidden",
      h = "local"
   )
   default boolean b() {
      return false;
   }

   @C_g(
      a = 3,
      b = "hideLocalPet",
      c = "Hide local pet",
      d = "Configures whether or not your pet is hidden",
      h = "local"
   )
   default boolean c() {
      return true;
   }

   @C_g(
      a = 1,
      b = "hidePlayers",
      c = "Hide others (Non-wild)",
      d = "Configures whether or not other players are hidden in non-wilderness areas",
      h = "others"
   )
   default boolean d() {
      return true;
   }

   @C_g(
      a = 2,
      b = "hidePlayers2D",
      c = "Hide other 2D (Non-wild)",
      d = "Configures whether or not other players HP bars, prayers, hitsplats, etc. are hidden in non-wilderness areas",
      h = "others"
   )
   default boolean e() {
      return false;
   }

   @C_g(
      a = 3,
      b = "hideOtherPets",
      c = "Hide other pets (Non-wild)",
      d = "Configures whether or not other player pets are hidden",
      h = "others"
   )
   default boolean f() {
      return true;
   }

   @C_g(
      a = 4,
      b = "hideOtherMinipets",
      c = "Hide other mini-pets",
      d = "Configures whether or not other player mini-pets are hidden",
      h = "others"
   )
   default boolean g() {
      return true;
   }

   @C_g(
      a = 0,
      b = "hideEdgeBots",
      c = "Hide edgeville bots",
      d = "Configures whether or not to hide the PK bots in edgeville",
      h = "misc"
   )
   default boolean h() {
      return false;
   }

   @C_g(
      a = 1,
      b = "hideProjectiles",
      c = "Hide projectiles",
      d = "Configures whether or not projectiles are hidden",
      h = "misc"
   )
   default boolean i() {
      return true;
   }

   @C_g(
      a = 2,
      b = "hideYoshi",
      c = "Hide standard yoshi pets (others)",
      d = "Configures whether or not to hide yoshi pets everywhere",
      h = "misc"
   )
   default boolean j() {
      return true;
   }

   @C_g(
      a = 3,
      b = "hideYoshi",
      c = "Hide standard fairy pets (others)",
      d = "Configures whether or not to hide treasure fairy pets everywhere",
      h = "misc"
   )
   default boolean k() {
      return true;
   }
}
