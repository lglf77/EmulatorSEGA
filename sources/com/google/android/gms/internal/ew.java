package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import org.json.JSONObject;

@bfk
public final class ew {
    public final v a;
    public final z b;
    public final bac c;
    public final apc d;
    public final int e;
    public final long f;
    public final long g;
    public final JSONObject h;
    public final aog i;
    public final boolean j;

    public ew(v vVar, z zVar, bac bac, apc apc, int i2, long j2, long j3, JSONObject jSONObject, aog aog, Boolean bool) {
        this.a = vVar;
        this.b = zVar;
        this.c = bac;
        this.d = apc;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = jSONObject;
        this.i = aog;
        if (bool != null) {
            this.j = bool.booleanValue();
            return;
        }
        au.e();
        if (gw.a(vVar.c)) {
            this.j = true;
        } else {
            this.j = false;
        }
    }

    public ew(v vVar, z zVar, bac bac, apc apc, int i2, long j2, long j3, JSONObject jSONObject, aol aol) {
        this.a = vVar;
        this.b = zVar;
        this.c = null;
        this.d = null;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = null;
        this.i = new aog(aol, ((Boolean) app.f().a(asw.cJ)).booleanValue());
        this.j = false;
    }
}
