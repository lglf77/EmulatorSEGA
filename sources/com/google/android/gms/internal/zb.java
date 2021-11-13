package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.acj;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zb<P> {
    private static final Charset a = Charset.forName("UTF-8");
    private ConcurrentMap<String, List<zc<P>>> b = new ConcurrentHashMap();
    private zc<P> c;

    public final zc<P> a() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final zc<P> a(P p, acj.b bVar) {
        byte[] bArr;
        switch (yr.a[bVar.f().ordinal()]) {
            case a.b.AdsAttrs_adSizes:
            case 2:
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.e()).array();
                break;
            case 3:
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(bVar.e()).array();
                break;
            case 4:
                bArr = yq.a;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        zc<P> zcVar = new zc<>(p, bArr, bVar.c(), bVar.f());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zcVar);
        String str = new String(zcVar.b(), a);
        List list = (List) this.b.put(str, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(zcVar);
            this.b.put(str, Collections.unmodifiableList(arrayList2));
        }
        return zcVar;
    }

    /* access modifiers changed from: protected */
    public final void a(zc<P> zcVar) {
        this.c = zcVar;
    }
}
