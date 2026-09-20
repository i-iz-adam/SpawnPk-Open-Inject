package rs.p_gui.p_b;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class C_a {
   public static final int a = 0;
   public static final int b = 1;
   private String c;
   private Color d;
   private C_e e;
   private C_a.a f = C_a.a.a;
   private int g;
   private int h;
   private int i = 1;
   private final C_f[] j = new C_f[28];
   private final Map<rs.p_gui.p_b.p_c.C_c, C_f> k = new HashMap<>();
   private int l;
   private final int[] m = new int[7];

   public C_a(String var1) {
      this.c = var1;
      this.g = 0;
      this.h = 0;
      this.l = 0;
      this.d = Color.WHITE;

      for (int var2 = 0; var2 < this.m.length; var2++) {
         this.m[var2] = 99;
      }
   }

   public Map<rs.p_gui.p_b.p_c.C_c, C_f> a() {
      return this.k;
   }

   public int b() {
      return this.g;
   }

   public void a(int var1) {
      this.g = var1;
   }

   public int[] c() {
      return this.m;
   }

   public C_f[] d() {
      return this.j;
   }

   public void a(int var1, C_f var2) {
      this.j[var1] = var2;
   }

   public int e() {
      return this.i;
   }

   public void b(int var1) {
      this.i = var1;
   }

   public String f() {
      return this.c;
   }

   public void a(String var1) {
      this.c = var1;
   }

   public C_a.a g() {
      return this.f;
   }

   public void a(C_a.a var1) {
      this.f = var1;
   }

   public void a(rs.p_gui.p_b.p_c.C_c var1, int var2) {
      this.k.put(var1, new C_f(var2));
   }

   public void a(rs.p_gui.p_b.p_c.C_c var1, C_f var2) {
      this.k.put(var1, var2);
   }

   public int h() {
      return this.h;
   }

   public void c(int var1) {
      this.h = var1;
   }

   public void d(int var1) {
      this.l = var1;
   }

   public int i() {
      return this.l;
   }

   public Color j() {
      return this.d;
   }

   public void a(Color var1) {
      this.d = var1;
   }

   public C_e k() {
      return this.e;
   }

   public void a(C_e var1) {
      this.e = var1;
   }

   public static enum a {
      a(0, "/assets/gui/lunar.png", "Lunar"),
      b(1, "/assets/gui/ancients.png", "Ancients"),
      c(2, "/assets/gui/modern.png", "Modern");

      private String d;
      private String e;
      private int f;

      private a(int var3, String var4, String var5) {
         this.f = var3;
         this.e = var4;
         this.d = var5;
      }

      public String a() {
         return this.e;
      }

      public String b() {
         return this.d;
      }

      public int c() {
         return this.f;
      }

      public static C_a.a a(int var0) {
         for (C_a.a var4 : values()) {
            if (var4.c() == var0) {
               return var4;
            }
         }

         return a;
      }
   }
}
