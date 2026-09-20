package rs.p_r;

import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;
import rs.C_R_uc;
import rs.p_gui.C_Launcher_mc;

public class C_K_uc {
   private static final C_R_uc a = new C_R_uc(0, 0, 0);
   private final int[] b = C_Client_mc.cy;
   private final C_c c;
   private final List<C_a> d;
   private final List<C_a> e;

   public C_K_uc(C_c var1) {
      this.c = var1;
      this.d = new ArrayList<>(C_c.i());
      this.e = new ArrayList<>();
   }

   public void a() {
      C_Client_mc var1 = C_Launcher_mc.n().o();
      this.e.clear();

      for (int var2 = 0; var2 < this.d.size(); var2++) {
         C_a var3 = this.d.get(var2);
         var3.c();
         if (var3.f()) {
            C_J_uc.a(var3);
            this.e.add(var3);
         } else if (!rs.p_k.C_e.a()) {
            int var4 = var3.k();
            int var5 = var3.l();
            int var6 = var3.m();
            boolean var7 = false;
            short var8 = 500;
            int var9 = Math.abs(var4 - C_Client_mc.eR.ac);
            int var10 = Math.abs(var6 - C_Client_mc.eR.ad);
            int var11 = Math.max(var9, var10);
            if (var11 >= var8) {
               var7 = true;
            }

            var1.a(this.b, var4, var5, var6);
            float var12 = var3.j();
            int var13 = (int)(var3.e() * 255.0F);
            int var14 = (int)(4.0F * var3.j());
            if (!var7) {
               float var15 = 200.0F;
               if (C_Client_mc.al >= 200) {
                  var15 = 40.0F;
               }

               if (var11 >= 300) {
                  var15 += 40.0F;
               }

               float var16 = (float)(30.0 - (double)((float)C_Client_mc.al / var15));
               var16 /= 10.0F;
               if (var11 >= 200) {
                  var16 = 0.0F;
               }

               if (var16 < 0.0F) {
                  var16 = 0.0F;
               }

               if (var1.cR <= 200) {
                  var14 = (int)((float)var14 + var16);
               } else if (var1.cR > 150 && var1.cR <= 245) {
                  var14 = (int)((double)var14 + (double)var16 * 0.75);
               } else {
                  var14 = (int)((float)var14 + var16 / 2.0F);
               }
            } else if (var11 >= 1000) {
               var14 = (int)((double)var14 * 0.9);
            }

            int var33 = 256 - var13;
            int var35 = (var3.i() >> 16 & 0xFF) * var13;
            int var17 = (var3.i() >> 8 & 0xFF) * var13;
            int var18 = (var3.i() & 0xFF) * var13;
            int var19 = this.b[1] - var14;
            if (var19 < 0) {
               var19 = 0;
            }

            int var20 = this.b[1] + var14;
            if (var20 >= rs.p_l.C_c.i) {
               var20 = rs.p_l.C_c.i - 1;
            }

            for (int var21 = var19; var21 <= var20; var21++) {
               int var22 = var21 - this.b[1];
               int var23 = (int)Math.sqrt((double)(var14 * var14 - var22 * var22));
               int var24 = this.b[0] - var23;
               if (var24 < 0) {
                  var24 = 0;
               }

               int var25 = this.b[0] + var23;
               if (var25 >= rs.p_l.C_c.h) {
                  var25 = rs.p_l.C_c.h - 1;
               }

               int var26 = var24 + var21 * rs.p_l.C_c.h;
               if (rs.p_l.C_E_uc.k != null
                  && var26 < rs.p_l.C_E_uc.k.length
                  && var26 + 1 < rs.p_l.C_E_uc.k.length
                  && var26 + (var25 - var24) + 2 < var1.gZ.c.length
                  && rs.p_l.C_E_uc.k != null
                  && (rs.p_l.C_E_uc.k[var26] >= (float)this.b[2] - var12 - 15.0F || rs.p_l.C_E_uc.k[var26++] >= (float)this.b[2] + var12 + 15.0F)) {
                  for (int var27 = var24; var27 <= var25; var27++) {
                     int var28 = (var1.gZ.c[var26] >> 16 & 0xFF) * var33;
                     int var29 = (var1.gZ.c[var26] >> 8 & 0xFF) * var33;
                     int var30 = (var1.gZ.c[var26] & 0xFF) * var33;
                     int var31 = (var35 + var28 >> 8 << 16) + (var17 + var29 >> 8 << 8) + (var18 + var30 >> 8);
                     rs.p_l.C_c.a(var1.gZ.c, var26++, var31, var31, 255);
                  }
               }
            }
         }
      }

      for (int var32 = 0; var32 < this.e.size(); var32++) {
         this.d.remove(this.e.get(var32));
      }
   }

   public List<C_a> b() {
      return this.d;
   }
}
