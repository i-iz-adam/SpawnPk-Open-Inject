package rs.ui.apkg;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import rs.class_314;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a/c.class */
public abstract class c {
    private final String b;
    private final String c;
    String a;
    private BufferedImage d;
    private BufferedImage e;
    private h f;
    private String g;
    private Instant k;
    private List<class_314> h = new ArrayList();
    private e i = e.b;
    private int j = 0;
    private boolean l = false;

    public c(BufferedImage bufferedImage, String str, String str2) {
        this.c = str;
        this.a = str;
        this.b = str2;
        a(bufferedImage);
        a(h.c);
    }

    public abstract String a();

    public abstract Color b();

    public boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        if (this.j == 0) {
            return false;
        }
        return this.k == null || Duration.between(this.k, Instant.now()).compareTo(Duration.ofMinutes((long) this.j)) > 0;
    }

    public String h() {
        return this.b;
    }

    public String i() {
        return this.c;
    }

    public String j() {
        return this.a;
    }

    public BufferedImage k() {
        return this.d;
    }

    public void a(BufferedImage bufferedImage) {
        this.d = bufferedImage;
    }

    public BufferedImage l() {
        return this.e;
    }

    public void b(BufferedImage bufferedImage) {
        this.e = bufferedImage;
    }

    public h m() {
        return this.f;
    }

    public void a(h hVar) {
        this.f = hVar;
    }

    public String n() {
        return this.g;
    }

    public void a(String str) {
        this.g = str;
    }

    public List<class_314> o() {
        return this.h;
    }

    public void a(List<class_314> list) {
        this.h = list;
    }

    public e p() {
        return this.i;
    }

    public void a(e eVar) {
        this.i = eVar;
    }

    public int q() {
        return this.j;
    }

    public void c(int i) {
        this.j = i;
    }

    public void a(Instant instant) {
        this.k = instant;
    }

    public boolean r() {
        return this.l;
    }

    public void a(boolean z) {
        this.l = z;
    }
}
