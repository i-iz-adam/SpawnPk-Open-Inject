package com.apple.eawt;

// Reconstructed stub: com.apple.eawt is a macOS-only Apple JDK API, absent
// from OpenJDK 11 / Corretto 21, deps.jar, client-final.jar and src/.
// This minimal source exists only so the codebase compiles on non-macOS
// JDKs. The real implementation is provided by the Apple runtime on macOS.
public interface FullScreenListener extends java.util.EventListener {
    default void windowEnteredFullScreen(com.apple.eawt.event.FullScreenEvent e) {
    }

    default void windowExitedFullScreen(com.apple.eawt.event.FullScreenEvent e) {
    }
}
