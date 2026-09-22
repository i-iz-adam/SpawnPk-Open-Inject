package rs.lpkg;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.class_190;
import rs.class_332;

/* JADX INFO: loaded from: client-final.jar:rs/l/q.class */
class q {
    private static final Logger b = LoggerFactory.getLogger((Class<?>) q.class);
    public static final int a = 128;

    q() {
    }

    int a() {
        if (!c()) {
            return -1;
        }
        class_190[] class_190VarArr = class_332.y;
        int iGlGenTextures = GL43C.glGenTextures();
        GL43C.glBindTexture(35866, iGlGenTextures);
        if (GL.getCapabilities().glTexStorage3D != 0) {
            GL43C.glTexStorage3D(35866, 8, 32856, 128, 128, class_190VarArr.length);
        } else {
            int i = 128;
            for (int i2 = 0; i2 < 8; i2++) {
                GL43C.glTexImage3D(35866, i2, 32856, i, i, class_190VarArr.length, 0, 6408, 5121, 0L);
                i /= 2;
            }
        }
        GL43C.glTexParameteri(35866, 10241, 9728);
        GL43C.glTexParameteri(35866, 10240, 9728);
        GL43C.glTexParameteri(35866, 10242, 33071);
        double dC = class_332.c();
        class_332.b(1.0d);
        b(iGlGenTextures);
        class_332.b(dC);
        GL43C.glActiveTexture(33985);
        GL43C.glBindTexture(35866, iGlGenTextures);
        GL43C.glGenerateMipmap(35866);
        GL43C.glActiveTexture(33984);
        return iGlGenTextures;
    }

    void a(int i, int i2) {
        GL43C.glBindTexture(35866, i);
        if (i2 == 0) {
            GL43C.glTexParameteri(35866, 10241, 9728);
        } else {
            GL43C.glTexParameteri(35866, 10241, 9986);
        }
        if (GL.getCapabilities().GL_EXT_texture_filter_anisotropic) {
            GL43C.glTexParameterf(35866, 34046, Math.max(1.0f, Math.min(GL43C.glGetFloat(34047), i2)));
        }
    }

    void a(int i) {
        GL43C.glDeleteTextures(i);
    }

    private boolean c() {
        class_190[] class_190VarArr = class_332.y;
        if (class_190VarArr == null || class_190VarArr.length == 0) {
            return false;
        }
        for (int i = 0; i < class_190VarArr.length; i++) {
            try {
                if (class_190VarArr[i] != null && class_332.d(i) == null) {
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    private void b(int i) {
        class_190[] class_190VarArr = class_332.y;
        GL43C.glBindTexture(35866, i);
        int i2 = 0;
        for (int i3 = 0; i3 < class_190VarArr.length; i3++) {
            if (class_190VarArr[i3] != null) {
                int[] iArrD = class_332.d(i3);
                if (iArrD == null) {
                    System.out.println("No pixels for texture " + i3 + "!");
                } else {
                    i2++;
                    byte[] bArrA = a(iArrD, 128, 128, 128, 128);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArrA.length);
                    byteBufferAllocateDirect.put(bArrA);
                    byteBufferAllocateDirect.flip();
                    GL43C.glTexSubImage3D(35866, 0, 0, 0, i3, 128, 128, 1, 6408, 5121, byteBufferAllocateDirect);
                }
            }
        }
        b.debug("Uploaded textures {}", Integer.valueOf(i2));
    }

    private static byte[] a(int[] iArr, int i, int i2, int i3, int i4) {
        byte[] bArr = new byte[i3 * i4 * 4];
        int i5 = 0;
        int i6 = 0;
        int i7 = (i3 - i) * 4;
        for (int i8 = 0; i8 < i2; i8++) {
            for (int i9 = 0; i9 < i; i9++) {
                int i10 = i6;
                i6++;
                int i11 = iArr[i10];
                if (i11 != 0) {
                    int i12 = i5;
                    int i13 = i5 + 1;
                    bArr[i12] = (byte) (i11 >> 16);
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) (i11 >> 8);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) i11;
                    i5 = i15 + 1;
                    bArr[i15] = -1;
                } else {
                    i5 += 4;
                }
            }
            i5 += i7;
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[LOOP:2: B:16:0x0061->B:21:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[SYNTHETIC] */
    float[] b() {
        int i;
        float f;
        float f2;
        class_190[] class_190VarArr = class_332.y;
        float[] fArr = new float[class_190VarArr.length * 2];
        for (int i2 = 0; i2 < class_190VarArr.length; i2++) {
            class_190 class_190Var = class_190VarArr[i2];
            if (class_190Var != null) {
                int iJ = 0;
                for (int i3 : Client.bJ) {
                    if (i2 == i3) {
                        iJ = class_190Var.j();
                        for (int i4 : Client.bK) {
                            if (i2 == i4) {
                                iJ = class_190Var.j();
                                f = 0.0f;
                                f2 = 0.0f;
                                switch (iJ) {
                                    case 1:
                                        f2 = -1.0f;
                                        break;
                                    case 2:
                                        f = -1.0f;
                                        break;
                                    case 3:
                                        f2 = 1.0f;
                                        break;
                                    case 4:
                                        f = 1.0f;
                                        break;
                                }
                                int i5 = class_190Var.i();
                                fArr[i2 * 2] = f * i5;
                                fArr[(i2 * 2) + 1] = f2 * i5;
                            }
                        }
                        f = 0.0f;
                        f2 = 0.0f;
                        switch (iJ) {
                            case 1:
                                f2 = -1.0f;
                                break;
                            case 2:
                                f = -1.0f;
                                break;
                            case 3:
                                f2 = 1.0f;
                                break;
                            case 4:
                                f = 1.0f;
                                break;
                        }
                        int i6 = class_190Var.i();
                        fArr[i2 * 2] = f * i6;
                        fArr[(i2 * 2) + 1] = f2 * i6;
                    }
                }
                while (i < r0) {
                    if (i2 == i4) {
                        iJ = class_190Var.j();
                        f = 0.0f;
                        f2 = 0.0f;
                        switch (iJ) {
                            case 1:
                                f2 = -1.0f;
                                break;
                            case 2:
                                f = -1.0f;
                                break;
                            case 3:
                                f2 = 1.0f;
                                break;
                            case 4:
                                f = 1.0f;
                                break;
                        }
                        int i7 = class_190Var.i();
                        fArr[i2 * 2] = f * i7;
                        fArr[(i2 * 2) + 1] = f2 * i7;
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                switch (iJ) {
                    case 1:
                        f2 = -1.0f;
                        break;
                    case 2:
                        f = -1.0f;
                        break;
                    case 3:
                        f2 = 1.0f;
                        break;
                    case 4:
                        f = 1.0f;
                        break;
                }
                int i8 = class_190Var.i();
                fArr[i2 * 2] = f * i8;
                fArr[(i2 * 2) + 1] = f2 * i8;
            }
        }
        return fArr;
    }
}
