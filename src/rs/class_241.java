package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_241.class */
class class_241 implements class_257 {
    final /* synthetic */ class_240 a;

    class_241(class_240 class_240Var) {
        this.a = class_240Var;
    }

    @Override // rs.class_257
    public void a(Widget widget, int i, int i2) {
        if (widget.au >= 18041) {
            class_240.N.f(i - 3, i2);
        } else {
            class_240.N.f(i - 5, i2 - 3);
        }
    }
}
