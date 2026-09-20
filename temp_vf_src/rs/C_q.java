package rs;

public class C_q {
   public static String a(String var0) {
      if (var0 == null) {
         return null;
      } else {
         if (var0.toLowerCase().contains("killer's dagger")) {
            var0 = var0 + "\nThis oddly resembles\na dragon dagger..";
         } else if (var0.contains("Adventurer's whip")) {
            var0 = var0 + "\nDeals +25% damage in PvM\nBut max hit is @or1@capped at 60!";
         } else if (var0.contains("Blood key")) {
            var0 = var0 + "\nUse on @yel@wild caskets\nfor 2x the rewards\nand a chance to obtain\n@mag@rare@whi@ ornament kits.";
         } else if (var0.contains("Summer elixir")) {
            var0 = var0 + "\nGrants @yel@25%@whi@ more @yel@summer\n@yel@gems@whi@ for one hour.";
         } else if (var0.toLowerCase().contains("easter dharok")) {
            var0 = var0
               + "\nUnique dharoks that gives\nextra @gre@+5@whi@ slash bonus on each\npiece. Also has @or1@1/4 chance\nto deal @gre@2x@whi@ damage in PvM.";
         } else if (var0.contains("Superior blood rev scroll")) {
            var0 = var0 + "\n100% chance to spawn @or1@Superior\n@or1@blood rev@whi@ when killing blood revs.\nConsumes scroll on summon.";
         } else if (var0.contains("Spooky hween scroll")) {
            var0 = var0 + "\nGrants @yel@25%@whi@ more @yel@hween\n@yel@tokens@whi@ for one hour.";
         } else if (var0.contains("Seasonal drop boost scroll")) {
            var0 = var0 + "\nGrants @yel@+15%@whi@ drop rate\nonly during @yel@Seasonal events@whi@\nand lasts for one hour.";
         } else if (var0.contains("Seasonal drop doubler scroll")) {
            var0 = var0 + "\nGrants @yel@5%@whi@ chance for 2x drops\nonly during @yel@Seasonal events@whi@\nand lasts for one hour.";
         } else if (var0.contains("Seasonal hotspot scroll")) {
            var0 = var0 + "\nGrants @yel@+25%@whi@ chance for hotspot\ncaskets only during @yel@Seasonal events@whi@\nand lasts for one hour.";
         } else if (var0.contains("Seasonal blood rev scroll")) {
            var0 = var0 + "\nGrants @yel@+25%@whi@ chance for superior\nrev spawns only during @yel@Seasonal evente@whi@\nand lasts for one hour.";
         } else if (var0.contains("Repair scroll")) {
            var0 = var0 + "\nRepairs any piece of broken\narmor, free of charge!";
         } else if (var0.toLowerCase().contains("machete")) {
            var0 = var0 + "\nThis might be useful for\nchopping jungle trees.";
         } else if (var0.toLowerCase().contains("scrapey tree logs")) {
            var0 = var0 + "\nThese can be fletched\ninto trading sticks.";
         } else if (var0.toLowerCase().contains("crest piece")) {
            var0 = var0 + "\nCombine all three pieces\nfor ancient treasures.";
         } else if (var0.toLowerCase().contains("holy shard") || var0.toLowerCase().contains("shard of balance")) {
            var0 = var0 + "\nI should take these to \nKolodion in the Mage arena.";
         } else if (var0.toLowerCase().contains("mystic coins")) {
            var0 = var0 + "\nObtained from a limited\ntime Mage Arena event.";
         } else if (var0.toLowerCase().contains("summer totem")) {
            var0 = var0 + "\nCollect 5 to teleport\nto an instanced event boss!\n(Lunar and Solar demon)";
         } else if (var0.toLowerCase().contains("bloodlust scroll")) {
            if (var0.toLowerCase().contains("refer")) {
               var0 = var0 + "\nEarn @gre@+10@whi@ blood money\nfrom kills for 30 minutes.";
            } else {
               var0 = var0 + "\nEarn @gre@+10@whi@ blood money\nfrom kills for 15 minutes.";
            }
         } else if (var0.toLowerCase().contains("thief's scroll")) {
            var0 = var0 + "\nEarn @gre@2x@whi@ loot from\nthieving for 15 minutes.\n<img=6> Best used at rogue's chest";
         } else if (var0.toLowerCase().contains("larran's loot scroll")) {
            var0 = var0 + "\nEarn @gre@2x@whi@ larran's keys from\nblood slayer for 20 minutes.";
         } else if (var0.toLowerCase().contains("(st.)")) {
            var0 = var0 + "\nThis item can be taken\nto Mandrith to exchange for coins.";
         } else if (var0.toLowerCase().contains("choccy tokens")) {
            var0 = var0 + "\nFrom the limited time\neaster holiday event.";
         } else if (var0.toLowerCase().contains("bloodwyrm scroll")) {
            var0 = var0 + "\nWhen activated, bloodwyrm will\nbe guarenteed to spawn after\nthe next wildywyrm death.";
         } else if (var0.toLowerCase().contains("crumbled summer gem")) {
            var0 = var0 + "\nExpired summer gems from\nthe Summer event of 2017-2019";
         } else if (var0.toLowerCase().contains("lava key")) {
            var0 = var0 + "\nUsed to open the lava chest\nat the center of the lava maze.";
         } else if (var0.toLowerCase().contains("heraldic salvage")) {
            var0 = var0 + "\nSalvages are used in\nthe enchantment chest\nfor enchanted heraldics.";
         } else if (var0.contains("Dragon upgrade scroll")) {
            var0 = var0 + "\nBoosts accuracy of all\ndragon weapon special\nattacks by +15%";
         } else if (var0.contains("Egg weapon charge")) {
            var0 = var0 + "\nBinding this to an\neaster weapon will\nprogress it further\ninto its imbued form!";
         } else if (var0.contains("Holiday cake")) {
            var0 = var0 + "\nGrants @yel@25%@whi@ more @yel@winter\n@yel@shards@whi@ for one hour.";
         } else if (var0.contains("Vintage dungeon tele")) {
            var0 = var0 + "\nTeleports you to a Singles+ wildy\ndungeon where most customs\nare restricted!";
         } else {
            if (!var0.toLowerCase().contains("beginner ags") && !var0.toLowerCase().contains("beginner dragon claws")) {
               return null;
            }

            var0 = var0 + "\nCrumbles to dust after you\napply 75 hits in PvP combat.";
         }

         return var0;
      }
   }
}
