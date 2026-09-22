package rs.lpkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;
import rs.Client;
import rs.ClientThread;
import rs.Configuration;
import rs.class_650;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/l/b.class */
public class b {
    public static boolean a = false;
    public static rs.lpkg.apkg.a b = rs.lpkg.apkg.a.a;
    public static int c = 0;
    public static rs.lpkg.apkg.c d = rs.lpkg.apkg.c.c;
    public static rs.lpkg.apkg.b e = rs.lpkg.apkg.b.a;
    public static boolean f = true;
    public static int g = 0;
    public static int h = 0;
    public static boolean i = false;
    public static boolean j = false;
    public static int k = 2;
    public static boolean l = false;
    private static final String m = class_650.b() + "gpu.properties";
    private static boolean n = false;

    public static void a() {
        if (e.a()) {
            c();
        } else {
            b();
        }
    }

    public static void b() {
        Client clientO = Launcher.n().o();
        if (e.a()) {
            return;
        }
        clientO.gZ.a();
        clientO.a(1, "Initializing GPU - please wait.", (String) null);
        clientO.gZ.a(0, clientO.hG, 0);
        clientO.at = "::gpuflagon";
        if (e.a()) {
            clientO.a.b(false);
        }
        if (clientO.a == null) {
            try {
                clientO.a = new e();
                clientO.b = new p();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            clientO.a.c();
        }
        if (Client.ag() && e.a()) {
            e eVar = clientO.a;
            e.a(true);
        }
    }

    public static void c() {
        Client clientO = Launcher.n().o();
        if (e.a()) {
            Client.ao = "::gpuflagoff";
            clientO.gZ.a();
            clientO.a(1, "Disabling GPU - please wait.", (String) null);
            clientO.gZ.a(0, clientO.hG, 0);
            if (e.a()) {
                clientO.a.b(false);
            }
            clientO.a.d();
            Configuration.Q = false;
        }
    }

    public static void d() {
        ClientThread.a("SaveGpuSettings", b::h);
    }

    private static void h() {
        try {
            File file = new File(m);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter.write("stretch_width=" + g);
                bufferedWriter.newLine();
                bufferedWriter.write("stretch_height=" + h);
                bufferedWriter.newLine();
            } finally {
                bufferedWriter.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void e() {
        if (n) {
            return;
        }
        File file = new File(m);
        if (file.exists()) {
            n = true;
            try {
                Properties properties = new Properties();
                FileInputStream fileInputStream = new FileInputStream(file);
                properties.load(fileInputStream);
                fileInputStream.close();
                g = Integer.parseInt(properties.getProperty("stretch_width"));
                h = Integer.parseInt(properties.getProperty("stretch_height"));
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    file.delete();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public static void f() {
        int i2 = g;
        int i3 = h;
        Launcher.n().p().a(i2, i3);
    }

    public static boolean g() {
        return n;
    }

    static {
        e();
    }
}
