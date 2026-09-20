package rs.p_A_uc;

import com.google.a.b.H;
import com.google.a.b.af;
import com.google.a.b.k;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.similarity.JaroWinklerDistance;

public class C_s {
   private static final JaroWinklerDistance b = new JaroWinklerDistance();
   private static final Pattern c = Pattern.compile("<[^>]*>");
   private static final af d = af.a(",").a().b();
   private static final H e = H.a(",").a();
   public static final k a = new C_k();

   public static List<String> a(String var0) {
      return d.b(var0);
   }

   public static String a(Collection<String> var0) {
      return e.a(var0);
   }

   public static String b(String var0) {
      return c.matcher(var0).replaceAll("");
   }

   public static String c(String var0) {
      StringBuffer var1 = new StringBuffer();
      Matcher var2 = c.matcher(var0);

      while (var2.find()) {
         var2.appendReplacement(var1, "");
         String var3 = var2.group(0);
         switch (var3) {
            case "<lt>":
            case "<gt>":
               var1.append(var3);
         }
      }

      var2.appendTail(var1);
      return var1.toString();
   }

   public static String d(String var0) {
      return b(var0).replace(' ', ' ').trim().toLowerCase();
   }

   public static String e(String var0) {
      return k.e().j(var0.replaceAll("[ _-]", " ")).trim();
   }

   public static String f(String var0) {
      return b(var0.replaceAll("-<br>", "-").replaceAll("<br>", " ").replaceAll("[ ]+", " "));
   }

   public static String g(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (var3 == '<') {
            var1.append("<lt>");
         } else if (var3 == '>') {
            var1.append("<gt>");
         } else if (var3 == '\n') {
            var1.append("<br>");
         } else if (var3 != '\r') {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   public static String h(String var0) {
      String var1 = var0.contains("<img") ? var0.substring(var0.lastIndexOf(62) + 1) : var0;
      return var1.replace(' ', ' ');
   }

   public static String a(Enum var0) {
      String var1 = var0.toString();
      return var0.name().equals(var1) ? WordUtils.capitalize(var1.toLowerCase(), new char[]{'_'}).replace("_", " ") : var1;
   }

   public static boolean a(Iterable<String> var0, Collection<String> var1) {
      for (String var3 : var0) {
         if (var1.stream().noneMatch(var1x -> var1x.contains(var3) || b.apply(var1x, var3) > 0.9)) {
            return false;
         }
      }

      return true;
   }
}
