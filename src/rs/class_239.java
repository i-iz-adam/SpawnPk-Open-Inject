package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_239.class */
class class_239 extends class_553 {
    class_239() {
    }

    @Override // rs.class_553
    public void a() {
        switch (e()) {
            case 1:
                class_253.e.b();
                class_253.e.a(e() == 1);
                break;
            case 2:
                class_253.e.z = g();
                class_253.e.A = g();
                break;
            case 4:
                int iG = g();
                int iG2 = g();
                if (iG == iG2) {
                    class_253.e.y = 100;
                } else if (iG == 0) {
                    class_253.e.y = 0;
                } else {
                    class_253.e.y = (int) ((iG / iG2) * 100.0f);
                }
                class_253.e.B = iG + " / " + iG2 + " @yel@(" + class_253.e.y + "%)";
                break;
            case 5:
                class_253.e.C = h();
                break;
            case 6:
                class_253.e.D = "<img=305>" + g();
                break;
        }
    }
}
