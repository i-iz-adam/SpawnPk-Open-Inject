package rs.p_t;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import org.msgpack.jackson.dataformat.MessagePackMapper;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;

public class C_a {
   protected String f;
   protected String g;

   public C_a(String var1, String var2) {
      this.f = var1;
      this.g = var2;
   }

   public Map<Integer, Map<String, Object>> a(boolean var1) {
      if (!var1) {
         LoaderOptions var7 = new LoaderOptions();
         var7.setMaxAliasesForCollections(200);
         Yaml var8 = new Yaml(var7);
         InputStream var9 = Files.newInputStream(new File(this.f).toPath());
         return (Map<Integer, Map<String, Object>>)var8.load(var9);
      } else {
         InputStream var2 = Files.newInputStream(new File(this.g).toPath());
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();

         int var4;
         while ((var4 = var2.read()) != -1) {
            var3.write(var4);
         }

         byte[] var5 = var3.toByteArray();
         MessagePackMapper var6 = new MessagePackMapper();
         return (Map<Integer, Map<String, Object>>)var6.readValue(var5, new C_b());
      }
   }

   public void a(Map<Integer, Map<String, Object>> var1) {
      DumperOptions var2 = new DumperOptions();
      var2.setDefaultFlowStyle(FlowStyle.AUTO);
      Yaml var3 = new Yaml(var2);

      try {
         FileWriter var4 = new FileWriter(this.f);

         try {
            var3.dump(var1, var4);
         } catch (Throwable var8) {
            try {
               var4.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }

            throw var8;
         }

         var4.close();
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public void b() {
      LoaderOptions var1 = new LoaderOptions();
      var1.setMaxAliasesForCollections(200);
      Yaml var2 = new Yaml(var1);
      InputStream var3 = Files.newInputStream(new File(this.f).toPath());
      Map var4 = (Map)var2.load(var3);
      this.b(var4);
   }

   public void b(Map<Integer, Map<String, Object>> var1) {
      if (this instanceof C_c) {
         for (int var3 : var1.keySet()) {
            HashMap var4 = new HashMap();

            for (String var6 : ((Map)var1.get(var3)).keySet()) {
               if (var6.equalsIgnoreCase("textures")) {
                  Map var7 = (Map)((Map)var1.get(var3)).get(var6);
                  int[][][] var8 = new int[var7.size()][][];
                  int var9 = 0;

                  for (int var11 : var7.keySet()) {
                     List var12 = (List)var7.get(var11);
                     var8[var9] = new int[2][];
                     var8[var9][0] = this.a(var12);
                     var8[var9][1] = new int[var12.size()];

                     for (int var13 = 0; var13 < var12.size(); var13++) {
                        var8[var9][1][var13] = var11;
                     }

                     var9++;
                  }

                  var4.put(var6, new SimpleEntry<>("retextures", var8));
               }
            }

            for (String var18 : var4.keySet()) {
               SimpleEntry var19 = (SimpleEntry)var4.get(var18);
               ((Map)var1.get(var3)).remove(var18);
               ((Map)var1.get(var3)).put((String)var19.getKey(), var19.getValue());
            }
         }
      }

      MessagePackMapper var14 = new MessagePackMapper();
      byte[] var15 = var14.writeValueAsBytes(var1);
      FileOutputStream var16 = new FileOutputStream(new File(this.g));
      var16.write(var15);
      var16.close();
   }

   protected int[] a(Object var1) {
      return var1 != null && ((List)var1).size() != 0 ? ((List)var1).stream().mapToInt(Integer::intValue).toArray() : null;
   }

   public String c() {
      return this.f;
   }

   public void a(String var1) {
      this.f = var1;
   }

   public String d() {
      return this.g;
   }

   public void b(String var1) {
      this.g = var1;
   }
}
