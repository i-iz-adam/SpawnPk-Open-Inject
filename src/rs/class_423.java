package rs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_423.class */
public class class_423 extends class_360 {
    public static final int c = 200;
    public static List<s> d = new ArrayList();
    public static Map<Integer, s> e = new HashMap();

    public class_423(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        i();
        h();
    }

    private void h() {
        Widget widgetD = d(67027);
        a(64029, 4, 0, 64030, 13, "bank/BANK", 35, 25, "Search");
        a(64030, 15, "bank/BANK", 35, 25, 64031);
        a(64033, "Click the search button", this.a, 0, 16750899, false, true);
        addSprite(64036, "/gameframe/spawntabbar");
        widgetD.ak = new int[5];
        widgetD.al = new int[5];
        widgetD.ba = new int[5];
        int i = 0 + 1;
        widgetD.b(0, 64036, 5 - 4, 5 - 10);
        int i2 = i + 1;
        widgetD.b(i, 64071, 8, 39);
        int i3 = i2 + 1;
        widgetD.b(i2, 64029, 5 + 10, 5);
        int i4 = i3 + 1;
        widgetD.b(i3, 64030, 5 + 10, 5);
        int i5 = i4 + 1;
        widgetD.b(i4, 64033, 5 + 55, 5 + 4 + 3);
        a((Client) null, "nothing that exists");
        a(64033, "Click the search button", this.a, 0, 16750899, false, true);
    }

    private void i() {
        Widget widgetD = d(64071);
        widgetD.P = 170;
        widgetD.aP = 220;
        widgetD.bh = 87;
        widgetD.aF = 20 * 32;
        widgetD.ak = new int[20 * 3];
        widgetD.al = new int[20 * 3];
        widgetD.ba = new int[20 * 3];
    }

    public static void a(Client client, String str) {
        if (ItemComposition.ad == 0) {
            return;
        }
        if (str.length() < 3) {
            if (client != null) {
                client.addChatMessage("Please have at least 3 letters in your search term!", 0, "");
                return;
            }
            return;
        }
        String str2 = str;
        if (str2.length() > 8) {
            str2 = str.substring(0, 7) + "..";
        }
        Widget.H[64033].as = "Results for: \"@whi@" + str2 + "@or1@\"";
        d.clear();
        e.clear();
        for (int i = 1; i < ItemComposition.a; i++) {
            ItemComposition itemCompositionB = ItemComposition.c.b(i);
            if (itemCompositionB != null && itemCompositionB.itemName != null && itemCompositionB.itemId != 11283 && itemCompositionB.itemId != 4178 && !itemCompositionB.itemName.contains(" axe head") && !itemCompositionB.itemName.contains(" pick head") && !itemCompositionB.itemName.contains("kitten") && !itemCompositionB.itemName.contains("Pet cat") && !itemCompositionB.itemName.contains("@red@") && !itemCompositionB.itemName.contains("Clue scroll") && itemCompositionB.itemName.toLowerCase().contains(str.toLowerCase())) {
                if (class_326.b(Client.cT) || !itemCompositionB.itemName.contains("@gre@") || itemCompositionB.itemName.contains("flask (")) {
                    d.add(new s(itemCompositionB.itemName + (class_326.b(Client.cT) ? " [" + itemCompositionB.itemId + "]" : ""), itemCompositionB.itemId));
                } else {
                    d.add(new s("<img=25> <str=16711680>" + itemCompositionB.itemName + (class_326.b(Client.cT) ? " [" + itemCompositionB.itemId + "]" : ""), itemCompositionB.itemId));
                }
            }
        }
    }

    public static void b(class_338[] class_338VarArr) {
        Widget widget = Widget.H[64071];
        widget.V = 0;
        widget.P = 170;
        widget.aP = 215;
        widget.bh = 87;
        int size = d.size();
        if (size > 200) {
            size = 200;
        }
        int i = 70000;
        int i2 = 0;
        widget.aF = size * 32;
        if (widget.aF < 250) {
            widget.aF = User32.VK_PLAY;
        }
        widget.ak = new int[size * 3];
        widget.al = new int[size * 3];
        widget.ba = new int[size * 3];
        for (int i3 = 0; i3 < size; i3++) {
            addSprite(i, "/clan/sprite 4");
            widget.b(i2, i, 5 - 13, 1 + (15 * i3 * 2) + 28);
            int i4 = i + 1;
            int i5 = i2 + 1;
            c(i4, d.get(i3).b(), 27);
            Widget.H[i4].ai = 64071;
            widget.b(i5, i4, 5, (1 + ((15 * i3) * 2)) - 2);
            int i6 = i4 + 1;
            int i7 = i5 + 1;
            a(i6, d.get(i3).a(), "Spawn this item", class_338VarArr, 0, class_492.e, false, false, 125);
            widget.b(i7, i6, 5 + 35, 1 + (15 * i3 * 2) + 9);
            e.put(Integer.valueOf(i6), d.get(i3));
            i = i6 + 1;
            i2 = i7 + 1;
        }
    }
}
