package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_204.class */
public class class_204 {
    public static void a(String str, String[] strArr, class_199 class_199Var) {
        switch (str.toLowerCase()) {
            case "reset":
                class_199Var.p();
                break;
            case "male":
                class_199Var.q();
                class_205.b("@whi@<img=24> Entity transformed to male!");
                break;
            case "female":
                class_199Var.r();
                class_205.b("@whi@<img=24> Entity transformed to female!");
                break;
            case "weapon":
            case "wep":
                class_199Var.g(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set player weapon!");
                break;
            case "body":
            case "chest":
            case "top":
                class_199Var.h(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set chest piece!");
                break;
            case "cape":
            case "back":
                class_199Var.l(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set player cape!");
                break;
            case "neck":
            case "ammy":
                class_199Var.m(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set player amulet!");
                break;
            case "legs":
            case "leg":
                class_199Var.i(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set player legs!");
                break;
            case "hand":
            case "hands":
            case "glove":
            case "gloves":
                class_199Var.n(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set player gloves!");
                break;
            case "feet":
            case "boot":
            case "boots":
                class_199Var.k(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set player boots!");
                break;
            case "shield":
            case "off":
                class_199Var.o(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set player shield!");
                break;
            case "hat":
            case "head":
            case "helm":
            case "helmet":
                class_199Var.j(Integer.parseInt(strArr[0]));
                class_205.b("@whi@<img=24> Set player helmet!");
                break;
            case "full_helm":
            case "fullhelm":
                boolean z = !class_199Var.t();
                class_199Var.d(z);
                class_199Var.c(z);
                class_205.b("@whi@<img=24> Toggled full helm flag: " + (z ? "@gre@ON" : "@red@OFF"));
                break;
            case "full_mask":
            case "fullmask":
                boolean z2 = !class_199Var.t();
                class_199Var.c(z2);
                class_205.b("@whi@<img=24> Toggled full mask flag: " + (z2 ? "@gre@ON" : "@red@OFF"));
                break;
            case "full_hat":
            case "fullhat":
                boolean z3 = !class_199Var.u();
                class_199Var.d(z3);
                class_205.b("@whi@<img=24> Toggled full hat flag: " + (z3 ? "@gre@ON" : "@red@OFF"));
                break;
            case "full_body":
            case "full_chest":
            case "fullbody":
            case "fullchest":
                boolean z4 = !class_199Var.s();
                class_199Var.b(z4);
                class_205.b("@whi@<img=24> Toggled full body flag: " + (z4 ? "@gre@ON" : "@red@OFF"));
                break;
        }
    }
}
