/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_b.p_a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rs.p_cache.p_b.C_b;
import rs.p_cache.p_b.C_d;
import rs.p_cache.p_b.C_e;

public class C_a
extends C_d {
    private static final String e = rs.p_f.C_a.m + "cache.zip";
    private static final String f = rs.p_v.C_a.f();
    private static final String g = "cache.zip";
    private C_e h = new C_e("cache_version");

    public C_a() {
        super("Cache");
    }

    @Override
    public boolean a() {
        try {
            C_a.b(new File(f));
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < f.length(); ++i) {
                if (i == f.length() - 1) continue;
                stringBuilder.append(f.charAt(i));
            }
            String string = stringBuilder.toString();
            URL uRL = new URL(e);
            File file = new File(string);
            file.mkdirs();
            rs.p_cache.p_a.C_a c_a = new rs.p_cache.p_a.C_a(this.c, "Downloading main game assets..", uRL, new File(file.getAbsolutePath() + File.separator + g));
            File file2 = c_a.b();
            if (file2 != null) {
                if (!this.b(file.getAbsolutePath(), file2)) {
                    this.a(C_b.b);
                    return false;
                }
                File file3 = new File(C_e.c);
                if (file3.exists()) {
                    file3.delete();
                }
                file2.delete();
                return true;
            }
            this.a(C_b.b);
            return false;
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return false;
        }
    }

    @Override
    public C_e b() {
        return this.h;
    }

    private boolean b(String string, File file) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            ZipEntry zipEntry = null;
            String[] stringArray = new String[]{"sprites", "configs"};
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                int n;
                File file2 = new File(string + "/" + zipEntry.getName());
                if (file2.exists()) {
                    file2.delete();
                }
                boolean bl = false;
                Object object = stringArray;
                int n2 = ((String[])object).length;
                for (n = 0; n < n2; ++n) {
                    String string2 = object[n];
                    if (!zipEntry.getName().equalsIgnoreCase(string2) && (file2.getParentFile() == null || !file2.getName().equalsIgnoreCase(string2))) continue;
                    bl = true;
                    break;
                }
                if (bl) continue;
                if (zipEntry.isDirectory()) {
                    System.out.println("Making directory: " + file2.getName() + " (" + zipEntry.getName() + ")");
                    file2.mkdirs();
                    continue;
                }
                if (file2.getParentFile() != null && !((File)(object = file2.getParentFile())).exists()) {
                    System.out.println("Making parent directory: " + ((File)object).getAbsolutePath());
                    ((File)object).mkdirs();
                }
                object = new FileOutputStream(file2);
                byte[] byArray = new byte[4098];
                n = 0;
                while ((n = zipInputStream.read(byArray)) > 0) {
                    ((FileOutputStream)object).write(byArray, 0, n);
                }
                ((FileOutputStream)object).close();
            }
            zipInputStream.close();
            return true;
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return false;
    }

    public static boolean b(File file) {
        File[] fileArray;
        if (file.exists() && null != (fileArray = file.listFiles())) {
            for (int i = 0; i < fileArray.length; ++i) {
                if (fileArray[i].isDirectory()) {
                    C_a.b(fileArray[i]);
                    continue;
                }
                fileArray[i].delete();
            }
        }
        return file.delete();
    }

    @Override
    public boolean f() {
        return true;
    }
}

