package rs.p_n.p_c;

import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;
import java.util.Map;
import rs.C_Client_mc;

public class C_ai extends rs.p_n.C_c {
   public static final Map<Integer, String> c = new HashMap<>();
   public static final String[] d = new String[]{"Depends on combat lvl", "Always right-click", "Left-click where avail.", "Hidden"};
   public static int e = -1;

   public C_ai(rs.p_l.C_K_uc[] var1) {
      super(var1);
      c.put(-1, "None");
      c.put(112, "F1");
      c.put(113, "F2");
      c.put(114, "F3");
      c.put(115, "F4");
      c.put(116, "F5");
      c.put(117, "F6");
      c.put(118, "F7");
      c.put(119, "F8");
      c.put(120, "F9");
      c.put(121, "F10");
      c.put(122, "F11");
      c.put(123, "F12");
   }

   public static void m(int var0) {
      if (var0 == 35004 && e == -1) {
         rs.p_f.C_a.bd = 10;
         rs.p_f.C_a.e();
         rs.p_f.C_a.d();
         h();
      } else {
         short var1 = -600;
         short var2 = -600;
         if (C_Client_mc.br != 35062 || var0 < 35010 || var0 > 35046 || e == -1) {
            if (var0 == 35116) {
               rs.p_f.C_a.aS = !rs.p_f.C_a.aS;
               rs.p_n.C_e.H['褫'].E = rs.p_f.C_a.aS ? C_V_uc.f : C_V_uc.g;
               rs.p_n.C_e.H['褫'].aG = rs.p_f.C_a.aS ? C_V_uc.f : C_V_uc.g;
               rs.p_f.C_a.d();
            }

            if (var0 == 35079) {
               var1 = 372;
               var2 = 132;
               rs.p_n.C_e.H['袸'].b(54, 35089, var1, var2);
               rs.p_n.C_e.H['袸'].b(55, 35087, var1 - 57, var2 + 4);
               rs.p_n.C_e.H['袸'].b(52, 35062, -600, -600);
               rs.p_n.C_e.H['袸'].b(53, 35077, -600, -600);
               rs.p_n.C_e.H['袸'].b(46, 35091, -600, -600);
               rs.p_n.C_e.H['袸'].b(47, 35096, -600, -600);
               rs.p_n.C_e.H['袸'].b(41, 35102, -600, -600);
               rs.p_n.C_e.H['袸'].b(42, 35107, -600, -600);
            } else if (var0 == 35098) {
               var1 = 388;
               var2 = 182;
               rs.p_n.C_e.H['袸'].b(54, 35089, -600, -600);
               rs.p_n.C_e.H['袸'].b(55, 35087, -600, -600);
               rs.p_n.C_e.H['袸'].b(52, 35062, -600, -600);
               rs.p_n.C_e.H['袸'].b(53, 35077, -600, -600);
               rs.p_n.C_e.H['袸'].b(41, 35102, -600, -600);
               rs.p_n.C_e.H['袸'].b(42, 35107, -600, -600);
               rs.p_n.C_e.H['袸'].b(46, 35091, var1 - 55, var2);
               rs.p_n.C_e.H['袸'].b(47, 35096, var1 - 67, var2 + 4);
               rs.p_n.C_e.H['褨'].b(5, 35102, -600, -600);
               rs.p_n.C_e.H['褨'].b(6, 35107, -600, -600);
               rs.p_n.C_e.H['褨'].b(10, 35091, rs.p_n.C_e.H['褨'].am[9] - 70, rs.p_n.C_e.H['褨'].bc[9] + 19);
               rs.p_n.C_e.H['褨'].b(11, 35096, rs.p_n.C_e.H['褨'].am[9] - 12 - 70, rs.p_n.C_e.H['褨'].bc[9] + 4 + 19);
            } else if (var0 == 35109) {
               var1 = 388;
               var2 = 232;
               rs.p_n.C_e.H['袸'].b(54, 35089, -600, -600);
               rs.p_n.C_e.H['袸'].b(55, 35087, -600, -600);
               rs.p_n.C_e.H['袸'].b(52, 35062, -600, -600);
               rs.p_n.C_e.H['袸'].b(53, 35077, -600, -600);
               rs.p_n.C_e.H['袸'].b(41, 35102, var1 - 55, var2);
               rs.p_n.C_e.H['袸'].b(42, 35107, var1 - 67, var2 + 4);
               rs.p_n.C_e.H['袸'].b(46, 35091, -600, -600);
               rs.p_n.C_e.H['袸'].b(47, 35096, -600, -600);
               rs.p_n.C_e.H['褨'].b(5, 35102, rs.p_n.C_e.H['褨'].am[4] - 70 - 1, rs.p_n.C_e.H['褨'].bc[4] + 19);
               rs.p_n.C_e.H['褨'].b(6, 35107, rs.p_n.C_e.H['褨'].am[4] - 12 - 70, rs.p_n.C_e.H['褨'].bc[4] + 4 + 19);
               rs.p_n.C_e.H['褨'].b(10, 35091, -600, -600);
               rs.p_n.C_e.H['褨'].b(11, 35096, -600, -600);
            } else {
               if (e == -1 && C_Client_mc.br != 35062) {
                  switch (var0) {
                     case 35010:
                        var1 = 86;
                        var2 = 65;
                        e = 0;
                     case 35011:
                     case 35012:
                     case 35013:
                     case 35015:
                     case 35016:
                     case 35017:
                     case 35019:
                     case 35020:
                     case 35021:
                     case 35023:
                     case 35024:
                     case 35025:
                     case 35027:
                     case 35028:
                     case 35029:
                     case 35031:
                     case 35032:
                     case 35033:
                     case 35035:
                     case 35036:
                     case 35037:
                     case 35039:
                     case 35040:
                     case 35041:
                     case 35043:
                     case 35044:
                     case 35045:
                     case 35047:
                     case 35048:
                     case 35049:
                     case 35050:
                     case 35051:
                     case 35052:
                     case 35053:
                     case 35054:
                     case 35055:
                     case 35056:
                     case 35057:
                     case 35058:
                     case 35059:
                     case 35060:
                     case 35061:
                     case 35062:
                     case 35063:
                     case 35064:
                     case 35065:
                     case 35066:
                     case 35067:
                     case 35068:
                     case 35069:
                     case 35070:
                     case 35071:
                     case 35072:
                     case 35073:
                     case 35074:
                     case 35075:
                     case 35076:
                     case 35077:
                     case 35078:
                     case 35079:
                     case 35080:
                     case 35081:
                     case 35082:
                     case 35087:
                     case 35088:
                     case 35089:
                     case 35090:
                     case 35091:
                     case 35096:
                     case 35097:
                     case 35098:
                     case 35099:
                     case 35100:
                     case 35101:
                     case 35102:
                     default:
                        break;
                     case 35014:
                        var1 = 86;
                        var2 = 110;
                        e = 1;
                        break;
                     case 35018:
                        var1 = 86;
                        var2 = 155;
                        e = 2;
                        break;
                     case 35022:
                        var1 = 86;
                        var2 = 22;
                        e = 3;
                        break;
                     case 35026:
                        var1 = 86;
                        var2 = 67;
                        e = 4;
                        break;
                     case 35030:
                        var1 = 248;
                        var2 = 65;
                        e = 5;
                        break;
                     case 35034:
                        var1 = 248;
                        var2 = 110;
                        e = 6;
                        break;
                     case 35038:
                        var1 = 248;
                        var2 = 155;
                        e = 8;
                        break;
                     case 35042:
                        var1 = 248;
                        var2 = 22;
                        e = 9;
                        break;
                     case 35046:
                        var1 = 410;
                        var2 = 65;
                        e = 7;
                        break;
                     case 35083:
                        n(5);
                        break;
                     case 35084:
                        n(10);
                        break;
                     case 35085:
                        n(15);
                        break;
                     case 35086:
                        n(20);
                        break;
                     case 35092:
                        o(0);
                        break;
                     case 35093:
                        o(1);
                        break;
                     case 35094:
                        o(2);
                        break;
                     case 35095:
                        o(3);
                        break;
                     case 35103:
                        p(0);
                        break;
                     case 35104:
                        p(1);
                        break;
                     case 35105:
                        p(2);
                        break;
                     case 35106:
                        p(3);
                  }
               }

               if (e >= 0 && e <= 10) {
                  switch (var0) {
                     case 35063:
                        q(-1);
                        break;
                     case 35064:
                        q(112);
                        break;
                     case 35065:
                        q(113);
                        break;
                     case 35066:
                        q(114);
                        break;
                     case 35067:
                        q(115);
                        break;
                     case 35068:
                        q(116);
                        break;
                     case 35069:
                        q(117);
                        break;
                     case 35070:
                        q(118);
                        break;
                     case 35071:
                        q(119);
                        break;
                     case 35072:
                        q(120);
                        break;
                     case 35073:
                        q(121);
                        break;
                     case 35074:
                        q(122);
                        break;
                     case 35075:
                        q(123);
                  }
               }

               if (var1 == -600 && var2 == -600) {
                  e = -1;
               }

               rs.p_n.C_e.H['袸'].b(52, 35062, var1, var2);
               rs.p_n.C_e.H['袸'].b(53, 35077, var1 - 57, var2 + 4);
               rs.p_n.C_e.H['袸'].b(54, 35089, -600, -600);
               rs.p_n.C_e.H['袸'].b(55, 35087, -600, -600);
               rs.p_n.C_e.H['袸'].b(46, 35091, -600, -600);
               rs.p_n.C_e.H['袸'].b(47, 35096, -600, -600);
               rs.p_n.C_e.H['袸'].b(41, 35102, -600, -600);
               rs.p_n.C_e.H['袸'].b(42, 35107, -600, -600);
               if (rs.p_n.C_e.H['褨'] != null && rs.p_n.C_e.H['褨'].al.length >= 10) {
                  rs.p_n.C_e.H['褨'].b(5, 35102, -600, -600);
                  rs.p_n.C_e.H['褨'].b(6, 35107, -600, -600);
                  rs.p_n.C_e.H['褨'].b(10, 35091, -600, -600);
                  rs.p_n.C_e.H['褨'].b(11, 35096, -600, -600);
               }
            }
         }
      }
   }

   public static void h() {
      for (int var0 = 0; var0 < rs.p_f.C_a.G.length; var0++) {
         int var1 = var0;
         if (var0 == 7) {
            var1 = 9;
         }

         if (var0 == 8) {
            var1 = 7;
         }

         if (var0 == 9) {
            var1 = 8;
         }

         int var2 = 35009 + var1 * 4;
         rs.p_n.C_e.H[var2].at = c.get(rs.p_f.C_a.G[var0]);
      }

      rs.p_n.C_e.H['褆'].at = rs.p_f.C_a.bd + "";
      rs.p_n.C_e.H['褙'].at = String.valueOf(d[rs.p_f.C_a.bh]);
      rs.p_n.C_e.H['褤'].at = String.valueOf(d[rs.p_f.C_a.bi]);
   }

   public static void n(int var0) {
      rs.p_f.C_a.bd = var0;
      rs.p_n.C_e.H['褆'].at = var0 + "";
      rs.p_f.C_a.d();
   }

   public static void o(int var0) {
      rs.p_f.C_a.bh = var0;
      rs.p_n.C_e.H['褙'].at = String.valueOf(d[var0]);
      rs.p_f.C_a.d();
   }

   public static void p(int var0) {
      rs.p_f.C_a.bi = var0;
      rs.p_n.C_e.H['褤'].at = String.valueOf(d[var0]);
      rs.p_f.C_a.d();
   }

   public static void q(int var0) {
      int var1 = e;
      String var2 = c.get(var0);
      if (e == 7) {
         var1 = 9;
      }

      if (e == 8) {
         var1 = 7;
      }

      if (e == 9) {
         var1 = 8;
      }

      int var3 = 35009 + var1 * 4;
      if (var0 != -1 && e != -1) {
         for (int var4 = 0; var4 < rs.p_f.C_a.G.length; var4++) {
            if (rs.p_f.C_a.G[var4] == var0) {
               rs.p_f.C_a.G[var4] = rs.p_f.C_a.G[e];
               h();
               break;
            }
         }
      }

      rs.p_f.C_a.G[e] = var0;
      rs.p_n.C_e.H[var3].at = var2;
      rs.p_f.C_a.d();
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(35000);
      h(35001, "options/keybind 1");
      h(35002, "options/keybind 2");
      a(35003, "Restore default", this.a, 0, 16751360, true, true);
      a(35004, "teleport/SPRITE", 10, 100, 32, "Restore to default key bindings", -1, 35005, 1);
      a(35005, "teleport/SPRITE", 11, 100, 32, 35006);
      a(35007, "Control Options Menu", this.a, 2, 16751360, true, true);
      a(35009, "F1", this.a, 2, 16751360, true, true);
      a(35010, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35011, 1);
      a(35011, "options/dropdown", 2, 100, 32, 35012);
      a(35013, "F1", this.a, 2, 16751360, true, true);
      a(35014, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35015, 1);
      a(35015, "options/dropdown", 2, 100, 32, 35016);
      a(35017, "F1", this.a, 2, 16751360, true, true);
      a(35018, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35019, 1);
      a(35019, "options/dropdown", 2, 100, 32, 35020);
      a(35021, "F1", this.a, 2, 16751360, true, true);
      a(35022, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35023, 1);
      a(35023, "options/dropdown", 2, 100, 32, 35024);
      a(35025, "F1", this.a, 2, 16751360, true, true);
      a(35026, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35027, 1);
      a(35027, "options/dropdown", 2, 100, 32, 35028);
      a(35029, "F1", this.a, 2, 16751360, true, true);
      a(35030, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35031, 1);
      a(35031, "options/dropdown", 2, 100, 32, 35032);
      a(35033, "F1", this.a, 2, 16751360, true, true);
      a(35034, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35035, 1);
      a(35035, "options/dropdown", 2, 100, 32, 35036);
      a(35037, "F1", this.a, 2, 16751360, true, true);
      a(35038, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35039, 1);
      a(35039, "options/dropdown", 2, 100, 32, 35040);
      a(35041, "F1", this.a, 2, 16751360, true, true);
      a(35042, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35043, 1);
      a(35043, "options/dropdown", 2, 100, 32, 35044);
      a(35045, "F1", this.a, 2, 16751360, true, true);
      a(35046, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35047, 1);
      a(35047, "options/dropdown", 2, 100, 32, 35048);
      a(35049, "F1", this.a, 2, 16751360, true, true);
      a(35050, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35051, 1);
      a(35051, "options/dropdown", 2, 100, 32, 35052);
      a(35053, "F1", this.a, 2, 16751360, true, true);
      a(35054, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35055, 1);
      a(35055, "options/dropdown", 2, 100, 32, 35056);
      a(35057, "F1", this.a, 2, 16751360, true, true);
      a(35058, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35059, 1);
      a(35059, "options/dropdown", 2, 100, 32, 35060);
      a(35078, "10", this.a, 2, 16751360, true, true);
      a(35079, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35080, 1);
      a(35080, "options/dropdown", 2, 100, 32, 35081);
      rs.p_n.C_e var2 = d(35061);
      h(35062, "options/dropdown 3");
      rs.p_n.C_e.H['裶'].P = 70;
      a(35063, "None", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35064, "F1", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35065, "F2", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35066, "F3", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35067, "F4", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35068, "F5", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35069, "F6", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35070, "F7", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35071, "F8", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35072, "F9", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35073, "F10", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35074, "F11", "Select key binding", this.a, 2, 16750623, true, true, 150);
      a(35075, "F12", "Select key binding", this.a, 2, 16750623, true, true, 150);
      rs.p_n.C_e var3 = d(35077);
      var3.aH = 250;
      var3.P = 100;
      var3.aR = 193;
      var3.bj = 87;
      var3.k(13);

      for (int var4 = 0; var4 < 13; var4++) {
         var3.b(var4, 35063 + var4, 5, 2 + var4 * 17);
      }

      var2.k(2);
      var2.b(0, 35062, 0, 0);
      var2.b(1, 35077, -100, 0);
      rs.p_n.C_e var11 = d(35082);
      h(35089, "options/dropdown 3");
      rs.p_n.C_e.H['褑'].P = 70;
      a(35083, "5", "Select option", this.a, 2, 16750623, true, true, 150);
      a(35084, "10", "Select option", this.a, 2, 16750623, true, true, 150);
      a(35085, "15", "Select option", this.a, 2, 16750623, true, true, 150);
      a(35086, "20", "Select option", this.a, 2, 16750623, true, true, 150);
      rs.p_n.C_e var5 = d(35087);
      var5.aH = 250;
      var5.P = 100;
      var5.aR = 193;
      var5.bj = 87;
      var5.k(4);

      for (int var6 = 0; var6 < 4; var6++) {
         var5.b(var6, 35083 + var6, 5, 2 + var6 * 17);
      }

      var11.k(2);
      var11.b(0, 35062, 0, 0);
      var11.b(1, 35087, -100, 0);
      a(35088, "Item Drag", this.a, 1, 16751360, true, true);
      a(35090, "Player 'attack' options", this.a, 1, 16751360, true, true);
      h(35091, "options/dropdown 6");
      rs.p_n.C_e.H['褓'].P = 70;
      a(35092, "Depends on combat lvl", "Select option", this.a, 0, 16750623, true, true, 150);
      a(35093, "Always right-click", "Select option", this.a, 0, 16750623, true, true, 150);
      a(35094, "Left-click where avail.", "Select option", this.a, 0, 16750623, true, true, 150);
      a(35095, "Hidden", "Select option", this.a, 0, 16750623, true, true, 150);
      rs.p_n.C_e var12 = d(35096);
      var12.aH = 250;
      var12.P = 140;
      var12.aR = 193;
      var12.bj = 87;
      var12.k(4);

      for (int var7 = 0; var7 < 4; var7++) {
         var12.b(var7, 35092 + var7, 5, 2 + var7 * 17);
      }

      a(35097, "Left-click where avail.", this.a, 0, 16751360, true, true);
      a(35098, "options/dropdown", 4, 145, 32, "Select dropdown", -1, 35099, 1);
      a(35099, "options/dropdown", 5, 145, 32, 35100);
      a(35101, "NPC/Bot 'attack' options", this.a, 1, 16751360, true, true);
      h(35102, "options/dropdown 6");
      rs.p_n.C_e.H['褞'].P = 70;
      a(35103, "Depends on combat lvl", "Select option", this.a, 0, 16750623, true, true, 150);
      a(35104, "Always right-click", "Select option", this.a, 0, 16750623, true, true, 150);
      a(35105, "Left-click where avail.", "Select option", this.a, 0, 16750623, true, true, 150);
      a(35106, "Hidden", "Select option", this.a, 0, 16750623, true, true, 150);
      rs.p_n.C_e var13 = d(35107);
      var13.aH = 250;
      var13.P = 140;
      var13.aR = 193;
      var13.bj = 87;
      var13.k(4);

      for (int var8 = 0; var8 < 4; var8++) {
         var13.b(var8, 35103 + var8, 5, 2 + var8 * 17);
      }

      a(35108, "Left-click where avail.", this.a, 0, 16751360, true, true);
      a(35109, "options/dropdown", 4, 145, 32, "Select dropdown", -1, 35110, 1);
      a(35110, "options/dropdown", 5, 145, 32, 35111);
      h();
      var1.k(56);
      var1.b(0, 35001, 20, 12);
      var1.b(1, 63740, 467, 20);
      var1.b(2, 63741, 467, 20);
      var1.b(3, 35002, 33, 53);
      var1.b(4, 35004, 377, 278);
      var1.b(5, 35005, 377, 278);
      var1.b(6, 35003, 427, 288);
      var1.b(7, 35007, 266, 21);
      var1.b(8, 35010, 86, 65);
      var1.b(9, 35011, 86, 65);
      var1.b(10, 35009, 110, 68);
      int var14 = 45;
      var1.b(11, 35014, 86, 65 + var14);
      var1.b(12, 35015, 86, 65 + var14);
      var1.b(13, 35013, 110, 68 + var14 + 1);
      var14 += 45;
      var1.b(14, 35018, 86, 65 + var14);
      var1.b(15, 35019, 86, 65 + var14);
      var1.b(16, 35017, 110, 68 + var14 + 1);
      var14 += 45;
      var1.b(17, 35022, 86, 65 + var14);
      var1.b(18, 35023, 86, 65 + var14);
      var1.b(19, 35021, 110, 68 + var14 + 1);
      var14 += 45;
      var1.b(20, 35026, 86, 65 + var14);
      var1.b(21, 35027, 86, 65 + var14);
      var1.b(22, 35025, 110, 68 + var14 + 1);
      int var18 = 0;
      var1.b(23, 35030, 248, 65 + var18);
      var1.b(24, 35031, 248, 65 + var18);
      var1.b(25, 35029, 272, 68 + var18 + 1);
      var18 += 45;
      var1.b(26, 35034, 248, 65 + var18);
      var1.b(27, 35035, 248, 65 + var18);
      var1.b(28, 35033, 272, 68 + var18 + 1);
      var18 += 45;
      var1.b(29, 35038, 248, 65 + var18);
      var1.b(30, 35039, 248, 65 + var18);
      var1.b(31, 35037, 272, 68 + var18 + 1);
      var18 += 45;
      var1.b(32, 35042, 248, 65 + var18);
      var1.b(33, 35043, 248, 65 + var18);
      var1.b(34, 35041, 272, 68 + var18 + 1);
      byte var22 = 0;
      var1.b(35, 35046, 410, 65 + var22);
      var1.b(36, 35047, 410, 65 + var22);
      var1.b(37, 35045, 434, 68 + var22 + 1);
      short var9 = 410;
      short var10 = 165;
      var1.b(38, 35109, 333, 132 + var22 + 50 + 50);
      var1.b(39, 35108, 399, 137 + var22 + 50 + 50);
      var1.b(40, 35101, 405, 136 + var22 + 30 + 50);
      var1.b(41, 35102, var9 - 5, var10);
      var1.b(42, 35107, var9 - 57 - 5, var10 + 4);
      var9 = 410;
      byte var27 = 115;
      var1.b(43, 35098, 333, 132 + var22 + 50);
      var1.b(44, 35097, 399, 137 + var22 + 50);
      var1.b(45, 35090, 405, 136 + var22 + 30);
      var1.b(46, 35091, var9 - 5, var27);
      var1.b(47, 35096, var9 - 57 - 5, var27 + 4);
      var22 = 0;
      var1.b(48, 35079, 372, 132 + var22);
      var1.b(49, 35080, 372, 132 + var22);
      var1.b(50, 35078, 396, 136 + var22);
      var1.b(51, 35088, 402, 112 + var22);
      var9 = 410;
      var27 = 65;
      var1.b(52, 35062, var9, var27);
      var1.b(53, 35077, var9 - 57, var27 + 4);
      var9 = 410;
      var27 = 65;
      var1.b(54, 35089, var9 - 55, var27);
      var1.b(55, 35087, var9 - 57 - 55, var27 + 4);
      m(-1);
   }
}
