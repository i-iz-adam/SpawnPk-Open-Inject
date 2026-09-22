package rs.secure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import rs.Configuration;
import rs.class_39;
import rs.class_650;

/* JADX INFO: loaded from: client-final.jar:rs/secure/c.class */
public class c {
    private static final int c = 7;
    private static final int d = 10;
    public static String a = null;
    public static boolean b = false;

    public static String a() {
        if (b) {
            return a;
        }
        String strB = null;
        Process processA = null;
        try {
            try {
                processA = a("cmd /c systeminfo", 7);
                strB = a(processA);
                if (processA != null) {
                    processA.destroy();
                }
            } catch (Exception e) {
                if (Configuration.d.booleanValue()) {
                    e.printStackTrace();
                }
                if (processA != null) {
                    processA.destroy();
                }
            }
            try {
                if (class_650.a(strB)) {
                    try {
                        processA = a("powershell.exe -Command \"(Get-CimInstance Win32_OperatingSystem).InstallDate.ToString('yyyyMMddHHmmss.ffffff')\"", 10);
                        strB = b(processA);
                        if (processA != null) {
                            processA.destroy();
                        }
                    } catch (Exception e2) {
                        if (Configuration.d.booleanValue()) {
                            e2.printStackTrace();
                        }
                        if (processA != null) {
                            processA.destroy();
                        }
                    }
                }
                a = strB;
                b = true;
                return null;
            } catch (Throwable th) {
                if (processA != null) {
                    processA.destroy();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (processA != null) {
                processA.destroy();
            }
            throw th2;
        }
    }

    private static Process a(String str, int i) throws IOException {
        Process processExec = Runtime.getRuntime().exec(str);
        if (i <= 0 || processExec.waitFor(i, TimeUnit.SECONDS)) {
            return processExec;
        }
        processExec.destroy();
        System.out.println("System Info command timed out.");
        return null;
    }

    private static String a(Process process) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String strTrim = null;
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.contains("Original Install Date")) {
                        strTrim = line.substring(line.indexOf(class_39.a) + 1).trim();
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (strTrim == null) {
                System.out.println("Install date not found.");
                bufferedReader.close();
                process.destroy();
                return null;
            }
            Date dateA = a(strTrim);
            String str = "WINDOWS " + new SimpleDateFormat("yyyyMMddHHmmss.SSSSSS", Locale.ENGLISH).format(dateA) + String.format("%+04d", Integer.valueOf(TimeZone.getDefault().getOffset(dateA.getTime()) / 60000));
            bufferedReader.close();
            process.destroy();
            return str;
        } catch (Throwable th3) {
            process.destroy();
            throw th3;
        }
    }

    private static String b(Process process) throws IOException {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        do {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return null;
                }
                strTrim = line.trim();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (strTrim.isEmpty());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSSSS", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = "WINDOWS " + strTrim + String.format("%+d", Integer.valueOf(TimeZone.getDefault().getOffset(simpleDateFormat.parse(strTrim).getTime()) / 60000));
        bufferedReader.close();
        return str;
    }

    public static Date a(String str) throws ParseException {
        try {
            return DateFormat.getDateTimeInstance(3, 2, Locale.getDefault()).parse(str);
        } catch (ParseException e) {
            for (DateFormat dateFormat : new DateFormat[]{new SimpleDateFormat("MM/dd/yyyy, hh:mm:ss a", Locale.US), new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss", Locale.UK), new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss", Locale.CHINA)}) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException e2) {
                }
            }
            throw e;
        }
    }
}
