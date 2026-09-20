package rs.p_k.p_b;

import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class C_b extends LinkedHashMap<Integer, FloatBuffer> {
   private final C_a a;

   public C_b(C_a var1) {
      super(512, 0.7F, true);
      this.a = var1;
   }

   public boolean a() {
      Iterator var1 = super.values().iterator();
      if (var1.hasNext()) {
         this.a.a((FloatBuffer)var1.next());
         var1.remove();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void clear() {
      Iterator var1 = super.values().iterator();

      while (var1.hasNext()) {
         this.a.a((FloatBuffer)var1.next());
         var1.remove();
      }
   }
}
