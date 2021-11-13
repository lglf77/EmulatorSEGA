package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ac;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.br;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.gmsg.ae;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.js.JavascriptEngineFactory;
import com.google.android.gms.ads.internal.js.z;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@bfk
public final class beu extends bdy<beu> {
    private static final long c = TimeUnit.SECONDS.toMillis(60);
    private static final Object d = new Object();
    private static boolean e = false;
    private static z f = null;
    private JavascriptEngineFactory a;
    private kh<mw> b;
    private final ag g;
    private final aun h;
    private final Context i;
    private final jp j;
    private final ac k;
    private final xr l;
    private final Object m = new Object();
    private String n;

    public beu(Context context, ac acVar, String str, xr xrVar, jp jpVar) {
        fn.d("Webview loading for native ads.");
        this.i = context;
        this.k = acVar;
        this.l = xrVar;
        this.j = jpVar;
        this.n = str;
        this.a = new JavascriptEngineFactory();
        au.f();
        kh<mw> a2 = ng.a(this.i, this.j, (String) app.f().a(asw.bK), this.l, this.k.h());
        this.g = new ag(this.i);
        this.h = new aun(acVar, str);
        this.b = jx.a(a2, new bev(this), kn.b);
        jv.a(this.b, "WebViewNativeAdsUtil.constructor");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ kh a(mw mwVar) {
        fn.d("Javascript has loaded for native ads.");
        mwVar.w().a(this.k, this.k, this.k, this.k, false, (ae) null, new br(this.i, (ei) null, (ab) null), (bcp) null, (ei) null);
        mwVar.w().a("/logScionEvent", (aa<? super mw>) this.g);
        mwVar.w().a("/logScionEvent", (aa<? super mw>) this.h);
        return jx.a(mwVar);
    }

    public final kh<JSONObject> a(JSONObject jSONObject) {
        return jx.a(this.b, new bew(this, jSONObject), kn.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ kh a(JSONObject jSONObject, mw mwVar) {
        jSONObject.put("ads_id", this.n);
        mwVar.b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return jx.a(new JSONObject());
    }

    public final void a() {
        jx.a(this.b, new bfd(this), kn.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(mw mwVar, bdz bdz, ks ksVar, mw mwVar2, Map map) {
        JSONObject jSONObject;
        boolean z;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str2)) {
                z = false;
                jSONObject = new JSONObject(str2);
            } else {
                jSONObject = new JSONObject(str);
                z = true;
            }
            if (this.n.equals(jSONObject.optString("ads_id", ""))) {
                mwVar.b("/nativeAdPreProcess", (aa<? super mw>) bdz.a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                ksVar.b(jSONObject2);
            }
        } catch (Throwable th) {
            fn.b("Error while preprocessing json.", th);
            ksVar.a(th);
        }
    }

    public final void a(String str, aa aaVar) {
        jx.a(this.b, new bfa(this, str, aaVar), kn.a);
    }

    public final void a(String str, JSONObject jSONObject) {
        jx.a(this.b, new bfc(this, str, jSONObject), kn.a);
    }

    public final kh<JSONObject> b(JSONObject jSONObject) {
        return jx.a(this.b, new bex(this, jSONObject), kn.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ kh b(JSONObject jSONObject, mw mwVar) {
        jSONObject.put("ads_id", this.n);
        mwVar.b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return jx.a(new JSONObject());
    }

    public final void b(String str, aa aaVar) {
        jx.a(this.b, new bfb(this, str, aaVar), kn.a);
    }

    public final kh<JSONObject> c(JSONObject jSONObject) {
        return jx.a(this.b, new bey(this, jSONObject), kn.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ kh c(JSONObject jSONObject, mw mwVar) {
        jSONObject.put("ads_id", this.n);
        ks ksVar = new ks();
        bdz bdz = new bdz();
        bez bez = new bez(this, mwVar, bdz, ksVar);
        bdz.a = bez;
        mwVar.a("/nativeAdPreProcess", (aa<? super mw>) bez);
        mwVar.b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return ksVar;
    }
}
