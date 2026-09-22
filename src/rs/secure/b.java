package rs.secure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import rs.class_39;

/* JADX INFO: loaded from: client-final.jar:rs/secure/b.class */
public class b {
    private static String a = null;

    public static final String a() {
        if (a != null) {
            return a;
        }
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"/usr/sbin/system_profiler", "SPHardwareDataType"});
            OutputStream outputStream = processExec.getOutputStream();
            InputStream inputStream = processExec.getInputStream();
            try {
                outputStream.close();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.contains("Serial Number")) {
                            a = line.split(class_39.a)[1].trim();
                            break;
                        }
                    } catch (IOException e) {
                        try {
                            inputStream.close();
                            return null;
                        } catch (IOException e2) {
                            return null;
                        }
                    } catch (Throwable th) {
                        try {
                            inputStream.close();
                            throw th;
                        } catch (IOException e3) {
                            return null;
                        }
                    }
                }
                try {
                    inputStream.close();
                    if (a != null) {
                        a = "MACOSX " + a;
                    }
                    return a;
                } catch (IOException e4) {
                    return null;
                }
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        } catch (IOException e6) {
            return null;
        }
    }
}
