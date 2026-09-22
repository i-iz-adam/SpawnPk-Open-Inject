package rs;

import com.sun.jna.platform.win32.m;
import org.lwjgl.opengl.EXTClipVolumeHint;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_429.class */
public class class_429 extends class_360 {
    public class_429(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(33000);
        addSprite(33001, "equipment/loadout 1");
        a(33002, (Boolean) false);
        Widget widget = Widget.H[33002];
        widget.ax = new int[28];
        widget.av = new int[28];
        widget.aP = 7;
        widget.P = 4;
        widget.ab = 5;
        widget.ao = 3;
        widget.aD = true;
        a(33003, (Boolean) false);
        Widget widget2 = Widget.H[33003];
        widget2.ax = new int[15];
        widget2.av = new int[15];
        widget2.aP = 5;
        widget2.P = 3;
        widget2.ab = 20;
        widget2.ao = 8;
        widget2.aD = true;
        a(33004, "Item Loadout Modification Interface", this.a, 2, class_492.e, true, true);
        a(33005, "LMS Loadout", this.a, 2, class_492.e, true, true);
        a(33006, "fountain/sprite", 16, 120, 34, "Save loadout", -1, 33007, 1);
        a(33007, "fountain/sprite", 15, 120, 34, EXTClipVolumeHint.GL_CLIP_VOLUME_CLIPPING_HINT_EXT);
        a(33009, "fountain/sprite", 16, 120, 34, "Set as default", -1, m.ay, 1);
        a(m.ay, "fountain/sprite", 15, 120, 34, 33011);
        a(33012, "@yel@Save loadout", this.a, 1, class_492.e, true, true);
        a(33013, "@yel@Reset to default", this.a, 1, class_492.e, true, true);
        widgetD.k(13);
        widgetD.b(0, 33001, 8, 6);
        widgetD.b(1, 33002, 178, 51);
        widgetD.b(2, 33003, 25, 73);
        widgetD.b(3, 33004, 255, 15);
        widgetD.b(4, 33005, g.c, 60);
        widgetD.b(5, 33006, 354, 109);
        widgetD.b(6, 33007, 354, 109);
        widgetD.b(7, 33009, 354, 159);
        widgetD.b(8, m.ay, 354, 159);
        widgetD.b(9, 33012, 414, 118);
        widgetD.b(10, 33013, 414, 168);
        widgetD.b(11, 65418, 479, 14);
        widgetD.b(12, 65419, 479, 14);
    }

    public static void h() {
        String str = "";
        Widget widget = Widget.H[33002];
        Widget widget2 = Widget.H[33003];
        for (int i = 0; i < 28; i++) {
            str = str + (widget.ax[i] - 1) + "," + widget.av[i];
            if (i < 27) {
                str = str + " ";
            }
        }
        String str2 = ((((((((((((("" + (widget2.ax[1] - 1) + "," + widget2.av[1] + " ") + (widget2.ax[3] - 1) + "," + widget2.av[3] + " ") + (widget2.ax[4] - 1) + "," + widget2.av[4] + " ") + (widget2.ax[6] - 1) + "," + widget2.av[6] + " ") + (widget2.ax[7] - 1) + "," + widget2.av[7] + " ") + (widget2.ax[8] - 1) + "," + widget2.av[8] + " ") + "0,0 ") + (widget2.ax[10] - 1) + "," + widget2.av[10] + " ") + "0,0 ") + (widget2.ax[12] - 1) + "," + widget2.av[12] + " ") + (widget2.ax[13] - 1) + "," + widget2.av[13] + " ") + "0,0 ") + (widget2.ax[14] - 1) + "," + widget2.av[14] + " ") + (widget2.ax[5] - 1) + "," + widget2.av[5];
        Client.ap = "::cld1 " + str;
        Client.ao = "::cld2 " + str2;
    }
}
