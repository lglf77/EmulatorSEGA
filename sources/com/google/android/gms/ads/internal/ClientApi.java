package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.aqb;
import com.google.android.gms.internal.aqg;
import com.google.android.gms.internal.aqq;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.aux;
import com.google.android.gms.internal.ava;
import com.google.android.gms.internal.avl;
import com.google.android.gms.internal.avq;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bcr;
import com.google.android.gms.internal.bdb;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ci;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jp;
import java.util.HashMap;

@Keep
@bfk
@DynamiteApi
public class ClientApi extends aqq {
    public aqb createAdLoaderBuilder(a aVar, String str, bar bar, int i) {
        Context context = (Context) c.a(aVar);
        au.e();
        return new k(context, str, bar, new jp(11910000, i, true, gw.m(context)), bq.a(context));
    }

    public bcr createAdOverlay(a aVar) {
        return new d((Activity) c.a(aVar));
    }

    public aqg createBannerAdManager(a aVar, apc apc, String str, bar bar, int i) {
        Context context = (Context) c.a(aVar);
        au.e();
        return new bs(context, apc, str, bar, new jp(11910000, i, true, gw.m(context)), bq.a(context));
    }

    public bdb createInAppPurchaseManager(a aVar) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.app.f().a(com.google.android.gms.internal.asw.aF)).booleanValue() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0049, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.app.f().a(com.google.android.gms.internal.asw.aG)).booleanValue() != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.aqg createInterstitialAdManager(com.google.android.gms.a.a r14, com.google.android.gms.internal.apc r15, java.lang.String r16, com.google.android.gms.internal.bar r17, int r18) {
        /*
            r13 = this;
            java.lang.Object r2 = com.google.android.gms.a.c.a((com.google.android.gms.a.a) r14)
            android.content.Context r2 = (android.content.Context) r2
            com.google.android.gms.internal.asw.a(r2)
            com.google.android.gms.internal.jp r5 = new com.google.android.gms.internal.jp
            r1 = 11910000(0xb5bb70, float:1.6689465E-38)
            r3 = 1
            com.google.android.gms.ads.internal.au.e()
            boolean r4 = com.google.android.gms.internal.gw.m(r2)
            r0 = r18
            r5.<init>(r1, r0, r3, r4)
            java.lang.String r1 = "reward_mb"
            java.lang.String r3 = r15.a
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0037
            com.google.android.gms.internal.asl<java.lang.Boolean> r1 = com.google.android.gms.internal.asw.aF
            com.google.android.gms.internal.asu r4 = com.google.android.gms.internal.app.f()
            java.lang.Object r1 = r4.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x004b
        L_0x0037:
            if (r3 == 0) goto L_0x005c
            com.google.android.gms.internal.asl<java.lang.Boolean> r1 = com.google.android.gms.internal.asw.aG
            com.google.android.gms.internal.asu r3 = com.google.android.gms.internal.app.f()
            java.lang.Object r1 = r3.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005c
        L_0x004b:
            r1 = 1
        L_0x004c:
            if (r1 == 0) goto L_0x005e
            com.google.android.gms.internal.aze r1 = new com.google.android.gms.internal.aze
            com.google.android.gms.ads.internal.bq r6 = com.google.android.gms.ads.internal.bq.a(r2)
            r3 = r16
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x005b:
            return r1
        L_0x005c:
            r1 = 0
            goto L_0x004c
        L_0x005e:
            com.google.android.gms.ads.internal.l r6 = new com.google.android.gms.ads.internal.l
            com.google.android.gms.ads.internal.bq r12 = com.google.android.gms.ads.internal.bq.a(r2)
            r7 = r2
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1 = r6
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.a.a, com.google.android.gms.internal.apc, java.lang.String, com.google.android.gms.internal.bar, int):com.google.android.gms.internal.aqg");
    }

    public avl createNativeAdViewDelegate(a aVar, a aVar2) {
        return new aux((FrameLayout) c.a(aVar), (FrameLayout) c.a(aVar2));
    }

    public avq createNativeAdViewHolderDelegate(a aVar, a aVar2, a aVar3) {
        return new ava((View) c.a(aVar), (HashMap) c.a(aVar2), (HashMap) c.a(aVar3));
    }

    public cp createRewardedVideoAd(a aVar, bar bar, int i) {
        Context context = (Context) c.a(aVar);
        au.e();
        return new ci(context, bq.a(context), bar, new jp(11910000, i, true, gw.m(context)));
    }

    public aqg createSearchAdManager(a aVar, apc apc, String str, int i) {
        Context context = (Context) c.a(aVar);
        au.e();
        return new ao(context, apc, str, new jp(11910000, i, true, gw.m(context)));
    }

    public aqv getMobileAdsSettingsManager(a aVar) {
        return null;
    }

    public aqv getMobileAdsSettingsManagerWithClientJarVersion(a aVar, int i) {
        Context context = (Context) c.a(aVar);
        au.e();
        return x.a(context, new jp(11910000, i, true, gw.m(context)));
    }
}
