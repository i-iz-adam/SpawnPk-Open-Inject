package rs.p_runelite.p_events;

public class C_ChatMessage_mc {
   private String message;

   public String getMessage() {
      return this.message;
   }

   public void setMessage(String var1) {
      this.message = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_ChatMessage_mc)) {
         return false;
      } else {
         C_ChatMessage_mc var2 = (C_ChatMessage_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else {
            String var3 = this.getMessage();
            String var4 = var2.getMessage();
            return var3 == null ? var4 == null : var3.equals(var4);
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_ChatMessage_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      String var3 = this.getMessage();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "ChatMessage(message=" + this.getMessage() + ")";
   }

   public C_ChatMessage_mc(String var1) {
      this.message = var1;
   }

   public C_ChatMessage_mc() {
   }
}
