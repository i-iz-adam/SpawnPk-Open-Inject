package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_427.class */
public class class_427 extends class_360 {
    public class_427(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(64600);
        Widget widgetJ = j(64601);
        for (int i = 64602; i <= 64702; i++) {
            a(i, "", "Select", this.a, 0, class_492.e, false, true, 125);
        }
        int i2 = 64602 + 1;
        Widget.H[64602].as = "@yel@<u=16776960>Features / Tools";
        int i3 = i2 + 1;
        Widget.H[i2].as = "<img=321> View collection logs";
        int i4 = i3 + 1;
        Widget.H[i3].as = "<img=321> Collection log milestones";
        int i5 = i4 + 1;
        Widget.H[i4].as = "<img=39> Search drops by monster";
        int i6 = i5 + 1;
        Widget.H[i5].as = "<img=39> Search drops by item";
        int i7 = i6 + 1;
        Widget.H[i6].as = "<img=153> View mail inbox";
        int i8 = i7 + 1;
        Widget.H[i7].as = "";
        int i9 = i8 + 1;
        Widget.H[i8].as = "@yel@<u=16776960>Item Guides";
        int i10 = i9 + 1;
        Widget.H[i9].as = "<img=39> Search item guide";
        int i11 = i10 + 1;
        Widget.H[i10].as = "<img=39> View all item guides";
        int i12 = i11 + 1;
        Widget.H[i11].as = "";
        int i13 = i12 + 1;
        Widget.H[i12].as = "@yel@<u=16776960>Miscellaneous";
        int i14 = i13 + 1;
        Widget.H[i13].as = "<img=16> Donate to us";
        int i15 = i14 + 1;
        Widget.H[i14].as = "<img=14> Vote for us";
        int i16 = i15 + 1;
        Widget.H[i15].as = "<img=40> Forums";
        int i17 = i16 + 1;
        Widget.H[i16].as = "<img=40> Discord";
        addSprite(64703, "gameframe/sprite 6");
        widgetJ.k(101);
        int i18 = 0;
        for (int i19 = 64602; i18 <= 100 && i19 <= 64702; i19++) {
            widgetJ.b(i18, i19, 2, i18 == 0 ? 5 : widgetJ.ba[i18 - 1] + 15);
            i18++;
        }
        widgetJ.P = 168;
        widgetJ.aP = 225 - 24;
        widgetJ.aF = aU.nE;
        widgetD.k(6);
        widgetD.b(0, 64703, 0, 31 + 24 + 0);
        widgetD.b(1, 32000, 0, 0);
        widgetD.b(2, 16022, 0, 28 + 24 + 0);
        widgetD.b(3, 16022, 0, 255 + 0);
        widgetD.b(4, 16023, 4, User32.VK_ZOOM + 0);
        widgetD.b(5, 64601, 6, 30 + 24 + 0);
    }
}
