package rs.p_s.p_q;

import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_o;

@C_e(
   a = "pvptracker"
)
public interface C_a extends rs.p_e.C_b {
   @C_o(
      a = 1,
      b = 1000
   )
   @C_g(
      b = "fightHistoryRenderLimit",
      c = "Max Rendered Fights",
      d = "Maximum number of previous fights to be displayed in the fight history side-panel.<br>WILL cause lag spikes at very high numbers. This should be small if you have low RAM",
      a = 205
   )
   default int a() {
      return 10;
   }

   @C_g(
      b = "exactNameFilter",
      c = "Exact Name Filter",
      d = "Makes the username filter look for an exact match (case-insensitive), rather than any name starting with the filter.",
      a = 220
   )
   default boolean b() {
      return false;
   }

   @C_g(
      b = "nameFilter",
      c = "Name Filter",
      d = "Hidden config used to save user's selected name filter for the panel views.",
      a = 1000,
      e = true
   )
   default String c() {
      return "";
   }
}
