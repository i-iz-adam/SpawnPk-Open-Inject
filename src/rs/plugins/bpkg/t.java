package rs.plugins.bpkg;

import com.google.a.b.af;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.a.F;
import rs.class_23;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/t.class */
public class t {
    private static final af a = af.a(F.a).b().a();

    public static <T extends v> List<T> a(Collection<T> collection, String str) {
        return (List) collection.stream().filter(vVar -> {
            return class_23.a(a.a((CharSequence) str.toLowerCase()), vVar.d());
        }).sorted(a(str)).collect(Collectors.toList());
    }

    private static Comparator<v> a(String str) {
        if (F.c((CharSequence) str)) {
            return Comparator.nullsLast(Comparator.comparing((v0) -> {
                return v0.b();
            }, Comparator.nullsLast(Comparator.reverseOrder()))).thenComparing((v0) -> {
                return v0.a();
            }, Comparator.nullsLast(Comparator.naturalOrder()));
        }
        Iterable<String> iterableA = a.a((CharSequence) str.toLowerCase());
        return Comparator.nullsLast(Comparator.comparing(vVar -> {
            return Boolean.valueOf(str.equalsIgnoreCase(vVar.a()));
        }, Comparator.reverseOrder())).thenComparing(vVar2 -> {
            if (vVar2.a() == null) {
                return 0L;
            }
            return Long.valueOf(a(a.a((CharSequence) vVar2.a())).filter(str2 -> {
                return a((Iterable<String>) iterableA).anyMatch(str2 -> {
                    return a(str2.toLowerCase(), str2);
                });
            }).count());
        }, Comparator.reverseOrder()).thenComparing(vVar3 -> {
            if (vVar3.d() == null) {
                return 0L;
            }
            return Long.valueOf(a(vVar3.d()).filter(str2 -> {
                return a((Iterable<String>) iterableA).anyMatch(str2 -> {
                    return a(str2.toLowerCase(), str2);
                });
            }).count());
        }, Comparator.reverseOrder()).thenComparing((v0) -> {
            return v0.b();
        }, Comparator.nullsLast(Comparator.reverseOrder())).thenComparing((v0) -> {
            return v0.a();
        }, Comparator.nullsLast(Comparator.naturalOrder()));
    }

    private static Stream<String> a(Iterable<String> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(String str, String str2) {
        return str.contains(str2) || str2.contains(str);
    }
}
