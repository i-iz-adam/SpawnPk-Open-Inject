package rs.p_n.p_c.p_c;

import rs.C_Client_mc;
import rs.p_n.p_a.C_f;

public class C_b {
   private int a = 0;

   public void a() {
      C_a.d.b();
      rs.p_n.C_e.l(32023).V = 0;
      this.a = 0;
   }

   public void a(C_b.a var1, String var2) {
      int var3 = this.a;
      int var4 = 32026 + var3 * 4;
      rs.p_n.p_a.C_b var5 = rs.p_n.p_a.C_a.a(var4, C_a.cb, "View inbox message").b(var4 + 1, C_a.cc).h(149, 30);
      C_a.d.a(var4).a(0, 30 * var3);
      C_a.d.a(var4 + 1).a(0, 30 * var3);
      C_a.d.a(C_f.a(var4 + 3, var2).a()).a(3, 30 * var3 + 10);
      this.a(var3, var2);
      this.a(var3, var1);
      this.a++;
   }

   public void b() {
      rs.p_n.C_e var1 = C_a.l(32023);
      var1.aH = Math.max(C_a.d.d().size() * 30, 300);
      var1.V = 0;
      C_a.d.a();
   }

   public void a(int var1, C_b.a var2) {
      int var3 = 32026 + var1 * 4 + 3;
      C_f var4 = (C_f)rs.p_n.C_e.l(var3);
      var4.m(var2.a());
      if (var2 == C_b.a.a) {
         if (!var4.at.contains("<img=50>")) {
            var4.at = "<img=50> " + var4.at;
         }
      } else {
         var4.at = var4.at.replace("<img=50> ", "");
      }
   }

   public void a(int var1, String var2) {
      int var3 = 32026 + var1 * 4 + 3;
      C_f var4 = (C_f)rs.p_n.C_e.l(var3);
      var2 = C_Client_mc.gl.a(var2, "", 130, 0, 1);
      var4.at = var2;
      if (var2.contains("\\n")) {
         C_a.d.b(var3).a(3, 30 * var1 + 3);
      } else {
         C_a.d.b(var3).a(3, 30 * var1 + 10);
      }
   }

   public void a(int var1, boolean var2) {
      int var3 = 32026 + var1 * 4;
      int var4 = 32026 + var1 * 4 + 1;
      if (rs.p_n.C_e.l(var3) != null && rs.p_n.C_e.l(var4) != null && rs.p_n.C_e.l(var4 + 1) != null) {
         if (var2) {
            rs.p_n.C_e.l(var3).E = C_a.cd;
            rs.p_n.C_e.l(var3).aG = C_a.cd;
            rs.p_n.C_e.l(var4).E = C_a.ce;
            rs.p_n.C_e.l(var4).aG = C_a.ce;
            rs.p_n.C_e.l(var4 + 1).E = C_a.ce;
            rs.p_n.C_e.l(var4 + 1).aG = C_a.ce;
         } else {
            rs.p_n.C_e.l(var3).E = C_a.cb;
            rs.p_n.C_e.l(var3).aG = C_a.cb;
            rs.p_n.C_e.l(var4).E = C_a.cc;
            rs.p_n.C_e.l(var4).aG = C_a.cc;
            rs.p_n.C_e.l(var4 + 1).E = C_a.cc;
            rs.p_n.C_e.l(var4 + 1).aG = C_a.cc;
         }
      }
   }

   public void c() {
      for (int var1 = 0; var1 < this.a; var1++) {
         this.a(var1, false);
      }
   }

   public static enum a {
      a(3145498),
      b(12171349);

      private final int c;

      public int a() {
         return this.c;
      }

      private a(int var3) {
         this.c = var3;
      }
   }
}
