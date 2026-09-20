package rs.p_ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.function.Function;

public class C_j extends GridLayout {
   public C_j() {
      this(1, 0, 0, 0);
   }

   public C_j(int var1, int var2) {
      this(var1, var2, 0, 0);
   }

   public C_j(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      synchronized (var1.getTreeLock()) {
         return this.a(var1, Component::getPreferredSize);
      }
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      synchronized (var1.getTreeLock()) {
         return this.a(var1, Component::getMinimumSize);
      }
   }

   @Override
   public void layoutContainer(Container var1) {
      synchronized (var1.getTreeLock()) {
         Insets var3 = var1.getInsets();
         int var4 = var1.getComponentCount();
         int var5 = this.getRows();
         int var6 = this.getColumns();
         if (var4 != 0) {
            if (var5 > 0) {
               var6 = (var4 + var5 - 1) / var5;
            } else {
               var5 = (var4 + var6 - 1) / var6;
            }

            int var7 = this.getHgap();
            int var8 = this.getVgap();
            Dimension var9 = this.preferredLayoutSize(var1);
            Insets var10 = var1.getInsets();
            int var11 = var10.left + var10.right;
            int var12 = var10.top + var10.bottom;
            double var13 = (1.0 * (double)var1.getWidth() - (double)var11) / (double)(var9.width - var11);
            double var15 = (1.0 * (double)var1.getHeight() - (double)var12) / (double)(var9.height - var12);
            int[] var17 = new int[var6];
            int[] var18 = new int[var5];

            for (int var19 = 0; var19 < var4; var19++) {
               int var20 = var19 / var6;
               int var21 = var19 % var6;
               Component var22 = var1.getComponent(var19);
               Dimension var23 = var22.getPreferredSize();
               var23.width = (int)(var13 * (double)var23.width);
               var23.height = (int)(var15 * (double)var23.height);
               if (var17[var21] < var23.width) {
                  var17[var21] = var23.width;
               }

               if (var18[var20] < var23.height) {
                  var18[var20] = var23.height;
               }
            }

            int var26 = 0;

            for (int var27 = var3.left; var26 < var6; var26++) {
               int var28 = 0;

               for (int var29 = var3.top; var28 < var5; var28++) {
                  int var30 = var28 * var6 + var26;
                  if (var30 < var4) {
                     var1.getComponent(var30).setBounds(var27, var29, var17[var26], var18[var28]);
                  }

                  var29 += var18[var28] + var8;
               }

               var27 += var17[var26] + var7;
            }
         }
      }
   }

   private Dimension a(Container var1, Function<Component, Dimension> var2) {
      int var3 = var1.getComponentCount();
      int var4 = this.getRows();
      int var5 = this.getColumns();
      if (var4 > 0) {
         var5 = (var3 + var4 - 1) / var4;
      } else {
         var4 = (var3 + var5 - 1) / var5;
      }

      int[] var6 = new int[var5];
      int[] var7 = new int[var4];

      for (int var8 = 0; var8 < var3; var8++) {
         int var9 = var8 / var5;
         int var10 = var8 % var5;
         Component var11 = var1.getComponent(var8);
         Dimension var12 = (Dimension)var2.apply(var11);
         if (var6[var10] < var12.width) {
            var6[var10] = var12.width;
         }

         if (var7[var9] < var12.height) {
            var7[var9] = var12.height;
         }
      }

      int var13 = 0;

      for (int var14 = 0; var14 < var5; var14++) {
         var13 += var6[var14];
      }

      int var15 = 0;

      for (int var16 = 0; var16 < var4; var16++) {
         var15 += var7[var16];
      }

      Insets var17 = var1.getInsets();
      return new Dimension(var17.left + var17.right + var13 + (var5 - 1) * this.getHgap(), var17.top + var17.bottom + var15 + (var4 - 1) * this.getVgap());
   }
}
