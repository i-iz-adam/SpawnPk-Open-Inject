package rs.p_h;

import java.awt.event.KeyEvent;
import rs.C_Client_mc;
import rs.p_n.p_c.C_h;

public class C_d {
   private int a;
   private String b;
   private C_Client_mc c;
   private boolean d;

   public C_d(C_Client_mc var1) {
      this.c = var1;
   }

   public void a(KeyEvent var1) {
      this.a = this.c.gp;
      int var2 = C_Client_mc.cH;
      int var3 = var1.getKeyCode();
      boolean var4 = var1.isControlDown();
      boolean var5 = var2 == 23000;
      if (this.e()) {
         if (var3 == 77) {
            this.a("::tm");
         }

         if (!this.c() && var3 == 72) {
            this.a("::home");
         }

         if (!this.c() && var3 == 84) {
            this.a("::opentp");
         }

         if (var3 == 76 && !this.d()) {
            this.a("::loot");
         }

         if (var3 == 66 && !var5) {
            this.a("::bank");
         }

         if (var3 == 67 && !this.c() && !this.d() && !var5) {
            this.a("::clogs");
         }

         if (var3 == 69 && !this.c() && !this.d()) {
            this.a("::e");
         }

         if (var3 == 83 && !var5) {
            C_Client_mc.fL = 13;
            C_Client_mc.fb = true;
            C_Client_mc.fM = true;
            this.c.gb = false;
            this.c.fN = 3;
            this.c.dY = "";
         }
      }
   }

   public void b(KeyEvent var1) {
      this.a = this.c.gp;
      int var2 = C_Client_mc.cH;
      int var3 = var1.getKeyCode();
      if (var2 == 23000 && !this.c()) {
         if (this.e() && var3 == 83) {
            C_h.a(this.c);
            return;
         }

         if (this.e() && var3 == 68) {
            this.a(38976);
            this.a(26012);
            this.a(26016);
            return;
         }

         if (this.e() && var3 == 82) {
            this.a(5294);
            return;
         }

         if (this.e() && var3 == 67) {
            this.a(38980);
            return;
         }
      }
   }

   public void a(String var1) {
      this.b = var1;
   }

   public void a(int var1) {
      C_Client_mc.fv.a(185);
      C_Client_mc.fv.d(var1);
   }

   public void a() {
      if (this.b != null) {
         this.b(this.b);
         this.b = null;
      }
   }

   private void b(String var1) {
      C_Client_mc.fv.a(103);
      C_Client_mc.fv.b(var1.length() - 1);
      C_Client_mc.fv.a(var1.substring(2));
   }

   private boolean c() {
      return this.a > 0;
   }

   private boolean d() {
      return C_Client_mc.cH > 0;
   }

   private boolean e() {
      return C_Client_mc.ch || System.currentTimeMillis() - C_Client_mc.ci < 100L;
   }

   public boolean b() {
      return this.d;
   }

   public void a(boolean var1) {
      this.d = var1;
   }
}
