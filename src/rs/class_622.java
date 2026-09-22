package rs;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.system.windows.User32;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_622.class */
public class class_622 extends class_629<ItemComposition> {
    private static final Logger f = LoggerFactory.getLogger((Class<?>) class_622.class);
    private static final String g = class_650.f() + File.separator + "configs" + File.separator + "items.yaml";
    private static final String h = class_650.f() + File.separator + "configs" + File.separator + "i.bin";

    public class_622() {
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
    public ItemComposition a(int i, Map<String, Object> map) {
        ItemComposition itemCompositionE = ItemComposition.e(i);
        if (map.containsKey("clone") || map.containsKey("fullClone")) {
            int iIntValue = map.containsKey("fullClone") ? ((Integer) map.get("fullClone")).intValue() : ((Integer) map.get("clone")).intValue();
            if (!this.d.containsKey(Integer.valueOf(iIntValue))) {
                itemCompositionE.a(ItemComposition.lookupItem(iIntValue));
            } else if (this.c.w_(iIntValue)) {
                itemCompositionE.a((ItemComposition) this.c.b(iIntValue));
            } else {
                itemCompositionE.a(a(iIntValue, this.d.get(Integer.valueOf(iIntValue))));
            }
        }
        if (map.containsKey("hoverClone") || map.containsKey("fullClone")) {
            int iIntValue2 = map.containsKey("fullClone") ? ((Integer) map.get("fullClone")).intValue() : ((Integer) map.get("clone")).intValue();
            if (this.d.containsKey(Integer.valueOf(iIntValue2)) && !this.c.w_(iIntValue2)) {
                a(iIntValue2, this.d.get(Integer.valueOf(iIntValue2)));
            }
            if (class_112.a.w_(iIntValue2)) {
                class_112.a(i, class_112.a.b(iIntValue2));
            }
        }
        itemCompositionE.itemId = i;
        boolean z = false;
        for (String str : map.keySet()) {
            if (!str.startsWith("param_")) {
                Object obj = map.get(str);
                switch (str.toLowerCase()) {
                    case "beginnergear":
                        itemCompositionE.at = 373;
                        itemCompositionE.au = 20;
                        itemCompositionE.av = 20;
                        break;
                    case "name":
                        itemCompositionE.itemName = (String) obj;
                        itemCompositionE.x = itemCompositionE.itemName.replace("@gre@", "");
                        break;
                    case "actions":
                        itemCompositionE.inventoryActions = e(obj);
                        z = true;
                        break;
                    case "groundactions":
                        itemCompositionE.u = e(obj);
                        break;
                    case "stackable":
                        itemCompositionE.C = ((Boolean) obj).booleanValue();
                        break;
                    case "broken":
                        itemCompositionE.V = ((Boolean) obj).booleanValue();
                        itemCompositionE.inventoryActions = new String[]{null, null, null, null, "Destroy"};
                        break;
                    case "note":
                        itemCompositionE.C = true;
                        itemCompositionE.F = ((Integer) obj).intValue();
                        if (itemCompositionE.F != -1) {
                            if (itemCompositionE.p == -1) {
                                itemCompositionE.p = User32.WM_DWMNCRENDERINGCHANGED;
                            }
                            if (!z && itemCompositionE.F != -1) {
                                itemCompositionE.inventoryActions = new String[]{null, null, null, null, "Drop"};
                            }
                            break;
                        } else {
                            itemCompositionE.p = -1;
                            break;
                        }
                        break;
                    case "template":
                        itemCompositionE.p = ((Integer) obj).intValue();
                        break;
                    case "cert":
                        itemCompositionE.F = ((Integer) obj).intValue();
                        break;
                    case "srccolors":
                        itemCompositionE.g = a(obj);
                        break;
                    case "destcolors":
                        itemCompositionE.h = a(obj);
                        break;
                    case "modelid":
                        itemCompositionE.A = ((Integer) obj).intValue();
                        break;
                    case "stackids":
                        itemCompositionE.P = a(obj);
                        break;
                    case "stackamounts":
                        itemCompositionE.ab = a(obj);
                        break;
                    case "zoom":
                        itemCompositionE.G = ((Integer) obj).intValue();
                        break;
                    case "rotations":
                        int[] iArrA = a(obj);
                        itemCompositionE.M = iArrA[0];
                        itemCompositionE.Z = iArrA[1];
                        break;
                    case "offsets":
                        int[] iArrA2 = a(obj);
                        itemCompositionE.v = iArrA2[0];
                        itemCompositionE.W = iArrA2[1];
                        break;
                    case "zan2d":
                        itemCompositionE.ae = ((Integer) obj).intValue();
                        break;
                    case "ambient":
                        itemCompositionE.X = ((Integer) obj).intValue();
                        break;
                    case "contrast":
                        itemCompositionE.I = ((Integer) obj).intValue();
                        break;
                    case "resize":
                        int[] iArrA3 = a(obj);
                        itemCompositionE.t = iArrA3[0];
                        itemCompositionE.O = iArrA3[1];
                        itemCompositionE.N = iArrA3[2];
                        break;
                    case "malemodel1":
                        itemCompositionE.r = ((Integer) obj).intValue();
                        break;
                    case "malemodel":
                        itemCompositionE.r = ((Integer) obj).intValue();
                        itemCompositionE.J = -1;
                        itemCompositionE.K = -1;
                        break;
                    case "femalemodel":
                        itemCompositionE.aa = ((Integer) obj).intValue();
                        itemCompositionE.o = -1;
                        itemCompositionE.q = -1;
                        break;
                    case "femalemodel1":
                        itemCompositionE.aa = ((Integer) obj).intValue();
                        break;
                    case "malemodels":
                        int[] iArrA4 = a(obj);
                        itemCompositionE.r = iArrA4[0];
                        itemCompositionE.K = iArrA4.length >= 2 ? iArrA4[1] : -1;
                        itemCompositionE.J = iArrA4.length >= 3 ? iArrA4[2] : -1;
                        break;
                    case "femalemodels":
                        int[] iArrA5 = a(obj);
                        itemCompositionE.aa = iArrA5[0];
                        itemCompositionE.q = iArrA5.length >= 2 ? iArrA5[1] : -1;
                        itemCompositionE.o = iArrA5.length >= 2 ? iArrA5[2] : -1;
                        break;
                    case "maleoffsets":
                        int[] iArrA6 = a(obj);
                        itemCompositionE.af = (byte) iArrA6[0];
                        itemCompositionE.ag = (byte) iArrA6[1];
                        itemCompositionE.ah = (byte) iArrA6[2];
                        break;
                    case "femaleoffsets":
                        int[] iArrA7 = a(obj);
                        itemCompositionE.ai = (byte) iArrA7[0];
                        itemCompositionE.ak = (byte) iArrA7[1];
                        itemCompositionE.aj = (byte) iArrA7[2];
                        break;
                    case "femaleoffsety":
                        itemCompositionE.ak = (byte) ((Integer) obj).intValue();
                        break;
                    case "femaleoffsetx":
                        itemCompositionE.ai = (byte) ((Integer) obj).intValue();
                        break;
                    case "maleoffsety":
                        itemCompositionE.ag = (byte) ((Integer) obj).intValue();
                        break;
                    case "maleoffsetx":
                        itemCompositionE.af = (byte) ((Integer) obj).intValue();
                        break;
                    case "newmaleoffsetx":
                        itemCompositionE.al = (byte) ((Integer) obj).intValue();
                        break;
                    case "newmaleoffsety":
                        itemCompositionE.am = (byte) ((Integer) obj).intValue();
                        break;
                    case "newmaleoffsetz":
                        itemCompositionE.an = (byte) ((Integer) obj).intValue();
                        break;
                    case "newfemaleoffsetx":
                        itemCompositionE.ao = (byte) ((Integer) obj).intValue();
                        break;
                    case "newfemaleoffsety":
                        itemCompositionE.aq = (byte) ((Integer) obj).intValue();
                        break;
                    case "newfemaleoffsetz":
                        itemCompositionE.ap = (byte) ((Integer) obj).intValue();
                        break;
                    case "newmaleoffsets":
                        int[] iArrA8 = a(obj);
                        itemCompositionE.al = (byte) iArrA8[0];
                        itemCompositionE.am = (byte) iArrA8[1];
                        itemCompositionE.an = (byte) iArrA8[2];
                        break;
                    case "newfemaleoffsets":
                        int[] iArrA9 = a(obj);
                        itemCompositionE.ao = (byte) iArrA9[0];
                        itemCompositionE.aq = (byte) iArrA9[1];
                        itemCompositionE.ap = (byte) iArrA9[2];
                        break;
                    case "malechatmodels":
                        int[] iArrA10 = a(obj);
                        itemCompositionE.B = iArrA10[0];
                        itemCompositionE.s = iArrA10[1];
                        break;
                    case "femalechatmodels":
                        int[] iArrA11 = a(obj);
                        itemCompositionE.Y = iArrA11[0];
                        itemCompositionE.z = iArrA11[1];
                        break;
                    case "fulltexture":
                        itemCompositionE.R = ((Integer) obj).intValue();
                        break;
                    case "textureinvanim":
                        itemCompositionE.U = ((Boolean) obj).booleanValue();
                        break;
                    case "opacity":
                        if (itemCompositionE.aw == null) {
                            itemCompositionE.aw = new class_59();
                        }
                        itemCompositionE.aw.a(((Integer) obj).intValue());
                        break;
                    case "recolor":
                    case "recolors":
                        if (itemCompositionE.aw == null) {
                            itemCompositionE.aw = new class_59();
                        }
                        itemCompositionE.aw.a(new class_56(d(obj)));
                        break;
                    case "retexture":
                    case "retextures":
                        if (itemCompositionE.aw == null) {
                            itemCompositionE.aw = new class_59();
                        }
                        itemCompositionE.aw.a().a(d(obj));
                        break;
                    case "reshade":
                        if (itemCompositionE.aw == null) {
                            itemCompositionE.aw = new class_59();
                        }
                        itemCompositionE.aw.a(new class_60(((Integer) obj).intValue()));
                        break;
                    case "textures":
                        if (itemCompositionE.aw == null) {
                            itemCompositionE.aw = new class_59();
                        }
                        Map map2 = (Map) obj;
                        Iterator it = map2.keySet().iterator();
                        while (it.hasNext()) {
                            int iIntValue3 = ((Integer) it.next()).intValue();
                            itemCompositionE.aw.a().a(iIntValue3, a(map2.get(Integer.valueOf(iIntValue3))));
                        }
                        break;
                    case "osrs":
                        itemCompositionE.ar = ((Boolean) obj).booleanValue();
                        break;
                    case "iconitem":
                        itemCompositionE.as = ((Integer) obj).intValue();
                        break;
                    case "icon":
                        itemCompositionE.at = ((Integer) obj).intValue();
                        break;
                    case "iconoffset":
                    case "iconoffsets":
                        int[] iArrA12 = a(obj);
                        itemCompositionE.au = iArrA12[0];
                        itemCompositionE.av = iArrA12[1];
                        break;
                    case "iconx":
                        itemCompositionE.au = ((Integer) obj).intValue();
                        break;
                    case "icony":
                        itemCompositionE.av = ((Integer) obj).intValue();
                        break;
                    case "hover":
                        class_112.a(i, "\n" + ((String) obj));
                        break;
                    case "disableinvhover":
                    case "disableinventoryhover":
                        itemCompositionE.ax = ((Boolean) obj).booleanValue();
                        break;
                    case "fullclone":
                    case "equipclone":
                    case "cloneequip":
                    case "clone":
                    case "tradeable":
                    case "bankable":
                    case "autoloss":
                    case "autolost":
                    case "autobankable":
                    case "autokeep":
                    case "droppable":
                    case "destroy":
                        break;
                    default:
                        if (!Configuration.b()) {
                            break;
                        } else {
                            f.info("(ID {} '{}') Unknown config: {}", Integer.valueOf(i), itemCompositionE.itemName, str);
                            break;
                        }
                        break;
                }
            }
        }
        if (itemCompositionE.at != -1) {
            class_113.a.a(itemCompositionE.itemId, new class_113(class_114.a, itemCompositionE.at, itemCompositionE.au, itemCompositionE.av));
        } else if (itemCompositionE.as != -1) {
            class_113.a.a(itemCompositionE.itemId, new class_113(class_114.b, itemCompositionE.as, itemCompositionE.au, itemCompositionE.av));
        }
        return itemCompositionE;
    }
}
