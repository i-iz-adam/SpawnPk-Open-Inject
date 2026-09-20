package rs.p_s.p_b;

import java.util.List;

public interface C_v {
   String a();

   List<String> d();

   default boolean b() {
      return false;
   }
}
