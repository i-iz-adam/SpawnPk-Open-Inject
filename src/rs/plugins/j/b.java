package rs.plugins.j;

import com.google.a.b.as;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import rs.Client;
import rs.ClientThread;
import rs.class_159;

/* JADX INFO: loaded from: client-final.jar:rs/s/j/b.class */
class b implements class_159 {

    @Inject
    private c a;

    @Inject
    private a b;

    @Inject
    private Client c;
    private final Map<Integer, Integer> d = new HashMap();
    private final Set<Character> e = new HashSet();

    b() {
    }

    public void keyTyped(KeyEvent keyEvent) {
        char keyChar = keyEvent.getKeyChar();
        if (keyChar != 65535 && this.e.contains(Character.valueOf(keyChar)) && this.a.h()) {
            keyEvent.consume();
        }
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (this.a.h() && !keyEvent.isControlDown()) {
            if (this.a.j()) {
                switch (keyEvent.getKeyCode()) {
                    case 8:
                        ClientThread.queue(() -> {
                            Client client = this.c;
                            if (as.c(Client.dk)) {
                                SwingUtilities.invokeLater(() -> {
                                    this.a.a(false);
                                });
                                this.a.f();
                            }
                        });
                        break;
                    case 10:
                        this.a.a(false);
                        ClientThread.queue(() -> {
                            this.a.f();
                        });
                        break;
                    case 27:
                        keyEvent.consume();
                        this.a.a(false);
                        break;
                }
            }
            int i = 0;
            if (this.b.a()) {
                if (this.b.b().a(keyEvent)) {
                    i = 38;
                } else if (this.b.c().a(keyEvent)) {
                    i = 40;
                } else if (this.b.d().a(keyEvent)) {
                    i = 37;
                } else if (this.b.e().a(keyEvent)) {
                    i = 39;
                }
            }
            if (this.b.f() && !this.a.i()) {
                if (this.b.g().a(keyEvent)) {
                    i = 112;
                } else if (this.b.h().a(keyEvent)) {
                    i = 113;
                } else if (this.b.i().a(keyEvent)) {
                    i = 114;
                } else if (this.b.j().a(keyEvent)) {
                    i = 115;
                } else if (this.b.k().a(keyEvent)) {
                    i = 116;
                } else if (this.b.l().a(keyEvent)) {
                    i = 117;
                } else if (this.b.m().a(keyEvent)) {
                    i = 118;
                } else if (this.b.n().a(keyEvent)) {
                    i = 119;
                } else if (this.b.o().a(keyEvent)) {
                    i = 120;
                } else if (this.b.p().a(keyEvent)) {
                    i = 121;
                } else if (this.b.q().a(keyEvent)) {
                    i = 122;
                } else if (this.b.r().a(keyEvent)) {
                    i = 123;
                }
            }
            if (i != 0 && i != keyEvent.getKeyCode()) {
                char keyChar = keyEvent.getKeyChar();
                this.d.put(Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(i));
                keyEvent.setKeyCode(i);
                keyEvent.setKeyChar((char) 65535);
                if (keyChar != 65535) {
                    this.e.add(Character.valueOf(keyChar));
                }
            }
            switch (keyEvent.getKeyCode()) {
                case 10:
                case 47:
                case 59:
                case 513:
                    ClientThread.queue(() -> {
                        this.a.g();
                        if (keyEvent.getKeyCode() == 47) {
                            Client client = this.c;
                            if (Client.dk.isEmpty()) {
                                this.c.bw = true;
                            }
                            Client client2 = this.c;
                            Client.dk += keyEvent.getKeyChar();
                        }
                        if (keyEvent.getKeyCode() == 59) {
                            Client client3 = this.c;
                            if (Client.dk.isEmpty()) {
                                this.c.bw = true;
                            }
                            Client client4 = this.c;
                            Client.dk += ":";
                        }
                    });
                    break;
            }
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        char keyChar = keyEvent.getKeyChar();
        if (keyChar != 65535) {
            this.e.remove(Character.valueOf(keyChar));
        }
        Integer numRemove = this.d.remove(Integer.valueOf(keyCode));
        if (numRemove != null) {
            keyEvent.setKeyCode(numRemove.intValue());
            keyEvent.setKeyChar((char) 65535);
        }
    }
}
