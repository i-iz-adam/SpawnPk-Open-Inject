package rs.p_k;

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
import org.lwjgl.system.Configuration;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
class C_k {
   private static final Logger b = LoggerFactory.getLogger(C_k.class);
   private static final String c = "computeUnordered";
   private static final String d = "computeLarge";
   private static final int e = 256;
   private static final int f = 512;
   private static final int g = 6144;
   private static final int h = 43;
   private boolean i;
   private int j;
   private int k;
   private long l = -1L;
   long a;
   private long m;
   private long n;
   private long o;
   private long p;
   private long q;
   private long r;
   private long s;

   void a(AWTContext var1) {
      CL.create();
      this.i = true;
      MemoryStack var2 = MemoryStack.stackPush();

      try {
         if (C_j.a() == C_j.b) {
            this.b(var1, var2);
         } else {
            this.a(var1, var2);
         }

         this.c();
         this.d();
         this.a(var2);
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
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
         } finally {
            CL.destroy();
            this.i = false;
         }
      }
   }

   private void a(AWTContext var1, MemoryStack var2) {
      IntBuffer var3 = var2.mallocInt(1);
      a(CL11.clGetPlatformIDs(null, var3));
      if (var3.get(0) == 0) {
         throw new RuntimeException("No OpenCL platforms found.");
      } else {
         PointerBuffer var4 = var2.mallocPointer(var3.get(0));
         a(CL11.clGetPlatformIDs(var4, (IntBuffer)null));
         PointerBuffer var5 = var2.mallocPointer(7);
         if (C_j.a() == C_j.a) {
            var5.put(4228L).put(0L).put(8200L).put(var1.getGLContext()).put(8203L).put(var1.getWGLHDC()).put(0L).flip();
         } else {
            if (C_j.a() != C_j.c) {
               throw new RuntimeException("unsupported platform");
            }

            var5.put(4228L).put(0L).put(8200L).put(var1.getGLContext()).put(8202L).put(var1.getGLXDisplay()).put(0L).flip();
         }

         for (int var6 = 0; var6 < var4.capacity(); var6++) {
            long var7 = var4.get(var6);
            var5.put(1, var7);

            try {
               CLCapabilities var9 = CL.createPlatformCapabilities(var7);
               b.debug("Platform profile: {}", a(var7, 2304));
               b.debug("Platform version: {}", a(var7, 2305));
               b.debug("Platform name: {}", a(var7, 2306));
               b.debug("Platform vendor: {}", a(var7, 2307));
               b.debug("Platform extensions: {}", a(var7, 2308));
               a(CL11.clGetDeviceIDs(var7, 4L, null, var3));
               PointerBuffer var10 = var2.mallocPointer(var3.get(0));
               a(CL11.clGetDeviceIDs(var7, 4L, var10, (IntBuffer)null));

               for (int var11 = 0; var11 < var10.capacity(); var11++) {
                  long var12 = var10.get(var11);

                  try {
                     CLCapabilities var14 = CL.createDeviceCapabilities(var12, var9);
                     b.debug("Device id {}", var12);
                     b.debug("\tCL_DEVICE_NAME: {}", e(var12, 4139));
                     b.debug("\tCL_DEVICE_VENDOR: {}", e(var12, 4140));
                     b.debug("\tCL_DRIVER_VERSION: {}", e(var12, 4141));
                     b.debug("\tCL_DEVICE_PROFILE: {}", e(var12, 4142));
                     b.debug("\tCL_DEVICE_VERSION: {}", e(var12, 4143));
                     b.debug("\tCL_DEVICE_EXTENSIONS: {}", e(var12, 4144));
                     b.debug("\tCL_DEVICE_TYPE: {}", b(var12, 4096));
                     b.debug("\tCL_DEVICE_VENDOR_ID: {}", c(var12, 4097));
                     b.debug("\tCL_DEVICE_MAX_COMPUTE_UNITS: {}", c(var12, 4098));
                     b.debug("\tCL_DEVICE_MAX_WORK_ITEM_DIMENSIONS: {}", c(var12, 4099));
                     b.debug("\tCL_DEVICE_MAX_WORK_GROUP_SIZE: {}", d(var12, 4100));
                     b.debug("\tCL_DEVICE_MAX_CLOCK_FREQUENCY: {}", c(var12, 4108));
                     b.debug("\tCL_DEVICE_ADDRESS_BITS: {}", c(var12, 4109));
                     b.debug("\tCL_DEVICE_AVAILABLE: {}", c(var12, 4135) != 0);
                     b.debug("\tCL_DEVICE_COMPILER_AVAILABLE: {}", c(var12, 4136) != 0);
                     if (var14.cl_khr_gl_sharing || var14.cl_APPLE_gl_sharing) {
                        IntBuffer var15 = var2.callocInt(1);
                        long var16 = CL11.clCreateContext(
                           var5,
                           var12,
                           CLContextCallback.create((var0, var2x, var4x, var6x) -> b.error("[LWJGL] cl_context_callback: {}", MemoryUtil.memUTF8(var0))),
                           0L,
                           var15
                        );
                        a(var15);
                        this.l = var12;
                        this.a = var16;
                        return;
                     }
                  } catch (Exception var18) {
                     b.error("error checking device", var18);
                  }
               }
            } catch (Exception var19) {
               b.error("error checking platform", var19);
            }
         }

         throw new RuntimeException("Unable to find compute platform");
      }
   }

   private void b(AWTContext var1, MemoryStack var2) {
      PointerBuffer var3 = var2.mallocPointer(3);
      var3.put(268435456L).put(var1.getCGLShareGroup()).put(0L).flip();
      IntBuffer var4 = var2.callocInt(1);
      PointerBuffer var5 = var2.mallocPointer(0);
      long var6 = CL11.clCreateContext(
         var3, var5, CLContextCallback.create((var0, var2x, var4x, var6x) -> b.error("[LWJGL] cl_context_callback: {}", MemoryUtil.memUTF8(var0))), 0L, var4
      );
      a(var4);
      PointerBuffer var8 = var2.mallocPointer(1);
      a(APPLEGLSharing.clGetGLContextInfoAPPLE(var6, var1.getGLContext(), 268435458, var8, null));
      long var9 = var8.get(0);
      b.debug("Got macOS CLGL compute device {}", var9);
      this.a = var6;
      this.l = var9;
   }

   private void c() {
      long[] var1 = new long[1];
      CL12.clGetDeviceInfo(this.l, 4100, var1, null);
      b.debug("Device CL_DEVICE_MAX_WORK_GROUP_SIZE: {}", var1[0]);
      if (var1[0] < 256L) {
         throw new RuntimeException("Compute device does not support min work group size 256");
      } else {
         int var2 = Integer.MIN_VALUE >>> Integer.numberOfLeadingZeros((int)var1[0]);
         this.j = 6144 / Math.min(var2, 6144);
         this.k = 512 / Math.min(var2, 512);
         b.debug("Face counts: small: {}, large: {}", this.k, this.j);
      }
   }

   private void d() {
      long[] var1 = new long[1];
      CL12.clGetDeviceInfo(this.l, 4138, var1, null);
      this.m = CL12.clCreateCommandQueue(this.a, this.l, var1[0] & 1L, (int[])null);
      b.debug("Created command_queue {}, properties {}", this.m, var1[0] & 1L);
   }

   private long a(MemoryStack var1, String var2) {
      b.trace("Compiling program:\n {}", var2);
      IntBuffer var3 = var1.callocInt(1);
      long var4 = CL12.clCreateProgramWithSource(this.a, var2, var3);
      a(var3);
      int var6 = CL12.clBuildProgram(var4, this.l, "", null, 0L);
      if (var6 != 0) {
         String var7 = b(var4, this.l, 4483);
         throw new RuntimeException(var7);
      } else {
         b.debug("Build status: {}", a(var4, this.l, 4481));
         b.debug("Binary type: {}", a(var4, this.l, 4484));
         b.debug("Build options: {}", b(var4, this.l, 4482));
         b.debug("Build log: {}", b(var4, this.l, 4483));
         return var4;
      }
   }

   private long a(MemoryStack var1, long var2, String var4) {
      IntBuffer var5 = var1.callocInt(1);
      long var6 = CL12.clCreateKernel(var2, var4, var5);
      a(var5);
      b.debug("Loaded kernel {} for program {}", var4, var2);
      return var6;
   }

   private void a(MemoryStack var1) {
      rs.p_k.p_d.C_a var2 = new rs.p_k.p_d.C_a().a(C_k.class).a(var1x -> var1x.equals("FACE_COUNT") ? "#define FACE_COUNT " + this.k : null);
      rs.p_k.p_d.C_a var3 = new rs.p_k.p_d.C_a().a(C_k.class).a(var1x -> var1x.equals("FACE_COUNT") ? "#define FACE_COUNT " + this.j : null);
      String var4 = new rs.p_k.p_d.C_a().a(C_k.class).b("comp_unordered.cl");
      String var5 = var2.b("comp.cl");
      String var6 = var3.b("comp.cl");
      this.n = this.a(var1, var4);
      this.o = this.a(var1, var5);
      this.p = this.a(var1, var6);
      this.q = this.a(var1, this.n, "computeUnordered");
      this.r = this.a(var1, this.o, "computeLarge");
      this.s = this.a(var1, this.p, "computeLarge");
   }

   void a(int var1, int var2, int var3, C_a var4, C_a var5, C_a var6, C_a var7, C_a var8, C_a var9, C_a var10, C_a var11, C_a var12, C_a var13) {
      MemoryStack var14 = MemoryStack.stackPush();

      try {
         PointerBuffer var15 = var14.mallocPointer(10);
         var15.put(var4.d);
         var15.put(var5.d);
         var15.put(var8.d);
         var15.put(var9.d);
         var15.put(var10.d);
         var15.put(var6.d);
         var15.put(var7.d);
         var15.put(var11.d);
         var15.put(var12.d);
         var15.put(var13.d);
         var15.flip();
         PointerBuffer var16 = var14.mallocPointer(1);
         CL10GL.clEnqueueAcquireGLObjects(this.m, var15, null, var16);
         PointerBuffer var17 = var14.mallocPointer(3);
         if (var1 > 0) {
            CL12.clSetKernelArg1p(this.q, 0, var8.d);
            CL12.clSetKernelArg1p(this.q, 1, var4.d);
            CL12.clSetKernelArg1p(this.q, 2, var6.d);
            CL12.clSetKernelArg1p(this.q, 3, var5.d);
            CL12.clSetKernelArg1p(this.q, 4, var7.d);
            CL12.clSetKernelArg1p(this.q, 5, var11.d);
            CL12.clSetKernelArg1p(this.q, 6, var12.d);
            CL12.clEnqueueNDRangeKernel(this.m, this.q, 1, null, var14.pointers((long)var1 * 6L), var14.pointers(6L), var16, var17);
            var17.position(var17.position() + 1);
         }

         if (var2 > 0) {
            CL12.clSetKernelArg(this.r, 0, 2220L);
            CL12.clSetKernelArg1p(this.r, 1, var9.d);
            CL12.clSetKernelArg1p(this.r, 2, var4.d);
            CL12.clSetKernelArg1p(this.r, 3, var6.d);
            CL12.clSetKernelArg1p(this.r, 4, var5.d);
            CL12.clSetKernelArg1p(this.r, 5, var7.d);
            CL12.clSetKernelArg1p(this.r, 6, var11.d);
            CL12.clSetKernelArg1p(this.r, 7, var12.d);
            CL12.clSetKernelArg1p(this.r, 8, var13.d);
            CL12.clEnqueueNDRangeKernel(
               this.m, this.r, 1, null, var14.pointers((long)(var2 * (512 / this.k))), var14.pointers((long)(512 / this.k)), var16, var17
            );
            var17.position(var17.position() + 1);
         }

         if (var3 > 0) {
            CL12.clSetKernelArg(this.s, 0, 24748L);
            CL12.clSetKernelArg1p(this.s, 1, var10.d);
            CL12.clSetKernelArg1p(this.s, 2, var4.d);
            CL12.clSetKernelArg1p(this.s, 3, var6.d);
            CL12.clSetKernelArg1p(this.s, 4, var5.d);
            CL12.clSetKernelArg1p(this.s, 5, var7.d);
            CL12.clSetKernelArg1p(this.s, 6, var11.d);
            CL12.clSetKernelArg1p(this.s, 7, var12.d);
            CL12.clSetKernelArg1p(this.s, 8, var13.d);
            CL12.clEnqueueNDRangeKernel(
               this.m, this.s, 1, null, var14.pointers((long)(var3 * (6144 / this.j))), var14.pointers((long)(6144 / this.j)), var16, var17
            );
            var17.position(var17.position() + 1);
         }

         if (var17.position() == 0) {
            CL10GL.clEnqueueReleaseGLObjects(this.m, var15, null, null);
         } else {
            var17.flip();
            CL10GL.clEnqueueReleaseGLObjects(this.m, var15, var17, null);
         }
      } catch (Throwable var19) {
         if (var14 != null) {
            try {
               var14.close();
            } catch (Throwable var18) {
               var19.addSuppressed(var18);
            }
         }

         throw var19;
      }

      if (var14 != null) {
         var14.close();
      }
   }

   void b() {
      CL12.clFinish(this.m);
   }

   private static String a(long var0, int var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      String var7;
      try {
         PointerBuffer var4 = var3.mallocPointer(1);
         a(CL10.clGetPlatformInfo(var0, var2, (ByteBuffer)null, var4));
         int var5 = (int)var4.get(0);
         ByteBuffer var6 = var3.malloc(var5);
         a(CL10.clGetPlatformInfo(var0, var2, var6, null));
         var7 = MemoryUtil.memUTF8(var6, var5 - 1);
      } catch (Throwable var9) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var3 != null) {
         var3.close();
      }

      return var7;
   }

   private static long b(long var0, int var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      long var5;
      try {
         LongBuffer var4 = var3.mallocLong(1);
         a(CL11.clGetDeviceInfo(var0, var2, var4, null));
         var5 = var4.get(0);
      } catch (Throwable var8) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var3 != null) {
         var3.close();
      }

      return var5;
   }

   private static int c(long var0, int var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      int var5;
      try {
         IntBuffer var4 = var3.mallocInt(1);
         a(CL11.clGetDeviceInfo(var0, var2, var4, null));
         var5 = var4.get(0);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }

      return var5;
   }

   private static long d(long var0, int var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      long var5;
      try {
         PointerBuffer var4 = var3.mallocPointer(1);
         a(CL11.clGetDeviceInfo(var0, var2, var4, null));
         var5 = var4.get(0);
      } catch (Throwable var8) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var3 != null) {
         var3.close();
      }

      return var5;
   }

   private static String e(long var0, int var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      String var7;
      try {
         PointerBuffer var4 = var3.mallocPointer(1);
         a(CL11.clGetDeviceInfo(var0, var2, (ByteBuffer)null, var4));
         int var5 = (int)var4.get(0);
         ByteBuffer var6 = var3.malloc(var5);
         a(CL11.clGetDeviceInfo(var0, var2, var6, null));
         var7 = MemoryUtil.memUTF8(var6, var5 - 1);
      } catch (Throwable var9) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var3 != null) {
         var3.close();
      }

      return var7;
   }

   private static int a(long var0, long var2, int var4) {
      MemoryStack var5 = MemoryStack.stackPush();

      int var7;
      try {
         IntBuffer var6 = var5.mallocInt(1);
         a(CL10.clGetProgramBuildInfo(var0, var2, var4, var6, null));
         var7 = var6.get(0);
      } catch (Throwable var9) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var5 != null) {
         var5.close();
      }

      return var7;
   }

   private static String b(long var0, long var2, int var4) {
      MemoryStack var5 = MemoryStack.stackPush();

      String var9;
      try {
         PointerBuffer var6 = var5.mallocPointer(1);
         a(CL10.clGetProgramBuildInfo(var0, var2, var4, (ByteBuffer)null, var6));
         int var7 = (int)var6.get(0);
         ByteBuffer var8 = var5.malloc(var7);
         a(CL10.clGetProgramBuildInfo(var0, var2, var4, var8, null));
         var9 = MemoryUtil.memASCII(var8, var7 - 1);
      } catch (Throwable var11) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var10) {
               var11.addSuppressed(var10);
            }
         }

         throw var11;
      }

      if (var5 != null) {
         var5.close();
      }

      return var9;
   }

   private static void a(IntBuffer var0) {
      a(var0.get(var0.position()));
   }

   private static void a(int var0) {
      if (var0 != 0) {
         throw new RuntimeException(String.format("OpenCL error [%d]", var0));
      }
   }

   static {
      Configuration.OPENCL_EXPLICIT_INIT.set(true);
   }
}
