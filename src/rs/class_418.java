package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_418.class */
public class class_418 extends class_360 {
    public class_418(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        class_338[] class_338VarArr = this.a;
        Widget widgetJ = j(aU.kr_);
        Widget widgetJ2 = j(16025);
        a(aU.kt_, "Achievement Diary", class_338VarArr, 0, class_492.c, true, true);
        a(663, "", class_338VarArr, 2, 16750848, false, true);
        c(16018, 3, "gameframe/SPRITE");
        a(16019, 1, 0, 16020, 1, "gameframe/SPRITE", 142, 20, "Open achievements");
        a(16020, 2, "gameframe/SPRITE", 142, 20, 16021);
        c(16022, 4, "gameframe/SPRITE");
        a(16023, "", class_338VarArr, 0, 15439903, false, true);
        c(16024, 6, "gameframe/SPRITE");
        a(39868, "Monster drop tables", class_338VarArr, 0, class_492.c, true, true);
        c(39869, aU.nV, "gameframe/SPRITE");
        a(39870, 1, 0, 39871, 1, "gameframe/SPRITE", 142, 20, "Open monster drop tables");
        a(39871, 2, "gameframe/SPRITE", 142, 20, 39872);
        a(62150, "Hotspot: @or2@N/A", class_338VarArr, 0, class_492.e, true, true);
        a(62151, "@yel@N/A", class_338VarArr, 0, class_492.e, true, true);
        a(62152, (Boolean) false);
        H[62152].P = 4;
        H[62152].ab = 11;
        widgetJ.k(6);
        widgetJ.b(0, 16024, 0, 31 + 24 + 0);
        widgetJ.b(1, 16025, 6, 30 + 24 + 0);
        widgetJ.b(2, 16022, 0, 28 + 24 + 0);
        widgetJ.b(3, 16022, 0, 255 + 0);
        widgetJ.b(4, 16023, 4, User32.VK_ZOOM + 0);
        widgetJ.b(5, 32000, 0, 0);
        for (int i = 16026; i <= 16125; i++) {
            a(i, "", "Select", this.a, 0, class_492.c, false, false, 125);
        }
        widgetJ2.k(101);
        widgetJ2.b(0, 663, 4, 6);
        int i2 = 1;
        for (int i3 = 16026; i2 <= 100 && i3 <= 16125; i3++) {
            if (i2 == 1) {
                widgetJ2.b(i2, i3, 6, 6);
            } else {
                widgetJ2.b(i2, i3, 6, widgetJ2.ba[i2 - 1] + 13);
            }
            i2++;
        }
        widgetJ2.P = 168;
        widgetJ2.aP = 225 - 24;
        widgetJ2.aF = aU.nE;
    }
}
