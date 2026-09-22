package rs;

import com.google.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import rs.ui.apkg.b;
import rs.ui.apkg.c;
import rs.ui.apkg.e;
import rs.ui.apkg.f;
import rs.ui.apkg.i;
import rs.ui.apkg.j;

/* JADX INFO: loaded from: client-final.jar:rs/class_558.class */
public class class_558 extends class_553 {
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;

    @Inject
    private class_1 g;

    @Inject
    private f h;

    @Inject
    private class_139 i;

    @Override // rs.class_553
    public void a() {
        b(e());
    }

    private void b(int i) {
        int iE = e();
        String strH = h();
        if (iE == 0) {
            this.h.b(strH);
            return;
        }
        if (iE == 2) {
            int iG = g();
            c cVarA = this.h.a(strH);
            if (cVarA == null || !(cVarA instanceof b)) {
                return;
            }
            ((b) cVarA).a(iG);
            return;
        }
        String strH2 = h();
        if (strH2.equalsIgnoreCase("def")) {
            strH2 = f.b;
        }
        int iG2 = i != 3 ? g() : 0;
        String strH3 = null;
        int iG3 = 1;
        switch (e()) {
            case 1:
                strH3 = h();
                break;
            case 2:
                iG3 = g();
                break;
        }
        String str = e() == 1 ? "@lre@" + strH + "\n" + h().replace("[br]", "\n") : null;
        c cVarA2 = this.h.a(strH);
        if (cVarA2 != null) {
            switch (i) {
                case 1:
                    if (cVarA2 instanceof j) {
                        ((j) cVarA2).b(Duration.of(iG2, ChronoUnit.SECONDS));
                        return;
                    }
                    this.h.b(strH);
                    break;
                case 2:
                    if (!(cVarA2 instanceof b)) {
                        this.h.b(strH);
                    } else {
                        ((b) cVarA2).a(iG2);
                        cVarA2.a(Instant.now());
                        this.h.b(strH);
                    }
                    break;
                case 3:
                    return;
            }
        }
        class_6 class_6VarA = a(strH3, iG3);
        c iVar = null;
        switch (i) {
            case 1:
                if (iG2 <= 0) {
                    return;
                } else {
                    iVar = new j(iG2, ChronoUnit.SECONDS, class_6VarA, strH2, strH);
                }
                break;
            case 2:
                iVar = new b(class_6VarA, strH2, strH, iG2);
                break;
            case 3:
                iVar = new i(class_6VarA, strH2, strH);
                break;
        }
        if (iVar == null) {
            return;
        }
        if (strH3 != null) {
            iVar.a(e.b);
        } else {
            iVar.a(e.a);
        }
        iVar.a((String) Objects.requireNonNullElseGet(str, () -> {
            return "@lre@" + strH;
        }));
        this.h.b(iVar);
    }

    private class_6 a(String str, int i) {
        return str != null ? this.g.a(str, -1) : this.g.a(i, Integer.MAX_VALUE, 32);
    }
}
