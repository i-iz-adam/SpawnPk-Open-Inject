package rs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.a.F;

/* JADX INFO: loaded from: client-final.jar:rs/class_668.class */
public class class_668 {
    private static int[] a(ArrayList<Integer> arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = arrayList.get(i).intValue();
        }
        return iArr;
    }

    public static class_127[] a(class_127[] class_127VarArr) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(class_650.f() + "/configs/old_g.dat"));
            int i = -1;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(F.a);
                if (line.toLowerCase().contains("graphic ")) {
                    i = Integer.parseInt(strArrSplit[1]);
                } else if (i != -1) {
                    if (line.contains("data:")) {
                        ArrayList arrayList = new ArrayList();
                        for (String str : strArrSplit[1].split(",")) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                        }
                        int[] iArrA = a((ArrayList<Integer>) arrayList);
                        class_127VarArr[i].e = iArrA[0];
                        class_127VarArr[i].f = iArrA[1];
                        class_127VarArr[i].j = iArrA[2];
                        class_127VarArr[i].k = iArrA[3];
                        class_127VarArr[i].l = iArrA[4];
                        class_127VarArr[i].m = iArrA[5];
                        class_127VarArr[i].n = iArrA[6];
                        class_127VarArr[i].g = class_99.a[class_127VarArr[i].f];
                    } else if (line.contains("arr1:") || line.contains("arr2:")) {
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : strArrSplit[1].split(",")) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt(str2)));
                        }
                        if (line.contains("arr2:")) {
                            class_127VarArr[i].i = a((ArrayList<Integer>) arrayList2);
                        } else {
                            class_127VarArr[i].h = a((ArrayList<Integer>) arrayList2);
                        }
                    }
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return class_127VarArr;
    }
}
