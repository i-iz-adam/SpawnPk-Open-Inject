package rs;

import java.text.NumberFormat;

/* JADX INFO: loaded from: client-final.jar:rs/class_234.class */
class class_234 extends class_553 {
    class_234() {
    }

    @Override // rs.class_553
    public void a() {
        while (true) {
            int iE = e();
            if (iE != 0) {
                switch (iE) {
                    case 1:
                        class_233.C.clear();
                        while (true) {
                            int iC = c();
                            if (iC > 0) {
                                class_233.C.put(Integer.valueOf(iC - 1), true);
                            }
                        }
                        break;
                    case 2:
                        boolean z = e() == 1;
                        int iC2 = c();
                        int iC3 = c();
                        int iG = g();
                        int i = iC2 * iG;
                        int i2 = iG * iC3;
                        class_233.A = ((int) (((double) (i / i2)) * 100.0d)) + "% (" + NumberFormat.getIntegerInstance().format(i2 - i) + " tokens left)";
                        Widget.H[60625].as = "@yel@" + iC2 + " / " + iC3 + " rolls @or1@(" + NumberFormat.getIntegerInstance().format(i) + " / " + NumberFormat.getIntegerInstance().format(i2) + " tokens)";
                        if (i2 > 0) {
                            if (!z) {
                                int i3 = (int) (((double) class_233.x) * (((double) i) / ((double) i2)));
                                class_233.w = i3;
                                class_233.y = i3;
                            } else {
                                class_233.w = (int) (((double) class_233.x) * (((double) i) / ((double) i2)));
                                if (class_233.w > class_233.x) {
                                    class_233.w = class_233.x;
                                }
                                if (class_233.w < 0) {
                                    class_233.w = 0;
                                }
                            }
                        }
                        break;
                    case 3:
                        int iE2 = e();
                        class_233.s = iE2;
                        class_233.r = e();
                        if (iE2 == 1) {
                            Widget widget = Widget.H[60617];
                            Widget widget2 = Widget.H[60618];
                            class_333 class_333Var = class_233.E;
                            widget2.E = class_333Var;
                            widget.E = class_333Var;
                            Widget.H[60621].E = class_233.F;
                        } else {
                            Widget widget3 = Widget.H[60617];
                            Widget widget4 = Widget.H[60618];
                            class_333 class_333Var2 = class_233.F;
                            widget4.E = class_333Var2;
                            widget3.E = class_333Var2;
                            Widget.H[60621].E = class_233.E;
                        }
                        if (Widget.H[60611].ax[0] > 0) {
                            class_233.B = " Pay @yel@" + Widget.H[60611].av[0] + "x <col=FFBD5C>" + (ItemComposition.lookupItem(Widget.H[60611].ax[0] - 1).itemName).replace("@gre@", "") + "s    ";
                        }
                        break;
                    case 4:
                        class_233.q = e() == 1;
                        break;
                }
            } else {
                return;
            }
        }
    }
}
