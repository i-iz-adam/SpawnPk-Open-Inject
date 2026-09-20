package rs.p_cache;

import java.io.RandomAccessFile;

public class C_b {
   private final C_a[] a;
   private RandomAccessFile b;
   private final RandomAccessFile[] c = new RandomAccessFile[5];

   public C_b() {
      this.a = new C_a[5];
   }

   public void a(String var1, String var2) {
      try {
         this.b = new RandomAccessFile(rs.p_v.C_a.f() + var1, "rw");

         for (int var3 = 0; var3 < 5; var3++) {
            this.c[var3] = new RandomAccessFile(rs.p_v.C_a.f() + var2 + var3, "rw");
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      for (int var5 = 0; var5 < 5; var5++) {
         this.a[var5] = new C_a(this.b, this.c[var5], var5 + 1);
      }
   }

   public C_a[] a() {
      return this.a;
   }
}
