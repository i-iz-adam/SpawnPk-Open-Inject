package rs;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.FloatControl.Type;
import p_gnu.p_trove.p_f.p_b.C_cc;

public class C_L_uc implements Runnable {
   public static C_cc a = new C_cc();
   public static int b;
   private byte[] c;
   private InputStream d;
   private Thread e;
   private int f;
   private int g;

   public C_L_uc(InputStream var1, int var2, int var3) {
      if (b != 4) {
         if (var2 > 4) {
            this.d = var1;
            this.g = var2;
            this.f = var3;
            this.e = new Thread(this);
            this.e.start();
         }
      }
   }

   private static void a(Clip var0, int var1) {
      try {
         FloatControl var2 = (FloatControl)var0.getControl(Type.MASTER_GAIN);
         float var3 = (float)var1 / 10.0F;
         float var4 = (4.0F - (float)a() + 1.0F) / 4.0F;
         float var5 = var3 * var4;
         if (var1 < 10) {
            var5 *= Math.max(0.25F, (float)var1 / 10.0F - 0.35F);
         }

         if (var5 < 0.01F) {
            var5 = 0.01F;
         } else if (var5 > 1.0F) {
            var5 = 1.0F;
         }

         float var6 = (float)(20.0 * Math.log10((double)var5));
         if (var6 < var2.getMinimum()) {
            var6 = var2.getMinimum();
         } else if (var6 > var2.getMaximum()) {
            var6 = var2.getMaximum();
         }

         var2.setValue(var6);
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   @Override
   public void run() {
      Clip var1 = null;
      AudioInputStream var2 = null;

      try {
         if (this.c != null) {
            var2 = AudioSystem.getAudioInputStream(new ByteArrayInputStream(this.c));
         } else {
            var2 = AudioSystem.getAudioInputStream(this.d);
         }

         AudioFormat var3 = new AudioFormat(
            Encoding.PCM_SIGNED,
            var2.getFormat().getSampleRate(),
            16,
            var2.getFormat().getChannels(),
            var2.getFormat().getChannels() * 2,
            var2.getFormat().getSampleRate(),
            false
         );
         var2 = AudioSystem.getAudioInputStream(var3, var2);
         Info var4 = new Info(Clip.class, var2.getFormat());
         var1 = (Clip)AudioSystem.getLine(var4);
         var1.open(var2);
         a(var1, this.g);
         if (this.f > 0) {
            Thread.sleep((long)this.f);
         }

         var1.start();
         long var5 = System.currentTimeMillis();

         while (!var1.isActive()) {
            Thread.sleep(20L);
            if (System.currentTimeMillis() - var5 >= 10000L) {
               break;
            }
         }

         for (float var7 = (float)a(); var1.isActive(); Thread.sleep(50L)) {
            if ((float)a() != var7) {
               a(var1, this.g);
               var7 = (float)a();
            }
         }
      } catch (Exception var20) {
         var20.printStackTrace();
      } finally {
         if (var1 != null) {
            while (var1.isRunning()) {
               try {
                  Thread.sleep(10L);
               } catch (InterruptedException var19) {
                  var19.printStackTrace();
               }
            }

            var1.flush();
            var1.close();
         }

         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (IOException var18) {
            var18.printStackTrace();
         }
      }
   }

   public static int a() {
      return b;
   }

   public static void a(int var0) {
      if (var0 == 4) {
         rs.p_n.C_a.a("::soundoff");
      } else {
         rs.p_n.C_a.a("::soundon");
      }

      b = var0;
   }

   public void a(byte[] var1) {
      this.c = var1;
   }
}
