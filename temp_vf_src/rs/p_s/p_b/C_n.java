package rs.p_s.p_b;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.swing.JMenuItem;

public final class C_n {
   private final String a;
   private final String b;
   private final String[] c;
   @Nullable
   private final rs.p_s.C_a d;
   @Nullable
   private final rs.p_e.C_b e;
   @Nullable
   private final rs.p_e.C_d f;
   @Nullable
   private final List<String> g;

   boolean a() {
      return this.f != null && !this.f.c().stream().allMatch(var0 -> var0.d().e());
   }

   C_n(String var1, String var2, String[] var3, rs.p_e.C_b var4, rs.p_e.C_d var5) {
      this(var1, var2, var3, null, var4, var5, null);
   }

   @Nullable
   JMenuItem b() {
      JMenuItem var1 = new JMenuItem("Support");
      var1.addActionListener(var0 -> rs.p_A_uc.C_l.a("https://spawnpk.net"));
      return var1;
   }

   @Nullable
   String c() {
      return null;
   }

   public String d() {
      return this.a;
   }

   public String e() {
      return this.b;
   }

   public String[] f() {
      return this.c;
   }

   @Nullable
   public rs.p_e.C_b g() {
      return this.e;
   }

   @Nullable
   public rs.p_e.C_d h() {
      return this.f;
   }

   @Nullable
   public List<String> i() {
      return this.g;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_n)) {
         return false;
      } else {
         C_n var2 = (C_n)var1;
         String var3 = this.d();
         String var4 = var2.d();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.e();
            String var6 = var2.e();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               if (!Arrays.deepEquals(this.f(), var2.f())) {
                  return false;
               } else {
                  rs.p_s.C_a var7 = this.j();
                  rs.p_s.C_a var8 = var2.j();
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     rs.p_e.C_b var9 = this.g();
                     rs.p_e.C_b var10 = var2.g();
                     if (var9 == null ? var10 == null : var9.equals(var10)) {
                        rs.p_e.C_d var11 = this.h();
                        rs.p_e.C_d var12 = var2.h();
                        if (var11 == null ? var12 == null : var11.equals(var12)) {
                           List var13 = this.i();
                           List var14 = var2.i();
                           return var13 == null ? var14 == null : var13.equals(var14);
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
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.d();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.e();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      var2 = var2 * 59 + Arrays.deepHashCode(this.f());
      rs.p_s.C_a var5 = this.j();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      rs.p_e.C_b var6 = this.g();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      rs.p_e.C_d var7 = this.h();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      List var8 = this.i();
      return var2 * 59 + (var8 == null ? 43 : var8.hashCode());
   }

   @Override
   public String toString() {
      return "PluginConfigurationDescriptor(name="
         + this.d()
         + ", description="
         + this.e()
         + ", tags="
         + Arrays.deepToString(this.f())
         + ", plugin="
         + this.j()
         + ", config="
         + this.g()
         + ", configDescriptor="
         + this.h()
         + ", conflicts="
         + this.i()
         + ")";
   }

   public C_n(
      String var1, String var2, String[] var3, @Nullable rs.p_s.C_a var4, @Nullable rs.p_e.C_b var5, @Nullable rs.p_e.C_d var6, @Nullable List<String> var7
   ) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }

   @Nullable
   public rs.p_s.C_a j() {
      return this.d;
   }
}
