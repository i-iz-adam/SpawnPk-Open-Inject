package rs.lpkg;

import rs.Client;
import rs.Player;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/l/p.class */
public class p {
    private o a = new o(getClass().getResourceAsStream("skybox.txt"), "skybox.txt");

    private int a(int i, int i2, int i3) {
        int iAP = i - (Launcher.n().o().aP() / 8);
        int iAQ = i2 - (Launcher.n().o().aQ() / 8);
        int[][] iArr = Launcher.n().o().eS[i3];
        if (iAP < 0 || iAP >= iArr.length || iAQ < 0 || iAQ >= iArr[iAP].length) {
            return -1;
        }
        return iArr[iAP][iAQ];
    }

    public void a() {
        if (this.a == null || !Launcher.n().o().fc) {
            return;
        }
        Launcher.n().o();
        Player player = Client.eR;
        if (player == null) {
            return;
        }
        int i = player.ac;
        int i2 = player.ad;
    }
}
