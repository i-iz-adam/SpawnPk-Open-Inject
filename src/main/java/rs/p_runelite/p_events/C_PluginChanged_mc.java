package rs.p_runelite.p_events;

import rs.p_s.C_a;

public class C_PluginChanged_mc {
   private final C_a plugin;
   private final boolean loaded;

   public C_PluginChanged_mc(C_a var1, boolean var2) {
      this.plugin = var1;
      this.loaded = var2;
   }

   public C_a getPlugin() {
      return this.plugin;
   }

   public boolean isLoaded() {
      return this.loaded;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_PluginChanged_mc)) {
         return false;
      } else {
         C_PluginChanged_mc var2 = (C_PluginChanged_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else if (this.isLoaded() != var2.isLoaded()) {
            return false;
         } else {
            C_a var3 = this.getPlugin();
            C_a var4 = var2.getPlugin();
            return var3 == null ? var4 == null : var3.equals(var4);
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_PluginChanged_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + (this.isLoaded() ? 79 : 97);
      C_a var3 = this.getPlugin();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "PluginChanged(plugin=" + this.getPlugin() + ", loaded=" + this.isLoaded() + ")";
   }
}
