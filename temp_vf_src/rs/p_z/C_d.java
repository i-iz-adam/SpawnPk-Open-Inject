package rs.p_z;

import java.util.HashMap;
import java.util.Map;

public class C_d {
   private Map<String, C_b> a = new HashMap<>();

   public boolean a(String var1, long var2) {
      if (this.a(var1)) {
         return false;
      } else {
         C_a var4 = new C_a(var2);
         var4.a();
         this.a.put(var1, var4);
         return true;
      }
   }

   public void b(String var1, long var2) {
      this.a.remove(var1);
      this.a(var1, var2);
   }

   public boolean a(String var1) {
      return this.a.get(var1) == null ? false : this.a.get(var1).b();
   }

   public long b(String var1) {
      return this.a.get(var1) == null ? 0L : this.a.get(var1).c();
   }

   public void c(String var1) {
      this.a.remove(var1);
   }

   public void a() {
      this.a.clear();
   }

   public Map<String, C_b> b() {
      return this.a;
   }
}
