package rs.p_gui;

public enum C_v {
   a("Keep window size"),
   b("Keep game size");

   private final String c;

   private C_v(String var3) {
      this.c = var3;
   }

   @Override
   public String toString() {
      return this.c;
   }
}
