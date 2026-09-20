package rs.p_l.p_f.p_b;

import java.awt.Polygon;
import rs.C_Client_mc;
import rs.p_a.C_h;
import rs.p_a.C_j;
import rs.p_runelite.p_a.C_m;

public abstract class C_b extends rs.p_l.p_f.C_b {
   protected C_j e;
   protected rs.p_d.C_d f;
   protected C_h g;
   protected int h;

   public void a(C_j var1) {
      this.e = var1;
      this.f = var1.aG;
   }

   @Override
   public void b() {
      this.e = null;
      this.f = null;
   }

   public C_m l() {
      return this.g.a(this.e.ac, this.e.ad, this.e.ae, this.e.as + C_Client_mc.cK);
   }

   public Polygon m() {
      return this.g.b(this.e.ac, this.e.ad, this.e.as + C_Client_mc.cK, this.e.ae);
   }

   public C_j n() {
      return this.e;
   }

   public rs.p_d.C_d o() {
      return this.f;
   }

   public C_h p() {
      return this.g;
   }

   public void a(C_h var1) {
      this.g = var1;
   }

   public int q() {
      return this.h;
   }

   public void b(int var1) {
      this.h = var1;
   }
}
