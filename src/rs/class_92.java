package rs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: client-final.jar:rs/class_92.class */
public abstract class class_92 {
    private static final int e = 4098;
    protected static final int a = -1;
    protected final List<String> b = new ArrayList();
    protected Client c;
    protected final String d;

    public class_92(String str) {
        this.d = str;
    }

    public abstract boolean a();

    public abstract class_93 b();

    public List<String> c() {
        return this.b;
    }

    protected void a(String str) {
        this.b.add(str);
    }

    protected void a(class_90 class_90Var) {
        a(class_90Var.a());
    }

    protected int a(File file) {
        try {
            return a(new BufferedReader(new FileReader(file)));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return -1;
        } catch (IOException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    protected int b(String str) {
        try {
            try {
                return a(new BufferedReader(new InputStreamReader(new URL(str).openStream())));
            } catch (IOException e2) {
                e2.printStackTrace();
                return -1;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    protected boolean a(String str, File file) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
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
                    byte[] bArr = new byte[4098];
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
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return false;
        } catch (IOException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public String d() {
        return this.d;
    }

    public void a(Client client) {
        this.c = client;
    }

    public boolean e() {
        return b().c() != b().b();
    }

    public abstract boolean f();

    private int a(BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();
        bufferedReader.close();
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return -1;
        }
    }
}
