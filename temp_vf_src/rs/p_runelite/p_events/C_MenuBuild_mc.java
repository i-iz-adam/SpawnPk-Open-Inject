package rs.p_runelite.p_events;

public class C_MenuBuild_mc {
   public static C_MenuBuild_mc SINGLETON = new C_MenuBuild_mc();
   private String tooltip;
   private int row;
   private int menuId;
   private int menuCmd1;
   private int menuCmd2;
   private int menuCmd3;
   private int menuCmd4;

   public int getCmd(int var1) {
      switch (var1) {
         case 1:
            return this.menuCmd1;
         case 2:
            return this.menuCmd2;
         case 3:
            return this.menuCmd3;
         case 4:
            return this.menuCmd4;
         default:
            return 0;
      }
   }

   public static C_MenuBuild_mc get() {
      return SINGLETON;
   }

   public String getTooltip() {
      return this.tooltip;
   }

   public int getRow() {
      return this.row;
   }

   public int getMenuId() {
      return this.menuId;
   }

   public int getMenuCmd1() {
      return this.menuCmd1;
   }

   public int getMenuCmd2() {
      return this.menuCmd2;
   }

   public int getMenuCmd3() {
      return this.menuCmd3;
   }

   public int getMenuCmd4() {
      return this.menuCmd4;
   }

   public void setTooltip(String var1) {
      this.tooltip = var1;
   }

   public void setRow(int var1) {
      this.row = var1;
   }

   public void setMenuId(int var1) {
      this.menuId = var1;
   }

   public void setMenuCmd1(int var1) {
      this.menuCmd1 = var1;
   }

   public void setMenuCmd2(int var1) {
      this.menuCmd2 = var1;
   }

   public void setMenuCmd3(int var1) {
      this.menuCmd3 = var1;
   }

   public void setMenuCmd4(int var1) {
      this.menuCmd4 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_MenuBuild_mc)) {
         return false;
      } else {
         C_MenuBuild_mc var2 = (C_MenuBuild_mc)var1;
         if (!var2.canEqual(this)) {
            return false;
         } else if (this.getRow() != var2.getRow()) {
            return false;
         } else if (this.getMenuId() != var2.getMenuId()) {
            return false;
         } else if (this.getMenuCmd1() != var2.getMenuCmd1()) {
            return false;
         } else if (this.getMenuCmd2() != var2.getMenuCmd2()) {
            return false;
         } else if (this.getMenuCmd3() != var2.getMenuCmd3()) {
            return false;
         } else if (this.getMenuCmd4() != var2.getMenuCmd4()) {
            return false;
         } else {
            String var3 = this.getTooltip();
            String var4 = var2.getTooltip();
            return var3 == null ? var4 == null : var3.equals(var4);
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof C_MenuBuild_mc;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.getRow();
      var2 = var2 * 59 + this.getMenuId();
      var2 = var2 * 59 + this.getMenuCmd1();
      var2 = var2 * 59 + this.getMenuCmd2();
      var2 = var2 * 59 + this.getMenuCmd3();
      var2 = var2 * 59 + this.getMenuCmd4();
      String var3 = this.getTooltip();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "MenuBuild(tooltip="
         + this.getTooltip()
         + ", row="
         + this.getRow()
         + ", menuId="
         + this.getMenuId()
         + ", menuCmd1="
         + this.getMenuCmd1()
         + ", menuCmd2="
         + this.getMenuCmd2()
         + ", menuCmd3="
         + this.getMenuCmd3()
         + ", menuCmd4="
         + this.getMenuCmd4()
         + ")";
   }
}
