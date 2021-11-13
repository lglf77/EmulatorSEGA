package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.au;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@bfk
public final class axo implements arp {
    /* access modifiers changed from: private */
    public axh a;
    /* access modifiers changed from: private */
    public boolean b;
    private final Context c;
    /* access modifiers changed from: private */
    public final Object d = new Object();

    public axo(Context context) {
        this.c = context;
    }

    private final Future<ParcelFileDescriptor> a(axi axi) {
        axp axp = new axp(this);
        axq axq = new axq(this, axp, axi);
        axu axu = new axu(this, axp);
        synchronized (this.d) {
            this.a = new axh(this.c, au.s().a(), axq, axu);
            this.a.d();
        }
        return axp;
    }

    /* access modifiers changed from: private */
    public final void a() {
        synchronized (this.d) {
            if (this.a != null) {
                this.a.g();
                this.a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final auq a(aws<?> aws) {
        auq auq;
        axi a2 = axi.a(aws);
        long intValue = (long) ((Integer) app.f().a(asw.cu)).intValue();
        long b2 = au.k().b();
        try {
            axk axk = (axk) new am(a(a2).get(intValue, TimeUnit.MILLISECONDS)).a(axk.CREATOR);
            if (axk.a) {
                throw new ce(axk.b);
            }
            if (axk.e.length != axk.f.length) {
                auq = null;
            } else {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < axk.e.length; i++) {
                    hashMap.put(axk.e[i], axk.f[i]);
                }
                auq = new auq(axk.c, axk.d, (Map<String, String>) hashMap, axk.g, axk.h);
            }
            fn.a(new StringBuilder(52).append("Http assets remote cache took ").append(au.k().b() - b2).append("ms").toString());
            return auq;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            fn.a(new StringBuilder(52).append("Http assets remote cache took ").append(au.k().b() - b2).append("ms").toString());
            return null;
        } catch (Throwable th) {
            fn.a(new StringBuilder(52).append("Http assets remote cache took ").append(au.k().b() - b2).append("ms").toString());
            throw th;
        }
    }
}
