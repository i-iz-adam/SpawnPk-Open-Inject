package rs;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_621.class */
public class class_621 extends class_629<class_127> {
    private static final Logger f = LoggerFactory.getLogger((Class<?>) class_621.class);
    private static final String g = class_650.f() + File.separator + "configs" + File.separator + "graphics.yaml";
    private static final String h = class_650.f() + File.separator + "configs" + File.separator + "g.bin";

    public class_621() {
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
    public class_127 a(int i, Map<String, Object> map) {
        class_127 class_127Var = new class_127();
        class_127Var.d = i;
        if (map.containsKey("clone")) {
            int iIntValue = ((Integer) map.get("clone")).intValue();
            if (this.d.containsKey(Integer.valueOf(iIntValue)) && !this.c.w_(iIntValue)) {
                class_127Var = new class_127(i, a(iIntValue, this.d.get(Integer.valueOf(iIntValue))));
            } else if (this.c.w_(iIntValue)) {
                class_127Var = new class_127(i, (class_127) this.c.b(iIntValue));
            } else if (class_127.c[iIntValue] != null) {
                class_127Var = new class_127(i, class_127.c[iIntValue]);
            } else {
                f.warn("Could not find clone ID {} for GFX {}", Integer.valueOf(iIntValue), Integer.valueOf(i));
            }
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            switch (str.toLowerCase()) {
                case "model":
                case "modelid":
                    class_127Var.e = ((Integer) obj).intValue();
                    break;
                case "anim":
                case "animation":
                    class_127Var.f = ((Integer) obj).intValue();
                    class_127Var.g = class_127Var.f == -1 ? null : class_99.a[((Integer) obj).intValue()];
                    break;
                case "resizex":
                    class_127Var.j = ((Integer) obj).intValue();
                    break;
                case "resizey":
                    class_127Var.k = ((Integer) obj).intValue();
                    break;
                case "rotation":
                    class_127Var.l = ((Integer) obj).intValue();
                    break;
                case "ambient":
                    class_127Var.m = ((Integer) obj).intValue();
                    break;
                case "contrast":
                    class_127Var.n = ((Integer) obj).intValue();
                    break;
                case "srccolors":
                    class_127Var.h = a(obj);
                    break;
                case "destcolors":
                    class_127Var.i = a(obj);
                    break;
                case "osrs":
                    class_127Var.o = ((Boolean) obj).booleanValue();
                    break;
                case "osid":
                    class_127Var.o = true;
                    break;
                case "reshade":
                    if (class_127Var.r == null) {
                        class_127Var.r = new class_59();
                    }
                    class_127Var.r.a(new class_60(((Integer) obj).intValue()));
                    break;
                case "recolor":
                case "recolors":
                    if (class_127Var.r == null) {
                        class_127Var.r = new class_59();
                    }
                    class_127Var.r.a(new class_56(d(obj)));
                    break;
                case "retextures":
                    if (class_127Var.r == null) {
                        class_127Var.r = new class_59();
                    }
                    class_127Var.r.a().a(d(obj));
                    break;
                case "textures":
                    if (class_127Var.r == null) {
                        class_127Var.r = new class_59();
                    }
                    Map map2 = (Map) obj;
                    Iterator it = map2.keySet().iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        class_127Var.r.a().a(iIntValue2, a(map2.get(Integer.valueOf(iIntValue2))));
                    }
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
        return class_127Var;
    }
}
