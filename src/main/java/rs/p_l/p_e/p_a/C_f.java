package rs.p_l.p_e.p_a;

import rs.C_Client_mc;

public class C_f extends rs.p_l.p_e.C_f {
   public static int p = 0;
   public static int q = 0;
   public static String r = null;
   public static final rs.p_q.p_a.p_a.C_a s = new C_g();

   @Override
   public void b() {
      this.f();
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return C_Client_mc.cH == 31244;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.Mode var2) {
      if (var2 == rs.p_l.p_e.C_f.Mode.b) {
         if (p != 0 && q != 0) {
            if (r == null) {
               r = rs.p_d.C_k.f(q).w;
            }

            if (C_Client_mc.br == 49991) {
               byte var3 = 1;
               short var4 = 220;
               byte var5 = 37;
               int var6 = C_Client_mc.hP - var4 / 2 + 5;
               int var7 = C_Client_mc.hQ - var5 + 3;
               if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a && var6 > 288) {
                  var6 = 288;
               }

               rs.p_l.C_c.d(var6 - var3, var4 + var3 * 2, var5 + var3 * 2, 2367511, var7 - 15 - var3);
               rs.p_l.C_c.b(var5, var7 - 15, var6, 1595156, var4, 200);
               C_Client_mc.gl.b("You have a @gre@" + p + "% @whi@chance to save ingredients", var6 + 2, var7, 16777215, 0);
               C_Client_mc.gl.b("on failed attempts @or2@(consumes on save!)", var6 + 2, var7 + 16, 16777215, 0);
               var7 -= 17;
               var5 = 17;
               rs.p_l.C_c.d(var6 - var3, var4 + var3 * 2, var5 + var3 * 2, 2367511, var7 - 15 - var3);
               rs.p_l.C_c.b(var5, var7 - 15, var6, 1595156, var4, 200);
               rs.p_d.C_k.a(q, 1, 32, 25).e(var6 - 4, var7 - 23, 0);
               C_Client_mc.gl.b("@or1@" + r, var6 + 25, var7 - 1, 16777215, 0);
            }
         }
      }
   }

   @Override
   public void c() {
      this.f();
   }

   public void f() {
      q = 0;
      p = 0;
      r = null;
   }
}
