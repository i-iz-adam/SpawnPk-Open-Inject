package rs.p_runelite.p_events;

public class C_SkillLevelChanged_mc {
   int skillId;
   double experience;
   int currentLevel;
   int maximumLevel;

   public int getSkillId() {
      return this.skillId;
   }

   public double getExperience() {
      return this.experience;
   }

   public int getCurrentLevel() {
      return this.currentLevel;
   }

   public int getMaximumLevel() {
      return this.maximumLevel;
   }

   public void setSkillId(int var1) {
      this.skillId = var1;
   }

   public void setExperience(double var1) {
      this.experience = var1;
   }

   public void setCurrentLevel(int var1) {
      this.currentLevel = var1;
   }

   public void setMaximumLevel(int var1) {
      this.maximumLevel = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_SkillLevelChanged_mc)) {
         return false;
      } else {
         C_SkillLevelChanged_mc var2 = (C_SkillLevelChanged_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else if (this.getSkillId() != var2.getSkillId()) {
            return false;
         } else if (Double.compare(this.getExperience(), var2.getExperience()) != 0) {
            return false;
         } else {
            return this.getCurrentLevel() != var2.getCurrentLevel() ? false : this.getMaximumLevel() == var2.getMaximumLevel();
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_SkillLevelChanged_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.getSkillId();
      long var3 = Double.doubleToLongBits(this.getExperience());
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      var2 = var2 * 59 + this.getCurrentLevel();
      return var2 * 59 + this.getMaximumLevel();
   }

   @Override
   public String toString() {
      return "SkillLevelChanged(skillId="
         + this.getSkillId()
         + ", experience="
         + this.getExperience()
         + ", currentLevel="
         + this.getCurrentLevel()
         + ", maximumLevel="
         + this.getMaximumLevel()
         + ")";
   }

   public C_SkillLevelChanged_mc(int var1, double var2, int var4, int var5) {
      this.skillId = var1;
      this.experience = var2;
      this.currentLevel = var4;
      this.maximumLevel = var5;
   }
}
