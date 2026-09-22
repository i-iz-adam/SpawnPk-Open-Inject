package rs.plugins.fpkg;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* Reconstructed: was `extends com.google.c.c.a<List<f>>` (obfuscated Gson TypeToken),
   but deps.jar holds BOTH type com.google.c.c AND package com.google.c.c/ (type/package
   duality) so the supertype is unresolvable. Sole consumer is d.java:159
   `this.l.a(strA, new e(this).b())` -> Gson `a(String, java.lang.reflect.Type)`,
   so this keeps that call working with an equivalent captured List<f> type. */
// JADX INFO: loaded from: client-final.jar:rs/s/f/e.class
class e {
    final /* synthetic */ d d;

    e(d dVar) {
        this.d = dVar;
    }

    public Type b() {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[]{f.class};
            }

            @Override
            public Type getRawType() {
                return List.class;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        };
    }
}
