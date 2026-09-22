package rs;

import com.sun.jna.platform.win32.aU;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_475.class */
public class class_475 extends class_360 {
    public static int c = aU.ih_;

    public class_475(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(c);
        c(65403, 9, "fountain/SPRITE");
        a(65404, "@or1@Fuse items to sacrifice them into blood diamonds!", this.a, 0, 16751360, true, true);
        a(65405, "@or1@Blood Diamond Fuser", this.a, 2, 16751360, true, true);
        a(65406, "fountain/SPRITE", 7, 59, 13, "Fuse", -1, 65407, 1);
        a(65407, "fountain/SPRITE", 8, 59, 13, 65408);
        a(65409, "Fuse", this.a, 0, 16751360, true, true);
        a(65410, "fountain/SPRITE", 7, 59, 13, "Fuse", -1, 65411, 1);
        a(65411, "fountain/SPRITE", 8, 59, 13, 65412);
        a(65413, "Fuse", this.a, 0, 16751360, true, true);
        a(65414, "fountain/SPRITE", 7, 59, 13, "Fuse", -1, 65415, 1);
        a(65415, "fountain/SPRITE", 8, 59, 13, 65416);
        a(65417, "Fuse", this.a, 0, 16751360, true, true);
        a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        a(65752, "fountain/button", 1, 75, 45, "Cycle items", -1, 65753, 1);
        a(65753, "fountain/button", 2, 75, 45, 65754);
        a(65755, "Cycle", this.a, 0, 16751360, true, true);
        a(65756, "Fuser", this.a, 0, 16751360, true, true);
        c(65757, 1, "fountain/icon");
        widgetD.ak = new int[19];
        widgetD.al = new int[19];
        widgetD.ba = new int[19];
        widgetD.b(0, 65403, 5, 20);
        widgetD.b(1, 65404, 258, 67);
        widgetD.b(2, 65405, 263, 27);
        widgetD.b(3, 65406, 230, 128);
        widgetD.b(4, 65407, 230, 128);
        widgetD.b(5, 65409, 259, 129);
        widgetD.b(6, 65410, 230, 190);
        widgetD.b(7, 65411, 230, 190);
        widgetD.b(8, 65413, 259, 191);
        widgetD.b(9, 65414, 230, User32.VK_ZOOM);
        widgetD.b(10, 65415, 230, User32.VK_ZOOM);
        widgetD.b(11, 65417, 259, User32.VK_NONAME);
        widgetD.b(12, 65418, User32.MN_GETHMENU, 27);
        widgetD.b(13, 65419, User32.MN_GETHMENU, 27);
        widgetD.b(14, 65752, UnixStat.DEFAULT_FILE_PERM, aU.hS_);
        widgetD.b(15, 65753, UnixStat.DEFAULT_FILE_PERM, aU.hS_);
        widgetD.b(16, 65755, UnixStat.DEFAULT_FILE_PERM + 46 + 1, aU.hS_ + 7 + 2);
        widgetD.b(17, 65756, UnixStat.DEFAULT_FILE_PERM + 47 + 1, aU.hS_ + 19 + 2);
        widgetD.b(18, 65757, UnixStat.DEFAULT_FILE_PERM + 6, aU.hS_ + 10);
    }
}
