package rs.p_e;

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
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class C_c {
   private static final Logger a = LoggerFactory.getLogger(C_c.class);
   private final File b;
   private final ConcurrentHashMap<String, String> c;
   private Map<String, String> d = new HashMap<>();

   C_c(File var1) {
      this.b = var1;
      Properties var2 = new Properties();

      try {
         FileInputStream var3 = new FileInputStream(var1);

         try {
            InputStreamReader var4 = new InputStreamReader(var3, StandardCharsets.UTF_8);

            try {
               var2.load(var4);
            } catch (Throwable var9) {
               try {
                  var4.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }

               throw var9;
            }

            var4.close();
         } catch (Throwable var10) {
            try {
               var3.close();
            } catch (Throwable var7) {
               var10.addSuppressed(var7);
            }

            throw var10;
         }

         var3.close();
      } catch (FileNotFoundException var11) {
      } catch (Exception var12) {
         throw new RuntimeException(var12);
      }

      this.c = new ConcurrentHashMap<>(var2.size());
      var2.forEach((var1x, var2x) -> this.c.put((String)var1x, (String)var2x));
   }

   String a(String var1) {
      return this.c.get(var1);
   }

   synchronized String a(String var1, String var2) {
      String var3 = this.c.put(var1, var2);
      if (!Objects.equals(var3, var2)) {
         this.d.put(var1, var2);
      }

      return var3;
   }

   synchronized String b(String var1) {
      String var2 = this.c.remove(var1);
      if (var2 != null) {
         this.d.put(var1, null);
      }

      return var2;
   }

   synchronized void a(Map<String, String> var1) {
      this.d.putAll(var1);
      this.c.putAll(var1);
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
      } else {
         Map var1 = this.d;
         this.d = new HashMap<>();
         return var1;
      }
   }

   void b(Map<String, String> var1) {
      File var2 = new File(this.b.getParentFile(), this.b.getName() + ".lck");

      try {
         FileOutputStream var3 = new FileOutputStream(var2);

         try {
            FileChannel var4 = var3.getChannel();

            try {
               var4.lock();
               Properties var5 = new Properties();

               try {
                  FileInputStream var6 = new FileInputStream(this.b);

                  try {
                     InputStreamReader var7 = new InputStreamReader(var6, StandardCharsets.UTF_8);

                     try {
                        var5.load(var7);
                     } catch (Throwable var21) {
                        try {
                           var7.close();
                        } catch (Throwable var20) {
                           var21.addSuppressed(var20);
                        }

                        throw var21;
                     }

                     var7.close();
                  } catch (Throwable var22) {
                     try {
                        var6.close();
                     } catch (Throwable var19) {
                        var22.addSuppressed(var19);
                     }

                     throw var22;
                  }

                  var6.close();
               } catch (FileNotFoundException var23) {
                  a.debug("config file {} does not exist", this.b);
               }

               if (var5.isEmpty()) {
                  var5.putAll(this.c);
               } else {
                  for (Entry var31 : var1.entrySet()) {
                     if (var31.getValue() == null) {
                        var5.remove(var31.getKey());
                     } else {
                        var5.put(var31.getKey(), var31.getValue());
                     }
                  }
               }

               File var30 = File.createTempFile("runelite_config", null, this.b.getParentFile());
               FileOutputStream var32 = new FileOutputStream(var30);

               try {
                  FileChannel var8 = var32.getChannel();

                  try {
                     OutputStreamWriter var9 = new OutputStreamWriter(var32, StandardCharsets.UTF_8);

                     try {
                        var8.lock();
                        var5.store(var9, "RL configurations");
                        var9.flush();
                        var8.force(true);
                     } catch (Throwable var18) {
                        try {
                           var9.close();
                        } catch (Throwable var16) {
                           var18.addSuppressed(var16);
                        }

                        throw var18;
                     }

                     var9.close();
                  } catch (Throwable var24) {
                     if (var8 != null) {
                        try {
                           var8.close();
                        } catch (Throwable var15) {
                           var24.addSuppressed(var15);
                        }
                     }

                     throw var24;
                  }

                  if (var8 != null) {
                     var8.close();
                  }
               } catch (Throwable var25) {
                  try {
                     var32.close();
                  } catch (Throwable var14) {
                     var25.addSuppressed(var14);
                  }

                  throw var25;
               }

               var32.close();

               try {
                  Files.move(var30.toPath(), this.b.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
               } catch (AtomicMoveNotSupportedException var17) {
                  a.debug("atomic move not supported", var17);
                  Files.move(var30.toPath(), this.b.toPath(), StandardCopyOption.REPLACE_EXISTING);
               }
            } catch (Throwable var26) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var13) {
                     var26.addSuppressed(var13);
                  }
               }

               throw var26;
            }

            if (var4 != null) {
               var4.close();
            }
         } catch (Throwable var27) {
            try {
               var3.close();
            } catch (Throwable var12) {
               var27.addSuppressed(var12);
            }

            throw var27;
         }

         var3.close();
      } catch (IOException var28) {
         a.error("unable to save configuration file", var28);
      }

      var2.delete();
   }
}
