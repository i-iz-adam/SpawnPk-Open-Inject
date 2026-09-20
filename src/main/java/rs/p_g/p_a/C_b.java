package rs.p_g.p_a;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;

@Singleton
public class C_b {
   private static final Logger a = LoggerFactory.getLogger(C_b.class);
   private final C_Client_mc b;
   private final List<C_a> c = new CopyOnWriteArrayList<>();

   @Inject
   private C_b(@Nullable C_Client_mc var1) {
      this.b = var1;
   }

   public void a(C_a var1) {
      if (!this.c.contains(var1)) {
         a.debug("Registering key listener: {}", var1);
         this.c.add(var1);
      }
   }

   public void b(C_a var1) {
      boolean var2 = this.c.remove(var1);
      if (var2) {
         a.debug("Unregistered key listener: {}", var1);
      }
   }

   public void a(KeyEvent var1) {
      if (!var1.isConsumed()) {
         for (C_a var3 : this.c) {
            if (this.c(var3)) {
               a.trace("Processing key pressed {} for key listener {}", var1.paramString(), var3);
               var3.keyPressed(var1);
               if (var1.isConsumed()) {
                  a.debug("Consuming key pressed {} for key listener {}", var1.paramString(), var3);
                  break;
               }
            }
         }
      }
   }

   public void b(KeyEvent var1) {
      if (!var1.isConsumed()) {
         for (C_a var3 : this.c) {
            if (this.c(var3)) {
               a.trace("Processing key released {} for key listener {}", var1.paramString(), var3);
               var3.keyReleased(var1);
               if (var1.isConsumed()) {
                  a.debug("Consuming key released {} for listener {}", var1.paramString(), var3);
                  break;
               }
            }
         }
      }
   }

   public void c(KeyEvent var1) {
      if (!var1.isConsumed()) {
         for (C_a var3 : this.c) {
            if (this.c(var3)) {
               a.trace("Processing key typed {} for key listener {}", var1.paramString(), var3);
               var3.keyTyped(var1);
               if (var1.isConsumed()) {
                  a.debug("Consuming key typed {} for key listener {}", var1.paramString(), var3);
                  break;
               }
            }
         }
      }
   }

   private boolean c(C_a var1) {
      return this.b == null ? true : true;
   }
}
