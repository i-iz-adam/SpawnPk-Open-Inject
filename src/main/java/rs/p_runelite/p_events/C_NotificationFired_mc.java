package rs.p_runelite.p_events;

import java.awt.TrayIcon.MessageType;

public final class C_NotificationFired_mc {
   private final String message;
   private final MessageType type;

   public C_NotificationFired_mc(String var1, MessageType var2) {
      this.message = var1;
      this.type = var2;
   }

   public String getMessage() {
      return this.message;
   }

   public MessageType getType() {
      return this.type;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_NotificationFired_mc)) {
         return false;
      } else {
         C_NotificationFired_mc var2 = (C_NotificationFired_mc)var1;
         String var3 = this.getMessage();
         String var4 = var2.getMessage();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            MessageType var5 = this.getType();
            MessageType var6 = var2.getType();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.getMessage();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      MessageType var4 = this.getType();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Override
   public String toString() {
      return "NotificationFired(message=" + this.getMessage() + ", type=" + this.getType() + ")";
   }
}
