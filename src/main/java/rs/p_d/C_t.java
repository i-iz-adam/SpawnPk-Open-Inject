package rs.p_d;

import java.io.File;
import java.nio.ByteBuffer;
import rs.C_Client_mc;

public class C_t {
   public boolean a;
   public static C_t[] b;
   public int c = -1;
   public int d;
   public boolean e;
   public int f;
   public int g;
   public boolean h;
   public int i;
   public boolean j;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   public int r;
   public int s;
   public int t;
   public int u;
   public int v;
   public int w;
   public static C_h.a x = C_h.a.a;

   public static void a(C_h.a var0) {
      ByteBuffer var1 = null;
      switch (var0) {
         case a:
            var1 = ByteBuffer.wrap(C_Client_mc.a(rs.p_v.C_a.f() + "flo2.dat"));
            break;
         case b:
            var1 = ByteBuffer.wrap(C_Client_mc.a(rs.p_v.C_a.f() + "osrs_flo2.dat"));
            break;
         case c:
            var1 = ByteBuffer.wrap(C_Client_mc.a(rs.p_v.C_a.f() + "osrs_config" + File.separator + "flo2.dat"));
      }

      short var2 = var1.getShort();
      b = new C_t[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         if (b[var3] == null) {
            b[var3] = new C_t();
         }

         b[var3].a(var1);
         b[var3].a();
      }
   }

   public void a() {
      if (this.f != -1) {
         this.a(this.f);
         this.r = this.o;
         this.s = this.p;
         this.t = this.q;
      }

      this.a(this.d);
   }

   public void a(rs.p_x.C_e var1) {
      while (true) {
         int var2 = var1.y();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            this.d = (var1.y() << 16) + (var1.y() << 8) + var1.y();
         } else if (var2 == 2) {
            this.c = var1.y();
         } else if (var2 == 5) {
            this.e = false;
         } else if (var2 == 7) {
            this.f = (var1.y() << 16) + (var1.y() << 8) + var1.y();
         } else {
            System.out.println("Error unrecognised overlay code: " + var2);
         }
      }
   }

   private void a(ByteBuffer var1) {
      while (true) {
         byte var2 = var1.get();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            this.d = ((var1.get() & 255) << 16) + ((var1.get() & 255) << 8) + (var1.get() & 255);
         } else if (var2 == 2) {
            this.c = var1.get() & 255;
         } else if (var2 == 3) {
            this.c = var1.getShort() & '\uffff';
            if (this.c == 65535) {
               this.c = -1;
            }
         } else if (var2 != 4) {
            if (var2 == 5) {
               this.e = false;
            } else if (var2 != 6) {
               if (var2 == 7) {
                  this.f = ((var1.get() & 255) << 16) + ((var1.get() & 255) << 8) + (var1.get() & 255);
               } else if (var2 != 8) {
                  if (var2 == 9) {
                     this.g = var1.getShort() & '\uffff';
                  } else if (var2 == 10) {
                     this.h = false;
                  } else if (var2 == 11) {
                     this.i = var1.get() & 255;
                  } else if (var2 == 12) {
                     this.j = true;
                  } else if (var2 == 13) {
                     this.k = ((var1.get() & 255) << 16) + ((var1.get() & 255) << 8) + (var1.get() & 255);
                  } else if (var2 == 14) {
                     this.l = var1.get() & 255;
                  } else if (var2 == 15) {
                     this.m = var1.getShort() & '\uffff';
                     if (this.m == 65535) {
                        this.m = -1;
                     }
                  } else if (var2 == 16) {
                     this.n = var1.get() & 255;
                  } else {
                     System.err.println("[OverlayFloor] Missing AttributeId: " + var2);
                  }
               }
            }
         }
      }
   }

   private void a(int var1) {
      double var2 = (double)(var1 >> 16 & 0xFF) / 256.0;
      double var4 = (double)(var1 >> 8 & 0xFF) / 256.0;
      double var6 = (double)(var1 & 0xFF) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var8 + var10) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0;
      this.o = (int)(var12 * 256.0);
      this.p = (int)(var14 * 256.0);
      this.q = (int)(var16 * 256.0);
      if (this.p < 0) {
         this.p = 0;
      } else if (this.p > 255) {
         this.p = 255;
      }

      if (this.q < 0) {
         this.q = 0;
      } else if (this.q > 255) {
         this.q = 255;
      }

      if (var16 > 0.5) {
         this.v = (int)((1.0 - var16) * var14 * 512.0);
      } else {
         this.v = (int)(var16 * var14 * 512.0);
      }

      if (this.v < 1) {
         this.v = 1;
      }

      this.u = (int)(var12 * (double)this.v);
      this.w = a(this.o, this.p, this.q);
   }

   static final int a(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      return (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
   }
}
