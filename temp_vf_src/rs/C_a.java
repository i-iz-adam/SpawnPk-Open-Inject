package rs;

public class C_a extends C_t {
   public C_a a;
   public C_a b;

   public final void a() {
      if (this.b != null) {
         this.b.a = this.a;
         this.a.b = this.b;
         this.a = null;
         this.b = null;
      }
   }
}
