package rs.p_cache.p_b;

public enum C_b {
   a(
      "Error in version check!\nCould not retrieve remote version file. Server is either offline or the remote file is corrupt.\n\nPlease try again in a few minutes."
   ),
   b("There has been an issue downloading a game asset!\nPlease try again in a few minutes.\nIf the issue continues, post a ticket on our website!");

   private String c;

   private C_b(String var3) {
      this.c = var3;
   }

   public String a() {
      return this.c;
   }
}
