package rs.p_s.p_n;

import com.google.a.e.f;
import com.google.a.e.h;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.TrayIcon.MessageType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.Clip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_e.C_i;
import rs.p_e.C_n;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_k.C_j;
import rs.p_runelite.p_events.C_NotificationFired_mc;
import rs.p_ui.C_f;

@Singleton
public class C_c {
   private static final Logger a = LoggerFactory.getLogger(C_c.class);
   private static final String b = "\"";
   private static final f c = com.google.a.e.h.b().a('"', "'").a();
   private static final int d = 2000;
   private static final int e = 100;
   private static final long f = -2L;
   private static final long g = -1L;
   private final C_Client_mc h;
   private C_a i;
   private final C_f j;
   private final C_i k;
   private final ScheduledExecutorService l;
   private final C_EventBus_mc m;
   private final String n;
   private final Path o;
   private boolean p;
   private Instant q;
   private long r;
   private long s = -2L;
   private Clip t = null;

   @Inject
   private C_c(C_f var1, C_Client_mc var2, C_i var3, ScheduledExecutorService var4, C_EventBus_mc var5) {
      this.h = var2;
      this.j = var1;
      this.k = var3;
      this.l = var4;
      this.m = var5;
      this.n = rs.p_f.C_a.A;
      this.o = new File(rs.p_v.C_a.b() + "icon.png").toPath();
      this.i = var3.a(C_a.class);
      this.a();
   }

   private void a() {
      if (C_j.a() == C_j.c && !Files.exists(this.o)) {
         try {
            InputStream var1 = C_Launcher_mc.class.getResourceAsStream("/icon.png");

            try {
               Files.copy(var1, this.o);
            } catch (Throwable var5) {
               if (var1 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var4) {
                     var5.addSuppressed(var4);
                  }
               }

               throw var5;
            }

            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var6) {
            a.warn(null, var6);
         }
      }
   }

   public void a(String var1) {
      this.a(var1, MessageType.NONE);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void a(String var1, MessageType var2) {
      this.m.post(new C_NotificationFired_mc(var1, var2));
      if (this.i.j() || !this.j.d()) {
         switch (this.i.f()) {
            case b:
               this.j.e();
               break;
            case c:
               this.j.f();
         }

         if (this.i.e()) {
            this.a(this.c(), var1, var2);
         }

         switch (this.i.g()) {
            case a:
               Toolkit.getDefaultToolkit().beep();
            default:
               if (this.i.i() != C_n.a) {
                  this.q = Instant.now();
                  this.r = this.h.hL;
               }

               a.debug(var1);
         }
      }
   }

   public void a(Graphics2D var1) {
      C_n var2 = this.i.i();
      if (this.q != null && this.h.fc && var2 != C_n.a) {
         if (Instant.now().minusMillis(2000L).isAfter(this.q)) {
            switch (var2) {
               case b:
               case c:
                  this.q = null;
                  return;
               case e:
               case d:
                  if (this.h.hL < 100L || this.h.hL < 100L) {
                     this.q = null;
                     return;
                  }
            }
         }

         if (C_Client_mc.ff % 40 < 20 || var2 != C_n.b && var2 != C_n.d) {
            Color var3 = var1.getColor();
            var1.setColor(this.i.k());
            var1.fill(new Rectangle(this.j.n().getWidth(), this.j.n().getHeight()));
            var1.setColor(var3);
         }
      } else {
         this.q = null;
      }
   }

   private void a(String var1, String var2, MessageType var3) {
      String var4 = c.a(var1);
      String var5 = c.a(var2);
      switch (C_j.a()) {
         case c:
            this.c(var4, var5, var3);
            break;
         case b:
            this.a(var4, var5);
            break;
         default:
            this.b(var1, var2, var3);
      }
   }

   private void b(String var1, String var2, MessageType var3) {
      if (this.j.l() != null) {
         this.j.l().displayMessage(var1, var2, var3);
      }
   }

   private void c(String var1, String var2, MessageType var3) {
      ArrayList var4 = new ArrayList();
      var4.add("notify-send");
      var4.add(var1);
      var4.add(var2);
      var4.add("-a");
      var4.add(c.a(this.n));
      var4.add("-i");
      var4.add(c.a(this.o.toAbsolutePath().toString()));
      var4.add("-u");
      var4.add(a(var3));
      if (this.i.h() > 0) {
         var4.add("-t");
         var4.add(String.valueOf(this.i.h()));
      }

      this.l.submit(() -> {
         try {
            Process var5 = a(var4);
            boolean var6 = var5.waitFor(500L, TimeUnit.MILLISECONDS);
            if (var6 && var5.exitValue() == 0) {
               return;
            }
         } catch (InterruptedException | IOException var7) {
            a.debug("error sending notification", var7);
         }

         this.b(var1, var2, var3);
      });
   }

   private void a(String var1, String var2) {
      ArrayList var3 = new ArrayList();
      if (this.p) {
         Collections.addAll(
            var3,
            "sh",
            "-lc",
            "\"$@\"",
            "--",
            "terminal-notifier",
            "-title",
            var1,
            "-message",
            var2,
            "-group",
            "net.runelite.launcher",
            "-sender",
            "net.runelite.launcher"
         );
      } else {
         var3.add("osascript");
         var3.add("-e");
         String var4 = "display notification \"" + var2 + "\" with title \"" + var1 + "\"";
         var3.add(var4);
      }

      try {
         a(var3);
      } catch (IOException var5) {
         a.warn("error sending notification", var5);
      }
   }

   private static Process a(List<String> var0) {
      return new ProcessBuilder(var0).redirectErrorStream(true).start();
   }

   private boolean b() {
      try {
         Process var1 = Runtime.getRuntime().exec(new String[]{"sh", "-lc", "terminal-notifier -help"});
         return !var1.waitFor(2L, TimeUnit.SECONDS) ? false : var1.exitValue() == 0;
      } catch (InterruptedException | IOException var2) {
         return false;
      }
   }

   private static String a(MessageType var0) {
      switch (var0) {
         case WARNING:
         case ERROR:
            return "critical";
         default:
            return "normal";
      }
   }

   private String c() {
      return this.n;
   }

   public static enum a {
      a("Native"),
      b("Off");

      private final String c;

      @Override
      public String toString() {
         return this.c;
      }

      public String a() {
         return this.c;
      }

      private a(String var3) {
         this.c = var3;
      }
   }
}
