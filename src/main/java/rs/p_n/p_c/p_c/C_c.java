package rs.p_n.p_c.p_c;

public class C_c {
   private boolean a = false;
   private static final int[] b = new int[]{32177, 32167, 32166, 32184, 32181, 32178, 32176, 32170, 32169, 32168};

   public void a() {
      rs.p_n.C_e.l(32177).V = 0;
   }

   public void b() {
      rs.p_n.C_e.l(32021).bf = true;
      rs.p_n.C_e.l(32188).bf = false;

      for (int var4 : b) {
         rs.p_n.C_e.l(var4).bf = false;
      }

      this.a = true;
   }

   public void c() {
      this.a();
      rs.p_n.C_e.l(32021).bf = false;

      for (int var4 : b) {
         rs.p_n.C_e.l(var4).bf = true;
      }

      this.a = false;
   }

   public void a(C_c.a var1) {
      switch (var1) {
         case a:
            this.a(false);
            rs.p_n.C_e.l(32177).bf = false;
            rs.p_n.C_e.l(32178).bf = false;
            rs.p_n.C_e.l(32181).bf = false;
            rs.p_n.C_e.l(32188).bf = false;
            break;
         case c:
            this.a(true);
            rs.p_n.C_e.l(32177).bf = true;
            rs.p_n.C_e.l(32177).aH = 0;
            rs.p_n.C_e.l(32176).at = "@gre@Items have been claimed!";
            rs.p_n.C_e.l(32178).bf = false;
            rs.p_n.C_e.l(32181).bf = false;
            rs.p_n.C_e.l(32188).bf = true;
            break;
         case b:
            this.a(true);
            this.a(184);
            rs.p_n.C_e.l(32177).bf = true;
            rs.p_n.C_e.l(32177).aH = 500;
            rs.p_n.C_e.l(32176).at = "";
            rs.p_n.C_e.l(32178).bf = true;
            rs.p_n.C_e.l(32181).bf = true;
            rs.p_n.C_e.l(32188).bf = false;
      }
   }

   public void d() {
      rs.p_n.C_e.l(32177).aH = 0;
   }

   public void e() {
      rs.p_n.C_e.l(32177).aH = 500;
   }

   private void a(boolean var1) {
      rs.p_n.C_e.l(32170).bf = var1;
      rs.p_n.C_e.l(32176).bf = var1;
      rs.p_n.C_e.l(32167).bf = var1;
      if (var1) {
         this.a(184);
      } else {
         this.a(265);
      }
   }

   private void a(int var1) {
      C_a.cf = var1;
   }

   public boolean f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
