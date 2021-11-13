package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.mediation.h;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class bbp extends bbi {
    private final h a;

    public bbp(h hVar) {
        this.a = hVar;
    }

    public final String a() {
        return this.a.i();
    }

    public final void a(a aVar) {
        this.a.c((View) c.a(aVar));
    }

    public final List b() {
        List<c.b> j = this.a.j();
        if (j == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c.b next : j) {
            arrayList.add(new aty(next.a(), next.b(), next.c()));
        }
        return arrayList;
    }

    public final void b(a aVar) {
        this.a.a((View) com.google.android.gms.a.c.a(aVar));
    }

    public final String c() {
        return this.a.k();
    }

    public final void c(a aVar) {
        this.a.b((View) com.google.android.gms.a.c.a(aVar));
    }

    public final avh d() {
        c.b l = this.a.l();
        if (l != null) {
            return new aty(l.a(), l.b(), l.c());
        }
        return null;
    }

    public final String e() {
        return this.a.m();
    }

    public final String f() {
        return this.a.n();
    }

    public final void g() {
        this.a.e();
    }

    public final boolean h() {
        return this.a.a();
    }

    public final boolean i() {
        return this.a.b();
    }

    public final Bundle j() {
        return this.a.c();
    }

    public final a k() {
        View d = this.a.d();
        if (d == null) {
            return null;
        }
        return com.google.android.gms.a.c.a(d);
    }

    public final ara l() {
        if (this.a.g() != null) {
            return this.a.g().a();
        }
        return null;
    }

    public final avd m() {
        return null;
    }

    public final a n() {
        View f = this.a.f();
        if (f == null) {
            return null;
        }
        return com.google.android.gms.a.c.a(f);
    }

    public final a o() {
        return null;
    }
}
