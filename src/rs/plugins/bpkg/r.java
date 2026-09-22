package rs.plugins.bpkg;

import rs.eventbus.EventBus;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/r.class */
class r extends rs.ui.k {
    final /* synthetic */ EventBus a;
    final /* synthetic */ q b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(q qVar, rs.ui.m mVar, EventBus eventBus) {
        super(mVar);
        this.b = qVar;
        this.a = eventBus;
    }

    @Override // rs.ui.k
    protected void a(rs.ui.m mVar) {
        this.a.register(mVar);
    }

    @Override // rs.ui.k
    protected void b(rs.ui.m mVar) {
        this.a.unregister(mVar);
    }
}
