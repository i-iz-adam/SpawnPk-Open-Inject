package rs.p_j.p_b;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

@Singleton
public class C_d {
   private static final String a = "Choose Sub-Option";
   private static final Map<Integer, rs.p_h.C_b> b = new HashMap<>();
   private static final Map<Integer, C_a> c = new HashMap<>();
   private final C_Client_mc d;
   private C_a e;

   @Inject
   public C_d(C_Client_mc var1) {
      this.d = var1;
   }

   public void a(int var1) {
      if (b.get(var1) != null) {
         b.get(var1).invoke();
      }

      b.clear();
   }

   public C_a a(String var1, int var2) {
      C_a var3 = new C_a(var1, var2);
      if (this.d.fx[var2] != null) {
         this.d.fx[var2] = this.d.fx[var2] + " <img=46>";
      }

      c.put(var2, var3);
      return var3;
   }

   public C_a b(int var1) {
      return this.a("Choose Sub-Option", var1);
   }

   public void a() {
      this.e = null;
      c.clear();
      b.clear();
   }

   public boolean b() {
      return this.e != null;
   }

   public void c(int var1) {
      if (this.e == null || !this.e.a()) {
         if (c.get(var1) != null) {
            this.e = c.get(var1);
         } else {
            this.e = null;
         }
      }
   }

   public static void a(int var0, int var1) {
      C_Client_mc var2 = C_Launcher_mc.n().o();
      String var3 = var2.fx[var0];
      int var4 = var2.eJ[var0];
      int var5 = var2.eF[var0];
      int var6 = var2.eG[var0];
      int var7 = var2.eH[var0];
      int var8 = var2.eI[var0];
      rs.p_h.C_b var9 = b.remove(var0);
      String var10 = var2.fx[var1];
      int var11 = var2.eJ[var1];
      int var12 = var2.eF[var1];
      int var13 = var2.eG[var1];
      int var14 = var2.eH[var1];
      int var15 = var2.eI[var1];
      rs.p_h.C_b var16 = b.remove(var1);
      var2.fx[var0] = var10;
      var2.eJ[var0] = var11;
      var2.eF[var0] = var12;
      var2.eG[var0] = var13;
      var2.eH[var0] = var14;
      var2.eI[var0] = var15;
      b.put(var0, var16);
      var2.fx[var1] = var3;
      var2.eJ[var1] = var4;
      var2.eF[var1] = var5;
      var2.eG[var1] = var6;
      var2.eH[var1] = var7;
      var2.eI[var1] = var8;
      b.put(var1, var9);
   }

   public int a(String var1, rs.p_h.C_b var2) {
      return this.a(this.d.eV, var1, var2);
   }

   public int b(String var1, rs.p_h.C_b var2) {
      return this.a(this.d.eV - 1, var1, var2);
   }

   public int c(String var1, rs.p_h.C_b var2) {
      return this.a(1, var1, var2);
   }

   private int a(int var1, String var2, rs.p_h.C_b var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var1 > this.d.eV - 1) {
         var1 = this.d.eV - 1;
      }

      if (this.d.eV > var1) {
         for (int var4 = this.d.eV; var4 >= var1; var4--) {
            this.d.fx[var4 + 1] = this.d.fx[var4];
            this.d.eI[var4 + 1] = this.d.eI[var4];
            this.d.eJ[var4 + 1] = this.d.eJ[var4];
            this.d.eF[var4 + 1] = this.d.eF[var4];
            this.d.eG[var4 + 1] = this.d.eG[var4];
            this.d.eH[var4 + 1] = this.d.eH[var4];
            if (b.get(var4) != null) {
               rs.p_h.C_b var5 = b.remove(var4);
               b.put(var4 + 1, var5);
               this.d.eJ[var4 + 1] = var4 + 1;
            }

            if (c.get(var4) != null) {
               c.put(var4 + 1, c.remove(var4));
               c.get(var4 + 1).a(var4 + 1);
               this.d.eJ[var4 + 1] = var4 + 1;
            }
         }
      }

      this.d.fx[var1] = var2;
      this.d.eI[var1] = 1924;
      this.d.eJ[var1] = var1;
      b.put(var1, var3);
      this.d.eV++;
      this.d.dJ += 15;
      if (this.d.dI < this.d.gm.a(var2, false) + 8) {
         this.d.dI = this.d.gm.a(var2, false) + 8;
      }

      return var1;
   }

   public C_a c() {
      return this.e;
   }
}
