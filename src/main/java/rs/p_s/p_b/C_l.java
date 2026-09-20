package rs.p_s.p_b;

import com.google.a.d.L;
import com.google.a.d.bX.a;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.annotation.Nullable;

public class C_l {
   private static final L<Integer, Integer> f = new a().a(128, 17).a(512, 18).a(64, 16).a(256, 157).a();
   private static final int g = (Integer)f.keySet().stream().reduce((var0, var1) -> var0 | var1).get();
   public static final C_l a = new C_l(0, 0);
   public static final C_l b = new C_l(0, 128);
   public static final C_l c = new C_l(0, 512);
   public static final C_l d = new C_l(0, 64);
   private final int h;
   private final int i;

   protected C_l(int var1, int var2, boolean var3) {
      var2 &= g;
      Integer var4 = a(var1);
      if (var4 != null) {
         assert (var2 & var4) != 0;

         var1 = 0;
      }

      if (var3 && var1 != 0) {
         var2 = 0;
      }

      this.h = var1;
      this.i = var2;
   }

   public C_l(int var1, int var2) {
      this(var1, var2, false);
   }

   public C_l(KeyEvent var1) {
      this(var1.getExtendedKeyCode(), var1.getModifiersEx());

      assert this.a(var1);
   }

   public boolean a(KeyEvent var1) {
      return this.a(var1, false);
   }

   protected boolean a(KeyEvent var1, boolean var2) {
      if (a.equals(this)) {
         return false;
      } else {
         int var3 = var1.getExtendedKeyCode();
         int var4 = var1.getModifiersEx() & g;
         Integer var5 = a(var3);
         if (var5 != null) {
            var4 |= var5;
            var3 = 0;
         }

         if (var1.getID() == 402 && var3 != 0) {
            return this.h == var3;
         } else {
            return var2 && var3 != 0 ? this.h == var3 : this.h == var3 && this.i == var4;
         }
      }
   }

   @Override
   public String toString() {
      if (this.h == 0 && this.i == 0) {
         return "Not set";
      } else {
         String var1;
         if (this.h == 0) {
            var1 = "";
         } else {
            var1 = KeyEvent.getKeyText(this.h);
         }

         String var2 = "";
         if (this.i != 0) {
            var2 = InputEvent.getModifiersExText(this.i);
         }

         if (var2.isEmpty() && var1.isEmpty()) {
            return "Not set";
         } else if (!var2.isEmpty() && !var1.isEmpty()) {
            return var2 + "+" + var1;
         } else {
            return var2.isEmpty() ? var1 : var2;
         }
      }
   }

   @Nullable
   public static Integer a(int var0) {
      return (Integer)f.k_().get(var0);
   }

   public int a() {
      return this.h;
   }

   public int b() {
      return this.i;
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
            return this.a() != var2.a() ? false : this.b() == var2.b();
         }
      }
   }

   protected boolean a(Object var1) {
      return var1 instanceof C_l;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.a();
      return var2 * 59 + this.b();
   }
}
