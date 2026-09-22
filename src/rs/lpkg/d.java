package rs.lpkg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: client-final.jar:rs/l/d.class */
class d {
    private IntBuffer a = b(65536);

    d() {
    }

    public void a(int i, int i2, int i3) {
        this.a.put(i).put(i2).put(i3);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.a.put(i).put(i2).put(i3).put(i4);
    }

    public void a(int[] iArr) {
        this.a.put(iArr);
    }

    public void a(int[] iArr, int i, int i2) {
        this.a.put(iArr, i, i2);
    }

    void a() {
        this.a.flip();
    }

    void b() {
        this.a.clear();
    }

    public d a(int i) {
        int iCapacity = this.a.capacity();
        int iPosition = this.a.position();
        if (iCapacity - iPosition < i) {
            do {
                iCapacity *= 2;
            } while (iCapacity - iPosition < i);
            IntBuffer intBufferB = b(iCapacity);
            this.a.flip();
            intBufferB.put(this.a);
            this.a = intBufferB;
        }
        return this;
    }

    IntBuffer c() {
        return this.a;
    }

    static IntBuffer b(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
    }
}
