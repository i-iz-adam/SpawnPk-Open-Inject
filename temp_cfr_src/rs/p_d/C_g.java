/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  p_gnu.p_trove.p_f.p_b.C_cc
 */
package rs.p_d;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.p_d.C_k;
import rs.p_v.C_a;

public class C_g {
    private static final String b = C_a.f() + "configs/old_i.dat";
    private static final Logger c = Logger.getLogger(C_g.class.getName());
    public static final List<String> a = new ArrayList<String>();

    public static void a() {
        if (!rs.p_f.C_a.d.booleanValue()) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(b)));
            String string = bufferedReader.readLine();
            while (string != null) {
                a.add(string);
                string = bufferedReader.readLine();
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static C_cc<C_k> b() {
        C_cc c_cc = new C_cc();
        int n = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(b)));
            String string = bufferedReader.readLine();
            C_k c_k = null;
            int n2 = 0;
            while (string != null) {
                ++n;
                if (string.toLowerCase().contains("[item")) {
                    n2 = Integer.valueOf(string.toLowerCase().split("item ")[1].replace("]", ""));
                    c_cc.a(n2, (Object)new C_k(C_k.a(n2, false, false)));
                    c_k = (C_k)c_cc.b(n2);
                } else if (string.contains("=")) {
                    int n3;
                    String string2;
                    Object object;
                    if (c_k == null) {
                        c.info("Error! Detected mismatch at line: " + n);
                        throw new IndexOutOfBoundsException();
                    }
                    string = string.replace(" = ", "=");
                    string = string.replace("= ", "=");
                    String string3 = string.toLowerCase().split("=")[0];
                    String string4 = string.split("=")[1];
                    if (string3.toLowerCase().contains("name")) {
                        c_k.w = string4;
                    } else if (string3.toLowerCase().contains("modelid") || string3.toLowerCase().contains("groundmodel")) {
                        c_k.A = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("clone")) {
                        c_k = new C_k((C_k)c_cc.b(Integer.valueOf(string4).intValue()));
                        c_k.i = n2;
                    } else if (string3.toLowerCase().contains("description")) {
                        c_k.E = string4.getBytes();
                    } else if (string3.toLowerCase().contains("zoom")) {
                        c_k.G = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("rotation1") || string3.toLowerCase().contains("rotationx")) {
                        c_k.M = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("rotation2") || string3.toLowerCase().contains("rotationy")) {
                        c_k.Z = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("offset1") || string3.toLowerCase().contains("offsetx")) {
                        c_k.v = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("offset2") || string3.toLowerCase().contains("offsety")) {
                        c_k.W = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("value")) {
                        c_k.f = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("anint204") || string3.toLowerCase().contains("zan2d")) {
                        c_k.ae = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("anint167")) {
                        c_k.t = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("anint191")) {
                        c_k.N = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("anint192")) {
                        c_k.O = Integer.valueOf(string4);
                    } else if (string3.equalsIgnoreCase("texture")) {
                        c_k.R = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("textureinvanim")) {
                        c_k.U = Boolean.valueOf(string4);
                    } else if (string3.toLowerCase().contains("texturecolors") || string3.toLowerCase().contains("textureids")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i = 0; i < string2.split(",").length; ++i) {
                            if (string2.split(",")[i] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i]));
                        }
                        int[] nArray = new int[object.size()];
                        for (n3 = 0; n3 < object.size(); ++n3) {
                            nArray[n3] = (Integer)object.get(n3);
                        }
                        if (string3.toLowerCase().contains("textureids")) {
                            c_k.T = nArray;
                        } else {
                            c_k.S = nArray;
                        }
                    } else if (string3.toLowerCase().contains("anint165") || string3.toLowerCase().contains("male") && !string3.toLowerCase().contains("female")) {
                        if (string3.toLowerCase().contains("maleequip2") || string3.toLowerCase().contains("malemodel2")) {
                            c_k.K = Integer.valueOf(string4);
                        } else {
                            c_k.r = Integer.valueOf(string4);
                        }
                    } else if (string3.toLowerCase().contains("anint200") || string3.toLowerCase().contains("female")) {
                        if (string3.toLowerCase().contains("femaleequip2") || string3.toLowerCase().contains("femalemodel2")) {
                            c_k.q = Integer.valueOf(string4);
                        } else {
                            c_k.aa = Integer.valueOf(string4);
                        }
                    } else if ((string3.toLowerCase().contains("actions") || string3.toLowerCase().contains("options")) && !string3.toLowerCase().contains("ground")) {
                        object = new String[5];
                        string2 = string4;
                        for (int i = 0; i < string2.split(",").length && i < ((String[])object).length; ++i) {
                            if (string2.split(",")[i] == null || string2.split(",")[i].equalsIgnoreCase("null")) continue;
                            object[i] = string2.split(",")[i];
                        }
                        c_k.L = object;
                    } else if (string3.toLowerCase().contains("ground") || string3.toLowerCase().contains("floor")) {
                        object = new String[5];
                        string2 = string4;
                        for (int i = 0; i < string2.split(",").length && i < ((String[])object).length; ++i) {
                            if (string2.split(",")[i] == null || string2.split(",")[i].equalsIgnoreCase("null")) continue;
                            object[i] = string2.split(",")[i];
                        }
                        c_k.u = object;
                    } else if (string3.toLowerCase().contains("original")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i = 0; i < string2.split(",").length; ++i) {
                            if (string2.split(",")[i] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i]));
                        }
                        int[] nArray = new int[object.size()];
                        for (n3 = 0; n3 < object.size(); ++n3) {
                            nArray[n3] = (Integer)object.get(n3);
                        }
                        c_k.h = nArray;
                    } else if (string3.toLowerCase().contains("modified")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i = 0; i < string2.split(",").length; ++i) {
                            if (string2.split(",")[i] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i]));
                        }
                        int[] nArray = new int[object.size()];
                        for (n3 = 0; n3 < object.size(); ++n3) {
                            nArray[n3] = (Integer)object.get(n3);
                        }
                        c_k.g = nArray;
                    } else if (string3.toLowerCase().contains("stacks") || string3.toLowerCase().contains("stackids")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i = 0; i < string2.split(",").length; ++i) {
                            if (string2.split(",")[i] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i]));
                        }
                        int[] nArray = new int[10];
                        for (n3 = 0; n3 < object.size(); ++n3) {
                            nArray[n3] = (Integer)object.get(n3);
                        }
                        c_k.P = nArray;
                    } else if (string3.toLowerCase().contains("stackamounts")) {
                        object = new ArrayList();
                        string2 = string4;
                        for (int i = 0; i < string2.split(",").length; ++i) {
                            if (string2.split(",")[i] == null) continue;
                            object.add(Integer.valueOf(string2.split(",")[i]));
                        }
                        int[] nArray = new int[10];
                        for (n3 = 0; n3 < object.size(); ++n3) {
                            nArray[n3] = (Integer)object.get(n3);
                        }
                        c_k.ab = nArray;
                    } else if (string3.toLowerCase().contains("light")) {
                        c_k.X = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("shadow")) {
                        c_k.I = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("abyte205") || string3.toLowerCase().contains("mequipoffy")) {
                        c_k.ag = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("mequipoffx")) {
                        c_k.af = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("fequipoffx")) {
                        c_k.ai = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("mequipoffz")) {
                        c_k.ah = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("fequipoffz")) {
                        c_k.aj = (byte)Integer.valueOf(string4).intValue();
                    } else if (string3.toLowerCase().contains("abyte154") || string3.toLowerCase().contains("fequipoffy")) {
                        c_k.ak = (byte)Integer.valueOf(string4).intValue();
                    } else if ((string3.toLowerCase().contains("certid") || string3.toLowerCase().contains("note")) && !string3.toLowerCase().contains("template")) {
                        c_k.F = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("template")) {
                        c_k.p = Integer.valueOf(string4);
                    } else if (string3.toLowerCase().contains("stackable")) {
                        c_k.C = Boolean.valueOf(string4);
                        c_k.D = Boolean.valueOf(string4);
                    }
                }
                string = bufferedReader.readLine();
                c_cc.a(n2, c_k);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(n);
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            System.out.println(n);
            iOException.printStackTrace();
        }
        return c_cc;
    }
}

