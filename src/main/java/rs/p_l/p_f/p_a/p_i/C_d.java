package rs.p_l.p_f.p_a.p_i;

public class C_d extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         C_b.m();
      }

      if (var1 == 1) {
         int var2 = this.g();
         int var3 = this.e();
         int var4 = this.c();
         int var5 = this.c();
         boolean var6 = this.e() == 1;
         C_e var7;
         switch (var3) {
            case 1:
               var7 = C_e.c;
               break;
            case 2:
               var7 = C_e.d;
               break;
            case 3:
               var7 = C_e.a;
               break;
            default:
               var7 = C_e.b;
         }

         C_b.a(var2, var7, var4, var5);
         if (C_b.l() && var6) {
            C_b.k().b(true);
         }
      }

      if (var1 == 3) {
         int var8 = this.e();
         C_g var10 = null;
         switch (var8) {
            case 0:
               var10 = null;
               break;
            case 1:
               var10 = C_g.a;
               break;
            case 2:
               var10 = C_g.b;
               break;
            case 3:
               var10 = C_g.c;
               break;
            case 4:
               var10 = C_g.d;
               break;
            case 5:
               var10 = C_g.e;
               break;
            case 6:
               var10 = C_g.f;
         }

         C_b.a(var10);
      }

      if (var1 == 4) {
         int var9 = this.g();
         C_b.k();
         C_b.a(var9);
      }
   }
}
