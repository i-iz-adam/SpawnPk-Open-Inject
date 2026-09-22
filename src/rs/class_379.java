package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_379.class */
class class_379 extends class_358 {
    class_379(long j) {
        super(j);
    }

    @Override // rs.class_358, rs.class_354
    public void c() {
        Widget.H[40091].ax[0] = class_377.bH + 1;
        Widget.H[40091].av[0] = class_377.bI;
        Widget.H[40089].as = class_377.bJ;
        Widget.H[40090].as = class_377.bG - System.currentTimeMillis() <= 0 ? class_377.e : "Starts in.. <img=37> @yel@" + Client.c(class_377.bG - System.currentTimeMillis());
        Widget.H[40095].as = class_377.bK - System.currentTimeMillis() <= 0 ? class_377.e : "<img=37> @yel@" + Client.c(class_377.bK - System.currentTimeMillis());
        Widget.H[40094].as = class_377.bL - System.currentTimeMillis() <= 0 ? class_377.e : "<img=37> @yel@" + Client.c(class_377.bL - System.currentTimeMillis());
        int i = 40101;
        if (class_377.bN != -1) {
            i = 40101 + 1;
            Widget.H[40101].as = "<img=82> " + class_377.bM + ": " + (class_377.bN - System.currentTimeMillis() <= 0 ? class_377.e : "<img=37> @yel@" + Client.c(class_377.bN - System.currentTimeMillis()));
        }
        if (class_377.bP != -1) {
            String str = class_377.bO;
            int i2 = i;
            i++;
            Widget.H[i2].as = "<img=82> " + class_377.bO + ": " + (class_377.bP - System.currentTimeMillis() <= 0 ? class_377.e : "<img=37> @yel@" + Client.c(class_377.bP - System.currentTimeMillis()));
        }
        if (class_377.bQ != -1) {
            int i3 = i;
            int i4 = i + 1;
            Widget.H[i3].as = "<img=82> Event Brawl: " + (class_377.bQ - System.currentTimeMillis() <= 0 ? class_377.e : "<img=37> @yel@" + Client.c(class_377.bQ - System.currentTimeMillis()));
        }
    }
}
