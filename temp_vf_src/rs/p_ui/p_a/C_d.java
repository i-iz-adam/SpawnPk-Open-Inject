package rs.p_ui.p_a;

import com.google.a.b.as;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import rs.p_gui.C_w;
import rs.p_ui.p_components.C_q;
import rs.p_ui.p_components.C_x;

public class C_d implements C_q {
   private static final int a = 3;
   private static final int b = 32;
   private String c;
   private final Rectangle d = new Rectangle();
   private Point e = new Point();
   private Dimension f = new Dimension(32, 32);
   private String g;
   private Color h = Color.WHITE;
   private Font i;
   private boolean j;
   private Color k = rs.p_ui.p_components.C_d.c;
   private BufferedImage l;
   private C_c m;

   @Override
   public Dimension a(Graphics2D var1) {
      if (this.l == null) {
         return new Dimension();
      } else {
         var1.setFont(this.d() < 32 ? C_w.b() : this.i);
         int var2 = this.e.x;
         int var3 = this.e.y;
         FontMetrics var4 = var1.getFontMetrics();
         int var5 = this.d();
         Rectangle var6 = new Rectangle(var2, var3, var5, var5);
         rs.p_ui.p_components.C_a var7 = new rs.p_ui.p_components.C_a();
         var7.a(this.k);
         var7.a(var6);
         var7.a(var1);
         var1.drawImage(this.l, var2 + (var5 - this.l.getWidth(null)) / 2, var3 + (var5 - this.l.getHeight(null)) / 2, null);
         if (!as.c(this.g)) {
            C_x var8 = new C_x();
            var8.a(this.h);
            var8.a(this.j);
            var8.a(this.g);
            var8.a(new Point(var2 + (var5 - var4.stringWidth(this.g)) / 2, var3 + var5 - 3));
            var8.a(var1);
         }

         this.d.setBounds(var6);
         return var6.getSize();
      }
   }

   private int d() {
      return Math.max(this.f.width, this.f.height);
   }

   public void a(String var1) {
      this.c = var1;
   }

   @Override
   public void a(Point var1) {
      this.e = var1;
   }

   @Override
   public void a(Dimension var1) {
      this.f = var1;
   }

   public void b(String var1) {
      this.g = var1;
   }

   public void a(Color var1) {
      this.h = var1;
   }

   public void a(Font var1) {
      this.i = var1;
   }

   public void a(boolean var1) {
      this.j = var1;
   }

   public void b(Color var1) {
      this.k = var1;
   }

   public void a(BufferedImage var1) {
      this.l = var1;
   }

   public void a(C_c var1) {
      this.m = var1;
   }

   public String b() {
      return this.c;
   }

   @Override
   public Rectangle a() {
      return this.d;
   }

   public C_c c() {
      return this.m;
   }
}
