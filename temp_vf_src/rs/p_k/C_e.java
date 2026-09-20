package rs.p_k;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.C_I_uc;
import rs.C_J_uc;
import rs.C_V_uc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_C_uc;
import rs.p_l.C_E_uc;

public class C_e {
   private static final Logger m = LoggerFactory.getLogger(C_e.class);
   public static boolean a = true;
   public static boolean b = false;
   public static final int c = 6144;
   public static final int d = 512;
   private static final int n = Integer.MIN_VALUE;
   public int e = 2;
   private final C_q o = new C_q();
   private final C_k p = new C_k();
   private final C_l q = new C_l();
   private final C_i r = new C_i();
   private final rs.p_k.p_b.C_f s = new rs.p_k.p_b.C_f();
   private AWTContext t;
   static final String f = "#version 420\n#extension GL_ARB_compute_shader : require\n#extension GL_ARB_shader_storage_buffer_object : require\n#extension GL_ARB_explicit_attrib_location : require\n";
   static final String g = "#version 430\n";
   static final C_m h = new C_m().a(35633, "vert.glsl").a(35632, "frag.glsl");
   static final C_m i = new C_m().a(37305, "comp.glsl");
   static final C_m j = new C_m().a(37305, "comp.glsl");
   static final C_m k = new C_m().a(37305, "comp_unordered.glsl");
   static final C_m l = new C_m().a(35633, "vertui.glsl").a(35632, "fragui.glsl");
   private static final int[] u = new int[8];
   private C_e.a v = C_e.a.a;
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
   private final C_a T = new C_a("scene vertex buffer");
   private final C_a U = new C_a("scene tex buffer");
   private final C_a V = new C_a("tmp vertex buffer");
   private final C_a W = new C_a("tmp tex buffer");
   private final C_a X = new C_a("model buffer large");
   private final C_a Y = new C_a("model buffer small");
   private final C_a Z = new C_a("model buffer unordered");
   private final C_a aa = new C_a("out vertex buffer");
   private final C_a ab = new C_a("out tex buffer");
   private int ac;
   private final C_a ad = new C_a("uniform buffer");
   private Callback ae;
   private GLCapabilities af;
   private C_d ag;
   private C_d ah;
   private C_c ai;
   private C_d aj;
   private C_d ak;
   private C_d al;
   private int am;
   private boolean an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private long as = 0L;
   private int at;
   private int au;
   private int av;
   private int aw;
   private int ax;
   private rs.p_k.p_a.C_a ay;
   private int az;
   private int aA;
   private int aB;
   private int aC;
   private int aD;
   private int aE;
   private int aF = -1;
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
   private boolean bg = false;

   public static boolean a() {
      return b;
   }

   public C_e() {
      this.c();
   }

   public Component b() {
      return C_Launcher_mc.n().o().B();
   }

   public void c() {
      try {
         this.P = this.Q = -1;
         this.av = 0;
         this.am = this.at = this.au = 0;
         AWTContext.loadNatives();
         synchronized (this.b().getTreeLock()) {
            if (!this.b().isValid()) {
               return;
            }

            this.t = new AWTContext(this.b());
            this.t.configurePixelFormat(0, 0, 0);
         }

         this.t.createGLContext();
         this.b().setIgnoreRepaint(true);
         this.v = C_j.a() == C_j.b ? C_e.a.c : C_e.a.b;
         Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.set("lwjgl-rl-" + System.getProperty("os.arch", "unknown"));
         this.af = GL.createCapabilities();
         m.info("Using device: {}", GL43C.glGetString(7937));
         m.info("Using driver: {}", GL43C.glGetString(7938));
         GLCapabilities var1 = GL.getCapabilities();
         if (!this.af.OpenGL31) {
            throw new RuntimeException("OpenGL 3.1 is required but not available");
         }

         if (!this.af.OpenGL43 && this.v == C_e.a.b) {
            m.info("disabling compute shaders because OpenGL 4.3 is not available");
            this.v = C_e.a.a;
         }

         if (this.v == C_e.a.a) {
            this.q.a();
         }

         this.bg = true;
         this.w();
         if (m.isDebugEnabled() && this.af.glDebugMessageControl != 0L) {
            this.ae = GLUtil.setupDebugMessageCallback();
            if (this.ae != null) {
               GL43C.glDebugMessageControl(33350, 33361, 4352, 131185, false);
               GL43C.glDebugMessageControl(33350, 33360, 4352, 131154, false);
            }
         }

         this.ag = new C_d();
         this.ah = new C_d();
         this.ai = new C_c();
         this.aj = new C_d();
         this.ak = new C_d();
         this.al = new C_d();
         this.e();
         this.m();

         try {
            this.j();
         } catch (C_n var3) {
            throw new RuntimeException(var3);
         }

         this.q();
         this.s();
         this.o();
         b = true;
         this.aB = this.aC = -1;
         this.aD = this.aE = -1;
         this.ay = null;
         this.aF = -1;
         this.ac = -1;
         if (C_Launcher_mc.n().o().fc) {
            a(new C_f(this));
         }

         this.w();
      } catch (Throwable var5) {
         m.error("Error starting GPU plugin", var5);
         this.d();
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

            this.b(this.ad);
            this.p();
            this.r();
            this.l();
            this.n();
            this.t();
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

   public static void a(boolean var0) {
      C_Launcher_mc.n().o().hG = C_Launcher_mc.n().o().B().getGraphics();
      C_Launcher_mc.n().o().B().setIgnoreRepaint(var0);
      C_Launcher_mc.n().o().F();
      C_Launcher_mc.n().o().a(rs.p_f.C_a.ai);
      C_Launcher_mc.n().o().b(true);
      C_Launcher_mc.n().o().h();
      C_Launcher_mc.n().o().repaint();
   }

   public void e() {
      boolean var1 = true;
      byte var2 = 0;
      switch (C_b.d) {
         case b:
            var2 = 1;
            break;
         case a:
            var2 = 0;
            break;
         case c:
            var2 = -1;
      }

      int var3 = this.t.setSwapInterval(var2);
      if (var3 != var2) {
         m.info("unsupported swap interval {}, got {}", Integer.valueOf(var2), var3);
      }

      this.w();
   }

   private rs.p_k.p_d.C_a b(int var1, int var2) {
      String var3 = C_j.a() == C_j.c
         ? "#version 420\n#extension GL_ARB_compute_shader : require\n#extension GL_ARB_shader_storage_buffer_object : require\n#extension GL_ARB_explicit_attrib_location : require\n"
         : "#version 430\n";
      rs.p_k.p_d.C_a var4 = new rs.p_k.p_d.C_a();
      var4.a(var3x -> {
         if ("version_header".equals(var3x)) {
            return var3;
         } else {
            return "thread_config".equals(var3x) ? "#define THREAD_COUNT " + var1 + "\n#define FACES_PER_THREAD " + var2 + "\n" : null;
         }
      });
      var4.a(C_e.class);
      return var4;
   }

   private void j() {
      rs.p_k.p_d.C_a var1 = this.b(-1, -1);
      this.x = h.a(var1);
      this.K = l.a(var1);
      if (this.v == C_e.a.b) {
         this.B = i.a(this.b(1024, 6));
         this.D = j.a(this.b(512, 1));
         this.F = k.a(var1);
      } else if (this.v == C_e.a.c) {
         this.p.a(this.t);
      }

      this.k();
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
      if (this.v == C_e.a.b) {
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
      FloatBuffer var1 = C_c.b(20);
      var1.put(new float[]{1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 1.0F, -1.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F});
      var1.rewind();
      GL43C.glBindBuffer(34962, this.O);
      GL43C.glBufferData(34962, var1, 35044);
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
      this.a(this.T);
      this.a(this.U);
      this.a(this.V);
      this.a(this.W);
      this.a(this.X);
      this.a(this.Y);
      this.a(this.Z);
      this.a(this.aa);
      this.a(this.ab);
   }

   private void a(C_a var1) {
      var1.b = GL43C.glGenBuffers();
   }

   private void p() {
      this.b(this.T);
      this.b(this.U);
      this.b(this.V);
      this.b(this.W);
      this.b(this.X);
      this.b(this.Y);
      this.b(this.Z);
      this.b(this.aa);
      this.b(this.ab);
   }

   private void b(C_a var1) {
      if (var1.b != -1) {
         GL43C.glDeleteBuffers(var1.b);
         var1.b = -1;
      }

      var1.c = -1;
      if (var1.d != -1L) {
         var1.d = -1L;
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
      this.a(this.ad);
      IntBuffer var1 = C_d.b(8200);
      var1.put(new int[8]);
      int[] var2 = new int[2];

      for (int var3 = 0; var3 < 2048; var3++) {
         var1.put(rs.p_runelite.p_a.C_h.e[var3]);
         var1.put(rs.p_runelite.p_a.C_h.f[var3]);
         var1.put(var2);
      }

      var1.flip();
      this.a(this.ad, 35345, var1, 35048, 4L);
      GL43C.glBindBuffer(35345, 0);
   }

   private void a(int var1, int var2, int var3) {
      if (C_j.a() != C_j.b) {
         GraphicsConfiguration var4 = this.b().getGraphicsConfiguration();
         AffineTransform var5 = var4.getDefaultTransform();
         var1 = this.a(var5.getScaleX(), var1);
         var2 = this.a(var5.getScaleY(), var2);
      }

      this.P = GL43C.glGenFramebuffers();
      GL43C.glBindFramebuffer(36160, this.P);
      this.Q = GL43C.glGenRenderbuffers();
      GL43C.glBindRenderbuffer(36161, this.Q);
      GL43C.glRenderbufferStorageMultisample(36161, var3, 6408, var1, var2);
      GL43C.glFramebufferRenderbuffer(36160, 36064, 36161, this.Q);
      int var6 = GL43C.glCheckFramebufferStatus(36160);
      if (var6 != 36053) {
         throw new RuntimeException("FBO is incomplete. status: " + var6);
      } else {
         GL43C.glBindFramebuffer(36160, this.t.getFramebuffer(false));
         GL43C.glBindRenderbuffer(36161, 0);
      }
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

   private float[] a(float var1, float var2, float var3) {
      return new float[]{2.0F / var1, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F / var2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -2.0F * var3, 0.0F};
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.b(var1, var2, var3, var4, var5, var6);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aG = C_Launcher_mc.n().o().al();
      this.aH = C_Launcher_mc.n().o().am();
      this.aI = C_Launcher_mc.n().o().an();
      this.aJ = C_Launcher_mc.n().o().ao();
      this.ah.b();
      this.ah.a(32);
      IntBuffer var7 = this.ah.c();
      var7.put(this.aI)
         .put(this.aJ)
         .put(this.aG)
         .put(this.aH)
         .put(C_Launcher_mc.n().o().aL())
         .put(C_Launcher_mc.n().o().aN())
         .put(C_Launcher_mc.n().o().aO())
         .put(C_Launcher_mc.n().o().aP());
      var7.flip();
      GL43C.glBindBuffer(35345, this.ad.b);
      GL43C.glBufferSubData(35345, 0L, var7);
      GL43C.glBindBuffer(35345, 0);
      GL43C.glBindBufferBase(35345, 0, this.ad.b);
      var7.clear();
   }

   public void f() {
      this.u();
   }

   private void u() {
   }

   public void a(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      C_J_uc var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15
   ) {
      if (this.v == C_e.a.a) {
         this.av = this.av + this.q.a(var9, var10, var11, var12, this.ah, this.ai, 128 * var11, 128 * var12, true);
      } else if (var9.f() > 0) {
         int var16 = var11 * 128;
         boolean var17 = false;
         int var18 = var12 * 128;
         C_d var19 = this.aj;
         this.am++;
         var19.a(8);
         IntBuffer var20 = var19.c();
         var20.put(var9.g());
         var20.put(var9.h());
         var20.put(2);
         var20.put(this.av);
         var20.put(Integer.MIN_VALUE);
         var20.put(var16).put(0).put(var18);
         this.av += 6;
      }
   }

   public void a(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      C_I_uc var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15
   ) {
      if (var9.a() > 0) {
         var6 = var11 * 128;
         byte var19 = 0;
         var8 = var12 * 128;
         C_d var16 = this.aj;
         this.am++;
         var16.a(8);
         IntBuffer var17 = var16.c();
         var17.put(var9.b());
         var17.put(var9.c());
         var17.put(var9.a() / 3);
         var17.put(this.av);
         var17.put(Integer.MIN_VALUE);
         var17.put(var6).put(var19).put(var8);
         this.av = this.av + var9.a();
      }
   }

   public void g() {
      this.a(1, true);
   }

   public void b(boolean var1) {
      this.a(1, var1);
   }

   public void a(int var1, boolean var2) {
      int var3 = C_Launcher_mc.n().o().aw();
      int var4 = C_Launcher_mc.n().o().av();
      int var5 = C_Launcher_mc.n().o().as() + 5;
      int var6 = C_Launcher_mc.n().o().at() + 5;
      rs.p_k.p_a.C_a var7 = C_b.b;
      boolean var8 = var7 != rs.p_k.p_a.C_a.a;
      this.c(var4, var3);
      if (var8) {
         GL43C.glEnable(32925);
         Dimension var9 = C_Launcher_mc.n().o().aF();
         int var10 = C_Launcher_mc.n().o().ax() ? var9.width : var4;
         int var11 = C_Launcher_mc.n().o().ax() ? var9.height : var3;
         if (this.aD != var10 || this.aE != var11 || this.ay != var7) {
            this.t();
            GL43C.glBindFramebuffer(36160, this.t.getFramebuffer(false));
            int var12 = GL43C.glGetInteger(32937);
            int var13 = GL43C.glGetInteger(36183);
            int var14 = var12 != 0 ? var12 : Math.min(var7.a(), var13);
            m.debug("AA samples: {}, max samples: {}, forced samples: {}", new Object[]{var14, var13, var12});
            this.a(var10, var11, var14);
            this.aD = var10;
            this.aE = var11;
         }

         GL43C.glBindFramebuffer(36009, this.P);
      } else {
         GL43C.glDisable(32925);
         this.t();
      }

      this.ay = var7;
      if (this.v == C_e.a.a) {
         this.ah.a();
         this.ai.a();
         IntBuffer var24 = this.ah.c();
         FloatBuffer var27 = this.ai.c();
         this.a(this.V, 34962, var24, 35048, 0L);
         this.a(this.W, 34962, var27, 35048, 0L);
         this.w();
      } else {
         this.ah.a();
         this.ai.a();
         this.al.a();
         this.ak.a();
         this.aj.a();
         IntBuffer var25 = this.ah.c();
         FloatBuffer var28 = this.ai.c();
         IntBuffer var30 = this.al.c();
         IntBuffer var34 = this.ak.c();
         IntBuffer var37 = this.aj.c();
         this.a(this.V, 34962, var25, 35048, 4L);
         this.a(this.W, 34962, var28, 35048, 4L);
         this.a(this.X, 34962, var30, 35048, 4L);
         this.a(this.Y, 34962, var34, 35048, 4L);
         this.a(this.Z, 34962, var37, 35048, 4L);
         this.a(this.aa, 34962, this.av * 16, 35040, 2L);
         this.a(this.ab, 34962, this.av * 16, 35040, 2L);
         if (this.v == C_e.a.c) {
            this.p.a(this.am, this.at, this.au, this.T, this.U, this.V, this.W, this.Z, this.Y, this.X, this.aa, this.ab, this.ad);
         } else if (this.v == C_e.a.b) {
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
            this.w();
         }
      }

      int var26 = C_Launcher_mc.n().o().ak();
      C_Client_mc var29 = C_Launcher_mc.n().o();
      if (var2) {
         GL43C.glClearColor((float)(var26 >> 16 & 0xFF) / 255.0F, (float)(var26 >> 8 & 0xFF) / 255.0F, (float)(var26 & 0xFF) / 255.0F, 1.0F);
         GL43C.glClear(16384);
      }

      if (this.R != -1) {
         if (this.ac == -1) {
            this.ac = this.o.a();
            if (this.ac > -1) {
               float[] var31 = this.o.b();
               GL43C.glUseProgram(this.x);
               GL43C.glUniform2fv(this.aY, var31);
               GL43C.glUseProgram(0);
            }
         }

         int var32 = 0;
         int var35 = 0;
         int var38 = var3;
         int var40 = var5;
         int var15 = var6;
         this.e = C_b.c;
         if (this.ac != -1 && this.aF != this.e) {
            this.o.a(this.ac, this.e);
            this.aF = this.e;
         }

         if (C_Launcher_mc.n().o().ax()) {
            Dimension var16 = C_Launcher_mc.n().o().aF();
            var38 = var16.height;
            double var17 = var16.getHeight() / (double)var3;
            double var19 = var16.getWidth() / (double)var4;
            boolean var21 = true;
            var40 = (int)Math.ceil(var17 * (double)var5) + 2;
            var15 = (int)Math.ceil(var19 * (double)var6) + 2;
            var32 = (int)Math.floor(var17 * (double)var32) - 1;
            var35 = (int)Math.floor(var19 * (double)var35) - 1;
         }

         int var42 = var29.ae();
         if (var42 > 1) {
            var42++;
         }

         this.a(var35 + var42, var38 - var40 - var32, var15, var40);
         GL43C.glUseProgram(this.x);
         this.w();
         int var43 = C_V_uc.e;
         boolean var18 = false;
         GL43C.glUniform1i(this.aM, 0);
         GL43C.glUniform4f(this.aN, (float)(var26 >> 16 & 0xFF) / 255.0F, (float)(var26 >> 8 & 0xFF) / 255.0F, (float)(var26 & 0xFF) / 255.0F, 1.0F);
         GL43C.glUniform1i(this.aO, 0);
         GL43C.glUniform1i(this.aP, var43 * 128);
         boolean var44 = true;
         boolean var20 = C_b.f;
         GL43C.glUniform1f(this.aR, (float)C_E_uc.c());
         GL43C.glUniform1f(this.bc, var20 ? 0.0F : 1.0F);
         GL43C.glUniform1i(this.aK, C_b.e.ordinal());
         GL43C.glUniform1f(this.bd, var44 ? 1.25F : 0.0F);
         int var10000 = this.be;
         C_Launcher_mc.n().o();
         GL43C.glUniform1i(var10000, C_Client_mc.ff);
         float[] var45 = C_h.a((float)C_Launcher_mc.n().o().aL(), (float)C_Launcher_mc.n().o().aL(), 1.0F);
         C_h.a(var45, C_h.c((float)var6, (float)var5, 50.0F));
         C_h.a(var45, C_h.a((float)(-(Math.PI - (double)this.aJ * 0.0030679615757712823))));
         C_h.a(var45, C_h.b((float)((double)this.aI * 0.0030679615757712823)));
         C_h.a(var45, C_h.b((float)(-C_Launcher_mc.n().o().aN()), (float)(-C_Launcher_mc.n().o().aO()), (float)(-C_Launcher_mc.n().o().aP())));
         GL43C.glUniformMatrix4fv(this.aQ, false, var45);
         GL43C.glUniformBlockBinding(this.x, this.bb, 0);
         GL43C.glUniform1i(this.aX, 1);
         GL43C.glEnable(2884);
         GL43C.glEnable(3042);
         GL43C.glBlendFuncSeparate(770, 771, 1, 1);
         GL43C.glBindVertexArray(this.H);
         int var22;
         int var23;
         if (this.v != C_e.a.a) {
            if (this.v == C_e.a.b) {
               GL43C.glMemoryBarrier(8192);
            } else {
               this.p.b();
            }

            var22 = this.aa.b;
            var23 = this.ab.b;
         } else {
            var22 = this.V.b;
            var23 = this.W.b;
         }

         GL43C.glEnableVertexAttribArray(0);
         GL43C.glBindBuffer(34962, var22);
         GL43C.glVertexAttribIPointer(0, 4, 5124, 0, 0L);
         GL43C.glEnableVertexAttribArray(1);
         GL43C.glBindBuffer(34962, var23);
         GL43C.glVertexAttribPointer(1, 4, 5126, false, 0, 0L);
         GL43C.glDrawArrays(4, 0, this.av);
         GL43C.glDisable(3042);
         GL43C.glDisable(2884);
         GL43C.glUseProgram(0);
         this.w();
      }

      if (var8) {
         int var33 = this.aD;
         int var36 = this.aE;
         if (C_j.a() != C_j.b) {
            GraphicsConfiguration var39 = this.b().getGraphicsConfiguration();
            AffineTransform var41 = var39.getDefaultTransform();
            var33 = this.a(var41.getScaleX(), var33);
            var36 = this.a(var41.getScaleY(), var36);
         }

         GL43C.glBindFramebuffer(36008, this.P);
         GL43C.glBindFramebuffer(36009, this.t.getFramebuffer(false));
         GL43C.glBlitFramebuffer(0, 0, var33, var36, 0, 0, var33, var36, 16384, 9728);
         GL43C.glBindFramebuffer(36008, this.t.getFramebuffer(false));
      }

      this.ah.b();
      this.ai.b();
      this.al.b();
      this.ak.b();
      this.aj.b();
      this.at = this.au = this.am = 0;
      this.aw = 0;
      this.ax = 0;
      rs.p_k.p_b.C_g.a();
      this.a(var3, var4);
      this.w();
      this.t.swapBuffers();
      this.w();
      this.av = 0;
      this.w();
      if (++this.as > 5L && !rs.p_f.C_a.Q) {
         rs.p_f.C_a.Q = true;
         rs.p_f.C_a.d();
      }
   }

   public void h() {
      this.aB = this.aC = -1;
      this.aD = this.aE = -1;
   }

   private void c(int var1, int var2) {
      C_Client_mc var3 = C_Launcher_mc.n().o();
      if (var1 != this.aB || var2 != this.aC) {
         this.aB = var1;
         this.aC = var2;
         GL43C.glBindBuffer(35052, this.J);
         GL43C.glBufferData(35052, (long)(var1 * var2) * 4L, 35040);
         GL43C.glBindBuffer(35052, 0);
         GL43C.glBindTexture(3553, this.I);
         GL43C.glTexImage2D(3553, 0, 6408, var1, var2, 0, 32993, 5121, 0L);
         GL43C.glBindTexture(3553, 0);
      }

      C_C_uc[] var4 = new C_C_uc[]{var3.gZ};
      int[] var5 = new int[]{0};
      int[] var6 = new int[]{0};
      boolean var7 = rs.p_f.C_a.ai == rs.p_f.C_a.c.b;

      for (int var8 = 0; var8 < var4.length; var8++) {
         int[] var9 = var4[var8].b();
         int var10 = var4[var8].c();
         int var11 = var4[var8].d();
         GL43C.glBindBuffer(35052, this.J);
         GL43C.glMapBuffer(35052, 35001).asIntBuffer().put(var9, 0, var10 * var11);
         GL43C.glUnmapBuffer(35052);
         GL43C.glBindTexture(3553, this.I);
         GL43C.glTexSubImage2D(3553, 0, var5[var8], var6[var8], var10, var11, 32993, 33639, 0L);
         GL43C.glBindBuffer(35052, 0);
         GL43C.glBindTexture(3553, 0);
      }
   }

   public void a(int var1, int var2) {
      boolean var3 = false;
      GL43C.glEnable(3042);
      GL43C.glBlendFunc(1, 771);
      GL43C.glBindTexture(3553, this.I);
      int var4 = C_b.k;
      if (!C_Launcher_mc.n().o().ay()) {
         var4 = 2;
      }

      int var5 = C_b.e.ordinal();
      GL43C.glUseProgram(this.K);
      GL43C.glUniform1i(this.aS, 0);
      GL43C.glUniform1i(this.aT, var4);
      GL43C.glUniform2i(this.aU, var2, var1);
      GL43C.glUniform1i(this.aL, var5);
      GL43C.glUniform4f(this.aW, 0.0F, 0.0F, 0.0F, 0.0F);
      C_Client_mc var6 = C_Launcher_mc.n().o();
      if (var6.ax()) {
         Dimension var7 = var6.aF();
         int var8 = var6.ae();
         this.a(var8, 0, var7.width, var7.height);
         GL43C.glUniform2i(this.aV, var7.width, var7.height);
      } else {
         this.a(0, this.v == C_e.a.c && rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 2 : 0, var2, var1);
         GL43C.glUniform2i(this.aV, var2, var1);
      }

      if (C_Launcher_mc.n().o().ax()) {
         short var9 = 9728;
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
      if (!C_Launcher_mc.n().o().fc) {
         System.out.println("Shutting down..");
         this.d();
      } else {
         this.v();
      }
   }

   private void v() {
      this.ah.b();
      this.ai.b();
      this.q.a(C_Launcher_mc.n().o().dF, this.ah, this.ai);
      this.ah.a();
      this.ai.a();
      IntBuffer var1 = this.ah.c();
      FloatBuffer var2 = this.ai.c();
      this.a(this.T, 34962, var1, 35046, 4L);
      this.a(this.U, 34962, var2, 35046, 4L);
      GL43C.glBindBuffer(34962, 0);
      var1.clear();
      var2.clear();
   }

   public void a(rs.p_a.C_h var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
      if (var1 != null && var1.ah != 0) {
         if (this.v == C_e.a.a) {
            if (var1 != null) {
            }
         } else {
            if (var1.r() == this.q.b) {
               int var12 = Math.min(6144, var1.ah);
               int var13 = var1.s();
               C_d var14 = this.a(var12);
               var14.a(8);
               IntBuffer var15 = var14.c();
               u[0] = var1.t();
               u[1] = var13;
               u[2] = var12;
               u[3] = this.av;
               u[4] = -2147483648 | var1.v() << 12 | var2;
               u[5] = var7 + C_Launcher_mc.n().o().aN();
               u[6] = var8 + C_Launcher_mc.n().o().aO();
               u[7] = var9 + C_Launcher_mc.n().o().aP();
               var15.put(u);
               this.av += var12 * 3;
            } else {
               boolean var19 = a && (var1.Y != null || var1.d());
               int var20 = Math.min(6144, var1.ah);
               this.ah.a(12 * var20);
               this.ai.a(12 * var20);
               int var21 = 0;
               u[3] = this.av;
               u[4] = var1.v() << 12 | var2;
               u[5] = var7 + C_Launcher_mc.n().o().aN();
               u[6] = var8 + C_Launcher_mc.n().o().aO();
               u[7] = var9 + C_Launcher_mc.n().o().aP();
               Object var23 = null;
               byte var16 = -1;
               var21 = this.r.a(var1, this.ah, this.ai, var10);
               int var17 = var1.ah;
               int var18 = var19 ? this.ax : -1;
               u[0] = this.aw;
               u[1] = var19 ? var18 : -1;
               u[2] = var21 / 3;
               this.a(var21 / 3).a(8).a(u);
               this.aw += var21;
               if (var19) {
                  this.ax += var21;
               }

               this.av += var21;
            }
         }
      }
   }

   private boolean a(rs.p_a.C_h var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      C_Client_mc var9 = C_Launcher_mc.n().o();
      int var10 = var1.u();
      int var11 = var1.g;
      int var12 = var9.aM();
      int var13 = var1.g;
      int var14 = rs.p_l.C_c.n;
      int var15 = rs.p_l.C_c.n * -1;
      int var16 = rs.p_l.C_c.o * -1;
      int var17 = rs.p_l.C_c.o;
      int var18 = var5 * var8 - var4 * var6 >> 16;
      int var19 = var2 * var7 + var3 * var18 >> 16;
      int var20 = var3 * var10 >> 16;
      int var21 = var19 + var20;
      if (var21 > 50) {
         int var22 = var8 * var4 + var5 * var6 >> 16;
         int var23 = (var22 - var10) * var12;
         if (var23 / var21 < var14) {
            int var24 = (var22 + var10) * var12;
            if (var24 / var21 > var15) {
               int var25 = var3 * var7 - var18 * var2 >> 16;
               int var26 = var2 * var10 >> 16;
               int var27 = (var3 * var11 >> 16) + var26;
               int var28 = (var25 + var27) * var12;
               if (var28 / var21 > var16) {
                  int var29 = (var3 * var13 >> 16) + var26;
                  int var30 = (var25 - var29) * var12;
                  return var30 / var21 < var17;
               }
            }
         }
      }

      return false;
   }

   public void a(rs.p_k.p_c.C_a var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.v != C_e.a.a) {
         int var7 = 655360;
         int var8 = 255 - (int)(255.0F * var1.g());
         int var9 = (var8 & 0xFF) << 24;
         int var10 = rs.p_l.C_f.a(var1.e());
         int var11 = !var6 ? 18 : 6;
         int var12 = 3 * var11;
         this.ah.a(12 * var11);
         int var13 = (int)(3.5F + var1.f());
         int var14 = var1.j();
         int var15 = var1.k() * -1;
         int var16 = var1.l();
         if (var6) {
            this.ah.a(rs.p_k.p_c.C_b.b(var14, var15, var16, var13, var9 | var7 | var10));
         } else {
            this.ah.a(rs.p_k.p_c.C_b.a(var14, var15, var16, var13, var9 | var7 | var10));
         }

         C_d var17 = this.a(var11);
         var17 = this.ak;
         u[0] = this.aw;
         u[1] = -1;
         u[2] = var12 / 3;
         u[3] = this.av;
         u[4] = 0 | var2;
         u[5] = var3 + C_Launcher_mc.n().o().aN();
         u[6] = var4 + C_Launcher_mc.n().o().aO();
         u[7] = var5 + C_Launcher_mc.n().o().aP();
         var17.a(8).a(u);
         this.aw += var12;
         this.av += var12;
      }
   }

   private C_d a(int var1) {
      if (var1 < 512) {
         this.at++;
         return this.ak;
      } else {
         this.au++;
         return this.al;
      }
   }

   private static void a(Runnable var0) {
      var0.run();
   }

   private int a(double var1, int var3) {
      return (int)((double)var3 * var1 + 0.5);
   }

   private void a(int var1, int var2, int var3, int var4) {
      if (C_j.a() == C_j.b) {
         GL43C.glViewport(var1, var2, var3, var4);
      } else {
         GraphicsConfiguration var5 = this.b().getGraphicsConfiguration();
         AffineTransform var6 = var5.getDefaultTransform();
         GL43C.glViewport(this.a(var6.getScaleX(), var1), this.a(var6.getScaleY(), var2), this.a(var6.getScaleX(), var3), this.a(var6.getScaleY(), var4));
      }
   }

   private void a(@Nonnull C_a var1, int var2, @Nonnull IntBuffer var3, int var4, long var5) {
      int var7 = var3.remaining() << 2;
      this.a(var1, var2, var7, var4, var5);
      GL43C.glBufferSubData(var2, 0L, var3);
   }

   private void a(@Nonnull C_a var1, int var2, @Nonnull FloatBuffer var3, int var4, long var5) {
      int var7 = var3.remaining() << 2;
      this.a(var1, var2, var7, var4, var5);
      GL43C.glBufferSubData(var2, 0L, var3);
   }

   private void a(@Nonnull C_a var1, int var2, int var3, int var4, long var5) {
      GL43C.glBindBuffer(var2, var1.b);
      if (this.af.glInvalidateBufferData != 0L) {
         GL43C.glInvalidateBufferData(var1.b);
      }

      if (var3 > var1.c) {
         int var7 = Math.max(1024, b(var3));
         m.trace("Buffer resize: {} {} -> {}", new Object[]{var1, var1.c, var7});
         var1.c = var7;
         GL43C.glBufferData(var2, (long)var7, var4);
         this.a(var1, var5);
      }
   }

   private static int b(int var0) {
      var0 = --var0 | var0 >> 1;
      var0 |= var0 >> 2;
      var0 |= var0 >> 4;
      var0 |= var0 >> 8;
      var0 |= var0 >> 16;
      return var0 + 1;
   }

   private void a(C_a var1, long var2) {
      if (this.v == C_e.a.c) {
         if (var1.d != -1L) {
            CL10.clReleaseMemObject(var1.d);
         }

         if (var1.c == 0) {
            var1.d = -1L;
         } else {
            var1.d = CL10GL.clCreateFromGLBuffer(this.p.a, var2, var1.b, (int[])null);
         }
      }
   }

   private void w() {
      if (m.isDebugEnabled()) {
         while (true) {
            int var1 = GL43C.glGetError();
            if (var1 == 0) {
               return;
            }

            String var2;
            switch (var1) {
               case 1280:
                  var2 = "INVALID_ENUM";
                  break;
               case 1281:
                  var2 = "INVALID_VALUE";
                  break;
               case 1282:
                  var2 = "INVALID_OPERATION";
                  break;
               case 1283:
               case 1284:
               case 1285:
               default:
                  var2 = var1 + "";
                  break;
               case 1286:
                  var2 = "INVALID_FRAMEBUFFER_OPERATION";
            }

            m.debug("glGetError:", new Exception(var2));
         }
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
