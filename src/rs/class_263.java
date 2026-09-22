package rs;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_263.class */
public class class_263 {
    public static class_553 a = new class_264();
    public Map<String, class_262> b = new HashMap();
    public List<class_262> c = new ArrayList();

    public class_262 a(String str, int i, int i2, Color color, Color color2) {
        class_262 class_262VarA = class_262.a(i, i2, color, color2);
        this.b.put(str, class_262VarA);
        return class_262VarA;
    }

    public void a(String str, int i, int i2, Color color) {
        a(str, i, i2, color, new Color(color.getRed(), color.getGreen(), color.getBlue(), 75));
    }

    public void a(int i, int i2, Color color, Color color2) {
        a(i + "," + i2, i, i2, color, color2);
    }

    public void a(int i, int i2, Color color) {
        a(i, i2, color, new Color(color.getRed(), color.getGreen(), color.getBlue(), 75));
    }

    public void a(int i, int i2) {
        a(i, i2, Color.MAGENTA);
    }

    public void b(int i, int i2) {
        this.b.remove(i + "," + i2);
    }
}
