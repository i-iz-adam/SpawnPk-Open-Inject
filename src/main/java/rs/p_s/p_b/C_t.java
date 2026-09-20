package rs.p_s.p_b;

import com.google.a.b.af;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.a.F;

public class C_t {
   private static final af a = af.a(" ").b().a();

   public static <T extends C_v> List<T> a(Collection<T> var0, String var1) {
      return var0.stream().filter(var1x -> rs.p_A_uc.C_s.a(a.a(var1.toLowerCase()), var1x.d())).sorted(a(var1)).collect(Collectors.toList());
   }

   private static Comparator<C_v> a(String var0) {
      if (F.c(var0)) {
         return Comparator.nullsLast(Comparator.comparing(C_v::b, Comparator.nullsLast(Comparator.reverseOrder())))
            .thenComparing(C_v::a, Comparator.nullsLast(Comparator.naturalOrder()));
      } else {
         Iterable var1 = a.a(var0.toLowerCase());
         return Comparator.nullsLast(Comparator.comparing(var1x -> var0.equalsIgnoreCase(var1x.a()), Comparator.reverseOrder()))
            .thenComparing(
               var1x -> var1x.a() == null ? 0L : a(a.a(var1x.a())).filter(var1xx -> a(var1).anyMatch(var1xxx -> a(var1xx.toLowerCase(), var1xxx))).count(),
               Comparator.reverseOrder()
            )
            .thenComparing(
               var1x -> var1x.d() == null ? 0L : a(var1x.d()).filter(var1xx -> a(var1).anyMatch(var1xxx -> a(var1xx.toLowerCase(), var1xxx))).count(),
               Comparator.reverseOrder()
            )
            .thenComparing(C_v::b, Comparator.nullsLast(Comparator.reverseOrder()))
            .thenComparing(C_v::a, Comparator.nullsLast(Comparator.naturalOrder()));
      }
   }

   private static Stream<String> a(Iterable<String> var0) {
      return StreamSupport.stream(var0.spliterator(), false);
   }

   private static boolean a(String var0, String var1) {
      return var0.contains(var1) || var1.contains(var0);
   }
}
