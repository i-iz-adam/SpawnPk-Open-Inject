package rs.p_l;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class C_u extends LinkedHashMap<Long, Long> {
   C_u(int var1, float var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected boolean removeEldestEntry(Entry<Long, Long> var1) {
      return this.size() > 512;
   }
}
