package rs.runelite.events;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/ConfigChanged.class */
public class ConfigChanged {
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

    public void setGroup(String str) {
        this.group = str;
    }

    public void setProfile(@Nullable String str) {
        this.profile = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOldValue(String str) {
        this.oldValue = str;
    }

    public void setNewValue(String str) {
        this.newValue = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfigChanged)) {
            return false;
        }
        ConfigChanged configChanged = (ConfigChanged) obj;
        if (!configChanged.canEqual(this)) {
            return false;
        }
        String group = getGroup();
        String group2 = configChanged.getGroup();
        if (group == null) {
            if (group2 != null) {
                return false;
            }
        } else if (!group.equals(group2)) {
            return false;
        }
        String profile = getProfile();
        String profile2 = configChanged.getProfile();
        if (profile == null) {
            if (profile2 != null) {
                return false;
            }
        } else if (!profile.equals(profile2)) {
            return false;
        }
        String key = getKey();
        String key2 = configChanged.getKey();
        if (key == null) {
            if (key2 != null) {
                return false;
            }
        } else if (!key.equals(key2)) {
            return false;
        }
        String oldValue = getOldValue();
        String oldValue2 = configChanged.getOldValue();
        if (oldValue == null) {
            if (oldValue2 != null) {
                return false;
            }
        } else if (!oldValue.equals(oldValue2)) {
            return false;
        }
        String newValue = getNewValue();
        String newValue2 = configChanged.getNewValue();
        if (newValue == null) {
            return newValue2 == null;
        }
        return newValue.equals(newValue2);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof ConfigChanged;
    }

    public int hashCode() {
        String group = getGroup();
        int iHashCode = (1 * 59) + (group == null ? 43 : group.hashCode());
        String profile = getProfile();
        int iHashCode2 = (iHashCode * 59) + (profile == null ? 43 : profile.hashCode());
        String key = getKey();
        int iHashCode3 = (iHashCode2 * 59) + (key == null ? 43 : key.hashCode());
        String oldValue = getOldValue();
        int iHashCode4 = (iHashCode3 * 59) + (oldValue == null ? 43 : oldValue.hashCode());
        String newValue = getNewValue();
        return (iHashCode4 * 59) + (newValue == null ? 43 : newValue.hashCode());
    }

    public String toString() {
        return "ConfigChanged(group=" + getGroup() + ", profile=" + getProfile() + ", key=" + getKey() + ", oldValue=" + getOldValue() + ", newValue=" + getNewValue() + ")";
    }
}
