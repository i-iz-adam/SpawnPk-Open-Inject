package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_216.class */
public class class_216 extends class_214 {
    private int c;
    private class_333[] d;
    private class_215[] e;
    private boolean f;

    public class_216(Client client) {
        super(client);
        this.d = new class_333[3];
        this.e = new class_215[]{new class_215("Blood vengeance I", User32.VK_OEM_BACKTAB, User32.VK_OEM_COPY), new class_215("Blood vengeance II", User32.VK_OEM_BACKTAB, 170), new class_215("Treasure hunter I", 363, 200), new class_215("Treasure hunter II", 430, 200), new class_215("Blood whip", g.p, 125), new class_215("Blood rune c'bow", 421, 92), new class_215("Blood dark bow", CGL.kCGLCESurfaceBackingSize, 92), new class_215("Diamonds are forever", g.p, 52), new class_215("Bloodthirsty I", 121, 201), new class_215("Bloodthirsty II", 60, 167), new class_215("Killjoy I", 121, 124), new class_215("Killjoy II", 60, 90), new class_215("Blood pool", 120, 52), new class_215("Blood staff", CGL.kCGLCESurfaceBackingSize, 163), new class_215("Blood ring", 421, 162), new class_215("Treasure buddy", 430, User32.VK_OEM_BACKTAB), new class_215("Emblem snatcher", 181, 90), new class_215("Augury", 223, 130), new class_215("Rigour", User32.WM_IME_STARTCOMPOSITION, 130), new class_215("Bloodlust", 17, 215), new class_215("Excavator", 180, 171), new class_215("War diamonds", 14, 126), new class_215("Unholy smite", 246, 92), new class_215("Eternal recoil", aU.hm_, 50), new class_215("Eternal blood cape", User32.WM_ENTERIDLE, 50), new class_215("Vampiric damage", 63, 26), new class_215("Vampiric defence", 425, 27)};
        this.c = 0;
    }

    @Override // rs.class_214
    public void a() {
        if (Client.cH != class_395.bG) {
            this.c = -1;
            return;
        }
        if (!this.f) {
            this.d[0] = new class_333("fountain/sprite 1");
            this.d[1] = new class_333("fountain/sprite 2");
            this.d[2] = new class_333("fountain/sprite 3");
            this.f = true;
        }
        if (this.c == -1) {
            this.c = 0;
            Client client = this.a;
            Client.ap = "::selectperk 0";
        }
        int i = Configuration.ai == class_151.a ? 0 : (Client.ai / 2) - 356;
        int i2 = Configuration.ai == class_151.a ? 0 : (Client.ah / 2) - 230;
        for (int i3 = 0; i3 < this.e.length; i3++) {
            class_333 class_333Var = this.d[this.e[i3].d()];
            int iIntValue = Integer.valueOf(this.e[i3].b()).intValue() + i;
            int iIntValue2 = Integer.valueOf(this.e[i3].c()).intValue() + i2;
            if (this.c == i3) {
                class_333Var = this.d[2];
            }
            class_333Var.c(iIntValue, iIntValue2);
        }
        for (int i4 = 0; i4 < this.e.length; i4++) {
            String strA = this.e[i4].a();
            int iB = this.e[i4].b() + i;
            int iC = this.e[i4].c() + i2;
            Client client2 = this.a;
            if (Client.hP >= iB) {
                Client client3 = this.a;
                if (Client.hP <= iB + 32) {
                    Client client4 = this.a;
                    if (Client.hQ >= iC) {
                        Client client5 = this.a;
                        if (Client.hQ <= iC + 32) {
                            Client client6 = this.a;
                            Client client7 = this.a;
                            int i5 = Client.hP;
                            Client client8 = this.a;
                            client6.b(i5, Client.hQ - 10, " @gre@" + strA + " ");
                        }
                    }
                }
            }
        }
    }

    @Override // rs.class_214
    public boolean b() {
        int i = Configuration.ai == class_151.a ? 0 : (Client.ai / 2) - 356;
        int i2 = Configuration.ai == class_151.a ? 0 : (Client.ah / 2) - 230;
        for (int i3 = 0; i3 < this.e.length; i3++) {
            int iB = this.e[i3].b() + i;
            int iC = this.e[i3].c() + i2;
            Client client = this.a;
            if (Client.hP >= iB) {
                Client client2 = this.a;
                if (Client.hP <= iB + 32) {
                    Client client3 = this.a;
                    if (Client.hQ >= iC) {
                        Client client4 = this.a;
                        if (Client.hQ <= iC + 32) {
                            this.c = i3;
                            Client client5 = this.a;
                            Client.ap = "::selectperk " + i3;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void a(int i) {
        this.e[i].a(1);
    }

    public void b(int i) {
        this.e[i].a(0);
    }

    public void c(int i) {
        this.c = i;
    }
}
