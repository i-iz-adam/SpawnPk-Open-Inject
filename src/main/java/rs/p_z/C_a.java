package rs.p_z;

public class C_a extends C_b {
   private long b;
   private long c;

   public C_a(long var1) {
      this.c = var1;
   }

   @Override
   public void a() {
      this.b = System.currentTimeMillis();
   }

   @Override
   public boolean b() {
      return System.currentTimeMillis() - this.b < this.c;
   }

   @Override
   public long c() {
      return !this.b() ? 0L : this.c - (System.currentTimeMillis() - this.b);
   }
}
