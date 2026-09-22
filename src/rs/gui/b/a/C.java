package rs.gui.b.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.StringConcatFactory;
import javax.swing.JOptionPane;
import rs.Client;
import rs.gui.Launcher;
import rs.gui.b.f;
import rs.gui.b.h;
import rs.gui.b.c.c;

class C implements ActionListener {
   C(h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (Launcher.n().o() != null && Client.eR != null) {
         Launcher.n().o().requestFocus();
         rs.gui.b.Loadout var2 = this.a.f().c();
         if (var2 == null) {
            JOptionPane.showMessageDialog(null, "You don't have a loadout selected!");
         } else {
            String var3 = "::item_loadout";

            for (int var4 = 0; var4 < var2.d().length; var4++) {
               f var5 = var2.d()[var4];
               if (var5 != null && var5.a() > 0) {
                  var3 = var3 + " " + var4 + "," + var5.a() + "," + var5.b();
               }
            }

            String var11 = "::equip_loadout " + var2.i();

            for (c var8 : c.values()) {
               if (var2.a().get(var8) != null) {
                  int var9 = ((f)var2.a().get(var8)).a();
                  int var10 = ((f)var2.a().get(var8)).b();
                  if (var9 > 0) {
                     var11 = var11 + " " + var8.b() + "," + var9 + "," + var10;
                  }
               }
            }

            Client.ao = var11;
            Client.ap = var3;
            Client.aq = "::pet_loadout " + var2.b() + " " + var2.h();
            Client.aw = var11;
            Client.av = var3;
            Client.ay = Client.aq;
            Launcher.n().o().ar = "::" + var2.g().b().toLowerCase();
            Client.ax = "::" + var2.g().b().toLowerCase();
            if (var2.e() == 0) {
               Launcher.n().o().as = "::normalpray";
               Client.az = "::normalpray";
            } else {
               Launcher.n().o().as = "::cursespray";
               Client.az = "::cursespray";
            }

            String var13 = "::skills_loadout";

            for (int var14 = 0; var14 < rs.gui.b.c.a.b.length; var14++) {
               var13 = var13 + " " + rs.gui.b.c.a.b[var14] + "," + var2.c()[var14];
            }

            Launcher.n().o().an = var13;
            Client.au = var13;
         }
      }
   }
}
