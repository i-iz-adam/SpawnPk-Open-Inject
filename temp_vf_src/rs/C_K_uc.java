package rs;

public final class C_K_uc {
   rs.p_u.C_j a;
   public int b;
   public int c;
   public final int[] d;
   public final int[][] e;

   public C_K_uc(rs.p_x.C_e var1, boolean var2, int var3) {
      int var4 = var1.h;
      this.b = var2 ? var1.o() : var1.y();
      this.d = new int[this.b];
      this.e = new int[this.b][];

      for (int var5 = 0; var5 < this.b; var5++) {
         this.d[var5] = var2 ? var1.o() : var1.y();
      }

      for (int var8 = 0; var8 < this.b; var8++) {
         this.e[var8] = new int[var2 ? var1.o() : var1.y()];
      }

      for (int var9 = 0; var9 < this.b; var9++) {
         for (int var6 = 0; var6 < this.e[var9].length; var6++) {
            this.e[var9][var6] = var2 ? var1.o() : var1.y();
         }
      }

      int var10 = var1.h - var4;
      if (!var2) {
         if (var10 != var3) {
            try {
               int var11 = var1.o();
               if (var11 > 0) {
                  this.a = new rs.p_u.C_j(var1, var11);
               }
            } catch (Throwable var7) {
               System.err.println("Tried to load base because there was extra base data but skeletal failed to load.");
               var7.printStackTrace();
            }
         }

         int var12 = var1.h - var4;
         if (var12 != var3) {
            throw new RuntimeException("base data size mismatch: " + var12 + ", expected " + var3);
         }
      }
   }

   public C_K_uc(int[] var1, int[][] var2) {
      this.d = var1;
      this.e = var2;
   }

   public C_K_uc(rs.p_x.C_e var1) {
      this(var1, rs.p_cache.p_osrs.C_c.a());
   }

   public C_K_uc(rs.p_x.C_e var1, boolean var2) {
      this.c = var2 ? var1.y() : var1.A();
      this.d = new int[this.c];
      this.e = new int[this.c][];

      for (int var3 = 0; var3 < this.c; var3++) {
         this.d[var3] = var2 ? var1.y() : var1.A();
      }

      for (int var5 = 0; var5 < this.c; var5++) {
         this.e[var5] = new int[var2 ? var1.y() : var1.A()];
      }

      for (int var6 = 0; var6 < this.c; var6++) {
         for (int var4 = 0; var4 < this.e[var6].length; var4++) {
            this.e[var6][var4] = var2 ? var1.y() : var1.A();
         }
      }
   }

   public int a() {
      return this.b;
   }

   public rs.p_u.C_j b() {
      return this.a;
   }
}
