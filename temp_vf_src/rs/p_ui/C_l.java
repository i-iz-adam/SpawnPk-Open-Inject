package rs.p_ui;

import java.awt.image.BufferedImage;
import java.util.Map;

public class C_l {
   private final BufferedImage a;
   private boolean b;
   private final String c;
   private boolean d;
   private Runnable e;
   private Runnable f;
   private C_m g;
   private int h;
   private Map<String, Runnable> i;

   private static boolean m() {
      return true;
   }

   private static String n() {
      return "";
   }

   C_l(BufferedImage var1, boolean var2, String var3, boolean var4, Runnable var5, Runnable var6, C_m var7, int var8, Map<String, Runnable> var9) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
   }

   public static C_l.a a() {
      return new C_l.a();
   }

   public BufferedImage b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }

   public Runnable f() {
      return this.e;
   }

   public Runnable g() {
      return this.f;
   }

   public C_m h() {
      return this.g;
   }

   public int i() {
      return this.h;
   }

   public Map<String, Runnable> j() {
      return this.i;
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   public void b(boolean var1) {
      this.d = var1;
   }

   public void a(Runnable var1) {
      this.e = var1;
   }

   public void b(Runnable var1) {
      this.f = var1;
   }

   public void a(C_m var1) {
      this.g = var1;
   }

   public void a(int var1) {
      this.h = var1;
   }

   public void a(Map<String, Runnable> var1) {
      this.i = var1;
   }

   @Override
   public String toString() {
      return "NavigationButton(icon="
         + this.b()
         + ", tab="
         + this.c()
         + ", tooltip="
         + this.d()
         + ", selected="
         + this.e()
         + ", onClick="
         + this.f()
         + ", onSelect="
         + this.g()
         + ", panel="
         + this.h()
         + ", priority="
         + this.i()
         + ", popup="
         + this.j()
         + ")";
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_l)) {
         return false;
      } else {
         C_l var2 = (C_l)var1;
         if (!var2.a(this)) {
            return false;
         } else {
            String var3 = this.d();
            String var4 = var2.d();
            return var3 == null ? var4 == null : var3.equals(var4);
         }
      }
   }

   protected boolean a(Object var1) {
      return var1 instanceof C_l;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      String var3 = this.d();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   public static class a {
      private BufferedImage a;
      private boolean b;
      private boolean c;
      private boolean d;
      private String e;
      private boolean f;
      private Runnable g;
      private Runnable h;
      private C_m i;
      private int j;
      private Map<String, Runnable> k;

      a() {
      }

      public C_l.a a(BufferedImage var1) {
         this.a = var1;
         return this;
      }

      public C_l.a a(boolean var1) {
         this.c = var1;
         this.b = true;
         return this;
      }

      public C_l.a a(String var1) {
         this.e = var1;
         this.d = true;
         return this;
      }

      public C_l.a b(boolean var1) {
         this.f = var1;
         return this;
      }

      public C_l.a a(Runnable var1) {
         this.g = var1;
         return this;
      }

      public C_l.a b(Runnable var1) {
         this.h = var1;
         return this;
      }

      public C_l.a a(C_m var1) {
         this.i = var1;
         return this;
      }

      public C_l.a a(int var1) {
         this.j = var1;
         return this;
      }

      public C_l.a a(Map<String, Runnable> var1) {
         this.k = var1;
         return this;
      }

      public C_l a() {
         boolean var1 = this.c;
         if (!this.b) {
            var1 = C_l.m();
         }

         String var2 = this.e;
         if (!this.d) {
            var2 = C_l.n();
         }

         return new C_l(this.a, var1, var2, this.f, this.g, this.h, this.i, this.j, this.k);
      }

      @Override
      public String toString() {
         return "NavigationButton.NavigationButtonBuilder(icon="
            + this.a
            + ", tab$value="
            + this.c
            + ", tooltip$value="
            + this.e
            + ", selected="
            + this.f
            + ", onClick="
            + this.g
            + ", onSelect="
            + this.h
            + ", panel="
            + this.i
            + ", priority="
            + this.j
            + ", popup="
            + this.k
            + ")";
      }
   }
}
