package rs.p_q.p_a.p_a;

import com.google.inject.CreationException;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import rs.C_Client_mc;
import rs.p_l.p_e.C_o;
import rs.p_l.p_e.p_a.C_c;
import rs.p_l.p_e.p_a.C_f;
import rs.p_l.p_e.p_a.C_h;
import rs.p_l.p_e.p_a.C_v;
import rs.p_n.p_c.C_A_uc;
import rs.p_n.p_c.C_J_uc;
import rs.p_n.p_c.C_O_uc;
import rs.p_n.p_c.C_V_uc;
import rs.p_n.p_c.C_aM_mc;
import rs.p_n.p_c.C_aO_mc;
import rs.p_n.p_c.C_ag;
import rs.p_n.p_c.C_aq;
import rs.p_n.p_c.C_aw;
import rs.p_n.p_c.p_c.C_e;
import rs.p_q.p_a.p_a.p_a.C_d;
import rs.p_q.p_a.p_a.p_a.C_g;
import rs.p_q.p_a.p_a.p_a.C_j;
import rs.p_q.p_a.p_a.p_a.C_k;
import rs.p_q.p_a.p_a.p_a.C_l;
import rs.p_q.p_a.p_a.p_a.C_m;
import rs.p_q.p_a.p_a.p_a.C_n;
import rs.p_q.p_a.p_a.p_a.C_p;
import rs.p_s.p_t.C_i;

public class C_b {
   public static final Map<Integer, C_a> a = new HashMap<>();

   public static void a() {
      a(1, C_d.class);
      a(2, C_k.class);
      a(3, C_l.class);
      a(4, (Class<? extends C_a>)C_h.D.getClass());
      a(5, C_n.class);
      a(6, (Class<? extends C_a>)C_J_uc.c.getClass());
      a(7, rs.p_l.p_f.p_a.p_c.C_b.class);
      a(8, (Class<? extends C_a>)C_c.v.getClass());
      a(9, (Class<? extends C_a>)C_ag.e.getClass());
      a(10, rs.p_n.p_c.p_b.C_d.class);
      a(11, (Class<? extends C_a>)rs.p_l.p_e.p_a.C_a.w.getClass());
      a(12, (Class<? extends C_a>)C_o.a.getClass());
      a(13, (Class<? extends C_a>)C_O_uc.c.getClass());
      a(14, rs.p_q.p_a.p_a.p_a.C_h.class);
      a(15, (Class<? extends C_a>)C_V_uc.bI.getClass());
      a(16, (Class<? extends C_a>)C_aM_mc.c.getClass());
      a(17, (Class<? extends C_a>)C_aO_mc.g.getClass());
      a(18, (Class<? extends C_a>)C_v.w.getClass());
      a(19, C_p.class);
      a(20, (Class<? extends C_a>)rs.p_q.p_b.C_d.b.getClass());
      a(21, rs.p_q.p_a.p_a.p_a.C_c.class);
      a(22, (Class<? extends C_a>)rs.p_n.p_c.C_c.bL.getClass());
      a(23, rs.p_l.p_f.p_a.p_a.C_d.class);
      a(24, rs.p_l.p_f.p_a.p_i.C_d.class);
      a(25, (Class<? extends C_a>)C_f.s.getClass());
      a(26, (Class<? extends C_a>)rs.p_l.p_e.p_a.C_k.p.getClass());
      a(27, rs.p_l.p_f.p_a.p_h.C_b.class);
      a(28, (Class<? extends C_a>)C_A_uc.c.getClass());
      a(29, C_m.class);
      a(30, (Class<? extends C_a>)C_i.b.getClass());
      a(31, C_e.class);
      a(32, rs.p_q.p_a.p_a.p_a.C_a.class);
      a(33, (Class<? extends C_a>)rs.p_n.p_c.p_a.C_a.e.getClass());
      a(34, rs.p_q.p_a.p_a.p_a.C_e.class);
      a(35, (Class<? extends C_a>)C_aq.f.getClass());
      a(36, (Class<? extends C_a>)C_aw.d.getClass());
      a(37, rs.p_q.p_a.p_a.p_a.C_f.class);
      a(38, rs.p_q.p_a.p_a.p_a.C_o.class);
      a(39, C_g.class);
      a(40, rs.p_q.p_a.p_a.p_a.C_b.class);
      a(41, rs.p_n.p_c.p_d.C_d.class);
      a(42, rs.p_q.p_a.p_a.p_a.C_i.class);
      a(43, C_j.class);
   }

   private static void a(Integer var0, Class<? extends C_a> var1) {
      if (a.get(var0) != null) {
         throw new RuntimeException("ScriptPacket ID " + var0 + " already in use!");
      } else {
         Class var2 = var1;

         try {
            Injector var3 = rs.p_p.C_a.c();

            C_a var4;
            try {
               Constructor var5 = var2.getDeclaredConstructor();
               var5.setAccessible(true);
               var4 = (C_a)var5.newInstance();
            } catch (Throwable var7) {
               throw new RuntimeException(var7);
            }

            Module var9 = var2x -> {
               var2x.bind(var2).toInstance(var4);
               var2x.install(var4);
            };
            Injector var6 = var3.createChildInjector(new Module[]{var9});
            var4.a = var6;
            a.put(var0, var4);
         } catch (CreationException var8) {
            throw new RuntimeException(var8);
         }
      }
   }

   public static void a(C_Client_mc var0, rs.p_x.C_e var1, int var2) {
      C_a var3 = a.get(var2);
      if (var3 == null) {
         System.out.println("Could not find ScriptPacket ID " + var2 + "!");
      } else {
         var3.a(var1);
         var3.a(var0);
         var3.a();
      }
   }
}
