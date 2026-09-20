package rs.p_runelite.p_events;

import javax.annotation.Nullable;

public class C_ConfigChanged_mc {
   private String group;
   @Nullable
   private String profile;
   private String key;
   private String oldValue;
   private String newValue;

   public String getGroup() {
      return this.group;
   }

   @Nullable
   public String getProfile() {
      return this.profile;
   }

   public String getKey() {
      return this.key;
   }

   public String getOldValue() {
      return this.oldValue;
   }

   public String getNewValue() {
      return this.newValue;
   }

   public void setGroup(String var1) {
      this.group = var1;
   }

   public void setProfile(@Nullable String var1) {
      this.profile = var1;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public void setOldValue(String var1) {
      this.oldValue = var1;
   }

   public void setNewValue(String var1) {
      this.newValue = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_ConfigChanged_mc)) {
         return false;
      } else {
         C_ConfigChanged_mc var2 = (C_ConfigChanged_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else {
            String var3 = this.getGroup();
            String var4 = var2.getGroup();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.getProfile();
               String var6 = var2.getProfile();
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  String var7 = this.getKey();
                  String var8 = var2.getKey();
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     String var9 = this.getOldValue();
                     String var10 = var2.getOldValue();
                     if (var9 == null ? var10 == null : var9.equals(var10)) {
                        String var11 = this.getNewValue();
                        String var12 = var2.getNewValue();
                        return var11 == null ? var12 == null : var11.equals(var12);
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_ConfigChanged_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.getGroup();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.getProfile();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.getKey();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      String var6 = this.getOldValue();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      String var7 = this.getNewValue();
      return var2 * 59 + (var7 == null ? 43 : var7.hashCode());
   }

   @Override
   public String toString() {
      return "ConfigChanged(group="
         + this.getGroup()
         + ", profile="
         + this.getProfile()
         + ", key="
         + this.getKey()
         + ", oldValue="
         + this.getOldValue()
         + ", newValue="
         + this.getNewValue()
         + ")";
   }
}
