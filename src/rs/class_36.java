package rs;

import gnu.trove.f.b.cc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

/* JADX INFO: loaded from: client-final.jar:rs/class_36.class */
public class class_36 implements Runnable {
    public static cc a = new cc();
    public static int b;
    private byte[] c;
    private InputStream d;
    private Thread e;
    private int f;
    private int g;

    public class_36(InputStream inputStream, int i, int i2) {
        if (b != 4 && i > 4) {
            this.d = inputStream;
            this.g = i;
            this.f = i2;
            this.e = new Thread(this);
            this.e.start();
        }
    }

    private static void a(Clip clip, int i) {
        try {
            FloatControl control = clip.getControl(FloatControl.Type.MASTER_GAIN);
            float fA = (i / 10.0f) * (((4.0f - a()) + 1.0f) / 4.0f);
            if (i < 10) {
                fA *= Math.max(0.25f, (i / 10.0f) - 0.35f);
            }
            if (fA < 0.01f) {
                fA = 0.01f;
            } else if (fA > 1.0f) {
                fA = 1.0f;
            }
            float fLog10 = (float) (20.0d * Math.log10(fA));
            if (fLog10 < control.getMinimum()) {
                fLog10 = control.getMinimum();
            } else if (fLog10 > control.getMaximum()) {
                fLog10 = control.getMaximum();
            }
            control.setValue(fLog10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Clip clip = null;
        AudioInputStream audioInputStream = null;
        try {
            try {
                AudioInputStream audioInputStream2 = this.c != null ? AudioSystem.getAudioInputStream(new ByteArrayInputStream(this.c)) : AudioSystem.getAudioInputStream(this.d);
                audioInputStream = AudioSystem.getAudioInputStream(new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, audioInputStream2.getFormat().getSampleRate(), 16, audioInputStream2.getFormat().getChannels(), audioInputStream2.getFormat().getChannels() * 2, audioInputStream2.getFormat().getSampleRate(), false), audioInputStream2);
                clip = (Clip) AudioSystem.getLine(new DataLine.Info(Clip.class, audioInputStream.getFormat()));
                clip.open(audioInputStream);
                a(clip, this.g);
                if (this.f > 0) {
                    Thread.sleep(this.f);
                }
                clip.start();
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (!clip.isActive()) {
                    Thread.sleep(20L);
                    if (System.currentTimeMillis() - jCurrentTimeMillis >= 10000) {
                        break;
                    }
                }
                float fA = a();
                while (clip.isActive()) {
                    if (a() != fA) {
                        a(clip, this.g);
                        fA = a();
                    }
                    Thread.sleep(50L);
                }
                if (clip != null) {
                    while (clip.isRunning()) {
                        try {
                            Thread.sleep(10L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    clip.flush();
                    clip.close();
                }
                if (audioInputStream != null) {
                    try {
                        audioInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                if (clip != null) {
                    while (clip.isRunning()) {
                        try {
                            Thread.sleep(10L);
                        } catch (InterruptedException e3) {
                            e3.printStackTrace();
                        }
                    }
                    clip.flush();
                    clip.close();
                }
                if (audioInputStream != null) {
                    try {
                        audioInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            if (clip != null) {
                while (clip.isRunning()) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e6) {
                        e6.printStackTrace();
                    }
                }
                clip.flush();
                clip.close();
            }
            if (audioInputStream != null) {
                try {
                    audioInputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    public static int a() {
        return b;
    }

    public static void a(int i) {
        if (i == 4) {
            class_341.a("::soundoff");
        } else {
            class_341.a("::soundon");
        }
        b = i;
    }

    public void a(byte[] bArr) {
        this.c = bArr;
    }
}
