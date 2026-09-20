package rs.p_q.p_b;

import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_d implements Runnable {
   private static final Logger c = LoggerFactory.getLogger(C_d.class);
   private AtomicBoolean d;
   public static C_d a = new C_d();
   private final DateTimeFormatter e = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
   public static rs.p_q.p_a.p_a.C_a b = new C_e();

   public C_d() {
      this.d = new AtomicBoolean(false);
   }

   @Override
   public void run() {
      c.info("Receiver thread started!");
      C_a[] var1 = new C_a[]{null};
      ConcurrentLinkedQueue var2 = new ConcurrentLinkedQueue();
      ActionListener var3 = var3x -> SwingUtilities.invokeLater(new C_f(this, var1, var2));
      Timer var4 = new Timer(100, var3);
      var4.start();
      String var5 = " \\| ";
      String var6 = "Login";
      String var7 = "Login request @";
      String var8 = "Logout";
      String var9 = "Unregistered (logout)";
      String var10 = "Could";
      String var11 = "END";
      int var12 = 0;
      Socket var13 = null;
      DataInputStream var14 = null;

      try {
         var13 = new Socket(rs.p_f.C_a.j, 2456);
         c.info("Connected to the server!");
         var14 = new DataInputStream(var13.getInputStream());
         long var15 = System.currentTimeMillis();

         while (this.d.get() && System.currentTimeMillis() - var15 <= 10000L) {
            String var17 = var14.readUTF();
            if (var17.equals("END")) {
               break;
            }

            if (var17.startsWith("Could")) {
               var2.add(var17);
               break;
            }

            boolean var18 = var17.contains("Login");
            if (var18) {
               var12++;
            }

            String[] var19 = var17.split(" \\| ");
            String var20 = this.a(Long.parseLong(var19[0]));
            if (var18) {
               var2.add("[" + var20 + "] #" + var12 + ": " + var19[1].replace("Login", "Login request @"));
            } else {
               var2.add("[" + var20 + "]  " + var19[1].replace("Logout", "Unregistered (logout)"));
            }
         }
      } catch (UnknownHostException var23) {
         c.info("Don't know about host " + rs.p_f.C_a.j);
      } catch (IOException var24) {
         var24.printStackTrace();
      }

      if (var14 != null) {
         try {
            var14.close();
         } catch (IOException var22) {
            var22.printStackTrace();
         }
      }

      if (var13 != null) {
         try {
            var13.close();
         } catch (IOException var21) {
            var21.printStackTrace();
         }
      }

      var3.actionPerformed(null);
      var4.stop();
      this.d.set(false);
      c.info("Receiver has stopped!");
   }

   public void a() {
      this.d.set(true);
      new Thread(this).start();
   }

   public void b() {
      this.d.set(false);
   }

   private String a(long var1) {
      Instant var3 = Instant.ofEpochMilli(var1);
      ZoneId var4 = ZoneId.systemDefault();
      LocalDateTime var5 = var3.atZone(var4).toLocalDateTime();
      return var5.format(this.e);
   }

   public AtomicBoolean c() {
      return this.d;
   }
}
