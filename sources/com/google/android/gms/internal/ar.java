package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.gmsg.af;
import com.google.android.gms.ads.internal.js.b;
import com.google.android.gms.ads.internal.js.o;
import com.google.android.gms.ads.internal.js.z;
import com.google.android.gms.common.c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class ar extends fj {
    private static long a = TimeUnit.SECONDS.toMillis(10);
    private static final Object b = new Object();
    private static boolean c = false;
    /* access modifiers changed from: private */
    public static z d = null;
    private static HttpClient e = null;
    /* access modifiers changed from: private */
    public static af f = null;
    private static aa<Object> g = null;
    /* access modifiers changed from: private */
    public final bfm h;
    private final w i;
    private final Object j = new Object();
    private final Context k;
    /* access modifiers changed from: private */
    public b l;
    private aol m;

    public ar(Context context, w wVar, bfm bfm, aol aol) {
        super(true);
        this.h = bfm;
        this.k = context;
        this.i = wVar;
        this.m = aol;
        synchronized (b) {
            if (!c) {
                f = new af();
                e = new HttpClient(context.getApplicationContext(), wVar.j);
                g = new az();
                d = new z(this.k.getApplicationContext(), this.i.j, (String) app.f().a(asw.a), new ay(), new ax());
                c = true;
            }
        }
    }

    private final z a(v vVar) {
        au.e();
        String a2 = gw.a();
        JSONObject a3 = a(vVar, a2);
        if (a3 == null) {
            return new z(0);
        }
        long b2 = au.k().b();
        Future<JSONObject> a4 = f.a(a2);
        jc.a.post(new at(this, a3, a2));
        try {
            JSONObject jSONObject = a4.get(a - (au.k().b() - b2), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new z(-1);
            }
            z a5 = bk.a(this.k, vVar, jSONObject.toString());
            return (a5.d == -3 || !TextUtils.isEmpty(a5.b)) ? a5 : new z(3);
        } catch (InterruptedException | CancellationException e2) {
            return new z(-1);
        } catch (TimeoutException e3) {
            return new z(2);
        } catch (ExecutionException e4) {
            return new z(0);
        }
    }

    private final JSONObject a(v vVar, String str) {
        bs bsVar;
        a.C0015a aVar;
        Bundle bundle = vVar.c.c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            bsVar = au.o().a(this.k).get();
        } catch (Exception e2) {
            fn.c("Error grabbing device info: ", e2);
            bsVar = null;
        }
        Context context = this.k;
        bc bcVar = new bc();
        bcVar.i = vVar;
        bcVar.j = bsVar;
        JSONObject a2 = bk.a(context, bcVar);
        if (a2 == null) {
            return null;
        }
        try {
            aVar = a.a(this.k);
        } catch (com.google.android.gms.common.b | c | IOException | IllegalStateException e3) {
            fn.c("Cannot get advertising id info", e3);
            aVar = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a2);
        hashMap.put("data", bundle);
        if (aVar != null) {
            hashMap.put("adid", aVar.a());
            hashMap.put("lat", Integer.valueOf(aVar.b() ? 1 : 0));
        }
        try {
            return au.e().a((Map<String, ?>) hashMap);
        } catch (JSONException e4) {
            return null;
        }
    }

    protected static void a(o oVar) {
        oVar.a("/loadAd", f);
        oVar.a("/fetchHttpRequest", e);
        oVar.a("/invalidRequest", g);
    }

    protected static void b(o oVar) {
        oVar.b("/loadAd", f);
        oVar.b("/fetchHttpRequest", e);
        oVar.b("/invalidRequest", g);
    }

    public final void a() {
        fn.b("SdkLessAdLoaderBackgroundTask started.");
        String i2 = au.z().i(this.k);
        v vVar = new v(this.i, -1, au.z().g(this.k), au.z().h(this.k), i2);
        au.z().f(this.k, i2);
        z a2 = a(vVar);
        v vVar2 = vVar;
        jc.a.post(new as(this, new ew(vVar2, a2, (bac) null, (apc) null, a2.d, au.k().b(), a2.m, (JSONObject) null, this.m)));
    }

    public final void b() {
        synchronized (this.j) {
            jc.a.post(new aw(this));
        }
    }
}
