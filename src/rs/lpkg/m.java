package rs.lpkg;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL43C;

/* JADX INFO: loaded from: client-final.jar:rs/l/m.class */
public class m {

    @com.google.a.a.d
    final List<a> a = new ArrayList();

    /* JADX INFO: loaded from: client-final.jar:rs/l/m$a.class */
    @com.google.a.a.d
    static class a {
        private final int a;
        private final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public int a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public m a(int i, String str) {
        this.a.add(new a(i, str));
        return this;
    }

    public int a(rs.lpkg.dpkg.a aVar) {
        int iGlCreateProgram = GL43C.glCreateProgram();
        int[] iArr = new int[this.a.size()];
        int i = 0;
        while (i < iArr.length) {
            try {
                a aVar2 = this.a.get(i);
                int iGlCreateShader = GL43C.glCreateShader(aVar2.a);
                if (iGlCreateShader == 0) {
                    throw new n("Unable to create shader of type " + aVar2.a);
                }
                GL43C.glShaderSource(iGlCreateShader, aVar.b(aVar2.b));
                GL43C.glCompileShader(iGlCreateShader);
                if (GL43C.glGetShaderi(iGlCreateShader, 35713) != 1) {
                    String strGlGetShaderInfoLog = GL43C.glGetShaderInfoLog(iGlCreateShader);
                    GL43C.glDeleteShader(iGlCreateShader);
                    throw new n(strGlGetShaderInfoLog);
                }
                GL43C.glAttachShader(iGlCreateProgram, iGlCreateShader);
                int i2 = i;
                i++;
                iArr[i2] = iGlCreateShader;
            } catch (Throwable th) {
                while (i > 0) {
                    i--;
                    int i3 = iArr[i];
                    GL43C.glDetachShader(iGlCreateProgram, i3);
                    GL43C.glDeleteShader(i3);
                }
                if (0 == 0) {
                    GL43C.glDeleteProgram(iGlCreateProgram);
                }
                throw th;
            }
        }
        GL43C.glLinkProgram(iGlCreateProgram);
        if (GL43C.glGetProgrami(iGlCreateProgram, 35714) == 0) {
            throw new n(GL43C.glGetProgramInfoLog(iGlCreateProgram));
        }
        GL43C.glValidateProgram(iGlCreateProgram);
        if (GL43C.glGetProgrami(iGlCreateProgram, 35715) == 0) {
            throw new n(GL43C.glGetProgramInfoLog(iGlCreateProgram));
        }
        while (i > 0) {
            i--;
            int i4 = iArr[i];
            GL43C.glDetachShader(iGlCreateProgram, i4);
            GL43C.glDeleteShader(i4);
        }
        if (1 == 0) {
            GL43C.glDeleteProgram(iGlCreateProgram);
        }
        return iGlCreateProgram;
    }
}
