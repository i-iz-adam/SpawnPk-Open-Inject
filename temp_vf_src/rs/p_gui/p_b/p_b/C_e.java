package rs.p_gui.p_b.p_b;

import java.io.File;

public class C_e {
   public static final int a = 5;
   public static final String b = "_ver_";
   private final String c;
   private int d;

   public C_e(String var1) {
      this.c = var1;
      this.d = 1;
   }

   public void a() {
      File var1 = new File(C_d.a);
      if (var1.exists()) {
         for (File var5 : var1.listFiles()) {
            if (var5.getName().startsWith(this.c + "_ver_")) {
               Integer var6 = Integer.parseInt(var5.getName().replace(this.c + "_ver_", ""));
               if (var6 > this.d) {
                  this.d = var6;
               }
            }
         }
      }
   }

   public boolean a(int var1) {
      return this.d >= var1;
   }
}
