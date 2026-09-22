package rs.plugins.cpkg;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/s/c/h.class */
public enum h {
    a(-1, Color.RED.getRGB()),
    b(5, Color.GREEN.getRGB()),
    c(4, Color.WHITE.getRGB()),
    d(3, Color.ORANGE.getRGB()),
    e(5, Color.YELLOW.getRGB()),
    f(42, Color.CYAN.getRGB()),
    g(2, Color.BLUE.getRGB());

    int h;
    int i;
    public static final Map<Integer, h> j = new HashMap();

    h(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    static {
        for (h hVar : values()) {
            j.put(Integer.valueOf(hVar.h), hVar);
        }
    }
}
