package rs.p_l.p_e;

import java.awt.Color;
import java.awt.Polygon;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_n {
   public Polygon a;
   public Color b;
   public Color c;
   public String d;
   public int e;
   public int f;

   public C_n(Polygon var1, Color var2, Color var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static C_n a(rs.p_a.C_c var0, Color var1, Color var2) {
      byte var3 = 1;
      if (var0 instanceof rs.p_a.C_j) {
         rs.p_a.C_j var4 = (rs.p_a.C_j)var0;
         if (var4.aG != null) {
            var3 = var4.aG.r;
         }
      }

      return new C_n(var0.a(var3), var1, var2);
   }

   public static C_n a(int var0, int var1, Color var2, Color var3) {
      int var4 = (var0 - C_Client_mc.eh) * 128;
      int var5 = (var1 - C_Client_mc.ei) * 128;
      Polygon var6 = C_Launcher_mc.n().o().a(new rs.p_runelite.p_a.C_f(var4, var5), 1);
      C_n var7 = new C_n(var6, var2, var3);
      var7.e = var0;
      var7.f = var1;
      return var7;
   }

   public void a() {
      if (this.e != 0 || this.f != 0) {
         int var1 = (this.e - C_Client_mc.eh) * 128 + 64;
         int var2 = (this.f - C_Client_mc.ei) * 128 + 64;
         this.a = C_Launcher_mc.n().o().a(new rs.p_runelite.p_a.C_f(var1, var2), 1);
      }
   }

   public Color b() {
      return this.b;
   }

   public Color c() {
      return this.c;
   }
}
