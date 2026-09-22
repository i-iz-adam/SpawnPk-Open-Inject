package rs.gui.bpkg.cpkg;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL11;
import org.lwjgl.opencl.KHRCommandBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;
import rs.gui.bpkg.bpkg.d;
import rs.gui.bpkg.f;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/c/a.class */
public class a {
    public static final int[][] a = {new int[]{55, User32.VK_OEM_PA3}, new int[]{125, User32.VK_OEM_PA3}, new int[]{55, User32.WM_IME_STARTCOMPOSITION}, new int[]{125, User32.WM_IME_STARTCOMPOSITION}, new int[]{55, 301}, new int[]{125, 301}, new int[]{55, 333}};
    public static final int[] b = {0, 4, 2, 5, 1, 6, 3};
    public static final char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '-', ' '};

    public static void a(String str, rs.gui.bpkg.c cVar, d dVar) {
        if (cVar.isEmpty()) {
            rs.gui.bpkg.a aVar = new rs.gui.bpkg.a("Melee");
            aVar.a(c.k, G.dH);
            aVar.a(c.g, -1);
            aVar.a(c.h, 8850);
            aVar.a(c.d, 4751);
            aVar.a(c.c, 10551);
            aVar.a(c.e, 11732);
            aVar.a(c.b, 6585);
            aVar.a(c.i, CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT);
            aVar.a(c.j, 7462);
            aVar.a(c.f, 6570);
            aVar.a(c.a, 10828);
            aVar.a(0, new f(560, 25000));
            aVar.a(1, new f(9075, 25000));
            aVar.a(2, new f(aU.iP_, 25000));
            aVar.a(3, new f(23279, 1));
            aVar.a(4, new f(23255, 1));
            aVar.a(5, new f(23351, 1));
            aVar.a(6, new f(23351, 1));
            aVar.a(7, new f(23399, 1));
            aVar.a(8, new f(23399, 1));
            aVar.a(9, new f(15272, 1));
            aVar.a(10, new f(3144, 1));
            aVar.a(11, new f(15272, 1));
            aVar.a(12, new f(15272, 1));
            aVar.a(13, new f(3144, 1));
            aVar.a(14, new f(15272, 1));
            aVar.a(15, new f(3144, 1));
            aVar.a(16, new f(5680, 1));
            aVar.a(17, new f(15272, 1));
            aVar.a(18, new f(3144, 1));
            aVar.a(19, new f(15272, 1));
            aVar.a(20, new f(15272, 1));
            aVar.a(21, new f(15272, 1));
            aVar.a(22, new f(15272, 1));
            aVar.a(23, new f(15272, 1));
            aVar.a(24, new f(15272, 1));
            aVar.a(25, new f(15272, 1));
            aVar.a(26, new f(15272, 1));
            aVar.a(27, new f(15272, 1));
            cVar.add(aVar);
            rs.gui.bpkg.a aVar2 = new rs.gui.bpkg.a("Hybrid (NH)");
            aVar2.a(rs.gui.bpkg.a.Spellbook.b);
            aVar2.a(c.k, G.dH);
            aVar2.a(c.g, new f(9244, aU.ie));
            aVar2.a(c.h, 3842);
            aVar2.a(c.d, 4714);
            aVar2.a(c.c, 4712);
            aVar2.a(c.e, 6920);
            aVar2.a(c.b, 6585);
            aVar2.a(c.i, 4675);
            aVar2.a(c.j, 7462);
            aVar2.a(c.f, 2414);
            aVar2.a(c.a, 4708);
            aVar2.a(0, new f(9185, 1));
            aVar2.a(1, new f(CL10.CL_PROFILING_COMMAND_QUEUED, 1));
            aVar2.a(2, new f(KHRCommandBuffer.CL_COMMAND_BUFFER_STATE_KHR, 1));
            aVar2.a(3, new f(10499, 1));
            aVar2.a(4, new f(23399, 1));
            aVar2.a(5, new f(23399, 1));
            aVar2.a(6, new f(23399, 1));
            aVar2.a(7, new f(23351, 1));
            aVar2.a(8, new f(23351, 1));
            aVar2.a(9, new f(23279, 1));
            aVar2.a(10, new f(23255, 1));
            aVar2.a(11, new f(23423, 1));
            aVar2.a(12, new f(3144, 1));
            aVar2.a(13, new f(3144, 1));
            aVar2.a(14, new f(15272, 1));
            aVar2.a(15, new f(15272, 1));
            aVar2.a(16, new f(15272, 1));
            aVar2.a(17, new f(15272, 1));
            aVar2.a(18, new f(15272, 1));
            aVar2.a(19, new f(15272, 1));
            aVar2.a(20, new f(5698, 1));
            aVar2.a(21, new f(15272, 1));
            aVar2.a(22, new f(15272, 1));
            aVar2.a(23, new f(15272, 1));
            aVar2.a(24, new f(15272, 1));
            aVar2.a(25, new f(aU.iN_, 25000));
            aVar2.a(26, new f(aU.iW_, 25000));
            aVar2.a(27, new f(560, 25000));
            cVar.add(aVar2);
            rs.gui.bpkg.a aVar3 = new rs.gui.bpkg.a("Pure");
            aVar3.a(rs.gui.bpkg.a.Spellbook.a);
            aVar3.b(0);
            aVar3.a(c.k, G.dH);
            aVar3.a(c.h, 20479);
            aVar3.a(c.d, 2497);
            aVar3.a(c.c, 6107);
            aVar3.a(c.e, GL11.GL_INDEX_WRITEMASK);
            aVar3.a(c.b, 6585);
            aVar3.a(c.i, CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT);
            aVar3.a(c.j, 7458);
            aVar3.a(c.f, 6570);
            aVar3.a(c.a, 2581);
            aVar3.a(0, new f(23279, 1));
            aVar3.a(1, new f(23255, 1));
            aVar3.a(2, new f(23351, 1));
            aVar3.a(3, new f(23351, 1));
            aVar3.a(4, new f(23399, 1));
            aVar3.a(5, new f(23399, 1));
            aVar3.a(6, new f(3144, 1));
            aVar3.a(7, new f(3144, 1));
            aVar3.a(8, new f(15272, 1));
            aVar3.a(9, new f(15272, 1));
            aVar3.a(10, new f(15272, 1));
            aVar3.a(11, new f(15272, 1));
            aVar3.a(12, new f(15272, 1));
            aVar3.a(13, new f(15272, 1));
            aVar3.a(14, new f(15272, 1));
            aVar3.a(15, new f(15272, 1));
            aVar3.a(16, new f(15272, 1));
            aVar3.a(17, new f(15272, 1));
            aVar3.a(18, new f(15272, 1));
            aVar3.a(19, new f(15272, 1));
            aVar3.a(20, new f(CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG, 1));
            aVar3.a(21, new f(15272, 1));
            aVar3.a(22, new f(15272, 1));
            aVar3.a(23, new f(15272, 1));
            aVar3.a(24, new f(15272, 1));
            aVar3.a(25, new f(15272, 1));
            aVar3.a(26, new f(15272, 1));
            aVar3.a(27, new f(15272, 1));
            aVar3.c()[3] = 52;
            aVar3.c()[4] = 1;
            cVar.add(aVar3);
        }
        int[] iArr = {560, aU.iN_, aU.iP_, 560, aU.iW_, 9075};
        for (rs.gui.bpkg.a aVar4 : cVar) {
            for (int i = 0; i < aVar4.d().length; i++) {
                boolean z = false;
                for (int i2 : iArr) {
                    if (aVar4.d()[i].a() == i2) {
                        z = true;
                        break;
                    }
                }
                if (z && aVar4.d()[i].b() <= 1) {
                    aVar4.a(i, new f(aVar4.d()[i].a(), 25000000));
                }
            }
        }
    }
}
