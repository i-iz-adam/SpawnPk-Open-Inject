package rs.p_s.p_j;

import com.google.a.b.as;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import rs.C_Client_mc;

class C_b implements rs.p_g.p_a.C_a {
   @Inject
   private C_c a;
   @Inject
   private C_a b;
   @Inject
   private C_Client_mc c;
   private final Map<Integer, Integer> d = new HashMap<>();
   private final Set<Character> e = new HashSet<>();

   @Override
   public void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (var2 != '\uffff' && this.e.contains(var2) && this.a.h()) {
         var1.consume();
      }
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (this.a.h()) {
         if (!var1.isControlDown()) {
            if (!this.a.j()) {
               byte var2 = 0;
               if (this.b.a()) {
                  if (this.b.b().a(var1)) {
                     var2 = 38;
                  } else if (this.b.c().a(var1)) {
                     var2 = 40;
                  } else if (this.b.d().a(var1)) {
                     var2 = 37;
                  } else if (this.b.e().a(var1)) {
                     var2 = 39;
                  }
               }

               if (this.b.f() && !this.a.i()) {
                  if (this.b.g().a(var1)) {
                     var2 = 112;
                  } else if (this.b.h().a(var1)) {
                     var2 = 113;
                  } else if (this.b.i().a(var1)) {
                     var2 = 114;
                  } else if (this.b.j().a(var1)) {
                     var2 = 115;
                  } else if (this.b.k().a(var1)) {
                     var2 = 116;
                  } else if (this.b.l().a(var1)) {
                     var2 = 117;
                  } else if (this.b.m().a(var1)) {
                     var2 = 118;
                  } else if (this.b.n().a(var1)) {
                     var2 = 119;
                  } else if (this.b.o().a(var1)) {
                     var2 = 120;
                  } else if (this.b.p().a(var1)) {
                     var2 = 121;
                  } else if (this.b.q().a(var1)) {
                     var2 = 122;
                  } else if (this.b.r().a(var1)) {
                     var2 = 123;
                  }
               }

               if (var2 != 0 && var2 != var1.getKeyCode()) {
                  char var3 = var1.getKeyChar();
                  this.d.put(var1.getKeyCode(), Integer.valueOf(var2));
                  var1.setKeyCode(var2);
                  var1.setKeyChar('\uffff');
                  if (var3 != '\uffff') {
                     this.e.add(var3);
                  }
               }

               switch (var1.getKeyCode()) {
                  case 10:
                  case 47:
                  case 59:
                  case 513:
                     rs.p_h.C_c.a(() -> {
                        this.a.g();
                        if (var1.getKeyCode() == 47) {
                           if (C_Client_mc.dk.isEmpty()) {
                              this.c.bw = true;
                           }

                           C_Client_mc.dk = C_Client_mc.dk + var1.getKeyChar();
                        }

                        if (var1.getKeyCode() == 59) {
                           if (C_Client_mc.dk.isEmpty()) {
                              this.c.bw = true;
                           }

                           C_Client_mc.dk = C_Client_mc.dk + ":";
                        }
                     });
               }
            } else {
               switch (var1.getKeyCode()) {
                  case 8:
                     rs.p_h.C_c.a(() -> {
                        if (as.c(C_Client_mc.dk)) {
                           SwingUtilities.invokeLater(() -> this.a.a(false));
                           this.a.f();
                        }
                     });
                     break;
                  case 10:
                     this.a.a(false);
                     rs.p_h.C_c.a(() -> this.a.f());
                     break;
                  case 27:
                     var1.consume();
                     this.a.a(false);
               }
            }
         }
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      char var3 = var1.getKeyChar();
      if (var3 != '\uffff') {
         this.e.remove(var3);
      }

      Integer var4 = this.d.remove(var2);
      if (var4 != null) {
         var1.setKeyCode(var4);
         var1.setKeyChar('\uffff');
      }
   }
}
