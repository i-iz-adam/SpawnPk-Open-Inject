package rs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.lwjgl.opencl.CL10;

/* JADX INFO: loaded from: client-final.jar:rs/class_86.class */
public class class_86 extends class_92 {
    private static final String e = Configuration.m + "cache.zip";
    private static final String f = class_650.f();
    private static final String g = "cache.zip";
    private class_93 h;

    public class_86() {
        super("Cache");
        this.h = new class_93("cache_version");
    }

    @Override // rs.class_92
    public boolean a() {
        try {
            b(new File(f));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < f.length(); i++) {
                if (i != f.length() - 1) {
                    sb.append(f.charAt(i));
                }
            }
            String string = sb.toString();
            URL url = new URL(e);
            File file = new File(string);
            file.mkdirs();
            File fileB = new class_77(this.c, "Downloading main game assets..", url, new File(file.getAbsolutePath() + File.separator + "cache.zip")).b();
            if (fileB == null) {
                a(class_90.b);
                return false;
            }
            if (!b(file.getAbsolutePath(), fileB)) {
                a(class_90.b);
                return false;
            }
            File file2 = new File(class_93.c);
            if (file2.exists()) {
                file2.delete();
            }
            fileB.delete();
            return true;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // rs.class_92
    public class_93 b() {
        return this.h;
    }

    private boolean b(String str, File file) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            String[] strArr = {"sprites", "configs"};
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return true;
                }
                File file2 = new File(str + "/" + nextEntry.getName());
                if (file2.exists()) {
                    file2.delete();
                }
                boolean z = false;
                for (String str2 : strArr) {
                    if (nextEntry.getName().equalsIgnoreCase(str2) || (file2.getParentFile() != null && file2.getName().equalsIgnoreCase(str2))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    if (nextEntry.isDirectory()) {
                        System.out.println("Making directory: " + file2.getName() + " (" + nextEntry.getName() + ")");
                        file2.mkdirs();
                    } else {
                        if (file2.getParentFile() != null) {
                            File parentFile = file2.getParentFile();
                            if (!parentFile.exists()) {
                                System.out.println("Making parent directory: " + parentFile.getAbsolutePath());
                                parentFile.mkdirs();
                            }
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        byte[] bArr = new byte[CL10.CL_DEVICE_MAX_COMPUTE_UNITS];
                        while (true) {
                            int i = zipInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.close();
                    }
                }
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return false;
        } catch (IOException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static boolean b(File file) {
        File[] fileArrListFiles;
        if (file.exists() && null != (fileArrListFiles = file.listFiles())) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    b(fileArrListFiles[i]);
                } else {
                    fileArrListFiles[i].delete();
                }
            }
        }
        return file.delete();
    }

    @Override // rs.class_92
    public boolean f() {
        return true;
    }
}
