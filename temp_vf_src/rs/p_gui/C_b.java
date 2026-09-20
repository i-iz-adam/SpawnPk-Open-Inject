package rs.p_gui;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSkin.ColorSchemes;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
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

public class C_b extends SubstanceSkin {
   private static final String a = "RuneLite";

   C_b() {
      ColorSchemes var1 = SubstanceSkin.getColorSchemes(this.getClass().getResource("RuneLite.colorschemes"));
      SubstanceColorScheme var2 = var1.get("RuneLite Active");
      SubstanceColorScheme var3 = var1.get("RuneLite Enabled");
      SubstanceColorSchemeBundle var4 = new SubstanceColorSchemeBundle(var2, var3, var3);
      var4.registerColorScheme(var3, 0.6F, new ComponentState[]{ComponentState.DISABLED_UNSELECTED});
      var4.registerColorScheme(var2, 0.6F, new ComponentState[]{ComponentState.DISABLED_SELECTED});
      SubstanceColorScheme var5 = var1.get("RuneLite Selected Disabled Border");
      SubstanceColorScheme var6 = var1.get("RuneLite Border");
      var4.registerColorScheme(var5, ColorSchemeAssociationKind.BORDER, new ComponentState[]{ComponentState.DISABLED_SELECTED});
      var4.registerColorScheme(var6, ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
      SubstanceColorScheme var7 = var1.get("RuneLite Mark Active");
      var4.registerColorScheme(var7, ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
      var4.registerColorScheme(
         var7, 0.6F, ColorSchemeAssociationKind.MARK, new ComponentState[]{ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED}
      );
      SubstanceColorScheme var8 = var1.get("RuneLite Separator");
      var4.registerColorScheme(var8, ColorSchemeAssociationKind.SEPARATOR, new ComponentState[0]);
      var4.registerColorScheme(var1.get("RuneLite Tab Border"), ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());
      SubstanceColorScheme var9 = var1.get("RuneLite Watermark");
      this.registerDecorationAreaSchemeBundle(var4, var9, new DecorationAreaType[]{DecorationAreaType.NONE});
      SubstanceColorSchemeBundle var10 = new SubstanceColorSchemeBundle(var2, var3, var3);
      var10.registerColorScheme(var3, 0.5F, new ComponentState[]{ComponentState.DISABLED_UNSELECTED});
      var10.registerColorScheme(var5, ColorSchemeAssociationKind.BORDER, new ComponentState[]{ComponentState.DISABLED_SELECTED});
      var10.registerColorScheme(var6, ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
      var10.registerColorScheme(var7, ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
      SubstanceColorScheme var11 = var1.get("RuneLite Decorations Separator");
      var10.registerColorScheme(var11, ColorSchemeAssociationKind.SEPARATOR, new ComponentState[0]);
      SubstanceColorScheme var12 = var1.get("RuneLite Decorations Watermark");
      this.registerDecorationAreaSchemeBundle(
         var10, var12, new DecorationAreaType[]{DecorationAreaType.TOOLBAR, DecorationAreaType.GENERAL, DecorationAreaType.FOOTER}
      );
      SubstanceColorSchemeBundle var13 = new SubstanceColorSchemeBundle(var2, var3, var3);
      var13.registerColorScheme(var3, 0.5F, new ComponentState[]{ComponentState.DISABLED_UNSELECTED});
      SubstanceColorScheme var14 = var1.get("RuneLite Header Border");
      var13.registerColorScheme(var5, ColorSchemeAssociationKind.BORDER, new ComponentState[]{ComponentState.DISABLED_SELECTED});
      var13.registerColorScheme(var14, ColorSchemeAssociationKind.BORDER, new ComponentState[0]);
      var13.registerColorScheme(var7, ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
      var13.registerHighlightColorScheme(
         var2, 0.7F, new ComponentState[]{ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_ARMED, ComponentState.ARMED}
      );
      var13.registerHighlightColorScheme(var2, 0.8F, new ComponentState[]{ComponentState.SELECTED});
      var13.registerHighlightColorScheme(var2, 1.0F, new ComponentState[]{ComponentState.ROLLOVER_SELECTED});
      SubstanceColorScheme var15 = var1.get("RuneLite Header Watermark");
      this.registerDecorationAreaSchemeBundle(
         var13, var15, new DecorationAreaType[]{DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE, DecorationAreaType.HEADER}
      );
      this.setTabFadeStart(0.2);
      this.setTabFadeEnd(0.9);
      this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(), new DecorationAreaType[]{DecorationAreaType.TOOLBAR});
      this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(), new DecorationAreaType[]{DecorationAreaType.FOOTER});
      BottomLineOverlayPainter var16 = new BottomLineOverlayPainter(var0 -> var0.getUltraDarkColor().darker());
      this.addOverlayPainter(var16, new DecorationAreaType[]{DecorationAreaType.TOOLBAR});
      TopLineOverlayPainter var17 = new TopLineOverlayPainter(var0 -> SubstanceColorUtilities.getAlphaColor(var0.getForegroundColor(), 32));
      this.addOverlayPainter(var17, new DecorationAreaType[]{DecorationAreaType.TOOLBAR});
      TopBezelOverlayPainter var18 = new TopBezelOverlayPainter(
         var0 -> var0.getUltraDarkColor().darker(), var0 -> SubstanceColorUtilities.getAlphaColor(var0.getForegroundColor(), 32)
      );
      this.addOverlayPainter(var18, new DecorationAreaType[]{DecorationAreaType.FOOTER});
      this.setTabFadeStart(0.18);
      this.setTabFadeEnd(0.18);
      this.buttonShaper = new C_c(this);
      this.watermark = null;
      this.fillPainter = new FractionBasedFillPainter(
         "RuneLite",
         new float[]{0.0F, 0.5F, 1.0F},
         new ColorSchemeSingleColorQuery[]{ColorSchemeSingleColorQuery.ULTRALIGHT, ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.LIGHT}
      );
      this.decorationPainter = new MatteDecorationPainter();
      this.highlightPainter = new ClassicHighlightPainter();
      this.borderPainter = new CompositeBorderPainter(
         "RuneLite",
         new ClassicBorderPainter(),
         new DelegateBorderPainter("RuneLite Inner", new ClassicBorderPainter(), 1090519039, 553648127, 16777215, var0 -> var0.tint(0.2F))
      );
   }

   public String getDisplayName() {
      return "RuneLite";
   }
}
