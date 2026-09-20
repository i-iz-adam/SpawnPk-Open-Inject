package rs.p_l.p_f.p_a.p_d;

import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import p_gnu.p_trove.p_f.p_b.C_bU_mc;
import p_gnu.p_trove.p_i.p_a.C_i;

public abstract class C_b extends rs.p_l.p_f.p_b.C_a {
   protected HashSet<Integer> e;
   protected boolean f;
   protected boolean g;
   protected HashSet<Integer> h = new HashSet<>();
   protected C_i i;
   protected C_i j;
   protected C_i k;

   public C_b() {
      this.e = new HashSet<>();
      this.i = new C_i();
      this.k = new C_i();
      this.j = new C_i();
   }

   public abstract int[] k();

   public abstract rs.p_a.p_b.C_c l();

   @Override
   public void a() {
      if (this.l != null && this.l.ar != null) {
         boolean var1 = this.h.size() == 0;
         if (var1) {
            this.s();
         }

         for (int var2 = 0; var2 < this.l.ah; var2++) {
            if (!this.g || !this.i.a_(this.l.ar[var2])) {
               if (var1) {
                  this.h.add(this.l.ar[var2]);
               }

               this.a(var2, this.l.ar);
            }
         }

         if (var1) {
            this.n();
         }
      }
   }

   public void b(boolean var1) {
      this.g = var1;
      this.p();
   }

   public void a(Object var1, boolean var2) {
   }

   protected void n() {
      SwingUtilities.invokeLater(() -> {
         for (Integer var2 : this.h) {
            if (this.j.a_(var2)) {
               this.q().addElement(var2 + " (texture)");
            } else if (this.k.a_(var2)) {
               this.q().addElement(var2 + " (texturized)");
            } else if (this.i.a_(var2)) {
               this.q().addElement(var2 + " (recolored)");
            } else {
               this.q().addElement(var2 + "");
            }
         }

         rs.p_s.p_c.C_c.b.g().ensureIndexIsVisible(this.h.size());
      });
   }

   protected void o() {
      this.p();
      this.i.clear();
      this.e.clear();
   }

   protected void p() {
      this.i.clear();
      this.h.clear();
      if (this.q().getSize() > 0) {
         SwingUtilities.invokeLater(() -> this.q().removeAllElements());
      }
   }

   protected DefaultListModel q() {
      return (DefaultListModel)rs.p_s.p_c.C_c.b.g().getModel();
   }

   protected rs.p_s.p_c.C_d r() {
      return rs.p_s.p_c.C_c.b;
   }

   private void a(int var1, int[] var2) {
      if (this.e.contains(var2[var1])) {
         var2[var1] = -1;
      } else if (this.f) {
         var2[var1] = 1;
      }
   }

   protected void s() {
      if (this.l() != null) {
         if (this.l().b()) {
            this.i.b(this.l().h().b());
         }

         if (this.l().c()) {
            this.i.b(this.l().g().b());
            this.k.b(this.l().g().b());

            for (C_bU_mc var2 : this.l().g().c()) {
               this.i.b(var2.e());
               this.j.b(var2.e());
            }
         }

         if (this.l().d()) {
            this.i.b(this.l().f().a());
         }
      } else if (this.k() != null) {
         for (int var3 = 0; var3 < this.k().length; var3++) {
            this.i.b(this.k()[var3]);
         }
      }
   }

   public HashSet<Integer> t() {
      return this.e;
   }

   public void c(boolean var1) {
      this.f = var1;
   }
}
