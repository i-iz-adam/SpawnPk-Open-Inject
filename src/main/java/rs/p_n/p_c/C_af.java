package rs.p_n.p_c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.C_Client_mc;

public class C_af extends rs.p_n.C_c {
   public static final int c = 200;
   public static List<rs.C_s> d = new ArrayList<>();
   public static Map<Integer, rs.C_s> e = new HashMap<>();

   public C_af(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      this.i();
      this.h();
   }

   private void h() {
      rs.p_n.C_e var1 = d(67027);
      a(64029, 4, 0, 64030, 13, "bank/BANK", 35, 25, "Search");
      a(64030, 15, "bank/BANK", 35, 25, 64031);
      a(64033, "Click the search button", this.a, 0, 16750899, false, true);
      h(64036, "/gameframe/spawntabbar");
      byte var2 = 5;
      byte var3 = 5;
      byte var4 = 5;
      var1.al = new int[var2];
      var1.am = new int[var2];
      var1.bc = new int[var2];
      int var5 = 0;
      var1.b(var5++, 64036, var4 - 4, var3 - 10);
      var1.b(var5++, 64071, 8, 39);
      var1.b(var5++, 64029, var4 + 10, var3);
      var1.b(var5++, 64030, var4 + 10, var3);
      var1.b(var5++, 64033, var4 + 55, var3 + 4 + 3);
      a(null, "nothing that exists");
      a(64033, "Click the search button", this.a, 0, 16750899, false, true);
   }

   private void i() {
      rs.p_n.C_e var1 = d(64071);
      var1.P = 170;
      var1.aR = 220;
      var1.bj = 87;
      byte var2 = 20;
      char var3 = '煮';
      boolean var5 = false;
      var1.aH = var2 * 32;
      byte var6 = 5;
      boolean var7 = true;
      byte var8 = 15;
      var1.al = new int[var2 * 3];
      var1.am = new int[var2 * 3];
      var1.bc = new int[var2 * 3];
   }

   public static void a(C_Client_mc var0, String var1) {
      if (rs.p_d.C_k.ad != 0) {
         if (var1.length() < 3) {
            if (var0 != null) {
               var0.a("Please have at least 3 letters in your search term!", 0, "");
            }
         } else {
            String var2 = var1;
            if (var1.length() > 8) {
               var2 = var1.substring(0, 7) + "..";
            }

            rs.p_n.C_e.H['﨡'].at = "Results for: \"@whi@" + var2 + "@or1@\"";
            d.clear();
            e.clear();

            for (int var3 = 1; var3 < rs.p_d.C_k.a; var3++) {
               rs.p_d.C_k var4 = (rs.p_d.C_k)rs.p_d.C_k.c.b(var3);
               if (var4 != null
                  && var4.w != null
                  && var4.i != 11283
                  && var4.i != 4178
                  && !var4.w.contains(" axe head")
                  && !var4.w.contains(" pick head")
                  && !var4.w.contains("kitten")
                  && !var4.w.contains("Pet cat")
                  && !var4.w.contains("@red@")
                  && !var4.w.contains("Clue scroll")
                  && var4.w.toLowerCase().contains(var1.toLowerCase())) {
                  if (!rs.p_l.C_j.b(C_Client_mc.cT) && var4.w.contains("@gre@") && !var4.w.contains("flask (")) {
                     d.add(new rs.C_s("<img=25> <str=16711680>" + var4.w + (rs.p_l.C_j.b(C_Client_mc.cT) ? " [" + var4.i + "]" : ""), var4.i));
                  } else {
                     d.add(new rs.C_s(var4.w + (rs.p_l.C_j.b(C_Client_mc.cT) ? " [" + var4.i + "]" : ""), var4.i));
                  }
               }
            }
         }
      }
   }

   public static void b(rs.p_l.C_K_uc[] var0) {
      rs.p_n.C_e var1 = rs.p_n.C_e.H['漢'];
      var1.V = 0;
      var1.P = 170;
      var1.aR = 215;
      var1.bj = 87;
      int var2 = d.size();
      if (var2 > 200) {
         var2 = 200;
      }

      int var3 = 70000;
      int var4 = var3;
      int var5 = 0;
      var1.aH = var2 * 32;
      if (var1.aH < 250) {
         var1.aH = 250;
      }

      byte var6 = 5;
      byte var7 = 1;
      byte var8 = 15;
      var1.al = new int[var2 * 3];
      var1.am = new int[var2 * 3];
      var1.bc = new int[var2 * 3];
      byte var9 = 2;

      for (int var10 = 0; var10 < var2; var10++) {
         h(var4, "/clan/sprite 4");
         var1.b(var5, var4, var6 - 13, var7 + var8 * var10 * 2 + 28);
         var4++;
         var5++;
         c(var4, d.get(var10).b(), 27);
         rs.p_n.C_e.H[var4].aj = 64071;
         var1.b(var5, var4, var6, var7 + var8 * var10 * 2 - 2);
         var4++;
         var5++;
         a(var4, d.get(var10).a(), "Spawn this item", var0, 0, 16750623, false, false, 125);
         var1.b(var5, var4, var6 + 35, var7 + var8 * var10 * 2 + 9);
         e.put(var4, d.get(var10));
         var4++;
         var5++;
      }
   }
}
