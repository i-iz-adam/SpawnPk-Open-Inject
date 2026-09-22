package rs.gui.bpkg;

import java.awt.Component;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.JOptionPane;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/d.class */
public class d extends LinkedHashMap<String, c> {
    private h a;
    private String b;
    private a c;

    public d(h hVar) {
        this.a = hVar;
    }

    public void a(String str, a aVar) {
        this.b = str;
        this.c = aVar;
        b();
    }

    public void a(String str, int i) {
        if (!containsKey(str)) {
            a((String) null, (a) null);
            return;
        }
        if (i < 0 || i >= get(str).size()) {
            i = 0;
        }
        this.b = str;
        this.c = get(str).get(i);
        b();
    }

    public void a(String str) {
        if (c(str)) {
            c cVar = new c(str);
            cVar.add(new a("Default"));
            put(str, cVar);
            this.a.d();
            this.a.b();
            a(str, cVar);
            this.a.e().b();
            a(str, 0);
            this.a.d();
            this.a.b();
        }
    }

    public void a(String str, String str2) {
        if (c(str2)) {
            d dVar = new d(this.a);
            boolean z = false;
            for (String str3 : keySet()) {
                if (str3.equals(str)) {
                    dVar.put(str2, (c) get(str3));
                    z = true;
                } else {
                    dVar.put(str3, (c) get(str3));
                }
            }
            if (z) {
                clear();
                for (Object obj : dVar.keySet()) {
                    put(obj, (c) dVar.get(obj));
                }
                if (this.b.equals(str)) {
                    a(str2, this.c);
                }
                this.a.e().a(str);
                this.a.e().a(str2, (List<a>) get(str2));
            }
            this.a.d();
            this.a.e().b();
        }
    }

    public void b(String str) {
        if (size() <= 1) {
            JOptionPane.showMessageDialog((Component) null, "You can't delete your only folder!", "Oops!", 2);
            return;
        }
        remove(str);
        this.a.e().a(str);
        a((String) keySet().toArray()[0], 0);
        this.a.h().setSelectedIndex(0);
        this.a.d();
        this.a.b();
        this.a.e().b();
    }

    public a b(String str, String str2) {
        c cVar = (c) get(str);
        Iterator<a> it = cVar.iterator();
        while (it.hasNext()) {
            if (it.next().f().equals(str2)) {
                JOptionPane.showMessageDialog((Component) null, "You already have a loadout with this name!", "Oops!", 2);
                return null;
            }
        }
        a aVar = new a(str2);
        cVar.add(aVar);
        put(str, cVar);
        this.a.e().a(str, cVar);
        this.a.h().addItem(str2);
        this.c = aVar;
        this.a.h().setSelectedItem(str2);
        this.a.a();
        return aVar;
    }

    public void a(String str, a aVar, String str2) {
        if (str2 == null || str2.equals("") || str2.isEmpty()) {
            JOptionPane.showMessageDialog((Component) null, "Your loadout name can't be empty!", "Oops!", 2);
            return;
        }
        if (!str2.equalsIgnoreCase(aVar.f())) {
            Iterator<a> it = ((c) get(str)).iterator();
            while (it.hasNext()) {
                if (it.next().f().equalsIgnoreCase(str2)) {
                    JOptionPane.showMessageDialog((Component) null, "You already have that name in this folder!", "Oops!", 2);
                    return;
                }
            }
        }
        String str3 = aVar.f();
        aVar.a(str2);
        c cVar = new c(str2);
        int i = 0;
        int i2 = 0;
        for (a aVar2 : (c) get(str)) {
            if (aVar2.f().equals(str2)) {
                i = i2;
            }
            cVar.add(aVar2);
            i2++;
        }
        put(str, cVar);
        this.a.e().a(str, cVar);
        this.a.a(i);
        Launcher.n().a(500, true);
    }

    public void a(String str, int i, int i2) {
        c cVar = (c) get(str);
        if (i == i2 || i < 0 || i >= cVar.size() || i2 < 0 || i2 >= cVar.size() || cVar.get(i) == null || cVar.get(i2) == null) {
            return;
        }
        a aVar = cVar.get(i);
        cVar.set(i, cVar.get(i2));
        cVar.set(i2, aVar);
        put(str, cVar);
        this.a.e().a(str, cVar);
        this.a.e().b();
        this.a.a(i2);
        this.a.h().showPopup();
    }

    public void c(String str, String str2) {
        d dVar = new d(this.a);
        for (String str3 : keySet()) {
            if (str3.equalsIgnoreCase(str)) {
                dVar.put(str2, (c) get(str2));
            } else if (str3.equalsIgnoreCase(str2)) {
                dVar.put(str, (c) get(str));
            } else {
                dVar.put(str3, (c) get(str3));
            }
        }
        clear();
        for (Object obj : dVar.keySet()) {
            put(obj, (c) dVar.get(obj));
        }
        a(str, 0);
        this.a.h().setSelectedIndex(0);
        this.a.d();
        this.a.b();
        this.a.e().b();
        this.a.j().show(this.a.i(), 1, 1);
    }

    public void d(String str, String str2) {
        c<a> cVar = get(str);
        if (cVar.size() == 1) {
            JOptionPane.showMessageDialog((Component) null, "You can't delete the only loadout on your folder!", "Oops!", 2);
            return;
        }
        a aVar = null;
        for (a aVar2 : cVar) {
            if (aVar2.f().equals(str2)) {
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            cVar.remove(aVar);
            this.a.e().a(str, cVar);
        }
        this.a.h().removeItem(str2);
        a(this.b, 0);
        this.a.h().setSelectedIndex(0);
        this.a.a();
    }

    public void a(String str, c cVar) {
        this.a.e().a(str, cVar);
        this.a.e().b();
    }

    public void a() {
        if (this.b == null) {
            return;
        }
        a(this.b, get(this.b));
    }

    public void b() {
        this.a.g().a(this.c);
    }

    private boolean c(String str) {
        if (str == null || str.equals("") || str.isEmpty()) {
            JOptionPane.showMessageDialog((Component) null, "Your folder name can't be empty!", "Oops!", 2);
            return false;
        }
        Iterator<String> it = keySet().iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                JOptionPane.showMessageDialog((Component) null, "You already have a folder with this name!", "Oops!", 2);
                return false;
            }
        }
        for (char c : str.toLowerCase().toCharArray()) {
            boolean z = false;
            for (char c2 : rs.gui.bpkg.c.a.c) {
                if (c == c2) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                JOptionPane.showMessageDialog((Component) null, "You can only have letters and numbers in your folder name!", "Oops!", 2);
                return false;
            }
        }
        return true;
    }

    public a c() {
        return this.c;
    }

    public c d() {
        return get(this.b);
    }

    public String e() {
        return this.b;
    }
}
