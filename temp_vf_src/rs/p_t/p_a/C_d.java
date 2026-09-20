package rs.p_t.p_a;

import java.io.File;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_d.C_k;
import rs.p_d.C_m;
import rs.p_d.C_n;

public class C_d extends rs.p_t.C_c<C_k> {
   private static final Logger a = LoggerFactory.getLogger(C_d.class);
   private static final String b = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "items.yaml";
   private static final String c = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "i.bin";

   public C_d() {
      super(b, c);
   }

   public C_k b(int var1, Map<String, Object> var2) {
      C_k var3 = C_k.e(var1);
      Boolean var4 = null;
      if (var2.containsKey("clone") || var2.containsKey("fullClone")) {
         int var5 = var2.containsKey("fullClone") ? (Integer)var2.get("fullClone") : (Integer)var2.get("clone");
         C_k var6;
         if (this.i.containsKey(var5)) {
            if (!this.h.w_(var5)) {
               var6 = this.b(var5, this.i.get(var5));
            } else {
               var6 = (C_k)this.h.b(var5);
            }
         } else {
            var6 = C_k.f(var5);
         }

         var3.a(var6);
         var4 = var6.ar;
      }

      if (var2.containsKey("hoverClone") || var2.containsKey("fullClone")) {
         int var25 = var2.containsKey("fullClone") ? (Integer)var2.get("fullClone") : (Integer)var2.get("clone");
         if (this.i.containsKey(var25) && !this.h.w_(var25)) {
            this.b(var25, this.i.get(var25));
         }

         if (C_m.a.w_(var25)) {
            C_m.a(var1, (String)C_m.a.b(var25));
         }
      }

      var3.i = var1;
      boolean var26 = false;

      for (String var7 : var2.keySet()) {
         if (!var7.startsWith("param_")) {
            Object var8 = var2.get(var7);
            String var9 = var7.toLowerCase();
            switch (var9) {
               case "beginnergear":
                  var3.at = 373;
                  var3.au = 20;
                  var3.av = 20;
                  break;
               case "name":
                  var3.w = (String)var8;
                  var3.x = var3.w.replace("@gre@", "");
                  break;
               case "actions":
                  var3.L = this.e(var8);
                  var26 = true;
                  break;
               case "groundactions":
                  var3.u = this.e(var8);
                  break;
               case "stackable":
                  var3.C = (Boolean)var8;
                  break;
               case "broken":
                  var3.V = (Boolean)var8;
                  var3.L = new String[]{null, null, null, null, "Destroy"};
                  break;
               case "note":
                  var3.C = true;
                  var3.F = (Integer)var8;
                  if (var3.F == -1) {
                     var3.p = -1;
                  } else {
                     if (var3.p == -1) {
                        var3.p = 799;
                     }

                     if (!var26 && var3.F != -1) {
                        var3.L = new String[]{null, null, null, null, "Drop"};
                     }
                  }
                  break;
               case "template":
                  var3.p = (Integer)var8;
                  break;
               case "cert":
                  var3.F = (Integer)var8;
                  break;
               case "srccolors":
                  var3.g = this.a(var8);
                  break;
               case "destcolors":
                  var3.h = this.a(var8);
                  break;
               case "modelid":
                  var3.A = (Integer)var8;
                  break;
               case "stackids":
                  var3.P = this.a(var8);
                  break;
               case "stackamounts":
                  var3.ab = this.a(var8);
                  break;
               case "zoom":
                  var3.G = (Integer)var8;
                  break;
               case "rotations":
                  int[] var11 = this.a(var8);
                  var3.M = var11[0];
                  var3.Z = var11[1];
                  break;
               case "offsets":
                  int[] var12 = this.a(var8);
                  var3.v = var12[0];
                  var3.W = var12[1];
                  break;
               case "zan2d":
                  var3.ae = (Integer)var8;
                  break;
               case "ambient":
                  var3.X = (Integer)var8;
                  break;
               case "contrast":
                  var3.I = (Integer)var8;
                  break;
               case "resize":
                  int[] var13 = this.a(var8);
                  var3.t = var13[0];
                  var3.O = var13[1];
                  var3.N = var13[2];
                  break;
               case "malemodel1":
                  var3.r = (Integer)var8;
                  break;
               case "malemodel":
                  var3.r = (Integer)var8;
                  var3.K = var3.J = -1;
                  break;
               case "femalemodel":
                  var3.aa = (Integer)var8;
                  var3.q = var3.o = -1;
                  break;
               case "femalemodel1":
                  var3.aa = (Integer)var8;
                  break;
               case "malemodels":
                  int[] var14 = this.a(var8);
                  var3.r = var14[0];
                  var3.K = var14.length >= 2 ? var14[1] : -1;
                  var3.J = var14.length >= 3 ? var14[2] : -1;
                  break;
               case "femalemodels":
                  int[] var15 = this.a(var8);
                  var3.aa = var15[0];
                  var3.q = var15.length >= 2 ? var15[1] : -1;
                  var3.o = var15.length >= 2 ? var15[2] : -1;
                  break;
               case "maleoffsets":
                  int[] var16 = this.a(var8);
                  var3.af = (byte)var16[0];
                  var3.ag = (byte)var16[1];
                  var3.ah = (byte)var16[2];
                  break;
               case "femaleoffsets":
                  int[] var17 = this.a(var8);
                  var3.ai = (byte)var17[0];
                  var3.ak = (byte)var17[1];
                  var3.aj = (byte)var17[2];
                  break;
               case "femaleoffsety":
                  var3.ak = (byte)((Integer)var8).intValue();
                  break;
               case "femaleoffsetx":
                  var3.ai = (byte)((Integer)var8).intValue();
                  break;
               case "maleoffsety":
                  var3.ag = (byte)((Integer)var8).intValue();
                  break;
               case "maleoffsetx":
                  var3.af = (byte)((Integer)var8).intValue();
                  break;
               case "newmaleoffsetx":
                  var3.al = (byte)((Integer)var8).intValue();
                  break;
               case "newmaleoffsety":
                  var3.am = (byte)((Integer)var8).intValue();
                  break;
               case "newmaleoffsetz":
                  var3.an = (byte)((Integer)var8).intValue();
                  break;
               case "newfemaleoffsetx":
                  var3.ao = (byte)((Integer)var8).intValue();
                  break;
               case "newfemaleoffsety":
                  var3.aq = (byte)((Integer)var8).intValue();
                  break;
               case "newfemaleoffsetz":
                  var3.ap = (byte)((Integer)var8).intValue();
                  break;
               case "newmaleoffsets":
                  int[] var18 = this.a(var8);
                  var3.al = (byte)var18[0];
                  var3.am = (byte)var18[1];
                  var3.an = (byte)var18[2];
                  break;
               case "newfemaleoffsets":
                  int[] var19 = this.a(var8);
                  var3.ao = (byte)var19[0];
                  var3.aq = (byte)var19[1];
                  var3.ap = (byte)var19[2];
                  break;
               case "malechatmodels":
                  int[] var20 = this.a(var8);
                  var3.B = var20[0];
                  var3.s = var20[1];
                  break;
               case "femalechatmodels":
                  int[] var21 = this.a(var8);
                  var3.Y = var21[0];
                  var3.z = var21[1];
                  break;
               case "fulltexture":
                  var3.R = (Integer)var8;
                  break;
               case "textureinvanim":
                  var3.U = (Boolean)var8;
                  break;
               case "opacity":
                  if (var3.aw == null) {
                     var3.aw = new rs.p_a.p_b.C_c();
                  }

                  var3.aw.a((Integer)var8);
                  break;
               case "recolor":
               case "recolors":
                  if (var3.aw == null) {
                     var3.aw = new rs.p_a.p_b.C_c();
                  }

                  var3.aw.a(new rs.p_a.p_b.C_a(this.d(var8)));
                  break;
               case "retexture":
               case "retextures":
                  if (var3.aw == null) {
                     var3.aw = new rs.p_a.p_b.C_c();
                  }

                  var3.aw.a().a(this.d(var8));
                  break;
               case "reshade":
                  if (var3.aw == null) {
                     var3.aw = new rs.p_a.p_b.C_c();
                  }

                  var3.aw.a(new rs.p_a.p_b.C_d((Integer)var8));
                  break;
               case "textures":
                  if (var3.aw == null) {
                     var3.aw = new rs.p_a.p_b.C_c();
                  }

                  Map var22 = (Map)var8;

                  for (int var24 : var22.keySet()) {
                     var3.aw.a().a(var24, this.a(var22.get(var24)));
                  }
                  break;
               case "osrs":
                  var3.ar = (Boolean)var8;
                  break;
               case "iconitem":
                  var3.as = (Integer)var8;
                  break;
               case "icon":
                  var3.at = (Integer)var8;
                  break;
               case "iconoffset":
               case "iconoffsets":
                  int[] var23 = this.a(var8);
                  var3.au = var23[0];
                  var3.av = var23[1];
                  break;
               case "iconx":
                  var3.au = (Integer)var8;
                  break;
               case "icony":
                  var3.av = (Integer)var8;
                  break;
               case "hover":
                  C_m.a(var1, "\n" + (String)var8);
                  break;
               case "disableinvhover":
               case "disableinventoryhover":
                  var3.ax = (Boolean)var8;
               case "fullclone":
               case "equipclone":
               case "cloneequip":
               case "clone":
               case "tradeable":
               case "bankable":
               case "autoloss":
               case "autolost":
               case "autobankable":
               case "autokeep":
               case "droppable":
               case "destroy":
                  break;
               default:
                  if (rs.p_f.C_a.b()) {
                     a.info("(ID {} '{}') Unknown config: {}", new Object[]{var1, var3.w, var7});
                  }
            }
         }
      }

      if (var4 != null && !this.a(var2, "osrs")) {
         var3.ar = var4;
      }

      if (var3.at != -1) {
         C_n.a.a(var3.i, new C_n(C_n.a.a, var3.at, var3.au, var3.av));
      } else if (var3.as != -1) {
         C_n.a.a(var3.i, new C_n(C_n.a.b, var3.as, var3.au, var3.av));
      }

      return var3;
   }

   private boolean a(Map<String, Object> var1, String var2) {
      for (String var4 : var1.keySet()) {
         if (var4.equalsIgnoreCase(var2)) {
            return true;
         }
      }

      return false;
   }
}
