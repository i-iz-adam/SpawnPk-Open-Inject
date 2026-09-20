package rs.p_A_uc;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;

public class C_a {
   private final LoadingCache<C_a.a, C_d> a = CacheBuilder.newBuilder().maximumSize(128L).expireAfterWrite(1L, TimeUnit.HOURS).build(new C_b(this));
   private final LoadingCache<C_a.b, C_d> b = CacheBuilder.newBuilder().maximumSize(128L).expireAfterWrite(1L, TimeUnit.HOURS).build(new C_c(this));

   public void a() {
      this.a.invalidateAll();
      this.a.cleanUp();
      this.b.invalidateAll();
      this.b.cleanUp();
   }

   public C_d a(int var1) {
      return this.a(var1, 1, 32);
   }

   public C_d a(int var1, int var2, int var3) {
      try {
         return (C_d)this.a.get(new C_a.a(var1, var2, var3));
      } catch (ExecutionException var5) {
         return null;
      }
   }

   public C_d a(String var1, int var2) {
      try {
         return (C_d)this.b.get(new C_a.b(var1, var2));
      } catch (ExecutionException var4) {
         return null;
      }
   }

   public C_d a(String var1) {
      return this.a(var1, -1);
   }

   private C_d b(int var1) {
      return this.b(var1, Integer.MAX_VALUE, 32);
   }

   private C_d b(int var1, int var2, int var3) {
      C_d var4 = new C_d(36, 32, 2);
      rs.p_h.C_a.a("Ico_" + var1 + "_" + var3, () -> {
         if (!C_Launcher_mc.n().o().fc) {
            return true;
         } else {
            C_F_uc var4x = rs.p_d.C_k.a(var1, var2, 0, var3);
            if (var4x == null) {
               return true;
            } else {
               Image var5 = var4x.a(32, 32);
               var5 = C_F_uc.a(var5, new Color(0, 0, 0));
               Graphics2D var6 = var4.createGraphics();
               var6.drawImage(var5, 0, 0, null);
               var6.dispose();
               var4.a();
               return false;
            }
         }
      });
      return var4;
   }

   private C_d b(String var1, int var2) {
      int var3 = var2;
      int var4 = var2;
      if (var2 == -1) {
         C_F_uc var5 = new C_F_uc(var1);
         var5.a(var1);
         var3 = var5.n;
         var4 = var5.o;
      }

      Image var7 = C_F_uc.b(var1);
      C_d var6 = new C_d(var3, var4, 2);
      rs.p_h.C_a.a("Ico_" + var1 + "_" + var2, () -> {
         try {
            if (var7 != null && var7.getWidth(null) > 0 && var7.getHeight(null) > 0) {
               Graphics2D var2x = var6.createGraphics();
               var2x.drawImage(var7, 0, 0, null);
               var2x.dispose();
               var6.a();
               return false;
            } else {
               return true;
            }
         } catch (Exception var3x) {
            var3x.printStackTrace();
            return true;
         }
      });
      return var6;
   }

   static final class a {
      private final int a;
      private final int b;
      private final int c;

      public a(int var1, int var2, int var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }

      public int a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public int c() {
         return this.c;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof C_a.a)) {
            return false;
         } else {
            C_a.a var2 = (C_a.a)var1;
            if (this.a() != var2.a()) {
               return false;
            } else {
               return this.b() != var2.b() ? false : this.c() == var2.c();
            }
         }
      }

      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + this.a();
         var2 = var2 * 59 + this.b();
         return var2 * 59 + this.c();
      }

      @Override
      public String toString() {
         return "AssetIconManager.ItemKey(itemId=" + this.a() + ", itemQuantity=" + this.b() + ", size=" + this.c() + ")";
      }
   }

   static final class b {
      private final String a;
      private final int b;

      public b(String var1, int var2) {
         this.a = var1;
         this.b = var2;
      }

      public String a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof C_a.b)) {
            return false;
         } else {
            C_a.b var2 = (C_a.b)var1;
            if (this.b() != var2.b()) {
               return false;
            } else {
               String var3 = this.a();
               String var4 = var2.a();
               return var3 == null ? var4 == null : var3.equals(var4);
            }
         }
      }

      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + this.b();
         String var3 = this.a();
         return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      }

      @Override
      public String toString() {
         return "AssetIconManager.SpriteKey(directory=" + this.a() + ", size=" + this.b() + ")";
      }
   }
}
