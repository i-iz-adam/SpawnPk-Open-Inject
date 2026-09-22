package rs;

import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: client-final.jar:rs/class_181.class */
public class class_181 extends class_178 {
    public static final int a = 6;
    private final class_179 b;
    private class_324 c;
    private class_324 d;
    private class_182 f;
    private String g;
    private String h;
    private String i;
    private String e = "";
    private Predicate<String> j = null;
    private Consumer<String> k = null;

    public class_181(class_179 class_179Var) {
        this.b = class_179Var;
        k();
    }

    @Override // rs.class_178
    public void a() {
        Client clientB = this.b.b();
        clientB.gb = false;
        clientB.fN = 6;
        clientB.dY = this.e;
        Client.fM = true;
    }

    @Override // rs.class_178
    public void b() {
        this.j.test(this.b.b().dY);
    }

    public class_181 a(class_182 class_182Var) {
        this.f = class_182Var;
        return this;
    }

    public class_181 a(String str) {
        this.g = str;
        return this;
    }

    public class_181 b(String str) {
        this.e = str;
        return this;
    }

    public class_181 a(Consumer<String> consumer) {
        this.j = str -> {
            consumer.accept(str);
            return true;
        };
        return this;
    }

    public String c(String str) {
        return (this.h.isEmpty() && this.i.isEmpty()) ? str : this.h + str + this.i;
    }

    public class_324 c() {
        return this.c == null ? this.b.b().gn : this.c;
    }

    public class_324 d() {
        return this.d == null ? this.b.b().gn : this.d;
    }

    private void k() {
        this.g = "Enter text:";
        this.h = "";
        this.i = "";
        this.c = null;
        this.d = null;
        this.f = class_182.a;
        this.e = "";
    }

    public class_182 e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.h;
    }

    public String h() {
        return this.i;
    }

    public Predicate<String> i() {
        return this.j;
    }

    public Consumer<String> j() {
        return this.k;
    }
}
