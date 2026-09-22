package rs.plugins.cpkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import rs.Client;
import rs.Configuration;
import rs.Npc;
import rs.class_281;
import rs.class_282;
import rs.class_283;
import rs.class_313;
import rs.class_341;
import rs.gui.Launcher;
import rs.ui.m;

/* JADX INFO: loaded from: client-final.jar:rs/s/c/d.class */
public class d extends m {
    private static final String a = "Recoloring N/A";
    private static final String b = "Recoloring NPC";
    private static final String c = "Recoloring Item";
    private static final String d = "Recoloring Object";
    private static final Dimension e = new Dimension(150, 27);
    private JList<String> f;
    private JLabel g;
    private class_283 l = class_313.d().j();
    private class_281 m = class_313.d().k();
    private class_282 k = this.l;

    public d() {
        j();
    }

    public static boolean b() {
        return Configuration.c();
    }

    public void a(Npc npc, boolean z) {
        if (this.l.u() != null && this.l.u() == npc && !z) {
            i();
            return;
        }
        i();
        a(b);
        a(this.l, npc, z);
        a(npc);
    }

    public void a(Npc npc) {
        if (npc == null || npc.aG == null || npc.aG.L == null) {
            System.out.println("No models found for NPC " + String.valueOf(npc != null ? Integer.valueOf(npc.n()) : "null"));
            return;
        }
        System.out.println("Models for NPC id " + npc.n() + " (" + npc.o() + "):");
        for (int i : npc.aG.L) {
            System.out.println(" - Model ID: " + i);
        }
    }

    public void a(int i, boolean z) {
        i();
        a(c);
        a(class_313.d().k(), Integer.valueOf(i), z);
    }

    public void b(int i, boolean z) {
        i();
        a(d);
        a(class_313.d().l(), Integer.valueOf(i), z);
    }

    public void c() {
        a(a);
    }

    public boolean e() {
        return b.equals(this.g.getText());
    }

    public boolean f() {
        return c.equals(this.g.getText());
    }

    private void i() {
        Client.ba = false;
        this.l.m();
    }

    private void a(String str) {
        this.g.setText(str);
    }

    private void a(class_282 class_282Var, Object obj, boolean z) {
        this.k = class_282Var;
        class_282Var.a(obj, z);
        Launcher.n().d();
    }

    private void j() {
        a(5);
        a("Reset Item Defs", "::itemdef reset");
        a("Reset NPC Defs", "::resetnpcdefs");
        a("Repack cache", "::repack");
        a(5);
        this.g = new JLabel(a);
        a((JComponent) this.g);
        add(this.g);
        this.f = m();
        add(b(this.f));
        a(5);
        a("Color inverse", actionEvent -> {
            this.k.c(((JCheckBox) actionEvent.getSource()).isSelected());
        });
        a("Hide modified", actionEvent2 -> {
            this.k.b(((JCheckBox) actionEvent2.getSource()).isSelected());
        });
        a(5);
        JButton jButtonA = a("Copy selected", 100, 27);
        jButtonA.addActionListener(this::a);
        add(jButtonA);
    }

    private JButton a(String str, int i, int i2) {
        JButton jButton = new JButton(str);
        Dimension dimension = new Dimension(i, i2);
        jButton.setPreferredSize(dimension);
        jButton.setMinimumSize(dimension);
        jButton.setMaximumSize(dimension);
        jButton.setFocusable(false);
        return jButton;
    }

    private JButton a(String str, String str2) {
        JButton jButtonA = a(str, e.width, e.height);
        jButtonA.addActionListener(actionEvent -> {
            b(str2);
        });
        add(jButtonA);
        return jButtonA;
    }

    private void a(int i) {
        add(Box.createVerticalStrut(i));
    }

    private JCheckBox a(String str, ActionListener actionListener) {
        JCheckBox jCheckBox = new JCheckBox(str);
        jCheckBox.addActionListener(actionListener);
        add(jCheckBox);
        return jCheckBox;
    }

    private JList<String> m() {
        JList<String> jList = new JList<>(new DefaultListModel());
        jList.setSelectionMode(2);
        jList.addListSelectionListener(listSelectionEvent -> {
            a((JList<String>) jList);
        });
        return jList;
    }

    private void a(JList<String> jList) {
        this.k.t().clear();
        Iterator it = jList.getSelectedValuesList().iterator();
        while (it.hasNext()) {
            this.k.t().add(Integer.valueOf(Integer.parseInt(((String) it.next()).replaceAll("[^\\d-]", ""))));
        }
    }

    private JScrollPane b(JList<String> jList) {
        JScrollPane jScrollPane = new JScrollPane(jList);
        jScrollPane.setFocusable(false);
        jScrollPane.setAlignmentX(0.5f);
        jScrollPane.getViewport().setBackground(Color.BLACK);
        jScrollPane.setPreferredSize(new Dimension(jScrollPane.getPreferredSize().width, 211));
        return jScrollPane;
    }

    private void a(ActionEvent actionEvent) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(String.join(",", (Iterable<? extends CharSequence>) this.k.t().stream().map((v0) -> {
            return String.valueOf(v0);
        }).collect(Collectors.toCollection(HashSet::new)))), (ClipboardOwner) null);
        Launcher.n().a("Development", "Color string added to keyboard!", true);
    }

    private void b(String str) {
        if (str.equals("::itemdef reset")) {
            Client.ap = "::resetitems";
        } else {
            Client.ap = str;
        }
        class_341.a(Launcher.n().o(), str, Client.cT);
    }

    private void a(JComponent jComponent) {
        jComponent.setAlignmentX(0.0f);
    }

    public JList<String> g() {
        return this.f;
    }

    public JLabel h() {
        return this.g;
    }
}
