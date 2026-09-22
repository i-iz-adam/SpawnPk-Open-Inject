package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_669.class */
public class class_669 extends class_670 {
    private long b;
    private long c;

    public class_669(long j) {
        this.c = j;
    }

    @Override // rs.class_670
    public void a() {
        this.b = System.currentTimeMillis();
    }

    @Override // rs.class_670
    public boolean b() {
        return System.currentTimeMillis() - this.b < this.c;
    }

    @Override // rs.class_670
    public long c() {
        if (b()) {
            return this.c - (System.currentTimeMillis() - this.b);
        }
        return 0L;
    }
}
