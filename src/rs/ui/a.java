package rs.ui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.annotation.Nullable;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a.class */
public final class a extends JPanel {
    public static final int a = 765;
    public static final int b = 503;
    public static final Dimension c = new Dimension(765, 503);

    public a(@Nullable Applet applet) {
        setSize(c);
        setMinimumSize(c);
        setPreferredSize(c);
        setLayout(new BorderLayout());
        setBackground(Color.black);
        if (applet == null) {
            return;
        }
        add(applet, "Center");
    }
}
