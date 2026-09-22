package rs.plugins.j;

import rs.class_132;
import rs.class_135;
import rs.class_137;
import rs.class_142;
import rs.plugins.bpkg.m;

/* JADX INFO: loaded from: client-final.jar:rs/s/j/a.class */
@class_135(a = "keyremapping")
public interface a extends class_132 {

    @class_142(a = "Camera Remapping", b = "Settings for remapping the camera", c = 0)
    public static final String a = "camera";

    @class_142(a = "F-key remapping", b = "Settings for remapping the F-keys.", c = 1)
    public static final String b = "fKeys";

    @class_137(a = 1, b = "cameraRemap", c = "Remap Camera", d = "Configures whether the camera movement uses remapped keys", h = a)
    default boolean a() {
        return true;
    }

    @class_137(a = 2, b = "up", c = "Camera Up key", d = "The key which will replace up.", h = a)
    default m b() {
        return new m(87, 0);
    }

    @class_137(a = 3, b = "down", c = "Camera Down key", d = "The key which will replace down.", h = a)
    default m c() {
        return new m(83, 0);
    }

    @class_137(a = 4, b = "left", c = "Camera Left key", d = "The key which will replace left.", h = a)
    default m d() {
        return new m(65, 0);
    }

    @class_137(a = 5, b = "right", c = "Camera Right key", d = "The key which will replace right.", h = a)
    default m e() {
        return new m(68, 0);
    }

    @class_137(a = 6, b = "fkeyRemap", c = "Remap F-keys", d = "Configures whether f-keys use remapped keys.", h = b)
    default boolean f() {
        return false;
    }

    @class_137(a = 7, b = "f1", c = "F1", d = "The key which will replace F1.", h = b)
    default m g() {
        return new m(49, 0);
    }

    @class_137(a = 8, b = "f2", c = "F2", d = "The key which will replace F2.", h = b)
    default m h() {
        return new m(50, 0);
    }

    @class_137(a = 9, b = "f3", c = "F3", d = "The key which will replace F3.", h = b)
    default m i() {
        return new m(51, 0);
    }

    @class_137(a = 10, b = "f4", c = "F4", d = "The key which will replace F4.", h = b)
    default m j() {
        return new m(52, 0);
    }

    @class_137(a = 11, b = "f5", c = "F5", d = "The key which will replace F5.", h = b)
    default m k() {
        return new m(53, 0);
    }

    @class_137(a = 12, b = "f6", c = "F6", d = "The key which will replace F6.", h = b)
    default m l() {
        return new m(54, 0);
    }

    @class_137(a = 13, b = "f7", c = "F7", d = "The key which will replace F7.", h = b)
    default m m() {
        return new m(55, 0);
    }

    @class_137(a = 14, b = "f8", c = "F8", d = "The key which will replace F8.", h = b)
    default m n() {
        return new m(56, 0);
    }

    @class_137(a = 15, b = "f9", c = "F9", d = "The key which will replace F9.", h = b)
    default m o() {
        return new m(57, 0);
    }

    @class_137(a = 16, b = "f10", c = "F10", d = "The key which will replace F10.", h = b)
    default m p() {
        return new m(48, 0);
    }

    @class_137(a = 17, b = "f11", c = "F11", d = "The key which will replace F11.", h = b)
    default m q() {
        return new m(45, 0);
    }

    @class_137(a = 18, b = "f12", c = "F12", d = "The key which will replace F12.", h = b)
    default m r() {
        return new m(61, 0);
    }
}
