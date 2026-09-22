package rs.plugins.p;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.class_139;
import rs.class_313;
import rs.eventbus.Subscribe;
import rs.runelite.events.ConfigChanged;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/p/d.class */
@e(a = "Player Outline", b = a.a, c = "A simple plugin that outlines the player allowing you to see the player behind objects.", d = {"highlight, player, outline, color"}, f = false)
public class d extends rs.plugins.a {

    @Inject
    private a b;

    @Inject
    private b c;

    @Inject
    private c d;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    protected void a() {
        class_313.d().a(this.c);
        if (this.b.b()) {
            class_313.d().a(this.d);
        } else {
            class_313.d().b(this.d);
        }
    }

    @Override // rs.s.a
    protected void b() {
        class_313.d().b(this.c);
        class_313.d().b(this.d);
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (configChanged.getKey().equalsIgnoreCase("petOutline")) {
            if (this.b.b()) {
                class_313.d().a(this.d);
            } else {
                class_313.d().b(this.d);
            }
        }
    }
}
