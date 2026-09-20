package rs.p_runelite.p_b;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Singleton;

@Singleton
public class C_a {
   private static final List<C_a.a> a = new CopyOnWriteArrayList<>();
   private static final List<C_a.a> b = new CopyOnWriteArrayList<>();

   public static List<C_a.a> a() {
      return a;
   }

   public static List<C_a.a> b() {
      return b;
   }

   @FunctionalInterface
   public interface a {
      boolean draw(rs.p_a.C_a var1, boolean var2);
   }
}
