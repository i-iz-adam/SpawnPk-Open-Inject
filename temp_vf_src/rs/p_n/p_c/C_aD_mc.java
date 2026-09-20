package rs.p_n.p_c;

import rs.C_Client_mc;

public class C_aD_mc extends rs.p_n.C_c {
   public static rs.p_l.C_F_uc c = null;
   public static rs.p_l.C_F_uc d = null;
   public static rs.p_l.C_F_uc e = null;
   public static rs.p_l.C_F_uc f = null;
   public static rs.p_l.C_F_uc g = null;
   public static int bI = 317;
   public static int bJ = 45602;
   public static int bK = 45602;

   public C_aD_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   public static void a(int var0, boolean var1) {
      if (var0 >= bJ && var0 <= bK) {
         rs.p_n.C_e.H[var0].E = var1 ? e : c;
         rs.p_n.C_e.H[var0].aG = var1 ? e : c;
      }
   }

   public static void b(int var0, boolean var1) {
      if (var0 >= bJ && var0 <= bK) {
         for (int var2 = bJ; var2 <= bK; var2++) {
            rs.p_n.C_e.H[var2].m = false;
         }

         rs.p_n.C_e.H[var0].m = true;
         if (var1) {
            C_Client_mc.ap = "::selectperk " + (var0 - bJ);
         }
      }
   }

   @Override
   public void a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.Arrays.copyOf(Arrays.java:3482)
      //   at java.base/java.util.ArrayList.toArray(ArrayList.java:369)
      //   at java.base/java.util.ArrayList.addAll(ArrayList.java:752)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.getAllExprents(FunctionExprent.java:466)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:157)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:315)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.processSforms(FunctionExprent.java:942)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:316)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.processSforms(InvocationExprent.java:1827)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:126)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:94)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:224)
      //
      // Bytecode:
      // 000: getstatic rs/p_n/p_c/C_aD_mc.bI I
      // 003: invokestatic rs/p_n/p_c/C_aD_mc.d (I)Lrs/p_n/C_e;
      // 006: astore 1
      // 007: ldc 65303
      // 009: bipush 0
      // 00a: ldc "fountain/sprite"
      // 00c: invokestatic rs/p_n/p_c/C_aD_mc.c (IILjava/lang/String;)V
      // 00f: ldc 65304
      // 011: ldc "<img=186> Blood Fountain Perk Tree <img=186>"
      // 013: aload 0
      // 014: getfield rs/p_n/p_c/C_aD_mc.a [Lrs/p_l/C_K_uc;
      // 017: bipush 2
      // 018: ldc 16751360
      // 01a: bipush 1
      // 01b: bipush 1
      // 01c: invokestatic rs/p_n/p_c/C_aD_mc.a (ILjava/lang/String;[Lrs/p_l/C_K_uc;IIZZ)V
      // 01f: ldc 65313
      // 021: ldc "fountain/sprite"
      // 023: bipush 4
      // 024: bipush 100
      // 026: bipush 32
      // 028: ldc "Purchase"
      // 02a: bipush -1
      // 02b: ldc 65306
      // 02d: bipush 1
      // 02e: invokestatic rs/p_n/p_c/C_aD_mc.a (ILjava/lang/String;IIILjava/lang/String;III)V
      // 031: ldc 65306
      // 033: ldc "fountain/sprite"
      // 035: bipush 5
      // 036: bipush 100
      // 038: bipush 32
      // 03a: ldc 65307
      // 03c: invokestatic rs/p_n/p_c/C_aD_mc.a (ILjava/lang/String;IIII)V
      // 03f: ldc 65308
      // 041: ldc "Purchase"
      // 043: aload 0
      // 044: getfield rs/p_n/p_c/C_aD_mc.a [Lrs/p_l/C_K_uc;
      // 047: bipush 0
      // 048: ldc 16751360
      // 04a: bipush 1
      // 04b: bipush 1
      // 04c: invokestatic rs/p_n/p_c/C_aD_mc.a (ILjava/lang/String;[Lrs/p_l/C_K_uc;IIZZ)V
      // 04f: ldc 65309
      // 051: ldc "fountain/sprite"
      // 053: bipush 4
      // 054: bipush 100
      // 056: bipush 32
      // 058: ldc "Close"
      // 05a: bipush -1
      // 05b: ldc 65310
      // 05d: bipush 1
      // 05e: invokestatic rs/p_n/p_c/C_aD_mc.a (ILjava/lang/String;IIILjava/lang/String;III)V
      // 061: ldc 65310
      // 063: ldc "fountain/sprite"
      // 065: bipush 5
      // 066: bipush 100
      // 068: bipush 32
      // 06a: ldc 65311
      // 06c: invokestatic rs/p_n/p_c/C_aD_mc.a (ILjava/lang/String;IIII)V
      // 06f: ldc 65312
      // 071: ldc "Close"
      // 073: aload 0
      // 074: getfield rs/p_n/p_c/C_aD_mc.a [Lrs/p_l/C_K_uc;
      // 077: bipush 0
      // 078: ldc 16751360
      // 07a: bipush 1
      // 07b: bipush 1
      // 07c: invokestatic rs/p_n/p_c/C_aD_mc.a (ILjava/lang/String;[Lrs/p_l/C_K_uc;IIZZ)V
      // 07f: ldc 65314
      // 081: bipush 6
      // 083: ldc "fountain/sprite"
      // 085: invokestatic rs/p_n/p_c/C_aD_mc.c (IILjava/lang/String;)V
      // 088: ldc 65315
      // 08a: ldc "@whi@Selected perk: @gre@Blood vengeance"
      // 08c: aload 0
      // 08d: getfield rs/p_n/p_c/C_aD_mc.a [Lrs/p_l/C_K_uc;
      // 090: bipush 0
      // 091: ldc 16751360
      // 093: bipush 1
      // 094: bipush 1
      // 095: invokestatic rs/p_n/p_c/C_aD_mc.a (ILjava/lang/String;[Lrs/p_l/C_K_uc;IIZZ)V
      // 098: ldc 65601
      // 09a: bipush 18
      // 09c: ldc "fountain/sprite"
      // 09e: invokestatic rs/p_n/p_c/C_aD_mc.c (IILjava/lang/String;)V
      // 0a1: getstatic rs/p_n/C_e.H [Lrs/p_n/C_e;
      // 0a4: ldc 65601
      // 0a6: aaload
      // 0a7: bipush 1
      // 0a8: putfield rs/p_n/C_e.l Z
      // 0ab: new rs/p_l/C_F_uc
      // 0ae: dup
      // 0af: ldc "fountain/sprite 1"
      // 0b1: invokespecial rs/p_l/C_F_uc.<init> (Ljava/lang/String;)V
      // 0b4: putstatic rs/p_n/p_c/C_aD_mc.c Lrs/p_l/C_F_uc;
      // 0b7: new rs/p_l/C_F_uc
      // 0ba: dup
      // 0bb: ldc "fountain/sprite 2"
      // 0bd: invokespecial rs/p_l/C_F_uc.<init> (Ljava/lang/String;)V
      // 0c0: putstatic rs/p_n/p_c/C_aD_mc.e Lrs/p_l/C_F_uc;
      // 0c3: new rs/p_l/C_F_uc
      // 0c6: dup
      // 0c7: ldc "fountain/sprite 3"
      // 0c9: invokespecial rs/p_l/C_F_uc.<init> (Ljava/lang/String;)V
      // 0cc: putstatic rs/p_n/p_c/C_aD_mc.d Lrs/p_l/C_F_uc;
      // 0cf: new rs/p_l/C_F_uc
      // 0d2: dup
      // 0d3: ldc "fountain/sprite 19"
      // 0d5: invokespecial rs/p_l/C_F_uc.<init> (Ljava/lang/String;)V
      // 0d8: putstatic rs/p_n/p_c/C_aD_mc.f Lrs/p_l/C_F_uc;
      // 0db: new rs/p_l/C_F_uc
      // 0de: dup
      // 0df: ldc "fountain/sprite 20"
      // 0e1: invokespecial rs/p_l/C_F_uc.<init> (Ljava/lang/String;)V
      // 0e4: putstatic rs/p_n/p_c/C_aD_mc.g Lrs/p_l/C_F_uc;
      // 0e7: ldc 65600
      // 0e9: invokestatic rs/p_n/p_c/C_aD_mc.d (I)Lrs/p_n/C_e;
      // 0ec: astore 2
      // 0ed: aload 2
      // 0ee: sipush 600
      // 0f1: putfield rs/p_n/C_e.aH I
      // 0f4: aload 2
      // 0f5: sipush 475
      // 0f8: putfield rs/p_n/C_e.P I
      // 0fb: aload 2
      // 0fc: sipush 268
      // 0ff: putfield rs/p_n/C_e.aR I
      // 102: aload 2
      // 103: bipush 45
      // 105: invokevirtual rs/p_n/C_e.k (I)V
      // 108: aload 2
      // 109: bipush 0
      // 10a: ldc 65601
      // 10c: bipush 3
      // 10d: bipush 5
      // 10e: invokevirtual rs/p_n/C_e.b (IIII)V
      // 111: bipush 0
      // 112: istore 3
      // 113: bipush 0
      // 114: istore 4
      // 116: ldc 45602
      // 118: bipush 1
      // 119: ldc "fountain/sprite"
      // 11b: ldc "Blood vengeance I"
      // 11d: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 120: aload 2
      // 121: bipush 1
      // 122: ldc 45602
      // 124: sipush 243
      // 127: iload 3
      // 128: iadd
      // 129: sipush 546
      // 12c: iload 4
      // 12e: iadd
      // 12f: invokevirtual rs/p_n/C_e.b (IIII)V
      // 132: ldc 45603
      // 134: bipush 1
      // 135: ldc "fountain/sprite"
      // 137: ldc "Blood vengeance II"
      // 139: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 13c: aload 2
      // 13d: bipush 2
      // 13e: ldc 45603
      // 140: sipush 243
      // 143: iload 3
      // 144: iadd
      // 145: sipush 485
      // 148: iload 4
      // 14a: iadd
      // 14b: invokevirtual rs/p_n/C_e.b (IIII)V
      // 14e: ldc 45604
      // 150: bipush 1
      // 151: ldc "fountain/sprite"
      // 153: ldc "Treasure hunter I"
      // 155: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 158: aload 2
      // 159: bipush 3
      // 15a: ldc 45604
      // 15c: sipush 361
      // 15f: iload 3
      // 160: iadd
      // 161: sipush 506
      // 164: iload 4
      // 166: iadd
      // 167: invokevirtual rs/p_n/C_e.b (IIII)V
      // 16a: ldc 45605
      // 16c: bipush 1
      // 16d: ldc "fountain/sprite"
      // 16f: ldc "Treasure hunter II"
      // 171: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 174: aload 2
      // 175: bipush 4
      // 176: ldc 45605
      // 178: sipush 427
      // 17b: iload 3
      // 17c: iadd
      // 17d: sipush 506
      // 180: iload 4
      // 182: iadd
      // 183: invokevirtual rs/p_n/C_e.b (IIII)V
      // 186: ldc 45606
      // 188: bipush 1
      // 189: ldc "fountain/sprite"
      // 18b: ldc "Blood whip"
      // 18d: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 190: aload 2
      // 191: bipush 5
      // 192: ldc 45606
      // 194: sipush 362
      // 197: iload 3
      // 198: iadd
      // 199: sipush 433
      // 19c: iload 4
      // 19e: iadd
      // 19f: invokevirtual rs/p_n/C_e.b (IIII)V
      // 1a2: ldc 45607
      // 1a4: bipush 1
      // 1a5: ldc "fountain/sprite"
      // 1a7: ldc "Blood rune c'bow"
      // 1a9: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 1ac: aload 2
      // 1ad: bipush 6
      // 1af: ldc 45607
      // 1b1: sipush 420
      // 1b4: iload 3
      // 1b5: iadd
      // 1b6: sipush 398
      // 1b9: iload 4
      // 1bb: iadd
      // 1bc: invokevirtual rs/p_n/C_e.b (IIII)V
      // 1bf: ldc 45608
      // 1c1: bipush 1
      // 1c2: ldc "fountain/sprite"
      // 1c4: ldc "Blood dark bow"
      // 1c6: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 1c9: aload 2
      // 1ca: bipush 7
      // 1cc: ldc 45608
      // 1ce: sipush 303
      // 1d1: iload 3
      // 1d2: iadd
      // 1d3: sipush 398
      // 1d6: iload 4
      // 1d8: iadd
      // 1d9: invokevirtual rs/p_n/C_e.b (IIII)V
      // 1dc: ldc 45609
      // 1de: bipush 1
      // 1df: ldc "fountain/sprite"
      // 1e1: ldc "Diamonds are forever"
      // 1e3: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 1e6: aload 2
      // 1e7: bipush 8
      // 1e9: ldc 45609
      // 1eb: sipush 362
      // 1ee: iload 3
      // 1ef: iadd
      // 1f0: sipush 369
      // 1f3: iload 4
      // 1f5: iadd
      // 1f6: invokevirtual rs/p_n/C_e.b (IIII)V
      // 1f9: ldc 45610
      // 1fb: bipush 1
      // 1fc: ldc "fountain/sprite"
      // 1fe: ldc "Bloodthirsty I"
      // 200: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 203: aload 2
      // 204: bipush 9
      // 206: ldc 45610
      // 208: bipush 119
      // 20a: iload 3
      // 20b: iadd
      // 20c: sipush 505
      // 20f: iload 4
      // 211: iadd
      // 212: invokevirtual rs/p_n/C_e.b (IIII)V
      // 215: ldc 45611
      // 217: bipush 1
      // 218: ldc "fountain/sprite"
      // 21a: ldc "Bloodthirsty II"
      // 21c: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 21f: aload 2
      // 220: bipush 10
      // 222: ldc 45611
      // 224: bipush 54
      // 226: iload 3
      // 227: iadd
      // 228: sipush 469
      // 22b: iload 4
      // 22d: iadd
      // 22e: invokevirtual rs/p_n/C_e.b (IIII)V
      // 231: ldc 45612
      // 233: bipush 1
      // 234: ldc "fountain/sprite"
      // 236: ldc "Killjoy I"
      // 238: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 23b: aload 2
      // 23c: bipush 11
      // 23e: ldc 45612
      // 240: bipush 119
      // 242: iload 3
      // 243: iadd
      // 244: sipush 428
      // 247: iload 4
      // 249: iadd
      // 24a: invokevirtual rs/p_n/C_e.b (IIII)V
      // 24d: ldc 45613
      // 24f: bipush 1
      // 250: ldc "fountain/sprite"
      // 252: ldc "Killjoy II"
      // 254: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 257: aload 2
      // 258: bipush 12
      // 25a: ldc 45613
      // 25c: bipush 54
      // 25e: iload 3
      // 25f: iadd
      // 260: sipush 397
      // 263: iload 4
      // 265: iadd
      // 266: invokevirtual rs/p_n/C_e.b (IIII)V
      // 269: ldc 45614
      // 26b: bipush 1
      // 26c: ldc "fountain/sprite"
      // 26e: ldc "Blood pool"
      // 270: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 273: aload 2
      // 274: bipush 13
      // 276: ldc 45614
      // 278: bipush 119
      // 27a: iload 3
      // 27b: iadd
      // 27c: sipush 359
      // 27f: iload 4
      // 281: iadd
      // 282: invokevirtual rs/p_n/C_e.b (IIII)V
      // 285: ldc 45615
      // 287: bipush 1
      // 288: ldc "fountain/sprite"
      // 28a: ldc "Blood staff"
      // 28c: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 28f: aload 2
      // 290: bipush 14
      // 292: ldc 45615
      // 294: sipush 303
      // 297: iload 3
      // 298: iadd
      // 299: sipush 467
      // 29c: iload 4
      // 29e: iadd
      // 29f: invokevirtual rs/p_n/C_e.b (IIII)V
      // 2a2: ldc 45616
      // 2a4: bipush 1
      // 2a5: ldc "fountain/sprite"
      // 2a7: ldc "Blood ring"
      // 2a9: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 2ac: aload 2
      // 2ad: bipush 15
      // 2af: ldc 45616
      // 2b1: sipush 420
      // 2b4: iload 3
      // 2b5: iadd
      // 2b6: sipush 467
      // 2b9: iload 4
      // 2bb: iadd
      // 2bc: invokevirtual rs/p_n/C_e.b (IIII)V
      // 2bf: ldc 45617
      // 2c1: bipush 1
      // 2c2: ldc "fountain/sprite"
      // 2c4: ldc "Treasure buddy"
      // 2c6: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 2c9: aload 2
      // 2ca: bipush 16
      // 2cc: ldc 45617
      // 2ce: sipush 427
      // 2d1: iload 3
      // 2d2: iadd
      // 2d3: sipush 552
      // 2d6: iload 4
      // 2d8: iadd
      // 2d9: invokevirtual rs/p_n/C_e.b (IIII)V
      // 2dc: ldc 45618
      // 2de: bipush 1
      // 2df: ldc "fountain/sprite"
      // 2e1: ldc "Emblem snatcher"
      // 2e3: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 2e6: aload 2
      // 2e7: bipush 17
      // 2e9: ldc 45618
      // 2eb: sipush 177
      // 2ee: iload 3
      // 2ef: iadd
      // 2f0: sipush 397
      // 2f3: iload 4
      // 2f5: iadd
      // 2f6: invokevirtual rs/p_n/C_e.b (IIII)V
      // 2f9: ldc 45619
      // 2fb: bipush 1
      // 2fc: ldc "fountain/sprite"
      // 2fe: ldc "Augury"
      // 300: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 303: aload 2
      // 304: bipush 18
      // 306: ldc 45619
      // 308: sipush 216
      // 30b: iload 3
      // 30c: iadd
      // 30d: sipush 434
      // 310: iload 4
      // 312: iadd
      // 313: invokevirtual rs/p_n/C_e.b (IIII)V
      // 316: ldc 45620
      // 318: bipush 1
      // 319: ldc "fountain/sprite"
      // 31b: ldc "Rigour"
      // 31d: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 320: aload 2
      // 321: bipush 19
      // 323: ldc 45620
      // 325: sipush 270
      // 328: iload 3
      // 329: iadd
      // 32a: sipush 434
      // 32d: iload 4
      // 32f: iadd
      // 330: invokevirtual rs/p_n/C_e.b (IIII)V
      // 333: ldc 45621
      // 335: bipush 1
      // 336: ldc "fountain/sprite"
      // 338: ldc "Bloodlust"
      // 33a: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 33d: aload 2
      // 33e: bipush 20
      // 340: ldc 45621
      // 342: bipush 13
      // 344: iload 3
      // 345: iadd
      // 346: sipush 519
      // 349: iload 4
      // 34b: iadd
      // 34c: invokevirtual rs/p_n/C_e.b (IIII)V
      // 34f: ldc 45622
      // 351: bipush 1
      // 352: ldc "fountain/sprite"
      // 354: ldc "Excavator"
      // 356: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 359: aload 2
      // 35a: bipush 21
      // 35c: ldc 45622
      // 35e: sipush 176
      // 361: iload 3
      // 362: iadd
      // 363: sipush 475
      // 366: iload 4
      // 368: iadd
      // 369: invokevirtual rs/p_n/C_e.b (IIII)V
      // 36c: ldc 45623
      // 36e: bipush 1
      // 36f: ldc "fountain/sprite"
      // 371: ldc "War diamonds"
      // 373: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 376: aload 2
      // 377: bipush 22
      // 379: ldc 45623
      // 37b: bipush 10
      // 37d: iload 3
      // 37e: iadd
      // 37f: sipush 430
      // 382: iload 4
      // 384: iadd
      // 385: invokevirtual rs/p_n/C_e.b (IIII)V
      // 388: ldc 45624
      // 38a: bipush 1
      // 38b: ldc "fountain/sprite"
      // 38d: ldc "Unholy smite"
      // 38f: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 392: aload 2
      // 393: bipush 23
      // 395: ldc 45624
      // 397: sipush 242
      // 39a: iload 3
      // 39b: iadd
      // 39c: sipush 396
      // 39f: iload 4
      // 3a1: iadd
      // 3a2: invokevirtual rs/p_n/C_e.b (IIII)V
      // 3a5: ldc 45625
      // 3a7: bipush 1
      // 3a8: ldc "fountain/sprite"
      // 3aa: ldc "Eternal recoil"
      // 3ac: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 3af: aload 2
      // 3b0: bipush 24
      // 3b2: ldc 45625
      // 3b4: sipush 198
      // 3b7: iload 3
      // 3b8: iadd
      // 3b9: sipush 354
      // 3bc: iload 4
      // 3be: iadd
      // 3bf: invokevirtual rs/p_n/C_e.b (IIII)V
      // 3c2: ldc 45626
      // 3c4: bipush 1
      // 3c5: ldc "fountain/sprite"
      // 3c7: ldc "Eternal blood cape"
      // 3c9: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 3cc: aload 2
      // 3cd: bipush 25
      // 3cf: ldc 45626
      // 3d1: sipush 285
      // 3d4: iload 3
      // 3d5: iadd
      // 3d6: sipush 354
      // 3d9: iload 4
      // 3db: iadd
      // 3dc: invokevirtual rs/p_n/C_e.b (IIII)V
      // 3df: ldc 45627
      // 3e1: bipush 1
      // 3e2: ldc "fountain/sprite"
      // 3e4: ldc "Vampiric damage"
      // 3e6: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 3e9: aload 2
      // 3ea: bipush 26
      // 3ec: ldc 45627
      // 3ee: bipush 59
      // 3f0: iload 3
      // 3f1: iadd
      // 3f2: sipush 330
      // 3f5: iload 4
      // 3f7: iadd
      // 3f8: invokevirtual rs/p_n/C_e.b (IIII)V
      // 3fb: ldc 45628
      // 3fd: bipush 1
      // 3fe: ldc "fountain/sprite"
      // 400: ldc "Vampiric defence"
      // 402: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 405: aload 2
      // 406: bipush 27
      // 408: ldc 45628
      // 40a: sipush 421
      // 40d: iload 3
      // 40e: iadd
      // 40f: sipush 331
      // 412: iload 4
      // 414: iadd
      // 415: invokevirtual rs/p_n/C_e.b (IIII)V
      // 418: ldc 45629
      // 41a: bipush 1
      // 41b: ldc "fountain/sprite"
      // 41d: ldc "Vampiric accuracy"
      // 41f: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 422: aload 2
      // 423: bipush 28
      // 425: ldc 45629
      // 427: bipush 59
      // 429: iload 3
      // 42a: iadd
      // 42b: sipush 277
      // 42e: iload 4
      // 430: iadd
      // 431: invokevirtual rs/p_n/C_e.b (IIII)V
      // 434: ldc 45630
      // 436: bipush 1
      // 437: ldc "fountain/sprite"
      // 439: ldc "Archaeologist I"
      // 43b: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 43e: aload 2
      // 43f: bipush 29
      // 441: ldc 45630
      // 443: sipush 321
      // 446: iload 3
      // 447: iadd
      // 448: sipush 330
      // 44b: iload 4
      // 44d: iadd
      // 44e: invokevirtual rs/p_n/C_e.b (IIII)V
      // 451: ldc 45631
      // 453: bipush 1
      // 454: ldc "fountain/sprite"
      // 456: ldc "Archaeologist II"
      // 458: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 45b: aload 2
      // 45c: bipush 30
      // 45e: ldc 45631
      // 460: sipush 321
      // 463: iload 3
      // 464: iadd
      // 465: sipush 277
      // 468: iload 4
      // 46a: iadd
      // 46b: invokevirtual rs/p_n/C_e.b (IIII)V
      // 46e: ldc 45632
      // 470: bipush 1
      // 471: ldc "fountain/sprite"
      // 473: ldc "Archaeologist III"
      // 475: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 478: aload 2
      // 479: bipush 31
      // 47b: ldc 45632
      // 47d: sipush 362
      // 480: iload 3
      // 481: iadd
      // 482: sipush 307
      // 485: iload 4
      // 487: iadd
      // 488: invokevirtual rs/p_n/C_e.b (IIII)V
      // 48b: ldc 45633
      // 48d: bipush 1
      // 48e: ldc "fountain/sprite"
      // 490: ldc "Blood archer ring"
      // 492: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 495: aload 2
      // 496: bipush 32
      // 498: ldc 45633
      // 49a: sipush 156
      // 49d: iload 3
      // 49e: iadd
      // 49f: sipush 324
      // 4a2: iload 4
      // 4a4: iadd
      // 4a5: invokevirtual rs/p_n/C_e.b (IIII)V
      // 4a8: ldc 45634
      // 4aa: bipush 1
      // 4ab: ldc "fountain/sprite"
      // 4ad: ldc "Blood seers ring"
      // 4af: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 4b2: aload 2
      // 4b3: bipush 33
      // 4b5: ldc 45634
      // 4b7: sipush 238
      // 4ba: iload 3
      // 4bb: iadd
      // 4bc: sipush 324
      // 4bf: iload 4
      // 4c1: iadd
      // 4c2: invokevirtual rs/p_n/C_e.b (IIII)V
      // 4c5: ldc 45635
      // 4c7: bipush 1
      // 4c8: ldc "fountain/sprite"
      // 4ca: ldc "Blood berserker ring"
      // 4cc: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 4cf: aload 2
      // 4d0: bipush 34
      // 4d2: ldc 45635
      // 4d4: sipush 198
      // 4d7: iload 3
      // 4d8: iadd
      // 4d9: sipush 304
      // 4dc: iload 4
      // 4de: iadd
      // 4df: invokevirtual rs/p_n/C_e.b (IIII)V
      // 4e2: ldc 45636
      // 4e4: bipush 1
      // 4e5: ldc "fountain/sprite"
      // 4e7: ldc "Death's accomplice"
      // 4e9: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 4ec: aload 2
      // 4ed: bipush 35
      // 4ef: ldc 45636
      // 4f1: bipush 96
      // 4f3: iload 3
      // 4f4: iadd
      // 4f5: sipush 242
      // 4f8: iload 4
      // 4fa: iadd
      // 4fb: invokevirtual rs/p_n/C_e.b (IIII)V
      // 4fe: ldc 45637
      // 500: bipush 1
      // 501: ldc "fountain/sprite"
      // 503: ldc "Death's door"
      // 505: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 508: aload 2
      // 509: bipush 36
      // 50b: ldc 45637
      // 50d: sipush 421
      // 510: iload 3
      // 511: iadd
      // 512: sipush 281
      // 515: iload 4
      // 517: iadd
      // 518: invokevirtual rs/p_n/C_e.b (IIII)V
      // 51b: ldc 45638
      // 51d: bipush 1
      // 51e: ldc "fountain/sprite"
      // 520: ldc "Blood alchemy"
      // 522: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 525: aload 2
      // 526: bipush 37
      // 528: ldc 45638
      // 52a: bipush 119
      // 52c: iload 3
      // 52d: iadd
      // 52e: sipush 305
      // 531: iload 4
      // 533: iadd
      // 534: invokevirtual rs/p_n/C_e.b (IIII)V
      // 537: ldc 45639
      // 539: bipush 1
      // 53a: ldc "fountain/sprite"
      // 53c: ldc "Blood alchemy II"
      // 53e: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 541: aload 2
      // 542: bipush 38
      // 544: ldc 45639
      // 546: sipush 150
      // 549: iload 3
      // 54a: iadd
      // 54b: sipush 275
      // 54e: iload 4
      // 550: iadd
      // 551: invokevirtual rs/p_n/C_e.b (IIII)V
      // 554: ldc 45640
      // 556: bipush 1
      // 557: ldc "fountain/sprite"
      // 559: ldc "Grand treasure"
      // 55b: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 55e: aload 2
      // 55f: bipush 39
      // 561: ldc 45640
      // 563: sipush 361
      // 566: iload 3
      // 567: iadd
      // 568: sipush 506
      // 56b: iload 4
      // 56d: iadd
      // 56e: bipush 46
      // 570: iadd
      // 571: invokevirtual rs/p_n/C_e.b (IIII)V
      // 574: ldc 45641
      // 576: bipush 1
      // 577: ldc "fountain/sprite"
      // 579: ldc "Blood alchemy III"
      // 57b: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 57e: aload 2
      // 57f: bipush 40
      // 581: ldc 45641
      // 583: sipush 150
      // 586: iload 3
      // 587: iadd
      // 588: bipush 32
      // 58a: iadd
      // 58b: sipush 275
      // 58e: iload 4
      // 590: iadd
      // 591: bipush 33
      // 593: isub
      // 594: invokevirtual rs/p_n/C_e.b (IIII)V
      // 597: ldc 45642
      // 599: bipush 1
      // 59a: ldc "fountain/sprite"
      // 59c: ldc "Bounty teleport"
      // 59e: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 5a1: aload 2
      // 5a2: bipush 41
      // 5a4: ldc 45642
      // 5a6: bipush 18
      // 5a8: iload 3
      // 5a9: iadd
      // 5aa: sipush 365
      // 5ad: iload 4
      // 5af: iadd
      // 5b0: invokevirtual rs/p_n/C_e.b (IIII)V
      // 5b3: ldc 45643
      // 5b5: bipush 1
      // 5b6: ldc "fountain/sprite"
      // 5b8: ldc "Mercenary I"
      // 5ba: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 5bd: aload 2
      // 5be: bipush 42
      // 5c0: ldc 45643
      // 5c2: bipush 20
      // 5c4: iload 3
      // 5c5: iadd
      // 5c6: sipush 242
      // 5c9: iload 4
      // 5cb: iadd
      // 5cc: invokevirtual rs/p_n/C_e.b (IIII)V
      // 5cf: ldc 45644
      // 5d1: bipush 1
      // 5d2: ldc "fountain/sprite"
      // 5d4: ldc "Mercenary II"
      // 5d6: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 5d9: aload 2
      // 5da: bipush 43
      // 5dc: ldc 45644
      // 5de: bipush 20
      // 5e0: iload 3
      // 5e1: iadd
      // 5e2: sipush 192
      // 5e5: iload 4
      // 5e7: iadd
      // 5e8: invokevirtual rs/p_n/C_e.b (IIII)V
      // 5eb: ldc 45645
      // 5ed: bipush 1
      // 5ee: ldc "fountain/sprite"
      // 5f0: ldc "Escape Artist"
      // 5f2: invokestatic rs/p_n/p_c/C_aD_mc.a (IILjava/lang/String;Ljava/lang/String;)V
      // 5f5: aload 2
      // 5f6: bipush 44
      // 5f8: ldc 45645
      // 5fa: bipush 96
      // 5fc: iload 3
      // 5fd: iadd
      // 5fe: sipush 192
      // 601: iload 4
      // 603: iadd
      // 604: invokevirtual rs/p_n/C_e.b (IIII)V
      // 607: aload 2
      // 608: getfield rs/p_n/C_e.al [I
      // 60b: aload 2
      // 60c: getfield rs/p_n/C_e.al [I
      // 60f: arraylength
      // 610: bipush 1
      // 611: isub
      // 612: iaload
      // 613: putstatic rs/p_n/p_c/C_aD_mc.bK I
      // 616: bipush 11
      // 618: istore 5
      // 61a: aload 1
      // 61b: bipush 11
      // 61d: newarray 10
      // 61f: putfield rs/p_n/C_e.al [I
      // 622: aload 1
      // 623: bipush 11
      // 625: newarray 10
      // 627: putfield rs/p_n/C_e.am [I
      // 62a: aload 1
      // 62b: bipush 11
      // 62d: newarray 10
      // 62f: putfield rs/p_n/C_e.bc [I
      // 632: aload 1
      // 633: bipush 0
      // 634: ldc 65303
      // 636: bipush 5
      // 637: bipush 20
      // 639: invokevirtual rs/p_n/C_e.b (IIII)V
      // 63c: aload 1
      // 63d: bipush 1
      // 63e: ldc 65304
      // 640: sipush 265
      // 643: bipush 25
      // 645: invokevirtual rs/p_n/C_e.b (IIII)V
      // 648: aload 1
      // 649: bipush 2
      // 64a: ldc 63740
      // 64c: sipush 479
      // 64f: bipush 24
      // 651: invokevirtual rs/p_n/C_e.b (IIII)V
      // 654: aload 1
      // 655: bipush 3
      // 656: ldc 63741
      // 658: sipush 479
      // 65b: bipush 24
      // 65d: invokevirtual rs/p_n/C_e.b (IIII)V
      // 660: aload 1
      // 661: bipush 4
      // 662: ldc 65308
      // 664: ldc -72000
      // 666: sipush 287
      // 669: invokevirtual rs/p_n/C_e.b (IIII)V
      // 66c: aload 1
      // 66d: bipush 5
      // 66e: ldc 65309
      // 670: ldc -138000
      // 672: sipush 277
      // 675: invokevirtual rs/p_n/C_e.b (IIII)V
      // 678: aload 1
      // 679: bipush 6
      // 67b: ldc 65310
      // 67d: ldc -138000
      // 67f: sipush 277
      // 682: invokevirtual rs/p_n/C_e.b (IIII)V
      // 685: aload 1
      // 686: bipush 7
      // 688: ldc 65312
      // 68a: ldc -188000
      // 68c: sipush 287
      // 68f: invokevirtual rs/p_n/C_e.b (IIII)V
      // 692: aload 1
      // 693: bipush 8
      // 695: ldc 65314
      // 697: ldc -276000
      // 699: sipush 285
      // 69c: invokevirtual rs/p_n/C_e.b (IIII)V
      // 69f: aload 1
      // 6a0: bipush 9
      // 6a2: ldc 65315
      // 6a4: ldc -371000
      // 6a6: sipush 289
      // 6a9: invokevirtual rs/p_n/C_e.b (IIII)V
      // 6ac: aload 1
      // 6ad: bipush 10
      // 6af: ldc 65600
      // 6b1: bipush 4
      // 6b2: bipush 44
      // 6b4: invokevirtual rs/p_n/C_e.b (IIII)V
      // 6b7: return
   }
}
