package rs.p_l.p_e;

import java.awt.Color;
import java.awt.Polygon;

public class C_j {
   public Polygon a;
   public Object b;
   public Color c;
   public Color d;
   public Color e = new Color(0, 0, 0, 50);
   public Color f = new Color(0, 0, 0, 50);
   public boolean g;
   public int h;

   public C_j(Object var1, Polygon var2, Color var3, Color var4, int var5) {
      this.a = var2;
      this.c = var3;
      this.d = var4;
      this.h = var5;
      this.b = var1;
   }

   public Color a() {
      return this.g ? this.d : this.c;
   }

   public Color b() {
      return this.g ? this.f : this.e;
   }
}
