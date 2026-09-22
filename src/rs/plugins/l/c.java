package rs.plugins.l;

import com.google.a.b.as;
import com.google.a.d.ch;
import com.google.inject.Provides;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import rs.Client;
import rs.ClientThread;
import rs.Configuration;
import rs.ItemComposition;
import rs.Npc;
import rs.class_102;
import rs.class_139;
import rs.class_184;
import rs.class_188;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.runelite.a.g;
import rs.runelite.events.MenuHover;
import rs.runelite.events.MenuOpened;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/l/c.class */
@e(a = "Menu Entry Swapper", b = "menuSwapper", c = "Change the default option that is displayed when hovering over objects", d = {b.c, "inventory", "items", "objects"}, f = false)
public class c extends rs.plugins.a {
    private static final String c = "shiftclick";
    private static final String d = "item_";
    private static final String e = "object_";
    private static final String f = "object_shift_";
    private static final String g = "npc_";
    private static final String h = "npc_shift_";
    private static final String i = "wornitem_";
    private static final String j = "wornitem_shift_";

    @Inject
    private class_139 k;

    @Inject
    private class_188 l;

    @Inject
    private b m;

    @Inject
    private Client n;
    private final a o = (i2, i3) -> {
        return g.e(i3) == i2;
    };
    private Map<Integer, Integer> p = new HashMap();
    private Map<Integer, Integer> q = new HashMap();
    private final a r = (i2, i3) -> {
        return Launcher.n().o().eJ[i3] == i2;
    };
    private Map<Integer, Integer> s = new HashMap();
    private Map<Integer, Integer> t = new HashMap();
    private final a u = (i2, i3) -> {
        return Launcher.n().o().eH[i3] == i2;
    };
    private Map<Integer, Integer> v = new HashMap();
    private Map<Integer, Integer> w = new HashMap();
    public static boolean b = false;
    private static final List<Integer> x = ch.a(20, Integer.valueOf(g.c), 225, Integer.valueOf(g.e), Integer.valueOf(g.f));
    private static final List<Integer> y = ch.a(74, 454, 539, 493, Integer.valueOf(g.B));

    @Provides
    b a(class_139 class_139Var) {
        return (b) class_139Var.a(b.class);
    }

    @Override // rs.s.a
    protected void a() {
        ClientThread.queue(() -> {
            b = true;
        });
    }

    @Override // rs.s.a
    protected void b() {
        ClientThread.queue(() -> {
            b = false;
        });
    }

    @Subscribe
    public void onMenuHover(MenuHover menuHover) {
        if (this.n.eV - 1 <= 0) {
            return;
        }
        int i2 = this.n.eV - 1;
        int i3 = this.n.localPlayer[i2];
        if (!g.a(i3)) {
            if (!g.c(i3) && g.d(i3)) {
                int i4 = this.n.eJ[i2];
                Integer numB = b(i(), i4);
                if (Configuration.aC && i() && numB.intValue() == -1) {
                    numB = Integer.valueOf(g.B);
                }
                if (numB == null || numB.intValue() == -1) {
                    return;
                }
                a(this.r, i4, numB.intValue());
                return;
            }
            return;
        }
        Npc npcF = g.f(i2);
        if (npcF != null) {
            Integer numA = a(i(), npcF.n());
            if (numA != null && numA.intValue() == 516) {
                for (int i5 = 0; i5 < this.n.eV; i5++) {
                    if (g.f(i5) != null && g.e(i5) != npcF.n() && this.n.localPlayer[i5] == i3) {
                        class_188.a(i2, i5);
                        return;
                    }
                }
            }
            if (numA == null || numA.intValue() == -1) {
                return;
            }
            a(this.o, npcF.n(), numA.intValue());
        }
    }

    @Subscribe
    public void onMenuOpened(MenuOpened menuOpened) {
        f();
        g();
    }

    private void f() {
        Npc npcF;
        class_102 class_102VarC;
        if (i() && this.m.c()) {
            for (int i2 = this.n.eV - 1; i2 >= 0; i2--) {
                if (this.n.localPlayer[i2] == 1025 && (npcF = g.f(i2)) != null && npcF.aG != null && (class_102VarC = class_102.c(npcF.n())) != null && class_102VarC.o != null) {
                    class_184 class_184VarA = this.l.a("Swap left click", this.l.c("Swap left click @yel@" + class_102VarC.o, () -> {
                    }));
                    class_184 class_184VarA2 = this.l.a("Swap shift click", this.l.c("Swap shift click @yel@" + class_102VarC.o, () -> {
                    }));
                    int iIntValue = a(false, npcF.n()).intValue();
                    int iIntValue2 = a(true, npcF.n()).intValue();
                    if (iIntValue != -1) {
                        class_184VarA.a("Reset", () -> {
                            c(false, npcF.n());
                        });
                    }
                    if (iIntValue2 != -1) {
                        class_184VarA2.a("Reset", () -> {
                            c(true, npcF.n());
                        });
                    }
                    class_184VarA.a("Walk here", () -> {
                        a(false, npcF.n(), 516);
                    });
                    class_184VarA2.a("Walk here", () -> {
                        a(true, npcF.n(), 516);
                    });
                    for (int i3 = 0; i3 < class_102VarC.p.length; i3++) {
                        String str = class_102VarC.p[i3];
                        int i4 = i3;
                        if (!as.c(str) && !str.equalsIgnoreCase("Attack") && iIntValue2 != x.get(i3).intValue() && iIntValue != x.get(i3).intValue() && i3 != 0) {
                            class_184VarA.a(str, () -> {
                                a(false, npcF.n(), x.get(i4).intValue());
                            });
                            class_184VarA2.a(str, () -> {
                                a(true, npcF.n(), x.get(i4).intValue());
                            });
                        }
                    }
                }
            }
        }
    }

    private void g() {
        int i2;
        ItemComposition itemCompositionLookupItem;
        if (i()) {
            if (this.m.a() || this.m.b()) {
                for (int i3 = this.n.eV - 1; i3 >= 0; i3--) {
                    if (this.n.localPlayer[i3] == 1125 && (itemCompositionLookupItem = ItemComposition.lookupItem((i2 = this.n.eJ[i3]))) != null && itemCompositionLookupItem.itemName != null) {
                        int iIntValue = b(false, i2).intValue();
                        int iIntValue2 = b(true, i2).intValue();
                        class_184 class_184VarA = this.m.a() ? this.l.a(itemCompositionLookupItem.x + " left click", this.l.c("Swap left click @lre@" + itemCompositionLookupItem.x, () -> {
                        })) : null;
                        class_184 class_184VarA2 = this.m.b() ? this.l.a(itemCompositionLookupItem.x + " shift click", this.l.c("Swap shift click @lre@" + itemCompositionLookupItem.x, () -> {
                        })) : null;
                        if (iIntValue != -1 && this.m.a()) {
                            class_184VarA.a("Reset", () -> {
                                d(false, i2);
                            });
                        }
                        if (iIntValue2 != -1 && this.m.b()) {
                            class_184VarA2.a("Reset", () -> {
                                d(true, i2);
                            });
                        }
                        for (int i4 = 0; i4 < itemCompositionLookupItem.inventoryActions.length; i4++) {
                            String str = itemCompositionLookupItem.inventoryActions[i4];
                            int i5 = i4;
                            if (iIntValue2 != y.get(i4).intValue() && iIntValue != y.get(i4).intValue() && i4 != 0 && !as.c(str)) {
                                if (this.m.a() && y.get(i4).intValue() != 454) {
                                    class_184VarA.a(str, () -> {
                                        b(false, i2, y.get(i5).intValue());
                                    });
                                }
                                if (this.m.b()) {
                                    class_184VarA2.a(str, () -> {
                                        b(true, i2, y.get(i5).intValue());
                                    });
                                }
                            }
                        }
                        if (this.m.a() && iIntValue != 447) {
                            class_184VarA.a("Use", () -> {
                                b(false, i2, 447);
                            });
                        }
                        if (this.m.b() && iIntValue2 != 447) {
                            class_184VarA2.a("Use", () -> {
                                b(true, i2, 447);
                            });
                        }
                    }
                }
            }
        }
    }

    private void a(a aVar, int i2, int i3) {
        int i4 = this.n.eV - 1;
        int i5 = -1;
        for (int i6 = 0; i6 < this.n.eV; i6++) {
            int i7 = this.n.localPlayer[i6];
            if ((i3 == 516 || aVar.isMatchingEntity(i2, i6)) && i7 == i3) {
                i5 = i6;
                break;
            }
        }
        if (i5 == -1 || i4 == -1) {
            return;
        }
        class_188.a(i5, i4);
    }

    private void h() {
    }

    private boolean i() {
        return Client.ag;
    }

    private Integer a(boolean z, int i2) {
        Map<Integer, Integer> map = z ? this.q : this.p;
        if (map.containsKey(Integer.valueOf(i2))) {
            return map.get(Integer.valueOf(i2));
        }
        String strA = this.k.a(b.a, (z ? h : g) + i2);
        if (strA == null || strA.isEmpty()) {
            return -1;
        }
        int i3 = Integer.parseInt(strA);
        map.put(Integer.valueOf(i2), Integer.valueOf(i3));
        return Integer.valueOf(i3);
    }

    private Integer b(boolean z, int i2) {
        Map<Integer, Integer> map = z ? this.t : this.s;
        if (map.containsKey(Integer.valueOf(i2))) {
            return map.get(Integer.valueOf(i2));
        }
        String strA = this.k.a(z ? c : b.a, "item_" + i2);
        if (strA == null || strA.isEmpty()) {
            return -1;
        }
        return Integer.valueOf(Integer.parseInt(strA));
    }

    private void a(boolean z, int i2, int i3) {
        if (i2 == -1) {
            return;
        }
        (z ? this.q : this.p).put(Integer.valueOf(i2), Integer.valueOf(i3));
        this.k.a(b.a, (z ? h : g) + i2, Integer.valueOf(i3));
    }

    private void c(boolean z, int i2) {
        if (i2 == -1) {
            return;
        }
        (z ? this.q : this.p).remove(Integer.valueOf(i2));
        this.k.b(b.a, (z ? h : g) + i2);
    }

    private void b(boolean z, int i2, int i3) {
        (z ? this.t : this.s).put(Integer.valueOf(i2), Integer.valueOf(i3));
        this.k.a(z ? c : b.a, "item_" + i2, Integer.valueOf(i3));
    }

    private void d(boolean z, int i2) {
        (z ? this.t : this.s).remove(Integer.valueOf(i2));
        this.k.b(z ? c : b.a, "item_" + i2);
    }
}
