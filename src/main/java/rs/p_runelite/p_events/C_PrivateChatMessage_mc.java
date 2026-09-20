package rs.p_runelite.p_events;

public class C_PrivateChatMessage_mc {
   private String sender;
   private String message;

   public String getSender() {
      return this.sender;
   }

   public String getMessage() {
      return this.message;
   }

   public void setSender(String var1) {
      this.sender = var1;
   }

   public void setMessage(String var1) {
      this.message = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_PrivateChatMessage_mc)) {
         return false;
      } else {
         C_PrivateChatMessage_mc var2 = (C_PrivateChatMessage_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else {
            String var3 = this.getSender();
            String var4 = var2.getSender();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.getMessage();
               String var6 = var2.getMessage();
               return var5 == null ? var6 == null : var5.equals(var6);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_PrivateChatMessage_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.getSender();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.getMessage();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Override
   public String toString() {
      return "PrivateChatMessage(sender=" + this.getSender() + ", message=" + this.getMessage() + ")";
   }

   public C_PrivateChatMessage_mc(String var1, String var2) {
      this.sender = var1;
      this.message = var2;
   }

   public C_PrivateChatMessage_mc() {
   }
}
