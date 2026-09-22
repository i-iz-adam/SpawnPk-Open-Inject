package rs;

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

/* JADX INFO: loaded from: client-final.jar:rs/class_655.class */
public class class_655 {
    String a;
    String b;
    Sequence c;
    Sequencer d;
    Synthesizer e;
    double f = 0.0d;

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public void a(String str) {
        this.a = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public boolean a(double d) {
        return a(d, true);
    }

    public boolean a(double d, boolean z) {
        if (z) {
            this.f = d;
        }
        int i = (int) (d * 127.0d);
        if (this.e != null) {
            if (this.e instanceof Mixer) {
                Mixer mixer = this.e;
                if (!mixer.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                    return true;
                }
                FloatControl control = mixer.getControl(FloatControl.Type.MASTER_GAIN);
                control.setValue((float) (((double) control.getMinimum()) + (((double) (control.getMaximum() - control.getMinimum())) * d)));
                return true;
            }
            MidiChannel[] channels = this.e.getChannels();
            for (int i2 = 0; channels != null && i2 < channels.length; i2++) {
                channels[i2].controlChange(7, i);
            }
            return true;
        }
        if (this.d != null && (this.d instanceof Synthesizer)) {
            this.e = this.d;
            MidiChannel[] channels2 = this.e.getChannels();
            for (int i3 = 0; channels2 != null && i3 < channels2.length; i3++) {
                channels2[i3].controlChange(7, i);
            }
            return true;
        }
        try {
            Receiver receiver = MidiSystem.getReceiver();
            ShortMessage shortMessage = new ShortMessage();
            for (int i4 = 0; i4 < 16; i4++) {
                shortMessage.setMessage(176, i4, 7, i);
                receiver.send(shortMessage, -1L);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean a(Receiver receiver, double d) {
        try {
            ShortMessage shortMessage = new ShortMessage();
            for (int i = 0; i < 16; i++) {
                shortMessage.setMessage(176, i, 7, (int) (d * 127.0d));
                receiver.send(shortMessage, -1L);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void c() {
    }

    public void d() {
        String str = a() + b();
        try {
            if (this.d != null) {
                this.d.stop();
                this.d.close();
            }
            this.d = null;
            this.c = null;
            File file = new File(str);
            if (file.exists()) {
                this.c = MidiSystem.getSequence(file);
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
            this.d.addMetaEventListener(metaMessage -> {
                if (metaMessage.getType() == 3) {
                    a(this.f, false);
                }
            });
            this.d.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
