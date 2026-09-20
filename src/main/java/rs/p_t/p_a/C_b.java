package rs.p_t.p_a;

import java.io.File;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_b extends rs.p_t.C_c<rs.p_d.C_d> {
   private static final Logger a = LoggerFactory.getLogger(C_b.class);
   private static final String b = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "npcs.yaml";
   private static final String c = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "e.bin";

   public C_b() {
      super(b, c);
   }

   @Override
   public rs.p_d.C_d a(int var1, Map<String, Object> var2) {
      rs.p_d.C_d var3 = rs.p_d.C_d.b(var1);
      if (var3.n == -1) {
         var3.n = 0;
      }

      if (var2.containsKey("reset")) {
         var3 = new rs.p_d.C_d();
         var3.x = (long)var1;
      } else {
         var3.l = var3.j = var3.B = -1;
      }

      if (var2.containsKey("clone")) {
         int var4 = (Integer)var2.get("clone");
         if (this.i.containsKey(var4)) {
            if (!this.h.w_(var4)) {
               var3.a(this.a(var4, this.i.get(var4)));
            } else {
               var3.a((rs.p_d.C_d)this.h.b(var4));
            }
         } else {
            var3.a(rs.p_d.C_d.c(var4));
         }
      }

      var3.x = (long)var1;

      for (String var5 : var2.keySet()) {
         Object var6 = var2.get(var5);
         String var7 = var5.toLowerCase();
         switch (var7) {
            case "opacity":
               if (var3.i == null) {
                  var3.i = new rs.p_a.p_b.C_c();
               }

               var3.i.a((Integer)var6);
               break;
            case "name":
               var3.o = (String)var6;
               break;
            case "combatlevel":
               var3.n = (Integer)var6;
               break;
            case "actions":
               var3.p = this.e(var6);
               break;
            case "models":
               var3.L = this.a(var6);
               break;
            case "scaling":
               int[] var9 = this.a(var6);
               var3.I = var9[0];
               var3.E = var9[1];
               break;
            case "scalewidth":
               var3.I = (Integer)var6;
               break;
            case "scaleheight":
               var3.E = (Integer)var6;
               break;
            case "recolor":
            case "recolors":
               if (var3.i == null) {
                  var3.i = new rs.p_a.p_b.C_c();
               }

               var3.i.a(new rs.p_a.p_b.C_a(this.d(var6)));
               break;
            case "retexture":
            case "retextures":
               if (var3.i == null) {
                  var3.i = new rs.p_a.p_b.C_c();
               }

               var3.i.a().a(this.d(var6));
               break;
            case "reshade":
               if (var3.i == null) {
                  var3.i = new rs.p_a.p_b.C_c();
               }

               var3.i.a(new rs.p_a.p_b.C_d((Integer)var6));
               break;
            case "textures":
               if (var3.i == null) {
                  var3.i = new rs.p_a.p_b.C_c();
               }

               Map<?, ?> var10 = (Map<?, ?>)var6;

               for (Object var12x : var10.keySet()) {
                  int var12 = ((Number)var12x).intValue();
                  var3.i.a().a(var12, this.a(var10.get(var12x)));
               }
               break;
            case "srccolors":
               var3.v = this.a(var6);
               break;
            case "destcolors":
               var3.s = this.a(var6);
               break;
            case "chatheadmodels":
               var3.t = this.a(var6);
               break;
            case "size":
               var3.r = this.b(var6);
               break;
            case "standanim":
               var3.w = (Integer)var6;
               break;
            case "walkanim":
               var3.q = (Integer)var6;
               break;
            case "rotateanim":
               var3.l = var3.j = var3.B = (Integer)var6;
               break;
            case "rotateanim180":
               var3.l = (Integer)var6;
               break;
            case "rotateanim90cw":
               var3.B = (Integer)var6;
               break;
            case "rotateanim90ccw":
               var3.j = (Integer)var6;
               break;
            case "minimap":
               var3.F = (Boolean)var6;
               break;
            case "priorityrender":
            case "priority":
               var3.K = (Boolean)var6;
               break;
            case "renderidle":
               var3.g = (Boolean)var6;
               break;
            case "clickable":
               var3.C = (Boolean)var6;
               break;
            case "pet":
               var3.h = (Boolean)var6;
               var3.F = false;
               var3.K = false;
               break;
            case "anint59":
               var3.m = (Integer)var6;
               break;
            case "anint57":
               var3.k = (Integer)var6;
               break;
            case "contrast":
               var3.J = (Integer)var6;
               break;
            case "ambient":
               var3.D = (Integer)var6;
               break;
            case "rotationspeed":
               var3.y = (Integer)var6;
               break;
            case "headicon":
               var3.u = (Integer)var6;
               break;
            case "osrs":
               var3.af = (Boolean)var6;
               break;
            case "icon":
               var3.T = (Integer)var6;
               break;
            case "iconx":
               var3.U = (Integer)var6;
               break;
            case "icony":
               var3.V = (Integer)var6;
               break;
            case "iconz":
               var3.W = (Integer)var6;
               break;
            case "mapicon":
               var3.S = (Integer)var6;
               break;
            case "healthbar":
               var3.O = (Boolean)var6;
               break;
            case "healthbarcolor":
            case "healthbartype":
               if (var6 instanceof String && ((String)var6).equalsIgnoreCase("blue")) {
                  var3.P = 1;
               } else {
                  if (var6 instanceof String && ((String)var6).equalsIgnoreCase("yellow")) {
                     var3.P = 2;
                     continue;
                  }

                  var3.P = (Byte)var6;
               }
               break;
            case "hover":
               var3.X = (String)var6;
               if (var3.X.contains("\n")) {
                  var3.Z = true;
                  var3.X = " " + var3.X;
               }
               break;
            case "forcehover":
            case "hoverforced":
               var3.Y = (Boolean)var6;
               break;
            case "glow":
               int[] var11 = this.a(var6);
               var3.aa = var11[0];
               var3.ac = var11[1];
               var3.ad = var11[2];
               var3.ab = 1;
            case "tags":
            case "clone":
            case "reset":
               break;
            default:
               if (rs.p_f.C_a.b()) {
                  a.info("(ID {} '{}') Unknown config: {}", new Object[]{var1, var3.o, var5});
               }
         }
      }

      boolean var14 = var3.x != 3118L
         && var3.o != null
         && var3.o.toLowerCase().contains("pet")
         && !var3.o.toLowerCase().contains(" shop")
         && !var3.o.toLowerCase().contains("-keeper")
         && !var3.o.toLowerCase().contains("pete");
      if (!var14 && var3.p != null) {
         for (String var18 : var3.p) {
            if (var18 != null && var18.equalsIgnoreCase("pick-up")) {
               var14 = true;
               break;
            }
         }
      }

      if (var14) {
         var3.h = true;
      }

      if (var3.h) {
         var3.r = 1;
         var3.K = false;
         var3.y = 32;
      }

      if (var3.p == null) {
         var3.p = new String[]{null, null, null, null, null};
      }

      return var3;
   }
}
