package rs.p_k;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

class C_c {
   private FloatBuffer a = b(65536);

   void a(float var1, float var2, float var3, float var4) {
      this.a.put(var1).put(var2).put(var3).put(var4);
   }

   public void a(float[] var1) {
      this.a.put(var1);
   }

   public void a(float[] var1, int var2, int var3) {
      this.a.put(var1, var2, var3);
   }

   void a() {
      this.a.flip();
   }

   void b() {
      this.a.clear();
   }

   void a(int var1) {
      int var2 = this.a.capacity();
      int var3 = this.a.position();
      if (var2 - var3 < var1) {
         do {
            var2 *= 2;
         } while (var2 - var3 < var1);

         FloatBuffer var4 = b(var2);
         this.a.flip();
         var4.put(this.a);
         this.a = var4;
      }
   }

   FloatBuffer c() {
      return this.a;
   }

   static FloatBuffer b(int var0) {
      return ByteBuffer.allocateDirect(var0 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
   }
}
