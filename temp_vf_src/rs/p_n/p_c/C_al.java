package rs.p_n.p_c;

import rs.C_Client_mc;

public class C_al extends rs.p_n.C_c {
   public C_al(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(33000);
      h(33001, "equipment/loadout 1");
      a(33002, Boolean.valueOf(false));
      rs.p_n.C_e var2 = rs.p_n.C_e.H['胪'];
      var2.az = new int[28];
      var2.ax = new int[28];
      var2.aR = 7;
      var2.P = 4;
      var2.ac = 5;
      var2.ap = 3;
      var2.aF = true;
      a(33003, Boolean.valueOf(false));
      rs.p_n.C_e var3 = rs.p_n.C_e.H['胫'];
      var3.az = new int[15];
      var3.ax = new int[15];
      var3.aR = 5;
      var3.P = 3;
      var3.ac = 20;
      var3.ap = 8;
      var3.aF = true;
      a(33004, "Item Loadout Modification Interface", this.a, 2, 16750623, true, true);
      a(33005, "LMS Loadout", this.a, 2, 16750623, true, true);
      a(33006, "fountain/sprite", 16, 120, 34, "Save loadout", -1, 33007, 1);
      a(33007, "fountain/sprite", 15, 120, 34, 33008);
      a(33009, "fountain/sprite", 16, 120, 34, "Set as default", -1, 33010, 1);
      a(33010, "fountain/sprite", 15, 120, 34, 33011);
      a(33012, "@yel@Save loadout", this.a, 1, 16750623, true, true);
      a(33013, "@yel@Reset to default", this.a, 1, 16750623, true, true);
      var1.k(13);
      var1.b(0, 33001, 8, 6);
      var1.b(1, 33002, 178, 51);
      var1.b(2, 33003, 25, 73);
      var1.b(3, 33004, 255, 15);
      var1.b(4, 33005, 412, 60);
      var1.b(5, 33006, 354, 109);
      var1.b(6, 33007, 354, 109);
      var1.b(7, 33009, 354, 159);
      var1.b(8, 33010, 354, 159);
      var1.b(9, 33012, 414, 118);
      var1.b(10, 33013, 414, 168);
      var1.b(11, 65418, 479, 14);
      var1.b(12, 65419, 479, 14);
   }

   public static void h() {
      String var0 = "";
      rs.p_n.C_e var1 = rs.p_n.C_e.H['胪'];
      rs.p_n.C_e var2 = rs.p_n.C_e.H['胫'];

      for (int var3 = 0; var3 < 28; var3++) {
         var0 = var0 + (var1.az[var3] - 1) + "," + var1.ax[var3];
         if (var3 < 27) {
            var0 = var0 + " ";
         }
      }

      String var4 = "";
      var4 = var4 + (var2.az[1] - 1) + "," + var2.ax[1] + " ";
      var4 = var4 + (var2.az[3] - 1) + "," + var2.ax[3] + " ";
      var4 = var4 + (var2.az[4] - 1) + "," + var2.ax[4] + " ";
      var4 = var4 + (var2.az[6] - 1) + "," + var2.ax[6] + " ";
      var4 = var4 + (var2.az[7] - 1) + "," + var2.ax[7] + " ";
      var4 = var4 + (var2.az[8] - 1) + "," + var2.ax[8] + " ";
      var4 = var4 + "0,0 ";
      var4 = var4 + (var2.az[10] - 1) + "," + var2.ax[10] + " ";
      var4 = var4 + "0,0 ";
      var4 = var4 + (var2.az[12] - 1) + "," + var2.ax[12] + " ";
      var4 = var4 + (var2.az[13] - 1) + "," + var2.ax[13] + " ";
      var4 = var4 + "0,0 ";
      var4 = var4 + (var2.az[14] - 1) + "," + var2.ax[14] + " ";
      var4 = var4 + (var2.az[5] - 1) + "," + var2.ax[5];
      C_Client_mc.ap = "::cld1 " + var0;
      C_Client_mc.ao = "::cld2 " + var4;
   }
}
