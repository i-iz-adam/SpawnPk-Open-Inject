package rs.gui.bpkg.apkg;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/r.class */
class r implements ActionListener {
    final /* synthetic */ rs.gui.bpkg.h a;

    r(rs.gui.bpkg.h hVar) {
        this.a = hVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        JFrame jFrame = new JFrame("Re-name Your Folder");
        JTextField jTextField = new JTextField(10);
        JButton jButton = new JButton("Rename");
        JPanel jPanel = new JPanel();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(300, 90);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation((screenSize.width / 2) - (jFrame.getSize().width / 2), (screenSize.height / 2) - (jFrame.getSize().height / 2));
        jPanel.add(jTextField);
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jPanel.getRootPane().setDefaultButton(jButton);
        jButton.addActionListener(new s(this, jTextField, jFrame));
        jFrame.setVisible(true);
    }
}
