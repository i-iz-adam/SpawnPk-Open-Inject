package com.apple.eawt;

// Reconstructed stub: com.apple.eawt is a macOS-only Apple JDK API, absent
// from OpenJDK 11 / Corretto 21, deps.jar, client-final.jar and src/.
// Needed by src/rs/class_17.java (getApplication().requestUserAttention /
// requestForeground). No-op off macOS; real behavior comes from the Apple
// runtime on macOS.
public final class Application {
    private static final Application INSTANCE = new Application();

    private Application() {
    }

    public static Application getApplication() {
        return INSTANCE;
    }

    public void requestUserAttention(boolean critical) {
    }

    public void requestForeground(boolean allWindows) {
    }
}
