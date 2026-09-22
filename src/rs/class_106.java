package rs;

import gnu.trove.f.b.cc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: client-final.jar:rs/class_106.class */
public class class_106 {
    private static final String b = class_650.f() + "configs/old_i.dat";
    private static final Logger c = Logger.getLogger(class_106.class.getName());
    public static final List<String> a = new ArrayList();

    public static void a() {
        if (Configuration.d.booleanValue()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(b)));
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    a.add(line);
                }
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static cc<ItemComposition> b() {
        cc<ItemComposition> ccVar = new cc<>();
        int i = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(b)));
            String line = bufferedReader.readLine();
            ItemComposition itemComposition = null;
            int iIntValue = 0;
            while (line != null) {
                i++;
                if (line.toLowerCase().contains("[item")) {
                    iIntValue = Integer.valueOf(line.toLowerCase().split("item ")[1].replace("]", "")).intValue();
                    ccVar.a(iIntValue, new ItemComposition(ItemComposition.a(iIntValue, false, false)));
                    itemComposition = ccVar.b(iIntValue);
                } else if (!line.contains("=")) {
                    continue;
                } else {
                    if (itemComposition == null) {
                        c.info("Error! Detected mismatch at line: " + i);
                        throw new IndexOutOfBoundsException();
                    }
                    String strReplace = line.replace(" = ", "=").replace("= ", "=");
                    String str = strReplace.toLowerCase().split("=")[0];
                    String str2 = strReplace.split("=")[1];
                    if (str.toLowerCase().contains("name")) {
                        itemComposition.itemName = str2;
                    } else if (str.toLowerCase().contains("modelid") || str.toLowerCase().contains("groundmodel")) {
                        itemComposition.A = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("clone")) {
                        itemComposition = new ItemComposition(ccVar.b(Integer.valueOf(str2).intValue()));
                        itemComposition.itemId = iIntValue;
                    } else if (str.toLowerCase().contains("description")) {
                        itemComposition.description = str2.getBytes();
                    } else if (str.toLowerCase().contains("zoom")) {
                        itemComposition.G = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("rotation1") || str.toLowerCase().contains("rotationx")) {
                        itemComposition.M = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("rotation2") || str.toLowerCase().contains("rotationy")) {
                        itemComposition.Z = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("offset1") || str.toLowerCase().contains("offsetx")) {
                        itemComposition.v = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("offset2") || str.toLowerCase().contains("offsety")) {
                        itemComposition.W = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("value")) {
                        itemComposition.f = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("anint204") || str.toLowerCase().contains("zan2d")) {
                        itemComposition.ae = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("anint167")) {
                        itemComposition.t = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("anint191")) {
                        itemComposition.N = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("anint192")) {
                        itemComposition.O = Integer.valueOf(str2).intValue();
                    } else if (str.equalsIgnoreCase("texture")) {
                        itemComposition.R = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("textureinvanim")) {
                        itemComposition.U = Boolean.valueOf(str2).booleanValue();
                    } else if (str.toLowerCase().contains("texturecolors") || str.toLowerCase().contains("textureids")) {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < str2.split(",").length; i2++) {
                            if (str2.split(",")[i2] != null) {
                                arrayList.add(Integer.valueOf(str2.split(",")[i2]));
                            }
                        }
                        int[] iArr = new int[arrayList.size()];
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
                        }
                        if (str.toLowerCase().contains("textureids")) {
                            itemComposition.T = iArr;
                        } else {
                            itemComposition.S = iArr;
                        }
                    } else if (str.toLowerCase().contains("anint165") || (str.toLowerCase().contains("male") && !str.toLowerCase().contains("female"))) {
                        if (str.toLowerCase().contains("maleequip2") || str.toLowerCase().contains("malemodel2")) {
                            itemComposition.K = Integer.valueOf(str2).intValue();
                        } else {
                            itemComposition.r = Integer.valueOf(str2).intValue();
                        }
                    } else if (str.toLowerCase().contains("anint200") || str.toLowerCase().contains("female")) {
                        if (str.toLowerCase().contains("femaleequip2") || str.toLowerCase().contains("femalemodel2")) {
                            itemComposition.q = Integer.valueOf(str2).intValue();
                        } else {
                            itemComposition.aa = Integer.valueOf(str2).intValue();
                        }
                    } else if ((str.toLowerCase().contains("actions") || str.toLowerCase().contains("options")) && !str.toLowerCase().contains("ground")) {
                        String[] strArr = new String[5];
                        for (int i4 = 0; i4 < str2.split(",").length && i4 < strArr.length; i4++) {
                            if (str2.split(",")[i4] != null && !str2.split(",")[i4].equalsIgnoreCase("null")) {
                                strArr[i4] = str2.split(",")[i4];
                            }
                        }
                        itemComposition.inventoryActions = strArr;
                    } else if (str.toLowerCase().contains("ground") || str.toLowerCase().contains("floor")) {
                        String[] strArr2 = new String[5];
                        for (int i5 = 0; i5 < str2.split(",").length && i5 < strArr2.length; i5++) {
                            if (str2.split(",")[i5] != null && !str2.split(",")[i5].equalsIgnoreCase("null")) {
                                strArr2[i5] = str2.split(",")[i5];
                            }
                        }
                        itemComposition.u = strArr2;
                    } else if (str.toLowerCase().contains("original")) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i6 = 0; i6 < str2.split(",").length; i6++) {
                            if (str2.split(",")[i6] != null) {
                                arrayList2.add(Integer.valueOf(str2.split(",")[i6]));
                            }
                        }
                        int[] iArr2 = new int[arrayList2.size()];
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            iArr2[i7] = ((Integer) arrayList2.get(i7)).intValue();
                        }
                        itemComposition.h = iArr2;
                    } else if (str.toLowerCase().contains("modified")) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < str2.split(",").length; i8++) {
                            if (str2.split(",")[i8] != null) {
                                arrayList3.add(Integer.valueOf(str2.split(",")[i8]));
                            }
                        }
                        int[] iArr3 = new int[arrayList3.size()];
                        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                            iArr3[i9] = ((Integer) arrayList3.get(i9)).intValue();
                        }
                        itemComposition.g = iArr3;
                    } else if (str.toLowerCase().contains("stacks") || str.toLowerCase().contains("stackids")) {
                        ArrayList arrayList4 = new ArrayList();
                        for (int i10 = 0; i10 < str2.split(",").length; i10++) {
                            if (str2.split(",")[i10] != null) {
                                arrayList4.add(Integer.valueOf(str2.split(",")[i10]));
                            }
                        }
                        int[] iArr4 = new int[10];
                        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                            iArr4[i11] = ((Integer) arrayList4.get(i11)).intValue();
                        }
                        itemComposition.P = iArr4;
                    } else if (str.toLowerCase().contains("stackamounts")) {
                        ArrayList arrayList5 = new ArrayList();
                        for (int i12 = 0; i12 < str2.split(",").length; i12++) {
                            if (str2.split(",")[i12] != null) {
                                arrayList5.add(Integer.valueOf(str2.split(",")[i12]));
                            }
                        }
                        int[] iArr5 = new int[10];
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            iArr5[i13] = ((Integer) arrayList5.get(i13)).intValue();
                        }
                        itemComposition.ab = iArr5;
                    } else if (str.toLowerCase().contains("light")) {
                        itemComposition.X = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("shadow")) {
                        itemComposition.I = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("abyte205") || str.toLowerCase().contains("mequipoffy")) {
                        itemComposition.ag = (byte) Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("mequipoffx")) {
                        itemComposition.af = (byte) Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("fequipoffx")) {
                        itemComposition.ai = (byte) Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("mequipoffz")) {
                        itemComposition.ah = (byte) Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("fequipoffz")) {
                        itemComposition.aj = (byte) Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("abyte154") || str.toLowerCase().contains("fequipoffy")) {
                        itemComposition.ak = (byte) Integer.valueOf(str2).intValue();
                    } else if ((str.toLowerCase().contains("certid") || str.toLowerCase().contains("note")) && !str.toLowerCase().contains("template")) {
                        itemComposition.F = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("template")) {
                        itemComposition.p = Integer.valueOf(str2).intValue();
                    } else if (str.toLowerCase().contains("stackable")) {
                        itemComposition.C = Boolean.valueOf(str2).booleanValue();
                        itemComposition.D = Boolean.valueOf(str2).booleanValue();
                    }
                }
                line = bufferedReader.readLine();
                ccVar.a(iIntValue, itemComposition);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(0);
            e.printStackTrace();
        } catch (IOException e2) {
            System.out.println(0);
            e2.printStackTrace();
        }
        return ccVar;
    }
}
