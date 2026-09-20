package rs.p_e;

import com.google.a.c.c;
import com.google.a.c.d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class C_f implements InvocationHandler {
   private static final Logger a = LoggerFactory.getLogger(C_f.class);
   private static final Object b = new Object();
   private final C_i c;
   private final c<Method, Object> d = com.google.a.c.d.a().a(256L).u();

   C_f(C_i var1) {
      this.c = var1;
   }

   @Override
   public Object invoke(Object var1, Method var2, Object[] var3) {
      if (var3 == null) {
         Object var4 = this.d.d(var2);
         if (var4 != null) {
            return var4 == b ? null : var4;
         }
      }

      Class<?> var12 = var1.getClass().getInterfaces()[0];
      if ("toString".equals(var2.getName()) && var3 == null) {
         return var12.getSimpleName();
      } else if ("hashCode".equals(var2.getName()) && var3 == null) {
         return System.identityHashCode(var1);
      } else if ("equals".equals(var2.getName()) && var3 != null && var3.length == 1) {
         return var1 == var3[0];
      } else {
         C_e var5 = var12.getAnnotation(C_e.class);
         C_g var6 = var2.getAnnotation(C_g.class);
         if (var5 == null) {
            a.warn("Configuration proxy class {} has no @ConfigGroup!", var1.getClass());
            return null;
         } else if (var6 == null) {
            a.warn("Configuration method {} has no @ConfigItem!", var2);
            return null;
         } else if (var3 != null) {
            if (var3.length != 1) {
               throw new RuntimeException("Invalid number of arguments to configuration method");
            } else {
               Object var13 = var3[0];
               Class var15 = var2.getParameterTypes()[0];
               Object var9 = this.c.a(var5.a(), var6.b(), var15);
               if (Objects.equals(var9, var13)) {
                  return null;
               } else {
                  if (var2.isDefault()) {
                     Object var10 = a(var1, var2, var3);
                     if (Objects.equals(var13, var10)) {
                        this.c.b(var5.a(), var6.b());
                        return null;
                     }
                  }

                  if (var13 == null) {
                     this.c.b(var5.a(), var6.b());
                  } else {
                     String var16 = this.c.a(var13);
                     this.c.b(var5.a(), var6.b(), var16);
                  }

                  return null;
               }
            }
         } else {
            a.trace("cache miss (size: {}, group: {}, key: {})", new Object[]{this.d.b(), var5.a(), var6.b()});
            String var7 = this.c.a(var5.a(), var6.b());
            if (var7 == null) {
               if (var2.isDefault()) {
                  Object var14 = a(var1, var2, null);
                  this.d.a(var2, var14 == null ? b : var14);
                  return var14;
               } else {
                  this.d.a(var2, b);
                  return null;
               }
            } else {
               try {
                  Object var8 = this.c.a(var7, var2.getGenericReturnType());
                  this.d.a(var2, var8 == null ? b : var8);
                  return var8;
               } catch (Exception var11) {
                  a.warn("Unable to unmarshal {}.{} ", new Object[]{var5.a(), var6.b(), var11});
                  return var2.isDefault() ? a(var1, var2, null) : null;
               }
            }
         }
      }
   }

   static Object a(Object var0, Method var1, Object[] var2) {
      Class var3 = var1.getDeclaringClass();
      return rs.p_A_uc.C_q.a(var3).unreflectSpecial(var1, var3).bindTo(var0).invokeWithArguments(var2);
   }

   void a() {
      a.trace("cache invalidate");
      this.d.c();
   }
}
