package rs.plugins.bpkg;

import com.google.a.d.ch;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Configuration;
import rs.class_132;
import rs.class_139;
import rs.class_23;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.runelite.events.PluginChanged;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/q.class */
@Singleton
public class q extends rs.ui.m {
    private static final String c = "pinnedPlugins";
    private final class_139 e;
    private final rs.plugins.g f;
    private final Provider<a> g;
    private final List<n> k;
    private final rs.ui.k l;
    private final rs.ui.components.k m;
    private final JScrollPane n;
    private final h o;
    private List<o> p;
    private static final Logger a = LoggerFactory.getLogger((Class<?>) q.class);
    private static final String b = Configuration.A;
    private static final ch<String> d = ch.a("Combat", "Chat", "Item", "Minigame", "Notification", "Plugin Hub", "Skilling", "XP");

    @Inject
    public q(class_139 class_139Var, rs.plugins.g gVar, EventBus eventBus, Provider<a> provider) {
        super(false);
        this.k = new ArrayList();
        this.e = class_139Var;
        this.f = gVar;
        this.g = provider;
        this.l = new r(this, this, eventBus);
        this.m = new rs.ui.components.k();
        this.m.a(rs.ui.components.k.a.a);
        this.m.setPreferredSize(new Dimension(330, 30));
        this.m.setBackground(rs.gui.d.c);
        this.m.a(rs.gui.d.h);
        this.m.b().addDocumentListener(new s(this));
        ch<String> chVar = d;
        DefaultListModel<String> defaultListModelC = this.m.c();
        Objects.requireNonNull(defaultListModelC);
        chVar.forEach((v1) -> {
            r1.addElement(v1);
        });
        setLayout(new BorderLayout());
        setBackground(rs.gui.d.d);
        JPanel jPanel = new JPanel();
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jPanel.setLayout(new BorderLayout(0, 6));
        jPanel.add(this.m, "Center");
        add(jPanel, "North");
        this.o = new h();
        this.o.setBorder(new EmptyBorder(8, 10, 10, 10));
        this.o.setLayout(new rs.ui.j(0, 1, 0, 5));
        this.o.setAlignmentX(0.0f);
        h hVar = new h();
        hVar.setLayout(new BorderLayout());
        hVar.add(this.o, "North");
        this.n = new JScrollPane(hVar);
        this.n.setHorizontalScrollBarPolicy(31);
        add(this.n, "Center");
        a();
    }

    void a() {
        List<String> listG = g();
        this.p = (List) Stream.concat(this.k.stream(), this.f.c().stream().filter(aVar -> {
            return !((rs.plugins.e) aVar.getClass().getAnnotation(rs.plugins.e.class)).g();
        }).map(aVar2 -> {
            rs.plugins.e eVar = (rs.plugins.e) aVar2.getClass().getAnnotation(rs.plugins.e.class);
            class_132 class_132VarA = this.f.a(aVar2);
            return new n(eVar.a(), eVar.c(), eVar.d(), aVar2, class_132VarA, class_132VarA == null ? null : this.e.a(class_132VarA), (List) this.f.g(aVar2).stream().map((v0) -> {
                return v0.e();
            }).collect(Collectors.toList()));
        })).map(nVar -> {
            o oVar = new o(this, nVar);
            oVar.a(listG.contains(nVar.d()));
            return oVar;
        }).sorted(Comparator.comparing(oVar -> {
            return oVar.c().d();
        })).collect(Collectors.toList());
        this.o.removeAll();
        b();
    }

    void a(n... nVarArr) {
        Collections.addAll(this.k, nVarArr);
    }

    void b() {
        this.p.forEach(oVar -> {
            rs.s.a aVarJ = oVar.c().j();
            if (aVarJ != null) {
                oVar.b(this.f.d(aVarJ));
            }
        });
        int value = this.n.getVerticalScrollBar().getValue();
        f();
        this.m.requestFocusInWindow();
        validate();
        this.n.getVerticalScrollBar().setValue(value);
    }

    void a(String str) {
        this.m.a(str);
        f();
        this.l.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String strA = this.m.a();
        List<o> list = this.p;
        h hVar = this.o;
        Objects.requireNonNull(hVar);
        list.forEach((v1) -> {
            r1.remove(v1);
        });
        List listA = t.a((Collection) this.p.stream().filter(oVar -> {
            return !((rs.plugins.e) oVar.c().j().getClass().getAnnotation(rs.plugins.e.class)).k();
        }).collect(Collectors.toList()), strA);
        h hVar2 = this.o;
        Objects.requireNonNull(hVar2);
        listA.forEach((v1) -> {
            r1.add(v1);
        });
        revalidate();
    }

    void b(String str) {
        for (o oVar : this.p) {
            if (oVar.c().d().equals(str)) {
                a(oVar.c());
                return;
            }
        }
    }

    public void a(rs.s.a aVar) {
        for (o oVar : this.p) {
            if (oVar.c().j() == aVar) {
                a(oVar.c());
                return;
            }
        }
    }

    public a b(rs.s.a aVar) {
        for (o oVar : this.p) {
            if (oVar.c().j() == aVar) {
                a aVar2 = this.g.get();
                aVar2.a(oVar.c());
                return aVar2;
            }
        }
        return null;
    }

    void a(n nVar) {
        a aVar = this.g.get();
        aVar.a(nVar);
        this.l.c(this);
        this.l.c(aVar);
    }

    void c(rs.s.a aVar) {
        this.f.a(aVar, true);
        try {
            this.f.b(aVar);
        } catch (rs.plugins.f e) {
            a.warn("Error when starting plugin {}", aVar.getClass().getSimpleName(), e);
        }
    }

    void d(rs.s.a aVar) {
        this.f.a(aVar, false);
        try {
            this.f.c(aVar);
        } catch (rs.plugins.f e) {
            a.warn("Error when stopping plugin {}", aVar.getClass().getSimpleName(), e);
        }
    }

    private List<String> g() {
        String strA = this.e.a(b, c);
        return strA == null ? Collections.emptyList() : class_23.a(strA);
    }

    void c() {
        this.e.b(b, c, (String) this.p.stream().filter((v0) -> {
            return v0.b();
        }).map(oVar -> {
            return oVar.c().d();
        }).collect(Collectors.joining(",")));
    }

    @Subscribe
    public void onPluginChanged(PluginChanged pluginChanged) {
        SwingUtilities.invokeLater(this::b);
    }

    @Override // rs.ui.m
    public Dimension getPreferredSize() {
        return new Dimension(367, super.getPreferredSize().height);
    }

    @Override // rs.ui.m
    public void J_() {
        super.J_();
        if (this.m.getParent() != null) {
            this.m.requestFocusInWindow();
        }
    }

    public rs.ui.k e() {
        return this.l;
    }
}
