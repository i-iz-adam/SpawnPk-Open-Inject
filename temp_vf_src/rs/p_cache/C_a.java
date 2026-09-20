package rs.p_cache;

import java.io.IOException;
import java.io.RandomAccessFile;

public final class C_a {
   private final byte[] a = new byte[520];
   private final RandomAccessFile b;
   private final RandomAccessFile c;
   private final int d;

   public C_a(RandomAccessFile var1, RandomAccessFile var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public synchronized byte[] a(int var1) {
      try {
         this.a(this.c, var1 * 6);
         int var3 = 0;

         while (var3 < 6) {
            int var2 = this.c.read(this.a, var3, 6 - var3);
            if (var2 == -1) {
               return null;
            }

            var3 += var2;
         }

         int var14 = ((this.a[0] & 255) << 16) + ((this.a[1] & 255) << 8) + (this.a[2] & 255);
         var3 = ((this.a[3] & 255) << 16) + ((this.a[4] & 255) << 8) + (this.a[5] & 255);
         if (var3 > 0 && (long)var3 <= this.b.length() / 520L) {
            byte[] var4 = new byte[var14];
            int var5 = 0;
            int var6 = 0;

            while (var5 < var14) {
               if (var3 == 0) {
                  return null;
               }

               this.a(this.b, var3 * 520);
               int var7 = var14 - var5;
               if (var7 > 512) {
                  var7 = 512;
               }

               int var9 = 0;

               while (var9 < var7 + 8) {
                  int var8 = this.b.read(this.a, var9, var7 + 8 - var9);
                  if (var8 == -1) {
                     return null;
                  }

                  var9 += var8;
               }

               int var16 = ((this.a[0] & 255) << 8) + (this.a[1] & 255);
               var9 = ((this.a[2] & 255) << 8) + (this.a[3] & 255);
               int var10 = ((this.a[4] & 255) << 16) + ((this.a[5] & 255) << 8) + (this.a[6] & 255);
               int var11 = this.a[7] & 255;
               if (var16 == var1 && var9 == var6 && var11 == this.d) {
                  if (var10 >= 0 && (long)var10 <= this.b.length() / 520L) {
                     for (int var12 = 0; var12 < var7; var12++) {
                        var4[var5++] = this.a[var12 + 8];
                     }

                     var3 = var10;
                     var6++;
                     continue;
                  }

                  return null;
               }

               return null;
            }

            return var4;
         } else {
            return null;
         }
      } catch (IOException var13) {
         return null;
      }
   }

   public synchronized boolean a(int var1, byte[] var2, int var3) {
      boolean var4 = this.a(true, var3, var1, var2);
      if (!var4) {
         var4 = this.a(false, var3, var1, var2);
      }

      return var4;
   }

   private synchronized boolean a(boolean var1, int var2, int var3, byte[] var4) {
      try {
         int var5;
         if (!var1) {
            var5 = (int)((this.b.length() + 519L) / 520L);
            if (var5 == 0) {
               var5 = 1;
            }
         } else {
            this.a(this.c, var2 * 6);
            int var7 = 0;

            while (var7 < 6) {
               int var6 = this.c.read(this.a, var7, 6 - var7);
               if (var6 == -1) {
                  return false;
               }

               var7 += var6;
            }

            var5 = ((this.a[3] & 255) << 16) + ((this.a[4] & 255) << 8) + (this.a[5] & 255);
            if (var5 <= 0 || (long)var5 > this.b.length() / 520L) {
               return false;
            }
         }

         this.a[0] = (byte)(var3 >> 16);
         this.a[1] = (byte)(var3 >> 8);
         this.a[2] = (byte)var3;
         this.a[3] = (byte)(var5 >> 16);
         this.a[4] = (byte)(var5 >> 8);
         this.a[5] = (byte)var5;
         this.a(this.c, var2 * 6);
         this.c.write(this.a, 0, 6);
         int var15 = 0;

         for (int var16 = 0; var15 < var3; var16++) {
            int var8 = 0;
            if (var1) {
               this.a(this.b, var5 * 520);
               int var9 = 0;

               while (true) {
                  if (var9 < 8) {
                     int var10 = this.b.read(this.a, var9, 8 - var9);
                     if (var10 != -1) {
                        var9 += var10;
                        continue;
                     }
                  }

                  if (var9 == 8) {
                     int var11 = ((this.a[0] & 255) << 8) + (this.a[1] & 255);
                     int var12 = ((this.a[2] & 255) << 8) + (this.a[3] & 255);
                     var8 = ((this.a[4] & 255) << 16) + ((this.a[5] & 255) << 8) + (this.a[6] & 255);
                     int var13 = this.a[7] & 255;
                     if (var11 != var2 || var12 != var16 || var13 != this.d) {
                        return false;
                     }

                     if (var8 < 0 || (long)var8 > this.b.length() / 520L) {
                        return false;
                     }
                  }
                  break;
               }
            }

            if (var8 == 0) {
               var1 = false;
               var8 = (int)((this.b.length() + 519L) / 520L);
               if (var8 == 0) {
                  var8++;
               }

               if (var8 == var5) {
                  var8++;
               }
            }

            if (var3 - var15 <= 512) {
               var8 = 0;
            }

            this.a[0] = (byte)(var2 >> 8);
            this.a[1] = (byte)var2;
            this.a[2] = (byte)(var16 >> 8);
            this.a[3] = (byte)var16;
            this.a[4] = (byte)(var8 >> 16);
            this.a[5] = (byte)(var8 >> 8);
            this.a[6] = (byte)var8;
            this.a[7] = (byte)this.d;
            this.a(this.b, var5 * 520);
            this.b.write(this.a, 0, 8);
            int var17 = var3 - var15;
            if (var17 > 512) {
               var17 = 512;
            }

            this.b.write(var4, var15, var17);
            var15 += var17;
            var5 = var8;
         }

         return true;
      } catch (IOException var14) {
         return false;
      }
   }

   private synchronized void a(RandomAccessFile var1, int var2) {
      var1.seek((long)var2);
   }
}
