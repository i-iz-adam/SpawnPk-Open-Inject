package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_242.class */
public class class_242 extends class_225 {
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    @Override // rs.class_253
    public void b() {
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return this.p;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        Client.gl.c("@gre@X: " + this.t + "   @cya@Y: " + (this.u + (class_194.b() ? 5 : 0)) + "        @yel@Hovered: " + client.ef + "     @mag@(ID: " + this.q + " - Parent: " + this.r + ")", (class_194.b() ? 765 : Client.aj) / 2, (class_194.b() ? 503 : Client.ak) - 4, class_492.e, 0);
    }

    @Override // rs.class_225
    public boolean a(int i) {
        return true;
    }

    @Override // rs.class_253
    public void c() {
    }

    public boolean f() {
        return this.p;
    }

    public void a(boolean z) {
        this.p = z;
    }

    public void b(int i) {
        if (Client.cH <= 0) {
            System.out.println("[ERROR] No opened interface to reference!");
            this.p = false;
            return;
        }
        this.r = 0;
        Widget widget = Widget.H[Client.cH];
        for (int i2 = 0; i2 < widget.ak.length; i2++) {
            Widget widget2 = Widget.H[widget.ak[i2]];
            if (widget2.ak != null && widget2.ak.length > 0) {
                for (int i3 = 0; i3 < widget2.ak.length; i3++) {
                    if (widget2.ak[i3] == i) {
                        this.t = widget2.al[i3];
                        this.u = widget2.ba[i3];
                        this.r = widget2.au;
                        this.s = i3;
                        break;
                    }
                }
            }
            if (this.r != 0) {
                break;
            }
            if (widget.ak[i2] == i) {
                this.r = widget.au;
                this.s = i2;
                this.t = widget.al[i2];
                this.u = widget.ba[i2];
                break;
            }
        }
        if (this.r != 0) {
            this.q = i;
        } else {
            this.p = false;
            System.out.println("[ERROR] Could not find child ID " + i + " in interface " + Client.cH + "!");
        }
    }

    public int g() {
        return this.r;
    }

    public int h() {
        return this.s;
    }

    public int i() {
        return this.t;
    }

    public int j() {
        return this.u;
    }

    public void c(int i) {
        this.t += i;
    }

    public void d(int i) {
        this.u += i;
    }
}
