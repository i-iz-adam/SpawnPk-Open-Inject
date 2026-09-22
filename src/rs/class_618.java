package rs;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.msgpack.jackson.dataformat.MessagePackMapper;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;

/* JADX INFO: loaded from: client-final.jar:rs/class_618.class */
public class class_618 {
    protected String a;
    protected String b;

    public class_618(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public Map<Integer, Map<String, Object>> a(boolean z) throws IOException {
        if (!z) {
            LoaderOptions loaderOptions = new LoaderOptions();
            loaderOptions.setMaxAliasesForCollections(200);
            return (Map) new Yaml(loaderOptions).load(Files.newInputStream(new File(this.a).toPath(), new OpenOption[0]));
        }
        InputStream inputStreamNewInputStream = Files.newInputStream(new File(this.b).toPath(), new OpenOption[0]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStreamNewInputStream.read();
            if (i == -1) {
                return (Map) new MessagePackMapper().readValue(byteArrayOutputStream.toByteArray(), new class_626());
            }
            byteArrayOutputStream.write(i);
        }
    }

    public void a(Map<Integer, Map<String, Object>> map) {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.AUTO);
        Yaml yaml = new Yaml(dumperOptions);
        try {
            FileWriter fileWriter = new FileWriter(this.a);
            try {
                yaml.dump(map, fileWriter);
                fileWriter.close();
            } catch (Throwable th) {
                try {
                    fileWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void a() throws IOException {
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setMaxAliasesForCollections(200);
        b((Map<Integer, Map<String, Object>>) new Yaml(loaderOptions).load(Files.newInputStream(new File(this.a).toPath(), new OpenOption[0])));
    }

    public void b(Map<Integer, Map<String, Object>> map) throws IOException {
        if (this instanceof class_629) {
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                HashMap map2 = new HashMap();
                for (String str : map.get(Integer.valueOf(iIntValue)).keySet()) {
                    if (str.equalsIgnoreCase("textures")) {
                        Map map3 = (Map) map.get(Integer.valueOf(iIntValue)).get(str);
                        int[][][] iArr = new int[map3.size()][][];
                        int i = 0;
                        Iterator it2 = map3.keySet().iterator();
                        while (it2.hasNext()) {
                            int iIntValue2 = ((Integer) it2.next()).intValue();
                            List list = (List) map3.get(Integer.valueOf(iIntValue2));
                            iArr[i] = new int[2][];
                            iArr[i][0] = a(list);
                            iArr[i][1] = new int[list.size()];
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                iArr[i][1][i2] = iIntValue2;
                            }
                            i++;
                        }
                        map2.put(str, new AbstractMap.SimpleEntry("retextures", iArr));
                    }
                }
                for (String str2 : map2.keySet()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) map2.get(str2);
                    map.get(Integer.valueOf(iIntValue)).remove(str2);
                    map.get(Integer.valueOf(iIntValue)).put((String) simpleEntry.getKey(), simpleEntry.getValue());
                }
            }
        }
        byte[] bArrWriteValueAsBytes = new MessagePackMapper().writeValueAsBytes(map);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.b));
        fileOutputStream.write(bArrWriteValueAsBytes);
        fileOutputStream.close();
    }

    protected int[] a(Object obj) {
        if (obj == null || ((List) obj).size() == 0) {
            return null;
        }
        return ((List) obj).stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray();
    }

    public String b() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public String c() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }
}
