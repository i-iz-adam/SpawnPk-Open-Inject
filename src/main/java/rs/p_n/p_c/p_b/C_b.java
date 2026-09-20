package rs.p_n.p_c.p_b;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_K_uc;
import rs.p_n.C_e;
import rs.p_n.p_a.C_f;

public class C_b {
   private static final int d = 155;
   private static final int e = 17;
   private static C_b.a f = C_b.a.a;
   private static boolean g = false;
   static int a = 0;
   static int b = 0;
   private static int h = 0;
   private static int i = 0;
   public static int c = 0;
   private static int j = 0;
   private static int k = 0;
   private static int l = 32;
   private static int m = 40;
   private static int n = 5;
   private static String o = null;
   private static String[] p = null;
   private static int q = 155;
   private static int r;
   private static int s = 0;
   private static int t = 0;
   private static int u = 0;
   private static int v = 0;
   private static int w = 0;
   private static int x = 100;
   private static int y = 100;

   public static void a(int var0, String var1) {
      int var2 = a = 57017 + var0 * 2;
      int var3 = C_a.e.d().size();
      int var4 = 57017 + var0 * 2 + 1;
      int var5 = var4 - 57017;
      g = false;
      j = 0;
      k = 0;
      l = 32;
      m = 40;
      n = 5;
      h = 0;
      i = 0;
      f = C_b.a.a;
      o = null;
      p = null;
      q = 155;
      r = -1;
      s = 100;
      w = 0;
      u = 0;
      v = 0;
      t = 0;
      y = 100;
      x = 100;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      if (var0 < 100) {
         var1 = a(var1);
         if (var1.contains("<tab")) {
            h = Integer.parseInt(var1.split("<tab=")[1].split(">")[0]);
         }

         switch (f) {
            case c:
               C_e.b(var4, x, y);
               rs.p_d.C_d var10 = rs.p_d.C_d.c(r);
               C_e.l(var4).af = r;
               C_e.l(var4).aW = var10.I;
               C_e.l(var4).aX = var10.E;
               if (t > 0) {
                  C_e.l(var4).aD = t;
               } else {
                  C_e.l(var4).aD = var10.w;
               }

               if (w > 0) {
                  C_e.l(var4).aY = false;
                  C_e.l(var4).aT = w;
               } else {
                  C_e.l(var4).aY = true;
               }

               C_e.l(var2).bf = false;
               var9 = a() + 17 + 20;
               c = var9 + s;
               var8 += u;
               var9 += v;
               break;
            case b:
               if (o != null) {
                  o = var1;
               }

               boolean var11 = false;
               if (p[0].contains("{M}")) {
                  p[0] = p[0].replace("{M}", "");
                  var11 = true;
               }

               rs.p_n.p_a.p_a.C_a.a(var4, p).h(q, 0).g(16777215, 16750623);
               if (var11) {
                  ((rs.p_n.p_a.p_a.C_a)C_e.l(var4)).b();
               }

               var6 = 5;
               var8 = 5;
               if (o != null) {
                  C_e.l(var2).at = o;
                  var8 += h;
               } else {
                  C_e.l(var2).bf = false;
               }

               if (g) {
                  var8 += C_e.l(57016).P / 2 - q / 2;
                  if (o != null) {
                     var6 -= h;
                  }
               }

               if (var3 == 0) {
                  var9 = 10;
               } else {
                  var9 = a() + 17 + (o == null ? 0 : a(var2));
               }

               var7 = var9 + 3;
               if (C_e.l(var2).ao == C_Client_mc.gh) {
                  var7 += 3;
               }

               c = var9;
               if (i == 1) {
                  c += 7;
               }

               if (i == 2) {
                  c += 9;
               }
               break;
            default:
               C_e.l(var2).at = var1;
               C_e.l(var2).bf = true;
               if (j > 0) {
                  C_e.a(var4, j, k, l);
                  C_e.l(var4).T = C_e.l(var2).T;
                  if (g) {
                     int var12 = C_e.l(var2).ao.a(var1) / 2;
                     var8 = -var12 - 10;
                     var6 = 5;
                  } else {
                     var6 = m;
                     var8 = 3;
                  }

                  if (h > 0) {
                     var8 += h - (l > 20 ? l / 2 : 5);
                  }
               } else {
                  C_e.l(var4).bf = false;
                  var6 = 5;
               }

               if (var3 == 0) {
                  var7 = j > 0 ? 17 : 7;
                  var9 = 5;
               } else if (j <= 0 && !C_e.H[var2 - 1].bf) {
                  var7 = a() + 17 + a(var2);
               } else {
                  var9 = a() + 17 + 3 - Math.abs(32 - l) / 2;
                  var7 = a() + 17 + l / 2 - 3;
               }

               c = var7;
         }

         C_a.e.a(var2).a(var6, var7);
         C_a.e.a(var4, false).a(var8, var9);
      }
   }

   private static String a(String var0) {
      int var1 = a;
      if (var0.contains("{DD")) {
         f = C_b.a.b;
         p = var0.split("\\{DD=")[1].split("/}")[0].split("<i>");
         if (var0.contains("{SIZE=")) {
            q = Integer.parseInt(var0.split("\\{SIZE=")[1].split("}")[0]);
            var0 = var0.replace("{SIZE=" + q + "}", "");
         } else {
            q = 155;
         }

         if (var0.contains("{LABEL=")) {
            var0 = var0.split("\\{LABEL=")[1].split("/}")[0];
            o = "";
         }
      }

      if (var0.contains("{NPC")) {
         String var8 = var0.split("\\{NPC=")[1].split("}")[0];
         if (var8.contains(",")) {
            String[] var10 = var8.split(",");
            r = Integer.parseInt(var10[0]);
            s = Integer.parseInt(var10[1]);
         } else {
            r = Integer.parseInt(var0.split("\\{NPC=")[1].split("}")[0]);
         }

         if (var0.contains("{Z=")) {
            w = Integer.parseInt(var0.split("\\{Z=")[1].split("}")[0]);
         }

         if (var0.contains("{X=")) {
            u = Integer.parseInt(var0.split("\\{X=")[1].split("}")[0]);
         }

         if (var0.contains("{Y=")) {
            v = Integer.parseInt(var0.split("\\{Y=")[1].split("}")[0]);
         }

         if (var0.contains("{A=")) {
            t = Integer.parseInt(var0.split("\\{A=")[1].split("}")[0]);
         }

         if (var0.contains("{SIZE=")) {
            x = y = Integer.parseInt(var0.split("\\{SIZE=")[1].split("}")[0]);
         }

         f = C_b.a.c;
         return "";
      } else {
         C_e.H[var1] = C_f.a(var1, var0).m().a("Select option", 300);
         if (!var0.equalsIgnoreCase("{line}") && !var0.startsWith("{line=")) {
            if (var0.contains("{C}")) {
               C_e.l(var1).S = true;
               C_e.l(var1).T = true;
               var0 = var0.replace("{C}", "");
               g = true;
            } else if (var0.contains("{RA}")) {
               C_e.l(var1).U = true;
               C_e.l(var1).S = false;
               C_e.l(var1).T = true;
               var0 = var0.replace("{RA}", "");
               g = true;
            } else {
               C_e.l(var1).U = false;
               C_e.l(var1).S = false;
               C_e.l(var1).T = false;
               g = false;
            }

            if (var0.contains("{L}")) {
               C_e.l(var1).M = 1;
               C_e.l(var1).L = 16777215;
               C_e.l(var1).bo = true;
               b = var1;
               var0 = var0.replace("{L}", "");
            } else {
               C_e.l(var1).M = 0;
               C_e.l(var1).L = 0;
               C_e.l(var1).bx = false;
            }

            if (var0.contains("{B}")) {
               i = 2;
               C_e var11 = C_e.l(var1);
               C_Launcher_mc.n().o();
               var11.ao = C_Client_mc.gj;
               var0 = var0.replace("{B}", "");
            } else if (var0.contains("{M}")) {
               i = 1;
               C_e.l(var1).ao = C_Launcher_mc.n().o().gi;
               var0 = var0.replace("{M}", "");
            } else {
               i = 0;
               C_e var12 = C_e.l(var1);
               C_Launcher_mc.n().o();
               var12.ao = C_Client_mc.gh;
            }

            if (var0.contains("{H=")) {
               String var5 = var0.split("\\{H=")[1];
               String var9 = var5.substring(0, var5.indexOf("}"));
               boolean var4 = var9.contains(",");
               C_e.l(var1).bu = -1;
               if (var4) {
                  C_e.l(var1).bu = Integer.parseInt(var9.split(",")[1]);
                  var9 = var9.split(",")[0];
               }

               C_e.l(var1).br = Integer.parseInt(var9);
               C_e.l(var1).bt = (short)C_e.l(var1).aR;
               if (C_e.l(var1).ao == C_Launcher_mc.n().o().gi) {
                  C_e var13 = C_e.l(var1);
                  var13.bt = (short)(var13.bt + 4);
               }

               C_K_uc var14 = C_e.l(var1).ao;
               C_Launcher_mc.n().o();
               if (var14 == C_Client_mc.gj) {
                  C_e var15 = C_e.l(var1);
                  var15.bt = (short)(var15.bt + 5);
               }

               C_e.l(var1).bs = 75;
               if (var4) {
                  var0 = var0.replace("{H=" + var9 + "," + C_e.l(var1).bu + "}", "");
               } else {
                  var0 = var0.replace("{H=" + var9 + "}", "");
               }
            } else {
               C_e.l(var1).br = 0;
               C_e.l(var1).bt = 0;
               C_e.l(var1).bs = 0;
               C_e.l(var1).bu = -1;
            }

            if (f == C_b.a.a) {
               if (var0.contains("{IS=")) {
                  l = 20;
                  m = 30;
                  String var6 = var0.substring(var0.indexOf("{IS=") + 4, var0.indexOf("}"));
                  if (var6.contains(",")) {
                     j = Integer.parseInt(var6.split(",")[0]);
                     k = Integer.parseInt(var6.split(",")[1]);
                  } else {
                     j = Integer.parseInt(var6);
                  }

                  var0 = var0.replace("{IS=" + var6 + "}", "");
               }

               if (var0.contains("{")) {
                  String var7 = var0.substring(var0.indexOf("{") + 1, var0.indexOf("}"));
                  if (var7.contains(",")) {
                     j = Integer.parseInt(var7.split(",")[0]);
                     k = Integer.parseInt(var7.split(",")[1]);
                  } else {
                     j = Integer.parseInt(var7);
                  }

                  var0 = var0.replace("{" + var7 + "}", "");
               }
            }

            return var0;
         } else {
            C_e.l(var1).M = 0;
            C_e.l(var1).L = 0;
            C_e var10000 = C_e.l(var1);
            C_Launcher_mc.n().o();
            var10000.ao = C_Client_mc.gh;
            C_e.l(var1).S = false;
            C_e.l(var1).br = 0;
            C_e.l(var1).bt = 0;
            C_e.l(var1).bs = 0;
            g = false;
            if (var0.startsWith("{line=")) {
               String var2 = var0.split("\\{line=")[1];
               String var3 = var2.substring(0, var2.indexOf("}"));
               return "<str="
                  + var3
                  + ">                                                                                                                                                    </str>";
            } else {
               return "<str=8683352>                                                                                                                                                    </str>";
            }
         }
      }
   }

   private static int a(int var0) {
      byte var1 = 0;
      if (C_e.l(var0 - 2).ao.q.equalsIgnoreCase("b12_full")) {
         var1 = 3;
      }

      if (C_e.l(var0 - 2).ao.q.equalsIgnoreCase("p11_full") && C_e.l(var0).ao.q.equalsIgnoreCase("b12_full")) {
         var1 = 3;
      }

      if (C_e.l(var0 - 2).ao.q.equalsIgnoreCase("p12_full")) {
         var1 = 2;
      }

      if (C_e.l(var0 - 2).ao.q.equalsIgnoreCase("p11_full") && C_e.l(var0).ao.q.equalsIgnoreCase("p12_full")) {
         var1 = 2;
      }

      return var1;
   }

   private static int a() {
      return c;
   }

   private static enum a {
      a,
      b,
      c;
   }
}
