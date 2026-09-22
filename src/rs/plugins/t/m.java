package rs.plugins.t;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import rs.class_12;
import rs.class_18;
import rs.class_9;
import rs.gui.w;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/m.class */
public class m extends JPanel {
    private static final Dimension c = new Dimension(32, 32);
    public static Icon a = new ImageIcon(class_12.b((Class<?>) m.class, "ge_icon.png"));
    public static Icon b = new ImageIcon(class_12.b((Class<?>) m.class, "time.png"));

    m(i iVar, Image image, String str, int i, int i2, int i3, String str2, b bVar, String str3, String str4) {
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(5);
        setLayout(borderLayout);
        setToolTipText(str);
        setBackground(rs.gui.d.c);
        Color background = getBackground();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        addMouseListener(new n(this, arrayList, background));
        setBorder(new EmptyBorder(5, 5, 5, 0));
        JLabel jLabel = new JLabel();
        jLabel.setPreferredSize(c);
        if (image != null) {
            jLabel.setIcon(new ImageIcon(image));
        }
        add(jLabel, "Before");
        JPanel jPanel = new JPanel(new GridLayout(3, 1));
        arrayList.add(jPanel);
        jPanel.setBackground(background);
        JLabel jLabel2 = new JLabel();
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setMaximumSize(new Dimension(0, 0));
        jLabel2.setPreferredSize(new Dimension(0, 0));
        if (i3 > 1) {
            jLabel2.setText(a(str, " <font color='yellow'>(x" + class_18.b(i3) + ")</font>"));
        } else {
            jLabel2.setText(str);
        }
        jPanel.add(jLabel2);
        JLabel jLabel3 = new JLabel();
        jLabel3.setIcon(new ImageIcon(bVar.c()));
        if (bVar.b() > 1) {
            jLabel3.setText(a("<font color='#6EE16E'>" + class_18.b(i2) + "</font>", " <font color='#2FFF9F'>(" + class_18.a(((long) i2) * ((long) bVar.b())) + ")</font>"));
        } else {
            jLabel3.setText(class_18.b(i2));
        }
        jLabel3.setForeground(rs.gui.d.l);
        jPanel.add(jLabel3);
        JPanel jPanel2 = new JPanel(new BorderLayout());
        arrayList.add(jPanel2);
        jPanel2.setBackground(background);
        JLabel jLabel4 = new JLabel();
        jLabel4.setText(a(str2));
        jLabel4.setFont(w.b());
        jLabel4.setForeground(rs.gui.d.m);
        jPanel2.add(jLabel4, "West");
        JLabel jLabel5 = new JLabel();
        jLabel5.setIcon(a);
        jLabel5.setFont(w.b());
        jLabel5.setText(a(str3 + " &#8594; " + str4, ""));
        jLabel5.setForeground(rs.gui.d.n);
        jLabel5.setBorder(new CompoundBorder(jLabel5.getBorder(), new EmptyBorder(0, 0, 0, 7)));
        jPanel2.add(jLabel5, "East");
        jPanel.add(jPanel2);
        add(jPanel, "Center");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JPanel jPanel, Color color) {
        jPanel.setBackground(color);
        for (Component component : jPanel.getComponents()) {
            component.setBackground(color);
        }
    }

    private String a(String str) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS").withZone(ZoneId.of("UTC")));
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("UTC"));
        if (zonedDateTime.isAfter(zonedDateTimeNow)) {
            return "Very recent";
        }
        Duration durationBetween = Duration.between(zonedDateTime, zonedDateTimeNow);
        long days = durationBetween.toDays() / 365;
        long days2 = (durationBetween.toDays() % 365) / 30;
        long days3 = (durationBetween.toDays() % 365) % 30;
        long hours = durationBetween.toHours() % 24;
        long minutes = durationBetween.toMinutes() % 60;
        long seconds = durationBetween.getSeconds() % 60;
        if (days > 0) {
            return days + " years ago";
        }
        if (days2 > 0) {
            return days2 + " months ago";
        }
        if (days3 > 0) {
            return days3 + " days ago";
        }
        if (hours > 0) {
            return hours + " hours ago";
        }
        return minutes > 0 ? minutes + " minutes ago" : seconds + " seconds ago";
    }

    private String a(String str, String str2) {
        return "<html><body style = 'color:white'>" + str + "<span style = 'color:" + class_9.b(rs.gui.d.f) + "'>" + str2 + "</span></body></html>";
    }
}
