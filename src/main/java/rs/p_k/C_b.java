package rs.p_k;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_b {
   public static boolean a = false;
   public static rs.p_k.p_a.C_a b = rs.p_k.p_a.C_a.a;
   public static int c = 0;
   public static rs.p_k.p_a.C_c d = rs.p_k.p_a.C_c.c;
   public static rs.p_k.p_a.C_b e = rs.p_k.p_a.C_b.a;
   public static boolean f = true;
   public static int g = 0;
   public static int h = 0;
   public static boolean i = false;
   public static boolean j = false;
   public static int k = 2;
   public static boolean l = false;
   private static final String m = rs.p_v.C_a.b() + "gpu.properties";
   private static boolean n = false;

   public static void a() {
      if (C_e.a()) {
         c();
      } else {
         b();
      }
   }

   public static void b() {
      C_Client_mc var0 = C_Launcher_mc.n().o();
      if (!C_e.a()) {
         var0.gZ.a();
         var0.a(1, "Initializing GPU - please wait.", null);
         var0.gZ.a(0, var0.hG, 0);
         var0.at = "::gpuflagon";
         if (C_e.a()) {
            var0.a.b(false);
         }

         if (var0.a == null) {
            try {
               var0.a = new C_e();
               var0.b = new C_p();
            } catch (Exception var2) {
               throw new RuntimeException(var2);
            }
         } else {
            var0.a.c();
         }

         if (C_Client_mc.ai() && C_e.a()) {
            C_e.a(true);
         }
      }
   }

   public static void c() {
      C_Client_mc var0 = C_Launcher_mc.n().o();
      if (C_e.a()) {
         C_Client_mc.ao = "::gpuflagoff";
         var0.gZ.a();
         var0.a(1, "Disabling GPU - please wait.", null);
         var0.gZ.a(0, var0.hG, 0);
         if (C_e.a()) {
            var0.a.b(false);
         }

         var0.a.d();
         rs.p_f.C_a.Q = false;
      }
   }

   public static void d() {
      rs.p_h.C_c.a("SaveGpuSettings", C_b::h);
   }

   private static void h() {
      try {
         File var0 = new File(m);
         if (!var0.exists()) {
            var0.createNewFile();
         }

         BufferedWriter var1 = new BufferedWriter(new FileWriter(var0));

         try {
            var1.write("stretch_width=" + g);
            var1.newLine();
            var1.write("stretch_height=" + h);
            var1.newLine();
         } finally {
            var1.close();
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public static void e() {
      if (!n) {
         File var0 = new File(m);
         if (var0.exists()) {
            n = true;

            try {
               Properties var1 = new Properties();
               FileInputStream var2 = new FileInputStream(var0);
               var1.load(var2);
               var2.close();
               g = Integer.parseInt(var1.getProperty("stretch_width"));
               h = Integer.parseInt(var1.getProperty("stretch_height"));
            } catch (Exception var4) {
               var4.printStackTrace();

               try {
                  var0.delete();
               } catch (Exception var3) {
                  var3.printStackTrace();
               }
            }
         }
      }
   }

   public static void f() {
      int var0 = g;
      int var1 = h;
      rs.p_s.p_e.C_d var2 = C_Launcher_mc.n().q().a(rs.p_s.p_e.C_d.class);
      C_Launcher_mc.n().p().a(var0, var1);
   }

   public static boolean g() {
      return n;
   }

   static {
      e();
   }
}
