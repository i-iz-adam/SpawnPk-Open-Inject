package rs.p_v;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.FloatControl.Type;
import rs.p_k.C_j;
import rs.p_secure.C_b;
import rs.p_w.C_c;

public final class C_a implements Runnable {
   public static C_c a = new C_c();
   private final int p = 524288;
   private C_a.a q;
   public static final int b = 317;
   public static int c;
   public static int d = 32;
   public static RandomAccessFile e = null;
   public static final RandomAccessFile[] f = new RandomAccessFile[5];
   public static boolean g;
   public static final Applet h = null;
   private static boolean r;
   private static int s;
   private static InetAddress t;
   private static int u;
   private static Socket v = null;
   private static int w = 1;
   private static Runnable x = null;
   private static String y = null;
   public static String i = null;
   private static String z = null;
   private static DataInputStream A = null;
   private static int B;
   private static String C = null;
   private static byte[] D = null;
   private static boolean E;
   private static int F;
   public static String j = null;
   public static int k;
   public static int l;
   private static boolean G;
   private static int H;
   public static int m;
   public static boolean n = true;
   public static String o = "";

   public static void a(InetAddress var0) {
      s = (int)(Math.random() * 9.9999999E7);
      if (r) {
         try {
            Thread.sleep(500L);
         } catch (Exception var4) {
         }

         r = false;
      }

      u = 0;
      x = null;
      y = null;
      C = null;
      z = null;
      t = var0;
      Thread var1 = new Thread(new C_a());
      var1.setDaemon(true);
      var1.start();

      while (!r) {
         try {
            Thread.sleep(50L);
         } catch (Exception var3) {
         }
      }
   }

   public static void a() {
      try {
         e = new RandomAccessFile(f() + "main_file_cache.dat", "rw");

         for (int var0 = 0; var0 < 5; var0++) {
            f[var0] = new RandomAccessFile(f() + "main_file_cache.idx" + var0, "rw");
         }
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   @Override
   public void run() {
      r = true;
      String var1 = f();
      c = f(var1);
      a();
      int var2 = s;

      while (s == var2) {
         if (u != 0) {
            try {
               v = new Socket(t, u);
            } catch (Exception var24) {
               v = null;
            }

            u = 0;
         } else if (x != null) {
            Thread var37 = new Thread(x);
            var37.setDaemon(true);
            var37.start();
            var37.setPriority(w);
            x = null;
         } else if (y != null) {
            try {
               i = InetAddress.getByName(y).getHostName();
            } catch (Exception var33) {
               i = "unknown";
            }

            y = null;
         } else if (C != null) {
            if (D != null) {
               try {
                  FileOutputStream var3 = new FileOutputStream(var1 + C);
                  var3.write(D, 0, B);
                  var3.close();
               } catch (Exception var32) {
               }
            }

            label172:
            if (G) {
               String var36 = var1 + C;
               G = false;
               AudioInputStream var4 = null;

               try {
                  var4 = AudioSystem.getAudioInputStream(new File(var36));
               } catch (UnsupportedAudioFileException var30) {
                  var30.printStackTrace();
                  return;
               } catch (IOException var31) {
                  var31.printStackTrace();
                  return;
               }

               AudioFormat var5 = var4.getFormat();
               SourceDataLine var6 = null;
               Info var7 = new Info(SourceDataLine.class, var5);

               try {
                  var6 = (SourceDataLine)AudioSystem.getLine(var7);
                  var6.open(var5);
               } catch (LineUnavailableException var28) {
                  var28.printStackTrace();
                  return;
               } catch (Exception var29) {
                  var29.printStackTrace();
                  return;
               }

               if (var6.isControlSupported(Type.PAN)) {
                  FloatControl var8 = (FloatControl)var6.getControl(Type.PAN);
                  if (this.q == C_a.a.b) {
                     var8.setValue(1.0F);
                  } else if (this.q == C_a.a.a) {
                     var8.setValue(-1.0F);
                  }
               }

               var6.start();
               int var40 = 0;
               byte[] var9 = new byte[524288];

               try {
                  while (true) {
                     if (var40 == -1) {
                        break label172;
                     }

                     var40 = var4.read(var9, 0, var9.length);
                     if (var40 >= 0) {
                        var6.write(var9, 0, var40);
                     }
                  }
               } catch (IOException var34) {
                  var34.printStackTrace();
               } finally {
                  var6.drain();
                  var6.close();
               }

               return;
            }

            if (E) {
               try {
                  a.a(var1);
                  a.b(C);
                  a.d();
               } catch (Exception var27) {
                  var27.printStackTrace();
               }

               E = false;
            }

            C = null;
         } else if (z != null) {
            try {
               System.out.println("urlstream");
               A = new DataInputStream(new URL(h.getCodeBase(), z).openStream());
            } catch (Exception var26) {
               A = null;
            }

            z = null;
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var25) {
         }
      }
   }

   public static String b() {
      Object var0 = null;
      String var1 = System.getProperty("user.home");
      String var2 = System.getProperty("file.separator");
      String var3 = "." + rs.p_f.C_a.A.toLowerCase() + (rs.p_f.C_a.h ? "-test" : "") + "-data";
      StringBuilder var4 = new StringBuilder(var1 + var2 + var3 + var2);
      String var5 = var4.toString();
      var0 = new File(var5);
      if (!var0.exists() && !var0.mkdir()) {
         System.out.println("Couldn't find data directory!");
         return null;
      } else {
         return var5;
      }
   }

   public static String c() {
      try {
         Enumeration var0 = NetworkInterface.getNetworkInterfaces();

         while (var0.hasMoreElements()) {
            NetworkInterface var1 = (NetworkInterface)var0.nextElement();
            byte[] var2 = var1.getHardwareAddress();
            if (var2 != null) {
               StringBuilder var3 = new StringBuilder();

               for (int var4 = 0; var4 < var2.length; var4++) {
                  var3.append(String.format("%02X%s", var2[var4], var4 < var2.length - 1 ? "-" : ""));
               }

               return var3.toString();
            }
         }
      } catch (SocketException var5) {
         var5.printStackTrace();
      }

      return null;
   }

   public static boolean d() {
      return C_j.a() == C_j.a;
   }

   public static String e() {
      String var0 = rs.p_secure.C_c.a();
      if (var0 == null) {
         var0 = C_b.a();
      }

      if (var0 == null) {
         var0 = rs.p_secure.C_a.a();
      }

      if (a(var0)) {
         var0 = c();
      }

      return var0;
   }

   public static boolean a(String var0) {
      return var0 == null || var0.isEmpty() || var0.equalsIgnoreCase("WINDOWS InstallDate  ") || var0.contains("CScript Error");
   }

   public static boolean b(String var0) {
      return !a(var0);
   }

   public static String f() {
      Object var0 = null;
      String var1 = System.getProperty("user.home");
      String var2 = System.getProperty("file.separator");
      String var3 = "." + rs.p_f.C_a.A.toLowerCase() + (rs.p_f.C_a.h ? "-test" : "");
      StringBuilder var4 = new StringBuilder(var1 + var2 + var3 + var2);
      String var5 = var4.toString();
      if (rs.p_f.C_a.k) {
         var5 = "." + File.separator + "cache" + File.separator;
      }

      var0 = new File(var5);
      if (!var0.exists() && !var0.mkdir()) {
         System.out.println("Couldn't find cache directory!");
         return null;
      } else {
         return var5;
      }
   }

   public static String g() {
      String[] var0 = new String[]{
         "c:/windows/",
         "c:/winnt/",
         "d:/windows/",
         "d:/winnt/",
         "e:/windows/",
         "e:/winnt/",
         "f:/windows/",
         "f:/winnt/",
         "c:/",
         "~/",
         "/tmp/",
         "",
         "c:/rscache",
         "/rscache"
      };
      if (d < 32 || d > 34) {
         d = 32;
      }

      String var1 = ".file_store_" + d;

      for (int var2 = 0; var2 < var0.length; var2++) {
         try {
            String var3 = var0[var2];
            if (var3.length() > 0) {
               File var4 = new File(var3);
               if (!var4.exists()) {
                  continue;
               }
            }

            File var6 = new File(var3 + var1);
            if (var6.exists() || var6.mkdir()) {
               return var3 + var1 + "/";
            }
         } catch (Exception var5) {
         }
      }

      return null;
   }

   private static int f(String var0) {
      try {
         File var1 = new File(var0 + "uid.dat");
         if (!var1.exists() || var1.length() < 4L) {
            DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var0 + "uid.dat"));
            var2.writeInt((int)(Math.random() * 9.9999999E7));
            var2.close();
         }
      } catch (Exception var4) {
      }

      try {
         DataInputStream var5 = new DataInputStream(new FileInputStream(var0 + "uid.dat"));
         int var6 = var5.readInt();
         var5.close();
         return var6 + 1;
      } catch (Exception var3) {
         return 0;
      }
   }

   public static synchronized Socket a(int var0) {
      u = var0;

      while (u != 0) {
         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
         }
      }

      if (v == null) {
         throw new IOException("could not open socket");
      } else {
         return v;
      }
   }

   public static synchronized DataInputStream c(String var0) {
      z = var0;

      while (z != null) {
         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
         }
      }

      if (A == null) {
         throw new IOException("could not open: " + var0);
      } else {
         return A;
      }
   }

   public static synchronized void d(String var0) {
      i = var0;
      y = var0;
   }

   public static synchronized void a(Runnable var0, int var1) {
      w = var1;
      x = var0;
   }

   public static synchronized boolean a(byte[] var0, int var1) {
      if (var1 > 2000000) {
         return false;
      } else if (C != null) {
         return false;
      } else {
         H = (H + 1) % 5;
         B = var1;
         D = var0;
         G = true;
         C = "sound" + H + ".wav";
         return true;
      }
   }

   public static synchronized boolean h() {
      if (C != null) {
         return false;
      } else {
         D = null;
         G = true;
         C = "sound" + H + ".wav";
         return true;
      }
   }

   public static synchronized void b(byte[] var0, int var1) {
      if (var1 <= 2000000) {
         if (C == null) {
            F = (F + 1) % 5;
            B = var1;
            D = var0;
            E = true;
            C = "jingle" + F + ".mid";
         }
      }
   }

   public static boolean i() {
      String var0 = System.getProperty("os.arch");
      String var1 = System.getProperty("sun.arch.data.model");
      return var0 != null && var0.contains("64") && var1 != null && var1.equals("32");
   }

   public static void a(double var0) {
      a.a(var0);
   }

   public static void e(String var0) {
      System.out.println("Error: " + var0);
   }

   private C_a() {
   }

   static enum a {
      a,
      b,
      c;
   }
}
