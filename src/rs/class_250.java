package rs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.a.F;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_250.class */
public class class_250 {
    public Client a;
    public int e;
    public boolean b = false;
    public List<class_249> c = new ArrayList();
    public List<class_249> d = new ArrayList();
    public String g = "";
    public int f = 0;

    public class_250(Client client) {
        this.a = client;
    }

    public void a(int i) {
        if (i >= 32 && i <= 122 && this.g.length() < 80 && i != 96) {
            StringBuilder sb = new StringBuilder(this.g);
            sb.insert(this.f, (char) i);
            this.g = sb.toString();
            this.f++;
        }
        if (i == 8 && this.g.length() > 0 && this.f > 0) {
            StringBuilder sb2 = new StringBuilder(this.g);
            sb2.deleteCharAt(this.f - 1);
            this.g = sb2.toString();
            this.f--;
        }
        if (this.f <= 0) {
            this.f = 0;
        }
        String str = (this.g.startsWith("::") ? "" : "::") + this.g;
        if ((i == 13 || i == 10) && str.length() > 0) {
            if (!class_205.g()) {
                this.a.b(str);
                Client client = this.a;
                Client.fv.a(103);
                Client client2 = this.a;
                Client.fv.b(str.length() - 1);
                Client client3 = this.a;
                Client.fv.a(str.substring(2));
            }
            if (this.c.size() >= 14) {
                this.c.remove(0);
            }
            if (this.d.size() >= 25) {
                this.d.remove(0);
            }
            if (this.g.equalsIgnoreCase("clear")) {
                this.c.clear();
            } else {
                a(this.g);
            }
            if (class_205.g()) {
                try {
                    class_205.b.a(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                while (this.c.size() > 14) {
                    this.c.remove(0);
                }
            }
            this.g = "";
            this.f = 0;
        }
    }

    public void b(int i) {
        if (i <= 0) {
            i = 0;
        }
        if (i >= this.d.size()) {
            this.e = this.d.size();
            this.g = "";
            this.f = 0;
            return;
        }
        if (this.d.get(i).a.equals(this.g)) {
            if (this.e > i && i > 0) {
                b(i - 1);
                return;
            } else if (this.e > i && i < this.d.size() - 1) {
                b(i + 1);
                return;
            }
        }
        this.g = this.d.get(i).a;
        this.e = i;
        this.f = this.g.length();
    }

    public void a() {
        if (!this.b) {
            this.b = true;
        } else {
            this.b = false;
            this.e = this.d.size();
        }
    }

    public void a(String str) {
        class_249 class_249Var = new class_249(str, System.currentTimeMillis());
        class_249Var.c = "@yel@[" + new SimpleDateFormat("hh:mm a").format(new Date()) + "]:@whi@ " + str;
        this.c.add(class_249Var);
        this.d.add(class_249Var);
        this.e = this.d.size();
    }

    public void b(String str) {
        class_249 class_249Var = new class_249("~", System.currentTimeMillis());
        class_249Var.c = str;
        this.c.add(class_249Var);
    }

    public String c(String str) {
        if (!str.contains(F.a)) {
            return str;
        }
        if (str.toLowerCase().startsWith("yell ") || str.toLowerCase().startsWith("news ")) {
            return str;
        }
        String[] strArr = {"@whi@", "@gre@", "@cya@", class_220.f, "@mag@", "@red@", class_220.g};
        int i = 0;
        String str2 = "";
        for (String str3 : str.split(F.a)) {
            str2 = str2 + strArr[i] + str3 + " ";
            i++;
            if (i == strArr.length) {
                i = 0;
            }
        }
        return str2;
    }

    public void b() {
        Client client = this.a;
        int i = Client.ag() ? 0 : 4;
        int width = Launcher.n().i().getWidth();
        class_210.b(320, 0, i, 3093151, width, 100);
        Client client2 = this.a;
        int i2 = Client.ag() ? 0 : 4;
        class_210.a(i2, User32.WM_CHANGEUISTATE, width, class_492.c);
        String str = this.g;
        this.a.gm.b("> ", i2 + 5, User32.WM_CHANGEUISTATE + 18 + 1, class_492.c, 0);
        this.a.gm.b(c(str), i2 + 5 + this.a.gm.c("> "), User32.WM_CHANGEUISTATE + 18, class_492.c, 0);
        this.a.gm.b(Client.ff % 20 < 10 ? "|" : "", i2 + 5 + this.a.gm.c(str.substring(0, this.f)) + this.a.gm.c("> "), User32.WM_CHANGEUISTATE + 18 + 1, class_492.c, 0);
        Client client3 = this.a;
        int i3 = 5 + (Client.ag() ? 0 : 4);
        int i4 = 28;
        int i5 = 0;
        for (class_249 class_249Var : this.c) {
            if (!class_249Var.a.equals("~") || class_249Var.c == null) {
                String strA = class_249Var.a();
                String str2 = class_249Var.a;
                String str3 = "";
                try {
                    str3 = strA.split(F.a)[0] + strA.split(F.a)[1] + " ";
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.a.gm.b(str3 + c(str2), i3, i4, class_492.c, 0);
            } else {
                this.a.gm.b(class_249Var.c, i3, i4, class_492.c, 0);
            }
            i5++;
            i4 += 20;
        }
    }
}
