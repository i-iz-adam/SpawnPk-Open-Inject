package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_554.class */
public class class_554 extends class_553 {
    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 1) {
            Client client = this.c;
            Client.cT = c();
            return;
        }
        if (iE == 2) {
            if (e() == 1) {
                Widget.H[12929].aE = Widget.j(14, "magic/on");
                Widget.H[12929].N = "Infernal barrage";
                Widget.H[12931].as = "Level 92 : Infernal barrage";
                Widget.H[12911].aE = Widget.j(16, "magic/on");
                Widget.H[12911].N = "Infernal blitz";
                Widget.H[12913].as = "Level 80 : Infernal blitz";
                return;
            }
            Widget.H[12929].aE = Widget.j(13, "magic/on");
            Widget.H[12929].N = "Blood barrage";
            Widget.H[12931].as = "Level 92 : Blood barrage";
            Widget.H[12911].aE = Widget.j(15, "magic/on");
            Widget.H[12911].N = "Infernal blitz";
            Widget.H[12913].as = "Level 80 : Blood blitz";
            return;
        }
        if (iE == 3) {
            Client.dx = c();
            return;
        }
        if (iE == 4) {
            this.c.dW = h();
            this.c.gb = false;
            this.c.fN = 1;
            this.c.dY = "";
            Client client2 = this.c;
            Client.fM = true;
            return;
        }
        if (iE == 5) {
            e();
            e();
            e();
            return;
        }
        if (iE == 6) {
            this.c.v.i = e() == 1;
            return;
        }
        if (iE != 7) {
            if (iE == 8) {
                class_398.c = e() == 1;
            }
        } else {
            Client.bC = c();
            Client.bE = c();
            Client.bG = c();
            Client.bF = c();
            Client.bH = c();
            Client.bD = false;
        }
    }
}
