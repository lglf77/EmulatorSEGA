package com.google.android.gms.internal;

import java.util.Map;

final class il extends ow {
    private /* synthetic */ byte[] a;
    private /* synthetic */ Map b;
    private /* synthetic */ jg c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    il(Cif ifVar, int i, String str, bdn bdn, bcm bcm, byte[] bArr, Map map, jg jgVar) {
        super(i, str, bdn, bcm);
        this.a = bArr;
        this.b = map;
        this.c = jgVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        a((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        this.c.a(str);
        super.a(str);
    }

    public final byte[] a() {
        return this.a == null ? super.a() : this.a;
    }

    public final Map<String, String> b() {
        return this.b == null ? super.b() : this.b;
    }
}
