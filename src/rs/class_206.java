package rs;

import java.util.Comparator;

/* JADX INFO: loaded from: client-final.jar:rs/class_206.class */
class class_206 implements Comparator<class_196> {
    final /* synthetic */ class_205 a;

    class_206(class_205 class_205Var) {
        this.a = class_205Var;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(class_196 class_196Var, class_196 class_196Var2) {
        int iD = class_196Var.d();
        Client client = this.a.f;
        Integer numValueOf = Integer.valueOf(iD - Client.cJ);
        int iE = class_196Var.e();
        Client client2 = this.a.f;
        Integer numValueOf2 = Integer.valueOf(iE - Client.cL);
        int iD2 = class_196Var2.d();
        Client client3 = this.a.f;
        Integer numValueOf3 = Integer.valueOf(iD2 - Client.cJ);
        int iE2 = class_196Var2.e();
        Client client4 = this.a.f;
        Integer numValueOf4 = Integer.valueOf(iE2 - Client.cL);
        return Integer.valueOf((int) Math.ceil(Math.sqrt((numValueOf3.intValue() * numValueOf3.intValue()) + (numValueOf4.intValue() * numValueOf4.intValue())))).compareTo(Integer.valueOf((int) Math.ceil(Math.sqrt((numValueOf.intValue() * numValueOf.intValue()) + (numValueOf2.intValue() * numValueOf2.intValue())))));
    }
}
