package rs.p_l.p_f.p_a.p_g;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import rs.p_l.p_f.C_g;
import rs.p_l.p_f.C_l;

public class C_c extends C_g {
   private static final Dimension t = new Dimension(504, 20);
   public static int r;
   public static int s;

   public C_c() {
      this.a(rs.p_l.p_f.C_a.o);
      this.d(true);
      this.a("RaidTheatreBar");
      this.a(t);
      this.a(C_l.d);
      this.c(false);
      this.b(new Point(-1, -6));
      this.a(t);
   }

   @Override
   public Dimension a(Graphics2D var1) {
      s = var1.getClipBounds().y;
      r = var1.getClipBounds().x;
      return t;
   }
}
