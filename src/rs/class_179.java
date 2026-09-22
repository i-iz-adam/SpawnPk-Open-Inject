package rs;

import com.google.inject.Singleton;
import javax.inject.Inject;

/* JADX INFO: loaded from: client-final.jar:rs/class_179.class */
@Singleton
public class class_179 {
    private final Client a;
    private class_181 b;

    @Inject
    public class_179(Client client) {
        this.a = client;
    }

    public class_181 a(String str) {
        this.b = new class_181(this).a(str);
        return this.b;
    }

    public void a() {
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
    }

    public Client b() {
        return this.a;
    }

    public class_181 c() {
        return this.b;
    }
}
