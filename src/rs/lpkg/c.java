package rs.lpkg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: client-final.jar:rs/l/c.class */
class c {
    private FloatBuffer a = b(65536);

    c() {
    }

    void a(float f, float f2, float f3, float f4) {
        this.a.put(f).put(f2).put(f3).put(f4);
    }

    public void a(float[] fArr) {
        this.a.put(fArr);
    }

    public void a(float[] fArr, int i, int i2) {
        this.a.put(fArr, i, i2);
    }

    void a() {
        this.a.flip();
    }

    void b() {
        this.a.clear();
    }

    void a(int i) {
        int iCapacity = this.a.capacity();
        int iPosition = this.a.position();
        if (iCapacity - iPosition < i) {
            do {
                iCapacity *= 2;
            } while (iCapacity - iPosition < i);
            FloatBuffer floatBufferB = b(iCapacity);
            this.a.flip();
            floatBufferB.put(this.a);
            this.a = floatBufferB;
        }
    }

    FloatBuffer c() {
        return this.a;
    }

    static FloatBuffer b(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }
}
