package rs.p_n.p_c;

import rs.C_Client_mc;

class C_Q_uc extends rs.p_n.p_b.p_a.C_d {
   C_Q_uc(long var1) {
      super(var1);
   }

   @Override
   public void c() {
      rs.p_n.C_e.H['鲛'].az[0] = C_O_uc.bJ + 1;
      rs.p_n.C_e.H['鲛'].ax[0] = C_O_uc.bK;
      rs.p_n.C_e.H['鲙'].at = C_O_uc.bL;
      rs.p_n.C_e.H['鲚'].at = C_O_uc.bI - System.currentTimeMillis() <= 0L
         ? "@gre@<img=24> Active"
         : "Starts in.. <img=37> @yel@" + C_Client_mc.c(C_O_uc.bI - System.currentTimeMillis());
      rs.p_n.C_e.H['鲟'].at = C_O_uc.bM - System.currentTimeMillis() <= 0L
         ? "@gre@<img=24> Active"
         : "<img=37> @yel@" + C_Client_mc.c(C_O_uc.bM - System.currentTimeMillis());
      rs.p_n.C_e.H['鲞'].at = C_O_uc.bN - System.currentTimeMillis() <= 0L
         ? "@gre@<img=24> Active"
         : "<img=37> @yel@" + C_Client_mc.c(C_O_uc.bN - System.currentTimeMillis());
      int var1 = 40101;
      if (C_O_uc.bP != -1L) {
         rs.p_n.C_e.H[var1++].at = "<img=82> "
            + C_O_uc.bO
            + ": "
            + (C_O_uc.bP - System.currentTimeMillis() <= 0L ? "@gre@<img=24> Active" : "<img=37> @yel@" + C_Client_mc.c(C_O_uc.bP - System.currentTimeMillis()));
      }

      if (C_O_uc.bR != -1L) {
         String var2 = C_O_uc.bQ;
         rs.p_n.C_e.H[var1++].at = "<img=82> "
            + C_O_uc.bQ
            + ": "
            + (C_O_uc.bR - System.currentTimeMillis() <= 0L ? "@gre@<img=24> Active" : "<img=37> @yel@" + C_Client_mc.c(C_O_uc.bR - System.currentTimeMillis()));
      }

      if (C_O_uc.bS != -1L) {
         rs.p_n.C_e.H[var1++].at = "<img=82> Event Brawl: "
            + (C_O_uc.bS - System.currentTimeMillis() <= 0L ? "@gre@<img=24> Active" : "<img=37> @yel@" + C_Client_mc.c(C_O_uc.bS - System.currentTimeMillis()));
      }
   }
}
