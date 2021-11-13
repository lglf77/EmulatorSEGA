package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.auk;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.w;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

final class ae implements Callable<auk> {
    private /* synthetic */ int a;
    private /* synthetic */ JSONArray b;
    private /* synthetic */ int c;
    private /* synthetic */ ew d;
    private /* synthetic */ ac e;

    ae(ac acVar, int i, JSONArray jSONArray, int i2, ew ewVar) {
        this.e = acVar;
        this.a = i;
        this.b = jSONArray;
        this.c = i2;
        this.d = ewVar;
    }

    public final /* synthetic */ Object call() {
        if (this.a >= this.b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.b.get(this.a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        ac acVar = new ac(this.e.e.c, this.e.h, this.e.e.i, this.e.e.b, this.e.i, this.e.e.e, true);
        ac.a(this.e.e, acVar.e);
        acVar.E();
        acVar.a(this.e.b);
        atj atj = acVar.a;
        int i = this.a;
        atj.a("num_ads_requested", String.valueOf(this.c));
        atj.a("ad_index", String.valueOf(i));
        v vVar = this.d.a;
        String jSONObject2 = jSONObject.toString();
        Bundle bundle = vVar.c.c != null ? new Bundle(vVar.c.c) : new Bundle();
        bundle.putString("_ad", jSONObject2);
        acVar.a(new w(vVar.b, new aoy(vVar.c.a, vVar.c.b, bundle, vVar.c.d, vVar.c.e, vVar.c.f, vVar.c.g, vVar.c.h, vVar.c.i, vVar.c.j, vVar.c.k, vVar.c.l, vVar.c.m, vVar.c.n, vVar.c.o, vVar.c.p, vVar.c.q, vVar.c.r), vVar.d, vVar.e, vVar.f, vVar.g, vVar.i, vVar.j, vVar.k, vVar.l, vVar.n, vVar.z, vVar.o, vVar.p, vVar.q, vVar.r, vVar.s, vVar.t, vVar.u, vVar.v, vVar.w, vVar.x, vVar.y, vVar.B, vVar.C, vVar.I, vVar.D, vVar.E, vVar.F, vVar.G, jx.a(vVar.H), vVar.J, vVar.K, vVar.L, vVar.M, vVar.N, vVar.O, vVar.P, vVar.Q, vVar.U, jx.a(vVar.h), vVar.V, vVar.W, vVar.X, 1, vVar.Z, vVar.aa, vVar.ab), acVar.a);
        return acVar.G().get();
    }
}
