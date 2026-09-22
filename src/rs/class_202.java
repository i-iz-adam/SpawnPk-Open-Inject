package rs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.a.F;

/* JADX INFO: loaded from: client-final.jar:rs/class_202.class */
public class class_202 {
    public static List<Integer> a = new ArrayList();
    public static List<Integer> b = new ArrayList();
    public static List<Integer> c = new ArrayList();
    public static List<Integer> d = new ArrayList();
    public static List<Integer> e = new ArrayList();
    public static List<Integer> f = new ArrayList();

    public static void a() {
        a.clear();
        b.clear();
        c.clear();
        d.clear();
        e.clear();
        f.clear();
        File file = new File("./debug");
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("./debug/textures.txt")));
            class_203 class_203Var = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                if (!line.contains("#")) {
                    if (line.toLowerCase().contains("[textur")) {
                        class_203Var = class_203.a;
                    } else if (line.toLowerCase().contains("[random")) {
                        class_203Var = class_203.b;
                    } else if (line.toLowerCase().contains("[recolor")) {
                        class_203Var = class_203.c;
                    } else if (class_203Var != null && !line.isEmpty() && class_203Var == class_203.a) {
                        String str = line.split(F.a)[0];
                        String str2 = line.split(F.a)[1];
                        int i = 1;
                        if (str.contains(",")) {
                            i = 0;
                            for (String str3 : str.split(",")) {
                                i++;
                                a.add(Integer.valueOf(Integer.parseInt(str3)));
                            }
                        } else {
                            a.add(Integer.valueOf(Integer.parseInt(str)));
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            b.add(Integer.valueOf(Integer.parseInt(str2)));
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void a(ColorUtility colorUtility) {
    }
}
