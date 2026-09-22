package rs;

import com.google.c.A;
import com.google.c.C;
import com.google.c.D;
import com.google.c.E;
import com.google.c.u;
import com.google.c.v;
import com.google.c.w;
import com.google.c.z;
import java.awt.Color;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: client-final.jar:rs/class_8.class */
public class class_8 implements E<Color>, v<Color> {
    @Override // com.google.c.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Color a(w wVar, Type type, u uVar) {
        if (!(wVar instanceof z)) {
            throw new A("The color " + String.valueOf(wVar) + " is not an object!");
        }
        if (wVar.t().b("value")) {
            return new Color(wVar.t().c("value").j());
        }
        throw new A("The color " + String.valueOf(wVar) + " has no value!");
    }

    @Override // com.google.c.E
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w serialize(Color color, Type type, D d) {
        z zVar = new z();
        zVar.a("value", new C((Number) Integer.valueOf(color.getRGB())));
        zVar.a("falpha", new C((Number) Float.valueOf(0.0f)));
        return zVar;
    }
}
