package rs.ppkg;

import com.google.c.l;
import com.google.c.r;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import java.awt.Color;
import java.lang.reflect.Type;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import rs.Client;
import rs.Configuration;
import rs.class_1;
import rs.class_10;
import rs.class_139;
import rs.class_667;
import rs.class_8;
import rs.eventbus.DeferredEventBus;
import rs.eventbus.EventBus;
import rs.plugins.g;
import rs.plugins.h;

/* JADX INFO: loaded from: client-final.jar:rs/p/b.class */
public class b extends AbstractModule {
    private static final l a = new r().a((Type) Color.class, (Object) new class_8()).j();
    private final boolean b = Configuration.d.booleanValue();
    private final boolean c = false;

    @Override // com.google.inject.AbstractModule
    protected void configure() {
        bindConstant().annotatedWith(Names.named("developerMode")).to(this.b);
        bindConstant().annotatedWith(Names.named("safeMode")).to(false);
        bind(class_1.class).toInstance(new class_1());
        bind(Client.class).toInstance(new Client());
        bind(ScheduledExecutorService.class).toInstance(new class_10(Executors.newSingleThreadScheduledExecutor()));
        bind(class_667.class);
        bind(g.class);
        bind(class_139.class);
        bind(l.class).toInstance(a);
        bind(l.class).toInstance(a);
        bind(EventBus.class).toInstance(new EventBus());
        bind(EventBus.class).annotatedWith(Names.named("Deferred EventBus")).to(DeferredEventBus.class);
    }

    @Singleton
    @Provides
    h a(class_139 class_139Var) {
        return (h) class_139Var.a(h.class);
    }
}
