package rs.p_s.p_o;

import java.awt.Color;
import java.util.function.Predicate;
import lombok.NonNull;
import rs.p_a.C_j;

public final class C_a {
   @NonNull
   private final C_j a;
   @NonNull
   private final Color b;
   private final Color c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private final boolean k;
   private final float l;
   private final int m;
   private final Predicate<C_j> n;

   private static Color r() {
      return new Color(0, 0, 0, 50);
   }

   private static float s() {
      return 2.0F;
   }

   C_a(
      @NonNull C_j var1,
      @NonNull Color var2,
      Color var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      float var12,
      int var13,
      Predicate<C_j> var14
   ) {
      if (var1 == null) {
         throw new NullPointerException("npc is marked non-null but is null");
      } else if (var2 == null) {
         throw new NullPointerException("highlightColor is marked non-null but is null");
      } else {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
         this.f = var6;
         this.g = var7;
         this.h = var8;
         this.i = var9;
         this.j = var10;
         this.k = var11;
         this.l = var12;
         this.m = var13;
         this.n = var14;
      }
   }

   public static C_a.a a() {
      return new C_a.a();
   }

   @NonNull
   public C_j b() {
      return this.a;
   }

   @NonNull
   public Color c() {
      return this.b;
   }

   public Color d() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }

   public boolean f() {
      return this.e;
   }

   public boolean g() {
      return this.f;
   }

   public boolean h() {
      return this.g;
   }

   public boolean i() {
      return this.h;
   }

   public boolean j() {
      return this.i;
   }

   public boolean k() {
      return this.j;
   }

   public boolean l() {
      return this.k;
   }

   public float m() {
      return this.l;
   }

   public int n() {
      return this.m;
   }

   public Predicate<C_j> o() {
      return this.n;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_a)) {
         return false;
      } else {
         C_a var2 = (C_a)var1;
         if (this.e() != var2.e()) {
            return false;
         } else if (this.f() != var2.f()) {
            return false;
         } else if (this.g() != var2.g()) {
            return false;
         } else if (this.h() != var2.h()) {
            return false;
         } else if (this.i() != var2.i()) {
            return false;
         } else if (this.j() != var2.j()) {
            return false;
         } else if (this.k() != var2.k()) {
            return false;
         } else if (this.l() != var2.l()) {
            return false;
         } else if (Float.compare(this.m(), var2.m()) != 0) {
            return false;
         } else if (this.n() != var2.n()) {
            return false;
         } else {
            C_j var3 = this.b();
            C_j var4 = var2.b();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               Color var5 = this.c();
               Color var6 = var2.c();
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  Color var7 = this.d();
                  Color var8 = var2.d();
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     Predicate var9 = this.o();
                     Predicate var10 = var2.o();
                     return var9 == null ? var10 == null : var9.equals(var10);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + (this.e() ? 79 : 97);
      var2 = var2 * 59 + (this.f() ? 79 : 97);
      var2 = var2 * 59 + (this.g() ? 79 : 97);
      var2 = var2 * 59 + (this.h() ? 79 : 97);
      var2 = var2 * 59 + (this.i() ? 79 : 97);
      var2 = var2 * 59 + (this.j() ? 79 : 97);
      var2 = var2 * 59 + (this.k() ? 79 : 97);
      var2 = var2 * 59 + (this.l() ? 79 : 97);
      var2 = var2 * 59 + Float.floatToIntBits(this.m());
      var2 = var2 * 59 + this.n();
      C_j var3 = this.b();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Color var4 = this.c();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      Color var5 = this.d();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      Predicate var6 = this.o();
      return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
   }

   @Override
   public String toString() {
      return "HighlightedNpc(npc="
         + this.b()
         + ", highlightColor="
         + this.c()
         + ", fillColor="
         + this.d()
         + ", hull="
         + this.e()
         + ", tile="
         + this.f()
         + ", trueTile="
         + this.g()
         + ", swTile="
         + this.h()
         + ", swTrueTile="
         + this.i()
         + ", outline="
         + this.j()
         + ", name="
         + this.k()
         + ", nameOnMinimap="
         + this.l()
         + ", borderWidth="
         + this.m()
         + ", outlineFeather="
         + this.n()
         + ", render="
         + this.o()
         + ")";
   }

   public static class a {
      private C_j a;
      private Color b;
      private boolean c;
      private Color d;
      private boolean e;
      private boolean f;
      private boolean g;
      private boolean h;
      private boolean i;
      private boolean j;
      private boolean k;
      private boolean l;
      private boolean m;
      private float n;
      private int o;
      private Predicate<C_j> p;

      a() {
      }

      public C_a.a a(@NonNull C_j var1) {
         if (var1 == null) {
            throw new NullPointerException("npc is marked non-null but is null");
         } else {
            this.a = var1;
            return this;
         }
      }

      public C_a.a a(@NonNull Color var1) {
         if (var1 == null) {
            throw new NullPointerException("highlightColor is marked non-null but is null");
         } else {
            this.b = var1;
            return this;
         }
      }

      public C_a.a b(Color var1) {
         this.d = var1;
         this.c = true;
         return this;
      }

      public C_a.a a(boolean var1) {
         this.e = var1;
         return this;
      }

      public C_a.a b(boolean var1) {
         this.f = var1;
         return this;
      }

      public C_a.a c(boolean var1) {
         this.g = var1;
         return this;
      }

      public C_a.a d(boolean var1) {
         this.h = var1;
         return this;
      }

      public C_a.a e(boolean var1) {
         this.i = var1;
         return this;
      }

      public C_a.a f(boolean var1) {
         this.j = var1;
         return this;
      }

      public C_a.a g(boolean var1) {
         this.k = var1;
         return this;
      }

      public C_a.a h(boolean var1) {
         this.l = var1;
         return this;
      }

      public C_a.a a(float var1) {
         this.n = var1;
         this.m = true;
         return this;
      }

      public C_a.a a(int var1) {
         this.o = var1;
         return this;
      }

      public C_a.a a(Predicate<C_j> var1) {
         this.p = var1;
         return this;
      }

      public C_a a() {
         Color var1 = this.d;
         if (!this.c) {
            var1 = C_a.r();
         }

         float var2 = this.n;
         if (!this.m) {
            var2 = C_a.s();
         }

         return new C_a(this.a, this.b, var1, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, var2, this.o, this.p);
      }

      @Override
      public String toString() {
         return "HighlightedNpc.HighlightedNpcBuilder(npc="
            + this.a
            + ", highlightColor="
            + this.b
            + ", fillColor$value="
            + this.d
            + ", hull="
            + this.e
            + ", tile="
            + this.f
            + ", trueTile="
            + this.g
            + ", swTile="
            + this.h
            + ", swTrueTile="
            + this.i
            + ", outline="
            + this.j
            + ", name="
            + this.k
            + ", nameOnMinimap="
            + this.l
            + ", borderWidth$value="
            + this.n
            + ", outlineFeather="
            + this.o
            + ", render="
            + this.p
            + ")";
      }
   }
}
