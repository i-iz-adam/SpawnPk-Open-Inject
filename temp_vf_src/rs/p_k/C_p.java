package rs.p_k;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_p {
   private C_o a;

   public C_p() {
      String var1 = "skybox.txt";
      this.a = new C_o(this.getClass().getResourceAsStream("skybox.txt"), "skybox.txt");
   }

   private int a(int var1, int var2, int var3) {
      var1 -= C_Launcher_mc.n().o().aR() / 8;
      var2 -= C_Launcher_mc.n().o().aS() / 8;
      int[][] var4 = C_Launcher_mc.n().o().eS[var3];
      return var1 >= 0 && var1 < var4.length && var2 >= 0 && var2 < var4[var1].length ? var4[var1][var2] : -1;
   }

   public void a() {
      if (this.a != null && C_Launcher_mc.n().o().fc) {
         C_Launcher_mc.n().o();
         rs.p_a.C_k var1 = C_Client_mc.eR;
         if (var1 != null) {
            int var2 = var1.ac;
            int var3 = var1.ad;
         }
      }
   }
}
