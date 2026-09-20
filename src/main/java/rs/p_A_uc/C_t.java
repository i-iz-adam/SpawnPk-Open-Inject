package rs.p_A_uc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C_t {
   private static final Pattern a = Pattern.compile("(?i)[^*]+|(\\*)");

   public static boolean a(String var0, String var1) {
      Matcher var2 = a.matcher(var0);
      StringBuffer var3 = new StringBuffer();
      var3.append("(?i)");

      while (var2.find()) {
         if (var2.group(1) != null) {
            var2.appendReplacement(var3, ".*");
         } else {
            var2.appendReplacement(var3, Matcher.quoteReplacement(Pattern.quote(var2.group(0))));
         }
      }

      var2.appendTail(var3);
      String var4 = var3.toString();
      return var1.matches(var4);
   }
}
