package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_557.class */
public class class_557 extends class_553 {
    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 1) {
            int iE2 = e();
            while (true) {
                int i = iE2;
                if (i == 0) {
                    break;
                }
                if (i == 1) {
                    class_240.q = "<img=233> Players in lobby: @or1@" + c();
                    class_240.r = class_240.p + " @whi@" + class_240.q;
                } else if (i == 2) {
                    class_240.p = "<img=37> Starting in: @or1@" + h();
                    class_240.r = class_240.p + " @whi@" + class_240.q;
                } else if (i == 3) {
                    class_240.p = "<img=73> Waiting for @or1@" + e() + "+@whi@ players..";
                    class_240.r = class_240.p + " @whi@" + class_240.q;
                } else if (i == 4) {
                    class_240.r = "<img=24> Starting a match, please wait..";
                } else if (i == 5) {
                    class_240.s = h().toString();
                }
                iE2 = e();
            }
        }
        if (iE != 2) {
            return;
        }
        int iE3 = e();
        while (true) {
            int i2 = iE3;
            if (i2 == 0) {
                return;
            }
            if (i2 == 1) {
                class_240.t = "Survivors: @yel@" + e();
            }
            if (i2 == 2) {
                class_240.u = "Kills: @yel@" + e();
            }
            if (i2 >= 3 && i2 <= 5) {
                class_240.A = true;
            }
            if (i2 == 3) {
                long jC = c();
                if (jC > 0) {
                    class_240.x = System.currentTimeMillis() + (jC * 1000);
                } else {
                    class_240.x = 0L;
                }
            }
            if (i2 == 4) {
                long jC2 = c();
                if (jC2 > 0) {
                    class_240.y = System.currentTimeMillis() + (jC2 * 1000);
                } else {
                    class_240.y = 0L;
                }
            }
            if (i2 == 5) {
                class_240.C = e();
                long jC3 = c();
                if (jC3 > 0) {
                    class_240.z = System.currentTimeMillis() + (jC3 * 1000);
                    class_240.F = class_240.C;
                } else {
                    if (class_240.C == 1) {
                        class_240.C = 2;
                    }
                    class_240.z = 0L;
                }
            }
            if (i2 == 6) {
                class_240.A = false;
            }
            if (i2 == 7) {
                class_240.J = "<img=128> Match style: @cya@" + h() + " <img=128>";
            }
            if (i2 == 8) {
                class_240.B = e() == 1;
            }
            iE3 = e();
        }
    }
}
