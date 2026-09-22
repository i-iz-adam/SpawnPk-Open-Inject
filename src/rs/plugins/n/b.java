package rs.plugins.n;

import com.google.inject.Inject;
import com.google.inject.Provides;
import java.awt.TrayIcon;
import rs.class_139;
import rs.eventbus.Subscribe;
import rs.runelite.events.ChatMessage;
import rs.runelite.events.FocusChanged;
import rs.runelite.events.PrivateChatMessage;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/n/b.class */
@e(a = "Notifications", b = a.a, d = {"notify", "alert", "notification"}, g = true)
public class b extends rs.plugins.a {
    private static final String b = "@red@You've reached the de-aggro timer (anti-afk) for this region!";
    private static final String c = "<img=163> A superior slayer monster has appeared!";
    private static final String d = "A superior boss has appeared!";

    @Inject
    private c e;

    @Inject
    private a f;
    private boolean g = false;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Subscribe
    public void onFocusChanged(FocusChanged focusChanged) {
        if (focusChanged.isFocused()) {
            this.g = false;
        }
    }

    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        if (chatMessage.getMessage().equals(b) && this.f.a() && !this.g) {
            this.e.a("De-aggro timer reached!", TrayIcon.MessageType.INFO);
            this.g = true;
        }
        if ((chatMessage.getMessage().equals(c) || chatMessage.getMessage().equals(d)) && this.f.b()) {
            this.e.a("Superior spawned!", TrayIcon.MessageType.INFO);
        }
    }

    @Subscribe
    public void onPrivateChatMessage(PrivateChatMessage privateChatMessage) {
        if (this.f.c()) {
            this.e.a("PM from " + privateChatMessage.getSender() + ": " + privateChatMessage.getMessage(), TrayIcon.MessageType.INFO);
        }
    }
}
