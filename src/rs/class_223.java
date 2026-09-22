package rs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.apache.commons.a.F;

/* JADX INFO: loaded from: client-final.jar:rs/class_223.class */
class class_223 extends Thread {
    final /* synthetic */ class_220 a;

    class_223(class_220 class_220Var) {
        this.a = class_220Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            System.setProperty("jsse.enableSNIExtension", "false");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://spawnpk.net/forums/index.php?/forum/10-updates/").openStream()));
            boolean z = false;
            int i = 0;
            String str = "";
            String str2 = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (z) {
                    if (line.contains("Runex: Economy Server")) {
                        z = false;
                        i--;
                    } else {
                        String strTrim = line.trim();
                        if (this.a.X == null) {
                            this.a.X = strTrim;
                            this.a.X = this.a.X.replace("&quot;", "\"");
                            this.a.X = this.a.X.replace("&amp;", "&");
                            this.a.X = this.a.X.replace("&rsquo;", "�");
                            this.a.X = this.a.X.replace("&#039;", "'");
                            if (this.a.X.length() > 45) {
                                this.a.X = this.a.X.substring(0, 45 - 1) + "...";
                            }
                            this.a.X = this.a.X.replace("[", "@yel@[");
                            this.a.X = this.a.X.replace("]", "] @whi@");
                            if (str2 != null) {
                                for (String str3 : str2.split(F.a)) {
                                    if (str3 != null && str3.contains("href")) {
                                        this.a.Y = str3.replace("href='", "");
                                        this.a.Y = this.a.Y.substring(0, this.a.Y.length() - 1);
                                        break;
                                    }
                                }
                            }
                            String[] strArrSplit = this.a.X.split("]");
                            if (strArrSplit != null && strArrSplit.length > 0) {
                                this.a.Z = strArrSplit[0];
                                this.a.Z = this.a.Z.replace("[", "");
                                this.a.Z = this.a.Z.replace(class_220.g, "");
                            }
                        }
                        str = (i == 1 ? "" : str) + strTrim.replace("[", "@or1@[").replace("]", "] <col=FFFFFF>").replace("&quot;", "\"").replace("&amp;", "&").replace("&rsquo;", "�").replace("&#039;", "'") + (i < 6 ? "       " : "");
                        z = false;
                    }
                }
                if (line.contains("<a href=")) {
                    str2 = line;
                }
                if (!line.contains("<span itemprop=\"name headline\">")) {
                    continue;
                } else {
                    if (i >= 6) {
                        break;
                    }
                    z = true;
                    i++;
                }
            }
            this.a.w = str;
            this.a.u = (int) (((double) this.a.w.length()) * 3.75d);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            this.a.w = "";
        }
    }
}
