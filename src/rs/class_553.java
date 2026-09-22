package rs;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;

/* JADX INFO: loaded from: client-final.jar:rs/class_553.class */
public abstract class class_553 implements Module {
    protected Injector a;
    protected Buffer b;
    protected Client c;

    public abstract void a();

    @Override // com.google.inject.Module
    public void configure(Binder binder) {
    }

    public void a(Buffer buffer) {
        this.b = buffer;
    }

    public void a(Client client) {
        this.c = client;
    }

    public int c() {
        return this.b.A();
    }

    public long d() {
        return this.b.E();
    }

    public int e() {
        return this.b.y();
    }

    public int f() {
        return a(1);
    }

    public int a(int i) {
        this.b.J();
        int iK = this.b.k(i);
        this.b.K();
        return iK;
    }

    public int g() {
        return this.b.D();
    }

    public String h() {
        return this.b.F();
    }

    public final Injector i() {
        return this.a;
    }
}
