package rs.p_n.p_c;

import java.awt.Color;
import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;
import java.util.Map;
import rs.C_Client_mc;

public class C_w extends rs.p_n.C_c {
   public static boolean c = false;
   public static String d = "setyellcolors";
   public static String e = "FE0002";
   public static String f = "0";
   public static Map<Integer, String> g = new HashMap<>();
   public static Map<Integer, Integer> bI = new HashMap<>();
   public static int[] bJ = new int[]{924, 924, 62575, 62575, 6015, 0};
   public static int bK = 0;

   public C_w(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   public static void h() {
      if (f == null) {
         rs.p_n.C_e.H['\uf632'].at = "<col=" + e + ">Sample on chat background";
      } else {
         rs.p_n.C_e.H['\uf632'].at = "<shad=" + f + "><col=" + e + ">Sample on chat background";
      }
   }

   public static void i() {
      C_ab.l();
      C_ab.m();
      C_ab.bM = true;
      C_ab.a("CAPE", 23063);
      o(b(bJ[bK], bK != 5));
   }

   public static void m(int var0) {
      if (C_Client_mc.cH == 63000) {
         if (var0 == 63027) {
            String var1 = "::" + d + " " + e;
            if (f != null) {
               var1 = var1 + " " + f;
            }

            C_Client_mc.ap = String.valueOf(var1);
         }

         if (c && var0 == 63024) {
            rs.p_n.C_e.H['\uf62e'].E = new rs.p_l.C_F_uc("gambling/sprite 2");
            rs.p_n.C_e.H['\uf62f'].E = new rs.p_l.C_F_uc("gambling/sprite 1");
            c = false;
            h();
         }

         if (!c && var0 == 63025) {
            rs.p_n.C_e.H['\uf62e'].E = new rs.p_l.C_F_uc("gambling/sprite 1");
            rs.p_n.C_e.H['\uf62f'].E = new rs.p_l.C_F_uc("gambling/sprite 2");
            c = true;
            h();
         }

         if (var0 >= 63002 && var0 <= 63021) {
            if (c) {
               f = g.get(var0);
            } else {
               e = g.get(var0);
            }

            h();
         }
      } else if (C_Client_mc.cH == 63036) {
         if (var0 == 63027) {
            String var4 = "::compcolors ";
            int[] var2 = new int[bJ.length];

            for (int var3 = 0; var3 < bJ.length; var3++) {
               var2[var3] = b(bJ[var3], var3 != 5) - 63002;
            }

            var4 = var4 + var2[4] + " ";
            var4 = var4 + var2[0] + " ";
            var4 = var4 + var2[2] + " ";
            var4 = var4 + var2[1] + " ";
            var4 = var4 + var2[3] + " ";
            var4 = var4 + var2[5];
            C_Client_mc.ap = String.valueOf(var4);
         }

         if (var0 >= 63002 && var0 <= 63021) {
            int var11 = b("#" + g.get(var0));
            int var13 = bJ[bK];
            if (bK == 5) {
               var11 = Integer.parseInt(g.get(var0), 16);
            }

            bI.put(57343, 57443);
            bJ[bK] = var11;
            if (var13 != var11) {
               C_ab.m();
               C_ab.bM = true;
            }

            o(var0);
         }

         if (var0 >= 63046 && var0 <= 63051) {
            bK = var0 - 63046;
            o(b(bJ[bK], bK != 5));

            for (int var12 = 63040; var12 <= 63045; var12++) {
               rs.p_n.C_e.H[var12].E = new rs.p_l.C_F_uc(var12 != 63040 + bK ? "gambling/sprite 1" : "gambling/sprite 2");
            }
         }
      }
   }

   public static int a(int var0, boolean var1) {
      return !var1 ? Integer.parseInt(g.get(63002 + var0), 16) : b("#" + g.get(63002 + var0));
   }

   public static int b(String var0) {
      Color var1 = Color.decode(var0);
      return f(var1.getRed(), var1.getGreen(), var1.getBlue());
   }

   public static int f(int var0, int var1, int var2) {
      float[] var3 = Color.RGBtoHSB(var0, var1, var2, null);
      float var4 = var3[0];
      float var5 = var3[1];
      float var6 = var3[2];
      int var7 = (int)(var4 * 63.0F);
      int var8 = (int)(var5 * 7.0F);
      int var9 = (int)(var6 * 127.0F);
      int var10 = (var7 << 10) + (var8 << 7) + var9;
      if (bI.get(var10) != null) {
         var10 = bI.get(var10);
      }

      return var10;
   }

   public static int n(int var0) {
      int var1 = var0 >> 10 & 63;
      int var2 = var0 >> 7 & 7;
      int var3 = var0 & 127;
      return Color.HSBtoRGB((float)var1 / 63.0F, (float)var2 / 7.0F, (float)var3 / 127.0F);
   }

   public static int b(int var0, boolean var1) {
      for (Integer var3 : g.keySet()) {
         int var4 = var1 ? b("#" + g.get(var3)) : Integer.parseInt(g.get(var3), 16);
         if (var4 == var0) {
            return var3;
         }
      }

      return 63002;
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(63000);
      h(63001, "options/colors/0");

      for (int var2 = 1; var2 <= 20; var2++) {
         a(63001 + var2, "options/colors/" + var2, "Select color");
      }

      c(63022, 2, "gambling/sprite");
      c(63023, 1, "gambling/sprite");
      a(63024, "<tab=20>Font color", "Select color type", this.a, 0, 16750623, false, true, 150);
      a(63025, "<tab=20>Shadow color", "Select color type", this.a, 0, 16750623, false, true, 150);
      a(63026, "<shad=", "Select color type", this.a, 0, 16750623, false, true, 150);
      a(63026, "<shad=" + f + "><col=" + e + ">Sample on chat background", this.a, 1, 16750623, true, false);
      a(63027, "teleport/SPRITE", 10, 100, 32, "Confirm colors", -1, 63028, 1);
      a(63028, "teleport/SPRITE", 11, 100, 32, 63029);
      a(63030, "<img=24> Confirm", this.a, 0, 16751360, true, true);
      a(63031, "teleport/SPRITE", 10, 100, 32, "Cancel colors", -1, 63032, 1);
      a(63032, "teleport/SPRITE", 11, 100, 32, 63033);
      a(63034, "<img=25> Cancel", this.a, 0, 16751360, true, true);
      a(63035, "Text Color Selection Menu", this.a, 2, 16751360, true, true);
      var1.k(33);
      var1.b(0, 63001, 108, 17);
      short var9 = 162;
      short var3 = 162;
      byte var4 = 50;
      int var5 = 0;

      for (int var6 = 1; var6 <= 20; var6++) {
         var1.b(var6, 63001 + var6, var9, var4);
         var9 += 40;
         if (++var5 == 5) {
            var4 += 50;
            var9 = var3;
            var5 = 0;
         }
      }

      g.put(63002, "FE0002");
      g.put(63003, "FEFF01");
      g.put(63004, "FF1BFF");
      g.put(63005, "FF4DFF");
      g.put(63006, "B07EFF");
      g.put(63007, "0");
      g.put(63008, "363435");
      g.put(63009, "DFD6D7");
      g.put(63010, "7DFFFF");
      g.put(63011, "940000");
      g.put(63012, "9FFF9F");
      g.put(63013, "008200");
      g.put(63014, "FF8F8D");
      g.put(63015, "FF9620");
      g.put(63016, "FF6F00");
      g.put(63017, "FF5153");
      g.put(63018, "01FFFF");
      g.put(63019, "00AFFF");
      g.put(63020, "0000FE");
      g.put(63021, "01FF02");
      var1.b(21, 63022, 125, 245);
      var1.b(22, 63024, 125, 247);
      var1.b(23, 63023, 125, 263);
      var1.b(24, 63025, 125, 265);
      var1.b(25, 63026, 310, 253);
      var1.b(26, 63027, 152, 284);
      var1.b(27, 63028, 152, 284);
      var1.b(28, 63030, 199, 294);
      var1.b(29, 63031, 262, 284);
      var1.b(30, 63032, 262, 284);
      var1.b(31, 63034, 309, 294);
      var1.b(32, 63035, 256, 22);
      rs.p_n.C_e var15 = d(63036);
      a(63037, "Cape Color Selection Menu", this.a, 2, 16751360, true, true);
      a(63038, 110, 250);
      short var7 = 4907;
      rs.p_n.C_e.H['\uf63e'].af = var7;
      rs.p_n.C_e.H['\uf63e'].aT = 750;
      rs.p_n.C_e.H['\uf63e'].aV = 1550;
      rs.p_n.C_e.H['\uf63e'].ar = 0;
      rs.p_n.C_e.H['\uf63e'].F = 0;
      rs.p_n.C_e.H['\uf63e'].aD = rs.p_d.C_d.c(var7).w;
      rs.p_n.C_e.H['\uf63e'].aE = rs.p_d.C_d.c(var7).w;
      h(63039, "options/colors/cape");
      c(63040, 2, "gambling/sprite");
      c(63041, 1, "gambling/sprite");
      c(63042, 1, "gambling/sprite");
      c(63043, 1, "gambling/sprite");
      c(63044, 1, "gambling/sprite");
      c(63045, 1, "gambling/sprite");
      a(63046, "<tab=20>Detail color 1", "Select color type", this.a, 0, 16750623, false, true, 150);
      a(63047, "<tab=20>Detail color 2", "Select color type", this.a, 0, 16750623, false, true, 150);
      a(63048, "<tab=20>Background color 1", "Select color type", this.a, 0, 16750623, false, true, 150);
      a(63049, "<tab=20>Background color 2", "Select color type", this.a, 0, 16750623, false, true, 150);
      a(63050, "<tab=20>Trim color", "Select color type", this.a, 0, 16750623, false, true, 150);
      a(63051, "<tab=20>Particle color", "Select color type", this.a, 0, 16750623, false, true, 150);
      h(63052, "options/colors/highlight");
      var15.k(42);
      var15.b(0, 63039, 70, 17);
      short var10 = 0;
      var10 = 162;
      var3 = 162;
      var4 = 50;
      var5 = 0;

      for (int var8 = 1; var8 <= 20; var8++) {
         var15.b(var8, 63001 + var8, var10 - 38, var4);
         var10 += 40;
         if (++var5 == 5) {
            var4 += 50;
            var10 = var3;
            var5 = 0;
         }
      }

      var15.b(21, 63027, 152, 284);
      var15.b(22, 63028, 152, 284);
      var15.b(23, 63030, 199, 294);
      var15.b(24, 63031, 262, 284);
      var15.b(25, 63032, 262, 284);
      var15.b(26, 63034, 309, 294);
      var15.b(27, 63037, 256, 22);
      var15.b(28, 63038, 321, 35);
      var15.b(29, 63040, 93, 242);
      var15.b(30, 63046, 93, 244);
      var15.b(31, 63041, 93, 262);
      var15.b(32, 63047, 93, 264);
      var15.b(33, 63042, 193, 242);
      var15.b(34, 63048, 193, 244);
      var15.b(35, 63043, 193, 262);
      var15.b(36, 63049, 193, 264);
      var15.b(37, 63044, 323, 242);
      var15.b(38, 63050, 323, 244);
      var15.b(39, 63045, 323, 262);
      var15.b(40, 63051, 323, 264);
      var15.b(41, 63052, var15.am[5] - 2, var15.bc[5] - 2);
   }

   public static void o(int var0) {
      int var1 = -1;
      rs.p_n.C_e var2 = rs.p_n.C_e.H['\uf63c'];

      for (int var3 = 1; var3 <= 20; var3++) {
         if (var2.al[var3] == var0) {
            var1 = var3;
            break;
         }
      }

      if (var1 != -1) {
         var2.am[41] = var2.am[var1] - 2;
         var2.bc[41] = var2.bc[var1] - 2;
      }
   }

   static {
      bI.put(969, 924);
      bI.put(64510, 970);
      bI.put(0, 1);
      bI.put(5119, 332770);
      bI.put(32639, 35838);
      bI.put(35839, 44031);
      bI.put(44030, 305970);
   }
}
