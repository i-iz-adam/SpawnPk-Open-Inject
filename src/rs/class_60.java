package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_60.class */
public class class_60 extends class_58 {
    private final int a;

    public class_60(int i) {
        this.a = i;
    }

    @Override // rs.class_58
    public void a(ColorUtility colorUtility) {
    }

    @Override // rs.class_58
    public void a(ColorUtility colorUtility, int i) {
        if (colorUtility.as == null || !colorUtility.as[i]) {
            colorUtility.ar[i] = this.a;
        }
    }

    public int a() {
        return this.a;
    }
}
