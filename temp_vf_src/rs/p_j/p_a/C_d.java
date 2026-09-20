package rs.p_j.p_a;

import java.util.function.Consumer;
import java.util.function.Predicate;
import rs.C_Client_mc;
import rs.p_l.C_h;

public class C_d extends C_a {
   public static final int a = 6;
   private final C_b b;
   private C_h c;
   private C_h d;
   private String e = "";
   private C_d.a f;
   private String g;
   private String h;
   private String i;
   private Predicate<String> j = null;
   private Consumer<String> k = null;

   public C_d(C_b var1) {
      this.b = var1;
      this.k();
   }

   @Override
   public void a() {
      C_Client_mc var1 = this.b.b();
      var1.gb = false;
      var1.fN = 6;
      var1.dY = this.e;
      C_Client_mc.fM = true;
   }

   @Override
   public void b() {
      this.j.test(this.b.b().dY);
   }

   public C_d a(C_d.a var1) {
      this.f = var1;
      return this;
   }

   public C_d a(String var1) {
      this.g = var1;
      return this;
   }

   public C_d b(String var1) {
      this.e = var1;
      return this;
   }

   public C_d a(Consumer<String> var1) {
      this.j = var1x -> {
         var1.accept(var1x);
         return true;
      };
      return this;
   }

   public String c(String var1) {
      return this.h.isEmpty() && this.i.isEmpty() ? var1 : this.h + var1 + this.i;
   }

   public C_h c() {
      return this.c == null ? this.b.b().gn : this.c;
   }

   public C_h d() {
      return this.d == null ? this.b.b().gn : this.d;
   }

   private void k() {
      this.g = "Enter text:";
      this.h = "";
      this.i = "";
      this.c = null;
      this.d = null;
      this.f = C_d.a.a;
      this.e = "";
   }

   public C_d.a e() {
      return this.f;
   }

   public String f() {
      return this.g;
   }

   public String g() {
      return this.h;
   }

   public String h() {
      return this.i;
   }

   public Predicate<String> i() {
      return this.j;
   }

   public Consumer<String> j() {
      return this.k;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
