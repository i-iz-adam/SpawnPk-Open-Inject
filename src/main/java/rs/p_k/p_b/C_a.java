package rs.p_k.p_b;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.Stack;
import org.lwjgl.system.MemoryUtil;

public class C_a {
   private final Stack<Long> a = new Stack<>();
   private final long b;
   private boolean c;
   private final rs.p_k.C_e d;

   public C_a(long var1, rs.p_k.C_e var3) {
      this.b = var1;
      this.c = false;
      this.d = var3;
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public void b() {
      if (!this.c) {
         long var1 = 294912L;
         long var3 = this.b;

         try {
            while (var3 - var1 >= 0L) {
               this.a.push(MemoryUtil.nmemAllocChecked(var1));
               var3 -= var1;
            }
         } catch (OutOfMemoryError var6) {
         }

         this.c = true;
      }
   }

   public void c() {
      Iterator var1 = this.a.iterator();

      while (var1.hasNext()) {
         Long var2 = (Long)var1.next();
         MemoryUtil.nmemFree(var2);
         var1.remove();
      }
   }

   public void a(IntBuffer var1) {
      this.a.push(MemoryUtil.memAddress(var1));
   }

   public IntBuffer a(int var1) {
      return this.a.isEmpty() ? null : MemoryUtil.memIntBuffer(this.a.pop(), var1);
   }

   public void a(FloatBuffer var1) {
      this.a.push(MemoryUtil.memAddress(var1));
   }

   public FloatBuffer b(int var1) {
      return this.a.isEmpty() ? null : MemoryUtil.memFloatBuffer(this.a.pop(), var1);
   }
}
