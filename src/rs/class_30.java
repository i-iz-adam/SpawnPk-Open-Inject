package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_30.class */
public final class class_30 {
    private final int d;
    public int b;
    private final class_47 c = new class_47();
    private final class_26 e = new class_26();
    public class_496 a = new class_496();

    public class_30(int i) {
        this.d = i;
        this.b = i;
    }

    public class_47 a(long j) {
        class_47 class_47Var = (class_47) this.a.a(j);
        if (class_47Var != null) {
            this.e.a(class_47Var);
        }
        return class_47Var;
    }

    public void a(class_47 class_47Var, long j) {
        try {
            if (this.b == 0) {
                class_47 class_47VarA = this.e.a();
                class_47VarA.b();
                class_47VarA.a();
                if (class_47VarA == this.c) {
                    class_47 class_47VarA2 = this.e.a();
                    class_47VarA2.b();
                    class_47VarA2.a();
                }
            } else {
                this.b--;
            }
            this.a.a(class_47Var, j);
            this.e.a(class_47Var);
        } catch (RuntimeException e) {
            String strValueOf = String.valueOf(class_47Var);
            e.toString();
            class_650.e("47547, " + strValueOf + ", " + j + ", 2, " + strValueOf);
            throw new RuntimeException();
        }
    }

    public void a() {
        while (true) {
            class_47 class_47VarA = this.e.a();
            if (class_47VarA == null) {
                this.b = this.d;
                return;
            } else {
                class_47VarA.b();
                class_47VarA.a();
            }
        }
    }
}
