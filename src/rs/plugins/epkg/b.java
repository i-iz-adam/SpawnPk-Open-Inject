package rs.plugins.epkg;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.plugins.bpkg.q;
import rs.ui.m;

/* JADX INFO: loaded from: client-final.jar:rs/s/e/b.class */
public class b extends m {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) b.class);
    private final c b;
    private final q c;

    @Inject
    public b(c cVar, q qVar) {
        super(false);
        this.b = cVar;
        this.c = qVar;
    }

    @Override // rs.ui.m
    public void J_() {
        removeAll();
        add(this.c.b(this.b));
    }
}
