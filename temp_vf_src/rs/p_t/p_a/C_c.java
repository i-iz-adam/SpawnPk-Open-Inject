package rs.p_t.p_a;

import java.io.File;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_d.C_x;

public class C_c extends rs.p_t.C_c<C_x> {
   private static final Logger a = LoggerFactory.getLogger(C_c.class);
   private static final String b = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "graphics.yaml";
   private static final String c = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "g.bin";

   public C_c() {
      super(b, c);
   }

   public C_x b(int var1, Map<String, Object> var2) {
      C_x var3 = new C_x();
      var3.d = var1;
      if (var2.containsKey("clone")) {
         int var4 = (Integer)var2.get("clone");
         if (this.i.containsKey(var4) && !this.h.w_(var4)) {
            var3 = new C_x(var1, this.b(var4, this.i.get(var4)));
         } else if (this.h.w_(var4)) {
            var3 = new C_x(var1, (C_x)this.h.b(var4));
         } else if (C_x.c[var4] != null) {
            var3 = new C_x(var1, C_x.c[var4]);
         } else {
            a.warn("Could not find clone ID {} for GFX {}", var4, var1);
         }
      }

      for (String var5 : var2.keySet()) {
         Object var6 = var2.get(var5);
         String var7 = var5.toLowerCase();
         switch (var7) {
            case "model":
            case "modelid":
               var3.e = (Integer)var6;
               break;
            case "anim":
            case "animation":
               var3.f = (Integer)var6;
               var3.g = var3.f == -1 ? null : rs.p_d.C_a.a[(Integer)var6];
               break;
            case "resizex":
               var3.j = (Integer)var6;
               break;
            case "resizey":
               var3.k = (Integer)var6;
               break;
            case "rotation":
               var3.l = (Integer)var6;
               break;
            case "ambient":
               var3.m = (Integer)var6;
               break;
            case "contrast":
               var3.n = (Integer)var6;
               break;
            case "srccolors":
               var3.h = this.a(var6);
               break;
            case "destcolors":
               var3.i = this.a(var6);
               break;
            case "osrs":
               var3.o = (Boolean)var6;
               break;
            case "osid":
               var3.o = true;
               break;
            case "reshade":
               if (var3.r == null) {
                  var3.r = new rs.p_a.p_b.C_c();
               }

               var3.r.a(new rs.p_a.p_b.C_d((Integer)var6));
               break;
            case "recolor":
            case "recolors":
               if (var3.r == null) {
                  var3.r = new rs.p_a.p_b.C_c();
               }

               var3.r.a(new rs.p_a.p_b.C_a(this.d(var6)));
               break;
            case "retextures":
               if (var3.r == null) {
                  var3.r = new rs.p_a.p_b.C_c();
               }

               var3.r.a().a(this.d(var6));
               break;
            case "textures":
               if (var3.r == null) {
                  var3.r = new rs.p_a.p_b.C_c();
               }

               Map var9 = (Map)var6;

               for (int var11 : var9.keySet()) {
                  var3.r.a().a(var11, this.a(var9.get(var11)));
               }
            case "ref":
            case "clone":
               break;
            default:
               if (rs.p_f.C_a.b()) {
                  a.info("(ID {}) Unknown config: {}", var1, var5);
               }
         }
      }

      return var3;
   }
}
