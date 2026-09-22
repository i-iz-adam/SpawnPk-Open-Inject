package rs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_133.class */
class class_133 {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_133.class);
    private final File b;
    private final ConcurrentHashMap<String, String> c;
    private Map<String, String> d = new HashMap();

    class_133(File file) {
        this.b = file;
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                try {
                    properties.load(inputStreamReader);
                    inputStreamReader.close();
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException e) {
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        this.c = new ConcurrentHashMap<>(properties.size());
        properties.forEach((obj, obj2) -> {
            this.c.put((String) obj, (String) obj2);
        });
    }

    String a(String str) {
        return this.c.get(str);
    }

    synchronized String a(String str, String str2) {
        String strPut = this.c.put(str, str2);
        if (!Objects.equals(strPut, str2)) {
            this.d.put(str, str2);
        }
        return strPut;
    }

    synchronized String b(String str) {
        String strRemove = this.c.remove(str);
        if (strRemove != null) {
            this.d.put(str, null);
        }
        return strRemove;
    }

    synchronized void a(Map<String, String> map) {
        this.d.putAll(map);
        this.c.putAll(map);
    }

    Set<String> a() {
        return this.c.keySet();
    }

    Map<String, String> b() {
        return Collections.unmodifiableMap(this.c);
    }

    synchronized Map<String, String> c() {
        if (this.d.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<String, String> map = this.d;
        this.d = new HashMap();
        return map;
    }

    void b(Map<String, String> map) {
        File file = new File(this.b.getParentFile(), this.b.getName() + ".lck");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                FileChannel channel = fileOutputStream.getChannel();
                try {
                    channel.lock();
                    Properties properties = new Properties();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.b);
                        try {
                            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                            try {
                                properties.load(inputStreamReader);
                                inputStreamReader.close();
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    inputStreamReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (FileNotFoundException e) {
                        a.debug("config file {} does not exist", this.b);
                    }
                    if (properties.isEmpty()) {
                        properties.putAll(this.c);
                    } else {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            if (entry.getValue() == null) {
                                properties.remove(entry.getKey());
                            } else {
                                properties.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    File fileCreateTempFile = File.createTempFile("runelite_config", null, this.b.getParentFile());
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile);
                    try {
                        FileChannel channel2 = fileOutputStream2.getChannel();
                        try {
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream2, StandardCharsets.UTF_8);
                            try {
                                channel2.lock();
                                properties.store(outputStreamWriter, "RL configurations");
                                outputStreamWriter.flush();
                                channel2.force(true);
                                outputStreamWriter.close();
                                if (channel2 != null) {
                                    channel2.close();
                                }
                                fileOutputStream2.close();
                                try {
                                    Files.move(fileCreateTempFile.toPath(), this.b.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                                } catch (AtomicMoveNotSupportedException e2) {
                                    a.debug("atomic move not supported", (Throwable) e2);
                                    Files.move(fileCreateTempFile.toPath(), this.b.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                }
                                if (channel != null) {
                                    channel.close();
                                }
                                fileOutputStream.close();
                                file.delete();
                            } catch (Throwable th5) {
                                try {
                                    outputStreamWriter.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } catch (Throwable th7) {
                            if (channel2 != null) {
                                try {
                                    channel2.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable th10) {
                            th9.addSuppressed(th10);
                        }
                        throw th9;
                    }
                } catch (Throwable th11) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                        }
                    }
                    throw th11;
                }
            } catch (Throwable th13) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                }
                throw th13;
            }
        } catch (IOException e3) {
            a.error("unable to save configuration file", (Throwable) e3);
        }
    }
}
