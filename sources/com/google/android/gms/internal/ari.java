package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.mediation.b;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@bfk
public final class ari {
    private final Date a;
    private final String b;
    private final int c;
    private final Set<String> d;
    private final Location e;
    private final boolean f;
    private final Bundle g;
    private final Map<Class<? extends Object>, Object> h;
    private final String i;
    private final String j;
    private final a k;
    private final int l;
    private final Set<String> m;
    private final Bundle n;
    private final Set<String> o;
    private final boolean p;

    public ari(arj arj) {
        this(arj, (a) null);
    }

    public ari(arj arj, a aVar) {
        this.a = arj.g;
        this.b = arj.h;
        this.c = arj.i;
        this.d = Collections.unmodifiableSet(arj.a);
        this.e = arj.j;
        this.f = arj.k;
        this.g = arj.b;
        this.h = Collections.unmodifiableMap(arj.c);
        this.i = arj.l;
        this.j = arj.m;
        this.k = aVar;
        this.l = arj.n;
        this.m = Collections.unmodifiableSet(arj.d);
        this.n = arj.e;
        this.o = Collections.unmodifiableSet(arj.f);
        this.p = arj.o;
    }

    public final Bundle a(Class<? extends b> cls) {
        return this.g.getBundle(cls.getName());
    }

    public final Date a() {
        return this.a;
    }

    public final boolean a(Context context) {
        Set<String> set = this.m;
        app.a();
        return set.contains(jc.a(context));
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final Set<String> d() {
        return this.d;
    }

    public final Location e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final String g() {
        return this.i;
    }

    public final String h() {
        return this.j;
    }

    public final a i() {
        return this.k;
    }

    public final Map<Class<? extends Object>, Object> j() {
        return this.h;
    }

    public final Bundle k() {
        return this.g;
    }

    public final int l() {
        return this.l;
    }

    public final Bundle m() {
        return this.n;
    }

    public final Set<String> n() {
        return this.o;
    }

    public final boolean o() {
        return this.p;
    }
}
