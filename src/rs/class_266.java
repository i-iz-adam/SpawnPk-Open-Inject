package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_266.class */
public enum class_266 {
    a("", 0),
    b("Hunter elixir\nDouble blood slayer points\n(Does not stack with streak bonus)", 27456),
    c("Hunter elixir\nDouble soul shards", 27455),
    d("Dfs cooldown", 11284),
    e("Twisted heart\nCooldown duration", 21092),
    f("Vote Boost\n+10% PvM damage\n+10% Drop rate bonus", 26982),
    g("Vengeance cooldown", "popups/vengtimer", 13, 4),
    h("Antifire duration", "popups/antitimer", 13, 2),
    i("Anti-venom duration", "popups/venomtimer", 13, 2),
    j("Charge duration", "popups/chargetimer", 12, 4),
    k("Stamina duration", "popups/staminatimer", 13, 2),
    l("Teleblock duration", "popups/teleblocktimer", 9, 2),
    m("Pet silence\nWhile under silence, your \npet's effects are disabled and \nyou can't release other pets!", "popups/petblocktimer", 9, 2),
    n("Blood lust\nEarn +10 blood money\nfrom player kills.", "popups/bloodlust", 12, 4),
    o("Survival timer\nAfter this duration, you lose.\nYou can gain more time by\nplayer kills and chest loots.", "popups/minigame", 12, 5),
    p("Amnesty\nWhile under amnesty, \nplayers can't harm you.\nAttacking a player or the\njungle demon will cancel it.", "popups/amnestyskull", 11, 2),
    q("Magic sickness\nYou can't teleport in 20+ wild\nwith your spellbook, items, or\npets during sickness.", "popups/sicknesstimer", 9, 2),
    r("Kharazi safe bank\nAfter this duration\nyou will be removed\nfrom the bank hut.", "popups/banktimer", 11, 4),
    s("Freeze duration", "popups/freeze", 11, 4),
    t("Imbued heart\nCooldown duration", "popups/imbued", 10, 3),
    u("Enchanted heart\nCooldown duration", "popups/enchantedheart", 10, 3),
    v("Infernal heart\nCooldown duration", "popups/infernal", 10, 3),
    w("Drop rate bonus\nChaos elemental", "popups/drbonus", 10, 4),
    x("Drop rate bonus\nBarrelchest", "popups/drbonus", 10, 4),
    y("Drop rate bonus\nKraken", "popups/drbonus", 10, 4),
    z("Drop rate bonus\nVet'ion", "popups/drbonus", 10, 4),
    A("Drop rate bonus\nCrazy archaeologist", "popups/drbonus", 10, 4),
    B("Blood slayer task\nComplete the task in time!", "popups/slayer", 11, 4),
    C("Drop rate bonus\nDemonic gorilla", "popups/drbonus", 10, 4),
    D("Drop rate bonus\nWildywyrm", "popups/drbonus", 10, 4),
    E("Thief scroll\n@gre@2x@whi@ loot from\nthieving.", "popups/drbonus", 10, 4),
    F("Larran's loot\n@gre@2x@whi@ larrans keys from\nblood slayer tasks.", "popups/drbonus", 10, 4),
    G("Drop rate bonus\nDrop rate increased by +5%", "popups/drbonus", 10, 4),
    H("Event booster\nGives @gre@25%@whi@ more @yel@event\n@yel@currency@whi@ from @or1@World events!", "popups/eventboost", 10, 4),
    I("Event booster\nGives @gre@25%@whi@ more @yel@event\n@yel@currency@whi@ from @or1@World events!", "popups/eventboost", 10, 4),
    J("Hunger games perk\nTemporary power-up perk", "popups/eventboost", 10, 4),
    K("Coin bonus\nPvM GP increased by +25%", "popups/drbonus", 10, 4),
    L("Luck scroll\nDrop rate bonus @gre@+10%", "popups/drbonus", 10, 4),
    M("Super luck scroll\nDrop rate bonus @gre@+15%", "popups/drbonus", 10, 4),
    N("Minigame scroll\n2x minigame points & +25%\nKharazi drop rate", "popups/drbonus", 10, 4),
    O("Blood discount\n@gre@10%@whi@ cheaper purchases\nfrom Blood fountain shops!", "popups/drbonus", 10, 4),
    P("Hotspot bonus\n@gre@2x@whi@ Hotspot Points <img=158>\nfrom hotspots for limited time", "popups/drbonus", 10, 4),
    Q("Vintage bonus\n2X Vintage points and\n+25% ticket drops", "popups/drbonus", 10, 4),
    R("Raid scroll\nRaids reward chance @gre@+10%", "popups/drbonus", 10, 4),
    S("Slayer crystal\nDouble slayer and\nblood slayer points", "popups/drbonus", 10, 4),
    T("Hotspot crystal\nDouble chance for\nhot spot caskets", "popups/drbonus", 10, 4),
    U("Raids chart\nIncreased chance for\nraids chest rares!", "popups/drbonus", 10, 4),
    V("Seasonal boost\nGives @gre@+15%@whi@ more @yel@drop\n@yel@rate bonus@whi@ during Seasonal event!", "popups/eventboost", 10, 4),
    W("Seasonal double\nGives @gre@+5%@whi@ chance for @yel@doubled\n@yel@drops@whi@ during Seasonal event!", "popups/eventboost", 10, 4),
    X("Seasonal hotspot\nGives @gre@25%@whi@ more @yel@hotspot\n@yel@caskets@whi@ during Seasonal event!", "popups/eventboost", 10, 4),
    Y("Seasonal revs\nGives @gre@25%@whi@ more @yel@superior\n@yel@revenants@whi@ during Seasonal event!", "popups/eventboost", 10, 4),
    Z("Adventure Scroll\n+10 blood money from PKs\n+15% PvM damage\n+25% Drop rate bonus", "popups/drbonus", 11, 4),
    aa("Dragon Boost\n+10% PvM damage\nagainst Dragons", "popups/pvmboost", 11, 4),
    ab("Revenant Boost\n+10% PvM damage\nagainst Revenants", "popups/pvmboost", 11, 4),
    ac("Deep Wild Boost\n+10% PvM damage\nin Deep Wild", "popups/pvmboost", 11, 4),
    ad("Raid Boost\n+10% PvM damage\nagainst Raid monsters", "popups/pvmboost", 11, 4),
    ae("Maledictus Boost\n+20% Superior Blood\nRevenant chance", "popups/drbonus", 11, 4),
    af("Slayer speed pass\nAssigned slayer tasks\nhave kill requirements\nreduced by 50%", "popups/slayer", 11, 4),
    ag("Donator elixir\n2X zone tokens for\n all donator zones", "popups/dzone_elixir", 11, 4),
    ah("Cosmic gold\nReceive @gre@+25%@whi@ more gold\nfrom all PvM drops", "popups/drbonus", 10, 4),
    ai("Cosmic luck\nDrop rate bonus @gre@+5%", "popups/drbonus", 10, 4),
    aj("Cosmic strength\nDeal @gre@+5%@whi@ more PvM damage", "popups/pvmboost", 11, 4),
    ak("Frenzy\nDeal +10% melee damage in PvM\n(+5% in PvP)", "popups/werewolf", 9, 2),
    al("Blood Satiation\nGrants +10% PvM damage & accuarcy\nfor magic and range (+5% in PvP)", "popups/vampyre", 9, 2);

    private String am;
    private String an;
    private int ao;
    private int ap;
    private int aq;

    class_266(String str, String str2, int i2, int i3) {
        this.an = str;
        this.am = str2;
        this.ao = i2;
        this.ap = i3;
    }

    class_266(String str, int i2) {
        this.an = str;
        this.aq = i2;
        this.ao = 4;
    }
}
