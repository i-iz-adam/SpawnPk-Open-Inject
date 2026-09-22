package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/v.class */
public class v extends f {
    private int a;
    private int b;
    private List<Integer> c = Collections.emptyList();
    private final JLabel d = new rs.ui.components.shadowlabel.a();
    private final JLabel e = new rs.ui.components.shadowlabel.a();
    private final JLabel f = new rs.ui.components.shadowlabel.a();
    private String g = "";
    private String h = "";

    public v() {
        setLayout(new GridLayout(1, 3));
        setBackground(Color.GREEN.darker());
        setForeground(Color.GREEN.brighter());
        setPreferredSize(new Dimension(100, 16));
        this.d.setFont(rs.gui.w.b());
        this.d.setForeground(Color.WHITE);
        this.d.setBorder(new EmptyBorder(2, 5, 0, 0));
        this.e.setFont(rs.gui.w.b());
        this.e.setForeground(Color.WHITE);
        this.e.setHorizontalAlignment(4);
        this.e.setBorder(new EmptyBorder(2, 0, 0, 5));
        this.f.setFont(rs.gui.w.b());
        this.f.setForeground(Color.WHITE);
        this.f.setHorizontalAlignment(0);
        this.f.setBorder(new EmptyBorder(2, 0, 0, 0));
        add(this.d);
        add(this.f);
        add(this.e);
    }

    public void paint(Graphics graphics) {
        int iB = (int) (getSize().width * (b() / 100.0f));
        super.paint(graphics);
        graphics.setColor(getForeground());
        graphics.fillRect(0, 0, iB, 16);
        Iterator<Integer> it = this.c.iterator();
        while (it.hasNext()) {
            int iIntValue = (getSize().width * it.next().intValue()) / this.a;
            if (iIntValue > iB) {
                graphics.fillRect(iIntValue, 0, 1, 16);
            }
        }
        super.paintComponents(graphics);
    }

    @Override // rs.ui.components.f
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.d.setForeground(Color.GRAY);
            this.e.setForeground(Color.GRAY);
            this.f.setText(this.h);
        } else {
            this.d.setForeground(Color.WHITE);
            this.e.setForeground(Color.WHITE);
            this.f.setText(this.g);
        }
    }

    public void a(String str) {
        this.d.setText(str);
    }

    public void b(String str) {
        this.e.setText(str);
    }

    public void c(String str) {
        this.g = str;
        this.f.setText(a() ? this.h : str);
    }

    public void d(String str) {
        this.h = str;
        this.f.setText(a() ? str : this.g);
    }

    public int b() {
        if (this.a == 0) {
            return 0;
        }
        return (this.b * 100) / this.a;
    }

    public void a(int i) {
        this.a = i;
        repaint();
    }

    public void b(int i) {
        this.b = i;
        repaint();
    }

    public void a(List<Integer> list) {
        this.c = list;
        repaint();
    }
}
