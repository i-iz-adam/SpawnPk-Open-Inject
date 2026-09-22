package rs.secure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import org.apache.commons.a.F;

/* JADX INFO: loaded from: client-final.jar:rs/secure/a.class */
public class a {
    private static String a = null;

    public static final String a() {
        if (a == null) {
            b();
        }
        if (a == null) {
            c();
        }
        return a;
    }

    private static BufferedReader a(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(str.split(F.a));
            OutputStream outputStream = processExec.getOutputStream();
            InputStream inputStream = processExec.getInputStream();
            try {
                outputStream.close();
                return new BufferedReader(new InputStreamReader(inputStream));
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e2) {
            return null;
        }
    }

    private static void b() {
        BufferedReader bufferedReaderA = null;
        try {
            bufferedReaderA = a("dmidecode -t system");
            if (bufferedReaderA != null) {
                while (true) {
                    String line = bufferedReaderA.readLine();
                    if (line == null) {
                        break;
                    } else if (line.indexOf("Serial Number:") != -1) {
                        a = line.split("Serial Number:")[1].trim();
                        break;
                    }
                }
            }
            if (bufferedReaderA != null) {
                try {
                    bufferedReaderA.close();
                } catch (IOException e) {
                }
            }
        } catch (IOException e2) {
            if (bufferedReaderA != null) {
                try {
                    bufferedReaderA.close();
                } catch (IOException e3) {
                }
            }
        } catch (Throwable th) {
            if (bufferedReaderA != null) {
                try {
                    bufferedReaderA.close();
                } catch (IOException e4) {
                }
            }
            throw th;
        }
    }

    private static void c() {
        BufferedReader bufferedReaderA = null;
        try {
            bufferedReaderA = a("lshal");
            if (bufferedReaderA != null) {
                while (true) {
                    String line = bufferedReaderA.readLine();
                    if (line == null) {
                        break;
                    } else if (line.indexOf("system.hardware.serial =") != -1) {
                        a = line.split("system.hardware.serial =")[1].replaceAll("\\(string\\)|(\\')", "").trim();
                        break;
                    }
                }
            }
            if (bufferedReaderA != null) {
                try {
                    bufferedReaderA.close();
                } catch (IOException e) {
                }
            }
        } catch (IOException e2) {
            if (bufferedReaderA != null) {
                try {
                    bufferedReaderA.close();
                } catch (IOException e3) {
                }
            }
        } catch (Throwable th) {
            if (bufferedReaderA != null) {
                try {
                    bufferedReaderA.close();
                } catch (IOException e4) {
                }
            }
            throw th;
        }
    }
}
