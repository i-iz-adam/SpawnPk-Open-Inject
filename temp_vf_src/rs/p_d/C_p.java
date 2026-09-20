package rs.p_d;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;
import p_gnu.p_trove.p_f.p_b.C_cc;

public class C_p {
   public static final C_cc<C_p.a> a = new C_cc();

   public static void a() {
      if (!rs.p_l.p_b.p_a.C_d.c) {
         a.clear();
         File var0 = new File(rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "rarities.yaml");
         if (var0.exists()) {
            FileInputStream var1 = new FileInputStream(var0);
            Yaml var2 = new Yaml();
            Map var3 = (Map)var2.load(var1);
            if (var3 != null) {
               for (Object var5 : var3.keySet()) {
                  String var6 = (String)var3.get(var5);
                  if (var6.equalsIgnoreCase("uncommon")) {
                     a.a((Integer)var5, C_p.a.a);
                  }

                  if (var6.equalsIgnoreCase("rare")) {
                     a.a((Integer)var5, C_p.a.b);
                  }

                  if (var6.equalsIgnoreCase("legendary")) {
                     a.a((Integer)var5, C_p.a.c);
                  }
               }
            }
         }
      }
   }

   public static enum a {
      a("<col=65BFFF>"),
      b("<col=BD73FF><shad=773494>"),
      c("<col=FFC81A><shad=9A7705>");

      public String d;

      private a(String var3) {
         this.d = var3;
      }
   }
}
