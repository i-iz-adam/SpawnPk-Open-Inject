package rs.p_l;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.C_Client_mc;

public class C_j {
   public static final int a = 386;
   public static final C_cc<rs.p_l.p_a.C_a> b = new C_cc();
   public static int[] c = new int[0];
   public static final p_gnu.p_trove.p_i.p_a.C_i d = new p_gnu.p_trove.p_i.p_a.C_i();
   public static final int[] e = new int[]{1, 18, 26, 6, 38, 333, 340, 348, 344, 352, 356, 2, 204, 26, 205};
   public static final Map<String, Integer> f = new HashMap<>();
   private static final String[] g = f.keySet().toArray(new String[f.keySet().size()]);

   public static boolean a(int var0) {
      if (b(var0)) {
         return true;
      } else {
         for (int var1 = 0; var1 < e.length; var1++) {
            if (e[var1] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean b(int var0) {
      return var0 == 2 || var0 == 204 || var0 == 26 || var0 == 205;
   }

   public static boolean c(int var0) {
      return var0 == 205 || var0 == 333 || var0 == 344 || var0 == 340 || var0 == 348;
   }

   public static int a(String var0, int var1) {
      if (b(var1) || var1 == 38 || var1 == 94) {
         return 16750623;
      } else if (!a(var1)) {
         return 65535;
      } else if (var0.equals("Kellatha")) {
         return 16712447;
      } else if (var0.equals("Scooby Doo")) {
         return 16719135;
      } else if (var0.equals("Goobymunch") || var0.equals("Raiden")) {
         return 16715792;
      } else if (var0.equals("Ascend")) {
         return 11862016;
      } else {
         return var0.equals("Bsouth") ? 65280 : 16750623;
      }
   }

   public static void a() {
      C_Client_mc.fE = new C_F_uc[386];

      for (int var0 = 0; var0 < C_Client_mc.fE.length; var0++) {
         if (var0 >= 10 && var0 <= 17) {
            C_Client_mc.fE[var0] = new C_F_uc("clan/icons/" + (var0 - 10), true);
         } else if (var0 >= 74 && var0 <= 77) {
            C_Client_mc.fE[var0] = new C_F_uc("popups/bh skull" + (var0 - 70), true);
         } else {
            C_Client_mc.fE[var0] = new C_F_uc("icons/" + var0, true);
         }
      }
   }

   public static int a(char var0, char var1, char var2) {
      for (int var3 = 0; var3 < g.length; var3++) {
         String var4 = g[var3];
         if (var0 == var4.charAt(0) && var1 == var4.charAt(1) && var2 == var4.charAt(2)) {
            return f.get(var4);
         }
      }

      return -1;
   }

   public static int a(String var0) {
      return var0.length() < 6 ? Color.decode(var0).getRGB() : Integer.parseInt(var0, 16);
   }

   public static void b() {
      a();
   }

   public static String b(String var0) {
      String var1 = "<[^>]*>|@[^@]*@";
      Pattern var2 = Pattern.compile(var1);
      Matcher var3 = var2.matcher(var0);
      return var3.replaceAll("").trim();
   }

   static {
      b.a(21, new rs.p_l.p_a.C_a(27, 30).a(-3).c(1));
      b.a(32, new rs.p_l.p_a.C_a(33, 36).a(-3).c(1));
      b.a(45, new rs.p_l.p_a.C_a(41, 44).a(-3).c(1));
      b.a(291, new rs.p_l.p_a.C_a(292, 297).a(-1).c(3));
      b.a(333, new rs.p_l.p_a.C_a(333, 336).a(-1).c(2).d(-1).f(2));
      b.a(340, new rs.p_l.p_a.C_a(340, 343).a(-1).c(2).b(1).d(-1));
      b.a(348, new rs.p_l.p_a.C_a(348, 351).a(-1).c(2).b(1).d(-1));
      b.a(344, new rs.p_l.p_a.C_a(344, 347).a(-1).c(2).b(1).d(-1));
      b.a(352, new rs.p_l.p_a.C_a(352, 355).a(-1).c(2).b(1).d(-1));
      b.a(356, new rs.p_l.p_a.C_a(356, 359).a(-1).c(2).b(1).d(-1));
      c = b.b();
      d.b(333);
      d.b(340);
      d.b(348);
      d.b(344);
      d.b(352);
      f.put("red", a("ff0000"));
      f.put("gre", a("65280"));
      f.put("blu", a("255"));
      f.put("yel", a("ffff00"));
      f.put("dgr", a("115b0d"));
      f.put("cya", a("65535"));
      f.put("mag", a("ff00ff"));
      f.put("lpu", a("8842ad"));
      f.put("dpu", a("83008F"));
      f.put("whi", a("ffffff"));
      f.put("lre", a("ff9040"));
      f.put("dre", a("800000"));
      f.put("bla", a("0"));
      f.put("or0", a("FF981F"));
      f.put("or1", a("ffb000"));
      f.put("or2", a("ff7000"));
      f.put("or3", a("ff3000"));
      f.put("gr1", a("c0ff00"));
      f.put("gr2", a("80ff00"));
      f.put("gr3", a("40ff00"));
      f.put("bl1", a("85c7e2"));
      f.put("bl2", a("2F4780"));
      f.put("yl1", a("ffdd00"));
      f.put("gra", a("B9B855"));
   }
}
