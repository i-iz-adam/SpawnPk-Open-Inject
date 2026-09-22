package rs;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_638.class */
public class class_638 {
    public static void a(String str) {
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        if (!file.exists()) {
            System.out.println("[Model Checker] Could not find directory \"" + str + "\"");
            return;
        }
        for (File file2 : file.listFiles()) {
            String name = file2.getName();
            if (name != null) {
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(name.replaceAll(".gz", "").replaceAll(".dat", ""))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("[Model Checker] Checking " + arrayList.size() + " models from [" + str + "]..");
        try {
            a(arrayList);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(List<Integer> list) {
        HashMap map = new HashMap();
        for (int i = 1; i < ItemComposition.ad; i++) {
            ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(i);
            if (itemCompositionLookupItem != null) {
                String str = itemCompositionLookupItem.itemName == null ? "null" : itemCompositionLookupItem.itemName;
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (itemCompositionLookupItem.A == iIntValue) {
                        System.out.println("[Model Checker] Found model ID " + iIntValue + " for ITEM: " + str + " (" + i + ") (modelID)");
                        map.put(Integer.valueOf(iIntValue), true);
                    }
                    if (itemCompositionLookupItem.r == iIntValue) {
                        System.out.println("[Model Checker] Found model ID " + iIntValue + " for ITEM: " + str + " (" + i + ") (maleEquip1)");
                        map.put(Integer.valueOf(iIntValue), true);
                    }
                    if (itemCompositionLookupItem.K == iIntValue) {
                        System.out.println("[Model Checker] Found model ID " + iIntValue + " for ITEM: " + str + " (" + i + ") (maleEquip2)");
                        map.put(Integer.valueOf(iIntValue), true);
                    }
                    if (itemCompositionLookupItem.aa == iIntValue) {
                        System.out.println("[Model Checker] Found model ID " + iIntValue + " for ITEM: " + str + " (" + i + ") (femaleEquip1)");
                        map.put(Integer.valueOf(iIntValue), true);
                    }
                    if (itemCompositionLookupItem.q == iIntValue) {
                        System.out.println("[Model Checker] Found model ID " + iIntValue + " for ITEM: " + str + " (" + i + ") (femaleEquip2)");
                        map.put(Integer.valueOf(iIntValue), true);
                    }
                }
            }
        }
        for (int i2 = 1; i2 < ObjectComposition.A; i2++) {
            ObjectComposition objectCompositionC = ObjectComposition.c(i2);
            if (objectCompositionC != null && objectCompositionC.an != null) {
                String str2 = objectCompositionC.R == null ? "null" : objectCompositionC.R;
                Iterator<Integer> it2 = list.iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = it2.next().intValue();
                    for (int i3 : objectCompositionC.an) {
                        if (iIntValue2 == i3) {
                            System.out.println("[Model Checker] Found model ID " + iIntValue2 + " for OBJECT: " + str2 + " (" + i2 + ")");
                            map.put(Integer.valueOf(iIntValue2), true);
                        }
                    }
                }
            }
        }
        for (int i4 = 1; i4 < class_102.f; i4++) {
            class_102 class_102VarC = class_102.c(i4);
            if (class_102VarC != null && class_102VarC.L != null) {
                String str3 = class_102VarC.o == null ? "null" : class_102VarC.o;
                Iterator<Integer> it3 = list.iterator();
                while (it3.hasNext()) {
                    int iIntValue3 = it3.next().intValue();
                    for (int i5 : class_102VarC.L) {
                        if (iIntValue3 == i5) {
                            System.out.println("[Model Checker] Found model ID " + iIntValue3 + " for NPC: " + str3 + " (" + i4 + ")");
                            map.put(Integer.valueOf(iIntValue3), true);
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < class_127.c.length; i6++) {
            class_127 class_127Var = class_127.c[i6];
            if (class_127Var != null) {
                Iterator<Integer> it4 = list.iterator();
                while (it4.hasNext()) {
                    int iIntValue4 = it4.next().intValue();
                    if (class_127Var.e == iIntValue4) {
                        System.out.println("[Model Checker] Found model ID " + iIntValue4 + " for GFX: " + i6);
                        map.put(Integer.valueOf(iIntValue4), true);
                    }
                }
            }
        }
        System.out.println("[Model Checker] Model scan complete! Found a total of " + map.size() + " used models..");
        if (map.size() > 0) {
            System.out.print("[Model Checker] " + map.size() + " used models: ");
            Iterator it5 = map.keySet().iterator();
            while (it5.hasNext()) {
                System.out.print(((Integer) it5.next()) + ",");
            }
            System.out.print("\n");
        }
    }
}
