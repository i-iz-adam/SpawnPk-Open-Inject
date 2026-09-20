package rs.p_gui.p_b.p_b;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.charset.StandardCharsets;
import rs.p_gui.p_b.C_f;

public class C_c {
   public static void a(DataOutputStream var0, rs.p_gui.p_b.C_a var1) {
      var0.writeInt(var1.f().getBytes().length);
      var0.write(var1.f().getBytes(StandardCharsets.UTF_8));
      var0.writeInt(var1.j().getRGB());
      if (var1.k() == null) {
         var0.writeInt(0);
      } else {
         var0.writeInt(var1.k().name().getBytes().length);
         var0.write(var1.k().name().getBytes(StandardCharsets.UTF_8));
      }

      var0.writeInt(var1.g().c());
      var0.writeInt(var1.e());

      for (int var2 = 0; var2 < var1.c().length; var2++) {
         var0.writeInt(var1.c()[var2]);
      }

      for (rs.p_gui.p_b.p_c.C_c var5 : rs.p_gui.p_b.p_c.C_c.values()) {
         int var6 = var1.a().get(var5) == null ? -1 : Integer.valueOf(var1.a().get(var5).a());
         var0.writeInt(var6);
         if (var6 == -1) {
            var0.writeInt(1);
         } else {
            var0.writeInt(var1.a().get(var5).b());
         }
      }

      for (int var8 = 0; var8 < var1.d().length; var8++) {
         int var9 = var1.d()[var8] == null ? -1 : var1.d()[var8].a();
         var0.writeInt(var9);
         if (var9 == -1) {
            var0.writeInt(1);
         } else {
            var0.writeInt(var1.d()[var8].b());
         }
      }

      var0.writeInt(var1.i());
      var0.writeInt(var1.b());
      var0.writeInt(var1.h());
   }

   public static void a(DataInputStream var0, rs.p_gui.p_b.C_c var1) {
      C_e var2 = new C_e(var1.a());
      var2.a();
      String var3 = "Default";

      do {
         int var4 = var0.readInt();
         byte[] var5 = new byte[var4];
         var0.read(var5);
         var3 = new String(var5);
         rs.p_gui.p_b.C_a var6 = new rs.p_gui.p_b.C_a(var3);
         if (var2.a(3)) {
            int var7 = var0.readInt();
            var6.a(new Color(var7));
            if (var2.a(4)) {
               var4 = var0.readInt();
               if (var4 > 0) {
                  var5 = new byte[var4];
                  var0.read(var5);
                  String var8 = new String(var5);
                  var6.a(rs.p_gui.p_b.C_e.valueOf(var8));
               }
            } else {
               var0.readInt();
            }
         }

         int var18 = var0.readInt();
         var6.a(rs.p_gui.p_b.C_a.a.a(var18));
         int var19 = var0.readInt();
         var6.b(var19);

         for (int var9 = 0; var9 < var6.c().length; var9++) {
            int var10 = var0.readInt();
            var6.c()[var9] = var10;
         }

         for (rs.p_gui.p_b.p_c.C_c var12 : rs.p_gui.p_b.p_c.C_c.values()) {
            int var13 = var0.readInt();
            int var14 = var0.readInt();
            var6.a(var12, new C_f(var13, var14));
         }

         for (int var21 = 0; var21 < var6.d().length; var21++) {
            int var25 = var0.readInt();
            int var27 = var0.readInt();
            var6.a(var21, new C_f(var25, var27));
         }

         if (var2.a(2)) {
            int var22 = var0.readInt();
            var6.d(var22);
         }

         int var23 = var0.readInt();
         var6.a(var23);
         if (var2.a(5)) {
            int var26 = var0.readInt();
            var6.c(var26);
         }

         var1.add(var6);
      } while (var3 != null);
   }
}
