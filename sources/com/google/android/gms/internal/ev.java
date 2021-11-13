package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@bfk
public final class ev {
    public final String A;
    public final auk B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final List<String> G;
    public final aog H;
    public final boolean I;
    public final boolean J;
    private ab K;
    private long L;
    private long M;
    public final aoy a;
    public final mw b;
    public final List<String> c;
    public final int d;
    public final List<String> e;
    public final List<String> f;
    public final int g;
    public final long h;
    public final String i;
    public final JSONObject j;
    public final boolean k;
    public boolean l;
    public final boolean m;
    public final bab n;
    public final bav o;
    public final String p;
    public final bac q;
    public final bae r;
    public final String s;
    public final apc t;
    public final dw u;
    public final List<String> v;
    public final List<String> w;
    public final long x;
    public final long y;
    public final String z;

    public ev(aoy aoy, mw mwVar, List<String> list, int i2, List<String> list2, List<String> list3, int i3, long j2, String str, boolean z2, bab bab, bav bav, String str2, bac bac, bae bae, long j3, apc apc, long j4, long j5, long j6, String str3, JSONObject jSONObject, auk auk, dw dwVar, List<String> list4, List<String> list5, boolean z3, ab abVar, String str4, List<String> list6, String str5, aog aog, boolean z4, boolean z5) {
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.a = aoy;
        this.b = mwVar;
        this.c = a(list);
        this.d = i2;
        this.e = a(list2);
        this.f = a(list3);
        this.g = i3;
        this.h = j2;
        this.i = str;
        this.m = z2;
        this.n = bab;
        this.o = bav;
        this.p = str2;
        this.q = bac;
        this.r = bae;
        this.L = j3;
        this.t = apc;
        this.M = j4;
        this.x = j5;
        this.y = j6;
        this.z = str3;
        this.j = jSONObject;
        this.B = auk;
        this.u = dwVar;
        this.v = a(list4);
        this.w = a(list5);
        this.k = z3;
        this.K = abVar;
        this.s = str4;
        this.G = a(list6);
        this.A = str5;
        this.H = aog;
        this.I = z4;
        this.J = z5;
    }

    public ev(ew ewVar, mw mwVar, bab bab, bav bav, String str, bae bae, auk auk, String str2) {
        this(ewVar.a.c, (mw) null, ewVar.b.c, ewVar.e, ewVar.b.e, ewVar.b.i, ewVar.b.k, ewVar.b.j, ewVar.a.i, ewVar.b.g, (bab) null, (bav) null, (String) null, ewVar.c, (bae) null, ewVar.b.h, ewVar.d, ewVar.b.f, ewVar.f, ewVar.g, ewVar.b.n, ewVar.h, (auk) null, ewVar.b.A, ewVar.b.B, ewVar.b.B, ewVar.b.D, ewVar.b.E, (String) null, ewVar.b.H, ewVar.b.L, ewVar.i, ewVar.b.O, ewVar.j);
    }

    private static <T> List<T> a(List<T> list) {
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public final boolean a() {
        if (this.b == null || this.b.w() == null) {
            return false;
        }
        return this.b.w().b();
    }
}
