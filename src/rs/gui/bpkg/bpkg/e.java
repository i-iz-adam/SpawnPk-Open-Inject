package rs.gui.bpkg.bpkg;

import java.io.File;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/b/e.class */
public class e {
    public static final int a = 5;
    public static final String b = "_ver_";
    private final String c;
    private int d = 1;

    public e(String str) {
        this.c = str;
    }

    public void a() {
        File file = new File(d.a);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.getName().startsWith(this.c + "_ver_")) {
                    Integer numValueOf = Integer.valueOf(Integer.parseInt(file2.getName().replace(this.c + "_ver_", "")));
                    if (numValueOf.intValue() > this.d) {
                        this.d = numValueOf.intValue();
                    }
                }
            }
        }
    }

    public boolean a(int i) {
        return this.d >= i;
    }
}
