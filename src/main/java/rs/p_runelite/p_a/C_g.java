package rs.p_runelite.p_a;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_g {
   public static final int a = 516;
   public static final int b = 20;
   public static final int c = 412;
   public static final int d = 225;
   public static final int e = 965;
   public static final int f = 478;
   public static final int g = 1025;
   public static final int h = 582;
   public static final int i = 413;
   public static final int j = 561;
   public static final int k = 779;
   public static final int l = 27;
   public static final int m = 577;
   public static final int n = 729;
   public static final int o = 491;
   public static final int p = 365;
   public static final int q = 502;
   public static final int r = 900;
   public static final int s = 113;
   public static final int t = 872;
   public static final int u = 1062;
   public static final int v = 1226;
   public static final int w = 454;
   public static final int x = 74;
   public static final int y = 454;
   public static final int z = 539;
   public static final int A = 493;
   public static final int B = 847;
   public static final int C = 1125;
   public static final int D = 1504;

   public static boolean a(int var0) {
      return var0 == 20 || var0 == 412 || var0 == 225 || var0 == 965 || var0 == 478 || var0 == 1025 || var0 == 582 || var0 == 413;
   }

   public static boolean b(int var0) {
      return var0 == 561 || var0 == 779 || var0 == 27 || var0 == 577 || var0 == 729 || var0 == 491 || var0 == 365;
   }

   public static boolean c(int var0) {
      return var0 == 502 || var0 == 900 || var0 == 113 || var0 == 872 || var0 == 1062;
   }

   public static boolean d(int var0) {
      return var0 == 454 || var0 == 74 || var0 == 454 || var0 == 539 || var0 == 493 || var0 == 847 || var0 == 447;
   }

   public static int e(int var0) {
      rs.p_a.C_j var1 = f(var0);
      return var1 == null ? -1 : var1.n();
   }

   public static rs.p_a.C_j f(int var0) {
      C_Client_mc var1 = C_Launcher_mc.n().o();
      int var2 = var1.eJ[var0];
      return var2 >= 0 && var2 < var1.cA.length ? var1.cA[var2] : null;
   }
}
