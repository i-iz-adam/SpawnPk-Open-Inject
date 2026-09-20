package rs.p_d;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;
import p_gnu.p_trove.p_f.p_b.C_bU_mc;

public class C_w {
   private static final HashMap<C_w.a, C_w> c = new HashMap<>();
   private final C_bU_mc b = new C_bU_mc();

   public static void a() {
      c.clear();

      for (C_w.a var3 : C_w.a.values()) {
         C_w var4 = new C_w();
         c.put(var3, var4);
         File var5 = new File(rs.p_v.C_a.f() + File.separator + "configs" + File.separator + var3.b());
         if (var5.exists()) {
            FileInputStream var6 = new FileInputStream(var5);
            Yaml var7 = new Yaml();
            Map var8 = (Map)var7.load(var6);

            for (Object var10 : var8.keySet()) {
               var4.c().a((Integer)var10, (Integer)var8.get(var10));
            }
         }
      }
   }

   public static String a(int var0, String var1) {
      if (!rs.p_s.p_s.C_b.j) {
         return var1;
      } else {
         for (int var2 = 0; var2 < C_w.a.values().length; var2++) {
            C_w.a var3 = C_w.a.values()[var2];
            if (c.get(var3).c().r_(var0)) {
               var1 = var1 + " @cya@(<img=" + var3.a() + ">" + String.format("%,d", c.get(var3).c().c(var0)) + ")";
            }
         }

         return var1;
      }
   }

   public static HashMap<C_w.a, C_w> b() {
      return c;
   }

   public C_bU_mc c() {
      return this.b;
   }

   public static enum a {
      a(180, "blood_core.yaml"),
      b(67, "blood_diamonds.yaml"),
      c(68, "blood_shards.yaml");

      private final int d;
      private final String e;

      public int a() {
         return this.d;
      }

      public String b() {
         return this.e;
      }

      private a(int var3, String var4) {
         this.d = var3;
         this.e = var4;
      }
   }
}
