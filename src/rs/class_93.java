package rs;

import java.awt.Component;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/* JADX INFO: loaded from: client-final.jar:rs/class_93.class */
public class class_93 {
    public static final double a = -1.0d;
    public static final String b = Configuration.m + "versions.txt";
    public static final String c = class_650.f() + "versions.dat";
    private String d;
    private String e;

    public class_93(String str) {
        this.e = c;
        this.d = str;
    }

    public class_93(String str, String str2) {
        this.e = str;
        this.d = str2;
    }

    public boolean a() {
        try {
            File file = new File(this.e);
            ArrayList arrayList = new ArrayList();
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!a(line)) {
                        arrayList.add(line);
                    }
                }
                bufferedReader.close();
            } else {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bufferedWriter.write((String) it.next());
                bufferedWriter.newLine();
            }
            bufferedWriter.write(this.d + " = " + b());
            bufferedWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public double b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(b).openStream()));
            Double dValueOf = Double.valueOf(a(bufferedReader));
            bufferedReader.close();
            return dValueOf.doubleValue();
        } catch (IOException e) {
            JLabel jLabel = new JLabel();
            Font font = jLabel.getFont();
            StringBuffer stringBuffer = new StringBuffer("font-family:" + font.getFamily() + ";");
            stringBuffer.append("font-weight:" + (font.isBold() ? "bold" : "normal") + ";");
            stringBuffer.append("font-size:" + font.getSize() + "pt;");
            JEditorPane jEditorPane = new JEditorPane("text/html", "<html><body style=\"" + stringBuffer + "\">There was an issue connecting to the server!<br>Here are some possible issues and solutions: <br><br>1. (MOST LIKELY) You may not be connected to the internet! Be sure to verify that you are in fact<br>connected to the internet, and that you're not having any network issues.<br><br>2. SpawnPK may be offline or having issues, for more information you can go <a href=\"http://spawnpk.net/forums/\">here</a>.</body></html>");
            jEditorPane.addHyperlinkListener(new class_94(this));
            jEditorPane.setEditable(false);
            jEditorPane.setBackground(jLabel.getBackground());
            JOptionPane.showMessageDialog((Component) null, jEditorPane);
            e.printStackTrace();
            return -1.0d;
        }
    }

    public double c() {
        try {
            File file = new File(this.e);
            if (!file.exists()) {
                return -1.0d;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            double dA = a(bufferedReader);
            bufferedReader.close();
            return dA;
        } catch (IOException e) {
            e.printStackTrace();
            return -1.0d;
        }
    }

    public String d() {
        return this.d;
    }

    private double a(BufferedReader bufferedReader) {
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return -1.0d;
                }
                String[] strArrSplit = line.replace("= ", "=").replace(" =", "=").split("=");
                try {
                    if (strArrSplit[0].equalsIgnoreCase(this.d)) {
                        try {
                            return Double.parseDouble(strArrSplit[1]);
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                return -1.0d;
            }
        }
    }

    private boolean a(String str) {
        try {
            return str.replace("= ", "=").replace(" =", "=").split("=")[0].equalsIgnoreCase(this.d);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
