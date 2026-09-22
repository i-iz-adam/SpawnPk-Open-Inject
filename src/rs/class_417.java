package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_417.class */
public class class_417 extends class_360 {
    public class_417(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(51150);
        addSprite(51151, "fountain/sprite 23");
        a(51152, "Well of Good Will", this.a, 2, 16751360, true, true);
        a(51153, "The well of goodwill seeks..", this.a, 2, 16751360, true, true);
        a(51154, "@yel@Divine spirit shields", this.a, 2, 16751360, true, true);
        a(51155, (Boolean) false);
        H[51155].P = 4;
        H[51155].ab = 11;
        H[51155].ax[0] = 13741;
        H[51155].av[0] = 1;
        c(51156, 12, "teleport/sprite");
        c(51157, 13, "teleport/sprite");
        Widget.H[51157].E = new class_333("teleport/sprite 13", 0, 15);
        a(51158, "0% (0/100)", this.a, 0, 0, true, false);
        Widget widgetD2 = d(51159);
        widgetD2.k(3);
        widgetD2.b(0, 51156, 176 - 80, 6);
        widgetD2.b(1, 51157, 176 - 80, 6);
        widgetD2.b(2, 51158, 325 - 80, 8);
        a(51160, "<u=16776960>Server wide progress</u>", this.a, 1, 16751360, true, true);
        a(51161, "Once the server-wide goal is reached, ALL players will receive..", this.a, 1, 16751360, true, true);
        a(51162, "@yel@Double chance for artifacts & statuettes @or1@(2 hrs)", this.a, 2, 16751360, true, true);
        a(51163, "fountain/sprite", 16, 120, 34, "Donate to well of goodwill", -1, 51164, 1);
        a(51164, "fountain/sprite", 15, 120, 34, 51165);
        a(51166, "<img=9> Contribute", this.a, 1, 16751360, true, true);
        a(51167, "For each @yel@Divine spirit shield<col=FF9B00> that you", this.a, 0, 16751360, true, true);
        a(51168, "contribute, you will individually receive..", this.a, 0, 16751360, true, true);
        a(51169, "@yel@5x Goodwill Points", this.a, 1, 16751360, true, true);
        widgetD.k(18);
        widgetD.b(0, 51151, 55, 36);
        widgetD.b(1, 51152, 257, 44);
        widgetD.b(2, 51153, 259, 75);
        widgetD.b(3, 51154, 258, 93);
        widgetD.b(4, 51155, 122, 74);
        widgetD.b(5, 51155, 357, 74);
        widgetD.b(6, 51159, 17, 137);
        widgetD.b(7, 51160, 260, 122);
        widgetD.b(8, 51161, 257, 164);
        widgetD.b(9, 51162, 257, 182);
        widgetD.b(10, 51163, 84, User32.VK_OEM_PA3);
        widgetD.b(11, 51164, 84, User32.VK_OEM_PA3);
        widgetD.b(12, 51166, 141, 246);
        widgetD.b(13, 51167, 326, 230);
        widgetD.b(14, 51168, 326, User32.VK_OEM_BACKTAB);
        widgetD.b(15, 51169, 326, 260);
        widgetD.b(16, 65418, 433, 44);
        widgetD.b(17, 65419, 433, 44);
    }
}
