package rs.runelite.events;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/SkillLevelChanged.class */
public class SkillLevelChanged {
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

    public void setSkillId(int i) {
        this.skillId = i;
    }

    public void setExperience(double d) {
        this.experience = d;
    }

    public void setCurrentLevel(int i) {
        this.currentLevel = i;
    }

    public void setMaximumLevel(int i) {
        this.maximumLevel = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SkillLevelChanged)) {
            return false;
        }
        SkillLevelChanged skillLevelChanged = (SkillLevelChanged) obj;
        return skillLevelChanged.canEqual(this) && getSkillId() == skillLevelChanged.getSkillId() && Double.compare(getExperience(), skillLevelChanged.getExperience()) == 0 && getCurrentLevel() == skillLevelChanged.getCurrentLevel() && getMaximumLevel() == skillLevelChanged.getMaximumLevel();
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof SkillLevelChanged;
    }

    public int hashCode() {
        int skillId = (1 * 59) + getSkillId();
        long jDoubleToLongBits = Double.doubleToLongBits(getExperience());
        return (((((skillId * 59) + ((int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits))) * 59) + getCurrentLevel()) * 59) + getMaximumLevel();
    }

    public String toString() {
        int skillId = getSkillId();
        double experience = getExperience();
        int currentLevel = getCurrentLevel();
        getMaximumLevel();
        return "SkillLevelChanged(skillId=" + skillId + ", experience=" + experience + ", currentLevel=" + skillId + ", maximumLevel=" + currentLevel + ")";
    }

    public SkillLevelChanged(int i, double d, int i2, int i3) {
        this.skillId = i;
        this.experience = d;
        this.currentLevel = i2;
        this.maximumLevel = i3;
    }
}
