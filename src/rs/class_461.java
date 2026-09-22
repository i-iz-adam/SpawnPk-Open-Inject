package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_461.class */
public class class_461 extends class_553 {
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 5;
    private static final int j = 6;
    private static final int k = 7;

    @Override // rs.class_553
    public void a() {
        class_456 class_456VarH = class_455.h();
        class_458 class_458VarI = class_455.i();
        switch (e()) {
            case 0:
                class_456VarH.a();
                break;
            case 1:
                int iE = e();
                String strH = h();
                if (iE >= 0 && iE < class_457.values().length) {
                    class_456VarH.a(class_457.values()[iE], strH);
                    break;
                }
                break;
            case 2:
                int iE2 = e();
                int iE3 = e();
                if (iE3 >= 0 && iE3 < class_457.values().length) {
                    class_456VarH.a(iE2, class_457.values()[iE3]);
                    break;
                }
                break;
            case 3:
                if (e() != 1) {
                    class_458VarI.b();
                } else {
                    class_458VarI.c();
                }
                break;
            case 4:
                class_458VarI.a(class_459.values()[e()]);
                break;
            case 5:
                class_456VarH.b();
                break;
            case 6:
                int i2 = 0;
                int i3 = 0;
                if (Configuration.ai == class_151.b) {
                    i2 = (Client.ai / 2) - 356;
                    i3 = (Client.ah / 2) - 230;
                }
                class_313.d().g().b(20, 331 + i2 + 4, User32.WM_MENUDRAG + i3 + 10, 16764195);
                class_313.d().g().b(10, 331 + i2 + 4, User32.WM_MENUDRAG + i3 + 10, 65315);
                break;
            case 7:
                class_456VarH.c();
                int iE4 = e();
                if (iE4 != -1) {
                    class_456VarH.a(iE4, true);
                }
                break;
        }
    }
}
