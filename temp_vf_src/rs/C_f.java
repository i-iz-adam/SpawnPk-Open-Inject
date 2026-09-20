package rs;

public final class C_f {
   private final int b = 0;
   private final int c = 0;
   private final int d = 104;
   private final int e = 104;
   public final int[][] a = new int[this.d][this.e];

   public C_f() {
      this.a();
   }

   public void a() {
      for (int var1 = 0; var1 < this.d; var1++) {
         for (int var2 = 0; var2 < this.e; var2++) {
            if (var1 != 0 && var2 != 0 && var1 != this.d - 1 && var2 != this.e - 1) {
               this.a[var1][var2] = 16777216;
            } else {
               this.a[var1][var2] = 16777215;
            }
         }
      }
   }

   public void a(int var1, int var2, int var3, int var4, boolean var5) {
      var3 -= this.b;
      var1 -= this.c;
      if (var4 == 0) {
         if (var2 == 0) {
            this.a(var3, var1, 128);
            this.a(var3 - 1, var1, 8);
         }

         if (var2 == 1) {
            this.a(var3, var1, 2);
            this.a(var3, var1 + 1, 32);
         }

         if (var2 == 2) {
            this.a(var3, var1, 8);
            this.a(var3 + 1, var1, 128);
         }

         if (var2 == 3) {
            this.a(var3, var1, 32);
            this.a(var3, var1 - 1, 2);
         }
      }

      if (var4 == 1 || var4 == 3) {
         if (var2 == 0) {
            this.a(var3, var1, 1);
            this.a(var3 - 1, var1 + 1, 16);
         }

         if (var2 == 1) {
            this.a(var3, var1, 4);
            this.a(var3 + 1, var1 + 1, 64);
         }

         if (var2 == 2) {
            this.a(var3, var1, 16);
            this.a(var3 + 1, var1 - 1, 1);
         }

         if (var2 == 3) {
            this.a(var3, var1, 64);
            this.a(var3 - 1, var1 - 1, 4);
         }
      }

      if (var4 == 2) {
         if (var2 == 0) {
            this.a(var3, var1, 130);
            this.a(var3 - 1, var1, 8);
            this.a(var3, var1 + 1, 32);
         }

         if (var2 == 1) {
            this.a(var3, var1, 10);
            this.a(var3, var1 + 1, 32);
            this.a(var3 + 1, var1, 128);
         }

         if (var2 == 2) {
            this.a(var3, var1, 40);
            this.a(var3 + 1, var1, 128);
            this.a(var3, var1 - 1, 2);
         }

         if (var2 == 3) {
            this.a(var3, var1, 160);
            this.a(var3, var1 - 1, 2);
            this.a(var3 - 1, var1, 8);
         }
      }

      if (var5) {
         if (var4 == 0) {
            if (var2 == 0) {
               this.a(var3, var1, 65536);
               this.a(var3 - 1, var1, 4096);
            }

            if (var2 == 1) {
               this.a(var3, var1, 1024);
               this.a(var3, var1 + 1, 16384);
            }

            if (var2 == 2) {
               this.a(var3, var1, 4096);
               this.a(var3 + 1, var1, 65536);
            }

            if (var2 == 3) {
               this.a(var3, var1, 16384);
               this.a(var3, var1 - 1, 1024);
            }
         }

         if (var4 == 1 || var4 == 3) {
            if (var2 == 0) {
               this.a(var3, var1, 512);
               this.a(var3 - 1, var1 + 1, 8192);
            }

            if (var2 == 1) {
               this.a(var3, var1, 2048);
               this.a(var3 + 1, var1 + 1, 32768);
            }

            if (var2 == 2) {
               this.a(var3, var1, 8192);
               this.a(var3 + 1, var1 - 1, 512);
            }

            if (var2 == 3) {
               this.a(var3, var1, 32768);
               this.a(var3 - 1, var1 - 1, 2048);
            }
         }

         if (var4 == 2) {
            if (var2 == 0) {
               this.a(var3, var1, 66560);
               this.a(var3 - 1, var1, 4096);
               this.a(var3, var1 + 1, 16384);
            }

            if (var2 == 1) {
               this.a(var3, var1, 5120);
               this.a(var3, var1 + 1, 16384);
               this.a(var3 + 1, var1, 65536);
            }

            if (var2 == 2) {
               this.a(var3, var1, 20480);
               this.a(var3 + 1, var1, 65536);
               this.a(var3, var1 - 1, 1024);
            }

            if (var2 == 3) {
               this.a(var3, var1, 81920);
               this.a(var3, var1 - 1, 1024);
               this.a(var3 - 1, var1, 4096);
            }
         }
      }
   }

   public void a(boolean var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 256;
      if (var1) {
         var7 += 131072;
      }

      var4 -= this.b;
      var5 -= this.c;
      if (var6 == 1 || var6 == 3) {
         int var8 = var2;
         var2 = var3;
         var3 = var8;
      }

      for (int var12 = var4; var12 < var4 + var2; var12++) {
         if (var12 >= 0 && var12 < this.d) {
            for (int var9 = var5; var9 < var5 + var3; var9++) {
               if (var9 >= 0 && var9 < this.e) {
                  this.a(var12, var9, var7);
               }
            }
         }
      }
   }

   public void a(int var1, int var2) {
      var2 -= this.b;
      var1 -= this.c;
      this.a[var2][var1] = this.a[var2][var1] | 2097152;
   }

   private void a(int var1, int var2, int var3) {
      this.a[var1][var2] = this.a[var1][var2] | var3;
   }

   public void a(int var1, int var2, boolean var3, int var4, int var5) {
      var4 -= this.b;
      var5 -= this.c;
      if (var2 == 0) {
         if (var1 == 0) {
            this.b(128, var4, var5);
            this.b(8, var4 - 1, var5);
         }

         if (var1 == 1) {
            this.b(2, var4, var5);
            this.b(32, var4, var5 + 1);
         }

         if (var1 == 2) {
            this.b(8, var4, var5);
            this.b(128, var4 + 1, var5);
         }

         if (var1 == 3) {
            this.b(32, var4, var5);
            this.b(2, var4, var5 - 1);
         }
      }

      if (var2 == 1 || var2 == 3) {
         if (var1 == 0) {
            this.b(1, var4, var5);
            this.b(16, var4 - 1, var5 + 1);
         }

         if (var1 == 1) {
            this.b(4, var4, var5);
            this.b(64, var4 + 1, var5 + 1);
         }

         if (var1 == 2) {
            this.b(16, var4, var5);
            this.b(1, var4 + 1, var5 - 1);
         }

         if (var1 == 3) {
            this.b(64, var4, var5);
            this.b(4, var4 - 1, var5 - 1);
         }
      }

      if (var2 == 2) {
         if (var1 == 0) {
            this.b(130, var4, var5);
            this.b(8, var4 - 1, var5);
            this.b(32, var4, var5 + 1);
         }

         if (var1 == 1) {
            this.b(10, var4, var5);
            this.b(32, var4, var5 + 1);
            this.b(128, var4 + 1, var5);
         }

         if (var1 == 2) {
            this.b(40, var4, var5);
            this.b(128, var4 + 1, var5);
            this.b(2, var4, var5 - 1);
         }

         if (var1 == 3) {
            this.b(160, var4, var5);
            this.b(2, var4, var5 - 1);
            this.b(8, var4 - 1, var5);
         }
      }

      if (var3) {
         if (var2 == 0) {
            if (var1 == 0) {
               this.b(65536, var4, var5);
               this.b(4096, var4 - 1, var5);
            }

            if (var1 == 1) {
               this.b(1024, var4, var5);
               this.b(16384, var4, var5 + 1);
            }

            if (var1 == 2) {
               this.b(4096, var4, var5);
               this.b(65536, var4 + 1, var5);
            }

            if (var1 == 3) {
               this.b(16384, var4, var5);
               this.b(1024, var4, var5 - 1);
            }
         }

         if (var2 == 1 || var2 == 3) {
            if (var1 == 0) {
               this.b(512, var4, var5);
               this.b(8192, var4 - 1, var5 + 1);
            }

            if (var1 == 1) {
               this.b(2048, var4, var5);
               this.b(32768, var4 + 1, var5 + 1);
            }

            if (var1 == 2) {
               this.b(8192, var4, var5);
               this.b(512, var4 + 1, var5 - 1);
            }

            if (var1 == 3) {
               this.b(32768, var4, var5);
               this.b(2048, var4 - 1, var5 - 1);
            }
         }

         if (var2 == 2) {
            if (var1 == 0) {
               this.b(66560, var4, var5);
               this.b(4096, var4 - 1, var5);
               this.b(16384, var4, var5 + 1);
            }

            if (var1 == 1) {
               this.b(5120, var4, var5);
               this.b(16384, var4, var5 + 1);
               this.b(65536, var4 + 1, var5);
            }

            if (var1 == 2) {
               this.b(20480, var4, var5);
               this.b(65536, var4 + 1, var5);
               this.b(1024, var4, var5 - 1);
            }

            if (var1 == 3) {
               this.b(81920, var4, var5);
               this.b(1024, var4, var5 - 1);
               this.b(4096, var4 - 1, var5);
            }
         }
      }
   }

   public void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var3 -= this.b;
      var4 -= this.c;
      if (var1 == 1 || var1 == 3) {
         int var8 = var2;
         var2 = var5;
         var5 = var8;
      }

      for (int var12 = var3; var12 < var3 + var2; var12++) {
         if (var12 >= 0 && var12 < this.d) {
            for (int var9 = var4; var9 < var4 + var5; var9++) {
               if (var9 >= 0 && var9 < this.e) {
                  this.b(var7, var12, var9);
               }
            }
         }
      }
   }

   private void b(int var1, int var2, int var3) {
      this.a[var2][var3] = this.a[var2][var3] & 16777215 - var1;
   }

   public void b(int var1, int var2) {
      var2 -= this.b;
      var1 -= this.c;
      this.a[var2][var1] = this.a[var2][var1] & 14680063;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 == var1 && var3 == var6) {
         return true;
      } else {
         var2 -= this.b;
         var3 -= this.c;
         var1 -= this.b;
         var6 -= this.c;
         if (var5 == 0) {
            if (var4 == 0) {
               if (var2 == var1 - 1 && var3 == var6) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 + 1 && (this.a[var2][var3] & 19398944) == 0) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 - 1 && (this.a[var2][var3] & 19398914) == 0) {
                  return true;
               }
            } else if (var4 == 1) {
               if (var2 == var1 && var3 == var6 + 1) {
                  return true;
               }

               if (var2 == var1 - 1 && var3 == var6 && (this.a[var2][var3] & 19398920) == 0) {
                  return true;
               }

               if (var2 == var1 + 1 && var3 == var6 && (this.a[var2][var3] & 19399040) == 0) {
                  return true;
               }
            } else if (var4 == 2) {
               if (var2 == var1 + 1 && var3 == var6) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 + 1 && (this.a[var2][var3] & 19398944) == 0) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 - 1 && (this.a[var2][var3] & 19398914) == 0) {
                  return true;
               }
            } else if (var4 == 3) {
               if (var2 == var1 && var3 == var6 - 1) {
                  return true;
               }

               if (var2 == var1 - 1 && var3 == var6 && (this.a[var2][var3] & 19398920) == 0) {
                  return true;
               }

               if (var2 == var1 + 1 && var3 == var6 && (this.a[var2][var3] & 19399040) == 0) {
                  return true;
               }
            }
         }

         if (var5 == 2) {
            if (var4 == 0) {
               if (var2 == var1 - 1 && var3 == var6) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 + 1) {
                  return true;
               }

               if (var2 == var1 + 1 && var3 == var6 && (this.a[var2][var3] & 19399040) == 0) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 - 1 && (this.a[var2][var3] & 19398914) == 0) {
                  return true;
               }
            } else if (var4 == 1) {
               if (var2 == var1 - 1 && var3 == var6 && (this.a[var2][var3] & 19398920) == 0) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 + 1) {
                  return true;
               }

               if (var2 == var1 + 1 && var3 == var6) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 - 1 && (this.a[var2][var3] & 19398914) == 0) {
                  return true;
               }
            } else if (var4 == 2) {
               if (var2 == var1 - 1 && var3 == var6 && (this.a[var2][var3] & 19398920) == 0) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 + 1 && (this.a[var2][var3] & 19398944) == 0) {
                  return true;
               }

               if (var2 == var1 + 1 && var3 == var6) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 - 1) {
                  return true;
               }
            } else if (var4 == 3) {
               if (var2 == var1 - 1 && var3 == var6) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 + 1 && (this.a[var2][var3] & 19398944) == 0) {
                  return true;
               }

               if (var2 == var1 + 1 && var3 == var6 && (this.a[var2][var3] & 19399040) == 0) {
                  return true;
               }

               if (var2 == var1 && var3 == var6 - 1) {
                  return true;
               }
            }
         }

         if (var5 == 9) {
            if (var2 == var1 && var3 == var6 + 1 && (this.a[var2][var3] & 32) == 0) {
               return true;
            }

            if (var2 == var1 && var3 == var6 - 1 && (this.a[var2][var3] & 2) == 0) {
               return true;
            }

            if (var2 == var1 - 1 && var3 == var6 && (this.a[var2][var3] & 8) == 0) {
               return true;
            }

            if (var2 == var1 + 1 && var3 == var6 && (this.a[var2][var3] & 128) == 0) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 == var1 && var3 == var2) {
         return true;
      } else {
         var6 -= this.b;
         var3 -= this.c;
         var1 -= this.b;
         var2 -= this.c;
         if (var4 == 6 || var4 == 7) {
            if (var4 == 7) {
               var5 = var5 + 2 & 3;
            }

            if (var5 == 0) {
               if (var6 == var1 + 1 && var3 == var2 && (this.a[var6][var3] & 128) == 0) {
                  return true;
               }

               if (var6 == var1 && var3 == var2 - 1 && (this.a[var6][var3] & 2) == 0) {
                  return true;
               }
            } else if (var5 == 1) {
               if (var6 == var1 - 1 && var3 == var2 && (this.a[var6][var3] & 8) == 0) {
                  return true;
               }

               if (var6 == var1 && var3 == var2 - 1 && (this.a[var6][var3] & 2) == 0) {
                  return true;
               }
            } else if (var5 == 2) {
               if (var6 == var1 - 1 && var3 == var2 && (this.a[var6][var3] & 8) == 0) {
                  return true;
               }

               if (var6 == var1 && var3 == var2 + 1 && (this.a[var6][var3] & 32) == 0) {
                  return true;
               }
            } else if (var5 == 3) {
               if (var6 == var1 + 1 && var3 == var2 && (this.a[var6][var3] & 128) == 0) {
                  return true;
               }

               if (var6 == var1 && var3 == var2 + 1 && (this.a[var6][var3] & 32) == 0) {
                  return true;
               }
            }
         }

         if (var4 == 8) {
            if (var6 == var1 && var3 == var2 + 1 && (this.a[var6][var3] & 32) == 0) {
               return true;
            }

            if (var6 == var1 && var3 == var2 - 1 && (this.a[var6][var3] & 2) == 0) {
               return true;
            }

            if (var6 == var1 - 1 && var3 == var2 && (this.a[var6][var3] & 8) == 0) {
               return true;
            }

            if (var6 == var1 + 1 && var3 == var2 && (this.a[var6][var3] & 128) == 0) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var6 - 1;
      int var9 = var1 + var4 - 1;
      return var3 >= var2 && var3 <= var8 && var7 >= var1 && var7 <= var9
         ? true
         : var3 == var2 - 1 && var7 >= var1 && var7 <= var9 && (this.a[var3 - this.b][var7 - this.c] & 8) == 0 && (var5 & 8) == 0
            || var3 == var8 + 1 && var7 >= var1 && var7 <= var9 && (this.a[var3 - this.b][var7 - this.c] & 128) == 0 && (var5 & 2) == 0
            || var7 == var1 - 1 && var3 >= var2 && var3 <= var8 && (this.a[var3 - this.b][var7 - this.c] & 2) == 0 && (var5 & 4) == 0
            || var7 == var9 + 1 && var3 >= var2 && var3 <= var8 && (this.a[var3 - this.b][var7 - this.c] & 32) == 0 && (var5 & 1) == 0;
   }
}
