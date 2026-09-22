package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_462.class */
class class_462 extends class_553 {
    class_462() {
    }

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            class_452.h();
        }
        if (iE == 3) {
            class_453 class_453Var = null;
            switch (e()) {
                case 1:
                    class_453Var = class_453.a;
                    break;
                case 2:
                    class_453Var = class_453.b;
                    break;
                case 3:
                    class_453Var = class_453.c;
                    break;
            }
            int iG = g();
            int iE2 = e();
            String strH = h();
            String strH2 = iE2 >= 2 ? h() : null;
            int iE3 = e();
            int[][] iArr = new int[iE3][];
            for (int i = 0; i < iE3; i++) {
                iArr[i] = new int[2];
                iArr[i][0] = g();
                iArr[i][1] = g();
            }
            class_452.b(class_453Var, iG, strH, strH2, iArr, c(), c(), e() == 1);
        }
        if (iE == 2) {
            class_452.i();
        }
        int i2 = 0;
        int i3 = 0;
        if (Configuration.ai == class_151.b) {
            i2 = (Client.ai / 2) - 356;
            i3 = (Client.ah / 2) - 230;
        }
        if (iE == 5) {
            class_313.d().g().b(20, 73 + i2 + 4, 115 + i3 + 10, 16764195);
            class_313.d().g().b(10, 73 + i2 + 4, 115 + i3 + 10, 65315);
        }
        if (iE == 6) {
            class_313.d().g().b(15, 200 + i2, 107 + i3, 16764195);
            class_313.d().g().b(15, 390 + i2, 107 + i3, 16764195);
            class_313.d().g().b(15, User32.WM_CHANGEUISTATE + i2, 200 + i3, 16764195);
            class_313.d().g().b(15, 200 + i2, 225 + i3, 16764195);
            class_313.d().g().b(15, 390 + i2, 225 + i3, 16764195);
        }
        if (iE == 7) {
            int iE4 = e();
            if (iE4 == 0) {
                Widget.H[30390].bd = false;
                Widget.H[30391].bd = false;
                Widget.H[30393].as = " Complete the chapter\\n to claim these items.";
                Widget.H[30393].an = class_352.a[0];
            } else if (iE4 == 1) {
                Widget.H[30390].bd = true;
                Widget.H[30391].bd = true;
                Widget.H[30393].as = " @yel@CLAIM!";
                Widget.H[30393].an = class_352.a[2];
                if (!class_297.l()) {
                    class_297.a(30390, class_300.d, 35, -30);
                    class_297.k().b(true);
                }
            } else {
                Widget.H[30390].bd = false;
                Widget.H[30391].bd = false;
                Widget.H[30393].as = "@gre@You've claimed\\n@gre@these rewards!";
                Widget.H[30393].an = class_352.a[0];
            }
        }
        if (iE == 8) {
            class_452.bH = c();
            class_452.bI = c();
        }
    }
}
