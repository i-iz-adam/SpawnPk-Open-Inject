package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

class C_c implements ActionListener {
   C_c(C_b var1, rs.p_gui.p_b.C_a var2, JFrame var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (C_Launcher_mc.n().o() != null) {
         rs.p_a.C_k var2 = C_Client_mc.eR;
         C_Launcher_mc.n().o().requestFocus();
         if (var2 != null) {
            this.a.a().clear();

            for (int var3 = 0; var3 < this.a.d().length; var3++) {
               this.a.a(var3, null);
            }

            this.a.a(C_Launcher_mc.n().o().s);
            this.a.c(C_Launcher_mc.n().o().t);

            for (int var6 = 0; var6 < this.a.d().length; var6++) {
               int var4 = rs.p_n.C_e.H[3214].az[var6] - 1;
               int var5 = rs.p_n.C_e.H[3214].ax[var6];
               if (var4 <= 0) {
                  var4 = -1;
               }

               this.a.a(var6, new rs.p_gui.p_b.C_f(var4, var5));
            }

            for (int var7 = 0; var7 < rs.p_n.C_e.H[1688].az.length; var7++) {
               int var9 = rs.p_n.C_e.H[1688].az[var7] - 1;
               int var11 = rs.p_n.C_e.H[1688].ax[var7];
               if (var9 <= 0) {
                  var9 = -1;
               }

               if (var9 > 0) {
                  this.a.a(rs.p_gui.p_b.p_c.C_c.a(var7), new rs.p_gui.p_b.C_f(var9, var11));
               }
            }

            if (C_Client_mc.eR != null) {
               this.a.d(C_Client_mc.eR.bs);
            }

            int var8 = C_Client_mc.eT[6];
            if (var8 == 29999) {
               this.a.a(rs.p_gui.p_b.C_a.a.a);
            } else if (var8 == 12855) {
               this.a.a(rs.p_gui.p_b.C_a.a.b);
            } else if (var8 == 1151) {
               this.a.a(rs.p_gui.p_b.C_a.a.c);
            }

            int var10 = C_Client_mc.eT[5];
            if (var10 == 5608) {
               this.a.b(0);
            } else if (var10 == 22500) {
               this.a.b(1);
            }

            for (int var12 = 0; var12 < rs.p_gui.p_b.p_c.C_a.b.length; var12++) {
               this.a.c()[var12] = C_Launcher_mc.n().o().eo[rs.p_gui.p_b.p_c.C_a.b[var12]];
               if (this.a.c()[var12] < 1) {
                  this.a.c()[var12] = 1;
               }

               if (this.a.c()[var12] > 99) {
                  this.a.c()[var12] = 99;
               }
            }

            this.c.a.f().a();
            this.c.a.a();
            this.c.a.g().a();
            C_Client_mc.ap = "::cldt";
         } else {
            JOptionPane.showMessageDialog(
               null, "You're not currently logged in to a character! \nPlease log in, wear and have what you want to clone, and try again."
            );
         }
      }

      this.b.setVisible(false);
      this.b.dispose();
   }
}
