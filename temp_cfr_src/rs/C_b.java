/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import rs.p_gui.C_Launcher_mc;

public final class C_b
extends Canvas {
    Component a;
    private static boolean b;

    public C_b(Component component) {
        this.a = component;
    }

    @Override
    public void update(Graphics graphics) {
        this.a.update(graphics);
    }

    @Override
    public void paint(Graphics graphics) {
        this.a.paint(graphics);
    }

    @Override
    public void removeFocusListener(FocusListener focusListener) {
        super.removeFocusListener(focusListener);
        b = !this.hasFocus();
    }

    @Override
    public void requestFocus() {
        if (!b) {
            this.requestFocusInWindow();
        }
    }

    @Override
    public void setSize(int n, int n2) {
        if (C_Launcher_mc.n().o().ay()) {
            super.setSize(C_Launcher_mc.n().o().aF().width, C_Launcher_mc.n().o().aF().height);
        } else {
            super.setSize(n, n2);
        }
    }

    @Override
    public void setLocation(int n, int n2) {
        super.setLocation(n, n2);
    }
}

