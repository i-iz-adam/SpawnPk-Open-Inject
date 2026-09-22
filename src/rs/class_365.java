package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_365.class */
public class class_365 extends class_360 {
    public class_365(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widget = Widget.H[6575];
        int[] iArr = widget.ak;
        int[] iArr2 = widget.al;
        int[] iArr3 = widget.ba;
        addSprite(68439, "misc/duel load");
        a(68440, "Load last rules", "Load last duel", this.a, 0, class_492.e, false, false, 68439);
        int[] iArr4 = new int[iArr.length + 2];
        int[] iArr5 = new int[iArr2.length + 2];
        int[] iArr6 = new int[iArr3.length + 2];
        for (int i = 0; i < iArr.length; i++) {
            iArr4[i] = iArr[i];
            iArr5[i] = iArr2[i];
            iArr6[i] = iArr3[i];
        }
        iArr4[iArr.length + 0] = 68439;
        iArr5[iArr.length + 0] = 394;
        iArr6[iArr.length + 0] = 304;
        iArr4[iArr.length + 1] = 68440;
        iArr5[iArr.length + 1] = 415;
        iArr6[iArr.length + 1] = 306;
        widget.ak = iArr4;
        widget.al = iArr5;
        widget.ba = iArr6;
    }
}
