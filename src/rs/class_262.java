package rs;

import java.awt.Color;
import java.awt.Polygon;
import rs.gui.Launcher;
import rs.runelite.a.f;

/* JADX INFO: loaded from: client-final.jar:rs/class_262.class */
public class class_262 {
    public Polygon a;
    public Color b;
    public Color c;
    public String d;
    public int e;
    public int f;

    public class_262(Polygon polygon, Color color, Color color2) {
        this.a = polygon;
        this.b = color;
        this.c = color2;
    }

    public static class_262 a(Entity entity, Color color, Color color2) {
        byte b = 1;
        if (entity instanceof Npc) {
            Npc npc = (Npc) entity;
            if (npc.aG != null) {
                b = npc.aG.r;
            }
        }
        return new class_262(entity.a(b), color, color2);
    }

    public static class_262 a(int i, int i2, Color color, Color color2) {
        class_262 class_262Var = new class_262(Launcher.n().o().a(new f((i - Client.eh) * 128, (i2 - Client.ei) * 128), 1), color, color2);
        class_262Var.e = i;
        class_262Var.f = i2;
        return class_262Var;
    }

    public void a() {
        if (this.e == 0 && this.f == 0) {
            return;
        }
        this.a = Launcher.n().o().a(new f(((this.e - Client.eh) * 128) + 64, ((this.f - Client.ei) * 128) + 64), 1);
    }

    public Color b() {
        return this.b;
    }

    public Color c() {
        return this.c;
    }
}
