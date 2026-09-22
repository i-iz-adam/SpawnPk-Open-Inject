package rs;

import java.util.Arrays;

/* JADX INFO: loaded from: client-final.jar:rs/class_559.class */
public class class_559 extends class_553 {
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;

    @Override // rs.class_553
    public void a() {
        int iE = e();
        Widget widget = Widget.H[g()];
        if (iE == 0 && widget.aw != null) {
            Arrays.fill(widget.aw, (Object) null);
        }
        if (iE == 1) {
            int iC = c();
            String strH = h();
            if (widget.aw != null && iC < widget.aw.length) {
                widget.aw[iC] = strH;
            }
        }
        if (iE == 2) {
            String strH2 = h();
            if (widget.aw != null) {
                Arrays.fill(widget.aw, strH2);
            }
        }
        if (iE == 3) {
            if (e() == 1) {
                widget.aw = new String[widget.ax.length];
                Arrays.fill(widget.aw, (Object) null);
            } else {
                widget.aw = null;
            }
        }
        if (iE == 4) {
            int iC2 = c();
            int iC3 = c();
            widget.ab = iC2;
            widget.ao = iC3;
        }
    }
}
