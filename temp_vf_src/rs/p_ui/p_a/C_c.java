package rs.p_ui.p_a;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public abstract class C_c {
   private final String b;
   private final String c;
   String a;
   private BufferedImage d;
   private BufferedImage e;
   private C_h f;
   private String g;
   private List<rs.p_l.p_f.C_f> h = new ArrayList<>();
   private C_e i = C_e.b;
   private int j = 0;
   private Instant k;
   private boolean l = false;

   public C_c(BufferedImage var1, String var2, String var3) {
      this.c = var2;
      this.a = var2;
      this.b = var3;
      this.a(var1);
      this.a(C_h.c);
   }

   public abstract String a();

   public abstract Color b();

   public boolean e() {
      return true;
   }

   public boolean f() {
      return false;
   }

   public boolean g() {
      if (this.j == 0) {
         return false;
      } else if (this.k == null) {
         return true;
      } else {
         Duration var1 = Duration.between(this.k, Instant.now());
         Duration var2 = Duration.ofMinutes((long)this.j);
         return var1.compareTo(var2) > 0;
      }
   }

   public String h() {
      return this.b;
   }

   public String i() {
      return this.c;
   }

   public String j() {
      return this.a;
   }

   public BufferedImage k() {
      return this.d;
   }

   public void a(BufferedImage var1) {
      this.d = var1;
   }

   public BufferedImage l() {
      return this.e;
   }

   public void b(BufferedImage var1) {
      this.e = var1;
   }

   public C_h m() {
      return this.f;
   }

   public void a(C_h var1) {
      this.f = var1;
   }

   public String n() {
      return this.g;
   }

   public void a(String var1) {
      this.g = var1;
   }

   public List<rs.p_l.p_f.C_f> o() {
      return this.h;
   }

   public void a(List<rs.p_l.p_f.C_f> var1) {
      this.h = var1;
   }

   public C_e p() {
      return this.i;
   }

   public void a(C_e var1) {
      this.i = var1;
   }

   public int q() {
      return this.j;
   }

   public void c(int var1) {
      this.j = var1;
   }

   public void a(Instant var1) {
      this.k = var1;
   }

   public boolean r() {
      return this.l;
   }

   public void a(boolean var1) {
      this.l = var1;
   }
}
