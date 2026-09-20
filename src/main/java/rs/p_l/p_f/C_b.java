package rs.p_l.p_f;

import java.awt.Color;
import java.awt.Shape;
import java.awt.Stroke;
import rs.C_Client_mc;
import rs.p_l.C_E_uc;

public abstract class C_b {
   protected C_Client_mc a;
   protected boolean b = true;
   private int e;
   private C_a f;
   private C_a g;
   protected int c;
   protected int d;

   public abstract void a();

   public void b() {
   }

   public void c() {
   }

   public void a(C_a var1) {
      this.f = var1;
      this.g = var1;
   }

   protected void a(rs.p_runelite.p_a.C_f var1, String var2, Color var3, int var4) {
      rs.p_runelite.p_a.C_i var5 = rs.p_runelite.p_a.C_h.a(C_e.d().b(this.f), var1, var2, 0);
      if (var5 != null) {
         C_m.a(C_e.d().b(this.f), var5, var2, var3);
      }
   }

   protected void a(Shape var1, Color var2) {
      C_m.a(C_e.d().b(this.f), var1, var2, C_m.a());
   }

   protected void a(Shape var1, Color var2, Color var3) {
      C_m.a(C_e.d().b(this.f), var1, var2, var3, C_m.a());
   }

   protected void a(Shape var1, Color var2, Color var3, Stroke var4) {
      C_m.a(C_e.d().b(this.f), var1, var2, var3, var4);
   }

   protected void b(Shape var1, Color var2, Color var3, Stroke var4) {
      C_m.b(C_e.d().b(this.f), var1, var2, var3, var4);
   }

   protected void a(rs.p_runelite.p_a.C_i var1, String var2, Color var3) {
      if (var1 != null) {
         C_m.a(C_e.d().b(this.f), var1, var2, var3);
      }
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, rs.p_s.p_s.C_b.p, rs.p_s.p_s.C_b.r, rs.p_s.p_s.C_b.q);
   }

   protected void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      rs.p_l.C_c.b(var4, var2, var1, var5, var3, rs.p_l.C_h.ap != 256 ? rs.p_l.C_h.ap : 200);
      if (rs.p_l.C_h.ap != 256) {
         rs.p_l.C_c.e(var1, var3, var4, var7, var2, rs.p_l.C_h.ap);
      } else {
         rs.p_l.C_c.d(var1, var3, var4, var7, var2);
      }

      byte var8 = 1;
      if (rs.p_l.C_h.ap != 256) {
         rs.p_l.C_c.e(var1 - var8, var3 + var8 * 2, var4 + var8 * 2, var6, var2 - var8, rs.p_l.C_h.ap);
      } else {
         rs.p_l.C_c.d(var1 - var8, var3 + var8 * 2, var4 + var8 * 2, var6, var2 - var8);
      }
   }

   protected void a(int var1, int var2, int var3) {
      if (var1 >= 128 && var2 >= 128 && var1 <= 13056 && var2 <= 13056) {
         int var4 = this.a.c(C_Client_mc.dw, var2, var1) - var3;
         var1 -= C_Client_mc.cJ;
         var4 -= C_Client_mc.cK;
         var2 -= C_Client_mc.cL;
         int var5 = rs.p_a.C_h.bA[this.a.cR];
         int var6 = rs.p_a.C_h.bB[this.a.cR];
         int var7 = rs.p_a.C_h.bA[this.a.cS];
         int var8 = rs.p_a.C_h.bB[this.a.cS];
         int var9 = var2 * var7 + var1 * var8 >> 16;
         var2 = var2 * var8 - var1 * var7 >> 16;
         var9 = var4 * var6 - var2 * var5 >> 16;
         var2 = var4 * var5 + var2 * var6 >> 16;
         if (var2 >= 50) {
            this.c = C_E_uc.s + (var9 << 9) / var2;
            this.d = C_E_uc.t + (var9 << 9) / var2;
         } else {
            this.c = -1;
            this.d = -1;
         }
      } else {
         this.c = -1;
         this.d = -1;
      }
   }

   protected int a(int var1, int var2) {
      int var3 = this.d() - var1;
      int var4 = this.e() - var2;
      return (int)Math.ceil(Math.sqrt((double)(var3 * var3 + var4 * var4)));
   }

   protected boolean b(int var1, int var2) {
      return var1 >= 128 && var2 >= 128 && var1 <= 13056 && var2 <= 13056;
   }

   protected int d() {
      return C_Client_mc.eh + (C_Client_mc.eR.ac - 6 >> 7);
   }

   protected int e() {
      return C_Client_mc.ei + (C_Client_mc.eR.ad - 6 >> 7);
   }

   public void a(C_Client_mc var1) {
      this.a = var1;
   }

   public C_Client_mc f() {
      return this.a;
   }

   public boolean g() {
      return this.b;
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   public int h() {
      return this.e;
   }

   public C_a i() {
      return this.f;
   }

   public void b(C_a var1) {
      this.f = var1;
   }

   public C_a j() {
      return this.g;
   }
}
