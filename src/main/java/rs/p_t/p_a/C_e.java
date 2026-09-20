package rs.p_t.p_a;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p_gnu.p_trove.p_f.p_b.C_bU_mc;
import p_gnu.p_trove.p_f.p_b.C_cc;
import p_gnu.p_trove.p_i.p_a.C_i;
import rs.C_Client_mc;

public class C_e extends rs.p_t.C_a {
   private static final int c = 2000;
   private static final String d = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "maps.yaml";
   private static final String e = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "m.bin";
   protected Map<Integer, Map<String, Object>> a = new HashMap<>();
   protected boolean b = !rs.p_f.C_a.c();
   private final C_cc<String> h = new C_cc();
   private final C_bU_mc i = new C_bU_mc();
   private final C_i j = new C_i();
   private final C_i k = new C_i();
   private final C_bU_mc l = new C_bU_mc();

   public C_e() {
      super(d, e);
   }

   public boolean a(int var1) {
      return this.h.w_(var1);
   }

   public boolean b(int var1) {
      return this.a(C_Client_mc.ej, var1);
   }

   public boolean a(int var1, String var2) {
      return !this.a(var1) ? false : ((String)this.h.b(var1)).equals(var2);
   }

   public boolean a(int var1, int var2) {
      if (!this.a(var1) && !this.a(var2)) {
         return true;
      } else {
         return this.a(var1) != this.a(var2) ? false : ((String)this.h.b(var1)).equals(this.h.b(var2));
      }
   }

   public void a(Map<String, Object> var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6) {
      boolean var7 = false;

      for (String var9 : var1.keySet()) {
         Object var10 = var1.get(var9);
         String var11 = var9.toLowerCase();
         switch (var11) {
            case "id":
               var3[var2] = (Integer)var10;
               this.i.a((Integer)var10, var2);
               break;
            case "map":
               var4[var2] = (Integer)var10;
               this.j.b((Integer)var10);
               break;
            case "land":
               var5[var2] = (Integer)var10;
               this.j.b((Integer)var10);
               break;
            case "type":
               String var13 = (String)var10;
               if (var13.equalsIgnoreCase("osrs")) {
                  var6[var2] = 1;
               }
               break;
            case "osid":
               int var14 = (Integer)var10;
               if (var1.containsKey("id")) {
                  this.l.a((Integer)var1.get("id"), var14);
               }
               break;
            case "group":
               String var15 = (String)var10;
               if (var1.containsKey("id")) {
                  this.h.a((Integer)var1.get("id"), var15);
               }
               break;
            case "forceroof":
            case "forceroofs":
               var7 = (Boolean)var10;
         }
      }

      if (var6[var2] == 1) {
         int var16 = (Integer)var1.get("id");
         this.k.b(var16);
      }

      if (var7) {
         int var17 = (Integer)var1.get("id");
         C_Client_mc.c.put(var17, true);
      }
   }

   public void a(int[] var1, int[] var2, int[] var3, int[] var4) {
      try {
         this.a = this.a(this.b);
         if (this.a != null && this.a.keySet() != null) {
            for (int var6 : this.a.keySet()) {
               try {
                  this.a(this.a.get(var6), var6, var1, var2, var3, var4);
               } catch (Exception var8) {
                  var8.printStackTrace();
               }
            }
         } else {
            this.a = new HashMap<>();
         }
      } catch (Exception var9) {
         throw new RuntimeException(var9);
      }
   }

   public C_cc<String> a() {
      return this.h;
   }

   public C_bU_mc e() {
      return this.i;
   }

   public C_i f() {
      return this.j;
   }

   public C_i g() {
      return this.k;
   }

   public C_bU_mc h() {
      return this.l;
   }
}
