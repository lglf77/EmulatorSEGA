package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.js.b;
import com.google.android.gms.ads.internal.js.k;
import com.google.android.gms.ads.internal.js.z;
import org.json.JSONObject;

@bfk
public final class azu<I, O> implements azi<I, O> {
    /* access modifiers changed from: private */
    public final azk<O> a;
    private final azl<I> b;
    private final z c;
    private final String d;

    azu(z zVar, String str, azl<I> azl, azk<O> azk) {
        this.c = zVar;
        this.d = str;
        this.b = azl;
        this.a = azk;
    }

    /* access modifiers changed from: private */
    public final void a(b bVar, k kVar, I i, ks<O> ksVar) {
        try {
            au.e();
            String a2 = gw.a();
            com.google.android.gms.ads.internal.gmsg.k.o.a(a2, new azx(this, bVar, ksVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a2);
            jSONObject.put("args", this.b.a(i));
            kVar.b(this.d, jSONObject);
        } catch (Exception e) {
            ksVar.a(e);
            fn.b("Unable to invokeJavaScript", e);
            bVar.a();
        } catch (Throwable th) {
            bVar.a();
            throw th;
        }
    }

    public final kh<O> a(I i) {
        return b(i);
    }

    public final kh<O> b(I i) {
        ks ksVar = new ks();
        b b2 = this.c.b((xr) null);
        b2.a(new azv(this, b2, i, ksVar), new azw(this, ksVar, b2));
        return ksVar;
    }
}
