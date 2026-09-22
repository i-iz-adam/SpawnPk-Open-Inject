package rs.gui.cpkg;

import javax.swing.JLabel;

/* JADX INFO: loaded from: client-final.jar:rs/gui/c/b.class */
class b implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ a f;

    b(a aVar, int i, String str, String str2, String str3, String str4) {
        this.f = aVar;
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        JLabel jLabel = this.a == 1 ? this.f.c : this.f.m;
        JLabel jLabel2 = this.a == 1 ? this.f.g : this.f.q;
        JLabel jLabel3 = this.a == 1 ? this.f.i : this.f.s;
        JLabel jLabel4 = this.a == 1 ? this.f.k : this.f.u;
        if (this.b.contains("Died)")) {
            jLabel.setIcon(this.f.x);
        } else {
            jLabel.setIcon(this.f.w);
        }
        jLabel.setText("<html><font style='bold' color='yellow'>" + this.b.replace("@red@", "</font><font color='red'>") + "</font></html>");
        jLabel2.setText("<html>Correct overheads: <font color='35FFA6'>" + this.c + "</font></html>");
        jLabel3.setText("<html>Magic RNG: <font color='5AA8FF'>" + this.d + "</font></html>");
        jLabel4.setText("<html>Damage Dealt: <font color='FF6C3A'>" + this.e + "</font></html>");
    }
}
