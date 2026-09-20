package rs.p_s.p_o;

import java.util.ArrayList;
import java.util.List;
import rs.p_a.C_j;
import rs.p_runelite.p_a.C_p;

class C_b {
   private int a;
   private String b;
   private int c;
   private int d;
   private int e;
   private List<C_p> f;

   C_b(C_j var1) {
      this.b = var1.aG.o;
      this.a = -1;
      this.f = new ArrayList<>(2);
      this.e = -1;
      this.d = -1;
      if (var1.aG != null) {
         this.c = var1.aG.r;
      }
   }

   public int a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public void a(int var1) {
      this.d = var1;
   }

   public int e() {
      return this.e;
   }

   public void b(int var1) {
      this.e = var1;
   }

   public List<C_p> f() {
      return this.f;
   }

   public void a(List<C_p> var1) {
      this.f = var1;
   }
}
