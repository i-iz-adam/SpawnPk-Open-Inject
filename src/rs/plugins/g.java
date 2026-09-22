package rs.plugins;

import com.google.a.b.as;
import com.google.a.g.O;
import com.google.a.g.P;
import com.google.a.g.S;
import com.google.a.g.ag;
import com.google.inject.CreationException;
import com.google.inject.Injector;
import com.google.inject.Key;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Configuration;
import rs.class_132;
import rs.class_139;
import rs.class_19;
import rs.class_665;
import rs.class_666;
import rs.class_667;
import rs.eventbus.EventBus;
import rs.runelite.events.PluginChanged;

/* JADX INFO: loaded from: client-final.jar:rs/s/g.class */
@Singleton
public class g {
    private static final Logger c;
    private static final String d;
    private final boolean e;
    private final boolean f;
    private final EventBus g;
    private final class_667 h;
    private final class_139 i;
    private final List<a> j = new CopyOnWriteArrayList();
    private final List<a> k = new CopyOnWriteArrayList();
    boolean a;
    static final /* synthetic */ boolean b;

    @Inject
    @com.google.a.a.d
    public g(@Named("developerMode") boolean z, @Named("safeMode") boolean z2, EventBus eventBus, class_667 class_667Var, class_139 class_139Var) {
        this.e = z;
        this.f = z2;
        this.g = eventBus;
        this.h = class_667Var;
        this.i = class_139Var;
    }

    private void d() {
        b((Collection<a>) null);
        SwingUtilities.invokeLater(() -> {
            for (a aVar : c()) {
                try {
                    if (d(aVar) != this.k.contains(aVar)) {
                        if (this.k.contains(aVar)) {
                            c(aVar);
                        } else {
                            b(aVar);
                        }
                    }
                } catch (f e) {
                    c.warn("Error during starting/stopping plugin {}", aVar.getClass().getSimpleName(), e);
                }
            }
        });
    }

    public class_132 a(a aVar) {
        try {
            Injector injectorD = aVar.d();
            for (Key<?> key : injectorD.getBindings().keySet()) {
                if (class_132.class.isAssignableFrom(key.getTypeLiteral().getRawType())) {
                    return (class_132) injectorD.getInstance(key);
                }
            }
            return null;
        } catch (Throwable th) {
            c.warn("Unable to get plugin config", th);
            return null;
        }
    }

    public List<class_132> a(Collection<a> collection) {
        ArrayList<Injector> arrayList = new ArrayList();
        if (collection == null) {
            arrayList.add(rs.ppkg.a.c());
            collection = c();
        }
        collection.forEach(aVar -> {
            arrayList.add(aVar.d());
        });
        ArrayList arrayList2 = new ArrayList();
        for (Injector injector : arrayList) {
            for (Key<?> key : injector.getBindings().keySet()) {
                if (class_132.class.isAssignableFrom(key.getTypeLiteral().getRawType())) {
                    arrayList2.add((class_132) injector.getInstance(key));
                }
            }
        }
        return arrayList2;
    }

    public void b(Collection<a> collection) {
        try {
            Iterator<class_132> it = a(collection).iterator();
            while (it.hasNext()) {
                this.i.a(it.next(), false);
            }
        } catch (Throwable th) {
            c.warn("Unable to reset plugin configuration", th);
        }
    }

    public void a() {
        int i = 0;
        for (a aVar : new ArrayList(this.j)) {
            try {
                SwingUtilities.invokeAndWait(() -> {
                    try {
                        b(aVar);
                    } catch (f e) {
                        c.warn("Unable to start plugin {}", aVar.getClass().getSimpleName(), e);
                        this.j.remove(aVar);
                    }
                });
                i++;
            } catch (InterruptedException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        Iterator<a> it = this.j.iterator();
        while (it.hasNext()) {
            class_19.a(it.next().a);
        }
    }

    public void b() {
        a((List<Class<?>>) com.google.a.n.b.a(getClass().getClassLoader()).b(d).stream().map((v0) -> {
            return v0.d();
        }).collect(Collectors.toList()), (BiConsumer<Integer, Integer>) null);
    }

    public List<a> a(List<Class<?>> list, BiConsumer<Integer, Integer> biConsumer) throws f {
        ag<N1> agVarC = P.a().c();
        for (Class<?> cls : list) {
            e eVar = (e) cls.getAnnotation(e.class);
            if (eVar == null) {
                if (cls.getSuperclass() == a.class) {
                    c.warn("Class {} is a plugin, but has no plugin descriptor", cls);
                }
            } else if (cls.getSuperclass() != a.class) {
                c.warn("Class {} has plugin descriptor, but is not a plugin", cls);
            } else if (eVar.i() || !this.a) {
                if (!eVar.h() || this.e) {
                    if (!this.f || eVar.j()) {
                        agVarC.i(cls);
                    } else {
                        c.debug("Disabling {} due to safe mode", cls);
                        this.i.b(Configuration.A, (as.c(eVar.b()) ? cls.getSimpleName() : eVar.b()).toLowerCase());
                    }
                }
            }
        }
        for (Class cls2 : agVarC.c()) {
            for (d dVar : (d[]) cls2.getAnnotationsByType(d.class)) {
                if (agVarC.c().contains(dVar.a())) {
                    agVarC.b(dVar.a(), cls2);
                }
            }
        }
        if (S.a(agVarC)) {
            throw new f("Plugin dependency graph contains a cycle!");
        }
        List listA = a(agVarC);
        int i = 0;
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            try {
                a aVarA = a(this.j, (Class<a>) it.next());
                arrayList.add(aVarA);
                this.j.add(aVarA);
            } catch (f e) {
                c.warn("Error instantiating plugin!", (Throwable) e);
            }
            i++;
            if (biConsumer != null) {
                biConsumer.accept(Integer.valueOf(i), Integer.valueOf(listA.size()));
            }
        }
        return arrayList;
    }

    public boolean b(a aVar) throws f {
        if (!b && !SwingUtilities.isEventDispatchThread()) {
            throw new AssertionError();
        }
        if (this.k.contains(aVar) || !d(aVar)) {
            return false;
        }
        for (a aVar2 : g(aVar)) {
            if (d(aVar2)) {
                a(aVar2, false);
            }
            if (this.k.contains(aVar2)) {
                c(aVar2);
            }
        }
        this.k.add(aVar);
        try {
            aVar.a();
            c.debug("Plugin {} is now running", aVar.getClass().getSimpleName());
            this.g.register(aVar);
            h(aVar);
            this.g.post(new PluginChanged(aVar, true));
            return true;
        } catch (Throwable th) {
            throw new f(th);
        }
    }

    public boolean c(a aVar) throws f {
        if (!b && !SwingUtilities.isEventDispatchThread()) {
            throw new AssertionError();
        }
        if (!this.k.remove(aVar)) {
            return false;
        }
        i(aVar);
        this.g.unregister(aVar);
        try {
            aVar.b();
            c.debug("Plugin {} is now stopped", aVar.getClass().getSimpleName());
            this.g.post(new PluginChanged(aVar, false));
            return true;
        } catch (Exception e) {
            throw new f(e);
        }
    }

    public void a(a aVar, boolean z) {
        e eVar = (e) aVar.getClass().getAnnotation(e.class);
        this.i.b(Configuration.A, (as.c(eVar.b()) ? aVar.getClass().getSimpleName() : eVar.b()).toLowerCase(), String.valueOf(z));
        if (z) {
            for (a aVar2 : g(aVar)) {
                if (d(aVar2)) {
                    a(aVar2, false);
                }
            }
        }
    }

    public boolean d(a aVar) {
        e eVar = (e) aVar.getClass().getAnnotation(e.class);
        String strA = this.i.a(Configuration.A, (as.c(eVar.b()) ? aVar.getClass().getSimpleName() : eVar.b()).toLowerCase());
        return strA != null ? Boolean.parseBoolean(strA) : eVar.f();
    }

    private a a(List<a> list, Class<a> cls) throws f {
        d[] dVarArr = (d[]) cls.getAnnotationsByType(d.class);
        ArrayList<a> arrayList = new ArrayList();
        for (d dVar : dVarArr) {
            Optional<a> optionalFindFirst = list.stream().filter(aVar -> {
                return aVar.getClass() == dVar.a();
            }).findFirst();
            if (!optionalFindFirst.isPresent()) {
                throw new f("Unmet dependency for " + cls.getSimpleName() + ": " + dVar.a().getSimpleName());
            }
            arrayList.add(optionalFindFirst.get());
        }
        try {
            a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            try {
                Injector injectorC = rs.ppkg.a.c();
                if (arrayList.size() > 1) {
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    for (a aVar2 : arrayList) {
                        arrayList2.add(binder -> {
                            binder.bind(aVar2.getClass()).toInstance(aVar2);
                            binder.install(aVar2);
                        });
                    }
                    injectorC = injectorC.createChildInjector(arrayList2);
                } else if (!arrayList.isEmpty()) {
                    injectorC = ((a) arrayList.get(0)).a;
                }
                aVarNewInstance.a = injectorC.createChildInjector(binder2 -> {
                    binder2.bind(cls).toInstance(aVarNewInstance);
                    binder2.install(aVarNewInstance);
                });
                c.debug("Loaded plugin {}", cls.getSimpleName());
                return aVarNewInstance;
            } catch (CreationException e) {
                throw new f(e);
            }
        } catch (Throwable th) {
            throw new f(th);
        }
    }

    public void e(a aVar) {
        this.j.add(aVar);
    }

    public void f(a aVar) {
        this.j.remove(aVar);
    }

    public Collection<a> c() {
        return this.j;
    }

    private void h(a aVar) {
        for (Method method : aVar.getClass().getMethods()) {
            class_665 class_665Var = (class_665) method.getAnnotation(class_665.class);
            if (class_665Var != null) {
                Runnable runnableInvokeExact = null;
                try {
                    Class<?> declaringClass = method.getDeclaringClass();
                    MethodHandles.Lookup lookupA = class_19.a(declaringClass);
                    MethodType methodType = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                    runnableInvokeExact = (Runnable) LambdaMetafactory.metafactory(lookupA, "run", MethodType.methodType((Class<?>) Runnable.class, declaringClass), methodType, lookupA.findVirtual(declaringClass, method.getName(), methodType), methodType).getTarget().bindTo(aVar).invokeExact();
                } catch (Throwable th) {
                    c.warn("Unable to create lambda for method {}", method, th);
                }
                class_666 class_666Var = new class_666(class_665Var, method, aVar, runnableInvokeExact);
                c.debug("Scheduled task {}", class_666Var);
                this.h.a(class_666Var);
            }
        }
    }

    private void i(a aVar) {
        for (class_666 class_666Var : new ArrayList(this.h.a())) {
            if (class_666Var.c() == aVar) {
                c.debug("Removing scheduled task {}", class_666Var);
                this.h.b(class_666Var);
            }
        }
    }

    @com.google.a.a.d
    static <T> List<T> a(O<T> o) {
        ag agVarD = S.d(o);
        ArrayList arrayList = new ArrayList();
        Set set = (Set) agVarD.c().stream().filter(obj -> {
            return agVarD.b(obj) == 0;
        }).collect(Collectors.toSet());
        while (!set.isEmpty()) {
            Iterator it = set.iterator();
            Object next = it.next();
            it.remove();
            arrayList.add(next);
            for (Object obj2 : new HashSet(agVarD.g(next))) {
                agVarD.c(next, obj2);
                if (agVarD.b(obj2) == 0) {
                    set.add(obj2);
                }
            }
        }
        if (agVarD.b().isEmpty()) {
            return arrayList;
        }
        throw new RuntimeException("Graph has at least one cycle");
    }

    public List<a> g(a aVar) {
        e eVar = (e) aVar.getClass().getAnnotation(e.class);
        HashSet hashSet = new HashSet(Arrays.asList(eVar.e()));
        hashSet.add(eVar.a());
        return (List) this.j.stream().filter(aVar2 -> {
            if (aVar2 == aVar) {
                return false;
            }
            e eVar2 = (e) aVar2.getClass().getAnnotation(e.class);
            if (hashSet.contains(eVar2.a())) {
                return true;
            }
            for (String str : eVar2.e()) {
                if (hashSet.contains(str)) {
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toList());
    }

    public void a(boolean z) {
        this.a = z;
    }

    static {
        b = !g.class.desiredAssertionStatus();
        c = LoggerFactory.getLogger((Class<?>) g.class);
        d = g.class.getPackageName();
    }
}
