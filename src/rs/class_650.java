package rs;

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
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import rs.lpkg.j;
import rs.secure.a;
import rs.secure.b;
import rs.secure.c;

/* JADX INFO: loaded from: client-final.jar:rs/class_650.class */
public final class class_650 implements Runnable {
    private final int p = 524288;
    private class_651 q;
    public static final int b = 317;
    public static int c;
    public static boolean g;
    private static boolean r;
    private static int s;
    private static InetAddress t;
    private static int u;
    private static int B;
    private static boolean E;
    private static int F;
    public static int k;
    public static int l;
    private static boolean G;
    private static int H;
    public static int m;
    public static class_655 a = new class_655();
    public static int d = 32;
    public static RandomAccessFile e = null;
    public static final RandomAccessFile[] f = new RandomAccessFile[5];
    public static final Applet h = null;
    private static Socket v = null;
    private static int w = 1;
    private static Runnable x = null;
    private static String y = null;
    public static String i = null;
    private static String z = null;
    private static DataInputStream A = null;
    private static String C = null;
    private static byte[] D = null;
    public static String j = null;
    public static boolean n = true;
    public static String o = "";

    public static void a(InetAddress inetAddress) {
        s = (int) (Math.random() * 9.9999999E7d);
        if (r) {
            try {
                Thread.sleep(500L);
            } catch (Exception e2) {
            }
            r = false;
        }
        u = 0;
        x = null;
        y = null;
        C = null;
        z = null;
        t = inetAddress;
        Thread thread = new Thread(new class_650());
        thread.setDaemon(true);
        thread.start();
        while (!r) {
            try {
                Thread.sleep(50L);
            } catch (Exception e3) {
            }
        }
    }

    public static void a() {
        try {
            e = new RandomAccessFile(f() + "main_file_cache.dat", "rw");
            for (int i2 = 0; i2 < 5; i2++) {
                f[i2] = new RandomAccessFile(f() + "main_file_cache.idx" + i2, "rw");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        r = true;
        String strF = f();
        c = f(strF);
        a();
        int i2 = s;
        while (s == i2) {
            if (u != 0) {
                try {
                    v = new Socket(t, u);
                } catch (Exception e2) {
                    v = null;
                }
                u = 0;
            } else if (x != null) {
                Thread thread = new Thread(x);
                thread.setDaemon(true);
                thread.start();
                thread.setPriority(w);
                x = null;
            } else if (y != null) {
                try {
                    i = InetAddress.getByName(y).getHostName();
                } catch (Exception e3) {
                    i = "unknown";
                }
                y = null;
            } else if (C != null) {
                if (D != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(strF + C);
                        fileOutputStream.write(D, 0, B);
                        fileOutputStream.close();
                    } catch (Exception e4) {
                    }
                }
                if (G) {
                    String str = strF + C;
                    G = false;
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(str));
                        AudioFormat format = audioInputStream.getFormat();
                        try {
                            SourceDataLine line = AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, format));
                            line.open(format);
                            if (line.isControlSupported(FloatControl.Type.PAN)) {
                                FloatControl control = line.getControl(FloatControl.Type.PAN);
                                if (this.q == class_651.b) {
                                    control.setValue(1.0f);
                                } else if (this.q == class_651.a) {
                                    control.setValue(-1.0f);
                                }
                            }
                            line.start();
                            int i3 = 0;
                            byte[] bArr = new byte[524288];
                            while (i3 != -1) {
                                try {
                                    try {
                                        i3 = audioInputStream.read(bArr, 0, bArr.length);
                                        if (i3 >= 0) {
                                            line.write(bArr, 0, i3);
                                        }
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                        line.drain();
                                        line.close();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    line.drain();
                                    line.close();
                                    throw th;
                                }
                            }
                            line.drain();
                            line.close();
                        } catch (LineUnavailableException e6) {
                            e6.printStackTrace();
                            return;
                        } catch (Exception e7) {
                            e7.printStackTrace();
                            return;
                        }
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        return;
                    } catch (UnsupportedAudioFileException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
                if (E) {
                    try {
                        a.a(strF);
                        a.b(C);
                        a.d();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    E = false;
                }
                C = null;
            } else if (z != null) {
                try {
                    System.out.println("urlstream");
                    A = new DataInputStream(new URL(h.getCodeBase(), z).openStream());
                } catch (Exception e11) {
                    A = null;
                }
                z = null;
            }
            try {
                Thread.sleep(50L);
            } catch (Exception e12) {
            }
        }
    }

    public static String b() {
        String property = System.getProperty("user.home");
        String property2 = System.getProperty("file.separator");
        String string = new StringBuilder(property + property2 + ("." + Configuration.A.toLowerCase() + (Configuration.h.booleanValue() ? "-test" : "") + "-data") + property2).toString();
        File file = new File(string);
        if (file.exists() || file.mkdir()) {
            return string;
        }
        System.out.println("Couldn't find data directory!");
        return null;
    }

    public static String c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                byte[] hardwareAddress = networkInterfaces.nextElement().getHardwareAddress();
                if (hardwareAddress != null) {
                    StringBuilder sb = new StringBuilder();
                    int i2 = 0;
                    while (i2 < hardwareAddress.length) {
                        Object[] objArr = new Object[2];
                        objArr[0] = Byte.valueOf(hardwareAddress[i2]);
                        objArr[1] = i2 < hardwareAddress.length - 1 ? "-" : "";
                        sb.append(String.format("%02X%s", objArr));
                        i2++;
                    }
                    return sb.toString();
                }
            }
            return null;
        } catch (SocketException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean d() {
        return j.a() == j.a;
    }

    public static String e() {
        String strA = c.a();
        if (strA == null) {
            strA = b.a();
        }
        if (strA == null) {
            strA = a.a();
        }
        if (a(strA)) {
            strA = c();
        }
        return strA;
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty() || str.equalsIgnoreCase("WINDOWS InstallDate  ") || str.contains("CScript Error");
    }

    public static boolean b(String str) {
        return !a(str);
    }

    public static String f() {
        String property = System.getProperty("user.home");
        String property2 = System.getProperty("file.separator");
        String string = new StringBuilder(property + property2 + ("." + Configuration.A.toLowerCase() + (Configuration.h.booleanValue() ? "-test" : "")) + property2).toString();
        if (Configuration.k) {
            string = "." + File.separator + "cache" + File.separator;
        }
        File file = new File(string);
        if (file.exists() || file.mkdir()) {
            return string;
        }
        System.out.println("Couldn't find cache directory!");
        return null;
    }

    public static String g() {
        String[] strArr = {"c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "", "c:/rscache", "/rscache"};
        if (d < 32 || d > 34) {
            d = 32;
        }
        String str = ".file_store_" + d;
        for (String str2 : strArr) {
            try {
                if (str2.length() <= 0 || new File(str2).exists()) {
                    File file = new File(str2 + str);
                    if (file.exists() || file.mkdir()) {
                        return str2 + str + "/";
                    }
                }
            } catch (Exception e2) {
            }
        }
        return null;
    }

    private static int f(String str) {
        try {
            File file = new File(str + "uid.dat");
            if (!file.exists() || file.length() < 4) {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(str + "uid.dat"));
                dataOutputStream.writeInt((int) (Math.random() * 9.9999999E7d));
                dataOutputStream.close();
            }
        } catch (Exception e2) {
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(str + "uid.dat"));
            int i2 = dataInputStream.readInt();
            dataInputStream.close();
            return i2 + 1;
        } catch (Exception e3) {
            return 0;
        }
    }

    public static synchronized Socket a(int i2) throws IOException {
        u = i2;
        while (u != 0) {
            try {
                Thread.sleep(50L);
            } catch (Exception e2) {
            }
        }
        if (v == null) {
            throw new IOException("could not open socket");
        }
        return v;
    }

    public static synchronized DataInputStream c(String str) throws IOException {
        z = str;
        while (z != null) {
            try {
                Thread.sleep(50L);
            } catch (Exception e2) {
            }
        }
        if (A == null) {
            throw new IOException("could not open: " + str);
        }
        return A;
    }

    public static synchronized void d(String str) {
        i = str;
        y = str;
    }

    public static synchronized void a(Runnable runnable, int i2) {
        w = i2;
        x = runnable;
    }

    public static synchronized boolean a(byte[] bArr, int i2) {
        if (i2 > 2000000 || C != null) {
            return false;
        }
        H = (H + 1) % 5;
        B = i2;
        D = bArr;
        G = true;
        C = "sound" + H + ".wav";
        return true;
    }

    public static synchronized boolean h() {
        if (C != null) {
            return false;
        }
        D = null;
        G = true;
        C = "sound" + H + ".wav";
        return true;
    }

    public static synchronized void b(byte[] bArr, int i2) {
        if (i2 <= 2000000 && C == null) {
            F = (F + 1) % 5;
            B = i2;
            D = bArr;
            E = true;
            C = "jingle" + F + ".mid";
        }
    }

    public static boolean i() {
        String property = System.getProperty("os.arch");
        String property2 = System.getProperty("sun.arch.data.model");
        return property != null && property.contains("64") && property2 != null && property2.equals("32");
    }

    public static void a(double d2) {
        a.a(d2);
    }

    public static void e(String str) {
        System.out.println("Error: " + str);
    }

    private class_650() {
    }
}
