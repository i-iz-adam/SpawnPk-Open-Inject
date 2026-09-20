package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.StringConcatFactory;
import javax.swing.JOptionPane;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

class C_C_uc implements ActionListener {
   final rs.p_gui.p_b.C_h a;
   C_C_uc(rs.p_gui.p_b.C_h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (C_Launcher_mc.n().o() != null && C_Client_mc.eR != null) {
         C_Launcher_mc.n().o().requestFocus();
         rs.p_gui.p_b.C_a var2 = this.a.f().c();
         if (var2 == null) {
            JOptionPane.showMessageDialog(null, "You don't have a loadout selected!");
         } else {
            String var3 = "::item_loadout";

            for (int var4 = 0; var4 < var2.d().length; var4++) {
               rs.p_gui.p_b.C_f var5 = var2.d()[var4];
               if (var5 != null && var5.a() > 0) {
                  var3 = var3 + " " + var4 + "," + var5.a() + "," + var5.b();
               }
            }

            String var11 = "::equip_loadout " + var2.i();

            for (rs.p_gui.p_b.p_c.C_c var8 : rs.p_gui.p_b.p_c.C_c.values()) {
               if (var2.a().get(var8) != null) {
                  int var9 = var2.a().get(var8).a();
                  int var10 = var2.a().get(var8).b();
                  if (var9 > 0) {
                     var11 = var11 + " " + var8.b() + "," + var9 + "," + var10;
                  }
               }
            }

            C_Client_mc.ao = var11;
            C_Client_mc.ap = var3;
            C_Client_mc.aq = "::pet_loadout " + var2.b() + " " + var2.h();
            C_Client_mc.aw = var11;
            C_Client_mc.av = var3;
            C_Client_mc.ay = String.valueOf(C_Client_mc.aq);
            C_Launcher_mc.n().o().ar = "::" + var2.g().b().toLowerCase();
            C_Client_mc.ax = "::" + var2.g().b().toLowerCase();
            if (var2.e() == 0) {
               C_Launcher_mc.n().o().as = "::normalpray";
               C_Client_mc.az = "::normalpray";
            } else {
               C_Launcher_mc.n().o().as = "::cursespray";
               C_Client_mc.az = "::cursespray";
            }

            String var13 = "::skills_loadout";

            for (int var14 = 0; var14 < rs.p_gui.p_b.p_c.C_a.b.length; var14++) {
               var13 = var13 + " " + rs.p_gui.p_b.p_c.C_a.b[var14] + "," + var2.c()[var14];
            }

            C_Launcher_mc.n().o().an = var13;
            C_Client_mc.au = var13;
         }
      }
   }
}
