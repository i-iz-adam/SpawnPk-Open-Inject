package rs.gui;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/gui/u.class */
public class u extends JFrame {
    private static final Logger b;
    private static final int c = 40;
    private static boolean d;
    private static boolean e;
    private v f = v.b;
    private a g;
    private boolean h;
    static final /* synthetic */ boolean a;

    /* JADX INFO: loaded from: client-final.jar:rs/gui/u$a.class */
    public enum a {
        a,
        b,
        c
    }

    @com.google.a.a.d
    static boolean a(String str) {
        if (a(str, 15, -1, -1)) {
            return true;
        }
        if (a(str, 14, -1, -1)) {
            return false;
        }
        if (a(str, 13, 0, 4)) {
            return true;
        }
        if (a(str, 12, -1, -1)) {
            return false;
        }
        return a(str, 11, 0, 8);
    }

    @com.google.a.a.d
    static boolean b(String str) {
        if (a(str, 15, -1, -1)) {
            return true;
        }
        if (a(str, 14, -1, -1)) {
            return false;
        }
        if (a(str, 13, 0, 7)) {
            return true;
        }
        if (a(str, 12, -1, -1)) {
            return false;
        }
        return a(str, 11, 0, 9);
    }

    private static boolean a(String str, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int iIndexOf = str.indexOf(95);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 3) {
            i4 = Integer.parseInt(strArrSplit[0]);
            i5 = Integer.parseInt(strArrSplit[1]);
            i6 = Integer.parseInt(strArrSplit[2]);
        } else {
            i4 = Integer.parseInt(strArrSplit[0]);
            i5 = -1;
            i6 = -1;
        }
        int iCompare = Integer.compare(i4, i);
        if (iCompare != 0) {
            return iCompare > 0;
        }
        int iCompare2 = Integer.compare(i5, i2);
        if (iCompare2 != 0) {
            return iCompare2 > 0;
        }
        int iCompare3 = Integer.compare(i6, i3);
        return iCompare3 == 0 || iCompare3 > 0;
    }

    public void a(a aVar) {
        this.g = aVar;
        if (this.g == a.a) {
            setLocation(getX(), getY());
            setBounds(getX(), getY(), getWidth(), getHeight());
        }
    }

    public void setLocation(int i, int i2) {
        if (this.g == a.a) {
            Rectangle bounds = getGraphicsConfiguration().getBounds();
            i = Math.min(Math.max(i, (int) bounds.getX()), (int) ((bounds.getX() + bounds.getWidth()) - ((double) getWidth())));
            i2 = Math.min(Math.max(i2, (int) bounds.getY()), (int) ((bounds.getY() + bounds.getHeight()) - ((double) getHeight())));
        }
        super.setLocation(i, i2);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        if (this.g == a.a) {
            Rectangle bounds = getGraphicsConfiguration().getBounds();
            int iMin = Math.min(i3, (i3 - ((int) bounds.getX())) + i);
            i = Math.max(i, (int) bounds.getX());
            int iMin2 = Math.min(i4, (i4 - ((int) bounds.getY())) + i2);
            i2 = Math.max(i2, (int) bounds.getY());
            i3 = Math.min(iMin, ((int) (bounds.getX() + bounds.getWidth())) - i);
            i4 = Math.min(iMin2, ((int) (bounds.getY() + bounds.getHeight())) - i2);
        }
        super.setBounds(i, i2, i3, i4);
    }

    public void a(int i) {
        int i2;
        int width;
        if (d()) {
            return;
        }
        int i3 = i;
        boolean z = false;
        if (this.f == v.a && (i2 = getLayout().minimumLayoutSize(this).width) > (width = getWidth())) {
            z = true;
            i3 = i2 - width;
        }
        if (z || this.f == v.b) {
            int width2 = getWidth() + i3;
            int x = getX();
            if (this.g != a.c) {
                Rectangle bounds = getGraphicsConfiguration().getBounds();
                if (((double) (getX() + width2)) > bounds.getX() + bounds.getWidth()) {
                    if (!f() || e()) {
                        x = ((int) (bounds.getX() + bounds.getWidth())) - getWidth();
                    }
                    x -= i3;
                    this.h = true;
                }
            }
            setBounds(x, getY(), width2, getHeight());
        }
        a();
    }

    public void b(int i) {
        if (d()) {
            return;
        }
        a();
        boolean z = Math.abs(((double) getX()) - getGraphicsConfiguration().getBounds().getX()) <= 40.0d;
        int x = getX();
        int width = getWidth() - i;
        if (f() && (this.h || !z)) {
            x += i;
        }
        if (this.f == v.a && width > getMinimumSize().width) {
            width = getWidth();
            x = getX();
        }
        setBounds(x, getY(), width, getHeight());
        this.h = false;
    }

    public void setMaximizedBounds(Rectangle rectangle) {
        if (rs.lpkg.j.a() == rs.lpkg.j.b) {
            super.setMaximizedBounds(rectangle);
        } else {
            super.setMaximizedBounds(c());
        }
    }

    private GraphicsConfiguration b() {
        return (GraphicsConfiguration) Arrays.stream(GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()).map((v0) -> {
            return v0.getDefaultConfiguration();
        }).max(Comparator.comparingInt(graphicsConfiguration -> {
            Rectangle rectangleIntersection = graphicsConfiguration.getBounds().intersection(getBounds());
            return rectangleIntersection.width * rectangleIntersection.height;
        })).orElseGet(this::getGraphicsConfiguration);
    }

    private Rectangle c() {
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        b.trace("Current bounds: {}", getBounds());
        for (GraphicsDevice graphicsDevice : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
            GraphicsConfiguration defaultConfiguration = graphicsDevice.getDefaultConfiguration();
            b.trace("Device: {} bounds {} insets {}", graphicsDevice, defaultConfiguration.getBounds(), defaultToolkit.getScreenInsets(defaultConfiguration));
        }
        GraphicsConfiguration graphicsConfigurationB = b();
        Shape bounds = graphicsConfigurationB.getBounds();
        b.trace("Chosen device: {} bounds {}", graphicsConfigurationB, bounds);
        if (!d) {
            bounds = graphicsConfigurationB.getDefaultTransform().createTransformedShape(bounds).getBounds();
            b.trace("Transformed bounds {}", bounds);
        }
        Insets screenInsets = defaultToolkit.getScreenInsets(graphicsConfigurationB);
        if (!d) {
            ((Rectangle) bounds).y = 0;
            ((Rectangle) bounds).x = 0;
            if (!a && e) {
                throw new AssertionError("scaled insets without scaled bounds");
            }
        } else if (!e) {
            double scaleX = graphicsConfigurationB.getDefaultTransform().getScaleX();
            double scaleY = graphicsConfigurationB.getDefaultTransform().getScaleY();
            screenInsets.top = (int) (((double) screenInsets.top) / scaleY);
            screenInsets.bottom = (int) (((double) screenInsets.bottom) / scaleY);
            screenInsets.left = (int) (((double) screenInsets.left) / scaleX);
            screenInsets.right = (int) (((double) screenInsets.right) / scaleX);
        }
        ((Rectangle) bounds).x += screenInsets.left;
        ((Rectangle) bounds).y += screenInsets.top;
        ((Rectangle) bounds).height -= screenInsets.bottom + screenInsets.top;
        ((Rectangle) bounds).width -= screenInsets.right + screenInsets.left;
        b.trace("Final bounds: {}", bounds);
        return bounds;
    }

    public void a() {
        setMinimumSize(getLayout().minimumLayoutSize(this));
    }

    private boolean d() {
        return (getExtendedState() & 6) == 6;
    }

    private boolean e() {
        return Math.abs(((double) getX()) - getGraphicsConfiguration().getBounds().getX()) <= 40.0d;
    }

    private boolean f() {
        Rectangle bounds = getGraphicsConfiguration().getBounds();
        return Math.abs(((double) (getX() + getWidth())) - (bounds.getX() + bounds.getWidth())) <= 40.0d;
    }

    static {
        a = !u.class.desiredAssertionStatus();
        b = LoggerFactory.getLogger((Class<?>) u.class);
        try {
            String property = System.getProperty("java.version");
            d = a(property);
            e = b(property);
        } catch (Exception e2) {
            b.error("error checking java version", (Throwable) e2);
        }
    }
}
