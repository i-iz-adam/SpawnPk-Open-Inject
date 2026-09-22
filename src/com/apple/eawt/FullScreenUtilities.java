package com.apple.eawt;

// Reconstructed stub: com.apple.eawt is a macOS-only Apple JDK API, absent
// from OpenJDK 11 / Corretto 21, deps.jar, client-final.jar and src/.
// This minimal source exists only so the codebase compiles on non-macOS
// JDKs. The real implementation is provided by the Apple runtime on macOS.
// Signatures use java.awt.Window (superclass of Frame/JFrame) so both call
// sites compile: addFullScreenListenerTo(Frame, class_16) in class_16 and
// setWindowCanFullScreen(JFrame, boolean) in class_17.
public final class FullScreenUtilities {
    private FullScreenUtilities() {
    }

    public static void addFullScreenListenerTo(java.awt.Window window, FullScreenListener listener) {
    }

    public static void setWindowCanFullScreen(java.awt.Window window, boolean canFullScreen) {
    }
}
