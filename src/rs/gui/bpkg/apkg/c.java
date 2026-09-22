package rs.gui.bpkg.apkg;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rs.Client;
import rs.Player;
import rs.Widget;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/c.class */
class c implements ActionListener {
    final /* synthetic */ rs.gui.bpkg.a a;
    final /* synthetic */ JFrame b;
    final /* synthetic */ b c;

    c(b bVar, rs.gui.bpkg.a aVar, JFrame jFrame) {
        this.c = bVar;
        this.a = aVar;
        this.b = jFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (Launcher.n().o() != null) {
            Player player = Client.eR;
            Launcher.n().o().requestFocus();
            if (player != null) {
                this.a.a().clear();
                for (int i = 0; i < this.a.d().length; i++) {
                    this.a.a(i, (rs.gui.bpkg.f) null);
                }
                this.a.a(Launcher.n().o().s);
                this.a.c(Launcher.n().o().t);
                for (int i2 = 0; i2 < this.a.d().length; i2++) {
                    int i3 = Widget.H[3214].ax[i2] - 1;
                    int i4 = Widget.H[3214].av[i2];
                    if (i3 <= 0) {
                        i3 = -1;
                    }
                    this.a.a(i2, new rs.gui.bpkg.f(i3, i4));
                }
                for (int i5 = 0; i5 < Widget.H[1688].ax.length; i5++) {
                    int i6 = Widget.H[1688].ax[i5] - 1;
                    int i7 = Widget.H[1688].av[i5];
                    if (i6 <= 0) {
                        i6 = -1;
                    }
                    if (i6 > 0) {
                        this.a.a(rs.gui.bpkg.c.c.a(i5), new rs.gui.bpkg.f(i6, i7));
                    }
                }
                if (Client.eR != null) {
                    this.a.d(Client.eR.bs);
                }
                int i8 = Client.eT[6];
                if (i8 == 29999) {
                    this.a.a(rs.gui.bpkg.a.Spellbook.a);
                } else if (i8 == 12855) {
                    this.a.a(rs.gui.bpkg.a.Spellbook.b);
                } else if (i8 == 1151) {
                    this.a.a(rs.gui.bpkg.a.Spellbook.c);
                }
                int i9 = Client.eT[5];
                if (i9 == 5608) {
                    this.a.b(0);
                } else if (i9 == 22500) {
                    this.a.b(1);
                }
                for (int i10 = 0; i10 < rs.gui.bpkg.c.a.b.length; i10++) {
                    this.a.c()[i10] = Launcher.n().o().eo[rs.gui.bpkg.c.a.b[i10]];
                    if (this.a.c()[i10] < 1) {
                        this.a.c()[i10] = 1;
                    }
                    if (this.a.c()[i10] > 99) {
                        this.a.c()[i10] = 99;
                    }
                }
                this.c.a.f().a();
                this.c.a.a();
                this.c.a.g().a();
                Client.ap = "::cldt";
            } else {
                JOptionPane.showMessageDialog((Component) null, "You're not currently logged in to a character! \nPlease log in, wear and have what you want to clone, and try again.");
            }
        }
        this.b.setVisible(false);
        this.b.dispose();
    }
}
