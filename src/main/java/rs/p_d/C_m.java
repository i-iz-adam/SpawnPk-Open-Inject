package rs.p_d;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;
import p_gnu.p_trove.p_f.p_b.C_cc;

public class C_m {
   public static final C_cc<String> a = new C_cc();

   public static String a(String var0, int var1) {
      return var0 + (a.w_(var1) ? (String)a.b(var1) : "");
   }

   public static void a(int var0, String var1) {
      a.a(var0, var1);
   }

   public static void a() {
      if (!rs.p_l.p_b.p_a.C_d.c) {
         a.clear();
         File var0 = new File(rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "hovers.yaml");
         if (var0.exists()) {
            FileInputStream var1 = new FileInputStream(var0);
            Yaml var2 = new Yaml();
            Map var3 = (Map)var2.load(var1);

            for (Object var5 : var3.keySet()) {
               a.a((Integer)var5, (String)var3.get(var5));
            }
         }
      }
   }
}
