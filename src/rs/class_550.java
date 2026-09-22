package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_550.class */
public class class_550 {
    public static String a(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        if (str.toLowerCase().contains("killer's dagger")) {
            str2 = str + "\nThis oddly resembles\na dragon dagger..";
        } else if (str.contains("Adventurer's whip")) {
            str2 = str + "\nDeals +25% damage in PvM\nBut max hit is @or1@capped at 60!";
        } else if (str.contains("Blood key")) {
            str2 = str + "\nUse on @yel@wild caskets\nfor 2x the rewards\nand a chance to obtain\n@mag@rare@whi@ ornament kits.";
        } else if (str.contains("Summer elixir")) {
            str2 = str + "\nGrants @yel@25%@whi@ more @yel@summer\n@yel@gems@whi@ for one hour.";
        } else if (str.toLowerCase().contains("easter dharok")) {
            str2 = str + "\nUnique dharoks that gives\nextra @gre@+5@whi@ slash bonus on each\npiece. Also has @or1@1/4 chance\nto deal @gre@2x@whi@ damage in PvM.";
        } else if (str.contains("Superior blood rev scroll")) {
            str2 = str + "\n100% chance to spawn @or1@Superior\n@or1@blood rev@whi@ when killing blood revs.\nConsumes scroll on summon.";
        } else if (str.contains("Spooky hween scroll")) {
            str2 = str + "\nGrants @yel@25%@whi@ more @yel@hween\n@yel@tokens@whi@ for one hour.";
        } else if (str.contains("Seasonal drop boost scroll")) {
            str2 = str + "\nGrants @yel@+15%@whi@ drop rate\nonly during @yel@Seasonal events@whi@\nand lasts for one hour.";
        } else if (str.contains("Seasonal drop doubler scroll")) {
            str2 = str + "\nGrants @yel@5%@whi@ chance for 2x drops\nonly during @yel@Seasonal events@whi@\nand lasts for one hour.";
        } else if (str.contains("Seasonal hotspot scroll")) {
            str2 = str + "\nGrants @yel@+25%@whi@ chance for hotspot\ncaskets only during @yel@Seasonal events@whi@\nand lasts for one hour.";
        } else if (str.contains("Seasonal blood rev scroll")) {
            str2 = str + "\nGrants @yel@+25%@whi@ chance for superior\nrev spawns only during @yel@Seasonal evente@whi@\nand lasts for one hour.";
        } else if (str.contains("Repair scroll")) {
            str2 = str + "\nRepairs any piece of broken\narmor, free of charge!";
        } else if (str.toLowerCase().contains("machete")) {
            str2 = str + "\nThis might be useful for\nchopping jungle trees.";
        } else if (str.toLowerCase().contains("scrapey tree logs")) {
            str2 = str + "\nThese can be fletched\ninto trading sticks.";
        } else if (str.toLowerCase().contains("crest piece")) {
            str2 = str + "\nCombine all three pieces\nfor ancient treasures.";
        } else if (str.toLowerCase().contains("holy shard") || str.toLowerCase().contains("shard of balance")) {
            str2 = str + "\nI should take these to \nKolodion in the Mage arena.";
        } else if (str.toLowerCase().contains("mystic coins")) {
            str2 = str + "\nObtained from a limited\ntime Mage Arena event.";
        } else if (str.toLowerCase().contains("summer totem")) {
            str2 = str + "\nCollect 5 to teleport\nto an instanced event boss!\n(Lunar and Solar demon)";
        } else if (str.toLowerCase().contains("bloodlust scroll")) {
            str2 = str.toLowerCase().contains("refer") ? str + "\nEarn @gre@+10@whi@ blood money\nfrom kills for 30 minutes." : str + "\nEarn @gre@+10@whi@ blood money\nfrom kills for 15 minutes.";
        } else if (str.toLowerCase().contains("thief's scroll")) {
            str2 = str + "\nEarn @gre@2x@whi@ loot from\nthieving for 15 minutes.\n<img=6> Best used at rogue's chest";
        } else if (str.toLowerCase().contains("larran's loot scroll")) {
            str2 = str + "\nEarn @gre@2x@whi@ larran's keys from\nblood slayer for 20 minutes.";
        } else if (str.toLowerCase().contains("(st.)")) {
            str2 = str + "\nThis item can be taken\nto Mandrith to exchange for coins.";
        } else if (str.toLowerCase().contains("choccy tokens")) {
            str2 = str + "\nFrom the limited time\neaster holiday event.";
        } else if (str.toLowerCase().contains("bloodwyrm scroll")) {
            str2 = str + "\nWhen activated, bloodwyrm will\nbe guarenteed to spawn after\nthe next wildywyrm death.";
        } else if (str.toLowerCase().contains("crumbled summer gem")) {
            str2 = str + "\nExpired summer gems from\nthe Summer event of 2017-2019";
        } else if (str.toLowerCase().contains("lava key")) {
            str2 = str + "\nUsed to open the lava chest\nat the center of the lava maze.";
        } else if (str.toLowerCase().contains("heraldic salvage")) {
            str2 = str + "\nSalvages are used in\nthe enchantment chest\nfor enchanted heraldics.";
        } else if (str.contains("Dragon upgrade scroll")) {
            str2 = str + "\nBoosts accuracy of all\ndragon weapon special\nattacks by +15%";
        } else if (str.contains("Egg weapon charge")) {
            str2 = str + "\nBinding this to an\neaster weapon will\nprogress it further\ninto its imbued form!";
        } else if (str.contains("Holiday cake")) {
            str2 = str + "\nGrants @yel@25%@whi@ more @yel@winter\n@yel@shards@whi@ for one hour.";
        } else if (str.contains("Vintage dungeon tele")) {
            str2 = str + "\nTeleports you to a Singles+ wildy\ndungeon where most customs\nare restricted!";
        } else {
            if (!str.toLowerCase().contains("beginner ags") && !str.toLowerCase().contains("beginner dragon claws")) {
                return null;
            }
            str2 = str + "\nCrumbles to dust after you\napply 75 hits in PvP combat.";
        }
        return str2;
    }
}
