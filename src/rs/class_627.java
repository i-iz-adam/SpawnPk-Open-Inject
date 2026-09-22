package rs;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_627.class */
public class class_627 {
    public static boolean a = false;
    public static boolean b = false;
    private static final String c = class_650.b() + File.separator + "e.yaml";
    private static final String d = class_650.b() + File.separator + "e.bin";

    public static void a() {
        if (Configuration.c.intValue() != 1) {
            return;
        }
        a = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 25000; i++) {
            try {
                b = true;
                class_102 class_102VarC = class_102.c(i);
                Map<String, Object> mapA = a(class_102VarC, class_102.b((int) class_102VarC.x));
                if (mapA.size() > 0) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("name", class_102VarC.o);
                    for (String str : mapA.keySet()) {
                        linkedHashMap2.put(str, mapA.get(str));
                    }
                    linkedHashMap.put(Integer.valueOf(i), linkedHashMap2);
                }
            } catch (Exception e) {
            }
        }
        try {
            new class_618(c, d).a((Map<Integer, Map<String, Object>>) linkedHashMap);
            System.out.println("..Dump completed!");
            a = false;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void b() {
        if (Configuration.c.intValue() != 1) {
            return;
        }
        String[] strArr = {"retextures", "srcColors", "destColors", "chatHeadModels"};
        class_620 class_620Var = new class_620();
        class_620Var.d();
        for (int i = 0; i < 25000; i++) {
            try {
                class_102 class_102VarA = class_620Var.a(i);
                if (class_102VarA == null) {
                    class_102VarA = class_102.b(i);
                }
                int i2 = 0;
                Map<String, Object> mapA = a(class_102VarA, class_102.c(i));
                Iterator<String> it = mapA.keySet().iterator();
                while (it.hasNext()) {
                    if (!Arrays.asList(strArr).contains(it.next())) {
                        i2++;
                    }
                }
                if (i2 > 0) {
                    System.out.println("Found differences in NPC " + i + " (" + class_102.c(i).o + ")");
                    System.out.println("{ ");
                    try {
                        for (String str : mapA.keySet()) {
                            System.out.print(str + " => " + a(mapA.get(str)));
                            System.out.println();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("}\n");
                }
            } catch (Exception e2) {
            }
        }
    }

    public static Map<String, Object> a(class_102 class_102Var, class_102 class_102Var2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!class_102Var.o.equalsIgnoreCase(class_102Var2.o)) {
            linkedHashMap.put("name", class_102Var.o);
        }
        if (class_102Var.n != class_102Var2.n) {
            linkedHashMap.put("combatLevel", Integer.valueOf(class_102Var.n));
        }
        if (!Arrays.equals(class_102Var.p, class_102Var2.p)) {
            linkedHashMap.put("actions", class_102Var.p);
        }
        if (!Arrays.equals(class_102Var.L, class_102Var2.L)) {
            linkedHashMap.put("models", class_102Var.L);
        }
        if (class_102Var.I != class_102Var2.I) {
            linkedHashMap.put("scaleWidth", Integer.valueOf(class_102Var.I));
        }
        if (class_102Var.E != class_102Var2.E) {
            linkedHashMap.put("scaleHeight", Integer.valueOf(class_102Var.E));
        }
        if (!Arrays.equals(class_102Var.v, class_102Var2.v)) {
            linkedHashMap.put("srcColors", class_102Var.v);
        }
        if (!Arrays.equals(class_102Var.s, class_102Var2.s)) {
            linkedHashMap.put("destColors", class_102Var.s);
        }
        if (!Arrays.equals(class_102Var.t, class_102Var2.t)) {
            linkedHashMap.put("chatHeadModels", class_102Var.t);
        }
        if (class_102Var.r != class_102Var2.r) {
            linkedHashMap.put("size", Byte.valueOf(class_102Var.r));
        }
        if (class_102Var.w != class_102Var2.w) {
            linkedHashMap.put("standAnim", Integer.valueOf(class_102Var.w));
        }
        if (class_102Var.q != class_102Var2.q) {
            linkedHashMap.put("walkAnim", Integer.valueOf(class_102Var.q));
        }
        if (class_102Var.l == class_102Var.B && class_102Var.l == class_102Var.j && class_102Var.l != class_102Var2.l) {
            linkedHashMap.put("rotateAnim", Integer.valueOf(class_102Var.l));
        } else {
            if (class_102Var.l != class_102Var2.l) {
                linkedHashMap.put("rotateAnim180", Integer.valueOf(class_102Var.l));
            }
            if (class_102Var.B != class_102Var2.B) {
                linkedHashMap.put("rotateAnim90CW", Integer.valueOf(class_102Var.B));
            }
            if (class_102Var.j != class_102Var2.j) {
                linkedHashMap.put("rotateAnim90CCW", Integer.valueOf(class_102Var.j));
            }
        }
        if (class_102Var.F != class_102Var2.F) {
            linkedHashMap.put("minimap", Boolean.valueOf(class_102Var.F));
        }
        if (class_102Var.K != class_102Var2.K) {
            linkedHashMap.put("priorityRender", Boolean.valueOf(class_102Var.K));
        }
        if (class_102Var.D != class_102Var2.D) {
            linkedHashMap.put("ambient", Integer.valueOf(class_102Var.D));
        }
        if (class_102Var.J != class_102Var2.J) {
            linkedHashMap.put("contrast", Integer.valueOf(class_102Var.J));
        }
        if (class_102Var.u != class_102Var2.u) {
            linkedHashMap.put("headIcon", Integer.valueOf(class_102Var.u));
        }
        if (class_102Var.y != class_102Var2.y) {
            linkedHashMap.put("rotationSpeed", Integer.valueOf(class_102Var.y));
        }
        if (class_102Var.k != class_102Var2.k) {
            linkedHashMap.put("anInt57", Integer.valueOf(class_102Var.k));
        }
        if (class_102Var.m != class_102Var2.m) {
            linkedHashMap.put("anInt59", Integer.valueOf(class_102Var.m));
        }
        if (class_102Var.h != class_102Var2.h) {
            linkedHashMap.put("pet", Boolean.valueOf(class_102Var.h));
        }
        if (class_102Var.C != class_102Var2.C) {
            linkedHashMap.put("clickable", Boolean.valueOf(class_102Var.C));
        }
        if (class_102Var.g != class_102Var2.g) {
            linkedHashMap.put("renderIdle", Boolean.valueOf(class_102Var.g));
        }
        return linkedHashMap;
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
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
