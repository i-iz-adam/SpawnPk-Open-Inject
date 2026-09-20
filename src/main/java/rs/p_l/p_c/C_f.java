package rs.p_l.p_c;

import rs.C_Client_mc;
import rs.p_l.C_F_uc;
import rs.p_n.p_c.C_aD_mc;

public class C_f extends C_d {
   private int c;
   private C_F_uc[] d = new C_F_uc[3];
   private C_e[] e = new C_e[]{
      new C_e("Blood vengeance I", 245, 242),
      new C_e("Blood vengeance II", 245, 170),
      new C_e("Treasure hunter I", 363, 200),
      new C_e("Treasure hunter II", 430, 200),
      new C_e("Blood whip", 365, 125),
      new C_e("Blood rune c'bow", 421, 92),
      new C_e("Blood dark bow", 305, 92),
      new C_e("Diamonds are forever", 365, 52),
      new C_e("Bloodthirsty I", 121, 201),
      new C_e("Bloodthirsty II", 60, 167),
      new C_e("Killjoy I", 121, 124),
      new C_e("Killjoy II", 60, 90),
      new C_e("Blood pool", 120, 52),
      new C_e("Blood staff", 305, 163),
      new C_e("Blood ring", 421, 162),
      new C_e("Treasure buddy", 430, 245),
      new C_e("Emblem snatcher", 181, 90),
      new C_e("Augury", 223, 130),
      new C_e("Rigour", 269, 130),
      new C_e("Bloodlust", 17, 215),
      new C_e("Excavator", 180, 171),
      new C_e("War diamonds", 14, 126),
      new C_e("Unholy smite", 246, 92),
      new C_e("Eternal recoil", 202, 50),
      new C_e("Eternal blood cape", 289, 50),
      new C_e("Vampiric damage", 63, 26),
      new C_e("Vampiric defence", 425, 27)
   };
   private boolean f;

   public C_f(C_Client_mc var1) {
      super(var1);
      this.c = 0;
   }

   @Override
   public void a() {
      if (C_Client_mc.cH != C_aD_mc.bI) {
         this.c = -1;
      } else {
         if (!this.f) {
            this.d[0] = new C_F_uc("fountain/sprite 1");
            this.d[1] = new C_F_uc("fountain/sprite 2");
            this.d[2] = new C_F_uc("fountain/sprite 3");
            this.f = true;
         }

         if (this.c == -1) {
            this.c = 0;
            C_Client_mc.ap = "::selectperk 0";
         }

         int var1 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ai / 2 - 356;
         int var2 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ah / 2 - 230;

         for (int var3 = 0; var3 < this.e.length; var3++) {
            C_F_uc var4 = this.d[this.e[var3].d()];
            int var5 = Integer.valueOf(this.e[var3].b()) + var1;
            int var6 = Integer.valueOf(this.e[var3].c()) + var2;
            if (this.c == var3) {
               var4 = this.d[2];
            }

            var4.c(var5, var6);
         }

         for (int var7 = 0; var7 < this.e.length; var7++) {
            String var8 = this.e[var7].a();
            int var9 = this.e[var7].b() + var1;
            int var10 = this.e[var7].c() + var2;
            if (C_Client_mc.hP >= var9 && C_Client_mc.hP <= var9 + 32 && C_Client_mc.hQ >= var10 && C_Client_mc.hQ <= var10 + 32) {
               this.a.b(C_Client_mc.hP, C_Client_mc.hQ - 10, " @gre@" + var8 + " ");
            }
         }
      }
   }

   @Override
   public boolean b() {
      int var1 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ai / 2 - 356;
      int var2 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ah / 2 - 230;

      for (int var3 = 0; var3 < this.e.length; var3++) {
         int var4 = this.e[var3].b() + var1;
         int var5 = this.e[var3].c() + var2;
         if (C_Client_mc.hP >= var4 && C_Client_mc.hP <= var4 + 32 && C_Client_mc.hQ >= var5 && C_Client_mc.hQ <= var5 + 32) {
            this.c = var3;
            C_Client_mc.ap = "::selectperk " + var3;
         }
      }

      return false;
   }

   public void a(int var1) {
      this.e[var1].a(1);
   }

   public void b(int var1) {
      this.e[var1].a(0);
   }

   public void c(int var1) {
      this.c = var1;
   }
}
