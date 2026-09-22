package rs;

import java.io.File;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_619.class */
public class class_619 extends class_629<class_99> {
    private static final Logger f = LoggerFactory.getLogger((Class<?>) class_619.class);
    private static final String g = class_650.f() + File.separator + "configs" + File.separator + "anims.yaml";
    private static final String h = class_650.f() + File.separator + "configs" + File.separator + "a.bin";

    public class_619() {
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
    public class_99 a(int i, Map<String, Object> map) {
        class_99 class_99Var = new class_99();
        class_99Var.r = i;
        if (map.containsKey("clone")) {
            int iIntValue = ((Integer) map.get("clone")).intValue();
            if (this.d.containsKey(Integer.valueOf(iIntValue)) && !this.c.w_(iIntValue)) {
                class_99Var = new class_99(i, a(iIntValue, this.d.get(Integer.valueOf(iIntValue))));
            } else if (this.c.w_(iIntValue)) {
                class_99Var = new class_99(i, (class_99) this.c.b(iIntValue));
            } else if (class_99.a[iIntValue] != null) {
                class_99Var = new class_99(i, class_99.a[iIntValue]);
            } else {
                f.warn("Could not find clone ID {} for Anim {}", Integer.valueOf(iIntValue), Integer.valueOf(i));
            }
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            switch (str.toLowerCase()) {
                case "frames":
                    class_99Var.d = ((Integer) obj).intValue();
                    break;
                case "frameids":
                    class_99Var.e = a(obj);
                    break;
                case "durations":
                    class_99Var.g = a(obj);
                    break;
                case "secondary":
                    class_99Var.f = a(obj);
                    break;
                case "framestep":
                    class_99Var.h = ((Integer) obj).intValue();
                    break;
                case "priority":
                    class_99Var.k = ((Integer) obj).intValue();
                    break;
                case "playeroffhand":
                    class_99Var.l = ((Integer) obj).intValue() == -1 ? -1 : ((Integer) obj).intValue() + 512;
                    break;
                case "playermainhand":
                    class_99Var.m = ((Integer) obj).intValue() == -1 ? -1 : ((Integer) obj).intValue() + 512;
                    break;
                case "maxloops":
                    class_99Var.n = ((Integer) obj).intValue();
                    break;
                case "precedence":
                    class_99Var.o = ((Integer) obj).intValue();
                    break;
                case "walkprecedence":
                    class_99Var.p = ((Integer) obj).intValue();
                    break;
                case "replaymode":
                    class_99Var.q = ((Integer) obj).intValue();
                    break;
                case "osid":
                    class_99Var.w = true;
                    break;
                case "stretches":
                    class_99Var.j = ((Boolean) obj).booleanValue();
                    break;
                case "walkable":
                    if (((Boolean) obj).booleanValue()) {
                        class_99Var.k = 6;
                        class_99Var.n = 1;
                        class_99Var.o = 2;
                        class_99Var.p = 2;
                        class_99Var.f = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                        class_99Var.i = new int[]{9, 11, 13, 15, 17, 19, 165, 167, 169, 171, 173, 175, 177, 179, 9999999};
                        break;
                    } else {
                        class_99Var.o = 0;
                        class_99Var.p = 0;
                        break;
                    }
                    break;
                case "interleave":
                    class_99Var.i = a(obj);
                    break;
                case "animmayaid":
                    class_99Var.B = ((Integer) obj).intValue();
                    break;
                case "animmayastart":
                    class_99Var.z = ((Integer) obj).intValue();
                    break;
                case "animmayaend":
                    class_99Var.A = ((Integer) obj).intValue();
                    break;
                case "ref":
                case "clone":
                    break;
                default:
                    if (Configuration.b()) {
                        f.info("(ID {}) Unknown config: {}", Integer.valueOf(i), str);
                        break;
                    } else {
                        break;
                    }
                    break;
            }
        }
        return class_99Var;
    }
}
