package rs.p_d;

import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public class C_n {
   public static C_cc<C_n> a = new C_cc();
   public C_n.a b;
   public int c;
   public int d;
   public int e;

   public C_F_uc a() {
      switch (this.b) {
         case a:
            if (rs.p_l.C_j.b.w_(this.c)) {
               return C_Client_mc.fE[((rs.p_l.p_a.C_a)rs.p_l.C_j.b.b(this.c)).b()];
            }

            return C_Client_mc.fE[this.c];
         case b:
            return C_k.g(this.c);
         default:
            return null;
      }
   }

   public static C_F_uc a(int var0) {
      return ((C_n)a.b(var0)).a();
   }

   public static void a(int var0, int var1, int var2) {
      C_n var3 = (C_n)a.b(var0);
      C_F_uc var4 = var3.a();
      if (var4 != null) {
         var4.f(var1 + var3.d, var2 + var3.e);
      }
   }

   public static void a(int var0, int var1, int var2, int var3) {
      C_n var4 = (C_n)a.b(var0);
      C_F_uc var5 = var4.a();
      if (var5 != null) {
         var5.g(var1 + var4.d, var2 + var4.e, var3);
      }
   }

   public static boolean b(int var0) {
      return a.w_(var0);
   }

   public C_n(C_n.a var1, int var2, int var3, int var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public static enum a {
      a,
      b;
   }
}
