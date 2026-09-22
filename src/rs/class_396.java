package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_396.class */
public class class_396 extends class_360 {
    public static final int c = 18547;

    public class_396(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(c);
        c(65552, 14, "fountain/sprite");
        a(65553, "@or1@Legendary Pet Fusing", this.a, 2, 16751360, true, true);
        a(65554, "@gre@Limited time pet fusion!", this.a, 0, 16751360, true, true);
        a(18552, "New pet ETA: @whi@10/26/2016", this.a, 0, 16751360, true, true);
        a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        a(18548, (Boolean) false);
        H[18548].ab = 120;
        H[18548].ao = 10;
        H[18548].P = 2;
        H[18548].ax[0] = 12112;
        H[18548].av[0] = 3;
        H[18548].ax[1] = 15001;
        H[18548].av[1] = 3;
        a(18549, (Boolean) false);
        H[18549].ab = 120;
        H[18549].ao = 10;
        H[18549].P = 1;
        H[18549].ax[0] = 11338;
        H[18549].av[0] = 500;
        a(18550, (Boolean) false);
        H[18550].ab = 120;
        H[18550].ao = 10;
        H[18550].P = 1;
        H[18550].ax[0] = 12114;
        H[18550].av[0] = 1;
        a(65559, "fountain/SPRITE", 12, 100, 20, "Fuse pets", -1, 65560, 1);
        a(65560, "fountain/SPRITE", 13, 100, 20, 65561);
        a(65562, "Fuse", this.a, 0, 16751360, true, true);
        widgetD.k(12);
        widgetD.b(0, 65552, 5, 20);
        widgetD.b(1, 65553, 258, 27);
        widgetD.b(2, 65554, 258, 58);
        widgetD.b(3, 18552, 259, 84);
        widgetD.b(4, 18548, 167, 118);
        widgetD.b(5, 18549, User32.VK_OEM_ENLW, 157);
        widgetD.b(6, 18550, User32.VK_OEM_ENLW, User32.VK_OEM_PA3);
        widgetD.b(7, 65559, 220, 283);
        widgetD.b(8, 65560, 220, 283);
        widgetD.b(9, 65562, 258, 286);
        widgetD.b(10, 65418, 425, 26);
        widgetD.b(11, 65419, 425, 26);
    }
}
