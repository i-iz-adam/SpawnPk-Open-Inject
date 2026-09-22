package rs.gui.bpkg.apkg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/v.class */
class v implements ActionListener {
    final /* synthetic */ rs.gui.bpkg.h a;

    v(rs.gui.bpkg.h hVar) {
        this.a = hVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String strE = this.a.f().e();
        if (strE == null) {
            return;
        }
        JFrame jFrame = new JFrame("Delete " + strE + "?");
        JButton jButton = new JButton("Yes, delete \"" + strE + "\"");
        JButton jButton2 = new JButton("No, Nevermind.");
        jFrame.setLocationRelativeTo(Launcher.n().i().getContentPane());
        JPanel jPanel = new JPanel();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(400, 90);
        jFrame.setLocationRelativeTo(Launcher.n().i().getContentPane());
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jFrame.add(jPanel);
        jButton.addActionListener(new w(this, strE, jFrame));
        jButton2.addActionListener(new x(this, jFrame));
        jFrame.setVisible(true);
    }
}
