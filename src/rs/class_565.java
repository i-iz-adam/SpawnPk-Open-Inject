package rs;

import javax.inject.Inject;

/* JADX INFO: loaded from: client-final.jar:rs/class_565.class */
public class class_565 extends class_553 {
    private final class_274 d = new class_274("<img=9> Claim", "misc/treasure", "misc/treasure 2", 16753931, 7359745).a((i, i2, i3, z) -> {
        Client.fE[106].g(i + 21, i2 + 21, i3 - 25);
    }).a(() -> {
        class_341.a("::claimcoffer");
    });
    private final class_274 e = new class_274("<img=288> View", "misc/mail 7", "misc/mail 8", 9568136, 26904).a((i, i2, i3, z) -> {
        Client.fE[106].g(i + 21, i2 + 21, i3 - 25);
    }).a(() -> {
        class_341.a("::mail");
    });

    @Inject
    private class_313 f;

    @Override // rs.class_553
    public void a() {
        int iC = c();
        boolean z = e() == 1;
        class_274 class_274Var = null;
        switch (iC) {
            case 1:
                class_274Var = this.d;
                break;
            case 2:
                class_274Var = this.e;
                break;
        }
        if (class_274Var != null) {
            if (!z) {
                this.f.b(class_274Var);
            } else {
                if (this.f.c(class_274Var)) {
                    return;
                }
                this.f.a(class_274Var);
            }
        }
    }
}
