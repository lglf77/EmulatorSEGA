package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

@bfk
public class apg {
    private aqp a;
    private final Object b = new Object();
    /* access modifiers changed from: private */
    public final aox c;
    /* access modifiers changed from: private */
    public final aow d;
    /* access modifiers changed from: private */
    public final arr e;
    private final axb f;
    /* access modifiers changed from: private */
    public final cy g;
    /* access modifiers changed from: private */
    public final bcq h;
    private final axc i;

    abstract class a<T> {
        a() {
        }

        /* access modifiers changed from: protected */
        public abstract T a();

        /* access modifiers changed from: protected */
        public abstract T a(aqp aqp);

        /* access modifiers changed from: protected */
        public final T b() {
            aqp a2 = apg.this.b();
            if (a2 == null) {
                jn.e("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return a(a2);
            } catch (RemoteException e) {
                jn.c("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final T c() {
            try {
                return a();
            } catch (RemoteException e) {
                jn.c("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public apg(aox aox, aow aow, arr arr, axb axb, cy cyVar, bcq bcq, axc axc) {
        this.c = aox;
        this.d = aow;
        this.e = arr;
        this.f = axb;
        this.g = cyVar;
        this.h = bcq;
        this.i = axc;
    }

    private static aqp a() {
        try {
            Object newInstance = apg.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return aqq.asInterface((IBinder) newInstance);
            }
            jn.e("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Exception e2) {
            jn.c("Failed to instantiate ClientApi class.", e2);
            return null;
        }
    }

    static <T> T a(Context context, boolean z, a<T> aVar) {
        boolean z2 = true;
        boolean z3 = z;
        if (!z3) {
            app.a();
            if (!jc.c(context)) {
                jn.b("Google Play Services is not available");
                z3 = true;
            }
        }
        app.a();
        int e2 = jc.e(context);
        app.a();
        if (e2 <= jc.d(context)) {
            z2 = z3;
        }
        if (z2) {
            T b2 = aVar.b();
            return b2 == null ? aVar.c() : b2;
        }
        T c2 = aVar.c();
        return c2 == null ? aVar.b() : c2;
    }

    /* access modifiers changed from: private */
    public static void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        app.a().a(context, (String) null, "gmob-apps", bundle, true);
    }

    /* access modifiers changed from: private */
    public final aqp b() {
        aqp aqp;
        synchronized (this.b) {
            if (this.a == null) {
                this.a = a();
            }
            aqp = this.a;
        }
        return aqp;
    }

    public final aqb a(Context context, String str, bar bar) {
        return (aqb) a(context, false, new apk(this, context, str, bar));
    }

    public final bcr a(Activity activity) {
        boolean z = false;
        Intent intent = activity.getIntent();
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            jn.c("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (bcr) a((Context) activity, z, new apo(this, activity));
    }
}
