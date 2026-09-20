package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class C_v extends C_f {
   private int a;
   private int b;
   private List<Integer> c = Collections.emptyList();
   private final JLabel d = new rs.p_ui.p_components.p_shadowlabel.C_a();
   private final JLabel e = new rs.p_ui.p_components.p_shadowlabel.C_a();
   private final JLabel f = new rs.p_ui.p_components.p_shadowlabel.C_a();
   private String g = "";
   private String h = "";

   public C_v() {
      this.setLayout(new GridLayout(1, 3));
      this.setBackground(Color.GREEN.darker());
      this.setForeground(Color.GREEN.brighter());
      this.setPreferredSize(new Dimension(100, 16));
      this.d.setFont(rs.p_gui.C_w.b());
      this.d.setForeground(Color.WHITE);
      this.d.setBorder(new EmptyBorder(2, 5, 0, 0));
      this.e.setFont(rs.p_gui.C_w.b());
      this.e.setForeground(Color.WHITE);
      this.e.setHorizontalAlignment(4);
      this.e.setBorder(new EmptyBorder(2, 0, 0, 5));
      this.f.setFont(rs.p_gui.C_w.b());
      this.f.setForeground(Color.WHITE);
      this.f.setHorizontalAlignment(0);
      this.f.setBorder(new EmptyBorder(2, 0, 0, 0));
      this.add(this.d);
      this.add(this.f);
      this.add(this.e);
   }

   @Override
   public void paint(Graphics var1) {
      int var2 = this.b();
      int var3 = (int)((float)this.getSize().width * ((float)var2 / 100.0F));
      super.paint(var1);
      var1.setColor(this.getForeground());
      var1.fillRect(0, 0, var3, 16);

      for (Integer var5 : this.c) {
         int var6 = this.getSize().width * var5 / this.a;
         if (var6 > var3) {
            var1.fillRect(var6, 0, 1, 16);
         }
      }

      super.paintComponents(var1);
   }

   @Override
   public void a(boolean var1) {
      super.a(var1);
      if (var1) {
         this.d.setForeground(Color.GRAY);
         this.e.setForeground(Color.GRAY);
         this.f.setText(this.h);
      } else {
         this.d.setForeground(Color.WHITE);
         this.e.setForeground(Color.WHITE);
         this.f.setText(this.g);
      }
   }

   public void a(String var1) {
      this.d.setText(var1);
   }

   public void b(String var1) {
      this.e.setText(var1);
   }

   public void c(String var1) {
      this.g = var1;
      this.f.setText(this.a() ? this.h : var1);
   }

   public void d(String var1) {
      this.h = var1;
      this.f.setText(this.a() ? var1 : this.g);
   }

   public int b() {
      return this.a == 0 ? 0 : this.b * 100 / this.a;
   }

   public void a(int var1) {
      this.a = var1;
      this.repaint();
   }

   public void b(int var1) {
      this.b = var1;
      this.repaint();
   }

   public void a(List<Integer> var1) {
      this.c = var1;
      this.repaint();
   }
}
