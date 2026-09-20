package rs.p_t.p_a;

import java.io.File;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_a extends rs.p_t.C_c<rs.p_d.C_a> {
   private static final Logger a = LoggerFactory.getLogger(C_a.class);
   private static final String b = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "anims.yaml";
   private static final String c = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "a.bin";

   public C_a() {
      super(b, c);
   }

   public rs.p_d.C_a b(int var1, Map<String, Object> var2) {
      rs.p_d.C_a var3 = new rs.p_d.C_a();
      var3.r = var1;
      if (var2.containsKey("clone")) {
         int var4 = (Integer)var2.get("clone");
         if (this.i.containsKey(var4) && !this.h.w_(var4)) {
            var3 = new rs.p_d.C_a(var1, this.b(var4, this.i.get(var4)));
         } else if (this.h.w_(var4)) {
            var3 = new rs.p_d.C_a(var1, (rs.p_d.C_a)this.h.b(var4));
         } else if (rs.p_d.C_a.a[var4] != null) {
            var3 = new rs.p_d.C_a(var1, rs.p_d.C_a.a[var4]);
         } else {
            a.warn("Could not find clone ID {} for Anim {}", var4, var1);
         }
      }

      for (String var5 : var2.keySet()) {
         Object var6 = var2.get(var5);
         String var7 = var5.toLowerCase();
         switch (var7) {
            case "frames":
               var3.d = (Integer)var6;
               break;
            case "frameids":
               var3.e = this.a(var6);
               break;
            case "durations":
               var3.g = this.a(var6);
               break;
            case "secondary":
               var3.f = this.a(var6);
               break;
            case "framestep":
               var3.h = (Integer)var6;
               break;
            case "priority":
               var3.k = (Integer)var6;
               break;
            case "playeroffhand":
               var3.l = (Integer)var6 == -1 ? -1 : (Integer)var6 + 512;
               break;
            case "playermainhand":
               var3.m = (Integer)var6 == -1 ? -1 : (Integer)var6 + 512;
               break;
            case "maxloops":
               var3.n = (Integer)var6;
               break;
            case "precedence":
               var3.o = (Integer)var6;
               break;
            case "walkprecedence":
               var3.p = (Integer)var6;
               break;
            case "replaymode":
               var3.q = (Integer)var6;
               break;
            case "osid":
               var3.w = true;
               break;
            case "stretches":
               var3.j = (Boolean)var6;
               break;
            case "walkable":
               boolean var9 = (Boolean)var6;
               if (var9) {
                  var3.k = 6;
                  var3.n = 1;
                  var3.o = 2;
                  var3.p = 2;
                  var3.f = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                  var3.i = new int[]{9, 11, 13, 15, 17, 19, 165, 167, 169, 171, 173, 175, 177, 179, 9999999};
               } else {
                  var3.o = 0;
                  var3.p = 0;
               }
               break;
            case "interleave":
               var3.i = this.a(var6);
               break;
            case "animmayaid":
               var3.B = (Integer)var6;
               break;
            case "animmayastart":
               var3.z = (Integer)var6;
               break;
            case "animmayaend":
               var3.A = (Integer)var6;
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
