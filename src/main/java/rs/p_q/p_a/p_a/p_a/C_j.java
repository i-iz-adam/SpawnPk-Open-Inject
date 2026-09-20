package rs.p_q.p_a.p_a.p_a;

import java.util.HashMap;
import java.util.Map;

public class C_j extends rs.p_q.p_a.p_a.C_a {
   public static Map<Integer, Integer> d = new HashMap<>();

   @Override
   public void a() {
      int var1 = this.g();
      int var2 = this.e();
      if (var2 == -1) {
         d.remove(var1);
      } else {
         d.put(var1, var2);
      }
   }
}
