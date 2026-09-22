package rs.lpkg;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import javax.inject.Singleton;
import net.runelite.rlawt.AWTContext;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opencl.APPLEGLSharing;
import org.lwjgl.opencl.CL;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL10GL;
import org.lwjgl.opencl.CL11;
import org.lwjgl.opencl.CL12;
import org.lwjgl.opencl.CLCapabilities;
import org.lwjgl.opencl.CLContextCallback;
import org.lwjgl.opencl.CLProgramCallbackI;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.linux.liburing.LibIOURing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/l/k.class */
@Singleton
class k {
    private static final Logger b = LoggerFactory.getLogger((Class<?>) k.class);
    private static final String c = "computeUnordered";
    private static final String d = "computeLarge";
    private static final int e = 256;
    private static final int f = 512;
    private static final int g = 6144;
    private static final int h = 43;
    private boolean i;
    private int j;
    private int k;
    private long l = -1;
    long a;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;

    k() {
    }

    void a(AWTContext aWTContext) {
        CL.create();
        this.i = true;
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            if (j.a() == j.b) {
                b(aWTContext, memoryStackStackPush);
            } else {
                a(aWTContext, memoryStackStackPush);
            }
            c();
            d();
            a(memoryStackStackPush);
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void a() {
        if (this.i) {
            try {
                CL12.clReleaseKernel(this.q);
                CL12.clReleaseKernel(this.r);
                CL12.clReleaseKernel(this.s);
                CL12.clReleaseProgram(this.n);
                CL12.clReleaseProgram(this.o);
                CL12.clReleaseProgram(this.p);
                CL12.clReleaseCommandQueue(this.m);
                CL12.clReleaseContext(this.a);
                CL12.clReleaseDevice(this.l);
                CL.destroy();
            } finally {
                CL.destroy();
                this.i = false;
            }
        }
    }

    private void a(AWTContext aWTContext, MemoryStack memoryStack) {
        IntBuffer intBufferMallocInt = memoryStack.mallocInt(1);
        a(CL11.clGetPlatformIDs((PointerBuffer) null, intBufferMallocInt));
        if (intBufferMallocInt.get(0) == 0) {
            throw new RuntimeException("No OpenCL platforms found.");
        }
        PointerBuffer pointerBufferMallocPointer = memoryStack.mallocPointer(intBufferMallocInt.get(0));
        a(CL11.clGetPlatformIDs(pointerBufferMallocPointer, (IntBuffer) null));
        PointerBuffer pointerBufferMallocPointer2 = memoryStack.mallocPointer(7);
        if (j.a() == j.a) {
            pointerBufferMallocPointer2.put(4228L).put(0L).put(8200L).put(aWTContext.getGLContext()).put(8203L).put(aWTContext.getWGLHDC()).put(0L).flip();
        } else {
            if (j.a() != j.c) {
                throw new RuntimeException("unsupported platform");
            }
            pointerBufferMallocPointer2.put(4228L).put(0L).put(8200L).put(aWTContext.getGLContext()).put(8202L).put(aWTContext.getGLXDisplay()).put(0L).flip();
        }
        for (int i = 0; i < pointerBufferMallocPointer.capacity(); i++) {
            long j = pointerBufferMallocPointer.get(i);
            pointerBufferMallocPointer2.put(1, j);
            try {
                CLCapabilities cLCapabilitiesCreatePlatformCapabilities = CL.createPlatformCapabilities(j);
                b.debug("Platform profile: {}", a(j, 2304));
                b.debug("Platform version: {}", a(j, 2305));
                b.debug("Platform name: {}", a(j, CL10.CL_PLATFORM_NAME));
                b.debug("Platform vendor: {}", a(j, CL10.CL_PLATFORM_VENDOR));
                b.debug("Platform extensions: {}", a(j, CL10.CL_PLATFORM_EXTENSIONS));
                a(CL11.clGetDeviceIDs(j, 4L, (PointerBuffer) null, intBufferMallocInt));
                PointerBuffer pointerBufferMallocPointer3 = memoryStack.mallocPointer(intBufferMallocInt.get(0));
                a(CL11.clGetDeviceIDs(j, 4L, pointerBufferMallocPointer3, (IntBuffer) null));
                for (int i2 = 0; i2 < pointerBufferMallocPointer3.capacity(); i2++) {
                    long j2 = pointerBufferMallocPointer3.get(i2);
                    try {
                        CLCapabilities cLCapabilitiesCreateDeviceCapabilities = CL.createDeviceCapabilities(j2, cLCapabilitiesCreatePlatformCapabilities);
                        b.debug("Device id {}", Long.valueOf(j2));
                        b.debug("\tCL_DEVICE_NAME: {}", e(j2, CL10.CL_DEVICE_NAME));
                        b.debug("\tCL_DEVICE_VENDOR: {}", e(j2, CL10.CL_DEVICE_VENDOR));
                        b.debug("\tCL_DRIVER_VERSION: {}", e(j2, CL10.CL_DRIVER_VERSION));
                        b.debug("\tCL_DEVICE_PROFILE: {}", e(j2, CL10.CL_DEVICE_PROFILE));
                        b.debug("\tCL_DEVICE_VERSION: {}", e(j2, CL10.CL_DEVICE_VERSION));
                        b.debug("\tCL_DEVICE_EXTENSIONS: {}", e(j2, 4144));
                        b.debug("\tCL_DEVICE_TYPE: {}", Long.valueOf(b(j2, 4096)));
                        b.debug("\tCL_DEVICE_VENDOR_ID: {}", Integer.valueOf(c(j2, 4097)));
                        b.debug("\tCL_DEVICE_MAX_COMPUTE_UNITS: {}", Integer.valueOf(c(j2, CL10.CL_DEVICE_MAX_COMPUTE_UNITS)));
                        b.debug("\tCL_DEVICE_MAX_WORK_ITEM_DIMENSIONS: {}", Integer.valueOf(c(j2, 4099)));
                        b.debug("\tCL_DEVICE_MAX_WORK_GROUP_SIZE: {}", Long.valueOf(d(j2, 4100)));
                        b.debug("\tCL_DEVICE_MAX_CLOCK_FREQUENCY: {}", Integer.valueOf(c(j2, CL10.CL_DEVICE_MAX_CLOCK_FREQUENCY)));
                        b.debug("\tCL_DEVICE_ADDRESS_BITS: {}", Integer.valueOf(c(j2, CL10.CL_DEVICE_ADDRESS_BITS)));
                        b.debug("\tCL_DEVICE_AVAILABLE: {}", Boolean.valueOf(c(j2, CL10.CL_DEVICE_AVAILABLE) != 0));
                        b.debug("\tCL_DEVICE_COMPILER_AVAILABLE: {}", Boolean.valueOf(c(j2, CL10.CL_DEVICE_COMPILER_AVAILABLE) != 0));
                        if (cLCapabilitiesCreateDeviceCapabilities.cl_khr_gl_sharing || cLCapabilitiesCreateDeviceCapabilities.cl_APPLE_gl_sharing) {
                            IntBuffer intBufferCallocInt = memoryStack.callocInt(1);
                            long jClCreateContext = CL11.clCreateContext(pointerBufferMallocPointer2, j2, CLContextCallback.create((j3, j4, j5, j6) -> {
                                b.error("[LWJGL] cl_context_callback: {}", MemoryUtil.memUTF8(j3));
                            }), 0L, intBufferCallocInt);
                            a(intBufferCallocInt);
                            this.l = j2;
                            this.a = jClCreateContext;
                            return;
                        }
                    } catch (Exception e2) {
                        b.error("error checking device", (Throwable) e2);
                    }
                }
            } catch (Exception e3) {
                b.error("error checking platform", (Throwable) e3);
            }
        }
        throw new RuntimeException("Unable to find compute platform");
    }

    private void b(AWTContext aWTContext, MemoryStack memoryStack) {
        PointerBuffer pointerBufferMallocPointer = memoryStack.mallocPointer(3);
        pointerBufferMallocPointer.put(LibIOURing.IORING_OFF_SQES).put(aWTContext.getCGLShareGroup()).put(0L).flip();
        IntBuffer intBufferCallocInt = memoryStack.callocInt(1);
        long jClCreateContext = CL11.clCreateContext(pointerBufferMallocPointer, memoryStack.mallocPointer(0), CLContextCallback.create((j, j2, j3, j4) -> {
            b.error("[LWJGL] cl_context_callback: {}", MemoryUtil.memUTF8(j));
        }), 0L, intBufferCallocInt);
        a(intBufferCallocInt);
        PointerBuffer pointerBufferMallocPointer2 = memoryStack.mallocPointer(1);
        a(APPLEGLSharing.clGetGLContextInfoAPPLE(jClCreateContext, aWTContext.getGLContext(), APPLEGLSharing.CL_CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE, pointerBufferMallocPointer2, (PointerBuffer) null));
        long j5 = pointerBufferMallocPointer2.get(0);
        b.debug("Got macOS CLGL compute device {}", Long.valueOf(j5));
        this.a = jClCreateContext;
        this.l = j5;
    }

    private void c() {
        long[] jArr = new long[1];
        CL12.clGetDeviceInfo(this.l, 4100, jArr, (PointerBuffer) null);
        b.debug("Device CL_DEVICE_MAX_WORK_GROUP_SIZE: {}", Long.valueOf(jArr[0]));
        if (jArr[0] < 256) {
            throw new RuntimeException("Compute device does not support min work group size 256");
        }
        int iNumberOfLeadingZeros = Integer.MIN_VALUE >>> Integer.numberOfLeadingZeros((int) jArr[0]);
        this.j = 6144 / Math.min(iNumberOfLeadingZeros, 6144);
        this.k = 512 / Math.min(iNumberOfLeadingZeros, 512);
        b.debug("Face counts: small: {}, large: {}", Integer.valueOf(this.k), Integer.valueOf(this.j));
    }

    private void d() {
        long[] jArr = new long[1];
        CL12.clGetDeviceInfo(this.l, 4138, jArr, (PointerBuffer) null);
        this.m = CL12.clCreateCommandQueue(this.a, this.l, jArr[0] & 1, (int[]) null);
        b.debug("Created command_queue {}, properties {}", Long.valueOf(this.m), Long.valueOf(jArr[0] & 1));
    }

    private long a(MemoryStack memoryStack, String str) {
        b.trace("Compiling program:\n {}", str);
        IntBuffer intBufferCallocInt = memoryStack.callocInt(1);
        long jClCreateProgramWithSource = CL12.clCreateProgramWithSource(this.a, str, intBufferCallocInt);
        a(intBufferCallocInt);
        if (CL12.clBuildProgram(jClCreateProgramWithSource, this.l, "", (CLProgramCallbackI) null, 0L) != 0) {
            throw new RuntimeException(b(jClCreateProgramWithSource, this.l, CL10.CL_PROGRAM_BUILD_LOG));
        }
        b.debug("Build status: {}", Integer.valueOf(a(jClCreateProgramWithSource, this.l, CL10.CL_PROGRAM_BUILD_STATUS)));
        b.debug("Binary type: {}", Integer.valueOf(a(jClCreateProgramWithSource, this.l, CL12.CL_PROGRAM_BINARY_TYPE)));
        b.debug("Build options: {}", b(jClCreateProgramWithSource, this.l, CL10.CL_PROGRAM_BUILD_OPTIONS));
        b.debug("Build log: {}", b(jClCreateProgramWithSource, this.l, CL10.CL_PROGRAM_BUILD_LOG));
        return jClCreateProgramWithSource;
    }

    private long a(MemoryStack memoryStack, long j, String str) {
        IntBuffer intBufferCallocInt = memoryStack.callocInt(1);
        long jClCreateKernel = CL12.clCreateKernel(j, str, intBufferCallocInt);
        a(intBufferCallocInt);
        b.debug("Loaded kernel {} for program {}", str, Long.valueOf(j));
        return jClCreateKernel;
    }

    private void a(MemoryStack memoryStack) {
        rs.lpkg.d.a aVarA = new rs.lpkg.dpkg.a().a(k.class).a(str -> {
            if (str.equals("FACE_COUNT")) {
                return "#define FACE_COUNT " + this.k;
            }
            return null;
        });
        rs.lpkg.d.a aVarA2 = new rs.lpkg.dpkg.a().a(k.class).a(str2 -> {
            if (str2.equals("FACE_COUNT")) {
                return "#define FACE_COUNT " + this.j;
            }
            return null;
        });
        String strB = new rs.lpkg.dpkg.a().a(k.class).b("comp_unordered.cl");
        String strB2 = aVarA.b("comp.cl");
        String strB3 = aVarA2.b("comp.cl");
        this.n = a(memoryStack, strB);
        this.o = a(memoryStack, strB2);
        this.p = a(memoryStack, strB3);
        this.q = a(memoryStack, this.n, c);
        this.r = a(memoryStack, this.o, d);
        this.s = a(memoryStack, this.p, d);
    }

    void a(int i, int i2, int i3, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10) {
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            PointerBuffer pointerBufferMallocPointer = memoryStackStackPush.mallocPointer(10);
            pointerBufferMallocPointer.put(aVar.d);
            pointerBufferMallocPointer.put(aVar2.d);
            pointerBufferMallocPointer.put(aVar5.d);
            pointerBufferMallocPointer.put(aVar6.d);
            pointerBufferMallocPointer.put(aVar7.d);
            pointerBufferMallocPointer.put(aVar3.d);
            pointerBufferMallocPointer.put(aVar4.d);
            pointerBufferMallocPointer.put(aVar8.d);
            pointerBufferMallocPointer.put(aVar9.d);
            pointerBufferMallocPointer.put(aVar10.d);
            pointerBufferMallocPointer.flip();
            PointerBuffer pointerBufferMallocPointer2 = memoryStackStackPush.mallocPointer(1);
            CL10GL.clEnqueueAcquireGLObjects(this.m, pointerBufferMallocPointer, (PointerBuffer) null, pointerBufferMallocPointer2);
            PointerBuffer pointerBufferMallocPointer3 = memoryStackStackPush.mallocPointer(3);
            if (i > 0) {
                CL12.clSetKernelArg1p(this.q, 0, aVar5.d);
                CL12.clSetKernelArg1p(this.q, 1, aVar.d);
                CL12.clSetKernelArg1p(this.q, 2, aVar3.d);
                CL12.clSetKernelArg1p(this.q, 3, aVar2.d);
                CL12.clSetKernelArg1p(this.q, 4, aVar4.d);
                CL12.clSetKernelArg1p(this.q, 5, aVar8.d);
                CL12.clSetKernelArg1p(this.q, 6, aVar9.d);
                CL12.clEnqueueNDRangeKernel(this.m, this.q, 1, null, memoryStackStackPush.pointers(((long) i) * 6), memoryStackStackPush.pointers(6L), pointerBufferMallocPointer2, pointerBufferMallocPointer3);
                pointerBufferMallocPointer3.position(pointerBufferMallocPointer3.position() + 1);
            }
            if (i2 > 0) {
                CL12.clSetKernelArg(this.r, 0, 2220L);
                CL12.clSetKernelArg1p(this.r, 1, aVar6.d);
                CL12.clSetKernelArg1p(this.r, 2, aVar.d);
                CL12.clSetKernelArg1p(this.r, 3, aVar3.d);
                CL12.clSetKernelArg1p(this.r, 4, aVar2.d);
                CL12.clSetKernelArg1p(this.r, 5, aVar4.d);
                CL12.clSetKernelArg1p(this.r, 6, aVar8.d);
                CL12.clSetKernelArg1p(this.r, 7, aVar9.d);
                CL12.clSetKernelArg1p(this.r, 8, aVar10.d);
                CL12.clEnqueueNDRangeKernel(this.m, this.r, 1, null, memoryStackStackPush.pointers(i2 * (512 / this.k)), memoryStackStackPush.pointers(512 / this.k), pointerBufferMallocPointer2, pointerBufferMallocPointer3);
                pointerBufferMallocPointer3.position(pointerBufferMallocPointer3.position() + 1);
            }
            if (i3 > 0) {
                CL12.clSetKernelArg(this.s, 0, 24748L);
                CL12.clSetKernelArg1p(this.s, 1, aVar7.d);
                CL12.clSetKernelArg1p(this.s, 2, aVar.d);
                CL12.clSetKernelArg1p(this.s, 3, aVar3.d);
                CL12.clSetKernelArg1p(this.s, 4, aVar2.d);
                CL12.clSetKernelArg1p(this.s, 5, aVar4.d);
                CL12.clSetKernelArg1p(this.s, 6, aVar8.d);
                CL12.clSetKernelArg1p(this.s, 7, aVar9.d);
                CL12.clSetKernelArg1p(this.s, 8, aVar10.d);
                CL12.clEnqueueNDRangeKernel(this.m, this.s, 1, null, memoryStackStackPush.pointers(i3 * (6144 / this.j)), memoryStackStackPush.pointers(6144 / this.j), pointerBufferMallocPointer2, pointerBufferMallocPointer3);
                pointerBufferMallocPointer3.position(pointerBufferMallocPointer3.position() + 1);
            }
            if (pointerBufferMallocPointer3.position() == 0) {
                CL10GL.clEnqueueReleaseGLObjects(this.m, pointerBufferMallocPointer, (PointerBuffer) null, (PointerBuffer) null);
            } else {
                pointerBufferMallocPointer3.flip();
                CL10GL.clEnqueueReleaseGLObjects(this.m, pointerBufferMallocPointer, pointerBufferMallocPointer3, (PointerBuffer) null);
            }
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void b() {
        CL12.clFinish(this.m);
    }

    private static String a(long j, int i) {
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            PointerBuffer pointerBufferMallocPointer = memoryStackStackPush.mallocPointer(1);
            a(CL10.clGetPlatformInfo(j, i, (ByteBuffer) null, pointerBufferMallocPointer));
            int i2 = (int) pointerBufferMallocPointer.get(0);
            ByteBuffer byteBufferMalloc = memoryStackStackPush.malloc(i2);
            a(CL10.clGetPlatformInfo(j, i, byteBufferMalloc, (PointerBuffer) null));
            String strMemUTF8 = MemoryUtil.memUTF8(byteBufferMalloc, i2 - 1);
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
            return strMemUTF8;
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static long b(long j, int i) {
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            LongBuffer longBufferMallocLong = memoryStackStackPush.mallocLong(1);
            a(CL11.clGetDeviceInfo(j, i, longBufferMallocLong, (PointerBuffer) null));
            long j2 = longBufferMallocLong.get(0);
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
            return j2;
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static int c(long j, int i) {
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            IntBuffer intBufferMallocInt = memoryStackStackPush.mallocInt(1);
            a(CL11.clGetDeviceInfo(j, i, intBufferMallocInt, (PointerBuffer) null));
            int i2 = intBufferMallocInt.get(0);
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
            return i2;
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static long d(long j, int i) {
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            PointerBuffer pointerBufferMallocPointer = memoryStackStackPush.mallocPointer(1);
            a(CL11.clGetDeviceInfo(j, i, pointerBufferMallocPointer, (PointerBuffer) null));
            long j2 = pointerBufferMallocPointer.get(0);
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
            return j2;
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static String e(long j, int i) {
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            PointerBuffer pointerBufferMallocPointer = memoryStackStackPush.mallocPointer(1);
            a(CL11.clGetDeviceInfo(j, i, (ByteBuffer) null, pointerBufferMallocPointer));
            int i2 = (int) pointerBufferMallocPointer.get(0);
            ByteBuffer byteBufferMalloc = memoryStackStackPush.malloc(i2);
            a(CL11.clGetDeviceInfo(j, i, byteBufferMalloc, (PointerBuffer) null));
            String strMemUTF8 = MemoryUtil.memUTF8(byteBufferMalloc, i2 - 1);
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
            return strMemUTF8;
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static int a(long j, long j2, int i) {
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            IntBuffer intBufferMallocInt = memoryStackStackPush.mallocInt(1);
            a(CL10.clGetProgramBuildInfo(j, j2, i, intBufferMallocInt, (PointerBuffer) null));
            int i2 = intBufferMallocInt.get(0);
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
            return i2;
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static String b(long j, long j2, int i) {
        MemoryStack memoryStackStackPush = MemoryStack.stackPush();
        try {
            PointerBuffer pointerBufferMallocPointer = memoryStackStackPush.mallocPointer(1);
            a(CL10.clGetProgramBuildInfo(j, j2, i, (ByteBuffer) null, pointerBufferMallocPointer));
            int i2 = (int) pointerBufferMallocPointer.get(0);
            ByteBuffer byteBufferMalloc = memoryStackStackPush.malloc(i2);
            a(CL10.clGetProgramBuildInfo(j, j2, i, byteBufferMalloc, (PointerBuffer) null));
            String strMemASCII = MemoryUtil.memASCII(byteBufferMalloc, i2 - 1);
            if (memoryStackStackPush != null) {
                memoryStackStackPush.close();
            }
            return strMemASCII;
        } catch (Throwable th) {
            if (memoryStackStackPush != null) {
                try {
                    memoryStackStackPush.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static void a(IntBuffer intBuffer) {
        a(intBuffer.get(intBuffer.position()));
    }

    private static void a(int i) {
        if (i != 0) {
            throw new RuntimeException(String.format("OpenCL error [%d]", Integer.valueOf(i)));
        }
    }

    static {
        Configuration.OPENCL_EXPLICIT_INIT.set(true);
    }
}
