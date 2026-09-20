package rs.p_n.p_c;

import rs.p_gui.C_Launcher_mc;

class C_S_uc extends rs.p_n.p_b.p_a.C_c {
   C_S_uc(C_O_uc var1, long var2, rs.p_n.p_b.p_a.C_c var4) {
      super(var2);
      this.i = var1;
      this.h = var4;
   }

   @Override
   public void e() {
      if (!rs.p_n.p_b.p_a.C_c.g.contains(this.h)) {
         C_Launcher_mc.n()
            .o()
            .b(
               this.f(),
               this.g(),
               "<img=158> PvP Hotspot\n"
                  + C_Launcher_mc.n().o().bS
                  + "\nChance to receive @yel@wild caskets@whi@ from PKs!\n(Blood orbs earn you better caskets)"
            );
      }
   }
}
