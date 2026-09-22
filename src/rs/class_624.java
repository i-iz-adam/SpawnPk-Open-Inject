package rs;

import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_624.class */
public class class_624 extends class_629<ObjectComposition> {
    private static final String f = class_650.f() + File.separator + "configs" + File.separator + "objects.yaml";
    private static final String g = class_650.f() + File.separator + "configs" + File.separator + "o.bin";

    public class_624() {
        super(f, g);
    }

    @Override // rs.class_629
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ObjectComposition a(int i, Map<String, Object> map) {
        if (map.containsKey("osrs")) {
            if (ObjectComposition.E != class_119.d) {
                ObjectComposition.a(class_119.d);
            }
        } else if (ObjectComposition.E != class_119.a) {
            ObjectComposition.a(class_119.a);
        }
        ObjectComposition objectCompositionB = ObjectComposition.b(i);
        objectCompositionB.aa = i;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            switch (str.toLowerCase()) {
                case "randomanimstart":
                    objectCompositionB.at = ((Boolean) obj).booleanValue();
                    break;
                case "name":
                    objectCompositionB.R = (String) obj;
                    break;
                case "actions":
                    objectCompositionB.ay = e(obj);
                    break;
                case "models":
                    objectCompositionB.an = a(obj);
                    break;
                case "ambient":
                    objectCompositionB.Q = (byte) ((Integer) obj).intValue();
                    break;
                case "contrast":
                    objectCompositionB.T = (byte) ((Integer) obj).intValue();
                    break;
                case "mergenormals":
                    objectCompositionB.al = ((Boolean) obj).booleanValue();
                    break;
                case "anim":
                case "animid":
                case "animation":
                    objectCompositionB.au = ((Integer) obj).intValue();
                    break;
                case "osrs":
                    if (((Boolean) obj).booleanValue()) {
                        objectCompositionB.av = 1;
                        break;
                    } else {
                        objectCompositionB.av = 0;
                        break;
                    }
                    break;
                case "tilex":
                    objectCompositionB.U = ((Integer) obj).intValue();
                    break;
                case "tiley":
                    objectCompositionB.af = ((Integer) obj).intValue();
                    break;
                case "resize":
                    int[] iArrA = a(obj);
                    objectCompositionB.X = iArrA[0];
                    objectCompositionB.am = iArrA[1];
                    objectCompositionB.S = iArrA[2];
                    break;
                case "contouredground":
                    objectCompositionB.ag = ((Boolean) obj).booleanValue();
                    break;
                case "interacttype":
                    objectCompositionB.aj = ((Boolean) obj).booleanValue();
                    break;
                case "hasactions":
                    objectCompositionB.ar = ((Boolean) obj).booleanValue();
                    break;
                case "srccolors":
                case "srccolor":
                    objectCompositionB.ax = a(obj);
                    break;
                case "destcolors":
                case "destcolor":
                    objectCompositionB.W = a(obj);
                    break;
                case "forceallrevisions":
                    objectCompositionB.aw = true;
                    break;
            }
        }
        return objectCompositionB;
    }
}
