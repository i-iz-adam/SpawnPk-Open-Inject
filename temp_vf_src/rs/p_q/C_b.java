package rs.p_q;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import rs.C_C_uc;

public final class C_b implements Runnable {
   private InputStream a;
   private OutputStream b;
   private final Socket c;
   private boolean d = false;
   private final C_C_uc e;
   private byte[] f;
   private int g;
   private int h;
   private boolean i = false;
   private boolean j = false;

   public C_b(C_C_uc var1, Socket var2) {
      this.e = var1;
      this.c = var2;
      if (rs.p_f.C_a.l) {
         this.c.setSoTimeout(30000);
      } else {
         this.c.setSoTimeout(0);
      }

      this.c.setTcpNoDelay(true);
      this.c.setReceiveBufferSize(rs.p_f.C_a.bt);
      this.a = this.c.getInputStream();
      this.b = this.c.getOutputStream();
   }

   public void a() {
      this.d = true;

      try {
         if (this.a != null) {
            this.a.close();
         }

         if (this.b != null) {
            this.b.close();
         }

         if (this.c != null) {
            this.c.close();
         }
      } catch (IOException var4) {
         System.out.println("Error closing stream");
      }

      this.i = false;
      synchronized (this) {
         this.notify();
      }

      this.f = null;
   }

   public int b() {
      return this.d ? 0 : this.a.read();
   }

   public int c() {
      return this.d ? 0 : this.a.available();
   }

   public void a(byte[] var1, int var2) {
      int var3 = 0;
      if (!this.d) {
         while (var2 > 0) {
            int var4 = this.a.read(var1, var3, var2);
            if (var4 <= 0) {
               throw new IOException("EOF");
            }

            var3 += var4;
            var2 -= var4;
         }
      }
   }

   public void a(int var1, byte[] var2) {
      if (!this.d) {
         if (this.j) {
            this.j = false;
            throw new IOException("Error in writer thread");
         } else {
            if (this.f == null) {
               this.f = new byte[rs.p_f.C_a.bt];
            }

            synchronized (this) {
               for (int var4 = 0; var4 < var1; var4++) {
                  this.f[this.h] = var2[var4];
                  this.h = (this.h + 1) % rs.p_f.C_a.bt;
                  if (this.h == (this.g + 4900) % rs.p_f.C_a.bt) {
                     throw new IOException("buffer overflow");
                  }
               }

               if (!this.i) {
                  this.i = true;
                  this.e.a(this, 3);
               }

               this.notify();
            }
         }
      }
   }

   @Override
   public void run() {
      while (this.i) {
         int var1;
         int var2;
         synchronized (this) {
            if (this.h == this.g) {
               try {
                  this.wait();
               } catch (InterruptedException var8) {
               }
            }

            if (!this.i) {
               return;
            }

            var2 = this.g;
            if (this.h >= this.g) {
               var1 = this.h - this.g;
            } else {
               var1 = rs.p_f.C_a.bt - this.g;
            }
         }

         if (var1 > 0) {
            try {
               this.b.write(this.f, var2, var1);
            } catch (IOException var7) {
               this.j = true;
               var7.printStackTrace();
            }

            this.g = (this.g + var1) % rs.p_f.C_a.bt;

            try {
               if (this.h == this.g) {
                  this.b.flush();
               }
            } catch (IOException var6) {
               this.j = true;
               var6.printStackTrace();
            }
         }
      }
   }

   public void d() {
      System.out.println("dummy:" + this.d);
      System.out.println("tcycl:" + this.g);
      System.out.println("tnum:" + this.h);
      System.out.println("writer:" + this.i);
      System.out.println("ioerror:" + this.j);

      try {
         System.out.println("available:" + this.c());
      } catch (IOException var2) {
      }
   }
}
