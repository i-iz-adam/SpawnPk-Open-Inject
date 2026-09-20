package rs.p_s.p_p;

import java.awt.Color;
import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_o;

@C_e(
   a = "playeroutline"
)
public interface C_a extends rs.p_e.C_b {
   String a = "playeroutline";

   @rs.p_e.C_a
   @C_g(
      b = "playerOutlineColor",
      c = "Outline Color",
      d = "The color for the players outline",
      a = 0
   )
   default Color a() {
      return new Color(1023410176, true);
   }

   @C_g(
      b = "petOutline",
      c = "Outline your pet",
      d = "Display the player outline for your active pet as well",
      a = 10
   )
   default boolean b() {
      return true;
   }

   @C_g(
      b = "borderWidth",
      c = "Border Width",
      d = "Width of the player outline border",
      a = 20
   )
   default int c() {
      return 4;
   }

   @C_g(
      b = "outlineFeather",
      c = "Outline Feather",
      d = "Specify between 0-4 how much the player outline should be faded",
      a = 30
   )
   @C_o(
      b = 4
   )
   default int d() {
      return 4;
   }
}
