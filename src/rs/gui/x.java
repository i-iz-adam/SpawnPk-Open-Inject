package rs.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import javax.imageio.ImageIO;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/gui/x.class */
public class x {
    public Image a;
    private int b;
    private int c;
    private int d;

    public x(int i) {
        this.d = i;
    }

    public boolean a(String str) {
        try {
            if (Client.class.getResource("Client.class").toString().startsWith("file")) {
                this.a = Toolkit.getDefaultToolkit().getImage("." + str);
            } else {
                this.a = ImageIO.read(getClass().getResource(str));
            }
            return this.a != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void a(Image image) {
        this.a = image;
    }

    public void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public void a(Graphics graphics) {
        if (Launcher.n() != null) {
            graphics.create().drawImage(this.a, this.b, this.c, (ImageObserver) null);
        }
    }
}
