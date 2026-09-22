package org.apache.commons.compress.compressors.bzip2;

/* Reconstructed stub: rs/class_399.class and rs/class_660.class reference
 * BZip2Constants.MAX_SELECTORS, but the BZip2Constants type in deps.jar
 * (org.apache.commons.compress) is package-private and cannot be accessed from
 * outside its package. This public source copy shadows it at compile time with
 * the exact constant values (verified via javap -constants on deps.jar).
 * All usages are compile-time int constants, so they are inlined; there is no
 * runtime linkage to this class. */
public final class BZip2Constants {
    public static final int BASEBLOCKSIZE = 100000;
    public static final int MAX_ALPHA_SIZE = 258;
    public static final int MAX_CODE_LEN = 23;
    public static final int RUNA = 0;
    public static final int RUNB = 1;
    public static final int N_GROUPS = 6;
    public static final int G_SIZE = 50;
    public static final int N_ITERS = 4;
    public static final int MAX_SELECTORS = 18002;
    public static final int NUM_OVERSHOOT_BYTES = 20;

    private BZip2Constants() {
    }
}
