package rs;

public class C_t {
   public long c;
   public C_t d;
   public C_t e;

   public final void b() {
      if (this.e != null) {
         this.e.d = this.d;
         this.d.e = this.e;
         this.d = null;
         this.e = null;
      }
   }
}
