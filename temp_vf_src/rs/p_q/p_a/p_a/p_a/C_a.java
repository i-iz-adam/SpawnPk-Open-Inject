package rs.p_q.p_a.p_a.p_a;

import rs.C_Client_mc;
import rs.p_n.p_c.C_aG_mc;

public class C_a extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 1) {
         C_Client_mc.cT = this.c();
      } else if (var1 == 2) {
         boolean var2 = this.e() == 1;
         if (var2) {
            rs.p_n.C_e.H[12929].aG = rs.p_n.C_e.j(14, "magic/on");
            rs.p_n.C_e.H[12929].N = "Infernal barrage";
            rs.p_n.C_e.H[12931].at = "Level 92 : Infernal barrage";
            rs.p_n.C_e.H[12911].aG = rs.p_n.C_e.j(16, "magic/on");
            rs.p_n.C_e.H[12911].N = "Infernal blitz";
            rs.p_n.C_e.H[12913].at = "Level 80 : Infernal blitz";
         } else {
            rs.p_n.C_e.H[12929].aG = rs.p_n.C_e.j(13, "magic/on");
            rs.p_n.C_e.H[12929].N = "Blood barrage";
            rs.p_n.C_e.H[12931].at = "Level 92 : Blood barrage";
            rs.p_n.C_e.H[12911].aG = rs.p_n.C_e.j(15, "magic/on");
            rs.p_n.C_e.H[12911].N = "Infernal blitz";
            rs.p_n.C_e.H[12913].at = "Level 80 : Blood blitz";
         }
      } else if (var1 == 3) {
         C_Client_mc.dx = this.c();
      } else if (var1 == 4) {
         this.c.dW = this.h();
         this.c.gb = false;
         this.c.fN = 1;
         this.c.dY = "";
         C_Client_mc.fM = true;
      } else if (var1 == 5) {
         int var5 = this.e();
         int var3 = this.e();
         int var4 = this.e();
      } else if (var1 == 6) {
         this.c.v.i = this.e() == 1;
      } else if (var1 == 7) {
         C_Client_mc.bC = this.c();
         C_Client_mc.bE = this.c();
         C_Client_mc.bG = this.c();
         C_Client_mc.bF = this.c();
         C_Client_mc.bH = this.c();
         C_Client_mc.bD = false;
      } else if (var1 == 8) {
         C_aG_mc.c = this.e() == 1;
      }
   }
}
