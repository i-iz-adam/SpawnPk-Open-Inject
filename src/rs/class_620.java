package rs;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_620.class */
public class class_620 extends class_629<class_102> {
    private static final Logger f = LoggerFactory.getLogger((Class<?>) class_620.class);
    private static final String g = class_650.f() + File.separator + "configs" + File.separator + "npcs.yaml";
    private static final String h = class_650.f() + File.separator + "configs" + File.separator + "e.bin";

    public class_620() {
        super(g, h);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // rs.class_629
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public class_102 a(int i, Map<String, Object> map) {
        class_102 class_102VarB = class_102.b(i);
        if (class_102VarB.n == -1) {
            class_102VarB.n = 0;
        }
        if (map.containsKey("reset")) {
            class_102VarB = new class_102();
            class_102VarB.x = i;
        } else {
            class_102VarB.B = -1;
            class_102VarB.j = -1;
            class_102VarB.l = -1;
        }
        if (map.containsKey("clone")) {
            int iIntValue = ((Integer) map.get("clone")).intValue();
            if (!this.d.containsKey(Integer.valueOf(iIntValue))) {
                class_102VarB.a(class_102.c(iIntValue));
            } else if (this.c.w_(iIntValue)) {
                class_102VarB.a((class_102) this.c.b(iIntValue));
            } else {
                class_102VarB.a(a(iIntValue, this.d.get(Integer.valueOf(iIntValue))));
            }
        }
        class_102VarB.x = i;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            switch (str.toLowerCase()) {
                case "opacity":
                    if (class_102VarB.i == null) {
                        class_102VarB.i = new class_59();
                    }
                    class_102VarB.i.a(((Integer) obj).intValue());
                    break;
                case "name":
                    class_102VarB.o = (String) obj;
                    break;
                case "combatlevel":
                    class_102VarB.n = ((Integer) obj).intValue();
                    break;
                case "actions":
                    class_102VarB.p = e(obj);
                    break;
                case "models":
                    class_102VarB.L = a(obj);
                    break;
                case "scaling":
                    int[] iArrA = a(obj);
                    class_102VarB.I = iArrA[0];
                    class_102VarB.E = iArrA[1];
                    break;
                case "scalewidth":
                    class_102VarB.I = ((Integer) obj).intValue();
                    break;
                case "scaleheight":
                    class_102VarB.E = ((Integer) obj).intValue();
                    break;
                case "recolor":
                case "recolors":
                    if (class_102VarB.i == null) {
                        class_102VarB.i = new class_59();
                    }
                    class_102VarB.i.a(new class_56(d(obj)));
                    break;
                case "retexture":
                case "retextures":
                    if (class_102VarB.i == null) {
                        class_102VarB.i = new class_59();
                    }
                    class_102VarB.i.a().a(d(obj));
                    break;
                case "reshade":
                    if (class_102VarB.i == null) {
                        class_102VarB.i = new class_59();
                    }
                    class_102VarB.i.a(new class_60(((Integer) obj).intValue()));
                    break;
                case "textures":
                    if (class_102VarB.i == null) {
                        class_102VarB.i = new class_59();
                    }
                    Map map2 = (Map) obj;
                    Iterator it = map2.keySet().iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        class_102VarB.i.a().a(iIntValue2, a(map2.get(Integer.valueOf(iIntValue2))));
                    }
                    break;
                case "srccolors":
                    class_102VarB.v = a(obj);
                    break;
                case "destcolors":
                    class_102VarB.s = a(obj);
                    break;
                case "chatheadmodels":
                    class_102VarB.t = a(obj);
                    break;
                case "size":
                    class_102VarB.r = b(obj);
                    break;
                case "standanim":
                    class_102VarB.w = ((Integer) obj).intValue();
                    break;
                case "walkanim":
                    class_102VarB.q = ((Integer) obj).intValue();
                    break;
                case "rotateanim":
                    int iIntValue3 = ((Integer) obj).intValue();
                    class_102VarB.B = iIntValue3;
                    class_102VarB.j = iIntValue3;
                    class_102VarB.l = iIntValue3;
                    break;
                case "rotateanim180":
                    class_102VarB.l = ((Integer) obj).intValue();
                    break;
                case "rotateanim90cw":
                    class_102VarB.B = ((Integer) obj).intValue();
                    break;
                case "rotateanim90ccw":
                    class_102VarB.j = ((Integer) obj).intValue();
                    break;
                case "minimap":
                    class_102VarB.F = ((Boolean) obj).booleanValue();
                    break;
                case "priorityrender":
                case "priority":
                    class_102VarB.K = ((Boolean) obj).booleanValue();
                    break;
                case "renderidle":
                    class_102VarB.g = ((Boolean) obj).booleanValue();
                    break;
                case "clickable":
                    class_102VarB.C = ((Boolean) obj).booleanValue();
                    break;
                case "pet":
                    class_102VarB.h = ((Boolean) obj).booleanValue();
                    class_102VarB.F = false;
                    class_102VarB.K = false;
                    break;
                case "anint59":
                    class_102VarB.m = ((Integer) obj).intValue();
                    break;
                case "anint57":
                    class_102VarB.k = ((Integer) obj).intValue();
                    break;
                case "contrast":
                    class_102VarB.J = ((Integer) obj).intValue();
                    break;
                case "ambient":
                    class_102VarB.D = ((Integer) obj).intValue();
                    break;
                case "rotationspeed":
                    class_102VarB.y = ((Integer) obj).intValue();
                    break;
                case "headicon":
                    class_102VarB.u = ((Integer) obj).intValue();
                    break;
                case "osrs":
                    class_102VarB.af = ((Boolean) obj).booleanValue();
                    break;
                case "icon":
                    class_102VarB.T = ((Integer) obj).intValue();
                    break;
                case "iconx":
                    class_102VarB.U = ((Integer) obj).intValue();
                    break;
                case "icony":
                    class_102VarB.V = ((Integer) obj).intValue();
                    break;
                case "iconz":
                    class_102VarB.W = ((Integer) obj).intValue();
                    break;
                case "mapicon":
                    class_102VarB.S = ((Integer) obj).intValue();
                    break;
                case "healthbar":
                    class_102VarB.O = ((Boolean) obj).booleanValue();
                    break;
                case "healthbarcolor":
                case "healthbartype":
                    if (!(obj instanceof String) || !((String) obj).equalsIgnoreCase("blue")) {
                        if ((obj instanceof String) && ((String) obj).equalsIgnoreCase("yellow")) {
                            class_102VarB.P = (byte) 2;
                        } else {
                            class_102VarB.P = ((Byte) obj).byteValue();
                        }
                        break;
                    } else {
                        class_102VarB.P = (byte) 1;
                        break;
                    }
                    break;
                case "hover":
                    class_102VarB.X = (String) obj;
                    if (!class_102VarB.X.contains("\n")) {
                        break;
                    } else {
                        class_102VarB.Z = true;
                        class_102VarB.X = " " + class_102VarB.X;
                        break;
                    }
                    break;
                case "forcehover":
                case "hoverforced":
                    class_102VarB.Y = ((Boolean) obj).booleanValue();
                    break;
                case "glow":
                    int[] iArrA2 = a(obj);
                    class_102VarB.aa = iArrA2[0];
                    class_102VarB.ac = iArrA2[1];
                    class_102VarB.ad = iArrA2[2];
                    class_102VarB.ab = 1;
                    break;
                case "tags":
                case "clone":
                case "reset":
                    break;
                default:
                    if (!Configuration.b()) {
                        break;
                    } else {
                        f.info("(ID {} '{}') Unknown config: {}", Integer.valueOf(i), class_102VarB.o, str);
                        break;
                    }
                    break;
            }
        }
        boolean z = (class_102VarB.x == 3118 || class_102VarB.o == null || !class_102VarB.o.toLowerCase().contains("pet") || class_102VarB.o.toLowerCase().contains(" shop") || class_102VarB.o.toLowerCase().contains("-keeper") || class_102VarB.o.toLowerCase().contains("pete")) ? false : true;
        if (!z && class_102VarB.p != null) {
            for (String str2 : class_102VarB.p) {
                if (str2 != null && str2.equalsIgnoreCase("pick-up")) {
                    z = true;
                }
            }
        }
        if (z) {
            class_102VarB.h = true;
        }
        if (class_102VarB.h) {
            class_102VarB.r = (byte) 1;
            class_102VarB.K = false;
            class_102VarB.y = 32;
        }
        if (class_102VarB.p == null) {
            class_102VarB.p = new String[]{null, null, null, null, null};
        }
        return class_102VarB;
    }
}
