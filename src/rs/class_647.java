package rs;

import com.a.a.a.a;

/* JADX INFO: loaded from: client-final.jar:rs/class_647.class */
public class class_647 implements a {
    public static final class_647 a = new class_647(0, 0);
    public static final class_647 b = new class_647(1, 1);
    public static final class_647 c = new class_647(4, 4);
    public static final class_647 d = new class_647(3, 3);
    public static final class_647 e = new class_647(2, 2);
    final int f;
    final int g;

    static class_647[] b() {
        return new class_647[]{a, b, e, d, c};
    }

    class_647(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public static class_647 a(int i) {
        class_647 class_647Var = (class_647) a.a(b(), i);
        if (null == class_647Var) {
            class_647Var = a;
        }
        return class_647Var;
    }

    @Override // com.a.a.a.a
    public int a() {
        return this.g;
    }
}
