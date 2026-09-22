package rs.plugins.n;

import com.google.a.e.h;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
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
import rs.Client;
import rs.Configuration;
import rs.class_139;
import rs.class_144;
import rs.class_650;
import rs.eventbus.EventBus;
import rs.gui.Launcher;
import rs.lpkg.j;
import rs.runelite.events.NotificationFired;
import rs.ui.f;

/* JADX INFO: loaded from: client-final.jar:rs/s/n/c.class */
@Singleton
public class c {
    private static final String b = "\"";
    private static final int d = 2000;
    private static final int e = 100;
    private static final long f = -2;
    private static final long g = -1;
    private final Client h;
    private rs.plugins.n.a i;
    private final f j;
    private final class_139 k;
    private final ScheduledExecutorService l;
    private final EventBus m;
    private boolean p;
    private Instant q;
    private long r;
    private static final Logger a = LoggerFactory.getLogger((Class<?>) c.class);
    private static final com.google.a.e.f c = h.b().a('\"', "'").a();
    private long s = -2;
    private Clip t = null;
    private final String n = Configuration.A;
    private final Path o = new File(class_650.b() + "icon.png").toPath();

    /* JADX INFO: loaded from: client-final.jar:rs/s/n/c$a.class */
    public enum a {
        a("Native"),
        b("Off");

        private final String c;

        @Override // java.lang.Enum
        public String toString() {
            return this.c;
        }

        public String a() {
            return this.c;
        }

        a(String str) {
            this.c = str;
        }
    }

    @Inject
    private c(f fVar, Client client, class_139 class_139Var, ScheduledExecutorService scheduledExecutorService, EventBus eventBus) {
        this.h = client;
        this.j = fVar;
        this.k = class_139Var;
        this.l = scheduledExecutorService;
        this.m = eventBus;
        this.i = (rs.plugins.n.a) class_139Var.a(rs.plugins.n.a.class);
        a();
    }

    private void a() {
        if (j.a() != j.c || Files.exists(this.o, new LinkOption[0])) {
            return;
        }
        try {
            InputStream resourceAsStream = Launcher.class.getResourceAsStream("/icon.png");
            try {
                Files.copy(resourceAsStream, this.o, new CopyOption[0]);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            a.warn((String) null, (Throwable) e2);
        }
    }

    public void a(String str) {
        a(str, TrayIcon.MessageType.NONE);
    }

    public void a(String str, TrayIcon.MessageType messageType) {
        this.m.post(new NotificationFired(str, messageType));
        if (this.i.j() || !this.j.d()) {
            switch (this.i.f()) {
                case b:
                    this.j.e();
                    break;
                case c:
                    this.j.f();
                    break;
            }
            if (this.i.e()) {
                a(c(), str, messageType);
            }
            switch (this.i.g()) {
                case a:
                    Toolkit.getDefaultToolkit().beep();
                    break;
            }
            if (this.i.i() != class_144.a) {
                this.q = Instant.now();
                this.r = this.h.hL;
            }
            a.debug(str);
        }
    }

    public void a(Graphics2D graphics2D) {
        class_144 class_144VarI = this.i.i();
        if (this.q == null || !this.h.fc || class_144VarI == class_144.a) {
            this.q = null;
            return;
        }
        if (Instant.now().minusMillis(2000L).isAfter(this.q)) {
            switch (class_144VarI) {
                case b:
                case c:
                    this.q = null;
                    return;
                case e:
                case d:
                    if (this.h.hL < 100 || this.h.hL < 100) {
                        this.q = null;
                        return;
                    }
                    break;
            }
        }
        Client client = this.h;
        if (Client.ff % 40 < 20 || !(class_144VarI == class_144.b || class_144VarI == class_144.d)) {
            Color color = graphics2D.getColor();
            graphics2D.setColor(this.i.k());
            graphics2D.fill(new Rectangle(this.j.n().getWidth(), this.j.n().getHeight()));
            graphics2D.setColor(color);
        }
    }

    private void a(String str, String str2, TrayIcon.MessageType messageType) {
        String strA = c.a(str);
        String strA2 = c.a(str2);
        switch (j.a()) {
            case c:
                c(strA, strA2, messageType);
                break;
            case b:
                a(strA, strA2);
                break;
            default:
                b(str, str2, messageType);
                break;
        }
    }

    private void b(String str, String str2, TrayIcon.MessageType messageType) {
        if (this.j.l() != null) {
            this.j.l().displayMessage(str, str2, messageType);
        }
    }

    private void c(String str, String str2, TrayIcon.MessageType messageType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("notify-send");
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add("-a");
        arrayList.add(c.a(this.n));
        arrayList.add("-i");
        arrayList.add(c.a(this.o.toAbsolutePath().toString()));
        arrayList.add("-u");
        arrayList.add(a(messageType));
        if (this.i.h() > 0) {
            arrayList.add("-t");
            arrayList.add(String.valueOf(this.i.h()));
        }
        this.l.submit(() -> {
            try {
                Process processA = a((List<String>) arrayList);
                if (processA.waitFor(500L, TimeUnit.MILLISECONDS) && processA.exitValue() == 0) {
                    return;
                }
            } catch (IOException | InterruptedException e2) {
                a.debug("error sending notification", e2);
            }
            b(str, str2, messageType);
        });
    }

    private void a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (this.p) {
            Collections.addAll(arrayList, "sh", "-lc", "\"$@\"", "--", "terminal-notifier", "-title", str, "-message", str2, "-group", "net.runelite.launcher", "-sender", "net.runelite.launcher");
        } else {
            arrayList.add("osascript");
            arrayList.add("-e");
            arrayList.add("display notification \"" + str2 + "\" with title \"" + str + "\"");
        }
        try {
            a(arrayList);
        } catch (IOException e2) {
            a.warn("error sending notification", (Throwable) e2);
        }
    }

    private static Process a(List<String> list) {
        return new ProcessBuilder(list).redirectErrorStream(true).start();
    }

    private boolean b() {
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"sh", "-lc", "terminal-notifier -help"});
            return processExec.waitFor(2L, TimeUnit.SECONDS) && processExec.exitValue() == 0;
        } catch (IOException | InterruptedException e2) {
            return false;
        }
    }

    private static String a(TrayIcon.MessageType messageType) {
        switch (d.e[messageType.ordinal()]) {
            case 1:
            case 2:
                return "critical";
            default:
                return "normal";
        }
    }

    private String c() {
        return this.n;
    }
}
