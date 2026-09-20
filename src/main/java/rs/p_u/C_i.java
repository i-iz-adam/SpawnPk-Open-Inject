package rs.p_u;

import com.a.a.a.a;

public class C_i implements a {
   public static final C_i a = new C_i(0, 0);
   public static final C_i b = new C_i(1, 1);
   public static final C_i c = new C_i(4, 4);
   public static final C_i d = new C_i(3, 3);
   public static final C_i e = new C_i(2, 2);
   final int f;
   final int g;

   static C_i[] b() {
      return new C_i[]{a, b, e, d, c};
   }

   C_i(int var1, int var2) {
      this.f = var1;
      this.g = var2;
   }

   public static C_i a(int var0) {
      C_i var1 = (C_i)com.a.a.a.a.a(b(), var0);
      if (null == var1) {
         var1 = a;
      }

      return var1;
   }

   public int a() {
      return this.g;
   }
}
