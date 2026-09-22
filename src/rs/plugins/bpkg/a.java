package rs.plugins.bpkg;

import com.google.a.b.L;
import com.google.a.b.as;
import com.google.a.d.ag;
import com.google.a.d.fR;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import javax.inject.Inject;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.class_12;
import rs.class_134;
import rs.class_137;
import rs.class_138;
import rs.class_139;
import rs.class_142;
import rs.class_143;
import rs.class_145;
import rs.class_147;
import rs.class_23;
import rs.class_9;
import rs.gui.M;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/a.class */
public class a extends rs.ui.m {
    private static final Logger k;
    private static final int l = 6;
    public static final ImageIcon a;
    public static final ImageIcon b;
    public static final ImageIcon c;
    public static final ImageIcon d;
    static final ImageIcon e;
    static final ImageIcon f;
    private static final Map<class_143, Boolean> m;
    private final q n;
    private final class_139 o;
    private final rs.plugins.g p;
    private final rs.ui.components.a.d q;
    private final ListCellRenderer<Enum<?>> r;
    private final h s;
    private final JLabel t;
    private final u u;
    private final JButton v;
    private n w;
    static final /* synthetic */ boolean g;

    @Inject
    private a(q qVar, class_139 class_139Var, rs.plugins.g gVar, rs.ui.components.a.d dVar) {
        super(false);
        this.r = new rs.ui.components.c();
        this.w = null;
        this.n = qVar;
        this.o = class_139Var;
        this.p = gVar;
        this.q = dVar;
        setLayout(new BorderLayout());
        setBackground(rs.gui.d.d);
        JPanel jPanel = new JPanel();
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jPanel.setLayout(new BorderLayout(0, 6));
        add(jPanel, "North");
        this.s = new h();
        this.s.setBorder(new EmptyBorder(8, 10, 10, 10));
        this.s.setLayout(new rs.ui.j(0, 1, 0, 5));
        this.s.setAlignmentX(0.0f);
        h hVar = new h();
        hVar.setLayout(new BorderLayout());
        hVar.add(this.s, "North");
        JScrollPane jScrollPane = new JScrollPane(hVar);
        jScrollPane.setHorizontalScrollBarPolicy(31);
        jScrollPane.getVerticalScrollBar().setUnitIncrement(8);
        add(jScrollPane, "Center");
        this.v = new JButton(e);
        this.v.setRolloverIcon(f);
        M.a((AbstractButton) this.v);
        this.v.setPreferredSize(new Dimension(22, 0));
        this.v.setBorder(new EmptyBorder(0, 0, 0, 5));
        this.v.addActionListener(actionEvent -> {
            qVar.e().c();
        });
        this.v.setToolTipText("Back");
        jPanel.add(this.v, "West");
        this.u = new u();
        jPanel.add(this.u, "East");
        this.t = new JLabel();
        this.t.setForeground(Color.WHITE);
        jPanel.add(this.t);
    }

    void a(n nVar) {
        if (!g && this.w != null) {
            throw new AssertionError();
        }
        this.w = nVar;
        String strD = nVar.d();
        this.t.setText(strD);
        this.t.setForeground(Color.WHITE);
        this.t.setToolTipText("<html>" + strD + ":<br>" + nVar.e() + "</html>");
        nVar.c();
        if (nVar.j() == null || ((rs.plugins.e) nVar.j().getClass().getAnnotation(rs.plugins.e.class)).k()) {
            this.u.setVisible(false);
        } else {
            this.u.a(nVar.i());
            this.u.setSelected(this.p.d(nVar.j()));
            this.u.addItemListener(itemEvent -> {
                if (this.u.isSelected()) {
                    this.n.c(nVar.j());
                } else {
                    this.n.d(nVar.j());
                }
            });
        }
        if (((rs.plugins.e) nVar.j().getClass().getAnnotation(rs.plugins.e.class)).l()) {
            this.u.setVisible(false);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(class_143 class_143Var, JButton jButton, JPanel jPanel) {
        boolean z = !jPanel.isVisible();
        jPanel.setVisible(z);
        jButton.setIcon(z ? c : a);
        jButton.setRolloverIcon(z ? d : b);
        jButton.setToolTipText(z ? "Retract" : "Expand");
        m.put(class_143Var, Boolean.valueOf(z));
        Objects.requireNonNull(jPanel);
        SwingUtilities.invokeLater(jPanel::revalidate);
    }

    private void b() {
        this.s.removeAll();
        class_134 class_134VarH = this.w.h();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap((class_140Var, class_140Var2) -> {
            return ag.a().a(class_140Var.c(), class_140Var2.c()).a(class_140Var.b(), class_140Var2.b()).b();
        });
        for (class_143 class_143Var : class_134VarH.b()) {
            class_142 class_142VarE = class_143Var.e();
            boolean zBooleanValue = m.getOrDefault(class_143Var, Boolean.valueOf(!class_142VarE.d())).booleanValue();
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new BoxLayout(jPanel, 1));
            jPanel.setMinimumSize(new Dimension(350, 0));
            JPanel jPanel2 = new JPanel();
            jPanel2.setLayout(new BorderLayout());
            jPanel2.setMinimumSize(new Dimension(350, 0));
            jPanel2.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, rs.gui.d.e), new EmptyBorder(0, 0, 3, 1)));
            jPanel.add(jPanel2, "North");
            JButton jButton = new JButton(zBooleanValue ? c : a);
            jButton.setRolloverIcon(zBooleanValue ? d : b);
            jButton.setPreferredSize(new Dimension(18, 0));
            jButton.setBorder(new EmptyBorder(0, 0, 0, 5));
            jButton.setToolTipText(zBooleanValue ? "Retract" : "Expand");
            M.a((AbstractButton) jButton);
            jPanel2.add(jButton, "West");
            String strA = class_142VarE.a();
            JLabel jLabel = new JLabel(strA);
            jLabel.setForeground(rs.gui.d.a);
            jLabel.setFont(rs.gui.w.c());
            jLabel.setToolTipText("<html>" + strA + ":<br>" + class_142VarE.b() + "</html>");
            jPanel2.add(jLabel, "Center");
            JPanel jPanel3 = new JPanel();
            jPanel3.setLayout(new rs.ui.j(0, 1, 0, 5));
            jPanel3.setMinimumSize(new Dimension(350, 0));
            jPanel3.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, rs.gui.d.e), new EmptyBorder(6, 0, 6, 0)));
            jPanel3.setVisible(zBooleanValue);
            jPanel.add(jPanel3, "South");
            b bVar = new b(this, class_143Var, jButton, jPanel3);
            jButton.addActionListener(actionEvent -> {
                a(class_143Var, jButton, jPanel3);
            });
            jLabel.addMouseListener(bVar);
            jPanel2.addMouseListener(bVar);
            map.put(class_143Var.d(), jPanel3);
            treeMap.put(class_143Var, jPanel);
        }
        for (class_138 class_138Var : class_134VarH.c()) {
            if (!class_138Var.d().e()) {
                JPanel jPanel4 = new JPanel();
                jPanel4.setLayout(new BorderLayout());
                jPanel4.setMinimumSize(new Dimension(350, 0));
                String strC = class_138Var.d().c();
                JLabel jLabel2 = new JLabel(strC);
                jLabel2.setForeground(Color.WHITE);
                String strD = class_138Var.d().d();
                if (!"".equals(strD)) {
                    jLabel2.setToolTipText("<html>" + strC + ":<br>" + strD + "</html>");
                }
                o.a(jLabel2, a(this.w, class_138Var));
                jPanel4.add(jLabel2, "Center");
                if (class_138Var.e() == Boolean.TYPE) {
                    jPanel4.add(a(class_134VarH, class_138Var), "East");
                } else if (class_138Var.e() == Integer.TYPE) {
                    jPanel4.add(b(class_134VarH, class_138Var), "East");
                } else if (class_138Var.e() == Double.TYPE) {
                    jPanel4.add(c(class_134VarH, class_138Var), "East");
                } else if (class_138Var.e() == String.class) {
                    jPanel4.add(d(class_134VarH, class_138Var), "South");
                } else if (class_138Var.e() == Color.class) {
                    jPanel4.add(e(class_134VarH, class_138Var), "East");
                } else if (class_138Var.e() == Dimension.class) {
                    jPanel4.add(f(class_134VarH, class_138Var), "East");
                } else if ((class_138Var.e() instanceof Class) && ((Class) class_138Var.e()).isEnum()) {
                    jPanel4.add(g(class_134VarH, class_138Var), "East");
                } else if (class_138Var.e() == l.class || class_138Var.e() == m.class) {
                    jPanel4.add(h(class_134VarH, class_138Var), "East");
                } else if ((class_138Var.e() instanceof ParameterizedType) && ((ParameterizedType) class_138Var.e()).getRawType() == Set.class) {
                    jPanel4.add(i(class_134VarH, class_138Var), "East");
                }
                JPanel jPanel5 = (JPanel) map.get(class_138Var.d().h());
                if (jPanel5 == null) {
                    treeMap.put(class_138Var, jPanel4);
                } else {
                    jPanel5.add(jPanel4);
                }
            }
        }
        Collection collectionValues = treeMap.values();
        h hVar = this.s;
        Objects.requireNonNull(hVar);
        collectionValues.forEach((v1) -> {
            r1.add(v1);
        });
        Component jButton2 = new JButton("Reset");
        jButton2.addActionListener(actionEvent2 -> {
            if (JOptionPane.showOptionDialog(jButton2, "Are you sure you want to reset this plugin's configuration?", "Are you sure?", 0, 2, (Icon) null, new String[]{"Yes", "No"}, "No") == 0) {
                this.o.a(this.w.g(), true);
                rs.s.a aVarJ = this.w.j();
                if (aVarJ != null) {
                    aVarJ.c();
                }
                b();
            }
        });
        this.s.add(jButton2);
        if (((rs.plugins.e) this.w.j().getClass().getAnnotation(rs.plugins.e.class)).k()) {
            this.v.setVisible(false);
        } else {
            Component jButton3 = new JButton("Back");
            jButton3.addActionListener(actionEvent3 -> {
                this.n.e().c();
            });
            this.s.add(jButton3);
            this.v.setVisible(true);
        }
        revalidate();
    }

    private JCheckBox a(class_134 class_134Var, class_138 class_138Var) {
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setBackground(rs.gui.d.f);
        jCheckBox.setSelected(Boolean.parseBoolean(this.o.a(class_134Var.a().a(), class_138Var.d().b())));
        jCheckBox.addActionListener(actionEvent -> {
            a((Component) jCheckBox, class_134Var, class_138Var);
        });
        return jCheckBox;
    }

    private JSpinner b(class_134 class_134Var, class_138 class_138Var) {
        int iIntValue = ((Integer) L.a((Integer) this.o.a(class_134Var.a().a(), class_138Var.d().b(), (Type) Integer.TYPE), 0)).intValue();
        class_145 class_145VarF = class_138Var.f();
        int iA = 0;
        int iB = Integer.MAX_VALUE;
        if (class_145VarF != null) {
            iA = class_145VarF.a();
            iB = class_145VarF.b();
        }
        JSpinner jSpinner = new JSpinner(new SpinnerNumberModel(com.google.a.m.l.a(iIntValue, iA, iB), iA, iB, 1));
        JFormattedTextField textField = jSpinner.getEditor().getTextField();
        textField.setColumns(6);
        jSpinner.addChangeListener(changeEvent -> {
            a((Component) jSpinner, class_134Var, class_138Var);
        });
        class_147 class_147VarH = class_138Var.h();
        if (class_147VarH != null) {
            textField.setFormatterFactory(new y(class_147VarH));
        }
        return jSpinner;
    }

    private JSpinner c(class_134 class_134Var, class_138 class_138Var) {
        JSpinner jSpinner = new JSpinner(new SpinnerNumberModel(((Double) L.a((Double) this.o.a(class_134Var.a().a(), class_138Var.d().b(), (Type) Double.TYPE), Double.valueOf(0.0d))).doubleValue(), 0.0d, Double.MAX_VALUE, 0.1d));
        jSpinner.getEditor().getTextField().setColumns(6);
        jSpinner.addChangeListener(changeEvent -> {
            a((Component) jSpinner, class_134Var, class_138Var);
        });
        return jSpinner;
    }

    private JTextComponent d(class_134 class_134Var, class_138 class_138Var) {
        JPasswordField jPasswordField;
        if (class_138Var.d().g()) {
            jPasswordField = new JPasswordField();
        } else {
            JPasswordField jTextArea = new JTextArea();
            jTextArea.setLineWrap(true);
            jTextArea.setWrapStyleWord(true);
            jPasswordField = jTextArea;
        }
        jPasswordField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPasswordField.setText(this.o.a(class_134Var.a().a(), class_138Var.d().b()));
        jPasswordField.addFocusListener(new c(this, jPasswordField, class_134Var, class_138Var));
        return jPasswordField;
    }

    private rs.ui.components.b e(class_134 class_134Var, class_138 class_138Var) {
        rs.ui.components.b bVar;
        Color color = (Color) this.o.a(class_134Var.a().a(), class_138Var.d().b(), (Type) Color.class);
        boolean z = class_138Var.g() == null;
        if (color == null) {
            bVar = new rs.ui.components.b("Pick a color", Color.BLACK);
        } else {
            bVar = new rs.ui.components.b("#" + (z ? class_9.c(color) : class_9.d(color)).toUpperCase(), color);
        }
        bVar.setFocusable(false);
        bVar.addMouseListener(new d(this, bVar, class_138Var, z, class_134Var));
        return bVar;
    }

    private JPanel f(class_134 class_134Var, class_138 class_138Var) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        Dimension dimension = (Dimension) L.a((Dimension) this.o.a(class_134Var.a().a(), class_138Var.d().b(), (Type) Dimension.class), new Dimension());
        int i = dimension.width;
        int i2 = dimension.height;
        JSpinner jSpinner = new JSpinner(new SpinnerNumberModel(i, 0, Integer.MAX_VALUE, 1));
        jSpinner.getEditor().getTextField().setColumns(4);
        JSpinner jSpinner2 = new JSpinner(new SpinnerNumberModel(i2, 0, Integer.MAX_VALUE, 1));
        jSpinner2.getEditor().getTextField().setColumns(4);
        ChangeListener changeListener = changeEvent -> {
            this.o.b(class_134Var.a().a(), class_138Var.d().b(), String.valueOf(jSpinner.getValue()) + "x" + String.valueOf(jSpinner2.getValue()));
        };
        jSpinner.addChangeListener(changeListener);
        jSpinner2.addChangeListener(changeListener);
        jPanel.add(jSpinner, "West");
        jPanel.add(new JLabel(" x "), "Center");
        jPanel.add(jSpinner2, "East");
        return jPanel;
    }

    private JComboBox<Enum<?>> g(class_134 class_134Var, class_138 class_138Var) {
        Class cls = (Class) class_138Var.e();
        JComboBox<Enum<?>> jComboBox = new JComboBox<>((Enum[]) cls.getEnumConstants());
        jComboBox.setRenderer(this.r);
        jComboBox.setPreferredSize(new Dimension(jComboBox.getPreferredSize().width, 25));
        jComboBox.setForeground(Color.WHITE);
        jComboBox.setFocusable(false);
        try {
            Enum enumValueOf = Enum.valueOf(cls, this.o.a(class_134Var.a().a(), class_138Var.d().b()));
            jComboBox.setSelectedItem(enumValueOf);
            jComboBox.setToolTipText(class_23.a(enumValueOf));
        } catch (IllegalArgumentException e2) {
            k.debug("invalid selected item", (Throwable) e2);
        }
        jComboBox.addItemListener(itemEvent -> {
            if (itemEvent.getStateChange() == 1) {
                a((Component) jComboBox, class_134Var, class_138Var);
                jComboBox.setToolTipText(class_23.a((Enum) jComboBox.getSelectedItem()));
            }
        });
        return jComboBox;
    }

    private i h(class_134 class_134Var, class_138 class_138Var) {
        i iVar = new i((l) this.o.a(class_134Var.a().a(), class_138Var.d().b(), class_138Var.e()), class_138Var.e() == m.class);
        iVar.addFocusListener(new e(this, iVar, class_134Var, class_138Var));
        return iVar;
    }

    private JList<Enum<?>> i(class_134 class_134Var, class_138 class_138Var) {
        ParameterizedType parameterizedType = (ParameterizedType) class_138Var.e();
        Class cls = (Class) parameterizedType.getActualTypeArguments()[0];
        Set set = (Set) this.o.a(class_134Var.a().a(), (String) null, class_138Var.d().b(), (Type) parameterizedType);
        JList<Enum<?>> jList = new JList<>((Enum[]) cls.getEnumConstants());
        jList.setCellRenderer(this.r);
        jList.setSelectionMode(2);
        jList.setLayoutOrientation(0);
        jList.setSelectedIndices(((Set) L.a(set, Collections.emptySet())).stream().mapToInt(obj -> {
            return org.apache.commons.a.d.a(cls.getEnumConstants(), obj);
        }).toArray());
        jList.addFocusListener(new f(this, jList, class_134Var, class_138Var));
        return jList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Component component, class_134 class_134Var, class_138 class_138Var) {
        class_137 class_137VarD = class_138Var.d();
        if (!as.c(class_137VarD.f()) && JOptionPane.showOptionDialog(component, class_137VarD.f(), "Are you sure?", 0, 2, (Icon) null, new String[]{"Yes", "No"}, "No") != 0) {
            b();
            return;
        }
        if (component instanceof JCheckBox) {
            this.o.b(class_134Var.a().a(), class_138Var.d().b(), ((JCheckBox) component).isSelected());
            return;
        }
        if (component instanceof JSpinner) {
            this.o.b(class_134Var.a().a(), class_138Var.d().b(), String.valueOf(((JSpinner) component).getValue()));
            return;
        }
        if (component instanceof JTextComponent) {
            this.o.b(class_134Var.a().a(), class_138Var.d().b(), ((JTextComponent) component).getText());
            return;
        }
        if (component instanceof rs.ui.components.apkg.q) {
            this.o.b(class_134Var.a().a(), class_138Var.d().b(), ((rs.ui.components.apkg.q) component).a().getRGB());
            return;
        }
        if (component instanceof JComboBox) {
            this.o.b(class_134Var.a().a(), class_138Var.d().b(), ((Enum) ((JComboBox) component).getSelectedItem()).name());
        } else if (component instanceof i) {
            this.o.a(class_134Var.a().a(), class_138Var.d().b(), ((i) component).a());
        } else if (component instanceof JList) {
            this.o.a(class_134Var.a().a(), class_138Var.d().b(), fR.b(((JList) component).getSelectedValuesList()));
        }
    }

    @Override // rs.ui.m
    public Dimension getPreferredSize() {
        return new Dimension(367, super.getPreferredSize().height);
    }

    private JMenuItem a(n nVar, class_138 class_138Var) {
        JMenuItem jMenuItem = new JMenuItem("Reset");
        jMenuItem.addActionListener(actionEvent -> {
            this.o.b(nVar.h().a().a(), class_138Var.d().b());
            this.o.a(nVar.g(), false);
            b();
        });
        return jMenuItem;
    }

    static {
        g = !a.class.desiredAssertionStatus();
        k = LoggerFactory.getLogger((Class<?>) a.class);
        m = new HashMap();
        BufferedImage bufferedImageB = class_12.b((Class<?>) a.class, "config_back_icon.png");
        e = new ImageIcon(bufferedImageB);
        f = new ImageIcon(class_12.a((Image) bufferedImageB, -100));
        BufferedImage bufferedImageB2 = class_12.b((Image) class_12.b((Class<?>) a.class, "/util/arrow_right.png"), -121);
        a = new ImageIcon(bufferedImageB2);
        b = new ImageIcon(class_12.a((Image) bufferedImageB2, -100));
        BufferedImage bufferedImageA = class_12.a(bufferedImageB2, 1.5707963267948966d);
        c = new ImageIcon(bufferedImageA);
        d = new ImageIcon(class_12.a((Image) bufferedImageA, -100));
    }
}
