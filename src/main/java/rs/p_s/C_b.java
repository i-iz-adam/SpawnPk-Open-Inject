package rs.p_s;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

class C_b extends URLClassLoader {
   private final ClassLoader a;

   C_b(File var1, ClassLoader var2) {
      super(new URL[]{var1.toURI().toURL()}, null);
      this.a = var2;
   }

   @Override
   public Class<?> loadClass(String var1) {
      try {
         return super.loadClass(var1);
      } catch (ClassNotFoundException var3) {
         return this.a.loadClass(var1);
      }
   }
}
