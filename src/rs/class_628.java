package rs;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_628.class */
public class class_628 {
    private static final String a = class_650.b() + File.separator + "i.yaml";
    private static final String b = class_650.b() + File.separator + "i.bin";

    public static void a() {
        if (Configuration.c.intValue() != 1) {
            return;
        }
        Configuration.aa = false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < ItemComposition.a; i++) {
            try {
                ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(i);
                Map<String, Object> mapA = a(itemCompositionLookupItem, ItemComposition.e(itemCompositionLookupItem.itemId), true);
                if (mapA.size() > 0) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("name", itemCompositionLookupItem.itemName);
                    for (String str : mapA.keySet()) {
                        if (!str.equals("name")) {
                            linkedHashMap2.put(str, mapA.get(str));
                        }
                    }
                    linkedHashMap.put(Integer.valueOf(i), linkedHashMap2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            new class_618(a, b).a((Map<Integer, Map<String, Object>>) linkedHashMap);
            System.out.println("..Dump completed!");
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void b() {
        if (Configuration.c.intValue() != 1) {
            return;
        }
        String[] strArr = {"srcColors", "destColors", "retextures", "maleOffsets", "femaleOffsets", "maleChatModels", "femaleChatModels", "ambient", "contrast", "stackable"};
        String[] strArr2 = {"modelId", "rotations", "zoom", "offsets"};
        class_622 class_622Var = new class_622();
        class_622Var.d();
        System.out.println("Running test..");
        for (int i = 0; i < ItemComposition.a; i++) {
            if (class_622Var.a(i) != null) {
                ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(i);
                ItemComposition itemCompositionA = class_622Var.a(i);
                Map<String, Object> mapA = a(itemCompositionA, itemCompositionLookupItem, false);
                if (mapA.size() > 0) {
                    int i2 = 0;
                    for (String str : mapA.keySet()) {
                        if (!Arrays.asList(strArr).contains(str) && (itemCompositionA.F <= 0 || itemCompositionLookupItem.F <= 0 || itemCompositionA.F != itemCompositionLookupItem.F || !Arrays.asList(strArr2).contains(str))) {
                            i2++;
                        }
                    }
                    if (i2 > 0) {
                        System.out.println("Found differences in item " + i + " (" + ItemComposition.lookupItem(i).itemName + ")");
                        System.out.println("{ ");
                        for (String str2 : mapA.keySet()) {
                            if (!Arrays.asList(strArr).contains(str2) && (itemCompositionA.F <= 0 || itemCompositionLookupItem.F <= 0 || itemCompositionA.F != itemCompositionLookupItem.F || !Arrays.asList(strArr2).contains(str2))) {
                                System.out.print(str2 + " => " + a(mapA.get(str2)));
                                if (str2.equalsIgnoreCase("modelid")) {
                                    System.out.print("  vs. (old) " + itemCompositionLookupItem.A);
                                }
                                if (str2.equalsIgnoreCase("actions")) {
                                    System.out.print("  vs. (old) " + Arrays.toString(itemCompositionLookupItem.inventoryActions));
                                }
                                if (str2.equalsIgnoreCase("maleModels")) {
                                    System.out.print("  vs. (old) " + Arrays.toString(new int[]{itemCompositionLookupItem.r, itemCompositionLookupItem.K, itemCompositionLookupItem.J}));
                                }
                                if (str2.equalsIgnoreCase("femaleModels")) {
                                    System.out.print("  vs. (old) " + Arrays.toString(new int[]{itemCompositionLookupItem.aa, itemCompositionLookupItem.q, itemCompositionLookupItem.o}));
                                }
                                System.out.println();
                            }
                        }
                        System.out.println("}\n");
                    }
                }
            }
        }
        System.out.println("..Test completed!");
    }

    public static Map<String, Object> a(ItemComposition itemComposition, ItemComposition itemComposition2, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (itemComposition.itemName.equals("Dwarf remains") && itemComposition2.itemName.equals("Dwarf remains")) {
            return linkedHashMap;
        }
        if (itemComposition.itemName == null && itemComposition2.itemName == null) {
            return linkedHashMap;
        }
        if (!itemComposition.itemName.equalsIgnoreCase(itemComposition2.itemName)) {
            linkedHashMap.put("name", itemComposition.itemName);
        }
        boolean z2 = false;
        if (itemComposition.F != itemComposition2.F) {
            linkedHashMap.put("note", Integer.valueOf(itemComposition.F));
            z2 = true;
        }
        if (itemComposition.p != itemComposition2.p) {
            if (z2 && itemComposition.p != 799) {
                linkedHashMap.put("template", Integer.valueOf(itemComposition.p));
            }
            if (!Arrays.equals(itemComposition.inventoryActions, new String[]{null, null, null, null, "Drop"})) {
                linkedHashMap.put("actions", itemComposition.inventoryActions);
            }
        }
        if (z2) {
            if (itemComposition.F != -1 && itemComposition.p != -1) {
                return linkedHashMap;
            }
            linkedHashMap.put("note", -1);
            linkedHashMap.put("template", -1);
        }
        if (itemComposition.itemName.toLowerCase().contains("(broken)")) {
            linkedHashMap.put("broken", true);
        } else {
            if (!Arrays.equals(itemComposition.inventoryActions, itemComposition2.inventoryActions)) {
                linkedHashMap.put("actions", itemComposition.inventoryActions);
            }
            if (!Arrays.equals(itemComposition.u, itemComposition2.u)) {
                linkedHashMap.put("groundActions", itemComposition.u);
            }
            if (itemComposition.D != itemComposition2.D) {
                linkedHashMap.put("stackable", Boolean.valueOf(itemComposition.D));
            }
            if (!Arrays.equals(itemComposition.P, itemComposition2.P)) {
                linkedHashMap.put("stackIds", itemComposition.P);
            }
            if (!Arrays.equals(itemComposition.ab, itemComposition2.ab)) {
                linkedHashMap.put("stackAmounts", itemComposition.ab);
            }
        }
        if (!Arrays.equals(itemComposition.g, itemComposition2.g) || !Arrays.equals(itemComposition.h, itemComposition2.h)) {
            linkedHashMap.put("srcColors", itemComposition.g);
            linkedHashMap.put("destColors", itemComposition.h);
        }
        boolean z3 = false;
        boolean z4 = false;
        if (z && linkedHashMap.size() > 1 && itemComposition.A != itemComposition2.A && itemComposition.A > 0) {
            for (int i = 0; i < itemComposition.itemId; i++) {
                ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(i);
                if (itemComposition.F == -1 && itemComposition.A == itemCompositionLookupItem.A && itemComposition.G == itemCompositionLookupItem.G && itemComposition.M == itemCompositionLookupItem.M && itemComposition.Z == itemCompositionLookupItem.Z && itemComposition.v == itemCompositionLookupItem.v && itemComposition.W == itemCompositionLookupItem.W && itemComposition.ae == itemCompositionLookupItem.ae) {
                    if (0 != 0) {
                        break;
                    }
                    linkedHashMap.put("clone", Integer.valueOf(i));
                    if (Arrays.equals(itemComposition.inventoryActions, itemCompositionLookupItem.inventoryActions)) {
                        linkedHashMap.remove("actions");
                    }
                    if (Arrays.equals(itemComposition.u, itemCompositionLookupItem.u)) {
                        linkedHashMap.remove("groundActions");
                    }
                    z3 = true;
                    if (itemComposition.r != itemCompositionLookupItem.r || itemComposition.K != itemCompositionLookupItem.K || itemComposition.J != itemCompositionLookupItem.J || itemComposition.aa != itemCompositionLookupItem.aa || itemComposition.q != itemCompositionLookupItem.q || itemComposition.o != itemCompositionLookupItem.o || itemComposition.af != itemCompositionLookupItem.af || itemComposition.ag != itemCompositionLookupItem.ag || itemComposition.ah != itemCompositionLookupItem.ah || itemComposition.ai != itemCompositionLookupItem.ai || itemComposition.ak != itemCompositionLookupItem.ak || itemComposition.aj != itemCompositionLookupItem.aj) {
                        break;
                        break;
                        break;
                        break;
                        break;
                        break;
                        break;
                        break;
                        break;
                        break;
                        break;
                        break;
                    }
                    z4 = true;
                    break;
                }
            }
        }
        if (!z3) {
            if (itemComposition.A != itemComposition2.A) {
                linkedHashMap.put("modelId", Integer.valueOf(itemComposition.A));
            }
            if (itemComposition.G != itemComposition2.G) {
                linkedHashMap.put("zoom", Integer.valueOf(itemComposition.G));
            }
            if (itemComposition.M != itemComposition2.M || itemComposition.Z != itemComposition2.Z) {
                linkedHashMap.put("rotations", new int[]{itemComposition.M, itemComposition.Z});
            }
            if (itemComposition.v != itemComposition2.v || itemComposition.W != itemComposition2.W) {
                linkedHashMap.put("offsets", new int[]{itemComposition.v, itemComposition.W});
            }
            if (itemComposition.ae != itemComposition2.ae) {
                linkedHashMap.put("zan2d", Integer.valueOf(itemComposition.ae));
            }
        }
        if (itemComposition.R != itemComposition2.R) {
            linkedHashMap.put("fullTexture", Integer.valueOf(itemComposition.R));
        }
        if (itemComposition.U != itemComposition2.U) {
            linkedHashMap.put("textureInvAnim", Boolean.valueOf(itemComposition.U));
        }
        if (!Arrays.equals(itemComposition.S, itemComposition2.S) || !Arrays.equals(itemComposition.T, itemComposition2.T)) {
            linkedHashMap.put("retextures", new int[][][]{new int[][]{itemComposition.S, itemComposition.T}});
        }
        if (itemComposition.t != itemComposition2.t || itemComposition.O != itemComposition2.O || itemComposition.N != itemComposition2.N) {
            linkedHashMap.put("resize", new int[]{itemComposition.t, itemComposition.O, itemComposition.N});
        }
        if (!z4 && itemComposition.inventoryActions[1] != null) {
            if (itemComposition.r != itemComposition2.r || itemComposition.K != itemComposition2.K || itemComposition.J != itemComposition2.J) {
                linkedHashMap.put("maleModels", new int[]{itemComposition.r, itemComposition.K, itemComposition.J});
            }
            if (itemComposition.aa != itemComposition2.aa || itemComposition.q != itemComposition2.q || itemComposition.o != itemComposition2.o) {
                linkedHashMap.put("femaleModels", new int[]{itemComposition.aa, itemComposition.q, itemComposition.o});
            }
            if (itemComposition.af != itemComposition2.af || itemComposition.ag != itemComposition2.ag || itemComposition.ah != itemComposition2.ah) {
                linkedHashMap.put("maleOffsets", new int[]{itemComposition.af, itemComposition.ag, itemComposition.ah});
            }
            if (itemComposition.ai != itemComposition2.ai || itemComposition.ak != itemComposition2.ak || itemComposition.aj != itemComposition2.aj) {
                linkedHashMap.put("femaleOffsets", new int[]{itemComposition.ai, itemComposition.ak, itemComposition.aj});
            }
        }
        if (itemComposition.B != itemComposition2.B || itemComposition.s != itemComposition2.s) {
            linkedHashMap.put("maleChatModels", new int[]{itemComposition.B, itemComposition.s});
        }
        if (itemComposition.Y != itemComposition2.Y || itemComposition.z != itemComposition2.z) {
            linkedHashMap.put("femaleChatModels", new int[]{itemComposition.Y, itemComposition.z});
        }
        if (itemComposition.X != itemComposition2.X) {
            linkedHashMap.put("ambient", Integer.valueOf(itemComposition.X));
        }
        if (itemComposition.I != itemComposition2.I) {
            linkedHashMap.put("contrast", Integer.valueOf(itemComposition.I));
        }
        return linkedHashMap;
    }

    private static String a(Object obj) {
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (!obj.getClass().isArray()) {
            return obj.toString();
        }
        try {
            return Arrays.toString((Object[]) obj);
        } catch (Exception e) {
            return obj.toString();
        }
    }
}
