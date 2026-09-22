package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_200.class */
public class class_200 {
    /* JADX WARN: switch over string: strings are not added: [[sizex]] */
    public static void a(String str, String[] strArr, class_198 class_198Var) {
        switch (str.toLowerCase()) {
            case "set_id":
            case "setid":
            case "setnpc":
            case "set":
                int i = Integer.parseInt(strArr[0]);
                class_198Var.g(i);
                class_205.b("@whi@<img=24> Entity transformed to @gre@" + class_198Var.n().o + " (" + i + ")!");
                break;
            case "reset":
                class_198Var.p();
                break;
            case "walk":
                class_198Var.q();
                break;
            case "stand":
                class_198Var.r();
                break;
            case "select":
                class_198Var.a(true);
                break;
        }
    }
}
