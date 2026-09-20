package rs.p_k.p_b;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_e extends LinkedHashMap<Integer, C_c> {
   private static final Logger a = LoggerFactory.getLogger(C_e.class);
   private C_a b;
   private C_d c;
   private C_b d;
   private C_b e;

   public void a(rs.p_k.C_e var1) {
      int var2 = 403;
      if (!Objects.equals(System.getProperty("sun.arch.data.model"), "64") && var2 > 512) {
         a.error("defaulting model cache to 512MiB due to non 64-bit client");
         var2 = 512;
      }

      try {
         long var3 = ((OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize() / 1024L / 1024L;
         if ((long)var2 > var3 / 2L) {
            var2 = (int)(var3 / 2L);
            a.error("limiting the cache to " + var2 + " since the selected amount exceeds half of the total physical memory for the system.");
         }
      } catch (Throwable var5) {
         a.error("failed to check physical memory size: " + var5);
      }

      this.b = new C_a((long)var2 * 1048576L, var1);
      this.b.b();
      this.c = new C_d(this.b);
      this.d = new C_b(this.b);
      this.e = new C_b(this.b);
   }

   public void a() {
      this.clear();
      if (this.b != null) {
         this.b.c();
      }
   }

   public IntBuffer a(int var1) {
      return this.c.get(Integer.valueOf(var1));
   }

   public void a(int var1, IntBuffer var2) {
      this.c.put(Integer.valueOf(var1), var2);
   }

   public FloatBuffer b(int var1) {
      return this.d.get(Integer.valueOf(var1));
   }

   public void a(int var1, FloatBuffer var2) {
      this.d.put(Integer.valueOf(var1), var2);
   }

   public FloatBuffer c(int var1) {
      return this.e.get(Integer.valueOf(var1));
   }

   public void b(int var1, FloatBuffer var2) {
      this.e.put(Integer.valueOf(var1), var2);
   }

   public IntBuffer d(int var1) {
      if (this.b.a() && !this.b()) {
         a.error("failed to make room for int buffer");
      }

      return this.b.a(var1);
   }

   public FloatBuffer e(int var1) {
      if (this.b.a() && !this.b()) {
         a.error("failed to make room for float buffer");
      }

      return this.b.b(var1);
   }

   public boolean b() {
      if (this.e.size() * 16 > this.d.size() && this.d.size() > 0) {
         return this.e.a();
      } else {
         return this.d.size() * 2 > this.c.size() ? this.d.a() : this.c.a();
      }
   }

   @Override
   public void clear() {
      if (this.c != null) {
         this.c.clear();
      }

      if (this.d != null) {
         this.d.clear();
      }

      if (this.e != null) {
         this.e.clear();
      }
   }
}
