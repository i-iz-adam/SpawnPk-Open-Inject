package rs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.commons.a.F;
import rs.plugins.s.a;

/* JADX INFO: loaded from: client-final.jar:rs/class_195.class */
public class class_195 {
    private static final boolean a = true;

    /* JADX WARN: Code duplicated, block: B:106:0x031e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0321 A[Catch: Exception -> 0x033b, TRY_ENTER, TryCatch #0 {Exception -> 0x033b, blocks: (B:87:0x02a8, B:89:0x02b4, B:91:0x02bc, B:93:0x02cc, B:95:0x02d4, B:97:0x02e1, B:98:0x02ed, B:100:0x02f7, B:107:0x0321), top: B:175:0x02a8 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:135:0x03cd A[Catch: Exception -> 0x03e7, TRY_ENTER, TryCatch #1 {Exception -> 0x03e7, blocks: (B:117:0x035c, B:119:0x0368, B:121:0x0370, B:123:0x037d, B:125:0x038d, B:126:0x0399, B:128:0x03a3, B:135:0x03cd), top: B:177:0x035c }] */
    public static void a(String str, String str2, String[] strArr) {
        switch (str2.toLowerCase()) {
            case "col":
            case "cols":
            case "color":
            case "colors":
                boolean z = true;
                for (class_196 class_196Var : class_205.b.h()) {
                    if (class_196Var.h() || (class_196Var instanceof class_197)) {
                        if (class_196Var instanceof class_197) {
                            z = false;
                        }
                        if (strArr.length == 0) {
                            class_196Var.f();
                        } else {
                            if (str2.toLowerCase().equals(a.b) || str2.toLowerCase().equals("cols") || strArr[0].equalsIgnoreCase("reset")) {
                                class_196Var.k().clear();
                            }
                            if (!strArr[0].equalsIgnoreCase("reset") && strArr.length > 0) {
                                for (String str3 : strArr[0].split(",")) {
                                    int i = Integer.parseInt(str3);
                                    if (!class_196Var.k().contains(Integer.valueOf(i))) {
                                        class_196Var.k().add(Integer.valueOf(i));
                                    }
                                }
                            }
                            class_205.b.c("Selected colors: @gre@" + Arrays.toString(class_196Var.k().toArray()));
                        }
                        break;
                    }
                }
                if (z) {
                    class_205.b.f();
                    break;
                }
                break;
            case "finditem":
            case "findnpc":
                ArrayList arrayList = new ArrayList();
                String str4 = "";
                for (String str5 : strArr) {
                    if (!str4.isEmpty()) {
                        str4 = str4 + " ";
                    }
                    if (str5.contains("-")) {
                        arrayList.add(str5.substring(1).toLowerCase());
                    } else {
                        str4 = str4 + str5.toLowerCase();
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (str2.toLowerCase().contains("item")) {
                    for (int i2 = 1; i2 < 40000; i2++) {
                        try {
                            ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(i2);
                            if (itemCompositionLookupItem != null && itemCompositionLookupItem.itemName != null && itemCompositionLookupItem.itemName.toLowerCase().contains(str4) && !itemCompositionLookupItem.b()) {
                                if (!itemCompositionLookupItem.itemName.contains("@gre@")) {
                                }
                                boolean z2 = false;
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (itemCompositionLookupItem.itemName.contains((String) it.next())) {
                                        z2 = true;
                                        if (z2) {
                                            arrayList2.add("@whi@" + itemCompositionLookupItem.itemName + " @cya@[" + itemCompositionLookupItem.itemId + "]");
                                        }
                                    }
                                }
                                if (z2) {
                                    arrayList2.add("@whi@" + itemCompositionLookupItem.itemName + " @cya@[" + itemCompositionLookupItem.itemId + "]");
                                }
                            }
                        } catch (Exception e) {
                        }
                    }
                }
                if (str2.toLowerCase().contains("npc")) {
                    for (int i3 = 1; i3 < 40000; i3++) {
                        try {
                            class_102 class_102VarC = class_102.c(i3);
                            if (class_102VarC != null && class_102VarC.o != null && !class_102VarC.o.equals("null") && class_102VarC.o.toLowerCase().contains(str4)) {
                                boolean z3 = false;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (class_102VarC.o.contains((String) it2.next())) {
                                        z3 = true;
                                        if (z3) {
                                            arrayList2.add("@whi@" + class_102VarC.o + " @cya@[" + class_102VarC.x + "]");
                                        }
                                    }
                                }
                                if (z3) {
                                    arrayList2.add("@whi@" + class_102VarC.o + " @cya@[" + class_102VarC.x + "]");
                                }
                            }
                        } catch (Exception e2) {
                        }
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    class_205.b((String) it3.next());
                }
                break;
            case "itemdef":
                if (!strArr[0].equalsIgnoreCase("reset")) {
                    int iIntValue = Integer.valueOf(strArr[0]).intValue();
                    ItemComposition itemCompositionLookupItem2 = ItemComposition.lookupItem(iIntValue);
                    System.out.println();
                    System.out.println("[ITEM " + iIntValue + "]");
                    System.out.println("modelID=" + itemCompositionLookupItem2.A);
                    if (itemCompositionLookupItem2.r > 0) {
                        System.out.println("maleEquip1=" + itemCompositionLookupItem2.r);
                    }
                    if (itemCompositionLookupItem2.K > 0) {
                        System.out.println("maleEquip2=" + itemCompositionLookupItem2.K);
                    }
                    if (itemCompositionLookupItem2.aa > 0) {
                        System.out.println("femaleEquip1=" + itemCompositionLookupItem2.aa);
                    }
                    if (itemCompositionLookupItem2.q > 0) {
                        System.out.println("femaleEquip2=" + itemCompositionLookupItem2.q);
                    }
                    System.out.println("rotationX=" + itemCompositionLookupItem2.M);
                    System.out.println("rotationY=" + itemCompositionLookupItem2.Z);
                    System.out.println("zoom=" + itemCompositionLookupItem2.G);
                    System.out.println("offset1=" + itemCompositionLookupItem2.v);
                    System.out.println("offset2=" + itemCompositionLookupItem2.W);
                    if (itemCompositionLookupItem2.o != -1) {
                        System.out.println("anInt162=" + itemCompositionLookupItem2.o);
                    }
                    if (itemCompositionLookupItem2.ae != 0) {
                        System.out.println("anInt204=" + itemCompositionLookupItem2.ae);
                    }
                    if (itemCompositionLookupItem2.h != null) {
                        System.out.println("modifiedModelColors=" + Arrays.toString(itemCompositionLookupItem2.g).replace("[", "").replace("]", "").replace(F.a, ""));
                        System.out.println("originalModelColors=" + Arrays.toString(itemCompositionLookupItem2.h).replace("[", "").replace("]", "").replace(F.a, ""));
                    }
                    if (itemCompositionLookupItem2.P != null) {
                        System.out.println("stackIds=" + Arrays.toString(itemCompositionLookupItem2.P).replace("[", "").replace("]", "").replace(F.a, ""));
                        System.out.println("stackAmounts=" + Arrays.toString(itemCompositionLookupItem2.ab).replace("[", "").replace("]", "").replace(F.a, ""));
                    }
                    Client.K();
                    System.out.println();
                    break;
                } else {
                    Client.K();
                    ItemComposition.b = new class_622();
                    ItemComposition.b.d();
                    ItemComposition.k.a();
                    ItemComposition.l.a();
                    class_205.b.f();
                    class_205.b.c("Item definitions reset!");
                    break;
                }
                break;
            case "texture":
            case "textures":
                class_253.j.r = true;
                class_253.j.s = 0;
                class_205.b.c("Textures opened");
                break;
        }
    }
}
