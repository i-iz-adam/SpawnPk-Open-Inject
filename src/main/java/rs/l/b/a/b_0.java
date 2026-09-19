/*
 * Decompiled with CFR 0.152.
 */
package rs.l_0.b.a;

import rs.l_0.b.a_0.a.c;
import rs.l_0.b.a_0.d;

public class b_0 {
    public static void a(String string, String[] stringArray, c c2) {
        switch (string.toLowerCase()) {
            case "set_id": 
            case "setid": 
            case "setnpc": 
            case "set": {
                int n2 = Integer.parseInt(stringArray[0]);
                c2.g(n2);
                d.b("@whi@<img=24> Entity transformed to @gre@" + c2.n().o + " (" + n2 + ")!");
                break;
            }
            case "reset": {
                c2.p();
                break;
            }
            case "walk": {
                c2.q();
                break;
            }
            case "stand": {
                c2.r();
                break;
            }
            case "select": {
                c2.a(true);
                break;
            }
        }
    }
}

