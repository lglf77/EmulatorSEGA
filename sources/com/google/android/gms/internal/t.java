package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ae;

@bfk
public final class t extends p implements ad, ae {
    private Context a;
    private jp b;
    private ku<v> c;
    private final n d;
    private final Object e = new Object();
    private u f;

    public t(Context context, jp jpVar, ku<v> kuVar, n nVar) {
        super(kuVar, nVar);
        this.a = context;
        this.b = jpVar;
        this.c = kuVar;
        this.d = nVar;
        this.f = new u(context, ((Boolean) app.f().a(asw.C)).booleanValue() ? au.s().a() : context.getMainLooper(), this, this, this.b.c);
        this.f.d();
    }

    public final void a() {
        synchronized (this.e) {
            if (this.f.e() || this.f.f()) {
                this.f.g();
            }
            Binder.flushPendingCommands();
        }
    }

    public final void a(int i) {
        fn.b("Disconnected from remote ad request service.");
    }

    public final void a(Bundle bundle) {
        d();
    }

    public final void a(a aVar) {
        fn.b("Cannot connect to remote service, fallback to local instance.");
        new s(this.a, this.c, this.d).d();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        au.e().b(this.a, this.b.a, "gmob-apps", bundle, true);
    }

    public final ae b() {
        ae aeVar;
        synchronized (this.e) {
            try {
                aeVar = this.f.q();
            } catch (DeadObjectException | IllegalStateException e2) {
                aeVar = null;
            }
        }
        return aeVar;
    }
}
