package rs.p_e;

import com.google.a.b.as;
import com.google.a.d.ag;
import com.google.c.l;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_ClientShutdown_mc;
import rs.p_runelite.p_events.C_ConfigChanged_mc;

@Singleton
public class C_i {
   private static final Logger a = LoggerFactory.getLogger(C_i.class);
   private final l b;
   private final C_EventBus_mc c;
   private final C_c d = new C_c(new File(rs.p_v.C_a.b() + File.separator + "config.properties"));
   private final C_f e = new C_f(this);

   @Inject
   public C_i(C_EventBus_mc var1, l var2) {
      this.c = var1;
      this.b = var2;
   }

   public void a() {
   }

   public <T extends C_b> T a(Class<T> var1) {
      if (!Modifier.isPublic(var1.getModifiers())) {
         throw new RuntimeException("Non-public configuration classes can't have default methods invoked");
      } else {
         return (T)Proxy.newProxyInstance(var1.getClassLoader(), new Class[]{var1}, this.e);
      }
   }

   public String a(String var1, String var2) {
      return this.d.a(a(var1, null, var2));
   }

   public static String a(String var0, String var1, String var2) {
      return var1 == null ? var0 + "." + var2 : var0 + "." + var1 + "." + var2;
   }

   public <T extends C_b> void a(T var1, boolean var2) {
      Class var3 = var1.getClass().getInterfaces()[0];
      C_e var4 = var3.getAnnotation(C_e.class);
      if (var4 != null) {
         for (Method var8 : var3.getDeclaredMethods()) {
            C_g var9 = var8.getAnnotation(C_g.class);
            if (var9 != null && var8.getParameterCount() == 0) {
               if (!var8.isDefault()) {
                  if (var2) {
                     String var15 = this.a(var4.a(), var9.b());
                     if (var15 != null) {
                        this.b(var4.a(), var9.b());
                     }
                  }
               } else {
                  if (!var2) {
                     Object var10 = this.a(var4.a(), var9.b(), var8.getGenericReturnType());
                     if (var10 != null) {
                        continue;
                     }
                  }

                  Object var14;
                  try {
                     var14 = C_f.a(var1, var8, null);
                  } catch (Throwable var13) {
                     a.warn(null, var13);
                     continue;
                  }

                  String var11 = this.a(var4.a(), var9.b());
                  String var12 = this.a(var14);
                  if (!Objects.equals(var11, var12) && (!as.c(var11) || !as.c(var12))) {
                     a.debug("Setting default configuration value for {}.{} to {}", new Object[]{var4.a(), var9.b(), var14});
                     this.b(var4.a(), var9.b(), var12);
                  }
               }
            }
         }
      }
   }

   public List<String> a(String var1) {
      return this.d.a().stream().filter(var1x -> var1x.startsWith(var1)).collect(Collectors.toList());
   }

   public <T> void a(String var1, String var2, String var3, T var4) {
      this.a(var1, var2, var3, this.a(var4));
   }

   public <T> void a(String var1, String var2, T var3) {
      this.a(var1, null, var2, var3);
   }

   public void b(String var1, String var2, String var3) {
      this.a(this.d, var1, null, var2, var3);
   }

   public void a(String var1, String var2, String var3, @NonNull String var4) {
      if (var4 == null) {
         throw new NullPointerException("value is marked non-null but is null");
      } else {
         this.a(this.d, var1, null, var3, var4);
      }
   }

   private void a(C_c var1, String var2, String var3, String var4, @NonNull String var5) {
      if (var5 == null) {
         throw new NullPointerException("value is marked non-null but is null");
      } else if (!as.c(var2) && !as.c(var4) && var4.indexOf(58) == -1 && !var4.startsWith("$")) {
         String var6 = a(var2, var3, var4);
         String var7 = var1.a(var6, var5);
         if (!Objects.equals(var7, var5)) {
            this.e.a();
            C_ConfigChanged_mc var8 = new C_ConfigChanged_mc();
            var8.setGroup(var2);
            var8.setProfile(var3);
            var8.setKey(var4);
            var8.setOldValue(var7);
            var8.setNewValue(var5);
            this.c.post(var8);
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   private void a(C_c var1, String var2, String var3, String var4) {
      String var5 = a(var2, var3, var4);
      String var6 = var1.b(var5);
      if (var6 != null) {
         this.e.a();
         C_ConfigChanged_mc var7 = new C_ConfigChanged_mc();
         var7.setGroup(var2);
         var7.setProfile(var3);
         var7.setKey(var4);
         var7.setOldValue(var6);
         this.c.post(var7);
      }
   }

   private String b(C_c var1, String var2, String var3, String var4) {
      return var1.a(a(var2, var3, var4));
   }

   public <T> T a(String var1, String var2, Type var3) {
      return this.a(var1, null, var2, var3);
   }

   public String c(String var1, String var2, String var3) {
      return this.b(this.d, var1, null, var3);
   }

   public <T> T a(String var1, String var2, String var3, Type var4) {
      String var5 = this.c(var1, var2, var3);
      if (!as.c(var5)) {
         try {
            return (T)this.a(var5, var4);
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      return null;
   }

   public void d(String var1, String var2, String var3) {
      this.a(this.d, var1, null, var3);
   }

   public void b(String var1, String var2) {
      this.a(this.d, var1, null, var2);
   }

   @C_Subscribe_mc(
      priority = -100.0F
   )
   private void onClientShutdown(C_ClientShutdown_mc var1) {
      this.b();
   }

   public void b() {
      this.a(this.d);
   }

   private void a(C_c var1) {
      Map var2 = var1.c();
      if (!var2.isEmpty()) {
         a.debug("Saving profile (patch size: {})", var2.size());
         var1.b(var2);
      }
   }

   Object a(String var1, Type var2) {
      if (var2 == boolean.class || var2 == Boolean.class) {
         return Boolean.parseBoolean(var1);
      } else if (var2 == int.class || var2 == Integer.class) {
         return Integer.parseInt(var1);
      } else if (var2 == long.class || var2 == Long.class) {
         return Long.parseLong(var1);
      } else if (var2 == double.class || var2 == Double.class) {
         return Double.parseDouble(var1);
      } else if (var2 == Color.class) {
         return rs.p_A_uc.C_g.c(var1);
      } else if (var2 == Dimension.class) {
         String[] var11 = var1.split("x");
         int var14 = Integer.parseInt(var11[0]);
         int var17 = Integer.parseInt(var11[1]);
         return new Dimension(var14, var17);
      } else if (var2 == Point.class) {
         String[] var10 = var1.split(":");
         int var13 = Integer.parseInt(var10[0]);
         int var16 = Integer.parseInt(var10[1]);
         return new Point(var13, var16);
      } else if (var2 == Rectangle.class) {
         String[] var9 = var1.split(":");
         int var12 = Integer.parseInt(var9[0]);
         int var15 = Integer.parseInt(var9[1]);
         int var6 = Integer.parseInt(var9[2]);
         int var7 = Integer.parseInt(var9[3]);
         return new Rectangle(var12, var15, var6, var7);
      } else if (var2 instanceof Class && ((Class)var2).isEnum()) {
         return Enum.valueOf((Class)var2, var1);
      } else if (var2 == Instant.class) {
         return Instant.parse(var1);
      } else if (var2 == rs.p_s.p_b.C_l.class || var2 == rs.p_s.p_b.C_m.class) {
         String[] var8 = var1.split(":");
         int var4 = Integer.parseInt(var8[0]);
         int var5 = Integer.parseInt(var8[1]);
         return var2 == rs.p_s.p_b.C_m.class ? new rs.p_s.p_b.C_m(var4, var5) : new rs.p_s.p_b.C_l(var4, var5);
      } else if (var2 == Duration.class) {
         return Duration.ofMillis(Long.parseLong(var1));
      } else if (var2 == byte[].class) {
         return Base64.getUrlDecoder().decode(var1);
      } else {
         if (var2 instanceof ParameterizedType) {
            ParameterizedType var3 = (ParameterizedType)var2;
            if (var3.getRawType() == Set.class) {
               return this.b.a(var1, var3);
            }
         }

         return var1;
      }
   }

   public C_d a(C_b var1) {
      Class var2 = var1.getClass().getInterfaces()[0];
      C_e var3 = var2.getAnnotation(C_e.class);
      if (var3 == null) {
         throw new IllegalArgumentException("Not a config group");
      } else {
         List var4 = Arrays.stream(var2.getDeclaredFields())
            .filter(var0 -> var0.isAnnotationPresent(C_l.class) && var0.getType() == String.class)
            .map(var1x -> {
               try {
                  return new C_m(String.valueOf(var1x.get(var2)), var1x.getDeclaredAnnotation(C_l.class));
               } catch (IllegalAccessException var3x) {
                  a.warn("Unable to load section {}::{}", var2.getSimpleName(), var1x.getName());
                  return null;
               }
            })
            .filter(Objects::nonNull)
            .sorted((var0, var1x) -> ag.a().a(var0.e().c(), var1x.e().c()).a(var0.e().a(), var1x.e().a()).b())
            .collect(Collectors.toList());
         List var5 = Arrays.stream(var2.getMethods())
            .filter(var0 -> var0.getParameterCount() == 0 && var0.isAnnotationPresent(C_g.class))
            .map(
               var0 -> new C_h(
                     var0.getDeclaredAnnotation(C_g.class),
                     var0.getGenericReturnType(),
                     var0.getDeclaredAnnotation(C_o.class),
                     var0.getDeclaredAnnotation(C_a.class),
                     var0.getDeclaredAnnotation(C_q.class)
                  )
            )
            .sorted((var0, var1x) -> ag.a().a(var0.d().a(), var1x.d().a()).a(var0.d().c(), var1x.d().c()).b())
            .collect(Collectors.toList());
         return new C_d(var3, var4, var5);
      }
   }

   @Nullable
   String a(Object var1) {
      if (var1 instanceof Color) {
         return String.valueOf(((Color)var1).getRGB());
      } else if (var1 instanceof Enum) {
         return ((Enum)var1).name();
      } else if (var1 instanceof Dimension) {
         Dimension var5 = (Dimension)var1;
         return var5.width + "x" + var5.height;
      } else if (var1 instanceof Point) {
         Point var4 = (Point)var1;
         return var4.x + ":" + var4.y;
      } else if (var1 instanceof Rectangle) {
         Rectangle var3 = (Rectangle)var1;
         return var3.x + ":" + var3.y + ":" + var3.width + ":" + var3.height;
      } else if (var1 instanceof Instant) {
         return ((Instant)var1).toString();
      } else if (var1 instanceof rs.p_s.p_b.C_l) {
         rs.p_s.p_b.C_l var2 = (rs.p_s.p_b.C_l)var1;
         return var2.a() + ":" + var2.b();
      } else if (var1 instanceof Duration) {
         return Long.toString(((Duration)var1).toMillis());
      } else if (var1 instanceof byte[]) {
         return Base64.getUrlEncoder().encodeToString((byte[])var1);
      } else if (var1 instanceof Set) {
         return this.b.b(var1, Set.class);
      } else {
         return var1 == null ? null : var1.toString();
      }
   }
}
