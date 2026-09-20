package rs.p_e;

public enum C_n {
   a("Off"),
   b("Flash for 2 seconds"),
   c("Solid for 2 seconds"),
   d("Flash until cancelled"),
   e("Solid until cancelled");

   private final String f;

   @Override
   public String toString() {
      return this.f;
   }

   public String a() {
      return this.f;
   }

   private C_n(String var3) {
      this.f = var3;
   }
}
