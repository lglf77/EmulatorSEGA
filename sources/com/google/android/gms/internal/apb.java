package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.mediation.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@bfk
public final class apb {
    public static final apb a = new apb();

    protected apb() {
    }

    public static aoy a(Context context, ari ari) {
        Date a2 = ari.a();
        long time = a2 != null ? a2.getTime() : -1;
        String b = ari.b();
        int c = ari.c();
        Set<String> d = ari.d();
        List unmodifiableList = !d.isEmpty() ? Collections.unmodifiableList(new ArrayList(d)) : null;
        boolean a3 = ari.a(context);
        int l = ari.l();
        Location e = ari.e();
        Bundle a4 = ari.a((Class<? extends b>) AdMobAdapter.class);
        boolean f = ari.f();
        String g = ari.g();
        a i = ari.i();
        asb asb = i != null ? new asb(i) : null;
        String str = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            app.a();
            str = jc.a(Thread.currentThread().getStackTrace(), packageName);
        }
        return new aoy(7, time, a4, c, unmodifiableList, a3, l, f, g, asb, e, b, ari.k(), ari.m(), Collections.unmodifiableList(new ArrayList(ari.n())), ari.h(), str, ari.o());
    }
}
