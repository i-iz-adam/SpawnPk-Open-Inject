package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_372.class */
class class_372 {
    public String a;
    public long c;
    public String b = "<img=82>";
    public long d = System.currentTimeMillis();

    public class_372(String str, long j) {
        this.a = str;
        this.c = j;
    }

    public String a() {
        String str = "";
        if (this.c > 0) {
            long jCurrentTimeMillis = this.c - (System.currentTimeMillis() - this.d);
            if (jCurrentTimeMillis <= 0) {
                jCurrentTimeMillis = 0;
            }
            long j = jCurrentTimeMillis / 1000;
            if (j >= 3600) {
                long j2 = j / 3600;
                long j3 = (j / 60) % 60;
                long j4 = j % 60;
                String strValueOf = String.valueOf(j3 < 10 ? "0" + j3 : Long.valueOf(j3));
                String.valueOf(j4 < 10 ? "0" + j4 : Long.valueOf(j4));
                str = " <img=46> <img=37> @or1@" + j2 + ":" + " <img=46> <img=37> @or1@" + ":" + strValueOf;
            } else {
                long j5 = j / 60;
                long j6 = j % 60;
                String.valueOf(j6 < 10 ? "0" + j6 : Long.valueOf(j6));
                str = " <img=46> <img=37> @or1@" + j5 + ":" + " <img=46> <img=37> @or1@";
            }
        }
        return this.b + " @yel@" + this.a + str;
    }
}
