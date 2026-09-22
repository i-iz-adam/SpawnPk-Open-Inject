package rs;

import com.google.inject.internal.asm.$Opcodes;

/* JADX INFO: loaded from: client-final.jar:rs/class_474.class */
public class class_474 extends class_360 {
    public class_474(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(3320);
        c(60000, 10, "fountain/SPRITE");
        a(60001, "@or1@The Blood Fountain", this.a, 1, 16751360, true, true);
        a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        a(60002, "<img=186> Blood perk tree (abilities)", "Select blood perk tree", this.a, 0, 16751360, false, true, 180);
        a(60003, "<img=118> Blood pool store", "Select blood pool shop", this.a, 0, 16751360, false, true, 180);
        a(60004, "<img=67> Blood diamond fuser", "Select diamond fusing", this.a, 0, 16751360, false, true, 180);
        a(60005, "<img=117> Blood diamond store", "Select diamond shop", this.a, 0, 16751360, false, true, 180);
        a(60006, "<img=68> Blood shard salvaging", "Select shard salvaging", this.a, 0, 16751360, false, true, 180);
        a(60007, "<img=116> Blood shard store", "Select shard shop", this.a, 0, 16751360, false, true, 180);
        widgetD.k(10);
        widgetD.b(0, 60000, 140, 64);
        widgetD.b(1, 60001, 275, 73);
        widgetD.b(2, 65418, 373, 72);
        widgetD.b(3, 65419, 373, 72);
        widgetD.b(4, 60002, 197, 110);
        widgetD.b(5, 60003, 197, 128);
        widgetD.b(6, 60004, 197, 166);
        widgetD.b(7, 60005, 197, $Opcodes.INVOKESTATIC);
        widgetD.b(8, 60006, 197, 222);
        widgetD.b(9, 60007, 197, 240);
    }
}
