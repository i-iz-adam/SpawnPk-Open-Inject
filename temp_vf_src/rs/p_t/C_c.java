package rs.p_t;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p_gnu.p_trove.p_f.p_b.C_cc;

public abstract class C_c<T> extends C_a {
   protected final C_cc<T> h = new C_cc();
   protected Map<Integer, Map<String, Object>> i = new HashMap<>();
   protected boolean j = !this.e();

   public C_c(String var1, String var2) {
      super(var1, var2);
   }

   public abstract T a(int var1, Map<String, Object> var2);

   public void a() {
      try {
         this.h.clear();
         this.i.clear();
         this.i = this.a(this.j);
         if (this.i != null && this.i.keySet() != null) {
            for (int var2 : this.i.keySet()) {
               if (!this.h.w_(var2)) {
                  this.h.a(var2, this.a(var2, this.i.get(var2)));
               }
            }
         } else {
            this.i = new HashMap<>();
         }
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public T a(int var1) {
      return (T)this.h.b(var1);
   }

   public boolean b(int var1) {
      return this.h.w_(var1) && this.h.b(var1) != null;
   }

   protected boolean e() {
      return rs.p_f.C_a.c();
   }

   protected byte b(Object var1) {
      return (byte)((Integer)var1).intValue();
   }

   @Override
   protected int[] a(Object var1) {
      return var1 != null && ((List)var1).size() != 0 ? ((List)var1).stream().mapToInt(Integer::intValue).toArray() : null;
   }

   protected int[][] c(Object var1) {
      if (var1 != null && ((List)var1).size() != 0) {
         List var2 = (List)var1;
         int[][] var3 = new int[var2.size()][];

         for (int var4 = 0; var4 < var2.size(); var4++) {
            var3[var4] = new int[((List)var2.get(var4)).size()];

            for (int var5 = 0; var5 < ((List)var2.get(var4)).size(); var5++) {
               var3[var4][var5] = (Integer)((List)var2.get(var4)).get(var5);
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   protected int[][][] d(Object var1) {
      List var2 = (List)var1;
      int[][][] var3 = new int[var2.size()][][];

      for (int var4 = 0; var4 < var2.size(); var4++) {
         List var5 = (List)var2.get(var4);
         int[][] var6 = new int[var5.size()][];

         for (int var7 = 0; var7 < var5.size(); var7++) {
            List var8 = (List)var5.get(var7);
            int[] var9 = new int[var8.size()];

            for (int var10 = 0; var10 < var8.size(); var10++) {
               var9[var10] = (Integer)var8.get(var10);
            }

            var6[var7] = var9;
         }

         var3[var4] = var6;
      }

      return var3;
   }

   protected String[] e(Object var1) {
      return ((List)var1).toArray(new String[((List)var1).size()]);
   }

   public C_cc<T> f() {
      return this.h;
   }
}
