package rs.p_gui.p_b;

import java.lang.invoke.StringConcatFactory;
import java.util.LinkedHashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import rs.p_gui.C_Launcher_mc;

public class C_d extends LinkedHashMap<String, C_c> {
   private C_h a;
   private String b;
   private C_a c;

   public C_d(C_h var1) {
      this.a = var1;
   }

   public void a(String var1, C_a var2) {
      this.b = var1;
      this.c = var2;
      this.b();
   }

   public void a(String var1, int var2) {
      if (!this.containsKey(var1)) {
         this.a(null, null);
      } else {
         if (var2 < 0 || var2 >= this.get(var1).size()) {
            var2 = 0;
         }

         this.b = var1;
         this.c = this.get(var1).get(var2);
         this.b();
      }
   }

   public void a(String var1) {
      if (this.c(var1)) {
         C_c var2 = new C_c(var1);
         var2.add(new C_a("Default"));
         this.put(var1, var2);
         this.a.d();
         this.a.b();
         this.a(var1, var2);
         this.a.e().b();
         this.a(var1, 0);
         this.a.d();
         this.a.b();
      }
   }

   public void a(String var1, String var2) {
      if (this.c(var2)) {
         C_d var3 = new C_d(this.a);
         boolean var4 = false;

         for (String var6 : this.keySet()) {
            if (var6.equals(var1)) {
               var3.put(var2, this.get(var6));
               var4 = true;
            } else {
               var3.put(var6, this.get(var6));
            }
         }

         if (var4) {
            this.clear();

            for (String var8 : var3.keySet()) {
               this.put(var8, var3.get(var8));
            }

            if (this.b.equals(var1)) {
               this.a(var2, this.c);
            }

            this.a.e().a(var1);
            this.a.e().a(var2, this.get(var2));
         }

         this.a.d();
         this.a.e().b();
      }
   }

   public void b(String var1) {
      if (this.size() <= 1) {
         JOptionPane.showMessageDialog(null, "You can't delete your only folder!", "Oops!", 2);
      } else {
         this.remove(var1);
         this.a.e().a(var1);
         String var2 = "";
         this.a((String)this.keySet().toArray()[0], 0);
         this.a.h().setSelectedIndex(0);
         this.a.d();
         this.a.b();
         this.a.e().b();
      }
   }

   public C_a b(String var1, String var2) {
      C_c var3 = this.get(var1);

      for (C_a var5 : var3) {
         if (var5.f().equals(var2)) {
            JOptionPane.showMessageDialog(null, "You already have a loadout with this name!", "Oops!", 2);
            return null;
         }
      }

      C_a var6 = new C_a(var2);
      var3.add(var6);
      this.put(var1, var3);
      this.a.e().a(var1, var3);
      this.a.h().addItem(var2);
      this.c = var6;
      this.a.h().setSelectedItem(var2);
      this.a.a();
      return var6;
   }

   public void a(String var1, C_a var2, String var3) {
      if (var3 != null && !var3.equals("") && !var3.isEmpty()) {
         if (!var3.equalsIgnoreCase(var2.f())) {
            for (C_a var5 : this.get(var1)) {
               if (var5.f().equalsIgnoreCase(var3)) {
                  JOptionPane.showMessageDialog(null, "You already have that name in this folder!", "Oops!", 2);
                  return;
               }
            }
         }

         String var11 = StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(var2.f());
         var2.a(var3);
         C_c var12 = new C_c(var3);
         C_c var6 = this.get(var1);
         int var7 = 0;
         int var8 = 0;

         for (C_a var10 : var6) {
            if (var10.f().equals(var3)) {
               var7 = var8;
            }

            var12.add(var10);
            var8++;
         }

         this.put(var1, var12);
         this.a.e().a(var1, var12);
         this.a.a(var7);
         C_Launcher_mc.n().a(500, true);
      } else {
         JOptionPane.showMessageDialog(null, "Your loadout name can't be empty!", "Oops!", 2);
      }
   }

   public void a(String var1, int var2, int var3) {
      C_c var4 = this.get(var1);
      if (var2 != var3 && var2 >= 0 && var2 < var4.size() && var3 >= 0 && var3 < var4.size()) {
         if (var4.get(var2) != null && var4.get(var3) != null) {
            C_a var5 = var4.get(var2);
            C_a var6 = var4.get(var3);
            var4.set(var2, var6);
            var4.set(var3, var5);
            this.put(var1, var4);
            this.a.e().a(var1, var4);
            this.a.e().b();
            this.a.a(var3);
            this.a.h().showPopup();
         }
      }
   }

   public void c(String var1, String var2) {
      C_d var3 = new C_d(this.a);

      for (String var5 : this.keySet()) {
         if (var5.equalsIgnoreCase(var1)) {
            var3.put(var2, this.get(var2));
         } else if (var5.equalsIgnoreCase(var2)) {
            var3.put(var1, this.get(var1));
         } else {
            var3.put(var5, this.get(var5));
         }
      }

      this.clear();

      for (String var8 : var3.keySet()) {
         this.put(var8, var3.get(var8));
      }

      this.a(var1, 0);
      this.a.h().setSelectedIndex(0);
      this.a.d();
      this.a.b();
      this.a.e().b();
      JButton var7 = this.a.i();
      this.a.j().show(var7, 1, 1);
   }

   public void d(String var1, String var2) {
      C_c var3 = this.get(var1);
      if (var3.size() == 1) {
         JOptionPane.showMessageDialog(null, "You can't delete the only loadout on your folder!", "Oops!", 2);
      } else {
         C_a var4 = null;

         for (C_a var6 : var3) {
            if (var6.f().equals(var2)) {
               var4 = var6;
            }
         }

         if (var4 != null) {
            var3.remove(var4);
            this.a.e().a(var1, var3);
         }

         this.a.h().removeItem(var2);
         this.a(this.b, 0);
         this.a.h().setSelectedIndex(0);
         this.a.a();
      }
   }

   public void a(String var1, C_c var2) {
      this.a.e().a(var1, var2);
      this.a.e().b();
   }

   public void a() {
      if (this.b != null) {
         this.a(this.b, this.get(this.b));
      }
   }

   public void b() {
      this.a.g().a(this.c);
   }

   private boolean c(String var1) {
      if (var1 != null && !var1.equals("") && !var1.isEmpty()) {
         for (String var3 : this.keySet()) {
            if (var3.equalsIgnoreCase(var1)) {
               JOptionPane.showMessageDialog(null, "You already have a folder with this name!", "Oops!", 2);
               return false;
            }
         }

         for (char var5 : var1.toLowerCase().toCharArray()) {
            boolean var6 = false;

            for (char var10 : rs.p_gui.p_b.p_c.C_a.c) {
               if (var5 == var10) {
                  var6 = true;
                  break;
               }
            }

            if (!var6) {
               JOptionPane.showMessageDialog(null, "You can only have letters and numbers in your folder name!", "Oops!", 2);
               return false;
            }
         }

         return true;
      } else {
         JOptionPane.showMessageDialog(null, "Your folder name can't be empty!", "Oops!", 2);
         return false;
      }
   }

   public C_a c() {
      return this.c;
   }

   public C_c d() {
      return this.get(this.b);
   }

   public String e() {
      return this.b;
   }
}
