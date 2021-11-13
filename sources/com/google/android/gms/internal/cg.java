package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.au;
import org.json.JSONObject;

@bfk
public final class cg implements bj {
    private azi<JSONObject, JSONObject> a;
    private azi<JSONObject, JSONObject> b;

    public cg(Context context) {
        this.a = au.r().a(context, jp.a()).a("google.afma.request.getAdDictionary", azn.a, azn.a);
        this.b = au.r().a(context, jp.a()).a("google.afma.sdkConstants.getSdkConstants", azn.a, azn.a);
    }

    public final azi<JSONObject, JSONObject> a() {
        return this.a;
    }

    public final azi<JSONObject, JSONObject> b() {
        return this.b;
    }
}
