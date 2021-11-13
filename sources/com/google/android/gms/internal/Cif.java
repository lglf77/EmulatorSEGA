package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.util.Map;

@bfk
/* renamed from: com.google.android.gms.internal.if  reason: invalid class name */
public final class Cif {
    private static bau a;
    private static final Object b = new Object();
    @Deprecated
    private static im<Void> c = new ig();

    public Cif(Context context) {
        a(context);
    }

    private static bau a(Context context) {
        bau bau;
        bau bau2;
        synchronized (b) {
            if (a == null) {
                Context applicationContext = context.getApplicationContext();
                asw.a(applicationContext);
                if (((Boolean) app.f().a(asw.cs)).booleanValue()) {
                    bau2 = hz.a(applicationContext);
                } else {
                    bau2 = new bau(new km(new File(applicationContext.getCacheDir(), "volley")), new hj((gi) new ot()));
                    bau2.a();
                }
                a = bau2;
            }
            bau = a;
        }
        return bau;
    }

    public final kh<String> a(int i, String str, Map<String, String> map, byte[] bArr) {
        in inVar = new in((ig) null);
        ij ijVar = new ij(this, str, inVar);
        jg jgVar = new jg((String) null);
        il ilVar = new il(this, i, str, inVar, ijVar, bArr, map, jgVar);
        if (jg.c()) {
            try {
                jgVar.a(str, "GET", ilVar.b(), ilVar.a());
            } catch (a e) {
                fn.e(e.getMessage());
            }
        }
        a.a(ilVar);
        return inVar;
    }

    @Deprecated
    public final <T> kh<T> a(String str, im<T> imVar) {
        ks ksVar = new ks();
        a.a(new io(str, ksVar));
        return jx.a(jx.a(ksVar, new ii(this, imVar), kn.b), Throwable.class, new ih(this, imVar), kn.b);
    }

    public final kh<String> a(String str, Map<String, String> map) {
        return a(0, str, map, (byte[]) null);
    }
}
