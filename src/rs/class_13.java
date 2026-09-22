package rs;

import com.google.a.b.k;

/* JADX INFO: loaded from: client-final.jar:rs/class_13.class */
class class_13 extends k {
    class_13() {
    }

    @Override // com.google.a.b.k
    public boolean c(char c) {
        return (c >= ' ' && c <= '~') || c == 128 || (c >= 160 && c <= 255);
    }
}
