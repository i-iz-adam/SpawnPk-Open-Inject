package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.opencl.CL10;
import org.lwjgl.system.linux.FCNTL;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_579.class */
public class class_579 {
    public static boolean a(String str) {
        int[] iArr = null;
        if (str.contains("Donator mystery box")) {
            str = str + "\nHas a chance to give some of the \nmost valuable items in the game!";
            iArr = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (str.contains("Boost pack (5)")) {
            str = str + "\nGives 5 random boosts!";
            iArr = new int[]{23620, 23621, 23622, 21163, 22091, 24172, 24182, 23461, 21736};
        } else if (str.contains("Exotic mystery box")) {
            str = str + "\nGives exotic & unique rewards.";
            iArr = new int[]{27479, 27486, 27480, 27481, 27484, 27485, 27482, 27184};
        } else if (str.contains("Prize ticket (u)")) {
            str = str + "\nGives 2 random prizes!";
            iArr = new int[]{22876, 22099, aU.Ak, 14523, 10524, 7678, 13999};
        } else if (str.contains("Blood key")) {
            str = str + "\nUse on @yel@blood wild caskets\nfor 2x the rewards\nand a chance to obtain\n@mag@very rare@whi@ rewards.";
            iArr = new int[]{22887, 22889, 22888, 21073, 21663, 21664, 21872, 21869, 21870};
        } else if (str.contains("Grand blood key")) {
            str = str + "\nUse on @yel@blood wild caskets\nfor 2x the rewards\nand a guaranteed\n@mag@very rare@whi@ reward.";
            iArr = new int[]{22887, 22889, 22888, 21073, 21663, 21664, 21872, 21869, 21870};
        } else if (str.contains("PvP mystery box")) {
            str = (str + "\nGives a random morrigan, zuriel,\nstatius or vesta armor or weapon piece.") + "\nHas a @or1@rare chance@whi@ to give @cya@strongest@whi@ pvp\nweapons in the game!";
            iArr = new int[]{22887, 22889, 22888, 21073};
        } else if (str.contains("Rare event box")) {
            str = (str + "\nGuarantees one of the most valuable rares") + "\nfrom previous SpawnPK events!";
            iArr = new int[]{20797, 22850, 22851, 22883, 23228, 21818};
        } else if (str.contains("Bond casket key")) {
            str = str + "\nUse on a @yel@Bond casket@whi@ to receive\na random bond between $30 and $100.";
            iArr = new int[]{16003, 16004, 16005, 16006};
        } else if (str.contains("Bond casket")) {
            str = str + "\nGives a random bond between\n$5 and $30 bonds.";
            iArr = new int[]{16000, 16001, 16002, 16003};
        } else if (str.contains("Mystery crate")) {
            str = (str + "\nGives a random Bounty shop item.") + "\nHas a @or1@rare chance@whi@ to give @cya@imbued Abyssal dagger@whi@!";
            iArr = new int[]{12912, 19335, 20554, 20555, 20556, 22227, 22216, 21106, 21013, 23161, 23180};
        } else if (str.contains("3rd age mystery box")) {
            str = str + "\nGives a random original 3rd age item,\nnot including the bow and sword.";
            iArr = new int[]{10330, 10332, 10338, 10340, 10346, 10348, 10350, 10352, 12422};
        } else if (str.contains("H'ween mystery box")) {
            str = str + "\n@or1@Seasonal\nHas a chance to give some of the \nmost valuable items in the game!\nAlso gives 25-300 h'ween event tokens!\n";
            iArr = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (str.contains("Easter mystery box")) {
            str = str + "\n@cya@Seasonal\nHas a chance to give some of the \nmost valuable items in the game!\nAlso may include an extra easter item!";
            iArr = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (str.contains("Summer mystery box")) {
            str = str + " @whi@- @yel@Seasonal!\nHas a chance to give some of the \nmost valuable items in the game!\nAlso has a chance for 2X rewards!";
            iArr = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (str.contains("Holiday mystery box")) {
            str = str + " @whi@- @yel@Seasonal!\nGives 50-100 winter shards upon opening";
            iArr = new int[]{11864, 12111, 4084, 3268, 13740, 13576, 15135, 19554, 20065};
        } else if (str.contains("Ultimate mystery chest")) {
            str = str + "\nOpens 5 donor mystery boxes at once.\nEach item is a guaranteed rare!\n@or1@Not useable with prize keys!";
            iArr = new int[]{20539, 20540, 25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (str.contains("Mystery chest")) {
            str = str + "\nOpens 5 donor mystery boxes at once.\nAlso has a rare chance of giving blood \ndiamond items!";
            iArr = new int[]{20539, 20540, 25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (str.contains("H'ween mystery chest")) {
            str = str + "\n@or1@Seasonal\nOpens 5 donor mystery boxes at once.\nRare chance for blood diamond items! \nGives 250-1500 h'ween event tokens.";
            iArr = new int[]{20539, 20540, 25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (str.contains("Easter mystery chest")) {
            str = str + "\nMystery chest with a rare chance for\nan easter partyhat, flippers, or\npet accessory! Additionally gives\nstacks of choccy tokens alongside loot.";
            iArr = new int[]{21063, 21068, 21062, 20539, 20540, 25103, 20485, 25101, 20468};
        } else if (str.contains("Blood chest")) {
            str = str + "\nOpens 5 donor mystery boxes at once.\nGuarentees at least one blood diamond item.";
            iArr = new int[]{20539, 20540, 25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (str.contains("Mystery bag")) {
            str = str + "\nOpens 3 donor mystery boxes at once.\nAlso has a rare chance of giving blood \ndiamond items!";
            iArr = new int[]{25103, 20485, 25101, 20468, 20486, 20483, 14990, 14995, 14994, 12111, 4084, 3268, 14992, 14991, 13740, 13576, 15135, 19554, 20065, 14997, 14999};
        } else if (str.contains("Cursed mystery crate")) {
            str = str + "\nChance to give bounty shop\nrewards as well as other unique\nrewards that can only be\nobtained from this crate!";
            iArr = new int[]{22084, 21870, 21823, 21824, 21833, 21866, 21845, 21846, 21847, 21848, 21849, 16000};
        } else if (str.contains("Epic pet mystery chest")) {
            str = " @gre@Epic pet chest\nOpens for five commonly high valued pets.\nRare chance for fusion pets!";
            iArr = new int[]{20503, 20504, 12115, 12117, 12113, 19240, 25104, 19382, 11157, 12111, 15000, 25103, 25101, 3268};
        } else if (str.contains("Epic pet mystery box")) {
            str = " @gre@Epic pet box\nCommonly gives high valued pets.\nRare chance for fusion pets!";
            iArr = new int[]{20503, 20504, 12115, 12117, 12113, 19240, 25104, 19382, 11157, 12111, 15000, 25103, 25101, 3268};
        } else if (str.contains("Pet fuse box")) {
            str = str + "\nGives a random epic fusion pet.";
            iArr = new int[]{25104, 12113, 19382, 19240, 20692, aU.Ue};
        } else if (str.contains("Pet fuse chest")) {
            str = str + "\nGives five random epic fusion pets.";
            iArr = new int[]{25104, 12113, 19382, 19240, 20692, aU.Ue};
        } else if (str.contains("Christmas cracker")) {
            str = str + "\nOpen with a friend and both of you will \nreceive a rare item! Very rare chance for \nan @cya@enchanted partyhat or h'ween mask!";
            iArr = new int[]{19042, 11864, 11862, 1042, FCNTL.F_SET_FILE_RW_HINT, 1040, 1044, 1046, 1048, 1050, 19043, aU.jy, aU.jA, aU.jC, CL10.CL_RG};
        } else if (str.contains("Easter cracker")) {
            str = str + "\nOpen with a friend and both of you will \nreceive a rare item! Very rare chance \nfor an @cya@Easter partyhat!";
            iArr = new int[]{21063, 19042, 11864, 11862, 1042, FCNTL.F_SET_FILE_RW_HINT, 1040, 1044, 1046, 1048, 1050, 19043, aU.jy, aU.jA, aU.jC, CL10.CL_RG};
        } else if (str.contains("Summer package")) {
            str = str + "\n@cya@Limited seasonal item!\nOpens for the following:\n- Past promotional item (rare \nchance for a pet fuse box)\n- 25,000 summer gems\n- Complimentary bond ($20-30)\n- Summer mystery box";
            iArr = new int[]{21132, 20577, 20701, 20731, 20771, 16002, 16003};
        } else if (str.contains("$75.00 bond")) {
            str = str + "\nOpens for @yel@7,500 donator tickets.\nAlso opens for @yel@1 FREE mystery box\nYou'll also receive +$75 total\ndonated upon opening the bond.";
            iArr = new int[]{4067, aU.Ak, 4067, aU.Ak, 4067, aU.Ak, 4067, aU.Ak};
        } else if (str.contains("$100.00 bond")) {
            str = str + "\nOpens for @yel@10,000 donator tickets.\nAlso opens for @yel@3 FREE mystery boxes\nYou'll also receive +$100 total\ndonated upon opening the bond.";
            iArr = new int[]{4067, aU.Ak, aU.Ak, aU.Ak};
        } else if (str.contains("$500.00 bond")) {
            str = str + "\nOpens for @yel@50,000 donator tickets.\nAlso opens for @yel@3 FREE mystery chests\nYou'll also receive +$500 total\ndonated upon opening the bond.";
            iArr = new int[]{4067, 14523, 14523, 14523};
        } else if (str.contains("H'ween package")) {
            str = str + "\n@cya@Limited time season item!\nOpens for the following:\n- 5,000 h'ween tokens\n- H'ween mystery chest\n- Prize key\n- Chance for a promo item";
            iArr = new int[]{21689, 21690, 7678, 20731, 20771};
        } else if (str.contains("Ultimate h'ween package")) {
            str = str + "\n@cya@Limited time season item!\nOpens for the following:\n- 10,000 h'ween tokens\n- H'ween mystery chest\n- Grand prize key\n- Guarenteed promo item";
            iArr = new int[]{21689, 21690, 7678, 20731, 20771};
        } else if (str.contains("H'ween 2019 casket")) {
            str = str + "\n@cya@Grants a random rare from the following:\n- Blood reaper scythe hilt\n- Blood reaper pet\n- Reaper bludgeon\n- 3x h'ween dyes";
            iArr = new int[]{23202, 23204, 23217, 23224};
        } else if (str.contains("Winter 2019 casket")) {
            str = str + "\n@cya@Grants a random rare from the following:\n- Frosty twisted branch\n- Winter demon pet\n- Promo package III\n- 3x Grand crests";
            iArr = new int[]{21819, 21805, 21605, 20771};
        } else if (str.contains("Easter 2020 casket")) {
            str = str + "\n@cya@Grants a random rare from the following:\n- Easter elemental c'bow\n- Easter dragon pet\n- 3x Easter dyes\n- 3x Grand crests\n- Grand promo package @yel@(rare)";
            iArr = new int[]{21945, 21915, 20771, 21880, 21665};
        } else if (str.contains("Summer 2020 casket")) {
            str = str + "\n@cya@Grants a random rare from the following:\n- Lunar saradomin sword\n- Lunar hide body / chaps\n- Solar dark bow\n- Solar / Lunar demon pet\n- Solar / Lunar icon\n- Grand promo package @yel@(rare)";
            iArr = new int[]{22017, 22016, 22002, 22001, 22030, 22029, 21665};
        }
        if (iArr == null) {
            return false;
        }
        int i = Client.hQ - 10;
        int i2 = Client.hP - 10;
        if (Client.cH == 60600 || (Client.cH == 52000 && Configuration.ai == class_151.a)) {
            i = Client.hQ + 110;
        }
        Launcher.n().o().a(i2, i, "@lre@" + str, iArr);
        return true;
    }
}
