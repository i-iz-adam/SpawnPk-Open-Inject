package rs.p_s.p_q.p_b;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import rs.p_A_uc.C_j;
import rs.p_gui.C_d;

public class C_a extends JPanel {
   private static final SimpleDateFormat t = new SimpleDateFormat("HH:mm:ss 'on' yyyy/MM/dd");
   private static final Border u = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, C_d.d), new EmptyBorder(4, 6, 4, 6));
   private static final Border v = BorderFactory.createCompoundBorder(
      BorderFactory.createMatteBorder(0, 0, 4, 0, C_d.d),
      BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(C_d.g), new EmptyBorder(3, 5, 3, 5))
   );
   static ImageIcon a;
   static ImageIcon b;
   static ImageIcon c;
   static ImageIcon d;
   static ImageIcon e;
   rs.p_s.p_q.p_a.C_a f;
   JPanel g;
   JPanel h;
   JLabel i;
   JLabel j;
   JPanel k;
   JLabel l;
   JLabel m;
   JPanel n;
   JLabel o;
   JLabel p;
   JPanel q;
   JLabel r;
   JLabel s;

   public C_a(rs.p_s.p_q.p_a.C_a var1) {
      if (a == null) {
         a = new ImageIcon(C_j.b(rs.p_s.p_q.C_d.class, "ico_skull.png"));
         b = new ImageIcon(C_j.b(rs.p_s.p_q.C_d.class, "ico_user.png").getScaledInstance(14, 14, 1));
         e = new ImageIcon(C_j.b(rs.p_s.p_q.C_d.class, "ico_damage.png").getScaledInstance(14, 14, 1));
         c = new ImageIcon(C_j.b(rs.p_s.p_q.C_d.class, "ico_magic.png").getScaledInstance(14, 14, 1));
         d = new ImageIcon(C_j.b(rs.p_s.p_q.C_d.class, "ico_pray.png"));
      }

      this.f = var1;
      this.setLayout(new BorderLayout(5, 0));
      this.setBackground(C_d.c);
      this.setBorder(u);
      this.g = new JPanel();
      this.g.setLayout(new BoxLayout(this.g, 1));
      this.g.setBackground(null);
      this.h = new JPanel();
      this.h.setLayout(new BorderLayout());
      this.h.setBackground(C_d.g);
      this.i = new JLabel();
      this.h.add(this.i, "West");
      this.j = new JLabel();
      this.h.add(this.j, "East");
      this.k = new JPanel();
      this.k.setLayout(new BorderLayout());
      this.k.setBackground(null);
      this.l = new JLabel();
      this.k.add(this.l, "West");
      this.m = new JLabel();
      this.k.add(this.m, "East");
      this.n = new JPanel();
      this.n.setLayout(new BorderLayout());
      this.n.setBackground(null);
      this.o = new JLabel();
      this.n.add(this.o, "West");
      this.p = new JLabel();
      this.n.add(this.p, "East");
      this.q = new JPanel();
      this.q.setLayout(new BorderLayout());
      this.q.setBackground(null);
      this.r = new JLabel();
      this.q.add(this.r, "West");
      this.s = new JLabel();
      this.q.add(this.s, "East");
      this.a();
      this.g.add(this.h);
      this.g.add(this.k);
      this.g.add(this.n);
      this.g.add(this.q);
      this.add(this.g, "North");
      this.setMaximumSize(new Dimension(350, (int)this.getPreferredSize().getHeight()));
   }

   public void a() {
      this.i.setIcon(this.f.d().j() ? a : b);
      this.i.setText(this.f.d().k());
      this.i.setForeground(this.f.d().j() ? Color.RED : C_d.n);
      this.j.setIcon(this.f.e().j() ? a : b);
      this.j.setText(this.f.e().k());
      this.j.setForeground(this.f.e().j() ? Color.RED : C_d.n);
      this.l.setIcon(d);
      this.l.setText(this.f.d().c());
      this.l.setForeground(this.f.a() ? Color.GREEN : Color.WHITE);
      this.m.setIcon(d);
      this.m.setText(this.f.e().c());
      this.m.setForeground(!this.f.a() ? Color.GREEN : Color.WHITE);
      this.o.setIcon(c);
      this.o.setText(this.f.d().d());
      this.o.setForeground(this.f.b() ? Color.GREEN : Color.WHITE);
      this.p.setIcon(c);
      this.p.setText(this.f.e().d());
      this.p.setForeground(!this.f.b() ? Color.GREEN : Color.WHITE);
      this.r.setIcon(e);
      this.r.setText(this.f.d().b(this.f.e().g()));
      this.r.setToolTipText(this.f.d().k() + " dealt " + this.f.d().g() + " damage (" + (this.f.d().g() - this.f.e().g()) + " vs opponent)");
      this.r.setForeground(this.f.d().g() > this.f.e().g() ? Color.GREEN : Color.WHITE);
      this.s.setIcon(e);
      this.s.setText(this.f.e().b(this.f.d().g()));
      this.s.setToolTipText(this.f.e().k() + " dealt " + this.f.e().g() + " damage (" + (this.f.e().g() - this.f.d().g()) + " vs opponent)");
      this.s.setForeground(this.f.e().g() > this.f.e().g() ? Color.GREEN : Color.WHITE);
   }

   public rs.p_s.p_q.p_a.C_a b() {
      return this.f;
   }

   public void a(rs.p_s.p_q.p_a.C_a var1) {
      this.f = var1;
   }
}
