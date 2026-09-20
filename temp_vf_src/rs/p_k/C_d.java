package rs.p_k;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

class C_d {
   private IntBuffer a = b(65536);

   public void a(int var1, int var2, int var3) {
      this.a.put(var1).put(var2).put(var3);
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.a.put(var1).put(var2).put(var3).put(var4);
   }

   public void a(int[] var1) {
      this.a.put(var1);
   }

   public void a(int[] var1, int var2, int var3) {
      this.a.put(var1, var2, var3);
   }

   void a() {
      this.a.flip();
   }

   void b() {
      this.a.clear();
   }

   public C_d a(int var1) {
      int var2 = this.a.capacity();
      int var3 = this.a.position();
      if (var2 - var3 < var1) {
         do {
            var2 *= 2;
         } while (var2 - var3 < var1);

         IntBuffer var4 = b(var2);
         this.a.flip();
         var4.put(this.a);
         this.a = var4;
      }

      return this;
   }

   IntBuffer c() {
      return this.a;
   }

   static IntBuffer b(int var0) {
      return ByteBuffer.allocateDirect(var0 * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
   }
}
