package rs.p_n.p_c;

public class C_H_uc extends rs.p_n.C_c {
   public C_H_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = j(15106);
      c(15107, 7, "equipment/CUSTOM");
      a(15210, "equipment/CUSTOM", 8, 21, 21, "Close", 250, 15211, 3);
      a(15211, "equipment/CUSTOM", 9, 21, 21, 15212);
      a(48087, "equipment/CUSTOM", 10, 21, 21, "View bonuses / unlocks", -1, 48088, 1);
      a(48088, "equipment/CUSTOM", 11, 21, 21, 48089);
      a(15111, "Equip Your Character...", this.a, 2, 14983494, false, true);
      a(15112, "Attack bonus", this.a, 2, 14983494, false, true);
      a(15113, "Defence bonus", this.a, 2, 14983494, false, true);
      a(15114, "Other bonuses", this.a, 2, 14983494, false, true);
      a(15115, "Drop rate bonus:", this.a, 1, 14983494, false, true);
      a(15116, "Blood money bonus:", this.a, 1, 14983494, false, true);
      a(15117, "Range strength:", this.a, 1, 14983494, false, true);
      a(15118, "Magic damage:", this.a, 1, 14983494, false, true);
      a(15119, "Risk value: ", this.a, 1, 14983494, false, true);

      for (int var2 = 1675; var2 <= 1684; var2++) {
         a(var2, this.a, 1);
      }

      a(1686, this.a, 1);
      a(1687, this.a, 1);
      h(15125);
      var1.k(51);
      var1.b(0, 15107, 4, 20);
      var1.b(1, 15210, 476, 29);
      var1.b(2, 15211, 476, 29);
      var1.c(3, 15111, -100, -100);
      int var7 = 4;
      byte var3 = 69;

      for (int var4 = 1675; var4 <= 1679; var4++) {
         var1.c(var7, var4, 20, var3);
         var7++;
         var3 += 14;
      }

      var1.c(9, 1680, 20, 161);
      var1.c(10, 1681, 20, 177);
      var1.c(11, 1682, 20, 192);
      var1.c(12, 1683, 20, 207);
      var1.c(13, 1684, 20, 221);
      var1.c(14, 1686, 20, 262);
      var1.b(15, 15125, 170, 200);
      var1.c(16, 15112, 16, 55);
      var1.c(17, 1687, 20, 306);
      var1.c(18, 15113, 16, 147);
      var1.c(19, 15114, 16, 248);
      var1.b(20, 1645, 399, 97);
      var1.b(21, 1646, 399, 163);
      var1.b(22, 1647, 399, 163);
      var1.b(23, 1648, 399, 204);
      var1.b(24, 1649, 343, 176);
      var1.b(25, 1650, 343, 212);
      var1.b(26, 1651, 455, 176);
      var1.b(27, 1652, 455, 212);
      var1.b(28, 1653, 369, 139);
      var1.b(29, 1654, 428, 139);
      var1.b(30, 1655, 379, 100);
      var1.b(31, 1656, 433, 99);
      var1.b(32, 1657, 399, 62);
      var1.b(33, 1658, 358, 101);
      var1.b(34, 1659, 399, 101);
      var1.b(35, 1660, 440, 101);
      var1.b(36, 1661, 343, 140);
      var1.b(37, 1662, 399, 140);
      var1.b(38, 1663, 455, 140);
      var1.b(39, 1664, 399, 180);
      var1.b(40, 1665, 399, 220);
      var1.b(41, 1666, 343, 220);
      var1.b(42, 1667, 455, 220);
      var1.b(43, 1688, 345, 102);
      byte var8 = -3;
      var1.b(44, 15115, 343, 262);
      var1.b(45, 15116, 343, 277);
      var1.c(46, 15117, 20, 276);
      var1.c(47, 15118, 20, 291);
      var1.b(48, 15119, 343, 292);
      var1.b(49, 48087, 450, 29);
      var1.b(50, 48088, 450, 29);

      for (int var5 = 1675; var5 <= 1684; var5++) {
         rs.p_n.C_e var6 = H[var5];
         var6.ad = 14983494;
         var6.S = false;
      }

      for (int var9 = 1686; var9 <= 1687; var9++) {
         rs.p_n.C_e var10 = H[var9];
         var10.ad = 14983494;
         var10.S = false;
      }
   }
}
