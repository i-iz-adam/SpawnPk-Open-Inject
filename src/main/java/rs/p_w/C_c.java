package rs.p_w;

import java.io.File;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.FloatControl.Type;

public class C_c {
   String a;
   String b;
   Sequence c;
   Sequencer d;
   Synthesizer e;
   double f = 0.0;

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public void a(String var1) {
      this.a = var1;
   }

   public void b(String var1) {
      this.b = var1;
   }

   public boolean a(double var1) {
      return this.a(var1, true);
   }

   public boolean a(double var1, boolean var3) {
      if (var3) {
         this.f = var1;
      }

      byte var4 = 7;
      int var5 = (int)(var1 * 127.0);
      if (this.e != null) {
         if (this.e instanceof Mixer) {
            Mixer var6 = (Mixer)this.e;
            if (var6.isControlSupported(Type.MASTER_GAIN)) {
               FloatControl var7 = (FloatControl)var6.getControl(Type.MASTER_GAIN);
               float var8 = var7.getMaximum() - var7.getMinimum();
               var7.setValue((float)((double)var7.getMinimum() + (double)var8 * var1));
            }
         } else {
            MidiChannel[] var9 = this.e.getChannels();

            for (int var11 = 0; var9 != null && var11 < var9.length; var11++) {
               var9[var11].controlChange(7, var5);
            }
         }
      } else if (this.d != null && this.d instanceof Synthesizer) {
         this.e = (Synthesizer)this.d;
         MidiChannel[] var10 = this.e.getChannels();

         for (int var12 = 0; var10 != null && var12 < var10.length; var12++) {
            var10[var12].controlChange(7, var5);
         }
      }

      return true;
   }

   private boolean a(Receiver var1, double var2) {
      try {
         ShortMessage var4 = new ShortMessage();

         for (int var5 = 0; var5 < 16; var5++) {
            var4.setMessage(176, var5, 7, (int)(var2 * 127.0));
            var1.send(var4, -1L);
         }

         return true;
      } catch (Exception var6) {
         var6.printStackTrace();
         return false;
      }
   }

   public void c() {
   }

   public void d() {
      String var1 = this.a() + this.b();

      try {
         if (this.d != null) {
            this.d.stop();
            this.d.close();
         }

         this.d = null;
         this.c = null;
         File var2 = new File(var1);
         if (var2.exists()) {
            this.c = MidiSystem.getSequence(var2);
         }

         this.d = MidiSystem.getSequencer(false);
         this.d.setSequence(this.c);
         this.e = MidiSystem.getSynthesizer();
         this.e.open();
         if (this.e.getDefaultSoundbank() == null) {
            this.d.getTransmitter().setReceiver(MidiSystem.getReceiver());
         } else {
            this.d.getTransmitter().setReceiver(this.e.getReceiver());
         }

         this.d.open();
         this.d.addMetaEventListener(var1x -> {
            if (var1x.getType() == 3) {
               this.a(this.f, false);
            }
         });
         this.a(this.f, false);
         this.d.start();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
