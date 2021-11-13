package com.google.android.gms.internal;

import com.google.android.gms.internal.afz;
import com.google.android.gms.internal.aga;

public abstract class aga<MessageType extends afz<MessageType, BuilderType>, BuilderType extends aga<MessageType, BuilderType>> implements aie {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ aie a(aid aid) {
        if (n().getClass().isInstance(aid)) {
            return a((afz) aid);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
