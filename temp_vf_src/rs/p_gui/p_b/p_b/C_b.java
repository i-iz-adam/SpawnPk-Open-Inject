package rs.p_gui.p_b.p_b;

import java.awt.Color;
import java.awt.Image;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.p_d.C_k;
import rs.p_gui.C_Launcher_mc;
import rs.p_gui.C_x;
import rs.p_gui.p_b.C_g;
import rs.p_l.C_F_uc;

public class C_b implements Runnable {
   private static final long a = 50L;
   private static final int b = 3;
   private static final long c = 5000L;
   private List<Integer> d = new CopyOnWriteArrayList<>();
   private List<Integer> e = new CopyOnWriteArrayList<>();
   private final rs.p_A_uc.C_a f = new rs.p_A_uc.C_a();

   public void a(int var1) {
      if (var1 != -1) {
         rs.p_h.C_a.a("LoadoutIco_" + var1, () -> {
            try {
               C_F_uc var1x = C_k.a(var1, 1, 0, 32);
               if (var1x == null) {
                  return true;
               }

               Image var2 = var1x.a(32, 32);
               var2 = C_F_uc.a(var2, new Color(0, 0, 0));
               C_x var3 = new C_x(0);
               var3.a(var2);
               C_g.b.put(var1, var3);
               C_Launcher_mc.n().b(100, true);
            } catch (Exception var4) {
               var4.printStackTrace();
            }

            return false;
         });
      }
   }

   @Override
   public void run() {
   }
}
