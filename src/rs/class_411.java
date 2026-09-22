package rs;

import com.sun.jna.platform.win32.COM.tlb.a.e;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_411.class */
public class class_411 extends class_360 {
    public class_411(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widget = Widget.H[6960];
        a(30583, e.d, "Select option", this.a, 1, class_492.d, false, true, 200);
        a(30584, e.j, "Select option", this.a, 1, class_492.d, false, true, 200);
        a(6961, "Close Window", "Close", this.a, 1, class_492.d, false, true, 200);
        Widget.H[30583].bm = true;
        Widget.H[30584].bm = true;
        widget.ak = new int[]{6961, 6962, 6963, 6964, 30583, 30584};
        widget.al = new int[]{430, aU.hK_, User32.VK_OEM_CUSEL, 174, 142, 142};
        widget.ba = new int[]{8, 158, 89, aU.hu_, User32.VK_OEM_BACKTAB, User32.WM_SYSCHAR};
    }
}
