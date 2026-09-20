package rs.p_t.p_a;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.jackson.dataformat.MessagePackMapper;
import org.yaml.snakeyaml.Yaml;
import p_gnu.p_trove.p_i.p_a.C_i;
import rs.p_d.C_k;

public class C_g extends rs.p_t.C_a {
   public static C_i a = new C_i();
   private static final String c = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "wandering_merchant.yaml";
   private static final String d = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "w.bin";
   protected boolean b = !rs.p_f.C_a.c();

   public C_g() {
      super(c, d);
   }

   public void a() {
      Map var1 = this.b(this.b);

      for (String var3 : var1.keySet()) {
         Map var4 = (Map)var1.get(var3);
         Map var5 = (Map)var4.get("items");

         for (String var7 : var5.keySet()) {
            this.a((Integer)((HashMap)var5.get(var7)).get("id"));
         }
      }
   }

   private void a(int var1) {
      if (var1 != 995 && var1 != 20693 && var1 != 20842) {
         C_k var2 = C_k.f(var1);
         if (var2 != null && var2.F > 0 && var2.p == 799) {
            var1 = var2.F;
         }

         a.b(var1);
      }
   }

   private Map<String, Map<String, Object>> b(boolean var1) {
      if (!var1) {
         Yaml var7 = new Yaml();
         InputStream var8 = Files.newInputStream(new File(this.f).toPath());
         return (Map<String, Map<String, Object>>)var7.load(var8);
      } else {
         InputStream var2 = Files.newInputStream(new File(this.g).toPath());
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();

         int var4;
         while ((var4 = var2.read()) != -1) {
            var3.write(var4);
         }

         byte[] var5 = var3.toByteArray();
         MessagePackMapper var6 = new MessagePackMapper();
         return (Map<String, Map<String, Object>>)var6.readValue(var5, new rs.p_t.C_d());
      }
   }
}
