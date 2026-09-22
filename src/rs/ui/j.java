package rs.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.function.Function;

/* JADX INFO: loaded from: client-final.jar:rs/ui/j.class */
public class j extends GridLayout {
    public j() {
        this(1, 0, 0, 0);
    }

    public j(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public j(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public Dimension preferredLayoutSize(Container container) {
        Dimension dimensionA;
        synchronized (container.getTreeLock()) {
            dimensionA = a(container, (v0) -> {
                return v0.getPreferredSize();
            });
        }
        return dimensionA;
    }

    public Dimension minimumLayoutSize(Container container) {
        Dimension dimensionA;
        synchronized (container.getTreeLock()) {
            dimensionA = a(container, (v0) -> {
                return v0.getMinimumSize();
            });
        }
        return dimensionA;
    }

    public void layoutContainer(Container container) {
        synchronized (container.getTreeLock()) {
            Insets insets = container.getInsets();
            int componentCount = container.getComponentCount();
            int rows = getRows();
            int columns = getColumns();
            if (componentCount == 0) {
                return;
            }
            if (rows > 0) {
                columns = ((componentCount + rows) - 1) / rows;
            } else {
                rows = ((componentCount + columns) - 1) / columns;
            }
            int hgap = getHgap();
            int vgap = getVgap();
            Dimension dimensionPreferredLayoutSize = preferredLayoutSize(container);
            Insets insets2 = container.getInsets();
            int i = insets2.left + insets2.right;
            int i2 = insets2.top + insets2.bottom;
            double width = ((1.0d * ((double) container.getWidth())) - ((double) i)) / ((double) (dimensionPreferredLayoutSize.width - i));
            double height = ((1.0d * ((double) container.getHeight())) - ((double) i2)) / ((double) (dimensionPreferredLayoutSize.height - i2));
            int[] iArr = new int[columns];
            int[] iArr2 = new int[rows];
            for (int i3 = 0; i3 < componentCount; i3++) {
                int i4 = i3 / columns;
                int i5 = i3 % columns;
                Dimension preferredSize = container.getComponent(i3).getPreferredSize();
                preferredSize.width = (int) (width * ((double) preferredSize.width));
                preferredSize.height = (int) (height * ((double) preferredSize.height));
                if (iArr[i5] < preferredSize.width) {
                    iArr[i5] = preferredSize.width;
                }
                if (iArr2[i4] < preferredSize.height) {
                    iArr2[i4] = preferredSize.height;
                }
            }
            int i6 = insets.left;
            for (int i7 = 0; i7 < columns; i7++) {
                int i8 = insets.top;
                for (int i9 = 0; i9 < rows; i9++) {
                    int i10 = (i9 * columns) + i7;
                    if (i10 < componentCount) {
                        container.getComponent(i10).setBounds(i6, i8, iArr[i7], iArr2[i9]);
                    }
                    i8 += iArr2[i9] + vgap;
                }
                i6 += iArr[i7] + hgap;
            }
        }
    }

    private Dimension a(Container container, Function<Component, Dimension> function) {
        int componentCount = container.getComponentCount();
        int rows = getRows();
        int columns = getColumns();
        if (rows > 0) {
            columns = ((componentCount + rows) - 1) / rows;
        } else {
            rows = ((componentCount + columns) - 1) / columns;
        }
        int[] iArr = new int[columns];
        int[] iArr2 = new int[rows];
        for (int i = 0; i < componentCount; i++) {
            int i2 = i / columns;
            int i3 = i % columns;
            Dimension dimensionApply = function.apply(container.getComponent(i));
            if (iArr[i3] < dimensionApply.width) {
                iArr[i3] = dimensionApply.width;
            }
            if (iArr2[i2] < dimensionApply.height) {
                iArr2[i2] = dimensionApply.height;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < columns; i5++) {
            i4 += iArr[i5];
        }
        int i6 = 0;
        for (int i7 = 0; i7 < rows; i7++) {
            i6 += iArr2[i7];
        }
        Insets insets = container.getInsets();
        return new Dimension(insets.left + insets.right + i4 + ((columns - 1) * getHgap()), insets.top + insets.bottom + i6 + ((rows - 1) * getVgap()));
    }
}
