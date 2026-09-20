package rs.p_s.p_c;

import java.util.Set;
import rs.p_e.C_l;

@rs.p_e.C_e(
   a = "devtools"
)
public interface C_a extends rs.p_e.C_b {
   @C_l(
      a = "General",
      b = "General dev settings and toggles",
      c = 0
   )
   String a = "general";
   @C_l(
      a = "Interfaces",
      b = "Dev settings for interfaces",
      c = 1
   )
   String b = "interfaces";
   @C_l(
      a = "Interface Tools",
      b = "Dev tools for interfaces",
      c = 2
   )
   String c = "interfaces2";

   @rs.p_e.C_g(
      b = "showObjectIds",
      c = "Label object IDs",
      d = "Include IDs in the name of the entity",
      h = "general",
      a = 0
   )
   default boolean a() {
      return true;
   }

   @rs.p_e.C_g(
      b = "showNpcIds",
      c = "Label NPC IDs",
      d = "Include IDs in the name of the entity",
      h = "general",
      a = 0
   )
   default boolean b() {
      return true;
   }

   @rs.p_e.C_g(
      b = "showSceneInfo",
      c = "Show scene info",
      d = "Render scene info graphics",
      h = "general",
      a = 0
   )
   default boolean c() {
      return true;
   }

   @rs.p_e.C_g(
      b = "showColorOptions",
      c = "Show color options",
      d = "Show color options when right-clicking items/objects/npcs",
      h = "general",
      a = 0
   )
   default boolean d() {
      return true;
   }

   @rs.p_e.C_g(
      b = "alwaysOnTop",
      c = "Always on top",
      d = "Set window to always on top",
      h = "general",
      a = 0
   )
   default boolean e() {
      return false;
   }

   @rs.p_e.C_g(
      b = "labelIds",
      c = "Label widget IDs",
      d = "Label the ID of parent widgets",
      h = "interfaces",
      a = 0
   )
   default boolean f() {
      return false;
   }

   @rs.p_e.C_g(
      b = "labelTypes",
      c = "Label widget types",
      h = "interfaces",
      d = "",
      a = 1
   )
   default boolean g() {
      return false;
   }

   @rs.p_e.C_g(
      b = "showParents",
      c = "Show parent IDs",
      h = "interfaces",
      d = "",
      a = 5
   )
   default boolean h() {
      return true;
   }

   @rs.p_e.C_g(
      b = "showChildren",
      c = "Show children IDs",
      h = "interfaces",
      d = "",
      a = 10
   )
   default boolean i() {
      return true;
   }

   @rs.p_e.C_g(
      b = "showTypes",
      c = "Display widget types",
      h = "interfaces",
      d = "",
      a = 15
   )
   default Set<C_h> j() {
      return Set.of(C_h.values());
   }

   @rs.p_e.C_g(
      b = "mouseCoordinates",
      c = "Mouse tool",
      d = "",
      h = "interfaces2",
      a = 20
   )
   default boolean k() {
      return false;
   }

   @rs.p_e.C_g(
      b = "builderId",
      c = "Interface Builder",
      d = "",
      h = "interfaces2",
      a = 21
   )
   default int l() {
      return 0;
   }

   @rs.p_e.C_g(
      b = "builderChildId",
      c = "Builder child ID",
      d = "",
      h = "interfaces2",
      a = 22
   )
   default int m() {
      return 0;
   }
}
