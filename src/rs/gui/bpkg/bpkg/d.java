package rs.gui.bpkg.bpkg;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rs.class_650;
import rs.gui.bpkg.f;
import rs.gui.bpkg.h;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/b/d.class */
public class d {
    private h h;
    public static final String f = "order.settings";
    public static final String a = class_650.b() + "loadouts";
    public static final String b = class_650.b() + "loadout_temp";
    public static final String c = class_650.b() + "loadout_temp_2";
    public static final String d = class_650.b() + "loadout_temp_3";
    public static final String e = class_650.b() + "loadout.conf";
    public static final String g = a + File.separator + "order.settings";

    public d(h hVar) {
        this.h = hVar;
    }

    private String b(String str, boolean z) {
        return z ? e : a + File.separator + str;
    }

    private String a(String str, int i, boolean z) {
        if (!z) {
            return a + File.separator + str + "_temp_2";
        }
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        return i == 3 ? d : b;
    }

    public void a(String str) {
        File file = new File(b(str, false));
        if (file.exists()) {
            file.delete();
        }
        for (int i = 1; i <= 3; i++) {
            File file2 = new File(a(str, i, false));
            if (file2.exists()) {
                file2.delete();
            }
        }
    }

    public List<String> a() {
        ArrayList arrayList = new ArrayList();
        File file = new File(a);
        if (!file.exists()) {
            file.mkdir();
        }
        if (new File(g).exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(g));
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        if (new File(b(line, false)).exists()) {
                            arrayList.add(line);
                        } else {
                            System.out.println("[WARNING!] [Loadouts] Attempted to load an invalid folder \"" + line + "\" from order.settings!");
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            new ArrayList();
            for (File file2 : new File(a).listFiles()) {
                if (!file2.getName().contains("_") && !file2.getName().contains(".") && !file2.getName().equalsIgnoreCase(f) && !arrayList.contains(file2.getName())) {
                    System.out.println("[WARNING!] [Loadouts] Folder \"" + file2.getName() + "\" missing from the order config! Adding to list..");
                    arrayList.add(file2.getName());
                }
            }
        } else {
            for (File file3 : file.listFiles()) {
                if (!file3.getName().contains("_") && !file3.getName().contains(".settings")) {
                    arrayList.add(file3.getName());
                }
            }
        }
        return arrayList;
    }

    public void b() {
        File file = new File(g);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            Iterator<String> it = this.h.f().keySet().iterator();
            while (it.hasNext()) {
                bufferedWriter.write(it.next());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public void a(String str, List<rs.gui.bpkg.a> list) {
        File file = new File(class_650.b());
        File file2 = new File(b(str, false));
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
            Iterator<rs.gui.bpkg.a> it = list.iterator();
            while (it.hasNext()) {
                c.a(dataOutputStream, it.next());
            }
            dataOutputStream.close();
            String str2 = str + "_ver_5";
            File file3 = new File(a + File.separator + str2);
            if (!file3.exists()) {
                file3.createNewFile();
            }
            for (File file4 : new File(a).listFiles()) {
                if ((file4.getName().startsWith(str + "_temp") || file4.getName().startsWith(str + "_ver_")) && !file4.getName().equalsIgnoreCase(str2)) {
                    file4.delete();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public rs.gui.bpkg.c a(String str, boolean z) {
        String str2;
        rs.gui.bpkg.c cVar = new rs.gui.bpkg.c(str);
        File file = new File(b(str, z));
        File file2 = new File(a(str, 1, z));
        File file3 = new File(a(str, 2, z));
        File file4 = new File(a(str, 3, z));
        if (!file2.exists() && z) {
            file.delete();
        }
        try {
            if (file.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                if (z) {
                    do {
                        byte[] bArr = new byte[dataInputStream.readInt()];
                        dataInputStream.read(bArr);
                        str2 = new String(bArr);
                        rs.gui.bpkg.a aVar = new rs.gui.bpkg.a(str2);
                        if (file3.exists()) {
                            aVar.a(rs.gui.bpkg.a.Spellbook.a(dataInputStream.readInt()));
                            aVar.b(dataInputStream.readInt());
                            for (int i = 0; i < aVar.c().length; i++) {
                                aVar.c()[i] = dataInputStream.readInt();
                            }
                        }
                        for (rs.gui.bpkg.c.c cVar2 : rs.gui.bpkg.c.c.values()) {
                            if (file2.exists()) {
                                aVar.a(cVar2, new f(dataInputStream.readInt(), dataInputStream.readInt()));
                            } else {
                                aVar.a(cVar2, dataInputStream.readInt());
                            }
                        }
                        for (int i2 = 0; i2 < aVar.d().length; i2++) {
                            if (file2.exists()) {
                                aVar.a(i2, new f(dataInputStream.readInt(), dataInputStream.readInt()));
                            } else {
                                aVar.a(i2, new f(dataInputStream.readInt(), 1));
                            }
                        }
                        if (file4.exists()) {
                            aVar.a(dataInputStream.readInt());
                        }
                        cVar.add(aVar);
                    } while (str2 != null);
                } else {
                    c.a(dataInputStream, cVar);
                }
                dataInputStream.close();
            }
        } catch (EOFException e2) {
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return cVar;
    }
}
