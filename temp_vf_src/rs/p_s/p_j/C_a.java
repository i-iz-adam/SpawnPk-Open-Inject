package rs.p_s.p_j;

import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_l;
import rs.p_s.p_b.C_m;

@C_e(
   a = "keyremapping"
)
public interface C_a extends rs.p_e.C_b {
   @C_l(
      a = "Camera Remapping",
      b = "Settings for remapping the camera",
      c = 0
   )
   String a = "camera";
   @C_l(
      a = "F-key remapping",
      b = "Settings for remapping the F-keys.",
      c = 1
   )
   String b = "fKeys";

   @C_g(
      a = 1,
      b = "cameraRemap",
      c = "Remap Camera",
      d = "Configures whether the camera movement uses remapped keys",
      h = "camera"
   )
   default boolean a() {
      return true;
   }

   @C_g(
      a = 2,
      b = "up",
      c = "Camera Up key",
      d = "The key which will replace up.",
      h = "camera"
   )
   default C_m b() {
      return new C_m(87, 0);
   }

   @C_g(
      a = 3,
      b = "down",
      c = "Camera Down key",
      d = "The key which will replace down.",
      h = "camera"
   )
   default C_m c() {
      return new C_m(83, 0);
   }

   @C_g(
      a = 4,
      b = "left",
      c = "Camera Left key",
      d = "The key which will replace left.",
      h = "camera"
   )
   default C_m d() {
      return new C_m(65, 0);
   }

   @C_g(
      a = 5,
      b = "right",
      c = "Camera Right key",
      d = "The key which will replace right.",
      h = "camera"
   )
   default C_m e() {
      return new C_m(68, 0);
   }

   @C_g(
      a = 6,
      b = "fkeyRemap",
      c = "Remap F-keys",
      d = "Configures whether f-keys use remapped keys.",
      h = "fKeys"
   )
   default boolean f() {
      return false;
   }

   @C_g(
      a = 7,
      b = "f1",
      c = "F1",
      d = "The key which will replace F1.",
      h = "fKeys"
   )
   default C_m g() {
      return new C_m(49, 0);
   }

   @C_g(
      a = 8,
      b = "f2",
      c = "F2",
      d = "The key which will replace F2.",
      h = "fKeys"
   )
   default C_m h() {
      return new C_m(50, 0);
   }

   @C_g(
      a = 9,
      b = "f3",
      c = "F3",
      d = "The key which will replace F3.",
      h = "fKeys"
   )
   default C_m i() {
      return new C_m(51, 0);
   }

   @C_g(
      a = 10,
      b = "f4",
      c = "F4",
      d = "The key which will replace F4.",
      h = "fKeys"
   )
   default C_m j() {
      return new C_m(52, 0);
   }

   @C_g(
      a = 11,
      b = "f5",
      c = "F5",
      d = "The key which will replace F5.",
      h = "fKeys"
   )
   default C_m k() {
      return new C_m(53, 0);
   }

   @C_g(
      a = 12,
      b = "f6",
      c = "F6",
      d = "The key which will replace F6.",
      h = "fKeys"
   )
   default C_m l() {
      return new C_m(54, 0);
   }

   @C_g(
      a = 13,
      b = "f7",
      c = "F7",
      d = "The key which will replace F7.",
      h = "fKeys"
   )
   default C_m m() {
      return new C_m(55, 0);
   }

   @C_g(
      a = 14,
      b = "f8",
      c = "F8",
      d = "The key which will replace F8.",
      h = "fKeys"
   )
   default C_m n() {
      return new C_m(56, 0);
   }

   @C_g(
      a = 15,
      b = "f9",
      c = "F9",
      d = "The key which will replace F9.",
      h = "fKeys"
   )
   default C_m o() {
      return new C_m(57, 0);
   }

   @C_g(
      a = 16,
      b = "f10",
      c = "F10",
      d = "The key which will replace F10.",
      h = "fKeys"
   )
   default C_m p() {
      return new C_m(48, 0);
   }

   @C_g(
      a = 17,
      b = "f11",
      c = "F11",
      d = "The key which will replace F11.",
      h = "fKeys"
   )
   default C_m q() {
      return new C_m(45, 0);
   }

   @C_g(
      a = 18,
      b = "f12",
      c = "F12",
      d = "The key which will replace F12.",
      h = "fKeys"
   )
   default C_m r() {
      return new C_m(61, 0);
   }
}
