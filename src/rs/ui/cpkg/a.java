package rs.ui.cpkg;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import rs.class_492;

/* JADX INFO: loaded from: client-final.jar:rs/ui/c/a.class */
public class a extends SubstanceSkin {
    private static final String a = "RuneLite";

    a() {
        SubstanceSkin.ColorSchemes colorSchemes = SubstanceSkin.getColorSchemes(getClass().getResource("RuneLite.colorschemes"));
        SubstanceColorScheme substanceColorScheme = colorSchemes.get("RuneLite Active");
        SubstanceColorScheme substanceColorScheme2 = colorSchemes.get("RuneLite Enabled");
        SubstanceColorSchemeBundle substanceColorSchemeBundle = new SubstanceColorSchemeBundle(substanceColorScheme, substanceColorScheme2, substanceColorScheme2);
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme2, 0.6f, ComponentState.DISABLED_UNSELECTED);
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme, 0.6f, ComponentState.DISABLED_SELECTED);
        substanceColorSchemeBundle.registerHighlightColorScheme(colorSchemes.get("RuneLite Highlight"), ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_UNSELECTED);
        SubstanceColorScheme substanceColorScheme3 = colorSchemes.get("RuneLite Selected Disabled Border");
        SubstanceColorScheme substanceColorScheme4 = colorSchemes.get("RuneLite Border");
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme3, SubstanceSlices.ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_SELECTED);
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme4, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
        SubstanceColorScheme substanceColorScheme5 = colorSchemes.get("RuneLite Mark Active");
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme5, SubstanceSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
        substanceColorSchemeBundle.registerColorScheme(substanceColorScheme5, 0.6f, SubstanceSlices.ColorSchemeAssociationKind.MARK, ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        substanceColorSchemeBundle.registerColorScheme(colorSchemes.get("RuneLite Separator"), SubstanceSlices.ColorSchemeAssociationKind.SEPARATOR, new ComponentState[0]);
        substanceColorSchemeBundle.registerColorScheme(colorSchemes.get("RuneLite Tab Border"), SubstanceSlices.ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());
        registerDecorationAreaSchemeBundle(substanceColorSchemeBundle, colorSchemes.get("RuneLite Watermark"), SubstanceSlices.DecorationAreaType.NONE);
        SubstanceColorSchemeBundle substanceColorSchemeBundle2 = new SubstanceColorSchemeBundle(substanceColorScheme, substanceColorScheme2, substanceColorScheme2);
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme2, 0.5f, ComponentState.DISABLED_UNSELECTED);
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme3, SubstanceSlices.ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_SELECTED);
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme4, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
        substanceColorSchemeBundle2.registerColorScheme(substanceColorScheme5, SubstanceSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
        substanceColorSchemeBundle2.registerColorScheme(colorSchemes.get("RuneLite Decorations Separator"), SubstanceSlices.ColorSchemeAssociationKind.SEPARATOR, new ComponentState[0]);
        registerDecorationAreaSchemeBundle(substanceColorSchemeBundle2, colorSchemes.get("RuneLite Decorations Watermark"), SubstanceSlices.DecorationAreaType.TOOLBAR, SubstanceSlices.DecorationAreaType.GENERAL, SubstanceSlices.DecorationAreaType.FOOTER);
        SubstanceColorSchemeBundle substanceColorSchemeBundle3 = new SubstanceColorSchemeBundle(substanceColorScheme, substanceColorScheme2, substanceColorScheme2);
        substanceColorSchemeBundle3.registerColorScheme(substanceColorScheme2, 0.5f, ComponentState.DISABLED_UNSELECTED);
        SubstanceColorScheme substanceColorScheme6 = colorSchemes.get("RuneLite Header Border");
        substanceColorSchemeBundle3.registerColorScheme(substanceColorScheme3, SubstanceSlices.ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_SELECTED);
        substanceColorSchemeBundle3.registerColorScheme(substanceColorScheme6, SubstanceSlices.ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
        substanceColorSchemeBundle3.registerColorScheme(substanceColorScheme5, SubstanceSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
        substanceColorSchemeBundle3.registerHighlightColorScheme(substanceColorScheme, 0.7f, ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_ARMED, ComponentState.ARMED);
        substanceColorSchemeBundle3.registerHighlightColorScheme(substanceColorScheme, 0.8f, ComponentState.SELECTED);
        substanceColorSchemeBundle3.registerHighlightColorScheme(substanceColorScheme, 1.0f, ComponentState.ROLLOVER_SELECTED);
        registerDecorationAreaSchemeBundle(substanceColorSchemeBundle3, colorSchemes.get("RuneLite Header Watermark"), SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE, SubstanceSlices.DecorationAreaType.SECONDARY_TITLE_PANE, SubstanceSlices.DecorationAreaType.HEADER);
        setTabFadeStart(0.2d);
        setTabFadeEnd(0.9d);
        addOverlayPainter(BottomShadowOverlayPainter.getInstance(), SubstanceSlices.DecorationAreaType.TOOLBAR);
        addOverlayPainter(BottomShadowOverlayPainter.getInstance(), SubstanceSlices.DecorationAreaType.FOOTER);
        addOverlayPainter(new BottomLineOverlayPainter(substanceColorScheme7 -> {
            return substanceColorScheme7.getUltraDarkColor().darker();
        }), SubstanceSlices.DecorationAreaType.TOOLBAR);
        addOverlayPainter(new TopLineOverlayPainter(substanceColorScheme8 -> {
            return SubstanceColorUtilities.getAlphaColor(substanceColorScheme8.getForegroundColor(), 32);
        }), SubstanceSlices.DecorationAreaType.TOOLBAR);
        addOverlayPainter(new TopBezelOverlayPainter(substanceColorScheme9 -> {
            return substanceColorScheme9.getUltraDarkColor().darker();
        }, substanceColorScheme10 -> {
            return SubstanceColorUtilities.getAlphaColor(substanceColorScheme10.getForegroundColor(), 32);
        }), SubstanceSlices.DecorationAreaType.FOOTER);
        setTabFadeStart(0.18d);
        setTabFadeEnd(0.18d);
        this.buttonShaper = new b(this);
        this.watermark = null;
        this.fillPainter = new FractionBasedFillPainter(a, new float[]{0.0f, 0.5f, 1.0f}, new ColorSchemeSingleColorQuery[]{ColorSchemeSingleColorQuery.ULTRALIGHT, ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.LIGHT});
        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();
        this.borderPainter = new CompositeBorderPainter(a, new ClassicBorderPainter(), new DelegateBorderPainter("RuneLite Inner", new ClassicBorderPainter(), 1090519039, 553648127, class_492.c, substanceColorScheme11 -> {
            return substanceColorScheme11.tint(0.20000000298023224d);
        }));
    }

    @Override // org.pushingpixels.substance.api.trait.SubstanceTrait
    public String getDisplayName() {
        return a;
    }
}
