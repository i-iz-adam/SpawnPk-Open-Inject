package rs;

import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.aW;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_476.class */
public class class_476 extends class_360 {
    public class_476(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(18546);
        c(60008, 11, "fountain/SPRITE");
        a(60009, "@or1@Blood Shard Salvaging Kit", this.a, 0, 16751360, true, true);
        a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        a(60010, "Items you'll salvage into shards..", this.a, 0, 16751360, false, true);
        Widget widgetD2 = d(DumpArchiveConstants.OFS_MAGIC);
        widgetD2.ak = new int[1];
        widgetD2.al = new int[1];
        widgetD2.ba = new int[1];
        widgetD2.aF = User32.VK_PLAY;
        widgetD2.P = 175;
        widgetD2.aP = 132;
        widgetD2.bh = 87;
        a(DumpArchiveConstants.NFS_MAGIC, (Boolean) true);
        H[60012].W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
        H[60012].P = 4;
        H[60012].ab = 11;
        H[60012].ao = 10;
        widgetD2.b(0, DumpArchiveConstants.NFS_MAGIC, 11, 5);
        a(60013, (Boolean) false);
        H[60013].P = 4;
        H[60013].ab = 11;
        H[60013].ao = 10;
        a(60014, "fountain/SPRITE", 4, 100, 32, "Salvage", -1, 60015, 1);
        a(60015, "fountain/SPRITE", 5, 100, 32, 60016);
        a(60017, "Salvage", this.a, 0, 16751360, true, true);
        a(60018, "", this.a, 0, 16751360, false, true);
        a(60019, "fountain/SPRITE", 12, 100, 20, "Read guide", -1, 60020, 1);
        a(60020, "fountain/SPRITE", 13, 100, 20, 60021);
        a(60022, "Item guide", this.a, 0, 16751360, true, true);
        widgetD.k(14);
        widgetD.b(0, 60008, 98, 64);
        widgetD.b(1, 60009, 261, 73);
        widgetD.b(2, 65418, aU.in_, 71);
        widgetD.b(3, 65419, aU.in_, 71);
        widgetD.b(4, 60010, 112, 100);
        widgetD.b(5, DumpArchiveConstants.OFS_MAGIC, 105, 115);
        widgetD.b(6, 60013, 378, 151);
        widgetD.b(7, 60014, 307, 200);
        widgetD.b(8, 60015, 307, 200);
        widgetD.b(9, 60017, 357, aU.ht_);
        widgetD.b(10, 60018, 300, 133);
        widgetD.b(11, 60019, aW.aKu, 107 + 10);
        widgetD.b(12, 60020, aW.aKu, 107 + 10);
        widgetD.b(13, 60022, 357, 110 + 10);
    }
}
