package rs.lpkg;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.geom.AffineTransform;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nonnull;
import net.runelite.rlawt.AWTContext;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL10GL;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.jni.JNINativeInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.ColorUtility;
import rs.class_151;
import rs.class_210;
import rs.class_267;
import rs.class_33;
import rs.class_330;
import rs.class_332;
import rs.class_34;
import rs.class_46;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/l/e.class */
public class e {
    public static final int c = 6144;
    public static final int d = 512;
    private static final int n = Integer.MIN_VALUE;
    private AWTContext t;
    static final String f = "#version 420\n#extension GL_ARB_compute_shader : require\n#extension GL_ARB_shader_storage_buffer_object : require\n#extension GL_ARB_explicit_attrib_location : require\n";
    static final String g = "#version 430\n";
    private ByteBuffer w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int ac;
    private Callback ae;
    private GLCapabilities af;
    private d ag;
    private d ah;
    private c ai;
    private d aj;
    private d ak;
    private d al;
    private int am;
    private boolean an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private rs.lpkg.apkg.a ay;
    private int az;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private int aE;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private int aQ;
    private int aR;
    private int aS;
    private int aT;
    private int aU;
    private int aV;
    private int aW;
    private int aX;
    private int aY;
    private int aZ;
    private int ba;
    private int bb;
    private int bc;
    private int bd;
    private int be;
    private int bf;
    private static final Logger m = LoggerFactory.getLogger((Class<?>) e.class);
    public static boolean a = true;
    public static boolean b = false;
    static final m h = new m().a(35633, "vert.glsl").a(35632, "frag.glsl");
    static final m i = new m().a(37305, "comp.glsl");
    static final m j = new m().a(37305, "comp.glsl");
    static final m k = new m().a(37305, "comp_unordered.glsl");
    static final m l = new m().a(35633, "vertui.glsl").a(35632, "fragui.glsl");
    private static final int[] u = new int[8];
    public int e = 2;
    private final q o = new q();
    private final k p = new k();
    private final l q = new l();
    private final i r = new i();
    private final rs.lpkg.bpkg.f s = new rs.lpkg.bpkg.f();
    private a v = a.a;
    private final rs.lpkg.a T = new rs.lpkg.a("scene vertex buffer");
    private final rs.lpkg.a U = new rs.lpkg.a("scene tex buffer");
    private final rs.lpkg.a V = new rs.lpkg.a("tmp vertex buffer");
    private final rs.lpkg.a W = new rs.lpkg.a("tmp tex buffer");
    private final rs.lpkg.a X = new rs.lpkg.a("model buffer large");
    private final rs.lpkg.a Y = new rs.lpkg.a("model buffer small");
    private final rs.lpkg.a Z = new rs.lpkg.a("model buffer unordered");
    private final rs.lpkg.a aa = new rs.lpkg.a("out vertex buffer");
    private final rs.lpkg.a ab = new rs.lpkg.a("out tex buffer");
    private final rs.lpkg.a ad = new rs.lpkg.a("uniform buffer");
    private long as = 0;
    private int aF = -1;
    private boolean bg = false;

    /* JADX INFO: loaded from: client-final.jar:rs/l/e$a.class */
    enum a {
        a,
        b,
        c
    }

    public static boolean a() {
        return b;
    }

    public e() {
        c();
    }

    public Component b() {
        return Launcher.n().o().z();
    }

    public void c() {
        try {
            this.Q = -1;
            this.P = -1;
            this.av = 0;
            this.au = 0;
            this.at = 0;
            this.am = 0;
            AWTContext.loadNatives();
            synchronized (b().getTreeLock()) {
                if (b().isValid()) {
                    this.t = new AWTContext(b());
                    this.t.configurePixelFormat(0, 0, 0);
                    this.t.createGLContext();
                    b().setIgnoreRepaint(true);
                    this.v = j.a() == j.b ? a.c : a.b;
                    Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.set("lwjgl-rl-" + System.getProperty("os.arch", "unknown"));
                    this.af = GL.createCapabilities();
                    m.info("Using device: {}", GL43C.glGetString(7937));
                    m.info("Using driver: {}", GL43C.glGetString(7938));
                    GL.getCapabilities();
                    if (!this.af.OpenGL31) {
                        throw new RuntimeException("OpenGL 3.1 is required but not available");
                    }
                    if (!this.af.OpenGL43 && this.v == a.b) {
                        m.info("disabling compute shaders because OpenGL 4.3 is not available");
                        this.v = a.a;
                    }
                    if (this.v == a.a) {
                        this.q.a();
                    }
                    this.bg = true;
                    w();
                    if (m.isDebugEnabled() && this.af.glDebugMessageControl != 0) {
                        this.ae = GLUtil.setupDebugMessageCallback();
                        if (this.ae != null) {
                            GL43C.glDebugMessageControl(33350, 33361, 4352, 131185, false);
                            GL43C.glDebugMessageControl(33350, 33360, 4352, 131154, false);
                        }
                    }
                    this.ag = new d();
                    this.ah = new d();
                    this.ai = new c();
                    this.aj = new d();
                    this.ak = new d();
                    this.al = new d();
                    e();
                    m();
                    try {
                        j();
                        q();
                        s();
                        o();
                        b = true;
                        this.aC = -1;
                        this.aB = -1;
                        this.aE = -1;
                        this.aD = -1;
                        this.ay = null;
                        this.aF = -1;
                        this.ac = -1;
                        if (Launcher.n().o().fc) {
                            a(new f(this));
                        }
                        w();
                    } catch (n e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } catch (Throwable th) {
            m.error("Error starting GPU plugin", th);
            d();
        }
    }

    public void d() {
        a(() -> {
            this.q.b();
            if (this.bg) {
                this.p.a();
                if (this.ac != -1) {
                    this.o.a(this.ac);
                    this.ac = -1;
                }
                b(this.ad);
                p();
                r();
                l();
                n();
                t();
            }
            if (this.t != null) {
                this.t.destroy();
                this.t = null;
            }
            if (this.ae != null) {
                this.ae.free();
                this.ae = null;
            }
            this.af = null;
            this.ah = null;
            this.ai = null;
            this.ak = null;
            this.al = null;
            this.aj = null;
            this.aF = -1;
            b = false;
            a(false);
        });
    }

    public static void a(boolean z) {
        Launcher.n().o().hG = Launcher.n().o().z().getGraphics();
        Launcher.n().o().z().setIgnoreRepaint(z);
        Launcher.n().o().D();
        Launcher.n().o().a(rs.Configuration.ai);
        Launcher.n().o().b(true);
        Launcher.n().o().h();
        Launcher.n().o().repaint();
    }

    public void e() {
        int i2 = 0;
        switch (g.a[b.d.ordinal()]) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 0;
                break;
            case 3:
                i2 = -1;
                break;
        }
        int swapInterval = this.t.setSwapInterval(i2);
        if (swapInterval != i2) {
            m.info("unsupported swap interval {}, got {}", Integer.valueOf(i2), Integer.valueOf(swapInterval));
        }
        w();
    }

    private rs.lpkg.dpkg.a b(int i2, int i3) {
        String str = j.a() == j.c ? f : g;
        rs.lpkg.d.a aVar = new rs.lpkg.dpkg.a();
        aVar.a(str2 -> {
            if ("version_header".equals(str2)) {
                return str;
            }
            if ("thread_config".equals(str2)) {
                return "#define THREAD_COUNT " + i2 + "\n#define FACES_PER_THREAD " + i3 + "\n";
            }
            return null;
        });
        aVar.a(e.class);
        return aVar;
    }

    private void j() {
        rs.lpkg.d.a aVarB = b(-1, -1);
        this.x = h.a(aVarB);
        this.K = l.a(aVarB);
        if (this.v == a.b) {
            this.B = i.a(b(1024, 6));
            this.D = j.a(b(512, 1));
            this.F = k.a(aVarB);
        } else if (this.v == a.c) {
            this.p.a(this.t);
        }
        k();
    }

    private void k() {
        this.aQ = GL43C.glGetUniformLocation(this.x, "projectionMatrix");
        this.aR = GL43C.glGetUniformLocation(this.x, "brightness");
        this.bc = GL43C.glGetUniformLocation(this.x, "smoothBanding");
        this.aM = GL43C.glGetUniformLocation(this.x, "useFog");
        this.aN = GL43C.glGetUniformLocation(this.x, "fogColor");
        this.aO = GL43C.glGetUniformLocation(this.x, "fogDepth");
        this.aP = GL43C.glGetUniformLocation(this.x, "drawDistance");
        this.aK = GL43C.glGetUniformLocation(this.x, "colorBlindMode");
        this.bd = GL43C.glGetUniformLocation(this.x, "textureLightMode");
        this.be = GL43C.glGetUniformLocation(this.x, "tick");
        this.bb = GL43C.glGetUniformBlockIndex(this.x, "uniforms");
        this.aX = GL43C.glGetUniformLocation(this.x, "textures");
        this.aY = GL43C.glGetUniformLocation(this.x, "textureAnimations");
        this.aS = GL43C.glGetUniformLocation(this.K, "tex");
        this.aT = GL43C.glGetUniformLocation(this.K, "samplingMode");
        this.aV = GL43C.glGetUniformLocation(this.K, "targetDimensions");
        this.aU = GL43C.glGetUniformLocation(this.K, "sourceDimensions");
        this.aL = GL43C.glGetUniformLocation(this.K, "colorBlindMode");
        this.aW = GL43C.glGetUniformLocation(this.K, "alphaOverlay");
        if (this.v == a.b) {
            this.aZ = GL43C.glGetUniformBlockIndex(this.D, "uniforms");
            this.ba = GL43C.glGetUniformBlockIndex(this.B, "uniforms");
        }
    }

    private void l() {
        GL43C.glDeleteProgram(this.x);
        this.x = -1;
        GL43C.glDeleteProgram(this.B);
        this.B = -1;
        GL43C.glDeleteProgram(this.D);
        this.D = -1;
        GL43C.glDeleteProgram(this.F);
        this.F = -1;
        GL43C.glDeleteProgram(this.K);
        this.K = -1;
    }

    private void m() {
        this.H = GL43C.glGenVertexArrays();
        this.N = GL43C.glGenVertexArrays();
        this.O = GL43C.glGenBuffers();
        GL43C.glBindVertexArray(this.N);
        FloatBuffer floatBufferB = c.b(20);
        floatBufferB.put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f});
        floatBufferB.rewind();
        GL43C.glBindBuffer(34962, this.O);
        GL43C.glBufferData(34962, floatBufferB, 35044);
        GL43C.glVertexAttribPointer(0, 3, 5126, false, 20, 0L);
        GL43C.glEnableVertexAttribArray(0);
        GL43C.glVertexAttribPointer(1, 2, 5126, false, 20, 12L);
        GL43C.glEnableVertexAttribArray(1);
        GL43C.glBindBuffer(34962, 0);
    }

    private void n() {
        GL43C.glDeleteVertexArrays(this.H);
        this.H = -1;
        GL43C.glDeleteBuffers(this.O);
        this.O = -1;
        GL43C.glDeleteVertexArrays(this.N);
        this.N = -1;
    }

    private void o() {
        a(this.T);
        a(this.U);
        a(this.V);
        a(this.W);
        a(this.X);
        a(this.Y);
        a(this.Z);
        a(this.aa);
        a(this.ab);
    }

    private void a(rs.lpkg.apkg.a aVar) {
        aVar.b = GL43C.glGenBuffers();
    }

    private void p() {
        b(this.T);
        b(this.U);
        b(this.V);
        b(this.W);
        b(this.X);
        b(this.Y);
        b(this.Z);
        b(this.aa);
        b(this.ab);
    }

    private void b(rs.lpkg.apkg.a aVar) {
        if (aVar.b != -1) {
            GL43C.glDeleteBuffers(aVar.b);
            aVar.b = -1;
        }
        aVar.c = -1;
        if (aVar.d != -1) {
            aVar.d = -1L;
        }
    }

    private void q() {
        this.J = GL43C.glGenBuffers();
        this.I = GL43C.glGenTextures();
        GL43C.glBindTexture(3553, this.I);
        GL43C.glTexParameteri(3553, 10242, 33071);
        GL43C.glTexParameteri(3553, 10243, 33071);
        GL43C.glTexParameteri(3553, 10241, 9729);
        GL43C.glTexParameteri(3553, 10240, 9729);
        GL43C.glBindTexture(3553, 0);
    }

    private void r() {
        GL43C.glDeleteBuffers(this.J);
        GL43C.glDeleteTextures(this.I);
        this.I = -1;
    }

    private void s() {
        a(this.ad);
        IntBuffer intBufferB = d.b(8200);
        intBufferB.put(new int[8]);
        int[] iArr = new int[2];
        for (int i2 = 0; i2 < 2048; i2++) {
            intBufferB.put(rs.runelite.a.h.e[i2]);
            intBufferB.put(rs.runelite.a.h.f[i2]);
            intBufferB.put(iArr);
        }
        intBufferB.flip();
        a(this.ad, 35345, intBufferB, 35048, 4L);
        GL43C.glBindBuffer(35345, 0);
    }

    private void a(int i2, int i3, int i4) {
        if (j.a() != j.b) {
            AffineTransform defaultTransform = b().getGraphicsConfiguration().getDefaultTransform();
            i2 = a(defaultTransform.getScaleX(), i2);
            i3 = a(defaultTransform.getScaleY(), i3);
        }
        this.P = GL43C.glGenFramebuffers();
        GL43C.glBindFramebuffer(36160, this.P);
        this.Q = GL43C.glGenRenderbuffers();
        GL43C.glBindRenderbuffer(36161, this.Q);
        GL43C.glRenderbufferStorageMultisample(36161, i4, 6408, i2, i3);
        GL43C.glFramebufferRenderbuffer(36160, 36064, 36161, this.Q);
        int iGlCheckFramebufferStatus = GL43C.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            throw new RuntimeException("FBO is incomplete. status: " + iGlCheckFramebufferStatus);
        }
        GL43C.glBindFramebuffer(36160, this.t.getFramebuffer(false));
        GL43C.glBindRenderbuffer(36161, 0);
    }

    private void t() {
        if (this.P != -1) {
            GL43C.glDeleteFramebuffers(this.P);
            this.P = -1;
        }
        if (this.Q != -1) {
            GL43C.glDeleteRenderbuffers(this.Q);
            this.Q = -1;
        }
    }

    private float[] a(float f2, float f3, float f4) {
        return new float[]{2.0f / f2, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / f3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, (-2.0f) * f4, 0.0f};
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        b(i2, i3, i4, i5, i6, i7);
    }

    public void b(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.aG = Launcher.n().o().aj();
        this.aH = Launcher.n().o().ak();
        this.aI = Launcher.n().o().al();
        this.aJ = Launcher.n().o().am();
        this.ah.b();
        this.ah.a(32);
        IntBuffer intBufferC = this.ah.c();
        intBufferC.put(this.aI).put(this.aJ).put(this.aG).put(this.aH).put(Launcher.n().o().aJ()).put(Launcher.n().o().aL()).put(Launcher.n().o().aM()).put(Launcher.n().o().aN());
        intBufferC.flip();
        GL43C.glBindBuffer(35345, this.ad.b);
        GL43C.glBufferSubData(35345, 0L, intBufferC);
        GL43C.glBindBuffer(35345, 0);
        GL43C.glBindBufferBase(35345, 0, this.ad.b);
        intBufferC.clear();
    }

    public void f() {
        u();
    }

    private void u() {
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, class_34 class_34Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (this.v == a.a) {
            this.av += this.q.a(class_34Var, i10, i11, i12, this.ah, this.ai, 128 * i11, 128 * i12, true);
            return;
        }
        if (class_34Var.f() > 0) {
            d dVar = this.aj;
            this.am++;
            dVar.a(8);
            IntBuffer intBufferC = dVar.c();
            intBufferC.put(class_34Var.g());
            intBufferC.put(class_34Var.h());
            intBufferC.put(2);
            intBufferC.put(this.av);
            intBufferC.put(Integer.MIN_VALUE);
            intBufferC.put(i11 * 128).put(0).put(i12 * 128);
            this.av += 6;
        }
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, class_33 class_33Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (class_33Var.a() > 0) {
            d dVar = this.aj;
            this.am++;
            dVar.a(8);
            IntBuffer intBufferC = dVar.c();
            intBufferC.put(class_33Var.b());
            intBufferC.put(class_33Var.c());
            intBufferC.put(class_33Var.a() / 3);
            intBufferC.put(this.av);
            intBufferC.put(Integer.MIN_VALUE);
            intBufferC.put(i11 * 128).put(0).put(i12 * 128);
            this.av += class_33Var.a();
        }
    }

    public void g() {
        a(1, true);
    }

    public void b(boolean z) {
        a(1, z);
    }

    public void a(int i2, boolean z) {
        int i3;
        int i4;
        int iAu = Launcher.n().o().au();
        int iAt = Launcher.n().o().at();
        int iAq = Launcher.n().o().aq() + 5;
        int iAr = Launcher.n().o().ar() + 5;
        rs.lpkg.apkg.a aVar = b.b;
        boolean z2 = aVar != rs.lpkg.apkg.a.a;
        c(iAt, iAu);
        if (z2) {
            GL43C.glEnable(32925);
            Dimension dimensionAD = Launcher.n().o().aD();
            int i5 = Launcher.n().o().av() ? dimensionAD.width : iAt;
            int i6 = Launcher.n().o().av() ? dimensionAD.height : iAu;
            if (this.aD != i5 || this.aE != i6 || this.ay != aVar) {
                t();
                GL43C.glBindFramebuffer(36160, this.t.getFramebuffer(false));
                int iGlGetInteger = GL43C.glGetInteger(32937);
                int iGlGetInteger2 = GL43C.glGetInteger(36183);
                int iMin = iGlGetInteger != 0 ? iGlGetInteger : Math.min(aVar.a(), iGlGetInteger2);
                m.debug("AA samples: {}, max samples: {}, forced samples: {}", Integer.valueOf(iMin), Integer.valueOf(iGlGetInteger2), Integer.valueOf(iGlGetInteger));
                a(i5, i6, iMin);
                this.aD = i5;
                this.aE = i6;
            }
            GL43C.glBindFramebuffer(36009, this.P);
        } else {
            GL43C.glDisable(32925);
            t();
        }
        this.ay = aVar;
        if (this.v == a.a) {
            this.ah.a();
            this.ai.a();
            IntBuffer intBufferC = this.ah.c();
            FloatBuffer floatBufferC = this.ai.c();
            a(this.V, 34962, intBufferC, 35048, 0L);
            a(this.W, 34962, floatBufferC, 35048, 0L);
            w();
        } else {
            this.ah.a();
            this.ai.a();
            this.al.a();
            this.ak.a();
            this.aj.a();
            IntBuffer intBufferC2 = this.ah.c();
            FloatBuffer floatBufferC2 = this.ai.c();
            IntBuffer intBufferC3 = this.al.c();
            IntBuffer intBufferC4 = this.ak.c();
            IntBuffer intBufferC5 = this.aj.c();
            a(this.V, 34962, intBufferC2, 35048, 4L);
            a(this.W, 34962, floatBufferC2, 35048, 4L);
            a(this.X, 34962, intBufferC3, 35048, 4L);
            a(this.Y, 34962, intBufferC4, 35048, 4L);
            a(this.Z, 34962, intBufferC5, 35048, 4L);
            a(this.aa, 34962, this.av * 16, 35040, 2L);
            a(this.ab, 34962, this.av * 16, 35040, 2L);
            if (this.v == a.c) {
                this.p.a(this.am, this.at, this.au, this.T, this.U, this.V, this.W, this.Z, this.Y, this.X, this.aa, this.ab, this.ad);
            } else if (this.v == a.b) {
                GL43C.glUniformBlockBinding(this.D, this.aZ, 0);
                GL43C.glUniformBlockBinding(this.B, this.ba, 0);
                GL43C.glUseProgram(this.F);
                GL43C.glBindBufferBase(37074, 0, this.Z.b);
                GL43C.glBindBufferBase(37074, 1, this.T.b);
                GL43C.glBindBufferBase(37074, 2, this.V.b);
                GL43C.glBindBufferBase(37074, 3, this.aa.b);
                GL43C.glBindBufferBase(37074, 4, this.ab.b);
                GL43C.glBindBufferBase(37074, 5, this.U.b);
                GL43C.glBindBufferBase(37074, 6, this.W.b);
                GL43C.glDispatchCompute(this.am, 1, 1);
                GL43C.glUseProgram(this.D);
                GL43C.glBindBufferBase(37074, 0, this.Y.b);
                GL43C.glBindBufferBase(37074, 1, this.T.b);
                GL43C.glBindBufferBase(37074, 2, this.V.b);
                GL43C.glBindBufferBase(37074, 3, this.aa.b);
                GL43C.glBindBufferBase(37074, 4, this.ab.b);
                GL43C.glBindBufferBase(37074, 5, this.U.b);
                GL43C.glBindBufferBase(37074, 6, this.W.b);
                GL43C.glDispatchCompute(this.at, 1, 1);
                GL43C.glUseProgram(this.B);
                GL43C.glBindBufferBase(37074, 0, this.X.b);
                GL43C.glBindBufferBase(37074, 1, this.T.b);
                GL43C.glBindBufferBase(37074, 2, this.V.b);
                GL43C.glBindBufferBase(37074, 3, this.aa.b);
                GL43C.glBindBufferBase(37074, 4, this.ab.b);
                GL43C.glBindBufferBase(37074, 5, this.U.b);
                GL43C.glBindBufferBase(37074, 6, this.W.b);
                GL43C.glDispatchCompute(this.au, 1, 1);
                w();
            }
        }
        int iAi = Launcher.n().o().ai();
        Client clientO = Launcher.n().o();
        if (z) {
            GL43C.glClearColor(((iAi >> 16) & 255) / 255.0f, ((iAi >> 8) & 255) / 255.0f, (iAi & 255) / 255.0f, 1.0f);
            GL43C.glClear(16384);
        }
        if (this.R != -1) {
            if (this.ac == -1) {
                this.ac = this.o.a();
                if (this.ac > -1) {
                    float[] fArrB = this.o.b();
                    GL43C.glUseProgram(this.x);
                    GL43C.glUniform2fv(this.aY, fArrB);
                    GL43C.glUseProgram(0);
                }
            }
            int iFloor = 0;
            int iFloor2 = 0;
            int i7 = iAu;
            int iCeil = iAq;
            int iCeil2 = iAr;
            this.e = b.c;
            if (this.ac != -1 && this.aF != this.e) {
                this.o.a(this.ac, this.e);
                this.aF = this.e;
            }
            if (Launcher.n().o().av()) {
                Dimension dimensionAD2 = Launcher.n().o().aD();
                i7 = dimensionAD2.height;
                double height = dimensionAD2.getHeight() / ((double) iAu);
                double width = dimensionAD2.getWidth() / ((double) iAt);
                iCeil = ((int) Math.ceil(height * ((double) iCeil))) + 2;
                iCeil2 = ((int) Math.ceil(width * ((double) iCeil2))) + 2;
                iFloor = ((int) Math.floor(height * ((double) 0))) - 1;
                iFloor2 = ((int) Math.floor(width * ((double) 0))) - 1;
            }
            int iAc = clientO.ac();
            if (iAc > 1) {
                iAc++;
            }
            a(iFloor2 + iAc, (i7 - iCeil) - iFloor, iCeil2, iCeil);
            GL43C.glUseProgram(this.x);
            w();
            int i8 = class_46.e;
            GL43C.glUniform1i(this.aM, 0);
            GL43C.glUniform4f(this.aN, ((iAi >> 16) & 255) / 255.0f, ((iAi >> 8) & 255) / 255.0f, (iAi & 255) / 255.0f, 1.0f);
            GL43C.glUniform1i(this.aO, 0);
            GL43C.glUniform1i(this.aP, i8 * 128);
            boolean z3 = b.f;
            GL43C.glUniform1f(this.aR, (float) class_332.c());
            GL43C.glUniform1f(this.bc, z3 ? 0.0f : 1.0f);
            GL43C.glUniform1i(this.aK, b.e.ordinal());
            GL43C.glUniform1f(this.bd, 1 != 0 ? 1.25f : 0.0f);
            int i9 = this.be;
            Launcher.n().o();
            GL43C.glUniform1i(i9, Client.ff);
            float[] fArrA = h.a(Launcher.n().o().aJ(), Launcher.n().o().aJ(), 1.0f);
            h.a(fArrA, h.c(iAr, iAq, 50.0f));
            h.a(fArrA, h.a((float) (-(3.141592653589793d - (((double) this.aJ) * 0.0030679615757712823d)))));
            h.a(fArrA, h.b((float) (((double) this.aI) * 0.0030679615757712823d)));
            h.a(fArrA, h.b(-Launcher.n().o().aL(), -Launcher.n().o().aM(), -Launcher.n().o().aN()));
            GL43C.glUniformMatrix4fv(this.aQ, false, fArrA);
            GL43C.glUniformBlockBinding(this.x, this.bb, 0);
            GL43C.glUniform1i(this.aX, 1);
            GL43C.glEnable(2884);
            GL43C.glEnable(3042);
            GL43C.glBlendFuncSeparate(770, 771, 1, 1);
            GL43C.glBindVertexArray(this.H);
            if (this.v != a.a) {
                if (this.v == a.b) {
                    GL43C.glMemoryBarrier(8192);
                } else {
                    this.p.b();
                }
                i3 = this.aa.b;
                i4 = this.ab.b;
            } else {
                i3 = this.V.b;
                i4 = this.W.b;
            }
            GL43C.glEnableVertexAttribArray(0);
            GL43C.glBindBuffer(34962, i3);
            GL43C.glVertexAttribIPointer(0, 4, 5124, 0, 0L);
            GL43C.glEnableVertexAttribArray(1);
            GL43C.glBindBuffer(34962, i4);
            GL43C.glVertexAttribPointer(1, 4, 5126, false, 0, 0L);
            GL43C.glDrawArrays(4, 0, this.av);
            GL43C.glDisable(3042);
            GL43C.glDisable(2884);
            GL43C.glUseProgram(0);
            w();
        }
        if (z2) {
            int iA = this.aD;
            int iA2 = this.aE;
            if (j.a() != j.b) {
                AffineTransform defaultTransform = b().getGraphicsConfiguration().getDefaultTransform();
                iA = a(defaultTransform.getScaleX(), iA);
                iA2 = a(defaultTransform.getScaleY(), iA2);
            }
            GL43C.glBindFramebuffer(36008, this.P);
            GL43C.glBindFramebuffer(36009, this.t.getFramebuffer(false));
            GL43C.glBlitFramebuffer(0, 0, iA, iA2, 0, 0, iA, iA2, 16384, 9728);
            GL43C.glBindFramebuffer(36008, this.t.getFramebuffer(false));
        }
        this.ah.b();
        this.ai.b();
        this.al.b();
        this.ak.b();
        this.aj.b();
        this.am = 0;
        this.au = 0;
        this.at = 0;
        this.aw = 0;
        this.ax = 0;
        rs.lpkg.b.g.a();
        a(iAu, iAt);
        w();
        this.t.swapBuffers();
        w();
        this.av = 0;
        w();
        long j2 = this.as + 1;
        this.as = j2;
        if (j2 <= 5 || rs.Configuration.Q) {
            return;
        }
        rs.Configuration.Q = true;
        rs.Configuration.d();
    }

    public void h() {
        this.aC = -1;
        this.aB = -1;
        this.aE = -1;
        this.aD = -1;
    }

    private void c(int i2, int i3) {
        Client clientO = Launcher.n().o();
        if (i2 != this.aB || i3 != this.aC) {
            this.aB = i2;
            this.aC = i3;
            GL43C.glBindBuffer(35052, this.J);
            GL43C.glBufferData(35052, ((long) (i2 * i3)) * 4, 35040);
            GL43C.glBindBuffer(35052, 0);
            GL43C.glBindTexture(3553, this.I);
            GL43C.glTexImage2D(3553, 0, 6408, i2, i3, 0, 32993, 5121, 0L);
            GL43C.glBindTexture(3553, 0);
        }
        class_330[] class_330VarArr = {clientO.gZ};
        int[] iArr = {0};
        int[] iArr2 = {0};
        boolean z = rs.Configuration.ai == class_151.b;
        for (int i4 = 0; i4 < class_330VarArr.length; i4++) {
            int[] iArrB = class_330VarArr[i4].b();
            int iC = class_330VarArr[i4].c();
            int iD = class_330VarArr[i4].d();
            GL43C.glBindBuffer(35052, this.J);
            GL43C.glMapBuffer(35052, 35001).asIntBuffer().put(iArrB, 0, iC * iD);
            GL43C.glUnmapBuffer(35052);
            GL43C.glBindTexture(3553, this.I);
            GL43C.glTexSubImage2D(3553, 0, iArr[i4], iArr2[i4], iC, iD, 32993, 33639, 0L);
            GL43C.glBindBuffer(35052, 0);
            GL43C.glBindTexture(3553, 0);
        }
    }

    public void a(int i2, int i3) {
        GL43C.glEnable(3042);
        GL43C.glBlendFunc(1, 771);
        GL43C.glBindTexture(3553, this.I);
        int i4 = b.k;
        if (!Launcher.n().o().aw()) {
            i4 = 2;
        }
        int iOrdinal = b.e.ordinal();
        GL43C.glUseProgram(this.K);
        GL43C.glUniform1i(this.aS, 0);
        GL43C.glUniform1i(this.aT, i4);
        GL43C.glUniform2i(this.aU, i3, i2);
        GL43C.glUniform1i(this.aL, iOrdinal);
        GL43C.glUniform4f(this.aW, 0.0f, 0.0f, 0.0f, 0.0f);
        Client clientO = Launcher.n().o();
        if (clientO.av()) {
            Dimension dimensionAD = clientO.aD();
            a(clientO.ac(), 0, dimensionAD.width, dimensionAD.height);
            GL43C.glUniform2i(this.aV, dimensionAD.width, dimensionAD.height);
        } else {
            a(0, (this.v == a.c && rs.Configuration.ai == class_151.a) ? 2 : 0, i3, i2);
            GL43C.glUniform2i(this.aV, i3, i2);
        }
        if (Launcher.n().o().av()) {
            GL43C.glTexParameteri(3553, 10241, 9728);
            GL43C.glTexParameteri(3553, 10240, 9728);
        }
        GL43C.glBindVertexArray(this.N);
        GL43C.glDrawArrays(6, 0, 4);
        GL43C.glBindTexture(3553, 0);
        GL43C.glBindVertexArray(0);
        GL43C.glUseProgram(0);
        GL43C.glBlendFunc(770, 771);
        GL43C.glDisable(3042);
    }

    public void i() {
        if (Launcher.n().o().fc) {
            v();
        } else {
            System.out.println("Shutting down..");
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.ah.b();
        this.ai.b();
        this.q.a(Launcher.n().o().dF, this.ah, this.ai);
        this.ah.a();
        this.ai.a();
        IntBuffer intBufferC = this.ah.c();
        FloatBuffer floatBufferC = this.ai.c();
        a(this.T, 34962, intBufferC, 35046, 4L);
        a(this.U, 34962, floatBufferC, 35046, 4L);
        GL43C.glBindBuffer(34962, 0);
        intBufferC.clear();
        floatBufferC.clear();
    }

    public void a(ColorUtility colorUtility, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j2) {
        if (colorUtility == null || colorUtility.ah == 0) {
            return;
        }
        if (this.v == a.a) {
            if (colorUtility != null) {
            }
            return;
        }
        if (colorUtility.r() == this.q.a) {
            int iMin = Math.min(6144, colorUtility.ah);
            int iS = colorUtility.s();
            d dVarA = a(iMin);
            dVarA.a(8);
            IntBuffer intBufferC = dVarA.c();
            u[0] = colorUtility.t();
            u[1] = iS;
            u[2] = iMin;
            u[3] = this.av;
            u[4] = Integer.MIN_VALUE | (colorUtility.v() << 12) | i2;
            u[5] = i7 + Launcher.n().o().aL();
            u[6] = i8 + Launcher.n().o().aM();
            u[7] = i9 + Launcher.n().o().aN();
            intBufferC.put(u);
            this.av += iMin * 3;
            return;
        }
        boolean z = a && (colorUtility.Y != null || colorUtility.d());
        int iMin2 = Math.min(6144, colorUtility.ah);
        this.ah.a(12 * iMin2);
        this.ai.a(12 * iMin2);
        u[3] = this.av;
        u[4] = (colorUtility.v() << 12) | i2;
        u[5] = i7 + Launcher.n().o().aL();
        u[6] = i8 + Launcher.n().o().aM();
        u[7] = i9 + Launcher.n().o().aN();
        int iA = this.r.a(colorUtility, this.ah, this.ai, j2);
        int i10 = colorUtility.ah;
        int i11 = z ? this.ax : -1;
        u[0] = this.aw;
        u[1] = z ? i11 : -1;
        u[2] = iA / 3;
        a(iA / 3).a(8).a(u);
        this.aw += iA;
        if (z) {
            this.ax += iA;
        }
        this.av += iA;
    }

    private boolean a(ColorUtility colorUtility, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Client clientO = Launcher.n().o();
        int iU = colorUtility.u();
        int i9 = colorUtility.g;
        int iAK = clientO.aK();
        int i10 = colorUtility.g;
        int i11 = class_210.n;
        int i12 = class_210.n * (-1);
        int i13 = class_210.o * (-1);
        int i14 = class_210.o;
        int i15 = ((i5 * i8) - (i4 * i6)) >> 16;
        int i16 = (((i2 * i7) + (i3 * i15)) >> 16) + ((i3 * iU) >> 16);
        if (i16 <= 50) {
            return false;
        }
        int i17 = ((i8 * i4) + (i5 * i6)) >> 16;
        if (((i17 - iU) * iAK) / i16 >= i11 || ((i17 + iU) * iAK) / i16 <= i12) {
            return false;
        }
        int i18 = ((i3 * i7) - (i15 * i2)) >> 16;
        int i19 = (i2 * iU) >> 16;
        return ((i18 + (((i3 * i9) >> 16) + i19)) * iAK) / i16 > i13 && ((i18 - (((i3 * i10) >> 16) + i19)) * iAK) / i16 < i14;
    }

    public void a(rs.lpkg.cpkg.a aVar, int i2, int i3, int i4, int i5, boolean z) {
        if (this.v == a.a) {
            return;
        }
        int iG = ((255 - ((int) (255.0f * aVar.g()))) & 255) << 24;
        int iA = class_267.a(aVar.e());
        int i6 = !z ? 18 : 6;
        int i7 = 3 * i6;
        this.ah.a(12 * i6);
        int iF = (int) (3.5f + aVar.f());
        int iJ = aVar.j();
        int iK = aVar.k() * (-1);
        int iL = aVar.l();
        if (z) {
            this.ah.a(rs.lpkg.c.b.b(iJ, iK, iL, iF, iG | JNINativeInterface.JNI_VERSION_10 | iA));
        } else {
            this.ah.a(rs.lpkg.c.b.a(iJ, iK, iL, iF, iG | JNINativeInterface.JNI_VERSION_10 | iA));
        }
        a(i6);
        d dVar = this.ak;
        u[0] = this.aw;
        u[1] = -1;
        u[2] = i7 / 3;
        u[3] = this.av;
        u[4] = 0 | i2;
        u[5] = i3 + Launcher.n().o().aL();
        u[6] = i4 + Launcher.n().o().aM();
        u[7] = i5 + Launcher.n().o().aN();
        dVar.a(8).a(u);
        this.aw += i7;
        this.av += i7;
    }

    private d a(int i2) {
        if (i2 < 512) {
            this.at++;
            return this.ak;
        }
        this.au++;
        return this.al;
    }

    private static void a(Runnable runnable) {
        runnable.run();
    }

    private int a(double d2, int i2) {
        return (int) ((((double) i2) * d2) + 0.5d);
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (j.a() == j.b) {
            GL43C.glViewport(i2, i3, i4, i5);
        } else {
            AffineTransform defaultTransform = b().getGraphicsConfiguration().getDefaultTransform();
            GL43C.glViewport(a(defaultTransform.getScaleX(), i2), a(defaultTransform.getScaleY(), i3), a(defaultTransform.getScaleX(), i4), a(defaultTransform.getScaleY(), i5));
        }
    }

    private void a(@Nonnull rs.lpkg.apkg.a aVar, int i2, @Nonnull IntBuffer intBuffer, int i3, long j2) {
        a(aVar, i2, intBuffer.remaining() << 2, i3, j2);
        GL43C.glBufferSubData(i2, 0L, intBuffer);
    }

    private void a(@Nonnull rs.lpkg.apkg.a aVar, int i2, @Nonnull FloatBuffer floatBuffer, int i3, long j2) {
        a(aVar, i2, floatBuffer.remaining() << 2, i3, j2);
        GL43C.glBufferSubData(i2, 0L, floatBuffer);
    }

    private void a(@Nonnull rs.lpkg.apkg.a aVar, int i2, int i3, int i4, long j2) {
        GL43C.glBindBuffer(i2, aVar.b);
        if (this.af.glInvalidateBufferData != 0) {
            GL43C.glInvalidateBufferData(aVar.b);
        }
        if (i3 > aVar.c) {
            int iMax = Math.max(1024, b(i3));
            m.trace("Buffer resize: {} {} -> {}", aVar, Integer.valueOf(aVar.c), Integer.valueOf(iMax));
            aVar.c = iMax;
            GL43C.glBufferData(i2, iMax, i4);
            a(aVar, j2);
        }
    }

    private static int b(int i2) {
        int i3 = i2 - 1;
        int i4 = i3 | (i3 >> 1);
        int i5 = i4 | (i4 >> 2);
        int i6 = i5 | (i5 >> 4);
        int i7 = i6 | (i6 >> 8);
        return (i7 | (i7 >> 16)) + 1;
    }

    private void a(rs.lpkg.apkg.a aVar, long j2) {
        if (this.v == a.c) {
            if (aVar.d != -1) {
                CL10.clReleaseMemObject(aVar.d);
            }
            if (aVar.c == 0) {
                aVar.d = -1L;
            } else {
                aVar.d = CL10GL.clCreateFromGLBuffer(this.p.a, j2, aVar.b, (int[]) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        String str;
        if (!m.isDebugEnabled()) {
            return;
        }
        while (true) {
            int iGlGetError = GL43C.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            switch (iGlGetError) {
                case 1280:
                    str = "INVALID_ENUM";
                    break;
                case 1281:
                    str = "INVALID_VALUE";
                    break;
                case 1282:
                    str = "INVALID_OPERATION";
                    break;
                case 1283:
                case 1284:
                case 1285:
                default:
                    str = iGlGetError;
                    break;
                case 1286:
                    str = "INVALID_FRAMEBUFFER_OPERATION";
                    break;
            }
            m.debug("glGetError:", (Throwable) new Exception(str));
        }
    }
}
