package rs.p_n.p_c;

public class C_aH_mc extends rs.p_n.C_c {
   private static final int[] c = new int[]{
      5609,
      5610,
      5611,
      5612,
      5613,
      5614,
      5615,
      5616,
      5617,
      5618,
      5619,
      5620,
      5621,
      5622,
      5623,
      683,
      684,
      685,
      5632,
      5633,
      5634,
      5635,
      5636,
      5637,
      5638,
      5639,
      5640,
      5641,
      5642,
      5643,
      5644,
      686,
      5645,
      5649,
      5647,
      5648,
      18000,
      18001,
      18002,
      18003,
      18004,
      18005,
      18006,
      18007,
      18008,
      18009,
      18010,
      18011,
      18553,
      18554,
      18012,
      18013,
      18014,
      18015,
      18045,
      18046,
      18047,
      18048,
      5651,
      687
   };
   private static final int[] d = new int[]{
      3,
      40,
      77,
      3,
      40,
      77,
      114,
      151,
      4,
      114,
      151,
      3,
      40,
      77,
      114,
      40,
      77,
      114,
      5,
      42,
      79,
      5,
      42,
      79,
      116,
      153,
      6,
      116,
      153,
      5,
      42,
      79,
      116,
      42,
      79,
      116,
      114,
      117,
      151,
      154,
      40,
      43,
      77,
      80,
      151,
      154,
      3,
      6,
      151,
      153,
      3,
      10,
      40,
      42,
      77,
      80,
      114,
      117,
      65,
      15
   };
   private static final int[] e = new int[]{
      -1,
      -1,
      -1,
      36,
      36,
      36,
      36,
      36,
      73,
      73,
      73,
      110,
      110,
      110,
      110,
      147,
      147,
      147,
      1,
      1,
      1,
      38,
      38,
      38,
      38,
      38,
      76,
      75,
      75,
      112,
      112,
      112,
      112,
      149,
      149,
      149,
      -1,
      3,
      1,
      4,
      73,
      77,
      75,
      78,
      110,
      114,
      149,
      152,
      147,
      149,
      182,
      186,
      182,
      194,
      183,
      188,
      185,
      189,
      242,
      244
   };

   public C_aH_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   public static void h() {
      if (rs.p_f.C_a.aI) {
         rs.p_n.C_e.H[18091].at = "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%";
         rs.p_n.C_e.H[18105].at = "Level 45\nMystic Might\nIncreases your Magic by 15%";
         rs.p_n.C_e.H[18103].at = "Level 44\nEagle Eye\nIncreases your Ranged by 15%";
         rs.p_n.C_e.H[18089].at = "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%";
      } else {
         rs.p_n.C_e.H[18091].at = "Level 45\nMystic Might\nIncreases your Magic by 15%";
         rs.p_n.C_e.H[18105].at = "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%";
         rs.p_n.C_e.H[18103].at = "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%";
         rs.p_n.C_e.H[18089].at = "Level 44\nEagle Eye\nIncreases your Ranged by 15%";
      }
   }

   public static void i() {
      h();
      if (!rs.p_f.C_a.aG) {
         rs.p_n.C_e.H['꧴'].at = "Show stat adjustments";
         rs.p_n.C_e.H[5608].b(5, 43503, -5000, 207);
         rs.p_n.C_e.H[5608].b(6, 43504, -5000, 207);
         rs.p_n.C_e.H[5608].b(7, 43505, -5000, 207);
         rs.p_n.C_e.H[5608].b(8, 43506, -5000, 207);
         rs.p_n.C_e.H[5608].b(9, 43507, -5000, 207);
         rs.p_n.C_e.H[5608].b(2, 43502, -5000, 176);
         rs.p_n.C_e.H[5608].b(10, 43508, -5000, 225);
         rs.p_n.C_e.H[5608].b(1, 43500, -5000, 220);
         rs.p_n.C_e.H[5608].b(2, 43502, -5000, 176);
         rs.p_n.C_e.H[22500].b(1, 43502, -5000, 176);
         rs.p_n.C_e.H[22500].b(2, 43503, -5000, 207);
         rs.p_n.C_e.H[22500].b(3, 43504, -5000, 207);
         rs.p_n.C_e.H[22500].b(4, 43505, -5000, 207);
         rs.p_n.C_e.H[22500].b(5, 43506, -5000, 207);
         rs.p_n.C_e.H[22500].b(6, 43507, -5000, 207);
         rs.p_n.C_e.H[22500].b(0, 43500, -5000, 220);
         rs.p_n.C_e.H[22500].b(1, 43502, -5000, 176);
         rs.p_n.C_e.H[22500].b(7, 43508, -5000, 225);
         rs.p_n.C_e.H['ꧭ'].aR = 250;
         rs.p_n.C_e.H['ꧭ'].P = 250;

         for (int var0 = 0; var0 < c.length; var0++) {
            int var1 = d[var0];
            int var2 = e[var0];
            if (rs.p_f.C_a.aI) {
               if (c[var0] == 18047) {
                  var1 = 6;
                  var2 = 150;
               }

               if (c[var0] == 18048) {
                  var1 = 9;
                  var2 = 153;
               }

               if (c[var0] == 18010) {
                  var1 = 113;
                  var2 = 186;
               }

               if (c[var0] == 18011) {
                  var1 = 117;
                  var2 = 190;
               }

               if (c[var0] == 18008) {
                  var1 = 78;
                  var2 = 185;
               }

               if (c[var0] == 18009) {
                  var1 = 81;
                  var2 = 190;
               }

               if (c[var0] == 18045) {
                  var1 = 150;
                  var2 = 112;
               }

               if (c[var0] == 18046) {
                  var1 = 153;
                  var2 = 116;
               }
            }

            var2 += 9;
            if (c[var0] != 687 && c[var0] != 5651) {
               rs.p_n.C_e.H['ꧭ'].b(var0, c[var0], var1, var2);
            } else {
               rs.p_n.C_e.H['ꧭ'].b(var0, c[var0], var1, -5000);
            }
         }
      } else {
         rs.p_n.C_e.H[5608].b(1, 43500, 1, 220);
         rs.p_n.C_e.H[5608].b(2, 43502, 1, 176);
         rs.p_n.C_e.H[5608].b(10, 43508, 21, 225);
         rs.p_n.C_e.H[22500].b(0, 43500, 1, 220);
         rs.p_n.C_e.H[22500].b(1, 43502, 1, 176);
         rs.p_n.C_e.H[22500].b(7, 43508, 21, 225);
         if (rs.p_f.C_a.bj) {
            rs.p_n.C_e.H['꧴'].at = "Hide stat adjustments";
            rs.p_n.C_e.H[5608].b(5, 43503, 20, 207);
            rs.p_n.C_e.H[5608].b(6, 43504, 57, 207);
            rs.p_n.C_e.H[5608].b(7, 43505, 96, 207);
            rs.p_n.C_e.H[5608].b(8, 43506, 135, 207);
            rs.p_n.C_e.H[5608].b(9, 43507, 173, 207);
            rs.p_n.C_e.H[5608].b(2, 43502, 1, 176);
            rs.p_n.C_e.H[22500].b(1, 43502, 1, 176);
            rs.p_n.C_e.H[22500].b(2, 43503, 20, 207);
            rs.p_n.C_e.H[22500].b(3, 43504, 57, 207);
            rs.p_n.C_e.H[22500].b(4, 43505, 96, 207);
            rs.p_n.C_e.H[22500].b(5, 43506, 135, 207);
            rs.p_n.C_e.H[22500].b(6, 43507, 173, 207);
            rs.p_n.C_e.H['ꧭ'].aR = 176;
            rs.p_n.C_e.H['ꧭ'].P = 174;

            for (int var4 = 0; var4 < c.length; var4++) {
               byte var6 = -2;
               int var9 = d[var4];
               int var3 = e[var4];
               if (rs.p_f.C_a.aI) {
                  if (c[var4] == 18047) {
                     var9 = 10;
                     var3 = 148;
                  }

                  if (c[var4] == 18048) {
                     var9 = 15;
                     var3 = 151;
                  }

                  if (c[var4] == 18010) {
                     var9 = 113;
                     var3 = 186;
                  }

                  if (c[var4] == 18011) {
                     var9 = 117;
                     var3 = 190;
                  }

                  if (c[var4] == 18008) {
                     var9 = 84;
                     var3 = 185;
                  }

                  if (c[var4] == 18009) {
                     var9 = 89;
                     var3 = 190;
                  }

                  if (c[var4] == 18045) {
                     var9 = 146;
                     var3 = 112;
                  }

                  if (c[var4] == 18046) {
                     var9 = 149;
                     var3 = 116;
                  }
               }

               if (d[var4] > 10) {
                  var6 = -4;
               }

               if (d[var4] > 50) {
                  var6 -= 2;
               }

               if (d[var4] > 100) {
                  var6 -= 2;
               }

               if (d[var4] > 150) {
                  var6 -= 2;
               }

               var9 += var6;
               if (c[var4] != 687 && c[var4] != 5651) {
                  rs.p_n.C_e.H['ꧭ'].b(var4, c[var4], var9, var3);
               } else {
                  rs.p_n.C_e.H['ꧭ'].b(var4, c[var4], var9, -5000);
               }
            }
         } else {
            rs.p_n.C_e.H['꧴'].at = "Show stat adjustments";
            rs.p_n.C_e.H[5608].b(5, 43503, -5000, 207);
            rs.p_n.C_e.H[5608].b(6, 43504, -5000, 207);
            rs.p_n.C_e.H[5608].b(7, 43505, -5000, 207);
            rs.p_n.C_e.H[5608].b(8, 43506, -5000, 207);
            rs.p_n.C_e.H[5608].b(9, 43507, -5000, 207);
            rs.p_n.C_e.H[5608].b(2, 43502, -5000, 176);
            rs.p_n.C_e.H[5608].b(10, 43508, 21, 225);
            rs.p_n.C_e.H[22500].b(1, 43502, -5000, 176);
            rs.p_n.C_e.H[22500].b(2, 43503, -5000, 207);
            rs.p_n.C_e.H[22500].b(3, 43504, -5000, 207);
            rs.p_n.C_e.H[22500].b(4, 43505, -5000, 207);
            rs.p_n.C_e.H[22500].b(5, 43506, -5000, 207);
            rs.p_n.C_e.H[22500].b(6, 43507, -5000, 207);
            rs.p_n.C_e.H['ꧭ'].aR = 250;
            rs.p_n.C_e.H['ꧭ'].P = 250;

            for (int var5 = 0; var5 < c.length; var5++) {
               byte var7 = 0;
               int var11 = d[var5] + var7;
               int var13 = e[var5];
               if (rs.p_f.C_a.aI) {
                  if (c[var5] == 18047) {
                     var11 = 4;
                     var13 = 148;
                  }

                  if (c[var5] == 18048) {
                     var11 = 9;
                     var13 = 151;
                  }

                  if (c[var5] == 18010) {
                     var11 = 113;
                     var13 = 186;
                  }

                  if (c[var5] == 18011) {
                     var11 = 117;
                     var13 = 190;
                  }

                  if (c[var5] == 18008) {
                     var11 = 78;
                     var13 = 185;
                  }

                  if (c[var5] == 18009) {
                     var11 = 81;
                     var13 = 190;
                  }

                  if (c[var5] == 18045) {
                     var11 = 150;
                     var13 = 112;
                  }

                  if (c[var5] == 18046) {
                     var11 = 153;
                     var13 = 116;
                  }
               }

               var11 += var7;
               if (c[var5] != 687 && c[var5] != 5651) {
                  rs.p_n.C_e.H['ꧭ'].b(var5, c[var5], var11, var13);
               } else {
                  rs.p_n.C_e.H['ꧭ'].b(var5, c[var5], var11, -5000);
               }
            }
         }
      }
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = j(5608);
      rs.p_n.C_e var2 = H[687];
      c(5651, 0, "prayer/PRAYER");
      var2.ad = 16750623;
      var2.aS = true;
      var2.at = "%1/%2";
      int[] var3 = new int[]{
         18016,
         18017,
         18018,
         18019,
         18020,
         18021,
         18022,
         18023,
         18024,
         18025,
         18026,
         18027,
         18028,
         18029,
         18030,
         18031,
         18032,
         18033,
         18034,
         18035,
         18036,
         18037,
         18038,
         18039,
         18040,
         18041,
         18042,
         18043,
         18044
      };
      int[] var4 = new int[]{8, 44, 80, 114, 150, 8, 44, 80, 116, 152, 8, 42, 78, 116, 152, 8, 44, 80, 116, 150, 6, 44, 80, 116, 150, 6, 42, 78, 114};
      int[] var5 = new int[]{6, 6, 6, 4, 4, 42, 42, 42, 42, 42, 79, 76, 76, 78, 78, 114, 114, 114, 114, 112, 148, 150, 150, 150, 148, 184, 184, 184, 184};
      int[] var6 = new int[]{
         18050,
         18052,
         18054,
         18056,
         18058,
         18060,
         18062,
         18064,
         18066,
         18068,
         18070,
         18072,
         18074,
         18076,
         18078,
         18080,
         18082,
         18084,
         18086,
         18088,
         18090,
         18092,
         18094,
         18096,
         18555,
         18098,
         18100,
         18102,
         18104
      };
      int[] var7 = new int[]{12, 8, 20, 12, 24, 2, 2, 6, 6, 50, 6, 6, 10, 6, 6, 5, 5, 5, 5, 5, 18, 28, 28, 50, 1, 1, 6, 10, 10};
      int[] var8 = new int[]{42, 42, 42, 42, 42, 80, 80, 80, 80, 80, 118, 118, 118, 118, 118, 150, 150, 150, 150, 150, 105, 80, 65, 65, 65, 110, 110, 110, 110};
      String[] var9 = new String[]{
         "Level 01\nThick Skin\nIncreases your Defence by 5%",
         "Level 04\nBurst of Strength\nIncreases your Strength by 5%",
         "Level 07\nCharity of Thought\nIncreases your Attack by 5%",
         "Level 08\nSharp Eye\nIncreases your Ranged by 5%",
         "Level 09\nMystic Will\nIncreases your Magic by 5%",
         "Level 10\nRock Skin\nIncreases your Defence by 10%",
         "Level 13\nSuperhuman Strength\nIncreases your Strength by 10%",
         "Level 16\nImproved Reflexes\nIncreases your Attack by 10%",
         "Level 19\nRapid Restore\n2x restore rate for all stats\nexcept Hitpoints and Prayer",
         "Level 22\nRapid Heal\n2x restore rate for the\nHitpoints stat",
         "Level 25\nProtect Item\nKeep one extra item if you die",
         "Level 26\nHawk Eye\nIncreases your Ranged by 10%",
         "Level 27\nMystic Lore\nIncreases your Magic by 10%",
         "Level 28\nSteel Skin\nIncreases your Defence by 15%",
         "Level 31\nUltimate Strength\nIncreases your Strength by 15%",
         "Level 34\nIncredible Reflexes\nIncreases your Attack by 15%",
         "Level 37\nProtect from Magic\nProtection from magical attacks",
         "Level 40\nProtect from Missiles\nProtection from ranged attacks",
         "Level 43\nProtect from Melee\nProtection from close attacks",
         "Level 44\nEagle Eye\nIncreases your Ranged by 15%",
         "Level 45\nMystic Might\nIncreases your Magic by 15%",
         "Level 46\nRetribution\nInflicts damage to nearby\ntargets if you die",
         "Level 49\nRedemption\nHeals you when damaged\nand Hitpoints falls\nbelow 10%",
         "Level 52\nSmite\n1/4 of damage dealt is\nalso removed from\nopponents Prayer",
         "Level 55\nPreserve\nBoosted stats last 50% longer",
         "Level 60\nChivalry\nIncreases your Defence by 20%,\nStrength by 18% and Attack by\n15%",
         "Level 70\nPiety\nIncreases your Defence by 25%,\nStrength by 23% and Attack by\n20%",
         "Level 74\nRigour\nIncreases your Ranged by 20%\nand your Defence by 25%",
         "Level 77\nAugury\nIncreases your Magic by 20%\nand your Defence by 25%"
      };
      String[] var10 = new String[]{
         "Thick Skin",
         "Burst of Strength",
         "Charity of Thought",
         "Rock Skin",
         "Superhuman Strength",
         "Improved Reflexes",
         "Rapid Restore",
         "Rapid Heal",
         "Protect Item",
         "Steel Skin",
         "Ultimate Strength",
         "Incredible Reflexes",
         "Protect from Magic",
         "Protect from Missiles",
         "Protect from Melee",
         "Retribution",
         "Redemption",
         "Smite"
      };
      b(18000, 0, 601, 7, 0, "Sharp Eye");
      b(18002, 0, 602, 8, 1, "Mystic Will");
      b(18004, 0, 603, 25, 2, "Hawk Eye");
      b(18006, 0, 604, 26, 3, "Mystic Lore");
      b(18008, 0, 605, 43, 4, "Eagle Eye");
      b(18010, 0, 606, 44, 5, "Mystic Might");
      b(18012, 0, 607, 59, 6, "Chivalry");
      b(18014, 0, 608, 69, 7, "Piety");
      b(18045, 0, 609, 73, 8, "Rigour");
      b(18047, 0, 610, 76, 9, "Augury");
      b(18553, 0, 611, 54, 10, "Preserve");
      h(43500, "prayer/sprite 2");
      h(43502, "prayer/sprite 1");
      a(43503, "@or2@0%", this.a, 0, 0, true, true);
      a(43504, "@or2@0%", this.a, 0, 0, true, true);
      a(43505, "@or2@0%", this.a, 0, 0, true, true);
      a(43506, "@or2@0%", this.a, 0, 0, true, true);
      a(43507, "@or2@0%", this.a, 0, 0, true, true);
      a(43508, "Hide stat adjustments", "Hide stat adjustments", this.a, 0, 16750623, true, true, 150);
      rs.p_n.C_e var11 = d(43501);
      var11.P = 174;
      var11.aR = 176;
      var11.aH = 225;
      var11.k(116);
      var1.k(11);

      for (int var12 = 0; var12 < 18; var12++) {
         c(c[var12], var10[var12]);
      }

      for (int var14 = 0; var14 < 29; var14++) {
         a(var3[var14], var6[var14], var14, var9[var14]);
      }

      var1.k(11);

      for (int var15 = 0; var15 < c.length; var15++) {
         byte var13 = -2;
         if (d[var15] > 10) {
            var13 = -4;
         }

         if (d[var15] > 50) {
            var13 -= 2;
         }

         if (d[var15] > 100) {
            var13 -= 2;
         }

         if (d[var15] > 150) {
            var13 -= 2;
         }

         if (c[var15] != 687 && c[var15] != 5651) {
            var11.b(var15, c[var15], d[var15] + var13, e[var15]);
         } else {
            var11.b(var15, c[var15], d[var15] + var13, -5000);
         }
      }

      int var16 = 58;

      for (int var17 = 0; var17 < var3.length; var17++) {
         var11.b(var16, var3[var17], var4[var17], var5[var17]);
         var16++;
      }

      for (int var18 = 0; var18 < var6.length; var18++) {
         var11.b(var16, var6[var18], var7[var18], var8[var18]);
         var16++;
      }

      var1.b(0, 43501, 1, 0);
      var1.b(1, 43500, 1, 220);
      var1.b(2, 43502, 1, 176);
      var1.b(3, 5651, 65, 242);
      var1.b(4, 687, 15, 244);
      var1.b(5, 43503, 20, 207);
      var1.b(6, 43504, 57, 207);
      var1.b(7, 43505, 96, 207);
      var1.b(8, 43506, 135, 207);
      var1.b(9, 43507, 173, 207);
      var1.b(10, 43508, 21, 225);
   }
}
