package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import java.util.List;

@bfk
public final class atz extends avx implements aul {
    private String a;
    private List<aty> b;
    private String c;
    private avh d;
    private String e;
    private double f;
    private String g;
    private String h;
    private atw i;
    private Bundle j;
    private ara k;
    private View l;
    private a m;
    private String n;
    private Object o = new Object();
    /* access modifiers changed from: private */
    public aui p;

    public atz(String str, List<aty> list, String str2, avh avh, String str3, double d2, String str4, String str5, atw atw, Bundle bundle, ara ara, View view, a aVar, String str6) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = avh;
        this.e = str3;
        this.f = d2;
        this.g = str4;
        this.h = str5;
        this.i = atw;
        this.j = bundle;
        this.k = ara;
        this.l = view;
        this.m = aVar;
        this.n = str6;
    }

    public final String a() {
        return this.a;
    }

    public final void a(Bundle bundle) {
        synchronized (this.o) {
            if (this.p == null) {
                fn.c("Attempt to perform click before app install ad initialized.");
            } else {
                this.p.b(bundle);
            }
        }
    }

    public final void a(aui aui) {
        synchronized (this.o) {
            this.p = aui;
        }
    }

    public final List b() {
        return this.b;
    }

    public final boolean b(Bundle bundle) {
        boolean a2;
        synchronized (this.o) {
            if (this.p == null) {
                fn.c("Attempt to record impression before app install ad initialized.");
                a2 = false;
            } else {
                a2 = this.p.a(bundle);
            }
        }
        return a2;
    }

    public final String c() {
        return this.c;
    }

    public final void c(Bundle bundle) {
        synchronized (this.o) {
            if (this.p == null) {
                fn.c("Attempt to perform click before app install ad initialized.");
            } else {
                this.p.c(bundle);
            }
        }
    }

    public final avh d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final double f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final ara i() {
        return this.k;
    }

    public final a j() {
        return c.a(this.p);
    }

    public final String k() {
        return "2";
    }

    public final String l() {
        return "";
    }

    public final atw m() {
        return this.i;
    }

    public final Bundle n() {
        return this.j;
    }

    public final View o() {
        return this.l;
    }

    public final a p() {
        return this.m;
    }

    public final String q() {
        return this.n;
    }

    public final avd r() {
        return this.i;
    }

    public final void s() {
        gw.a.post(new aua(this));
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0.0d;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.o = null;
        this.k = null;
        this.l = null;
    }
}
