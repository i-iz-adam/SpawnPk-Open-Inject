package rs.plugins.t;

import java.awt.Color;
import java.awt.Image;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import rs.Client;
import rs.ClientThread;
import rs.ItemComposition;
import rs.class_12;
import rs.class_333;
import rs.class_553;
import rs.eventbus.Subscribe;
import rs.runelite.events.GameStateChanged;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/i.class */
@rs.plugins.e(a = "Trading post", b = "tradepost", c = "Enable the Notes panel", d = {"panel"}, i = true, k = true)
public class i extends rs.plugins.a {
    private static final ConcurrentHashMap<Integer, Image> d = new ConcurrentHashMap<>();
    public static final class_553 b = new j();
    public static i c;

    @Inject
    private h e;

    @Inject
    private Client f;

    @Inject
    private rs.ui.e g;
    private rs.ui.l h;

    public i() {
        c = this;
    }

    @Override // rs.s.a
    protected void a() {
        this.e = (h) this.a.getInstance(h.class);
        this.h = rs.ui.l.a().a("Trading Post").a(class_12.b(getClass(), "ge_icon.png")).a(4).a(this.e).a();
        this.g.a(this.h);
    }

    @Override // rs.s.a
    protected void b() {
        this.g.b(this.h);
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        switch (k.a[gameStateChanged.getGameState().ordinal()]) {
            case 1:
                this.e.e().a();
                break;
        }
    }

    public Image a(int i) {
        if (d.get(Integer.valueOf(i)) != null) {
            return d.get(Integer.valueOf(i));
        }
        ClientThread.queue(() -> {
            b(i);
        });
        return null;
    }

    public Image b(int i) {
        if (d.size() > 500) {
            d.clear();
        }
        if (d.get(Integer.valueOf(i)) != null) {
            return d.get(Integer.valueOf(i));
        }
        class_333 class_333VarA = ItemComposition.a(i, Integer.MAX_VALUE, 0, 32);
        if (class_333VarA == null) {
            return null;
        }
        Image imageA = Client.a(class_333.a(class_333VarA.a(32, 32), new Color(0, 0, 0)));
        if (imageA != null) {
            d.put(Integer.valueOf(i), imageA);
        }
        return imageA;
    }

    public h f() {
        return this.e;
    }
}
