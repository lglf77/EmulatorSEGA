package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.y;

final class rd {
    private long A;
    private final tk a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private String x;
    private boolean y;
    private long z;

    rd(tk tkVar, String str) {
        y.a(tkVar);
        y.a(str);
        this.a = tkVar;
        this.b = str;
        this.a.h().c();
    }

    public final long A() {
        this.a.h().c();
        return this.p;
    }

    public final boolean B() {
        this.a.h().c();
        return this.q;
    }

    public final void a() {
        this.a.h().c();
        this.y = false;
    }

    public final void a(long j2) {
        this.a.h().c();
        this.y = (this.h != j2) | this.y;
        this.h = j2;
    }

    public final void a(String str) {
        this.a.h().c();
        this.y = (!wr.a(this.c, str)) | this.y;
        this.c = str;
    }

    public final void a(boolean z2) {
        this.a.h().c();
        this.y = (this.o != z2) | this.y;
        this.o = z2;
    }

    public final String b() {
        this.a.h().c();
        return this.b;
    }

    public final void b(long j2) {
        this.a.h().c();
        this.y = (this.i != j2) | this.y;
        this.i = j2;
    }

    public final void b(String str) {
        this.a.h().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.y = (!wr.a(this.d, str)) | this.y;
        this.d = str;
    }

    public final void b(boolean z2) {
        this.a.h().c();
        this.y = this.q != z2;
        this.q = z2;
    }

    public final String c() {
        this.a.h().c();
        return this.c;
    }

    public final void c(long j2) {
        this.a.h().c();
        this.y = (this.k != j2) | this.y;
        this.k = j2;
    }

    public final void c(String str) {
        this.a.h().c();
        this.y = (!wr.a(this.e, str)) | this.y;
        this.e = str;
    }

    public final String d() {
        this.a.h().c();
        return this.d;
    }

    public final void d(long j2) {
        this.a.h().c();
        this.y = (this.m != j2) | this.y;
        this.m = j2;
    }

    public final void d(String str) {
        this.a.h().c();
        this.y = (!wr.a(this.f, str)) | this.y;
        this.f = str;
    }

    public final String e() {
        this.a.h().c();
        return this.e;
    }

    public final void e(long j2) {
        this.a.h().c();
        this.y = (this.n != j2) | this.y;
        this.n = j2;
    }

    public final void e(String str) {
        this.a.h().c();
        this.y = (!wr.a(this.j, str)) | this.y;
        this.j = str;
    }

    public final String f() {
        this.a.h().c();
        return this.f;
    }

    public final void f(long j2) {
        boolean z2 = true;
        y.b(j2 >= 0);
        this.a.h().c();
        boolean z3 = this.y;
        if (this.g == j2) {
            z2 = false;
        }
        this.y = z3 | z2;
        this.g = j2;
    }

    public final void f(String str) {
        this.a.h().c();
        this.y = (!wr.a(this.l, str)) | this.y;
        this.l = str;
    }

    public final long g() {
        this.a.h().c();
        return this.h;
    }

    public final void g(long j2) {
        this.a.h().c();
        this.y = (this.z != j2) | this.y;
        this.z = j2;
    }

    public final void g(String str) {
        this.a.h().c();
        this.y = (!wr.a(this.x, str)) | this.y;
        this.x = str;
    }

    public final long h() {
        this.a.h().c();
        return this.i;
    }

    public final void h(long j2) {
        this.a.h().c();
        this.y = (this.A != j2) | this.y;
        this.A = j2;
    }

    public final String i() {
        this.a.h().c();
        return this.j;
    }

    public final void i(long j2) {
        this.a.h().c();
        this.y = (this.r != j2) | this.y;
        this.r = j2;
    }

    public final long j() {
        this.a.h().c();
        return this.k;
    }

    public final void j(long j2) {
        this.a.h().c();
        this.y = (this.s != j2) | this.y;
        this.s = j2;
    }

    public final String k() {
        this.a.h().c();
        return this.l;
    }

    public final void k(long j2) {
        this.a.h().c();
        this.y = (this.t != j2) | this.y;
        this.t = j2;
    }

    public final long l() {
        this.a.h().c();
        return this.m;
    }

    public final void l(long j2) {
        this.a.h().c();
        this.y = (this.u != j2) | this.y;
        this.u = j2;
    }

    public final long m() {
        this.a.h().c();
        return this.n;
    }

    public final void m(long j2) {
        this.a.h().c();
        this.y = (this.w != j2) | this.y;
        this.w = j2;
    }

    public final void n(long j2) {
        this.a.h().c();
        this.y = (this.v != j2) | this.y;
        this.v = j2;
    }

    public final boolean n() {
        this.a.h().c();
        return this.o;
    }

    public final long o() {
        this.a.h().c();
        return this.g;
    }

    public final void o(long j2) {
        this.a.h().c();
        this.y = (this.p != j2) | this.y;
        this.p = j2;
    }

    public final long p() {
        this.a.h().c();
        return this.z;
    }

    public final long q() {
        this.a.h().c();
        return this.A;
    }

    public final void r() {
        this.a.h().c();
        long j2 = this.g + 1;
        if (j2 > 2147483647L) {
            this.a.f().A().a("Bundle index overflow. appId", sj.a(this.b));
            j2 = 0;
        }
        this.y = true;
        this.g = j2;
    }

    public final long s() {
        this.a.h().c();
        return this.r;
    }

    public final long t() {
        this.a.h().c();
        return this.s;
    }

    public final long u() {
        this.a.h().c();
        return this.t;
    }

    public final long v() {
        this.a.h().c();
        return this.u;
    }

    public final long w() {
        this.a.h().c();
        return this.w;
    }

    public final long x() {
        this.a.h().c();
        return this.v;
    }

    public final String y() {
        this.a.h().c();
        return this.x;
    }

    public final String z() {
        this.a.h().c();
        String str = this.x;
        g((String) null);
        return str;
    }
}
