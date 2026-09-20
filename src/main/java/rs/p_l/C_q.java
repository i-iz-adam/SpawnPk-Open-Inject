package rs.p_l;

import rs.C_Client_mc;

public final class C_q {
   static final int a = 0;
   static final int b = 1;
   static final int c = 2;
   static final int d = 3;
   static final int e = 4;
   private static final int f = 256;
   private static final C_q.a[] g = e();
   private static final C_q.a[] h = e();
   private static int i;
   private static int j;
   private static boolean k;
   private static boolean l = true;
   private static int m = -1;
   private static C_q.a n;

   private C_q() {
   }

   private static C_q.a[] e() {
      C_q.a[] var0 = new C_q.a[256];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = new C_q.a();
      }

      return var0;
   }

   static int a(String var0, int var1, int var2) {
      if (b(var0, var1, var2, "</link>")) {
         return 2;
      } else if (b(var0, var1, var2, "</tool>")) {
         return 4;
      } else if (a(var0, var1, var2, "<link=")) {
         return 1;
      } else {
         return a(var0, var1, var2, "<tool=") ? 3 : 0;
      }
   }

   static int a(int var0) {
      return var0 + 6;
   }

   static boolean a(String var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      return a(var0, var1, var2, var3, var4, var5, var6, true);
   }

   static boolean b(String var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      return a(var0, var1, var2, var3, var4, var5, var6, false);
   }

   private static boolean a(String var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (var0 != null && var2 > var1 && var5 > var3 && var6 > var4) {
         C_q.a[] var8 = k ? g : h;
         int var9 = k ? i : j;
         if (var9 >= 256) {
            return false;
         } else {
            C_q.a var10 = var8[var9];
            var10.a(var0, var1, var2, var3, var4, var5, var6, var7);
            if (k) {
               i++;
            } else {
               j++;
            }

            return var10.a(C_Client_mc.hP, C_Client_mc.hQ);
         }
      } else {
         return false;
      }
   }

   public static void a(boolean var0) {
      j = 0;
      n = null;
      l = var0;
   }

   public static void a() {
      k = true;
      i = 0;
   }

   public static void b() {
      k = false;
   }

   public static boolean c() {
      int var0 = l ? a(g, i, C_Client_mc.hP, C_Client_mc.hQ) : -1;
      boolean var1 = var0 != m;
      m = var0;
      n = b(h, j, C_Client_mc.hP, C_Client_mc.hQ);
      if (n == null && l) {
         n = b(g, i, C_Client_mc.hP, C_Client_mc.hQ);
      }

      return var1;
   }

   public static void d() {
      n = b(h, j, C_Client_mc.hP, C_Client_mc.hQ);
      if (n == null && l) {
         n = b(g, i, C_Client_mc.hP, C_Client_mc.hQ);
      }

      if (n != null && n.i != null) {
         rs.p_l.p_f.C_e.d().f().a(n.i);
      }
   }

   public static boolean a(C_Client_mc var0, int var1, int var2) {
      C_q.a var3 = c(h, j, var1, var2);
      if (var3 == null && l) {
         var3 = c(g, i, var1, var2);
      }

      if (var3 == null) {
         return false;
      } else {
         String var4 = var3.a.substring(var3.b, var3.c);
         return var0.c(var4);
      }
   }

   private static int a(C_q.a[] var0, int var1, int var2, int var3) {
      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         if (var0[var4].h && var0[var4].a(var2, var3)) {
            return var4;
         }
      }

      return -1;
   }

   private static C_q.a b(C_q.a[] var0, int var1, int var2, int var3) {
      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         if (!var0[var4].h && var0[var4].a(var2, var3)) {
            return var0[var4];
         }
      }

      return null;
   }

   private static C_q.a c(C_q.a[] var0, int var1, int var2, int var3) {
      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         if (var0[var4].h && var0[var4].a(var2, var3)) {
            return var0[var4];
         }
      }

      return null;
   }

   private static boolean a(String var0, int var1, int var2, String var3) {
      if (var2 - var1 < var3.length()) {
         return false;
      } else {
         for (int var4 = 0; var4 < var3.length(); var4++) {
            if (var0.charAt(var1 + var4) != var3.charAt(var4)) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean b(String var0, int var1, int var2, String var3) {
      if (var2 - var1 + 1 != var3.length()) {
         return false;
      } else {
         for (int var4 = 0; var4 < var3.length(); var4++) {
            if (var0.charAt(var1 + var4) != var3.charAt(var4)) {
               return false;
            }
         }

         return true;
      }
   }

   private static final class a {
      private String a;
      private int b;
      private int c;
      private int d;
      private int e;
      private int f;
      private int g;
      private boolean h;
      private rs.p_l.p_f.p_a.p_j.C_a i;

      private a() {
      }

      private void a(String var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
         boolean var9 = this.a != var1 || this.b != var2 || this.c != var3 || this.h != var8;
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
         this.f = var6;
         this.g = var7;
         this.h = var8;
         if (var8) {
            this.i = null;
         } else if (var9) {
            this.i = new rs.p_l.p_f.p_a.p_j.C_a(var1.substring(var2, Math.min(var3, var2 + 240)), false);
         }
      }

      private boolean a(int var1, int var2) {
         return var1 >= this.d && var1 < this.f && var2 >= this.e && var2 < this.g;
      }
   }
}
