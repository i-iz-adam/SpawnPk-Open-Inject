package rs.lpkg.bpkg;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.Stack;
import org.lwjgl.system.MemoryUtil;

/* JADX INFO: loaded from: client-final.jar:rs/l/b/a.class */
public class a {
    private final long b;
    private final rs.lpkg.e d;
    private final Stack<Long> a = new Stack<>();
    private boolean c = false;

    public a(long j, rs.lpkg.e eVar) {
        this.b = j;
        this.d = eVar;
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    public void b() {
        if (this.c) {
            return;
        }
        for (long j = this.b; j - 294912 >= 0; j -= 294912) {
            try {
                this.a.push(Long.valueOf(MemoryUtil.nmemAllocChecked(294912L)));
            } catch (OutOfMemoryError e) {
            }
        }
        this.c = true;
    }

    public void c() {
        Iterator<Long> it = this.a.iterator();
        while (it.hasNext()) {
            MemoryUtil.nmemFree(it.next().longValue());
            it.remove();
        }
    }

    public void a(IntBuffer intBuffer) {
        this.a.push(Long.valueOf(MemoryUtil.memAddress(intBuffer)));
    }

    public IntBuffer a(int i) {
        if (this.a.isEmpty()) {
            return null;
        }
        return MemoryUtil.memIntBuffer(this.a.pop().longValue(), i);
    }

    public void a(FloatBuffer floatBuffer) {
        this.a.push(Long.valueOf(MemoryUtil.memAddress(floatBuffer)));
    }

    public FloatBuffer b(int i) {
        if (this.a.isEmpty()) {
            return null;
        }
        return MemoryUtil.memFloatBuffer(this.a.pop().longValue(), i);
    }
}
