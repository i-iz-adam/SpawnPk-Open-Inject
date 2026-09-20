package rs.p_n;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.C_Client_mc;
import rs.C_O_uc;
import rs.p_a.C_h;
import rs.p_d.C_k;
import rs.p_d.C_m;
import rs.p_d.C_r;
import rs.p_d.C_x;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_j;
import rs.p_n.p_c.C_ac;
import rs.p_x.C_f;

public class C_a {
   private static final CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList<>();
   private static boolean b = false;

   public static void a(C_Client_mc var0, String var1, String[] var2) {
      String var3 = var1.toLowerCase();
      switch (var3) {
         case "checkscreen":
            System.out.println(C_Client_mc.aj + "x" + C_Client_mc.ak);
            break;
         case "repack":
            C_Client_mc.ew.a();
            C_f var5 = C_Launcher_mc.n().o().a(2, "config", "config", C_Launcher_mc.n().o().eE[2], 30);
            if (var5 != null) {
               rs.p_d.C_a.a(var5);
               C_x.a(var5);
            }

            C_Launcher_mc.n().o().b(true);
            break;
         case "gfxdata":
            C_x var6 = C_x.c[Integer.parseInt(var2[0])];
            System.out.println("GFX " + var6.d + ": model: " + var6.e + ", anim:" + var6.f);
            break;
         case "animdata":
            rs.p_d.C_a var7 = rs.p_d.C_a.a[Integer.parseInt(var2[0])];
            System.out.println("frames: " + Arrays.toString(var7.e));
            System.out.println("frameDurations: " + Arrays.toString(var7.g));
            break;
         case "macaddress":
            try {
               Enumeration var30 = NetworkInterface.getNetworkInterfaces();

               while (var30.hasMoreElements()) {
                  NetworkInterface var31 = (NetworkInterface)var30.nextElement();
                  byte[] var34 = var31.getHardwareAddress();
                  if (var34 != null) {
                     StringBuilder var37 = new StringBuilder();

                     for (int var40 = 0; var40 < var34.length; var40++) {
                        var37.append(String.format("%02X%s", var34[var40], var40 < var34.length - 1 ? "-" : ""));
                     }

                     System.out.println(var37.toString());
                  }
               }
            } catch (SocketException var29) {
               var29.printStackTrace();
            }
            break;
         case "dumpclip":
            int var8 = 0;
            ArrayList var9 = new ArrayList();

            for (String var41 : var2) {
               var9.add(Integer.parseInt(var41));
            }

            for (int var36 : var9) {
               long var39 = System.currentTimeMillis();
               var0.c(var36);
               rs.C_e.b();
               rs.C_e.a();
               var8++;
               long var42 = System.currentTimeMillis() - var39;
               System.out.println("Progress: " + var8 + "/" + var9.size() + " (" + var42 + " ms)");
            }
            break;
         case "tipint":
            int var10 = Integer.parseInt(var2[0]);
            rs.p_l.p_f.p_a.p_i.C_e var11 = rs.p_l.p_f.p_a.p_i.C_e.valueOf(var2[1].toUpperCase());
            int var12 = 0;
            int var13 = 0;
            int var14 = C_e.H[var10].P;
            int var15 = C_e.H[var10].P;
            if (C_e.H[var10].E != null) {
               var14 = C_e.H[var10].E.n;
               var15 = C_e.H[var10].E.o;
            }

            switch (var11) {
               case b:
                  var12 = -30;
                  var13 = var15 / 2 - 15;
                  break;
               case a:
                  var12 = var14 + 30;
                  var13 = var15 / 2 - 15;
            }

            rs.p_l.p_f.p_a.p_i.C_b.a(var10, var11, var12, var13);
            rs.p_l.p_f.p_a.p_i.C_b.k().b(true);
            break;
         case "acc":
            rs.p_l.p_f.C_e.d().h().a(var2[0], var2[1], var2[2]);
            break;
         case "particle":
            rs.p_l.p_f.C_e.d().g().b(20, 77, 125, 16764195);
            rs.p_l.p_f.C_e.d().g().b(10, 77, 125, 65315);
            break;
         case "dumpcommands":
            try {
               BufferedReader var43 = new BufferedReader(new FileReader(new File("commands.txt")));
               byte var48 = -1;

               String var45;
               while ((var45 = var43.readLine()) != null) {
                  String var54 = var45;
                  if (!var45.startsWith("::")) {
                     var54 = "::" + var45;
                  }

                  C_Client_mc.fv.a(103);
                  C_Client_mc.fv.b(var54.length() - 1);
                  C_Client_mc.fv.a(var54.substring(2));
               }

               var43.close();
               break;
            } catch (FileNotFoundException var27) {
               throw new RuntimeException(var27);
            } catch (IOException var28) {
               throw new RuntimeException(var28);
            }
         case "test":
            short[] var16 = new short[]{-27417, -27423, -32479, -32484, -32725, -32593};

            for (short var56 : var16) {
               System.out.print(var56 + '\ufffe' + ",");
            }
            break;
         case "region":
            int var17 = Integer.parseInt(var2[0]);
            System.out.println("Searcing regions..");

            for (int var46 = 0; var46 < C_Client_mc.ew.n.length; var46++) {
               if (C_Client_mc.ew.n[var46] == var17) {
                  System.out.println("--- IDX " + var46 + " ----");
                  System.out.println("region: " + C_Client_mc.ew.n[var46]);
                  System.out.println("map file id: " + C_Client_mc.ew.l[var46]);
                  System.out.println("landscape file id: " + C_Client_mc.ew.i[var46]);
                  System.out.println();
               }
            }
            break;
         case "mapfile":
            int var18 = Integer.parseInt(var2[0]);
            System.out.println("Searcing regions..");

            for (int var52 = 0; var52 < C_Client_mc.ew.n.length; var52++) {
               if (C_Client_mc.ew.l[var52] == var18 || C_Client_mc.ew.i[var52] == var18) {
                  System.out.println("--- IDX " + var52 + " ----");
                  System.out.println("region: " + C_Client_mc.ew.n[var52]);
                  System.out.println("map file id: " + C_Client_mc.ew.l[var52]);
                  System.out.println("landscape file id: " + C_Client_mc.ew.i[var52]);
                  System.out.println();
               }
            }
            break;
         case "resetnpcdefs":
            rs.p_h.C_f.b = true;
            break;
         case "topbar":
            C_ac.c(Boolean.parseBoolean(var2[0]));
            break;
         case "botbar":
            C_ac.d(Boolean.parseBoolean(var2[0]));
            break;
         case "colors":
            if (C_k.f(Integer.parseInt(var2[0])) == null) {
               var0.a("Can't find item definition!", 0, "");
            } else {
               C_h var51 = new C_h(C_k.f(Integer.parseInt(var2[0])).A);
               ArrayList var55 = new ArrayList();
               if (var51 != null && var51.ar != null) {
                  for (int var57 = 0; var57 < var51.ah; var57++) {
                     if (!var55.contains(var51.ar[var57])) {
                        var55.add(var51.ar[var57]);
                     }
                  }

                  for (int var58 = 0; var58 < var55.size(); var58++) {
                     var0.a("[" + var58 + "] = " + var55.get(var58), 0, "");
                     System.out.print(var55.get(var58) + ", ");
                  }
               } else {
                  var0.a("Can't find item model! ", 0, "");
               }
            }
            break;
         case "friends":
            for (int var50 = 197; var50 < 350; var50++) {
               var0.a(C_O_uc.a("Buddy " + var50));
            }
            break;
         case "disconnect":
            System.out.println("breakpoint");
            break;
         case "clearchat":
            for (int var49 = 0; var49 < 200; var49++) {
               var0.dz[var49] = 0;
               var0.dA[var49] = 0;
               var0.dB[var49] = null;
               var0.dC[var49] = null;
               var0.dD[var49] = false;
            }
            break;
         case "itemhovers":
            try {
               C_m.a();
            } catch (FileNotFoundException var26) {
               var26.printStackTrace();
            }

            var0.a("<img=2> Item hover descriptions reloaded!", 0, "");
            break;
         case "objectdef":
            C_r var19 = C_r.c(Integer.parseInt(var2[0]));
            System.out.println("objectDef.anIntArray773 = " + Arrays.toString(var19.an));
            System.out.println("objectDef.originalModelColors = " + Arrays.toString(var19.W));
            System.out.println("objectDef.modifiedModelColors = " + Arrays.toString(var19.ax));
            System.out.println("objectDef.anInt781 = " + var19.au);
            System.out.println("objectDef.sizeX = " + var19.U);
            System.out.println("objectDef.sizeY = " + var19.af);
            break;
         case "noteable":
            short var20 = 24243;
            int[] var21 = new int[]{3268};

            for (int var64 = 0; var64 < var21.length; var64++) {
               System.out.println("[ITEM " + (var20 + var64) + "]");
               System.out.println("actions=null,null,null,null,Drop");
               System.out.println("modelId=2789");
               System.out.println("template=799");
               System.out.println("certid=" + var21[var64]);
            }
            break;
         case "kw_int":
            if (var2.length != 0 && !var2[0].equalsIgnoreCase("reload")) {
               if (var2[0].equalsIgnoreCase("edit")) {
                  if (rs.p_l.p_e.C_f.i.f() && var2.length == 0) {
                     rs.p_l.p_e.C_f.i.a(false);
                  } else {
                     rs.p_l.p_e.C_f.i.a(true);
                     rs.p_l.p_e.C_f.i.b(var2.length == 0 ? 0 : Integer.parseInt(var2[1]));
                  }
               }

               if (var2[0].equalsIgnoreCase("check")) {
                  int var59 = Integer.parseInt(var2[1]);
                  int var65 = var2.length == 3 ? Integer.parseInt(var2[2]) : var59;
                  System.out.println("Checking availablility for interface ID(s) " + var59 + " to " + var65 + "...");

                  for (int var70 = var59; var70 <= var65; var70++) {
                     if (C_e.H[var70] != null) {
                        System.out.println("[WARNING] Interface ID " + var70 + " is in use!");
                     } else {
                        System.out.println("[!!!!] Interface ID " + var70 + " is free for use!");
                     }
                  }

                  System.out.println("..Check complete!");
               }

               if (var2[0].equalsIgnoreCase("setmedia")) {
                  int var60 = Integer.parseInt(var2[1]);
                  int var66 = Integer.parseInt(var2[2]);
                  C_e.H[var60].af = var66;
               }

               if (var2[0].equalsIgnoreCase("setmessage")) {
                  int var61 = Integer.parseInt(var2[1]);
                  String var67 = var2[2];
                  C_e.H[var61].at = var67;
               }

               if (var2[0].equalsIgnoreCase("print")) {
                  int var62 = Integer.parseInt(var2[1]);
                  C_e var68 = C_e.H[var62];
                  System.out.println();
                  System.out.print("type = " + var68.aI + ";\n");
                  switch (var68.aI) {
                     case 6:
                        System.out.print("mediaID = " + var68.af + ";\n");
                        System.out.print("width = " + var68.P + ";\n");
                        System.out.print("height = " + var68.aR + ";\n");
                        System.out.print("modelZoom = " + var68.aT + ";\n");
                        System.out.print("modelRotation1 = " + var68.aU + ";\n");
                        System.out.print("modelRotation2 = " + var68.aV + ";\n");
                        System.out.print("anInt233 = " + var68.ae + ";\n");
                     default:
                        System.out.println();
                        if (var68.az != null) {
                           System.out.println("inv = new int[" + var68.az.length + "];");
                           System.out.println("invStackSizes = new int[" + var68.ax.length + "];");
                           System.out.println("actions = new String[] {" + Arrays.toString((Object[])var68.W).replace("[", "").replace("]", "") + "};");
                           System.out.println("width = " + var68.P + ";");
                           System.out.println("height = " + var68.aR + ";");
                           System.out.println("invSpritePadX = " + var68.ac + ";");
                           System.out.println("invSpritePadY = " + var68.ap + ";");
                           System.out.println("invSpriteSize = " + var68.bD + ";");
                        } else if (var68.al != null) {
                           System.out.println("children = new int[] {" + Arrays.toString(var68.al).replace("[", "").replace("]", "") + "};");
                           System.out.println("childX = new int[] {" + Arrays.toString(var68.am).replace("[", "").replace("]", "") + "};");
                           System.out.println("childY = new int[] {" + Arrays.toString(var68.bc).replace("[", "").replace("]", "") + "};");
                        }

                        System.out.println();
                  }
               }

               if (var2[0].equalsIgnoreCase("showall") || var2[0].equalsIgnoreCase("show")) {
                  rs.p_f.C_a.an = !rs.p_f.C_a.an;
               }

               if (var2[0].equalsIgnoreCase("find_model")) {
               }

               if (var2[0].equalsIgnoreCase("find_empty")) {
                  int var63 = 1;
                  if (var2.length > 1) {
                     var63 = Integer.parseInt(var2[1]);
                  }

                  for (int var69 = 30000; var69 <= 70000; var69++) {
                     boolean var71 = false;
                     if (C_e.H[var69] == null) {
                        var71 = true;

                        for (int var73 = 1; var73 < var63; var73++) {
                           if (C_e.H[var69 + var63] != null) {
                              var71 = false;
                           }
                        }

                        if (var71) {
                           System.out.println("Found a range of " + var63 + " free interface IDS: " + var69 + " -> " + (var69 + var63));
                           var69 += var63;
                        }
                     }
                  }

                  var0.a();
                  var0.a("Interfaces reloaded.", 0, "");
               }
            } else {
               var0.a();
               var0.a("Interfaces reloaded.", 0, "");
            }
            break;
         case "checkthing":
            System.out.println("modelZoom = " + C_e.H[4883].aT);
            System.out.println("modelRotation1 = " + C_e.H[4883].aU);
            System.out.println("modelRotation2 = " + C_e.H[4883].aV);
            break;
         case "dumpitems":
            var0.a(false);
            break;
         case "resetgraphs":
            var0.b();
            break;
         case "itemdef":
            if (var2[0].equalsIgnoreCase("reset")) {
               rs.p_h.C_f.a = true;
            } else {
               int var22 = Integer.valueOf(var2[0]);
               C_k var23 = C_k.f(var22);
               System.out.println();
               System.out.println("[ITEM " + var22 + "]");
               System.out.println("modelID=" + var23.A);
               if (var23.r > 0) {
                  System.out.println("maleEquip1=" + var23.r);
               }

               if (var23.K > 0) {
                  System.out.println("maleEquip2=" + var23.K);
               }

               if (var23.aa > 0) {
                  System.out.println("femaleEquip1=" + var23.aa);
               }

               if (var23.q > 0) {
                  System.out.println("femaleEquip2=" + var23.q);
               }

               System.out.println("certID=" + var23.F);
               System.out.println("templateID=" + var23.p);
               System.out.println("rotationX=" + var23.M);
               System.out.println("rotationY=" + var23.Z);
               System.out.println("zoom=" + var23.G);
               System.out.println("offset1=" + var23.v);
               System.out.println("offset2=" + var23.W);
               System.out.println("contrast=" + var23.I);
               System.out.println("ambient=" + var23.X);
               if (var23.o != -1) {
                  System.out.println("anInt162=" + var23.o);
               }

               if (var23.ae != 0) {
                  System.out.println("anInt204=" + var23.ae);
               }

               if (var23.h != null) {
                  System.out.println("modifiedModelColors=" + Arrays.toString(var23.g).replace("[", "").replace("]", "").replace(" ", ""));
                  System.out.println("originalModelColors=" + Arrays.toString(var23.h).replace("[", "").replace("]", "").replace(" ", ""));
               }

               if (var23.P != null) {
                  System.out.println("stackIds=" + Arrays.toString(var23.P).replace("[", "").replace("]", "").replace(" ", ""));
                  System.out.println("stackAmounts=" + Arrays.toString(var23.ab).replace("[", "").replace("]", "").replace(" ", ""));
               }

               C_Client_mc.M();
               System.out.println();
            }
            break;
         case "entitydef":
            int var24 = Integer.valueOf(var2[0]);
            rs.p_d.C_d var25 = rs.p_d.C_d.c(var24);
            System.out.println("entityDef.standAnim = " + var25.w + ";");
            System.out.println("entityDef.walkAnim = entityDef.anInt55 = entityDef.anInt83 = entityDef.anInt58 = " + var25.q + ";");
            System.out.println("entityDef.anInt86 = " + var25.E + ";");
            System.out.println("entityDef.anInt91 = " + var25.I + ";");
            System.out.println("entityDef.anIntArray94 = new int[] " + Arrays.toString(var25.L).replace("[", "{").replace("]", "}") + ";");
            System.out.println("entityDef.anIntArray70 = new int[] " + Arrays.toString(var25.s).replace("[", "{").replace("]", "}") + ";");
            System.out.println("entityDef.anIntArray76 = new int[] " + Arrays.toString(var25.v).replace("[", "{").replace("]", "}") + ";");
            break;
         case "texture":
         case "textures":
            rs.p_l.p_e.C_f.j.r = true;
            rs.p_l.p_e.C_f.j.s = 0;
            break;
         case "gpuinv":
            rs.p_k.C_e.a(true);
      }
   }

   public static void b(C_Client_mc var0, String var1, String[] var2) {
      String var3 = var1.toLowerCase();
      switch (var3) {
         case "cmdmode":
         case "chatcmd":
         case "chatcmdmode":
            if (C_j.a(C_Client_mc.cT)) {
               rs.p_f.C_a.O = !rs.p_f.C_a.O;
               var0.a("<img=2> Chat command mode has been: " + (rs.p_f.C_a.O ? "@dgr@<img=24>ENABLED" : "@dre@<img=25>DISABLED"), 0, "");
               if (rs.p_f.C_a.O) {
                  var0.a("<img=2> Type @dpu@chatcmd@bla@ to toggle it back off!", 0, "");
               }
            }
            break;
         case "hween":
         case "snow":
         case "winter":
         case "xmas":
         case "summer":
         case "darkwinter":
         case "darkxmas":
            if (C_Client_mc.ed == 197) {
               var0.a("@dre@<img=25> You can't enter this command in the wilderness!", 0, "");
               return;
            }

            rs.p_f.C_a.b var5 = rs.p_f.C_a.b.b;
            String var6 = "winter";
            if (var1.toLowerCase().equalsIgnoreCase("hween")) {
               var5 = rs.p_f.C_a.b.d;
               var6 = "h'ween";
            }

            if (var1.toLowerCase().equalsIgnoreCase("summer")) {
               var5 = rs.p_f.C_a.b.e;
               var6 = "summer";
            }

            if (var1.toLowerCase().equalsIgnoreCase("darkwinter") || var1.toLowerCase().equalsIgnoreCase("darkxmas")) {
               var5 = rs.p_f.C_a.b.c;
               var6 = "dark winter";
            }

            if (rs.p_f.C_a.r != var5) {
               rs.p_f.C_a.r = var5;
            } else {
               rs.p_f.C_a.r = rs.p_f.C_a.b.a;
            }

            if (rs.p_f.C_a.r == rs.p_f.C_a.o) {
               rs.p_f.C_a.p = null;
            } else {
               rs.p_f.C_a.p = rs.p_f.C_a.r;
            }

            rs.p_f.C_a.d();
            C_f var7 = var0.a(2, "config", "config", var0.eE[2], 30);
            var0.a(
               "<img=6> You've "
                  + (rs.p_f.C_a.r == rs.p_f.C_a.b.e ? "enabled" : "disabled")
                  + " "
                  + var6
                  + " mode! Re-enter the command @blu@::summer@bla@ again to toggle.",
               0,
               null
            );
            rs.p_d.C_h.a(var7);
            if (var0.fr != null && !var0.bI) {
               C_Client_mc.ee = 1;
            } else {
               var0.bI = false;
            }
            break;
         case "renderself":
            rs.p_f.C_a.N = !rs.p_f.C_a.N;
            if (rs.p_f.C_a.N) {
               var0.a("@dgr@<img=6> Display of your character has been enabled.", 0, "");
            } else {
               var0.a("@dre@<img=40> Your character is now hidden (only on your screen, not others!)", 0, "");
            }
            break;
         case "multi":
            rs.p_f.C_a.aX = !rs.p_f.C_a.aX;
            if (rs.p_f.C_a.aX) {
               var0.a("@dgr@<img=24> Wildy minimap multi lines in the minimap will now show", 0, "");
            } else {
               var0.a("@dre@<img=25> Wild minimap multi lines in the minimap will now be hidden", 0, "");
            }

            var0.a("@blu@<img=6> NOTE: Changes will not take effect until your map reloads!", 0, "");
            rs.p_f.C_a.d();
      }
   }

   public static void a(C_Client_mc var0, String var1, int var2) {
      if (!var1.isEmpty()) {
         var1 = var1.replace("::", "");
         if (!var1.contains(" ")) {
            b(var0, var1, new String[0]);
            if (C_j.b(var2)) {
               a(var0, var1, new String[0]);
            }
         } else {
            String[] var3 = var1.split(" ");
            String[] var4 = new String[0];
            if (var3.length > 1) {
               var4 = new String[var3.length - 1];

               for (int var5 = 1; var5 < var3.length; var5++) {
                  var4[var5 - 1] = var3[var5];
               }
            }

            b(var0, var3[0], var4);
            if (C_j.b(var2)) {
               a(var0, var3[0], var4);
            }
         }
      }
   }

   public static void a(String var0) {
      a.add(var0);
   }

   public static void a() {
      if (!a.isEmpty()) {
         for (String var1 : a) {
            C_Launcher_mc.n().o();
            C_Client_mc.fv.a(103);
            C_Launcher_mc.n().o();
            C_Client_mc.fv.b(var1.length() - 1);
            C_Launcher_mc.n().o();
            C_Client_mc.fv.a(var1.substring(2));
         }

         a.clear();
      }
   }
}
