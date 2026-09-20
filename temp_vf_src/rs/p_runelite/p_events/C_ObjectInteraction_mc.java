package rs.p_runelite.p_events;

public class C_ObjectInteraction_mc {
   int id;
   int x;
   int y;
   int z;
   int hash;

   public int getId() {
      return this.id;
   }

   public int getX() {
      return this.x;
   }

   public int getY() {
      return this.y;
   }

   public int getZ() {
      return this.z;
   }

   public int getHash() {
      return this.hash;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public void setZ(int var1) {
      this.z = var1;
   }

   public void setHash(int var1) {
      this.hash = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_ObjectInteraction_mc)) {
         return false;
      } else {
         C_ObjectInteraction_mc var2 = (C_ObjectInteraction_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else if (this.getId() != var2.getId()) {
            return false;
         } else if (this.getX() != var2.getX()) {
            return false;
         } else if (this.getY() != var2.getY()) {
            return false;
         } else {
            return this.getZ() != var2.getZ() ? false : this.getHash() == var2.getHash();
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_ObjectInteraction_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.getId();
      var2 = var2 * 59 + this.getX();
      var2 = var2 * 59 + this.getY();
      var2 = var2 * 59 + this.getZ();
      return var2 * 59 + this.getHash();
   }

   @Override
   public String toString() {
      return "ObjectInteraction(id=" + this.getId() + ", x=" + this.getX() + ", y=" + this.getY() + ", z=" + this.getZ() + ", hash=" + this.getHash() + ")";
   }
}
