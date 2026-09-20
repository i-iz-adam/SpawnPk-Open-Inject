package rs.p_s.p_b;

import com.google.a.b.L;
import com.google.a.b.as;
import com.google.a.d.ag;
import com.google.a.d.fR;
import com.google.a.m.l;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.inject.Inject;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;
import org.apache.commons.a.d;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_gui.C_M_uc;

public class C_a extends rs.p_ui.C_m {
   private static final Logger k = LoggerFactory.getLogger(C_a.class);
   private static final int l = 6;
   public static final ImageIcon a;
   public static final ImageIcon b;
   public static final ImageIcon c;
   public static final ImageIcon d;
   static final ImageIcon e;
   static final ImageIcon f;
   private static final Map<rs.p_e.C_m, Boolean> m = new HashMap<>();
   private final C_q n;
   private final rs.p_e.C_i o;
   private final rs.p_s.C_g p;
   private final rs.p_ui.p_components.p_a.C_d q;
   private final ListCellRenderer<Enum<?>> r = new rs.p_ui.p_components.C_c<>();
   private final C_h s;
   private final JLabel t;
   private final C_u u;
   private final JButton v;
   private C_n w = null;

   @Inject
   private C_a(C_q var1, rs.p_e.C_i var2, rs.p_s.C_g var3, rs.p_ui.p_components.p_a.C_d var4) {
      super(false);
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.q = var4;
      this.setLayout(new BorderLayout());
      this.setBackground(rs.p_gui.C_d.d);
      JPanel var5 = new JPanel();
      var5.setBorder(new EmptyBorder(10, 10, 10, 10));
      var5.setLayout(new BorderLayout(0, 6));
      this.add(var5, "North");
      this.s = new C_h();
      this.s.setBorder(new EmptyBorder(8, 10, 10, 10));
      this.s.setLayout(new rs.p_ui.C_j(0, 1, 0, 5));
      this.s.setAlignmentX(0.0F);
      C_h var6 = new C_h();
      var6.setLayout(new BorderLayout());
      var6.add(this.s, "North");
      JScrollPane var7 = new JScrollPane(var6);
      var7.setHorizontalScrollBarPolicy(31);
      var7.getVerticalScrollBar().setUnitIncrement(8);
      this.add(var7, "Center");
      this.v = new JButton(e);
      this.v.setRolloverIcon(f);
      C_M_uc.a(this.v);
      this.v.setPreferredSize(new Dimension(22, 0));
      this.v.setBorder(new EmptyBorder(0, 0, 0, 5));
      this.v.addActionListener(var1x -> var1.e().c());
      this.v.setToolTipText("Back");
      var5.add(this.v, "West");
      this.u = new C_u();
      var5.add(this.u, "East");
      this.t = new JLabel();
      this.t.setForeground(Color.WHITE);
      var5.add(this.t);
   }

   void a(C_n var1) {
      assert this.w == null;

      this.w = var1;
      String var2 = var1.d();
      this.t.setText(var2);
      this.t.setForeground(Color.WHITE);
      this.t.setToolTipText("<html>" + var2 + ":<br>" + var1.e() + "</html>");
      String var3 = var1.c();
      Object var4 = null;
      if (var1.j() != null && !var1.j().getClass().getAnnotation(rs.p_s.C_e.class).k()) {
         this.u.a(var1.i());
         this.u.setSelected(this.p.d(var1.j()));
         this.u.addItemListener(var2x -> {
            if (this.u.isSelected()) {
               this.n.c(var1.j());
            } else {
               this.n.d(var1.j());
            }
         });
      } else {
         this.u.setVisible(false);
      }

      if (var1.j().getClass().getAnnotation(rs.p_s.C_e.class).l()) {
         this.u.setVisible(false);
      }

      this.b();
   }

   private void a(rs.p_e.C_m var1, JButton var2, JPanel var3) {
      boolean var4 = !var3.isVisible();
      var3.setVisible(var4);
      var2.setIcon(var4 ? c : a);
      var2.setRolloverIcon(var4 ? d : b);
      var2.setToolTipText(var4 ? "Retract" : "Expand");
      m.put(var1, var4);
      SwingUtilities.invokeLater(var3::revalidate);
   }

   private void b() {
      this.s.removeAll();
      rs.p_e.C_d var1 = this.w.h();
      HashMap var2 = new HashMap();
      TreeMap var3 = new TreeMap<>((var0, var1x) -> ag.a().a(var0.c(), var1x.c()).a(var0.b(), var1x.b()).b());

      for (rs.p_e.C_m var5 : var1.b()) {
         rs.p_e.C_l var6 = var5.e();
         boolean var7 = m.getOrDefault(var5, !var6.d());
         JPanel var8 = new JPanel();
         var8.setLayout(new BoxLayout(var8, 1));
         var8.setMinimumSize(new Dimension(350, 0));
         JPanel var9 = new JPanel();
         var9.setLayout(new BorderLayout());
         var9.setMinimumSize(new Dimension(350, 0));
         var9.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, rs.p_gui.C_d.e), new EmptyBorder(0, 0, 3, 1)));
         var8.add(var9, "North");
         JButton var10 = new JButton(var7 ? c : a);
         var10.setRolloverIcon(var7 ? d : b);
         var10.setPreferredSize(new Dimension(18, 0));
         var10.setBorder(new EmptyBorder(0, 0, 0, 5));
         var10.setToolTipText(var7 ? "Retract" : "Expand");
         C_M_uc.a(var10);
         var9.add(var10, "West");
         String var11 = var6.a();
         JLabel var12 = new JLabel(var11);
         var12.setForeground(rs.p_gui.C_d.a);
         var12.setFont(rs.p_gui.C_w.c());
         var12.setToolTipText("<html>" + var11 + ":<br>" + var6.b() + "</html>");
         var9.add(var12, "Center");
         JPanel var13 = new JPanel();
         var13.setLayout(new rs.p_ui.C_j(0, 1, 0, 5));
         var13.setMinimumSize(new Dimension(350, 0));
         var13.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, rs.p_gui.C_d.e), new EmptyBorder(6, 0, 6, 0)));
         var13.setVisible(var7);
         var8.add(var13, "South");
         C_b var14 = new C_b(this, var5, var10, var13);
         var10.addActionListener(var4 -> this.a(var5, var10, var13));
         var12.addMouseListener(var14);
         var9.addMouseListener(var14);
         var2.put(var5.d(), var13);
         var3.put(var5, var8);
      }

      for (rs.p_e.C_h var17 : var1.c()) {
         if (!var17.d().e()) {
            JPanel var19 = new JPanel();
            var19.setLayout(new BorderLayout());
            var19.setMinimumSize(new Dimension(350, 0));
            String var20 = var17.d().c();
            JLabel var21 = new JLabel(var20);
            var21.setForeground(Color.WHITE);
            String var22 = var17.d().d();
            if (!"".equals(var22)) {
               var21.setToolTipText("<html>" + var20 + ":<br>" + var22 + "</html>");
            }

            C_o.a(var21, this.a(this.w, var17));
            var19.add(var21, "Center");
            if (var17.e() == boolean.class) {
               var19.add(this.a(var1, var17), "East");
            } else if (var17.e() == int.class) {
               var19.add(this.b(var1, var17), "East");
            } else if (var17.e() == double.class) {
               var19.add(this.c(var1, var17), "East");
            } else if (var17.e() == String.class) {
               var19.add(this.d(var1, var17), "South");
            } else if (var17.e() == Color.class) {
               var19.add(this.e(var1, var17), "East");
            } else if (var17.e() == Dimension.class) {
               var19.add(this.f(var1, var17), "East");
            } else if (var17.e() instanceof Class && ((Class)var17.e()).isEnum()) {
               var19.add(this.g(var1, var17), "East");
            } else if (var17.e() == C_l.class || var17.e() == C_m.class) {
               var19.add(this.h(var1, var17), "East");
            } else if (var17.e() instanceof ParameterizedType) {
               ParameterizedType var23 = (ParameterizedType)var17.e();
               if (var23.getRawType() == Set.class) {
                  var19.add(this.i(var1, var17), "East");
               }
            }

            JPanel var24 = (JPanel)var2.get(var17.d().h());
            if (var24 == null) {
               var3.put(var17, var19);
            } else {
               var24.add(var19);
            }
         }
      }

      var3.values().forEach(this.s::add);
      JButton var16 = new JButton("Reset");
      var16.addActionListener(
         var2x -> {
            int var3x = JOptionPane.showOptionDialog(
               var16, "Are you sure you want to reset this plugin's configuration?", "Are you sure?", 0, 2, null, new String[]{"Yes", "No"}, "No"
            );
            if (var3x == 0) {
               this.o.a(this.w.g(), true);
               rs.p_s.C_a var4 = this.w.j();
               if (var4 != null) {
                  var4.c();
               }

               this.b();
            }
         }
      );
      this.s.add(var16);
      if (!this.w.j().getClass().getAnnotation(rs.p_s.C_e.class).k()) {
         JButton var18 = new JButton("Back");
         var18.addActionListener(var1x -> this.n.e().c());
         this.s.add(var18);
         this.v.setVisible(true);
      } else {
         this.v.setVisible(false);
      }

      this.revalidate();
   }

   private JCheckBox a(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      JCheckBox var3 = new JCheckBox();
      var3.setBackground(rs.p_gui.C_d.f);
      var3.setSelected(Boolean.parseBoolean(this.o.a(var1.a().a(), var2.d().b())));
      var3.addActionListener(var4 -> this.a(var3, var1, var2));
      return var3;
   }

   private JSpinner b(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      int var3 = (Integer)L.a((Integer)this.o.a(var1.a().a(), var2.d().b(), int.class), 0);
      rs.p_e.C_o var4 = var2.f();
      int var5 = 0;
      int var6 = Integer.MAX_VALUE;
      if (var4 != null) {
         var5 = var4.a();
         var6 = var4.b();
      }

      var3 = com.google.a.m.l.a(var3, var5, var6);
      SpinnerNumberModel var7 = new SpinnerNumberModel(var3, var5, var6, 1);
      JSpinner var8 = new JSpinner(var7);
      JComponent var9 = var8.getEditor();
      JFormattedTextField var10 = ((DefaultEditor)var9).getTextField();
      var10.setColumns(6);
      var8.addChangeListener(var4x -> this.a(var8, var1, var2));
      rs.p_e.C_q var11 = var2.h();
      if (var11 != null) {
         var10.setFormatterFactory(new C_y(var11));
      }

      return var8;
   }

   private JSpinner c(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      double var3 = (Double)L.a((Double)this.o.a(var1.a().a(), var2.d().b(), double.class), 0.0);
      SpinnerNumberModel var5 = new SpinnerNumberModel(var3, 0.0, Double.MAX_VALUE, 0.1);
      JSpinner var6 = new JSpinner(var5);
      JComponent var7 = var6.getEditor();
      JFormattedTextField var8 = ((DefaultEditor)var7).getTextField();
      var8.setColumns(6);
      var6.addChangeListener(var4 -> this.a(var6, var1, var2));
      return var6;
   }

   private JTextComponent d(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      Object var3;
      if (var2.d().g()) {
         var3 = new JPasswordField();
      } else {
         JTextArea var4 = new JTextArea();
         var4.setLineWrap(true);
         var4.setWrapStyleWord(true);
         var3 = var4;
      }

      var3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      var3.setText(this.o.a(var1.a().a(), var2.d().b()));
      var3.addFocusListener(new C_c(this, (JTextComponent)var3, var1, var2));
      return (JTextComponent)var3;
   }

   private rs.p_ui.p_components.C_b e(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      Color var3 = this.o.a(var1.a().a(), var2.d().b(), Color.class);
      boolean var5 = var2.g() == null;
      rs.p_ui.p_components.C_b var4;
      if (var3 == null) {
         var4 = new rs.p_ui.p_components.C_b("Pick a color", Color.BLACK);
      } else {
         String var6 = "#" + (var5 ? rs.p_A_uc.C_g.c(var3) : rs.p_A_uc.C_g.d(var3)).toUpperCase();
         var4 = new rs.p_ui.p_components.C_b(var6, var3);
      }

      var4.setFocusable(false);
      var4.addMouseListener(new C_d(this, var4, var2, var5, var1));
      return var4;
   }

   private JPanel f(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      JPanel var3 = new JPanel();
      var3.setLayout(new BorderLayout());
      Dimension var4 = (Dimension)L.a((Dimension)this.o.a(var1.a().a(), var2.d().b(), Dimension.class), new Dimension());
      int var5 = var4.width;
      int var6 = var4.height;
      SpinnerNumberModel var7 = new SpinnerNumberModel(var5, 0, Integer.MAX_VALUE, 1);
      JSpinner var8 = new JSpinner(var7);
      JComponent var9 = var8.getEditor();
      JFormattedTextField var10 = ((DefaultEditor)var9).getTextField();
      var10.setColumns(4);
      SpinnerNumberModel var11 = new SpinnerNumberModel(var6, 0, Integer.MAX_VALUE, 1);
      JSpinner var12 = new JSpinner(var11);
      JComponent var13 = var12.getEditor();
      JFormattedTextField var14 = ((DefaultEditor)var13).getTextField();
      var14.setColumns(4);
      ChangeListener var15 = var5x -> this.o.b(var1.a().a(), var2.d().b(), var8.getValue() + "x" + var12.getValue());
      var8.addChangeListener(var15);
      var12.addChangeListener(var15);
      var3.add(var8, "West");
      var3.add(new JLabel(" x "), "Center");
      var3.add(var12, "East");
      return var3;
   }

   private JComboBox<Enum<?>> g(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      Class var3 = (Class)var2.e();
      JComboBox var4 = new JComboBox<>((Enum[])var3.getEnumConstants());
      var4.setRenderer(this.r);
      var4.setPreferredSize(new Dimension(var4.getPreferredSize().width, 25));
      var4.setForeground(Color.WHITE);
      var4.setFocusable(false);

      try {
         Enum var5 = Enum.valueOf(var3, this.o.a(var1.a().a(), var2.d().b()));
         var4.setSelectedItem(var5);
         var4.setToolTipText(rs.p_A_uc.C_s.a(var5));
      } catch (IllegalArgumentException var6) {
         k.debug("invalid selected item", var6);
      }

      var4.addItemListener(var4x -> {
         if (var4x.getStateChange() == 1) {
            this.a(var4, var1, var2);
            var4.setToolTipText(rs.p_A_uc.C_s.a((Enum)var4.getSelectedItem()));
         }
      });
      return var4;
   }

   private C_i h(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      C_l var3 = this.o.a(var1.a().a(), var2.d().b(), (Class)var2.e());
      C_i var4 = new C_i(var3, var2.e() == C_m.class);
      var4.addFocusListener(new C_e(this, var4, var1, var2));
      return var4;
   }

   private JList<Enum<?>> i(rs.p_e.C_d var1, rs.p_e.C_h var2) {
      ParameterizedType var3 = (ParameterizedType)var2.e();
      Class var4 = (Class)var3.getActualTypeArguments()[0];
      Set var5 = this.o.a(var1.a().a(), null, var2.d().b(), var3);
      JList var6 = new JList<>((Enum[])var4.getEnumConstants());
      var6.setCellRenderer(this.r);
      var6.setSelectionMode(2);
      var6.setLayoutOrientation(0);
      var6.setSelectedIndices(
         ((Set)L.a(var5, Collections.emptySet())).stream().mapToInt(var1x -> org.apache.commons.a.d.a(var4.getEnumConstants(), var1x)).toArray()
      );
      var6.addFocusListener(new C_f(this, var6, var1, var2));
      return var6;
   }

   private void a(Component var1, rs.p_e.C_d var2, rs.p_e.C_h var3) {
      rs.p_e.C_g var4 = var3.d();
      if (!as.c(var4.f())) {
         int var5 = JOptionPane.showOptionDialog(var1, var4.f(), "Are you sure?", 0, 2, null, new String[]{"Yes", "No"}, "No");
         if (var5 != 0) {
            this.b();
            return;
         }
      }

      if (var1 instanceof JCheckBox) {
         JCheckBox var7 = (JCheckBox)var1;
         this.o.b(var2.a().a(), var3.d().b(), var7.isSelected() + "");
      } else if (var1 instanceof JSpinner) {
         JSpinner var8 = (JSpinner)var1;
         this.o.b(var2.a().a(), var3.d().b(), var8.getValue() + "");
      } else if (var1 instanceof JTextComponent) {
         JTextComponent var9 = (JTextComponent)var1;
         this.o.b(var2.a().a(), var3.d().b(), var9.getText());
      } else if (var1 instanceof rs.p_ui.p_components.p_a.C_q) {
         rs.p_ui.p_components.p_a.C_q var10 = (rs.p_ui.p_components.p_a.C_q)var1;
         this.o.b(var2.a().a(), var3.d().b(), var10.a().getRGB() + "");
      } else if (var1 instanceof JComboBox) {
         JComboBox var11 = (JComboBox)var1;
         this.o.b(var2.a().a(), var3.d().b(), ((Enum)var11.getSelectedItem()).name());
      } else if (var1 instanceof C_i) {
         C_i var12 = (C_i)var1;
         this.o.a(var2.a().a(), var3.d().b(), var12.a());
      } else if (var1 instanceof JList) {
         JList var13 = (JList)var1;
         List var6 = var13.getSelectedValuesList();
         this.o.a(var2.a().a(), var3.d().b(), fR.b(var6));
      }
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(367, super.getPreferredSize().height);
   }

   private JMenuItem a(C_n var1, rs.p_e.C_h var2) {
      JMenuItem var3 = new JMenuItem("Reset");
      var3.addActionListener(var3x -> {
         rs.p_e.C_d var4 = var1.h();
         rs.p_e.C_e var5 = var4.a();
         rs.p_e.C_g var6 = var2.d();
         this.o.b(var5.a(), var6.b());
         this.o.a(var1.g(), false);
         this.b();
      });
      return var3;
   }

   static {
      BufferedImage var0 = rs.p_A_uc.C_j.b(C_a.class, "config_back_icon.png");
      e = new ImageIcon(var0);
      f = new ImageIcon(rs.p_A_uc.C_j.a(var0, -100));
      BufferedImage var1 = rs.p_A_uc.C_j.b(C_a.class, "/util/arrow_right.png");
      var1 = rs.p_A_uc.C_j.b(var1, -121);
      a = new ImageIcon(var1);
      b = new ImageIcon(rs.p_A_uc.C_j.a(var1, -100));
      BufferedImage var2 = rs.p_A_uc.C_j.a(var1, Math.PI / 2);
      c = new ImageIcon(var2);
      d = new ImageIcon(rs.p_A_uc.C_j.a(var2, -100));
   }
}
