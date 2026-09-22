package rs.eventbus;

import com.google.a.b.V;
import com.google.a.d.cv;
import com.google.a.d.db;
import com.google.a.d.hW;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.function.Consumer;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.ThreadSafe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import rs.class_19;

/* JADX INFO: loaded from: client-final.jar:rs/eventbus/EventBus.class */
@ThreadSafe
public class EventBus {
    private static final Logger log = LoggerFactory.getLogger((Class<?>) EventBus.class);
    private static final Marker DEDUPLICATE = MarkerFactory.getMarker("DEDUPLICATE");
    private final Consumer<Throwable> exceptionHandler;

    @Nonnull
    private cv<Class<?>, Subscriber> subscribers;

    /* JADX INFO: loaded from: client-final.jar:rs/eventbus/EventBus$Subscriber.class */
    public static final class Subscriber {
        private final Object object;
        private final Method method;
        private final float priority;
        private final Consumer<Object> lambda;

        void invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
            if (this.lambda != null) {
                this.lambda.accept(obj);
            } else {
                this.method.invoke(this.object, obj);
            }
        }

        public Subscriber(Object obj, Method method, float f, Consumer<Object> consumer) {
            this.object = obj;
            this.method = method;
            this.priority = f;
            this.lambda = consumer;
        }

        public Object getObject() {
            return this.object;
        }

        public Method getMethod() {
            return this.method;
        }

        public float getPriority() {
            return this.priority;
        }

        public Consumer<Object> getLambda() {
            return this.lambda;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Subscriber)) {
                return false;
            }
            Subscriber subscriber = (Subscriber) obj;
            if (Float.compare(getPriority(), subscriber.getPriority()) != 0) {
                return false;
            }
            Object object = getObject();
            Object object2 = subscriber.getObject();
            if (object == null) {
                if (object2 != null) {
                    return false;
                }
            } else if (!object.equals(object2)) {
                return false;
            }
            Method method = getMethod();
            Method method2 = subscriber.getMethod();
            if (method == null) {
                return method2 == null;
            }
            return method.equals(method2);
        }

        public int hashCode() {
            int iFloatToIntBits = (1 * 59) + Float.floatToIntBits(getPriority());
            Object object = getObject();
            int iHashCode = (iFloatToIntBits * 59) + (object == null ? 43 : object.hashCode());
            Method method = getMethod();
            return (iHashCode * 59) + (method == null ? 43 : method.hashCode());
        }

        public String toString() {
            return "EventBus.Subscriber(object=" + String.valueOf(getObject()) + ", method=" + String.valueOf(getMethod()) + ", priority=" + getPriority() + ", lambda=" + String.valueOf(getLambda()) + ")";
        }
    }

    public EventBus() {
        this(th -> {
            log.warn(DEDUPLICATE, "Uncaught exception in event subscriber", th);
        });
    }

    public synchronized void register(@Nonnull Object obj) {
        cv.a aVarX = cv.x();
        aVarX.b(this.subscribers);
        aVarX.c(Comparator.comparingDouble((v0) -> {
            return v0.getPriority();
        }).reversed().thenComparing(subscriber -> {
            return subscriber.object.getClass().getName();
        }));
        Class<?> superclass = obj.getClass();
        while (true) {
            Class<?> cls = superclass;
            if (cls == null) {
                this.subscribers = aVarX.b();
                return;
            }
            for (Method method : cls.getDeclaredMethods()) {
                Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                if (subscribe != null) {
                    V.a(method.getReturnType() == Void.TYPE, "@Subscribed method \"" + String.valueOf(method) + "\" cannot return a value");
                    V.a(method.getParameterCount() == 1, "@Subscribed method \"" + String.valueOf(method) + "\" must take exactly 1 argument");
                    V.a(!Modifier.isStatic(method.getModifiers()), "@Subscribed method \"" + String.valueOf(method) + "\" cannot be static");
                    Class<?> cls2 = method.getParameterTypes()[0];
                    V.a(!cls2.isPrimitive(), "@Subscribed method \"" + String.valueOf(method) + "\" cannot subscribe to primitives");
                    V.a((cls2.getModifiers() & 1536) == 0, "@Subscribed method \"" + String.valueOf(method) + "\" cannot subscribe to polymorphic classes");
                    Class<? super Object> superclass2 = cls2.getSuperclass();
                    while (true) {
                        Class<? super Object> cls3 = superclass2;
                        if (cls3 == null) {
                            String str = "on" + cls2.getSimpleName();
                            V.a(method.getName().equals(str), "Subscribed method " + String.valueOf(method) + " should be named " + str);
                            method.setAccessible(true);
                            Consumer consumerInvokeExact = null;
                            try {
                                MethodHandles.Lookup lookupA = class_19.a(cls);
                                MethodType methodType = MethodType.methodType((Class<?>) Void.TYPE, cls2);
                                consumerInvokeExact = (Consumer) LambdaMetafactory.metafactory(lookupA, "accept", MethodType.methodType((Class<?>) Consumer.class, cls), methodType.changeParameterType(0, Object.class), lookupA.findVirtual(cls, method.getName(), methodType), methodType).getTarget().bindTo(obj).invokeExact();
                            } catch (Throwable th) {
                                log.warn("Unable to create lambda for method {}", method, th);
                            }
                            Subscriber subscriber2 = new Subscriber(obj, method, subscribe.priority(), consumerInvokeExact);
                            aVarX.b(cls2, subscriber2);
                            log.debug("Registering {} - {}", cls2, subscriber2);
                            break;
                        }
                        if (this.subscribers.f(cls3)) {
                            throw new IllegalArgumentException("@Subscribed method \"" + String.valueOf(method) + "\" cannot subscribe to class which inherits from subscribed class \"" + String.valueOf(cls3) + "\"");
                        }
                        superclass2 = cls3.getSuperclass();
                    }
                }
            }
            superclass = cls.getSuperclass();
        }
    }

    public synchronized <T> Subscriber register(Class<T> cls, Consumer<T> consumer, float f) {
        cv.a aVarX = cv.x();
        aVarX.b(this.subscribers);
        aVarX.c(Comparator.comparingDouble((v0) -> {
            return v0.getPriority();
        }).reversed().thenComparing(subscriber -> {
            return subscriber.object.getClass().getName();
        }));
        Subscriber subscriber2 = new Subscriber(consumer, null, f, consumer);
        aVarX.b(cls, subscriber2);
        this.subscribers = aVarX.b();
        return subscriber2;
    }

    public synchronized void unregister(@Nonnull Object obj) {
        this.subscribers = cv.b(db.c((Iterable) this.subscribers.m(), entry -> {
            return ((Subscriber) entry.getValue()).getObject() != obj;
        }));
    }

    public synchronized void unregister(Subscriber subscriber) {
        if (subscriber == null) {
            return;
        }
        this.subscribers = cv.b(db.c((Iterable) this.subscribers.m(), entry -> {
            return subscriber != entry.getValue();
        }));
    }

    public void post(@Nonnull Object obj) {
        hW<Subscriber> it = this.subscribers.c(obj.getClass()).iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(obj);
            } catch (Exception e) {
                this.exceptionHandler.accept(e);
            }
        }
    }

    public EventBus(Consumer<Throwable> consumer) {
        this.subscribers = cv.f();
        this.exceptionHandler = consumer;
    }
}
