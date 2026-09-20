package rs.p_h;

import java.io.FileNotFoundException;
import rs.C_Client_mc;
import rs.p_a.C_j;
import rs.p_d.C_k;
import rs.p_d.C_m;
import rs.p_d.C_p;
import rs.p_d.C_w;

public class C_f {
   public static boolean a = false;
   public static boolean b = false;

   public static boolean a(C_Client_mc var0) {
      if (a && rs.p_f.C_a.d) {
         a = false;

         try {
            C_m.a();
         } catch (FileNotFoundException var4) {
            var4.printStackTrace();
         }

         C_k.b = new rs.p_t.p_a.C_d();
         C_k.b.a();
         C_k.c.clear();
         C_Client_mc.M();
         C_k.k.a();
         C_k.m.a();
         C_k.l.a();
         var0.b();
         if (rs.p_f.C_a.d && rs.p_s.p_c.C_c.b.f()) {
            rs.p_s.p_c.C_c.b.a(C_Client_mc.bb, true);
         }

         try {
            C_p.a();
         } catch (FileNotFoundException var3) {
            var3.printStackTrace();
         }

         try {
            C_w.a();
         } catch (FileNotFoundException var2) {
            var2.printStackTrace();
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean b(C_Client_mc var0) {
      if (b && rs.p_f.C_a.d) {
         b = false;
         rs.p_d.C_d.M.a();
         rs.p_d.C_d.N.a();
         rs.p_d.C_d.c.a();
         rs.p_d.C_d.M.a();
         rs.p_d.C_d.N.a();
         rs.p_d.C_d.z = new rs.p_d.C_d[20];

         for (int var1 = 0; var1 < 20; var1++) {
            rs.p_d.C_d.z[var1] = new rs.p_d.C_d();
         }

         for (int var3 = 0; var3 < var0.cB; var3++) {
            C_j var2 = var0.cA[var0.cC[var3]];
            if (var2.aG != null) {
               var2.aG = rs.p_d.C_d.c((int)var2.aG.x);
               var2.S = var2.aG.r;
               var2.o = var2.aG.y;
               var2.ag = var2.aG.q;
               var2.ah = var2.aG.l;
               var2.ai = var2.aG.B;
               var2.aj = var2.aG.j;
               var2.t = var2.aG.w;
            }
         }

         rs.p_n.C_e.aO.a();
         rs.p_l.p_f.C_e.d().j().a(rs.p_l.p_f.C_e.d().j().u(), true);
         if (rs.p_s.p_c.C_c.b.e()) {
            rs.p_s.p_c.C_c.b.a(rs.p_l.p_f.C_e.d().j().u(), true);
         }

         return true;
      } else {
         return false;
      }
   }
}
