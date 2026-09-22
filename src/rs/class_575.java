package rs;

import com.sun.jna.platform.win32.G;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_575.class */
public class class_575 implements Runnable {
    private static final Logger c = LoggerFactory.getLogger((Class<?>) class_575.class);
    public static class_575 a = new class_575();
    public static class_553 b = new class_576();
    private final DateTimeFormatter e = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
    private AtomicBoolean d = new AtomicBoolean(false);

    @Override // java.lang.Runnable
    public void run() {
        c.info("Receiver thread started!");
        class_572[] class_572VarArr = {null};
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        ActionListener actionListener = actionEvent -> {
            SwingUtilities.invokeLater(new class_577(this, class_572VarArr, concurrentLinkedQueue));
        };
        Timer timer = new Timer(100, actionListener);
        timer.start();
        int i = 0;
        Socket socket = null;
        DataInputStream dataInputStream = null;
        try {
            socket = new Socket(Configuration.j, G.cW);
            c.info("Connected to the server!");
            dataInputStream = new DataInputStream(socket.getInputStream());
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (this.d.get() && System.currentTimeMillis() - jCurrentTimeMillis <= 10000) {
                String utf = dataInputStream.readUTF();
                if (utf.equals("END")) {
                    break;
                }
                if (utf.startsWith("Could")) {
                    concurrentLinkedQueue.add(utf);
                    break;
                }
                boolean zContains = utf.contains("Login");
                if (zContains) {
                    i++;
                }
                String[] strArrSplit = utf.split(" \\| ");
                String strA = a(Long.parseLong(strArrSplit[0]));
                if (zContains) {
                    concurrentLinkedQueue.add("[" + strA + "] #" + i + ": " + strArrSplit[1].replace("Login", "Login request @"));
                } else {
                    concurrentLinkedQueue.add("[" + strA + "]  " + strArrSplit[1].replace("Logout", "Unregistered (logout)"));
                }
            }
        } catch (UnknownHostException e) {
            c.info("Don't know about host " + Configuration.j);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        actionListener.actionPerformed((ActionEvent) null);
        timer.stop();
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.time.LocalDateTime] */
    private String a(long j) {
        return Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDateTime().format(this.e);
    }

    public AtomicBoolean c() {
        return this.d;
    }
}
