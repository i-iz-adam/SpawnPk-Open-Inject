package rs.p_ui.p_a;

import com.google.a.b.V;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class C_j extends C_c {
   private Instant b;
   private Instant c;
   private Duration d;

   public C_j(long var1, ChronoUnit var3, BufferedImage var4, String var5, String var6) {
      super(var4, var5, var6);
      V.a(var1 > 0L, "negative period!");
      this.b = Instant.now();
      this.d = Duration.of(var1, var3);
      this.c = this.b.plus(this.d);
   }

   @Override
   public String a() {
      Duration var1 = Duration.between(Instant.now(), this.c);
      return this.r() ? this.d(var1) : this.c(var1);
   }

   @Override
   public Color b() {
      Duration var1 = Duration.between(Instant.now(), this.c);
      return (double)var1.getSeconds() < (double)this.d.getSeconds() * 0.1 ? Color.RED.brighter() : Color.WHITE;
   }

   @Override
   public boolean e() {
      Duration var1 = Duration.between(Instant.now(), this.c);
      return !var1.isNegative();
   }

   @Override
   public boolean f() {
      Duration var1 = Duration.between(Instant.now(), this.c);
      return var1.isZero() || var1.isNegative();
   }

   private String c(Duration var1) {
      if (var1.toHours() >= 1L) {
         long var10 = var1.getSeconds();
         long var11 = var10 / 3600L;
         long var6 = var10 % 3600L / 60L;
         long var8 = var10 % 60L;
         return String.format("%dh%02dm", var11, var6, var8);
      } else {
         int var2 = (int)(var1.toMillis() / 1000L);
         int var3 = var2 % 3600 / 60;
         int var4 = var2 % 60;
         return String.format("%d:%02d", var3, var4);
      }
   }

   private String d(Duration var1) {
      if (var1.toHours() >= 1L) {
         long var10 = var1.getSeconds();
         long var4 = var10 / 3600L;
         long var6 = var10 % 3600L / 60L;
         long var8 = var10 % 60L;
         return String.format("%dh", var4, var6, var8);
      } else if (var1.toMinutes() >= 1L) {
         int var2 = (int)(var1.toMillis() / 1000L);
         int var3 = var2 % 3600 / 60;
         return String.format("%dm", var3);
      } else {
         return String.format("%d", var1.getSeconds());
      }
   }

   public void a(Duration var1) {
      V.a(!var1.isNegative(), "negative duration");
      this.d = var1;
      this.c = this.b.plus(var1);
   }

   public void b(Duration var1) {
      V.a(!var1.isNegative(), "negative duration");
      this.b = Instant.now();
      this.c = Instant.now().plus(var1);
      this.d = Duration.between(this.b, this.c);
   }

   public Instant c() {
      return this.b;
   }

   public Instant d() {
      return this.c;
   }

   public Duration s() {
      return this.d;
   }

   @Override
   public String toString() {
      return "TimerInfoBox(startTime=" + this.c() + ", endTime=" + this.d() + ", duration=" + this.s() + ")";
   }
}
