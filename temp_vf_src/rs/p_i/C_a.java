package rs.p_i;

import java.util.Locale;
import rs.p_l.C_j;

public class C_a {
   public static final int a = 200;
   public static int b = 0;
   public static int c = 1;
   public static int d = 2;
   public static int e = 3;
   public static int f = 5;
   public static int g = 11;
   public static int h = 12;
   public static int i = 20;
   public static int j = 0;
   public static int k = 1;
   public static int l = 2;
   public static int m = 5;
   public static int n = 4;
   public static int o = 6;
   public static int p = 7;
   public static int q = 3;
   public static int r = 8;
   public static int s = 15;
   public static int t = 16;
   public static int u = 17;
   public static int v = 0;
   public static int w = 1;
   public static int x = 2;
   public static int y = 3;
   public static int z = 4;
   private static final String[] A = new String[]{
      "you can", "you must", "you do", "you need", "is full", "not enough", "<item=", "rules", "costs", "requires", "players online"
   };
   private static final String[] B = new String[]{" received ", " successfully enchanted ", " has killed ", "killstreak", "has encountered", "just captured"};
   private static final String C = "<y>";
   private static final String D = "<c>";

   public static int a(String var0, int var1) {
      if (var1 == j) {
         if (var0.startsWith("<img=2><shad=FFFF3F><col=FE610C> News: </shad></col>")) {
            return s;
         }

         if (var0.startsWith("<y>")) {
            return u;
         }

         if (var0.startsWith("Please wait at least") && var0.endsWith("each yell message!")) {
            return u;
         }

         if (var0.startsWith("<c>")) {
            return t;
         }

         if (var0.contains("Clan Chat channel-mate")) {
            return t;
         }
      }

      return var1;
   }

   public static String b(String var0, int var1) {
      if (var1 == t) {
         return var0.replace("<c>", "");
      } else {
         return var1 == u ? var0.replace("<y>", "") : var0;
      }
   }

   public static boolean c(String var0, int var1) {
      if (var1 == j && a(var0)) {
         return true;
      } else if (var1 == s && b(var0)) {
         return true;
      } else if (var1 != u && var1 != t) {
         return false;
      } else {
         for (int var2 = 0; var2 < C_j.e.length; var2++) {
            if (var0.contains("<img=" + C_j.e[var2] + ">")) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean a(String var0) {
      String var1 = var0.toLowerCase(Locale.ROOT);
      if (var1.startsWith("<img")) {
         return false;
      } else {
         for (String var5 : A) {
            if (var1.contains(var5)) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean b(String var0) {
      String var1 = var0.toLowerCase(Locale.ROOT);

      for (String var5 : B) {
         if (var1.contains(var5)) {
            return true;
         }
      }

      return false;
   }
}
