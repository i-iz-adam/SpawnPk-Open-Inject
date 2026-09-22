package rs.plugins;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;

/* JADX INFO: loaded from: client-final.jar:rs/s/a.class */
public abstract class a implements Module {
    protected Injector a;

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.inject.Module
    public void configure(Binder binder) {
    }

    protected void a() {
    }

    protected void b() {
    }

    public void c() {
    }

    public final Injector d() {
        return this.a;
    }

    public String e() {
        return ((e) getClass().getAnnotation(e.class)).a();
    }
}
