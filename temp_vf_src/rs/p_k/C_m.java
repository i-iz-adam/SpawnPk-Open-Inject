package rs.p_k;

import com.google.a.a.d;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL43C;

public class C_m {
   @d
   final List<C_m.a> a = new ArrayList<>();

   public C_m a(int var1, String var2) {
      this.a.add(new C_m.a(var1, var2));
      return this;
   }

   public int a(rs.p_k.p_d.C_a var1) {
      int var2 = GL43C.glCreateProgram();
      int[] var3 = new int[this.a.size()];
      int var4 = 0;
      boolean var5 = false;

      try {
         while (var4 < var3.length) {
            C_m.a var6 = this.a.get(var4);
            int var7 = GL43C.glCreateShader(var6.a);
            if (var7 == 0) {
               throw new C_n("Unable to create shader of type " + var6.a);
            }

            String var8 = var1.b(var6.b);
            GL43C.glShaderSource(var7, var8);
            GL43C.glCompileShader(var7);
            if (GL43C.glGetShaderi(var7, 35713) != 1) {
               String var9 = GL43C.glGetShaderInfoLog(var7);
               GL43C.glDeleteShader(var7);
               throw new C_n(var9);
            }

            GL43C.glAttachShader(var2, var7);
            var3[var4++] = var7;
         }

         GL43C.glLinkProgram(var2);
         if (GL43C.glGetProgrami(var2, 35714) == 0) {
            String var15 = GL43C.glGetProgramInfoLog(var2);
            throw new C_n(var15);
         }

         GL43C.glValidateProgram(var2);
         if (GL43C.glGetProgrami(var2, 35715) == 0) {
            String var14 = GL43C.glGetProgramInfoLog(var2);
            throw new C_n(var14);
         }

         var5 = true;
      } finally {
         while (var4 > 0) {
            int var11 = var3[--var4];
            GL43C.glDetachShader(var2, var11);
            GL43C.glDeleteShader(var11);
         }

         if (!var5) {
            GL43C.glDeleteProgram(var2);
         }
      }

      return var2;
   }

   @d
   static class a {
      private final int a;
      private final String b;

      public a(int var1, String var2) {
         this.a = var1;
         this.b = var2;
      }

      public int a() {
         return this.a;
      }

      public String b() {
         return this.b;
      }
   }
}
