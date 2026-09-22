package rs;

import java.awt.Polygon;
import rs.runelite.a.m;

/* JADX INFO: loaded from: client-final.jar:rs/class_308.class */
public abstract class class_308 extends class_306 {
    protected Npc e;
    protected class_102 f;
    protected ColorUtility g;
    protected int h;

    public void a(Npc npc) {
        this.e = npc;
        this.f = npc.aG;
    }

    @Override // rs.class_306
    public void b() {
        this.e = null;
        this.f = null;
    }

    public m l() {
        return this.g.a(this.e.ac, this.e.ad, this.e.ae, this.e.as + Client.cK);
    }

    public Polygon m() {
        return this.g.b(this.e.ac, this.e.ad, this.e.as + Client.cK, this.e.ae);
    }

    public Npc n() {
        return this.e;
    }

    public class_102 o() {
        return this.f;
    }

    public ColorUtility p() {
        return this.g;
    }

    public void a(ColorUtility colorUtility) {
        this.g = colorUtility;
    }

    public int q() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }
}
