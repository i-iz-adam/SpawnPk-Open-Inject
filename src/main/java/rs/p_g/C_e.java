package rs.p_g;

public class C_e {
   public static void a(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            try {
               Thread.sleep(1L);
            } catch (InterruptedException var4) {
               var4.printStackTrace();
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var3) {
               var3.printStackTrace();
            }
         }
      }
   }
}
