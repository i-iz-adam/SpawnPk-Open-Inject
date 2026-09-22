package rs;

import gnu.trove.f.b.cc;

/* JADX INFO: loaded from: client-final.jar:rs/class_113.class */
public class class_113 {
    public static cc<class_113> a = new cc<>();
    public class_114 b;
    public int c;
    public int d;
    public int e;

    public class_333 a() {
        switch (class_115.a[this.b.ordinal()]) {
            case 1:
                return class_326.b.w_(this.c) ? Client.fE[class_326.b.b(this.c).b()] : Client.fE[this.c];
            case 2:
                return ItemComposition.g(this.c);
            default:
                return null;
        }
    }

    public static class_333 a(int i) {
        return a.b(i).a();
    }

    public static void a(int i, int i2, int i3) {
        class_113 class_113VarB = a.b(i);
        class_333 class_333VarA = class_113VarB.a();
        if (class_333VarA != null) {
            class_333VarA.f(i2 + class_113VarB.d, i3 + class_113VarB.e);
        }
    }

    public static void a(int i, int i2, int i3, int i4) {
        class_113 class_113VarB = a.b(i);
        class_333 class_333VarA = class_113VarB.a();
        if (class_333VarA != null) {
            class_333VarA.g(i2 + class_113VarB.d, i3 + class_113VarB.e, i4);
        }
    }

    public static boolean b(int i) {
        return a.w_(i);
    }

    public class_113(class_114 class_114Var, int i, int i2, int i3) {
        this.b = class_114Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }
}
