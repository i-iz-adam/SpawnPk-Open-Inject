package rs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.a.F;
import rs.gui.Launcher;
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_341.class */
public class class_341 {
    private static final CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList<>();
    private static boolean b = false;

    public static void a(Client client, String str, String[] strArr) {
        switch (str.toLowerCase()) {
            case "checkscreen":
                System.out.println(Client.aj + "x" + Client.ak);
                return;
            case "repack":
                Client.ew.a();
                class_663 class_663VarA = Launcher.n().o().a(2, "config", "config", Launcher.n().o().eE[2], 30);
                if (class_663VarA != null) {
                    class_99.a(class_663VarA);
                    class_127.a(class_663VarA);
                }
                Launcher.n().o().b(true);
                return;
            case "gfxdata":
                class_127 class_127Var = class_127.c[Integer.parseInt(strArr[0])];
                System.out.println("GFX " + class_127Var.d + ": model: " + class_127Var.e + ", anim:" + class_127Var.f);
                return;
            case "animdata":
                class_99 class_99Var = class_99.a[Integer.parseInt(strArr[0])];
                System.out.println("frames: " + Arrays.toString(class_99Var.e));
                System.out.println("frameDurations: " + Arrays.toString(class_99Var.g));
                return;
            case "macaddress":
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        byte[] hardwareAddress = networkInterfaces.nextElement().getHardwareAddress();
                        if (hardwareAddress != null) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            while (i < hardwareAddress.length) {
                                Object[] objArr = new Object[2];
                                objArr[0] = Byte.valueOf(hardwareAddress[i]);
                                objArr[1] = i < hardwareAddress.length - 1 ? "-" : "";
                                sb.append(String.format("%02X%s", objArr));
                                i++;
                            }
                            System.out.println(sb.toString());
                        }
                        break;
                    }
                    return;
                } catch (SocketException e) {
                    e.printStackTrace();
                    return;
                }
            case "dumpclip":
                int i2 = 0;
                ArrayList arrayList = new ArrayList();
                for (String str2 : strArr) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    client.c(iIntValue);
                    class_97.b();
                    class_97.a();
                    i2++;
                    System.out.println("Progress: " + i2 + "/" + arrayList.size() + " (" + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms)");
                }
                return;
            case "tipint":
                int i3 = Integer.parseInt(strArr[0]);
                class_300 class_300VarValueOf = class_300.valueOf(strArr[1].toUpperCase());
                int i4 = 0;
                int i5 = 0;
                int i6 = Widget.H[i3].P;
                int i7 = Widget.H[i3].P;
                if (Widget.H[i3].E != null) {
                    i6 = Widget.H[i3].E.n;
                    i7 = Widget.H[i3].E.o;
                }
                switch (class_300VarValueOf) {
                    case b:
                        i4 = -30;
                        i5 = (i7 / 2) - 15;
                        break;
                    case a:
                        i4 = i6 + 30;
                        i5 = (i7 / 2) - 15;
                        break;
                }
                class_297.a(i3, class_300VarValueOf, i4, i5);
                class_297.k().b(true);
                return;
            case "acc":
                class_313.d().h().a(strArr[0], strArr[1], strArr[2]);
                return;
            case "particle":
                class_313.d().g().b(20, 77, 125, 16764195);
                class_313.d().g().b(10, 77, 125, 65315);
                return;
            case "dumpcommands":
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("commands.txt")));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            return;
                        }
                        String str3 = line;
                        if (!str3.startsWith("::")) {
                            str3 = "::" + str3;
                        }
                        Client.fv.a(103);
                        Client.fv.b(str3.length() - 1);
                        Client.fv.a(str3.substring(2));
                    }
                } catch (FileNotFoundException e2) {
                    throw new RuntimeException(e2);
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
                break;
            case "test":
                for (short s : new short[]{-27417, -27423, -32479, -32484, -32725, -32593}) {
                    System.out.print((s + 65534) + ",");
                }
                return;
            case "region":
                int i8 = Integer.parseInt(strArr[0]);
                System.out.println("Searcing regions..");
                for (int i9 = 0; i9 < Client.ew.n.length; i9++) {
                    if (Client.ew.n[i9] == i8) {
                        System.out.println("--- IDX " + i9 + " ----");
                        System.out.println("region: " + Client.ew.n[i9]);
                        System.out.println("map file id: " + Client.ew.l[i9]);
                        System.out.println("landscape file id: " + Client.ew.i[i9]);
                        System.out.println();
                    }
                }
                return;
            case "mapfile":
                int i10 = Integer.parseInt(strArr[0]);
                System.out.println("Searcing regions..");
                for (int i11 = 0; i11 < Client.ew.n.length; i11++) {
                    if (Client.ew.l[i11] == i10 || Client.ew.i[i11] == i10) {
                        System.out.println("--- IDX " + i11 + " ----");
                        System.out.println("region: " + Client.ew.n[i11]);
                        System.out.println("map file id: " + Client.ew.l[i11]);
                        System.out.println("landscape file id: " + Client.ew.i[i11]);
                        System.out.println();
                    }
                }
                return;
            case "resetnpcdefs":
                class_170.b = true;
                return;
            case "topbar":
                class_420.c(Boolean.parseBoolean(strArr[0]));
                return;
            case "botbar":
                class_420.d(Boolean.parseBoolean(strArr[0]));
                return;
            case "colors":
                if (ItemComposition.lookupItem(Integer.parseInt(strArr[0])) == null) {
                    client.addChatMessage("Can't find item definition!", 0, "");
                    return;
                }
                ColorUtility colorUtility = new ColorUtility(ItemComposition.lookupItem(Integer.parseInt(strArr[0])).A);
                ArrayList arrayList2 = new ArrayList();
                if (colorUtility == null || colorUtility.ar == null) {
                    client.addChatMessage("Can't find item model! ", 0, "");
                    return;
                }
                for (int i12 = 0; i12 < colorUtility.ah; i12++) {
                    if (!arrayList2.contains(Integer.valueOf(colorUtility.ar[i12]))) {
                        arrayList2.add(Integer.valueOf(colorUtility.ar[i12]));
                    }
                }
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    client.addChatMessage("[" + i13 + "] = " + String.valueOf(arrayList2.get(i13)), 0, "");
                    System.out.print(String.valueOf(arrayList2.get(i13)) + ", ");
                }
                return;
            case "friends":
                for (int i14 = 197; i14 < 350; i14++) {
                    client.a(class_39.a("Buddy " + i14));
                }
                return;
            case "disconnect":
                System.out.println("breakpoint");
                return;
            case "clearchat":
                for (int i15 = 0; i15 < 200; i15++) {
                    client.dz[i15] = 0;
                    client.dA[i15] = 0;
                    client.dB[i15] = null;
                    client.dC[i15] = null;
                    client.dD[i15] = false;
                }
                return;
            case "itemhovers":
                try {
                    class_112.a();
                    break;
                } catch (FileNotFoundException e4) {
                    e4.printStackTrace();
                }
                client.addChatMessage("<img=2> Item hover descriptions reloaded!", 0, "");
                return;
            case "objectdef":
                ObjectComposition objectCompositionC = ObjectComposition.c(Integer.parseInt(strArr[0]));
                System.out.println("objectDef.anIntArray773 = " + Arrays.toString(objectCompositionC.an));
                System.out.println("objectDef.originalModelColors = " + Arrays.toString(objectCompositionC.W));
                System.out.println("objectDef.modifiedModelColors = " + Arrays.toString(objectCompositionC.ax));
                System.out.println("objectDef.anInt781 = " + objectCompositionC.au);
                System.out.println("objectDef.sizeX = " + objectCompositionC.U);
                System.out.println("objectDef.sizeY = " + objectCompositionC.af);
                return;
            case "noteable":
                int[] iArr = {3268};
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    System.out.println("[ITEM " + (24243 + i16) + "]");
                    System.out.println("actions=null,null,null,null,Drop");
                    System.out.println("modelId=2789");
                    System.out.println("template=799");
                    System.out.println("certid=" + iArr[i16]);
                }
                return;
            case "int":
                if (strArr.length == 0 || strArr[0].equalsIgnoreCase("reload")) {
                    client.a();
                    client.addChatMessage("Interfaces reloaded.", 0, "");
                    return;
                }
                if (strArr[0].equalsIgnoreCase("edit")) {
                    if (class_253.i.f() && strArr.length == 0) {
                        class_253.i.a(false);
                    } else {
                        class_253.i.a(true);
                        class_253.i.b(strArr.length == 0 ? 0 : Integer.parseInt(strArr[1]));
                    }
                }
                if (strArr[0].equalsIgnoreCase("check")) {
                    int i17 = Integer.parseInt(strArr[1]);
                    int i18 = strArr.length == 3 ? Integer.parseInt(strArr[2]) : i17;
                    System.out.println("Checking availablility for interface ID(s) " + i17 + " to " + i18 + "...");
                    for (int i19 = i17; i19 <= i18; i19++) {
                        if (Widget.H[i19] != null) {
                            System.out.println("[WARNING] Interface ID " + i19 + " is in use!");
                        } else {
                            System.out.println("[!!!!] Interface ID " + i19 + " is free for use!");
                        }
                    }
                    System.out.println("..Check complete!");
                }
                if (strArr[0].equalsIgnoreCase("setmedia")) {
                    Widget.H[Integer.parseInt(strArr[1])].ae = Integer.parseInt(strArr[2]);
                }
                if (strArr[0].equalsIgnoreCase("setmessage")) {
                    Widget.H[Integer.parseInt(strArr[1])].as = strArr[2];
                }
                if (strArr[0].equalsIgnoreCase("print")) {
                    Widget widget = Widget.H[Integer.parseInt(strArr[1])];
                    System.out.println();
                    System.out.print("type = " + widget.aG + ";\n");
                    switch (widget.aG) {
                        case 6:
                            System.out.print("mediaID = " + widget.ae + ";\n");
                            System.out.print("width = " + widget.P + ";\n");
                            System.out.print("height = " + widget.aP + ";\n");
                            System.out.print("modelZoom = " + widget.aR + ";\n");
                            System.out.print("modelRotation1 = " + widget.aS + ";\n");
                            System.out.print("modelRotation2 = " + widget.aT + ";\n");
                            System.out.print("anInt233 = " + widget.ad + ";\n");
                            break;
                    }
                    System.out.println();
                    if (widget.ax != null) {
                        System.out.println("inv = new int[" + widget.ax.length + "];");
                        System.out.println("invStackSizes = new int[" + widget.av.length + "];");
                        System.out.println("actions = new String[] {" + Arrays.toString(widget.W).replace("[", "").replace("]", "") + "};");
                        System.out.println("width = " + widget.P + ";");
                        System.out.println("height = " + widget.aP + ";");
                        System.out.println("invSpritePadX = " + widget.ab + ";");
                        System.out.println("invSpritePadY = " + widget.ao + ";");
                        System.out.println("invSpriteSize = " + widget.bB + ";");
                    } else if (widget.ak != null) {
                        System.out.println("children = new int[] {" + Arrays.toString(widget.ak).replace("[", "").replace("]", "") + "};");
                        System.out.println("childX = new int[] {" + Arrays.toString(widget.al).replace("[", "").replace("]", "") + "};");
                        System.out.println("childY = new int[] {" + Arrays.toString(widget.ba).replace("[", "").replace("]", "") + "};");
                    }
                    System.out.println();
                }
                if (strArr[0].equalsIgnoreCase("showall") || strArr[0].equalsIgnoreCase("show")) {
                    Configuration.an = !Configuration.an;
                }
                if (strArr[0].equalsIgnoreCase("find_model")) {
                }
                if (strArr[0].equalsIgnoreCase("find_empty")) {
                    int i20 = strArr.length > 1 ? Integer.parseInt(strArr[1]) : 1;
                    int i21 = 30000;
                    while (i21 <= 70000) {
                        if (Widget.H[i21] == null) {
                            boolean z = true;
                            for (int i22 = 1; i22 < i20; i22++) {
                                if (Widget.H[i21 + i20] != null) {
                                    z = false;
                                }
                            }
                            if (z) {
                                System.out.println("Found a range of " + i20 + " free interface IDS: " + i21 + " -> " + (i21 + i20));
                                i21 += i20;
                            }
                        }
                        i21++;
                    }
                    client.a();
                    client.addChatMessage("Interfaces reloaded.", 0, "");
                    return;
                }
                return;
            case "checkthing":
                System.out.println("modelZoom = " + Widget.H[4883].aR);
                System.out.println("modelRotation1 = " + Widget.H[4883].aS);
                System.out.println("modelRotation2 = " + Widget.H[4883].aT);
                return;
            case "dumpitems":
                client.a(false);
                return;
            case "resetgraphs":
                client.b();
                return;
            case "itemdef":
                if (strArr[0].equalsIgnoreCase("reset")) {
                    class_170.a = true;
                    return;
                }
                int iIntValue2 = Integer.valueOf(strArr[0]).intValue();
                ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(iIntValue2);
                System.out.println();
                System.out.println("[ITEM " + iIntValue2 + "]");
                System.out.println("modelID=" + itemCompositionLookupItem.A);
                if (itemCompositionLookupItem.r > 0) {
                    System.out.println("maleEquip1=" + itemCompositionLookupItem.r);
                }
                if (itemCompositionLookupItem.K > 0) {
                    System.out.println("maleEquip2=" + itemCompositionLookupItem.K);
                }
                if (itemCompositionLookupItem.aa > 0) {
                    System.out.println("femaleEquip1=" + itemCompositionLookupItem.aa);
                }
                if (itemCompositionLookupItem.q > 0) {
                    System.out.println("femaleEquip2=" + itemCompositionLookupItem.q);
                }
                System.out.println("certID=" + itemCompositionLookupItem.F);
                System.out.println("templateID=" + itemCompositionLookupItem.p);
                System.out.println("rotationX=" + itemCompositionLookupItem.M);
                System.out.println("rotationY=" + itemCompositionLookupItem.Z);
                System.out.println("zoom=" + itemCompositionLookupItem.G);
                System.out.println("offset1=" + itemCompositionLookupItem.v);
                System.out.println("offset2=" + itemCompositionLookupItem.W);
                System.out.println("contrast=" + itemCompositionLookupItem.I);
                System.out.println("ambient=" + itemCompositionLookupItem.X);
                if (itemCompositionLookupItem.o != -1) {
                    System.out.println("anInt162=" + itemCompositionLookupItem.o);
                }
                if (itemCompositionLookupItem.ae != 0) {
                    System.out.println("anInt204=" + itemCompositionLookupItem.ae);
                }
                if (itemCompositionLookupItem.h != null) {
                    System.out.println("modifiedModelColors=" + Arrays.toString(itemCompositionLookupItem.g).replace("[", "").replace("]", "").replace(F.a, ""));
                    System.out.println("originalModelColors=" + Arrays.toString(itemCompositionLookupItem.h).replace("[", "").replace("]", "").replace(F.a, ""));
                }
                if (itemCompositionLookupItem.P != null) {
                    System.out.println("stackIds=" + Arrays.toString(itemCompositionLookupItem.P).replace("[", "").replace("]", "").replace(F.a, ""));
                    System.out.println("stackAmounts=" + Arrays.toString(itemCompositionLookupItem.ab).replace("[", "").replace("]", "").replace(F.a, ""));
                }
                Client.K();
                System.out.println();
                return;
            case "entitydef":
                class_102 class_102VarC = class_102.c(Integer.valueOf(strArr[0]).intValue());
                System.out.println("entityDef.standAnim = " + class_102VarC.w + ";");
                System.out.println("entityDef.walkAnim = entityDef.anInt55 = entityDef.anInt83 = entityDef.anInt58 = " + class_102VarC.q + ";");
                System.out.println("entityDef.anInt86 = " + class_102VarC.E + ";");
                System.out.println("entityDef.anInt91 = " + class_102VarC.I + ";");
                System.out.println("entityDef.anIntArray94 = new int[] " + Arrays.toString(class_102VarC.L).replace("[", "{").replace("]", "}") + ";");
                System.out.println("entityDef.anIntArray70 = new int[] " + Arrays.toString(class_102VarC.s).replace("[", "{").replace("]", "}") + ";");
                System.out.println("entityDef.anIntArray76 = new int[] " + Arrays.toString(class_102VarC.v).replace("[", "{").replace("]", "}") + ";");
                return;
            case "texture":
            case "textures":
                class_253.j.r = true;
                class_253.j.s = 0;
                return;
            case "gpuinv":
                e eVar = client.a;
                e.a(true);
                return;
            default:
                return;
        }
    }

    public static void b(Client client, String str, String[] strArr) {
        switch (str.toLowerCase()) {
            case "cmdmode":
            case "chatcmd":
            case "chatcmdmode":
                if (class_326.a(Client.cT)) {
                    Configuration.O = !Configuration.O;
                    client.addChatMessage("<img=2> Chat command mode has been: " + (Configuration.O ? "@dgr@<img=24>ENABLED" : "@dre@<img=25>DISABLED"), 0, "");
                    if (Configuration.O) {
                        client.addChatMessage("<img=2> Type @dpu@chatcmd@bla@ to toggle it back off!", 0, "");
                    }
                    break;
                }
                break;
            case "hween":
            case "snow":
            case "winter":
            case "xmas":
            case "summer":
            case "darkwinter":
            case "darkxmas":
                if (Client.ed == 197) {
                    client.addChatMessage("@dre@<img=25> You can't enter this command in the wilderness!", 0, "");
                    break;
                } else {
                    class_150 class_150Var = class_150.b;
                    Object obj = "winter";
                    if (str.toLowerCase().equalsIgnoreCase("hween")) {
                        class_150Var = class_150.d;
                        obj = "h'ween";
                    }
                    if (str.toLowerCase().equalsIgnoreCase("summer")) {
                        class_150Var = class_150.e;
                        obj = "summer";
                    }
                    if (str.toLowerCase().equalsIgnoreCase("darkwinter") || str.toLowerCase().equalsIgnoreCase("darkxmas")) {
                        class_150Var = class_150.c;
                        obj = "dark winter";
                    }
                    if (Configuration.r != class_150Var) {
                        Configuration.r = class_150Var;
                    } else {
                        Configuration.r = class_150.a;
                    }
                    if (Configuration.r == Configuration.o) {
                        Configuration.p = null;
                    } else {
                        Configuration.p = Configuration.r;
                    }
                    Configuration.d();
                    class_663 class_663VarA = client.a(2, "config", "config", client.eE[2], 30);
                    client.addChatMessage("<img=6> You've " + (Configuration.r == class_150.e ? "enabled" : "disabled") + " " + obj + " mode! Re-enter the command @blu@::summer@bla@ again to toggle.", 0, null);
                    class_107.a(class_663VarA);
                    if (client.fr == null || client.bI) {
                        client.bI = false;
                    } else {
                        Client.ee = 1;
                    }
                    break;
                }
                break;
            case "renderself":
                Configuration.N = !Configuration.N;
                if (Configuration.N) {
                    client.addChatMessage("@dgr@<img=6> Display of your character has been enabled.", 0, "");
                    break;
                } else {
                    client.addChatMessage("@dre@<img=40> Your character is now hidden (only on your screen, not others!)", 0, "");
                    break;
                }
                break;
            case "multi":
                Configuration.aX = !Configuration.aX;
                if (Configuration.aX) {
                    client.addChatMessage("@dgr@<img=24> Wildy minimap multi lines in the minimap will now show", 0, "");
                } else {
                    client.addChatMessage("@dre@<img=25> Wild minimap multi lines in the minimap will now be hidden", 0, "");
                }
                client.addChatMessage("@blu@<img=6> NOTE: Changes will not take effect until your map reloads!", 0, "");
                Configuration.d();
                break;
        }
    }

    public static void a(Client client, String str, int i) {
        if (str.isEmpty()) {
            return;
        }
        String strReplace = str.replace("::", "");
        if (!strReplace.contains(F.a)) {
            b(client, strReplace, new String[0]);
            if (class_326.b(i)) {
                a(client, strReplace, new String[0]);
                return;
            }
            return;
        }
        String[] strArrSplit = strReplace.split(F.a);
        String[] strArr = new String[0];
        if (strArrSplit.length > 1) {
            strArr = new String[strArrSplit.length - 1];
            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                strArr[i2 - 1] = strArrSplit[i2];
            }
        }
        b(client, strArrSplit[0], strArr);
        if (class_326.b(i)) {
            a(client, strArrSplit[0], strArr);
        }
    }

    public static void a(String str) {
        a.add(str);
    }

    public static void a() {
        if (a.isEmpty()) {
            return;
        }
        for (String str : a) {
            Launcher.n().o();
            Client.fv.a(103);
            Launcher.n().o();
            Client.fv.b(str.length() - 1);
            Launcher.n().o();
            Client.fv.a(str.substring(2));
        }
        a.clear();
    }
}
