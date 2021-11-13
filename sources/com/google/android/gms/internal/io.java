package com.google.android.gms.internal;

import java.util.Map;

public final class io extends aws<auq> {
    private final ks<auq> a;
    private final Map<String, String> b;
    private final jg c;

    public io(String str, ks<auq> ksVar) {
        this(str, (Map<String, String>) null, ksVar);
    }

    private io(String str, Map<String, String> map, ks<auq> ksVar) {
        super(0, str, new ip(ksVar));
        this.b = null;
        this.a = ksVar;
        this.c = new jg();
        this.c.a(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final bbt<auq> a(auq auq) {
        return bbt.a(auq, np.a(auq));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        auq auq = (auq) obj;
        this.c.a((Map<String, ?>) auq.c, auq.a);
        jg jgVar = this.c;
        byte[] bArr = auq.b;
        if (jg.c() && bArr != null) {
            jgVar.a(bArr);
        }
        this.a.b(auq);
    }
}
