/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C_e {
    public static final String a = "./clipdump/";
    public static final Map<Integer, List<a>> b = new HashMap<Integer, List<a>>();
    public static final List<String> c = new ArrayList<String>();

    public static int a(int n, int n2) {
        int n3 = n >> 6;
        int n4 = n2 >> 6;
        return n3 * 256 + n4;
    }

    public static String a(int n, int n2, int n3) {
        return n + "," + n2 + "," + n3;
    }

    public static void a(int n, int n2, int n3, int n4, boolean bl) {
        String string = C_e.a(n, n2, n3);
        if (c.contains(string)) {
            return;
        }
        if (n4 == 0) {
            return;
        }
        int n5 = n >> 6;
        int n6 = n2 >> 6;
        int n7 = n5 * 256 + n6;
        a a2 = new a(n, n2, n3, n4, bl);
        List<a> list = b.get(n7);
        if (list == null) {
            list = new ArrayList<a>();
        }
        list.add(a2);
        c.add(string);
        b.put(n7, list);
    }

    public static void a() {
        b.clear();
        c.clear();
        System.out.println("Cleared saved map and position cache!");
    }

    public static void b() {
        System.out.println("Dumping " + b.size() + " regions..");
        for (int n : b.keySet()) {
            File file = new File(a + n);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                try {
                    for (a a2 : b.get(n)) {
                        dataOutputStream.writeInt(a2.a);
                        dataOutputStream.writeInt(a2.b);
                        dataOutputStream.writeInt(a2.c);
                        dataOutputStream.writeInt(a2.d);
                        dataOutputStream.writeBoolean(a2.d == 0);
                        dataOutputStream.writeBoolean(a2.e);
                    }
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    file.delete();
                }
                dataOutputStream.close();
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        System.out.println("Dump successful!");
    }

    static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public a(int n, int n2, int n3, int n4, boolean bl) {
            this.a = n;
            this.b = n2;
            this.c = n3;
            this.d = n4;
            this.e = bl;
        }
    }
}

