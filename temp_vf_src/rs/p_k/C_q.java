package rs.p_k;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_l.C_E_uc;

class C_q {
   private static final Logger b = LoggerFactory.getLogger(C_q.class);
   public static final int a = 128;

   int a() {
      if (!this.c()) {
         return -1;
      } else {
         rs.p_l.C_a[] var1 = C_E_uc.y;
         int var2 = GL43C.glGenTextures();
         GL43C.glBindTexture(35866, var2);
         if (GL.getCapabilities().glTexStorage3D != 0L) {
            GL43C.glTexStorage3D(35866, 8, 32856, 128, 128, var1.length);
         } else {
            short var3 = 128;

            for (int var4 = 0; var4 < 8; var4++) {
               GL43C.glTexImage3D(35866, var4, 32856, var3, var3, var1.length, 0, 6408, 5121, 0L);
               var3 /= 2;
            }
         }

         GL43C.glTexParameteri(35866, 10241, 9728);
         GL43C.glTexParameteri(35866, 10240, 9728);
         GL43C.glTexParameteri(35866, 10242, 33071);
         double var5 = C_E_uc.c();
         C_E_uc.b(1.0);
         this.b(var2);
         C_E_uc.b(var5);
         GL43C.glActiveTexture(33985);
         GL43C.glBindTexture(35866, var2);
         GL43C.glGenerateMipmap(35866);
         GL43C.glActiveTexture(33984);
         return var2;
      }
   }

   void a(int var1, int var2) {
      GL43C.glBindTexture(35866, var1);
      if (var2 == 0) {
         GL43C.glTexParameteri(35866, 10241, 9728);
      } else {
         GL43C.glTexParameteri(35866, 10241, 9986);
      }

      if (GL.getCapabilities().GL_EXT_texture_filter_anisotropic) {
         float var3 = GL43C.glGetFloat(34047);
         float var4 = Math.max(1.0F, Math.min(var3, (float)var2));
         GL43C.glTexParameterf(35866, 34046, var4);
      }
   }

   void a(int var1) {
      GL43C.glDeleteTextures(var1);
   }

   private boolean c() {
      rs.p_l.C_a[] var1 = C_E_uc.y;
      if (var1 != null && var1.length != 0) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            try {
               rs.p_l.C_a var3 = var1[var2];
               if (var3 != null) {
                  int[] var4 = C_E_uc.d(var2);
                  if (var4 == null) {
                     return false;
                  }
               }
            } catch (Exception var5) {
               var5.printStackTrace();
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void b(int var1) {
      rs.p_l.C_a[] var2 = C_E_uc.y;
      GL43C.glBindTexture(35866, var1);
      int var3 = 0;

      for (int var4 = 0; var4 < var2.length; var4++) {
         rs.p_l.C_a var5 = var2[var4];
         if (var5 != null) {
            int[] var6 = C_E_uc.d(var4);
            if (var6 == null) {
               System.out.println("No pixels for texture " + var4 + "!");
            } else {
               var3++;
               byte[] var7 = a(var6, 128, 128, 128, 128);
               ByteBuffer var8 = ByteBuffer.allocateDirect(var7.length);
               var8.put(var7);
               var8.flip();
               GL43C.glTexSubImage3D(35866, 0, 0, 0, var4, 128, 128, 1, 6408, 5121, var8);
            }
         }
      }

      b.debug("Uploaded textures {}", var3);
   }

   private static byte[] a(int[] var0, int var1, int var2, int var3, int var4) {
      byte[] var5 = new byte[var3 * var4 * 4];
      int var6 = 0;
      int var7 = 0;
      int var8 = (var3 - var1) * 4;

      for (int var9 = 0; var9 < var2; var9++) {
         for (int var10 = 0; var10 < var1; var10++) {
            int var11 = var0[var7++];
            if (var11 != 0) {
               var5[var6++] = (byte)(var11 >> 16);
               var5[var6++] = (byte)(var11 >> 8);
               var5[var6++] = (byte)var11;
               var5[var6++] = -1;
            } else {
               var6 += 4;
            }
         }

         var6 += var8;
      }

      return var5;
   }

   float[] b() {
      rs.p_l.C_a[] var1 = C_E_uc.y;
      float[] var2 = new float[var1.length * 2];

      for (int var3 = 0; var3 < var1.length; var3++) {
         rs.p_l.C_a var4 = var1[var3];
         if (var4 != null) {
            int var5 = 0;

            for (int var9 : C_Client_mc.bJ) {
               if (var3 == var9) {
                  var5 = var4.j();
                  break;
               }
            }

            for (int var18 : C_Client_mc.bK) {
               if (var3 == var18) {
                  var5 = var4.j();
                  break;
               }
            }

            float var11 = 0.0F;
            float var14 = 0.0F;
            switch (var5) {
               case 1:
                  var14 = -1.0F;
                  break;
               case 2:
                  var11 = -1.0F;
                  break;
               case 3:
                  var14 = 1.0F;
                  break;
               case 4:
                  var11 = 1.0F;
            }

            int var17 = var4.i();
            var11 *= (float)var17;
            var14 *= (float)var17;
            var2[var3 * 2] = var11;
            var2[var3 * 2 + 1] = var14;
         }
      }

      return var2;
   }
}
