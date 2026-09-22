package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_348.class */
public class class_348 extends class_342 {
    public static Widget k(int i, String str) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i;
        widgetJ.aG = 5;
        widgetJ.M = 0;
        widgetJ.J = 0;
        widgetJ.P = 512;
        widgetJ.aP = 334;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = 52;
        widgetJ.E = new class_333(false, str);
        widgetJ.aE = new class_333(false, str);
        return widgetJ;
    }

    public static Widget c(int i, class_333 class_333Var) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i;
        widgetJ.aG = 5;
        widgetJ.M = 0;
        widgetJ.J = 0;
        widgetJ.P = 512;
        widgetJ.aP = 334;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = 52;
        widgetJ.E = class_333Var;
        widgetJ.aE = class_333Var;
        return widgetJ;
    }

    @Override // rs.class_342
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public class_348 g(int i, int i2) {
        this.P = i;
        this.aP = i2;
        return this;
    }
}
