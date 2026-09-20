package rs.p_gui.p_b.p_b;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import rs.p_gui.p_b.C_f;
import rs.p_gui.p_b.C_h;

public class C_d {
   private C_h h;
   public static final String a = rs.p_v.C_a.b() + "loadouts";
   public static final String b = rs.p_v.C_a.b() + "loadout_temp";
   public static final String c = rs.p_v.C_a.b() + "loadout_temp_2";
   public static final String d = rs.p_v.C_a.b() + "loadout_temp_3";
   public static final String e = rs.p_v.C_a.b() + "loadout.conf";
   public static final String f = "order.settings";
   public static final String g = a + File.separator + "order.settings";

   public C_d(C_h var1) {
      this.h = var1;
   }

   private String b(String var1, boolean var2) {
      return var2 ? e : a + File.separator + var1;
   }

   private String a(String var1, int var2, boolean var3) {
      if (var3) {
         if (var2 == 1) {
            return b;
         } else if (var2 == 2) {
            return c;
         } else {
            return var2 == 3 ? d : b;
         }
      } else {
         return a + File.separator + var1 + "_temp_2";
      }
   }

   public void a(String var1) {
      File var2 = new File(this.b(var1, false));
      if (var2.exists()) {
         var2.delete();
      }

      for (int var3 = 1; var3 <= 3; var3++) {
         var2 = new File(this.a(var1, var3, false));
         if (var2.exists()) {
            var2.delete();
         }
      }
   }

   public List<String> a() {
      ArrayList var1 = new ArrayList();
      File var2 = new File(a);
      if (!var2.exists()) {
         var2.mkdir();
      }

      File var3 = new File(g);
      if (var3.exists()) {
         try {
            BufferedReader var4 = new BufferedReader(new FileReader(g));

            try {
               for (String var5 = var4.readLine(); var5 != null; var5 = var4.readLine()) {
                  if (new File(this.b(var5, false)).exists()) {
                     var1.add(var5);
                  } else {
                     System.out.println("[WARNING!] [Loadouts] Attempted to load an invalid folder \"" + var5 + "\" from order.settings!");
                  }
               }
            } finally {
               var4.close();
            }
         } catch (IOException var13) {
            var13.printStackTrace();
         }

         new ArrayList();
         File[] var15 = new File(a).listFiles();

         for (File var9 : var15) {
            if (!var9.getName().contains("_")
               && !var9.getName().contains(".")
               && !var9.getName().equalsIgnoreCase("order.settings")
               && !var1.contains(var9.getName())) {
               System.out.println("[WARNING!] [Loadouts] Folder \"" + var9.getName() + "\" missing from the order config! Adding to list..");
               var1.add(var9.getName());
            }
         }
      } else {
         File[] var14 = var2.listFiles();

         for (File var19 : var14) {
            if (!var19.getName().contains("_") && !var19.getName().contains(".settings")) {
               var1.add(var19.getName());
            }
         }
      }

      return var1;
   }

   public void b() {
      File var1 = new File(g);
      if (!var1.exists()) {
         try {
            var1.createNewFile();
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

      try {
         BufferedWriter var2 = new BufferedWriter(new FileWriter(var1));
         rs.p_gui.p_b.C_d var3 = this.h.f();

         for (String var5 : var3.keySet()) {
            var2.write(var5);
            var2.newLine();
         }

         var2.close();
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   public void a(String var1, List<rs.p_gui.p_b.C_a> var2) {
      File var3 = new File(rs.p_v.C_a.b());
      File var4 = new File(this.b(var1, false));
      if (!var3.exists()) {
         var3.mkdir();
      }

      try {
         DataOutputStream var5 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(var4)));

         for (rs.p_gui.p_b.C_a var7 : var2) {
            C_c.a(var5, var7);
         }

         var5.close();
         String var13 = var1 + "_ver_5";
         File var14 = new File(a + File.separator + var13);
         if (!var14.exists()) {
            var14.createNewFile();
         }

         for (File var11 : new File(a).listFiles()) {
            if ((var11.getName().startsWith(var1 + "_temp") || var11.getName().startsWith(var1 + "_ver_")) && !var11.getName().equalsIgnoreCase(var13)) {
               var11.delete();
            }
         }
      } catch (IOException var12) {
         var12.printStackTrace();
      }
   }

   public rs.p_gui.p_b.C_c a(String var1, boolean var2) {
      rs.p_gui.p_b.C_c var3 = new rs.p_gui.p_b.C_c(var1);
      File var4 = new File(this.b(var1, var2));
      File var5 = new File(this.a(var1, 1, var2));
      File var6 = new File(this.a(var1, 2, var2));
      File var7 = new File(this.a(var1, 3, var2));
      if (!var5.exists() && var2) {
         var4.delete();
      }

      try {
         if (var4.exists()) {
            DataInputStream var8 = new DataInputStream(new BufferedInputStream(new FileInputStream(var4)));
            if (!var2) {
               C_c.a(var8, var3);
            } else {
               String var9 = "Default";

               do {
                  int var10 = var8.readInt();
                  byte[] var11 = new byte[var10];
                  var8.read(var11);
                  var9 = new String(var11);
                  rs.p_gui.p_b.C_a var12 = new rs.p_gui.p_b.C_a(var9);
                  if (var6.exists()) {
                     int var13 = var8.readInt();
                     var12.a(rs.p_gui.p_b.C_a.a.a(var13));
                     int var14 = var8.readInt();
                     var12.b(var14);

                     for (int var15 = 0; var15 < var12.c().length; var15++) {
                        int var16 = var8.readInt();
                        var12.c()[var15] = var16;
                     }
                  }

                  for (rs.p_gui.p_b.p_c.C_c var29 : rs.p_gui.p_b.p_c.C_c.values()) {
                     if (!var5.exists()) {
                        var12.a(var29, var8.readInt());
                     } else {
                        int var17 = var8.readInt();
                        int var18 = var8.readInt();
                        var12.a(var29, new C_f(var17, var18));
                     }
                  }

                  for (int var23 = 0; var23 < var12.d().length; var23++) {
                     if (!var5.exists()) {
                        var12.a(var23, new C_f(var8.readInt(), 1));
                     } else {
                        int var26 = var8.readInt();
                        int var28 = var8.readInt();
                        var12.a(var23, new C_f(var26, var28));
                     }
                  }

                  if (var7.exists()) {
                     int var24 = var8.readInt();
                     var12.a(var24);
                  }

                  var3.add(var12);
               } while (var9 != null);
            }

            var8.close();
         }
      } catch (EOFException var19) {
      } catch (IOException var20) {
         var20.printStackTrace();
      }

      return var3;
   }
}
