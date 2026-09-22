package rs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.a.F;

/* JADX INFO: loaded from: client-final.jar:rs/class_664.class */
public class class_664 {
    private static int[] a(ArrayList<Integer> arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = arrayList.get(i).intValue();
        }
        return iArr;
    }

    public static class_99[] a(class_99[] class_99VarArr) {
        class_99[] class_99VarArr2 = new class_99[class_99VarArr.length];
        for (int i = 0; i < class_99VarArr2.length; i++) {
            if (class_99VarArr[i] != null) {
                class_99VarArr2[i] = new class_99(class_99VarArr[i]);
            }
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(class_650.f() + "/configs/old_a.dat"));
            int i2 = -1;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(F.a);
                if (line.toLowerCase().contains("anim ")) {
                    i2 = Integer.parseInt(strArrSplit[1]);
                } else if (i2 != -1) {
                    if (line.contains("arr1:")) {
                        ArrayList arrayList = new ArrayList();
                        for (String str : strArrSplit[1].split(",")) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                        }
                        class_99VarArr2[i2].g = a((ArrayList<Integer>) arrayList);
                    } else if (line.contains("arr2:")) {
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : strArrSplit[1].split(",")) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt(str2)));
                        }
                        class_99VarArr2[i2].e = a((ArrayList<Integer>) arrayList2);
                    } else if (line.contains("other:")) {
                        class_99VarArr2[i2].o = Integer.parseInt(strArrSplit[1]);
                        class_99VarArr2[i2].p = Integer.parseInt(strArrSplit[2]);
                        class_99VarArr2[i2].k = Integer.parseInt(strArrSplit[3]);
                        class_99VarArr2[i2].d = Integer.parseInt(strArrSplit[4]);
                        i2 = -1;
                    }
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return class_99VarArr2;
    }
}
