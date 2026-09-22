package rs.lpkg.dpkg;

import com.google.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: loaded from: client-final.jar:rs/l/d/a.class */
public class a {
    private final List<Function<String, String>> a = new ArrayList();

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("\r?\n")) {
            if (str2.startsWith("#include ")) {
                sb.append(b(str2.substring(9)));
            } else {
                sb.append(str2).append('\n');
            }
        }
        return sb.toString();
    }

    public String b(String str) {
        Iterator<Function<String, String>> it = this.a.iterator();
        while (it.hasNext()) {
            String strApply = it.next().apply(str);
            if (strApply != null) {
                return a(strApply);
            }
        }
        return "";
    }

    public a a(Function<String, String> function) {
        this.a.add(function);
        return this;
    }

    public a a(Class<?> cls) {
        return a(str -> {
            try {
                InputStream resourceAsStream = cls.getResourceAsStream(str);
                if (resourceAsStream == null) {
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    return null;
                }
                try {
                    String strA = a(resourceAsStream);
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    return strA;
                } catch (Throwable th) {
                    if (resourceAsStream != null) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                return null;
            }
        });
    }

    private static String a(InputStream inputStream) {
        try {
            return v.a(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
