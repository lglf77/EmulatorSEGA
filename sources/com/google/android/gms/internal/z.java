package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

@bfk
public final class z extends pp {
    public static final Parcelable.Creator<z> CREATOR = new aa();
    public final dw A;
    public final List<String> B;
    public final List<String> C;
    public final boolean D;
    public final ab E;
    public final boolean F;
    public String G;
    public final List<String> H;
    public final boolean I;
    public final String J;
    public final ee K;
    public final String L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int P;
    private v Q;
    private int R;
    private am S;
    private Bundle T;
    public final String a;
    public String b;
    public final List<String> c;
    public final int d;
    public final List<String> e;
    public final long f;
    public final boolean g;
    public final long h;
    public final List<String> i;
    public final long j;
    public final int k;
    public final String l;
    public final long m;
    public final String n;
    public final boolean o;
    public final String p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public String w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public z(int i2) {
        this(19, (String) null, (String) null, (List<String>) null, i2, (List<String>) null, -1, false, -1, (List<String>) null, -1, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, true, false, (am) null, (String) null, (String) null, false, false, (dw) null, (List<String>) null, (List<String>) null, false, (ab) null, false, (String) null, (List<String>) null, false, (String) null, (ee) null, (String) null, true, false, (Bundle) null, false, 0);
    }

    public z(int i2, long j2) {
        this(19, (String) null, (String) null, (List<String>) null, i2, (List<String>) null, -1, false, -1, (List<String>) null, j2, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, true, false, (am) null, (String) null, (String) null, false, false, (dw) null, (List<String>) null, (List<String>) null, false, (ab) null, false, (String) null, (List<String>) null, false, (String) null, (ee) null, (String) null, true, false, (Bundle) null, false, 0);
    }

    z(int i2, String str, String str2, List<String> list, int i3, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i4, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, am amVar, String str7, String str8, boolean z9, boolean z10, dw dwVar, List<String> list4, List<String> list5, boolean z11, ab abVar, boolean z12, String str9, List<String> list6, boolean z13, String str10, ee eeVar, String str11, boolean z14, boolean z15, Bundle bundle, boolean z16, int i5) {
        ba baVar;
        this.R = i2;
        this.a = str;
        this.b = str2;
        this.c = list != null ? Collections.unmodifiableList(list) : null;
        this.d = i3;
        this.e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f = j2;
        this.g = z2;
        this.h = j3;
        this.i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.j = j4;
        this.k = i4;
        this.l = str3;
        this.m = j5;
        this.n = str4;
        this.o = z3;
        this.p = str5;
        this.q = str6;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.M = z14;
        this.v = z8;
        this.S = amVar;
        this.w = str7;
        this.x = str8;
        if (this.b == null && this.S != null && (baVar = (ba) this.S.a(ba.CREATOR)) != null && !TextUtils.isEmpty(baVar.a)) {
            this.b = baVar.a;
        }
        this.y = z9;
        this.z = z10;
        this.A = dwVar;
        this.B = list4;
        this.C = list5;
        this.D = z11;
        this.E = abVar;
        this.F = z12;
        this.G = str9;
        this.H = list6;
        this.I = z13;
        this.J = str10;
        this.K = eeVar;
        this.L = str11;
        this.N = z15;
        this.T = bundle;
        this.O = z16;
        this.P = i5;
    }

    public z(v vVar, String str, String str2, List<String> list, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i2, String str3, long j5, String str4, String str5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str6, boolean z8, boolean z9, dw dwVar, List<String> list4, List<String> list5, boolean z10, ab abVar, boolean z11, String str7, List<String> list6, boolean z12, String str8, ee eeVar, String str9, boolean z13, boolean z14, boolean z15, int i3) {
        this(19, str, str2, list, -2, list2, j2, z2, -1, list3, j4, i2, str3, j5, str4, false, (String) null, str5, z3, z4, z5, z6, false, (am) null, (String) null, str6, z8, z9, dwVar, list4, list5, z10, abVar, z11, str7, list6, z12, str8, eeVar, str9, z13, z14, (Bundle) null, z15, i3);
        this.Q = vVar;
    }

    public z(v vVar, String str, String str2, List<String> list, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i2, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str7, boolean z9, boolean z10, dw dwVar, List<String> list4, List<String> list5, boolean z11, ab abVar, boolean z12, String str8, List<String> list6, boolean z13, String str9, ee eeVar, String str10, boolean z14, boolean z15, boolean z16, int i3) {
        this(19, str, str2, list, -2, list2, j2, z2, j3, list3, j4, i2, str3, j5, str4, z3, str5, str6, z4, z5, z6, z7, z8, (am) null, (String) null, str7, z9, z10, dwVar, list4, list5, z11, abVar, z12, str8, list6, z13, str9, eeVar, str10, z14, z15, (Bundle) null, z16, 0);
        this.Q = vVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        if (this.Q != null && this.Q.a >= 9 && !TextUtils.isEmpty(this.b)) {
            this.S = new am((pt) new ba(this.b));
            this.b = null;
        }
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.R);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b, false);
        ps.b(parcel, 4, this.c, false);
        ps.a(parcel, 5, this.d);
        ps.b(parcel, 6, this.e, false);
        ps.a(parcel, 7, this.f);
        ps.a(parcel, 8, this.g);
        ps.a(parcel, 9, this.h);
        ps.b(parcel, 10, this.i, false);
        ps.a(parcel, 11, this.j);
        ps.a(parcel, 12, this.k);
        ps.a(parcel, 13, this.l, false);
        ps.a(parcel, 14, this.m);
        ps.a(parcel, 15, this.n, false);
        ps.a(parcel, 18, this.o);
        ps.a(parcel, 19, this.p, false);
        ps.a(parcel, 21, this.q, false);
        ps.a(parcel, 22, this.r);
        ps.a(parcel, 23, this.s);
        ps.a(parcel, 24, this.t);
        ps.a(parcel, 25, this.u);
        ps.a(parcel, 26, this.v);
        ps.a(parcel, 28, (Parcelable) this.S, i2, false);
        ps.a(parcel, 29, this.w, false);
        ps.a(parcel, 30, this.x, false);
        ps.a(parcel, 31, this.y);
        ps.a(parcel, 32, this.z);
        ps.a(parcel, 33, (Parcelable) this.A, i2, false);
        ps.b(parcel, 34, this.B, false);
        ps.b(parcel, 35, this.C, false);
        ps.a(parcel, 36, this.D);
        ps.a(parcel, 37, (Parcelable) this.E, i2, false);
        ps.a(parcel, 38, this.F);
        ps.a(parcel, 39, this.G, false);
        ps.b(parcel, 40, this.H, false);
        ps.a(parcel, 42, this.I);
        ps.a(parcel, 43, this.J, false);
        ps.a(parcel, 44, (Parcelable) this.K, i2, false);
        ps.a(parcel, 45, this.L, false);
        ps.a(parcel, 46, this.M);
        ps.a(parcel, 47, this.N);
        ps.a(parcel, 48, this.T, false);
        ps.a(parcel, 49, this.O);
        ps.a(parcel, 50, this.P);
        ps.a(parcel, a2);
    }
}
