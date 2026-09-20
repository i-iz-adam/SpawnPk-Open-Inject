package com.apple.eawt;

public class Application {
    private static final Application INSTANCE = new Application();
    
    public static Application getApplication() {
        return INSTANCE;
    }
    
    public void setDockIconImage(java.awt.Image image) {}
}
