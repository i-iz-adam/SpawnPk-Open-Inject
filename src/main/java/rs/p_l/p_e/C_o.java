package rs.p_l.p_e;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C_o {
   public static rs.p_q.p_a.p_a.C_a a = new C_p();
   public Map<String, C_n> b = new HashMap<>();
   public List<C_n> c = new ArrayList<>();

   public C_n a(String var1, int var2, int var3, Color var4, Color var5) {
      C_n var6 = C_n.a(var2, var3, var4, var5);
      this.b.put(var1, var6);
      return var6;
   }

   public void a(String var1, int var2, int var3, Color var4) {
      Color var5 = new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 75);
      this.a(var1, var2, var3, var4, var5);
   }

   public void a(int var1, int var2, Color var3, Color var4) {
      this.a(var1 + "," + var2, var1, var2, var3, var4);
   }

   public void a(int var1, int var2, Color var3) {
      Color var4 = new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), 75);
      this.a(var1, var2, var3, var4);
   }

   public void a(int var1, int var2) {
      this.a(var1, var2, Color.MAGENTA);
   }

   public void b(int var1, int var2) {
      this.b.remove(var1 + "," + var2);
   }
}
