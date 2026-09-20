package rs.p_s.p_h;

import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_l;
import rs.p_e.C_q;

@C_e(
   a = "infoBoxes"
)
public interface C_b extends rs.p_e.C_b {
   String a = "infoBoxes";
   @C_l(
      a = "Timers",
      b = "Info boxes for timers",
      c = 1
   )
   String b = "timers";
   @C_l(
      a = "Counters",
      b = "Info boxes for counters",
      c = 2
   )
   String c = "counters";
   @C_l(
      a = "Statuses",
      b = "Info boxes for statuses",
      c = 3
   )
   String d = "statuses";
   @C_l(
      a = "Appearence",
      b = "The appearence of infoboxes",
      c = 0
   )
   String e = "appearence";

   @C_g(
      b = "antifireTimer",
      c = "Antifire timer",
      d = "Display this timer as an infobox when active",
      h = "timers",
      a = 0
   )
   default boolean a() {
      return true;
   }

   @C_g(
      b = "antipoisonTimer",
      c = "Antipoison timer",
      d = "Display this timer as an infobox when active",
      h = "timers",
      a = 1
   )
   default boolean b() {
      return true;
   }

   @C_g(
      b = "antiVenomTimer",
      c = "Anti-venom timer",
      d = "Display this timer as an infobox when active",
      h = "timers",
      a = 2
   )
   default boolean c() {
      return true;
   }

   @C_g(
      b = "dfsTimer",
      c = "Dragonfire shield timer",
      d = "Display this timer as an infobox when active",
      h = "timers",
      a = 3
   )
   default boolean d() {
      return true;
   }

   @C_g(
      b = "freezeTimer",
      c = "Freeze timer",
      d = "Display this timer as an infobox when active",
      h = "timers",
      a = 4
   )
   default boolean e() {
      return true;
   }

   @C_g(
      b = "teleblockTimer",
      c = "Teleblock duration",
      d = "Display this timer as an infobox when active",
      h = "timers",
      a = 5
   )
   default boolean f() {
      return true;
   }

   @C_g(
      b = "bloodSlayerTimer",
      c = "Blood slayer task duration",
      d = "Display this timer as an infobox when active",
      h = "timers",
      a = 6
   )
   default boolean g() {
      return true;
   }

   @C_g(
      b = "counterTimeout",
      c = "Counter Expiry",
      d = "Set the time until counter info boxes expire",
      h = "counters",
      a = 0
   )
   @C_q(
      a = " mins"
   )
   default int h() {
      return 5;
   }

   @C_g(
      b = "slayerCounter",
      c = "Slayer task progress",
      d = "Display this counter as an infobox when active",
      h = "counters",
      a = 1
   )
   default boolean i() {
      return true;
   }

   @C_g(
      b = "taskScroll",
      c = "Task scroll progress",
      d = "Display this counter as an infobox when active",
      h = "counters",
      a = 2,
      e = true
   )
   default boolean j() {
      return true;
   }

   @C_g(
      b = "soulHunter",
      c = "Soul hunter progress",
      d = "Display this counter as an infobox when active",
      h = "counters",
      a = 3
   )
   default boolean k() {
      return true;
   }

   @C_g(
      b = "wanderCounter",
      c = "Wanderer's task progress",
      d = "Display this counter as an infobox when active",
      h = "counters",
      a = 4
   )
   default boolean l() {
      return true;
   }

   @C_g(
      b = "showCombatSkillBoosts",
      c = "Combat buffs / debuffs",
      d = "Display this status as an infobox when active",
      h = "statuses",
      a = 0
   )
   default boolean m() {
      return false;
   }

   @C_g(
      b = "showStatResetTimer",
      c = "Buff change timer",
      d = "Display this status as an infobox when active",
      h = "statuses",
      a = 1
   )
   default boolean n() {
      return false;
   }

   @C_g(
      b = "raidAfflictionStatus",
      c = "Raid afflictions",
      d = "Display this status as an infobox when active",
      h = "statuses",
      a = 3
   )
   default boolean o() {
      return true;
   }

   @C_g(
      b = "infoBoxVertical",
      c = "Display infoboxes vertically",
      d = "Toggles the infoboxes to display vertically",
      a = 40,
      h = "appearence",
      e = true
   )
   default boolean p() {
      return false;
   }

   @C_g(
      b = "infoBoxSize",
      c = "Infobox size",
      d = "Configures the size of each infobox in pixels",
      a = 42,
      h = "appearence"
   )
   @C_q(
      a = "px"
   )
   default int q() {
      return 32;
   }

   @C_g(
      b = "infoBoxTextOutline",
      c = "Outline infobox text",
      d = "Draw a full outline instead of a simple shadow for infobox text",
      a = 43,
      h = "appearence"
   )
   default boolean r() {
      return false;
   }

   @C_g(
      b = "infoBoxTooltips",
      c = "Display infobox hover tooltips",
      d = "Whether to display the tooltips of infoboxes when hovering over them",
      a = 44,
      h = "appearence"
   )
   default boolean s() {
      return true;
   }
}
