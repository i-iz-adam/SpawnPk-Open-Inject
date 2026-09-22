package rs;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_97.class */
public class class_97 {
    public static final String a = "./clipdump/";
    public static final Map<Integer, List<class_98>> b = new HashMap();
    public static final List<String> c = new ArrayList();

    public static int a(int i, int i2) {
        return ((i >> 6) * 256) + (i2 >> 6);
    }

    public static String a(int i, int i2, int i3) {
        return i + "," + i2 + "," + i3;
    }

    public static void a(int i, int i2, int i3, int i4, boolean z) {
        String strA = a(i, i2, i3);
        if (c.contains(strA) || i4 == 0) {
            return;
        }
        int i5 = ((i >> 6) * 256) + (i2 >> 6);
        class_98 class_98Var = new class_98(i, i2, i3, i4, z);
        List<class_98> arrayList = b.get(Integer.valueOf(i5));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(class_98Var);
        c.add(strA);
        b.put(Integer.valueOf(i5), arrayList);
    }

    public static void a() {
        b.clear();
        c.clear();
        System.out.println("Cleared saved map and position cache!");
    }

    public static void b() {
        System.out.println("Dumping " + b.size() + " regions..");
        Iterator<Integer> it = b.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            File file = new File("./clipdump/" + iIntValue);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    for (class_98 class_98Var : b.get(Integer.valueOf(iIntValue))) {
                        dataOutputStream.writeInt(class_98Var.a);
                        dataOutputStream.writeInt(class_98Var.b);
                        dataOutputStream.writeInt(class_98Var.c);
                        dataOutputStream.writeInt(class_98Var.d);
                        dataOutputStream.writeBoolean(class_98Var.d == 0);
                        dataOutputStream.writeBoolean(class_98Var.e);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    file.delete();
                }
                dataOutputStream.close();
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        System.out.println("Dump successful!");
    }
}
