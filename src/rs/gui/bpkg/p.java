package rs.gui.bpkg;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import rs.gui.bpkg.a.A;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/p.class */
class p implements MouseListener {
    final /* synthetic */ h a;

    p(h hVar) {
        this.a = hVar;
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        int x = (int) mouseEvent.getPoint().getX();
        int y = (int) mouseEvent.getPoint().getY();
        int i = -1;
        if (x >= 20 && x <= 75) {
            if (y >= 304 && y <= 335) {
                i = 0;
            }
            if (y >= 336 && y <= 367) {
                i = 2;
            }
            if (y >= 369 && y <= 401) {
                i = 4;
            }
            if (y >= 402 && y <= 431) {
                i = 6;
            }
        }
        if (x >= 90 && x <= 145) {
            if (y >= 304 && y <= 335) {
                i = 1;
            }
            if (y >= 336 && y <= 367) {
                i = 3;
            }
            if (y >= 369 && y <= 401) {
                i = 5;
            }
        }
        if (i >= 0) {
            this.a.c();
            this.a.m = new A(this.a.e, i);
            this.a.m.a();
        }
    }

    public void mousePressed(MouseEvent mouseEvent) {
    }

    public void mouseReleased(MouseEvent mouseEvent) {
    }

    public void mouseEntered(MouseEvent mouseEvent) {
    }

    public void mouseExited(MouseEvent mouseEvent) {
    }
}
