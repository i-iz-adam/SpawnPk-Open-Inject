package rs.plugins.cpkg;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import javax.inject.Inject;
import rs.Client;
import rs.class_159;
import rs.class_268;
import rs.class_306;
import rs.class_495;

/* JADX INFO: loaded from: client-final.jar:rs/s/c/b.class */
public class b extends class_306 implements class_159 {
    private final a e;
    private final c f;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private long l = 0;

    @Inject
    public b(c cVar, a aVar) {
        this.f = cVar;
        this.e = aVar;
        a(class_268.A);
    }

    @Override // rs.class_306
    public void a() {
        int i = Client.hP + 5;
        int i2 = Client.hQ + 15;
        if (this.k != this.e.m()) {
            this.k = this.e.m();
            this.i = 0;
            this.j = 0;
        }
        if (this.e.k()) {
            Client.gl.b("@gre@m:" + Client.hP + "," + Client.hQ, i, i2, 0, 0);
            i2 -= 15;
            if (Client.ag) {
                Client.gl.b("@red@drag:" + (Client.hP - this.g) + "," + (Client.hQ - this.h), i, i2, 0, 0);
                i2 -= 15;
                Polygon polygon = new Polygon();
                polygon.addPoint(this.g, this.h);
                if (Client.hP > this.g) {
                    polygon.addPoint(this.g, Client.hQ);
                    polygon.addPoint(Client.hP, Client.hQ);
                    polygon.addPoint(Client.hP, this.h);
                }
                a((Shape) polygon, Color.RED, new Color(255, 0, 0, 50));
            } else {
                this.g = Client.hP;
                this.h = Client.hQ;
            }
        }
        if (m()) {
            Client.gl.b("@mag@intf:" + this.i + "," + this.j, i, i2, 0, 0);
            int i3 = i2 - 15;
        }
        while (true) {
            e.a aVarPoll = this.f.f().k().poll();
            if (aVarPoll == null) {
                return;
            }
            Polygon polygon2 = new Polygon();
            polygon2.addPoint(aVarPoll.b(), aVarPoll.c());
            polygon2.addPoint(aVarPoll.b(), aVarPoll.c() + 1);
            polygon2.addPoint(aVarPoll.b() + 1, aVarPoll.c() + 1);
            polygon2.addPoint(aVarPoll.b() + 1, aVarPoll.c());
            int iMax = Math.max(Math.abs(aVarPoll.b() - Client.hP), Math.abs(aVarPoll.c() - Client.hQ));
            a((Shape) polygon2, iMax <= 1 ? Color.green : Color.magenta);
            Client.gl.b(aVarPoll.a(), aVarPoll.b(), aVarPoll.c(), iMax <= 1 ? Color.green.getRGB() : aVarPoll.d().i, 0);
        }
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (m()) {
            int i = keyEvent.isControlDown() ? 10 : 1;
            if (keyEvent.getKeyCode() == 39) {
                this.i += i;
                k();
                keyEvent.consume();
            } else if (keyEvent.getKeyCode() == 37) {
                this.i -= i;
                k();
                keyEvent.consume();
            }
            if (keyEvent.getKeyCode() == 38) {
                this.j -= i;
                k();
                keyEvent.consume();
            } else if (keyEvent.getKeyCode() == 40) {
                this.j += i;
                k();
                keyEvent.consume();
            }
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
    }

    public void keyTyped(KeyEvent keyEvent) {
    }

    private void k() {
        if (l() == null || System.currentTimeMillis() - this.l < 10) {
            return;
        }
        this.l = System.currentTimeMillis();
        l().a();
    }

    private class_495 l() {
        if (this.e.l() > 0) {
            return c.c.get(Integer.valueOf(this.e.l()));
        }
        if (this.e.m() <= 0 || Client.cH <= 0) {
            return null;
        }
        return c.c.get(Integer.valueOf(Client.cH));
    }

    private boolean m() {
        return l() != null;
    }
}
