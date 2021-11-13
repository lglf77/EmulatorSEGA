package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.common.util.j;

@bfk
public final class zzwl implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */
    public Activity a;
    /* access modifiers changed from: private */
    public d b;
    private Uri c;

    public final void onDestroy() {
        jn.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        jn.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        jn.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, d dVar, Bundle bundle, a aVar, Bundle bundle2) {
        this.b = dVar;
        if (this.b == null) {
            jn.e("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            jn.e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.b.a(this, 0);
        } else {
            if (!(j.a() && atu.a(context))) {
                jn.e("Default browser does not support custom tabs. Bailing out.");
                this.b.a(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                jn.e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.b.a(this, 0);
                return;
            }
            this.a = (Activity) context;
            this.c = Uri.parse(string);
            this.b.a(this);
        }
    }

    public final void showInterstitial() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setData(this.c);
        gw.a.post(new bbz(this, new AdOverlayInfoParcel(new c(build.intent), (aot) null, new bby(this), (q) null, new jp(0, 0, false))));
        au.i().q();
    }
}
