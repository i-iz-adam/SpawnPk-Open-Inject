package rs.runelite.events;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/MenuBuild.class */
public class MenuBuild {
    public static MenuBuild SINGLETON = new MenuBuild();
    private String tooltip;
    private int row;
    private int menuId;
    private int menuCmd1;
    private int menuCmd2;
    private int menuCmd3;
    private int menuCmd4;

    public int getCmd(int i) {
        switch (i) {
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

    public static MenuBuild get() {
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

    public void setTooltip(String str) {
        this.tooltip = str;
    }

    public void setRow(int i) {
        this.row = i;
    }

    public void setMenuId(int i) {
        this.menuId = i;
    }

    public void setMenuCmd1(int i) {
        this.menuCmd1 = i;
    }

    public void setMenuCmd2(int i) {
        this.menuCmd2 = i;
    }

    public void setMenuCmd3(int i) {
        this.menuCmd3 = i;
    }

    public void setMenuCmd4(int i) {
        this.menuCmd4 = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MenuBuild)) {
            return false;
        }
        MenuBuild menuBuild = (MenuBuild) obj;
        if (!menuBuild.canEqual(this) || getRow() != menuBuild.getRow() || getMenuId() != menuBuild.getMenuId() || getMenuCmd1() != menuBuild.getMenuCmd1() || getMenuCmd2() != menuBuild.getMenuCmd2() || getMenuCmd3() != menuBuild.getMenuCmd3() || getMenuCmd4() != menuBuild.getMenuCmd4()) {
            return false;
        }
        String tooltip = getTooltip();
        String tooltip2 = menuBuild.getTooltip();
        if (tooltip == null) {
            return tooltip2 == null;
        }
        return tooltip.equals(tooltip2);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof MenuBuild;
    }

    public int hashCode() {
        int row = (((((((((((1 * 59) + getRow()) * 59) + getMenuId()) * 59) + getMenuCmd1()) * 59) + getMenuCmd2()) * 59) + getMenuCmd3()) * 59) + getMenuCmd4();
        String tooltip = getTooltip();
        return (row * 59) + (tooltip == null ? 43 : tooltip.hashCode());
    }

    public String toString() {
        return "MenuBuild(tooltip=" + getTooltip() + ", row=" + getRow() + ", menuId=" + getMenuId() + ", menuCmd1=" + getMenuCmd1() + ", menuCmd2=" + getMenuCmd2() + ", menuCmd3=" + getMenuCmd3() + ", menuCmd4=" + getMenuCmd4() + ")";
    }
}
