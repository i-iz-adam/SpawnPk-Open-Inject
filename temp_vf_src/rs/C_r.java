package rs;

import rs.p_gui.C_Launcher_mc;

public class C_r {
   public static boolean a(String var0) {
      int[] var1 = null;
      if (var0.contains("Donator mystery box")) {
         var0 = var0 + "\nHas a chance to give some of the \nmost valuable items in the game!";
         var1 = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
      } else if (var0.contains("Boost pack (5)")) {
         var0 = var0 + "\nGives 5 random boosts!";
         var1 = new int[]{23620, 23621, 23622, 21163, 22091, 24172, 24182, 23461, 21736};
      } else if (var0.contains("Exotic mystery box")) {
         var0 = var0 + "\nGives exotic & unique rewards.";
         var1 = new int[]{27479, 27486, 27480, 27481, 27484, 27485, 27482, 27184};
      } else if (var0.contains("Prize ticket (u)")) {
         var0 = var0 + "\nGives 2 random prizes!";
         var1 = new int[]{22876, 22099, 6200, 14523, 10524, 7678, 13999};
      } else if (var0.contains("Blood key")) {
         var0 = var0 + "\nUse on @yel@blood wild caskets\nfor 2x the rewards\nand a chance to obtain\n@mag@very rare@whi@ rewards.";
         var1 = new int[]{22887, 22889, 22888, 21073, 21663, 21664, 21872, 21869, 21870};
      } else if (var0.contains("Grand blood key")) {
         var0 = var0 + "\nUse on @yel@blood wild caskets\nfor 2x the rewards\nand a guaranteed\n@mag@very rare@whi@ reward.";
         var1 = new int[]{22887, 22889, 22888, 21073, 21663, 21664, 21872, 21869, 21870};
      } else if (var0.contains("PvP mystery box")) {
         var0 = var0 + "\nGives a random morrigan, zuriel,\nstatius or vesta armor or weapon piece.";
         var0 = var0 + "\nHas a @or1@rare chance@whi@ to give @cya@strongest@whi@ pvp\nweapons in the game!";
         var1 = new int[]{22887, 22889, 22888, 21073};
      } else if (var0.contains("Rare event box")) {
         var0 = var0 + "\nGuarantees one of the most valuable rares";
         var0 = var0 + "\nfrom previous SpawnPK events!";
         var1 = new int[]{20797, 22850, 22851, 22883, 23228, 21818};
      } else if (var0.contains("Bond casket key")) {
         var0 = var0 + "\nUse on a @yel@Bond casket@whi@ to receive\na random bond between $30 and $100.";
         var1 = new int[]{16003, 16004, 16005, 16006};
      } else if (var0.contains("Bond casket")) {
         var0 = var0 + "\nGives a random bond between\n$5 and $30 bonds.";
         var1 = new int[]{16000, 16001, 16002, 16003};
      } else if (var0.contains("Mystery crate")) {
         var0 = var0 + "\nGives a random Bounty shop item.";
         var0 = var0 + "\nHas a @or1@rare chance@whi@ to give @cya@imbued Abyssal dagger@whi@!";
         var1 = new int[]{12912, 19335, 20554, 20555, 20556, 22227, 22216, 21106, 21013, 23161, 23180};
      } else if (var0.contains("3rd age mystery box")) {
         var0 = var0 + "\nGives a random original 3rd age item,\nnot including the bow and sword.";
         var1 = new int[]{10330, 10332, 10338, 10340, 10346, 10348, 10350, 10352, 12422};
      } else if (var0.contains("H'ween mystery box")) {
         var0 = var0 + "\n@or1@Seasonal\nHas a chance to give some of the \nmost valuable items in the game!\nAlso gives 25-300 h'ween event tokens!\n";
         var1 = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
      } else if (var0.contains("Easter mystery box")) {
         var0 = var0 + "\n@cya@Seasonal\nHas a chance to give some of the \nmost valuable items in the game!\nAlso may include an extra easter item!";
         var1 = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
      } else if (var0.contains("Summer mystery box")) {
         var0 = var0 + " @whi@- @yel@Seasonal!\nHas a chance to give some of the \nmost valuable items in the game!\nAlso has a chance for 2X rewards!";
         var1 = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
      } else if (var0.contains("Holiday mystery box")) {
         var0 = var0 + " @whi@- @yel@Seasonal!\nGives 50-100 winter shards upon opening";
         var1 = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
      } else if (var0.contains("Ultimate mystery chest")) {
         var0 = var0 + "\nOpens 5 donor mystery boxes at once.\nEach item is a guaranteed rare!\n@or1@Not useable with prize keys!";
         var1 = new int[]{
            20539,
            20540,
            25103,
            20485,
            25101,
            20468,
            20486,
            20483,
            14990,
            14995,
            14994,
            12111,
            4084,
            3268,
            14992,
            14991,
            13740,
            13576,
            15135,
            19554,
            20065,
            14997,
            14999
         };
      } else if (var0.contains("Mystery chest")) {
         var0 = var0 + "\nOpens 5 donor mystery boxes at once.\nAlso has a rare chance of giving blood \ndiamond items!";
         var1 = new int[]{
            20539,
            20540,
            25103,
            20485,
            25101,
            20468,
            20486,
            20483,
            14990,
            14995,
            14994,
            12111,
            4084,
            3268,
            14992,
            14991,
            13740,
            13576,
            15135,
            19554,
            20065,
            14997,
            14999
         };
      } else if (var0.contains("H'ween mystery chest")) {
         var0 = var0 + "\n@or1@Seasonal\nOpens 5 donor mystery boxes at once.\nRare chance for blood diamond items! \nGives 250-1500 h'ween event tokens.";
         var1 = new int[]{
            20539,
            20540,
            25103,
            20485,
            25101,
            20468,
            20486,
            20483,
            14990,
            14995,
            14994,
            12111,
            4084,
            3268,
            14992,
            14991,
            13740,
            13576,
            15135,
            19554,
            20065,
            14997,
            14999
         };
      } else if (var0.contains("Easter mystery chest")) {
         var0 = var0
            + "\nMystery chest with a rare chance for\nan easter partyhat, flippers, or\npet accessory! Additionally gives\nstacks of choccy tokens alongside loot.";
         var1 = new int[]{21063, 21068, 21062, 20539, 20540, 25103, 20485, 25101, 20468};
      } else if (var0.contains("Blood chest")) {
         var0 = var0 + "\nOpens 5 donor mystery boxes at once.\nGuarentees at least one blood diamond item.";
         var1 = new int[]{
            20539,
            20540,
            25103,
            20485,
            25101,
            20468,
            20486,
            20483,
            14990,
            14995,
            14994,
            12111,
            4084,
            3268,
            14992,
            14991,
            13740,
            13576,
            15135,
            19554,
            20065,
            14997,
            14999
         };
      } else if (var0.contains("Mystery bag")) {
         var0 = var0 + "\nOpens 3 donor mystery boxes at once.\nAlso has a rare chance of giving blood \ndiamond items!";
         var1 = new int[]{
            25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999
         };
      } else if (var0.contains("Cursed mystery crate")) {
         var0 = var0 + "\nChance to give bounty shop\nrewards as well as other unique\nrewards that can only be\nobtained from this crate!";
         var1 = new int[]{22084, 21870, 21823, 21824, 21833, 21866, 21845, 21846, 21847, 21848, 21849, 16000};
      } else if (var0.contains("Epic pet mystery chest")) {
         var0 = " @gre@Epic pet chest\nOpens for five commonly high valued pets.\nRare chance for fusion pets!";
         var1 = new int[]{20503, 20504, 12115, 12117, 12113, 19240, 25104, 19382, 11157, 12111, 15000, 25103, 25101, 3268};
      } else if (var0.contains("Epic pet mystery box")) {
         var0 = " @gre@Epic pet box\nCommonly gives high valued pets.\nRare chance for fusion pets!";
         var1 = new int[]{20503, 20504, 12115, 12117, 12113, 19240, 25104, 19382, 11157, 12111, 15000, 25103, 25101, 3268};
      } else if (var0.contains("Pet fuse box")) {
         var0 = var0 + "\nGives a random epic fusion pet.";
         var1 = new int[]{25104, 12113, 19382, 19240, 20692, 15004};
      } else if (var0.contains("Pet fuse chest")) {
         var0 = var0 + "\nGives five random epic fusion pets.";
         var1 = new int[]{25104, 12113, 19382, 19240, 20692, 15004};
      } else if (var0.contains("Christmas cracker")) {
         var0 = var0 + "\nOpen with a friend and both of you will \nreceive a rare item! Very rare chance for \nan @cya@enchanted partyhat or h'ween mask!";
         var1 = new int[]{19042, 11864, 11862, 1042, 1038, 1040, 1044, 1046, 1048, 1050, 19043, 1053, 1055, 1057, 4274};
      } else if (var0.contains("Easter cracker")) {
         var0 = var0 + "\nOpen with a friend and both of you will \nreceive a rare item! Very rare chance \nfor an @cya@Easter partyhat!";
         var1 = new int[]{21063, 19042, 11864, 11862, 1042, 1038, 1040, 1044, 1046, 1048, 1050, 19043, 1053, 1055, 1057, 4274};
      } else if (var0.contains("Summer package")) {
         var0 = var0
            + "\n@cya@Limited seasonal item!\nOpens for the following:\n- Past promotional item (rare \nchance for a pet fuse box)\n- 25,000 summer gems\n- Complimentary bond ($20-30)\n- Summer mystery box";
         var1 = new int[]{21132, 20577, 20701, 20731, 20771, 16002, 16003};
      } else if (var0.contains("$75.00 bond")) {
         var0 = var0
            + "\nOpens for @yel@7,500 donator tickets.\nAlso opens for @yel@1 FREE mystery box\nYou'll also receive +$75 total\ndonated upon opening the bond.";
         var1 = new int[]{4067, 6200, 4067, 6200, 4067, 6200, 4067, 6200};
      } else if (var0.contains("$100.00 bond")) {
         var0 = var0
            + "\nOpens for @yel@10,000 donator tickets.\nAlso opens for @yel@3 FREE mystery boxes\nYou'll also receive +$100 total\ndonated upon opening the bond.";
         var1 = new int[]{4067, 6200, 6200, 6200};
      } else if (var0.contains("$500.00 bond")) {
         var0 = var0
            + "\nOpens for @yel@50,000 donator tickets.\nAlso opens for @yel@3 FREE mystery chests\nYou'll also receive +$500 total\ndonated upon opening the bond.";
         var1 = new int[]{4067, 14523, 14523, 14523};
      } else if (var0.contains("H'ween package")) {
         var0 = var0
            + "\n@cya@Limited time season item!\nOpens for the following:\n- 5,000 h'ween tokens\n- H'ween mystery chest\n- Prize key\n- Chance for a promo item";
         var1 = new int[]{21689, 21690, 7678, 20731, 20771};
      } else if (var0.contains("Ultimate h'ween package")) {
         var0 = var0
            + "\n@cya@Limited time season item!\nOpens for the following:\n- 10,000 h'ween tokens\n- H'ween mystery chest\n- Grand prize key\n- Guarenteed promo item";
         var1 = new int[]{21689, 21690, 7678, 20731, 20771};
      } else if (var0.contains("H'ween 2019 casket")) {
         var0 = var0 + "\n@cya@Grants a random rare from the following:\n- Blood reaper scythe hilt\n- Blood reaper pet\n- Reaper bludgeon\n- 3x h'ween dyes";
         var1 = new int[]{23202, 23204, 23217, 23224};
      } else if (var0.contains("Winter 2019 casket")) {
         var0 = var0 + "\n@cya@Grants a random rare from the following:\n- Frosty twisted branch\n- Winter demon pet\n- Promo package III\n- 3x Grand crests";
         var1 = new int[]{21819, 21805, 21605, 20771};
      } else if (var0.contains("Easter 2020 casket")) {
         var0 = var0
            + "\n@cya@Grants a random rare from the following:\n- Easter elemental c'bow\n- Easter dragon pet\n- 3x Easter dyes\n- 3x Grand crests\n- Grand promo package @yel@(rare)";
         var1 = new int[]{21945, 21915, 20771, 21880, 21665};
      } else if (var0.contains("Summer 2020 casket")) {
         var0 = var0
            + "\n@cya@Grants a random rare from the following:\n- Lunar saradomin sword\n- Lunar hide body / chaps\n- Solar dark bow\n- Solar / Lunar demon pet\n- Solar / Lunar icon\n- Grand promo package @yel@(rare)";
         var1 = new int[]{22017, 22016, 22002, 22001, 22030, 22029, 21665};
      }

      if (var1 == null) {
         return false;
      } else {
         int var2 = C_Client_mc.hQ - 10;
         int var3 = C_Client_mc.hP - 10;
         if (C_Client_mc.cH == 60600 || C_Client_mc.cH == 52000 && rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
            var2 = C_Client_mc.hQ + 110;
         }

         C_Launcher_mc.n().o().a(var3, var2, "@lre@" + var0, var1);
         return true;
      }
   }
}
