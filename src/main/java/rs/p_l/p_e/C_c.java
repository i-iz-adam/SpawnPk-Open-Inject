package rs.p_l.p_e;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_c {
   public C_Client_mc a;
   public boolean b;
   public List<C_b> c;
   public List<C_b> d;
   public int e;
   public int f;
   public String g;

   public C_c(C_Client_mc var1) {
      this.a = var1;
      this.b = false;
      this.c = new ArrayList<>();
      this.d = new ArrayList<>();
      this.g = "";
      this.f = 0;
   }

   public void a(int var1) {
      if (var1 >= 32 && var1 <= 122 && this.g.length() < 80 && var1 != 96) {
         StringBuilder var2 = new StringBuilder(this.g);
         var2.insert(this.f, (char)var1);
         this.g = var2.toString();
         this.f++;
      }

      if (var1 == 8 && this.g.length() > 0 && this.f > 0) {
         StringBuilder var5 = new StringBuilder(this.g);
         var5.deleteCharAt(this.f - 1);
         this.g = var5.toString();
         this.f--;
      }

      if (this.f <= 0) {
         this.f = 0;
      }

      String var6 = (this.g.startsWith("::") ? "" : "::") + this.g;
      if ((var1 == 13 || var1 == 10) && var6.length() > 0) {
         if (!rs.p_l.p_b.p_a.C_d.g()) {
            this.a.d(var6);
            C_Client_mc.fv.a(103);
            C_Client_mc.fv.b(var6.length() - 1);
            C_Client_mc.fv.a(var6.substring(2));
         }

         if (this.c.size() >= 14) {
            this.c.remove(0);
         }

         if (this.d.size() >= 25) {
            this.d.remove(0);
         }

         if (this.g.equalsIgnoreCase("clear")) {
            this.c.clear();
         } else {
            this.a(this.g);
         }

         if (rs.p_l.p_b.p_a.C_d.g()) {
            try {
               rs.p_l.p_b.p_a.C_d.b.a(var6);
            } catch (Exception var4) {
               var4.printStackTrace();
            }

            while (this.c.size() > 14) {
               this.c.remove(0);
            }
         }

         this.g = "";
         this.f = 0;
      }
   }

   public void b(int var1) {
      if (var1 <= 0) {
         var1 = 0;
      }

      if (var1 >= this.d.size()) {
         this.e = this.d.size();
         this.g = "";
         this.f = 0;
      } else {
         if (this.d.get(var1).a.equals(this.g)) {
            if (this.e > var1 && var1 > 0) {
               this.b(var1 - 1);
               return;
            }

            if (this.e > var1 && var1 < this.d.size() - 1) {
               this.b(var1 + 1);
               return;
            }
         }

         this.g = this.d.get(var1).a;
         this.e = var1;
         this.f = this.g.length();
      }
   }

   public void a() {
      if (this.b) {
         this.b = false;
         this.e = this.d.size();
      } else {
         this.b = true;
      }
   }

   public void a(String var1) {
      C_b var2 = new C_b(var1, System.currentTimeMillis());
      String var3 = new SimpleDateFormat("hh:mm a").format(new Date());
      var2.c = "@yel@[" + var3 + "]:@whi@ " + var1;
      this.c.add(var2);
      this.d.add(var2);
      this.e = this.d.size();
   }

   public void b(String var1) {
      C_b var2 = new C_b("~", System.currentTimeMillis());
      var2.c = var1;
      this.c.add(var2);
   }

   public String c(String var1) {
      if (!var1.contains(" ")) {
         return var1;
      } else if (!var1.toLowerCase().startsWith("yell ") && !var1.toLowerCase().startsWith("news ")) {
         String[] var2 = new String[]{"@whi@", "@gre@", "@cya@", "@or1@", "@mag@", "@red@", "@yel@"};
         int var3 = 0;
         String var4 = "";

         for (String var8 : var1.split(" ")) {
            var4 = var4 + var2[var3] + var8 + " ";
            if (++var3 == var2.length) {
               var3 = 0;
            }
         }

         return var4;
      } else {
         return var1;
      }
   }

   public void b() {
      byte var1 = 0;
      int var2 = C_Client_mc.ai() ? 0 : 4;
      int var3 = C_Launcher_mc.n().i().getWidth();
      short var4 = 320;
      byte var5 = 100;
      rs.p_l.C_c.b(var4, var1, var2, 3093151, var3, var5);
      int var6 = C_Client_mc.ai() ? 0 : 4;
      short var7 = 295;
      rs.p_l.C_c.a(var6, var7, var3, 16777215);
      byte var8 = 5;
      byte var9 = 18;
      String var10 = this.g;
      String var11 = "> ";
      this.a.gm.b(var11, var6 + var8, var7 + var9 + 1, 16777215, 0);
      this.a.gm.b(this.c(var10), var6 + var8 + this.a.gm.c(var11), var7 + var9, 16777215, 0);
      this.a
         .gm
         .b(C_Client_mc.ff % 20 < 10 ? "|" : "", var6 + var8 + this.a.gm.c(var10.substring(0, this.f)) + this.a.gm.c(var11), var7 + var9 + 1, 16777215, 0);
      int var12 = 5 + (C_Client_mc.ai() ? 0 : 4);
      byte var13 = 28;
      int var14 = 0;

      for (C_b var16 : this.c) {
         if (var16.a.equals("~") && var16.c != null) {
            this.a.gm.b(var16.c, var12, var13, 16777215, 0);
         } else {
            String var17 = var16.a();
            String var18 = var16.a;
            String var19 = "";

            try {
               var19 = var17.split(" ")[0] + var17.split(" ")[1] + " ";
            } catch (Exception var21) {
               var21.printStackTrace();
            }

            this.a.gm.b(var19 + this.c(var18), var12, var13, 16777215, 0);
         }

         var14++;
         var13 += 20;
      }
   }
}
