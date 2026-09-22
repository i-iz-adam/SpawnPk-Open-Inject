package rs.runelite.events;

import rs.plugins.a;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/PluginChanged.class */
public class PluginChanged {
    private final a plugin;
    private final boolean loaded;

    public PluginChanged(a aVar, boolean z) {
        this.plugin = aVar;
        this.loaded = z;
    }

    public a getPlugin() {
        return this.plugin;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PluginChanged)) {
            return false;
        }
        PluginChanged pluginChanged = (PluginChanged) obj;
        if (!pluginChanged.canEqual(this) || isLoaded() != pluginChanged.isLoaded()) {
            return false;
        }
        a plugin = getPlugin();
        a plugin2 = pluginChanged.getPlugin();
        if (plugin == null) {
            return plugin2 == null;
        }
        return plugin.equals(plugin2);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof PluginChanged;
    }

    public int hashCode() {
        int i = (1 * 59) + (isLoaded() ? 79 : 97);
        a plugin = getPlugin();
        return (i * 59) + (plugin == null ? 43 : plugin.hashCode());
    }

    public String toString() {
        return "PluginChanged(plugin=" + String.valueOf(getPlugin()) + ", loaded=" + isLoaded() + ")";
    }
}
