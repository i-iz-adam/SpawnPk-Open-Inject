package rs.p_s.p_q;

import com.google.c.C;
import com.google.c.E;
import com.google.c.l;
import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import rs.p_A_uc.C_j;
import rs.p_e.C_i;
import rs.p_s.C_e;
import rs.p_ui.C_l;

@C_e(
   a = "PvP Tracker",
   b = "pvptracker"
)
public class C_d extends rs.p_s.C_a {
   public static String b = "pvptracker";
   public static l c;
   public static C_a d;
   public static C_d e;
   @Inject
   private rs.p_ui.C_e f;
   @Inject
   private C_i g;
   @Inject
   private ScheduledExecutorService h;
   @Inject
   private C_a i;
   @Inject
   private l j;
   private rs.p_s.p_q.p_a.C_a k;
   private ArrayList<rs.p_s.p_q.p_a.C_a> l;
   private C_b m;
   private C_l n;

   @Provides
   C_a a(C_i var1) {
      return var1.a(C_a.class);
   }

   @Override
   protected void a() {
      d = this.i;
      e = this;
      c = this.j
         .a()
         .b()
         .a(Double.class, (E)(var0, var1x, var2) -> var0.isNaN() ? new C(0) : new C(BigDecimal.valueOf(var0).setScale(3, RoundingMode.HALF_UP)))
         .j();
      this.l = new ArrayList<>();
      this.k = new rs.p_s.p_q.p_a.C_a();
      this.m = (C_b)this.a.getInstance(C_b.class);
      BufferedImage var1 = C_j.b(this.getClass(), "pvp_icon.png");
      this.n = C_l.a().a("PvP Tracker").a(var1).a(2).a(this.m).a();
      this.f.a(this.n);
   }

   @Override
   protected void b() {
      this.f.b(this.n);
   }

   public void f() {
      if (this.k != null && !this.k.c()) {
         rs.p_s.p_q.p_a.C_a var1 = new rs.p_s.p_q.p_a.C_a();
         var1.a(new rs.p_s.p_q.p_a.C_b(this.k.d().k()));
         var1.d().e(this.k.d().g());
         var1.d().a(this.k.d().i(), this.k.d().h());
         var1.d().b(this.k.d().e(), this.k.d().f());
         var1.d().c(this.k.d().j());
         var1.b(new rs.p_s.p_q.p_a.C_b(this.k.e().k()));
         var1.e().e(this.k.e().g());
         var1.e().a(this.k.e().i(), this.k.e().h());
         var1.e().b(this.k.e().e(), this.k.e().f());
         var1.e().c(this.k.e().j());
         this.l.add(var1);
         this.m.a(var1);
         this.k = new rs.p_s.p_q.p_a.C_a();
         this.m.c().a(this.k);
         this.m.c().a();
      }
   }

   public void a(String var1) {
      this.g.b(b, "nameFilter", var1.trim().toLowerCase());
   }

   public void g() {
   }

   public void b(String var1) {
   }

   public void h() {
      this.l.clear();
      this.m.b();
   }

   public rs.p_s.p_q.p_a.C_a i() {
      return this.k;
   }

   public ArrayList<rs.p_s.p_q.p_a.C_a> j() {
      return this.l;
   }

   public C_b k() {
      return this.m;
   }
}
