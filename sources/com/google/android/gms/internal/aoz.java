package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class aoz {
    private long a;
    private Bundle b;
    private int c;
    private List<String> d;
    private boolean e;
    private int f;
    private boolean g;
    private String h;
    private asb i;
    private Location j;
    private String k;
    private Bundle l;
    private Bundle m;
    private List<String> n;
    private String o;
    private String p;
    private boolean q;

    public aoz() {
        this.a = -1;
        this.b = new Bundle();
        this.c = -1;
        this.d = new ArrayList();
        this.e = false;
        this.f = -1;
        this.g = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = new Bundle();
        this.m = new Bundle();
        this.n = new ArrayList();
        this.o = null;
        this.p = null;
        this.q = false;
    }

    public aoz(aoy aoy) {
        this.a = aoy.b;
        this.b = aoy.c;
        this.c = aoy.d;
        this.d = aoy.e;
        this.e = aoy.f;
        this.f = aoy.g;
        this.g = aoy.h;
        this.h = aoy.i;
        this.i = aoy.j;
        this.j = aoy.k;
        this.k = aoy.l;
        this.l = aoy.m;
        this.m = aoy.n;
        this.n = aoy.o;
        this.o = aoy.p;
        this.p = aoy.q;
    }

    public final aoy a() {
        return new aoy(7, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, false);
    }

    public final aoz a(Location location) {
        this.j = null;
        return this;
    }
}
