package rs;

import com.jacob.com.Dispatch;
import com.sun.jna.platform.win32.COM.tlb.a.e;
import com.sun.jna.platform.win32.aU;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.ARBVertexProgram;
import org.lwjgl.opengl.EXTStencilClearTag;
import org.lwjgl.opengl.EXTStencilTwoSide;
import org.lwjgl.opengl.EXTTextureMirrorClamp;
import org.lwjgl.system.windows.User32;
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.Options;

/* JADX INFO: loaded from: client-final.jar:rs/class_426.class */
public class class_426 extends class_360 {
    public static final Map<Integer, String> c = new HashMap();
    public static final String[] d = {"Depends on combat lvl", "Always right-click", "Left-click where avail.", "Hidden"};
    public static int e = -1;

    public class_426(class_338[] class_338VarArr) {
        super(class_338VarArr);
        c.put(-1, Options.TREE_LINE_STYLE_NONE_VALUE);
        c.put(112, "F1");
        c.put(113, "F2");
        c.put(114, "F3");
        c.put(115, "F4");
        c.put(116, "F5");
        c.put(117, "F6");
        c.put(118, "F7");
        c.put(119, "F8");
        c.put(120, "F9");
        c.put(121, "F10");
        c.put(122, "F11");
        c.put(123, "F12");
    }

    public static void m(int i) {
        if (i == 35004 && e == -1) {
            Configuration.bd = 10;
            Configuration.e();
            Configuration.d();
            h();
            return;
        }
        int i2 = -600;
        int i3 = -600;
        if (Client.br != 35062 || i < 35010 || i > 35046 || e == -1) {
            if (i == 35116) {
                Configuration.aS = !Configuration.aS;
                Widget.H[35115].E = Configuration.aS ? class_384.f : class_384.g;
                Widget.H[35115].aE = Configuration.aS ? class_384.f : class_384.g;
                Configuration.d();
            }
            if (i == 35079) {
                Widget.H[35000].b(54, EXTStencilTwoSide.GL_ACTIVE_STENCIL_FACE_EXT, 372, 132);
                Widget.H[35000].b(55, 35087, 372 - 57, 132 + 4);
                Widget.H[35000].b(52, 35062, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(53, 35077, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(46, 35091, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(47, 35096, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(41, 35102, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(42, 35107, Dispatch.R, Dispatch.R);
                return;
            }
            if (i == 35098) {
                Widget.H[35000].b(54, EXTStencilTwoSide.GL_ACTIVE_STENCIL_FACE_EXT, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(55, 35087, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(52, 35062, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(53, 35077, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(41, 35102, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(42, 35107, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(46, 35091, 388 - 55, 182);
                Widget.H[35000].b(47, 35096, 388 - 67, 182 + 4);
                Widget.H[35112].b(5, 35102, Dispatch.R, Dispatch.R);
                Widget.H[35112].b(6, 35107, Dispatch.R, Dispatch.R);
                Widget.H[35112].b(10, 35091, Widget.H[35112].al[9] - 70, Widget.H[35112].ba[9] + 19);
                Widget.H[35112].b(11, 35096, (Widget.H[35112].al[9] - 12) - 70, Widget.H[35112].ba[9] + 4 + 19);
                return;
            }
            if (i == 35109) {
                Widget.H[35000].b(54, EXTStencilTwoSide.GL_ACTIVE_STENCIL_FACE_EXT, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(55, 35087, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(52, 35062, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(53, 35077, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(41, 35102, 388 - 55, aU.hK_);
                Widget.H[35000].b(42, 35107, 388 - 67, aU.hK_ + 4);
                Widget.H[35000].b(46, 35091, Dispatch.R, Dispatch.R);
                Widget.H[35000].b(47, 35096, Dispatch.R, Dispatch.R);
                Widget.H[35112].b(5, 35102, (Widget.H[35112].al[4] - 70) - 1, Widget.H[35112].ba[4] + 19);
                Widget.H[35112].b(6, 35107, (Widget.H[35112].al[4] - 12) - 70, Widget.H[35112].ba[4] + 4 + 19);
                Widget.H[35112].b(10, 35091, Dispatch.R, Dispatch.R);
                Widget.H[35112].b(11, 35096, Dispatch.R, Dispatch.R);
                return;
            }
            if (e == -1 && Client.br != 35062) {
                switch (i) {
                    case ARBVertexProgram.GL_MATRIX2_ARB /* 35010 */:
                        i2 = 86;
                        i3 = 65;
                        e = 0;
                        break;
                    case ARBVertexProgram.GL_MATRIX6_ARB /* 35014 */:
                        i2 = 86;
                        i3 = 110;
                        e = 1;
                        break;
                    case ARBVertexProgram.GL_MATRIX10_ARB /* 35018 */:
                        i2 = 86;
                        i3 = 155;
                        e = 2;
                        break;
                    case ARBVertexProgram.GL_MATRIX14_ARB /* 35022 */:
                        i2 = 86;
                        i3 = 22;
                        e = 3;
                        break;
                    case ARBVertexProgram.GL_MATRIX18_ARB /* 35026 */:
                        i2 = 86;
                        i3 = 67;
                        e = 4;
                        break;
                    case ARBVertexProgram.GL_MATRIX22_ARB /* 35030 */:
                        i2 = 248;
                        i3 = 65;
                        e = 5;
                        break;
                    case ARBVertexProgram.GL_MATRIX26_ARB /* 35034 */:
                        i2 = 248;
                        i3 = 110;
                        e = 6;
                        break;
                    case ARBVertexProgram.GL_MATRIX30_ARB /* 35038 */:
                        i2 = 248;
                        i3 = 155;
                        e = 8;
                        break;
                    case 35042:
                        i2 = 248;
                        i3 = 22;
                        e = 9;
                        break;
                    case 35046:
                        i2 = 410;
                        i3 = 65;
                        e = 7;
                        break;
                    case 35083:
                        n(5);
                        break;
                    case 35084:
                        n(10);
                        break;
                    case 35085:
                        n(15);
                        break;
                    case 35086:
                        n(20);
                        break;
                    case 35092:
                        o(0);
                        break;
                    case 35093:
                        o(1);
                        break;
                    case 35094:
                        o(2);
                        break;
                    case 35095:
                        o(3);
                        break;
                    case 35103:
                        p(0);
                        break;
                    case 35104:
                        p(1);
                        break;
                    case 35105:
                        p(2);
                        break;
                    case 35106:
                        p(3);
                        break;
                }
            }
            if (e >= 0 && e <= 10) {
                switch (i) {
                    case 35063:
                        q(-1);
                        break;
                    case 35064:
                        q(112);
                        break;
                    case 35065:
                        q(113);
                        break;
                    case 35066:
                        q(114);
                        break;
                    case 35067:
                        q(115);
                        break;
                    case 35068:
                        q(116);
                        break;
                    case 35069:
                        q(117);
                        break;
                    case 35070:
                        q(118);
                        break;
                    case 35071:
                        q(119);
                        break;
                    case 35072:
                        q(120);
                        break;
                    case 35073:
                        q(121);
                        break;
                    case 35074:
                        q(122);
                        break;
                    case 35075:
                        q(123);
                        break;
                }
            }
            if (i2 == -600 && i3 == -600) {
                e = -1;
            }
            Widget.H[35000].b(52, 35062, i2, i3);
            Widget.H[35000].b(53, 35077, i2 - 57, i3 + 4);
            Widget.H[35000].b(54, EXTStencilTwoSide.GL_ACTIVE_STENCIL_FACE_EXT, Dispatch.R, Dispatch.R);
            Widget.H[35000].b(55, 35087, Dispatch.R, Dispatch.R);
            Widget.H[35000].b(46, 35091, Dispatch.R, Dispatch.R);
            Widget.H[35000].b(47, 35096, Dispatch.R, Dispatch.R);
            Widget.H[35000].b(41, 35102, Dispatch.R, Dispatch.R);
            Widget.H[35000].b(42, 35107, Dispatch.R, Dispatch.R);
            if (Widget.H[35112] == null || Widget.H[35112].ak.length < 10) {
                return;
            }
            Widget.H[35112].b(5, 35102, Dispatch.R, Dispatch.R);
            Widget.H[35112].b(6, 35107, Dispatch.R, Dispatch.R);
            Widget.H[35112].b(10, 35091, Dispatch.R, Dispatch.R);
            Widget.H[35112].b(11, 35096, Dispatch.R, Dispatch.R);
        }
    }

    public static void h() {
        for (int i = 0; i < Configuration.G.length; i++) {
            int i2 = i;
            if (i == 7) {
                i2 = 9;
            }
            if (i == 8) {
                i2 = 7;
            }
            if (i == 9) {
                i2 = 8;
            }
            Widget.H[ARBVertexProgram.GL_MATRIX1_ARB + (i2 * 4)].as = c.get(Integer.valueOf(Configuration.G[i]));
        }
        Widget.H[35078].as = Configuration.bd;
        Widget.H[35097].as = d[Configuration.bg];
        Widget.H[35108].as = d[Configuration.bh];
    }

    public static void n(int i) {
        Configuration.bd = i;
        Widget.H[35078].as = i;
        Configuration.d();
    }

    public static void o(int i) {
        Configuration.bg = i;
        Widget.H[35097].as = d[i];
        Configuration.d();
    }

    public static void p(int i) {
        Configuration.bh = i;
        Widget.H[35108].as = d[i];
        Configuration.d();
    }

    public static void q(int i) {
        int i2 = e;
        String str = c.get(Integer.valueOf(i));
        if (e == 7) {
            i2 = 9;
        }
        if (e == 8) {
            i2 = 7;
        }
        if (e == 9) {
            i2 = 8;
        }
        int i3 = ARBVertexProgram.GL_MATRIX1_ARB + (i2 * 4);
        if (i != -1 && e != -1) {
            for (int i4 = 0; i4 < Configuration.G.length; i4++) {
                if (Configuration.G[i4] == i) {
                    Configuration.G[i4] = Configuration.G[e];
                    h();
                    break;
                }
            }
        }
        Configuration.G[e] = i;
        Widget.H[i3].as = str;
        Configuration.d();
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(35000);
        addSprite(35001, "options/keybind 1");
        addSprite(35002, "options/keybind 2");
        a(35003, "Restore default", this.a, 0, 16751360, true, true);
        a(35004, "teleport/SPRITE", 10, 100, 32, "Restore to default key bindings", -1, 35005, 1);
        a(35005, "teleport/SPRITE", 11, 100, 32, 35006);
        a(35007, "Control Options Menu", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX1_ARB, "F1", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX2_ARB, "options/dropdown", 1, 100, 32, "Select dropdown", -1, ARBVertexProgram.GL_MATRIX3_ARB, 1);
        a(ARBVertexProgram.GL_MATRIX3_ARB, "options/dropdown", 2, 100, 32, ARBVertexProgram.GL_MATRIX4_ARB);
        a(ARBVertexProgram.GL_MATRIX5_ARB, "F1", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX6_ARB, "options/dropdown", 1, 100, 32, "Select dropdown", -1, ARBVertexProgram.GL_MATRIX7_ARB, 1);
        a(ARBVertexProgram.GL_MATRIX7_ARB, "options/dropdown", 2, 100, 32, ARBVertexProgram.GL_MATRIX8_ARB);
        a(ARBVertexProgram.GL_MATRIX9_ARB, "F1", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX10_ARB, "options/dropdown", 1, 100, 32, "Select dropdown", -1, ARBVertexProgram.GL_MATRIX11_ARB, 1);
        a(ARBVertexProgram.GL_MATRIX11_ARB, "options/dropdown", 2, 100, 32, ARBVertexProgram.GL_MATRIX12_ARB);
        a(ARBVertexProgram.GL_MATRIX13_ARB, "F1", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX14_ARB, "options/dropdown", 1, 100, 32, "Select dropdown", -1, ARBVertexProgram.GL_MATRIX15_ARB, 1);
        a(ARBVertexProgram.GL_MATRIX15_ARB, "options/dropdown", 2, 100, 32, ARBVertexProgram.GL_MATRIX16_ARB);
        a(ARBVertexProgram.GL_MATRIX17_ARB, "F1", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX18_ARB, "options/dropdown", 1, 100, 32, "Select dropdown", -1, ARBVertexProgram.GL_MATRIX19_ARB, 1);
        a(ARBVertexProgram.GL_MATRIX19_ARB, "options/dropdown", 2, 100, 32, ARBVertexProgram.GL_MATRIX20_ARB);
        a(ARBVertexProgram.GL_MATRIX21_ARB, "F1", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX22_ARB, "options/dropdown", 1, 100, 32, "Select dropdown", -1, ARBVertexProgram.GL_MATRIX23_ARB, 1);
        a(ARBVertexProgram.GL_MATRIX23_ARB, "options/dropdown", 2, 100, 32, ARBVertexProgram.GL_MATRIX24_ARB);
        a(ARBVertexProgram.GL_MATRIX25_ARB, "F1", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX26_ARB, "options/dropdown", 1, 100, 32, "Select dropdown", -1, ARBVertexProgram.GL_MATRIX27_ARB, 1);
        a(ARBVertexProgram.GL_MATRIX27_ARB, "options/dropdown", 2, 100, 32, ARBVertexProgram.GL_MATRIX28_ARB);
        a(ARBVertexProgram.GL_MATRIX29_ARB, "F1", this.a, 2, 16751360, true, true);
        a(ARBVertexProgram.GL_MATRIX30_ARB, "options/dropdown", 1, 100, 32, "Select dropdown", -1, ARBVertexProgram.GL_MATRIX31_ARB, 1);
        a(ARBVertexProgram.GL_MATRIX31_ARB, "options/dropdown", 2, 100, 32, 35040);
        a(35041, "F1", this.a, 2, 16751360, true, true);
        a(35042, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35043, 1);
        a(35043, "options/dropdown", 2, 100, 32, 35044);
        a(35045, "F1", this.a, 2, 16751360, true, true);
        a(35046, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35047, 1);
        a(35047, "options/dropdown", 2, 100, 32, 35048);
        a(35049, "F1", this.a, 2, 16751360, true, true);
        a(35050, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35051, 1);
        a(35051, "options/dropdown", 2, 100, 32, 35052);
        a(35053, "F1", this.a, 2, 16751360, true, true);
        a(35054, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35055, 1);
        a(35055, "options/dropdown", 2, 100, 32, 35056);
        a(35057, "F1", this.a, 2, 16751360, true, true);
        a(EXTStencilClearTag.GL_STENCIL_TAG_BITS_EXT, "options/dropdown", 1, 100, 32, "Select dropdown", -1, EXTStencilClearTag.GL_STENCIL_CLEAR_TAG_VALUE_EXT, 1);
        a(EXTStencilClearTag.GL_STENCIL_CLEAR_TAG_VALUE_EXT, "options/dropdown", 2, 100, 32, 35060);
        a(35078, "10", this.a, 2, 16751360, true, true);
        a(35079, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35080, 1);
        a(35080, "options/dropdown", 2, 100, 32, 35081);
        Widget widgetD2 = d(35061);
        addSprite(35062, "options/dropdown 3");
        Widget.H[35062].P = 70;
        a(35063, Options.TREE_LINE_STYLE_NONE_VALUE, "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35064, "F1", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35065, "F2", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35066, "F3", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35067, "F4", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35068, "F5", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35069, "F6", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35070, "F7", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35071, "F8", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35072, "F9", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35073, "F10", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35074, "F11", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        a(35075, "F12", "Select key binding", this.a, 2, class_492.e, true, true, 150);
        Widget widgetD3 = d(35077);
        widgetD3.aF = User32.VK_PLAY;
        widgetD3.P = 100;
        widgetD3.aP = 193;
        widgetD3.bh = 87;
        widgetD3.k(13);
        for (int i = 0; i < 13; i++) {
            widgetD3.b(i, 35063 + i, 5, 2 + (i * 17));
        }
        widgetD2.k(2);
        widgetD2.b(0, 35062, 0, 0);
        widgetD2.b(1, 35077, -100, 0);
        Widget widgetD4 = d(35082);
        addSprite(EXTStencilTwoSide.GL_ACTIVE_STENCIL_FACE_EXT, "options/dropdown 3");
        Widget.H[35089].P = 70;
        a(35083, e.k, "Select option", this.a, 2, class_492.e, true, true, 150);
        a(35084, "10", "Select option", this.a, 2, class_492.e, true, true, 150);
        a(35085, "15", "Select option", this.a, 2, class_492.e, true, true, 150);
        a(35086, "20", "Select option", this.a, 2, class_492.e, true, true, 150);
        Widget widgetD5 = d(35087);
        widgetD5.aF = User32.VK_PLAY;
        widgetD5.P = 100;
        widgetD5.aP = 193;
        widgetD5.bh = 87;
        widgetD5.k(4);
        for (int i2 = 0; i2 < 4; i2++) {
            widgetD5.b(i2, 35083 + i2, 5, 2 + (i2 * 17));
        }
        widgetD4.k(2);
        widgetD4.b(0, 35062, 0, 0);
        widgetD4.b(1, 35087, -100, 0);
        a(EXTStencilTwoSide.GL_STENCIL_TEST_TWO_SIDE_EXT, "Item Drag", this.a, 1, 16751360, true, true);
        a(EXTTextureMirrorClamp.GL_MIRROR_CLAMP_TO_BORDER_EXT, "Player 'attack' options", this.a, 1, 16751360, true, true);
        addSprite(35091, "options/dropdown 6");
        Widget.H[35091].P = 70;
        a(35092, "Depends on combat lvl", "Select option", this.a, 0, class_492.e, true, true, 150);
        a(35093, "Always right-click", "Select option", this.a, 0, class_492.e, true, true, 150);
        a(35094, "Left-click where avail.", "Select option", this.a, 0, class_492.e, true, true, 150);
        a(35095, "Hidden", "Select option", this.a, 0, class_492.e, true, true, 150);
        Widget widgetD6 = d(35096);
        widgetD6.aF = User32.VK_PLAY;
        widgetD6.P = 140;
        widgetD6.aP = 193;
        widgetD6.bh = 87;
        widgetD6.k(4);
        for (int i3 = 0; i3 < 4; i3++) {
            widgetD6.b(i3, 35092 + i3, 5, 2 + (i3 * 17));
        }
        a(35097, "Left-click where avail.", this.a, 0, 16751360, true, true);
        a(35098, "options/dropdown", 4, 145, 32, "Select dropdown", -1, 35099, 1);
        a(35099, "options/dropdown", 5, 145, 32, 35100);
        a(35101, "NPC/Bot 'attack' options", this.a, 1, 16751360, true, true);
        addSprite(35102, "options/dropdown 6");
        Widget.H[35102].P = 70;
        a(35103, "Depends on combat lvl", "Select option", this.a, 0, class_492.e, true, true, 150);
        a(35104, "Always right-click", "Select option", this.a, 0, class_492.e, true, true, 150);
        a(35105, "Left-click where avail.", "Select option", this.a, 0, class_492.e, true, true, 150);
        a(35106, "Hidden", "Select option", this.a, 0, class_492.e, true, true, 150);
        Widget widgetD7 = d(35107);
        widgetD7.aF = User32.VK_PLAY;
        widgetD7.P = 140;
        widgetD7.aP = 193;
        widgetD7.bh = 87;
        widgetD7.k(4);
        for (int i4 = 0; i4 < 4; i4++) {
            widgetD7.b(i4, 35103 + i4, 5, 2 + (i4 * 17));
        }
        a(35108, "Left-click where avail.", this.a, 0, 16751360, true, true);
        a(35109, "options/dropdown", 4, 145, 32, "Select dropdown", -1, 35110, 1);
        a(35110, "options/dropdown", 5, 145, 32, 35111);
        h();
        widgetD.k(56);
        widgetD.b(0, 35001, 20, 12);
        widgetD.b(1, 63740, 467, 20);
        widgetD.b(2, 63741, 467, 20);
        widgetD.b(3, 35002, 33, 53);
        widgetD.b(4, 35004, 377, 278);
        widgetD.b(5, 35005, 377, 278);
        widgetD.b(6, 35003, 427, 288);
        widgetD.b(7, 35007, aU.hS_, 21);
        widgetD.b(8, ARBVertexProgram.GL_MATRIX2_ARB, 86, 65);
        widgetD.b(9, ARBVertexProgram.GL_MATRIX3_ARB, 86, 65);
        widgetD.b(10, ARBVertexProgram.GL_MATRIX1_ARB, 110, 68);
        widgetD.b(11, ARBVertexProgram.GL_MATRIX6_ARB, 86, 65 + 45);
        widgetD.b(12, ARBVertexProgram.GL_MATRIX7_ARB, 86, 65 + 45);
        widgetD.b(13, ARBVertexProgram.GL_MATRIX5_ARB, 110, 68 + 45 + 1);
        int i5 = 45 + 45;
        widgetD.b(14, ARBVertexProgram.GL_MATRIX10_ARB, 86, 65 + i5);
        widgetD.b(15, ARBVertexProgram.GL_MATRIX11_ARB, 86, 65 + i5);
        widgetD.b(16, ARBVertexProgram.GL_MATRIX9_ARB, 110, 68 + i5 + 1);
        int i6 = i5 + 45;
        widgetD.b(17, ARBVertexProgram.GL_MATRIX14_ARB, 86, 65 + i6);
        widgetD.b(18, ARBVertexProgram.GL_MATRIX15_ARB, 86, 65 + i6);
        widgetD.b(19, ARBVertexProgram.GL_MATRIX13_ARB, 110, 68 + i6 + 1);
        int i7 = i6 + 45;
        widgetD.b(20, ARBVertexProgram.GL_MATRIX18_ARB, 86, 65 + i7);
        widgetD.b(21, ARBVertexProgram.GL_MATRIX19_ARB, 86, 65 + i7);
        widgetD.b(22, ARBVertexProgram.GL_MATRIX17_ARB, 110, 68 + i7 + 1);
        widgetD.b(23, ARBVertexProgram.GL_MATRIX22_ARB, 248, 65 + 0);
        widgetD.b(24, ARBVertexProgram.GL_MATRIX23_ARB, 248, 65 + 0);
        widgetD.b(25, ARBVertexProgram.GL_MATRIX21_ARB, User32.WM_INITDIALOG, 68 + 0 + 1);
        int i8 = 0 + 45;
        widgetD.b(26, ARBVertexProgram.GL_MATRIX26_ARB, 248, 65 + i8);
        widgetD.b(27, ARBVertexProgram.GL_MATRIX27_ARB, 248, 65 + i8);
        widgetD.b(28, ARBVertexProgram.GL_MATRIX25_ARB, User32.WM_INITDIALOG, 68 + i8 + 1);
        int i9 = i8 + 45;
        widgetD.b(29, ARBVertexProgram.GL_MATRIX30_ARB, 248, 65 + i9);
        widgetD.b(30, ARBVertexProgram.GL_MATRIX31_ARB, 248, 65 + i9);
        widgetD.b(31, ARBVertexProgram.GL_MATRIX29_ARB, User32.WM_INITDIALOG, 68 + i9 + 1);
        int i10 = i9 + 45;
        widgetD.b(32, 35042, 248, 65 + i10);
        widgetD.b(33, 35043, 248, 65 + i10);
        widgetD.b(34, 35041, User32.WM_INITDIALOG, 68 + i10 + 1);
        widgetD.b(35, 35046, 410, 65 + 0);
        widgetD.b(36, 35047, 410, 65 + 0);
        widgetD.b(37, 35045, 434, 68 + 0 + 1);
        widgetD.b(38, 35109, 333, 132 + 0 + 50 + 50);
        widgetD.b(39, 35108, 399, 137 + 0 + 50 + 50);
        widgetD.b(40, 35101, 405, 136 + 0 + 30 + 50);
        widgetD.b(41, 35102, 410 - 5, 165);
        widgetD.b(42, 35107, (410 - 57) - 5, 165 + 4);
        widgetD.b(43, 35098, 333, 132 + 0 + 50);
        widgetD.b(44, 35097, 399, 137 + 0 + 50);
        widgetD.b(45, EXTTextureMirrorClamp.GL_MIRROR_CLAMP_TO_BORDER_EXT, 405, 136 + 0 + 30);
        widgetD.b(46, 35091, 410 - 5, 115);
        widgetD.b(47, 35096, (410 - 57) - 5, 115 + 4);
        widgetD.b(48, 35079, 372, 132 + 0);
        widgetD.b(49, 35080, 372, 132 + 0);
        widgetD.b(50, 35078, 396, 136 + 0);
        widgetD.b(51, EXTStencilTwoSide.GL_STENCIL_TEST_TWO_SIDE_EXT, aU.io_, 112 + 0);
        widgetD.b(52, 35062, 410, 65);
        widgetD.b(53, 35077, 410 - 57, 65 + 4);
        widgetD.b(54, EXTStencilTwoSide.GL_ACTIVE_STENCIL_FACE_EXT, 410 - 55, 65);
        widgetD.b(55, 35087, (410 - 57) - 55, 65 + 4);
        m(-1);
    }
}
